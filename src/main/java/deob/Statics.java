package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;

public class Statics {

    @ObfuscatedName("ap.i")
    public static class171 field1001;

    @ObfuscatedName("aa.h")
    public static class171 field1008;

    @ObfuscatedName("aa.e")
    public static class171 field1009;

    @ObfuscatedName("aa.i")
    public static class171 field1011;

    @ObfuscatedName("u.g")
    public static byte[][][] field103;

    @ObfuscatedName("ay.h")
    public static class171 field1032;

    @ObfuscatedName("ay.i")
    public static class171 field1039;

    @ObfuscatedName("ab.h")
    public static class171 field1047;

    @ObfuscatedName("u.bq")
    public static class172 field105;

    @ObfuscatedName("ab.i")
    public static class171 field1055;

    @ObfuscatedName("aj.i")
    public static class171 field1065;

    @ObfuscatedName("az.i")
    public static class171 field1072;

    @ObfuscatedName("az.bw")
    public static String field1079;

    @ObfuscatedName("u.r")
    public static int[][][] field108;

    @ObfuscatedName("av.i")
    public static class171 field1083;

    @ObfuscatedName("ae.pg")
    public static int field1094;

    @ObfuscatedName("ae.i")
    public static class171 field1097;

    @ObfuscatedName("at.e")
    public static class171 field1103;

    @ObfuscatedName("at.ek")
    public static class82 field1108;

    @ObfuscatedName("at.h")
    public static class171 field1116;

    @ObfuscatedName("at.bo")
    public static int field1127;

    @ObfuscatedName("at.i")
    public static class171 field1128;

    @ObfuscatedName("bc.i")
    public static class171 field1137;

    @ObfuscatedName("bc.k")
    public static int[] field1140;

    @ObfuscatedName("bc.s")
    public static class184 field1144;

    @ObfuscatedName("bv.i")
    public static class171 field1148;

    @ObfuscatedName("bv.is")
    public static class177 field1154;

    @ObfuscatedName("bi.j")
    public static int field1155;

    @ObfuscatedName("bi.d")
    public static int field1158;

    @ObfuscatedName("bi.i")
    public static class171 field1160;

    @ObfuscatedName("by.n")
    public static class171 field1167;

    @ObfuscatedName("i.nk")
    public static class59 field12;

    @ObfuscatedName("by.bb")
    public static class172 field1200;

    @ObfuscatedName("by.ds")
    public static int field1215;

    @ObfuscatedName("by.kw")
    public static class135 field1218;

    @ObfuscatedName("bu.h")
    public static int field1221;

    @ObfuscatedName("bu.py")
    public static class138 field1222;

    @ObfuscatedName("ba.e")
    public static int field1232;

    @ObfuscatedName("ba.i")
    public static int field1240;

    @ObfuscatedName("ba.g")
    public static class76 field1241;

    @ObfuscatedName("ba.cl")
    public static class147 field1251;

    @ObfuscatedName("bn.qu")
    public static int field1268;

    @ObfuscatedName("bz.l")
    public static float field1297;

    @ObfuscatedName("bz.m")
    public static int field1298;

    @ObfuscatedName("bt.j")
    public static int[] field1326;

    @ObfuscatedName("bt.y")
    public static int[] field1332;

    @ObfuscatedName("bt.s")
    public static boolean[] field1333;

    @ObfuscatedName("bm.v")
    public static class64[] field1342;

    @ObfuscatedName("bm.as")
    public static float[] field1347;

    @ObfuscatedName("bm.d")
    public static byte[] field1348;

    @ObfuscatedName("bm.j")
    public static int field1349;

    @ObfuscatedName("d.bc")
    public static class84[] field135;

    @ObfuscatedName("bm.l")
    public static int field1350;

    @ObfuscatedName("bm.ak")
    public static int[] field1351;

    @ObfuscatedName("bm.y")
    public static int field1352;

    @ObfuscatedName("bm.s")
    public static class77[] field1353;

    @ObfuscatedName("bm.p")
    public static class71[] field1354;

