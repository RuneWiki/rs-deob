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
import java.lang.management.GarbageCollectorMXBean;

public class Statics {

    @ObfuscatedName("j.nl")
    public static int field1;

    @ObfuscatedName("ac.qy")
    public static int field1007;

    @ObfuscatedName("ac.j")
    public static class161 field1014;

    @ObfuscatedName("ac.er")
    public static class77[] field1015;

    @ObfuscatedName("al.dq")
    public static int field1022;

    @ObfuscatedName("al.dr")
    public static int field1023;

    @ObfuscatedName("al.j")
    public static class161 field1026;

    @ObfuscatedName("az.j")
    public static class161 field1036;

    @ObfuscatedName("as.j")
    public static class161 field1040;

    @ObfuscatedName("as.m")
    public static int[] field1044;

    @ObfuscatedName("am.j")
    public static class161 field1049;

    @ObfuscatedName("d.fh")
    public static int field106;

    @ObfuscatedName("am.ba")
    public static String field1060;

    @ObfuscatedName("ay.j")
    public static class161 field1067;

    @ObfuscatedName("d.ng")
    public static class73 field107;

    @ObfuscatedName("ao.c")
    public static int[] field1070;

    @ObfuscatedName("ao.o")
    public static class18 field1072;

    @ObfuscatedName("ao.j")
    public static class161 field1073;

    @ObfuscatedName("aq.l")
    public static class161 field1080;

    @ObfuscatedName("aq.w")
    public static class161 field1081;

    @ObfuscatedName("aq.dm")
    public static int[][] field1087;

    @ObfuscatedName("d.pi")
    public static class131 field109;

    @ObfuscatedName("d.r")
    public static int[][][] field110;

    @ObfuscatedName("d.ni")
    public static int field111;

    @ObfuscatedName("aq.j")
    public static class167[][] field1130;

    @ObfuscatedName("af.y")
    public static int field1132;

    @ObfuscatedName("af.j")
    public static class161 field1135;

    @ObfuscatedName("bz.j")
    public static class52 field1138;

    @ObfuscatedName("bd.l")
    public static boolean field1145;

    @ObfuscatedName("bd.w")
    public static int field1146;

    @ObfuscatedName("bd.d")
    public static class71 field1147;

    @ObfuscatedName("bd.z")
    public static int field1163;

    @ObfuscatedName("bf.de")
    public static int[] field1183;

    @ObfuscatedName("bf.bz")
    public static class79[] field1188;

    @ObfuscatedName("j.fz")
    public static int field12;

    @ObfuscatedName("bp.a")
    public static int field1209;

    @ObfuscatedName("bp.i")
    public static float field1211;

    @ObfuscatedName("bg.o")
    public static int[] field1243;

    @ObfuscatedName("bg.u")
    public static int[] field1245;

    @ObfuscatedName("bg.m")
    public static boolean[] field1247;

    @ObfuscatedName("bu.aa")
    public static float[] field1257;

    @ObfuscatedName("bu.t")
    public static boolean[] field1258;

    @ObfuscatedName("bu.au")
    public static float[] field1261;

    @ObfuscatedName("bu.f")
    public static byte[] field1262;

    @ObfuscatedName("bu.i")
    public static int field1263;

    @ObfuscatedName("bu.a")
    public static int field1264;

    @ObfuscatedName("bu.b")
    public static float[] field1265;

    @ObfuscatedName("bu.m")
    public static class72[] field1267;

    @ObfuscatedName("bu.e")
    public static class66[] field1268;

    @ObfuscatedName("bu.v")
    public static class59[] field1269;

    @ObfuscatedName("bu.r")
    public static class67[] field1270;

    @ObfuscatedName("bu.g")
    public static int[] field1272;

    @ObfuscatedName("bu.k")
    public static float[] field1273;

    @ObfuscatedName("bu.at")
    public static float[] field1275;

    @ObfuscatedName("bu.x")
    public static float[] field1276;

    @ObfuscatedName("bu.q")
    public static float[] field1279;

    @ObfuscatedName("bu.o")
    public static int field1283;

    @ObfuscatedName("bu.u")
    public static int field1284;

    @ObfuscatedName("bu.ak")
    public static int[] field1285;

    @ObfuscatedName("bu.an")
    public static int[] field1286;

    @ObfuscatedName("bk.ix")
    public static int field1341;

    @ObfuscatedName("bc.i")
    public static int[] field1345;

    @ObfuscatedName("bc.y")
    public static int field1346;

    @ObfuscatedName("bc.l")
    public static int[] field1347;

    @ObfuscatedName("bc.d")
    public static int[] field1349;

    @ObfuscatedName("bc.f")
    public static int[] field1350;

    @ObfuscatedName("bc.ax")
    public static boolean field1352;

    @ObfuscatedName("bc.eh")
    public static class77[] field1353;

    @ObfuscatedName("bc.j")
    public static int field1354;

    @ObfuscatedName("bc.w")
    public static int[] field1355;

    @ObfuscatedName("bc.h")
    public static String field1356;

    @ObfuscatedName("be.mx")
    public static byte field1359;

    @ObfuscatedName("be.bz")
    public static class162 field1364;

    @ObfuscatedName("be.en")
    public static class77[] field1365;

    @ObfuscatedName("be.cw")
    public static int field1367;

    @ObfuscatedName("bl.v")
    public static int field1383;

    @ObfuscatedName("bl.r")
    public static int field1384;

    @ObfuscatedName("bl.e")
    public static int[] field1388;

    @ObfuscatedName("i.pc")
    public static int field139;

    @ObfuscatedName("j.im")
    public static class167 field14;

