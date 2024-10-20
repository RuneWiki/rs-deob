package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Insets;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.lang.management.GarbageCollectorMXBean;

public class Statics {

    @ObfuscatedName("bd.v")
    public static float[] field1000;

    @ObfuscatedName("bd.l")
    public static float[] field1002;

    @ObfuscatedName("bd.y")
    public static float[] field1005;

    @ObfuscatedName("bd.m")
    public static class57[] field1008;

    @ObfuscatedName("bd.p")
    public static boolean[] field1010;

    @ObfuscatedName("bd.az")
    public static float[] field1012;

    @ObfuscatedName("bd.ai")
    public static float[] field1013;

    @ObfuscatedName("bd.ad")
    public static float[] field1014;

    @ObfuscatedName("bd.aa")
    public static int[] field1015;

    @ObfuscatedName("bd.ao")
    public static int[] field1016;

    @ObfuscatedName("bd.w")
    public static class70[] field1019;

    @ObfuscatedName("bm.n")
    public static boolean[] field1028;

    @ObfuscatedName("bm.r")
    public static int[] field1032;

    @ObfuscatedName("bm.x")
    public static int[] field1034;

    @ObfuscatedName("bb.mg")
    public static class25[] field1037;

    @ObfuscatedName("bb.h")
    public static class64 field1039;

    @ObfuscatedName("bb.c")
    public static boolean field1053;

    @ObfuscatedName("bb.s")
    public static int field1058;

    @ObfuscatedName("bb.qa")
    public static class221 field1059;

    @ObfuscatedName("bh.g")
    public static class183 field1087;

    @ObfuscatedName("r.aj")
    public static int field109;

    @ObfuscatedName("bj.ml")
    public static class225 field1095;

    @ObfuscatedName("r.md")
    public static byte field110;

    @ObfuscatedName("ba.o")
    public static int field1108;

    @ObfuscatedName("r.as")
    public static boolean field111;

    @ObfuscatedName("n.ff")
    public static int field113;

    @ObfuscatedName("bc.u")
    public static float field1135;

    @ObfuscatedName("bc.b")
    public static int field1138;

    @ObfuscatedName("n.r")
    public static int[] field117;

    @ObfuscatedName("be.ep")
    public static class225 field1181;

    @ObfuscatedName("be.qm")
    public static int field1188;

    @ObfuscatedName("bf.dy")
    public static byte[][] field1195;

    @ObfuscatedName("c.fx")
    public static int field12;

    @ObfuscatedName("bn.p")
    public static String[] field1211;

    @ObfuscatedName("bn.ic")
    public static int field1217;

    @ObfuscatedName("m.hi")
    public static class24 field129;

    @ObfuscatedName("cy.k")
    public static int field1299;

    @ObfuscatedName("cy.dj")
    public static int field1302;

    @ObfuscatedName("m.if")
    public static class170 field131;

    @ObfuscatedName("cg.w")
    public static int[] field1313;

    @ObfuscatedName("m.px")
    public static long field134;

    @ObfuscatedName("m.fj")
    public static int field135;

    @ObfuscatedName("cz.bt")
    public static int field1409;

    @ObfuscatedName("cz.bw")
    public static int field1410;

    @ObfuscatedName("cz.bd")
    public static int field1411;

    @ObfuscatedName("ca.bt")
    public static class223[] field1427;

    @ObfuscatedName("ch.m")
    public static int field1431;

    @ObfuscatedName("ch.r")
    public static int field1432;

    @ObfuscatedName("ch.d")
    public static class94 field1439;

    @ObfuscatedName("ch.p")
    public static int field1440;

    @ObfuscatedName("ch.w")
    public static int field1442;

    @ObfuscatedName("ch.j")
    public static int field1443;

    @ObfuscatedName("ch.o")
    public static int field1446;

    @ObfuscatedName("ch.i")
    public static int field1447;

    @ObfuscatedName("ch.n")
    public static int field1450;

    @ObfuscatedName("ct.ay")
    public static class103 field1458;

    @ObfuscatedName("ct.ab")
    public static class223[] field1463;

    @ObfuscatedName("ct.d")
    public static int[] field1465;

    @ObfuscatedName("cn.ai")
    public static int[] field1471;

    @ObfuscatedName("cn.m")
    public static class61 field1473;

    @ObfuscatedName("cn.jq")
    public static int field1474;

    @ObfuscatedName("cs.bb")
    public static int field1480;

    @ObfuscatedName("cs.q")
    public static int field1483;

    @ObfuscatedName("cs.l")
    public static int field1488;

    @ObfuscatedName("cs.o")
    public static int field1494;

    @ObfuscatedName("cs.i")
    public static int field1495;

    @ObfuscatedName("cs.e")
    public static int field1497;

    @ObfuscatedName("cs.d")
    public static int field1498;

    @ObfuscatedName("cs.t")
    public static int field1499;

    @ObfuscatedName("cs.y")
    public static int field1501;

    @ObfuscatedName("cs.az")
    public static int field1502;

    @ObfuscatedName("cs.v")
    public static int field1503;

    @ObfuscatedName("cs.ai")
    public static int field1505;

    @ObfuscatedName("cs.ad")
    public static int field1506;

    @ObfuscatedName("cs.bp")
    public static int field1510;

    @ObfuscatedName("cs.aa")
    public static int field1524;

    @ObfuscatedName("cs.bo")
    public static int field1527;

    @ObfuscatedName("cs.z")
    public static int field1531;

    @ObfuscatedName("cs.bs")
    public static boolean[][] field1533;

    @ObfuscatedName("cs.bm")
    public static int field1534;

    @ObfuscatedName("cs.bl")
    public static int field1536;

    @ObfuscatedName("cs.bh")
    public static int field1538;

    @ObfuscatedName("cv.pq")
    public static Clipboard field1542;

    @ObfuscatedName("cm.nv")
    public static int field1545;

    @ObfuscatedName("j.fr")
    public static int field156;

    @ObfuscatedName("cq.j")
    public static class73[] field1561;

    @ObfuscatedName("cp.a")
    public static class183 field1571;

    @ObfuscatedName("cl.jo")
    public static class170[] field1582;

    @ObfuscatedName("cl.bj")
    public static class185 field1594;

    @ObfuscatedName("c.b")
    public static class229 field16;

    @ObfuscatedName("ce.pf")
    public static class231 field1605;

    @ObfuscatedName("cd.nx")
    public static class58 field1627;

    @ObfuscatedName("cu.e")
    public static int[] field1631;

    @ObfuscatedName("cu.bm")
    public static class185 field1640;

    @ObfuscatedName("w.qn")
    public static Font field165;

    @ObfuscatedName("ck.s")
    public static Applet field1653;

    @ObfuscatedName("ck.f")
    public static int field1654;

    @ObfuscatedName("ck.qv")
    public static class110 field1655;

    @ObfuscatedName("ck.c")
    public static String field1658;

    @ObfuscatedName("ck.eg")
    public static class225[] field1659;

    @ObfuscatedName("ci.c")
    public static String field1670;

    @ObfuscatedName("ci.s")
    public static String field1671;

    @ObfuscatedName("ci.i")
    public static int field1679;

    @ObfuscatedName("p.pm")
    public static class2 field168;

    @ObfuscatedName("ci.db")
    public static int field1680;

    @ObfuscatedName("da.h")
    public static File field1686;

    @ObfuscatedName("da.o")
    public static String[] field1691;

    @ObfuscatedName("da.t")
    public static String field1693;

    @ObfuscatedName("da.eq")
    public static class225 field1695;

