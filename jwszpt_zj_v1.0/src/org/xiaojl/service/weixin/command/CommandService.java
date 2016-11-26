package org.xiaojl.service.weixin.command;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import org.xiaojl.dao.DaoSupport;
import org.xiaojl.entity.Page;
import org.xiaojl.util.PageData;


@Service("commandService")
public class CommandService {

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/*
	* 新增
	*/
	public void save(PageData pd)throws Exception{
		dao.save("CommandMapper.save", pd);
	}
	
	/*
	* 删除
	*/
	public void delete(PageData pd)throws Exception{
		dao.delete("CommandMapper.delete", pd);
	}
	
	/*
	* 修改
	*/
	public void edit(PageData pd)throws Exception{
		dao.update("CommandMapper.edit", pd);
	}
	
	/*
	*列表
	*/
	public List<PageData> list(Page page)throws Exception{
		return (List<PageData>)dao.findForList("CommandMapper.datalistPage", page);
	}
	
	/*
	*列表(全部)
	*/
	public List<PageData> listAll(PageData pd)throws Exception{
		return (List<PageData>)dao.findForList("CommandMapper.listAll", pd);
	}
	
	/*
	* 通过id获取数据
	*/
	public PageData findById(PageData pd)throws Exception{
		return (PageData)dao.findForObject("CommandMapper.findById", pd);
	}
	
	/*
	* 批量删除
	*/
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception{
		dao.delete("CommandMapper.deleteAll", ArrayDATA_IDS);
	}
	
	/*
	* 匹配关键词
	*/
	public PageData findByKw(PageData pd)throws Exception{
		return (PageData)dao.findForObject("CommandMapper.findByKw", pd);
	}
}

