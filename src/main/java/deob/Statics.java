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
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;

public class Statics {

    @ObfuscatedName("x.am")
    public static class185 field1;

    @ObfuscatedName("bj.j")
    public static byte[] field1006;

    @ObfuscatedName("bj.m")
    public static int field1007;

    @ObfuscatedName("bj.a")
    public static int field1008;

    @ObfuscatedName("bj.s")
    public static int field1010;

    @ObfuscatedName("bj.k")
    public static class53[] field1011;

    @ObfuscatedName("bj.f")
    public static class57[] field1012;

    @ObfuscatedName("bj.o")
    public static class65[] field1013;

    @ObfuscatedName("bj.ab")
    public static float[] field1014;

    @ObfuscatedName("bj.h")
    public static float[] field1016;

    @ObfuscatedName("bj.i")
    public static int field1020;

    @ObfuscatedName("bj.d")
    public static float[] field1023;

    @ObfuscatedName("bj.z")
    public static float[] field1024;

    @ObfuscatedName("bj.t")
    public static float[] field1025;

    @ObfuscatedName("bj.c")
    public static boolean[] field1026;

    @ObfuscatedName("bj.ac")
    public static float[] field1027;

    @ObfuscatedName("bj.au")
    public static float[] field1028;

    @ObfuscatedName("bj.al")
    public static int[] field1029;

    @ObfuscatedName("bj.ae")
    public static int[] field1030;

    @ObfuscatedName("bj.b")
    public static int[] field1031;

    @ObfuscatedName("bj.q")
    public static class70[] field1032;

    @ObfuscatedName("br.k")
    public static boolean[] field1041;

    @ObfuscatedName("br.i")
    public static int[] field1048;

    @ObfuscatedName("br.s")
    public static int[] field1049;

    @ObfuscatedName("bn.v")
    public static class64 field1052;

    @ObfuscatedName("bn.g")
    public static int field1053;

    @ObfuscatedName("bn.x")
    public static int field1054;

    @ObfuscatedName("bn.n")
    public static boolean field1060;

    @ObfuscatedName("bn.qc")
    public static class221 field1074;

    @ObfuscatedName("f.hx")
    public static int field110;

    @ObfuscatedName("bb.qq")
    public static int field1107;

    @ObfuscatedName("bb.rj")
    public static Image field1109;

    @ObfuscatedName("f.dd")
    public static int[][] field111;

    @ObfuscatedName("f.av")
    public static String field112;

    @ObfuscatedName("bm.i")
    public static short[][] field1125;

    @ObfuscatedName("bm.k")
    public static int[] field1128;

    @ObfuscatedName("bm.qf")
    public static int field1129;

    @ObfuscatedName("bk.a")
    public static int field1148;

    @ObfuscatedName("bk.m")
    public static float field1152;

    @ObfuscatedName("bo.qx")
    public static int field1194;

    @ObfuscatedName("bo.bq")
    public static int field1206;

    @ObfuscatedName("bh.kv")
    public static class170[] field1213;

    @ObfuscatedName("bh.qg")
    public static Font field1215;

    @ObfuscatedName("cw.bb")
    public static class185 field1309;

    @ObfuscatedName("o.nr")
    public static int field131;

    @ObfuscatedName("o.cq")
    public static int field132;

    @ObfuscatedName("ci.q")
    public static int[] field1327;

    @ObfuscatedName("o.rt")
    public static boolean field134;

    @ObfuscatedName("cn.bu")
    public static class185 field1359;

    @ObfuscatedName("cj.by")
    public static int field1418;

    @ObfuscatedName("cj.bf")
    public static int field1419;

    @ObfuscatedName("cj.bj")
    public static int field1420;

    @ObfuscatedName("q.ds")
    public static class88 field144;

    @ObfuscatedName("cm.o")
    public static int field1446;

    @ObfuscatedName("cm.s")
    public static int field1448;

    @ObfuscatedName("cm.k")
    public static int field1449;

    @ObfuscatedName("cm.f")
    public static int field1450;

    @ObfuscatedName("cm.q")
    public static int field1451;

    @ObfuscatedName("cm.b")
    public static int field1452;

    @ObfuscatedName("cm.c")
    public static int field1453;

    @ObfuscatedName("cm.u")
    public static class94 field1458;

    @ObfuscatedName("cm.w")
    public static int field1459;

    @ObfuscatedName("q.mm")
    public static class25[] field146;

    @ObfuscatedName("ca.an")
    public static class103 field1467;

    @ObfuscatedName("q.be")
    public static class185 field147;

    @ObfuscatedName("q.qb")
    public static int field149;

    @ObfuscatedName("cc.br")
    public static boolean[][] field1494;

    @ObfuscatedName("cc.bx")
    public static int field1495;

    @ObfuscatedName("cc.l")
    public static int field1496;

    @ObfuscatedName("cc.r")
    public static int field1497;

    @ObfuscatedName("cc.b")
    public static int field1498;

    @ObfuscatedName("cc.e")
    public static int field1499;

    @ObfuscatedName("q.qy")
    public static int field150;

    @ObfuscatedName("cc.h")
    public static int field1500;

    @ObfuscatedName("cc.t")
    public static int field1503;

    @ObfuscatedName("cc.ab")
    public static int field1504;

    @ObfuscatedName("cc.ac")
    public static int field1505;

    @ObfuscatedName("cc.au")
    public static int field1506;

    @ObfuscatedName("cc.al")
    public static int field1507;

    @ObfuscatedName("cc.u")
    public static int field1510;

    @ObfuscatedName("cc.d")
    public static int field1511;

    @ObfuscatedName("cc.bv")
    public static int field1516;

    @ObfuscatedName("cc.z")
    public static int field1517;

    @ObfuscatedName("q.cf")
    public static class209 field152;

    @ObfuscatedName("cc.w")
    public static int field1521;

    @ObfuscatedName("cc.bn")
    public static int field1535;

    @ObfuscatedName("cc.bl")
    public static int field1537;

    @ObfuscatedName("cc.be")
    public static int field1538;

    @ObfuscatedName("cc.bu")
    public static int field1540;

    @ObfuscatedName("cq.pa")
    public static long field1543;

    @ObfuscatedName("cq.pv")
    public static class231 field1546;

    @ObfuscatedName("cq.p")
    public static int field1548;

    @ObfuscatedName("cl.py")
    public static class2 field1550;

    @ObfuscatedName("cz.i")
    public static class223 field1569;

    @ObfuscatedName("cz.fh")
    public static int field1570;

    @ObfuscatedName("cz.nm")
    public static class58 field1571;

    @ObfuscatedName("cs.qh")
    public static class110 field1577;

    @ObfuscatedName("c.ii")
    public static class39 field158;

    @ObfuscatedName("c.gg")
    public static class170 field160;

    @ObfuscatedName("ct.nc")
    public static class66 field1603;

    @ObfuscatedName("ct.k")
    public static class145 field1615;

    @ObfuscatedName("ct.rk")
    public static String field1617;

    @ObfuscatedName("c.cr")
    public static class209 field163;

    @ObfuscatedName("cy.px")
    public static GarbageCollectorMXBean field1653;

    @ObfuscatedName("cy.ps")
    public static Clipboard field1656;

    @ObfuscatedName("cr.x")
    public static Applet field1658;

    @ObfuscatedName("cr.n")
    public static String field1659;

    @ObfuscatedName("cr.a")
    public static int field1662;

    @ObfuscatedName("cd.x")
    public static String field1678;

    @ObfuscatedName("cd.n")
    public static String field1689;

    @ObfuscatedName("b.iz")
    public static int field169;

    @ObfuscatedName("dh.v")
    public static File field1693;

    @ObfuscatedName("dh.qk")
    public static int field1699;

    @ObfuscatedName("b.eb")
    public static class225[] field171;

    @ObfuscatedName("dj.n")
    public static File field1734;

    @ObfuscatedName("dt.f")
    public static class170 field1739;

    @ObfuscatedName("dp.qa")
    public static Canvas field1745;

    @ObfuscatedName("de.qm")
    public static int field1757;

    @ObfuscatedName("w.bv")
    public static class185 field176;

    @ObfuscatedName("dr.l")
    public static int field1791;

    @ObfuscatedName("dr.pp")
    public static class104 field1794;

    @ObfuscatedName("w.bz")
    public static class185 field181;

    @ObfuscatedName("dk.qj")
    public static int field1816;

    @ObfuscatedName("w.q")
    public static class73[] field183;

    @ObfuscatedName("dd.gy")
    public static int field1834;

    @ObfuscatedName("dd.qt")
    public static Frame field1836;

    @ObfuscatedName("dd.ew")
    public static class223[] field1839;

    @ObfuscatedName("dw.y")
    public static int field1843;

    @ObfuscatedName("dw.p")
    public static int field1847;

    @ObfuscatedName("dw.db")
    public static int[] field1848;

