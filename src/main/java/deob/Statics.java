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
import java.io.DataInputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;

public class Statics {

    @ObfuscatedName("ag.v")
    public static class167 field1014;

    @ObfuscatedName("ag.i")
    public static class167 field1018;

    @ObfuscatedName("ah.v")
    public static class167 field1022;

    @ObfuscatedName("ah.l")
    public static int[] field1032;

    @ObfuscatedName("ah.i")
    public static class167 field1037;

    @ObfuscatedName("ah.x")
    public static String[] field1039;

    @ObfuscatedName("am.v")
    public static class167 field1041;

    @ObfuscatedName("am.nq")
    public static int field1048;

    @ObfuscatedName("am.f")
    public static int field1051;

    @ObfuscatedName("am.i")
    public static class167 field1052;

    @ObfuscatedName("am.cb")
    public static class143 field1053;

    @ObfuscatedName("aa.b")
    public static class172 field1057;

    @ObfuscatedName("aa.i")
    public static class167 field1060;

    @ObfuscatedName("aw.i")
    public static class167 field1062;

    @ObfuscatedName("an.bj")
    public static int field1080;

    @ObfuscatedName("an.i")
    public static class167 field1082;

    @ObfuscatedName("as.i")
    public static class167 field1087;

    @ObfuscatedName("as.cr")
    public static class224 field1093;

    @ObfuscatedName("av.i")
    public static class167 field1100;

    @ObfuscatedName("ao.il")
    public static class173 field1105;

    @ObfuscatedName("ao.a")
    public static int field1106;

    @ObfuscatedName("ad.h")
    public static class167 field1111;

    @ObfuscatedName("ad.a")
    public static class167 field1112;

    @ObfuscatedName("ad.po")
    public static class136 field1158;

    @ObfuscatedName("bi.v")
    public static int field1162;

    @ObfuscatedName("bi.i")
    public static class167 field1164;

    @ObfuscatedName("bp.i")
    public static class54 field1168;

    @ObfuscatedName("by.h")
    public static boolean field1175;

    @ObfuscatedName("by.s")
    public static class73 field1176;

    @ObfuscatedName("by.f")
    public static int field1192;

    @ObfuscatedName("p.hj")
    public static int field121;

    @ObfuscatedName("bw.s")
    public static byte[][][] field1214;

    @ObfuscatedName("bh.r")
    public static float field1234;

    @ObfuscatedName("bh.k")
    public static int field1238;

    @ObfuscatedName("p.an")
    public static long field126;

    @ObfuscatedName("bf.z")
    public static boolean[] field1262;

    @ObfuscatedName("bf.d")
    public static int[] field1271;

    @ObfuscatedName("bf.n")
    public static int[] field1272;

    @ObfuscatedName("p.du")
    public static int[] field128;

    @ObfuscatedName("ba.t")
    public static float[] field1282;

    @ObfuscatedName("ba.d")
    public static int field1286;

    @ObfuscatedName("ba.p")
    public static byte[] field1288;

    @ObfuscatedName("ba.ab")
    public static int[] field1289;

    @ObfuscatedName("p.ak")
    public static int[] field129;

    @ObfuscatedName("ba.ap")
    public static float[] field1291;

    @ObfuscatedName("ba.n")
    public static int field1292;

    @ObfuscatedName("ba.z")
    public static class74[] field1293;

    @ObfuscatedName("ba.c")
    public static class68[] field1294;

    @ObfuscatedName("ba.w")
    public static class69[] field1296;

    @ObfuscatedName("ba.r")
    public static int field1297;

    @ObfuscatedName("ba.x")
    public static int[] field1298;

    @ObfuscatedName("ba.u")
    public static float[] field1304;

    @ObfuscatedName("ba.y")
    public static float[] field1305;

    @ObfuscatedName("ba.q")
    public static float[] field1307;

    @ObfuscatedName("ba.ak")
    public static float[] field1308;

    @ObfuscatedName("ba.b")
    public static class61[] field1309;

    @ObfuscatedName("r.np")
    public static int field131;

    @ObfuscatedName("ba.al")
    public static float[] field1310;

    @ObfuscatedName("ba.k")
    public static int field1311;

    @ObfuscatedName("ba.at")
    public static int[] field1312;

    @ObfuscatedName("ba.g")
    public static boolean[] field1313;

    @ObfuscatedName("r.by")
    public static class168 field133;

    @ObfuscatedName("r.ip")
    public static int field134;

    @ObfuscatedName("bo.t")
    public static int[] field1342;

    @ObfuscatedName("bo.bk")
    public static class168 field1347;

    @ObfuscatedName("r.h")
    public static class167 field135;

    @ObfuscatedName("bq.cg")
    public static class224 field1363;

    @ObfuscatedName("bq.n")
    public static class81 field1364;

    @ObfuscatedName("r.z")
    public static class180 field137;

    @ObfuscatedName("bq.jq")
    public static int field1371;

    @ObfuscatedName("bx.na")
    public static int field1378;

    @ObfuscatedName("bt.i")
    public static int field1381;

    @ObfuscatedName("bt.s")
    public static int[] field1382;

    @ObfuscatedName("bt.a")
    public static int[] field1383;

    @ObfuscatedName("bt.f")
    public static int field1384;

    @ObfuscatedName("bt.p")
    public static int[] field1385;

    @ObfuscatedName("bt.k")
    public static byte[][] field1386;

    @ObfuscatedName("bt.v")
    public static int field1389;

    @ObfuscatedName("k.pj")
    public static Clipboard field139;

    @ObfuscatedName("i.ny")
    public static int field14;

    @ObfuscatedName("ci.b")
    public static int field1413;

    @ObfuscatedName("ci.c")
    public static int[] field1416;

    @ObfuscatedName("ci.w")
    public static int field1417;

    @ObfuscatedName("cs.w")
    public static int[] field1442;

    @ObfuscatedName("cd.a")
    public static byte[][][] field1446;

    @ObfuscatedName("ck.pm")
    public static class160 field1453;

    @ObfuscatedName("ck.qw")
    public static Image field1454;

    @ObfuscatedName("cb.bw")
    public static int field1460;

    @ObfuscatedName("cb.x")
    public static int field1462;

    @ObfuscatedName("cb.br")
    public static int field1468;

    @ObfuscatedName("cb.al")
    public static int field1471;

    @ObfuscatedName("cb.o")
    public static int field1472;

