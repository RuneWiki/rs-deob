package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("client.kn")
    public static int field1091;

    @ObfuscatedName("p.t")
    public static class174 field11;

    @ObfuscatedName("client.ov")
    public static byte field1144;

    @ObfuscatedName("bq.in")
    public static class217 field1205;

    @ObfuscatedName("ba.cq")
    public static class238 field1225;

    @ObfuscatedName("cy.x")
    public static class264 field1293;

    @ObfuscatedName("cw.f")
    public static class81[] field1297;

    @ObfuscatedName("p.d")
    public static int[] field13;

    @ObfuscatedName("cw.p")
    public static class243[] field1301;

    @ObfuscatedName("cw.gm")
    public static class286[] field1311;

    @ObfuscatedName("ct.ku")
    public static class217 field1320;

    @ObfuscatedName("cg.ck")
    public static int field1338;

    @ObfuscatedName("cv.j")
    public static String[] field1344;

    @ObfuscatedName("cv.i")
    public static int[] field1349;

    @ObfuscatedName("cv.b")
    public static class48 field1353;

    @ObfuscatedName("cv.ko")
    public static class217 field1355;

    @ObfuscatedName("cv.x")
    public static boolean field1356;

    @ObfuscatedName("cl.lf")
    public static class217[] field1367;

    @ObfuscatedName("cl.gy")
    public static int field1369;

    @ObfuscatedName("cp.cc")
    public static class238 field1375;

    @ObfuscatedName("cp.kc")
    public static int field1376;

    @ObfuscatedName("cp.p")
    public static int field1378;

    @ObfuscatedName("cn.am")
    public static String field1386;

    @ObfuscatedName("cn.di")
    public static int field1387;

    @ObfuscatedName("ck.ct")
    public static class154 field1388;

    @ObfuscatedName("cd.bd")
    public static class285[] field1406;

    @ObfuscatedName("ce.ke")
    public static class90 field1410;

    @ObfuscatedName("ci.i")
    public static class285 field1419;

    @ObfuscatedName("ci.f")
    public static class285[] field1420;

    @ObfuscatedName("ci.m")
    public static class286 field1421;

    @ObfuscatedName("ci.c")
    public static class286 field1422;

    @ObfuscatedName("ci.e")
    public static class285 field1423;

    @ObfuscatedName("ci.n")
    public static boolean field1431;

    @ObfuscatedName("ci.io")
    public static int field1449;

    @ObfuscatedName("ci.d")
    public static int[] field1450;

    @ObfuscatedName("cm.az")
    public static class232 field1490;

    @ObfuscatedName("cm.ew")
    public static int field1492;

    @ObfuscatedName("cm.j")
    public static int[] field1494;

    @ObfuscatedName("i.q")
    public static String field15;

    @ObfuscatedName("ca.f")
    public static int field1527;

    @ObfuscatedName("ca.ii")
    public static class217 field1530;

    @ObfuscatedName("cz.gh")
    public static class286 field1559;

    @ObfuscatedName("dz.z")
    public static int field1579;

    @ObfuscatedName("dz.b")
    public static int[] field1580;

    @ObfuscatedName("dz.h")
    public static int field1584;

    @ObfuscatedName("dz.c")
    public static byte[] field1585;

    @ObfuscatedName("dz.aw")
    public static int[] field1586;

    @ObfuscatedName("dz.x")
    public static class109[] field1587;

    @ObfuscatedName("dz.g")
    public static int field1588;

    @ObfuscatedName("dz.e")
    public static int field1589;

    @ObfuscatedName("dz.y")
    public static class121[] field1591;

    @ObfuscatedName("dz.a")
    public static class116[] field1592;

    @ObfuscatedName("dz.o")
    public static class105[] field1593;

    @ObfuscatedName("dz.d")
    public static float[] field1595;

    @ObfuscatedName("dz.r")
    public static boolean[] field1596;

    @ObfuscatedName("dz.q")
    public static float[] field1601;

    @ObfuscatedName("dz.k")
    public static float[] field1602;

    @ObfuscatedName("dz.u")
    public static float[] field1604;

    @ObfuscatedName("dz.ae")
    public static float[] field1605;

    @ObfuscatedName("dz.ao")
    public static float[] field1606;

    @ObfuscatedName("dz.ad")
    public static float[] field1607;

    @ObfuscatedName("dz.aa")
    public static int[] field1608;

    @ObfuscatedName("dq.g")
    public static int[] field1626;

    @ObfuscatedName("dq.e")
    public static int[] field1628;

    @ObfuscatedName("dq.o")
    public static boolean[] field1629;

    @ObfuscatedName("dn.m")
    public static boolean field1631;

    @ObfuscatedName("dn.g")
    public static class112 field1633;

    @ObfuscatedName("dn.f")
    public static int field1634;

    @ObfuscatedName("dn.x")
    public static class104 field1636;

    @ObfuscatedName("dn.rm")
    public static int field1638;

    @ObfuscatedName("da.oj")
    public static byte field1694;

    @ObfuscatedName("i.ou")
    public static class76[] field17;

    @ObfuscatedName("di.z")
    public static float field1717;

    @ObfuscatedName("di.h")
    public static int field1720;

    @ObfuscatedName("dg.c")
    public static boolean[] field1772;

    @ObfuscatedName("dg.h")
    public static int field1775;

    @ObfuscatedName("dj.rg")
    public static long field1780;

    @ObfuscatedName("dj.o")
    public static int field1787;

    @ObfuscatedName("dj.ol")
    public static class286 field1788;

    @ObfuscatedName("dr.cg")
    public static boolean field1799;

    @ObfuscatedName("i.m")
    public static int field18;

    @ObfuscatedName("de.dv")
    public static class238 field1879;

    @ObfuscatedName("de.aw")
    public static FontMetrics field1881;

    @ObfuscatedName("eg.y")
    public static int[] field1896;

    @ObfuscatedName("i.gl")
    public static int field19;

    @ObfuscatedName("eu.mk")
    public static class98 field1915;

    @ObfuscatedName("ek.bn")
    public static int field1990;

    @ObfuscatedName("ek.bh")
    public static int field1991;

    @ObfuscatedName("ek.bm")
    public static int field1992;

    @ObfuscatedName("i.pb")
    public static int field20;

    @ObfuscatedName("ee.c")
    public static int field2006;

    @ObfuscatedName("ee.x")
    public static int field2009;

    @ObfuscatedName("ee.m")
    public static int field2011;

    @ObfuscatedName("ee.z")
    public static int field2012;

    @ObfuscatedName("eh.r")
    public static int field2027;

    @ObfuscatedName("eh.e")
    public static int field2030;

    @ObfuscatedName("eh.o")
    public static int field2031;

    @ObfuscatedName("eh.y")
    public static int field2034;

    @ObfuscatedName("eh.a")
    public static int field2035;

    @ObfuscatedName("eh.b")
    public static int field2036;

    @ObfuscatedName("eh.x")
    public static int field2038;

    @ObfuscatedName("eh.s")
    public static int field2039;

    @ObfuscatedName("eh.w")
    public static class146 field2040;

    @ObfuscatedName("ey.pa")
    public static int field2053;

    @ObfuscatedName("ea.bx")
    public static boolean[][] field2061;

    @ObfuscatedName("ea.bo")
    public static int field2066;

    @ObfuscatedName("ea.bm")
    public static int field2074;

    @ObfuscatedName("ea.b")
    public static int field2077;

    @ObfuscatedName("ea.v")
    public static int field2079;

    @ObfuscatedName("ea.t")
    public static int field2080;

    @ObfuscatedName("ea.w")
    public static int field2081;

    @ObfuscatedName("ea.l")
    public static int field2082;

    @ObfuscatedName("ea.k")
    public static int field2084;

    @ObfuscatedName("ea.d")
    public static int field2085;

    @ObfuscatedName("ea.u")
    public static int field2086;

    @ObfuscatedName("ea.ae")
    public static int field2087;

    @ObfuscatedName("ea.ad")
    public static int field2089;

    @ObfuscatedName("ea.s")
    public static int field2094;

    @ObfuscatedName("ea.q")
    public static int field2099;

    @ObfuscatedName("i.i")
    public static class236 field21;

    @ObfuscatedName("ea.aa")
    public static int field2100;

    @ObfuscatedName("ea.bn")
    public static int field2112;

    @ObfuscatedName("ea.ao")
    public static int field2115;

    @ObfuscatedName("ea.bh")
    public static int field2120;

    @ObfuscatedName("ea.bs")
    public static int field2122;

    @ObfuscatedName("ea.bf")
    public static int field2123;

    @ObfuscatedName("eo.pw")
    public static int field2137;

    @ObfuscatedName("eo.dx")
    public static String field2140;

    @ObfuscatedName("ej.rn")
    public static class289 field2147;

    @ObfuscatedName("er.em")
    public static class160 field2150;

    @ObfuscatedName("er.gs")
    public static class286[] field2152;

    @ObfuscatedName("er.ix")
    public static int field2153;

    @ObfuscatedName("ez.v")
    public static int[] field2185;

    @ObfuscatedName("i.d")
    public static int field22;

    @ObfuscatedName("es.w")
    public static String field2204;

    @ObfuscatedName("eb.bn")
    public static String field2214;

    @ObfuscatedName("ep.i")
    public static int field2228;

    @ObfuscatedName("ep.p")
    public static String field2230;

    @ObfuscatedName("ew.n")
    public static String field2242;

    @ObfuscatedName("ew.p")
    public static String field2243;

    @ObfuscatedName("ew.pf")
    public static class110 field2251;

    @ObfuscatedName("en.m")
    public static int field2254;

    @ObfuscatedName("en.hi")
    public static int field2259;

    @ObfuscatedName("en.s")
    public static String[] field2261;

    @ObfuscatedName("en.g")
    public static int field2262;

    @ObfuscatedName("fj.g")
    public static int[] field2264;

    @ObfuscatedName("fj.jt")
    public static int field2268;

    @ObfuscatedName("fj.p")
    public static File field2269;

    @ObfuscatedName("ff.w")
    public static int[] field2275;

    @ObfuscatedName("ff.c")
    public static int field2276;

    @ObfuscatedName("fq.u")
    public static int[] field2287;

    @ObfuscatedName("fq.pg")
    public static class110 field2288;

    @ObfuscatedName("i.e")
    public static int field23;

    @ObfuscatedName("c.gg")
    public static class7[] field230;

    @ObfuscatedName("c.jw")
    public static int field231;

    @ObfuscatedName("fb.f")
    public static int field2311;

    @ObfuscatedName("fw.ln")
    public static int field2324;

    @ObfuscatedName("fx.z")
    public static int field2334;

    @ObfuscatedName("fx.pi")
    public static class117 field2335;

    @ObfuscatedName("fg.fm")
    public static int field2339;

    @ObfuscatedName("z.ge")
    public static class285[] field234;

    @ObfuscatedName("fr.ib")
    public static class75 field2350;

    @ObfuscatedName("fk.k")
    public static int field2409;

    @ObfuscatedName("fk.z")
    public static int[] field2411;

    @ObfuscatedName("fi.av")
    public static int field2412;

    @ObfuscatedName("fi.n")
    public static long field2415;

    @ObfuscatedName("fi.p")
    public static long field2417;

    @ObfuscatedName("fz.cn")
    public static class154 field2421;

    @ObfuscatedName("fs.da")
    public static int field2424;

    @ObfuscatedName("fs.h")
    public static class285[] field2427;

    @ObfuscatedName("h.eg")
    public static class160 field243;

    @ObfuscatedName("fe.pu")
    public static int field2430;

    @ObfuscatedName("fh.i")
    public static int field2443;

    @ObfuscatedName("fh.g")
    public static int field2445;

    @ObfuscatedName("h.rb")
    public static int field245;

    @ObfuscatedName("h.jo")
    public static int field247;

    @ObfuscatedName("g.fx")
    public static byte[][] field249;

    @ObfuscatedName("gd.gd")
    public static int field2512;

    @ObfuscatedName("gd.p")
    public static class236 field2513;

    @ObfuscatedName("gd.i")
    public static class236 field2514;

    @ObfuscatedName("gd.n")
    public static class236 field2515;

    @ObfuscatedName("gd.m")
    public static class236 field2517;

    @ObfuscatedName("gd.j")
    public static class205 field2518;

    @ObfuscatedName("gd.ce")
    public static long field2519;

    @ObfuscatedName("g.rq")
    public static GarbageCollectorMXBean field252;

    @ObfuscatedName("g.h")
    public static int field254;

    @ObfuscatedName("gq.bm")
    public static int field2549;

    @ObfuscatedName("gx.bs")
    public static int field2593;

    @ObfuscatedName("hx.o")
    public static class210 field2609;

    @ObfuscatedName("he.h")
    public static short[] field2612;

    @ObfuscatedName("e.z")
    public static byte[][][] field262;

    @ObfuscatedName("hk.z")
    public static short[][] field2622;

    @ObfuscatedName("hk.c")
    public static short[] field2628;

    @ObfuscatedName("hj.h")
    public static class236 field2645;

    @ObfuscatedName("hj.g")
    public static class236 field2646;

    @ObfuscatedName("hj.m")
    public static class217[][] field2678;

    @ObfuscatedName("o.rc")
    public static short[] field270;

    @ObfuscatedName("x.e")
    public static class236 field273;

    @ObfuscatedName("hj.z")
    public static class236 field2737;

    @ObfuscatedName("x.pn")
    public static int field274;

    @ObfuscatedName("a.bc")
    public static class290 field282;

    @ObfuscatedName("hc.kr")
    public static int field2837;

    @ObfuscatedName("hm.r")
    public static int field2838;

    @ObfuscatedName("hf.r")
    public static class174 field2844;

    @ObfuscatedName("hf.f")
    public static Thread field2849;

    @ObfuscatedName("y.dh")
    public static class238 field292;

    @ObfuscatedName("r.gc")
    public static class286[] field298;

    @ObfuscatedName("r.aa")
    public static Font field299;

    @ObfuscatedName("r.n")
    public static Applet field305;

    @ObfuscatedName("b.mz")
    public static class157 field313;

    @ObfuscatedName("b.pv")
    public static int field314;

    @ObfuscatedName("hp.r")
    public static int field3160;

    @ObfuscatedName("hq.rw")
    public static class292 field3184;

    @ObfuscatedName("hh.dt")
    public static class238 field3208;

    @ObfuscatedName("ij.j")
    public static byte[][][] field3212;

    @ObfuscatedName("v.ck")
    public static class160 field323;

    @ObfuscatedName("v.iz")
    public static int field325;

    @ObfuscatedName("it.cj")
    public static class238 field3250;

    @ObfuscatedName("ia.i")
    public static long field3258;

    @ObfuscatedName("v.fu")
    public static int[] field326;

    @ObfuscatedName("ia.n")
    public static class160 field3273;

    @ObfuscatedName("v.a")
    public static class235 field328;

    @ObfuscatedName("ig.n")
    public static class236 field3284;

    @ObfuscatedName("ii.ez")
    public static class264 field3289;

    @ObfuscatedName("v.x")
    public static class113 field329;

    @ObfuscatedName("ii.p")
    public static int field3290;

    @ObfuscatedName("ii.n")
    public static class236 field3292;

    @ObfuscatedName("ii.c")
    public static int[] field3294;

    @ObfuscatedName("in.n")
    public static class236 field3299;

    @ObfuscatedName("t.au")
    public static Image field331;

    @ObfuscatedName("if.n")
    public static class236 field3319;

    @ObfuscatedName("ix.n")
    public static class236 field3325;

    @ObfuscatedName("iq.n")
    public static class236 field3327;

    @ObfuscatedName("iq.p")
    public static class236 field3331;

    @ObfuscatedName("ik.n")
    public static class236 field3345;

    @ObfuscatedName("ie.p")
    public static class236 field3353;

    @ObfuscatedName("ie.i")
    public static int field3354;

    @ObfuscatedName("ie.n")
    public static class236 field3358;

    @ObfuscatedName("ip.n")
    public static class236 field3374;

    @ObfuscatedName("w.nk")
    public static class277 field338;

    @ObfuscatedName("iu.n")
    public static class236 field3382;

    @ObfuscatedName("iw.n")
    public static class236 field3390;

    @ObfuscatedName("iz.n")
    public static class236 field3402;

    @ObfuscatedName("iy.n")
    public static class236 field3411;

    @ObfuscatedName("io.n")
    public static class236 field3431;

    @ObfuscatedName("io.p")
    public static class236 field3438;

    @ObfuscatedName("iv.p")
    public static class236 field3443;

    @ObfuscatedName("iv.i")
    public static class236 field3444;

    @ObfuscatedName("l.f")
    public static File field348;

    @ObfuscatedName("l.dq")
    public static class238 field349;

    @ObfuscatedName("im.c")
    public static class236 field3499;

    @ObfuscatedName("im.z")
    public static boolean field3500;

    @ObfuscatedName("im.h")
    public static int field3501;

    @ObfuscatedName("l.m")
    public static byte[][][] field352;

    @ObfuscatedName("q.co")
    public static class238 field354;

    @ObfuscatedName("ic.p")
    public static class236 field3560;

    @ObfuscatedName("k.ep")
    public static int field357;

    @ObfuscatedName("ic.n")
    public static class236 field3586;

    @ObfuscatedName("ih.n")
    public static class236 field3599;

    @ObfuscatedName("jd.p")
    public static class236 field3609;

    @ObfuscatedName("jd.i")
    public static class236 field3610;

    @ObfuscatedName("jd.n")
    public static class236 field3611;

    @ObfuscatedName("k.ch")
    public static class238 field362;

    @ObfuscatedName("jj.ec")
    public static class264 field3630;

    @ObfuscatedName("jn.g")
    public static class285[] field3656;

    @ObfuscatedName("jk.n")
    public static class166 field3671;

    @ObfuscatedName("ji.g")
    public static short[][] field3672;

    @ObfuscatedName("jl.de")
    public static class154 field3680;

    @ObfuscatedName("jr.ia")
    public static class217 field3682;

    @ObfuscatedName("jm.l")
    public static String field3690;

    @ObfuscatedName("jm.e")
    public static boolean field3691;

    @ObfuscatedName("d.ow")
    public static int field370;

    @ObfuscatedName("jo.z")
    public static int field3731;

    @ObfuscatedName("jw.a")
    public static class217 field3738;

    @ObfuscatedName("u.pr")
    public static int field374;

    @ObfuscatedName("jh.u")
    public static int[] field3753;

    @ObfuscatedName("jh.ae")
    public static int field3754;

    @ObfuscatedName("jh.ao")
    public static int field3758;

    @ObfuscatedName("u.db")
    public static long field376;

    @ObfuscatedName("kb.f")
    public static int[] field3791;

    @ObfuscatedName("kb.i")
    public static int field3792;

    @ObfuscatedName("kb.n")
    public static int field3793;

    @ObfuscatedName("kb.m")
    public static int[] field3794;

    @ObfuscatedName("f.bv")
    public static class285[] field39;

    @ObfuscatedName("ae.az")
    public static class285[] field395;

    @ObfuscatedName("ae.gk")
    public static class286[] field397;

    @ObfuscatedName("ao.ho")
    public static int field405;

    @ObfuscatedName("m.p")
    public static class236 field41;

    @ObfuscatedName("ad.fb")
    public static int[] field422;

    @ObfuscatedName("aa.y")
    public static class124[] field433;

    @ObfuscatedName("aw.be")
    public static class72 field444;

    @ObfuscatedName("an.h")
    public static byte[][] field450;

    @ObfuscatedName("an.jg")
    public static int field452;

    @ObfuscatedName("an.lc")
    public static int field453;

    @ObfuscatedName("at.ev")
    public static int field477;

    @ObfuscatedName("at.g")
    public static class285 field479;

    @ObfuscatedName("au.er")
    public static class263 field495;

    @ObfuscatedName("ak.b")
    public static String[] field500;

    @ObfuscatedName("as.do")
    public static int field507;

    @ObfuscatedName("as.ae")
    public static int[] field510;

    @ObfuscatedName("ah.x")
    public static class217 field516;

    @ObfuscatedName("ab.fc")
    public static byte[][] field522;

    @ObfuscatedName("am.cn")
    public static char field536;

    @ObfuscatedName("ax.l")
    public static int[] field564;

    @ObfuscatedName("aq.x")
    public static int[] field570;

    @ObfuscatedName("aq.s")
    public static int field572;

    @ObfuscatedName("af.gj")
    public static class286 field578;

    @ObfuscatedName("ag.fo")
    public static int[] field583;

    @ObfuscatedName("ag.lj")
    public static int field584;

    @ObfuscatedName("ar.aj")
    public static client field591;

    @ObfuscatedName("aj.bh")
    public static String field599;

    @ObfuscatedName("aj.ai")
    public static class286[] field600;

    @ObfuscatedName("aj.ac")
    public static class283 field602;

    @ObfuscatedName("ay.pd")
    public static class103 field614;

    @ObfuscatedName("az.t")
    public static int[] field642;

    @ObfuscatedName("az.y")
    public static int[][][] field644;

    @ObfuscatedName("az.z")
    public static ScheduledExecutorService field645;

    @ObfuscatedName("bd.cr")
    public static class238 field656;

    @ObfuscatedName("bc.ca")
    public static class238 field657;

    @ObfuscatedName("bc.rx")
    public static class161 field659;

    @ObfuscatedName("bx.m")
    public static class236 field666;

    @ObfuscatedName("bn.n")
    public static class155 field679;

    @ObfuscatedName("bn.e")
    public static class159 field704;

    @ObfuscatedName("bn.gu")
    public static class285[] field708;

    @ObfuscatedName("bn.pt")
    public static int field709;

    @ObfuscatedName("bn.c")
    public static int field710;

    @ObfuscatedName("bm.gz")
    public static class286[] field733;

    @ObfuscatedName("bm.fw")
    public static int[][] field734;

    @ObfuscatedName("bs.f")
    public static byte[][][] field740;

    @ObfuscatedName("bs.h")
    public static int[][] field741;

    @ObfuscatedName("bs.e")
    public static int[] field742;

    @ObfuscatedName("bs.o")
    public static int[] field743;

    @ObfuscatedName("bs.a")
    public static int[] field744;

    @ObfuscatedName("bs.et")
    public static int field749;

    @ObfuscatedName("bs.fg")
    public static class140 field752;

    @ObfuscatedName("bs.dz")
    public static class238 field754;

    @ObfuscatedName("bs.c")
    public static byte[][][] field755;

    @ObfuscatedName("bo.ag")
    public static boolean field761;

    @ObfuscatedName("bl.aq")
    public static String field763;

    @ObfuscatedName("bl.gq")
    public static int field764;

    @ObfuscatedName("bl.cm")
    public static class238 field766;

    @ObfuscatedName("bl.j")
    public static File field768;

    @ObfuscatedName("bl.g")
    public static int field769;

    @ObfuscatedName("bp.g")
    public static class78 field787;

    @ObfuscatedName("be.rp")
    public static class82 field802;

    @ObfuscatedName("be.ds")
    public static int field804;

    @ObfuscatedName("be.ft")
    public static int field805;

    @ObfuscatedName("by.ex")
    public static class264 field818;

    @ObfuscatedName("by.j")
    public static class285 field821;

    @ObfuscatedName("bi.ri")
    public static class14 field835;

    @ObfuscatedName("bi.bc")
    public static class285 field837;

    @ObfuscatedName("bi.ci")
    public static class238 field841;

    @ObfuscatedName("bg.z")
    public static class285 field846;

    @ObfuscatedName("bg.h")
    public static int field853;

    @ObfuscatedName("bb.ph")
    public static int field857;

    @ObfuscatedName("bb.ao")
    public static int[] field861;

    @ObfuscatedName("bk.gg")
    public static class285[] field865;

    @ObfuscatedName("bk.gr")
    public static class286[] field868;

    @ObfuscatedName("bk.pp")
    public static int field869;

    @ObfuscatedName("bw.cz")
    public static class238 field897;

    @ObfuscatedName("client.bd")
    public static class233 field917;

    @ObfuscatedName("client.cu")
    public static class238 field944;

    @ObfuscatedName("client.cx")
    public static class238 field945;

    @ObfuscatedName("client.ga")
    public static int field979;

    @ObfuscatedName("fk.j(I)[Ljc;")
    public static class284[] method3118() {
        return new class284[] { class284.field3767, class284.field3768, class284.field3765, class284.field3766, class284.field3770 };
    }

    @ObfuscatedName("fr.n(I)I")
    public static int method2881() {
        return ++class99.field1531 - 1;
    }

    @ObfuscatedName("fd.p(ILhy;I)I")
    public static int method2884(int arg0, class220 arg1) {
        return (arg0 + 40000 << 8) + arg1.field2800;
    }

    @ObfuscatedName("cc.n(II)Lii;")
    public static class242 method1614(int arg0) {
        class242 var1 = (class242) class242.field3291.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3292.method3880(16, arg0);
        class242 var3 = new class242();
        if (var2 != null) {
            var3.method3991(new class174(var2));
        }
        class242.field3291.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.f(II)I")
    public static int method619(int arg0) {
        class102 var1 = (class102) class99.field1528.get(arg0);
        return var1 == null ? 0 : var1.method1718();
    }

    @ObfuscatedName("ji.p([BIII)Ljava/lang/String;")
    public static String method4565(byte[] arg0, int arg1, int arg2) {
        StringBuilder var3 = new StringBuilder();
        for (int var4 = arg1; var4 < arg1 + arg2; var4 += 3) {
            int var5 = arg0[var4] & 0xFF;
            var3.append(class270.field3688[var5 >>> 2]);
            if (var4 < arg2 - 1) {
                int var6 = arg0[var4 + 1] & 0xFF;
                var3.append(class270.field3688[(var5 & 0x3) << 4 | var6 >>> 4]);
                if (var4 < arg2 - 2) {
                    int var7 = arg0[var4 + 2] & 0xFF;
                    var3.append(class270.field3688[(var6 & 0xF) << 2 | var7 >>> 6]).append(class270.field3688[var7 & 0x3F]);
                } else {
                    var3.append(class270.field3688[(var6 & 0xF) << 2]).append("=");
                }
            } else {
                var3.append(class270.field3688[(var5 & 0x3) << 4]).append("==");
            }
        }
        return var3.toString();
    }

    @ObfuscatedName("s.i(CB)Z")
    public static final boolean method134(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("fo.j(Ljava/lang/CharSequence;Lki;I)Ljava/lang/String;")
    public static String method2789(CharSequence arg0, class290 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && method134(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && method134(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > class268.method2820(arg1)) {
            return null;
        }
        StringBuilder var5 = new StringBuilder(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class268.method244(var7)) {
                char var8;
                switch(var7) {
                    case ' ':
                    case '-':
                    case '_':
                    case ' ':
                        var8 = '_';
                        break;
                    case '#':
                    case '[':
                    case ']':
                        var8 = var7;
                        break;
                    case 'À':
                    case 'Á':
                    case 'Â':
                    case 'Ã':
                    case 'Ä':
                    case 'à':
                    case 'á':
                    case 'â':
                    case 'ã':
                    case 'ä':
                        var8 = 'a';
                        break;
                    case 'Ç':
                    case 'ç':
                        var8 = 'c';
                        break;
                    case 'È':
                    case 'É':
                    case 'Ê':
                    case 'Ë':
                    case 'è':
                    case 'é':
                    case 'ê':
                    case 'ë':
                        var8 = 'e';
                        break;
                    case 'Í':
                    case 'Î':
                    case 'Ï':
                    case 'í':
                    case 'î':
                    case 'ï':
                        var8 = 'i';
                        break;
                    case 'Ñ':
                    case 'ñ':
                        var8 = 'n';
                        break;
                    case 'Ò':
                    case 'Ó':
                    case 'Ô':
                    case 'Õ':
                    case 'Ö':
                    case 'ò':
                    case 'ó':
                    case 'ô':
                    case 'õ':
                    case 'ö':
                        var8 = 'o';
                        break;
                    case 'Ù':
                    case 'Ú':
                    case 'Û':
                    case 'Ü':
                    case 'ù':
                    case 'ú':
                    case 'û':
                    case 'ü':
                        var8 = 'u';
                        break;
                    case 'ß':
                        var8 = 'b';
                        break;
                    case 'ÿ':
                    case 'Ÿ':
                        var8 = 'y';
                        break;
                    default:
                        var8 = Character.toLowerCase(var7);
                }
                if (var8 != 0) {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @ObfuscatedName("cg.n(Lis;Lis;I)V")
    public static void method1464(class236 arg0, class236 arg1) {
        field3586 = arg0;
        field3560 = arg1;
    }

    @ObfuscatedName("hz.p(II)Lic;")
    public static class259 method3798(int arg0) {
        class259 var1 = (class259) class259.field3594.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3586.method3880(9, arg0);
        class259 var3 = new class259();
        var3.field3563 = arg0;
        if (var2 != null) {
            var3.method4351(new class174(var2));
        }
        var3.method4365();
        class259.field3594.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ch.z(Ljava/lang/String;B)I")
    public static int method1708(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("as.n(B)V")
    public static void method460() {
        if (field2242.toLowerCase().indexOf("microsoft") != -1) {
            class51.field637[186] = 57;
            class51.field637[187] = 27;
            class51.field637[188] = 71;
            class51.field637[189] = 26;
            class51.field637[190] = 72;
            class51.field637[191] = 73;
            class51.field637[192] = 58;
            class51.field637[219] = 42;
            class51.field637[220] = 74;
            class51.field637[221] = 43;
            class51.field637[222] = 59;
            class51.field637[223] = 28;
            return;
        }
        class51.field637[44] = 71;
        class51.field637[45] = 26;
        class51.field637[46] = 72;
        class51.field637[47] = 73;
        class51.field637[59] = 57;
        class51.field637[61] = 27;
        class51.field637[91] = 42;
        class51.field637[92] = 74;
        class51.field637[93] = 43;
        class51.field637[192] = 28;
        class51.field637[222] = 58;
        class51.field637[520] = 59;
    }

    @ObfuscatedName("u.j(I)Z")
    public static final boolean method194() {
        class51 var0 = class51.field627;
        synchronized (class51.field627) {
            if (class51.field634 == class51.field633) {
                return false;
            } else {
                field1338 = class51.field635[class51.field633];
                field536 = class51.field629[class51.field633];
                class51.field633 = class51.field633 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("cg.g(B)V")
    public static void method1472() {
        class214.field2631.method3286();
    }

    @ObfuscatedName("ez.ez(B)V")
    public static void method2692() {
        if (client.field982 == 0) {
            field752 = new class140(4, 104, 104, class62.field748);
            for (int var0 = 0; var0 < 4; var0++) {
                client.field975[var0] = new class162(104, 104);
            }
            field1788 = new class286(512, 512);
            class93.field1434 = class226.field2867;
            class93.field1417 = 5;
            client.field982 = 20;
        } else if (client.field982 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class137.field2020[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class140.method2519(var1, 500, 800, 512, 334);
            class93.field1434 = class226.field2933;
            class93.field1417 = 10;
            client.field982 = 30;
        } else if (client.field982 == 30) {
            field841 = method3802(0, false, true, true);
            field944 = method3802(1, false, true, true);
            field1375 = method3802(2, true, false, true);
            field766 = method3802(3, false, true, true);
            field656 = method3802(4, false, true, true);
            field1225 = method3802(5, true, true, true);
            field657 = method3802(6, true, true, false);
            field362 = method3802(7, false, true, true);
            field945 = method3802(8, false, true, true);
            field897 = method3802(9, false, true, true);
            field354 = method3802(10, false, true, true);
            field3250 = method3802(11, false, true, true);
            field1879 = method3802(12, false, true, true);
            field3208 = method3802(13, true, false, true);
            field754 = method3802(14, false, true, false);
            field292 = method3802(15, false, true, true);
            field349 = method3802(16, false, true, false);
            class93.field1434 = class226.field2869;
            class93.field1417 = 20;
            client.field982 = 40;
        } else if (client.field982 == 40) {
            byte var6 = 0;
            int var7 = var6 + field841.method3945() * 4 / 100;
            int var8 = var7 + field944.method3945() * 4 / 100;
            int var9 = var8 + field1375.method3945() * 2 / 100;
            int var10 = var9 + field766.method3945() * 2 / 100;
            int var11 = var10 + field656.method3945() * 6 / 100;
            int var12 = var11 + field1225.method3945() * 4 / 100;
            int var13 = var12 + field657.method3945() * 2 / 100;
            int var14 = var13 + field362.method3945() * 58 / 100;
            int var15 = var14 + field945.method3945() * 2 / 100;
            int var16 = var15 + field897.method3945() * 2 / 100;
            int var17 = var16 + field354.method3945() * 2 / 100;
            int var18 = var17 + field3250.method3945() * 2 / 100;
            int var19 = var18 + field1879.method3945() * 2 / 100;
            int var20 = var19 + field3208.method3945() * 2 / 100;
            int var21 = var20 + field754.method3945() * 2 / 100;
            int var22 = var21 + field292.method3945() * 2 / 100;
            int var23 = var22 + field349.method3945() * 2 / 100;
            if (var23 == 100) {
                class93.field1434 = class226.field2871;
                class93.field1417 = 30;
                client.field982 = 45;
            } else {
                if (var23 != 0) {
                    class93.field1434 = class226.field2870 + var23 + "%";
                }
                class93.field1417 = 30;
            }
        } else if (client.field982 == 45) {
            boolean var24 = !client.field919;
            field1634 = 22050;
            field1631 = var24;
            field853 = 2;
            class205 var25 = new class205();
            var25.method3466(9, 128);
            field2288 = class110.method2735(field679, 0, 22050);
            field2288.method1861(var25);
            class238 var26 = field292;
            class238 var27 = field754;
            class238 var28 = field656;
            field2515 = var26;
            field2513 = var27;
            field2514 = var28;
            field2518 = var25;
            field2251 = class110.method2735(field679, 1, 2048);
            field614 = new class103();
            field2251.method1861(field614);
            field2335 = new class117(22050, field1634);
            class93.field1434 = class226.field2872;
            class93.field1417 = 35;
            client.field982 = 50;
            field495 = new class263(field945, field3208);
        } else if (client.field982 == 50) {
            int var29 = class262.method4447().length;
            client.field915 = field495.method4455(class262.method4447());
            if (client.field915.size() < var29) {
                class93.field1434 = class226.field2873 + client.field915.size() * 100 / var29 + "%";
                class93.field1417 = 40;
            } else {
                field3630 = (class264) client.field915.get(class262.field3628);
                field818 = (class264) client.field915.get(class262.field3636);
                field3289 = (class264) client.field915.get(class262.field3629);
                field3184 = new class292(true);
                class93.field1434 = class226.field2874;
                class93.field1417 = 40;
                client.field982 = 60;
            }
        } else if (client.field982 == 60) {
            class238 var30 = field354;
            class238 var31 = field945;
            int var32 = 0;
            if (var30.method3850("title.jpg", "")) {
                var32++;
            }
            if (var31.method3850("logo", "")) {
                var32++;
            }
            if (var31.method3850("logo_deadman_mode", "")) {
                var32++;
            }
            if (var31.method3850("titlebox", "")) {
                var32++;
            }
            if (var31.method3850("titlebutton", "")) {
                var32++;
            }
            if (var31.method3850("runes", "")) {
                var32++;
            }
            if (var31.method3850("title_mute", "")) {
                var32++;
            }
            if (var31.method3850("options_radio_buttons,0", "")) {
                var32++;
            }
            if (var31.method3850("options_radio_buttons,2", "")) {
                var32++;
            }
            var31.method3850("sl_back", "");
            var31.method3850("sl_flags", "");
            var31.method3850("sl_arrows", "");
            var31.method3850("sl_stars", "");
            var31.method3850("sl_button", "");
            byte var35 = 9;
            if (var32 < var35) {
                class93.field1434 = class226.field3129 + var32 * 100 / var35 + "%";
                class93.field1417 = 50;
            } else {
                class93.field1434 = class226.field2876;
                class93.field1417 = 50;
                client.method9(5);
                client.field982 = 70;
            }
        } else if (client.field982 == 70) {
            if (field1375.method3902()) {
                class260.method2705(field1375);
                class238 var37 = field1375;
                field3345 = var37;
                class238 var38 = field1375;
                class238 var39 = field362;
                field3358 = var38;
                field3353 = var39;
                field3354 = field3358.method3879(3);
                class256.method2734(field1375, field362, client.field919);
                method1464(field1375, field362);
                class238 var40 = field1375;
                field3402 = var40;
                class238 var41 = field1375;
                class238 var42 = field362;
                boolean var43 = client.field918;
                class264 var44 = field3630;
                field666 = var41;
                field3499 = var42;
                field3500 = var43;
                field3501 = field666.method3879(10);
                field1293 = var44;
                class238 var45 = field1375;
                class238 var46 = field841;
                class238 var47 = field944;
                field3611 = var45;
                field3609 = var46;
                field3610 = var47;
                class246.method2753(field1375, field362);
                class251.method2832(field1375);
                class238 var48 = field1375;
                field3292 = var48;
                field3290 = field3292.method3879(16);
                class238 var49 = field766;
                class238 var50 = field362;
                class238 var51 = field945;
                class238 var52 = field3208;
                field2737 = var49;
                field2645 = var50;
                field2646 = var51;
                field273 = var52;
                field2678 = new class217[field2737.method3920()][];
                field1772 = new boolean[field2737.method3920()];
                class238 var53 = field1375;
                field3284 = var53;
                class254.method3805(field1375);
                class238 var54 = field1375;
                field3319 = var54;
                class245.method675(field1375);
                class252.method713(field1375);
                field1915 = new class98();
                class238 var55 = field1375;
                class238 var56 = field945;
                class238 var57 = field3208;
                field3431 = var55;
                field3438 = var56;
                field21 = var57;
                class238 var58 = field1375;
                class238 var59 = field945;
                field3374 = var58;
                field41 = var59;
                class238 var60 = field1375;
                class238 var61 = field945;
                field3299 = var61;
                if (var60.method3902()) {
                    field2443 = var60.method3879(35);
                    field1301 = new class243[field2443];
                    for (int var62 = 0; var62 < field2443; var62++) {
                        byte[] var63 = var60.method3880(35, var62);
                        if (var63 != null) {
                            field1301[var62] = new class243(var62);
                            field1301[var62].method4000(new class174(var63));
                            field1301[var62].method4002();
                        }
                    }
                }
                class93.field1434 = class226.field2878;
                class93.field1417 = 60;
                client.field982 = 80;
            } else {
                class93.field1434 = class226.field2931 + field1375.method3946() + "%";
                class93.field1417 = 60;
            }
        } else if (client.field982 == 80) {
            int var64 = 0;
            if (field1559 == null) {
                class238 var65 = field945;
                int var66 = var65.method3846("compass");
                int var67 = var65.method3914(var66, "");
                class286 var68 = class287.method2679(var65, var66, var67);
                field1559 = var68;
            } else {
                var64++;
            }
            if (field578 == null) {
                class238 var69 = field945;
                int var70 = var69.method3846("mapedge");
                int var71 = var69.method3914(var70, "");
                class286 var72 = class287.method2679(var69, var70, var71);
                field578 = var72;
            } else {
                var64++;
            }
            if (field865 == null) {
                field865 = class287.method531(field945, "mapscene", "");
            } else {
                var64++;
            }
            if (field397 == null) {
                field397 = class287.method4619(field945, "headicons_pk", "");
            } else {
                var64++;
            }
            if (field298 == null) {
                field298 = class287.method4619(field945, "headicons_prayer", "");
            } else {
                var64++;
            }
            if (field733 == null) {
                field733 = class287.method4619(field945, "headicons_hint", "");
            } else {
                var64++;
            }
            if (field1311 == null) {
                field1311 = class287.method4619(field945, "mapmarker", "");
            } else {
                var64++;
            }
            if (field868 == null) {
                field868 = class287.method4619(field945, "cross", "");
            } else {
                var64++;
            }
            if (field2152 == null) {
                field2152 = class287.method4619(field945, "mapdots", "");
            } else {
                var64++;
            }
            if (field708 == null) {
                field708 = class287.method531(field945, "scrollbar", "");
            } else {
                var64++;
            }
            if (field234 == null) {
                field234 = class287.method531(field945, "mod_icons", "");
            } else {
                var64++;
            }
            if (var64 < 11) {
                class93.field1434 = class226.field3031 + var64 * 100 / 12 + "%";
                class93.field1417 = 70;
            } else {
                field3656 = field234;
                field578.method4763();
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 21.0D) - 10;
                int var75 = (int) (Math.random() * 21.0D) - 10;
                int var76 = (int) (Math.random() * 41.0D) - 20;
                field865[0].method4737(var73 + var76, var74 + var76, var75 + var76);
                class93.field1434 = class226.field2854;
                class93.field1417 = 70;
                client.field982 = 90;
            }
        } else if (client.field982 == 90) {
            if (field897.method3902()) {
                class126 var77 = new class126(field897, field945, 20, 0.8D, client.field919 ? 64 : 128);
                class137.method2467(var77);
                class137.method2408(0.8D);
                class93.field1434 = class226.field2882;
                class93.field1417 = 90;
                client.field982 = 110;
            } else {
                class93.field1434 = class226.field2881 + field897.method3946() + "%";
                class93.field1417 = 90;
            }
        } else if (client.field982 == 110) {
            field444 = new class72();
            field679.method2715(field444, 10);
            class93.field1434 = class226.field2883;
            class93.field1417 = 94;
            client.field982 = 120;
        } else if (client.field982 == 120) {
            if (field354.method3850("huffman", "")) {
                class166 var78 = new class166(field354.method3849("huffman", ""));
                field3671 = var78;
                class93.field1434 = class226.field2885;
                class93.field1417 = 96;
                client.field982 = 130;
            } else {
                class93.field1434 = class226.field2968 + "%";
                class93.field1417 = 96;
            }
        } else if (client.field982 == 130) {
            if (!field766.method3902()) {
                class93.field1434 = class226.field2919 + field766.method3946() * 4 / 5 + "%";
                class93.field1417 = 100;
            } else if (!field1879.method3902()) {
                class93.field1434 = class226.field2919 + (80 + field1879.method3946() / 6) + "%";
                class93.field1417 = 100;
            } else if (field3208.method3902()) {
                class93.field1434 = class226.field2887;
                class93.field1417 = 98;
                client.field982 = 140;
            } else {
                class93.field1434 = class226.field2919 + (96 + field3208.method3946() / 50) + "%";
                class93.field1417 = 100;
            }
        } else if (client.field982 == 140) {
            if (field349.method3853(class41.field541.field544)) {
                if (field2147 == null) {
                    field2147 = new class289();
                    field2147.method4891(field349, field3289, client.field915, field865);
                }
                int var79 = field2147.method5019();
                if (var79 < 100) {
                    class93.field1434 = class226.field2888 + (var79 * 9 / 10 + 10) + "%";
                } else {
                    class93.field1434 = class226.field2889;
                    class93.field1417 = 100;
                    client.field982 = 150;
                }
            } else {
                class93.field1434 = class226.field2888 + field349.method3877(class41.field541.field544) / 10 + "%";
            }
        } else if (client.field982 == 150) {
            client.method9(10);
        }
    }

    @ObfuscatedName("e.m(ILch;ZS)I")
    public static int method54(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3143(class84.field1347[--field2334]);
        } else {
            var3 = arg2 ? field3738 : field516;
        }
        client.method1404(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            field2334 -= 2;
            int var4 = class84.field1347[field2334];
            int var5 = class84.field1347[field2334 + 1];
            var3.field2773 = var4;
            var3.field2692 = var5;
            class257 var6 = class257.method4344(var4);
            var3.field2713 = var6.field3513;
            var3.field2705 = var6.field3514;
            var3.field2706 = var6.field3494;
            var3.field2681 = var6.field3518;
            var3.field2703 = var6.field3517;
            var3.field2707 = var6.field3531;
            if (arg0 == 1205) {
                var3.field2711 = 0;
            } else if (arg0 == 1212 | var6.field3535 == 1) {
                var3.field2711 = 1;
            } else {
                var3.field2711 = 2;
            }
            if (var3.field2690 > 0) {
                var3.field2707 = var3.field2707 * 32 / var3.field2690;
            } else if (var3.field2664 > 0) {
                var3.field2707 = var3.field2707 * 32 / var3.field2664;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2696 = 2;
            var3.field2697 = class84.field1347[--field2334];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2696 = 3;
            var3.field2697 = field2350.field886.method3700();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hw.es(IZZZI)Lit;")
    public static class238 method3802(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class161 var4 = null;
        if (class156.field2255 != null) {
            var4 = new class161(arg0, class156.field2255, field433[arg0], 1000000);
        }
        return new class238(var4, field659, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dl.gk(ZI)V")
    public static final void method2172(boolean arg0) {
        client.field1083 = arg0;
        if (!client.field1083) {
            int var1 = client.field959.method2958();
            int var2 = client.field959.method3065();
            int var3 = client.field959.method3065();
            field734 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    field734[var4][var5] = client.field959.method3058();
                }
            }
            field326 = new int[var3];
            field583 = new int[var3];
            field422 = new int[var3];
            field522 = new byte[var3][];
            field249 = new byte[var3][];
            boolean var6 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var1 / 8 == 48) {
                var6 = true;
            }
            if (var2 / 8 == 48 && var1 / 8 == 148) {
                var6 = true;
            }
            int var7 = 0;
            for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
                for (int var9 = (var1 - 6) / 8; var9 <= (var1 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    if (!var6 || var9 != 49 && var9 != 149 && var9 != 147 && var8 != 50 && (var8 != 49 || var9 != 47)) {
                        field326[var7] = var10;
                        field583[var7] = field1225.method3846("m" + var8 + "_" + var9);
                        field422[var7] = field1225.method3846("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            client.method882(var2, var1, true);
            return;
        }
        int var11 = client.field959.method2956();
        boolean var12 = client.field959.method2950() == 1;
        int var13 = client.field959.method2957();
        int var14 = client.field959.method3065();
        client.field959.method3149();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = client.field959.method3150(1);
                    if (var18 == 1) {
                        client.field977[var15][var16][var17] = client.field959.method3150(26);
                    } else {
                        client.field977[var15][var16][var17] = -1;
                    }
                }
            }
        }
        client.field959.method3151();
        field734 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                field734[var19][var20] = client.field959.method3058();
            }
        }
        field326 = new int[var14];
        field583 = new int[var14];
        field422 = new int[var14];
        field522 = new byte[var14][];
        field249 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = client.field977[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (field326[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            field326[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            field583[var21] = field1225.method3846("m" + var30 + "_" + var31);
                            field422[var21] = field1225.method3846("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        client.method882(var13, var11, !var12);
    }

    @ObfuscatedName("fh.hs([Lhj;IIIIIIIII)V")
    public static final void method3172(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class282.method4643(arg2, arg3, arg4, arg5);
        class137.method2403();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class217 var10 = arg0[var9];
            if (var10 != null && (var10.field2668 == arg1 || arg1 == -1412584499 && client.field1090 == var10)) {
                int var11;
                if (arg8 == -1) {
                    client.field1125[client.field1120] = var10.field2666 + arg6;
                    client.field1067[client.field1120] = var10.field2665 + arg7;
                    client.field1127[client.field1120] = var10.field2701;
                    client.field1128[client.field1120] = var10.field2693;
                    var11 = ++client.field1120 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2784 = var11;
                var10.field2702 = client.field923;
                if (!var10.field2652 || !client.method992(var10)) {
                    if (var10.field2721 > 0) {
                        int var12 = var10.field2721;
                        if (var12 == 324) {
                            if (client.field1190 == -1) {
                                client.field1190 = var10.field2688;
                                client.field1182 = var10.field2689;
                            }
                            if (client.field1189.field2624) {
                                var10.field2688 = client.field1190;
                            } else {
                                var10.field2688 = client.field1182;
                            }
                        } else if (var12 == 325) {
                            if (client.field1190 == -1) {
                                client.field1190 = var10.field2688;
                                client.field1182 = var10.field2689;
                            }
                            if (client.field1189.field2624) {
                                var10.field2688 = client.field1182;
                            } else {
                                var10.field2688 = client.field1190;
                            }
                        } else if (var12 == 327) {
                            var10.field2713 = 150;
                            var10.field2705 = (int) (Math.sin((double) client.field923 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2696 = 5;
                            var10.field2697 = 0;
                        } else if (var12 == 328) {
                            var10.field2713 = 150;
                            var10.field2705 = (int) (Math.sin((double) client.field923 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2696 = 5;
                            var10.field2697 = 1;
                        }
                    }
                    int var13 = var10.field2666 + arg6;
                    int var14 = var10.field2665 + arg7;
                    int var15 = var10.field2684;
                    if (client.field1090 == var10) {
                        if (arg1 != -1412584499 && !var10.field2731) {
                            field1367 = arg0;
                            field2324 = arg6;
                            field584 = arg7;
                            continue;
                        }
                        if (client.field1101 && client.field928) {
                            int var16 = class60.field730;
                            int var17 = class60.field716 * 1327680731;
                            int var18 = var16 - client.field1092;
                            int var19 = var17 - client.field1093;
                            if (var18 < client.field1096) {
                                var18 = client.field1096;
                            }
                            if (var10.field2701 + var18 > client.field1096 + client.field974.field2701) {
                                var18 = client.field1096 + client.field974.field2701 - var10.field2701;
                            }
                            if (var19 < client.field1097) {
                                var19 = client.field1097;
                            }
                            if (var10.field2693 + var19 > client.field1097 + client.field974.field2693) {
                                var19 = client.field1097 + client.field974.field2693 - var10.field2693;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2731) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2655 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2655 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2701 + var13;
                        int var27 = var10.field2693 + var14;
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        if (var27 < var14) {
                            var25 = var27;
                            var27 = var14;
                        }
                        var26++;
                        var27++;
                        var20 = var24 > arg2 ? var24 : arg2;
                        var21 = var25 > arg3 ? var25 : arg3;
                        var22 = var26 < arg4 ? var26 : arg4;
                        var23 = var27 < arg5 ? var27 : arg5;
                    } else {
                        int var30 = var10.field2701 + var13;
                        int var31 = var10.field2693 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2652 || var20 < var22 && var21 < var23) {
                        if (var10.field2721 != 0) {
                            if (var10.field2721 == 1336) {
                                if (client.field929) {
                                    var14 += 15;
                                    field818.method4491("Fps:" + client.field685, var10.field2701 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && client.field919) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !client.field919) {
                                        var34 = 16711680;
                                    }
                                    field818.method4491("Mem:" + var33 + "k", var10.field2701 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2721 == 1337) {
                                client.field1065 = var13;
                                client.field1061 = var14;
                                client.method4560(var13, var14, var10.field2701, var10.field2693);
                                client.field1122[var10.field2784] = true;
                                class282.method4643(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2721 == 1338) {
                                client.method190();
                                class211 var35 = var10.method3773(false);
                                if (var35 != null) {
                                    class282.method4643(var13, var14, var35.field2611 + var13, var35.field2606 + var14);
                                    if (client.field1017 == 2 || client.field1017 == 5) {
                                        class282.method4666(var13, var14, 0, var35.field2608, var35.field2607);
                                    } else {
                                        int var36 = client.field986 + client.field1000 & 0x7FF;
                                        int var37 = field2350.field1234 / 32 + 48;
                                        int var38 = 464 - field2350.field1276 / 32;
                                        field1788.method4781(var13, var14, var35.field2611, var35.field2606, var37, var38, var36, client.field1077 + 256, var35.field2608, var35.field2607);
                                        for (int var39 = 0; var39 < client.field1146; var39++) {
                                            int var40 = client.field1115[var39] * 4 + 2 - field2350.field1234 / 32;
                                            int var41 = client.field1066[var39] * 4 + 2 - field2350.field1276 / 32;
                                            client.method123(var13, var14, var40, var41, client.field1149[var39], var35);
                                        }
                                        int var42 = 0;
                                        while (true) {
                                            if (var42 >= 104) {
                                                for (int var47 = 0; var47 < client.field953; var47++) {
                                                    class87 var48 = client.field952[client.field954[var47]];
                                                    if (var48 != null && var48.method1015()) {
                                                        class259 var49 = var48.field1379;
                                                        if (var49 != null && var49.field3589 != null) {
                                                            var49 = var49.method4372();
                                                        }
                                                        if (var49 != null && var49.field3571 && var49.field3592) {
                                                            int var50 = var48.field1234 / 32 - field2350.field1234 / 32;
                                                            int var51 = var48.field1276 / 32 - field2350.field1276 / 32;
                                                            client.method123(var13, var14, var50, var51, field2152[1], var35);
                                                        }
                                                    }
                                                }
                                                int var52 = class97.field1500;
                                                int[] var53 = class97.field1502;
                                                for (int var54 = 0; var54 < var52; var54++) {
                                                    class75 var55 = client.field1036[var53[var54]];
                                                    if (var55 != null && var55.method1015() && !var55.field891 && field2350 != var55) {
                                                        int var56 = var55.field1234 / 32 - field2350.field1234 / 32;
                                                        int var57 = var55.field1276 / 32 - field2350.field1276 / 32;
                                                        boolean var58 = false;
                                                        if (client.method27(var55.field888, true)) {
                                                            var58 = true;
                                                        }
                                                        boolean var59 = false;
                                                        for (int var60 = 0; var60 < field370; var60++) {
                                                            if (var55.field888.equals(field17[var60].field912)) {
                                                                var59 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var61 = false;
                                                        if (field2350.field872 != 0 && var55.field872 != 0 && field2350.field872 == var55.field872) {
                                                            var61 = true;
                                                        }
                                                        if (var58) {
                                                            client.method123(var13, var14, var56, var57, field2152[3], var35);
                                                        } else if (var61) {
                                                            client.method123(var13, var14, var56, var57, field2152[4], var35);
                                                        } else if (var59) {
                                                            client.method123(var13, var14, var56, var57, field2152[5], var35);
                                                        } else {
                                                            client.method123(var13, var14, var56, var57, field2152[2], var35);
                                                        }
                                                    }
                                                }
                                                if (client.field931 != 0 && client.field923 % 20 < 10) {
                                                    if (client.field931 == 1 && client.field932 >= 0 && client.field932 < client.field952.length) {
                                                        class87 var62 = client.field952[client.field932];
                                                        if (var62 != null) {
                                                            int var63 = var62.field1234 / 32 - field2350.field1234 / 32;
                                                            int var64 = var62.field1276 / 32 - field2350.field1276 / 32;
                                                            client.method2693(var13, var14, var63, var64, field1311[1], var35);
                                                        }
                                                    }
                                                    if (client.field931 == 2) {
                                                        int var65 = client.field934 * 4 - field749 * 4 + 2 - field2350.field1234 / 32;
                                                        int var66 = client.field1137 * 4 - field357 * 4 + 2 - field2350.field1276 / 32;
                                                        client.method2693(var13, var14, var65, var66, field1311[1], var35);
                                                    }
                                                    if (client.field931 == 10 && client.field1167 >= 0 && client.field1167 < client.field1036.length) {
                                                        class75 var67 = client.field1036[client.field1167];
                                                        if (var67 != null) {
                                                            int var68 = var67.field1234 / 32 - field2350.field1234 / 32;
                                                            int var69 = var67.field1276 / 32 - field2350.field1276 / 32;
                                                            client.method2693(var13, var14, var68, var69, field1311[1], var35);
                                                        }
                                                    }
                                                }
                                                if (client.field1150 != 0) {
                                                    int var70 = client.field1150 * 4 + 2 - field2350.field1234 / 32;
                                                    int var71 = client.field1157 * 4 + 2 - field2350.field1276 / 32;
                                                    client.method123(var13, var14, var70, var71, field1311[0], var35);
                                                }
                                                if (!field2350.field891) {
                                                    class282.method4722(var35.field2611 / 2 + var13 - 1, var35.field2606 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var43 = 0; var43 < 104; var43++) {
                                                class194 var44 = client.field1046[field1449][var42][var43];
                                                if (var44 != null) {
                                                    int var45 = var42 * 4 + 2 - field2350.field1234 / 32;
                                                    int var46 = var43 * 4 + 2 - field2350.field1276 / 32;
                                                    client.method123(var13, var14, var45, var46, field2152[0], var35);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                    client.field1123[var11] = true;
                                }
                                class282.method4643(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2721 == 1339) {
                                class211 var72 = var10.method3773(false);
                                if (var72 != null) {
                                    if (client.field1017 < 3) {
                                        field1559.method4781(var13, var14, var72.field2611, var72.field2606, 25, 25, client.field1000, 256, var72.field2608, var72.field2607);
                                    } else {
                                        class282.method4666(var13, var14, 0, var72.field2608, var72.field2607);
                                    }
                                }
                                class282.method4643(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2721 == 1400) {
                                field2147.method5047(var13, var14, var10.field2701, var10.field2693, client.field923);
                            }
                            if (var10.field2721 == 1401) {
                                field2147.method4975(var13, var14, var10.field2701, var10.field2693);
                            }
                        }
                        if (var10.field2655 == 0) {
                            if (!var10.field2652 && client.method992(var10) && field1355 != var10) {
                                continue;
                            }
                            if (!var10.field2652) {
                                if (var10.field2641 > var10.field2677 - var10.field2693) {
                                    var10.field2641 = var10.field2677 - var10.field2693;
                                }
                                if (var10.field2641 < 0) {
                                    var10.field2641 = 0;
                                }
                            }
                            method3172(arg0, var10.field2653, var20, var21, var22, var23, var13 - var10.field2674, var14 - var10.field2641, var11);
                            if (var10.field2777 != null) {
                                method3172(var10.field2777, var10.field2653, var20, var21, var22, var23, var13 - var10.field2674, var14 - var10.field2641, var11);
                            }
                            class69 var73 = (class69) client.field1135.method3295((long) var10.field2653);
                            if (var73 != null) {
                                client.method178(var73.field819, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class282.method4643(arg2, arg3, arg4, arg5);
                            class137.method2403();
                        }
                        if (client.field1131 || client.field1124[var11] || client.field1129 > 1) {
                            if (var10.field2655 == 0 && !var10.field2652 && var10.field2677 > var10.field2693) {
                                client.method994(var10.field2701 + var13, var14, var10.field2641, var10.field2693, var10.field2677);
                            }
                            if (var10.field2655 != 1) {
                                if (var10.field2655 == 2) {
                                    int var74 = 0;
                                    for (int var75 = 0; var75 < var10.field2783; var75++) {
                                        for (int var76 = 0; var76 < var10.field2664; var76++) {
                                            int var77 = (var10.field2719 + 32) * var76 + var13;
                                            int var78 = (var10.field2720 + 32) * var75 + var14;
                                            if (var74 < 20) {
                                                var77 += var10.field2657[var74];
                                                var78 += var10.field2722[var74];
                                            }
                                            if (var10.field2659[var74] > 0) {
                                                boolean var79 = false;
                                                boolean var80 = false;
                                                int var81 = var10.field2659[var74] - 1;
                                                if (var77 + 32 > arg2 && var77 < arg4 && var78 + 32 > arg3 && var78 < arg5 || field1530 == var10 && client.field1029 == var74) {
                                                    class286 var82;
                                                    if (client.field1069 == 1 && field1091 == var74 && field2153 == var10.field2653) {
                                                        var82 = class257.method2399(var81, var10.field2772[var74], 2, 0, 2, false);
                                                    } else {
                                                        var82 = class257.method2399(var81, var10.field2772[var74], 1, 3153952, 2, false);
                                                    }
                                                    if (var82 == null) {
                                                        client.method1404(var10);
                                                    } else if (field1530 == var10 && client.field1029 == var74) {
                                                        int var83 = class60.field730 - client.field1030;
                                                        int var84 = class60.field716 * 1327680731 - client.field997;
                                                        if (var83 < 5 && var83 > -5) {
                                                            var83 = 0;
                                                        }
                                                        if (var84 < 5 && var84 > -5) {
                                                            var84 = 0;
                                                        }
                                                        if (client.field1034 < 5) {
                                                            var83 = 0;
                                                            var84 = 0;
                                                        }
                                                        var82.method4776(var77 + var83, var78 + var84, 128);
                                                        if (arg1 != -1) {
                                                            class217 var85 = arg0[arg1 & 0xFFFF];
                                                            if (var78 + var84 < class282.field3756 && var85.field2641 > 0) {
                                                                int var86 = client.field991 * (class282.field3756 - var78 - var84) / 3;
                                                                if (var86 > client.field991 * 10) {
                                                                    var86 = client.field991 * 10;
                                                                }
                                                                if (var86 > var85.field2641) {
                                                                    var86 = var85.field2641;
                                                                }
                                                                var85.field2641 -= var86;
                                                                client.field997 += var86;
                                                                client.method1404(var85);
                                                            }
                                                            if (var78 + var84 + 32 > class282.field3757 && var85.field2641 < var85.field2677 - var85.field2693) {
                                                                int var87 = client.field991 * (var78 + var84 + 32 - class282.field3757) / 3;
                                                                if (var87 > client.field991 * 10) {
                                                                    var87 = client.field991 * 10;
                                                                }
                                                                if (var87 > var85.field2677 - var85.field2693 - var85.field2641) {
                                                                    var87 = var85.field2677 - var85.field2693 - var85.field2641;
                                                                }
                                                                var85.field2641 += var87;
                                                                client.field997 -= var87;
                                                                client.method1404(var85);
                                                            }
                                                        }
                                                    } else if (field3682 == var10 && client.field1028 == var74) {
                                                        var82.method4776(var77, var78, 128);
                                                    } else {
                                                        var82.method4770(var77, var78);
                                                    }
                                                }
                                            } else if (var10.field2723 != null && var74 < 20) {
                                                class286 var88 = var10.method3759(var74);
                                                if (var88 != null) {
                                                    var88.method4770(var77, var78);
                                                } else if (class217.field2651) {
                                                    client.method1404(var10);
                                                }
                                            }
                                            var74++;
                                        }
                                    }
                                } else if (var10.field2655 == 3) {
                                    int var89;
                                    if (method472(var10)) {
                                        var89 = var10.field2776;
                                        if (field1355 == var10 && var10.field2747 != 0) {
                                            var89 = var10.field2747;
                                        }
                                    } else {
                                        var89 = var10.field2785;
                                        if (field1355 == var10 && var10.field2765 != 0) {
                                            var89 = var10.field2765;
                                        }
                                    }
                                    if (var10.field2746) {
                                        switch(var10.field2669.field3764) {
                                            case 1:
                                                class282.method4652(var13, var14, var10.field2701, var10.field2693, var10.field2785, var10.field2776, 256 - (var10.field2684 & 0xFF), 256 - (var10.field2685 & 0xFF));
                                                break;
                                            case 2:
                                                class282.method4653(var13, var14, var10.field2701, var10.field2693, var10.field2785, var10.field2776, 256 - (var10.field2684 & 0xFF), 256 - (var10.field2685 & 0xFF));
                                                break;
                                            case 3:
                                                class282.method4654(var13, var14, var10.field2701, var10.field2693, var10.field2785, var10.field2776, 256 - (var10.field2684 & 0xFF), 256 - (var10.field2685 & 0xFF));
                                                break;
                                            case 4:
                                                class282.method4704(var13, var14, var10.field2701, var10.field2693, var10.field2785, var10.field2776, 256 - (var10.field2684 & 0xFF), 256 - (var10.field2685 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class282.method4722(var13, var14, var10.field2701, var10.field2693, var89);
                                                } else {
                                                    class282.method4708(var13, var14, var10.field2701, var10.field2693, var89, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class282.method4658(var13, var14, var10.field2701, var10.field2693, var89);
                                    } else {
                                        class282.method4721(var13, var14, var10.field2701, var10.field2693, var89, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2655 == 4) {
                                    class264 var90 = var10.method3739();
                                    if (var90 != null) {
                                        String var91 = var10.field2644;
                                        int var92;
                                        if (method472(var10)) {
                                            var92 = var10.field2776;
                                            if (field1355 == var10 && var10.field2747 != 0) {
                                                var92 = var10.field2747;
                                            }
                                            if (var10.field2714.length() > 0) {
                                                var91 = var10.field2714;
                                            }
                                        } else {
                                            var92 = var10.field2785;
                                            if (field1355 == var10 && var10.field2765 != 0) {
                                                var92 = var10.field2765;
                                            }
                                        }
                                        if (var10.field2652 && var10.field2773 != -1) {
                                            class257 var93 = class257.method4344(var10.field2773);
                                            var91 = var93.field3507;
                                            if (var91 == null) {
                                                var91 = "null";
                                            }
                                            if ((var93.field3535 == 1 || var10.field2692 != 1) && var10.field2692 != -1) {
                                                var91 = class89.method909(16748608) + var91 + class89.field1395 + " " + 'x' + client.method53(var10.field2692);
                                            }
                                        }
                                        if (client.field1148 == var10) {
                                            class226 var10000 = (class226) null;
                                            var91 = class226.field3029;
                                            var92 = var10.field2785;
                                        }
                                        if (!var10.field2652) {
                                            var91 = client.method1037(var91, var10);
                                        }
                                        var90.method4478(var91, var13, var14, var10.field2701, var10.field2693, var92, var10.field2718 ? 0 : -1, var10.field2716, var10.field2715, var10.field2670);
                                    } else if (class217.field2651) {
                                        client.method1404(var10);
                                    }
                                } else if (var10.field2655 == 5) {
                                    if (var10.field2652) {
                                        class286 var95;
                                        if (var10.field2773 == -1) {
                                            var95 = var10.method3735(false);
                                        } else {
                                            var95 = class257.method2399(var10.field2773, var10.field2692, var10.field2699, var10.field2742, var10.field2711, false);
                                        }
                                        if (var95 != null) {
                                            int var96 = var95.field3784;
                                            int var97 = var95.field3786;
                                            if (var10.field2691) {
                                                class282.method4644(var13, var14, var10.field2701 + var13, var10.field2693 + var14);
                                                int var98 = (var10.field2701 + (var96 - 1)) / var96;
                                                int var99 = (var10.field2693 + (var97 - 1)) / var97;
                                                for (int var100 = 0; var100 < var98; var100++) {
                                                    for (int var101 = 0; var101 < var99; var101++) {
                                                        if (var10.field2643 != 0) {
                                                            var95.method4761(var96 / 2 + var96 * var100 + var13, var97 / 2 + var97 * var101 + var14, var10.field2643, 4096);
                                                        } else if (var15 == 0) {
                                                            var95.method4770(var96 * var100 + var13, var97 * var101 + var14);
                                                        } else {
                                                            var95.method4776(var96 * var100 + var13, var97 * var101 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class282.method4643(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var102 = var10.field2701 * 4096 / var96;
                                                if (var10.field2643 != 0) {
                                                    var95.method4761(var10.field2701 / 2 + var13, var10.field2693 / 2 + var14, var10.field2643, var102);
                                                } else if (var15 != 0) {
                                                    var95.method4778(var13, var14, var10.field2701, var10.field2693, 256 - (var15 & 0xFF));
                                                } else if (var10.field2701 == var96 && var10.field2693 == var97) {
                                                    var95.method4770(var13, var14);
                                                } else {
                                                    var95.method4772(var13, var14, var10.field2701, var10.field2693);
                                                }
                                            }
                                        } else if (class217.field2651) {
                                            client.method1404(var10);
                                        }
                                    } else {
                                        class286 var94 = var10.method3735(method472(var10));
                                        if (var94 != null) {
                                            var94.method4770(var13, var14);
                                        } else if (class217.field2651) {
                                            client.method1404(var10);
                                        }
                                    }
                                } else if (var10.field2655 == 6) {
                                    boolean var103 = method472(var10);
                                    int var104;
                                    if (var103) {
                                        var104 = var10.field2667;
                                    } else {
                                        var104 = var10.field2700;
                                    }
                                    class134 var105 = null;
                                    int var106 = 0;
                                    if (var10.field2773 != -1) {
                                        class257 var107 = class257.method4344(var10.field2773);
                                        if (var107 != null) {
                                            class257 var108 = var107.method4293(var10.field2692);
                                            var105 = var108.method4292(1);
                                            if (var105 == null) {
                                                client.method1404(var10);
                                            } else {
                                                var105.method2324();
                                                var106 = var105.field2130 / 2;
                                            }
                                        }
                                    } else if (var10.field2696 == 5) {
                                        if (var10.field2697 == 0) {
                                            var105 = client.field1189.method3698((class261) null, -1, (class261) null, -1);
                                        } else {
                                            var105 = field2350.method1012();
                                        }
                                    } else if (var104 == -1) {
                                        var105 = var10.method3738((class261) null, -1, var103, field2350.field886);
                                        if (var105 == null && class217.field2651) {
                                            client.method1404(var10);
                                        }
                                    } else {
                                        class261 var109 = class261.method2887(var104);
                                        var105 = var10.method3738(var109, var10.field2775, var103, field2350.field886);
                                        if (var105 == null && class217.field2651) {
                                            client.method1404(var10);
                                        }
                                    }
                                    class137.method2406(var10.field2701 / 2 + var13, var10.field2693 / 2 + var14);
                                    int var110 = var10.field2707 * class137.field2020[var10.field2713] >> 16;
                                    int var111 = var10.field2707 * class137.field2044[var10.field2713] >> 16;
                                    if (var105 != null) {
                                        if (var10.field2652) {
                                            var105.method2324();
                                            if (var10.field2710) {
                                                var105.method2338(0, var10.field2705, var10.field2706, var10.field2713, var10.field2681, var10.field2703 + var106 + var110, var10.field2703 + var111, var10.field2707);
                                            } else {
                                                var105.method2337(0, var10.field2705, var10.field2706, var10.field2713, var10.field2681, var10.field2703 + var106 + var110, var10.field2703 + var111);
                                            }
                                        } else {
                                            var105.method2337(0, var10.field2705, 0, var10.field2713, 0, var110, var111);
                                        }
                                    }
                                    class137.method2405();
                                } else {
                                    if (var10.field2655 == 7) {
                                        class264 var112 = var10.method3739();
                                        if (var112 == null) {
                                            if (class217.field2651) {
                                                client.method1404(var10);
                                            }
                                            continue;
                                        }
                                        int var113 = 0;
                                        for (int var114 = 0; var114 < var10.field2783; var114++) {
                                            for (int var115 = 0; var115 < var10.field2664; var115++) {
                                                if (var10.field2659[var113] > 0) {
                                                    class257 var116 = class257.method4344(var10.field2659[var113] - 1);
                                                    String var117;
                                                    if (var116.field3535 != 1 && var10.field2772[var113] == 1) {
                                                        var117 = class89.method909(16748608) + var116.field3507 + class89.field1395;
                                                    } else {
                                                        var117 = class89.method909(16748608) + var116.field3507 + class89.field1395 + " " + 'x' + client.method53(var10.field2772[var113]);
                                                    }
                                                    int var118 = (var10.field2719 + 115) * var115 + var13;
                                                    int var119 = (var10.field2720 + 12) * var114 + var14;
                                                    if (var10.field2716 == 0) {
                                                        var112.method4472(var117, var118, var119, var10.field2785, var10.field2718 ? 0 : -1);
                                                    } else if (var10.field2716 == 1) {
                                                        var112.method4507(var117, var10.field2701 / 2 + var118, var119, var10.field2785, var10.field2718 ? 0 : -1);
                                                    } else {
                                                        var112.method4491(var117, var10.field2701 + var118 - 1, var119, var10.field2785, var10.field2718 ? 0 : -1);
                                                    }
                                                }
                                                var113++;
                                            }
                                        }
                                    }
                                    if (var10.field2655 == 8 && field1320 == var10 && client.field1119 == client.field1095) {
                                        int var120 = 0;
                                        int var121 = 0;
                                        class264 var122 = field818;
                                        String var123 = var10.field2644;
                                        String var124 = client.method1037(var123, var10);
                                        while (var124.length() > 0) {
                                            int var125 = var124.indexOf(class89.field1394);
                                            String var126;
                                            if (var125 == -1) {
                                                var126 = var124;
                                                var124 = "";
                                            } else {
                                                var126 = var124.substring(0, var125);
                                                var124 = var124.substring(var125 + 4);
                                            }
                                            int var127 = var122.method4467(var126);
                                            if (var127 > var120) {
                                                var120 = var127;
                                            }
                                            var121 += var122.field3653 + 1;
                                        }
                                        var120 += 6;
                                        var121 += 7;
                                        int var128 = var10.field2701 + var13 - 5 - var120;
                                        int var129 = var10.field2693 + var14 + 5;
                                        if (var128 < var13 + 5) {
                                            var128 = var13 + 5;
                                        }
                                        if (var120 + var128 > arg4) {
                                            var128 = arg4 - var120;
                                        }
                                        if (var121 + var129 > arg5) {
                                            var129 = arg5 - var121;
                                        }
                                        class282.method4722(var128, var129, var120, var121, 16777120);
                                        class282.method4658(var128, var129, var120, var121, 0);
                                        String var130 = var10.field2644;
                                        int var131 = var122.field3653 + var129 + 2;
                                        String var132 = client.method1037(var130, var10);
                                        while (var132.length() > 0) {
                                            int var133 = var132.indexOf(class89.field1394);
                                            String var134;
                                            if (var133 == -1) {
                                                var134 = var132;
                                                var132 = "";
                                            } else {
                                                var134 = var132.substring(0, var133);
                                                var132 = var132.substring(var133 + 4);
                                            }
                                            var122.method4472(var134, var128 + 3, var131, 0, -1);
                                            var131 += var122.field3653 + 1;
                                        }
                                    }
                                    if (var10.field2655 == 9) {
                                        int var135;
                                        int var136;
                                        int var137;
                                        int var138;
                                        if (var10.field2687) {
                                            var135 = var13;
                                            var136 = var10.field2693 + var14;
                                            var137 = var10.field2701 + var13;
                                            var138 = var14;
                                        } else {
                                            var135 = var13;
                                            var136 = var14;
                                            var137 = var10.field2701 + var13;
                                            var138 = var10.field2693 + var14;
                                        }
                                        if (var10.field2686 == 1) {
                                            class282.method4651(var135, var136, var137, var138, var10.field2785);
                                        } else {
                                            int var141 = var10.field2785;
                                            int var142 = var10.field2686;
                                            int var143 = var137 - var135;
                                            int var144 = var138 - var136;
                                            int var145 = var143 >= 0 ? var143 : -var143;
                                            int var146 = var144 >= 0 ? var144 : -var144;
                                            int var147 = var145;
                                            if (var145 < var146) {
                                                var147 = var146;
                                            }
                                            if (var147 != 0) {
                                                int var148 = (var143 << 16) / var147;
                                                int var149 = (var144 << 16) / var147;
                                                if (var149 <= var148) {
                                                    var148 = -var148;
                                                } else {
                                                    var149 = -var149;
                                                }
                                                int var150 = var142 * var149 >> 17;
                                                int var151 = var142 * var149 + 1 >> 17;
                                                int var152 = var142 * var148 >> 17;
                                                int var153 = var142 * var148 + 1 >> 17;
                                                int var154 = var135 - class282.field3755;
                                                int var155 = var136 - class282.field3756;
                                                int var156 = var150 + var154;
                                                int var157 = var154 - var151;
                                                int var158 = var143 + var154 - var151;
                                                int var159 = var143 + var154 + var150;
                                                int var160 = var152 + var155;
                                                int var161 = var155 - var153;
                                                int var162 = var144 + var155 - var153;
                                                int var163 = var144 + var155 + var152;
                                                class137.method2411(var156, var157, var158);
                                                class137.method2414(var160, var161, var162, var156, var157, var158, var141);
                                                class137.method2411(var156, var158, var159);
                                                class137.method2414(var160, var162, var163, var156, var158, var159, var141);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.ij(Lhj;IIZI)V")
    public static void method4(class217 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2701;
        int var5 = arg0.field2693;
        if (arg0.field2660 == 0) {
            arg0.field2701 = arg0.field2664;
        } else if (arg0.field2660 == 1) {
            arg0.field2701 = arg1 - arg0.field2664;
        } else if (arg0.field2660 == 2) {
            arg0.field2701 = arg0.field2664 * arg1 >> 14;
        }
        if (arg0.field2661 == 0) {
            arg0.field2693 = arg0.field2783;
        } else if (arg0.field2661 == 1) {
            arg0.field2693 = arg2 - arg0.field2783;
        } else if (arg0.field2661 == 2) {
            arg0.field2693 = arg0.field2783 * arg2 >> 14;
        }
        if (arg0.field2660 == 4) {
            arg0.field2701 = arg0.field2750 * arg0.field2693 / arg0.field2671;
        }
        if (arg0.field2661 == 4) {
            arg0.field2693 = arg0.field2701 * arg0.field2671 / arg0.field2750;
        }
        if (client.field1087 && arg0.field2655 == 0) {
            if (arg0.field2693 < 5 && arg0.field2701 < 5) {
                arg0.field2693 = 5;
                arg0.field2701 = 5;
            } else {
                if (arg0.field2693 <= 0) {
                    arg0.field2693 = 5;
                }
                if (arg0.field2701 <= 0) {
                    arg0.field2701 = 5;
                }
            }
        }
        if (arg0.field2721 == 1337) {
            client.field1089 = arg0;
        }
        if (arg3 && arg0.field2762 != null && (arg0.field2701 != var4 || arg0.field2693 != var5)) {
            class70 var6 = new class70();
            var6.field825 = arg0;
            var6.field834 = arg0.field2762;
            client.field1116.method3384(var6);
        }
    }

    @ObfuscatedName("ab.il(Lhj;I)Z")
    public static final boolean method472(class217 arg0) {
        if (arg0.field2766 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2766.length; var1++) {
            int var2 = client.method4450(arg0, var1);
            int var3 = arg0.field2767[var1];
            if (arg0.field2766[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2766[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2766[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("e.iu([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method58(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }
}
