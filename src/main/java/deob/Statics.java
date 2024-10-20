package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

public class Statics {

    @ObfuscatedName("az.iy")
    public static int field1004;

    @ObfuscatedName("az.fj")
    public static int field1007;

    @ObfuscatedName("az.h")
    public static class167 field1008;

    @ObfuscatedName("ac.m")
    public static class167 field1012;

    @ObfuscatedName("ac.mq")
    public static class79 field1014;

    @ObfuscatedName("ac.h")
    public static class167 field1018;

    @ObfuscatedName("ac.po")
    public static class9 field1028;

    @ObfuscatedName("ay.m")
    public static class167 field1030;

    @ObfuscatedName("ay.h")
    public static class167 field1031;

    @ObfuscatedName("ay.i")
    public static int field1033;

    @ObfuscatedName("ay.bm")
    public static class168 field1042;

    @ObfuscatedName("al.nu")
    public static class57 field1043;

    @ObfuscatedName("al.f")
    public static class79 field1044;

    @ObfuscatedName("al.ji")
    public static int field1049;

    @ObfuscatedName("al.h")
    public static class167 field1052;

    @ObfuscatedName("al.co")
    public static class146 field1053;

    @ObfuscatedName("at.h")
    public static class167 field1055;

    @ObfuscatedName("at.fq")
    public static int field1063;

    @ObfuscatedName("at.nn")
    public static int field1070;

    @ObfuscatedName("aj.f")
    public static int[] field1078;

    @ObfuscatedName("aj.ek")
    public static class79[] field1079;

    @ObfuscatedName("aj.h")
    public static class167 field1083;

    @ObfuscatedName("aw.h")
    public static class167 field1097;

    @ObfuscatedName("au.h")
    public static class167 field1102;

    @ObfuscatedName("au.du")
    public static int[] field1104;

    @ObfuscatedName("ah.h")
    public static class167 field1108;

    @ObfuscatedName("ah.aw")
    public static class168 field1110;

    @ObfuscatedName("an.q")
    public static class167 field1115;

    @ObfuscatedName("an.f")
    public static int field1117;

    @ObfuscatedName("an.p")
    public static class167 field1118;

    @ObfuscatedName("an.v")
    public static class224 field1121;

    @ObfuscatedName("bm.pf")
    public static Clipboard field1167;

    @ObfuscatedName("bm.h")
    public static class167 field1168;

    @ObfuscatedName("f.be")
    public static class168 field117;

    @ObfuscatedName("bm.m")
    public static int field1170;

    @ObfuscatedName("bl.h")
    public static class54 field1178;

    @ObfuscatedName("bj.q")
    public static boolean field1185;

    @ObfuscatedName("bj.p")
    public static int field1186;

    @ObfuscatedName("bj.c")
    public static class73 field1187;

    @ObfuscatedName("bj.i")
    public static int field1199;

    @ObfuscatedName("bj.qf")
    public static int field1206;

    @ObfuscatedName("be.iz")
    public static int field1227;

    @ObfuscatedName("be.y")
    public static int field1229;

    @ObfuscatedName("f.bs")
    public static class168 field124;

    @ObfuscatedName("bs.w")
    public static int field1246;

    @ObfuscatedName("bs.y")
    public static float field1253;

    @ObfuscatedName("y.hf")
    public static int field127;

    @ObfuscatedName("bb.l")
    public static int[] field1283;

    @ObfuscatedName("bb.k")
    public static boolean[] field1287;

    @ObfuscatedName("bb.v")
    public static int[] field1288;

    @ObfuscatedName("h.t")
    public static int field13;

    @ObfuscatedName("bt.f")
    public static byte[] field1304;

    @ObfuscatedName("bt.y")
    public static int field1305;

    @ObfuscatedName("bt.w")
    public static int field1306;

    @ObfuscatedName("bt.ax")
    public static int[] field1307;

    @ObfuscatedName("bt.v")
    public static int field1308;

    @ObfuscatedName("bt.g")
    public static boolean[] field1309;

    @ObfuscatedName("y.i")
    public static int field131;

    @ObfuscatedName("bt.o")
    public static class68[] field1310;

    @ObfuscatedName("bt.u")
    public static class61[] field1311;

    @ObfuscatedName("bt.s")
    public static class69[] field1312;

    @ObfuscatedName("bt.b")
    public static float[] field1313;

    @ObfuscatedName("bt.af")
    public static float[] field1315;

    @ObfuscatedName("y.an")
    public static class81[] field132;

    @ObfuscatedName("bt.n")
    public static float[] field1320;

    @ObfuscatedName("bt.j")
    public static float[] field1321;

    @ObfuscatedName("bt.l")
    public static int field1322;

    @ObfuscatedName("bt.x")
    public static int[] field1323;

    @ObfuscatedName("bt.ai")
    public static float[] field1324;

    @ObfuscatedName("bt.ao")
    public static float[] field1325;

    @ObfuscatedName("bt.e")
    public static float[] field1326;

    @ObfuscatedName("bt.ab")
    public static int[] field1327;

    @ObfuscatedName("bt.k")
    public static class74[] field1331;

    @ObfuscatedName("bg.p")
    public static int[] field1358;

    @ObfuscatedName("y.ah")
    public static class81[] field136;

    @ObfuscatedName("bg.w")
    public static int[][] field1363;

    @ObfuscatedName("bg.qu")
    public static class133 field1367;

    @ObfuscatedName("y.d")
    public static String field137;

    @ObfuscatedName("bk.by")
    public static class168 field1380;

    @ObfuscatedName("bn.h")
    public static int field1387;

    @ObfuscatedName("bn.m")
    public static int field1388;

    @ObfuscatedName("bn.i")
    public static int field1389;

    @ObfuscatedName("bn.bj")
    public static class168 field1391;

    @ObfuscatedName("bn.q")
    public static int[] field1394;

    @ObfuscatedName("bn.nb")
    public static int field1395;

    @ObfuscatedName("h.gx")
    public static class173 field14;

    @ObfuscatedName("w.jn")
    public static class173[] field140;

    @ObfuscatedName("bd.qp")
    public static int field1404;

    @ObfuscatedName("bd.k")
    public static class180 field1406;

    @ObfuscatedName("cm.u")
    public static int field1423;

    @ObfuscatedName("cm.s")
    public static int field1424;

    @ObfuscatedName("cm.o")
    public static int[] field1425;

    @ObfuscatedName("ce.s")
    public static int[] field1452;

    @ObfuscatedName("ci.n")
    public static int field1459;

    @ObfuscatedName("ci.ab")
    public static int field1460;

    @ObfuscatedName("ci.af")
    public static int field1461;

    @ObfuscatedName("ci.j")
    public static int field1465;

    @ObfuscatedName("ci.x")
    public static int field1475;

    @ObfuscatedName("ci.t")
    public static int field1477;

    @ObfuscatedName("ci.z")
    public static int field1478;

    @ObfuscatedName("ci.b")
    public static int field1479;

    @ObfuscatedName("w.dk")
    public static int[][] field148;

    @ObfuscatedName("ci.d")
    public static int field1480;

    @ObfuscatedName("ci.ai")
    public static int field1485;

    @ObfuscatedName("ci.a")
    public static int field1499;

    @ObfuscatedName("w.g")
    public static class119 field150;

    @ObfuscatedName("ci.r")
    public static int field1504;

    @ObfuscatedName("ci.e")
    public static int field1506;

    @ObfuscatedName("ci.be")
    public static int field1507;

    @ObfuscatedName("ci.ba")
    public static boolean[][] field1514;

    @ObfuscatedName("ci.bj")
    public static int field1515;

    @ObfuscatedName("ci.bx")
    public static int field1516;

    @ObfuscatedName("ci.bi")
    public static int field1517;

    @ObfuscatedName("ci.ao")
    public static int field1518;

    @ObfuscatedName("ci.bp")
    public static int field1519;

    @ObfuscatedName("l.hl")
    public static int field152;

    @ObfuscatedName("ci.br")
    public static int field1520;

    @ObfuscatedName("ck.nv")
    public static class75 field1535;

    @ObfuscatedName("cw.k")
    public static int field1565;

    @ObfuscatedName("cw.v")
    public static int field1571;

    @ObfuscatedName("cw.z")
    public static int field1573;

    @ObfuscatedName("cw.r")
    public static int field1574;

    @ObfuscatedName("cw.d")
    public static int field1575;

    @ObfuscatedName("cw.ao")
    public static class92 field1576;

    @ObfuscatedName("cw.j")
    public static int field1577;

    @ObfuscatedName("cw.b")
    public static int field1578;

    @ObfuscatedName("cw.n")
    public static int field1583;

    @ObfuscatedName("cv.fc")
    public static int field1592;

    @ObfuscatedName("cv.b")
    public static int[] field1597;

    @ObfuscatedName("cv.nq")
    public static int field1598;

    @ObfuscatedName("l.y")
    public static short[][] field160;

    @ObfuscatedName("cr.qr")
    public static int field1605;

    @ObfuscatedName("cr.an")
    public static class168 field1613;

    @ObfuscatedName("cr.qk")
    public static int field1615;

    @ObfuscatedName("cx.fh")
    public static int field1619;

    @ObfuscatedName("v.pz")
    public static class221 field162;

    @ObfuscatedName("cx.ic")
    public static int field1627;

    @ObfuscatedName("cy.cd")
    public static int field1629;

    @ObfuscatedName("cy.nj")
    public static class56 field1633;

    @ObfuscatedName("v.ie")
    public static int field165;

    @ObfuscatedName("cj.mm")
    public static byte field1658;

    @ObfuscatedName("cc.w")
    public static byte[][] field1683;

    @ObfuscatedName("k.ci")
    public static class143 field170;

    @ObfuscatedName("k.ez")
    public static class81[] field171;

    @ObfuscatedName("k.em")
    public static class79[] field173;

    @ObfuscatedName("k.ms")
    public static class25[] field174;

    @ObfuscatedName("ch.ay")
    public static class143 field1748;

    @ObfuscatedName("ch.de")
    public static int field1756;

    @ObfuscatedName("cq.nw")
    public static int field1790;

    @ObfuscatedName("o.dp")
    public static class86 field184;

    @ObfuscatedName("db.bm")
    public static int field1844;

    @ObfuscatedName("db.bo")
    public static int field1845;

    @ObfuscatedName("db.bl")
    public static int field1846;

