package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("h.aa")
    public static int field100;

    @ObfuscatedName("an.f")
    public static int field1003;

    @ObfuscatedName("an.e")
    public static class168 field1006;

    @ObfuscatedName("an.w")
    public static class168 field1008;

    @ObfuscatedName("h.dj")
    public static int field101;

    @ObfuscatedName("an.mr")
    public static byte field1013;

    @ObfuscatedName("ax.dg")
    public static int[] field1017;

    @ObfuscatedName("h.s")
    public static class168 field102;

    @ObfuscatedName("ax.e")
    public static class168 field1025;

    @ObfuscatedName("ax.ix")
    public static int field1026;

    @ObfuscatedName("au.e")
    public static class168 field1029;

    @ObfuscatedName("au.ch")
    public static class144 field1041;

    @ObfuscatedName("at.rx")
    public static String field1043;

    @ObfuscatedName("at.e")
    public static class168 field1046;

    @ObfuscatedName("at.ap")
    public static int[] field1048;

    @ObfuscatedName("ao.e")
    public static class168 field1054;

    @ObfuscatedName("ao.x")
    public static int[] field1062;

    @ObfuscatedName("ao.gk")
    public static int field1064;

    @ObfuscatedName("al.np")
    public static class75 field1067;

    @ObfuscatedName("al.qr")
    public static int field1072;

    @ObfuscatedName("ak.dc")
    public static int field1078;

    @ObfuscatedName("as.p")
    public static class168 field1084;

    @ObfuscatedName("as.h")
    public static boolean field1101;

    @ObfuscatedName("as.bz")
    public static int field1104;

    @ObfuscatedName("as.g")
    public static int field1127;

    @ObfuscatedName("as.qo")
    public static int field1133;

    @ObfuscatedName("bj.e")
    public static class168 field1135;

    @ObfuscatedName("bj.bq")
    public static class81[] field1139;

    @ObfuscatedName("bo.e")
    public static class54 field1144;

    @ObfuscatedName("bl.h")
    public static class73 field1151;

    @ObfuscatedName("bl.f")
    public static int field1154;

    @ObfuscatedName("bl.s")
    public static boolean field1161;

    @ObfuscatedName("bw.ic")
    public static int field1186;

    @ObfuscatedName("bw.by")
    public static class169 field1190;

    @ObfuscatedName("bw.ks")
    public static int field1194;

    @ObfuscatedName("bv.a")
    public static float field1208;

    @ObfuscatedName("bv.r")
    public static int field1216;

    @ObfuscatedName("bs.m")
    public static int[] field1240;

    @ObfuscatedName("bs.k")
    public static int[] field1249;

    @ObfuscatedName("bs.n")
    public static boolean[] field1250;

    @ObfuscatedName("be.i")
    public static class61[] field1265;

    @ObfuscatedName("be.r")
    public static int field1268;

    @ObfuscatedName("be.m")
    public static int field1270;

    @ObfuscatedName("be.v")
    public static float[] field1271;

    @ObfuscatedName("be.y")
    public static class68[] field1272;

    @ObfuscatedName("be.ai")
    public static float[] field1273;

    @ObfuscatedName("be.a")
    public static int field1274;

    @ObfuscatedName("be.l")
    public static boolean[] field1275;

    @ObfuscatedName("be.o")
    public static int[] field1276;

    @ObfuscatedName("be.k")
    public static int field1278;

    @ObfuscatedName("be.n")
    public static class74[] field1280;

    @ObfuscatedName("be.aq")
    public static float[] field1281;

    @ObfuscatedName("be.t")
    public static float[] field1282;

    @ObfuscatedName("be.d")
    public static float[] field1283;

    @ObfuscatedName("be.z")
    public static float[] field1284;

    @ObfuscatedName("be.g")
    public static byte[] field1286;

    @ObfuscatedName("be.ap")
    public static float[] field1287;

    @ObfuscatedName("be.az")
    public static int[] field1288;

    @ObfuscatedName("be.ae")
    public static int[] field1289;

    @ObfuscatedName("g.dy")
    public static int field129;

    @ObfuscatedName("be.j")
    public static class69[] field1290;

    @ObfuscatedName("e.fh")
    public static int field13;

    @ObfuscatedName("bk.bu")
    public static class169 field1320;

    @ObfuscatedName("bz.eg")
    public static class79[] field1341;

    @ObfuscatedName("bt.r")
    public static byte[][] field1353;

    @ObfuscatedName("bt.f")
    public static int field1355;

    @ObfuscatedName("bt.g")
    public static int[] field1356;

    @ObfuscatedName("bt.w")
    public static int field1357;

    @ObfuscatedName("bt.s")
    public static int[] field1358;

    @ObfuscatedName("bt.e")
    public static int field1360;

    @ObfuscatedName("bx.ao")
    public static long field1366;

    @ObfuscatedName("bx.o")
    public static String[] field1369;

    @ObfuscatedName("bx.aq")
    public static int[] field1370;

    @ObfuscatedName("ca.y")
    public static int[] field1384;

    @ObfuscatedName("ca.j")
    public static int field1385;

    @ObfuscatedName("ca.i")
    public static int field1388;

    @ObfuscatedName("a.ii")
    public static class174 field139;

    @ObfuscatedName("a.jc")
    public static int field140;

    @ObfuscatedName("cq.ax")
    public static class144 field1406;

    @ObfuscatedName("cq.bn")
    public static class169 field1407;

    @ObfuscatedName("cf.j")
    public static int[] field1420;

    @ObfuscatedName("ci.s")
    public static byte[][][] field1432;

    @ObfuscatedName("ci.k")
    public static short[][] field1434;

    @ObfuscatedName("ci.p")
    public static int[] field1438;

    @ObfuscatedName("ch.dk")
    public static int field1440;

    @ObfuscatedName("cr.c")
    public static int field1448;

    @ObfuscatedName("cr.o")
    public static int field1459;

    @ObfuscatedName("cr.x")
    public static int field1461;

    @ObfuscatedName("cr.q")
    public static int field1463;

    @ObfuscatedName("cr.u")
    public static int field1464;

    @ObfuscatedName("cr.t")
    public static int field1465;

    @ObfuscatedName("cr.d")
    public static int field1466;

    @ObfuscatedName("cr.z")
    public static int field1467;

    @ObfuscatedName("cr.v")
    public static int field1468;

    @ObfuscatedName("cr.ap")
    public static int field1470;

    @ObfuscatedName("cr.ai")
    public static int field1471;

    @ObfuscatedName("cr.ae")
    public static int field1472;

    @ObfuscatedName("cr.aq")
    public static int field1473;

    @ObfuscatedName("cr.by")
    public static int field1476;

    @ObfuscatedName("cr.bh")
    public static int field1484;

    @ObfuscatedName("cr.bd")
    public static int field1495;

    @ObfuscatedName("cr.br")
    public static boolean[][] field1498;

    @ObfuscatedName("cr.bl")
    public static int field1499;

    @ObfuscatedName("cr.b")
    public static int field1501;

    @ObfuscatedName("cr.bw")
    public static int field1502;

    @ObfuscatedName("cr.bn")
    public static int field1503;

    @ObfuscatedName("cm.m")
    public static int[] field1505;

    @ObfuscatedName("cm.cr")
    public static class144 field1517;

    @ObfuscatedName("cw.n")
    public static int[] field1530;

    @ObfuscatedName("cw.as")
    public static class81[] field1537;

    @ObfuscatedName("k.ac")
    public static String field154;

    @ObfuscatedName("cd.f")
    public static int field1542;

    @ObfuscatedName("cd.mx")
    public static class25[] field1543;

    @ObfuscatedName("cd.ej")
    public static class79[] field1545;

    @ObfuscatedName("cg.n")
    public static int field1557;

    @ObfuscatedName("cg.b")
    public static int field1558;

    @ObfuscatedName("cg.u")
    public static int field1560;

    @ObfuscatedName("cg.t")
    public static int field1561;

    @ObfuscatedName("cg.d")
    public static int field1562;

    @ObfuscatedName("cg.z")
    public static int field1563;

    @ObfuscatedName("cg.m")
    public static int field1564;

    @ObfuscatedName("cg.q")
    public static int field1568;

    @ObfuscatedName("cg.ap")
    public static class93 field1570;

    @ObfuscatedName("cn.nl")
    public static int field1602;

    @ObfuscatedName("cn.r")
    public static int[][] field1603;

    @ObfuscatedName("cx.r")
    public static int field1612;

    @ObfuscatedName("k.di")
    public static int[] field164;

    @ObfuscatedName("co.in")
    public static class174 field1650;

    @ObfuscatedName("cj.al")
    public static class169 field1652;

    @ObfuscatedName("cj.bo")
    public static class81 field1663;

    @ObfuscatedName("m.c")
    public static int field167;

    @ObfuscatedName("m.fy")
    public static int field168;

    @ObfuscatedName("m.po")
    public static class222 field169;

    @ObfuscatedName("ct.bc")
    public static String field1733;

    @ObfuscatedName("ct.ne")
    public static int field1735;

    @ObfuscatedName("dk.lo")
    public static class131 field1760;

    @ObfuscatedName("dk.as")
    public static class169 field1773;

    @ObfuscatedName("e.ms")
    public static byte field18;

    @ObfuscatedName("dy.bo")
    public static int field1812;

    @ObfuscatedName("dy.bj")
    public static int field1828;

    @ObfuscatedName("dy.bq")
    public static int field1829;

    @ObfuscatedName("y.bj")
    public static class81[] field183;

    @ObfuscatedName("dj.p")
    public static int field1845;

    @ObfuscatedName("dj.h")
    public static int field1846;

    @ObfuscatedName("dv.h")
    public static byte[][][] field1857;

    @ObfuscatedName("dv.ht")
    public static int field1858;

    @ObfuscatedName("dv.o")
    public static int field1861;

    @ObfuscatedName("dv.pp")
    public static GarbageCollectorMXBean field1864;

    @ObfuscatedName("db.bw")
    public static class169 field1881;

    @ObfuscatedName("db.cm")
    public static char field1884;

    @ObfuscatedName("dn.l")
    public static String[] field1892;

    @ObfuscatedName("y.en")
    public static class81[] field191;

    @ObfuscatedName("y.qn")
    public static Canvas field193;

    @ObfuscatedName("do.ny")
    public static int field1932;

    @ObfuscatedName("dg.bb")
    public static int field1948;

    @ObfuscatedName("dg.rb")
    public static boolean field1949;

    @ObfuscatedName("dt.w")
    public static long field1955;

    @ObfuscatedName("dt.e")
    public static long field1956;

    @ObfuscatedName("dt.bi")
    public static class169 field1957;

    @ObfuscatedName("dt.v")
    public static int[] field1958;

    @ObfuscatedName("da.nv")
    public static int field1960;

    @ObfuscatedName("da.qp")
    public static int field1962;

    @ObfuscatedName("dq.h")
    public static class168 field1982;

    @ObfuscatedName("dq.ak")
    public static class79[] field1984;

    @ObfuscatedName("ds.pr")
    public static short[] field1995;

    @ObfuscatedName("ds.ev")
    public static class79[] field1998;

    @ObfuscatedName("i.g")
    public static class79 field200;

    @ObfuscatedName("dc.eb")
    public static class79[] field2015;

    @ObfuscatedName("dx.nw")
    public static int field2019;

    @ObfuscatedName("i.jk")
    public static class174[] field202;

    @ObfuscatedName("dx.ct")
    public static class225 field2023;

    @ObfuscatedName("dx.bh")
    public static class169 field2024;

    @ObfuscatedName("dx.p")
    public static byte[][][] field2025;

    @ObfuscatedName("dr.kd")
    public static class20 field2028;

    @ObfuscatedName("dr.pj")
    public static class137 field2029;

    @ObfuscatedName("dr.m")
    public static boolean field2031;

    @ObfuscatedName("df.dv")
    public static int field2034;

    @ObfuscatedName("df.hy")
    public static int field2035;

    @ObfuscatedName("i.nd")
    public static int field205;

    @ObfuscatedName("eh.qt")
    public static int field2056;

    @ObfuscatedName("er.bv")
    public static class169 field2058;

    @ObfuscatedName("i.qx")
    public static Image field207;

    @ObfuscatedName("eq.qg")
    public static class78 field2071;

    @ObfuscatedName("et.nt")
    public static class56 field2075;

    @ObfuscatedName("et.w")
    public static File field2076;

    @ObfuscatedName("et.bf")
    public static FontMetrics field2077;

    @ObfuscatedName("et.q")
    public static String field2078;

    @ObfuscatedName("es.b")
    public static String field2084;

    @ObfuscatedName("es.w")
    public static String field2093;

    @ObfuscatedName("j.h")
    public static class168 field210;

    @ObfuscatedName("ey.ey")
    public static class79 field2128;

    @ObfuscatedName("j.q")
    public static int[] field213;

    @ObfuscatedName("j.da")
    public static int[][] field214;

    @ObfuscatedName("ep.ck")
    public static int field2159;

    @ObfuscatedName("ep.md")
    public static class79 field2161;

    @ObfuscatedName("ev.j")
    public static String field2166;

    @ObfuscatedName("ev.kw")
    public static class132 field2167;

    @ObfuscatedName("ev.ga")
    public static class174 field2171;

    @ObfuscatedName("eg.bq")
    public static class169 field2176;

    @ObfuscatedName("eg.gi")
    public static class174 field2183;

    @ObfuscatedName("eg.pa")
    public static int field2186;

    @ObfuscatedName("eg.u")
    public static int[] field2188;

    @ObfuscatedName("l.ci")
    public static class147 field219;

    @ObfuscatedName("l.ni")
    public static int field222;

    @ObfuscatedName("ed.g")
    public static int field2220;

    @ObfuscatedName("ed.e")
    public static Applet field2221;

    @ObfuscatedName("em.s")
    public static File field2227;

    @ObfuscatedName("em.h")
    public static int field2229;

    @ObfuscatedName("em.i")
    public static class229[] field2231;

    @ObfuscatedName("em.eo")
    public static class81[] field2237;

    @ObfuscatedName("em.p")
    public static File field2238;

    @ObfuscatedName("eo.nm")
    public static int field2239;

    @ObfuscatedName("ei.dq")
    public static class87 field2251;

    @ObfuscatedName("ef.bk")
    public static int field2282;

    @ObfuscatedName("ef.y")
    public static boolean field2290;

    @ObfuscatedName("o.pe")
    public static int field230;

    @ObfuscatedName("o.pd")
    public static Clipboard field237;

    @ObfuscatedName("c.bd")
    public static class169 field247;

    @ObfuscatedName("fh.ex")
    public static class79 field2597;

    @ObfuscatedName("x.r")
    public static class81[] field261;

    @ObfuscatedName("fy.hp")
    public static int field2643;

    @ObfuscatedName("fp.bp")
    public static int field2648;

    @ObfuscatedName("fk.e")
    public static boolean field2651;

    @ObfuscatedName("fm.a")
    public static int field2657;

    @ObfuscatedName("fm.r")
    public static class155 field2658;

    @ObfuscatedName("fa.pg")
    public static class135 field2699;

    @ObfuscatedName("fa.ep")
    public static class79[] field2705;

    @ObfuscatedName("fu.f")
    public static long field2715;

    @ObfuscatedName("fu.b")
    public static class120 field2723;

    @ObfuscatedName("fu.i")
    public static class173 field2725;

    @ObfuscatedName("fu.e")
    public static class144 field2729;

    @ObfuscatedName("b.bl")
    public static class169 field273;

    @ObfuscatedName("b.ff")
    public static int field274;

    @ObfuscatedName("fr.if")
    public static int field2742;

    @ObfuscatedName("fg.w")
    public static boolean[] field2746;

    @ObfuscatedName("fg.f")
    public static class168 field2747;

    @ObfuscatedName("fg.s")
    public static class168 field2748;

    @ObfuscatedName("fg.p")
    public static class168 field2749;

    @ObfuscatedName("w.m")
    public static class174 field28;

    @ObfuscatedName("client.g")
    public static class154 field282;

    @ObfuscatedName("fg.e")
    public static class174[][] field2838;

    @ObfuscatedName("client.k")
    public static class213 field284;

    @ObfuscatedName("fv.r")
    public static short[] field2895;

    @ObfuscatedName("fc.im")
    public static class31 field2911;

    @ObfuscatedName("fq.g")
    public static short[] field2923;

    @ObfuscatedName("fq.a")
    public static short[][] field2924;

    @ObfuscatedName("gd.n")
    public static class181 field2956;

    @ObfuscatedName("gd.f")
    public static class168 field2957;

    @ObfuscatedName("gd.s")
    public static class185 field2958;

    @ObfuscatedName("gd.w")
    public static class168 field2961;

    @ObfuscatedName("gd.e")
    public static class168 field2962;

    @ObfuscatedName("gn.dt")
    public static int[] field3002;

    @ObfuscatedName("gr.s")
    public static class81 field3045;

    @ObfuscatedName("gr.j")
    public static int field3048;

    @ObfuscatedName("gc.iq")
    public static int field3049;

    @ObfuscatedName("client.af")
    public static class147 field306;

    @ObfuscatedName("gc.z")
    public static int[] field3066;

    @ObfuscatedName("gg.k")
    public static int[] field3077;

    @ObfuscatedName("hv.w")
    public static String field3118;

    @ObfuscatedName("hv.k")
    public static int field3119;

    @ObfuscatedName("hf.e")
    public static class168 field3145;

    @ObfuscatedName("hc.a")
    public static int[] field3153;

    @ObfuscatedName("hs.fj")
    public static int field3157;

    @ObfuscatedName("hs.ak")
    public static class169 field3158;

    @ObfuscatedName("hs.gv")
    public static class174 field3159;

    @ObfuscatedName("hs.e")
    public static class168 field3160;

    @ObfuscatedName("hz.em")
    public static class81[] field3163;

    @ObfuscatedName("hj.e")
    public static class168 field3164;

    @ObfuscatedName("hi.w")
    public static class168 field3167;

    @ObfuscatedName("hg.nk")
    public static class57 field3180;

    @ObfuscatedName("ha.e")
    public static class114 field3181;

    @ObfuscatedName("ha.m")
    public static class225 field3182;

    @ObfuscatedName("hh.k")
    public static class81[] field3195;

    @ObfuscatedName("w.pn")
    public static long field32;

    @ObfuscatedName("client.he")
    public static int field321;

    @ObfuscatedName("hm.w")
    public static int field3211;

    @ObfuscatedName("hm.e")
    public static String field3213;

    @ObfuscatedName("hm.y")
    public static class60 field3215;

    @ObfuscatedName("client.dx")
    public static int field343;

    @ObfuscatedName("client.f")
    public static client field375;

    @ObfuscatedName("client.ed")
    public static class79[] field513;

    @ObfuscatedName("q.hv")
    public static class3 field573;

    @ObfuscatedName("u.qw")
    public static int field576;

    @ObfuscatedName("f.p")
    public static int field61;

    @ObfuscatedName("z.br")
    public static class169 field612;

    @ObfuscatedName("v.jl")
    public static int field613;

    @ObfuscatedName("v.p")
    public static class26[] field616;

    @ObfuscatedName("f.qk")
    public static Frame field62;

    @ObfuscatedName("v.cp")
    public static class225 field629;

    @ObfuscatedName("v.fa")
    public static int field630;

    @ObfuscatedName("aq.ec")
    public static class79[] field631;

    @ObfuscatedName("aq.ma")
    public static int field645;

    @ObfuscatedName("ap.k")
    public static class19 field653;

    @ObfuscatedName("ap.b")
    public static int[] field656;

    @ObfuscatedName("ap.z")
    public static int[] field657;

    @ObfuscatedName("ap.bj")
    public static class169 field660;

    @ObfuscatedName("ai.l")
    public static class120 field668;

    @ObfuscatedName("s.am")
    public static boolean field67;

    @ObfuscatedName("ae.nj")
    public static int field672;

    @ObfuscatedName("az.ez")
    public static class79[] field689;

    @ObfuscatedName("ah.f")
    public static class81 field695;

    @ObfuscatedName("ah.p")
    public static class81[] field696;

    @ObfuscatedName("ah.a")
    public static class81 field705;

    @ObfuscatedName("ah.k")
    public static class81 field706;

    @ObfuscatedName("ah.h")
    public static class79 field721;

    @ObfuscatedName("ah.y")
    public static int[] field724;

    @ObfuscatedName("ar.d")
    public static class14 field729;

    @ObfuscatedName("ar.nq")
    public static int field739;

    @ObfuscatedName("ar.bo")
    public static class169 field744;

    @ObfuscatedName("p.j")
    public static int[][][] field75;

    @ObfuscatedName("aj.cj")
    public static class225 field754;

    @ObfuscatedName("aj.ql")
    public static Font field755;

    @ObfuscatedName("aj.m")
    public static class81 field758;

    @ObfuscatedName("p.qs")
    public static class134 field76;

    @ObfuscatedName("ay.qc")
    public static int field763;

    @ObfuscatedName("ay.u")
    public static String field766;

    @ObfuscatedName("ag.f")
    public static int[] field772;

    @ObfuscatedName("ag.s")
    public static String[] field773;

    @ObfuscatedName("ag.n")
    public static class174 field780;

    @ObfuscatedName("ag.an")
    public static class147 field784;

    @ObfuscatedName("ag.pb")
    public static class161 field785;

    @ObfuscatedName("av.dh")
    public static byte[][] field814;

    @ObfuscatedName("h.g")
    public static byte[][][] field83;

    @ObfuscatedName("af.qf")
    public static int field849;

    @ObfuscatedName("h.i")
    public static int[] field85;

    @ObfuscatedName("af.pt")
    public static int field854;

    @ObfuscatedName("af.qa")
    public static int field855;

    @ObfuscatedName("am.ih")
    public static int field860;

    @ObfuscatedName("am.pk")
    public static class9 field866;

    @ObfuscatedName("h.h")
    public static int[] field87;

    @ObfuscatedName("am.e")
    public static class168 field895;

    @ObfuscatedName("e.l")
    public static String field9;

    @ObfuscatedName("aw.w")
    public static class168 field900;

    @ObfuscatedName("aw.f")
    public static class168 field902;

    @ObfuscatedName("h.nn")
    public static class57 field95;

    @ObfuscatedName("h.fz")
    public static int field96;

    @ObfuscatedName("ad.e")
    public static class168 field960;

    @ObfuscatedName("aa.f")
    public static class168 field962;

    @ObfuscatedName("aa.w")
    public static class168 field963;

    @ObfuscatedName("aa.e")
    public static class168 field971;

    @ObfuscatedName("aa.dz")
    public static byte[][] field981;

    @ObfuscatedName("aa.fs")
    public static int field982;

    @ObfuscatedName("h.a")
    public static byte[][][] field99;

    @ObfuscatedName("ac.w")
    public static class168 field993;

    @ObfuscatedName("ag.h([BZI)Ljava/lang/Object;")
    public static Object method712(byte[] arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class126.field2030) {
            try {
                class119 var2 = new class119();
                var2.method2335(arg0);
                return var2;
            } catch (Throwable var4) {
                class126.field2030 = true;
            }
        }
        return arg1 ? class126.method891(arg0) : arg0;
    }

    @ObfuscatedName("fj.e(CI)B")
    public static byte method2955(char arg0) {
        byte var1;
        if (!(arg0 <= 0 || arg0 >= 128) || !(arg0 < 160 || arg0 > 255)) {
            var1 = (byte) arg0;
        } else if (arg0 == 8364) {
            var1 = -128;
        } else if (arg0 == 8218) {
            var1 = -126;
        } else if (arg0 == 402) {
            var1 = -125;
        } else if (arg0 == 8222) {
            var1 = -124;
        } else if (arg0 == 8230) {
            var1 = -123;
        } else if (arg0 == 8224) {
            var1 = -122;
        } else if (arg0 == 8225) {
            var1 = -121;
        } else if (arg0 == 710) {
            var1 = -120;
        } else if (arg0 == 8240) {
            var1 = -119;
        } else if (arg0 == 352) {
            var1 = -118;
        } else if (arg0 == 8249) {
            var1 = -117;
        } else if (arg0 == 338) {
            var1 = -116;
        } else if (arg0 == 381) {
            var1 = -114;
        } else if (arg0 == 8216) {
            var1 = -111;
        } else if (arg0 == 8217) {
            var1 = -110;
        } else if (arg0 == 8220) {
            var1 = -109;
        } else if (arg0 == 8221) {
            var1 = -108;
        } else if (arg0 == 8226) {
            var1 = -107;
        } else if (arg0 == 8211) {
            var1 = -106;
        } else if (arg0 == 8212) {
            var1 = -105;
        } else if (arg0 == 732) {
            var1 = -104;
        } else if (arg0 == 8482) {
            var1 = -103;
        } else if (arg0 == 353) {
            var1 = -102;
        } else if (arg0 == 8250) {
            var1 = -101;
        } else if (arg0 == 339) {
            var1 = -100;
        } else if (arg0 == 382) {
            var1 = -98;
        } else if (arg0 == 376) {
            var1 = -97;
        } else {
            var1 = 63;
        }
        return var1;
    }

    @ObfuscatedName("ek.e(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method2663(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("cj.g(Ljava/lang/Object;ZB)[B")
    public static byte[] method2054(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? class126.method891(var2) : var2;
        } else if (arg0 instanceof class126) {
            class126 var3 = (class126) arg0;
            return var3.method2337();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("fz.w(J)Ljava/lang/String;")
    public static String method2942(long arg0) {
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
                char var8 = class163.field2649[(int) (var6 - arg0 * 37L)];
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

    @ObfuscatedName("y.w(JLjava/lang/String;I)I")
    public static final int method155(long arg0, String arg1) {
        Random var3 = new Random();
        class120 var4 = new class120(128);
        class120 var5 = new class120(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2397(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2449(var3.nextInt());
        }
        var4.method2449(var6[0]);
        var4.method2449(var6[1]);
        var4.method2412(arg0);
        var4.method2412(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2449(var3.nextInt());
        }
        var4.method2473(class10.field155, class10.field162);
        var5.method2397(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2449(var3.nextInt());
        }
        var5.method2412(var3.nextLong());
        var5.method2478(var3.nextLong());
        class150.method18(var5);
        var5.method2412(var3.nextLong());
        var5.method2473(class10.field155, class10.field162);
        int var10 = class120.method957(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class120 var11 = new class120(var10);
        var11.method2346(arg1);
        var11.field1977 = var10;
        var11.method2371(var6);
        class120 var12 = new class120(var11.field1977 + var5.field1977 + var4.field1977 + 5);
        var12.method2397(2);
        var12.method2397(var4.field1977);
        var12.method2349(var4.field1981, 0, var4.field1977);
        var12.method2397(var5.field1977);
        var12.method2349(var5.field1981, 0, var5.field1977);
        var12.method2545(var11.field1977);
        var12.method2349(var11.field1981, 0, var11.field1977);
        String var13 = class162.method2680(var12.field1981);
        try {
            URL var14 = new URL(method624("services", false) + "m=accountappeal/login.ws");
            URLConnection var15 = var14.openConnection();
            var15.setDoInput(true);
            var15.setDoOutput(true);
            var15.setConnectTimeout(5000);
            OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
            var16.write("data2=" + class227.method980(var13) + "&dest=" + class227.method980("passwordchoice.ws"));
            var16.flush();
            InputStream var17 = var15.getInputStream();
            class120 var18 = new class120(new byte[1000]);
            do {
                int var19 = var17.read(var18.field1981, var18.field1977, 1000 - var18.field1977);
                if (var19 == -1) {
                    var16.close();
                    var17.close();
                    String var20 = new String(var18.field1981);
                    if (var20.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var20.startsWith("WRONG")) {
                        return 7;
                    } else if (var20.startsWith("RELOAD")) {
                        return 3;
                    } else if (var20.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var18.method2372(var6);
                        while (var18.field1977 > 0 && var18.field1981[var18.field1977 - 1] == 0) {
                            var18.field1977--;
                        }
                        String var21 = new String(var18.field1981, 0, var18.field1977);
                        boolean var22;
                        if (var21 == null) {
                            var22 = false;
                        } else {
                            label73: {
                                try {
                                    new URL(var21);
                                } catch (MalformedURLException var25) {
                                    var22 = false;
                                    break label73;
                                }
                                var22 = true;
                            }
                        }
                        if (var22) {
                            class139.method2898(var21, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var18.field1977 += var19;
            } while (var18.field1977 < 1000);
            return 5;
        } catch (Throwable var26) {
            var26.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("d.i(Lft;IIB)Z")
    public static boolean method579(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3048(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            class77.method2579(var3);
            return true;
        }
    }

    @ObfuscatedName("p.ah(Lbf;I)V")
    public static final void method46(class67 arg0) {
        arg0.field1239 = false;
        if (arg0.field1238 != null) {
            arg0.field1238.field1235 = 0;
        }
        for (class67 var1 = arg0.method1104(); var1 != null; var1 = arg0.method1109()) {
            method46(var1);
        }
    }

    @ObfuscatedName("dx.m(IIII)I")
    public static final int method2625(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = class6.method165(var3, var5);
        int var8 = class6.method165(var3 + 1, var5);
        int var9 = class6.method165(var3, var5 + 1);
        int var10 = class6.method165(var3 + 1, var5 + 1);
        int var11 = 65536 - class92.field1555[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class92.field1555[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class92.field1555[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("ah.bm(III)V")
    public static final void method665(int arg0, int arg1) {
        class200 var2 = client.field411[field1064][arg0][arg1];
        if (var2 == null) {
            field2251.method1800(field1064, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3544(); var6 != null; var6 = (class29) var2.method3546()) {
            class52 var7 = class52.method696(var6.field667);
            long var8 = (long) var7.field1126;
            if (var7.field1103 == 1) {
                var8 = (long) (var6.field665 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            field2251.method1800(field1064, arg0, arg1);
            return;
        }
        var2.method3540(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3544(); var12 != null; var12 = (class29) var2.method3546()) {
            if (var5.field667 != var12.field667) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field667 != var12.field667 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        field2251.method1786(field1064, arg0, arg1, client.method1216(arg0 * 128 + 64, arg1 * 128 + 64, field1064), var5, var13, var10, var11);
    }

    @ObfuscatedName("v.dd(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method624(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (client.field283 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (client.field283 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (client.field283 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (client.field283 == 5) {
            arg0 = arg0 + "-wti";
        } else if (client.field283 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (field9 != null) {
            var3 = "/p=" + field9;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + client.field287 + "/a=" + field1861 + var3 + "/";
    }
}
