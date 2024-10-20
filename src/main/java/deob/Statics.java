package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("bu.i")
    public static int field1015;

    @ObfuscatedName("bu.df")
    public static class306 field1016;

    @ObfuscatedName("bu.rb")
    public static int field1018;

    @ObfuscatedName("bw.f")
    public static class145 field1028;

    @ObfuscatedName("bw.k")
    public static class72[] field1032;

    @ObfuscatedName("br.lf")
    public static class218 field1060;

    @ObfuscatedName("bk.ef")
    public static String field1069;

    @ObfuscatedName("bf.bb")
    public static class325[] field1074;

    @ObfuscatedName("bf.ed")
    public static int[] field1075;

    @ObfuscatedName("bv.kt")
    public static int field1093;

    @ObfuscatedName("be.e")
    public static int[] field1096;

    @ObfuscatedName("be.p")
    public static class199 field1100;

    @ObfuscatedName("a.dk")
    public static class236 field111;

    @ObfuscatedName("be.r")
    public static class218 field1112;

    @ObfuscatedName("be.hr")
    public static int field1113;

    @ObfuscatedName("cr.x")
    public static class296 field1130;

    @ObfuscatedName("cf.i")
    public static class326 field1136;

    @ObfuscatedName("cj.nd")
    public static int field1144;

    @ObfuscatedName("cj.ql")
    public static class106 field1145;

    @ObfuscatedName("cj.ge")
    public static byte[][] field1146;

    @ObfuscatedName("cn.x")
    public static int field1161;

    @ObfuscatedName("cy.qj")
    public static int field1167;

    @ObfuscatedName("ct.qz")
    public static class113 field1178;

    @ObfuscatedName("cq.m")
    public static class325 field1179;

    @ObfuscatedName("a.sy")
    public static class74 field118;

    @ObfuscatedName("cq.w")
    public static boolean field1180;

    @ObfuscatedName("cq.p")
    public static class325[] field1182;

    @ObfuscatedName("cq.f")
    public static class325[] field1184;

    @ObfuscatedName("cq.r")
    public static class325 field1186;

    @ObfuscatedName("cq.k")
    public static class325 field1195;

    @ObfuscatedName("a.x")
    public static class109 field120;

    @ObfuscatedName("cq.bj")
    public static class325 field1207;

    @ObfuscatedName("j.g")
    public static class42 field122;

    @ObfuscatedName("ch.i")
    public static int field1243;

    @ObfuscatedName("ch.c")
    public static class325 field1244;

    @ObfuscatedName("co.f")
    public static class108 field1247;

    @ObfuscatedName("co.gw")
    public static int[] field1249;

    @ObfuscatedName("ca.es")
    public static int field1267;

    @ObfuscatedName("cb.l")
    public static class234 field1277;

    @ObfuscatedName("j.ji")
    public static class218 field128;

    @ObfuscatedName("cu.x")
    public static int[] field1302;

    @ObfuscatedName("cs.gr")
    public static int field1307;

    @ObfuscatedName("cv.az")
    public static class320 field1326;

    @ObfuscatedName("cv.qm")
    public static int field1328;

    @ObfuscatedName("ce.co")
    public static int field1339;

    @ObfuscatedName("ci.d")
    public static float[] field1356;

    @ObfuscatedName("ci.y")
    public static boolean[] field1361;

    @ObfuscatedName("ci.b")
    public static byte[] field1362;

    @ObfuscatedName("ci.c")
    public static int field1364;

    @ObfuscatedName("ci.m")
    public static int field1366;

    @ObfuscatedName("ci.x")
    public static class105[] field1368;

    @ObfuscatedName("ci.r")
    public static class112[] field1369;

    @ObfuscatedName("ci.u")
    public static class101[] field1370;

    @ObfuscatedName("ci.g")
    public static int[] field1372;

    @ObfuscatedName("ci.av")
    public static float[] field1374;

    @ObfuscatedName("ci.f")
    public static int field1376;

    @ObfuscatedName("ci.i")
    public static int field1377;

    @ObfuscatedName("ci.al")
    public static float[] field1378;

    @ObfuscatedName("ci.n")
    public static float[] field1379;

    @ObfuscatedName("ci.s")
    public static float[] field1380;

    @ObfuscatedName("ci.z")
    public static float[] field1381;

    @ObfuscatedName("ci.as")
    public static float[] field1384;

    @ObfuscatedName("ci.aw")
    public static int[] field1385;

    @ObfuscatedName("ci.ad")
    public static int[] field1386;

    @ObfuscatedName("ci.v")
    public static class117[] field1387;

    @ObfuscatedName("dr.f")
    public static int[] field1404;

    @ObfuscatedName("dr.m")
    public static int[] field1405;

    @ObfuscatedName("dr.u")
    public static boolean[] field1406;

    @ObfuscatedName("dn.c")
    public static int field1408;

    @ObfuscatedName("df.gg")
    public static class326[] field1443;

    @ObfuscatedName("dz.x")
    public static class325 field1467;

    @ObfuscatedName("dy.i")
    public static float field1492;

    @ObfuscatedName("dy.c")
    public static int field1493;

    @ObfuscatedName("do.y")
    public static int field1540;

    @ObfuscatedName("o.el")
    public static int field156;

    @ObfuscatedName("db.v")
    public static int[] field1629;

    @ObfuscatedName("dv.dv")
    public static class236 field1648;

    @ObfuscatedName("dm.bc")
    public static int field1673;

    @ObfuscatedName("dm.bn")
    public static int field1728;

    @ObfuscatedName("dm.bx")
    public static int field1732;

    @ObfuscatedName("di.u")
    public static int field1742;

    @ObfuscatedName("di.l")
    public static int field1746;

    @ObfuscatedName("di.b")
    public static int field1747;

    @ObfuscatedName("di.fq")
    public static int field1748;

    @ObfuscatedName("n.sd")
    public static class332 field175;

    @ObfuscatedName("di.i")
    public static boolean[] field1756;

    @ObfuscatedName("di.f")
    public static class234 field1757;

    @ObfuscatedName("ev.x")
    public static int field1775;

    @ObfuscatedName("ev.r")
    public static int field1776;

    @ObfuscatedName("ev.y")
    public static int field1777;

    @ObfuscatedName("ev.t")
    public static int field1778;

    @ObfuscatedName("ev.g")
    public static int field1779;

    @ObfuscatedName("ev.a")
    public static int field1780;

    @ObfuscatedName("ev.j")
    public static int field1781;

    @ObfuscatedName("ev.n")
    public static class140 field1782;

    @ObfuscatedName("ev.v")
    public static int field1789;

    @ObfuscatedName("n.gs")
    public static int[] field179;

    @ObfuscatedName("ej.ei")
    public static int field1801;

    @ObfuscatedName("er.av")
    public static int field1802;

    @ObfuscatedName("er.bl")
    public static int field1806;

    @ObfuscatedName("er.g")
    public static int field1809;

    @ObfuscatedName("er.s")
    public static int field1817;

    @ObfuscatedName("er.a")
    public static int field1819;

    @ObfuscatedName("er.j")
    public static int field1820;

    @ObfuscatedName("er.t")
    public static int field1821;

    @ObfuscatedName("er.n")
    public static int field1824;

    @ObfuscatedName("er.d")
    public static int field1825;

    @ObfuscatedName("er.z")
    public static int field1827;

    @ObfuscatedName("er.al")
    public static int field1828;

    @ObfuscatedName("d.ld")
    public static int field183;

    @ObfuscatedName("er.as")
    public static int field1830;

    @ObfuscatedName("er.aw")
    public static int field1831;

    @ObfuscatedName("er.bj")
    public static int field1835;

    @ObfuscatedName("er.o")
    public static int field1850;

    @ObfuscatedName("er.h")
    public static int field1852;

    @ObfuscatedName("er.bx")
    public static boolean[][] field1862;

    @ObfuscatedName("er.bo")
    public static int field1863;

    @ObfuscatedName("er.bb")
    public static int field1864;

    @ObfuscatedName("er.bs")
    public static int field1865;

    @ObfuscatedName("er.bd")
    public static int field1868;

    @ObfuscatedName("eu.i")
    public static boolean field1869;

    @ObfuscatedName("eu.b")
    public static short[] field1871;

    @ObfuscatedName("eu.k")
    public static int field1872;

    @ObfuscatedName("eo.fz")
    public static long field1873;

    @ObfuscatedName("eo.ev")
    public static class236 field1875;

    @ObfuscatedName("em.sx")
    public static class334 field1876;

    @ObfuscatedName("d.ew")
    public static SecureRandom field188;

    @ObfuscatedName("en.v")
    public static int[][][] field1888;

    @ObfuscatedName("d.nc")
    public static class218[] field189;

    @ObfuscatedName("ek.i")
    public static int[] field1896;

    @ObfuscatedName("k.ds")
    public static class236 field19;

    @ObfuscatedName("eg.gy")
    public static class326[] field1916;

    @ObfuscatedName("d.fp")
    public static class296 field194;

    @ObfuscatedName("ea.db")
    public static class236 field1972;

    @ObfuscatedName("ea.ga")
    public static class326 field1973;

    @ObfuscatedName("ec.u")
    public static class204 field1982;

    @ObfuscatedName("fi.ax")
    public static String field1987;

    @ObfuscatedName("fk.gm")
    public static class326[] field1990;

    @ObfuscatedName("fg.m")
    public static boolean field1993;

    @ObfuscatedName("fz.er")
    public static class313 field1996;

    @ObfuscatedName("w.fx")
    public static int field2;

    @ObfuscatedName("k.iz")
    public static int field20;

    @ObfuscatedName("fs.w")
    public static String field2029;

    @ObfuscatedName("fs.q")
    public static String field2030;

    @ObfuscatedName("ff.p")
    public static File field2039;

    @ObfuscatedName("ff.v")
    public static class343[] field2042;

    @ObfuscatedName("ff.g")
    public static String[] field2044;

    @ObfuscatedName("ff.dh")
    public static class236 field2050;

    @ObfuscatedName("fy.w")
    public static File field2051;

    @ObfuscatedName("fy.l")
    public static boolean field2054;

    @ObfuscatedName("fy.fu")
    public static class296 field2055;

    @ObfuscatedName("fy.fj")
    public static class294 field2057;

    @ObfuscatedName("fu.oi")
    public static class91 field2058;

    @ObfuscatedName("fv.k")
    public static int field2079;

    @ObfuscatedName("fo.k")
    public static int field2089;

    @ObfuscatedName("fo.gq")
    public static class326[] field2097;

    @ObfuscatedName("fl.pi")
    public static class326 field2103;

    @ObfuscatedName("z.am")
    public static int field213;

    @ObfuscatedName("al.bo")
    public static String field214;

    @ObfuscatedName("al.hc")
    public static int field228;

    @ObfuscatedName("l.gu")
    public static class134 field23;

    @ObfuscatedName("gx.ng")
    public static int field2306;

    @ObfuscatedName("gh.a")
    public static String[] field2310;

    @ObfuscatedName("av.et")
    public static class236 field233;

    @ObfuscatedName("gb.bi")
    public static class230 field2338;

    @ObfuscatedName("av.af")
    public static client field234;

    @ObfuscatedName("ge.c")
    public static byte[][][] field2344;

    @ObfuscatedName("gu.qb")
    public static int field2346;

    @ObfuscatedName("gu.eg")
    public static int field2359;

    @ObfuscatedName("gu.qk")
    public static class106 field2362;

    @ObfuscatedName("gj.dg")
    public static class166 field2364;

    @ObfuscatedName("gd.dl")
    public static long field2383;

    @ObfuscatedName("gk.fb")
    public static int field2390;

    @ObfuscatedName("l.b")
    public static class326 field24;

    @ObfuscatedName("gf.w")
    public static class234 field2401;

    @ObfuscatedName("gf.e")
    public static class234 field2402;

    @ObfuscatedName("gf.b")
    public static int field2404;

    @ObfuscatedName("gf.f")
    public static int field2405;

    @ObfuscatedName("gf.dz")
    public static class236 field2406;

    @ObfuscatedName("gf.q")
    public static class234 field2407;

    @ObfuscatedName("gf.i")
    public static int field2408;

    @ObfuscatedName("gq.ap")
    public static class323 field2487;

    @ObfuscatedName("aw.bh")
    public static class231 field249;

    @ObfuscatedName("gn.u")
    public static class234 field2499;

    @ObfuscatedName("gn.gh")
    public static int[] field2502;

    @ObfuscatedName("gv.x")
    public static class218 field2508;

    @ObfuscatedName("gv.ch")
    public static char field2509;

    @ObfuscatedName("hu.q")
    public static class210 field2516;

    @ObfuscatedName("hu.qw")
    public static int field2517;

    @ObfuscatedName("he.p")
    public static int[] field2524;

    @ObfuscatedName("hv.fy")
    public static class296 field2530;

    @ObfuscatedName("aw.du")
    public static class236 field254;

    @ObfuscatedName("hy.dy")
    public static class236 field2545;

    @ObfuscatedName("hy.x")
    public static boolean field2546;

    @ObfuscatedName("hd.m")
    public static class234 field2548;

    @ObfuscatedName("hd.b")
    public static int[] field2549;

    @ObfuscatedName("hj.b")
    public static class218[][] field2557;

    @ObfuscatedName("hj.c")
    public static class234 field2558;

    @ObfuscatedName("aw.gb")
    public static int[][] field256;

    @ObfuscatedName("ad.rj")
    public static int field260;

    @ObfuscatedName("ad.bs")
    public static class325 field265;

    @ObfuscatedName("ad.ks")
    public static int field268;

    @ObfuscatedName("ag.rx")
    public static int field269;

    @ObfuscatedName("hb.l")
    public static int field2708;

    @ObfuscatedName("ag.bc")
    public static class326[] field272;

    @ObfuscatedName("hr.ne")
    public static int field2743;

    @ObfuscatedName("hz.gz")
    public static class326[] field2747;

    @ObfuscatedName("hz.f")
    public static int field2748;

    @ObfuscatedName("ar.x")
    public static class100 field278;

    @ObfuscatedName("ar.dq")
    public static class236 field280;

    @ObfuscatedName("ar.sz")
    public static int field281;

    @ObfuscatedName("ar.i")
    public static byte[][][] field283;

    @ObfuscatedName("ar.lu")
    public static class218 field285;

    @ObfuscatedName("w.k")
    public static File field3;

    @ObfuscatedName("ae.mj")
    public static int field302;

    @ObfuscatedName("hf.bo")
    public static class325[] field3063;

    @ObfuscatedName("hw.r")
    public static class233 field3072;

    @ObfuscatedName("hw.pr")
    public static class311 field3073;

    @ObfuscatedName("ae.de")
    public static class236 field308;

    @ObfuscatedName("hn.n")
    public static String field3096;

    @ObfuscatedName("ae.c")
    public static short[] field310;

    @ObfuscatedName("ht.f")
    public static int[] field3104;

    @ObfuscatedName("hq.az")
    public static Image field3126;

    @ObfuscatedName("ir.k")
    public static Thread field3149;

    @ObfuscatedName("ii.e")
    public static long field3170;

    @ObfuscatedName("ii.q")
    public static class306 field3177;

    @ObfuscatedName("ih.c")
    public static int[] field3190;

    @ObfuscatedName("ih.ah")
    public static int field3192;

    @ObfuscatedName("if.g")
    public static int field3193;

    @ObfuscatedName("ig.bs")
    public static int field3200;

    @ObfuscatedName("ig.q")
    public static class234 field3201;

    @ObfuscatedName("ik.w")
    public static int field3204;

    @ObfuscatedName("ik.q")
    public static class234 field3205;

    @ObfuscatedName("ik.l")
    public static class325 field3208;

    @ObfuscatedName("ik.y")
    public static class301 field3210;

    @ObfuscatedName("iw.w")
    public static class242[] field3220;

    @ObfuscatedName("iw.q")
    public static class234 field3226;

    @ObfuscatedName("id.q")
    public static class234 field3234;

    @ObfuscatedName("ib.q")
    public static class234 field3248;

    @ObfuscatedName("ib.j")
    public static int field3249;

    @ObfuscatedName("ic.q")
    public static class234 field3256;

    @ObfuscatedName("im.e")
    public static int field3264;

    @ObfuscatedName("im.q")
    public static class234 field3275;

    @ObfuscatedName("ip.w")
    public static class234 field3281;

    @ObfuscatedName("ip.q")
    public static class234 field3282;

    @ObfuscatedName("ao.bp")
    public static String field329;

    @ObfuscatedName("il.i")
    public static short[][] field3292;

    @ObfuscatedName("il.km")
    public static int field3293;

    @ObfuscatedName("ia.q")
    public static class234 field3299;

    @ObfuscatedName("ao.oe")
    public static class169 field330;

    @ObfuscatedName("ia.s")
    public static int[] field3300;

    @ObfuscatedName("ie.q")
    public static class234 field3308;

    @ObfuscatedName("ie.s")
    public static int field3309;

    @ObfuscatedName("in.q")
    public static class234 field3310;

    @ObfuscatedName("iv.q")
    public static class234 field3315;

    @ObfuscatedName("iv.ez")
    public static int field3325;

    @ObfuscatedName("io.e")
    public static class234 field3327;

    @ObfuscatedName("io.q")
    public static class234 field3328;

    @ObfuscatedName("at.ae")
    public static class320 field333;

    @ObfuscatedName("io.w")
    public static class234 field3344;

    @ObfuscatedName("iy.e")
    public static class234 field3352;

    @ObfuscatedName("ac.sk")
    public static short[] field337;

    @ObfuscatedName("iy.w")
    public static class234 field3396;

    @ObfuscatedName("iq.b")
    public static class234 field3406;

    @ObfuscatedName("ac.gl")
    public static class326[] field343;

    @ObfuscatedName("iq.c")
    public static int field3456;

    @ObfuscatedName("iq.di")
    public static class236 field3458;

    @ObfuscatedName("ij.w")
    public static class234 field3465;

    @ObfuscatedName("ij.q")
    public static class234 field3485;

    @ObfuscatedName("ap.ch")
    public static class64 field349;

    @ObfuscatedName("ij.bl")
    public static class325 field3491;

    @ObfuscatedName("ij.do")
    public static class236 field3501;

    @ObfuscatedName("it.sh")
    public static int field3503;

    @ObfuscatedName("it.q")
    public static class234 field3506;

    @ObfuscatedName("ap.l")
    public static int field351;

    @ObfuscatedName("is.w")
    public static class234 field3517;

    @ObfuscatedName("is.e")
    public static class234 field3518;

    @ObfuscatedName("is.q")
    public static class234 field3528;

    @ObfuscatedName("is.ff")
    public static class144 field3535;

    @ObfuscatedName("ap.bm")
    public static class339 field354;

    @ObfuscatedName("jn.ai")
    public static boolean field3558;

    @ObfuscatedName("ji.b")
    public static byte[][][] field3562;

    @ObfuscatedName("jp.fm")
    public static class306 field3564;

    @ObfuscatedName("aq.lr")
    public static int field360;

    @ObfuscatedName("jo.fn")
    public static class166 field3629;

    @ObfuscatedName("jo.v")
    public static class73 field3632;

    @ObfuscatedName("jz.ss")
    public static long field3633;

    @ObfuscatedName("jx.gi")
    public static class325[] field3661;

    @ObfuscatedName("ka.w")
    public static class234 field3666;

    @ObfuscatedName("ku.r")
    public static int[] field3690;

    @ObfuscatedName("kz.bb")
    public static String field3696;

    @ObfuscatedName("kz.jp")
    public static class218 field3698;

    @ObfuscatedName("kn.f")
    public static class325[] field3721;

    @ObfuscatedName("kx.hd")
    public static int field3728;

    @ObfuscatedName("aa.jy")
    public static int field373;

    @ObfuscatedName("aa.kl")
    public static int field374;

    @ObfuscatedName("kr.b")
    public static int[] field3741;

    @ObfuscatedName("an.ak")
    public static GarbageCollectorMXBean field379;

    @ObfuscatedName("an.w")
    public static class234 field380;

    @ObfuscatedName("an.i")
    public static int[] field382;

    @ObfuscatedName("kt.go")
    public static int field3820;

    @ObfuscatedName("an.dx")
    public static class236 field383;

    @ObfuscatedName("an.hj")
    public static int field384;

    @ObfuscatedName("ln.aw")
    public static Font field3845;

    @ObfuscatedName("lq.e")
    public static int field3847;

    @ObfuscatedName("lb.av")
    public static int[] field3870;

    @ObfuscatedName("lb.aw")
    public static int field3872;

    @ObfuscatedName("lb.as")
    public static int field3876;

    @ObfuscatedName("lt.t")
    public static class301 field3883;

    @ObfuscatedName("ll.ex")
    public static int field3885;

    @ObfuscatedName("lm.e")
    public static int field3911;

    @ObfuscatedName("lm.q")
    public static int field3912;

    @ObfuscatedName("lm.c")
    public static byte[][] field3913;

    @ObfuscatedName("lm.w")
    public static int field3914;

    @ObfuscatedName("lm.l")
    public static int[] field3915;

    @ObfuscatedName("lm.k")
    public static int[] field3916;

    @ObfuscatedName("w.hb")
    public static int field4;

    @ObfuscatedName("ld.p")
    public static String[] field4033;

    @ObfuscatedName("ml.q")
    public static Applet field4065;

    @ObfuscatedName("ml.e")
    public static int field4066;

    @ObfuscatedName("ml.p")
    public static int field4067;

    @ObfuscatedName("b.jb")
    public static class120 field41;

    @ObfuscatedName("ak.pf")
    public static class286 field411;

    @ObfuscatedName("ak.qn")
    public static int field413;

    @ObfuscatedName("ak.ci")
    public static boolean field414;

    @ObfuscatedName("ak.q")
    public static long field417;

    @ObfuscatedName("am.fd")
    public static int field419;

    @ObfuscatedName("am.f")
    public static int field423;

    @ObfuscatedName("bz.u")
    public static class171 field448;

    @ObfuscatedName("bz.i")
    public static int field450;

    @ObfuscatedName("bz.q")
    public static class167 field464;

    @ObfuscatedName("i.d")
    public static int field47;

    @ObfuscatedName("i.c")
    public static int field49;

    @ObfuscatedName("e.w")
    public static long field5;

    @ObfuscatedName("i.pp")
    public static boolean field50;

    @ObfuscatedName("bi.ht")
    public static int field500;

    @ObfuscatedName("bg.rr")
    public static int field502;

    @ObfuscatedName("bg.p")
    public static byte[][][] field505;

    @ObfuscatedName("bg.k")
    public static byte[][][] field506;

    @ObfuscatedName("bg.l")
    public static byte[][][] field507;

    @ObfuscatedName("bg.u")
    public static int[] field508;

    @ObfuscatedName("bg.m")
    public static int[] field509;

    @ObfuscatedName("bg.c")
    public static int[][] field516;

    @ObfuscatedName("bh.rk")
    public static int field527;

    @ObfuscatedName("bh.m")
    public static int field528;

    @ObfuscatedName("bh.bx")
    public static class191 field529;

    @ObfuscatedName("bh.c")
    public static int field530;

    @ObfuscatedName("bm.qp")
    public static class99 field533;

    @ObfuscatedName("bm.bx")
    public static class325[] field534;

    @ObfuscatedName("bn.rz")
    public static class75 field547;

    @ObfuscatedName("bc.jk")
    public static class218 field550;

    @ObfuscatedName("bx.ac")
    public static String field567;

    @ObfuscatedName("bb.sr")
    public static class309 field574;

    @ObfuscatedName("bb.h")
    public static int field586;

    @ObfuscatedName("bb.o")
    public static String field587;

    @ObfuscatedName("bs.ix")
    public static int field595;

    @ObfuscatedName("bj.f")
    public static short[][] field605;

    @ObfuscatedName("bj.u")
    public static class325 field607;

    @ObfuscatedName("bj.gf")
    public static class326 field608;

    @ObfuscatedName("by.h")
    public static String field648;

    @ObfuscatedName("by.dm")
    public static class236 field651;

    @ObfuscatedName("client.js")
    public static class67 field658;

    @ObfuscatedName("f.ab")
    public static int field66;

    @ObfuscatedName("client.dc")
    public static class236 field684;

    @ObfuscatedName("client.dd")
    public static class236 field685;

    @ObfuscatedName("e.da")
    public static class236 field7;

    @ObfuscatedName("m.w")
    public static String field70;

    @ObfuscatedName("u.gv")
    public static class325[] field73;

    @ObfuscatedName("client.hl")
    public static int field730;

    @ObfuscatedName("u.l")
    public static class234 field77;

    @ObfuscatedName("u.hm")
    public static int field78;

    @ObfuscatedName("x.ad")
    public static FontMetrics field81;

    @ObfuscatedName("x.gn")
    public static class325[] field83;

    @ObfuscatedName("r.dp")
    public static class236 field90;

    @ObfuscatedName("r.gp")
    public static byte[][] field91;

    @ObfuscatedName("client.lv")
    public static class83 field917;

    @ObfuscatedName("bt.sw")
    public static class7 field943;

    @ObfuscatedName("bt.sq")
    public static class238 field945;

    @ObfuscatedName("v.i")
    public static ScheduledExecutorService field98;

    @ObfuscatedName("gd.q(IIIB)I")
    public static int method3354(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("cn.q(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lgu;B)I")
    public static int method1814(CharSequence arg0, CharSequence arg1, class191 arg2) {
        int var3 = arg0.length();
        int var4 = arg1.length();
        int var5 = 0;
        int var6 = 0;
        byte var7 = 0;
        byte var8 = 0;
        while (var5 - var7 < var3 || var6 - var8 < var4) {
            if (var5 - var7 >= var3) {
                return -1;
            }
            if (var6 - var8 >= var4) {
                return 1;
            }
            char var21;
            if (var7 == 0) {
                var21 = arg0.charAt(var5++);
            } else {
                var21 = (char) var7;
                boolean var22 = false;
            }
            char var23;
            if (var8 == 0) {
                var23 = arg1.charAt(var6++);
            } else {
                var23 = (char) var8;
                boolean var24 = false;
            }
            byte var25;
            if (var21 == 198) {
                var25 = 69;
            } else if (var21 == 230) {
                var25 = 101;
            } else if (var21 == 223) {
                var25 = 115;
            } else if (var21 == 338) {
                var25 = 69;
            } else if (var21 == 339) {
                var25 = 101;
            } else {
                var25 = 0;
            }
            var7 = var25;
            byte var26;
            if (var23 == 198) {
                var26 = 69;
            } else if (var23 == 230) {
                var26 = 101;
            } else if (var23 == 223) {
                var26 = 115;
            } else if (var23 == 338) {
                var26 = 69;
            } else if (var23 == 339) {
                var26 = 101;
            } else {
                var26 = 0;
            }
            var8 = var26;
            char var27 = class288.method3302(var21, arg2);
            char var28 = class288.method3302(var23, arg2);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return class288.method331(var29, arg2) - class288.method331(var30, arg2);
                }
            }
        }
        int var9 = Math.min(var3, var4);
        for (int var10 = 0; var10 < var9; var10++) {
            int var11;
            int var12;
            if (class191.field2348 == arg2) {
                var11 = var3 - 1 - var10;
                var12 = var4 - 1 - var10;
            } else {
                var12 = var10;
                var11 = var10;
            }
            char var13 = arg0.charAt(var11);
            char var14 = arg1.charAt(var12);
            if (var13 != var14 && Character.toUpperCase(var13) != Character.toUpperCase(var14)) {
                char var15 = Character.toLowerCase(var13);
                char var16 = Character.toLowerCase(var14);
                if (var15 != var16) {
                    return class288.method331(var15, arg2) - class288.method331(var16, arg2);
                }
            }
        }
        int var17 = var3 - var4;
        if (var17 != 0) {
            return var17;
        }
        for (int var18 = 0; var18 < var9; var18++) {
            char var19 = arg0.charAt(var18);
            char var20 = arg1.charAt(var18);
            if (var19 != var20) {
                return class288.method331(var19, arg2) - class288.method331(var20, arg2);
            }
        }
        return 0;
    }

    @ObfuscatedName("ko.q(Lhp;III)[Llx;")
    public static class325[] method4862(class234 arg0, int arg1, int arg2) {
        if (!class327.method4812(arg0, arg1, arg2)) {
            return null;
        }
        class325[] var3 = new class325[field3912];
        for (int var4 = 0; var4 < field3912; var4++) {
            class325 var5 = var3[var4] = new class325();
            var5.field3897 = field3914;
            var5.field3895 = field3911;
            var5.field3891 = field2524[var4];
            var5.field3892 = field3916[var4];
            var5.field3898 = field3915[var4];
            var5.field3894 = field2549[var4];
            var5.field3893 = field1896;
            var5.field3896 = field3913[var4];
        }
        class327.method160();
        return var3;
    }

    @ObfuscatedName("d.l(I)V")
    public static void method257() {
        class247.field3279.method3042();
        class247.field3277.method3042();
    }

    @ObfuscatedName("ei.i([BI)Lke;")
    public static class296 method3012(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class296 var1 = new class296(arg0, field2524, field3916, field3915, field2549, field1896, field3913);
            class327.method160();
            return var1;
        }
    }

    @ObfuscatedName("ec.l(S)V")
    public static void method3117() {
        class86.field1181 = class86.field1181.trim();
        if (class86.field1181.length() == 0) {
            class86.method4603(class225.field3024, class225.field2991, class225.field2959);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method3343("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class301 var4 = new class301(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field3731, var4.field3733, 1000 - var4.field3733);
                if (var5 == -1) {
                    var4.field3733 = 0;
                    long var8 = var4.method5104();
                    var6 = var8;
                    break;
                }
                var4.field3733 += var5;
                if (var4.field3733 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var46) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = class86.field1181;
            Random var15 = new Random();
            class301 var16 = new class301(128);
            class301 var17 = new class301(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method5228(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method5054(var15.nextInt());
            }
            var16.method5054(var18[0]);
            var16.method5054(var18[1]);
            var16.method5056(var6);
            var16.method5056(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method5054(var15.nextInt());
            }
            var16.method5090(class81.field1141, class81.field1142);
            var17.method5228(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method5054(var15.nextInt());
            }
            var17.method5056(var15.nextLong());
            var17.method5055(var15.nextLong());
            if (client.field694 == null) {
                byte[] var22 = new byte[24];
                try {
                    class168.field2041.method6037(0L);
                    class168.field2041.method6063(var22);
                    int var23;
                    for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                    }
                    if (var23 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var45) {
                    for (int var25 = 0; var25 < 24; var25++) {
                        var22[var25] = -1;
                    }
                }
                var17.method5061(var22, 0, var22.length);
            } else {
                var17.method5061(client.field694, 0, client.field694.length);
            }
            var17.method5056(var15.nextLong());
            var17.method5090(class81.field1141, class81.field1142);
            int var28 = class301.method3582(var14);
            if (var28 % 8 != 0) {
                var28 += 8 - var28 % 8;
            }
            class301 var29 = new class301(var28);
            var29.method5058(var14);
            var29.field3733 = var28;
            var29.method5086(var18);
            class301 var30 = new class301(var29.field3733 + var17.field3733 + var16.field3733 + 5);
            var30.method5228(2);
            var30.method5228(var16.field3733);
            var30.method5061(var16.field3731, 0, var16.field3733);
            var30.method5228(var17.field3733);
            var30.method5061(var17.field3731, 0, var17.field3733);
            var30.method5052(var29.field3733);
            var30.method5061(var29.field3731, 0, var29.field3733);
            byte[] var31 = var30.field3731;
            String var32 = class291.method3729(var31, 0, var31.length);
            String var33 = var32;
            byte var40;
            try {
                URL var34 = new URL(client.method3343("services", false) + "m=accountappeal/login.ws");
                URLConnection var35 = var34.openConnection();
                var35.setDoInput(true);
                var35.setDoOutput(true);
                var35.setConnectTimeout(5000);
                OutputStreamWriter var36 = new OutputStreamWriter(var35.getOutputStream());
                var36.write("data2=" + class341.method49(var33) + "&dest=" + class341.method49("passwordchoice.ws"));
                var36.flush();
                InputStream var37 = var35.getInputStream();
                class301 var38 = new class301(new byte[1000]);
                while (true) {
                    int var39 = var37.read(var38.field3731, var38.field3733, 1000 - var38.field3733);
                    if (var39 == -1) {
                        var36.close();
                        var37.close();
                        String var41 = new String(var38.field3731);
                        if (var41.startsWith("OFFLINE")) {
                            var40 = 4;
                        } else if (var41.startsWith("WRONG")) {
                            var40 = 7;
                        } else if (var41.startsWith("RELOAD")) {
                            var40 = 3;
                        } else if (var41.startsWith("Not permitted for social network accounts.")) {
                            var40 = 6;
                        } else {
                            var38.method5087(var18);
                            while (var38.field3733 > 0 && var38.field3731[var38.field3733 - 1] == 0) {
                                var38.field3733--;
                            }
                            String var42 = new String(var38.field3731, 0, var38.field3733);
                            if (class81.method1511(var42)) {
                                class52.method36(var42, true, false);
                                var40 = 2;
                            } else {
                                var40 = 5;
                            }
                        }
                        break;
                    }
                    var38.field3733 += var39;
                    if (var38.field3733 >= 1000) {
                        var40 = 5;
                        break;
                    }
                }
            } catch (Throwable var44) {
                var44.printStackTrace();
                var40 = 5;
            }
            var13 = var40;
        }
        switch(var13) {
            case 2:
                class86.method4603(class225.field2943, class225.field3028, class225.field2769);
                class86.field1210 = 6;
                break;
            case 3:
                class86.method4603(class225.field3030, class225.field3029, class225.field3032);
                break;
            case 4:
                class86.method4603(class225.field3033, class225.field3034, class225.field3035);
                break;
            case 5:
                class86.method4603(class225.field3036, class225.field2781, class225.field3019);
                break;
            case 6:
                class86.method4603(class225.field3002, class225.field3040, class225.field3041);
                break;
            case 7:
                class86.method4603(class225.field3042, class225.field2816, class225.field3044);
        }
    }

    @ObfuscatedName("lz.j(IIII)I")
    public static final int method5764(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("cv.ei(IS)V")
    public static void method2069(int arg0) {
        if (client.field663 == arg0) {
            return;
        }
        if (client.field663 == 0) {
            field234.method747();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            client.field687 = 0;
            client.field688 = 0;
            client.field689 = 0;
            client.field798.method4611(arg0);
            if (arg0 != 20) {
                client.method85(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && field3564 != null) {
            field3564.method3204();
            field3564 = null;
        }
        if (client.field663 == 25) {
            client.field710 = 0;
            client.field706 = 0;
            client.field707 = 1;
            client.field708 = 0;
            client.field897 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class86.method5421(field111, field684, true, 0);
        } else if (arg0 == 20) {
            class86.method5421(field111, field684, true, client.field663 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class86.method5421(field111, field684, false, 4);
        } else if (field1180) {
            field1195 = null;
            field3208 = null;
            field1182 = null;
            field24 = null;
            field1136 = null;
            field1244 = null;
            field1184 = null;
            field1179 = null;
            field1467 = null;
            field272 = null;
            field534 = null;
            field3063 = null;
            field1074 = null;
            field265 = null;
            field3632.method1555();
            class198.method612(2);
            if (field3177 != null) {
                try {
                    class301 var1 = new class301(4);
                    var1.method5228(2);
                    var1.method5053(0);
                    field3177.method3210(var1.field3731, 0, 4);
                } catch (IOException var5) {
                    try {
                        field3177.method3204();
                    } catch (Exception var4) {
                    }
                    class237.field3179++;
                    field3177 = null;
                }
            }
            field1180 = false;
        }
        client.field663 = arg0;
    }

    @ObfuscatedName("gp.c(Lke;Lke;B)V")
    public static void method3322(class296 arg0, class296 arg1) {
        if (field272 == null) {
            class236 var2 = field684;
            int var3 = var2.method3791("sl_back");
            int var4 = var2.method3792(var3, "");
            class326[] var5 = class327.method2805(var2, var3, var4);
            field272 = var5;
        }
        if (field534 == null) {
            class236 var6 = field684;
            int var7 = var6.method3791("sl_flags");
            int var8 = var6.method3792(var7, "");
            class325[] var9 = method4862(var6, var7, var8);
            field534 = var9;
        }
        if (field3063 == null) {
            class236 var10 = field684;
            int var11 = var10.method3791("sl_arrows");
            int var12 = var10.method3792(var11, "");
            class325[] var13 = method4862(var10, var11, var12);
            field3063 = var13;
        }
        if (field1074 == null) {
            class236 var14 = field684;
            int var15 = var14.method3791("sl_stars");
            int var16 = var14.method3792(var15, "");
            class325[] var17 = method4862(var14, var15, var16);
            field1074 = var17;
        }
        if (field1207 == null) {
            field1207 = class327.method3658(field684, "leftarrow", "");
        }
        if (field3491 == null) {
            field3491 = class327.method3658(field684, "rightarrow", "");
        }
        class322.method5539(class86.field1209, 23, 765, 480, 0);
        class322.method5532(class86.field1209, 0, 125, 23, 12425273, 9135624);
        class322.method5532(class86.field1209 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4922(class225.field3049, class86.field1209 + 62, 15, 0, -1);
        if (field1074 != null) {
            field1074[1].method5621(class86.field1209 + 140, 1);
            arg1.method4927(class225.field3050, class86.field1209 + 152, 10, 16777215, -1);
            field1074[0].method5621(class86.field1209 + 140, 12);
            arg1.method4927(class225.field2757, class86.field1209 + 152, 21, 16777215, -1);
        }
        if (field3063 != null) {
            int var18 = class86.field1209 + 280;
            if (class72.field1027[0] == 0 && class72.field1019[0] == 0) {
                field3063[2].method5621(var18, 4);
            } else {
                field3063[0].method5621(var18, 4);
            }
            if (class72.field1027[0] == 0 && class72.field1019[0] == 1) {
                field3063[3].method5621(var18 + 15, 4);
            } else {
                field3063[1].method5621(var18 + 15, 4);
            }
            arg0.method4927(class225.field3052, var18 + 32, 17, 16777215, -1);
            int var19 = class86.field1209 + 390;
            if (class72.field1027[0] == 1 && class72.field1019[0] == 0) {
                field3063[2].method5621(var19, 4);
            } else {
                field3063[0].method5621(var19, 4);
            }
            if (class72.field1027[0] == 1 && class72.field1019[0] == 1) {
                field3063[3].method5621(var19 + 15, 4);
            } else {
                field3063[1].method5621(var19 + 15, 4);
            }
            arg0.method4927(class225.field2944, var19 + 32, 17, 16777215, -1);
            int var20 = class86.field1209 + 500;
            if (class72.field1027[0] == 2 && class72.field1019[0] == 0) {
                field3063[2].method5621(var20, 4);
            } else {
                field3063[0].method5621(var20, 4);
            }
            if (class72.field1027[0] == 2 && class72.field1019[0] == 1) {
                field3063[3].method5621(var20 + 15, 4);
            } else {
                field3063[1].method5621(var20 + 15, 4);
            }
            arg0.method4927(class225.field3054, var20 + 32, 17, 16777215, -1);
            int var21 = class86.field1209 + 610;
            if (class72.field1027[0] == 3 && class72.field1019[0] == 0) {
                field3063[2].method5621(var21, 4);
            } else {
                field3063[0].method5621(var21, 4);
            }
            if (class72.field1027[0] == 3 && class72.field1019[0] == 1) {
                field3063[3].method5621(var21 + 15, 4);
            } else {
                field3063[1].method5621(var21 + 15, 4);
            }
            arg0.method4927(class225.field3055, var21 + 32, 17, 16777215, -1);
        }
        class322.method5539(class86.field1209 + 708, 4, 50, 16, 0);
        arg1.method4922(class225.field2995, class86.field1209 + 708 + 25, 16, 16777215, -1);
        class86.field1208 = -1;
        if (field272 != null) {
            byte var22 = 88;
            byte var23 = 19;
            int var24 = 765 / (var22 + 1) - 1;
            int var25 = 480 / (var23 + 1);
            int var26;
            int var27;
            do {
                var26 = var25;
                var27 = var24;
                if ((var24 - 1) * var25 >= class72.field1023) {
                    var24--;
                }
                if ((var25 - 1) * var24 >= class72.field1023) {
                    var25--;
                }
                if ((var25 - 1) * var24 >= class72.field1023) {
                    var25--;
                }
            } while (var25 != var26 || var24 != var27);
            int var28 = (765 - var22 * var24) / (var24 + 1);
            if (var28 > 5) {
                var28 = 5;
            }
            int var29 = (480 - var23 * var25) / (var25 + 1);
            if (var29 > 5) {
                var29 = 5;
            }
            int var30 = (765 - var22 * var24 - (var24 - 1) * var28) / 2;
            int var31 = (480 - var23 * var25 - (var25 - 1) * var29) / 2;
            int var32 = (class72.field1023 + var25 - 1) / var25;
            class86.field1187 = var32 - var24;
            if (field1207 != null && class86.field1191 > 0) {
                field1207.method5621(8, field3309 / 2 - field1207.field3894 / 2);
            }
            if (field3491 != null && class86.field1191 < class86.field1187) {
                field3491.method5621(field47 - field3491.field3898 - 8, field3309 / 2 - field3491.field3894 / 2);
            }
            int var33 = var31 + 23;
            int var34 = class86.field1209 + var30;
            int var35 = 0;
            boolean var36 = false;
            int var37 = class86.field1191;
            for (int var38 = var25 * var37; var38 < class72.field1023 && var37 - class86.field1191 < var24; var38++) {
                class72 var39 = field1032[var38];
                boolean var40 = true;
                String var41 = Integer.toString(var39.field1031);
                if (var39.field1031 == -1) {
                    var41 = class225.field3056;
                    var40 = false;
                } else if (var39.field1031 > 1980) {
                    var41 = class225.field2988;
                    var40 = false;
                }
                int var42 = 0;
                byte var43;
                if (var39.method1523()) {
                    if (var39.method1515()) {
                        var43 = 7;
                    } else {
                        var43 = 6;
                    }
                } else if (var39.method1519()) {
                    var42 = 16711680;
                    if (var39.method1515()) {
                        var43 = 5;
                    } else {
                        var43 = 4;
                    }
                } else if (var39.method1553()) {
                    if (var39.method1515()) {
                        var43 = 3;
                    } else {
                        var43 = 2;
                    }
                } else if (var39.method1515()) {
                    var43 = 1;
                } else {
                    var43 = 0;
                }
                if (class55.field493 >= var34 && class55.field488 >= var33 && class55.field493 < var22 + var34 && class55.field488 < var23 + var33 && var40) {
                    class86.field1208 = var38;
                    field272[var43].method5647(var34, var33, 128, 16777215);
                    var36 = true;
                } else {
                    field272[var43].method5641(var34, var33);
                }
                if (field534 != null) {
                    field534[(var39.method1515() ? 8 : 0) + var39.field1033].method5621(var34 + 29, var33);
                }
                arg0.method4922(Integer.toString(var39.field1026), var34 + 15, var23 / 2 + var33 + 5, var42, -1);
                arg1.method4922(var41, var34 + 60, var23 / 2 + var33 + 5, 268435455, -1);
                var33 += var23 + var29;
                var35++;
                if (var35 >= var25) {
                    var33 = var31 + 23;
                    var34 += var22 + var28;
                    var35 = 0;
                    var37++;
                }
            }
            if (var36) {
                int var44 = arg1.method4990(field1032[class86.field1208].field1029) + 6;
                int var45 = arg1.field3710 + 8;
                int var46 = class55.field488 + 25;
                if (var45 + var46 > 480) {
                    var46 = class55.field488 - 25 - var45;
                }
                class322.method5539(class55.field493 - var44 / 2, var46, var44, var45, 16777120);
                class322.method5535(class55.field493 - var44 / 2, var46, var44, var45, 0);
                arg1.method4922(field1032[class86.field1208].field1029, class55.field493, arg1.field3710 + var46 + 4, 0, -1);
            }
        }
        field2487.method719(0, 0);
    }

    @ObfuscatedName("t.fr(Lis;IIII)V")
    public static void method210(class259 arg0, int arg1, int arg2, int arg3) {
        if (client.field894 >= 50 || client.field893 == 0 || arg0.field3524 == null || arg1 >= arg0.field3524.length) {
            return;
        }
        int var4 = arg0.field3524[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        client.field895[client.field894] = var5;
        client.field896[client.field894] = var6;
        client.field898[client.field894] = 0;
        client.field899[client.field894] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        client.field842[client.field894] = (var8 << 16) + (var9 << 8) + var7;
        client.field894++;
    }

    @ObfuscatedName("bb.iq(I)Z")
    public static boolean method990() {
        return client.field802;
    }

    @ObfuscatedName("bx.ju(Lhj;III)V")
    public static final void method980(class218 arg0, int arg1, int arg2) {
        if (client.field829 != null || client.field675 || arg0 == null || client.method961(arg0) == null) {
            return;
        }
        client.field829 = arg0;
        client.field830 = client.method961(arg0);
        client.field831 = arg1;
        client.field832 = arg2;
        field1144 = 0;
        client.field840 = false;
        int var3 = client.method137();
        if (var3 != -1) {
            client.method2291(var3);
        }
    }

    @ObfuscatedName("bt.jr(IIIB)Lbo;")
    public static final class62 method1491(int arg0, int arg1, int arg2) {
        class62 var3 = new class62();
        var3.field572 = arg1;
        var3.field570 = arg2;
        client.field817.method5478(var3, (long) arg0);
        client.method132(arg1);
        class218 var4 = class218.method1799(arg0);
        client.method3755(var4);
        if (client.field851 != null) {
            client.method3755(client.field851);
            client.field851 = null;
        }
        for (int var5 = 0; var5 < client.field792; var5++) {
            if (client.method6(client.field795[var5])) {
                if (var5 < client.field792 - 1) {
                    for (int var6 = var5; var6 < client.field792 - 1; var6++) {
                        client.field797[var6] = client.field797[var6 + 1];
                        client.field669[var6] = client.field669[var6 + 1];
                        client.field795[var6] = client.field795[var6 + 1];
                        client.field796[var6] = client.field796[var6 + 1];
                        client.field793[var6] = client.field793[var6 + 1];
                        client.field794[var6] = client.field794[var6 + 1];
                        client.field770[var6] = client.field770[var6 + 1];
                    }
                }
                var5--;
                client.field792--;
            }
        }
        client.method131();
        client.method357(field2557[arg0 >> 16], var4, false);
        class77.method675(arg1);
        if (client.field906 != -1) {
            client.method161(client.field906, 1);
        }
        return var3;
    }

    @ObfuscatedName("x.jd(Lhj;B)Z")
    public static final boolean method135(class218 arg0) {
        int var1 = arg0.field2569;
        if (var1 == 205) {
            client.field701 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            client.field919.method3629(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            client.field919.method3630(var4, var5 == 1);
        }
        if (var1 == 324) {
            client.field919.method3643(false);
        }
        if (var1 == 325) {
            client.field919.method3643(true);
        }
        if (var1 == 326) {
            class188 var6 = class188.method3894(class184.field2216, client.field881.field1314);
            client.field919.method3632(var6.field2334);
            client.field881.method2023(var6);
            return true;
        } else {
            return false;
        }
    }
}