    @ObfuscatedName("o.ao")
    public static int[] field186;

    @ObfuscatedName("de.p")
    public static int field1861;

    @ObfuscatedName("de.c")
    public static int field1862;

    @ObfuscatedName("de.l")
    public static int field1865;

    @ObfuscatedName("o.bo")
    public static class81 field187;

    @ObfuscatedName("dt.na")
    public static int field1872;

    @ObfuscatedName("o.o")
    public static boolean field189;

    @ObfuscatedName("dh.gz")
    public static class173 field1891;

    @ObfuscatedName("u.l")
    public static int[] field190;

    @ObfuscatedName("u.nh")
    public static int field192;

    @ObfuscatedName("dj.pr")
    public static class136 field1935;

    @ObfuscatedName("du.c")
    public static class167 field1947;

    @ObfuscatedName("u.v")
    public static class212 field195;

    @ObfuscatedName("ds.ag")
    public static boolean field1954;

    @ObfuscatedName("ds.rg")
    public static String field1956;

    @ObfuscatedName("ds.q")
    public static File field1961;

    @ObfuscatedName("dq.m")
    public static long field1965;

    @ObfuscatedName("dq.u")
    public static int[] field1966;

    @ObfuscatedName("dq.h")
    public static long field1967;

    @ObfuscatedName("dk.c")
    public static int[] field1970;

    @ObfuscatedName("dk.y")
    public static int[] field1973;

    @ObfuscatedName("dp.qt")
    public static Frame field1996;

    @ObfuscatedName("dn.f")
    public static short[] field1997;

    @ObfuscatedName("dd.ep")
    public static class79 field2007;

    @ObfuscatedName("dd.b")
    public static int[] field2010;

    @ObfuscatedName("di.z")
    public static String field2023;

    @ObfuscatedName("dm.s")
    public static int field2026;

    @ObfuscatedName("dy.qi")
    public static Canvas field2029;

    @ObfuscatedName("da.v")
    public static int[] field2049;

    @ObfuscatedName("da.hb")
    public static int field2050;

    @ObfuscatedName("da.ej")
    public static class79[] field2052;

    @ObfuscatedName("dc.l")
    public static short[][] field2062;

    @ObfuscatedName("eh.j")
    public static class14 field2065;

    @ObfuscatedName("eh.ai")
    public static int[] field2067;

    @ObfuscatedName("eh.ak")
    public static int field2069;

    @ObfuscatedName("ee.bv")
    public static int field2070;

    @ObfuscatedName("ee.cl")
    public static class224 field2071;

    @ObfuscatedName("s.kn")
    public static class131 field208;

    @ObfuscatedName("el.x")
    public static String[] field2081;

    @ObfuscatedName("ew.di")
    public static int field2085;

    @ObfuscatedName("ew.q")
    public static String[] field2086;

    @ObfuscatedName("ew.c")
    public static byte[][][] field2089;

    @ObfuscatedName("ev.m")
    public static String field2091;

    @ObfuscatedName("ev.dz")
    public static byte[][] field2092;

    @ObfuscatedName("ev.h")
    public static String field2101;

    @ObfuscatedName("ex.ct")
    public static char field2111;

    @ObfuscatedName("ex.ni")
    public static class57 field2123;

    @ObfuscatedName("g.bk")
    public static int field213;

    @ObfuscatedName("ei.ec")
    public static class79[] field2142;

    @ObfuscatedName("g.aj")
    public static long field216;

    @ObfuscatedName("em.s")
    public static int[][][] field2174;

    @ObfuscatedName("em.g")
    public static String[] field2175;

    @ObfuscatedName("g.ac")
    public static class146 field218;

    @ObfuscatedName("ek.a")
    public static int field2189;

    @ObfuscatedName("ec.eu")
    public static class79[] field2209;

    @ObfuscatedName("ej.m")
    public static String field2222;

    @ObfuscatedName("ej.h")
    public static Applet field2225;

    @ObfuscatedName("ed.p")
    public static File field2227;

    @ObfuscatedName("ed.mk")
    public static int field2229;

    @ObfuscatedName("g.z")
    public static class119 field223;

    @ObfuscatedName("g.mc")
    public static byte field224;

    @ObfuscatedName("ea.bt")
    public static String field2278;

    @ObfuscatedName("en.pu")
    public static int field2279;

    @ObfuscatedName("en.ar")
    public static class146 field2282;

    @ObfuscatedName("x.ch")
    public static class224 field232;

    @ObfuscatedName("a.im")
    public static class31 field242;

    @ObfuscatedName("a.bw")
    public static int field248;

    @ObfuscatedName("a.dt")
    public static int field249;

    @ObfuscatedName("a.lv")
    public static class130 field251;

    @ObfuscatedName("t.r")
    public static String field255;

    @ObfuscatedName("fg.ro")
    public static boolean field2579;

    @ObfuscatedName("fg.gm")
    public static class173 field2585;

    @ObfuscatedName("fj.eb")
    public static class81[] field2626;

    @ObfuscatedName("fp.au")
    public static class168 field2629;

    @ObfuscatedName("t.z")
    public static int[] field263;

    @ObfuscatedName("fp.ig")
    public static class173 field2632;

    @ObfuscatedName("fp.m")
    public static class113 field2633;

    @ObfuscatedName("t.bl")
    public static class168 field264;

    @ObfuscatedName("fe.u")
    public static class172 field2648;

    @ObfuscatedName("fe.bi")
    public static class168 field2649;

    @ObfuscatedName("fe.l")
    public static class19 field2652;

    @ObfuscatedName("fb.hj")
    public static class3 field2683;

    @ObfuscatedName("fq.pk")
    public static long field2700;

    @ObfuscatedName("ft.i")
    public static long field2703;

    @ObfuscatedName("ft.h")
    public static class143 field2708;

    @ObfuscatedName("z.db")
    public static int field271;

    @ObfuscatedName("ft.bm")
    public static class81[] field2719;

    @ObfuscatedName("fd.w")
    public static short[] field2725;

    @ObfuscatedName("fu.m")
    public static boolean[] field2731;

    @ObfuscatedName("fu.q")
    public static class167 field2733;

    @ObfuscatedName("fu.i")
    public static class167 field2744;

    @ObfuscatedName("z.dw")
    public static byte[][] field279;

    @ObfuscatedName("fu.h")
    public static class173[][] field2793;

    @ObfuscatedName("z.r")
    public static int[] field280;

    @ObfuscatedName("fu.p")
    public static class167 field2851;

    @ObfuscatedName("fy.qb")
    public static Font field2888;

    @ObfuscatedName("fy.cc")
    public static class224 field2889;

    @ObfuscatedName("fa.v")
    public static class173 field2895;

    @ObfuscatedName("fo.t")
    public static int[] field2903;

    @ObfuscatedName("go.m")
    public static class167 field2940;

    @ObfuscatedName("go.i")
    public static class167 field2941;

    @ObfuscatedName("go.c")
    public static class167 field2942;

    @ObfuscatedName("go.q")
    public static class184 field2944;

    @ObfuscatedName("go.f")
    public static int field2945;

    @ObfuscatedName("go.v")
    public static boolean field2946;

    @ObfuscatedName("go.h")
    public static class167 field2947;

    @ObfuscatedName("gy.w")
    public static class81[] field3037;

    @ObfuscatedName("gs.ei")
    public static class79 field3056;

    @ObfuscatedName("gs.ir")
    public static class173 field3061;

    @ObfuscatedName("client.ah")
    public static class168 field309;

    @ObfuscatedName("m.w")
    public static int field31;

    @ObfuscatedName("hn.g")
    public static String field3118;

    @ObfuscatedName("ha.m")
    public static client field3128;

    @ObfuscatedName("hq.u")
    public static class228[] field3157;

    @ObfuscatedName("hw.l")
    public static class81[] field3167;

    @ObfuscatedName("hb.ba")
    public static class168 field3188;

    @ObfuscatedName("hb.pm")
    public static int field3190;

    @ObfuscatedName("client.bo")
    public static class168 field321;

    @ObfuscatedName("client.bg")
    public static int field322;

    @ObfuscatedName("client.pp")
    public static short[] field323;

    @ObfuscatedName("client.cz")
    public static class143 field328;

    @ObfuscatedName("client.eo")
    public static class79[] field363;

    @ObfuscatedName("client.bx")
    public static class168 field424;

    @ObfuscatedName("i.pl")
    public static int field44;

    @ObfuscatedName("client.c")
    public static class153 field524;

    @ObfuscatedName("r.ef")
    public static class79[] field582;

    @ObfuscatedName("d.m")
    public static File field585;

    @ObfuscatedName("d.qj")
    public static int field587;

    @ObfuscatedName("d.c")
    public static int field588;

    @ObfuscatedName("d.ns")
    public static int field589;

    @ObfuscatedName("d.ds")
    public static int[] field590;

    @ObfuscatedName("n.qq")
    public static int field591;

    @ObfuscatedName("b.y")
    public static class81 field627;

    @ObfuscatedName("b.l")
    public static class154 field628;

    @ObfuscatedName("b.fl")
    public static int field630;

    @ObfuscatedName("e.qs")
    public static int field649;

    @ObfuscatedName("q.jg")
    public static int field65;

    @ObfuscatedName("e.fm")
    public static int field651;

    @ObfuscatedName("ai.au")
    public static class79[] field656;

    @ObfuscatedName("ai.qn")
    public static Image field670;

    @ObfuscatedName("ao.o")
    public static class60 field674;

    @ObfuscatedName("ao.pd")
    public static class134 field675;

    @ObfuscatedName("ao.p")
    public static class26[] field676;

    @ObfuscatedName("ao.s")
    public static String field679;

    @ObfuscatedName("af.e")
    public static int[] field681;

    @ObfuscatedName("af.jy")
    public static int field684;

    @ObfuscatedName("af.qg")
    public static class78 field687;

    @ObfuscatedName("ab.bf")
    public static FontMetrics field691;

    @ObfuscatedName("ab.fg")
    public static int field701;

    @ObfuscatedName("ap.v")
    public static class81 field716;

    @ObfuscatedName("ap.d")
    public static int[] field718;

    @ObfuscatedName("p.iv")
    public static int field72;

    @ObfuscatedName("ap.c")
    public static class79 field721;

    @ObfuscatedName("ap.l")
    public static class81 field722;

