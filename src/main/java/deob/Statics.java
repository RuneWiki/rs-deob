package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("bm.s")
    public static byte[][][] field1002;

    @ObfuscatedName("bm.m")
    public static int[][] field1003;

    @ObfuscatedName("bm.w")
    public static byte[][][] field1005;

    @ObfuscatedName("bm.t")
    public static int[] field1009;

    @ObfuscatedName("a.uc")
    public static Iterator field101;

    @ObfuscatedName("bm.lr")
    public static int field1013;

    @ObfuscatedName("bq.p")
    public static int field1015;

    @ObfuscatedName("bs.g")
    public static String field1023;

    @ObfuscatedName("a.q")
    public static boolean field103;

    @ObfuscatedName("cv.m")
    public static int[] field1041;

    @ObfuscatedName("ct.cn")
    public static class458[] field1064;

    @ObfuscatedName("cj.eu")
    public static class315 field1082;

    @ObfuscatedName("cj.rp")
    public static class141 field1083;

    @ObfuscatedName("cj.g")
    public static boolean[] field1084;

    @ObfuscatedName("e.et")
    public static class315 field110;

    @ObfuscatedName("cl.uv")
    public static class90 field1108;

    @ObfuscatedName("g.af")
    public static class455 field114;

    @ObfuscatedName("ce.gq")
    public static String field1165;

    @ObfuscatedName("g.d")
    public static class445 field117;

    @ObfuscatedName("y.ty")
    public static int field121;

    @ObfuscatedName("cr.ew")
    public static class315 field1253;

    @ObfuscatedName("co.fp")
    public static int field1256;

    @ObfuscatedName("ca.ay")
    public static boolean field1268;

    @ObfuscatedName("cx.ts")
    public static int field1271;

    @ObfuscatedName("cq.bp")
    public static String field1280;

    @ObfuscatedName("ck.bj")
    public static class425 field1304;

    @ObfuscatedName("ci.fi")
    public static int field1321;

    @ObfuscatedName("ci.iw")
    public static class458[] field1322;

    @ObfuscatedName("cb.vb")
    public static class328 field1324;

    @ObfuscatedName("cd.ha")
    public static class102 field1337;

    @ObfuscatedName("ch.ss")
    public static int field1356;

    @ObfuscatedName("cc.ej")
    public static class315 field1357;

    @ObfuscatedName("cm.l")
    public static byte[][][] field1360;

    @ObfuscatedName("cm.nk")
    public static int field1366;

    @ObfuscatedName("db.vf")
    public static int field1372;

    @ObfuscatedName("du.u")
    public static class457 field1380;

    @ObfuscatedName("dr.cc")
    public static boolean field1388;

    @ObfuscatedName("dr.s")
    public static int[] field1389;

    @ObfuscatedName("dq.er")
    public static class315 field1390;

    @ObfuscatedName("dq.ez")
    public static class315 field1393;

    @ObfuscatedName("dq.bd")
    public static int field1394;

    @ObfuscatedName("dl.fk")
    public static int field1395;

    @ObfuscatedName("dl.x")
    public static int field1397;

    @ObfuscatedName("do.tv")
    public static int field1399;

    @ObfuscatedName("do.cj")
    public static class457[] field1405;

    @ObfuscatedName("dx.mj")
    public static int field1428;

    @ObfuscatedName("dj.d")
    public static class457 field1429;

    @ObfuscatedName("dv.tq")
    public static int field1480;

    @ObfuscatedName("dv.es")
    public static class315 field1483;

    @ObfuscatedName("dt.jx")
    public static int field1506;

    @ObfuscatedName("dy.r")
    public static int field1514;

    @ObfuscatedName("z.ei")
    public static class315 field152;

    @ObfuscatedName("dy.tf")
    public static int field1521;

    @ObfuscatedName("dc.y")
    public static String field1535;

    @ObfuscatedName("dc.hh")
    public static int[] field1536;

    @ObfuscatedName("z.ks")
    public static class296 field154;

    @ObfuscatedName("dh.aq")
    public static FontMetrics field1544;

    @ObfuscatedName("z.n")
    public static class457[] field155;

    @ObfuscatedName("dd.pw")
    public static class430 field1555;

    @ObfuscatedName("de.hd")
    public static int field1560;

    @ObfuscatedName("de.ak")
    public static Image field1562;

    @ObfuscatedName("ee.ls")
    public static class210 field1564;

    @ObfuscatedName("ee.k")
    public static int field1568;

    @ObfuscatedName("ei.m")
    public static short[] field1590;

    @ObfuscatedName("es.iy")
    public static class458[] field1603;

    @ObfuscatedName("es.t")
    public static class316 field1606;

    @ObfuscatedName("o.iz")
    public static int field161;

    @ObfuscatedName("ep.qq")
    public static class160 field1612;

    @ObfuscatedName("ez.a")
    public static int[] field1616;

    @ObfuscatedName("eg.n")
    public static class276 field1623;

    @ObfuscatedName("ed.nj")
    public static int field1651;

    @ObfuscatedName("eu.rd")
    public static boolean field1662;

    @ObfuscatedName("eu.ro")
    public static class462 field1663;

    @ObfuscatedName("eu.co")
    public static int field1666;

    @ObfuscatedName("ao.bm")
    public static String field167;

    @ObfuscatedName("ej.rv")
    public static class369 field1679;

    @ObfuscatedName("em.hz")
    public static int field1685;

    @ObfuscatedName("em.nq")
    public static class67 field1689;

    @ObfuscatedName("ao.is")
    public static class458[] field169;

    @ObfuscatedName("ef.v")
    public static int field1690;

    @ObfuscatedName("ef.q")
    public static class457 field1694;

    @ObfuscatedName("ef.jo")
    public static int field1695;

    @ObfuscatedName("s.gp")
    public static long field17;

    @ObfuscatedName("et.ng")
    public static class296 field1700;

    @ObfuscatedName("eq.qw")
    public static class430 field1716;

    @ObfuscatedName("ar.gd")
    public static SecureRandom field172;

    @ObfuscatedName("ec.d")
    public static int field1720;

    @ObfuscatedName("ew.n")
    public static byte[][][] field1724;

    @ObfuscatedName("ew.tj")
    public static int field1725;

    @ObfuscatedName("ew.q")
    public static int field1726;

    @ObfuscatedName("ev.bi")
    public static class306 field1730;

    @ObfuscatedName("ar.h")
    public static class43 field175;

    @ObfuscatedName("fc.hw")
    public static class351 field1752;

    @ObfuscatedName("fr.p")
    public static String field1753;

    @ObfuscatedName("fr.fj")
    public static int field1754;

    @ObfuscatedName("fr.jf")
    public static int field1759;

    @ObfuscatedName("fr.c")
    public static String field1760;

    @ObfuscatedName("fg.u")
    public static class428[] field1761;

    @ObfuscatedName("fg.n")
    public static File field1762;

    @ObfuscatedName("fg.w")
    public static int field1763;

    @ObfuscatedName("fg.k")
    public static File field1766;

    @ObfuscatedName("fg.b")
    public static String[] field1769;

    @ObfuscatedName("ar.gj")
    public static int[] field177;

    @ObfuscatedName("fg.a")
    public static String[] field1771;

    @ObfuscatedName("fg.i")
    public static String field1772;

    @ObfuscatedName("fg.f")
    public static class317 field1773;

    @ObfuscatedName("fm.p")
    public static File field1775;

    @ObfuscatedName("fm.m")
    public static byte[][] field1776;

    @ObfuscatedName("fl.un")
    public static List field1785;

    @ObfuscatedName("fl.z")
    public static class317 field1786;

    @ObfuscatedName("fp.jl")
    public static int field1799;

    @ObfuscatedName("s.hk")
    public static int field18;

    @ObfuscatedName("fp.eb")
    public static class315 field1800;

    @ObfuscatedName("fj.j")
    public static class457 field1809;

    @ObfuscatedName("ar.hv")
    public static class351 field181;

    @ObfuscatedName("fj.e")
    public static class445 field1811;

    @ObfuscatedName("ff.z")
    public static int field1825;

    @ObfuscatedName("ar.qf")
    public static class394 field183;

    @ObfuscatedName("fx.gg")
    public static class166 field1831;

    @ObfuscatedName("fq.c")
    public static class317 field1837;

    @ObfuscatedName("fo.p")
    public static int field1842;

    @ObfuscatedName("fo.c")
    public static class317 field1844;

    @ObfuscatedName("fh.f")
    public static int field1848;

    @ObfuscatedName("fh.p")
    public static class172[] field1853;

    @ObfuscatedName("fh.c")
    public static class317 field1863;

    @ObfuscatedName("fb.c")
    public static class317 field1870;

    @ObfuscatedName("fb.x")
    public static int field1871;

    @ObfuscatedName("fb.ag")
    public static GarbageCollectorMXBean field1874;

    @ObfuscatedName("fb.a")
    public static int field1876;

    @ObfuscatedName("fa.f")
    public static int field1878;

    @ObfuscatedName("fa.c")
    public static class317 field1882;

    @ObfuscatedName("fd.p")
    public static class317 field1897;

    @ObfuscatedName("s.ia")
    public static class458[] field19;

    @ObfuscatedName("fd.c")
    public static class317 field1901;

    @ObfuscatedName("fd.de")
    public static class166 field1904;

    @ObfuscatedName("fe.c")
    public static class317 field1917;

    @ObfuscatedName("fe.uz")
    public static class319 field1919;

    @ObfuscatedName("fy.ek")
    public static class315 field1927;

    @ObfuscatedName("fs.p")
    public static class317 field1930;

    @ObfuscatedName("fs.c")
    public static class317 field1949;

    @ObfuscatedName("ai.d")
    public static int field196;

    @ObfuscatedName("ft.in")
    public static class458[] field1990;

    @ObfuscatedName("ft.c")
    public static class317 field2005;

    @ObfuscatedName("fz.c")
    public static class317 field2012;

    @ObfuscatedName("gq.cl")
    public static class457[] field2018;

    @ObfuscatedName("gv.j")
    public static int field2020;

    @ObfuscatedName("gv.c")
    public static class317 field2026;

    @ObfuscatedName("gr.c")
    public static class317 field2035;

    @ObfuscatedName("gl.c")
    public static class317 field2038;

    @ObfuscatedName("gl.q")
    public static int field2042;

    @ObfuscatedName("gx.p")
    public static class317 field2050;

    @ObfuscatedName("gx.c")
    public static class317 field2062;

    @ObfuscatedName("gx.hl")
    public static int[] field2066;

    @ObfuscatedName("gz.p")
    public static class317 field2070;

    @ObfuscatedName("gz.f")
    public static class317 field2071;

    @ObfuscatedName("gk.s")
    public static class317 field2126;

    @ObfuscatedName("gk.w")
    public static class317 field2163;

    @ObfuscatedName("gk.ip")
    public static int field2164;

    @ObfuscatedName("gk.m")
    public static int field2174;

    @ObfuscatedName("gw.c")
    public static class317 field2184;

    @ObfuscatedName("ai.vi")
    public static int field219;

    @ObfuscatedName("gw.hn")
    public static class418 field2191;

    @ObfuscatedName("gd.n")
    public static class317 field2197;

    @ObfuscatedName("gd.p")
    public static class317 field2215;

    @ObfuscatedName("gb.gt")
    public static class379 field2238;

    @ObfuscatedName("gy.u")
    public static int[] field2333;

    @ObfuscatedName("gf.pq")
    public static int field2345;

    @ObfuscatedName("go.l")
    public static int field2374;

    @ObfuscatedName("go.h")
    public static int field2383;

    @ObfuscatedName("go.t")
    public static int field2384;

    @ObfuscatedName("go.u")
    public static int field2385;

    @ObfuscatedName("go.d")
    public static int field2386;

    @ObfuscatedName("go.b")
    public static int field2387;

    @ObfuscatedName("go.a")
    public static int field2388;

    @ObfuscatedName("go.e")
    public static int field2390;

    @ObfuscatedName("go.i")
    public static class218 field2393;

    @ObfuscatedName("ge.hs")
    public static int[][] field2401;

    @ObfuscatedName("an.ph")
    public static int field241;

    @ObfuscatedName("gp.bd")
    public static int field2416;

    @ObfuscatedName("gp.bh")
    public static int field2419;

    @ObfuscatedName("gp.a")
    public static int field2420;

    @ObfuscatedName("gp.b")
    public static int field2427;

    @ObfuscatedName("gp.ao")
    public static int field2428;

    @ObfuscatedName("an.y")
    public static class317 field243;

    @ObfuscatedName("gp.e")
    public static int field2430;

    @ObfuscatedName("gp.g")
    public static int field2431;

    @ObfuscatedName("gp.l")
    public static int field2432;

    @ObfuscatedName("gp.i")
    public static int field2433;

    @ObfuscatedName("gp.r")
    public static int field2434;

    @ObfuscatedName("gp.z")
    public static int field2435;

    @ObfuscatedName("gp.o")
    public static int field2436;

    @ObfuscatedName("gp.as")
    public static int field2437;

    @ObfuscatedName("gp.bl")
    public static int field2440;

    @ObfuscatedName("gp.y")
    public static int field2442;

    @ObfuscatedName("gp.ac")
    public static int field2447;

    @ObfuscatedName("gp.ar")
    public static int field2456;

    @ObfuscatedName("aa.ho")
    public static byte[][] field246;

    @ObfuscatedName("gp.bo")
    public static boolean[][] field2471;

    @ObfuscatedName("gp.br")
    public static int field2472;

    @ObfuscatedName("gp.bp")
    public static int field2473;

    @ObfuscatedName("gp.bk")
    public static int field2476;

    @ObfuscatedName("gg.dt")
    public static boolean field2478;

    @ObfuscatedName("gh.ed")
    public static class315 field2484;

    @ObfuscatedName("gt.x")
    public static class104 field2485;

    @ObfuscatedName("he.x")
    public static int[] field2514;

    @ObfuscatedName("he.u")
    public static class296 field2515;

    @ObfuscatedName("he.m")
    public static class458 field2516;

    @ObfuscatedName("ha.bl")
    public static int field2550;

    @ObfuscatedName("ak.bf")
    public static int field257;

    @ObfuscatedName("ak.ct")
    public static class457[] field258;

    @ObfuscatedName("ha.bd")
    public static int field2603;

    @ObfuscatedName("ha.bk")
    public static int field2618;

    @ObfuscatedName("hn.k")
    public static int field2620;

    @ObfuscatedName("hn.j")
    public static int field2626;

    @ObfuscatedName("hn.m")
    public static int field2631;

    @ObfuscatedName("hw.b")
    public static class89 field2638;

    @ObfuscatedName("hj.sw")
    public static int field2639;

    @ObfuscatedName("hj.ll")
    public static class296 field2641;

    @ObfuscatedName("hj.ah")
    public static String field2649;

    @ObfuscatedName("hj.uh")
    public static long field2650;

    @ObfuscatedName("hc.pc")
    public static class296[] field2664;

    @ObfuscatedName("hd.ix")
    public static int field2692;

    @ObfuscatedName("hz.fn")
    public static String field2701;

    @ObfuscatedName("hz.ds")
    public static class379 field2703;

    @ObfuscatedName("hf.i")
    public static class317 field2729;

    @ObfuscatedName("ht.ib")
    public static class457[] field2744;

    @ObfuscatedName("az.x")
    public static int[] field275;

    @ObfuscatedName("hx.fh")
    public static String field2774;

    @ObfuscatedName("hg.hr")
    public static int field2784;

    @ObfuscatedName("hh.cr")
    public static char field2795;

    @ObfuscatedName("hl.d")
    public static class141 field2799;

    @ObfuscatedName("az.v")
    public static boolean[] field282;

    @ObfuscatedName("ho.bc")
    public static class305 field2826;

    @ObfuscatedName("ho.dy")
    public static boolean field2827;

    @ObfuscatedName("az.j")
    public static int[] field285;

    @ObfuscatedName("ie.h")
    public static class457 field2854;

    @ObfuscatedName("ik.h")
    public static class48 field2857;

    @ObfuscatedName("ip.ce")
    public static class457 field2863;

    @ObfuscatedName("ip.j")
    public static short[] field2866;

    @ObfuscatedName("ii.s")
    public static int field2871;

    @ObfuscatedName("ii.ba")
    public static int field2875;

    @ObfuscatedName("ij.sd")
    public static class40 field2878;

    @ObfuscatedName("iq.br")
    public static String field2880;

    @ObfuscatedName("ib.h")
    public static boolean field2887;

    @ObfuscatedName("ia.q")
    public static int field2894;

    @ObfuscatedName("ad.m")
    public static int field290;

    @ObfuscatedName("id.pe")
    public static int field2929;

    @ObfuscatedName("ad.x")
    public static class458 field294;

    @ObfuscatedName("ad.w")
    public static boolean field298;

    @ObfuscatedName("ad.k")
    public static int field308;

    @ObfuscatedName("ad.ev")
    public static class315 field309;

    @ObfuscatedName("js.du")
    public static class82 field3189;

    @ObfuscatedName("jt.hg")
    public static int[] field3195;

    @ObfuscatedName("jt.at")
    public static class386 field3196;

    @ObfuscatedName("jt.m")
    public static int field3197;

    @ObfuscatedName("jt.hb")
    public static byte[][] field3198;

    @ObfuscatedName("x.ff")
    public static int field32;

    @ObfuscatedName("ja.c")
    public static long field3202;

    @ObfuscatedName("jy.bo")
    public static class332 field3203;

    @ObfuscatedName("jy.eh")
    public static class385 field3204;

    @ObfuscatedName("jc.by")
    public static int field3224;

    @ObfuscatedName("jg.w")
    public static class317 field3225;

    @ObfuscatedName("jg.p")
    public static class317 field3226;

    @ObfuscatedName("jg.f")
    public static class317 field3227;

    @ObfuscatedName("jg.v")
    public static class280 field3229;

    @ObfuscatedName("jg.c")
    public static class317 field3230;

    @ObfuscatedName("jg.s")
    public static int field3231;

    @ObfuscatedName("aj.t")
    public static class457 field325;

    @ObfuscatedName("aj.tk")
    public static int field328;

    @ObfuscatedName("jh.re")
    public static class150 field3287;

    @ObfuscatedName("jh.v")
    public static short[][] field3289;

    @ObfuscatedName("ax.q")
    public static byte[][][] field329;

    @ObfuscatedName("jb.te")
    public static int field3302;

    @ObfuscatedName("jb.mg")
    public static int field3317;

    @ObfuscatedName("jb.ig")
    public static class205 field3318;

    @ObfuscatedName("jn.ec")
    public static class315 field3319;

    @ObfuscatedName("jk.c")
    public static class283 field3324;

    @ObfuscatedName("jk.up")
    public static short[] field3325;

    @ObfuscatedName("jk.en")
    public static class315 field3326;

    @ObfuscatedName("je.e")
    public static class296[][] field3331;

    @ObfuscatedName("je.s")
    public static class457 field3332;

    @ObfuscatedName("kx.n")
    public static int field3338;

    @ObfuscatedName("kb.ub")
    public static class62 field3345;

    @ObfuscatedName("kd.k")
    public static byte[][][] field3375;

    @ObfuscatedName("kw.r")
    public static class317 field3386;

    @ObfuscatedName("km.ic")
    public static class458[] field3551;

    @ObfuscatedName("km.h")
    public static class351 field3552;

    @ObfuscatedName("ka.ep")
    public static class315 field3615;

    @ObfuscatedName("at.x")
    public static int field374;

    @ObfuscatedName("at.ac")
    public static float[] field381;

    @ObfuscatedName("at.q")
    public static int field382;

    @ObfuscatedName("at.m")
    public static int field383;

    @ObfuscatedName("at.j")
    public static int field384;

    @ObfuscatedName("at.ar")
    public static int[] field385;

    @ObfuscatedName("at.h")
    public static class39[] field386;

    @ObfuscatedName("at.t")
    public static class44[] field387;

    @ObfuscatedName("at.u")
    public static class47[] field388;

    @ObfuscatedName("at.d")
    public static boolean[] field389;

    @ObfuscatedName("at.b")
    public static int[] field390;

    @ObfuscatedName("at.s")
    public static byte[] field393;

    @ObfuscatedName("at.aq")
    public static int[] field395;

    @ObfuscatedName("at.i")
    public static float[] field396;

    @ObfuscatedName("at.r")
    public static float[] field397;

    @ObfuscatedName("ks.to")
    public static int field3979;

    @ObfuscatedName("at.o")
    public static float[] field399;

    @ObfuscatedName("at.as")
    public static float[] field400;

    @ObfuscatedName("at.v")
    public static class49[] field401;

    @ObfuscatedName("ll.tp")
    public static int field4011;

    @ObfuscatedName("ll.k")
    public static Thread field4015;

    @ObfuscatedName("ll.b")
    public static int[] field4016;

    @ObfuscatedName("at.ao")
    public static float[] field402;

    @ObfuscatedName("at.z")
    public static float[] field403;

    @ObfuscatedName("lh.f")
    public static long field4059;

    @ObfuscatedName("lh.c")
    public static class379 field4075;

    @ObfuscatedName("lg.mu")
    public static int field4084;

    @ObfuscatedName("bg.x")
    public static class42 field410;

    @ObfuscatedName("la.nr")
    public static class296 field4106;

    @ObfuscatedName("lm.sc")
    public static class53 field4120;

    @ObfuscatedName("le.h")
    public static int field4129;

    @ObfuscatedName("lj.jh")
    public static int field4146;

    @ObfuscatedName("lu.i")
    public static int field4157;

    @ObfuscatedName("mz.q")
    public static ScheduledExecutorService field4185;

    @ObfuscatedName("ma.ad")
    public static String field4195;

    @ObfuscatedName("ma.p")
    public static long field4198;

    @ObfuscatedName("x.ul")
    public static class414 field42;

    @ObfuscatedName("mp.bn")
    public static int field4202;

    @ObfuscatedName("mp.w")
    public static int field4206;

    @ObfuscatedName("bg.vj")
    public static class417 field422;

    @ObfuscatedName("mf.x")
    public static class457[] field4227;

    @ObfuscatedName("mb.x")
    public static short[][] field4280;

    @ObfuscatedName("bw.q")
    public static float field431;

    @ObfuscatedName("bw.m")
    public static int field432;

    @ObfuscatedName("nu.al")
    public static client field4326;

    @ObfuscatedName("nc.ln")
    public static class296 field4353;

    @ObfuscatedName("nx.a")
    public static int field4355;

    @ObfuscatedName("nq.em")
    public static class315 field4356;

    @ObfuscatedName("nt.j")
    public static boolean field4372;

    @ObfuscatedName("nm.mm")
    public static int field4388;

    @ObfuscatedName("nk.k")
    public static int field4423;

    @ObfuscatedName("ny.b")
    public static class150 field4427;

    @ObfuscatedName("nn.p")
    public static int field4431;

    @ObfuscatedName("nn.f")
    public static int field4435;

    @ObfuscatedName("oi.ik")
    public static int field4457;

    @ObfuscatedName("oo.f")
    public static int field4478;

    @ObfuscatedName("oo.tm")
    public static int field4480;

    @ObfuscatedName("j.cw")
    public static class457 field46;

    @ObfuscatedName("pc.j")
    public static int[] field4623;

    @ObfuscatedName("bi.fx")
    public static int field465;

    @ObfuscatedName("pn.pp")
    public static class99 field4652;

    @ObfuscatedName("pn.v")
    public static class457[] field4654;

    @ObfuscatedName("pk.fo")
    public static String field4663;

    @ObfuscatedName("pa.p")
    public static class317 field4684;

    @ObfuscatedName("ps.g")
    public static class249 field4696;

    @ObfuscatedName("ps.ex")
    public static class315 field4699;

    @ObfuscatedName("ps.h")
    public static int[] field4703;

    @ObfuscatedName("pg.v")
    public static int[] field4705;

    @ObfuscatedName("pt.c")
    public static class317 field4709;

    @ObfuscatedName("pl.c")
    public static class317 field4719;

    @ObfuscatedName("qx.z")
    public static int[] field4762;

    @ObfuscatedName("qk.ao")
    public static int field4800;

    @ObfuscatedName("qk.ar")
    public static int field4801;

    @ObfuscatedName("qk.ac")
    public static int[] field4804;

    @ObfuscatedName("by.nm")
    public static int field481;

    @ObfuscatedName("qt.fq")
    public static int field4810;

    @ObfuscatedName("by.w")
    public static int[] field482;

    @ObfuscatedName("by.jm")
    public static int field483;

    @ObfuscatedName("qe.c")
    public static int field4836;

    @ObfuscatedName("qe.n")
    public static int[] field4837;

    @ObfuscatedName("qe.k")
    public static int[] field4838;

    @ObfuscatedName("qe.q")
    public static int[] field4839;

    @ObfuscatedName("qo.f")
    public static class317 field4863;

    @ObfuscatedName("rr.p")
    public static String field4867;

    @ObfuscatedName("rr.f")
    public static int field4868;

    @ObfuscatedName("rr.c")
    public static Applet field4870;

    @ObfuscatedName("bz.w")
    public static int field488;

    @ObfuscatedName("j.jz")
    public static int field55;

    @ObfuscatedName("v.c")
    public static class158 field58;

    @ObfuscatedName("v.p")
    public static class317 field59;

    @ObfuscatedName("p.hj")
    public static class351 field6;

    @ObfuscatedName("v.sf")
    public static class458 field61;

    @ObfuscatedName("t.h")
    public static class168 field72;

    @ObfuscatedName("client.sm")
    public static class40 field747;

    @ObfuscatedName("t.cg")
    public static class457 field76;

    @ObfuscatedName("u.eg")
    public static class315 field77;

    @ObfuscatedName("client.tg")
    public static int field790;

    @ObfuscatedName("bo.k")
    public static class61[] field795;

    @ObfuscatedName("u.ij")
    public static class458 field81;

    @ObfuscatedName("bp.tu")
    public static int field833;

    @ObfuscatedName("bd.n")
    public static int[] field836;

    @ObfuscatedName("bd.m")
    public static int field837;

    @ObfuscatedName("bd.k")
    public static String[] field840;

    @ObfuscatedName("u.ef")
    public static class315 field85;

    @ObfuscatedName("bl.iq")
    public static class458 field859;

    @ObfuscatedName("d.p")
    public static class16 field87;

    @ObfuscatedName("bk.ih")
    public static class457[] field870;

    @ObfuscatedName("bh.t")
    public static class296 field883;

    @ObfuscatedName("bx.eq")
    public static class315 field887;

    @ObfuscatedName("bx.ar")
    public static Font field888;

    @ObfuscatedName("b.su")
    public static class36 field89;

    @ObfuscatedName("bx.lq")
    public static class85 field890;

    @ObfuscatedName("be.p")
    public static boolean field893;

    @ObfuscatedName("be.k")
    public static class457 field895;

    @ObfuscatedName("be.w")
    public static class457 field896;

    @ObfuscatedName("bf.eo")
    public static long field950;

    @ObfuscatedName("bf.al")
    public static class386 field958;

    @ObfuscatedName("ba.jw")
    public static int field963;

    @ObfuscatedName("ba.rw")
    public static boolean field965;

    @ObfuscatedName("bn.ey")
    public static class315 field990;

    @ObfuscatedName("bn.iv")
    public static class457[] field991;

    @ObfuscatedName("bn.uo")
    public static class383 field993;

    @ObfuscatedName("bn.u")
    public static int[][][] field997;

    @ObfuscatedName("ac.c(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
    public static Object method398(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("hh.p(II)Lpt;")
    public static class438 method4600(int arg0) {
        class438 var1 = (class438) class438.field4706.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field4709.method5499(39, arg0);
        class438 var3 = new class438();
        if (var2 != null) {
            var3.method7081(new class445(var2));
        }
        var3.method7082();
        class438.field4706.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("do.c(II)F")
    public static float method2668(int arg0) {
        int var1 = arg0 & 0x3FFF;
        return (float) ((double) ((float) var1 / 16384.0F) * 6.283185307179586D);
    }

    @ObfuscatedName("dt.p(Ljf;Lqv;I)Ljm;")
    public static class266 method2786(class264 arg0, class461 arg1) {
        class266 var2 = class266.method768();
        var2.field3070 = arg0;
        var2.field3062 = arg0.field3017;
        if (var2.field3062 == -1) {
            var2.field3064 = new class444(260);
        } else if (var2.field3062 == -2) {
            var2.field3064 = new class444(10000);
        } else if (var2.field3062 <= 18) {
            var2.field3064 = new class444(20);
        } else if (var2.field3062 <= 98) {
            var2.field3064 = new class444(100);
        } else {
            var2.field3064 = new class444(260);
        }
        var2.field3064.method7139(arg1);
        var2.field3064.method7140(var2.field3070.field2983);
        var2.field3065 = 0;
        return var2;
    }

    @ObfuscatedName("e.c(IILgb;Lgj;I)Z")
    public static final boolean method281(int arg0, int arg1, class193 arg2, class192 arg3) {
        int var4 = arg0;
        int var5 = arg1;
        byte var6 = 64;
        byte var7 = 64;
        int var8 = arg0 - var6;
        int var9 = arg1 - var7;
        class195.field2255[var6][var7] = 99;
        class195.field2252[var6][var7] = 0;
        byte var10 = 0;
        int var11 = 0;
        class195.field2254[var10] = arg0;
        byte var10001 = var10;
        int var18 = var10 + 1;
        class195.field2257[var10001] = arg1;
        int[][] var12 = arg3.field2235;
        while (var18 != var11) {
            var4 = class195.field2254[var11];
            var5 = class195.field2257[var11];
            var11 = var11 + 1 & 0xFFF;
            int var13 = var4 - var8;
            int var14 = var5 - var9;
            int var15 = var4 - arg3.field2230;
            int var16 = var5 - arg3.field2232;
            if (arg2.method1100(1, var4, var5, arg3)) {
                field4423 = var4;
                field4206 = var5;
                return true;
            }
            int var17 = class195.field2252[var13][var14] + 1;
            if (var13 > 0 && class195.field2255[var13 - 1][var14] == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0) {
                class195.field2254[var18] = var4 - 1;
                class195.field2257[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                class195.field2255[var13 - 1][var14] = 2;
                class195.field2252[var13 - 1][var14] = var17;
            }
            if (var13 < 127 && class195.field2255[var13 + 1][var14] == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0) {
                class195.field2254[var18] = var4 + 1;
                class195.field2257[var18] = var5;
                var18 = var18 + 1 & 0xFFF;
                class195.field2255[var13 + 1][var14] = 8;
                class195.field2252[var13 + 1][var14] = var17;
            }
            if (var14 > 0 && class195.field2255[var13][var14 - 1] == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                class195.field2254[var18] = var4;
                class195.field2257[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                class195.field2255[var13][var14 - 1] = 1;
                class195.field2252[var13][var14 - 1] = var17;
            }
            if (var14 < 127 && class195.field2255[var13][var14 + 1] == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                class195.field2254[var18] = var4;
                class195.field2257[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                class195.field2255[var13][var14 + 1] = 4;
                class195.field2252[var13][var14 + 1] = var17;
            }
            if (var13 > 0 && var14 > 0 && class195.field2255[var13 - 1][var14 - 1] == 0 && (var12[var15 - 1][var16 - 1] & 0x124010E) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                class195.field2254[var18] = var4 - 1;
                class195.field2257[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                class195.field2255[var13 - 1][var14 - 1] = 3;
                class195.field2252[var13 - 1][var14 - 1] = var17;
            }
            if (var13 < 127 && var14 > 0 && class195.field2255[var13 + 1][var14 - 1] == 0 && (var12[var15 + 1][var16 - 1] & 0x1240183) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 - 1] & 0x1240102) == 0) {
                class195.field2254[var18] = var4 + 1;
                class195.field2257[var18] = var5 - 1;
                var18 = var18 + 1 & 0xFFF;
                class195.field2255[var13 + 1][var14 - 1] = 9;
                class195.field2252[var13 + 1][var14 - 1] = var17;
            }
            if (var13 > 0 && var14 < 127 && class195.field2255[var13 - 1][var14 + 1] == 0 && (var12[var15 - 1][var16 + 1] & 0x1240138) == 0 && (var12[var15 - 1][var16] & 0x1240108) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                class195.field2254[var18] = var4 - 1;
                class195.field2257[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                class195.field2255[var13 - 1][var14 + 1] = 6;
                class195.field2252[var13 - 1][var14 + 1] = var17;
            }
            if (var13 < 127 && var14 < 127 && class195.field2255[var13 + 1][var14 + 1] == 0 && (var12[var15 + 1][var16 + 1] & 0x12401E0) == 0 && (var12[var15 + 1][var16] & 0x1240180) == 0 && (var12[var15][var16 + 1] & 0x1240120) == 0) {
                class195.field2254[var18] = var4 + 1;
                class195.field2257[var18] = var5 + 1;
                var18 = var18 + 1 & 0xFFF;
                class195.field2255[var13 + 1][var14 + 1] = 12;
                class195.field2252[var13 + 1][var14 + 1] = var17;
            }
        }
        field4423 = var4;
        field4206 = var5;
        return false;
    }

    @ObfuscatedName("cw.c(I)[Lku;")
    public static class304[] method2226() {
        return new class304[] { class304.field3621, class304.field3620 };
    }

    @ObfuscatedName("fx.c(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static void method3146(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                Throwable var3 = arg1;
                String var5;
                if (arg1 instanceof class469) {
                    class469 var4 = (class469) arg1;
                    var5 = var4.field4869 + " | ";
                    var3 = var4.field4866;
                } else {
                    var5 = "";
                }
                StringWriter var6 = new StringWriter();
                PrintWriter var7 = new PrintWriter(var6);
                var3.printStackTrace(var7);
                var7.close();
                String var8 = var6.toString();
                BufferedReader var9 = new BufferedReader(new StringReader(var8));
                String var10 = var9.readLine();
                while (true) {
                    String var11 = var9.readLine();
                    if (var11 == null) {
                        String var20 = var5 + "| " + var10;
                        var2 = var20;
                        break;
                    }
                    int var12 = var11.indexOf(40);
                    int var13 = var11.indexOf(41, var12 + 1);
                    if (var12 >= 0 && var13 >= 0) {
                        String var14 = var11.substring(var12 + 1, var13);
                        int var15 = var14.indexOf(".java:");
                        if (var15 >= 0) {
                            String var16 = var14.substring(0, var15) + var14.substring(var15 + 5);
                            var5 = var5 + var16 + ' ';
                            continue;
                        }
                        var11 = var11.substring(0, var12);
                    }
                    String var17 = var11.trim();
                    String var18 = var17.substring(var17.lastIndexOf(32) + 1);
                    String var19 = var18.substring(var18.lastIndexOf(9) + 1);
                    var5 = var5 + var19 + ' ';
                }
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var2 = var2 + " | ";
                }
                var2 = var2 + arg0;
            }
            System.out.println("Error: " + var2);
            String var22 = var2.replace(':', '.');
            String var23 = var22.replace('@', '_');
            String var24 = var23.replace('&', '_');
            String var25 = var24.replace('#', '_');
            if (field4870 == null) {
                return;
            }
            URL var26 = new URL(field4870.getCodeBase(), "clienterror.ws?cv=" + field4868 + "&cs=" + field3338 + "&u=" + field4867 + "&v1=" + field1760 + "&v2=" + field1753 + "&ct=" + field1568 + "&e=" + var25);
            DataInputStream var27 = new DataInputStream(var26.openStream());
            var27.read();
            var27.close();
        } catch (Exception var29) {
        }
    }

    @ObfuscatedName("mp.k(II)I")
    public static int method5897(int arg0) {
        class74 var1 = (class74) class100.field1334.get(arg0);
        return var1 == null ? 0 : var1.method2041();
    }

    @ObfuscatedName("dl.f(IB)Z")
    public static boolean method2667(int arg0) {
        return arg0 >= class299.field3580.field3583 && arg0 <= class299.field3561.field3583;
    }

    @ObfuscatedName("hn.m(I)Ljava/lang/String;")
    public static String method4248() {
        StringBuilder var0 = new StringBuilder();
        Iterator var1 = class100.field1333.iterator();
        while (var1.hasNext()) {
            class58 var2 = (class58) var1.next();
            if (var2.field473 != null && !var2.field473.isEmpty()) {
                var0.append(var2.field473).append(':');
            }
            var0.append(var2.field478).append('\n');
        }
        return var0.toString();
    }

    @ObfuscatedName("ke.p(II)Lgz;")
    public static class188 method5147(int arg0) {
        class188 var1 = (class188) class188.field2072.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2070.method5499(6, arg0);
        class188 var3 = new class188();
        var3.field2077 = arg0;
        if (var2 != null) {
            var3.method3457(new class445(var2));
        }
        var3.method3417();
        if (var3.field2098) {
            var3.field2087 = 0;
            var3.field2088 = false;
        }
        class188.field2072.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ff.m(B)V")
    public static final void method3139() {
        class213.field2623 = false;
        class213.field2627 = 0;
    }

    @ObfuscatedName("cz.m(Ljava/lang/String;I)V")
    public static final void method2292(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class310 var10001 = (class310) null;
        StringBuilder var2 = var10000.append(class310.field3840).append(arg0);
        class310 var3 = (class310) null;
        String var1 = var2.append(class310.field3841).toString();
        class100.method1932(30, "", var1);
    }

    @ObfuscatedName("nr.q([BIIB)Z")
    public static final boolean method6338(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class445 var4 = new class445(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method7276();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method7211();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method7196() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class188 var16 = method5147(var5);
                        if (var13 != 22 || !client.field497 || var16.field2089 != 0 || var16.field2087 == 1 || var16.field2108) {
                            if (!var16.method3460()) {
                                client.field559++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method7211();
                if (var9 == 0) {
                    break;
                }
                var4.method7196();
            }
        }
    }

    @ObfuscatedName("bz.y(ZI)V")
    public static void method1118(boolean arg0) {
        if (field103 != arg0) {
            class189.field2128.method4782();
            class189.field2154.method4782();
            class189.field2127.method4782();
            field103 = arg0;
        }
    }

    @ObfuscatedName("dr.g(IIB)Z")
    public static final boolean method2652(int arg0, int arg1) {
        class188 var2 = method5147(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method3420(arg1);
    }

    @ObfuscatedName("dn.fk(Llb;Ljava/lang/String;I)V")
    public static void method2793(class315 arg0, String arg1) {
        class77 var2 = new class77(arg0, arg1);
        client.field568.add(var2);
        client.field614 += var2.field1017;
    }

    @ObfuscatedName("gf.gb(IIIB)V")
    public static final void method3756(int arg0, int arg1, int arg2) {
        if (field1759 < arg0) {
            field1759 += field1399 * (arg0 - field1759) / 1000 + field833;
            if (field1759 > arg0) {
                field1759 = arg0;
            }
        }
        if (field1759 > arg0) {
            field1759 -= field1399 * (field1759 - arg0) / 1000 + field833;
            if (field1759 < arg0) {
                field1759 = arg0;
            }
        }
        if (field963 < arg1) {
            field963 += field1399 * (arg1 - field963) / 1000 + field833;
            if (field963 > arg1) {
                field963 = arg1;
            }
        }
        if (field963 > arg1) {
            field963 -= field1399 * (field963 - arg1) / 1000 + field833;
            if (field963 < arg1) {
                field963 = arg1;
            }
        }
        if (field483 < arg2) {
            field483 += field1399 * (arg2 - field483) / 1000 + field833;
            if (field483 > arg2) {
                field483 = arg2;
            }
        }
        if (field483 > arg2) {
            field483 -= field1399 * (field483 - arg2) / 1000 + field833;
            if (field483 < arg2) {
                field483 = arg2;
            }
        }
    }

    @ObfuscatedName("dh.gs(Lce;B)V")
    public static final void method2832(class87 arg0) {
        int var1 = Math.max(1, arg0.field1184 - client.field504);
        int var2 = arg0.field1193 * 128 + arg0.field1132 * 64;
        int var3 = arg0.field1182 * 128 + arg0.field1132 * 64;
        arg0.field1185 += (var2 - arg0.field1185) / var1;
        arg0.field1129 += (var3 - arg0.field1129) / var1;
        arg0.field1202 = 0;
        arg0.field1157 = arg0.field1186;
    }

    @ObfuscatedName("in.hd(Lcl;I)Z")
    public static boolean method4736(class85 arg0) {
        if (client.field625 == 0) {
            return false;
        } else if (field890 == arg0) {
            return (client.field625 & 0x8) != 0;
        } else {
            boolean var1 = client.method2606() || client.method2874() && arg0.method2204();
            if (!var1) {
                boolean var2 = (client.field625 & 0x2) != 0;
                var1 = var2 && arg0.method2195();
            }
            return var1;
        }
    }

    @ObfuscatedName("nz.ij(ZLqf;I)V")
    public static final void method6458(boolean arg0, class444 arg1) {
        client.field626 = 0;
        client.field550 = 0;
        method2607();
        client.method4859(arg0, arg1);
        client.method4657(arg1);
        for (int var2 = 0; var2 < client.field626; var2++) {
            int var3 = client.field776[var2];
            if (client.field504 != client.field547[var3].field1187) {
                client.field547[var3].field1254 = null;
                client.field547[var3] = null;
            }
        }
        if (client.field552.field1345 != arg1.field4735) {
            throw new RuntimeException(arg1.field4735 + class93.field1259 + client.field552.field1345);
        }
        for (int var4 = 0; var4 < client.field690; var4++) {
            if (client.field547[client.field514[var4]] == null) {
                throw new RuntimeException(var4 + class93.field1259 + client.field690);
            }
        }
    }

    @ObfuscatedName("db.iq(I)V")
    public static final void method2607() {
        class444 var0 = client.field552.field1343;
        var0.method7145();
        int var1 = var0.method7146(8);
        if (var1 < client.field690) {
            for (int var2 = var1; var2 < client.field690; var2++) {
                client.field776[++client.field626 - 1] = client.field514[var2];
            }
        }
        if (var1 > client.field690) {
            throw new RuntimeException("");
        }
        client.field690 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = client.field514[var3];
            class92 var5 = client.field547[var4];
            int var6 = var0.method7146(1);
            if (var6 == 0) {
                client.field514[++client.field690 - 1] = var4;
                var5.field1187 = client.field504;
            } else {
                int var7 = var0.method7146(2);
                if (var7 == 0) {
                    client.field514[++client.field690 - 1] = var4;
                    var5.field1187 = client.field504;
                    client.field551[++client.field550 - 1] = var4;
                } else if (var7 == 1) {
                    client.field514[++client.field690 - 1] = var4;
                    var5.field1187 = client.field504;
                    int var8 = var0.method7146(3);
                    var5.method2401(var8, class194.field2247);
                    int var9 = var0.method7146(1);
                    if (var9 == 1) {
                        client.field551[++client.field550 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    client.field514[++client.field690 - 1] = var4;
                    var5.field1187 = client.field504;
                    if (var0.method7146(1) == 1) {
                        int var10 = var0.method7146(3);
                        var5.method2401(var10, class194.field2248);
                        int var11 = var0.method7146(3);
                        var5.method2401(var11, class194.field2248);
                    } else {
                        int var12 = var0.method7146(3);
                        var5.method2401(var12, class194.field2245);
                    }
                    int var13 = var0.method7146(1);
                    if (var13 == 1) {
                        client.field551[++client.field550 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    client.field776[++client.field626 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("ni.kv(Lkw;Lgk;IIZB)V")
    public static final void method6202(class296 arg0, class189 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field2170;
        byte var6 = -1;
        String var7 = null;
        if (var5 != null && var5[arg3] != null) {
            if (arg3 == 0) {
                var6 = 33;
            } else if (arg3 == 1) {
                var6 = 34;
            } else if (arg3 == 2) {
                var6 = 35;
            } else if (arg3 == 3) {
                var6 = 36;
            } else {
                var6 = 37;
            }
            var7 = var5[arg3];
        } else if (arg3 == 4) {
            var6 = 37;
            var7 = class310.field3657;
        }
        if (var6 != -1 && var7 != null) {
            client.method6620(var7, class93.method814(16748608) + arg1.field2139, var6, 0, arg2, arg0.field3395, arg1.field2131, arg4);
        }
    }

    @ObfuscatedName("fr.kx(Lkw;IIS)V")
    public static final void method3108(class296 arg0, int arg1, int arg2) {
        if (arg0.field3398 == 1) {
            client.method6609(arg0.field3546, "", 24, 0, 0, arg0.field3395, arg0.field3454);
        }
        if (arg0.field3398 == 2 && !client.field661) {
            String var3 = client.method1945(arg0);
            if (var3 != null) {
                client.method6609(var3, class93.method814(65280) + arg0.field3528, 25, 0, -1, arg0.field3395, arg0.field3454);
            }
        }
        if (arg0.field3398 == 3) {
            client.method2869(class310.field3827, "", 26, 0, 0, arg0.field3395);
        }
        if (arg0.field3398 == 4) {
            client.method2869(arg0.field3546, "", 28, 0, 0, arg0.field3395);
        }
        if (arg0.field3398 == 5) {
            client.method2869(arg0.field3546, "", 29, 0, 0, arg0.field3395);
        }
        if (arg0.field3398 == 6 && client.field628 == null) {
            client.method2869(arg0.field3546, "", 30, 0, -1, arg0.field3395);
        }
        if (arg0.field3397 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field3411; var5++) {
                for (int var6 = 0; var6 < arg0.field3410; var6++) {
                    int var7 = (arg0.field3463 + 32) * var6;
                    int var8 = (arg0.field3464 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field3416[var4];
                        var8 += arg0.field3466[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        client.field727 = var4;
                        field2641 = arg0;
                        if (arg0.field3408[var4] > 0) {
                            label302: {
                                class189 var9 = class189.method2643(arg0.field3408[var4] - 1);
                                if (client.field659 == 1) {
                                    int var10 = client.method2462(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (field2692 != arg0.field3395 || field481 != var4) {
                                            client.method6609(class310.field3947, client.field660 + " " + class93.field1263 + " " + class93.method814(16748608) + var9.field2139, 31, 0, var4, arg0.field3395, var9.field2131);
                                        }
                                        break label302;
                                    }
                                }
                                if (client.field661) {
                                    int var12 = client.method2462(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((field1366 & 0x10) == 16) {
                                            client.method6609(client.field664, client.field665 + " " + class93.field1263 + " " + class93.method814(16748608) + var9.field2139, 32, 0, var4, arg0.field3395, var9.field2131);
                                        }
                                        break label302;
                                    }
                                }
                                String[] var14 = var9.field2170;
                                int var15 = -1;
                                if (client.field668 && client.method4978()) {
                                    var15 = var9.method3516();
                                }
                                if (class297.method1995(client.method2462(arg0))) {
                                    for (int var16 = 4; var16 >= 3; var16--) {
                                        if (var15 != var16) {
                                            method6202(arg0, var9, var4, var16, false);
                                        }
                                    }
                                }
                                if (class297.method5071(client.method2462(arg0))) {
                                    client.method6609(class310.field3947, class93.method814(16748608) + var9.field2139, 38, 0, var4, arg0.field3395, var9.field2131);
                                }
                                int var17 = client.method2462(arg0);
                                boolean var18 = (var17 >> 30 & 0x1) != 0;
                                if (var18) {
                                    for (int var19 = 2; var19 >= 0; var19--) {
                                        if (var15 != var19) {
                                            method6202(arg0, var9, var4, var19, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        method6202(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var20 = arg0.field3468;
                                if (var20 != null) {
                                    for (int var21 = 4; var21 >= 0; var21--) {
                                        if (var20[var21] != null) {
                                            byte var22 = 0;
                                            if (var21 == 0) {
                                                var22 = 39;
                                            }
                                            if (var21 == 1) {
                                                var22 = 40;
                                            }
                                            if (var21 == 2) {
                                                var22 = 41;
                                            }
                                            if (var21 == 3) {
                                                var22 = 42;
                                            }
                                            if (var21 == 4) {
                                                var22 = 43;
                                            }
                                            client.method6609(var20[var21], class93.method814(16748608) + var9.field2139, var22, 0, var4, arg0.field3395, var9.field2131);
                                        }
                                    }
                                }
                                client.method6609(class310.field3670, class93.method814(16748608) + var9.field2139, 1005, 0, var4, arg0.field3395, var9.field2131);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field3488) {
            return;
        }
        if (!client.field661) {
            for (int var23 = 9; var23 >= 5; var23--) {
                int var24 = client.method2462(arg0);
                boolean var25 = (var24 >> var23 + 1 & 0x1) != 0;
                String var26;
                if (!var25 && arg0.field3494 == null) {
                    var26 = null;
                } else if (arg0.field3480 == null || arg0.field3480.length <= var23 || arg0.field3480[var23] == null || arg0.field3480[var23].trim().length() == 0) {
                    var26 = null;
                } else {
                    var26 = arg0.field3480[var23];
                }
                if (var26 != null) {
                    client.method6609(var26, arg0.field3491, 1007, var23 + 1, arg0.field3415, arg0.field3395, arg0.field3454);
                }
            }
            String var28 = client.method1945(arg0);
            if (var28 != null) {
                client.method6609(var28, arg0.field3491, 25, 0, arg0.field3415, arg0.field3395, arg0.field3454);
            }
            for (int var29 = 4; var29 >= 0; var29--) {
                int var30 = client.method2462(arg0);
                boolean var31 = (var30 >> var29 + 1 & 0x1) != 0;
                String var32;
                if (!var31 && arg0.field3494 == null) {
                    var32 = null;
                } else if (arg0.field3480 == null || arg0.field3480.length <= var29 || arg0.field3480[var29] == null || arg0.field3480[var29].trim().length() == 0) {
                    var32 = null;
                } else {
                    var32 = arg0.field3480[var29];
                }
                if (var32 != null) {
                    client.method6620(var32, arg0.field3491, 57, var29 + 1, arg0.field3415, arg0.field3395, arg0.field3454, arg0.field3548);
                }
            }
            if (class297.method3244(client.method2462(arg0))) {
                client.method2869(class310.field3933, "", 30, 0, arg0.field3415, arg0.field3395);
            }
        } else if (class297.method1941(client.method2462(arg0)) && (field1366 & 0x20) == 32) {
            client.method6609(client.field664, client.field665 + " " + class93.field1263 + " " + arg0.field3491, 58, 0, arg0.field3415, arg0.field3395, arg0.field3454);
        }
    }

    @ObfuscatedName("hb.lq(III)V")
    public static final void method4615(int arg0, int arg1) {
        class150 var2 = arg0 >= 0 ? client.field769[arg0] : field3287;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method2969()) {
            return;
        }
        class132 var3 = (class132) var2.field1704.get(arg1);
        if (var3.field1575 != -1) {
            return;
        }
        String var4 = var3.field1572.method7774();
        class266 var5 = method2786(class264.field3026, client.field552.field1342);
        var5.field3064.method7179(3 + class445.method6110(var4));
        var5.field3064.method7179(arg0);
        var5.field3064.method7286(arg1);
        var5.field3064.method7186(var4);
        client.field552.method2534(var5);
    }

    @ObfuscatedName("ps.my(I)V")
    public static void method7072() {
        if (client.field579 == 1) {
            client.field587 = true;
        }
    }

    @ObfuscatedName("ko.mr(I)V")
    public static void method5109() {
        if (field1324 == null) {
            return;
        }
        client.field783 = client.field504;
        field1324.method5604();
        for (int var0 = 0; var0 < client.field620.length; var0++) {
            if (client.field620[var0] != null) {
                field1324.method5598((client.field620[var0].field1185 >> 7) + field1560, (client.field620[var0].field1129 >> 7) + field2784);
            }
        }
    }
}
