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
import java.io.File;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("ap.q")
    public static class74 field1005;

    @ObfuscatedName("ap.f")
    public static class215 field1010;

    @ObfuscatedName("ap.y")
    public static class158 field1013;

    @ObfuscatedName("ac.y")
    public static class158 field1019;

    @ObfuscatedName("ac.bt")
    public static class76[] field1026;

    @ObfuscatedName("av.fc")
    public static int field1034;

    @ObfuscatedName("av.aa")
    public static class159 field1036;

    @ObfuscatedName("av.q")
    public static short[] field1038;

    @ObfuscatedName("ai.n")
    public static class158 field1042;

    @ObfuscatedName("ai.e")
    public static boolean field1063;

    @ObfuscatedName("ai.f")
    public static class76 field1091;

    @ObfuscatedName("ax.k")
    public static int field1093;

    @ObfuscatedName("ax.qz")
    public static Canvas field1094;

    @ObfuscatedName("ax.y")
    public static class158 field1096;

    @ObfuscatedName("ax.au")
    public static int[] field1097;

    @ObfuscatedName("ax.f")
    public static int[] field1098;

    @ObfuscatedName("aa.y")
    public static class49 field1103;

    @ObfuscatedName("ad.e")
    public static class68 field1109;

    @ObfuscatedName("ad.mn")
    public static class74 field1120;

    @ObfuscatedName("ad.n")
    public static boolean field1125;

    @ObfuscatedName("ad.g")
    public static int field1126;

    @ObfuscatedName("q.cu")
    public static class135 field113;

    @ObfuscatedName("bn.fl")
    public static int field1147;

    @ObfuscatedName("bn.qu")
    public static int field1148;

    @ObfuscatedName("bn.pf")
    public static int field1151;

    @ObfuscatedName("bh.z")
    public static float field1172;

    @ObfuscatedName("bh.v")
    public static int field1173;

    @ObfuscatedName("q.av")
    public static class135 field119;

    @ObfuscatedName("bo.f")
    public static int[] field1203;

    @ObfuscatedName("bo.b")
    public static int[] field1206;

    @ObfuscatedName("bo.i")
    public static boolean[] field1207;

    @ObfuscatedName("q.iw")
    public static int field121;

    @ObfuscatedName("bq.r")
    public static int[] field1217;

    @ObfuscatedName("bq.o")
    public static float[] field1218;

    @ObfuscatedName("q.dy")
    public static int[][] field122;

    @ObfuscatedName("bq.ab")
    public static int[] field1220;

    @ObfuscatedName("bq.w")
    public static class63[] field1222;

    @ObfuscatedName("bq.z")
    public static int field1224;

    @ObfuscatedName("bq.v")
    public static int field1225;

    @ObfuscatedName("bq.u")
    public static float[] field1226;

    @ObfuscatedName("bq.i")
    public static class69[] field1228;

    @ObfuscatedName("bq.q")
    public static byte[] field1229;

    @ObfuscatedName("bq.l")
    public static class56[] field1230;

    @ObfuscatedName("bq.s")
    public static boolean[] field1232;

    @ObfuscatedName("bq.b")
    public static int field1238;

    @ObfuscatedName("bq.c")
    public static float[] field1239;

    @ObfuscatedName("bq.d")
    public static float[] field1241;

    @ObfuscatedName("bq.j")
    public static class64[] field1242;

    @ObfuscatedName("bq.aj")
    public static float[] field1243;

    @ObfuscatedName("bq.f")
    public static int field1244;

    @ObfuscatedName("bq.ah")
    public static float[] field1245;

    @ObfuscatedName("bq.au")
    public static float[] field1246;

    @ObfuscatedName("bq.am")
    public static int[] field1247;

    @ObfuscatedName("z.dt")
    public static int[] field125;

    @ObfuscatedName("z.f")
    public static class164 field127;

    @ObfuscatedName("z.pt")
    public static short[] field128;

    @ObfuscatedName("z.gp")
    public static class164 field129;

    @ObfuscatedName("y.ff")
    public static int field13;

    @ObfuscatedName("br.p")
    public static String field1302;

    @ObfuscatedName("br.v")
    public static short[] field1303;

    @ObfuscatedName("bl.x")
    public static int[] field1306;

    @ObfuscatedName("z.qm")
    public static int field131;

    @ObfuscatedName("bu.es")
    public static class74[] field1310;

    @ObfuscatedName("bu.t")
    public static int[] field1311;

    @ObfuscatedName("bu.g")
    public static int field1312;

    @ObfuscatedName("bu.n")
    public static int[] field1313;

    @ObfuscatedName("bu.a")
    public static int[] field1314;

    @ObfuscatedName("bu.k")
    public static int field1317;

    @ObfuscatedName("bu.y")
    public static int field1318;

    @ObfuscatedName("bv.ku")
    public static int field1321;

    @ObfuscatedName("bv.q")
    public static int[] field1323;

    @ObfuscatedName("bs.w")
    public static int[] field1340;

    @ObfuscatedName("bs.l")
    public static int field1341;

    @ObfuscatedName("bs.j")
    public static int field1342;

    @ObfuscatedName("bw.j")
    public static int[] field1369;

    @ObfuscatedName("cj.qg")
    public static class73 field1376;

    @ObfuscatedName("cj.t")
    public static class76[] field1382;

    @ObfuscatedName("ck.h")
    public static int field1396;

    @ObfuscatedName("y.bh")
    public static class159 field14;

    @ObfuscatedName("ck.r")
    public static int field1400;

    @ObfuscatedName("ck.x")
    public static int field1402;

    @ObfuscatedName("ck.by")
    public static int field1403;

    @ObfuscatedName("ck.a")
    public static int field1404;

    @ObfuscatedName("ck.p")
    public static int field1405;

    @ObfuscatedName("ck.bk")
    public static int field1406;

    @ObfuscatedName("ck.u")
    public static int field1407;

    @ObfuscatedName("ck.d")
    public static int field1408;

    @ObfuscatedName("ck.o")
    public static int field1409;

    @ObfuscatedName("ck.aj")
    public static int field1410;

    @ObfuscatedName("ck.au")
    public static int field1411;

    @ObfuscatedName("ck.ah")
    public static int field1412;

    @ObfuscatedName("ck.ab")
    public static int field1413;

    @ObfuscatedName("ck.bc")
    public static int field1415;

    @ObfuscatedName("ck.c")
    public static int field1426;

    @ObfuscatedName("ck.m")
    public static int field1439;

    @ObfuscatedName("ck.bj")
    public static int field1440;

    @ObfuscatedName("ck.bh")
    public static int field1442;

    @ObfuscatedName("ck.bd")
    public static int field1443;

    @ObfuscatedName("ck.ba")
    public static boolean[][] field1445;

    @ObfuscatedName("cd.b")
    public static class203 field1455;

    @ObfuscatedName("cu.ce")
    public static int field1471;

    @ObfuscatedName("cf.px")
    public static class128 field1483;

    @ObfuscatedName("cy.p")
    public static int field1489;

    @ObfuscatedName("cy.f")
    public static int field1490;

    @ObfuscatedName("cy.a")
    public static int field1492;

    @ObfuscatedName("cy.u")
    public static int field1497;

    @ObfuscatedName("cy.i")
    public static int field1498;

    @ObfuscatedName("cy.m")
    public static int field1499;

    @ObfuscatedName("cy.d")
    public static int field1504;

    @ObfuscatedName("cy.au")
    public static class87 field1507;

    @ObfuscatedName("cy.c")
    public static int field1509;

    @ObfuscatedName("cm.io")
    public static class29 field1516;

    @ObfuscatedName("ce.l")
    public static class163 field1532;

    @ObfuscatedName("ce.em")
    public static class76[] field1534;

    @ObfuscatedName("cn.bn")
    public static class159 field1548;

    @ObfuscatedName("cn.d")
    public static int[] field1553;

    @ObfuscatedName("cw.ad")
    public static class159 field1599;

    @ObfuscatedName("y.ba")
    public static class159 field16;

    @ObfuscatedName("b.ng")
    public static int field161;

    @ObfuscatedName("cz.oi")
    public static int field1613;

    @ObfuscatedName("f.et")
    public static class76[] field165;

    @ObfuscatedName("f.by")
    public static class159 field166;

    @ObfuscatedName("cq.gc")
    public static class164 field1672;

    @ObfuscatedName("f.mi")
    public static int field168;

    @ObfuscatedName("f.ac")
    public static class138 field170;

    @ObfuscatedName("co.n")
    public static class158 field1704;

    @ObfuscatedName("f.e")
    public static int field171;

    @ObfuscatedName("ci.bv")
    public static int field1713;

    @ObfuscatedName("f.r")
    public static String[] field172;

    @ObfuscatedName("ci.on")
    public static int field1727;

    @ObfuscatedName("f.o")
    public static int[] field173;

    @ObfuscatedName("ci.qh")
    public static int field1732;

    @ObfuscatedName("i.qv")
    public static int field178;

    @ObfuscatedName("ch.bt")
    public static int field1785;

    @ObfuscatedName("ch.bf")
    public static int field1786;

    @ObfuscatedName("ch.bn")
    public static int field1787;

    @ObfuscatedName("ca.mu")
    public static class23[] field1800;

    @ObfuscatedName("ca.ch")
    public static class215 field1802;

    @ObfuscatedName("ct.fe")
    public static int field1829;

    @ObfuscatedName("ct.ns")
    public static int field1841;

    @ObfuscatedName("ct.hm")
    public static int field1843;

    @ObfuscatedName("ct.qf")
    public static int field1845;

    @ObfuscatedName("ct.bo")
    public static class159 field1847;

    @ObfuscatedName("cv.qt")
    public static int field1851;

    @ObfuscatedName("cv.bz")
    public static int field1855;

    @ObfuscatedName("dv.oc")
    public static int field1860;

    @ObfuscatedName("ds.qw")
    public static Image field1863;

    @ObfuscatedName("ds.eq")
    public static class74[] field1865;

    @ObfuscatedName("ds.nr")
    public static class52 field1866;

    @ObfuscatedName("dm.pu")
    public static int field1876;

    @ObfuscatedName("dm.k")
    public static long field1877;

    @ObfuscatedName("dm.y")
    public static long field1878;

    @ObfuscatedName("di.a")
    public static String field1884;

    @ObfuscatedName("dw.w")
    public static boolean field1896;

    @ObfuscatedName("dw.s")
    public static String[] field1903;

    @ObfuscatedName("db.be")
    public static class159 field1919;

    @ObfuscatedName("db.bb")
    public static int field1920;

    @ObfuscatedName("dt.dp")
    public static int field1931;

    @ObfuscatedName("dy.y")
    public static class158 field1937;

    @ObfuscatedName("dy.u")
    public static class13 field1938;

    @ObfuscatedName("dy.dx")
    public static class81 field1939;

    @ObfuscatedName("dh.ec")
    public static class74[] field1948;

    @ObfuscatedName("dx.m")
    public static String field1953;

    @ObfuscatedName("dx.qx")
    public static Font field1954;

    @ObfuscatedName("da.co")
    public static class215 field1960;

    @ObfuscatedName("da.ex")
    public static class74[] field1962;

    @ObfuscatedName("dq.de")
    public static int[] field1968;

    @ObfuscatedName("dq.m")
    public static class111 field1969;

    @ObfuscatedName("dq.fz")
    public static int field1971;

    @ObfuscatedName("dk.t")
    public static class158 field1978;

    @ObfuscatedName("dk.i")
    public static int[] field1979;

    @ObfuscatedName("w.bc")
    public static class159 field198;

    @ObfuscatedName("dk.ih")
    public static class164 field1980;

    @ObfuscatedName("dk.bt")
    public static class159 field1982;

    @ObfuscatedName("du.k")
    public static File field1998;

    @ObfuscatedName("du.eb")
    public static class74 field1999;

    @ObfuscatedName("du.il")
    public static int field2005;

    @ObfuscatedName("df.k")
    public static String field2013;

    @ObfuscatedName("df.y")
    public static String field2018;

    @ObfuscatedName("do.cm")
    public static char field2033;

    @ObfuscatedName("l.nf")
    public static class70 field204;

    @ObfuscatedName("do.hl")
    public static int field2047;

    @ObfuscatedName("dn.cv")
    public static int field2052;

    @ObfuscatedName("ey.w")
    public static int[] field2057;

    @ObfuscatedName("ey.qr")
    public static Frame field2058;

    @ObfuscatedName("ey.ci")
    public static class215 field2059;

    @ObfuscatedName("ey.h")
    public static int field2062;

    @ObfuscatedName("l.dh")
    public static byte[][] field207;

    @ObfuscatedName("ez.ae")
    public static long field2075;

    @ObfuscatedName("j.pr")
    public static class151 field208;

    @ObfuscatedName("ez.rd")
    public static boolean field2081;

    @ObfuscatedName("eh.i")
    public static class171 field2090;

    @ObfuscatedName("eh.bf")
    public static FontMetrics field2094;

    @ObfuscatedName("ei.hw")
    public static class3 field2098;

    @ObfuscatedName("j.ij")
    public static int field211;

    @ObfuscatedName("ef.qj")
    public static int field2125;

    @ObfuscatedName("j.aq")
    public static boolean field213;

    @ObfuscatedName("j.q")
    public static int field214;

    @ObfuscatedName("ek.k")
    public static String field2144;

    @ObfuscatedName("ek.g")
    public static int field2145;

    @ObfuscatedName("ek.y")
    public static Applet field2147;

    @ObfuscatedName("ek.kd")
    public static class123 field2149;

    @ObfuscatedName("ek.aa")
    public static class74[] field2150;

    @ObfuscatedName("ek.v")
    public static int field2152;

    @ObfuscatedName("ex.n")
    public static File field2156;

    @ObfuscatedName("ex.ad")
    public static class76[] field2157;

    @ObfuscatedName("ex.j")
    public static int field2162;

    @ObfuscatedName("ex.bu")
    public static String field2165;

    @ObfuscatedName("ex.t")
    public static File field2166;

    @ObfuscatedName("eq.b")
    public static class76 field2184;

    @ObfuscatedName("eq.gw")
    public static class164 field2185;

    @ObfuscatedName("eu.ok")
    public static int field2196;

    @ObfuscatedName("el.fd")
    public static int field2210;

    @ObfuscatedName("s.ds")
    public static int field229;

    @ObfuscatedName("r.ej")
    public static class74 field242;

    @ObfuscatedName("em.r")
    public static int field2509;

    @ObfuscatedName("h.kq")
    public static int field254;

    @ObfuscatedName("en.j")
    public static String field2549;

    @ObfuscatedName("en.bk")
    public static class159 field2555;

    @ObfuscatedName("ed.qi")
    public static int field2562;

    @ObfuscatedName("eg.nz")
    public static int field2571;

    @ObfuscatedName("fe.ak")
    public static class76[] field2577;

    @ObfuscatedName("client.g")
    public static client field259;

    @ObfuscatedName("k.cf")
    public static class135 field26;

    @ObfuscatedName("fz.v")
    public static class76[] field2627;

    @ObfuscatedName("fz.lb")
    public static class122 field2628;

    @ObfuscatedName("client.q")
    public static class144 field263;

    @ObfuscatedName("fg.y")
    public static class135 field2636;

    @ObfuscatedName("fg.g")
    public static long field2648;

    @ObfuscatedName("fg.mp")
    public static byte field2651;

    @ObfuscatedName("fb.k")
    public static boolean[] field2658;

    @ObfuscatedName("fb.t")
    public static class158 field2660;

    @ObfuscatedName("fb.y")
    public static class164[][] field2685;

    @ObfuscatedName("fb.g")
    public static class158 field2744;

    @ObfuscatedName("fb.e")
    public static class158 field2780;

    @ObfuscatedName("fr.nw")
    public static int field2806;

    @ObfuscatedName("fi.e")
    public static class74 field2811;

    @ObfuscatedName("fq.l")
    public static int[] field2824;

    @ObfuscatedName("fc.z")
    public static int field2826;

    @ObfuscatedName("fc.pj")
    public static class9 field2828;

    @ObfuscatedName("fo.b")
    public static short[][] field2833;

    @ObfuscatedName("fo.z")
    public static short[][] field2835;

    @ObfuscatedName("fo.dm")
    public static int field2839;

    @ObfuscatedName("fx.ak")
    public static class159 field2843;

    @ObfuscatedName("fx.v")
    public static class145 field2851;

    @ObfuscatedName("fw.k")
    public static class158 field2872;

    @ObfuscatedName("fw.e")
    public static class158 field2875;

    @ObfuscatedName("fw.b")
    public static int field2876;

    @ObfuscatedName("fw.y")
    public static class158 field2877;

    @ObfuscatedName("fw.g")
    public static class158 field2878;

    @ObfuscatedName("client.s")
    public static String field292;

    @ObfuscatedName("fj.dk")
    public static int field2922;

    @ObfuscatedName("fm.iq")
    public static class164 field2923;

    @ObfuscatedName("fn.mo")
    public static byte field2957;

    @ObfuscatedName("fs.k")
    public static class158 field2959;

    @ObfuscatedName("client.bs")
    public static int field298;

    @ObfuscatedName("k.nk")
    public static class52 field30;

    @ObfuscatedName("gq.d")
    public static int[] field3027;

    @ObfuscatedName("client.cg")
    public static class138 field303;

    @ObfuscatedName("ga.e")
    public static int[] field3053;

    @ObfuscatedName("gv.i")
    public static class164 field3059;

    @ObfuscatedName("gt.t")
    public static int field3066;

    @ObfuscatedName("hc.y")
    public static class105 field3082;

    @ObfuscatedName("hw.b")
    public static class76[] field3083;

    @ObfuscatedName("hg.v")
    public static byte[][] field3116;

    @ObfuscatedName("client.ee")
    public static class74[] field340;

    @ObfuscatedName("client.el")
    public static class74[] field342;

    @ObfuscatedName("client.ek")
    public static class76[] field357;

    @ObfuscatedName("client.er")
    public static class74[] field415;

    @ObfuscatedName("client.bd")
    public static class159 field461;

    @ObfuscatedName("x.bq")
    public static class159 field551;

    @ObfuscatedName("a.p")
    public static int[] field576;

    @ObfuscatedName("a.z")
    public static int[] field578;

    @ObfuscatedName("a.f")
    public static boolean field579;

    @ObfuscatedName("n.dd")
    public static byte[][] field59;

    @ObfuscatedName("p.ni")
    public static int field595;

    @ObfuscatedName("c.fq")
    public static int field601;

    @ObfuscatedName("c.w")
    public static class55 field605;

    @ObfuscatedName("u.t")
    public static class24[] field610;

    @ObfuscatedName("u.cp")
    public static int field613;

    @ObfuscatedName("u.ps")
    public static long field614;

    @ObfuscatedName("u.b")
    public static class18 field615;

    @ObfuscatedName("n.pe")
    public static Clipboard field62;

    @ObfuscatedName("u.iz")
    public static int field629;

    @ObfuscatedName("o.q")
    public static byte[][][] field649;

    @ObfuscatedName("o.s")
    public static class111 field651;

    @ObfuscatedName("o.pq")
    public static class126 field653;

    @ObfuscatedName("o.db")
    public static int[] field654;

    @ObfuscatedName("aj.bi")
    public static class159 field657;

    @ObfuscatedName("au.l")
    public static class219[] field673;

    @ObfuscatedName("au.pn")
    public static class212 field674;

    @ObfuscatedName("t.pz")
    public static int field68;

    @ObfuscatedName("ah.m")
    public static int[] field682;

    @ObfuscatedName("ab.g")
    public static class76 field687;

    @ObfuscatedName("ab.n")
    public static class76 field688;

    @ObfuscatedName("ab.z")
    public static class76 field689;

    @ObfuscatedName("ab.aw")
    public static int field708;

    @ObfuscatedName("ab.al")
    public static String field709;

    @ObfuscatedName("ab.y")
    public static boolean field712;

    @ObfuscatedName("ab.q")
    public static int field716;

    @ObfuscatedName("am.aj")
    public static int[] field719;

    @ObfuscatedName("am.nu")
    public static int field723;

    @ObfuscatedName("ar.eu")
    public static class74[] field728;

    @ObfuscatedName("ar.n")
    public static class175 field730;

    @ObfuscatedName("e.t")
    public static byte[][][] field74;

    @ObfuscatedName("az.g")
    public static int[] field745;

    @ObfuscatedName("az.n")
    public static String[] field746;

    @ObfuscatedName("az.ix")
    public static int field756;

    @ObfuscatedName("az.hf")
    public static int field758;

    @ObfuscatedName("e.z")
    public static byte[][][] field76;

    @ObfuscatedName("e.v")
    public static int[][] field77;

    @ObfuscatedName("e.e")
    public static byte[][][] field78;

    @ObfuscatedName("at.ay")
    public static class138 field781;

    @ObfuscatedName("ag.kv")
    public static int field826;

    @ObfuscatedName("as.bj")
    public static class159 field830;

    @ObfuscatedName("as.k")
    public static class158 field855;

    @ObfuscatedName("as.rm")
    public static String field866;

    @ObfuscatedName("as.y")
    public static class158 field867;

    @ObfuscatedName("ao.g")
    public static class158 field872;

    @ObfuscatedName("ao.k")
    public static class158 field882;

    @ObfuscatedName("e.n")
    public static byte[][][] field92;

    @ObfuscatedName("ao.kn")
    public static class164[] field920;

    @ObfuscatedName("af.b")
    public static int[] field921;

    @ObfuscatedName("af.y")
    public static class158 field925;

    @ObfuscatedName("af.nx")
    public static class51 field928;

    @ObfuscatedName("af.j")
    public static int[][][] field931;

    @ObfuscatedName("af.bf")
    public static class76 field934;

    @ObfuscatedName("ay.y")
    public static class158 field936;

    @ObfuscatedName("ay.g")
    public static class158 field952;

    @ObfuscatedName("ay.qn")
    public static class125 field954;

    @ObfuscatedName("aq.k")
    public static class158 field958;

    @ObfuscatedName("aq.y")
    public static class158 field970;

    @ObfuscatedName("aw.k")
    public static class158 field978;

    @ObfuscatedName("aw.g")
    public static int field979;

    @ObfuscatedName("aw.y")
    public static class158 field981;

    @ObfuscatedName("aw.ic")
    public static int field988;

    @ObfuscatedName("aw.hx")
    public static int field991;

    @ObfuscatedName("al.y")
    public static class158 field993;

    @ObfuscatedName("dl.g(IB)Z")
    public static boolean method2511(int arg0) {
        return (arg0 >> 29 & 0x1) != 0;
    }

    @ObfuscatedName("dp.g(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;")
    public static Object method2509(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }

    @ObfuscatedName("b.y(II)Lac;")
    public static class45 method101(int arg0) {
        class45 var1 = (class45) class45.field1016.method3327((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field1019.method2874(8, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method880(new class111(var2));
        }
        class45.field1016.method3340(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gv.k(II)Lap;")
    public static class44 method3527(int arg0) {
        class44 var1 = (class44) class44.field1006.method3327((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field1013.method2874(14, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method865(new class111(var2));
        }
        class44.field1006.method3340(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("co.y(JLjava/lang/String;B)I")
    public static final int method1989(long arg0, String arg1) {
        Random var3 = new Random();
        class111 var4 = new class111(128);
        class111 var5 = new class111(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2145(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2148(var3.nextInt());
        }
        var4.method2148(var6[0]);
        var4.method2148(var6[1]);
        var4.method2150(arg0);
        var4.method2150(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2148(var3.nextInt());
        }
        var4.method2263(class10.field155, class10.field149);
        var5.method2145(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2148(var3.nextInt());
        }
        var5.method2150(var3.nextLong());
        var5.method2149(var3.nextLong());
        class141.method135(var5);
        var5.method2150(var3.nextLong());
        var5.method2263(class10.field155, class10.field149);
        int var10 = class111.method699(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class111 var11 = new class111(var10);
        var11.method2298(arg1);
        var11.field1902 = var10;
        var11.method2361(var6);
        class111 var12 = new class111(var11.field1902 + var5.field1902 + var4.field1902 + 5);
        var12.method2145(2);
        var12.method2145(var4.field1902);
        var12.method2154(var4.field1897, 0, var4.field1902);
        var12.method2145(var5.field1902);
        var12.method2154(var5.field1897, 0, var5.field1902);
        var12.method2319(var11.field1902);
        var12.method2154(var11.field1897, 0, var11.field1902);
        byte[] var13 = var12.field1897;
        String var14 = class152.method1388(var13, 0, var13.length);
        String var15 = var14;
        try {
            URL var16 = new URL(client.method31("services", false) + "m=accountappeal/login.ws");
            URLConnection var17 = var16.openConnection();
            var17.setDoInput(true);
            var17.setDoOutput(true);
            var17.setConnectTimeout(5000);
            OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
            var18.write("data2=" + class217.method1(var15) + "&dest=" + class217.method1("passwordchoice.ws"));
            var18.flush();
            InputStream var19 = var17.getInputStream();
            class111 var20 = new class111(new byte[1000]);
            do {
                int var21 = var19.read(var20.field1897, var20.field1902, 1000 - var20.field1902);
                if (var21 == -1) {
                    var18.close();
                    var19.close();
                    String var22 = new String(var20.field1897);
                    if (var22.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var22.startsWith("WRONG")) {
                        return 7;
                    } else if (var22.startsWith("RELOAD")) {
                        return 3;
                    } else if (var22.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var20.method2177(var6);
                        while (var20.field1902 > 0 && var20.field1897[var20.field1902 - 1] == 0) {
                            var20.field1902--;
                        }
                        String var23 = new String(var20.field1897, 0, var20.field1902);
                        if (!class10.method84(var23)) {
                            return 5;
                        }
                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                            try {
                                Desktop.getDesktop().browse(new URI(var23));
                                return 2;
                            } catch (Exception var26) {
                            }
                        }
                        if (class130.field2051.startsWith("win")) {
                            class130.method861(var23, 0, "openjs");
                        } else if (class130.field2051.startsWith("mac")) {
                            class130.method861(var23, 1, "openjs");
                        } else {
                            class130.method861(var23, 2, "openjs");
                        }
                        return 2;
                    }
                }
                var20.field1902 += var21;
            } while (var20.field1902 < 1000);
            return 5;
        } catch (Throwable var27) {
            var27.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("s.g(CI)C")
    public static char method141(char arg0) {
        return arg0 == 181 || arg0 == 402 ? arg0 : Character.toTitleCase(arg0);
    }

    @ObfuscatedName("ax.n(Lfd;Ljava/lang/String;Ljava/lang/String;I)Lbz;")
    public static class76 method946(class158 arg0, String arg1, String arg2) {
        int var3 = arg0.method2888(arg1);
        int var4 = arg0.method2889(var3, arg2);
        return class72.method527(arg0, var3, var4);
    }

    @ObfuscatedName("aj.t(IZB)Ljava/lang/String;")
    public static String method593(int arg0, boolean arg1) {
        if (!arg1 || arg0 < 0) {
            return Integer.toString(arg0);
        }
        int var2 = arg0;
        String var9;
        if (arg1 && arg0 >= 0) {
            int var3 = 2;
            int var4 = arg0 / 10;
            while (var4 != 0) {
                var4 /= 10;
                var3++;
            }
            char[] var5 = new char[var3];
            var5[0] = '+';
            for (int var6 = var3 - 1; var6 > 0; var6--) {
                int var7 = var2;
                var2 /= 10;
                int var8 = var7 - var2 * 10;
                if (var8 >= 10) {
                    var5[var6] = (char) (var8 + 87);
                } else {
                    var5[var6] = (char) (var8 + 48);
                }
            }
            var9 = new String(var5);
        } else {
            var9 = Integer.toString(arg0, 10);
        }
        return var9;
    }

    @ObfuscatedName("dw.t(S)V")
    public static void method2231() {
        Object var0 = class161.field2624;
        synchronized (class161.field2624) {
            if (class161.field2623 != 0) {
                class161.field2623 = 1;
                try {
                    class161.field2624.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }

    @ObfuscatedName("t.t([BIIB)Ljava/lang/String;")
    public static String method29(byte[] arg0, int arg1, int arg2) {
        char[] var3 = new char[arg2];
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var6 = arg0[arg1 + var5] & 0xFF;
            if (var6 != 0) {
                if (var6 >= 128 && var6 < 160) {
                    char var7 = class156.field2569[var6 - 128];
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

    @ObfuscatedName("ei.t(I)V")
    public static void method2638() {
        class41.field971.method3333();
        class41.field963.method3333();
    }

    @ObfuscatedName("az.q(Lfd;III)Z")
    public static boolean method655(class158 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2874(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            class72.method1801(var3);
            return true;
        }
    }

    @ObfuscatedName("ar.b(IB)Lco;")
    public static class98 method641(int arg0) {
        class98 var1 = (class98) class40.field938.method3327((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class98 var2 = class98.method528(field2959, field952, arg0, false);
        if (var2 != null) {
            class40.field938.method3340(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("y.q(Lu;Lu;IZI)I")
    public static int method2(class24 arg0, class24 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field609;
            int var5 = arg1.field609;
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
            return arg0.field608 - arg1.field608;
        } else if (arg2 == 3) {
            if (arg0.field625.equals("-")) {
                if (arg1.field625.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field625.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field625.compareTo(arg1.field625);
            }
        } else if (arg2 == 4) {
            return arg0.method537() ? (arg1.method537() ? 0 : 1) : (arg1.method537() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method543() ? (arg1.method543() ? 0 : 1) : (arg1.method543() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method536() ? (arg1.method536() ? 0 : 1) : (arg1.method536() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method534() ? (arg1.method534() ? 0 : 1) : (arg1.method534() ? -1 : 0);
        } else {
            return arg0.field616 - arg1.field616;
        }
    }

    @ObfuscatedName("dz.z(IIII)I")
    public static int method2529(int arg0, int arg1, int arg2) {
        if ((class6.field71[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (class6.field71[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("fi.v(III)I")
    public static final int method3071(int arg0, int arg1) {
        int var2 = class6.method2796(arg0 + 45365, arg1 + 91923, 4) - 128 + (class6.method2796(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (class6.method2796(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("fe.al(Ljava/lang/String;ZI)V")
    public static final void method2869(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = field2059.method3613(arg0, 250);
        int var6 = field2059.method3614(arg0, 250) * 13;
        class75.method1575(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class75.method1557(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        field2059.method3619(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        client.method150(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            client.method895(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = field1094.getGraphics();
            field1376.method1393(var7, 0, 0);
        } catch (Exception var9) {
            field1094.repaint();
        }
    }

    @ObfuscatedName("er.aa(Lat;II)V")
    public static final void method2792(class35 arg0, int arg1) {
        client.method608(arg0.field802, arg0.field762, arg1);
    }

    @ObfuscatedName("cf.bt(ZB)V")
    public static final void method1806(boolean arg0) {
        client.field453 = arg0;
        if (!client.field453) {
            int var1 = (client.field307 - client.field524.field1902) / 16;
            field122 = new int[var1][4];
            for (int var2 = 0; var2 < var1; var2++) {
                for (int var3 = 0; var3 < 4; var3++) {
                    field122[var2][var3] = client.field524.method2215();
                }
            }
            int var4 = client.field524.method2194();
            int var5 = client.field524.method2186();
            int var6 = client.field524.method2193();
            int var7 = client.field524.method2194();
            int var8 = client.field524.method2194();
            field1968 = new int[var1];
            field654 = new int[var1];
            field125 = new int[var1];
            field59 = new byte[var1][];
            field207 = new byte[var1][];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var7 / 8 == 48) {
                var9 = true;
            }
            if (var8 / 8 == 48 && var7 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        field1968[var10] = var13;
                        field654[var10] = field16.method2888("m" + var11 + "_" + var12);
                        field125[var10] = field16.method2888("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            client.method498(var8, var7, var5, var4, var6);
            return;
        }
        int var14 = client.field524.method2194();
        int var15 = client.field524.method2195();
        int var16 = client.field524.method2339();
        int var17 = client.field524.method2193();
        int var18 = client.field524.method2186();
        client.field524.method2422();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = client.field524.method2420(1);
                    if (var22 == 1) {
                        client.field324[var19][var20][var21] = client.field524.method2420(26);
                    } else {
                        client.field324[var19][var20][var21] = -1;
                    }
                }
            }
        }
        client.field524.method2421();
        int var23 = (client.field307 - client.field524.field1902) / 16;
        field122 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                field122[var24][var25] = client.field524.method2202();
            }
        }
        field1968 = new int[var23];
        field654 = new int[var23];
        field125 = new int[var23];
        field59 = new byte[var23][];
        field207 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = client.field324[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (field1968[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            field1968[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            field654[var26] = field16.method2888("m" + var35 + "_" + var36);
                            field125[var26] = field16.method2888("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        client.method498(var16, var14, var18, var17, var15);
    }

    @ObfuscatedName("j.bx(IIB)V")
    public static final void method140(int arg0, int arg1) {
        if (client.field320 < 2 && client.field508 == 0 && !client.field422) {
            return;
        }
        String var2;
        if (client.field508 == 1 && client.field320 < 2) {
            var2 = class148.field2373 + class148.field2383 + client.field421 + " " + class2.field23;
        } else if (client.field422 && client.field320 < 2) {
            var2 = client.field425 + class148.field2383 + client.field362 + " " + class2.field23;
        } else {
            int var3 = client.field320 - 1;
            String var4;
            if (client.field366[var3].length() > 0) {
                var4 = client.field414[var3] + class148.field2383 + client.field366[var3];
            } else {
                var4 = client.field414[var3];
            }
            var2 = var4;
        }
        if (client.field320 > 2) {
            var2 = var2 + class2.method2969(16777215) + " " + '/' + " " + (client.field320 - 2) + class148.field2425;
        }
        field1802.method3623(var2, arg0 + 4, arg1 + 15, 16777215, 0, client.field423 / 1000);
    }

    @ObfuscatedName("a.cd(IB)Z")
    public static boolean method513(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ct.dy(Lfb;B)Z")
    public static final boolean method2080(class164 arg0) {
        int var1 = arg0.field2672;
        if (var1 == 205) {
            client.field428 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            client.field543.method3110(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            client.field543.method3086(var4, var5 == 1);
        }
        if (var1 == 324) {
            client.field543.method3087(false);
        }
        if (var1 == 325) {
            client.field543.method3087(true);
        }
        if (var1 == 326) {
            client.field284.method2429(200);
            client.field543.method3088(client.field284);
            return true;
        } else {
            return false;
        }
    }
}
