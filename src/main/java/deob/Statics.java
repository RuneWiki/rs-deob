package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Desktop.Action;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Iterator;

public class Statics {

    @ObfuscatedName("ab.bd")
    public static int field1003;

    @ObfuscatedName("ab.a")
    public static int field1004;

    @ObfuscatedName("ab.n")
    public static class158 field1005;

    @ObfuscatedName("at.n")
    public static class158 field1015;

    @ObfuscatedName("at.dd")
    public static int field1020;

    @ObfuscatedName("at.ed")
    public static class74[] field1022;

    @ObfuscatedName("as.n")
    public static class158 field1024;

    @ObfuscatedName("as.r")
    public static int[] field1029;

    @ObfuscatedName("as.or")
    public static int field1034;

    @ObfuscatedName("af.n")
    public static class158 field1037;

    @ObfuscatedName("af.x")
    public static int[] field1047;

    @ObfuscatedName("af.ep")
    public static class74 field1050;

    @ObfuscatedName("aa.n")
    public static class158 field1056;

    @ObfuscatedName("aa.fk")
    public static int field1057;

    @ObfuscatedName("ad.i")
    public static int field1059;

    @ObfuscatedName("ad.w")
    public static class158 field1061;

    @ObfuscatedName("i.ag")
    public static int[] field108;

    @ObfuscatedName("ad.m")
    public static class76[] field1088;

    @ObfuscatedName("ai.f")
    public static int[] field1112;

    @ObfuscatedName("ai.o")
    public static int field1113;

    @ObfuscatedName("ai.n")
    public static class158 field1114;

    @ObfuscatedName("ak.n")
    public static class49 field1117;

    @ObfuscatedName("am.qs")
    public static int field1124;

    @ObfuscatedName("am.m")
    public static int field1125;

    @ObfuscatedName("am.w")
    public static boolean field1126;

    @ObfuscatedName("am.a")
    public static int field1141;

    @ObfuscatedName("am.h")
    public static class68 field1146;

    @ObfuscatedName("bb.eg")
    public static class74[] field1163;

    @ObfuscatedName("bb.ig")
    public static class164 field1167;

    @ObfuscatedName("bm.r")
    public static float field1192;

    @ObfuscatedName("bm.l")
    public static int field1193;

    @ObfuscatedName("r.mp")
    public static int field121;

    @ObfuscatedName("bt.f")
    public static int[] field1217;

    @ObfuscatedName("bt.e")
    public static int[] field1218;

    @ObfuscatedName("bt.z")
    public static boolean[] field1228;

    @ObfuscatedName("bg.r")
    public static int field1237;

    @ObfuscatedName("bg.x")
    public static class56[] field1238;

    @ObfuscatedName("r.k")
    public static class13 field124;

    @ObfuscatedName("bg.i")
    public static byte[] field1243;

    @ObfuscatedName("bg.an")
    public static int[] field1244;

    @ObfuscatedName("bg.l")
    public static int field1245;

    @ObfuscatedName("bg.f")
    public static int field1246;

    @ObfuscatedName("bg.z")
    public static class69[] field1248;

    @ObfuscatedName("bg.ag")
    public static float[] field1250;

    @ObfuscatedName("bg.q")
    public static class64[] field1251;

    @ObfuscatedName("bg.u")
    public static int[] field1253;

    @ObfuscatedName("bg.aq")
    public static float[] field1254;

    @ObfuscatedName("bg.b")
    public static boolean[] field1255;

    @ObfuscatedName("bg.k")
    public static float[] field1259;

    @ObfuscatedName("bg.y")
    public static float[] field1260;

    @ObfuscatedName("bg.c")
    public static float[] field1261;

    @ObfuscatedName("bg.g")
    public static float[] field1262;

    @ObfuscatedName("bg.e")
    public static int field1264;

    @ObfuscatedName("bg.v")
    public static class63[] field1266;

    @ObfuscatedName("bg.ao")
    public static int[] field1267;

    @ObfuscatedName("bg.av")
    public static float[] field1269;

    @ObfuscatedName("r.cr")
    public static char field130;

    @ObfuscatedName("bq.es")
    public static class74 field1300;

    @ObfuscatedName("bq.qn")
    public static Image field1302;

    @ObfuscatedName("bq.py")
    public static class9 field1306;

    @ObfuscatedName("bi.bx")
    public static String field1319;

    @ObfuscatedName("r.go")
    public static class164 field132;

    @ObfuscatedName("br.l")
    public static class145 field1324;

    @ObfuscatedName("bx.a")
    public static int field1327;

    @ObfuscatedName("bx.n")
    public static int field1328;

    @ObfuscatedName("bx.bm")
    public static class159 field1329;

    @ObfuscatedName("bx.w")
    public static int[] field1330;

    @ObfuscatedName("bx.m")
    public static int[] field1331;

    @ObfuscatedName("bx.o")
    public static int field1332;

    @ObfuscatedName("bw.v")
    public static int[] field1353;

    @ObfuscatedName("bw.q")
    public static int field1355;

    @ObfuscatedName("bw.x")
    public static int field1356;

    @ObfuscatedName("bn.q")
    public static int[] field1383;

    @ObfuscatedName("cs.j")
    public static int field1397;

    @ObfuscatedName("cs.k")
    public static int field1399;

    @ObfuscatedName("l.am")
    public static class159 field140;

    @ObfuscatedName("cs.bo")
    public static int field1401;

    @ObfuscatedName("l.bj")
    public static class159 field141;

    @ObfuscatedName("cs.u")
    public static int field1410;

    @ObfuscatedName("cs.t")
    public static int field1411;

    @ObfuscatedName("cs.s")
    public static int field1412;

    @ObfuscatedName("cs.p")
    public static int field1413;

    @ObfuscatedName("cs.d")
    public static int field1414;

    @ObfuscatedName("cs.c")
    public static int field1418;

    @ObfuscatedName("l.cf")
    public static int field142;

    @ObfuscatedName("cs.av")
    public static int field1420;

    @ObfuscatedName("cs.ag")
    public static int field1421;

    @ObfuscatedName("cs.aq")
    public static int field1422;

    @ObfuscatedName("cs.an")
    public static int field1423;

    @ObfuscatedName("cs.y")
    public static int field1432;

    @ObfuscatedName("cs.g")
    public static int field1436;

    @ObfuscatedName("cs.bv")
    public static boolean[][] field1449;

    @ObfuscatedName("cs.bl")
    public static int field1450;

    @ObfuscatedName("cs.bu")
    public static int field1451;

    @ObfuscatedName("cs.bm")
    public static int field1452;

    @ObfuscatedName("cs.ba")
    public static int field1454;

    @ObfuscatedName("cs.by")
    public static int field1455;

    @ObfuscatedName("cg.am")
    public static class76[] field1461;

    @ObfuscatedName("ci.et")
    public static class74[] field1479;

    @ObfuscatedName("ci.f")
    public static int field1482;

    @ObfuscatedName("cj.nx")
    public static int field1493;

    @ObfuscatedName("cj.a")
    public static long field1494;

    @ObfuscatedName("cj.q")
    public static String field1495;

    @ObfuscatedName("cq.y")
    public static int field1503;

    @ObfuscatedName("cq.e")
    public static int field1507;

    @ObfuscatedName("cq.z")
    public static int field1508;

    @ObfuscatedName("cq.c")
    public static int field1509;

    @ObfuscatedName("cq.d")
    public static int field1510;

    @ObfuscatedName("cq.j")
    public static int field1511;

    @ObfuscatedName("cq.ag")
    public static class87 field1516;

    @ObfuscatedName("cq.k")
    public static int field1517;

    @ObfuscatedName("cq.p")
    public static int field1518;

    @ObfuscatedName("cr.kl")
    public static class164[] field1522;

    @ObfuscatedName("cr.bj")
    public static class76[] field1530;

    @ObfuscatedName("cd.id")
    public static class164 field1535;

    @ObfuscatedName("cd.aa")
    public static class135 field1544;

    @ObfuscatedName("ct.el")
    public static class74[] field1560;

    @ObfuscatedName("n.bo")
    public static class159 field16;

    @ObfuscatedName("ck.d")
    public static String field1602;

    @ObfuscatedName("ck.p")
    public static int[] field1604;

    @ObfuscatedName("e.ps")
    public static Clipboard field161;

    @ObfuscatedName("ca.fo")
    public static int field1613;

    @ObfuscatedName("ca.pq")
    public static class212 field1616;

    @ObfuscatedName("e.i")
    public static int[] field163;

    @ObfuscatedName("e.t")
    public static int field167;

    @ObfuscatedName("co.i")
    public static byte[][][] field1691;

    @ObfuscatedName("co.dg")
    public static int[] field1695;

    @ObfuscatedName("cb.i")
    public static class144 field1697;

    @ObfuscatedName("cb.c")
    public static int[] field1698;

    @ObfuscatedName("z.cj")
    public static class135 field172;

    @ObfuscatedName("ce.bu")
    public static class159 field1720;

