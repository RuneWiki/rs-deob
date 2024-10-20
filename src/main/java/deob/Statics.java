package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Statics {

    @ObfuscatedName("ah.br")
    public static class169 field1001;

    @ObfuscatedName("ae.qr")
    public static int field1017;

    @ObfuscatedName("ae.i")
    public static class168 field1019;

    @ObfuscatedName("ae.qm")
    public static Frame field1023;

    @ObfuscatedName("ae.t")
    public static class144 field1024;

    @ObfuscatedName("aa.g")
    public static int field1031;

    @ObfuscatedName("aa.ee")
    public static class79 field1036;

    @ObfuscatedName("aa.pi")
    public static int field1039;

    @ObfuscatedName("aa.bi")
    public static class81[] field1040;

    @ObfuscatedName("au.d")
    public static byte[][] field1046;

    @ObfuscatedName("au.t")
    public static class168 field1047;

    @ObfuscatedName("au.k")
    public static boolean field1049;

    @ObfuscatedName("au.f")
    public static short[] field1050;

    @ObfuscatedName("au.bf")
    public static FontMetrics field1051;

    @ObfuscatedName("ab.t")
    public static class168 field1054;

    @ObfuscatedName("ab.c")
    public static int[] field1065;

    @ObfuscatedName("ab.kv")
    public static class132 field1069;

    @ObfuscatedName("ab.w")
    public static int[] field1070;

    @ObfuscatedName("am.l")
    public static int[] field1076;

    @ObfuscatedName("am.t")
    public static class168 field1077;

    @ObfuscatedName("am.f")
    public static byte[][][] field1082;

    @ObfuscatedName("am.v")
    public static class14 field1083;

    @ObfuscatedName("at.eb")
    public static class79[] field1095;

    @ObfuscatedName("at.nz")
    public static int field1097;

    @ObfuscatedName("az.t")
    public static class168 field1100;

    @ObfuscatedName("az.r")
    public static class79 field1101;

    @ObfuscatedName("az.jc")
    public static int field1103;

    @ObfuscatedName("af.t")
    public static class168 field1110;

    @ObfuscatedName("ax.cg")
    public static class144 field1113;

    @ObfuscatedName("ax.f")
    public static int field1126;

    @ObfuscatedName("ax.y")
    public static class225 field1133;

    @ObfuscatedName("ax.r")
    public static boolean field1161;

    @ObfuscatedName("ax.h")
    public static class168 field1164;

    @ObfuscatedName("ax.nf")
    public static class75 field1165;

    @ObfuscatedName("bf.i")
    public static int field1169;

    @ObfuscatedName("bf.t")
    public static class168 field1173;

    @ObfuscatedName("br.t")
    public static class54 field1179;

    @ObfuscatedName("bg.z")
    public static int field1185;

    @ObfuscatedName("bg.g")
    public static int field1195;

    @ObfuscatedName("t.at")
    public static long field12;

    @ObfuscatedName("bg.ff")
    public static int field1201;

    @ObfuscatedName("bg.rz")
    public static String field1205;

    @ObfuscatedName("bb.qx")
    public static Canvas field1222;

    @ObfuscatedName("bj.s")
    public static float field1247;

    @ObfuscatedName("bj.d")
    public static int field1249;

    @ObfuscatedName("f.go")
    public static class174 field127;

    @ObfuscatedName("bt.p")
    public static boolean[] field1278;

    @ObfuscatedName("bt.l")
    public static int[] field1281;

    @ObfuscatedName("bt.y")
    public static int[] field1283;

    @ObfuscatedName("bk.o")
    public static class61[] field1294;

    @ObfuscatedName("bk.b")
    public static class69[] field1295;

    @ObfuscatedName("bk.f")
    public static byte[] field1298;

    @ObfuscatedName("bk.s")
    public static int field1299;

    @ObfuscatedName("bk.d")
    public static int field1300;

    @ObfuscatedName("bk.l")
    public static int field1301;

    @ObfuscatedName("bk.p")
    public static class74[] field1303;

    @ObfuscatedName("bk.k")
    public static class68[] field1304;

    @ObfuscatedName("bk.j")
    public static boolean[] field1307;

    @ObfuscatedName("bk.ad")
    public static float[] field1309;

    @ObfuscatedName("bk.av")
    public static int[] field1312;

    @ObfuscatedName("bk.v")
    public static float[] field1314;

    @ObfuscatedName("bk.m")
    public static float[] field1315;

    @ObfuscatedName("bk.y")
    public static int field1316;

    @ObfuscatedName("bk.e")
    public static float[] field1317;

    @ObfuscatedName("bk.w")
    public static float[] field1318;

    @ObfuscatedName("bk.as")
    public static float[] field1319;

    @ObfuscatedName("s.j")
    public static int field132;

    @ObfuscatedName("bk.ag")
    public static float[] field1320;

    @ObfuscatedName("bk.al")
    public static int[] field1321;

    @ObfuscatedName("bk.a")
    public static int[] field1322;

    @ObfuscatedName("bs.mr")
    public static byte field1357;

    @ObfuscatedName("s.as")
    public static int[] field137;

    @ObfuscatedName("bo.bj")
    public static class169 field1372;

    @ObfuscatedName("bo.my")
    public static byte field1376;

    @ObfuscatedName("bc.eo")
    public static class79[] field1380;

    @ObfuscatedName("bp.r")
    public static int[] field1386;

    @ObfuscatedName("bp.i")
    public static int field1387;

    @ObfuscatedName("bp.t")
    public static int field1388;

    @ObfuscatedName("bp.h")
    public static int[] field1389;

    @ObfuscatedName("bp.fa")
    public static int field1391;

    @ObfuscatedName("bp.y")
    public static int[] field1392;

    @ObfuscatedName("bp.g")
    public static int field1393;

    @ObfuscatedName("bz.pm")
    public static class137 field1401;

    @ObfuscatedName("cv.b")
    public static int field1418;

    @ObfuscatedName("cv.k")
    public static int[] field1419;

    @ObfuscatedName("cv.o")
    public static int field1422;

    @ObfuscatedName("d.a")
    public static String[] field144;

    @ObfuscatedName("cb.ca")
    public static class225 field1441;

    @ObfuscatedName("ci.b")
    public static int[] field1455;

    @ObfuscatedName("ch.h")
    public static String[] field1462;

    @ObfuscatedName("ch.nr")
    public static int field1465;

    @ObfuscatedName("ch.y")
    public static class81 field1466;

    @ObfuscatedName("co.n")
    public static int field1472;

    @ObfuscatedName("co.w")
    public static int field1473;

    @ObfuscatedName("co.e")
    public static int field1474;

    @ObfuscatedName("co.a")
    public static int field1477;

    @ObfuscatedName("co.u")
    public static int field1488;

    @ObfuscatedName("co.c")
    public static int field1489;

    @ObfuscatedName("co.q")
    public static int field1491;

    @ObfuscatedName("co.x")
    public static int field1492;

    @ObfuscatedName("co.m")
    public static int field1494;

    @ObfuscatedName("co.bh")
    public static int field1496;

    @ObfuscatedName("co.as")
    public static int field1498;

    @ObfuscatedName("co.ag")
    public static int field1499;

    @ObfuscatedName("co.al")
    public static int field1500;

    @ObfuscatedName("co.bd")
    public static boolean[][] field1511;

    @ObfuscatedName("l.nd")
    public static int field152;

    @ObfuscatedName("co.ad")
    public static int field1521;

    @ObfuscatedName("co.v")
    public static int field1522;

    @ObfuscatedName("co.ba")
    public static int field1526;

    @ObfuscatedName("co.bg")
    public static int field1527;

    @ObfuscatedName("co.bn")
    public static int field1529;

    @ObfuscatedName("co.bb")
    public static int field1530;

    @ObfuscatedName("co.bw")
    public static int field1532;

    @ObfuscatedName("cc.br")
    public static class81 field1542;

    @ObfuscatedName("cc.bc")
    public static int field1543;

    @ObfuscatedName("l.fu")
    public static int field156;

    @ObfuscatedName("cy.co")
    public static class144 field1562;

    @ObfuscatedName("cy.dw")
    public static int field1566;

    @ObfuscatedName("l.nt")
    public static int field157;

    @ObfuscatedName("cy.pf")
    public static short[] field1570;

    @ObfuscatedName("cr.i")
    public static class168 field1573;

    @ObfuscatedName("cx.q")
    public static int field1588;

    @ObfuscatedName("cx.y")
    public static int field1590;

    @ObfuscatedName("cx.p")
    public static int field1591;

    @ObfuscatedName("cx.n")
    public static int field1592;

    @ObfuscatedName("cx.x")
    public static int field1594;

    @ObfuscatedName("cx.v")
    public static int field1595;

    @ObfuscatedName("cx.m")
    public static int field1596;

    @ObfuscatedName("cx.as")
    public static class93 field1600;

    @ObfuscatedName("cx.w")
    public static int field1601;

    @ObfuscatedName("y.qv")
    public static int field163;

    @ObfuscatedName("cs.q")
    public static int[] field1635;

    @ObfuscatedName("cs.ns")
    public static int field1637;

    @ObfuscatedName("y.z")
    public static int field164;

    @ObfuscatedName("cl.d")
    public static class213 field1642;

    @ObfuscatedName("cl.ae")
    public static String field1644;

    @ObfuscatedName("cl.nb")
    public static int field1645;

    @ObfuscatedName("cl.qs")
    public static class78 field1647;

    @ObfuscatedName("ce.de")
    public static int[] field1685;

    @ObfuscatedName("y.eh")
    public static class79[] field172;

    @ObfuscatedName("cz.ac")
    public static boolean field1756;

    @ObfuscatedName("cz.mp")
    public static class79 field1768;

    @ObfuscatedName("cp.b")
    public static int[][][] field1775;

    @ObfuscatedName("cp.n")
    public static String field1777;

    @ObfuscatedName("p.gc")
    public static class174 field178;

    @ObfuscatedName("cd.bg")
    public static class169 field1784;

    @ObfuscatedName("dk.bf")
    public static int field1857;

    @ObfuscatedName("dk.bi")
    public static int field1859;

    @ObfuscatedName("dk.br")
    public static int field1860;

    @ObfuscatedName("k.bf")
    public static class81[] field187;

    @ObfuscatedName("dt.r")
    public static int field1876;

    @ObfuscatedName("dt.bw")
    public static class169 field1879;

    @ObfuscatedName("dt.kn")
    public static class20 field1880;

    @ObfuscatedName("db.bq")
    public static int field1887;

    @ObfuscatedName("i.jn")
    public static class174[] field19;

    @ObfuscatedName("ds.ey")
    public static class79[] field1909;

    @ObfuscatedName("dq.r")
    public static class73 field1913;

    @ObfuscatedName("dq.qh")
    public static int field1916;

    @ObfuscatedName("dq.z")
    public static class81[] field1917;

    @ObfuscatedName("di.bs")
    public static int field1940;

    @ObfuscatedName("di.ax")
    public static class81[] field1957;

    @ObfuscatedName("dz.b")
    public static int field1958;

    @ObfuscatedName("de.p")
    public static int[] field1975;

    @ObfuscatedName("dp.i")
    public static long field1979;

    @ObfuscatedName("dp.t")
    public static long field1980;

    @ObfuscatedName("dp.dg")
    public static byte[][] field1981;

    @ObfuscatedName("dc.pg")
    public static class9 field1989;

    @ObfuscatedName("dc.pw")
    public static GarbageCollectorMXBean field1990;

    @ObfuscatedName("dr.n")
    public static int[] field2006;

    @ObfuscatedName("dx.bh")
    public static class169 field2029;

    @ObfuscatedName("du.iz")
    public static int field2039;

    @ObfuscatedName("o.bn")
    public static class169 field204;

    @ObfuscatedName("do.q")
    public static String field2041;

    @ObfuscatedName("dh.qu")
    public static int field2050;

    @ObfuscatedName("o.fj")
    public static int field206;

    @ObfuscatedName("dn.ii")
    public static int field2060;

    @ObfuscatedName("dn.s")
    public static short[][] field2061;

    @ObfuscatedName("dl.nj")
    public static class56 field2066;

    @ObfuscatedName("dl.bl")
    public static class169 field2068;

    @ObfuscatedName("es.qz")
    public static int field2078;

    @ObfuscatedName("es.lz")
    public static class131 field2080;

    @ObfuscatedName("es.g")
    public static class81 field2082;

    @ObfuscatedName("es.ib")
    public static class174 field2083;

    @ObfuscatedName("et.qk")
    public static int field2087;

    @ObfuscatedName("ef.o")
    public static class229[] field2094;

    @ObfuscatedName("ef.ng")
    public static int field2096;

    @ObfuscatedName("b.f")
    public static int[] field210;

    @ObfuscatedName("ea.s")
    public static class81 field2102;

    @ObfuscatedName("ea.i")
    public static File field2104;

    @ObfuscatedName("ea.d")
    public static short[] field2107;

    @ObfuscatedName("ek.t")
    public static String field2115;

    @ObfuscatedName("ek.i")
    public static String field2125;

    @ObfuscatedName("b.s")
    public static int[] field214;

    @ObfuscatedName("ez.cm")
    public static int field2143;

    @ObfuscatedName("b.eu")
    public static class79[] field215;

    @ObfuscatedName("ep.ba")
    public static class169 field2162;

    @ObfuscatedName("ep.fn")
    public static int field2165;

    @ObfuscatedName("ee.au")
    public static class144 field2168;

    @ObfuscatedName("ee.ak")
    public static class147 field2169;

    @ObfuscatedName("ee.g")
    public static String field2170;

    @ObfuscatedName("er.pv")
    public static int field2174;

    @ObfuscatedName("er.hj")
    public static int field2177;

    @ObfuscatedName("er.pz")
    public static class222 field2180;

    @ObfuscatedName("eo.j")
    public static class120 field2202;

    @ObfuscatedName("ev.f")
    public static int field2205;

    @ObfuscatedName("ev.t")
    public static class168 field2207;

    @ObfuscatedName("eu.iy")
    public static int field2209;

    @ObfuscatedName("eu.do")
    public static int field2223;

    @ObfuscatedName("eh.nk")
    public static int field2231;

    @ObfuscatedName("j.az")
    public static class169 field224;

    @ObfuscatedName("eh.ax")
    public static class169 field2242;

    @ObfuscatedName("eh.en")
    public static class81[] field2244;

    @ObfuscatedName("ey.i")
    public static Applet field2258;

    @ObfuscatedName("ey.qa")
    public static Font field2263;

    @ObfuscatedName("en.r")
    public static int field2266;

    @ObfuscatedName("en.eq")
    public static class79[] field2267;

    @ObfuscatedName("en.z")
    public static File field2271;

    @ObfuscatedName("en.j")
    public static String[] field2272;

    @ObfuscatedName("en.x")
    public static String field2273;

    @ObfuscatedName("ex.ed")
    public static class79[] field2286;

    @ObfuscatedName("ex.d")
    public static int field2287;

    @ObfuscatedName("el.ny")
    public static int field2301;

    @ObfuscatedName("el.hd")
    public static class3 field2302;

    @ObfuscatedName("u.na")
    public static class57 field248;

    @ObfuscatedName("u.ew")
    public static class81[] field249;

    @ObfuscatedName("c.k")
    public static int[] field251;

    @ObfuscatedName("fj.pn")
    public static Clipboard field2624;

    @ObfuscatedName("fx.qp")
    public static Image field2627;

    @ObfuscatedName("fg.be")
    public static String field2671;

    @ObfuscatedName("fg.h")
    public static byte[][][] field2673;

    @ObfuscatedName("fh.w")
    public static int[] field2679;

    @ObfuscatedName("fi.h")
    public static int field2681;

    @ObfuscatedName("fi.r")
    public static class168 field2682;

    @ObfuscatedName("fm.z")
    public static int[] field2690;

    @ObfuscatedName("fm.da")
    public static int[] field2692;

    @ObfuscatedName("fm.ep")
    public static class79 field2696;

    @ObfuscatedName("i.cq")
    public static class225 field27;

    @ObfuscatedName("n.fg")
    public static int field270;

    @ObfuscatedName("fw.ch")
    public static class147 field2700;

    @ObfuscatedName("fp.af")
    public static class79[] field2718;

    @ObfuscatedName("n.x")
    public static int[] field272;

    @ObfuscatedName("n.bd")
    public static class169 field273;

    @ObfuscatedName("ft.g")
    public static long field2743;

    @ObfuscatedName("n.mj")
    public static int field275;

    @ObfuscatedName("ft.o")
    public static class173 field2760;

    @ObfuscatedName("fb.o")
    public static String field2767;

    @ObfuscatedName("n.mi")
    public static class25[] field279;

    @ObfuscatedName("fr.i")
    public static boolean[] field2801;

    @ObfuscatedName("client.i")
    public static client field281;

    @ObfuscatedName("fr.h")
    public static class168 field2837;

    @ObfuscatedName("client.r")
    public static class154 field285;

    @ObfuscatedName("fr.g")
    public static class168 field2854;

    @ObfuscatedName("i.jx")
    public static int field29;

    @ObfuscatedName("client.b")
    public static String field290;

    @ObfuscatedName("client.a")
    public static int field291;

    @ObfuscatedName("client.ga")
    public static class174 field292;

    @ObfuscatedName("fk.t")
    public static class168 field2929;

    @ObfuscatedName("fc.p")
    public static class174 field2936;

    @ObfuscatedName("fc.t")
    public static class168 field2937;

    @ObfuscatedName("fs.l")
    public static short[][] field2941;

    @ObfuscatedName("gd.p")
    public static class181 field2975;

    @ObfuscatedName("gd.g")
    public static class168 field2976;

    @ObfuscatedName("gd.h")
    public static class185 field2977;

    @ObfuscatedName("gd.s")
    public static int field2978;

    @ObfuscatedName("gd.t")
    public static class168 field2979;

    @ObfuscatedName("gd.l")
    public static int field2981;

    @ObfuscatedName("gh.bb")
    public static class169 field3025;

    @ObfuscatedName("gf.n")
    public static class120 field3064;

    @ObfuscatedName("gi.qb")
    public static class134 field3082;

    @ObfuscatedName("client.aa")
    public static class147 field313;

    @ObfuscatedName("hn.i")
    public static class168 field3141;

    @ObfuscatedName("hw.s")
    public static class155 field3159;

    @ObfuscatedName("hw.dr")
    public static class87 field3162;

    @ObfuscatedName("hp.g")
    public static int[] field3168;

    @ObfuscatedName("hp.t")
    public static class174[][] field3169;

    @ObfuscatedName("hq.t")
    public static class168 field3170;

    @ObfuscatedName("hq.i")
    public static class168 field3171;

    @ObfuscatedName("hm.t")
    public static class114 field3186;

    @ObfuscatedName("hs.l")
    public static class81[] field3196;

    @ObfuscatedName("ha.z")
    public static class168 field3219;

    @ObfuscatedName("client.no")
    public static class57 field332;

    @ObfuscatedName("i.ah")
    public static int field34;

    @ObfuscatedName("client.dp")
    public static int[] field344;

    @ObfuscatedName("client.dk")
    public static int field359;

    @ObfuscatedName("client.pk")
    public static long field560;

    @ObfuscatedName("client.iq")
    public static class31 field567;

    @ObfuscatedName("x.h")
    public static boolean field576;

    @ObfuscatedName("x.bi")
    public static class169 field577;

    @ObfuscatedName("v.dd")
    public static byte[][] field588;

    @ObfuscatedName("v.k")
    public static class60 field591;

    @ObfuscatedName("w.r")
    public static class168 field615;

    @ObfuscatedName("w.ic")
    public static class174 field618;

    @ObfuscatedName("w.ev")
    public static class79[] field619;

    @ObfuscatedName("w.pu")
    public static class135 field621;

    @ObfuscatedName("w.kg")
    public static int field625;

    @ObfuscatedName("w.cc")
    public static char field626;

    @ObfuscatedName("g.pe")
    public static class161 field63;

    @ObfuscatedName("e.z")
    public static class26[] field637;

    @ObfuscatedName("ad.hg")
    public static int field654;

    @ObfuscatedName("as.hc")
    public static int field669;

    @ObfuscatedName("as.ig")
    public static int field670;

    @ObfuscatedName("ag.rn")
    public static boolean field671;

    @ObfuscatedName("ag.nn")
    public static int field673;

    @ObfuscatedName("h.bx")
    public static class169 field68;

    @ObfuscatedName("al.qc")
    public static int field691;

    @ObfuscatedName("al.y")
    public static boolean field695;

    @ObfuscatedName("h.ix")
    public static int field70;

    @ObfuscatedName("av.e")
    public static int[] field701;

    @ObfuscatedName("ar.h")
    public static class81 field705;

    @ObfuscatedName("ar.f")
    public static class79 field706;

    @ObfuscatedName("ar.d")
    public static class81[] field712;

    @ObfuscatedName("ar.t")
    public static boolean field717;

    @ObfuscatedName("z.l")
    public static class81 field72;

    @ObfuscatedName("ar.db")
    public static int field733;

    @ObfuscatedName("ay.ps")
    public static int field746;

    @ObfuscatedName("ay.dc")
    public static int[][] field747;

    @ObfuscatedName("ay.ad")
    public static int[] field753;

    @ObfuscatedName("ay.gp")
    public static int field755;

    @ObfuscatedName("aq.z")
    public static class168 field762;

    @ObfuscatedName("aq.af")
    public static class169 field766;

    @ObfuscatedName("z.bu")
    public static class169 field77;

    @ObfuscatedName("ai.h")
    public static File field775;

    @ObfuscatedName("an.er")
    public static class81[] field782;

    @ObfuscatedName("an.bo")
    public static int field783;

    @ObfuscatedName("aw.y")
    public static class174 field794;

    @ObfuscatedName("z.cz")
    public static class225 field80;

    @ObfuscatedName("z.fx")
    public static int field82;

    @ObfuscatedName("r.r")
    public static byte[][][] field87;

    @ObfuscatedName("ak.du")
    public static int field873;

    @ObfuscatedName("ac.i")
    public static class168 field879;

    @ObfuscatedName("r.z")
    public static byte[][][] field88;

    @ObfuscatedName("r.d")
    public static int[][] field89;

    @ObfuscatedName("r.o")
    public static int[] field90;

    @ObfuscatedName("ac.t")
    public static class168 field906;

    @ObfuscatedName("r.s")
    public static byte[][][] field93;

    @ObfuscatedName("ao.g")
    public static class168 field935;

    @ObfuscatedName("ao.dt")
    public static int field965;

    @ObfuscatedName("ao.ha")
    public static int field966;

    @ObfuscatedName("aj.qf")
    public static int field967;

    @ObfuscatedName("aj.l")
    public static class19 field970;

    @ObfuscatedName("ah.t")
    public static class168 field994;

    @ObfuscatedName("ah.i")
    public static class168 field997;

    @ObfuscatedName("ah.g")
    public static class168 field999;

    @ObfuscatedName("fl.t(II)Z")
    public static boolean method2922(int arg0) {
        return (arg0 & 0x1) != 0;
    }

    @ObfuscatedName("ea.t(Ljava/lang/String;ZZI)V")
    public static void method2683(String arg0, boolean arg1, boolean arg2) {
        class139.method2926(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("cp.i([BIII)Ljava/lang/String;")
    public static String method2088(byte[] arg0, int arg1, int arg2) {
        char[] var3 = new char[arg2];
        int var4 = 0;
        int var5 = arg1;
        int var6 = arg1 + arg2;
        while (var5 < var6) {
            int var7 = arg0[var5++] & 0xFF;
            int var8;
            if (var7 < 128) {
                if (var7 == 0) {
                    var8 = 65533;
                } else {
                    var8 = var7;
                }
            } else if (var7 < 192) {
                var8 = 65533;
            } else if (var7 < 224) {
                if (var5 < var6 && (arg0[var5] & 0xC0) == 128) {
                    var8 = (var7 & 0x1F) << 6 | arg0[var5++] & 0x3F;
                    if (var8 < 128) {
                        var8 = 65533;
                    }
                } else {
                    var8 = 65533;
                }
            } else if (var7 < 240) {
                if (var5 + 1 < var6 && (arg0[var5] & 0xC0) == 128 && (arg0[var5 + 1] & 0xC0) == 128) {
                    var8 = (var7 & 0xF) << 12 | (arg0[var5++] & 0x3F) << 6 | arg0[var5++] & 0x3F;
                    if (var8 < 2048) {
                        var8 = 65533;
                    }
                } else {
                    var8 = 65533;
                }
            } else if (var7 >= 248) {
                var8 = 65533;
            } else if (var5 + 2 < var6 && (arg0[var5] & 0xC0) == 128 && (arg0[var5 + 1] & 0xC0) == 128 && (arg0[var5 + 2] & 0xC0) == 128) {
                int var9 = (var7 & 0x7) << 18 | (arg0[var5++] & 0x3F) << 12 | (arg0[var5++] & 0x3F) << 6 | arg0[var5++] & 0x3F;
                if (var9 >= 65536 && var9 <= 1114111) {
                    var8 = 65533;
                } else {
                    var8 = 65533;
                }
            } else {
                var8 = 65533;
            }
            var3[var4++] = (char) var8;
        }
        return new String(var3, 0, var4);
    }

    @ObfuscatedName("cl.t(JLjava/lang/String;I)I")
    public static final int method2000(long arg0, String arg1) {
        Random var3 = new Random();
        class120 var4 = new class120(128);
        class120 var5 = new class120(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2293(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2296(var3.nextInt());
        }
        var4.method2296(var6[0]);
        var4.method2296(var6[1]);
        var4.method2303(arg0);
        var4.method2303(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2296(var3.nextInt());
        }
        var4.method2480(class10.field151, class10.field160);
        var5.method2293(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2296(var3.nextInt());
        }
        var5.method2303(var3.nextLong());
        var5.method2297(var3.nextLong());
        class150.method888(var5);
        var5.method2303(var3.nextLong());
        var5.method2480(class10.field151, class10.field160);
        int var10 = class120.method2086(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class120 var11 = new class120(var10);
        var11.method2426(arg1);
        var11.field2001 = var10;
        var11.method2500(var6);
        class120 var12 = new class120(var11.field2001 + var5.field2001 + var4.field2001 + 5);
        var12.method2293(2);
        var12.method2293(var4.field2001);
        var12.method2302(var4.field2002, 0, var4.field2001);
        var12.method2293(var5.field2001);
        var12.method2302(var5.field2002, 0, var5.field2001);
        var12.method2294(var11.field2001);
        var12.method2302(var11.field2002, 0, var11.field2001);
        byte[] var13 = var12.field2002;
        int var14 = var13.length;
        StringBuilder var15 = new StringBuilder();
        for (int var16 = 0; var16 < var14; var16 += 3) {
            int var17 = var13[var16] & 0xFF;
            var15.append(class162.field2669[var17 >>> 2]);
            if (var16 < var14 - 1) {
                int var18 = var13[var16 + 1] & 0xFF;
                var15.append(class162.field2669[(var17 & 0x3) << 4 | var18 >>> 4]);
                if (var16 < var14 - 2) {
                    int var19 = var13[var16 + 2] & 0xFF;
                    var15.append(class162.field2669[(var18 & 0xF) << 2 | var19 >>> 6]).append(class162.field2669[var19 & 0x3F]);
                } else {
                    var15.append(class162.field2669[(var18 & 0xF) << 2]).append("=");
                }
            } else {
                var15.append(class162.field2669[(var17 & 0x3) << 4]).append("==");
            }
        }
        String var20 = var15.toString();
        String var22 = var20;
        try {
            URL var23 = new URL(client.method158("services", false) + "m=accountappeal/login.ws");
            URLConnection var24 = var23.openConnection();
            var24.setDoInput(true);
            var24.setDoOutput(true);
            var24.setConnectTimeout(5000);
            OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
            var25.write("data2=" + class227.method2684(var22) + "&dest=" + class227.method2684("passwordchoice.ws"));
            var25.flush();
            InputStream var26 = var24.getInputStream();
            class120 var27 = new class120(new byte[1000]);
            do {
                int var28 = var26.read(var27.field2002, var27.field2001, 1000 - var27.field2001);
                if (var28 == -1) {
                    var25.close();
                    var26.close();
                    String var29 = new String(var27.field2002);
                    if (var29.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var29.startsWith("WRONG")) {
                        return 7;
                    } else if (var29.startsWith("RELOAD")) {
                        return 3;
                    } else if (var29.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var27.method2325(var6);
                        while (var27.field2001 > 0 && var27.field2002[var27.field2001 - 1] == 0) {
                            var27.field2001--;
                        }
                        String var30 = new String(var27.field2002, 0, var27.field2001);
                        if (class10.method943(var30)) {
                            method2683(var30, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var27.field2001 += var28;
            } while (var27.field2001 < 1000);
            return 5;
        } catch (Throwable var32) {
            var32.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("ej.h(IZB)Ljava/lang/String;")
    public static String method2914(int arg0, boolean arg1) {
        return arg1 && arg0 >= 0 ? class164.method2966(arg0, 10, arg1) : Integer.toString(arg0);
    }

    @ObfuscatedName("r.r(II)I")
    public static int method67(int arg0) {
        class36 var1 = (class36) class12.field181.method3498((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (class12.field175.field3111 == var1.field3116) {
            return -1;
        } else {
            return ((class36) var1.field3116).field781;
        }
    }

    @ObfuscatedName("d.g([Le;II[I[IB)V")
    public static void method99(class26[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class26 var8 = arg0[var7];
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
                        var11 = arg0[var6].field639;
                        var12 = var8.field639;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field640;
                        var12 = var8.field640;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method570() ? 1 : 0;
                        var12 = var8.method570() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field638;
                        var12 = var8.field638;
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
                        var15 = arg0[var5].field639;
                        var16 = var8.field639;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field640;
                        var16 = var8.field640;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method570() ? 1 : 0;
                        var16 = var8.method570() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field638;
                        var16 = var8.field638;
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
                class26 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method99(arg0, arg1, var6, arg3, arg4);
        method99(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ey.s(S)V")
    public static void method2878() {
        class45.field1027.method3454();
    }

    @ObfuscatedName("az.k(I)Lcj;")
    public static class79 method950() {
        class79 var0 = new class79();
        var0.field1409 = field1387;
        var0.field1412 = field1393;
        var0.field1407 = field1389[0];
        var0.field1408 = field2690[0];
        var0.field1405 = field1386[0];
        var0.field1406 = field210[0];
        int var1 = var0.field1406 * var0.field1405;
        byte[] var2 = field1046[0];
        var0.field1410 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1410[var3] = field214[var2[var3] & 0xFF];
        }
        class77.method155();
        return var0;
    }

    @ObfuscatedName("fi.j([BI)V")
    public static void method2962(byte[] arg0) {
        class120 var1 = new class120(arg0);
        var1.field2001 = arg0.length - 2;
        field1388 = var1.method2310();
        field1389 = new int[field1388];
        field2690 = new int[field1388];
        field1386 = new int[field1388];
        field210 = new int[field1388];
        field1046 = new byte[field1388][];
        var1.field2001 = arg0.length - 7 - field1388 * 8;
        field1387 = var1.method2310();
        field1393 = var1.method2310();
        int var2 = (var1.method2334() & 0xFF) + 1;
        for (int var3 = 0; var3 < field1388; var3++) {
            field1389[var3] = var1.method2310();
        }
        for (int var4 = 0; var4 < field1388; var4++) {
            field2690[var4] = var1.method2310();
        }
        for (int var5 = 0; var5 < field1388; var5++) {
            field1386[var5] = var1.method2310();
        }
        for (int var6 = 0; var6 < field1388; var6++) {
            field210[var6] = var1.method2310();
        }
        var1.field2001 = arg0.length - 7 - field1388 * 8 - (var2 - 1) * 3;
        field214 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            field214[var7] = var1.method2312();
            if (field214[var7] == 0) {
                field214[var7] = 1;
            }
        }
        var1.field2001 = 0;
        for (int var8 = 0; var8 < field1388; var8++) {
            int var9 = field1386[var8];
            int var10 = field210[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            field1046[var8] = var12;
            int var13 = var1.method2334();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2309();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2309();
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.y(I)V")
    public static void method204() {
        class43.field981.method3454();
        class43.field985.method3454();
    }

    @ObfuscatedName("ev.z(Ldx;IB)V")
    public static void method2783(class123 arg0, int arg1) {
        boolean var2 = arg0.method2553(1) == 1;
        if (var2) {
            class33.field750[++class33.field749 - 1] = arg1;
        }
        int var3 = arg0.method2553(2);
        class3 var4 = client.field406[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field49 = false;
            } else if (client.field461 == arg1) {
                throw new RuntimeException();
            } else {
                class33.field757[arg1] = (field359 + var4.field840[0] >> 6) + (field1566 + var4.field848[0] >> 6 << 14) + (var4.field58 << 28);
                if (var4.field831 == -1) {
                    class33.field748[arg1] = var4.field832;
                } else {
                    class33.field748[arg1] = var4.field831;
                }
                class33.field741[arg1] = var4.field829;
                client.field406[arg1] = null;
                if (arg0.method2553(1) != 0) {
                    class33.method2246(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method2553(3);
            int var6 = var4.field848[0];
            int var7 = var4.field840[0];
            if (var5 == 0) {
                var6--;
                var7--;
            } else if (var5 == 1) {
                var7--;
            } else if (var5 == 2) {
                var6++;
                var7--;
            } else if (var5 == 3) {
                var6--;
            } else if (var5 == 4) {
                var6++;
            } else if (var5 == 5) {
                var6--;
                var7++;
            } else if (var5 == 6) {
                var7++;
            } else if (var5 == 7) {
                var6++;
                var7++;
            }
            if (client.field461 == arg1 && var4.field810 < 1536 || var4.field805 < 1536 || var4.field810 >= 11776 || var4.field805 >= 11776) {
                var4.method30(var6, var7);
                var4.field49 = false;
            } else if (var2) {
                var4.field49 = true;
                var4.field45 = var6;
                var4.field62 = var7;
            } else {
                var4.field49 = false;
                var4.method12(var6, var7, class33.field740[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method2553(4);
            int var9 = var4.field848[0];
            int var10 = var4.field840[0];
            if (var8 == 0) {
                var9 -= 2;
                var10 -= 2;
            } else if (var8 == 1) {
                var9--;
                var10 -= 2;
            } else if (var8 == 2) {
                var10 -= 2;
            } else if (var8 == 3) {
                var9++;
                var10 -= 2;
            } else if (var8 == 4) {
                var9 += 2;
                var10 -= 2;
            } else if (var8 == 5) {
                var9 -= 2;
                var10--;
            } else if (var8 == 6) {
                var9 += 2;
                var10--;
            } else if (var8 == 7) {
                var9 -= 2;
            } else if (var8 == 8) {
                var9 += 2;
            } else if (var8 == 9) {
                var9 -= 2;
                var10++;
            } else if (var8 == 10) {
                var9 += 2;
                var10++;
            } else if (var8 == 11) {
                var9 -= 2;
                var10 += 2;
            } else if (var8 == 12) {
                var9--;
                var10 += 2;
            } else if (var8 == 13) {
                var10 += 2;
            } else if (var8 == 14) {
                var9++;
                var10 += 2;
            } else if (var8 == 15) {
                var9 += 2;
                var10 += 2;
            }
            if (client.field461 == arg1 && var4.field810 < 1536 || var4.field805 < 1536 || var4.field810 >= 11776 || var4.field805 >= 11776) {
                var4.method30(var9, var10);
                var4.field49 = false;
            } else if (var2) {
                var4.field49 = true;
                var4.field45 = var9;
                var4.field62 = var10;
            } else {
                var4.field49 = false;
                var4.method12(var9, var10, class33.field740[arg1]);
            }
        } else {
            int var11 = arg0.method2553(1);
            if (var11 == 0) {
                int var12 = arg0.method2553(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field848[0] + var14;
                int var17 = var4.field840[0] + var15;
                if (client.field461 == arg1 && var4.field810 < 1536 || var4.field805 < 1536 || var4.field810 >= 11776 || var4.field805 >= 11776) {
                    var4.method30(var16, var17);
                    var4.field49 = false;
                } else if (var2) {
                    var4.field49 = true;
                    var4.field45 = var16;
                    var4.field62 = var17;
                } else {
                    var4.field49 = false;
                    var4.method12(var16, var17, class33.field740[arg1]);
                }
                var4.field58 = (byte) (var4.field58 + var13 & 0x3);
                if (client.field461 == arg1) {
                    field755 = var4.field58;
                }
            } else {
                int var18 = arg0.method2553(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (field1566 + var4.field848[0] + var20 & 0x3FFF) - field1566;
                int var23 = (field359 + var4.field840[0] + var21 & 0x3FFF) - field359;
                if (client.field461 == arg1 && var4.field810 < 1536 || var4.field805 < 1536 || var4.field810 >= 11776 || var4.field805 >= 11776) {
                    var4.method30(var22, var23);
                    var4.field49 = false;
                } else if (var2) {
                    var4.field49 = true;
                    var4.field45 = var22;
                    var4.field62 = var23;
                } else {
                    var4.field49 = false;
                    var4.method12(var22, var23, class33.field740[arg1]);
                }
                var4.field58 = (byte) (var4.field58 + var19 & 0x3);
                if (client.field461 == arg1) {
                    field755 = var4.field58;
                }
            }
        }
    }

    @ObfuscatedName("bb.f(II)V")
    public static final void method1178(int arg0) {
        short var1 = 256;
        class32.field715 += arg0 * 128;
        if (class32.field715 > field2679.length) {
            class32.field715 -= field2679.length;
            int var2 = (int) (Math.random() * 12.0D);
            class32.method2785(field1917[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = field753[var3 + var4] - field2679[class32.field715 + var3 & field2679.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            field753[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    field753[var9 + var10] = 255;
                } else {
                    field753[var9 + var10] = 0;
                }
            }
        }
        if (class32.field710 > 0) {
            class32.field710 -= arg0 * 4;
        }
        if (class32.field711 > 0) {
            class32.field711 -= arg0 * 4;
        }
        if (class32.field710 == 0 && class32.field711 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                class32.field710 = 1024;
            }
            if (var12 == 1) {
                class32.field711 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            class32.field708[var13] = class32.field708[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            class32.field708[var14] = (int) (Math.sin((double) class32.field721 / 14.0D) * 16.0D + Math.sin((double) class32.field721 / 15.0D) * 14.0D + Math.sin((double) class32.field721 / 16.0D) * 12.0D);
            class32.field721++;
        }
        class32.field730 += arg0 * 1726607909;
        int var15 = ((client.field333 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class32.field730 * 1313671060; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            field753[(var18 << 7) + var17] = 192;
        }
        class32.field730 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += field753[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= field753[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    field137[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += field137[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= field137[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    field753[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("ck.ao(B)V")
    public static void method1985() {
        int var0 = client.field2227;
        int var1 = client.field2243;
        int var2 = field2050 - field163 - var0;
        int var3 = field1916 - field967 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = field281.method2860();
            int var5 = 0;
            int var6 = 0;
            if (field1023 == var4) {
                Insets var7 = field1023.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, field1916);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, field2050, var1);
            }
            if (var2 > 0) {
                var8.fillRect(field2050 + var5 - var2, var6, var2, field1916);
            }
            if (var3 > 0) {
                var8.fillRect(var5, field1916 + var6 - var3, field2050, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("p.au(Laq;B)V")
    public static final void method121(class34 arg0) {
        if (field2302.field810 >> 7 == client.field546 && field2302.field805 >> 7 == client.field518) {
            client.field546 = 0;
        }
        int var1 = class33.field742;
        int[] var2 = class33.field743;
        int var3 = var1;
        if (class34.field767 == arg0 || class34.field759 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field767 == arg0) {
                var5 = field2302;
                var6 = field2302.field59 << 14;
            } else if (class34.field759 == arg0) {
                var5 = client.field406[client.field485];
                var6 = client.field485 << 14;
            } else {
                var5 = client.field406[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field761 == arg0 && client.field485 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method25() && !var5.field57) {
                var5.field52 = false;
                if ((client.field288 && var1 > 50 || var1 > 200) && class34.field767 != arg0 && var5.field828 == var5.field809) {
                    var5.field52 = true;
                }
                int var7 = var5.field810 >> 7;
                int var8 = var5.field805 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field36 == null || client.field333 < var5.field54 || client.field333 >= var5.field46) {
                        if ((var5.field810 & 0x7F) == 64 && (var5.field805 & 0x7F) == 64) {
                            if (client.field389 == client.field388[var7][var8]) {
                                continue;
                            }
                            client.field388[var7][var8] = client.field389;
                        }
                        var5.field44 = client.method138(var5.field810, var5.field805, field755);
                        field3162.method1764(field755, var5.field810, var5.field805, var5.field44, 60, var5, var5.field806, var6, var5.field807);
                    } else {
                        var5.field52 = false;
                        var5.field44 = client.method138(var5.field810, var5.field805, field755);
                        field3162.method1839(field755, var5.field810, var5.field805, var5.field44, 60, var5, var5.field806, var6, var5.field61, var5.field50, var5.field37, var5.field51);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.dw(Lfr;III)V")
    public static final void method83(class174 arg0, int arg1, int arg2) {
        if (client.field456 != null || client.field424 || arg0 == null) {
            return;
        }
        class174 var3 = arg0;
        int var4 = class179.method630(client.method2739(arg0));
        class174 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class174.method3117(var3.field2796);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class174 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2852;
        }
        if (var7 == null) {
            return;
        }
        client.field456 = arg0;
        class174 var9 = arg0;
        int var10 = class179.method630(client.method2739(arg0));
        class174 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class174.method3117(var9.field2796);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class174 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2852;
        }
        client.field457 = var13;
        client.field492 = arg1;
        client.field349 = arg2;
        field29 = 0;
        client.field514 = false;
        if (client.field295 > 0) {
            client.method2620(client.field295 - 1);
        }
        return;
    }

    @ObfuscatedName("bp.dm(IB)V")
    public static final void method1528(int arg0) {
        client.method151();
        class24.method1725();
        int var1 = class53.method548(arg0).field1172;
        if (var1 == 0) {
            return;
        }
        int var2 = class177.field2924[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class92.method1916(0.9D);
                ((class96) field1600).method1991(0.9D);
            }
            if (var2 == 2) {
                class92.method1916(0.8D);
                ((class96) field1600).method1991(0.8D);
            }
            if (var2 == 3) {
                class92.method1916(0.7D);
                ((class96) field1600).method1991(0.7D);
            }
            if (var2 == 4) {
                class92.method1916(0.6D);
                ((class96) field1600).method1991(0.6D);
            }
            class52.method857();
        }
        if (var1 == 3) {
            short var3 = 0;
            if (var2 == 0) {
                var3 = 255;
            }
            if (var2 == 1) {
                var3 = 192;
            }
            if (var2 == 2) {
                var3 = 128;
            }
            if (var2 == 3) {
                var3 = 64;
            }
            if (var2 == 4) {
                var3 = 0;
            }
            if (client.field520 != var3) {
                if (client.field520 == 0 && client.field521 != -1) {
                    class184.method2084(field1784, client.field521, 0, var3, false);
                    client.field522 = false;
                } else if (var3 == 0) {
                    class184.method3137();
                    client.field522 = false;
                } else if (class184.field2982 == 0) {
                    field2977.method3369(var3);
                } else {
                    field2287 = var3;
                }
                client.field520 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                client.field561 = 127;
            }
            if (var2 == 1) {
                client.field561 = 96;
            }
            if (var2 == 2) {
                client.field561 = 64;
            }
            if (var2 == 3) {
                client.field561 = 32;
            }
            if (var2 == 4) {
                client.field561 = 0;
            }
        }
        if (var1 == 5) {
            client.field423 = var2;
        }
        if (var1 == 6) {
            client.field445 = var2;
        }
        if (var1 == 9) {
            client.field451 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                client.field375 = 127;
            }
            if (var2 == 1) {
                client.field375 = 96;
            }
            if (var2 == 2) {
                client.field375 = 64;
            }
            if (var2 == 3) {
                client.field375 = 32;
            }
            if (var2 == 4) {
                client.field375 = 0;
            }
        }
        if (var1 == 17) {
            client.field371 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class21[] var4 = new class21[] { class21.field570, class21.field572, class21.field574, class21.field571 };
            client.field310 = (class21) class110.method632(var4, var2);
            if (client.field310 == null) {
                client.field310 = class21.field570;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                client.field485 = -1;
            } else {
                client.field485 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class21[] var5 = new class21[] { class21.field570, class21.field572, class21.field574, class21.field571 };
        client.field459 = (class21) class110.method632(var5, var2);
        if (client.field459 == null) {
            client.field459 = class21.field570;
        }
    }

    @ObfuscatedName("f.dj(IIIILcj;Lfv;I)V")
    public static final void method75(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = client.field356 + client.field303 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class92.field1603[var6];
        int var9 = class92.field1604[var6];
        int var10 = var8 * 256 / (client.field358 + 256);
        int var11 = var9 * 256 / (client.field358 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1566(arg5.field2919 / 2 + var12 - arg4.field1409 / 2, arg5.field2918 / 2 - var13 - arg4.field1412 / 2, arg0, arg1, arg5.field2919, arg5.field2918, arg5.field2921, arg5.field2923);
        } else {
            arg4.method1548(arg5.field2919 / 2 + arg0 + var12 - arg4.field1409 / 2, arg5.field2918 / 2 + arg1 - var13 - arg4.field1412 / 2);
        }
    }
}
