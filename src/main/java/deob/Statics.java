package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class Statics {

    @ObfuscatedName("i.r")
    public static byte[][][] field100;

    @ObfuscatedName("ag.m")
    public static class142 field1026;

    @ObfuscatedName("ag.ep")
    public static int[] field1028;

    @ObfuscatedName("al.gf")
    public static class148 field1029;

    @ObfuscatedName("i.dv")
    public static int field103;

    @ObfuscatedName("al.k")
    public static int field1030;

    @ObfuscatedName("al.m")
    public static class142 field1031;

    @ObfuscatedName("al.d")
    public static class148 field1034;

    @ObfuscatedName("al.go")
    public static class148 field1035;

    @ObfuscatedName("al.al")
    public static class71[] field1036;

    @ObfuscatedName("ac.m")
    public static class44 field1040;

    @ObfuscatedName("ax.r")
    public static int field1047;

    @ObfuscatedName("ax.i")
    public static class63 field1054;

    @ObfuscatedName("ax.y")
    public static int field1056;

    @ObfuscatedName("ax.g")
    public static boolean field1062;

    @ObfuscatedName("ax.ar")
    public static boolean field1067;

    @ObfuscatedName("f.ip")
    public static int field108;

    @ObfuscatedName("at.as")
    public static class143 field1085;

    @ObfuscatedName("at.ag")
    public static class69[] field1087;

    @ObfuscatedName("ba.a")
    public static float field1113;

    @ObfuscatedName("ba.w")
    public static int field1114;

    @ObfuscatedName("bi.t")
    public static boolean[] field1139;

    @ObfuscatedName("bi.d")
    public static int[] field1145;

    @ObfuscatedName("bi.u")
    public static int[] field1147;

    @ObfuscatedName("br.ay")
    public static float[] field1158;

    @ObfuscatedName("br.a")
    public static int field1160;

    @ObfuscatedName("br.f")
    public static byte[] field1164;

    @ObfuscatedName("br.j")
    public static class58[] field1165;

    @ObfuscatedName("br.w")
    public static int field1166;

    @ObfuscatedName("br.u")
    public static int field1167;

    @ObfuscatedName("br.d")
    public static int field1168;

    @ObfuscatedName("br.t")
    public static class64[] field1169;

    @ObfuscatedName("f.ec")
    public static class71[] field117;

    @ObfuscatedName("br.e")
    public static float[] field1170;

    @ObfuscatedName("br.q")
    public static class51[] field1171;

    @ObfuscatedName("br.p")
    public static class59[] field1172;

    @ObfuscatedName("br.v")
    public static boolean[] field1173;

    @ObfuscatedName("br.n")
    public static int[] field1174;

    @ObfuscatedName("br.x")
    public static float[] field1179;

    @ObfuscatedName("br.h")
    public static float[] field1180;

    @ObfuscatedName("br.z")
    public static float[] field1183;

    @ObfuscatedName("br.az")
    public static float[] field1184;

    @ObfuscatedName("br.ah")
    public static int[] field1186;

    @ObfuscatedName("br.av")
    public static float[] field1187;

    @ObfuscatedName("br.ao")
    public static int[] field1188;

    @ObfuscatedName("bp.es")
    public static class71 field1221;

    @ObfuscatedName("be.k")
    public static int field1236;

    @ObfuscatedName("be.bv")
    public static class143 field1237;

    @ObfuscatedName("be.a")
    public static short[][] field1239;

    @ObfuscatedName("bj.t")
    public static int[] field1242;

    @ObfuscatedName("bj.mm")
    public static byte field1243;

    @ObfuscatedName("bx.a")
    public static int[] field1247;

    @ObfuscatedName("bx.br")
    public static class143 field1248;

    @ObfuscatedName("bx.g")
    public static int[] field1249;

    @ObfuscatedName("bx.r")
    public static int[] field1250;

    @ObfuscatedName("bx.y")
    public static int field1251;

    @ObfuscatedName("bx.w")
    public static byte[][] field1252;

    @ObfuscatedName("bx.m")
    public static int field1253;

    @ObfuscatedName("bx.b")
    public static class104 field1255;

    @ObfuscatedName("bc.p")
    public static int field1276;

    @ObfuscatedName("bc.q")
    public static int field1277;

    @ObfuscatedName("bc.j")
    public static int[] field1278;

    @ObfuscatedName("bh.p")
    public static int[] field1306;

    @ObfuscatedName("bs.nz")
    public static int field1307;

    @ObfuscatedName("bs.mo")
    public static class20[] field1311;

    @ObfuscatedName("bf.br")
    public static int field1318;

    @ObfuscatedName("a.or")
    public static class141 field132;

    @ObfuscatedName("bf.b")
    public static int field1327;

    @ObfuscatedName("a.nn")
    public static int field133;

    @ObfuscatedName("bf.l")
    public static int field1335;

    @ObfuscatedName("bf.c")
    public static int field1336;

    @ObfuscatedName("bf.bd")
    public static int field1337;

    @ObfuscatedName("bf.o")
    public static int field1339;

    @ObfuscatedName("bf.h")
    public static int field1340;

    @ObfuscatedName("bf.x")
    public static int field1341;

    @ObfuscatedName("bf.z")
    public static int field1343;

    @ObfuscatedName("bf.ay")
    public static int field1346;

    @ObfuscatedName("bf.ah")
    public static int field1347;

    @ObfuscatedName("a.p")
    public static int[] field135;

    @ObfuscatedName("bf.ao")
    public static int field1353;

    @ObfuscatedName("bf.s")
    public static int field1356;

    @ObfuscatedName("a.y")
    public static int[] field136;

    @ObfuscatedName("bf.bi")
    public static int field1366;

    @ObfuscatedName("bf.e")
    public static int field1368;

    @ObfuscatedName("bf.av")
    public static int field1369;

    @ObfuscatedName("a.ac")
    public static class71[] field137;

    @ObfuscatedName("bf.bm")
    public static boolean[][] field1374;

    @ObfuscatedName("bf.az")
    public static int field1375;

    @ObfuscatedName("bf.bt")
    public static int field1377;

    @ObfuscatedName("bf.bq")
    public static int field1379;

    @ObfuscatedName("bf.bp")
    public static int field1380;

    @ObfuscatedName("bl.ak")
    public static class71 field1386;

    @ObfuscatedName("bl.fd")
    public static int field1389;

    @ObfuscatedName("bl.er")
    public static class69[] field1396;

    @ObfuscatedName("a.ds")
    public static int[] field140;

    @ObfuscatedName("cc.ea")
    public static class71[] field1416;

    @ObfuscatedName("ce.k")
    public static class142 field1421;

    @ObfuscatedName("cq.x")
    public static int field1425;

    @ObfuscatedName("cq.d")
    public static int field1435;

    @ObfuscatedName("cq.t")
    public static int field1436;

    @ObfuscatedName("cq.s")
    public static int field1438;

    @ObfuscatedName("cq.b")
    public static int field1439;

    @ObfuscatedName("cq.h")
    public static int field1440;

    @ObfuscatedName("cq.o")
    public static int field1441;

    @ObfuscatedName("cq.e")
    public static int field1442;

    @ObfuscatedName("cq.av")
    public static class82 field1445;

    @ObfuscatedName("cg.d")
    public static int[] field1456;

    @ObfuscatedName("ch.v")
    public static int[] field1483;

    @ObfuscatedName("ch.ed")
    public static int[] field1485;

    @ObfuscatedName("ch.b")
    public static String field1486;

    @ObfuscatedName("cs.r")
    public static class142 field1497;

    @ObfuscatedName("w.a")
    public static class71[] field153;

    @ObfuscatedName("w.mq")
    public static byte field155;

    @ObfuscatedName("co.py")
    public static boolean field1607;

    @ObfuscatedName("co.cm")
    public static char field1621;

    @ObfuscatedName("ct.en")
    public static int[] field1630;

    @ObfuscatedName("ct.w")
    public static short[] field1631;

    @ObfuscatedName("ct.cr")
    public static int field1632;

    @ObfuscatedName("ca.f")
    public static int field1638;

    @ObfuscatedName("ca.fa")
    public static int field1640;

    @ObfuscatedName("cv.bb")
    public static int field1643;

    @ObfuscatedName("cl.bw")
    public static int field1677;

    @ObfuscatedName("k.iq")
    public static class25 field17;

    @ObfuscatedName("u.ku")
    public static int field170;

    @ObfuscatedName("d.cl")
    public static class183 field171;

    @ObfuscatedName("cl.ba")
    public static int field1715;

    @ObfuscatedName("cl.bk")
    public static int field1716;

    @ObfuscatedName("d.cn")
    public static int field172;

    @ObfuscatedName("cw.ax")
    public static class143 field1729;

    @ObfuscatedName("cw.y")
    public static class142 field1736;

    @ObfuscatedName("d.eu")
    public static class71[] field174;

    @ObfuscatedName("d.j")
    public static int[] field176;

    @ObfuscatedName("cx.ix")
    public static int field1775;

    @ObfuscatedName("d.ia")
    public static class148 field178;

    @ObfuscatedName("cn.m")
    public static long field1786;

    @ObfuscatedName("cn.k")
    public static long field1788;

    @ObfuscatedName("cy.k")
    public static class142 field1792;

    @ObfuscatedName("cy.hy")
    public static int field1795;

    @ObfuscatedName("di.pu")
    public static int field1815;

    @ObfuscatedName("d.i")
    public static class142 field183;

    @ObfuscatedName("db.bq")
    public static class143 field1837;

    @ObfuscatedName("d.d")
    public static class180 field184;

    @ObfuscatedName("df.f")
    public static short[] field1843;

    @ObfuscatedName("ds.ez")
    public static int[] field1845;

    @ObfuscatedName("ds.nb")
    public static int field1846;

    @ObfuscatedName("ds.pb")
    public static String field1847;

    @ObfuscatedName("dk.v")
    public static String[] field1855;

    @ObfuscatedName("dk.p")
    public static String field1856;

    @ObfuscatedName("dk.oa")
    public static class9 field1858;

    @ObfuscatedName("dn.nf")
    public static int field1862;

    @ObfuscatedName("dx.eb")
    public static class69[] field1869;

    @ObfuscatedName("d.l")
    public static int[] field187;

    @ObfuscatedName("dx.pz")
    public static class117 field1871;

    @ObfuscatedName("dl.k")
    public static File field1894;

    @ObfuscatedName("dv.dl")
    public static int field1899;

    @ObfuscatedName("dv.k")
    public static String field1900;

    @ObfuscatedName("dv.m")
    public static String field1901;

    @ObfuscatedName("dv.q")
    public static class147 field1911;

    @ObfuscatedName("dv.o")
    public static String field1912;

    @ObfuscatedName("t.ic")
    public static int field192;

    @ObfuscatedName("dg.pe")
    public static Image field1920;

    @ObfuscatedName("t.b")
    public static class11 field193;

    @ObfuscatedName("t.aa")
    public static class16 field194;

    @ObfuscatedName("dg.kb")
    public static class115 field1944;

    @ObfuscatedName("dg.oh")
    public static class120 field1949;

    @ObfuscatedName("dr.na")
    public static class47 field1950;

    @ObfuscatedName("dr.q")
    public static int[] field1951;

    @ObfuscatedName("dr.ii")
    public static class148 field1954;

    @ObfuscatedName("dr.i")
    public static class142 field1956;

    @ObfuscatedName("t.ih")
    public static int field196;

    @ObfuscatedName("dy.nr")
    public static class46 field1962;

    @ObfuscatedName("de.gd")
    public static class148 field1989;

    @ObfuscatedName("de.om")
    public static class118 field1992;

    @ObfuscatedName("dd.bw")
    public static class143 field1996;

    @ObfuscatedName("dc.bm")
    public static class143 field2014;

    @ObfuscatedName("dq.nl")
    public static int field2019;

    @ObfuscatedName("ev.cc")
    public static class130 field2043;

    @ObfuscatedName("ev.y")
    public static int field2045;

    @ObfuscatedName("ev.k")
    public static String field2048;

    @ObfuscatedName("j.ak")
    public static long field205;

    @ObfuscatedName("ev.fi")
    public static int field2051;

    @ObfuscatedName("ev.m")
    public static Applet field2052;

    @ObfuscatedName("ex.u")
    public static int field2056;

    @ObfuscatedName("ex.r")
    public static File field2057;

    @ObfuscatedName("ex.g")
    public static File field2058;

    @ObfuscatedName("ex.i")
    public static int field2061;

    @ObfuscatedName("ex.p")
    public static int field2065;

    @ObfuscatedName("ex.n")
    public static String[] field2066;

    @ObfuscatedName("ex.hf")
    public static int field2069;

    @ObfuscatedName("ex.s")
    public static String field2070;

    @ObfuscatedName("ei.at")
    public static class143 field2076;

    @ObfuscatedName("j.dk")
    public static int[] field208;

    @ObfuscatedName("eh.u")
    public static short[][] field2081;

    @ObfuscatedName("k.ag")
    public static class130 field21;

    @ObfuscatedName("eb.f")
    public static class71 field2105;

    @ObfuscatedName("et.cz")
    public static int field2115;

    @ObfuscatedName("q.pw")
    public static Font field222;

    @ObfuscatedName("p.fo")
    public static int field223;

    @ObfuscatedName("ee.a")
    public static int field2366;

    @ObfuscatedName("ee.fq")
    public static int field2369;

    @ObfuscatedName("eo.cu")
    public static int field2437;

    @ObfuscatedName("eo.pk")
    public static int field2440;

    @ObfuscatedName("ec.m")
    public static class127 field2456;

    @ObfuscatedName("ec.j")
    public static boolean field2457;

    @ObfuscatedName("ec.y")
    public static long field2462;

    @ObfuscatedName("client.k")
    public static client field247;

    @ObfuscatedName("en.k")
    public static boolean[] field2470;

    @ObfuscatedName("client.f")
    public static class135 field251;

    @ObfuscatedName("en.m")
    public static class148[][] field2524;

    @ObfuscatedName("client.u")
    public static class136 field253;

    @ObfuscatedName("en.f")
    public static class142 field2570;

    @ObfuscatedName("ed.ei")
    public static class69 field2601;

    @ObfuscatedName("ez.pq")
    public static class68 field2608;

    @ObfuscatedName("ez.g")
    public static class71[] field2609;

    @ObfuscatedName("ez.bf")
    public static FontMetrics field2615;

    @ObfuscatedName("em.aq")
    public static class130 field2623;

    @ObfuscatedName("em.mx")
    public static class69 field2627;

    @ObfuscatedName("ff.w")
    public static int field2657;

    @ObfuscatedName("ff.y")
    public static class142 field2658;

    @ObfuscatedName("ff.m")
    public static class142 field2659;

    @ObfuscatedName("ff.d")
    public static boolean field2662;

    @ObfuscatedName("ff.g")
    public static class158 field2665;

    @ObfuscatedName("k.np")
    public static class65 field27;

    @ObfuscatedName("fh.al")
    public static class127 field2766;

    @ObfuscatedName("fe.x")
    public static int[] field2817;

    @ObfuscatedName("fg.m")
    public static class99 field2839;

    @ObfuscatedName("fg.dw")
    public static int[][] field2840;

    @ObfuscatedName("fp.u")
    public static class71[] field2853;

    @ObfuscatedName("ge.nd")
    public static int field2869;

    @ObfuscatedName("gp.cw")
    public static class183 field2871;

    @ObfuscatedName("ga.r")
    public static class69 field2905;

    @ObfuscatedName("ga.t")
    public static class154 field2907;

    @ObfuscatedName("gu.ce")
    public static class127 field2909;

    @ObfuscatedName("m.aw")
    public static class143 field3;

    @ObfuscatedName("m.ew")
    public static class69[] field4;

    @ObfuscatedName("client.ms")
    public static int field418;

    @ObfuscatedName("client.ab")
    public static class143 field462;

    @ObfuscatedName("client.ey")
    public static class69[] field509;

    @ObfuscatedName("y.po")
    public static Frame field51;

    @ObfuscatedName("n.nw")
    public static int field511;

    @ObfuscatedName("n.ab")
    public static class21[] field515;

    @ObfuscatedName("n.cv")
    public static class183 field517;

    @ObfuscatedName("l.bu")
    public static int field528;

    @ObfuscatedName("l.eh")
    public static class69 field529;

    @ObfuscatedName("c.ap")
    public static class71[] field545;

    @ObfuscatedName("c.oy")
    public static Clipboard field551;

    @ObfuscatedName("c.cf")
    public static int field557;

    @ObfuscatedName("g.bk")
    public static class143 field56;

    @ObfuscatedName("b.cq")
    public static class127 field565;

    @ObfuscatedName("s.pd")
    public static int field571;

    @ObfuscatedName("s.oc")
    public static int field575;

    @ObfuscatedName("s.ek")
    public static class69[] field576;

    @ObfuscatedName("g.bd")
    public static class143 field58;

    @ObfuscatedName("o.q")
    public static class186[] field583;

    @ObfuscatedName("g.kh")
    public static class148[] field59;

    @ObfuscatedName("o.pa")
    public static Canvas field591;

    @ObfuscatedName("z.m")
    public static boolean field627;

    @ObfuscatedName("z.y")
    public static class71 field628;

    @ObfuscatedName("z.ns")
    public static int field629;

    @ObfuscatedName("z.i")
    public static class69 field630;

    @ObfuscatedName("z.o")
    public static int[] field637;

    @ObfuscatedName("z.h")
    public static int[] field638;

    @ObfuscatedName("g.e")
    public static int[] field64;

    @ObfuscatedName("z.k")
    public static class71 field654;

    @ObfuscatedName("z.ae")
    public static class143 field658;

    @ObfuscatedName("g.nt")
    public static int field66;

    @ObfuscatedName("az.df")
    public static int[] field661;

    @ObfuscatedName("az.ly")
    public static class114 field667;

    @ObfuscatedName("az.j")
    public static class50 field668;

    @ObfuscatedName("r.bi")
    public static class143 field67;

    @ObfuscatedName("av.g")
    public static String[] field672;

    @ObfuscatedName("av.iz")
    public static int field673;

    @ObfuscatedName("av.kt")
    public static int field676;

    @ObfuscatedName("ay.n")
    public static int[] field685;

    @ObfuscatedName("ay.t")
    public static class148 field688;

    @ObfuscatedName("r.et")
    public static class69[] field71;

    @ObfuscatedName("r.kn")
    public static int field72;

    @ObfuscatedName("ah.ij")
    public static int field735;

    @ObfuscatedName("r.pp")
    public static int field74;

    @ObfuscatedName("r.g")
    public static class142 field75;

    @ObfuscatedName("aj.m")
    public static class142 field787;

    @ObfuscatedName("ad.k")
    public static class142 field798;

    @ObfuscatedName("ad.y")
    public static class142 field799;

    @ObfuscatedName("i.i")
    public static byte[][][] field80;

    @ObfuscatedName("ad.ba")
    public static class143 field802;

    @ObfuscatedName("i.u")
    public static int[] field81;

    @ObfuscatedName("i.g")
    public static byte[][][] field82;

    @ObfuscatedName("ad.ft")
    public static int field837;

    @ObfuscatedName("ad.he")
    public static int field848;

    @ObfuscatedName("i.f")
    public static byte[][][] field85;

    @ObfuscatedName("ai.bz")
    public static String field853;

    @ObfuscatedName("ai.m")
    public static class142 field854;

    @ObfuscatedName("i.a")
    public static byte[][][] field86;

    @ObfuscatedName("ai.v")
    public static class104 field861;

    @ObfuscatedName("ai.bc")
    public static int field865;

    @ObfuscatedName("af.k")
    public static class142 field867;

    @ObfuscatedName("i.w")
    public static int[][] field87;

    @ObfuscatedName("af.dx")
    public static class76 field878;

    @ObfuscatedName("af.m")
    public static class142 field881;

    @ObfuscatedName("af.eo")
    public static class69[] field886;

    @ObfuscatedName("am.k")
    public static class142 field888;

    @ObfuscatedName("i.p")
    public static int[][][] field89;

    @ObfuscatedName("am.bt")
    public static class143 field904;

    @ObfuscatedName("am.m")
    public static class142 field907;

    @ObfuscatedName("aq.m")
    public static class142 field909;

    @ObfuscatedName("aq.k")
    public static class142 field910;

    @ObfuscatedName("aq.y")
    public static int field911;

    @ObfuscatedName("aq.dn")
    public static byte[][] field917;

    @ObfuscatedName("aq.s")
    public static int[] field921;

    @ObfuscatedName("ar.m")
    public static class142 field942;

    @ObfuscatedName("ar.hv")
    public static class3 field944;

    @ObfuscatedName("an.m")
    public static class142 field945;

    @ObfuscatedName("an.ng")
    public static class47 field946;

    @ObfuscatedName("an.f")
    public static int[] field950;

    @ObfuscatedName("an.id")
    public static int field952;

    @ObfuscatedName("an.nm")
    public static int field953;

    @ObfuscatedName("au.m")
    public static class142 field963;

    @ObfuscatedName("aa.m")
    public static class142 field971;

    @ObfuscatedName("aa.i")
    public static int[] field972;

    @ObfuscatedName("aa.ee")
    public static class69[] field973;

    @ObfuscatedName("ag.k")
    public static class142 field978;

    @ObfuscatedName("i.fn")
    public static int field98;

    @ObfuscatedName("ag.f")
    public static class183 field983;

    @ObfuscatedName("ag.y")
    public static boolean field993;

    @ObfuscatedName("ag.dp")
    public static byte[][] field998;

    @ObfuscatedName("z.m(II)Ljava/lang/String;")
    public static String method548(int arg0) {
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @ObfuscatedName("bl.m(I)Ldx;")
    public static class115 method1758() {
        try {
            return new class129();
        } catch (Throwable var1) {
            return null;
        }
    }

    @ObfuscatedName("dq.m(III)I")
    public static int method2625(int arg0, int arg1) {
        class13 var2 = (class13) class13.field207.method3159((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field204.length; var4++) {
                if (var2.field203[var4] == arg1) {
                    var3 += var2.field204[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("o.m(Lek;S)V")
    public static void method510(class142 arg0) {
        field1031 = arg0;
        field1030 = field1031.method2705(16);
    }

    @ObfuscatedName("by.m(Ljava/awt/Component;B)V")
    public static void method1580(Component arg0) {
        arg0.removeMouseListener(class124.field1964);
        arg0.removeMouseMotionListener(class124.field1964);
        arg0.removeFocusListener(class124.field1964);
        class124.field1965 = 0;
    }

    @ObfuscatedName("eo.k(I)I")
    public static int method2797() {
        return ++class124.field1967 - 1;
    }

    @ObfuscatedName("cs.r(Ljava/lang/CharSequence;IZS)I")
    public static int method1864(CharSequence arg0, int arg1, boolean arg2) {
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("");
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        int var6 = arg0.length();
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(var7);
            if (var7 == 0) {
                if (var8 == '-') {
                    var3 = true;
                    continue;
                }
                if (var8 == '+' && arg2) {
                    continue;
                }
            }
            int var10;
            if (var8 >= '0' && var8 <= '9') {
                var10 = var8 - '0';
            } else if (var8 >= 'A' && var8 <= 'Z') {
                var10 = var8 - '7';
            } else if (var8 >= 'a' && var8 <= 'z') {
                var10 = var8 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var10 >= arg1) {
                throw new NumberFormatException();
            }
            if (var3) {
                var10 = -var10;
            }
            int var9 = arg1 * var5 + var10;
            if (var9 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var5 = var9;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @ObfuscatedName("d.g(Ljava/lang/String;IB)Z")
    public static boolean method131(String arg0, int arg1) {
        return class122.method1970(arg0, arg1, "openjs");
    }

    @ObfuscatedName("u.m(I)V")
    public static void method121() {
        class6.field79 = 99;
        field82 = new byte[4][104][104];
        field100 = new byte[4][104][104];
        field80 = new byte[4][104][104];
        field85 = new byte[4][104][104];
        field89 = new int[4][105][105];
        field86 = new byte[4][105][105];
        field87 = new int[105][105];
        field81 = new int[104];
        field1456 = new int[104];
        field1242 = new int[104];
        field176 = new int[104];
        field1951 = new int[104];
    }

    @ObfuscatedName("ax.y(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static String method999(Throwable arg0) throws IOException {
        String var2;
        if (arg0 instanceof class132) {
            class132 var1 = (class132) arg0;
            var2 = var1.field2046 + " | ";
            arg0 = var1.field2047;
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

    @ObfuscatedName("o.u(CII)Ljava/lang/String;")
    public static String method509(char arg0, int arg1) {
        char[] var2 = new char[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            var2[var3] = arg0;
        }
        return new String(var2);
    }

    @ObfuscatedName("bj.i([BIII)Ljava/lang/String;")
    public static String method1356(byte[] arg0, int arg1, int arg2) {
        char[] var3 = new char[arg2];
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var6 = arg0[arg1 + var5] & 0xFF;
            if (var6 != 0) {
                if (var6 >= 128 && var6 < 160) {
                    char var7 = class191.field2911[var6 - 128];
                    if (var7 == 0) {
                        var7 = '?';
                    }
                    var6 = var7;
                }
                var3[var4++] = (char) var6;
            }
        }
        return new String(var3, 0, var4);
    }

    @ObfuscatedName("dg.g(IIIB)V")
    public static final void method2507(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                class6.field97[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class6.field97[arg0][arg1][arg2 + var5] = class6.field97[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class6.field97[arg0][arg1 + var6][arg2] = class6.field97[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && class6.field97[arg0][arg1 - 1][arg2] != 0) {
            class6.field97[arg0][arg1][arg2] = class6.field97[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && class6.field97[arg0][arg1][arg2 - 1] != 0) {
            class6.field97[arg0][arg1][arg2] = class6.field97[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && class6.field97[arg0][arg1 - 1][arg2 - 1] != 0) {
            class6.field97[arg0][arg1][arg2] = class6.field97[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("cr.a(IIIIIILbf;Lgk;I)V")
    public static final void method1870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class76 arg6, class187 arg7) {
        if (client.field458 && (class6.field93[0][arg1][arg2] & 0x2) == 0) {
            if ((class6.field93[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            if (class6.method577(arg0, arg1, arg2) != client.field301) {
                return;
            }
        }
        if (arg0 < class6.field79) {
            class6.field79 = arg0;
        }
        class33 var8 = class33.method13(arg3);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var9 = var8.field816;
            var10 = var8.field813;
        } else {
            var9 = var8.field813;
            var10 = var8.field816;
        }
        int var11;
        int var12;
        if (arg1 + var9 <= 104) {
            var11 = (var9 >> 1) + arg1;
            var12 = (var9 + 1 >> 1) + arg1;
        } else {
            var11 = arg1;
            var12 = arg1 + 1;
        }
        int var13;
        int var14;
        if (arg2 + var10 <= 104) {
            var13 = (var10 >> 1) + arg2;
            var14 = (var10 + 1 >> 1) + arg2;
        } else {
            var13 = arg2;
            var14 = arg2 + 1;
        }
        int[][] var15 = class6.field97[arg0];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
        int var17 = (arg1 << 7) + (var9 << 6);
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var8.field801 == 0) {
            var19 -= Integer.MIN_VALUE;
        }
        int var20 = (arg4 << 6) + arg5;
        if (var8.field838 == 1) {
            var20 += 256;
        }
        if (var8.method622()) {
            class19.method2080(arg0, arg1, arg2, var8, arg4);
        }
        if (arg5 == 22) {
            if (!client.field458 || var8.field801 != 0 || var8.field803 == 1 || var8.field836) {
                class75 var21;
                if (var8.field821 == -1 && var8.field839 == null) {
                    var21 = var8.method639(22, arg4, var15, var17, var16, var18);
                } else {
                    var21 = new class10(arg3, 22, arg4, arg0, arg1, arg2, var8.field821, true, (class75) null);
                }
                arg6.method1754(arg0, arg1, arg2, var16, var21, var19, var20);
                if (var8.field803 == 1 && arg7 != null) {
                    arg7.method3417(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class75 var44;
            if (var8.field821 == -1 && var8.field839 == null) {
                var44 = var8.method639(10, arg4, var15, var17, var16, var18);
            } else {
                var44 = new class10(arg3, 10, arg4, arg0, arg1, arg2, var8.field821, true, (class75) null);
            }
            if (var44 != null && arg6.method1597(arg0, arg1, arg2, var16, var9, var10, var44, arg5 == 11 ? 256 : 0, var19, var20) && var8.field851) {
                int var45 = 15;
                if (var44 instanceof class95) {
                    var45 = ((class95) var44).method1977() / 4;
                    if (var45 > 30) {
                        var45 = 30;
                    }
                }
                for (int var46 = 0; var46 <= var9; var46++) {
                    for (int var47 = 0; var47 <= var10; var47++) {
                        if (var45 > field86[arg0][arg1 + var46][arg2 + var47]) {
                            field86[arg0][arg1 + var46][arg2 + var47] = (byte) var45;
                        }
                    }
                }
            }
            if (var8.field803 != 0 && arg7 != null) {
                arg7.method3401(arg1, arg2, var9, var10, var8.field852);
            }
        } else if (arg5 >= 12) {
            class75 var22;
            if (var8.field821 == -1 && var8.field839 == null) {
                var22 = var8.method639(arg5, arg4, var15, var17, var16, var18);
            } else {
                var22 = new class10(arg3, arg5, arg4, arg0, arg1, arg2, var8.field821, true, (class75) null);
            }
            arg6.method1597(arg0, arg1, arg2, var16, 1, 1, var22, 0, var19, var20);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                field89[arg0][arg1][arg2] |= 0x924;
            }
            if (var8.field803 != 0 && arg7 != null) {
                arg7.method3401(arg1, arg2, var9, var10, var8.field852);
            }
        } else if (arg5 == 0) {
            class75 var23;
            if (var8.field821 == -1 && var8.field839 == null) {
                var23 = var8.method639(0, arg4, var15, var17, var16, var18);
            } else {
                var23 = new class10(arg3, 0, arg4, arg0, arg1, arg2, var8.field821, true, (class75) null);
            }
            arg6.method1595(arg0, arg1, arg2, var16, var23, (class75) null, class6.field88[arg4], 0, var19, var20);
            if (arg4 == 0) {
                if (var8.field851) {
                    field86[arg0][arg1][arg2] = 50;
                    field86[arg0][arg1][arg2 + 1] = 50;
                }
                if (var8.field846) {
                    field89[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var8.field851) {
                    field86[arg0][arg1][arg2 + 1] = 50;
                    field86[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field846) {
                    field89[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var8.field851) {
                    field86[arg0][arg1 + 1][arg2] = 50;
                    field86[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var8.field846) {
                    field89[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var8.field851) {
                    field86[arg0][arg1][arg2] = 50;
                    field86[arg0][arg1 + 1][arg2] = 50;
                }
                if (var8.field846) {
                    field89[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var8.field803 != 0 && arg7 != null) {
                arg7.method3400(arg1, arg2, arg5, arg4, var8.field852);
            }
            if (var8.field822 != 16) {
                arg6.method1603(arg0, arg1, arg2, var8.field822);
            }
        } else if (arg5 == 1) {
            class75 var24;
            if (var8.field821 == -1 && var8.field839 == null) {
                var24 = var8.method639(1, arg4, var15, var17, var16, var18);
            } else {
                var24 = new class10(arg3, 1, arg4, arg0, arg1, arg2, var8.field821, true, (class75) null);
            }
            arg6.method1595(arg0, arg1, arg2, var16, var24, (class75) null, class6.field92[arg4], 0, var19, var20);
            if (var8.field851) {
                if (arg4 == 0) {
                    field86[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    field86[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    field86[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    field86[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field803 != 0 && arg7 != null) {
                arg7.method3400(arg1, arg2, arg5, arg4, var8.field852);
            }
        } else if (arg5 == 2) {
            int var25 = arg4 + 1 & 0x3;
            class75 var26;
            class75 var27;
            if (var8.field821 == -1 && var8.field839 == null) {
                var26 = var8.method639(2, arg4 + 4, var15, var17, var16, var18);
                var27 = var8.method639(2, var25, var15, var17, var16, var18);
            } else {
                var26 = new class10(arg3, 2, arg4 + 4, arg0, arg1, arg2, var8.field821, true, (class75) null);
                var27 = new class10(arg3, 2, var25, arg0, arg1, arg2, var8.field821, true, (class75) null);
            }
            arg6.method1595(arg0, arg1, arg2, var16, var26, var27, class6.field88[arg4], class6.field88[var25], var19, var20);
            if (var8.field846) {
                if (arg4 == 0) {
                    field89[arg0][arg1][arg2] |= 0x249;
                    field89[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    field89[arg0][arg1][arg2 + 1] |= 0x492;
                    field89[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    field89[arg0][arg1 + 1][arg2] |= 0x249;
                    field89[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    field89[arg0][arg1][arg2] |= 0x492;
                    field89[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var8.field803 != 0 && arg7 != null) {
                arg7.method3400(arg1, arg2, arg5, arg4, var8.field852);
            }
            if (var8.field822 != 16) {
                arg6.method1603(arg0, arg1, arg2, var8.field822);
            }
        } else if (arg5 == 3) {
            class75 var28;
            if (var8.field821 == -1 && var8.field839 == null) {
                var28 = var8.method639(3, arg4, var15, var17, var16, var18);
            } else {
                var28 = new class10(arg3, 3, arg4, arg0, arg1, arg2, var8.field821, true, (class75) null);
            }
            arg6.method1595(arg0, arg1, arg2, var16, var28, (class75) null, class6.field92[arg4], 0, var19, var20);
            if (var8.field851) {
                if (arg4 == 0) {
                    field86[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    field86[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    field86[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    field86[arg0][arg1][arg2] = 50;
                }
            }
            if (var8.field803 != 0 && arg7 != null) {
                arg7.method3400(arg1, arg2, arg5, arg4, var8.field852);
            }
        } else if (arg5 == 9) {
            class75 var29;
            if (var8.field821 == -1 && var8.field839 == null) {
                var29 = var8.method639(arg5, arg4, var15, var17, var16, var18);
            } else {
                var29 = new class10(arg3, arg5, arg4, arg0, arg1, arg2, var8.field821, true, (class75) null);
            }
            arg6.method1597(arg0, arg1, arg2, var16, 1, 1, var29, 0, var19, var20);
            if (var8.field803 != 0 && arg7 != null) {
                arg7.method3401(arg1, arg2, var9, var10, var8.field852);
            }
            if (var8.field822 != 16) {
                arg6.method1603(arg0, arg1, arg2, var8.field822);
            }
        } else if (arg5 == 4) {
            class75 var30;
            if (var8.field821 == -1 && var8.field839 == null) {
                var30 = var8.method639(4, arg4, var15, var17, var16, var18);
            } else {
                var30 = new class10(arg3, 4, arg4, arg0, arg1, arg2, var8.field821, true, (class75) null);
            }
            arg6.method1638(arg0, arg1, arg2, var16, var30, (class75) null, class6.field88[arg4], 0, 0, 0, var19, var20);
        } else if (arg5 == 5) {
            int var31 = 16;
            int var32 = arg6.method1655(arg0, arg1, arg2);
            if (var32 != 0) {
                var31 = class33.method13(var32 >> 14 & 0x7FFF).field822;
            }
            class75 var33;
            if (var8.field821 == -1 && var8.field839 == null) {
                var33 = var8.method639(4, arg4, var15, var17, var16, var18);
            } else {
                var33 = new class10(arg3, 4, arg4, arg0, arg1, arg2, var8.field821, true, (class75) null);
            }
            arg6.method1638(arg0, arg1, arg2, var16, var33, (class75) null, class6.field88[arg4], 0, class6.field83[arg4] * var31, class6.field94[arg4] * var31, var19, var20);
        } else if (arg5 == 6) {
            int var34 = 8;
            int var35 = arg6.method1655(arg0, arg1, arg2);
            if (var35 != 0) {
                var34 = class33.method13(var35 >> 14 & 0x7FFF).field822 / 2;
            }
            class75 var36;
            if (var8.field821 == -1 && var8.field839 == null) {
                var36 = var8.method639(4, arg4 + 4, var15, var17, var16, var18);
            } else {
                var36 = new class10(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field821, true, (class75) null);
            }
            arg6.method1638(arg0, arg1, arg2, var16, var36, (class75) null, 256, arg4, class6.field95[arg4] * var34, class6.field96[arg4] * var34, var19, var20);
        } else if (arg5 == 7) {
            int var37 = arg4 + 2 & 0x3;
            class75 var38;
            if (var8.field821 == -1 && var8.field839 == null) {
                var38 = var8.method639(4, var37 + 4, var15, var17, var16, var18);
            } else {
                var38 = new class10(arg3, 4, var37 + 4, arg0, arg1, arg2, var8.field821, true, (class75) null);
            }
            arg6.method1638(arg0, arg1, arg2, var16, var38, (class75) null, 256, var37, 0, 0, var19, var20);
        } else if (arg5 == 8) {
            int var39 = 8;
            int var40 = arg6.method1655(arg0, arg1, arg2);
            if (var40 != 0) {
                var39 = class33.method13(var40 >> 14 & 0x7FFF).field822 / 2;
            }
            int var41 = arg4 + 2 & 0x3;
            class75 var42;
            class75 var43;
            if (var8.field821 == -1 && var8.field839 == null) {
                var42 = var8.method639(4, arg4 + 4, var15, var17, var16, var18);
                var43 = var8.method639(4, var41 + 4, var15, var17, var16, var18);
            } else {
                var42 = new class10(arg3, 4, arg4 + 4, arg0, arg1, arg2, var8.field821, true, (class75) null);
                var43 = new class10(arg3, 4, var41 + 4, arg0, arg1, arg2, var8.field821, true, (class75) null);
            }
            arg6.method1638(arg0, arg1, arg2, var16, var42, var43, 256, arg4, class6.field95[arg4] * var39, class6.field96[arg4] * var39, var19, var20);
        }
    }

    @ObfuscatedName("dz.pe(I)V")
    public static final void method2452() {
        field1920 = null;
        field222 = null;
        field2615 = null;
    }

    @ObfuscatedName("db.w(B)V")
    public static void method2397() {
        try {
            if (field194 == null) {
                field194 = new class16(field1949, new URL(field1856));
            } else {
                byte[] var0 = field194.method155();
                if (var0 != null) {
                    class104 var1 = new class104(var0);
                    class26.field645 = var1.method2132();
                    field515 = new class21[class26.field645];
                    int var2 = 0;
                    while (var2 < class26.field645) {
                        class21 var3 = field515[var2] = new class21();
                        var3.field577 = var1.method2132();
                        var3.field567 = var1.method2135();
                        var3.field569 = var1.method2138();
                        var3.field570 = var1.method2138();
                        var3.field574 = var1.method2190();
                        var3.field568 = var1.method2154();
                        var3.field573 = var2++;
                    }
                    class26.method2071(field515, 0, field515.length - 1, class26.field655, class26.field656);
                    class26.field653 = true;
                    field194 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            field194 = null;
        }
    }

    @ObfuscatedName("j.aq(I)I")
    public static final int method143() {
        if (field1858.field145) {
            return field1795;
        } else {
            int var0 = client.method11(field1389, field2051, field1795);
            return var0 - field223 >= 800 || (class6.field93[field1795][field1389 >> 7][field2051 >> 7] & 0x4) == 0 ? 3 : field1795;
        }
    }

    @ObfuscatedName("b.ab(ZB)V")
    public static final void method499(boolean arg0) {
        client.method2371();
        client.field295++;
        if (client.field295 < 50 && !arg0) {
            return;
        }
        client.field295 = 0;
        if (client.field300 || field2909 == null) {
            return;
        }
        client.field289.method2372(169);
        try {
            field2909.method2564(client.field289.field1808, 0, client.field289.field1806);
            client.field289.field1806 = 0;
        } catch (IOException var2) {
            client.field300 = true;
        }
    }

    @ObfuscatedName("dc.bp(S)V")
    public static final void method2578() {
        client.method12();
        if (field1035 != null || client.field419 != null) {
            return;
        }
        int var12;
        int var13;
        label195: {
            int var0 = class124.field1972;
            if (client.field389) {
                if (var0 != 1 && (field1067 || var0 != 4)) {
                    int var1 = class124.field1969;
                    int var2 = class124.field1970;
                    if (var1 < field848 - 10 || var1 > field848 + field192 + 10 || var2 < field2069 - 10 || var2 > field2069 + field196 + 10) {
                        client.field389 = false;
                        client.method3435(field848, field2069, field192, field196);
                    }
                }
                if (var0 == 1 || !field1067 && var0 == 4) {
                    int var3 = field848;
                    int var4 = field2069;
                    int var5 = field192;
                    int var6 = class124.field1976;
                    int var7 = class124.field1977;
                    int var8 = -1;
                    for (int var9 = 0; var9 < client.field390; var9++) {
                        int var10 = (client.field390 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method607(var8);
                    }
                    client.field389 = false;
                    client.method3435(field848, field2069, field192, field196);
                }
            } else {
                if ((var0 == 1 || !field1067 && var0 == 4) && client.field390 > 0) {
                    int var11 = client.field246[client.field390 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = client.field493[client.field390 - 1];
                        var13 = client.field392[client.field390 - 1];
                        class148 var14 = class148.method1290(var13);
                        int var15 = client.method2642(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label195;
                        }
                        class152 var10000 = (class152) null;
                        if (class152.method702(client.method2642(var14))) {
                            break label195;
                        }
                    }
                }
                if ((var0 == 1 || !field1067 && var0 == 4) && (client.field388 == 1 && client.field390 > 2 || client.method2673(client.field390 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !field1067 && var0 == 4) && client.field390 > 0) {
                    method607(client.field390 - 1);
                }
                if (var0 == 2 && client.field390 > 0) {
                    client.method26(class124.field1976, class124.field1977);
                }
            }
            return;
        }
        if (field1035 != null && !client.field336 && client.field388 != 1 && !client.method2673(client.field390 - 1) && client.field390 > 0) {
            int var17 = client.field284;
            int var18 = client.field285;
            client.method3115(field17, var17, var18);
            field17 = null;
        }
        client.field336 = false;
        client.field352 = 0;
        if (field1035 != null) {
            client.method141(field1035);
        }
        field1035 = class148.method1290(var13);
        client.field359 = var12;
        client.field284 = class124.field1976;
        client.field285 = class124.field1977;
        if (client.field390 > 0) {
            int var19 = client.field390 - 1;
            field17 = new class25();
            field17.field625 = client.field493[var19];
            field17.field621 = client.field392[var19];
            field17.field616 = client.field246[var19];
            field17.field618 = client.field394[var19];
            field17.field617 = client.field395[var19];
        }
        client.method141(field1035);
    }

    @ObfuscatedName("aj.bj(IB)V")
    public static final void method607(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = client.field493[arg0];
        int var2 = client.field392[arg0];
        int var3 = client.field246[arg0];
        int var4 = client.field394[arg0];
        String var5 = client.field395[arg0];
        String var6 = client.field321[arg0];
        client.method576(var1, var2, var3, var4, var5, var6, class124.field1976, class124.field1977);
    }

    @ObfuscatedName("v.cp([Len;IIIIIIIIB)V")
    public static final void method160(class148[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class70.method1488(arg2, arg3, arg4, arg5);
        class81.method1764();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class148 var10 = arg0[var9];
            if (var10 != null && (var10.field2502 == arg1 || arg1 == -1412584499 && client.field419 == var10)) {
                int var11;
                if (arg8 == -1) {
                    client.field500[client.field449] = var10.field2482 + arg6;
                    client.field455[client.field449] = var10.field2555 + arg7;
                    client.field417[client.field449] = var10.field2485;
                    client.field457[client.field449] = var10.field2487;
                    var11 = ++client.field449 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2592 = var11;
                var10.field2469 = client.field463;
                if (!var10.field2476 || !client.method2670(var10)) {
                    if (var10.field2481 > 0) {
                        int var12 = var10.field2481;
                        if (var12 == 324) {
                            if (client.field507 == -1) {
                                client.field507 = var10.field2501;
                                client.field369 = var10.field2480;
                            }
                            if (client.field506.field2622) {
                                var10.field2501 = client.field507;
                            } else {
                                var10.field2501 = client.field369;
                            }
                        } else if (var12 == 325) {
                            if (client.field507 == -1) {
                                client.field507 = var10.field2501;
                                client.field369 = var10.field2480;
                            }
                            if (client.field506.field2622) {
                                var10.field2501 = client.field369;
                            } else {
                                var10.field2501 = client.field507;
                            }
                        } else if (var12 == 327) {
                            var10.field2489 = 150;
                            var10.field2518 = (int) (Math.sin((double) client.field463 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2509 = 5;
                            var10.field2547 = 0;
                        } else if (var12 == 328) {
                            var10.field2489 = 150;
                            var10.field2518 = (int) (Math.sin((double) client.field463 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2509 = 5;
                            var10.field2547 = 1;
                        }
                    }
                    int var13 = var10.field2482 + arg6;
                    int var14 = var10.field2555 + arg7;
                    int var15 = var10.field2499;
                    if (client.field419 == var10) {
                        if (arg1 != -1412584499 && !var10.field2542) {
                            field59 = arg0;
                            field676 = arg6;
                            field72 = arg7;
                            continue;
                        }
                        if (client.field430 && client.field424) {
                            int var16 = class124.field1969;
                            int var17 = class124.field1970;
                            int var18 = var16 - client.field448;
                            int var19 = var17 - client.field422;
                            if (var18 < client.field425) {
                                var18 = client.field425;
                            }
                            if (var10.field2485 + var18 > client.field425 + client.field420.field2485) {
                                var18 = client.field425 + client.field420.field2485 - var10.field2485;
                            }
                            if (var19 < client.field426) {
                                var19 = client.field426;
                            }
                            if (var10.field2487 + var19 > client.field426 + client.field420.field2487) {
                                var19 = client.field426 + client.field420.field2487 - var10.field2487;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2542) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2479 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2479 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2485 + var13;
                        int var27 = var10.field2487 + var14;
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
                        int var30 = var10.field2485 + var13;
                        int var31 = var10.field2487 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2476 || var20 < var22 && var21 < var23) {
                        if (var10.field2481 != 0) {
                            if (var10.field2481 == 1337) {
                                client.field353 = var13;
                                client.field436 = var14;
                                client.method135(var13, var14, var10.field2485, var10.field2487);
                                class70.method1488(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2481 == 1338) {
                                client.method2371();
                                class70.method1488(var13, var14, field1221.field1285 + var13, field1221.field1288 + var14);
                                if (client.field273 == 2 || client.field273 == 5) {
                                    class70.method1507(var13 + 25, var14 + 5, 0, field1485, field1845);
                                } else {
                                    int var32 = client.field445 + client.field306 & 0x7FF;
                                    int var33 = field944.field704 / 32 + 48;
                                    int var34 = 464 - field944.field693 / 32;
                                    field2627.method1398(var13 + 25, var14 + 5, 146, 151, var33, var34, var32, client.field320 + 256, field1485, field1845);
                                    for (int var35 = 0; var35 < client.field476; var35++) {
                                        int var36 = client.field477[var35] * 4 + 2 - field944.field704 / 32;
                                        int var37 = client.field478[var35] * 4 + 2 - field944.field693 / 32;
                                        client.method168(var13, var14, var36, var37, client.field479[var35]);
                                    }
                                    for (int var38 = 0; var38 < 104; var38++) {
                                        for (int var39 = 0; var39 < 104; var39++) {
                                            class171 var40 = client.field381[field1795][var38][var39];
                                            if (var40 != null) {
                                                int var41 = var38 * 4 + 2 - field944.field704 / 32;
                                                int var42 = var39 * 4 + 2 - field944.field693 / 32;
                                                client.method168(var13, var14, var41, var42, field886[0]);
                                            }
                                        }
                                    }
                                    for (int var43 = 0; var43 < client.field287; var43++) {
                                        class28 var44 = client.field410[client.field288[var43]];
                                        if (var44 != null && var44.method18()) {
                                            class32 var45 = var44.field674;
                                            if (var45 != null && var45.field774 != null) {
                                                var45 = var45.method579();
                                            }
                                            if (var45 != null && var45.field785 && var45.field760) {
                                                int var46 = var44.field704 / 32 - field944.field704 / 32;
                                                int var47 = var44.field693 / 32 - field944.field693 / 32;
                                                client.method168(var13, var14, var46, var47, field886[1]);
                                            }
                                        }
                                    }
                                    for (int var48 = 0; var48 < client.field367; var48++) {
                                        class3 var49 = client.field366[client.field368[var48]];
                                        if (var49 != null && var49.method18()) {
                                            int var50 = var49.field704 / 32 - field944.field704 / 32;
                                            int var51 = var49.field693 / 32 - field944.field693 / 32;
                                            boolean var52 = false;
                                            if (client.method137(var49.field38, true)) {
                                                var52 = true;
                                            }
                                            boolean var53 = false;
                                            for (int var54 = 0; var54 < field418; var54++) {
                                                if (var49.field38.equals(field1311[var54].field563)) {
                                                    var53 = true;
                                                    break;
                                                }
                                            }
                                            boolean var55 = false;
                                            if (field944.field32 != 0 && var49.field32 != 0 && field944.field32 == var49.field32) {
                                                var55 = true;
                                            }
                                            if (var52) {
                                                client.method168(var13, var14, var50, var51, field886[3]);
                                            } else if (var55) {
                                                client.method168(var13, var14, var50, var51, field886[4]);
                                            } else if (var53) {
                                                client.method168(var13, var14, var50, var51, field886[5]);
                                            } else {
                                                client.method168(var13, var14, var50, var51, field886[2]);
                                            }
                                        }
                                    }
                                    if (client.field267 != 0 && client.field463 % 20 < 10) {
                                        if (client.field267 == 1 && client.field268 >= 0 && client.field268 < client.field410.length) {
                                            class28 var56 = client.field410[client.field268];
                                            if (var56 != null) {
                                                int var57 = var56.field704 / 32 - field944.field704 / 32;
                                                int var58 = var56.field693 / 32 - field944.field693 / 32;
                                                client.method2418(var13, var14, var57, var58, field576[1]);
                                            }
                                        }
                                        if (client.field267 == 2) {
                                            int var59 = client.field270 * 4 - field557 * 4 + 2 - field944.field704 / 32;
                                            int var60 = client.field271 * 4 - field172 * 4 + 2 - field944.field693 / 32;
                                            client.method2418(var13, var14, var59, var60, field576[1]);
                                        }
                                        if (client.field267 == 10 && client.field269 >= 0 && client.field269 < client.field366.length) {
                                            class3 var61 = client.field366[client.field269];
                                            if (var61 != null) {
                                                int var62 = var61.field704 / 32 - field944.field704 / 32;
                                                int var63 = var61.field693 / 32 - field944.field693 / 32;
                                                client.method2418(var13, var14, var62, var63, field576[1]);
                                            }
                                        }
                                    }
                                    if (client.field480 != 0) {
                                        int var64 = client.field480 * 4 + 2 - field944.field704 / 32;
                                        int var65 = client.field481 * 4 + 2 - field944.field693 / 32;
                                        client.method168(var13, var14, var64, var65, field576[0]);
                                    }
                                    class70.method1495(var13 + 93 + 4, var14 + 82 - 4, 3, 3, 16777215);
                                }
                                if (client.field273 < 3) {
                                    field2601.method1398(var13, var14, 33, 33, 25, 25, client.field306, 256, field1630, field1028);
                                } else {
                                    class70.method1507(var13, var14, 0, field1630, field1028);
                                }
                                if (client.field453[var11]) {
                                    field1221.method1552(var13, var14);
                                }
                                client.field473[var11] = true;
                                class70.method1488(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2479 == 0) {
                            if (!var10.field2476 && client.method2670(var10) && field178 != var10) {
                                continue;
                            }
                            if (!var10.field2476) {
                                if (var10.field2551 > var10.field2575 - var10.field2487) {
                                    var10.field2551 = var10.field2575 - var10.field2487;
                                }
                                if (var10.field2551 < 0) {
                                    var10.field2551 = 0;
                                }
                            }
                            method160(arg0, var10.field2507, var20, var21, var22, var23, var13 - var10.field2495, var14 - var10.field2551, var11);
                            if (var10.field2585 != null) {
                                method160(var10.field2585, var10.field2507, var20, var21, var22, var23, var13 - var10.field2495, var14 - var10.field2551, var11);
                            }
                            class4 var66 = (class4) client.field408.method3159((long) var10.field2507);
                            if (var66 != null) {
                                client.method1963(var66.field65, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class70.method1488(arg2, arg3, arg4, arg5);
                            class81.method1764();
                        }
                        if (client.field453[var11] || client.field332 > 1) {
                            if (var10.field2479 == 0 && !var10.field2476 && var10.field2575 > var10.field2487) {
                                client.method101(var10.field2485 + var13, var14, var10.field2551, var10.field2487, var10.field2575);
                            }
                            if (var10.field2479 != 1) {
                                if (var10.field2479 == 2) {
                                    int var67 = 0;
                                    for (int var68 = 0; var68 < var10.field2487; var68++) {
                                        for (int var69 = 0; var69 < var10.field2485; var69++) {
                                            int var70 = (var10.field2488 + 32) * var69 + var13;
                                            int var71 = (var10.field2531 + 32) * var68 + var14;
                                            if (var67 < 20) {
                                                var70 += var10.field2511[var67];
                                                var71 += var10.field2593[var67];
                                            }
                                            if (var10.field2579[var67] > 0) {
                                                boolean var72 = false;
                                                boolean var73 = false;
                                                int var74 = var10.field2579[var67] - 1;
                                                if (var70 + 32 > arg2 && var70 < arg4 && var71 + 32 > arg3 && var71 < arg5 || field1035 == var10 && client.field359 == var67) {
                                                    class69 var75;
                                                    if (client.field401 == 1 && field952 == var67 && field108 == var10.field2507) {
                                                        var75 = class42.method146(var74, var10.field2580[var67], 2, 0, false);
                                                    } else {
                                                        var75 = class42.method146(var74, var10.field2580[var67], 1, 3153952, false);
                                                    }
                                                    if (var75 == null) {
                                                        client.method141(var10);
                                                    } else if (field1035 == var10 && client.field359 == var67) {
                                                        int var76 = class124.field1969 - client.field284;
                                                        int var77 = class124.field1970 - client.field285;
                                                        if (var76 < 5 && var76 > -5) {
                                                            var76 = 0;
                                                        }
                                                        if (var77 < 5 && var77 > -5) {
                                                            var77 = 0;
                                                        }
                                                        if (client.field352 < 5) {
                                                            var76 = 0;
                                                            var77 = 0;
                                                        }
                                                        var75.method1414(var70 + var76, var71 + var77, 128);
                                                        if (arg1 != -1) {
                                                            class148 var78 = arg0[arg1 & 0xFFFF];
                                                            if (var71 + var77 < class70.field1279 && var78.field2551 > 0) {
                                                                int var79 = client.field323 * (class70.field1279 - var71 - var77) / 3;
                                                                if (var79 > client.field323 * 10) {
                                                                    var79 = client.field323 * 10;
                                                                }
                                                                if (var79 > var78.field2551) {
                                                                    var79 = var78.field2551;
                                                                }
                                                                var78.field2551 -= var79;
                                                                client.field285 += var79;
                                                                client.method141(var78);
                                                            }
                                                            if (var71 + var77 + 32 > class70.field1280 && var78.field2551 < var78.field2575 - var78.field2487) {
                                                                int var80 = client.field323 * (var71 + var77 + 32 - class70.field1280) / 3;
                                                                if (var80 > client.field323 * 10) {
                                                                    var80 = client.field323 * 10;
                                                                }
                                                                if (var80 > var78.field2575 - var78.field2487 - var78.field2551) {
                                                                    var80 = var78.field2575 - var78.field2487 - var78.field2551;
                                                                }
                                                                var78.field2551 += var80;
                                                                client.field285 -= var80;
                                                                client.method141(var78);
                                                            }
                                                        }
                                                    } else if (field1989 == var10 && client.field358 == var67) {
                                                        var75.method1414(var70, var71, 128);
                                                    } else {
                                                        var75.method1431(var70, var71);
                                                    }
                                                }
                                            } else if (var10.field2533 != null && var67 < 20) {
                                                class69 var81 = var10.method2825(var67);
                                                if (var81 != null) {
                                                    var81.method1431(var70, var71);
                                                } else if (class148.field2475) {
                                                    client.method141(var10);
                                                }
                                            }
                                            var67++;
                                        }
                                    }
                                } else if (var10.field2479 == 3) {
                                    int var82;
                                    if (client.method712(var10)) {
                                        var82 = var10.field2491;
                                        if (field178 == var10 && var10.field2497 != 0) {
                                            var82 = var10.field2497;
                                        }
                                    } else {
                                        var82 = var10.field2494;
                                        if (field178 == var10 && var10.field2496 != 0) {
                                            var82 = var10.field2496;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2523) {
                                            class70.method1495(var13, var14, var10.field2485, var10.field2487, var82);
                                        } else {
                                            class70.method1549(var13, var14, var10.field2485, var10.field2487, var82);
                                        }
                                    } else if (var10.field2523) {
                                        class70.method1494(var13, var14, var10.field2485, var10.field2487, var82, 256 - (var15 & 0xFF));
                                    } else {
                                        class70.method1498(var13, var14, var10.field2485, var10.field2487, var82, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2479 == 4) {
                                    class183 var83 = var10.method2824();
                                    if (var83 != null) {
                                        String var84 = var10.field2537;
                                        int var85;
                                        if (client.method712(var10)) {
                                            var85 = var10.field2491;
                                            if (field178 == var10 && var10.field2497 != 0) {
                                                var85 = var10.field2497;
                                            }
                                            if (var10.field2525.length() > 0) {
                                                var84 = var10.field2525;
                                            }
                                        } else {
                                            var85 = var10.field2494;
                                            if (field178 == var10 && var10.field2496 != 0) {
                                                var85 = var10.field2496;
                                            }
                                        }
                                        if (var10.field2476 && var10.field2581 != -1) {
                                            class42 var86 = class42.method124(var10.field2581);
                                            var84 = var86.field985;
                                            if (var84 == null) {
                                                var84 = "null";
                                            }
                                            if ((var86.field997 == 1 || var10.field2582 != 1) && var10.field2582 != -1) {
                                                var84 = class2.method1581(16748608) + var84 + class2.field26 + " " + 'x' + client.method667(var10.field2582);
                                            }
                                        }
                                        if (client.field446 == var10) {
                                            class139 var10000 = (class139) null;
                                            var84 = class139.field2268;
                                            var85 = var10.field2494;
                                        }
                                        if (!var10.field2476) {
                                            var84 = client.method2057(var84, var10);
                                        }
                                        var83.method3272(var84, var13, var14, var10.field2485, var10.field2487, var85, var10.field2513 ? 0 : -1, var10.field2591, var10.field2528, var10.field2526);
                                    } else if (class148.field2475) {
                                        client.method141(var10);
                                    }
                                } else if (var10.field2479 == 5) {
                                    if (var10.field2476) {
                                        class69 var88;
                                        if (var10.field2581 == -1) {
                                            var88 = var10.method2841(false);
                                        } else {
                                            var88 = class42.method146(var10.field2581, var10.field2582, var10.field2544, var10.field2506, false);
                                        }
                                        if (var88 != null) {
                                            int var89 = var88.field1269;
                                            int var90 = var88.field1270;
                                            if (var10.field2504) {
                                                class70.method1514(var13, var14, var10.field2485 + var13, var10.field2487 + var14);
                                                int var91 = (var10.field2485 + (var89 - 1)) / var89;
                                                int var92 = (var10.field2487 + (var90 - 1)) / var90;
                                                for (int var93 = 0; var93 < var91; var93++) {
                                                    for (int var94 = 0; var94 < var92; var94++) {
                                                        if (var10.field2486 != 0) {
                                                            var88.method1418(var89 / 2 + var89 * var93 + var13, var90 / 2 + var90 * var94 + var14, var10.field2486, 4096);
                                                        } else if (var15 == 0) {
                                                            var88.method1431(var89 * var93 + var13, var90 * var94 + var14);
                                                        } else {
                                                            var88.method1414(var89 * var93 + var13, var90 * var94 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class70.method1488(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var95 = var10.field2485 * 4096 / var89;
                                                if (var10.field2486 != 0) {
                                                    var88.method1418(var10.field2485 / 2 + var13, var10.field2487 / 2 + var14, var10.field2486, var95);
                                                } else if (var15 != 0) {
                                                    var88.method1430(var13, var14, var10.field2485, var10.field2487, 256 - (var15 & 0xFF));
                                                } else if (var10.field2485 == var89 && var10.field2487 == var90) {
                                                    var88.method1431(var13, var14);
                                                } else {
                                                    var88.method1408(var13, var14, var10.field2485, var10.field2487);
                                                }
                                            }
                                        } else if (class148.field2475) {
                                            client.method141(var10);
                                        }
                                    } else {
                                        class69 var87 = var10.method2841(client.method712(var10));
                                        if (var87 != null) {
                                            var87.method1431(var13, var14);
                                        } else if (class148.field2475) {
                                            client.method141(var10);
                                        }
                                    }
                                } else if (var10.field2479 == 6) {
                                    boolean var96 = client.method712(var10);
                                    int var97;
                                    if (var96) {
                                        var97 = var10.field2514;
                                    } else {
                                        var97 = var10.field2517;
                                    }
                                    class95 var98 = null;
                                    int var99 = 0;
                                    if (var10.field2581 != -1) {
                                        class42 var100 = class42.method124(var10.field2581);
                                        if (var100 != null) {
                                            class42 var101 = var100.method804(var10.field2582);
                                            var98 = var101.method803(1);
                                            if (var98 == null) {
                                                client.method141(var10);
                                            } else {
                                                var98.method1975();
                                                var99 = var98.field1315 / 2;
                                            }
                                        }
                                    } else if (var10.field2509 == 5) {
                                        if (var10.field2547 == 0) {
                                            var98 = client.field506.method2892((class35) null, -1, (class35) null, -1);
                                        } else {
                                            var98 = field944.method22();
                                        }
                                    } else if (var97 == -1) {
                                        var98 = var10.method2826((class35) null, -1, var96, field944.field50);
                                        if (var98 == null && class148.field2475) {
                                            client.method141(var10);
                                        }
                                    } else {
                                        class35 var102 = class35.method162(var97);
                                        var98 = var10.method2826(var102, var10.field2583, var96, field944.field50);
                                        if (var98 == null && class148.field2475) {
                                            client.method141(var10);
                                        }
                                    }
                                    class81.method1767(var10.field2485 / 2 + var13, var10.field2487 / 2 + var14);
                                    int var103 = var10.field2520 * class81.field1448[var10.field2489] >> 16;
                                    int var104 = var10.field2520 * class81.field1449[var10.field2489] >> 16;
                                    if (var98 != null) {
                                        if (var10.field2476) {
                                            var98.method1975();
                                            if (var10.field2522) {
                                                var98.method1988(0, var10.field2518, var10.field2519, var10.field2489, var10.field2554, var10.field2516 + var99 + var103, var10.field2516 + var104, var10.field2520);
                                            } else {
                                                var98.method2004(0, var10.field2518, var10.field2519, var10.field2489, var10.field2554, var10.field2516 + var99 + var103, var10.field2516 + var104);
                                            }
                                        } else {
                                            var98.method2004(0, var10.field2518, 0, var10.field2489, 0, var103, var104);
                                        }
                                    }
                                    class81.method1766();
                                } else {
                                    if (var10.field2479 == 7) {
                                        class183 var105 = var10.method2824();
                                        if (var105 == null) {
                                            if (class148.field2475) {
                                                client.method141(var10);
                                            }
                                            continue;
                                        }
                                        int var106 = 0;
                                        for (int var107 = 0; var107 < var10.field2487; var107++) {
                                            for (int var108 = 0; var108 < var10.field2485; var108++) {
                                                if (var10.field2579[var106] > 0) {
                                                    class42 var109 = class42.method124(var10.field2579[var106] - 1);
                                                    String var110;
                                                    if (var109.field997 != 1 && var10.field2580[var106] == 1) {
                                                        var110 = class2.method1581(16748608) + var109.field985 + class2.field26;
                                                    } else {
                                                        var110 = class2.method1581(16748608) + var109.field985 + class2.field26 + " " + 'x' + client.method667(var10.field2580[var106]);
                                                    }
                                                    int var111 = (var10.field2488 + 115) * var108 + var13;
                                                    int var112 = (var10.field2531 + 12) * var107 + var14;
                                                    if (var10.field2591 == 0) {
                                                        var105.method3277(var110, var111, var112, var10.field2494, var10.field2513 ? 0 : -1);
                                                    } else if (var10.field2591 == 1) {
                                                        var105.method3271(var110, var10.field2485 / 2 + var111, var112, var10.field2494, var10.field2513 ? 0 : -1);
                                                    } else {
                                                        var105.method3270(var110, var10.field2485 + var111 - 1, var112, var10.field2494, var10.field2513 ? 0 : -1);
                                                    }
                                                }
                                                var106++;
                                            }
                                        }
                                    }
                                    if (var10.field2479 == 8 && field1954 == var10 && client.field400 == client.field399) {
                                        int var113 = 0;
                                        int var114 = 0;
                                        class183 var115 = field171;
                                        String var116 = var10.field2537;
                                        String var117 = client.method2057(var116, var10);
                                        while (var117.length() > 0) {
                                            int var118 = var117.indexOf(class2.field23);
                                            String var119;
                                            if (var118 == -1) {
                                                var119 = var117;
                                                var117 = "";
                                            } else {
                                                var119 = var117.substring(0, var118);
                                                var117 = var117.substring(var118 + 4);
                                            }
                                            int var120 = var115.method3327(var119);
                                            if (var120 > var113) {
                                                var113 = var120;
                                            }
                                            var114 += var115.field2862 + 1;
                                        }
                                        var113 += 6;
                                        var114 += 7;
                                        int var121 = var10.field2485 + var13 - 5 - var113;
                                        int var122 = var10.field2487 + var14 + 5;
                                        if (var121 < var13 + 5) {
                                            var121 = var13 + 5;
                                        }
                                        if (var113 + var121 > arg4) {
                                            var121 = arg4 - var113;
                                        }
                                        if (var114 + var122 > arg5) {
                                            var122 = arg5 - var114;
                                        }
                                        class70.method1495(var121, var122, var113, var114, 16777120);
                                        class70.method1549(var121, var122, var113, var114, 0);
                                        String var123 = var10.field2537;
                                        int var124 = var115.field2862 + var122 + 2;
                                        String var125 = client.method2057(var123, var10);
                                        while (var125.length() > 0) {
                                            int var126 = var125.indexOf(class2.field23);
                                            String var127;
                                            if (var126 == -1) {
                                                var127 = var125;
                                                var125 = "";
                                            } else {
                                                var127 = var125.substring(0, var126);
                                                var125 = var125.substring(var126 + 4);
                                            }
                                            var115.method3277(var127, var121 + 3, var124, 0, -1);
                                            var124 += var115.field2862 + 1;
                                        }
                                    }
                                    if (var10.field2479 == 9) {
                                        if (var10.field2500 == 1) {
                                            class70.method1503(var13, var14, var10.field2485 + var13, var10.field2487 + var14, var10.field2494);
                                        } else {
                                            int var128 = var10.field2485 >= 0 ? var10.field2485 : -var10.field2485;
                                            int var129 = var10.field2487 >= 0 ? var10.field2487 : -var10.field2487;
                                            int var130 = var128;
                                            if (var128 < var129) {
                                                var130 = var129;
                                            }
                                            if (var130 != 0) {
                                                int var131 = (var10.field2485 << 16) / var130;
                                                int var132 = (var10.field2487 << 16) / var130;
                                                if (var132 <= var131) {
                                                    var131 = -var131;
                                                } else {
                                                    var132 = -var132;
                                                }
                                                int var133 = var10.field2500 * var132 >> 17;
                                                int var134 = var10.field2500 * var132 + 1 >> 17;
                                                int var135 = var10.field2500 * var131 >> 17;
                                                int var136 = var10.field2500 * var131 + 1 >> 17;
                                                int var137 = var13 + var133;
                                                int var138 = var13 - var134;
                                                int var139 = var10.field2485 + var13 - var134;
                                                int var140 = var10.field2485 + var13 + var133;
                                                int var141 = var14 + var135;
                                                int var142 = var14 - var136;
                                                int var143 = var10.field2487 + var14 - var136;
                                                int var144 = var10.field2487 + var14 + var135;
                                                class81.method1791(var137, var138, var139);
                                                class81.method1805(var141, var142, var143, var137, var138, var139, var10.field2494);
                                                class81.method1791(var137, var139, var140);
                                                class81.method1805(var141, var143, var144, var137, var139, var140, var10.field2494);
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

    @ObfuscatedName("w.co([Len;II)V")
    public static final void method120(class148[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class148 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2479 == 0) {
                    if (var3.field2585 != null) {
                        method120(var3.field2585, arg1);
                    }
                    class4 var4 = (class4) client.field408.method3159((long) var3.field2507);
                    if (var4 != null) {
                        int var5 = var4.field65;
                        if (class148.method148(var5)) {
                            method120(field2524[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2571 != null) {
                    class1 var6 = new class1();
                    var6.field11 = var3;
                    var6.field9 = var3.field2571;
                    class29.method2814(var6);
                }
                if (arg1 == 1 && var3.field2478 != null) {
                    if (var3.field2527 >= 0) {
                        class148 var7 = class148.method1290(var3.field2507);
                        if (var7 == null || var7.field2585 == null || var3.field2527 >= var7.field2585.length || var7.field2585[var3.field2527] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field11 = var3;
                    var8.field9 = var3.field2478;
                    class29.method2814(var8);
                }
            }
        }
    }

    @ObfuscatedName("co.ca(I)V")
    public static final void method1960() {
        client.method141(client.field419);
        field170++;
        if (client.field427 && client.field424) {
            int var0 = class124.field1969;
            int var1 = class124.field1970;
            int var2 = var0 - client.field448;
            int var3 = var1 - client.field422;
            if (var2 < client.field425) {
                var2 = client.field425;
            }
            if (client.field419.field2485 + var2 > client.field425 + client.field420.field2485) {
                var2 = client.field425 + client.field420.field2485 - client.field419.field2485;
            }
            if (var3 < client.field426) {
                var3 = client.field426;
            }
            if (client.field419.field2487 + var3 > client.field426 + client.field420.field2487) {
                var3 = client.field426 + client.field420.field2487 - client.field419.field2487;
            }
            int var4 = var2 - client.field428;
            int var5 = var3 - client.field429;
            int var6 = client.field419.field2540;
            if (field170 > client.field419.field2534 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                client.field430 = true;
            }
            int var7 = client.field420.field2495 + (var2 - client.field425);
            int var8 = client.field420.field2551 + (var3 - client.field426);
            if (client.field419.field2553 != null && client.field430) {
                class1 var9 = new class1();
                var9.field11 = client.field419;
                var9.field1 = var7;
                var9.field5 = var8;
                var9.field9 = client.field419.field2553;
                class29.method2814(var9);
            }
            if (class124.field1968 == 0) {
                if (client.field430) {
                    if (client.field419.field2530 != null) {
                        class1 var10 = new class1();
                        var10.field11 = client.field419;
                        var10.field1 = var7;
                        var10.field5 = var8;
                        var10.field7 = client.field423;
                        var10.field9 = client.field419.field2530;
                        class29.method2814(var10);
                    }
                    if (client.field423 != null && client.method1863(client.field419) != null) {
                        client.field289.method2372(62);
                        client.field289.method2160(client.field423.field2527);
                        client.field289.method2231(client.field419.field2527);
                        client.field289.method2292(client.field423.field2507);
                        client.field289.method2131(client.field419.field2507);
                    }
                } else if ((client.field388 == 1 || client.method2673(client.field390 - 1)) && client.field390 > 2) {
                    client.method26(client.field448 + client.field428, client.field429 + client.field422);
                } else if (client.field390 > 0) {
                    int var11 = client.field448 + client.field428;
                    int var12 = client.field429 + client.field422;
                    client.method3115(field17, var11, var12);
                    field17 = null;
                }
                client.field419 = null;
            }
        } else if (field170 > 1) {
            client.field419 = null;
        }
    }

    @ObfuscatedName("v.cx(II)V")
    public static final void method163(int arg0) {
        if (!class148.method148(arg0)) {
            return;
        }
        class148[] var1 = field2524[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class148 var3 = var1[var2];
            if (var3 != null) {
                var3.field2583 = 0;
                var3.field2483 = 0;
            }
        }
    }
}
