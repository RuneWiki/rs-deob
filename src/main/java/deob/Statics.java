package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Statics {

    @ObfuscatedName("ay.fe")
    public static int field1003;

    @ObfuscatedName("ay.nw")
    public static int field1007;

    @ObfuscatedName("ay.d")
    public static short[] field1008;

    @ObfuscatedName("ay.i")
    public static class146 field1009;

    @ObfuscatedName("s.q")
    public static byte[][][] field101;

    @ObfuscatedName("ae.c")
    public static class146 field1013;

    @ObfuscatedName("ae.i")
    public static class146 field1023;

    @ObfuscatedName("ae.g")
    public static class193 field1033;

    @ObfuscatedName("ae.h")
    public static boolean field1050;

    @ObfuscatedName("ae.cd")
    public static char field1059;

    @ObfuscatedName("ah.i")
    public static class146 field1063;

    @ObfuscatedName("ah.c")
    public static int field1064;

    @ObfuscatedName("ah.nx")
    public static int field1068;

    @ObfuscatedName("ah.nj")
    public static int field1069;

    @ObfuscatedName("ah.pb")
    public static int field1070;

    @ObfuscatedName("ah.eh")
    public static class72 field1071;

    @ObfuscatedName("ax.i")
    public static class47 field1075;

    @ObfuscatedName("ad.v")
    public static boolean field1082;

    @ObfuscatedName("ad.q")
    public static int field1084;

    @ObfuscatedName("ad.h")
    public static int field1095;

    @ObfuscatedName("ad.oi")
    public static class121 field1104;

    @ObfuscatedName("ad.pk")
    public static Image field1105;

    @ObfuscatedName("ba.du")
    public static int[] field1121;

    @ObfuscatedName("ba.z")
    public static String[] field1122;

    @ObfuscatedName("ba.br")
    public static class147 field1128;

    @ObfuscatedName("bv.u")
    public static float field1151;

    @ObfuscatedName("bv.d")
    public static int field1152;

    @ObfuscatedName("bu.y")
    public static int[] field1180;

    @ObfuscatedName("bu.l")
    public static boolean[] field1182;

    @ObfuscatedName("bu.e")
    public static int[] field1186;

    @ObfuscatedName("bl.u")
    public static int field1198;

    @ObfuscatedName("bl.g")
    public static byte[] field1202;

    @ObfuscatedName("bl.l")
    public static class67[] field1204;

    @ObfuscatedName("bl.y")
    public static int field1205;

    @ObfuscatedName("bl.e")
    public static int field1206;

    @ObfuscatedName("bl.t")
    public static class62[] field1207;

    @ObfuscatedName("bl.o")
    public static class61[] field1208;

    @ObfuscatedName("bl.w")
    public static class54[] field1210;

    @ObfuscatedName("bl.z")
    public static boolean[] field1211;

    @ObfuscatedName("bl.b")
    public static int[] field1212;

    @ObfuscatedName("bl.p")
    public static float[] field1215;

    @ObfuscatedName("bl.d")
    public static int field1216;

    @ObfuscatedName("bl.x")
    public static float[] field1218;

    @ObfuscatedName("bl.n")
    public static float[] field1219;

    @ObfuscatedName("bl.j")
    public static float[] field1220;

    @ObfuscatedName("bl.al")
    public static float[] field1222;

    @ObfuscatedName("bl.au")
    public static float[] field1223;

    @ObfuscatedName("bl.az")
    public static float[] field1224;

    @ObfuscatedName("bl.ag")
    public static int[] field1225;

    @ObfuscatedName("bl.aj")
    public static int[] field1226;

    @ObfuscatedName("bj.cs")
    public static class193 field1276;

    @ObfuscatedName("bt.pu")
    public static class71 field1280;

    @ObfuscatedName("bn.q")
    public static int[] field1287;

    @ObfuscatedName("bn.i")
    public static int field1288;

    @ObfuscatedName("bn.c")
    public static int field1289;

    @ObfuscatedName("u.j")
    public static int[] field129;

    @ObfuscatedName("bn.s")
    public static int[] field1290;

    @ObfuscatedName("bn.h")
    public static int field1291;

    @ObfuscatedName("bn.e")
    public static int[] field1292;

    @ObfuscatedName("bn.eb")
    public static class72[] field1295;

    @ObfuscatedName("bn.dp")
    public static int[] field1296;

    @ObfuscatedName("i.bn")
    public static int field13;

    @ObfuscatedName("bc.an")
    public static String field1303;

    @ObfuscatedName("u.ex")
    public static class74[] field131;

    @ObfuscatedName("u.iz")
    public static int field132;

    @ObfuscatedName("bz.t")
    public static int field1321;

    @ObfuscatedName("bz.o")
    public static int[] field1323;

    @ObfuscatedName("bz.w")
    public static int field1325;

    @ObfuscatedName("bo.t")
    public static int[] field1335;

    @ObfuscatedName("bs.on")
    public static class9 field1357;

    @ObfuscatedName("ck.m")
    public static int field1360;

    @ObfuscatedName("ck.br")
    public static int field1362;

    @ObfuscatedName("u.df")
    public static int field137;

    @ObfuscatedName("ck.p")
    public static int field1371;

    @ObfuscatedName("ck.a")
    public static int field1377;

    @ObfuscatedName("ck.r")
    public static int field1378;

    @ObfuscatedName("ck.f")
    public static int field1380;

    @ObfuscatedName("ck.k")
    public static int field1381;

    @ObfuscatedName("ck.aj")
    public static int field1382;

    @ObfuscatedName("ck.n")
    public static int field1383;

    @ObfuscatedName("ck.x")
    public static int field1385;

    @ObfuscatedName("ck.al")
    public static int field1386;

    @ObfuscatedName("ck.au")
    public static int field1387;

    @ObfuscatedName("ck.az")
    public static int field1388;

    @ObfuscatedName("ck.ag")
    public static int field1389;

    @ObfuscatedName("ck.bu")
    public static int field1398;

    @ObfuscatedName("ck.bv")
    public static boolean[][] field1402;

    @ObfuscatedName("u.ni")
    public static int field141;

    @ObfuscatedName("ck.bi")
    public static int field1416;

    @ObfuscatedName("ck.bf")
    public static int field1417;

    @ObfuscatedName("ck.bq")
    public static int field1418;

    @ObfuscatedName("ck.bk")
    public static int field1419;

    @ObfuscatedName("u.nn")
    public static int field142;

    @ObfuscatedName("ck.j")
    public static int field1420;

    @ObfuscatedName("u.bv")
    public static class147 field143;

    @ObfuscatedName("cb.m")
    public static class107 field1448;

    @ObfuscatedName("cv.v")
    public static int[] field1456;

    @ObfuscatedName("cv.fd")
    public static int field1457;

    @ObfuscatedName("ct.e")
    public static int field1469;

    @ObfuscatedName("ct.l")
    public static int field1470;

    @ObfuscatedName("ct.m")
    public static int field1471;

    @ObfuscatedName("ct.f")
    public static int field1472;

    @ObfuscatedName("ct.k")
    public static int field1473;

    @ObfuscatedName("ct.p")
    public static int field1474;

    @ObfuscatedName("ct.n")
    public static int field1475;

    @ObfuscatedName("ct.j")
    public static int field1476;

    @ObfuscatedName("ct.au")
    public static class85 field1478;

    @ObfuscatedName("cr.l")
    public static class158 field1494;

    @ObfuscatedName("i.hg")
    public static int field15;

    @ObfuscatedName("i.fz")
    public static int field16;

    @ObfuscatedName("cz.mm")
    public static class49 field1650;

    @ObfuscatedName("cs.pc")
    public static Frame field1657;

    @ObfuscatedName("cs.kx")
    public static class152[] field1658;

    @ObfuscatedName("y.as")
    public static class147 field166;

    @ObfuscatedName("ci.g")
    public static int[] field1664;

    @ObfuscatedName("ci.u")
    public static short[][] field1665;

    @ObfuscatedName("ci.hk")
    public static class3 field1667;

    @ObfuscatedName("ci.nf")
    public static int field1668;

    @ObfuscatedName("cy.ez")
    public static class72[] field1681;

    @ObfuscatedName("cy.od")
    public static int field1688;

    @ObfuscatedName("cc.ba")
    public static int field1742;

    @ObfuscatedName("cc.bw")
    public static int field1743;

    @ObfuscatedName("cc.bm")
    public static int field1744;

    @ObfuscatedName("cm.i")
    public static class146 field1758;

    @ObfuscatedName("cm.bm")
    public static class147 field1759;

    @ObfuscatedName("e.dw")
    public static class79 field176;

    @ObfuscatedName("e.f")
    public static String field177;

    @ObfuscatedName("ce.pv")
    public static int field1778;

    @ObfuscatedName("ce.j")
    public static int[] field1785;

    @ObfuscatedName("e.dg")
    public static int[][] field180;

    @ObfuscatedName("ce.nb")
    public static class68 field1801;

    @ObfuscatedName("cl.s")
    public static class146 field1805;

    @ObfuscatedName("cl.bu")
    public static class147 field1809;

    @ObfuscatedName("l.ds")
    public static byte[][] field181;

    @ObfuscatedName("co.c")
    public static long field1814;

    @ObfuscatedName("co.i")
    public static long field1815;

    @ObfuscatedName("cw.s")
    public static class66 field1818;

    @ObfuscatedName("l.d")
    public static byte[][] field182;

    @ObfuscatedName("cw.e")
    public static boolean field1822;

    @ObfuscatedName("cw.a")
    public static int[] field1825;

    @ObfuscatedName("dm.ej")
    public static class72[] field1840;

    @ObfuscatedName("du.ac")
    public static class130 field1844;

    @ObfuscatedName("du.bi")
    public static class147 field1850;

    @ObfuscatedName("du.ap")
    public static class147 field1855;

    @ObfuscatedName("dp.bm")
    public static class22[] field1859;

    @ObfuscatedName("l.s")
    public static class138 field186;

    @ObfuscatedName("dp.en")
    public static class72[] field1860;

    @ObfuscatedName("do.l")
    public static class152 field1870;

    @ObfuscatedName("dg.bg")
    public static class147 field1878;

    @ObfuscatedName("l.at")
    public static class72[] field188;

    @ObfuscatedName("dq.b")
    public static int[] field1885;

    @ObfuscatedName("dq.g")
    public static short[] field1887;

    @ObfuscatedName("dk.co")
    public static int field1890;

    @ObfuscatedName("dk.w")
    public static class196[] field1892;

    @ObfuscatedName("dt.o")
    public static boolean field1896;

    @ObfuscatedName("dt.kl")
    public static class118 field1897;

    @ObfuscatedName("dn.ce")
    public static int field1905;

    @ObfuscatedName("da.q")
    public static File field1927;

    @ObfuscatedName("da.t")
    public static int field1928;

    @ObfuscatedName("da.ck")
    public static class133 field1929;

    @ObfuscatedName("o.ea")
    public static int[] field193;

    @ObfuscatedName("da.c")
    public static File field1930;

    @ObfuscatedName("dz.i")
    public static String field1932;

    @ObfuscatedName("dz.c")
    public static String field1939;

    @ObfuscatedName("o.cm")
    public static int field197;

    @ObfuscatedName("dx.nk")
    public static int field1972;

    @ObfuscatedName("dx.g")
    public static int field1978;

    @ObfuscatedName("o.ld")
    public static byte field198;

    @ObfuscatedName("dj.pr")
    public static String field1988;

    @ObfuscatedName("i.kn")
    public static int field20;

    @ObfuscatedName("dv.fr")
    public static int field2015;

    @ObfuscatedName("db.er")
    public static class74[] field2017;

    @ObfuscatedName("db.px")
    public static Canvas field2018;

    @ObfuscatedName("di.fn")
    public static int field2036;

    @ObfuscatedName("di.w")
    public static int[] field2037;

    @ObfuscatedName("w.ca")
    public static class130 field204;

    @ObfuscatedName("w.of")
    public static Clipboard field205;

    @ObfuscatedName("eo.ip")
    public static class27 field2054;

    @ObfuscatedName("eh.c")
    public static String field2067;

    @ObfuscatedName("eh.h")
    public static int field2071;

    @ObfuscatedName("eh.i")
    public static Applet field2072;

    @ObfuscatedName("eh.cg")
    public static class130 field2073;

    @ObfuscatedName("eh.nu")
    public static int field2074;

    @ObfuscatedName("w.ng")
    public static int field208;

    @ObfuscatedName("ex.v")
    public static File field2080;

    @ObfuscatedName("ex.m")
    public static String field2086;

    @ObfuscatedName("ex.b")
    public static String[] field2088;

    @ObfuscatedName("ej.oe")
    public static class145 field2092;

    @ObfuscatedName("ej.eu")
    public static int[] field2099;

    @ObfuscatedName("t.ec")
    public static int[] field210;

    @ObfuscatedName("ei.x")
    public static int[] field2112;

    @ObfuscatedName("t.pi")
    public static Font field212;

    @ObfuscatedName("eb.kk")
    public static int field2124;

    @ObfuscatedName("en.nz")
    public static int field2220;

    @ObfuscatedName("en.po")
    public static int field2224;

    @ObfuscatedName("t.mu")
    public static class50 field230;

    @ObfuscatedName("z.z")
    public static class107 field238;

    @ObfuscatedName("ew.cp")
    public static int field2409;

    @ObfuscatedName("b.m")
    public static int[] field244;

    @ObfuscatedName("es.e")
    public static class152 field2476;

    @ObfuscatedName("eu.bk")
    public static class147 field2487;

    @ObfuscatedName("ea.i")
    public static class130 field2492;

    @ObfuscatedName("ea.h")
    public static long field2494;

    @ObfuscatedName("b.do")
    public static int[] field250;

    @ObfuscatedName("ec.t")
    public static int[][][] field2513;

    @ObfuscatedName("ed.c")
    public static boolean[] field2521;

    @ObfuscatedName("ed.h")
    public static class146 field2522;

    @ObfuscatedName("ed.v")
    public static class146 field2523;

    @ObfuscatedName("ed.s")
    public static class146 field2525;

    @ObfuscatedName("b.fk")
    public static int field253;

    @ObfuscatedName("client.bw")
    public static class147 field255;

    @ObfuscatedName("ed.i")
    public static class152[][] field2584;

    @ObfuscatedName("ed.q")
    public static class146 field2591;

    @ObfuscatedName("client.u")
    public static class139 field261;

    @ObfuscatedName("client.d")
    public static class190 field262;

    @ObfuscatedName("ed.hb")
    public static int field2643;

    @ObfuscatedName("et.ko")
    public static int field2655;

    @ObfuscatedName("et.em")
    public static class72 field2657;

    @ObfuscatedName("ev.bt")
    public static String field2665;

    @ObfuscatedName("ek.v")
    public static class162 field2666;

    @ObfuscatedName("fu.y")
    public static short[][] field2677;

    @ObfuscatedName("fn.if")
    public static int field2711;

    @ObfuscatedName("fn.c")
    public static class146 field2712;

    @ObfuscatedName("fn.h")
    public static class146 field2713;

    @ObfuscatedName("fn.u")
    public static int field2714;

    @ObfuscatedName("fn.d")
    public static int field2715;

    @ObfuscatedName("fn.o")
    public static class53 field2716;

    @ObfuscatedName("fn.i")
    public static class146 field2717;

    @ObfuscatedName("gy.gf")
    public static class152 field2872;

    @ObfuscatedName("gv.hl")
    public static int field2877;

    @ObfuscatedName("gv.y")
    public static class74 field2882;

    @ObfuscatedName("gv.bc")
    public static int field2883;

    @ObfuscatedName("gv.eg")
    public static class72[] field2885;

    @ObfuscatedName("gp.bf")
    public static FontMetrics field2888;

    @ObfuscatedName("gt.ba")
    public static class147 field2899;

    @ObfuscatedName("c.n")
    public static int[] field29;

    @ObfuscatedName("go.i")
    public static class102 field2902;

    @ObfuscatedName("gc.y")
    public static class74[] field2914;

    @ObfuscatedName("gu.l")
    public static int[] field2962;

    @ObfuscatedName("c.el")
    public static class72[] field30;

    @ObfuscatedName("client.c")
    public static client field321;

    @ObfuscatedName("c.ax")
    public static class147 field33;

    @ObfuscatedName("client.ao")
    public static boolean field346;

    @ObfuscatedName("client.bp")
    public static int field408;

    @ObfuscatedName("client.m")
    public static class12 field446;

    @ObfuscatedName("client.t")
    public static String field449;

    @ObfuscatedName("client.ci")
    public static class193 field458;

    @ObfuscatedName("h.ie")
    public static int field49;

    @ObfuscatedName("client.ah")
    public static long field514;

    @ObfuscatedName("a.s")
    public static int field528;

    @ObfuscatedName("a.mp")
    public static int field529;

    @ObfuscatedName("r.ii")
    public static int field545;

    @ObfuscatedName("m.mq")
    public static byte field558;

    @ObfuscatedName("m.ib")
    public static int field567;

    @ObfuscatedName("m.lr")
    public static class117 field570;

    @ObfuscatedName("f.bq")
    public static class147 field574;

    @ObfuscatedName("f.cz")
    public static class193 field576;

    @ObfuscatedName("k.pe")
    public static boolean field579;

    @ObfuscatedName("k.aq")
    public static int field587;

    @ObfuscatedName("h.mg")
    public static class21[] field59;

    @ObfuscatedName("p.as")
    public static class74[] field594;

    @ObfuscatedName("h.ef")
    public static class74 field60;

    @ObfuscatedName("p.ba")
    public static class74 field605;

    @ObfuscatedName("h.cl")
    public static int field61;

    @ObfuscatedName("n.p")
    public static int[] field613;

    @ObfuscatedName("j.ad")
    public static class74[] field618;

    @ObfuscatedName("j.w")
    public static class151 field620;

    @ObfuscatedName("x.mo")
    public static class50 field635;

    @ObfuscatedName("al.ax")
    public static class17 field646;

    @ObfuscatedName("al.fy")
    public static int field647;

    @ObfuscatedName("al.ol")
    public static class123 field649;

    @ObfuscatedName("al.ms")
    public static class72 field653;

    @ObfuscatedName("au.at")
    public static class147 field654;

    @ObfuscatedName("au.c")
    public static class74 field655;

    @ObfuscatedName("au.gc")
    public static class152 field656;

    @ObfuscatedName("au.ap")
    public static class74[] field657;

    @ObfuscatedName("au.q")
    public static class72 field658;

    @ObfuscatedName("v.u")
    public static class74[] field66;

    @ObfuscatedName("au.g")
    public static class74 field660;

    @ObfuscatedName("au.d")
    public static class74 field678;

    @ObfuscatedName("v.y")
    public static int field68;

    @ObfuscatedName("au.h")
    public static class74 field681;

    @ObfuscatedName("au.v")
    public static class74[] field687;

    @ObfuscatedName("au.i")
    public static boolean field689;

    @ObfuscatedName("au.s")
    public static class72 field692;

    @ObfuscatedName("ag.de")
    public static int field704;

    @ObfuscatedName("aj.eq")
    public static class74[] field715;

    @ObfuscatedName("af.h")
    public static int[] field718;

    @ObfuscatedName("af.v")
    public static String[] field719;

    @ObfuscatedName("af.js")
    public static int field723;

    @ObfuscatedName("af.ad")
    public static class147 field724;

    @ObfuscatedName("q.il")
    public static class152 field73;

    @ObfuscatedName("af.r")
    public static int[] field731;

    @ObfuscatedName("af.k")
    public static String field732;

    @ObfuscatedName("af.i")
    public static class146 field735;

    @ObfuscatedName("q.ak")
    public static class133 field74;

    @ObfuscatedName("q.h")
    public static class146 field76;

    @ObfuscatedName("s.s")
    public static byte[][][] field80;

    @ObfuscatedName("ab.i")
    public static class146 field811;

    @ObfuscatedName("ab.c")
    public static class146 field815;

    @ObfuscatedName("s.v")
    public static byte[][][] field84;

    @ObfuscatedName("ai.c")
    public static class146 field841;

    @ObfuscatedName("ai.h")
    public static class146 field842;

    @ObfuscatedName("ai.iy")
    public static class152 field844;

    @ObfuscatedName("ai.pw")
    public static int field849;

    @ObfuscatedName("s.g")
    public static byte[][][] field86;

    @ObfuscatedName("s.u")
    public static byte[][][] field87;

    @ObfuscatedName("s.d")
    public static int[][] field88;

    @ObfuscatedName("s.y")
    public static int[] field89;

    @ObfuscatedName("ak.dq")
    public static byte[][] field899;

    @ObfuscatedName("i.av")
    public static class133 field9;

    @ObfuscatedName("s.o")
    public static int[] field90;

    @ObfuscatedName("ak.i")
    public static class146 field900;

    @ObfuscatedName("ak.u")
    public static int[] field902;

    @ObfuscatedName("ao.c")
    public static class146 field905;

    @ObfuscatedName("ao.i")
    public static class146 field917;

    @ObfuscatedName("s.ix")
    public static int field93;

    @ObfuscatedName("ar.c")
    public static class146 field935;

    @ObfuscatedName("ar.ew")
    public static class72[] field943;

    @ObfuscatedName("aq.i")
    public static class146 field944;

    @ObfuscatedName("aq.c")
    public static class146 field945;

    @ObfuscatedName("aq.h")
    public static int field946;

    @ObfuscatedName("aq.aw")
    public static class147 field956;

    @ObfuscatedName("aq.es")
    public static int[] field957;

    @ObfuscatedName("an.oh")
    public static class120 field972;

    @ObfuscatedName("an.gl")
    public static class152 field974;

    @ObfuscatedName("av.i")
    public static class146 field983;

    @ObfuscatedName("av.ei")
    public static class72[] field989;

    @ObfuscatedName("ac.i")
    public static class146 field995;

    @ObfuscatedName("ay.i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z")
    public static final boolean method849(String arg0, String arg1, String arg2, String arg3) {
        if (arg0 == null || arg2 == null) {
            return false;
        } else if (arg0.startsWith("#") || arg2.startsWith("#")) {
            return arg0.equals(arg2);
        } else {
            return arg1.equals(arg3);
        }
    }

    @ObfuscatedName("ab.c(J)V")
    public static final void method651(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @ObfuscatedName("ce.i(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method2087(Applet arg0, String arg1) {
        class125.field1975 = arg0;
        class125.field1973 = arg1;
    }

    @ObfuscatedName("bn.d(Ljava/lang/Object;ZI)[B")
    public static byte[] method1426(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? method89(var2) : var2;
        } else if (arg0 instanceof class112) {
            class112 var3 = (class112) arg0;
            return var3.method2130();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ab.i(II)Laq;")
    public static class40 method650(int arg0) {
        class40 var1 = (class40) class40.field947.method3185((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field944.method2811(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method772(new class107(var2));
        }
        class40.field947.method3186(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("g.y([BI)[B")
    public static byte[] method89(byte[] arg0) {
        int var1 = arg0.length;
        byte[] var2 = new byte[var1];
        System.arraycopy(arg0, 0, var2, 0, var1);
        return var2;
    }

    @ObfuscatedName("ea.v(I)V")
    public static void method2872() {
        class46.field1065.method3188();
    }

    @ObfuscatedName("y.i(S)V")
    public static void method111() {
        field84 = (byte[][][]) null;
        field101 = (byte[][][]) null;
        field80 = (byte[][][]) null;
        field86 = (byte[][][]) null;
        field2513 = (int[][][]) null;
        field87 = (byte[][][]) null;
        field88 = (int[][]) null;
        field89 = null;
        field1292 = null;
        field2962 = null;
        field90 = null;
        field2037 = null;
    }

    @ObfuscatedName("bs.s(Ljava/lang/String;I)I")
    public static int method1625(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("l.g(I)V")
    public static void method125() {
        Object var0 = class149.field2486;
        synchronized (class149.field2486) {
            if (class149.field2485 != 0) {
                class149.field2485 = 1;
                try {
                    class149.field2486.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }

    @ObfuscatedName("ez.e(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method2722(String arg0) {
        int var1 = arg0.length();
        char[] var2 = new char[var1];
        byte var3 = 2;
        for (int var4 = 0; var4 < var1; var4++) {
            char var5 = arg0.charAt(var4);
            if (var3 == 0) {
                var5 = Character.toLowerCase(var5);
            } else if (var3 == 2 || Character.isUpperCase(var5)) {
                var5 = class201.method152(var5);
            }
            if (Character.isLetter(var5)) {
                var3 = 0;
            } else if (var5 == '.' || var5 == '?' || var5 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var5)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2[var4] = var5;
        }
        return new String(var2);
    }

    @ObfuscatedName("ae.c(III)Led;")
    public static class152 method899(int arg0, int arg1) {
        class152 var2 = class152.method1027(arg0);
        if (arg1 == -1) {
            return var2;
        } else if (var2 == null || var2.field2639 == null || arg1 >= var2.field2639.length) {
            return null;
        } else {
            return var2.field2639[arg1];
        }
    }

    @ObfuscatedName("cd.q(I)V")
    public static void method1894() {
        try {
            File var0 = new File(field732, "random.dat");
            if (var0.exists()) {
                class136.field2085 = new class196(new class195(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < field2088.length; var1++) {
                    for (int var2 = 0; var2 < field1122.length; var2++) {
                        File var3 = new File(field1122[var2] + field2088[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            class136.field2085 = new class196(new class195(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (class136.field2085 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                class136.field2085 = new class196(new class195(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("al.e(IIIIB)I")
    public static final int method523(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class84.field1463[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("en.s(Lgi;Lgi;I)V")
    public static void method2721(class193 arg0, class193 arg1) {
        if (class28.field682) {
            class28.method2973(arg0, arg1);
            return;
        }
        if (client.field264 == 0 || client.field264 == 5) {
            byte var2 = 20;
            arg0.method3389(class142.field2351, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class73.method1548(230, var3, 304, 34, 9179409);
            class73.method1548(231, var3 + 1, 302, 32, 0);
            class73.method1545(232, var3 + 2, class28.field669 * 3, 30, 9179409);
            class73.method1545(class28.field669 * 3 + 232, var3 + 2, 300 - class28.field669 * 3, 30, 0);
            arg0.method3389(class28.field670, 382, 276 - var2, 16777215, -1);
        }
        if (client.field264 == 20) {
            field655.method1599(382 - field655.field1328 / 2, 271 - field655.field1326 / 2);
            short var4 = 211;
            arg0.method3389(class28.field672, 382, var4, 16776960, 0);
            int var74 = var4 + 15;
            arg0.method3389(class28.field666, 382, var74, 16776960, 0);
            int var75 = var74 + 15;
            arg0.method3389(class28.field674, 382, var75, 16776960, 0);
            int var76 = var75 + 15;
            int var77 = var76 + 10;
            if (class28.field671 != 4) {
                arg0.method3392(class142.field2370, 272, var77, 16777215, 0);
                short var5 = 200;
                String var6;
                for (var6 = class28.field675; arg0.method3352(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
                }
                arg0.method3392(class192.method3356(var6), 312, var77, 16777215, 0);
                var74 = var77 + 15;
                String var8 = class142.field2371;
                String var9 = class28.field676;
                String var10 = class199.method2716('*', var9.length());
                arg0.method3392(var8 + var10, 274, var74, 16777215, 0);
                var74 += 15;
            }
        }
        if (client.field264 == 10 || client.field264 == 11) {
            field655.method1599(202, 171);
            if (class28.field671 == 0) {
                short var11 = 251;
                arg0.method3389(class142.field2373, 382, var11, 16776960, 0);
                int var78 = var11 + 30;
                short var12 = 302;
                short var13 = 291;
                field681.method1599(var12 - 73, var13 - 20);
                arg0.method3360(class142.field2309, var12 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var14 = 462;
                field681.method1599(var14 - 73, var13 - 20);
                arg0.method3360(class142.field2375, var14 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class28.field671 == 1) {
                arg0.method3389(class142.field2355, 382, 211, 16776960, 0);
                short var15 = 236;
                arg0.method3389(class28.field672, 382, var15, 16777215, 0);
                int var79 = var15 + 15;
                arg0.method3389(class28.field666, 382, var79, 16777215, 0);
                int var80 = var79 + 15;
                arg0.method3389(class28.field674, 382, var80, 16777215, 0);
                int var81 = var80 + 15;
                short var16 = 302;
                short var17 = 321;
                field681.method1599(var16 - 73, var17 - 20);
                arg0.method3389(class142.field2147, var16, var17 + 5, 16777215, 0);
                short var18 = 462;
                field681.method1599(var18 - 73, var17 - 20);
                arg0.method3389(class142.field2377, var18, var17 + 5, 16777215, 0);
            } else if (class28.field671 == 2) {
                short var19 = 211;
                arg0.method3389(class28.field672, 382, var19, 16776960, 0);
                int var82 = var19 + 15;
                arg0.method3389(class28.field666, 382, var82, 16776960, 0);
                int var83 = var82 + 15;
                arg0.method3389(class28.field674, 382, var83, 16776960, 0);
                int var84 = var83 + 15;
                int var85 = var84 + 10;
                arg0.method3392(class142.field2370, 272, var85, 16777215, 0);
                short var20 = 200;
                String var21;
                for (var21 = class28.field675; arg0.method3352(var21) > var20; var21 = var21.substring(1)) {
                }
                arg0.method3392(class192.method3356(var21) + (class28.field679 == 0 & client.field269 % 40 < 20 ? class2.method741(16776960) + class2.field21 : ""), 312, var85, 16777215, 0);
                var82 = var85 + 15;
                String var23 = class142.field2371;
                String var24 = class28.field676;
                String var25 = class199.method2716('*', var24.length());
                arg0.method3392(var23 + var25 + (class28.field679 == 1 & client.field269 % 40 < 20 ? class2.method741(16776960) + class2.field21 : ""), 274, var82, 16777215, 0);
                var82 += 15;
                short var26 = 302;
                short var27 = 321;
                field681.method1599(var26 - 73, var27 - 20);
                arg0.method3389(class142.field2162, var26, var27 + 5, 16777215, 0);
                short var28 = 462;
                field681.method1599(var28 - 73, var27 - 20);
                arg0.method3389(class142.field2377, var28, var27 + 5, 16777215, 0);
            } else if (class28.field671 == 4) {
                arg0.method3389(class142.field2365, 382, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3389(class28.field672, 382, var29, 16777215, 0);
                int var86 = var29 + 15;
                arg0.method3389(class28.field666, 382, var86, 16777215, 0);
                int var87 = var86 + 15;
                arg0.method3389(class28.field674, 382, var87, 16777215, 0);
                int var88 = var87 + 15;
                String var31 = class142.field2372;
                String var32 = field1303;
                String var33 = class199.method2716('*', var32.length());
                arg0.method3392(var31 + var33 + (client.field269 % 40 < 20 ? class2.method741(16776960) + class2.field21 : ""), 274, var88, 16777215, 0);
                int var89 = var88 - 8;
                arg0.method3392(class142.field2148, 373, var89, 16776960, 0);
                int var90 = var89 + 15;
                arg0.method3392(class142.field2293, 373, var90, 16776960, 0);
                int var34 = 373 + arg0.method3352(class142.field2293) + 15;
                int var35 = var90 - arg0.field2909;
                class74 var36;
                if (class28.field685) {
                    var36 = field2882;
                } else {
                    var36 = field678;
                }
                var36.method1599(var34, var35);
                var86 = var90 + 15;
                short var37 = 302;
                short var38 = 321;
                field681.method1599(var37 - 73, var38 - 20);
                arg0.method3389(class142.field2147, var37, var38 + 5, 16777215, 0);
                short var39 = 462;
                field681.method1599(var39 - 73, var38 - 20);
                arg0.method3389(class142.field2377, var39, var38 + 5, 16777215, 0);
                arg1.method3389(class142.field2340, 382, var38 + 36, 255, 0);
            }
        }
        if (class28.field667 > 0) {
            int var40 = class28.field667;
            short var41 = 256;
            class28.field683 += var40 * 128;
            if (class28.field683 > field613.length) {
                class28.field683 -= field613.length;
                int var42 = (int) (Math.random() * 12.0D);
                class28.method517(field687[var42]);
            }
            int var43 = 0;
            int var44 = var40 * 128;
            int var45 = (var41 - var40) * 128;
            for (int var46 = 0; var46 < var45; var46++) {
                int var47 = field129[var43 + var44] - field613[class28.field683 + var43 & field613.length - 1] * var40 / 6;
                if (var47 < 0) {
                    var47 = 0;
                }
                field129[var43++] = var47;
            }
            for (int var48 = var41 - var40; var48 < var41; var48++) {
                int var49 = var48 * 128;
                for (int var50 = 0; var50 < 128; var50++) {
                    int var51 = (int) (Math.random() * 100.0D);
                    if (var51 < 50 && var50 > 10 && var50 < 118) {
                        field129[var49 + var50] = 255;
                    } else {
                        field129[var49 + var50] = 0;
                    }
                }
            }
            if (class28.field663 > 0) {
                class28.field663 -= var40 * 4;
            }
            if (class28.field690 > 0) {
                class28.field690 -= var40 * 4;
            }
            if (class28.field663 == 0 && class28.field690 == 0) {
                int var52 = (int) (Math.random() * (double) (2000 / var40));
                if (var52 == 0) {
                    class28.field663 = 1024;
                }
                if (var52 == 1) {
                    class28.field690 = 1024;
                }
            }
            for (int var53 = 0; var53 < var41 - var40; var53++) {
                class28.field662[var53] = class28.field662[var40 + var53];
            }
            for (int var54 = var41 - var40; var54 < var41; var54++) {
                class28.field662[var54] = (int) (Math.sin((double) class28.field668 / 14.0D) * 16.0D + Math.sin((double) class28.field668 / 15.0D) * 14.0D + Math.sin((double) class28.field668 / 16.0D) * 12.0D);
                class28.field668++;
            }
            class28.field661 += var40 * -1021698985;
            int var55 = ((client.field269 & 0x1) + var40) / 2;
            if (var55 > 0) {
                for (int var56 = 0; var56 < class28.field661 * -1475345348; var56++) {
                    int var57 = (int) (Math.random() * 124.0D) + 2;
                    int var58 = (int) (Math.random() * 128.0D) + 128;
                    field129[(var58 << 7) + var57] = 192;
                }
                class28.field661 = 0;
                int var59 = 0;
                label207: while (true) {
                    if (var59 >= var41) {
                        int var63 = 0;
                        while (true) {
                            if (var63 >= 128) {
                                break label207;
                            }
                            int var64 = 0;
                            for (int var65 = -var55; var65 < var41; var65++) {
                                int var66 = var65 * 128;
                                if (var55 + var65 < var41) {
                                    var64 += field2112[var55 * 128 + var63 + var66];
                                }
                                if (var65 - (var55 + 1) >= 0) {
                                    var64 -= field2112[var63 + var66 - (var55 + 1) * 128];
                                }
                                if (var65 >= 0) {
                                    field129[var63 + var66] = var64 / (var55 * 2 + 1);
                                }
                            }
                            var63++;
                        }
                    }
                    int var60 = 0;
                    int var61 = var59 * 128;
                    for (int var62 = -var55; var62 < 128; var62++) {
                        if (var55 + var62 < 128) {
                            var60 += field129[var61 + var62 + var55];
                        }
                        if (var62 - (var55 + 1) >= 0) {
                            var60 -= field129[var61 + var62 - (var55 + 1)];
                        }
                        if (var62 >= 0) {
                            field2112[var61 + var62] = var60 / (var55 * 2 + 1);
                        }
                    }
                    var59++;
                }
            }
            class28.field667 = 0;
        }
        class28.method31();
        field66[field1357.field147 ? 1 : 0].method1599(725, 463);
        if (client.field264 > 5 && client.field265 == 0) {
            if (field605 == null) {
                field605 = class70.method156(field1759, "sl_button", "");
            } else {
                byte var67 = 5;
                short var68 = 463;
                byte var69 = 100;
                byte var70 = 35;
                field605.method1599(var67, var68);
                arg0.method3389(class142.field2306 + " " + client.field403, var69 / 2 + var67, var70 / 2 + var68 - 2, 16777215, 0);
                if (field646 == null) {
                    arg1.method3389(class142.field2388, var69 / 2 + var67, var70 / 2 + var68 + 12, 16777215, 0);
                } else {
                    arg1.method3389(class142.field2235, var69 / 2 + var67, var70 / 2 + var68 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var71 = field2018.getGraphics();
            field1280.method1355(var71, 0, 0);
        } catch (Exception var73) {
            field2018.repaint();
        }
    }

    @ObfuscatedName("v.ai(Lh;III)V")
    public static void method28(class3 arg0, int arg1, int arg2) {
        if (arg0.field742 == arg1 && arg1 != -1) {
            int var3 = class38.method3551(arg1).field921;
            if (var3 == 1) {
                arg0.field768 = 0;
                arg0.field769 = 0;
                arg0.field767 = arg2;
                arg0.field771 = 0;
            }
            if (var3 == 2) {
                arg0.field771 = 0;
            }
        } else if (arg1 == -1 || arg0.field742 == -1 || class38.method3551(arg1).field915 >= class38.method3551(arg0.field742).field915) {
            arg0.field742 = arg1;
            arg0.field768 = 0;
            arg0.field769 = 0;
            arg0.field767 = arg2;
            arg0.field771 = 0;
            arg0.field794 = arg0.field793;
        }
    }

    @ObfuscatedName("u.aq(IIB)V")
    public static final void method91(int arg0, int arg1) {
        if (client.field278 == 2) {
            client.method2588((client.field281 - field197 << 7) + client.field327, (client.field282 - field1905 << 7) + client.field285, client.field440 * 2);
            if (client.field364 > -1 && client.field269 % 20 < 10) {
                field2885[0].method1470(client.field364 + arg0 - 12, client.field437 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("av.bj(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method822(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 3) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(210);
            client.field302.method2181(field197 + arg0);
            client.field302.method2137(class124.field1947[82] ? 1 : 0);
            client.field302.method2235(field1905 + arg1);
            client.field302.method2180(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 19) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(79);
            client.field302.method2181(field197 + arg0);
            client.field302.method2180(arg3);
            client.field302.method2142(class124.field1947[82] ? 1 : 0);
            client.field302.method2235(field1905 + arg1);
        }
        if (arg2 == 1001) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(56);
            client.field302.method2181(arg3 >> 14 & 0x7FFF);
            client.field302.method2142(class124.field1947[82] ? 1 : 0);
            client.field302.method2209(field1905 + arg1);
            client.field302.method2180(field197 + arg0);
        }
        if (arg2 == 39) {
            client.field302.method2386(226);
            client.field302.method2209(arg0);
            client.field302.method2154(arg1);
            client.field302.method2235(arg3);
            client.field370 = 0;
            field656 = class152.method1027(arg1);
            client.field366 = arg0;
        }
        if (arg2 == 51) {
            class3 var8 = client.field379[arg3];
            if (var8 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(136);
                client.field302.method2173(class124.field1947[82] ? 1 : 0);
                client.field302.method2180(arg3);
            }
        }
        if (arg2 == 22) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(137);
            client.field302.method2181(field197 + arg0);
            client.field302.method2181(arg3);
            client.field302.method2328(class124.field1947[82] ? 1 : 0);
            client.field302.method2180(field1905 + arg1);
        }
        if (arg2 == 31) {
            client.field302.method2386(178);
            client.field302.method2181(arg0);
            client.field302.method2154(field93);
            client.field302.method2190(arg1);
            client.field302.method2235(field567);
            client.field302.method2235(field132);
            client.field302.method2235(arg3);
            client.field370 = 0;
            field656 = class152.method1027(arg1);
            client.field366 = arg0;
        }
        if (arg2 == 1005) {
            class152 var9 = class152.method1027(arg1);
            if (var9 == null || var9.field2649[arg0] < 100000) {
                client.field302.method2386(53);
                client.field302.method2235(arg3);
            } else {
                class10.method566(27, "", var9.field2649[arg0] + " x " + class45.method2547(arg3).field1021);
            }
            client.field370 = 0;
            field656 = class152.method1027(arg1);
            client.field366 = arg0;
        }
        if (arg2 == 13) {
            class30 var10 = client.field299[arg3];
            if (var10 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(124);
                client.field302.method2142(class124.field1947[82] ? 1 : 0);
                client.field302.method2180(arg3);
            }
        }
        if (arg2 == 34) {
            client.field302.method2386(13);
            client.field302.method2154(arg1);
            client.field302.method2180(arg0);
            client.field302.method2180(arg3);
            client.field370 = 0;
            field656 = class152.method1027(arg1);
            client.field366 = arg0;
        }
        if (arg2 == 48) {
            class3 var11 = client.field379[arg3];
            if (var11 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(111);
                client.field302.method2173(class124.field1947[82] ? 1 : 0);
                client.field302.method2209(arg3);
            }
        }
        if (arg2 == 7) {
            class30 var12 = client.field299[arg3];
            if (var12 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(203);
                client.field302.method2137(class124.field1947[82] ? 1 : 0);
                client.field302.method2235(field132);
                client.field302.method2181(arg3);
                client.field302.method2235(field567);
                client.field302.method2140(field93);
            }
        }
        if (arg2 == 4) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(117);
            client.field302.method2180(field1905 + arg1);
            client.field302.method2180(arg3 >> 14 & 0x7FFF);
            client.field302.method2137(class124.field1947[82] ? 1 : 0);
            client.field302.method2181(field197 + arg0);
        }
        if (arg2 == 43) {
            client.field302.method2386(183);
            client.field302.method2180(arg3);
            client.field302.method2235(arg0);
            client.field302.method2190(arg1);
            client.field370 = 0;
            field656 = class152.method1027(arg1);
            client.field366 = arg0;
        }
        if (arg2 == 1003) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            class30 var13 = client.field299[arg3];
            if (var13 != null) {
                class35 var14 = var13.field705;
                if (var14.field832 != null) {
                    var14 = var14.method654();
                }
                if (var14 != null) {
                    client.field302.method2386(20);
                    client.field302.method2209(var14.field806);
                }
            }
        }
        if (arg2 == 20) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(5);
            client.field302.method2235(field197 + arg0);
            client.field302.method2209(field1905 + arg1);
            client.field302.method2173(class124.field1947[82] ? 1 : 0);
            client.field302.method2180(arg3);
        }
        if (arg2 == 12) {
            class30 var15 = client.field299[arg3];
            if (var15 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(49);
                client.field302.method2209(arg3);
                client.field302.method2173(class124.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            client.field302.method2386(188);
            client.field302.method2235(arg3);
            client.field302.method2140(arg1);
            client.field302.method2181(arg0);
            client.field370 = 0;
            field656 = class152.method1027(arg1);
            client.field366 = arg0;
        }
        if (arg2 == 25) {
            class152 var16 = method899(arg1, arg0);
            if (var16 != null) {
                client.method120();
                int var17 = class156.method1791(client.method533(var16));
                int var18 = var16.field2635;
                class152 var19 = method899(arg1, arg0);
                if (var19 != null && var19.field2609 != null) {
                    class1 var20 = new class1();
                    var20.field5 = var19;
                    var20.field17 = var19.field2609;
                    class32.method3536(var20);
                }
                client.field413 = var18;
                client.field416 = true;
                field2711 = arg1;
                client.field417 = arg0;
                field723 = var17;
                client.method465(var19);
                client.field414 = 0;
                String var21;
                if (class156.method1791(client.method533(var16)) == 0) {
                    var21 = null;
                } else if (var16.field2573 == null || var16.field2573.trim().length() == 0) {
                    var21 = null;
                } else {
                    var21 = var16.field2573;
                }
                client.field491 = var21;
                if (client.field491 == null) {
                    client.field491 = "Null";
                }
                if (var16.field2530) {
                    client.field420 = var16.field2644 + class2.method741(16777215);
                } else {
                    client.field420 = class2.method741(65280) + var16.field2631 + class2.method741(16777215);
                }
            }
            return;
        }
        if (arg2 == 36) {
            client.field302.method2386(6);
            client.field302.method2209(arg0);
            client.field302.method2189(arg1);
            client.field302.method2209(arg3);
            client.field370 = 0;
            field656 = class152.method1027(arg1);
            client.field366 = arg0;
        }
        if (arg2 == 37) {
            client.field302.method2386(25);
            client.field302.method2181(arg3);
            client.field302.method2180(arg0);
            client.field302.method2189(arg1);
            client.field370 = 0;
            field656 = class152.method1027(arg1);
            client.field366 = arg0;
        }
        if (arg2 == 24) {
            class152 var22 = class152.method1027(arg1);
            boolean var23 = true;
            if (var22.field2585 > 0) {
                var23 = client.method77(var22);
            }
            if (var23) {
                client.field302.method2386(214);
                client.field302.method2140(arg1);
            }
        }
        if (arg2 == 18) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(64);
            client.field302.method2181(field1905 + arg1);
            client.field302.method2209(field197 + arg0);
            client.field302.method2328(class124.field1947[82] ? 1 : 0);
            client.field302.method2181(arg3);
        }
        if (arg2 == 46) {
            class3 var24 = client.field379[arg3];
            if (var24 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(184);
                client.field302.method2142(class124.field1947[82] ? 1 : 0);
                client.field302.method2181(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var25 = client.field379[arg3];
            if (var25 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(99);
                client.field302.method2209(arg3);
                client.field302.method2173(class124.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            client.field302.method2386(216);
            client.field302.method2235(arg3);
            client.field302.method2235(arg0);
            client.field302.method2189(arg1);
            client.field370 = 0;
            field656 = class152.method1027(arg1);
            client.field366 = arg0;
        }
        if (arg2 == 11) {
            class30 var26 = client.field299[arg3];
            if (var26 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(189);
                client.field302.method2142(class124.field1947[82] ? 1 : 0);
                client.field302.method2180(arg3);
            }
        }
        if (arg2 == 14) {
            class3 var27 = client.field379[arg3];
            if (var27 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(119);
                client.field302.method2190(field93);
                client.field302.method2180(field567);
                client.field302.method2181(arg3);
                client.field302.method2181(field132);
                client.field302.method2137(class124.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field302.method2386(225);
            client.field302.method2181(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 6) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(151);
            client.field302.method2142(class124.field1947[82] ? 1 : 0);
            client.field302.method2235(arg3 >> 14 & 0x7FFF);
            client.field302.method2181(field1905 + arg1);
            client.field302.method2235(field197 + arg0);
        }
        if (arg2 == 5) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(31);
            client.field302.method2235(field197 + arg0);
            client.field302.method2142(class124.field1947[82] ? 1 : 0);
            client.field302.method2180(field1905 + arg1);
            client.field302.method2181(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 16) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(65);
            client.field302.method2209(field1905 + arg1);
            client.field302.method2180(field197 + arg0);
            client.field302.method2328(class124.field1947[82] ? 1 : 0);
            client.field302.method2235(field132);
            client.field302.method2235(field567);
            client.field302.method2140(field93);
            client.field302.method2181(arg3);
        }
        if (arg2 == 21) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(59);
            client.field302.method2173(class124.field1947[82] ? 1 : 0);
            client.field302.method2181(field197 + arg0);
            client.field302.method2180(field1905 + arg1);
            client.field302.method2209(arg3);
        }
        if (arg2 == 49) {
            class3 var28 = client.field379[arg3];
            if (var28 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(45);
                client.field302.method2209(arg3);
                client.field302.method2173(class124.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 17) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(106);
            client.field302.method2235(field197 + arg0);
            client.field302.method2189(field2711);
            client.field302.method2209(field1905 + arg1);
            client.field302.method2328(class124.field1947[82] ? 1 : 0);
            client.field302.method2235(client.field417);
            client.field302.method2209(arg3);
        }
        if (arg2 == 30 && client.field334 == null) {
            client.field302.method2386(48);
            client.field302.method2140(arg1);
            client.field302.method2181(arg0);
            client.field334 = method899(arg1, arg0);
            client.method465(client.field334);
        }
        if (arg2 == 47) {
            class3 var29 = client.field379[arg3];
            if (var29 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(39);
                client.field302.method2142(class124.field1947[82] ? 1 : 0);
                client.field302.method2180(arg3);
            }
        }
        if (arg2 == 9) {
            class30 var30 = client.field299[arg3];
            if (var30 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(182);
                client.field302.method2209(arg3);
                client.field302.method2173(class124.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            client.field302.method2386(131);
            client.field302.method2180(arg3);
            client.field302.method2154(arg1);
            client.field302.method2180(arg0);
            client.field370 = 0;
            field656 = class152.method1027(arg1);
            client.field366 = arg0;
        }
        if (arg2 == 38) {
            client.method120();
            class152 var31 = class152.method1027(arg1);
            client.field414 = 1;
            field567 = arg0;
            field93 = arg1;
            field132 = arg3;
            client.method465(var31);
            client.field415 = class2.method741(16748608) + class45.method2547(arg3).field1021 + class2.method741(16777215);
            if (client.field415 == null) {
                client.field415 = "null";
            }
            return;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class152 var32 = method899(arg1, arg0);
            if (var32 != null) {
                int var33 = var32.field2635;
                class152 var34 = method899(arg1, arg0);
                if (var34 != null) {
                    if (var34.field2618 != null) {
                        class1 var35 = new class1();
                        var35.field5 = var34;
                        var35.field6 = arg3;
                        var35.field12 = arg5;
                        var35.field17 = var34.field2618;
                        class32.method3536(var35);
                    }
                    boolean var36 = true;
                    if (var34.field2585 > 0) {
                        var36 = client.method77(var34);
                    }
                    if (var36 && class156.method583(client.method533(var34), arg3 - 1)) {
                        if (arg3 == 1) {
                            client.field302.method2386(73);
                            client.field302.method2140(arg1);
                            client.field302.method2235(arg0);
                            client.field302.method2235(var33);
                        }
                        if (arg3 == 2) {
                            client.field302.method2386(133);
                            client.field302.method2140(arg1);
                            client.field302.method2235(arg0);
                            client.field302.method2235(var33);
                        }
                        if (arg3 == 3) {
                            client.field302.method2386(21);
                            client.field302.method2140(arg1);
                            client.field302.method2235(arg0);
                            client.field302.method2235(var33);
                        }
                        if (arg3 == 4) {
                            client.field302.method2386(28);
                            client.field302.method2140(arg1);
                            client.field302.method2235(arg0);
                            client.field302.method2235(var33);
                        }
                        if (arg3 == 5) {
                            client.field302.method2386(54);
                            client.field302.method2140(arg1);
                            client.field302.method2235(arg0);
                            client.field302.method2235(var33);
                        }
                        if (arg3 == 6) {
                            client.field302.method2386(246);
                            client.field302.method2140(arg1);
                            client.field302.method2235(arg0);
                            client.field302.method2235(var33);
                        }
                        if (arg3 == 7) {
                            client.field302.method2386(173);
                            client.field302.method2140(arg1);
                            client.field302.method2235(arg0);
                            client.field302.method2235(var33);
                        }
                        if (arg3 == 8) {
                            client.field302.method2386(43);
                            client.field302.method2140(arg1);
                            client.field302.method2235(arg0);
                            client.field302.method2235(var33);
                        }
                        if (arg3 == 9) {
                            client.field302.method2386(161);
                            client.field302.method2140(arg1);
                            client.field302.method2235(arg0);
                            client.field302.method2235(var33);
                        }
                        if (arg3 == 10) {
                            client.field302.method2386(42);
                            client.field302.method2140(arg1);
                            client.field302.method2235(arg0);
                            client.field302.method2235(var33);
                        }
                    }
                }
            }
        }
        if (arg2 == 50) {
            class3 var37 = client.field379[arg3];
            if (var37 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(35);
                client.field302.method2235(arg3);
                client.field302.method2173(class124.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class30 var38 = client.field299[arg3];
            if (var38 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(10);
                client.field302.method2137(class124.field1947[82] ? 1 : 0);
                client.field302.method2181(client.field417);
                client.field302.method2235(arg3);
                client.field302.method2190(field2711);
            }
        }
        if (arg2 == 42) {
            client.field302.method2386(38);
            client.field302.method2209(arg3);
            client.field302.method2140(arg1);
            client.field302.method2181(arg0);
            client.field370 = 0;
            field656 = class152.method1027(arg1);
            client.field366 = arg0;
        }
        if (arg2 == 28) {
            client.field302.method2386(214);
            client.field302.method2140(arg1);
            class152 var39 = class152.method1027(arg1);
            if (var39.field2579 != null && var39.field2579[0][0] == 5) {
                int var40 = var39.field2579[0][1];
                class154.field2661[var40] = 1 - class154.field2661[var40];
                client.method612(var40);
            }
        }
        if (arg2 == 10) {
            class30 var41 = client.field299[arg3];
            if (var41 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(201);
                client.field302.method2137(class124.field1947[82] ? 1 : 0);
                client.field302.method2235(arg3);
            }
        }
        if (arg2 == 1004) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field302.method2386(53);
            client.field302.method2235(arg3);
        }
        if (arg2 == 32) {
            client.field302.method2386(204);
            client.field302.method2209(arg0);
            client.field302.method2181(arg3);
            client.field302.method2190(field2711);
            client.field302.method2235(client.field417);
            client.field302.method2190(arg1);
            client.field370 = 0;
            field656 = class152.method1027(arg1);
            client.field366 = arg0;
        }
        if (arg2 == 2) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(37);
            client.field302.method2181(field197 + arg0);
            client.field302.method2173(class124.field1947[82] ? 1 : 0);
            client.field302.method2209(client.field417);
            client.field302.method2180(field1905 + arg1);
            client.field302.method2209(arg3 >> 14 & 0x7FFF);
            client.field302.method2140(field2711);
        }
        if (arg2 == 1) {
            client.field393 = arg6;
            client.field350 = arg7;
            client.field349 = 2;
            client.field368 = 0;
            client.field489 = arg0;
            client.field430 = arg1;
            client.field302.method2386(92);
            client.field302.method2154(field93);
            client.field302.method2181(arg3 >> 14 & 0x7FFF);
            client.field302.method2180(field132);
            client.field302.method2181(field567);
            client.field302.method2180(field1905 + arg1);
            client.field302.method2137(class124.field1947[82] ? 1 : 0);
            client.field302.method2180(field197 + arg0);
        }
        if (arg2 == 26) {
            client.field302.method2386(150);
            for (class4 var42 = (class4) client.field371.method3220(); var42 != null; var42 = (class4) client.field371.method3221()) {
                if (var42.field63 == 0 || var42.field63 == 3) {
                    client.method1792(var42, true);
                }
            }
            if (client.field334 != null) {
                client.method465(client.field334);
                client.field334 = null;
            }
        }
        if (arg2 == 58) {
            class152 var43 = method899(arg1, arg0);
            if (var43 != null) {
                client.field302.method2386(78);
                client.field302.method2180(arg0);
                client.field302.method2181(client.field417);
                client.field302.method2181(client.field413);
                client.field302.method2209(var43.field2635);
                client.field302.method2154(field2711);
                client.field302.method2154(arg1);
            }
        }
        if (arg2 == 44) {
            class3 var44 = client.field379[arg3];
            if (var44 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(70);
                client.field302.method2235(arg3);
                client.field302.method2142(class124.field1947[82] ? 1 : 0);
            }
        }
        if (arg2 == 15) {
            class3 var45 = client.field379[arg3];
            if (var45 != null) {
                client.field393 = arg6;
                client.field350 = arg7;
                client.field349 = 2;
                client.field368 = 0;
                client.field489 = arg0;
                client.field430 = arg1;
                client.field302.method2386(163);
                client.field302.method2173(class124.field1947[82] ? 1 : 0);
                client.field302.method2235(arg3);
                client.field302.method2235(client.field417);
                client.field302.method2190(field2711);
            }
        }
        if (arg2 == 40) {
            client.field302.method2386(91);
            client.field302.method2209(arg3);
            client.field302.method2189(arg1);
            client.field302.method2235(arg0);
            client.field370 = 0;
            field656 = class152.method1027(arg1);
            client.field366 = arg0;
        }
        if (arg2 == 29) {
            client.field302.method2386(214);
            client.field302.method2140(arg1);
            class152 var46 = class152.method1027(arg1);
            if (var46.field2579 != null && var46.field2579[0][0] == 5) {
                int var47 = var46.field2579[0][1];
                if (class154.field2661[var47] != var46.field2548[0]) {
                    class154.field2661[var47] = var46.field2548[0];
                    client.method612(var47);
                }
            }
        }
        if (arg2 == 23) {
            field176.method1648(field2643, arg0, arg1);
        }
        if (client.field414 != 0) {
            client.field414 = 0;
            client.method465(class152.method1027(field93));
        }
        if (client.field416) {
            client.method120();
        }
        if (field656 != null && client.field370 == 0) {
            client.method465(field656);
        }
    }
}