    @ObfuscatedName("cb.l")
    public static int field1473;

    @ObfuscatedName("cb.e")
    public static int field1476;

    @ObfuscatedName("cb.u")
    public static int field1477;

    @ObfuscatedName("cb.bc")
    public static int field1478;

    @ObfuscatedName("cb.t")
    public static int field1479;

    @ObfuscatedName("k.dc")
    public static int[] field148;

    @ObfuscatedName("cb.q")
    public static int field1480;

    @ObfuscatedName("cb.ak")
    public static int field1481;

    @ObfuscatedName("cb.ap")
    public static int field1482;

    @ObfuscatedName("cb.bd")
    public static boolean[][] field1483;

    @ObfuscatedName("cb.ab")
    public static int field1484;

    @ObfuscatedName("k.pp")
    public static class134 field149;

    @ObfuscatedName("cb.bn")
    public static int field1500;

    @ObfuscatedName("cb.m")
    public static int field1506;

    @ObfuscatedName("cb.y")
    public static int field1508;

    @ObfuscatedName("cb.j")
    public static int field1510;

    @ObfuscatedName("cb.by")
    public static int field1511;

    @ObfuscatedName("cb.bs")
    public static int field1513;

    @ObfuscatedName("co.pd")
    public static GarbageCollectorMXBean field1517;

    @ObfuscatedName("co.ev")
    public static class79[] field1526;

    @ObfuscatedName("d.b")
    public static int[] field153;

    @ObfuscatedName("cc.cj")
    public static class224 field1557;

    @ObfuscatedName("cz.z")
    public static int field1563;

    @ObfuscatedName("cz.t")
    public static int field1564;

    @ObfuscatedName("cz.n")
    public static int field1568;

    @ObfuscatedName("cz.u")
    public static int field1569;

    @ObfuscatedName("cz.j")
    public static int field1570;

    @ObfuscatedName("cz.m")
    public static int field1571;

    @ObfuscatedName("cz.e")
    public static int field1572;

    @ObfuscatedName("cz.y")
    public static int field1574;

    @ObfuscatedName("cz.ap")
    public static class92 field1578;

    @ObfuscatedName("d.bp")
    public static class168 field159;

    @ObfuscatedName("cx.qh")
    public static int field1596;

    @ObfuscatedName("cx.eh")
    public static class79 field1605;

    @ObfuscatedName("cx.cy")
    public static int field1612;

    @ObfuscatedName("d.hr")
    public static class3 field162;

    @ObfuscatedName("ce.aj")
    public static boolean field1652;

    @ObfuscatedName("z.pw")
    public static class221 field166;

    @ObfuscatedName("ce.nr")
    public static int field1666;

    @ObfuscatedName("cj.av")
    public static class79[] field1677;

    @ObfuscatedName("cj.n")
    public static int[] field1681;

    @ObfuscatedName("z.c")
    public static int[] field170;

    @ObfuscatedName("z.ag")
    public static String field171;

    @ObfuscatedName("cu.ay")
    public static class146 field1766;

    @ObfuscatedName("do.bp")
    public static int field1793;

    @ObfuscatedName("do.bi")
    public static int field1839;

    @ObfuscatedName("do.bb")
    public static int field1840;

    @ObfuscatedName("c.as")
    public static class168 field186;

    @ObfuscatedName("dv.s")
    public static boolean field1860;

    @ObfuscatedName("c.ph")
    public static class9 field187;

    @ObfuscatedName("c.jn")
    public static int field188;

    @ObfuscatedName("dq.ei")
    public static class79[] field1889;

    @ObfuscatedName("dq.fm")
    public static int field1890;

    @ObfuscatedName("dy.lw")
    public static class130 field1897;

    @ObfuscatedName("da.er")
    public static class79 field1941;

    @ObfuscatedName("da.r")
    public static int[] field1942;

    @ObfuscatedName("da.s")
    public static class153 field1943;

    @ObfuscatedName("da.mt")
    public static byte field1946;

    @ObfuscatedName("dc.bh")
    public static class168 field1947;

    @ObfuscatedName("du.j")
    public static int[] field1954;

    @ObfuscatedName("du.py")
    public static int field1955;

    @ObfuscatedName("dn.qg")
    public static int field1960;

    @ObfuscatedName("dn.v")
    public static long field1962;

    @ObfuscatedName("dn.gg")
    public static int field1963;

    @ObfuscatedName("dd.c")
    public static String field1965;

    @ObfuscatedName("dd.bf")
    public static FontMetrics field1967;

    @ObfuscatedName("dd.qc")
    public static int field1973;

    @ObfuscatedName("dj.qu")
    public static Font field1983;

    @ObfuscatedName("dj.nk")
    public static class57 field1989;

    @ObfuscatedName("dj.df")
    public static byte[][] field1990;

    @ObfuscatedName("di.ix")
    public static int field1997;

    @ObfuscatedName("v.dp")
    public static int field20;

    @ObfuscatedName("dt.cq")
    public static char field2000;

    @ObfuscatedName("dg.rl")
    public static String field2014;

    @ObfuscatedName("dz.i")
    public static long field2020;

    @ObfuscatedName("dz.ad")
    public static class81[] field2025;

    @ObfuscatedName("dm.qv")
    public static class78 field2029;

    @ObfuscatedName("w.qd")
    public static int field203;

    @ObfuscatedName("dm.k")
    public static int field2031;

    @ObfuscatedName("de.ad")
    public static class168 field2035;

    @ObfuscatedName("de.i")
    public static class167 field2042;

    @ObfuscatedName("ed.ew")
    public static class79[] field2060;

    @ObfuscatedName("et.g")
    public static class119 field2071;

    @ObfuscatedName("eq.v")
    public static File field2076;

    @ObfuscatedName("eq.nj")
    public static class57 field2080;

    @ObfuscatedName("eg.v")
    public static String field2085;

    @ObfuscatedName("eg.i")
    public static String field2086;

    @ObfuscatedName("er.n")
    public static boolean field2121;

    @ObfuscatedName("er.f")
    public static long field2126;

    @ObfuscatedName("eh.d")
    public static int field2129;

    @ObfuscatedName("ea.eu")
    public static class79[] field2154;

    @ObfuscatedName("g.s")
    public static int field216;

    @ObfuscatedName("ea.qe")
    public static int field2160;

    @ObfuscatedName("ea.w")
    public static int field2161;