    @ObfuscatedName("ap.i")
    public static class81 field723;

    @ObfuscatedName("ap.q")
    public static class81 field728;

    @ObfuscatedName("ap.p")
    public static class81[] field733;

    @ObfuscatedName("ap.az")
    public static String field744;

    @ObfuscatedName("ap.h")
    public static boolean field746;

    @ObfuscatedName("ap.kk")
    public static class20 field751;

    @ObfuscatedName("ap.no")
    public static int field753;

    @ObfuscatedName("p.cq")
    public static int field77;

    @ObfuscatedName("as.br")
    public static class168 field771;

    @ObfuscatedName("av.ed")
    public static class81[] field774;

    @ObfuscatedName("av.dm")
    public static int field779;

    @ObfuscatedName("av.hk")
    public static int field780;

    @ObfuscatedName("am.c")
    public static boolean field784;

    @ObfuscatedName("aa.nc")
    public static int field794;

    @ObfuscatedName("aq.bp")
    public static class168 field798;

    @ObfuscatedName("aq.k")
    public static class173 field808;

    @ObfuscatedName("c.q")
    public static byte[][][] field81;

    @ObfuscatedName("aq.pg")
    public static class160 field811;

    @ObfuscatedName("aq.i")
    public static int[] field814;

    @ObfuscatedName("c.p")
    public static byte[][][] field82;

    @ObfuscatedName("c.y")
    public static byte[][][] field84;

    @ObfuscatedName("c.f")
    public static byte[][][] field85;

    @ObfuscatedName("c.o")
    public static int[] field86;

    @ObfuscatedName("ad.nx")
    public static int field863;

    @ObfuscatedName("ar.gq")
    public static int field880;

    @ObfuscatedName("ar.eg")
    public static class79[] field886;

    @ObfuscatedName("ag.h")
    public static class167 field896;

    @ObfuscatedName("c.k")
    public static int[] field92;

    @ObfuscatedName("ag.m")
    public static class167 field923;

    @ObfuscatedName("ae.m")
    public static class167 field929;

    @ObfuscatedName("ae.i")
    public static class167 field930;

    @ObfuscatedName("c.pv")
    public static GarbageCollectorMXBean field95;

    @ObfuscatedName("ae.dq")
    public static int[] field952;

    @ObfuscatedName("ak.h")
    public static class167 field981;

    @ObfuscatedName("az.m")
    public static class167 field989;

    @ObfuscatedName("az.i")
    public static class167 field993;

    @ObfuscatedName("az.qm")
    public static int field999;

    @ObfuscatedName("df.h(II)Ljava/lang/String;")
    public static String method2243(int arg0) {
        return "<img=" + arg0 + ">";
    }