    @ObfuscatedName("bm.c")
    public static boolean[] field1357;

    @ObfuscatedName("bm.w")
    public static int[] field1358;

    @ObfuscatedName("bm.am")
    public static float[] field1359;

    @ObfuscatedName("bm.f")
    public static float[] field1360;

    @ObfuscatedName("bm.m")
    public static int field1364;

    @ObfuscatedName("bm.b")
    public static float[] field1365;

    @ObfuscatedName("bm.t")
    public static float[] field1366;

    @ObfuscatedName("bm.a")
    public static float[] field1367;

    @ObfuscatedName("bm.ad")
    public static float[] field1370;

    @ObfuscatedName("bm.af")
    public static int[] field1371;

    @ObfuscatedName("bm.r")
    public static class72[] field1372;

    @ObfuscatedName("d.bh")
    public static int field138;

    @ObfuscatedName("bh.ey")
    public static class82[] field1402;

    @ObfuscatedName("bh.bk")
    public static int field1409;

    @ObfuscatedName("bl.r")
    public static int field1427;

    @ObfuscatedName("bl.qq")
    public static int field1429;

    @ObfuscatedName("ca.t")
    public static int[] field1435;

    @ObfuscatedName("cj.e")
    public static int field1436;

    @ObfuscatedName("cj.i")
    public static int field1437;

    @ObfuscatedName("cj.n")
    public static int[] field1439;

    @ObfuscatedName("cj.g")
    public static int[] field1440;

    @ObfuscatedName("cj.d")
    public static int[] field1441;

    @ObfuscatedName("cj.m")
    public static byte[][] field1442;

    @ObfuscatedName("cj.a")
    public static int[] field1443;

    @ObfuscatedName("cj.u")
    public static int[] field1444;

    @ObfuscatedName("ci.nn")
    public static int field1446;

    @ObfuscatedName("l.ph")
    public static short[] field146;

    @ObfuscatedName("cc.r")
    public static int field1468;

    @ObfuscatedName("cc.p")
    public static int[] field1469;

    @ObfuscatedName("cc.v")
    public static int field1471;

    @ObfuscatedName("cl.r")
    public static int[] field1503;

    @ObfuscatedName("cw.y")
    public static class228 field1508;

    @ObfuscatedName("cx.af")
    public static int field1514;

    @ObfuscatedName("cx.a")
    public static int field1517;

    @ObfuscatedName("cx.w")
    public static int field1528;

    @ObfuscatedName("cx.x")
    public static int field1529;

    @ObfuscatedName("cx.k")
    public static int field1531;

    @ObfuscatedName("cx.q")
    public static int field1532;

    @ObfuscatedName("cx.f")
    public static int field1534;

    @ObfuscatedName("cx.b")
    public static int field1535;

    @ObfuscatedName("cx.t")
    public static int field1536;

    @ObfuscatedName("cx.am")
    public static int field1537;

    @ObfuscatedName("cx.as")
    public static int field1539;

    @ObfuscatedName("m.iv")
    public static class33 field154;

    @ObfuscatedName("cx.ad")
    public static int field1540;

    @ObfuscatedName("cx.o")
    public static int field1548;

    @ObfuscatedName("cx.z")
    public static int field1549;

    @ObfuscatedName("cx.bs")
    public static int field1564;

    @ObfuscatedName("cx.by")
    public static boolean[][] field1567;

    @ObfuscatedName("cx.bu")
    public static int field1568;

    @ObfuscatedName("cx.bb")
    public static int field1569;

    @ObfuscatedName("cx.bx")
    public static int field1570;

    @ObfuscatedName("cx.ba")
    public static int field1571;

    @ObfuscatedName("cx.bq")
    public static int field1572;

    @ObfuscatedName("cr.em")
    public static class82[] field1589;

    @ObfuscatedName("i.qo")
    public static Frame field16;

    @ObfuscatedName("cf.i")
    public static String field1615;

    @ObfuscatedName("cf.ny")
    public static int field1618;

    @ObfuscatedName("cv.f")
    public static int field1619;