    @ObfuscatedName("z.nz")
    public static int field176;

    @ObfuscatedName("cp.bj")
    public static int field1779;

    @ObfuscatedName("cp.bf")
    public static int field1780;

    @ObfuscatedName("cp.bb")
    public static int field1781;

    @ObfuscatedName("cx.cd")
    public static int field1794;

    @ObfuscatedName("cx.em")
    public static class74[] field1795;

    @ObfuscatedName("cx.bc")
    public static int field1798;

    @ObfuscatedName("z.hs")
    public static int field181;

    @ObfuscatedName("z.z")
    public static class171 field183;

    @ObfuscatedName("cf.dc")
    public static int field1843;

    @ObfuscatedName("dj.qq")
    public static int field1848;

    @ObfuscatedName("dj.qy")
    public static Canvas field1850;

    @ObfuscatedName("dj.s")
    public static int[] field1854;

    @ObfuscatedName("dd.ak")
    public static class159 field1858;

    @ObfuscatedName("dd.ml")
    public static class23[] field1862;

    @ObfuscatedName("dc.o")
    public static long field1867;

    @ObfuscatedName("dc.n")
    public static long field1872;

    @ObfuscatedName("df.a")
    public static class158 field1873;

    @ObfuscatedName("df.rh")
    public static String field1876;

    @ObfuscatedName("dl.la")
    public static class122 field1888;

    @ObfuscatedName("v.nu")
    public static class51 field189;

    @ObfuscatedName("dl.x")
    public static class163 field1893;

    @ObfuscatedName("dg.ql")
    public static Frame field1896;

    @ObfuscatedName("v.f")
    public static class18 field190;

    @ObfuscatedName("dg.b")
    public static String[] field1903;

    @ObfuscatedName("dg.qw")
    public static int field1908;

    @ObfuscatedName("dv.qe")
    public static class125 field1914;

    @ObfuscatedName("dm.qp")
    public static int field1925;

    @ObfuscatedName("dh.ei")
    public static class76[] field1929;

    @ObfuscatedName("dh.h")
    public static int[] field1932;

    @ObfuscatedName("dh.x")
    public static class219[] field1933;

    @ObfuscatedName("ds.qd")
    public static int field1938;

    @ObfuscatedName("v.iz")
    public static int field194;

    @ObfuscatedName("dx.gu")
    public static class164 field1940;

    @ObfuscatedName("dx.w")
    public static String[] field1946;

    @ObfuscatedName("dr.c")
    public static int[] field1952;

    @ObfuscatedName("di.l")
    public static short[] field1963;

    @ObfuscatedName("dy.nh")
    public static int field1966;

    @ObfuscatedName("dy.qa")
    public static class73 field1967;

    @ObfuscatedName("dy.p")
    public static class111 field1970;

    @ObfuscatedName("dn.iy")
    public static int field1974;

    @ObfuscatedName("dn.od")
    public static int field1978;

    @ObfuscatedName("dk.qm")
    public static Font field1987;

    @ObfuscatedName("dk.o")
    public static File field1988;

    @ObfuscatedName("dk.ds")
    public static byte[][] field1992;

    @ObfuscatedName("dz.n")
    public static String field1994;

    @ObfuscatedName("dz.o")
    public static String field1995;

    @ObfuscatedName("dz.bf")
    public static class76 field2002;

    @ObfuscatedName("x.pp")
    public static class128 field202;

    @ObfuscatedName("ea.fd")
    public static int field2059;

    @ObfuscatedName("ee.cv")
    public static class138 field2066;

    @ObfuscatedName("eh.v")
    public static boolean field2071;

    @ObfuscatedName("eh.m")
    public static class158 field2074;

    @ObfuscatedName("eh.dy")
    public static int field2075;

    @ObfuscatedName("ek.bt")
    public static class159 field2089;

    @ObfuscatedName("q.im")
    public static class29 field210;

    @ObfuscatedName("ef.fi")
    public static int field2121;

    @ObfuscatedName("ef.o")
    public static String field2122;

    @ObfuscatedName("ef.n")
    public static Applet field2123;

    @ObfuscatedName("em.m")
    public static File field2128;

    @ObfuscatedName("em.h")
    public static int field2131;

    @ObfuscatedName("em.u")
    public static String[] field2132;

    @ObfuscatedName("em.q")
    public static int field2137;

    @ObfuscatedName("em.j")
    public static String field2138;

    @ObfuscatedName("em.pw")
    public static long field2140;

    @ObfuscatedName("ed.dm")
    public static int[] field2143;

    @ObfuscatedName("q.ma")
    public static byte field215;

    @ObfuscatedName("ed.v")
    public static int[] field2150;

    @ObfuscatedName("et.az")
    public static class159 field2173;

    @ObfuscatedName("b.kv")
    public static int field225;

    @ObfuscatedName("b.hi")
    public static int field230;

    @ObfuscatedName("b.dr")
    public static class81 field231;

    @ObfuscatedName("u.ay")
    public static boolean field240;

    @ObfuscatedName("u.bl")
    public static class159 field241;

    @ObfuscatedName("u.ew")
    public static class74[] field242;

    @ObfuscatedName("u.bf")
    public static FontMetrics field248;

    @ObfuscatedName("ei.v")
    public static class55 field2490;

    @ObfuscatedName("eq.nr")
    public static int field2493;

    @ObfuscatedName("eq.i")
    public static short[] field2499;

    @ObfuscatedName("o.ic")
    public static int field25;

    @ObfuscatedName("t.ce")
    public static class215 field251;

    @ObfuscatedName("eu.f")
    public static short[][] field2537;

    @ObfuscatedName("ec.nd")
    public static class70 field2547;

    @ObfuscatedName("ev.eq")
    public static class76[] field2549;

    @ObfuscatedName("ex.w")
    public static File field2561;

    @ObfuscatedName("fc.cp")
    public static class215 field2567;

    @ObfuscatedName("fc.o")
    public static class158 field2568;

    @ObfuscatedName("fd.nm")
    public static class52 field2577;

    @ObfuscatedName("t.pa")
    public static class151 field258;

    @ObfuscatedName("fd.fy")
    public static int field2590;

    @ObfuscatedName("fd.ba")
    public static class159 field2593;

    @ObfuscatedName("t.ix")
    public static int field260;

    @ObfuscatedName("fy.e")
    public static class215 field2608;

    @ObfuscatedName("fo.iv")
    public static int field2616;

    @ObfuscatedName("fl.b")
    public static class111 field2633;

    @ObfuscatedName("fl.n")
    public static class135 field2637;

    @ObfuscatedName("t.by")
    public static class159 field264;

    @ObfuscatedName("fq.o")
    public static boolean[] field2648;

    @ObfuscatedName("fq.a")
    public static class158 field2649;

    @ObfuscatedName("t.kf")
    public static int field265;

    @ObfuscatedName("fq.m")
    public static class158 field2651;

    @ObfuscatedName("fq.h")
    public static class158 field2652;

    @ObfuscatedName("client.o")
    public static client field267;

    @ObfuscatedName("fq.n")
    public static class164[][] field2695;

    @ObfuscatedName("fq.w")
    public static class158 field2743;

    @ObfuscatedName("client.b")
    public static String field276;

    @ObfuscatedName("fm.ci")
    public static class135 field2796;

    @ObfuscatedName("fa.pr")
    public static class126 field2808;

    @ObfuscatedName("fv.r")
    public static class76 field2809;

    @ObfuscatedName("fn.e")
    public static boolean field2819;

    @ObfuscatedName("fz.r")
    public static short[][] field2826;

    @ObfuscatedName("fz.ak")
    public static class74[] field2831;

    @ObfuscatedName("fb.mk")
    public static byte field2841;

    @ObfuscatedName("fb.p")
    public static String field2843;

    @ObfuscatedName("ft.l")
    public static int field2859;

    @ObfuscatedName("ft.o")
    public static class158 field2860;

    @ObfuscatedName("ft.a")
    public static class158 field2861;

    @ObfuscatedName("ft.w")
    public static class175 field2862;

    @ObfuscatedName("ft.n")
    public static class158 field2865;

    @ObfuscatedName("ft.h")
    public static class158 field2866;

    @ObfuscatedName("ft.r")
    public static int field2867;

    @ObfuscatedName("ft.i")
    public static int field2868;

    @ObfuscatedName("fg.fn")
    public static int field2913;

    @ObfuscatedName("fw.ab")
    public static int field2975;

    @ObfuscatedName("client.af")
    public static class138 field300;

    @ObfuscatedName("client.aw")
    public static long field303;

    @ObfuscatedName("gl.l")
    public static class76[] field3035;

    @ObfuscatedName("gq.bp")
    public static class159 field3050;

    @ObfuscatedName("hc.z")
    public static class164 field3066;

    @ObfuscatedName("hk.ef")
    public static class76[] field3078;

    @ObfuscatedName("hq.n")
    public static class105 field3081;

    @ObfuscatedName("hv.f")
    public static class76[] field3092;