    @ObfuscatedName("t.m(J)Ljava/lang/String;")
    public static String method187(long arg0) {
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
                char var8 = class162.field2631[(int) (var6 - arg0 * 37L)];
                if (var8 == '_') {
                    int var9 = var5.length() - 1;
                    var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                    var8 = 160;
                }
                var5.append(var8);
            }
            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
        }
    }

    @ObfuscatedName("dh.m([BIS)I")
    public static int method2238(byte[] arg0, int arg1) {
        return class119.method949(arg0, 0, arg1);
    }

    @ObfuscatedName("ap.i(IIZI)Ljava/lang/String;")
    public static String method667(int arg0, int arg1, boolean arg2) {
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("");
        } else if (arg2 && arg0 >= 0) {
            int var3 = 2;
            int var4 = arg0 / arg1;
            while (var4 != 0) {
                var4 /= arg1;
                var3++;
            }
            char[] var5 = new char[var3];
            var5[0] = '+';
            for (int var6 = var3 - 1; var6 > 0; var6--) {
                int var7 = arg0;
                arg0 /= arg1;
                int var8 = var7 - arg0 * arg1;
                if (var8 >= 10) {
                    var5[var6] = (char) (var8 + 87);
                } else {
                    var5[var6] = (char) (var8 + 48);
                }
            }
            return new String(var5);
        } else {
            return Integer.toString(arg0, arg1);
        }
    }

    @ObfuscatedName("an.h(Ljava/awt/Component;I)V")
    public static void method982(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(class137.field2118);
        arg0.addFocusListener(class137.field2118);
    }

    @ObfuscatedName("co.i(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method1746(String arg0) throws ClassNotFoundException {
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else if (arg0.equals("void")) {
            return Void.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @ObfuscatedName("ae.p(Le;Le;IZI)I")
    public static int method788(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field653;
            int var5 = arg1.field653;
            if (!arg3) {
                if (var4 == -1) {
                    var4 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var4 - var5;
        } else if (arg2 == 2) {
            return arg0.field646 - arg1.field646;
        } else if (arg2 == 3) {
            if (arg0.field645.equals("-")) {
                if (arg1.field645.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field645.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field645.compareTo(arg1.field645);
            }
        } else if (arg2 == 4) {
            return arg0.method586() ? (arg1.method586() ? 0 : 1) : (arg1.method586() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method578() ? (arg1.method578() ? 0 : 1) : (arg1.method578() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method598() ? (arg1.method598() ? 0 : 1) : (arg1.method598() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method577() ? (arg1.method577() ? 0 : 1) : (arg1.method577() ? -1 : 0);
        } else {
            return arg0.field641 - arg1.field641;
        }
    }

    @ObfuscatedName("ex.c(Ldd;I)V")
    public static final void method2739(class122 arg0) {
        for (int var1 = 0; var1 < class33.field768; var1++) {
            int var2 = class33.field769[var1];
            class3 var3 = client.field407[var2];
            int var4 = arg0.method2320();
            if ((var4 & 0x8) != 0) {
                var4 += arg0.method2320() << 8;
            }
            class33.method160(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("ai.s(IIB)Z")
    public static final boolean method605(int arg0, int arg1) {
        class41 var2 = class41.method961(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method798(arg1);
    }

    @ObfuscatedName("ac.g(IIIIIIILci;Ldl;I)V")
    public static final void method878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class86 arg7, class108 arg8) {
        class41 var9 = class41.method961(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field945;
            var11 = var9.field962;
        } else {
            var10 = var9.field962;
            var11 = var9.field945;
        }
        int var12;
        int var13;
        if (arg2 + var10 <= 104) {
            var12 = (var10 >> 1) + arg2;
            var13 = (var10 + 1 >> 1) + arg2;
        } else {
            var12 = arg2;
            var13 = arg2 + 1;
        }
        int var14;
        int var15;
        if (arg3 + var11 <= 104) {
            var14 = (var11 >> 1) + arg3;
            var15 = (var11 + 1 >> 1) + arg3;
        } else {
            var14 = arg3;
            var15 = arg3 + 1;
        }
        int[][] var16 = class6.field80[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var9.field948 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg5 << 6) + arg6;
        if (var9.field967 == 1) {
            var21 += 256;
        }
        if (arg6 == 22) {
            class85 var22;
            if (var9.field976 == -1 && var9.field970 == null) {
                var22 = var9.method764(22, arg5, var16, var18, var17, var19);
            } else {
                var22 = new class13(arg4, 22, arg5, arg1, arg2, arg3, var9.field976, true, (class85) null);
            }
            arg7.method1840(arg0, arg2, arg3, var17, var22, var20, var21);
            if (var9.field946 == 1) {
                arg8.method2206(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var45;
            if (var9.field976 == -1 && var9.field970 == null) {
                var45 = var9.method764(10, arg5, var16, var18, var17, var19);
            } else {
                var45 = new class13(arg4, 10, arg5, arg1, arg2, arg3, var9.field976, true, (class85) null);
            }
            if (var45 != null) {
                arg7.method1765(arg0, arg2, arg3, var17, var10, var11, var45, arg6 == 11 ? 256 : 0, var20, var21);
            }
            if (var9.field946 != 0) {
                arg8.method2220(arg2, arg3, var10, var11, var9.field947);
            }
        } else if (arg6 >= 12) {
            class85 var23;
            if (var9.field976 == -1 && var9.field970 == null) {
                var23 = var9.method764(arg6, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field976, true, (class85) null);
            }
            arg7.method1765(arg0, arg2, arg3, var17, 1, 1, var23, 0, var20, var21);
            if (var9.field946 != 0) {
                arg8.method2220(arg2, arg3, var10, var11, var9.field947);
            }
        } else if (arg6 == 0) {
            class85 var24;
            if (var9.field976 == -1 && var9.field970 == null) {
                var24 = var9.method764(0, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class13(arg4, 0, arg5, arg1, arg2, arg3, var9.field976, true, (class85) null);
            }
            arg7.method1891(arg0, arg2, arg3, var17, var24, (class85) null, class6.field78[arg5], 0, var20, var21);
            if (var9.field946 != 0) {
                arg8.method2203(arg2, arg3, arg6, arg5, var9.field947);
            }
        } else if (arg6 == 1) {
            class85 var25;
            if (var9.field976 == -1 && var9.field970 == null) {
                var25 = var9.method764(1, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class13(arg4, 1, arg5, arg1, arg2, arg3, var9.field976, true, (class85) null);
            }
            arg7.method1891(arg0, arg2, arg3, var17, var25, (class85) null, class6.field88[arg5], 0, var20, var21);
            if (var9.field946 != 0) {
                arg8.method2203(arg2, arg3, arg6, arg5, var9.field947);
            }
        } else if (arg6 == 2) {
            int var26 = arg5 + 1 & 0x3;
            class85 var27;
            class85 var28;
            if (var9.field976 == -1 && var9.field970 == null) {
                var27 = var9.method764(2, arg5 + 4, var16, var18, var17, var19);
                var28 = var9.method764(2, var26, var16, var18, var17, var19);
            } else {
                var27 = new class13(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field976, true, (class85) null);
                var28 = new class13(arg4, 2, var26, arg1, arg2, arg3, var9.field976, true, (class85) null);
            }
            arg7.method1891(arg0, arg2, arg3, var17, var27, var28, class6.field78[arg5], class6.field78[var26], var20, var21);
            if (var9.field946 != 0) {
                arg8.method2203(arg2, arg3, arg6, arg5, var9.field947);
            }
        } else if (arg6 == 3) {
            class85 var29;
            if (var9.field976 == -1 && var9.field970 == null) {
                var29 = var9.method764(3, arg5, var16, var18, var17, var19);
            } else {
                var29 = new class13(arg4, 3, arg5, arg1, arg2, arg3, var9.field976, true, (class85) null);
            }
            arg7.method1891(arg0, arg2, arg3, var17, var29, (class85) null, class6.field88[arg5], 0, var20, var21);
            if (var9.field946 != 0) {
                arg8.method2203(arg2, arg3, arg6, arg5, var9.field947);
            }
        } else if (arg6 == 9) {
            class85 var30;
            if (var9.field976 == -1 && var9.field970 == null) {
                var30 = var9.method764(arg6, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class13(arg4, arg6, arg5, arg1, arg2, arg3, var9.field976, true, (class85) null);
            }
            arg7.method1765(arg0, arg2, arg3, var17, 1, 1, var30, 0, var20, var21);
            if (var9.field946 != 0) {
                arg8.method2220(arg2, arg3, var10, var11, var9.field947);
            }
        } else if (arg6 == 4) {
            class85 var31;
            if (var9.field976 == -1 && var9.field970 == null) {
                var31 = var9.method764(4, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field976, true, (class85) null);
            }
            arg7.method1869(arg0, arg2, arg3, var17, var31, (class85) null, class6.field78[arg5], 0, 0, 0, var20, var21);
        } else if (arg6 == 5) {
            int var32 = 16;
            int var33 = arg7.method1781(arg0, arg2, arg3);
            if (var33 != 0) {
                var32 = class41.method961(var33 >> 14 & 0x7FFF).field969;
            }
            class85 var34;
            if (var9.field976 == -1 && var9.field970 == null) {
                var34 = var9.method764(4, arg5, var16, var18, var17, var19);
            } else {
                var34 = new class13(arg4, 4, arg5, arg1, arg2, arg3, var9.field976, true, (class85) null);
            }
            arg7.method1869(arg0, arg2, arg3, var17, var34, (class85) null, class6.field78[arg5], 0, class6.field89[arg5] * var32, class6.field90[arg5] * var32, var20, var21);
        } else if (arg6 == 6) {
            int var35 = 8;
            int var36 = arg7.method1781(arg0, arg2, arg3);
            if (var36 != 0) {
                var35 = class41.method961(var36 >> 14 & 0x7FFF).field969 / 2;
            }
            class85 var37;
            if (var9.field976 == -1 && var9.field970 == null) {
                var37 = var9.method764(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var37 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field976, true, (class85) null);
            }
            arg7.method1869(arg0, arg2, arg3, var17, var37, (class85) null, 256, arg5, class6.field91[arg5] * var35, class6.field83[arg5] * var35, var20, var21);
        } else if (arg6 == 7) {
            int var38 = arg5 + 2 & 0x3;
            class85 var39;
            if (var9.field976 == -1 && var9.field970 == null) {
                var39 = var9.method764(4, var38 + 4, var16, var18, var17, var19);
            } else {
                var39 = new class13(arg4, 4, var38 + 4, arg1, arg2, arg3, var9.field976, true, (class85) null);
            }
            arg7.method1869(arg0, arg2, arg3, var17, var39, (class85) null, 256, var38, 0, 0, var20, var21);
        } else if (arg6 == 8) {
            int var40 = 8;
            int var41 = arg7.method1781(arg0, arg2, arg3);
            if (var41 != 0) {
                var40 = class41.method961(var41 >> 14 & 0x7FFF).field969 / 2;
            }
            int var42 = arg5 + 2 & 0x3;
            class85 var43;
            class85 var44;
            if (var9.field976 == -1 && var9.field970 == null) {
                var43 = var9.method764(4, arg5 + 4, var16, var18, var17, var19);
                var44 = var9.method764(4, var42 + 4, var16, var18, var17, var19);
            } else {
                var43 = new class13(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field976, true, (class85) null);
                var44 = new class13(arg4, 4, var42 + 4, arg1, arg2, arg3, var9.field976, true, (class85) null);
            }
            arg7.method1869(arg0, arg2, arg3, var17, var43, var44, 256, arg5, class6.field91[arg5] * var40, class6.field83[arg5] * var40, var20, var21);
        }
    }

    @ObfuscatedName("at.ap(B)V")
    public static void method932() {
        client.field329.method2565(109);
        class122 var0 = client.field329;
        int var1 = client.field403 ? 2 : 1;
        var0.method2305(var1);
        client.field329.method2501(field999);
        client.field329.method2501(field1605);
    }

    @ObfuscatedName("r.am(I)V")
    public static void method533() {
        int var0 = client.field2200;
        int var1 = client.field2201;
        int var2 = field1615 - field999 - var0;
        int var3 = field587 - field1605 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = field3128.method2834();
            int var5 = 0;
            int var6 = 0;
            if (field1996 == var4) {
                Insets var7 = field1996.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, field587);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, field1615, var1);
            }
            if (var2 > 0) {
                var8.fillRect(field1615 + var5 - var2, var6, var2, field587);
            }
            if (var3 > 0) {
                var8.fillRect(var5, field587 + var6 - var3, field1615, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("cd.ag(Lav;I)V")
    public static final void method1931(class34 arg0) {
        if (field2683.field861 >> 7 == client.field519 && field2683.field818 >> 7 == client.field520) {
            client.field519 = 0;
        }
        int var1 = class33.field761;
        int[] var2 = class33.field765;
        int var3 = var1;
        if (class34.field781 == arg0 || class34.field775 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field781 == arg0) {
                var5 = field2683;
                var6 = field2683.field53 << 14;
            } else if (class34.field775 == arg0) {
                var5 = client.field407[client.field509];
                var6 = client.field509 << 14;
            } else {
                var5 = client.field407[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field777 == arg0 && client.field509 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method14() && !var5.field51) {
                var5.field40 = false;
                if ((client.field291 && var1 > 50 || var1 > 200) && class34.field781 != arg0 && var5.field849 == var5.field822) {
                    var5.field40 = true;
                }
                int var7 = var5.field861 >> 7;
                int var8 = var5.field818 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field45 == null || client.field295 < var5.field39 || client.field295 >= var5.field48) {
                        if ((var5.field861 & 0x7F) == 64 && (var5.field818 & 0x7F) == 64) {
                            if (client.field391 == client.field445[var7][var8]) {
                                continue;
                            }
                            client.field445[var7][var8] = client.field391;
                        }
                        var5.field38 = client.method4(var5.field861, var5.field818, field880);
                        field184.method1766(field880, var5.field861, var5.field818, var5.field38, 60, var5, var5.field819, var6, var5.field820);
                    } else {
                        var5.field40 = false;
                        var5.field38 = client.method4(var5.field861, var5.field818, field880);
                        field184.method1767(field880, var5.field861, var5.field818, var5.field38, 60, var5, var5.field819, var6, var5.field46, var5.field43, var5.field47, var5.field41);
                    }
                }
            }
        }
    }

    @ObfuscatedName("be.bl(I)Z")
    public static final boolean method1208() {
        if (field328 == null) {
            return false;
        }
        try {
            int var0 = field328.method2797();
            if (var0 == 0) {
                return false;
            }
            if (client.field523 == -1) {
                field328.method2798(client.field331.field1989, 0, 1);
                client.field331.field1988 = 0;
                client.field523 = client.field331.method2579();
                client.field444 = class188.field3035[client.field523];
                var0--;
            }
            if (client.field444 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                field328.method2798(client.field331.field1989, 0, 1);
                client.field444 = client.field331.field1989[0] & 0xFF;
                var0--;
            }
            if (client.field444 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                field328.method2798(client.field331.field1989, 0, 2);
                client.field331.field1988 = 0;
                client.field444 = client.field331.method2322();
                var0 -= 2;
            }
            if (var0 < client.field444) {
                return false;
            }
            client.field331.field1988 = 0;
            field328.method2798(client.field331.field1989, 0, client.field444);
            client.field450 = 0;
            client.field338 = client.field362;
            client.field362 = client.field454;
            client.field454 = client.field523;
            if (client.field523 == 151) {
                for (int var1 = 0; var1 < class176.field2896.length; var1++) {
                    if (class176.field2896[var1] != class176.field2894[var1]) {
                        class176.field2896[var1] = class176.field2894[var1];
                        client.method2979(var1);
                        client.field471[++client.field472 - 1 & 0x1F] = var1;
                    }
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 85) {
                class26 var2 = new class26();
                var2.field644 = client.field331.method2350();
                var2.field641 = client.field331.method2322();
                int var3 = client.field331.method2324();
                var2.field642 = var3;
                client.method158(45);
                field328.method2802();
                field328 = null;
                class32.method726(var2);
                client.field523 = -1;
                return false;
            }
            if (client.field523 == 221 || client.field523 == 216 || client.field523 == 181 || client.field523 == 186 || client.field523 == 177 || client.field523 == 156 || client.field523 == 13 || client.field523 == 98 || client.field523 == 73 || client.field523 == 1) {
                client.method2241();
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 198) {
                int var4 = client.field331.method2382();
                if (var4 == 65535) {
                    var4 = -1;
                }
                if (var4 == -1 && !client.field340) {
                    field2944.method3348();
                    class183.field2943 = 1;
                    field2942 = null;
                } else if (var4 != -1 && client.field538 != var4 && client.field522 != 0 && !client.field340) {
                    class168 var5 = field264;
                    int var6 = client.field522;
                    class183.field2943 = 1;
                    field2942 = var5;
                    field2945 = var4;
                    field1229 = 0;
                    field31 = var6;
                    field2946 = false;
                    field1865 = 2;
                }
                client.field538 = var4;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 130) {
                int var7 = client.field331.method2360();
                int var8 = client.field331.method2354();
                if (var8 == 65535) {
                    var8 = -1;
                }
                if (client.field522 != 0 && var8 != -1) {
                    class183.method3635(field117, var8, 0, client.field522, false);
                    client.field340 = true;
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 2) {
                int var9 = client.field331.method2323();
                int var10 = client.field331.method2304();
                class173 var11 = class173.method81(var10);
                if (var11.field2814 != var9 || var9 == -1) {
                    var11.field2814 = var9;
                    var11.field2739 = 0;
                    var11.field2862 = 0;
                    client.method2930(var11);
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 201) {
                client.field553 = 1;
                client.field478 = client.field470;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 120) {
                String var12 = client.field331.method2350();
                field3118 = var12;
                try {
                    String var13 = field3128.getParameter(class190.field3051.field3054);
                    String var14 = field3128.getParameter(class190.field3045.field3054);
                    String var15 = var13 + "settings=" + var12 + "; version=1; path=/; domain=" + var14;
                    String var16;
                    if (var12.length() == 0) {
                        var16 = var15 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var16 = var15 + "; Expires=" + class111.method2011(class115.method2007() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    class132.method2655(field3128, "document.cookie=\"" + var16 + "\"");
                } catch (Throwable var317) {
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 127) {
                client.field503 = client.field331.method2320();
                client.field504 = client.field331.method2320();
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 61) {
                int var18 = client.field331.method2382();
                int var19 = client.field331.method2304();
                class176.field2894[var18] = var19;
                if (class176.field2896[var18] != var19) {
                    class176.field2896[var18] = var19;
                    client.method2979(var18);
                }
                client.field471[++client.field472 - 1 & 0x1F] = var18;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 244) {
                boolean var20 = client.field331.method2320() == 1;
                if (var20) {
                    field2700 = class115.method2007() - client.field331.method2325();
                    field162 = new class221(client.field331, true);
                } else {
                    field162 = null;
                }
                client.field481 = client.field470;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 65) {
                int var21 = client.field331.method2322();
                byte var22 = client.field331.method2430();
                class176.field2894[var21] = var22;
                if (class176.field2896[var21] != var22) {
                    class176.field2896[var21] = var22;
                    client.method2979(var21);
                }
                client.field471[++client.field472 - 1 & 0x1F] = var21;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 45) {
                for (int var23 = 0; var23 < client.field407.length; var23++) {
                    if (client.field407[var23] != null) {
                        client.field407[var23].field848 = -1;
                    }
                }
                for (int var24 = 0; var24 < client.field326.length; var24++) {
                    if (client.field326[var24] != null) {
                        client.field326[var24].field848 = -1;
                    }
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 238) {
                int var25 = client.field444 + client.field331.field1988;
                int var26 = client.field331.method2322();
                int var27 = client.field331.method2322();
                if (client.field422 != var26) {
                    client.field422 = var26;
                    int var28 = client.field422;
                    int var29 = field999;
                    int var30 = field1605;
                    if (class173.method2942(var28)) {
                        client.method1937(field2793[var28], -1, var29, var30, false);
                    }
                    client.method697(client.field422);
                    class37.method77(client.field422);
                    for (int var31 = 0; var31 < 100; var31++) {
                        client.field554[var31] = true;
                    }
                }
                while (var27-- > 0) {
                    int var32 = client.field331.method2324();
                    int var33 = client.field331.method2322();
                    int var34 = client.field331.method2320();
                    class4 var35 = (class4) client.field446.method3519((long) var32);
                    if (var35 != null && var35.field60 != var33) {
                        client.method184(var35, true);
                        var35 = null;
                    }
                    if (var35 == null) {
                        class4 var36 = new class4();
                        var36.field60 = var33;
                        var36.field64 = var34;
                        client.field446.method3513(var36, (long) var32);
                        client.method697(var33);
                        class173 var37 = class173.method81(var32);
                        client.method2930(var37);
                        if (client.field449 != null) {
                            client.method2930(client.field449);
                            client.field449 = null;
                        }
                        client.method175();
                        client.method2255(field2793[var32 >> 16], var37, false);
                        class37.method77(var33);
                        if (client.field422 != -1) {
                            int var38 = client.field422;
                            if (class173.method2942(var38)) {
                                client.method698(field2793[var38], 1);
                            }
                        }
                        var35 = var36;
                    }
                    var35.field61 = true;
                }
                for (class4 var40 = (class4) client.field446.method3515(); var40 != null; var40 = (class4) client.field446.method3516()) {
                    if (var40.field61) {
                        var40.field61 = false;
                    } else {
                        client.method184(var40, true);
                    }
                }
                client.field423 = new class196(512);
                while (client.field331.field1988 < var25) {
                    int var41 = client.field331.method2324();
                    int var42 = client.field331.method2322();
                    int var43 = client.field331.method2322();
                    int var44 = client.field331.method2324();
                    for (int var45 = var42; var45 <= var43; var45++) {
                        long var46 = ((long) var41 << 32) + (long) var45;
                        client.field423.method3513(new class201(var44), var46);
                    }
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 109) {
                int var48 = client.field331.method2324();
                int var49 = client.field331.method2324();
                class4 var50 = (class4) client.field446.method3519((long) var49);
                class4 var51 = (class4) client.field446.method3519((long) var48);
                if (var51 != null) {
                    client.method184(var51, var50 == null || var50.field60 != var51.field60);
                }
                if (var50 != null) {
                    var50.method3625();
                    client.field446.method3513(var50, (long) var48);
                }
                class173 var52 = class173.method81(var49);
                if (var52 != null) {
                    client.method2930(var52);
                }
                class173 var53 = class173.method81(var48);
                if (var53 != null) {
                    client.method2930(var53);
                    client.method2255(field2793[var53.field2741 >>> 16], var53, true);
                }
                if (client.field422 != -1) {
                    int var54 = client.field422;
                    if (class173.method2942(var54)) {
                        client.method698(field2793[var54], 1);
                    }
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 223) {
                class122 var55 = client.field331;
                int var56 = client.field444;
                class210 var57 = new class210();
                var57.field3104 = var55.method2320();
                var57.field3103 = var55.method2324();
                var57.field3105 = new int[var57.field3104];
                var57.field3106 = new int[var57.field3104];
                var57.field3110 = new Field[var57.field3104];
                var57.field3108 = new int[var57.field3104];
                var57.field3109 = new Method[var57.field3104];
                var57.field3107 = new byte[var57.field3104][][];
                for (int var58 = 0; var58 < var57.field3104; var58++) {
                    try {
                        int var59 = var55.method2320();
                        if (var59 == 0 || var59 == 1 || var59 == 2) {
                            String var60 = var55.method2350();
                            String var61 = var55.method2350();
                            int var62 = 0;
                            if (var59 == 1) {
                                var62 = var55.method2324();
                            }
                            var57.field3105[var58] = var59;
                            var57.field3108[var58] = var62;
                            if (method1746(var60).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var57.field3110[var58] = method1746(var60).getDeclaredField(var61);
                        } else if (var59 == 3 || var59 == 4) {
                            String var63 = var55.method2350();
                            String var64 = var55.method2350();
                            int var65 = var55.method2320();
                            String[] var66 = new String[var65];
                            for (int var67 = 0; var67 < var65; var67++) {
                                var66[var67] = var55.method2350();
                            }
                            String var68 = var55.method2350();
                            byte[][] var69 = new byte[var65][];
                            if (var59 == 3) {
                                for (int var70 = 0; var70 < var65; var70++) {
                                    int var71 = var55.method2324();
                                    var69[var70] = new byte[var71];
                                    var55.method2436(var69[var70], 0, var71);
                                }
                            }
                            var57.field3105[var58] = var59;
                            Class[] var72 = new Class[var65];
                            for (int var73 = 0; var73 < var65; var73++) {
                                var72[var73] = method1746(var66[var73]);
                            }
                            Class var74 = method1746(var68);
                            if (method1746(var63).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var75 = method1746(var63).getDeclaredMethods();
                            Method[] var76 = var75;
                            for (int var77 = 0; var77 < var76.length; var77++) {
                                Method var78 = var76[var77];
                                if (var78.getName().equals(var64)) {
                                    Class[] var79 = var78.getParameterTypes();
                                    if (var72.length == var79.length) {
                                        boolean var80 = true;
                                        for (int var81 = 0; var81 < var72.length; var81++) {
                                            if (var72[var81] != var79[var81]) {
                                                var80 = false;
                                                break;
                                            }
                                        }
                                        if (var80 && var74 == var78.getReturnType()) {
                                            var57.field3109[var58] = var78;
                                        }
                                    }
                                }
                            }
                            var57.field3107[var58] = var69;
                        }
                    } catch (ClassNotFoundException var319) {
                        var57.field3106[var58] = -1;
                    } catch (SecurityException var320) {
                        var57.field3106[var58] = -2;
                    } catch (NullPointerException var321) {
                        var57.field3106[var58] = -3;
                    } catch (Exception var322) {
                        var57.field3106[var58] = -4;
                    } catch (Throwable var323) {
                        var57.field3106[var58] = -5;
                    }
                }
                class211.field3114.method3585(var57);
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 47) {
                client.field464 = client.field331.method2382() * 30;
                client.field482 = client.field470;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 220) {
                String var87 = client.field331.method2350();
                int var88 = client.field331.method2322();
                byte var89 = client.field331.method2425();
                boolean var90 = false;
                if (var89 == -128) {
                    var90 = true;
                }
                if (var90) {
                    if (field2229 == 0) {
                        client.field523 = -1;
                        return true;
                    }
                    boolean var91 = false;
                    int var92;
                    for (var92 = 0; var92 < field2229 && (!field174[var92].field621.equals(var87) || field174[var92].field623 != var88); var92++) {
                    }
                    if (var92 < field2229) {
                        while (var92 < field2229 - 1) {
                            field174[var92] = field174[var92 + 1];
                            var92++;
                        }
                        field2229--;
                        field174[field2229] = null;
                    }
                } else {
                    client.field331.method2350();
                    class25 var93 = new class25();
                    var93.field621 = var87;
                    var93.field622 = class164.method188(var93.field621, field195);
                    var93.field623 = var88;
                    var93.field624 = var89;
                    int var94;
                    for (var94 = field2229 - 1; var94 >= 0; var94--) {
                        int var95 = field174[var94].field622.compareTo(var93.field622);
                        if (var95 == 0) {
                            field174[var94].field623 = var88;
                            field174[var94].field624 = var89;
                            if (var87.equals(field2683.field56)) {
                                field224 = var89;
                            }
                            client.field479 = client.field470;
                            client.field523 = -1;
                            return true;
                        }
                        if (var95 < 0) {
                            break;
                        }
                    }
                    if (field2229 >= field174.length) {
                        client.field523 = -1;
                        return true;
                    }
                    for (int var96 = field2229 - 1; var96 > var94; var96--) {
                        field174[var96 + 1] = field174[var96];
                    }
                    if (field2229 == 0) {
                        field174 = new class25[100];
                    }
                    field174[var94 + 1] = var93;
                    field2229++;
                    if (var87.equals(field2683.field56)) {
                        field224 = var89;
                    }
                }
                client.field479 = client.field470;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 28) {
                int var97 = client.field331.method2438();
                int var98 = client.field331.method2382();
                if (var98 == 65535) {
                    var98 = -1;
                }
                int var99 = client.field331.method2304();
                class173 var100 = class173.method81(var97);
                if (var100.field2740) {
                    var100.field2859 = var98;
                    var100.field2860 = var99;
                    class52 var102 = class52.method2933(var98);
                    var100.field2790 = var102.field1130;
                    var100.field2791 = var102.field1131;
                    var100.field2865 = var102.field1114;
                    var100.field2864 = var102.field1133;
                    var100.field2789 = var102.field1134;
                    var100.field2871 = var102.field1129;
                    if (var102.field1135 == 1) {
                        var100.field2797 = 1;
                    } else {
                        var100.field2797 = 2;
                    }
                    if (var100.field2794 > 0) {
                        var100.field2871 = var100.field2871 * 32 / var100.field2794;
                    } else if (var100.field2748 > 0) {
                        var100.field2871 = var100.field2871 * 32 / var100.field2748;
                    }
                    client.method2930(var100);
                } else if (var98 == -1) {
                    var100.field2782 = 0;
                    client.field523 = -1;
                    return true;
                } else {
                    class52 var101 = class52.method2933(var98);
                    var100.field2782 = 4;
                    var100.field2783 = var98;
                    var100.field2790 = var101.field1130;
                    var100.field2791 = var101.field1131;
                    var100.field2871 = var101.field1129 * 100 / var99;
                    client.method2930(var100);
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 135) {
                String var103 = client.field331.method2350();
                long var104 = client.field331.method2325();
                long var106 = (long) client.field331.method2322();
                long var108 = (long) client.field331.method2487();
                class152 var110 = (class152) class109.method706(class152.method2254(), client.field331.method2320());
                long var111 = (var106 << 32) + var108;
                boolean var113 = false;
                for (int var114 = 0; var114 < 100; var114++) {
                    if (client.field306[var114] == var111) {
                        var113 = true;
                        break;
                    }
                }
                if (var110.field2249 && client.method741(var103)) {
                    var113 = true;
                }
                if (!var113 && client.field406 == 0) {
                    client.field306[client.field507] = var111;
                    client.field507 = (client.field507 + 1) % 100;
                    String var115 = class223.method3730(class163.method2741(class222.method630(client.field331)));
                    if (var110.field2259 == -1) {
                        class12.method1038(9, var103, var115, method187(var104));
                    } else {
                        int var116 = var110.field2259;
                        String var117 = "<img=" + var116 + ">";
                        class12.method1038(9, var117 + var103, var115, method187(var104));
                    }
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 132) {
                client.method2023();
                client.field462 = client.field331.method2320();
                client.field482 = client.field470;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 207) {
                field2085 = client.field331.method2320();
                field779 = client.field331.method2345();
                while (client.field331.field1988 < client.field444) {
                    client.field523 = client.field331.method2320();
                    client.method2241();
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 59) {
                client.field533 = true;
                field1790 = client.field331.method2320();
                field589 = client.field331.method2320();
                field192 = client.field331.method2322();
                field1070 = client.field331.method2320();
                field863 = client.field331.method2320();
                if (field863 >= 100) {
                    field1619 = field1790 * 128 + 64;
                    field701 = field589 * 128 + 64;
                    field630 = client.method4(field1619, field701, field880) - field192;
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 24) {
                int var118 = client.field331.method2304();
                class173 var119 = class173.method81(var118);
                var119.field2782 = 3;
                var119.field2783 = field2683.field32.method3233();
                client.method2930(var119);
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 67) {
                client.method2658(true);
                client.field331.method2579();
                int var120 = client.field331.method2322();
                class33.method2676(client.field331, var120);
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 9) {
                int var121 = client.field331.method2417();
                int var122 = client.field331.method2304();
                int var123 = client.field331.method2322();
                class4 var124 = (class4) client.field446.method3519((long) var122);
                if (var124 != null) {
                    client.method184(var124, var124.field60 != var123);
                }
                class4 var125 = new class4();
                var125.field60 = var123;
                var125.field64 = var121;
                client.field446.method3513(var125, (long) var122);
                client.method697(var123);
                class173 var126 = class173.method81(var122);
                client.method2930(var126);
                if (client.field449 != null) {
                    client.method2930(client.field449);
                    client.field449 = null;
                }
                client.method175();
                client.method2255(field2793[var122 >> 16], var126, false);
                class37.method77(var123);
                if (client.field422 != -1) {
                    int var127 = client.field422;
                    if (class173.method2942(var127)) {
                        client.method698(field2793[var127], 1);
                    }
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 180) {
                int var128 = client.field331.method2364();
                class173 var129 = class173.method81(var128);
                for (int var130 = 0; var130 < var129.field2857.length; var130++) {
                    var129.field2857[var130] = -1;
                    var129.field2857[var130] = 0;
                }
                client.method2930(var129);
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 225) {
                while (client.field331.field1988 < client.field444) {
                    int var131 = client.field331.method2320();
                    boolean var132 = (var131 & 0x1) == 1;
                    String var133 = client.field331.method2350();
                    String var134 = client.field331.method2350();
                    client.field331.method2350();
                    for (int var135 = 0; var135 < client.field317; var135++) {
                        class8 var136 = client.field557[var135];
                        if (var132) {
                            if (var134.equals(var136.field135)) {
                                var136.field135 = var133;
                                var136.field128 = var134;
                                var133 = null;
                                break;
                            }
                        } else if (var133.equals(var136.field135)) {
                            var136.field135 = var133;
                            var136.field128 = var134;
                            var133 = null;
                            break;
                        }
                    }
                    if (var133 != null && client.field317 < 400) {
                        class8 var137 = new class8();
                        client.field557[client.field317] = var137;
                        var137.field135 = var133;
                        var137.field128 = var134;
                        client.field317++;
                    }
                }
                client.field478 = client.field470;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 83) {
                String var138 = client.field331.method2350();
                int var139 = client.field331.method2345();
                int var140 = client.field331.method2320();
                if (var139 >= 1 && var139 <= 8) {
                    if (var138.equalsIgnoreCase("null")) {
                        var138 = null;
                    }
                    client.field414[var139 - 1] = var138;
                    client.field415[var139 - 1] = var140 == 0;
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 86) {
                client.method2658(false);
                client.field331.method2579();
                int var141 = client.field331.method2322();
                class33.method2676(client.field331, var141);
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 79) {
                field2085 = client.field331.method2417();
                field779 = client.field331.method2320();
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 82) {
                int var142 = client.field331.method2322();
                int var143 = client.field331.method2364();
                class173 var144 = class173.method81(var143);
                if (var144.field2782 != 2 || var144.field2783 != var142) {
                    var144.field2782 = 2;
                    var144.field2783 = var142;
                    client.method2930(var144);
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 203) {
                int var145 = client.field331.method2304();
                String var146 = client.field331.method2350();
                class173 var147 = class173.method81(var145);
                if (!var146.equals(var147.field2799)) {
                    var147.field2799 = var146;
                    client.method2930(var147);
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 70) {
                int var148 = client.field331.method2304();
                int var149 = client.field331.method2409();
                class173 var150 = class173.method81(var148);
                if (var150.field2782 != 1 || var150.field2783 != var149) {
                    var150.field2782 = 1;
                    var150.field2783 = var149;
                    client.method2930(var150);
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 229) {
                String var151 = client.field331.method2350();
                long var152 = (long) client.field331.method2322();
                long var154 = (long) client.field331.method2487();
                class152 var156 = (class152) class109.method706(class152.method2254(), client.field331.method2320());
                long var157 = (var152 << 32) + var154;
                boolean var159 = false;
                for (int var160 = 0; var160 < 100; var160++) {
                    if (client.field306[var160] == var157) {
                        var159 = true;
                        break;
                    }
                }
                if (client.method741(var151)) {
                    var159 = true;
                }
                if (!var159 && client.field406 == 0) {
                    client.field306[client.field507] = var157;
                    client.field507 = (client.field507 + 1) % 100;
                    class122 var161 = client.field331;
                    String var165;
                    try {
                        int var162 = var161.method2332();
                        if (var162 > 32767) {
                            var162 = 32767;
                        }
                        byte[] var163 = new byte[var162];
                        var161.field1988 += field2633.method2249(var161.field1989, var161.field1988, var163, 0, var162);
                        String var164 = class165.method2020(var163, 0, var162);
                        var165 = var164;
                    } catch (Exception var316) {
                        var165 = "Cabbage";
                    }
                    String var168 = class223.method3730(class163.method2741(var165));
                    byte var169;
                    if (var156.field2255) {
                        var169 = 7;
                    } else {
                        var169 = 3;
                    }
                    if (var156.field2259 == -1) {
                        class12.method2263(var169, var151, var168);
                    } else {
                        int var171 = var156.field2259;
                        String var172 = "<img=" + var171 + ">";
                        class12.method2263(var169, var172 + var151, var168);
                    }
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 21) {
                client.field479 = client.field470;
                if (client.field444 == 0) {
                    client.field512 = null;
                    client.field513 = null;
                    field2229 = 0;
                    field174 = null;
                    client.field523 = -1;
                    return true;
                }
                client.field513 = client.field331.method2350();
                long var173 = client.field331.method2325();
                client.field512 = class162.method2009(var173);
                field1658 = client.field331.method2425();
                int var175 = client.field331.method2320();
                if (var175 == 255) {
                    client.field523 = -1;
                    return true;
                }
                field2229 = var175;
                class25[] var176 = new class25[100];
                for (int var177 = 0; var177 < field2229; var177++) {
                    var176[var177] = new class25();
                    var176[var177].field621 = client.field331.method2350();
                    var176[var177].field622 = class164.method188(var176[var177].field621, field195);
                    var176[var177].field623 = client.field331.method2322();
                    var176[var177].field624 = client.field331.method2425();
                    client.field331.method2350();
                    if (var176[var177].field621.equals(field2683.field56)) {
                        field224 = var176[var177].field624;
                    }
                }
                boolean var178 = false;
                int var179 = field2229;
                while (var179 > 0) {
                    boolean var180 = true;
                    var179--;
                    for (int var181 = 0; var181 < var179; var181++) {
                        if (var176[var181].field622.compareTo(var176[var181 + 1].field622) > 0) {
                            class25 var182 = var176[var181];
                            var176[var181] = var176[var181 + 1];
                            var176[var181 + 1] = var182;
                            var180 = false;
                        }
                    }
                    if (var180) {
                        break;
                    }
                }
                field174 = var176;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 37) {
                client.method2023();
                client.field451 = client.field331.method2323();
                client.field482 = client.field470;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 93) {
                client.field519 = client.field331.method2320();
                if (client.field519 == 255) {
                    client.field519 = 0;
                }
                client.field520 = client.field331.method2320();
                if (client.field520 == 255) {
                    client.field520 = 0;
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 20) {
                int var183 = client.field331.method2324();
                class4 var184 = (class4) client.field446.method3519((long) var183);
                if (var184 != null) {
                    client.method184(var184, true);
                }
                if (client.field449 != null) {
                    client.method2930(client.field449);
                    client.field449 = null;
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 248) {
                field2085 = client.field331.method2345();
                field779 = client.field331.method2356();
                for (int var185 = field2085; var185 < field2085 + 8; var185++) {
                    for (int var186 = field779; var186 < field779 + 8; var186++) {
                        if (client.field418[field880][var185][var186] != null) {
                            client.field418[field880][var185][var186] = null;
                            client.method2634(var185, var186);
                        }
                    }
                }
                for (class17 var187 = (class17) client.field499.method3546(); var187 != null; var187 = (class17) client.field499.method3548()) {
                    if (var187.field227 >= field2085 && var187.field227 < field2085 + 8 && var187.field228 >= field779 && var187.field228 < field779 + 8 && field880 == var187.field237) {
                        var187.field236 = 0;
                    }
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 189) {
                client.method2924();
                client.field523 = -1;
                return false;
            }
            if (client.field523 == 163) {
                client.field541 = client.field331.method2320();
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 200) {
                client.method625(true);
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 118) {
                int var188 = client.field331.method2324();
                int var189 = client.field331.method2322();
                if (var188 < -70000) {
                    var189 += 32768;
                }
                class173 var190;
                if (var188 >= 0) {
                    var190 = class173.method81(var188);
                } else {
                    var190 = null;
                }
                if (var190 != null) {
                    for (int var191 = 0; var191 < var190.field2857.length; var191++) {
                        var190.field2857[var191] = 0;
                        var190.field2732[var191] = 0;
                    }
                }
                class16.method2022(var189);
                int var192 = client.field331.method2322();
                for (int var193 = 0; var193 < var192; var193++) {
                    int var194 = client.field331.method2417();
                    if (var194 == 255) {
                        var194 = client.field331.method2438();
                    }
                    int var195 = client.field331.method2354();
                    if (var190 != null && var193 < var190.field2857.length) {
                        var190.field2857[var193] = var195;
                        var190.field2732[var193] = var194;
                    }
                    class16.method626(var189, var193, var195 - 1, var194);
                }
                if (var190 != null) {
                    client.method2930(var190);
                }
                client.method2023();
                client.field375[++client.field332 - 1 & 0x1F] = var189 & 0x7FFF;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 164) {
                int var196 = client.field331.method2364();
                int var197 = client.field331.method2354();
                int var198 = var197 >> 10 & 0x1F;
                int var199 = var197 >> 5 & 0x1F;
                int var200 = var197 & 0x1F;
                int var201 = (var200 << 3) + (var198 << 19) + (var199 << 11);
                class173 var202 = class173.method81(var196);
                if (var202.field2766 != var201) {
                    var202.field2766 = var201;
                    client.method2930(var202);
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 230) {
                int var203 = client.field331.method2320();
                int var204 = client.field331.method2320();
                int var205 = client.field331.method2320();
                int var206 = client.field331.method2320();
                client.field534[var203] = true;
                client.field535[var203] = var204;
                client.field417[var203] = var205;
                client.field293[var203] = var206;
                client.field390[var203] = 0;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 252) {
                boolean var207 = client.field331.method2356() == 1;
                int var208 = client.field331.method2438();
                class173 var209 = class173.method81(var208);
                if (var209.field2761 != var207) {
                    var209.field2761 = var207;
                    client.method2930(var209);
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 77) {
                int var210 = client.field331.method2324();
                int var211 = client.field331.method2322();
                if (var210 < -70000) {
                    var211 += 32768;
                }
                class173 var212;
                if (var210 >= 0) {
                    var212 = class173.method81(var210);
                } else {
                    var212 = null;
                }
                while (client.field331.field1988 < client.field444) {
                    int var213 = client.field331.method2332();
                    int var214 = client.field331.method2322();
                    int var215 = 0;
                    if (var214 != 0) {
                        var215 = client.field331.method2320();
                        if (var215 == 255) {
                            var215 = client.field331.method2324();
                        }
                    }
                    if (var212 != null && var213 >= 0 && var213 < var212.field2857.length) {
                        var212.field2857[var213] = var214;
                        var212.field2732[var213] = var215;
                    }
                    class16.method626(var211, var213, var214 - 1, var215);
                }
                if (var212 != null) {
                    client.method2930(var212);
                }
                client.method2023();
                client.field375[++client.field332 - 1 & 0x1F] = var211 & 0x7FFF;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 106) {
                client.field303 = client.field331.method2320();
                if (client.field303 == 1) {
                    client.field304 = client.field331.method2322();
                }
                if (client.field303 >= 2 && client.field303 <= 6) {
                    if (client.field303 == 2) {
                        client.field408 = 64;
                        client.field310 = 64;
                    }
                    if (client.field303 == 3) {
                        client.field408 = 0;
                        client.field310 = 64;
                    }
                    if (client.field303 == 4) {
                        client.field408 = 128;
                        client.field310 = 64;
                    }
                    if (client.field303 == 5) {
                        client.field408 = 64;
                        client.field310 = 0;
                    }
                    if (client.field303 == 6) {
                        client.field408 = 64;
                        client.field310 = 128;
                    }
                    client.field303 = 2;
                    client.field333 = client.field331.method2322();
                    client.field307 = client.field331.method2322();
                    client.field393 = client.field331.method2320();
                }
                if (client.field303 == 10) {
                    client.field305 = client.field331.method2322();
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 205) {
                int var216 = client.field331.method2320();
                if (client.field331.method2320() == 0) {
                    client.field349[var216] = new class220();
                    client.field331.field1988 += 18;
                } else {
                    client.field331.field1988--;
                    client.field349[var216] = new class220(client.field331, false);
                }
                client.field571 = client.field470;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 133) {
                client.field533 = true;
                field1872 = client.field331.method2320();
                field794 = client.field331.method2320();
                field1598 = client.field331.method2322();
                field1395 = client.field331.method2320();
                field753 = client.field331.method2320();
                if (field753 >= 100) {
                    int var217 = field1872 * 128 + 64;
                    int var218 = field794 * 128 + 64;
                    int var219 = client.method4(var217, var218, field880) - field1598;
                    int var220 = var217 - field1619;
                    int var221 = var219 - field630;
                    int var222 = var218 - field701;
                    int var223 = (int) Math.sqrt((double) (var220 * var220 + var222 * var222));
                    field651 = (int) (Math.atan2((double) var221, (double) var223) * 325.949D) & 0x7FF;
                    field1007 = (int) (Math.atan2((double) var220, (double) var222) * -325.949D) & 0x7FF;
                    if (field651 < 128) {
                        field651 = 128;
                    }
                    if (field651 > 383) {
                        field651 = 383;
                    }
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 34) {
                for (int var224 = 0; var224 < field1170; var224++) {
                    class53 var225 = class53.method2941(var224);
                    if (var225 != null) {
                        class176.field2894[var224] = 0;
                        class176.field2896[var224] = 0;
                    }
                }
                client.method2023();
                client.field472 += 32;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 147) {
                client.field533 = false;
                for (int var226 = 0; var226 < 5; var226++) {
                    client.field534[var226] = false;
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 150) {
                int var227 = client.field331.method2322();
                int var228 = client.field331.method2320();
                int var229 = client.field331.method2322();
                client.method2923(var227, var228, var229);
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 78) {
                field251 = class130.method755(client.field331.method2320());
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 7) {
                if (client.field422 != -1) {
                    int var230 = client.field422;
                    if (class173.method2942(var230)) {
                        client.method698(field2793[var230], 0);
                    }
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 199) {
                int var231 = client.field331.method2322();
                int var232 = client.field331.method2304();
                class173 var233 = class173.method81(var232);
                if (var233 != null && var233.field2743 == 0) {
                    if (var231 > var233.field2765 - var233.field2757) {
                        var231 = var233.field2765 - var233.field2757;
                    }
                    if (var231 < 0) {
                        var231 = 0;
                    }
                    if (var233.field2763 != var231) {
                        var233.field2763 = var231;
                        client.method2930(var233);
                    }
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 126) {
                int var234 = client.field331.method2324();
                int var235 = client.field331.method2382();
                int var236 = client.field331.method2409();
                class173 var237 = class173.method81(var234);
                var237.field2795 = (var236 << 16) + var235;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 76) {
                client.method625(false);
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 235) {
                client.field331.field1988 += 28;
                if (client.field331.method2515()) {
                    class149.method2712(client.field331, client.field331.field1988 - 28);
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 35) {
                int var238 = client.field331.method2324();
                int var239 = client.field331.method2324();
                if (field95 == null || !field95.isValid()) {
                    try {
                        Iterator var240 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var240.hasNext()) {
                            GarbageCollectorMXBean var241 = (GarbageCollectorMXBean) var240.next();
                            if (var241.isValid()) {
                                field95 = var241;
                                client.field337 = -1L;
                                client.field469 = -1L;
                            }
                        }
                    } catch (Throwable var318) {
                    }
                }
                long var243 = class115.method2007();
                int var245 = -1;
                if (field95 != null) {
                    long var246 = field95.getCollectionTime();
                    if (client.field469 != -1L) {
                        long var248 = var246 - client.field469;
                        long var250 = var243 - client.field337;
                        if (var250 != 0L) {
                            var245 = (int) (var248 * 100L / var250);
                        }
                    }
                    client.field469 = var246;
                    client.field337 = var243;
                }
                client.field329.method2565(106);
                client.field329.method2305(client.field2197);
                client.field329.method2342(var245);
                client.field329.method2361(var238);
                client.field329.method2363(var239);
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 169) {
                String var252 = client.field331.method2350();
                String var253 = class223.method3730(class163.method2741(class222.method630(client.field331)));
                class12.method2263(6, var252, var253);
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 170) {
                String var254 = client.field331.method2350();
                Object[] var255 = new Object[var254.length() + 1];
                for (int var256 = var254.length() - 1; var256 >= 0; var256--) {
                    if (var254.charAt(var256) == 's') {
                        var255[var256 + 1] = client.field331.method2350();
                    } else {
                        var255[var256 + 1] = Integer.valueOf(client.field331.method2324());
                    }
                }
                var255[0] = Integer.valueOf(client.field331.method2324());
                class1 var257 = new class1();
                var257.field6 = var255;
                class37.method2637(var257);
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 81) {
                int var258 = client.field331.method2304();
                field2282 = field1935.method2715(var258);
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 107) {
                int var259 = client.field331.method2354();
                class16.method2559(var259);
                client.field375[++client.field332 - 1 & 0x1F] = var259 & 0x7FFF;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 75) {
                class33.method2676(client.field331, client.field444);
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 52) {
                int var260 = client.field331.method2438();
                int var261 = client.field331.method2438();
                int var262 = client.field331.method2354();
                if (var262 == 65535) {
                    var262 = -1;
                }
                int var263 = client.field331.method2382();
                if (var263 == 65535) {
                    var263 = -1;
                }
                for (int var264 = var262; var264 <= var263; var264++) {
                    long var265 = ((long) var260 << 32) + (long) var264;
                    class208 var267 = client.field423.method3519(var265);
                    if (var267 != null) {
                        var267.method3625();
                    }
                    client.field423.method3513(new class201(var261), var265);
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 149) {
                int var268 = client.field331.method2324();
                int var269 = client.field331.method2382();
                int var270 = client.field331.method2409();
                int var271 = client.field331.method2382();
                class173 var272 = class173.method81(var268);
                if (var272.field2790 != var271 || var272.field2791 != var269 || var272.field2871 != var270) {
                    var272.field2790 = var271;
                    var272.field2791 = var269;
                    var272.field2871 = var270;
                    client.method2930(var272);
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 211) {
                client.method2023();
                int var273 = client.field331.method2417();
                int var274 = client.field331.method2345();
                int var275 = client.field331.method2304();
                client.field440[var274] = var275;
                client.field379[var274] = var273;
                client.field392[var274] = 1;
                for (int var276 = 0; var276 < 98; var276++) {
                    if (var275 >= class155.field2281[var276]) {
                        client.field392[var274] = var276 + 2;
                    }
                }
                client.field381[++client.field476 - 1 & 0x1F] = var274;
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 226) {
                int var277 = client.field331.method2358();
                int var278 = client.field331.method2364();
                int var279 = client.field331.method2357();
                class173 var280 = class173.method81(var278);
                if (var280.field2848 != var279 || var280.field2751 != var277 || var280.field2832 != 0 || var280.field2780 != 0) {
                    var280.field2848 = var279;
                    var280.field2751 = var277;
                    var280.field2832 = 0;
                    var280.field2780 = 0;
                    client.method2930(var280);
                    client.method1748(var280);
                    if (var280.field2743 == 0) {
                        client.method2255(field2793[var278 >> 16], var280, false);
                    }
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 148) {
                int var281 = client.field331.method2332();
                boolean var282 = client.field331.method2320() == 1;
                String var283 = "";
                boolean var284 = false;
                if (var282) {
                    var283 = client.field331.method2350();
                    if (client.method741(var283)) {
                        var284 = true;
                    }
                }
                String var285 = client.field331.method2350();
                if (!var284) {
                    class12.method2263(var281, var283, var285);
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 116) {
                while (client.field331.field1988 < client.field444) {
                    boolean var286 = client.field331.method2320() == 1;
                    String var287 = client.field331.method2350();
                    String var288 = client.field331.method2350();
                    int var289 = client.field331.method2322();
                    int var290 = client.field331.method2320();
                    int var291 = client.field331.method2320();
                    boolean var292 = (var291 & 0x2) != 0;
                    boolean var293 = (var291 & 0x1) != 0;
                    if (var289 > 0) {
                        client.field331.method2350();
                        client.field331.method2320();
                        client.field331.method2324();
                    }
                    client.field331.method2350();
                    for (int var294 = 0; var294 < client.field552; var294++) {
                        class18 var295 = client.field426[var294];
                        if (var286) {
                            if (var288.equals(var295.field244)) {
                                var295.field244 = var287;
                                var295.field245 = var288;
                                var287 = null;
                                break;
                            }
                        } else if (var287.equals(var295.field244)) {
                            if (var295.field243 != var289) {
                                boolean var296 = true;
                                for (class39 var297 = (class39) client.field555.method3501(); var297 != null; var297 = (class39) client.field555.method3502()) {
                                    if (var297.field878.equals(var287)) {
                                        if (var289 != 0 && var297.field881 == 0) {
                                            var297.method3624();
                                            var296 = false;
                                        } else if (var289 == 0 && var297.field881 != 0) {
                                            var297.method3624();
                                            var296 = false;
                                        }
                                    }
                                }
                                if (var296) {
                                    client.field555.method3500(new class39(var287, var289));
                                }
                                var295.field243 = var289;
                            }
                            var295.field245 = var288;
                            var295.field247 = var290;
                            var295.field254 = var292;
                            var295.field246 = var293;
                            var287 = null;
                            break;
                        }
                    }
                    if (var287 != null && client.field552 < 400) {
                        class18 var298 = new class18();
                        client.field426[client.field552] = var298;
                        var298.field244 = var287;
                        var298.field245 = var288;
                        var298.field243 = var289;
                        var298.field247 = var290;
                        var298.field254 = var292;
                        var298.field246 = var293;
                        client.field552++;
                    }
                }
                client.field553 = 2;
                client.field478 = client.field470;
                boolean var299 = false;
                int var300 = client.field552;
                while (var300 > 0) {
                    boolean var301 = true;
                    var300--;
                    for (int var302 = 0; var302 < var300; var302++) {
                        boolean var303 = false;
                        class18 var304 = client.field426[var302];
                        class18 var305 = client.field426[var302 + 1];
                        if (client.field357 != var304.field243 && client.field357 == var305.field243) {
                            var303 = true;
                        }
                        if (!var303 && var304.field243 == 0 && var305.field243 != 0) {
                            var303 = true;
                        }
                        if (!var303 && !var304.field254 && var305.field254) {
                            var303 = true;
                        }
                        if (!var303 && !var304.field246 && var305.field246) {
                            var303 = true;
                        }
                        if (var303) {
                            class18 var306 = client.field426[var302];
                            client.field426[var302] = client.field426[var302 + 1];
                            client.field426[var302 + 1] = var306;
                            var301 = false;
                        }
                    }
                    if (var301) {
                        break;
                    }
                }
                client.field523 = -1;
                return true;
            }
            if (client.field523 == 99) {
                int var307 = client.field331.method2354();
                client.field422 = var307;
                int var308 = client.field422;
                int var309 = field999;
                int var310 = field1605;
                if (class173.method2942(var308)) {
                    client.method1937(field2793[var308], -1, var309, var310, false);
                }
                client.method697(var307);
                class37.method77(client.field422);
                for (int var311 = 0; var311 < 100; var311++) {
                    client.field554[var311] = true;
                }
                client.field523 = -1;
                return true;
            }
            class148.method2106("" + client.field523 + class2.field17 + client.field362 + class2.field17 + client.field338 + class2.field17 + client.field444, (Throwable) null);
            client.method2924();
        } catch (IOException var324) {
            client.method469();
        } catch (Exception var325) {
            String var314 = "" + client.field523 + class2.field17 + client.field362 + class2.field17 + client.field338 + class2.field17 + client.field444 + class2.field17 + (field77 + field2683.field871[0]) + class2.field17 + (field271 + field2683.field872[0]) + class2.field17;
            for (int var315 = 0; var315 < client.field444 && var315 < 50; var315++) {
                var314 = var314 + client.field331.field1989[var315] + class2.field17;
            }
            class148.method2106(var314, var325);
            client.method2924();
        }
        return true;
    }

    @ObfuscatedName("g.bg(ILjava/lang/String;I)V")
    public static void method174(int arg0, String arg1) {
        int var2 = class33.field761;
        int[] var3 = class33.field765;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = client.field407[var3[var5]];
            if (var6 != null && field2683 != var6 && var6.field56 != null && var6.field56.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    client.field329.method2565(42);
                    client.field329.method2342(0);
                    client.field329.method2352(var3[var5]);
                } else if (arg0 == 4) {
                    client.field329.method2565(157);
                    client.field329.method2353(var3[var5]);
                    client.field329.method2344(0);
                } else if (arg0 == 6) {
                    client.field329.method2565(49);
                    client.field329.method2305(0);
                    client.field329.method2513(var3[var5]);
                } else if (arg0 == 7) {
                    client.field329.method2565(87);
                    client.field329.method2352(var3[var5]);
                    client.field329.method2343(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method2263(4, "", class157.field2345 + arg1);
        }
    }

    @ObfuscatedName("ak.cn(III)Ljava/lang/String;")
    public static final String method809(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method3047(16711680);
        } else if (var2 < -6) {
            return class2.method3047(16723968);
        } else if (var2 < -3) {
            return class2.method3047(16740352);
        } else if (var2 < 0) {
            return class2.method3047(16756736);
        } else if (var2 > 9) {
            return class2.method3047(65280);
        } else if (var2 > 6) {
            return class2.method3047(4259584);
        } else if (var2 > 3) {
            return class2.method3047(8453888);
        } else if (var2 > 0) {
            return class2.method3047(12648192);
        } else {
            return class2.method3047(16776960);
        }
    }

    @ObfuscatedName("bj.cp([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1175(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("client.dj(Lfu;I)Z")
    public static final boolean method522(class173 arg0) {
        int var1 = arg0.field2745;
        if (var1 == 205) {
            client.field339 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            client.field558.method3231(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            client.field558.method3232(var4, var5 == 1);
        }
        if (var1 == 324) {
            client.field558.method3255(false);
        }
        if (var1 == 325) {
            client.field558.method3255(true);
        }
        if (var1 == 326) {
            client.field329.method2565(123);
            client.field558.method3234(client.field329);
            return true;
        } else {
            return false;
        }
    }
}
