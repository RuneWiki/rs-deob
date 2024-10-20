package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("client.br")
    public static String field1063;

    @ObfuscatedName("client.dj")
    public static class154 field1158;

    @ObfuscatedName("client.bc")
    public static class233 field1208;

    @ObfuscatedName("client.pr")
    public static int field1209;

    @ObfuscatedName("bk.kv")
    public static class217 field1212;

    @ObfuscatedName("bi.lv")
    public static int field1238;

    @ObfuscatedName("cw.s")
    public static class81[] field1309;

    @ObfuscatedName("cw.k")
    public static class78 field1312;

    @ObfuscatedName("cw.eh")
    public static int field1322;

    @ObfuscatedName("cw.ea")
    public static class264 field1323;

    @ObfuscatedName("ck.t")
    public static String[] field1358;

    @ObfuscatedName("ck.l")
    public static class217 field1365;

    @ObfuscatedName("ck.a")
    public static int[] field1367;

    @ObfuscatedName("ck.y")
    public static class285 field1370;

    @ObfuscatedName("ck.q")
    public static int[] field1371;

    @ObfuscatedName("ch.g")
    public static int[] field1383;

    @ObfuscatedName("ch.d")
    public static String field1384;

    @ObfuscatedName("cn.j")
    public static int field1390;

    @ObfuscatedName("ca.j")
    public static short[] field1399;

    @ObfuscatedName("cm.cb")
    public static class238 field1408;

    @ObfuscatedName("cf.cm")
    public static class154 field1431;

    @ObfuscatedName("cp.be")
    public static class285 field1446;

    @ObfuscatedName("cp.cz")
    public static class238 field1447;

    @ObfuscatedName("cp.ao")
    public static Image field1449;

    @ObfuscatedName("cj.r")
    public static class286 field1452;

    @ObfuscatedName("cj.a")
    public static class285 field1462;

    @ObfuscatedName("cj.t")
    public static class285 field1476;

    @ObfuscatedName("a.fj")
    public static class140 field15;

    @ObfuscatedName("cz.ai")
    public static Font field1508;

    @ObfuscatedName("ci.ij")
    public static class217 field1514;

    @ObfuscatedName("ci.pn")
    public static int field1516;

    @ObfuscatedName("cu.dy")
    public static int field1531;

    @ObfuscatedName("cx.cu")
    public static class238 field1546;

    @ObfuscatedName("cy.aa")
    public static int field1560;

    @ObfuscatedName("cb.z")
    public static int field1577;

    @ObfuscatedName("dr.v")
    public static byte[] field1601;

    @ObfuscatedName("dr.g")
    public static float[] field1602;

    @ObfuscatedName("dr.y")
    public static int field1603;

    @ObfuscatedName("dr.j")
    public static int field1604;

    @ObfuscatedName("dr.k")
    public static int field1605;

    @ObfuscatedName("dr.e")
    public static int field1606;

    @ObfuscatedName("dr.an")
    public static int[] field1607;

    @ObfuscatedName("dr.l")
    public static class116[] field1609;

    @ObfuscatedName("dr.z")
    public static class109[] field1610;

    @ObfuscatedName("dr.m")
    public static boolean[] field1611;

    @ObfuscatedName("dr.aw")
    public static float[] field1612;

    @ObfuscatedName("dr.o")
    public static class105[] field1614;

    @ObfuscatedName("dr.d")
    public static float[] field1618;

    @ObfuscatedName("dr.c")
    public static class121[] field1619;

    @ObfuscatedName("dr.x")
    public static float[] field1621;

    @ObfuscatedName("dr.ah")
    public static float[] field1622;

    @ObfuscatedName("dr.ab")
    public static float[] field1623;

    @ObfuscatedName("dr.ai")
    public static int[] field1625;

    @ObfuscatedName("dr.h")
    public static float[] field1626;

    @ObfuscatedName("dr.b")
    public static int[] field1629;

    @ObfuscatedName("di.k")
    public static int[] field1644;

    @ObfuscatedName("di.e")
    public static int[] field1645;

    @ObfuscatedName("di.o")
    public static boolean[] field1646;

    @ObfuscatedName("dl.j")
    public static int field1648;

    @ObfuscatedName("dl.z")
    public static class104 field1661;

    @ObfuscatedName("dl.r")
    public static boolean field1665;

    @ObfuscatedName("a.mo")
    public static class157 field17;

    @ObfuscatedName("dc.j")
    public static int field1716;

    @ObfuscatedName("dc.y")
    public static float field1721;

    @ObfuscatedName("dp.cv")
    public static class160 field1777;

    @ObfuscatedName("dp.eo")
    public static int field1778;

    @ObfuscatedName("dj.e")
    public static class236 field1877;

    @ObfuscatedName("ee.c")
    public static int[] field1888;

    @ObfuscatedName("et.bp")
    public static int field1973;

    @ObfuscatedName("et.br")
    public static int field1991;

    @ObfuscatedName("et.bg")
    public static int field1992;

    @ObfuscatedName("t.v")
    public static class286 field20;

    @ObfuscatedName("ex.s")
    public static int field2002;

    @ObfuscatedName("ex.j")
    public static int field2003;

    @ObfuscatedName("ex.r")
    public static int field2007;

    @ObfuscatedName("ex.v")
    public static int field2008;

    @ObfuscatedName("ex.e")
    public static int field2010;

    @ObfuscatedName("ep.c")
    public static int field2022;

    @ObfuscatedName("ep.d")
    public static class146 field2029;

    @ObfuscatedName("ep.l")
    public static int field2034;

    @ObfuscatedName("ep.z")
    public static int field2035;

    @ObfuscatedName("ep.m")
    public static int field2036;

    @ObfuscatedName("ep.b")
    public static int field2037;

    @ObfuscatedName("ep.n")
    public static int field2039;

    @ObfuscatedName("ep.u")
    public static int field2040;

    @ObfuscatedName("ep.f")
    public static int field2047;

    @ObfuscatedName("ed.g")
    public static int[] field2065;

    @ObfuscatedName("ed.pq")
    public static class110 field2066;

    @ObfuscatedName("ew.ai")
    public static int field2076;

    @ObfuscatedName("ew.bg")
    public static int field2079;

    @ObfuscatedName("ew.h")
    public static int field2083;

    @ObfuscatedName("ew.b")
    public static int field2085;

    @ObfuscatedName("ew.f")
    public static int field2086;

    @ObfuscatedName("ew.n")
    public static int field2087;

    @ObfuscatedName("ew.u")
    public static int field2088;

    @ObfuscatedName("ew.bt")
    public static boolean[][] field2089;

    @ObfuscatedName("ew.d")
    public static int field2091;

    @ObfuscatedName("ew.ab")
    public static int field2096;

    @ObfuscatedName("ew.br")
    public static int field2097;

    @ObfuscatedName("ew.x")
    public static int field2098;

    @ObfuscatedName("ew.q")
    public static int field2099;

    @ObfuscatedName("ew.ah")
    public static int field2116;

    @ObfuscatedName("ew.bp")
    public static int field2118;

    @ObfuscatedName("ew.p")
    public static int field2119;

    @ObfuscatedName("ew.aw")
    public static int field2125;

    @ObfuscatedName("ew.bl")
    public static int field2126;

    @ObfuscatedName("ew.g")
    public static int field2127;

    @ObfuscatedName("ew.bo")
    public static int field2130;

    @ObfuscatedName("ew.bw")
    public static int field2131;

    @ObfuscatedName("ej.iu")
    public static int field2137;

    @ObfuscatedName("en.u")
    public static class174 field2151;

    @ObfuscatedName("en.f")
    public static String[] field2154;

    @ObfuscatedName("en.if")
    public static class217 field2156;

    @ObfuscatedName("eq.ce")
    public static class238 field2158;

    @ObfuscatedName("eq.s")
    public static File field2159;

    @ObfuscatedName("ea.cs")
    public static class238 field2195;

    @ObfuscatedName("ev.ph")
    public static int field2224;

    @ObfuscatedName("er.a")
    public static int field2233;

    @ObfuscatedName("er.w")
    public static String field2235;

    @ObfuscatedName("er.v")
    public static boolean[] field2238;

    @ObfuscatedName("er.i")
    public static Applet field2239;

    @ObfuscatedName("eo.w")
    public static String field2249;

    @ObfuscatedName("eo.i")
    public static String field2254;

    @ObfuscatedName("eg.gb")
    public static int field2255;

    @ObfuscatedName("eg.t")
    public static File field2258;

    @ObfuscatedName("eg.p")
    public static String field2262;

    @ObfuscatedName("eg.q")
    public static String field2264;

    @ObfuscatedName("fn.w")
    public static File field2269;

    @ObfuscatedName("fn.gv")
    public static int field2270;

    @ObfuscatedName("fn.k")
    public static class112 field2271;

    @ObfuscatedName("fb.z")
    public static int[] field2274;

    @ObfuscatedName("fv.pj")
    public static int field2290;

    @ObfuscatedName("v.gk")
    public static class7[] field230;

    @ObfuscatedName("ft.h")
    public static int field2309;

    @ObfuscatedName("ft.k")
    public static class236 field2310;

    @ObfuscatedName("fc.r")
    public static int field2314;

    @ObfuscatedName("fq.aj")
    public static class232 field2333;

    @ObfuscatedName("fy.cv")
    public static int field2347;

    @ObfuscatedName("fd.dn")
    public static class238 field2353;

    @ObfuscatedName("fg.y")
    public static ScheduledExecutorService field2357;

    @ObfuscatedName("fo.de")
    public static String field2362;

    @ObfuscatedName("y.l")
    public static class235 field238;

    @ObfuscatedName("y.r")
    public static int[] field240;

    @ObfuscatedName("fp.ic")
    public static class217 field2406;

    @ObfuscatedName("fp.l")
    public static int[] field2407;

    @ObfuscatedName("fm.pd")
    public static int field2415;

    @ObfuscatedName("fl.i")
    public static long field2418;

    @ObfuscatedName("fl.w")
    public static long field2419;

    @ObfuscatedName("fa.bb")
    public static class285[] field2423;

    @ObfuscatedName("fk.fh")
    public static byte[][] field2430;

    @ObfuscatedName("fk.pf")
    public static int field2439;

    @ObfuscatedName("fw.z")
    public static boolean field2442;

    @ObfuscatedName("gr.go")
    public static class286[] field2443;

    @ObfuscatedName("gr.r")
    public static int field2446;

    @ObfuscatedName("j.gk")
    public static class285[] field247;

    @ObfuscatedName("j.re")
    public static class82 field248;

    @ObfuscatedName("ge.i")
    public static class236 field2507;

    @ObfuscatedName("ge.a")
    public static class236 field2508;

    @ObfuscatedName("ge.t")
    public static class205 field2510;

    @ObfuscatedName("ge.v")
    public static int field2512;

    @ObfuscatedName("ge.y")
    public static int field2513;

    @ObfuscatedName("ge.j")
    public static int field2514;

    @ObfuscatedName("ge.w")
    public static class236 field2515;

    @ObfuscatedName("ge.e")
    public static boolean field2516;

    @ObfuscatedName("ge.k")
    public static int field2518;

    @ObfuscatedName("gg.k")
    public static int field2583;

    @ObfuscatedName("e.o")
    public static int[] field259;

    @ObfuscatedName("gg.pz")
    public static int field2592;

    @ObfuscatedName("he.ko")
    public static int field2599;

    @ObfuscatedName("e.ci")
    public static class238 field260;

    @ObfuscatedName("hf.j")
    public static byte[][] field2610;

    @ObfuscatedName("hb.bo")
    public static int field2619;

    @ObfuscatedName("hb.jg")
    public static int field2620;

    @ObfuscatedName("hx.k")
    public static short[][] field2621;

    @ObfuscatedName("hx.y")
    public static short[][] field2628;

    @ObfuscatedName("o.om")
    public static class76[] field263;

    @ObfuscatedName("hz.a")
    public static class236 field2640;

    @ObfuscatedName("hz.eu")
    public static class160 field2641;

    @ObfuscatedName("hz.an")
    public static FontMetrics field2643;

    @ObfuscatedName("ho.y")
    public static class236 field2647;

    @ObfuscatedName("z.ah")
    public static int[] field271;

    @ObfuscatedName("z.og")
    public static byte field272;

    @ObfuscatedName("z.cp")
    public static long field273;

    @ObfuscatedName("z.dr")
    public static class238 field275;

    @ObfuscatedName("ho.j")
    public static class236 field2751;

    @ObfuscatedName("hs.lx")
    public static int field2810;

    @ObfuscatedName("l.km")
    public static class90 field282;

    @ObfuscatedName("hv.o")
    public static class210 field2844;

    @ObfuscatedName("hr.dc")
    public static int field2854;

    @ObfuscatedName("hr.e")
    public static class285 field2856;

    @ObfuscatedName("ha.pi")
    public static class117 field2897;

    @ObfuscatedName("c.fq")
    public static byte[][] field291;

    @ObfuscatedName("c.x")
    public static int[] field294;

    @ObfuscatedName("m.f")
    public static int field295;

    @ObfuscatedName("m.rs")
    public static short[] field297;

    @ObfuscatedName("m.i")
    public static class236 field299;

    @ObfuscatedName("b.ct")
    public static class238 field311;

    @ObfuscatedName("b.eq")
    public static class263 field314;

    @ObfuscatedName("hl.v")
    public static int[] field3147;

    @ObfuscatedName("f.k")
    public static int[] field317;

    @ObfuscatedName("hy.r")
    public static class236 field3173;

    @ObfuscatedName("f.i")
    public static boolean field318;

    @ObfuscatedName("hu.e")
    public static int[] field3191;

    @ObfuscatedName("ht.v")
    public static class236 field3208;

    @ObfuscatedName("ht.s")
    public static int field3212;

    @ObfuscatedName("ht.kw")
    public static int field3213;

    @ObfuscatedName("iq.iz")
    public static int field3222;

    @ObfuscatedName("n.co")
    public static class238 field323;

    @ObfuscatedName("iq.cm")
    public static char field3239;

    @ObfuscatedName("n.v")
    public static short[] field324;

    @ObfuscatedName("ih.r")
    public static Thread field3246;

    @ObfuscatedName("ix.gm")
    public static class286[] field3259;

    @ObfuscatedName("ic.a")
    public static long field3264;

    @ObfuscatedName("ic.i")
    public static class160 field3273;

    @ObfuscatedName("iz.i")
    public static class236 field3286;

    @ObfuscatedName("u.pe")
    public static class103 field329;

    @ObfuscatedName("io.w")
    public static int field3290;

    @ObfuscatedName("io.i")
    public static class236 field3293;

    @ObfuscatedName("ij.a")
    public static int field3296;

    @ObfuscatedName("s.c")
    public static class124[] field33;

    @ObfuscatedName("u.gp")
    public static class286 field330;

    @ObfuscatedName("ij.w")
    public static class243[] field3304;

    @ObfuscatedName("if.i")
    public static class236 field3320;

    @ObfuscatedName("ip.o")
    public static int field3322;

    @ObfuscatedName("ip.i")
    public static class236 field3325;

    @ObfuscatedName("ip.p")
    public static int[] field3327;

    @ObfuscatedName("ip.ee")
    public static class160 field3329;

    @ObfuscatedName("ir.w")
    public static class236 field3339;

    @ObfuscatedName("ir.i")
    public static class236 field3348;

    @ObfuscatedName("ia.i")
    public static class236 field3351;

    @ObfuscatedName("iv.w")
    public static class236 field3358;

    @ObfuscatedName("p.z")
    public static class113 field336;

    @ObfuscatedName("iv.a")
    public static int field3360;

    @ObfuscatedName("iv.af")
    public static class286[] field3368;

    @ObfuscatedName("iv.i")
    public static class236 field3370;

    @ObfuscatedName("iv.kk")
    public static class217 field3372;

    @ObfuscatedName("it.w")
    public static class236 field3374;

    @ObfuscatedName("it.i")
    public static class236 field3381;

    @ObfuscatedName("p.m")
    public static int field339;

    @ObfuscatedName("iw.i")
    public static class236 field3392;

    @ObfuscatedName("p.cl")
    public static class154 field340;

    @ObfuscatedName("ie.i")
    public static class236 field3400;

    @ObfuscatedName("ib.i")
    public static class236 field3407;

    @ObfuscatedName("ib.z")
    public static class264 field3408;

    @ObfuscatedName("il.i")
    public static class236 field3410;

    @ObfuscatedName("iu.w")
    public static class236 field3420;

    @ObfuscatedName("q.al")
    public static boolean field343;

    @ObfuscatedName("iu.i")
    public static class236 field3442;

    @ObfuscatedName("ig.w")
    public static class236 field3447;

    @ObfuscatedName("ig.a")
    public static class236 field3448;

    @ObfuscatedName("d.gi")
    public static class285[] field347;

    @ObfuscatedName("d.gz")
    public static int field348;

    @ObfuscatedName("iy.i")
    public static class236 field3568;

    @ObfuscatedName("iy.w")
    public static class236 field3585;

    @ObfuscatedName("in.i")
    public static class236 field3596;

    @ObfuscatedName("jn.a")
    public static class236 field3608;

    @ObfuscatedName("jn.i")
    public static class236 field3618;

    @ObfuscatedName("jn.w")
    public static class236 field3623;

    @ObfuscatedName("jr.cr")
    public static class238 field3628;

    @ObfuscatedName("jr.ae")
    public static client field3633;

    @ObfuscatedName("jo.gc")
    public static class285[] field3640;

    @ObfuscatedName("jo.lp")
    public static class217[] field3642;

    @ObfuscatedName("ju.k")
    public static class285[] field3664;

    @ObfuscatedName("jq.i")
    public static class166 field3666;

    @ObfuscatedName("ja.s")
    public static class285[] field3670;

    @ObfuscatedName("ja.er")
    public static int field3674;

    @ObfuscatedName("jp.s")
    public static int field3679;

    @ObfuscatedName("g.dd")
    public static long field369;

    @ObfuscatedName("ji.ln")
    public static int field3690;

    @ObfuscatedName("jt.y")
    public static int[] field3746;

    @ObfuscatedName("jb.ai")
    public static int field3757;

    @ObfuscatedName("jb.ab")
    public static int[] field3758;

    @ObfuscatedName("ah.n")
    public static int[] field376;

    @ObfuscatedName("jb.aw")
    public static int field3761;

    @ObfuscatedName("ah.gw")
    public static class286[] field378;

    @ObfuscatedName("ke.a")
    public static int field3797;

    @ObfuscatedName("ke.i")
    public static int field3799;

    @ObfuscatedName("ke.t")
    public static int[] field3800;

    @ObfuscatedName("ke.s")
    public static int[] field3801;

    @ObfuscatedName("ke.w")
    public static int field3802;

    @ObfuscatedName("ah.ky")
    public static int field391;

    @ObfuscatedName("ah.bz")
    public static class72 field394;

    @ObfuscatedName("ah.ft")
    public static int[] field395;

    @ObfuscatedName("ab.y")
    public static int field398;

    @ObfuscatedName("r.k")
    public static class285 field41;

    @ObfuscatedName("aw.fi")
    public static int[][] field416;

    @ObfuscatedName("aw.oh")
    public static int field417;

    @ObfuscatedName("aw.dx")
    public static class238 field425;

    @ObfuscatedName("ai.fz")
    public static int field429;

    @ObfuscatedName("an.bp")
    public static String field444;

    @ObfuscatedName("an.b")
    public static class48 field450;

    @ObfuscatedName("an.jv")
    public static int field451;

    @ObfuscatedName("au.gn")
    public static class286 field453;

    @ObfuscatedName("au.hz")
    public static int field457;

    @ObfuscatedName("au.po")
    public static int field458;

    @ObfuscatedName("au.gf")
    public static class286[] field459;

    @ObfuscatedName("ay.bg")
    public static int field481;

    @ObfuscatedName("ay.df")
    public static int field482;

    @ObfuscatedName("ao.cq")
    public static boolean field500;

    @ObfuscatedName("ao.pv")
    public static int field501;

    @ObfuscatedName("as.od")
    public static byte field511;

    @ObfuscatedName("as.m")
    public static int field515;

    @ObfuscatedName("ak.am")
    public static String field516;

    @ObfuscatedName("ak.r")
    public static byte[][][] field519;

    @ObfuscatedName("aq.da")
    public static int field530;

    @ObfuscatedName("aq.ei")
    public static class264 field531;

    @ObfuscatedName("aq.b")
    public static String[] field534;

    @ObfuscatedName("ax.j")
    public static class285[] field544;

    @ObfuscatedName("ax.rm")
    public static int field546;

    @ObfuscatedName("ac.c")
    public static int[][][] field556;

    @ObfuscatedName("ac.rt")
    public static GarbageCollectorMXBean field559;

    @ObfuscatedName("ac.m")
    public static class174 field560;

    @ObfuscatedName("at.rn")
    public static int field570;

    @ObfuscatedName("at.ix")
    public static int field572;

    @ObfuscatedName("av.u")
    public static int[] field587;

    @ObfuscatedName("am.j")
    public static int field597;

    @ObfuscatedName("am.ra")
    public static long field600;

    @ObfuscatedName("am.rj")
    public static class289 field601;

    @ObfuscatedName("am.gs")
    public static class286[] field602;

    @ObfuscatedName("am.at")
    public static class283 field603;

    @ObfuscatedName("az.cx")
    public static class238 field606;

    @ObfuscatedName("az.cj")
    public static class238 field612;

    @ObfuscatedName("al.fc")
    public static int[] field617;

    @ObfuscatedName("al.d")
    public static int field618;

    @ObfuscatedName("al.el")
    public static class264 field619;

    @ObfuscatedName("ad.z")
    public static class159 field626;

    @ObfuscatedName("ad.y")
    public static int field627;

    @ObfuscatedName("ad.r")
    public static class217[][] field628;

    @ObfuscatedName("ag.aj")
    public static class285[] field652;

    @ObfuscatedName("af.k")
    public static int field667;

    @ObfuscatedName("af.ev")
    public static int field669;

    @ObfuscatedName("bc.fv")
    public static int[] field692;

    @ObfuscatedName("bc.dm")
    public static class238 field694;

    @ObfuscatedName("bp.i")
    public static class155 field721;

    @ObfuscatedName("bp.ac")
    public static String field736;

    @ObfuscatedName("br.pw")
    public static class110 field756;

    @ObfuscatedName("br.op")
    public static class286 field759;

    @ObfuscatedName("bg.z")
    public static class217 field767;

    @ObfuscatedName("bg.ge")
    public static int field768;

    @ObfuscatedName("bo.bc")
    public static class285[] field769;

    @ObfuscatedName("bo.y")
    public static byte[][][] field772;

    @ObfuscatedName("bo.t")
    public static byte[][][] field774;

    @ObfuscatedName("bo.j")
    public static int[][] field775;

    @ObfuscatedName("bo.s")
    public static byte[][][] field781;

    @ObfuscatedName("bo.di")
    public static class238 field784;

    @ObfuscatedName("bo.r")
    public static class236 field786;

    @ObfuscatedName("bo.nh")
    public static class277 field788;

    @ObfuscatedName("bw.jx")
    public static int field797;

    @ObfuscatedName("bm.is")
    public static class75 field803;

    @ObfuscatedName("bm.y")
    public static boolean field808;

    @ObfuscatedName("bx.gq")
    public static class286[] field821;

    @ObfuscatedName("bz.pc")
    public static int field833;

    @ObfuscatedName("bz.rr")
    public static class14 field834;

    @ObfuscatedName("bh.v")
    public static byte[][][] field840;

    @ObfuscatedName("bn.hn")
    public static int field861;

    @ObfuscatedName("bn.ry")
    public static class161 field862;

    @ObfuscatedName("bn.ab")
    public static int[] field865;

    @ObfuscatedName("bn.rb")
    public static class292 field867;

    @ObfuscatedName("bf.mc")
    public static class98 field874;

    @ObfuscatedName("bd.jt")
    public static int field886;

    @ObfuscatedName("bq.gl")
    public static int field891;

    @ObfuscatedName("w.cy")
    public static class238 field9;

    @ObfuscatedName("bq.fg")
    public static int field901;

    @ObfuscatedName("client.be")
    public static class290 field929;

    @ObfuscatedName("n.i(Liq;Liq;IZI)Leq;")
    public static class145 method125(class236 arg0, class236 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method3775(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method3839(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method3839(0, var8);
                } else {
                    var9 = arg1.method3839(var8, 0);
                }
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        if (!var4) {
            return null;
        }
        try {
            return new class145(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @ObfuscatedName("av.w([BILjava/lang/CharSequence;I)I")
    public static int method529(byte[] arg0, int arg1, CharSequence arg2) {
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

    @ObfuscatedName("cx.w(Liq;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1705(class236 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3800(arg1);
        int var6 = arg0.method3785(var5, arg2);
        class204.method219(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cq.r(ILiq;IIIZI)V")
    public static void method1495(int arg0, class236 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class204.field2509 = 1;
        field786 = arg1;
        field2512 = arg2;
        field2513 = arg3;
        field2514 = arg4;
        field2516 = arg5;
        field2518 = arg0;
    }

    @ObfuscatedName("bc.r(I)V")
    public static void method695() {
        class252.field3401.method3232();
    }

    @ObfuscatedName("w.a(I)V")
    public static void method4() {
        class125 var0 = null;
        try {
            var0 = class156.method150("", field1208.field3204, true);
            class174 var1 = field248.method1476();
            var0.method2139(var1.field2405, 0, var1.field2399);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2157();
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("am.t(IIIIIIIB)Z")
    public static final boolean method558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class135.field2009 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = class135.field2009 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = class135.field2015 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = class135.field2015 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }

    @ObfuscatedName("em.a(Liq;Liq;ZIB)V")
    public static void method2633(class236 arg0, class236 arg1, boolean arg2, int arg3) {
        if (!field318) {
            class93.field1455 = arg3;
            class282.method4559();
            byte[] var4 = arg0.method3799("title.jpg", "");
            field1452 = class55.method3607(var4);
            field20 = field1452.method4657();
            if ((client.field927 & 0x20000000) == 0) {
                field1370 = class287.method2863(arg1, "logo", "");
            } else {
                field1370 = class287.method2863(arg1, "logo_deadman_mode", "");
            }
            field1462 = class287.method2863(arg1, "titlebox", "");
            field1476 = class287.method2863(arg1, "titlebutton", "");
            field3670 = class287.method1008(arg1, "runes", "");
            field544 = class287.method1008(arg1, "title_mute", "");
            field41 = class287.method2863(arg1, "options_radio_buttons,0", "");
            field2856 = class287.method2863(arg1, "options_radio_buttons,2", "");
            field587 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                field587[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                field587[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                field587[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                field587[var8 + 192] = 16777215;
            }
            field3327 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                field3327[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                field3327[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                field3327[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                field3327[var12 + 192] = 16777215;
            }
            field1371 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                field1371[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                field1371[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                field1371[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                field1371[var16 + 192] = 16777215;
            }
            field376 = new int[256];
            field1383 = new int[32768];
            field294 = new int[32768];
            class93.method2122((class285) null);
            field271 = new int[32768];
            field865 = new int[32768];
            if (arg2) {
                class93.field1472 = "";
                class93.field1475 = "";
            }
            field1560 = 0;
            field516 = "";
            class93.field1474 = true;
            class93.field1479 = false;
            if (field248.field1329) {
                class204.method3077(2);
            } else {
                class204.method2707(2, field606, "scape main", "", 255, false);
            }
            class239.method2849(false);
            field318 = true;
            class93.field1471 = (field618 - 765) / 2;
            class93.field1456 = class93.field1471 + 202;
            field1452.method4691(class93.field1471, 0);
            field20.method4691(class93.field1471 + 382, 0);
            field1370.method4642(class93.field1471 + 382 - field1370.field3779 / 2, 18);
        } else if (arg3 == 4) {
            class93.field1455 = 4;
        }
    }

    @ObfuscatedName("fi.z(CB)Z")
    public static boolean method2786(char arg0) {
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= 160 && arg0 <= 255) {
            return true;
        } else {
            return arg0 == 8364 || arg0 == 338 || arg0 == 8212 || arg0 == 339 || arg0 == 376;
        }
    }

    @ObfuscatedName("m.fi(II)V")
    public static void method78(int arg0) {
        if (arg0 == -3) {
            class93.method56(class226.field2902, class226.field2946, class226.field2867);
        } else if (arg0 == -2) {
            class93.method56(class226.field2905, class226.field2906, class226.field2862);
        } else if (arg0 == -1) {
            class93.method56(class226.field2961, class226.field2996, class226.field2910);
        } else if (arg0 == 3) {
            class93.field1455 = 3;
        } else if (arg0 == 4) {
            class93.method56(class226.field2911, class226.field2912, class226.field2925);
        } else if (arg0 == 5) {
            class93.method56(class226.field2914, class226.field2915, class226.field2866);
        } else if (arg0 == 6) {
            class93.method56(class226.field3045, class226.field2918, class226.field2919);
        } else if (arg0 == 7) {
            class93.method56(class226.field3116, class226.field2921, class226.field2922);
        } else if (arg0 == 8) {
            class93.method56(class226.field2907, class226.field3043, class226.field3107);
        } else if (arg0 == 9) {
            class93.method56(class226.field2913, class226.field3098, class226.field2928);
        } else if (arg0 == 10) {
            class93.method56(class226.field2929, class226.field2884, class226.field2931);
        } else if (arg0 == 11) {
            class93.method56(class226.field2932, class226.field3125, class226.field2934);
        } else if (arg0 == 12) {
            class93.method56(class226.field2935, class226.field2933, class226.field2937);
        } else if (arg0 == 13) {
            class93.method56(class226.field2938, class226.field2939, class226.field3025);
        } else if (arg0 == 14) {
            class93.method56(class226.field2941, class226.field2942, class226.field2943);
        } else if (arg0 == 16) {
            class93.method56(class226.field2883, class226.field2945, class226.field3106);
        } else if (arg0 == 17) {
            class93.method56(class226.field2947, class226.field2948, class226.field2949);
        } else if (arg0 == 18) {
            class93.method56(class226.field2950, class226.field2917, class226.field2940);
        } else if (arg0 == 19) {
            class93.method56(class226.field3115, class226.field2954, class226.field2955);
        } else if (arg0 == 20) {
            class93.method56(class226.field2860, class226.field2957, class226.field2908);
        } else if (arg0 == 22) {
            class93.method56(class226.field2959, class226.field2960, class226.field3130);
        } else if (arg0 == 23) {
            class93.method56(class226.field2962, class226.field2963, class226.field2964);
        } else if (arg0 == 24) {
            class93.method56(class226.field3080, class226.field2966, class226.field2967);
        } else if (arg0 == 25) {
            class93.method56(class226.field2968, class226.field2969, class226.field2970);
        } else if (arg0 == 26) {
            class93.method56(class226.field2956, class226.field2972, class226.field2973);
        } else if (arg0 == 27) {
            class93.method56(class226.field2974, class226.field2975, class226.field2976);
        } else if (arg0 == 31) {
            class93.method56(class226.field2983, class226.field2984, class226.field2985);
        } else if (arg0 == 32) {
            class93.method56(class226.field3138, class226.field2930, class226.field3030);
        } else if (arg0 == 37) {
            class93.method56(class226.field2989, class226.field2990, class226.field2927);
        } else if (arg0 == 38) {
            class93.method56(class226.field2992, class226.field2993, class226.field2994);
        } else if (arg0 == 55) {
            class93.method56(class226.field2995, class226.field2952, class226.field2997);
        } else if (arg0 == 56) {
            class93.method56(class226.field3009, class226.field2999, class226.field2882);
            client.method2180(11);
            return;
        } else if (arg0 == 57) {
            class93.method56(class226.field2965, class226.field3002, class226.field3003);
            client.method2180(11);
            return;
        } else {
            class93.method56(class226.field3004, class226.field3005, class226.field3006);
        }
        client.method2180(10);
    }

    @ObfuscatedName("c.fk(Lcd;I)V")
    public static final void method65(class79 arg0) {
        arg0.field1268 = false;
        if (arg0.field1269 != -1) {
            class261 var1 = class261.method3746(arg0.field1269);
            if (var1 == null || var1.field3610 == null) {
                arg0.field1269 = -1;
            } else {
                arg0.field1255++;
                if (arg0.field1280 < var1.field3610.length && arg0.field1255 > var1.field3613[arg0.field1280]) {
                    arg0.field1255 = 1;
                    arg0.field1280++;
                    client.method1014(var1, arg0.field1280, arg0.field1273, arg0.field1240);
                }
                if (arg0.field1280 >= var1.field3610.length) {
                    arg0.field1255 = 0;
                    arg0.field1280 = 0;
                    client.method1014(var1, arg0.field1280, arg0.field1273, arg0.field1240);
                }
            }
        }
        if (arg0.field1249 != -1 && client.field936 >= arg0.field1279) {
            if (arg0.field1245 < 0) {
                arg0.field1245 = 0;
            }
            int var2 = class246.method2634(arg0.field1249).field3333;
            if (var2 == -1) {
                arg0.field1249 = -1;
            } else {
                class261 var3 = class261.method3746(var2);
                if (var3 == null || var3.field3610 == null) {
                    arg0.field1249 = -1;
                } else {
                    arg0.field1278++;
                    if (arg0.field1245 < var3.field3610.length && arg0.field1278 > var3.field3613[arg0.field1245]) {
                        arg0.field1278 = 1;
                        arg0.field1245++;
                        client.method1014(var3, arg0.field1245, arg0.field1273, arg0.field1240);
                    }
                    if (arg0.field1245 >= var3.field3610.length && (arg0.field1245 < 0 || arg0.field1245 >= var3.field3610.length)) {
                        arg0.field1249 = -1;
                    }
                }
            }
        }
        if (arg0.field1259 != -1 && arg0.field1282 <= 1) {
            class261 var4 = class261.method3746(arg0.field1259);
            if (var4.field3620 == 1 && arg0.field1270 > 0 && arg0.field1275 <= client.field936 && arg0.field1286 < client.field936) {
                arg0.field1282 = 1;
                return;
            }
        }
        if (arg0.field1259 != -1 && arg0.field1282 == 0) {
            class261 var5 = class261.method3746(arg0.field1259);
            if (var5 == null || var5.field3610 == null) {
                arg0.field1259 = -1;
            } else {
                arg0.field1248++;
                if (arg0.field1272 < var5.field3610.length && arg0.field1248 > var5.field3613[arg0.field1272]) {
                    arg0.field1248 = 1;
                    arg0.field1272++;
                    client.method1014(var5, arg0.field1272, arg0.field1273, arg0.field1240);
                }
                if (arg0.field1272 >= var5.field3610.length) {
                    arg0.field1272 -= var5.field3611;
                    arg0.field1263++;
                    if (arg0.field1263 >= var5.field3621) {
                        arg0.field1259 = -1;
                    } else if (arg0.field1272 >= 0 && arg0.field1272 < var5.field3610.length) {
                        client.method1014(var5, arg0.field1272, arg0.field1273, arg0.field1240);
                    } else {
                        arg0.field1259 = -1;
                    }
                }
                arg0.field1268 = var5.field3617;
            }
        }
        if (arg0.field1282 > 0) {
            arg0.field1282--;
        }
    }

    @ObfuscatedName("ch.gm(Lcd;II)V")
    public static final void method1544(class79 arg0, int arg1) {
        client.method1493(arg0.field1273, arg0.field1240, arg1);
    }

    @ObfuscatedName("br.hh(IIB)V")
    public static void method908(int arg0, int arg1) {
        client.field969.method3116(155);
        client.field969.method2921(arg0);
        client.field969.method2911(arg1);
    }

    @ObfuscatedName("fl.hc(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3079(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        client.method154(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("ej.hu([Lho;IIIIIIIII)V")
    public static final void method2637(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class282.method4630(arg2, arg3, arg4, arg5);
        class137.method2358();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class217 var10 = arg0[var9];
            if (var10 != null && (var10.field2674 == arg1 || arg1 == -1412584499 && client.field1101 == var10)) {
                int var11;
                if (arg8 == -1) {
                    client.field1058[client.field1062] = var10.field2668 + arg6;
                    client.field1137[client.field1062] = var10.field2669 + arg7;
                    client.field1138[client.field1062] = var10.field2750;
                    client.field1139[client.field1062] = var10.field2671;
                    var11 = ++client.field1062 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2786 = var11;
                var10.field2787 = client.field936;
                if (!var10.field2654 || !client.method494(var10)) {
                    if (var10.field2659 > 0) {
                        client.method135(var10);
                    }
                    int var12 = var10.field2668 + arg6;
                    int var13 = var10.field2669 + arg7;
                    int var14 = var10.field2700;
                    if (client.field1101 == var10) {
                        if (arg1 != -1412584499 && !var10.field2738) {
                            field3642 = arg0;
                            field1238 = arg6;
                            field3690 = arg7;
                            continue;
                        }
                        if (client.field1112 && client.field1070) {
                            int var15 = class60.field749;
                            int var16 = class60.field750;
                            int var17 = var15 - client.field1103;
                            int var18 = var16 - client.field1104;
                            if (var17 < client.field1176) {
                                var17 = client.field1176;
                            }
                            if (var10.field2750 + var17 > client.field1176 + client.field1102.field2750) {
                                var17 = client.field1176 + client.field1102.field2750 - var10.field2750;
                            }
                            if (var18 < client.field1108) {
                                var18 = client.field1108;
                            }
                            if (var10.field2671 + var18 > client.field1108 + client.field1102.field2671) {
                                var18 = client.field1108 + client.field1102.field2671 - var10.field2671;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2738) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2657 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2657 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2750 + var12;
                        int var26 = var10.field2671 + var13;
                        if (var25 < var12) {
                            var23 = var25;
                            var25 = var12;
                        }
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        var25++;
                        var26++;
                        var19 = var23 > arg2 ? var23 : arg2;
                        var20 = var24 > arg3 ? var24 : arg3;
                        var21 = var25 < arg4 ? var25 : arg4;
                        var22 = var26 < arg5 ? var26 : arg5;
                    } else {
                        int var29 = var10.field2750 + var12;
                        int var30 = var10.field2671 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2654 || var19 < var21 && var20 < var22) {
                        if (var10.field2659 != 0) {
                            if (var10.field2659 == 1336) {
                                if (client.field942) {
                                    var13 += 15;
                                    field531.method4392("Fps:" + client.field718, var10.field2750 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && client.field931) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !client.field931) {
                                        var33 = 16711680;
                                    }
                                    field531.method4392("Mem:" + var32 + "k", var10.field2750 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2659 == 1337) {
                                client.field1077 = var12;
                                client.field1004 = var13;
                                client.method234(var12, var13, var10.field2750, var10.field2671);
                                client.field1133[var10.field2786] = true;
                                class282.method4630(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2659 == 1338) {
                                client.method59();
                                class211 var34 = var10.method3660(false);
                                if (var34 != null) {
                                    class282.method4630(var12, var13, var34.field2608 + var12, var34.field2603 + var13);
                                    if (client.field1162 == 2 || client.field1162 == 5) {
                                        class282.method4578(var12, var13, 0, var34.field2605, var34.field2609);
                                    } else {
                                        int var35 = client.field1086 + client.field1011 & 0x7FF;
                                        int var36 = field803.field1273 / 32 + 48;
                                        int var37 = 464 - field803.field1240 / 32;
                                        field759.method4713(var12, var13, var34.field2608, var34.field2603, var36, var37, var35, client.field1000 + 256, var34.field2605, var34.field2609);
                                        for (int var38 = 0; var38 < client.field1156; var38++) {
                                            int var39 = client.field1157[var38] * 4 + 2 - field803.field1273 / 32;
                                            int var40 = client.field1012[var38] * 4 + 2 - field803.field1240 / 32;
                                            client.method499(var12, var13, var39, var40, client.field928[var38], var34);
                                        }
                                        int var41 = 0;
                                        while (true) {
                                            if (var41 >= 104) {
                                                for (int var46 = 0; var46 < client.field938; var46++) {
                                                    class87 var47 = client.field963[client.field950[var46]];
                                                    if (var47 != null && var47.method1046()) {
                                                        class259 var48 = var47.field1400;
                                                        if (var48 != null && var48.field3586 != null) {
                                                            var48 = var48.method4282();
                                                        }
                                                        if (var48 != null && var48.field3577 && var48.field3589) {
                                                            int var49 = var47.field1273 / 32 - field803.field1273 / 32;
                                                            int var50 = var47.field1240 / 32 - field803.field1240 / 32;
                                                            client.method499(var12, var13, var49, var50, field378[1], var34);
                                                        }
                                                    }
                                                }
                                                int var51 = class97.field1522;
                                                int[] var52 = class97.field1532;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    class75 var54 = client.field967[var52[var53]];
                                                    if (var54 != null && var54.method1046() && !var54.field911 && field803 != var54) {
                                                        int var55 = var54.field1273 / 32 - field803.field1273 / 32;
                                                        int var56 = var54.field1240 / 32 - field803.field1240 / 32;
                                                        boolean var57 = false;
                                                        if (client.method159(var54.field913, true)) {
                                                            var57 = true;
                                                        }
                                                        boolean var58 = false;
                                                        for (int var59 = 0; var59 < field417; var59++) {
                                                            if (var54.field913.equals(field263[var59].field919)) {
                                                                var58 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var60 = false;
                                                        if (field803.field910 != 0 && var54.field910 != 0 && field803.field910 == var54.field910) {
                                                            var60 = true;
                                                        }
                                                        if (var57) {
                                                            client.method499(var12, var13, var55, var56, field378[3], var34);
                                                        } else if (var60) {
                                                            client.method499(var12, var13, var55, var56, field378[4], var34);
                                                        } else if (var58) {
                                                            client.method499(var12, var13, var55, var56, field378[5], var34);
                                                        } else {
                                                            client.method499(var12, var13, var55, var56, field378[2], var34);
                                                        }
                                                    }
                                                }
                                                if (client.field944 != 0 && client.field936 % 20 < 10) {
                                                    if (client.field944 == 1 && client.field945 >= 0 && client.field945 < client.field963.length) {
                                                        class87 var61 = client.field963[client.field945];
                                                        if (var61 != null) {
                                                            int var62 = var61.field1273 / 32 - field803.field1273 / 32;
                                                            int var63 = var61.field1240 / 32 - field803.field1240 / 32;
                                                            client.method1035(var12, var13, var62, var63, field459[1], var34);
                                                        }
                                                    }
                                                    if (client.field944 == 2) {
                                                        int var64 = client.field947 * 4 - field669 * 4 + 2 - field803.field1273 / 32;
                                                        int var65 = client.field1198 * 4 - field3674 * 4 + 2 - field803.field1240 / 32;
                                                        client.method1035(var12, var13, var64, var65, field459[1], var34);
                                                    }
                                                    if (client.field944 == 10 && client.field1184 >= 0 && client.field1184 < client.field967.length) {
                                                        class75 var66 = client.field967[client.field1184];
                                                        if (var66 != null) {
                                                            int var67 = var66.field1273 / 32 - field803.field1273 / 32;
                                                            int var68 = var66.field1240 / 32 - field803.field1240 / 32;
                                                            client.method1035(var12, var13, var67, var68, field459[1], var34);
                                                        }
                                                    }
                                                }
                                                if (client.field948 != 0) {
                                                    int var69 = client.field948 * 4 + 2 - field803.field1273 / 32;
                                                    int var70 = client.field1161 * 4 + 2 - field803.field1240 / 32;
                                                    client.method499(var12, var13, var69, var70, field459[0], var34);
                                                }
                                                if (!field803.field911) {
                                                    class282.method4614(var34.field2608 / 2 + var12 - 1, var34.field2603 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var42 = 0; var42 < 104; var42++) {
                                                class194 var43 = client.field986[field2137][var41][var42];
                                                if (var43 != null) {
                                                    int var44 = var41 * 4 + 2 - field803.field1273 / 32;
                                                    int var45 = var42 * 4 + 2 - field803.field1240 / 32;
                                                    client.method499(var12, var13, var44, var45, field378[0], var34);
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                    client.field1134[var11] = true;
                                }
                                class282.method4630(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2659 == 1339) {
                                class211 var71 = var10.method3660(false);
                                if (var71 != null) {
                                    if (client.field1162 < 3) {
                                        field330.method4713(var12, var13, var71.field2608, var71.field2603, 25, 25, client.field1011, 256, var71.field2605, var71.field2609);
                                    } else {
                                        class282.method4578(var12, var13, 0, var71.field2605, var71.field2609);
                                    }
                                }
                                class282.method4630(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2659 == 1400) {
                                field601.method4812(var12, var13, var10.field2750, var10.field2671, client.field936);
                            }
                            if (var10.field2659 == 1401) {
                                field601.method4833(var12, var13, var10.field2750, var10.field2671);
                            }
                        }
                        if (var10.field2657 == 0) {
                            if (!var10.field2654 && client.method494(var10) && field3372 != var10) {
                                continue;
                            }
                            if (!var10.field2654) {
                                if (var10.field2677 > var10.field2679 - var10.field2671) {
                                    var10.field2677 = var10.field2679 - var10.field2671;
                                }
                                if (var10.field2677 < 0) {
                                    var10.field2677 = 0;
                                }
                            }
                            method2637(arg0, var10.field2655, var19, var20, var21, var22, var12 - var10.field2676, var13 - var10.field2677, var11);
                            if (var10.field2779 != null) {
                                method2637(var10.field2779, var10.field2655, var19, var20, var21, var22, var12 - var10.field2676, var13 - var10.field2677, var11);
                            }
                            class69 var72 = (class69) client.field1089.method3249((long) var10.field2655);
                            if (var72 != null) {
                                client.method2686(var72.field844, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class282.method4630(arg2, arg3, arg4, arg5);
                            class137.method2358();
                        }
                        if (client.field1048 || client.field1031[var11] || client.field1140 > 1) {
                            if (var10.field2657 == 0 && !var10.field2654 && var10.field2679 > var10.field2671) {
                                int var73 = var10.field2750 + var12;
                                int var74 = var10.field2677;
                                int var75 = var10.field2671;
                                int var76 = var10.field2679;
                                field3640[0].method4642(var73, var13);
                                field3640[1].method4642(var73, var13 + var75 - 16);
                                class282.method4614(var73, var13 + 16, 16, var75 - 32, client.field1109);
                                int var77 = (var75 - 32) * var75 / var76;
                                if (var77 < 8) {
                                    var77 = 8;
                                }
                                int var78 = (var75 - 32 - var77) * var74 / (var76 - var75);
                                class282.method4614(var73, var13 + 16 + var78, 16, var77, client.field991);
                                class282.method4574(var73, var13 + 16 + var78, var77, client.field1007);
                                class282.method4574(var73 + 1, var13 + 16 + var78, var77, client.field1007);
                                class282.method4572(var73, var13 + 16 + var78, 16, client.field1007);
                                class282.method4572(var73, var13 + 17 + var78, 16, client.field1007);
                                class282.method4574(var73 + 15, var13 + 16 + var78, var77, client.field1006);
                                class282.method4574(var73 + 14, var13 + 17 + var78, var77 - 1, client.field1006);
                                class282.method4572(var73, var13 + 15 + var78 + var77, 16, client.field1006);
                                class282.method4572(var73 + 1, var13 + 14 + var78 + var77, 15, client.field1006);
                            }
                            if (var10.field2657 != 1) {
                                if (var10.field2657 == 2) {
                                    int var79 = 0;
                                    for (int var80 = 0; var80 < var10.field2708; var80++) {
                                        for (int var81 = 0; var81 < var10.field2666; var81++) {
                                            int var82 = (var10.field2765 + 32) * var81 + var12;
                                            int var83 = (var10.field2722 + 32) * var80 + var13;
                                            if (var79 < 20) {
                                                var82 += var10.field2776[var79];
                                                var83 += var10.field2724[var79];
                                            }
                                            if (var10.field2773[var79] > 0) {
                                                boolean var84 = false;
                                                boolean var85 = false;
                                                int var86 = var10.field2773[var79] - 1;
                                                if (var82 + 32 > arg2 && var82 < arg4 && var83 + 32 > arg3 && var83 < arg5 || field1514 == var10 && client.field1040 == var79) {
                                                    class286 var87;
                                                    if (client.field941 == 1 && field3213 == var79 && field572 == var10.field2655) {
                                                        var87 = class257.method139(var86, var10.field2774[var79], 2, 0, 2, false);
                                                    } else {
                                                        var87 = class257.method139(var86, var10.field2774[var79], 1, 3153952, 2, false);
                                                    }
                                                    if (var87 == null) {
                                                        client.method1571(var10);
                                                    } else if (field1514 == var10 && client.field1040 == var79) {
                                                        int var88 = class60.field749 - client.field1041;
                                                        int var89 = class60.field750 - client.field1042;
                                                        if (var88 < 5 && var88 > -5) {
                                                            var88 = 0;
                                                        }
                                                        if (var89 < 5 && var89 > -5) {
                                                            var89 = 0;
                                                        }
                                                        if (client.field1045 < 5) {
                                                            var88 = 0;
                                                            var89 = 0;
                                                        }
                                                        var87.method4674(var82 + var88, var83 + var89, 128);
                                                        if (arg1 != -1) {
                                                            class217 var90 = arg0[arg1 & 0xFFFF];
                                                            if (var83 + var89 < class282.field3759 && var90.field2677 > 0) {
                                                                int var91 = client.field1003 * (class282.field3759 - var83 - var89) / 3;
                                                                if (var91 > client.field1003 * 10) {
                                                                    var91 = client.field1003 * 10;
                                                                }
                                                                if (var91 > var90.field2677) {
                                                                    var91 = var90.field2677;
                                                                }
                                                                var90.field2677 -= var91;
                                                                client.field1042 += var91;
                                                                client.method1571(var90);
                                                            }
                                                            if (var83 + var89 + 32 > class282.field3760 && var90.field2677 < var90.field2679 - var90.field2671) {
                                                                int var92 = client.field1003 * (var83 + var89 + 32 - class282.field3760) / 3;
                                                                if (var92 > client.field1003 * 10) {
                                                                    var92 = client.field1003 * 10;
                                                                }
                                                                if (var92 > var90.field2679 - var90.field2671 - var90.field2677) {
                                                                    var92 = var90.field2679 - var90.field2671 - var90.field2677;
                                                                }
                                                                var90.field2677 += var92;
                                                                client.field1042 -= var92;
                                                                client.method1571(var90);
                                                            }
                                                        }
                                                    } else if (field2406 == var10 && client.field1115 == var79) {
                                                        var87.method4674(var82, var83, 128);
                                                    } else {
                                                        var87.method4659(var82, var83);
                                                    }
                                                }
                                            } else if (var10.field2725 != null && var79 < 20) {
                                                class286 var93 = var10.method3668(var79);
                                                if (var93 != null) {
                                                    var93.method4659(var82, var83);
                                                } else if (class217.field2685) {
                                                    client.method1571(var10);
                                                }
                                            }
                                            var79++;
                                        }
                                    }
                                } else if (var10.field2657 == 3) {
                                    int var94;
                                    if (client.method235(var10)) {
                                        var94 = var10.field2681;
                                        if (field3372 == var10 && var10.field2683 != 0) {
                                            var94 = var10.field2683;
                                        }
                                    } else {
                                        var94 = var10.field2680;
                                        if (field3372 == var10 && var10.field2682 != 0) {
                                            var94 = var10.field2682;
                                        }
                                    }
                                    if (var10.field2648) {
                                        switch(var10.field2758.field3768) {
                                            case 1:
                                                class282.method4634(var12, var13, var10.field2750, var10.field2671, var10.field2680, var10.field2681, 256 - (var10.field2700 & 0xFF), 256 - (var10.field2687 & 0xFF));
                                                break;
                                            case 2:
                                                class282.method4565(var12, var13, var10.field2750, var10.field2671, var10.field2680, var10.field2681, 256 - (var10.field2700 & 0xFF), 256 - (var10.field2687 & 0xFF));
                                                break;
                                            case 3:
                                                class282.method4566(var12, var13, var10.field2750, var10.field2671, var10.field2680, var10.field2681, 256 - (var10.field2700 & 0xFF), 256 - (var10.field2687 & 0xFF));
                                                break;
                                            case 4:
                                                class282.method4567(var12, var13, var10.field2750, var10.field2671, var10.field2680, var10.field2681, 256 - (var10.field2700 & 0xFF), 256 - (var10.field2687 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class282.method4614(var12, var13, var10.field2750, var10.field2671, var94);
                                                } else {
                                                    class282.method4562(var12, var13, var10.field2750, var10.field2671, var94, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class282.method4589(var12, var13, var10.field2750, var10.field2671, var94);
                                    } else {
                                        class282.method4626(var12, var13, var10.field2750, var10.field2671, var94, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2657 == 4) {
                                    class264 var95 = var10.method3667();
                                    if (var95 != null) {
                                        String var96 = var10.field2715;
                                        int var97;
                                        if (client.method235(var10)) {
                                            var97 = var10.field2681;
                                            if (field3372 == var10 && var10.field2683 != 0) {
                                                var97 = var10.field2683;
                                            }
                                            if (var10.field2730.length() > 0) {
                                                var96 = var10.field2730;
                                            }
                                        } else {
                                            var97 = var10.field2680;
                                            if (field3372 == var10 && var10.field2682 != 0) {
                                                var97 = var10.field2682;
                                            }
                                        }
                                        if (var10.field2654 && var10.field2775 != -1) {
                                            class257 var98 = class257.method3084(var10.field2775);
                                            var96 = var98.field3505;
                                            if (var96 == null) {
                                                var96 = "null";
                                            }
                                            if ((var98.field3529 == 1 || var10.field2713 != 1) && var10.field2713 != -1) {
                                                var96 = class89.method3729(16748608) + var96 + class89.field1422 + " " + 'x' + client.method599(var10.field2713);
                                            }
                                        }
                                        if (client.field1092 == var10) {
                                            class226 var10000 = (class226) null;
                                            var96 = class226.field2998;
                                            var97 = var10.field2680;
                                        }
                                        if (!var10.field2654) {
                                            var96 = client.method679(var96, var10);
                                        }
                                        var95.method4420(var96, var12, var13, var10.field2750, var10.field2671, var97, var10.field2720 ? 0 : -1, var10.field2653, var10.field2727, var10.field2717);
                                    } else if (class217.field2685) {
                                        client.method1571(var10);
                                    }
                                } else if (var10.field2657 == 5) {
                                    if (var10.field2654) {
                                        class286 var100;
                                        if (var10.field2775 == -1) {
                                            var100 = var10.method3670(false);
                                        } else {
                                            var100 = class257.method139(var10.field2775, var10.field2713, var10.field2694, var10.field2771, var10.field2785, false);
                                        }
                                        if (var100 != null) {
                                            int var101 = var100.field3790;
                                            int var102 = var100.field3793;
                                            if (var10.field2693) {
                                                class282.method4556(var12, var13, var10.field2750 + var12, var10.field2671 + var13);
                                                int var103 = (var10.field2750 + (var101 - 1)) / var101;
                                                int var104 = (var10.field2671 + (var102 - 1)) / var102;
                                                for (int var105 = 0; var105 < var103; var105++) {
                                                    for (int var106 = 0; var106 < var104; var106++) {
                                                        if (var10.field2692 != 0) {
                                                            var100.method4681(var101 / 2 + var101 * var105 + var12, var102 / 2 + var102 * var106 + var13, var10.field2692, 4096);
                                                        } else if (var14 == 0) {
                                                            var100.method4659(var101 * var105 + var12, var102 * var106 + var13);
                                                        } else {
                                                            var100.method4674(var101 * var105 + var12, var102 * var106 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class282.method4630(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var107 = var10.field2750 * 4096 / var101;
                                                if (var10.field2692 != 0) {
                                                    var100.method4681(var10.field2750 / 2 + var12, var10.field2671 / 2 + var13, var10.field2692, var107);
                                                } else if (var14 != 0) {
                                                    var100.method4726(var12, var13, var10.field2750, var10.field2671, 256 - (var14 & 0xFF));
                                                } else if (var10.field2750 == var101 && var10.field2671 == var102) {
                                                    var100.method4659(var12, var13);
                                                } else {
                                                    var100.method4697(var12, var13, var10.field2750, var10.field2671);
                                                }
                                            }
                                        } else if (class217.field2685) {
                                            client.method1571(var10);
                                        }
                                    } else {
                                        class286 var99 = var10.method3670(client.method235(var10));
                                        if (var99 != null) {
                                            var99.method4659(var12, var13);
                                        } else if (class217.field2685) {
                                            client.method1571(var10);
                                        }
                                    }
                                } else if (var10.field2657 == 6) {
                                    boolean var108 = client.method235(var10);
                                    int var109;
                                    if (var108) {
                                        var109 = var10.field2703;
                                    } else {
                                        var109 = var10.field2718;
                                    }
                                    class134 var110 = null;
                                    int var111 = 0;
                                    if (var10.field2775 != -1) {
                                        class257 var112 = class257.method3084(var10.field2775);
                                        if (var112 != null) {
                                            class257 var113 = var112.method4225(var10.field2713);
                                            var110 = var113.method4249(1);
                                            if (var110 == null) {
                                                client.method1571(var10);
                                            } else {
                                                var110.method2269();
                                                var111 = var110.field2136 / 2;
                                            }
                                        }
                                    } else if (var10.field2662 == 5) {
                                        if (var10.field2699 == 0) {
                                            var110 = client.field1199.method3615((class261) null, -1, (class261) null, -1);
                                        } else {
                                            var110 = field803.method1044();
                                        }
                                    } else if (var109 == -1) {
                                        var110 = var10.method3669((class261) null, -1, var108, field803.field917);
                                        if (var110 == null && class217.field2685) {
                                            client.method1571(var10);
                                        }
                                    } else {
                                        class261 var114 = class261.method3746(var109);
                                        var110 = var10.method3669(var114, var10.field2789, var108, field803.field917);
                                        if (var110 == null && class217.field2685) {
                                            client.method1571(var10);
                                        }
                                    }
                                    class137.method2361(var10.field2750 / 2 + var12, var10.field2671 / 2 + var13);
                                    int var115 = var10.field2651 * class137.field2046[var10.field2706] >> 16;
                                    int var116 = var10.field2651 * class137.field2023[var10.field2706] >> 16;
                                    if (var110 != null) {
                                        if (var10.field2654) {
                                            var110.method2269();
                                            if (var10.field2712) {
                                                var110.method2283(0, var10.field2707, var10.field2744, var10.field2706, var10.field2704, var10.field2705 + var111 + var115, var10.field2705 + var116, var10.field2651);
                                            } else {
                                                var110.method2282(0, var10.field2707, var10.field2744, var10.field2706, var10.field2704, var10.field2705 + var111 + var115, var10.field2705 + var116);
                                            }
                                        } else {
                                            var110.method2282(0, var10.field2707, 0, var10.field2706, 0, var115, var116);
                                        }
                                    }
                                    class137.method2359();
                                } else {
                                    if (var10.field2657 == 7) {
                                        class264 var117 = var10.method3667();
                                        if (var117 == null) {
                                            if (class217.field2685) {
                                                client.method1571(var10);
                                            }
                                            continue;
                                        }
                                        int var118 = 0;
                                        for (int var119 = 0; var119 < var10.field2708; var119++) {
                                            for (int var120 = 0; var120 < var10.field2666; var120++) {
                                                if (var10.field2773[var118] > 0) {
                                                    class257 var121 = class257.method3084(var10.field2773[var118] - 1);
                                                    String var122;
                                                    if (var121.field3529 != 1 && var10.field2774[var118] == 1) {
                                                        var122 = class89.method3729(16748608) + var121.field3505 + class89.field1422;
                                                    } else {
                                                        var122 = class89.method3729(16748608) + var121.field3505 + class89.field1422 + " " + 'x' + client.method599(var10.field2774[var118]);
                                                    }
                                                    int var123 = (var10.field2765 + 115) * var120 + var12;
                                                    int var124 = (var10.field2722 + 12) * var119 + var13;
                                                    if (var10.field2653 == 0) {
                                                        var117.method4422(var122, var123, var124, var10.field2680, var10.field2720 ? 0 : -1);
                                                    } else if (var10.field2653 == 1) {
                                                        var117.method4393(var122, var10.field2750 / 2 + var123, var124, var10.field2680, var10.field2720 ? 0 : -1);
                                                    } else {
                                                        var117.method4392(var122, var10.field2750 + var123 - 1, var124, var10.field2680, var10.field2720 ? 0 : -1);
                                                    }
                                                }
                                                var118++;
                                            }
                                        }
                                    }
                                    if (var10.field2657 == 8 && field1212 == var10 && client.field1080 == client.field1055) {
                                        int var125 = 0;
                                        int var126 = 0;
                                        class264 var127 = field531;
                                        String var128 = var10.field2715;
                                        String var129 = client.method679(var128, var10);
                                        while (var129.length() > 0) {
                                            int var130 = var129.indexOf(class89.field1423);
                                            String var131;
                                            if (var130 == -1) {
                                                var131 = var129;
                                                var129 = "";
                                            } else {
                                                var131 = var129.substring(0, var130);
                                                var129 = var129.substring(var130 + 4);
                                            }
                                            int var132 = var127.method4408(var131);
                                            if (var132 > var125) {
                                                var125 = var132;
                                            }
                                            var126 += var127.field3650 + 1;
                                        }
                                        var125 += 6;
                                        var126 += 7;
                                        int var133 = var10.field2750 + var12 - 5 - var125;
                                        int var134 = var10.field2671 + var13 + 5;
                                        if (var133 < var12 + 5) {
                                            var133 = var12 + 5;
                                        }
                                        if (var125 + var133 > arg4) {
                                            var133 = arg4 - var125;
                                        }
                                        if (var126 + var134 > arg5) {
                                            var134 = arg5 - var126;
                                        }
                                        class282.method4614(var133, var134, var125, var126, 16777120);
                                        class282.method4589(var133, var134, var125, var126, 0);
                                        String var135 = var10.field2715;
                                        int var136 = var127.field3650 + var134 + 2;
                                        String var137 = client.method679(var135, var10);
                                        while (var137.length() > 0) {
                                            int var138 = var137.indexOf(class89.field1423);
                                            String var139;
                                            if (var138 == -1) {
                                                var139 = var137;
                                                var137 = "";
                                            } else {
                                                var139 = var137.substring(0, var138);
                                                var137 = var137.substring(var138 + 4);
                                            }
                                            var127.method4422(var139, var133 + 3, var136, 0, -1);
                                            var136 += var127.field3650 + 1;
                                        }
                                    }
                                    if (var10.field2657 == 9) {
                                        int var140;
                                        int var141;
                                        int var142;
                                        int var143;
                                        if (var10.field2689) {
                                            var140 = var12;
                                            var141 = var10.field2671 + var13;
                                            var142 = var10.field2750 + var12;
                                            var143 = var13;
                                        } else {
                                            var140 = var12;
                                            var141 = var13;
                                            var142 = var10.field2750 + var12;
                                            var143 = var10.field2671 + var13;
                                        }
                                        if (var10.field2688 == 1) {
                                            class282.method4576(var140, var141, var142, var143, var10.field2680);
                                        } else {
                                            int var146 = var10.field2680;
                                            int var147 = var10.field2688;
                                            int var148 = var142 - var140;
                                            int var149 = var143 - var141;
                                            int var150 = var148 >= 0 ? var148 : -var148;
                                            int var151 = var149 >= 0 ? var149 : -var149;
                                            int var152 = var150;
                                            if (var150 < var151) {
                                                var152 = var151;
                                            }
                                            if (var152 != 0) {
                                                int var153 = (var148 << 16) / var152;
                                                int var154 = (var149 << 16) / var152;
                                                if (var154 <= var153) {
                                                    var153 = -var153;
                                                } else {
                                                    var154 = -var154;
                                                }
                                                int var155 = var147 * var154 >> 17;
                                                int var156 = var147 * var154 + 1 >> 17;
                                                int var157 = var147 * var153 >> 17;
                                                int var158 = var147 * var153 + 1 >> 17;
                                                int var159 = var140 - class282.field3762;
                                                int var160 = var141 - class282.field3759;
                                                int var161 = var155 + var159;
                                                int var162 = var159 - var156;
                                                int var163 = var148 + var159 - var156;
                                                int var164 = var148 + var159 + var155;
                                                int var165 = var157 + var160;
                                                int var166 = var160 - var158;
                                                int var167 = var149 + var160 - var158;
                                                int var168 = var149 + var160 + var157;
                                                class137.method2366(var161, var162, var163);
                                                class137.method2369(var165, var166, var167, var161, var162, var163, var146);
                                                class137.method2366(var161, var163, var164);
                                                class137.method2369(var165, var167, var168, var161, var163, var164, var146);
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

    @ObfuscatedName("y.iy(Lho;I)Z")
    public static final boolean method35(class217 arg0) {
        int var1 = arg0.field2659;
        if (var1 == 205) {
            client.field979 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            client.field1199.method3637(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            client.field1199.method3611(var4, var5 == 1);
        }
        if (var1 == 324) {
            client.field1199.method3610(false);
        }
        if (var1 == 325) {
            client.field1199.method3610(true);
        }
        if (var1 == 326) {
            client.field969.method3116(189);
            client.field1199.method3613(client.field969);
            return true;
        } else {
            return false;
        }
    }
}
