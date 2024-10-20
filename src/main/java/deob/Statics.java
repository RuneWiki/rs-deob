package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class Statics {

    @ObfuscatedName("as.ae")
    public static int field100;

    @ObfuscatedName("dm.aq")
    public static short[][][] field1012;

    @ObfuscatedName("dm.aw")
    public static int[][][] field1013;

    @ObfuscatedName("dm.aj")
    public static short[][][] field1022;

    @ObfuscatedName("dt.aa")
    public static class545 field1024;

    @ObfuscatedName("dt.vq")
    public static int field1028;

    @ObfuscatedName("dt.gi")
    public static int field1029;

    @ObfuscatedName("da.me")
    public static class280 field1037;

    @ObfuscatedName("ab.kp")
    public static class544[] field105;

    @ObfuscatedName("db.oc")
    public static int field1070;

    @ObfuscatedName("de.ju")
    public static class410 field1089;

    @ObfuscatedName("ai.ax")
    public static short[][] field114;

    @ObfuscatedName("dp.cl")
    public static class390 field1147;

    @ObfuscatedName("di.wq")
    public static class99 field1155;

    @ObfuscatedName("ac.ec")
    public static class89 field118;

    @ObfuscatedName("ac.bf")
    public static String field121;

    @ObfuscatedName("df.kd")
    public static class545[] field1249;

    @ObfuscatedName("do.lb")
    public static int field1254;

    @ObfuscatedName("dh.tl")
    public static class445 field1292;

    @ObfuscatedName("dh.ru")
    public static class110 field1293;

    @ObfuscatedName("dq.uj")
    public static int field1297;

    @ObfuscatedName("du.aa")
    public static class115 field1313;

    @ObfuscatedName("at.ix")
    public static int field132;

    @ObfuscatedName("at.ns")
    public static class92 field133;

    @ObfuscatedName("et.cl")
    public static int field1341;

    @ObfuscatedName("et.ap")
    public static class375 field1342;

    @ObfuscatedName("eo.qw")
    public static int field1343;

    @ObfuscatedName("ec.kr")
    public static class545[] field1347;

    @ObfuscatedName("at.jv")
    public static int field135;

    @ObfuscatedName("bd.qc")
    public static int field136;

    @ObfuscatedName("en.ak")
    public static int field1382;

    @ObfuscatedName("en.ah")
    public static String field1384;

    @ObfuscatedName("ed.cs")
    public static String field1413;

    @ObfuscatedName("eg.wg")
    public static class376 field1419;

    @ObfuscatedName("em.td")
    public static class155 field1427;

    @ObfuscatedName("em.mu")
    public static int field1428;

    @ObfuscatedName("em.ib")
    public static class113 field1431;

    @ObfuscatedName("em.ao")
    public static int[] field1433;

    @ObfuscatedName("ee.uo")
    public static class58 field1434;

    @ObfuscatedName("er.tg")
    public static class164 field1443;

    @ObfuscatedName("er.wk")
    public static List field1445;

    @ObfuscatedName("bg.ws")
    public static Iterator field145;

    @ObfuscatedName("ey.an")
    public static int field1451;

    @ObfuscatedName("eh.jl")
    public static class410 field1454;

    @ObfuscatedName("ep.lp")
    public static int field1456;

    @ObfuscatedName("ep.ak")
    public static String[] field1459;

    @ObfuscatedName("eb.aq")
    public static String[] field1461;

    @ObfuscatedName("eu.ct")
    public static class509 field1465;

    @ObfuscatedName("eq.ae")
    public static int field1469;

    @ObfuscatedName("ei.bo")
    public static class462 field1487;

    @ObfuscatedName("ef.fq")
    public static class373 field1490;

    @ObfuscatedName("fe.gn")
    public static class373 field1522;

    @ObfuscatedName("fe.cw")
    public static int field1526;

    @ObfuscatedName("bg.cb")
    public static class362 field154;

    @ObfuscatedName("fx.da")
    public static class544[] field1552;

    @ObfuscatedName("ff.ii")
    public static class219 field1564;

    @ObfuscatedName("bg.kh")
    public static int field158;

    @ObfuscatedName("fh.id")
    public static long field1595;

    @ObfuscatedName("br.fk")
    public static class373 field160;

    @ObfuscatedName("ba.bh")
    public static boolean field161;

    @ObfuscatedName("fs.bd")
    public static Font field1620;

    @ObfuscatedName("fw.aa")
    public static int field1626;

    @ObfuscatedName("fl.ar")
    public static byte[][][] field1629;

    @ObfuscatedName("ba.aw")
    public static class347 field163;

    @ObfuscatedName("fo.ga")
    public static class373 field1633;

    @ObfuscatedName("fo.kn")
    public static class545[] field1635;

    @ObfuscatedName("fd.bl")
    public static String field1636;

    @ObfuscatedName("fc.au")
    public static int field1663;

    @ObfuscatedName("fc.cx")
    public static String field1664;

    @ObfuscatedName("fc.hf")
    public static String field1666;

    @ObfuscatedName("fq.ka")
    public static class545 field1667;

    @ObfuscatedName("ba.wp")
    public static int field167;

    @ObfuscatedName("fy.ae")
    public static int field1682;

    @ObfuscatedName("fa.af")
    public static int field1688;

    @ObfuscatedName("ba.ck")
    public static int field169;

    @ObfuscatedName("fn.ug")
    public static class39 field1710;

    @ObfuscatedName("fp.as")
    public static byte[][][] field1724;

    @ObfuscatedName("fp.dr")
    public static class544 field1726;

    @ObfuscatedName("gq.iy")
    public static SecureRandom field1754;

    @ObfuscatedName("gt.gd")
    public static String field1766;

    @ObfuscatedName("gt.un")
    public static int field1767;

    @ObfuscatedName("gj.ag")
    public static class375 field1782;

    @ObfuscatedName("gj.jb")
    public static int[][] field1787;

    @ObfuscatedName("gx.dv")
    public static class545[] field1793;

    @ObfuscatedName("gb.rv")
    public static class214 field1800;

    @ObfuscatedName("gs.am")
    public static long field1802;

    @ObfuscatedName("gy.am")
    public static class375 field1806;

    @ObfuscatedName("gy.gy")
    public static String field1807;

    @ObfuscatedName("bn.jn")
    public static int[] field181;

    @ObfuscatedName("gc.ud")
    public static int field1818;

    @ObfuscatedName("gf.fd")
    public static class373 field1821;

    @ObfuscatedName("gh.db")
    public static class544 field1825;

    @ObfuscatedName("gm.am")
    public static class375 field1832;

    @ObfuscatedName("gm.tb")
    public static boolean field1833;

    @ObfuscatedName("gm.tc")
    public static boolean field1834;

    @ObfuscatedName("gk.rb")
    public static class514 field1838;

    @ObfuscatedName("gw.am")
    public static class375 field1847;

    @ObfuscatedName("gw.ap")
    public static class178[] field1851;

    @ObfuscatedName("gp.am")
    public static class375 field1865;

    @ObfuscatedName("ge.am")
    public static class375 field1871;

    @ObfuscatedName("ge.af")
    public static int field1872;

    @ObfuscatedName("ge.ap")
    public static class375 field1878;

    @ObfuscatedName("gd.ap")
    public static class375 field1885;

    @ObfuscatedName("gd.uv")
    public static int field1891;

    @ObfuscatedName("gd.jj")
    public static int field1900;

    @ObfuscatedName("gd.am")
    public static class375 field1903;

    @ObfuscatedName("hw.ar")
    public static class544 field1905;

    @ObfuscatedName("hw.ad")
    public static class544 field1909;

    @ObfuscatedName("hu.am")
    public static class375 field1915;

    @ObfuscatedName("hd.jp")
    public static int field1926;

    @ObfuscatedName("hd.ab")
    public static String field1927;

    @ObfuscatedName("hr.ax")
    public static class347 field1933;

    @ObfuscatedName("hb.ki")
    public static int field1945;

    @ObfuscatedName("ho.af")
    public static class375 field1948;

    @ObfuscatedName("ho.ap")
    public static class375 field1962;

    @ObfuscatedName("by.am")
    public static class211 field198;

    @ObfuscatedName("by.ah")
    public static int field199;

    @ObfuscatedName("ht.aq")
    public static int field1994;

    @ObfuscatedName("ht.az")
    public static int field1995;

    @ObfuscatedName("ht.fg")
    public static class373 field1996;

    @ObfuscatedName("ht.gu")
    public static class373 field2000;

    @ObfuscatedName("hq.am")
    public static class375 field2034;

    @ObfuscatedName("hz.am")
    public static class375 field2036;

    @ObfuscatedName("hf.ag")
    public static int field2043;

    @ObfuscatedName("hf.ui")
    public static int field2046;

    @ObfuscatedName("hc.am")
    public static class375 field2062;

    @ObfuscatedName("hi.am")
    public static class375 field2065;

    @ObfuscatedName("hy.af")
    public static class375 field2089;

    @ObfuscatedName("hy.fz")
    public static class373 field2091;

    @ObfuscatedName("hy.am")
    public static class375 field2093;

    @ObfuscatedName("hg.ap")
    public static class375 field2095;

    @ObfuscatedName("hg.af")
    public static class375 field2103;

    @ObfuscatedName("hp.ar")
    public static class375 field2156;

    @ObfuscatedName("hp.ad")
    public static class410 field2159;

    @ObfuscatedName("by.kk")
    public static int field219;

    @ObfuscatedName("hl.aq")
    public static class375 field2223;

    @ObfuscatedName("hl.ar")
    public static class375 field2233;

    @ObfuscatedName("im.ak")
    public static int[] field2275;

    @ObfuscatedName("im.ag")
    public static byte[][][] field2279;

    @ObfuscatedName("im.gq")
    public static class373 field2282;

    @ObfuscatedName("iy.oy")
    public static int field2287;

    @ObfuscatedName("iy.ov")
    public static class347 field2288;

    @ObfuscatedName("ij.ap")
    public static String field2293;

    @ObfuscatedName("ij.ae")
    public static int[] field2296;

    @ObfuscatedName("iq.au")
    public static int field2300;

    @ObfuscatedName("ic.ar")
    public static int field2304;

    @ObfuscatedName("ic.aw")
    public static class512[] field2310;

    @ObfuscatedName("io.ap")
    public static File field2314;

    @ObfuscatedName("io.ay")
    public static int[] field2317;

    @ObfuscatedName("it.an")
    public static class544[] field2384;

    @ObfuscatedName("iv.ax")
    public static int[] field2428;

    @ObfuscatedName("bx.fo")
    public static class373 field243;

    @ObfuscatedName("ig.ai")
    public static String field2445;

    @ObfuscatedName("ig.gk")
    public static int field2447;

    @ObfuscatedName("in.ae")
    public static byte[][] field2456;

    @ObfuscatedName("ib.am")
    public static String field2467;

    @ObfuscatedName("jh.cd")
    public static int field2468;

    @ObfuscatedName("jh.jo")
    public static int[] field2471;

    @ObfuscatedName("jl.kq")
    public static int field2479;

    @ObfuscatedName("jm.kg")
    public static class544[] field2487;

    @ObfuscatedName("jm.vy")
    public static int field2488;

    @ObfuscatedName("jr.le")
    public static int field2517;

    @ObfuscatedName("ji.bp")
    public static class542 field2556;

    @ObfuscatedName("ji.jh")
    public static class500 field2558;

    @ObfuscatedName("jf.fm")
    public static class373 field2588;

    @ObfuscatedName("jf.bz")
    public static class462 field2594;

    @ObfuscatedName("jn.fy")
    public static class373 field2628;

    @ObfuscatedName("jk.lm")
    public static int field2669;

    @ObfuscatedName("jk.hm")
    public static String field2677;

    @ObfuscatedName("ki.ji")
    public static int field2683;

    @ObfuscatedName("ka.aw")
    public static int[] field2765;

    @ObfuscatedName("aa.bi")
    public static GarbageCollectorMXBean field28;

    @ObfuscatedName("bb.aa")
    public static class45 field283;

    @ObfuscatedName("kn.ac")
    public static int field2832;

    @ObfuscatedName("kn.ak")
    public static int field2834;

    @ObfuscatedName("kn.av")
    public static int field2848;

    @ObfuscatedName("kn.ay")
    public static int field2850;

    @ObfuscatedName("kn.at")
    public static int field2851;

    @ObfuscatedName("kn.ab")
    public static int field2852;

    @ObfuscatedName("kn.ah")
    public static int field2853;

    @ObfuscatedName("kn.ai")
    public static int field2854;

    @ObfuscatedName("kn.al")
    public static int field2856;

    @ObfuscatedName("kn.bj")
    public static int field2858;

    @ObfuscatedName("kn.bd")
    public static int field2859;

    @ObfuscatedName("kn.bg")
    public static int field2860;

    @ObfuscatedName("kn.co")
    public static int field2875;

    @ObfuscatedName("kn.cy")
    public static int field2880;

    @ObfuscatedName("kn.as")
    public static int field2882;

    @ObfuscatedName("kn.cu")
    public static int field2884;

    @ObfuscatedName("kn.cs")
    public static boolean[][] field2892;

    @ObfuscatedName("kn.cc")
    public static int field2893;

    @ObfuscatedName("kn.cd")
    public static int field2894;

    @ObfuscatedName("kn.bt")
    public static int field2895;

    @ObfuscatedName("kn.cn")
    public static int field2898;

    @ObfuscatedName("kb.fl")
    public static class373 field2908;

    @ObfuscatedName("bb.ao")
    public static ScheduledExecutorService field297;

    @ObfuscatedName("aa.ua")
    public static int field30;

    @ObfuscatedName("ko.cs")
    public static int field3030;

    @ObfuscatedName("ko.cc")
    public static int field3033;

    @ObfuscatedName("ko.cd")
    public static int field3034;

    @ObfuscatedName("ks.ag")
    public static int field3055;

    @ObfuscatedName("ks.ao")
    public static int field3056;

    @ObfuscatedName("ks.ae")
    public static int field3063;

    @ObfuscatedName("ks.ar")
    public static int field3064;

    @ObfuscatedName("kk.bl")
    public static client field3067;

    @ObfuscatedName("ln.pa")
    public static int field3102;

    @ObfuscatedName("lv.ad")
    public static class52 field3109;

    @ObfuscatedName("lu.ku")
    public static class545 field3122;

    @ObfuscatedName("bw.ur")
    public static int field315;

    @ObfuscatedName("bi.eu")
    public static boolean field320;

    @ObfuscatedName("lz.ad")
    public static int[] field3273;

    @ObfuscatedName("lr.gz")
    public static class373 field3285;

    @ObfuscatedName("md.fn")
    public static class373 field3429;

    @ObfuscatedName("mi.ap")
    public static long field3435;

    @ObfuscatedName("mg.aj")
    public static File field3442;

    @ObfuscatedName("mg.aq")
    public static int field3443;

    @ObfuscatedName("mg.wc")
    public static short[] field3445;

    @ObfuscatedName("mw.ap")
    public static class375 field3456;

    @ObfuscatedName("mw.af")
    public static class375 field3457;

    @ObfuscatedName("mw.am")
    public static class375 field3459;

    @ObfuscatedName("mw.js")
    public static byte[][] field3468;

    @ObfuscatedName("ms.gt")
    public static class461 field3518;

    @ObfuscatedName("mc.gw")
    public static int field3533;

    @ObfuscatedName("mp.dj")
    public static class544[] field3535;

    @ObfuscatedName("ml.os")
    public static int field3541;

    @ObfuscatedName("mv.fj")
    public static class373 field3549;

    @ObfuscatedName("me.wu")
    public static class69 field3588;

    @ObfuscatedName("me.ag")
    public static class375 field3589;

    @ObfuscatedName("mq.av")
    public static class98 field3596;

    @ObfuscatedName("mm.wf")
    public static class386 field3600;

    @ObfuscatedName("nr.jm")
    public static class410 field3619;

    @ObfuscatedName("ns.au")
    public static int[] field3628;

    @ObfuscatedName("ns.ja")
    public static byte[][] field3629;

    @ObfuscatedName("nz.an")
    public static short[][] field3647;

    @ObfuscatedName("nz.ad")
    public static short[] field3649;

    @ObfuscatedName("cb.vn")
    public static int field368;

    @ObfuscatedName("nl.au")
    public static class224 field3683;

    @ObfuscatedName("cb.gh")
    public static int field370;

    @ObfuscatedName("ci.bg")
    public static int[] field371;

    @ObfuscatedName("ci.ai")
    public static float[] field372;

    @ObfuscatedName("ci.ao")
    public static int field378;

    @ObfuscatedName("ci.ae")
    public static int field379;

    @ObfuscatedName("au.gp")
    public static String field38;

    @ObfuscatedName("ci.aa")
    public static class53[] field380;

    @ObfuscatedName("ci.au")
    public static class42[] field381;

    @ObfuscatedName("ci.an")
    public static class47[] field382;

    @ObfuscatedName("ci.ax")
    public static boolean[] field384;

    @ObfuscatedName("ci.aw")
    public static int[] field385;

    @ObfuscatedName("na.ap")
    public static int field3857;

    @ObfuscatedName("nt.fw")
    public static class373 field3863;

    @ObfuscatedName("nv.gm")
    public static int field3865;

    @ObfuscatedName("nc.ve")
    public static int field3871;

    @ObfuscatedName("ne.am")
    public static class353 field3872;

    @ObfuscatedName("nx.fa")
    public static class373 field3891;

    @ObfuscatedName("au.qs")
    public static int field39;

    @ObfuscatedName("ci.bd")
    public static int[] field391;

    @ObfuscatedName("ny.cm")
    public static int field3912;

    @ObfuscatedName("ny.ag")
    public static boolean[] field3913;

    @ObfuscatedName("ci.ah")
    public static float[] field392;

    @ObfuscatedName("ni.wh")
    public static class459 field3923;

    @ObfuscatedName("ci.ac")
    public static float[] field393;

    @ObfuscatedName("no.kb")
    public static class544[] field3933;

    @ObfuscatedName("nb.bg")
    public static FontMetrics field3949;

    @ObfuscatedName("ci.at")
    public static float[] field396;

    @ObfuscatedName("og.jz")
    public static int[] field3967;

    @ObfuscatedName("ci.bj")
    public static float[] field397;

    @ObfuscatedName("ox.ke")
    public static class545[] field3974;

    @ObfuscatedName("ci.ad")
    public static class51[] field399;

    @ObfuscatedName("ap.cv")
    public static class363 field4;

    @ObfuscatedName("ci.al")
    public static float[] field400;

    @ObfuscatedName("cp.iz")
    public static int field405;

    @ObfuscatedName("cp.az")
    public static class544 field411;

    @ObfuscatedName("cq.ao")
    public static float field418;

    @ObfuscatedName("cq.ae")
    public static int field421;

    @ObfuscatedName("oc.ld")
    public static int field4291;

    @ObfuscatedName("ok.ig")
    public static class455 field4299;

    @ObfuscatedName("cs.pq")
    public static int field432;

    @ObfuscatedName("ok.py")
    public static int field4321;

    @ObfuscatedName("ot.ar")
    public static Thread field4334;

    @ObfuscatedName("ot.ue")
    public static int field4335;

    @ObfuscatedName("oi.dl")
    public static boolean field4356;

    @ObfuscatedName("cs.gg")
    public static String field438;

    @ObfuscatedName("cs.ok")
    public static int field439;

    @ObfuscatedName("on.au")
    public static class544 field4406;

    @ObfuscatedName("ou.lk")
    public static int field4408;

    @ObfuscatedName("oa.az")
    public static int field4411;

    @ObfuscatedName("oe.wi")
    public static class377 field4412;

    @ObfuscatedName("oe.ea")
    public static class339 field4415;

    @ObfuscatedName("oe.uz")
    public static int field4417;

    @ObfuscatedName("om.ap")
    public static class375 field4418;

    @ObfuscatedName("om.aa")
    public static int[] field4419;

    @ObfuscatedName("od.ww")
    public static class499 field4432;

    @ObfuscatedName("od.az")
    public static class155 field4433;

    @ObfuscatedName("ov.aq")
    public static int[] field4444;

    @ObfuscatedName("ol.rj")
    public static class514 field4451;

    @ObfuscatedName("pf.sc")
    public static class550 field4498;

    @ObfuscatedName("pz.aw")
    public static class544 field4501;

    @ObfuscatedName("pt.aq")
    public static int field4502;

    @ObfuscatedName("pl.aq")
    public static File field4504;

    @ObfuscatedName("pe.ri")
    public static class471 field4518;

    @ObfuscatedName("pw.au")
    public static class544[] field4559;

    @ObfuscatedName("qr.bk")
    public static Image field4580;

    @ObfuscatedName("qx.am")
    public static class375 field4586;

    @ObfuscatedName("qa.ae")
    public static int[][] field4591;

    @ObfuscatedName("qk.hz")
    public static String field4606;

    @ObfuscatedName("qi.cc")
    public static String field4609;

    @ObfuscatedName("qw.aj")
    public static int field4648;

    @ObfuscatedName("qq.oh")
    public static class347 field4657;

    @ObfuscatedName("qq.ai")
    public static int field4662;

    @ObfuscatedName("qv.am")
    public static class375 field4677;

    @ObfuscatedName("qj.ut")
    public static int field4691;

    @ObfuscatedName("rs.ar")
    public static int[] field4707;

    @ObfuscatedName("rx.fi")
    public static class455 field4727;

    @ObfuscatedName("rj.ae")
    public static class545 field4740;

    @ObfuscatedName("ry.fr")
    public static class219 field4793;

    @ObfuscatedName("rr.ar")
    public static boolean field4794;

    @ObfuscatedName("ro.ax")
    public static class544 field4806;

    @ObfuscatedName("rh.af")
    public static int field4809;

    @ObfuscatedName("sf.ao")
    public static class544 field4840;

    @ObfuscatedName("sy.ft")
    public static class373 field4845;

    @ObfuscatedName("sz.ax")
    public static int field4855;

    @ObfuscatedName("sx.te")
    public static class545 field4876;

    @ObfuscatedName("cn.ag")
    public static int[] field490;

    @ObfuscatedName("cn.gf")
    public static int field491;

    @ObfuscatedName("cn.jg")
    public static class274 field493;

    @ObfuscatedName("tn.aj")
    public static int field4949;

    @ObfuscatedName("cn.av")
    public static String[] field495;

    @ObfuscatedName("cn.kx")
    public static class545[] field496;

    @ObfuscatedName("aq.ge")
    public static String field5;

    @ObfuscatedName("tc.uu")
    public static class43 field5025;

    @ObfuscatedName("ta.ao")
    public static boolean field5062;

    @ObfuscatedName("tw.an")
    public static int[] field5097;

    @ObfuscatedName("tq.vv")
    public static int field5106;

    @ObfuscatedName("uu.am")
    public static class375 field5119;

    @ObfuscatedName("uh.am")
    public static class375 field5125;

    @ObfuscatedName("uy.ab")
    public static int field5134;

    @ObfuscatedName("ud.al")
    public static int[] field5201;

    @ObfuscatedName("ur.au")
    public static short[] field5246;

    @ObfuscatedName("ue.al")
    public static int field5249;

    @ObfuscatedName("ue.ac")
    public static int[] field5250;

    @ObfuscatedName("ue.at")
    public static int field5252;

    @ObfuscatedName("ue.bj")
    public static float[] field5254;

    @ObfuscatedName("un.ao")
    public static byte[][][] field5261;

    @ObfuscatedName("uf.af")
    public static int field5287;

    @ObfuscatedName("uf.ap")
    public static int field5288;

    @ObfuscatedName("uf.am")
    public static int field5289;

    @ObfuscatedName("uf.aj")
    public static int[] field5290;

    @ObfuscatedName("ax.kf")
    public static class545[] field53;

    @ObfuscatedName("vp.ap")
    public static String field5336;

    @ObfuscatedName("vp.am")
    public static Applet field5337;

    @ObfuscatedName("vp.af")
    public static int field5338;

    @ObfuscatedName("ax.av")
    public static class164 field55;

    @ObfuscatedName("aw.gc")
    public static int field60;

    @ObfuscatedName("az.ap")
    public static class16 field63;

    @ObfuscatedName("ak.wy")
    public static long field75;

    @ObfuscatedName("ak.ij")
    public static int[] field76;

    @ObfuscatedName("ay.ql")
    public static class347[] field79;

    @ObfuscatedName("ay.wd")
    public static int field80;

    @ObfuscatedName("client.dz")
    public static class544[] field805;

    @ObfuscatedName("ay.gr")
    public static class373 field81;

    @ObfuscatedName("ch.aq")
    public static class68[] field820;

    @ObfuscatedName("cr.wn")
    public static class491 field824;

    @ObfuscatedName("ay.fs")
    public static long field84;

    @ObfuscatedName("cz.aj")
    public static int[] field848;

    @ObfuscatedName("cz.ab")
    public static class263 field849;

    @ObfuscatedName("ay.ao")
    public static ThreadPoolExecutor field86;

    @ObfuscatedName("cf.ag")
    public static int field898;

    @ObfuscatedName("cf.of")
    public static class74 field901;

    @ObfuscatedName("cw.aj")
    public static class544[] field907;

    @ObfuscatedName("cw.aq")
    public static class544 field909;

    @ObfuscatedName("cw.ap")
    public static boolean field923;

    @ObfuscatedName("cw.ag")
    public static class544 field926;

    @ObfuscatedName("cw.dw")
    public static class544 field934;

    @ObfuscatedName("as.fc")
    public static class373 field95;

    @ObfuscatedName("dc.fp")
    public static class373 field995;

    @ObfuscatedName("dc.ad")
    public static int field999;

    @ObfuscatedName("pc.am(IIII)I")
    public static int method7097(int arg0, int arg1, int arg2) {
        int var3 = arg2 & 0x3;
        if (var3 == 0) {
            return arg1;
        } else if (var3 == 1) {
            return 7 - arg0;
        } else if (var3 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("jx.am(I)[Ljx;")
    public static class248[] method4539() {
        return new class248[] { class248.field2602, class248.field2603, class248.field2599, class248.field2601 };
    }

    @ObfuscatedName("eb.am(I)J")
    public static final synchronized long method2852() {
        long var0 = System.currentTimeMillis();
        if (var0 < field1802) {
            field3435 += field1802 - var0;
        }
        field1802 = var0;
        return field3435 + var0;
    }

    @ObfuscatedName("ns.am([Ljava/lang/CharSequence;IIB)Ljava/lang/String;")
    public static String method5763(CharSequence[] arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            CharSequence var3 = arg0[arg1];
            return var3 == null ? "null" : var3.toString();
        } else {
            int var4 = arg1 + arg2;
            int var5 = 0;
            for (int var6 = arg1; var6 < var4; var6++) {
                CharSequence var7 = arg0[var6];
                if (var7 == null) {
                    var5 += 4;
                } else {
                    var5 += var7.length();
                }
            }
            StringBuilder var8 = new StringBuilder(var5);
            for (int var9 = arg1; var9 < var4; var9++) {
                CharSequence var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @ObfuscatedName("ca.am(B)Llr;")
    public static class311 method2150() {
        return class311.field3282 == 0 ? new class311() : class311.field3277[--class311.field3282];
    }

    @ObfuscatedName("js.am(I)V")
    public static void method4578() {
        field2296 = new int[2000];
        int var0 = 0;
        int var1 = 240;
        byte var2 = 12;
        while (var0 < 16) {
            int var3 = class245.method3937((double) ((float) var1 / 360.0F), 0.9998999834060669D, (double) ((float) var0 * 0.425F / 16.0F + 0.075F));
            field2296[var0] = var3;
            var0++;
            var1 -= var2;
        }
        int var4 = 48;
        int var5 = var4 / 6;
        while (var0 < field2296.length) {
            int var6 = var0 * 2;
            int var7 = class245.method3937((double) ((float) var4 / 360.0F), 0.9998999834060669D, 0.5D);
            while (var0 < var6 && var0 < field2296.length) {
                field2296[var0] = var7;
                var0++;
            }
            var4 -= var5;
        }
    }

    @ObfuscatedName("ef.am(II)V")
    public static void method2904(int arg0) {
    }

    @ObfuscatedName("qh.ap(J)Z")
    public static boolean method7336(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("hn.ar(S)V")
    public static void method3395() {
        class111.field1396.clear();
        class111.field1394.method8284();
        class111.field1395.method6805();
        class111.field1398 = 0;
    }

    @ObfuscatedName("nv.ar(IIILhg;IB)V")
    public static void method6276(int arg0, int arg1, int arg2, class202 arg3, int arg4) {
        if (arg3 == null || !arg3.method3649()) {
            return;
        }
        int var5 = arg3.field2120;
        int var6 = arg3.field2096;
        if (arg4 == 1 || arg4 == 3) {
            var5 = arg3.field2096;
            var6 = arg3.field2120;
        }
        int var7 = (arg1 + var5) * 128;
        int var8 = (arg2 + var6) * 128;
        int var9 = arg1 * 128;
        int var10 = arg2 * 128;
        int var11 = arg3.field2139;
        int var12 = arg3.field2105 * 128;
        if (arg3.field2097 != null) {
            class202 var13 = arg3.method3608();
            if (var13 != null) {
                var11 = var13.field2139;
                var12 = var13.field2105 * 128;
            }
        }
        for (class70 var14 = (class70) class70.field840.method6670(); var14 != null; var14 = (class70) class70.field840.method6665()) {
            if (var14.field832 == arg0 && var14.field833 == var9 && var14.field834 == var10 && var14.field837 == var7 && var14.field836 == var8 && var14.field844 == var11 && var14.field845 == var12) {
                if (var14.field839 != null) {
                    field1710.method734(var14.field839);
                    var14.field839 = null;
                }
                if (var14.field838 != null) {
                    field1710.method734(var14.field838);
                    var14.field838 = null;
                }
                var14.method7988();
                break;
            }
        }
    }

    @ObfuscatedName("rx.bq(Lnz;I)Z")
    public static boolean method7542(class344 arg0) {
        if (arg0.field3638[0] < 512) {
            return false;
        } else {
            class203 var1 = class203.method5762(arg0.field3638[0] - 512);
            return class206.field2258.field2260 != var1.field2169 && class206.field2258.field2260 != var1.field2150;
        }
    }

    @ObfuscatedName("fx.hp(IB)V")
    public static void method2960(int arg0) {
        if (client.field508 == arg0) {
            return;
        }
        if (client.field508 == 30) {
            client.field609.method4040();
        }
        if (client.field508 == 0) {
            field3067.method552();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method2809(0);
            client.field534 = 0;
            client.field535 = 0;
            client.field538.method7344(arg0);
            if (arg0 != 20) {
                method3548(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && field4299 != null) {
            field4299.method7662();
            field4299 = null;
        }
        if (client.field508 == 25) {
            client.field569 = 0;
            client.field567 = 0;
            client.field568 = 1;
            client.field556 = 0;
            client.field570 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var2 = client.method6597() ? 0 : 12;
            class76.method2883(field1996, field95, true, var2);
        } else if (arg0 == 20) {
            int var1 = client.field508 == 11 ? 4 : 0;
            class76.method2883(field1996, field95, false, var1);
        } else if (arg0 == 11) {
            class76.method2883(field1996, field95, false, 4);
        } else if (arg0 == 50) {
            class76.method3074("", "Updating date of birth...", "");
            class76.method2883(field1996, field95, false, 7);
        } else {
            class76.method887();
        }
        client.field508 = arg0;
    }

    @ObfuscatedName("of.ah(ILdd;ZB)I")
    public static int method6631(int arg0, class79 arg1, boolean arg2) {
        class347 var3 = field4415.method5742(class71.field851[--field1469]);
        if (arg0 == 2600) {
            class71.field851[++field1469 - 1] = var3.field3795;
            return 1;
        } else if (arg0 == 2601) {
            class71.field851[++field1469 - 1] = var3.field3724;
            return 1;
        } else if (arg0 == 2602) {
            class71.field852[++field2300 - 1] = var3.field3765;
            return 1;
        } else if (arg0 == 2603) {
            class71.field851[++field1469 - 1] = var3.field3725;
            return 1;
        } else if (arg0 == 2604) {
            class71.field851[++field1469 - 1] = var3.field3709;
            return 1;
        } else if (arg0 == 2605) {
            class71.field851[++field1469 - 1] = var3.field3757;
            return 1;
        } else if (arg0 == 2606) {
            class71.field851[++field1469 - 1] = var3.field3754;
            return 1;
        } else if (arg0 == 2607) {
            class71.field851[++field1469 - 1] = var3.field3756;
            return 1;
        } else if (arg0 == 2608) {
            class71.field851[++field1469 - 1] = var3.field3755;
            return 1;
        } else if (arg0 == 2609) {
            class71.field851[++field1469 - 1] = var3.field3733;
            return 1;
        } else if (arg0 == 2610) {
            class71.field851[++field1469 - 1] = var3.field3734;
            return 1;
        } else if (arg0 == 2611) {
            class71.field851[++field1469 - 1] = var3.field3842;
            return 1;
        } else if (arg0 == 2612) {
            class71.field851[++field1469 - 1] = var3.field3728;
            return 1;
        } else if (arg0 == 2613) {
            class71.field851[++field1469 - 1] = var3.field3732.method34();
            return 1;
        } else if (arg0 == 2614) {
            class71.field851[++field1469 - 1] = var3.field3762 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class340 var4 = var3.method6123();
                class71.field851[++field1469 - 1] = var4 == null ? 0 : var4.field3624;
            }
            if (arg0 == 2618) {
                class340 var5 = var3.method6123();
                class71.field851[++field1469 - 1] = var5 == null ? 0 : var5.field3620;
                return 1;
            } else if (arg0 == 2619) {
                class345 var6 = var3.method6094();
                class71.field852[++field2300 - 1] = var6 == null ? "" : var6.method5958().method6955();
                return 1;
            } else if (arg0 == 2620) {
                class340 var7 = var3.method6123();
                class71.field851[++field1469 - 1] = var7 == null ? 0 : var7.field3621;
                return 1;
            } else if (arg0 == 2621) {
                class345 var8 = var3.method6094();
                class71.field851[++field1469 - 1] = var8 == null ? 0 : var8.method5846();
                return 1;
            } else if (arg0 == 2622) {
                class345 var9 = var3.method6094();
                class71.field851[++field1469 - 1] = var9 == null ? 0 : var9.method5870();
                return 1;
            } else if (arg0 == 2623) {
                class345 var10 = var3.method6094();
                class71.field851[++field1469 - 1] = var10 == null ? 0 : var10.method5871();
                return 1;
            } else if (arg0 == 2624) {
                class345 var11 = var3.method6094();
                class71.field851[++field1469 - 1] = var11 != null && var11.method5862() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class345 var12 = var3.method6094();
                class71.field851[++field1469 - 1] = var12 != null && var12.method6066() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class345 var13 = var3.method6094();
                class71.field852[++field2300 - 1] = var13 == null ? "" : var13.method5861().method7222();
                return 1;
            } else if (arg0 == 2627) {
                class345 var14 = var3.method6094();
                int var15 = var14 == null ? 0 : var14.method5925();
                int var16 = var14 == null ? 0 : var14.method5865();
                class71.field851[++field1469 - 1] = Math.min(var15, var16);
                class71.field851[++field1469 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class345 var17 = var3.method6094();
                class71.field851[++field1469 - 1] = var17 == null ? 0 : var17.method5865();
                return 1;
            } else if (arg0 == 2629) {
                class345 var18 = var3.method6094();
                class71.field851[++field1469 - 1] = var18 == null ? 0 : var18.method5873();
                return 1;
            } else if (arg0 == 2630) {
                class345 var19 = var3.method6094();
                class71.field851[++field1469 - 1] = var19 == null ? 0 : var19.method6057();
                return 1;
            } else if (arg0 == 2631) {
                class345 var20 = var3.method6094();
                class71.field851[++field1469 - 1] = var20 == null ? 0 : var20.method5874();
                return 1;
            } else if (arg0 == 2632) {
                class345 var21 = var3.method6094();
                class71.field851[++field1469 - 1] = var21 == null ? 0 : var21.method5987();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method6118();
                class71.field851[field1469 - 1] = var22 == null ? 0 : var22.method389(class71.field851[field1469 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method6118();
                class71.field851[field1469 - 1] = var23 == null ? 0 : var23.method390((char) class71.field851[field1469 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("ht.is(I)V")
    public static final void method3461() {
        client.field561.method2738();
        client.method5430();
        field493.method4880();
        for (int var0 = 0; var0 < 4; var0++) {
            client.field572[var0].method4083();
        }
        client.field609.method4040();
        System.gc();
        class320.method2387(0, 0);
        class320.method8258();
        client.field676 = false;
        class70.method4589();
        method2960(10);
        class218.method3348().method3945();
        class218.method3348().method3946();
    }

    @ObfuscatedName("jo.ia(I)J")
    public static long method4573() {
        return client.field510;
    }

    @ObfuscatedName("hc.ix(ZI)V")
    public static final void method3548(boolean arg0) {
        if (arg0) {
            client.field576 = class76.field914 ? class125.field1471 : class125.field1475;
        } else {
            client.field576 = field1155.method2458(class76.field904) ? class125.field1473 : class125.field1472;
        }
    }

    @ObfuscatedName("bb.bk(ILdd;ZI)I")
    public static int method834(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = class71.field851[--field1469];
            class71.field851[++field1469 - 1] = client.field790[var3].method6571();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = class71.field851[--field1469];
            class71.field851[++field1469 - 1] = client.field790[var4].field4429;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = class71.field851[--field1469];
            class71.field851[++field1469 - 1] = client.field790[var5].field4427;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = class71.field851[--field1469];
            class71.field851[++field1469 - 1] = client.field790[var6].field4428;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = class71.field851[--field1469];
            class71.field851[++field1469 - 1] = client.field790[var7].field4426;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = class71.field851[--field1469];
            class71.field851[++field1469 - 1] = client.field790[var8].field4430;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = class71.field851[--field1469];
            int var10 = client.field790[var9].method6570();
            class71.field851[++field1469 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = class71.field851[--field1469];
            int var12 = client.field790[var11].method6570();
            class71.field851[++field1469 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = class71.field851[--field1469];
            int var14 = client.field790[var13].method6570();
            class71.field851[++field1469 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = class71.field851[--field1469];
            int var16 = client.field790[var15].method6570();
            class71.field851[++field1469 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = class71.field851[--field1469] == 1;
            if (field4412 != null) {
                field4412.method6512(class377.field4404, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = class71.field851[--field1469] == 1;
            if (field4412 != null) {
                field4412.method6512(class377.field4403, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            field1469 -= 2;
            boolean var19 = class71.field851[field1469] == 1;
            boolean var20 = class71.field851[field1469 + 1] == 1;
            if (field4412 != null) {
                client.field791.field492 = var20;
                field4412.method6512(client.field791, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = class71.field851[--field1469] == 1;
            if (field4412 != null) {
                field4412.method6512(class377.field4401, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = class71.field851[--field1469] == 1;
            if (field4412 != null) {
                field4412.method6512(class377.field4402, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            class71.field851[++field1469 - 1] = field4412 == null ? 0 : field4412.field4405.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = class71.field851[--field1469];
            class383 var24 = (class383) field4412.field4405.get(var23);
            class71.field851[++field1469 - 1] = var24.field4420;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = class71.field851[--field1469];
            class383 var26 = (class383) field4412.field4405.get(var25);
            class71.field852[++field2300 - 1] = var26.method6560();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = class71.field851[--field1469];
            class383 var28 = (class383) field4412.field4405.get(var27);
            class71.field852[++field2300 - 1] = var28.method6559();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = class71.field851[--field1469];
            class383 var30 = (class383) field4412.field4405.get(var29);
            long var31 = method2852() - field75 - var30.field4421;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            class71.field852[++field2300 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = class71.field851[--field1469];
            class383 var38 = (class383) field4412.field4405.get(var37);
            class71.field851[++field1469 - 1] = var38.field4422.field4428;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = class71.field851[--field1469];
            class383 var40 = (class383) field4412.field4405.get(var39);
            class71.field851[++field1469 - 1] = var40.field4422.field4427;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = class71.field851[--field1469];
            class383 var42 = (class383) field4412.field4405.get(var41);
            class71.field851[++field1469 - 1] = var42.field4422.field4429;
            return 1;
        } else if (arg0 == 3939) {
            int var43 = class71.field851[--field1469];
            class71.field851[++field1469 - 1] = class203.method5762(var43).field2192 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mg.iu(B)V")
    public static final void method5468() {
        for (int var0 = 0; var0 < client.field754; var0++) {
            int var10002 = client.field549[var0]--;
            if (client.field549[var0] >= -10) {
                class40 var2 = client.field631[var0];
                if (var2 == null) {
                    class40 var10000 = (class40) null;
                    var2 = class40.method769(field4845, client.field755[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    client.field549[var0] += var2.method777();
                    client.field631[var0] = var2;
                }
                if (client.field549[var0] < 0) {
                    int var9;
                    if (client.field758[var0] == 0) {
                        var9 = field1155.method2448();
                    } else {
                        int var3 = (client.field758[var0] & 0xFF) * 128;
                        int var4 = client.field758[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - field133.field1232;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = client.field758[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - field133.field1173;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            client.field549[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * field1155.method2450() / var3;
                    }
                    if (var9 > 0) {
                        class41 var10 = var2.method770().method782(field1434);
                        class49 var11 = class49.method892(var10, 100, var9);
                        var11.method931(client.field756[var0] - 1);
                        field1710.method732(var11);
                    }
                    client.field549[var0] = -100;
                }
            } else {
                client.field754--;
                for (int var1 = var0; var1 < client.field754; var1++) {
                    client.field755[var1] = client.field755[var1 + 1];
                    client.field631[var1] = client.field631[var1 + 1];
                    client.field756[var1] = client.field756[var1 + 1];
                    client.field549[var1] = client.field549[var1 + 1];
                    client.field758[var1] = client.field758[var1 + 1];
                }
                var0--;
            }
        }
        if (!client.field676) {
            return;
        }
        boolean var12;
        if (!class320.field3463.isEmpty()) {
            var12 = true;
        } else if (class320.field3460.isEmpty() || class320.field3460.get(0) == null || ((class332) class320.field3460.get(0)).field3583 == null) {
            var12 = false;
        } else {
            var12 = ((class332) class320.field3460.get(0)).field3583.method5511();
        }
        if (var12) {
            return;
        }
        if (field1155.method2496() != 0) {
            boolean var13 = !class320.field3467.isEmpty();
            if (var13) {
                class320.method4026(field2588, field1155.method2496());
            }
        }
        client.field676 = false;
    }

    @ObfuscatedName("ox.iv(IIII)V")
    public static void method6326(int arg0, int arg1, int arg2) {
        if (field1155.method2448() == 0 || arg1 == 0 || client.field754 >= 50) {
            return;
        }
        client.field755[client.field754] = arg0;
        client.field756[client.field754] = arg1;
        client.field549[client.field754] = arg2;
        client.field631[client.field754] = null;
        client.field758[client.field754] = 0;
        client.field754++;
    }

    @ObfuscatedName("ps.ir(III)V")
    public static void method6899(int arg0, int arg1) {
        if (field1155.method2496() != 0 && arg0 != -1) {
            ArrayList var2 = new ArrayList();
            var2.add(new class332(field2628, arg0, 0, field1155.method2496(), false));
            class320.method2427(var2, 0, 0, 0, 0, true);
            client.field676 = true;
        }
    }

    @ObfuscatedName("nq.jx(I)V")
    public static void method6275() {
        if (client.field561 == null || client.field561.field1404 == null) {
            return;
        }
        class311 var0 = class311.method7979(class309.field3186, client.field561.field1404);
        var0.field3279.method8699(client.method3078());
        var0.field3279.method8737(field5134);
        var0.field3279.method8737(field199);
        client.field561.method2736(var0);
    }

    @ObfuscatedName("bd.ki(I)Lpu;")
    public static class394 method396() {
        return client.field714;
    }

    @ObfuscatedName("gn.kn(III)I")
    public static int method3190(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (client.field643 - client.field775) * var2 / 100 + client.field775;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("aq.kh(IIIIIII)V")
    public static void method14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class394 var6 = client.field644[arg0][arg1][arg2];
        if (var6 == null) {
            return;
        }
        for (class105 var7 = (class105) var6.method6670(); var7 != null; var7 = (class105) var6.method6665()) {
            if ((arg3 & 0x7FFF) == var7.field1338 && var7.field1335 == arg4) {
                var7.field1335 = arg5;
                break;
            }
        }
        client.method3008(arg0, arg1, arg2);
    }

    @ObfuscatedName("fx.mg(I)V")
    public static final void method2986() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < client.field648 - 1; var1++) {
                if (client.field651[var1] < 1000 && client.field651[var1 + 1] > 1000) {
                    String var2 = client.field795[var1];
                    client.field795[var1] = client.field795[var1 + 1];
                    client.field795[var1 + 1] = var2;
                    String var3 = client.field771[var1];
                    client.field771[var1] = client.field771[var1 + 1];
                    client.field771[var1 + 1] = var3;
                    int var4 = client.field651[var1];
                    client.field651[var1] = client.field651[var1 + 1];
                    client.field651[var1 + 1] = var4;
                    int var5 = client.field649[var1];
                    client.field649[var1] = client.field649[var1 + 1];
                    client.field649[var1 + 1] = var5;
                    int var6 = client.field650[var1];
                    client.field650[var1] = client.field650[var1 + 1];
                    client.field650[var1 + 1] = var6;
                    int var7 = client.field652[var1];
                    client.field652[var1] = client.field652[var1 + 1];
                    client.field652[var1 + 1] = var7;
                    int var8 = client.field688[var1];
                    client.field688[var1] = client.field688[var1 + 1];
                    client.field688[var1 + 1] = var8;
                    boolean var9 = client.field656[var1];
                    client.field656[var1] = client.field656[var1 + 1];
                    client.field656[var1 + 1] = var9;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("oj.mx(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method6628(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        client.method6278(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("hf.my(II)Ljava/lang/String;")
    public static String method3514(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (client.field795[arg0].length() > 0) {
            return client.field771[arg0] + class367.field4130 + client.field795[arg0];
        } else {
            return client.field771[arg0];
        }
    }

    @ObfuscatedName("qp.mc(Ldn;IIIB)V")
    public static final void method7417(class92 arg0, int arg1, int arg2, int arg3) {
        if (field133 == arg0 || client.field648 >= 400) {
            return;
        }
        String var4;
        if (arg0.field1107 == 0) {
            var4 = arg0.field1103[0] + arg0.field1117 + arg0.field1103[1] + client.method5471(arg0.field1104, field133.field1104) + " " + class102.field1312 + class367.field4146 + arg0.field1104 + class102.field1314 + arg0.field1103[2];
        } else {
            var4 = arg0.field1103[0] + arg0.field1117 + arg0.field1103[1] + " " + class102.field1312 + class367.field4147 + arg0.field1107 + class102.field1314 + arg0.field1103[2];
        }
        if (client.field741 == 1) {
            method6628(class367.field4140, client.field665 + " " + class102.field1310 + " " + class102.method3860(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!client.field722) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (client.field634[var5] != null) {
                    short var6 = 0;
                    if (client.field634[var5].equalsIgnoreCase(class367.field4058)) {
                        if (client.field798 == class104.field1331) {
                            continue;
                        }
                        if (client.field798 == class104.field1329 || client.field798 == class104.field1328 && arg0.field1104 > field133.field1104) {
                            var6 = 2000;
                        }
                        if (field133.field1118 == 0 || arg0.field1118 == 0) {
                            if (client.field798 == class104.field1332 && arg0.method2331()) {
                                var6 = 2000;
                            }
                        } else if (field133.field1118 == arg0.field1118) {
                            var6 = 2000;
                        } else {
                            var6 = 0;
                        }
                    } else if (client.field635[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = client.field633[var5] + var6;
                    method6628(client.field634[var5], class102.method3860(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((field432 & 0x8) == 8) {
            method6628(client.field669, client.field670 + " " + class102.field1310 + " " + class102.method3860(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < client.field648; var9++) {
            if (client.field651[var9] == 23) {
                client.field795[var9] = class102.method3860(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("qv.mn(Lnn;IIIIIII)V")
    public static final void method7428(class347 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (client.field582) {
            client.field583 = 32;
        } else {
            client.field583 = 0;
        }
        client.field582 = false;
        if (class36.field230 == 1 || !field320 && class36.field230 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3724 -= 4;
                method5074(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3724 += 4;
                method5074(arg0);
            } else if (arg5 >= arg1 - client.field583 && arg5 < client.field583 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3724 = (arg4 - arg3) * var8 / var9;
                method5074(arg0);
                client.field582 = true;
            }
        }
        if (client.field712 == 0) {
            return;
        }
        int var10 = arg0.field3778;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3724 += client.field712 * 45;
            method5074(arg0);
        }
    }

    @ObfuscatedName("kl.nc(Lnn;I)V")
    public static void method5074(class347 arg0) {
        if (arg0 != null && client.field608 == arg0.field3847) {
            client.field721[arg0.field3846] = true;
        }
    }

    @ObfuscatedName("ug.oq(Lnn;IIIB)V")
    public static final void method8442(class347 arg0, int arg1, int arg2, int arg3) {
        class335 var4 = arg0.method6139(field4415, false);
        if (var4 == null) {
            return;
        }
        if (client.field752 < 3) {
            field3122.method9015(arg1, arg2, var4.field3594, var4.field3593, 25, 25, client.field580, 256, var4.field3595, var4.field3592);
        } else {
            class541.method8896(arg1, arg2, 0, var4.field3595, var4.field3592);
        }
    }

    @ObfuscatedName("ps.od(Lnn;I)I")
    public static int method6900(class347 arg0) {
        class488 var1 = (class488) client.field718.method8301(((long) arg0.field3701 << 32) + (long) arg0.field3721);
        return var1 == null ? arg0.field3698 : var1.field4887;
    }

    @ObfuscatedName("cl.of(Lnn;I)Z")
    public static boolean method1126(class347 arg0) {
        return arg0.field3722;
    }

    @ObfuscatedName("ee.ps(IB)V")
    public static void method2809(int arg0) {
        if (client.field533 != arg0) {
            client.field533 = arg0;
        }
    }
}
