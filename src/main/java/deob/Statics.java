package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

public class Statics {

    @ObfuscatedName("g.q")
    public static byte[][][] field100;

    @ObfuscatedName("bz.s")
    public static int field1000;

    @ObfuscatedName("bz.g")
    public static class53[] field1001;

    @ObfuscatedName("bz.i")
    public static class57[] field1002;

    @ObfuscatedName("bz.v")
    public static class65[] field1003;

    @ObfuscatedName("bz.h")
    public static boolean[] field1005;

    @ObfuscatedName("bz.p")
    public static int[] field1006;

    @ObfuscatedName("bz.a")
    public static class70[] field1007;

    @ObfuscatedName("g.s")
    public static int[] field101;

    @ObfuscatedName("bz.aq")
    public static float[] field1011;

    @ObfuscatedName("bz.m")
    public static float[] field1012;

    @ObfuscatedName("bz.e")
    public static float[] field1013;

    @ObfuscatedName("bz.l")
    public static float[] field1014;

    @ObfuscatedName("bz.c")
    public static int field1015;

    @ObfuscatedName("bz.ap")
    public static float[] field1016;

    @ObfuscatedName("bz.aw")
    public static float[] field1017;

    @ObfuscatedName("bz.as")
    public static int[] field1019;

    @ObfuscatedName("bz.n")
    public static int field1022;

    @ObfuscatedName("bz.q")
    public static byte[] field1023;

    @ObfuscatedName("bh.c")
    public static int[] field1038;

    @ObfuscatedName("bh.s")
    public static int[] field1039;

    @ObfuscatedName("bh.g")
    public static boolean[] field1040;

    @ObfuscatedName("bc.k")
    public static int field1046;

    @ObfuscatedName("bc.r")
    public static class64 field1050;

    @ObfuscatedName("bc.bb")
    public static class223[] field1053;

    @ObfuscatedName("bc.y")
    public static boolean field1058;

    @ObfuscatedName("g.i")
    public static boolean field107;

    @ObfuscatedName("bf.ju")
    public static class151[] field1079;

    @ObfuscatedName("bf.c")
    public static class223 field1080;

    @ObfuscatedName("bf.l")
    public static int[] field1084;

    @ObfuscatedName("bf.qj")
    public static int field1085;

    @ObfuscatedName("bp.pd")
    public static class104 field1094;

    @ObfuscatedName("y.j")
    public static class183 field11;

    @ObfuscatedName("g.bk")
    public static class185 field110;

    @ObfuscatedName("g.ph")
    public static GarbageCollectorMXBean field111;

    @ObfuscatedName("be.fk")
    public static int field1112;

    @ObfuscatedName("be.dl")
    public static class88 field1114;

    @ObfuscatedName("g.w")
    public static byte[][][] field112;

    @ObfuscatedName("bj.d")
    public static float field1135;

    @ObfuscatedName("bj.n")
    public static int field1139;

    @ObfuscatedName("bt.mc")
    public static int field1190;

    @ObfuscatedName("bu.z")
    public static String field1196;

    @ObfuscatedName("bu.h")
    public static String[] field1199;

    @ObfuscatedName("y.d")
    public static class223 field12;

    @ObfuscatedName("i.v")
    public static class73[] field121;

    @ObfuscatedName("bo.dy")
    public static byte[][] field1221;

    @ObfuscatedName("i.qw")
    public static int field124;

    @ObfuscatedName("y.h")
    public static String field13;

    @ObfuscatedName("ch.a")
    public static int[] field1316;

    @ObfuscatedName("ct.qs")
    public static Frame field1352;

    @ObfuscatedName("cu.bb")
    public static int field1402;

    @ObfuscatedName("cu.bz")
    public static int field1405;

    @ObfuscatedName("cu.bm")
    public static int field1406;

    @ObfuscatedName("ck.nt")
    public static int field1423;

    @ObfuscatedName("ck.dc")
    public static int[] field1424;

    @ObfuscatedName("ck.hm")
    public static class24 field1425;

    @ObfuscatedName("cy.p")
    public static int field1435;

    @ObfuscatedName("cy.s")
    public static int field1439;

    @ObfuscatedName("v.qc")
    public static class221 field144;

    @ObfuscatedName("cy.i")
    public static int field1441;

    @ObfuscatedName("cy.v")
    public static int field1442;

    @ObfuscatedName("cy.g")
    public static int field1443;

    @ObfuscatedName("cy.h")
    public static int field1444;

    @ObfuscatedName("cy.t")
    public static int field1446;

    @ObfuscatedName("cy.u")
    public static class94 field1449;

    @ObfuscatedName("cy.a")
    public static int field1450;

    @ObfuscatedName("cn.pb")
    public static class31 field1457;

    @ObfuscatedName("cn.mg")
    public static class25[] field1464;

    @ObfuscatedName("a.bc")
    public static class185 field148;

    @ObfuscatedName("ca.e")
    public static int field1485;

    @ObfuscatedName("ca.bd")
    public static int field1490;

    @ObfuscatedName("ca.p")
    public static int field1491;

    @ObfuscatedName("ca.t")
    public static int field1492;

    @ObfuscatedName("ca.u")
    public static int field1495;

    @ObfuscatedName("ca.b")
    public static int field1496;

    @ObfuscatedName("ca.m")
    public static int field1497;

    @ObfuscatedName("ca.l")
    public static int field1498;

    @ObfuscatedName("ca.ap")
    public static int field1501;

    @ObfuscatedName("ca.aq")
    public static int field1502;

    @ObfuscatedName("ca.aw")
    public static int field1503;

    @ObfuscatedName("ca.as")
    public static int field1504;

    @ObfuscatedName("ca.bi")
    public static int field1505;

    @ObfuscatedName("ca.bk")
    public static int field1509;

    @ObfuscatedName("ca.f")
    public static int field1510;

    @ObfuscatedName("a.bm")
    public static class185 field153;

    @ObfuscatedName("ca.bh")
    public static boolean[][] field1531;

    @ObfuscatedName("ca.bc")
    public static int field1532;

    @ObfuscatedName("ca.bx")
    public static int field1533;

    @ObfuscatedName("ca.x")
    public static int field1534;

    @ObfuscatedName("ca.bf")
    public static int field1535;

    @ObfuscatedName("ca.z")
    public static int field1536;

    @ObfuscatedName("cw.dx")
    public static int[][] field1538;

    @ObfuscatedName("a.dp")
    public static int field154;

    @ObfuscatedName("cw.l")
    public static int[] field1542;

    @ObfuscatedName("cg.pj")
    public static short[] field1545;

    @ObfuscatedName("cz.m")
    public static class21 field1558;

    @ObfuscatedName("cp.nd")
    public static int field1570;

    @ObfuscatedName("a.id")
    public static class39 field159;

    @ObfuscatedName("cl.qk")
    public static class110 field1590;

    @ObfuscatedName("cl.ej")
    public static class225[] field1592;

    @ObfuscatedName("h.pm")
    public static int field163;

    @ObfuscatedName("cs.re")
    public static boolean field1631;

    @ObfuscatedName("cs.n")
    public static int field1632;

    @ObfuscatedName("ce.eq")
    public static class225[] field1649;

    @ObfuscatedName("ce.ay")
    public static class103 field1650;

    @ObfuscatedName("ce.hc")
    public static int field1652;

    @ObfuscatedName("cd.k")
    public static Applet field1658;

    @ObfuscatedName("cd.y")
    public static String field1659;

    @ObfuscatedName("h.c")
    public static int field166;

    @ObfuscatedName("cd.o")
    public static int field1660;

    @ObfuscatedName("cd.d")
    public static short[][] field1662;

    @ObfuscatedName("cd.eo")
    public static class225[] field1667;

    @ObfuscatedName("cb.bm")
    public static class223[] field1679;

    @ObfuscatedName("cb.py")
    public static class117 field1685;

    @ObfuscatedName("cb.p")
    public static int field1686;

    @ObfuscatedName("cb.be")
    public static class185 field1687;

    @ObfuscatedName("cb.k")
    public static String field1688;

    @ObfuscatedName("dj.r")
    public static File field1692;

    @ObfuscatedName("dj.a")
    public static int field1693;

    @ObfuscatedName("dj.p")
    public static String[] field1698;

    @ObfuscatedName("dj.ek")
    public static class223[] field1700;

    @ObfuscatedName("p.d")
    public static class179 field171;

    @ObfuscatedName("dv.j")
    public static int field1723;

    @ObfuscatedName("dv.nx")
    public static int field1724;

    @ObfuscatedName("dv.r")
    public static class183 field1725;

    @ObfuscatedName("dq.y")
    public static File field1728;

    @ObfuscatedName("p.fo")
    public static int field173;

    @ObfuscatedName("p.ax")
    public static class103 field175;

    @ObfuscatedName("da.qa")
    public static Image field1754;

    @ObfuscatedName("dm.qr")
    public static int field1756;

    @ObfuscatedName("dm.qq")
    public static int field1760;

    @ObfuscatedName("du.lg")
    public static class217 field1761;

    @ObfuscatedName("du.v")
    public static class182 field1763;

    @ObfuscatedName("du.bd")
    public static class185 field1764;

    @ObfuscatedName("p.cd")
    public static class209 field177;

    @ObfuscatedName("t.j")
    public static int field178;

    @ObfuscatedName("ds.dj")
    public static int field1792;

    @ObfuscatedName("t.er")
    public static class225 field181;

    @ObfuscatedName("dc.ao")
    public static boolean field1810;

    @ObfuscatedName("dx.x")
    public static int[] field1819;

    @ObfuscatedName("dy.w")
    public static int field1845;

    @ObfuscatedName("t.w")
    public static class30[] field185;

    @ObfuscatedName("dl.br")
    public static class185 field1850;

    @ObfuscatedName("eh.io")
    public static class151 field1894;

    @ObfuscatedName("er.r")
    public static class140 field1907;

    @ObfuscatedName("er.ia")
    public static class151 field1908;

    @ObfuscatedName("er.o")
    public static class183 field1909;

    @ObfuscatedName("er.k")
    public static class183 field1910;

    @ObfuscatedName("er.y")
    public static class183 field1912;

    @ObfuscatedName("er.s")
    public static boolean field1913;

    @ObfuscatedName("er.g")
    public static class145 field1914;

    @ObfuscatedName("er.q")
    public static int field1916;

    @ObfuscatedName("ex.nu")
    public static class58 field1945;

    @ObfuscatedName("ex.pz")
    public static long field1947;

    @ObfuscatedName("f.df")
    public static int field200;

    @ObfuscatedName("ej.qf")
    public static int field2000;

    @ObfuscatedName("f.ht")
    public static int field202;

    @ObfuscatedName("eu.q")
    public static short[] field2021;

    @ObfuscatedName("eu.cy")
    public static class103 field2024;

    @ObfuscatedName("eu.i")
    public static class61 field2025;

    @ObfuscatedName("ez.q")
    public static class225 field2033;

    @ObfuscatedName("ee.k")
    public static class151[][] field2043;

    @ObfuscatedName("z.g")
    public static int[] field207;

    @ObfuscatedName("u.qz")
    public static int field214;

    @ObfuscatedName("u.a")
    public static String field215;

    @ObfuscatedName("u.dr")
    public static int[] field217;

    @ObfuscatedName("ee.y")
    public static boolean[] field2172;

    @ObfuscatedName("eb.k")
    public static class183 field2187;

    @ObfuscatedName("ey.av")
    public static class185 field2192;