    @ObfuscatedName("cv.y")
    public static int field1620;

    @ObfuscatedName("cv.s")
    public static int field1630;

    @ObfuscatedName("cv.q")
    public static int field1632;

    @ObfuscatedName("cv.z")
    public static int field1634;

    @ObfuscatedName("cv.o")
    public static int field1635;

    @ObfuscatedName("cv.t")
    public static int field1636;

    @ObfuscatedName("cv.as")
    public static class96 field1639;

    @ObfuscatedName("cv.b")
    public static int field1642;

    @ObfuscatedName("cz.z")
    public static String field1658;

    @ObfuscatedName("cz.db")
    public static int field1671;

    @ObfuscatedName("cd.bv")
    public static class84[] field1672;

    @ObfuscatedName("ce.n")
    public static class28[] field1687;

    @ObfuscatedName("ce.bu")
    public static class172 field1689;

    @ObfuscatedName("cy.as")
    public static int[] field1728;

    @ObfuscatedName("j.nt")
    public static int field173;

    @ObfuscatedName("cy.po")
    public static Clipboard field1730;

    @ObfuscatedName("ck.bm")
    public static int field1732;

    @ObfuscatedName("j.bi")
    public static class172 field174;

    @ObfuscatedName("j.fc")
    public static int field176;

    @ObfuscatedName("di.dv")
    public static int field1798;

    @ObfuscatedName("db.w")
    public static String[] field1818;

    @ObfuscatedName("y.ah")
    public static class150 field182;

    @ObfuscatedName("db.gt")
    public static class177 field1822;

    @ObfuscatedName("db.d")
    public static int field1824;

    @ObfuscatedName("db.qf")
    public static Image field1825;

    @ObfuscatedName("dd.h")
    public static File field1830;

    @ObfuscatedName("dd.pl")
    public static GarbageCollectorMXBean field1831;

    @ObfuscatedName("dd.am")
    public static int[] field1833;

    @ObfuscatedName("do.bv")
    public static int field1862;

    @ObfuscatedName("do.bc")
    public static int field1908;

    @ObfuscatedName("do.bi")
    public static int field1910;

    @ObfuscatedName("dp.n")
    public static int field1922;

    @ObfuscatedName("dp.u")
    public static int field1924;

    @ObfuscatedName("dp.z")
    public static int[] field1926;

    @ObfuscatedName("dp.bv")
    public static class172 field1930;

    @ObfuscatedName("da.e")
    public static class171 field1946;

    @ObfuscatedName("dz.u")
    public static class157 field1956;

    @ObfuscatedName("dz.h")
    public static String field1957;

    @ObfuscatedName("dg.df")
    public static int[][] field1979;

    @ObfuscatedName("i.v")
    public static int[] field2;

    @ObfuscatedName("dr.l")
    public static class158 field2005;

    @ObfuscatedName("dr.ae")
    public static class172 field2008;

    @ObfuscatedName("p.ae")
    public static class82[] field201;

    @ObfuscatedName("df.qj")
    public static int field2013;

    @ObfuscatedName("df.qb")
    public static int field2015;

    @ObfuscatedName("df.bs")
    public static class172 field2016;

    @ObfuscatedName("df.aa")
    public static class150 field2017;

    @ObfuscatedName("dx.nj")
    public static int field2019;

    @ObfuscatedName("dw.h")
    public static long field2025;

    @ObfuscatedName("dw.v")
    public static class232[] field2026;

    @ObfuscatedName("dc.ef")
    public static class82 field2033;

    @ObfuscatedName("dv.c")
    public static String[] field2051;

    @ObfuscatedName("dv.q")
    public static String field2060;

    @ObfuscatedName("dh.dd")
    public static int field2066;

    @ObfuscatedName("de.na")
    public static class78 field2080;

    @ObfuscatedName("dl.jb")
    public static class177[] field2089;

    @ObfuscatedName("dl.dc")
    public static class90 field2091;

    @ObfuscatedName("dk.l")
    public static int[] field2093;

