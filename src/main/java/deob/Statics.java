package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.util.Iterator;

public class Statics {

    @ObfuscatedName("an.d")
    public static class167 field1005;

    @ObfuscatedName("an.nd")
    public static int field1021;

    @ObfuscatedName("an.y")
    public static class167 field1022;

    @ObfuscatedName("an.ax")
    public static class81[] field1023;

    @ObfuscatedName("an.bc")
    public static class168 field1024;

    @ObfuscatedName("au.d")
    public static class167 field1026;

    @ObfuscatedName("au.qp")
    public static int field1030;

    @ObfuscatedName("au.g")
    public static int field1035;

    @ObfuscatedName("au.ep")
    public static class79[] field1037;

    @ObfuscatedName("au.y")
    public static class167 field1038;

    @ObfuscatedName("av.gp")
    public static class173 field1040;

    @ObfuscatedName("av.y")
    public static class167 field1043;

    @ObfuscatedName("av.cg")
    public static class224 field1044;

    @ObfuscatedName("av.w")
    public static class167 field1045;

    @ObfuscatedName("av.bm")
    public static class81[] field1047;

    @ObfuscatedName("av.mc")
    public static byte field1048;

    @ObfuscatedName("ac.y")
    public static class167 field1057;

    @ObfuscatedName("ap.y")
    public static class167 field1072;

    @ObfuscatedName("ad.y")
    public static class167 field1082;

    @ObfuscatedName("ad.ev")
    public static class79[] field1083;

    @ObfuscatedName("ag.y")
    public static class167 field1089;

    @ObfuscatedName("ag.nn")
    public static int field1091;

    @ObfuscatedName("ag.n")
    public static class154 field1092;

    @ObfuscatedName("ag.pa")
    public static int field1094;

    @ObfuscatedName("ag.j")
    public static String field1095;

    @ObfuscatedName("ax.bh")
    public static class168 field1102;

    @ObfuscatedName("ax.qu")
    public static int field1103;

    @ObfuscatedName("ax.y")
    public static class167 field1106;

    @ObfuscatedName("ax.w")
    public static int[] field1108;

    @ObfuscatedName("at.a")
    public static int field1143;

    @ObfuscatedName("bm.y")
    public static class167 field1160;

    @ObfuscatedName("bm.d")
    public static int field1165;

    @ObfuscatedName("bm.dx")
    public static int field1166;

    @ObfuscatedName("bf.y")
    public static class54 field1168;

    @ObfuscatedName("bk.e")
    public static int field1175;

    @ObfuscatedName("bk.w")
    public static boolean field1178;

    @ObfuscatedName("bk.in")
    public static int field1190;

    @ObfuscatedName("bi.nq")
    public static class56 field1215;

    @ObfuscatedName("bi.fo")
    public static int field1217;

    @ObfuscatedName("bi.a")
    public static class79 field1219;

    @ObfuscatedName("bi.et")
    public static class79[] field1222;

    @ObfuscatedName("a.eg")
    public static class81[] field124;

    @ObfuscatedName("bg.m")
    public static int field1242;

    @ObfuscatedName("bg.q")
    public static float field1243;

    @ObfuscatedName("a.iv")
    public static int field125;

    @ObfuscatedName("bw.n")
    public static int[] field1277;

    @ObfuscatedName("bw.k")
    public static int[] field1278;

    @ObfuscatedName("bw.o")
    public static boolean[] field1279;

    @ObfuscatedName("bb.s")
    public static class61[] field1288;

    @ObfuscatedName("bb.f")
    public static class68[] field1290;

    @ObfuscatedName("bb.u")
    public static float[] field1293;

    @ObfuscatedName("bb.a")
    public static byte[] field1294;

    @ObfuscatedName("bb.q")
    public static int field1295;

    @ObfuscatedName("bb.m")
    public static int field1296;

    @ObfuscatedName("bb.n")
    public static int field1297;

    @ObfuscatedName("bb.k")
    public static int field1298;

    @ObfuscatedName("y.ak")
    public static class146 field13;

    @ObfuscatedName("q.db")
    public static int[] field130;

    @ObfuscatedName("bb.o")
    public static class74[] field1300;

    @ObfuscatedName("bb.p")
    public static int[] field1303;

    @ObfuscatedName("bb.aa")
    public static float[] field1304;

    @ObfuscatedName("bb.z")
    public static class69[] field1307;

    @ObfuscatedName("bb.l")
    public static float[] field1310;

    @ObfuscatedName("bb.ab")
    public static int[] field1311;

    @ObfuscatedName("bb.t")
    public static float[] field1312;

    @ObfuscatedName("bb.i")
    public static float[] field1314;

    @ObfuscatedName("bb.ah")
    public static float[] field1315;

    @ObfuscatedName("bb.ao")
    public static float[] field1316;

    @ObfuscatedName("bb.ai")
    public static int[] field1317;

    @ObfuscatedName("bb.b")
    public static boolean[] field1318;

    @ObfuscatedName("ba.at")
    public static class81[] field1348;

    @ObfuscatedName("q.ic")
    public static class31 field135;

    @ObfuscatedName("ba.c")
    public static class73 field1352;

    @ObfuscatedName("ba.qc")
    public static int field1353;

    @ObfuscatedName("ba.e")
    public static class167 field1358;

    @ObfuscatedName("br.ns")
    public static int field1371;

    @ObfuscatedName("bo.by")
    public static class168 field1379;

    @ObfuscatedName("bo.pb")
    public static class134 field1380;

    @ObfuscatedName("bo.x")
    public static int[] field1382;

    @ObfuscatedName("bx.y")
    public static int field1384;

    @ObfuscatedName("bx.e")
    public static int[] field1386;

    @ObfuscatedName("bx.ah")
    public static int[] field1393;

    @ObfuscatedName("bl.ch")
    public static class143 field1395;

    @ObfuscatedName("cc.s")
    public static int field1414;

    @ObfuscatedName("cc.z")
    public static int field1415;

    @ObfuscatedName("cc.f")
    public static int[] field1417;

    @ObfuscatedName("cp.z")
    public static int[] field1429;

    @ObfuscatedName("m.cl")
    public static class224 field143;

    @ObfuscatedName("cn.n")
    public static class19 field1447;

    @ObfuscatedName("ch.p")
    public static int field1456;

    @ObfuscatedName("ch.bi")
    public static int field1457;

    @ObfuscatedName("ch.r")
    public static int field1459;

    @ObfuscatedName("ch.bj")
    public static boolean[][] field1464;

    @ObfuscatedName("ch.x")
    public static int field1470;

    @ObfuscatedName("ch.h")
    public static int field1471;

    @ObfuscatedName("ch.j")
    public static int field1472;

    @ObfuscatedName("ch.v")
    public static int field1473;

    @ObfuscatedName("ch.l")
    public static int field1474;

    @ObfuscatedName("ch.t")
    public static int field1476;

    @ObfuscatedName("ch.i")
    public static int field1477;

    @ObfuscatedName("ch.ah")
    public static int field1478;

    @ObfuscatedName("ch.aa")
    public static int field1479;

    @ObfuscatedName("m.h")
    public static class119 field148;

    @ObfuscatedName("ch.ao")
    public static int field1480;

    @ObfuscatedName("ch.ai")
    public static int field1481;

    @ObfuscatedName("ch.bc")
    public static int field1491;

    @ObfuscatedName("ch.u")
    public static int field1500;

    @ObfuscatedName("ch.bk")
    public static int field1508;

    @ObfuscatedName("ch.bh")
    public static int field1509;

    @ObfuscatedName("ch.by")
    public static int field1512;

    @ObfuscatedName("ch.bn")
    public static int field1513;

    @ObfuscatedName("co.k")
    public static boolean field1515;

    @ObfuscatedName("m.br")
    public static int field152;

    @ObfuscatedName("co.an")
    public static class146 field1524;

    @ObfuscatedName("m.ci")
    public static class143 field154;

    @ObfuscatedName("ct.my")
    public static int field1543;

    @ObfuscatedName("ct.pd")
    public static class9 field1549;

    @ObfuscatedName("ck.q")
    public static class153 field1554;

    @ObfuscatedName("ck.e")
    public static int field1555;

    @ObfuscatedName("ck.qj")
    public static int field1557;

    @ObfuscatedName("ck.bf")
    public static FontMetrics field1558;

    @ObfuscatedName("ck.g")
    public static int field1559;

    @ObfuscatedName("ck.na")
    public static int field1560;

    @ObfuscatedName("cj.u")
    public static int field1562;

    @ObfuscatedName("cj.h")
    public static int field1569;

    @ObfuscatedName("cj.k")
    public static int field1571;

    @ObfuscatedName("cj.j")
    public static int field1574;

    @ObfuscatedName("cj.v")
    public static int field1575;

    @ObfuscatedName("cj.l")
    public static int field1576;

    @ObfuscatedName("cj.o")
    public static int field1577;

    @ObfuscatedName("cj.t")
    public static int field1578;

    @ObfuscatedName("cj.aa")
    public static class92 field1581;

    @ObfuscatedName("cq.ne")
    public static int field1593;

    @ObfuscatedName("cv.ga")
    public static class173 field1600;

    @ObfuscatedName("cv.nr")
    public static class57 field1607;

    @ObfuscatedName("cv.qz")
    public static Frame field1609;

    @ObfuscatedName("cf.qv")
    public static Font field1621;

    @ObfuscatedName("cf.e")
    public static class167 field1622;

    @ObfuscatedName("n.fj")
    public static int field165;

    @ObfuscatedName("cw.mr")
    public static class79 field1652;

    @ObfuscatedName("k.df")
    public static byte[][] field172;

    @ObfuscatedName("k.mh")
    public static byte field173;

    @ObfuscatedName("k.bk")
    public static class168 field174;

    @ObfuscatedName("cg.dh")
    public static int field1743;

    @ObfuscatedName("ca.e")
    public static class81[] field1750;

    @ObfuscatedName("cz.d")
    public static int field1754;

    @ObfuscatedName("cs.au")
    public static class143 field1787;

    @ObfuscatedName("o.mt")
    public static class25[] field179;

    @ObfuscatedName("dg.bm")
    public static int field1807;

    @ObfuscatedName("o.cu")
    public static char field183;

    @ObfuscatedName("dg.bd")
    public static int field1841;

    @ObfuscatedName("dg.bf")
    public static int field1842;

    @ObfuscatedName("o.bb")
    public static String field185;

    @ObfuscatedName("o.j")
    public static int[] field186;

    @ObfuscatedName("da.t")
    public static int[] field1861;

    @ObfuscatedName("da.c")
    public static int field1862;

    @ObfuscatedName("dj.hu")
    public static int field1938;

    @ObfuscatedName("dj.qb")
    public static int field1940;

    @ObfuscatedName("db.y")
    public static long field1951;

    @ObfuscatedName("dq.dn")
    public static int[] field1958;

    @ObfuscatedName("dq.rg")
    public static String field1961;

    @ObfuscatedName("dd.pf")
    public static class136 field1981;

    @ObfuscatedName("dm.q")
    public static int[] field1989;

    @ObfuscatedName("f.ag")
    public static class79[] field199;

    @ObfuscatedName("ds.z")
    public static int field1994;

    @ObfuscatedName("dz.k")
    public static class212 field2000;