    @ObfuscatedName("dw.nv")
    public static int field1850;

    @ObfuscatedName("dv.pn")
    public static int field1856;

    @ObfuscatedName("w.hq")
    public static class24 field186;

    @ObfuscatedName("dv.mq")
    public static int field1861;

    @ObfuscatedName("v.p")
    public static byte[][][] field19;

    @ObfuscatedName("ee.g")
    public static class183 field1917;

    @ObfuscatedName("ee.n")
    public static class183 field1918;

    @ObfuscatedName("ee.x")
    public static class183 field1919;

    @ObfuscatedName("ee.v")
    public static class140 field1920;

    @ObfuscatedName("ee.m")
    public static int field1923;

    @ObfuscatedName("ee.s")
    public static boolean field1924;

    @ObfuscatedName("ee.p")
    public static class183 field1925;

    @ObfuscatedName("ej.bf")
    public static class223[] field1956;

    @ObfuscatedName("v.z")
    public static int[] field20;

    @ObfuscatedName("ek.ei")
    public static class223[] field2003;

    @ObfuscatedName("l.pg")
    public static class117 field201;

    @ObfuscatedName("em.dw")
    public static byte[][] field2010;

    @ObfuscatedName("em.y")
    public static int[] field2014;

    @ObfuscatedName("eg.a")
    public static short[] field2034;

    @ObfuscatedName("eg.s")
    public static class229 field2038;

    @ObfuscatedName("r.ob")
    public static int field204;

    @ObfuscatedName("ew.bj")
    public static class185 field2042;

    @ObfuscatedName("eq.dr")
    public static int[] field2094;

    @ObfuscatedName("ef.bi")
    public static class185 field2095;

    @ObfuscatedName("el.x")
    public static long field2103;

    @ObfuscatedName("el.p")
    public static class183 field2107;

    @ObfuscatedName("el.n")
    public static long field2108;

    @ObfuscatedName("fh.am")
    public static class225[] field2115;

    @ObfuscatedName("fh.nw")
    public static int field2117;

    @ObfuscatedName("r.a")
    public static byte[][] field212;

    @ObfuscatedName("ff.q")
    public static int[][][] field2123;

    @ObfuscatedName("fd.hv")
    public static int field2131;

    @ObfuscatedName("fq.g")
    public static int field2139;

    @ObfuscatedName("fk.ha")
    public static int field2147;

    @ObfuscatedName("fk.ek")
    public static class225[] field2151;

    @ObfuscatedName("fm.ap")
    public static class103 field2159;

    @ObfuscatedName("fm.m")
    public static short[][] field2160;

    @ObfuscatedName("fv.j")
    public static short[] field2175;

    @ObfuscatedName("fv.e")
    public static int[] field2179;

    @ObfuscatedName("u.bp")
    public static int field218;

    @ObfuscatedName("fz.no")
    public static int field2183;

    @ObfuscatedName("fs.m")
    public static class223 field2192;

    @ObfuscatedName("fs.x")
    public static class183 field2193;

    @ObfuscatedName("fs.j")
    public static int field2194;

    @ObfuscatedName("fi.g")
    public static class183 field2198;

    @ObfuscatedName("fi.v")
    public static class183 field2199;

    @ObfuscatedName("fi.n")
    public static boolean[] field2201;

    @ObfuscatedName("fi.y")
    public static class183 field2224;

    @ObfuscatedName("e.h")
    public static String field230;

    @ObfuscatedName("h.a")
    public static int[][] field231;

    @ObfuscatedName("h.i")
    public static class27 field232;

    @ObfuscatedName("fc.c")
    public static int field2348;

    @ObfuscatedName("h.f")
    public static class209 field236;

    @ObfuscatedName("h.cc")
    public static class111 field237;

    @ObfuscatedName("h.gd")
    public static class170 field238;

    @ObfuscatedName("h.kf")
    public static class47 field239;

    @ObfuscatedName("d.ke")
    public static int field264;

    @ObfuscatedName("fg.at")
    public static long field2643;

    @ObfuscatedName("fa.b")
    public static String[] field2656;

    @ObfuscatedName("d.dc")
    public static int field267;

    @ObfuscatedName("fn.i")
    public static int field2679;

    @ObfuscatedName("d.dv")
    public static byte[][] field268;

    @ObfuscatedName("d.ih")
    public static int field270;

    @ObfuscatedName("fr.f")
    public static int[] field2702;

    @ObfuscatedName("gj.bm")
    public static class185 field2744;

    @ObfuscatedName("ge.g")
    public static long field2749;

    @ObfuscatedName("ge.x")
    public static class111 field2758;

    @ObfuscatedName("ge.r")
    public static class154 field2763;

    @ObfuscatedName("ge.ph")
    public static int field2768;

    @ObfuscatedName("ge.z")
    public static int[] field2769;

    @ObfuscatedName("gn.x")
    public static class183 field2771;

    @ObfuscatedName("gn.gs")
    public static class170 field2774;

    @ObfuscatedName("gn.p")
    public static int[] field2776;

    @ObfuscatedName("gb.n")
    public static int field2781;

    @ObfuscatedName("gx.x")
    public static class183 field2787;

    @ObfuscatedName("z.q")
    public static String field279;

    @ObfuscatedName("ga.a")
    public static class223[] field2790;

    @ObfuscatedName("ga.fl")
    public static int field2792;

    @ObfuscatedName("ga.x")
    public static class183 field2794;

    @ObfuscatedName("gw.x")
    public static class183 field2799;

    @ObfuscatedName("gi.x")
    public static class183 field2813;

    @ObfuscatedName("gs.n")
    public static class183 field2823;

    @ObfuscatedName("gs.x")
    public static class183 field2830;

    @ObfuscatedName("gs.g")
    public static int field2832;

    @ObfuscatedName("gp.x")
    public static class183 field2847;

    @ObfuscatedName("gp.n")
    public static class183 field2851;

    @ObfuscatedName("gv.x")
    public static class183 field2855;

    @ObfuscatedName("gg.x")
    public static class183 field2861;

    @ObfuscatedName("client.d")
    public static class21 field287;

    @ObfuscatedName("gg.nn")
    public static int field2871;

    @ObfuscatedName("gd.n")
    public static class183 field2873;

    @ObfuscatedName("gd.g")
    public static class183 field2874;

    @ObfuscatedName("gd.x")
    public static class183 field2891;

    @ObfuscatedName("gt.g")
    public static class183 field2900;

    @ObfuscatedName("client.ag")
    public static boolean field292;

    @ObfuscatedName("gt.n")
    public static class183 field2926;

    @ObfuscatedName("gt.pj")
    public static class31 field2945;

    @ObfuscatedName("gr.j")
    public static class183 field2956;

    @ObfuscatedName("gr.p")
    public static class183 field2979;

    @ObfuscatedName("x.g")
    public static int field3;

    @ObfuscatedName("gr.lm")
    public static class217 field3004;

    @ObfuscatedName("gf.n")
    public static class183 field3008;

    @ObfuscatedName("gf.x")
    public static class183 field3037;

    @ObfuscatedName("client.c")
    public static String field304;

    @ObfuscatedName("gu.nb")
    public static int field3053;

    @ObfuscatedName("gk.g")
    public static class183 field3060;

    @ObfuscatedName("client.br")
    public static class185 field307;

    @ObfuscatedName("gk.x")
    public static class183 field3073;

    @ObfuscatedName("gm.v")
    public static byte[][][] field3080;

    @ObfuscatedName("gm.n")
    public static class183 field3082;

    @ObfuscatedName("gl.n")
    public static class183 field3086;

    @ObfuscatedName("y.cp")
    public static class111 field31;

    @ObfuscatedName("gy.m")
    public static class179 field3100;

    @ObfuscatedName("gy.y")
    public static File field3101;

    @ObfuscatedName("gc.en")
    public static class225[] field3103;

    @ObfuscatedName("hq.i")
    public static class223[] field3116;

    @ObfuscatedName("client.i")
    public static class180 field313;

    @ObfuscatedName("hu.x")
    public static class146 field3130;

    @ObfuscatedName("hu.o")
    public static class182 field3131;

    @ObfuscatedName("hy.l")
    public static int[] field3133;

    @ObfuscatedName("hh.bo")
    public static int field3146;

    @ObfuscatedName("hn.cu")
    public static class209 field3189;

    @ObfuscatedName("hf.ab")
    public static int field3192;

    @ObfuscatedName("hf.ac")
    public static int field3193;

    @ObfuscatedName("hf.t")
    public static int[] field3197;

    @ObfuscatedName("hr.bt")
    public static String field3200;

    @ObfuscatedName("hj.a")
    public static int field3218;

    @ObfuscatedName("hj.da")
    public static int field3221;

    @ObfuscatedName("ho.x")
    public static int field3234;

    @ObfuscatedName("ho.n")
    public static int field3235;