    @ObfuscatedName("ei.d")
    public static int[] field2169;

    @ObfuscatedName("g.bi")
    public static class168 field218;

    @ObfuscatedName("ev.ar")
    public static int field2199;

    @ObfuscatedName("ev.fv")
    public static int field2200;

    @ObfuscatedName("g.iv")
    public static int field221;

    @ObfuscatedName("ew.f")
    public static int field2215;

    @ObfuscatedName("ew.v")
    public static String field2219;

    @ObfuscatedName("es.s")
    public static int field2221;

    @ObfuscatedName("es.h")
    public static File field2223;

    @ObfuscatedName("es.g")
    public static String[] field2224;

    @ObfuscatedName("es.b")
    public static class228[] field2229;

    @ObfuscatedName("es.no")
    public static int field2234;

    @ObfuscatedName("eo.pa")
    public static int field2247;

    @ObfuscatedName("eo.r")
    public static short[][] field2253;

    @ObfuscatedName("eo.ah")
    public static class146 field2255;

    @ObfuscatedName("el.u")
    public static class14 field2269;

    @ObfuscatedName("x.q")
    public static int[] field228;

    @ObfuscatedName("ey.in")
    public static int field2284;

    @ObfuscatedName("ej.qx")
    public static class133 field2289;

    @ObfuscatedName("ef.pr")
    public static long field2304;

    @ObfuscatedName("x.av")
    public static class168 field235;

    @ObfuscatedName("x.cd")
    public static class146 field238;

    @ObfuscatedName("v.nx")
    public static int field24;

    @ObfuscatedName("x.kw")
    public static class131 field240;

    @ObfuscatedName("x.ml")
    public static byte field245;

    @ObfuscatedName("o.bb")
    public static class81 field249;

    @ObfuscatedName("o.bq")
    public static int field252;

    @ObfuscatedName("o.w")
    public static int[][][] field256;

    @ObfuscatedName("ff.am")
    public static class143 field2586;

    @ObfuscatedName("fo.ee")
    public static class81[] field2632;

    @ObfuscatedName("fi.cv")
    public static int field2644;

    @ObfuscatedName("l.n")
    public static class173 field265;

    @ObfuscatedName("fy.mz")
    public static class25[] field2655;

    @ObfuscatedName("fp.qo")
    public static int field2656;

    @ObfuscatedName("fn.bc")
    public static class168 field2677;

    @ObfuscatedName("fg.gk")
    public static class173 field2692;

    @ObfuscatedName("fe.dn")
    public static int[] field2711;

    @ObfuscatedName("j.ic")
    public static class173 field272;

    @ObfuscatedName("fe.i")
    public static class143 field2724;

    @ObfuscatedName("fq.mp")
    public static int field2726;

    @ObfuscatedName("fb.s")
    public static class167 field2733;

    @ObfuscatedName("v.ba")
    public static String field28;

    @ObfuscatedName("fb.v")
    public static boolean[] field2805;

    @ObfuscatedName("fb.i")
    public static class173[][] field2817;

    @ObfuscatedName("fb.f")
    public static class167 field2863;

    @ObfuscatedName("fh.dg")
    public static int field2879;

    @ObfuscatedName("fh.ap")
    public static int[] field2881;

    @ObfuscatedName("fh.ng")
    public static int field2882;

    @ObfuscatedName("client.v")
    public static client field289;

    @ObfuscatedName("fa.fl")
    public static int field2892;

    @ObfuscatedName("fj.ju")
    public static class173[] field2896;

    @ObfuscatedName("fr.n")
    public static class224 field2902;

    @ObfuscatedName("fz.p")
    public static short[] field2909;

    @ObfuscatedName("fz.k")
    public static short[] field2910;

    @ObfuscatedName("client.r")
    public static class154 field294;

    @ObfuscatedName("gl.s")
    public static class167 field2944;

    @ObfuscatedName("gl.f")
    public static class167 field2945;

    @ObfuscatedName("gl.ck")
    public static class143 field2947;

    @ObfuscatedName("gl.v")
    public static class167 field2948;

    @ObfuscatedName("gl.r")
    public static int field2949;

    @ObfuscatedName("gl.p")
    public static int field2950;

    @ObfuscatedName("gl.ez")
    public static class79[] field2951;

    @ObfuscatedName("gl.d")
    public static short[][] field2952;

    @ObfuscatedName("gc.he")
    public static int field2983;

    @ObfuscatedName("client.o")
    public static int field299;

    @ObfuscatedName("v.hf")
    public static int field30;

    @ObfuscatedName("v.nb")
    public static class56 field31;

    @ObfuscatedName("hl.z")
    public static int[] field3125;

    @ObfuscatedName("hl.i")
    public static class167 field3126;

    @ObfuscatedName("hg.c")
    public static class60 field3136;

    @ObfuscatedName("hg.rb")
    public static boolean field3137;

    @ObfuscatedName("hg.d")
    public static class19 field3140;

    @ObfuscatedName("ha.a")
    public static File field3144;

    @ObfuscatedName("hh.h")
    public static int[] field3146;

    @ObfuscatedName("hb.qq")
    public static int field3151;

    @ObfuscatedName("hi.i")
    public static class113 field3163;

    @ObfuscatedName("hv.d")
    public static class81[] field3173;

    @ObfuscatedName("hm.ec")
    public static class79[] field3186;

    @ObfuscatedName("hn.i")
    public static Applet field3191;

    @ObfuscatedName("ho.k")
    public static class81[] field3195;

    @ObfuscatedName("client.bo")
    public static int field327;

    @ObfuscatedName("v.c")
    public static boolean field34;

    @ObfuscatedName("client.ea")
    public static class79[] field388;

    @ObfuscatedName("f.jy")
    public static int field41;

    @ObfuscatedName("client.k")
    public static class212 field484;

    @ObfuscatedName("client.bw")
    public static class168 field487;

    @ObfuscatedName("client.ek")
    public static class79[] field504;

    @ObfuscatedName("client.br")
    public static class168 field572;

    @ObfuscatedName("client.go")
    public static class173 field574;

    @ObfuscatedName("m.dv")
    public static int field579;

    @ObfuscatedName("m.fd")
    public static int field580;

    @ObfuscatedName("m.a")
    public static class167 field584;

    @ObfuscatedName("h.g")
    public static int field61;