    @ObfuscatedName("dk.cw")
    public static char field2094;

    @ObfuscatedName("dk.g")
    public static class171 field2097;

    @ObfuscatedName("eq.he")
    public static int field2102;

    @ObfuscatedName("eq.qx")
    public static int field2103;

    @ObfuscatedName("eq.bi")
    public static class84 field2104;

    @ObfuscatedName("el.pp")
    public static class225 field2123;

    @ObfuscatedName("el.ct")
    public static class228 field2124;

    @ObfuscatedName("ep.ex")
    public static class82[] field2131;

    @ObfuscatedName("ek.hx")
    public static class3 field2137;

    @ObfuscatedName("ef.ba")
    public static class172 field2140;

    @ObfuscatedName("ef.h")
    public static String field2141;

    @ObfuscatedName("ev.bj")
    public static class172 field2180;

    @ObfuscatedName("eu.pi")
    public static int field2184;

    @ObfuscatedName("ee.h")
    public static class171 field2194;

    @ObfuscatedName("ee.ix")
    public static int field2198;

    @ObfuscatedName("r.p")
    public static class63 field220;

    @ObfuscatedName("eb.dr")
    public static int[] field2228;

    @ObfuscatedName("es.hz")
    public static int field2229;

    @ObfuscatedName("es.mh")
    public static class26[] field2233;

    @ObfuscatedName("r.y")
    public static class84 field224;

    @ObfuscatedName("r.mq")
    public static byte field225;

    @ObfuscatedName("ej.e")
    public static int field2274;

    @ObfuscatedName("ej.i")
    public static Applet field2279;

    @ObfuscatedName("er.ev")
    public static class84[] field2280;

    @ObfuscatedName("er.o")
    public static String field2281;

    @ObfuscatedName("er.n")
    public static File field2282;

    @ObfuscatedName("er.u")
    public static int field2283;

    @ObfuscatedName("eh.q")
    public static int[] field2309;

    @ObfuscatedName("fy.nh")
    public static int field2331;

    @ObfuscatedName("fb.ap")
    public static String field2332;

    @ObfuscatedName("fb.ji")
    public static int field2336;

    @ObfuscatedName("fb.ai")
    public static int field2337;

    @ObfuscatedName("c.at")
    public static class172 field234;

    @ObfuscatedName("fb.fr")
    public static int field2343;

    @ObfuscatedName("c.j")
    public static class84 field237;

    @ObfuscatedName("w.dg")
    public static int[] field252;

    @ObfuscatedName("w.at")
    public static class84[] field255;

    @ObfuscatedName("w.c")
    public static class123 field256;

    @ObfuscatedName("fj.pt")
    public static class164 field2651;

    @ObfuscatedName("x.iq")
    public static class177 field268;

    @ObfuscatedName("ff.qk")
    public static Canvas field2694;

    @ObfuscatedName("ff.d")
    public static class82 field2695;

    @ObfuscatedName("fc.bn")
    public static class172 field2706;

    @ObfuscatedName("fc.h")
    public static client field2707;

    @ObfuscatedName("fc.e")
    public static long field2708;

    @ObfuscatedName("fc.fw")
    public static int field2709;

    @ObfuscatedName("fr.e")
    public static int field2713;

    @ObfuscatedName("fr.h")
    public static int field2714;

    @ObfuscatedName("x.l")
    public static short[][] field273;

    @ObfuscatedName("fp.bf")
    public static FontMetrics field2747;

    @ObfuscatedName("fs.y")
    public static int[] field2752;

    @ObfuscatedName("fx.lv")
    public static class134 field2755;

    @ObfuscatedName("fx.gr")
    public static int field2760;

    @ObfuscatedName("fl.i")
    public static class147 field2769;

    @ObfuscatedName("k.qg")
    public static int field277;

    @ObfuscatedName("fl.p")
    public static boolean field2772;

    @ObfuscatedName("fl.dw")
    public static byte[][] field2780;

    @ObfuscatedName("fl.ch")
    public static class150 field2782;

    @ObfuscatedName("fk.k")
    public static int field2786;