    @ObfuscatedName("cs.r")
    public static int[] field1412;

    @ObfuscatedName("i.kg")
    public static int field142;

    @ObfuscatedName("cc.h")
    public static int field1423;

    @ObfuscatedName("cc.b")
    public static int field1428;

    @ObfuscatedName("cc.s")
    public static int field1429;

    @ObfuscatedName("a.ha")
    public static class3 field143;

    @ObfuscatedName("cc.bf")
    public static int field1434;

    @ObfuscatedName("cc.g")
    public static int field1436;

    @ObfuscatedName("cc.n")
    public static int field1438;

    @ObfuscatedName("cc.aa")
    public static int field1439;

    @ObfuscatedName("cc.p")
    public static int field1440;

    @ObfuscatedName("cc.c")
    public static int field1441;

    @ObfuscatedName("cc.x")
    public static int field1442;

    @ObfuscatedName("cc.q")
    public static int field1443;

    @ObfuscatedName("cc.at")
    public static int field1446;

    @ObfuscatedName("cc.au")
    public static int field1447;

    @ObfuscatedName("cc.ak")
    public static int field1449;

    @ObfuscatedName("cc.k")
    public static int field1466;

    @ObfuscatedName("cc.bs")
    public static boolean[][] field1475;

    @ObfuscatedName("cc.bj")
    public static int field1476;

    @ObfuscatedName("cc.bo")
    public static int field1478;

    @ObfuscatedName("cc.bi")
    public static int field1479;

    @ObfuscatedName("cc.bv")
    public static int field1480;

    @ObfuscatedName("cc.bp")
    public static int field1481;

    @ObfuscatedName("a.nh")
    public static int field149;

    @ObfuscatedName("j.kw")
    public static class19 field15;

    @ObfuscatedName("ch.v")
    public static class166 field1509;

    @ObfuscatedName("cu.au")
    public static class90 field1519;

    @ObfuscatedName("a.ip")
    public static int field152;

    @ObfuscatedName("cu.x")
    public static int field1524;

    @ObfuscatedName("cu.u")
    public static int field1529;

    @ObfuscatedName("cu.m")
    public static int field1530;

    @ObfuscatedName("cu.h")
    public static int field1531;

    @ObfuscatedName("cu.p")
    public static int field1532;

    @ObfuscatedName("cu.c")
    public static int field1533;

    @ObfuscatedName("cu.q")
    public static int field1535;

    @ObfuscatedName("cu.b")
    public static int field1538;

    @ObfuscatedName("cn.dl")
    public static class84 field1555;

    @ObfuscatedName("cj.ih")
    public static class167 field1573;

    @ObfuscatedName("o.g")
    public static String[] field160;

    @ObfuscatedName("o.ah")
    public static class162 field161;

    @ObfuscatedName("cx.qm")
    public static Image field1614;

    @ObfuscatedName("o.k")
    public static int[] field163;

    @ObfuscatedName("co.ib")
    public static int field1634;

    @ObfuscatedName("u.q")
    public static class13 field167;

    @ObfuscatedName("u.nm")
    public static int field168;

    @ObfuscatedName("cg.qg")
    public static int field1705;

    @ObfuscatedName("cg.qk")
    public static Canvas field1706;

    @ObfuscatedName("u.el")
    public static class77 field172;

    @ObfuscatedName("cr.ql")
    public static int field1737;

    @ObfuscatedName("cr.n")
    public static int[] field1738;

    @ObfuscatedName("u.kf")
    public static class126 field175;

    @ObfuscatedName("cw.bz")
    public static int field1791;

    @ObfuscatedName("cw.bw")
    public static int field1792;

    @ObfuscatedName("cw.bd")
    public static int field1793;

    @ObfuscatedName("cp.bw")
    public static class162 field1807;

    @ObfuscatedName("dd.be")
    public static int field1817;

    @ObfuscatedName("dd.b")
    public static int[] field1847;

    @ObfuscatedName("dv.bp")
    public static class162 field1848;

    @ObfuscatedName("da.qc")
    public static int field1866;

    @ObfuscatedName("dh.j")
    public static long field1868;

    @ObfuscatedName("dh.w")
    public static byte[][][] field1869;

    @ObfuscatedName("m.dy")
    public static int[] field187;

    @ObfuscatedName("dh.pp")
    public static class9 field1870;

    @ObfuscatedName("dh.p")
    public static String field1871;

    @ObfuscatedName("dh.y")
    public static long field1872;

    @ObfuscatedName("dp.qu")
    public static class76 field1877;

    @ObfuscatedName("dp.u")
    public static int[] field1878;

    @ObfuscatedName("m.pu")
    public static short[] field188;

    @ObfuscatedName("dp.no")
    public static int field1880;

    @ObfuscatedName("j.h")
    public static class114 field19;

    @ObfuscatedName("dm.py")
    public static GarbageCollectorMXBean field1901;

    @ObfuscatedName("m.ds")
    public static int field191;

    @ObfuscatedName("do.mp")
    public static class24[] field1912;

    @ObfuscatedName("du.t")
    public static class114 field1921;

    @ObfuscatedName("du.e")
    public static class58 field1922;

    @ObfuscatedName("dl.g")
    public static int field1930;

    @ObfuscatedName("dz.oa")
    public static int field1938;

    @ObfuscatedName("dz.qf")
    public static int field1939;

    @ObfuscatedName("dz.bx")
    public static class162 field1940;

    @ObfuscatedName("dr.bi")
    public static class162 field1947;

    @ObfuscatedName("dt.bj")
    public static class162 field1957;

