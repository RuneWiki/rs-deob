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
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;

public class Statics {

    @ObfuscatedName("o.b")
    public static int field1;

    @ObfuscatedName("br.aa")
    public static int[] field1000;

    @ObfuscatedName("br.f")
    public static class65[] field1001;

    @ObfuscatedName("br.p")
    public static class70[] field1002;

    @ObfuscatedName("br.i")
    public static boolean[] field1003;

    @ObfuscatedName("br.y")
    public static class53[] field1010;

    @ObfuscatedName("br.r")
    public static float[] field1011;

    @ObfuscatedName("br.a")
    public static float[] field1012;

    @ObfuscatedName("br.e")
    public static float[] field1013;

    @ObfuscatedName("br.au")
    public static float[] field1014;

    @ObfuscatedName("br.ag")
    public static float[] field1015;

    @ObfuscatedName("br.l")
    public static byte[] field1017;

    @ObfuscatedName("br.t")
    public static float[] field1018;

    @ObfuscatedName("br.ae")
    public static int[] field1019;

    @ObfuscatedName("z.jn")
    public static int field102;

    @ObfuscatedName("br.j")
    public static class57[] field1021;

    @ObfuscatedName("bv.y")
    public static boolean[] field1028;

    @ObfuscatedName("bv.k")
    public static int[] field1036;

    @ObfuscatedName("bv.z")
    public static int[] field1037;

    @ObfuscatedName("z.qo")
    public static Font field104;

    @ObfuscatedName("bf.o")
    public static int field1043;

    @ObfuscatedName("bf.m")
    public static boolean field1045;

    @ObfuscatedName("bf.g")
    public static class64 field1049;

    @ObfuscatedName("z.z")
    public static int[] field105;

    @ObfuscatedName("bf.nq")
    public static int field1060;

    @ObfuscatedName("be.fh")
    public static int field1079;

    @ObfuscatedName("be.y")
    public static class145 field1084;

    @ObfuscatedName("y.dz")
    public static int[][] field109;

    @ObfuscatedName("ba.dh")
    public static byte[][] field1090;

    @ObfuscatedName("ba.gr")
    public static int field1094;

    @ObfuscatedName("ba.u")
    public static class223[] field1095;

    @ObfuscatedName("bs.c")
    public static float field1132;

    @ObfuscatedName("bs.u")
    public static int field1141;

    @ObfuscatedName("by.ir")
    public static class170 field1193;

    @ObfuscatedName("bn.nm")
    public static int field1198;

    @ObfuscatedName("bn.l")
    public static int[] field1200;

    @ObfuscatedName("bj.qx")
    public static int field1201;

    @ObfuscatedName("bj.qb")
    public static class221 field1210;

    @ObfuscatedName("bj.py")
    public static Clipboard field1211;

    @ObfuscatedName("j.ps")
    public static int field122;

    @ObfuscatedName("ct.pf")
    public static class117 field1295;

    @ObfuscatedName("ce.p")
    public static int[] field1312;

    @ObfuscatedName("cp.pc")
    public static class104 field1347;

    @ObfuscatedName("cy.bm")
    public static int field1380;

    @ObfuscatedName("cy.br")
    public static int field1392;

    @ObfuscatedName("cy.bd")
    public static int field1410;

    @ObfuscatedName("ch.v")
    public static int field1419;

    @ObfuscatedName("f.no")
    public static class66 field142;

    @ObfuscatedName("f.bp")
    public static class185 field143;

    @ObfuscatedName("cu.z")
    public static int field1433;

    @ObfuscatedName("cu.y")
    public static int field1434;

    @ObfuscatedName("cu.j")
    public static int field1435;

    @ObfuscatedName("cu.p")
    public static int field1437;

    @ObfuscatedName("cu.f")
    public static int field1438;

    @ObfuscatedName("cu.s")
    public static int field1439;

    @ObfuscatedName("f.co")
    public static class111 field144;

    @ObfuscatedName("cu.x")
    public static int field1440;

    @ObfuscatedName("cu.n")
    public static class94 field1443;

    @ObfuscatedName("cu.i")
    public static int field1446;

    @ObfuscatedName("co.k")
    public static short[][] field1462;

    @ObfuscatedName("cl.a")
    public static int field1464;

    @ObfuscatedName("cl.bu")
    public static int field1466;

    @ObfuscatedName("cl.s")
    public static int field1472;

    @ObfuscatedName("cl.bh")
    public static boolean[][] field1475;

    @ObfuscatedName("cl.x")
    public static int field1481;

    @ObfuscatedName("cl.w")
    public static int field1483;

    @ObfuscatedName("cl.n")
    public static int field1484;

    @ObfuscatedName("cl.q")
    public static int field1485;

    @ObfuscatedName("cl.t")
    public static int field1486;

    @ObfuscatedName("cl.e")
    public static int field1489;

    @ObfuscatedName("f.nb")
    public static int field149;

