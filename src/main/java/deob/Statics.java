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
import java.net.Socket;
import java.util.Iterator;

public class Statics {

    @ObfuscatedName("aq.b")
    public static class158 field1000;

    @ObfuscatedName("as.rd")
    public static boolean field1003;

    @ObfuscatedName("as.b")
    public static class158 field1006;

    @ObfuscatedName("as.pq")
    public static class9 field1015;

    @ObfuscatedName("ay.f")
    public static int[] field1017;

    @ObfuscatedName("ay.l")
    public static int field1019;

    @ObfuscatedName("ay.b")
    public static class158 field1020;

    @ObfuscatedName("ay.ca")
    public static class135 field1021;

    @ObfuscatedName("ay.ha")
    public static int field1022;

    @ObfuscatedName("ay.dr")
    public static int field1024;

    @ObfuscatedName("ay.ij")
    public static int field1025;

    @ObfuscatedName("ad.l")
    public static boolean field1032;

    @ObfuscatedName("ad.u")
    public static int field1033;

    @ObfuscatedName("ad.v")
    public static class215 field1066;

    @ObfuscatedName("ad.k")
    public static class158 field1071;

    @ObfuscatedName("ad.kr")
    public static class164[] field1081;

    @ObfuscatedName("ad.mu")
    public static class74 field1082;

    @ObfuscatedName("ad.cj")
    public static int field1084;

    @ObfuscatedName("ad.qh")
    public static int field1085;

    @ObfuscatedName("af.e")
    public static int field1088;

    @ObfuscatedName("af.b")
    public static class158 field1092;

    @ObfuscatedName("av.b")
    public static class49 field1096;

    @ObfuscatedName("aj.k")
    public static boolean field1102;

    @ObfuscatedName("aj.p")
    public static int field1103;

    @ObfuscatedName("aj.dd")
    public static int field1123;

    @ObfuscatedName("aj.a")
    public static int field1124;

    @ObfuscatedName("aj.ao")
    public static class159 field1125;

    @ObfuscatedName("u.bh")
    public static class24[] field113;

    @ObfuscatedName("bw.u")
    public static byte[][][] field1148;

    @ObfuscatedName("bw.z")
    public static boolean field1149;

    @ObfuscatedName("bw.br")
    public static class159 field1153;

    @ObfuscatedName("bw.ch")
    public static class215 field1156;

    @ObfuscatedName("br.m")
    public static int field1175;

    @ObfuscatedName("br.o")
    public static float field1178;

    @ObfuscatedName("o.ao")
    public static class74[] field120;

    @ObfuscatedName("bs.n")
    public static boolean[] field1209;

    @ObfuscatedName("bs.q")
    public static int[] field1212;

    @ObfuscatedName("bs.v")
    public static int[] field1214;

    @ObfuscatedName("by.ar")
    public static int[] field1223;

    @ObfuscatedName("by.v")
    public static int field1226;

    @ObfuscatedName("by.u")
    public static byte[] field1229;

    @ObfuscatedName("by.m")
    public static int field1231;

    @ObfuscatedName("by.aw")
    public static int[] field1232;

    @ObfuscatedName("by.n")
    public static class69[] field1234;

    @ObfuscatedName("by.z")
    public static class63[] field1235;

    @ObfuscatedName("by.r")
    public static class56[] field1236;

    @ObfuscatedName("by.s")
    public static boolean[] field1237;

    @ObfuscatedName("by.q")
    public static int field1238;

    @ObfuscatedName("by.c")
    public static int[] field1239;

    @ObfuscatedName("by.o")
    public static int field1243;

    @ObfuscatedName("by.ax")
    public static float[] field1244;

    @ObfuscatedName("by.j")
    public static float[] field1246;

    @ObfuscatedName("by.x")
    public static float[] field1247;

    @ObfuscatedName("by.i")
    public static class64[] field1249;

    @ObfuscatedName("by.ag")
    public static float[] field1250;

    @ObfuscatedName("by.ai")
    public static float[] field1251;

    @ObfuscatedName("by.y")
    public static float[] field1253;

    @ObfuscatedName("by.d")
    public static float[] field1255;

    @ObfuscatedName("bn.nr")
    public static int field1287;

    @ObfuscatedName("bn.bw")
    public static class76 field1288;

    @ObfuscatedName("bz.qw")
    public static int field1312;

    @ObfuscatedName("bz.nh")
    public static int field1315;

    @ObfuscatedName("bx.pj")
    public static class151 field1316;

    @ObfuscatedName("bx.p")
    public static int[] field1317;

    @ObfuscatedName("bx.ff")
    public static int field1318;

    @ObfuscatedName("bx.m")
    public static byte[][] field1319;

    @ObfuscatedName("bx.b")
    public static int field1320;

    @ObfuscatedName("bx.u")
    public static int[] field1321;

    @ObfuscatedName("bx.cd")
    public static class215 field1322;

    @ObfuscatedName("ba.qg")
    public static Canvas field1328;

    @ObfuscatedName("m.n")
    public static class171 field133;

    @ObfuscatedName("m.ae")
    public static boolean field134;

    @ObfuscatedName("bl.r")
    public static int field1343;

    @ObfuscatedName("bl.i")
    public static int field1345;

    @ObfuscatedName("bl.z")
    public static int[] field1349;

    @ObfuscatedName("bg.i")
    public static int[] field1373;

    @ObfuscatedName("cg.lp")
    public static class122 field1377;

    @ObfuscatedName("cg.p")
    public static class76[] field1381;

    @ObfuscatedName("cm.of")
    public static int field1385;

    @ObfuscatedName("cb.t")
    public static int field1403;

    @ObfuscatedName("cb.h")
    public static int field1404;

    @ObfuscatedName("cb.w")
    public static int field1405;

    @ObfuscatedName("cb.g")
    public static int field1406;

    @ObfuscatedName("cb.f")
    public static int field1407;

    @ObfuscatedName("cb.j")
    public static int field1409;

    @ObfuscatedName("cb.x")
    public static int field1410;

    @ObfuscatedName("cb.ax")
    public static int field1412;

    @ObfuscatedName("cb.ag")
    public static int field1413;

    @ObfuscatedName("cb.ai")
    public static int field1414;

    @ObfuscatedName("cb.d")
    public static int field1415;

    @ObfuscatedName("cb.y")
    public static int field1423;

    @ObfuscatedName("cb.c")
    public static int field1432;

    @ObfuscatedName("cb.ar")
    public static int field1434;

    @ObfuscatedName("cb.bi")
    public static boolean[][] field1441;

    @ObfuscatedName("cb.bh")
    public static int field1442;

    @ObfuscatedName("cb.be")
    public static int field1443;

    @ObfuscatedName("cb.br")
    public static int field1444;

    @ObfuscatedName("cb.bb")
    public static int field1445;

    @ObfuscatedName("cb.bq")
    public static int field1446;

    @ObfuscatedName("cb.bk")
    public static int field1447;

    @ObfuscatedName("cs.v")
    public static int[] field1458;

    @ObfuscatedName("q.ip")
    public static int field146;

    @ObfuscatedName("ca.an")
    public static String field1475;

    @ObfuscatedName("ca.eo")
    public static int field1480;

    @ObfuscatedName("ca.m")
    public static short[] field1481;

    @ObfuscatedName("cq.g")
    public static String field1486;

    @ObfuscatedName("cq.h")
    public static int[] field1487;

    @ObfuscatedName("cq.dy")
    public static int[] field1491;

    @ObfuscatedName("cf.y")
    public static int field1499;

    @ObfuscatedName("cf.ag")
    public static class87 field1500;

    @ObfuscatedName("cf.x")
    public static int field1502;

    @ObfuscatedName("cf.n")
    public static int field1503;

    @ObfuscatedName("cf.w")
    public static int field1504;

    @ObfuscatedName("cf.g")
    public static int field1505;

    @ObfuscatedName("cf.f")
    public static int field1506;

    @ObfuscatedName("cf.v")
    public static int field1507;

    @ObfuscatedName("cf.j")
    public static int field1508;

    @ObfuscatedName("ct.no")
    public static class70 field1524;

    @ObfuscatedName("v.ni")
    public static class52 field153;

    @ObfuscatedName("ck.qk")
    public static int field1545;

    @ObfuscatedName("ck.qs")
    public static int field1546;

    @ObfuscatedName("v.es")
    public static class74[] field155;

    @ObfuscatedName("cl.q")
    public static int[] field1554;

    @ObfuscatedName("cn.ql")
    public static class125 field1565;

    @ObfuscatedName("cn.qx")
    public static String field1566;

    @ObfuscatedName("n.pw")
    public static class126 field158;

    @ObfuscatedName("cu.eu")
    public static class74 field1595;

    @ObfuscatedName("co.dq")
    public static byte[][] field1609;

    @ObfuscatedName("co.et")
    public static class76[] field1617;

    @ObfuscatedName("co.as")
    public static class138 field1624;

    @ObfuscatedName("ci.kj")
    public static int field1696;

    @ObfuscatedName("ci.el")
    public static class74[] field1697;

    @ObfuscatedName("ch.po")
    public static Clipboard field1698;

    @ObfuscatedName("e.w")
    public static int[] field17;

    @ObfuscatedName("ch.bz")
    public static String field1706;

    @ObfuscatedName("cv.qt")
    public static int field1709;

    @ObfuscatedName("cv.gj")
    public static class164 field1710;

    @ObfuscatedName("cd.iv")
    public static class29 field1719;

    @ObfuscatedName("cx.bw")
    public static int field1735;