    @ObfuscatedName("fk.qa")
    public static class137 field2788;

    @ObfuscatedName("fe.h")
    public static boolean[] field2793;

    @ObfuscatedName("fe.g")
    public static class171 field2794;

    @ObfuscatedName("fe.n")
    public static class171 field2795;

    @ObfuscatedName("k.dj")
    public static int field281;

    @ObfuscatedName("fe.i")
    public static class177[][] field2824;

    @ObfuscatedName("fe.u")
    public static class171 field2833;

    @ObfuscatedName("k.ik")
    public static int field286;

    @ObfuscatedName("fg.me")
    public static class82 field2954;

    @ObfuscatedName("fn.e")
    public static class84 field2959;

    @ObfuscatedName("gh.d")
    public static short[] field2976;

    @ObfuscatedName("gh.m")
    public static short[] field2977;

    @ObfuscatedName("gh.j")
    public static short[][] field2978;

    @ObfuscatedName("gc.i")
    public static class171 field3012;

    @ObfuscatedName("gc.e")
    public static class171 field3013;

    @ObfuscatedName("gc.g")
    public static class188 field3014;

    @ObfuscatedName("gc.h")
    public static class171 field3015;

    @ObfuscatedName("gc.l")
    public static int field3016;

    @ObfuscatedName("gc.m")
    public static int field3017;

    @ObfuscatedName("gc.y")
    public static boolean field3018;

    @ObfuscatedName("client.m")
    public static class216 field303;

    @ObfuscatedName("gs.v")
    public static class176 field3063;

    @ObfuscatedName("gs.nd")
    public static int field3066;

    @ObfuscatedName("client.b")
    public static class14 field312;

    @ObfuscatedName("gi.di")
    public static int field3127;

    @ObfuscatedName("gt.qz")
    public static int field3133;

    @ObfuscatedName("gt.hh")
    public static int field3134;

    @ObfuscatedName("hg.s")
    public static class177 field3177;

    @ObfuscatedName("hn.i")
    public static class171 field3216;

    @ObfuscatedName("hn.qc")
    public static class81 field3217;

    @ObfuscatedName("hj.g")
    public static File field3220;

    @ObfuscatedName("hj.i")
    public static long field3221;

    @ObfuscatedName("hq.h")
    public static boolean field3222;

    @ObfuscatedName("hq.et")
    public static class84[] field3223;

    @ObfuscatedName("ht.i")
    public static class117 field3237;

    @ObfuscatedName("hz.j")
    public static class84[] field3247;

    @ObfuscatedName("hv.jr")
    public static int field3264;

    @ObfuscatedName("hh.u")
    public static boolean field3265;

    @ObfuscatedName("hp.t")
    public static int[] field3269;

    @ObfuscatedName("client.av")
    public static class172 field332;

    @ObfuscatedName("client.bx")
    public static class172 field334;

    @ObfuscatedName("client.c")
    public static int field345;

    @ObfuscatedName("client.nz")
    public static int field364;

    @ObfuscatedName("client.ew")
    public static class84[] field380;

    @ObfuscatedName("e.pw")
    public static class9 field43;

    @ObfuscatedName("client.by")
    public static class172 field477;

    @ObfuscatedName("client.nv")
    public static int field550;

    @ObfuscatedName("client.l")
    public static class84 field584;

    @ObfuscatedName("client.dt")
    public static int[] field587;

    @ObfuscatedName("q.nw")
    public static int field590;

    @ObfuscatedName("q.cp")
    public static int field598;

    @ObfuscatedName("o.bc")
    public static class172 field599;

    @ObfuscatedName("f.fv")
    public static int field612;

    @ObfuscatedName("t.es")
    public static class82[] field640;

    @ObfuscatedName("t.io")
    public static int field642;

    @ObfuscatedName("g.ee")
    public static class82[] field65;

    @ObfuscatedName("a.nf")
    public static class60 field653;

    @ObfuscatedName("am.ng")
    public static int field658;

    @ObfuscatedName("g.il")
    public static int field66;