    @ObfuscatedName("cl.bf")
    public static int field1490;

    @ObfuscatedName("cl.ag")
    public static int field1491;

    @ObfuscatedName("cl.aa")
    public static int field1493;

    @ObfuscatedName("cl.am")
    public static int field1497;

    @ObfuscatedName("cl.r")
    public static int field1515;

    @ObfuscatedName("cl.au")
    public static int field1519;

    @ObfuscatedName("cl.bv")
    public static int field1520;

    @ObfuscatedName("cl.d")
    public static int field1521;

    @ObfuscatedName("cl.bp")
    public static int field1523;

    @ObfuscatedName("cl.be")
    public static int field1524;

    @ObfuscatedName("cl.bo")
    public static int field1525;

    @ObfuscatedName("cb.ea")
    public static class225 field1527;

    @ObfuscatedName("cb.nw")
    public static class58 field1528;

    @ObfuscatedName("cb.cl")
    public static char field1530;

    @ObfuscatedName("cb.m")
    public static boolean[] field1531;

    @ObfuscatedName("cn.q")
    public static String field1542;

    @ObfuscatedName("cr.nc")
    public static class52 field1555;

    @ObfuscatedName("cr.bf")
    public static FontMetrics field1556;

    @ObfuscatedName("cr.v")
    public static int[] field1558;

    @ObfuscatedName("p.u")
    public static class229 field156;

    @ObfuscatedName("ci.h")
    public static class183 field1560;

    @ObfuscatedName("ci.n")
    public static String field1561;

    @ObfuscatedName("p.pj")
    public static long field157;

    @ObfuscatedName("cq.qt")
    public static int field1585;

    @ObfuscatedName("cg.p")
    public static int[][][] field1597;

    @ObfuscatedName("cg.qh")
    public static Image field1598;

    @ObfuscatedName("p.bo")
    public static class185 field161;

    @ObfuscatedName("cw.hu")
    public static int field1620;

    @ObfuscatedName("cv.bd")
    public static class223[] field1631;

    @ObfuscatedName("cv.dt")
    public static int field1634;

    @ObfuscatedName("i.q")
    public static int[] field164;

    @ObfuscatedName("cj.b")
    public static int field1647;

    @ObfuscatedName("i.eo")
    public static class225[] field165;

    @ObfuscatedName("cj.m")
    public static String field1650;

    @ObfuscatedName("cj.o")
    public static Applet field1654;

    @ObfuscatedName("cz.bd")
    public static class185 field1666;

    @ObfuscatedName("cz.m")
    public static String field1667;

    @ObfuscatedName("cz.i")
    public static String[] field1678;

    @ObfuscatedName("cz.o")
    public static String field1679;

    @ObfuscatedName("dq.h")
    public static File field1686;

    @ObfuscatedName("dq.f")
    public static class73[] field1691;

    @ObfuscatedName("dc.qz")
    public static int field1721;

    @ObfuscatedName("dx.m")
    public static File field1732;

    @ObfuscatedName("dx.dq")
    public static int field1735;

    @ObfuscatedName("dl.kr")
    public static class47 field1745;

    @ObfuscatedName("dl.pm")
    public static class2 field1749;

    @ObfuscatedName("dl.hy")
    public static int field1750;

    @ObfuscatedName("dj.fy")
    public static int field1759;

    @ObfuscatedName("dj.ms")
    public static class25[] field1763;

    @ObfuscatedName("dk.l")
    public static class225 field1767;

    @ObfuscatedName("de.p")
    public static String field1777;

    @ObfuscatedName("de.qm")
    public static Frame field1778;

    @ObfuscatedName("s.fo")
    public static int field178;

    @ObfuscatedName("s.du")
    public static int[] field180;

    @ObfuscatedName("da.fl")
    public static int field1804;

    @ObfuscatedName("x.dd")
    public static int field183;

    @ObfuscatedName("dz.iw")
    public static int field1832;

    @ObfuscatedName("dz.io")
    public static int field1838;

    @ObfuscatedName("x.po")
    public static int field185;

    @ObfuscatedName("dw.pe")
    public static class231 field1855;

    @ObfuscatedName("x.qf")
    public static int field186;

    @ObfuscatedName("dw.w")
    public static class154 field1863;

    @ObfuscatedName("dw.h")
    public static int field1864;

    @ObfuscatedName("ds.bh")
    public static class185 field1865;

    @ObfuscatedName("ds.c")
    public static short[][] field1868;

    @ObfuscatedName("x.k")
    public static int field187;

    @ObfuscatedName("x.fp")
    public static int field191;

    @ObfuscatedName("ev.if")
    public static int field1926;

    @ObfuscatedName("ev.g")
    public static class140 field1927;

    @ObfuscatedName("ev.b")
    public static class183 field1928;

    @ObfuscatedName("ev.m")
    public static class183 field1929;

    @ObfuscatedName("d.as")
    public static class185 field193;

    @ObfuscatedName("ev.v")
    public static class183 field1931;

