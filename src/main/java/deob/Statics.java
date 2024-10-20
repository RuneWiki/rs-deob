package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("v.gt")
    public static class327[] field100;

    @ObfuscatedName("bl.gd")
    public static int field1008;

    @ObfuscatedName("bn.t")
    public static class326 field1020;

    @ObfuscatedName("bp.pp")
    public static boolean field1041;

    @ObfuscatedName("by.sj")
    public static class258 field1065;

    @ObfuscatedName("bz.i")
    public static class326 field1079;

    @ObfuscatedName("bz.gc")
    public static byte[][] field1083;

    @ObfuscatedName("ch.hn")
    public static int field1087;

    @ObfuscatedName("x.ag")
    public static int[] field109;

    @ObfuscatedName("cf.bd")
    public static class326[] field1095;

    @ObfuscatedName("y.np")
    public static int field110;

    @ObfuscatedName("cm.ad")
    public static int[] field1103;

    @ObfuscatedName("cm.w")
    public static int[] field1108;

    @ObfuscatedName("cm.bo")
    public static int field1110;

    @ObfuscatedName("cy.bv")
    public static int field1117;

    @ObfuscatedName("cy.hf")
    public static int field1118;

    @ObfuscatedName("cy.nz")
    public static int field1119;

    @ObfuscatedName("cx.bm")
    public static int field1126;

    @ObfuscatedName("cw.t")
    public static boolean field1133;

    @ObfuscatedName("cw.ak")
    public static Image field1134;

    @ObfuscatedName("cu.b")
    public static class326[] field1138;

    @ObfuscatedName("cu.u")
    public static int[] field1144;

    @ObfuscatedName("cu.l")
    public static class326 field1145;

    @ObfuscatedName("cu.n")
    public static boolean field1148;

    @ObfuscatedName("cu.bk")
    public static String field1162;

    @ObfuscatedName("cu.a")
    public static class327 field1163;

    @ObfuscatedName("y.bq")
    public static class251 field118;

    @ObfuscatedName("y.i")
    public static class97 field119;

    @ObfuscatedName("cr.at")
    public static Font field1199;

    @ObfuscatedName("cr.nf")
    public static int field1200;

    @ObfuscatedName("ca.bp")
    public static class326[] field1203;

    @ObfuscatedName("ce.ql")
    public static int field1208;

    @ObfuscatedName("cz.d")
    public static int field1230;

    @ObfuscatedName("cz.x")
    public static String[] field1233;

    @ObfuscatedName("cl.lz")
    public static class238 field1268;

    @ObfuscatedName("cs.ew")
    public static class256 field1279;

    @ObfuscatedName("l.dm")
    public static class256 field13;

    @ObfuscatedName("ct.i")
    public static class102[] field1310;

    @ObfuscatedName("ct.t")
    public static int field1313;

    @ObfuscatedName("ct.c")
    public static byte[] field1314;

    @ObfuscatedName("ct.aa")
    public static float[] field1315;

    @ObfuscatedName("ct.j")
    public static int field1316;

    @ObfuscatedName("ct.v")
    public static class114[] field1317;

    @ObfuscatedName("ct.r")
    public static boolean[] field1318;

    @ObfuscatedName("ct.x")
    public static int[] field1319;

    @ObfuscatedName("ct.d")
    public static int field1323;

    @ObfuscatedName("ct.m")
    public static class109[] field1324;

    @ObfuscatedName("ct.u")
    public static float[] field1325;

    @ObfuscatedName("ct.e")
    public static float[] field1326;

    @ObfuscatedName("ct.w")
    public static float[] field1327;

    @ObfuscatedName("ct.q")
    public static float[] field1328;

    @ObfuscatedName("ct.z")
    public static int field1330;

    @ObfuscatedName("ct.ag")
    public static float[] field1331;

    @ObfuscatedName("ct.at")
    public static int[] field1332;

    @ObfuscatedName("ct.ad")
    public static int[] field1333;

    @ObfuscatedName("ct.f")
    public static class98[] field1334;

    @ObfuscatedName("ct.ai")
    public static float[] field1336;

    @ObfuscatedName("ck.d")
    public static int[] field1345;

    @ObfuscatedName("ck.t")
    public static int[] field1349;

    @ObfuscatedName("ck.f")
    public static boolean[] field1353;

    @ObfuscatedName("cg.a")
    public static boolean field1355;

    @ObfuscatedName("cg.d")
    public static class105 field1368;

    @ObfuscatedName("cg.b")
    public static int field1374;

    @ObfuscatedName("dl.c")
    public static int field1388;

    @ObfuscatedName("dl.j")
    public static class326[] field1390;

    @ObfuscatedName("di.qv")
    public static class110 field1394;

    @ObfuscatedName("g.z")
    public static int field14;

    @ObfuscatedName("di.aq")
    public static String field1400;

    @ObfuscatedName("ds.d")
    public static class144 field1417;

    @ObfuscatedName("ds.t")
    public static int field1418;

    @ObfuscatedName("df.z")
    public static float field1441;

    @ObfuscatedName("df.j")
    public static int field1443;

    @ObfuscatedName("dt.bn")
    public static class326[] field1489;

    @ObfuscatedName("dt.v")
    public static class117[] field1490;

    @ObfuscatedName("dt.r")
    public static int field1496;

    @ObfuscatedName("dn.g")
    public static class326 field1497;

    @ObfuscatedName("dn.fw")
    public static class304 field1502;

    @ObfuscatedName("dp.sb")
    public static long field1511;

    @ObfuscatedName("dp.ok")
    public static class90 field1514;

    @ObfuscatedName("dk.ez")
    public static int field1516;

    @ObfuscatedName("dk.m")
    public static class238 field1518;

    @ObfuscatedName("dk.qi")
    public static int field1525;

    @ObfuscatedName("dr.v")
    public static int[] field1611;

    @ObfuscatedName("dq.bj")
    public static int field1647;

    @ObfuscatedName("s.dv")
    public static class256 field165;

    @ObfuscatedName("dq.bm")
    public static int field1706;

    @ObfuscatedName("dq.bv")
    public static int field1707;

    @ObfuscatedName("dz.a")
    public static int field1718;

    @ObfuscatedName("u.hz")
    public static int field172;

    @ObfuscatedName("dz.b")
    public static int field1721;

    @ObfuscatedName("dz.z")
    public static int field1724;

    @ObfuscatedName("dz.j")
    public static int field1725;

    @ObfuscatedName("dz.c")
    public static int field1727;

    @ObfuscatedName("u.gb")
    public static class327 field173;

    @ObfuscatedName("dz.qd")
    public static class103 field1730;

    @ObfuscatedName("dd.da")
    public static class256 field1733;

    @ObfuscatedName("dd.z")
    public static class254 field1736;

    @ObfuscatedName("dd.gu")
    public static class327[] field1737;

    @ObfuscatedName("dd.dn")
    public static class256 field1740;

    @ObfuscatedName("dd.oh")
    public static class164 field1742;

    @ObfuscatedName("du.x")
    public static int field1745;

    @ObfuscatedName("du.i")
    public static int field1755;

    @ObfuscatedName("du.m")
    public static int field1756;

    @ObfuscatedName("du.v")
    public static int field1757;

    @ObfuscatedName("du.r")
    public static int field1758;

    @ObfuscatedName("du.p")
    public static int field1759;

    @ObfuscatedName("u.z")
    public static ScheduledExecutorService field176;

    @ObfuscatedName("du.y")
    public static int field1760;

    @ObfuscatedName("du.k")
    public static int field1762;

    @ObfuscatedName("du.u")
    public static class139 field1765;

    @ObfuscatedName("ep.lp")
    public static class238 field1777;

    @ObfuscatedName("ew.fy")
    public static class304 field1785;

    @ObfuscatedName("es.u")
    public static int field1796;

    @ObfuscatedName("es.bs")
    public static int field1800;

    @ObfuscatedName("es.bc")
    public static int field1801;

    @ObfuscatedName("es.x")
    public static int field1802;

    @ObfuscatedName("es.y")
    public static int field1803;

    @ObfuscatedName("es.k")
    public static int field1805;

    @ObfuscatedName("es.o")
    public static int field1806;

    @ObfuscatedName("es.s")
    public static int field1807;

    @ObfuscatedName("es.bh")
    public static int field1808;

    @ObfuscatedName("es.w")
    public static int field1810;

    @ObfuscatedName("es.p")
    public static int field1811;

    @ObfuscatedName("es.aa")
    public static int field1812;

    @ObfuscatedName("es.ai")
    public static int field1813;

    @ObfuscatedName("es.at")
    public static int field1815;

    @ObfuscatedName("es.q")
    public static int field1816;

    @ObfuscatedName("e.sm")
    public static int field183;

    @ObfuscatedName("es.ag")
    public static int field1838;

    @ObfuscatedName("e.aw")
    public static class324 field184;

    @ObfuscatedName("es.bv")
    public static boolean[][] field1846;

    @ObfuscatedName("es.e")
    public static int field1848;

    @ObfuscatedName("es.bo")
    public static int field1849;

    @ObfuscatedName("w.gv")
    public static class133 field185;

    @ObfuscatedName("es.bk")
    public static int field1850;

    @ObfuscatedName("es.bt")
    public static int field1851;

    @ObfuscatedName("ee.fd")
    public static class143 field1853;

    @ObfuscatedName("ee.ko")
    public static int field1855;

    @ObfuscatedName("ee.l")
    public static class254 field1856;

    @ObfuscatedName("ee.z")
    public static int[] field1857;

    @ObfuscatedName("em.gf")
    public static class327[] field1861;

    @ObfuscatedName("ec.c")
    public static int[] field1877;

    @ObfuscatedName("ec.u")
    public static int field1878;

    @ObfuscatedName("w.dq")
    public static class256 field189;

    @ObfuscatedName("ed.bl")
    public static class327[] field1913;

    @ObfuscatedName("et.o")
    public static String field1929;

    @ObfuscatedName("et.dr")
    public static class256 field1930;

    @ObfuscatedName("et.sf")
    public static int field1931;

    @ObfuscatedName("ez.rc")
    public static int field1942;

    @ObfuscatedName("ef.t")
    public static class168 field1946;

    @ObfuscatedName("w.dj")
    public static class256 field195;

    @ObfuscatedName("eo.dk")
    public static class256 field1952;

    @ObfuscatedName("ey.du")
    public static class256 field1956;

    @ObfuscatedName("ei.ee")
    public static class315 field1963;

    @ObfuscatedName("ei.d")
    public static short[][] field1964;

    @ObfuscatedName("w.qn")
    public static class96 field197;

    @ObfuscatedName("el.gn")
    public static int[] field1976;

    @ObfuscatedName("ej.ad")
    public static FontMetrics field1991;

    @ObfuscatedName("h.i")
    public static int field2;

    @ObfuscatedName("fz.gw")
    public static class327[] field2003;

    @ObfuscatedName("fu.gz")
    public static int[][] field2007;

    @ObfuscatedName("fu.hu")
    public static int field2012;

    @ObfuscatedName("fu.eu")
    public static int field2013;

    @ObfuscatedName("fx.h")
    public static String field2017;

    @ObfuscatedName("fx.l")
    public static int field2019;

    @ObfuscatedName("fx.c")
    public static class327 field2021;

    @ObfuscatedName("fx.n")
    public static Applet field2023;

    @ObfuscatedName("fi.h")
    public static String field2035;

    @ObfuscatedName("fi.n")
    public static String field2038;

    @ObfuscatedName("ft.b")
    public static File field2045;

    @ObfuscatedName("ft.a")
    public static int field2046;

    @ObfuscatedName("ft.x")
    public static class42 field2057;

    @ObfuscatedName("fj.d")
    public static class326 field2063;

    @ObfuscatedName("fl.gi")
    public static int field2066;

    @ObfuscatedName("fd.c")
    public static boolean[] field2069;

    @ObfuscatedName("fy.a")
    public static class254 field2088;

    @ObfuscatedName("g.az")
    public static boolean field21;

    @ObfuscatedName("fa.i")
    public static boolean field2116;

    @ObfuscatedName("fa.a")
    public static int field2122;

    @ObfuscatedName("aa.bc")
    public static String field217;

    @ObfuscatedName("aa.jo")
    public static class67 field218;

    @ObfuscatedName("aa.jc")
    public static class238 field220;

    @ObfuscatedName("fc.ce")
    public static char field2218;

    @ObfuscatedName("ag.b")
    public static int[] field226;

    @ObfuscatedName("ag.dd")
    public static class256 field229;

    @ObfuscatedName("ag.z")
    public static int field230;

    @ObfuscatedName("fh.s")
    public static String field2342;

    @ObfuscatedName("fv.gs")
    public static class326[] field2350;

    @ObfuscatedName("gx.a")
    public static class238[][] field2357;

    @ObfuscatedName("gn.h")
    public static class254 field2375;

    @ObfuscatedName("gn.qb")
    public static class103 field2376;

    @ObfuscatedName("gk.h")
    public static long field2433;

    @ObfuscatedName("gk.rz")
    public static class74 field2434;

    @ObfuscatedName("gk.df")
    public static long field2435;

    @ObfuscatedName("gk.n")
    public static long field2437;

    @ObfuscatedName("gr.ev")
    public static String field2445;

    @ObfuscatedName("gs.ld")
    public static int field2468;

    @ObfuscatedName("gs.i")
    public static class304 field2471;

    @ObfuscatedName("b.qy")
    public static int field25;

    @ObfuscatedName("ad.ai")
    public static int[] field252;

    @ObfuscatedName("hh.w")
    public static int[] field2531;

    @ObfuscatedName("hd.g")
    public static class226 field2535;

    @ObfuscatedName("hd.n")
    public static class254 field2536;

    @ObfuscatedName("hd.h")
    public static class254 field2537;

    @ObfuscatedName("hd.l")
    public static class254 field2538;

    @ObfuscatedName("hd.a")
    public static class254 field2540;

    @ObfuscatedName("as.dw")
    public static class256 field255;

    @ObfuscatedName("hj.dc")
    public static class256 field2569;

    @ObfuscatedName("as.by")
    public static class326 field257;

    @ObfuscatedName("as.gp")
    public static class326[] field260;

    @ObfuscatedName("as.r")
    public static int field261;

    @ObfuscatedName("hn.qu")
    public static int field2618;

    @ObfuscatedName("hn.u")
    public static String field2619;

    @ObfuscatedName("as.ce")
    public static class64 field262;

    @ObfuscatedName("hn.fr")
    public static class304 field2620;

    @ObfuscatedName("he.z")
    public static boolean field2624;

    @ObfuscatedName("he.d")
    public static class254 field2629;

    @ObfuscatedName("he.p")
    public static int field2630;

    @ObfuscatedName("is.j")
    public static short[] field2643;

    @ObfuscatedName("is.c")
    public static short[] field2646;

    @ObfuscatedName("is.z")
    public static short[][] field2647;

    @ObfuscatedName("ii.m")
    public static int field2659;

    @ObfuscatedName("id.n")
    public static class254 field2660;

    @ObfuscatedName("id.c")
    public static int field2661;

    @ObfuscatedName("iq.j")
    public static class254 field2665;

    @ObfuscatedName("iq.t")
    public static class254 field2666;

    @ObfuscatedName("iq.sg")
    public static class73 field2667;

    @ObfuscatedName("ac.bo")
    public static int field273;

    @ObfuscatedName("ac.i")
    public static class238 field275;

    @ObfuscatedName("ac.l")
    public static long field276;

    @ObfuscatedName("im.eg")
    public static SecureRandom field2819;

    @ObfuscatedName("an.kj")
    public static int field286;

    @ObfuscatedName("ik.r")
    public static class190 field2864;

    @ObfuscatedName("ah.gm")
    public static byte[][] field292;

    @ObfuscatedName("ah.qg")
    public static int field298;

    @ObfuscatedName("h.et")
    public static int field3;

    @ObfuscatedName("al.ff")
    public static int field318;

    @ObfuscatedName("a.eo")
    public static int field32;

    @ObfuscatedName("ip.aj")
    public static GarbageCollectorMXBean field3205;

    @ObfuscatedName("iz.aj")
    public static String field3218;

    @ObfuscatedName("iz.la")
    public static int field3219;

    @ObfuscatedName("iw.d")
    public static int field3246;

    @ObfuscatedName("iw.jj")
    public static class119 field3249;

    @ObfuscatedName("if.n")
    public static class165 field3267;

    @ObfuscatedName("if.m")
    public static class253 field3269;

    @ObfuscatedName("if.lv")
    public static class82 field3279;

    @ObfuscatedName("if.hs")
    public static int field3280;

    @ObfuscatedName("io.j")
    public static int[] field3285;

    @ObfuscatedName("iu.n")
    public static class254 field3296;

    @ObfuscatedName("iu.d")
    public static int[] field3298;

    @ObfuscatedName("iu.f")
    public static int field3299;

    @ObfuscatedName("a.ar")
    public static class319 field33;

    @ObfuscatedName("jb.h")
    public static int field3302;

    @ObfuscatedName("jb.n")
    public static class254 field3306;

    @ObfuscatedName("jy.h")
    public static class262[] field3309;

    @ObfuscatedName("jy.l")
    public static int field3310;

    @ObfuscatedName("aq.at")
    public static int[] field332;

    @ObfuscatedName("jy.n")
    public static class254 field3321;

    @ObfuscatedName("aq.fq")
    public static class302 field333;

    @ObfuscatedName("je.n")
    public static class254 field3334;

    @ObfuscatedName("ja.n")
    public static class254 field3347;

    @ObfuscatedName("jm.j")
    public static int field3354;

    @ObfuscatedName("jm.n")
    public static class254 field3356;

    @ObfuscatedName("jg.h")
    public static class254 field3362;

    @ObfuscatedName("jg.n")
    public static class254 field3363;

    @ObfuscatedName("jg.l")
    public static int field3371;

    @ObfuscatedName("jk.h")
    public static class254 field3375;

    @ObfuscatedName("jk.n")
    public static class254 field3380;

    @ObfuscatedName("ji.bg")
    public static class326 field3389;

    @ObfuscatedName("aw.ef")
    public static int field339;

    @ObfuscatedName("jw.n")
    public static class254 field3394;

    @ObfuscatedName("a.l")
    public static int[] field34;

    @ObfuscatedName("aw.gl")
    public static int[] field340;

    @ObfuscatedName("jv.n")
    public static class254 field3402;

    @ObfuscatedName("aw.fo")
    public static int field341;

    @ObfuscatedName("jh.n")
    public static class254 field3412;

    @ObfuscatedName("jq.h")
    public static class254 field3419;

    @ObfuscatedName("jq.n")
    public static class254 field3437;

    @ObfuscatedName("js.l")
    public static class254 field3441;

    @ObfuscatedName("ab.be")
    public static class334 field346;

    @ObfuscatedName("jz.j")
    public static int field3493;

    @ObfuscatedName("ab.dz")
    public static class256 field351;

    @ObfuscatedName("jz.c")
    public static class254 field3513;

    @ObfuscatedName("jx.h")
    public static class254 field3550;

    @ObfuscatedName("jx.n")
    public static class254 field3561;

    @ObfuscatedName("jj.n")
    public static class254 field3595;

    @ObfuscatedName("jt.h")
    public static class254 field3599;

    @ObfuscatedName("jt.l")
    public static class254 field3600;

    @ObfuscatedName("jt.n")
    public static class254 field3602;

    @ObfuscatedName("jd.co")
    public static int field3625;

    @ObfuscatedName("ae.el")
    public static int[] field364;

    @ObfuscatedName("jp.f")
    public static int[] field3677;

    @ObfuscatedName("ke.y")
    public static String[] field3684;

    @ObfuscatedName("ke.av")
    public static client field3685;

    @ObfuscatedName("kb.bx")
    public static class250 field3686;

    @ObfuscatedName("kt.si")
    public static short[] field3700;

    @ObfuscatedName("kh.rq")
    public static int field3732;

    @ObfuscatedName("kc.gy")
    public static class327 field3747;

    @ObfuscatedName("kc.he")
    public static int field3751;

    @ObfuscatedName("ay.do")
    public static class256 field376;

    @ObfuscatedName("kv.d")
    public static class326[] field3761;

    @ObfuscatedName("ki.g")
    public static int[] field3774;

    @ObfuscatedName("ki.n")
    public static class182 field3775;

    @ObfuscatedName("kn.f")
    public static class326 field3784;

    @ObfuscatedName("kq.b")
    public static int field3797;

    @ObfuscatedName("lb.d")
    public static int field3838;

    @ObfuscatedName("le.dg")
    public static class165 field3851;

    @ObfuscatedName("ln.at")
    public static int field3854;

    @ObfuscatedName("ln.ai")
    public static int[] field3855;

    @ObfuscatedName("ln.ag")
    public static int field3858;

    @ObfuscatedName("lk.h")
    public static int field3890;

    @ObfuscatedName("lk.n")
    public static int field3891;

    @ObfuscatedName("lk.l")
    public static int field3892;

    @ObfuscatedName("lk.c")
    public static int[] field3893;

    @ObfuscatedName("lk.z")
    public static int[] field3894;

    @ObfuscatedName("lk.j")
    public static byte[][] field3895;

    @ObfuscatedName("c.s")
    public static int[] field39;

    @ObfuscatedName("az.ix")
    public static int field399;

    @ObfuscatedName("c.fh")
    public static int field40;

    @ObfuscatedName("az.ed")
    public static int field400;

    @ObfuscatedName("ar.bz")
    public static class326 field402;

    @ObfuscatedName("ar.g")
    public static String[] field403;

    @ObfuscatedName("ar.gq")
    public static class327[] field404;

    @ObfuscatedName("ar.ha")
    public static int field407;

    @ObfuscatedName("ax.jw")
    public static class238 field409;

    @ObfuscatedName("av.g")
    public static int field420;

    @ObfuscatedName("av.pe")
    public static class313 field421;

    @ObfuscatedName("av.i")
    public static class106 field423;

    @ObfuscatedName("bf.e")
    public static int field442;

    @ObfuscatedName("c.j")
    public static byte[][][] field45;

    @ObfuscatedName("bf.n")
    public static class162 field456;

    @ObfuscatedName("bi.pj")
    public static class299 field481;

    @ObfuscatedName("bi.dp")
    public static class256 field485;

    @ObfuscatedName("bx.h")
    public static File field489;

    @ObfuscatedName("bu.t")
    public static int[] field494;

    @ObfuscatedName("bu.b")
    public static byte[][][] field495;

    @ObfuscatedName("bu.c")
    public static byte[][][] field497;

    @ObfuscatedName("bu.z")
    public static byte[][][] field498;

    @ObfuscatedName("bu.j")
    public static int[][] field499;

    @ObfuscatedName("bu.i")
    public static int[] field501;

    @ObfuscatedName("bu.m")
    public static int[] field502;

    @ObfuscatedName("bu.v")
    public static int[][][] field503;

    @ObfuscatedName("bu.a")
    public static byte[][][] field504;

    @ObfuscatedName("bu.g")
    public static byte[][][] field509;

    @ObfuscatedName("bu.fc")
    public static int field512;

    @ObfuscatedName("be.ft")
    public static class165 field521;

    @ObfuscatedName("be.z")
    public static class326 field522;

    @ObfuscatedName("be.a")
    public static int[] field523;

    @ObfuscatedName("bj.db")
    public static class161 field529;

    @ObfuscatedName("z.bh")
    public static String field53;

    @ObfuscatedName("bj.dt")
    public static class256 field530;

    @ObfuscatedName("bm.mu")
    public static int field532;

    @ObfuscatedName("bm.sc")
    public static class333 field533;

    @ObfuscatedName("bv.de")
    public static class256 field549;

    @ObfuscatedName("bc.nr")
    public static class238[] field555;

    @ObfuscatedName("bh.ep")
    public static class256 field569;

    @ObfuscatedName("j.fe")
    public static class161 field57;

    @ObfuscatedName("bo.se")
    public static class170 field574;

    @ObfuscatedName("bk.sv")
    public static class331 field587;

    @ObfuscatedName("j.rs")
    public static int field59;

    @ObfuscatedName("bt.b")
    public static Thread field590;

    @ObfuscatedName("bt.gj")
    public static int[] field591;

    @ObfuscatedName("d.jg")
    public static class238 field62;

    @ObfuscatedName("bs.go")
    public static class327[] field621;

    @ObfuscatedName("ba.k")
    public static class190 field622;

    @ObfuscatedName("ba.j")
    public static int field624;

    @ObfuscatedName("ba.kq")
    public static int field625;

    @ObfuscatedName("ba.kl")
    public static int field628;

    @ObfuscatedName("client.hb")
    public static int field653;

    @ObfuscatedName("d.jd")
    public static int field66;

    @ObfuscatedName("client.gg")
    public static class326[] field697;

    @ObfuscatedName("t.h")
    public static class254 field71;

    @ObfuscatedName("f.e")
    public static int[] field74;

    @ObfuscatedName("l.ri")
    public static int field8;

    @ObfuscatedName("i.dx")
    public static class256 field83;

    @ObfuscatedName("i.rp")
    public static int field84;

    @ObfuscatedName("client.so")
    public static class7 field898;

    @ObfuscatedName("l.g")
    public static File field9;

    @ObfuscatedName("v.fx")
    public static long field97;

    @ObfuscatedName("bw.iz")
    public static int field974;

    @ObfuscatedName("v.cg")
    public static boolean field98;

    @ObfuscatedName("bb.pd")
    public static class327 field988;

    @ObfuscatedName("bb.f")
    public static class231 field991;

    @ObfuscatedName("bl.b")
    public static class72[] field997;

    @ObfuscatedName("eb.n(B)[Lig;")
    public static class259[] method3070() {
        return new class259[] { class259.field3292, class259.field3291, class259.field3290 };
    }

    @ObfuscatedName("bg.n(I)[Llw;")
    public static class325[] method1820() {
        return new class325[] { class325.field3869, class325.field3865, class325.field3866 };
    }

    @ObfuscatedName("z.n(Lij;I)V")
    public static void method67(class254 arg0) {
        field3356 = arg0;
    }

    @ObfuscatedName("id.h(Ljava/lang/CharSequence;I)Z")
    public static boolean method4372(CharSequence arg0) {
        return class311.method2517(arg0, 10, true);
    }

    @ObfuscatedName("ex.h(Ljava/lang/String;Ljava/lang/String;ZB)Ldn;")
    public static class118 method3209(String arg0, String arg1, boolean arg2) {
        File var3 = new File(field2045, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class118(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (field1496 == 33) {
            var6 = "_rc";
        } else if (field1496 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(field2619, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class118(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class118(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("if.c(I)V")
    public static void method4600() {
        class267.field3388.method3899();
        class267.field3377.method3899();
    }

    @ObfuscatedName("ei.a(IZB)Ljava/lang/String;")
    public static String method3137(int arg0, boolean arg1) {
        return arg1 && arg0 >= 0 ? class311.method936(arg0, 10, arg1) : Integer.toString(arg0);
    }

    @ObfuscatedName("jr.m(CI)Z")
    public static boolean method5071(char arg0) {
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("cx.h(Lit;II)V")
    public static void method1875(class256 arg0, int arg1) {
        if (field622 == null) {
            class257.method1934((class256) null, 255, 255, 0, (byte) 0, true);
            class257.field3275[arg1] = arg0;
        } else {
            field622.field2423 = arg1 * 8 + 5;
            int var2 = field622.method3562();
            int var3 = field622.method3562();
            arg0.method4562(var2, var3);
        }
    }

    @ObfuscatedName("t.b(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method121(String arg0) throws ClassNotFoundException {
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else if (arg0.equals("void")) {
            return Void.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @ObfuscatedName("fr.ae(I)I")
    public static int method3323() {
        int var0 = 0;
        if (field3205 == null || !field3205.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        field3205 = var2;
                        class53.field459 = -1L;
                        class53.field432 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (field3205 != null) {
            long var4 = class192.method81();
            long var6 = field3205.getCollectionTime();
            if (class53.field432 != -1L) {
                long var8 = var6 - class53.field432;
                long var10 = var4 - class53.field459;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            class53.field432 = var6;
            class53.field459 = var4;
        }
        return var0;
    }

    @ObfuscatedName("e.a(I)V")
    public static void method272() {
        class89.field1213 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class89.field1218[var0] = null;
            class89.field1212[var0] = 1;
        }
    }

    @ObfuscatedName("cf.as(ILcn;ZI)I")
    public static int method1864(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = class76.field1053[--field14];
            class76.field1053[++field14 - 1] = client.field897[var3].method104();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = class76.field1053[--field14];
            class76.field1053[++field14 - 1] = client.field897[var4].field67;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = class76.field1053[--field14];
            class76.field1053[++field14 - 1] = client.field897[var5].field63;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = class76.field1053[--field14];
            class76.field1053[++field14 - 1] = client.field897[var6].field64;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = class76.field1053[--field14];
            class76.field1053[++field14 - 1] = client.field897[var7].field65;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = class76.field1053[--field14];
            class76.field1053[++field14 - 1] = client.field897[var8].field61;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = class76.field1053[--field14];
            int var10 = client.field897[var9].method86();
            class76.field1053[++field14 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = class76.field1053[--field14];
            int var12 = client.field897[var11].method86();
            class76.field1053[++field14 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = class76.field1053[--field14];
            int var14 = client.field897[var13].method86();
            class76.field1053[++field14 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = class76.field1053[--field14];
            int var16 = client.field897[var15].method86();
            class76.field1053[++field14 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = class76.field1053[--field14] == 1;
            if (field898 != null) {
                field898.method50(class7.field43, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = class76.field1053[--field14] == 1;
            if (field898 != null) {
                field898.method50(class7.field38, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            field14 -= 2;
            boolean var19 = class76.field1053[field14] == 1;
            boolean var20 = class76.field1053[field14 + 1] == 1;
            if (field898 != null) {
                client.field799.field626 = var20;
                field898.method50(client.field799, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = class76.field1053[--field14] == 1;
            if (field898 != null) {
                field898.method50(class7.field37, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = class76.field1053[--field14] == 1;
            if (field898 != null) {
                field898.method50(class7.field36, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            class76.field1053[++field14 - 1] = field898 == null ? 0 : field898.field42.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = class76.field1053[--field14];
            class8 var24 = (class8) field898.field42.get(var23);
            class76.field1053[++field14 - 1] = var24.field48;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = class76.field1053[--field14];
            class8 var26 = (class8) field898.field42.get(var25);
            class76.field1054[++field3838 - 1] = var26.method64();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = class76.field1053[--field14];
            class8 var28 = (class8) field898.field42.get(var27);
            class76.field1054[++field3838 - 1] = var28.method57();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = class76.field1053[--field14];
            class8 var30 = (class8) field898.field42.get(var29);
            long var31 = class192.method81() - field1511 - var30.field49;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            class76.field1054[++field3838 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = class76.field1053[--field14];
            class8 var38 = (class8) field898.field42.get(var37);
            class76.field1053[++field14 - 1] = var38.field55.field64;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = class76.field1053[--field14];
            class8 var40 = (class8) field898.field42.get(var39);
            class76.field1053[++field14 - 1] = var40.field55.field63;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = class76.field1053[--field14];
            class8 var42 = (class8) field898.field42.get(var41);
            class76.field1053[++field14 - 1] = var42.field55.field67;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ay.fy(I)V")
    public static final void method669() {
        if (client.field677 > 0) {
            client.method1932();
        } else {
            client.field680.method5081();
            client.method3117(40);
            field521 = client.field886.method2061();
            client.field886.method2056();
        }
    }

    @ObfuscatedName("jn.al(ILcn;ZI)I")
    public static int method5076(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 5306) {
            class76.field1053[++field14 - 1] = client.method281();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = class76.field1053[--field14];
            if (var3 == 1 || var3 == 2) {
                client.method156(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            class76.field1053[++field14 - 1] = field2667.field1016;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = class76.field1053[--field14];
            if (var4 == 1 || var4 == 2) {
                field2667.field1016 = var4;
                class73.method1874();
            }
            return 1;
        } else if (arg0 == 5310) {
            field14--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bc.ae(ILcn;ZB)I")
    public static int method1036(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 6500) {
            class76.field1053[++field14 - 1] = class72.method3401() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class72 var3 = class72.method2035();
            if (var3 == null) {
                class76.field1053[++field14 - 1] = -1;
                class76.field1053[++field14 - 1] = 0;
                class76.field1054[++field3838 - 1] = "";
                class76.field1053[++field14 - 1] = 0;
                class76.field1053[++field14 - 1] = 0;
                class76.field1054[++field3838 - 1] = "";
            } else {
                class76.field1053[++field14 - 1] = var3.field1001;
                class76.field1053[++field14 - 1] = var3.field1002;
                class76.field1054[++field3838 - 1] = var3.field1005;
                class76.field1053[++field14 - 1] = var3.field1006;
                class76.field1053[++field14 - 1] = var3.field1003;
                class76.field1054[++field3838 - 1] = var3.field993;
            }
            return 1;
        } else if (arg0 == 6502) {
            class72 var4 = class72.method134();
            if (var4 == null) {
                class76.field1053[++field14 - 1] = -1;
                class76.field1053[++field14 - 1] = 0;
                class76.field1054[++field3838 - 1] = "";
                class76.field1053[++field14 - 1] = 0;
                class76.field1053[++field14 - 1] = 0;
                class76.field1054[++field3838 - 1] = "";
            } else {
                class76.field1053[++field14 - 1] = var4.field1001;
                class76.field1053[++field14 - 1] = var4.field1002;
                class76.field1054[++field3838 - 1] = var4.field1005;
                class76.field1053[++field14 - 1] = var4.field1006;
                class76.field1053[++field14 - 1] = var4.field1003;
                class76.field1054[++field3838 - 1] = var4.field993;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = class76.field1053[--field14];
            class72 var6 = null;
            for (int var7 = 0; var7 < class72.field1004; var7++) {
                if (field997[var7].field1001 == var5) {
                    var6 = field997[var7];
                    break;
                }
            }
            if (var6 == null) {
                class76.field1053[++field14 - 1] = -1;
                class76.field1053[++field14 - 1] = 0;
                class76.field1054[++field3838 - 1] = "";
                class76.field1053[++field14 - 1] = 0;
                class76.field1053[++field14 - 1] = 0;
                class76.field1054[++field3838 - 1] = "";
            } else {
                class76.field1053[++field14 - 1] = var6.field1001;
                class76.field1053[++field14 - 1] = var6.field1002;
                class76.field1054[++field3838 - 1] = var6.field1005;
                class76.field1053[++field14 - 1] = var6.field1006;
                class76.field1053[++field14 - 1] = var6.field1003;
                class76.field1054[++field3838 - 1] = var6.field993;
            }
            return 1;
        } else if (arg0 == 6507) {
            field14 -= 4;
            int var8 = class76.field1053[field14];
            boolean var9 = class76.field1053[field14 + 1] == 1;
            int var10 = class76.field1053[field14 + 2];
            boolean var11 = class76.field1053[field14 + 3] == 1;
            class72.method3383(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = class76.field1053[--field14];
            if (var12 >= 0 && var12 < class72.field1004) {
                class72 var13 = field997[var12];
                class76.field1053[++field14 - 1] = var13.field1001;
                class76.field1053[++field14 - 1] = var13.field1002;
                class76.field1054[++field3838 - 1] = var13.field1005;
                class76.field1053[++field14 - 1] = var13.field1006;
                class76.field1053[++field14 - 1] = var13.field1003;
                class76.field1054[++field3838 - 1] = var13.field993;
            } else {
                class76.field1053[++field14 - 1] = -1;
                class76.field1053[++field14 - 1] = 0;
                class76.field1054[++field3838 - 1] = "";
                class76.field1053[++field14 - 1] = 0;
                class76.field1053[++field14 - 1] = 0;
                class76.field1054[++field3838 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field701 = class76.field1053[--field14] == 1;
            return 1;
        } else if (arg0 == 6513) {
            field14 -= 2;
            int var14 = class76.field1053[field14];
            int var15 = class76.field1053[field14 + 1];
            class270 var16 = class270.method53(var15);
            if (var16.method4770()) {
                class76.field1054[++field3838 - 1] = class277.method17(var14).method5003(var15, var16.field3400);
            } else {
                class76.field1053[++field14 - 1] = class277.method17(var14).method4985(var15, var16.field3399);
            }
            return 1;
        } else if (arg0 == 6514) {
            field14 -= 2;
            int var17 = class76.field1053[field14];
            int var18 = class76.field1053[field14 + 1];
            class270 var19 = class270.method53(var18);
            if (var19.method4770()) {
                class76.field1054[++field3838 - 1] = class274.method4676(var17).method4874(var18, var19.field3400);
            } else {
                class76.field1053[++field14 - 1] = class274.method4676(var17).method4876(var18, var19.field3399);
            }
            return 1;
        } else if (arg0 == 6515) {
            field14 -= 2;
            int var20 = class76.field1053[field14];
            int var21 = class76.field1053[field14 + 1];
            class270 var22 = class270.method53(var21);
            if (var22.method4770()) {
                class76.field1054[++field3838 - 1] = class275.method4283(var20).method4959(var21, var22.field3400);
            } else {
                class76.field1053[++field14 - 1] = class275.method4283(var20).method4922(var21, var22.field3399);
            }
            return 1;
        } else if (arg0 == 6516) {
            field14 -= 2;
            int var23 = class76.field1053[field14];
            int var24 = class76.field1053[field14 + 1];
            class270 var25 = class270.method53(var24);
            if (var25.method4770()) {
                class76.field1054[++field3838 - 1] = class271.method5316(var23).method4791(var24, var25.field3400);
            } else {
                class76.field1053[++field14 - 1] = class271.method5316(var23).method4790(var24, var25.field3399);
            }
            return 1;
        } else if (arg0 == 6518) {
            class76.field1053[++field14 - 1] = client.field637 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            class76.field1053[++field14 - 1] = client.field636 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            field3838--;
            field14--;
            return 1;
        } else if (arg0 == 6523) {
            field3838--;
            field14--;
            return 1;
        } else if (arg0 == 6524) {
            class76.field1053[++field14 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            class76.field1053[++field14 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            class76.field1053[++field14 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fv.fa(I)V")
    public static final void method3425() {
        if (field2376 != null) {
            field2376.method2234();
        }
        if (field1730 != null) {
            field1730.method2234();
        }
    }

    @ObfuscatedName("ei.gm(I)V")
    public static void method3148() {
        class180 var0 = class180.method1090(class177.field2254, client.field886.field1271);
        var0.field2345.method3646(client.method281());
        var0.field2345.method3508(field1878);
        var0.field2345.method3508(field442);
        client.field886.method2059(var0);
    }

    @ObfuscatedName("ei.gr(IIIIZB)V")
    public static final void method3138(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = client.field880;
        } else if (var5 >= 100) {
            var6 = client.field881;
        } else {
            var6 = (client.field881 - client.field880) * var5 / 100 + client.field880;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < client.field683) {
            short var8 = client.field683;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > client.field848) {
                var6 = client.field848;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class323.method5591();
                    class323.method5630(arg0, arg1, var10, arg3, -16777216);
                    class323.method5630(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > client.field883) {
            short var11 = client.field883;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < client.field815) {
                var6 = client.field815;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class323.method5591();
                    class323.method5630(arg0, arg1, arg2, var13, -16777216);
                    class323.method5630(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        client.field892 = arg3 * var6 / 334;
        if (client.field890 != arg2 || client.field742 != arg3) {
            client.method1835(arg2, arg3);
        }
        client.field888 = arg0;
        client.field887 = arg1;
        client.field890 = arg2;
        client.field742 = arg3;
    }

    @ObfuscatedName("gc.ip(II)Ljava/lang/String;")
    public static final String method3715(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class81.field1109 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class81.method268(65408) + var1.substring(0, var1.length() - 8) + class245.field2921 + " " + class81.field1102 + var1 + class81.field1100 + class81.field1099;
        } else if (var1.length() > 6) {
            return " " + class81.method268(16777215) + var1.substring(0, var1.length() - 4) + class245.field3126 + " " + class81.field1102 + var1 + class81.field1100 + class81.field1099;
        } else {
            return " " + class81.method268(16776960) + var1 + class81.field1099;
        }
    }

    @ObfuscatedName("bh.iw(IIIZB)V")
    public static final void method1047(int arg0, int arg1, int arg2, boolean arg3) {
        if (class238.method501(arg0)) {
            client.method22(field2357[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ce.io(Liq;III)V")
    public static void method1944(class238 arg0, int arg1, int arg2) {
        if (arg0.field2678 == 0) {
            arg0.field2686 = arg0.field2710;
        } else if (arg0.field2678 == 1) {
            arg0.field2686 = (arg1 - arg0.field2692) / 2 + arg0.field2710;
        } else if (arg0.field2678 == 2) {
            arg0.field2686 = arg1 - arg0.field2692 - arg0.field2710;
        } else if (arg0.field2678 == 3) {
            arg0.field2686 = arg0.field2710 * arg1 >> 14;
        } else if (arg0.field2678 == 4) {
            arg0.field2686 = (arg0.field2710 * arg1 >> 14) + (arg1 - arg0.field2692) / 2;
        } else {
            arg0.field2686 = arg1 - arg0.field2692 - (arg0.field2710 * arg1 >> 14);
        }
        if (arg0.field2682 == 0) {
            arg0.field2787 = arg0.field2668;
        } else if (arg0.field2682 == 1) {
            arg0.field2787 = (arg2 - arg0.field2807) / 2 + arg0.field2668;
        } else if (arg0.field2682 == 2) {
            arg0.field2787 = arg2 - arg0.field2807 - arg0.field2668;
        } else if (arg0.field2682 == 3) {
            arg0.field2787 = arg0.field2668 * arg2 >> 14;
        } else if (arg0.field2682 == 4) {
            arg0.field2787 = (arg0.field2668 * arg2 >> 14) + (arg2 - arg0.field2807) / 2;
        } else {
            arg0.field2787 = arg2 - arg0.field2807 - (arg0.field2668 * arg2 >> 14);
        }
    }

    @ObfuscatedName("bo.jd(IB)V")
    public static final void method1055(int arg0) {
        if (class238.method501(arg0)) {
            client.method2654(field2357[arg0], -1);
        }
    }
}
