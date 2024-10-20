package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.util.concurrent.ScheduledExecutorService;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("client.lc")
    public static int field1135;

    @ObfuscatedName("y.u")
    public static class298 field12;

    @ObfuscatedName("cj.ev")
    public static class275 field1214;

    @ObfuscatedName("cj.fh")
    public static int field1216;

    @ObfuscatedName("cj.p")
    public static class228 field1217;

    @ObfuscatedName("ch.h")
    public static class80[] field1221;

    @ObfuscatedName("cd.r")
    public static String[] field1257;

    @ObfuscatedName("cd.y")
    public static int[] field1264;

    @ObfuscatedName("cd.w")
    public static class228 field1268;

    @ObfuscatedName("cd.b")
    public static int field1269;

    @ObfuscatedName("cd.a")
    public static class48 field1271;

    @ObfuscatedName("cd.pa")
    public static int field1273;

    @ObfuscatedName("cs.el")
    public static int field1288;

    @ObfuscatedName("cb.cp")
    public static class249 field1296;

    @ObfuscatedName("cb.x")
    public static class185 field1297;

    @ObfuscatedName("y.d")
    public static boolean field13;

    @ObfuscatedName("cu.c")
    public static int field1320;

    @ObfuscatedName("cc.ol")
    public static class102 field1329;

    @ObfuscatedName("cc.e")
    public static int field1330;

    @ObfuscatedName("cz.y")
    public static class298 field1338;

    @ObfuscatedName("cz.h")
    public static class298[] field1339;

    @ObfuscatedName("cz.d")
    public static class299 field1340;

    @ObfuscatedName("cz.b")
    public static class298 field1341;

    @ObfuscatedName("cz.n")
    public static boolean field1342;

    @ObfuscatedName("cz.p")
    public static class298 field1343;

    @ObfuscatedName("cz.m")
    public static int field1345;

    @ObfuscatedName("ct.f")
    public static short[][] field1400;

    @ObfuscatedName("cm.ad")
    public static FontMetrics field1429;

    @ObfuscatedName("ce.z")
    public static class298 field1443;

    @ObfuscatedName("ci.jv")
    public static class89 field1456;

    @ObfuscatedName("ci.om")
    public static int field1457;

    @ObfuscatedName("dj.ag")
    public static int[] field1488;

    @ObfuscatedName("dj.c")
    public static float[] field1493;

    @ObfuscatedName("dj.s")
    public static byte[] field1494;

    @ObfuscatedName("dj.b")
    public static int field1495;

    @ObfuscatedName("dj.e")
    public static int field1496;

    @ObfuscatedName("dj.f")
    public static int field1497;

    @ObfuscatedName("dj.z")
    public static int field1498;

    @ObfuscatedName("dj.u")
    public static class104[] field1499;

    @ObfuscatedName("y.fn")
    public static class299 field15;

    @ObfuscatedName("dj.g")
    public static float[] field1500;

    @ObfuscatedName("dj.t")
    public static class120[] field1502;

    @ObfuscatedName("dj.a")
    public static int[] field1504;

    @ObfuscatedName("dj.o")
    public static boolean[] field1505;

    @ObfuscatedName("dj.p")
    public static class108[] field1510;

    @ObfuscatedName("dj.at")
    public static float[] field1511;

    @ObfuscatedName("dj.k")
    public static float[] field1512;

    @ObfuscatedName("dj.q")
    public static float[] field1513;

    @ObfuscatedName("dj.ac")
    public static float[] field1514;

    @ObfuscatedName("dj.aw")
    public static float[] field1515;

    @ObfuscatedName("dj.ad")
    public static int[] field1518;

    @ObfuscatedName("dj.w")
    public static class115[] field1519;

    @ObfuscatedName("dn.z")
    public static int[] field1531;

    @ObfuscatedName("dn.f")
    public static int[] field1536;

    @ObfuscatedName("dn.u")
    public static boolean[] field1537;

    @ObfuscatedName("dd.e")
    public static int field1541;

    @ObfuscatedName("dd.h")
    public static int field1542;

    @ObfuscatedName("dd.ny")
    public static class76[] field1559;

    @ObfuscatedName("db.gm")
    public static int field1571;

    @ObfuscatedName("db.ad")
    public static int[] field1572;

    @ObfuscatedName("db.j")
    public static String field1575;

    @ObfuscatedName("db.go")
    public static int field1576;

    @ObfuscatedName("dc.b")
    public static byte[][][] field1596;

    @ObfuscatedName("y.gr")
    public static int field16;

    @ObfuscatedName("di.e")
    public static int field1617;

    @ObfuscatedName("di.b")
    public static float field1624;

    @ObfuscatedName("dm.jp")
    public static class228 field1666;

    @ObfuscatedName("dg.as")
    public static GarbageCollectorMXBean field1676;

    @ObfuscatedName("dg.f")
    public static int field1679;

    @ObfuscatedName("dx.cf")
    public static int field1684;

    @ObfuscatedName("dx.qb")
    public static class302 field1688;

    @ObfuscatedName("dr.bu")
    public static class298[] field1691;

    @ObfuscatedName("r.h")
    public static int field17;

    @ObfuscatedName("ds.z")
    public static class247 field1777;

    @ObfuscatedName("dz.t")
    public static int[] field1790;

    @ObfuscatedName("r.co")
    public static class249 field18;

    @ObfuscatedName("es.bd")
    public static int field1829;

    @ObfuscatedName("es.bo")
    public static int field1839;

    @ObfuscatedName("es.bi")
    public static int field1894;

    @ObfuscatedName("r.bz")
    public static class244 field19;

    @ObfuscatedName("ex.s")
    public static int field1903;

    @ObfuscatedName("ex.d")
    public static int field1904;

    @ObfuscatedName("ex.f")
    public static int field1905;

    @ObfuscatedName("ex.z")
    public static int field1906;

    @ObfuscatedName("ex.u")
    public static int field1907;

    @ObfuscatedName("ea.p")
    public static int field1913;

    @ObfuscatedName("ea.e")
    public static class247 field1915;

    @ObfuscatedName("ef.g")
    public static class145 field1925;

    @ObfuscatedName("ef.p")
    public static int field1928;

    @ObfuscatedName("ef.w")
    public static int field1929;

    @ObfuscatedName("ef.o")
    public static int field1931;

    @ObfuscatedName("ef.a")
    public static int field1932;

    @ObfuscatedName("ef.m")
    public static int field1934;

    @ObfuscatedName("ef.x")
    public static int field1935;

    @ObfuscatedName("ef.i")
    public static int field1937;

    @ObfuscatedName("ef.t")
    public static int field1941;

    @ObfuscatedName("eg.ej")
    public static long field1946;

    @ObfuscatedName("ei.aw")
    public static int[] field1959;

    @ObfuscatedName("eh.ag")
    public static int field1964;

    @ObfuscatedName("eh.bo")
    public static int field1976;

    @ObfuscatedName("eh.i")
    public static int field1977;

    @ObfuscatedName("eh.m")
    public static int field1978;

    @ObfuscatedName("eh.x")
    public static int field1979;

    @ObfuscatedName("eh.l")
    public static int field1980;

    @ObfuscatedName("eh.j")
    public static int field1981;

    @ObfuscatedName("eh.ac")
    public static int field1983;

    @ObfuscatedName("eh.q")
    public static int field1985;

    @ObfuscatedName("eh.bu")
    public static int field1987;

    @ObfuscatedName("eh.at")
    public static int field1988;

    @ObfuscatedName("eh.bi")
    public static int field1989;

    @ObfuscatedName("eh.c")
    public static int field1998;

    @ObfuscatedName("eh.bj")
    public static int field1999;

    @ObfuscatedName("r.d")
    public static int field20;

    @ObfuscatedName("eh.aw")
    public static int field2004;

    @ObfuscatedName("eh.k")
    public static int field2011;

    @ObfuscatedName("eh.bz")
    public static boolean[][] field2016;

    @ObfuscatedName("eh.g")
    public static int field2017;

    @ObfuscatedName("eh.bd")
    public static int field2018;

    @ObfuscatedName("eh.bx")
    public static int field2021;

    @ObfuscatedName("eh.a")
    public static int field2022;

    @ObfuscatedName("ep.e")
    public static int field2023;

    @ObfuscatedName("ep.cn")
    public static class249 field2024;

    @ObfuscatedName("eo.on")
    public static class109 field2025;

    @ObfuscatedName("eo.cw")
    public static class249 field2027;

    @ObfuscatedName("ek.hl")
    public static class228 field2041;

    @ObfuscatedName("ek.s")
    public static int[] field2043;

    @ObfuscatedName("ek.e")
    public static short[] field2044;

    @ObfuscatedName("ek.dk")
    public static int field2046;

    @ObfuscatedName("ed.aj")
    public static String field2049;

    @ObfuscatedName("ee.fc")
    public static class299[] field2094;

    @ObfuscatedName("el.bl")
    public static class71 field2099;

    @ObfuscatedName("el.s")
    public static int[] field2100;

    @ObfuscatedName("el.oo")
    public static class109 field2101;

    @ObfuscatedName("eb.du")
    public static int field2111;

    @ObfuscatedName("ez.s")
    public static short[] field2118;

    @ObfuscatedName("ec.ap")
    public static int field2129;

    @ObfuscatedName("ec.cc")
    public static class156 field2135;

    @ObfuscatedName("ec.g")
    public static String field2136;

    @ObfuscatedName("ey.v")
    public static String field2138;

    @ObfuscatedName("ey.dj")
    public static class249 field2139;

    @ObfuscatedName("ey.n")
    public static Applet field2141;

    @ObfuscatedName("ff.v")
    public static String field2153;

    @ObfuscatedName("ff.n")
    public static String field2158;

    @ObfuscatedName("ff.u")
    public static class163 field2160;

    @ObfuscatedName("ff.ep")
    public static class149 field2161;

    @ObfuscatedName("fr.t")
    public static class123[] field2164;

    @ObfuscatedName("fr.h")
    public static File field2165;

    @ObfuscatedName("fr.d")
    public static int field2166;

    @ObfuscatedName("fr.r")
    public static File field2170;

    @ObfuscatedName("fr.l")
    public static String field2175;

    @ObfuscatedName("fl.lp")
    public static class96 field2177;

    @ObfuscatedName("ft.p")
    public static class103 field2179;

    @ObfuscatedName("ft.v")
    public static File field2182;

    @ObfuscatedName("ft.ap")
    public static client field2183;

    @ObfuscatedName("fs.t")
    public static int[][][] field2184;

    @ObfuscatedName("fs.di")
    public static String field2188;

    @ObfuscatedName("s.gj")
    public static class7[] field219;

    @ObfuscatedName("fs.z")
    public static int[] field2190;

    @ObfuscatedName("fm.dp")
    public static class249 field2191;

    @ObfuscatedName("fm.pu")
    public static int field2192;

    @ObfuscatedName("fu.je")
    public static int field2205;

    @ObfuscatedName("fp.qe")
    public static class305 field2215;

    @ObfuscatedName("fo.h")
    public static int field2247;

    @ObfuscatedName("b.ig")
    public static int field226;

    @ObfuscatedName("e.b")
    public static int field236;

    @ObfuscatedName("e.ja")
    public static int field237;

    @ObfuscatedName("f.jx")
    public static class228 field240;

    @ObfuscatedName("f.qz")
    public static int field243;

    @ObfuscatedName("fz.ee")
    public static int field2458;

    @ObfuscatedName("fa.fk")
    public static int[] field2463;

    @ObfuscatedName("fa.b")
    public static short[][] field2464;

    @ObfuscatedName("fw.n")
    public static class157 field2480;

    @ObfuscatedName("fw.dw")
    public static int field2481;

    @ObfuscatedName("gp.k")
    public static int[] field2513;

    @ObfuscatedName("gv.ak")
    public static boolean field2534;

    @ObfuscatedName("gg.hp")
    public static class228 field2541;

    @ObfuscatedName("gg.b")
    public static int[] field2542;

    @ObfuscatedName("ge.n")
    public static long field2544;

    @ObfuscatedName("ge.v")
    public static long field2545;

    @ObfuscatedName("u.i")
    public static int field255;

    @ObfuscatedName("gn.e")
    public static byte[][] field2552;

    @ObfuscatedName("gc.be")
    public static int field2567;

    @ObfuscatedName("hz.z")
    public static boolean field2628;

    @ObfuscatedName("hz.y")
    public static class247 field2630;

    @ObfuscatedName("hz.r")
    public static class216 field2631;

    @ObfuscatedName("hz.d")
    public static class247 field2633;

    @ObfuscatedName("hz.v")
    public static class247 field2634;

    @ObfuscatedName("hz.ff")
    public static int[] field2635;

    @ObfuscatedName("hz.n")
    public static class247 field2636;

    @ObfuscatedName("w.eb")
    public static int field264;

    @ObfuscatedName("hu.cm")
    public static class249 field2664;

    @ObfuscatedName("h.fz")
    public static class299[] field27;

    @ObfuscatedName("w.s")
    public static class299 field270;

    @ObfuscatedName("hr.bx")
    public static class299[] field2710;

    @ObfuscatedName("hn.qx")
    public static class81 field2727;

    @ObfuscatedName("hq.d")
    public static class228[][] field2754;

    @ObfuscatedName("hq.b")
    public static class247 field2755;

    @ObfuscatedName("hq.f")
    public static class247 field2790;

    @ObfuscatedName("t.ag")
    public static int[] field283;

    @ObfuscatedName("o.p")
    public static boolean field287;

    @ObfuscatedName("a.io")
    public static class74 field289;

    @ObfuscatedName("hs.n")
    public static class247 field2899;

    @ObfuscatedName("ha.o")
    public static class185 field2919;

    @ObfuscatedName("hd.qu")
    public static short[] field2927;

    @ObfuscatedName("a.bj")
    public static class303 field295;

    @ObfuscatedName("is.nu")
    public static class299 field2952;

    @ObfuscatedName("ib.fr")
    public static int[] field2959;

    @ObfuscatedName("a.c")
    public static int[] field297;

    @ObfuscatedName("a.p")
    public static class275 field298;

    @ObfuscatedName("i.p")
    public static class112 field300;

    @ObfuscatedName("i.y")
    public static int field301;

    @ObfuscatedName("i.ft")
    public static byte[][] field302;

    @ObfuscatedName("i.bx")
    public static String field304;

    @ObfuscatedName("m.qo")
    public static class14 field308;

    @ObfuscatedName("m.fe")
    public static class299[] field309;

    @ObfuscatedName("x.bt")
    public static int field313;

    @ObfuscatedName("x.n")
    public static class247 field318;

    @ObfuscatedName("x.ce")
    public static class249 field320;

    @ObfuscatedName("l.pd")
    public static int field328;

    @ObfuscatedName("iq.ai")
    public static int field3302;

    @ObfuscatedName("iq.nx")
    public static int field3303;

    @ObfuscatedName("it.er")
    public static class275 field3307;

    @ObfuscatedName("j.fj")
    public static class298[] field331;

    @ObfuscatedName("il.av")
    public static Image field3321;

    @ObfuscatedName("ij.bk")
    public static String field3328;

    @ObfuscatedName("ij.h")
    public static Thread field3333;

    @ObfuscatedName("if.gx")
    public static int field3341;

    @ObfuscatedName("iw.y")
    public static long field3347;

    @ObfuscatedName("iw.n")
    public static class160 field3357;

    @ObfuscatedName("g.iz")
    public static int field336;

    @ObfuscatedName("iw.bq")
    public static int field3364;

    @ObfuscatedName("g.jb")
    public static int field337;

    @ObfuscatedName("iz.n")
    public static class247 field3375;

    @ObfuscatedName("im.v")
    public static int field3379;

    @ObfuscatedName("im.fq")
    public static class299 field3380;

    @ObfuscatedName("ie.y")
    public static int field3383;

    @ObfuscatedName("ie.v")
    public static class254[] field3384;

    @ObfuscatedName("ie.n")
    public static class247 field3392;

    @ObfuscatedName("ix.e")
    public static byte[][][] field3405;

    @ObfuscatedName("ix.fw")
    public static class298[] field3408;

    @ObfuscatedName("ix.n")
    public static class247 field3409;

    @ObfuscatedName("ix.s")
    public static boolean[] field3410;

    @ObfuscatedName("iy.v")
    public static class247 field3415;

    @ObfuscatedName("iy.n")
    public static class247 field3428;

    @ObfuscatedName("ip.n")
    public static class247 field3435;

    @ObfuscatedName("c.ot")
    public static class116 field344;

    @ObfuscatedName("ir.v")
    public static class247 field3441;

    @ObfuscatedName("ir.n")
    public static class247 field3445;

    @ObfuscatedName("ir.y")
    public static int field3448;

    @ObfuscatedName("iu.v")
    public static class247 field3454;

    @ObfuscatedName("iu.n")
    public static class247 field3456;

    @ObfuscatedName("je.n")
    public static class247 field3470;

    @ObfuscatedName("ja.b")
    public static int field3475;

    @ObfuscatedName("ja.n")
    public static class247 field3480;

    @ObfuscatedName("jq.u")
    public static int[] field3484;

    @ObfuscatedName("jd.y")
    public static class247 field3499;

    @ObfuscatedName("jd.n")
    public static class247 field3516;

    @ObfuscatedName("ji.y")
    public static class247 field3523;

    @ObfuscatedName("ji.v")
    public static class247 field3542;

    @ObfuscatedName("k.cg")
    public static class249 field355;

    @ObfuscatedName("jl.d")
    public static class247 field3575;

    @ObfuscatedName("jl.s")
    public static class247 field3576;

    @ObfuscatedName("jl.b")
    public static boolean field3577;

    @ObfuscatedName("q.k")
    public static int field358;

    @ObfuscatedName("q.cr")
    public static class160 field361;

    @ObfuscatedName("jh.n")
    public static class247 field3642;

    @ObfuscatedName("jh.v")
    public static class247 field3665;

    @ObfuscatedName("jy.n")
    public static class247 field3679;

    @ObfuscatedName("js.v")
    public static class247 field3684;

    @ObfuscatedName("js.n")
    public static class247 field3692;

    @ObfuscatedName("js.y")
    public static class247 field3700;

    @ObfuscatedName("jf.ly")
    public static class228[] field3711;

    @ObfuscatedName("jf.f")
    public static int field3712;

    @ObfuscatedName("jk.qi")
    public static long field3717;

    @ObfuscatedName("jj.f")
    public static class298[] field3728;

    @ObfuscatedName("jw.n")
    public static class177 field3742;

    @ObfuscatedName("jg.r")
    public static class298 field3745;

    @ObfuscatedName("ac.no")
    public static byte field375;

    @ObfuscatedName("ac.fl")
    public static int[][] field377;

    @ObfuscatedName("ac.pl")
    public static int field378;

    @ObfuscatedName("kk.o")
    public static int field3818;

    @ObfuscatedName("kb.ag")
    public static int field3833;

    @ObfuscatedName("kb.at")
    public static int field3835;

    @ObfuscatedName("kb.aw")
    public static int[] field3837;

    @ObfuscatedName("kd.y")
    public static int field3868;

    @ObfuscatedName("kd.v")
    public static int field3869;

    @ObfuscatedName("kd.b")
    public static int[] field3870;

    @ObfuscatedName("kd.r")
    public static int[] field3871;

    @ObfuscatedName("kd.h")
    public static int[] field3872;

    @ObfuscatedName("kd.n")
    public static int field3873;

    @ObfuscatedName("v.f")
    public static class111 field4;

    @ObfuscatedName("ag.w")
    public static class246 field406;

    @ObfuscatedName("ag.a")
    public static String[] field407;

    @ObfuscatedName("af.do")
    public static class249 field420;

    @ObfuscatedName("az.bt")
    public static class298[] field430;

    @ObfuscatedName("az.hw")
    public static class228 field439;

    @ObfuscatedName("ae.ix")
    public static int field449;

    @ObfuscatedName("ae.k")
    public static int[] field452;

    @ObfuscatedName("ae.ct")
    public static long field453;

    @ObfuscatedName("av.jq")
    public static int field455;

    @ObfuscatedName("am.aa")
    public static class296 field475;

    @ObfuscatedName("am.b")
    public static ScheduledExecutorService field476;

    @ObfuscatedName("am.e")
    public static int field478;

    @ObfuscatedName("ax.ek")
    public static class275 field484;

    @ObfuscatedName("ah.s")
    public static byte[][][] field488;

    @ObfuscatedName("ah.f")
    public static class150 field490;

    @ObfuscatedName("ah.cu")
    public static char field492;

    @ObfuscatedName("ab.es")
    public static class156 field502;

    @ObfuscatedName("ab.fi")
    public static int field506;

    @ObfuscatedName("aj.j")
    public static int[] field516;

    @ObfuscatedName("aa.b")
    public static int field524;

    @ObfuscatedName("aa.ea")
    public static class160 field526;

    @ObfuscatedName("aa.na")
    public static byte field527;

    @ObfuscatedName("ao.o")
    public static int field542;

    @ObfuscatedName("ao.be")
    public static class298[] field543;

    @ObfuscatedName("ay.ba")
    public static class298 field551;

    @ObfuscatedName("aq.dd")
    public static class249 field553;

    @ObfuscatedName("aq.lf")
    public static int field556;

    @ObfuscatedName("aq.qk")
    public static class165 field557;

    @ObfuscatedName("aq.fx")
    public static class299[] field558;

    @ObfuscatedName("ak.cb")
    public static boolean field565;

    @ObfuscatedName("ak.fm")
    public static class139 field566;

    @ObfuscatedName("as.i")
    public static String[] field571;

    @ObfuscatedName("as.cv")
    public static class249 field573;

    @ObfuscatedName("an.nq")
    public static class290 field581;

    @ObfuscatedName("an.eo")
    public static class274 field590;

    @ObfuscatedName("ar.kz")
    public static int field624;

    @ObfuscatedName("ar.oe")
    public static int field625;

    @ObfuscatedName("bq.db")
    public static class249 field628;

    @ObfuscatedName("bq.pi")
    public static int field629;

    @ObfuscatedName("bk.d")
    public static int[] field636;

    @ObfuscatedName("bk.w")
    public static int[] field640;

    @ObfuscatedName("bd.ge")
    public static int field672;

    @ObfuscatedName("bd.ag")
    public static Font field677;

    @ObfuscatedName("bd.fy")
    public static class299[] field683;

    @ObfuscatedName("bd.fd")
    public static class298[] field692;

    @ObfuscatedName("bd.n")
    public static class247 field695;

    @ObfuscatedName("bi.ca")
    public static class249 field697;

    @ObfuscatedName("bi.gn")
    public static int field702;

    @ObfuscatedName("bi.dq")
    public static class249 field719;

    @ObfuscatedName("bo.lr")
    public static int field720;

    @ObfuscatedName("bo.f")
    public static int[] field722;

    @ObfuscatedName("bo.n")
    public static class247 field724;

    @ObfuscatedName("bo.en")
    public static int field725;

    @ObfuscatedName("bo.v")
    public static class247 field726;

    @ObfuscatedName("bo.qv")
    public static int field727;

    @ObfuscatedName("bx.e")
    public static int[][] field731;

    @ObfuscatedName("bx.h")
    public static byte[][][] field732;

    @ObfuscatedName("bx.d")
    public static byte[][][] field734;

    @ObfuscatedName("bx.r")
    public static byte[][][] field735;

    @ObfuscatedName("bu.ci")
    public static class249 field746;

    @ObfuscatedName("bt.hh")
    public static class125 field753;

    @ObfuscatedName("bt.e")
    public static class298[] field758;

    @ObfuscatedName("be.dn")
    public static class249 field771;

    @ObfuscatedName("ba.g")
    public static int[] field778;

    @ObfuscatedName("ba.jc")
    public static int field781;

    @ObfuscatedName("ba.ow")
    public static int field783;

    @ObfuscatedName("bw.pm")
    public static int field787;

    @ObfuscatedName("bp.p")
    public static int[] field789;

    @ObfuscatedName("bn.gj")
    public static int field806;

    @ObfuscatedName("bn.ll")
    public static class159 field807;

    @ObfuscatedName("bl.s")
    public static int field811;

    @ObfuscatedName("bv.f")
    public static class298 field813;

    @ObfuscatedName("bv.kc")
    public static int field818;

    @ObfuscatedName("bs.fa")
    public static class299[] field820;

    @ObfuscatedName("bs.dy")
    public static int field827;

    @ObfuscatedName("bs.bu")
    public static String field830;

    @ObfuscatedName("bh.u")
    public static class221 field832;

    @ObfuscatedName("bh.at")
    public static int[] field834;

    @ObfuscatedName("br.px")
    public static int field872;

    @ObfuscatedName("client.bk")
    public static class243 field876;

    @ObfuscatedName("client.fs")
    public static byte[][] field927;

    @ObfuscatedName("fn.n(III)Z")
    public static boolean method2929(int arg0, int arg1) {
        return (arg0 >> arg1 + 1 & 0x1) != 0;
    }

    @ObfuscatedName("fi.n(J)Ljava/lang/String;")
    public static String method2908(long arg0) {
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
                var5.append(class280.field3752[(int) (var6 - arg0 * 37L)]);
            }
            return var5.reverse().toString();
        }
    }

    @ObfuscatedName("jq.v(II)I")
    public static int method4253(int arg0) {
        return arg0 >> 17 & 0x7;
    }

    @ObfuscatedName("e.v(IIIIB)V")
    public static void method33(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) class64.field755.method3416((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            class64.field755.method3417(var4, (long) arg0);
        }
        if (var4.field754.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field754.length; var7++) {
                var5[var7] = var4.field754[var7];
                var6[var7] = var4.field759[var7];
            }
            for (int var8 = var4.field754.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field754 = var5;
            var4.field759 = var6;
        }
        var4.field754[arg1] = arg2;
        var4.field759[arg1] = arg3;
    }

    @ObfuscatedName("ce.v(II)Lja;")
    public static class263 method1733(int arg0) {
        class263 var1 = (class263) class263.field3481.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3480.method3931(11, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4214(new class185(var2));
        }
        var3.method4217();
        class263.field3481.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.v(II)Liy;")
    public static class257 method4461(int arg0) {
        class257 var1 = (class257) class257.field3427.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3428.method3931(13, arg0);
        class257 var3 = new class257();
        var3.field3421 = arg0;
        if (var2 != null) {
            var3.method4117(new class185(var2));
        }
        class257.field3427.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.n(ZI)V")
    public static void method4472(boolean arg0) {
        if (field3357 == null) {
            return;
        }
        try {
            class185 var1 = new class185(4);
            var1.method3157(arg0 ? 2 : 3);
            var1.method3153(0);
            field3357.method2811(var1.field2528, 0, 4);
        } catch (IOException var5) {
            try {
                field3357.method2826();
            } catch (Exception var4) {
            }
            class250.field3363++;
            field3357 = null;
        }
    }

    @ObfuscatedName("ez.h(II)I")
    public static int method2748(int arg0) {
        class72 var1 = (class72) class97.field1426.method3382((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (class97.field1425.field2616 == var1.field2601) {
            return -1;
        } else {
            return ((class72) var1.field2601).field828;
        }
    }

    @ObfuscatedName("i.r(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method109(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!class57.field648.startsWith("win")) {
                    throw new Exception();
                } else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
                    String var3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    for (int var4 = 0; var4 < arg0.length(); var4++) {
                        if (var3.indexOf(arg0.charAt(var4)) == -1) {
                            throw new Exception();
                        }
                    }
                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
                    return true;
                } else {
                    throw new Exception();
                }
            } catch (Throwable var14) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Applet var6 = class57.field655;
                Object[] var7 = new Object[] { (new URL(class57.field655.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                class57.field655.getAppletContext().showDocument(new URL(class57.field655.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class53.method669(class57.field655, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                class57.field655.getAppletContext().showDocument(new URL(class57.field655.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("de.y(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static String method1973(Throwable arg0) throws IOException {
        String var2;
        if (arg0 instanceof class155) {
            class155 var1 = (class155) arg0;
            var2 = var1.field2137 + " | ";
            arg0 = var1.field2140;
        } else {
            var2 = "";
        }
        StringWriter var3 = new StringWriter();
        PrintWriter var4 = new PrintWriter(var3);
        arg0.printStackTrace(var4);
        var4.close();
        String var5 = var3.toString();
        BufferedReader var6 = new BufferedReader(new StringReader(var5));
        String var7 = var6.readLine();
        while (true) {
            while (true) {
                String var8 = var6.readLine();
                if (var8 == null) {
                    return var2 + "| " + var7;
                }
                int var10 = var8.indexOf(40);
                int var11 = var8.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var8.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var8 = var8.substring(0, var10);
                }
                String var15 = var8.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @ObfuscatedName("ii.m([BI)V")
    public static void method3906(byte[] arg0) {
        class185 var1 = new class185(arg0);
        var1.field2529 = arg0.length - 2;
        field3873 = var1.method3015();
        field3871 = new int[field3873];
        field3872 = new int[field3873];
        field636 = new int[field3873];
        field2100 = new int[field3873];
        field2552 = new byte[field3873][];
        var1.field2529 = arg0.length - 7 - field3873 * 8;
        field3869 = var1.method3015();
        field3868 = var1.method3015();
        int var2 = (var1.method3021() & 0xFF) + 1;
        for (int var3 = 0; var3 < field3873; var3++) {
            field3871[var3] = var1.method3015();
        }
        for (int var4 = 0; var4 < field3873; var4++) {
            field3872[var4] = var1.method3015();
        }
        for (int var5 = 0; var5 < field3873; var5++) {
            field636[var5] = var1.method3015();
        }
        for (int var6 = 0; var6 < field3873; var6++) {
            field2100[var6] = var1.method3015();
        }
        var1.field2529 = arg0.length - 7 - field3873 * 8 - (var2 - 1) * 3;
        field3870 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            field3870[var7] = var1.method3025();
            if (field3870[var7] == 0) {
                field3870[var7] = 1;
            }
        }
        var1.field2529 = 0;
        for (int var8 = 0; var8 < field3873; var8++) {
            int var9 = field636[var8];
            int var10 = field2100[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            field2552[var8] = var12;
            int var13 = var1.method3021();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3022();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3022();
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.h(Lgr;II)Z")
    public static boolean method78(class191 arg0, int arg1) {
        int var2 = arg0.method3286(2);
        if (var2 == 0) {
            if (arg0.method3286(1) != 0) {
                method78(arg0, arg1);
            }
            int var3 = arg0.method3286(13);
            int var4 = arg0.method3286(13);
            boolean var5 = arg0.method3286(1) == 1;
            if (var5) {
                class95.field1414[++class95.field1404 - 1] = arg1;
            }
            if (client.field900[arg1] != null) {
                throw new RuntimeException();
            }
            class74 var6 = client.field900[arg1] = new class74();
            var6.field843 = arg1;
            if (class95.field1405[arg1] != null) {
                var6.method1039(class95.field1405[arg1]);
            }
            var6.field1166 = class95.field1411[arg1];
            var6.field1195 = class95.field1412[arg1];
            int var7 = class95.field1407[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1152[0] = class95.field1402[arg1];
            var6.field857 = (byte) var8;
            var6.method1057((var9 << 13) + var3 - field2458, (var10 << 13) + var4 - field1288);
            var6.field859 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3286(2);
            int var12 = class95.field1407[arg1];
            class95.field1407[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3286(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = class95.field1407[arg1];
            int var17 = (var16 >> 28) + var14 & 0x3;
            int var18 = var16 >> 14 & 0xFF;
            int var19 = var16 & 0xFF;
            if (var15 == 0) {
                var18--;
                var19--;
            }
            if (var15 == 1) {
                var19--;
            }
            if (var15 == 2) {
                var18++;
                var19--;
            }
            if (var15 == 3) {
                var18--;
            }
            if (var15 == 4) {
                var18++;
            }
            if (var15 == 5) {
                var18--;
                var19++;
            }
            if (var15 == 6) {
                var19++;
            }
            if (var15 == 7) {
                var18++;
                var19++;
            }
            class95.field1407[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3286(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = class95.field1407[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            class95.field1407[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("ck.s(ILcv;ZB)I")
    public static int method1506(int arg0, class98 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method2725(class83.field1263[--field1269]);
        } else {
            var3 = arg2 ? field1268 : field1217;
        }
        if (arg0 == 1300) {
            int var4 = class83.field1263[--field1269] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3836(var4, class83.field1266[--field1679]);
                return 1;
            } else {
                field1679--;
                return 1;
            }
        } else if (arg0 == 1301) {
            field1269 -= 2;
            int var5 = class83.field1263[field1269];
            int var6 = class83.field1263[field1269 + 1];
            var3.field2838 = class228.method19(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2777 = class83.field1263[--field1269] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2839 = class83.field1263[--field1269];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2822 = class83.field1263[--field1269];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2854 = class83.field1266[--field1679];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2844 = class83.field1266[--field1679];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2820 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cj.gz(I)V")
    public static final void method1448() {
        for (int var0 = 0; var0 < client.field1049; var0++) {
            int var1 = client.field913[var0];
            class86 var2 = client.field1110[var1];
            if (var2 != null) {
                client.method3668(var2, var2.field1298.field3668);
            }
        }
    }

    @ObfuscatedName("w.gs(Ljava/lang/String;ZI)V")
    public static final void method67(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = field1214.method4593(arg0, 250);
        int var6 = field1214.method4627(arg0, 250) * 13;
        class295.method4752(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class295.method4769(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        field1214.method4550(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        client.method161(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            field475.method717(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < client.field1059; var11++) {
            if (client.field1066[var11] + client.field1064[var11] > var7 && client.field1064[var11] < var7 + var9 && client.field1067[var11] + client.field1065[var11] > var8 && client.field1065[var11] < var8 + var10) {
                client.field1062[var11] = true;
            }
        }
    }

    @ObfuscatedName("at.hs(Lgr;S)V")
    public static final void method201(class191 arg0) {
        for (int var1 = 0; var1 < client.field914; var1++) {
            int var2 = client.field915[var1];
            class86 var3 = client.field1110[var2];
            int var4 = arg0.method3021();
            if ((var4 & 0x1) != 0) {
                int var5 = arg0.method3015();
                int var6 = arg0.method3015();
                int var7 = var3.field1155 - (var5 - field2458 - field2458) * 64;
                int var8 = var3.field1151 - (var6 - field1288 - field1288) * 64;
                if (var7 != 0 || var8 != 0) {
                    var3.field1178 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var9 = arg0.method3060();
                if (var9 > 0) {
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = -1;
                        int var14 = arg0.method3232();
                        if (var14 == 32767) {
                            var14 = arg0.method3232();
                            var12 = arg0.method3232();
                            var11 = arg0.method3232();
                            var13 = arg0.method3232();
                        } else if (var14 == 32766) {
                            var14 = -1;
                        } else {
                            var12 = arg0.method3232();
                        }
                        int var15 = arg0.method3232();
                        var3.method1434(var14, var12, var11, var13, client.field883, var15);
                    }
                }
                int var16 = arg0.method3049();
                if (var16 > 0) {
                    for (int var17 = 0; var17 < var16; var17++) {
                        int var18 = arg0.method3232();
                        int var19 = arg0.method3232();
                        if (var19 == 32767) {
                            var3.method1433(var18);
                        } else {
                            int var20 = arg0.method3232();
                            int var21 = arg0.method3121();
                            int var22 = var19 > 0 ? arg0.method3121() : var21;
                            var3.method1432(var18, client.field883, var19, var20, var21, var22);
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1195 = arg0.method3059();
                if (var3.field1195 == 65535) {
                    var3.field1195 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1187 = arg0.method3023();
                int var23 = arg0.method3069();
                var3.field1191 = var23 >> 16;
                var3.field1190 = (var23 & 0xFFFF) + client.field883;
                var3.field1188 = 0;
                var3.field1189 = 0;
                if (var3.field1190 > client.field883) {
                    var3.field1188 = -1;
                }
                if (var3.field1187 == 65535) {
                    var3.field1187 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var24 = arg0.method3059();
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = arg0.method3121();
                if (var3.field1182 == var24 && var24 != -1) {
                    int var26 = class272.method579(var24).field3693;
                    if (var26 == 1) {
                        var3.field1206 = 0;
                        var3.field1160 = 0;
                        var3.field1185 = var25;
                        var3.field1186 = 0;
                    }
                    if (var26 == 2) {
                        var3.field1186 = 0;
                    }
                } else if (var24 == -1 || var3.field1182 == -1 || class272.method579(var24).field3695 >= class272.method579(var3.field1182).field3695) {
                    var3.field1182 = var24;
                    var3.field1206 = 0;
                    var3.field1160 = 0;
                    var3.field1185 = var25;
                    var3.field1186 = 0;
                    var3.field1209 = var3.field1204;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1298 = class270.method564(arg0.method3059());
                var3.field1154 = var3.field1298.field3668;
                var3.field1203 = var3.field1298.field3663;
                var3.field1169 = var3.field1298.field3660;
                var3.field1159 = var3.field1298.field3647;
                var3.field1176 = var3.field1298.field3646;
                var3.field1161 = var3.field1298.field3658;
                var3.field1150 = var3.field1298.field3643;
                var3.field1157 = var3.field1298.field3644;
                var3.field1174 = var3.field1298.field3645;
            }
            if ((var4 & 0x8) != 0) {
                var3.field1163 = arg0.method3030();
                var3.field1170 = 100;
            }
        }
    }

    @ObfuscatedName("cz.jo(Ljava/lang/String;ZI)Z")
    public static boolean method1652(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class279.method311(arg0, field295);
        for (int var3 = 0; var3 < client.field1121; var3++) {
            if (var2.equalsIgnoreCase(class279.method311(client.field1123[var3].field782, field295)) && (!arg1 || client.field1123[var3].field775 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class279.method311(field289.field860, field295))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bh.kk(Ljava/lang/String;I)V")
    public static final void method1026(String arg0) {
        if (field1559 != null) {
            class175 var1 = class175.method3892(class172.field2335, client.field916.field1463);
            var1.field2451.method3157(class185.method166(arg0));
            var1.field2451.method3012(arg0);
            client.field916.method1747(var1);
        }
    }
}