    @ObfuscatedName("ev.l")
    public static int field1932;

    @ObfuscatedName("ev.u")
    public static int field1933;

    @ObfuscatedName("ev.o")
    public static class183 field1935;

    @ObfuscatedName("ea.nu")
    public static int field1942;

    @ObfuscatedName("ea.bt")
    public static String field1968;

    @ObfuscatedName("eh.as")
    public static class225[] field1992;

    @ObfuscatedName("et.ep")
    public static class225[] field2020;

    @ObfuscatedName("et.es")
    public static class223[] field2022;

    @ObfuscatedName("ew.c")
    public static class180 field2025;

    @ObfuscatedName("en.k")
    public static int[] field2033;

    @ObfuscatedName("en.kw")
    public static class113 field2034;

    @ObfuscatedName("ek.o")
    public static boolean field2046;

    @ObfuscatedName("ek.af")
    public static boolean field2048;

    @ObfuscatedName("d.s")
    public static String[] field205;

    @ObfuscatedName("es.i")
    public static class154 field2052;

    @ObfuscatedName("ee.m")
    public static int field2058;

    @ObfuscatedName("ee.z")
    public static class170 field2061;

    @ObfuscatedName("ee.et")
    public static class225[] field2062;

    @ObfuscatedName("w.da")
    public static int[] field207;

    @ObfuscatedName("w.pk")
    public static GarbageCollectorMXBean field209;

    @ObfuscatedName("w.gb")
    public static class170 field210;

    @ObfuscatedName("ez.qu")
    public static int field2109;

    @ObfuscatedName("w.g")
    public static File field211;

    @ObfuscatedName("em.mk")
    public static class225 field2119;

    @ObfuscatedName("em.ie")
    public static class39 field2121;

    @ObfuscatedName("el.m")
    public static long field2125;

    @ObfuscatedName("el.o")
    public static long field2128;

    @ObfuscatedName("el.id")
    public static int field2129;

    @ObfuscatedName("fp.ds")
    public static class88 field2137;

    @ObfuscatedName("fp.ev")
    public static class225 field2140;

    @ObfuscatedName("fp.ax")
    public static class103 field2141;

    @ObfuscatedName("fh.ec")
    public static class225[] field2143;

    @ObfuscatedName("fq.ng")
    public static int field2152;

    @ObfuscatedName("w.i")
    public static int field216;

    @ObfuscatedName("fe.ji")
    public static int field2164;

    @ObfuscatedName("fe.l")
    public static short[] field2167;

    @ObfuscatedName("w.b")
    public static class183 field217;

    @ObfuscatedName("ff.bz")
    public static int field2175;

    @ObfuscatedName("ff.mh")
    public static byte field2178;

    @ObfuscatedName("ff.ad")
    public static class185 field2179;

    @ObfuscatedName("fw.u")
    public static short[] field2186;

    @ObfuscatedName("w.cj")
    public static class209 field219;

    @ObfuscatedName("fw.fa")
    public static int field2191;

    @ObfuscatedName("fi.f")
    public static String field2196;

    @ObfuscatedName("fa.v")
    public static int field2198;

    @ObfuscatedName("fa.aj")
    public static long field2199;

    @ObfuscatedName("b.a")
    public static int[] field22;

    @ObfuscatedName("n.lg")
    public static class217 field223;

    @ObfuscatedName("fl.o")
    public static class170[][] field2257;

    @ObfuscatedName("fl.g")
    public static class183 field2285;

    @ObfuscatedName("q.am")
    public static int[] field231;

    @ObfuscatedName("fl.v")
    public static boolean field2343;

    @ObfuscatedName("fn.f")
    public static class182 field2359;

    @ObfuscatedName("q.by")
    public static int field238;

    @ObfuscatedName("g.hr")
    public static int field24;

    @ObfuscatedName("t.ix")
    public static int field245;

    @ObfuscatedName("t.iu")
    public static class170 field246;

    @ObfuscatedName("fx.ad")
    public static class223[] field2644;

    @ObfuscatedName("fd.cb")
    public static int field2671;

    @ObfuscatedName("fd.mo")
    public static int field2679;

    @ObfuscatedName("fd.pw")
    public static int field2680;

    @ObfuscatedName("g.bm")
    public static class223[] field27;

    @ObfuscatedName("r.rk")
    public static boolean field271;

    @ObfuscatedName("ft.c")
    public static int field2712;

    @ObfuscatedName("gc.v")
    public static byte[][][] field2738;

    @ObfuscatedName("r.ew")
    public static class225[] field275;

    @ObfuscatedName("gj.b")
    public static long field2758;

    @ObfuscatedName("gj.o")
    public static class111 field2775;

    @ObfuscatedName("gn.o")
    public static class183 field2780;

    @ObfuscatedName("ga.o")
    public static class183 field2782;

    @ObfuscatedName("ga.m")
    public static class183 field2784;

    @ObfuscatedName("gs.o")
    public static class183 field2788;