    @ObfuscatedName("c.bd")
    public static class185 field17;

    @ObfuscatedName("db.fk")
    public static int field1705;

    @ObfuscatedName("dz.g")
    public static int field1729;

    @ObfuscatedName("p.e")
    public static class154 field173;

    @ObfuscatedName("dz.c")
    public static File field1730;

    @ObfuscatedName("dz.ix")
    public static int field1735;

    @ObfuscatedName("dh.bp")
    public static class185 field1737;

    @ObfuscatedName("dp.k")
    public static int[] field1743;

    @ObfuscatedName("dm.ps")
    public static class117 field1756;

    @ObfuscatedName("p.cv")
    public static int field176;

    @ObfuscatedName("df.du")
    public static int[] field1760;

    @ObfuscatedName("dn.a")
    public static File field1767;

    @ObfuscatedName("dn.dr")
    public static int[] field1770;

    @ObfuscatedName("de.bf")
    public static FontMetrics field1788;

    @ObfuscatedName("p.qu")
    public static int field181;

    @ObfuscatedName("du.d")
    public static String field1813;

    @ObfuscatedName("dw.u")
    public static short[][] field1817;

    @ObfuscatedName("o.n")
    public static class170 field182;

    @ObfuscatedName("dw.es")
    public static class225[] field1822;

    @ObfuscatedName("dy.a")
    public static int field1846;

    @ObfuscatedName("dy.g")
    public static int field1848;

    @ObfuscatedName("dy.c")
    public static class183 field1849;

    @ObfuscatedName("o.x")
    public static int[] field185;

    @ObfuscatedName("dy.gy")
    public static int field1853;

    @ObfuscatedName("dy.qo")
    public static Frame field1856;

    @ObfuscatedName("dv.g")
    public static int[] field1866;

    @ObfuscatedName("o.qw")
    public static int field187;

    @ObfuscatedName("o.ck")
    public static class209 field188;

    @ObfuscatedName("ev.cr")
    public static class209 field1910;

    @ObfuscatedName("ev.dg")
    public static byte[][] field1919;

    @ObfuscatedName("ev.ec")
    public static class223[] field1921;

    @ObfuscatedName("ep.b")
    public static int field1922;

    @ObfuscatedName("ep.f")
    public static class183 field1923;

    @ObfuscatedName("ep.h")
    public static class140 field1924;

    @ObfuscatedName("ep.dq")
    public static int field1925;

    @ObfuscatedName("ep.j")
    public static class182 field1926;

    @ObfuscatedName("ep.x")
    public static int field1927;

    @ObfuscatedName("ep.r")
    public static boolean field1928;

    @ObfuscatedName("ep.n")
    public static class145 field1929;

    @ObfuscatedName("ep.s")
    public static class183 field1932;

    @ObfuscatedName("eq.pz")
    public static GarbageCollectorMXBean field1949;

    @ObfuscatedName("s.f")
    public static int[] field2;

    @ObfuscatedName("i.dz")
    public static int field201;

    @ObfuscatedName("eo.de")
    public static int[] field2014;

    @ObfuscatedName("i.bo")
    public static class185 field202;

    @ObfuscatedName("ej.z")
    public static int[] field2032;

    @ObfuscatedName("ec.mm")
    public static byte field2047;

    @ObfuscatedName("ee.eo")
    public static class225[] field2054;

    @ObfuscatedName("ey.el")
    public static class223[] field2081;

    @ObfuscatedName("em.p")
    public static String field2117;

    @ObfuscatedName("em.qf")
    public static int field2119;

    @ObfuscatedName("em.s")
    public static long field2124;

    @ObfuscatedName("ff.c")
    public static boolean[] field2129;

    @ObfuscatedName("ff.b")
    public static class223[] field2130;

    @ObfuscatedName("ff.s")
    public static class183 field2131;

    @ObfuscatedName("ff.et")
    public static class225[] field2132;

    @ObfuscatedName("fo.w")
    public static int[][][] field2153;

    @ObfuscatedName("fl.mh")
    public static int field2157;

    @ObfuscatedName("fl.u")
    public static byte[][][] field2158;

    @ObfuscatedName("fn.bs")
    public static class185 field2171;

    @ObfuscatedName("fn.nb")
    public static int field2172;

    @ObfuscatedName("fz.b")
    public static short[] field2184;

    @ObfuscatedName("fb.qe")
    public static Image field2195;

    @ObfuscatedName("fq.qk")
    public static int field2197;

    @ObfuscatedName("fq.pd")
    public static int field2198;

    @ObfuscatedName("fx.h")
    public static class183 field2203;

    @ObfuscatedName("e.ag")
    public static class225[] field223;

    @ObfuscatedName("fx.f")
    public static class183 field2241;

    @ObfuscatedName("e.h")
    public static class183 field225;

    @ObfuscatedName("d.g")
    public static byte[][][] field229;

    @ObfuscatedName("d.fm")
    public static int field230;

    @ObfuscatedName("fx.s")
    public static class170[][] field2334;

    @ObfuscatedName("ft.gm")
    public static class170 field2346;

    @ObfuscatedName("ft.c")
    public static int field2347;

    @ObfuscatedName("ft.w")
    public static int field2348;

    @ObfuscatedName("d.cx")
    public static class209 field235;

    @ObfuscatedName("ft.j")
    public static int[] field2350;

    @ObfuscatedName("d.p")
    public static class154 field237;

    @ObfuscatedName("q.pu")
    public static short[] field250;

    @ObfuscatedName("q.ej")
    public static class225[] field251;

    @ObfuscatedName("q.pt")
    public static class104 field253;

    @ObfuscatedName("q.da")
    public static int field254;

    @ObfuscatedName("q.ac")
    public static class103 field255;

    @ObfuscatedName("y.nh")
    public static class66 field268;

    @ObfuscatedName("fg.bg")
    public static String field2688;

    @ObfuscatedName("fs.gj")
    public static class170 field2695;

    @ObfuscatedName("fa.nc")
    public static int field2706;

    @ObfuscatedName("fh.h")
    public static int[] field2711;

    @ObfuscatedName("gl.u")
    public static class180 field2730;

    @ObfuscatedName("gl.nf")
    public static int field2736;

    @ObfuscatedName("go.kw")
    public static class113 field2747;

    @ObfuscatedName("gh.f")
    public static long field2750;

    @ObfuscatedName("gh.c")
    public static class111 field2756;

    @ObfuscatedName("gc.bd")
    public static class223 field2772;

    @ObfuscatedName("gc.bn")
    public static int field2774;

    @ObfuscatedName("gc.s")
    public static class183 field2775;

    @ObfuscatedName("gi.s")
    public static class183 field2778;

    @ObfuscatedName("gi.a")
    public static class183 field2780;

    @ObfuscatedName("gk.s")
    public static class183 field2787;

    @ObfuscatedName("gn.ns")
    public static int field2794;

    @ObfuscatedName("gb.s")
    public static class183 field2805;

    @ObfuscatedName("gb.c")
    public static class183 field2806;

    @ObfuscatedName("gm.s")
    public static class183 field2815;

    @ObfuscatedName("gd.f")
    public static int field2824;

    @ObfuscatedName("gd.s")
    public static class183 field2825;

    @ObfuscatedName("gf.be")
    public static int field2844;

    @ObfuscatedName("gq.s")
    public static class183 field2858;

    @ObfuscatedName("gj.s")
    public static class183 field2864;

    @ObfuscatedName("gj.e")
    public static String field2870;