    @ObfuscatedName("z.np")
    public static int field177;

    @ObfuscatedName("cx.bv")
    public static int field1773;

    @ObfuscatedName("cx.bj")
    public static int field1787;

    @ObfuscatedName("cw.pc")
    public static int field1842;

    @ObfuscatedName("cj.f")
    public static String field1848;

    @ObfuscatedName("r.bj")
    public static class76[] field185;

    @ObfuscatedName("dd.qp")
    public static Frame field1855;

    @ObfuscatedName("dd.av")
    public static class159 field1856;

    @ObfuscatedName("dd.o")
    public static class76 field1860;

    @ObfuscatedName("du.b")
    public static long field1866;

    @ObfuscatedName("du.e")
    public static long field1867;

    @ObfuscatedName("du.pv")
    public static int field1869;

    @ObfuscatedName("db.bf")
    public static FontMetrics field1873;

    @ObfuscatedName("dj.fo")
    public static int field1896;

    @ObfuscatedName("dt.ex")
    public static class74[] field1902;

    @ObfuscatedName("dt.nj")
    public static int field1908;

    @ObfuscatedName("dy.cw")
    public static int field1912;

    @ObfuscatedName("dg.pk")
    public static long field1920;

    @ObfuscatedName("dg.ax")
    public static int[] field1929;

    @ObfuscatedName("i.ee")
    public static class74[] field193;

    @ObfuscatedName("dn.ck")
    public static int field1932;

    @ObfuscatedName("dq.nd")
    public static int field1933;

    @ObfuscatedName("dl.e")
    public static int field1940;

    @ObfuscatedName("di.gy")
    public static class164 field1950;

    @ObfuscatedName("di.aj")
    public static class76[] field1951;

    @ObfuscatedName("ds.r")
    public static class219[] field1952;

    @ObfuscatedName("ds.d")
    public static int[] field1953;

    @ObfuscatedName("dr.ew")
    public static class76[] field1956;

    @ObfuscatedName("dk.ny")
    public static class52 field1966;

    @ObfuscatedName("i.pr")
    public static short[] field197;

    @ObfuscatedName("df.x")
    public static int[] field1977;

    @ObfuscatedName("i.ct")
    public static char field198;

    @ObfuscatedName("dc.m")
    public static class76[] field1984;

    @ObfuscatedName("dc.e")
    public static File field1989;

    @ObfuscatedName("dc.hu")
    public static int field1990;

    @ObfuscatedName("de.e")
    public static String field1994;

    @ObfuscatedName("de.b")
    public static String field1997;

    @ObfuscatedName("de.ay")
    public static class135 field2001;

    @ObfuscatedName("do.bv")
    public static class76[] field2007;

    @ObfuscatedName("do.bj")
    public static class159 field2008;

    @ObfuscatedName("i.kb")
    public static int field201;

    @ObfuscatedName("do.bh")
    public static class159 field2021;

    @ObfuscatedName("dm.bi")
    public static class159 field2034;

    @ObfuscatedName("dm.cr")
    public static class135 field2037;

    @ObfuscatedName("ez.nt")
    public static class51 field2061;

    @ObfuscatedName("ez.nc")
    public static int field2063;

    @ObfuscatedName("ez.me")
    public static byte field2064;

    @ObfuscatedName("s.z")
    public static String field207;

    @ObfuscatedName("ey.a")
    public static int field2073;

    @ObfuscatedName("ey.bo")
    public static class159 field2074;

    @ObfuscatedName("eb.mz")
    public static class23[] field2101;

    @ObfuscatedName("eb.qj")
    public static Font field2107;

    @ObfuscatedName("eb.dg")
    public static int[][] field2108;

    @ObfuscatedName("es.a")
    public static int field2124;

    @ObfuscatedName("es.e")
    public static String field2126;

    @ObfuscatedName("es.b")
    public static Applet field2127;

    @ObfuscatedName("en.c")
    public static String[] field2129;

    @ObfuscatedName("en.k")
    public static File field2132;

    @ObfuscatedName("en.p")
    public static File field2133;

    @ObfuscatedName("en.w")
    public static String field2140;

    @ObfuscatedName("ee.cs")
    public static class138 field2159;

    @ObfuscatedName("ee.hr")
    public static int field2163;

    @ObfuscatedName("ek.p")
    public static class158 field2187;

    @ObfuscatedName("c.ab")
    public static long field224;

    @ObfuscatedName("c.bk")
    public static class159 field229;

    @ObfuscatedName("t.be")
    public static class159 field238;

    @ObfuscatedName("client.e")
    public static client field245;

    @ObfuscatedName("client.l")
    public static class144 field249;

    @ObfuscatedName("e.ek")
    public static class74[] field25;

    @ObfuscatedName("ea.q")
    public static int field2505;

    @ObfuscatedName("client.m")
    public static class203 field252;

    @ObfuscatedName("eh.qv")
    public static int field2528;

    @ObfuscatedName("eh.fj")
    public static int field2530;

    @ObfuscatedName("ev.s")
    public static class111 field2531;

    @ObfuscatedName("ev.k")
    public static class175 field2533;

    @ObfuscatedName("ev.eg")
    public static class74 field2534;

    @ObfuscatedName("em.bs")
    public static class159 field2539;

    @ObfuscatedName("em.v")
    public static class76 field2542;

    @ObfuscatedName("fm.ef")
    public static class74[] field2554;

    @ObfuscatedName("client.r")
    public static String field256;

    @ObfuscatedName("fo.ik")
    public static int field2590;

    @ObfuscatedName("fw.a")
    public static long field2601;

    @ObfuscatedName("fw.b")
    public static class135 field2612;

    @ObfuscatedName("fx.e")
    public static boolean[] field2628;

    @ObfuscatedName("fx.a")
    public static class158 field2629;

    @ObfuscatedName("fx.l")
    public static class158 field2631;

    @ObfuscatedName("fx.b")
    public static class164[][] field2726;

    @ObfuscatedName("fx.k")
    public static class158 field2749;

    @ObfuscatedName("client.az")
    public static class138 field276;

    @ObfuscatedName("fi.o")
    public static int field2787;

    @ObfuscatedName("fi.av")
    public static class18 field2788;

    @ObfuscatedName("fy.dt")
    public static int[] field2797;

    @ObfuscatedName("fy.q")
    public static short[][] field2802;

    @ObfuscatedName("client.bp")
    public static class159 field281;

    @ObfuscatedName("ft.bq")
    public static class159 field2820;

    @ObfuscatedName("fe.e")
    public static class158 field2836;

    @ObfuscatedName("fe.a")
    public static class158 field2837;

    @ObfuscatedName("fe.v")
    public static boolean field2840;

    @ObfuscatedName("fe.l")
    public static class158 field2842;

    @ObfuscatedName("fe.z")
    public static class55 field2844;

    @ObfuscatedName("fe.b")
    public static class158 field2845;

    @ObfuscatedName("fe.k")
    public static int[] field2846;

    @ObfuscatedName("client.ba")
    public static int field287;

    @ObfuscatedName("client.bl")
    public static int field288;

    @ObfuscatedName("fz.i")
    public static int field2885;

    @ObfuscatedName("fr.en")
    public static class74[] field2891;

    @ObfuscatedName("fr.l")
    public static class68 field2894;

    @ObfuscatedName("fd.in")
    public static int field2928;

    @ObfuscatedName("fa.o")
    public static int[] field2940;

    @ObfuscatedName("fa.p")
    public static class158 field2941;

    @ObfuscatedName("fc.g")
    public static int[] field2961;

    @ObfuscatedName("fc.bw")
    public static class159 field2966;

    @ObfuscatedName("gi.cv")
    public static class215 field3008;

    @ObfuscatedName("go.n")
    public static class164 field3013;

    @ObfuscatedName("go.dv")
    public static int[] field3021;

    @ObfuscatedName("gl.n")
    public static int[] field3039;

    @ObfuscatedName("gl.l")
    public static byte[][][] field3040;

    @ObfuscatedName("ga.ag")
    public static int[] field3055;

    @ObfuscatedName("ga.i")
    public static int field3057;

    @ObfuscatedName("ga.u")
    public static int field3059;

    @ObfuscatedName("hk.q")
    public static class76 field3070;

    @ObfuscatedName("hg.b")
    public static class105 field3078;

    @ObfuscatedName("hn.q")
    public static class76[] field3098;

    @ObfuscatedName("a.fn")
    public static int field31;

    @ObfuscatedName("ht.bb")
    public static class159 field3108;

    @ObfuscatedName("hx.m")
    public static int field3136;

    @ObfuscatedName("a.px")
    public static class212 field32;

    @ObfuscatedName("a.kg")
    public static int field35;

    @ObfuscatedName("client.aj")
    public static class159 field414;

    @ObfuscatedName("client.o")
    public static class145 field451;

    @ObfuscatedName("client.ma")
    public static byte field484;

    @ObfuscatedName("client.fm")
    public static int field491;

    @ObfuscatedName("a.hm")
    public static int field50;

    @ObfuscatedName("k.bx")
    public static int field52;

    @ObfuscatedName("client.s")
    public static String[] field535;

    @ObfuscatedName("h.u")
    public static short[] field539;

    @ObfuscatedName("h.o")
    public static short[][] field540;

    @ObfuscatedName("w.v")
    public static class164 field551;

    @ObfuscatedName("k.qn")
    public static int field56;

    @ObfuscatedName("g.qe")
    public static Image field560;