    @ObfuscatedName("gw.fb")
    public static int field2791;

    @ObfuscatedName("gw.o")
    public static class183 field2792;

    @ObfuscatedName("gm.o")
    public static class183 field2801;

    @ObfuscatedName("gq.b")
    public static int field2820;

    @ObfuscatedName("gq.o")
    public static class183 field2829;

    @ObfuscatedName("gt.m")
    public static class183 field2832;

    @ObfuscatedName("gt.o")
    public static class183 field2839;

    @ObfuscatedName("a.dc")
    public static int field284;

    @ObfuscatedName("gt.bk")
    public static class185 field2845;

    @ObfuscatedName("go.o")
    public static class183 field2852;

    @ObfuscatedName("gx.o")
    public static class183 field2856;

    @ObfuscatedName("gi.o")
    public static class183 field2867;

    @ObfuscatedName("gi.m")
    public static class183 field2882;

    @ObfuscatedName("gi.b")
    public static class183 field2890;

    @ObfuscatedName("client.v")
    public static class179 field292;

    @ObfuscatedName("gg.m")
    public static class183 field2927;

    @ObfuscatedName("gu.h")
    public static class183 field2942;

    @ObfuscatedName("gu.z")
    public static class209 field2947;

    @ObfuscatedName("gu.l")
    public static int field2969;

    @ObfuscatedName("gh.m")
    public static class183 field2995;

    @ObfuscatedName("gh.o")
    public static class183 field3015;

    @ObfuscatedName("gd.o")
    public static class183 field3040;

    @ObfuscatedName("gf.o")
    public static class183 field3052;

    @ObfuscatedName("gf.m")
    public static class183 field3058;

    @ObfuscatedName("gf.b")
    public static class183 field3062;

    @ObfuscatedName("gy.b")
    public static class183 field3071;

    @ObfuscatedName("gv.h")
    public static byte[][][] field3073;

    @ObfuscatedName("gv.bl")
    public static class185 field3077;

    @ObfuscatedName("gv.m")
    public static int field3078;

    @ObfuscatedName("gz.bu")
    public static class185 field3087;

    @ObfuscatedName("gz.bj")
    public static int field3088;

    @ObfuscatedName("gz.at")
    public static int field3092;

    @ObfuscatedName("he.k")
    public static class223[] field3118;

    @ObfuscatedName("ht.ek")
    public static class223[] field3122;

    @ObfuscatedName("ht.g")
    public static int[] field3126;

    @ObfuscatedName("hh.n")
    public static int[] field3160;

    @ObfuscatedName("hf.g")
    public static class183 field3167;

    @ObfuscatedName("hf.bv")
    public static class185 field3169;

    @ObfuscatedName("hn.e")
    public static int[] field3171;

    @ObfuscatedName("hn.ag")
    public static int field3173;

    @ObfuscatedName("hn.am")
    public static int field3175;

    @ObfuscatedName("client.az")
    public static class111 field318;

    @ObfuscatedName("ho.c")
    public static int[] field3216;

    @ObfuscatedName("ho.b")
    public static int field3217;

    @ObfuscatedName("ho.h")
    public static int[] field3218;

    @ObfuscatedName("ho.o")
    public static int field3219;

    @ObfuscatedName("ho.j")
    public static boolean field3220;

    @ObfuscatedName("hr.s")
    public static int field3241;

    @ObfuscatedName("hx.w")
    public static String field3249;

    @ObfuscatedName("hb.z")
    public static class223 field3281;

    @ObfuscatedName("h.mi")
    public static byte field35;

    @ObfuscatedName("h.pz")
    public static class31 field36;

    @ObfuscatedName("h.u")
    public static byte[][] field37;

    @ObfuscatedName("o.o")
    public static class183 field4;

    @ObfuscatedName("v.cf")
    public static class209 field41;

    @ObfuscatedName("v.hq")
    public static class24 field43;

    @ObfuscatedName("l.cx")
    public static class111 field47;

    @ObfuscatedName("o.pp")
    public static short[] field5;

    @ObfuscatedName("c.gx")
    public static class170 field52;

    @ObfuscatedName("client.m")
    public static client field541;

    @ObfuscatedName("c.dg")
    public static int field55;

    @ObfuscatedName("e.bq")
    public static class185 field584;

    @ObfuscatedName("e.be")
    public static class185 field588;

    @ObfuscatedName("u.m")
    public static class183 field61;

    @ObfuscatedName("ag.nz")
    public static int field621;

    @ObfuscatedName("u.nr")
    public static class58 field63;

    @ObfuscatedName("u.en")
    public static class225[] field64;

    @ObfuscatedName("au.z")
    public static boolean field666;

    @ObfuscatedName("au.go")
    public static class170 field670;

    @ObfuscatedName("aa.aw")
    public static class103 field679;

    @ObfuscatedName("aa.k")
    public static class27 field686;

    @ObfuscatedName("aa.h")
    public static class30[] field692;