    @ObfuscatedName("gz.f")
    public static class183 field2873;

    @ObfuscatedName("gz.c")
    public static class183 field2874;

    @ObfuscatedName("gz.s")
    public static class183 field2881;

    @ObfuscatedName("l.bt")
    public static class185 field289;

    @ObfuscatedName("gg.c")
    public static class183 field2919;

    @ObfuscatedName("l.ek")
    public static class223[] field292;

    @ObfuscatedName("gs.r")
    public static class209 field2958;

    @ObfuscatedName("gs.k")
    public static int field2963;

    @ObfuscatedName("client.g")
    public static class179 field297;

    @ObfuscatedName("gs.g")
    public static boolean field2989;

    @ObfuscatedName("gs.cn")
    public static class111 field3004;

    @ObfuscatedName("ga.c")
    public static class183 field3006;

    @ObfuscatedName("ga.s")
    public static class183 field3013;

    @ObfuscatedName("gx.f")
    public static class183 field3059;

    @ObfuscatedName("gx.s")
    public static class183 field3062;

    @ObfuscatedName("gx.c")
    public static class183 field3067;

    @ObfuscatedName("gu.az")
    public static int[] field3077;

    @ObfuscatedName("gy.f")
    public static class183 field3088;

    @ObfuscatedName("gt.u")
    public static int field3098;

    @ObfuscatedName("ho.x")
    public static class223[] field3121;

    @ObfuscatedName("hv.s")
    public static class146 field3122;

    @ObfuscatedName("hp.iu")
    public static class170 field3164;

    @ObfuscatedName("hd.v")
    public static int[] field3175;

    @ObfuscatedName("hd.az")
    public static int field3176;

    @ObfuscatedName("hd.ai")
    public static int field3177;

    @ObfuscatedName("ht.v")
    public static int[] field3194;

    @ObfuscatedName("f.iv")
    public static class39 field32;

    @ObfuscatedName("hj.u")
    public static int[] field3218;

    @ObfuscatedName("hj.c")
    public static int field3219;

    @ObfuscatedName("hj.f")
    public static int field3220;

    @ObfuscatedName("hj.a")
    public static int[] field3221;

    @ObfuscatedName("hj.s")
    public static int field3222;

    @ObfuscatedName("he.c")
    public static client field3231;

    @ObfuscatedName("client.bl")
    public static class185 field325;

    @ObfuscatedName("client.bh")
    public static class185 field326;

    @ObfuscatedName("hy.f")
    public static int field3282;

    @ObfuscatedName("s.no")
    public static int field4;

    @ObfuscatedName("h.in")
    public static int field44;

    @ObfuscatedName("client.ha")
    public static int field484;

    @ObfuscatedName("client.ku")
    public static class47 field490;

    @ObfuscatedName("s.dv")
    public static class88 field5;

    @ObfuscatedName("g.hq")
    public static int field54;

    @ObfuscatedName("g.j")
    public static String field55;

    @ObfuscatedName("client.c")
    public static class183 field576;

    @ObfuscatedName("v.qc")
    public static Canvas field578;

    @ObfuscatedName("g.nw")
    public static int field58;

    @ObfuscatedName("v.do")
    public static int field588;

    @ObfuscatedName("v.qr")
    public static int field591;

    @ObfuscatedName("az.er")
    public static class225[] field594;

    @ObfuscatedName("s.c")
    public static class183 field6;

    @ObfuscatedName("g.nr")
    public static int field60;

    @ObfuscatedName("az.bk")
    public static int field603;

    @ObfuscatedName("g.bw")
    public static class185 field61;

    @ObfuscatedName("k.c")
    public static long field65;

    @ObfuscatedName("aa.x")
    public static class27 field675;

    @ObfuscatedName("aa.a")
    public static class30[] field677;

    @ObfuscatedName("aa.l")
    public static int[] field680;

    @ObfuscatedName("k.bx")
    public static class185 field69;

    @ObfuscatedName("ao.ct")
    public static class111 field699;

    @ObfuscatedName("s.br")
    public static int field7;

    @ObfuscatedName("k.ng")
    public static int field70;

    @ObfuscatedName("k.he")
    public static int field71;

    @ObfuscatedName("ae.h")
    public static String[] field725;

    @ObfuscatedName("ae.r")
    public static class170 field728;

    @ObfuscatedName("k.ji")
    public static int field73;

    @ObfuscatedName("ae.lg")
    public static class217 field732;

    @ObfuscatedName("ae.s")
    public static class183 field738;

    @ObfuscatedName("k.s")
    public static class183 field74;

    @ObfuscatedName("an.ch")
    public static class103 field757;

    @ObfuscatedName("an.nn")
    public static class52 field759;

    @ObfuscatedName("aw.ip")
    public static int field761;

    @ObfuscatedName("ah.l")
    public static int[] field772;

    @ObfuscatedName("ah.at")
    public static class111 field774;

    @ObfuscatedName("ar.ag")
    public static class185 field781;

    @ObfuscatedName("ar.n")
    public static int[] field785;

    @ObfuscatedName("ay.gq")
    public static class170 field787;

    @ObfuscatedName("ay.x")
    public static short[][] field794;

    @ObfuscatedName("ay.pl")
    public static class31 field795;

    @ObfuscatedName("as.k")
    public static class225 field799;

    @ObfuscatedName("s.fq")
    public static int field8;

    @ObfuscatedName("as.ii")
    public static int field801;

    @ObfuscatedName("as.q")
    public static class21 field803;

    @ObfuscatedName("aq.bb")
    public static class185 field808;

    @ObfuscatedName("af.a")
    public static class223[] field812;

    @ObfuscatedName("af.s")
    public static boolean field813;

    @ObfuscatedName("af.g")
    public static class225 field816;

    @ObfuscatedName("af.u")
    public static class223 field817;

    @ObfuscatedName("af.x")
    public static class223 field818;

    @ObfuscatedName("af.r")
    public static class223 field819;

    @ObfuscatedName("af.f")
    public static class223 field820;

    @ObfuscatedName("af.t")
    public static int[] field822;

    @ObfuscatedName("af.ap")
    public static String field826;

    @ObfuscatedName("af.h")
    public static class223 field841;

    @ObfuscatedName("af.bw")
    public static class223[] field846;

    @ObfuscatedName("af.eb")
    public static class225[] field849;

    @ObfuscatedName("b.m")
    public static boolean field86;

    @ObfuscatedName("b.au")
    public static class185 field87;

    @ObfuscatedName("aj.rm")
    public static String field878;

    @ObfuscatedName("ap.cs")
    public static char field881;

    @ObfuscatedName("ac.qs")
    public static int field887;

    @ObfuscatedName("ac.b")
    public static byte[][] field889;

    @ObfuscatedName("at.pv")
    public static int field896;

    @ObfuscatedName("s.jj")
    public static int field9;

    @ObfuscatedName("av.qy")
    public static int field908;

    @ObfuscatedName("av.hs")
    public static int field916;

    @ObfuscatedName("av.pg")
    public static int field919;

    @ObfuscatedName("av.ab")
    public static class185 field920;

    @ObfuscatedName("am.bq")
    public static class185 field925;

    @ObfuscatedName("am.nk")
    public static class58 field930;

    @ObfuscatedName("r.b")
    public static int[][] field94;

    @ObfuscatedName("ak.ak")
    public static long field942;

    @ObfuscatedName("ak.nu")
    public static int field943;

    @ObfuscatedName("r.a")
    public static byte[][][] field95;

    @ObfuscatedName("au.dw")
    public static int[][] field956;

