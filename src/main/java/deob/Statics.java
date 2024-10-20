package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("client.nh")
    public static byte field1138;

    @ObfuscatedName("be.gz")
    public static int field1198;

    @ObfuscatedName("cp.oq")
    public static class111 field1214;

    @ObfuscatedName("cs.ec")
    public static class264 field1270;

    @ObfuscatedName("cs.bn")
    public static class286[] field1272;

    @ObfuscatedName("cs.cr")
    public static class239 field1273;

    @ObfuscatedName("cq.dj")
    public static int field1283;

    @ObfuscatedName("cq.u")
    public static class84 field1289;

    @ObfuscatedName("cq.co")
    public static char field1293;

    @ObfuscatedName("cu.v")
    public static class287 field1323;

    @ObfuscatedName("cu.d")
    public static class286 field1325;

    @ObfuscatedName("cu.k")
    public static class237 field1326;

    @ObfuscatedName("cj.u")
    public static int field1328;

    @ObfuscatedName("cj.z")
    public static int field1333;

    @ObfuscatedName("cj.fl")
    public static class141 field1335;

    @ObfuscatedName("cj.g")
    public static int[] field1341;

    @ObfuscatedName("cj.y")
    public static String[] field1342;

    @ObfuscatedName("cg.jq")
    public static int field1358;

    @ObfuscatedName("co.i")
    public static int field1365;

    @ObfuscatedName("ch.t")
    public static int[] field1366;

    @ObfuscatedName("ch.ay")
    public static int[] field1369;

    @ObfuscatedName("cn.h")
    public static class236 field1386;

    @ObfuscatedName("cd.lu")
    public static int field1400;

    @ObfuscatedName("cd.y")
    public static byte[][][] field1404;

    @ObfuscatedName("cx.k")
    public static byte[][][] field1410;

    @ObfuscatedName("cx.j")
    public static int[] field1415;

    @ObfuscatedName("cb.k")
    public static class287 field1420;

    @ObfuscatedName("cb.g")
    public static class286 field1421;

    @ObfuscatedName("cb.y")
    public static class286 field1422;

    @ObfuscatedName("cb.aa")
    public static class286[] field1423;

    @ObfuscatedName("cb.z")
    public static int field1429;

    @ObfuscatedName("cb.r")
    public static class286[] field1439;

    @ObfuscatedName("cb.f")
    public static int[] field1442;

    @ObfuscatedName("cb.e")
    public static boolean field1452;

    @ObfuscatedName("ci.k")
    public static class218[][] field1482;

    @ObfuscatedName("ce.q")
    public static int[] field1504;

    @ObfuscatedName("ce.bo")
    public static class286[] field1505;

    @ObfuscatedName("cc.gg")
    public static class287[] field1524;

    @ObfuscatedName("cz.z")
    public static byte[][][] field1547;

    @ObfuscatedName("de.s")
    public static class122[] field1566;

    @ObfuscatedName("de.ay")
    public static float[] field1568;

    @ObfuscatedName("de.v")
    public static byte[] field1572;

    @ObfuscatedName("de.o")
    public static class106[] field1573;

    @ObfuscatedName("de.r")
    public static int field1574;

    @ObfuscatedName("de.u")
    public static int field1575;

    @ObfuscatedName("de.d")
    public static int field1576;

    @ObfuscatedName("de.l")
    public static class110[] field1577;

    @ObfuscatedName("de.h")
    public static class117[] field1579;

    @ObfuscatedName("de.ag")
    public static float[] field1580;

    @ObfuscatedName("de.c")
    public static boolean[] field1581;

    @ObfuscatedName("de.m")
    public static int[] field1582;

    @ObfuscatedName("de.q")
    public static float[] field1588;

    @ObfuscatedName("de.z")
    public static int field1589;

    @ObfuscatedName("de.i")
    public static float[] field1590;

    @ObfuscatedName("de.j")
    public static float[] field1591;

    @ObfuscatedName("de.x")
    public static float[] field1593;

    @ObfuscatedName("de.au")
    public static float[] field1594;

    @ObfuscatedName("de.ah")
    public static int[] field1595;

    @ObfuscatedName("de.ao")
    public static int[] field1596;

    @ObfuscatedName("dm.d")
    public static int[] field1605;

    @ObfuscatedName("dm.u")
    public static int[] field1609;

    @ObfuscatedName("dm.o")
    public static boolean[] field1616;

    @ObfuscatedName("dw.w")
    public static int field1618;

    @ObfuscatedName("dw.gm")
    public static int field1624;

    @ObfuscatedName("dp.fj")
    public static class287[] field1653;

    @ObfuscatedName("ds.r")
    public static int field1694;

    @ObfuscatedName("ds.z")
    public static float field1700;

    @ObfuscatedName("dr.lc")
    public static int field1780;

    @ObfuscatedName("eh.d")
    public static int[] field1853;

    @ObfuscatedName("eh.og")
    public static class111 field1858;

    @ObfuscatedName("ef.s")
    public static int[] field1875;

    @ObfuscatedName("ew.bp")
    public static int field1931;

    @ObfuscatedName("ew.bi")
    public static int field1972;

    @ObfuscatedName("ew.by")
    public static int field1973;

    @ObfuscatedName("es.ja")
    public static int field1983;

    @ObfuscatedName("es.w")
    public static int field1987;

    @ObfuscatedName("es.d")
    public static int field1988;

    @ObfuscatedName("es.r")
    public static short[] field1991;

    @ObfuscatedName("ev.c")
    public static int field2009;

    @ObfuscatedName("ev.l")
    public static int field2013;

    @ObfuscatedName("ev.x")
    public static class147 field2014;

    @ObfuscatedName("ev.s")
    public static int field2015;

    @ObfuscatedName("ev.m")
    public static int field2017;

    @ObfuscatedName("ev.a")
    public static int field2018;

    @ObfuscatedName("ev.t")
    public static int field2019;

    @ObfuscatedName("ev.h")
    public static int field2025;

    @ObfuscatedName("ev.p")
    public static int field2026;

    @ObfuscatedName("ex.u")
    public static int field2028;

    @ObfuscatedName("ex.ca")
    public static class155 field2035;

    @ObfuscatedName("ep.l")
    public static class105 field2045;

    @ObfuscatedName("ej.a")
    public static int field2055;

    @ObfuscatedName("ej.ay")
    public static int field2058;

    @ObfuscatedName("ej.q")
    public static int field2059;

    @ObfuscatedName("ej.t")
    public static int field2062;

    @ObfuscatedName("ej.m")
    public static int field2063;

    @ObfuscatedName("ej.p")
    public static int field2066;

    @ObfuscatedName("ej.b")
    public static int field2068;

    @ObfuscatedName("ej.x")
    public static int field2069;

    @ObfuscatedName("ej.j")
    public static int field2071;

    @ObfuscatedName("ej.bg")
    public static boolean[][] field2074;

    @ObfuscatedName("ej.au")
    public static int field2075;

    @ObfuscatedName("ej.ah")
    public static int field2076;

    @ObfuscatedName("ej.f")
    public static int field2078;

    @ObfuscatedName("ej.ag")
    public static int field2083;

    @ObfuscatedName("ej.bu")
    public static int field2103;

    @ObfuscatedName("ej.bd")
    public static int field2104;

    @ObfuscatedName("ej.bp")
    public static int field2105;

    @ObfuscatedName("ej.bi")
    public static int field2106;

    @ObfuscatedName("ej.by")
    public static int field2107;

    @ObfuscatedName("ej.bc")
    public static int field2108;

    @ObfuscatedName("ej.i")
    public static int field2109;

    @ObfuscatedName("er.c")
    public static int field2112;

    @ObfuscatedName("en.iz")
    public static int field2114;

    @ObfuscatedName("ec.l")
    public static class218 field2165;

    @ObfuscatedName("ek.pv")
    public static int field2181;

    @ObfuscatedName("et.qr")
    public static short[] field2191;

    @ObfuscatedName("et.hm")
    public static class218 field2196;

    @ObfuscatedName("et.qu")
    public static class82 field2198;

    @ObfuscatedName("ee.g")
    public static int field2200;

    @ObfuscatedName("ee.n")
    public static String field2201;

    @ObfuscatedName("ee.e")
    public static Applet field2202;

    @ObfuscatedName("ee.bf")
    public static class73 field2206;

    @ObfuscatedName("eb.e")
    public static String field2225;

    @ObfuscatedName("fi.s")
    public static class125[] field2228;

    @ObfuscatedName("fi.y")
    public static File field2229;

    @ObfuscatedName("fi.k")
    public static int field2230;

    @ObfuscatedName("fi.m")
    public static String[] field2235;

    @ObfuscatedName("fi.b")
    public static String field2236;

    @ObfuscatedName("fe.n")
    public static File field2239;

    @ObfuscatedName("fe.pa")
    public static int field2240;

    @ObfuscatedName("fe.cc")
    public static class239 field2242;

    @ObfuscatedName("fv.v")
    public static boolean[] field2247;

    @ObfuscatedName("v.gw")
    public static class7[] field225;

    @ObfuscatedName("fq.z")
    public static ScheduledExecutorService field2259;

    @ObfuscatedName("z.ab")
    public static boolean field227;

    @ObfuscatedName("fo.l")
    public static class114 field2271;

    @ObfuscatedName("fz.w")
    public static int field2288;

    @ObfuscatedName("fg.u")
    public static class113 field2297;

    @ObfuscatedName("fu.gn")
    public static int field2306;

    @ObfuscatedName("fp.ei")
    public static class161 field2312;

    @ObfuscatedName("fp.gu")
    public static int field2314;

    @ObfuscatedName("fd.o")
    public static class211 field2323;

    @ObfuscatedName("fl.qm")
    public static class14 field2328;

    @ObfuscatedName("fl.l")
    public static boolean field2329;

    @ObfuscatedName("fl.ck")
    public static long field2330;

    @ObfuscatedName("z.jp")
    public static class91 field234;

    @ObfuscatedName("fx.e")
    public static long field2396;

    @ObfuscatedName("fc.l")
    public static class265 field2401;

    @ObfuscatedName("fj.px")
    public static int field2419;

    @ObfuscatedName("gy.e")
    public static int field2421;

    @ObfuscatedName("gy.go")
    public static class287[] field2422;

    @ObfuscatedName("r.gw")
    public static class286[] field243;

    @ObfuscatedName("gi.u")
    public static class286 field2477;

    @ObfuscatedName("gp.n")
    public static class237 field2484;

    @ObfuscatedName("gp.g")
    public static class237 field2485;

    @ObfuscatedName("gp.y")
    public static class206 field2487;

    @ObfuscatedName("gp.k")
    public static class237 field2489;

    @ObfuscatedName("u.po")
    public static int field249;

    @ObfuscatedName("gp.z")
    public static int field2490;

    @ObfuscatedName("gp.r")
    public static int field2491;

    @ObfuscatedName("gp.u")
    public static int field2492;

    @ObfuscatedName("gp.e")
    public static class237 field2493;

    @ObfuscatedName("u.r")
    public static int field250;

    @ObfuscatedName("ha.r")
    public static int field2581;

    @ObfuscatedName("hq.v")
    public static class237 field2587;

    @ObfuscatedName("hq.ch")
    public static int field2590;

    @ObfuscatedName("hn.z")
    public static short[][] field2595;

    @ObfuscatedName("hg.r")
    public static class237 field2616;

    @ObfuscatedName("d.ix")
    public static int field262;

    @ObfuscatedName("w.ef")
    public static long field27;

    @ObfuscatedName("hg.d")
    public static class237 field2704;

    @ObfuscatedName("hg.z")
    public static class237 field2728;

    @ObfuscatedName("l.fc")
    public static class287 field273;

    @ObfuscatedName("l.v")
    public static int field274;

    @ObfuscatedName("l.e")
    public static class167 field275;

    @ObfuscatedName("h.p")
    public static int[] field277;

    @ObfuscatedName("w.fn")
    public static int[] field28;

    @ObfuscatedName("hh.pg")
    public static int field2808;

    @ObfuscatedName("hy.dq")
    public static int field2824;

    @ObfuscatedName("s.dd")
    public static class239 field293;

    @ObfuscatedName("s.lm")
    public static int field296;

    @ObfuscatedName("c.f")
    public static String field297;

    @ObfuscatedName("c.e")
    public static class156 field299;

    @ObfuscatedName("w.rh")
    public static class290 field30;

    @ObfuscatedName("hd.hx")
    public static class218 field3111;

    @ObfuscatedName("hw.pf")
    public static class118 field3115;

    @ObfuscatedName("hl.ad")
    public static String field3142;

    @ObfuscatedName("t.pr")
    public static int field316;

    @ObfuscatedName("t.j")
    public static int[] field317;

    @ObfuscatedName("hm.l")
    public static class160 field3173;

    @ObfuscatedName("t.g")
    public static class237 field318;

    @ObfuscatedName("k.aj")
    public static client field32;

    @ObfuscatedName("p.bq")
    public static class286 field320;

    @ObfuscatedName("p.cz")
    public static class239 field321;

    @ObfuscatedName("ik.r")
    public static int field3219;

    @ObfuscatedName("p.ft")
    public static class286[] field322;

    @ObfuscatedName("ik.w")
    public static Thread field3220;

    @ObfuscatedName("p.at")
    public static class284 field323;

    @ObfuscatedName("id.bq")
    public static class233 field3234;

    @ObfuscatedName("ie.e")
    public static class161 field3238;

    @ObfuscatedName("p.p")
    public static class175 field324;

    @ObfuscatedName("ie.g")
    public static long field3240;

    @ObfuscatedName("p.o")
    public static int field326;

    @ObfuscatedName("im.e")
    public static class237 field3266;

    @ObfuscatedName("im.j")
    public static int field3269;

    @ObfuscatedName("f.k")
    public static int field327;

    @ObfuscatedName("is.fd")
    public static byte[][] field3270;

    @ObfuscatedName("is.n")
    public static int field3271;

    @ObfuscatedName("is.e")
    public static class237 field3275;

    @ObfuscatedName("io.n")
    public static class244[] field3277;

    @ObfuscatedName("io.g")
    public static int field3280;

    @ObfuscatedName("io.e")
    public static class237 field3287;

    @ObfuscatedName("k.v")
    public static int field33;

    @ObfuscatedName("ir.e")
    public static class237 field3302;

    @ObfuscatedName("ir.cw")
    public static class239 field3307;

    @ObfuscatedName("f.u")
    public static int[] field331;

    @ObfuscatedName("ib.n")
    public static class237 field3317;

    @ObfuscatedName("ib.e")
    public static class237 field3323;

    @ObfuscatedName("if.e")
    public static class237 field3333;

    @ObfuscatedName("il.n")
    public static class237 field3343;

    @ObfuscatedName("il.e")
    public static class237 field3350;

    @ObfuscatedName("il.g")
    public static int field3351;

    @ObfuscatedName("il.cy")
    public static class239 field3354;

    @ObfuscatedName("iv.n")
    public static class237 field3356;

    @ObfuscatedName("iv.e")
    public static class237 field3358;

    @ObfuscatedName("iz.gd")
    public static int field3370;

    @ObfuscatedName("ih.e")
    public static class237 field3377;

    @ObfuscatedName("iw.gy")
    public static class287[] field3384;

    @ObfuscatedName("iw.e")
    public static class237 field3385;

    @ObfuscatedName("iq.e")
    public static class237 field3388;

    @ObfuscatedName("b.e")
    public static class237 field339;

    @ObfuscatedName("iq.de")
    public static class239 field3390;

    @ObfuscatedName("ip.e")
    public static class237 field3394;

    @ObfuscatedName("k.nq")
    public static int field34;

    @ObfuscatedName("b.em")
    public static class70 field340;

    @ObfuscatedName("ix.g")
    public static class237 field3404;

    @ObfuscatedName("ix.e")
    public static class237 field3412;

    @ObfuscatedName("ix.n")
    public static class237 field3414;

    @ObfuscatedName("x.ew")
    public static class161 field342;

    @ObfuscatedName("x.dw")
    public static class239 field343;

    @ObfuscatedName("ia.g")
    public static class237 field3462;

    @ObfuscatedName("x.ki")
    public static int field348;

    @ObfuscatedName("ii.z")
    public static boolean field3480;

    @ObfuscatedName("ii.r")
    public static int field3481;

    @ObfuscatedName("ij.v")
    public static short[] field3535;

    @ObfuscatedName("in.n")
    public static class237 field3543;

    @ObfuscatedName("in.e")
    public static class237 field3545;

    @ObfuscatedName("jh.e")
    public static class237 field3591;

    @ObfuscatedName("jd.n")
    public static class237 field3594;

    @ObfuscatedName("jd.e")
    public static class237 field3607;

    @ObfuscatedName("jn.a")
    public static String[] field3618;

    @ObfuscatedName("jv.u")
    public static class286[] field3638;

    @ObfuscatedName("jm.c")
    public static class175 field3651;

    @ObfuscatedName("jq.u")
    public static class237 field3653;

    @ObfuscatedName("ja.h")
    public static class218 field3662;

    @ObfuscatedName("jr.c")
    public static int field3667;

    @ObfuscatedName("jr.n")
    public static class237 field3669;

    @ObfuscatedName("jj.gv")
    public static int field3685;

    @ObfuscatedName("k.fu")
    public static int[] field37;

    @ObfuscatedName("jf.n")
    public static String field3711;

    @ObfuscatedName("jg.w")
    public static int[] field3716;

    @ObfuscatedName("jg.v")
    public static int[] field3720;

    @ObfuscatedName("jt.n")
    public static long field3721;

    @ObfuscatedName("jz.u")
    public static short[][] field3730;

    @ObfuscatedName("jl.au")
    public static int field3739;

    @ObfuscatedName("q.rf")
    public static int field374;

    @ObfuscatedName("jl.ah")
    public static int field3741;

    @ObfuscatedName("jl.ay")
    public static int[] field3743;

    @ObfuscatedName("q.k")
    public static boolean field375;

    @ObfuscatedName("q.eb")
    public static int field376;

    @ObfuscatedName("kg.n")
    public static int field3776;

    @ObfuscatedName("kg.g")
    public static int field3777;

    @ObfuscatedName("kg.z")
    public static int[] field3778;

    @ObfuscatedName("kg.k")
    public static int[] field3779;

    @ObfuscatedName("kg.y")
    public static int[] field3780;

    @ObfuscatedName("kg.r")
    public static byte[][] field3781;

    @ObfuscatedName("kt.ek")
    public static class265 field3847;

    @ObfuscatedName("kx.cv")
    public static class239 field3848;

    @ObfuscatedName("kb.w")
    public static File field3886;

    @ObfuscatedName("ay.gb")
    public static class286[] field402;

    @ObfuscatedName("au.ed")
    public static class265 field407;

    @ObfuscatedName("ah.dl")
    public static int field420;

    @ObfuscatedName("ah.bd")
    public static class291 field423;

    @ObfuscatedName("ah.ir")
    public static int field424;

    @ObfuscatedName("ah.bg")
    public static class234 field425;

    @ObfuscatedName("ao.cf")
    public static class239 field441;

    @ObfuscatedName("ao.ce")
    public static class239 field442;

    @ObfuscatedName("al.cd")
    public static class161 field445;

    @ObfuscatedName("al.kx")
    public static int field450;

    @ObfuscatedName("al.hb")
    public static class218 field452;

    @ObfuscatedName("ae.nw")
    public static class77[] field468;

    @ObfuscatedName("ax.bz")
    public static int field470;

    @ObfuscatedName("ax.d")
    public static boolean field473;

    @ObfuscatedName("ax.o")
    public static int[] field474;

    @ObfuscatedName("ax.df")
    public static class239 field475;

    @ObfuscatedName("ax.x")
    public static String field477;

    @ObfuscatedName("az.ez")
    public static class155 field497;

    @ObfuscatedName("n.kp")
    public static int field5;

    @ObfuscatedName("aw.v")
    public static byte[][][] field505;

    @ObfuscatedName("av.pj")
    public static int field506;

    @ObfuscatedName("av.ph")
    public static int field511;

    @ObfuscatedName("av.ot")
    public static class104 field514;

    @ObfuscatedName("ak.pu")
    public static int field523;

    @ObfuscatedName("ak.bx")
    public static int field524;

    @ObfuscatedName("at.m")
    public static class48 field542;

    @ObfuscatedName("aq.kn")
    public static class218 field570;

    @ObfuscatedName("as.ga")
    public static class287[] field582;

    @ObfuscatedName("ap.mi")
    public static class158 field588;

    @ObfuscatedName("ap.w")
    public static class286[] field590;

    @ObfuscatedName("ap.b")
    public static int[] field591;

    @ObfuscatedName("ai.aq")
    public static String field597;

    @ObfuscatedName("ai.mc")
    public static class99 field602;

    @ObfuscatedName("ai.kg")
    public static class218 field603;

    @ObfuscatedName("ai.am")
    public static int field604;

    @ObfuscatedName("an.fw")
    public static int field606;

    @ObfuscatedName("aa.cl")
    public static boolean field646;

    @ObfuscatedName("aa.dm")
    public static class239 field647;

    @ObfuscatedName("aa.w")
    public static class81[] field649;

    @ObfuscatedName("bo.qk")
    public static class162 field651;

    @ObfuscatedName("bq.ni")
    public static class278 field654;

    @ObfuscatedName("bq.if")
    public static class76 field655;

    @ObfuscatedName("bq.aj")
    public static class287[] field656;

    @ObfuscatedName("bg.fg")
    public static int[] field664;

    @ObfuscatedName("bg.qx")
    public static long field666;

    @ObfuscatedName("bg.oz")
    public static class287 field668;

    @ObfuscatedName("bp.fh")
    public static int field673;

    @ObfuscatedName("bp.a")
    public static int field682;

    @ObfuscatedName("bp.ao")
    public static FontMetrics field691;

    @ObfuscatedName("bp.fp")
    public static int[][] field708;

    @ObfuscatedName("bp.fs")
    public static byte[][] field710;

    @ObfuscatedName("bi.jc")
    public static int field715;

    @ObfuscatedName("bi.qw")
    public static class293 field732;

    @ObfuscatedName("by.fm")
    public static class287 field740;

    @ObfuscatedName("bc.dv")
    public static class239 field742;

    @ObfuscatedName("bc.h")
    public static int[] field743;

    @ObfuscatedName("bc.w")
    public static byte[][][] field745;

    @ObfuscatedName("bc.ah")
    public static Font field746;

    @ObfuscatedName("bc.l")
    public static int[] field747;

    @ObfuscatedName("bc.s")
    public static int[][][] field749;

    @ObfuscatedName("bc.r")
    public static int[][] field757;

    @ObfuscatedName("bz.ci")
    public static class239 field788;

    @ObfuscatedName("bz.du")
    public static String field790;

    @ObfuscatedName("bz.l")
    public static int field791;

    @ObfuscatedName("bz.ff")
    public static int field792;

    @ObfuscatedName("bz.fb")
    public static class287[] field794;

    @ObfuscatedName("br.ny")
    public static byte field805;

    @ObfuscatedName("bm.bc")
    public static String field806;

    @ObfuscatedName("bj.ji")
    public static int field814;

    @ObfuscatedName("bb.db")
    public static class239 field825;

    @ObfuscatedName("bb.fe")
    public static int field827;

    @ObfuscatedName("bb.qn")
    public static int field828;

    @ObfuscatedName("bf.ds")
    public static int field833;

    @ObfuscatedName("bl.fi")
    public static int field847;

    @ObfuscatedName("bl.ag")
    public static int[] field848;

    @ObfuscatedName("bt.z")
    public static class286 field851;

    @ObfuscatedName("bt.eu")
    public static class265 field853;

    @ObfuscatedName("bt.dc")
    public static class239 field856;

    @ObfuscatedName("bw.k")
    public static int field859;

    @ObfuscatedName("bw.bu")
    public static String field863;

    @ObfuscatedName("bs.az")
    public static Image field869;

    @ObfuscatedName("bs.pt")
    public static int field875;

    @ObfuscatedName("bh.cj")
    public static class155 field878;

    @ObfuscatedName("bh.ap")
    public static GarbageCollectorMXBean field879;

    @ObfuscatedName("bk.gs")
    public static int field906;

    @ObfuscatedName("bk.la")
    public static class218[] field907;

    @ObfuscatedName("cn.w([BZI)Ljava/lang/Object;")
    public static Object method1602(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class178.field2402) {
            try {
                class173 var2 = new class173();
                var2.method2910(arg0);
                return var2;
            } catch (Throwable var7) {
                class178.field2402 = true;
            }
        }
        if (arg1) {
            int var4 = arg0.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(arg0, 0, var5, 0, var4);
            return var5;
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("hy.y(I)[Liy;")
    public static class241[] method3793() {
        return new class241[] { class241.field3257, class241.field3255, class241.field3259 };
    }

    @ObfuscatedName("ag.e(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method206(int arg0, String arg1, String arg2) {
        class100.method112(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bp.e(IILfg;Lfo;B)Z")
    public static final boolean method890(int arg0, int arg1, class165 arg2, class163 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        class164.field2286[var6][var7] = 99;
        class164.field2290[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        class164.field2284[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        class164.field2285[var10001] = arg1;
        int[][] var12 = arg3.field2280;
        while (var18 != var11) {
            var4 = class164.field2284[var11];
            var5 = class164.field2285[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field2275;
            int var16 = var5 - arg3.field2269;
            if (arg2.method1043(1, var4, var5, arg3)) {
                field2288 = var4;
                field859 = var5;
                return true;
            }
            int var17 = class164.field2290[var13][var14] + 1;
            if (var13 > 0 && class164.field2286[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0) {
                class164.field2284[var18] = var4 - 1;
                class164.field2285[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                class164.field2286[var13 - 1][var14] = 2;
                class164.field2290[var13 - 1][var14] = var17;
            }
            if (var13 < 127 && class164.field2286[var13 + 1][var14] == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0) {
                class164.field2284[var18] = var4 + 1;
                class164.field2285[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                class164.field2286[var13 + 1][var14] = 8;
                class164.field2290[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && class164.field2286[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                class164.field2284[var18] = var4;
                class164.field2285[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                class164.field2286[var13][var14 - 1] = 1;
                class164.field2290[var13][var14 - 1] = var17;
            }
            if (var14 < 127 && class164.field2286[var13][var14 + 1] == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                class164.field2284[var18] = var4;
                class164.field2285[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                class164.field2286[var13][var14 + 1] = 4;
                class164.field2290[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && class164.field2286[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                class164.field2284[var18] = var4 - 1;
                class164.field2285[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                class164.field2286[var13 - 1][var14 - 1] = 3;
                class164.field2290[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 127 && var14 > 0 && class164.field2286[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                class164.field2284[var18] = var4 + 1;
                class164.field2285[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                class164.field2286[var13 + 1][var14 - 1] = 9;
                class164.field2290[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 127 && class164.field2286[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                class164.field2284[var18] = var4 - 1;
                class164.field2285[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                class164.field2286[var13 - 1][var14 + 1] = 6;
                class164.field2290[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 127 && var14 < 127 && class164.field2286[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 1] & 0x12401E0) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                class164.field2284[var18] = var4 + 1;
                class164.field2285[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                class164.field2286[var13 + 1][var14 + 1] = 12;
                class164.field2290[var13 + 1][var14 + 1] = var17;
            }
        }
        field2288 = var4;
        field859 = var5;
        return false;
    }

    @ObfuscatedName("z.n(II)Lil;")
    public static class249 method34(int arg0) {
        class249 var1 = (class249) class249.field3345.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3350.method3817(3, arg0);
        class249 var3 = new class249();
        if (var2 != null) {
            var3.method4071(new class175(var2));
        }
        class249.field3345.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hi.n(CI)Z")
    public static boolean method3774(char arg0) {
        if (!(arg0 <= 0 || arg0 >= 128) || !(arg0 < 160 || arg0 > 255)) {
            return true;
        }
        if (arg0 != 0) {
            char[] var1 = class268.field3654;
            for (int var2 = 0; var2 < var1.length; var2++) {
                char var3 = var1[var2];
                if (arg0 == var3) {
                    return true;
                }
            }
        }
        return false;
    }

    @ObfuscatedName("d.g(Lit;Ljava/lang/String;Ljava/lang/String;B)[Ljp;")
    public static class286[] method49(class237 arg0, String arg1, String arg2) {
        int var3 = arg0.method3829(arg1);
        int var4 = arg0.method3834(var3, arg2);
        class286[] var5;
        if (class288.method1744(arg0, var3, var4)) {
            var5 = class288.method3716();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("cn.w(IIIII)V")
    public static void method1600(int arg0, int arg1, int arg2, int arg3) {
        for (class83 var4 = (class83) class83.field1315.method3348(); var4 != null; var4 = (class83) class83.field1315.method3350()) {
            if (var4.field1311 != -1 || var4.field1312 != null) {
                int var5 = 0;
                if (arg1 > var4.field1308) {
                    var5 += arg1 - var4.field1308;
                } else if (arg1 < var4.field1306) {
                    var5 += var4.field1306 - arg1;
                }
                if (arg2 > var4.field1309) {
                    var5 += arg2 - var4.field1309;
                } else if (arg2 < var4.field1305) {
                    var5 += var4.field1305 - arg2;
                }
                if (var5 - 64 > var4.field1307 || client.field1144 == 0 || var4.field1316 != arg0) {
                    if (var4.field1317 != null) {
                        field514.method1792(var4.field1317);
                        var4.field1317 = null;
                    }
                    if (var4.field1313 != null) {
                        field514.method1792(var4.field1313);
                        var4.field1313 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field1144 * (var4.field1307 - var5) / var4.field1307;
                    if (var4.field1317 != null) {
                        var4.field1317.method2073(var6);
                    } else if (var4.field1311 >= 0) {
                        class107 var7 = class107.method1820(field1273, var4.field1311, 0);
                        if (var7 != null) {
                            class109 var8 = var7.method1818().method1865(field3115);
                            class119 var9 = class119.method1979(var8, 100, var6);
                            var9.method2105(-1);
                            field514.method1769(var9);
                            var4.field1317 = var9;
                        }
                    }
                    if (var4.field1313 != null) {
                        var4.field1313.method2073(var6);
                        if (!var4.field1313.method3334()) {
                            var4.field1313 = null;
                        }
                    } else if (var4.field1312 != null && (var4.field1310 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1312.length);
                        class107 var11 = class107.method1820(field1273, var4.field1312[var10], 0);
                        if (var11 != null) {
                            class109 var12 = var11.method1818().method1865(field3115);
                            class119 var13 = class119.method1979(var12, 100, var6);
                            var13.method2105(0);
                            field514.method1769(var13);
                            var4.field1313 = var13;
                            var4.field1310 = var4.field1304 + (int) (Math.random() * (double) (var4.field1314 - var4.field1304));
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.k(IIIIIIII)Z")
    public static final boolean method2299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class136.field1992 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = class136.field1992 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = class136.field1984 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = class136.field1984 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }

    @ObfuscatedName("j.g(III)Lhg;")
    public static class218 method177(int arg0, int arg1) {
        class218 var2 = class218.method4538(arg0);
        if (arg1 == -1) {
            return var2;
        } else if (var2 == null || var2.field2615 == null || arg1 >= var2.field2615.length) {
            return null;
        } else {
            return var2.field2615[arg1];
        }
    }

    @ObfuscatedName("dx.w(Ljava/lang/String;Ljava/lang/String;ZB)Ldk;")
    public static class126 method2219(String arg0, String arg1, boolean arg2) {
        File var3 = new File(field3886, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class126(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (field2112 == 33) {
            var6 = "_rc";
        } else if (field2112 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(field477, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class126(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class126(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fa.al([BB)[B")
    public static final byte[] method2904(byte[] arg0) {
        class175 var1 = new class175(arg0);
        int var2 = var1.method2928();
        int var3 = var1.method2933();
        if (var3 < 0 || !(class237.field3202 == 0 || var3 <= class237.field3202)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2939(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2933();
            if (var5 < 0 || class237.field3202 != 0 && var5 > class237.field3202) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class169.method2876(var6, var5, arg0, var3, 9);
            } else {
                class237.field3208.method2874(var1, var6);
            }
            return var6;
        }
    }

    @ObfuscatedName("bv.f(ILcc;ZI)I")
    public static int method1082(int arg0, class101 arg1, boolean arg2) {
        if (arg0 == 5000) {
            class85.field1332[++field1333 - 1] = client.field1120;
            return 1;
        } else if (arg0 == 5001) {
            field1333 -= 3;
            client.field1120 = class85.field1332[field1333];
            field654 = class278.method2906(class85.field1332[field1333 + 1]);
            if (field654 == null) {
                field654 = class278.field3714;
            }
            client.field1128 = class85.field1332[field1333 + 2];
            client.field957.method3154(97);
            client.field957.method2913(client.field1120);
            client.field957.method2913(field654.field3715);
            client.field957.method2913(client.field1128);
            return 1;
        } else if (arg0 == 5002) {
            String var3 = class85.field1334[--field1328];
            field1333 -= 2;
            int var4 = class85.field1332[field1333];
            int var5 = class85.field1332[field1333 + 1];
            client.field957.method3154(6);
            client.field957.method2913(class175.method563(var3) + 2);
            client.field957.method2927(var3);
            client.field957.method2913(var4 - 1);
            client.field957.method2913(var5);
            return 1;
        } else if (arg0 == 5003) {
            field1333 -= 2;
            int var6 = class85.field1332[field1333];
            int var7 = class85.field1332[field1333 + 1];
            class74 var8 = class100.method167(var6, var7);
            if (var8 == null) {
                class85.field1332[++field1333 - 1] = -1;
                class85.field1332[++field1333 - 1] = 0;
                class85.field1334[++field1328 - 1] = "";
                class85.field1334[++field1328 - 1] = "";
                class85.field1334[++field1328 - 1] = "";
            } else {
                class85.field1332[++field1333 - 1] = var8.field872;
                class85.field1332[++field1333 - 1] = var8.field871;
                class85.field1334[++field1328 - 1] = var8.field870 == null ? "" : var8.field870;
                class85.field1334[++field1328 - 1] = var8.field873 == null ? "" : var8.field873;
                class85.field1334[++field1328 - 1] = var8.field874 == null ? "" : var8.field874;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var9 = class85.field1332[--field1333];
            class74 var10 = class100.method2699(var9);
            if (var10 == null) {
                class85.field1332[++field1333 - 1] = -1;
                class85.field1332[++field1333 - 1] = 0;
                class85.field1334[++field1328 - 1] = "";
                class85.field1334[++field1328 - 1] = "";
                class85.field1334[++field1328 - 1] = "";
            } else {
                class85.field1332[++field1333 - 1] = var10.field876;
                class85.field1332[++field1333 - 1] = var10.field871;
                class85.field1334[++field1328 - 1] = var10.field870 == null ? "" : var10.field870;
                class85.field1334[++field1328 - 1] = var10.field873 == null ? "" : var10.field873;
                class85.field1334[++field1328 - 1] = var10.field874 == null ? "" : var10.field874;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (field654 == null) {
                class85.field1332[++field1333 - 1] = -1;
            } else {
                class85.field1332[++field1333 - 1] = field654.field3715;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var11 = class85.field1334[--field1328];
            int var12 = class85.field1332[--field1333];
            String var13 = var11.toLowerCase();
            byte var14 = 0;
            if (var13.startsWith(class227.field2872)) {
                var14 = 0;
                var11 = var11.substring(class227.field2872.length());
            } else if (var13.startsWith(class227.field2881)) {
                var14 = 1;
                var11 = var11.substring(class227.field2881.length());
            } else if (var13.startsWith(class227.field3006)) {
                var14 = 2;
                var11 = var11.substring(class227.field3006.length());
            } else if (var13.startsWith(class227.field2969)) {
                var14 = 3;
                var11 = var11.substring(class227.field2969.length());
            } else if (var13.startsWith(class227.field3010)) {
                var14 = 4;
                var11 = var11.substring(class227.field3010.length());
            } else if (var13.startsWith(class227.field3012)) {
                var14 = 5;
                var11 = var11.substring(class227.field3012.length());
            } else if (var13.startsWith(class227.field3069)) {
                var14 = 6;
                var11 = var11.substring(class227.field3069.length());
            } else if (var13.startsWith(class227.field2936)) {
                var14 = 7;
                var11 = var11.substring(class227.field2936.length());
            } else if (var13.startsWith(class227.field3018)) {
                var14 = 8;
                var11 = var11.substring(class227.field3018.length());
            } else if (var13.startsWith(class227.field3020)) {
                var14 = 9;
                var11 = var11.substring(class227.field3020.length());
            } else if (var13.startsWith(class227.field3022)) {
                var14 = 10;
                var11 = var11.substring(class227.field3022.length());
            } else if (var13.startsWith(class227.field3024)) {
                var14 = 11;
                var11 = var11.substring(class227.field3024.length());
            } else if (client.field1014 != 0) {
                if (var13.startsWith(class227.field2922)) {
                    var14 = 0;
                    var11 = var11.substring(class227.field2922.length());
                } else if (var13.startsWith(class227.field3005)) {
                    var14 = 1;
                    var11 = var11.substring(class227.field3005.length());
                } else if (var13.startsWith(class227.field3007)) {
                    var14 = 2;
                    var11 = var11.substring(class227.field3007.length());
                } else if (var13.startsWith(class227.field3009)) {
                    var14 = 3;
                    var11 = var11.substring(class227.field3009.length());
                } else if (var13.startsWith(class227.field2888)) {
                    var14 = 4;
                    var11 = var11.substring(class227.field2888.length());
                } else if (var13.startsWith(class227.field3013)) {
                    var14 = 5;
                    var11 = var11.substring(class227.field3013.length());
                } else if (var13.startsWith(class227.field3015)) {
                    var14 = 6;
                    var11 = var11.substring(class227.field3015.length());
                } else if (var13.startsWith(class227.field3017)) {
                    var14 = 7;
                    var11 = var11.substring(class227.field3017.length());
                } else if (var13.startsWith(class227.field3019)) {
                    var14 = 8;
                    var11 = var11.substring(class227.field3019.length());
                } else if (var13.startsWith(class227.field3021)) {
                    var14 = 9;
                    var11 = var11.substring(class227.field3021.length());
                } else if (var13.startsWith(class227.field2903)) {
                    var14 = 10;
                    var11 = var11.substring(class227.field2903.length());
                } else if (var13.startsWith(class227.field3097)) {
                    var14 = 11;
                    var11 = var11.substring(class227.field3097.length());
                }
            }
            String var15 = var11.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class227.field3026)) {
                var16 = 1;
                var11 = var11.substring(class227.field3026.length());
            } else if (var15.startsWith(class227.field3028)) {
                var16 = 2;
                var11 = var11.substring(class227.field3028.length());
            } else if (var15.startsWith(class227.field2978)) {
                var16 = 3;
                var11 = var11.substring(class227.field2978.length());
            } else if (var15.startsWith(class227.field3032)) {
                var16 = 4;
                var11 = var11.substring(class227.field3032.length());
            } else if (var15.startsWith(class227.field3034)) {
                var16 = 5;
                var11 = var11.substring(class227.field3034.length());
            } else if (client.field1014 != 0) {
                if (var15.startsWith(class227.field3027)) {
                    var16 = 1;
                    var11 = var11.substring(class227.field3027.length());
                } else if (var15.startsWith(class227.field3029)) {
                    var16 = 2;
                    var11 = var11.substring(class227.field3029.length());
                } else if (var15.startsWith(class227.field2835)) {
                    var16 = 3;
                    var11 = var11.substring(class227.field2835.length());
                } else if (var15.startsWith(class227.field3033)) {
                    var16 = 4;
                    var11 = var11.substring(class227.field3033.length());
                } else if (var15.startsWith(class227.field3035)) {
                    var16 = 5;
                    var11 = var11.substring(class227.field3035.length());
                }
            }
            client.field957.method3154(54);
            client.field957.method2913(0);
            int var17 = client.field957.field2381;
            client.field957.method2913(var12);
            client.field957.method2913(var14);
            client.field957.method2913(var16);
            class181 var18 = client.field957;
            int var19 = var18.field2381;
            int var20 = var11.length();
            byte[] var21 = new byte[var20];
            for (int var22 = 0; var22 < var20; var22++) {
                char var23 = var11.charAt(var22);
                if (var23 > 0 && var23 < 128 || var23 >= 160 && var23 <= 255) {
                    var21[var22] = (byte) var23;
                } else if (var23 == 8364) {
                    var21[var22] = -128;
                } else if (var23 == 8218) {
                    var21[var22] = -126;
                } else if (var23 == 402) {
                    var21[var22] = -125;
                } else if (var23 == 8222) {
                    var21[var22] = -124;
                } else if (var23 == 8230) {
                    var21[var22] = -123;
                } else if (var23 == 8224) {
                    var21[var22] = -122;
                } else if (var23 == 8225) {
                    var21[var22] = -121;
                } else if (var23 == 710) {
                    var21[var22] = -120;
                } else if (var23 == 8240) {
                    var21[var22] = -119;
                } else if (var23 == 352) {
                    var21[var22] = -118;
                } else if (var23 == 8249) {
                    var21[var22] = -117;
                } else if (var23 == 338) {
                    var21[var22] = -116;
                } else if (var23 == 381) {
                    var21[var22] = -114;
                } else if (var23 == 8216) {
                    var21[var22] = -111;
                } else if (var23 == 8217) {
                    var21[var22] = -110;
                } else if (var23 == 8220) {
                    var21[var22] = -109;
                } else if (var23 == 8221) {
                    var21[var22] = -108;
                } else if (var23 == 8226) {
                    var21[var22] = -107;
                } else if (var23 == 8211) {
                    var21[var22] = -106;
                } else if (var23 == 8212) {
                    var21[var22] = -105;
                } else if (var23 == 732) {
                    var21[var22] = -104;
                } else if (var23 == 8482) {
                    var21[var22] = -103;
                } else if (var23 == 353) {
                    var21[var22] = -102;
                } else if (var23 == 8250) {
                    var21[var22] = -101;
                } else if (var23 == 339) {
                    var21[var22] = -100;
                } else if (var23 == 382) {
                    var21[var22] = -98;
                } else if (var23 == 376) {
                    var21[var22] = -97;
                } else {
                    var21[var22] = 63;
                }
            }
            var18.method2926(var21.length);
            var18.field2381 += field275.method2864(var21, 0, var21.length, var18.field2376, var18.field2381);
            client.field957.method2981(client.field957.field2381 - var17);
            return 1;
        } else if (arg0 == 5009) {
            field1328 -= 2;
            String var26 = class85.field1334[field1328];
            String var27 = class85.field1334[field1328 + 1];
            client.field957.method3154(50);
            client.field957.method2914(0);
            int var28 = client.field957.field2381;
            client.field957.method2927(var26);
            class181 var29 = client.field957;
            int var30 = var29.field2381;
            int var31 = var27.length();
            byte[] var32 = new byte[var31];
            for (int var33 = 0; var33 < var31; var33++) {
                char var34 = var27.charAt(var33);
                if (var34 > 0 && var34 < 128 || var34 >= 160 && var34 <= 255) {
                    var32[var33] = (byte) var34;
                } else if (var34 == 8364) {
                    var32[var33] = -128;
                } else if (var34 == 8218) {
                    var32[var33] = -126;
                } else if (var34 == 402) {
                    var32[var33] = -125;
                } else if (var34 == 8222) {
                    var32[var33] = -124;
                } else if (var34 == 8230) {
                    var32[var33] = -123;
                } else if (var34 == 8224) {
                    var32[var33] = -122;
                } else if (var34 == 8225) {
                    var32[var33] = -121;
                } else if (var34 == 710) {
                    var32[var33] = -120;
                } else if (var34 == 8240) {
                    var32[var33] = -119;
                } else if (var34 == 352) {
                    var32[var33] = -118;
                } else if (var34 == 8249) {
                    var32[var33] = -117;
                } else if (var34 == 338) {
                    var32[var33] = -116;
                } else if (var34 == 381) {
                    var32[var33] = -114;
                } else if (var34 == 8216) {
                    var32[var33] = -111;
                } else if (var34 == 8217) {
                    var32[var33] = -110;
                } else if (var34 == 8220) {
                    var32[var33] = -109;
                } else if (var34 == 8221) {
                    var32[var33] = -108;
                } else if (var34 == 8226) {
                    var32[var33] = -107;
                } else if (var34 == 8211) {
                    var32[var33] = -106;
                } else if (var34 == 8212) {
                    var32[var33] = -105;
                } else if (var34 == 732) {
                    var32[var33] = -104;
                } else if (var34 == 8482) {
                    var32[var33] = -103;
                } else if (var34 == 353) {
                    var32[var33] = -102;
                } else if (var34 == 8250) {
                    var32[var33] = -101;
                } else if (var34 == 339) {
                    var32[var33] = -100;
                } else if (var34 == 382) {
                    var32[var33] = -98;
                } else if (var34 == 376) {
                    var32[var33] = -97;
                } else {
                    var32[var33] = 63;
                }
            }
            var29.method2926(var32.length);
            var29.field2381 += field275.method2864(var32, 0, var32.length, var29.field2376, var29.field2381);
            client.field957.method2936(client.field957.field2381 - var28);
            return 1;
        } else if (arg0 == 5015) {
            String var37;
            if (field655 == null || field655.field896 == null) {
                var37 = "";
            } else {
                var37 = field655.field896;
            }
            class85.field1334[++field1328 - 1] = var37;
            return 1;
        } else if (arg0 == 5016) {
            class85.field1332[++field1333 - 1] = client.field1128;
            return 1;
        } else if (arg0 == 5017) {
            int var38 = class85.field1332[--field1333];
            class85.field1332[++field1333 - 1] = class100.method1501(var38);
            return 1;
        } else if (arg0 == 5018) {
            int var39 = class85.field1332[--field1333];
            int[] var40 = class85.field1332;
            int var41 = ++field1333 - 1;
            class74 var42 = (class74) class100.field1517.method3249((long) var39);
            int var43;
            if (var42 == null) {
                var43 = -1;
            } else if (class100.field1521.field2471 == var42.field2456) {
                var43 = -1;
            } else {
                var43 = ((class74) var42.field2456).field872;
            }
            var40[var41] = var43;
            return 1;
        } else if (arg0 == 5019) {
            int var44 = class85.field1332[--field1333];
            int[] var45 = class85.field1332;
            int var46 = ++field1333 - 1;
            class74 var47 = (class74) class100.field1517.method3249((long) var44);
            int var48;
            if (var47 == null) {
                var48 = -1;
            } else if (class100.field1521.field2471 == var47.field2457) {
                var48 = -1;
            } else {
                var48 = ((class74) var47.field2457).field872;
            }
            var45[var46] = var48;
            return 1;
        } else if (arg0 == 5020) {
            String var49 = class85.field1334[--field1328];
            client.method992(var49);
            return 1;
        } else if (arg0 == 5021) {
            client.field1122 = class85.field1334[--field1328].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            class85.field1334[++field1328 - 1] = client.field1122;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aj.ha(ZB)V")
    public static final void method672(boolean arg0) {
        while (true) {
            if (client.field959.method3172(client.field1000) >= 27) {
                int var1 = client.field959.method3157(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (client.field952[var1] == null) {
                        client.field952[var1] = new class88();
                        var2 = true;
                    }
                    class88 var3 = client.field952[var1];
                    client.field954[++client.field953 - 1] = var1;
                    var3.field1246 = client.field925;
                    var3.field1364 = class260.method137(client.field959.method3157(14));
                    int var4 = client.field1031[client.field959.method3157(3)];
                    if (var2) {
                        var3.field1217 = var3.field1208 = var4;
                    }
                    int var5;
                    if (arg0) {
                        var5 = client.field959.method3157(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = client.field959.method3157(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = client.field959.method3157(1);
                    if (var6 == 1) {
                        client.field956[++client.field982 - 1] = var1;
                    }
                    int var7;
                    if (arg0) {
                        var7 = client.field959.method3157(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = client.field959.method3157(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8 = client.field959.method3157(1);
                    var3.field1255 = var3.field1364.field3548;
                    var3.field1230 = var3.field1364.field3571;
                    if (var3.field1230 == 0) {
                        var3.field1208 = 0;
                    }
                    var3.field1242 = var3.field1364.field3554;
                    var3.field1215 = var3.field1364.field3555;
                    var3.field1250 = var3.field1364.field3549;
                    var3.field1212 = var3.field1364.field3557;
                    var3.field1211 = var3.field1364.field3551;
                    var3.field1228 = var3.field1364.field3552;
                    var3.field1213 = var3.field1364.field3547;
                    var3.method1585(field655.field1261[0] + var5, field655.field1262[0] + var7, var8 == 1);
                    continue;
                }
            }
            client.field959.method3158();
            return;
        }
    }

    @ObfuscatedName("hr.hj(I)V")
    public static void method3797() {
        if (!client.field970) {
            return;
        }
        class218 var0 = method177(field348, client.field1059);
        if (var0 != null && var0.field2736 != null) {
            class71 var1 = new class71();
            var1.field837 = var0;
            var1.field850 = var0.field2736;
            class85.method1409(var1);
        }
        client.field970 = false;
        client.method4218(var0);
    }

    @ObfuscatedName("bs.is(Lhg;I)Z")
    public static final boolean method1039(class218 arg0) {
        if (arg0.field2737 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2737.length; var1++) {
            int var2 = client.method72(arg0, var1);
            int var3 = arg0.field2735[var1];
            if (arg0.field2737[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2737[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2737[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }
}
