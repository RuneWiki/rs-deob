package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("x.ar")
    public static class147 field1;

    @ObfuscatedName("ak.r")
    public static class171 field1004;

    @ObfuscatedName("ak.j")
    public static class171 field1009;

    @ObfuscatedName("ar.r")
    public static class171 field1014;

    @ObfuscatedName("ar.x")
    public static class171 field1020;

    @ObfuscatedName("aa.j")
    public static int field1035;

    @ObfuscatedName("aa.x")
    public static class171 field1037;

    @ObfuscatedName("aa.r")
    public static class171 field1039;

    @ObfuscatedName("av.x")
    public static class171 field1047;

    @ObfuscatedName("av.qx")
    public static int field1051;

    @ObfuscatedName("aj.ht")
    public static class3 field1067;

    @ObfuscatedName("aj.h")
    public static int field1068;

    @ObfuscatedName("aj.x")
    public static class171 field1070;

    @ObfuscatedName("al.r")
    public static class171 field1073;

    @ObfuscatedName("al.x")
    public static class171 field1079;

    @ObfuscatedName("ai.x")
    public static class171 field1092;

    @ObfuscatedName("ae.r")
    public static class171 field1097;

    @ObfuscatedName("ae.j")
    public static class171 field1105;

    @ObfuscatedName("ae.x")
    public static class171 field1111;

    @ObfuscatedName("ae.bh")
    public static class172 field1112;

    @ObfuscatedName("bf.x")
    public static class171 field1128;

    @ObfuscatedName("bx.x")
    public static class171 field1134;

    @ObfuscatedName("bx.pa")
    public static long field1138;

    @ObfuscatedName("bx.qi")
    public static Image field1139;

    @ObfuscatedName("bx.fe")
    public static int field1142;

    @ObfuscatedName("bh.l")
    public static int field1143;

    @ObfuscatedName("bh.bb")
    public static class172 field1146;

    @ObfuscatedName("bh.x")
    public static class171 field1151;

    @ObfuscatedName("bw.in")
    public static class177 field1181;

    @ObfuscatedName("bw.b")
    public static boolean field1190;

    @ObfuscatedName("bw.z")
    public static class171 field1199;

    @ObfuscatedName("bg.x")
    public static class171 field1215;

    @ObfuscatedName("bg.pm")
    public static Clipboard field1217;

    @ObfuscatedName("bb.j")
    public static int field1225;

    @ObfuscatedName("bb.x")
    public static int field1229;

    @ObfuscatedName("l.dz")
    public static class90 field123;

    @ObfuscatedName("bb.r")
    public static boolean field1230;

    @ObfuscatedName("l.jg")
    public static int field124;

    @ObfuscatedName("bb.iv")
    public static class33 field1243;

    @ObfuscatedName("bb.bt")
    public static String field1244;

    @ObfuscatedName("bl.cw")
    public static class147 field1260;

    @ObfuscatedName("bl.i")
    public static class171 field1265;

    @ObfuscatedName("m.dk")
    public static byte[][] field127;

    @ObfuscatedName("bc.m")
    public static float field1280;

    @ObfuscatedName("bc.p")
    public static int field1288;

    @ObfuscatedName("x.e")
    public static int[] field13;

    @ObfuscatedName("m.fq")
    public static int field130;

    @ObfuscatedName("bs.f")
    public static int[] field1318;

    @ObfuscatedName("bs.d")
    public static int[] field1322;

    @ObfuscatedName("bs.v")
    public static boolean[] field1323;

    @ObfuscatedName("bv.g")
    public static class72[] field1332;

    @ObfuscatedName("bv.v")
    public static class77[] field1336;

    @ObfuscatedName("bv.l")
    public static byte[] field1338;

    @ObfuscatedName("bv.h")
    public static int[] field1339;

    @ObfuscatedName("bv.ag")
    public static float[] field1340;

    @ObfuscatedName("bv.an")
    public static float[] field1341;

    @ObfuscatedName("bv.d")
    public static int field1342;

    @ObfuscatedName("bv.t")
    public static class64[] field1343;

    @ObfuscatedName("bv.q")
    public static class71[] field1344;

    @ObfuscatedName("bv.y")
    public static float[] field1346;

    @ObfuscatedName("bv.s")
    public static boolean[] field1347;

    @ObfuscatedName("bv.f")
    public static int field1348;

    @ObfuscatedName("bv.k")
    public static float[] field1355;

    @ObfuscatedName("bv.w")
    public static float[] field1356;

    @ObfuscatedName("bv.o")
    public static float[] field1357;

    @ObfuscatedName("bv.ah")
    public static float[] field1358;

    @ObfuscatedName("p.es")
    public static class82[] field136;

    @ObfuscatedName("bv.as")
    public static int[] field1361;

    @ObfuscatedName("bv.aq")
    public static int[] field1362;

    @ObfuscatedName("bv.m")
    public static int field1363;

    @ObfuscatedName("bv.p")
    public static int field1364;

    @ObfuscatedName("p.kf")
    public static class20 field139;

    @ObfuscatedName("bm.iu")
    public static int field1392;

    @ObfuscatedName("x.pw")
    public static int field14;

    @ObfuscatedName("p.ei")
    public static class82[] field141;

    @ObfuscatedName("br.eu")
    public static class82 field1413;

    @ObfuscatedName("cm.aw")
    public static String field1415;

    @ObfuscatedName("p.no")
    public static int field142;

    @ObfuscatedName("ca.j")
    public static int field1420;

    @ObfuscatedName("ca.x")
    public static int field1421;

    @ObfuscatedName("ca.z")
    public static int[] field1422;

    @ObfuscatedName("ca.r")
    public static int field1423;

    @ObfuscatedName("ca.i")
    public static int[] field1424;

    @ObfuscatedName("ca.l")
    public static int[] field1425;

    @ObfuscatedName("ca.m")
    public static int[] field1426;

    @ObfuscatedName("p.lb")
    public static class134 field143;

    @ObfuscatedName("cg.ic")
    public static class177 field1435;

    @ObfuscatedName("p.eg")
    public static class82 field144;

    @ObfuscatedName("ck.t")
    public static int field1448;

    @ObfuscatedName("ck.g")
    public static int field1449;

    @ObfuscatedName("ck.q")
    public static int[] field1450;

    @ObfuscatedName("cq.t")
    public static class176 field1466;

    @ObfuscatedName("cq.hy")
    public static int field1469;

    @ObfuscatedName("cq.n")
    public static class14 field1476;

    @ObfuscatedName("cw.g")
    public static int[] field1492;

    @ObfuscatedName("cx.nm")
    public static class60 field1493;

    @ObfuscatedName("cx.qz")
    public static Frame field1497;

    @ObfuscatedName("cx.qm")
    public static int field1500;

    @ObfuscatedName("cx.pp")
    public static class138 field1502;

    @ObfuscatedName("cl.dd")
    public static int[] field1506;

    @ObfuscatedName("f.po")
    public static class164 field152;

    @ObfuscatedName("ci.ag")
    public static int field1520;

    @ObfuscatedName("ci.h")
    public static int field1523;

    @ObfuscatedName("ci.u")
    public static int field1524;

    @ObfuscatedName("ci.a")
    public static int field1525;

    @ObfuscatedName("ci.bw")
    public static boolean[][] field1526;

    @ObfuscatedName("ci.bu")
    public static int field1527;

    @ObfuscatedName("ci.n")
    public static int field1528;

    @ObfuscatedName("ci.y")
    public static int field1529;

    @ObfuscatedName("ci.k")
    public static int field1530;

    @ObfuscatedName("ci.w")
    public static int field1531;

    @ObfuscatedName("ci.o")
    public static int field1532;

    @ObfuscatedName("ci.an")
    public static int field1534;

    @ObfuscatedName("ci.e")
    public static int field1535;

    @ObfuscatedName("ci.c")
    public static int field1536;

    @ObfuscatedName("ci.bg")
    public static int field1544;

    @ObfuscatedName("ci.bz")
    public static int field1548;

    @ObfuscatedName("ci.ah")
    public static int field1551;

    @ObfuscatedName("ci.as")
    public static int field1558;

    @ObfuscatedName("f.z")
    public static File field156;

    @ObfuscatedName("ci.bq")
    public static int field1565;

    @ObfuscatedName("ci.bb")
    public static int field1566;

    @ObfuscatedName("ci.bk")
    public static int field1568;

    @ObfuscatedName("ct.ff")
    public static int field1579;

    @ObfuscatedName("ct.ai")
    public static class172 field1586;

    @ObfuscatedName("cn.hd")
    public static int field1605;

    @ObfuscatedName("cn.ps")
    public static short[] field1612;

    @ObfuscatedName("ch.x")
    public static boolean field1616;

    @ObfuscatedName("cp.k")
    public static int field1617;

    @ObfuscatedName("cp.d")
    public static int field1618;

    @ObfuscatedName("cp.c")
    public static int field1625;

    @ObfuscatedName("cp.v")
    public static int field1628;

    @ObfuscatedName("cp.e")
    public static int field1629;

    @ObfuscatedName("cp.y")
    public static int field1632;

    @ObfuscatedName("cp.n")
    public static int field1633;

    @ObfuscatedName("cp.w")
    public static int field1634;

    @ObfuscatedName("cp.an")
    public static class96 field1637;

    @ObfuscatedName("cz.mc")
    public static byte field1664;

    @ObfuscatedName("cz.ph")
    public static int field1667;

    @ObfuscatedName("cs.nb")
    public static int field1668;

    @ObfuscatedName("cv.co")
    public static class228 field1681;

    @ObfuscatedName("cv.nn")
    public static int field1686;

    @ObfuscatedName("v.i")
    public static class171 field170;

    @ObfuscatedName("v.jz")
    public static class177[] field171;

    @ObfuscatedName("cr.c")
    public static int[] field1735;

    @ObfuscatedName("cr.qf")
    public static int field1739;

    @ObfuscatedName("cr.ae")
    public static class84[] field1740;

    @ObfuscatedName("da.du")
    public static int field1790;

    @ObfuscatedName("da.bm")
    public static int field1816;

    @ObfuscatedName("dr.n")
    public static int[] field1817;

    @ObfuscatedName("dr.gj")
    public static int field1819;

    @ObfuscatedName("du.g")
    public static int field1827;

    @ObfuscatedName("du.je")
    public static int field1828;

    @ObfuscatedName("du.ne")
    public static int field1832;

    @ObfuscatedName("du.e")
    public static String field1834;

    @ObfuscatedName("du.an")
    public static int[] field1836;

    @ObfuscatedName("du.cb")
    public static class150 field1837;

    @ObfuscatedName("q.t")
    public static int[] field185;

    @ObfuscatedName("q.f")
    public static short[][] field186;

    @ObfuscatedName("dj.bh")
    public static int field1869;

    @ObfuscatedName("dj.bf")
    public static int field1879;

    @ObfuscatedName("dj.bx")
    public static int field1892;

    @ObfuscatedName("t.p")
    public static byte[][] field192;

    @ObfuscatedName("do.i")
    public static byte[][][] field1922;

    @ObfuscatedName("do.bq")
    public static class172 field1923;

    @ObfuscatedName("do.hf")
    public static int field1930;

    @ObfuscatedName("dw.s")
    public static int field1939;

    @ObfuscatedName("dw.iz")
    public static int field1945;

    @ObfuscatedName("t.l")
    public static class82 field196;

    @ObfuscatedName("dh.fn")
    public static int field1965;

    @ObfuscatedName("dh.qq")
    public static int field1966;

    @ObfuscatedName("t.dl")
    public static int field197;

    @ObfuscatedName("dn.dy")
    public static int field1970;

    @ObfuscatedName("dn.qs")
    public static int field1971;

    @ObfuscatedName("dq.pz")
    public static GarbageCollectorMXBean field1988;

    @ObfuscatedName("t.mo")
    public static class26[] field200;

    @ObfuscatedName("dq.cx")
    public static char field2010;

    @ObfuscatedName("db.q")
    public static boolean field2012;

    @ObfuscatedName("db.bu")
    public static class172 field2018;

    @ObfuscatedName("dk.r")
    public static long field2033;

    @ObfuscatedName("dk.x")
    public static long field2036;

    @ObfuscatedName("dz.ft")
    public static int field2039;

    @ObfuscatedName("dz.ix")
    public static int field2041;

    @ObfuscatedName("g.nq")
    public static class59 field206;

    @ObfuscatedName("g.bv")
    public static int field208;

    @ObfuscatedName("dx.pq")
    public static class140 field2087;

    @ObfuscatedName("dx.f")
    public static class216 field2088;

    @ObfuscatedName("g.gm")
    public static class177 field209;

    @ObfuscatedName("df.m")
    public static int field2092;

    @ObfuscatedName("dm.qy")
    public static Canvas field2094;

    @ObfuscatedName("dm.bk")
    public static class172 field2095;

    @ObfuscatedName("dm.z")
    public static String[] field2097;

    @ObfuscatedName("ed.w")
    public static int[] field2099;

    @ObfuscatedName("ef.cl")
    public static int field2103;

    @ObfuscatedName("ef.m")
    public static byte[][][] field2105;

    @ObfuscatedName("er.qw")
    public static int field2117;

    @ObfuscatedName("er.ay")
    public static boolean field2118;

    @ObfuscatedName("g.ji")
    public static int field212;

    @ObfuscatedName("ek.bf")
    public static FontMetrics field2126;

    @ObfuscatedName("eg.r")
    public static File field2130;

    @ObfuscatedName("eg.qn")
    public static class137 field2134;

    @ObfuscatedName("eg.hh")
    public static int field2135;

    @ObfuscatedName("eg.nr")
    public static class60 field2136;

    @ObfuscatedName("eu.r")
    public static String field2139;

    @ObfuscatedName("eu.x")
    public static String field2142;

    @ObfuscatedName("et.bw")
    public static class172 field2166;

    @ObfuscatedName("ei.at")
    public static class150 field2190;

    @ObfuscatedName("ee.my")
    public static class82 field2206;

    @ObfuscatedName("ee.nt")
    public static int field2215;

    @ObfuscatedName("ee.nd")
    public static class78 field2216;

    @ObfuscatedName("ee.w")
    public static int[] field2220;

    @ObfuscatedName("s.nj")
    public static int field223;

    @ObfuscatedName("ex.rn")
    public static String field2231;

    @ObfuscatedName("ex.eh")
    public static class82[] field2233;

    @ObfuscatedName("s.cv")
    public static class228 field226;

    @ObfuscatedName("ej.r")
    public static String field2278;

    @ObfuscatedName("ej.x")
    public static Applet field2281;

    @ObfuscatedName("ec.b")
    public static int field2282;

    @ObfuscatedName("ec.h")
    public static String[] field2284;

    @ObfuscatedName("ec.s")
    public static String[] field2290;

    @ObfuscatedName("ec.em")
    public static class84[] field2293;

    @ObfuscatedName("ew.al")
    public static class172 field2301;

    @ObfuscatedName("ew.d")
    public static class177 field2307;

    @ObfuscatedName("fq.ai")
    public static class82[] field2323;

    @ObfuscatedName("fq.l")
    public static int field2331;

    @ObfuscatedName("ff.ce")
    public static class228 field2348;

    @ObfuscatedName("fe.ac")
    public static int field2363;

    @ObfuscatedName("fe.dr")
    public static int field2366;

    @ObfuscatedName("r.c")
    public static String field24;

    @ObfuscatedName("u.ak")
    public static class150 field255;

    @ObfuscatedName("u.bp")
    public static class172 field256;

    @ObfuscatedName("a.f")
    public static int[] field258;

    @ObfuscatedName("r.mv")
    public static int field26;

    @ObfuscatedName("fl.pe")
    public static class9 field2660;

    @ObfuscatedName("fh.m")
    public static class84 field2661;

    @ObfuscatedName("fo.fu")
    public static int field2702;

    @ObfuscatedName("e.ah")
    public static int[] field271;

    @ObfuscatedName("fv.p")
    public static short[] field2713;

    @ObfuscatedName("fz.b")
    public static int field2723;

    @ObfuscatedName("fn.ga")
    public static class177 field2726;

    @ObfuscatedName("fp.db")
    public static int[] field2735;

    @ObfuscatedName("fw.ih")
    public static int field2750;

    @ObfuscatedName("fb.q")
    public static int[] field2767;

    @ObfuscatedName("fy.f")
    public static class19 field2768;

    @ObfuscatedName("e.p")
    public static class84[] field277;

    @ObfuscatedName("fi.x")
    public static class147 field2775;

    @ObfuscatedName("fi.j")
    public static long field2777;

    @ObfuscatedName("e.bh")
    public static class84 field278;

    @ObfuscatedName("e.t")
    public static String field279;

    @ObfuscatedName("fx.dq")
    public static int[] field2800;

    @ObfuscatedName("fj.r")
    public static boolean[] field2872;

    @ObfuscatedName("fj.x")
    public static class177[][] field2905;

    @ObfuscatedName("fd.b")
    public static class171 field2952;

    @ObfuscatedName("fk.j")
    public static class171 field2963;

    @ObfuscatedName("fk.z")
    public static class76 field2964;

    @ObfuscatedName("fk.gu")
    public static class177 field2966;

    @ObfuscatedName("fg.x")
    public static class171 field2968;

    @ObfuscatedName("gl.l")
    public static short[] field2976;

    @ObfuscatedName("gh.rs")
    public static boolean field2992;

    @ObfuscatedName("gz.q")
    public static class63 field3007;

    @ObfuscatedName("gz.z")
    public static class188 field3009;

    @ObfuscatedName("gz.b")
    public static class171 field3011;

    @ObfuscatedName("gz.p")
    public static int field3012;

    @ObfuscatedName("gz.x")
    public static class171 field3014;

    @ObfuscatedName("gz.j")
    public static class171 field3015;

    @ObfuscatedName("gz.d")
    public static boolean field3017;

    @ObfuscatedName("gz.v")
    public static class184 field3018;

    @ObfuscatedName("gf.bl")
    public static class172 field3050;

    @ObfuscatedName("ga.di")
    public static int field3085;

    @ObfuscatedName("gx.j")
    public static int field3105;

    @ObfuscatedName("gx.dt")
    public static int[][] field3106;

    @ObfuscatedName("gx.i")
    public static File field3108;

    @ObfuscatedName("gx.bg")
    public static class172 field3109;

    @ObfuscatedName("client.be")
    public static class172 field312;

    @ObfuscatedName("hq.qh")
    public static int field3176;

    @ObfuscatedName("client.by")
    public static int field318;

    @ObfuscatedName("hm.j")
    public static class171 field3187;

    @ObfuscatedName("hm.z")
    public static class171 field3189;

    @ObfuscatedName("ha.g")
    public static int[][][] field3215;

    @ObfuscatedName("hs.r")
    public static class171 field3217;

    @ObfuscatedName("hk.x")
    public static class117 field3233;

    @ObfuscatedName("hd.f")
    public static class84[] field3244;

    @ObfuscatedName("hz.i")
    public static int field3260;

    @ObfuscatedName("hb.j")
    public static class84 field3277;

    @ObfuscatedName("client.ey")
    public static class84[] field359;

    @ObfuscatedName("client.j")
    public static client field378;

    @ObfuscatedName("client.ep")
    public static class82[] field451;

    @ObfuscatedName("client.nh")
    public static int field462;

    @ObfuscatedName("z.pf")
    public static class225 field56;

    @ObfuscatedName("client.fm")
    public static int field565;

    @ObfuscatedName("c.pn")
    public static int field567;

    @ObfuscatedName("c.b")
    public static int[] field568;

    @ObfuscatedName("c.nx")
    public static int field572;

    @ObfuscatedName("n.f")
    public static class84 field577;

    @ObfuscatedName("y.r")
    public static int field584;

    @ObfuscatedName("y.bn")
    public static class172 field585;

    @ObfuscatedName("y.dc")
    public static byte[][] field588;

    @ObfuscatedName("w.n")
    public static String field621;

    @ObfuscatedName("o.m")
    public static short[][] field625;

    @ObfuscatedName("o.id")
    public static int field627;

    @ObfuscatedName("o.s")
    public static class123 field631;

    @ObfuscatedName("o.eb")
    public static class82[] field632;

    @ObfuscatedName("ah.mt")
    public static byte field637;

    @ObfuscatedName("ah.bx")
    public static class84[] field638;

    @ObfuscatedName("an.ae")
    public static class172 field645;

    @ObfuscatedName("an.o")
    public static int[] field660;

    @ObfuscatedName("ag.da")
    public static int field676;

    @ObfuscatedName("ag.d")
    public static class228 field677;

    @ObfuscatedName("ag.e")
    public static class123 field678;

    @ObfuscatedName("as.ee")
    public static class82[] field687;

    @ObfuscatedName("as.et")
    public static class84[] field690;

    @ObfuscatedName("aq.cq")
    public static class147 field695;

    @ObfuscatedName("ap.z")
    public static class84 field722;

    @ObfuscatedName("ap.i")
    public static class84[] field723;

    @ObfuscatedName("ap.d")
    public static class84 field724;

    @ObfuscatedName("ap.a")
    public static int[] field731;

    @ObfuscatedName("b.p")
    public static int[][] field75;

    @ObfuscatedName("ap.bz")
    public static class172 field754;

    @ObfuscatedName("b.b")
    public static byte[][][] field76;

    @ObfuscatedName("b.l")
    public static byte[][][] field77;

    @ObfuscatedName("af.l")
    public static class157 field773;

    @ObfuscatedName("af.p")
    public static class158 field776;

    @ObfuscatedName("af.i")
    public static class28[] field777;

    @ObfuscatedName("af.ns")
    public static int field778;

    @ObfuscatedName("af.bx")
    public static class172 field780;

    @ObfuscatedName("af.aj")
    public static long field781;

    @ObfuscatedName("af.f")
    public static int field786;

    @ObfuscatedName("b.d")
    public static int[] field79;

    @ObfuscatedName("af.t")
    public static class232[] field791;

    @ObfuscatedName("b.v")
    public static int[] field80;

    @ObfuscatedName("at.j")
    public static int[] field805;

    @ObfuscatedName("at.v")
    public static class177 field808;

    @ObfuscatedName("at.qv")
    public static Font field816;

    @ObfuscatedName("b.z")
    public static byte[][][] field86;

    @ObfuscatedName("b.nl")
    public static int field87;

    @ObfuscatedName("ad.g")
    public static String field879;

    @ObfuscatedName("ad.qk")
    public static class81 field883;

    @ObfuscatedName("ad.b")
    public static class82 field884;

    @ObfuscatedName("am.r")
    public static class171 field886;

    @ObfuscatedName("am.x")
    public static class171 field895;

    @ObfuscatedName("b.ke")
    public static class135 field92;

    @ObfuscatedName("am.bi")
    public static int field921;

    @ObfuscatedName("ac.r")
    public static class171 field925;

    @ObfuscatedName("b.bf")
    public static class84[] field93;

    @ObfuscatedName("ac.qg")
    public static int field936;

    @ObfuscatedName("ac.ex")
    public static class82[] field943;

    @ObfuscatedName("aw.x")
    public static class171 field983;

    @ObfuscatedName("cm.x([Ljava/lang/String;[SI)V")
    public static void method1580(String[] arg0, short[] arg1) {
        class128.method995(arg0, arg1, 0, arg0.length - 1);
    }

    @ObfuscatedName("dz.x(Ljava/lang/CharSequence;B)J")
    public static long method2361(CharSequence arg0) {
        long var1 = 0L;
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            var1 *= 37L;
            char var5 = arg0.charAt(var4);
            if (var5 >= 'A' && var5 <= 'Z') {
                var1 += (long) (var5 + 1 - 65);
            } else if (var5 >= 'a' && var5 <= 'z') {
                var1 += (long) (var5 + 1 - 97);
            } else if (var5 >= '0' && var5 <= '9') {
                var1 += (long) (var5 + 27 - 48);
            }
            if (var1 >= 177917621779460413L) {
                break;
            }
        }
        while (var1 % 37L == 0L && var1 != 0L) {
            var1 /= 37L;
        }
        return var1;
    }

    @ObfuscatedName("eo.r(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;B)Ljava/lang/Object;")
    public static Object method2743(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }

    @ObfuscatedName("bf.x(II)Lbh;")
    public static class55 method1038(int arg0) {
        class55 var1 = (class55) class55.field1144.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field1151.method3079(5, arg0);
        class55 var3 = new class55();
        if (var2 != null) {
            var3.method1058(new class123(var2));
        }
        class55.field1144.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.r(Ldg;I)V")
    public static void method980(class126 arg0) {
        class214 var1 = (class214) class215.field3188.method3647();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field2057;
        arg0.method2396(var1.field3185);
        for (int var3 = 0; var3 < var1.field3183; var3++) {
            if (var1.field3180[var3] == 0) {
                try {
                    int var4 = var1.field3178[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field3181[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2567(0);
                        arg0.method2396(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field3181[var3];
                        var7.setInt((Object) null, var1.field3182[var3]);
                        arg0.method2567(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field3181[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2567(0);
                        arg0.method2396(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field3177[var3];
                        byte[][] var11 = var1.field3184[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2567(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2567(1);
                            arg0.method2398(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2567(2);
                            arg0.method2468((String) var15);
                        } else {
                            arg0.method2567(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field3177[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2567(0);
                        arg0.method2396(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2567(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2567(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2567(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2567(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2567(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2567(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2567(-16);
                } catch (SecurityException var37) {
                    arg0.method2567(-17);
                } catch (IOException var38) {
                    arg0.method2567(-18);
                } catch (NullPointerException var39) {
                    arg0.method2567(-19);
                } catch (Exception var40) {
                    arg0.method2567(-20);
                } catch (Throwable var41) {
                    arg0.method2567(-21);
                }
            } else {
                arg0.method2567(var1.field3180[var3]);
            }
        }
        arg0.method2430(var2);
        var1.method3695();
    }

    @ObfuscatedName("co.r(II)Lal;")
    public static class50 method2117(int arg0) {
        class50 var1 = (class50) class50.field1077.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field1079.method3079(33, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method965(new class123(var2));
        }
        class50.field1077.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ep.z(III)I")
    public static int method2976(int arg0, int arg1) {
        int var2 = 0;
        while (arg1 > 0) {
            var2 = var2 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var2;
    }

    @ObfuscatedName("z.b(IB)V")
    public static void method46(int arg0) {
        class16 var1 = (class16) class16.field229.method3580((long) arg0);
        if (var1 != null) {
            var1.method3695();
        }
    }

    @ObfuscatedName("cn.z(IIII)V")
    public static final void method2003(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                class6.field94[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class6.field94[arg0][arg1][arg2 + var5] = class6.field94[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class6.field94[arg0][arg1 + var6][arg2] = class6.field94[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && class6.field94[arg0][arg1 - 1][arg2] != 0) {
            class6.field94[arg0][arg1][arg2] = class6.field94[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && class6.field94[arg0][arg1][arg2 - 1] != 0) {
            class6.field94[arg0][arg1][arg2] = class6.field94[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && class6.field94[arg0][arg1 - 1][arg2 - 1] != 0) {
            class6.field94[arg0][arg1][arg2] = class6.field94[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ds.r(Ljava/lang/Throwable;Ljava/lang/String;)Lej;")
    public static class152 method2695(Throwable arg0, String arg1) {
        class152 var2;
        if (arg0 instanceof class152) {
            var2 = (class152) arg0;
            var2.field2279 = var2.field2279 + ' ' + arg1;
        } else {
            var2 = new class152(arg0, arg1);
        }
        return var2;
    }

    @ObfuscatedName("x.m(S)Lcd;")
    public static class82 method4() {
        class82 var0 = new class82();
        var0.field1441 = field1423;
        var0.field1442 = field1420;
        var0.field1440 = field1422[0];
        var0.field1446 = field1424[0];
        var0.field1437 = field568[0];
        var0.field1438 = field1425[0];
        int var1 = var0.field1438 * var0.field1437;
        byte[] var2 = field192[0];
        var0.field1436 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field1436[var3] = field1426[var2[var3] & 0xFF];
        }
        class80.method186();
        return var0;
    }

    @ObfuscatedName("e.m(IIII)I")
    public static final int method210(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("es.az(I)V")
    public static void method2831() {
        class141.method2002(field2094);
        Canvas var0 = field2094;
        var0.removeMouseListener(class144.field2221);
        var0.removeMouseMotionListener(class144.field2221);
        var0.removeFocusListener(class144.field2221);
        class144.field2201 = 0;
        if (field92 != null) {
            field92.method2734(field2094);
        }
        field378.method2900();
        field2094.setBackground(Color.black);
        Canvas var1 = field2094;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class141.field2170);
        var1.addFocusListener(class141.field2170);
        class144.method181(field2094);
        if (field92 != null) {
            field92.method2733(field2094);
        }
        if (client.field559 != -1) {
            int var2 = client.field559;
            int var3 = field1500;
            int var4 = field3176;
            if (class177.method3201(var2)) {
                client.method346(field2905[var2], -1, var3, var4, false);
            }
        }
        client.field2260 = true;
    }

    @ObfuscatedName("j.at(IIIII)V")
    public static final void method43(int arg0, int arg1, int arg2, int arg3) {
        client.field387++;
        client.method1(class36.field783);
        boolean var4 = false;
        if (client.field412 >= 0) {
            int var5 = class35.field761;
            int[] var6 = class35.field756;
            for (int var7 = 0; var7 < var5; var7++) {
                if (client.field412 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            client.method1(class36.field774);
        }
        method2978(true);
        client.method1(var4 ? class36.field779 : class36.field775);
        method2978(false);
        for (class7 var8 = (class7) client.field415.method3600(); var8 != null; var8 = (class7) client.field415.method3602()) {
            if (field1819 != var8.field100 || client.field291 > var8.field106) {
                var8.method3695();
            } else if (client.field291 >= var8.field102) {
                if (var8.field109 > 0) {
                    class37 var9 = client.field319[var8.field109 - 1];
                    if (var9 != null && var9.field852 >= 0 && var9.field852 < 13312 && var9.field869 >= 0 && var9.field869 < 13312) {
                        var8.method102(var9.field852, var9.field869, client.method905(var9.field852, var9.field869, var8.field100) - var8.field104, client.field291);
                    }
                }
                if (var8.field109 < 0) {
                    int var10 = -var8.field109 - 1;
                    class3 var11;
                    if (client.field404 == var10) {
                        var11 = field1067;
                    } else {
                        var11 = client.field510[var10];
                    }
                    if (var11 != null && var11.field852 >= 0 && var11.field852 < 13312 && var11.field869 >= 0 && var11.field869 < 13312) {
                        var8.method102(var11.field852, var11.field869, client.method905(var11.field852, var11.field869, var8.field100) - var8.field104, client.field291);
                    }
                }
                var8.method103(client.field330);
                field123.method1987(field1819, (int) var8.field107, (int) var8.field111, (int) var8.field114, 60, var8, var8.field119, -1, false);
            }
        }
        client.method2992();
        method116(arg0, arg1, arg2, arg3, true);
        int var12 = client.field543;
        int var13 = client.field348;
        int var14 = client.field545;
        int var15 = client.field339;
        class83.method1722(var12, var13, var12 + var14, var13 + var15);
        class95.method2023();
        if (!client.field419) {
            int var16 = client.field366;
            if (client.field375 / 256 > var16) {
                var16 = client.field375 / 256;
            }
            if (client.field530[4] && client.field563[4] + 128 > var16) {
                var16 = client.field563[4] + 128;
            }
            int var17 = client.field491 + client.field367 & 0x7FF;
            client.method569(field1965, client.method905(field1067.field852, field1067.field869, field1819) - client.field372, field2702, var16, var17, var16 * 3 + 600);
        }
        int var30;
        if (client.field419) {
            int var31;
            if (field2660.field146) {
                var31 = field1819;
            } else {
                int var32 = client.method905(field130, field1579, field1819);
                if (var32 - field2039 >= 800 || (class6.field72[field1819][field130 >> 7][field1579 >> 7] & 0x4) == 0) {
                    var31 = 3;
                } else {
                    var31 = field1819;
                }
            }
            var30 = var31;
        } else {
            int var18;
            if (field2660.field146) {
                var18 = field1819;
            } else {
                label322: {
                    int var19 = 3;
                    if (field1142 < 310) {
                        int var20 = field130 >> 7;
                        int var21 = field1579 >> 7;
                        int var22 = field1067.field852 >> 7;
                        int var23 = field1067.field869 >> 7;
                        if (var20 < 0 || var21 < 0 || var20 >= 104 || var21 >= 104) {
                            var18 = field1819;
                            break label322;
                        }
                        if ((class6.field72[field1819][var20][var21] & 0x4) != 0) {
                            var19 = field1819;
                        }
                        int var24;
                        if (var22 > var20) {
                            var24 = var22 - var20;
                        } else {
                            var24 = var20 - var22;
                        }
                        int var25;
                        if (var23 > var21) {
                            var25 = var23 - var21;
                        } else {
                            var25 = var21 - var23;
                        }
                        if (var24 > var25) {
                            int var26 = var25 * 65536 / var24;
                            int var27 = 32768;
                            while (var20 != var22) {
                                if (var20 < var22) {
                                    var20++;
                                } else if (var20 > var22) {
                                    var20--;
                                }
                                if ((class6.field72[field1819][var20][var21] & 0x4) != 0) {
                                    var19 = field1819;
                                }
                                var27 += var26;
                                if (var27 >= 65536) {
                                    var27 -= 65536;
                                    if (var21 < var23) {
                                        var21++;
                                    } else if (var21 > var23) {
                                        var21--;
                                    }
                                    if ((class6.field72[field1819][var20][var21] & 0x4) != 0) {
                                        var19 = field1819;
                                    }
                                }
                            }
                        } else {
                            int var28 = var24 * 65536 / var25;
                            int var29 = 32768;
                            while (var21 != var23) {
                                if (var21 < var23) {
                                    var21++;
                                } else if (var21 > var23) {
                                    var21--;
                                }
                                if ((class6.field72[field1819][var20][var21] & 0x4) != 0) {
                                    var19 = field1819;
                                }
                                var29 += var28;
                                if (var29 >= 65536) {
                                    var29 -= 65536;
                                    if (var20 < var22) {
                                        var20++;
                                    } else if (var20 > var22) {
                                        var20--;
                                    }
                                    if ((class6.field72[field1819][var20][var21] & 0x4) != 0) {
                                        var19 = field1819;
                                    }
                                }
                            }
                        }
                    }
                    if (field1067.field852 >= 0 && field1067.field869 >= 0 && field1067.field852 < 13312 && field1067.field869 < 13312) {
                        if ((class6.field72[field1819][field1067.field852 >> 7][field1067.field869 >> 7] & 0x4) != 0) {
                            var19 = field1819;
                        }
                        var18 = var19;
                    } else {
                        var18 = field1819;
                    }
                }
            }
            var30 = var18;
        }
        int var33 = field130;
        int var34 = field2039;
        int var35 = field1579;
        int var36 = field1142;
        int var37 = field565;
        for (int var38 = 0; var38 < 5; var38++) {
            if (client.field530[var38]) {
                int var39 = (int) (Math.random() * (double) (client.field531[var38] * 2 + 1) - (double) client.field531[var38] + Math.sin((double) client.field504[var38] / 100.0D * (double) client.field534[var38]) * (double) client.field563[var38]);
                if (var38 == 0) {
                    field130 += var39;
                }
                if (var38 == 1) {
                    field2039 += var39;
                }
                if (var38 == 2) {
                    field1579 += var39;
                }
                if (var38 == 3) {
                    field565 = field565 + var39 & 0x7FF;
                }
                if (var38 == 4) {
                    field1142 += var39;
                    if (field1142 < 128) {
                        field1142 = 128;
                    }
                    if (field1142 > 383) {
                        field1142 = 383;
                    }
                }
            }
        }
        int var40 = class144.field2205;
        int var41 = class144.field2211 * -117362325;
        if (class144.field2199 != 0) {
            var40 = class144.field2212;
            var41 = class144.field2214;
        }
        if (var40 >= var12 && var40 < var12 + var14 && var41 >= var13 && var41 < var13 + var15) {
            class109.field1911 = true;
            class109.field1914 = 0;
            class109.field1899 = var40 - var12;
            class109.field1905 = var41 - var13;
        } else {
            class109.field1911 = false;
            class109.field1914 = 0;
        }
        client.method2004();
        class83.method1728(var12, var13, var14, var15, 0);
        client.method2004();
        int var42 = class95.field1627;
        class95.field1627 = client.field547;
        field123.method1863(field130, field2039, field1579, field1142, field565, var30);
        class95.field1627 = var42;
        client.method2004();
        field123.method1950();
        client.method540(var12, var13, var14, var15);
        if (client.field526 == 2) {
            method3262((client.field420 - field676 << 7) + client.field356, (client.field303 - field2366 << 7) + client.field306, client.field304 * 2);
            if (client.field388 > -1 && client.field291 % 20 < 10) {
                field2233[0].method1637(client.field388 + var12 - 12, client.field389 + var13 - 28);
            }
        }
        ((class99) field1637).method2102(client.field330);
        client.method3252(var12, var13, var14, var15);
        field130 = var33;
        field2039 = var34;
        field1579 = var35;
        field1142 = var36;
        field565 = var37;
        if (client.field290) {
            byte var43 = 0;
            int var44 = class175.field2795 + class175.field2786 + var43;
            if (var44 == 0) {
                client.field290 = false;
            }
        }
        if (client.field290) {
            class83.method1728(var12, var13, var14, var15, 0);
            client.method910(class161.field2382, false);
        }
    }

    @ObfuscatedName("f.ay(IIIIZI)V")
    public static final void method116(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        if (var5 < 0) {
            var5 = 0;
        } else if (var5 > 100) {
            var5 = 100;
        }
        int var6 = (client.field332 - client.field499) * var5 / 100 + client.field499;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < client.field541) {
            short var8 = client.field541;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > client.field540) {
                var6 = client.field540;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class83.method1721();
                    class83.method1728(arg0, arg1, var10, arg3, -16777216);
                    class83.method1728(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > client.field285) {
            short var11 = client.field285;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < client.field539) {
                var6 = client.field539;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class83.method1721();
                    class83.method1728(arg0, arg1, arg2, var13, -16777216);
                    class83.method1728(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (client.field538 - client.field393) * var5 / 100 + client.field393;
        client.field547 = arg3 * var6 * var14 / 85504 << 1;
        if (client.field545 != arg2 || client.field339 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class95.field1640[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class90.method1860(var15, 500, 800, arg2, arg3);
        }
        client.field543 = arg0;
        client.field348 = arg1;
        client.field545 = arg2;
        client.field339 = arg3;
    }

    @ObfuscatedName("ej.am(ZI)V")
    public static final void method2978(boolean arg0) {
        for (int var1 = 0; var1 < client.field320; var1++) {
            class37 var2 = client.field319[client.field321[var1]];
            int var3 = (client.field321[var1] << 14) + 536870912;
            if (var2 != null && var2.method23() && var2.field793.field893 == arg0 && var2.field793.method749()) {
                int var4 = var2.field852 >> 7;
                int var5 = var2.field869 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field822 == 1 && (var2.field852 & 0x7F) == 64 && (var2.field869 & 0x7F) == 64) {
                        if (client.field387 == client.field386[var4][var5]) {
                            continue;
                        }
                        client.field386[var4][var5] = client.field387;
                    }
                    if (!var2.field793.field918) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    field123.method1987(field1819, var2.field852, var2.field869, client.method905(var2.field852 + (var2.field822 * 64 - 64), var2.field869 + (var2.field822 * 64 - 64), field1819), var2.field822 * 64 - 64 + 60, var2, var2.field820, var3, var2.field821);
                }
            }
        }
    }

    @ObfuscatedName("ej.aw(Lay;IIIIII)V")
    public static final void method2981(class40 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method23()) {
            return;
        }
        if (arg0 instanceof class37) {
            class42 var6 = ((class37) arg0).field793;
            if (var6.field915 != null) {
                var6 = var6.method748();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class35.field761;
        int[] var8 = class35.field756;
        int var9 = 3;
        if (!arg0.field819.method3639()) {
            client.method1132(arg0, arg0.field868 + 15);
            for (class27 var10 = (class27) arg0.field819.method3647(); var10 != null; var10 = (class27) arg0.field819.method3632()) {
                class21 var11 = var10.method580(client.field291);
                if (var11 != null) {
                    class50 var12 = var10.field635;
                    class82 var13 = var12.method964();
                    class82 var14 = var12.method979();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field1084;
                    } else {
                        if (var12.field1085 * 2 < var14.field1437) {
                            var15 = var12.field1085;
                        }
                        var16 = var14.field1437 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = client.field291 - var11.field574;
                    int var20 = var11.field566 * var16 / var12.field1084;
                    int var23;
                    if (var11.field569 > var19) {
                        int var21 = var12.field1080 == 0 ? 0 : var19 / var12.field1080 * var12.field1080;
                        int var22 = var11.field571 * var16 / var12.field1084;
                        var23 = (var20 - var22) * var21 / var11.field569 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field569 + var12.field1081 - var19;
                        if (var12.field1074 >= 0) {
                            var17 = (var24 << 8) / (var12.field1081 - var12.field1074);
                        }
                    }
                    if (var11.field566 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = client.field388 + arg2 - (var16 >> 1);
                    int var26 = client.field389 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (client.field388 > -1) {
                            class83.method1728(var25, var26, var23, 5, 65280);
                            class83.method1728(var23 + var25, var26, var16 - var23, 5, 16711680);
                        }
                        var9 += 7;
                    } else {
                        int var27 = var25 - var15;
                        int var28;
                        if (var16 == var23) {
                            var28 = var15 * 2 + var23;
                        } else {
                            var28 = var15 + var23;
                        }
                        int var29 = var13.field1438;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method1627(var27, var26, var17);
                            class83.method1723(var27, var26, var27 + var28, var26 + var29);
                            var14.method1627(var27, var26, var17);
                        } else {
                            var13.method1637(var27, var26);
                            class83.method1723(var27, var26, var27 + var28, var26 + var29);
                            var14.method1637(var27, var26);
                        }
                        class83.method1722(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method576()) {
                    var10.method3695();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class3 var30 = (class3) arg0;
            if (var30.field30) {
                return;
            }
            if (var30.field29 != -1 || var30.field42 != -1) {
                client.method1132(arg0, arg0.field868 + 15);
                if (client.field388 > -1) {
                    if (var30.field29 != -1) {
                        field136[var30.field29].method1637(client.field388 + arg2 - 12, client.field389 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field42 != -1) {
                        field687[var30.field42].method1637(client.field388 + arg2 - 12, client.field389 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && client.field526 == 10 && client.field301 == var8[arg1]) {
                client.method1132(arg0, arg0.field868 + 15);
                if (client.field388 > -1) {
                    field2233[1].method1637(client.field388 + arg2 - 12, client.field389 + arg3 - var9);
                }
            }
        } else {
            class42 var31 = ((class37) arg0).field793;
            if (var31.field915 != null) {
                var31 = var31.method748();
            }
            if (var31.field896 >= 0 && var31.field896 < field687.length) {
                client.method1132(arg0, arg0.field868 + 15);
                if (client.field388 > -1) {
                    field687[var31.field896].method1637(client.field388 + arg2 - 12, client.field389 + arg3 - 30);
                }
            }
            if (client.field526 == 1 && client.field300 == client.field321[arg1 - var7] && client.field291 % 20 < 10) {
                client.method1132(arg0, arg0.field868 + 15);
                if (client.field388 > -1) {
                    field2233[0].method1637(client.field388 + arg2 - 12, client.field389 + arg3 - 28);
                }
            }
        }
        if (arg0.field867 != null && (arg1 >= var7 || !arg0.field833 && (client.field443 == 4 || !arg0.field829 && (client.field443 == 0 || client.field443 == 3 || client.field443 == 1 && client.method2294(((class3) arg0).field28, false))))) {
            client.method1132(arg0, arg0.field868);
            if (client.field388 > -1 && client.field376 < client.field363) {
                client.field357[client.field376] = field1681.method3849(arg0.field867) / 2;
                client.field380[client.field376] = field1681.field3241;
                client.field476[client.field376] = client.field388;
                client.field379[client.field376] = client.field389;
                client.field560[client.field376] = arg0.field835;
                client.field383[client.field376] = arg0.field863;
                client.field384[client.field376] = arg0.field839;
                client.field385[client.field376] = arg0.field867;
                client.field376++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field877[var32];
            int var34 = arg0.field838[var32];
            class52 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= client.field291) {
                    continue;
                }
                var35 = class52.method921(arg0.field838[var32]);
                var36 = var35.field1107;
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field841[var32];
            class52 var38 = null;
            if (var37 >= 0) {
                var38 = class52.method921(var37);
            }
            if (var33 - var36 <= client.field291) {
                if (var35 == null) {
                    arg0.field877[var32] = -1;
                } else {
                    client.method1132(arg0, arg0.field868 / 2);
                    if (client.field388 > -1) {
                        if (var32 == 1) {
                            client.field389 -= 20;
                        }
                        if (var32 == 2) {
                            client.field388 -= 15;
                            client.field389 -= 10;
                        }
                        if (var32 == 3) {
                            client.field388 += 15;
                            client.field389 -= 10;
                        }
                        Object var39 = null;
                        Object var40 = null;
                        Object var41 = null;
                        Object var42 = null;
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        int var49 = 0;
                        int var50 = 0;
                        class82 var51 = null;
                        class82 var52 = null;
                        class82 var53 = null;
                        class82 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class82 var64 = var35.method1004();
                        if (var64 != null) {
                            var43 = var64.field1437;
                            int var65 = var64.field1438;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field1440;
                        }
                        class82 var66 = var35.method997();
                        if (var66 != null) {
                            var44 = var66.field1437;
                            int var67 = var66.field1438;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field1440;
                        }
                        class82 var68 = var35.method1002();
                        if (var68 != null) {
                            var45 = var68.field1437;
                            int var69 = var68.field1438;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field1440;
                        }
                        class82 var70 = var35.method1014();
                        if (var70 != null) {
                            var46 = var70.field1437;
                            int var71 = var70.field1438;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field1440;
                        }
                        if (var38 != null) {
                            var51 = var38.method1004();
                            if (var51 != null) {
                                var55 = var51.field1437;
                                int var72 = var51.field1438;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field1440;
                            }
                            var52 = var38.method997();
                            if (var52 != null) {
                                var56 = var52.field1437;
                                int var73 = var52.field1438;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field1440;
                            }
                            var53 = var38.method1002();
                            if (var53 != null) {
                                var57 = var53.field1437;
                                int var74 = var53.field1438;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field1440;
                            }
                            var54 = var38.method1014();
                            if (var54 != null) {
                                var58 = var54.field1437;
                                int var75 = var54.field1438;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field1440;
                            }
                        }
                        class228 var76 = var35.method1019();
                        if (var76 == null) {
                            var76 = field226;
                        }
                        class228 var77;
                        if (var38 == null) {
                            var77 = field226;
                        } else {
                            var77 = var38.method1019();
                            if (var77 == null) {
                                var77 = field226;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method1020(arg0.field834[var32]);
                        int var83 = var76.method3849(var82);
                        if (var38 != null) {
                            var79 = var38.method1020(arg0.field842[var32]);
                            var81 = var77.method3849(var79);
                        }
                        int var84 = 0;
                        int var85 = 0;
                        if (var44 > 0) {
                            if (var68 == null && var70 == null) {
                                var84 = 1;
                            } else {
                                var84 = var83 / var44 + 1;
                            }
                        }
                        if (var38 != null && var56 > 0) {
                            if (var53 == null && var54 == null) {
                                var85 = 1;
                            } else {
                                var85 = var81 / var56 + 1;
                            }
                        }
                        int var86 = 0;
                        int var87 = var86;
                        if (var43 > 0) {
                            var86 += var43;
                        }
                        var86 += 2;
                        int var88 = var86;
                        if (var45 > 0) {
                            var86 += var45;
                        }
                        int var89 = var86;
                        int var90 = var86;
                        int var92;
                        if (var44 > 0) {
                            int var91 = var44 * var84;
                            var92 = var86 + var91;
                            var90 = (var91 - var83) / 2 + var86;
                        } else {
                            var92 = var83 + var86;
                        }
                        int var93 = var92;
                        if (var46 > 0) {
                            var92 += var46;
                        }
                        int var94 = 0;
                        int var95 = 0;
                        int var96 = 0;
                        int var97 = 0;
                        int var98 = 0;
                        if (var38 != null) {
                            var92 += 2;
                            var94 = var92;
                            if (var55 > 0) {
                                var92 += var55;
                            }
                            var92 += 2;
                            var95 = var92;
                            if (var57 > 0) {
                                var92 += var57;
                            }
                            var96 = var92;
                            var98 = var92;
                            if (var56 > 0) {
                                int var99 = var56 * var85;
                                var92 += var99;
                                var98 += (var99 - var81) / 2;
                            } else {
                                var92 += var81;
                            }
                            var97 = var92;
                            if (var58 > 0) {
                                var92 += var58;
                            }
                        }
                        int var100 = arg0.field877[var32] - client.field291;
                        int var101 = var35.field1106 - var35.field1106 * var100 / var35.field1107;
                        int var102 = var35.field1117 * var100 / var35.field1107 + -var35.field1117;
                        int var103 = client.field388 + arg2 - (var92 >> 1) + var101;
                        int var104 = client.field389 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field1116 + var104 + 15;
                        int var108 = var107 - var76.field3235;
                        int var109 = var76.field3243 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field1116 + var104 + 15;
                            int var111 = var110 - var77.field3235;
                            int var112 = var77.field3243 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field1113 >= 0) {
                            var115 = (var100 << 8) / (var35.field1107 - var35.field1113);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method1627(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method1627(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method1627(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method1627(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3794(var82, var90 + var103, var107, var35.field1096, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method1627(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method1627(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method1627(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method1627(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3794(var79, var98 + var103, var110, var38.field1096, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method1637(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method1637(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method1637(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method1637(var93 + var103 - var50, var104);
                            }
                            var76.method3829(var82, var90 + var103, var107, var35.field1096 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method1637(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method1637(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method1637(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method1637(var97 + var103 - var62, var104);
                                }
                                var77.method3829(var79, var98 + var103, var110, var38.field1096 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fa.aj(IIII)V")
    public static final void method3262(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            client.field388 = -1;
            client.field389 = -1;
            return;
        }
        int var3 = client.method905(arg0, arg1, field1819) - arg2;
        int var4 = arg0 - field130;
        int var5 = var3 - field2039;
        int var6 = arg1 - field1579;
        int var7 = class95.field1640[field1142];
        int var8 = class95.field1641[field1142];
        int var9 = class95.field1640[field565];
        int var10 = class95.field1641[field565];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            client.field388 = client.field547 * var11 / var15 + client.field545 / 2;
            client.field389 = client.field547 * var14 / var15 + client.field339 / 2;
        } else {
            client.field388 = -1;
            client.field389 = -1;
        }
    }

    @ObfuscatedName("u.bf(III)V")
    public static final void method185(int arg0, int arg1) {
        if (field1790 == arg0 && field3085 == arg1) {
            return;
        }
        field1790 = arg0;
        field3085 = arg1;
        client.method2720(25);
        client.method910(class161.field2382, true);
        int var2 = field676;
        int var3 = field2366;
        field676 = (arg0 - 6) * 8;
        field2366 = (arg1 - 6) * 8;
        int var4 = field676 - var2;
        int var5 = field2366 - var3;
        int var6 = field676;
        int var7 = field2366;
        for (int var8 = 0; var8 < 32768; var8++) {
            class37 var9 = client.field319[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field873[var10] -= var4;
                    var9.field874[var10] -= var5;
                }
                var9.field852 -= var4 * 128;
                var9.field869 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = client.field510[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field873[var13] -= var4;
                    var12.field874[var13] -= var5;
                }
                var12.field852 -= var4 * 128;
                var12.field869 -= var5 * 128;
            }
        }
        byte var14 = 0;
        byte var15 = 104;
        byte var16 = 1;
        if (var4 < 0) {
            var14 = 103;
            var15 = -1;
            var16 = -1;
        }
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var5 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var21 = var17; var21 != var18; var21 += var19) {
                int var22 = var4 + var20;
                int var23 = var5 + var21;
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                        client.field413[var24][var20][var21] = client.field413[var24][var22][var23];
                    } else {
                        client.field413[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) client.field414.method3600(); var25 != null; var25 = (class17) client.field414.method3602()) {
            var25.field245 -= var4;
            var25.field236 -= var5;
            if (var25.field245 < 0 || var25.field236 < 0 || var25.field245 >= 104 || var25.field236 >= 104) {
                var25.method3695();
            }
        }
        if (client.field302 != 0) {
            client.field302 -= var4;
            client.field515 -= var5;
        }
        client.field522 = 0;
        client.field419 = false;
        client.field436 = -1;
        client.field358.method3605();
        client.field415.method3605();
        for (int var26 = 0; var26 < 4; var26++) {
            client.field341[var26].method2298();
        }
    }

    @ObfuscatedName("he.cg(Lj;IIII)V")
    public static final void method3778(class3 arg0, int arg1, int arg2, int arg3) {
        if (field1067 == arg0 || client.field422 >= 400) {
            return;
        }
        String var4;
        if (arg0.field33 == 0) {
            var4 = arg0.field47[0] + arg0.field28 + arg0.field47[1] + client.method2527(arg0.field32, field1067.field32) + " " + class2.field19 + class161.field2526 + arg0.field32 + class2.field20 + arg0.field47[2];
        } else {
            var4 = arg0.field47[0] + arg0.field28 + arg0.field47[1] + " " + class2.field19 + class161.field2529 + arg0.field33 + class2.field20 + arg0.field47[2];
        }
        if (client.field433 == 1) {
            client.method168(class161.field2502, client.field434 + " " + class2.field21 + " " + class2.method2986(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!client.field405) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (client.field409[var5] != null) {
                    short var6 = 0;
                    if (client.field409[var5].equalsIgnoreCase(class161.field2522)) {
                        if (client.field416 == class22.field578) {
                            continue;
                        }
                        if (client.field416 == class22.field576 || client.field416 == class22.field575 && arg0.field32 > field1067.field32) {
                            var6 = 2000;
                        }
                        if (field1067.field52 != 0 && arg0.field52 != 0) {
                            if (field1067.field52 == arg0.field52) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (client.field410[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = client.field408[var5] + var6;
                    client.method168(client.field409[var5], class2.method2986(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((field2750 & 0x8) == 8) {
            client.method168(client.field438, client.field439 + " " + class2.field21 + " " + class2.method2986(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < client.field422; var9++) {
            if (client.field371[var9] == 23) {
                client.field428[var9] = class2.method2986(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("f.cq(IS)Ljava/lang/String;")
    public static final String method117(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field18 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2986(65408) + var1.substring(0, var1.length() - 8) + class161.field2484 + " " + class2.field19 + var1 + class2.field20 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method2986(16777215) + var1.substring(0, var1.length() - 4) + class161.field2533 + " " + class2.field19 + var1 + class2.field20 + class2.field23;
        } else {
            return " " + class2.method2986(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("ea.da(II)V")
    public static final void method2756(int arg0) {
        if (!class177.method3201(arg0)) {
            return;
        }
        class177[] var1 = field2905[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3 != null) {
                var3.field2933 = 0;
                var3.field2946 = 0;
            }
        }
    }

    @ObfuscatedName("at.dc(Ljava/lang/String;I)V")
    public static final void method720(String arg0) {
        if (!arg0.equals("")) {
            client.field324.method2670(160);
            client.field324.method2567(class123.method826(arg0));
            client.field324.method2468(arg0);
        }
    }
}
