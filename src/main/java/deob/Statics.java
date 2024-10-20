package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("r.rk")
    public static int field102;

    @ObfuscatedName("k.n")
    public static int[] field11;

    @ObfuscatedName("client.do")
    public static class238 field1194;

    @ObfuscatedName("bz.ay")
    public static client field1202;

    @ObfuscatedName("bs.fs")
    public static int field1271;

    @ObfuscatedName("bp.fj")
    public static int[] field1277;

    @ObfuscatedName("cg.t")
    public static class149 field1293;

    @ObfuscatedName("cg.q")
    public static int[] field1301;

    @ObfuscatedName("cy.g")
    public static int field1331;

    @ObfuscatedName("cy.t")
    public static int field1338;

    @ObfuscatedName("cy.i")
    public static class217 field1341;

    @ObfuscatedName("cy.u")
    public static class217 field1342;

    @ObfuscatedName("cy.e")
    public static int[] field1343;

    @ObfuscatedName("cd.ce")
    public static class238 field1354;

    @ObfuscatedName("cd.lr")
    public static int field1359;

    @ObfuscatedName("cx.or")
    public static class101 field1365;

    @ObfuscatedName("cb.bx")
    public static int field1378;

    @ObfuscatedName("ck.t")
    public static class110 field1400;

    @ObfuscatedName("cl.r")
    public static class236 field1407;

    @ObfuscatedName("cl.l")
    public static String field1408;

    @ObfuscatedName("ct.d")
    public static boolean field1410;

    @ObfuscatedName("ct.e")
    public static class286 field1412;

    @ObfuscatedName("ct.p")
    public static class286 field1413;

    @ObfuscatedName("ct.o")
    public static class286 field1416;

    @ObfuscatedName("ct.g")
    public static class286 field1428;

    @ObfuscatedName("ct.v")
    public static class286[] field1435;

    @ObfuscatedName("ct.bq")
    public static String field1438;

    @ObfuscatedName("ci.ck")
    public static int field1492;

    @ObfuscatedName("cj.cm")
    public static class238 field1502;

    @ObfuscatedName("cj.fu")
    public static int field1505;

    @ObfuscatedName("cm.b")
    public static class122[] field1515;

    @ObfuscatedName("cm.s")
    public static int field1518;

    @ObfuscatedName("cw.gq")
    public static int field1545;

    @ObfuscatedName("cw.cn")
    public static char field1547;

    @ObfuscatedName("dn.ad")
    public static int[] field1564;

    @ObfuscatedName("dn.ah")
    public static float[] field1566;

    @ObfuscatedName("dn.r")
    public static byte[] field1568;

    @ObfuscatedName("dn.g")
    public static int field1569;

    @ObfuscatedName("dn.v")
    public static int field1570;

    @ObfuscatedName("dn.t")
    public static int field1571;

    @ObfuscatedName("dn.y")
    public static int field1572;

    @ObfuscatedName("dn.o")
    public static class103[] field1573;

    @ObfuscatedName("dn.i")
    public static class107[] field1574;

    @ObfuscatedName("dn.u")
    public static class114[] field1575;

    @ObfuscatedName("dn.b")
    public static class119[] field1576;

    @ObfuscatedName("dn.l")
    public static float[] field1577;

    @ObfuscatedName("dn.j")
    public static int[] field1578;

    @ObfuscatedName("dn.ai")
    public static float[] field1584;

    @ObfuscatedName("dn.m")
    public static float[] field1585;

    @ObfuscatedName("dn.n")
    public static float[] field1586;

    @ObfuscatedName("dn.f")
    public static boolean[] field1588;

    @ObfuscatedName("dn.ab")
    public static int[] field1589;

    @ObfuscatedName("dn.ae")
    public static float[] field1592;

    @ObfuscatedName("dn.w")
    public static float[] field1593;

    @ObfuscatedName("k.os")
    public static class108 field16;

    @ObfuscatedName("dr.y")
    public static int[] field1605;

    @ObfuscatedName("dr.o")
    public static boolean[] field1607;

    @ObfuscatedName("dr.t")
    public static int[] field1610;

    @ObfuscatedName("dk.i")
    public static class102 field1615;

    @ObfuscatedName("dk.dv")
    public static int field1632;

    @ObfuscatedName("dk.g")
    public static ScheduledExecutorService field1634;

    @ObfuscatedName("de.t")
    public static short[][] field1649;

    @ObfuscatedName("di.cb")
    public static boolean field1651;

    @ObfuscatedName("di.ba")
    public static class71 field1654;

    @ObfuscatedName("di.pb")
    public static int field1657;

    @ObfuscatedName("di.a")
    public static String field1658;

    @ObfuscatedName("dy.o")
    public static class159 field1676;

    @ObfuscatedName("ds.g")
    public static float field1699;

    @ObfuscatedName("e.gl")
    public static class286[] field17;

    @ObfuscatedName("ds.v")
    public static int field1700;

    @ObfuscatedName("dz.al")
    public static int field1751;

    @ObfuscatedName("dw.p")
    public static String[] field1755;

    @ObfuscatedName("dh.t")
    public static class286 field1759;

    @ObfuscatedName("dh.v")
    public static short[] field1768;

    @ObfuscatedName("dt.b")
    public static int[] field1874;

    @ObfuscatedName("e.z")
    public static String field19;

    @ObfuscatedName("eb.bn")
    public static int field1917;

    @ObfuscatedName("eb.bd")
    public static int field1972;

    @ObfuscatedName("eb.bl")
    public static int field1973;

    @ObfuscatedName("ew.q")
    public static int field1987;

    @ObfuscatedName("ew.g")
    public static int field1988;

    @ObfuscatedName("ew.t")
    public static int field1989;

    @ObfuscatedName("el.h")
    public static int field2008;

    @ObfuscatedName("el.i")
    public static int field2009;

    @ObfuscatedName("el.b")
    public static int field2011;

    @ObfuscatedName("el.f")
    public static int field2012;

    @ObfuscatedName("el.j")
    public static int field2013;

    @ObfuscatedName("el.x")
    public static int field2014;

    @ObfuscatedName("el.c")
    public static int field2015;

    @ObfuscatedName("el.u")
    public static int field2018;

    @ObfuscatedName("el.l")
    public static class144 field2019;

    @ObfuscatedName("ep.du")
    public static int field2024;

    @ObfuscatedName("ep.hz")
    public static class217 field2032;

    @ObfuscatedName("ep.h")
    public static class174 field2034;

    @ObfuscatedName("ek.bf")
    public static int field2043;

    @ObfuscatedName("ek.g")
    public static class236 field2046;

    @ObfuscatedName("em.h")
    public static int field2047;

    @ObfuscatedName("em.a")
    public static int field2052;

    @ObfuscatedName("em.bn")
    public static int field2054;

    @ObfuscatedName("em.x")
    public static int field2064;

    @ObfuscatedName("em.c")
    public static int field2065;

    @ObfuscatedName("em.l")
    public static int field2067;

    @ObfuscatedName("em.z")
    public static int field2068;

    @ObfuscatedName("em.n")
    public static int field2071;

    @ObfuscatedName("em.m")
    public static int field2072;

    @ObfuscatedName("em.ae")
    public static int field2073;

    @ObfuscatedName("em.ai")
    public static int field2074;

    @ObfuscatedName("em.ab")
    public static int field2076;

    @ObfuscatedName("em.w")
    public static int field2078;

    @ObfuscatedName("em.bo")
    public static int field2091;

    @ObfuscatedName("em.bb")
    public static int field2094;

    @ObfuscatedName("em.by")
    public static boolean[][] field2103;

    @ObfuscatedName("em.j")
    public static int field2104;

    @ObfuscatedName("em.bd")
    public static int field2106;

    @ObfuscatedName("em.bl")
    public static int field2107;

    @ObfuscatedName("em.bi")
    public static int field2108;

    @ObfuscatedName("em.ah")
    public static int field2109;

    @ObfuscatedName("eo.q")
    public static class79[] field2110;

    @ObfuscatedName("ee.dr")
    public static class238 field2113;

    @ObfuscatedName("ee.pp")
    public static class115 field2114;

    @ObfuscatedName("et.fl")
    public static int field2122;

    @ObfuscatedName("ev.gj")
    public static class287[] field2130;

    @ObfuscatedName("ev.cv")
    public static class238 field2134;

    @ObfuscatedName("ei.g")
    public static int field2139;

    @ObfuscatedName("ec.ht")
    public static int field2141;

    @ObfuscatedName("ec.nw")
    public static byte field2161;

    @ObfuscatedName("eu.rj")
    public static class290 field2191;

    @ObfuscatedName("ex.j")
    public static class48 field2195;

    @ObfuscatedName("en.bo")
    public static String field2203;

    @ObfuscatedName("en.v")
    public static int field2204;

    @ObfuscatedName("eg.br")
    public static class286[] field2215;

    @ObfuscatedName("ej.e")
    public static int field2224;

    @ObfuscatedName("ej.k")
    public static String field2225;

    @ObfuscatedName("ej.r")
    public static short[] field2229;

    @ObfuscatedName("ej.d")
    public static Applet field2231;

    @ObfuscatedName("ez.k")
    public static String field2244;

    @ObfuscatedName("ez.fr")
    public static int field2246;

    @ObfuscatedName("ez.d")
    public static String field2248;

    @ObfuscatedName("ez.n")
    public static int[] field2250;

    @ObfuscatedName("ef.p")
    public static File field2256;

    @ObfuscatedName("ef.q")
    public static File field2257;

    @ObfuscatedName("fl.k")
    public static File field2265;

    @ObfuscatedName("fu.lc")
    public static int field2269;

    @ObfuscatedName("fu.ip")
    public static class217 field2271;

    @ObfuscatedName("fm.q")
    public static int field2312;

    @ObfuscatedName("fm.s")
    public static int field2313;

    @ObfuscatedName("fp.e")
    public static int field2326;

    @ObfuscatedName("fc.u")
    public static int[] field2333;

    @ObfuscatedName("fj.ma")
    public static class96 field2339;

    @ObfuscatedName("fv.b")
    public static int[][][] field2351;

    @ObfuscatedName("fk.pl")
    public static int field2360;

    @ObfuscatedName("fk.ad")
    public static FontMetrics field2361;

    @ObfuscatedName("fk.t")
    public static int[] field2362;

    @ObfuscatedName("r.gr")
    public static class7[] field239;

    @ObfuscatedName("fe.bi")
    public static String field2393;

    @ObfuscatedName("r.ku")
    public static class88 field240;

    @ObfuscatedName("fh.g")
    public static byte[][][] field2412;

    @ObfuscatedName("fh.gt")
    public static int field2419;

    @ObfuscatedName("fw.k")
    public static long field2420;

    @ObfuscatedName("fw.d")
    public static long field2422;

    @ObfuscatedName("ft.ik")
    public static class74 field2427;

    @ObfuscatedName("fs.bx")
    public static class286[] field2432;

    @ObfuscatedName("fs.s")
    public static class217[][] field2433;

    @ObfuscatedName("fa.k")
    public static int field2453;

    @ObfuscatedName("fa.pm")
    public static int field2455;

    @ObfuscatedName("fa.g")
    public static int[] field2457;

    @ObfuscatedName("p.k")
    public static class243[] field25;

    @ObfuscatedName("v.fe")
    public static class138 field250;

    @ObfuscatedName("gx.e")
    public static class236 field2518;

    @ObfuscatedName("gx.d")
    public static class236 field2519;

    @ObfuscatedName("gx.k")
    public static class236 field2520;

    @ObfuscatedName("gx.r")
    public static int field2521;

    @ObfuscatedName("gx.s")
    public static class236 field2523;

    @ObfuscatedName("gx.p")
    public static class205 field2524;

    @ObfuscatedName("gx.i")
    public static class111 field2525;

    @ObfuscatedName("v.dn")
    public static class238 field255;

    @ObfuscatedName("gy.qw")
    public static class161 field2553;

    @ObfuscatedName("t.gf")
    public static int field257;

    @ObfuscatedName("t.er")
    public static class264 field258;

    @ObfuscatedName("ht.s")
    public static class287 field2604;

    @ObfuscatedName("ht.g")
    public static short[][] field2605;

    @ObfuscatedName("ht.v")
    public static byte[][] field2608;

    @ObfuscatedName("hu.bq")
    public static class232 field2615;

    @ObfuscatedName("hx.gz")
    public static int field2622;

    @ObfuscatedName("y.o")
    public static int[] field263;

    @ObfuscatedName("hj.r")
    public static boolean[] field2649;

    @ObfuscatedName("hj.y")
    public static class236 field2652;

    @ObfuscatedName("hj.t")
    public static class236 field2682;

    @ObfuscatedName("y.ji")
    public static int field269;

    @ObfuscatedName("i.aa")
    public static class284 field276;

    @ObfuscatedName("i.fo")
    public static byte[][] field278;

    @ObfuscatedName("hj.v")
    public static class236 field2783;

    @ObfuscatedName("hy.pz")
    public static int field2821;

    @ObfuscatedName("he.ad")
    public static int[] field2855;

    @ObfuscatedName("f.d")
    public static int field299;

    @ObfuscatedName("f.s")
    public static class236 field301;

    @ObfuscatedName("f.fn")
    public static class287 field303;

    @ObfuscatedName("f.ph")
    public static int field304;

    @ObfuscatedName("f.fd")
    public static class287 field306;

    @ObfuscatedName("hw.cr")
    public static class238 field3141;

    @ObfuscatedName("hw.v")
    public static int field3145;

    @ObfuscatedName("hz.v")
    public static int field3191;

    @ObfuscatedName("hz.ff")
    public static int[] field3192;

    @ObfuscatedName("hr.ar")
    public static String field3203;

    @ObfuscatedName("hr.r")
    public static int[] field3208;

    @ObfuscatedName("x.v")
    public static int field321;

    @ObfuscatedName("x.j")
    public static String[] field322;

    @ObfuscatedName("ip.q")
    public static Thread field3236;

    @ObfuscatedName("ip.s")
    public static int[] field3239;

    @ObfuscatedName("ia.i")
    public static boolean field3264;

    @ObfuscatedName("ia.u")
    public static class235 field3265;

    @ObfuscatedName("ia.d")
    public static class160 field3266;

    @ObfuscatedName("ia.e")
    public static long field3269;

    @ObfuscatedName("c.dz")
    public static int field327;

    @ObfuscatedName("is.d")
    public static class236 field3284;

    @ObfuscatedName("iq.d")
    public static class236 field3289;

    @ObfuscatedName("ie.d")
    public static class236 field3292;

    @ObfuscatedName("ie.e")
    public static int field3298;

    @ObfuscatedName("h.qf")
    public static class14 field331;

    @ObfuscatedName("ih.d")
    public static class236 field3312;

    @ObfuscatedName("ib.d")
    public static class236 field3320;

    @ObfuscatedName("ii.k")
    public static class236 field3321;

    @ObfuscatedName("ii.d")
    public static class236 field3322;

    @ObfuscatedName("ii.ay")
    public static int field3337;

    @ObfuscatedName("iv.d")
    public static class236 field3342;

    @ObfuscatedName("ig.k")
    public static class236 field3350;

    @ObfuscatedName("ig.e")
    public static int field3351;

    @ObfuscatedName("ig.d")
    public static class236 field3358;

    @ObfuscatedName("a.gc")
    public static class287[] field336;

    @ObfuscatedName("iz.k")
    public static class236 field3362;

    @ObfuscatedName("iz.d")
    public static class236 field3367;

    @ObfuscatedName("ik.d")
    public static class236 field3381;

    @ObfuscatedName("ik.ah")
    public static int[] field3384;

    @ObfuscatedName("ix.d")
    public static class236 field3389;

    @ObfuscatedName("a.ej")
    public static class264 field339;

    @ObfuscatedName("ix.b")
    public static int field3392;

    @ObfuscatedName("iu.d")
    public static class236 field3398;

    @ObfuscatedName("q.og")
    public static class287 field34;

    @ObfuscatedName("im.d")
    public static class236 field3406;

    @ObfuscatedName("in.k")
    public static class236 field3412;

    @ObfuscatedName("in.e")
    public static class236 field3413;

    @ObfuscatedName("a.jv")
    public static int field342;

    @ObfuscatedName("in.d")
    public static class236 field3421;

    @ObfuscatedName("ic.k")
    public static class236 field3439;

    @ObfuscatedName("ic.e")
    public static class236 field3447;

    @ObfuscatedName("io.i")
    public static class264 field3489;

    @ObfuscatedName("q.cw")
    public static class238 field35;

    @ObfuscatedName("z.ns")
    public static int field350;

    @ObfuscatedName("w.qz")
    public static class80 field355;

    @ObfuscatedName("id.k")
    public static class236 field3555;

    @ObfuscatedName("id.d")
    public static class236 field3556;

    @ObfuscatedName("w.ax")
    public static GarbageCollectorMXBean field357;

    @ObfuscatedName("iw.d")
    public static class236 field3591;

    @ObfuscatedName("jl.k")
    public static class236 field3605;

    @ObfuscatedName("jl.d")
    public static class236 field3612;

    @ObfuscatedName("jl.e")
    public static class236 field3619;

    @ObfuscatedName("jm.t")
    public static class286[] field3663;

    @ObfuscatedName("jh.d")
    public static class166 field3665;

    @ObfuscatedName("jj.q")
    public static class286[] field3667;

    @ObfuscatedName("jn.s")
    public static int field3669;

    @ObfuscatedName("jo.el")
    public static class160 field3676;

    @ObfuscatedName("jo.cz")
    public static class238 field3677;

    @ObfuscatedName("ji.r")
    public static int field3686;

    @ObfuscatedName("m.rl")
    public static int field371;

    @ObfuscatedName("m.ix")
    public static int field372;

    @ObfuscatedName("m.ko")
    public static int field373;

    @ObfuscatedName("ja.ct")
    public static class154 field3747;

    @ObfuscatedName("ja.s")
    public static byte[][][] field3751;

    @ObfuscatedName("jx.ah")
    public static int field3769;

    @ObfuscatedName("jx.ab")
    public static int field3770;

    @ObfuscatedName("jx.ai")
    public static int[] field3774;

    @ObfuscatedName("jb.y")
    public static boolean field3779;

    @ObfuscatedName("ae.qe")
    public static class293 field379;

    @ObfuscatedName("ku.p")
    public static int[] field3808;

    @ObfuscatedName("ku.k")
    public static int field3809;

    @ObfuscatedName("kp.t")
    public static int field3815;

    @ObfuscatedName("kp.fa")
    public static class286[] field3820;

    @ObfuscatedName("ae.ml")
    public static class157 field397;

    @ObfuscatedName("ae.j")
    public static int field398;

    @ObfuscatedName("ai.kp")
    public static class217 field404;

    @ObfuscatedName("ah.gm")
    public static class287[] field416;

    @ObfuscatedName("s.w")
    public static int[] field42;

    @ObfuscatedName("ah.ps")
    public static int field428;

    @ObfuscatedName("ah.jg")
    public static int field429;

    @ObfuscatedName("s.bb")
    public static class291 field43;

    @ObfuscatedName("ab.y")
    public static class286 field432;

    @ObfuscatedName("ab.gb")
    public static class286[] field433;

    @ObfuscatedName("ab.cs")
    public static class154 field436;

    @ObfuscatedName("s.iv")
    public static int field44;

    @ObfuscatedName("ad.nr")
    public static class75[] field451;

    @ObfuscatedName("ad.kz")
    public static int field452;

    @ObfuscatedName("ag.ft")
    public static int field454;

    @ObfuscatedName("ag.lp")
    public static class217[] field458;

    @ObfuscatedName("ag.da")
    public static class238 field459;

    @ObfuscatedName("ag.y")
    public static int field460;

    @ObfuscatedName("ag.q")
    public static int field463;

    @ObfuscatedName("af.bo")
    public static class286[] field489;

    @ObfuscatedName("af.s")
    public static boolean field491;

    @ObfuscatedName("af.rw")
    public static short[] field492;

    @ObfuscatedName("am.gd")
    public static class287[] field512;

    @ObfuscatedName("am.py")
    public static int field515;

    @ObfuscatedName("am.o")
    public static class210 field517;

    @ObfuscatedName("am.y")
    public static int[] field520;

    @ObfuscatedName("av.cf")
    public static class238 field526;

    @ObfuscatedName("av.i")
    public static class286 field528;

    @ObfuscatedName("av.fk")
    public static byte[][] field530;

    @ObfuscatedName("av.fz")
    public static int[][] field532;

    @ObfuscatedName("an.c")
    public static int field540;

    @ObfuscatedName("ar.lh")
    public static int field547;

    @ObfuscatedName("ar.ng")
    public static class278 field552;

    @ObfuscatedName("ar.kn")
    public static int field555;

    @ObfuscatedName("aa.ok")
    public static class108 field567;

    @ObfuscatedName("aa.hd")
    public static int field570;

    @ObfuscatedName("aj.z")
    public static int[] field578;

    @ObfuscatedName("aj.dc")
    public static class238 field584;

    @ObfuscatedName("ao.fi")
    public static int field590;

    @ObfuscatedName("ao.aw")
    public static boolean field596;

    @ObfuscatedName("ax.dw")
    public static int field614;

    @ObfuscatedName("ax.g")
    public static boolean field617;

    @ObfuscatedName("ax.no")
    public static byte field619;

    @ObfuscatedName("au.n")
    public static int field633;

    @ObfuscatedName("au.ke")
    public static class217 field636;

    @ObfuscatedName("au.aq")
    public static Image field638;

    @ObfuscatedName("au.i")
    public static int field639;

    @ObfuscatedName("ay.de")
    public static class238 field669;

    @ObfuscatedName("ak.es")
    public static class154 field672;

    @ObfuscatedName("ak.pn")
    public static int field673;

    @ObfuscatedName("ak.dk")
    public static class238 field674;

    @ObfuscatedName("ak.qj")
    public static long field676;

    @ObfuscatedName("bf.f")
    public static class174 field679;

    @ObfuscatedName("bq.jq")
    public static int field686;

    @ObfuscatedName("bq.di")
    public static class238 field687;

    @ObfuscatedName("bq.ge")
    public static class287[] field688;

    @ObfuscatedName("bq.ep")
    public static class160 field689;

    @ObfuscatedName("by.r")
    public static int field698;

    @ObfuscatedName("bn.dp")
    public static String field703;

    @ObfuscatedName("bn.ab")
    public static Font field722;

    @ObfuscatedName("bn.d")
    public static class155 field727;

    @ObfuscatedName("bd.gr")
    public static class287[] field756;

    @ObfuscatedName("bl.l")
    public static int field762;

    @ObfuscatedName("bl.v")
    public static int[][] field763;

    @ObfuscatedName("bi.p")
    public static byte[][][] field767;

    @ObfuscatedName("bi.q")
    public static byte[][][] field768;

    @ObfuscatedName("bi.r")
    public static byte[][][] field769;

    @ObfuscatedName("bi.i")
    public static int[] field770;

    @ObfuscatedName("bi.cp")
    public static class160 field780;

    @ObfuscatedName("bo.r")
    public static class287 field792;

    @ObfuscatedName("bo.ai")
    public static int[] field793;

    @ObfuscatedName("bo.gw")
    public static int field794;

    @ObfuscatedName("bx.ey")
    public static class263 field800;

    @ObfuscatedName("bx.pu")
    public static int field802;

    @ObfuscatedName("br.cj")
    public static class238 field815;

    @ObfuscatedName("br.bu")
    public static class286 field817;

    @ObfuscatedName("bu.iz")
    public static int field820;

    @ObfuscatedName("bu.eh")
    public static class264 field828;

    @ObfuscatedName("bv.pq")
    public static int field831;

    @ObfuscatedName("bv.eg")
    public static class148 field833;

    @ObfuscatedName("bk.l")
    public static int[] field838;

    @ObfuscatedName("bk.ci")
    public static long field839;

    @ObfuscatedName("ba.f")
    public static int field859;

    @ObfuscatedName("bm.o")
    public static int field874;

    @ObfuscatedName("bm.ew")
    public static long field876;

    @ObfuscatedName("bh.x")
    public static String[] field880;

    @ObfuscatedName("be.il")
    public static class217 field916;

    @ObfuscatedName("be.bi")
    public static class287[] field917;

    @ObfuscatedName("be.ab")
    public static int[] field918;

    @ObfuscatedName("be.cc")
    public static class238 field919;

    @ObfuscatedName("client.by")
    public static class233 field924;

    @ObfuscatedName("client.br")
    public static int field928;

    @ObfuscatedName("client.fv")
    public static int[] field992;

    @ObfuscatedName("z.g(I)Lfu;")
    public static class159 method144() {
        try {
            return new class151();
        } catch (Throwable var1) {
            return new class152();
        }
    }

    @ObfuscatedName("bh.d(II)Liv;")
    public static class247 method1065(int arg0) {
        class247 var1 = (class247) class247.field3340.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3342.method3875(1, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method4097(new class174(var2), arg0);
        }
        var3.method4086();
        class247.field3340.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fs.k([BILjava/lang/CharSequence;I)I")
    public static int method3192(byte[] arg0, int arg1, CharSequence arg2) {
        int var3 = arg2.length();
        int var4 = arg1;
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg2.charAt(var5);
            if (var6 <= 127) {
                arg0[var4++] = (byte) var6;
            } else if (var6 <= 2047) {
                arg0[var4++] = (byte) (0xC0 | var6 >> 6);
                arg0[var4++] = (byte) (0x80 | var6 & 0x3F);
            } else {
                arg0[var4++] = (byte) (0xE0 | var6 >> 12);
                arg0[var4++] = (byte) (0x80 | var6 >> 6 & 0x3F);
                arg0[var4++] = (byte) (0x80 | var6 & 0x3F);
            }
        }
        return var4 - arg1;
    }

    @ObfuscatedName("cx.e(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static String method1613(Throwable arg0) throws IOException {
        String var2;
        if (arg0 instanceof class153) {
            class153 var1 = (class153) arg0;
            var2 = var1.field2227 + " | ";
            arg0 = var1.field2233;
        } else {
            var2 = "";
        }
        StringWriter var3 = new StringWriter();
        PrintWriter var4 = new PrintWriter(var3);
        arg0.printStackTrace(var4);
        var4.close();
        String var5 = var3.toString();
        BufferedReader var6 = new BufferedReader(new StringReader(var5));
        String var7 = var6.readLine();
        while (true) {
            while (true) {
                String var8 = var6.readLine();
                if (var8 == null) {
                    return var2 + "| " + var7;
                }
                int var10 = var8.indexOf(40);
                int var11 = var8.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var8.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var8 = var8.substring(0, var10);
                }
                String var15 = var8.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @ObfuscatedName("c.e(I)Lco;")
    public static class80 method130() {
        class123 var0 = null;
        class80 var1 = new class80();
        try {
            var0 = class156.method1580("", field924.field3199, false);
            byte[] var2 = new byte[(int) var0.method2216()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2224(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class80(new class174(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2234();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("aj.u(ILcv;ZI)I")
    public static int method533(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3400) {
            field1331 -= 2;
            int var3 = class82.field1335[field1331];
            int var4 = class82.field1335[field1331 + 1];
            class254 var5 = (class254) class254.field3401.method3341((long) var3);
            class254 var6;
            if (var5 == null) {
                byte[] var7 = field3406.method3875(8, var3);
                class254 var8 = new class254();
                if (var7 != null) {
                    var8.method4217(new class174(var7));
                }
                class254.field3401.method3343(var8, (long) var3);
                var6 = var8;
            } else {
                var6 = var5;
            }
            class254 var9 = var6;
            if (var6.field3403 != 's') {
            }
            for (int var10 = 0; var10 < var9.field3400; var10++) {
                if (var9.field3407[var10] == var4) {
                    class82.field1347[++field1338 - 1] = var9.field3409[var10];
                    var9 = null;
                    break;
                }
            }
            if (var9 != null) {
                class82.field1347[++field1338 - 1] = var9.field3402;
            }
            return 1;
        } else if (arg0 == 3408) {
            field1331 -= 4;
            int var11 = class82.field1335[field1331];
            int var12 = class82.field1335[field1331 + 1];
            int var13 = class82.field1335[field1331 + 2];
            int var14 = class82.field1335[field1331 + 3];
            class254 var15 = (class254) class254.field3401.method3341((long) var13);
            class254 var16;
            if (var15 == null) {
                byte[] var17 = field3406.method3875(8, var13);
                class254 var18 = new class254();
                if (var17 != null) {
                    var18.method4217(new class174(var17));
                }
                class254.field3401.method3343(var18, (long) var13);
                var16 = var18;
            } else {
                var16 = var15;
            }
            class254 var19 = var16;
            if (var16.field3410 != var11 || var16.field3403 != var12) {
                if (var12 == 115) {
                    class82.field1347[++field1338 - 1] = "null";
                } else {
                    class82.field1335[++field1331 - 1] = 0;
                }
                return 1;
            }
            for (int var20 = 0; var20 < var19.field3400; var20++) {
                if (var19.field3407[var20] == var14) {
                    if (var12 == 115) {
                        class82.field1347[++field1338 - 1] = var19.field3409[var20];
                    } else {
                        class82.field1335[++field1331 - 1] = var19.field3404[var20];
                    }
                    var19 = null;
                    break;
                }
            }
            if (var19 != null) {
                if (var12 == 115) {
                    class82.field1347[++field1338 - 1] = var19.field3402;
                } else {
                    class82.field1335[++field1331 - 1] = var19.field3405;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ew.hs(Lbz;I)V")
    public static final void method2447(class76 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1196 == 0) {
            var1 = field250.method2618(arg0.field1203, arg0.field1205, arg0.field1198);
        }
        if (arg0.field1196 == 1) {
            var1 = field250.method2554(arg0.field1203, arg0.field1205, arg0.field1198);
        }
        if (arg0.field1196 == 2) {
            var1 = field250.method2677(arg0.field1203, arg0.field1205, arg0.field1198);
        }
        if (arg0.field1196 == 3) {
            var1 = field250.method2611(arg0.field1203, arg0.field1205, arg0.field1198);
        }
        if (var1 != 0) {
            int var5 = field250.method2571(arg0.field1203, arg0.field1205, arg0.field1198, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1199 = var2;
        arg0.field1201 = var3;
        arg0.field1200 = var4;
    }

    @ObfuscatedName("ao.jb(IIIILkr;Lhu;B)V")
    public static final void method547(int arg0, int arg1, int arg2, int arg3, class287 arg4, class211 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = client.field997 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class135.field2016[var6];
        int var9 = class135.field2023[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method4807(arg5.field2616 / 2 + var10 - arg4.field3800 / 2, arg5.field2612 / 2 - var11 - arg4.field3795 / 2, arg0, arg1, arg5.field2616, arg5.field2612, arg5.field2617, arg5.field2614);
        } else {
            arg4.method4794(arg5.field2616 / 2 + arg0 + var10 - arg4.field3800 / 2, arg5.field2612 / 2 + arg1 - var11 - arg4.field3795 / 2);
        }
    }
}