    @ObfuscatedName("am.ay")
    public static class147 field665;

    @ObfuscatedName("g.eb")
    public static class82[] field67;

    @ObfuscatedName("as.bp")
    public static class172 field673;

    @ObfuscatedName("as.j")
    public static class19 field679;

    @ObfuscatedName("as.nb")
    public static class60 field684;

    @ObfuscatedName("as.qp")
    public static Font field685;

    @ObfuscatedName("ad.fb")
    public static int field698;

    @ObfuscatedName("g.gj")
    public static class177 field70;

    @ObfuscatedName("af.hv")
    public static int field703;

    @ObfuscatedName("af.z")
    public static class123 field707;

    @ObfuscatedName("af.fy")
    public static int field708;

    @ObfuscatedName("ak.mm")
    public static byte field714;

    @ObfuscatedName("aq.ru")
    public static String field727;

    @ObfuscatedName("g.v")
    public static String field73;

    @ObfuscatedName("an.ce")
    public static class228 field738;

    @ObfuscatedName("n.qe")
    public static int field74;

    @ObfuscatedName("ag.g")
    public static class84 field744;

    @ObfuscatedName("ag.n")
    public static class84[] field745;

    @ObfuscatedName("ag.u")
    public static class82 field746;

    @ObfuscatedName("ag.o")
    public static int[] field755;

    @ObfuscatedName("ag.i")
    public static boolean field759;

    @ObfuscatedName("n.dx")
    public static byte[][] field77;

    @ObfuscatedName("ag.m")
    public static class84[] field771;

    @ObfuscatedName("al.pe")
    public static int field790;

    @ObfuscatedName("au.fa")
    public static int field796;

    @ObfuscatedName("n.r")
    public static String field80;

    @ObfuscatedName("au.u")
    public static class171 field801;

    @ObfuscatedName("au.l")
    public static byte[][][] field802;

    @ObfuscatedName("ar.eu")
    public static class82[] field805;

    @ObfuscatedName("aw.cy")
    public static class228 field812;

    @ObfuscatedName("aw.az")
    public static long field818;

    @ObfuscatedName("n.ao")
    public static boolean field82;

    @ObfuscatedName("ah.e")
    public static int[] field820;

    @ObfuscatedName("ah.g")
    public static String[] field821;

    @ObfuscatedName("ah.jt")
    public static int field827;

    @ObfuscatedName("ah.y")
    public static class177 field828;

    @ObfuscatedName("ah.pn")
    public static long field832;

    @ObfuscatedName("ah.rq")
    public static boolean field834;

    @ObfuscatedName("u.ka")
    public static class20 field85;

    @ObfuscatedName("u.n")
    public static byte[][][] field89;

    @ObfuscatedName("ao.gu")
    public static class177 field896;

    @ObfuscatedName("ax.mv")
    public static int field897;

    @ObfuscatedName("ax.pq")
    public static class140 field899;

    @ObfuscatedName("u.u")
    public static byte[][][] field90;

    @ObfuscatedName("ac.h")
    public static class171 field906;

    @ObfuscatedName("u.d")
    public static byte[][][] field91;

    @ObfuscatedName("u.m")
    public static int[][] field92;

    @ObfuscatedName("ac.i")
    public static class171 field920;

    @ObfuscatedName("u.j")
    public static int[] field93;

    @ObfuscatedName("u.s")
    public static int[] field94;

    @ObfuscatedName("u.p")
    public static int[] field95;

    @ObfuscatedName("u.in")
    public static int field97;

    @ObfuscatedName("ai.e")
    public static class171 field987;

    @ObfuscatedName("ai.h")
    public static class171 field993;

    @ObfuscatedName("ai.cu")
    public static class147 field994;