    @ObfuscatedName("en.u")
    public static String field2208;

    @ObfuscatedName("fc.j")
    public static class225 field2210;

    @ObfuscatedName("fc.o")
    public static class183 field2214;

    @ObfuscatedName("fe.bt")
    public static int field2217;

    @ObfuscatedName("fm.mi")
    public static byte field2266;

    @ObfuscatedName("fq.hk")
    public static int field2276;

    @ObfuscatedName("fb.y")
    public static long field2278;

    @ObfuscatedName("fb.px")
    public static int field2280;

    @ObfuscatedName("fb.k")
    public static long field2281;

    @ObfuscatedName("fb.no")
    public static int field2283;

    @ObfuscatedName("fb.de")
    public static byte[][] field2284;

    @ObfuscatedName("fs.r")
    public static int[] field2288;

    @ObfuscatedName("fp.nw")
    public static class52 field2291;

    @ObfuscatedName("ft.mj")
    public static byte field2292;

    @ObfuscatedName("ft.bb")
    public static class185 field2298;

    @ObfuscatedName("b.c")
    public static class180 field230;

    @ObfuscatedName("fh.c")
    public static short[][] field2308;

    @ObfuscatedName("fh.co")
    public static class111 field2309;

    @ObfuscatedName("b.jm")
    public static int field231;

    @ObfuscatedName("fk.ix")
    public static int field2314;

    @ObfuscatedName("fj.bx")
    public static class185 field2325;

    @ObfuscatedName("fj.bh")
    public static class185 field2331;

    @ObfuscatedName("b.pp")
    public static Clipboard field234;

    @ObfuscatedName("b.eg")
    public static class223[] field235;

    @ObfuscatedName("m.ny")
    public static class66 field238;

    @ObfuscatedName("m.eu")
    public static class225[] field240;

    @ObfuscatedName("m.nc")
    public static int field241;

    @ObfuscatedName("o.dq")
    public static int field26;

    @ObfuscatedName("fv.s")
    public static class151 field2624;

    @ObfuscatedName("fv.bi")
    public static class185 field2629;

    @ObfuscatedName("fn.nj")
    public static int field2636;

    @ObfuscatedName("fx.o")
    public static class183 field2642;

    @ObfuscatedName("fz.cn")
    public static class111 field2658;

    @ObfuscatedName("fd.gg")
    public static class151 field2666;

    @ObfuscatedName("fr.s")
    public static class223 field2678;

    @ObfuscatedName("gf.bo")
    public static int field2717;

    @ObfuscatedName("gi.o")
    public static long field2731;

    @ObfuscatedName("l.ca")
    public static char field274;

    @ObfuscatedName("gi.k")
    public static class111 field2749;

    @ObfuscatedName("ge.k")
    public static class183 field2751;

    @ObfuscatedName("ge.ex")
    public static class225 field2753;

    @ObfuscatedName("gz.y")
    public static int field2756;

    @ObfuscatedName("gz.k")
    public static class183 field2760;

    @ObfuscatedName("gw.k")
    public static class183 field2766;

    @ObfuscatedName("gt.j")
    public static byte[][][] field2767;

    @ObfuscatedName("gt.k")
    public static class183 field2770;

    @ObfuscatedName("gx.k")
    public static class183 field2774;

    @ObfuscatedName("gx.y")
    public static class183 field2778;

    @ObfuscatedName("client.o")
    public static client field278;

    @ObfuscatedName("gv.k")
    public static class183 field2793;

    @ObfuscatedName("gv.fy")
    public static int field2796;

    @ObfuscatedName("o.at")
    public static int field28;

    @ObfuscatedName("gv.az")
    public static long field2800;

    @ObfuscatedName("gs.y")
    public static class183 field2801;

    @ObfuscatedName("gs.k")
    public static class183 field2804;

    @ObfuscatedName("gs.o")
    public static int field2811;

    @ObfuscatedName("gy.y")
    public static class183 field2816;

    @ObfuscatedName("gy.k")
    public static class183 field2827;

    @ObfuscatedName("client.s")
    public static class229 field283;

    @ObfuscatedName("gg.ns")
    public static int field2836;

    @ObfuscatedName("gq.k")
    public static class183 field2849;

    @ObfuscatedName("gp.y")
    public static class183 field2851;

    @ObfuscatedName("gp.o")
    public static class183 field2853;

    @ObfuscatedName("gp.an")
    public static class223[] field2856;

    @ObfuscatedName("gp.k")
    public static class183 field2872;

    @ObfuscatedName("gb.y")
    public static class183 field2876;

    @ObfuscatedName("gb.o")
    public static int field2921;

    @ObfuscatedName("gm.w")
    public static class183 field2931;

    @ObfuscatedName("gm.j")
    public static boolean field2932;

    @ObfuscatedName("gm.ic")
    public static int field2940;

    @ObfuscatedName("gl.y")
    public static class183 field2983;

    @ObfuscatedName("k.ak")
    public static class185 field3;

    @ObfuscatedName("gl.qb")
    public static int field3006;

    @ObfuscatedName("gl.k")
    public static class183 field3009;

    @ObfuscatedName("go.k")
    public static class183 field3031;

    @ObfuscatedName("gc.o")
    public static class183 field3035;

    @ObfuscatedName("gc.k")
    public static class183 field3046;

    @ObfuscatedName("gc.y")
    public static class183 field3049;

    @ObfuscatedName("gc.pl")
    public static class231 field3053;

    @ObfuscatedName("gk.fc")
    public static int field3056;

    @ObfuscatedName("gu.s")
    public static class209 field3071;

    @ObfuscatedName("gu.u")
    public static int[] field3072;

    @ObfuscatedName("gn.r")
    public static class183 field3080;

    @ObfuscatedName("gn.t")
    public static int field3085;

    @ObfuscatedName("ho.c")
    public static class223[] field3091;

    @ObfuscatedName("hh.w")
    public static class183 field3110;

    @ObfuscatedName("hh.k")
    public static class153 field3111;

    @ObfuscatedName("hy.gq")
    public static class151 field3115;

    @ObfuscatedName("hs.n")
    public static int[][] field3154;

    @ObfuscatedName("hp.hw")
    public static int field3167;

    @ObfuscatedName("hb.ap")
    public static int field3171;

    @ObfuscatedName("hb.aq")
    public static int field3172;

    @ObfuscatedName("hb.x")
    public static int[] field3175;

    @ObfuscatedName("hi.q")
    public static int[] field3212;

    @ObfuscatedName("hi.y")
    public static int field3213;

    @ObfuscatedName("hi.o")
    public static int field3214;

    @ObfuscatedName("hi.w")
    public static int[] field3215;

    @ObfuscatedName("hi.d")
    public static int[] field3216;

    @ObfuscatedName("hi.k")
    public static int field3217;

    @ObfuscatedName("hi.n")
    public static byte[][] field3219;

    @ObfuscatedName("hi.ez")
    public static class223[] field3220;

    @ObfuscatedName("hw.n")
    public static short[] field3232;

    @ObfuscatedName("ht.ak")
    public static class225[] field3252;

    @ObfuscatedName("hf.w")
    public static File field3283;

    @ObfuscatedName("client.an")
    public static class185 field354;

    @ObfuscatedName("r.fm")
    public static int field37;

    @ObfuscatedName("client.nq")
    public static int field400;

    @ObfuscatedName("client.ih")
    public static int field430;

    @ObfuscatedName("client.iz")
    public static int field431;

    @ObfuscatedName("w.ae")
    public static class111 field45;

    @ObfuscatedName("j.z")
    public static int[] field48;

    @ObfuscatedName("client.by")
    public static int field493;

    @ObfuscatedName("j.jv")
    public static int field52;

    @ObfuscatedName("j.el")
    public static class225[] field53;

    @ObfuscatedName("q.bu")
    public static int field55;

    @ObfuscatedName("d.a")
    public static int[][][] field56;

    @ObfuscatedName("d.md")
    public static class225 field57;

    @ObfuscatedName("x.bp")
    public static class185 field575;

    @ObfuscatedName("ap.pw")
    public static class2 field577;

    @ObfuscatedName("d.bf")
    public static FontMetrics field61;

    @ObfuscatedName("d.i")
    public static int[] field63;

    @ObfuscatedName("aq.dn")
    public static int field651;

    @ObfuscatedName("aw.dv")
    public static int field663;

    @ObfuscatedName("as.c")
    public static class27 field674;

    @ObfuscatedName("aa.rr")
    public static String field708;

    @ObfuscatedName("aa.gv")
    public static class151 field709;

    @ObfuscatedName("n.bz")
    public static class223 field71;

    @ObfuscatedName("ai.r")
    public static String[] field714;

    @ObfuscatedName("ai.o")
    public static int[] field715;

    @ObfuscatedName("ai.fe")
    public static int field716;

    @ObfuscatedName("ai.jy")
    public static int field722;

    @ObfuscatedName("ai.qm")
    public static Canvas field729;

    @ObfuscatedName("ai.g")
    public static class151 field732;

    @ObfuscatedName("af.ea")
    public static class225[] field743;

    @ObfuscatedName("aj.h")
    public static class161 field750;

    @ObfuscatedName("aj.z")
    public static class161 field755;

    @ObfuscatedName("aj.nb")
    public static class58 field761;

    @ObfuscatedName("n.kx")
    public static class113 field77;

    @ObfuscatedName("ad.bz")
    public static class185 field787;

    @ObfuscatedName("ao.d")
    public static byte[][][] field799;

    @ObfuscatedName("ao.iv")
    public static int field801;

    @ObfuscatedName("ag.r")
    public static class223 field821;

    @ObfuscatedName("ag.o")
    public static class223 field822;

    @ObfuscatedName("ag.w")
    public static class223[] field824;

    @ObfuscatedName("ag.n")
    public static class223[] field825;

    @ObfuscatedName("ag.f")
    public static int[] field829;

    @ObfuscatedName("ag.b")
    public static int[] field830;

    @ObfuscatedName("ag.aq")
    public static int[] field834;

    @ObfuscatedName("ag.k")
    public static boolean field846;

    @ObfuscatedName("ag.ap")
    public static int[] field848;

    @ObfuscatedName("c.qe")
    public static int field85;

    @ObfuscatedName("ag.ce")
    public static class209 field856;

    @ObfuscatedName("c.ds")
    public static int[] field86;

    @ObfuscatedName("au.nk")
    public static int field892;

    @ObfuscatedName("ax.cw")
    public static int field894;

    @ObfuscatedName("ax.j")
    public static class183 field897;

    @ObfuscatedName("ae.y")
    public static String field905;

    @ObfuscatedName("ae.kw")
    public static class47 field914;

    @ObfuscatedName("ab.bl")
    public static class185 field924;

    @ObfuscatedName("al.q")
    public static int field925;

    @ObfuscatedName("al.v")
    public static int[] field930;

    @ObfuscatedName("al.j")
    public static int[] field933;

    @ObfuscatedName("az.c")
    public static int[] field934;

    @ObfuscatedName("az.gu")
    public static int field937;

    @ObfuscatedName("s.bv")
    public static String field94;

    @ObfuscatedName("av.ff")
    public static int field953;

    @ObfuscatedName("av.pe")
    public static int field959;

    @ObfuscatedName("av.na")
    public static int field960;

    @ObfuscatedName("av.cq")
    public static class209 field962;

    @ObfuscatedName("av.ev")
    public static class225[] field964;

    @ObfuscatedName("ak.b")
    public static String field969;

    @ObfuscatedName("ak.au")
    public static String field970;