    @ObfuscatedName("au.rb")
    public static boolean field957;

    @ObfuscatedName("r.k")
    public static byte[][][] field96;

    @ObfuscatedName("ag.k")
    public static short[] field964;

    @ObfuscatedName("ag.h")
    public static byte[][][] field966;

    @ObfuscatedName("ag.g")
    public static class183 field968;

    @ObfuscatedName("r.m")
    public static int[] field98;

    @ObfuscatedName("bd.k")
    public static byte[] field986;

    @ObfuscatedName("bd.x")
    public static int field990;

    @ObfuscatedName("bd.q")
    public static float[] field992;

    @ObfuscatedName("bd.u")
    public static int field993;

    @ObfuscatedName("bd.o")
    public static int[] field994;

    @ObfuscatedName("bd.b")
    public static int field995;

    @ObfuscatedName("bd.r")
    public static int field996;

    @ObfuscatedName("bd.n")
    public static class53[] field997;

    @ObfuscatedName("bd.j")
    public static class65[] field999;

    @ObfuscatedName("f.s(S)J")
    public static synchronized long method28() {
        long var0 = System.currentTimeMillis();
        if (var0 < field2124) {
            field65 += field2124 - var0;
        }
        field2124 = var0;
        return field65 + var0;
    }

    @ObfuscatedName("dm.c(II)Lgq;")
    public static class195 method1913(int arg0) {
        class195 var1 = (class195) class195.field2853.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2858.method2986(14, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3236(new class154(var2));
        }
        class195.field2853.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("cl.s(II)Lgv;")
    public static class201 method1765(int arg0) {
        class201 var1 = (class201) class201.field3047.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field738.method2986(4, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3393(new class154(var2), arg0);
        }
        var3.method3395();
        class201.field3047.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gu.c(J)Ljava/lang/String;")
    public static String method3451(long arg0) {
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var2 = 0;
            for (long var3 = arg0; var3 != 0L; var3 /= 37L) {
                var2++;
            }
            StringBuilder var5 = new StringBuilder(var2);
            while (arg0 != 0L) {
                long var6 = arg0;
                arg0 /= 37L;
                var5.append(class206.field3087[(int) (var6 - arg0 * 37L)]);
            }
            return var5.reverse().toString();
        }
    }

    @ObfuscatedName("ey.s(Lgp;Lgp;I)V")
    public static void method2528(class183 arg0, class183 arg1) {
        field2825 = arg0;
        field576 = arg1;
        field2824 = field2825.method2996(3);
    }

    @ObfuscatedName("gx.s(I)[Lhn;")
    public static class215[] method3409() {
        return new class215[] { class215.field3159, class215.field3154, class215.field3156, class215.field3158, class215.field3151, class215.field3149, class215.field3155, class215.field3161, class215.field3157, class215.field3152, class215.field3148, class215.field3147, class215.field3150, class215.field3162, class215.field3160 };
    }

    @ObfuscatedName("em.b(I)V")
    public static void method2750() {
        while (true) {
            class129 var0 = class184.field2734;
            class181 var1;
            synchronized (class184.field2734) {
                var1 = (class181) class184.field2731.method2189();
            }
            if (var1 == null) {
                return;
            }
            var1.field2704.method3077(var1.field2703, (int) var1.field1889, var1.field2702, false);
        }
    }

    @ObfuscatedName("ea.c(II)Lga;")
    public static class200 method2743(int arg0) {
        class200 var1 = (class200) class200.field3007.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3013.method2986(9, arg0);
        class200 var3 = new class200();
        var3.field3009 = arg0;
        if (var2 != null) {
            var3.method3385(new class154(var2));
        }
        var3.method3367();
        class200.field3007.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("u.f(IIIII)V")
    public static void method85(int arg0, int arg1, int arg2, int arg3) {
        for (class32 var4 = (class32) class32.field704.method2187(); var4 != null; var4 = (class32) class32.field704.method2203()) {
            if (var4.field708 != -1 || var4.field710 != null) {
                int var5 = 0;
                if (arg1 > var4.field707) {
                    var5 += arg1 - var4.field707;
                } else if (arg1 < var4.field706) {
                    var5 += var4.field706 - arg1;
                }
                if (arg2 > var4.field709) {
                    var5 += arg2 - var4.field709;
                } else if (arg2 < var4.field716) {
                    var5 += var4.field716 - arg2;
                }
                if (var5 - 64 > var4.field711 || client.field552 == 0 || var4.field705 != arg0) {
                    if (var4.field712 != null) {
                        field759.method849(var4.field712);
                        var4.field712 = null;
                    }
                    if (var4.field717 != null) {
                        field759.method849(var4.field717);
                        var4.field717 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field552 * (var4.field711 - var5) / var4.field711;
                    if (var4.field712 != null) {
                        var4.field712.method1092(var6);
                    } else if (var4.field708 >= 0) {
                        class54 var7 = class54.method901(field61, var4.field708, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method898().method943(field268);
                            class67 var9 = class67.method1088(var8, 100, var6);
                            var9.method1121(-1);
                            field759.method848(var9);
                            var4.field712 = var9;
                        }
                    }
                    if (var4.field717 != null) {
                        var4.field717.method1092(var6);
                        if (!var4.field717.method2175()) {
                            var4.field717 = null;
                        }
                    } else if (var4.field710 != null && (var4.field715 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field710.length);
                        class54 var11 = class54.method901(field61, var4.field710[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method898().method943(field268);
                            class67 var13 = class67.method1088(var12, 100, var6);
                            var13.method1121(0);
                            field759.method848(var13);
                            var4.field717 = var13;
                            var4.field715 = var4.field713 + (int) (Math.random() * (double) (var4.field714 - var4.field713));
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.f([Laa;II[I[II)V")
    public static void method816(class30[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class30 var8 = arg0[var7];
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
                        var11 = arg0[var6].field689;
                        var12 = var8.field689;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field685;
                        var12 = var8.field685;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method619() ? 1 : 0;
                        var12 = var8.method619() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field682;
                        var12 = var8.field682;
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
                        var15 = arg0[var5].field689;
                        var16 = var8.field689;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field685;
                        var16 = var8.field685;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method619() ? 1 : 0;
                        var16 = var8.method619() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field682;
                        var16 = var8.field682;
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
                class30 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method816(arg0, arg1, var6, arg3, arg4);
        method816(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("g.g(Lde;B)V")
    public static void method68(class114 arg0) {
        if (class42.field845) {
            class42.method1025(arg0);
            return;
        }
        if ((class116.field1808 == 1 || !field111 && class116.field1808 == 4) && class116.field1810 >= class42.field815 + 765 - 50 && class116.field1797 >= 453) {
            field795.field703 = !field795.field703;
            class31.method2869();
            if (field795.field703) {
                class139.method3616();
            } else {
                class185 var1 = field2171;
                int var2 = var1.method3001("scape main");
                int var3 = var1.method3002(var2, "");
                class139.method1751(var1, var2, var3, 255, false);
            }
        }
        if (client.field302 == 5) {
            return;
        }
        class42.field827++;
        if (client.field302 != 10 && client.field302 != 11) {
            return;
        }
        if (client.field301 == 0) {
            if (class116.field1808 == 1 || !field111 && class116.field1808 == 4) {
                int var4 = class42.field815 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class116.field1810 >= var4 && class116.field1810 <= var4 + var6 && class116.field1797 >= var5 && class116.field1797 <= var5 + var7) {
                    if (class30.method128()) {
                        class42.field845 = true;
                    }
                    return;
                }
            }
            if (field675 != null && class30.method128()) {
                class42.field845 = true;
            }
        }
        int var8 = class116.field1808;
        int var9 = class116.field1810;
        int var10 = class116.field1797;
        if (!field111 && var8 == 4) {
            var8 = 1;
        }
        if (class42.field831 == 0) {
            int var11 = class42.field840 + 180 - 80;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                class115.method833(client.method2483("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var13 = class42.field840 + 180 + 80;
            if (var8 == 1 && var9 >= var13 - 75 && var9 <= var13 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field376 & 0x2000000) != 0) {
                    class42.field832 = "";
                    class42.field833 = class174.field2589;
                    class42.field837 = class174.field2590;
                    class42.field835 = class174.field2591;
                    class42.field831 = 1;
                    class42.field834 = 0;
                } else if ((client.field376 & 0x4) != 0) {
                    if ((client.field376 & 0x400) == 0) {
                        class42.field833 = class174.field2580;
                        class42.field837 = class174.field2581;
                        class42.field835 = class174.field2582;
                    } else {
                        class42.field833 = class174.field2586;
                        class42.field837 = class174.field2587;
                        class42.field835 = class174.field2588;
                    }
                    class42.field832 = class174.field2380;
                    class42.field831 = 1;
                    class42.field834 = 0;
                } else if ((client.field376 & 0x400) == 0) {
                    class42.field833 = class174.field2557;
                    class42.field837 = class174.field2485;
                    class42.field835 = class174.field2640;
                    class42.field831 = 2;
                    class42.field834 = 0;
                } else {
                    class42.field833 = class174.field2562;
                    class42.field837 = class174.field2367;
                    class42.field835 = class174.field2585;
                    class42.field832 = class174.field2380;
                    class42.field831 = 1;
                    class42.field834 = 0;
                }
            }
        } else if (class42.field831 == 1) {
            while (class106.method1768()) {
                if (field176 == 84) {
                    class42.field833 = class174.field2557;
                    class42.field837 = class174.field2485;
                    class42.field835 = class174.field2640;
                    class42.field831 = 2;
                    class42.field834 = 0;
                } else if (field176 == 13) {
                    class42.field831 = 0;
                }
            }
            int var14 = class42.field840 + 180 - 80;
            short var15 = 321;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                class42.field833 = class174.field2557;
                class42.field837 = class174.field2485;
                class42.field835 = class174.field2640;
                class42.field831 = 2;
                class42.field834 = 0;
            }
            int var16 = class42.field840 + 180 + 80;
            if (var8 == 1 && var9 >= var16 - 75 && var9 <= var16 + 75 && var10 >= var15 - 20 && var10 <= var15 + 20) {
                class42.field831 = 0;
            }
        } else if (class42.field831 == 2) {
            short var17 = 231;
            int var39 = var17 + 30;
            if (var8 == 1 && var10 >= var39 - 15 && var10 < var39) {
                class42.field834 = 0;
            }
            var39 += 15;
            if (var8 == 1 && var10 >= var39 - 15 && var10 < var39) {
                class42.field834 = 1;
            }
            var39 += 15;
            short var18 = 361;
            if (var8 == 1 && var10 >= var18 - 15 && var10 < var18) {
                class42.method9(class174.field2539, class174.field2616, class174.field2617);
                class42.field831 = 5;
                return;
            }
            int var19 = class42.field840 + 180 - 80;
            short var20 = 321;
            if (var8 == 1 && var9 >= var19 - 75 && var9 <= var19 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                class42.field836 = class42.field836.trim();
                if (class42.field836.length() == 0) {
                    class42.method9(class174.field2410, class174.field2483, class174.field2484);
                    return;
                }
                if (class42.field811.length() == 0) {
                    class42.method9(class174.field2384, class174.field2584, class174.field2487);
                    return;
                }
                class42.method9(class174.field2594, class174.field2631, class174.field2596);
                class42.field848 = field795.field698.containsKey(class208.method2980(class42.field836)) ? class98.field1638 : class98.field1637;
                client.method1803(20);
                return;
            }
            int var21 = class42.field840 + 180 + 80;
            if (var8 == 1 && var9 >= var21 - 75 && var9 <= var21 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                class42.field831 = 0;
                class42.field836 = "";
                class42.field811 = "";
                field109 = 0;
                field826 = "";
                class42.field838 = true;
            }
            while (true) {
                while (class106.method1768()) {
                    boolean var22 = false;
                    for (int var23 = 0; var23 < class42.field842.length(); var23++) {
                        if (field881 == class42.field842.charAt(var23)) {
                            var22 = true;
                            break;
                        }
                    }
                    if (field176 == 13) {
                        class42.field831 = 0;
                        class42.field836 = "";
                        class42.field811 = "";
                        field109 = 0;
                        field826 = "";
                        class42.field838 = true;
                    } else if (class42.field834 == 0) {
                        if (field176 == 85 && class42.field836.length() > 0) {
                            class42.field836 = class42.field836.substring(0, class42.field836.length() - 1);
                        }
                        if (field176 == 84 || field176 == 80) {
                            class42.field834 = 1;
                        }
                        if (var22 && class42.field836.length() < 320) {
                            class42.field836 = class42.field836 + field881;
                        }
                    } else if (class42.field834 == 1) {
                        if (field176 == 85 && class42.field811.length() > 0) {
                            class42.field811 = class42.field811.substring(0, class42.field811.length() - 1);
                        }
                        if (field176 == 84 || field176 == 80) {
                            class42.field834 = 0;
                        }
                        if (field176 == 84) {
                            class42.field836 = class42.field836.trim();
                            if (class42.field836.length() == 0) {
                                class42.method9(class174.field2410, class174.field2483, class174.field2484);
                                return;
                            }
                            if (class42.field811.length() == 0) {
                                class42.method9(class174.field2384, class174.field2584, class174.field2487);
                                return;
                            }
                            class42.method9(class174.field2594, class174.field2631, class174.field2596);
                            class42.field848 = field795.field698.containsKey(class208.method2980(class42.field836)) ? class98.field1638 : class98.field1637;
                            client.method1803(20);
                            return;
                        }
                        if (var22 && class42.field811.length() < 20) {
                            class42.field811 = class42.field811 + field881;
                        }
                    }
                }
                return;
            }
        } else if (class42.field831 == 3) {
            int var24 = class42.field840 + 180;
            short var25 = 276;
            if (var8 == 1 && var9 >= var24 - 75 && var9 <= var24 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                class42.field833 = class174.field2557;
                class42.field837 = class174.field2485;
                class42.field835 = class174.field2640;
                class42.field831 = 2;
                class42.field834 = 0;
            }
            int var26 = class42.field840 + 180;
            short var27 = 326;
            if (var8 == 1 && var9 >= var26 - 75 && var9 <= var26 + 75 && var10 >= var27 - 20 && var10 <= var27 + 20) {
                class42.method9(class174.field2539, class174.field2616, class174.field2617);
                class42.field831 = 5;
                return;
            }
        } else if (class42.field831 == 4) {
            int var28 = class42.field840 + 180 - 80;
            short var29 = 321;
            if (var8 == 1 && var9 >= var28 - 75 && var9 <= var28 + 75 && var10 >= var29 - 20 && var10 <= var29 + 20) {
                field826.trim();
                if (field826.length() != 6) {
                    class42.method9(class174.field2429, class174.field2402, class174.field2403);
                    return;
                }
                field109 = Integer.parseInt(field826);
                field826 = "";
                class42.field848 = class42.field838 ? class98.field1630 : class98.field1633;
                class42.method9(class174.field2594, class174.field2631, class174.field2596);
                client.method1803(20);
                return;
            }
            if (var8 == 1 && var9 >= class42.field840 + 180 - 9 && var9 <= class42.field840 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                class42.field838 = !class42.field838;
            }
            if (var8 == 1 && var9 >= class42.field840 + 180 - 34 && var9 <= class42.field840 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                class115.method833(client.method2483("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var30 = class42.field840 + 180 + 80;
            if (var8 == 1 && var9 >= var30 - 75 && var9 <= var30 + 75 && var10 >= var29 - 20 && var10 <= var29 + 20) {
                class42.field831 = 0;
                class42.field836 = "";
                class42.field811 = "";
                field109 = 0;
                field826 = "";
            }
            while (class106.method1768()) {
                boolean var31 = false;
                for (int var32 = 0; var32 < class42.field843.length(); var32++) {
                    if (field881 == class42.field843.charAt(var32)) {
                        var31 = true;
                        break;
                    }
                }
                if (field176 == 13) {
                    class42.field831 = 0;
                    class42.field836 = "";
                    class42.field811 = "";
                    field109 = 0;
                    field826 = "";
                } else {
                    if (field176 == 85 && field826.length() > 0) {
                        field826 = field826.substring(0, field826.length() - 1);
                    }
                    if (field176 == 84) {
                        field826.trim();
                        if (field826.length() != 6) {
                            class42.method9(class174.field2429, class174.field2402, class174.field2403);
                            return;
                        }
                        field109 = Integer.parseInt(field826);
                        field826 = "";
                        class42.field848 = class42.field838 ? class98.field1630 : class98.field1633;
                        class42.method9(class174.field2594, class174.field2631, class174.field2596);
                        client.method1803(20);
                        return;
                    }
                    if (var31 && field826.length() < 6) {
                        field826 = field826 + field881;
                    }
                }
            }
        } else if (class42.field831 == 5) {
            int var33 = class42.field840 + 180 - 80;
            short var34 = 321;
            if (var8 == 1 && var9 >= var33 - 75 && var9 <= var33 + 75 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                class42.method121();
                return;
            }
            int var35 = class42.field840 + 180 + 80;
            if (var8 == 1 && var9 >= var35 - 75 && var9 <= var35 + 75 && var10 >= var34 - 20 && var10 <= var34 + 20) {
                class42.field833 = class174.field2557;
                class42.field837 = class174.field2485;
                class42.field835 = class174.field2640;
                class42.field831 = 2;
                class42.field834 = 0;
                class42.field811 = "";
            }
            while (class106.method1768()) {
                boolean var36 = false;
                for (int var37 = 0; var37 < class42.field842.length(); var37++) {
                    if (field881 == class42.field842.charAt(var37)) {
                        var36 = true;
                        break;
                    }
                }
                if (field176 == 13) {
                    class42.field833 = class174.field2557;
                    class42.field837 = class174.field2485;
                    class42.field835 = class174.field2640;
                    class42.field831 = 2;
                    class42.field834 = 0;
                    class42.field811 = "";
                } else {
                    if (field176 == 85 && class42.field836.length() > 0) {
                        class42.field836 = class42.field836.substring(0, class42.field836.length() - 1);
                    }
                    if (field176 == 84) {
                        class42.method121();
                        return;
                    }
                    if (var36 && class42.field836.length() < 320) {
                        class42.field836 = class42.field836 + field881;
                    }
                }
            }
        } else if (class42.field831 == 6) {
            while (true) {
                do {
                    if (!class106.method1768()) {
                        short var38 = 321;
                        if (var8 == 1 && var10 >= var38 - 20 && var10 <= var38 + 20) {
                            class42.field833 = class174.field2557;
                            class42.field837 = class174.field2485;
                            class42.field835 = class174.field2640;
                            class42.field831 = 2;
                            class42.field834 = 0;
                            class42.field811 = "";
                        }
                        return;
                    }
                } while (field176 != 84 && field176 != 13);
                class42.field833 = class174.field2557;
                class42.field837 = class174.field2485;
                class42.field835 = class174.field2640;
                class42.field831 = 2;
                class42.field834 = 0;
                class42.field811 = "";
            }
        }
    }

    @ObfuscatedName("cu.k(II)V")
    public static void method1770(int arg0) {
        if (arg0 == -1 || !field2129[arg0]) {
            return;
        }
        field2241.method2998(arg0);
        if (field2334[arg0] == null) {
            return;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < field2334[arg0].length; var2++) {
            if (field2334[arg0][var2] != null) {
                if (field2334[arg0][var2].field2272 == 2) {
                    var1 = false;
                } else {
                    field2334[arg0][var2] = null;
                }
            }
        }
        if (var1) {
            field2334[arg0] = null;
        }
        field2129[arg0] = false;
    }

    @ObfuscatedName("fg.w(IB)Ljava/lang/String;")
    public static final String method2977(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class174.field2529 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class174.field2377 + "</col>";
        }
    }

    @ObfuscatedName("l.i(I)V")
    public static void method227() {
        if (client.field322 == 0) {
            field5 = new class88(4, 104, 104, class11.field93);
            for (int var0 = 0; var0 < 4; var0++) {
                client.field354[var0] = new class118(104, 104);
            }
            field1095 = new class225(512, 512);
            class42.field823 = class174.field2494;
            class42.field829 = 5;
            client.field322 = 20;
        } else if (client.field322 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1445[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1648(var1, 500, 800, 512, 334);
            class42.field823 = class174.field2381;
            class42.field829 = 10;
            client.field322 = 30;
        } else if (client.field322 == 30) {
            field87 = client.method26(0, false, true, true);
            field781 = client.method26(1, false, true, true);
            field920 = client.method26(2, true, false, true);
            field289 = client.method26(3, false, true, true);
            field61 = client.method26(4, false, true, true);
            field17 = client.method26(5, true, true, true);
            field2171 = client.method26(6, true, true, false);
            field1640 = client.method26(7, false, true, true);
            field808 = client.method26(8, false, true, true);
            field325 = client.method26(9, false, true, true);
            field1737 = client.method26(10, false, true, true);
            field326 = client.method26(11, false, true, true);
            field202 = client.method26(12, false, true, true);
            field69 = client.method26(13, true, false, true);
            field1594 = client.method26(14, false, true, false);
            field925 = client.method26(15, false, true, true);
            class42.field823 = class174.field2382;
            class42.field829 = 20;
            client.field322 = 40;
        } else if (client.field322 == 40) {
            byte var6 = 0;
            int var7 = var6 + field87.method3088() * 4 / 100;
            int var8 = var7 + field781.method3088() * 4 / 100;
            int var9 = var8 + field920.method3088() * 2 / 100;
            int var10 = var9 + field289.method3088() * 2 / 100;
            int var11 = var10 + field61.method3088() * 6 / 100;
            int var12 = var11 + field17.method3088() * 4 / 100;
            int var13 = var12 + field2171.method3088() * 2 / 100;
            int var14 = var13 + field1640.method3088() * 60 / 100;
            int var15 = var14 + field808.method3088() * 2 / 100;
            int var16 = var15 + field325.method3088() * 2 / 100;
            int var17 = var16 + field1737.method3088() * 2 / 100;
            int var18 = var17 + field326.method3088() * 2 / 100;
            int var19 = var18 + field202.method3088() * 2 / 100;
            int var20 = var19 + field69.method3088() * 2 / 100;
            int var21 = var20 + field1594.method3088() * 2 / 100;
            int var22 = var21 + field925.method3088() * 2 / 100;
            if (var22 == 100) {
                class42.field823 = class174.field2440;
                class42.field829 = 30;
                client.field322 = 45;
            } else {
                if (var22 != 0) {
                    class42.field823 = class174.field2383 + var22 + "%";
                }
                class42.field829 = 30;
            }
        } else if (client.field322 == 45) {
            class58.method2516(22050, !client.field300, 2);
            class140 var23 = new class140();
            var23.method2350(9, 128);
            field1627 = class58.method711(field253, field578, 0, 22050);
            field1627.method974(var23);
            class139.method1516(field925, field1594, field61, var23);
            field930 = class58.method711(field253, field578, 1, 2048);
            field759 = new class52();
            field930.method974(field759);
            field268 = new class66(22050, field1058);
            class42.field823 = class174.field2431;
            class42.field829 = 35;
            client.field322 = 50;
        } else if (client.field322 == 50) {
            int var24 = 0;
            if (field1910 == null) {
                field1910 = class226.method8(field808, field69, "p11_full", "");
            } else {
                var24++;
            }
            if (field235 == null) {
                field235 = class226.method8(field808, field69, "p12_full", "");
            } else {
                var24++;
            }
            if (field188 == null) {
                field188 = class226.method8(field808, field69, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class42.field823 = class174.field2577 + var24 * 100 / 3 + "%";
                class42.field829 = 40;
            } else {
                field1605 = new class231(true);
                class42.field823 = class174.field2387;
                class42.field829 = 40;
                client.field322 = 60;
            }
        } else if (client.field322 == 60) {
            int var25 = class42.method1771(field1737, field808);
            byte var26 = 9;
            if (var25 < var26) {
                class42.field823 = class174.field2491 + var25 * 100 / var26 + "%";
                class42.field829 = 50;
            } else {
                class42.field823 = class174.field2450;
                class42.field829 = 50;
                client.method1803(5);
                client.field322 = 70;
            }
        } else if (client.field322 == 70) {
            if (field920.method2990()) {
                class185 var28 = field920;
                field738 = var28;
                class185 var29 = field920;
                field2815 = var29;
                method2528(field920, field1640);
                class185 var30 = field920;
                class185 var31 = field1640;
                boolean var32 = client.field300;
                field2919 = var30;
                field3088 = var31;
                class198.field2935 = var32;
                class200.method1581(field920, field1640);
                class199.method1883(field920, field1640, client.field299, field1910);
                class202.method672(field920, field87, field781);
                class185 var33 = field920;
                class185 var34 = field1640;
                field2805 = var33;
                field2806 = var34;
                class195.method24(field920);
                class185 var35 = field920;
                field2778 = var35;
                field2347 = field2778.method2996(16);
                class170.method1763(field289, field1640, field808, field69);
                class185 var36 = field920;
                field2775 = var36;
                class185 var37 = field920;
                field2864 = var37;
                class185 var38 = field920;
                field2787 = var38;
                class185 var39 = field920;
                field2131 = var39;
                field490 = new class47();
                class197.method2981(field920, field808, field69);
                class185 var40 = field920;
                class185 var41 = field808;
                field74 = var40;
                field1849 = var41;
                class42.field823 = class174.field2463;
                class42.field829 = 60;
                client.field322 = 80;
            } else {
                class42.field823 = class174.field2390 + field920.method3079() + "%";
                class42.field829 = 60;
            }
        } else if (client.field322 == 80) {
            int var42 = 0;
            if (field1181 == null) {
                field1181 = class226.method3615(field808, "compass", "");
            } else {
                var42++;
            }
            if (field1695 == null) {
                field1695 = class226.method3615(field808, "mapedge", "");
            } else {
                var42++;
            }
            if (field2081 == null) {
                field2081 = class226.method1749(field808, "mapscene", "");
            } else {
                var42++;
            }
            if (field2132 == null) {
                field2132 = class226.method3620(field808, "mapfunction", "");
            } else {
                var42++;
            }
            if (field849 == null) {
                field849 = class226.method3620(field808, "headicons_pk", "");
            } else {
                var42++;
            }
            if (field2054 == null) {
                field2054 = class226.method3620(field808, "headicons_prayer", "");
            } else {
                var42++;
            }
            if (field1659 == null) {
                field1659 = class226.method3620(field808, "headicons_hint", "");
            } else {
                var42++;
            }
            if (field594 == null) {
                field594 = class226.method3620(field808, "mapmarker", "");
            } else {
                var42++;
            }
            if (field251 == null) {
                field251 = class226.method3620(field808, "cross", "");
            } else {
                var42++;
            }
            if (field1822 == null) {
                field1822 = class226.method3620(field808, "mapdots", "");
            } else {
                var42++;
            }
            if (field292 == null) {
                field292 = class226.method1749(field808, "scrollbar", "");
            } else {
                var42++;
            }
            if (field1921 == null) {
                field1921 = class226.method1749(field808, "mod_icons", "");
            } else {
                var42++;
            }
            if (var42 < 12) {
                class42.field823 = class174.field2392 + var42 * 100 / 12 + "%";
                class42.field829 = 70;
            } else {
                field3121 = field1921;
                field1695.method3821();
                int var43 = (int) (Math.random() * 21.0D) - 10;
                int var44 = (int) (Math.random() * 21.0D) - 10;
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 41.0D) - 20;
                for (int var47 = 0; var47 < field2132.length; var47++) {
                    field2132[var47].method3735(var43 + var46, var44 + var46, var45 + var46);
                }
                field2081[0].method3701(var43 + var46, var44 + var46, var45 + var46);
                class42.field823 = class174.field2442;
                class42.field829 = 70;
                client.field322 = 90;
            }
        } else if (client.field322 == 90) {
            if (field325.method2990()) {
                class75 var48 = new class75(field325, field808, 20, 0.8D, client.field300 ? 64 : 128);
                class85.method1522(var48);
                class85.method1528(0.8D);
                class42.field823 = class174.field2446;
                class42.field829 = 90;
                client.field322 = 110;
            } else {
                class42.field823 = class174.field2394 + field325.method3079() + "%";
                class42.field829 = 90;
            }
        } else if (client.field322 == 110) {
            field803 = new class21();
            field253.method1806(field803, 10);
            class42.field823 = class174.field2396;
            class42.field829 = 94;
            client.field322 = 120;
        } else if (client.field322 == 120) {
            if (field1737.method3042("huffman", "")) {
                class146 var49 = new class146(field1737.method3003("huffman", ""));
                class211.method2262(var49);
                class42.field823 = class174.field2398;
                class42.field829 = 96;
                client.field322 = 130;
            } else {
                class42.field823 = class174.field2397 + "%";
                class42.field829 = 96;
            }
        } else if (client.field322 == 130) {
            if (!field289.method2990()) {
                class42.field823 = class174.field2399 + field289.method3079() * 4 / 5 + "%";
                class42.field829 = 100;
            } else if (!field202.method2990()) {
                class42.field823 = class174.field2399 + (80 + field202.method3079() / 6) + "%";
                class42.field829 = 100;
            } else if (field69.method2990()) {
                class42.field823 = class174.field2400;
                class42.field829 = 100;
                client.field322 = 140;
            } else {
                class42.field823 = class174.field2399 + (96 + field69.method3079() / 20) + "%";
                class42.field829 = 100;
            }
        } else if (client.field322 == 140) {
            client.method1803(10);
        }
    }

    @ObfuscatedName("at.ap(I)V")
    public static void method772() {
        client var0 = field3231;
        synchronized (field3231) {
            Container var1 = field3231.method1951();
            if (var1 != null) {
                field181 = Math.max(var1.getSize().width, field2119);
                field591 = Math.max(var1.getSize().height, field1188);
                if (field1856 == var1) {
                    Insets var2 = field1856.getInsets();
                    field181 -= var2.right + var2.left;
                    field591 -= var2.top + var2.bottom;
                }
                if (field181 <= 0) {
                    field181 = 1;
                }
                if (field591 <= 0) {
                    field591 = 1;
                }
                if (client.method1440() == 1) {
                    field187 = client.field356 * 765;
                    field908 = client.field509;
                } else {
                    field187 = Math.min(field181, 7680);
                    field908 = Math.min(field591, 2160);
                }
                client.field1781 = (field181 - field187) / 2;
                client.field1782 = 0;
                field578.setSize(field187, field908);
                int var3 = field187;
                int var4 = field908;
                Canvas var5 = field578;
                class221 var7;
                try {
                    class219 var6 = new class219();
                    var6.method3626(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var12) {
                    class224 var9 = new class224();
                    var9.method3626(var3, var4, var5);
                    var7 = var9;
                }
                field1059 = var7;
                if (field1856 == var1) {
                    Insets var10 = field1856.getInsets();
                    field578.setLocation(client.field1781 + var10.left, client.field1782 + var10.top);
                } else {
                    field578.setLocation(client.field1781, client.field1782);
                }
                client.method16();
                if (client.field452 != -1) {
                    client.method756(true);
                }
                client.method702();
            }
        }
    }

    @ObfuscatedName("ct.ag(Lp;B)V")
    public static final void method1579(class16 arg0) {
        if (field129.field609 >> 7 == client.field527 && field129.field606 >> 7 == client.field433) {
            client.field527 = 0;
        }
        int var1 = class46.field895;
        int[] var2 = class46.field897;
        int var3 = var1;
        if (class16.field174 == arg0 || class16.field169 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field174 == arg0) {
                var5 = field129;
                var6 = field129.field279 << 14;
            } else if (class16.field169 == arg0) {
                var5 = client.field414[client.field293];
                var6 = client.field293 << 14;
            } else {
                var5 = client.field414[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field171 == arg0 && client.field293 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method201() && !var5.field258) {
                var5.field275 = false;
                if ((client.field300 && var1 > 50 || var1 > 200) && class16.field174 != arg0 && var5.field634 == var5.field610) {
                    var5.field275 = true;
                }
                int var7 = var5.field609 >> 7;
                int var8 = var5.field606 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field273 == null || client.field304 < var5.field265 || client.field304 >= var5.field266) {
                        if ((var5.field609 & 0x7F) == 64 && (var5.field606 & 0x7F) == 64) {
                            if (client.field398 == client.field560[var7][var8]) {
                                continue;
                            }
                            client.field560[var7][var8] = client.field398;
                        }
                        var5.field271 = client.method224(var5.field609, var5.field606, field1853);
                        field5.method1638(field1853, var5.field609, var5.field606, var5.field271, 60, var5, var5.field624, var6, var5.field608);
                    } else {
                        var5.field275 = false;
                        var5.field271 = client.method224(var5.field609, var5.field606, field1853);
                        field5.method1628(field1853, var5.field609, var5.field606, var5.field271, 60, var5, var5.field624, var6, var5.field276, var5.field264, var5.field270, var5.field274);
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.be(I)V")
    public static final void method168() {
        for (class26 var0 = (class26) client.field360.method2187(); var0 != null; var0 = (class26) client.field360.method2203()) {
            if (var0.field589 > 0) {
                var0.field589--;
            }
            if (var0.field589 == 0) {
                if (var0.field581 >= 0) {
                    int var1 = var0.field581;
                    int var2 = var0.field592;
                    class198 var3 = class198.method2454(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method3282(var2);
                    if (!var4) {
                        continue;
                    }
                }
                client.method160(var0.field585, var0.field579, var0.field580, var0.field584, var0.field581, var0.field583, var0.field592);
                var0.method2179();
            } else {
                if (var0.field587 > 0) {
                    var0.field587--;
                }
                if (var0.field587 == 0 && var0.field580 >= 1 && var0.field584 >= 1 && var0.field580 <= 102 && var0.field584 <= 102) {
                    if (var0.field582 >= 0) {
                        int var5 = var0.field582;
                        int var6 = var0.field593;
                        class198 var7 = class198.method2454(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method3282(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    client.method160(var0.field585, var0.field579, var0.field580, var0.field584, var0.field582, var0.field586, var0.field593);
                    var0.field587 = -1;
                    if (var0.field582 == var0.field581 && var0.field581 == -1) {
                        var0.method2179();
                    } else if (var0.field582 == var0.field581 && var0.field586 == var0.field583 && var0.field593 == var0.field592) {
                        var0.method2179();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.cy(IIIII)V")
    public static final void method657(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < client.field405; var4++) {
            if (client.field543[var4] + client.field491[var4] > arg0 && client.field543[var4] < arg0 + arg2 && client.field504[var4] + client.field362[var4] > arg1 && client.field362[var4] < arg1 + arg3) {
                client.field498[var4] = true;
            }
        }
    }

    @ObfuscatedName("t.cl(Ljava/lang/String;Lfx;B)Ljava/lang/String;")
    public static String method185(String arg0, class170 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = client.method133(arg1, var2 - 1);
                    String var6;
                    if (var5 < 999999999) {
                        var6 = Integer.toString(var5);
                    } else {
                        var6 = "*";
                    }
                    arg0 = var4 + var6 + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var7 = arg0.indexOf("%dns");
                if (var7 == -1) {
                    break;
                }
                String var8 = "";
                if (field1458 != null) {
                    int var9 = field1458.field1666;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (field1458.field1667 != null) {
                        var8 = (String) field1458.field1667;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("z.ei(Ljava/lang/String;I)V")
    public static final void method163(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(client.field472 < 200 || client.field416 == 1) || client.field472 >= 400) {
            class48.method221(30, "", class174.field2490);
            return;
        }
        String var1 = class205.method2254(arg0, field16);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < client.field472; var2++) {
            class15 var3 = client.field470[var2];
            String var4 = class205.method2254(var3.field161, field16);
            if (var4 != null && var4.equals(var1)) {
                class48.method221(30, "", arg0 + class174.field2532);
                return;
            }
            if (var3.field159 != null) {
                String var5 = class205.method2254(var3.field159, field16);
                if (var5 != null && var5.equals(var1)) {
                    class48.method221(30, "", arg0 + class174.field2532);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < client.field564; var6++) {
            class20 var7 = client.field565[var6];
            String var8 = class205.method2254(var7.field228, field16);
            if (var8 != null && var8.equals(var1)) {
                class48.method221(30, "", class174.field2433 + arg0 + class174.field2538);
                return;
            }
            if (var7.field222 != null) {
                String var9 = class205.method2254(var7.field222, field16);
                if (var9 != null && var9.equals(var1)) {
                    class48.method221(30, "", class174.field2433 + arg0 + class174.field2538);
                    return;
                }
            }
        }
        if (class205.method2254(field129.field259, field16).equals(var1)) {
            class48.method221(30, "", class174.field2535);
            return;
        }
        client.field337.method2775(81);
        class160 var10 = client.field337;
        int var11 = arg0.length() + 1;
        var10.method2531(var11);
        client.field337.method2537(arg0);
    }
}
