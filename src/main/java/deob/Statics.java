package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.security.SecureRandom;
import java.util.concurrent.ScheduledExecutorService;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("b.cb")
    public static class64 field10;

    @ObfuscatedName("bl.iz")
    public static int field1002;

    @ObfuscatedName("bv.qo")
    public static class113 field1023;

    @ObfuscatedName("bv.g")
    public static String[] field1040;

    @ObfuscatedName("r.gp")
    public static class325[] field105;

    @ObfuscatedName("bs.ak")
    public static String field1053;

    @ObfuscatedName("bh.e")
    public static class218 field1091;

    @ObfuscatedName("bh.o")
    public static class100 field1099;

    @ObfuscatedName("b.dq")
    public static class236 field11;

    @ObfuscatedName("bh.ps")
    public static class325 field1102;

    @ObfuscatedName("bh.dk")
    public static class305 field1103;

    @ObfuscatedName("bk.by")
    public static class324[] field1113;

    @ObfuscatedName("cm.ay")
    public static int field1116;

    @ObfuscatedName("cm.kt")
    public static int field1121;

    @ObfuscatedName("cd.o")
    public static class109 field1122;

    @ObfuscatedName("cd.se")
    public static class331 field1125;

    @ObfuscatedName("cv.hz")
    public static int field1136;

    @ObfuscatedName("cl.w")
    public static int field1137;

    @ObfuscatedName("cl.ho")
    public static int field1145;

    @ObfuscatedName("cl.do")
    public static class236 field1146;

    @ObfuscatedName("cg.qp")
    public static class106 field1155;

    @ObfuscatedName("ch.s")
    public static class300 field1160;

    @ObfuscatedName("co.ox")
    public static class91 field1167;

    @ObfuscatedName("co.fr")
    public static class295 field1172;

    @ObfuscatedName("co.gt")
    public static class325[] field1173;

    @ObfuscatedName("cr.z")
    public static class324 field1177;

    @ObfuscatedName("cr.x")
    public static class324 field1180;

    @ObfuscatedName("cr.p")
    public static class324 field1189;

    @ObfuscatedName("cr.i")
    public static class324[] field1191;

    @ObfuscatedName("cr.f")
    public static boolean field1195;

    @ObfuscatedName("a.bn")
    public static class338 field120;

    @ObfuscatedName("cr.w")
    public static int[][] field1208;

    @ObfuscatedName("cy.fx")
    public static class166 field1242;

    @ObfuscatedName("cy.rh")
    public static int field1243;

    @ObfuscatedName("d.gx")
    public static int[][] field125;

    @ObfuscatedName("cn.ac")
    public static String field1259;

    @ObfuscatedName("cq.c")
    public static class42 field1273;

    @ObfuscatedName("cq.z")
    public static int field1275;

    @ObfuscatedName("d.eh")
    public static int field129;

    @ObfuscatedName("cu.n")
    public static class73 field1296;

    @ObfuscatedName("g.nn")
    public static int field13;

    @ObfuscatedName("d.t")
    public static String field132;

    @ObfuscatedName("ct.q")
    public static float[] field1346;

    @ObfuscatedName("ct.h")
    public static byte[] field1347;

    @ObfuscatedName("ct.y")
    public static int field1348;

    @ObfuscatedName("ct.i")
    public static int field1350;

    @ObfuscatedName("ct.r")
    public static boolean[] field1351;

    @ObfuscatedName("ct.x")
    public static class101[] field1352;

    @ObfuscatedName("ct.o")
    public static class105[] field1353;

    @ObfuscatedName("ct.e")
    public static class112[] field1354;

    @ObfuscatedName("ct.n")
    public static class117[] field1355;

    @ObfuscatedName("ct.c")
    public static int[] field1357;

    @ObfuscatedName("ct.af")
    public static float[] field1362;

    @ObfuscatedName("ct.v")
    public static float[] field1363;

    @ObfuscatedName("ct.k")
    public static int field1364;

    @ObfuscatedName("ct.l")
    public static float[] field1365;

    @ObfuscatedName("ct.j")
    public static float[] field1366;

    @ObfuscatedName("ct.ad")
    public static float[] field1368;

    @ObfuscatedName("ct.am")
    public static float[] field1369;

    @ObfuscatedName("ct.ai")
    public static int[] field1370;

    @ObfuscatedName("ct.ag")
    public static int[] field1371;

    @ObfuscatedName("ct.w")
    public static int field1374;

    @ObfuscatedName("dw.i")
    public static int[] field1381;

    @ObfuscatedName("dw.k")
    public static int[] field1390;

    @ObfuscatedName("dw.x")
    public static boolean[] field1391;

    @ObfuscatedName("de.i")
    public static class108 field1395;

    @ObfuscatedName("de.y")
    public static ScheduledExecutorService field1404;

    @ObfuscatedName("de.p")
    public static boolean field1409;

    @ObfuscatedName("de.fc")
    public static class305 field1414;

    @ObfuscatedName("dc.ku")
    public static int field1429;

    @ObfuscatedName("dk.sr")
    public static class7 field1436;

    @ObfuscatedName("dk.fd")
    public static int field1439;

    @ObfuscatedName("dn.w")
    public static class324 field1455;

    @ObfuscatedName("dn.hh")
    public static int field1456;

    @ObfuscatedName("dh.y")
    public static float field1479;

    @ObfuscatedName("s.bi")
    public static String field148;

    @ObfuscatedName("dh.w")
    public static int field1480;

    @ObfuscatedName("db.an")
    public static boolean field1524;

    @ObfuscatedName("da.kd")
    public static int field1536;

    @ObfuscatedName("da.i")
    public static short[][] field1538;

    @ObfuscatedName("du.h")
    public static class218[][] field1608;

    @ObfuscatedName("du.hj")
    public static int field1610;

    @ObfuscatedName("m.dl")
    public static class236 field162;

    @ObfuscatedName("dv.n")
    public static int[] field1625;

    @ObfuscatedName("df.bj")
    public static int field1671;

    @ObfuscatedName("df.bm")
    public static int field1719;

    @ObfuscatedName("df.bq")
    public static int field1720;

    @ObfuscatedName("dd.y")
    public static int field1738;

    @ObfuscatedName("dd.w")
    public static int field1740;

    @ObfuscatedName("dy.rp")
    public static class75 field1745;

    @ObfuscatedName("eg.e")
    public static int field1755;

    @ObfuscatedName("eg.c")
    public static int field1756;

    @ObfuscatedName("eg.o")
    public static int field1760;

    @ObfuscatedName("eg.r")
    public static int field1761;

    @ObfuscatedName("eg.n")
    public static int field1762;

    @ObfuscatedName("eg.d")
    public static int field1766;

    @ObfuscatedName("eg.s")
    public static int field1767;

    @ObfuscatedName("eg.a")
    public static int field1768;

    @ObfuscatedName("eg.v")
    public static class140 field1770;

    @ObfuscatedName("ey.ns")
    public static int field1783;

    @ObfuscatedName("ec.w")
    public static int[] field1789;

    @ObfuscatedName("el.bb")
    public static int field1792;

    @ObfuscatedName("el.a")
    public static int field1796;

    @ObfuscatedName("el.bf")
    public static int field1803;

    @ObfuscatedName("el.af")
    public static int field1807;

    @ObfuscatedName("el.c")
    public static int field1808;

    @ObfuscatedName("el.j")
    public static int field1810;

    @ObfuscatedName("el.t")
    public static int field1812;

    @ObfuscatedName("el.v")
    public static int field1814;

    @ObfuscatedName("el.l")
    public static int field1816;

    @ObfuscatedName("el.ad")
    public static int field1819;

    @ObfuscatedName("el.am")
    public static int field1820;

    @ObfuscatedName("el.m")
    public static int field1823;

    @ObfuscatedName("el.q")
    public static int field1824;

    @ObfuscatedName("el.br")
    public static int field1828;

    @ObfuscatedName("el.s")
    public static int field1830;

    @ObfuscatedName("el.d")
    public static int field1841;

    @ObfuscatedName("el.bq")
    public static boolean[][] field1852;

    @ObfuscatedName("el.ai")
    public static int field1853;

    @ObfuscatedName("el.by")
    public static int field1854;

    @ObfuscatedName("el.ba")
    public static int field1856;

    @ObfuscatedName("el.bg")
    public static int field1858;

    @ObfuscatedName("eu.q")
    public static int field1873;

    @ObfuscatedName("ea.g")
    public static class199 field1879;

    @ObfuscatedName("er.k")
    public static int field1881;

    @ObfuscatedName("er.b")
    public static int[] field1882;

    @ObfuscatedName("et.bf")
    public static String field1915;

    @ObfuscatedName("eh.hl")
    public static int field1932;

    @ObfuscatedName("eh.qf")
    public static int field1934;

    @ObfuscatedName("ew.h")
    public static int field1936;

    @ObfuscatedName("l.d")
    public static int field194;

    @ObfuscatedName("ew.ez")
    public static int field1941;

    @ObfuscatedName("ew.g")
    public static int[] field1942;

    @ObfuscatedName("ez.gv")
    public static class325[] field1946;

    @ObfuscatedName("ez.gb")
    public static byte[][] field1947;

    @ObfuscatedName("ez.m")
    public static String field1948;

    @ObfuscatedName("eb.al")
    public static GarbageCollectorMXBean field1967;

    @ObfuscatedName("eb.dy")
    public static class236 field1969;

    @ObfuscatedName("eb.b")
    public static int field1970;

    @ObfuscatedName("es.bd")
    public static class231 field1974;

    @ObfuscatedName("ed.ss")
    public static class74 field1978;

    @ObfuscatedName("ed.st")
    public static int field1980;

    @ObfuscatedName("eq.y")
    public static int field1984;

    @ObfuscatedName("fl.qg")
    public static int field1991;

    @ObfuscatedName("fj.gd")
    public static int[] field1997;

    @ObfuscatedName("fj.e")
    public static class171 field1998;

    @ObfuscatedName("fj.rm")
    public static int field1999;

    @ObfuscatedName("f.ix")
    public static int field2;

    @ObfuscatedName("l.nk")
    public static int field201;

    @ObfuscatedName("fc.dm")
    public static class236 field2014;

    @ObfuscatedName("fu.f")
    public static String field2037;

    @ObfuscatedName("fu.u")
    public static String field2042;

    @ObfuscatedName("fs.v")
    public static String field2043;

    @ObfuscatedName("fs.g")
    public static File field2045;

    @ObfuscatedName("fs.p")
    public static int field2046;

    @ObfuscatedName("fs.c")
    public static String[] field2047;

    @ObfuscatedName("fs.ct")
    public static boolean field2055;

    @ObfuscatedName("fs.ji")
    public static class120 field2056;

    @ObfuscatedName("fs.fq")
    public static class295 field2059;

    @ObfuscatedName("fr.f")
    public static File field2060;

    @ObfuscatedName("fh.ff")
    public static int field2087;

    @ObfuscatedName("fy.p")
    public static int field2101;

    @ObfuscatedName("fy.z")
    public static int field2104;

    @ObfuscatedName("fg.fv")
    public static long field2111;

    @ObfuscatedName("fg.w")
    public static int field2115;

    @ObfuscatedName("gj.qy")
    public static class99 field2240;

    @ObfuscatedName("ad.h")
    public static int[] field226;

    @ObfuscatedName("ad.x")
    public static class204 field228;

    @ObfuscatedName("z.nw")
    public static class218[] field23;

    @ObfuscatedName("gj.jh")
    public static int field2321;

    @ObfuscatedName("gj.db")
    public static class236 field2322;

    @ObfuscatedName("gd.lh")
    public static class218 field2339;

    @ObfuscatedName("am.n")
    public static int[][][] field234;

    @ObfuscatedName("gs.ab")
    public static class319 field2343;

    @ObfuscatedName("gh.o")
    public static class218 field2353;

    @ObfuscatedName("gb.x")
    public static int field2356;

    @ObfuscatedName("gw.kc")
    public static int field2374;

    @ObfuscatedName("go.gf")
    public static class324[] field2394;

    @ObfuscatedName("go.ah")
    public static int field2396;

    @ObfuscatedName("gq.u")
    public static class234 field2410;

    @ObfuscatedName("gq.f")
    public static class234 field2411;

    @ObfuscatedName("gq.p")
    public static class234 field2414;

    @ObfuscatedName("gq.w")
    public static int field2415;

    @ObfuscatedName("gq.b")
    public static class234 field2416;

    @ObfuscatedName("ai.da")
    public static class236 field244;

    @ObfuscatedName("ge.pr")
    public static class310 field2469;

    @ObfuscatedName("gv.so")
    public static short[] field2495;

    @ObfuscatedName("gp.h")
    public static class325 field2502;

    @ObfuscatedName("gu.dr")
    public static class236 field2504;

    @ObfuscatedName("gu.az")
    public static class322 field2507;

    @ObfuscatedName("ha.df")
    public static class236 field2518;

    @ObfuscatedName("ha.u")
    public static class210 field2520;

    @ObfuscatedName("hn.dz")
    public static class236 field2526;

    @ObfuscatedName("hn.fs")
    public static class144 field2527;

    @ObfuscatedName("hm.o")
    public static class324 field2533;

    @ObfuscatedName("hm.di")
    public static long field2534;

    @ObfuscatedName("hx.c")
    public static int field2538;

    @ObfuscatedName("hd.w")
    public static short[] field2543;

    @ObfuscatedName("hd.h")
    public static short[] field2549;

    @ObfuscatedName("ai.sx")
    public static class333 field255;

    @ObfuscatedName("hd.eo")
    public static int[] field2553;

    @ObfuscatedName("hc.jg")
    public static class67 field2558;

    @ObfuscatedName("hv.y")
    public static int[] field2563;

    @ObfuscatedName("hv.z")
    public static int[] field2564;

    @ObfuscatedName("hl.y")
    public static boolean[] field2569;

    @ObfuscatedName("hl.k")
    public static class234 field2570;

    @ObfuscatedName("ag.sb")
    public static class308 field258;

    @ObfuscatedName("hl.x")
    public static class234 field2603;

    @ObfuscatedName("ag.hv")
    public static int field261;

    @ObfuscatedName("ag.z")
    public static int field262;

    @ObfuscatedName("ao.po")
    public static boolean field264;

    @ObfuscatedName("ao.dt")
    public static class236 field266;

    @ObfuscatedName("ao.fk")
    public static class293 field267;

    @ObfuscatedName("hk.z")
    public static class72[] field2752;

    @ObfuscatedName("hk.ba")
    public static class324 field2756;

    @ObfuscatedName("hw.u")
    public static class234 field2764;

    @ObfuscatedName("aw.r")
    public static class300 field281;

    @ObfuscatedName("ak.n")
    public static class342[] field289;

    @ObfuscatedName("aa.ef")
    public static int field293;

    @ObfuscatedName("aa.ey")
    public static class236 field297;

    @ObfuscatedName("b.gc")
    public static class134 field3;

    @ObfuscatedName("aa.qk")
    public static int field300;

    @ObfuscatedName("aa.as")
    public static client field302;

    @ObfuscatedName("hu.gz")
    public static class325 field3075;

    @ObfuscatedName("hq.gn")
    public static int[] field3083;

    @ObfuscatedName("ab.rg")
    public static int field309;

    @ObfuscatedName("hp.gy")
    public static int field3093;

    @ObfuscatedName("ab.l")
    public static int field310;

    @ObfuscatedName("ic.z")
    public static Thread field3158;

    @ObfuscatedName("im.b")
    public static long field3172;

    @ObfuscatedName("im.e")
    public static class233 field3175;

    @ObfuscatedName("im.o")
    public static boolean field3182;

    @ObfuscatedName("im.u")
    public static class305 field3187;

    @ObfuscatedName("p.lj")
    public static class218 field32;

    @ObfuscatedName("ik.gh")
    public static byte[][] field3206;

    @ObfuscatedName("it.u")
    public static class234 field3209;

    @ObfuscatedName("it.w")
    public static class234 field3210;

    @ObfuscatedName("it.sy")
    public static class238 field3211;

    @ObfuscatedName("ib.f")
    public static int field3214;

    @ObfuscatedName("ib.u")
    public static class234 field3215;

    @ObfuscatedName("is.b")
    public static int field3222;

    @ObfuscatedName("is.f")
    public static class242[] field3230;

    @ObfuscatedName("ia.h")
    public static int[] field3243;

    @ObfuscatedName("ia.fa")
    public static int field3244;

    @ObfuscatedName("ia.u")
    public static class234 field3245;

    @ObfuscatedName("ir.f")
    public static class234 field3250;

    @ObfuscatedName("ir.u")
    public static class234 field3259;

    @ObfuscatedName("ig.u")
    public static class234 field3263;

    @ObfuscatedName("ie.b")
    public static int field3271;

    @ObfuscatedName("ie.f")
    public static class234 field3278;

    @ObfuscatedName("ar.by")
    public static String field328;

    @ObfuscatedName("ie.bb")
    public static class324 field3280;

    @ObfuscatedName("iz.f")
    public static class234 field3283;

    @ObfuscatedName("iz.u")
    public static class234 field3293;

    @ObfuscatedName("iq.bq")
    public static class191 field3299;

    @ObfuscatedName("iq.u")
    public static class234 field3302;

    @ObfuscatedName("io.u")
    public static class234 field3308;

    @ObfuscatedName("aq.lv")
    public static int field331;

    @ObfuscatedName("id.u")
    public static class234 field3312;

    @ObfuscatedName("id.g")
    public static class324[] field3313;

    @ObfuscatedName("id.e")
    public static class324 field3316;

    @ObfuscatedName("in.u")
    public static class234 field3319;

    @ObfuscatedName("ix.f")
    public static class234 field3329;

    @ObfuscatedName("ix.b")
    public static class234 field3345;

    @ObfuscatedName("ix.u")
    public static class234 field3351;

    @ObfuscatedName("il.f")
    public static class234 field3354;

    @ObfuscatedName("il.b")
    public static class234 field3376;

    @ObfuscatedName("iu.y")
    public static boolean field3406;

    @ObfuscatedName("iu.p")
    public static class234 field3433;

    @ObfuscatedName("az.gk")
    public static int field344;

    @ObfuscatedName("ih.f")
    public static class234 field3467;

    @ObfuscatedName("ih.u")
    public static class234 field3472;

    @ObfuscatedName("az.ax")
    public static int field349;

    @ObfuscatedName("az.bf")
    public static class324[] field350;

    @ObfuscatedName("ii.jk")
    public static class218 field3508;

    @ObfuscatedName("ii.u")
    public static class234 field3511;

    @ObfuscatedName("az.bx")
    public static class230 field353;

    @ObfuscatedName("iy.b")
    public static class234 field3530;

    @ObfuscatedName("iy.f")
    public static class234 field3531;

    @ObfuscatedName("iy.u")
    public static class234 field3533;

    @ObfuscatedName("iy.gr")
    public static class325[] field3535;

    @ObfuscatedName("az.gq")
    public static class325 field354;

    @ObfuscatedName("jy.h")
    public static class234 field3553;

    @ObfuscatedName("jc.dv")
    public static class236 field3558;

    @ObfuscatedName("jk.dg")
    public static class236 field3565;

    @ObfuscatedName("ae.bm")
    public static class325[] field361;

    @ObfuscatedName("ji.a")
    public static String[] field3611;

    @ObfuscatedName("jh.aa")
    public static Image field3624;

    @ObfuscatedName("jf.i")
    public static class234 field3642;

    @ObfuscatedName("jf.rc")
    public static int field3644;

    @ObfuscatedName("ae.br")
    public static class324 field365;

    @ObfuscatedName("kh.dh")
    public static class236 field3652;

    @ObfuscatedName("kh.i")
    public static int field3653;

    @ObfuscatedName("kw.o")
    public static int[] field3658;

    @ObfuscatedName("ka.gg")
    public static class325[] field3666;

    @ObfuscatedName("kr.i")
    public static class324[] field3693;

    @ObfuscatedName("kk.u")
    public static long field3696;

    @ObfuscatedName("kk.f")
    public static long field3697;

    @ObfuscatedName("h.h")
    public static int field37;

    @ObfuscatedName("kp.cy")
    public static char field3700;

    @ObfuscatedName("kv.w")
    public static byte[][][] field3716;

    @ObfuscatedName("aj.la")
    public static int field373;

    @ObfuscatedName("aj.ds")
    public static class236 field375;

    @ObfuscatedName("aj.i")
    public static int field376;

    @ObfuscatedName("lq.z")
    public static File field3822;

    @ObfuscatedName("ls.y")
    public static class325 field3842;

    @ObfuscatedName("ly.ad")
    public static int[] field3845;

    @ObfuscatedName("ly.ai")
    public static int field3846;

    @ObfuscatedName("ly.am")
    public static int field3848;

    @ObfuscatedName("lz.w")
    public static byte[][] field3858;

    @ObfuscatedName("lz.l")
    public static int[] field3859;

    @ObfuscatedName("lt.f")
    public static int field3881;

    @ObfuscatedName("lt.y")
    public static int[] field3882;

    @ObfuscatedName("lt.p")
    public static int[] field3883;

    @ObfuscatedName("lt.u")
    public static int field3884;

    @ObfuscatedName("lc.i")
    public static int field4015;

    @ObfuscatedName("lc.o")
    public static class295 field4016;

    @ObfuscatedName("mr.f")
    public static String field4043;

    @ObfuscatedName("mr.u")
    public static Applet field4044;

    @ObfuscatedName("mr.g")
    public static int field4045;

    @ObfuscatedName("mr.b")
    public static int field4047;

    @ObfuscatedName("an.gi")
    public static class325[] field407;

    @ObfuscatedName("an.dc")
    public static class166 field408;

    @ObfuscatedName("al.jx")
    public static class218 field410;

    @ObfuscatedName("ax.ek")
    public static String field413;

    @ObfuscatedName("au.et")
    public static int field416;

    @ObfuscatedName("au.rq")
    public static int field418;

    @ObfuscatedName("au.cn")
    public static int field419;

    @ObfuscatedName("ah.y")
    public static byte[][][] field424;

    @ObfuscatedName("ah.ag")
    public static FontMetrics field427;

    @ObfuscatedName("ah.fn")
    public static int field429;

    @ObfuscatedName("ah.ev")
    public static SecureRandom field430;

    @ObfuscatedName("ah.jz")
    public static class218 field433;

    @ObfuscatedName("bo.h")
    public static int field442;

    @ObfuscatedName("bo.u")
    public static class167 field454;

    @ObfuscatedName("bo.ai")
    public static Font field457;

    @ObfuscatedName("bu.k")
    public static int[] field497;

    @ObfuscatedName("bu.g")
    public static byte[][][] field499;

    @ObfuscatedName("bu.z")
    public static byte[][][] field500;

    @ObfuscatedName("bu.p")
    public static byte[][][] field501;

    @ObfuscatedName("bu.h")
    public static byte[][][] field502;

    @ObfuscatedName("bu.li")
    public static class83 field503;

    @ObfuscatedName("bu.x")
    public static int[] field505;

    @ObfuscatedName("bu.i")
    public static int[] field511;

    @ObfuscatedName("bd.du")
    public static class236 field519;

    @ObfuscatedName("bn.ej")
    public static int field525;

    @ObfuscatedName("bj.k")
    public static boolean field533;

    @ObfuscatedName("bj.y")
    public static short[][] field534;

    @ObfuscatedName("bm.oc")
    public static class169 field538;

    @ObfuscatedName("w.gu")
    public static class324[] field54;

    @ObfuscatedName("bm.hs")
    public static int field542;

    @ObfuscatedName("bm.bq")
    public static class324[] field544;

    @ObfuscatedName("w.y")
    public static int field55;

    @ObfuscatedName("bq.qc")
    public static class106 field553;

    @ObfuscatedName("bq.eg")
    public static class236 field555;

    @ObfuscatedName("bf.k")
    public static class324 field565;

    @ObfuscatedName("bf.pe")
    public static class285 field567;

    @ObfuscatedName("br.e")
    public static int[] field589;

    @ObfuscatedName("b.p")
    public static int field6;

    @ObfuscatedName("w.ge")
    public static class324[] field60;

    @ObfuscatedName("bb.o")
    public static int field604;

    @ObfuscatedName("bb.sp")
    public static long field605;

    @ObfuscatedName("bg.fp")
    public static class295 field635;

    @ObfuscatedName("bw.t")
    public static int field638;

    @ObfuscatedName("bw.aa")
    public static class319 field639;

    @ObfuscatedName("bw.qx")
    public static int field640;

    @ObfuscatedName("bw.i")
    public static class145 field642;

    @ObfuscatedName("x.ew")
    public static int field74;

    @ObfuscatedName("o.sn")
    public static int field78;

    @ObfuscatedName("o.he")
    public static int field79;

    @ObfuscatedName("o.gs")
    public static int[] field81;

    @ObfuscatedName("o.dn")
    public static class236 field82;

    @ObfuscatedName("e.dd")
    public static class236 field87;

    @ObfuscatedName("e.br")
    public static int field92;

    @ObfuscatedName("be.qu")
    public static int field926;

    @ObfuscatedName("be.r")
    public static int field933;

    @ObfuscatedName("bt.el")
    public static class312 field960;

    @ObfuscatedName("n.u")
    public static class234 field98;

    @ObfuscatedName("bt.mh")
    public static int field982;

    @ObfuscatedName("ay.u(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method713(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("fv.u(Lhf;III)Llm;")
    public static class324 method3190(class234 arg0, int arg1, int arg2) {
        return class326.method1850(arg0, arg1, arg2) ? class326.method152() : null;
    }

    @ObfuscatedName("r.f(Lhf;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method171(class234 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3917(arg1);
        int var6 = arg0.method3901(var5, arg2);
        class198.method1088(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("gc.u(I)[Lgc;")
    public static class191[] method3377() {
        return new class191[] { class191.field2367, class191.field2359, class191.field2362, class191.field2363, class191.field2361, class191.field2360, class191.field2366 };
    }

    @ObfuscatedName("o.f(B)V")
    public static void method146() {
        class30.field242.method3106();
    }

    @ObfuscatedName("hs.f(Ljava/lang/Throwable;Ljava/lang/String;)Lmr;")
    public static class341 method3804(Throwable arg0, String arg1) {
        class341 var2;
        if (arg0 instanceof class341) {
            var2 = (class341) arg0;
            var2.field4046 = var2.field4046 + ' ' + arg1;
        } else {
            var2 = new class341(arg0, arg1);
        }
        return var2;
    }

    @ObfuscatedName("ku.p(Lhf;Ljava/lang/String;Ljava/lang/String;I)[Lln;")
    public static class325[] method5496(class234 arg0, String arg1, String arg2) {
        int var3 = arg0.method3917(arg1);
        int var4 = arg0.method3901(var3, arg2);
        return class326.method3167(arg0, var3, var4);
    }

    @ObfuscatedName("cr.b(B)V")
    public static void method1930() {
        try {
            class168.field2050.method6084();
            for (int var0 = 0; var0 < field2046; var0++) {
                field289[var0].method6084();
            }
            class168.field2048.method6084();
            class168.field2049.method6084();
        } catch (Exception var2) {
        }
    }

    @ObfuscatedName("dc.u(Lhf;Lhf;ZLky;I)V")
    public static void method2299(class234 arg0, class234 arg1, boolean arg2, class295 arg3) {
        field3433 = arg0;
        field3553 = arg1;
        field3406 = arg2;
        field1137 = field3433.method3878(10);
        field4016 = arg3;
    }

    @ObfuscatedName("du.o(CI)Z")
    public static boolean method2622(char arg0) {
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= 160 && arg0 <= 255) {
            return true;
        } else {
            return arg0 == 8364 || arg0 == 338 || arg0 == 8212 || arg0 == 339 || arg0 == 376;
        }
    }

    @ObfuscatedName("fl.f(III)Lhl;")
    public static class218 method3176(int arg0, int arg1) {
        class218 var2 = class218.method3387(arg0);
        if (arg1 == -1) {
            return var2;
        } else if (var2 == null || var2.field2708 == null || arg1 >= var2.field2708.length) {
            return null;
        } else {
            return var2.field2708[arg1];
        }
    }

    @ObfuscatedName("in.h(IIIIIILel;Lfh;I)V")
    public static final void method4251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class134 arg6, class173 arg7) {
        if (client.field847 && (class56.field513[0][arg1][arg2] & 0x2) == 0 && (class56.field513[arg0][arg1][arg2] & 0x10) != 0) {
            return;
        }
        if (arg0 < class56.field498) {
            class56.field498 = arg0;
        }
        class254 var8 = class254.method3048(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field3370;
            var10 = var8.field3369;
        } else {
            var9 = var8.field3369;
            var10 = var8.field3370;
        }
        int var11;
        int var12;
        if (arg1 + var9 <= 104) {
            var11 = (var9 >> 1) + arg1;
            var12 = (var9 + 1 >> 1) + arg1;
        } else {
            var11 = arg1;
            var12 = arg1 + 1;
        }
        int var13;
        int var14;
        if (arg2 + var10 <= 104) {
            var13 = (var10 >> 1) + arg2;
            var14 = (var10 + 1 >> 1) + arg2;
        } else {
            var13 = arg2;
            var14 = arg2 + 1;
        }
        int[][] var15 = class56.field496[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        long var19 = class129.method960(arg1, arg2, 2, var8.field3388 == 0, arg3);
        int var21 = (arg4 << 6) + arg5;
        if (var8.field3394 == 1) {
            var21 += 256;
        }
        if (var8.method4292()) {
            class76.method610(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field847 || var8.field3388 != 0 || var8.field3371 == 1 || var8.field3392) {
                class136 var22;
                if (var8.field3396 == -1 && var8.field3395 == null) {
                    var22 = var8.method4288(22, arg4, var15, var17, var16, var18);
                } else {
                    var22 = new class94(arg3, 22, arg4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
                }
                arg6.method3011(arg0, arg1, arg2, var16, var22, var19, var21);
                if (var8.field3371 == 1 && arg7 != null) {
                    arg7.method3275(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class136 var48;
            if (var8.field3396 == -1 && var8.field3395 == null) {
                var48 = var8.method4288(10, arg4, var15, var17, var16, var18);
            } else {
                var48 = new class94(arg3, 10, arg4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
            }
            if (var48 != null && arg6.method2977(arg0, arg1, arg2, var16, var9, var10, var48, arg5 == 11 ? 256 : 0, var19, var21) && var8.field3385) {
                int var49 = 15;
                if (var48 instanceof class128) {
                    var49 = ((class128) var48).method2642() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var9; var50++) {
                    for (int var51 = 0; var51 <= var10; var51++) {
                        if (var49 > field424[arg0][arg1 + var50][arg2 + var51]) {
                            field424[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var8.field3371 != 0 && arg7 != null) {
                arg7.method3273(arg1, arg2, var9, var10, var8.field3387);
            }
        } else if (arg5 >= 12) {
            class136 var23;
            if (var8.field3396 == -1 && var8.field3395 == null) {
                var23 = var8.method4288(arg5, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
            }
            arg6.method2977(arg0, arg1, arg2, var16, 1, 1, var23, 0, var19, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                field234[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field3371 != 0 && arg7 != null) {
                arg7.method3273(arg1, arg2, var9, var10, var8.field3387);
            }
        } else if (arg5 == 0) {
            class136 var24;
            if (var8.field3396 == -1 && var8.field3395 == null) {
                var24 = var8.method4288(0, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class94(arg3, 0, arg4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
            }
            arg6.method2843(arg0, arg1, arg2, var16, var24, (class136) null, class56.field506[arg4], 0, var19, var21);
            if (arg4 == 0) {
                if (var8.field3385) {
                    field424[arg0][arg1][arg2] = 50;
                    field424[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field3402) {
                    field234[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field3385) {
                    field424[arg0][arg1][arg2 + 1] = 50;
                    field424[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3402) {
                    field234[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field3385) {
                    field424[arg0][arg1 + 1][arg2] = 50;
                    field424[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field3402) {
                    field234[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field3385) {
                    field424[arg0][arg1][arg2] = 50;
                    field424[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field3402) {
                    field234[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field3371 != 0 && arg7 != null) {
                arg7.method3293(arg1, arg2, arg5, arg4, var8.field3387);
            }
            if (var8.field3372 != 16) {
                arg6.method2859(arg0, arg1, arg2, var8.field3372);
            }
        } else if (arg5 == 1) {
            class136 var25;
            if (var8.field3396 == -1 && var8.field3395 == null) {
                var25 = var8.method4288(1, arg4, var15, var17, var16, var18);
            } else {
                var25 = new class94(arg3, 1, arg4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
            }
            arg6.method2843(arg0, arg1, arg2, var16, var25, (class136) null, class56.field507[arg4], 0, var19, var21);
            if (var8.field3385) {
                if (arg4 == 0) {
                    field424[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    field424[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    field424[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    field424[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3371 != 0 && arg7 != null) {
                arg7.method3293(arg1, arg2, arg5, arg4, var8.field3387);
            }
        } else if (arg5 == 2) {
            int var26 = arg4 + 1 & 0x3;
            class136 var27;
            class136 var28;
            if (var8.field3396 == -1 && var8.field3395 == null) {
                var27 = var8.method4288(2, arg4 + 4, var15, var17, var16, var18);
                var28 = var8.method4288(2, var26, var15, var17, var16, var18);
            } else {
                var27 = new class94(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
                var28 = new class94(arg3, 2, var26, arg0, arg1, arg2, var8.field3396, true, (class136) null);
            }
            arg6.method2843(arg0, arg1, arg2, var16, var27, var28, class56.field506[arg4], class56.field506[var26], var19, var21);
            if (var8.field3402) {
                if (arg4 == 0) {
                    field234[arg0][arg1][arg2] |= 0x249;
                    field234[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    field234[arg0][arg1][arg2 + 1] |= 0x492;
                    field234[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    field234[arg0][arg1 + 1][arg2] |= 0x249;
                    field234[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    field234[arg0][arg1][arg2] |= 0x492;
                    field234[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field3371 != 0 && arg7 != null) {
                arg7.method3293(arg1, arg2, arg5, arg4, var8.field3387);
            }
            if (var8.field3372 != 16) {
                arg6.method2859(arg0, arg1, arg2, var8.field3372);
            }
        } else if (arg5 == 3) {
            class136 var29;
            if (var8.field3396 == -1 && var8.field3395 == null) {
                var29 = var8.method4288(3, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class94(arg3, 3, arg4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
            }
            arg6.method2843(arg0, arg1, arg2, var16, var29, (class136) null, class56.field507[arg4], 0, var19, var21);
            if (var8.field3385) {
                if (arg4 == 0) {
                    field424[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    field424[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    field424[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    field424[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field3371 != 0 && arg7 != null) {
                arg7.method3293(arg1, arg2, arg5, arg4, var8.field3387);
            }
        } else if (arg5 == 9) {
            class136 var30;
            if (var8.field3396 == -1 && var8.field3395 == null) {
                var30 = var8.method4288(arg5, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class94(arg3, arg5, arg4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
            }
            arg6.method2977(arg0, arg1, arg2, var16, 1, 1, var30, 0, var19, var21);
            if (var8.field3371 != 0 && arg7 != null) {
                arg7.method3273(arg1, arg2, var9, var10, var8.field3387);
            }
            if (var8.field3372 != 16) {
                arg6.method2859(arg0, arg1, arg2, var8.field3372);
            }
        } else if (arg5 == 4) {
            class136 var31;
            if (var8.field3396 == -1 && var8.field3395 == null) {
                var31 = var8.method4288(4, arg4, var15, var17, var16, var18);
            } else {
                var31 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
            }
            arg6.method2852(arg0, arg1, arg2, var16, var31, (class136) null, class56.field506[arg4], 0, 0, 0, var19, var21);
        } else if (arg5 == 5) {
            int var32 = 16;
            long var33 = arg6.method2869(arg0, arg1, arg2);
            if (var33 != 0L) {
                var32 = class254.method3048(class129.method1028(var33)).field3372;
            }
            class136 var35;
            if (var8.field3396 == -1 && var8.field3395 == null) {
                var35 = var8.method4288(4, arg4, var15, var17, var16, var18);
            } else {
                var35 = new class94(arg3, 4, arg4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
            }
            arg6.method2852(arg0, arg1, arg2, var16, var35, (class136) null, class56.field506[arg4], 0, class56.field508[arg4] * var32, class56.field509[arg4] * var32, var19, var21);
        } else if (arg5 == 6) {
            int var36 = 8;
            long var37 = arg6.method2869(arg0, arg1, arg2);
            if (var37 != 0L) {
                var36 = class254.method3048(class129.method1028(var37)).field3372 / 2;
            }
            class136 var39;
            if (var8.field3396 == -1 && var8.field3395 == null) {
                var39 = var8.method4288(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var39 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
            }
            arg6.method2852(arg0, arg1, arg2, var16, var39, (class136) null, 256, arg4, class56.field510[arg4] * var36, class56.field514[arg4] * var36, var19, var21);
        } else if (arg5 == 7) {
            int var40 = arg4 + 2 & 0x3;
            class136 var41;
            if (var8.field3396 == -1 && var8.field3395 == null) {
                var41 = var8.method4288(4, var40 + 4, var15, var17, var16, var18);
            } else {
                var41 = new class94(arg3, 4, var40 + 4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
            }
            arg6.method2852(arg0, arg1, arg2, var16, var41, (class136) null, 256, var40, 0, 0, var19, var21);
        } else if (arg5 == 8) {
            int var42 = 8;
            long var43 = arg6.method2869(arg0, arg1, arg2);
            if (var43 != 0L) {
                var42 = class254.method3048(class129.method1028(var43)).field3372 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class136 var46;
            class136 var47;
            if (var8.field3396 == -1 && var8.field3395 == null) {
                var46 = var8.method4288(4, arg4 + 4, var15, var17, var16, var18);
                var47 = var8.method4288(4, var45 + 4, var15, var17, var16, var18);
            } else {
                var46 = new class94(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
                var47 = new class94(arg3, 4, var45 + 4, arg0, arg1, arg2, var8.field3396, true, (class136) null);
            }
            arg6.method2852(arg0, arg1, arg2, var16, var46, var47, 256, arg4, class56.field510[arg4] * var42, class56.field514[arg4] * var42, var19, var21);
        }
    }

    @ObfuscatedName("il.z(Lbo;I)V")
    public static void method4335(class54 arg0) {
        if (class86.field1185) {
            while (true) {
                if (!class46.method4034()) {
                    if (class55.field482 != 1 && (field2055 || class55.field482 != 4)) {
                        break;
                    }
                    int var1 = class86.field1176 + 280;
                    if (class55.field490 >= var1 && class55.field490 <= var1 + 14 && class55.field491 >= 4 && class55.field491 <= 18) {
                        class72.method4659(0, 0);
                        break;
                    }
                    if (class55.field490 >= var1 + 15 && class55.field490 <= var1 + 80 && class55.field491 >= 4 && class55.field491 <= 18) {
                        class72.method4659(0, 1);
                        break;
                    }
                    int var2 = class86.field1176 + 390;
                    if (class55.field490 >= var2 && class55.field490 <= var2 + 14 && class55.field491 >= 4 && class55.field491 <= 18) {
                        class72.method4659(1, 0);
                        break;
                    }
                    if (class55.field490 >= var2 + 15 && class55.field490 <= var2 + 80 && class55.field491 >= 4 && class55.field491 <= 18) {
                        class72.method4659(1, 1);
                        break;
                    }
                    int var3 = class86.field1176 + 500;
                    if (class55.field490 >= var3 && class55.field490 <= var3 + 14 && class55.field491 >= 4 && class55.field491 <= 18) {
                        class72.method4659(2, 0);
                        break;
                    }
                    if (class55.field490 >= var3 + 15 && class55.field490 <= var3 + 80 && class55.field491 >= 4 && class55.field491 <= 18) {
                        class72.method4659(2, 1);
                        break;
                    }
                    int var4 = class86.field1176 + 610;
                    if (class55.field490 >= var4 && class55.field490 <= var4 + 14 && class55.field491 >= 4 && class55.field491 <= 18) {
                        class72.method4659(3, 0);
                        break;
                    }
                    if (class55.field490 >= var4 + 15 && class55.field490 <= var4 + 80 && class55.field491 >= 4 && class55.field491 <= 18) {
                        class72.method4659(3, 1);
                        break;
                    }
                    if (class55.field490 >= class86.field1176 + 708 && class55.field491 >= 4 && class55.field490 <= class86.field1176 + 708 + 50 && class55.field491 <= 20) {
                        class86.field1185 = false;
                        field2502.method5689(class86.field1176, 0);
                        field3842.method5689(class86.field1176 + 382, 0);
                        field1455.method5660(class86.field1176 + 382 - field1455.field3863 / 2, 18);
                        break;
                    }
                    if (class86.field1179 == -1) {
                        if (class86.field1204 > 0 && field2756 != null && class55.field490 >= 0 && class55.field490 <= field2756.field3863 && class55.field491 >= field310 / 2 - 50 && class55.field491 <= field310 / 2 + 50) {
                            class86.field1204--;
                        }
                        if (class86.field1204 < class86.field1178 && field3280 != null && class55.field490 >= field1873 - field3280.field3863 - 5 && class55.field490 <= field1873 && class55.field491 >= field310 / 2 - 50 && class55.field491 <= field310 / 2 + 50) {
                            class86.field1204++;
                        }
                    } else {
                        class72 var5 = field2752[class86.field1179];
                        class86.method149(var5);
                        class86.field1185 = false;
                        field2502.method5689(class86.field1176, 0);
                        field3842.method5689(class86.field1176 + 382, 0);
                        field1455.method5660(class86.field1176 + 382 - field1455.field3863 / 2, 18);
                    }
                    break;
                }
                if (field419 == 13) {
                    class86.field1185 = false;
                    field2502.method5689(class86.field1176, 0);
                    field3842.method5689(class86.field1176 + 382, 0);
                    field1455.method5660(class86.field1176 + 382 - field1455.field3863 / 2, 18);
                    break;
                }
                if (field419 == 96) {
                    if (class86.field1204 > 0 && field2756 != null) {
                        class86.field1204--;
                    }
                } else if (field419 == 97 && class86.field1204 < class86.field1178 && field3280 != null) {
                    class86.field1204++;
                }
            }
            return;
        }
        if ((class55.field482 == 1 || !field2055 && class55.field482 == 4) && class55.field490 >= class86.field1176 + 765 - 50 && class55.field491 >= 453) {
            field1978.field1048 = !field1978.field1048;
            class74.method650();
            if (field1978.field1048) {
                class198.method2546();
            } else {
                method171(field162, "scape main", "", 255, false);
            }
        }
        if (client.field652 == 5) {
            return;
        }
        if (class86.field1206 == -1L) {
            class86.field1206 = class297.method3217() + 1000L;
        }
        long var6 = class297.method3217();
        if (client.method45() && class86.field1207 == -1L) {
            class86.field1207 = var6;
            if (class86.field1207 > class86.field1206) {
                class86.field1206 = class86.field1207;
            }
        }
        if (client.field652 != 10 && client.field652 != 11) {
            return;
        }
        if (field3299 == class191.field2360) {
            if (class55.field482 == 1 || !field2055 && class55.field482 == 4) {
                int var8 = class86.field1176 + 5;
                short var9 = 463;
                byte var10 = 100;
                byte var11 = 35;
                if (class55.field490 >= var8 && class55.field490 <= var8 + var10 && class55.field491 >= var9 && class55.field491 <= var9 + var11) {
                    class86.method167();
                    return;
                }
            }
            if (field642 != null) {
                class86.method167();
            }
        }
        int var12 = class55.field482;
        int var13 = class55.field490;
        int var14 = class55.field491;
        if (var12 == 0) {
            var13 = class55.field473;
            var14 = class55.field483;
        }
        if (!field2055 && var12 == 4) {
            var12 = 1;
        }
        if (class86.field1188 == 0) {
            boolean var15 = false;
            while (class46.method4034()) {
                if (field419 == 84) {
                    var15 = true;
                }
            }
            int var16 = field638 - 80;
            short var17 = 291;
            if (var12 == 1 && var13 >= var16 - 75 && var13 <= var16 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20) {
                class52.method582(client.method5119("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var18 = field638 + 80;
            if (var12 == 1 && var13 >= var18 - 75 && var13 <= var18 + 75 && var14 >= var17 - 20 && var14 <= var17 + 20 || var15) {
                if ((client.field796 & 0x2000000) != 0) {
                    class86.field1201 = "";
                    class86.field1190 = class225.field2803;
                    class86.field1184 = class225.field2998;
                    class86.field1192 = class225.field2999;
                    class86.field1188 = 1;
                    class86.method4825();
                } else if ((client.field796 & 0x4) != 0) {
                    if ((client.field796 & 0x400) == 0) {
                        class86.field1190 = class225.field2988;
                        class86.field1184 = class225.field2989;
                        class86.field1192 = class225.field2783;
                    } else {
                        class86.field1190 = class225.field3066;
                        class86.field1184 = class225.field2995;
                        class86.field1192 = class225.field2996;
                    }
                    class86.field1201 = class225.field2987;
                    class86.field1188 = 1;
                    class86.method4825();
                } else if ((client.field796 & 0x400) == 0) {
                    class86.method3816(false);
                } else {
                    class86.field1190 = class225.field2991;
                    class86.field1184 = class225.field2981;
                    class86.field1192 = class225.field2993;
                    class86.field1201 = class225.field2987;
                    class86.field1188 = 1;
                    class86.method4825();
                }
            }
        } else if (class86.field1188 == 1) {
            while (true) {
                if (!class46.method4034()) {
                    int var19 = field638 - 80;
                    short var20 = 321;
                    if (var12 == 1 && var13 >= var19 - 75 && var13 <= var19 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                        class86.method3816(false);
                    }
                    int var21 = field638 + 80;
                    if (var12 == 1 && var13 >= var21 - 75 && var13 <= var21 + 75 && var14 >= var20 - 20 && var14 <= var20 + 20) {
                        class86.field1188 = 0;
                    }
                    break;
                }
                if (field419 == 84) {
                    class86.method3816(false);
                } else if (field419 == 13) {
                    class86.field1188 = 0;
                }
            }
        } else if (class86.field1188 == 2) {
            short var22 = 201;
            int var88 = var22 + 52;
            if (var12 == 1 && var14 >= var88 - 12 && var14 < var88 + 2) {
                class86.field1205 = 0;
            }
            var88 += 15;
            if (var12 == 1 && var14 >= var88 - 12 && var14 < var88 + 2) {
                class86.field1205 = 1;
            }
            var88 += 15;
            short var23 = 361;
            if (field639 != null) {
                int var24 = field639.field3840 / 2;
                if (var12 == 1 && var13 >= field639.field3841 - var24 && var13 <= field639.field3841 + var24 && var14 >= var23 - 15 && var14 < var23) {
                    switch(class86.field1187) {
                        case 1:
                            class86.method2089(class225.field3036, class225.field2839, class225.field3038);
                            class86.field1188 = 5;
                            return;
                        case 2:
                            class52.method582("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var25 = field638 - 80;
            short var26 = 321;
            if (var12 == 1 && var13 >= var25 - 75 && var13 <= var25 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                class86.field1193 = class86.field1193.trim();
                if (class86.field1193.length() == 0) {
                    class86.method2089(class225.field2889, class225.field2811, class225.field2891);
                    return;
                }
                if (class86.field1175.length() == 0) {
                    class86.method2089(class225.field2892, class225.field2893, class225.field2894);
                    return;
                }
                class86.method2089(class225.field3002, class225.field3003, class225.field2931);
                client.method721(false);
                client.method1897(20);
                return;
            }
            int var27 = class86.field1182 + 180 + 80;
            if (var12 == 1 && var13 >= var27 - 75 && var13 <= var27 + 75 && var14 >= var26 - 20 && var14 <= var26 + 20) {
                class86.field1188 = 0;
                class86.field1193 = "";
                class86.field1175 = "";
                field2396 = 0;
                field148 = "";
                class86.field1197 = true;
            }
            int var28 = field638 + -117;
            short var29 = 277;
            class86.field1174 = var13 >= var28 && var13 < field1116 + var28 && var14 >= var29 && var14 < field349 + var29;
            if (var12 == 1 && class86.field1174) {
                client.field682 = !client.field682;
                if (!client.field682 && field1978.field1056 != null) {
                    field1978.field1056 = null;
                    class74.method650();
                }
            }
            int var30 = field638 + 24;
            short var31 = 277;
            class86.field1196 = var13 >= var30 && var13 < field1116 + var30 && var14 >= var31 && var14 < field349 + var31;
            if (var12 == 1 && class86.field1196) {
                field1978.field1051 = !field1978.field1051;
                if (!field1978.field1051) {
                    class86.field1193 = "";
                    field1978.field1056 = null;
                    class86.method4825();
                }
                class74.method650();
            }
            label964: while (true) {
                Transferable var35;
                int var36;
                do {
                    while (true) {
                        label878: do {
                            while (true) {
                                while (class46.method4034()) {
                                    if (field419 == 13) {
                                        class86.field1188 = 0;
                                        class86.field1193 = "";
                                        class86.field1175 = "";
                                        field2396 = 0;
                                        field148 = "";
                                        class86.field1197 = true;
                                    } else {
                                        if (class86.field1205 != 0) {
                                            continue label878;
                                        }
                                        class86.method3634(field3700);
                                        if (field419 == 85 && class86.field1193.length() > 0) {
                                            class86.field1193 = class86.field1193.substring(0, class86.field1193.length() - 1);
                                        }
                                        if (field419 == 84 || field419 == 80) {
                                            class86.field1205 = 1;
                                        }
                                        char var32 = field3700;
                                        boolean var33 = class86.field1199.indexOf(var32) != -1;
                                        if (var33 && class86.field1193.length() < 320) {
                                            class86.field1193 = class86.field1193 + field3700;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (class86.field1205 != 1);
                        if (field419 == 85 && class86.field1175.length() > 0) {
                            class86.field1175 = class86.field1175.substring(0, class86.field1175.length() - 1);
                        } else if (field419 == 84 || field419 == 80) {
                            class86.field1205 = 0;
                            if (field419 == 84) {
                                class86.field1193 = class86.field1193.trim();
                                if (class86.field1193.length() == 0) {
                                    class86.method2089(class225.field2889, class225.field2811, class225.field2891);
                                    return;
                                }
                                if (class86.field1175.length() == 0) {
                                    class86.method2089(class225.field2892, class225.field2893, class225.field2894);
                                    return;
                                }
                                class86.method2089(class225.field3002, class225.field3003, class225.field2931);
                                client.method721(false);
                                client.method1897(20);
                                return;
                            }
                        }
                        if ((class46.field405[82] || class46.field405[87]) && field419 == 67) {
                            Clipboard var34 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var35 = var34.getContents(field302);
                            var36 = 20 - class86.field1175.length();
                            break;
                        }
                        char var49 = field3700;
                        boolean var50;
                        if (var49 >= ' ' && var49 < 127 || var49 > 127 && var49 < 160 || var49 > 160 && var49 <= 255) {
                            var50 = true;
                        } else {
                            label1091: {
                                if (var49 != 0) {
                                    char[] var51 = class288.field3648;
                                    for (int var52 = 0; var52 < var51.length; var52++) {
                                        char var53 = var51[var52];
                                        if (var49 == var53) {
                                            var50 = true;
                                            break label1091;
                                        }
                                    }
                                }
                                var50 = false;
                            }
                        }
                        if (var50) {
                            char var54 = field3700;
                            boolean var55 = class86.field1199.indexOf(var54) != -1;
                            if (var55 && class86.field1175.length() < 20) {
                                class86.field1175 = class86.field1175 + field3700;
                            }
                        }
                    }
                } while (var36 <= 0);
                try {
                    String var37 = (String) var35.getTransferData(DataFlavor.stringFlavor);
                    int var38 = Math.min(var36, var37.length());
                    int var39 = 0;
                    while (true) {
                        if (var39 >= var38) {
                            class86.field1175 = class86.field1175 + var37.substring(0, var38);
                            continue label964;
                        }
                        char var40 = var37.charAt(var39);
                        boolean var41;
                        if (var40 >= ' ' && var40 < 127 || var40 > 127 && var40 < 160 || var40 > 160 && var40 <= 255) {
                            var41 = true;
                        } else {
                            label1092: {
                                if (var40 != 0) {
                                    char[] var42 = class288.field3648;
                                    for (int var43 = 0; var43 < var42.length; var43++) {
                                        char var44 = var42[var43];
                                        if (var40 == var44) {
                                            var41 = true;
                                            break label1092;
                                        }
                                    }
                                }
                                var41 = false;
                            }
                        }
                        if (!var41) {
                            break;
                        }
                        char var45 = var37.charAt(var39);
                        boolean var46 = class86.field1199.indexOf(var45) != -1;
                        if (!var46) {
                            break;
                        }
                        var39++;
                    }
                    class86.field1188 = 3;
                    return;
                } catch (UnsupportedFlavorException var86) {
                } catch (IOException var87) {
                }
            }
        } else if (class86.field1188 == 3) {
            int var56 = class86.field1182 + 180;
            short var57 = 276;
            if (var12 == 1 && var13 >= var56 - 75 && var13 <= var56 + 75 && var14 >= var57 - 20 && var14 <= var57 + 20) {
                class86.method3816(false);
            }
            int var58 = class86.field1182 + 180;
            short var59 = 326;
            if (var12 == 1 && var13 >= var58 - 75 && var13 <= var58 + 75 && var14 >= var59 - 20 && var14 <= var59 + 20) {
                class86.method2089(class225.field3036, class225.field2839, class225.field3038);
                class86.field1188 = 5;
                return;
            }
        } else if (class86.field1188 == 4) {
            int var60 = class86.field1182 + 180 - 80;
            short var61 = 321;
            if (var12 == 1 && var13 >= var60 - 75 && var13 <= var60 + 75 && var14 >= var61 - 20 && var14 <= var61 + 20) {
                field148.trim();
                if (field148.length() != 6) {
                    class86.method2089(class225.field2785, class225.field2877, class225.field2810);
                    return;
                }
                field2396 = Integer.parseInt(field148);
                field148 = "";
                client.method721(true);
                class86.method2089(class225.field3002, class225.field3003, class225.field2931);
                client.method1897(20);
                return;
            }
            if (var12 == 1 && var13 >= class86.field1182 + 180 - 9 && var13 <= class86.field1182 + 180 + 130 && var14 >= 263 && var14 <= 296) {
                class86.field1197 = !class86.field1197;
            }
            if (var12 == 1 && var13 >= class86.field1182 + 180 - 34 && var13 <= class86.field1182 + 180 + 34 && var14 >= 351 && var14 <= 363) {
                class52.method582(client.method5119("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var62 = class86.field1182 + 180 + 80;
            if (var12 == 1 && var13 >= var62 - 75 && var13 <= var62 + 75 && var14 >= var61 - 20 && var14 <= var61 + 20) {
                class86.field1188 = 0;
                class86.field1193 = "";
                class86.field1175 = "";
                field2396 = 0;
                field148 = "";
            }
            while (class46.method4034()) {
                boolean var63 = false;
                for (int var64 = 0; var64 < class86.field1200.length(); var64++) {
                    if (field3700 == class86.field1200.charAt(var64)) {
                        var63 = true;
                        break;
                    }
                }
                if (field419 == 13) {
                    class86.field1188 = 0;
                    class86.field1193 = "";
                    class86.field1175 = "";
                    field2396 = 0;
                    field148 = "";
                } else {
                    if (field419 == 85 && field148.length() > 0) {
                        field148 = field148.substring(0, field148.length() - 1);
                    }
                    if (field419 == 84) {
                        field148.trim();
                        if (field148.length() != 6) {
                            class86.method2089(class225.field2785, class225.field2877, class225.field2810);
                            return;
                        }
                        field2396 = Integer.parseInt(field148);
                        field148 = "";
                        client.method721(true);
                        class86.method2089(class225.field3002, class225.field3003, class225.field2931);
                        client.method1897(20);
                        return;
                    }
                    if (var63 && field148.length() < 6) {
                        field148 = field148 + field3700;
                    }
                }
            }
        } else if (class86.field1188 == 5) {
            int var65 = class86.field1182 + 180 - 80;
            short var66 = 321;
            if (var12 == 1 && var13 >= var65 - 75 && var13 <= var65 + 75 && var14 >= var66 - 20 && var14 <= var66 + 20) {
                class86.method1012();
                return;
            }
            int var67 = class86.field1182 + 180 + 80;
            if (var12 == 1 && var13 >= var67 - 75 && var13 <= var67 + 75 && var14 >= var66 - 20 && var14 <= var66 + 20) {
                class86.method3816(true);
            }
            short var68 = 361;
            if (field2343 != null) {
                int var69 = field2343.field3840 / 2;
                if (var12 == 1 && var13 >= field2343.field3841 - var69 && var13 <= field2343.field3841 + var69 && var14 >= var68 - 15 && var14 < var68) {
                    class52.method582(client.method5119("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class46.method4034()) {
                boolean var70 = false;
                for (int var71 = 0; var71 < class86.field1199.length(); var71++) {
                    if (field3700 == class86.field1199.charAt(var71)) {
                        var70 = true;
                        break;
                    }
                }
                if (field419 == 13) {
                    class86.method3816(true);
                } else {
                    if (field419 == 85 && class86.field1193.length() > 0) {
                        class86.field1193 = class86.field1193.substring(0, class86.field1193.length() - 1);
                    }
                    if (field419 == 84) {
                        class86.method1012();
                        return;
                    }
                    if (var70 && class86.field1193.length() < 320) {
                        class86.field1193 = class86.field1193 + field3700;
                    }
                }
            }
        } else if (class86.field1188 == 6) {
            while (true) {
                do {
                    if (!class46.method4034()) {
                        short var72 = 321;
                        if (var12 == 1 && var14 >= var72 - 20 && var14 <= var72 + 20) {
                            class86.method3816(true);
                        }
                        return;
                    }
                } while (field419 != 84 && field419 != 13);
                class86.method3816(true);
            }
        } else if (class86.field1188 == 7) {
            int var73 = class86.field1182 + 180 - 80;
            short var74 = 321;
            if (var12 == 1 && var13 >= var73 - 75 && var13 <= var73 + 75 && var14 >= var74 - 20 && var14 <= var74 + 20) {
                class52.method582(client.method5119("secure", true) + "m=dob/set_dob.ws", true, false);
                class86.method2089(class225.field3033, class225.field3034, class225.field3035);
                class86.field1188 = 6;
                return;
            }
            int var75 = class86.field1182 + 180 + 80;
            if (var12 == 1 && var13 >= var75 - 75 && var13 <= var75 + 75 && var14 >= var74 - 20 && var14 <= var74 + 20) {
                class86.method3816(true);
            }
        } else if (class86.field1188 == 8) {
            int var76 = class86.field1182 + 180 - 80;
            short var77 = 321;
            if (var12 == 1 && var13 >= var76 - 75 && var13 <= var76 + 75 && var14 >= var77 - 20 && var14 <= var77 + 20) {
                class52.method582("https://www.jagex.com/terms/privacy/#eight", true, false);
                class86.method2089(class225.field3033, class225.field3034, class225.field3035);
                class86.field1188 = 6;
                return;
            }
            int var78 = class86.field1182 + 180 + 80;
            if (var12 == 1 && var13 >= var78 - 75 && var13 <= var78 + 75 && var14 >= var77 - 20 && var14 <= var77 + 20) {
                class86.method3816(true);
            }
        } else if (class86.field1188 == 12) {
            String var79 = "";
            switch(class86.field1186) {
                case 0:
                    var79 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var79 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    class86.method3816(false);
            }
            int var80 = class86.field1182 + 180;
            short var81 = 276;
            if (var12 == 1 && var13 >= var80 - 75 && var13 <= var80 + 75 && var14 >= var81 - 20 && var14 <= var81 + 20) {
                class52.method582(var79, true, false);
                class86.method2089(class225.field3033, class225.field3034, class225.field3035);
                class86.field1188 = 6;
                return;
            }
            int var82 = class86.field1182 + 180;
            short var83 = 326;
            if (var12 == 1 && var13 >= var82 - 75 && var13 <= var82 + 75 && var14 >= var83 - 20 && var14 <= var83 + 20) {
                class86.method3816(false);
            }
        } else if (class86.field1188 == 24) {
            int var84 = class86.field1182 + 180;
            short var85 = 301;
            if (var12 == 1 && var13 >= var84 - 75 && var13 <= var84 + 75 && var14 >= var85 - 20 && var14 <= var85 + 20) {
                class86.method3816(false);
            }
        }
    }

    @ObfuscatedName("aq.o(II)Ljava/lang/String;")
    public static final String method587(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class225.field2950 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class225.field2935 + "</col>";
        }
    }

    @ObfuscatedName("bf.fr(Liy;IIIB)V")
    public static void method1045(class259 arg0, int arg1, int arg2, int arg3) {
        if (client.field770 >= 50 || client.field792 == 0 || arg0.field3518 == null || arg1 >= arg0.field3518.length) {
            return;
        }
        int var4 = arg0.field3518[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        client.field893[client.field770] = var5;
        client.field668[client.field770] = var6;
        client.field884[client.field770] = 0;
        client.field900[client.field770] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        client.field885[client.field770] = (var8 << 16) + (var9 << 8) + var7;
        client.field770++;
    }

    @ObfuscatedName("cj.ga(Lbg;ZI)V")
    public static void method1973(class67 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1096() || arg0.field626) {
            return;
        }
        arg0.field615 = false;
        if ((client.field847 && class90.field1250 > 50 || class90.field1250 > 200) && arg1 && arg0.field986 == arg0.field985) {
            arg0.field615 = true;
        }
        int var2 = arg0.field992 >> 7;
        int var3 = arg0.field936 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class129.method960(0, 0, 0, false, arg0.field609);
        if (arg0.field616 != null && client.field655 >= arg0.field614 && client.field655 < arg0.field620) {
            arg0.field615 = false;
            arg0.field613 = client.method3406(arg0.field992, arg0.field936, field2321);
            arg0.field940 = client.field655;
            field3.method2916(field2321, arg0.field992, arg0.field936, arg0.field613, 60, arg0, arg0.field937, var4, arg0.field619, arg0.field621, arg0.field622, arg0.field623);
            return;
        }
        if ((arg0.field992 & 0x7F) == 64 && (arg0.field936 & 0x7F) == 64) {
            if (client.field741 == client.field740[var2][var3]) {
                return;
            }
            client.field740[var2][var3] = client.field741;
        }
        arg0.field613 = client.method3406(arg0.field992, arg0.field936, field2321);
        arg0.field940 = client.field655;
        field3.method2995(field2321, arg0.field992, arg0.field936, arg0.field613, 60, arg0, arg0.field937, var4, arg0.field938);
    }

    @ObfuscatedName("gj.gl(I)I")
    public static final int method3336() {
        if (field1978.field1055) {
            return field2321;
        }
        int var0 = 3;
        if (field542 < 310) {
            int var1;
            int var2;
            if (client.field918 == 1) {
                var1 = field1136 >> 7;
                var2 = field1145 >> 7;
            } else {
                var1 = field2558.field992 >> 7;
                var2 = field2558.field936 >> 7;
            }
            int var3 = field261 >> 7;
            int var4 = field1610 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return field2321;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return field2321;
            }
            if ((class56.field513[field2321][var3][var4] & 0x4) != 0) {
                var0 = field2321;
            }
            int var5;
            if (var1 > var3) {
                var5 = var1 - var3;
            } else {
                var5 = var3 - var1;
            }
            int var6;
            if (var2 > var4) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            if (var5 > var6) {
                int var7 = var6 * 65536 / var5;
                int var8 = 32768;
                while (var1 != var3) {
                    if (var3 < var1) {
                        var3++;
                    } else if (var3 > var1) {
                        var3--;
                    }
                    if ((class56.field513[field2321][var3][var4] & 0x4) != 0) {
                        var0 = field2321;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class56.field513[field2321][var3][var4] & 0x4) != 0) {
                            var0 = field2321;
                        }
                    }
                }
            } else if (var6 > 0) {
                int var9 = var5 * 65536 / var6;
                int var10 = 32768;
                while (var2 != var4) {
                    if (var4 < var2) {
                        var4++;
                    } else if (var4 > var2) {
                        var4--;
                    }
                    if ((class56.field513[field2321][var3][var4] & 0x4) != 0) {
                        var0 = field2321;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class56.field513[field2321][var3][var4] & 0x4) != 0) {
                            var0 = field2321;
                        }
                    }
                }
            }
        }
        if (field2558.field992 >= 0 && field2558.field936 >= 0 && field2558.field992 < 13312 && field2558.field936 < 13312) {
            if ((class56.field513[field2321][field2558.field992 >> 7][field2558.field936 >> 7] & 0x4) != 0) {
                var0 = field2321;
            }
            return var0;
        } else {
            return field2321;
        }
    }

    @ObfuscatedName("fi.ip([Lhl;Lhl;ZB)V")
    public static void method3201(class218[] arg0, class218 arg1, boolean arg2) {
        int var3 = arg1.field2601 == 0 ? arg1.field2639 : arg1.field2601;
        int var4 = arg1.field2688 == 0 ? arg1.field2594 : arg1.field2688;
        client.method3818(arg0, arg1.field2578, var3, var4, arg2);
        if (arg1.field2708 != null) {
            client.method3818(arg1.field2708, arg1.field2578, var3, var4, arg2);
        }
        class62 var5 = (class62) client.field804.method5549((long) arg1.field2578);
        if (var5 != null) {
            client.method247(var5.field564, var3, var4, arg2);
        }
        if (arg1.field2582 == 1337) {
        }
    }

    @ObfuscatedName("hd.jz(Lhl;III)V")
    public static final void method3703(class218 arg0, int arg1, int arg2) {
        if (arg0.field2581 == 1) {
            client.method367(arg0.field2701, "", 24, 0, 0, arg0.field2578);
        }
        if (arg0.field2581 == 2 && !client.field798) {
            String var3 = client.method3338(arg0);
            if (var3 != null) {
                client.method367(var3, class82.method3813(65280) + arg0.field2611, 25, 0, -1, arg0.field2578);
            }
        }
        if (arg0.field2581 == 3) {
            client.method367(class225.field2932, "", 26, 0, 0, arg0.field2578);
        }
        if (arg0.field2581 == 4) {
            client.method367(arg0.field2701, "", 28, 0, 0, arg0.field2578);
        }
        if (arg0.field2581 == 5) {
            client.method367(arg0.field2701, "", 29, 0, 0, arg0.field2578);
        }
        if (arg0.field2581 == 6 && client.field779 == null) {
            client.method367(arg0.field2701, "", 30, 0, -1, arg0.field2578);
        }
        if (arg0.field2580 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2594; var5++) {
                for (int var6 = 0; var6 < arg0.field2639; var6++) {
                    int var7 = (arg0.field2645 + 32) * var6;
                    int var8 = (arg0.field2584 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2647[var4];
                        var8 += arg0.field2666[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        client.field754 = var4;
                        field3508 = arg0;
                        if (arg0.field2630[var4] > 0) {
                            label261: {
                                class255 var9 = class255.method1847(arg0.field2630[var4] - 1);
                                if (client.field802 == 1) {
                                    int var10 = client.method1899(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (field2 != arg0.field2578 || field373 != var4) {
                                            client.method367(class225.field2923, client.field687 + " " + class82.field1142 + " " + class82.method3813(16748608) + var9.field3450, 31, var9.field3436, var4, arg0.field2578);
                                        }
                                        break label261;
                                    }
                                }
                                if (client.field798) {
                                    int var12 = client.method1899(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((field982 & 0x10) == 16) {
                                            client.method367(client.field801, client.field718 + " " + class82.field1142 + " " + class82.method3813(16748608) + var9.field3450, 32, var9.field3436, var4, arg0.field2578);
                                        }
                                        break label261;
                                    }
                                }
                                String[] var14 = var9.field3427;
                                int var15 = -1;
                                if (client.field761 && client.method1573()) {
                                    var15 = var9.method4355();
                                }
                                int var16 = client.method1899(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        if (var15 != var18) {
                                            client.method497(arg0, var9, var4, var18, false);
                                        }
                                    }
                                }
                                class219 var10000 = (class219) null;
                                if (class219.method3375(client.method1899(arg0))) {
                                    client.method367(class225.field2923, class82.method3813(16748608) + var9.field3450, 38, var9.field3436, var4, arg0.field2578);
                                }
                                int var19 = client.method1899(arg0);
                                boolean var20 = (var19 >> 30 & 0x1) != 0;
                                if (var20) {
                                    for (int var21 = 2; var21 >= 0; var21--) {
                                        if (var15 != var21) {
                                            client.method497(arg0, var9, var4, var21, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        client.method497(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var22 = arg0.field2650;
                                if (var22 != null) {
                                    for (int var23 = 4; var23 >= 0; var23--) {
                                        if (var22[var23] != null) {
                                            byte var24 = 0;
                                            if (var23 == 0) {
                                                var24 = 39;
                                            }
                                            if (var23 == 1) {
                                                var24 = 40;
                                            }
                                            if (var23 == 2) {
                                                var24 = 41;
                                            }
                                            if (var23 == 3) {
                                                var24 = 42;
                                            }
                                            if (var23 == 4) {
                                                var24 = 43;
                                            }
                                            client.method367(var22[var23], class82.method3813(16748608) + var9.field3450, var24, var9.field3436, var4, arg0.field2578);
                                        }
                                    }
                                }
                                client.method367(class225.field2937, class82.method3813(16748608) + var9.field3450, 1005, var9.field3436, var4, arg0.field2578);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2659) {
            return;
        }
        if (client.field798) {
            int var25 = client.method1899(arg0);
            boolean var26 = (var25 >> 21 & 0x1) != 0;
            if (var26 && (field982 & 0x20) == 32) {
                client.method367(client.field801, client.field718 + " " + class82.field1142 + " " + arg0.field2602, 58, 0, arg0.field2579, arg0.field2578);
            }
            return;
        }
        for (int var27 = 9; var27 >= 5; var27--) {
            String var28 = client.method3072(arg0, var27);
            if (var28 != null) {
                client.method367(var28, arg0.field2602, 1007, var27 + 1, arg0.field2579, arg0.field2578);
            }
        }
        String var29 = client.method3338(arg0);
        if (var29 != null) {
            client.method367(var29, arg0.field2602, 25, 0, arg0.field2579, arg0.field2578);
        }
        for (int var30 = 4; var30 >= 0; var30--) {
            String var31 = client.method3072(arg0, var30);
            if (var31 != null) {
                client.method159(var31, arg0.field2602, 57, var30 + 1, arg0.field2579, arg0.field2578, arg0.field2720);
            }
        }
        if (class219.method2314(client.method1899(arg0))) {
            client.method367(class225.field2775, "", 30, 0, arg0.field2579, arg0.field2578);
        }
    }

    @ObfuscatedName("fl.jq(Lhl;IIB)V")
    public static final void method3177(class218 arg0, int arg1, int arg2) {
        if (client.field816 != null || client.field876 || arg0 == null) {
            return;
        }
        class218 var3 = arg0;
        int var4 = client.method1899(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class218 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class218.method3387(var3.field2597);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class218 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2658;
        }
        if (var9 == null) {
            return;
        }
        client.field816 = arg0;
        class218 var11 = arg0;
        int var12 = client.method1899(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class218 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class218.method3387(var11.field2597);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class218 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2658;
        }
        client.field817 = var17;
        client.field818 = arg1;
        client.field722 = arg2;
        field13 = 0;
        client.field672 = false;
        int var19 = client.field780 - 1;
        if (var19 != -1) {
            field503 = new class83();
            field503.field1157 = client.field781[var19];
            field503.field1150 = client.field782[var19];
            field503.field1151 = client.field783[var19];
            field503.field1152 = client.field784[var19];
            field503.field1153 = client.field785[var19];
        }
        return;
    }
}