    @ObfuscatedName("ey.i(II)Lb;")
    public static class24 method2857(int arg0) {
        class24 var1 = (class24) class24.field622.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2016.method3086(arg0, 0);
        if (var2 == null) {
            return null;
        }
        class24 var3 = new class24();
        class123 var4 = new class123(var2);
        var4.field2046 = var4.field2049.length - 12;
        int var5 = var4.method2409();
        var3.field620 = var4.method2406();
        var3.field621 = var4.method2406();
        var3.field619 = var4.method2406();
        var3.field624 = var4.method2406();
        var4.field2046 = 0;
        var4.method2392();
        var3.field616 = new int[var5];
        var3.field618 = new int[var5];
        var3.field623 = new String[var5];
        int var6 = 0;
        while (var4.field2046 < var4.field2049.length - 12) {
            int var7 = var4.method2406();
            if (var7 == 3) {
                var3.field623[var6] = var4.method2412();
            } else if (var7 >= 100 || var7 == 21 || var7 == 38 || var7 == 39) {
                var3.field618[var6] = var4.method2404();
            } else {
                var3.field618[var6] = var4.method2409();
            }
            var3.field616[var6++] = var7;
        }
        class24.field622.method3532(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("cf.h(Ljava/awt/Component;B)V")
    public static void method2020(Component arg0) {
        arg0.removeMouseListener(class144.field2208);
        arg0.removeMouseMotionListener(class144.field2208);
        arg0.removeFocusListener(class144.field2208);
        class144.field2206 = 0;
    }

    @ObfuscatedName("ab.n(Ljava/lang/CharSequence;II[BII)I")
    public static int method932(CharSequence arg0, int arg1, int arg2, byte[] arg3, int arg4) {
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

    @ObfuscatedName("at.l(Lfu;IS)Lcs;")
    public static class84 method1035(class171 arg0, int arg1) {
        return class80.method581(arg0, arg1) ? class80.method149() : null;
    }

    @ObfuscatedName("eu.n(B)V")
    public static void method2825() {
        try {
            File var0 = new File(field2281, "random.dat");
            if (var0.exists()) {
                class153.field2284 = new class232(new class231(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < field1818.length; var1++) {
                    for (int var2 = 0; var2 < field2051.length; var2++) {
                        File var3 = new File(field2051[var2] + field1818[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            class153.field2284 = new class232(new class231(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (class153.field2284 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                class153.field2284 = new class232(new class231(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("b.a(I)V")
    public static final void method554() {
        if (field2760 == client.field473) {
            return;
        }
        client.field473 = field2760;
        int var0 = field2760;
        int[] var1 = field2954.field1465;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field86[var0][var6][var4] & 0x18) == 0) {
                    field2091.method1868(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class6.field86[var0 + 1][var6][var4] & 0x8) != 0) {
                    field2091.method1868(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        field2954.method1714();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field86[var0][var10][var9] & 0x18) == 0) {
                    client.method734(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class6.field86[var0 + 1][var10][var9] & 0x8) != 0) {
                    client.method734(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        client.field310 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = field2091.method1934(field2760, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class43.method117(var14).field973;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = client.field410[field2760].field1951;
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
                        client.field534[client.field310] = field805[var15];
                        client.field509[client.field310] = var16;
                        client.field533[client.field310] = var17;
                        client.field310++;
                    }
                }
            }
        }
        field3217.method1636();
    }

    @ObfuscatedName("fj.aw(I)V")
    public static final void method2992() {
        if (client.field374 != -1) {
            client.method36(client.field374);
        }
        for (int var0 = 0; var0 < client.field426; var0++) {
            if (client.field495[var0]) {
                client.field507[var0] = true;
            }
            client.field508[var0] = client.field495[var0];
            client.field495[var0] = false;
        }
        client.field452 = client.field333;
        client.field450 = -1;
        client.field496 = -1;
        field70 = null;
        if (client.field374 != -1) {
            client.field426 = 0;
            client.method3808(client.field374, 0, 0, field1268, field1429, 0, 0, -1);
        }
        class83.method1732();
        if (client.field442) {
            client.method2826();
        } else if (client.field450 != -1) {
            client.method898(client.field450, client.field496);
        }
        if (client.field403 == 3) {
            for (int var1 = 0; var1 < client.field426; var1++) {
                if (client.field508[var1]) {
                    class83.method1738(client.field577[var1], client.field510[var1], client.field511[var1], client.field512[var1], 16711935, 128);
                } else if (client.field507[var1]) {
                    class83.method1738(client.field577[var1], client.field510[var1], client.field511[var1], client.field512[var1], 16711680, 128);
                }
            }
        }
        int var2 = field2760;
        int var3 = field2137.field879;
        int var4 = field2137.field837;
        int var5 = client.field421;
        for (class25 var6 = (class25) class25.field635.method3597(); var6 != null; var6 = (class25) class25.field635.method3599()) {
            if (var6.field638 != -1 || var6.field625 != null) {
                int var7 = 0;
                if (var3 > var6.field629) {
                    var7 += var3 - var6.field629;
                } else if (var3 < var6.field627) {
                    var7 += var6.field627 - var3;
                }
                if (var4 > var6.field637) {
                    var7 += var4 - var6.field637;
                } else if (var4 < var6.field628) {
                    var7 += var6.field628 - var4;
                }
                if (var7 - 64 > var6.field630 || client.field409 == 0 || var6.field626 != var2) {
                    if (var6.field633 != null) {
                        field12.method1144(var6.field633);
                        var6.field633 = null;
                    }
                    if (var6.field636 != null) {
                        field12.method1144(var6.field636);
                        var6.field636 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = client.field409 * (var6.field630 - var7) / var6.field630;
                    class62 var10000;
                    if (var6.field633 != null) {
                        var6.field633.method1316(var8);
                    } else if (var6.field638 >= 0) {
                        var10000 = (class62) null;
                        class62 var9 = class62.method1259(field1930, var6.field638, 0);
                        if (var9 != null) {
                            class66 var10 = var9.method1250().method1291(field2080);
                            class68 var11 = class68.method1312(var10, 100, var8);
                            var11.method1339(-1);
                            field12.method1143(var11);
                            var6.field633 = var11;
                        }
                    }
                    if (var6.field636 != null) {
                        var6.field636.method1316(var8);
                        if (!var6.field636.method3700()) {
                            var6.field636 = null;
                        }
                    } else if (var6.field625 != null && (var6.field632 -= var5) <= 0) {
                        int var12 = (int) (Math.random() * (double) var6.field625.length);
                        var10000 = (class62) null;
                        class62 var13 = class62.method1259(field1930, var6.field625[var12], 0);
                        if (var13 != null) {
                            class66 var14 = var13.method1250().method1291(field2080);
                            class68 var15 = class68.method1312(var14, 100, var8);
                            var15.method1339(0);
                            field12.method1143(var15);
                            var6.field636 = var15;
                            var6.field632 = var6.field634 + (int) (Math.random() * (double) (var6.field631 - var6.field634));
                        }
                    }
                }
            }
        }
        client.field421 = 0;
    }

    @ObfuscatedName("ec.ao(IIIIZI)V")
    public static final void method2985(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (client.field298 - client.field319) * var5 / 100 + client.field319;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < client.field562) {
            short var8 = client.field562;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > client.field395) {
                var6 = client.field395;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class83.method1732();
                    class83.method1755(arg0, arg1, var10, arg3, -16777216);
                    class83.method1755(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > client.field561) {
            short var11 = client.field561;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < client.field560) {
                var6 = client.field560;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class83.method1732();
                    class83.method1755(arg0, arg1, arg2, var13, -16777216);
                    class83.method1755(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (client.field559 - client.field558) * var5 / 100 + client.field558;
        client.field568 = arg3 * var6 * var14 / 85504 << 1;
        if (client.field538 != arg2 || client.field525 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class95.field1624[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class90.method1869(var15, 500, 800, arg2, arg3);
        }
        client.field338 = arg0;
        client.field565 = arg1;
        client.field538 = arg2;
        client.field525 = arg3;
    }

    @ObfuscatedName("ej.bo(III)V")
    public static void method2968(int arg0, int arg1) {
        client.field379.method2661(168);
        client.field379.method2437(arg1);
        client.field379.method2470(arg0);
    }
}