    @ObfuscatedName("dw.qo")
    public static Frame field1966;

    @ObfuscatedName("dw.pk")
    public static int field1968;

    @ObfuscatedName("dw.d")
    public static class161 field1969;

    @ObfuscatedName("dk.he")
    public static int field1972;

    @ObfuscatedName("dk.y")
    public static File field1973;

    @ObfuscatedName("dk.l")
    public static String[] field1975;

    @ObfuscatedName("e.u")
    public static class167 field198;

    @ObfuscatedName("eq.y")
    public static String field1988;

    @ObfuscatedName("eq.aq")
    public static class162 field1989;

    @ObfuscatedName("es.aw")
    public static int field1995;

    @ObfuscatedName("es.ir")
    public static class30 field1998;

    @ObfuscatedName("ew.fv")
    public static int field2020;

    @ObfuscatedName("ew.kb")
    public static int field2024;

    @ObfuscatedName("ew.iw")
    public static int field2028;

    @ObfuscatedName("ea.z")
    public static class161 field2031;

    @ObfuscatedName("ep.qv")
    public static int field2056;

    @ObfuscatedName("ef.nd")
    public static class54 field2060;

    @ObfuscatedName("ef.qt")
    public static int field2066;

    @ObfuscatedName("ef.a")
    public static short[] field2068;

    @ObfuscatedName("eo.a")
    public static int field2071;

    @ObfuscatedName("eo.z")
    public static client field2072;

    @ObfuscatedName("eo.y")
    public static class161 field2073;

    @ObfuscatedName("el.ae")
    public static class141 field2087;

    @ObfuscatedName("el.ah")
    public static class79[] field2090;

    @ObfuscatedName("el.ry")
    public static String field2092;

    @ObfuscatedName("eb.z")
    public static int field2114;

    @ObfuscatedName("en.y")
    public static String field2129;

    @ObfuscatedName("en.f")
    public static int field2132;

    @ObfuscatedName("en.j")
    public static Applet field2135;

    @ObfuscatedName("eg.d")
    public static int field2139;

    @ObfuscatedName("v.kv")
    public static int field214;

    @ObfuscatedName("eg.l")
    public static File field2141;

    @ObfuscatedName("eg.v")
    public static class222[] field2143;

    @ObfuscatedName("eg.c")
    public static String field2146;

    @ObfuscatedName("eg.r")
    public static int field2148;

    @ObfuscatedName("eg.nq")
    public static int field2149;

    @ObfuscatedName("v.fb")
    public static int field215;

    @ObfuscatedName("eg.cc")
    public static class138 field2150;

    @ObfuscatedName("v.r")
    public static String field217;

    @ObfuscatedName("ec.eb")
    public static class77 field2187;

    @ObfuscatedName("ex.bm")
    public static class162 field2193;

    @ObfuscatedName("ex.rf")
    public static boolean field2201;

    @ObfuscatedName("ez.qj")
    public static class128 field2204;

    @ObfuscatedName("ez.o")
    public static class79 field2208;

    @ObfuscatedName("ej.s")
    public static int field2223;

    @ObfuscatedName("r.at")
    public static int[] field225;

    @ObfuscatedName("r.iz")
    public static int field226;

    @ObfuscatedName("t.ol")
    public static int field237;

    @ObfuscatedName("t.na")
    public static int field242;

    @ObfuscatedName("t.fw")
    public static int field245;

    @ObfuscatedName("t.bo")
    public static class162 field246;

    @ObfuscatedName("t.hx")
    public static int field251;

    @ObfuscatedName("ei.ed")
    public static class77[] field2510;

    @ObfuscatedName("g.lj")
    public static class125 field252;

    @ObfuscatedName("ee.gu")
    public static class167 field2520;

    @ObfuscatedName("ey.bk")
    public static int field2547;

    @ObfuscatedName("ek.l")
    public static class178 field2563;

    @ObfuscatedName("fi.cp")
    public static int field2578;

    @ObfuscatedName("fb.as")
    public static class138 field2584;

    @ObfuscatedName("fb.u")
    public static class218 field2585;

    @ObfuscatedName("fz.z")
    public static int field2588;

    @ObfuscatedName("g.gq")
    public static class167 field259;

    @ObfuscatedName("fz.i")
    public static int field2590;

    @ObfuscatedName("fh.bw")
    public static class79 field2611;

    @ObfuscatedName("fu.is")
    public static int field2628;

    @ObfuscatedName("g.cz")
    public static class141 field263;

    @ObfuscatedName("ff.z")
    public static long field2639;

    @ObfuscatedName("ff.j")
    public static class138 field2655;

    @ObfuscatedName("fy.d")
    public static boolean field2661;

    @ObfuscatedName("fo.z")
    public static class161 field2668;

    @ObfuscatedName("fo.w")
    public static class161 field2669;

    @ObfuscatedName("s.ex")
    public static class77[] field270;

    @ObfuscatedName("s.fk")
    public static int field276;

    @ObfuscatedName("s.e")
    public static boolean field278;

    @ObfuscatedName("s.aq")
    public static class77[] field279;

    @ObfuscatedName("fo.y")
    public static boolean[] field2790;

    @ObfuscatedName("fv.pq")
    public static class129 field2815;

    @ObfuscatedName("s.af")
    public static class162 field282;

    @ObfuscatedName("fv.bv")
    public static class162 field2822;

    @ObfuscatedName("fd.cg")
    public static class218 field2826;

    @ObfuscatedName("fr.j")
    public static String field2829;

    @ObfuscatedName("fl.em")
    public static class77[] field2834;

