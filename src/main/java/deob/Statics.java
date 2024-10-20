package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Statics {

    @ObfuscatedName("l.il")
    public static int field100;

    @ObfuscatedName("am.gb")
    public static class156 field1004;

    @ObfuscatedName("am.pp")
    public static Canvas field1013;

    @ObfuscatedName("am.e")
    public static class150 field1014;

    @ObfuscatedName("at.fn")
    public static int field1019;

    @ObfuscatedName("l.nt")
    public static int field102;

    @ObfuscatedName("at.g")
    public static class150 field1022;

    @ObfuscatedName("ae.e")
    public static int field1027;

    @ObfuscatedName("l.jm")
    public static class156[] field103;

    @ObfuscatedName("ae.pr")
    public static Image field1030;

    @ObfuscatedName("ae.by")
    public static int field1032;

    @ObfuscatedName("ae.g")
    public static class150 field1033;

    @ObfuscatedName("ae.dm")
    public static int[] field1036;

    @ObfuscatedName("ae.bu")
    public static class152 field1037;

    @ObfuscatedName("as.g")
    public static class42 field1038;

    @ObfuscatedName("aa.a")
    public static boolean[] field1072;

    @ObfuscatedName("aa.w")
    public static int[] field1073;

    @ObfuscatedName("aa.r")
    public static int[] field1074;

    @ObfuscatedName("ap.p")
    public static class54 field1097;

    @ObfuscatedName("ab.k")
    public static float[] field1104;

    @ObfuscatedName("ab.a")
    public static class59[] field1109;

    @ObfuscatedName("p.m")
    public static int[] field111;

    @ObfuscatedName("ab.l")
    public static byte[] field1110;

    @ObfuscatedName("ab.t")
    public static int field1112;

    @ObfuscatedName("ab.v")
    public static float[] field1113;

    @ObfuscatedName("ab.r")
    public static int field1114;

    @ObfuscatedName("ab.d")
    public static class49[] field1115;

    @ObfuscatedName("ab.u")
    public static float[] field1116;

    @ObfuscatedName("ab.z")
    public static class58[] field1117;

    @ObfuscatedName("ab.af")
    public static int[] field1118;

    @ObfuscatedName("p.ar")
    public static long field112;

    @ObfuscatedName("ab.s")
    public static int[] field1120;

    @ObfuscatedName("ab.x")
    public static boolean[] field1122;

    @ObfuscatedName("ab.w")
    public static int field1126;

    @ObfuscatedName("ab.c")
    public static float[] field1129;

    @ObfuscatedName("ab.al")
    public static float[] field1130;

    @ObfuscatedName("ab.p")
    public static int field1131;

    @ObfuscatedName("ab.ad")
    public static float[] field1132;

    @ObfuscatedName("ab.aw")
    public static int[] field1133;

    @ObfuscatedName("ab.q")
    public static class48[] field1136;

    @ObfuscatedName("ab.ai")
    public static float[] field1137;

    @ObfuscatedName("p.kh")
    public static class65 field115;

    @ObfuscatedName("bc.i")
    public static int[] field1168;

    @ObfuscatedName("t.i")
    public static byte[][][] field117;

    @ObfuscatedName("bb.pc")
    public static class84 field1187;

    @ObfuscatedName("bb.nn")
    public static int field1191;

    @ObfuscatedName("g.cc")
    public static class181 field12;

    @ObfuscatedName("bx.a")
    public static class138 field1209;

    @ObfuscatedName("t.j")
    public static byte[][][] field121;

    @ObfuscatedName("bx.db")
    public static class94 field1210;

    @ObfuscatedName("bx.q")
    public static int[] field1219;

    @ObfuscatedName("t.o")
    public static byte[][][] field122;

    @ObfuscatedName("t.p")
    public static byte[][][] field123;

    @ObfuscatedName("bl.p")
    public static float field1232;

    @ObfuscatedName("bl.t")
    public static int field1234;

    @ObfuscatedName("t.t")
    public static int[][] field124;

    @ObfuscatedName("bv.gz")
    public static class156 field1245;

    @ObfuscatedName("bv.z")
    public static class29[] field1247;

    @ObfuscatedName("ba.n")
    public static class150 field1251;

    @ObfuscatedName("ba.oa")
    public static class70 field1253;

    @ObfuscatedName("be.on")
    public static class67 field1256;

    @ObfuscatedName("be.l")
    public static class181 field1259;

    @ObfuscatedName("be.pj")
    public static int field1261;

    @ObfuscatedName("bs.g")
    public static class150 field1262;

    @ObfuscatedName("t.w")
    public static int[] field127;

    @ObfuscatedName("bh.em")
    public static class85[] field1270;

    @ObfuscatedName("bh.b")
    public static String field1278;

    @ObfuscatedName("by.fm")
    public static int field1281;

    @ObfuscatedName("bz.mf")
    public static class45 field1291;

    @ObfuscatedName("bz.x")
    public static int[] field1295;

    @ObfuscatedName("bz.k")
    public static int[] field1296;

    @ObfuscatedName("bz.ae")
    public static class69 field1298;

    @ObfuscatedName("t.hk")
    public static int field130;

    @ObfuscatedName("bj.ic")
    public static int field1317;

    @ObfuscatedName("bg.e")
    public static String field1321;

    @ObfuscatedName("bg.bd")
    public static class69 field1328;

    @ObfuscatedName("bg.g")
    public static String field1335;

    @ObfuscatedName("bq.t")
    public static int field1345;

    @ObfuscatedName("bq.bi")
    public static class78 field1366;

    @ObfuscatedName("bm.i")
    public static File field1367;

    @ObfuscatedName("t.pl")
    public static int field137;

    @ObfuscatedName("t.z")
    public static int[] field139;

    @ObfuscatedName("bn.ex")
    public static class86[] field1390;

    @ObfuscatedName("bn.k")
    public static int[] field1391;

    @ObfuscatedName("cj.e")
    public static String field1404;

    @ObfuscatedName("cj.n")
    public static int field1405;

    @ObfuscatedName("cj.g")
    public static Applet field1411;

    @ObfuscatedName("cx.j")
    public static File field1416;

    @ObfuscatedName("cx.o")
    public static int field1417;

    @ObfuscatedName("cx.s")
    public static String[] field1422;

    @ObfuscatedName("cx.f")
    public static String field1423;

    @ObfuscatedName("t.r")
    public static int[] field143;

    @ObfuscatedName("ci.e")
    public static int field1436;

    @ObfuscatedName("ci.g")
    public static int field1440;

    @ObfuscatedName("ci.mz")
    public static class85 field1441;

    @ObfuscatedName("ci.n")
    public static int field1443;

    @ObfuscatedName("cl.z")
    public static int field1475;

    @ObfuscatedName("cl.d")
    public static int field1477;

    @ObfuscatedName("cl.q")
    public static int[] field1481;

    @ObfuscatedName("cq.d")
    public static int[] field1491;

    @ObfuscatedName("g.au")
    public static class152 field15;

    @ObfuscatedName("cn.el")
    public static class85 field1507;

    @ObfuscatedName("cn.ip")
    public static int field1508;

    @ObfuscatedName("co.ey")
    public static class85[] field1533;

    @ObfuscatedName("co.ns")
    public static int field1535;

    @ObfuscatedName("cs.k")
    public static int field1539;

    @ObfuscatedName("cs.m")
    public static int field1550;

    @ObfuscatedName("cs.ai")
    public static int field1553;

    @ObfuscatedName("cs.y")
    public static int field1554;

    @ObfuscatedName("cs.bt")
    public static int field1555;

    @ObfuscatedName("cs.h")
    public static int field1556;

    @ObfuscatedName("cs.f")
    public static int field1557;

    @ObfuscatedName("cs.v")
    public static int field1558;

    @ObfuscatedName("cs.u")
    public static int field1559;

    @ObfuscatedName("cs.c")
    public static int field1561;

    @ObfuscatedName("cs.al")
    public static int field1562;

    @ObfuscatedName("cs.ad")
    public static int field1564;

    @ObfuscatedName("cs.aw")
    public static int field1565;

    @ObfuscatedName("cs.af")
    public static int field1566;

    @ObfuscatedName("cs.bl")
    public static int field1567;

    @ObfuscatedName("cs.bb")
    public static boolean[][] field1581;

    @ObfuscatedName("cs.b")
    public static int field1593;

    @ObfuscatedName("cs.bw")
    public static int field1594;

    @ObfuscatedName("cs.bk")
    public static int field1595;

    @ObfuscatedName("cs.bx")
    public static int field1596;

    @ObfuscatedName("cs.bf")
    public static int field1597;

    @ObfuscatedName("w.bk")
    public static class152 field169;

    @ObfuscatedName("ct.u")
    public static int field1733;

    @ObfuscatedName("ct.h")
    public static int field1737;

    @ObfuscatedName("ct.r")
    public static int field1743;

    @ObfuscatedName("ct.a")
    public static int field1744;

    @ObfuscatedName("ct.b")
    public static int field1745;

    @ObfuscatedName("ct.f")
    public static int field1747;

    @ObfuscatedName("ct.v")
    public static int field1748;

    @ObfuscatedName("ct.k")
    public static int field1749;

    @ObfuscatedName("ct.ai")
    public static class105 field1753;

    @ObfuscatedName("dn.z")
    public static class153 field1764;

    @ObfuscatedName("r.bh")
    public static int field178;

    @ObfuscatedName("dm.au")
    public static class12[] field1786;

    @ObfuscatedName("dq.cm")
    public static int field1787;

    @ObfuscatedName("r.ig")
    public static int field179;

    @ObfuscatedName("dq.ou")
    public static class73 field1791;

    @ObfuscatedName("dq.e")
    public static class86 field1792;

    @ObfuscatedName("dq.o")
    public static int[] field1793;

    @ObfuscatedName("dh.cq")
    public static int field1798;

    @ObfuscatedName("r.nu")
    public static int field180;

    @ObfuscatedName("de.nd")
    public static int field1824;

    @ObfuscatedName("de.az")
    public static class152 field1825;

    @ObfuscatedName("dk.br")
    public static int field1839;

    @ObfuscatedName("r.es")
    public static int[] field184;

    @ObfuscatedName("r.l")
    public static int field185;

    @ObfuscatedName("dk.bu")
    public static int field1878;

    @ObfuscatedName("dk.bc")
    public static int field1879;

    @ObfuscatedName("dy.nj")
    public static int field1894;

    @ObfuscatedName("dy.hd")
    public static int field1899;

    @ObfuscatedName("db.no")
    public static class51 field1907;

    @ObfuscatedName("di.mp")
    public static byte field1947;

    @ObfuscatedName("dl.ac")
    public static class152 field1964;

    @ObfuscatedName("do.v")
    public static int[] field1968;

    @ObfuscatedName("do.o")
    public static boolean field1970;

    @ObfuscatedName("do.y")
    public static int[] field1971;

    @ObfuscatedName("dx.j")
    public static int[] field1979;

    @ObfuscatedName("a.po")
    public static Font field198;

    @ObfuscatedName("dx.fx")
    public static int field1980;

    @ObfuscatedName("dx.at")
    public static class78 field1981;

    @ObfuscatedName("dr.e")
    public static long field1983;

    @ObfuscatedName("dr.g")
    public static long field1984;

    @ObfuscatedName("dr.ne")
    public static int field1985;

    @ObfuscatedName("dp.i")
    public static int field1989;

    @ObfuscatedName("a.l")
    public static int field199;

    @ObfuscatedName("dd.e")
    public static File field2004;

    @ObfuscatedName("q.cl")
    public static char field201;

    @ObfuscatedName("du.t")
    public static byte[][] field2011;

    @ObfuscatedName("dz.x")
    public static class126 field2021;

    @ObfuscatedName("dt.l")
    public static int[] field2031;

    @ObfuscatedName("dt.ez")
    public static class86 field2037;

    @ObfuscatedName("et.p")
    public static class86[] field2045;

    @ObfuscatedName("ev.hb")
    public static int field2048;

    @ObfuscatedName("ev.az")
    public static class86 field2055;

    @ObfuscatedName("ec.o")
    public static class150 field2290;

    @ObfuscatedName("ea.cs")
    public static class181 field2297;

    @ObfuscatedName("ea.z")
    public static String field2298;

    @ObfuscatedName("eq.q")
    public static boolean field2301;

    @ObfuscatedName("eq.av")
    public static class86[] field2309;

    @ObfuscatedName("eu.r")
    public static boolean field2310;

    @ObfuscatedName("eu.g")
    public static class150 field2311;

    @ObfuscatedName("eu.n")
    public static class150 field2312;

    @ObfuscatedName("eu.j")
    public static class140 field2314;

    @ObfuscatedName("eu.w")
    public static int field2315;

    @ObfuscatedName("eu.e")
    public static class150 field2316;

    @ObfuscatedName("er.i")
    public static class131 field2379;

    @ObfuscatedName("d.gm")
    public static class156 field238;

    @ObfuscatedName("d.en")
    public static class85[] field241;

    @ObfuscatedName("x.mb")
    public static byte field242;

    @ObfuscatedName("ed.e")
    public static class150 field2420;

    @ObfuscatedName("ed.p")
    public static int[] field2421;

    @ObfuscatedName("ep.o")
    public static class150 field2428;

    @ObfuscatedName("ez.fu")
    public static int field2453;

    @ObfuscatedName("ez.ap")
    public static class152 field2455;

    @ObfuscatedName("eb.n")
    public static long field2471;

    @ObfuscatedName("eb.g")
    public static class69 field2473;

    @ObfuscatedName("eb.bo")
    public static class152 field2477;

    @ObfuscatedName("eb.b")
    public static class126 field2478;

    @ObfuscatedName("eb.kc")
    public static int field2479;

    @ObfuscatedName("x.ek")
    public static class86[] field249;

    @ObfuscatedName("es.u")
    public static int[] field2499;

    @ObfuscatedName("ei.a")
    public static int[] field2504;

    @ObfuscatedName("ej.ks")
    public static int field2520;

    @ObfuscatedName("ef.j")
    public static class150 field2524;

    @ObfuscatedName("ef.i")
    public static class150 field2525;

    @ObfuscatedName("ef.g")
    public static class156[][] field2536;

    @ObfuscatedName("s.w")
    public static short[][] field254;

    @ObfuscatedName("s.er")
    public static class85[] field255;

    @ObfuscatedName("s.mi")
    public static class8[] field256;

    @ObfuscatedName("s.ix")
    public static int field257;

    @ObfuscatedName("ef.e")
    public static boolean[] field2586;

    @ObfuscatedName("ef.ho")
    public static class3 field2611;

    @ObfuscatedName("ef.n")
    public static class150 field2636;

    @ObfuscatedName("m.dk")
    public static byte[][] field266;

    @ObfuscatedName("ft.be")
    public static String field2665;

    @ObfuscatedName("fk.l")
    public static short[] field2672;

    @ObfuscatedName("fk.p")
    public static short[][] field2679;

    @ObfuscatedName("m.de")
    public static int[][] field268;

    @ObfuscatedName("fk.t")
    public static short[] field2680;

    @ObfuscatedName("m.fj")
    public static int field269;

    @ObfuscatedName("fq.g")
    public static class119 field2776;

    @ObfuscatedName("gi.w")
    public static class86[] field2786;

    @ObfuscatedName("y.co")
    public static class181 field285;

    @ObfuscatedName("y.eo")
    public static class85[] field286;

    @ObfuscatedName("b.n")
    public static class86 field295;

    @ObfuscatedName("b.j")
    public static class86[] field296;

    @ObfuscatedName("b.l")
    public static class86 field299;

    @ObfuscatedName("b.iu")
    public static class156 field300;

    @ObfuscatedName("b.f")
    public static int[] field305;

    @ObfuscatedName("b.i")
    public static class85 field320;

    @ObfuscatedName("b.ay")
    public static class23 field321;

    @ObfuscatedName("b.g")
    public static boolean field324;

    @ObfuscatedName("b.o")
    public static class85 field325;

    @ObfuscatedName("b.cd")
    public static int field326;

    @ObfuscatedName("b.nz")
    public static int field330;

    @ObfuscatedName("h.bf")
    public static FontMetrics field331;

    @ObfuscatedName("h.ew")
    public static class86[] field343;

    @ObfuscatedName("h.d")
    public static int field346;

    @ObfuscatedName("h.fk")
    public static int field348;

    @ObfuscatedName("f.h")
    public static class15 field353;

    @ObfuscatedName("f.fz")
    public static int field359;

    @ObfuscatedName("f.na")
    public static int field361;

    @ObfuscatedName("f.cp")
    public static int field362;

    @ObfuscatedName("f.l")
    public static byte[][][] field363;

    @ObfuscatedName("f.bw")
    public static class152 field364;

    @ObfuscatedName("v.eb")
    public static int[] field367;

    @ObfuscatedName("v.iz")
    public static int field370;

    @ObfuscatedName("u.do")
    public static int field379;

    @ObfuscatedName("k.e")
    public static int[] field383;

    @ObfuscatedName("k.n")
    public static String[] field384;

    @ObfuscatedName("k.w")
    public static class156 field391;

    @ObfuscatedName("k.ed")
    public static class85[] field392;

    @ObfuscatedName("k.ld")
    public static class136 field394;

    @ObfuscatedName("k.r")
    public static class156 field399;

    @ObfuscatedName("g.dq")
    public static int[] field4;

    @ObfuscatedName("n.ml")
    public static int field46;

    @ObfuscatedName("c.nf")
    public static int field460;

    @ObfuscatedName("c.ib")
    public static class156 field461;

    @ObfuscatedName("client.e")
    public static client field464;

    @ObfuscatedName("client.p")
    public static class184 field469;

    @ObfuscatedName("j.ab")
    public static class152 field48;

    @ObfuscatedName("client.av")
    public static class152 field496;

    @ObfuscatedName("client.bs")
    public static int field503;

    @ObfuscatedName("client.cj")
    public static class69 field515;

    @ObfuscatedName("j.ds")
    public static int field53;

    @ObfuscatedName("client.ei")
    public static int[] field548;

    @ObfuscatedName("client.aj")
    public static class86[] field587;

    @ObfuscatedName("i.aj")
    public static class152 field64;

    @ObfuscatedName("i.cr")
    public static int field65;

    @ObfuscatedName("client.bt")
    public static class152 field658;

    @ObfuscatedName("i.ar")
    public static class86[] field66;

    @ObfuscatedName("client.l")
    public static class132 field683;

    @ObfuscatedName("o.ep")
    public static class85[] field69;

    @ObfuscatedName("o.aa")
    public static class152 field71;

    @ObfuscatedName("client.js")
    public static int field729;

    @ObfuscatedName("client.bb")
    public static class152 field731;

    @ObfuscatedName("client.nl")
    public static class61 field733;

    @ObfuscatedName("al.pg")
    public static int field739;

    @ObfuscatedName("o.eh")
    public static int[] field75;

    @ObfuscatedName("aw.g")
    public static class150 field768;

    @ObfuscatedName("o.br")
    public static class152 field77;

    @ObfuscatedName("aw.e")
    public static class150 field772;

    @ObfuscatedName("aw.pd")
    public static int field786;

    @ObfuscatedName("aw.oq")
    public static int field794;

    @ObfuscatedName("af.e")
    public static class150 field837;

    @ObfuscatedName("an.s")
    public static int[] field847;

    @ObfuscatedName("an.g")
    public static class150 field851;

    @ObfuscatedName("an.ik")
    public static int field856;

    @ObfuscatedName("an.p")
    public static int field857;

    @ObfuscatedName("ao.n")
    public static class150 field860;

    @ObfuscatedName("ao.bc")
    public static class152 field865;

    @ObfuscatedName("ao.g")
    public static class150 field869;

    @ObfuscatedName("ak.e")
    public static class150 field883;

    @ObfuscatedName("ak.g")
    public static class150 field884;

    @ObfuscatedName("ak.dh")
    public static int[] field887;

    @ObfuscatedName("ah.n")
    public static int field904;

    @ObfuscatedName("ah.e")
    public static class150 field912;

    @ObfuscatedName("ah.h")
    public static String field915;

    @ObfuscatedName("ah.ng")
    public static class51 field917;

    @ObfuscatedName("aq.eg")
    public static class85[] field933;

    @ObfuscatedName("aq.x")
    public static String[] field935;

    @ObfuscatedName("aq.g")
    public static class150 field936;

    @ObfuscatedName("aq.ax")
    public static class78 field937;

    @ObfuscatedName("ax.as")
    public static class85[] field941;

    @ObfuscatedName("ax.pt")
    public static Frame field942;

    @ObfuscatedName("ax.px")
    public static boolean field945;

    @ObfuscatedName("ax.g")
    public static class150 field947;

    @ObfuscatedName("ag.g")
    public static class150 field959;

    @ObfuscatedName("ag.d")
    public static int[][][] field962;

    @ObfuscatedName("ag.q")
    public static class57 field966;

    @ObfuscatedName("am.n")
    public static boolean field969;

    @ObfuscatedName("l.dy")
    public static byte[][] field98;

    @ObfuscatedName("am.g")
    public static class150 field988;

    @ObfuscatedName("l.eu")
    public static class85 field99;

    @ObfuscatedName("cj.e(IB)Lax;")
    public static class37 method1596(int arg0) {
        class37 var1 = (class37) class37.field948.method3311((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field947.method3012(14, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method817(new class126(var2));
        }
        class37.field948.method3314(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("g.i(I)V")
    public static void method3() {
        class37.field948.method3315();
    }

    @ObfuscatedName("ae.n(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static String method896(Throwable arg0) throws IOException {
        String var2;
        if (arg0 instanceof class79) {
            class79 var1 = (class79) arg0;
            var2 = var1.field1406 + " | ";
            arg0 = var1.field1407;
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

    @ObfuscatedName("be.w(IIB)V")
    public static void method1364(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (class20.field323[var5] != arg0) {
                var2[var4] = class20.field323[var5];
                var3[var4] = class20.field297[var5];
                var4++;
            }
        }
        class20.field323 = var2;
        class20.field297 = var3;
        class20.method547(field1786, 0, field1786.length - 1, class20.field323, class20.field297);
    }

    @ObfuscatedName("j.b(B)V")
    public static final void method31() {
        if (client.field584 > 1) {
            client.field584--;
        }
        if (client.field696 > 0) {
            client.field696--;
        }
        if (client.field519) {
            client.field519 = false;
            client.method96();
            return;
        }
        for (int var0 = 0; var0 < 100 && client.method59(); var0++) {
        }
        if (client.field474 != 30) {
            return;
        }
        class180.method3103(client.field634, 150);
        Object var1 = field353.field233;
        synchronized (field353.field233) {
            if (!client.field465) {
                field353.field232 = 0;
            } else if (class76.field1387 != 0 || field353.field232 >= 40) {
                client.field634.method2358(174);
                client.field634.method2472(0);
                int var2 = client.field634.field2016;
                int var3 = 0;
                for (int var4 = 0; var4 < field353.field232 && client.field634.field2016 - var2 < 240; var4++) {
                    var3++;
                    int var5 = field353.field235[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = field353.field236[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (field353.field235[var4] == -1 && field353.field236[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (client.field530 != var6 || client.field479 != var5) {
                        int var8 = var6 - client.field530;
                        client.field530 = var6;
                        int var9 = var5 - client.field479;
                        client.field479 = var5;
                        if (client.field480 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            client.field634.method2473((client.field480 << 12) + (var8 << 6) + var9);
                            client.field480 = 0;
                        } else if (client.field480 < 8) {
                            client.field634.method2615((client.field480 << 19) + 8388608 + var7);
                            client.field480 = 0;
                        } else {
                            client.field634.method2475((client.field480 << 19) + -1073741824 + var7);
                            client.field480 = 0;
                        }
                    } else if (client.field480 < 2047) {
                        client.field480++;
                    }
                }
                client.field634.method2491(client.field634.field2016 - var2);
                if (var3 >= field353.field232) {
                    field353.field232 = 0;
                } else {
                    field353.field232 -= var3;
                    for (int var10 = 0; var10 < field353.field232; var10++) {
                        field353.field236[var10] = field353.field236[var3 + var10];
                        field353.field235[var10] = field353.field235[var3 + var10];
                    }
                }
            }
        }
        if (class76.field1387 != 0) {
            long var12 = (class76.field1389 - client.field477 * 9074989652692318947L) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            client.field477 = class76.field1389 * 7063301501608975051L;
            int var14 = class76.field1381;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class76.field1378;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            if (class76.field1387 == 2) {
                var17 = 1;
            }
            int var18 = (int) var12;
            client.field634.method2358(135);
            client.field634.method2522((var17 << 19) + (var18 << 20) + var16);
        }
        if (client.field518 > 0) {
            client.field518--;
        }
        if (class74.field1352[96] || class74.field1352[97] || class74.field1352[98] || class74.field1352[99]) {
            client.field560 = true;
        }
        if (client.field560 && client.field518 <= 0) {
            client.field518 = 20;
            client.field560 = false;
            client.field634.method2358(133);
            client.field634.method2473(client.field556);
            client.field634.method2473(client.field555);
        }
        if (field945 && !client.field481) {
            client.field481 = true;
            client.field634.method2358(106);
            client.field634.method2472(1);
        }
        if (!field945 && client.field481) {
            client.field481 = false;
            client.field634.method2358(106);
            client.field634.method2472(0);
        }
        if (client.field471 && field1899 != client.field520) {
            client.method887(field1787, field326, field1899, field2611.field405[0], field2611.field456[0]);
        } else if (field1899 != client.field695) {
            client.field695 = field1899;
            int var19 = field1899;
            int[] var20 = field1441.field1454;
            int var21 = var20.length;
            for (int var22 = 0; var22 < var21; var22++) {
                var20[var22] = 0;
            }
            for (int var23 = 1; var23 < 103; var23++) {
                int var24 = (103 - var23) * 2048 + 24628;
                for (int var25 = 1; var25 < 103; var25++) {
                    if ((class9.field125[var19][var25][var23] & 0x18) == 0) {
                        field1210.method2002(var20, var24, 512, var19, var25, var23);
                    }
                    if (var19 < 3 && (class9.field125[var19 + 1][var25][var23] & 0x8) != 0) {
                        field1210.method2002(var20, var24, 512, var19 + 1, var25, var23);
                    }
                    var24 += 4;
                }
            }
            int var26 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var27 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            field1441.method1693();
            for (int var28 = 1; var28 < 103; var28++) {
                for (int var29 = 1; var29 < 103; var29++) {
                    if ((class9.field125[var19][var29][var28] & 0x18) == 0) {
                        client.method2719(var19, var29, var28, var26, var27);
                    }
                    if (var19 < 3 && (class9.field125[var19 + 1][var29][var28] & 0x8) != 0) {
                        client.method2719(var19 + 1, var29, var28, var26, var27);
                    }
                }
            }
            client.field672 = 0;
            for (int var30 = 0; var30 < 104; var30++) {
                for (int var31 = 0; var31 < 104; var31++) {
                    int var32 = field1210.method1902(field1899, var30, var31);
                    if (var32 != 0) {
                        int var33 = var32 >> 14 & 0x7FFF;
                        int var34 = class31.method245(var33).field825;
                        if (var34 >= 0) {
                            int var35 = var30;
                            int var36 = var31;
                            if (var34 != 22 && var34 != 29 && var34 != 34 && var34 != 36 && var34 != 46 && var34 != 47 && var34 != 48) {
                                int[][] var37 = client.field526[field1899].field2686;
                                for (int var38 = 0; var38 < 10; var38++) {
                                    int var39 = (int) (Math.random() * 4.0D);
                                    if (var39 == 0 && var35 > 0 && var35 > var30 - 3 && (var37[var35 - 1][var36] & 0x12C0108) == 0) {
                                        var35--;
                                    }
                                    if (var39 == 1 && var35 < 103 && var35 < var30 + 3 && (var37[var35 + 1][var36] & 0x12C0180) == 0) {
                                        var35++;
                                    }
                                    if (var39 == 2 && var36 > 0 && var36 > var31 - 3 && (var37[var35][var36 - 1] & 0x12C0102) == 0) {
                                        var36--;
                                    }
                                    if (var39 == 3 && var36 < 103 && var36 < var31 + 3 && (var37[var35][var36 + 1] & 0x12C0120) == 0) {
                                        var36++;
                                    }
                                }
                            }
                            client.field607[client.field672] = field241[var34];
                            client.field592[client.field672] = var35;
                            client.field698[client.field672] = var36;
                            client.field672++;
                        }
                    }
                }
            }
            field1187.method1683();
        }
        if (client.field474 != 30) {
            return;
        }
        client.method1358();
        int var10002;
        for (int var40 = 0; var40 < client.field718; var40++) {
            var10002 = client.field711[var40]--;
            if (client.field711[var40] >= -10) {
                class56 var42 = client.field512[var40];
                if (var42 == null) {
                    class56 var10000 = (class56) null;
                    var42 = class56.method1253(field15, client.field709[var40], 0);
                    if (var42 == null) {
                        continue;
                    }
                    client.field711[var40] += var42.method1244();
                    client.field512[var40] = var42;
                }
                if (client.field711[var40] < 0) {
                    int var49;
                    if (client.field712[var40] == 0) {
                        var49 = client.field713;
                    } else {
                        int var43 = (client.field712[var40] & 0xFF) * 128;
                        int var44 = client.field712[var40] >> 16 & 0xFF;
                        int var45 = var44 * 128 + 64 - field2611.field441;
                        if (var45 < 0) {
                            var45 = -var45;
                        }
                        int var46 = client.field712[var40] >> 8 & 0xFF;
                        int var47 = var46 * 128 + 64 - field2611.field433;
                        if (var47 < 0) {
                            var47 = -var47;
                        }
                        int var48 = var45 + var47 - 128;
                        if (var48 > var43) {
                            client.field711[var40] = -100;
                            continue;
                        }
                        if (var48 < 0) {
                            var48 = 0;
                        }
                        var49 = client.field707 * (var43 - var48) / var43;
                    }
                    if (var49 > 0) {
                        class62 var50 = var42.method1243().method1309(field733);
                        class44 var51 = class44.method951(var50, 100, var49);
                        var51.method954(client.field710[var40] - 1);
                        field1291.method1107(var51);
                    }
                    client.field711[var40] = -100;
                }
            } else {
                client.field718--;
                for (int var41 = var40; var41 < client.field718; var41++) {
                    client.field709[var41] = client.field709[var41 + 1];
                    client.field512[var41] = client.field512[var41 + 1];
                    client.field710[var41] = client.field710[var41 + 1];
                    client.field711[var41] = client.field711[var41 + 1];
                    client.field712[var41] = client.field712[var41 + 1];
                }
                var40--;
            }
        }
        if (client.field705) {
            boolean var52;
            if (class137.field2319 == 0) {
                var52 = field2314.method2777();
            } else {
                var52 = true;
            }
            if (!var52) {
                if (client.field703 != 0 && client.field528 != -1) {
                    class137.method2466(field2455, client.field528, 0, client.field703, false);
                }
                client.field705 = false;
            }
        }
        client.field697++;
        if (client.field697 > 750) {
            client.method96();
            return;
        }
        client.method1548();
        for (int var53 = 0; var53 < client.field505; var53++) {
            int var54 = client.field506[var53];
            class24 var55 = client.field504[var54];
            if (var55 != null) {
                client.method124(var55, var55.field378.field765);
            }
        }
        client.method244();
        client.field637++;
        if (client.field579 != 0) {
            client.field578 += 20;
            if (client.field578 >= 400) {
                client.field579 = 0;
            }
        }
        if (field1004 != null) {
            client.field682++;
            if (client.field682 >= 15) {
                client.method2745(field1004);
                field1004 = null;
            }
        }
        if (field1245 != null) {
            client.method2745(field1245);
            client.field489++;
            if (class76.field1380 > client.field583 + 5 || class76.field1380 < client.field583 - 5 || class76.field1384 > client.field566 + 5 || class76.field1384 < client.field566 - 5) {
                client.field500 = true;
            }
            if (class76.field1379 == 0) {
                if (client.field500 && client.field489 >= 5) {
                    if (field238 == field1245 && client.field585 != client.field582) {
                        class156 var56 = field1245;
                        byte var57 = 0;
                        if (client.field593 == 1 && var56.field2609 == 206) {
                            var57 = 1;
                        }
                        if (var56.field2561[client.field585] <= 0) {
                            var57 = 0;
                        }
                        if (class160.method108(client.method2720(var56))) {
                            int var58 = client.field582;
                            int var59 = client.field585;
                            var56.field2561[var59] = var56.field2561[var58];
                            var56.field2602[var59] = var56.field2602[var58];
                            var56.field2561[var58] = -1;
                            var56.field2602[var58] = 0;
                        } else if (var57 == 1) {
                            int var60 = client.field582;
                            int var61 = client.field585;
                            while (var60 != var61) {
                                if (var60 > var61) {
                                    var56.method3141(var60 - 1, var60);
                                    var60--;
                                } else if (var60 < var61) {
                                    var56.method3141(var60 + 1, var60);
                                    var60++;
                                }
                            }
                        } else {
                            var56.method3141(client.field585, client.field582);
                        }
                        client.field634.method2358(34);
                        client.field634.method2591(client.field582);
                        client.field634.method2514(client.field585);
                        client.field634.method2507(var57);
                        client.field634.method2475(field1245.field2531);
                    }
                } else if ((client.field610 == 1 || client.method2160(client.field612 - 1)) && client.field612 > 2) {
                    client.method29();
                } else if (client.field612 > 0) {
                    client.method200(client.field612 - 1);
                }
                client.field682 = 10;
                class76.field1387 = 0;
                field1245 = null;
            }
        }
        class156 var62 = field461;
        class156 var63 = field300;
        field461 = null;
        field300 = null;
        client.field644 = null;
        client.field581 = false;
        client.field522 = false;
        for (client.field690 = 0; class74.method114() && client.field690 < 128; client.field690++) {
            client.field692[client.field690] = field1798;
            client.field691[client.field690] = field201;
        }
        int var64 = client.field629;
        if (class156.method2342(var64)) {
            client.method204(field2536[var64], -1, 0, 0, 765, 503, 0, 0);
        }
        client.field708++;
        while (true) {
            class1 var65;
            class156 var66;
            class156 var67;
            do {
                var65 = (class1) client.field488.method3380();
                if (var65 == null) {
                    while (true) {
                        class1 var68;
                        class156 var69;
                        class156 var70;
                        do {
                            var68 = (class1) client.field508.method3380();
                            if (var68 == null) {
                                while (true) {
                                    class1 var71;
                                    class156 var72;
                                    class156 var73;
                                    do {
                                        var71 = (class1) client.field666.method3380();
                                        if (var71 == null) {
                                            if (client.field640 != null) {
                                                client.method3128();
                                            }
                                            if (class94.field1572 != -1) {
                                                int var74 = class94.field1572;
                                                int var75 = class94.field1573;
                                                boolean var76 = client.method1339(field2611.field405[0], field2611.field456[0], var74, var75, true, 0, 0, 0, 0, 0, 0);
                                                class94.field1572 = -1;
                                                if (var76) {
                                                    client.field576 = class76.field1378;
                                                    client.field577 = class76.field1381;
                                                    client.field579 = 1;
                                                    client.field578 = 0;
                                                }
                                            }
                                            client.method27();
                                            if (field461 != var62) {
                                                if (var62 != null) {
                                                    client.method2745(var62);
                                                }
                                                if (field461 != null) {
                                                    client.method2745(field461);
                                                }
                                            }
                                            if (field300 != var63 && client.field622 == client.field621) {
                                                if (var63 != null) {
                                                    client.method2745(var63);
                                                }
                                                if (field300 != null) {
                                                    client.method2745(field300);
                                                }
                                            }
                                            if (field300 == null) {
                                                if (client.field621 > 0) {
                                                    client.field621--;
                                                }
                                            } else if (client.field621 < client.field622) {
                                                client.field621++;
                                                if (client.field622 == client.field621) {
                                                    client.method2745(field300);
                                                }
                                            }
                                            client.method58();
                                            if (client.field510) {
                                                int var77 = field180 * 128 + 64;
                                                int var78 = field102 * 128 + 64;
                                                int var79 = client.method876(var77, var78, field1899) - field330;
                                                if (field348 < var77) {
                                                    field348 += field361 * (var77 - field348) / 1000 + field1985;
                                                    if (field348 > var77) {
                                                        field348 = var77;
                                                    }
                                                }
                                                if (field348 > var77) {
                                                    field348 -= field361 * (field348 - var77) / 1000 + field1985;
                                                    if (field348 < var77) {
                                                        field348 = var77;
                                                    }
                                                }
                                                if (field359 < var79) {
                                                    field359 += field361 * (var79 - field359) / 1000 + field1985;
                                                    if (field359 > var79) {
                                                        field359 = var79;
                                                    }
                                                }
                                                if (field359 > var79) {
                                                    field359 -= field361 * (field359 - var79) / 1000 + field1985;
                                                    if (field359 < var79) {
                                                        field359 = var79;
                                                    }
                                                }
                                                if (field269 < var78) {
                                                    field269 += field361 * (var78 - field269) / 1000 + field1985;
                                                    if (field269 > var78) {
                                                        field269 = var78;
                                                    }
                                                }
                                                if (field269 > var78) {
                                                    field269 -= field361 * (field269 - var78) / 1000 + field1985;
                                                    if (field269 < var78) {
                                                        field269 = var78;
                                                    }
                                                }
                                                int var80 = field1535 * 128 + 64;
                                                int var81 = field1191 * 128 + 64;
                                                int var82 = client.method876(var80, var81, field1899) - field1894;
                                                int var83 = var80 - field348;
                                                int var84 = var82 - field359;
                                                int var85 = var81 - field269;
                                                int var86 = (int) Math.sqrt((double) (var83 * var83 + var85 * var85));
                                                int var87 = (int) (Math.atan2((double) var84, (double) var86) * 325.949D) & 0x7FF;
                                                int var88 = (int) (Math.atan2((double) var83, (double) var85) * -325.949D) & 0x7FF;
                                                if (var87 < 128) {
                                                    var87 = 128;
                                                }
                                                if (var87 > 383) {
                                                    var87 = 383;
                                                }
                                                if (field2453 < var87) {
                                                    field2453 += field460 * (var87 - field2453) / 1000 + field1824;
                                                    if (field2453 > var87) {
                                                        field2453 = var87;
                                                    }
                                                }
                                                if (field2453 > var87) {
                                                    field2453 -= field460 * (field2453 - var87) / 1000 + field1824;
                                                    if (field2453 < var87) {
                                                        field2453 = var87;
                                                    }
                                                }
                                                int var89 = var88 - field1019;
                                                if (var89 > 1024) {
                                                    var89 -= 2048;
                                                }
                                                if (var89 < -1024) {
                                                    var89 += 2048;
                                                }
                                                if (var89 > 0) {
                                                    field1019 += field460 * var89 / 1000 + field1824;
                                                    field1019 &= 0x7FF;
                                                }
                                                if (var89 < 0) {
                                                    field1019 -= field460 * -var89 / 1000 + field1824;
                                                    field1019 &= 0x7FF;
                                                }
                                                int var90 = var88 - field1019;
                                                if (var90 > 1024) {
                                                    var90 -= 2048;
                                                }
                                                if (var90 < -1024) {
                                                    var90 += 2048;
                                                }
                                                if (var90 < 0 && var89 > 0 || var90 > 0 && var89 < 0) {
                                                    field1019 = var88;
                                                }
                                            }
                                            for (int var91 = 0; var91 < 5; var91++) {
                                                var10002 = client.field685[var91]++;
                                            }
                                            int var92 = class76.method161();
                                            int var93 = class74.field1337;
                                            if (var92 > 15000 && var93 > 15000) {
                                                client.field696 = 250;
                                                class76.method1871(14500);
                                                client.field634.method2358(118);
                                            }
                                            client.field681++;
                                            if (client.field681 > 500) {
                                                client.field681 = 0;
                                                int var95 = (int) (Math.random() * 8.0D);
                                                if ((var95 & 0x1) == 1) {
                                                    client.field535 += client.field536;
                                                }
                                                if ((var95 & 0x2) == 2) {
                                                    client.field537 += client.field538;
                                                }
                                                if ((var95 & 0x4) == 4) {
                                                    client.field539 += client.field540;
                                                }
                                            }
                                            if (client.field535 < -50) {
                                                client.field536 = 2;
                                            }
                                            if (client.field535 > 50) {
                                                client.field536 = -2;
                                            }
                                            if (client.field537 < -55) {
                                                client.field538 = 2;
                                            }
                                            if (client.field537 > 55) {
                                                client.field538 = -2;
                                            }
                                            if (client.field539 < -40) {
                                                client.field540 = 1;
                                            }
                                            if (client.field539 > 40) {
                                                client.field540 = -1;
                                            }
                                            client.field546++;
                                            if (client.field546 > 500) {
                                                client.field546 = 0;
                                                int var96 = (int) (Math.random() * 8.0D);
                                                if ((var96 & 0x1) == 1) {
                                                    client.field542 += client.field543;
                                                }
                                                if ((var96 & 0x2) == 2) {
                                                    client.field544 += client.field605;
                                                }
                                            }
                                            if (client.field542 < -60) {
                                                client.field543 = 2;
                                            }
                                            if (client.field542 > 60) {
                                                client.field543 = -2;
                                            }
                                            if (client.field544 < -20) {
                                                client.field605 = 1;
                                            }
                                            if (client.field544 > 10) {
                                                client.field605 = -1;
                                            }
                                            for (class27 var97 = (class27) client.field564.method3344(); var97 != null; var97 = (class27) client.field564.method3341()) {
                                                if ((long) var97.field740 < class120.method8() / 1000L - 5L) {
                                                    if (var97.field737 > 0) {
                                                        client.method1380(5, "", var97.field736 + class133.field2082);
                                                    }
                                                    if (var97.field737 == 0) {
                                                        client.method1380(5, "", var97.field736 + class133.field2168);
                                                    }
                                                    var97.method3410();
                                                }
                                            }
                                            client.field514++;
                                            if (client.field514 > 50) {
                                                client.field634.method2358(178);
                                            }
                                            try {
                                                if (field1328 != null && client.field634.field2016 > 0) {
                                                    field1328.method1371(client.field634.field2013, 0, client.field634.field2016);
                                                    client.field634.field2016 = 0;
                                                    client.field514 = 0;
                                                }
                                            } catch (IOException var99) {
                                                client.method96();
                                            }
                                            return;
                                        }
                                        var72 = var71.field2;
                                        if (var72.field2532 < 0) {
                                            break;
                                        }
                                        var73 = class156.method2382(var72.field2542);
                                    } while (var73 == null || var73.field2558 == null || var72.field2532 >= var73.field2558.length || var73.field2558[var72.field2532] != var72);
                                    class25.method1222(var71);
                                }
                            }
                            var69 = var68.field2;
                            if (var69.field2532 < 0) {
                                break;
                            }
                            var70 = class156.method2382(var69.field2542);
                        } while (var70 == null || var70.field2558 == null || var69.field2532 >= var70.field2558.length || var70.field2558[var69.field2532] != var69);
                        class25.method1222(var68);
                    }
                }
                var66 = var65.field2;
                if (var66.field2532 < 0) {
                    break;
                }
                var67 = class156.method2382(var66.field2542);
            } while (var67 == null || var67.field2558 == null || var66.field2532 >= var67.field2558.length || var67.field2558[var66.field2532] != var66);
            class25.method1222(var65);
        }
    }

    @ObfuscatedName("c.k(IIB)V")
    public static final void method231(int arg0, int arg1) {
        if (client.field628 != 0 && client.field628 != 3 || class76.field1387 != 1) {
            return;
        }
        int var2 = class76.field1378 - 25 - arg0;
        int var3 = class76.field1381 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = client.field556 + client.field542 & 0x7FF;
        int var5 = class103.field1756[var4];
        int var6 = class103.field1757[var4];
        int var7 = (client.field544 + 256) * var5 >> 8;
        int var8 = (client.field544 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = field2611.field441 + var9 >> 7;
        int var12 = field2611.field433 - var10 >> 7;
        boolean var13 = client.method1339(field2611.field405[0], field2611.field456[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        client.field634.method2472(var2);
        client.field634.method2472(var3);
        client.field634.method2473(client.field556);
        client.field634.method2472(57);
        client.field634.method2472(client.field542);
        client.field634.method2472(client.field544);
        client.field634.method2472(89);
        client.field634.method2473(field2611.field441);
        client.field634.method2473(field2611.field433);
        client.field634.method2472(client.field567);
        client.field634.method2472(63);
    }

    @ObfuscatedName("w.cn(Lef;I)Lef;")
    public static class156 method107(class156 arg0) {
        class156 var1 = client.method574(arg0);
        if (var1 == null) {
            var1 = arg0.field2623;
        }
        return var1;
    }
}
