package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class Statics {

    @ObfuscatedName("aw.gy")
    public static String field101;

    @ObfuscatedName("dm.au")
    public static String[] field1017;

    @ObfuscatedName("dm.cm")
    public static int field1027;

    @ObfuscatedName("dr.fp")
    public static class384 field1039;

    @ObfuscatedName("do.aj")
    public static short[][][] field1049;

    @ObfuscatedName("do.ao")
    public static int[] field1050;

    @ObfuscatedName("do.av")
    public static int[] field1051;

    @ObfuscatedName("ad.fm")
    public static class384 field106;

    @ObfuscatedName("do.fj")
    public static class69 field1061;

    @ObfuscatedName("dw.an")
    public static String field1106;

    @ObfuscatedName("du.ah")
    public static class559 field1124;

    @ObfuscatedName("an.bi")
    public static Font field114;

    @ObfuscatedName("an.gj")
    public static int field115;

    @ObfuscatedName("am.ao")
    public static class118 field120;

    @ObfuscatedName("am.hx")
    public static SecureRandom field121;

    @ObfuscatedName("dh.kr")
    public static int field1255;

    @ObfuscatedName("dy.td")
    public static class560 field1288;

    @ObfuscatedName("ag.an")
    public static int field133;

    @ObfuscatedName("dp.tx")
    public static class58 field1354;

    @ObfuscatedName("dp.fb")
    public static class384 field1358;

    @ObfuscatedName("ei.fe")
    public static class384 field1378;

    @ObfuscatedName("en.en")
    public static boolean field1379;

    @ObfuscatedName("eh.sa")
    public static class466 field1404;

    @ObfuscatedName("es.cp")
    public static class374 field1432;

    @ObfuscatedName("ef.uo")
    public static int field1451;

    @ObfuscatedName("ef.fk")
    public static class384 field1453;

    @ObfuscatedName("ef.ke")
    public static class560[] field1456;

    @ObfuscatedName("ef.od")
    public static int field1457;

    @ObfuscatedName("ep.gm")
    public static int field1483;

    @ObfuscatedName("ep.ad")
    public static class304 field1485;

    @ObfuscatedName("ea.ab")
    public static int[] field1489;

    @ObfuscatedName("ea.kn")
    public static class559[] field1492;

    @ObfuscatedName("ey.jr")
    public static int[] field1496;

    @ObfuscatedName("ey.af")
    public static String[] field1497;

    @ObfuscatedName("ey.kq")
    public static int field1498;

    @ObfuscatedName("ew.us")
    public static int field1503;

    @ObfuscatedName("ew.wd")
    public static int field1504;

    @ObfuscatedName("ew.ug")
    public static int field1506;

    @ObfuscatedName("ec.af")
    public static int field1509;

    @ObfuscatedName("eg.gn")
    public static int field1521;

    @ObfuscatedName("eq.at")
    public static int field1530;

    @ObfuscatedName("bt.jy")
    public static class102 field156;

    @ObfuscatedName("fh.mx")
    public static int field1563;

    @ObfuscatedName("bt.km")
    public static class559[] field157;

    @ObfuscatedName("fk.ah")
    public static int[] field1573;

    @ObfuscatedName("bt.aj")
    public static class387 field159;

    @ObfuscatedName("fm.fx")
    public static class384 field1603;

    @ObfuscatedName("fr.et")
    public static long field1613;

    @ObfuscatedName("fz.jm")
    public static byte[][] field1637;

    @ObfuscatedName("fz.eo")
    public static class384 field1638;

    @ObfuscatedName("fe.tt")
    public static class43 field1642;

    @ObfuscatedName("fc.fr")
    public static class384 field1644;

    @ObfuscatedName("fa.ji")
    public static byte[][] field1647;

    @ObfuscatedName("fo.at")
    public static int field1650;

    @ObfuscatedName("fo.fv")
    public static class384 field1657;

    @ObfuscatedName("bn.ul")
    public static int field167;

    @ObfuscatedName("fp.aj")
    public static class387 field1683;

    @ObfuscatedName("fl.jt")
    public static int[] field1697;

    @ObfuscatedName("fj.ba")
    public static String field1702;

    @ObfuscatedName("fj.dd")
    public static class559[] field1703;

    @ObfuscatedName("fd.ac")
    public static int[] field1723;

    @ObfuscatedName("fi.ai")
    public static String field1745;

    @ObfuscatedName("fw.at")
    public static boolean[] field1749;

    @ObfuscatedName("gf.ny")
    public static int field1751;

    @ObfuscatedName("gf.al")
    public static class387 field1753;

    @ObfuscatedName("gt.wv")
    public static int field1754;

    @ObfuscatedName("gt.ac")
    public static int field1758;

    @ObfuscatedName("gt.id")
    public static int[] field1759;

    @ObfuscatedName("bl.li")
    public static int field179;

    @ObfuscatedName("gj.ve")
    public static class389 field1797;

    @ObfuscatedName("at.wm")
    public static class514 field18;

    @ObfuscatedName("gy.er")
    public static class185 field1806;

    @ObfuscatedName("ga.cr")
    public static int field1814;

    @ObfuscatedName("ga.ay")
    public static String[] field1816;

    @ObfuscatedName("bl.vy")
    public static class71 field182;

    @ObfuscatedName("gg.dw")
    public static class559 field1820;

    @ObfuscatedName("gg.ah")
    public static int field1822;

    @ObfuscatedName("gb.kv")
    public static int field1848;

    @ObfuscatedName("gh.bj")
    public static GarbageCollectorMXBean field1865;

    @ObfuscatedName("gz.al")
    public static String field1872;

    @ObfuscatedName("gz.ak")
    public static String field1880;

    @ObfuscatedName("gd.fy")
    public static class384 field1885;

    @ObfuscatedName("gw.az")
    public static File field1890;

    @ObfuscatedName("gw.aa")
    public static boolean field1894;

    @ObfuscatedName("gw.ax")
    public static int field1896;

    @ObfuscatedName("be.ai")
    public static int field190;

    @ObfuscatedName("hm.qd")
    public static int field1909;

    @ObfuscatedName("ht.ci")
    public static class402 field1965;

    @ObfuscatedName("ht.bb")
    public static client field1971;

    @ObfuscatedName("hh.mz")
    public static class260 field1973;

    @ObfuscatedName("ha.ac")
    public static byte[][] field1976;

    @ObfuscatedName("hq.ac")
    public static class560 field1985;

    @ObfuscatedName("hq.ak")
    public static class387 field1987;

    @ObfuscatedName("hy.aj")
    public static int field1993;

    @ObfuscatedName("hx.ac")
    public static int[] field1998;

    @ObfuscatedName("hw.al")
    public static int field2004;

    @ObfuscatedName("hw.ak")
    public static class387 field2009;

    @ObfuscatedName("hd.qf")
    public static class358[] field2011;

    @ObfuscatedName("hd.al")
    public static short[][][] field2012;

    @ObfuscatedName("hr.al")
    public static class199[] field2016;

    @ObfuscatedName("hr.ak")
    public static class387 field2024;

    @ObfuscatedName("hk.wy")
    public static long field2039;

    @ObfuscatedName("hk.ak")
    public static class387 field2042;

    @ObfuscatedName("ho.ak")
    public static class387 field2044;

    @ObfuscatedName("ho.sp")
    public static class159 field2052;

    @ObfuscatedName("hl.ak")
    public static class387 field2064;

    @ObfuscatedName("hl.al")
    public static class387 field2065;

    @ObfuscatedName("hf.ak")
    public static class387 field2074;

    @ObfuscatedName("hf.aa")
    public static byte[][][] field2075;

    @ObfuscatedName("hf.aw")
    public static byte[][][] field2078;

    @ObfuscatedName("hz.ak")
    public static class387 field2087;

    @ObfuscatedName("hp.ae")
    public static class559 field2099;

    @ObfuscatedName("hp.kw")
    public static int field2100;

    @ObfuscatedName("iq.al")
    public static class387 field2116;

    @ObfuscatedName("ib.ou")
    public static class358 field2163;

    @ObfuscatedName("be.ak")
    public static class177 field217;

    @ObfuscatedName("ig.ab")
    public static ScheduledExecutorService field2188;

    @ObfuscatedName("ab.af")
    public static File field22;

    @ObfuscatedName("ip.al")
    public static class387 field2208;

    @ObfuscatedName("ia.ak")
    public static class387 field2211;

    @ObfuscatedName("ia.df")
    public static class559 field2216;

    @ObfuscatedName("it.ak")
    public static class387 field2227;

    @ObfuscatedName("it.aq")
    public static class431 field2228;

    @ObfuscatedName("ii.ab")
    public static int[] field2240;

    @ObfuscatedName("iz.ab")
    public static class559 field2241;

    @ObfuscatedName("iz.ak")
    public static class387 field2245;

    @ObfuscatedName("ij.aj")
    public static class387 field2247;

    @ObfuscatedName("ij.ak")
    public static class387 field2256;

    @ObfuscatedName("in.al")
    public static class387 field2277;

    @ObfuscatedName("bg.ox")
    public static class358 field231;

    @ObfuscatedName("ix.at")
    public static class387 field2332;

    @ObfuscatedName("ix.aa")
    public static class387 field2388;

    @ObfuscatedName("iv.ak")
    public static class387 field2390;

    @ObfuscatedName("iv.cn")
    public static class373 field2401;

    @ObfuscatedName("ic.aa")
    public static class387 field2405;

    @ObfuscatedName("ic.af")
    public static class387 field2409;

    @ObfuscatedName("ic.at")
    public static class387 field2413;

    @ObfuscatedName("bg.qn")
    public static class486 field243;

    @ObfuscatedName("ic.kb")
    public static class560[] field2435;

    @ObfuscatedName("ir.ap")
    public static short[][] field2492;

    @ObfuscatedName("im.gx")
    public static String field2503;

    @ObfuscatedName("ji.cd")
    public static class524 field2521;

    @ObfuscatedName("jv.kd")
    public static class560[] field2535;

    @ObfuscatedName("jr.sh")
    public static boolean field2540;

    @ObfuscatedName("jt.ay")
    public static class100 field2546;

    @ObfuscatedName("jw.ae")
    public static int[] field2626;

    @ObfuscatedName("jz.qj")
    public static class529 field2640;

    @ObfuscatedName("jz.un")
    public static int field2642;

    @ObfuscatedName("jz.ph")
    public static int field2664;

    @ObfuscatedName("jn.cc")
    public static String field2698;

    @ObfuscatedName("jk.az")
    public static byte[][][] field2790;

    @ObfuscatedName("jk.ac")
    public static int field2793;

    @ObfuscatedName("bd.ab")
    public static ThreadPoolExecutor field280;

    @ObfuscatedName("jj.lb")
    public static int field2831;

    @ObfuscatedName("kl.eq")
    public static class384 field2840;

    @ObfuscatedName("kb.cb")
    public static int field2904;

    @ObfuscatedName("kb.ci")
    public static int field2927;

    @ObfuscatedName("kb.cc")
    public static int field2928;

    @ObfuscatedName("kn.ab")
    public static int field2945;

    @ObfuscatedName("kn.af")
    public static int field2948;

    @ObfuscatedName("bd.ah")
    public static short[] field295;

    @ObfuscatedName("kn.ao")
    public static int field2951;

    @ObfuscatedName("kn.ah")
    public static int field2952;

    @ObfuscatedName("kn.av")
    public static int field2953;

    @ObfuscatedName("kn.aq")
    public static int field2954;

    @ObfuscatedName("bd.mw")
    public static int field297;

    @ObfuscatedName("kg.ez")
    public static class384 field2971;

    @ObfuscatedName("ka.aa")
    public static int field2995;

    @ObfuscatedName("kf.uy")
    public static int field3032;

    @ObfuscatedName("kf.fh")
    public static class384 field3033;

    @ObfuscatedName("kr.oz")
    public static class76 field3048;

    @ObfuscatedName("kr.gc")
    public static int field3050;

    @ObfuscatedName("kr.nt")
    public static int field3051;

    @ObfuscatedName("ky.il")
    public static class431 field3069;

    @ObfuscatedName("ks.ek")
    public static class384 field3094;

    @ObfuscatedName("ks.ix")
    public static int field3101;

    @ObfuscatedName("ki.fs")
    public static class484 field3113;

    @ObfuscatedName("ki.ii")
    public static class431 field3119;

    @ObfuscatedName("bm.we")
    public static short[] field313;

    @ObfuscatedName("kh.uf")
    public static int field3134;

    @ObfuscatedName("kx.su")
    public static boolean field3138;

    @ObfuscatedName("kx.cu")
    public static String field3141;

    @ObfuscatedName("lc.af")
    public static int field3145;

    @ObfuscatedName("lc.bf")
    public static FontMetrics field3146;

    @ObfuscatedName("lu.bp")
    public static class557 field3196;

    @ObfuscatedName("bq.rr")
    public static class180 field320;

    @ObfuscatedName("lh.wn")
    public static List field3204;

    @ObfuscatedName("lh.au")
    public static int field3205;

    @ObfuscatedName("lg.gt")
    public static int field3208;

    @ObfuscatedName("lg.wa")
    public static Iterator field3211;

    @ObfuscatedName("lv.qy")
    public static class113 field3238;

    @ObfuscatedName("lv.ab")
    public static boolean field3240;

    @ObfuscatedName("mq.ui")
    public static int field3270;

    @ObfuscatedName("bc.au")
    public static int[] field329;

    @ObfuscatedName("ao.wj")
    public static class388 field33;

    @ObfuscatedName("bc.uu")
    public static int field333;

    @ObfuscatedName("bc.jq")
    public static int[] field334;

    @ObfuscatedName("bc.do")
    public static class560[] field335;

    @ObfuscatedName("mc.ft")
    public static class384 field3375;

    @ObfuscatedName("md.gs")
    public static int field3391;

    @ObfuscatedName("md.ip")
    public static class116 field3400;

    @ObfuscatedName("mp.ja")
    public static int field3545;

    @ObfuscatedName("me.eg")
    public static class384 field3553;

    @ObfuscatedName("mo.ak")
    public static long field3554;

    @ObfuscatedName("mk.gq")
    public static String field3559;

    @ObfuscatedName("mg.al")
    public static File field3562;

    @ObfuscatedName("mg.fa")
    public static class384 field3565;

    @ObfuscatedName("mt.al")
    public static class387 field3587;

    @ObfuscatedName("ma.wl")
    public static class482 field3636;

    @ObfuscatedName("ma.al")
    public static class387 field3637;

    @ObfuscatedName("ma.fc")
    public static class384 field3639;

    @ObfuscatedName("my.ax")
    public static class159 field3643;

    @ObfuscatedName("my.fz")
    public static class384 field3644;

    @ObfuscatedName("ml.hc")
    public static long field3660;

    @ObfuscatedName("nr.dz")
    public static class559 field3701;

    @ObfuscatedName("nw.ac")
    public static int field3706;

    @ObfuscatedName("nw.jb")
    public static byte[][] field3707;

    @ObfuscatedName("nm.up")
    public static int field3708;

    @ObfuscatedName("ck.fo")
    public static class384 field371;

    @ObfuscatedName("nm.ax")
    public static class559 field3711;

    @ObfuscatedName("ck.ew")
    public static class478 field373;

    @ObfuscatedName("nz.aa")
    public static int field3736;

    @ObfuscatedName("nz.ty")
    public static class39 field3737;

    @ObfuscatedName("nu.uw")
    public static int field3739;

    @ObfuscatedName("nu.vv")
    public static class506 field3741;

    @ObfuscatedName("nv.aj")
    public static int field3744;

    @ObfuscatedName("nt.kf")
    public static int field3770;

    @ObfuscatedName("cn.av")
    public static class47[] field380;

    @ObfuscatedName("cn.ab")
    public static int field382;

    @ObfuscatedName("cn.ao")
    public static class53[] field384;

    @ObfuscatedName("cn.ah")
    public static class42[] field385;

    @ObfuscatedName("cn.am")
    public static float[] field386;

    @ObfuscatedName("cn.aq")
    public static class51[] field387;

    @ObfuscatedName("cn.ap")
    public static boolean[] field388;

    @ObfuscatedName("cn.ae")
    public static int[] field389;

    @ObfuscatedName("cn.bo")
    public static int[] field390;

    @ObfuscatedName("cn.ai")
    public static float[] field396;

    @ObfuscatedName("nf.jd")
    public static class102 field3967;

    @ObfuscatedName("nd.ue")
    public static int field3968;

    @ObfuscatedName("cn.an")
    public static float[] field397;

    @ObfuscatedName("na.ak")
    public static class360 field3974;

    @ObfuscatedName("nx.af")
    public static byte[][][] field3976;

    @ObfuscatedName("nx.da")
    public static boolean field3977;

    @ObfuscatedName("ni.bb")
    public static class419 field3983;

    @ObfuscatedName("cn.ar")
    public static float[] field399;

    @ObfuscatedName("af.iz")
    public static int field4;

    @ObfuscatedName("ao.jj")
    public static class560[] field40;

    @ObfuscatedName("cn.ag")
    public static float[] field400;

    @ObfuscatedName("cn.bs")
    public static float[] field401;

    @ObfuscatedName("op.da")
    public static class559[] field4019;

    @ObfuscatedName("cn.bf")
    public static int[] field402;

    @ObfuscatedName("oh.kl")
    public static class560[] field4037;

    @ObfuscatedName("cn.ac")
    public static int field405;

    @ObfuscatedName("oz.ia")
    public static class515 field4064;

    @ObfuscatedName("ou.gp")
    public static String field4076;

    @ObfuscatedName("ou.gi")
    public static String field4077;

    @ObfuscatedName("cd.wf")
    public static class398 field414;

    @ObfuscatedName("cs.ab")
    public static float field422;

    @ObfuscatedName("cs.ac")
    public static int field424;

    @ObfuscatedName("on.ov")
    public static int field4293;

    @ObfuscatedName("ci.aq")
    public static class52 field438;

    @ObfuscatedName("ao.ao")
    public static class45 field44;

    @ObfuscatedName("om.aa")
    public static Thread field4451;

    @ObfuscatedName("om.np")
    public static int field4453;

    @ObfuscatedName("pg.ap")
    public static int field4576;

    @ObfuscatedName("pf.ok")
    public static int field4578;

    @ObfuscatedName("pr.aq")
    public static class559 field4579;

    @ObfuscatedName("pl.sx")
    public static class168 field4608;

    @ObfuscatedName("pe.jn")
    public static class102 field4624;

    @ObfuscatedName("pi.ak")
    public static class387 field4644;

    @ObfuscatedName("pz.by")
    public static class419 field4656;

    @ObfuscatedName("pv.cj")
    public static int field4658;

    @ObfuscatedName("ph.ak")
    public static class387 field4661;

    @ObfuscatedName("ph.af")
    public static class70[] field4663;

    @ObfuscatedName("qp.aj")
    public static int field4677;

    @ObfuscatedName("qz.aj")
    public static int field4687;

    @ObfuscatedName("qz.al")
    public static int field4689;

    @ObfuscatedName("ql.aj")
    public static int field4694;

    @ObfuscatedName("qr.ds")
    public static class559[] field4719;

    @ObfuscatedName("co.du")
    public static class91 field474;

    @ObfuscatedName("qs.cb")
    public static String field4746;

    @ObfuscatedName("qo.av")
    public static class559[] field4749;

    @ObfuscatedName("qt.ah")
    public static class559[] field4763;

    @ObfuscatedName("qv.at")
    public static class559 field4777;

    @ObfuscatedName("qh.io")
    public static class185 field4780;

    @ObfuscatedName("qh.av")
    public static short[][] field4781;

    @ObfuscatedName("qy.fg")
    public static class384 field4783;

    @ObfuscatedName("qj.ic")
    public static int field4787;

    @ObfuscatedName("re.aq")
    public static int[][][] field4796;

    @ObfuscatedName("ah.ga")
    public static String field48;

    @ObfuscatedName("rs.ay")
    public static class168 field4801;

    @ObfuscatedName("ri.as")
    public static int[] field4828;

    @ObfuscatedName("ru.bm")
    public static boolean field4865;

    @ObfuscatedName("rt.ib")
    public static class478 field4871;

    @ObfuscatedName("rm.vz")
    public static class101 field4879;

    @ObfuscatedName("rm.ux")
    public static int field4881;

    @ObfuscatedName("cf.gf")
    public static int field490;

    @ObfuscatedName("sn.ju")
    public static class560 field4919;

    @ObfuscatedName("cf.qu")
    public static class529 field492;

    @ObfuscatedName("sj.nn")
    public static int field4930;

    @ObfuscatedName("ce.aq")
    public static short[] field495;

    @ObfuscatedName("sm.at")
    public static int field4958;

    @ObfuscatedName("af.qi")
    public static int field5;

    @ObfuscatedName("sz.iv")
    public static int field5008;

    @ObfuscatedName("tk.at")
    public static int[] field5036;

    @ObfuscatedName("ts.jx")
    public static int[] field5051;

    @ObfuscatedName("tp.jh")
    public static int[][] field5103;

    @ObfuscatedName("th.jv")
    public static byte[][] field5119;

    @ObfuscatedName("tb.so")
    public static class565 field5181;

    @ObfuscatedName("tz.ar")
    public static int[] field5182;

    @ObfuscatedName("tc.cy")
    public static int field5197;

    @ObfuscatedName("ca.ee")
    public static class384 field522;

    @ObfuscatedName("ue.az")
    public static int field5240;

    @ObfuscatedName("ud.fl")
    public static boolean field5253;

    @ObfuscatedName("uo.al")
    public static long field5263;

    @ObfuscatedName("uy.bk")
    public static String field5271;

    @ObfuscatedName("uc.aj")
    public static int field5274;

    @ObfuscatedName("ut.ak")
    public static class387 field5280;

    @ObfuscatedName("um.an")
    public static int field5283;

    @ObfuscatedName("uw.ak")
    public static class387 field5289;

    @ObfuscatedName("ah.bl")
    public static Image field54;

    @ObfuscatedName("vf.iy")
    public static class431 field5408;

    @ObfuscatedName("vp.am")
    public static int[] field5413;

    @ObfuscatedName("vp.ag")
    public static int field5415;

    @ObfuscatedName("vp.bs")
    public static float[] field5416;

    @ObfuscatedName("vp.ar")
    public static int field5418;

    @ObfuscatedName("vm.ah")
    public static class190 field5431;

    @ObfuscatedName("vi.az")
    public static int[] field5452;

    @ObfuscatedName("vi.al")
    public static int field5453;

    @ObfuscatedName("vi.aa")
    public static int[] field5454;

    @ObfuscatedName("vi.af")
    public static int[] field5455;

    @ObfuscatedName("vi.ak")
    public static int field5456;

    @ObfuscatedName("vi.at")
    public static int[] field5457;

    @ObfuscatedName("vu.al")
    public static String field5487;

    @ObfuscatedName("vb.az")
    public static int field5496;

    @ObfuscatedName("vb.ak")
    public static Applet field5499;

    @ObfuscatedName("av.ax")
    public static int field56;

    @ObfuscatedName("af.aj")
    public static class387 field6;

    @ObfuscatedName("av.fw")
    public static String field60;

    @ObfuscatedName("aq.ap")
    public static class358 field64;

    @ObfuscatedName("ap.ac")
    public static int field67;

    @ObfuscatedName("af.jf")
    public static class560[] field7;

    @ObfuscatedName("ae.jl")
    public static class559[] field73;

    @ObfuscatedName("client.im")
    public static int[] field733;

    @ObfuscatedName("ae.eh")
    public static class349 field75;

    @ObfuscatedName("ax.al")
    public static class16 field76;

    @ObfuscatedName("au.jc")
    public static class560 field83;

    @ObfuscatedName("au.ms")
    public static class94 field84;

    @ObfuscatedName("au.at")
    public static int[][] field85;

    @ObfuscatedName("cy.ct")
    public static int field867;

    @ObfuscatedName("au.uz")
    public static int field87;

    @ObfuscatedName("cy.hv")
    public static int[] field870;

    @ObfuscatedName("ct.gg")
    public static String field880;

    @ObfuscatedName("ct.az")
    public static int[] field884;

    @ObfuscatedName("au.jp")
    public static int[][] field89;

    @ObfuscatedName("ct.ae")
    public static class358 field898;

    @ObfuscatedName("ct.mt")
    public static class68 field900;

    @ObfuscatedName("cg.dd")
    public static boolean field903;

    @ObfuscatedName("cv.ae")
    public static class527[] field920;

    @ObfuscatedName("cu.lq")
    public static int field932;

    @ObfuscatedName("cu.uq")
    public static int field939;

    @ObfuscatedName("cx.al")
    public static boolean field941;

    @ObfuscatedName("cx.af")
    public static class559 field944;

    @ObfuscatedName("cx.aa")
    public static class559 field945;

    @ObfuscatedName("cx.ao")
    public static class560 field946;

    @ObfuscatedName("cx.ap")
    public static class559 field947;

    @ObfuscatedName("cx.az")
    public static class559[] field958;

    @ObfuscatedName("aw.je")
    public static int field97;

    @ObfuscatedName("cx.ad")
    public static String field978;

    @ObfuscatedName("pl.ak(IIIII)I")
    public static final int method6811(int arg0, int arg1, int arg2, int arg3) {
        return arg1 * arg2 - arg0 * arg3 >> 16;
    }

    @ObfuscatedName("bm.ak(I)V")
    public static void method825() {
        class219.field2230.method5572();
    }

    @ObfuscatedName("dq.az(I)[Low;")
    public static class379[] method2111() {
        return new class379[] { class379.field4404, class379.field4403, class379.field4406, class379.field4405 };
    }

    @ObfuscatedName("ei.al(II)Lvh;")
    public static class565 method2601(int arg0) {
        class565[] var1 = class565.method3754();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class565 var3 = var1[var2];
            if (var3.field5483 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("mn.ak(IB)V")
    public static void method5583(int arg0) {
        field4689 = arg0;
        class423.field4691 = new class423[arg0];
        field4687 = 0;
    }

    @ObfuscatedName("hs.ak(Luk;I)V")
    public static void method3632(class545 arg0) {
        class38 var1 = (class38) class37.field247.method6889();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field5344;
        arg0.method8981(var1.field256);
        for (int var3 = 0; var3 < var1.field251; var3++) {
            if (var1.field253[var3] == 0) {
                try {
                    int var4 = var1.field252[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field250[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method8779(0);
                        arg0.method8981(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field250[var3];
                        var7.setInt((Object) null, var1.field254[var3]);
                        arg0.method8779(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field250[var3];
                        int var9 = var8.getModifiers();
                        arg0.method8779(0);
                        arg0.method8981(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field255[var3];
                        byte[][] var11 = var1.field257[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method8779(0);
                        } else if (var15 instanceof Number) {
                            arg0.method8779(1);
                            arg0.method8784(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method8779(2);
                            arg0.method8864((String) var15);
                        } else {
                            arg0.method8779(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field255[var3];
                        int var17 = var16.getModifiers();
                        arg0.method8779(0);
                        arg0.method8981(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method8779(-10);
                } catch (InvalidClassException var31) {
                    arg0.method8779(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method8779(-12);
                } catch (OptionalDataException var33) {
                    arg0.method8779(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method8779(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method8779(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method8779(-16);
                } catch (SecurityException var37) {
                    arg0.method8779(-17);
                } catch (IOException var38) {
                    arg0.method8779(-18);
                } catch (NullPointerException var39) {
                    arg0.method8779(-19);
                } catch (Exception var40) {
                    arg0.method8779(-20);
                } catch (Throwable var41) {
                    arg0.method8779(-21);
                }
            } else {
                arg0.method8779(var1.field253[var3]);
            }
        }
        arg0.method8822(var2);
        var1.method8189();
    }

    @ObfuscatedName("fj.ak(Lor;I)V")
    public static void method3073(class387 arg0) {
        field2227 = arg0;
    }

    @ObfuscatedName("kn.af(II)Z")
    public static boolean method4964(int arg0) {
        return arg0 >= class367.field4014.field4017 && arg0 <= class367.field4015.field4017;
    }

    @ObfuscatedName("hh.al(J)Z")
    public static boolean method3473(long arg0) {
        return class265.method2640(arg0) == 2;
    }

    @ObfuscatedName("bc.at(I)V")
    public static void method858() {
        class220.field2239.method5572();
    }

    @ObfuscatedName("pl.aa(II)Lpl;")
    public static class402 method6794(int arg0) {
        return arg0 >= 0 && arg0 < class402.field4606.length ? class402.field4606[arg0] : null;
    }

    @ObfuscatedName("jn.aa(II)I")
    public static int method4498(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("hj.aj(IIII)I")
    public static int method3420(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @ObfuscatedName("bt.aa(I)V")
    public static void method441() {
        class539.field5288.method5572();
    }

    @ObfuscatedName("pv.ac(B)V")
    public static final void method7067() {
        class378 var10000 = (class378) null;
        String var0 = class378.field4271;
        class114.method2802(30, "", var0);
    }

    @ObfuscatedName("bt.ak(B)[Lmz;")
    public static class322[] method439() {
        return new class322[] { class322.field3482, class322.field3402, class322.field3403, class322.field3453, class322.field3405, class322.field3520, class322.field3407, class322.field3468, class322.field3409, class322.field3410, class322.field3476, class322.field3412, class322.field3413, class322.field3414, class322.field3415, class322.field3416, class322.field3507, class322.field3465, class322.field3419, class322.field3494, class322.field3421, class322.field3422, class322.field3474, class322.field3424, class322.field3417, class322.field3426, class322.field3518, class322.field3428, class322.field3429, class322.field3430, class322.field3431, class322.field3432, class322.field3433, class322.field3434, class322.field3435, class322.field3457, class322.field3501, class322.field3438, class322.field3439, class322.field3531, class322.field3441, class322.field3532, class322.field3443, class322.field3480, class322.field3445, class322.field3446, class322.field3466, class322.field3506, class322.field3442, class322.field3450, class322.field3451, class322.field3447, class322.field3411, class322.field3454, class322.field3455, class322.field3456, class322.field3423, class322.field3458, class322.field3459, class322.field3460, class322.field3461, class322.field3462, class322.field3463, class322.field3504, class322.field3437, class322.field3406, class322.field3467, class322.field3404, class322.field3469, class322.field3470, class322.field3471, class322.field3464, class322.field3473, class322.field3449, class322.field3475, class322.field3444, class322.field3477, class322.field3478, class322.field3490, class322.field3472, class322.field3481, class322.field3487, class322.field3483, class322.field3418, class322.field3485, class322.field3486, class322.field3513, class322.field3488, class322.field3489, class322.field3503, class322.field3440, class322.field3479, class322.field3493, class322.field3492, class322.field3495, class322.field3496, class322.field3425, class322.field3498, class322.field3499, class322.field3500, class322.field3497, class322.field3502, class322.field3514, class322.field3530, class322.field3484, class322.field3448, class322.field3452, class322.field3508, class322.field3509, class322.field3510, class322.field3505, class322.field3512, class322.field3511, class322.field3420, class322.field3515, class322.field3516, class322.field3517, class322.field3401, class322.field3519, class322.field3528, class322.field3521, class322.field3436, class322.field3523, class322.field3524, class322.field3525, class322.field3526, class322.field3527, class322.field3522, class322.field3529, class322.field3491 };
    }

    @ObfuscatedName("mp.ab(CB)Z")
    public static boolean method5597(char arg0) {
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("eg.az(II)Lfk;")
    public static class132 method2873(int arg0) {
        class132[] var1 = new class132[] { class132.field1571, class132.field1567, class132.field1574, class132.field1569, class132.field1570 };
        class132 var2 = (class132) class401.method2027(var1, arg0);
        if (var2 == null) {
            var2 = class132.field1571;
        }
        return var2;
    }

    @ObfuscatedName("jn.ae(I)V")
    public static void method4499() {
        class224.field2278.method5572();
        class224.field2315.method5572();
        class224.field2280.method5572();
        class224.field2281.method5572();
    }

    @ObfuscatedName("qc.aw(IIII)I")
    public static final int method7307(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @ObfuscatedName("ri.ac(ILdm;ZB)I")
    public static int method7663(int arg0, class81 arg1, boolean arg2) {
        boolean var3 = true;
        class358 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = field75.method5906(class73.field893[--field67]);
            var3 = false;
        } else {
            var4 = arg2 ? field898 : field64;
        }
        if (arg0 == 1300) {
            int var5 = class73.field893[--field67] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method6310(var5, class73.field886[--field1822]);
                return 1;
            } else {
                field1822--;
                return 1;
            }
        } else if (arg0 == 1301) {
            field67 -= 2;
            int var6 = class73.field893[field67];
            int var7 = class73.field893[field67 + 1];
            var4.field3898 = field75.method5909(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3962 = class73.field893[--field67] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3899 = class73.field893[--field67];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3900 = class73.field893[--field67];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3924 = class73.field886[--field1822];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3902 = class73.field886[--field1822];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3897 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3891 = class73.field893[--field67] == 1;
            return 1;
        } else if (arg0 == 1309) {
            field67--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                field67 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && class73.field893[field67 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) class73.field893[field67 + var10];
                        var9[var10 / 2] = (byte) class73.field893[field67 + var10 + 1];
                    }
                }
            } else {
                field67 -= 2;
                var8 = new byte[] { (byte) class73.field893[field67] };
                var9 = new byte[] { (byte) class73.field893[field67 + 1] };
            }
            int var11 = class73.field893[--field67] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            class73.method5905(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            field67 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) class73.field893[field67] };
            byte[] var14 = new byte[] { (byte) class73.field893[field67 + 1] };
            class73.method5905(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            field67 -= 3;
            int var15 = class73.field893[field67] - 1;
            int var16 = class73.field893[field67 + 1];
            int var17 = class73.field893[field67 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            class73.method3517(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = class73.field893[--field67];
            int var20 = class73.field893[--field67];
            class73.method3517(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            field67--;
            int var21 = class73.field893[field67] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            class73.method2129(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            class73.method2129(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("en.hx(II)V")
    public static void method2625(int arg0) {
        if (client.field598 == arg0) {
            return;
        }
        if (client.field598 == 30) {
            client.field553.method4070();
        }
        if (client.field598 == 0) {
            field1971.method620();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            client.method824(class69.field499);
            client.field536 = 0;
            client.field567 = 0;
            client.field594.method7675(arg0);
            if (arg0 != 20) {
                client.method5453(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && field4871 != null) {
            field4871.method8024();
            field4871 = null;
        }
        if (client.field598 == 25) {
            client.field585 = 0;
            client.field596 = 0;
            client.field597 = 1;
            client.field700 = 0;
            client.field639 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var2 = client.method260() ? 0 : 12;
            class78.method5601(field1644, field1885, true, var2);
        } else if (arg0 == 20) {
            int var1 = client.field598 == 11 ? 4 : 0;
            class78.method5601(field1644, field1885, false, var1);
        } else if (arg0 == 11) {
            class78.method5601(field1644, field1885, false, 4);
        } else if (arg0 == 50) {
            class78.method5108("", "Updating date of birth...", "");
            class78.method5601(field1644, field1885, false, 7);
        } else if (arg0 != 0) {
            class78.method3099();
        }
        client.field598 = arg0;
    }

    @ObfuscatedName("hq.ay(Lnb;I)I")
    public static int method3489(class358 arg0) {
        if (arg0.field3894 == 11) {
            String var1 = class73.field886[--field1822];
            class73.field893[++field67 - 1] = arg0.method6302(var1);
            return 1;
        } else {
            field1822--;
            class73.field893[++field67 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("kh.id(IB)I")
    public static final int method5380(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("mf.jv(IIB)V")
    public static final void method5575(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (field1255 < arg0) {
            field1255 += field3032 * (arg0 - field1255) / 1000 + field1451;
            if (field1255 > arg0) {
                field1255 = arg0;
            }
        } else if (field1255 > arg0) {
            field1255 -= field3032 * (field1255 - arg0) / 1000 + field1451;
            if (field1255 < arg0) {
                field1255 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - field2100;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            field2100 += field3032 * var3 / 1000 + field1451;
            field2100 &= 0x7FF;
        } else if (var3 < 0) {
            field2100 -= field3032 * -var3 / 1000 + field1451;
            field2100 &= 0x7FF;
        }
        int var4 = var2 - field2100;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            field2100 = var2;
        }
    }

    @ObfuscatedName("nt.jb(Ldt;Ldh;I)V")
    public static final void method5983(class102 arg0, class98 arg1) {
        if (arg1.field1220 != -1) {
            Object var2 = null;
            int var3 = 65536;
            class98 var4;
            if (arg1.field1220 < var3) {
                var4 = arg0.field1344[arg1.field1220];
            } else {
                var4 = arg0.field1342[arg1.field1220 - var3];
            }
            if (var4 != null) {
                int var5 = arg1.field1215 - var4.field1215;
                int var6 = arg1.field1276 - var4.field1276;
                if (var5 != 0 || var6 != 0) {
                    arg1.field1283 = class421.method3366(var5, var6);
                }
            } else if (arg1.field1241) {
                arg1.field1220 = -1;
                arg1.field1241 = false;
            }
        }
        if (arg1.field1275 == 0 || arg1.field1279 > 0) {
            int var7 = -1;
            if (arg1.field1243 != -1 && arg1.field1244 != -1) {
                int var8 = arg1.field1243 * 128 - field3967.field1338 * 128 + 64;
                int var9 = arg1.field1244 * 128 - field3967.field1334 * 128 + 64;
                int var10 = arg1.field1215 - var8;
                int var11 = arg1.field1276 - var9;
                if (var10 != 0 || var11 != 0) {
                    var7 = class421.method3366(var10, var11);
                }
            } else if (arg1.field1205 != -1) {
                var7 = arg1.field1205;
            }
            if (var7 != -1) {
                arg1.field1283 = var7;
                if (arg1.field1245) {
                    arg1.field1210 = arg1.field1283;
                }
            }
            arg1.method2330();
        }
        int var12 = arg1.field1283 - arg1.field1210 & 0x7FF;
        if (var12 == 0) {
            if (arg1.field1241) {
                arg1.field1220 = -1;
                arg1.field1241 = false;
            }
            arg1.field1273 = 0;
            return;
        }
        boolean var13 = true;
        boolean var14 = true;
        arg1.field1273++;
        int var15 = var12 > 1024 ? -1 : 1;
        arg1.field1210 += arg1.field1239 * var15;
        boolean var16 = true;
        if (var12 < arg1.field1239 || var12 > 2048 - arg1.field1239) {
            arg1.field1210 = arg1.field1283;
            var16 = false;
        }
        if (arg1.field1239 > 0 && arg1.field1246 == arg1.field1211 && (arg1.field1273 > 25 || var16)) {
            if (var15 == -1 && arg1.field1242 != -1) {
                arg1.field1246 = arg1.field1242;
            } else if (var15 == 1 && arg1.field1213 != -1) {
                arg1.field1246 = arg1.field1213;
            } else {
                arg1.field1246 = arg1.field1214;
            }
        }
        arg1.field1210 &= 0x7FF;
    }

    @ObfuscatedName("cm.lf(Ldt;Luk;B)V")
    public static void method1078(class102 arg0, class545 arg1) {
        int var2 = arg1.method8796();
        if (var2 < arg0.field1335) {
            throw new RuntimeException("dang");
        } else if (var2 > arg0.field1335) {
            throw new RuntimeException("dang!");
        } else {
            arg0.field1335 = 0;
            for (int var3 = 0; var3 < var2; var3++) {
                int var4 = arg0.field1351[var3];
                class476 var5 = arg0.field1348[var4];
                boolean var6 = arg1.method8796() == 1;
                if (var6) {
                    arg0.field1351[++arg0.field1335 - 1] = var4;
                    byte var7 = arg1.method8797();
                    byte var8 = arg1.method8797();
                    var5.field4941 = arg1.method8798();
                    class238 var9 = class238.method5083((byte) arg1.method8796());
                    int var10 = var5.field4941;
                    int var11 = var5.field4940;
                    int var12 = var10 - var11 & 0x7FF;
                    class239 var13 = class239.field2538;
                    if (var12 > 1024) {
                        var12 = 2048 - var12;
                        var13 = class239.field2539;
                    }
                    class234 var14 = new class234(var13, var12);
                    int var16 = Math.min(var14.method4149(), 128);
                    var5.field4942 = var16 / client.field757;
                    var5.field4945 = var16 % client.field757;
                    if (var7 != 0 || var8 != 0) {
                        var5.method8003(var5.field4943[0] + var7, var5.field4951[0] + var8, var9);
                    }
                } else {
                    arg0.field1348[var4] = null;
                }
            }
            while (arg1.method8742(client.field591.field1465) >= 10) {
                int var17 = arg1.method8798();
                arg0.field1351[++arg0.field1335 - 1] = var17;
                int var18 = arg1.method8796();
                int var19 = arg1.method8796();
                int var20 = var18 * 8;
                int var21 = var19 * 8;
                class476 var22 = new class476(var17, var20, var21, field4879.method2459());
                arg0.field1348[var17] = var22;
                int var23 = arg1.method8796();
                int var24 = arg1.method8796();
                var22.method8004(var23, var24);
                var22.field4940 = arg1.method8798();
                arg1.method8798();
            }
        }
    }

    @ObfuscatedName("am.lz(IIIIB)V")
    public static final void method306(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < client.field744; var4++) {
            if (client.field765[var4] + client.field751[var4] > arg0 && client.field765[var4] < arg0 + arg2 && client.field800[var4] + client.field750[var4] > arg1 && client.field750[var4] < arg1 + arg3) {
                client.field747[var4] = true;
            }
        }
    }

    @ObfuscatedName("ag.mn(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method353(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        client.method3494(arg0, arg1, arg2, arg3, arg4, arg5, -1, false, -1);
    }

    @ObfuscatedName("me.nt(Lnb;I)V")
    public static void method5599(class358 arg0) {
        if (arg0 != null && client.field601 == arg0.field3901) {
            client.field657[arg0.field3960] = true;
        }
    }

    @ObfuscatedName("gt.oo(Lnb;I)V")
    public static final void method3104(class358 arg0) {
        int var1 = arg0.field3820;
        if (var1 == 324) {
            if (client.field815 == -1) {
                client.field815 = arg0.field3851;
                client.field816 = arg0.field3852;
            }
            if (client.field814.field3756 == 1) {
                arg0.field3851 = client.field815;
            } else {
                arg0.field3851 = client.field816;
            }
        } else if (var1 == 325) {
            if (client.field815 == -1) {
                client.field815 = arg0.field3851;
                client.field816 = arg0.field3852;
            }
            if (client.field814.field3756 == 1) {
                arg0.field3851 = client.field816;
            } else {
                arg0.field3851 = client.field815;
            }
        } else if (var1 == 327) {
            arg0.field3868 = 150;
            arg0.field3953 = (int) (Math.sin((double) client.field821 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3931 = 5;
            arg0.field3861 = 0;
        } else if (var1 == 328) {
            arg0.field3868 = 150;
            arg0.field3953 = (int) (Math.sin((double) client.field821 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3931 = 5;
            arg0.field3861 = 1;
        }
    }

    @ObfuscatedName("hy.od(Ljava/lang/String;I)V")
    public static final void method3490(String arg0) {
        if (!arg0.equals("")) {
            class321 var1 = class321.method3542(class319.field3348, client.field591.field1467);
            var1.field3393.method8779(class546.method7454(arg0));
            var1.field3393.method8864(arg0);
            client.field591.method2745(var1);
        }
    }

    @ObfuscatedName("im.pg(I)Z")
    public static boolean method4147() {
        return client.field669 >= 2;
    }

    @ObfuscatedName("ku.pf(IB)V")
    public static void method5369(int arg0) {
        client.field620 = arg0;
    }
}