    @ObfuscatedName("hl.h")
    public static class74 field3109;

    @ObfuscatedName("hz.ae")
    public static class138 field3139;

    @ObfuscatedName("hp.g")
    public static int[] field3141;

    @ObfuscatedName("hp.h")
    public static boolean field3142;

    @ObfuscatedName("client.er")
    public static class74[] field315;

    @ObfuscatedName("client.f")
    public static class203 field329;

    @ObfuscatedName("client.bg")
    public static class159 field338;

    @ObfuscatedName("a.hv")
    public static class3 field37;

    @ObfuscatedName("a.oo")
    public static int field41;

    @ObfuscatedName("client.u")
    public static int field458;

    @ObfuscatedName("a.eb")
    public static class74[] field50;

    @ObfuscatedName("client.bb")
    public static class159 field544;

    @ObfuscatedName("s.j")
    public static int[] field554;

    @ObfuscatedName("s.l")
    public static byte[][] field559;

    @ObfuscatedName("s.e")
    public static class76 field561;

    @ObfuscatedName("w.cm")
    public static int field57;

    @ObfuscatedName("p.gj")
    public static class164 field570;

    @ObfuscatedName("m.h")
    public static byte[][][] field60;

    @ObfuscatedName("m.pt")
    public static short[] field61;

    @ObfuscatedName("y.d")
    public static int[] field616;

    @ObfuscatedName("y.bw")
    public static int field622;

    @ObfuscatedName("c.cb")
    public static class215 field639;

    @ObfuscatedName("m.kd")
    public static class123 field64;

    @ObfuscatedName("c.kg")
    public static int field643;

    @ObfuscatedName("g.qt")
    public static int field648;

    @ObfuscatedName("g.dx")
    public static byte[][] field649;

    @ObfuscatedName("g.dh")
    public static int[][] field652;

    @ObfuscatedName("g.av")
    public static int[] field653;

    @ObfuscatedName("av.pd")
    public static int field659;

    @ObfuscatedName("av.hh")
    public static int field665;

    @ObfuscatedName("ag.q")
    public static int[][][] field677;

    @ObfuscatedName("ag.bs")
    public static class159 field682;

    @ObfuscatedName("ag.qf")
    public static int field683;

    @ObfuscatedName("aq.qx")
    public static int field696;

    @ObfuscatedName("an.f")
    public static class76 field697;

    @ObfuscatedName("an.a")
    public static class76 field699;

    @ObfuscatedName("an.w")
    public static class76 field700;

    @ObfuscatedName("an.i")
    public static class74 field701;

    @ObfuscatedName("h.m")
    public static byte[][][] field71;

    @ObfuscatedName("an.n")
    public static boolean field719;

    @ObfuscatedName("h.r")
    public static byte[][][] field72;

    @ObfuscatedName("an.az")
    public static class76[] field720;

    @ObfuscatedName("an.nf")
    public static int field723;

    @ObfuscatedName("an.mu")
    public static class74 field729;

    @ObfuscatedName("h.l")
    public static int[][] field73;

    @ObfuscatedName("an.hr")
    public static int field730;

    @ObfuscatedName("ao.m")
    public static class24[] field736;

    @ObfuscatedName("aj.a")
    public static int field742;

    @ObfuscatedName("h.z")
    public static int[] field75;

    @ObfuscatedName("h.e")
    public static int[] field76;

    @ObfuscatedName("ac.e")
    public static class164 field763;

    @ObfuscatedName("ac.a")
    public static int[] field765;

    @ObfuscatedName("al.dv")
    public static int[] field793;

    @ObfuscatedName("al.oh")
    public static int field818;

    @ObfuscatedName("al.ih")
    public static int field836;

    @ObfuscatedName("au.bv")
    public static class159 field837;

    @ObfuscatedName("h.w")
    public static byte[][][] field84;

    @ObfuscatedName("au.at")
    public static String field840;

    @ObfuscatedName("ap.o")
    public static class158 field847;

    @ObfuscatedName("ap.be")
    public static int field869;

    @ObfuscatedName("h.nw")
    public static int field87;

    @ObfuscatedName("ap.fc")
    public static int field875;

    @ObfuscatedName("ap.n")
    public static class158 field883;

    @ObfuscatedName("ap.rg")
    public static boolean field888;

    @ObfuscatedName("ar.du")
    public static int field919;

    @ObfuscatedName("ah.ng")
    public static class52 field941;

    @ObfuscatedName("ah.pf")
    public static int field948;

    @ObfuscatedName("ah.n")
    public static class158 field949;

    @ObfuscatedName("ae.o")
    public static class158 field953;

    @ObfuscatedName("ae.a")
    public static class158 field954;

    @ObfuscatedName("ae.n")
    public static class158 field959;

    @ObfuscatedName("ay.n")
    public static class158 field981;

    @ObfuscatedName("ay.o")
    public static class158 field982;

    @ObfuscatedName("ay.pl")
    public static int field989;

    @ObfuscatedName("ab.o")
    public static class158 field997;

    @ObfuscatedName("ao.a(II)Z")
    public static boolean method616(int arg0) {
        return (arg0 >> 29 & 0x1) != 0;
    }

    @ObfuscatedName("dw.w(I)[Lel;")
    public static class145[] method2663() {
        return new class145[] { class145.field2179, class145.field2182, class145.field2178, class145.field2180, class145.field2181, class145.field2183 };
    }

    @ObfuscatedName("fq.w(B)[Leb;")
    public static class143[] method3070() {
        return new class143[] { class143.field2159, class143.field2163, class143.field2153, class143.field2154, class143.field2156 };
    }