    @ObfuscatedName("dz.u")
    public static class14 field2003;

    @ObfuscatedName("dx.ia")
    public static class173 field2014;

    @ObfuscatedName("dx.ct")
    public static int field2016;

    @ObfuscatedName("dr.eo")
    public static class79[] field2019;

    @ObfuscatedName("dr.v")
    public static String field2021;

    @ObfuscatedName("do.b")
    public static String field2028;

    @ObfuscatedName("dy.c")
    public static byte[][][] field2031;

    @ObfuscatedName("di.dd")
    public static class86 field2038;

    @ObfuscatedName("dc.ek")
    public static class79[] field2043;

    @ObfuscatedName("eq.c")
    public static boolean field2050;

    @ObfuscatedName("ew.s")
    public static class172 field2051;

    @ObfuscatedName("er.qf")
    public static int field2058;

    @ObfuscatedName("ey.d")
    public static File field2064;

    @ObfuscatedName("s.dw")
    public static byte[][] field207;

    @ObfuscatedName("es.d")
    public static String field2073;

    @ObfuscatedName("es.y")
    public static String field2074;

    @ObfuscatedName("ee.qr")
    public static int field2114;

    @ObfuscatedName("ee.e")
    public static File field2116;

    @ObfuscatedName("eb.qx")
    public static class78 field2119;

    @ObfuscatedName("eb.c")
    public static int[] field2122;

    @ObfuscatedName("z.jk")
    public static class173[] field215;

    @ObfuscatedName("ev.a")
    public static short[] field2151;

    @ObfuscatedName("ep.s")
    public static int[] field2152;

    @ObfuscatedName("ef.ed")
    public static class79[] field2156;

    @ObfuscatedName("ef.ag")
    public static class168 field2167;

    @ObfuscatedName("z.fi")
    public static int field217;

    @ObfuscatedName("ek.q")
    public static class81 field2170;

    @ObfuscatedName("z.lu")
    public static class130 field218;

    @ObfuscatedName("ek.pq")
    public static short[] field2189;

    @ObfuscatedName("eo.g")
    public static int field2204;

    @ObfuscatedName("eo.d")
    public static String field2205;

    @ObfuscatedName("eo.a")
    public static int[] field2209;

    @ObfuscatedName("eo.y")
    public static Applet field2210;

    @ObfuscatedName("eh.c")
    public static int field2212;

    @ObfuscatedName("eh.bn")
    public static class168 field2221;

    @ObfuscatedName("ea.ad")
    public static class168 field2227;

    @ObfuscatedName("ej.m")
    public static int[][] field2232;

    @ObfuscatedName("ez.ql")
    public static Image field2243;

    @ObfuscatedName("ex.as")
    public static int field2258;

    @ObfuscatedName("b.fe")
    public static int field226;

    @ObfuscatedName("eu.ap")
    public static long field2262;

    @ObfuscatedName("b.eb")
    public static class79 field227;

    @ObfuscatedName("el.cx")
    public static class224 field2278;

    @ObfuscatedName("el.nu")
    public static int field2280;

    @ObfuscatedName("b.iz")
    public static int field229;

    @ObfuscatedName("d.dg")
    public static int field23;

    @ObfuscatedName("b.ee")
    public static class79 field233;

    @ObfuscatedName("p.po")
    public static class160 field234;

    @ObfuscatedName("d.da")
    public static int field24;

    @ObfuscatedName("p.eh")
    public static class81[] field251;

    @ObfuscatedName("r.qi")
    public static Canvas field252;

    @ObfuscatedName("r.rl")
    public static boolean field255;

    @ObfuscatedName("fj.b")
    public static String[] field2570;

    @ObfuscatedName("r.f")
    public static int[] field258;

    @ObfuscatedName("fg.b")
    public static class119 field2591;

    @ObfuscatedName("fl.s")
    public static class228[] field2626;

    @ObfuscatedName("fa.pj")
    public static GarbageCollectorMXBean field2635;

    @ObfuscatedName("fr.qg")
    public static int field2638;

    @ObfuscatedName("fr.w")
    public static class81 field2639;

    @ObfuscatedName("fr.jo")
    public static int field2642;

    @ObfuscatedName("fd.hq")
    public static int field2643;

    @ObfuscatedName("fd.g")
    public static int field2644;

    @ObfuscatedName("fd.nj")
    public static int field2647;

    @ObfuscatedName("x.iw")
    public static int field268;

    @ObfuscatedName("fv.e")
    public static byte[][][] field2687;

    @ObfuscatedName("fm.g")
    public static long field2690;

    @ObfuscatedName("fm.f")
    public static boolean field2695;

    @ObfuscatedName("d.gc")
    public static int field27;

    @ObfuscatedName("fm.y")
    public static class143 field2700;

    @ObfuscatedName("x.bv")
    public static int field272;

    @ObfuscatedName("ft.g")
    public static class167 field2720;

    @ObfuscatedName("ft.y")
    public static class173[][] field2745;

    @ObfuscatedName("ft.d")
    public static boolean[] field2811;

    @ObfuscatedName("h.js")
    public static int field286;

    @ObfuscatedName("h.ba")
    public static int field287;

    @ObfuscatedName("fp.dk")
    public static int[] field2871;

    @ObfuscatedName("fp.pi")
    public static long field2874;

    @ObfuscatedName("fq.np")
    public static int field2882;

    @ObfuscatedName("ff.p")
    public static String[] field2885;

    @ObfuscatedName("ff.q")
    public static short[][] field2889;

    @ObfuscatedName("ff.aa")
    public static int[] field2895;

    @ObfuscatedName("ff.m")
    public static short[] field2896;

    @ObfuscatedName("client.g")
    public static client field291;

    @ObfuscatedName("gq.c")
    public static class167 field2924;

    @ObfuscatedName("gq.d")
    public static class167 field2925;

    @ObfuscatedName("gq.g")
    public static class167 field2926;

    @ObfuscatedName("gq.nh")
    public static class57 field2927;

    @ObfuscatedName("gq.o")
    public static class180 field2929;

    @ObfuscatedName("gq.q")
    public static int field2930;

    @ObfuscatedName("gq.n")
    public static int field2931;

    @ObfuscatedName("gq.w")
    public static class184 field2932;

    @ObfuscatedName("gq.y")
    public static class167 field2933;

    @ObfuscatedName("gw.n")
    public static short[][] field2973;

    @ObfuscatedName("gb.bm")
    public static class168 field2977;

    @ObfuscatedName("client.p")
    public static int field299;

    @ObfuscatedName("client.be")
    public static class168 field300;

    @ObfuscatedName("gd.h")
    public static String field3011;

    @ObfuscatedName("gk.em")
    public static class79[] field3029;

    @ObfuscatedName("gi.hx")
    public static int field3046;

    @ObfuscatedName("gi.ib")
    public static class173 field3047;

    @ObfuscatedName("hn.k")
    public static class224 field3128;

    @ObfuscatedName("hv.w")
    public static File field3133;

    @ObfuscatedName("ho.w")
    public static class167 field3137;

    @ObfuscatedName("ha.hl")
    public static int field3138;

    @ObfuscatedName("ha.ax")
    public static class168 field3141;

    @ObfuscatedName("hc.c")
    public static class79 field3142;

    @ObfuscatedName("hk.bp")
    public static class168 field3154;

    @ObfuscatedName("hg.y")
    public static class113 field3159;

    @ObfuscatedName("hw.n")
    public static class81[] field3169;

    @ObfuscatedName("hz.d")
    public static class167 field3188;

    @ObfuscatedName("client.az")
    public static boolean field319;

    @ObfuscatedName("hq.bd")
    public static class81 field3192;

    @ObfuscatedName("hx.at")
    public static class168 field3206;

    @ObfuscatedName("client.nm")
    public static int field395;

    @ObfuscatedName("client.kh")
    public static class20 field480;

    @ObfuscatedName("client.r")
    public static int field499;

    @ObfuscatedName("g.dq")
    public static int[][] field53;

    @ObfuscatedName("client.gm")
    public static class173 field536;

    @ObfuscatedName("w.ef")
    public static class79[] field57;

    @ObfuscatedName("client.no")
    public static int field575;

    @ObfuscatedName("v.g")
    public static class167 field585;

    @ObfuscatedName("v.jz")
    public static int field589;

    @ObfuscatedName("l.o")
    public static class173 field598;

    @ObfuscatedName("l.ny")
    public static class75 field604;

    @ObfuscatedName("l.dz")
    public static int field605;

    @ObfuscatedName("u.t")
    public static int[] field622;

    @ObfuscatedName("u.bu")
    public static int field623;

    @ObfuscatedName("t.a")
    public static int field630;

    @ObfuscatedName("i.e")
    public static class26[] field634;

    @ObfuscatedName("i.d")
    public static long field637;

    @ObfuscatedName("w.n")
    public static int[] field64;

    @ObfuscatedName("i.ea")
    public static class81[] field647;

    @ObfuscatedName("ah.fh")
    public static int field657;

    @ObfuscatedName("e.z")
    public static String field67;

    @ObfuscatedName("ao.hb")
    public static class3 field677;

    @ObfuscatedName("ao.v")
    public static int[] field678;

    @ObfuscatedName("e.pu")
    public static class221 field68;

    @ObfuscatedName("ao.m")
    public static int field680;

    @ObfuscatedName("ai.fv")
    public static int field694;

    @ObfuscatedName("y.bi")
    public static class168 field7;

    @ObfuscatedName("e.i")
    public static int[] field70;

    @ObfuscatedName("ab.h")
    public static int[] field705;

    @ObfuscatedName("ab.kt")
    public static class131 field707;

    @ObfuscatedName("ab.m")
    public static byte[][] field711;

    @ObfuscatedName("ae.g")
    public static class81 field715;

    @ObfuscatedName("ae.m")
    public static class81[] field716;

    @ObfuscatedName("ae.n")
    public static class81 field717;

    @ObfuscatedName("ae.k")
    public static class81 field718;

    @ObfuscatedName("e.bg")
    public static class168 field73;

    @ObfuscatedName("ae.y")
    public static boolean field731;

    @ObfuscatedName("ae.am")
    public static String field736;

    @ObfuscatedName("aj.bj")
    public static class168 field767;

    @ObfuscatedName("aj.ip")
    public static int field768;

    @ObfuscatedName("ay.c")
    public static class167 field778;

    @ObfuscatedName("al.w")
    public static String[] field789;

    @ObfuscatedName("al.k")
    public static class173 field795;

    @ObfuscatedName("al.g")
    public static int[] field796;

    @ObfuscatedName("al.px")
    public static int field800;

    @ObfuscatedName("c.w")
    public static byte[][][] field82;

    @ObfuscatedName("c.k")
    public static int[] field84;

    @ObfuscatedName("c.o")
    public static int[] field85;

    @ObfuscatedName("aq.pm")
    public static Clipboard field861;

    @ObfuscatedName("ak.f")
    public static class60 field863;

    @ObfuscatedName("ak.a")
    public static byte[][][] field869;

    @ObfuscatedName("c.q")
    public static byte[][][] field87;

    @ObfuscatedName("az.d")
    public static class167 field872;

    @ObfuscatedName("az.y")
    public static class167 field875;

    @ObfuscatedName("az.fg")
    public static int field908;