    @ObfuscatedName("fl.a")
    public static int[][] field2837;

    @ObfuscatedName("fp.f")
    public static short[] field2844;

    @ObfuscatedName("fp.i")
    public static short[][] field2845;

    @ObfuscatedName("fp.o")
    public static short[][] field2846;

    @ObfuscatedName("fq.do")
    public static byte[][] field2864;

    @ObfuscatedName("fj.j")
    public static class161 field2879;

    @ObfuscatedName("fj.y")
    public static class161 field2880;

    @ObfuscatedName("fj.o")
    public static int field2881;

    @ObfuscatedName("fj.d")
    public static class161 field2882;

    @ObfuscatedName("fj.f")
    public static int field2883;

    @ObfuscatedName("fj.m")
    public static class174 field2884;

    @ObfuscatedName("ft.mo")
    public static int field2918;

    @ObfuscatedName("n.qz")
    public static Font field296;

    @ObfuscatedName("n.cy")
    public static class218 field299;

    @ObfuscatedName("client.o")
    public static class148 field305;

    @ObfuscatedName("gx.ez")
    public static class79[] field3053;

    @ObfuscatedName("go.hw")
    public static int field3059;

    @ObfuscatedName("gj.z")
    public static int[] field3071;

    @ObfuscatedName("client.t")
    public static String field309;

    @ObfuscatedName("hf.y")
    public static class161 field3090;

    @ObfuscatedName("ha.bd")
    public static class162 field3099;

    @ObfuscatedName("hr.hk")
    public static int field3101;

    @ObfuscatedName("hh.m")
    public static class167 field3107;

    @ObfuscatedName("hh.j")
    public static class108 field3109;

    @ObfuscatedName("hb.o")
    public static class79[] field3115;

    @ObfuscatedName("hs.ec")
    public static class77[] field3164;

    @ObfuscatedName("client.pt")
    public static Clipboard field320;

    @ObfuscatedName("client.i")
    public static class147 field323;

    @ObfuscatedName("client.bq")
    public static int field338;

    @ObfuscatedName("z.mu")
    public static class77 field51;

    @ObfuscatedName("client.nt")
    public static class55 field543;

    @ObfuscatedName("p.bg")
    public static class162 field599;

    @ObfuscatedName("c.w")
    public static File field604;

    @ObfuscatedName("c.br")
    public static class162 field607;

    @ObfuscatedName("x.dv")
    public static int field625;

    @ObfuscatedName("x.cu")
    public static int field626;

    @ObfuscatedName("l.az")
    public static class141 field64;

    @ObfuscatedName("b.w")
    public static class25[] field642;

    @ObfuscatedName("b.cd")
    public static class218 field647;

    @ObfuscatedName("k.j")
    public static class161 field662;

    @ObfuscatedName("k.pg")
    public static class215 field667;

    @ObfuscatedName("at.bs")
    public static class162 field677;

    @ObfuscatedName("at.a")
    public static class79[] field679;

    @ObfuscatedName("l.pb")
    public static long field68;

    @ObfuscatedName("au.nr")
    public static class55 field682;

    @ObfuscatedName("aa.ao")
    public static long field692;

    @ObfuscatedName("aa.b")
    public static int[] field695;

    @ObfuscatedName("aa.ci")
    public static class138 field696;

    @ObfuscatedName("aa.qs")
    public static int field698;

    @ObfuscatedName("aa.mn")
    public static byte field701;

    @ObfuscatedName("ak.f")
    public static byte[][][] field705;

    @ObfuscatedName("l.p")
    public static int[] field71;

    @ObfuscatedName("an.l")
    public static class79 field717;

    @ObfuscatedName("an.w")
    public static class79[] field718;

    @ObfuscatedName("an.f")
    public static class77 field720;

    @ObfuscatedName("an.i")
    public static class79 field721;

    @ObfuscatedName("an.u")
    public static class79 field722;

    @ObfuscatedName("l.l")
    public static class161 field73;

    @ObfuscatedName("an.au")
    public static int[] field731;

    @ObfuscatedName("an.d")
    public static class77 field738;

    @ObfuscatedName("an.z")
    public static class79 field740;

    @ObfuscatedName("an.h")
    public static int[] field744;

    @ObfuscatedName("an.af")
    public static class79[] field750;

    @ObfuscatedName("an.bf")
    public static FontMetrics field752;

    @ObfuscatedName("an.j")
    public static boolean field754;

    @ObfuscatedName("ap.u")
    public static boolean field761;

    @ObfuscatedName("ap.du")
    public static byte[][] field762;

    @ObfuscatedName("ap.qb")
    public static int field763;

    @ObfuscatedName("ag.ej")
    public static class79[] field766;

    @ObfuscatedName("w.om")
    public static int field77;

    @ObfuscatedName("ag.bc")
    public static int field771;

    @ObfuscatedName("ag.a")
    public static byte[][] field776;

    @ObfuscatedName("aj.km")
    public static class167[] field785;

    @ObfuscatedName("aj.fi")
    public static int field789;

    @ObfuscatedName("w.ps")
    public static class154 field79;

    @ObfuscatedName("w.ac")
    public static String field80;

    @ObfuscatedName("w.z")
    public static int field82;

    @ObfuscatedName("ar.t")
    public static String[] field857;

    @ObfuscatedName("w.u")
    public static class206 field87;

    @ObfuscatedName("ab.j")
    public static class161 field876;

    @ObfuscatedName("ab.dj")
    public static int[] field883;

    @ObfuscatedName("ab.gi")
    public static class167 field901;

    @ObfuscatedName("ai.z")
    public static class161 field904;