    @ObfuscatedName("fl.a(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method3031(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            class130.method2537(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (class130.field2032.startsWith("win") && !arg3) {
            class130.method2537(arg0, 0);
            return;
        }
        if (class130.field2032.startsWith("mac")) {
            class130.method2657(arg0, 1, arg2);
            return;
        }
        class130.method2537(arg0, 2);
    }

    @ObfuscatedName("at.o(II)Lae;")
    public static class40 method860(int arg0) {
        class40 var1 = (class40) class40.field955.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field959.method2925(12, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method758(new class111(var2));
        }
        var3.method760();
        class40.field955.method3372(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fl.o(IIIII)V")
    public static final void method3040(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = arg1; var4 <= arg1 + arg3; var4++) {
            for (int var5 = arg0; var5 <= arg0 + arg2; var5++) {
                if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
                    field72[0][var5][var4] = 127;
                    if (arg0 == var5 && var5 > 0) {
                        class6.field79[0][var5][var4] = class6.field79[0][var5 - 1][var4];
                    }
                    if (arg0 + arg2 == var5 && var5 < 103) {
                        class6.field79[0][var5][var4] = class6.field79[0][var5 + 1][var4];
                    }
                    if (arg1 == var4 && var4 > 0) {
                        class6.field79[0][var5][var4] = class6.field79[0][var5][var4 - 1];
                    }
                    if (arg1 + arg3 == var4 && var4 < 103) {
                        class6.field79[0][var5][var4] = class6.field79[0][var5][var4 + 1];
                    }
                }
            }
        }
    }

    @ObfuscatedName("ah.m(IIB)I")
    public static int method753(int arg0, int arg1) {
        int var2 = arg0 >>> 31;
        return (arg0 + var2) / arg1 - var2;
    }

    @ObfuscatedName("dy.a([Ly;II[I[II)V")
    public static void method2570(class24[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class24 var8 = arg0[var7];
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
                        var11 = arg0[var6].field619;
                        var12 = var8.field619;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field611;
                        var12 = var8.field611;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method527() ? 1 : 0;
                        var12 = var8.method527() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field613;
                        var12 = var8.field613;
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
                        var15 = arg0[var5].field619;
                        var16 = var8.field619;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field611;
                        var16 = var8.field611;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method527() ? 1 : 0;
                        var16 = var8.method527() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field613;
                        var16 = var8.field613;
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
                class24 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2570(arg0, arg1, var6, arg3, arg4);
        method2570(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("df.r(Ljava/lang/String;B)I")
    public static int method2179(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("dc.m(Ldl;IIIIIII)V")
    public static final void method2174(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2234();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2234();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2234();
                }
            }
            return;
        }
        class6.field68[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2234();
            if (var7 == 0) {
                if (arg1 == 0) {
                    class6.field79[0][arg2][arg3] = -class6.method89(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    class6.field79[arg1][arg2][arg3] = class6.field79[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2234();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    class6.field79[0][arg2][arg3] = -var8 * 8;
                } else {
                    class6.field79[arg1][arg2][arg3] = class6.field79[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                field71[arg1][arg2][arg3] = arg0.method2235();
                field60[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                field1691[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                class6.field68[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                field84[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("al.x(Lfd;III)Z")
    public static boolean method658(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2925(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            class72.method1465(var3);
            return true;
        }
    }

    @ObfuscatedName("client.o(Len;I)V")
    public static void method186(class136 arg0) {
        if (!class30.field725) {
            if ((class132.field2055 == 1 || !field240 && class132.field2055 == 4) && class132.field2043 >= class30.field698 + 765 - 50 && class132.field2057 >= 453) {
                field1306.field137 = !field1306.field137;
                class9.method2700();
                if (field1306.field137) {
                    class174.method3018();
                } else {
                    class174.method25(field241, "scape main", "", 255, false);
                }
            }
            if (client.field278 != 5) {
                class30.field709++;
                if (client.field278 == 10 || client.field278 == 11) {
                    if (client.field275 == 0) {
                        if (class132.field2055 == 1 || !field240 && class132.field2055 == 4) {
                            int var6 = class30.field698 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class132.field2043 >= var6 && class132.field2043 <= var6 + var8 && class132.field2057 >= var7 && class132.field2057 <= var7 + var9) {
                                if (class24.method2602()) {
                                    class30.field725 = true;
                                }
                                return;
                            }
                        }
                        if (field190 != null && class24.method2602()) {
                            class30.field725 = true;
                        }
                    }
                    int var10 = class132.field2055;
                    int var11 = class132.field2043;
                    int var12 = class132.field2057;
                    if (!field240 && var10 == 4) {
                        var10 = 1;
                    }
                    if (class30.field713 == 0) {
                        int var13 = class30.field703 + 180 - 80;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            class130.method2884(client.method2("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var15 = class30.field703 + 180 + 80;
                        if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field270 & 0x4) != 0) {
                                if ((client.field270 & 0x400) == 0) {
                                    class30.field714 = class148.field2299;
                                    class30.field715 = class148.field2383;
                                    class30.field716 = class148.field2429;
                                } else {
                                    class30.field714 = class148.field2433;
                                    class30.field715 = class148.field2367;
                                    class30.field716 = class148.field2435;
                                }
                                class30.field713 = 1;
                                class30.field721 = 0;
                            } else if ((client.field270 & 0x400) == 0) {
                                class30.field714 = class148.field2423;
                                class30.field715 = class148.field2424;
                                class30.field716 = class148.field2425;
                                class30.field713 = 2;
                                class30.field721 = 0;
                            } else {
                                class30.field714 = class148.field2430;
                                class30.field715 = class148.field2431;
                                class30.field716 = class148.field2350;
                                class30.field713 = 1;
                                class30.field721 = 0;
                            }
                        }
                    } else if (class30.field713 == 1) {
                        while (class129.method1146()) {
                            if (field1794 == 84) {
                                class30.field714 = class148.field2423;
                                class30.field715 = class148.field2424;
                                class30.field716 = class148.field2425;
                                class30.field713 = 2;
                                class30.field721 = 0;
                            } else if (field1794 == 13) {
                                class30.field713 = 0;
                            }
                        }
                        int var16 = class30.field703 + 180 - 80;
                        short var17 = 321;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            class30.field714 = class148.field2423;
                            class30.field715 = class148.field2424;
                            class30.field716 = class148.field2425;
                            class30.field713 = 2;
                            class30.field721 = 0;
                        }
                        int var18 = class30.field703 + 180 + 80;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            class30.field713 = 0;
                        }
                    } else if (class30.field713 == 2) {
                        short var19 = 231;
                        int var37 = var19 + 30;
                        if (var10 == 1 && var12 >= var37 - 15 && var12 < var37) {
                            class30.field721 = 0;
                        }
                        var37 += 15;
                        if (var10 == 1 && var12 >= var37 - 15 && var12 < var37) {
                            class30.field721 = 1;
                        }
                        var37 += 15;
                        short var20 = 361;
                        if (var10 == 1 && var12 >= var20 - 15 && var12 < var20) {
                            class30.method735(class148.field2454, class148.field2351, class148.field2456);
                            class30.field713 = 5;
                            return;
                        }
                        int var21 = class30.field703 + 180 - 80;
                        short var22 = 321;
                        if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            class30.field711 = class30.field711.trim();
                            if (class30.field711.length() == 0) {
                                class30.method735(class148.field2329, class148.field2332, class148.field2330);
                                return;
                            }
                            if (class30.field718.length() == 0) {
                                class30.method735(class148.field2272, class148.field2333, class148.field2334);
                                return;
                            }
                            class30.method735(class148.field2438, class148.field2439, class148.field2440);
                            class30.field724 = field1306.field139.containsKey(class154.method3042(class30.field711)) ? class150.field2495 : class150.field2498;
                            client.method2920(20);
                            return;
                        }
                        int var23 = class30.field703 + 180 + 80;
                        if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            class30.field713 = 0;
                            class30.field711 = "";
                            class30.field718 = "";
                            field2975 = 0;
                            field840 = "";
                            class30.field731 = true;
                        }
                        while (true) {
                            while (class129.method1146()) {
                                boolean var24 = false;
                                for (int var25 = 0; var25 < class30.field704.length(); var25++) {
                                    if (field130 == class30.field704.charAt(var25)) {
                                        var24 = true;
                                        break;
                                    }
                                }
                                if (field1794 == 13) {
                                    class30.field713 = 0;
                                    class30.field711 = "";
                                    class30.field718 = "";
                                    field2975 = 0;
                                    field840 = "";
                                    class30.field731 = true;
                                } else if (class30.field721 == 0) {
                                    if (field1794 == 85 && class30.field711.length() > 0) {
                                        class30.field711 = class30.field711.substring(0, class30.field711.length() - 1);
                                    }
                                    if (field1794 == 84 || field1794 == 80) {
                                        class30.field721 = 1;
                                    }
                                    if (var24 && class30.field711.length() < 320) {
                                        class30.field711 = class30.field711 + field130;
                                    }
                                } else if (class30.field721 == 1) {
                                    if (field1794 == 85 && class30.field718.length() > 0) {
                                        class30.field718 = class30.field718.substring(0, class30.field718.length() - 1);
                                    }
                                    if (field1794 == 84 || field1794 == 80) {
                                        class30.field721 = 0;
                                    }
                                    if (field1794 == 84) {
                                        class30.field711 = class30.field711.trim();
                                        if (class30.field711.length() == 0) {
                                            class30.method735(class148.field2329, class148.field2332, class148.field2330);
                                            return;
                                        }
                                        if (class30.field718.length() == 0) {
                                            class30.method735(class148.field2272, class148.field2333, class148.field2334);
                                            return;
                                        }
                                        class30.method735(class148.field2438, class148.field2439, class148.field2440);
                                        class30.field724 = field1306.field139.containsKey(class154.method3042(class30.field711)) ? class150.field2495 : class150.field2498;
                                        client.method2920(20);
                                        return;
                                    }
                                    if (var24 && class30.field718.length() < 20) {
                                        class30.field718 = class30.field718 + field130;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (class30.field713 == 4) {
                        int var26 = class30.field703 + 180 - 80;
                        short var27 = 321;
                        if (var10 == 1 && var11 >= var26 - 75 && var11 <= var26 + 75 && var12 >= var27 - 20 && var12 <= var27 + 20) {
                            field840.trim();
                            if (field840.length() != 6) {
                                class30.method735(class148.field2347, class148.field2246, class148.field2393);
                                return;
                            }
                            field2975 = Integer.parseInt(field840);
                            field840 = "";
                            class30.field724 = class30.field731 ? class150.field2502 : class150.field2496;
                            class30.method735(class148.field2438, class148.field2439, class148.field2440);
                            client.method2920(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= class30.field703 + 180 - 9 && var11 <= class30.field703 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            class30.field731 = !class30.field731;
                        }
                        if (var10 == 1 && var11 >= class30.field703 + 180 - 34 && var11 <= class30.field703 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            class130.method2884(client.method2("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var28 = class30.field703 + 180 + 80;
                        if (var10 == 1 && var11 >= var28 - 75 && var11 <= var28 + 75 && var12 >= var27 - 20 && var12 <= var27 + 20) {
                            class30.field713 = 0;
                            class30.field711 = "";
                            class30.field718 = "";
                            field2975 = 0;
                            field840 = "";
                        }
                        while (class129.method1146()) {
                            boolean var29 = false;
                            for (int var30 = 0; var30 < class30.field710.length(); var30++) {
                                if (field130 == class30.field710.charAt(var30)) {
                                    var29 = true;
                                    break;
                                }
                            }
                            if (field1794 == 13) {
                                class30.field713 = 0;
                                class30.field711 = "";
                                class30.field718 = "";
                                field2975 = 0;
                                field840 = "";
                            } else {
                                if (field1794 == 85 && field840.length() > 0) {
                                    field840 = field840.substring(0, field840.length() - 1);
                                }
                                if (field1794 == 84) {
                                    field840.trim();
                                    if (field840.length() != 6) {
                                        class30.method735(class148.field2347, class148.field2246, class148.field2393);
                                        return;
                                    }
                                    field2975 = Integer.parseInt(field840);
                                    field840 = "";
                                    class30.field724 = class30.field731 ? class150.field2502 : class150.field2496;
                                    class30.method735(class148.field2438, class148.field2439, class148.field2440);
                                    client.method2920(20);
                                    return;
                                }
                                if (var29 && field840.length() < 6) {
                                    field840 = field840 + field130;
                                }
                            }
                        }
                    } else if (class30.field713 == 5) {
                        int var31 = class30.field703 + 180 - 80;
                        short var32 = 321;
                        if (var10 == 1 && var11 >= var31 - 75 && var11 <= var31 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            class30.method1136();
                            return;
                        }
                        int var33 = class30.field703 + 180 + 80;
                        if (var10 == 1 && var11 >= var33 - 75 && var11 <= var33 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            class30.field714 = class148.field2423;
                            class30.field715 = class148.field2424;
                            class30.field716 = class148.field2425;
                            class30.field713 = 2;
                            class30.field721 = 0;
                            class30.field718 = "";
                        }
                        while (class129.method1146()) {
                            boolean var34 = false;
                            for (int var35 = 0; var35 < class30.field704.length(); var35++) {
                                if (field130 == class30.field704.charAt(var35)) {
                                    var34 = true;
                                    break;
                                }
                            }
                            if (field1794 == 13) {
                                class30.field714 = class148.field2423;
                                class30.field715 = class148.field2424;
                                class30.field716 = class148.field2425;
                                class30.field713 = 2;
                                class30.field721 = 0;
                                class30.field718 = "";
                            } else {
                                if (field1794 == 85 && class30.field711.length() > 0) {
                                    class30.field711 = class30.field711.substring(0, class30.field711.length() - 1);
                                }
                                if (field1794 == 84) {
                                    class30.method1136();
                                    return;
                                }
                                if (var34 && class30.field711.length() < 320) {
                                    class30.field711 = class30.field711 + field130;
                                }
                            }
                        }
                    } else if (class30.field713 == 6) {
                        while (true) {
                            do {
                                if (!class129.method1146()) {
                                    short var36 = 321;
                                    if (var10 == 1 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                                        class30.field714 = class148.field2423;
                                        class30.field715 = class148.field2424;
                                        class30.field716 = class148.field2425;
                                        class30.field713 = 2;
                                        class30.field721 = 0;
                                        class30.field718 = "";
                                    }
                                    return;
                                }
                            } while (field1794 != 84 && field1794 != 13);
                            class30.field714 = class148.field2423;
                            class30.field715 = class148.field2424;
                            class30.field716 = class148.field2425;
                            class30.field713 = 2;
                            class30.field721 = 0;
                            class30.field718 = "";
                        }
                    }
                }
            }
        } else if (class132.field2055 == 1 || !field240 && class132.field2055 == 4) {
            int var1 = class30.field698 + 280;
            if (class132.field2043 >= var1 && class132.field2043 <= var1 + 14 && class132.field2057 >= 4 && class132.field2057 <= 18) {
                class24.method1697(0, 0);
            } else if (class132.field2043 >= var1 + 15 && class132.field2043 <= var1 + 80 && class132.field2057 >= 4 && class132.field2057 <= 18) {
                class24.method1697(0, 1);
            } else {
                int var2 = class30.field698 + 390;
                if (class132.field2043 >= var2 && class132.field2043 <= var2 + 14 && class132.field2057 >= 4 && class132.field2057 <= 18) {
                    class24.method1697(1, 0);
                } else if (class132.field2043 >= var2 + 15 && class132.field2043 <= var2 + 80 && class132.field2057 >= 4 && class132.field2057 <= 18) {
                    class24.method1697(1, 1);
                } else {
                    int var3 = class30.field698 + 500;
                    if (class132.field2043 >= var3 && class132.field2043 <= var3 + 14 && class132.field2057 >= 4 && class132.field2057 <= 18) {
                        class24.method1697(2, 0);
                    } else if (class132.field2043 >= var3 + 15 && class132.field2043 <= var3 + 80 && class132.field2057 >= 4 && class132.field2057 <= 18) {
                        class24.method1697(2, 1);
                    } else {
                        int var4 = class30.field698 + 610;
                        if (class132.field2043 >= var4 && class132.field2043 <= var4 + 14 && class132.field2057 >= 4 && class132.field2057 <= 18) {
                            class24.method1697(3, 0);
                        } else if (class132.field2043 >= var4 + 15 && class132.field2043 <= var4 + 80 && class132.field2057 >= 4 && class132.field2057 <= 18) {
                            class24.method1697(3, 1);
                        } else if (class132.field2043 >= class30.field698 + 708 && class132.field2057 >= 4 && class132.field2043 <= class30.field698 + 708 + 50 && class132.field2057 <= 20) {
                            class30.field725 = false;
                            field3109.method1526(class30.field698, 0);
                            field701.method1526(class30.field698 + 382, 0);
                            field2809.method1669(class30.field698 + 382 - field2809.field1366 / 2, 18);
                        } else if (class30.field726 != -1) {
                            class24 var5 = field736[class30.field726];
                            class30.method2182(var5);
                            class30.field725 = false;
                            field3109.method1526(class30.field698, 0);
                            field701.method1526(class30.field698 + 382, 0);
                            field2809.method1669(class30.field698 + 382 - field2809.field1366 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.z(II)I")
    public static int method573(int arg0) {
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("g.l(Lhe;Lhe;B)V")
    public static void method572(class215 arg0, class215 arg1) {
        if (field2831 == null) {
            field2831 = class72.method4(field1329, "sl_back", "");
        }
        if (field720 == null) {
            field720 = class72.method2158(field1329, "sl_flags", "");
        }
        if (field1461 == null) {
            field1461 = class72.method2158(field1329, "sl_arrows", "");
        }
        if (field1530 == null) {
            field1530 = class72.method2158(field1329, "sl_stars", "");
        }
        class75.method1605(class30.field698, 23, 765, 480, 0);
        class75.method1606(class30.field698, 0, 125, 23, 12425273, 9135624);
        class75.method1606(class30.field698 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3705(class148.field2475, class30.field698 + 62, 15, 0, -1);
        if (field1530 != null) {
            field1530[1].method1669(class30.field698 + 140, 1);
            arg1.method3640(class148.field2476, class30.field698 + 152, 10, 16777215, -1);
            field1530[0].method1669(class30.field698 + 140, 12);
            arg1.method3640(class148.field2477, class30.field698 + 152, 21, 16777215, -1);
        }
        if (field1461 != null) {
            int var2 = class30.field698 + 280;
            if (class24.field612[0] == 0 && class24.field615[0] == 0) {
                field1461[2].method1669(var2, 4);
            } else {
                field1461[0].method1669(var2, 4);
            }
            if (class24.field612[0] == 0 && class24.field615[0] == 1) {
                field1461[3].method1669(var2 + 15, 4);
            } else {
                field1461[1].method1669(var2 + 15, 4);
            }
            arg0.method3640(class148.field2478, var2 + 32, 17, 16777215, -1);
            int var3 = class30.field698 + 390;
            if (class24.field612[0] == 1 && class24.field615[0] == 0) {
                field1461[2].method1669(var3, 4);
            } else {
                field1461[0].method1669(var3, 4);
            }
            if (class24.field612[0] == 1 && class24.field615[0] == 1) {
                field1461[3].method1669(var3 + 15, 4);
            } else {
                field1461[1].method1669(var3 + 15, 4);
            }
            arg0.method3640(class148.field2479, var3 + 32, 17, 16777215, -1);
            int var4 = class30.field698 + 500;
            if (class24.field612[0] == 2 && class24.field615[0] == 0) {
                field1461[2].method1669(var4, 4);
            } else {
                field1461[0].method1669(var4, 4);
            }
            if (class24.field612[0] == 2 && class24.field615[0] == 1) {
                field1461[3].method1669(var4 + 15, 4);
            } else {
                field1461[1].method1669(var4 + 15, 4);
            }
            arg0.method3640(class148.field2480, var4 + 32, 17, 16777215, -1);
            int var5 = class30.field698 + 610;
            if (class24.field612[0] == 3 && class24.field615[0] == 0) {
                field1461[2].method1669(var5, 4);
            } else {
                field1461[0].method1669(var5, 4);
            }
            if (class24.field612[0] == 3 && class24.field615[0] == 1) {
                field1461[3].method1669(var5 + 15, 4);
            } else {
                field1461[1].method1669(var5 + 15, 4);
            }
            arg0.method3640(class148.field2281, var5 + 32, 17, 16777215, -1);
        }
        class75.method1605(class30.field698 + 708, 4, 50, 16, 0);
        arg1.method3705(class148.field2401, class30.field698 + 708 + 25, 16, 16777215, -1);
        int var6 = 0;
        int var7 = 33554432;
        int var8 = client.field270 & var7;
        for (int var9 = 0; var9 < class24.field621; var9++) {
            class24 var10 = field736[var9];
            if ((var10.field614 & var7) == var8 || (var10.field614 & var7) == 0) {
                var6++;
            }
        }
        class30.field726 = -1;
        if (field2831 != null) {
            byte var11 = 88;
            byte var12 = 19;
            int var13 = 765 / (var11 + 1);
            int var14 = 480 / (var12 + 1);
            int var15;
            int var16;
            do {
                var15 = var14;
                var16 = var13;
                if ((var13 - 1) * var14 >= var6) {
                    var13--;
                }
                if ((var14 - 1) * var13 >= var6) {
                    var14--;
                }
                if ((var14 - 1) * var13 >= var6) {
                    var14--;
                }
            } while (var14 != var15 || var13 != var16);
            int var17 = (765 - var11 * var13) / (var13 + 1);
            if (var17 > 5) {
                var17 = 5;
            }
            int var18 = (480 - var12 * var14) / (var14 + 1);
            if (var18 > 5) {
                var18 = 5;
            }
            int var19 = (765 - var11 * var13 - (var13 - 1) * var17) / 2;
            int var20 = (480 - var12 * var14 - (var14 - 1) * var18) / 2;
            int var21 = var20 + 23;
            int var22 = class30.field698 + var19;
            int var23 = 0;
            boolean var24 = false;
            for (int var25 = 0; var25 < class24.field621; var25++) {
                class24 var26 = field736[var25];
                if ((var26.field614 & var7) == var8 || (var26.field614 & var7) == 0) {
                    boolean var27 = true;
                    String var28 = Integer.toString(var26.field611);
                    if (var26.field611 == -1) {
                        var28 = class148.field2340;
                        var27 = false;
                    } else if (var26.field611 > 1980) {
                        var28 = class148.field2308;
                        var27 = false;
                    }
                    byte var29;
                    if (var26.method529()) {
                        if (var26.method527()) {
                            var29 = 3;
                        } else {
                            var29 = 2;
                        }
                    } else if (var26.method527()) {
                        var29 = 1;
                    } else {
                        var29 = 0;
                    }
                    if (class132.field2049 >= var22 && class132.field2050 >= var21 && class132.field2049 < var11 + var22 && class132.field2050 < var12 + var21 && var27) {
                        class30.field726 = var25;
                        field2831[var29].method1532(var22, var21, 128, 16777215);
                        var24 = true;
                    } else {
                        field2831[var29].method1526(var22, var21);
                    }
                    if (field720 != null) {
                        field720[(var26.method527() ? 8 : 0) + var26.field620].method1669(var22 + 29, var21);
                    }
                    arg0.method3705(Integer.toString(var26.field613), var22 + 15, var12 / 2 + var21 + 5, 0, -1);
                    arg1.method3705(var28, var22 + 60, var12 / 2 + var21 + 5, 268435455, -1);
                    var21 += var12 + var18;
                    var23++;
                    if (var23 >= var14) {
                        var21 = var20 + 23;
                        var22 += var11 + var17;
                        var23 = 0;
                    }
                }
            }
            if (var24) {
                int var30 = arg1.method3635(field736[class30.field726].field617) + 6;
                int var31 = arg1.field3100 + 8;
                class75.method1605(class132.field2049 - var30 / 2, class132.field2050 + 20 + 5, var30, var31, 16777120);
                class75.method1607(class132.field2049 - var30 / 2, class132.field2050 + 20 + 5, var30, var31, 0);
                arg1.method3705(field736[class30.field726].field617, class132.field2049, class132.field2050 + 20 + 5 + arg1.field3100 + 4, 0, -1);
            }
        }
        try {
            Graphics var32 = field1850.getGraphics();
            field1967.method1435(var32, 0, 0);
        } catch (Exception var34) {
            field1850.repaint();
        }
    }

    @ObfuscatedName("z.k(I)V")
    public static final void method133() {
        if (client.field287 > 1) {
            client.field287--;
        }
        if (client.field325 > 0) {
            client.field325--;
        }
        if (client.field552) {
            client.field552 = false;
            client.method2526();
            return;
        }
        if (!client.field416) {
            client.field422[0] = class148.field2401;
            client.field425[0] = "";
            client.field283[0] = 1006;
            client.field457 = 1;
        }
        for (int var0 = 0; var0 < 100 && client.method130(); var0++) {
        }
        if (client.field278 != 30) {
            return;
        }
        while (true) {
            class201 var1 = (class201) class202.field3033.method3493();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = field124.field186;
                synchronized (field124.field186) {
                    if (!client.field345) {
                        field124.field187 = 0;
                    } else if (class132.field2055 != 0 || field124.field187 >= 40) {
                        client.field266.method2493(46);
                        client.field266.method2219(0);
                        int var5 = client.field266.field1890;
                        int var6 = 0;
                        for (int var7 = 0; var7 < field124.field187 && client.field266.field1890 - var5 < 240; var7++) {
                            var6++;
                            int var8 = field124.field193[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = field124.field196[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (field124.field193[var7] == -1 && field124.field196[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (client.field359 != var9 || client.field431 != var8) {
                                int var11 = var9 - client.field359;
                                client.field359 = var9;
                                int var12 = var8 - client.field431;
                                client.field431 = var8;
                                if (client.field451 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    client.field266.method2220((client.field451 << 12) + (var11 << 6) + var12);
                                    client.field451 = 0;
                                } else if (client.field451 < 8) {
                                    client.field266.method2221((client.field451 << 19) + 8388608 + var10);
                                    client.field451 = 0;
                                } else {
                                    client.field266.method2222((client.field451 << 19) + -1073741824 + var10);
                                    client.field451 = 0;
                                }
                            } else if (client.field451 < 2047) {
                                client.field451++;
                            }
                        }
                        client.field266.method2231(client.field266.field1890 - var5);
                        if (var6 >= field124.field187) {
                            field124.field187 = 0;
                        } else {
                            field124.field187 -= var6;
                            for (int var13 = 0; var13 < field124.field187; var13++) {
                                field124.field196[var13] = field124.field196[var6 + var13];
                                field124.field193[var13] = field124.field193[var6 + var13];
                            }
                        }
                    }
                }
                if (class132.field2055 == 1 || !field240 && class132.field2055 == 4 || class132.field2055 == 2) {
                    long var15 = (class132.field2058 - client.field292 * -1L) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    client.field292 = class132.field2058 * -1L;
                    int var17 = class132.field2057;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > field1848) {
                        var17 = field1848;
                    }
                    int var18 = class132.field2043;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > field696) {
                        var18 = field696;
                    }
                    int var19 = (int) var15;
                    client.field266.method2493(112);
                    client.field266.method2220((class132.field2055 == 2 ? 1 : 0) + (var19 << 1));
                    client.field266.method2220(var18);
                    client.field266.method2220(var17);
                }
                if (class129.field2022 > 0) {
                    client.field266.method2493(148);
                    client.field266.method2220(0);
                    int var20 = client.field266.field1890;
                    long var21 = class107.method1430();
                    for (int var23 = 0; var23 < class129.field2022; var23++) {
                        long var24 = var21 - client.field503;
                        if (var24 > 16777215L) {
                            var24 = 16777215L;
                        }
                        client.field503 = var21;
                        client.field266.method2321((int) var24);
                        client.field266.method2383(class129.field2021[var23]);
                    }
                    client.field266.method2433(client.field266.field1890 - var20);
                }
                if (client.field423 > 0) {
                    client.field423--;
                }
                if (class129.field2015[96] || class129.field2015[97] || class129.field2015[98] || class129.field2015[99]) {
                    client.field417 = true;
                }
                if (client.field417 && client.field423 <= 0) {
                    client.field423 = 20;
                    client.field417 = false;
                    client.field266.method2493(101);
                    client.field266.method2244(client.field357);
                    client.field266.method2220(client.field358);
                }
                if (field888 && !client.field471) {
                    client.field471 = true;
                    client.field266.method2493(153);
                    client.field266.method2219(1);
                }
                if (!field888 && client.field471) {
                    client.field471 = false;
                    client.field266.method2493(153);
                    client.field266.method2219(0);
                }
                client.method2921();
                if (client.field278 != 30) {
                    return;
                }
                for (class16 var26 = (class16) client.field409.method3451(); var26 != null; var26 = (class16) client.field409.method3448()) {
                    if (var26.field227 > 0) {
                        var26.field227--;
                    }
                    if (var26.field227 == 0) {
                        if (var26.field220 >= 0) {
                            int var27 = var26.field220;
                            int var28 = var26.field229;
                            class38 var29 = class38.method2180(var27);
                            if (var28 == 11) {
                                var28 = 10;
                            }
                            if (var28 >= 5 && var28 <= 8) {
                                var28 = 4;
                            }
                            boolean var30 = var29.method727(var28);
                            if (!var30) {
                                continue;
                            }
                        }
                        client.method628(var26.field216, var26.field217, var26.field222, var26.field228, var26.field220, var26.field221, var26.field229);
                        var26.method3540();
                    } else {
                        if (var26.field226 > 0) {
                            var26.field226--;
                        }
                        if (var26.field226 == 0 && var26.field222 >= 1 && var26.field228 >= 1 && var26.field222 <= 102 && var26.field228 <= 102) {
                            if (var26.field219 >= 0) {
                                int var31 = var26.field219;
                                int var32 = var26.field223;
                                class38 var33 = class38.method2180(var31);
                                if (var32 == 11) {
                                    var32 = 10;
                                }
                                if (var32 >= 5 && var32 <= 8) {
                                    var32 = 4;
                                }
                                boolean var34 = var33.method727(var32);
                                if (!var34) {
                                    continue;
                                }
                            }
                            client.method628(var26.field216, var26.field217, var26.field222, var26.field228, var26.field219, var26.field224, var26.field223);
                            var26.field226 = -1;
                            if (var26.field220 == var26.field219 && var26.field220 == -1) {
                                var26.method3540();
                            } else if (var26.field220 == var26.field219 && var26.field224 == var26.field221 && var26.field229 == var26.field223) {
                                var26.method3540();
                            }
                        }
                    }
                }
                client.method139();
                client.field320++;
                if (client.field320 > 750) {
                    client.method2526();
                    return;
                }
                for (int var35 = -1; var35 < client.field501; var35++) {
                    int var36;
                    if (var35 == -1) {
                        var36 = 2047;
                    } else {
                        var36 = client.field517[var35];
                    }
                    class3 var37 = client.field393[var36];
                    if (var37 != null) {
                        client.method92(var37, 1);
                    }
                }
                client.method982();
                for (int var38 = -1; var38 < client.field501; var38++) {
                    int var39;
                    if (var38 == -1) {
                        var39 = 2047;
                    } else {
                        var39 = client.field517[var38];
                    }
                    class3 var40 = client.field393[var39];
                    if (var40 != null && var40.field779 > 0) {
                        var40.field779--;
                        if (var40.field779 == 0) {
                            var40.field791 = null;
                        }
                    }
                }
                for (int var41 = 0; var41 < client.field313; var41++) {
                    int var42 = client.field314[var41];
                    class32 var43 = client.field312[var42];
                    if (var43 != null && var43.field779 > 0) {
                        var43.field779--;
                        if (var43.field779 == 0) {
                            var43.field791 = null;
                        }
                    }
                }
                client.field349++;
                if (client.field383 != 0) {
                    client.field382 += 20;
                    if (client.field382 >= 400) {
                        client.field383 = 0;
                    }
                }
                if (field1940 != null) {
                    client.field384++;
                    if (client.field384 >= 15) {
                        client.method106(field1940);
                        field1940 = null;
                    }
                }
                class164 var44 = field1167;
                class164 var45 = field1535;
                field1167 = null;
                field1535 = null;
                client.field452 = null;
                client.field456 = false;
                client.field453 = false;
                client.field268 = 0;
                while (class129.method1146() && client.field268 < 128) {
                    if (client.field442 >= 2 && class129.field2015[82] && field1794 == 66) {
                        String var46 = "";
                        Iterator var47 = class11.field158.iterator();
                        while (var47.hasNext()) {
                            class33 var48 = (class33) var47.next();
                            var46 = var46 + var48.field747 + ':' + var48.field749 + '\n';
                        }
                        field161.setContents(new StringSelection(var46), (ClipboardOwner) null);
                    } else {
                        client.field502[client.field268] = field1794;
                        client.field386[client.field268] = field130;
                        client.field268++;
                    }
                }
                int var51 = client.field435;
                int var52 = field696;
                int var53 = field1848;
                if (class164.method145(var51)) {
                    client.method2153(field2695[var51], -1, 0, 0, var52, var53, 0, 0);
                }
                client.field460++;
                while (true) {
                    class1 var54;
                    class164 var55;
                    class164 var56;
                    do {
                        var54 = (class1) client.field477.method3445();
                        if (var54 == null) {
                            while (true) {
                                class1 var57;
                                class164 var58;
                                class164 var59;
                                do {
                                    var57 = (class1) client.field478.method3445();
                                    if (var57 == null) {
                                        while (true) {
                                            class1 var60;
                                            class164 var61;
                                            class164 var62;
                                            do {
                                                var60 = (class1) client.field476.method3445();
                                                if (var60 == null) {
                                                    client.method525();
                                                    if (client.field448 != null) {
                                                        client.method486();
                                                    }
                                                    if (field570 != null) {
                                                        client.method106(field570);
                                                        client.field391++;
                                                        if (class132.field2048 == 0) {
                                                            if (client.field519) {
                                                                if (field570 == field132 && client.field459 != client.field389) {
                                                                    class164 var63 = field570;
                                                                    byte var64 = 0;
                                                                    if (client.field514 == 1 && var63.field2663 == 206) {
                                                                        var64 = 1;
                                                                    }
                                                                    if (var63.field2750[client.field389] <= 0) {
                                                                        var64 = 0;
                                                                    }
                                                                    if (method616(client.method3358(var63))) {
                                                                        int var65 = client.field459;
                                                                        int var66 = client.field389;
                                                                        var63.field2750[var66] = var63.field2750[var65];
                                                                        var63.field2744[var66] = var63.field2744[var65];
                                                                        var63.field2750[var65] = -1;
                                                                        var63.field2744[var65] = 0;
                                                                    } else if (var64 == 1) {
                                                                        int var67 = client.field459;
                                                                        int var68 = client.field389;
                                                                        while (var67 != var68) {
                                                                            if (var67 > var68) {
                                                                                var63.method3048(var67 - 1, var67);
                                                                                var67--;
                                                                            } else if (var67 < var68) {
                                                                                var63.method3048(var67 + 1, var67);
                                                                                var67++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var63.method3048(client.field389, client.field459);
                                                                    }
                                                                    client.field266.method2493(190);
                                                                    client.field266.method2220(client.field459);
                                                                    client.field266.method2219(var64);
                                                                    client.field266.method2266(client.field389);
                                                                    client.field266.method2278(field570.field2667);
                                                                }
                                                            } else if ((client.field415 == 1 || client.method485(client.field457 - 1)) && client.field457 > 2) {
                                                                client.method80(client.field387, client.field388);
                                                            } else if (client.field457 > 0) {
                                                                client.method1873(client.field387, client.field388);
                                                            }
                                                            client.field384 = 10;
                                                            class132.field2055 = 0;
                                                            field570 = null;
                                                        } else if (client.field391 >= 5 && (class132.field2049 > client.field387 + 5 || class132.field2049 < client.field387 - 5 || class132.field2050 > client.field388 + 5 || class132.field2050 < client.field388 - 5)) {
                                                            client.field519 = true;
                                                        }
                                                    }
                                                    if (class81.field1425 != -1) {
                                                        int var69 = class81.field1425;
                                                        int var70 = class81.field1400;
                                                        client.field266.method2493(202);
                                                        client.field266.method2219(5);
                                                        client.field266.method2383(class129.field2015[82] ? (class129.field2015[81] ? 2 : 1) : 0);
                                                        client.field266.method2244(field57 + var70);
                                                        client.field266.method2314(field142 + var69);
                                                        class81.field1425 = -1;
                                                        client.field380 = class132.field2043;
                                                        client.field381 = class132.field2057;
                                                        client.field383 = 1;
                                                        client.field382 = 0;
                                                        client.field407 = var69;
                                                        client.field512 = var70;
                                                    }
                                                    if (field1167 != var44) {
                                                        if (var44 != null) {
                                                            client.method106(var44);
                                                        }
                                                        if (field1167 != null) {
                                                            client.method106(field1167);
                                                        }
                                                    }
                                                    if (field1535 != var45 && client.field427 == client.field269) {
                                                        if (var45 != null) {
                                                            client.method106(var45);
                                                        }
                                                        if (field1535 != null) {
                                                            client.method106(field1535);
                                                        }
                                                    }
                                                    if (field1535 == null) {
                                                        if (client.field269 > 0) {
                                                            client.field269--;
                                                        }
                                                    } else if (client.field269 < client.field427) {
                                                        client.field269++;
                                                        if (client.field427 == client.field269) {
                                                            client.method106(field1535);
                                                        }
                                                    }
                                                    int var71 = client.field337 + field37.field789;
                                                    int var72 = client.field542 + field37.field773;
                                                    if (field2121 - var71 < -500 || field2121 - var71 > 500 || field2913 - var72 < -500 || field2913 - var72 > 500) {
                                                        field2121 = var71;
                                                        field2913 = var72;
                                                    }
                                                    if (field2121 != var71) {
                                                        field2121 += (var71 - field2121) / 16;
                                                    }
                                                    if (field2913 != var72) {
                                                        field2913 += (var72 - field2913) / 16;
                                                    }
                                                    if (class132.field2048 == 4 && field240) {
                                                        int var73 = class132.field2050 - client.field362;
                                                        client.field360 = var73 * 2;
                                                        client.field362 = var73 == -1 || var73 == 1 ? class132.field2050 : (client.field362 + class132.field2050) / 2;
                                                        int var74 = client.field469 - class132.field2049;
                                                        client.field350 = var74 * 2;
                                                        client.field469 = var74 == -1 || var74 == 1 ? class132.field2049 : (client.field469 + class132.field2049) / 2;
                                                    } else {
                                                        if (class129.field2015[96]) {
                                                            client.field350 += (-24 - client.field350) / 2;
                                                        } else if (class129.field2015[97]) {
                                                            client.field350 += (24 - client.field350) / 2;
                                                        } else {
                                                            client.field350 /= 2;
                                                        }
                                                        if (class129.field2015[98]) {
                                                            client.field360 += (12 - client.field360) / 2;
                                                        } else if (class129.field2015[99]) {
                                                            client.field360 += (-12 - client.field360) / 2;
                                                        } else {
                                                            client.field360 /= 2;
                                                        }
                                                        client.field362 = class132.field2050;
                                                        client.field469 = class132.field2049;
                                                    }
                                                    client.field358 = client.field350 / 2 + client.field358 & 0x7FF;
                                                    client.field357 += client.field360 / 2;
                                                    if (client.field357 < 128) {
                                                        client.field357 = 128;
                                                    }
                                                    if (client.field357 > 383) {
                                                        client.field357 = 383;
                                                    }
                                                    int var75 = field2121 >> 7;
                                                    int var76 = field2913 >> 7;
                                                    int var77 = client.method686(field2121, field2913, field665);
                                                    int var78 = 0;
                                                    if (var75 > 3 && var76 > 3 && var75 < 100 && var76 < 100) {
                                                        for (int var79 = var75 - 4; var79 <= var75 + 4; var79++) {
                                                            for (int var80 = var76 - 4; var80 <= var76 + 4; var80++) {
                                                                int var81 = field665;
                                                                if (var81 < 3 && (class6.field68[1][var79][var80] & 0x2) == 2) {
                                                                    var81++;
                                                                }
                                                                int var82 = var77 - class6.field79[var81][var79][var80];
                                                                if (var82 > var78) {
                                                                    var78 = var82;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var83 = var78 * 192;
                                                    if (var83 > 98048) {
                                                        var83 = 98048;
                                                    }
                                                    if (var83 < 32768) {
                                                        var83 = 32768;
                                                    }
                                                    if (var83 > client.field365) {
                                                        client.field365 += (var83 - client.field365) / 24;
                                                    } else if (var83 < client.field365) {
                                                        client.field365 += (var83 - client.field365) / 80;
                                                    }
                                                    if (client.field493) {
                                                        client.method621();
                                                    }
                                                    for (int var84 = 0; var84 < 5; var84++) {
                                                        int var10002 = client.field530[var84]++;
                                                    }
                                                    int var85 = class132.method2704();
                                                    int var86 = class129.field2026;
                                                    if (var85 > 15000 && var86 > 15000) {
                                                        client.field325 = 250;
                                                        class132.method2655(14500);
                                                        client.field266.method2493(58);
                                                    }
                                                    client.field343++;
                                                    if (client.field343 > 500) {
                                                        client.field343 = 0;
                                                        int var88 = (int) (Math.random() * 8.0D);
                                                        if ((var88 & 0x1) == 1) {
                                                            client.field337 += client.field510;
                                                        }
                                                        if ((var88 & 0x2) == 2) {
                                                            client.field542 += client.field438;
                                                        }
                                                        if ((var88 & 0x4) == 4) {
                                                            client.field341 += client.field461;
                                                        }
                                                    }
                                                    if (client.field337 < -50) {
                                                        client.field510 = 2;
                                                    }
                                                    if (client.field337 > 50) {
                                                        client.field510 = -2;
                                                    }
                                                    if (client.field542 < -55) {
                                                        client.field438 = 2;
                                                    }
                                                    if (client.field542 > 55) {
                                                        client.field438 = -2;
                                                    }
                                                    if (client.field341 < -40) {
                                                        client.field461 = 1;
                                                    }
                                                    if (client.field341 > 40) {
                                                        client.field461 = -1;
                                                    }
                                                    client.field348++;
                                                    if (client.field348 > 500) {
                                                        client.field348 = 0;
                                                        int var89 = (int) (Math.random() * 8.0D);
                                                        if ((var89 & 0x1) == 1) {
                                                            client.field290 += client.field474;
                                                        }
                                                        if ((var89 & 0x2) == 2) {
                                                            client.field346 += client.field347;
                                                        }
                                                    }
                                                    if (client.field290 < -60) {
                                                        client.field474 = 2;
                                                    }
                                                    if (client.field290 > 60) {
                                                        client.field474 = -2;
                                                    }
                                                    if (client.field346 < -20) {
                                                        client.field347 = 1;
                                                    }
                                                    if (client.field346 > 10) {
                                                        client.field347 = -1;
                                                    }
                                                    for (class36 var90 = (class36) client.field302.method3401(); var90 != null; var90 = (class36) client.field302.method3405()) {
                                                        if ((long) var90.field845 < class107.method1430() / 1000L - 5L) {
                                                            if (var90.field839 > 0) {
                                                                class11.method2919(5, "", var90.field838 + class148.field2359);
                                                            }
                                                            if (var90.field839 == 0) {
                                                                class11.method2919(5, "", var90.field838 + class148.field2360);
                                                            }
                                                            var90.method3535();
                                                        }
                                                    }
                                                    client.field321++;
                                                    if (client.field321 > 50) {
                                                        client.field266.method2493(25);
                                                    }
                                                    try {
                                                        if (field2796 != null && client.field266.field1890 > 0) {
                                                            field2796.method2714(client.field266.field1889, 0, client.field266.field1890);
                                                            client.field266.field1890 = 0;
                                                            client.field321 = 0;
                                                        }
                                                    } catch (IOException var92) {
                                                        client.method2526();
                                                    }
                                                    return;
                                                }
                                                var61 = var60.field5;
                                                if (var61.field2660 < 0) {
                                                    break;
                                                }
                                                var62 = class164.method144(var61.field2678);
                                            } while (var62 == null || var62.field2781 == null || var61.field2660 >= var62.field2781.length || var62.field2781[var61.field2660] != var61);
                                            class34.method3076(var60);
                                        }
                                    }
                                    var58 = var57.field5;
                                    if (var58.field2660 < 0) {
                                        break;
                                    }
                                    var59 = class164.method144(var58.field2678);
                                } while (var59 == null || var59.field2781 == null || var58.field2660 >= var59.field2781.length || var59.field2781[var58.field2660] != var58);
                                class34.method3076(var57);
                            }
                        }
                        var55 = var54.field5;
                        if (var55.field2660 < 0) {
                            break;
                        }
                        var56 = class164.method144(var55.field2678);
                    } while (var56 == null || var56.field2781 == null || var55.field2660 >= var56.field2781.length || var56.field2781[var55.field2660] != var55);
                    class34.method3076(var54);
                }
            }
            client.field266.method2493(100);
            client.field266.method2219(0);
            int var3 = client.field266.field1890;
            class202.method2706(client.field266);
            client.field266.method2231(client.field266.field1890 - var3);
        }
    }

    @ObfuscatedName("eq.a(II)V")
    public static void method2841(int arg0) {
        if (arg0 == -1 || !class164.method145(arg0)) {
            return;
        }
        class164[] var1 = field2695[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3.field2738 != null) {
                class1 var4 = new class1();
                var4.field5 = var3;
                var4.field1 = var3.field2738;
                class34.method2707(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("gs.ap(Lal;S)V")
    public static final void method3549(class35 arg0) {
        if (client.field280 == arg0.field807 || arg0.field804 == -1 || arg0.field785 != 0 || arg0.field806 + 1 > method860(arg0.field804).field971[arg0.field805]) {
            int var1 = arg0.field807 - arg0.field808;
            int var2 = client.field280 - arg0.field808;
            int var3 = arg0.field814 * 128 + arg0.field776 * 64;
            int var4 = arg0.field816 * 128 + arg0.field776 * 64;
            int var5 = arg0.field815 * 128 + arg0.field776 * 64;
            int var6 = arg0.field817 * 128 + arg0.field776 * 64;
            arg0.field789 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field773 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field830 = 0;
        if (arg0.field820 == 0) {
            arg0.field780 = 1024;
        }
        if (arg0.field820 == 1) {
            arg0.field780 = 1536;
        }
        if (arg0.field820 == 2) {
            arg0.field780 = 0;
        }
        if (arg0.field820 == 3) {
            arg0.field780 = 512;
        }
        arg0.field774 = arg0.field780;
    }

    @ObfuscatedName("cw.aw(I)I")
    public static final int method1957() {
        if (field1306.field136) {
            return field665;
        } else {
            int var0 = client.method686(field875, field1057, field665);
            return var0 - field2059 >= 800 || (class6.field68[field665][field875 >> 7][field1057 >> 7] & 0x4) == 0 ? 3 : field665;
        }
    }

    @ObfuscatedName("u.cz(Lfq;I)Z")
    public static final boolean method156(class164 arg0) {
        if (arg0.field2770 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2770.length; var1++) {
            int var2 = client.method2151(arg0, var1);
            int var3 = arg0.field2733[var1];
            if (arg0.field2770[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2770[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2770[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }
}
