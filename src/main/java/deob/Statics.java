package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.DataInputStream;
import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("h.n")
    public static int field1;

    @ObfuscatedName("client.fl")
    public static class286[] field1002;

    @ObfuscatedName("client.bu")
    public static String field1042;

    @ObfuscatedName("client.jo")
    public static int field1115;

    @ObfuscatedName("ch.x")
    public static class81[] field1290;

    @ObfuscatedName("f.kp")
    public static class218 field13;

    @ObfuscatedName("cn.ap")
    public static String field1314;

    @ObfuscatedName("ct.nx")
    public static int field1321;

    @ObfuscatedName("cm.cd")
    public static class239 field1338;

    @ObfuscatedName("cg.p")
    public static String[] field1342;

    @ObfuscatedName("cg.f")
    public static int[] field1343;

    @ObfuscatedName("cg.l")
    public static int field1348;

    @ObfuscatedName("cg.nh")
    public static byte field1355;

    @ObfuscatedName("cg.on")
    public static class111 field1357;

    @ObfuscatedName("cg.bt")
    public static class73 field1358;

    @ObfuscatedName("ci.bi")
    public static class286[] field1373;

    @ObfuscatedName("cs.b")
    public static class237 field1381;

    @ObfuscatedName("f.pp")
    public static int field14;

    @ObfuscatedName("ca.b")
    public static int field1416;

    @ObfuscatedName("ca.e")
    public static int field1418;

    @ObfuscatedName("ca.f")
    public static int field1420;

    @ObfuscatedName("cq.c")
    public static class287 field1426;

    @ObfuscatedName("cq.b")
    public static int field1428;

    @ObfuscatedName("cx.p")
    public static class286 field1437;

    @ObfuscatedName("cx.x")
    public static class286[] field1438;

    @ObfuscatedName("cx.u")
    public static int[] field1441;

    @ObfuscatedName("cx.ao")
    public static int[] field1445;

    @ObfuscatedName("cx.f")
    public static class286 field1447;

    @ObfuscatedName("cx.m")
    public static int field1448;

    @ObfuscatedName("cx.n")
    public static int[] field1457;

    @ObfuscatedName("cx.j")
    public static boolean field1466;

    @ObfuscatedName("cx.ay")
    public static class286[] field1467;

    @ObfuscatedName("cw.nt")
    public static class278 field1489;

    @ObfuscatedName("f.c")
    public static int field15;

    @ObfuscatedName("cb.bg")
    public static int field1502;

    @ObfuscatedName("cl.o")
    public static boolean field1533;

    @ObfuscatedName("cc.qz")
    public static class293 field1565;

    @ObfuscatedName("dm.c")
    public static byte[] field1581;

    @ObfuscatedName("dm.s")
    public static class117[] field1584;

    @ObfuscatedName("dm.k")
    public static float[] field1588;

    @ObfuscatedName("dm.w")
    public static int field1589;

    @ObfuscatedName("dm.o")
    public static int field1591;

    @ObfuscatedName("dm.m")
    public static class106[] field1592;

    @ObfuscatedName("dm.i")
    public static class110[] field1593;

    @ObfuscatedName("dm.ax")
    public static float[] field1594;

    @ObfuscatedName("dm.r")
    public static class122[] field1595;

    @ObfuscatedName("dm.ao")
    public static float[] field1596;

    @ObfuscatedName("dm.a")
    public static int[] field1597;

    @ObfuscatedName("dm.l")
    public static int field1601;

    @ObfuscatedName("dm.q")
    public static float[] field1604;

    @ObfuscatedName("dm.n")
    public static float[] field1605;

    @ObfuscatedName("dm.d")
    public static float[] field1606;

    @ObfuscatedName("dm.ar")
    public static int[] field1607;

    @ObfuscatedName("dm.e")
    public static boolean[] field1609;

    @ObfuscatedName("dm.b")
    public static int field1610;

    @ObfuscatedName("dm.ag")
    public static int[] field1611;

    @ObfuscatedName("dm.an")
    public static float[] field1614;

    @ObfuscatedName("dz.m")
    public static boolean[] field1622;

    @ObfuscatedName("dz.b")
    public static int[] field1629;

    @ObfuscatedName("dz.o")
    public static int[] field1630;

    @ObfuscatedName("dc.w")
    public static int field1633;

    @ObfuscatedName("dc.ag")
    public static FontMetrics field1649;

    @ObfuscatedName("dc.x")
    public static int field1652;

    @ObfuscatedName("dx.a")
    public static class48 field1667;

    @ObfuscatedName("dx.l")
    public static class237 field1669;

    @ObfuscatedName("dy.y")
    public static class175 field1680;

    @ObfuscatedName("dj.pq")
    public static int field1699;

    @ObfuscatedName("dk.l")
    public static float field1722;

    @ObfuscatedName("dk.w")
    public static int field1723;

    @ObfuscatedName("dw.fb")
    public static int field1789;

    @ObfuscatedName("p.o")
    public static class286 field18;

    @ObfuscatedName("ed.fr")
    public static int field1874;

    @ObfuscatedName("es.r")
    public static int[] field1890;

    @ObfuscatedName("eb.dl")
    public static class239 field1925;

    @ObfuscatedName("eo.bj")
    public static int field1962;

    @ObfuscatedName("eo.bh")
    public static int field1979;

    @ObfuscatedName("eo.bw")
    public static int field1986;

    @ObfuscatedName("p.c")
    public static class237 field20;

    @ObfuscatedName("ej.x")
    public static int field2001;

    @ObfuscatedName("ej.g")
    public static boolean field2004;

    @ObfuscatedName("en.dp")
    public static class239 field2006;

    @ObfuscatedName("en.em")
    public static class265 field2007;

    @ObfuscatedName("en.eb")
    public static class161 field2012;

    @ObfuscatedName("ek.a")
    public static int field2026;

    @ObfuscatedName("ek.i")
    public static int field2028;

    @ObfuscatedName("ek.s")
    public static int field2029;

    @ObfuscatedName("ek.e")
    public static int field2031;

    @ObfuscatedName("ek.v")
    public static int field2033;

    @ObfuscatedName("ek.t")
    public static int field2034;

    @ObfuscatedName("ek.y")
    public static int field2035;

    @ObfuscatedName("ek.k")
    public static class147 field2038;

    @ObfuscatedName("ek.r")
    public static int field2042;

    @ObfuscatedName("ec.ei")
    public static class264 field2053;

    @ObfuscatedName("el.dm")
    public static class239 field2056;

    @ObfuscatedName("ez.n")
    public static int field2060;

    @ObfuscatedName("ez.bw")
    public static int field2072;

    @ObfuscatedName("ez.ar")
    public static int field2073;

    @ObfuscatedName("ez.a")
    public static int field2076;

    @ObfuscatedName("ez.bp")
    public static int field2077;

    @ObfuscatedName("ez.bu")
    public static int field2078;

    @ObfuscatedName("ez.ao")
    public static int field2079;

    @ObfuscatedName("ez.z")
    public static int field2080;

    @ObfuscatedName("ez.u")
    public static int field2081;

    @ObfuscatedName("ez.k")
    public static int field2082;

    @ObfuscatedName("ez.q")
    public static int field2083;

    @ObfuscatedName("ez.by")
    public static boolean[][] field2084;

    @ObfuscatedName("ez.d")
    public static int field2085;

    @ObfuscatedName("ez.ax")
    public static int field2086;

    @ObfuscatedName("ez.v")
    public static int field2096;

    @ObfuscatedName("ez.t")
    public static int field2111;

    @ObfuscatedName("ez.an")
    public static int field2114;

    @ObfuscatedName("ez.y")
    public static int field2115;

    @ObfuscatedName("ez.bc")
    public static int field2117;

    @ObfuscatedName("ez.bh")
    public static int field2118;

    @ObfuscatedName("ez.bj")
    public static int field2120;

    @ObfuscatedName("et.fe")
    public static int[] field2123;

    @ObfuscatedName("et.fw")
    public static class287 field2128;

    @ObfuscatedName("ey.ev")
    public static class155 field2131;

    @ObfuscatedName("p.qj")
    public static class82 field22;

    @ObfuscatedName("ew.c")
    public static int field2206;

    @ObfuscatedName("eg.h")
    public static String field2217;

    @ObfuscatedName("eg.n")
    public static int[] field2221;

    @ObfuscatedName("eg.l")
    public static int field2223;

    @ObfuscatedName("eg.j")
    public static Applet field2225;

    @ObfuscatedName("ep.h")
    public static String field2236;

    @ObfuscatedName("ep.j")
    public static String field2237;

    @ObfuscatedName("ff.x")
    public static File field2246;

    @ObfuscatedName("ff.g")
    public static int field2248;

    @ObfuscatedName("ff.a")
    public static String[] field2255;

    @ObfuscatedName("ff.v")
    public static String[] field2256;

    @ObfuscatedName("ff.p")
    public static File field2257;

    @ObfuscatedName("ff.j")
    public static class237 field2259;

    @ObfuscatedName("ff.md")
    public static class99 field2260;

    @ObfuscatedName("fr.h")
    public static File field2263;

    @ObfuscatedName("c.gd")
    public static class7[] field227;

    @ObfuscatedName("fj.pt")
    public static int field2271;

    @ObfuscatedName("fx.al")
    public static class284 field2287;

    @ObfuscatedName("fx.ar")
    public static Font field2290;

    @ObfuscatedName("fc.j")
    public static class237 field2306;

    @ObfuscatedName("ft.g")
    public static int field2310;

    @ObfuscatedName("fe.x")
    public static int field2317;

    @ObfuscatedName("fi.gl")
    public static class287[] field2321;

    @ObfuscatedName("fi.dj")
    public static String field2322;

    @ObfuscatedName("fg.o")
    public static int field2324;

    @ObfuscatedName("fg.i")
    public static int[] field2326;

    @ObfuscatedName("fm.qy")
    public static int field2341;

    @ObfuscatedName("fh.h")
    public static int field2345;

    @ObfuscatedName("fn.db")
    public static class239 field2366;

    @ObfuscatedName("w.ph")
    public static int field238;

    @ObfuscatedName("fa.h")
    public static long field2405;

    @ObfuscatedName("fa.g")
    public static class218[][] field2406;

    @ObfuscatedName("fa.j")
    public static long field2408;

    @ObfuscatedName("fa.ck")
    public static class239 field2410;

    @ObfuscatedName("fq.u")
    public static String field2416;

    @ObfuscatedName("fs.r")
    public static class125[] field2430;

    @ObfuscatedName("fs.gi")
    public static int field2433;

    @ObfuscatedName("fs.i")
    public static class265 field2434;

    @ObfuscatedName("fs.f")
    public static int field2436;

    @ObfuscatedName("w.l")
    public static int field245;

    @ObfuscatedName("b.gf")
    public static class287[] field250;

    @ObfuscatedName("gk.h")
    public static class237 field2500;

    @ObfuscatedName("gk.f")
    public static class237 field2501;

    @ObfuscatedName("gk.p")
    public static class206 field2502;

    @ObfuscatedName("gk.g")
    public static class237 field2503;

    @ObfuscatedName("gk.j")
    public static class237 field2504;

    @ObfuscatedName("gk.w")
    public static int field2505;

    @ObfuscatedName("gk.b")
    public static int field2506;

    @ObfuscatedName("gk.m")
    public static class211 field2507;

    @ObfuscatedName("gk.i")
    public static class114 field2510;

    @ObfuscatedName("hm.i")
    public static class218 field2581;

    @ObfuscatedName("hf.x")
    public static int[] field2601;

    @ObfuscatedName("hq.dc")
    public static class239 field2607;

    @ObfuscatedName("hq.qm")
    public static short[] field2608;

    @ObfuscatedName("hg.b")
    public static short[][] field2614;

    @ObfuscatedName("hg.l")
    public static short[][] field2617;

    @ObfuscatedName("hg.c")
    public static short[] field2620;

    @ObfuscatedName("hg.w")
    public static short[] field2622;

    @ObfuscatedName("hg.iz")
    public static int field2627;

    @ObfuscatedName("m.pc")
    public static class118 field263;

    @ObfuscatedName("m.ex")
    public static class70 field265;

    @ObfuscatedName("hi.o")
    public static class237 field2667;

    @ObfuscatedName("i.e")
    public static int field268;

    @ObfuscatedName("i.l")
    public static class286 field269;

    @ObfuscatedName("s.z")
    public static String field278;

    @ObfuscatedName("s.fz")
    public static int field279;

    @ObfuscatedName("hz.cs")
    public static char field2808;

    @ObfuscatedName("s.gv")
    public static class287[] field281;

    @ObfuscatedName("r.cj")
    public static class239 field288;

    @ObfuscatedName("x.t")
    public static int[] field29;

    @ObfuscatedName("e.jq")
    public static int field298;

    @ObfuscatedName("e.fu")
    public static byte[][] field299;

    @ObfuscatedName("x.gd")
    public static class286[] field30;

    @ObfuscatedName("e.fg")
    public static int[] field300;

    @ObfuscatedName("a.cp")
    public static boolean field303;

    @ObfuscatedName("a.jg")
    public static int field311;

    @ObfuscatedName("a.iu")
    public static class76 field312;

    @ObfuscatedName("hp.d")
    public static int[] field3137;

    @ObfuscatedName("v.jr")
    public static class91 field319;

    @ObfuscatedName("ha.w")
    public static class286[] field3192;

    @ObfuscatedName("iw.mr")
    public static class158 field3198;

    @ObfuscatedName("io.x")
    public static Thread field3222;

    @ObfuscatedName("ip.s")
    public static class236 field3245;

    @ObfuscatedName("ip.j")
    public static class161 field3247;

    @ObfuscatedName("ip.i")
    public static boolean field3249;

    @ObfuscatedName("ip.f")
    public static long field3253;

    @ObfuscatedName("is.r")
    public static int[][][] field3260;

    @ObfuscatedName("ii.j")
    public static class237 field3269;

    @ObfuscatedName("t.ba")
    public static class233 field327;

    @ObfuscatedName("ix.j")
    public static class237 field3274;

    @ObfuscatedName("ix.g")
    public static int field3275;

    @ObfuscatedName("ie.f")
    public static int field3278;

    @ObfuscatedName("t.g")
    public static class237 field328;

    @ObfuscatedName("ie.h")
    public static class244[] field3285;

    @ObfuscatedName("ie.j")
    public static class237 field3289;

    @ObfuscatedName("ie.aa")
    public static boolean field3298;

    @ObfuscatedName("x.c")
    public static boolean[] field33;

    @ObfuscatedName("iy.g")
    public static class287 field3301;

    @ObfuscatedName("in.j")
    public static class237 field3308;

    @ObfuscatedName("t.h")
    public static class237 field331;

    @ObfuscatedName("iv.h")
    public static class237 field3312;

    @ObfuscatedName("iv.j")
    public static class237 field3313;

    @ObfuscatedName("iu.j")
    public static class237 field3331;

    @ObfuscatedName("ig.j")
    public static class237 field3335;

    @ObfuscatedName("ig.f")
    public static int field3338;

    @ObfuscatedName("ig.h")
    public static class237 field3342;

    @ObfuscatedName("ig.v")
    public static int field3347;

    @ObfuscatedName("id.j")
    public static class237 field3350;

    @ObfuscatedName("id.h")
    public static class237 field3360;

    @ObfuscatedName("ij.j")
    public static class237 field3365;

    @ObfuscatedName("it.j")
    public static class237 field3371;

    @ObfuscatedName("ic.j")
    public static class237 field3376;

    @ObfuscatedName("z.eo")
    public static class161 field338;

    @ObfuscatedName("ik.j")
    public static class237 field3386;

    @ObfuscatedName("ik.cu")
    public static class239 field3387;

    @ObfuscatedName("z.lj")
    public static class218[] field339;

    @ObfuscatedName("iz.j")
    public static class237 field3397;

    @ObfuscatedName("iz.dz")
    public static class239 field3399;

    @ObfuscatedName("ib.h")
    public static class237 field3401;

    @ObfuscatedName("ib.f")
    public static class237 field3402;

    @ObfuscatedName("ib.j")
    public static class237 field3406;

    @ObfuscatedName("ih.h")
    public static class237 field3427;

    @ObfuscatedName("ih.f")
    public static class237 field3428;

    @ObfuscatedName("u.pu")
    public static int field345;

    @ObfuscatedName("u.es")
    public static long field346;

    @ObfuscatedName("if.l")
    public static boolean field3480;

    @ObfuscatedName("k.rr")
    public static int field350;

    @ObfuscatedName("k.pj")
    public static int field351;

    @ObfuscatedName("if.w")
    public static int field3521;

    @ObfuscatedName("k.cw")
    public static long field353;

    @ObfuscatedName("if.ov")
    public static class287 field3532;

    @ObfuscatedName("k.bc")
    public static class291 field355;

    @ObfuscatedName("im.h")
    public static class237 field3566;

    @ObfuscatedName("jf.j")
    public static class237 field3590;

    @ObfuscatedName("jf.f")
    public static class237 field3597;

    @ObfuscatedName("q.kc")
    public static class218 field360;

    @ObfuscatedName("jf.jn")
    public static int field3608;

    @ObfuscatedName("jy.ca")
    public static class161 field3617;

    @ObfuscatedName("jy.de")
    public static class239 field3618;

    @ObfuscatedName("jk.b")
    public static class286[] field3635;

    @ObfuscatedName("je.g")
    public static int[] field3648;

    @ObfuscatedName("je.j")
    public static class167 field3649;

    @ObfuscatedName("jo.w")
    public static class237 field3650;

    @ObfuscatedName("jl.w")
    public static byte[][] field3700;

    @ObfuscatedName("jx.ha")
    public static class218 field3719;

    @ObfuscatedName("ji.ah")
    public static int field3730;

    @ObfuscatedName("d.hv")
    public static class218 field374;

    @ObfuscatedName("jv.dq")
    public static int field3742;

    @ObfuscatedName("jz.an")
    public static int field3744;

    @ObfuscatedName("jz.ar")
    public static int field3745;

    @ObfuscatedName("jz.ao")
    public static int[] field3749;

    @ObfuscatedName("d.dk")
    public static int field378;

    @ObfuscatedName("kc.h")
    public static int field3780;

    @ObfuscatedName("kc.j")
    public static int field3781;

    @ObfuscatedName("kc.p")
    public static int[] field3782;

    @ObfuscatedName("kc.c")
    public static int[] field3783;

    @ObfuscatedName("kc.l")
    public static int[] field3784;

    @ObfuscatedName("d.gp")
    public static int field379;

    @ObfuscatedName("ka.i")
    public static class105 field3888;

    @ObfuscatedName("ax.z")
    public static int[] field400;

    @ObfuscatedName("ao.fs")
    public static class287[] field402;

    @ObfuscatedName("ao.ac")
    public static client field408;

    @ObfuscatedName("an.co")
    public static class239 field422;

    @ObfuscatedName("an.nz")
    public static class77[] field426;

    @ObfuscatedName("ar.qw")
    public static long field430;

    @ObfuscatedName("ar.fm")
    public static byte[][] field432;

    @ObfuscatedName("ar.kk")
    public static int field435;

    @ObfuscatedName("ag.o")
    public static int[] field441;

    @ObfuscatedName("ag.or")
    public static class111 field447;

    @ObfuscatedName("ag.k")
    public static String field448;

    @ObfuscatedName("av.m")
    public static int[] field457;

    @ObfuscatedName("ab.ge")
    public static int field472;

    @ObfuscatedName("ab.gn")
    public static int field473;

    @ObfuscatedName("ab.y")
    public static int[] field474;

    @ObfuscatedName("aj.cy")
    public static class239 field483;

    @ObfuscatedName("ae.fk")
    public static int field499;

    @ObfuscatedName("ae.ix")
    public static int field500;

    @ObfuscatedName("at.ew")
    public static class265 field502;

    @ObfuscatedName("at.by")
    public static class234 field506;

    @ObfuscatedName("at.iy")
    public static int field509;

    @ObfuscatedName("as.fd")
    public static class141 field512;

    @ObfuscatedName("as.gm")
    public static int field514;

    @ObfuscatedName("af.du")
    public static int field523;

    @ObfuscatedName("au.w")
    public static int[][] field531;

    @ObfuscatedName("au.ac")
    public static class287[] field535;

    @ObfuscatedName("az.bk")
    public static class286[] field539;

    @ObfuscatedName("az.i")
    public static int field548;

    @ObfuscatedName("al.e")
    public static class175 field556;

    @ObfuscatedName("am.ae")
    public static Image field564;

    @ObfuscatedName("ap.s")
    public static class218 field583;

    @ObfuscatedName("ad.ff")
    public static int field587;

    @ObfuscatedName("ad.ba")
    public static class286 field591;

    @ObfuscatedName("aw.rp")
    public static class290 field600;

    @ObfuscatedName("aq.b")
    public static class286 field602;

    @ObfuscatedName("aq.cc")
    public static class239 field604;

    @ObfuscatedName("aq.gc")
    public static int field607;

    @ObfuscatedName("aq.ep")
    public static int field608;

    @ObfuscatedName("aq.lc")
    public static int field609;

    @ObfuscatedName("ai.aw")
    public static GarbageCollectorMXBean field619;

    @ObfuscatedName("ai.lw")
    public static int field622;

    @ObfuscatedName("ai.cz")
    public static int field626;

    @ObfuscatedName("ac.gb")
    public static int field633;

    @ObfuscatedName("ac.pd")
    public static int field658;

    @ObfuscatedName("ay.s")
    public static int[] field662;

    @ObfuscatedName("ay.kw")
    public static int field665;

    @ObfuscatedName("bi.fq")
    public static class287 field667;

    @ObfuscatedName("bi.fo")
    public static class287[] field668;

    @ObfuscatedName("by.ow")
    public static class104 field680;

    @ObfuscatedName("bh.l")
    public static int field696;

    @ObfuscatedName("bh.i")
    public static class160 field700;

    @ObfuscatedName("bh.q")
    public static int field710;

    @ObfuscatedName("bh.j")
    public static class156 field722;

    @ObfuscatedName("bw.nn")
    public static byte field729;

    @ObfuscatedName("bw.dg")
    public static class239 field745;

    @ObfuscatedName("bw.pm")
    public static int field749;

    @ObfuscatedName("bj.gu")
    public static class286[] field754;

    @ObfuscatedName("bj.gq")
    public static class287[] field756;

    @ObfuscatedName("bp.w")
    public static int field760;

    @ObfuscatedName("bp.x")
    public static byte[][][] field764;

    @ObfuscatedName("bp.g")
    public static byte[][][] field765;

    @ObfuscatedName("bp.eu")
    public static class265 field766;

    @ObfuscatedName("bp.p")
    public static byte[][][] field767;

    @ObfuscatedName("bp.b")
    public static int[] field769;

    @ObfuscatedName("bp.bp")
    public static String field778;

    @ObfuscatedName("bp.az")
    public static String field779;

    @ObfuscatedName("bp.qb")
    public static class14 field780;

    @ObfuscatedName("bp.c")
    public static byte[][][] field781;

    @ObfuscatedName("bp.l")
    public static byte[][][] field785;

    @ObfuscatedName("bu.cb")
    public static class239 field788;

    @ObfuscatedName("bg.py")
    public static int field803;

    @ObfuscatedName("bd.bb")
    public static int field822;

    @ObfuscatedName("bq.la")
    public static int field831;

    @ObfuscatedName("bq.b")
    public static class113 field832;

    @ObfuscatedName("be.b")
    public static class84 field835;

    @ObfuscatedName("bl.l")
    public static ScheduledExecutorService field843;

    @ObfuscatedName("bl.da")
    public static int field844;

    @ObfuscatedName("bt.cg")
    public static class155 field851;

    @ObfuscatedName("bo.ax")
    public static int[] field872;

    @ObfuscatedName("bo.fi")
    public static int[] field873;

    @ObfuscatedName("bf.hc")
    public static class218 field880;

    @ObfuscatedName("bv.kx")
    public static int field893;

    @ObfuscatedName("bz.pa")
    public static int field916;

    @ObfuscatedName("bz.fp")
    public static int[][] field925;

    @ObfuscatedName("br.qv")
    public static class162 field930;

    @ObfuscatedName("client.ce")
    public static class155 field963;

    @ObfuscatedName("client.cl")
    public static class239 field966;

    @ObfuscatedName("cf.j(IIS)I")
    public static int method1406(int arg0, int arg1) {
        if (arg1 > arg0) {
            int var2 = arg0;
            arg0 = arg1;
            arg1 = var2;
        }
        while (arg1 != 0) {
            int var3 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var3;
        }
        return arg0;
    }

    @ObfuscatedName("cy.j(IIS)I")
    public static int method1624(int arg0, int arg1) {
        class64 var2 = (class64) class64.field799.method3281((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field797.length) {
            return var2.field797[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cv.j(IB)Ljava/lang/String;")
    public static String method1570(int arg0) {
        return "<img=" + arg0 + ">";
    }

    @ObfuscatedName("ei.j(ILfx;Lil;I)V")
    public static void method2681(int arg0, class162 arg1, class239 arg2) {
        class235 var3 = new class235();
        var3.field3197 = 1;
        var3.field2469 = (long) arg0;
        var3.field3194 = arg1;
        var3.field3196 = arg2;
        class195 var4 = class238.field3225;
        synchronized (class238.field3225) {
            class238.field3225.method3317(var3);
        }
        class238.method3761();
    }

    @ObfuscatedName("fx.h(II)I")
    public static int method2764(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("ac.h(ILfx;Lil;B)V")
    public static void method696(int arg0, class162 arg1, class239 arg2) {
        byte[] var3 = null;
        class195 var4 = class238.field3225;
        synchronized (class238.field3225) {
            for (class235 var5 = (class235) class238.field3225.method3326(); var5 != null; var5 = (class235) class238.field3225.method3323()) {
                if ((long) arg0 == var5.field2469 && var5.field3194 == arg1 && var5.field3197 == 0) {
                    var3 = var5.field3195;
                    break;
                }
            }
        }
        if (var3 == null) {
            byte[] var7 = arg1.method2771(arg0);
            arg2.method3886(arg1, arg0, var7, true);
        } else {
            arg2.method3886(arg1, arg0, var3, true);
        }
    }

    @ObfuscatedName("cd.j(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static void method1698(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = class154.method1635(arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var2 = var2 + " | ";
                }
                var2 = var2 + arg0;
            }
            System.out.println("Error: " + var2);
            String var3 = var2.replace(':', '.');
            String var4 = var3.replace('@', '_');
            String var5 = var4.replace('&', '_');
            String var6 = var5.replace('#', '_');
            if (field2225 == null) {
                return;
            }
            URL var7 = new URL(field2225.getCodeBase(), "clienterror.ws?c=" + field1420 + "&u=" + field2217 + "&v1=" + field2237 + "&v2=" + field2236 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("hv.h(IB)Lib;")
    public static class256 method3763(int arg0) {
        class256 var1 = (class256) class256.field3403.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3406.method3773(32, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4156(new class175(var2));
        }
        class256.field3403.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hl.p(I)I")
    public static int method3731() {
        return ++class60.field730 - 1;
    }

    @ObfuscatedName("eb.l([BIILez;[Lfc;B)V")
    public static final void method2298(byte[] arg0, int arg1, int arg2, class141 arg3, class163[] arg4) {
        class175 var5 = new class175(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method3013();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method3013();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method2903();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((class62.field761[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class163 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    class62.method1567(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("iq.o(I)[Ljr;")
    public static class286[] method4304() {
        class286[] var0 = new class286[field3781];
        for (int var1 = 0; var1 < field3781; var1++) {
            class286 var2 = var0[var1] = new class286();
            var2.field3766 = field3780;
            var2.field3767 = field2436;
            var2.field3764 = field3782[var1];
            var2.field3763 = field2601[var1];
            var2.field3762 = field3648[var1];
            var2.field3765 = field3783[var1];
            var2.field3760 = field3784;
            var2.field3761 = field3700[var1];
        }
        field3782 = null;
        field2601 = null;
        field3648 = null;
        field3783 = null;
        field3784 = null;
        field3700 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("f.w([BIIIIIIILez;[Lfc;I)V")
    public static final void method4(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class141 arg8, class163[] arg9) {
        class175 var10 = new class175(arg0);
        int var11 = -1;
        while (true) {
            int var12 = var10.method3013();
            if (var12 == 0) {
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method3013();
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method2903();
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg4 == var17 && var16 >= arg5 && var16 < arg5 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                    class257 var21 = class257.method483(var11);
                    int var22 = arg2 + class217.method1453(var16 & 0x7, var15 & 0x7, arg7, var21.field3442, var21.field3443, var20);
                    int var24 = var16 & 0x7;
                    int var25 = var15 & 0x7;
                    int var27 = var21.field3442;
                    int var28 = var21.field3443;
                    if ((var20 & 0x1) == 1) {
                        int var29 = var27;
                        var27 = var28;
                        var28 = var29;
                    }
                    int var30 = arg7 & 0x3;
                    int var31;
                    if (var30 == 0) {
                        var31 = var25;
                    } else if (var30 == 1) {
                        var31 = 7 - var24 - (var27 - 1);
                    } else if (var30 == 2) {
                        var31 = 7 - var25 - (var28 - 1);
                    } else {
                        var31 = var24;
                    }
                    int var32 = arg3 + var31;
                    if (var22 > 0 && var32 > 0 && var22 < 103 && var32 < 103) {
                        int var33 = arg1;
                        if ((class62.field761[1][var22][var32] & 0x2) == 2) {
                            var33 = arg1 - 1;
                        }
                        class163 var34 = null;
                        if (var33 >= 0) {
                            var34 = arg9[var33];
                        }
                        class62.method1567(arg1, var22, var32, var11, arg7 + var20 & 0x3, var19, arg8, var34);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cq.t(III)I")
    public static final int method1580(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("bw.er(IS)V")
    public static void method953(int arg0) {
        if (client.field942 == arg0) {
            return;
        }
        if (client.field942 == 0) {
            field408.method804();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            client.field968 = 0;
            client.field969 = 0;
            client.field970 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && field338 != null) {
            field338.method2745();
            field338 = null;
        }
        if (client.field942 == 25) {
            client.field996 = 0;
            client.field992 = 0;
            client.field993 = 1;
            client.field982 = 0;
            client.field1092 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class94.method1037(field745, field2410, true, 0);
        } else if (arg0 == 20) {
            class94.method1037(field745, field2410, true, client.field942 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class94.method1037(field745, field2410, false, 4);
        } else {
            class94.method1574();
        }
        client.field942 = arg0;
    }

    @ObfuscatedName("cf.v(ILcj;ZI)I")
    public static int method1411(int arg0, class101 arg1, boolean arg2) {
        if (arg0 == 5000) {
            class85.field1347[++field1348 - 1] = client.field1098;
            return 1;
        } else if (arg0 == 5001) {
            field1348 -= 3;
            client.field1098 = class85.field1347[field1348];
            int var3 = class85.field1347[field1348 + 1];
            class278[] var4 = new class278[] { class278.field3721, class278.field3720, class278.field3723 };
            class278[] var5 = var4;
            int var6 = 0;
            class278 var8;
            while (true) {
                if (var6 >= var5.length) {
                    var8 = null;
                    break;
                }
                class278 var7 = var5[var6];
                if (var7.field3722 == var3) {
                    var8 = var7;
                    break;
                }
                var6++;
            }
            field1489 = var8;
            if (field1489 == null) {
                field1489 = class278.field3720;
            }
            client.field1192 = class85.field1347[field1348 + 2];
            client.field978.method3139(125);
            client.field978.method2888(client.field1098);
            client.field978.method2888(field1489.field3722);
            client.field978.method2888(client.field1192);
            return 1;
        } else if (arg0 == 5002) {
            String var9 = class85.field1351[--field1416];
            field1348 -= 2;
            int var10 = class85.field1347[field1348];
            int var11 = class85.field1347[field1348 + 1];
            client.field978.method3139(31);
            client.field978.method2888(class175.method2869(var9) + 2);
            client.field978.method2894(var9);
            client.field978.method2888(var10 - 1);
            client.field978.method2888(var11);
            return 1;
        } else if (arg0 == 5003) {
            field1348 -= 2;
            int var12 = class85.field1347[field1348];
            int var13 = class85.field1347[field1348 + 1];
            class103 var14 = (class103) class100.field1530.get(var12);
            class74 var15 = var14.method1725(var13);
            if (var15 == null) {
                class85.field1347[++field1348 - 1] = -1;
                class85.field1347[++field1348 - 1] = 0;
                class85.field1351[++field1416 - 1] = "";
                class85.field1351[++field1416 - 1] = "";
                class85.field1351[++field1416 - 1] = "";
            } else {
                class85.field1347[++field1348 - 1] = var15.field892;
                class85.field1347[++field1348 - 1] = var15.field888;
                class85.field1351[++field1416 - 1] = var15.field887 == null ? "" : var15.field887;
                class85.field1351[++field1416 - 1] = var15.field884 == null ? "" : var15.field884;
                class85.field1351[++field1416 - 1] = var15.field889 == null ? "" : var15.field889;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var17 = class85.field1347[--field1348];
            class74 var18 = (class74) class100.field1531.method3232((long) var17);
            if (var18 == null) {
                class85.field1347[++field1348 - 1] = -1;
                class85.field1347[++field1348 - 1] = 0;
                class85.field1351[++field1416 - 1] = "";
                class85.field1351[++field1416 - 1] = "";
                class85.field1351[++field1416 - 1] = "";
            } else {
                class85.field1347[++field1348 - 1] = var18.field886;
                class85.field1347[++field1348 - 1] = var18.field888;
                class85.field1351[++field1416 - 1] = var18.field887 == null ? "" : var18.field887;
                class85.field1351[++field1416 - 1] = var18.field884 == null ? "" : var18.field884;
                class85.field1351[++field1416 - 1] = var18.field889 == null ? "" : var18.field889;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (field1489 == null) {
                class85.field1347[++field1348 - 1] = -1;
            } else {
                class85.field1347[++field1348 - 1] = field1489.field3722;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var20 = class85.field1351[--field1416];
            int var21 = class85.field1347[--field1348];
            String var22 = var20.toLowerCase();
            byte var23 = 0;
            if (var22.startsWith(class227.field3027)) {
                var23 = 0;
                var20 = var20.substring(class227.field3027.length());
            } else if (var22.startsWith(class227.field3029)) {
                var23 = 1;
                var20 = var20.substring(class227.field3029.length());
            } else if (var22.startsWith(class227.field3031)) {
                var23 = 2;
                var20 = var20.substring(class227.field3031.length());
            } else if (var22.startsWith(class227.field3033)) {
                var23 = 3;
                var20 = var20.substring(class227.field3033.length());
            } else if (var22.startsWith(class227.field2907)) {
                var23 = 4;
                var20 = var20.substring(class227.field2907.length());
            } else if (var22.startsWith(class227.field3059)) {
                var23 = 5;
                var20 = var20.substring(class227.field3059.length());
            } else if (var22.startsWith(class227.field3039)) {
                var23 = 6;
                var20 = var20.substring(class227.field3039.length());
            } else if (var22.startsWith(class227.field2910)) {
                var23 = 7;
                var20 = var20.substring(class227.field2910.length());
            } else if (var22.startsWith(class227.field3043)) {
                var23 = 8;
                var20 = var20.substring(class227.field3043.length());
            } else if (var22.startsWith(class227.field2950)) {
                var23 = 9;
                var20 = var20.substring(class227.field2950.length());
            } else if (var22.startsWith(class227.field3047)) {
                var23 = 10;
                var20 = var20.substring(class227.field3047.length());
            } else if (var22.startsWith(class227.field3075)) {
                var23 = 11;
                var20 = var20.substring(class227.field3075.length());
            } else if (client.field940 != 0) {
                if (var22.startsWith(class227.field3098)) {
                    var23 = 0;
                    var20 = var20.substring(class227.field3098.length());
                } else if (var22.startsWith(class227.field2851)) {
                    var23 = 1;
                    var20 = var20.substring(class227.field2851.length());
                } else if (var22.startsWith(class227.field3032)) {
                    var23 = 2;
                    var20 = var20.substring(class227.field3032.length());
                } else if (var22.startsWith(class227.field3123)) {
                    var23 = 3;
                    var20 = var20.substring(class227.field3123.length());
                } else if (var22.startsWith(class227.field3036)) {
                    var23 = 4;
                    var20 = var20.substring(class227.field3036.length());
                } else if (var22.startsWith(class227.field2860)) {
                    var23 = 5;
                    var20 = var20.substring(class227.field2860.length());
                } else if (var22.startsWith(class227.field3083)) {
                    var23 = 6;
                    var20 = var20.substring(class227.field3083.length());
                } else if (var22.startsWith(class227.field3042)) {
                    var23 = 7;
                    var20 = var20.substring(class227.field3042.length());
                } else if (var22.startsWith(class227.field3044)) {
                    var23 = 8;
                    var20 = var20.substring(class227.field3044.length());
                } else if (var22.startsWith(class227.field3046)) {
                    var23 = 9;
                    var20 = var20.substring(class227.field3046.length());
                } else if (var22.startsWith(class227.field3048)) {
                    var23 = 10;
                    var20 = var20.substring(class227.field3048.length());
                } else if (var22.startsWith(class227.field3050)) {
                    var23 = 11;
                    var20 = var20.substring(class227.field3050.length());
                }
            }
            String var24 = var20.toLowerCase();
            byte var25 = 0;
            if (var24.startsWith(class227.field2922)) {
                var25 = 1;
                var20 = var20.substring(class227.field2922.length());
            } else if (var24.startsWith(class227.field3053)) {
                var25 = 2;
                var20 = var20.substring(class227.field3053.length());
            } else if (var24.startsWith(class227.field2854)) {
                var25 = 3;
                var20 = var20.substring(class227.field2854.length());
            } else if (var24.startsWith(class227.field3057)) {
                var25 = 4;
                var20 = var20.substring(class227.field3057.length());
            } else if (var24.startsWith(class227.field3041)) {
                var25 = 5;
                var20 = var20.substring(class227.field3041.length());
            } else if (client.field940 != 0) {
                if (var24.startsWith(class227.field3052)) {
                    var25 = 1;
                    var20 = var20.substring(class227.field3052.length());
                } else if (var24.startsWith(class227.field3054)) {
                    var25 = 2;
                    var20 = var20.substring(class227.field3054.length());
                } else if (var24.startsWith(class227.field3056)) {
                    var25 = 3;
                    var20 = var20.substring(class227.field3056.length());
                } else if (var24.startsWith(class227.field2908)) {
                    var25 = 4;
                    var20 = var20.substring(class227.field2908.length());
                } else if (var24.startsWith(class227.field3122)) {
                    var25 = 5;
                    var20 = var20.substring(class227.field3122.length());
                }
            }
            client.field978.method3139(140);
            client.field978.method2888(0);
            int var26 = client.field978.field2394;
            client.field978.method2888(var21);
            client.field978.method2888(var23);
            client.field978.method2888(var25);
            class267.method3993(client.field978, var20);
            client.field978.method2900(client.field978.field2394 - var26);
            return 1;
        } else if (arg0 == 5009) {
            field1416 -= 2;
            String var27 = class85.field1351[field1416];
            String var28 = class85.field1351[field1416 + 1];
            client.field978.method3139(71);
            client.field978.method3030(0);
            int var29 = client.field978.field2394;
            client.field978.method2894(var27);
            class267.method3993(client.field978, var28);
            client.field978.method2899(client.field978.field2394 - var29);
            return 1;
        } else if (arg0 == 5015) {
            String var30;
            if (field312 == null || field312.field915 == null) {
                var30 = "";
            } else {
                var30 = field312.field915;
            }
            class85.field1351[++field1416 - 1] = var30;
            return 1;
        } else if (arg0 == 5016) {
            class85.field1347[++field1348 - 1] = client.field1192;
            return 1;
        } else if (arg0 == 5017) {
            int var31 = class85.field1347[--field1348];
            class85.field1347[++field1348 - 1] = class100.method1660(var31);
            return 1;
        } else if (arg0 == 5018) {
            int var32 = class85.field1347[--field1348];
            int[] var33 = class85.field1347;
            int var34 = ++field1348 - 1;
            class74 var35 = (class74) class100.field1531.method3232((long) var32);
            int var36;
            if (var35 == null) {
                var36 = -1;
            } else if (class100.field1532.field2488 == var35.field2473) {
                var36 = -1;
            } else {
                var36 = ((class74) var35.field2473).field892;
            }
            var33[var34] = var36;
            return 1;
        } else if (arg0 == 5019) {
            int var37 = class85.field1347[--field1348];
            int[] var38 = class85.field1347;
            int var39 = ++field1348 - 1;
            class74 var40 = (class74) class100.field1531.method3232((long) var37);
            int var41;
            if (var40 == null) {
                var41 = -1;
            } else if (class100.field1532.field2488 == var40.field2474) {
                var41 = -1;
            } else {
                var41 = ((class74) var40.field2474).field892;
            }
            var38[var39] = var41;
            return 1;
        } else if (arg0 == 5020) {
            String var42 = class85.field1351[--field1416];
            if (var42.equalsIgnoreCase("toggleroof")) {
                field22.field1315 = !field22.field1315;
                class82.method333();
                if (field22.field1315) {
                    class100.method1553(99, "", "Roofs are now all hidden");
                } else {
                    class100.method1553(99, "", "Roofs will only be removed selectively");
                }
            }
            if (var42.equalsIgnoreCase("displayfps")) {
                client.field1141 = !client.field1141;
            }
            if (client.field1094 >= 2) {
                if (var42.equalsIgnoreCase("aabb")) {
                    if (!class8.field228) {
                        class8.field228 = true;
                        class8.field231 = class12.field264;
                    } else if (class8.field231 == class12.field264) {
                        class8.field228 = true;
                        class8.field231 = class12.field266;
                    } else {
                        class8.field228 = false;
                    }
                }
                if (var42.equalsIgnoreCase("fpson")) {
                    client.field1141 = true;
                }
                if (var42.equalsIgnoreCase("fpsoff")) {
                    client.field1141 = false;
                }
                if (var42.equalsIgnoreCase("gc")) {
                    System.gc();
                }
                if (var42.equalsIgnoreCase("clientdrop")) {
                    if (client.field988 > 0) {
                        client.method335();
                    } else {
                        method953(40);
                        field338 = field2012;
                        field2012 = null;
                    }
                }
                if (var42.equalsIgnoreCase("errortest") && client.field1183 == 2) {
                    throw new RuntimeException();
                }
            }
            client.field978.method3139(233);
            client.field978.method2888(var42.length() + 1);
            client.field978.method2894(var42);
            return 1;
        } else if (arg0 == 5021) {
            client.field1145 = class85.field1351[--field1416].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            class85.field1351[++field1416 - 1] = client.field1145;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ex.ia([Lhi;IIIIIIII)V")
    public static final void method2679(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class218 var9 = arg0[var8];
            if (var9 != null && (!var9.field2756 || var9.field2652 == 0 || var9.field2761 || client.method4398(var9) != 0 || client.field1174 == var9 || var9.field2654 == 1338) && var9.field2681 == arg1 && (!var9.field2756 || !client.method2669(var9))) {
                int var10 = var9.field2663 + arg6;
                int var11 = var9.field2664 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2652 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2652 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2665 + var10;
                    int var19 = var9.field2666 + var11;
                    if (var18 < var10) {
                        var16 = var18;
                        var18 = var10;
                    }
                    if (var19 < var11) {
                        var17 = var19;
                        var19 = var11;
                    }
                    var18++;
                    var19++;
                    var12 = var16 > arg2 ? var16 : arg2;
                    var13 = var17 > arg3 ? var17 : arg3;
                    var14 = var18 < arg4 ? var18 : arg4;
                    var15 = var19 < arg5 ? var19 : arg5;
                } else {
                    int var22 = var9.field2665 + var10;
                    int var23 = var9.field2666 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (client.field1108 == var9) {
                    client.field1100 = true;
                    client.field949 = var10;
                    client.field1110 = var11;
                }
                if (!var9.field2756 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field735;
                    int var25 = class60.field736 * -261504029;
                    if (class60.field741 != 0) {
                        var24 = class60.field742;
                        var25 = class60.field743;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2654 == 1337) {
                        if (!client.field943 && !client.field1064 && var26) {
                            if (client.field1080 == 0 && !client.field1082) {
                                client.method1723(class227.field3006, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var27 = -1;
                            int var28 = -1;
                            for (int var29 = 0; var29 < class136.field1998; var29++) {
                                int var30 = class136.field2003[var29];
                                int var31 = var30 & 0x7F;
                                int var32 = var30 >> 7 & 0x7F;
                                int var33 = var30 >> 29 & 0x3;
                                int var34 = var30 >> 14 & 0x7FFF;
                                if (var28 != var30) {
                                    var28 = var30;
                                    if (var33 == 2 && field512.method2602(field509, var31, var32, var30) >= 0) {
                                        class257 var35 = class257.method483(var34);
                                        if (var35.field3468 != null) {
                                            var35 = var35.method4210();
                                        }
                                        if (var35 == null) {
                                            continue;
                                        }
                                        if (client.field1080 == 1) {
                                            client.method1723(class227.field3004, client.field1085 + " " + class90.field1401 + " " + class90.method2296(65535) + var35.field3437, 1, var30, var31, var32);
                                        } else if (!client.field1082) {
                                            String[] var36 = var35.field3441;
                                            if (client.field1028) {
                                                var36 = client.method2742(var36);
                                            }
                                            if (var36 != null) {
                                                for (int var37 = 4; var37 >= 0; var37--) {
                                                    if (var36[var37] != null) {
                                                        short var38 = 0;
                                                        if (var37 == 0) {
                                                            var38 = 3;
                                                        }
                                                        if (var37 == 1) {
                                                            var38 = 4;
                                                        }
                                                        if (var37 == 2) {
                                                            var38 = 5;
                                                        }
                                                        if (var37 == 3) {
                                                            var38 = 6;
                                                        }
                                                        if (var37 == 4) {
                                                            var38 = 1001;
                                                        }
                                                        client.method1723(var36[var37], class90.method2296(65535) + var35.field3437, var38, var30, var31, var32);
                                                    }
                                                }
                                            }
                                            client.method1723(class227.field3002, class90.method2296(65535) + var35.field3437, 1002, var35.field3462 << 14, var31, var32);
                                        } else if ((field665 & 0x4) == 4) {
                                            client.method1723(client.field994, client.field1086 + " " + class90.field1401 + " " + class90.method2296(65535) + var35.field3437, 2, var30, var31, var32);
                                        }
                                    }
                                    if (var33 == 1) {
                                        class88 var39 = client.field973[var34];
                                        if (var39 == null) {
                                            continue;
                                        }
                                        if (var39.field1382.field3544 == 1 && (var39.field1262 & 0x7F) == 64 && (var39.field1259 & 0x7F) == 64) {
                                            for (int var40 = 0; var40 < client.field959; var40++) {
                                                class88 var41 = client.field973[client.field1158[var40]];
                                                if (var41 != null && var39 != var41 && var41.field1382.field3544 == 1 && var39.field1262 == var41.field1262 && var39.field1259 == var41.field1259) {
                                                    client.method562(var41.field1382, client.field1158[var40], var31, var32);
                                                }
                                            }
                                            int var42 = class98.field1511;
                                            int[] var43 = class98.field1512;
                                            for (int var44 = 0; var44 < var42; var44++) {
                                                class76 var45 = client.field1046[var43[var44]];
                                                if (var45 != null && var39.field1262 == var45.field1262 && var39.field1259 == var45.field1259) {
                                                    client.method2738(var45, var43[var44], var31, var32);
                                                }
                                            }
                                        }
                                        client.method562(var39.field1382, var34, var31, var32);
                                    }
                                    if (var33 == 0) {
                                        class76 var46 = client.field1046[var34];
                                        if (var46 == null) {
                                            continue;
                                        }
                                        if ((var46.field1262 & 0x7F) == 64 && (var46.field1259 & 0x7F) == 64) {
                                            for (int var47 = 0; var47 < client.field959; var47++) {
                                                class88 var48 = client.field973[client.field1158[var47]];
                                                if (var48 != null && var48.field1382.field3544 == 1 && var46.field1262 == var48.field1262 && var46.field1259 == var48.field1259) {
                                                    client.method562(var48.field1382, client.field1158[var47], var31, var32);
                                                }
                                            }
                                            int var49 = class98.field1511;
                                            int[] var50 = class98.field1512;
                                            for (int var51 = 0; var51 < var49; var51++) {
                                                class76 var52 = client.field1046[var50[var51]];
                                                if (var52 != null && var46 != var52 && var46.field1262 == var52.field1262 && var46.field1259 == var52.field1259) {
                                                    client.method2738(var52, var50[var51], var31, var32);
                                                }
                                            }
                                        }
                                        if (client.field1055 == var34) {
                                            var27 = var30;
                                        } else {
                                            client.method2738(var46, var34, var31, var32);
                                        }
                                    }
                                    if (var33 == 3) {
                                        class195 var53 = client.field1056[field509][var31][var32];
                                        if (var53 != null) {
                                            for (class96 var54 = (class96) var53.method3322(); var54 != null; var54 = (class96) var53.method3324()) {
                                                class258 var55 = class258.method1923(var54.field1497);
                                                if (client.field1080 == 1) {
                                                    client.method1723(class227.field3004, client.field1085 + " " + class90.field1401 + " " + class90.method2296(16748608) + var55.field3487, 16, var54.field1497, var31, var32);
                                                } else if (!client.field1082) {
                                                    String[] var56 = var55.field3501;
                                                    if (client.field1028) {
                                                        var56 = client.method2742(var56);
                                                    }
                                                    for (int var57 = 4; var57 >= 0; var57--) {
                                                        if (var56 != null && var56[var57] != null) {
                                                            byte var58 = 0;
                                                            if (var57 == 0) {
                                                                var58 = 18;
                                                            }
                                                            if (var57 == 1) {
                                                                var58 = 19;
                                                            }
                                                            if (var57 == 2) {
                                                                var58 = 20;
                                                            }
                                                            if (var57 == 3) {
                                                                var58 = 21;
                                                            }
                                                            if (var57 == 4) {
                                                                var58 = 22;
                                                            }
                                                            client.method1723(var56[var57], class90.method2296(16748608) + var55.field3487, var58, var54.field1497, var31, var32);
                                                        } else if (var57 == 2) {
                                                            client.method1723(class227.field2852, class90.method2296(16748608) + var55.field3487, 20, var54.field1497, var31, var32);
                                                        }
                                                    }
                                                    client.method1723(class227.field3002, class90.method2296(16748608) + var55.field3487, 1004, var54.field1497, var31, var32);
                                                } else if ((field665 & 0x1) == 1) {
                                                    client.method1723(client.field994, client.field1086 + " " + class90.field1401 + " " + class90.method2296(16748608) + var55.field3487, 17, var54.field1497, var31, var32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var27 != -1) {
                                int var59 = var27 & 0x7F;
                                int var60 = var27 >> 7 & 0x7F;
                                class76 var61 = client.field1046[client.field1055];
                                client.method2738(var61, client.field1055, var59, var60);
                            }
                        }
                    } else if (var9.field2654 == 1338) {
                        client.method1073(var9, var10, var11);
                    } else {
                        if (var9.field2654 == 1400) {
                            field600.method4908(class60.field735, class60.field736 * -261504029, var26, var10, var11, var9.field2665, var9.field2666);
                        }
                        if (!client.field1064 && var26) {
                            if (var9.field2654 == 1400) {
                                field600.method4898(var10, var11, var9.field2665, var9.field2666, var24, var25);
                            } else {
                                int var62 = var24 - var10;
                                int var63 = var25 - var11;
                                if (var9.field2653 == 1) {
                                    client.method1723(var9.field2767, "", 24, 0, 0, var9.field2723);
                                }
                                if (var9.field2653 == 2 && !client.field1082) {
                                    String var64 = client.method2668(var9);
                                    if (var64 != null) {
                                        client.method1723(var64, class90.method2296(65280) + var9.field2766, 25, 0, -1, var9.field2723);
                                    }
                                }
                                if (var9.field2653 == 3) {
                                    client.method1723(class227.field3010, "", 26, 0, 0, var9.field2723);
                                }
                                if (var9.field2653 == 4) {
                                    client.method1723(var9.field2767, "", 28, 0, 0, var9.field2723);
                                }
                                if (var9.field2653 == 5) {
                                    client.method1723(var9.field2767, "", 29, 0, 0, var9.field2723);
                                }
                                if (var9.field2653 == 6 && client.field1091 == null) {
                                    client.method1723(var9.field2767, "", 30, 0, -1, var9.field2723);
                                }
                                if (var9.field2652 == 2) {
                                    int var65 = 0;
                                    for (int var66 = 0; var66 < var9.field2666; var66++) {
                                        for (int var67 = 0; var67 < var9.field2665; var67++) {
                                            int var68 = (var9.field2716 + 32) * var67;
                                            int var69 = (var9.field2717 + 32) * var66;
                                            if (var65 < 20) {
                                                var68 += var9.field2718[var65];
                                                var69 += var9.field2719[var65];
                                            }
                                            if (var62 >= var68 && var63 >= var69 && var62 < var68 + 32 && var63 < var69 + 32) {
                                                client.field1147 = var65;
                                                field3719 = var9;
                                                if (var9.field2650[var65] > 0) {
                                                    class258 var70 = class258.method1923(var9.field2650[var65] - 1);
                                                    if (client.field1080 == 1 && class219.method467(client.method4398(var9))) {
                                                        if (field500 != var9.field2723 || field893 != var65) {
                                                            client.method1723(class227.field3004, client.field1085 + " " + class90.field1401 + " " + class90.method2296(16748608) + var70.field3487, 31, var70.field3527, var65, var9.field2723);
                                                        }
                                                    } else if (!client.field1082 || !class219.method467(client.method4398(var9))) {
                                                        String[] var71 = var70.field3478;
                                                        if (client.field1028) {
                                                            String[] var72 = client.method2742(var71);
                                                        }
                                                        int var73 = -1;
                                                        if (client.field1075 && class51.field643[81]) {
                                                            var73 = var70.method4260();
                                                        }
                                                        if (class219.method467(client.method4398(var9))) {
                                                            for (int var74 = 4; var74 >= 3; var74--) {
                                                                if (var73 != var74) {
                                                                    client.method476(var9, var70, var65, var74, false);
                                                                }
                                                            }
                                                        }
                                                        if (class219.method3749(client.method4398(var9))) {
                                                            client.method1723(class227.field3004, class90.method2296(16748608) + var70.field3487, 38, var70.field3527, var65, var9.field2723);
                                                        }
                                                        if (class219.method467(client.method4398(var9))) {
                                                            for (int var75 = 2; var75 >= 0; var75--) {
                                                                if (var73 != var75) {
                                                                    client.method476(var9, var70, var65, var75, false);
                                                                }
                                                            }
                                                            if (var73 >= 0) {
                                                                client.method476(var9, var70, var65, var73, true);
                                                            }
                                                        }
                                                        String[] var76 = var9.field2721;
                                                        if (client.field1028) {
                                                            var76 = client.method2742(var76);
                                                        }
                                                        if (var76 != null) {
                                                            for (int var77 = 4; var77 >= 0; var77--) {
                                                                if (var76[var77] != null) {
                                                                    byte var78 = 0;
                                                                    if (var77 == 0) {
                                                                        var78 = 39;
                                                                    }
                                                                    if (var77 == 1) {
                                                                        var78 = 40;
                                                                    }
                                                                    if (var77 == 2) {
                                                                        var78 = 41;
                                                                    }
                                                                    if (var77 == 3) {
                                                                        var78 = 42;
                                                                    }
                                                                    if (var77 == 4) {
                                                                        var78 = 43;
                                                                    }
                                                                    client.method1723(var76[var77], class90.method2296(16748608) + var70.field3487, var78, var70.field3527, var65, var9.field2723);
                                                                }
                                                            }
                                                        }
                                                        client.method1723(class227.field3002, class90.method2296(16748608) + var70.field3487, 1005, var70.field3527, var65, var9.field2723);
                                                    } else if ((field665 & 0x10) == 16) {
                                                        client.method1723(client.field994, client.field1086 + " " + class90.field1401 + " " + class90.method2296(16748608) + var70.field3487, 32, var70.field3527, var65, var9.field2723);
                                                    }
                                                }
                                            }
                                            var65++;
                                        }
                                    }
                                }
                                if (var9.field2756) {
                                    if (!client.field1082) {
                                        for (int var79 = 9; var79 >= 5; var79--) {
                                            String var80 = client.method28(var9, var79);
                                            if (var80 != null) {
                                                client.method1723(var80, var9.field2689, 1007, var79 + 1, var9.field2698, var9.field2723);
                                            }
                                        }
                                        String var81 = client.method2668(var9);
                                        if (var81 != null) {
                                            client.method1723(var81, var9.field2689, 25, 0, var9.field2698, var9.field2723);
                                        }
                                        for (int var82 = 4; var82 >= 0; var82--) {
                                            String var83 = client.method28(var9, var82);
                                            if (var83 != null) {
                                                client.method1723(var83, var9.field2689, 57, var82 + 1, var9.field2698, var9.field2723);
                                            }
                                        }
                                        if (class219.method3136(client.method4398(var9))) {
                                            client.method1723(class227.field2857, "", 30, 0, var9.field2698, var9.field2723);
                                        }
                                    } else if (class219.method149(client.method4398(var9)) && (field665 & 0x20) == 32) {
                                        client.method1723(client.field994, client.field1086 + " " + class90.field1401 + " " + var9.field2689, 58, 0, var9.field2698, var9.field2723);
                                    }
                                }
                            }
                        }
                        if (var9.field2652 == 0) {
                            if (!var9.field2756 && client.method2669(var9) && field13 != var9) {
                                continue;
                            }
                            method2679(arg0, var9.field2723, var12, var13, var14, var15, var10 - var9.field2771, var11 - var9.field2672);
                            if (var9.field2774 != null) {
                                method2679(var9.field2774, var9.field2723, var12, var13, var14, var15, var10 - var9.field2771, var11 - var9.field2672);
                            }
                            class69 var84 = (class69) client.field1088.method3281((long) var9.field2723);
                            if (var84 != null) {
                                if (var84.field839 == 0 && class60.field735 >= var12 && class60.field736 * -261504029 >= var13 && class60.field735 < var14 && class60.field736 * -261504029 < var15 && !client.field1064 && !client.field1097) {
                                    for (class71 var85 = (class71) client.field965.method3326(); var85 != null; var85 = (class71) client.field965.method3323()) {
                                        if (var85.field866) {
                                            var85.method3314();
                                            var85.field856.field2775 = false;
                                        }
                                    }
                                    if (field622 == 0) {
                                        client.field1108 = null;
                                        client.field1174 = null;
                                    }
                                    if (!client.field1064) {
                                        client.method480();
                                    }
                                }
                                client.method3129(var84.field841, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2756) {
                            if (var9.field2759) {
                                if (class60.field735 >= var12 && class60.field736 * -261504029 >= var13 && class60.field735 < var14 && class60.field736 * -261504029 < var15) {
                                    for (class71 var86 = (class71) client.field965.method3326(); var86 != null; var86 = (class71) client.field965.method3323()) {
                                        if (var86.field866) {
                                            var86.method3314();
                                            var86.field856.field2775 = false;
                                        }
                                    }
                                    if (field622 == 0) {
                                        client.field1108 = null;
                                        client.field1174 = null;
                                    }
                                    if (!client.field1064) {
                                        client.method480();
                                    }
                                }
                            } else if (var9.field2733 && class60.field735 >= var12 && class60.field736 * -261504029 >= var13 && class60.field735 < var14 && class60.field736 * -261504029 < var15) {
                                for (class71 var87 = (class71) client.field965.method3326(); var87 != null; var87 = (class71) client.field965.method3323()) {
                                    if (var87.field866 && var87.field856.field2751 == var87.field857) {
                                        var87.method3314();
                                    }
                                }
                            }
                            boolean var88;
                            if (class60.field735 >= var12 && class60.field736 * -261504029 >= var13 && class60.field735 < var14 && class60.field736 * -261504029 < var15) {
                                var88 = true;
                            } else {
                                var88 = false;
                            }
                            boolean var89 = false;
                            if ((class60.field734 == 1 || !field303 && class60.field734 == 4) && var88) {
                                var89 = true;
                            }
                            boolean var90 = false;
                            if ((class60.field741 == 1 || !field303 && class60.field741 == 4) && class60.field742 >= var12 && class60.field743 >= var13 && class60.field742 < var14 && class60.field743 < var15) {
                                var90 = true;
                            }
                            if (var90) {
                                client.method1006(var9, class60.field742 - var10, class60.field743 - var11);
                            }
                            if (var9.field2654 == 1400) {
                                field600.method4853(class60.field735, class60.field736 * -261504029, var88 & var89);
                            }
                            if (client.field1108 != null && client.field1108 != var9 && var88) {
                                int var91 = client.method4398(var9);
                                boolean var92 = (var91 >> 20 & 0x1) != 0;
                                if (var92) {
                                    client.field1186 = var9;
                                }
                            }
                            if (client.field1174 == var9) {
                                client.field1105 = true;
                                client.field1106 = var10;
                                client.field1107 = var11;
                            }
                            if (var9.field2761) {
                                if (var88 && client.field1125 != 0 && var9.field2751 != null) {
                                    class71 var93 = new class71();
                                    var93.field866 = true;
                                    var93.field856 = var9;
                                    var93.field859 = client.field1125;
                                    var93.field857 = var9.field2751;
                                    client.field965.method3317(var93);
                                }
                                if (client.field1108 != null || field374 != null || client.field1064) {
                                    var90 = false;
                                    var89 = false;
                                    var88 = false;
                                }
                                if (!var9.field2651 && var90) {
                                    var9.field2651 = true;
                                    if (var9.field2741 != null) {
                                        class71 var94 = new class71();
                                        var94.field866 = true;
                                        var94.field856 = var9;
                                        var94.field858 = class60.field742 - var10;
                                        var94.field859 = class60.field743 - var11;
                                        var94.field857 = var9.field2741;
                                        client.field965.method3317(var94);
                                    }
                                }
                                if (var9.field2651 && var89 && var9.field2770 != null) {
                                    class71 var95 = new class71();
                                    var95.field866 = true;
                                    var95.field856 = var9;
                                    var95.field858 = class60.field735 - var10;
                                    var95.field859 = class60.field736 * -261504029 - var11;
                                    var95.field857 = var9.field2770;
                                    client.field965.method3317(var95);
                                }
                                if (var9.field2651 && !var89) {
                                    var9.field2651 = false;
                                    if (var9.field2734 != null) {
                                        class71 var96 = new class71();
                                        var96.field866 = true;
                                        var96.field856 = var9;
                                        var96.field858 = class60.field735 - var10;
                                        var96.field859 = class60.field736 * -261504029 - var11;
                                        var96.field857 = var9.field2734;
                                        client.field1128.method3317(var96);
                                    }
                                }
                                if (var89 && var9.field2662 != null) {
                                    class71 var97 = new class71();
                                    var97.field866 = true;
                                    var97.field856 = var9;
                                    var97.field858 = class60.field735 - var10;
                                    var97.field859 = class60.field736 * -261504029 - var11;
                                    var97.field857 = var9.field2662;
                                    client.field965.method3317(var97);
                                }
                                if (!var9.field2775 && var88) {
                                    var9.field2775 = true;
                                    if (var9.field2736 != null) {
                                        class71 var98 = new class71();
                                        var98.field866 = true;
                                        var98.field856 = var9;
                                        var98.field858 = class60.field735 - var10;
                                        var98.field859 = class60.field736 * -261504029 - var11;
                                        var98.field857 = var9.field2736;
                                        client.field965.method3317(var98);
                                    }
                                }
                                if (var9.field2775 && var88 && var9.field2754 != null) {
                                    class71 var99 = new class71();
                                    var99.field866 = true;
                                    var99.field856 = var9;
                                    var99.field858 = class60.field735 - var10;
                                    var99.field859 = class60.field736 * -261504029 - var11;
                                    var99.field857 = var9.field2754;
                                    client.field965.method3317(var99);
                                }
                                if (var9.field2775 && !var88) {
                                    var9.field2775 = false;
                                    if (var9.field2738 != null) {
                                        class71 var100 = new class71();
                                        var100.field866 = true;
                                        var100.field856 = var9;
                                        var100.field858 = class60.field735 - var10;
                                        var100.field859 = class60.field736 * -261504029 - var11;
                                        var100.field857 = var9.field2738;
                                        client.field1128.method3317(var100);
                                    }
                                }
                                if (var9.field2692 != null) {
                                    class71 var101 = new class71();
                                    var101.field856 = var9;
                                    var101.field857 = var9.field2692;
                                    client.field1045.method3317(var101);
                                }
                                if (var9.field2743 != null && client.field962 > var9.field2722) {
                                    if (var9.field2744 == null || client.field962 - var9.field2722 > 32) {
                                        class71 var106 = new class71();
                                        var106.field856 = var9;
                                        var106.field857 = var9.field2743;
                                        client.field965.method3317(var106);
                                    } else {
                                        label960: for (int var102 = var9.field2722; var102 < client.field962; var102++) {
                                            int var103 = client.field1079[var102 & 0x1F];
                                            for (int var104 = 0; var104 < var9.field2744.length; var104++) {
                                                if (var9.field2744[var104] == var103) {
                                                    class71 var105 = new class71();
                                                    var105.field856 = var9;
                                                    var105.field857 = var9.field2743;
                                                    client.field965.method3317(var105);
                                                    break label960;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2722 = client.field962;
                                }
                                if (var9.field2658 != null && client.field1116 > var9.field2779) {
                                    if (var9.field2746 == null || client.field1116 - var9.field2779 > 32) {
                                        class71 var111 = new class71();
                                        var111.field856 = var9;
                                        var111.field857 = var9.field2658;
                                        client.field965.method3317(var111);
                                    } else {
                                        label936: for (int var107 = var9.field2779; var107 < client.field1116; var107++) {
                                            int var108 = client.field1073[var107 & 0x1F];
                                            for (int var109 = 0; var109 < var9.field2746.length; var109++) {
                                                if (var9.field2746[var109] == var108) {
                                                    class71 var110 = new class71();
                                                    var110.field856 = var9;
                                                    var110.field857 = var9.field2658;
                                                    client.field965.method3317(var110);
                                                    break label936;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2779 = client.field1116;
                                }
                                if (var9.field2737 != null && client.field1065 > var9.field2780) {
                                    if (var9.field2677 == null || client.field1065 - var9.field2780 > 32) {
                                        class71 var116 = new class71();
                                        var116.field856 = var9;
                                        var116.field857 = var9.field2737;
                                        client.field965.method3317(var116);
                                    } else {
                                        label912: for (int var112 = var9.field2780; var112 < client.field1065; var112++) {
                                            int var113 = client.field1117[var112 & 0x1F];
                                            for (int var114 = 0; var114 < var9.field2677.length; var114++) {
                                                if (var9.field2677[var114] == var113) {
                                                    class71 var115 = new class71();
                                                    var115.field856 = var9;
                                                    var115.field857 = var9.field2737;
                                                    client.field965.method3317(var115);
                                                    break label912;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2780 = client.field1065;
                                }
                                if (client.field1119 > var9.field2777 && var9.field2752 != null) {
                                    class71 var117 = new class71();
                                    var117.field856 = var9;
                                    var117.field857 = var9.field2752;
                                    client.field965.method3317(var117);
                                }
                                if (client.field1120 > var9.field2777 && var9.field2783 != null) {
                                    class71 var118 = new class71();
                                    var118.field856 = var9;
                                    var118.field857 = var9.field2783;
                                    client.field965.method3317(var118);
                                }
                                if (client.field974 > var9.field2777 && var9.field2755 != null) {
                                    class71 var119 = new class71();
                                    var119.field856 = var9;
                                    var119.field857 = var9.field2755;
                                    client.field965.method3317(var119);
                                }
                                if (client.field1122 > var9.field2777 && var9.field2656 != null) {
                                    class71 var120 = new class71();
                                    var120.field856 = var9;
                                    var120.field857 = var9.field2656;
                                    client.field965.method3317(var120);
                                }
                                if (client.field950 > var9.field2777 && var9.field2760 != null) {
                                    class71 var121 = new class71();
                                    var121.field856 = var9;
                                    var121.field857 = var9.field2760;
                                    client.field965.method3317(var121);
                                }
                                if (client.field1124 > var9.field2777 && var9.field2762 != null) {
                                    class71 var122 = new class71();
                                    var122.field856 = var9;
                                    var122.field857 = var9.field2762;
                                    client.field965.method3317(var122);
                                }
                                var9.field2777 = client.field1112;
                                if (var9.field2753 != null) {
                                    for (int var123 = 0; var123 < client.field1148; var123++) {
                                        class71 var124 = new class71();
                                        var124.field856 = var9;
                                        var124.field862 = client.field961[var123];
                                        var124.field863 = client.field1012[var123];
                                        var124.field857 = var9.field2753;
                                        client.field965.method3317(var124);
                                    }
                                }
                            }
                        }
                        if (!var9.field2756 && client.field1108 == null && field374 == null && !client.field1064) {
                            if ((var9.field2765 >= 0 || var9.field2778 != 0) && class60.field735 >= var12 && class60.field736 * -261504029 >= var13 && class60.field735 < var14 && class60.field736 * -261504029 < var15) {
                                if (var9.field2765 >= 0) {
                                    field13 = arg0[var9.field2765];
                                } else {
                                    field13 = var9;
                                }
                            }
                            if (var9.field2652 == 8 && class60.field735 >= var12 && class60.field736 * -261504029 >= var13 && class60.field735 < var14 && class60.field736 * -261504029 < var15) {
                                field360 = var9;
                            }
                            if (var9.field2674 > var9.field2666) {
                                int var125 = var9.field2665 + var10;
                                int var126 = var9.field2666;
                                int var127 = var9.field2674;
                                int var128 = class60.field735;
                                int var129 = class60.field736 * -261504029;
                                if (client.field1066) {
                                    client.field1008 = 32;
                                } else {
                                    client.field1008 = 0;
                                }
                                client.field1066 = false;
                                if (class60.field734 == 1 || !field303 && class60.field734 == 4) {
                                    if (var128 >= var125 && var128 < var125 + 16 && var129 >= var11 && var129 < var11 + 16) {
                                        var9.field2672 -= 4;
                                        client.method1576(var9);
                                    } else if (var128 >= var125 && var128 < var125 + 16 && var129 >= var11 + var126 - 16 && var129 < var11 + var126) {
                                        var9.field2672 += 4;
                                        client.method1576(var9);
                                    } else if (var128 >= var125 - client.field1008 && var128 < client.field1008 + var125 + 16 && var129 >= var11 + 16 && var129 < var11 + var126 - 16) {
                                        int var130 = (var126 - 32) * var126 / var127;
                                        if (var130 < 8) {
                                            var130 = 8;
                                        }
                                        int var131 = var129 - var11 - 16 - var130 / 2;
                                        int var132 = var126 - 32 - var130;
                                        var9.field2672 = (var127 - var126) * var131 / var132;
                                        client.method1576(var9);
                                        client.field1066 = true;
                                    }
                                }
                                if (client.field1125 != 0) {
                                    int var133 = var9.field2665;
                                    if (var128 >= var125 - var133 && var129 >= var11 && var128 < var125 + 16 && var129 <= var11 + var126) {
                                        var9.field2672 += client.field1125 * 45;
                                        client.method1576(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.it(Lhi;I)Z")
    public static final boolean method502(class218 arg0) {
        int var1 = arg0.field2654;
        if (var1 == 205) {
            client.field988 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            client.field1009.method3639(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            client.field1009.method3657(var4, var5 == 1);
        }
        if (var1 == 324) {
            client.field1009.method3641(false);
        }
        if (var1 == 325) {
            client.field1009.method3641(true);
        }
        if (var1 == 326) {
            client.field978.method3139(23);
            client.field1009.method3652(client.field978);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cn.ja(Lhi;I)Lhi;")
    public static class218 method1460(class218 arg0) {
        int var1 = class219.method1672(client.method4398(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class218.method1532(arg0.field2681);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }
}