    @ObfuscatedName("t.m")
    public static int[] field626;

    @ObfuscatedName("q.ao")
    public static class81[] field630;

    @ObfuscatedName("q.a")
    public static class26[] field631;

    @ObfuscatedName("ak.fx")
    public static int field661;

    @ObfuscatedName("ap.t")
    public static int[] field668;

    @ObfuscatedName("ap.dd")
    public static int[][] field675;

    @ObfuscatedName("al.z")
    public static class173 field678;

    @ObfuscatedName("al.mc")
    public static class79 field680;

    @ObfuscatedName("al.nz")
    public static int field682;

    @ObfuscatedName("al.kv")
    public static class20 field683;

    @ObfuscatedName("ab.bs")
    public static class168 field697;

    @ObfuscatedName("ab.bd")
    public static class168 field703;

    @ObfuscatedName("ab.dz")
    public static int field704;

    @ObfuscatedName("at.b")
    public static String field709;

    @ObfuscatedName("a.ep")
    public static class81[] field71;

    @ObfuscatedName("at.j")
    public static class119 field714;

    @ObfuscatedName("a.ns")
    public static class75 field72;

    @ObfuscatedName("au.f")
    public static class81 field721;

    @ObfuscatedName("au.i")
    public static boolean field722;

    @ObfuscatedName("au.a")
    public static class81[] field723;

    @ObfuscatedName("au.p")
    public static class79 field725;

    @ObfuscatedName("au.r")
    public static class81 field726;

    @ObfuscatedName("au.d")
    public static class81 field727;

    @ObfuscatedName("au.h")
    public static class81 field734;

    @ObfuscatedName("au.s")
    public static class79 field738;

    @ObfuscatedName("a.ps")
    public static short[] field75;

    @ObfuscatedName("au.ho")
    public static int field753;

    @ObfuscatedName("au.e")
    public static int[] field754;

    @ObfuscatedName("ae.qs")
    public static Canvas field773;

    @ObfuscatedName("ax.e")
    public static String field783;

    @ObfuscatedName("ax.qn")
    public static Frame field786;

    @ObfuscatedName("aq.p")
    public static int field788;

    @ObfuscatedName("aq.h")
    public static class184 field791;

    @ObfuscatedName("az.pc")
    public static int field799;

    @ObfuscatedName("i.ao")
    public static class168 field8;

    @ObfuscatedName("s.h")
    public static byte[][][] field80;

    @ObfuscatedName("ac.f")
    public static int[] field806;

    @ObfuscatedName("ac.h")
    public static String[] field807;

    @ObfuscatedName("s.p")
    public static byte[][][] field81;

    @ObfuscatedName("ac.j")
    public static String field818;

    @ObfuscatedName("ac.m")
    public static String field819;

    @ObfuscatedName("s.r")
    public static byte[][][] field82;

    @ObfuscatedName("ac.ff")
    public static int field820;

    @ObfuscatedName("s.k")
    public static int[][] field83;

    @ObfuscatedName("ai.dj")
    public static class86 field841;

    @ObfuscatedName("ay.qj")
    public static int field890;

    @ObfuscatedName("ay.nu")
    public static int field891;

    @ObfuscatedName("ay.ir")
    public static int field892;

    @ObfuscatedName("ay.bu")
    public static int field893;

    @ObfuscatedName("ay.bn")
    public static class168 field894;

    @ObfuscatedName("aj.i")
    public static class167 field897;

    @ObfuscatedName("aj.v")
    public static class167 field898;

    @ObfuscatedName("i.dk")
    public static byte[][] field9;

    @ObfuscatedName("s.gm")
    public static class173 field93;

    @ObfuscatedName("aj.do")
    public static int field934;

    @ObfuscatedName("af.f")
    public static class167 field937;

    @ObfuscatedName("s.a")
    public static int field95;

    @ObfuscatedName("s.fo")
    public static int field96;

    @ObfuscatedName("af.es")
    public static class81[] field973;

    @ObfuscatedName("af.v")
    public static class167 field985;

    @ObfuscatedName("ar.i")
    public static class167 field988;

    @ObfuscatedName("s.if")
    public static class31 field99;

    @ObfuscatedName("ar.bi")
    public static class81[] field993;

    @ObfuscatedName("ag.f")
    public static class167 field997;

    @ObfuscatedName("ag.bb")
    public static class168 field998;