    @ObfuscatedName("ho.j")
    public static int[] field3236;

    @ObfuscatedName("ho.v")
    public static int[] field3237;

    @ObfuscatedName("ho.m")
    public static int[] field3238;

    @ObfuscatedName("client.bh")
    public static int field326;

    @ObfuscatedName("hp.x")
    public static class170[][] field3297;

    @ObfuscatedName("y.t")
    public static int[] field35;

    @ObfuscatedName("p.x")
    public static class183 field37;

    @ObfuscatedName("p.ah")
    public static class185 field39;

    @ObfuscatedName("p.il")
    public static class170 field41;

    @ObfuscatedName("j.ib")
    public static int field42;

    @ObfuscatedName("j.j")
    public static byte[][][] field43;

    @ObfuscatedName("j.nu")
    public static int field44;

    @ObfuscatedName("j.b")
    public static int field45;

    @ObfuscatedName("client.ak")
    public static class185 field500;

    @ObfuscatedName("client.mo")
    public static byte field519;

    @ObfuscatedName("j.az")
    public static int field55;

    @ObfuscatedName("client.g")
    public static client field557;

    @ObfuscatedName("m.s")
    public static int[] field57;

    @ObfuscatedName("client.nq")
    public static class52 field573;

    @ObfuscatedName("m.eo")
    public static class225[] field58;

    @ObfuscatedName("t.f")
    public static boolean field588;

    @ObfuscatedName("ab.mz")
    public static class225 field596;

    @ObfuscatedName("ab.dz")
    public static int field597;

    @ObfuscatedName("m.dm")
    public static int field61;

    @ObfuscatedName("m.o")
    public static int[] field62;

    @ObfuscatedName("au.bf")
    public static FontMetrics field664;

    @ObfuscatedName("ae.ac")
    public static int[] field689;

    @ObfuscatedName("a.bl")
    public static class185 field69;

    @ObfuscatedName("ae.i")
    public static int field695;

    @ObfuscatedName("ae.f")
    public static class61 field699;

    @ObfuscatedName("aq.g")
    public static int[] field721;

    @ObfuscatedName("aq.v")
    public static String[] field724;

    @ObfuscatedName("aq.o")
    public static class170 field732;

    @ObfuscatedName("aq.m")
    public static int field736;

    @ObfuscatedName("aq.mr")
    public static byte field738;

    @ObfuscatedName("aq.u")
    public static String field739;

    @ObfuscatedName("i.eg")
    public static class223[] field74;

    @ObfuscatedName("aq.qr")
    public static int field740;

    @ObfuscatedName("i.bn")
    public static class185 field75;

    @ObfuscatedName("aa.im")
    public static int field751;

    @ObfuscatedName("af.y")
    public static class30[] field754;

    @ObfuscatedName("af.em")
    public static class225[] field759;

    @ObfuscatedName("i.dj")
    public static int field76;

    @ObfuscatedName("af.iv")
    public static int field760;

    @ObfuscatedName("as.u")
    public static int[] field766;

    @ObfuscatedName("as.ku")
    public static int field767;

    @ObfuscatedName("ao.na")
    public static class58 field773;

    @ObfuscatedName("i.w")
    public static String[] field78;

    @ObfuscatedName("an.ey")
    public static class225 field798;

    @ObfuscatedName("an.ca")
    public static class103 field801;

    @ObfuscatedName("an.ot")
    public static int field802;

    @ObfuscatedName("ag.e")
    public static String field805;

    @ObfuscatedName("ag.by")
    public static class223[] field807;

    @ObfuscatedName("ag.bx")
    public static class185 field809;

    @ObfuscatedName("aj.kl")
    public static int field816;

    @ObfuscatedName("aj.by")
    public static class185 field819;

    @ObfuscatedName("ar.g")
    public static class223 field822;

    @ObfuscatedName("ar.p")
    public static class225 field825;

    @ObfuscatedName("ar.j")
    public static class225 field826;

    @ObfuscatedName("ar.v")
    public static class223 field827;

    @ObfuscatedName("ar.r")
    public static int[] field831;

    @ObfuscatedName("ar.s")
    public static class223 field836;

    @ObfuscatedName("ar.hb")
    public static int field838;

    @ObfuscatedName("ar.pf")
    public static short[] field839;

    @ObfuscatedName("s.m")
    public static byte[][][] field84;

    @ObfuscatedName("s.dt")
    public static int field85;

    @ObfuscatedName("ar.bj")
    public static class223 field853;

    @ObfuscatedName("ar.x")
    public static boolean field859;

    @ObfuscatedName("az.ep")
    public static class225[] field870;

    @ObfuscatedName("s.y")
    public static byte[][][] field88;

    @ObfuscatedName("az.ej")
    public static class225 field885;

    @ObfuscatedName("az.fq")
    public static int field887;

    @ObfuscatedName("av.oe")
    public static int field894;

    @ObfuscatedName("av.m")
    public static boolean field896;

    @ObfuscatedName("n.cc")
    public static char field9;

    @ObfuscatedName("s.i")
    public static int[] field90;

    @ObfuscatedName("ap.ev")
    public static class225[] field903;

    @ObfuscatedName("aw.fw")
    public static int field908;

    @ObfuscatedName("aw.ie")
    public static class170 field925;

    @ObfuscatedName("ay.c")
    public static class154 field940;

    @ObfuscatedName("ai.ab")
    public static int[] field947;

    @ObfuscatedName("ai.aw")
    public static class111 field948;

    @ObfuscatedName("ai.kw")
    public static class113 field949;

    @ObfuscatedName("s.fd")
    public static int field95;

    @ObfuscatedName("k.y")
    public static class223[] field96;

    @ObfuscatedName("at.dk")
    public static int[] field960;

    @ObfuscatedName("at.ak")
    public static class223[] field961;

    @ObfuscatedName("ah.fi")
    public static int field975;

    @ObfuscatedName("am.ff")
    public static int field977;