    @ObfuscatedName("f.bv")
    public static class159 field563;

    @ObfuscatedName("f.hg")
    public static class3 field579;

    @ObfuscatedName("y.s")
    public static int field580;

    @ObfuscatedName("y.iy")
    public static class164 field584;

    @ObfuscatedName("d.dl")
    public static class81 field619;

    @ObfuscatedName("d.ov")
    public static int field622;

    @ObfuscatedName("ai.qm")
    public static int field646;

    @ObfuscatedName("ai.r")
    public static class163 field652;

    @ObfuscatedName("ar.l")
    public static class74 field657;

    @ObfuscatedName("l.iw")
    public static class164 field66;

    @ObfuscatedName("ar.k")
    public static class76 field660;

    @ObfuscatedName("ar.u")
    public static class74 field661;

    @ObfuscatedName("ar.x")
    public static int[] field669;

    @ObfuscatedName("ar.a")
    public static class76 field681;

    @ObfuscatedName("ar.b")
    public static boolean field688;

    @ObfuscatedName("aw.dh")
    public static int field697;

    @ObfuscatedName("aw.nu")
    public static int field699;

    @ObfuscatedName("l.p")
    public static byte[][][] field70;

    @ObfuscatedName("aw.f")
    public static class13 field702;

    @ObfuscatedName("ap.i")
    public static int[][][] field709;

    @ObfuscatedName("l.o")
    public static byte[][][] field71;

    @ObfuscatedName("ap.dn")
    public static byte[][] field718;

    @ObfuscatedName("l.m")
    public static int[][] field72;

    @ObfuscatedName("al.k")
    public static String[] field721;

    @ObfuscatedName("al.a")
    public static int[] field728;

    @ObfuscatedName("l.k")
    public static byte[][][] field74;

    @ObfuscatedName("ak.qu")
    public static class73 field797;

    @ObfuscatedName("at.mg")
    public static int field802;

    @ObfuscatedName("au.pu")
    public static class128 field808;

    @ObfuscatedName("au.e")
    public static class158 field813;

    @ObfuscatedName("l.r")
    public static int[] field83;

    @ObfuscatedName("au.b")
    public static class158 field833;

    @ObfuscatedName("au.ed")
    public static class76[] field846;

    @ObfuscatedName("am.a")
    public static class158 field850;

    @ObfuscatedName("am.e")
    public static class158 field863;

    @ObfuscatedName("am.kp")
    public static class123 field882;

    @ObfuscatedName("am.ec")
    public static class74[] field900;

    @ObfuscatedName("aa.b")
    public static class158 field910;

    @ObfuscatedName("az.e")
    public static class158 field914;

    @ObfuscatedName("az.a")
    public static class158 field915;

    @ObfuscatedName("u.ow")
    public static int field92;

    @ObfuscatedName("az.b")
    public static class158 field927;

    @ObfuscatedName("az.hs")
    public static int field932;

    @ObfuscatedName("ae.e")
    public static class158 field935;

    @ObfuscatedName("ae.b")
    public static class158 field937;

    @ObfuscatedName("ae.pi")
    public static int field948;

    @ObfuscatedName("ae.ah")
    public static int field951;

    @ObfuscatedName("ah.e")
    public static class158 field956;

    @ObfuscatedName("ah.a")
    public static int field958;

    @ObfuscatedName("ah.b")
    public static class158 field960;

    @ObfuscatedName("an.b")
    public static class158 field970;

    @ObfuscatedName("an.w")
    public static class111 field976;

    @ObfuscatedName("an.gh")
    public static class164 field981;

    @ObfuscatedName("aq.ix")
    public static int field990;

    @ObfuscatedName("aq.l")
    public static int[] field992;

    @ObfuscatedName("aq.fi")
    public static int field993;

    @ObfuscatedName("aq.dp")
    public static int field995;

    @ObfuscatedName("aq.z")
    public static int[] field999;

    @ObfuscatedName("dl.b(II)Z")
    public static boolean method2430(int arg0) {
        return (arg0 & 0x1) != 0;
    }

    @ObfuscatedName("ek.a(II)V")
    public static void method2735(int arg0) {
        if (class174.field2838 == 0) {
            field2533.method3219(arg0);
        } else {
            field3136 = arg0;
        }
    }

    @ObfuscatedName("er.a(CI)C")
    public static char method2744(char arg0) {
        if (arg0 == 198) {
            return 'E';
        } else if (arg0 == 230) {
            return 'e';
        } else if (arg0 == 223) {
            return 's';
        } else if (arg0 == 338) {
            return 'E';
        } else {
            return (char) (arg0 == 339 ? 'e' : '\u0000');
        }
    }