    @ObfuscatedName("ak.qg")
    public static Font field971;

    @ObfuscatedName("ak.d")
    public static int field972;

    @ObfuscatedName("g.r")
    public static byte[][][] field98;

    @ObfuscatedName("bz.d")
    public static int field990;

    @ObfuscatedName("bz.x")
    public static float[] field992;

    @ObfuscatedName("bz.ah")
    public static int[] field998;

    @ObfuscatedName("gf.k(Ley;I)V")
    public static void method3177(class153 arg0) {
        field3111 = arg0;
    }

    @ObfuscatedName("dl.k([BIIB)I")
    public static int method2119(byte[] arg0, int arg1, int arg2) {
        int var3 = -1;
        for (int var4 = arg1; var4 < arg2; var4++) {
            var3 = var3 >>> 8 ^ class161.field2260[(var3 ^ arg0[var4]) & 0xFF];
        }
        return ~var3;
    }

    @ObfuscatedName("cb.o([Las;II[I[II)V")
    public static void method1848(class30[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class30 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field667;
                        var12 = var8.field667;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field677;
                        var12 = var8.field677;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method649() ? 1 : 0;
                        var12 = var8.method649() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field672;
                        var12 = var8.field672;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field667;
                        var16 = var8.field667;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field677;
                        var16 = var8.field677;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method649() ? 1 : 0;
                        var16 = var8.method649() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field672;
                        var16 = var8.field672;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class30 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1848(arg0, arg1, var6, arg3, arg4);
        method1848(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("eb.f(B)V")
    public static void method2655() {
        class151.field2044.method2161();
        class151.field2045.method2161();
        class151.field2046.method2161();
        class151.field2047.method2161();
    }

    @ObfuscatedName("ac.c(IIIB)I")
    public static final int method756(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("by.bd(I)Z")
    public static final boolean method1376() {
        if (field2658 == null) {
            return false;
        }
        try {
            int var0 = field2658.method1933();
            if (var0 == 0) {
                return false;
            }
            if (client.field287 == -1) {
                field2658.method1934(client.field324.field2258, 0, 1);
                client.field324.field2267 = 0;
                client.field287 = client.field324.method2988();
                client.field325 = class213.field3121[client.field287];
                var0--;
            }
            if (client.field325 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                field2658.method1934(client.field324.field2258, 0, 1);
                client.field325 = client.field324.field2258[0] & 0xFF;
                var0--;
            }
            if (client.field325 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                field2658.method1934(client.field324.field2258, 0, 2);
                client.field324.field2267 = 0;
                client.field325 = client.field324.method2735();
                var0 -= 2;
            }
            if (var0 < client.field325) {
                return false;
            }
            client.field324.field2267 = 0;
            field2658.method1934(client.field324.field2258, 0, client.field325);
            client.field327 = 0;
            client.field331 = client.field330;
            client.field330 = client.field285;
            client.field285 = client.field287;
            if (client.field287 == 90) {
                for (int var1 = 0; var1 < class147.field2012.length; var1++) {
                    if (class147.field2012[var1] != class147.field2010[var1]) {
                        class147.field2012[var1] = class147.field2010[var1];
                        client.method3088(var1);
                        client.field394[++client.field562 - 1 & 0x1F] = var1;
                    }
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 30) {
                client.method639();
                int var2 = client.field324.method2733();
                int var3 = client.field324.method2759();
                int var4 = client.field324.method2780();
                client.field345[var3] = var4;
                client.field319[var3] = var2;
                client.field414[var3] = 1;
                for (int var5 = 0; var5 < 98; var5++) {
                    if (var4 >= class173.field2335[var5]) {
                        client.field414[var3] = var5 + 2;
                    }
                }
                client.field449[++client.field469 - 1 & 0x1F] = var3;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 252) {
                client.method2032();
                client.field287 = -1;
                return false;
            }
            if (client.field287 == 207) {
                field154 = client.field324.method2760();
                field200 = client.field324.method2898();
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 155) {
                client.field334 = 1;
                client.field471 = client.field463;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 197 || client.field287 == 115 || client.field287 == 194 || client.field287 == 160 || client.field287 == 77 || client.field287 == 82 || client.field287 == 165 || client.field287 == 234 || client.field287 == 141 || client.field287 == 136) {
                client.method749();
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 12) {
                byte var6 = client.field324.method2762();
                int var7 = client.field324.method2735();
                class147.field2010[var7] = var6;
                if (class147.field2012[var7] != var6) {
                    class147.field2012[var7] = var6;
                }
                client.method3088(var7);
                client.field394[++client.field562 - 1 & 0x1F] = var7;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 224) {
                int var8 = client.field324.method2735();
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = client.field324.method2868();
                int var10 = client.field324.method2868();
                class151 var11 = class151.method744(var9);
                if (var11.field2049) {
                    var11.field2066 = var8;
                    var11.field2171 = var10;
                    class199 var13 = class199.method2569(var8);
                    var11.field2101 = var13.field2944;
                    var11.field2102 = var13.field2945;
                    var11.field2103 = var13.field2946;
                    var11.field2161 = var13.field2947;
                    var11.field2115 = var13.field2965;
                    var11.field2104 = var13.field2943;
                    if (var13.field2968 == 1) {
                        var11.field2058 = 1;
                    } else {
                        var11.field2058 = 2;
                    }
                    if (var11.field2105 > 0) {
                        var11.field2104 = var11.field2104 * 32 / var11.field2105;
                    } else if (var11.field2052 > 0) {
                        var11.field2104 = var11.field2104 * 32 / var11.field2052;
                    }
                    client.method29(var11);
                } else if (var8 == -1) {
                    var11.field2093 = 0;
                    client.field287 = -1;
                    return true;
                } else {
                    class199 var12 = class199.method2569(var8);
                    var11.field2093 = 4;
                    var11.field2094 = var8;
                    var11.field2101 = var12.field2944;
                    var11.field2102 = var12.field2945;
                    var11.field2104 = var12.field2943 * 100 / var10;
                    client.method29(var11);
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 240) {
                boolean var14 = client.field324.method2898() == 1;
                int var15 = client.field324.method2778();
                class151 var16 = class151.method744(var15);
                if (var16.field2070 != var14) {
                    var16.field2070 = var14;
                    client.method29(var16);
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 73) {
                int var17 = client.field324.method2868();
                int var18 = client.field324.method2735();
                if (var17 < -70000) {
                    var18 += 32768;
                }
                class151 var19;
                if (var17 >= 0) {
                    var19 = class151.method744(var17);
                } else {
                    var19 = null;
                }
                while (client.field324.field2267 < client.field325) {
                    int var20 = client.field324.method2745();
                    int var21 = client.field324.method2735();
                    int var22 = 0;
                    if (var21 != 0) {
                        var22 = client.field324.method2733();
                        if (var22 == 255) {
                            var22 = client.field324.method2868();
                        }
                    }
                    if (var19 != null && var20 >= 0 && var20 < var19.field2168.length) {
                        var19.field2168[var20] = var21;
                        var19.field2163[var20] = var22;
                    }
                    class13.method95(var18, var20, var21 - 1, var22);
                }
                if (var19 != null) {
                    client.method29(var19);
                }
                client.method639();
                client.field404[++client.field467 - 1 & 0x1F] = var18 & 0x7FFF;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 232) {
                int var23 = client.field324.method2733();
                int var24 = client.field324.method2733();
                int var25 = client.field324.method2733();
                int var26 = client.field324.method2733();
                client.field528[var23] = true;
                client.field529[var23] = var24;
                client.field530[var23] = var25;
                client.field388[var23] = var26;
                client.field532[var23] = 0;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 99) {
                String var27 = client.field324.method2740();
                int var28 = client.field324.method2735();
                byte var29 = client.field324.method2734();
                boolean var30 = false;
                if (var29 == -128) {
                    var30 = true;
                }
                if (var30) {
                    if (field1190 == 0) {
                        client.field287 = -1;
                        return true;
                    }
                    boolean var31 = false;
                    int var32;
                    for (var32 = 0; var32 < field1190 && (!field1464[var32].field271.equals(var27) || field1464[var32].field276 != var28); var32++) {
                    }
                    if (var32 < field1190) {
                        while (var32 < field1190 - 1) {
                            field1464[var32] = field1464[var32 + 1];
                            var32++;
                        }
                        field1190--;
                        field1464[field1190] = null;
                    }
                } else {
                    client.field324.method2740();
                    class25 var33 = new class25();
                    var33.field271 = var27;
                    var33.field269 = class205.method3535(var33.field271, field283);
                    var33.field276 = var28;
                    var33.field272 = var29;
                    int var34;
                    for (var34 = field1190 - 1; var34 >= 0; var34--) {
                        int var35 = field1464[var34].field269.compareTo(var33.field269);
                        if (var35 == 0) {
                            field1464[var34].field276 = var28;
                            field1464[var34].field272 = var29;
                            if (var27.equals(field1425.field262)) {
                                field2266 = var29;
                            }
                            client.field472 = client.field463;
                            client.field287 = -1;
                            return true;
                        }
                        if (var35 < 0) {
                            break;
                        }
                    }
                    if (field1190 >= field1464.length) {
                        client.field287 = -1;
                        return true;
                    }
                    for (int var36 = field1190 - 1; var36 > var34; var36--) {
                        field1464[var36 + 1] = field1464[var36];
                    }
                    if (field1190 == 0) {
                        field1464 = new class25[100];
                    }
                    field1464[var34 + 1] = var33;
                    field1190++;
                    if (var27.equals(field1425.field262)) {
                        field2266 = var29;
                    }
                }
                client.field472 = client.field463;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 196) {
                class46.method747(client.field324, client.field325);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 128) {
                int var37 = client.field324.method2778();
                int var38 = client.field324.method2778();
                class18 var39 = (class18) client.field439.method2171((long) var38);
                class18 var40 = (class18) client.field439.method2171((long) var37);
                if (var40 != null) {
                    client.method753(var40, var39 == null || var39.field184 != var40.field184);
                }
                if (var39 != null) {
                    var39.method2214();
                    client.field439.method2173(var39, (long) var37);
                }
                class151 var41 = class151.method744(var38);
                if (var41 != null) {
                    client.method29(var41);
                }
                class151 var42 = class151.method744(var37);
                if (var42 != null) {
                    client.method29(var42);
                    client.method234(field2043[var42.field2050 >>> 16], var42, true);
                }
                if (client.field438 != -1) {
                    client.method2575(client.field438, 1);
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 92) {
                client.field527 = true;
                field892 = client.field324.method2733();
                field1423 = client.field324.method2733();
                field2836 = client.field324.method2735();
                field2283 = client.field324.method2733();
                field241 = client.field324.method2733();
                if (field241 >= 100) {
                    field3056 = field892 * 128 + 64;
                    field173 = field1423 * 128 + 64;
                    field716 = client.method1789(field3056, field173, field937) - field2836;
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 67) {
                int var43 = client.field324.method2736();
                int var44 = client.field324.method2778();
                class151 var45 = class151.method744(var44);
                if (var45.field2165 != var43 || var43 == -1) {
                    var45.field2165 = var43;
                    var45.field2055 = 0;
                    var45.field2177 = 0;
                    client.method29(var45);
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 97) {
                while (client.field324.field2267 < client.field325) {
                    int var46 = client.field324.method2733();
                    boolean var47 = (var46 & 0x1) == 1;
                    String var48 = client.field324.method2740();
                    String var49 = client.field324.method2740();
                    client.field324.method2740();
                    for (int var50 = 0; var50 < client.field486; var50++) {
                        class20 var51 = client.field551[var50];
                        if (var47) {
                            if (var49.equals(var51.field208)) {
                                var51.field208 = var48;
                                var51.field204 = var49;
                                var48 = null;
                                break;
                            }
                        } else if (var48.equals(var51.field208)) {
                            var51.field208 = var48;
                            var51.field204 = var49;
                            var48 = null;
                            break;
                        }
                    }
                    if (var48 != null && client.field486 < 400) {
                        class20 var52 = new class20();
                        client.field551[client.field486] = var52;
                        var52.field208 = var48;
                        var52.field204 = var49;
                        client.field486++;
                    }
                }
                client.field471 = client.field463;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 55) {
                field1761 = class217.method1953(client.field324.method2733());
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 203) {
                client.method639();
                client.field444 = client.field324.method2736();
                client.field475 = client.field463;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 37) {
                int var53 = client.field324.method2843();
                int var54 = client.field324.method2778();
                class147.field2010[var53] = var54;
                if (class147.field2012[var53] != var54) {
                    class147.field2012[var53] = var54;
                }
                client.method3088(var53);
                client.field394[++client.field562 - 1 & 0x1F] = var53;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 7) {
                client.field326 = client.field324.method2768() * 30;
                client.field475 = client.field463;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 116) {
                field154 = client.field324.method2733();
                field200 = client.field324.method2733();
                while (client.field324.field2267 < client.field325) {
                    client.field287 = client.field324.method2733();
                    client.method749();
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 159) {
                client.method615(client.field324.method2740());
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 118) {
                int var55 = client.field324.method2733();
                if (client.field324.method2733() == 0) {
                    client.field531[var55] = new class5();
                    client.field324.field2267 += 18;
                } else {
                    client.field324.field2267--;
                    client.field531[var55] = new class5(client.field324, false);
                }
                client.field416 = client.field463;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 126) {
                client.field515 = client.field324.method2733();
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 33) {
                client.field527 = false;
                for (int var56 = 0; var56 < 5; var56++) {
                    client.field528[var56] = false;
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 72) {
                int var57 = client.field324.method2735();
                int var58 = client.field324.method2780();
                class151 var59 = class151.method744(var58);
                if (var59 != null && var59.field2089 == 0) {
                    if (var57 > var59.field2111 - var59.field2169) {
                        var57 = var59.field2111 - var59.field2169;
                    }
                    if (var57 < 0) {
                        var57 = 0;
                    }
                    if (var59.field2072 != var57) {
                        var59.field2072 = var57;
                        client.method29(var59);
                    }
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 65) {
                int var60 = client.field324.method2735();
                if (var60 == 65535) {
                    var60 = -1;
                }
                int var61 = client.field324.method2735();
                if (var61 == 65535) {
                    var61 = -1;
                }
                int var62 = client.field324.method2938();
                int var63 = client.field324.method2778();
                for (int var64 = var61; var64 <= var60; var64++) {
                    long var65 = ((long) var63 << 32) + (long) var64;
                    class128 var67 = client.field480.method2171(var65);
                    if (var67 != null) {
                        var67.method2214();
                    }
                    client.field480.method2173(new class134(var62), var65);
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 243) {
                String var68 = client.field324.method2740();
                long var69 = (long) client.field324.method2735();
                long var71 = (long) client.field324.method2876();
                class178 var73 = (class178) class156.method725(class178.method2033(), client.field324.method2733());
                long var74 = (var69 << 32) + var71;
                boolean var76 = false;
                for (int var77 = 0; var77 < 100; var77++) {
                    if (client.field559[var77] == var74) {
                        var76 = true;
                        break;
                    }
                }
                if (client.method21(var68)) {
                    var76 = true;
                }
                if (!var76 && client.field398 == 0) {
                    client.field559[client.field500] = var74;
                    client.field500 = (client.field500 + 1) % 100;
                    class167 var78 = client.field324;
                    String var82;
                    try {
                        int var79 = var78.method2745();
                        if (var79 > 32767) {
                            var79 = 32767;
                        }
                        byte[] var80 = new byte[var79];
                        var78.field2267 += field3111.method2658(var78.field2258, var78.field2267, var80, 0, var79);
                        String var81 = class204.method1328(var80, 0, var79);
                        var82 = var81;
                    } catch (Exception var314) {
                        var82 = "Cabbage";
                    }
                    String var85 = class210.method3716(class208.method1951(var82));
                    byte var86;
                    if (var73.field2657) {
                        var86 = 7;
                    } else {
                        var86 = 3;
                    }
                    if (var73.field2648 == -1) {
                        class48.method888(var86, var68, var85);
                    } else {
                        class48.method888(var86, class38.method2035(var73.field2648) + var68, var85);
                    }
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 103) {
                int var87 = client.field324.method2938();
                class151 var88 = class151.method744(var87);
                for (int var89 = 0; var89 < var88.field2168.length; var89++) {
                    var88.field2168[var89] = -1;
                    var88.field2168[var89] = 0;
                }
                client.method29(var88);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 130) {
                int var90 = client.field324.method2769();
                int var91 = client.field324.method2769();
                int var92 = client.field324.method2868();
                int var93 = client.field324.method2735();
                class151 var94 = class151.method744(var92);
                if (var94.field2101 != var90 || var94.field2102 != var93 || var94.field2104 != var91) {
                    var94.field2101 = var90;
                    var94.field2102 = var93;
                    var94.field2104 = var91;
                    client.method29(var94);
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 195) {
                int var95 = client.field325 + client.field324.field2267;
                int var96 = client.field324.method2735();
                int var97 = client.field324.method2735();
                if (client.field438 != var96) {
                    client.field438 = var96;
                    client.method118(false);
                    client.method24(client.field438);
                    class33.method2120(client.field438);
                    for (int var98 = 0; var98 < 100; var98++) {
                        client.field483[var98] = true;
                    }
                }
                while (var97-- > 0) {
                    int var99 = client.field324.method2868();
                    int var100 = client.field324.method2735();
                    int var101 = client.field324.method2733();
                    class18 var102 = (class18) client.field439.method2171((long) var99);
                    if (var102 != null && var102.field184 != var100) {
                        client.method753(var102, true);
                        var102 = null;
                    }
                    if (var102 == null) {
                        var102 = client.method1137(var99, var100, var101);
                    }
                    var102.field188 = true;
                }
                for (class18 var103 = (class18) client.field439.method2174(); var103 != null; var103 = (class18) client.field439.method2175()) {
                    if (var103.field188) {
                        var103.field188 = false;
                    } else {
                        client.method753(var103, true);
                    }
                }
                client.field480 = new class126(512);
                while (client.field324.field2267 < var95) {
                    int var104 = client.field324.method2868();
                    int var105 = client.field324.method2735();
                    int var106 = client.field324.method2735();
                    int var107 = client.field324.method2868();
                    for (int var108 = var105; var108 <= var106; var108++) {
                        long var109 = ((long) var104 << 32) + (long) var108;
                        client.field480.method2173(new class134(var107), var109);
                    }
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 201) {
                String var111 = client.field324.method2740();
                Object[] var112 = new Object[var111.length() + 1];
                for (int var113 = var111.length() - 1; var113 >= 0; var113--) {
                    if (var111.charAt(var113) == 's') {
                        var112[var113 + 1] = client.field324.method2740();
                    } else {
                        var112[var113 + 1] = Integer.valueOf(client.field324.method2868());
                    }
                }
                var112[0] = Integer.valueOf(client.field324.method2868());
                class19 var114 = new class19();
                var114.field199 = var112;
                class33.method119(var114);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 237) {
                int var115 = client.field324.method2898();
                String var116 = client.field324.method2740();
                int var117 = client.field324.method2733();
                if (var115 >= 1 && var115 <= 8) {
                    if (var116.equalsIgnoreCase("null")) {
                        var116 = null;
                    }
                    client.field428[var115 - 1] = var116;
                    client.field406[var115 - 1] = var117 == 0;
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 59) {
                class30 var118 = new class30();
                var118.field673 = client.field324.method2740();
                var118.field672 = client.field324.method2735();
                int var119 = client.field324.method2868();
                var118.field676 = var119;
                client.method168(45);
                field2658.method1945();
                field2658 = null;
                class42.method868(var118);
                client.field287 = -1;
                return false;
            }
            if (client.field287 == 238) {
                int var120 = client.field324.method2771();
                int var121 = client.field324.method2938();
                int var122 = client.field324.method2772();
                class151 var123 = class151.method744(var121);
                if (var123.field2059 != var122 || var123.field2060 != var120 || var123.field2112 != 0 || var123.field2180 != 0) {
                    var123.field2059 = var122;
                    var123.field2060 = var120;
                    var123.field2112 = 0;
                    var123.field2180 = 0;
                    client.method29(var123);
                    client.method1851(var123);
                    if (var123.field2089 == 0) {
                        client.method234(field2043[var121 >> 16], var123, false);
                    }
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 213) {
                client.method639();
                client.field316 = client.field324.method2733();
                client.field475 = client.field463;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 218) {
                String var124 = client.field324.method2740();
                class167 var125 = client.field324;
                String var129;
                try {
                    int var126 = var125.method2745();
                    if (var126 > 32767) {
                        var126 = 32767;
                    }
                    byte[] var127 = new byte[var126];
                    var125.field2267 += field3111.method2658(var125.field2258, var125.field2267, var127, 0, var126);
                    String var128 = class204.method1328(var127, 0, var126);
                    var129 = var128;
                } catch (Exception var313) {
                    var129 = "Cabbage";
                }
                String var132 = class210.method3716(class208.method1951(var129));
                class48.method888(6, var124, var132);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 16) {
                client.field512 = client.field324.method2733();
                if (client.field512 == 255) {
                    client.field512 = 0;
                }
                client.field524 = client.field324.method2733();
                if (client.field524 == 255) {
                    client.field524 = 0;
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 125) {
                class46.field902 = 0;
                for (int var133 = 0; var133 < 2048; var133++) {
                    class46.field901[var133] = null;
                    class46.field900[var133] = 1;
                }
                for (int var134 = 0; var134 < 2048; var134++) {
                    client.field399[var134] = null;
                }
                class46.method622(client.field324);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 60) {
                client.method44(true);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 8) {
                int var135 = client.field324.method2868();
                class18 var136 = (class18) client.field439.method2171((long) var135);
                if (var136 != null) {
                    client.method753(var136, true);
                }
                if (client.field310 != null) {
                    client.method29(client.field310);
                    client.field310 = null;
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 110) {
                client.field496 = client.field324.method2733();
                client.field497 = client.field324.method2733();
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 19) {
                client.method886(true);
                client.field324.method2988();
                int var137 = client.field324.method2735();
                class46.method747(client.field324, var137);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 134) {
                int var138 = client.field324.method2759();
                int var139 = client.field324.method2843();
                int var140 = client.field324.method2780();
                class18 var141 = (class18) client.field439.method2171((long) var140);
                if (var141 != null) {
                    client.method753(var141, var141.field184 != var139);
                }
                client.method1137(var140, var139, var138);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 109) {
                int var142 = client.field324.method2769();
                int var143 = client.field324.method2735();
                int var144 = client.field324.method2778();
                class151 var145 = class151.method744(var144);
                var145.field2106 = (var143 << 16) + var142;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 205) {
                int var146 = client.field324.method2735();
                int var147 = client.field324.method2780();
                class151 var148 = class151.method744(var147);
                if (var148.field2093 != 2 || var148.field2094 != var146) {
                    var148.field2093 = 2;
                    var148.field2094 = var146;
                    client.method29(var148);
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 11) {
                field200 = client.field324.method2759();
                field154 = client.field324.method2898();
                for (int var149 = field200; var149 < field200 + 8; var149++) {
                    for (int var150 = field154; var150 < field154 + 8; var150++) {
                        if (client.field409[field937][var149][var150] != null) {
                            client.field409[field937][var149][var150] = null;
                            client.method161(var149, var150);
                        }
                    }
                }
                for (class26 var151 = (class26) client.field301.method2243(); var151 != null; var151 = (class26) client.field301.method2238()) {
                    if (var151.field565 >= field200 && var151.field565 < field200 + 8 && var151.field566 >= field154 && var151.field566 < field154 + 8 && field937 == var151.field576) {
                        var151.field574 = 0;
                    }
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 202) {
                int var152 = client.field324.method2768();
                class13.method1794(var152);
                client.field404[++client.field467 - 1 & 0x1F] = var152 & 0x7FFF;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 221) {
                class167 var153 = client.field324;
                int var154 = client.field325;
                class227 var155 = new class227();
                var155.field3221 = var153.method2733();
                var155.field3225 = var153.method2868();
                var155.field3227 = new int[var155.field3221];
                var155.field3224 = new int[var155.field3221];
                var155.field3222 = new Field[var155.field3221];
                var155.field3226 = new int[var155.field3221];
                var155.field3223 = new Method[var155.field3221];
                var155.field3228 = new byte[var155.field3221][][];
                for (int var156 = 0; var156 < var155.field3221; var156++) {
                    try {
                        int var157 = var153.method2733();
                        if (var157 == 0 || var157 == 1 || var157 == 2) {
                            String var158 = var153.method2740();
                            String var159 = var153.method2740();
                            int var160 = 0;
                            if (var157 == 1) {
                                var160 = var153.method2868();
                            }
                            var155.field3227[var156] = var157;
                            var155.field3226[var156] = var160;
                            if (class228.method3201(var158).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var155.field3222[var156] = class228.method3201(var158).getDeclaredField(var159);
                        } else if (var157 == 3 || var157 == 4) {
                            String var161 = var153.method2740();
                            String var162 = var153.method2740();
                            int var163 = var153.method2733();
                            String[] var164 = new String[var163];
                            for (int var165 = 0; var165 < var163; var165++) {
                                var164[var165] = var153.method2740();
                            }
                            String var166 = var153.method2740();
                            byte[][] var167 = new byte[var163][];
                            if (var157 == 3) {
                                for (int var168 = 0; var168 < var163; var168++) {
                                    int var169 = var153.method2868();
                                    var167[var168] = new byte[var169];
                                    var153.method2901(var167[var168], 0, var169);
                                }
                            }
                            var155.field3227[var156] = var157;
                            Class[] var170 = new Class[var163];
                            for (int var171 = 0; var171 < var163; var171++) {
                                var170[var171] = class228.method3201(var164[var171]);
                            }
                            Class var172 = class228.method3201(var166);
                            if (class228.method3201(var161).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var173 = class228.method3201(var161).getDeclaredMethods();
                            Method[] var174 = var173;
                            for (int var175 = 0; var175 < var174.length; var175++) {
                                Method var176 = var174[var175];
                                if (var176.getName().equals(var162)) {
                                    Class[] var177 = var176.getParameterTypes();
                                    if (var170.length == var177.length) {
                                        boolean var178 = true;
                                        for (int var179 = 0; var179 < var170.length; var179++) {
                                            if (var170[var179] != var177[var179]) {
                                                var178 = false;
                                                break;
                                            }
                                        }
                                        if (var178 && var172 == var176.getReturnType()) {
                                            var155.field3223[var156] = var176;
                                        }
                                    }
                                }
                            }
                            var155.field3228[var156] = var167;
                        }
                    } catch (ClassNotFoundException var316) {
                        var155.field3224[var156] = -1;
                    } catch (SecurityException var317) {
                        var155.field3224[var156] = -2;
                    } catch (NullPointerException var318) {
                        var155.field3224[var156] = -3;
                    } catch (Exception var319) {
                        var155.field3224[var156] = -4;
                    } catch (Throwable var320) {
                        var155.field3224[var156] = -5;
                    }
                }
                class228.field3233.method2187(var155);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 53) {
                int var185 = client.field324.method2780();
                int var186 = client.field324.method2735();
                int var187 = var186 >> 10 & 0x1F;
                int var188 = var186 >> 5 & 0x1F;
                int var189 = var186 & 0x1F;
                int var190 = (var189 << 3) + (var187 << 19) + (var188 << 11);
                class151 var191 = class151.method744(var185);
                if (var191.field2151 != var190) {
                    var191.field2151 = var190;
                    client.method29(var191);
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 178) {
                client.method886(false);
                client.field324.method2988();
                int var192 = client.field324.method2735();
                class46.method747(client.field324, var192);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 39) {
                if (client.field438 != -1) {
                    client.method2575(client.field438, 0);
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 87) {
                client.field297 = client.field324.method2733();
                if (client.field297 == 1) {
                    client.field298 = client.field324.method2735();
                }
                if (client.field297 >= 2 && client.field297 <= 6) {
                    if (client.field297 == 2) {
                        client.field303 = 64;
                        client.field304 = 64;
                    }
                    if (client.field297 == 3) {
                        client.field303 = 0;
                        client.field304 = 64;
                    }
                    if (client.field297 == 4) {
                        client.field303 = 128;
                        client.field304 = 64;
                    }
                    if (client.field297 == 5) {
                        client.field303 = 64;
                        client.field304 = 0;
                    }
                    if (client.field297 == 6) {
                        client.field303 = 64;
                        client.field304 = 128;
                    }
                    client.field297 = 2;
                    client.field349 = client.field324.method2735();
                    client.field429 = client.field324.method2735();
                    client.field302 = client.field324.method2733();
                }
                if (client.field297 == 10) {
                    client.field299 = client.field324.method2735();
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 146) {
                String var193 = client.field324.method2740();
                long var194 = client.field324.method2738();
                long var196 = (long) client.field324.method2735();
                long var198 = (long) client.field324.method2876();
                class178 var200 = (class178) class156.method725(class178.method2033(), client.field324.method2733());
                long var201 = (var196 << 32) + var198;
                boolean var203 = false;
                for (int var204 = 0; var204 < 100; var204++) {
                    if (client.field559[var204] == var201) {
                        var203 = true;
                        break;
                    }
                }
                if (var200.field2655 && client.method21(var193)) {
                    var203 = true;
                }
                if (!var203 && client.field398 == 0) {
                    client.field559[client.field500] = var201;
                    client.field500 = (client.field500 + 1) % 100;
                    class167 var205 = client.field324;
                    String var209;
                    try {
                        int var206 = var205.method2745();
                        if (var206 > 32767) {
                            var206 = 32767;
                        }
                        byte[] var207 = new byte[var206];
                        var205.field2267 += field3111.method2658(var205.field2258, var205.field2267, var207, 0, var206);
                        String var208 = class204.method1328(var207, 0, var206);
                        var209 = var208;
                    } catch (Exception var312) {
                        var209 = "Cabbage";
                    }
                    String var212 = class210.method3716(class208.method1951(var209));
                    if (var200.field2648 == -1) {
                        class48.method1801(9, var193, var212, class206.method2643(var194));
                    } else {
                        class48.method1801(9, class38.method2035(var200.field2648) + var193, var212, class206.method2643(var194));
                    }
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 35) {
                int var213 = client.field324.method2735();
                int var214 = client.field324.method2733();
                int var215 = client.field324.method2735();
                client.method1461(var213, var214, var215);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 223) {
                int var216 = client.field324.method2769();
                int var217 = client.field324.method2780();
                class151 var218 = class151.method744(var217);
                if (var218.field2093 != 1 || var218.field2094 != var216) {
                    var218.field2093 = 1;
                    var218.field2094 = var216;
                    client.method29(var218);
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 140) {
                client.method44(false);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 124) {
                boolean var219 = client.field324.method2733() == 1;
                if (var219) {
                    field1947 = class163.method225() - client.field324.method2738();
                    field577 = new class2(client.field324, true);
                } else {
                    field577 = null;
                }
                client.field294 = client.field463;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 31) {
                int var220 = client.field324.method2735();
                if (var220 == 65535) {
                    var220 = -1;
                }
                if (var220 == -1 && !client.field518) {
                    class139.method1616();
                } else if (var220 != -1 && client.field517 != var220 && client.field516 != 0 && !client.field518) {
                    class185 var221 = field924;
                    int var222 = client.field516;
                    class139.field1911 = 1;
                    field11 = var221;
                    field1916 = var220;
                    field972 = 0;
                    field1632 = var222;
                    field1913 = false;
                    field166 = 2;
                }
                client.field517 = var220;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 78) {
                int var223 = client.field324.method2774();
                int var224 = client.field324.method2843();
                if (var224 == 65535) {
                    var224 = -1;
                }
                if (client.field516 != 0 && var224 != -1) {
                    class139.method2715(field110, var224, 0, client.field516, false);
                    client.field518 = true;
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 45) {
                while (client.field324.field2267 < client.field325) {
                    boolean var225 = client.field324.method2733() == 1;
                    String var226 = client.field324.method2740();
                    String var227 = client.field324.method2740();
                    int var228 = client.field324.method2735();
                    int var229 = client.field324.method2733();
                    int var230 = client.field324.method2733();
                    boolean var231 = (var230 & 0x2) != 0;
                    boolean var232 = (var230 & 0x1) != 0;
                    if (var228 > 0) {
                        client.field324.method2740();
                        client.field324.method2733();
                        client.field324.method2868();
                    }
                    client.field324.method2740();
                    for (int var233 = 0; var233 < client.field546; var233++) {
                        class15 var234 = client.field548[var233];
                        if (var225) {
                            if (var227.equals(var234.field158)) {
                                var234.field158 = var226;
                                var234.field152 = var227;
                                var226 = null;
                                break;
                            }
                        } else if (var226.equals(var234.field158)) {
                            if (var234.field151 != var228) {
                                boolean var235 = true;
                                for (class17 var236 = (class17) client.field410.method2257(); var236 != null; var236 = (class17) client.field410.method2258()) {
                                    if (var236.field168.equals(var226)) {
                                        if (var228 != 0 && var236.field176 == 0) {
                                            var236.method2266();
                                            var235 = false;
                                        } else if (var228 == 0 && var236.field176 != 0) {
                                            var236.method2266();
                                            var235 = false;
                                        }
                                    }
                                }
                                if (var235) {
                                    client.field410.method2256(new class17(var226, var228));
                                }
                                var234.field151 = var228;
                            }
                            var234.field152 = var227;
                            var234.field150 = var229;
                            var234.field160 = var231;
                            var234.field149 = var232;
                            var226 = null;
                            break;
                        }
                    }
                    if (var226 != null && client.field546 < 400) {
                        class15 var237 = new class15();
                        client.field548[client.field546] = var237;
                        var237.field158 = var226;
                        var237.field152 = var227;
                        var237.field151 = var228;
                        var237.field150 = var229;
                        var237.field160 = var231;
                        var237.field149 = var232;
                        client.field546++;
                    }
                }
                client.field334 = 2;
                client.field471 = client.field463;
                boolean var238 = false;
                int var239 = client.field546;
                while (var239 > 0) {
                    boolean var240 = true;
                    var239--;
                    for (int var241 = 0; var241 < var239; var241++) {
                        boolean var242 = false;
                        class15 var243 = client.field548[var241];
                        class15 var244 = client.field548[var241 + 1];
                        if (client.field329 != var243.field151 && client.field329 == var244.field151) {
                            var242 = true;
                        }
                        if (!var242 && var243.field151 == 0 && var244.field151 != 0) {
                            var242 = true;
                        }
                        if (!var242 && !var243.field160 && var244.field160) {
                            var242 = true;
                        }
                        if (!var242 && !var243.field149 && var244.field149) {
                            var242 = true;
                        }
                        if (var242) {
                            class15 var245 = client.field548[var241];
                            client.field548[var241] = client.field548[var241 + 1];
                            client.field548[var241 + 1] = var245;
                            var240 = false;
                        }
                    }
                    if (var240) {
                        break;
                    }
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 47) {
                int var246 = client.field324.method2769();
                client.field438 = var246;
                client.method118(false);
                client.method24(var246);
                class33.method2120(client.field438);
                for (int var247 = 0; var247 < 100; var247++) {
                    client.field483[var247] = true;
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 169) {
                client.field324.field2267 += 28;
                if (client.field324.method2755()) {
                    class167 var248 = client.field324;
                    int var249 = client.field324.field2267 - 28;
                    if (class105.field1694 != null) {
                        try {
                            class105.field1694.method1318(0L);
                            class105.field1694.method1308(var248.field2258, var249, 24);
                        } catch (Exception var311) {
                        }
                    }
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 236) {
                int var251 = client.field324.method2868();
                class151 var252 = class151.method744(var251);
                var252.field2093 = 3;
                var252.field2094 = field1425.field244.method2543();
                client.method29(var252);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 216) {
                for (int var253 = 0; var253 < field2756; var253++) {
                    class188 var254 = class188.method1927(var253);
                    if (var254 != null) {
                        class147.field2010[var253] = 0;
                        class147.field2012[var253] = 0;
                    }
                }
                client.method639();
                client.field562 += 32;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 28) {
                client.field472 = client.field463;
                if (client.field325 == 0) {
                    client.field300 = null;
                    client.field506 = null;
                    field1190 = 0;
                    field1464 = null;
                    client.field287 = -1;
                    return true;
                }
                client.field506 = client.field324.method2740();
                long var255 = client.field324.method2738();
                client.field300 = class206.method1098(var255);
                field2292 = client.field324.method2734();
                int var257 = client.field324.method2733();
                if (var257 == 255) {
                    client.field287 = -1;
                    return true;
                }
                field1190 = var257;
                class25[] var258 = new class25[100];
                for (int var259 = 0; var259 < field1190; var259++) {
                    var258[var259] = new class25();
                    var258[var259].field271 = client.field324.method2740();
                    var258[var259].field269 = class205.method3535(var258[var259].field271, field283);
                    var258[var259].field276 = client.field324.method2735();
                    var258[var259].field272 = client.field324.method2734();
                    client.field324.method2740();
                    if (var258[var259].field271.equals(field1425.field262)) {
                        field2266 = var258[var259].field272;
                    }
                }
                boolean var260 = false;
                int var261 = field1190;
                while (var261 > 0) {
                    boolean var262 = true;
                    var261--;
                    for (int var263 = 0; var263 < var261; var263++) {
                        if (var258[var263].field269.compareTo(var258[var263 + 1].field269) > 0) {
                            class25 var264 = var258[var263];
                            var258[var263] = var258[var263 + 1];
                            var258[var263 + 1] = var264;
                            var262 = false;
                        }
                    }
                    if (var262) {
                        break;
                    }
                }
                field1464 = var258;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 177) {
                for (int var265 = 0; var265 < client.field399.length; var265++) {
                    if (client.field399[var265] != null) {
                        client.field399[var265].field623 = -1;
                    }
                }
                for (int var266 = 0; var266 < client.field317.length; var266++) {
                    if (client.field317[var266] != null) {
                        client.field317[var266].field623 = -1;
                    }
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 227) {
                int var267 = client.field324.method2868();
                int var268 = client.field324.method2868();
                if (field111 == null || !field111.isValid()) {
                    try {
                        Iterator var269 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var269.hasNext()) {
                            GarbageCollectorMXBean var270 = (GarbageCollectorMXBean) var269.next();
                            if (var270.isValid()) {
                                field111 = var270;
                                client.field557 = -1L;
                                client.field350 = -1L;
                            }
                        }
                    } catch (Throwable var315) {
                    }
                }
                long var272 = class163.method225();
                int var274 = -1;
                if (field111 != null) {
                    long var275 = field111.getCollectionTime();
                    if (client.field350 != -1L) {
                        long var277 = var275 - client.field350;
                        long var279 = var272 - client.field557;
                        if (var279 != 0L) {
                            var274 = (int) (var277 * 100L / var279);
                        }
                    }
                    client.field350 = var275;
                    client.field557 = var272;
                }
                client.field322.method2993(50);
                client.field322.method2863(var267);
                client.field322.method2775(var268);
                client.field322.method2758(var274);
                client.field322.method2757(client.field1772);
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 133) {
                int var281 = client.field324.method2868();
                int var282 = client.field324.method2735();
                if (var281 < -70000) {
                    var282 += 32768;
                }
                class151 var283;
                if (var281 >= 0) {
                    var283 = class151.method744(var281);
                } else {
                    var283 = null;
                }
                if (var283 != null) {
                    for (int var284 = 0; var284 < var283.field2168.length; var284++) {
                        var283.field2168[var284] = 0;
                        var283.field2163[var284] = 0;
                    }
                }
                class13 var285 = (class13) class13.field122.method2171((long) var282);
                if (var285 != null) {
                    for (int var286 = 0; var286 < var285.field123.length; var286++) {
                        var285.field123[var286] = -1;
                        var285.field118[var286] = 0;
                    }
                }
                int var287 = client.field324.method2735();
                for (int var288 = 0; var288 < var287; var288++) {
                    int var289 = client.field324.method2898();
                    if (var289 == 255) {
                        var289 = client.field324.method2938();
                    }
                    int var290 = client.field324.method2769();
                    if (var283 != null && var288 < var283.field2168.length) {
                        var283.field2168[var288] = var290;
                        var283.field2163[var288] = var289;
                    }
                    class13.method95(var282, var288, var290 - 1, var289);
                }
                if (var283 != null) {
                    client.method29(var283);
                }
                client.method639();
                client.field404[++client.field467 - 1 & 0x1F] = var282 & 0x7FFF;
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 144) {
                int var291 = client.field324.method2745();
                boolean var292 = client.field324.method2733() == 1;
                String var293 = "";
                boolean var294 = false;
                if (var292) {
                    var293 = client.field324.method2740();
                    if (client.method21(var293)) {
                        var294 = true;
                    }
                }
                String var295 = client.field324.method2740();
                if (!var294) {
                    class48.method888(var291, var293, var295);
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 226) {
                client.field527 = true;
                field2636 = client.field324.method2733();
                field1724 = client.field324.method2733();
                field1570 = client.field324.method2735();
                field400 = client.field324.method2733();
                field960 = client.field324.method2733();
                if (field960 >= 100) {
                    int var296 = field2636 * 128 + 64;
                    int var297 = field1724 * 128 + 64;
                    int var298 = client.method1789(var296, var297, field937) - field1570;
                    int var299 = var296 - field3056;
                    int var300 = var298 - field716;
                    int var301 = var297 - field173;
                    int var302 = (int) Math.sqrt((double) (var299 * var299 + var301 * var301));
                    field2796 = (int) (Math.atan2((double) var300, (double) var302) * 325.949D) & 0x7FF;
                    field37 = (int) (Math.atan2((double) var299, (double) var301) * -325.949D) & 0x7FF;
                    if (field2796 < 128) {
                        field2796 = 128;
                    }
                    if (field2796 > 383) {
                        field2796 = 383;
                    }
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 154) {
                String var303 = client.field324.method2740();
                int var304 = client.field324.method2868();
                class151 var305 = class151.method744(var304);
                if (!var303.equals(var305.field2144)) {
                    var305.field2144 = var303;
                    client.method29(var305);
                }
                client.field287 = -1;
                return true;
            }
            if (client.field287 == 38) {
                int var306 = client.field324.method2938();
                field1650 = field1094.method1846(var306);
                client.field287 = -1;
                return true;
            }
            class102.method706("" + client.field287 + class38.field779 + client.field330 + class38.field779 + client.field331 + class38.field779 + client.field325, (Throwable) null);
            client.method2032();
        } catch (IOException var321) {
            client.method17();
        } catch (Exception var322) {
            String var309 = "" + client.field287 + class38.field779 + client.field330 + class38.field779 + client.field331 + class38.field779 + client.field325 + class38.field779 + (field1792 + field1425.field629[0]) + class38.field779 + (field663 + field1425.field641[0]) + class38.field779;
            for (int var310 = 0; var310 < client.field325 && var310 < 50; var310++) {
                var309 = var309 + client.field324.field2258[var310] + class38.field779;
            }
            class102.method706(var309, var322);
            client.method2032();
        }
        return true;
    }

    @ObfuscatedName("j.by(III)V")
    public static final void method75(int arg0, int arg1) {
        if (client.field418 < 2 && client.field526 == 0 && !client.field433) {
            return;
        }
        String var2;
        if (client.field526 == 1 && client.field418 < 2) {
            var2 = class174.field2489 + class174.field2499 + client.field432 + " " + class38.field783;
        } else if (client.field433 && client.field418 < 2) {
            var2 = client.field436 + class174.field2499 + client.field437 + " " + class38.field783;
        } else {
            int var3 = client.field418 - 1;
            String var4;
            if (client.field370[var3].length() > 0) {
                var4 = client.field423[var3] + class174.field2499 + client.field370[var3];
            } else {
                var4 = client.field423[var3];
            }
            var2 = var4;
        }
        if (client.field418 > 2) {
            var2 = var2 + class38.method2958(16777215) + " " + '/' + " " + (client.field418 - 2) + class174.field2493;
        }
        field177.method3709(var2, arg0 + 4, arg1 + 15, 16777215, 0, client.field454 / 1000);
    }

    @ObfuscatedName("ar.cm([Lee;IIIIIIIII)V")
    public static final void method735(class151[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class220.method3752(arg2, arg3, arg4, arg5);
        class85.method1556();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class151 var10 = arg0[var9];
            if (var10 != null && (var10.field2127 == arg1 || arg1 == -1412584499 && client.field451 == var10)) {
                int var11;
                if (arg8 == -1) {
                    client.field340[client.field289] = var10.field2143 + arg6;
                    client.field277[client.field289] = var10.field2064 + arg7;
                    client.field488[client.field289] = var10.field2108;
                    client.field489[client.field289] = var10.field2169;
                    var11 = ++client.field289 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2181 = var11;
                var10.field2182 = client.field454;
                if (!var10.field2049 || !method871(var10)) {
                    if (var10.field2061 > 0) {
                        int var12 = var10.field2061;
                        if (var12 == 324) {
                            if (client.field553 == -1) {
                                client.field553 = var10.field2085;
                                client.field296 = var10.field2063;
                            }
                            if (client.field552.field2017) {
                                var10.field2085 = client.field553;
                            } else {
                                var10.field2085 = client.field296;
                            }
                        } else if (var12 == 325) {
                            if (client.field553 == -1) {
                                client.field553 = var10.field2085;
                                client.field296 = var10.field2063;
                            }
                            if (client.field552.field2017) {
                                var10.field2085 = client.field296;
                            } else {
                                var10.field2085 = client.field553;
                            }
                        } else if (var12 == 327) {
                            var10.field2101 = 150;
                            var10.field2102 = (int) (Math.sin((double) client.field454 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2093 = 5;
                            var10.field2094 = 0;
                        } else if (var12 == 328) {
                            var10.field2101 = 150;
                            var10.field2102 = (int) (Math.sin((double) client.field454 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2093 = 5;
                            var10.field2094 = 1;
                        }
                    }
                    int var13 = var10.field2143 + arg6;
                    int var14 = var10.field2064 + arg7;
                    int var15 = var10.field2178;
                    if (client.field451 == var10) {
                        if (arg1 != -1412584499 && !var10.field2173) {
                            field1079 = arg0;
                            field52 = arg6;
                            field722 = arg7;
                            continue;
                        }
                        if (client.field461 && client.field389) {
                            int var16 = class116.field1800;
                            int var17 = class116.field1795;
                            int var18 = var16 - client.field453;
                            int var19 = var17 - client.field361;
                            if (var18 < client.field457) {
                                var18 = client.field457;
                            }
                            if (var10.field2108 + var18 > client.field457 + client.field421.field2108) {
                                var18 = client.field457 + client.field421.field2108 - var10.field2108;
                            }
                            if (var19 < client.field458) {
                                var19 = client.field458;
                            }
                            if (var10.field2169 + var19 > client.field458 + client.field421.field2169) {
                                var19 = client.field458 + client.field421.field2169 - var10.field2169;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2173) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2089 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2089 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2108 + var13;
                        int var27 = var10.field2169 + var14;
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
                        int var30 = var10.field2108 + var13;
                        int var31 = var10.field2169 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2049 || var20 < var22 && var21 < var23) {
                        if (var10.field2061 != 0) {
                            if (var10.field2061 == 1336) {
                                if (client.field442) {
                                    var14 += 15;
                                    field962.method3674("Fps:" + client.field1772, var10.field2108 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && client.field279) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !client.field279) {
                                        var34 = 16711680;
                                    }
                                    field962.method3674("Mem:" + var33 + "k", var10.field2108 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2061 == 1337) {
                                client.field425 = var13;
                                client.field426 = var14;
                                client.method712(var13, var14, var10.field2108, var10.field2169);
                                client.field483[var10.field2181] = true;
                                class220.method3752(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2061 == 1338) {
                                client.method201(var10, var13, var14, var11);
                                class220.method3752(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2061 == 1339) {
                                class146 var35 = var10.method2584(false);
                                if (var35 != null) {
                                    if (client.field515 < 3) {
                                        field181.method3879(var13, var14, var35.field2008, var35.field2005, 25, 25, client.field363, 256, var35.field2007, var35.field2004);
                                    } else {
                                        class220.method3771(var13, var14, 0, var35.field2007, var35.field2004);
                                    }
                                }
                                class220.method3752(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2089 == 0) {
                            if (!var10.field2049 && method871(var10) && field1908 != var10) {
                                continue;
                            }
                            if (!var10.field2049) {
                                if (var10.field2072 > var10.field2111 - var10.field2169) {
                                    var10.field2072 = var10.field2111 - var10.field2169;
                                }
                                if (var10.field2072 < 0) {
                                    var10.field2072 = 0;
                                }
                            }
                            method735(arg0, var10.field2050, var20, var21, var22, var23, var13 - var10.field2095, var14 - var10.field2072, var11);
                            if (var10.field2174 != null) {
                                method735(var10.field2174, var10.field2050, var20, var21, var22, var23, var13 - var10.field2095, var14 - var10.field2072, var11);
                            }
                            class18 var36 = (class18) client.field439.method2171((long) var10.field2050);
                            if (var36 != null) {
                                client.method1899(var36.field184, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class220.method3752(arg2, arg3, arg4, arg5);
                            class85.method1556();
                        }
                        if (client.field492 || client.field537[var11] || client.field490 > 1) {
                            if (var10.field2089 == 0 && !var10.field2049 && var10.field2111 > var10.field2169) {
                                int var37 = var10.field2108 + var13;
                                int var38 = var10.field2072;
                                int var39 = var10.field2169;
                                int var40 = var10.field2111;
                                field3220[0].method3829(var37, var14);
                                field3220[1].method3829(var37, var14 + var39 - 16);
                                class220.method3783(var37, var14 + 16, 16, var39 - 32, client.field491);
                                int var41 = (var39 - 32) * var39 / var40;
                                if (var41 < 8) {
                                    var41 = 8;
                                }
                                int var42 = (var39 - 32 - var41) * var38 / (var40 - var39);
                                class220.method3783(var37, var14 + 16 + var42, 16, var41, client.field357);
                                class220.method3802(var37, var14 + 16 + var42, var41, client.field359);
                                class220.method3802(var37 + 1, var14 + 16 + var42, var41, client.field359);
                                class220.method3766(var37, var14 + 16 + var42, 16, client.field359);
                                class220.method3766(var37, var14 + 17 + var42, 16, client.field359);
                                class220.method3802(var37 + 15, var14 + 16 + var42, var41, client.field358);
                                class220.method3802(var37 + 14, var14 + 17 + var42, var41 - 1, client.field358);
                                class220.method3766(var37, var14 + 15 + var42 + var41, 16, client.field358);
                                class220.method3766(var37 + 1, var14 + 14 + var42 + var41, 15, client.field358);
                            }
                            if (var10.field2089 != 1) {
                                if (var10.field2089 == 2) {
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < var10.field2062; var44++) {
                                        for (int var45 = 0; var45 < var10.field2052; var45++) {
                                            int var46 = (var10.field2119 + 32) * var45 + var13;
                                            int var47 = (var10.field2117 + 32) * var44 + var14;
                                            if (var43 < 20) {
                                                var46 += var10.field2118[var43];
                                                var47 += var10.field2110[var43];
                                            }
                                            if (var10.field2168[var43] > 0) {
                                                boolean var48 = false;
                                                boolean var49 = false;
                                                int var50 = var10.field2168[var43] - 1;
                                                if (var46 + 32 > arg2 && var46 < arg4 && var47 + 32 > arg3 && var47 < arg5 || field2666 == var10 && client.field392 == var43) {
                                                    class225 var51;
                                                    if (client.field526 == 1 && field430 == var43 && field2314 == var10.field2050) {
                                                        var51 = class199.method1797(var50, var10.field2163[var43], 2, 0, 2, false);
                                                    } else {
                                                        var51 = class199.method1797(var50, var10.field2163[var43], 1, 3153952, 2, false);
                                                    }
                                                    if (var51 == null) {
                                                        client.method29(var10);
                                                    } else if (field2666 == var10 && client.field392 == var43) {
                                                        int var52 = class116.field1800 - client.field393;
                                                        int var53 = class116.field1795 - client.field498;
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (var53 < 5 && var53 > -5) {
                                                            var53 = 0;
                                                        }
                                                        if (client.field396 < 5) {
                                                            var52 = 0;
                                                            var53 = 0;
                                                        }
                                                        var51.method3874(var46 + var52, var47 + var53, 128);
                                                        if (arg1 != -1) {
                                                            class151 var54 = arg0[arg1 & 0xFFFF];
                                                            if (var47 + var53 < class220.field3173 && var54.field2072 > 0) {
                                                                int var55 = client.field355 * (class220.field3173 - var47 - var53) / 3;
                                                                if (var55 > client.field355 * 10) {
                                                                    var55 = client.field355 * 10;
                                                                }
                                                                if (var55 > var54.field2072) {
                                                                    var55 = var54.field2072;
                                                                }
                                                                var54.field2072 -= var55;
                                                                client.field498 += var55;
                                                                client.method29(var54);
                                                            }
                                                            if (var47 + var53 + 32 > class220.field3170 && var54.field2072 < var54.field2111 - var54.field2169) {
                                                                int var56 = client.field355 * (var47 + var53 + 32 - class220.field3170) / 3;
                                                                if (var56 > client.field355 * 10) {
                                                                    var56 = client.field355 * 10;
                                                                }
                                                                if (var56 > var54.field2111 - var54.field2169 - var54.field2072) {
                                                                    var56 = var54.field2111 - var54.field2169 - var54.field2072;
                                                                }
                                                                var54.field2072 += var56;
                                                                client.field498 -= var56;
                                                                client.method29(var54);
                                                            }
                                                        }
                                                    } else if (field709 == var10 && client.field391 == var43) {
                                                        var51.method3874(var46, var47, 128);
                                                    } else {
                                                        var51.method3875(var46, var47);
                                                    }
                                                }
                                            } else if (var10.field2123 != null && var43 < 20) {
                                                class225 var57 = var10.method2635(var43);
                                                if (var57 != null) {
                                                    var57.method3875(var46, var47);
                                                } else if (class151.field2048) {
                                                    client.method29(var10);
                                                }
                                            }
                                            var43++;
                                        }
                                    }
                                } else if (var10.field2089 == 3) {
                                    int var58;
                                    if (client.method3053(var10)) {
                                        var58 = var10.field2076;
                                        if (field1908 == var10 && var10.field2078 != 0) {
                                            var58 = var10.field2078;
                                        }
                                    } else {
                                        var58 = var10.field2151;
                                        if (field1908 == var10 && var10.field2077 != 0) {
                                            var58 = var10.field2077;
                                        }
                                    }
                                    if (var10.field2100) {
                                        switch(var10.field2080.field3186) {
                                            case 1:
                                                class220.method3796(var13, var14, var10.field2108, var10.field2169, var10.field2151, var10.field2076, 256 - (var10.field2178 & 0xFF), 256 - (var10.field2082 & 0xFF));
                                                break;
                                            case 2:
                                                class220.method3760(var13, var14, var10.field2108, var10.field2169, var10.field2151, var10.field2076, 256 - (var10.field2178 & 0xFF), 256 - (var10.field2082 & 0xFF));
                                                break;
                                            case 3:
                                                class220.method3761(var13, var14, var10.field2108, var10.field2169, var10.field2151, var10.field2076, 256 - (var10.field2178 & 0xFF), 256 - (var10.field2082 & 0xFF));
                                                break;
                                            case 4:
                                                class220.method3762(var13, var14, var10.field2108, var10.field2169, var10.field2151, var10.field2076, 256 - (var10.field2178 & 0xFF), 256 - (var10.field2082 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class220.method3783(var13, var14, var10.field2108, var10.field2169, var58);
                                                } else {
                                                    class220.method3757(var13, var14, var10.field2108, var10.field2169, var58, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class220.method3764(var13, var14, var10.field2108, var10.field2169, var58);
                                    } else {
                                        class220.method3765(var13, var14, var10.field2108, var10.field2169, var58, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2089 == 4) {
                                    class209 var59 = var10.method2586();
                                    if (var59 != null) {
                                        String var60 = var10.field2144;
                                        int var61;
                                        if (client.method3053(var10)) {
                                            var61 = var10.field2076;
                                            if (field1908 == var10 && var10.field2078 != 0) {
                                                var61 = var10.field2078;
                                            }
                                            if (var10.field2069.length() > 0) {
                                                var60 = var10.field2069;
                                            }
                                        } else {
                                            var61 = var10.field2151;
                                            if (field1908 == var10 && var10.field2077 != 0) {
                                                var61 = var10.field2077;
                                            }
                                        }
                                        if (var10.field2049 && var10.field2066 != -1) {
                                            class199 var62 = class199.method2569(var10.field2066);
                                            var60 = var62.field2938;
                                            if (var60 == null) {
                                                var60 = "null";
                                            }
                                            if ((var62.field2968 == 1 || var10.field2171 != 1) && var10.field2171 != -1) {
                                                var60 = class38.method2958(16748608) + var60 + class38.field785 + " " + 'x' + client.method616(var10.field2171);
                                            }
                                        }
                                        if (client.field310 == var10) {
                                            class174 var10000 = (class174) null;
                                            var60 = class174.field2455;
                                            var61 = var10.field2151;
                                        }
                                        if (!var10.field2049) {
                                            var60 = client.method216(var60, var10);
                                        }
                                        var59.method3658(var60, var13, var14, var10.field2108, var10.field2169, var61, var10.field2164 ? 0 : -1, var10.field2113, var10.field2081, var10.field2114);
                                    } else if (class151.field2048) {
                                        client.method29(var10);
                                    }
                                } else if (var10.field2089 == 5) {
                                    if (var10.field2049) {
                                        class225 var64;
                                        if (var10.field2066 == -1) {
                                            var64 = var10.method2629(false);
                                        } else {
                                            var64 = class199.method1797(var10.field2066, var10.field2171, var10.field2116, var10.field2090, var10.field2058, false);
                                        }
                                        if (var64 != null) {
                                            int var65 = var64.field3206;
                                            int var66 = var64.field3211;
                                            if (var10.field2088) {
                                                class220.method3753(var13, var14, var10.field2108 + var13, var10.field2169 + var14);
                                                int var67 = (var10.field2108 + (var65 - 1)) / var65;
                                                int var68 = (var10.field2169 + (var66 - 1)) / var66;
                                                for (int var69 = 0; var69 < var67; var69++) {
                                                    for (int var70 = 0; var70 < var68; var70++) {
                                                        if (var10.field2079 != 0) {
                                                            var64.method3881(var65 / 2 + var65 * var69 + var13, var66 / 2 + var66 * var70 + var14, var10.field2079, 4096);
                                                        } else if (var15 == 0) {
                                                            var64.method3875(var65 * var69 + var13, var66 * var70 + var14);
                                                        } else {
                                                            var64.method3874(var65 * var69 + var13, var66 * var70 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class220.method3752(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var71 = var10.field2108 * 4096 / var65;
                                                if (var10.field2079 != 0) {
                                                    var64.method3881(var10.field2108 / 2 + var13, var10.field2169 / 2 + var14, var10.field2079, var71);
                                                } else if (var15 != 0) {
                                                    var64.method3876(var13, var14, var10.field2108, var10.field2169, 256 - (var15 & 0xFF));
                                                } else if (var10.field2108 == var65 && var10.field2169 == var66) {
                                                    var64.method3875(var13, var14);
                                                } else {
                                                    var64.method3870(var13, var14, var10.field2108, var10.field2169);
                                                }
                                            }
                                        } else if (class151.field2048) {
                                            client.method29(var10);
                                        }
                                    } else {
                                        class225 var63 = var10.method2629(client.method3053(var10));
                                        if (var63 != null) {
                                            var63.method3875(var13, var14);
                                        } else if (class151.field2048) {
                                            client.method29(var10);
                                        }
                                    }
                                } else if (var10.field2089 == 6) {
                                    boolean var72 = client.method3053(var10);
                                    int var73;
                                    if (var72) {
                                        var73 = var10.field2075;
                                    } else {
                                        var73 = var10.field2165;
                                    }
                                    class83 var74 = null;
                                    int var75 = 0;
                                    if (var10.field2066 != -1) {
                                        class199 var76 = class199.method2569(var10.field2066);
                                        if (var76 != null) {
                                            class199 var77 = var76.method3437(var10.field2171);
                                            var74 = var77.method3432(1);
                                            if (var74 == null) {
                                                client.method29(var10);
                                            } else {
                                                var74.method1482();
                                                var75 = var74.field1544 / 2;
                                            }
                                        }
                                    } else if (var10.field2093 == 5) {
                                        if (var10.field2094 == 0) {
                                            var74 = client.field552.method2545((class202) null, -1, (class202) null, -1);
                                        } else {
                                            var74 = field1425.method258();
                                        }
                                    } else if (var73 == -1) {
                                        var74 = var10.method2621((class202) null, -1, var72, field1425.field244);
                                        if (var74 == null && class151.field2048) {
                                            client.method29(var10);
                                        }
                                    } else {
                                        class202 var78 = class202.method1368(var73);
                                        var74 = var10.method2621(var78, var10.field2055, var72, field1425.field244);
                                        if (var74 == null && class151.field2048) {
                                            client.method29(var10);
                                        }
                                    }
                                    class85.method1560(var10.field2108 / 2 + var13, var10.field2169 / 2 + var14);
                                    int var79 = var10.field2104 * class85.field1429[var10.field2101] >> 16;
                                    int var80 = var10.field2104 * class85.field1453[var10.field2101] >> 16;
                                    if (var74 != null) {
                                        if (var10.field2049) {
                                            var74.method1482();
                                            if (var10.field2122) {
                                                var74.method1495(0, var10.field2102, var10.field2103, var10.field2101, var10.field2161, var10.field2115 + var75 + var79, var10.field2115 + var80, var10.field2104);
                                            } else {
                                                var74.method1494(0, var10.field2102, var10.field2103, var10.field2101, var10.field2161, var10.field2115 + var75 + var79, var10.field2115 + var80);
                                            }
                                        } else {
                                            var74.method1494(0, var10.field2102, 0, var10.field2101, 0, var79, var80);
                                        }
                                    }
                                    class85.method1559();
                                } else {
                                    if (var10.field2089 == 7) {
                                        class209 var81 = var10.method2586();
                                        if (var81 == null) {
                                            if (class151.field2048) {
                                                client.method29(var10);
                                            }
                                            continue;
                                        }
                                        int var82 = 0;
                                        for (int var83 = 0; var83 < var10.field2062; var83++) {
                                            for (int var84 = 0; var84 < var10.field2052; var84++) {
                                                if (var10.field2168[var82] > 0) {
                                                    class199 var85 = class199.method2569(var10.field2168[var82] - 1);
                                                    String var86;
                                                    if (var85.field2968 != 1 && var10.field2163[var82] == 1) {
                                                        var86 = class38.method2958(16748608) + var85.field2938 + class38.field785;
                                                    } else {
                                                        var86 = class38.method2958(16748608) + var85.field2938 + class38.field785 + " " + 'x' + client.method616(var10.field2163[var82]);
                                                    }
                                                    int var87 = (var10.field2119 + 115) * var84 + var13;
                                                    int var88 = (var10.field2117 + 12) * var83 + var14;
                                                    if (var10.field2113 == 0) {
                                                        var81.method3699(var86, var87, var88, var10.field2151, var10.field2164 ? 0 : -1);
                                                    } else if (var10.field2113 == 1) {
                                                        var81.method3657(var86, var10.field2108 / 2 + var87, var88, var10.field2151, var10.field2164 ? 0 : -1);
                                                    } else {
                                                        var81.method3674(var86, var10.field2108 + var87 - 1, var88, var10.field2151, var10.field2164 ? 0 : -1);
                                                    }
                                                }
                                                var82++;
                                            }
                                        }
                                    }
                                    if (var10.field2089 == 8 && field1894 == var10 && client.field456 == client.field427) {
                                        int var89 = 0;
                                        int var90 = 0;
                                        class209 var91 = field962;
                                        String var92 = var10.field2144;
                                        String var93 = client.method216(var92, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class38.field781);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            int var96 = var91.method3667(var95);
                                            if (var96 > var89) {
                                                var89 = var96;
                                            }
                                            var90 += var91.field3087 + 1;
                                        }
                                        var89 += 6;
                                        var90 += 7;
                                        int var97 = var10.field2108 + var13 - 5 - var89;
                                        int var98 = var10.field2169 + var14 + 5;
                                        if (var97 < var13 + 5) {
                                            var97 = var13 + 5;
                                        }
                                        if (var89 + var97 > arg4) {
                                            var97 = arg4 - var89;
                                        }
                                        if (var90 + var98 > arg5) {
                                            var98 = arg5 - var90;
                                        }
                                        class220.method3783(var97, var98, var89, var90, 16777120);
                                        class220.method3764(var97, var98, var89, var90, 0);
                                        String var99 = var10.field2144;
                                        int var100 = var91.field3087 + var98 + 2;
                                        String var101 = client.method216(var99, var10);
                                        while (var101.length() > 0) {
                                            int var102 = var101.indexOf(class38.field781);
                                            String var103;
                                            if (var102 == -1) {
                                                var103 = var101;
                                                var101 = "";
                                            } else {
                                                var103 = var101.substring(0, var102);
                                                var101 = var101.substring(var102 + 4);
                                            }
                                            var91.method3699(var103, var97 + 3, var100, 0, -1);
                                            var100 += var91.field3087 + 1;
                                        }
                                    }
                                    if (var10.field2089 == 9) {
                                        if (var10.field2083 == 1) {
                                            int var104;
                                            int var105;
                                            int var106;
                                            int var107;
                                            if (var10.field2084) {
                                                var104 = var13;
                                                var105 = var10.field2169 + var14;
                                                var106 = var10.field2108 + var13;
                                                var107 = var14;
                                            } else {
                                                var104 = var13;
                                                var105 = var14;
                                                var106 = var10.field2108 + var13;
                                                var107 = var10.field2169 + var14;
                                            }
                                            class220.method3770(var104, var105, var106, var107, var10.field2151);
                                        } else {
                                            int var108 = var10.field2108 >= 0 ? var10.field2108 : -var10.field2108;
                                            int var109 = var10.field2169 >= 0 ? var10.field2169 : -var10.field2169;
                                            int var110 = var108;
                                            if (var108 < var109) {
                                                var110 = var109;
                                            }
                                            if (var110 != 0) {
                                                int var111 = (var10.field2108 << 16) / var110;
                                                int var112 = (var10.field2169 << 16) / var110;
                                                if (var112 <= var111) {
                                                    var111 = -var111;
                                                } else {
                                                    var112 = -var112;
                                                }
                                                int var113 = var10.field2083 * var112 >> 17;
                                                int var114 = var10.field2083 * var112 + 1 >> 17;
                                                int var115 = var10.field2083 * var111 >> 17;
                                                int var116 = var10.field2083 * var111 + 1 >> 17;
                                                int var117 = var13 + var113;
                                                int var118 = var13 - var114;
                                                int var119 = var10.field2108 + var13 - var114;
                                                int var120 = var10.field2108 + var13 + var113;
                                                int var121 = var14 + var115;
                                                int var122 = var14 - var116;
                                                int var123 = var10.field2169 + var14 - var116;
                                                int var124 = var10.field2169 + var14 + var115;
                                                class85.method1565(var117, var118, var119);
                                                class85.method1597(var121, var122, var123, var117, var118, var119, var10.field2151);
                                                class85.method1565(var117, var119, var120);
                                                class85.method1597(var121, var123, var124, var117, var119, var120, var10.field2151);
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

    @ObfuscatedName("az.er(Lee;I)Z")
    public static boolean method871(class151 arg0) {
        if (client.field487) {
            if (client.method1786(arg0) != 0) {
                return false;
            }
            if (arg0.field2089 == 0) {
                return false;
            }
        }
        return arg0.field2070;
    }
}