    @ObfuscatedName("aa.dw")
    public static byte[][] field693;

    @ObfuscatedName("aa.r")
    public static class21 field696;

    @ObfuscatedName("ae.hx")
    public static int field704;

    @ObfuscatedName("k.p")
    public static int field71;

    @ObfuscatedName("av.a")
    public static int[] field718;

    @ObfuscatedName("ao.g")
    public static String[] field732;

    @ObfuscatedName("ao.y")
    public static class170 field737;

    @ObfuscatedName("k.ne")
    public static int field74;

    @ObfuscatedName("ao.b")
    public static int[] field740;

    @ObfuscatedName("ao.eg")
    public static class225[] field741;

    @ObfuscatedName("ah.cd")
    public static class209 field758;

    @ObfuscatedName("k.bm")
    public static class185 field76;

    @ObfuscatedName("ab.k")
    public static class223 field770;

    @ObfuscatedName("ay.ju")
    public static int field775;

    @ObfuscatedName("k.qj")
    public static class110 field78;

    @ObfuscatedName("ay.qw")
    public static Canvas field782;

    @ObfuscatedName("ay.dx")
    public static int field788;

    @ObfuscatedName("k.o")
    public static class146 field79;

    @ObfuscatedName("an.qc")
    public static int field796;

    @ObfuscatedName("an.do")
    public static int[] field798;

    @ObfuscatedName("aw.jf")
    public static class170[] field807;

    @ObfuscatedName("aw.eh")
    public static class223[] field809;

    @ObfuscatedName("z.c")
    public static byte[][][] field81;

    @ObfuscatedName("aw.qi")
    public static int field810;

    @ObfuscatedName("aw.bn")
    public static int field813;

    @ObfuscatedName("ar.b")
    public static class223 field829;

    @ObfuscatedName("z.l")
    public static byte[][][] field83;

    @ObfuscatedName("ar.h")
    public static class223[] field830;

    @ObfuscatedName("ar.v")
    public static class225 field831;

    @ObfuscatedName("z.g")
    public static byte[][][] field84;

    @ObfuscatedName("ar.c")
    public static class223 field841;

    @ObfuscatedName("z.j")
    public static int[] field85;

    @ObfuscatedName("z.rh")
    public static String field86;

    @ObfuscatedName("z.u")
    public static int[][] field87;

    @ObfuscatedName("at.nh")
    public static int field888;

    @ObfuscatedName("z.y")
    public static int[] field89;

    @ObfuscatedName("al.v")
    public static class183 field893;

    @ObfuscatedName("az.ns")
    public static int field902;

    @ObfuscatedName("az.ba")
    public static class185 field908;

    @ObfuscatedName("z.f")
    public static int[] field91;

    @ObfuscatedName("az.w")
    public static int[] field913;

    @ObfuscatedName("az.qk")
    public static int field915;

    @ObfuscatedName("az.aq")
    public static class185 field916;

    @ObfuscatedName("ai.d")
    public static int[] field919;

    @ObfuscatedName("ai.cu")
    public static class103 field927;

    @ObfuscatedName("ai.nx")
    public static int field929;

    @ObfuscatedName("ai.ag")
    public static int[] field932;

    @ObfuscatedName("ai.j")
    public static class61 field933;

    @ObfuscatedName("ai.al")
    public static String field937;

    @ObfuscatedName("ap.e")
    public static int[] field944;

    @ObfuscatedName("aq.br")
    public static class223 field966;

    @ObfuscatedName("as.br")
    public static class185 field971;

    @ObfuscatedName("as.g")
    public static class223 field973;

    @ObfuscatedName("br.am")
    public static float[] field988;

    @ObfuscatedName("br.s")
    public static int[] field994;

    @ObfuscatedName("br.c")
    public static int field995;

    @ObfuscatedName("br.u")
    public static int field996;

    @ObfuscatedName("br.k")
    public static int field997;

    @ObfuscatedName("br.z")
    public static int field998;

