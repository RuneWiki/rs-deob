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
import java.net.Socket;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("client.fw")
    public static byte[][] field1140;

    @ObfuscatedName("client.qq")
    public static class79 field1142;

    @ObfuscatedName("t.x")
    public static int field12;

    @ObfuscatedName("bd.qu")
    public static class338 field1218;

    @ObfuscatedName("bg.be")
    public static class331[] field1226;

    @ObfuscatedName("bg.h")
    public static class78[] field1227;

    @ObfuscatedName("cd.rq")
    public static class335 field1244;

    @ObfuscatedName("cd.ra")
    public static short[] field1249;

    @ObfuscatedName("cl.d")
    public static String[] field1279;

    @ObfuscatedName("cl.t")
    public static int[] field1280;

    @ObfuscatedName("cl.n")
    public static class243 field1286;

    @ObfuscatedName("cl.rl")
    public static int field1288;

    @ObfuscatedName("cg.a")
    public static class236 field1301;

    @ObfuscatedName("cb.mc")
    public static int field1311;

    @ObfuscatedName("cv.f")
    public static String field1318;

    @ObfuscatedName("cv.as")
    public static int field1319;

    @ObfuscatedName("cu.u")
    public static int field1331;

    @ObfuscatedName("cm.g")
    public static String field1345;

    @ObfuscatedName("ci.r")
    public static int field1349;

    @ObfuscatedName("ci.u")
    public static int[][] field1355;

    @ObfuscatedName("ci.n")
    public static int[] field1357;

    @ObfuscatedName("cx.mu")
    public static class169 field1361;

    @ObfuscatedName("cx.h")
    public static class331[] field1362;

    @ObfuscatedName("cx.x")
    public static class331 field1364;

    @ObfuscatedName("cx.z")
    public static class332 field1382;

    @ObfuscatedName("cx.o")
    public static boolean field1388;

    @ObfuscatedName("cx.d")
    public static class331 field1389;

    @ObfuscatedName("cx.a")
    public static class331 field1394;

    @ObfuscatedName("cs.kv")
    public static class88 field1422;

    @ObfuscatedName("cs.dt")
    public static String field1423;

    @ObfuscatedName("cc.cw")
    public static int field1425;

    @ObfuscatedName("ca.cr")
    public static class264 field1442;

    @ObfuscatedName("cy.u")
    public static int[] field1450;

    @ObfuscatedName("cy.do")
    public static class264 field1455;

    @ObfuscatedName("cr.ji")
    public static int field1456;

    @ObfuscatedName("ct.y")
    public static class262 field1472;

    @ObfuscatedName("co.ac")
    public static FontMetrics field1480;

    @ObfuscatedName("dx.x")
    public static int field1511;

    @ObfuscatedName("dx.z")
    public static byte[] field1517;

    @ObfuscatedName("dx.v")
    public static int[] field1518;

    @ObfuscatedName("dx.p")
    public static float[] field1520;

    @ObfuscatedName("dx.y")
    public static int field1521;

    @ObfuscatedName("dx.w")
    public static class107[] field1523;

    @ObfuscatedName("dx.c")
    public static float[] field1524;

    @ObfuscatedName("dx.l")
    public static class119[] field1525;

    @ObfuscatedName("dx.a")
    public static class103[] field1526;

    @ObfuscatedName("dx.u")
    public static int field1527;

    @ObfuscatedName("dx.f")
    public static float[] field1533;

    @ObfuscatedName("dx.i")
    public static int field1534;

    @ObfuscatedName("dx.e")
    public static float[] field1535;

    @ObfuscatedName("dx.n")
    public static class114[] field1536;

    @ObfuscatedName("dx.ab")
    public static float[] field1537;

    @ObfuscatedName("dx.ap")
    public static float[] field1538;

    @ObfuscatedName("dx.ag")
    public static float[] field1539;

    @ObfuscatedName("dx.at")
    public static int[] field1540;

    @ObfuscatedName("dx.ac")
    public static int[] field1541;

    @ObfuscatedName("dx.s")
    public static boolean[] field1543;

    @ObfuscatedName("dc.a")
    public static boolean[] field1550;

    @ObfuscatedName("dc.x")
    public static int[] field1555;

    @ObfuscatedName("dc.y")
    public static int[] field1560;

    @ObfuscatedName("df.w")
    public static class102 field1565;

    @ObfuscatedName("df.m")
    public static boolean field1567;

    @ObfuscatedName("df.h")
    public static int field1582;

    @ObfuscatedName("df.u")
    public static int field1584;

    @ObfuscatedName("df.ac")
    public static int[] field1586;

    @ObfuscatedName("dm.at")
    public static Font field1601;

    @ObfuscatedName("de.lg")
    public static int field1608;

    @ObfuscatedName("dq.q")
    public static String[] field1628;

    @ObfuscatedName("dq.x")
    public static int field1630;

    @ObfuscatedName("dh.u")
    public static int field1654;

    @ObfuscatedName("dh.i")
    public static float field1655;

    @ObfuscatedName("t.iz")
    public static int field17;

    @ObfuscatedName("dn.fy")
    public static class331[] field1799;

    @ObfuscatedName("t.ie")
    public static class243 field18;

    @ObfuscatedName("dz.l")
    public static int[] field1814;

    @ObfuscatedName("ei.bu")
    public static int field1871;

    @ObfuscatedName("ei.br")
    public static int field1908;

    @ObfuscatedName("ei.bk")
    public static int field1909;

    @ObfuscatedName("ep.h")
    public static int field1920;

    @ObfuscatedName("ep.bl")
    public static class258 field1921;

    @ObfuscatedName("ep.m")
    public static int field1924;

    @ObfuscatedName("ep.z")
    public static int field1925;

    @ObfuscatedName("ep.i")
    public static int field1926;

    @ObfuscatedName("ep.a")
    public static int field1927;

    @ObfuscatedName("ea.z")
    public static int field1932;

    @ObfuscatedName("ez.s")
    public static int field1938;

    @ObfuscatedName("ez.l")
    public static int field1941;

    @ObfuscatedName("ez.w")
    public static int field1949;

    @ObfuscatedName("ez.f")
    public static class144 field1950;

    @ObfuscatedName("ez.n")
    public static int field1951;

    @ObfuscatedName("ez.v")
    public static int field1954;

    @ObfuscatedName("ez.q")
    public static int field1955;

    @ObfuscatedName("ez.r")
    public static int field1956;

    @ObfuscatedName("ez.j")
    public static int field1957;

    @ObfuscatedName("en.w")
    public static class111 field1966;

    @ObfuscatedName("en.em")
    public static class311 field1972;

    @ObfuscatedName("en.mv")
    public static class95 field1973;

    @ObfuscatedName("eo.j")
    public static class195 field1980;

    @ObfuscatedName("el.b")
    public static int field1991;

    @ObfuscatedName("el.g")
    public static int field1996;

    @ObfuscatedName("el.bs")
    public static int field1997;

    @ObfuscatedName("el.v")
    public static int field1998;

    @ObfuscatedName("el.q")
    public static int field1999;

    @ObfuscatedName("el.bn")
    public static int field2000;

    @ObfuscatedName("el.f")
    public static int field2004;

    @ObfuscatedName("el.p")
    public static int field2005;

    @ObfuscatedName("el.e")
    public static int field2006;

    @ObfuscatedName("el.ab")
    public static int field2008;

    @ObfuscatedName("el.ap")
    public static int field2009;

    @ObfuscatedName("el.ag")
    public static int field2010;

    @ObfuscatedName("el.at")
    public static int field2011;

    @ObfuscatedName("el.r")
    public static int field2017;

    @ObfuscatedName("el.j")
    public static int field2018;

    @ObfuscatedName("el.bp")
    public static boolean[][] field2023;

    @ObfuscatedName("el.c")
    public static int field2029;

    @ObfuscatedName("el.bu")
    public static int field2040;

    @ObfuscatedName("el.bk")
    public static int field2042;

    @ObfuscatedName("el.br")
    public static int field2043;

    @ObfuscatedName("el.bj")
    public static int field2044;

    @ObfuscatedName("ex.ev")
    public static int field2048;

    @ObfuscatedName("ex.o")
    public static long field2049;

    @ObfuscatedName("ex.dy")
    public static int field2050;

    @ObfuscatedName("ed.pb")
    public static int field2052;

    @ObfuscatedName("em.x")
    public static class149 field2069;

    @ObfuscatedName("em.en")
    public static class170 field2070;

    @ObfuscatedName("ef.y")
    public static class331 field2075;

    @ObfuscatedName("eb.gf")
    public static int field2122;

    @ObfuscatedName("eq.ep")
    public static long field2127;

    @ObfuscatedName("eq.ky")
    public static int field2129;

    @ObfuscatedName("eq.n")
    public static class173 field2131;

    @ObfuscatedName("ev.x")
    public static short[][] field2136;

    @ObfuscatedName("ev.i")
    public static class262 field2137;

    @ObfuscatedName("ev.ic")
    public static class243 field2138;

    @ObfuscatedName("ee.cj")
    public static class264 field2147;

    @ObfuscatedName("eh.ft")
    public static int[][] field2153;

    @ObfuscatedName("eu.z")
    public static boolean[] field2158;

    @ObfuscatedName("eg.pm")
    public static class108 field2162;

    @ObfuscatedName("eg.t")
    public static int field2163;

    @ObfuscatedName("fc.t")
    public static class262 field2168;

    @ObfuscatedName("fg.i")
    public static boolean field2177;

    @ObfuscatedName("fn.k")
    public static String field2195;

    @ObfuscatedName("fn.d")
    public static int field2197;

    @ObfuscatedName("fn.o")
    public static Applet field2199;

    @ObfuscatedName("fe.k")
    public static String field2210;

    @ObfuscatedName("fe.o")
    public static String field2215;

    @ObfuscatedName("fe.pv")
    public static int field2218;

    @ObfuscatedName("fe.w")
    public static class243 field2219;

    @ObfuscatedName("fi.bq")
    public static class331 field2224;

    @ObfuscatedName("fi.d")
    public static File field2228;

    @ObfuscatedName("fd.gx")
    public static int field2229;

    @ObfuscatedName("fh.k")
    public static File field2234;

    @ObfuscatedName("fk.h")
    public static int field2284;

    @ObfuscatedName("fk.m")
    public static int field2290;

    @ObfuscatedName("d.cs")
    public static class170 field23;

    @ObfuscatedName("z.gm")
    public static class7[] field230;

    @ObfuscatedName("z.pg")
    public static int field231;

    @ObfuscatedName("i.kf")
    public static class243 field235;

    @ObfuscatedName("i.fh")
    public static class332 field238;

    @ObfuscatedName("u.of")
    public static class332 field240;

    @ObfuscatedName("u.u")
    public static short[] field247;

    @ObfuscatedName("u.pl")
    public static int field249;

    @ObfuscatedName("gj.y")
    public static int[] field2497;

    @ObfuscatedName("d.fs")
    public static class331[] field25;

    @ObfuscatedName("x.om")
    public static boolean field250;

    @ObfuscatedName("gq.m")
    public static class262 field2512;

    @ObfuscatedName("gk.at")
    public static int[] field2514;

    @ObfuscatedName("gm.bs")
    public static class336 field2519;

    @ObfuscatedName("x.ix")
    public static int field252;

    @ObfuscatedName("gm.l")
    public static int[][][] field2521;

    @ObfuscatedName("go.dc")
    public static class264 field2531;

    @ObfuscatedName("gr.df")
    public static class264 field2533;

    @ObfuscatedName("x.s")
    public static int field254;

    @ObfuscatedName("gu.z")
    public static int[] field2585;

    @ObfuscatedName("gn.k")
    public static long field2588;

    @ObfuscatedName("h.ru")
    public static class266 field26;

    @ObfuscatedName("y.kn")
    public static class243 field260;

    @ObfuscatedName("gs.cz")
    public static class264 field2606;

    @ObfuscatedName("ge.aj")
    public static int field2617;

    @ObfuscatedName("hq.dr")
    public static int field2687;

    @ObfuscatedName("hf.o")
    public static class262 field2689;

    @ObfuscatedName("hf.t")
    public static class262 field2690;

    @ObfuscatedName("hf.d")
    public static class231 field2691;

    @ObfuscatedName("hf.k")
    public static class262 field2692;

    @ObfuscatedName("hf.y")
    public static boolean field2693;

    @ObfuscatedName("hf.m")
    public static Thread field2694;

    @ObfuscatedName("a.ib")
    public static int field270;

    @ObfuscatedName("a.t")
    public static long field271;

    @ObfuscatedName("a.fq")
    public static class332[] field274;

    @ObfuscatedName("iw.kp")
    public static int field2769;

    @ObfuscatedName("a.bj")
    public static class331[] field277;

    @ObfuscatedName("w.i")
    public static int field278;

    @ObfuscatedName("if.bo")
    public static class331[] field2781;

    @ObfuscatedName("ic.i")
    public static short[][] field2792;

    @ObfuscatedName("ic.z")
    public static short[] field2795;

    @ObfuscatedName("ic.an")
    public static boolean field2799;

    @ObfuscatedName("w.r")
    public static int field280;

    @ObfuscatedName("it.h")
    public static File field2808;

    @ObfuscatedName("in.x")
    public static class262 field2816;

    @ObfuscatedName("n.i")
    public static int field285;

    @ObfuscatedName("n.ag")
    public static int[] field288;

    @ObfuscatedName("im.dw")
    public static int field2961;

    @ObfuscatedName("im.id")
    public static class124 field2962;

    @ObfuscatedName("iu.jo")
    public static int field2976;

    @ObfuscatedName("l.cx")
    public static class166 field298;

    @ObfuscatedName("iv.w")
    public static class331 field2980;

    @ObfuscatedName("l.e")
    public static int[] field299;

    @ObfuscatedName("l.mb")
    public static int field301;

    @ObfuscatedName("ia.fk")
    public static class332[] field3014;

    @ObfuscatedName("l.ee")
    public static int field302;

    @ObfuscatedName("ig.v")
    public static int field3023;

    @ObfuscatedName("s.pr")
    public static int field303;

    @ObfuscatedName("s.aq")
    public static Image field305;

    @ObfuscatedName("s.o")
    public static class262 field306;

    @ObfuscatedName("v.gr")
    public static int field318;

    @ObfuscatedName("r.fv")
    public static class331[] field322;

    @ObfuscatedName("r.cp")
    public static class264 field324;

    @ObfuscatedName("r.e")
    public static int[] field326;

    @ObfuscatedName("j.rv")
    public static class175 field330;

    @ObfuscatedName("j.fb")
    public static class332[] field331;

    @ObfuscatedName("ib.a")
    public static int[] field3315;

    @ObfuscatedName("ih.pn")
    public static int field3332;

    @ObfuscatedName("ih.fj")
    public static class138 field3341;

    @ObfuscatedName("b.y")
    public static int field337;

    @ObfuscatedName("iq.h")
    public static int[] field3372;

    @ObfuscatedName("b.et")
    public static class312 field338;

    @ObfuscatedName("jv.t")
    public static class331 field3399;

    @ObfuscatedName("b.v")
    public static class49 field340;

    @ObfuscatedName("jv.w")
    public static int field3400;

    @ObfuscatedName("jv.ae")
    public static GarbageCollectorMXBean field3403;

    @ObfuscatedName("ju.w")
    public static boolean field3420;

    @ObfuscatedName("ju.o")
    public static class170 field3425;

    @ObfuscatedName("b.go")
    public static int field343;

    @ObfuscatedName("jh.bp")
    public static class259 field3436;

    @ObfuscatedName("g.g")
    public static int[] field345;

    @ObfuscatedName("jb.o")
    public static class262 field3450;

    @ObfuscatedName("js.o")
    public static class262 field3451;

    @ObfuscatedName("jw.k")
    public static class270[] field3455;

    @ObfuscatedName("jw.o")
    public static class262 field3462;

    @ObfuscatedName("jm.o")
    public static class262 field3477;

    @ObfuscatedName("g.f")
    public static int[] field348;

    @ObfuscatedName("jq.o")
    public static class262 field3482;

    @ObfuscatedName("jg.o")
    public static class262 field3485;

    @ObfuscatedName("jg.k")
    public static class262 field3499;

    @ObfuscatedName("je.o")
    public static class262 field3504;

    @ObfuscatedName("je.e")
    public static int field3509;

    @ObfuscatedName("jk.o")
    public static class262 field3512;

    @ObfuscatedName("jk.k")
    public static class262 field3517;

    @ObfuscatedName("jk.t")
    public static int field3520;

    @ObfuscatedName("jj.k")
    public static class262 field3529;

    @ObfuscatedName("jj.o")
    public static class262 field3533;

    @ObfuscatedName("jt.u")
    public static int field3539;

    @ObfuscatedName("jt.o")
    public static class262 field3542;

    @ObfuscatedName("jt.fm")
    public static byte[][] field3545;

    @ObfuscatedName("jp.o")
    public static class262 field3548;

    @ObfuscatedName("jp.fp")
    public static int field3552;

    @ObfuscatedName("jy.o")
    public static class262 field3553;

    @ObfuscatedName("jd.o")
    public static class262 field3559;

    @ObfuscatedName("jc.o")
    public static class262 field3586;

    @ObfuscatedName("p.aj")
    public static client field359;

    @ObfuscatedName("ja.k")
    public static class262 field3591;

    @ObfuscatedName("ja.t")
    public static class262 field3592;

    @ObfuscatedName("m.k")
    public static class262 field36;

    @ObfuscatedName("p.ek")
    public static int field360;

    @ObfuscatedName("ja.ge")
    public static int field3641;

    @ObfuscatedName("jo.m")
    public static class262 field3646;

    @ObfuscatedName("jo.z")
    public static class262 field3647;

    @ObfuscatedName("e.ea")
    public static class166 field365;

    @ObfuscatedName("e.ct")
    public static class264 field367;

    @ObfuscatedName("ji.pc")
    public static int field3698;

    @ObfuscatedName("e.bx")
    public static int field370;

    @ObfuscatedName("jr.k")
    public static class262 field3705;

    @ObfuscatedName("e.l")
    public static class122[] field371;

    @ObfuscatedName("jr.o")
    public static class262 field3735;

    @ObfuscatedName("c.b")
    public static String field374;

    @ObfuscatedName("ke.t")
    public static class262 field3755;

    @ObfuscatedName("ke.k")
    public static class262 field3765;

    @ObfuscatedName("ke.o")
    public static class262 field3766;

    @ObfuscatedName("ko.k")
    public static int field3778;

    @ObfuscatedName("kg.dp")
    public static class264 field3829;

    @ObfuscatedName("kr.i")
    public static byte[][][] field3832;

    @ObfuscatedName("kx.fu")
    public static int[] field3837;

    @ObfuscatedName("kh.u")
    public static class262 field3865;

    @ObfuscatedName("kp.fz")
    public static int[] field3889;

    @ObfuscatedName("kc.ff")
    public static class332[] field3890;

    @ObfuscatedName("lg.x")
    public static class331[] field3904;

    @ObfuscatedName("li.o")
    public static class187 field3918;

    @ObfuscatedName("la.i")
    public static ScheduledExecutorService field3926;

    @ObfuscatedName("le.u")
    public static byte[][][] field3931;

    @ObfuscatedName("lo.m")
    public static class332 field3939;

    @ObfuscatedName("lx.di")
    public static int field3946;

    @ObfuscatedName("lc.ag")
    public static int field3956;

    @ObfuscatedName("lc.at")
    public static int field3958;

    @ObfuscatedName("lc.ap")
    public static int[] field3959;

    @ObfuscatedName("ab.co")
    public static class264 field397;

    @ObfuscatedName("lb.o")
    public static int field3994;

    @ObfuscatedName("lb.t")
    public static int field3995;

    @ObfuscatedName("lb.i")
    public static int[] field3996;

    @ObfuscatedName("lb.d")
    public static int[] field3997;

    @ObfuscatedName("lb.z")
    public static int[] field3998;

    @ObfuscatedName("lb.k")
    public static int field3999;

    @ObfuscatedName("lb.u")
    public static byte[][] field4000;

    @ObfuscatedName("m.bn")
    public static class332[] field41;

    @ObfuscatedName("ag.py")
    public static int field417;

    @ObfuscatedName("ag.gz")
    public static int field418;

    @ObfuscatedName("at.qt")
    public static class80 field426;

    @ObfuscatedName("al.w")
    public static class312 field446;

    @ObfuscatedName("al.pp")
    public static class115 field447;

    @ObfuscatedName("al.m")
    public static int[] field448;

    @ObfuscatedName("ah.v")
    public static String[] field453;

    @ObfuscatedName("ah.ch")
    public static long field464;

    @ObfuscatedName("af.i")
    public static class331 field467;

    @ObfuscatedName("aq.p")
    public static int field472;

    @ObfuscatedName("az.ii")
    public static class243 field493;

    @ObfuscatedName("az.w")
    public static int[] field496;

    @ObfuscatedName("aa.pu")
    public static int field498;

    @ObfuscatedName("aa.bl")
    public static String field502;

    @ObfuscatedName("aa.u")
    public static int field503;

    @ObfuscatedName("aa.m")
    public static int field504;

    @ObfuscatedName("av.cm")
    public static char field508;

    @ObfuscatedName("am.am")
    public static String field516;

    @ObfuscatedName("am.bv")
    public static class70 field521;

    @ObfuscatedName("ax.ao")
    public static class329 field535;

    @ObfuscatedName("ax.dm")
    public static class264 field545;

    @ObfuscatedName("ae.gg")
    public static int field579;

    @ObfuscatedName("ae.nc")
    public static class321 field580;

    @ObfuscatedName("aw.s")
    public static class195 field585;

    @ObfuscatedName("ak.ck")
    public static boolean field590;

    @ObfuscatedName("ak.ew")
    public static class148 field593;

    @ObfuscatedName("as.fr")
    public static class332[] field607;

    @ObfuscatedName("as.n")
    public static class261 field608;

    @ObfuscatedName("ay.x")
    public static int field638;

    @ObfuscatedName("ay.dl")
    public static class264 field640;

    @ObfuscatedName("bm.ip")
    public static class73 field642;

    @ObfuscatedName("bl.dx")
    public static class264 field650;

    @ObfuscatedName("bf.ef")
    public static class312 field653;

    @ObfuscatedName("bf.cq")
    public static class264 field654;

    @ObfuscatedName("bf.x")
    public static int[] field655;

    @ObfuscatedName("bf.qs")
    public static class14 field656;

    @ObfuscatedName("bf.jc")
    public static int field657;

    @ObfuscatedName("bf.bj")
    public static String field658;

    @ObfuscatedName("bf.mk")
    public static int field661;

    @ObfuscatedName("bs.u")
    public static class331[] field674;

    @ObfuscatedName("br.o")
    public static class167 field683;

    @ObfuscatedName("br.z")
    public static int field685;

    @ObfuscatedName("br.ot")
    public static class308 field696;

    @ObfuscatedName("br.fx")
    public static class332[] field712;

    @ObfuscatedName("bk.pk")
    public static class101 field728;

    @ObfuscatedName("bn.rk")
    public static int field738;

    @ObfuscatedName("bj.d")
    public static byte[][][] field742;

    @ObfuscatedName("bj.h")
    public static byte[][][] field743;

    @ObfuscatedName("bj.m")
    public static byte[][][] field744;

    @ObfuscatedName("bj.z")
    public static byte[][][] field749;

    @ObfuscatedName("bo.ja")
    public static int field755;

    @ObfuscatedName("bo.pz")
    public static int field756;

    @ObfuscatedName("bo.er")
    public static int field762;

    @ObfuscatedName("bo.p")
    public static int[] field763;

    @ObfuscatedName("bq.fg")
    public static int[] field770;

    @ObfuscatedName("bh.ms")
    public static class243[] field786;

    @ObfuscatedName("bt.x")
    public static class110 field793;

    @ObfuscatedName("bt.fi")
    public static int field795;

    @ObfuscatedName("bt.bo")
    public static int field796;

    @ObfuscatedName("bc.de")
    public static class264 field811;

    @ObfuscatedName("bc.m")
    public static class243[][] field812;

    @ObfuscatedName("bc.cn")
    public static class264 field814;

    @ObfuscatedName("bc.ap")
    public static int[] field820;

    @ObfuscatedName("bv.ey")
    public static class312 field830;

    @ObfuscatedName("by.px")
    public static class108 field831;

    @ObfuscatedName("by.cy")
    public static class264 field833;

    @ObfuscatedName("by.qr")
    public static long field835;

    @ObfuscatedName("bz.gm")
    public static int field864;

    @ObfuscatedName("bw.i")
    public static int[] field867;

    @ObfuscatedName("client.bn")
    public static String field877;

    @ObfuscatedName("client.fa")
    public static class332 field932;

    @ObfuscatedName("be.o(Ljava/net/Socket;IIB)Lfd;")
    public static class170 method1006(Socket arg0, int arg1, int arg2) throws IOException {
        return new class172(arg0, arg1, arg2);
    }

    @ObfuscatedName("z.o(II)Liz;")
    public static class258 method17(int arg0) {
        class258[] var1 = new class258[] { class258.field3355, class258.field3356, class258.field3354, class258.field3357 };
        class258[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class258 var4 = var2[var3];
            if (var4.field3359 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("cl.k(CB)C")
    public static char method1704(char arg0) {
        return arg0 == 181 || arg0 == 131 ? arg0 : Character.toTitleCase(arg0);
    }

    @ObfuscatedName("io.t(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static String method4150(Throwable arg0) throws IOException {
        String var2;
        if (arg0 instanceof class165) {
            class165 var1 = (class165) arg0;
            var2 = var1.field2198 + " | ";
            arg0 = var1.field2196;
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

    @ObfuscatedName("ap.m(IIIIIIII)V")
    public static final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int[] var7 = class138.method2678(arg0, arg1, arg2);
        int[] var8 = class138.method2678(arg3, arg4, arg5);
        class328.method5332(var7[0], var7[1], var8[0], var8[1], arg6);
    }

    @ObfuscatedName("hf.d(Lgc;IIIIIII)V")
    public static final void method3799(class195 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method3205();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method3205();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method3205();
                }
            }
            return;
        }
        class63.field740[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3205();
            if (var7 == 0) {
                if (arg1 == 0) {
                    class63.field745[0][arg2][arg3] = -class63.method1018(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    class63.field745[arg1][arg2][arg3] = class63.field745[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method3205();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    class63.field745[0][arg2][arg3] = -var8 * 8;
                } else {
                    class63.field745[arg1][arg2][arg3] = class63.field745[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                field743[arg1][arg2][arg3] = arg0.method3210();
                field744[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                field749[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                class63.field740[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                field742[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("cs.o(Ljf;Ljf;Ljf;Ljf;B)V")
    public static void method1779(class262 arg0, class262 arg1, class262 arg2, class262 arg3) {
        field2137 = arg0;
        field3865 = arg1;
        field2816 = arg2;
        field1472 = arg3;
        field812 = new class243[field2137.method4191()][];
        field2158 = new boolean[field2137.method4191()];
    }

    @ObfuscatedName("ea.t(ZZI)Lll;")
    public static class331 method2551(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? field2980 : field1394) : (arg1 ? field2075 : field1364);
    }

    @ObfuscatedName("c.r(B)V")
    public static void method190() {
        class243.field2818.method3604();
        class243.field2878.method3604();
        class243.field2819.method3604();
        class243.field2820.method3604();
    }

    @ObfuscatedName("ag.y(ILcr;ZI)I")
    public static int method260(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = class243.method577(class82.field1282[--field278]);
        if (arg0 == 2500) {
            class82.field1282[++field278 - 1] = var3.field2823;
            return 1;
        } else if (arg0 == 2501) {
            class82.field1282[++field278 - 1] = var3.field2837;
            return 1;
        } else if (arg0 == 2502) {
            class82.field1282[++field278 - 1] = var3.field2838;
            return 1;
        } else if (arg0 == 2503) {
            class82.field1282[++field278 - 1] = var3.field2919;
            return 1;
        } else if (arg0 == 2504) {
            class82.field1282[++field278 - 1] = var3.field2843 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            class82.field1282[++field278 - 1] = var3.field2899;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("u.fm(B)V")
    public static final void method35() {
        if (field831 != null) {
            field831.method2024();
        }
        if (field2162 != null) {
            field2162.method2024();
        }
    }

    @ObfuscatedName("ag.fw(I)V")
    public static final void method262() {
        for (int var0 = 0; var0 < client.field1106; var0++) {
            int var10002 = client.field1109[var0]--;
            if (client.field1109[var0] >= -10) {
                class104 var2 = client.field1111[var0];
                if (var2 == null) {
                    class104 var10000 = (class104) null;
                    var2 = class104.method1953(field654, client.field1104[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    client.field1109[var0] += var2.method1944();
                    client.field1111[var0] = var2;
                }
                if (client.field1109[var0] < 0) {
                    int var9;
                    if (client.field1110[var0] == 0) {
                        var9 = client.field1076;
                    } else {
                        int var3 = (client.field1110[var0] & 0xFF) * 128;
                        int var4 = client.field1110[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - field642.field1211;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = client.field1110[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - field642.field1188;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            client.field1109[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = client.field952 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class106 var10 = var2.method1952().method1995(field447);
                        class116 var11 = class116.method2122(var10, 100, var9);
                        var11.method2125(client.field1030[var0] - 1);
                        field728.method1889(var11);
                    }
                    client.field1109[var0] = -100;
                }
            } else {
                client.field1106--;
                for (int var1 = var0; var1 < client.field1106; var1++) {
                    client.field1104[var1] = client.field1104[var1 + 1];
                    client.field1111[var1] = client.field1111[var1 + 1];
                    client.field1030[var1] = client.field1030[var1 + 1];
                    client.field1109[var1] = client.field1109[var1 + 1];
                    client.field1110[var1] = client.field1110[var1 + 1];
                }
                var0--;
            }
        }
        if (!client.field1103) {
            return;
        }
        boolean var12;
        if (class230.field2688 == 0) {
            var12 = field2691.method3816();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (client.field997 != 0 && client.field1027 != -1) {
                class230.method3130(field2606, client.field1027, 0, client.field997, false);
            }
            client.field1103 = false;
        }
    }

    @ObfuscatedName("f.io(IB)V")
    public static void method173(int arg0) {
        field1422 = new class88();
        field1422.field1339 = client.field1008[arg0];
        field1422.field1340 = client.field914[arg0];
        field1422.field1341 = client.field1108[arg0];
        field1422.field1342 = client.field950[arg0];
        field1422.field1343 = client.field1059[arg0];
    }

    @ObfuscatedName("gm.js(Lin;B)Z")
    public static final boolean method3149(class243 arg0) {
        int var1 = arg0.field2827;
        if (var1 == 205) {
            client.field916 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            client.field1133.method4018(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            client.field1133.method4045(var4, var5 == 1);
        }
        if (var1 == 324) {
            client.field1133.method4025(false);
        }
        if (var1 == 325) {
            client.field1133.method4025(true);
        }
        if (var1 == 326) {
            class185 var6 = class185.method267(class182.field2436, client.field958.field1485);
            client.field1133.method4037(var6.field2505);
            client.field958.method1882(var6);
            return true;
        } else {
            return false;
        }
    }
}