    @ObfuscatedName("d.o")
    public static int[] field91;

    @ObfuscatedName("ai.cq")
    public static char field911;

    @ObfuscatedName("d.d")
    public static byte[][][] field92;

    @ObfuscatedName("d.i")
    public static byte[][][] field93;

    @ObfuscatedName("ai.y")
    public static class161 field943;

    @ObfuscatedName("d.e")
    public static int[] field95;

    @ObfuscatedName("ai.et")
    public static class79[] field952;

    @ObfuscatedName("ae.j")
    public static class161 field955;

    @ObfuscatedName("d.v")
    public static int[] field96;

    @ObfuscatedName("ax.y")
    public static class161 field964;

    @ObfuscatedName("ax.z")
    public static class161 field967;

    @ObfuscatedName("d.l")
    public static byte[][][] field98;

    @ObfuscatedName("ax.j")
    public static class161 field980;

    @ObfuscatedName("ax.eg")
    public static class77[] field982;

    @ObfuscatedName("aw.y")
    public static class161 field999;

    @ObfuscatedName("eh.j(I)J")
    public static synchronized long method2875() {
        long var0 = System.currentTimeMillis();
        if (var0 < field1868) {
            field1872 += field1868 - var0;
        }
        field1868 = var0;
        return field1872 + var0;
    }

    @ObfuscatedName("w.y(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method37(int arg0, String arg1, String arg2, String arg3) {
        class27 var4 = (class27) class11.field171.get(arg0);
        if (var4 == null) {
            var4 = new class27();
            class11.field171.put(arg0, var4);
        }
        class34 var5 = var4.method639(arg0, arg1, arg2, arg3);
        class11.field177.method3474(var5, (long) var5.field775);
        class11.field169.method3519(var5);
        client.field416 = client.field385;
    }

    @ObfuscatedName("ec.z(ILdw;Lfc;I)V")
    public static void method2877(int arg0, class129 arg1, class162 arg2) {
        class163 var3 = new class163();
        var3.field2624 = 1;
        var3.field3043 = (long) arg0;
        var3.field2625 = arg1;
        var3.field2626 = arg2;
        class193 var4 = class164.field2634;
        synchronized (class164.field2634) {
            class164.field2634.method3485(var3);
        }
        Object var6 = class164.field2632;
        synchronized (class164.field2632) {
            if (class164.field2630 == 0) {
                field109.method2697(new class164(), 5);
            }
            class164.field2630 = 600;
        }
    }

    @ObfuscatedName("m.z(I)V")
    public static void method152() {
        class135 var0 = class135.field2042;
        synchronized (class135.field2042) {
            class135.field2044 = class135.field2059;
            class135.field2045 = class135.field2053;
            class135.field2046 = class135.field2055 * 2139827073;
            class135.field2043 = class135.field2047;
            class135.field2052 = class135.field2039;
            class135.field2048 = class135.field2049;
            class135.field2054 = class135.field2050;
            class135.field2047 = 0;
        }
    }

    @ObfuscatedName("j.y(I)V")
    public static void method3() {
        field98 = (byte[][][]) null;
        field1869 = (byte[][][]) null;
        field92 = (byte[][][]) null;
        field705 = (byte[][][]) null;
        field110 = (int[][][]) null;
        field93 = (byte[][][]) null;
        field2837 = (int[][]) null;
        field91 = null;
        field1878 = null;
        field1044 = null;
        field95 = null;
        field96 = null;
    }