    @ObfuscatedName("aj.i(Lhu;I)I")
    public static final int method744(class212 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field3124) {
                case 8:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("x.v(J)V")
    public static final void method166(long arg0) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @ObfuscatedName("y.ap(IILjava/awt/Component;S)Lbv;")
    public static class78 method548(int arg0, int arg1, Component arg2) {
        try {
            class82 var3 = new class82();
            var3.method1485(arg0, arg1, arg2);
            return var3;
        } catch (Throwable var6) {
            class76 var5 = new class76();
            var5.method1485(arg0, arg1, arg2);
            return var5;
        }
    }

    @ObfuscatedName("af.v(Ldj;I)Ljava/lang/String;")
    public static String method784(class119 arg0) {
        return class222.method3639(arg0, 32767);
    }

    @ObfuscatedName("cd.i(III)Z")
    public static boolean method1719(int arg0, int arg1) {
        return arg0 != 4 || arg1 < 8;
    }

    @ObfuscatedName("fq.i(II)I")
    public static int method3146(int arg0) {
        class48 var1 = class48.method1915(arg0);
        int var2 = var1.field1075;
        int var3 = var1.field1078;
        int var4 = var1.field1079;
        int var5 = class176.field2893[var4 - var3];
        return class176.field2895[var2] >> var3 & var5;
    }

    @ObfuscatedName("an.i(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static void method929(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                Throwable var3 = arg1;
                String var5;
                if (arg1 instanceof class148) {
                    class148 var4 = (class148) arg1;
                    var5 = var4.field2216 + " | ";
                    var3 = var4.field2214;
                } else {
                    var5 = "";
                }
                StringWriter var6 = new StringWriter();
                PrintWriter var7 = new PrintWriter(var6);
                var3.printStackTrace(var7);
                var7.close();
                String var8 = var6.toString();
                BufferedReader var9 = new BufferedReader(new StringReader(var8));
                String var10 = var9.readLine();
                while (true) {
                    String var11 = var9.readLine();
                    if (var11 == null) {
                        String var20 = var5 + "| " + var10;
                        var2 = var20;
                        break;
                    }
                    int var12 = var11.indexOf(40);
                    int var13 = var11.indexOf(41, var12 + 1);
                    if (var12 >= 0 && var13 >= 0) {
                        String var14 = var11.substring(var12 + 1, var13);
                        int var15 = var14.indexOf(".java:");
                        if (var15 >= 0) {
                            String var16 = var14.substring(0, var15) + var14.substring(var15 + 5);
                            var5 = var5 + var16 + ' ';
                            continue;
                        }
                        var11 = var11.substring(0, var12);
                    }
                    String var17 = var11.trim();
                    String var18 = var17.substring(var17.lastIndexOf(32) + 1);
                    String var19 = var18.substring(var18.lastIndexOf(9) + 1);
                    var5 = var5 + var19 + ' ';
                }
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var2 = var2 + " | ";
                }
                var2 = var2 + arg0;
            }
            System.out.println("Error: " + var2);
            String var22 = var2.replace(':', '.');
            String var23 = var22.replace('@', '_');
            String var24 = var23.replace('&', '_');
            String var25 = var24.replace('#', '_');
            if (field3191 == null) {
                return;
            }
            URL var26 = new URL(field3191.getCodeBase(), "clienterror.ws?c=" + field2215 + "&u=" + field2219 + "&v1=" + field2086 + "&v2=" + field2085 + "&e=" + var25);
            DataInputStream var27 = new DataInputStream(var26.openStream());
            var27.read();
            var27.close();
        } catch (Exception var29) {
        }
    }

    @ObfuscatedName("y.f(II)V")
    public static void method546(int arg0) {
        class16 var1 = (class16) class16.field215.method3509((long) arg0);
        if (var1 != null) {
            var1.method3624();
        }
    }

    @ObfuscatedName("cd.s(IIII)I")
    public static final int method1716(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = class6.method2921(var3, var5);
        int var8 = class6.method2921(var3 + 1, var5);
        int var9 = class6.method2921(var3, var5 + 1);
        int var10 = class6.method2921(var3 + 1, var5 + 1);
        int var11 = 65536 - class91.field1582[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class91.field1582[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class91.field1582[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("j.s(I)V")
    public static final void method203() {
        class86.field1463 = false;
        client.field353 = false;
    }

    @ObfuscatedName("dx.r(Lcw;I)V")
    public static final void method2620(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < field668.length; var2++) {
            field668[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            field668[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    field228[var8] = (field668[var8 - 1] + field668[var8 + 1] + field668[var8 - 128] + field668[var8 + 128]) / 4;
                }
            }
            int[] var9 = field668;
            field668 = field228;
            field228 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1422; var11++) {
            for (int var12 = 0; var12 < arg0.field1421; var12++) {
                if (arg0.field1420[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1424;
                    int var14 = var11 + 16 + arg0.field1419;
                    int var15 = (var14 << 7) + var13;
                    field668[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("e.l(IB)V")
    public static void method529(int arg0) {
        if (arg0 == -3) {
            class32.method902(class157.field2347, class157.field2348, class157.field2333);
        } else if (arg0 == -2) {
            class32.method902(class157.field2359, class157.field2351, class157.field2570);
        } else if (arg0 == -1) {
            class32.method902(class157.field2481, class157.field2460, class157.field2355);
        } else if (arg0 == 3) {
            class32.method902(class157.field2356, class157.field2527, class157.field2358);
        } else if (arg0 == 4) {
            class32.method902(class157.field2352, class157.field2360, class157.field2561);
        } else if (arg0 == 5) {
            class32.method902(class157.field2362, class157.field2458, class157.field2364);
        } else if (arg0 == 6) {
            class32.method902(class157.field2399, class157.field2366, class157.field2367);
        } else if (arg0 == 7) {
            class32.method902(class157.field2529, class157.field2560, class157.field2370);
        } else if (arg0 == 8) {
            class32.method902(class157.field2371, class157.field2372, class157.field2373);
        } else if (arg0 == 9) {
            class32.method902(class157.field2374, class157.field2477, class157.field2369);
        } else if (arg0 == 10) {
            class32.method902(class157.field2377, class157.field2421, class157.field2376);
        } else if (arg0 == 11) {
            class32.method902(class157.field2380, class157.field2381, class157.field2382);
        } else if (arg0 == 12) {
            class32.method902(class157.field2383, class157.field2384, class157.field2385);
        } else if (arg0 == 13) {
            class32.method902(class157.field2386, class157.field2387, class157.field2388);
        } else if (arg0 == 14) {
            class32.method902(class157.field2389, class157.field2390, class157.field2391);
        } else if (arg0 == 16) {
            class32.method902(class157.field2361, class157.field2500, class157.field2394);
        } else if (arg0 == 17) {
            class32.method902(class157.field2337, class157.field2535, class157.field2357);
        } else if (arg0 == 18) {
            class32.method902(class157.field2398, class157.field2456, class157.field2514);
        } else if (arg0 == 19) {
            class32.method902(class157.field2510, class157.field2402, class157.field2403);
        } else if (arg0 == 20) {
            class32.method902(class157.field2404, class157.field2405, class157.field2406);
        } else if (arg0 == 22) {
            class32.method902(class157.field2407, class157.field2408, class157.field2409);
        } else if (arg0 == 23) {
            class32.method902(class157.field2410, class157.field2411, class157.field2412);
        } else if (arg0 == 24) {
            class32.method902(class157.field2413, class157.field2414, class157.field2415);
        } else if (arg0 == 25) {
            class32.method902(class157.field2416, class157.field2578, class157.field2418);
        } else if (arg0 == 26) {
            class32.method902(class157.field2563, class157.field2513, class157.field2378);
        } else if (arg0 == 27) {
            class32.method902(class157.field2422, class157.field2423, class157.field2424);
        } else if (arg0 == 31) {
            class32.method902(class157.field2431, class157.field2432, class157.field2342);
        } else if (arg0 == 32) {
            class32.method902(class157.field2434, class157.field2435, class157.field2436);
        } else if (arg0 == 37) {
            class32.method902(class157.field2330, class157.field2379, class157.field2496);
        } else if (arg0 == 38) {
            class32.method902(class157.field2419, class157.field2441, class157.field2442);
        } else if (arg0 == 55) {
            class32.method902(class157.field2564, class157.field2444, class157.field2445);
        } else if (arg0 == 56) {
            class32.method902(class157.field2446, class157.field2447, class157.field2448);
            client.method605(11);
            return;
        } else if (arg0 == 57) {
            class32.method902(class157.field2449, class157.field2450, class157.field2451);
            client.method605(11);
            return;
        } else {
            class32.method902(class157.field2452, class157.field2453, class157.field2454);
        }
        client.method605(10);
    }

    @ObfuscatedName("bq.ak(IIB)V")
    public static void method1473(int arg0, int arg1) {
        if (client.field526 != 0 && arg0 != -1) {
            class183.method152(field487, arg0, 0, client.field526, false);
            client.field319 = true;
        }
    }

    @ObfuscatedName("fd.ah(IIIII)V")
    public static final void method3115(int arg0, int arg1, int arg2, int arg3) {
        client.field551++;
        client.method104(class34.field785);
        boolean var4 = false;
        if (client.field422 >= 0) {
            int var5 = class33.field768;
            int[] var6 = class33.field761;
            for (int var7 = 0; var7 < var5; var7++) {
                if (client.field422 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            client.method104(class34.field776);
        }
        client.method2908(true);
        client.method104(var4 ? class34.field779 : class34.field778);
        client.method2908(false);
        for (class7 var8 = (class7) client.field424.method3535(); var8 != null; var8 = (class7) client.field424.method3537()) {
            if (field1963 != var8.field102 || client.field302 > var8.field130) {
                var8.method3624();
            } else if (client.field302 >= var8.field107) {
                if (var8.field111 > 0) {
                    class35 var9 = client.field470[var8.field111 - 1];
                    if (var9 != null && var9.field855 >= 0 && var9.field855 < 13312 && var9.field825 >= 0 && var9.field825 < 13312) {
                        var8.method93(var9.field855, var9.field825, client.method601(var9.field855, var9.field825, var8.field102) - var8.field101, client.field302);
                    }
                }
                if (var8.field111 < 0) {
                    int var10 = -var8.field111 - 1;
                    class3 var11;
                    if (client.field336 == var10) {
                        var11 = field162;
                    } else {
                        var11 = client.field412[var10];
                    }
                    if (var11 != null && var11.field855 >= 0 && var11.field855 < 13312 && var11.field825 >= 0 && var11.field825 < 13312) {
                        var8.method93(var11.field855, var11.field825, client.method601(var11.field855, var11.field825, var8.field102) - var8.field101, client.field302);
                    }
                }
                var8.method95(client.field566);
                field841.method1739(field1963, (int) var8.field127, (int) var8.field114, (int) var8.field110, 60, var8, var8.field120, -1, false);
            }
        }
        for (class30 var12 = (class30) client.field425.method3535(); var12 != null; var12 = (class30) client.field425.method3537()) {
            if (field1963 != var12.field687 || var12.field692) {
                var12.method3624();
            } else if (client.field302 >= var12.field694) {
                var12.method604(client.field566);
                if (var12.field692) {
                    var12.method3624();
                } else {
                    field841.method1739(var12.field687, var12.field688, var12.field689, var12.field690, 60, var12, 0, -1, false);
                }
            }
        }
        client.method603(arg0, arg1, arg2, arg3, true);
        int var13 = client.field297;
        int var14 = client.field552;
        int var15 = client.field451;
        int var16 = client.field554;
        class80.method1632(var13, var14, var13 + var15, var14 + var16);
        class91.method1917();
        if (!client.field561) {
            int var17 = client.field375;
            if (client.field368 / 256 > var17) {
                var17 = client.field368 / 256;
            }
            if (client.field538[4] && client.field540[4] + 128 > var17) {
                var17 = client.field540[4] + 128;
            }
            int var18 = client.field376 + client.field358 & 0x7FF;
            client.method583(field580, client.method601(field162.field855, field162.field825, field1963) - client.field396, field661, var17, var18, var17 * 3 + 600);
        }
        int var31;
        if (client.field561) {
            var31 = client.method10();
        } else {
            int var19;
            if (field187.field150) {
                var19 = field1963;
            } else {
                label542: {
                    int var20 = 3;
                    if (field96 < 310) {
                        int var21 = field2892 >> 7;
                        int var22 = field1890 >> 7;
                        int var23 = field162.field855 >> 7;
                        int var24 = field162.field825 >> 7;
                        if (var21 < 0 || var22 < 0 || var21 >= 104 || var22 >= 104) {
                            var19 = field1963;
                            break label542;
                        }
                        if ((class6.field98[field1963][var21][var22] & 0x4) != 0) {
                            var20 = field1963;
                        }
                        int var25;
                        if (var23 > var21) {
                            var25 = var23 - var21;
                        } else {
                            var25 = var21 - var23;
                        }
                        int var26;
                        if (var24 > var22) {
                            var26 = var24 - var22;
                        } else {
                            var26 = var22 - var24;
                        }
                        if (var25 > var26) {
                            int var27 = var26 * 65536 / var25;
                            int var28 = 32768;
                            while (var21 != var23) {
                                if (var21 < var23) {
                                    var21++;
                                } else if (var21 > var23) {
                                    var21--;
                                }
                                if ((class6.field98[field1963][var21][var22] & 0x4) != 0) {
                                    var20 = field1963;
                                }
                                var28 += var27;
                                if (var28 >= 65536) {
                                    var28 -= 65536;
                                    if (var22 < var24) {
                                        var22++;
                                    } else if (var22 > var24) {
                                        var22--;
                                    }
                                    if ((class6.field98[field1963][var21][var22] & 0x4) != 0) {
                                        var20 = field1963;
                                    }
                                }
                            }
                        } else {
                            int var29 = var25 * 65536 / var26;
                            int var30 = 32768;
                            while (var22 != var24) {
                                if (var22 < var24) {
                                    var22++;
                                } else if (var22 > var24) {
                                    var22--;
                                }
                                if ((class6.field98[field1963][var21][var22] & 0x4) != 0) {
                                    var20 = field1963;
                                }
                                var30 += var29;
                                if (var30 >= 65536) {
                                    var30 -= 65536;
                                    if (var21 < var23) {
                                        var21++;
                                    } else if (var21 > var23) {
                                        var21--;
                                    }
                                    if ((class6.field98[field1963][var21][var22] & 0x4) != 0) {
                                        var20 = field1963;
                                    }
                                }
                            }
                        }
                    }
                    if (field162.field855 >= 0 && field162.field825 >= 0 && field162.field855 < 13312 && field162.field825 < 13312) {
                        if ((class6.field98[field1963][field162.field855 >> 7][field162.field825 >> 7] & 0x4) != 0) {
                            var20 = field1963;
                        }
                        var19 = var20;
                    } else {
                        var19 = field1963;
                    }
                }
            }
            var31 = var19;
        }
        int var32 = field2892;
        int var33 = field820;
        int var34 = field1890;
        int var35 = field96;
        int var36 = field2200;
        for (int var37 = 0; var37 < 5; var37++) {
            if (client.field538[var37]) {
                int var38 = (int) (Math.random() * (double) (client.field539[var37] * 2 + 1) - (double) client.field539[var37] + Math.sin((double) client.field541[var37] / 100.0D * (double) client.field355[var37]) * (double) client.field540[var37]);
                if (var37 == 0) {
                    field2892 += var38;
                }
                if (var37 == 1) {
                    field820 += var38;
                }
                if (var37 == 2) {
                    field1890 += var38;
                }
                if (var37 == 3) {
                    field2200 = field2200 + var38 & 0x7FF;
                }
                if (var37 == 4) {
                    field96 += var38;
                    if (field96 < 128) {
                        field96 = 128;
                    }
                    if (field96 > 383) {
                        field96 = 383;
                    }
                }
            }
        }
        int var39 = class140.field2143;
        int var40 = class140.field2139 * 869381013;
        if (class140.field2138 != 0) {
            var39 = class140.field2145;
            var40 = class140.field2136;
        }
        if (var39 >= var13 && var39 < var13 + var15 && var40 >= var14 && var40 < var14 + var16) {
            class105.field1842 = true;
            class105.field1804 = 0;
            class105.field1843 = var39 - var13;
            class105.field1844 = var40 - var14;
        } else {
            class105.field1842 = false;
            class105.field1804 = 0;
        }
        client.method833();
        class80.method1638(var13, var14, var15, var16, 0);
        client.method833();
        int var41 = class91.field1567;
        class91.field1567 = client.field562;
        field841.method1766(field2892, field820, field1890, field96, field2200, var31);
        class91.field1567 = var41;
        client.method833();
        field841.method1742();
        client.field385 = 0;
        boolean var42 = false;
        int var43 = -1;
        int var44 = class33.field768;
        int[] var45 = class33.field761;
        for (int var46 = 0; var46 < client.field329 + var44; var46++) {
            class38 var47;
            if (var46 < var44) {
                var47 = client.field412[var45[var46]];
                if (client.field422 == var45[var46]) {
                    var42 = true;
                    var43 = var46;
                    continue;
                }
            } else {
                var47 = client.field470[client.field330[var46 - var44]];
            }
            client.method2615(var47, var46, var13, var14, var15, var16);
        }
        if (var42) {
            client.method2615(client.field412[client.field422], var43, var13, var14, var15, var16);
        }
        for (int var48 = 0; var48 < client.field385; var48++) {
            int var49 = client.field387[var48];
            int var50 = client.field348[var48];
            int var51 = client.field495[var48];
            int var52 = client.field485[var48];
            boolean var53 = true;
            while (var53) {
                var53 = false;
                for (int var54 = 0; var54 < var48; var54++) {
                    if (var50 + 2 > client.field348[var54] - client.field485[var54] && var50 - var52 < client.field348[var54] + 2 && var49 - var51 < client.field495[var54] + client.field387[var54] && var49 + var51 > client.field387[var54] - client.field495[var54] && client.field348[var54] - client.field485[var54] < var50) {
                        var50 = client.field348[var54] - client.field485[var54];
                        var53 = true;
                    }
                }
            }
            client.field553 = client.field387[var48];
            client.field398 = client.field348[var48] = var50;
            String var55 = client.field394[var48];
            if (client.field397 == 0) {
                int var56 = 16776960;
                if (client.field391[var48] < 6) {
                    var56 = client.field506[client.field391[var48]];
                }
                if (client.field391[var48] == 6) {
                    var56 = client.field551 % 20 < 10 ? 16711680 : 16776960;
                }
                if (client.field391[var48] == 7) {
                    var56 = client.field551 % 20 < 10 ? 255 : 65535;
                }
                if (client.field391[var48] == 8) {
                    var56 = client.field551 % 20 < 10 ? 45056 : 8454016;
                }
                if (client.field391[var48] == 9) {
                    int var57 = 150 - client.field393[var48];
                    if (var57 < 50) {
                        var56 = var57 * 1280 + 16711680;
                    } else if (var57 < 100) {
                        var56 = 16776960 - (var57 - 50) * 327680;
                    } else if (var57 < 150) {
                        var56 = (var57 - 100) * 5 + 65280;
                    }
                }
                if (client.field391[var48] == 10) {
                    int var58 = 150 - client.field393[var48];
                    if (var58 < 50) {
                        var56 = var58 * 5 + 16711680;
                    } else if (var58 < 100) {
                        var56 = 16711935 - (var58 - 50) * 327680;
                    } else if (var58 < 150) {
                        var56 = (var58 - 100) * 327680 + 255 - (var58 - 100) * 5;
                    }
                }
                if (client.field391[var48] == 11) {
                    int var59 = 150 - client.field393[var48];
                    if (var59 < 50) {
                        var56 = 16777215 - var59 * 327685;
                    } else if (var59 < 100) {
                        var56 = (var59 - 50) * 327685 + 65280;
                    } else if (var59 < 150) {
                        var56 = 16777215 - (var59 - 100) * 327680;
                    }
                }
                if (client.field392[var48] == 0) {
                    field1093.method3726(var55, client.field553 + var13, client.field398 + var14, var56, 0);
                }
                if (client.field392[var48] == 1) {
                    field1093.method3728(var55, client.field553 + var13, client.field398 + var14, var56, 0, client.field551);
                }
                if (client.field392[var48] == 2) {
                    field1093.method3729(var55, client.field553 + var13, client.field398 + var14, var56, 0, client.field551);
                }
                if (client.field392[var48] == 3) {
                    field1093.method3719(var55, client.field553 + var13, client.field398 + var14, var56, 0, client.field551, 150 - client.field393[var48]);
                }
                if (client.field392[var48] == 4) {
                    int var60 = (150 - client.field393[var48]) * (field1093.method3794(var55) + 100) / 150;
                    class80.method1636(client.field553 + var13 - 50, var14, client.field553 + var13 + 50, var14 + var16);
                    field1093.method3724(var55, client.field553 + var13 + 50 - var60, client.field398 + var14, var56, 0);
                    class80.method1632(var13, var14, var13 + var15, var14 + var16);
                }
                if (client.field392[var48] == 5) {
                    int var61 = 150 - client.field393[var48];
                    int var62 = 0;
                    if (var61 < 25) {
                        var62 = var61 - 25;
                    } else if (var61 > 125) {
                        var62 = var61 - 125;
                    }
                    class80.method1636(var13, client.field398 + var14 - field1093.field3170 - 1, var13 + var15, client.field398 + var14 + 5);
                    field1093.method3726(var55, client.field553 + var13, client.field398 + var14 + var62, var56, 0);
                    class80.method1632(var13, var14, var13 + var15, var14 + var16);
                }
            } else {
                field1093.method3726(var55, client.field553 + var13, client.field398 + var14, 16776960, 0);
            }
        }
        if (client.field310 == 2) {
            client.method106((client.field477 - field2644 << 7) + client.field316, (client.field318 - field934 << 7) + client.field317, client.field359 * 2);
            if (client.field553 > -1 && client.field302 % 20 < 10) {
                field3186[0].method1554(client.field553 + var13 - 12, client.field398 + var14 - 28);
            }
        }
        ((class95) field1578).method1996(client.field566);
        if (client.field402 == 1) {
            field2951[client.field389 / 100].method1554(client.field399 - 8, client.field516 - 8);
        }
        if (client.field402 == 2) {
            field2951[client.field389 / 100 + 4].method1554(client.field399 - 8, client.field516 - 8);
        }
        client.field411 = 0;
        int var63 = (field162.field855 >> 7) + field2644;
        int var64 = (field162.field825 >> 7) + field934;
        if (var63 >= 3053 && var63 <= 3156 && var64 >= 3056 && var64 <= 3136) {
            client.field411 = 1;
        }
        if (var63 >= 3072 && var63 <= 3118 && var64 >= 9492 && var64 <= 9535) {
            client.field411 = 1;
        }
        if (client.field411 == 1 && var63 >= 3139 && var63 <= 3199 && var64 >= 3008 && var64 <= 3062) {
            client.field411 = 0;
        }
        field2892 = var32;
        field820 = var33;
        field1890 = var34;
        field96 = var35;
        field2200 = var36;
        if (client.field463) {
            byte var65 = 0;
            int var66 = class171.field2718 + class171.field2709 + var65;
            if (var66 == 0) {
                client.field463 = false;
            }
        }
        if (client.field463) {
            class80.method1638(var13, var14, var15, var16, 0);
            client.method578(class157.field2317, false);
        }
    }

    @ObfuscatedName("am.bm(B)V")
    public static final void method856() {
        for (int var0 = 0; var0 < client.field331; var0++) {
            int var1 = client.field332[var0];
            class35 var2 = client.field470[var1];
            int var3 = client.field335.method2310();
            if ((var3 & 0x10) != 0) {
                var2.field885 = client.field335.method2318();
                var2.field840 = 100;
            }
            if ((var3 & 0x4) != 0) {
                int var4 = client.field335.method2312();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = client.field335.method2447();
                if (var2.field839 == var4 && var4 != -1) {
                    int var6 = class43.method3831(var4).field1004;
                    if (var6 == 1) {
                        var2.field856 = 0;
                        var2.field863 = 0;
                        var2.field858 = var5;
                        var2.field859 = 0;
                    }
                    if (var6 == 2) {
                        var2.field859 = 0;
                    }
                } else if (var4 == -1 || var2.field839 == -1 || class43.method3831(var4).field1007 >= class43.method3831(var2.field839).field1007) {
                    var2.field839 = var4;
                    var2.field856 = 0;
                    var2.field863 = 0;
                    var2.field858 = var5;
                    var2.field859 = 0;
                    var2.field851 = var2.field882;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var7 = client.field335.method2345();
                int var8 = client.field335.method2312();
                int var9 = var2.field855 - (var7 - field2644 - field2644) * 64;
                int var10 = var2.field825 - (var8 - field934 - field934) * 64;
                if (var9 != 0 || var10 != 0) {
                    var2.field830 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x2) != 0) {
                int var11 = client.field335.method2447();
                int var12 = client.field335.method2362();
                var2.method705(var11, var12, client.field302);
                var2.field846 = client.field302 + 300;
                var2.field847 = client.field335.method2312();
                var2.field877 = client.field335.method2345();
            }
            if ((var3 & 0x8) != 0) {
                int var13 = client.field335.method2310();
                int var14 = client.field335.method2362();
                var2.method705(var13, var14, client.field302);
                var2.field846 = client.field302 + 300;
                var2.field847 = client.field335.method2312();
                var2.field877 = client.field335.method2345();
            }
            if ((var3 & 0x20) != 0) {
                var2.field852 = client.field335.method2312();
                int var15 = client.field335.method2356();
                var2.field864 = var15 >> 16;
                var2.field836 = (var15 & 0xFFFF) + client.field302;
                var2.field861 = 0;
                var2.field845 = 0;
                if (var2.field836 > client.field302) {
                    var2.field861 = -1;
                }
                if (var2.field852 == 65535) {
                    var2.field852 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field790 = class40.method151(client.field335.method2396());
                var2.field828 = var2.field790.field903;
                var2.field884 = var2.field790.field906;
                var2.field857 = var2.field790.field913;
                var2.field876 = var2.field790.field910;
                var2.field883 = var2.field790.field917;
                var2.field835 = var2.field790.field912;
                var2.field829 = var2.field790.field901;
                var2.field827 = var2.field790.field907;
                var2.field831 = var2.field790.field908;
            }
            if ((var3 & 0x80) != 0) {
                var2.field849 = client.field335.method2312();
                if (var2.field849 == 65535) {
                    var2.field849 = -1;
                }
            }
        }
    }

    @ObfuscatedName("l.bv(B)V")
    public static void method179() {
        if (!client.field444) {
            return;
        }
        class173 var0 = class173.method834(field1997, client.field454);
        if (var0 != null && var0.field2830 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field16 = var0.field2830;
            class37.method521(var1, 200000);
        }
        client.field444 = false;
        client.method645(var0);
    }
}