    @ObfuscatedName("y.o(IB)Laj;")
    public static class49 method146(int arg0) {
        class49 var1 = (class49) class49.field947.method2130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2845.method3012(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class49 var3 = new class49();
        class154 var4 = new class154(var2);
        var4.field2105 = var4.field2108.length - 12;
        int var5 = var4.method2557();
        var3.field953 = var4.method2554();
        var3.field948 = var4.method2554();
        var3.field952 = var4.method2554();
        var3.field954 = var4.method2554();
        var4.field2105 = 0;
        var4.method2716();
        var3.field951 = new int[var5];
        var3.field949 = new int[var5];
        var3.field950 = new String[var5];
        int var6 = 0;
        while (var4.field2105 < var4.field2108.length - 12) {
            int var7 = var4.method2554();
            if (var7 == 3) {
                var3.field950[var6] = var4.method2606();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field949[var6] = var4.method2552();
            } else {
                var3.field949[var6] = var4.method2557();
            }
            var3.field951[var6++] = var7;
        }
        class49.field947.method2132(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.m(Ljava/lang/String;I)Ljava/io/File;")
    public static File method671(String arg0) {
        if (!class108.field1738) {
            throw new RuntimeException("");
        }
        File var1 = (File) class108.field1733.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(field1732, arg0);
        RandomAccessFile var3 = null;
        try {
            File var4 = new File(var2.getParent());
            if (!var4.exists()) {
                throw new RuntimeException("");
            }
            var3 = new RandomAccessFile(var2, "rw");
            int var5 = var3.read();
            var3.seek(0L);
            var3.write(var5);
            var3.seek(0L);
            var3.close();
            class108.field1733.put(arg0, var2);
            return var2;
        } catch (Exception var10) {
            try {
                if (var3 != null) {
                    var3.close();
                    Object var7 = null;
                }
            } catch (Exception var9) {
            }
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("av.g(Ljava/lang/CharSequence;II[BIB)I")
    public static int method646(CharSequence arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int var5 = arg2 - arg1;
        for (int var6 = 0; var6 < var5; var6++) {
            char var7 = arg0.charAt(arg1 + var6);
            if (!(var7 <= 0 || var7 >= 128) || !(var7 < 160 || var7 > 255)) {
                arg3[arg4 + var6] = (byte) var7;
            } else if (var7 == 8364) {
                arg3[arg4 + var6] = -128;
            } else if (var7 == 8218) {
                arg3[arg4 + var6] = -126;
            } else if (var7 == 402) {
                arg3[arg4 + var6] = -125;
            } else if (var7 == 8222) {
                arg3[arg4 + var6] = -124;
            } else if (var7 == 8230) {
                arg3[arg4 + var6] = -123;
            } else if (var7 == 8224) {
                arg3[arg4 + var6] = -122;
            } else if (var7 == 8225) {
                arg3[arg4 + var6] = -121;
            } else if (var7 == 710) {
                arg3[arg4 + var6] = -120;
            } else if (var7 == 8240) {
                arg3[arg4 + var6] = -119;
            } else if (var7 == 352) {
                arg3[arg4 + var6] = -118;
            } else if (var7 == 8249) {
                arg3[arg4 + var6] = -117;
            } else if (var7 == 338) {
                arg3[arg4 + var6] = -116;
            } else if (var7 == 381) {
                arg3[arg4 + var6] = -114;
            } else if (var7 == 8216) {
                arg3[arg4 + var6] = -111;
            } else if (var7 == 8217) {
                arg3[arg4 + var6] = -110;
            } else if (var7 == 8220) {
                arg3[arg4 + var6] = -109;
            } else if (var7 == 8221) {
                arg3[arg4 + var6] = -108;
            } else if (var7 == 8226) {
                arg3[arg4 + var6] = -107;
            } else if (var7 == 8211) {
                arg3[arg4 + var6] = -106;
            } else if (var7 == 8212) {
                arg3[arg4 + var6] = -105;
            } else if (var7 == 732) {
                arg3[arg4 + var6] = -104;
            } else if (var7 == 8482) {
                arg3[arg4 + var6] = -103;
            } else if (var7 == 353) {
                arg3[arg4 + var6] = -102;
            } else if (var7 == 8250) {
                arg3[arg4 + var6] = -101;
            } else if (var7 == 339) {
                arg3[arg4 + var6] = -100;
            } else if (var7 == 382) {
                arg3[arg4 + var6] = -98;
            } else if (var7 == 376) {
                arg3[arg4 + var6] = -97;
            } else {
                arg3[arg4 + var6] = 63;
            }
        }
        return var5;
    }

    @ObfuscatedName("cf.u(Lgl;Ljava/lang/String;Ljava/lang/String;I)[Lhm;")
    public static class225[] method1794(class183 arg0, String arg1, String arg2) {
        int var3 = arg0.method3027(arg1);
        int var4 = arg0.method3028(var3, arg2);
        class225[] var5;
        if (class226.method171(arg0, var3, var4)) {
            var5 = class226.method2524();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("bq.l(III)I")
    public static int method1104(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return field2359 != null && field2359.field1894 == var2 ? field2052.field2105 * 99 / (field2052.field2108.length - field2359.field2711) + 1 : 0;
    }

    @ObfuscatedName("as.l(B)V")
    public static final void method874() {
        class88.field1503 = false;
        client.field315 = false;
    }

    @ObfuscatedName("m.y(B)V")
    public static final void method16() {
        short var0 = 256;
        if (class42.field837 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class42.field837 > 768) {
                    field919[var1] = class42.method1048(field913[var1], field3160[var1], 1024 - class42.field837);
                } else if (class42.field837 > 256) {
                    field919[var1] = field3160[var1];
                } else {
                    field919[var1] = class42.method1048(field3160[var1], field913[var1], 256 - class42.field837);
                }
            }
        } else if (class42.field849 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class42.field849 > 768) {
                    field919[var2] = class42.method1048(field913[var2], field164[var2], 1024 - class42.field849);
                } else if (class42.field849 > 256) {
                    field919[var2] = field164[var2];
                } else {
                    field919[var2] = class42.method1048(field164[var2], field913[var2], 256 - class42.field849);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                field919[var3] = field913[var3];
            }
        }
        class220.method3690(class42.field861, 9, class42.field861 + 128, var0 + 7);
        field831.method3858(class42.field861, 0);
        class220.method3688();
        int var4 = 0;
        int var5 = class42.field861 + field1210.field3182 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * class42.field852[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = field231[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = field919[var10];
                    int var14 = field1210.field3179[var5];
                    field1210.field3179[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += field1210.field3182 + var8 - 128;
        }
        class220.method3690(class42.field861 + 765 - 128, 9, class42.field861 + 765, var0 + 7);
        field1767.method3858(class42.field861 + 382, 0);
        class220.method3688();
        int var15 = 0;
        int var16 = class42.field861 + field1210.field3182 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * class42.field852[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = field231[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = field919[var22];
                    int var26 = field1210.field3179[var20];
                    field1210.field3179[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = field1210.field3182 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("cv.ae(Lag;II)V")
    public static final void method1785(class28 arg0, int arg1) {
        if (arg0.field651 > client.field299) {
            client.method584(arg0);
        } else if (arg0.field652 >= client.field299) {
            if (client.field299 == arg0.field652 || arg0.field637 == -1 || arg0.field646 != 0 || arg0.field640 + 1 > class202.method658(arg0.field637).field3048[arg0.field638]) {
                int var2 = arg0.field652 - arg0.field651;
                int var3 = client.field299 - arg0.field651;
                int var4 = arg0.field659 * 128 + arg0.field613 * 64;
                int var5 = arg0.field633 * 128 + arg0.field613 * 64;
                int var6 = arg0.field648 * 128 + arg0.field613 * 64;
                int var7 = arg0.field650 * 128 + arg0.field613 * 64;
                arg0.field608 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field605 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field663 = 0;
            arg0.field656 = arg0.field653;
            arg0.field606 = arg0.field656;
        } else {
            client.method2088(arg0);
        }
        if (arg0.field608 < 128 || arg0.field605 < 128 || arg0.field608 >= 13184 || arg0.field605 >= 13184) {
            arg0.field637 = -1;
            arg0.field642 = -1;
            arg0.field651 = 0;
            arg0.field652 = 0;
            arg0.field608 = arg0.field660[0] * 128 + arg0.field613 * 64;
            arg0.field605 = arg0.field661[0] * 128 + arg0.field613 * 64;
            arg0.method573();
        }
        if (field43 == arg0 && (arg0.field608 < 1536 || arg0.field605 < 1536 || arg0.field608 >= 11776 || arg0.field605 >= 11776)) {
            arg0.field637 = -1;
            arg0.field642 = -1;
            arg0.field651 = 0;
            arg0.field652 = 0;
            arg0.field608 = arg0.field660[0] * 128 + arg0.field613 * 64;
            arg0.field605 = arg0.field661[0] * 128 + arg0.field613 * 64;
            arg0.method573();
        }
        client.method1784(arg0);
        arg0.field607 = false;
        if (arg0.field634 != -1) {
            class202 var8 = class202.method658(arg0.field634);
            if (var8 == null || var8.field3051 == null) {
                arg0.field634 = -1;
            } else {
                arg0.field636++;
                if (arg0.field631 < var8.field3051.length && arg0.field636 > var8.field3048[arg0.field631]) {
                    arg0.field636 = 1;
                    arg0.field631++;
                    client.method1328(var8, arg0.field631, arg0.field608, arg0.field605);
                }
                if (arg0.field631 >= var8.field3051.length) {
                    arg0.field636 = 0;
                    arg0.field631 = 0;
                    client.method1328(var8, arg0.field631, arg0.field608, arg0.field605);
                }
            }
        }
        if (arg0.field642 != -1 && client.field299 >= arg0.field645) {
            if (arg0.field643 < 0) {
                arg0.field643 = 0;
            }
            int var9 = class191.method3446(arg0.field642).field2804;
            if (var9 == -1) {
                arg0.field642 = -1;
            } else {
                class202 var10 = class202.method658(var9);
                if (var10 == null || var10.field3051 == null) {
                    arg0.field642 = -1;
                } else {
                    arg0.field665++;
                    if (arg0.field643 < var10.field3051.length && arg0.field665 > var10.field3048[arg0.field643]) {
                        arg0.field665 = 1;
                        arg0.field643++;
                        client.method1328(var10, arg0.field643, arg0.field608, arg0.field605);
                    }
                    if (arg0.field643 >= var10.field3051.length && (arg0.field643 < 0 || arg0.field643 >= var10.field3051.length)) {
                        arg0.field642 = -1;
                    }
                }
            }
        }
        if (arg0.field637 != -1 && arg0.field646 <= 1) {
            class202 var11 = class202.method658(arg0.field637);
            if (var11.field3047 == 1 && arg0.field664 > 0 && arg0.field651 <= client.field299 && arg0.field652 < client.field299) {
                arg0.field646 = 1;
                return;
            }
        }
        if (arg0.field637 != -1 && arg0.field646 == 0) {
            class202 var12 = class202.method658(arg0.field637);
            if (var12 == null || var12.field3051 == null) {
                arg0.field637 = -1;
            } else {
                arg0.field640++;
                if (arg0.field638 < var12.field3051.length && arg0.field640 > var12.field3048[arg0.field638]) {
                    arg0.field640 = 1;
                    arg0.field638++;
                    client.method1328(var12, arg0.field638, arg0.field608, arg0.field605);
                }
                if (arg0.field638 >= var12.field3051.length) {
                    arg0.field638 -= var12.field3055;
                    arg0.field627++;
                    if (arg0.field627 >= var12.field3053) {
                        arg0.field637 = -1;
                    } else if (arg0.field638 >= 0 && arg0.field638 < var12.field3051.length) {
                        client.method1328(var12, arg0.field638, arg0.field608, arg0.field605);
                    } else {
                        arg0.field637 = -1;
                    }
                }
                arg0.field607 = var12.field3065;
            }
        }
        if (arg0.field646 > 0) {
            arg0.field646--;
        }
    }

    @ObfuscatedName("cg.af(Ljava/lang/String;ZB)V")
    public static final void method1778(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = field758.method3581(arg0, 250);
        int var6 = field758.method3614(arg0, 250) * 13;
        class220.method3696(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class220.method3702(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        field758.method3625(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        client.method87(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            client.method143(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = field782.getGraphics();
            field1210.method3675(var7, 0, 0);
        } catch (Exception var9) {
            field782.repaint();
        }
    }

    @ObfuscatedName("hf.ai(III)V")
    public static final void method3672(int arg0, int arg1) {
        if (client.field307 == 2) {
            client.method3500((client.field334 - field1735 << 7) + client.field431, (client.field365 - field284 << 7) + client.field314, client.field312 * 2);
            if (client.field393 > -1 && client.field299 % 20 < 10) {
                field2020[0].method3814(client.field393 + arg0 - 12, client.field394 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("z.be(IIIIIB)V")
    public static final void method123(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field2137.method1747(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = field2137.method1620(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = field2119.field3211;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class198 var13 = class198.method2463(var12);
            if (var13.field2920 == -1) {
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
                class223 var14 = field809[var13.field2920];
                if (var14 != null) {
                    int var15 = (var13.field2906 * 4 - var14.field3194) / 2;
                    int var16 = (var13.field2939 * 4 - var14.field3199) / 2;
                    var14.method3775(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2939) * 4 + 48 + var16);
                }
            }
        }
        int var17 = field2137.method1615(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = field2137.method1620(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class198 var22 = class198.method2463(var21);
            if (var22.field2920 != -1) {
                class223 var23 = field809[var22.field2920];
                if (var23 != null) {
                    int var24 = (var22.field2906 * 4 - var23.field3194) / 2;
                    int var25 = (var22.field2939 * 4 - var23.field3199) / 2;
                    var23.method3775(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2939) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = field2119.field3211;
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
        int var29 = field2137.method1727(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class198 var31 = class198.method2463(var30);
        if (var31.field2920 == -1) {
            return;
        }
        class223 var32 = field809[var31.field2920];
        if (var32 != null) {
            int var33 = (var31.field2906 * 4 - var32.field3194) / 2;
            int var34 = (var31.field2939 * 4 - var32.field3199) / 2;
            var32.method3775(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2939) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("am.ca(I)V")
    public static final void method561() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < client.field427 - 1; var1++) {
                if (client.field430[var1] < 1000 && client.field430[var1 + 1] > 1000) {
                    String var2 = client.field433[var1];
                    client.field433[var1] = client.field433[var1 + 1];
                    client.field433[var1 + 1] = var2;
                    String var3 = client.field446[var1];
                    client.field446[var1] = client.field446[var1 + 1];
                    client.field446[var1 + 1] = var3;
                    int var4 = client.field430[var1];
                    client.field430[var1] = client.field430[var1 + 1];
                    client.field430[var1 + 1] = var4;
                    int var5 = client.field428[var1];
                    client.field428[var1] = client.field428[var1 + 1];
                    client.field428[var1 + 1] = var5;
                    int var6 = client.field343[var1];
                    client.field343[var1] = client.field343[var1 + 1];
                    client.field343[var1 + 1] = var6;
                    int var7 = client.field423[var1];
                    client.field423[var1] = client.field423[var1 + 1];
                    client.field423[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ba.du(II)V")
    public static final void method1099(int arg0) {
        if (class170.method26(arg0)) {
            client.method235(field2257[arg0], -1);
        }
    }
}
