package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Statics {

    @ObfuscatedName("al.ns")
    public static class78 field1005;

    @ObfuscatedName("al.t")
    public static int field1006;

    @ObfuscatedName("al.s")
    public static class171 field1010;

    @ObfuscatedName("aw.id")
    public static class33 field1023;

    @ObfuscatedName("aw.bg")
    public static class172 field1025;

    @ObfuscatedName("aw.s")
    public static class171 field1027;

    @ObfuscatedName("aw.bf")
    public static FontMetrics field1029;

    @ObfuscatedName("aw.h")
    public static class84 field1031;

    @ObfuscatedName("ak.s")
    public static class171 field1037;

    @ObfuscatedName("as.s")
    public static class171 field1050;

    @ObfuscatedName("as.g")
    public static boolean field1052;

    @ObfuscatedName("as.z")
    public static class171 field1055;

    @ObfuscatedName("aq.bo")
    public static class84 field1065;

    @ObfuscatedName("aq.s")
    public static class171 field1066;

    @ObfuscatedName("aq.qu")
    public static int field1070;

    @ObfuscatedName("af.z")
    public static class171 field1074;

    @ObfuscatedName("af.t")
    public static class171 field1092;

    @ObfuscatedName("af.az")
    public static String field1099;

    @ObfuscatedName("af.nh")
    public static int field1100;

    @ObfuscatedName("af.s")
    public static class171 field1102;

    @ObfuscatedName("bp.s")
    public static int field1113;

    @ObfuscatedName("bp.e")
    public static int[] field1114;

    @ObfuscatedName("bp.c")
    public static int[] field1115;

    @ObfuscatedName("bp.b")
    public static String[] field1117;

    @ObfuscatedName("bh.dt")
    public static int field1123;

    @ObfuscatedName("bh.s")
    public static class171 field1126;

    @ObfuscatedName("bo.ap")
    public static class150 field1130;

    @ObfuscatedName("bo.do")
    public static int field1133;

    @ObfuscatedName("bo.hq")
    public static int field1136;

    @ObfuscatedName("bo.s")
    public static class171 field1137;

    @ObfuscatedName("bo.ng")
    public static int field1139;

    @ObfuscatedName("bg.y")
    public static class171 field1143;

    @ObfuscatedName("bg.p")
    public static class171 field1144;

    @ObfuscatedName("bg.r")
    public static class228 field1153;

    @ObfuscatedName("f.fj")
    public static int field118;

    @ObfuscatedName("bg.ib")
    public static class177 field1197;

    @ObfuscatedName("bk.s")
    public static class171 field1199;

    @ObfuscatedName("s.me")
    public static byte field12;

    @ObfuscatedName("f.jc")
    public static class177[] field120;

    @ObfuscatedName("be.t")
    public static int field1216;

    @ObfuscatedName("k.pb")
    public static class140 field122;

    @ObfuscatedName("be.s")
    public static int field1220;

    @ObfuscatedName("be.z")
    public static boolean field1223;

    @ObfuscatedName("be.qm")
    public static Image field1237;

    @ObfuscatedName("be.dh")
    public static int field1238;

    @ObfuscatedName("be.gz")
    public static int field1239;

    @ObfuscatedName("bm.m")
    public static byte[][][] field1262;

    @ObfuscatedName("bn.f")
    public static float field1278;

    @ObfuscatedName("k.nr")
    public static int field128;

    @ObfuscatedName("bn.k")
    public static int field1286;

    @ObfuscatedName("s.ny")
    public static int field13;

    @ObfuscatedName("k.m")
    public static int[] field130;

    @ObfuscatedName("bd.h")
    public static int[] field1312;

    @ObfuscatedName("bd.r")
    public static int[] field1316;

    @ObfuscatedName("k.qv")
    public static Font field132;

    @ObfuscatedName("bd.w")
    public static boolean[] field1321;

    @ObfuscatedName("k.db")
    public static int field133;

    @ObfuscatedName("bf.m")
    public static byte[] field1336;

    @ObfuscatedName("bf.ax")
    public static int[] field1337;

    @ObfuscatedName("bf.h")
    public static int field1339;

    @ObfuscatedName("bf.am")
    public static float[] field1340;

    @ObfuscatedName("bf.w")
    public static class77[] field1341;

    @ObfuscatedName("bf.aa")
    public static int[] field1342;

    @ObfuscatedName("bf.n")
    public static class64[] field1343;

    @ObfuscatedName("bf.d")
    public static class72[] field1344;

    @ObfuscatedName("bf.a")
    public static boolean[] field1345;

    @ObfuscatedName("bf.v")
    public static float[] field1352;

    @ObfuscatedName("bf.l")
    public static float[] field1353;

    @ObfuscatedName("bf.u")
    public static class71[] field1354;

    @ObfuscatedName("bf.f")
    public static int field1355;

    @ObfuscatedName("bf.ae")
    public static float[] field1356;

    @ObfuscatedName("bf.ah")
    public static float[] field1357;

    @ObfuscatedName("bf.b")
    public static int[] field1358;

    @ObfuscatedName("bf.r")
    public static int field1359;

    @ObfuscatedName("bf.k")
    public static int field1360;

    @ObfuscatedName("bf.j")
    public static float[] field1362;

    @ObfuscatedName("bf.e")
    public static float[] field1363;

    @ObfuscatedName("ba.nz")
    public static class59 field1390;

    @ObfuscatedName("ba.co")
    public static class147 field1395;

    @ObfuscatedName("ba.b")
    public static int field1396;

    @ObfuscatedName("cj.gl")
    public static class177 field1415;

    @ObfuscatedName("cj.n")
    public static class176 field1417;

    @ObfuscatedName("cg.t")
    public static int field1419;

    @ObfuscatedName("cg.y")
    public static int[] field1420;

    @ObfuscatedName("cg.g")
    public static int[] field1421;

    @ObfuscatedName("cg.z")
    public static int field1423;

    @ObfuscatedName("h.jv")
    public static int field143;

    @ObfuscatedName("ct.n")
    public static int field1452;

    @ObfuscatedName("ct.d")
    public static int field1454;

    @ObfuscatedName("ct.u")
    public static int[] field1458;

    @ObfuscatedName("ci.ri")
    public static boolean field1476;

    @ObfuscatedName("h.nv")
    public static int field149;

    @ObfuscatedName("co.d")
    public static int[] field1495;

    @ObfuscatedName("h.da")
    public static int[] field150;

    @ObfuscatedName("cw.po")
    public static class164 field1501;

    @ObfuscatedName("ce.ah")
    public static int field1511;

    @ObfuscatedName("ce.br")
    public static int field1515;

    @ObfuscatedName("ce.o")
    public static int field1524;

    @ObfuscatedName("ce.c")
    public static int field1525;

    @ObfuscatedName("ce.v")
    public static int field1528;

    @ObfuscatedName("ce.aa")
    public static int field1529;

    @ObfuscatedName("ce.am")
    public static int field1530;

    @ObfuscatedName("ce.j")
    public static int field1531;

    @ObfuscatedName("ce.ae")
    public static int field1532;

    @ObfuscatedName("ce.b")
    public static int field1535;

    @ObfuscatedName("ce.l")
    public static int field1539;

    @ObfuscatedName("ce.q")
    public static int field1543;

    @ObfuscatedName("r.af")
    public static class172 field155;

    @ObfuscatedName("ce.bw")
    public static int field1552;

    @ObfuscatedName("ce.e")
    public static int field1554;

    @ObfuscatedName("ce.i")
    public static int field1555;

    @ObfuscatedName("r.qb")
    public static int field156;

    @ObfuscatedName("ce.bg")
    public static boolean[][] field1561;

    @ObfuscatedName("ce.bk")
    public static int field1562;

    @ObfuscatedName("ce.bj")
    public static int field1564;

    @ObfuscatedName("ce.be")
    public static int field1565;

    @ObfuscatedName("ce.x")
    public static int field1566;

    @ObfuscatedName("ce.bx")
    public static int field1567;

    @ObfuscatedName("cr.cm")
    public static class228 field1591;

    @ObfuscatedName("cr.x")
    public static String field1599;

    @ObfuscatedName("r.ph")
    public static class138 field160;

    @ObfuscatedName("cq.z")
    public static class171 field1608;

    @ObfuscatedName("cf.i")
    public static int field1612;

    @ObfuscatedName("cf.e")
    public static int field1613;

    @ObfuscatedName("cf.r")
    public static int field1619;

    @ObfuscatedName("cf.w")
    public static int field1620;

    @ObfuscatedName("cf.c")
    public static int field1621;

    @ObfuscatedName("cf.x")
    public static int field1623;

    @ObfuscatedName("cf.v")
    public static int field1624;

    @ObfuscatedName("cf.l")
    public static int field1625;

    @ObfuscatedName("cf.ah")
    public static class96 field1626;

    @ObfuscatedName("w.k")
    public static int[][] field165;

    @ObfuscatedName("cn.hd")
    public static class3 field1663;

    @ObfuscatedName("w.mx")
    public static class82 field167;

    @ObfuscatedName("cs.bz")
    public static int field1727;

    @ObfuscatedName("dr.ai")
    public static int field1788;

    @ObfuscatedName("do.qg")
    public static Canvas field1812;

    @ObfuscatedName("do.my")
    public static class26[] field1817;

    @ObfuscatedName("u.cx")
    public static class150 field182;

    @ObfuscatedName("de.bp")
    public static int field1839;

    @ObfuscatedName("de.bo")
    public static int field1845;

    @ObfuscatedName("n.fr")
    public static int field185;

    @ObfuscatedName("de.bh")
    public static int field1852;

    @ObfuscatedName("ds.p")
    public static int field1908;

    @ObfuscatedName("ds.g")
    public static int field1909;

    @ObfuscatedName("ds.ba")
    public static int field1911;

    @ObfuscatedName("d.ah")
    public static int[] field192;

    @ObfuscatedName("dx.nk")
    public static int field1940;

    @ObfuscatedName("dx.z")
    public static class171 field1942;

    @ObfuscatedName("dx.h")
    public static short[][] field1943;

    @ObfuscatedName("da.at")
    public static class147 field1947;

    @ObfuscatedName("d.bp")
    public static class84[] field196;

    @ObfuscatedName("d.pk")
    public static short[] field198;

    @ObfuscatedName("da.bh")
    public static class84[] field1984;

    @ObfuscatedName("dv.y")
    public static int field1986;

    @ObfuscatedName("dv.r")
    public static class177 field1987;

    @ObfuscatedName("dv.dl")
    public static class90 field1991;

    @ObfuscatedName("du.y")
    public static class84 field1996;

    @ObfuscatedName("du.fs")
    public static int field1997;

    @ObfuscatedName("z.pg")
    public static int field20;

    @ObfuscatedName("d.qq")
    public static class137 field200;

    @ObfuscatedName("dd.cz")
    public static class228 field2002;

    @ObfuscatedName("dd.f")
    public static int[] field2003;

    @ObfuscatedName("dd.pi")
    public static class225 field2005;

    @ObfuscatedName("dz.qt")
    public static Frame field2009;

    @ObfuscatedName("a.g")
    public static class171 field201;

    @ObfuscatedName("dz.s")
    public static long field2010;

    @ObfuscatedName("dl.rq")
    public static String field2014;

    @ObfuscatedName("dy.br")
    public static class172 field2034;

    @ObfuscatedName("a.pr")
    public static int field204;

    @ObfuscatedName("dc.iy")
    public static int field2043;

    @ObfuscatedName("dc.bp")
    public static class172 field2044;

    @ObfuscatedName("dc.r")
    public static class84 field2046;

    @ObfuscatedName("dc.u")
    public static int[] field2053;

    @ObfuscatedName("dp.fg")
    public static int field2058;

    @ObfuscatedName("dj.be")
    public static class172 field2075;

    @ObfuscatedName("dj.ex")
    public static class82[] field2077;

    @ObfuscatedName("df.m")
    public static class82 field2079;

    @ObfuscatedName("df.hs")
    public static int field2083;

    @ObfuscatedName("ev.u")
    public static class63 field2084;

    @ObfuscatedName("ev.cw")
    public static char field2085;

    @ObfuscatedName("ev.ak")
    public static long field2086;

    @ObfuscatedName("er.w")
    public static class184 field2091;

    @ObfuscatedName("er.dz")
    public static byte[][] field2092;

    @ObfuscatedName("es.qk")
    public static int field2112;

    @ObfuscatedName("es.af")
    public static class84[] field2115;

    @ObfuscatedName("es.m")
    public static short[] field2122;

    @ObfuscatedName("eq.z")
    public static File field2125;

    @ObfuscatedName("eq.m")
    public static int field2127;

    @ObfuscatedName("ed.z")
    public static String field2137;

    @ObfuscatedName("ed.s")
    public static String field2138;

    @ObfuscatedName("ed.qn")
    public static int field2144;

    @ObfuscatedName("b.d")
    public static int[][][] field217;

    @ObfuscatedName("eo.kr")
    public static class20 field2178;

    @ObfuscatedName("eg.bv")
    public static class172 field2201;

    @ObfuscatedName("en.iu")
    public static int field2209;

    @ObfuscatedName("eu.in")
    public static int field2216;

    @ObfuscatedName("ec.i")
    public static String field2222;

    @ObfuscatedName("b.eh")
    public static class84[] field223;

    @ObfuscatedName("ek.d")
    public static int field2233;

    @ObfuscatedName("ek.m")
    public static class157 field2248;

    @ObfuscatedName("ek.s")
    public static class171 field2249;

    @ObfuscatedName("ek.ay")
    public static class150 field2250;

    @ObfuscatedName("em.z")
    public static String field2265;

    @ObfuscatedName("em.s")
    public static Applet field2267;

    @ObfuscatedName("ee.n")
    public static class232[] field2272;

    @ObfuscatedName("ee.y")
    public static File field2273;

    @ObfuscatedName("ee.p")
    public static File field2274;

    @ObfuscatedName("ee.a")
    public static String[] field2275;

    @ObfuscatedName("ee.g")
    public static int field2278;

    @ObfuscatedName("ee.bw")
    public static class172 field2282;

    @ObfuscatedName("ef.h")
    public static int field2284;

    @ObfuscatedName("q.pl")
    public static Clipboard field230;

    @ObfuscatedName("ez.bj")
    public static class172 field2300;

    @ObfuscatedName("ez.fy")
    public static int field2304;

    @ObfuscatedName("et.js")
    public static int field2312;

    @ObfuscatedName("fr.bu")
    public static int field2319;

    @ObfuscatedName("fj.qd")
    public static int field2335;

    @ObfuscatedName("o.bb")
    public static class172 field237;

    @ObfuscatedName("z.nj")
    public static int field24;

    @ObfuscatedName("o.l")
    public static class14 field245;

    @ObfuscatedName("o.au")
    public static boolean field246;

    @ObfuscatedName("c.en")
    public static class82[] field261;

    @ObfuscatedName("fe.cl")
    public static int field2651;

    @ObfuscatedName("fi.jz")
    public static int field2697;

    @ObfuscatedName("fz.ft")
    public static int field2698;

    @ObfuscatedName("fz.ey")
    public static class84[] field2700;

    @ObfuscatedName("fc.iz")
    public static int field2712;

    @ObfuscatedName("fc.kd")
    public static class135 field2713;

    @ObfuscatedName("fs.ed")
    public static class82 field2717;

    @ObfuscatedName("client.a")
    public static String field274;

    @ObfuscatedName("fv.eo")
    public static class82[] field2754;

    @ObfuscatedName("fv.pd")
    public static GarbageCollectorMXBean field2756;

    @ObfuscatedName("fb.u")
    public static boolean field2764;

    @ObfuscatedName("fb.z")
    public static class147 field2773;

    @ObfuscatedName("fw.t")
    public static class171 field2789;

    @ObfuscatedName("fw.y")
    public static class171 field2790;

    @ObfuscatedName("fw.p")
    public static class171 field2791;

    @ObfuscatedName("fw.g")
    public static class171 field2885;

    @ObfuscatedName("fw.s")
    public static class177[][] field2909;

    @ObfuscatedName("fw.z")
    public static boolean[] field2925;

    @ObfuscatedName("fx.qj")
    public static int field2943;

    @ObfuscatedName("fp.d")
    public static String field2948;

    @ObfuscatedName("fa.t")
    public static class171 field2954;

    @ObfuscatedName("fh.z")
    public static class171 field2956;

    @ObfuscatedName("gv.f")
    public static short[][] field2965;

    @ObfuscatedName("gv.k")
    public static short[] field2969;

    @ObfuscatedName("gg.qe")
    public static int field2980;

    @ObfuscatedName("ga.dn")
    public static int[] field2999;

    @ObfuscatedName("client.bm")
    public static class172 field300;

    @ObfuscatedName("ga.s")
    public static class171 field3001;

    @ObfuscatedName("ga.t")
    public static class171 field3002;

    @ObfuscatedName("ga.m")
    public static int field3004;

    @ObfuscatedName("ga.f")
    public static int field3005;

    @ObfuscatedName("ga.k")
    public static int field3006;

    @ObfuscatedName("ga.r")
    public static boolean field3007;

    @ObfuscatedName("ga.y")
    public static class188 field3008;

    @ObfuscatedName("ga.z")
    public static class171 field3009;

    @ObfuscatedName("gh.bx")
    public static class172 field3047;

    @ObfuscatedName("ge.nw")
    public static int field3083;

    @ObfuscatedName("ge.eq")
    public static class82 field3098;

    @ObfuscatedName("gn.bk")
    public static class172 field3102;

    @ObfuscatedName("gn.ht")
    public static int field3104;

    @ObfuscatedName("hl.lc")
    public static class134 field3170;

    @ObfuscatedName("hi.h")
    public static class19 field3171;

    @ObfuscatedName("hy.s")
    public static boolean field3196;

    @ObfuscatedName("hk.f")
    public static byte[][][] field3198;

    @ObfuscatedName("hf.cu")
    public static class228 field3205;

    @ObfuscatedName("hb.t")
    public static long field3209;

    @ObfuscatedName("hb.y")
    public static class76 field3210;

    @ObfuscatedName("hu.k")
    public static byte[][] field3212;

    @ObfuscatedName("hu.y")
    public static byte[][][] field3214;

    @ObfuscatedName("hz.s")
    public static class171 field3216;

    @ObfuscatedName("hv.s")
    public static class117 field3231;

    @ObfuscatedName("hn.h")
    public static class84[] field3242;

    @ObfuscatedName("hc.z")
    public static int field3278;

    @ObfuscatedName("client.dv")
    public static int[] field328;

    @ObfuscatedName("client.ek")
    public static class82[] field349;

    @ObfuscatedName("client.dc")
    public static int field363;

    @ObfuscatedName("client.z")
    public static client field390;

    @ObfuscatedName("client.hn")
    public static int field412;

    @ObfuscatedName("client.bh")
    public static class172 field444;

    @ObfuscatedName("client.k")
    public static class158 field467;

    @ObfuscatedName("t.ql")
    public static class81 field50;

    @ObfuscatedName("client.h")
    public static class216 field519;

    @ObfuscatedName("client.ni")
    public static class60 field528;

    @ObfuscatedName("client.dd")
    public static byte[][] field552;

    @ObfuscatedName("i.bl")
    public static int field559;

    @ObfuscatedName("v.z")
    public static long field575;

    @ObfuscatedName("v.nx")
    public static int field576;

    @ObfuscatedName("v.nd")
    public static class60 field577;

    @ObfuscatedName("l.as")
    public static class172 field584;

    @ObfuscatedName("l.dr")
    public static int field590;

    @ObfuscatedName("e.bo")
    public static class172 field604;

    @ObfuscatedName("e.c")
    public static String field607;

    @ObfuscatedName("j.p")
    public static int[] field613;

    @ObfuscatedName("j.qa")
    public static int field614;

    @ObfuscatedName("j.fc")
    public static int field615;

    @ObfuscatedName("ae.du")
    public static int[][] field620;

    @ObfuscatedName("ah.p")
    public static class28[] field630;

    @ObfuscatedName("p.ne")
    public static int field64;

    @ObfuscatedName("ah.q")
    public static int field643;

    @ObfuscatedName("am.aq")
    public static class82[] field652;

    @ObfuscatedName("g.w")
    public static int[] field66;

    @ObfuscatedName("aa.o")
    public static int[] field666;

    @ObfuscatedName("ax.ix")
    public static int field671;

    @ObfuscatedName("ax.eu")
    public static class82[] field677;

    @ObfuscatedName("g.p")
    public static byte[][][] field68;

    @ObfuscatedName("ar.ci")
    public static class147 field696;

    @ObfuscatedName("g.g")
    public static byte[][][] field70;

    @ObfuscatedName("an.j")
    public static int[] field702;

    @ObfuscatedName("an.p")
    public static class84[] field703;

    @ObfuscatedName("an.f")
    public static class84 field705;

    @ObfuscatedName("an.k")
    public static class84[] field706;

    @ObfuscatedName("g.h")
    public static int[] field71;

    @ObfuscatedName("an.e")
    public static int[] field711;

    @ObfuscatedName("an.t")
    public static class84 field722;

    @ObfuscatedName("an.g")
    public static class82 field726;

    @ObfuscatedName("an.i")
    public static int[] field728;

    @ObfuscatedName("g.n")
    public static int[] field73;

    @ObfuscatedName("an.px")
    public static long field736;

    @ObfuscatedName("ag.py")
    public static int field753;

    @ObfuscatedName("ab.ea")
    public static class84[] field762;

    @ObfuscatedName("ab.gk")
    public static class177 field763;

    @ObfuscatedName("ao.mh")
    public static int field765;

    @ObfuscatedName("av.r")
    public static int[] field777;

    @ObfuscatedName("av.x")
    public static int[] field781;

    @ObfuscatedName("av.c")
    public static class123 field782;

    @ObfuscatedName("ap.y")
    public static String[] field786;

    @ObfuscatedName("ap.t")
    public static int[] field789;

    @ObfuscatedName("ap.w")
    public static class177 field793;

    @ObfuscatedName("ap.ie")
    public static class177 field794;

    @ObfuscatedName("ap.bd")
    public static String field797;

    @ObfuscatedName("ap.ae")
    public static int[] field800;

    @ObfuscatedName("aj.s")
    public static class171 field870;

    @ObfuscatedName("aj.ge")
    public static class177 field874;

    @ObfuscatedName("aj.z")
    public static class171 field888;

    @ObfuscatedName("aj.ec")
    public static class82[] field908;

    @ObfuscatedName("ai.z")
    public static class171 field922;

    @ObfuscatedName("ai.eg")
    public static class82[] field958;

    @ObfuscatedName("az.a")
    public static class123 field963;

    @ObfuscatedName("ay.s")
    public static class171 field966;

    @ObfuscatedName("ay.t")
    public static class171 field967;

    @ObfuscatedName("ay.aq")
    public static class172 field984;

    @ObfuscatedName("ay.pf")
    public static class9 field985;

    @ObfuscatedName("at.s")
    public static class171 field990;

    @ObfuscatedName("at.mt")
    public static byte field994;

    @ObfuscatedName("dp.s(II)Lbk;")
    public static class57 method2656(int arg0) {
        class57 var1 = (class57) class57.field1204.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field1199.method3091(16, arg0);
        class57 var3 = new class57();
        if (var2 != null) {
            var3.method1122(new class123(var2));
        }
        class57.field1204.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("d.s(IILdw;Ldk;I)Z")
    public static final boolean method169(int arg0, int arg1, class111 arg2, class112 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        class110.field1906[var6][var7] = 99;
        class110.field1907[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        class110.field1913[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        class110.field1916[var10001] = arg1;
        int[][] var12 = arg3.field1932;
        while (var18 != var11) {
            var4 = class110.field1913[var11];
            var5 = class110.field1916[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field1928;
            int var16 = var5 - arg3.field1929;
            if (arg2.method124(1, var4, var5, arg3)) {
                field1908 = var4;
                field1909 = var5;
                return true;
            }
            int var17 = class110.field1907[var13][var14] + 1;
            if (var13 > 0 && class110.field1906[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0) {
                class110.field1913[var18] = var4 - 1;
                class110.field1916[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                class110.field1906[var13 - 1][var14] = 2;
                class110.field1907[var13 - 1][var14] = var17;
            }
            if (var13 < 127 && class110.field1906[var13 + 1][var14] == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0) {
                class110.field1913[var18] = var4 + 1;
                class110.field1916[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                class110.field1906[var13 + 1][var14] = 8;
                class110.field1907[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && class110.field1906[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                class110.field1913[var18] = var4;
                class110.field1916[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                class110.field1906[var13][var14 - 1] = 1;
                class110.field1907[var13][var14 - 1] = var17;
            }
            if (var14 < 127 && class110.field1906[var13][var14 + 1] == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                class110.field1913[var18] = var4;
                class110.field1916[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                class110.field1906[var13][var14 + 1] = 4;
                class110.field1907[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && class110.field1906[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                class110.field1913[var18] = var4 - 1;
                class110.field1916[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                class110.field1906[var13 - 1][var14 - 1] = 3;
                class110.field1907[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 127 && var14 > 0 && class110.field1906[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                class110.field1913[var18] = var4 + 1;
                class110.field1916[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                class110.field1906[var13 + 1][var14 - 1] = 9;
                class110.field1907[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 127 && class110.field1906[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                class110.field1913[var18] = var4 - 1;
                class110.field1916[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                class110.field1906[var13 - 1][var14 + 1] = 6;
                class110.field1907[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 127 && var14 < 127 && class110.field1906[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 1] & 0x12401E0) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                class110.field1913[var18] = var4 + 1;
                class110.field1916[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                class110.field1906[var13 + 1][var14 + 1] = 12;
                class110.field1907[var13 + 1][var14 + 1] = var17;
            }
        }
        field1908 = var4;
        field1909 = var5;
        return false;
    }

    @ObfuscatedName("b.s(Lfu;Lfu;B)V")
    public static void method184(class171 arg0, class171 arg1) {
        field1050 = arg0;
        field1055 = arg1;
    }

    @ObfuscatedName("an.s(Lfu;Lfu;I)V")
    public static void method703(class171 arg0, class171 arg1) {
        field990 = arg0;
        field2956 = arg1;
    }

    @ObfuscatedName("bm.z(I)V")
    public static void method1257() {
        for (class25 var0 = (class25) class25.field591.method3588(); var0 != null; var0 = (class25) class25.field591.method3590()) {
            if (var0.field605 != null) {
                var0.method581();
            }
        }
    }

    @ObfuscatedName("aa.y(Lfu;Ljava/lang/String;Ljava/lang/String;B)[Lcb;")
    public static class84[] method667(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3084(arg1);
        int var4 = arg0.method3085(var3, arg2);
        return class80.method2(arg0, var3, var4);
    }

    @ObfuscatedName("do.t(I)Lk;")
    public static class9 method2159() {
        class231 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class153.method930("", field467.field2331, false);
            byte[] var2 = new byte[(int) var0.method3900()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3897(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class123(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3898();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("client.g(Lfu;Ljava/lang/String;Ljava/lang/String;I)[Lca;")
    public static class82[] method490(class171 arg0, String arg1, String arg2) {
        int var3 = arg0.method3084(arg1);
        int var4 = arg0.method3085(var3, arg2);
        return class80.method525(arg0, var3, var4);
    }

    @ObfuscatedName("ar.r(Ljava/lang/String;I)I")
    public static int method679(String arg0) {
        return arg0.length() + 2;
    }

    @ObfuscatedName("ac.t(I)V")
    public static void method676() {
        if (class141.field2156 != null) {
            class141 var0 = class141.field2156;
            synchronized (class141.field2156) {
                class141.field2156 = null;
            }
        }
    }

    @ObfuscatedName("s.u([BI)V")
    public static void method1(byte[] arg0) {
        class123 var1 = new class123(arg0);
        var1.field2028 = arg0.length - 2;
        field1113 = var1.method2550();
        field1420 = new int[field1113];
        field613 = new int[field1113];
        field1421 = new int[field1113];
        field130 = new int[field1113];
        field3212 = new byte[field1113][];
        var1.field2028 = arg0.length - 7 - field1113 * 8;
        field1423 = var1.method2550();
        field1419 = var1.method2550();
        int var2 = (var1.method2363() & 0xFF) + 1;
        for (int var3 = 0; var3 < field1113; var3++) {
            field1420[var3] = var1.method2550();
        }
        for (int var4 = 0; var4 < field1113; var4++) {
            field613[var4] = var1.method2550();
        }
        for (int var5 = 0; var5 < field1113; var5++) {
            field1421[var5] = var1.method2550();
        }
        for (int var6 = 0; var6 < field1113; var6++) {
            field130[var6] = var1.method2550();
        }
        var1.field2028 = arg0.length - 7 - field1113 * 8 - (var2 - 1) * 3;
        field2003 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            field2003[var7] = var1.method2367();
            if (field2003[var7] == 0) {
                field2003[var7] = 1;
            }
        }
        var1.field2028 = 0;
        for (int var8 = 0; var8 < field1113; var8++) {
            int var9 = field1421[var8];
            int var10 = field130[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            field3212[var8] = var12;
            int var13 = var1.method2363();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method2483();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method2483();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fk.b(B)V")
    public static void method3043() {
        class56.field1164.method3522();
        class56.field1146.method3522();
        class56.field1147.method3522();
    }

    @ObfuscatedName("ci.h(IIII)I")
    public static int method1799(int arg0, int arg1, int arg2) {
        if ((class6.field80[arg0][arg1][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (class6.field80[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("cq.p(B)V")
    public static void method1983() {
        class34.field707 = class34.field707.trim();
        if (class34.field707.length() == 0) {
            class34.method1611(class161.field2562, class161.field2571, class161.field2389);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method896("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class123 var4 = new class123(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2033, var4.field2028, 1000 - var4.field2028);
                if (var5 == -1) {
                    var4.field2028 = 0;
                    long var8 = var4.method2369();
                    var6 = var8;
                    break;
                }
                var4.field2028 += var5;
                if (var4.field2028 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var54) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = class34.field707;
            Random var15 = new Random();
            class123 var16 = new class123(128);
            class123 var17 = new class123(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method2349(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method2524(var15.nextInt());
            }
            var16.method2524(var18[0]);
            var16.method2524(var18[1]);
            var16.method2489(var6);
            var16.method2489(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method2524(var15.nextInt());
            }
            var16.method2407(class10.field140, class10.field141);
            var17.method2349(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method2524(var15.nextInt());
            }
            var17.method2489(var15.nextLong());
            var17.method2471(var15.nextLong());
            byte[] var22 = new byte[24];
            try {
                class153.field2277.method3912(0L);
                class153.field2277.method3914(var22);
                int var23;
                for (var23 = 0; var23 < 24 && var22[var23] == 0; var23++) {
                }
                if (var23 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var53) {
                for (int var25 = 0; var25 < 24; var25++) {
                    var22[var25] = -1;
                }
            }
            var17.method2357(var22, 0, 24);
            var17.method2489(var15.nextLong());
            var17.method2407(class10.field140, class10.field141);
            int var26 = class123.method2281(var14);
            if (var26 % 8 != 0) {
                var26 += 8 - var26 % 8;
            }
            class123 var27 = new class123(var26);
            var27.method2354(var14);
            var27.field2028 = var26;
            var27.method2380(var18);
            class123 var28 = new class123(var27.field2028 + var17.field2028 + var16.field2028 + 5);
            var28.method2349(2);
            var28.method2349(var16.field2028);
            var28.method2357(var16.field2033, 0, var16.field2028);
            var28.method2349(var17.field2028);
            var28.method2357(var17.field2033, 0, var17.field2028);
            var28.method2350(var27.field2028);
            var28.method2357(var27.field2033, 0, var27.field2028);
            byte[] var29 = var28.field2033;
            int var30 = var29.length;
            StringBuilder var31 = new StringBuilder();
            for (int var32 = 0; var32 < var30; var32 += 3) {
                int var33 = var29[var32] & 0xFF;
                var31.append(class165.field2693[var33 >>> 2]);
                if (var32 < var30 - 1) {
                    int var34 = var29[var32 + 1] & 0xFF;
                    var31.append(class165.field2693[(var33 & 0x3) << 4 | var34 >>> 4]);
                    if (var32 < var30 - 2) {
                        int var35 = var29[var32 + 2] & 0xFF;
                        var31.append(class165.field2693[(var34 & 0xF) << 2 | var35 >>> 6]).append(class165.field2693[var35 & 0x3F]);
                    } else {
                        var31.append(class165.field2693[(var34 & 0xF) << 2]).append("=");
                    }
                } else {
                    var31.append(class165.field2693[(var33 & 0x3) << 4]).append("==");
                }
            }
            String var36 = var31.toString();
            String var38 = var36;
            byte var45;
            try {
                URL var39 = new URL(client.method896("services", false) + "m=accountappeal/login.ws");
                URLConnection var40 = var39.openConnection();
                var40.setDoInput(true);
                var40.setDoOutput(true);
                var40.setConnectTimeout(5000);
                OutputStreamWriter var41 = new OutputStreamWriter(var40.getOutputStream());
                var41.write("data2=" + class230.method2975(var38) + "&dest=" + class230.method2975("passwordchoice.ws"));
                var41.flush();
                InputStream var42 = var40.getInputStream();
                class123 var43 = new class123(new byte[1000]);
                while (true) {
                    int var44 = var42.read(var43.field2033, var43.field2028, 1000 - var43.field2028);
                    if (var44 == -1) {
                        var41.close();
                        var42.close();
                        String var46 = new String(var43.field2033);
                        if (var46.startsWith("OFFLINE")) {
                            var45 = 4;
                        } else if (var46.startsWith("WRONG")) {
                            var45 = 7;
                        } else if (var46.startsWith("RELOAD")) {
                            var45 = 3;
                        } else if (var46.startsWith("Not permitted for social network accounts.")) {
                            var45 = 6;
                        } else {
                            var43.method2381(var18);
                            while (var43.field2028 > 0 && var43.field2033[var43.field2028 - 1] == 0) {
                                var43.field2028--;
                            }
                            String var47 = new String(var43.field2033, 0, var43.field2028);
                            boolean var48;
                            if (var47 == null) {
                                var48 = false;
                            } else {
                                label128: {
                                    try {
                                        new URL(var47);
                                    } catch (MalformedURLException var51) {
                                        var48 = false;
                                        break label128;
                                    }
                                    var48 = true;
                                }
                            }
                            if (var48) {
                                class142.method151(var47, true, false);
                                var45 = 2;
                            } else {
                                var45 = 5;
                            }
                        }
                        break;
                    }
                    var43.field2028 += var44;
                    if (var43.field2028 >= 1000) {
                        var45 = 5;
                        break;
                    }
                }
            } catch (Throwable var52) {
                var52.printStackTrace();
                var45 = 5;
            }
            var13 = var45;
        }
        switch(var13) {
            case 2:
                class34.method1611(class161.field2607, class161.field2608, class161.field2491);
                class34.field714 = 6;
                break;
            case 3:
                class34.method1611(class161.field2610, class161.field2399, class161.field2612);
                break;
            case 4:
                class34.method1611(class161.field2467, class161.field2614, class161.field2615);
                break;
            case 5:
                class34.method1611(class161.field2550, class161.field2367, class161.field2370);
                break;
            case 6:
                class34.method1611(class161.field2619, class161.field2620, class161.field2564);
                break;
            case 7:
                class34.method1611(class161.field2519, class161.field2391, class161.field2624);
        }
    }

    @ObfuscatedName("l.w(B)V")
    public static void method574() {
        if (class28.method669()) {
            class34.field704 = true;
        }
    }

    @ObfuscatedName("ak.am(Lau;S)V")
    public static final void method947(class40 arg0) {
        if (client.field326 == arg0.field849 || arg0.field858 == -1 || arg0.field837 != 0 || arg0.field836 + 1 > class45.method44(arg0.field858).field982[arg0.field835]) {
            int var1 = arg0.field849 - arg0.field848;
            int var2 = client.field326 - arg0.field848;
            int var3 = arg0.field844 * 128 + arg0.field806 * 64;
            int var4 = arg0.field846 * 128 + arg0.field806 * 64;
            int var5 = arg0.field845 * 128 + arg0.field806 * 64;
            int var6 = arg0.field847 * 128 + arg0.field806 * 64;
            arg0.field810 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field843 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field860 = 0;
        arg0.field853 = arg0.field850;
        arg0.field804 = arg0.field853;
    }

    @ObfuscatedName("ee.ak(ZB)V")
    public static final void method2972(boolean arg0) {
        client.field429 = arg0;
        if (!client.field429) {
            int var1 = client.field313.method2398();
            int var2 = client.field313.method2399();
            int var3 = client.field313.method2550();
            field620 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    field620[var4][var5] = client.field313.method2408();
                }
            }
            field150 = new int[var3];
            field328 = new int[var3];
            field2999 = new int[var3];
            field552 = new byte[var3][];
            field2092 = new byte[var3][];
            boolean var6 = false;
            if ((var1 / 8 == 48 || var1 / 8 == 49) && var2 / 8 == 48) {
                var6 = true;
            }
            if (var1 / 8 == 48 && var2 / 8 == 148) {
                var6 = true;
            }
            int var7 = 0;
            for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    if (!var6 || var9 != 49 && var9 != 149 && var9 != 147 && var8 != 50 && (var8 != 49 || var9 != 47)) {
                        field150[var7] = var10;
                        field328[var7] = field604.method3084("m" + var8 + "_" + var9);
                        field2999[var7] = field604.method3084("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            client.method668(var1, var2);
            return;
        }
        int var11 = client.field313.method2540();
        int var12 = client.field313.method2399();
        int var13 = client.field313.method2550();
        client.field313.method2632();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = client.field313.method2644(1);
                    if (var17 == 1) {
                        client.field331[var14][var15][var16] = client.field313.method2644(26);
                    } else {
                        client.field331[var14][var15][var16] = -1;
                    }
                }
            }
        }
        client.field313.method2633();
        field620 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                field620[var18][var19] = client.field313.method2408();
            }
        }
        field150 = new int[var13];
        field328 = new int[var13];
        field2999 = new int[var13];
        field552 = new byte[var13][];
        field2092 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = client.field331[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (field150[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            field150[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            field328[var20] = field604.method3084("m" + var29 + "_" + var30);
                            field2999[var20] = field604.method3084("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        client.method668(var11, var12);
    }

    @ObfuscatedName("dc.bs(IIIII)V")
    public static final void method2627(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < client.field299; var4++) {
            if (client.field479[var4] + client.field477[var4] > arg0 && client.field477[var4] < arg0 + arg2 && client.field480[var4] + client.field478[var4] > arg1 && client.field478[var4] < arg1 + arg3) {
                client.field380[var4] = true;
            }
        }
    }

    @ObfuscatedName("ev.cz(I)V")
    public static void method2698() {
        for (class4 var0 = (class4) client.field430.method3560(); var0 != null; var0 = (class4) client.field430.method3565()) {
            int var1 = var0.field59;
            if (class177.method3203(var1)) {
                boolean var2 = true;
                class177[] var3 = field2909[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2798;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3167;
                    class177 var6 = class177.method1982(var5);
                    if (var6 != null) {
                        client.method678(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.de(Ly;ZI)V")
    public static final void method166(class4 arg0, boolean arg1) {
        int var2 = arg0.field59;
        int var3 = (int) arg0.field3167;
        arg0.method3699();
        if (arg1 && var2 != -1 && field2925[var2]) {
            field2789.method3081(var2);
            if (field2909[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < field2909[var2].length; var5++) {
                    if (field2909[var2][var5] != null) {
                        if (field2909[var2][var5].field2801 == 2) {
                            var4 = false;
                        } else {
                            field2909[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    field2909[var2] = null;
                }
                field2925[var2] = false;
            }
        }
        client.method2299(var2);
        class177 var6 = class177.method1982(var3);
        if (var6 != null) {
            client.method678(var6);
        }
        client.method3();
        if (client.field513 != -1) {
            int var7 = client.field513;
            if (class177.method3203(var7)) {
                client.method2279(field2909[var7], 1);
            }
        }
    }
}
