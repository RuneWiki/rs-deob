package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("bq.h")
    public static class327[] field1000;

    @ObfuscatedName("by.qk")
    public static class103 field1006;

    @ObfuscatedName("by.m")
    public static int field1007;

    @ObfuscatedName("t.b")
    public static int[] field101;

    @ObfuscatedName("by.h")
    public static int field1010;

    @ObfuscatedName("bu.b")
    public static class144 field1024;

    @ObfuscatedName("l.x")
    public static String[] field103;

    @ObfuscatedName("bt.bn")
    public static int field1035;

    @ObfuscatedName("bt.t")
    public static class239 field1036;

    @ObfuscatedName("bt.bl")
    public static String field1038;

    @ObfuscatedName("bt.bs")
    public static class327[] field1039;

    @ObfuscatedName("bc.bc")
    public static class327[] field1048;

    @ObfuscatedName("o.es")
    public static String field106;

    @ObfuscatedName("bx.po")
    public static class328 field1068;

    @ObfuscatedName("bx.g")
    public static int[] field1069;

    @ObfuscatedName("o.pd")
    public static class314 field107;

    @ObfuscatedName("bx.m")
    public static int field1073;

    @ObfuscatedName("ba.r")
    public static class97 field1096;

    @ObfuscatedName("bm.fi")
    public static class303 field1098;

    @ObfuscatedName("x.b")
    public static short[][] field11;

    @ObfuscatedName("cm.f")
    public static int field1104;

    @ObfuscatedName("ch.mn")
    public static int field1116;

    @ObfuscatedName("cg.r")
    public static class239 field1120;

    @ObfuscatedName("ca.u")
    public static int field1134;

    @ObfuscatedName("ca.f")
    public static boolean field1136;

    @ObfuscatedName("cy.b")
    public static class105 field1140;

    @ObfuscatedName("u.sv")
    public static int field115;

    @ObfuscatedName("cc.a")
    public static boolean field1150;

    @ObfuscatedName("cc.p")
    public static class328 field1152;

    @ObfuscatedName("cc.b")
    public static class327 field1155;

    @ObfuscatedName("cc.q")
    public static class327[] field1158;

    @ObfuscatedName("u.gr")
    public static int field116;

    @ObfuscatedName("cc.aa")
    public static int[] field1165;

    @ObfuscatedName("cc.x")
    public static class327 field1176;

    @ObfuscatedName("cc.k")
    public static int field1177;

    @ObfuscatedName("cc.m")
    public static class327 field1190;

    @ObfuscatedName("y.rz")
    public static int field120;

    @ObfuscatedName("cb.f")
    public static int field1223;

    @ObfuscatedName("cp.g")
    public static int field1231;

    @ObfuscatedName("cd.gg")
    public static class327[] field1248;

    @ObfuscatedName("cq.gu")
    public static int[][] field1256;

    @ObfuscatedName("cq.rg")
    public static int field1259;

    @ObfuscatedName("y.eb")
    public static class257 field126;

    @ObfuscatedName("y.r")
    public static class305 field128;

    @ObfuscatedName("co.od")
    public static class164 field1282;

    @ObfuscatedName("y.w")
    public static int[] field129;

    @ObfuscatedName("co.ar")
    public static class325 field1290;

    @ObfuscatedName("cr.w")
    public static String field1299;

    @ObfuscatedName("cr.r")
    public static int[] field1303;

    @ObfuscatedName("k.sa")
    public static class334 field131;

    @ObfuscatedName("ci.z")
    public static float[] field1336;

    @ObfuscatedName("ci.ag")
    public static float[] field1338;

    @ObfuscatedName("k.i")
    public static String field134;

    @ObfuscatedName("ci.p")
    public static byte[] field1342;

    @ObfuscatedName("ci.q")
    public static int field1344;

    @ObfuscatedName("ci.ay")
    public static float[] field1345;

    @ObfuscatedName("ci.n")
    public static int field1346;

    @ObfuscatedName("ci.b")
    public static int field1347;

    @ObfuscatedName("ci.t")
    public static class109[] field1349;

    @ObfuscatedName("ci.l")
    public static class114[] field1350;

    @ObfuscatedName("ci.o")
    public static boolean[] field1351;

    @ObfuscatedName("ci.u")
    public static int[] field1352;

    @ObfuscatedName("ci.m")
    public static int field1356;

    @ObfuscatedName("ci.i")
    public static float[] field1358;

    @ObfuscatedName("ci.c")
    public static float[] field1359;

    @ObfuscatedName("k.hz")
    public static int field136;

    @ObfuscatedName("ci.j")
    public static float[] field1360;

    @ObfuscatedName("ci.r")
    public static class102[] field1361;

    @ObfuscatedName("ci.af")
    public static float[] field1363;

    @ObfuscatedName("ci.aa")
    public static int[] field1365;

    @ObfuscatedName("ci.ab")
    public static int[] field1366;

    @ObfuscatedName("ci.e")
    public static class98[] field1368;

    @ObfuscatedName("cj.n")
    public static int[] field1376;

    @ObfuscatedName("cj.e")
    public static boolean[] field1379;

    @ObfuscatedName("v.fe")
    public static long field138;

    @ObfuscatedName("cj.b")
    public static int[] field1384;

    @ObfuscatedName("cz.m")
    public static ScheduledExecutorService field1387;

    @ObfuscatedName("cz.q")
    public static int field1405;

    @ObfuscatedName("dz.jt")
    public static class239 field1418;

    @ObfuscatedName("dz.s")
    public static int field1419;

    @ObfuscatedName("dn.iz")
    public static int field1439;

    @ObfuscatedName("dr.m")
    public static float field1460;

    @ObfuscatedName("dr.q")
    public static int field1462;

    @ObfuscatedName("v.ab")
    public static int[] field147;

    @ObfuscatedName("du.cz")
    public static boolean field1523;

    @ObfuscatedName("du.b")
    public static int field1526;

    @ObfuscatedName("v.ox")
    public static class90 field154;

    @ObfuscatedName("v.sh")
    public static class170 field155;

    @ObfuscatedName("db.l")
    public static int[] field1626;

    @ObfuscatedName("d.ee")
    public static int[] field166;

    @ObfuscatedName("d.rp")
    public static int field168;

    @ObfuscatedName("dv.bp")
    public static int field1692;

    @ObfuscatedName("dv.bv")
    public static int field1720;

    @ObfuscatedName("dv.bg")
    public static int field1721;

    @ObfuscatedName("di.p")
    public static int field1735;

    @ObfuscatedName("di.q")
    public static int field1736;

    @ObfuscatedName("di.e")
    public static int field1737;

    @ObfuscatedName("di.o")
    public static int field1739;

    @ObfuscatedName("df.y")
    public static int field1754;

    @ObfuscatedName("df.o")
    public static int field1755;

    @ObfuscatedName("df.i")
    public static class139 field1756;

    @ObfuscatedName("df.r")
    public static int field1757;

    @ObfuscatedName("df.t")
    public static int field1767;

    @ObfuscatedName("df.l")
    public static int field1769;

    @ObfuscatedName("df.u")
    public static int field1770;

    @ObfuscatedName("df.k")
    public static int field1772;

    @ObfuscatedName("df.v")
    public static int field1773;

    @ObfuscatedName("en.c")
    public static int field1799;

    @ObfuscatedName("en.u")
    public static int field1810;

    @ObfuscatedName("en.k")
    public static int field1812;

    @ObfuscatedName("en.v")
    public static int field1813;

    @ObfuscatedName("en.d")
    public static int field1814;

    @ObfuscatedName("en.w")
    public static int field1815;

    @ObfuscatedName("en.ag")
    public static int field1818;

    @ObfuscatedName("en.i")
    public static int field1820;

    @ObfuscatedName("en.af")
    public static int field1821;

    @ObfuscatedName("en.ay")
    public static int field1822;

    @ObfuscatedName("en.aa")
    public static int field1823;

    @ObfuscatedName("en.bn")
    public static int field1825;

    @ObfuscatedName("en.j")
    public static int field1830;

    @ObfuscatedName("en.z")
    public static int field1846;

    @ObfuscatedName("w.gw")
    public static class328 field185;

    @ObfuscatedName("en.bg")
    public static boolean[][] field1854;

    @ObfuscatedName("en.br")
    public static int field1855;

    @ObfuscatedName("en.y")
    public static int field1856;

    @ObfuscatedName("en.bk")
    public static int field1857;

    @ObfuscatedName("en.bl")
    public static int field1858;

    @ObfuscatedName("en.bb")
    public static int field1859;

    @ObfuscatedName("en.bw")
    public static int field1860;

    @ObfuscatedName("ek.x")
    public static class226 field1861;

    @ObfuscatedName("w.jk")
    public static class67 field187;

    @ObfuscatedName("eo.ba")
    public static class327 field1879;

    @ObfuscatedName("w.bg")
    public static int field188;

    @ObfuscatedName("ei.g")
    public static class255 field1882;

    @ObfuscatedName("es.fx")
    public static class305 field1905;

    @ObfuscatedName("es.gf")
    public static class328[] field1907;

    @ObfuscatedName("er.gx")
    public static byte[][] field1933;

    @ObfuscatedName("ex.o")
    public static class190 field1943;

    @ObfuscatedName("eg.kh")
    public static int field1950;

    @ObfuscatedName("ed.dd")
    public static class257 field1957;

    @ObfuscatedName("ey.lx")
    public static class239 field1962;

    @ObfuscatedName("ee.q")
    public static int[][] field1964;

    @ObfuscatedName("ee.m")
    public static int[] field1965;

    @ObfuscatedName("el.cp")
    public static class64 field1970;

    @ObfuscatedName("eq.g")
    public static class327 field1975;

    @ObfuscatedName("eq.dm")
    public static class257 field1976;

    @ObfuscatedName("eu.q")
    public static int[] field1978;

    @ObfuscatedName("et.y")
    public static String[] field1990;

    @ObfuscatedName("et.bt")
    public static class327[] field1991;

    @ObfuscatedName("et.s")
    public static class255 field1992;

    @ObfuscatedName("et.dv")
    public static class257 field1994;

    @ObfuscatedName("s.jo")
    public static class239 field2;

    @ObfuscatedName("fe.x")
    public static int field2019;

    @ObfuscatedName("fe.s")
    public static String field2020;

    @ObfuscatedName("fe.g")
    public static int field2021;

    @ObfuscatedName("fe.a")
    public static Applet field2023;

    @ObfuscatedName("c.ej")
    public static int field203;

    @ObfuscatedName("fo.a")
    public static String field2035;

    @ObfuscatedName("fo.s")
    public static String field2039;

    @ObfuscatedName("fm.x")
    public static File field2044;

    @ObfuscatedName("fm.h")
    public static File field2045;

    @ObfuscatedName("fm.du")
    public static class257 field2053;

    @ObfuscatedName("fq.ef")
    public static int field2055;

    @ObfuscatedName("fz.s")
    public static File field2057;

    @ObfuscatedName("fz.f")
    public static class255 field2059;

    @ObfuscatedName("fd.le")
    public static int field2066;

    @ObfuscatedName("fx.ex")
    public static int field2100;

    @ObfuscatedName("fx.qg")
    public static int field2101;

    @ObfuscatedName("j.db")
    public static class257 field212;

    @ObfuscatedName("ft.h")
    public static int field2120;

    @ObfuscatedName("ft.gi")
    public static int[] field2121;

    @ObfuscatedName("fu.b")
    public static int field2126;

    @ObfuscatedName("fu.dh")
    public static class257 field2129;

    @ObfuscatedName("j.sk")
    public static class259 field217;

    @ObfuscatedName("fc.js")
    public static int field2219;

    @ObfuscatedName("z.d")
    public static String field222;

    @ObfuscatedName("z.qy")
    public static int field223;

    @ObfuscatedName("z.gv")
    public static class328[] field224;

    @ObfuscatedName("z.pm")
    public static boolean field226;

    @ObfuscatedName("fv.ev")
    public static class257 field2325;

    @ObfuscatedName("fv.q")
    public static class255 field2330;

    @ObfuscatedName("fa.gp")
    public static class327[] field2356;

    @ObfuscatedName("gn.hg")
    public static int field2364;

    @ObfuscatedName("ag.dy")
    public static class257 field240;

    @ObfuscatedName("gz.j")
    public static int[] field2404;

    @ObfuscatedName("go.ao")
    public static GarbageCollectorMXBean field2427;

    @ObfuscatedName("go.p")
    public static int[] field2432;

    @ObfuscatedName("go.q")
    public static byte[][][] field2433;

    @ObfuscatedName("go.fm")
    public static class165 field2435;

    @ObfuscatedName("go.rh")
    public static int field2437;

    @ObfuscatedName("gj.s")
    public static long field2438;

    @ObfuscatedName("gj.b")
    public static int field2439;

    @ObfuscatedName("af.ac")
    public static boolean field244;

    @ObfuscatedName("gj.a")
    public static long field2440;

    @ObfuscatedName("gh.q")
    public static byte[][] field2455;

    @ObfuscatedName("gb.se")
    public static int field2468;

    @ObfuscatedName("gw.a")
    public static class255 field2472;

    @ObfuscatedName("gw.fl")
    public static class143 field2474;

    @ObfuscatedName("gc.n")
    public static class255 field2479;

    @ObfuscatedName("h.lu")
    public static class82 field25;

    @ObfuscatedName("ay.j")
    public static int[] field252;

    @ObfuscatedName("hu.e")
    public static class327 field2535;

    @ObfuscatedName("hu.hx")
    public static int field2539;

    @ObfuscatedName("hd.s")
    public static class255 field2548;

    @ObfuscatedName("hd.r")
    public static class106 field2549;

    @ObfuscatedName("hd.a")
    public static class255 field2551;

    @ObfuscatedName("hd.p")
    public static int field2552;

    @ObfuscatedName("hd.m")
    public static int field2553;

    @ObfuscatedName("hd.n")
    public static boolean field2554;

    @ObfuscatedName("hd.g")
    public static class255 field2559;

    @ObfuscatedName("h.qu")
    public static int field26;

    @ObfuscatedName("hb.dw")
    public static class257 field2637;

    @ObfuscatedName("il.p")
    public static short[] field2653;

    @ObfuscatedName("il.m")
    public static short[][] field2660;

    @ObfuscatedName("il.q")
    public static short[] field2661;

    @ObfuscatedName("aa.c")
    public static int[] field267;

    @ObfuscatedName("iy.e")
    public static class168 field2671;

    @ObfuscatedName("aa.nz")
    public static int field268;

    @ObfuscatedName("ia.f")
    public static class239[][] field2681;

    @ObfuscatedName("ia.b")
    public static class255 field2683;

    @ObfuscatedName("h.sq")
    public static class73 field27;

    @ObfuscatedName("ah.do")
    public static class257 field276;

    @ObfuscatedName("ia.p")
    public static boolean[] field2766;

    @ObfuscatedName("ah.kp")
    public static int field277;

    @ObfuscatedName("aw.f")
    public static class255 field279;

    @ObfuscatedName("h.go")
    public static class133 field28;

    @ObfuscatedName("aw.cp")
    public static char field280;

    @ObfuscatedName("aw.at")
    public static Image field281;

    @ObfuscatedName("aw.gy")
    public static int[] field282;

    @ObfuscatedName("aw.dj")
    public static class257 field285;

    @ObfuscatedName("an.nr")
    public static int field287;

    @ObfuscatedName("an.sd")
    public static class332 field295;

    @ObfuscatedName("s.gt")
    public static class328[] field3;

    @ObfuscatedName("h.fs")
    public static int field30;

    @ObfuscatedName("ae.e")
    public static class231 field303;

    @ObfuscatedName("ae.bx")
    public static class327 field309;

    @ObfuscatedName("ij.bv")
    public static int field3196;

    @ObfuscatedName("ij.ay")
    public static int[] field3197;

    @ObfuscatedName("ij.ix")
    public static int field3199;

    @ObfuscatedName("h.bk")
    public static String field32;

    @ObfuscatedName("is.e")
    public static int[] field3210;

    @ObfuscatedName("ib.dk")
    public static class257 field3225;

    @ObfuscatedName("ib.ek")
    public static class316 field3228;

    @ObfuscatedName("id.h")
    public static Thread field3263;

    @ObfuscatedName("id.gk")
    public static class328[] field3264;

    @ObfuscatedName("io.a")
    public static class165 field3275;

    @ObfuscatedName("io.g")
    public static long field3277;

    @ObfuscatedName("io.r")
    public static boolean field3293;

    @ObfuscatedName("f.gq")
    public static int[] field33;

    @ObfuscatedName("ip.f")
    public static class328 field3309;

    @ObfuscatedName("aj.eg")
    public static int field331;

    @ObfuscatedName("ip.kv")
    public static int field3310;

    @ObfuscatedName("ja.a")
    public static class255 field3311;

    @ObfuscatedName("ja.l")
    public static int[][][] field3315;

    @ObfuscatedName("jn.gh")
    public static int field3320;

    @ObfuscatedName("jd.s")
    public static class263[] field3321;

    @ObfuscatedName("jd.g")
    public static int field3323;

    @ObfuscatedName("jd.a")
    public static class255 field3342;

    @ObfuscatedName("jl.a")
    public static class255 field3347;

    @ObfuscatedName("jh.s")
    public static class255 field3349;

    @ObfuscatedName("jh.a")
    public static class255 field3354;

    @ObfuscatedName("jo.a")
    public static class255 field3366;

    @ObfuscatedName("jo.dr")
    public static long field3372;

    @ObfuscatedName("jx.a")
    public static class255 field3373;

    @ObfuscatedName("jx.s")
    public static class255 field3374;

    @ObfuscatedName("jp.s")
    public static class255 field3386;

    @ObfuscatedName("jp.a")
    public static class255 field3398;

    @ObfuscatedName("f.be")
    public static class251 field34;

    @ObfuscatedName("as.rk")
    public static int field340;

    @ObfuscatedName("jt.a")
    public static class255 field3405;

    @ObfuscatedName("jz.a")
    public static class255 field3412;

    @ObfuscatedName("jq.a")
    public static class255 field3415;

    @ObfuscatedName("jf.a")
    public static class255 field3420;

    @ObfuscatedName("je.a")
    public static class255 field3431;

    @ObfuscatedName("je.g")
    public static class255 field3439;

    @ObfuscatedName("as.gb")
    public static class328 field345;

    @ObfuscatedName("jy.s")
    public static class255 field3453;

    @ObfuscatedName("jy.g")
    public static class255 field3454;

    @ObfuscatedName("ar.j")
    public static int field348;

    @ObfuscatedName("ar.hh")
    public static int field350;

    @ObfuscatedName("jy.ey")
    public static SecureRandom field3503;

    @ObfuscatedName("jc.m")
    public static boolean field3508;

    @ObfuscatedName("jc.q")
    public static int field3509;

    @ObfuscatedName("ar.dq")
    public static class165 field353;

    @ObfuscatedName("ar.rt")
    public static class74 field355;

    @ObfuscatedName("ar.bu")
    public static class328[] field358;

    @ObfuscatedName("jg.lm")
    public static class239 field3586;

    @ObfuscatedName("jg.s")
    public static class255 field3599;

    @ObfuscatedName("f.l")
    public static int field36;

    @ObfuscatedName("jw.a")
    public static class255 field3607;

    @ObfuscatedName("jw.sg")
    public static long field3615;

    @ObfuscatedName("ju.s")
    public static class255 field3617;

    @ObfuscatedName("ai.as")
    public static String field363;

    @ObfuscatedName("ju.dp")
    public static class257 field3631;

    @ObfuscatedName("ju.a")
    public static class255 field3634;

    @ObfuscatedName("js.p")
    public static class255 field3638;

    @ObfuscatedName("jj.gz")
    public static byte[][] field3641;

    @ObfuscatedName("ai.pt")
    public static class300 field366;

    @ObfuscatedName("ai.h")
    public static int field367;

    @ObfuscatedName("kj.u")
    public static String[] field3697;

    @ObfuscatedName("f.qe")
    public static class110 field37;

    @ObfuscatedName("kz.cd")
    public static int field3716;

    @ObfuscatedName("kw.he")
    public static int field3753;

    @ObfuscatedName("kw.qb")
    public static int field3758;

    @ObfuscatedName("aq.u")
    public static class42 field377;

    @ObfuscatedName("kf.b")
    public static class327[] field3784;

    @ObfuscatedName("kc.a")
    public static class182 field3793;

    @ObfuscatedName("f.a")
    public static class255 field38;

    @ObfuscatedName("kv.br")
    public static String field3804;

    @ObfuscatedName("lk.qp")
    public static int field3843;

    @ObfuscatedName("la.a")
    public static class162 field3849;

    @ObfuscatedName("lj.h")
    public static class72[] field3859;

    @ObfuscatedName("lb.aa")
    public static int field3862;

    @ObfuscatedName("lb.af")
    public static int[] field3863;

    @ObfuscatedName("lb.ay")
    public static int field3864;

    @ObfuscatedName("p.bz")
    public static class252 field39;

    @ObfuscatedName("lu.x")
    public static int[] field3900;

    @ObfuscatedName("lu.s")
    public static int field3901;

    @ObfuscatedName("lu.p")
    public static int[] field3902;

    @ObfuscatedName("lu.m")
    public static int[] field3903;

    @ObfuscatedName("lu.f")
    public static int[] field3904;

    @ObfuscatedName("lu.g")
    public static int field3905;

    @ObfuscatedName("lu.a")
    public static int field3906;

    @ObfuscatedName("az.fv")
    public static int field413;

    @ObfuscatedName("az.de")
    public static class257 field414;

    @ObfuscatedName("az.bi")
    public static class335 field415;

    @ObfuscatedName("ac.i")
    public static int[] field418;

    @ObfuscatedName("ac.bn")
    public static int field420;

    @ObfuscatedName("ad.jr")
    public static class239 field421;

    @ObfuscatedName("ad.dl")
    public static class161 field424;

    @ObfuscatedName("ad.h")
    public static int[] field427;

    @ObfuscatedName("ad.sz")
    public static class7 field428;

    @ObfuscatedName("ax.m")
    public static class255 field429;

    @ObfuscatedName("ax.r")
    public static int field430;

    @ObfuscatedName("ak.hr")
    public static int field436;

    @ObfuscatedName("bf.ab")
    public static FontMetrics field447;

    @ObfuscatedName("bf.m")
    public static int field464;

    @ObfuscatedName("bo.af")
    public static int[] field499;

    @ObfuscatedName("bo.nv")
    public static int field500;

    @ObfuscatedName("be.fk")
    public static class305 field501;

    @ObfuscatedName("be.qf")
    public static class103 field504;

    @ObfuscatedName("bd.p")
    public static byte[][][] field505;

    @ObfuscatedName("bd.h")
    public static byte[][][] field509;

    @ObfuscatedName("bd.f")
    public static byte[][][] field510;

    @ObfuscatedName("bd.m")
    public static byte[][][] field512;

    @ObfuscatedName("bd.n")
    public static int[] field513;

    @ObfuscatedName("bd.t")
    public static int[] field514;

    @ObfuscatedName("bd.x")
    public static byte[][][] field518;

    @ObfuscatedName("bi.fh")
    public static int field535;

    @ObfuscatedName("bi.q")
    public static int field537;

    @ObfuscatedName("bp.da")
    public static class257 field538;

    @ObfuscatedName("bp.dx")
    public static class257 field541;

    @ObfuscatedName("bp.hq")
    public static int field544;

    @ObfuscatedName("bv.ad")
    public static class320 field552;

    @ObfuscatedName("bv.gd")
    public static class328[] field553;

    @ObfuscatedName("bv.ao")
    public static String field554;

    @ObfuscatedName("bv.ak")
    public static client field555;

    @ObfuscatedName("bg.fn")
    public static class161 field564;

    @ObfuscatedName("bk.gc")
    public static class327[] field569;

    @ObfuscatedName("q.kb")
    public static int field57;

    @ObfuscatedName("q.n")
    public static class327 field58;

    @ObfuscatedName("q.v")
    public static class190 field59;

    @ObfuscatedName("bn.l")
    public static class117[] field593;

    @ObfuscatedName("q.ez")
    public static int field60;

    @ObfuscatedName("bb.ll")
    public static int field607;

    @ObfuscatedName("bb.jg")
    public static class119 field609;

    @ObfuscatedName("q.qv")
    public static class96 field61;

    @ObfuscatedName("q.t")
    public static class254 field62;

    @ObfuscatedName("bw.df")
    public static class257 field640;

    @ObfuscatedName("bh.sr")
    public static short[] field641;

    @ObfuscatedName("bh.f")
    public static int field646;

    @ObfuscatedName("b.gs")
    public static class328[] field69;

    @ObfuscatedName("b.ns")
    public static class239[] field70;

    @ObfuscatedName("client.hb")
    public static int field726;

    @ObfuscatedName("b.c")
    public static int field75;

    @ObfuscatedName("n.r")
    public static class327 field79;

    @ObfuscatedName("e.fc")
    public static int field84;

    @ObfuscatedName("r.aa")
    public static Font field88;

    @ObfuscatedName("g.di")
    public static class257 field9;

    @ObfuscatedName("client.fb")
    public static class305 field913;

    @ObfuscatedName("client.bm")
    public static class327 field926;

    @ObfuscatedName("r.er")
    public static int field93;

    @ObfuscatedName("t.dc")
    public static class257 field97;

    @ObfuscatedName("t.n")
    public static int field99;

    @ObfuscatedName("cd.a([Lgr;IB)Lgr;")
    public static class196 method2007(class196[] arg0, int arg1) {
        class196[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class196 var4 = var2[var3];
            if (arg1 == var4.method32()) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("dz.s(II)Ljt;")
    public static class270 method2302(int arg0) {
        class270 var1 = (class270) class270.field3404.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3405.method4422(14, arg0);
        class270 var3 = new class270();
        if (var2 != null) {
            var3.method4740(new class190(var2));
        }
        class270.field3404.method3878(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bo.a(IB)Ljf;")
    public static class273 method950(int arg0) {
        class273 var1 = (class273) class273.field3425.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3420.method4422(8, arg0);
        class273 var3 = new class273();
        if (var2 != null) {
            var3.method4790(new class190(var2));
        }
        class273.field3425.method3878(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ba.a(IB)Lcs;")
    public static class92 method1883(int arg0) {
        class92 var1 = (class92) class92.field1270.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field1976.method4422(arg0, 0);
        if (var2 == null) {
            return null;
        } else {
            class92 var3 = class92.method959(var2);
            class92.field1270.method3878(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("bj.a(Lgx;I)Ljava/lang/Integer;")
    public static Integer method1585(class190 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method3443();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method3443();
                if (var4 == 255) {
                    break;
                }
                arg0.field2419--;
                if (arg0.method3610() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method3460();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("kw.g(III)Lbl;")
    public static class65 method5296(int arg0, int arg1) {
        class94 var2 = (class94) class91.field1267.get(arg0);
        return var2.method2085(arg1);
    }

    @ObfuscatedName("m.s(IIII)Lcs;")
    public static class92 method75(int arg0, int arg1, int arg2) {
        int var3 = class245.method1906(arg1, arg0);
        class92 var4 = class92.method2674(var3, arg0);
        if (var4 == null) {
            int var5 = (arg2 + 40000 << 8) + arg0;
            class92 var7 = class92.method2674(var5, arg0);
            return var7 == null ? null : var7;
        } else {
            return var4;
        }
    }

    @ObfuscatedName("dx.x(II)I")
    public static int method2511(int arg0) {
        return class128.method3094(class128.field1741[arg0]);
    }

    @ObfuscatedName("w.u(B)V")
    public static final void method258() {
        class74.method147(class246.field3165);
    }

    @ObfuscatedName("es.n([BI)V")
    public static void method3074(byte[] arg0) {
        class190 var1 = new class190(arg0);
        var1.field2419 = arg0.length - 2;
        field3906 = var1.method3610();
        field3900 = new int[field3906];
        field427 = new int[field3906];
        field3904 = new int[field3906];
        field3902 = new int[field3906];
        field2455 = new byte[field3906][];
        var1.field2419 = arg0.length - 7 - field3906 * 8;
        field3901 = var1.method3610();
        field3905 = var1.method3610();
        int var2 = (var1.method3443() & 0xFF) + 1;
        for (int var3 = 0; var3 < field3906; var3++) {
            field3900[var3] = var1.method3610();
        }
        for (int var4 = 0; var4 < field3906; var4++) {
            field427[var4] = var1.method3610();
        }
        for (int var5 = 0; var5 < field3906; var5++) {
            field3904[var5] = var1.method3610();
        }
        for (int var6 = 0; var6 < field3906; var6++) {
            field3902[var6] = var1.method3610();
        }
        var1.field2419 = arg0.length - 7 - field3906 * 8 - (var2 - 1) * 3;
        field3903 = new int[var2];
        for (int var7 = 1; var7 < var2; var7++) {
            field3903[var7] = var1.method3459();
            if (field3903[var7] == 0) {
                field3903[var7] = 1;
            }
        }
        var1.field2419 = 0;
        for (int var8 = 0; var8 < field3906; var8++) {
            int var9 = field3904[var8];
            int var10 = field3902[var8];
            int var11 = var9 * var10;
            byte[] var12 = new byte[var11];
            field2455[var8] = var12;
            int var13 = var1.method3443();
            if (var13 == 0) {
                for (int var14 = 0; var14 < var11; var14++) {
                    var12[var14] = var1.method3599();
                }
            } else if (var13 == 1) {
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var12[var9 * var16 + var15] = var1.method3599();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bn.x(Lbf;B)V")
    public static void method1063(class53 arg0) {
        if (class85.field1187) {
            while (true) {
                if (!class45.method4722()) {
                    if (class54.field497 != 1 && (field1523 || class54.field497 != 4)) {
                        break;
                    }
                    int var1 = class85.field1169 + 280;
                    if (class54.field496 >= var1 && class54.field496 <= var1 + 14 && class54.field480 >= 4 && class54.field480 <= 18) {
                        class72.method3066(0, 0);
                        break;
                    }
                    if (class54.field496 >= var1 + 15 && class54.field496 <= var1 + 80 && class54.field480 >= 4 && class54.field480 <= 18) {
                        class72.method3066(0, 1);
                        break;
                    }
                    int var2 = class85.field1169 + 390;
                    if (class54.field496 >= var2 && class54.field496 <= var2 + 14 && class54.field480 >= 4 && class54.field480 <= 18) {
                        class72.method3066(1, 0);
                        break;
                    }
                    if (class54.field496 >= var2 + 15 && class54.field496 <= var2 + 80 && class54.field480 >= 4 && class54.field480 <= 18) {
                        class72.method3066(1, 1);
                        break;
                    }
                    int var3 = class85.field1169 + 500;
                    if (class54.field496 >= var3 && class54.field496 <= var3 + 14 && class54.field480 >= 4 && class54.field480 <= 18) {
                        class72.method3066(2, 0);
                        break;
                    }
                    if (class54.field496 >= var3 + 15 && class54.field496 <= var3 + 80 && class54.field480 >= 4 && class54.field480 <= 18) {
                        class72.method3066(2, 1);
                        break;
                    }
                    int var4 = class85.field1169 + 610;
                    if (class54.field496 >= var4 && class54.field496 <= var4 + 14 && class54.field480 >= 4 && class54.field480 <= 18) {
                        class72.method3066(3, 0);
                        break;
                    }
                    if (class54.field496 >= var4 + 15 && class54.field496 <= var4 + 80 && class54.field480 >= 4 && class54.field480 <= 18) {
                        class72.method3066(3, 1);
                        break;
                    }
                    if (class54.field496 >= class85.field1169 + 708 && class54.field480 >= 4 && class54.field496 <= class85.field1169 + 708 + 50 && class54.field480 <= 20) {
                        class85.method541();
                        break;
                    }
                    if (class85.field1188 == -1) {
                        if (class85.field1153 > 0 && field1879 != null && class54.field496 >= 0 && class54.field496 <= field1879.field3882 && class54.field480 >= field348 / 2 - 50 && class54.field480 <= field348 / 2 + 50) {
                            class85.field1153--;
                        }
                        if (class85.field1153 < class85.field1154 && field926 != null && class54.field496 >= field75 - field926.field3882 - 5 && class54.field496 <= field75 && class54.field480 >= field348 / 2 - 50 && class54.field480 <= field348 / 2 + 50) {
                            class85.field1153++;
                        }
                    } else {
                        class72 var5 = field3859[class85.field1188];
                        class85.method2660(var5);
                        class85.method541();
                    }
                    break;
                }
                if (field3716 == 13) {
                    class85.method541();
                    break;
                }
                if (field3716 == 96) {
                    if (class85.field1153 > 0 && field1879 != null) {
                        class85.field1153--;
                    }
                } else if (field3716 == 97 && class85.field1153 < class85.field1154 && field926 != null) {
                    class85.field1153++;
                }
            }
            return;
        }
        if ((class54.field497 == 1 || !field1523 && class54.field497 == 4) && class54.field496 >= class85.field1169 + 765 - 50 && class54.field480 >= 453) {
            field27.field1031 = !field27.field1031;
            class73.method3157();
            if (field27.field1031) {
                class225.method3246();
            } else {
                class257 var6 = field2053;
                int var7 = var6.method4439("scape main");
                int var8 = var6.method4444(var7, "");
                class225.method540(var6, var7, var8, 255, false);
            }
        }
        if (client.field658 == 5) {
            return;
        }
        if (class85.field1191 == -1L) {
            class85.field1191 = class192.method183() + 1000L;
        }
        long var9 = class192.method183();
        boolean var12;
        if (client.field920 == null || client.field921 >= client.field920.size()) {
            var12 = true;
        } else {
            while (true) {
                if (client.field921 >= client.field920.size()) {
                    var12 = true;
                    break;
                }
                class59 var11 = (class59) client.field920.get(client.field921);
                if (!var11.method1027()) {
                    var12 = false;
                    break;
                }
                client.field921++;
            }
        }
        if (var12 && class85.field1192 == -1L) {
            class85.field1192 = var9;
            if (class85.field1192 > class85.field1191) {
                class85.field1191 = class85.field1192;
            }
        }
        class85.field1166++;
        if (client.field658 != 10 && client.field658 != 11) {
            return;
        }
        if (client.field655 == 0) {
            if (class54.field497 == 1 || !field1523 && class54.field497 == 4) {
                int var13 = class85.field1169 + 5;
                short var14 = 463;
                byte var15 = 100;
                byte var16 = 35;
                if (class54.field496 >= var13 && class54.field496 <= var13 + var15 && class54.field480 >= var14 && class54.field480 <= var14 + var16) {
                    class85.method1612();
                    return;
                }
            }
            if (field1024 != null) {
                class85.method1612();
            }
        }
        int var17 = class54.field497;
        int var18 = class54.field496;
        int var19 = class54.field480;
        if (var17 == 0) {
            var18 = class54.field488;
            var19 = class54.field489;
        }
        if (!field1523 && var17 == 4) {
            var17 = 1;
        }
        if (class85.field1174 == 0) {
            boolean var20 = false;
            while (class45.method4722()) {
                if (field3716 == 84) {
                    var20 = true;
                }
            }
            int var21 = field1177 - 80;
            short var22 = 291;
            if (var17 == 1 && var18 >= var21 - 75 && var18 <= var21 + 75 && var19 >= var22 - 20 && var19 <= var22 + 20) {
                class51.method517(client.method60("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var23 = field1177 + 80;
            if (var17 == 1 && var18 >= var23 - 75 && var18 <= var23 + 75 && var19 >= var22 - 20 && var19 <= var22 + 20 || var20) {
                if ((client.field788 & 0x2000000) != 0) {
                    class85.field1175 = "";
                    class85.field1189 = class246.field3011;
                    class85.field1149 = class246.field3106;
                    class85.field1178 = class246.field2977;
                    class85.field1174 = 1;
                    if (client.field709 && class85.field1179 != null && class85.field1179.length() > 0) {
                        class85.field1163 = 1;
                    } else {
                        class85.field1163 = 0;
                    }
                } else if ((client.field788 & 0x4) != 0) {
                    if ((client.field788 & 0x400) == 0) {
                        class85.field1189 = class246.field2905;
                        class85.field1149 = class246.field3097;
                        class85.field1178 = class246.field2961;
                    } else {
                        class85.field1189 = class246.field3102;
                        class85.field1149 = class246.field3103;
                        class85.field1178 = class246.field3104;
                    }
                    class85.field1175 = class246.field3095;
                    class85.field1174 = 1;
                    if (client.field709 && class85.field1179 != null && class85.field1179.length() > 0) {
                        class85.field1163 = 1;
                    } else {
                        class85.field1163 = 0;
                    }
                } else if ((client.field788 & 0x400) == 0) {
                    method3687(false);
                } else {
                    class85.field1189 = class246.field3099;
                    class85.field1149 = class246.field2997;
                    class85.field1178 = class246.field3093;
                    class85.field1175 = class246.field3095;
                    class85.field1174 = 1;
                    if (client.field709 && class85.field1179 != null && class85.field1179.length() > 0) {
                        class85.field1163 = 1;
                    } else {
                        class85.field1163 = 0;
                    }
                }
            }
        } else if (class85.field1174 == 1) {
            while (class45.method4722()) {
                if (field3716 == 84) {
                    method3687(false);
                } else if (field3716 == 13) {
                    class85.field1174 = 0;
                }
            }
            int var24 = field1177 - 80;
            short var25 = 321;
            if (var17 == 1 && var18 >= var24 - 75 && var18 <= var24 + 75 && var19 >= var25 - 20 && var19 <= var25 + 20) {
                method3687(false);
            }
            int var26 = field1177 + 80;
            if (var17 == 1 && var18 >= var26 - 75 && var18 <= var26 + 75 && var19 >= var25 - 20 && var19 <= var25 + 20) {
                class85.field1174 = 0;
            }
        } else if (class85.field1174 == 2) {
            short var27 = 201;
            int var65 = var27 + 52;
            if (var17 == 1 && var19 >= var65 - 12 && var19 < var65 + 2) {
                class85.field1163 = 0;
            }
            var65 += 15;
            if (var17 == 1 && var19 >= var65 - 12 && var19 < var65 + 2) {
                class85.field1163 = 1;
            }
            var65 += 15;
            short var28 = 361;
            if (field552 != null) {
                int var29 = field552.field3847 / 2;
                if (var17 == 1 && var18 >= field552.field3845 - var29 && var18 <= field552.field3845 + var29 && var19 >= var28 - 15 && var19 < var28) {
                    switch(class85.field1173) {
                        case 1:
                            class85.method2582(class246.field2959, class246.field3138, class246.field3139);
                            class85.field1174 = 5;
                            return;
                        case 2:
                            class51.method517("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var30 = field1177 - 80;
            short var31 = 321;
            if (var17 == 1 && var18 >= var30 - 75 && var18 <= var30 + 75 && var19 >= var31 - 20 && var19 <= var31 + 20) {
                class85.field1179 = class85.field1179.trim();
                if (class85.field1179.length() == 0) {
                    class85.method2582(class246.field3125, class246.field3031, class246.field3078);
                    return;
                }
                if (class85.field1180.length() == 0) {
                    class85.method2582(class246.field3000, class246.field3001, class246.field3002);
                    return;
                }
                class85.method2582(class246.field3137, class246.field3111, class246.field3112);
                client.method3174(false);
                method4729(20);
                return;
            }
            int var32 = class85.field1157 + 180 + 80;
            if (var17 == 1 && var18 >= var32 - 75 && var18 <= var32 + 75 && var19 >= var31 - 20 && var19 <= var31 + 20) {
                class85.field1174 = 0;
                class85.field1179 = "";
                class85.field1180 = "";
                field420 = 0;
                field1038 = "";
                class85.field1183 = true;
            }
            int var33 = field1177 + -117;
            short var34 = 277;
            class85.field1181 = var18 >= var33 && var18 < field3196 + var33 && var19 >= var34 && var19 < field188 + var34;
            if (var17 == 1 && class85.field1181) {
                client.field709 = !client.field709;
                if (!client.field709 && field27.field1028 != null) {
                    field27.field1028 = null;
                    class73.method3157();
                }
            }
            int var35 = field1177 + 24;
            short var36 = 277;
            class85.field1182 = var18 >= var35 && var18 < field3196 + var35 && var19 >= var36 && var19 < field188 + var36;
            if (var17 == 1 && class85.field1182) {
                field27.field1034 = !field27.field1034;
                if (!field27.field1034) {
                    class85.field1179 = "";
                    field27.field1028 = null;
                    if (client.field709 && class85.field1179 != null && class85.field1179.length() > 0) {
                        class85.field1163 = 1;
                    } else {
                        class85.field1163 = 0;
                    }
                }
                class73.method3157();
            }
            while (true) {
                while (class45.method4722()) {
                    boolean var37 = false;
                    for (int var38 = 0; var38 < class85.field1185.length(); var38++) {
                        if (field280 == class85.field1185.charAt(var38)) {
                            var37 = true;
                            break;
                        }
                    }
                    if (field3716 == 13) {
                        class85.field1174 = 0;
                        class85.field1179 = "";
                        class85.field1180 = "";
                        field420 = 0;
                        field1038 = "";
                        class85.field1183 = true;
                    } else if (class85.field1163 == 0) {
                        if (field3716 == 85 && class85.field1179.length() > 0) {
                            class85.field1179 = class85.field1179.substring(0, class85.field1179.length() - 1);
                        }
                        if (field3716 == 84 || field3716 == 80) {
                            class85.field1163 = 1;
                        }
                        if (var37 && class85.field1179.length() < 320) {
                            class85.field1179 = class85.field1179 + field280;
                        }
                    } else if (class85.field1163 == 1) {
                        if (field3716 == 85 && class85.field1180.length() > 0) {
                            class85.field1180 = class85.field1180.substring(0, class85.field1180.length() - 1);
                        }
                        if (field3716 == 84 || field3716 == 80) {
                            class85.field1163 = 0;
                        }
                        if (field3716 == 84) {
                            class85.field1179 = class85.field1179.trim();
                            if (class85.field1179.length() == 0) {
                                class85.method2582(class246.field3125, class246.field3031, class246.field3078);
                                return;
                            }
                            if (class85.field1180.length() == 0) {
                                class85.method2582(class246.field3000, class246.field3001, class246.field3002);
                                return;
                            }
                            class85.method2582(class246.field3137, class246.field3111, class246.field3112);
                            client.method3174(false);
                            method4729(20);
                            return;
                        }
                        if (var37 && class85.field1180.length() < 20) {
                            class85.field1180 = class85.field1180 + field280;
                        }
                    }
                }
                return;
            }
        } else if (class85.field1174 == 3) {
            int var39 = class85.field1157 + 180;
            short var40 = 276;
            if (var17 == 1 && var18 >= var39 - 75 && var18 <= var39 + 75 && var19 >= var40 - 20 && var19 <= var40 + 20) {
                method3687(false);
            }
            int var41 = class85.field1157 + 180;
            short var42 = 326;
            if (var17 == 1 && var18 >= var41 - 75 && var18 <= var41 + 75 && var19 >= var42 - 20 && var19 <= var42 + 20) {
                class85.method2582(class246.field2959, class246.field3138, class246.field3139);
                class85.field1174 = 5;
                return;
            }
        } else if (class85.field1174 == 4) {
            int var43 = class85.field1157 + 180 - 80;
            short var44 = 321;
            if (var17 == 1 && var18 >= var43 - 75 && var18 <= var43 + 75 && var19 >= var44 - 20 && var19 <= var44 + 20) {
                field1038.trim();
                if (field1038.length() != 6) {
                    class85.method2582(class246.field2916, class246.field2917, class246.field3082);
                    return;
                }
                field420 = Integer.parseInt(field1038);
                field1038 = "";
                client.method3174(true);
                class85.method2582(class246.field3137, class246.field3111, class246.field3112);
                method4729(20);
                return;
            }
            if (var17 == 1 && var18 >= class85.field1157 + 180 - 9 && var18 <= class85.field1157 + 180 + 130 && var19 >= 263 && var19 <= 296) {
                class85.field1183 = !class85.field1183;
            }
            if (var17 == 1 && var18 >= class85.field1157 + 180 - 34 && var18 <= class85.field1157 + 180 + 34 && var19 >= 351 && var19 <= 363) {
                class51.method517(client.method60("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var45 = class85.field1157 + 180 + 80;
            if (var17 == 1 && var18 >= var45 - 75 && var18 <= var45 + 75 && var19 >= var44 - 20 && var19 <= var44 + 20) {
                class85.field1174 = 0;
                class85.field1179 = "";
                class85.field1180 = "";
                field420 = 0;
                field1038 = "";
            }
            while (class45.method4722()) {
                boolean var46 = false;
                for (int var47 = 0; var47 < class85.field1186.length(); var47++) {
                    if (field280 == class85.field1186.charAt(var47)) {
                        var46 = true;
                        break;
                    }
                }
                if (field3716 == 13) {
                    class85.field1174 = 0;
                    class85.field1179 = "";
                    class85.field1180 = "";
                    field420 = 0;
                    field1038 = "";
                } else {
                    if (field3716 == 85 && field1038.length() > 0) {
                        field1038 = field1038.substring(0, field1038.length() - 1);
                    }
                    if (field3716 == 84) {
                        field1038.trim();
                        if (field1038.length() != 6) {
                            class85.method2582(class246.field2916, class246.field2917, class246.field3082);
                            return;
                        }
                        field420 = Integer.parseInt(field1038);
                        field1038 = "";
                        client.method3174(true);
                        class85.method2582(class246.field3137, class246.field3111, class246.field3112);
                        method4729(20);
                        return;
                    }
                    if (var46 && field1038.length() < 6) {
                        field1038 = field1038 + field280;
                    }
                }
            }
        } else if (class85.field1174 == 5) {
            int var48 = class85.field1157 + 180 - 80;
            short var49 = 321;
            if (var17 == 1 && var18 >= var48 - 75 && var18 <= var48 + 75 && var19 >= var49 - 20 && var19 <= var49 + 20) {
                method4404();
                return;
            }
            int var50 = class85.field1157 + 180 + 80;
            if (var17 == 1 && var18 >= var50 - 75 && var18 <= var50 + 75 && var19 >= var49 - 20 && var19 <= var49 + 20) {
                method3687(true);
            }
            while (class45.method4722()) {
                boolean var51 = false;
                for (int var52 = 0; var52 < class85.field1185.length(); var52++) {
                    if (field280 == class85.field1185.charAt(var52)) {
                        var51 = true;
                        break;
                    }
                }
                if (field3716 == 13) {
                    method3687(true);
                } else {
                    if (field3716 == 85 && class85.field1179.length() > 0) {
                        class85.field1179 = class85.field1179.substring(0, class85.field1179.length() - 1);
                    }
                    if (field3716 == 84) {
                        method4404();
                        return;
                    }
                    if (var51 && class85.field1179.length() < 320) {
                        class85.field1179 = class85.field1179 + field280;
                    }
                }
            }
        } else if (class85.field1174 == 6) {
            while (true) {
                do {
                    if (!class45.method4722()) {
                        short var53 = 321;
                        if (var17 == 1 && var19 >= var53 - 20 && var19 <= var53 + 20) {
                            method3687(true);
                        }
                        return;
                    }
                } while (field3716 != 84 && field3716 != 13);
                method3687(true);
            }
        } else if (class85.field1174 == 7) {
            int var54 = class85.field1157 + 180 - 80;
            short var55 = 321;
            if (var17 == 1 && var18 >= var54 - 75 && var18 <= var54 + 75 && var19 >= var55 - 20 && var19 <= var55 + 20) {
                class51.method517(client.method60("secure", true) + "m=dob/set_dob.ws", true, false);
                class85.method2582(class246.field3065, class246.field3135, class246.field3101);
                class85.field1174 = 6;
                return;
            }
            int var56 = class85.field1157 + 180 + 80;
            if (var17 == 1 && var18 >= var56 - 75 && var18 <= var56 + 75 && var19 >= var55 - 20 && var19 <= var55 + 20) {
                method3687(true);
            }
        } else if (class85.field1174 == 8) {
            int var57 = class85.field1157 + 180 - 80;
            short var58 = 321;
            if (var17 == 1 && var18 >= var57 - 75 && var18 <= var57 + 75 && var19 >= var58 - 20 && var19 <= var58 + 20) {
                class51.method517("https://www.jagex.com/terms/privacy/#eight", true, false);
                class85.method2582(class246.field3065, class246.field3135, class246.field3101);
                class85.field1174 = 6;
                return;
            }
            int var59 = class85.field1157 + 180 + 80;
            if (var17 == 1 && var18 >= var59 - 75 && var18 <= var59 + 75 && var19 >= var58 - 20 && var19 <= var58 + 20) {
                method3687(true);
            }
        } else if (class85.field1174 == 12) {
            String var60 = "";
            switch(class85.field1171) {
                case 0:
                    var60 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var60 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    method3687(false);
            }
            int var61 = class85.field1157 + 180;
            short var62 = 276;
            if (var17 == 1 && var18 >= var61 - 75 && var18 <= var61 + 75 && var19 >= var62 - 20 && var19 <= var62 + 20) {
                class51.method517(var60, true, false);
                class85.method2582(class246.field3065, class246.field3135, class246.field3101);
                class85.field1174 = 6;
                return;
            }
            int var63 = class85.field1157 + 180;
            short var64 = 326;
            if (var17 == 1 && var18 >= var63 - 75 && var18 <= var63 + 75 && var19 >= var64 - 20 && var19 <= var64 + 20) {
                method3687(false);
            }
        }
    }

    @ObfuscatedName("cp.e(I)V")
    public static void method1977() {
        field3900 = null;
        field427 = null;
        field3904 = null;
        field3902 = null;
        field3903 = null;
        field2455 = (byte[][]) null;
    }

    @ObfuscatedName("gx.h(ZI)V")
    public static void method3687(boolean arg0) {
        class85.field1189 = class246.field3092;
        class85.field1149 = class246.field3132;
        class85.field1178 = class246.field2899;
        class85.field1174 = 2;
        if (arg0) {
            class85.field1180 = "";
        }
        class85.method2532();
        if (client.field709 && class85.field1179 != null && class85.field1179.length() > 0) {
            class85.field1163 = 1;
        } else {
            class85.field1163 = 0;
        }
    }

    @ObfuscatedName("er.m(ILcs;ZB)I")
    public static int method3081(int arg0, class92 arg1, boolean arg2) {
        boolean var3 = true;
        class239 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class239.method2052(class76.field1074[--field1073]);
            var3 = false;
        } else {
            var4 = arg2 ? field1036 : field1120;
        }
        if (arg0 == 1300) {
            int var5 = class76.field1074[--field1073] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4351(var5, class76.field1076[--field2439]);
                return 1;
            } else {
                field2439--;
                return 1;
            }
        } else if (arg0 == 1301) {
            field1073 -= 2;
            int var6 = class76.field1074[field1073];
            int var7 = class76.field1074[field1073 + 1];
            var4.field2771 = class239.method130(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field2785 = class76.field1074[--field1073] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field2779 = class76.field1074[--field1073];
            return 1;
        } else if (arg0 == 1304) {
            var4.field2773 = class76.field1074[--field1073];
            return 1;
        } else if (arg0 == 1305) {
            var4.field2769 = class76.field1076[--field2439];
            return 1;
        } else if (arg0 == 1306) {
            var4.field2775 = class76.field1076[--field2439];
            return 1;
        } else if (arg0 == 1307) {
            var4.field2770 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field2832 = class76.field1074[--field1073] == 1;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                field1073 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && class76.field1074[field1073 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) class76.field1074[field1073 + var10];
                        var9[var10 / 2] = (byte) class76.field1074[field1073 + var10 + 1];
                    }
                }
            } else {
                field1073 -= 2;
                var8 = new byte[] { (byte) class76.field1074[field1073] };
                var9 = new byte[] { (byte) class76.field1074[field1073 + 1] };
            }
            int var11 = class76.field1074[--field1073] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            class76.method1880(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            field1073 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) class76.field1074[field1073] };
            byte[] var14 = new byte[] { (byte) class76.field1074[field1073 + 1] };
            class76.method1880(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            field1073 -= 3;
            int var15 = class76.field1074[field1073] - 1;
            int var16 = class76.field1074[field1073 + 1];
            int var17 = class76.field1074[field1073 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            class76.method4258(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = class76.field1074[--field1073];
            int var20 = class76.field1074[--field1073];
            class76.method4258(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            field1073--;
            int var21 = class76.field1074[field1073] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            class76.method955(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            class76.method955(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ir.f(I)V")
    public static void method4404() {
        class85.field1179 = class85.field1179.trim();
        if (class85.field1179.length() == 0) {
            class85.method2582(class246.field2959, class246.field3138, class246.field3139);
            return;
        }
        long var0 = class80.method1756();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = class85.field1179;
            Random var4 = new Random();
            class190 var5 = new class190(128);
            class190 var6 = new class190(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method3439(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method3442(var4.nextInt());
            }
            var5.method3442(var7[0]);
            var5.method3442(var7[1]);
            var5.method3444(var0);
            var5.method3444(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method3442(var4.nextInt());
            }
            var5.method3478(class80.field1110, class80.field1111);
            var6.method3439(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method3442(var4.nextInt());
            }
            var6.method3444(var4.nextLong());
            var6.method3642(var4.nextLong());
            client.method4175(var6);
            var6.method3444(var4.nextLong());
            var6.method3478(class80.field1110, class80.field1111);
            int var11 = class190.method1171(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class190 var12 = new class190(var11);
            var12.method3446(var3);
            var12.field2419 = var11;
            var12.method3474(var7);
            class190 var13 = new class190(var12.field2419 + var6.field2419 + var5.field2419 + 5);
            var13.method3439(2);
            var13.method3439(var5.field2419);
            var13.method3449(var5.field2420, 0, var5.field2419);
            var13.method3439(var6.field2419);
            var13.method3449(var6.field2420, 0, var6.field2419);
            var13.method3440(var12.field2419);
            var13.method3449(var12.field2420, 0, var12.field2419);
            String var14 = class311.method4378(var13.field2420);
            byte var21;
            try {
                URL var15 = new URL(client.method60("services", false) + "m=accountappeal/login.ws");
                URLConnection var16 = var15.openConnection();
                var16.setDoInput(true);
                var16.setDoOutput(true);
                var16.setConnectTimeout(5000);
                OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
                var17.write("data2=" + class337.method4402(var14) + "&dest=" + class337.method4402("passwordchoice.ws"));
                var17.flush();
                InputStream var18 = var16.getInputStream();
                class190 var19 = new class190(new byte[1000]);
                while (true) {
                    int var20 = var18.read(var19.field2420, var19.field2419, 1000 - var19.field2419);
                    if (var20 == -1) {
                        var17.close();
                        var18.close();
                        String var22 = new String(var19.field2420);
                        if (var22.startsWith("OFFLINE")) {
                            var21 = 4;
                        } else if (var22.startsWith("WRONG")) {
                            var21 = 7;
                        } else if (var22.startsWith("RELOAD")) {
                            var21 = 3;
                        } else if (var22.startsWith("Not permitted for social network accounts.")) {
                            var21 = 6;
                        } else {
                            var19.method3475(var7);
                            while (var19.field2419 > 0 && var19.field2420[var19.field2419 - 1] == 0) {
                                var19.field2419--;
                            }
                            String var23 = new String(var19.field2420, 0, var19.field2419);
                            if (class80.method752(var23)) {
                                class51.method517(var23, true, false);
                                var21 = 2;
                            } else {
                                var21 = 5;
                            }
                        }
                        break;
                    }
                    var19.field2419 += var20;
                    if (var19.field2419 >= 1000) {
                        var21 = 5;
                        break;
                    }
                }
            } catch (Throwable var25) {
                var25.printStackTrace();
                var21 = 5;
            }
            var2 = var21;
        }
        switch(var2) {
            case 2:
                class85.method2582(class246.field3140, class246.field3141, class246.field2902);
                class85.field1174 = 6;
                break;
            case 3:
                class85.method2582(class246.field3086, class246.field3144, class246.field3145);
                break;
            case 4:
                class85.method2582(class246.field3146, class246.field3147, class246.field3148);
                break;
            case 5:
                class85.method2582(class246.field3066, class246.field3150, class246.field2963);
                break;
            case 6:
                class85.method2582(class246.field3088, class246.field3014, class246.field2970);
                break;
            case 7:
                class85.method2582(class246.field2976, class246.field2930, class246.field3157);
        }
    }

    @ObfuscatedName("jr.fn(II)V")
    public static void method4729(int arg0) {
        if (client.field658 == arg0) {
            return;
        }
        if (client.field658 == 0) {
            field555.method800();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            client.field760 = 0;
            client.field844 = 0;
            client.field684 = 0;
            client.field774.method5046(arg0);
            if (arg0 != 20) {
                client.method3174(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && field2435 != null) {
            field2435.method3251();
            field2435 = null;
        }
        if (client.field658 == 25) {
            client.field706 = 0;
            client.field702 = 0;
            client.field703 = 1;
            client.field704 = 0;
            client.field801 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class85.method3359(field2637, field3225, true, 0);
        } else if (arg0 == 20) {
            class85.method3359(field2637, field3225, true, client.field658 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class85.method3359(field2637, field3225, false, 4);
        } else if (field1150) {
            field1975 = null;
            field1176 = null;
            field1000 = null;
            field3309 = null;
            field1152 = null;
            field1190 = null;
            field1158 = null;
            field1155 = null;
            field2535 = null;
            field358 = null;
            field1991 = null;
            field1048 = null;
            field1039 = null;
            field309 = null;
            field418 = null;
            field267 = null;
            field252 = null;
            field129 = null;
            field499 = null;
            field3197 = null;
            field1165 = null;
            field147 = null;
            class225.method3061(2);
            if (field3275 != null) {
                try {
                    class190 var1 = new class190(4);
                    var1.method3439(2);
                    var1.method3441(0);
                    field3275.method3255(var1.field2420, 0, 4);
                } catch (IOException var5) {
                    try {
                        field3275.method3251();
                    } catch (Exception var4) {
                    }
                    class258.field3295++;
                    field3275 = null;
                }
            }
            field1150 = false;
        }
        client.field658 = arg0;
    }

    @ObfuscatedName("fz.q(Llv;I)V")
    public static final void method3272(class327 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < field499.length; var2++) {
            field499[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            field499[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    field3197[var8] = (field499[var8 - 1] + field499[var8 + 1] + field499[var8 - 128] + field499[var8 + 128]) / 4;
                }
            }
            int[] var9 = field499;
            field499 = field3197;
            field3197 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3880; var11++) {
            for (int var12 = 0; var12 < arg0.field3882; var12++) {
                if (arg0.field3884[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3883;
                    int var14 = var11 + 16 + arg0.field3885;
                    int var15 = (var14 << 7) + var13;
                    field499[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("kw.fl(IZZZB)Lin;")
    public static class257 method5290(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class170 var4 = null;
        if (class163.field2049 != null) {
            var4 = new class170(arg0, class163.field2049, field593[arg0], 1000000);
        }
        return new class257(var4, field155, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("an.at(ILcs;ZI)I")
    public static int method524(int arg0, class92 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = class76.field1074[--field1073];
            class76.field1074[++field1073 - 1] = client.field917[var3].method116();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = class76.field1074[--field1073];
            class76.field1074[++field1073 - 1] = client.field917[var4].field63;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = class76.field1074[--field1073];
            class76.field1074[++field1073 - 1] = client.field917[var5].field74;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = class76.field1074[--field1073];
            class76.field1074[++field1073 - 1] = client.field917[var6].field66;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = class76.field1074[--field1073];
            class76.field1074[++field1073 - 1] = client.field917[var7].field67;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = class76.field1074[--field1073];
            class76.field1074[++field1073 - 1] = client.field917[var8].field68;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = class76.field1074[--field1073];
            int var10 = client.field917[var9].method101();
            class76.field1074[++field1073 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = class76.field1074[--field1073];
            int var12 = client.field917[var11].method101();
            class76.field1074[++field1073 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = class76.field1074[--field1073];
            int var14 = client.field917[var13].method101();
            class76.field1074[++field1073 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = class76.field1074[--field1073];
            int var16 = client.field917[var15].method101();
            class76.field1074[++field1073 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = class76.field1074[--field1073] == 1;
            if (field428 != null) {
                field428.method69(class7.field48, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = class76.field1074[--field1073] == 1;
            if (field428 != null) {
                field428.method69(class7.field41, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            field1073 -= 2;
            boolean var19 = class76.field1074[field1073] == 1;
            boolean var20 = class76.field1074[field1073 + 1] == 1;
            if (field428 != null) {
                client.field918.field642 = var20;
                field428.method69(client.field918, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = class76.field1074[--field1073] == 1;
            if (field428 != null) {
                field428.method69(class7.field40, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = class76.field1074[--field1073] == 1;
            if (field428 != null) {
                field428.method69(class7.field43, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            class76.field1074[++field1073 - 1] = field428 == null ? 0 : field428.field42.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = class76.field1074[--field1073];
            class8 var24 = (class8) field428.field42.get(var23);
            class76.field1074[++field1073 - 1] = var24.field56;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = class76.field1074[--field1073];
            class8 var26 = (class8) field428.field42.get(var25);
            class76.field1076[++field2439 - 1] = var26.method76();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = class76.field1074[--field1073];
            class8 var28 = (class8) field428.field42.get(var27);
            class76.field1076[++field2439 - 1] = var28.method77();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = class76.field1074[--field1073];
            class8 var30 = (class8) field428.field42.get(var29);
            long var31 = class192.method183() - field3615 - var30.field50;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            class76.field1076[++field2439 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = class76.field1074[--field1073];
            class8 var38 = (class8) field428.field42.get(var37);
            class76.field1074[++field1073 - 1] = var38.field51.field66;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = class76.field1074[--field1073];
            class8 var40 = (class8) field428.field42.get(var39);
            class76.field1074[++field1073 - 1] = var40.field51.field74;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = class76.field1074[--field1073];
            class8 var42 = (class8) field428.field42.get(var41);
            class76.field1074[++field1073 - 1] = var42.field51.field63;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gy.gq(Lbq;I)V")
    public static final void method3424(class70 arg0) {
        if (client.field660 == arg0.field987 || arg0.field939 == -1 || arg0.field975 != 0 || arg0.field974 + 1 > class280.method3173(arg0.field939).field3622[arg0.field973]) {
            int var1 = arg0.field987 - arg0.field986;
            int var2 = client.field660 - arg0.field986;
            int var3 = arg0.field982 * 128 + arg0.field943 * 64;
            int var4 = arg0.field984 * 128 + arg0.field943 * 64;
            int var5 = arg0.field944 * 128 + arg0.field943 * 64;
            int var6 = arg0.field985 * 128 + arg0.field943 * 64;
            arg0.field948 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field949 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field998 = 0;
        arg0.field991 = arg0.field988;
        arg0.field990 = arg0.field991;
    }

    @ObfuscatedName("ax.ge(IIIIS)V")
    public static final void method716(int arg0, int arg1, int arg2, int arg3) {
        client.field908++;
        if (field187.field948 >> 7 == client.field880 && field187.field949 >> 7 == client.field881) {
            client.field880 = 0;
        }
        if (client.field769) {
            client.method3352(field187, false);
        }
        if (client.field777 >= 0 && client.field766[client.field777] != null) {
            client.method3352(client.field766[client.field777], false);
        }
        client.method65(true);
        client.method243();
        client.method65(false);
        client.method1022();
        for (class77 var4 = (class77) client.field781.method3990(); var4 != null; var4 = (class77) client.field781.method3984()) {
            if (field2219 != var4.field1093 || var4.field1094) {
                var4.method3960();
            } else if (client.field660 >= var4.field1086) {
                var4.method1881(client.field711);
                if (var4.field1094) {
                    var4.method3960();
                } else {
                    field28.method3011(var4.field1093, var4.field1088, var4.field1085, var4.field1090, 60, var4, 0, -1L, false);
                }
            }
        }
        client.method4582(arg0, arg1, arg2, arg3, true);
        int var5 = client.field699;
        int var6 = client.field874;
        int var7 = client.field910;
        int var8 = client.field651;
        class324.method5543(var5, var6, var5 + var7, var6 + var8);
        class130.method2789();
        if (!client.field894) {
            int var9 = client.field718;
            if (client.field736 / 256 > var9) {
                var9 = client.field736 / 256;
            }
            if (client.field895[4] && client.field897[4] + 128 > var9) {
                var9 = client.field897[4] + 128;
            }
            int var10 = client.field719 & 0x7FF;
            int var11 = field726;
            int var12 = field2539;
            int var13 = field136;
            int var16 = var9 * 3 + 600;
            client.method710(var11, var12, var13, var9, var10, var16, var8);
        }
        int var29;
        if (client.field894) {
            int var30;
            if (field27.field1030) {
                var30 = field2219;
            } else {
                int var31 = client.method3376(field350, field3753, field2219);
                if (var31 - field436 >= 800 || (class56.field506[field2219][field350 >> 7][field3753 >> 7] & 0x4) == 0) {
                    var30 = 3;
                } else {
                    var30 = field2219;
                }
            }
            var29 = var30;
        } else {
            int var17;
            if (field27.field1030) {
                var17 = field2219;
            } else {
                label488: {
                    int var18 = 3;
                    if (field2364 < 310) {
                        int var19;
                        int var20;
                        if (client.field724 == 1) {
                            var19 = field726 >> 7;
                            var20 = field136 >> 7;
                        } else {
                            var19 = field187.field948 >> 7;
                            var20 = field187.field949 >> 7;
                        }
                        int var21 = field350 >> 7;
                        int var22 = field3753 >> 7;
                        if (var21 < 0 || var22 < 0 || var21 >= 104 || var22 >= 104) {
                            var17 = field2219;
                            break label488;
                        }
                        if (var19 < 0 || var20 < 0 || var19 >= 104 || var20 >= 104) {
                            var17 = field2219;
                            break label488;
                        }
                        if ((class56.field506[field2219][var21][var22] & 0x4) != 0) {
                            var18 = field2219;
                        }
                        int var23;
                        if (var19 > var21) {
                            var23 = var19 - var21;
                        } else {
                            var23 = var21 - var19;
                        }
                        int var24;
                        if (var20 > var22) {
                            var24 = var20 - var22;
                        } else {
                            var24 = var22 - var20;
                        }
                        if (var23 > var24) {
                            int var25 = var24 * 65536 / var23;
                            int var26 = 32768;
                            while (var19 != var21) {
                                if (var21 < var19) {
                                    var21++;
                                } else if (var21 > var19) {
                                    var21--;
                                }
                                if ((class56.field506[field2219][var21][var22] & 0x4) != 0) {
                                    var18 = field2219;
                                }
                                var26 += var25;
                                if (var26 >= 65536) {
                                    var26 -= 65536;
                                    if (var22 < var20) {
                                        var22++;
                                    } else if (var22 > var20) {
                                        var22--;
                                    }
                                    if ((class56.field506[field2219][var21][var22] & 0x4) != 0) {
                                        var18 = field2219;
                                    }
                                }
                            }
                        } else if (var24 > 0) {
                            int var27 = var23 * 65536 / var24;
                            int var28 = 32768;
                            while (var20 != var22) {
                                if (var22 < var20) {
                                    var22++;
                                } else if (var22 > var20) {
                                    var22--;
                                }
                                if ((class56.field506[field2219][var21][var22] & 0x4) != 0) {
                                    var18 = field2219;
                                }
                                var28 += var27;
                                if (var28 >= 65536) {
                                    var28 -= 65536;
                                    if (var21 < var19) {
                                        var21++;
                                    } else if (var21 > var19) {
                                        var21--;
                                    }
                                    if ((class56.field506[field2219][var21][var22] & 0x4) != 0) {
                                        var18 = field2219;
                                    }
                                }
                            }
                        }
                    }
                    if (field187.field948 >= 0 && field187.field949 >= 0 && field187.field948 < 13312 && field187.field949 < 13312) {
                        if ((class56.field506[field2219][field187.field948 >> 7][field187.field949 >> 7] & 0x4) != 0) {
                            var18 = field2219;
                        }
                        var17 = var18;
                    } else {
                        var17 = field2219;
                    }
                }
            }
            var29 = var17;
        }
        int var32 = field350;
        int var33 = field436;
        int var34 = field3753;
        int var35 = field2364;
        int var36 = field544;
        for (int var37 = 0; var37 < 5; var37++) {
            if (client.field895[var37]) {
                int var38 = (int) (Math.random() * (double) (client.field896[var37] * 2 + 1) - (double) client.field896[var37] + Math.sin((double) client.field898[var37] / 100.0D * (double) client.field762[var37]) * (double) client.field897[var37]);
                if (var37 == 0) {
                    field350 += var38;
                }
                if (var37 == 1) {
                    field436 += var38;
                }
                if (var37 == 2) {
                    field3753 += var38;
                }
                if (var37 == 3) {
                    field544 = field544 + var38 & 0x7FF;
                }
                if (var37 == 4) {
                    field2364 += var38;
                    if (field2364 < 128) {
                        field2364 = 128;
                    }
                    if (field2364 > 383) {
                        field2364 = 383;
                    }
                }
            }
        }
        int var39 = class54.field488;
        int var40 = class54.field489;
        if (class54.field497 != 0) {
            var39 = class54.field496;
            var40 = class54.field480;
        }
        if (var39 >= var5 && var39 < var5 + var7 && var40 >= var6 && var40 < var6 + var8) {
            int var41 = var39 - var5;
            int var42 = var40 - var6;
            class128.field1731 = var41;
            class128.field1733 = var42;
            class128.field1746 = true;
            class128.field1738 = 0;
            class128.field1734 = false;
        } else {
            class128.field1746 = false;
            class128.field1738 = 0;
        }
        client.method5295();
        class324.method5551(var5, var6, var7, var8, 0);
        client.method5295();
        int var43 = class130.field1765;
        class130.field1765 = client.field912;
        field28.method2961(field350, field436, field3753, field2364, field544, var29);
        class130.field1765 = var43;
        client.method5295();
        field28.method2892();
        client.field737 = 0;
        boolean var44 = false;
        int var45 = -1;
        int var46 = -1;
        int var47 = class89.field1247;
        int[] var48 = class89.field1244;
        for (int var49 = 0; var49 < client.field691 + var47; var49++) {
            class70 var50;
            if (var49 < var47) {
                var50 = client.field766[var48[var49]];
                if (client.field777 == var48[var49]) {
                    var44 = true;
                    var45 = var49;
                    continue;
                }
                if (field187 == var50) {
                    var46 = var49;
                    continue;
                }
            } else {
                var50 = client.field693[client.field692[var49 - var47]];
            }
            client.method3132(var50, var49, var5, var6, var7, var8);
        }
        if (client.field769 && var46 != -1) {
            client.method3132(field187, var46, var5, var6, var7, var8);
        }
        if (var44) {
            client.method3132(client.field766[client.field777], var45, var5, var6, var7, var8);
        }
        for (int var51 = 0; var51 < client.field737; var51++) {
            int var52 = client.field739[var51];
            int var53 = client.field740[var51];
            int var54 = client.field870[var51];
            int var55 = client.field741[var51];
            boolean var56 = true;
            while (var56) {
                var56 = false;
                for (int var57 = 0; var57 < var51; var57++) {
                    if (var53 + 2 > client.field740[var57] - client.field741[var57] && var53 - var55 < client.field740[var57] + 2 && var52 - var54 < client.field870[var57] + client.field739[var57] && var52 + var54 > client.field739[var57] - client.field870[var57] && client.field740[var57] - client.field741[var57] < var53) {
                        var53 = client.field740[var57] - client.field741[var57];
                        var56 = true;
                    }
                }
            }
            client.field749 = client.field739[var51];
            client.field750 = client.field740[var51] = var53;
            String var58 = client.field746[var51];
            if (client.field814 == 0) {
                int var59 = 16776960;
                if (client.field743[var51] < 6) {
                    var59 = client.field714[client.field743[var51]];
                }
                if (client.field743[var51] == 6) {
                    var59 = client.field908 % 20 < 10 ? 16711680 : 16776960;
                }
                if (client.field743[var51] == 7) {
                    var59 = client.field908 % 20 < 10 ? 255 : 65535;
                }
                if (client.field743[var51] == 8) {
                    var59 = client.field908 % 20 < 10 ? 45056 : 8454016;
                }
                if (client.field743[var51] == 9) {
                    int var60 = 150 - client.field745[var51];
                    if (var60 < 50) {
                        var59 = var60 * 1280 + 16711680;
                    } else if (var60 < 100) {
                        var59 = 16776960 - (var60 - 50) * 327680;
                    } else if (var60 < 150) {
                        var59 = (var60 - 100) * 5 + 65280;
                    }
                }
                if (client.field743[var51] == 10) {
                    int var61 = 150 - client.field745[var51];
                    if (var61 < 50) {
                        var59 = var61 * 5 + 16711680;
                    } else if (var61 < 100) {
                        var59 = 16711935 - (var61 - 50) * 327680;
                    } else if (var61 < 150) {
                        var59 = (var61 - 100) * 327680 + 255 - (var61 - 100) * 5;
                    }
                }
                if (client.field743[var51] == 11) {
                    int var62 = 150 - client.field745[var51];
                    if (var62 < 50) {
                        var59 = 16777215 - var62 * 327685;
                    } else if (var62 < 100) {
                        var59 = (var62 - 50) * 327685 + 65280;
                    } else if (var62 < 150) {
                        var59 = 16777215 - (var62 - 100) * 327680;
                    }
                }
                if (client.field744[var51] == 0) {
                    field501.method5373(var58, client.field749 + var5, client.field750 + var6, var59, 0);
                }
                if (client.field744[var51] == 1) {
                    field501.method5324(var58, client.field749 + var5, client.field750 + var6, var59, 0, client.field908);
                }
                if (client.field744[var51] == 2) {
                    field501.method5325(var58, client.field749 + var5, client.field750 + var6, var59, 0, client.field908);
                }
                if (client.field744[var51] == 3) {
                    field501.method5326(var58, client.field749 + var5, client.field750 + var6, var59, 0, client.field908, 150 - client.field745[var51]);
                }
                if (client.field744[var51] == 4) {
                    int var63 = (150 - client.field745[var51]) * (field501.method5314(var58) + 100) / 150;
                    class324.method5544(client.field749 + var5 - 50, var6, client.field749 + var5 + 50, var6 + var8);
                    field501.method5319(var58, client.field749 + var5 + 50 - var63, client.field750 + var6, var59, 0);
                    class324.method5543(var5, var6, var5 + var7, var6 + var8);
                }
                if (client.field744[var51] == 5) {
                    int var64 = 150 - client.field745[var51];
                    int var65 = 0;
                    if (var64 < 25) {
                        var65 = var64 - 25;
                    } else if (var64 > 125) {
                        var65 = var64 - 125;
                    }
                    class324.method5544(var5, client.field750 + var6 - field501.field3780 - 1, var5 + var7, client.field750 + var6 + 5);
                    field501.method5373(var58, client.field749 + var5, client.field750 + var6 + var65, var59, 0);
                    class324.method5543(var5, var6, var5 + var7, var6 + var8);
                }
            } else {
                field501.method5373(var58, client.field749 + var5, client.field750 + var6, 16776960, 0);
            }
        }
        client.method4231(var5, var6);
        ((class119) field1756).method2568(client.field711);
        client.method1678(var5, var6, var7, var8);
        field350 = var32;
        field436 = var33;
        field3753 = var34;
        field2364 = var35;
        field544 = var36;
        if (client.field664) {
            byte var66 = 0;
            int var67 = class258.field3281 + class258.field3279 + var66;
            if (var67 == 0) {
                client.field664 = false;
            }
        }
        if (client.field664) {
            class324.method5551(var5, var6, var7, var8, 0);
            client.method2043(class246.field2888, false);
        }
    }

    @ObfuscatedName("ej.gs(Lbw;I)Z")
    public static boolean method3113(class67 arg0) {
        if (client.field690 == 0) {
            return false;
        } else if (field187 == arg0) {
            return (client.field690 & 0x8) != 0;
        } else {
            boolean var1 = (client.field690 & 0x4) != 0;
            boolean var2 = var1;
            if (!var1) {
                boolean var3 = (client.field690 & 0x1) != 0;
                var2 = var3 && arg0.method1113();
            }
            return var2 || client.method516() && arg0.method1136();
        }
    }

    @ObfuscatedName("e.ho(ZLge;I)V")
    public static final void method139(boolean arg0, class197 arg1) {
        client.field839 = arg0;
        if (!client.field839) {
            int var2 = arg1.method3650();
            int var3 = arg1.method3494();
            int var4 = arg1.method3610();
            field1256 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    field1256[var5][var6] = arg1.method3460();
                }
            }
            field2121 = new int[var4];
            field282 = new int[var4];
            field33 = new int[var4];
            field3641 = new byte[var4][];
            field1933 = new byte[var4][];
            boolean var7 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                var7 = true;
            }
            if (var3 / 8 == 48 && var2 / 8 == 148) {
                var7 = true;
            }
            int var8 = 0;
            for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        field2121[var8] = var11;
                        field282[var8] = field538.method4439("m" + var9 + "_" + var10);
                        field33[var8] = field538.method4439("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            client.method2877(var3, var2, true);
            return;
        }
        int var12 = arg1.method3494();
        int var13 = arg1.method3650();
        boolean var14 = arg1.method3443() == 1;
        int var15 = arg1.method3610();
        arg1.method3744();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3733(1);
                    if (var19 == 1) {
                        client.field869[var16][var17][var18] = arg1.method3733(26);
                    } else {
                        client.field869[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3752();
        field1256 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                field1256[var20][var21] = arg1.method3460();
            }
        }
        field2121 = new int[var15];
        field282 = new int[var15];
        field33 = new int[var15];
        field3641 = new byte[var15][];
        field1933 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = client.field869[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (field2121[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            field2121[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            field282[var22] = field538.method4439("m" + var31 + "_" + var32);
                            field33[var22] = field538.method4439("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        client.method2877(var13, var12, !var14);
    }

    @ObfuscatedName("av.lt(IIIZI)V")
    public static void method576(int arg0, int arg1, int arg2, boolean arg3) {
        class180 var4 = class180.method625(class177.field2281, client.field695.field1308);
        var4.field2350.method3500(arg3 ? client.field732 : 0);
        var4.field2350.method3490(arg1);
        var4.field2350.method3601(arg2);
        var4.field2350.method3440(arg0);
        client.field695.method2097(var4);
    }
}