    @ObfuscatedName("af.a(I)Z")
    public static boolean method1102() {
        try {
            if (class177.field2885 == 2) {
                if (field2884 == null) {
                    field2884 = class174.method3222(field2882, field2883, field2590);
                    if (field2884 == null) {
                        return false;
                    }
                }
                if (field1922 == null) {
                    field1922 = new class58(field2031, field2880);
                }
                if (field2563.method3313(field2884, field2879, field1922, 22050)) {
                    field2563.method3314();
                    field2563.method3311(field2071);
                    field2563.method3316(field2884, field761);
                    class177.field2885 = 0;
                    field2884 = null;
                    field1922 = null;
                    field2882 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            field2563.method3350();
            class177.field2885 = 0;
            field2884 = null;
            field1922 = null;
            field2882 = null;
        }
        return false;
    }

    @ObfuscatedName("dm.l(I)V")
    public static void method2571() {
        class221 var0 = null;
        try {
            var0 = class144.method99("", field305.field2198, true);
            class114 var1 = field1870.method108();
            var0.method3752(var1.field1891, 0, var1.field1894);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3767();
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("en.y(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static File method2850(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        field2141 = new File(field2146, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (field2141.exists()) {
            try {
                class221 var7 = new class221(field2141, "rw", 10000L);
                class114 var8 = new class114((int) var7.method3762());
                while (var8.field1894 < var8.field1891.length) {
                    int var9 = var7.method3755(var8.field1891, var8.field1894, var8.field1891.length - var8.field1894);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field1894 += var9;
                }
                var8.field1894 = 0;
                int var10 = var8.method2322();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method2322();
                }
                if (var10 <= 2) {
                    var4 = var8.method2331();
                    if (var11 == 1) {
                        var5 = var8.method2331();
                    }
                } else {
                    var4 = var8.method2332();
                    if (var11 == 1) {
                        var5 = var8.method2332();
                    }
                }
                var7.method3767();
            } catch (IOException var34) {
                var34.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                if (!class144.method632(var14, true)) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label118: for (int var15 = 0; var15 < field160.length; var15++) {
                for (int var16 = 0; var16 < field857.length; var16++) {
                    File var17 = new File(field857[var16] + field160[var15] + File.separatorChar + arg0 + File.separatorChar);
                    if (var17.exists() && class144.method632(new File(var17, "test.dat"), true)) {
                        var4 = var17.toString();
                        var6 = true;
                        break label118;
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = field2146 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var18 = new File(var5);
            File var19 = new File(var4);
            try {
                File[] var20 = var18.listFiles();
                File[] var21 = var20;
                for (int var22 = 0; var22 < var21.length; var22++) {
                    File var23 = var21[var22];
                    File var24 = new File(var19, var23.getName());
                    boolean var25 = var23.renameTo(var24);
                    if (!var25) {
                        throw new IOException();
                    }
                }
            } catch (Exception var33) {
                var33.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            File var27 = new File(var4);
            Object var28 = null;
            try {
                class221 var29 = new class221(field2141, "rw", 10000L);
                class114 var30 = new class114(500);
                var30.method2307(3);
                var30.method2307(var28 == null ? 0 : 1);
                var30.method2315(var27.getPath());
                if (var28 != null) {
                    var30.method2315(((File) var28).getPath());
                }
                var29.method3752(var30.field1891, 0, var30.field1894);
                var29.method3767();
            } catch (IOException var32) {
                var32.printStackTrace();
            }
        }
        return new File(var4);
    }

    @ObfuscatedName("ev.w(III)V")
    public static void method2888(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class166 var4 = (class166) class165.field2651.method3459(var2);
        if (var4 != null) {
            class165.field2644.method3534(var4);
        }
    }

    @ObfuscatedName("en.o(B)V")
    public static void method2859() {
        class38.field864.method3435();
        class38.field865.method3435();
    }

    @ObfuscatedName("l.ar(Ljava/lang/String;ZI)V")
    public static final void method28(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = field2826.method3662(arg0, 250);
        int var6 = field2826.method3693(arg0, 250) * 13;
        class78.method1717(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class78.method1719(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        field2826.method3675(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        client.method2161(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            client.method131(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = field1706.getGraphics();
            field1877.method1552(var7, 0, 0);
        } catch (Exception var9) {
            field1706.repaint();
        }
    }

    @ObfuscatedName("e.bd(IIIIIB)V")
    public static final void method155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field1555.method1867(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = field1555.method1899(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = field51.field1380;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class39 var13 = class39.method902(var12);
            if (var13.field919 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 1) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
                if (var8 == 3) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                    }
                }
                if (var8 == 2) {
                    if (var7 == 3) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
            } else {
                class79 var14 = field952[var13.field919];
                if (var14 != null) {
                    int var15 = (var13.field918 * 4 - var14.field1391) / 2;
                    int var16 = (var13.field949 * 4 - var14.field1389) / 2;
                    var14.method1769(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field949) * 4 + 48 + var16);
                }
            }
        }
        int var17 = field1555.method1828(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = field1555.method1899(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class39 var22 = class39.method902(var21);
            if (var22.field919 != -1) {
                class79 var23 = field952[var22.field919];
                if (var23 != null) {
                    int var24 = (var22.field918 * 4 - var23.field1391) / 2;
                    int var25 = (var22.field949 * 4 - var23.field1389) / 2;
                    var23.method1769(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field949) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = field51.field1380;
                int var28 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var19 == 0 || var19 == 2) {
                    var27[var28 + 1536] = var26;
                    var27[var28 + 1024 + 1] = var26;
                    var27[var28 + 512 + 2] = var26;
                    var27[var28 + 3] = var26;
                } else {
                    var27[var28] = var26;
                    var27[var28 + 512 + 1] = var26;
                    var27[var28 + 1024 + 2] = var26;
                    var27[var28 + 1536 + 3] = var26;
                }
            }
        }
        int var29 = field1555.method1836(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class39 var31 = class39.method902(var30);
        if (var31.field919 == -1) {
            return;
        }
        class79 var32 = field952[var31.field919];
        if (var32 != null) {
            int var33 = (var31.field918 * 4 - var32.field1391) / 2;
            int var34 = (var31.field949 * 4 - var32.field1389) / 2;
            var32.method1769(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field949) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("m.bs(I)V")
    public static final void method150() {
        if (client.field346 == 48) {
            int var0 = client.field344.method2517();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = client.field363[var1];
            int var4 = client.field344.method2355();
            int var5 = client.field344.method2517();
            int var6 = (var5 >> 4 & 0x7) + field1022;
            int var7 = (var5 & 0x7) + field1023;
            if (var6 >= 0 && var7 >= 0 && var6 < 103 && var7 < 103) {
                if (var3 == 0) {
                    class85 var8 = field1555.method1847(field3101, var6, var7);
                    if (var8 != null) {
                        int var9 = var8.field1489 >> 14 & 0x7FFF;
                        if (var1 == 2) {
                            var8.field1491 = new class12(var9, 2, var2 + 4, field3101, var6, var7, var4, false, var8.field1491);
                            var8.field1488 = new class12(var9, 2, var2 + 1 & 0x3, field3101, var6, var7, var4, false, var8.field1488);
                        } else {
                            var8.field1491 = new class12(var9, var1, var2, field3101, var6, var7, var4, false, var8.field1491);
                        }
                    }
                }
                if (var3 == 1) {
                    class92 var10 = field1555.method1823(field3101, var6, var7);
                    if (var10 != null) {
                        int var11 = var10.field1560 >> 14 & 0x7FFF;
                        if (var1 == 4 || var1 == 5) {
                            var10.field1558 = new class12(var11, 4, var2, field3101, var6, var7, var4, false, var10.field1558);
                        } else if (var1 == 6) {
                            var10.field1558 = new class12(var11, 4, var2 + 4, field3101, var6, var7, var4, false, var10.field1558);
                        } else if (var1 == 7) {
                            var10.field1558 = new class12(var11, 4, (var2 + 2 & 0x3) + 4, field3101, var6, var7, var4, false, var10.field1558);
                        } else if (var1 == 8) {
                            var10.field1558 = new class12(var11, 4, var2 + 4, field3101, var6, var7, var4, false, var10.field1558);
                            var10.field1552 = new class12(var11, 4, (var2 + 2 & 0x3) + 4, field3101, var6, var7, var4, false, var10.field1552);
                        }
                    }
                }
                if (var3 == 2) {
                    class96 var12 = field1555.method1824(field3101, var6, var7);
                    if (var1 == 11) {
                        var1 = 10;
                    }
                    if (var12 != null) {
                        var12.field1613 = new class12(var12.field1621 >> 14 & 0x7FFF, var1, var2, field3101, var6, var7, var4, false, var12.field1613);
                    }
                }
                if (var3 == 3) {
                    class91 var13 = field1555.method1825(field3101, var6, var7);
                    if (var13 != null) {
                        var13.field1549 = new class12(var13.field1548 >> 14 & 0x7FFF, 22, var2, field3101, var6, var7, var4, false, var13.field1549);
                    }
                }
            }
            return;
        }
        if (client.field346 == 205) {
            int var14 = client.field344.method2324();
            int var15 = client.field344.method2306();
            byte var16 = client.field344.method2323();
            int var17 = client.field344.method2356();
            int var18 = client.field344.method2517();
            int var19 = var18 >> 2;
            int var20 = var18 & 0x3;
            int var21 = client.field363[var19];
            byte var22 = client.field344.method2350();
            byte var23 = client.field344.method2350();
            byte var24 = client.field344.method2323();
            int var25 = client.field344.method2356();
            int var26 = client.field344.method2517();
            int var27 = (var26 >> 4 & 0x7) + field1022;
            int var28 = (var26 & 0x7) + field1023;
            class3 var29;
            if (client.field425 == var15) {
                var29 = field143;
            } else {
                var29 = client.field419[var15];
            }
            if (var29 != null) {
                class39 var30 = class39.method902(var17);
                int var31;
                int var32;
                if (var20 == 1 || var20 == 3) {
                    var31 = var30.field949;
                    var32 = var30.field918;
                } else {
                    var31 = var30.field918;
                    var32 = var30.field949;
                }
                int var33 = (var31 >> 1) + var27;
                int var34 = (var31 + 1 >> 1) + var27;
                int var35 = (var32 >> 1) + var28;
                int var36 = (var32 + 1 >> 1) + var28;
                int[][] var37 = class6.field88[field3101];
                int var38 = var37[var33][var35] + var37[var34][var35] + var37[var33][var36] + var37[var34][var36] >> 2;
                int var39 = (var27 << 7) + (var31 << 6);
                int var40 = (var28 << 7) + (var32 << 6);
                class103 var41 = var30.method769(var19, var20, var37, var39, var38, var40);
                if (var41 != null) {
                    client.method3414(field3101, var27, var28, var21, -1, 0, 0, var14 + 1, var25 + 1);
                    var29.field38 = client.field477 + var14;
                    var29.field46 = client.field477 + var25;
                    var29.field50 = var41;
                    var29.field58 = var27 * 128 + var31 * 64;
                    var29.field49 = var28 * 128 + var32 * 64;
                    var29.field47 = var38;
                    if (var22 > var16) {
                        byte var42 = var22;
                        var22 = var16;
                        var16 = var42;
                    }
                    if (var24 > var23) {
                        byte var43 = var24;
                        var24 = var23;
                        var23 = var43;
                    }
                    var29.field43 = var22 + var27;
                    var29.field52 = var16 + var27;
                    var29.field59 = var24 + var28;
                    var29.field54 = var23 + var28;
                }
            }
        }
        if (client.field346 == 36) {
            int var44 = client.field344.method2324();
            int var45 = client.field344.method2480();
            int var46 = (var45 >> 4 & 0x7) + field1022;
            int var47 = (var45 & 0x7) + field1023;
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                class193 var48 = client.field391[field3101][var46][var47];
                if (var48 != null) {
                    for (class28 var49 = (class28) var48.method3490(); var49 != null; var49 = (class28) var48.method3492()) {
                        if ((var44 & 0x7FFF) == var49.field681) {
                            var49.method3563();
                            break;
                        }
                    }
                    if (var48.method3490() == null) {
                        client.field391[field3101][var46][var47] = null;
                    }
                    client.method157(var46, var47);
                }
            }
        } else if (client.field346 == 162) {
            int var50 = client.field344.method2322();
            int var51 = (var50 >> 4 & 0x7) + field1022;
            int var52 = (var50 & 0x7) + field1023;
            int var53 = client.field344.method2324();
            int var54 = client.field344.method2324();
            int var55 = client.field344.method2324();
            if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                class193 var56 = client.field391[field3101][var51][var52];
                if (var56 != null) {
                    for (class28 var57 = (class28) var56.method3490(); var57 != null; var57 = (class28) var56.method3492()) {
                        if ((var53 & 0x7FFF) == var57.field681 && var57.field684 == var54) {
                            var57.field684 = var55;
                            break;
                        }
                    }
                    client.method157(var51, var52);
                }
            }
        } else if (client.field346 == 234) {
            int var58 = client.field344.method2322();
            int var59 = (var58 >> 4 & 0x7) + field1022;
            int var60 = (var58 & 0x7) + field1023;
            int var61 = client.field344.method2322();
            int var62 = var61 >> 2;
            int var63 = var61 & 0x3;
            int var64 = client.field363[var62];
            int var65 = client.field344.method2356();
            if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                client.method3414(field3101, var59, var60, var64, var65, var62, var63, 0, -1);
            }
        } else if (client.field346 == 56) {
            int var66 = client.field344.method2480();
            int var67 = (var66 >> 4 & 0x7) + field1022;
            int var68 = (var66 & 0x7) + field1023;
            int var69 = client.field344.method2517();
            int var70 = var69 >> 2;
            int var71 = var69 & 0x3;
            int var72 = client.field363[var70];
            if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                client.method3414(field3101, var67, var68, var72, -1, var70, var71, 0, -1);
            }
        } else {
            if (client.field346 == 118) {
                int var73 = client.field344.method2322();
                int var74 = (var73 >> 4 & 0x7) + field1022;
                int var75 = (var73 & 0x7) + field1023;
                int var76 = client.field344.method2324();
                int var77 = client.field344.method2322();
                int var78 = var77 >> 4 & 0xF;
                int var79 = var77 & 0x7;
                int var80 = client.field344.method2322();
                if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                    int var81 = var78 + 1;
                    if (field143.field847[0] >= var74 - var81 && field143.field847[0] <= var74 + var81 && field143.field848[0] >= var75 - var81 && field143.field848[0] <= var75 + var81 && client.field525 != 0 && var79 > 0 && client.field544 < 50) {
                        client.field545[client.field544] = var76;
                        client.field546[client.field544] = var79;
                        client.field547[client.field544] = var80;
                        client.field549[client.field544] = null;
                        client.field548[client.field544] = (var74 << 16) + (var75 << 8) + var78;
                        client.field544++;
                    }
                }
            }
            if (client.field346 == 131) {
                int var82 = client.field344.method2322();
                int var83 = (var82 >> 4 & 0x7) + field1022;
                int var84 = (var82 & 0x7) + field1023;
                int var85 = client.field344.method2324();
                int var86 = client.field344.method2322();
                int var87 = client.field344.method2324();
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    int var88 = var83 * 128 + 64;
                    int var89 = var84 * 128 + 64;
                    class29 var90 = new class29(var85, field3101, var88, var89, client.method2267(var88, var89, field3101) - var86, var87, client.field477);
                    client.field437.method3485(var90);
                }
            } else if (client.field346 == 183) {
                int var91 = client.field344.method2322();
                int var92 = (var91 >> 4 & 0x7) + field1022;
                int var93 = (var91 & 0x7) + field1023;
                int var94 = var92 + client.field344.method2323();
                int var95 = var93 + client.field344.method2323();
                int var96 = client.field344.method2308();
                int var97 = client.field344.method2324();
                int var98 = client.field344.method2322() * 4;
                int var99 = client.field344.method2322() * 4;
                int var100 = client.field344.method2324();
                int var101 = client.field344.method2324();
                int var102 = client.field344.method2322();
                int var103 = client.field344.method2322();
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104 && var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104 && var97 != 65535) {
                    int var104 = var92 * 128 + 64;
                    int var105 = var93 * 128 + 64;
                    int var106 = var94 * 128 + 64;
                    int var107 = var95 * 128 + 64;
                    class7 var108 = new class7(var97, field3101, var104, var105, client.method2267(var104, var105, field3101) - var98, client.field477 + var100, client.field477 + var101, var102, var103, var96, var99);
                    var108.method88(var106, var107, client.method2267(var106, var107, field3101) - var99, client.field477 + var100);
                    client.field436.method3485(var108);
                }
            } else if (client.field346 == 240) {
                int var109 = client.field344.method2356();
                int var110 = client.field344.method2480();
                int var111 = (var110 >> 4 & 0x7) + field1022;
                int var112 = (var110 & 0x7) + field1023;
                int var113 = client.field344.method2324();
                if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                    class28 var114 = new class28();
                    var114.field681 = var109;
                    var114.field684 = var113;
                    if (client.field391[field3101][var111][var112] == null) {
                        client.field391[field3101][var111][var112] = new class193();
                    }
                    client.field391[field3101][var111][var112].method3485(var114);
                    client.method157(var111, var112);
                }
            }
        }
    }

    @ObfuscatedName("az.dp(Ll;ZB)V")
    public static final void method962(class4 arg0, boolean arg1) {
        int var2 = arg0.field69;
        int var3 = (int) arg0.field3043;
        arg0.method3563();
        if (arg1) {
            class167.method2153(var2);
        }
        for (class195 var4 = (class195) client.field503.method3462(); var4 != null; var4 = (class195) client.field503.method3468()) {
            if ((long) var2 == (var4.field3043 >> 48 & 0xFFFFL)) {
                var4.method3563();
            }
        }
        class167 var5 = class167.method1258(var3);
        if (var5 != null) {
            client.method1085(var5);
        }
        client.method2270();
        if (client.field461 != -1) {
            client.method657(client.field461, 1);
        }
    }

    @ObfuscatedName("as.dj(IIIILbh;Lfv;I)V")
    public static final void method979(int arg0, int arg1, int arg2, int arg3, class77 arg4, class169 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            client.method760(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = client.field574 + client.field371 & 0x7FF;
        int var8 = class89.field1542[var7];
        int var9 = class89.field1543[var7];
        int var10 = var8 * 256 / (client.field373 + 256);
        int var11 = var9 * 256 / (client.field373 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        field2187.method1652(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }
}
