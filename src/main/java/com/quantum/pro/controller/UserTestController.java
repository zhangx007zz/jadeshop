package com.quantum.pro.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quantum.pro.model.UserTestDto;
import com.quantum.pro.service.user.UserTestService;

@RestController
@RequestMapping("/test")
public class UserTestController {
	private final static Logger logger = LoggerFactory.getLogger(UserTestController.class);

    @Autowired
    private UserTestService userTestService;

    @RequestMapping("/getUsers")
	public List<UserTestDto> getUsers() {    	
    	return userTestService.selectUser();
	} 
    
    @RequestMapping("/insertUser")
    public boolean insertUser(UserTestDto dto) {
    	return userTestService.insertUser(dto);
    }  
    
    @RequestMapping("/delUser")
    public boolean delUser(String id) {    	
		return userTestService.delUser(id);
	}

    @RequestMapping("/selectAUser")
	public List<UserTestDto> selectAUser() {
		return userTestService.selectAUser();
	}

    @RequestMapping("/insertAUser")
	public int insertAUser(UserTestDto dto) {
		return userTestService.insertAUser(dto);
	}

    @RequestMapping("/updateAUser")
	public int updateAUser(UserTestDto dto) {
		return userTestService.updateAUser(dto);
	}

    @RequestMapping("/delAUser")
	public int delAUser(String id) {
		return userTestService.delAUser(id);
	}
    
}