    @ObfuscatedName("x.k(B)V")
    public static void method537() {
        class218 var0 = null;
        try {
            var0 = class141.method745("", field451.field2181, true);
            class111 var1 = field1015.method103();
            var0.method3626(var1.field1897, 0, var1.field1894);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3632();
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("cj.a(CB)C")
    public static char method2059(char arg0) {
        switch(arg0) {
            case ' ':
            case '-':
            case '_':
            case ' ':
                return '_';
            case '#':
            case '[':
            case ']':
                return arg0;
            case 'À':
            case 'Á':
            case 'Â':
            case 'Ã':
            case 'Ä':
            case 'à':
            case 'á':
            case 'â':
            case 'ã':
            case 'ä':
                return 'a';
            case 'Ç':
            case 'ç':
                return 'c';
            case 'È':
            case 'É':
            case 'Ê':
            case 'Ë':
            case 'è':
            case 'é':
            case 'ê':
            case 'ë':
                return 'e';
            case 'Í':
            case 'Î':
            case 'Ï':
            case 'í':
            case 'î':
            case 'ï':
                return 'i';
            case 'Ñ':
            case 'ñ':
                return 'n';
            case 'Ò':
            case 'Ó':
            case 'Ô':
            case 'Õ':
            case 'Ö':
            case 'ò':
            case 'ó':
            case 'ô':
            case 'õ':
            case 'ö':
                return 'o';
            case 'Ù':
            case 'Ú':
            case 'Û':
            case 'Ü':
            case 'ù':
            case 'ú':
            case 'û':
            case 'ü':
                return 'u';
            case 'ß':
                return 'b';
            case 'ÿ':
            case 'Ÿ':
                return 'y';
            default:
                return Character.toLowerCase(arg0);
        }
    }

    @ObfuscatedName("bn.m(I)[Lbf;")
    public static class74[] method1317() {
        class74[] var0 = new class74[field1320];
        for (int var1 = 0; var1 < field1320; var1++) {
            class74 var2 = var0[var1] = new class74();
            var2.field1331 = field1940;
            var2.field1337 = field2073;
            var2.field1334 = field2846[var1];
            var2.field1335 = field1317[var1];
            var2.field1336 = field992[var1];
            var2.field1333 = field1321[var1];
            int var3 = var2.field1336 * var2.field1333;
            byte[] var4 = field1319[var1];
            var2.field1340 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field1340[var5] = field2940[var4[var5] & 0xFF];
            }
        }
        class72.method2736();
        return var0;
    }

    @ObfuscatedName("c.i(I)V")
    public static final void method176() {
        try {
            if (client.field283 == 0) {
                if (field2037 != null) {
                    field2037.method2589();
                    field2037 = null;
                }
                field2159 = null;
                client.field303 = false;
                client.field284 = 0;
                client.field283 = 1;
            }
            if (client.field283 == 1) {
                if (field2159 == null) {
                    field2159 = field808.method2509(field1706, field288);
                }
                if (field2159.field2116 == 2) {
                    throw new IOException();
                }
                if (field2159.field2116 == 1) {
                    field2037 = new class135((Socket) field2159.field2115, field808);
                    field2159 = null;
                    client.field283 = 2;
                }
            }
            if (client.field283 == 2) {
                client.field397.field1894 = 0;
                client.field397.method2112(14);
                field2037.method2593(client.field397.field1897, 0, 1);
                client.field394.field1894 = 0;
                client.field283 = 3;
            }
            if (client.field283 == 3) {
                if (field1966 != null) {
                    field1966.method1010();
                }
                if (field153 != null) {
                    field153.method1010();
                }
                int var0 = field2037.method2590();
                if (field1966 != null) {
                    field1966.method1010();
                }
                if (field153 != null) {
                    field153.method1010();
                }
                if (var0 != 0) {
                    client.method135(var0);
                    return;
                }
                client.field394.field1894 = 0;
                client.field283 = 5;
            }
            if (client.field283 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                client.field397.field1894 = 0;
                client.field397.method2112(1);
                client.field397.method2112(class30.field682.method495());
                client.field397.method2115(var1[0]);
                client.field397.method2115(var1[1]);
                client.field397.method2115(var1[2]);
                client.field397.method2115(var1[3]);
                switch(class30.field682.field2489) {
                    case 0:
                    case 2:
                        client.field397.method2114(field951);
                        client.field397.field1894 += 5;
                        break;
                    case 1:
                        client.field397.method2115((Integer) field1015.field129.get(class154.method2718(class30.field680)));
                        client.field397.field1894 += 4;
                        break;
                    case 3:
                        client.field397.field1894 += 8;
                }
                client.field397.method2247(class30.field691);
                client.field397.method2147(class5.field62, class5.field60);
                client.field384.field1894 = 0;
                if (client.field257 == 40) {
                    client.field384.method2112(18);
                } else {
                    client.field384.method2112(16);
                }
                client.field384.method2201(0);
                int var2 = client.field384.field1894;
                client.field384.method2115(79);
                client.field384.method2121(client.field397.field1897, 0, client.field397.field1894);
                int var3 = client.field384.field1894;
                client.field384.method2247(class30.field680);
                client.field384.method2112((client.field499 ? 1 : 0) << 1 | (client.field254 ? 1 : 0));
                client.field384.method2201(field56);
                client.field384.method2201(field2528);
                class141.method2441(client.field384);
                client.field384.method2247(field256);
                client.field384.method2115(field3057);
                class111 var4 = new class111(field1316.method2747());
                field1316.method2753(var4);
                client.field384.method2121(var4.field1897, 0, var4.field1897.length);
                client.field384.method2112(field580);
                client.field384.method2115(field1856.field2568);
                client.field384.method2115(field1125.field2568);
                client.field384.method2115(field414.field2568);
                client.field384.method2115(field2008.field2568);
                client.field384.method2115(field563.field2568);
                client.field384.method2115(field2966.field2568);
                client.field384.method2115(field2034.field2568);
                client.field384.method2115(field2021.field2568);
                client.field384.method2115(field238.field2568);
                client.field384.method2115(field1153.field2568);
                client.field384.method2115(field3108.field2568);
                client.field384.method2115(field2820.field2568);
                client.field384.method2115(field229.field2568);
                client.field384.method2115(field2539.field2568);
                client.field384.method2115(field2074.field2568);
                client.field384.method2115(field281.field2568);
                client.field384.method2191(var1, var3, client.field384.field1894);
                client.field384.method2123(client.field384.field1894 - var2);
                field2037.method2593(client.field384.field1897, 0, client.field384.field1894);
                client.field397.method2376(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                client.field394.method2376(var1);
                client.field283 = 6;
            }
            if (client.field283 == 6 && field2037.method2591() > 0) {
                int var6 = field2037.method2590();
                if (var6 == 21 && client.field257 == 20) {
                    client.field283 = 7;
                } else if (var6 == 2) {
                    client.field283 = 9;
                } else if (var6 == 15 && client.field257 == 40) {
                    client.field397.field1894 = 0;
                    client.field394.field1894 = 0;
                    client.field296 = -1;
                    client.field300 = -1;
                    client.field301 = -1;
                    client.field356 = -1;
                    client.field295 = 0;
                    client.field297 = 0;
                    client.field523 = 0;
                    client.field377 = 0;
                    client.field418 = false;
                    client.field443 = 0;
                    client.field393 = 0;
                    for (int var7 = 0; var7 < client.field370.length; var7++) {
                        if (client.field370[var7] != null) {
                            client.field370[var7].field760 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < client.field289.length; var8++) {
                        if (client.field289[var8] != null) {
                            client.field289[var8].field760 = -1;
                        }
                    }
                    class15.field194 = new class187(32);
                    client.method565(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        client.field492[var9] = true;
                    }
                    client.method918();
                    return;
                } else if (var6 == 23 && client.field447 < 1) {
                    client.field447++;
                    client.field283 = 0;
                } else {
                    client.method135(var6);
                    return;
                }
            }
            if (client.field283 == 7 && field2037.method2591() > 0) {
                client.field341 = (field2037.method2590() + 3) * 60;
                client.field283 = 8;
            }
            if (client.field283 == 8) {
                client.field284 = 0;
                class30.method529(class148.field2237, class148.field2238, client.field341 / 60 + class148.field2272);
                if (--client.field341 <= 0) {
                    client.field283 = 0;
                }
            } else {
                if (client.field283 == 9 && field2037.method2591() >= 13) {
                    boolean var10 = field2037.method2590() == 1;
                    field2037.method2613(client.field394.field1897, 0, 4);
                    client.field394.field1894 = 0;
                    boolean var11 = false;
                    if (var10) {
                        int var12 = client.field394.method2391() << 24;
                        int var13 = var12 | client.field394.method2391() << 16;
                        int var14 = var13 | client.field394.method2391() << 8;
                        int var15 = var14 | client.field394.method2391();
                        int var16 = class154.method2718(class30.field680);
                        if (field1015.field129.size() >= 10 && !field1015.field129.containsKey(var16)) {
                            Iterator var17 = field1015.field129.entrySet().iterator();
                            var17.next();
                            var17.remove();
                        }
                        field1015.field129.put(var16, var15);
                        method537();
                    }
                    client.field311 = field2037.method2590();
                    client.field439 = field2037.method2590() == 1;
                    client.field482 = field2037.method2590();
                    client.field482 <<= 0x8;
                    client.field482 += field2037.method2590();
                    client.field529 = field2037.method2590();
                    field2037.method2613(client.field394.field1897, 0, 1);
                    client.field394.field1894 = 0;
                    client.field296 = client.field394.method2391();
                    field2037.method2613(client.field394.field1897, 0, 2);
                    client.field394.field1894 = 0;
                    client.field295 = client.field394.method2129();
                    if (client.field529 == 1) {
                        try {
                            class124.method2471(field245, "zap");
                        } catch (Throwable var41) {
                        }
                    } else {
                        try {
                            class124.method2471(field245, "unzap");
                        } catch (Throwable var40) {
                        }
                    }
                    client.field283 = 10;
                }
                if (client.field283 != 10) {
                    client.field284++;
                    if (client.field284 > 2000) {
                        if (client.field447 < 1) {
                            if (field52 == field288) {
                                field288 = field287;
                            } else {
                                field288 = field52;
                            }
                            client.field447++;
                            client.field283 = 0;
                        } else {
                            client.method135(-3);
                        }
                    }
                } else if (field2037.method2591() >= client.field295) {
                    client.field394.field1894 = 0;
                    field2037.method2613(client.field394.field1897, 0, client.field295);
                    client.field260 = 1L;
                    client.field263 = -1;
                    field702.field174 = 0;
                    field1003 = true;
                    client.field463 = true;
                    client.field481 = -1L;
                    class202.method1874();
                    client.field397.field1894 = 0;
                    client.field394.field1894 = 0;
                    client.field296 = -1;
                    client.field300 = -1;
                    client.field301 = -1;
                    client.field356 = -1;
                    client.field297 = 0;
                    client.field523 = 0;
                    client.field299 = 0;
                    client.field267 = 0;
                    client.field377 = 0;
                    client.field418 = false;
                    class132.method3485(0);
                    class11.method1036();
                    client.field302 = 0;
                    client.field407 = false;
                    client.field498 = 0;
                    client.field247 = (int) (Math.random() * 100.0D) - 50;
                    client.field316 = (int) (Math.random() * 110.0D) - 55;
                    client.field412 = (int) (Math.random() * 80.0D) - 40;
                    client.field321 = (int) (Math.random() * 120.0D) - 60;
                    client.field268 = (int) (Math.random() * 30.0D) - 20;
                    client.field330 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    client.field443 = 0;
                    client.field485 = -1;
                    client.field393 = 0;
                    client.field446 = 0;
                    client.field494 = class19.field541;
                    client.field371 = 0;
                    client.field290 = 0;
                    for (int var20 = 0; var20 < 2048; var20++) {
                        client.field370[var20] = null;
                        client.field282[var20] = null;
                    }
                    for (int var21 = 0; var21 < 32768; var21++) {
                        client.field289[var21] = null;
                    }
                    field579 = client.field370[2047] = new class3();
                    client.field363 = -1;
                    client.field387.method3318();
                    client.field519.method3318();
                    for (int var22 = 0; var22 < 4; var22++) {
                        for (int var23 = 0; var23 < 104; var23++) {
                            for (int var24 = 0; var24 < 104; var24++) {
                                client.field385[var22][var23][var24] = null;
                            }
                        }
                    }
                    client.field386 = new class190();
                    client.field524 = 0;
                    client.field502 = 0;
                    client.field318 = 0;
                    for (int var25 = 0; var25 < field1088; var25++) {
                        class48 var26 = (class48) class48.field1089.method3254((long) var25);
                        class48 var27;
                        if (var26 == null) {
                            byte[] var28 = field1092.method2819(16, var25);
                            class48 var29 = new class48();
                            if (var28 != null) {
                                var29.method925(new class111(var28));
                            }
                            class48.field1089.method3256(var29, (long) var25);
                            var27 = var29;
                        } else {
                            var27 = var26;
                        }
                        if (var27 != null) {
                            class167.field2785[var25] = 0;
                            class167.field2786[var25] = 0;
                        }
                    }
                    for (int var31 = 0; var31 < client.field450.length; var31++) {
                        client.field450[var31] = -1;
                    }
                    client.field420 = -1;
                    if (client.field306 != -1) {
                        int var32 = client.field306;
                        if (var32 != -1 && field2628[var32]) {
                            field2629.method2847(var32);
                            if (field2726[var32] != null) {
                                boolean var33 = true;
                                for (int var34 = 0; var34 < field2726[var32].length; var34++) {
                                    if (field2726[var32][var34] != null) {
                                        if (field2726[var32][var34].field2765 == 2) {
                                            var33 = false;
                                        } else {
                                            field2726[var32][var34] = null;
                                        }
                                    }
                                }
                                if (var33) {
                                    field2726[var32] = null;
                                }
                                field2628[var32] = false;
                            }
                        }
                    }
                    for (class4 var35 = (class4) client.field413.method3286(); var35 != null; var35 = (class4) client.field413.method3291()) {
                        client.method1084(var35, true);
                    }
                    client.field306 = -1;
                    client.field413 = new class187(8);
                    client.field416 = null;
                    client.field418 = false;
                    client.field377 = 0;
                    client.field327.method3042((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var36 = 0; var36 < 8; var36++) {
                        client.field381[var36] = null;
                        client.field512[var36] = false;
                    }
                    class15.field194 = new class187(32);
                    client.field258 = true;
                    for (int var37 = 0; var37 < 100; var37++) {
                        client.field492[var37] = true;
                    }
                    client.method918();
                    client.field488 = null;
                    field802 = 0;
                    field2101 = null;
                    for (int var38 = 0; var38 < 6; var38++) {
                        client.field392[var38] = new class211();
                    }
                    field32 = null;
                    field1123 = -1;
                    client.method2788(false);
                    client.field296 = -1;
                }
            }
        } catch (IOException var42) {
            if (client.field447 < 1) {
                if (field52 == field288) {
                    field288 = field287;
                } else {
                    field288 = field52;
                }
                client.field447++;
                client.field283 = 0;
            } else {
                client.method135(-2);
            }
        }
    }

    @ObfuscatedName("ay.ae(Ljava/lang/String;ZI)V")
    public static final void method869(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = field3008.method3538(arg0, 250);
        int var6 = field3008.method3532(arg0, 250) * 13;
        class75.method1533(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class75.method1502(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        field3008.method3544(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        client.method89(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            client.method2766(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = field1328.getGraphics();
            field797.method1346(var7, 0, 0);
        } catch (Exception var9) {
            field1328.repaint();
        }
    }

    @ObfuscatedName("l.ab(Lak;IIIIII)V")
    public static final void method86(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method17()) {
            return;
        }
        if (arg0 instanceof class32) {
            class37 var6 = ((class32) arg0).field705;
            if (var6.field825 != null) {
                var6 = var6.method654();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < client.field371) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field47) {
                return;
            }
            if (var8.field30 != -1 || var8.field28 != -1) {
                client.method1401(arg0, arg0.field761 + 15);
                if (client.field355 > -1) {
                    if (var8.field30 != -1) {
                        field1697[var8.field30].method1415(client.field355 + arg2 - 12, client.field304 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field28 != -1) {
                        field193[var8.field28].method1415(client.field355 + arg2 - 12, client.field304 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && client.field267 == 10 && client.field269 == client.field391[arg1]) {
                client.method1401(arg0, arg0.field761 + 15);
                if (client.field355 > -1) {
                    field900[1].method1415(client.field355 + arg2 - 12, client.field304 + arg3 - var7);
                }
            }
        } else {
            class37 var9 = ((class32) arg0).field705;
            if (var9.field825 != null) {
                var9 = var9.method654();
            }
            if (var9.field835 >= 0 && var9.field835 < field193.length) {
                client.method1401(arg0, arg0.field761 + 15);
                if (client.field355 > -1) {
                    field193[var9.field835].method1415(client.field355 + arg2 - 12, client.field304 + arg3 - 30);
                }
            }
            if (client.field267 == 1 && client.field339 == client.field291[arg1 - client.field371] && client.field259 % 20 < 10) {
                client.method1401(arg0, arg0.field761 + 15);
                if (client.field355 > -1) {
                    field900[0].method1415(client.field355 + arg2 - 12, client.field304 + arg3 - 28);
                }
            }
        }
        if (arg0.field764 != null && (arg1 >= client.field371 || !arg0.field758 && (client.field333 == 4 || !arg0.field773 && (client.field333 == 0 || client.field333 == 3 || client.field333 == 1 && client.method4(((class3) arg0).field33, false))))) {
            client.method1401(arg0, arg0.field761);
            if (client.field355 > -1 && client.field343 < client.field344) {
                client.field348[client.field343] = field1322.method3536(arg0.field764) / 2;
                client.field347[client.field343] = field1322.field3088;
                client.field345[client.field343] = client.field355;
                client.field346[client.field343] = client.field304;
                client.field349[client.field343] = arg0.field755;
                client.field350[client.field343] = arg0.field736;
                client.field351[client.field343] = arg0.field751;
                client.field352[client.field343] = arg0.field764;
                client.field343++;
            }
        }
        if (arg0.field757 > client.field259) {
            client.method1401(arg0, arg0.field761 + 15);
            if (client.field355 > -1) {
                int var10;
                if (arg1 < client.field371) {
                    var10 = 30;
                } else {
                    class37 var11 = ((class32) arg0).field705;
                    var10 = var11.field843;
                }
                int var12 = arg0.field771 * var10 / arg0.field759;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field771 > 0) {
                    var12 = 1;
                }
                class75.method1533(client.field355 + arg2 - var10 / 2, client.field304 + arg3 - 3, var12, 5, 65280);
                class75.method1533(client.field355 + arg2 - var10 / 2 + var12, client.field304 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field750[var13] > client.field259) {
                client.method1401(arg0, arg0.field761 / 2);
                if (client.field355 > -1) {
                    if (var13 == 1) {
                        client.field304 -= 20;
                    }
                    if (var13 == 2) {
                        client.field355 -= 15;
                        client.field304 -= 10;
                    }
                    if (var13 == 3) {
                        client.field355 += 15;
                        client.field304 -= 10;
                    }
                    field2891[arg0.field786[var13]].method1415(client.field355 + arg2 - 12, client.field304 + arg3 - 12);
                    field1156.method3568(Integer.toString(arg0.field747[var13]), client.field355 + arg2 - 1, client.field304 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("b.bv(IIII)V")
    public static final void method2(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            client.field355 = -1;
            client.field304 = -1;
            return;
        }
        int var3 = client.method655(arg0, arg1, field50) - arg2;
        int var4 = arg0 - field1480;
        int var5 = var3 - field491;
        int var6 = arg1 - field2530;
        int var7 = class86.field1515[field31];
        int var8 = class86.field1516[field31];
        int var9 = class86.field1515[field1896];
        int var10 = class86.field1516[field1896];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            client.field355 = client.field522 * var11 / var15 + client.field322 / 2;
            client.field304 = client.field522 * var14 / var15 + client.field521 / 2;
        } else {
            client.field355 = -1;
            client.field304 = -1;
        }
    }

    @ObfuscatedName("em.br(II)V")
    public static final void method2767(int arg0) {
        int[] var1 = field1082.field1340;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field81[arg0][var6][var4] & 0x18) == 0) {
                    field619.method1622(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field81[arg0 + 1][var6][var4] & 0x8) != 0) {
                    field619.method1622(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        field1082.method1405();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field81[arg0][var10][var9] & 0x18) == 0) {
                    client.method1769(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field81[arg0 + 1][var10][var9] & 0x8) != 0) {
                    client.method1769(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        client.field486 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = field619.method1617(field50, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class38.method1770(var14).field898;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = client.field310[field50].field3134;
                            for (int var19 = 0; var19 < 10; var19++) {
                                int var20 = (int) (Math.random() * 4.0D);
                                if (var20 == 0 && var16 > 0 && var16 > var11 - 3 && (var18[var16 - 1][var17] & 0x1240108) == 0) {
                                    var16--;
                                }
                                if (var20 == 1 && var16 < 103 && var16 < var11 + 3 && (var18[var16 + 1][var17] & 0x1240180) == 0) {
                                    var16++;
                                }
                                if (var20 == 2 && var17 > 0 && var17 > var12 - 3 && (var18[var16][var17 - 1] & 0x1240102) == 0) {
                                    var17--;
                                }
                                if (var20 == 3 && var17 < 103 && var17 < var12 + 3 && (var18[var16][var17 + 1] & 0x1240120) == 0) {
                                    var17++;
                                }
                            }
                        }
                        client.field489[client.field486] = field155[var15];
                        client.field534[client.field486] = var16;
                        client.field441[client.field486] = var17;
                        client.field486++;
                    }
                }
            }
        }
        field797.method1394();
    }

    @ObfuscatedName("fa.bz(I)V")
    public static final void method3246() {
        for (int var0 = 0; var0 < client.field373; var0++) {
            int var1 = client.field374[var0];
            class3 var2 = client.field370[var1];
            int var3 = client.field394.method2127();
            if ((var3 & 0x40) != 0) {
                var3 += client.field394.method2127() << 8;
            }
            client.method271(var1, var2, var3);
        }
    }

    @ObfuscatedName("a.cp(Lau;IIIB)V")
    public static final void method29(class37 arg0, int arg1, int arg2, int arg3) {
        if (client.field377 >= 400) {
            return;
        }
        if (arg0.field825 != null) {
            arg0 = arg0.method654();
        }
        if (arg0 == null || !arg0.field840 || arg0.field842 && client.field420 != arg1) {
            return;
        }
        String var4 = arg0.field812;
        if (arg0.field829 != 0) {
            int var6 = arg0.field829;
            int var7 = field579.field36;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2079(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2079(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2079(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2079(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2079(65280);
            } else if (var8 > 6) {
                var9 = class2.method2079(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2079(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2079(12648192);
            } else {
                var9 = class2.method2079(16776960);
            }
            var4 = var4 + var9 + " " + class2.field15 + class148.field2357 + arg0.field829 + class2.field19;
        }
        if (client.field302 == 1) {
            client.method2740(class148.field2217, client.field406 + " " + class2.field20 + " " + class2.method2079(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!client.field407) {
            String[] var10 = arg0.field821;
            if (client.field388) {
                var10 = client.method172(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class148.field2353)) {
                        byte var12 = 0;
                        if (var11 == 0) {
                            var12 = 9;
                        }
                        if (var11 == 1) {
                            var12 = 10;
                        }
                        if (var11 == 2) {
                            var12 = 11;
                        }
                        if (var11 == 3) {
                            var12 = 12;
                        }
                        if (var11 == 4) {
                            var12 = 13;
                        }
                        client.method2740(var10[var11], class2.method2079(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class148.field2353)) {
                        short var14 = 0;
                        if (client.field494 == class19.field537 || client.field494 == class19.field541 && arg0.field829 > field579.field36) {
                            var14 = 2000;
                        }
                        int var15 = 0;
                        if (var13 == 0) {
                            var15 = var14 + 9;
                        }
                        if (var13 == 1) {
                            var15 = var14 + 10;
                        }
                        if (var13 == 2) {
                            var15 = var14 + 11;
                        }
                        if (var13 == 3) {
                            var15 = var14 + 12;
                        }
                        if (var13 == 4) {
                            var15 = var14 + 13;
                        }
                        client.method2740(var10[var13], class2.method2079(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            client.method2740(class148.field2231, class2.method2079(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((field146 & 0x2) == 2) {
            client.method2740(client.field506, client.field411 + " " + class2.field20 + " " + class2.method2079(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bm.cc([Lfx;IIIIIIIIB)V")
    public static final void method1330(class164[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75.method1499(arg2, arg3, arg4, arg5);
        class86.method1825();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class164 var10 = arg0[var9];
            if (var10 != null && (var10.field2657 == arg1 || arg1 == -1412584499 && client.field425 == var10)) {
                int var11;
                if (arg8 == -1) {
                    client.field462[client.field457] = var10.field2651 + arg6;
                    client.field372[client.field457] = var10.field2652 + arg7;
                    client.field464[client.field457] = var10.field2653;
                    client.field465[client.field457] = var10.field2654;
                    var11 = ++client.field457 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2767 = var11;
                var10.field2768 = client.field259;
                if (!var10.field2648 || !client.method545(var10)) {
                    if (var10.field2642 > 0) {
                        client.method667(var10);
                    }
                    int var12 = var10.field2651 + arg6;
                    int var13 = var10.field2652 + arg7;
                    int var14 = var10.field2668;
                    if (client.field425 == var10) {
                        if (arg1 != -1412584499 && !var10.field2713) {
                            field1081 = arg0;
                            field201 = arg6;
                            field35 = arg7;
                            continue;
                        }
                        if (client.field264 && client.field430) {
                            int var15 = class132.field2053;
                            int var16 = class132.field2054;
                            int var17 = var15 - client.field427;
                            int var18 = var16 - client.field428;
                            if (var17 < client.field431) {
                                var17 = client.field431;
                            }
                            if (var10.field2653 + var17 > client.field431 + client.field426.field2653) {
                                var17 = client.field431 + client.field426.field2653 - var10.field2653;
                            }
                            if (var18 < client.field432) {
                                var18 = client.field432;
                            }
                            if (var10.field2654 + var18 > client.field432 + client.field426.field2654) {
                                var18 = client.field432 + client.field426.field2654 - var10.field2654;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2713) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2765 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2765 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2653 + var12;
                        int var26 = var10.field2654 + var13;
                        if (var25 < var12) {
                            var23 = var25;
                            var25 = var12;
                        }
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        var25++;
                        var26++;
                        var19 = var23 > arg2 ? var23 : arg2;
                        var20 = var24 > arg3 ? var24 : arg3;
                        var21 = var25 < arg4 ? var25 : arg4;
                        var22 = var26 < arg5 ? var26 : arg5;
                    } else {
                        int var29 = var10.field2653 + var12;
                        int var30 = var10.field2654 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2648 || var19 < var21 && var20 < var22) {
                        if (var10.field2642 != 0) {
                            if (var10.field2642 == 1336) {
                                if (client.field265) {
                                    var13 += 15;
                                    field3008.method3542("Fps:" + client.field2096, var10.field2653 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && client.field254) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !client.field254) {
                                        var33 = 16711680;
                                    }
                                    field3008.method3542("Mem:" + var32 + "k", var10.field2653 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2642 == 1337) {
                                client.field275 = var12;
                                client.field402 = var13;
                                int var36 = var10.field2653;
                                int var37 = var10.field2654;
                                client.field470++;
                                client.method1775(class31.field701);
                                boolean var38 = false;
                                if (client.field363 >= 0) {
                                    for (int var39 = 0; var39 < client.field371; var39++) {
                                        if (client.field363 == client.field391[var39]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    client.method1775(class31.field696);
                                }
                                client.method609(true);
                                client.method1775(var38 ? class31.field698 : class31.field700);
                                client.method609(false);
                                client.method656();
                                client.method3415();
                                client.method602(var12, var13, var36, var37, true);
                                int var40 = client.field518;
                                int var41 = client.field453;
                                int var42 = client.field322;
                                int var43 = client.field521;
                                class75.method1499(var40, var41, var40 + var42, var41 + var43);
                                class86.method1825();
                                if (!client.field526) {
                                    int var44 = client.field334;
                                    if (client.field342 / 256 > var44) {
                                        var44 = client.field342 / 256;
                                    }
                                    if (client.field505[4] && client.field507[4] + 128 > var44) {
                                        var44 = client.field507[4] + 128;
                                    }
                                    int var45 = client.field412 + client.field330 & 0x7FF;
                                    int var46 = field993;
                                    int var47 = client.method655(field579.field749, field579.field752, field50) - 50;
                                    int var48 = field1318;
                                    int var49 = var44 * 3 + 600;
                                    int var50 = 2048 - var44 & 0x7FF;
                                    int var51 = 2048 - var45 & 0x7FF;
                                    int var52 = 0;
                                    int var53 = 0;
                                    int var54 = var49;
                                    if (var50 != 0) {
                                        int var55 = class86.field1515[var50];
                                        int var56 = class86.field1516[var50];
                                        int var57 = var53 * var56 - var49 * var55 >> 16;
                                        var54 = var53 * var55 + var49 * var56 >> 16;
                                        var53 = var57;
                                    }
                                    if (var51 != 0) {
                                        int var58 = class86.field1515[var51];
                                        int var59 = class86.field1516[var51];
                                        int var60 = var52 * var59 + var54 * var58 >> 16;
                                        var54 = var54 * var59 - var52 * var58 >> 16;
                                        var52 = var60;
                                    }
                                    field1480 = var46 - var52;
                                    field491 = var47 - var53;
                                    field2530 = var48 - var54;
                                    field31 = var44;
                                    field1896 = var45;
                                }
                                int var61;
                                if (client.field526) {
                                    var61 = client.method2696();
                                } else {
                                    var61 = client.method2580();
                                }
                                int var62 = field1480;
                                int var63 = field491;
                                int var64 = field2530;
                                int var65 = field31;
                                int var66 = field1896;
                                for (int var67 = 0; var67 < 5; var67++) {
                                    if (client.field505[var67]) {
                                        int var68 = (int) (Math.random() * (double) (client.field460[var67] * 2 + 1) - (double) client.field460[var67] + Math.sin((double) client.field294[var67] / 100.0D * (double) client.field509[var67]) * (double) client.field507[var67]);
                                        if (var67 == 0) {
                                            field1480 += var68;
                                        }
                                        if (var67 == 1) {
                                            field491 += var68;
                                        }
                                        if (var67 == 2) {
                                            field2530 += var68;
                                        }
                                        if (var67 == 3) {
                                            field1896 = field1896 + var68 & 0x7FF;
                                        }
                                        if (var67 == 4) {
                                            field31 += var68;
                                            if (field31 < 128) {
                                                field31 = 128;
                                            }
                                            if (field31 > 383) {
                                                field31 = 383;
                                            }
                                        }
                                    }
                                }
                                int var69 = class132.field2053;
                                int var70 = class132.field2054;
                                if (class132.field2059 != 0) {
                                    var69 = class132.field2060;
                                    var70 = class132.field2048;
                                }
                                if (var69 >= var40 && var69 < var40 + var42 && var70 >= var41 && var70 < var41 + var43) {
                                    class100.field1798 = true;
                                    class100.field1751 = 0;
                                    class100.field1790 = var69 - var40;
                                    class100.field1792 = var70 - var41;
                                } else {
                                    class100.field1798 = false;
                                    class100.field1751 = 0;
                                }
                                client.method2411();
                                class75.method1533(var40, var41, var42, var43, 0);
                                client.method2411();
                                int var71 = class86.field1501;
                                class86.field1501 = client.field522;
                                field619.method1626(field1480, field491, field2530, field31, field1896, var61);
                                class86.field1501 = var71;
                                client.method2411();
                                field619.method1755();
                                client.method564(var40, var41, var42, var43);
                                if (client.field267 == 2) {
                                    method2((client.field270 - field1912 << 7) + client.field273, (client.field324 - field1084 << 7) + client.field274, client.field331 * 2);
                                    if (client.field355 > -1 && client.field259 % 20 < 10) {
                                        field900[0].method1415(client.field355 + var40 - 12, client.field304 + var41 - 28);
                                    }
                                }
                                ((class90) field1500).method1866(client.field326);
                                client.method2060(var40, var41, var42, var43);
                                field1480 = var62;
                                field491 = var63;
                                field2530 = var64;
                                field31 = var65;
                                field1896 = var66;
                                if (client.field258 && class162.method2549(true, false) == 0) {
                                    client.field258 = false;
                                }
                                if (client.field258) {
                                    class75.method1533(var40, var41, var42, var43, 0);
                                    method869(class148.field2457, false);
                                }
                                client.field492[var10.field2767] = true;
                                class75.method1499(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2642 == 1338) {
                                client.method181(var10, var12, var13, var11);
                                class75.method1499(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2642 == 1339) {
                                client.method932(var10, var12, var13, var11);
                                class75.method1499(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2765 == 0) {
                            if (!var10.field2648 && client.method545(var10) && field584 != var10) {
                                continue;
                            }
                            if (!var10.field2648) {
                                if (var10.field2630 > var10.field2750 - var10.field2654) {
                                    var10.field2630 = var10.field2750 - var10.field2654;
                                }
                                if (var10.field2630 < 0) {
                                    var10.field2630 = 0;
                                }
                            }
                            method1330(arg0, var10.field2684, var19, var20, var21, var22, var12 - var10.field2627, var13 - var10.field2630, var11);
                            if (var10.field2731 != null) {
                                method1330(var10.field2731, var10.field2684, var19, var20, var21, var22, var12 - var10.field2627, var13 - var10.field2630, var11);
                            }
                            class4 var72 = (class4) client.field413.method3297((long) var10.field2684);
                            if (var72 != null) {
                                client.method599(var72.field58, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class75.method1499(arg2, arg3, arg4, arg5);
                            class86.method1825();
                        }
                        if (client.field499 || client.field337[var11] || client.field466 > 1) {
                            if (var10.field2765 == 0 && !var10.field2648 && var10.field2750 > var10.field2654) {
                                client.method137(var10.field2653 + var12, var13, var10.field2630, var10.field2654, var10.field2750);
                            }
                            if (var10.field2765 != 1) {
                                if (var10.field2765 == 2) {
                                    int var73 = 0;
                                    for (int var74 = 0; var74 < var10.field2650; var74++) {
                                        for (int var75 = 0; var75 < var10.field2649; var75++) {
                                            int var76 = (var10.field2702 + 32) * var75 + var12;
                                            int var77 = (var10.field2703 + 32) * var74 + var13;
                                            if (var73 < 20) {
                                                var76 += var10.field2714[var73];
                                                var77 += var10.field2707[var73];
                                            }
                                            if (var10.field2681[var73] > 0) {
                                                boolean var78 = false;
                                                boolean var79 = false;
                                                int var80 = var10.field2681[var73] - 1;
                                                if (var76 + 32 > arg2 && var76 < arg4 && var77 + 32 > arg3 && var77 < arg5 || field1950 == var10 && client.field285 == var73) {
                                                    class74 var81;
                                                    if (client.field302 == 1 && field2590 == var73 && field990 == var10.field2684) {
                                                        var81 = class47.method2058(var80, var10.field2755[var73], 2, 0, 2, false);
                                                    } else {
                                                        var81 = class47.method2058(var80, var10.field2755[var73], 1, 3153952, 2, false);
                                                    }
                                                    if (var81 == null) {
                                                        client.method3247(var10);
                                                    } else if (field1950 == var10 && client.field285 == var73) {
                                                        int var82 = class132.field2053 - client.field364;
                                                        int var83 = class132.field2054 - client.field365;
                                                        if (var82 < 5 && var82 > -5) {
                                                            var82 = 0;
                                                        }
                                                        if (var83 < 5 && var83 > -5) {
                                                            var83 = 0;
                                                        }
                                                        if (client.field401 < 5) {
                                                            var82 = 0;
                                                            var83 = 0;
                                                        }
                                                        var81.method1420(var76 + var82, var77 + var83, 128);
                                                        if (arg1 != -1) {
                                                            class164 var84 = arg0[arg1 & 0xFFFF];
                                                            if (var77 + var83 < class75.field1346 && var84.field2630 > 0) {
                                                                int var85 = client.field326 * (class75.field1346 - var77 - var83) / 3;
                                                                if (var85 > client.field326 * 10) {
                                                                    var85 = client.field326 * 10;
                                                                }
                                                                if (var85 > var84.field2630) {
                                                                    var85 = var84.field2630;
                                                                }
                                                                var84.field2630 -= var85;
                                                                client.field365 += var85;
                                                                client.method3247(var84);
                                                            }
                                                            if (var77 + var83 + 32 > class75.field1347 && var84.field2630 < var84.field2750 - var84.field2654) {
                                                                int var86 = client.field326 * (var77 + var83 + 32 - class75.field1347) / 3;
                                                                if (var86 > client.field326 * 10) {
                                                                    var86 = client.field326 * 10;
                                                                }
                                                                if (var86 > var84.field2750 - var84.field2654 - var84.field2630) {
                                                                    var86 = var84.field2750 - var84.field2654 - var84.field2630;
                                                                }
                                                                var84.field2630 += var86;
                                                                client.field365 -= var86;
                                                                client.method3247(var84);
                                                            }
                                                        }
                                                    } else if (field981 == var10 && client.field277 == var73) {
                                                        var81.method1420(var76, var77, 128);
                                                    } else {
                                                        var81.method1415(var76, var77);
                                                    }
                                                }
                                            } else if (var10.field2761 != null && var73 < 20) {
                                                class74 var87 = var10.method2949(var73);
                                                if (var87 != null) {
                                                    var87.method1415(var76, var77);
                                                } else if (class164.field2636) {
                                                    client.method3247(var10);
                                                }
                                            }
                                            var73++;
                                        }
                                    }
                                } else if (var10.field2765 == 3) {
                                    int var88;
                                    if (client.method3420(var10)) {
                                        var88 = var10.field2664;
                                        if (field584 == var10 && var10.field2666 != 0) {
                                            var88 = var10.field2666;
                                        }
                                    } else {
                                        var88 = var10.field2663;
                                        if (field584 == var10 && var10.field2665 != 0) {
                                            var88 = var10.field2665;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2667) {
                                            class75.method1533(var12, var13, var10.field2653, var10.field2654, var88);
                                        } else {
                                            class75.method1502(var12, var13, var10.field2653, var10.field2654, var88);
                                        }
                                    } else if (var10.field2667) {
                                        class75.method1504(var12, var13, var10.field2653, var10.field2654, var88, 256 - (var14 & 0xFF));
                                    } else {
                                        class75.method1508(var12, var13, var10.field2653, var10.field2654, var88, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2765 == 4) {
                                    class215 var89 = var10.method2973();
                                    if (var89 != null) {
                                        String var90 = var10.field2696;
                                        int var91;
                                        if (client.method3420(var10)) {
                                            var91 = var10.field2664;
                                            if (field584 == var10 && var10.field2666 != 0) {
                                                var91 = var10.field2666;
                                            }
                                            if (var10.field2697.length() > 0) {
                                                var90 = var10.field2697;
                                            }
                                        } else {
                                            var91 = var10.field2663;
                                            if (field584 == var10 && var10.field2665 != 0) {
                                                var91 = var10.field2665;
                                            }
                                        }
                                        if (var10.field2648 && var10.field2639 != -1) {
                                            class47 var92 = class47.method1037(var10.field2639);
                                            var90 = var92.field1040;
                                            if (var90 == null) {
                                                var90 = "null";
                                            }
                                            if ((var92.field1051 == 1 || var10.field2677 != 1) && var10.field2677 != -1) {
                                                var90 = class2.method2079(16748608) + var90 + class2.field26 + " " + 'x' + client.method759(var10.field2677);
                                            }
                                        }
                                        if (client.field416 == var10) {
                                            class148 var10000 = (class148) null;
                                            var90 = class148.field2219;
                                            var91 = var10.field2663;
                                        }
                                        if (!var10.field2648) {
                                            var90 = client.method87(var90, var10);
                                        }
                                        var89.method3544(var90, var12, var13, var10.field2653, var10.field2654, var91, var10.field2701 ? 0 : -1, var10.field2699, var10.field2730, var10.field2698);
                                    } else if (class164.field2636) {
                                        client.method3247(var10);
                                    }
                                } else if (var10.field2765 == 5) {
                                    if (var10.field2648) {
                                        class74 var94;
                                        if (var10.field2639 == -1) {
                                            var94 = var10.method2947(false);
                                        } else {
                                            var94 = class47.method2058(var10.field2639, var10.field2677, var10.field2759, var10.field2676, var10.field2694, false);
                                        }
                                        if (var94 != null) {
                                            int var95 = var94.field1331;
                                            int var96 = var94.field1337;
                                            if (var10.field2674) {
                                                class75.method1500(var12, var13, var10.field2653 + var12, var10.field2654 + var13);
                                                int var97 = (var10.field2653 + (var95 - 1)) / var95;
                                                int var98 = (var10.field2654 + (var96 - 1)) / var96;
                                                for (int var99 = 0; var99 < var97; var99++) {
                                                    for (int var100 = 0; var100 < var98; var100++) {
                                                        if (var10.field2673 != 0) {
                                                            var94.method1439(var95 / 2 + var95 * var99 + var12, var96 / 2 + var96 * var100 + var13, var10.field2673, 4096);
                                                        } else if (var14 == 0) {
                                                            var94.method1415(var95 * var99 + var12, var96 * var100 + var13);
                                                        } else {
                                                            var94.method1420(var95 * var99 + var12, var96 * var100 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class75.method1499(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var101 = var10.field2653 * 4096 / var95;
                                                if (var10.field2673 != 0) {
                                                    var94.method1439(var10.field2653 / 2 + var12, var10.field2654 / 2 + var13, var10.field2673, var101);
                                                } else if (var14 != 0) {
                                                    var94.method1422(var12, var13, var10.field2653, var10.field2654, 256 - (var14 & 0xFF));
                                                } else if (var10.field2653 == var95 && var10.field2654 == var96) {
                                                    var94.method1415(var12, var13);
                                                } else {
                                                    var94.method1417(var12, var13, var10.field2653, var10.field2654);
                                                }
                                            }
                                        } else if (class164.field2636) {
                                            client.method3247(var10);
                                        }
                                    } else {
                                        class74 var93 = var10.method2947(client.method3420(var10));
                                        if (var93 != null) {
                                            var93.method1415(var12, var13);
                                        } else if (class164.field2636) {
                                            client.method3247(var10);
                                        }
                                    }
                                } else if (var10.field2765 == 6) {
                                    boolean var102 = client.method3420(var10);
                                    int var103;
                                    if (var102) {
                                        var103 = var10.field2746;
                                    } else {
                                        var103 = var10.field2683;
                                    }
                                    class100 var104 = null;
                                    int var105 = 0;
                                    if (var10.field2639 != -1) {
                                        class47 var106 = class47.method1037(var10.field2639);
                                        if (var106 != null) {
                                            class47 var107 = var106.method879(var10.field2677);
                                            var104 = var107.method909(1);
                                            if (var104 == null) {
                                                client.method3247(var10);
                                            } else {
                                                var104.method1974();
                                                var105 = var104.field1384 / 2;
                                            }
                                        }
                                    } else if (var10.field2679 == 5) {
                                        if (var10.field2680 == 0) {
                                            var104 = client.field327.method3028((class40) null, -1, (class40) null, -1);
                                        } else {
                                            var104 = field579.method16();
                                        }
                                    } else if (var103 == -1) {
                                        var104 = var10.method2950((class40) null, -1, var102, field579.field29);
                                        if (var104 == null && class164.field2636) {
                                            client.method3247(var10);
                                        }
                                    } else {
                                        class40 var108 = class40.method512(var103);
                                        var104 = var10.method2950(var108, var10.field2705, var102, field579.field29);
                                        if (var104 == null && class164.field2636) {
                                            client.method3247(var10);
                                        }
                                    }
                                    class86.method1780(var10.field2653 / 2 + var12, var10.field2654 / 2 + var13);
                                    int var109 = var10.field2690 * class86.field1515[var10.field2687] >> 16;
                                    int var110 = var10.field2690 * class86.field1516[var10.field2687] >> 16;
                                    if (var104 != null) {
                                        if (var10.field2648) {
                                            var104.method1974();
                                            if (var10.field2693) {
                                                var104.method1987(0, var10.field2662, var10.field2758, var10.field2687, var10.field2685, var10.field2686 + var105 + var109, var10.field2686 + var110, var10.field2690);
                                            } else {
                                                var104.method1982(0, var10.field2662, var10.field2758, var10.field2687, var10.field2685, var10.field2686 + var105 + var109, var10.field2686 + var110);
                                            }
                                        } else {
                                            var104.method1982(0, var10.field2662, 0, var10.field2687, 0, var109, var110);
                                        }
                                    }
                                    class86.method1779();
                                } else {
                                    if (var10.field2765 == 7) {
                                        class215 var111 = var10.method2973();
                                        if (var111 == null) {
                                            if (class164.field2636) {
                                                client.method3247(var10);
                                            }
                                            continue;
                                        }
                                        int var112 = 0;
                                        for (int var113 = 0; var113 < var10.field2650; var113++) {
                                            for (int var114 = 0; var114 < var10.field2649; var114++) {
                                                if (var10.field2681[var112] > 0) {
                                                    class47 var115 = class47.method1037(var10.field2681[var112] - 1);
                                                    String var116;
                                                    if (var115.field1051 != 1 && var10.field2755[var112] == 1) {
                                                        var116 = class2.method2079(16748608) + var115.field1040 + class2.field26;
                                                    } else {
                                                        var116 = class2.method2079(16748608) + var115.field1040 + class2.field26 + " " + 'x' + client.method759(var10.field2755[var112]);
                                                    }
                                                    int var117 = (var10.field2702 + 115) * var114 + var12;
                                                    int var118 = (var10.field2703 + 12) * var113 + var13;
                                                    if (var10.field2699 == 0) {
                                                        var111.method3588(var116, var117, var118, var10.field2663, var10.field2701 ? 0 : -1);
                                                    } else if (var10.field2699 == 1) {
                                                        var111.method3568(var116, var10.field2653 / 2 + var117, var118, var10.field2663, var10.field2701 ? 0 : -1);
                                                    } else {
                                                        var111.method3542(var116, var10.field2653 + var117 - 1, var118, var10.field2663, var10.field2701 ? 0 : -1);
                                                    }
                                                }
                                                var112++;
                                            }
                                        }
                                    }
                                    if (var10.field2765 == 8 && field66 == var10 && client.field404 == client.field403) {
                                        int var119 = 0;
                                        int var120 = 0;
                                        class215 var121 = field3008;
                                        String var122 = var10.field2696;
                                        String var123 = client.method87(var122, var10);
                                        while (var123.length() > 0) {
                                            int var124 = var123.indexOf(class2.field21);
                                            String var125;
                                            if (var124 == -1) {
                                                var125 = var123;
                                                var123 = "";
                                            } else {
                                                var125 = var123.substring(0, var124);
                                                var123 = var123.substring(var124 + 4);
                                            }
                                            int var126 = var121.method3536(var125);
                                            if (var126 > var119) {
                                                var119 = var126;
                                            }
                                            var120 += var121.field3088 + 1;
                                        }
                                        var119 += 6;
                                        var120 += 7;
                                        int var127 = var10.field2653 + var12 - 5 - var119;
                                        int var128 = var10.field2654 + var13 + 5;
                                        if (var127 < var12 + 5) {
                                            var127 = var12 + 5;
                                        }
                                        if (var119 + var127 > arg4) {
                                            var127 = arg4 - var119;
                                        }
                                        if (var120 + var128 > arg5) {
                                            var128 = arg5 - var120;
                                        }
                                        class75.method1533(var127, var128, var119, var120, 16777120);
                                        class75.method1502(var127, var128, var119, var120, 0);
                                        String var129 = var10.field2696;
                                        int var130 = var121.field3088 + var128 + 2;
                                        String var131 = client.method87(var129, var10);
                                        while (var131.length() > 0) {
                                            int var132 = var131.indexOf(class2.field21);
                                            String var133;
                                            if (var132 == -1) {
                                                var133 = var131;
                                                var131 = "";
                                            } else {
                                                var133 = var131.substring(0, var132);
                                                var131 = var131.substring(var132 + 4);
                                            }
                                            var121.method3588(var133, var127 + 3, var130, 0, -1);
                                            var130 += var121.field3088 + 1;
                                        }
                                    }
                                    if (var10.field2765 == 9) {
                                        if (var10.field2645 == 1) {
                                            int var134;
                                            int var135;
                                            int var136;
                                            int var137;
                                            if (var10.field2670) {
                                                var134 = var12;
                                                var135 = var10.field2654 + var13;
                                                var136 = var10.field2653 + var12;
                                                var137 = var13;
                                            } else {
                                                var134 = var12;
                                                var135 = var13;
                                                var136 = var10.field2653 + var12;
                                                var137 = var10.field2654 + var13;
                                            }
                                            class75.method1513(var134, var135, var136, var137, var10.field2663);
                                        } else {
                                            int var138 = var10.field2653 >= 0 ? var10.field2653 : -var10.field2653;
                                            int var139 = var10.field2654 >= 0 ? var10.field2654 : -var10.field2654;
                                            int var140 = var138;
                                            if (var138 < var139) {
                                                var140 = var139;
                                            }
                                            if (var140 != 0) {
                                                int var141 = (var10.field2653 << 16) / var140;
                                                int var142 = (var10.field2654 << 16) / var140;
                                                if (var142 <= var141) {
                                                    var141 = -var141;
                                                } else {
                                                    var142 = -var142;
                                                }
                                                int var143 = var10.field2645 * var142 >> 17;
                                                int var144 = var10.field2645 * var142 + 1 >> 17;
                                                int var145 = var10.field2645 * var141 >> 17;
                                                int var146 = var10.field2645 * var141 + 1 >> 17;
                                                int var147 = var12 + var143;
                                                int var148 = var12 - var144;
                                                int var149 = var10.field2653 + var12 - var144;
                                                int var150 = var10.field2653 + var12 + var143;
                                                int var151 = var13 + var145;
                                                int var152 = var13 - var146;
                                                int var153 = var10.field2654 + var13 - var146;
                                                int var154 = var10.field2654 + var13 + var145;
                                                class86.method1835(var147, var148, var149);
                                                class86.method1788(var151, var152, var153, var147, var148, var149, var10.field2663);
                                                class86.method1835(var147, var149, var150);
                                                class86.method1788(var151, var153, var154, var147, var149, var150, var10.field2663);
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

    @ObfuscatedName("z.dp(IIIIIIII)V")
    public static final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class164.method2749(arg0)) {
            client.method1369(field2726[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("cm.di(IIII)Lk;")
    public static final class4 method1583(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field58 = arg1;
        var3.field53 = arg2;
        client.field413.method3288(var3, (long) arg0);
        client.method2536(arg1);
        class164 var4 = class164.method145(arg0);
        client.method3247(var4);
        if (client.field416 != null) {
            client.method3247(client.field416);
            client.field416 = null;
        }
        client.method1858();
        client.method169(field2726[arg0 >> 16], var4, false);
        class34.method2052(arg1);
        if (client.field306 != -1) {
            client.method1859(client.field306, 1);
        }
        return var3;
    }
}