    @ObfuscatedName("ff.x(III)I")
    public static int method2955(int arg0, int arg1) {
        int var2 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var2 = arg0 * var2;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var2;
        } else {
            return var2;
        }
    }

    @ObfuscatedName("ew.x(CI)B")
    public static byte method2665(char arg0) {
        byte var1;
        if (!(arg0 <= 0 || arg0 >= 128) || !(arg0 < 160 || arg0 > 255)) {
            var1 = (byte) arg0;
        } else if (arg0 == 8364) {
            var1 = -128;
        } else if (arg0 == 8218) {
            var1 = -126;
        } else if (arg0 == 402) {
            var1 = -125;
        } else if (arg0 == 8222) {
            var1 = -124;
        } else if (arg0 == 8230) {
            var1 = -123;
        } else if (arg0 == 8224) {
            var1 = -122;
        } else if (arg0 == 8225) {
            var1 = -121;
        } else if (arg0 == 710) {
            var1 = -120;
        } else if (arg0 == 8240) {
            var1 = -119;
        } else if (arg0 == 352) {
            var1 = -118;
        } else if (arg0 == 8249) {
            var1 = -117;
        } else if (arg0 == 338) {
            var1 = -116;
        } else if (arg0 == 381) {
            var1 = -114;
        } else if (arg0 == 8216) {
            var1 = -111;
        } else if (arg0 == 8217) {
            var1 = -110;
        } else if (arg0 == 8220) {
            var1 = -109;
        } else if (arg0 == 8221) {
            var1 = -108;
        } else if (arg0 == 8226) {
            var1 = -107;
        } else if (arg0 == 8211) {
            var1 = -106;
        } else if (arg0 == 8212) {
            var1 = -105;
        } else if (arg0 == 732) {
            var1 = -104;
        } else if (arg0 == 8482) {
            var1 = -103;
        } else if (arg0 == 353) {
            var1 = -102;
        } else if (arg0 == 8250) {
            var1 = -101;
        } else if (arg0 == 339) {
            var1 = -100;
        } else if (arg0 == 382) {
            var1 = -98;
        } else if (arg0 == 376) {
            var1 = -97;
        } else {
            var1 = 63;
        }
        return var1;
    }

    @ObfuscatedName("n.x(Lgo;B)V")
    public static void method21(class183 arg0) {
        field2193 = arg0;
        field2781 = field2193.method3150(16);
    }

    @ObfuscatedName("ae.x(II)Lgv;")
    public static class195 method701(int arg0) {
        class195 var1 = (class195) class195.field2858.method2275((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2855.method3153(14, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3401(new class154(var2));
        }
        class195.field2858.method2282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.x(Lgo;Lgo;Lgo;Lej;I)Z")
    public static boolean method644(class183 arg0, class183 arg1, class183 arg2, class140 arg3) {
        field1919 = arg0;
        field1918 = arg1;
        field1917 = arg2;
        field1920 = arg3;
        return true;
    }

    @ObfuscatedName("ac.x(Lgo;Lgo;I)V")
    public static void method637(class183 arg0, class183 arg1) {
        field2847 = arg0;
        field2851 = arg1;
    }

    @ObfuscatedName("ge.g(IIB)Le;")
    public static class22 method3281(int arg0, int arg1) {
        class51 var2 = (class51) class48.field950.get(arg0);
        return var2.method961(arg1);
    }

    @ObfuscatedName("bh.x(II)Lgk;")
    public static class202 method1464(int arg0) {
        class202 var1 = (class202) class202.field3079.method2275((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3073.method3153(12, arg0);
        class202 var3 = new class202();
        if (var2 != null) {
            var3.method3606(new class154(var2));
        }
        var3.method3608();
        class202.field3079.method2282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("cd.x(Lgo;Lgo;ZB)V")
    public static void method1962(class183 arg0, class183 arg1, boolean arg2) {
        field2926 = arg0;
        field2900 = arg1;
        class198.field2946 = arg2;
    }

    @ObfuscatedName("ay.n(II)Lgt;")
    public static class198 method935(int arg0) {
        class198 var1 = (class198) class198.field2901.method2275((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2926.method3153(6, arg0);
        class198 var3 = new class198();
        var3.field2922 = arg0;
        if (var2 != null) {
            var3.method3487(new class154(var2));
        }
        var3.method3452();
        if (var3.field2938) {
            var3.field2916 = 0;
            var3.field2937 = false;
        }
        class198.field2901.method2282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("df.f([BI)V")
    public static void method2061(byte[] arg0) {
        class154 var1 = new class154(arg0);
        var1.field2087 = arg0.length - 2;
        field3234 = var1.method2833();
        field3237 = new int[field3234];
        field2014 = new int[field3234];
        field2776 = new int[field3234];
        field3236 = new int[field3234];
        field212 = new byte[field3234][];
        var1.field2087 = arg0.length - 7 - field3234 * 8;
        field3235 = var1.method2833();
        field3 = var1.method2833();
        int var2 = (var1.method2878() & 0xFF) + 1;
        for (int var3 = 0; var3 < field3234; var3++) {
            field3237[var3] = var1.method2833();
        }
        for (int var4 = 0; var4 < field3234; var4++) {
            field2014[var4] = var1.method2833();
        }
        for (int var5 = 0; var5 < field3234; var5++) {
            field2776[var5] = var1.method2833();
        }
        for (int var6 = 0; var6 < field3234; var6++) {
            field3236[var6] = var1.method2833();
        }
        var1.field2087 = arg0.length - 7 - field3234 * 8 - (var2 - 1) * 3;
        field3238 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            field3238[var7] = var1.method2705();
            if (field3238[var7] == 0) {
                field3238[var7] = 1;
            }
        }
        var1.field2087 = 0;
        for (int var8 = 0; var8 < field3234; var8++) {
            int var9 = field2776[var8];
            int var10 = field3236[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            field212[var8] = var12;
            int var13 = var1.method2878();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2788();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2788();
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.y(B)V")
    public static void method93() {
        try {
            File var0 = new File(field230, "random.dat");
            if (var0.exists()) {
                class105.field1690 = new class73(new class74(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < field78.length; var1++) {
                    for (int var2 = 0; var2 < field2656.length; var2++) {
                        File var3 = new File(field2656[var2] + field78[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            class105.field1690 = new class73(new class74(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (class105.field1690 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                class105.field1690 = new class73(new class74(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("ap.y(Lgj;IIIBZI)V")
    public static void method865(class185 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class182 var8 = (class182) class186.field2750.method2286(var6);
        if (var8 != null) {
            return;
        }
        class182 var9 = (class182) class186.field2767.method2286(var6);
        if (var9 != null) {
            return;
        }
        class182 var10 = (class182) class186.field2755.method2286(var6);
        if (var10 == null) {
            if (!arg5) {
                class182 var11 = (class182) class186.field2760.method2286(var6);
                if (var11 != null) {
                    return;
                }
            }
            class182 var12 = new class182();
            var12.field2705 = arg0;
            var12.field2703 = arg3;
            var12.field2708 = arg4;
            if (arg5) {
                class186.field2750.method2287(var12, var6);
                class186.field2751++;
            } else {
                class186.field2757.method2240(var12);
                class186.field2755.method2287(var12, var6);
                class186.field2756++;
            }
        } else if (arg5) {
            var10.method2362();
            class186.field2750.method2287(var10, var6);
            class186.field2756--;
            class186.field2751++;
        }
    }

    @ObfuscatedName("ag.s(IIIB)I")
    public static int method808(int arg0, int arg1, int arg2) {
        if ((class11.field81[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (class11.field81[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("dg.p(I)V")
    public static final void method2146() {
        class88.field1533 = false;
        client.field291 = false;
    }

    @ObfuscatedName("h.p(ILat;ZI)I")
    public static int method224(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method971(class33.field727[--field736]);
        } else {
            var3 = arg2 ? field732 : field1739;
        }
        client.method974(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            field736 -= 2;
            int var4 = class33.field727[field736];
            int var5 = class33.field727[field736 + 1];
            var3.field2219 = var4;
            var3.field2311 = var5;
            class199 var6 = class199.method973(var4);
            var3.field2258 = var6.field2966;
            var3.field2332 = var6.field2967;
            var3.field2260 = var6.field2955;
            var3.field2256 = var6.field2969;
            var3.field2257 = var6.field2970;
            var3.field2261 = var6.field2965;
            if (arg0 == 1205) {
                var3.field2230 = 0;
            } else if (arg0 == 1212 | var6.field2971 == 1) {
                var3.field2230 = 1;
            } else {
                var3.field2230 = 2;
            }
            if (var3.field2319 > 0) {
                var3.field2261 = var3.field2261 * 32 / var3.field2319;
            } else if (var3.field2218 > 0) {
                var3.field2261 = var3.field2261 * 32 / var3.field2218;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2250 = 2;
            var3.field2331 = class33.field727[--field736];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2250 = 3;
            var3.field2331 = field186.field242.method3048();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ec.j(ILat;ZI)I")
    public static int method2683(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class170.method971(class33.field727[--field736]);
        } else {
            var3 = arg2 ? field732 : field1739;
        }
        if (arg0 == 1300) {
            int var4 = class33.field727[--field736] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3094(var4, class33.field729[--field695]);
                return 1;
            } else {
                field695--;
                return 1;
            }
        } else if (arg0 == 1301) {
            field736 -= 2;
            int var5 = class33.field727[field736];
            int var6 = class33.field727[field736 + 1];
            var3.field2282 = class170.method769(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2285 = class33.field727[--field736] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2327 = class33.field727[--field736];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2227 = class33.field727[--field736];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2280 = class33.field729[--field695];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2252 = class33.field729[--field695];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2281 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fq.au(II)V")
    public static void method2982(int arg0) {
        if (arg0 == -1 && !client.field440) {
            field1920.method2507();
            class139.field1922 = 1;
            field1925 = null;
        } else if (arg0 != -1 && client.field529 != arg0 && client.field545 != 0 && !client.field440) {
            class139.method1893(2, field307, arg0, 0, client.field545, false);
        }
        client.field529 = arg0;
    }

    @ObfuscatedName("ft.bf(III)V")
    public static final void method3146(int arg0, int arg1) {
        if (field76 == arg0 && field85 == arg1) {
            return;
        }
        field76 = arg0;
        field85 = arg1;
        client.method691(25);
        client.method70(class174.field2580, true);
        int var2 = field267;
        int var3 = field3221;
        field267 = (arg0 - 6) * 8;
        field3221 = (arg1 - 6) * 8;
        int var4 = field267 - var2;
        int var5 = field3221 - var3;
        int var6 = field267;
        int var7 = field3221;
        for (int var8 = 0; var8 < 32768; var8++) {
            class36 var9 = client.field328[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field659[var10] -= var4;
                    var9.field660[var10] -= var5;
                }
                var9.field636 -= var4 * 128;
                var9.field605 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class24 var12 = client.field365[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field659[var13] -= var4;
                    var12.field660[var13] -= var5;
                }
                var12.field636 -= var4 * 128;
                var12.field605 -= var5 * 128;
            }
        }
        byte var14 = 0;
        byte var15 = 104;
        byte var16 = 1;
        if (var4 < 0) {
            var14 = 103;
            var15 = -1;
            var16 = -1;
        }
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var5 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var21 = var17; var21 != var18; var21 += var19) {
                int var22 = var4 + var20;
                int var23 = var5 + var21;
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                        client.field420[var24][var20][var21] = client.field420[var24][var22][var23];
                    } else {
                        client.field420[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class26 var25 = (class26) client.field393.method2352(); var25 != null; var25 = (class26) client.field393.method2341()) {
            var25.field578 -= var4;
            var25.field579 -= var5;
            if (var25.field578 < 0 || var25.field579 < 0 || var25.field578 >= 104 || var25.field579 >= 104) {
                var25.method2327();
            }
        }
        if (client.field381 != 0) {
            client.field381 -= var4;
            client.field526 -= var5;
        }
        client.field533 = 0;
        client.field460 = false;
        client.field520 = -1;
        client.field423.method2356();
        client.field422.method2356();
        for (int var26 = 0; var26 < 4; var26++) {
            client.field350[var26].method2195();
        }
    }

    @ObfuscatedName("f.cn(I)V")
    public static final void method173() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < client.field515 - 1; var1++) {
                if (client.field498[var1] < 1000 && client.field498[var1 + 1] > 1000) {
                    String var2 = client.field410[var1];
                    client.field410[var1] = client.field410[var1 + 1];
                    client.field410[var1 + 1] = var2;
                    String var3 = client.field434[var1];
                    client.field434[var1] = client.field434[var1 + 1];
                    client.field434[var1 + 1] = var3;
                    int var4 = client.field498[var1];
                    client.field498[var1] = client.field498[var1 + 1];
                    client.field498[var1 + 1] = var4;
                    int var5 = client.field430[var1];
                    client.field430[var1] = client.field430[var1 + 1];
                    client.field430[var1 + 1] = var5;
                    int var6 = client.field574[var1];
                    client.field574[var1] = client.field574[var1 + 1];
                    client.field574[var1 + 1] = var6;
                    int var7 = client.field433[var1];
                    client.field433[var1] = client.field433[var1 + 1];
                    client.field433[var1 + 1] = var7;
                    if (client.field437 != -1) {
                        if (client.field437 == var1) {
                            client.field437 = var1 + 1;
                        } else if (client.field437 == var1 + 1) {
                            client.field437 = var1;
                        }
                    }
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("am.cs([Lfi;IIIIIIIII)V")
    public static final void method959(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class220.method3877(arg2, arg3, arg4, arg5);
        class85.method1669();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class170 var10 = arg0[var9];
            if (var10 != null && (var10.field2226 == arg1 || arg1 == -1412584499 && client.field463 == var10)) {
                int var11;
                if (arg8 == -1) {
                    client.field457[client.field469] = var10.field2220 + arg6;
                    client.field513[client.field469] = var10.field2221 + arg7;
                    client.field493[client.field469] = var10.field2249;
                    client.field309[client.field469] = var10.field2223;
                    var11 = ++client.field469 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2338 = var11;
                var10.field2339 = client.field432;
                if (!var10.field2231 || !client.method115(var10)) {
                    if (var10.field2211 > 0) {
                        int var12 = var10.field2211;
                        if (var12 == 324) {
                            if (client.field565 == -1) {
                                client.field565 = var10.field2242;
                                client.field566 = var10.field2232;
                            }
                            if (client.field413.field2176) {
                                var10.field2242 = client.field565;
                            } else {
                                var10.field2242 = client.field566;
                            }
                        } else if (var12 == 325) {
                            if (client.field565 == -1) {
                                client.field565 = var10.field2242;
                                client.field566 = var10.field2232;
                            }
                            if (client.field413.field2176) {
                                var10.field2242 = client.field566;
                            } else {
                                var10.field2242 = client.field565;
                            }
                        } else if (var12 == 327) {
                            var10.field2258 = 150;
                            var10.field2332 = (int) (Math.sin((double) client.field432 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2250 = 5;
                            var10.field2331 = 0;
                        } else if (var12 == 328) {
                            var10.field2258 = 150;
                            var10.field2332 = (int) (Math.sin((double) client.field432 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2250 = 5;
                            var10.field2331 = 1;
                        }
                    }
                    int var13 = var10.field2220 + arg6;
                    int var14 = var10.field2221 + arg7;
                    int var15 = var10.field2238;
                    if (client.field463 == var10) {
                        if (arg1 != -1412584499 && !var10.field2285) {
                            field1213 = arg0;
                            field767 = arg6;
                            field264 = arg7;
                            continue;
                        }
                        if (client.field474 && client.field468) {
                            int var16 = class116.field1806;
                            int var17 = class116.field1807;
                            int var18 = var16 - client.field465;
                            int var19 = var17 - client.field467;
                            if (var18 < client.field524) {
                                var18 = client.field524;
                            }
                            if (var10.field2249 + var18 > client.field524 + client.field464.field2249) {
                                var18 = client.field524 + client.field464.field2249 - var10.field2249;
                            }
                            if (var19 < client.field308) {
                                var19 = client.field308;
                            }
                            if (var10.field2223 + var19 > client.field308 + client.field464.field2223) {
                                var19 = client.field308 + client.field464.field2223 - var10.field2223;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2285) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2209 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2209 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2249 + var13;
                        int var27 = var10.field2223 + var14;
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
                        int var30 = var10.field2249 + var13;
                        int var31 = var10.field2223 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2231 || var20 < var22 && var21 < var23) {
                        if (var10.field2211 != 0) {
                            if (var10.field2211 == 1336) {
                                if (client.field303) {
                                    var14 += 15;
                                    field163.method3702("Fps:" + client.field1774, var10.field2249 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && client.field291) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !client.field291) {
                                        var34 = 16711680;
                                    }
                                    field163.method3702("Mem:" + var33 + "k", var10.field2249 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2211 == 1337) {
                                client.field439 = var13;
                                client.field466 = var14;
                                client.method1561(var13, var14, var10.field2249, var10.field2223);
                                client.field495[var10.field2338] = true;
                                class220.method3877(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2211 == 1338) {
                                client.method2056();
                                class165 var35 = var10.method3093(false);
                                if (var35 != null) {
                                    class220.method3877(var13, var14, var35.field2161 + var13, var35.field2156 + var14);
                                    if (client.field527 == 2 || client.field527 == 5) {
                                        class220.method3817(var13, var14, 0, var35.field2158, var35.field2157);
                                    } else {
                                        int var36 = client.field395 + client.field374 & 0x7FF;
                                        int var37 = field186.field636 / 32 + 48;
                                        int var38 = 464 - field186.field605 / 32;
                                        field596.method3983(var13, var14, var35.field2161, var35.field2156, var37, var38, var36, client.field340 + 256, var35.field2158, var35.field2157);
                                        for (int var39 = 0; var39 < client.field521; var39++) {
                                            int var40 = client.field476[var39] * 4 + 2 - field186.field636 / 32;
                                            int var41 = client.field397[var39] * 4 + 2 - field186.field605 / 32;
                                            client.method1155(var13, var14, var40, var41, client.field359[var39], var35);
                                        }
                                        int var42 = 0;
                                        while (true) {
                                            if (var42 >= 104) {
                                                for (int var47 = 0; var47 < client.field329; var47++) {
                                                    class36 var48 = client.field328[client.field286[var47]];
                                                    if (var48 != null && var48.method250()) {
                                                        class200 var49 = var48.field765;
                                                        if (var49 != null && var49.field3019 != null) {
                                                            var49 = var49.method3570();
                                                        }
                                                        if (var49 != null && var49.field3028 && var49.field3040) {
                                                            int var50 = var48.field636 / 32 - field186.field636 / 32;
                                                            int var51 = var48.field605 / 32 - field186.field605 / 32;
                                                            client.method1155(var13, var14, var50, var51, field903[1], var35);
                                                        }
                                                    }
                                                }
                                                int var52 = class46.field917;
                                                int[] var53 = class46.field914;
                                                for (int var54 = 0; var54 < var52; var54++) {
                                                    class24 var55 = client.field365[var53[var54]];
                                                    if (var55 != null && var55.method250() && !var55.field261 && field186 != var55) {
                                                        int var56 = var55.field636 / 32 - field186.field636 / 32;
                                                        int var57 = var55.field605 / 32 - field186.field605 / 32;
                                                        boolean var58 = false;
                                                        if (client.method216(var55.field244, true)) {
                                                            var58 = true;
                                                        }
                                                        boolean var59 = false;
                                                        for (int var60 = 0; var60 < field1861; var60++) {
                                                            if (var55.field244.equals(field146[var60].field272)) {
                                                                var59 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var61 = false;
                                                        if (field186.field260 != 0 && var55.field260 != 0 && field186.field260 == var55.field260) {
                                                            var61 = true;
                                                        }
                                                        if (var58) {
                                                            client.method1155(var13, var14, var56, var57, field903[3], var35);
                                                        } else if (var61) {
                                                            client.method1155(var13, var14, var56, var57, field903[4], var35);
                                                        } else if (var59) {
                                                            client.method1155(var13, var14, var56, var57, field903[5], var35);
                                                        } else {
                                                            client.method1155(var13, var14, var56, var57, field903[2], var35);
                                                        }
                                                    }
                                                }
                                                if (client.field305 != 0 && client.field432 % 20 < 10) {
                                                    if (client.field305 == 1 && client.field306 >= 0 && client.field306 < client.field328.length) {
                                                        class36 var62 = client.field328[client.field306];
                                                        if (var62 != null) {
                                                            int var63 = var62.field636 / 32 - field186.field636 / 32;
                                                            int var64 = var62.field605 / 32 - field186.field605 / 32;
                                                            client.method889(var13, var14, var63, var64, field171[1], var35);
                                                        }
                                                    }
                                                    if (client.field305 == 2) {
                                                        int var65 = client.field296 * 4 - field267 * 4 + 2 - field186.field636 / 32;
                                                        int var66 = client.field383 * 4 - field3221 * 4 + 2 - field186.field605 / 32;
                                                        client.method889(var13, var14, var65, var66, field171[1], var35);
                                                    }
                                                    if (client.field305 == 10 && client.field563 >= 0 && client.field563 < client.field365.length) {
                                                        class24 var67 = client.field365[client.field563];
                                                        if (var67 != null) {
                                                            int var68 = var67.field636 / 32 - field186.field636 / 32;
                                                            int var69 = var67.field605 / 32 - field186.field605 / 32;
                                                            client.method889(var13, var14, var68, var69, field171[1], var35);
                                                        }
                                                    }
                                                }
                                                if (client.field381 != 0) {
                                                    int var70 = client.field381 * 4 + 2 - field186.field636 / 32;
                                                    int var71 = client.field526 * 4 + 2 - field186.field605 / 32;
                                                    client.method1155(var13, var14, var70, var71, field171[0], var35);
                                                }
                                                if (!field186.field261) {
                                                    class220.method3842(var35.field2161 / 2 + var13 - 1, var35.field2156 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var43 = 0; var43 < 104; var43++) {
                                                class129 var44 = client.field420[field1834][var42][var43];
                                                if (var44 != null) {
                                                    int var45 = var42 * 4 + 2 - field186.field636 / 32;
                                                    int var46 = var43 * 4 + 2 - field186.field605 / 32;
                                                    client.method1155(var13, var14, var45, var46, field903[0], var35);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                    client.field496[var11] = true;
                                }
                                class220.method3877(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2211 == 1339) {
                                client.method2988(var10, var13, var14, var11);
                                class220.method3877(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2209 == 0) {
                            if (!var10.field2231 && client.method115(var10) && field925 != var10) {
                                continue;
                            }
                            if (!var10.field2231) {
                                if (var10.field2229 > var10.field2206 - var10.field2223) {
                                    var10.field2229 = var10.field2206 - var10.field2223;
                                }
                                if (var10.field2229 < 0) {
                                    var10.field2229 = 0;
                                }
                            }
                            method959(arg0, var10.field2207, var20, var21, var22, var23, var13 - var10.field2228, var14 - var10.field2229, var11);
                            if (var10.field2340 != null) {
                                method959(var10.field2340, var10.field2207, var20, var21, var22, var23, var13 - var10.field2228, var14 - var10.field2229, var11);
                            }
                            class18 var72 = (class18) client.field302.method2286((long) var10.field2207);
                            if (var72 != null) {
                                client.method19(var72.field178, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class220.method3877(arg2, arg3, arg4, arg5);
                            class85.method1669();
                        }
                        if (client.field504 || client.field436[var11] || client.field502 > 1) {
                            if (var10.field2209 == 0 && !var10.field2231 && var10.field2206 > var10.field2223) {
                                int var73 = var10.field2249 + var13;
                                int var74 = var10.field2229;
                                int var75 = var10.field2223;
                                int var76 = var10.field2206;
                                field74[0].method3888(var73, var14);
                                field74[1].method3888(var73, var14 + var75 - 16);
                                class220.method3842(var73, var14 + 16, 16, var75 - 32, client.field367);
                                int var77 = (var75 - 32) * var75 / var76;
                                if (var77 < 8) {
                                    var77 = 8;
                                }
                                int var78 = (var75 - 32 - var77) * var74 / (var76 - var75);
                                class220.method3842(var73, var14 + 16 + var78, 16, var77, client.field368);
                                class220.method3814(var73, var14 + 16 + var78, var77, client.field370);
                                class220.method3814(var73 + 1, var14 + 16 + var78, var77, client.field370);
                                class220.method3812(var73, var14 + 16 + var78, 16, client.field370);
                                class220.method3812(var73, var14 + 17 + var78, 16, client.field370);
                                class220.method3814(var73 + 15, var14 + 16 + var78, var77, client.field369);
                                class220.method3814(var73 + 14, var14 + 17 + var78, var77 - 1, client.field369);
                                class220.method3812(var73, var14 + 15 + var78 + var77, 16, client.field369);
                                class220.method3812(var73 + 1, var14 + 14 + var78 + var77, 15, client.field369);
                            }
                            if (var10.field2209 != 1) {
                                if (var10.field2209 == 2) {
                                    int var79 = 0;
                                    for (int var80 = 0; var80 < var10.field2200; var80++) {
                                        for (int var81 = 0; var81 < var10.field2218; var81++) {
                                            int var82 = (var10.field2273 + 32) * var81 + var13;
                                            int var83 = (var10.field2274 + 32) * var80 + var14;
                                            if (var79 < 20) {
                                                var82 += var10.field2317[var79];
                                                var83 += var10.field2276[var79];
                                            }
                                            if (var10.field2298[var79] > 0) {
                                                boolean var84 = false;
                                                boolean var85 = false;
                                                int var86 = var10.field2298[var79] - 1;
                                                if (var82 + 32 > arg2 && var82 < arg4 && var83 + 32 > arg3 && var83 < arg5 || field160 == var10 && client.field403 == var79) {
                                                    class225 var87;
                                                    if (client.field417 == 1 && field42 == var79 && field751 == var10.field2207) {
                                                        var87 = class199.method3132(var86, var10.field2326[var79], 2, 0, 2, false);
                                                    } else {
                                                        var87 = class199.method3132(var86, var10.field2326[var79], 1, 3153952, 2, false);
                                                    }
                                                    if (var87 == null) {
                                                        client.method974(var10);
                                                    } else if (field160 == var10 && client.field403 == var79) {
                                                        int var88 = class116.field1806 - client.field404;
                                                        int var89 = class116.field1807 - client.field443;
                                                        if (var88 < 5 && var88 > -5) {
                                                            var88 = 0;
                                                        }
                                                        if (var89 < 5 && var89 > -5) {
                                                            var89 = 0;
                                                        }
                                                        if (client.field408 < 5) {
                                                            var88 = 0;
                                                            var89 = 0;
                                                        }
                                                        var87.method3943(var82 + var88, var83 + var89, 128);
                                                        if (arg1 != -1) {
                                                            class170 var90 = arg0[arg1 & 0xFFFF];
                                                            if (var83 + var89 < class220.field3194 && var90.field2229 > 0) {
                                                                int var91 = client.field366 * (class220.field3194 - var83 - var89) / 3;
                                                                if (var91 > client.field366 * 10) {
                                                                    var91 = client.field366 * 10;
                                                                }
                                                                if (var91 > var90.field2229) {
                                                                    var91 = var90.field2229;
                                                                }
                                                                var90.field2229 -= var91;
                                                                client.field443 += var91;
                                                                client.method974(var90);
                                                            }
                                                            if (var83 + var89 + 32 > class220.field3191 && var90.field2229 < var90.field2206 - var90.field2223) {
                                                                int var92 = client.field366 * (var83 + var89 + 32 - class220.field3191) / 3;
                                                                if (var92 > client.field366 * 10) {
                                                                    var92 = client.field366 * 10;
                                                                }
                                                                if (var92 > var90.field2206 - var90.field2223 - var90.field2229) {
                                                                    var92 = var90.field2206 - var90.field2223 - var90.field2229;
                                                                }
                                                                var90.field2229 += var92;
                                                                client.field443 -= var92;
                                                                client.method974(var90);
                                                            }
                                                        }
                                                    } else if (field2774 == var10 && client.field402 == var79) {
                                                        var87.method3943(var82, var83, 128);
                                                    } else {
                                                        var87.method3937(var82, var83);
                                                    }
                                                }
                                            } else if (var10.field2243 != null && var79 < 20) {
                                                class225 var93 = var10.method3091(var79);
                                                if (var93 != null) {
                                                    var93.method3937(var82, var83);
                                                } else if (class170.field2328) {
                                                    client.method974(var10);
                                                }
                                            }
                                            var79++;
                                        }
                                    }
                                } else if (var10.field2209 == 3) {
                                    int var94;
                                    if (client.method3240(var10)) {
                                        var94 = var10.field2233;
                                        if (field925 == var10 && var10.field2235 != 0) {
                                            var94 = var10.field2235;
                                        }
                                    } else {
                                        var94 = var10.field2324;
                                        if (field925 == var10 && var10.field2286 != 0) {
                                            var94 = var10.field2286;
                                        }
                                    }
                                    if (var10.field2262) {
                                        switch(var10.field2237.field3208) {
                                            case 1:
                                                class220.method3806(var13, var14, var10.field2249, var10.field2223, var10.field2324, var10.field2233, 256 - (var10.field2238 & 0xFF), 256 - (var10.field2197 & 0xFF));
                                                break;
                                            case 2:
                                                class220.method3807(var13, var14, var10.field2249, var10.field2223, var10.field2324, var10.field2233, 256 - (var10.field2238 & 0xFF), 256 - (var10.field2197 & 0xFF));
                                                break;
                                            case 3:
                                                class220.method3808(var13, var14, var10.field2249, var10.field2223, var10.field2324, var10.field2233, 256 - (var10.field2238 & 0xFF), 256 - (var10.field2197 & 0xFF));
                                                break;
                                            case 4:
                                                class220.method3840(var13, var14, var10.field2249, var10.field2223, var10.field2324, var10.field2233, 256 - (var10.field2238 & 0xFF), 256 - (var10.field2197 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class220.method3842(var13, var14, var10.field2249, var10.field2223, var94);
                                                } else {
                                                    class220.method3820(var13, var14, var10.field2249, var10.field2223, var94, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class220.method3798(var13, var14, var10.field2249, var10.field2223, var94);
                                    } else {
                                        class220.method3811(var13, var14, var10.field2249, var10.field2223, var94, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2209 == 4) {
                                    class209 var95 = var10.method3086();
                                    if (var95 != null) {
                                        String var96 = var10.field2267;
                                        int var97;
                                        if (client.method3240(var10)) {
                                            var97 = var10.field2233;
                                            if (field925 == var10 && var10.field2235 != 0) {
                                                var97 = var10.field2235;
                                            }
                                            if (var10.field2268.length() > 0) {
                                                var96 = var10.field2268;
                                            }
                                        } else {
                                            var97 = var10.field2324;
                                            if (field925 == var10 && var10.field2286 != 0) {
                                                var97 = var10.field2286;
                                            }
                                        }
                                        if (var10.field2231 && var10.field2219 != -1) {
                                            class199 var98 = class199.method973(var10.field2219);
                                            var96 = var98.field2960;
                                            if (var96 == null) {
                                                var96 = "null";
                                            }
                                            if ((var98.field2971 == 1 || var10.field2311 != 1) && var10.field2311 != -1) {
                                                var96 = class38.method800(16748608) + var96 + class38.field786 + " " + 'x' + client.method187(var10.field2311);
                                            }
                                        }
                                        if (client.field544 == var10) {
                                            class174 var10000 = (class174) null;
                                            var96 = class174.field2514;
                                            var97 = var10.field2324;
                                        }
                                        if (!var10.field2231) {
                                            var96 = client.method161(var96, var10);
                                        }
                                        var95.method3704(var96, var13, var14, var10.field2249, var10.field2223, var97, var10.field2272 ? 0 : -1, var10.field2270, var10.field2271, var10.field2269);
                                    } else if (class170.field2328) {
                                        client.method974(var10);
                                    }
                                } else if (var10.field2209 == 5) {
                                    if (var10.field2231) {
                                        class225 var100;
                                        if (var10.field2219 == -1) {
                                            var100 = var10.method3090(false);
                                        } else {
                                            var100 = class199.method3132(var10.field2219, var10.field2311, var10.field2246, var10.field2247, var10.field2230, false);
                                        }
                                        if (var100 != null) {
                                            int var101 = var100.field3232;
                                            int var102 = var100.field3228;
                                            if (var10.field2245) {
                                                class220.method3800(var13, var14, var10.field2249 + var13, var10.field2223 + var14);
                                                int var103 = (var10.field2249 + (var101 - 1)) / var101;
                                                int var104 = (var10.field2223 + (var102 - 1)) / var102;
                                                for (int var105 = 0; var105 < var103; var105++) {
                                                    for (int var106 = 0; var106 < var104; var106++) {
                                                        if (var10.field2292 != 0) {
                                                            var100.method3950(var101 / 2 + var101 * var105 + var13, var102 / 2 + var102 * var106 + var14, var10.field2292, 4096);
                                                        } else if (var15 == 0) {
                                                            var100.method3937(var101 * var105 + var13, var102 * var106 + var14);
                                                        } else {
                                                            var100.method3943(var101 * var105 + var13, var102 * var106 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class220.method3877(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var107 = var10.field2249 * 4096 / var101;
                                                if (var10.field2292 != 0) {
                                                    var100.method3950(var10.field2249 / 2 + var13, var10.field2223 / 2 + var14, var10.field2292, var107);
                                                } else if (var15 != 0) {
                                                    var100.method3945(var13, var14, var10.field2249, var10.field2223, 256 - (var15 & 0xFF));
                                                } else if (var10.field2249 == var101 && var10.field2223 == var102) {
                                                    var100.method3937(var13, var14);
                                                } else {
                                                    var100.method4004(var13, var14, var10.field2249, var10.field2223);
                                                }
                                            }
                                        } else if (class170.field2328) {
                                            client.method974(var10);
                                        }
                                    } else {
                                        class225 var99 = var10.method3090(client.method3240(var10));
                                        if (var99 != null) {
                                            var99.method3937(var13, var14);
                                        } else if (class170.field2328) {
                                            client.method974(var10);
                                        }
                                    }
                                } else if (var10.field2209 == 6) {
                                    boolean var108 = client.method3240(var10);
                                    int var109;
                                    if (var108) {
                                        var109 = var10.field2255;
                                    } else {
                                        var109 = var10.field2234;
                                    }
                                    class83 var110 = null;
                                    int var111 = 0;
                                    if (var10.field2219 != -1) {
                                        class199 var112 = class199.method973(var10.field2219);
                                        if (var112 != null) {
                                            class199 var113 = var112.method3534(var10.field2311);
                                            var110 = var113.method3503(1);
                                            if (var110 == null) {
                                                client.method974(var10);
                                            } else {
                                                var110.method1571();
                                                var111 = var110.field1551 / 2;
                                            }
                                        }
                                    } else if (var10.field2250 == 5) {
                                        if (var10.field2331 == 0) {
                                            var110 = client.field413.method3046((class202) null, -1, (class202) null, -1);
                                        } else {
                                            var110 = field186.method240();
                                        }
                                    } else if (var109 == -1) {
                                        var110 = var10.method3092((class202) null, -1, var108, field186.field242);
                                        if (var110 == null && class170.field2328) {
                                            client.method974(var10);
                                        }
                                    } else {
                                        class202 var114 = method1464(var109);
                                        var110 = var10.method3092(var114, var10.field2329, var108, field186.field242);
                                        if (var110 == null && class170.field2328) {
                                            client.method974(var10);
                                        }
                                    }
                                    class85.method1648(var10.field2249 / 2 + var13, var10.field2223 / 2 + var14);
                                    int var115 = var10.field2261 * class85.field1461[var10.field2258] >> 16;
                                    int var116 = var10.field2261 * class85.field1447[var10.field2258] >> 16;
                                    if (var110 != null) {
                                        if (var10.field2231) {
                                            var110.method1571();
                                            if (var10.field2264) {
                                                var110.method1584(0, var10.field2332, var10.field2260, var10.field2258, var10.field2256, var10.field2257 + var111 + var115, var10.field2257 + var116, var10.field2261);
                                            } else {
                                                var110.method1583(0, var10.field2332, var10.field2260, var10.field2258, var10.field2256, var10.field2257 + var111 + var115, var10.field2257 + var116);
                                            }
                                        } else {
                                            var110.method1583(0, var10.field2332, 0, var10.field2258, 0, var115, var116);
                                        }
                                    }
                                    class85.method1673();
                                } else {
                                    if (var10.field2209 == 7) {
                                        class209 var117 = var10.method3086();
                                        if (var117 == null) {
                                            if (class170.field2328) {
                                                client.method974(var10);
                                            }
                                            continue;
                                        }
                                        int var118 = 0;
                                        for (int var119 = 0; var119 < var10.field2200; var119++) {
                                            for (int var120 = 0; var120 < var10.field2218; var120++) {
                                                if (var10.field2298[var118] > 0) {
                                                    class199 var121 = class199.method973(var10.field2298[var118] - 1);
                                                    String var122;
                                                    if (var121.field2971 != 1 && var10.field2326[var118] == 1) {
                                                        var122 = class38.method800(16748608) + var121.field2960 + class38.field786;
                                                    } else {
                                                        var122 = class38.method800(16748608) + var121.field2960 + class38.field786 + " " + 'x' + client.method187(var10.field2326[var118]);
                                                    }
                                                    int var123 = (var10.field2273 + 115) * var120 + var13;
                                                    int var124 = (var10.field2274 + 12) * var119 + var14;
                                                    if (var10.field2270 == 0) {
                                                        var117.method3759(var122, var123, var124, var10.field2324, var10.field2272 ? 0 : -1);
                                                    } else if (var10.field2270 == 1) {
                                                        var117.method3703(var122, var10.field2249 / 2 + var123, var124, var10.field2324, var10.field2272 ? 0 : -1);
                                                    } else {
                                                        var117.method3702(var122, var10.field2249 + var123 - 1, var124, var10.field2324, var10.field2272 ? 0 : -1);
                                                    }
                                                }
                                                var118++;
                                            }
                                        }
                                    }
                                    if (var10.field2209 == 8 && field41 == var10 && client.field442 == client.field441) {
                                        int var125 = 0;
                                        int var126 = 0;
                                        class209 var127 = field163;
                                        String var128 = var10.field2267;
                                        String var129 = client.method161(var128, var10);
                                        while (var129.length() > 0) {
                                            int var130 = var129.indexOf(class38.field785);
                                            String var131;
                                            if (var130 == -1) {
                                                var131 = var129;
                                                var129 = "";
                                            } else {
                                                var131 = var129.substring(0, var130);
                                                var129 = var129.substring(var130 + 4);
                                            }
                                            int var132 = var127.method3695(var131);
                                            if (var132 > var125) {
                                                var125 = var132;
                                            }
                                            var126 += var127.field3113 + 1;
                                        }
                                        var125 += 6;
                                        var126 += 7;
                                        int var133 = var10.field2249 + var13 - 5 - var125;
                                        int var134 = var10.field2223 + var14 + 5;
                                        if (var133 < var13 + 5) {
                                            var133 = var13 + 5;
                                        }
                                        if (var125 + var133 > arg4) {
                                            var133 = arg4 - var125;
                                        }
                                        if (var126 + var134 > arg5) {
                                            var134 = arg5 - var126;
                                        }
                                        class220.method3842(var133, var134, var125, var126, 16777120);
                                        class220.method3798(var133, var134, var125, var126, 0);
                                        String var135 = var10.field2267;
                                        int var136 = var127.field3113 + var134 + 2;
                                        String var137 = client.method161(var135, var10);
                                        while (var137.length() > 0) {
                                            int var138 = var137.indexOf(class38.field785);
                                            String var139;
                                            if (var138 == -1) {
                                                var139 = var137;
                                                var137 = "";
                                            } else {
                                                var139 = var137.substring(0, var138);
                                                var137 = var137.substring(var138 + 4);
                                            }
                                            var127.method3759(var139, var133 + 3, var136, 0, -1);
                                            var136 += var127.field3113 + 1;
                                        }
                                    }
                                    if (var10.field2209 == 9) {
                                        if (var10.field2240 == 1) {
                                            int var140;
                                            int var141;
                                            int var142;
                                            int var143;
                                            if (var10.field2290) {
                                                var140 = var13;
                                                var141 = var10.field2223 + var14;
                                                var142 = var10.field2249 + var13;
                                                var143 = var14;
                                            } else {
                                                var140 = var13;
                                                var141 = var14;
                                                var142 = var10.field2249 + var13;
                                                var143 = var10.field2223 + var14;
                                            }
                                            class220.method3816(var140, var141, var142, var143, var10.field2324);
                                        } else {
                                            int var144 = var10.field2249 >= 0 ? var10.field2249 : -var10.field2249;
                                            int var145 = var10.field2223 >= 0 ? var10.field2223 : -var10.field2223;
                                            int var146 = var144;
                                            if (var144 < var145) {
                                                var146 = var145;
                                            }
                                            if (var146 != 0) {
                                                int var147 = (var10.field2249 << 16) / var146;
                                                int var148 = (var10.field2223 << 16) / var146;
                                                if (var148 <= var147) {
                                                    var147 = -var147;
                                                } else {
                                                    var148 = -var148;
                                                }
                                                int var149 = var10.field2240 * var148 >> 17;
                                                int var150 = var10.field2240 * var148 + 1 >> 17;
                                                int var151 = var10.field2240 * var147 >> 17;
                                                int var152 = var10.field2240 * var147 + 1 >> 17;
                                                int var153 = var13 + var149;
                                                int var154 = var13 - var150;
                                                int var155 = var10.field2249 + var13 - var150;
                                                int var156 = var10.field2249 + var13 + var149;
                                                int var157 = var14 + var151;
                                                int var158 = var14 - var152;
                                                int var159 = var10.field2223 + var14 - var152;
                                                int var160 = var10.field2223 + var14 + var151;
                                                class85.method1645(var153, var154, var155);
                                                class85.method1656(var157, var158, var159, var153, var154, var155, var10.field2324);
                                                class85.method1645(var153, var155, var156);
                                                class85.method1656(var157, var159, var160, var153, var155, var156, var10.field2324);
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

    @ObfuscatedName("at.ce([Lfi;Lfi;ZI)V")
    public static void method954(class170[] arg0, class170 arg1, boolean arg2) {
        int var3 = arg1.field2251 == 0 ? arg1.field2249 : arg1.field2251;
        int var4 = arg1.field2206 == 0 ? arg1.field2223 : arg1.field2206;
        client.method72(arg0, arg1.field2207, var3, var4, arg2);
        if (arg1.field2340 != null) {
            client.method72(arg1.field2340, arg1.field2207, var3, var4, arg2);
        }
        class18 var5 = (class18) client.field302.method2286((long) arg1.field2207);
        if (var5 != null) {
            client.method2604(var5.field178, var3, var4, arg2);
        }
        if (arg1.field2211 == 1337) {
        }
    }

    @ObfuscatedName("gb.cd(Lfi;II)I")
    public static final int method3300(class170 arg0, int arg1) {
        if (arg0.field2248 == null || arg1 >= arg0.field2248.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2248[arg1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;
            while (true) {
                int var6 = var2[var4++];
                int var7 = 0;
                byte var8 = 0;
                if (var6 == 0) {
                    return var3;
                }
                if (var6 == 1) {
                    var7 = client.field284[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = client.field425[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = client.field364[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class170 var11 = class170.method971(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class199.method973(var12).field2973 || client.field290)) {
                        for (int var13 = 0; var13 < var11.field2298.length; var13++) {
                            if (var12 + 1 == var11.field2298[var13]) {
                                var7 += var11.field2326[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class166.field2166[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class173.field2355[client.field425[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class166.field2166[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = field186.field246;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class173.field2357[var14]) {
                            var7 += client.field425[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class170 var17 = class170.method971(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class199.method973(var18).field2973 || client.field290)) {
                        for (int var19 = 0; var19 < var17.field2298.length; var19++) {
                            if (var18 + 1 == var17.field2298[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = client.field455;
                }
                if (var6 == 12) {
                    var7 = client.field456;
                }
                if (var6 == 13) {
                    int var20 = class166.field2166[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class166.method203(var22);
                }
                if (var6 == 15) {
                    var8 = 1;
                }
                if (var6 == 16) {
                    var8 = 2;
                }
                if (var6 == 17) {
                    var8 = 3;
                }
                if (var6 == 18) {
                    var7 = (field186.field636 >> 7) + field267;
                }
                if (var6 == 19) {
                    var7 = (field186.field605 >> 7) + field3221;
                }
                if (var6 == 20) {
                    var7 = var2[var4++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var3 += var7;
                    }
                    if (var5 == 1) {
                        var3 -= var7;
                    }
                    if (var5 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var5 == 3) {
                        var3 *= var7;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @ObfuscatedName("cv.da([Lfi;II)V")
    public static final void method1919(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2209 == 0) {
                    if (var3.field2340 != null) {
                        method1919(var3.field2340, arg1);
                    }
                    class18 var4 = (class18) client.field302.method2286((long) var3.field2207);
                    if (var4 != null) {
                        client.method1977(var4.field178, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2314 != null) {
                    class19 var5 = new class19();
                    var5.field189 = var3;
                    var5.field197 = var3.field2314;
                    class33.method815(var5);
                }
                if (arg1 == 1 && var3.field2315 != null) {
                    if (var3.field2291 >= 0) {
                        class170 var6 = class170.method971(var3.field2207);
                        if (var6 == null || var6.field2340 == null || var3.field2291 >= var6.field2340.length || var6.field2340[var3.field2291] != var3) {
                            continue;
                        }
                    }
                    class19 var7 = new class19();
                    var7.field189 = var3;
                    var7.field197 = var3.field2315;
                    class33.method815(var7);
                }
            }
        }
    }

    @ObfuscatedName("q.du(Ljava/lang/String;I)Z")
    public static boolean method190(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class205.method1188(arg0, field2038);
        for (int var2 = 0; var2 < client.field567; var2++) {
            class20 var3 = client.field525[var2];
            if (var1.equalsIgnoreCase(class205.method1188(var3.field205, field2038))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class205.method1188(var3.field207, field2038))) {
                return true;
            }
        }
        return false;
    }
}