    @ObfuscatedName("az.cn")
    public static class146 field910;

    @ObfuscatedName("ar.g")
    public static class167 field915;

    @ObfuscatedName("c.bd")
    public static class168 field92;

    @ObfuscatedName("c.z")
    public static int[][][] field93;

    @ObfuscatedName("ar.cs")
    public static int field941;

    @ObfuscatedName("as.qk")
    public static class133 field969;

    @ObfuscatedName("as.y")
    public static class167 field971;

    @ObfuscatedName("am.d")
    public static class167 field980;

    @ObfuscatedName("am.y")
    public static class167 field988;

    @ObfuscatedName("am.pg")
    public static int field999;

    @ObfuscatedName("cw.y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z")
    public static final boolean method2026(String arg0, String arg1, String arg2, String arg3) {
        if (arg0 == null || arg2 == null) {
            return false;
        } else if (arg0.startsWith("#") || arg2.startsWith("#")) {
            return arg0.equals(arg2);
        } else {
            return arg1.equals(arg3);
        }
    }

    @ObfuscatedName("dr.d(Ldd;II)Ljava/lang/String;")
    public static String method2619(class119 arg0, int arg1) {
        try {
            int var2 = arg0.method2321();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field1973 += field3159.method2257(arg0.field1974, arg0.field1973, var3, 0, var2);
            return class165.method870(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @ObfuscatedName("z.y(B)V")
    public static void method173() {
        for (class24 var0 = (class24) class24.field617.method3493(); var0 != null; var0 = (class24) class24.field617.method3495()) {
            if (var0.field614 != null) {
                field1215.method1113(var0.field614);
                var0.field614 = null;
            }
            if (var0.field619 != null) {
                field1215.method1113(var0.field619);
                var0.field619 = null;
            }
        }
        class24.field617.method3487();
    }

    @ObfuscatedName("ci.y(I)Z")
    public static boolean method1750() {
        try {
            if (field1447 == null) {
                field1447 = new class19(field1981, new URL(field67));
            } else {
                byte[] var0 = field1447.method197();
                if (var0 != null) {
                    class119 var1 = new class119(var0);
                    class26.field635 = var1.method2525();
                    field634 = new class26[class26.field635];
                    int var2 = 0;
                    while (var2 < class26.field635) {
                        class26 var3 = field634[var2] = new class26();
                        var3.field641 = var1.method2525();
                        var3.field640 = var1.method2331();
                        var3.field642 = var1.method2334();
                        var3.field643 = var1.method2334();
                        var3.field651 = var1.method2326();
                        var3.field644 = var1.method2383();
                        var3.field645 = var2++;
                    }
                    class26.method657(field634, 0, field634.length - 1, class26.field638, class26.field650);
                    field1447 = null;
                    return true;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            field1447 = null;
        }
        return false;
    }

    @ObfuscatedName("ds.y(Lfu;Lfu;I)V")
    public static void method2600(class167 arg0, class167 arg1) {
        field1022 = arg0;
        field1005 = arg1;
    }

    @ObfuscatedName("m.g(IIIIIIS)I")
    public static int method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if ((arg5 & 0x1) == 1) {
            int var6 = arg3;
            arg3 = arg4;
            arg4 = var6;
        }
        int var7 = arg2 & 0x3;
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return 7 - arg0 - (arg3 - 1);
        } else if (var7 == 2) {
            return 7 - arg1 - (arg4 - 1);
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("bl.a(Ljava/lang/Object;ZI)[B")
    public static byte[] method1571(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            if (arg1) {
                int var3 = var2.length;
                byte[] var4 = new byte[var3];
                System.arraycopy(var2, 0, var4, 0, var3);
                return var4;
            } else {
                return var2;
            }
        } else if (arg0 instanceof class125) {
            class125 var6 = (class125) arg0;
            return var6.method2305();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("du.d(Ljava/awt/Component;B)V")
    public static void method2239(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(class137.field2096);
        arg0.addFocusListener(class137.field2096);
    }

    @ObfuscatedName("al.g(II)Z")
    public static boolean method723(int arg0) {
        if (field2811[arg0]) {
            return true;
        } else if (field2720.method2993(arg0)) {
            int var1 = field2720.method3050(arg0);
            if (var1 == 0) {
                field2811[arg0] = true;
                return true;
            }
            if (field2745[arg0] == null) {
                field2745[arg0] = new class173[var1];
            }
            for (int var2 = 0; var2 < var1; var2++) {
                if (field2745[arg0][var2] == null) {
                    byte[] var3 = field2720.method3045(arg0, var2);
                    if (var3 != null) {
                        field2745[arg0][var2] = new class173();
                        field2745[arg0][var2].field2727 = (arg0 << 16) + var2;
                        if (var3[0] == -1) {
                            field2745[arg0][var2].method3105(new class119(var3));
                        } else {
                            field2745[arg0][var2].method3122(new class119(var3));
                        }
                    }
                }
            }
            field2811[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.o(Li;I)V")
    public static void method980(class26 arg0) {
        if (arg0.method609() != client.field296) {
            client.field296 = arg0.method609();
            boolean var1 = arg0.method609();
            if (field2050 != var1) {
                class52.field1129.method3428();
                class52.field1114.method3428();
                class52.field1115.method3428();
                field2050 = var1;
            }
        }
        field185 = arg0.field642;
        client.field293 = arg0.field641;
        client.field409 = arg0.field640;
        field272 = client.field318 == 0 ? 43594 : arg0.field641 + 40000;
        field287 = client.field318 == 0 ? 443 : arg0.field641 + 50000;
        field623 = field272;
    }

    @ObfuscatedName("e.f(B)V")
    public static void method45() {
        if (method1750()) {
            class32.field730 = true;
        }
    }

    @ObfuscatedName("s.h(B)V")
    public static final void method168() {
        if (client.field548 > 1) {
            client.field548--;
        }
        if (client.field344 > 0) {
            client.field344--;
        }
        if (client.field345) {
            client.field345 = false;
            client.method2986();
            return;
        }
        if (!client.field430) {
            client.field436[0] = class157.field2470;
            client.field437[0] = "";
            client.field434[0] = 1006;
            client.field571 = 1;
        }
        for (int var0 = 0; var0 < 100 && client.method1054(); var0++) {
        }
        if (client.field301 != 30) {
            return;
        }
        while (true) {
            class210 var1 = (class210) class211.field3104.method3540();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = field2003.field206;
                synchronized (field2003.field206) {
                    if (!client.field292) {
                        field2003.field202 = 0;
                    } else if (class140.field2137 != 0 || field2003.field202 >= 40) {
                        client.field337.method2574(7);
                        client.field337.method2354(0);
                        int var5 = client.field337.field1973;
                        int var6 = 0;
                        for (int var7 = 0; var7 < field2003.field202 && client.field337.field1973 - var5 < 240; var7++) {
                            var6++;
                            int var8 = field2003.field204[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = field2003.field208[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (field2003.field204[var7] == -1 && field2003.field208[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (client.field305 != var9 || client.field530 != var8) {
                                int var11 = var9 - client.field305;
                                client.field305 = var9;
                                int var12 = var8 - client.field530;
                                client.field530 = var8;
                                if (client.field307 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    client.field337.method2312((client.field307 << 12) + (var11 << 6) + var12);
                                    client.field307 = 0;
                                } else if (client.field307 < 8) {
                                    client.field337.method2494((client.field307 << 19) + 8388608 + var10);
                                    client.field307 = 0;
                                } else {
                                    client.field337.method2423((client.field307 << 19) + -1073741824 + var10);
                                    client.field307 = 0;
                                }
                            } else if (client.field307 < 2047) {
                                client.field307++;
                            }
                        }
                        client.field337.method2532(client.field337.field1973 - var5);
                        if (var6 >= field2003.field202) {
                            field2003.field202 = 0;
                        } else {
                            field2003.field202 -= var6;
                            for (int var13 = 0; var13 < field2003.field202; var13++) {
                                field2003.field208[var13] = field2003.field208[var6 + var13];
                                field2003.field204[var13] = field2003.field204[var6 + var13];
                            }
                        }
                    }
                }
                if (class140.field2137 == 1 || !field319 && class140.field2137 == 4 || class140.field2137 == 2) {
                    long var15 = (class140.field2140 - client.field304 * -1L) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    client.field304 = class140.field2140 * -1L;
                    int var17 = class140.field2133;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > field2638) {
                        var17 = field2638;
                    }
                    int var18 = class140.field2134;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > field2114) {
                        var18 = field2114;
                    }
                    int var19 = (int) var15;
                    client.field337.method2574(253);
                    client.field337.method2312((var19 << 1) + (class140.field2137 == 2 ? 1 : 0));
                    client.field337.method2312(var18);
                    client.field337.method2312(var17);
                }
                if (class137.field2101 > 0) {
                    client.field337.method2574(203);
                    client.field337.method2312(0);
                    int var20 = client.field337.field1973;
                    long var21 = class115.method671();
                    for (int var23 = 0; var23 < class137.field2101; var23++) {
                        long var24 = var21 - client.field516;
                        if (var24 > 16777215L) {
                            var24 = 16777215L;
                        }
                        client.field516 = var21;
                        client.field337.method2513(class137.field2100[var23]);
                        client.field337.method2337((int) var24);
                    }
                    client.field337.method2477(client.field337.field1973 - var20);
                }
                if (client.field381 > 0) {
                    client.field381--;
                }
                if (class137.field2094[96] || class137.field2094[97] || class137.field2094[98] || class137.field2094[99]) {
                    client.field546 = true;
                }
                if (client.field546 && client.field381 <= 0) {
                    client.field381 = 20;
                    client.field546 = false;
                    client.field337.method2574(64);
                    client.field337.method2358(client.field375);
                    client.field337.method2358(client.field374);
                }
                if (field255 && !client.field308) {
                    client.field308 = true;
                    client.field337.method2574(187);
                    client.field337.method2354(1);
                }
                if (!field255 && client.field308) {
                    client.field308 = false;
                    client.field337.method2574(187);
                    client.field337.method2354(0);
                }
                client.method95();
                if (client.field301 != 30) {
                    return;
                }
                client.method133();
                client.method1220();
                client.field309++;
                if (client.field309 > 750) {
                    client.method2986();
                    return;
                }
                int var26 = class33.field750;
                int[] var27 = class33.field751;
                for (int var28 = 0; var28 < var26; var28++) {
                    class3 var29 = client.field412[var27[var28]];
                    if (var29 != null) {
                        client.method1483(var29, 1);
                    }
                }
                for (int var30 = 0; var30 < client.field457; var30++) {
                    int var31 = client.field331[var30];
                    class35 var32 = client.field415[var31];
                    if (var32 != null) {
                        client.method1483(var32, var32.field777.field889);
                    }
                }
                client.method2647();
                client.field367++;
                if (client.field401 != 0) {
                    client.field400 += 20;
                    if (client.field400 >= 400) {
                        client.field401 = 0;
                    }
                }
                if (field1040 != null) {
                    client.field402++;
                    if (client.field402 >= 15) {
                        client.method628(field1040);
                        field1040 = null;
                    }
                }
                class173 var33 = field2014;
                class173 var34 = field3047;
                field2014 = null;
                field3047 = null;
                client.field466 = null;
                client.field470 = false;
                client.field540 = false;
                client.field513 = 0;
                while (class137.method2009() && client.field513 < 128) {
                    if (client.field295 >= 2 && class137.field2094[82] && field2016 == 66) {
                        String var35 = "";
                        Iterator var36 = class12.field178.iterator();
                        while (var36.hasNext()) {
                            class36 var37 = (class36) var36.next();
                            var35 = var35 + var37.field785 + ':' + var37.field779 + '\n';
                        }
                        field861.setContents(new StringSelection(var35), (ClipboardOwner) null);
                    } else {
                        client.field515[client.field513] = field2016;
                        client.field314[client.field513] = field183;
                        client.field513++;
                    }
                }
                if (client.field413 != -1) {
                    client.method1565(client.field413, 0, 0, field2114, field2638, 0, 0);
                }
                client.field357++;
                while (true) {
                    class1 var40;
                    class173 var41;
                    class173 var42;
                    do {
                        var40 = (class1) client.field404.method3491();
                        if (var40 == null) {
                            while (true) {
                                class1 var43;
                                class173 var44;
                                class173 var45;
                                do {
                                    var43 = (class1) client.field491.method3491();
                                    if (var43 == null) {
                                        while (true) {
                                            class1 var46;
                                            class173 var47;
                                            class173 var48;
                                            do {
                                                var46 = (class1) client.field489.method3491();
                                                if (var46 == null) {
                                                    client.method2728();
                                                    if (client.field359 != null) {
                                                        client.method628(client.field359);
                                                        field286++;
                                                        if (client.field470 && client.field540) {
                                                            int var49 = class140.field2131;
                                                            int var50 = class140.field2132 * -1076088155;
                                                            int var51 = var49 - client.field464;
                                                            int var52 = var50 - client.field538;
                                                            if (var51 < client.field468) {
                                                                var51 = client.field468;
                                                            }
                                                            if (client.field359.field2825 + var51 > client.field468 + client.field463.field2825) {
                                                                var51 = client.field468 + client.field463.field2825 - client.field359.field2825;
                                                            }
                                                            if (var52 < client.field362) {
                                                                var52 = client.field362;
                                                            }
                                                            if (client.field359.field2743 + var52 > client.field362 + client.field463.field2743) {
                                                                var52 = client.field362 + client.field463.field2743 - client.field359.field2743;
                                                            }
                                                            int var53 = var51 - client.field471;
                                                            int var54 = var52 - client.field472;
                                                            int var55 = client.field359.field2801;
                                                            if (field286 > client.field359.field2838 && (var53 > var55 || var53 < -var55 || var54 > var55 || var54 < -var55)) {
                                                                client.field473 = true;
                                                            }
                                                            int var56 = client.field463.field2764 + (var51 - client.field468);
                                                            int var57 = client.field463.field2749 + (var52 - client.field362);
                                                            if (client.field359.field2814 != null && client.field473) {
                                                                class1 var58 = new class1();
                                                                var58.field3 = client.field359;
                                                                var58.field1 = var56;
                                                                var58.field14 = var57;
                                                                var58.field15 = client.field359.field2814;
                                                                class37.method1926(var58);
                                                            }
                                                            if (class140.field2130 == 0) {
                                                                if (client.field473) {
                                                                    if (client.field359.field2815 != null) {
                                                                        class1 var59 = new class1();
                                                                        var59.field3 = client.field359;
                                                                        var59.field1 = var56;
                                                                        var59.field14 = var57;
                                                                        var59.field4 = client.field466;
                                                                        var59.field15 = client.field359.field2815;
                                                                        class37.method1926(var59);
                                                                    }
                                                                    if (client.field466 != null && client.method440(client.field359) != null) {
                                                                        client.field337.method2574(88);
                                                                        client.field337.method2312(client.field359.field2845);
                                                                        client.field337.method2359(client.field466.field2845);
                                                                        client.field337.method2423(client.field466.field2727);
                                                                        client.field337.method2370(client.field359.field2727);
                                                                        client.field337.method2358(client.field466.field2728);
                                                                        client.field337.method2312(client.field359.field2728);
                                                                    }
                                                                } else if ((client.field458 == 1 || client.method2914(client.field571 - 1)) && client.field571 > 2) {
                                                                    client.method239(client.field471 + client.field464, client.field538 + client.field472);
                                                                } else if (client.field571 > 0) {
                                                                    client.method3158(client.field471 + client.field464, client.field538 + client.field472);
                                                                }
                                                                client.field359 = null;
                                                            }
                                                        } else if (field286 > 1) {
                                                            client.field359 = null;
                                                        }
                                                    }
                                                    if (field536 != null) {
                                                        client.method628(field536);
                                                        client.field410++;
                                                        if (class140.field2130 == 0) {
                                                            if (client.field441) {
                                                                if (field536 == field1600 && client.field408 != client.field405) {
                                                                    class173 var60 = field536;
                                                                    byte var61 = 0;
                                                                    if (client.field420 == 1 && var60.field2731 == 206) {
                                                                        var61 = 1;
                                                                    }
                                                                    if (var60.field2742[client.field408] <= 0) {
                                                                        var61 = 0;
                                                                    }
                                                                    if (class178.method2668(client.method165(var60))) {
                                                                        int var62 = client.field405;
                                                                        int var63 = client.field408;
                                                                        var60.field2742[var63] = var60.field2742[var62];
                                                                        var60.field2800[var63] = var60.field2800[var62];
                                                                        var60.field2742[var62] = -1;
                                                                        var60.field2800[var62] = 0;
                                                                    } else if (var61 == 1) {
                                                                        int var64 = client.field405;
                                                                        int var65 = client.field408;
                                                                        while (var64 != var65) {
                                                                            if (var64 > var65) {
                                                                                var60.method3108(var64 - 1, var64);
                                                                                var64--;
                                                                            } else if (var64 < var65) {
                                                                                var60.method3108(var64 + 1, var64);
                                                                                var64++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var60.method3108(client.field408, client.field405);
                                                                    }
                                                                    client.field337.method2574(44);
                                                                    client.field337.method2358(client.field408);
                                                                    client.field337.method2360(client.field405);
                                                                    client.field337.method2351(var61);
                                                                    client.field337.method2423(field536.field2727);
                                                                }
                                                            } else if ((client.field458 == 1 || client.method2914(client.field571 - 1)) && client.field571 > 2) {
                                                                client.method239(client.field406, client.field407);
                                                            } else if (client.field571 > 0) {
                                                                client.method3158(client.field406, client.field407);
                                                            }
                                                            client.field402 = 10;
                                                            class140.field2137 = 0;
                                                            field536 = null;
                                                        } else if (client.field410 >= 5 && (class140.field2131 > client.field406 + 5 || class140.field2131 < client.field406 - 5 || class140.field2132 * -1076088155 > client.field407 + 5 || class140.field2132 * -1076088155 < client.field407 - 5)) {
                                                            client.field441 = true;
                                                        }
                                                    }
                                                    if (class86.field1454 != -1) {
                                                        int var66 = class86.field1454;
                                                        int var67 = class86.field1498;
                                                        client.field337.method2574(78);
                                                        client.field337.method2354(5);
                                                        client.field337.method2360(field23 + var67);
                                                        client.field337.method2312(field941 + var66);
                                                        client.field337.method2354(class137.field2094[82] ? (class137.field2094[81] ? 2 : 1) : 0);
                                                        class86.field1454 = -1;
                                                        client.field398 = class140.field2134;
                                                        client.field399 = class140.field2133;
                                                        client.field401 = 1;
                                                        client.field400 = 0;
                                                        client.field460 = var66;
                                                        client.field525 = var67;
                                                    }
                                                    if (field2014 != var33) {
                                                        if (var33 != null) {
                                                            client.method628(var33);
                                                        }
                                                        if (field2014 != null) {
                                                            client.method628(field2014);
                                                        }
                                                    }
                                                    if (field3047 != var34 && client.field487 == client.field440) {
                                                        if (var34 != null) {
                                                            client.method628(var34);
                                                        }
                                                        if (field3047 != null) {
                                                            client.method628(field3047);
                                                        }
                                                    }
                                                    if (field3047 == null) {
                                                        if (client.field440 > 0) {
                                                            client.field440--;
                                                        }
                                                    } else if (client.field440 < client.field487) {
                                                        client.field440++;
                                                        if (client.field487 == client.field440) {
                                                            client.method628(field3047);
                                                        }
                                                    }
                                                    int var68 = client.field355 + field677.field839;
                                                    int var69 = client.field297 + field677.field803;
                                                    if (field1217 - var68 < -500 || field1217 - var68 > 500 || field694 - var69 < -500 || field694 - var69 > 500) {
                                                        field1217 = var68;
                                                        field694 = var69;
                                                    }
                                                    if (field1217 != var68) {
                                                        field1217 += (var68 - field1217) / 16;
                                                    }
                                                    if (field694 != var69) {
                                                        field694 += (var69 - field694) / 16;
                                                    }
                                                    if (class140.field2130 == 4 && field319) {
                                                        int var70 = class140.field2132 * -1076088155 - client.field379;
                                                        client.field377 = var70 * 2;
                                                        client.field379 = var70 == -1 || var70 == 1 ? class140.field2132 * -1076088155 : (client.field379 + class140.field2132 * -1076088155) / 2;
                                                        int var71 = client.field378 - class140.field2131;
                                                        client.field376 = var71 * 2;
                                                        client.field378 = var71 == -1 || var71 == 1 ? class140.field2131 : (client.field378 + class140.field2131) / 2;
                                                    } else {
                                                        if (class137.field2094[96]) {
                                                            client.field376 += (-24 - client.field376) / 2;
                                                        } else if (class137.field2094[97]) {
                                                            client.field376 += (24 - client.field376) / 2;
                                                        } else {
                                                            client.field376 /= 2;
                                                        }
                                                        if (class137.field2094[98]) {
                                                            client.field377 += (12 - client.field377) / 2;
                                                        } else if (class137.field2094[99]) {
                                                            client.field377 += (-12 - client.field377) / 2;
                                                        } else {
                                                            client.field377 /= 2;
                                                        }
                                                        client.field379 = class140.field2132 * -1076088155;
                                                        client.field378 = class140.field2131;
                                                    }
                                                    client.field375 = client.field376 / 2 + client.field375 & 0x7FF;
                                                    client.field374 += client.field377 / 2;
                                                    if (client.field374 < 128) {
                                                        client.field374 = 128;
                                                    }
                                                    if (client.field374 > 383) {
                                                        client.field374 = 383;
                                                    }
                                                    int var72 = field1217 >> 7;
                                                    int var73 = field694 >> 7;
                                                    int var74 = method200(field1217, field694, field27);
                                                    int var75 = 0;
                                                    if (var72 > 3 && var73 > 3 && var72 < 100 && var73 < 100) {
                                                        for (int var76 = var72 - 4; var76 <= var72 + 4; var76++) {
                                                            for (int var77 = var73 - 4; var77 <= var73 + 4; var77++) {
                                                                int var78 = field27;
                                                                if (var78 < 3 && (class6.field80[1][var76][var77] & 0x2) == 2) {
                                                                    var78++;
                                                                }
                                                                int var79 = var74 - class6.field86[var78][var76][var77];
                                                                if (var79 > var75) {
                                                                    var75 = var79;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var80 = var75 * 192;
                                                    if (var80 > 98048) {
                                                        var80 = 98048;
                                                    }
                                                    if (var80 < 32768) {
                                                        var80 = 32768;
                                                    }
                                                    if (var80 > client.field383) {
                                                        client.field383 += (var80 - client.field383) / 24;
                                                    } else if (var80 < client.field383) {
                                                        client.field383 += (var80 - client.field383) / 80;
                                                    }
                                                    if (client.field431) {
                                                        client.method2008();
                                                    }
                                                    for (int var81 = 0; var81 < 5; var81++) {
                                                        int var10002 = client.field544[var81]++;
                                                    }
                                                    field480.method202();
                                                    int var82 = ++class140.field2126 - 1;
                                                    int var84 = class137.field2103;
                                                    if (var82 > 15000 && var84 > 15000) {
                                                        client.field344 = 250;
                                                        class140.method194(14500);
                                                        client.field337.method2574(1);
                                                    }
                                                    client.field361++;
                                                    if (client.field361 > 500) {
                                                        client.field361 = 0;
                                                        int var86 = (int) (Math.random() * 8.0D);
                                                        if ((var86 & 0x1) == 1) {
                                                            client.field355 += client.field356;
                                                        }
                                                        if ((var86 & 0x2) == 2) {
                                                            client.field297 += client.field358;
                                                        }
                                                        if ((var86 & 0x4) == 4) {
                                                            client.field454 += client.field360;
                                                        }
                                                    }
                                                    if (client.field355 < -50) {
                                                        client.field356 = 2;
                                                    }
                                                    if (client.field355 > 50) {
                                                        client.field356 = -2;
                                                    }
                                                    if (client.field297 < -55) {
                                                        client.field358 = 2;
                                                    }
                                                    if (client.field297 > 55) {
                                                        client.field358 = -2;
                                                    }
                                                    if (client.field454 < -40) {
                                                        client.field360 = 1;
                                                    }
                                                    if (client.field454 > 40) {
                                                        client.field360 = -1;
                                                    }
                                                    client.field366++;
                                                    if (client.field366 > 500) {
                                                        client.field366 = 0;
                                                        int var87 = (int) (Math.random() * 8.0D);
                                                        if ((var87 & 0x1) == 1) {
                                                            client.field456 += client.field522;
                                                        }
                                                        if ((var87 & 0x2) == 2) {
                                                            client.field364 += client.field365;
                                                        }
                                                    }
                                                    if (client.field456 < -60) {
                                                        client.field522 = 2;
                                                    }
                                                    if (client.field456 > 60) {
                                                        client.field522 = -2;
                                                    }
                                                    if (client.field364 < -20) {
                                                        client.field365 = 1;
                                                    }
                                                    if (client.field364 > 10) {
                                                        client.field365 = -1;
                                                    }
                                                    for (class39 var88 = (class39) client.field339.method3452(); var88 != null; var88 = (class39) client.field339.method3453()) {
                                                        if ((long) var88.field867 < class115.method671() / 1000L - 5L) {
                                                            if (var88.field865 > 0) {
                                                                class12.method2628(5, "", var88.field864 + class157.field2440);
                                                            }
                                                            if (var88.field865 == 0) {
                                                                class12.method2628(5, "", var88.field864 + class157.field2552);
                                                            }
                                                            var88.method3584();
                                                        }
                                                    }
                                                    client.field340++;
                                                    if (client.field340 > 50) {
                                                        client.field337.method2574(71);
                                                    }
                                                    try {
                                                        if (field154 != null && client.field337.field1973 > 0) {
                                                            field154.method2789(client.field337.field1974, 0, client.field337.field1973);
                                                            client.field337.field1973 = 0;
                                                            client.field340 = 0;
                                                        }
                                                    } catch (IOException var90) {
                                                        client.method2986();
                                                    }
                                                    return;
                                                }
                                                var47 = var46.field3;
                                                if (var47.field2728 < 0) {
                                                    break;
                                                }
                                                var48 = class173.method945(var47.field2746);
                                            } while (var48 == null || var48.field2849 == null || var47.field2728 >= var48.field2849.length || var48.field2849[var47.field2728] != var47);
                                            class37.method1926(var46);
                                        }
                                    }
                                    var44 = var43.field3;
                                    if (var44.field2728 < 0) {
                                        break;
                                    }
                                    var45 = class173.method945(var44.field2746);
                                } while (var45 == null || var45.field2849 == null || var44.field2728 >= var45.field2849.length || var45.field2849[var44.field2728] != var44);
                                class37.method1926(var43);
                            }
                        }
                        var41 = var40.field3;
                        if (var41.field2728 < 0) {
                            break;
                        }
                        var42 = class173.method945(var41.field2746);
                    } while (var42 == null || var42.field2849 == null || var41.field2728 >= var42.field2849.length || var42.field2849[var41.field2728] != var41);
                    class37.method1926(var40);
                }
            }
            client.field337.method2574(60);
            client.field337.method2354(0);
            int var3 = client.field337.field1973;
            class211.method2915(client.field337);
            client.field337.method2532(client.field337.field1973 - var3);
        }
    }

    @ObfuscatedName("eu.t(IIB)V")
    public static void method2909(int arg0, int arg1) {
        if (client.field527 != 0 && arg0 != -1) {
            class183.method2205(field1379, arg0, 0, client.field527, false);
            client.field552 = true;
        }
    }

    @ObfuscatedName("t.aj(Laq;B)V")
    public static final void method590(class38 arg0) {
        arg0.field805 = false;
        if (arg0.field830 != -1) {
            class43 var1 = class43.method750(arg0.field830);
            if (var1 == null || var1.field986 == null) {
                arg0.field830 = -1;
            } else {
                arg0.field809++;
                if (arg0.field831 < var1.field986.length && arg0.field809 > var1.field985[arg0.field831]) {
                    arg0.field809 = 1;
                    arg0.field831++;
                    client.method2110(var1, arg0.field831, arg0.field839, arg0.field803);
                }
                if (arg0.field831 >= var1.field986.length) {
                    arg0.field809 = 0;
                    arg0.field831 = 0;
                    client.method2110(var1, arg0.field831, arg0.field839, arg0.field803);
                }
            }
        }
        if (arg0.field838 != -1 && client.field303 >= arg0.field849) {
            if (arg0.field850 < 0) {
                arg0.field850 = 0;
            }
            int var2 = class44.method3639(arg0.field838).field1010;
            if (var2 == -1) {
                arg0.field838 = -1;
            } else {
                class43 var3 = class43.method750(var2);
                if (var3 == null || var3.field986 == null) {
                    arg0.field838 = -1;
                } else {
                    arg0.field840++;
                    if (arg0.field850 < var3.field986.length && arg0.field840 > var3.field985[arg0.field850]) {
                        arg0.field840 = 1;
                        arg0.field850++;
                        client.method2110(var3, arg0.field850, arg0.field839, arg0.field803);
                    }
                    if (arg0.field850 >= var3.field986.length && (arg0.field850 < 0 || arg0.field850 >= var3.field986.length)) {
                        arg0.field838 = -1;
                    }
                }
            }
        }
        if (arg0.field833 != -1 && arg0.field836 <= 1) {
            class43 var4 = class43.method750(arg0.field833);
            if (var4.field983 == 1 && arg0.field802 > 0 && arg0.field847 <= client.field303 && arg0.field848 < client.field303) {
                arg0.field836 = 1;
                return;
            }
        }
        if (arg0.field833 != -1 && arg0.field836 == 0) {
            class43 var5 = class43.method750(arg0.field833);
            if (var5 == null || var5.field986 == null) {
                arg0.field833 = -1;
            } else {
                arg0.field835++;
                if (arg0.field834 < var5.field986.length && arg0.field835 > var5.field985[arg0.field834]) {
                    arg0.field835 = 1;
                    arg0.field834++;
                    client.method2110(var5, arg0.field834, arg0.field839, arg0.field803);
                }
                if (arg0.field834 >= var5.field986.length) {
                    arg0.field834 -= var5.field994;
                    arg0.field837++;
                    if (arg0.field837 >= var5.field984) {
                        arg0.field833 = -1;
                    } else if (arg0.field834 >= 0 && arg0.field834 < var5.field986.length) {
                        client.method2110(var5, arg0.field834, arg0.field839, arg0.field803);
                    } else {
                        arg0.field833 = -1;
                    }
                }
                arg0.field805 = var5.field989;
            }
        }
        if (arg0.field836 > 0) {
            arg0.field836--;
        }
    }

    @ObfuscatedName("x.at(IIIB)I")
    public static final int method200(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field80[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field86[var5][var3][var4] + class6.field86[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field86[var5][var3][var4 + 1] + class6.field86[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("s.bx(B)V")
    public static void method170() {
        for (int var0 = 0; var0 < client.field571; var0++) {
            int var1 = client.field434[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < client.field571 - 1) {
                    for (int var3 = var0; var3 < client.field571 - 1; var3++) {
                        client.field436[var3] = client.field436[var3 + 1];
                        client.field437[var3] = client.field437[var3 + 1];
                        client.field434[var3] = client.field434[var3 + 1];
                        client.field435[var3] = client.field435[var3 + 1];
                        client.field432[var3] = client.field432[var3 + 1];
                        client.field433[var3] = client.field433[var3 + 1];
                    }
                }
                client.field571--;
            }
        }
    }

    @ObfuscatedName("ee.cp([Lft;IIIIIIIII)V")
    public static final void method2740(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1713(arg2, arg3, arg4, arg5);
        class91.method1960();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2746 == arg1 || arg1 == -1412584499 && client.field359 == var10)) {
                int var11;
                if (arg8 == -1) {
                    client.field498[client.field493] = var10.field2768 + arg6;
                    client.field507[client.field493] = var10.field2812 + arg7;
                    client.field500[client.field493] = var10.field2825;
                    client.field501[client.field493] = var10.field2743;
                    var11 = ++client.field493 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2856 = var11;
                var10.field2725 = client.field303;
                if (!var10.field2726 || !client.method163(var10)) {
                    if (var10.field2731 > 0) {
                        int var12 = var10.field2731;
                        if (var12 == 324) {
                            if (client.field565 == -1) {
                                client.field565 = var10.field2792;
                                client.field448 = var10.field2761;
                            }
                            if (client.field465.field2887) {
                                var10.field2792 = client.field565;
                            } else {
                                var10.field2792 = client.field448;
                            }
                        } else if (var12 == 325) {
                            if (client.field565 == -1) {
                                client.field565 = var10.field2792;
                                client.field448 = var10.field2761;
                            }
                            if (client.field465.field2887) {
                                var10.field2792 = client.field448;
                            } else {
                                var10.field2792 = client.field565;
                            }
                        } else if (var12 == 327) {
                            var10.field2776 = 150;
                            var10.field2784 = (int) (Math.sin((double) client.field303 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2718 = 5;
                            var10.field2769 = 0;
                        } else if (var12 == 328) {
                            var10.field2776 = 150;
                            var10.field2784 = (int) (Math.sin((double) client.field303 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2718 = 5;
                            var10.field2769 = 1;
                        }
                    }
                    int var13 = var10.field2768 + arg6;
                    int var14 = var10.field2812 + arg7;
                    int var15 = var10.field2757;
                    if (client.field359 == var10) {
                        if (arg1 != -1412584499 && !var10.field2803) {
                            field215 = arg0;
                            field2642 = arg6;
                            field589 = arg7;
                            continue;
                        }
                        if (client.field473 && client.field540) {
                            int var16 = class140.field2131;
                            int var17 = class140.field2132 * -1076088155;
                            int var18 = var16 - client.field464;
                            int var19 = var17 - client.field538;
                            if (var18 < client.field468) {
                                var18 = client.field468;
                            }
                            if (var10.field2825 + var18 > client.field468 + client.field463.field2825) {
                                var18 = client.field468 + client.field463.field2825 - var10.field2825;
                            }
                            if (var19 < client.field362) {
                                var19 = client.field362;
                            }
                            if (var10.field2743 + var19 > client.field362 + client.field463.field2743) {
                                var19 = client.field362 + client.field463.field2743 - var10.field2743;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2803) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2729 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2729 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2825 + var13;
                        int var27 = var10.field2743 + var14;
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
                        int var30 = var10.field2825 + var13;
                        int var31 = var10.field2743 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2726 || var20 < var22 && var21 < var23) {
                        if (var10.field2731 != 0) {
                            if (var10.field2731 == 1336) {
                                if (client.field467) {
                                    var14 += 15;
                                    field143.method3703("Fps:" + client.field2177, var10.field2825 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && client.field429) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !client.field429) {
                                        var34 = 16711680;
                                    }
                                    field143.method3703("Mem:" + var33 + "k", var10.field2825 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2731 == 1337) {
                                client.field574 = var13;
                                client.field439 = var14;
                                int var37 = var10.field2825;
                                int var38 = var10.field2743;
                                client.field332++;
                                client.method884(class34.field764);
                                boolean var39 = false;
                                if (client.field421 >= 0) {
                                    int var40 = class33.field750;
                                    int[] var41 = class33.field751;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (client.field421 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    client.method884(class34.field762);
                                }
                                client.method944(true);
                                client.method884(var39 ? class34.field770 : class34.field763);
                                client.method944(false);
                                client.method167();
                                for (class30 var43 = (class30) client.field483.method3493(); var43 != null; var43 = (class30) client.field483.method3495()) {
                                    if (field27 != var43.field686 || var43.field688) {
                                        var43.method3588();
                                    } else if (client.field303 >= var43.field687) {
                                        var43.method631(client.field367);
                                        if (var43.field688) {
                                            var43.method3588();
                                        } else {
                                            field2038.method1799(var43.field686, var43.field699, var43.field684, var43.field689, 60, var43, 0, -1, false);
                                        }
                                    }
                                }
                                client.method2028(var13, var14, var37, var38, true);
                                int var44 = client.field553;
                                int var45 = client.field554;
                                int var46 = client.field555;
                                int var47 = client.field556;
                                class80.method1713(var44, var45, var44 + var46, var45 + var47);
                                class91.method1960();
                                if (!client.field431) {
                                    int var48 = client.field374;
                                    if (client.field383 / 256 > var48) {
                                        var48 = client.field383 / 256;
                                    }
                                    if (client.field310[4] && client.field449[4] + 128 > var48) {
                                        var48 = client.field449[4] + 128;
                                    }
                                    int var49 = client.field454 + client.field375 & 0x7FF;
                                    int var50 = field1217;
                                    int var51 = method200(field677.field839, field677.field803, field27) - client.field380;
                                    int var52 = field694;
                                    int var53 = var48 * 3 + 600;
                                    int var54 = 2048 - var48 & 0x7FF;
                                    int var55 = 2048 - var49 & 0x7FF;
                                    int var56 = 0;
                                    int var57 = 0;
                                    int var58 = var53;
                                    if (var54 != 0) {
                                        int var59 = class91.field1566[var54];
                                        int var60 = class91.field1585[var54];
                                        int var61 = var57 * var60 - var53 * var59 >> 16;
                                        var58 = var57 * var59 + var53 * var60 >> 16;
                                        var57 = var61;
                                    }
                                    if (var55 != 0) {
                                        int var62 = class91.field1566[var55];
                                        int var63 = class91.field1585[var55];
                                        int var64 = var56 * var63 + var58 * var62 >> 16;
                                        var58 = var58 * var63 - var56 * var62 >> 16;
                                        var56 = var64;
                                    }
                                    field226 = var50 - var56;
                                    field165 = var51 - var57;
                                    field217 = var52 - var58;
                                    field908 = var48;
                                    field657 = var49;
                                }
                                int var77;
                                if (client.field431) {
                                    var77 = client.method981();
                                } else {
                                    int var65;
                                    if (field1549.field144) {
                                        var65 = field27;
                                    } else {
                                        label1273: {
                                            int var66 = 3;
                                            if (field908 < 310) {
                                                int var67 = field226 >> 7;
                                                int var68 = field217 >> 7;
                                                int var69 = field677.field839 >> 7;
                                                int var70 = field677.field803 >> 7;
                                                if (var67 < 0 || var68 < 0 || var67 >= 104 || var68 >= 104) {
                                                    var65 = field27;
                                                    break label1273;
                                                }
                                                if ((class6.field80[field27][var67][var68] & 0x4) != 0) {
                                                    var66 = field27;
                                                }
                                                int var71;
                                                if (var69 > var67) {
                                                    var71 = var69 - var67;
                                                } else {
                                                    var71 = var67 - var69;
                                                }
                                                int var72;
                                                if (var70 > var68) {
                                                    var72 = var70 - var68;
                                                } else {
                                                    var72 = var68 - var70;
                                                }
                                                if (var71 > var72) {
                                                    int var73 = var72 * 65536 / var71;
                                                    int var74 = 32768;
                                                    while (var67 != var69) {
                                                        if (var67 < var69) {
                                                            var67++;
                                                        } else if (var67 > var69) {
                                                            var67--;
                                                        }
                                                        if ((class6.field80[field27][var67][var68] & 0x4) != 0) {
                                                            var66 = field27;
                                                        }
                                                        var74 += var73;
                                                        if (var74 >= 65536) {
                                                            var74 -= 65536;
                                                            if (var68 < var70) {
                                                                var68++;
                                                            } else if (var68 > var70) {
                                                                var68--;
                                                            }
                                                            if ((class6.field80[field27][var67][var68] & 0x4) != 0) {
                                                                var66 = field27;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var75 = var71 * 65536 / var72;
                                                    int var76 = 32768;
                                                    while (var68 != var70) {
                                                        if (var68 < var70) {
                                                            var68++;
                                                        } else if (var68 > var70) {
                                                            var68--;
                                                        }
                                                        if ((class6.field80[field27][var67][var68] & 0x4) != 0) {
                                                            var66 = field27;
                                                        }
                                                        var76 += var75;
                                                        if (var76 >= 65536) {
                                                            var76 -= 65536;
                                                            if (var67 < var69) {
                                                                var67++;
                                                            } else if (var67 > var69) {
                                                                var67--;
                                                            }
                                                            if ((class6.field80[field27][var67][var68] & 0x4) != 0) {
                                                                var66 = field27;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (field677.field839 >= 0 && field677.field803 >= 0 && field677.field839 < 13312 && field677.field803 < 13312) {
                                                if ((class6.field80[field27][field677.field839 >> 7][field677.field803 >> 7] & 0x4) != 0) {
                                                    var66 = field27;
                                                }
                                                var65 = var66;
                                            } else {
                                                var65 = field27;
                                            }
                                        }
                                    }
                                    var77 = var65;
                                }
                                int var78 = field226;
                                int var79 = field165;
                                int var80 = field217;
                                int var81 = field908;
                                int var82 = field657;
                                for (int var83 = 0; var83 < 5; var83++) {
                                    if (client.field310[var83]) {
                                        int var84 = (int) (Math.random() * (double) (client.field474[var83] * 2 + 1) - (double) client.field474[var83] + Math.sin((double) client.field543[var83] / 100.0D * (double) client.field544[var83]) * (double) client.field449[var83]);
                                        if (var83 == 0) {
                                            field226 += var84;
                                        }
                                        if (var83 == 1) {
                                            field165 += var84;
                                        }
                                        if (var83 == 2) {
                                            field217 += var84;
                                        }
                                        if (var83 == 3) {
                                            field657 = field657 + var84 & 0x7FF;
                                        }
                                        if (var83 == 4) {
                                            field908 += var84;
                                            if (field908 < 128) {
                                                field908 = 128;
                                            }
                                            if (field908 > 383) {
                                                field908 = 383;
                                            }
                                        }
                                    }
                                }
                                int var85 = class140.field2131;
                                int var86 = class140.field2132 * -1076088155;
                                if (class140.field2137 != 0) {
                                    var85 = class140.field2134;
                                    var86 = class140.field2133;
                                }
                                if (var85 >= var44 && var85 < var44 + var46 && var86 >= var45 && var86 < var45 + var47) {
                                    class105.field1843 = true;
                                    class105.field1817 = 0;
                                    class105.field1844 = var85 - var44;
                                    class105.field1840 = var86 - var45;
                                } else {
                                    class105.field1843 = false;
                                    class105.field1817 = 0;
                                }
                                client.method1481();
                                class80.method1670(var44, var45, var46, var47, 0);
                                client.method1481();
                                int var87 = class91.field1570;
                                class91.field1570 = client.field557;
                                field2038.method1793(field226, field165, field217, field908, field657, var77);
                                class91.field1570 = var87;
                                client.method1481();
                                field2038.method1769();
                                client.field384 = 0;
                                boolean var88 = false;
                                int var89 = -1;
                                int var90 = class33.field750;
                                int[] var91 = class33.field751;
                                for (int var92 = 0; var92 < client.field457 + var90; var92++) {
                                    class38 var93;
                                    if (var92 < var90) {
                                        var93 = client.field412[var91[var92]];
                                        if (client.field421 == var91[var92]) {
                                            var88 = true;
                                            var89 = var92;
                                            continue;
                                        }
                                    } else {
                                        var93 = client.field415[client.field331[var92 - var90]];
                                    }
                                    client.method484(var93, var92, var44, var45, var46, var47);
                                }
                                if (var88) {
                                    client.method484(client.field412[client.field421], var89, var44, var45, var46, var47);
                                }
                                for (int var94 = 0; var94 < client.field384; var94++) {
                                    int var95 = client.field386[var94];
                                    int var96 = client.field387[var94];
                                    int var97 = client.field529[var94];
                                    int var98 = client.field524[var94];
                                    boolean var99 = true;
                                    while (var99) {
                                        var99 = false;
                                        for (int var100 = 0; var100 < var94; var100++) {
                                            if (var96 + 2 > client.field387[var100] - client.field524[var100] && var96 - var98 < client.field387[var100] + 2 && var95 - var97 < client.field529[var100] + client.field386[var100] && var95 + var97 > client.field386[var100] - client.field529[var100] && client.field387[var100] - client.field524[var100] < var96) {
                                                var96 = client.field387[var100] - client.field524[var100];
                                                var99 = true;
                                            }
                                        }
                                    }
                                    client.field298 = client.field386[var94];
                                    client.field397 = client.field387[var94] = var96;
                                    String var101 = client.field393[var94];
                                    if (client.field451 == 0) {
                                        int var102 = 16776960;
                                        if (client.field390[var94] < 6) {
                                            var102 = client.field350[client.field390[var94]];
                                        }
                                        if (client.field390[var94] == 6) {
                                            var102 = client.field332 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (client.field390[var94] == 7) {
                                            var102 = client.field332 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (client.field390[var94] == 8) {
                                            var102 = client.field332 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (client.field390[var94] == 9) {
                                            int var103 = 150 - client.field392[var94];
                                            if (var103 < 50) {
                                                var102 = var103 * 1280 + 16711680;
                                            } else if (var103 < 100) {
                                                var102 = 16776960 - (var103 - 50) * 327680;
                                            } else if (var103 < 150) {
                                                var102 = (var103 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (client.field390[var94] == 10) {
                                            int var104 = 150 - client.field392[var94];
                                            if (var104 < 50) {
                                                var102 = var104 * 5 + 16711680;
                                            } else if (var104 < 100) {
                                                var102 = 16711935 - (var104 - 50) * 327680;
                                            } else if (var104 < 150) {
                                                var102 = (var104 - 100) * 327680 + 255 - (var104 - 100) * 5;
                                            }
                                        }
                                        if (client.field390[var94] == 11) {
                                            int var105 = 150 - client.field392[var94];
                                            if (var105 < 50) {
                                                var102 = 16777215 - var105 * 327685;
                                            } else if (var105 < 100) {
                                                var102 = (var105 - 50) * 327685 + 65280;
                                            } else if (var105 < 150) {
                                                var102 = 16777215 - (var105 - 100) * 327680;
                                            }
                                        }
                                        if (client.field391[var94] == 0) {
                                            field1044.method3741(var101, client.field298 + var44, client.field397 + var45, var102, 0);
                                        }
                                        if (client.field391[var94] == 1) {
                                            field1044.method3705(var101, client.field298 + var44, client.field397 + var45, var102, 0, client.field332);
                                        }
                                        if (client.field391[var94] == 2) {
                                            field1044.method3745(var101, client.field298 + var44, client.field397 + var45, var102, 0, client.field332);
                                        }
                                        if (client.field391[var94] == 3) {
                                            field1044.method3707(var101, client.field298 + var44, client.field397 + var45, var102, 0, client.field332, 150 - client.field392[var94]);
                                        }
                                        if (client.field391[var94] == 4) {
                                            int var106 = (150 - client.field392[var94]) * (field1044.method3758(var101) + 100) / 150;
                                            class80.method1665(client.field298 + var44 - 50, var45, client.field298 + var44 + 50, var45 + var47);
                                            field1044.method3702(var101, client.field298 + var44 + 50 - var106, client.field397 + var45, var102, 0);
                                            class80.method1713(var44, var45, var44 + var46, var45 + var47);
                                        }
                                        if (client.field391[var94] == 5) {
                                            int var107 = 150 - client.field392[var94];
                                            int var108 = 0;
                                            if (var107 < 25) {
                                                var108 = var107 - 25;
                                            } else if (var107 > 125) {
                                                var108 = var107 - 125;
                                            }
                                            class80.method1665(var44, client.field397 + var45 - field1044.field3163 - 1, var44 + var46, client.field397 + var45 + 5);
                                            field1044.method3741(var101, client.field298 + var44, client.field397 + var45 + var108, var102, 0);
                                            class80.method1713(var44, var45, var44 + var46, var45 + var47);
                                        }
                                    } else {
                                        field1044.method3741(var101, client.field298 + var44, client.field397 + var45, 16776960, 0);
                                    }
                                }
                                if (client.field311 == 2) {
                                    client.method777((client.field566 - field941 << 7) + client.field317, (client.field315 - field23 << 7) + client.field486, client.field510 * 2);
                                    if (client.field298 > -1 && client.field303 % 20 < 10) {
                                        field3029[0].method1622(client.field298 + var44 - 12, client.field397 + var45 - 28);
                                    }
                                }
                                ((class95) field1581).method2017(client.field367);
                                client.method673(var44, var45, var46, var47);
                                field226 = var78;
                                field165 = var79;
                                field217 = var80;
                                field908 = var81;
                                field657 = var82;
                                if (client.field302) {
                                    byte var109 = 0;
                                    int var110 = class171.field2710 + class171.field2692 + var109;
                                    if (var110 == 0) {
                                        client.field302 = false;
                                    }
                                }
                                if (client.field302) {
                                    class80.method1670(var44, var45, var46, var47, 0);
                                    client.method565(class157.field2386, false);
                                }
                                client.field495[var10.field2856] = true;
                                class80.method1713(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2731 == 1338) {
                                client.method9(var10, var13, var14, var11);
                                class80.method1713(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2731 == 1339) {
                                client.method785(var10, var13, var14, var11);
                                class80.method1713(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2729 == 0) {
                            if (!var10.field2726 && client.method163(var10) && field2014 != var10) {
                                continue;
                            }
                            if (!var10.field2726) {
                                if (var10.field2749 > var10.field2850 - var10.field2743) {
                                    var10.field2749 = var10.field2850 - var10.field2743;
                                }
                                if (var10.field2749 < 0) {
                                    var10.field2749 = 0;
                                }
                            }
                            method2740(arg0, var10.field2727, var20, var21, var22, var23, var13 - var10.field2764, var14 - var10.field2749, var11);
                            if (var10.field2849 != null) {
                                method2740(var10.field2849, var10.field2727, var20, var21, var22, var23, var13 - var10.field2764, var14 - var10.field2749, var11);
                            }
                            class4 var112 = (class4) client.field450.method3459((long) var10.field2727);
                            if (var112 != null) {
                                client.method629(var112.field63, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class80.method1713(arg2, arg3, arg4, arg5);
                            class91.method1960();
                        }
                        if (client.field504 || client.field497[var11] || client.field502 > 1) {
                            if (var10.field2729 == 0 && !var10.field2726 && var10.field2850 > var10.field2743) {
                                client.method2113(var10.field2825 + var13, var14, var10.field2749, var10.field2743, var10.field2850);
                            }
                            if (var10.field2729 != 1) {
                                if (var10.field2729 == 2) {
                                    int var113 = 0;
                                    for (int var114 = 0; var114 < var10.field2739; var114++) {
                                        for (int var115 = 0; var115 < var10.field2738; var115++) {
                                            int var116 = (var10.field2791 + 32) * var115 + var13;
                                            int var117 = (var10.field2785 + 32) * var114 + var14;
                                            if (var113 < 20) {
                                                var116 += var10.field2793[var113];
                                                var117 += var10.field2857[var113];
                                            }
                                            if (var10.field2742[var113] > 0) {
                                                boolean var118 = false;
                                                boolean var119 = false;
                                                int var120 = var10.field2742[var113] - 1;
                                                if (var116 + 32 > arg2 && var116 < arg4 && var117 + 32 > arg3 && var117 < arg5 || field536 == var10 && client.field405 == var113) {
                                                    class79 var121;
                                                    if (client.field442 == 1 && field768 == var113 && field125 == var10.field2727) {
                                                        var121 = class52.method2629(var120, var10.field2800[var113], 2, 0, 2, false);
                                                    } else {
                                                        var121 = class52.method2629(var120, var10.field2800[var113], 1, 3153952, 2, false);
                                                    }
                                                    if (var121 == null) {
                                                        client.method628(var10);
                                                    } else if (field536 == var10 && client.field405 == var113) {
                                                        int var122 = class140.field2131 - client.field406;
                                                        int var123 = class140.field2132 * -1076088155 - client.field407;
                                                        if (var122 < 5 && var122 > -5) {
                                                            var122 = 0;
                                                        }
                                                        if (var123 < 5 && var123 > -5) {
                                                            var123 = 0;
                                                        }
                                                        if (client.field410 < 5) {
                                                            var122 = 0;
                                                            var123 = 0;
                                                        }
                                                        var121.method1591(var116 + var122, var117 + var123, 128);
                                                        if (arg1 != -1) {
                                                            class173 var124 = arg0[arg1 & 0xFFFF];
                                                            if (var117 + var123 < class80.field1413 && var124.field2749 > 0) {
                                                                int var125 = client.field367 * (class80.field1413 - var117 - var123) / 3;
                                                                if (var125 > client.field367 * 10) {
                                                                    var125 = client.field367 * 10;
                                                                }
                                                                if (var125 > var124.field2749) {
                                                                    var125 = var124.field2749;
                                                                }
                                                                var124.field2749 -= var125;
                                                                client.field407 += var125;
                                                                client.method628(var124);
                                                            }
                                                            if (var117 + var123 + 32 > class80.field1416 && var124.field2749 < var124.field2850 - var124.field2743) {
                                                                int var126 = client.field367 * (var117 + var123 + 32 - class80.field1416) / 3;
                                                                if (var126 > client.field367 * 10) {
                                                                    var126 = client.field367 * 10;
                                                                }
                                                                if (var126 > var124.field2850 - var124.field2743 - var124.field2749) {
                                                                    var126 = var124.field2850 - var124.field2743 - var124.field2749;
                                                                }
                                                                var124.field2749 += var126;
                                                                client.field407 -= var126;
                                                                client.method628(var124);
                                                            }
                                                        }
                                                    } else if (field1040 == var10 && client.field403 == var113) {
                                                        var121.method1591(var116, var117, 128);
                                                    } else {
                                                        var121.method1622(var116, var117);
                                                    }
                                                }
                                            } else if (var10.field2795 != null && var113 < 20) {
                                                class79 var127 = var10.method3124(var113);
                                                if (var127 != null) {
                                                    var127.method1622(var116, var117);
                                                } else if (class173.field2843) {
                                                    client.method628(var10);
                                                }
                                            }
                                            var113++;
                                        }
                                    }
                                } else if (var10.field2729 == 3) {
                                    int var128;
                                    if (client.method175(var10)) {
                                        var128 = var10.field2753;
                                        if (field2014 == var10 && var10.field2755 != 0) {
                                            var128 = var10.field2755;
                                        }
                                    } else {
                                        var128 = var10.field2798;
                                        if (field2014 == var10 && var10.field2754 != 0) {
                                            var128 = var10.field2754;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2756) {
                                            class80.method1670(var13, var14, var10.field2825, var10.field2743, var128);
                                        } else {
                                            class80.method1703(var13, var14, var10.field2825, var10.field2743, var128);
                                        }
                                    } else if (var10.field2756) {
                                        class80.method1700(var13, var14, var10.field2825, var10.field2743, var128, 256 - (var15 & 0xFF));
                                    } else {
                                        class80.method1673(var13, var14, var10.field2825, var10.field2743, var128, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2729 == 4) {
                                    class224 var129 = var10.method3121();
                                    if (var129 != null) {
                                        String var130 = var10.field2721;
                                        int var131;
                                        if (client.method175(var10)) {
                                            var131 = var10.field2753;
                                            if (field2014 == var10 && var10.field2755 != 0) {
                                                var131 = var10.field2755;
                                            }
                                            if (var10.field2786.length() > 0) {
                                                var130 = var10.field2786;
                                            }
                                        } else {
                                            var131 = var10.field2798;
                                            if (field2014 == var10 && var10.field2754 != 0) {
                                                var131 = var10.field2754;
                                            }
                                        }
                                        if (var10.field2726 && var10.field2845 != -1) {
                                            class52 var132 = class52.method560(var10.field2845);
                                            var130 = var132.field1118;
                                            if (var130 == null) {
                                                var130 = "null";
                                            }
                                            if ((var132.field1149 == 1 || var10.field2846 != 1) && var10.field2846 != -1) {
                                                var130 = class2.method2122(16748608) + var130 + class2.field16 + " " + 'x' + client.method113(var10.field2846);
                                            }
                                        }
                                        if (client.field453 == var10) {
                                            class157 var10000 = (class157) null;
                                            var130 = class157.field2451;
                                            var131 = var10.field2798;
                                        }
                                        if (!var10.field2726) {
                                            var130 = client.method3404(var130, var10);
                                        }
                                        var129.method3697(var130, var13, var14, var10.field2825, var10.field2743, var131, var10.field2740 ? 0 : -1, var10.field2788, var10.field2748, var10.field2844);
                                    } else if (class173.field2843) {
                                        client.method628(var10);
                                    }
                                } else if (var10.field2729 == 5) {
                                    if (var10.field2726) {
                                        class79 var134;
                                        if (var10.field2845 == -1) {
                                            var134 = var10.method3109(false);
                                        } else {
                                            var134 = class52.method2629(var10.field2845, var10.field2846, var10.field2752, var10.field2765, var10.field2783, false);
                                        }
                                        if (var134 != null) {
                                            int var135 = var134.field1406;
                                            int var136 = var134.field1407;
                                            if (var10.field2763) {
                                                class80.method1665(var13, var14, var10.field2825 + var13, var10.field2743 + var14);
                                                int var137 = (var10.field2825 + (var135 - 1)) / var135;
                                                int var138 = (var10.field2743 + (var136 - 1)) / var136;
                                                for (int var139 = 0; var139 < var137; var139++) {
                                                    for (int var140 = 0; var140 < var138; var140++) {
                                                        if (var10.field2762 != 0) {
                                                            var134.method1653(var135 / 2 + var135 * var139 + var13, var136 / 2 + var136 * var140 + var14, var10.field2762, 4096);
                                                        } else if (var15 == 0) {
                                                            var134.method1622(var135 * var139 + var13, var136 * var140 + var14);
                                                        } else {
                                                            var134.method1591(var135 * var139 + var13, var136 * var140 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1713(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var141 = var10.field2825 * 4096 / var135;
                                                if (var10.field2762 != 0) {
                                                    var134.method1653(var10.field2825 / 2 + var13, var10.field2743 / 2 + var14, var10.field2762, var141);
                                                } else if (var15 != 0) {
                                                    var134.method1593(var13, var14, var10.field2825, var10.field2743, 256 - (var15 & 0xFF));
                                                } else if (var10.field2825 == var135 && var10.field2743 == var136) {
                                                    var134.method1622(var13, var14);
                                                } else {
                                                    var134.method1587(var13, var14, var10.field2825, var10.field2743);
                                                }
                                            }
                                        } else if (class173.field2843) {
                                            client.method628(var10);
                                        }
                                    } else {
                                        class79 var133 = var10.method3109(client.method175(var10));
                                        if (var133 != null) {
                                            var133.method1622(var13, var14);
                                        } else if (class173.field2843) {
                                            client.method628(var10);
                                        }
                                    }
                                } else if (var10.field2729 == 6) {
                                    boolean var142 = client.method175(var10);
                                    int var143;
                                    if (var142) {
                                        var143 = var10.field2773;
                                    } else {
                                        var143 = var10.field2751;
                                    }
                                    class105 var144 = null;
                                    int var145 = 0;
                                    if (var10.field2845 != -1) {
                                        class52 var146 = class52.method560(var10.field2845);
                                        if (var146 != null) {
                                            class52 var147 = var146.method1004(var10.field2846);
                                            var144 = var147.method1003(1);
                                            if (var144 == null) {
                                                client.method628(var10);
                                            } else {
                                                var144.method2177();
                                                var145 = var144.field1450 / 2;
                                            }
                                        }
                                    } else if (var10.field2718 == 5) {
                                        if (var10.field2769 == 0) {
                                            var144 = client.field465.method3195((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var144 = field677.method10();
                                        }
                                    } else if (var143 == -1) {
                                        var144 = var10.method3112((class43) null, -1, var142, field677.field39);
                                        if (var144 == null && class173.field2843) {
                                            client.method628(var10);
                                        }
                                    } else {
                                        class43 var148 = class43.method750(var143);
                                        var144 = var10.method3112(var148, var10.field2859, var142, field677.field39);
                                        if (var144 == null && class173.field2843) {
                                            client.method628(var10);
                                        }
                                    }
                                    class91.method1934(var10.field2825 / 2 + var13, var10.field2743 / 2 + var14);
                                    int var149 = var10.field2790 * class91.field1566[var10.field2776] >> 16;
                                    int var150 = var10.field2790 * class91.field1585[var10.field2776] >> 16;
                                    if (var144 != null) {
                                        if (var10.field2726) {
                                            var144.method2177();
                                            if (var10.field2782) {
                                                var144.method2141(0, var10.field2784, var10.field2778, var10.field2776, var10.field2779, var10.field2775 + var145 + var149, var10.field2775 + var150, var10.field2790);
                                            } else {
                                                var144.method2196(0, var10.field2784, var10.field2778, var10.field2776, var10.field2779, var10.field2775 + var145 + var149, var10.field2775 + var150);
                                            }
                                        } else {
                                            var144.method2196(0, var10.field2784, 0, var10.field2776, 0, var149, var150);
                                        }
                                    }
                                    class91.method1933();
                                } else {
                                    if (var10.field2729 == 7) {
                                        class224 var151 = var10.method3121();
                                        if (var151 == null) {
                                            if (class173.field2843) {
                                                client.method628(var10);
                                            }
                                            continue;
                                        }
                                        int var152 = 0;
                                        for (int var153 = 0; var153 < var10.field2739; var153++) {
                                            for (int var154 = 0; var154 < var10.field2738; var154++) {
                                                if (var10.field2742[var152] > 0) {
                                                    class52 var155 = class52.method560(var10.field2742[var152] - 1);
                                                    String var156;
                                                    if (var155.field1149 != 1 && var10.field2800[var152] == 1) {
                                                        var156 = class2.method2122(16748608) + var155.field1118 + class2.field16;
                                                    } else {
                                                        var156 = class2.method2122(16748608) + var155.field1118 + class2.field16 + " " + 'x' + client.method113(var10.field2800[var152]);
                                                    }
                                                    int var157 = (var10.field2791 + 115) * var154 + var13;
                                                    int var158 = (var10.field2785 + 12) * var153 + var14;
                                                    if (var10.field2788 == 0) {
                                                        var151.method3702(var156, var157, var158, var10.field2798, var10.field2740 ? 0 : -1);
                                                    } else if (var10.field2788 == 1) {
                                                        var151.method3741(var156, var10.field2825 / 2 + var157, var158, var10.field2798, var10.field2740 ? 0 : -1);
                                                    } else {
                                                        var151.method3703(var156, var10.field2825 + var157 - 1, var158, var10.field2798, var10.field2740 ? 0 : -1);
                                                    }
                                                }
                                                var152++;
                                            }
                                        }
                                    }
                                    if (var10.field2729 == 8 && field3047 == var10 && client.field487 == client.field440) {
                                        int var159 = 0;
                                        int var160 = 0;
                                        class224 var161 = field143;
                                        String var162 = var10.field2721;
                                        String var163 = client.method3404(var162, var10);
                                        while (var163.length() > 0) {
                                            int var164 = var163.indexOf(class2.field25);
                                            String var165;
                                            if (var164 == -1) {
                                                var165 = var163;
                                                var163 = "";
                                            } else {
                                                var165 = var163.substring(0, var164);
                                                var163 = var163.substring(var164 + 4);
                                            }
                                            int var166 = var161.method3758(var165);
                                            if (var166 > var159) {
                                                var159 = var166;
                                            }
                                            var160 += var161.field3163 + 1;
                                        }
                                        var159 += 6;
                                        var160 += 7;
                                        int var167 = var10.field2825 + var13 - 5 - var159;
                                        int var168 = var10.field2743 + var14 + 5;
                                        if (var167 < var13 + 5) {
                                            var167 = var13 + 5;
                                        }
                                        if (var159 + var167 > arg4) {
                                            var167 = arg4 - var159;
                                        }
                                        if (var160 + var168 > arg5) {
                                            var168 = arg5 - var160;
                                        }
                                        class80.method1670(var167, var168, var159, var160, 16777120);
                                        class80.method1703(var167, var168, var159, var160, 0);
                                        String var169 = var10.field2721;
                                        int var170 = var161.field3163 + var168 + 2;
                                        String var171 = client.method3404(var169, var10);
                                        while (var171.length() > 0) {
                                            int var172 = var171.indexOf(class2.field25);
                                            String var173;
                                            if (var172 == -1) {
                                                var173 = var171;
                                                var171 = "";
                                            } else {
                                                var173 = var171.substring(0, var172);
                                                var171 = var171.substring(var172 + 4);
                                            }
                                            var161.method3702(var173, var167 + 3, var170, 0, -1);
                                            var170 += var161.field3163 + 1;
                                        }
                                    }
                                    if (var10.field2729 == 9) {
                                        if (var10.field2847 == 1) {
                                            int var174;
                                            int var175;
                                            int var176;
                                            int var177;
                                            if (var10.field2758) {
                                                var174 = var13;
                                                var175 = var10.field2743 + var14;
                                                var176 = var10.field2825 + var13;
                                                var177 = var14;
                                            } else {
                                                var174 = var13;
                                                var175 = var14;
                                                var176 = var10.field2825 + var13;
                                                var177 = var10.field2743 + var14;
                                            }
                                            class80.method1678(var174, var175, var176, var177, var10.field2798);
                                        } else {
                                            int var178 = var10.field2825 >= 0 ? var10.field2825 : -var10.field2825;
                                            int var179 = var10.field2743 >= 0 ? var10.field2743 : -var10.field2743;
                                            int var180 = var178;
                                            if (var178 < var179) {
                                                var180 = var179;
                                            }
                                            if (var180 != 0) {
                                                int var181 = (var10.field2825 << 16) / var180;
                                                int var182 = (var10.field2743 << 16) / var180;
                                                if (var182 <= var181) {
                                                    var181 = -var181;
                                                } else {
                                                    var182 = -var182;
                                                }
                                                int var183 = var10.field2847 * var182 >> 17;
                                                int var184 = var10.field2847 * var182 + 1 >> 17;
                                                int var185 = var10.field2847 * var181 >> 17;
                                                int var186 = var10.field2847 * var181 + 1 >> 17;
                                                int var187 = var13 + var183;
                                                int var188 = var13 - var184;
                                                int var189 = var10.field2825 + var13 - var184;
                                                int var190 = var10.field2825 + var13 + var183;
                                                int var191 = var14 + var185;
                                                int var192 = var14 - var186;
                                                int var193 = var10.field2743 + var14 - var186;
                                                int var194 = var10.field2743 + var14 + var185;
                                                class91.method1930(var187, var188, var189);
                                                class91.method1948(var191, var192, var193, var187, var188, var189, var10.field2798);
                                                class91.method1930(var187, var189, var190);
                                                class91.method1948(var191, var193, var194, var187, var189, var190, var10.field2798);
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
}
