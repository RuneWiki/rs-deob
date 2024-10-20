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
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("bv.as")
    public static int[] field1002;

    @ObfuscatedName("bv.v")
    public static float[] field1003;

    @ObfuscatedName("bv.t")
    public static float[] field1005;

    @ObfuscatedName("bv.av")
    public static float[] field1006;

    @ObfuscatedName("bv.aw")
    public static float[] field1007;

    @ObfuscatedName("bv.p")
    public static int field1009;

    @ObfuscatedName("bv.ai")
    public static int[] field1010;

    @ObfuscatedName("bv.l")
    public static class53[] field1011;

    @ObfuscatedName("bm.z")
    public static int[] field1028;

    @ObfuscatedName("bm.q")
    public static int[] field1029;

    @ObfuscatedName("bm.l")
    public static boolean[] field1030;

    @ObfuscatedName("bl.n")
    public static int field1032;

    @ObfuscatedName("bl.m")
    public static int field1033;

    @ObfuscatedName("bl.d")
    public static boolean field1047;

    @ObfuscatedName("l.ds")
    public static byte[][] field105;

    @ObfuscatedName("l.h")
    public static byte[][][] field106;

    @ObfuscatedName("l.w")
    public static byte[][][] field107;

    @ObfuscatedName("br.mx")
    public static int field1073;

    @ObfuscatedName("br.ah")
    public static int field1076;

    @ObfuscatedName("l.c")
    public static byte[][][] field108;

    @ObfuscatedName("ba.rv")
    public static boolean field1084;

    @ObfuscatedName("ba.nu")
    public static int field1086;

    @ObfuscatedName("bu.qc")
    public static int field1104;

    @ObfuscatedName("bu.s")
    public static String[] field1106;

    @ObfuscatedName("bh.p")
    public static float field1129;

    @ObfuscatedName("bh.g")
    public static int field1130;

    @ObfuscatedName("l.nf")
    public static class58 field115;

    @ObfuscatedName("bq.y")
    public static int[] field1180;

    @ObfuscatedName("bs.cy")
    public static class111 field1184;

    @ObfuscatedName("bs.h")
    public static String[] field1189;

    @ObfuscatedName("bc.bm")
    public static class185 field1203;

    @ObfuscatedName("y.pc")
    public static int field126;

    @ObfuscatedName("ck.u")
    public static int[] field1283;

    @ObfuscatedName("y.np")
    public static int field129;

    @ObfuscatedName("ck.jc")
    public static int field1290;

    @ObfuscatedName("ck.t")
    public static int[] field1291;

    @ObfuscatedName("ck.ct")
    public static class209 field1294;

    @ObfuscatedName("d.r")
    public static class183 field13;

    @ObfuscatedName("cd.x")
    public static int[] field1309;

    @ObfuscatedName("cw.pz")
    public static class31 field1344;

    @ObfuscatedName("ca.bn")
    public static int field1401;

    @ObfuscatedName("ca.bt")
    public static int field1402;

    @ObfuscatedName("ca.bv")
    public static int field1403;

    @ObfuscatedName("cc.qi")
    public static class110 field1415;

    @ObfuscatedName("cs.e")
    public static int field1430;

    @ObfuscatedName("cs.q")
    public static int field1432;

    @ObfuscatedName("cs.y")
    public static int field1434;

    @ObfuscatedName("cs.l")
    public static int field1436;

    @ObfuscatedName("cs.f")
    public static int field1437;

    @ObfuscatedName("cs.s")
    public static int field1438;

    @ObfuscatedName("cs.o")
    public static int field1439;

    @ObfuscatedName("cs.x")
    public static int field1440;

    @ObfuscatedName("cs.b")
    public static class94 field1442;

    @ObfuscatedName("cy.ie")
    public static int field1449;

    @ObfuscatedName("cp.da")
    public static int field1465;

    @ObfuscatedName("cp.c")
    public static int field1466;

    @ObfuscatedName("cp.dp")
    public static int[] field1469;

    @ObfuscatedName("cu.bm")
    public static int field1478;

    @ObfuscatedName("x.ix")
    public static int field148;

    @ObfuscatedName("cu.av")
    public static int field1486;

    @ObfuscatedName("cu.i")
    public static int field1488;

    @ObfuscatedName("cu.a")
    public static int field1491;

    @ObfuscatedName("cu.j")
    public static int field1493;

    @ObfuscatedName("cu.k")
    public static int field1494;

    @ObfuscatedName("cu.v")
    public static int field1495;

    @ObfuscatedName("cu.u")
    public static int field1496;

    @ObfuscatedName("cu.t")
    public static int field1497;

    @ObfuscatedName("cu.b")
    public static int field1498;

    @ObfuscatedName("cu.o")
    public static int field1499;

    @ObfuscatedName("cu.ay")
    public static int field1500;

    @ObfuscatedName("cu.as")
    public static int field1501;

    @ObfuscatedName("cu.bi")
    public static int field1505;

    @ObfuscatedName("x.aj")
    public static class225[] field151;

    @ObfuscatedName("cu.aw")
    public static int field1524;

    @ObfuscatedName("cu.s")
    public static int field1525;

    @ObfuscatedName("cu.bd")
    public static boolean[][] field1527;

    @ObfuscatedName("cu.bl")
    public static int field1529;

    @ObfuscatedName("cu.bo")
    public static int field1530;

    @ObfuscatedName("cu.by")
    public static int field1531;

    @ObfuscatedName("cu.br")
    public static int field1532;

    @ObfuscatedName("cz.nk")
    public static int field1536;

    @ObfuscatedName("cz.pg")
    public static class231 field1537;

    @ObfuscatedName("cb.qq")
    public static Font field1548;

    @ObfuscatedName("ch.ei")
    public static class225 field1556;

    @ObfuscatedName("cj.ee")
    public static class223[] field1564;

    @ObfuscatedName("cj.p")
    public static int field1567;

    @ObfuscatedName("f.nn")
    public static class58 field157;

    @ObfuscatedName("f.py")
    public static class104 field160;

    @ObfuscatedName("cv.pu")
    public static Clipboard field1601;

    @ObfuscatedName("cv.gv")
    public static class151 field1604;

    @ObfuscatedName("cm.gi")
    public static class151 field1615;

    @ObfuscatedName("cm.bf")
    public static FontMetrics field1618;

    @ObfuscatedName("cl.f")
    public static String field1630;

    @ObfuscatedName("cx.n")
    public static Applet field1644;

    @ObfuscatedName("cx.d")
    public static String field1645;

    @ObfuscatedName("cx.qy")
    public static int field1649;

    @ObfuscatedName("cx.g")
    public static int field1650;

    @ObfuscatedName("cx.m")
    public static int field1651;

    @ObfuscatedName("cx.pd")
    public static GarbageCollectorMXBean field1652;

    @ObfuscatedName("ci.d")
    public static String field1668;

    @ObfuscatedName("ci.x")
    public static int field1672;

    @ObfuscatedName("ci.n")
    public static String field1673;

    @ObfuscatedName("de.w")
    public static File field1677;

    @ObfuscatedName("s.er")
    public static class225[] field168;

    @ObfuscatedName("de.h")
    public static File field1680;

    @ObfuscatedName("de.f")
    public static String[] field1686;

    @ObfuscatedName("de.e")
    public static class73[] field1689;

    @ObfuscatedName("de.fa")
    public static int field1691;

    @ObfuscatedName("s.qp")
    public static int field170;

    @ObfuscatedName("s.de")
    public static int field171;

    @ObfuscatedName("df.iu")
    public static class151 field1724;

    @ObfuscatedName("da.ql")
    public static Canvas field1726;

    @ObfuscatedName("da.d")
    public static File field1727;

    @ObfuscatedName("da.q")
    public static int[] field1729;

    @ObfuscatedName("da.v")
    public static class21 field1730;

    @ObfuscatedName("da.i")
    public static int[] field1731;

    @ObfuscatedName("dt.cs")
    public static class103 field1737;

    @ObfuscatedName("dt.z")
    public static class229 field1741;

    @ObfuscatedName("do.ew")
    public static class225[] field1746;

    @ObfuscatedName("dk.nt")
    public static int field1759;

    @ObfuscatedName("o.ma")
    public static byte field176;

    @ObfuscatedName("dr.a")
    public static class161 field1767;

    @ObfuscatedName("dr.w")
    public static int field1768;

    @ObfuscatedName("o.cp")
    public static class111 field177;

    @ObfuscatedName("db.z")
    public static int field1793;

    @ObfuscatedName("dy.p")
    public static short[][] field1824;

    @ObfuscatedName("dn.r")
    public static int field1838;

    @ObfuscatedName("dl.aw")
    public static int[] field1849;

    @ObfuscatedName("ey.z")
    public static short[][] field1909;

    @ObfuscatedName("ey.a")
    public static int[] field1910;

    @ObfuscatedName("ey.ao")
    public static class223[] field1912;

    @ObfuscatedName("ez.d")
    public static class183 field1914;

    @ObfuscatedName("ez.n")
    public static class183 field1915;

    @ObfuscatedName("ez.m")
    public static class183 field1916;

    @ObfuscatedName("ez.c")
    public static int field1919;

    @ObfuscatedName("ez.h")
    public static class140 field1920;

    @ObfuscatedName("ez.il")
    public static int field1921;

    @ObfuscatedName("ez.ak")
    public static long field1923;

    @ObfuscatedName("ei.bn")
    public static class223[] field1925;

    @ObfuscatedName("ei.ar")
    public static class185 field1953;

    @ObfuscatedName("i.bp")
    public static String field196;

    @ObfuscatedName("m.im")
    public static class39 field20;

    @ObfuscatedName("er.nm")
    public static int field2007;

    @ObfuscatedName("er.nd")
    public static class52 field2008;

    @ObfuscatedName("i.j")
    public static int[] field201;

    @ObfuscatedName("er.ao")
    public static class185 field2016;

    @ObfuscatedName("ek.na")
    public static int field2022;

    @ObfuscatedName("ev.bt")
    public static class185 field2037;

    @ObfuscatedName("ev.c")
    public static short[] field2042;

    @ObfuscatedName("ev.db")
    public static int[] field2045;

    @ObfuscatedName("ev.f")
    public static class161 field2047;

    @ObfuscatedName("eg.ba")
    public static class185 field2051;

    @ObfuscatedName("eu.m")
    public static class183 field2060;

    @ObfuscatedName("eu.r")
    public static class183 field2063;

    @ObfuscatedName("eu.h")
    public static class183 field2067;

    @ObfuscatedName("eu.w")
    public static class183 field2072;

    @ObfuscatedName("a.j")
    public static String field212;

    @ObfuscatedName("b.ez")
    public static class225 field214;

    @ObfuscatedName("eu.n")
    public static class151[][] field2173;

    @ObfuscatedName("eu.d")
    public static boolean[] field2180;

    @ObfuscatedName("m.pt")
    public static long field22;

    @ObfuscatedName("b.bq")
    public static int field220;

    @ObfuscatedName("b.ha")
    public static int field221;

    @ObfuscatedName("fu.cx")
    public static class209 field2237;

    @ObfuscatedName("fu.ia")
    public static int field2239;

    @ObfuscatedName("j.fx")
    public static int field224;

    @ObfuscatedName("fu.bl")
    public static class185 field2241;

    @ObfuscatedName("fr.dl")
    public static class88 field2244;

    @ObfuscatedName("fa.l")
    public static class145 field2289;

    @ObfuscatedName("j.ab")
    public static boolean field230;

    @ObfuscatedName("fy.d")
    public static long field2307;

    @ObfuscatedName("fy.z")
    public static int[] field2308;

    @ObfuscatedName("fy.e")
    public static class182 field2309;

    @ObfuscatedName("j.qx")
    public static Frame field231;

    @ObfuscatedName("fy.n")
    public static long field2310;

    @ObfuscatedName("fi.ga")
    public static class151 field2314;

    @ObfuscatedName("fq.cu")
    public static char field2318;

    @ObfuscatedName("fq.mj")
    public static class25[] field2321;

    @ObfuscatedName("fm.qa")
    public static int field2323;

    @ObfuscatedName("fm.gr")
    public static int field2326;

    @ObfuscatedName("ff.px")
    public static int field2340;

    @ObfuscatedName("j.rg")
    public static String field235;

    @ObfuscatedName("fe.eg")
    public static class223[] field2358;

    @ObfuscatedName("fe.bt")
    public static class223[] field2359;

    @ObfuscatedName("j.g")
    public static short[] field236;

    @ObfuscatedName("fg.bn")
    public static class185 field2364;

    @ObfuscatedName("fg.w")
    public static class183 field2368;

    @ObfuscatedName("k.dn")
    public static byte[][] field240;

    @ObfuscatedName("k.al")
    public static String field243;

    @ObfuscatedName("m.ce")
    public static int field26;

    @ObfuscatedName("fd.pa")
    public static short[] field2660;

    @ObfuscatedName("fn.jk")
    public static int field2686;

    @ObfuscatedName("fn.b")
    public static String field2689;

    @ObfuscatedName("fp.g")
    public static class223[] field2707;

    @ObfuscatedName("gn.kr")
    public static class113 field2733;

    @ObfuscatedName("gn.q")
    public static class209 field2734;

    @ObfuscatedName("u.mg")
    public static byte field274;

    @ObfuscatedName("ge.m")
    public static long field2748;

    @ObfuscatedName("u.bi")
    public static class185 field276;

    @ObfuscatedName("ge.n")
    public static class111 field2762;

    @ObfuscatedName("gx.aj")
    public static class185 field2767;

    @ObfuscatedName("gx.n")
    public static class183 field2769;

    @ObfuscatedName("gt.d")
    public static int field2774;

    @ObfuscatedName("gt.n")
    public static class183 field2776;

    @ObfuscatedName("gt.x")
    public static int[][][] field2779;

    @ObfuscatedName("gb.u")
    public static int[] field2781;

    @ObfuscatedName("gb.n")
    public static class183 field2783;

    @ObfuscatedName("gz.bo")
    public static class185 field2789;

    @ObfuscatedName("u.hm")
    public static int field279;

    @ObfuscatedName("gz.n")
    public static class183 field2790;

    @ObfuscatedName("gz.bj")
    public static class185 field2792;

    @ObfuscatedName("gz.ep")
    public static class223[] field2794;

    @ObfuscatedName("gf.d")
    public static class183 field2796;

    @ObfuscatedName("gf.n")
    public static class183 field2808;

    @ObfuscatedName("gi.n")
    public static class183 field2813;

    @ObfuscatedName("gc.m")
    public static int field2819;

    @ObfuscatedName("client.d")
    public static client field282;

    @ObfuscatedName("gc.d")
    public static class183 field2821;

    @ObfuscatedName("gc.n")
    public static class183 field2830;

    @ObfuscatedName("gk.d")
    public static class183 field2833;

    @ObfuscatedName("gk.n")
    public static class183 field2844;

    @ObfuscatedName("ga.n")
    public static class183 field2852;

    @ObfuscatedName("client.c")
    public static class179 field286;

    @ObfuscatedName("gv.n")
    public static class183 field2865;

    @ObfuscatedName("gs.d")
    public static class183 field2867;

    @ObfuscatedName("gs.n")
    public static class183 field2882;

    @ObfuscatedName("gs.m")
    public static class183 field2889;

    @ObfuscatedName("gh.m")
    public static class183 field2893;

    @ObfuscatedName("client.o")
    public static int field291;

    @ObfuscatedName("gh.d")
    public static class183 field2913;

    @ObfuscatedName("client.i")
    public static int field292;

    @ObfuscatedName("gy.h")
    public static class183 field2943;

    @ObfuscatedName("gy.r")
    public static boolean field2944;

    @ObfuscatedName("gg.d")
    public static class183 field2994;

    @ObfuscatedName("h.ko")
    public static class47 field30;

    @ObfuscatedName("gg.n")
    public static class183 field3000;

    @ObfuscatedName("gu.n")
    public static class183 field3033;

    @ObfuscatedName("gm.m")
    public static class183 field3045;

    @ObfuscatedName("gm.n")
    public static class183 field3050;

    @ObfuscatedName("gw.e")
    public static int[] field3065;

    @ObfuscatedName("gr.l")
    public static int[] field3076;

    @ObfuscatedName("gl.z")
    public static class27 field3081;

    @ObfuscatedName("hv.z")
    public static class223[] field3095;

    @ObfuscatedName("hz.n")
    public static class153 field3109;

    @ObfuscatedName("client.an")
    public static class111 field314;

    @ObfuscatedName("hl.r")
    public static int field3159;

    @ObfuscatedName("hk.aa")
    public static class103 field3162;

    @ObfuscatedName("hb.av")
    public static int field3167;

    @ObfuscatedName("hb.aw")
    public static int field3168;

    @ObfuscatedName("hb.t")
    public static int[] field3171;

    @ObfuscatedName("client.by")
    public static class185 field318;

    @ObfuscatedName("hg.qb")
    public static int field3198;

    @ObfuscatedName("client.be")
    public static class185 field320;

    @ObfuscatedName("hi.p")
    public static int[] field3211;

    @ObfuscatedName("hi.d")
    public static int field3212;

    @ObfuscatedName("hi.n")
    public static int field3213;

    @ObfuscatedName("hi.h")
    public static int[] field3214;

    @ObfuscatedName("hi.w")
    public static int[] field3215;

    @ObfuscatedName("hi.r")
    public static int[] field3216;

    @ObfuscatedName("hi.m")
    public static int field3217;

    @ObfuscatedName("hi.g")
    public static byte[][] field3219;

    @ObfuscatedName("hi.c")
    public static int[] field3220;

    @ObfuscatedName("ht.h")
    public static class64 field3281;

    @ObfuscatedName("ht.d")
    public static class183 field3282;

    @ObfuscatedName("h.dd")
    public static int field33;

    @ObfuscatedName("client.br")
    public static class185 field333;

    @ObfuscatedName("h.pl")
    public static class2 field34;

    @ObfuscatedName("h.ne")
    public static class66 field36;

    @ObfuscatedName("client.fr")
    public static int field360;

    @ObfuscatedName("h.ej")
    public static class225[] field38;

    @ObfuscatedName("client.bv")
    public static class185 field414;

    @ObfuscatedName("w.fu")
    public static int field42;

    @ObfuscatedName("w.cf")
    public static class209 field46;

    @ObfuscatedName("client.df")
    public static int field464;

    @ObfuscatedName("w.ek")
    public static class225[] field48;

    @ObfuscatedName("r.p")
    public static byte[][][] field52;

    @ObfuscatedName("r.bx")
    public static int field56;

    @ObfuscatedName("client.fc")
    public static int field568;

    @ObfuscatedName("client.la")
    public static class217 field569;

    @ObfuscatedName("c.q")
    public static class223 field57;

    @ObfuscatedName("t.jd")
    public static int field577;

    @ObfuscatedName("av.a")
    public static String field592;

    @ObfuscatedName("p.pe")
    public static int field61;

    @ObfuscatedName("p.qe")
    public static int field64;

    @ObfuscatedName("aw.ni")
    public static int field653;

    @ObfuscatedName("ay.ea")
    public static class225[] field658;

    @ObfuscatedName("p.dv")
    public static int field66;

    @ObfuscatedName("ay.dy")
    public static int[][] field666;

    @ObfuscatedName("as.w")
    public static class30[] field681;

    @ObfuscatedName("g.z")
    public static class223 field70;

    @ObfuscatedName("ac.m")
    public static int[] field717;

    @ObfuscatedName("g.qw")
    public static Image field72;

    @ObfuscatedName("ac.q")
    public static class151 field724;

    @ObfuscatedName("ac.dm")
    public static int[] field729;

    @ObfuscatedName("g.av")
    public static int[] field73;

    @ObfuscatedName("ag.q")
    public static boolean field743;

    @ObfuscatedName("ag.qt")
    public static class221 field744;

    @ObfuscatedName("ag.bd")
    public static class185 field747;

    @ObfuscatedName("am.iz")
    public static int field758;

    @ObfuscatedName("am.g")
    public static class180 field759;

    @ObfuscatedName("am.y")
    public static class61 field761;

    @ObfuscatedName("af.bs")
    public static int field771;

    @ObfuscatedName("af.az")
    public static class103 field773;

    @ObfuscatedName("g.y")
    public static boolean field78;

    @ObfuscatedName("ap.hx")
    public static int field782;

    @ObfuscatedName("ap.nz")
    public static int field788;

    @ObfuscatedName("az.r")
    public static byte[][][] field798;

    @ObfuscatedName("az.b")
    public static int[] field801;

    @ObfuscatedName("ab.iw")
    public static class151 field803;

    @ObfuscatedName("ax.dj")
    public static int field808;

    @ObfuscatedName("ax.he")
    public static class24 field810;

    @ObfuscatedName("ax.fk")
    public static int field813;

    @ObfuscatedName("ad.m")
    public static class223 field819;

    @ObfuscatedName("ad.h")
    public static class223 field820;

    @ObfuscatedName("ad.w")
    public static class223[] field821;

    @ObfuscatedName("ad.r")
    public static class225 field822;

    @ObfuscatedName("ad.c")
    public static class225 field823;

    @ObfuscatedName("ad.p")
    public static class223 field824;

    @ObfuscatedName("ad.n")
    public static boolean field832;

    @ObfuscatedName("z.nj")
    public static int field84;

    @ObfuscatedName("ad.bv")
    public static class223 field842;

    @ObfuscatedName("ah.hp")
    public static int field879;

    @ObfuscatedName("z.ev")
    public static class225[] field88;

    @ObfuscatedName("ah.md")
    public static class225 field880;

    @ObfuscatedName("ah.bc")
    public static int field881;

    @ObfuscatedName("al.qn")
    public static int field883;

    @ObfuscatedName("aa.pj")
    public static class117 field896;

    @ObfuscatedName("q.s")
    public static String field92;

    @ObfuscatedName("au.ff")
    public static int field927;

    @ObfuscatedName("au.l")
    public static class151 field930;

    @ObfuscatedName("ak.g")
    public static int[][] field934;

    @ObfuscatedName("ar.nw")
    public static int field949;

    @ObfuscatedName("ar.qd")
    public static int field954;

    @ObfuscatedName("aj.jt")
    public static class151[] field964;

    @ObfuscatedName("q.el")
    public static class225[] field97;

    @ObfuscatedName("bv.ay")
    public static float[] field984;

    @ObfuscatedName("bv.u")
    public static float[] field985;

    @ObfuscatedName("bv.c")
    public static byte[] field986;

    @ObfuscatedName("bv.g")
    public static int field988;

    @ObfuscatedName("bv.z")
    public static int field989;

    @ObfuscatedName("bv.q")
    public static int field990;

    @ObfuscatedName("bv.y")
    public static class57[] field991;

    @ObfuscatedName("bv.k")
    public static float[] field992;

    @ObfuscatedName("bv.e")
    public static class65[] field993;

    @ObfuscatedName("bv.x")
    public static class70[] field994;

    @ObfuscatedName("bv.f")
    public static boolean[] field995;

    @ObfuscatedName("bv.s")
    public static int[] field996;

    @ObfuscatedName("n.n(J)V")
    public static final void method13(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L != 0L) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var7) {
            }
            return;
        }
        long var2 = arg0 - 1L;
        try {
            Thread.sleep(var2);
        } catch (InterruptedException var9) {
        }
        try {
            Thread.sleep(1L);
        } catch (InterruptedException var8) {
        }
    }

    @ObfuscatedName("cx.n([Lfs;IB)Lfs;")
    public static class166 method1856(class166[] arg0, int arg1) {
        class166[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class166 var4 = var2[var3];
            if (arg1 == var4.method759()) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("gc.d(Lfa;Ljava/lang/String;I)I")
    public static int method3321(class161 arg0, String arg1) {
        int var2 = arg0.field2285;
        int var3 = arg1.length();
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            char var6 = arg1.charAt(var5);
            if (!(var6 <= 0 || var6 >= 128) || !(var6 < 160 || var6 > 255)) {
                var4[var5] = (byte) var6;
            } else if (var6 == 8364) {
                var4[var5] = -128;
            } else if (var6 == 8218) {
                var4[var5] = -126;
            } else if (var6 == 402) {
                var4[var5] = -125;
            } else if (var6 == 8222) {
                var4[var5] = -124;
            } else if (var6 == 8230) {
                var4[var5] = -123;
            } else if (var6 == 8224) {
                var4[var5] = -122;
            } else if (var6 == 8225) {
                var4[var5] = -121;
            } else if (var6 == 710) {
                var4[var5] = -120;
            } else if (var6 == 8240) {
                var4[var5] = -119;
            } else if (var6 == 352) {
                var4[var5] = -118;
            } else if (var6 == 8249) {
                var4[var5] = -117;
            } else if (var6 == 338) {
                var4[var5] = -116;
            } else if (var6 == 381) {
                var4[var5] = -114;
            } else if (var6 == 8216) {
                var4[var5] = -111;
            } else if (var6 == 8217) {
                var4[var5] = -110;
            } else if (var6 == 8220) {
                var4[var5] = -109;
            } else if (var6 == 8221) {
                var4[var5] = -108;
            } else if (var6 == 8226) {
                var4[var5] = -107;
            } else if (var6 == 8211) {
                var4[var5] = -106;
            } else if (var6 == 8212) {
                var4[var5] = -105;
            } else if (var6 == 732) {
                var4[var5] = -104;
            } else if (var6 == 8482) {
                var4[var5] = -103;
            } else if (var6 == 353) {
                var4[var5] = -102;
            } else if (var6 == 8250) {
                var4[var5] = -101;
            } else if (var6 == 339) {
                var4[var5] = -100;
            } else if (var6 == 382) {
                var4[var5] = -98;
            } else if (var6 == 376) {
                var4[var5] = -97;
            } else {
                var4[var5] = 63;
            }
        }
        arg0.method2778(var4.length);
        arg0.field2285 += field3109.method2704(var4, 0, var4.length, arg0.field2291, arg0.field2285);
        return arg0.field2285 - var2;
    }

    @ObfuscatedName("cy.d(IIB)V")
    public static void method1646(int arg0, int arg1) {
        class195 var2 = class195.method3079(arg0);
        int var3 = var2.field2851;
        int var4 = var2.field2849;
        int var5 = var2.field2853;
        int var6 = class147.field2035[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        class147.field2032[var3] = class147.field2032[var3] & ~var7 | arg1 << var4 & var7;
    }

    @ObfuscatedName("as.q(I)V")
    public static void method635() {
        Object var0 = class184.field2730;
        synchronized (class184.field2730) {
            if (class184.field2735 != 0) {
                class184.field2735 = 1;
                try {
                    class184.field2730.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }

    @ObfuscatedName("f.m(B)V")
    public static void method193() {
        class106 var0 = class106.field1723;
        synchronized (class106.field1723) {
            class106.field1721++;
            class106.field1700 = class106.field1697;
            class106.field1717 = 0;
            if (class106.field1719 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    class106.field1710[var1] = false;
                }
                class106.field1719 = class106.field1712;
            } else {
                while (class106.field1719 != class106.field1712) {
                    int var2 = class106.field1711[class106.field1712];
                    class106.field1712 = class106.field1712 + 1 & 0x7F;
                    if (var2 < 0) {
                        class106.field1710[~var2] = false;
                    } else {
                        if (!class106.field1710[var2] && class106.field1717 < class106.field1716.length - 1) {
                            class106.field1716[++class106.field1717 - 1] = var2;
                        }
                        class106.field1710[var2] = true;
                    }
                }
            }
            class106.field1697 = class106.field1715;
        }
    }

    @ObfuscatedName("do.i(B)V")
    public static final void method1965() {
        try {
            if (client.field453 == 0) {
                if (field1184 != null) {
                    field1184.method1984();
                    field1184 = null;
                }
                field1737 = null;
                client.field426 = false;
                client.field323 = 0;
                client.field453 = 1;
            }
            if (client.field453 == 1) {
                if (field1737 == null) {
                    field1737 = field160.method1865(field196, field56);
                }
                if (field1737.field1662 == 2) {
                    throw new IOException();
                }
                if (field1737.field1662 == 1) {
                    field1184 = new class111((Socket) field1737.field1664, field160);
                    field1737 = null;
                    client.field453 = 2;
                }
            }
            if (client.field453 == 2) {
                client.field331.field2285 = 0;
                client.field331.method2765(14);
                field1184.method1970(client.field331.field2291, 0, 1);
                client.field371.field2285 = 0;
                client.field453 = 3;
            }
            if (client.field453 == 3) {
                if (field115 != null) {
                    field115.method1014();
                }
                if (field157 != null) {
                    field157.method1014();
                }
                int var0 = field1184.method1967();
                if (field115 != null) {
                    field115.method1014();
                }
                if (field157 != null) {
                    field157.method1014();
                }
                if (var0 != 0) {
                    client.method1993(var0);
                    return;
                }
                client.field371.field2285 = 0;
                client.field453 = 5;
            }
            if (client.field453 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                client.field331.field2285 = 0;
                client.field331.method2765(1);
                client.field331.method2765(class42.field843.method759());
                client.field331.method2768(var1[0]);
                client.field331.method2768(var1[1]);
                client.field331.method2768(var1[2]);
                client.field331.method2768(var1[3]);
                switch(class42.field843.field1633) {
                    case 0:
                        client.field331.field2285 += 8;
                        break;
                    case 1:
                        client.field331.method2768((Integer) field1344.field694.get(class208.method2714(class42.field841)));
                        client.field331.field2285 += 4;
                        break;
                    case 2:
                    case 3:
                        client.field331.method2767(field1076);
                        client.field331.field2285 += 5;
                }
                client.field331.method2771(class42.field835);
                client.field331.method2846(class40.field802, class40.field804);
                client.field332.field2285 = 0;
                if (client.field293 == 40) {
                    client.field332.method2765(18);
                } else {
                    client.field332.method2765(16);
                }
                client.field332.method2766(0);
                int var2 = client.field332.field2285;
                client.field332.method2768(127);
                client.field332.method2774(client.field331.field2291, 0, client.field331.field2285);
                int var3 = client.field332.field2285;
                client.field332.method2771(class42.field841);
                client.field332.method2765((client.field500 ? 1 : 0) << 1 | (client.field289 ? 1 : 0));
                client.field332.method2766(field170);
                client.field332.method2766(field1104);
                class105.method735(client.field332);
                client.field332.method2771(field92);
                client.field332.method2768(field291);
                class161 var4 = new class161(field1537.method4053());
                field1537.method4052(var4);
                client.field332.method2774(var4.field2291, 0, var4.field2291.length);
                client.field332.method2765(field292);
                client.field332.method2768(field1953.field2721);
                client.field332.method2768(field2767.field2721);
                client.field332.method2768(field2016.field2721);
                client.field332.method2768(field2364.field2721);
                client.field332.method2768(field2037.field2721);
                client.field332.method2768(field414.field2721);
                client.field332.method2768(field747.field2721);
                client.field332.method2768(field1203.field2721);
                client.field332.method2768(field2241.field2721);
                client.field332.method2768(field2789.field2721);
                client.field332.method2768(field318.field2721);
                client.field332.method2768(field333.field2721);
                client.field332.method2768(field276.field2721);
                client.field332.method2768(field320.field2721);
                client.field332.method2768(field2051.field2721);
                client.field332.method2768(field2792.field2721);
                client.field332.method2799(var1, var3, client.field332.field2285);
                client.field332.method2917(client.field332.field2285 - var2);
                field1184.method1970(client.field332.field2291, 0, client.field332.field2285);
                client.field331.method3009(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                client.field371.method3009(var1);
                client.field453 = 6;
            }
            if (client.field453 == 6 && field1184.method1968() > 0) {
                int var6 = field1184.method1967();
                if (var6 == 21 && client.field293 == 20) {
                    client.field453 = 7;
                } else if (var6 == 2) {
                    client.field453 = 9;
                } else if (var6 == 15 && client.field293 == 40) {
                    client.field565 = -1;
                    client.field453 = 13;
                } else if (var6 == 23 && client.field324 < 1) {
                    client.field324++;
                    client.field453 = 0;
                } else if (var6 == 29) {
                    client.field453 = 11;
                } else {
                    client.method1993(var6);
                    return;
                }
            }
            if (client.field453 == 7 && field1184.method1968() > 0) {
                client.field325 = (field1184.method1967() + 3) * 60;
                client.field453 = 8;
            }
            if (client.field453 == 8) {
                client.field323 = 0;
                class42.method45(class174.field2596, class174.field2407, client.field325 / 60 + class174.field2408);
                if (--client.field325 <= 0) {
                    client.field453 = 0;
                }
            } else {
                if (client.field453 == 9 && field1184.method1968() >= 13) {
                    boolean var7 = field1184.method1967() == 1;
                    field1184.method1969(client.field371.field2291, 0, 4);
                    client.field371.field2285 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = client.field371.method3011() << 24;
                        int var10 = var9 | client.field371.method3011() << 16;
                        int var11 = var10 | client.field371.method3011() << 8;
                        int var12 = var11 | client.field371.method3011();
                        int var13 = class208.method2714(class42.field841);
                        if (field1344.field694.size() >= 10 && !field1344.field694.containsKey(var13)) {
                            Iterator var14 = field1344.field694.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        field1344.field694.put(var13, var12);
                        class31.method43();
                    }
                    client.field504 = field1184.method1967();
                    client.field334 = field1184.method1967() == 1;
                    client.field410 = field1184.method1967();
                    client.field410 <<= 0x8;
                    client.field410 += field1184.method1967();
                    client.field411 = field1184.method1967();
                    field1184.method1969(client.field371.field2291, 0, 1);
                    client.field371.field2285 = 0;
                    client.field335 = client.field371.method3011();
                    field1184.method1969(client.field371.field2291, 0, 2);
                    client.field371.field2285 = 0;
                    client.field565 = client.field371.method2887();
                    try {
                        client var15 = field282;
                        JSObject.getWindow(var15).call("zap", (Object[]) null);
                    } catch (Throwable var37) {
                    }
                    client.field453 = 10;
                }
                if (client.field453 != 10) {
                    if (client.field453 == 11 && field1184.method1968() >= 2) {
                        client.field371.field2285 = 0;
                        field1184.method1969(client.field371.field2291, 0, 2);
                        client.field371.field2285 = 0;
                        field881 = client.field371.method2887();
                        client.field453 = 12;
                    }
                    if (client.field453 == 12 && field1184.method1968() >= field881) {
                        client.field371.field2285 = 0;
                        field1184.method1969(client.field371.field2291, 0, field881);
                        client.field371.field2285 = 0;
                        String var28 = client.field371.method2847();
                        String var29 = client.field371.method2847();
                        String var30 = client.field371.method2847();
                        class42.method45(var28, var29, var30);
                        client.method3231(10);
                    }
                    if (client.field453 == 13) {
                        if (client.field565 == -1) {
                            if (field1184.method1968() < 2) {
                                return;
                            }
                            field1184.method1969(client.field371.field2291, 0, 2);
                            client.field371.field2285 = 0;
                            client.field565 = client.field371.method2887();
                        }
                        if (field1184.method1968() >= client.field565) {
                            field1184.method1969(client.field371.field2291, 0, client.field565);
                            client.field371.field2285 = 0;
                            int var31 = client.field565;
                            client.field331.field2285 = 0;
                            client.field371.field2285 = 0;
                            client.field335 = -1;
                            client.field483 = -1;
                            client.field339 = -1;
                            client.field340 = -1;
                            client.field565 = 0;
                            client.field336 = 0;
                            client.field302 = 0;
                            client.field428 = 0;
                            client.field427 = false;
                            client.field522 = 0;
                            client.field520 = 0;
                            for (int var32 = 0; var32 < 2048; var32++) {
                                client.field409[var32] = null;
                            }
                            field810 = null;
                            for (int var33 = 0; var33 < client.field461.length; var33++) {
                                class36 var34 = client.field461[var33];
                                if (var34 != null) {
                                    var34.field642 = -1;
                                    var34.field623 = false;
                                }
                            }
                            class13.method2357();
                            client.method3231(30);
                            for (int var35 = 0; var35 < 100; var35++) {
                                client.field491[var35] = true;
                            }
                            client.method722();
                            class46.method702(client.field371);
                            if (client.field371.field2285 != var31) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        client.field323++;
                        if (client.field323 > 2000) {
                            if (client.field324 < 1) {
                                if (field56 == field220) {
                                    field56 = field771;
                                } else {
                                    field56 = field220;
                                }
                                client.field324++;
                                client.field453 = 0;
                            } else {
                                client.method1993(-3);
                            }
                        }
                    }
                } else if (field1184.method1968() >= client.field565) {
                    client.field371.field2285 = 0;
                    field1184.method1969(client.field371.field2291, 0, client.field565);
                    client.field296 = 1L;
                    client.field299 = -1;
                    field1730.field215 = 0;
                    field1084 = true;
                    client.field288 = true;
                    client.field512 = -1L;
                    class228.method758();
                    client.field331.field2285 = 0;
                    client.field371.field2285 = 0;
                    client.field335 = -1;
                    client.field483 = -1;
                    client.field339 = -1;
                    client.field340 = -1;
                    client.field336 = 0;
                    client.field302 = 0;
                    client.field406 = 0;
                    client.field303 = 0;
                    client.field428 = 0;
                    client.field427 = false;
                    class116.method616(0);
                    class48.field929.clear();
                    class48.field926.method2196();
                    class48.field931.method2346();
                    class48.field928 = 0;
                    client.field439 = 0;
                    client.field441 = false;
                    client.field528 = 0;
                    client.field352 = (int) (Math.random() * 100.0D) - 50;
                    client.field354 = (int) (Math.random() * 110.0D) - 55;
                    client.field356 = (int) (Math.random() * 80.0D) - 40;
                    client.field359 = (int) (Math.random() * 120.0D) - 60;
                    client.field361 = (int) (Math.random() * 30.0D) - 20;
                    client.field373 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    client.field522 = 0;
                    client.field515 = -1;
                    client.field520 = 0;
                    client.field312 = 0;
                    client.field311 = class41.field807;
                    client.field488 = class41.field807;
                    client.field327 = 0;
                    class46.method1836();
                    for (int var17 = 0; var17 < 2048; var17++) {
                        client.field409[var17] = null;
                    }
                    for (int var18 = 0; var18 < 32768; var18++) {
                        client.field461[var18] = null;
                    }
                    client.field526 = -1;
                    client.field511.method2277();
                    client.field422.method2277();
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 104; var20++) {
                            for (int var21 = 0; var21 < 104; var21++) {
                                client.field419[var19][var20][var21] = null;
                            }
                        }
                    }
                    client.field420 = new class129();
                    client.field554 = 0;
                    client.field517 = 0;
                    client.field557 = 0;
                    for (int var22 = 0; var22 < field2774; var22++) {
                        class188 var23 = class188.method3084(var22);
                        if (var23 != null) {
                            class147.field2030[var22] = 0;
                            class147.field2032[var22] = 0;
                        }
                    }
                    field30.method822();
                    client.field460 = -1;
                    if (client.field391 != -1) {
                        class151.method2553(client.field391);
                    }
                    for (class18 var24 = (class18) client.field447.method2238(); var24 != null; var24 = (class18) client.field447.method2233()) {
                        client.method69(var24, true);
                    }
                    client.field391 = -1;
                    client.field447 = new class126(8);
                    client.field450 = null;
                    client.field427 = false;
                    client.field428 = 0;
                    client.field416.method2584((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var25 = 0; var25 < 8; var25++) {
                        client.field415[var25] = null;
                        client.field435[var25] = false;
                    }
                    class13.method2357();
                    client.field281 = true;
                    for (int var26 = 0; var26 < 100; var26++) {
                        client.field491[var26] = true;
                    }
                    client.method722();
                    client.field513 = null;
                    field1073 = 0;
                    field2321 = null;
                    for (int var27 = 0; var27 < 8; var27++) {
                        client.field562[var27] = new class5();
                    }
                    field34 = null;
                    class46.method702(client.field371);
                    field808 = -1;
                    client.method118(false);
                    client.field335 = -1;
                }
            }
        } catch (IOException var38) {
            if (client.field324 < 1) {
                if (field56 == field220) {
                    field56 = field771;
                } else {
                    field56 = field220;
                }
                client.field324++;
                client.field453 = 0;
            } else {
                client.method1993(-2);
            }
        }
    }
}
