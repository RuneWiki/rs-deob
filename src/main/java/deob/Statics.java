package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
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
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("p.lz")
    public static class96 field10;

    @ObfuscatedName("client.qk")
    public static class298 field1128;

    @ObfuscatedName("cn.qr")
    public static class301 field1204;

    @ObfuscatedName("cn.pw")
    public static int field1208;

    @ObfuscatedName("ca.a")
    public static int[] field1228;

    @ObfuscatedName("ca.c")
    public static class294 field1236;

    @ObfuscatedName("cr.i")
    public static int[] field1254;

    @ObfuscatedName("cr.j")
    public static String[] field1265;

    @ObfuscatedName("cr.y")
    public static class294 field1266;

    @ObfuscatedName("cy.af")
    public static GarbageCollectorMXBean field1281;

    @ObfuscatedName("cy.fb")
    public static class295[] field1288;

    @ObfuscatedName("cy.ab")
    public static int[] field1289;

    @ObfuscatedName("cy.cz")
    public static int field1290;

    @ObfuscatedName("cj.z")
    public static String field1315;

    @ObfuscatedName("ci.f")
    public static int field1324;

    @ObfuscatedName("cb.i")
    public static class294 field1334;

    @ObfuscatedName("cb.j")
    public static class294 field1335;

    @ObfuscatedName("cb.v")
    public static class294[] field1336;

    @ObfuscatedName("cb.x")
    public static class295 field1337;

    @ObfuscatedName("cb.b")
    public static class294[] field1340;

    @ObfuscatedName("cb.l")
    public static class294 field1342;

    @ObfuscatedName("cb.ae")
    public static int field1359;

    @ObfuscatedName("cb.m")
    public static boolean field1362;

    @ObfuscatedName("cb.eb")
    public static int field1368;

    @ObfuscatedName("cb.e")
    public static class295 field1369;

    @ObfuscatedName("ch.cp")
    public static boolean field1400;

    @ObfuscatedName("cu.cu")
    public static class245 field1420;

    @ObfuscatedName("cu.c")
    public static int field1424;

    @ObfuscatedName("cl.cv")
    public static class245 field1426;

    @ObfuscatedName("cl.bk")
    public static int field1430;

    @ObfuscatedName("cw.fs")
    public static int[] field1445;

    @ObfuscatedName("cq.nl")
    public static class76[] field1456;

    @ObfuscatedName("cq.da")
    public static int field1457;

    @ObfuscatedName("cs.s")
    public static int[] field1459;

    @ObfuscatedName("dx.e")
    public static byte[] field1496;

    @ObfuscatedName("dx.n")
    public static int field1500;

    @ObfuscatedName("dx.l")
    public static int field1501;

    @ObfuscatedName("dx.b")
    public static int field1502;

    @ObfuscatedName("dx.h")
    public static int[] field1504;

    @ObfuscatedName("dx.a")
    public static class104[] field1505;

    @ObfuscatedName("dx.y")
    public static class108[] field1506;

    @ObfuscatedName("dx.w")
    public static class115[] field1507;

    @ObfuscatedName("dx.k")
    public static class120[] field1508;

    @ObfuscatedName("dx.t")
    public static boolean[] field1509;

    @ObfuscatedName("dx.ao")
    public static float[] field1510;

    @ObfuscatedName("dx.f")
    public static float[] field1514;

    @ObfuscatedName("dx.d")
    public static float[] field1516;

    @ObfuscatedName("dx.s")
    public static float[] field1517;

    @ObfuscatedName("dx.q")
    public static float[] field1519;

    @ObfuscatedName("dx.aq")
    public static float[] field1522;

    @ObfuscatedName("dx.ab")
    public static int[] field1523;

    @ObfuscatedName("dx.as")
    public static int[] field1524;

    @ObfuscatedName("dx.al")
    public static float[] field1526;

    @ObfuscatedName("dx.c")
    public static int field1527;

    @ObfuscatedName("dt.c")
    public static int[] field1534;

    @ObfuscatedName("dt.n")
    public static int[] field1542;

    @ObfuscatedName("dt.a")
    public static boolean[] field1544;

    @ObfuscatedName("di.x")
    public static boolean field1546;

    @ObfuscatedName("di.l")
    public static ScheduledExecutorService field1547;

    @ObfuscatedName("di.n")
    public static class111 field1549;

    @ObfuscatedName("di.v")
    public static int field1554;

    @ObfuscatedName("di.b")
    public static int field1561;

    @ObfuscatedName("di.dx")
    public static class245 field1564;

    @ObfuscatedName("di.y")
    public static class103 field1568;

    @ObfuscatedName("dn.hl")
    public static class224 field1587;

    @ObfuscatedName("df.d")
    public static String field1605;

    @ObfuscatedName("dr.l")
    public static float field1629;

    @ObfuscatedName("dr.b")
    public static int field1630;

    @ObfuscatedName("dy.im")
    public static int field1680;

    @ObfuscatedName("dy.fc")
    public static class295[] field1682;

    @ObfuscatedName("db.pf")
    public static int field1689;

    @ObfuscatedName("dw.lp")
    public static int field1707;

    @ObfuscatedName("dw.ex")
    public static int field1709;

    @ObfuscatedName("dw.es")
    public static int field1710;

    @ObfuscatedName("dw.k")
    public static int[][][] field1711;

    @ObfuscatedName("j.m")
    public static class243 field18;

    @ObfuscatedName("dz.k")
    public static int[] field1802;

    @ObfuscatedName("ep.cs")
    public static class245 field1839;

    @ObfuscatedName("ep.s")
    public static int field1842;

    @ObfuscatedName("en.bn")
    public static int field1852;

    @ObfuscatedName("j.ow")
    public static class109 field19;

    @ObfuscatedName("en.bt")
    public static int field1902;

    @ObfuscatedName("en.bz")
    public static int field1903;

    @ObfuscatedName("eo.n")
    public static int field1914;

    @ObfuscatedName("eo.x")
    public static int field1917;

    @ObfuscatedName("eo.l")
    public static int field1919;

    @ObfuscatedName("eo.v")
    public static int field1920;

    @ObfuscatedName("eo.a")
    public static int field1921;

    @ObfuscatedName("eq.w")
    public static int field1935;

    @ObfuscatedName("eq.y")
    public static int field1942;

    @ObfuscatedName("eq.k")
    public static int field1944;

    @ObfuscatedName("eq.t")
    public static int field1945;

    @ObfuscatedName("eq.h")
    public static int field1946;

    @ObfuscatedName("eq.r")
    public static int field1948;

    @ObfuscatedName("eq.g")
    public static int field1949;

    @ObfuscatedName("eq.u")
    public static int field1955;

    @ObfuscatedName("eq.d")
    public static class145 field1956;

    @ObfuscatedName("ec.aq")
    public static int field1971;

    @ObfuscatedName("ec.u")
    public static int field1973;

    @ObfuscatedName("ec.d")
    public static int field1975;

    @ObfuscatedName("ec.bt")
    public static int field1978;

    @ObfuscatedName("ec.h")
    public static int field1987;

    @ObfuscatedName("ec.r")
    public static int field1989;

    @ObfuscatedName("ec.g")
    public static int field1990;

    @ObfuscatedName("ec.o")
    public static int field1992;

    @ObfuscatedName("ec.s")
    public static int field1994;

    @ObfuscatedName("ec.f")
    public static int field1995;

    @ObfuscatedName("ec.bn")
    public static int field1996;

    @ObfuscatedName("ec.al")
    public static int field1997;

    @ObfuscatedName("ec.ao")
    public static int field1998;

    @ObfuscatedName("ec.ab")
    public static int field2000;

    @ObfuscatedName("ec.bw")
    public static boolean[][] field2004;

    @ObfuscatedName("ec.z")
    public static int field2010;

    @ObfuscatedName("ec.be")
    public static int field2011;

    @ObfuscatedName("ec.q")
    public static int field2017;

    @ObfuscatedName("ec.bz")
    public static int field2023;

    @ObfuscatedName("ec.bj")
    public static int field2028;

    @ObfuscatedName("ec.bm")
    public static int field2033;

    @ObfuscatedName("ea.n")
    public static class294 field2047;

    @ObfuscatedName("eu.l")
    public static int[] field2052;

    @ObfuscatedName("eh.t")
    public static class181 field2079;

    @ObfuscatedName("j.fi")
    public static class295 field21;

    @ObfuscatedName("ex.fo")
    public static int field2106;

    @ObfuscatedName("es.ft")
    public static byte[][] field2108;

    @ObfuscatedName("ey.w")
    public static class242 field2113;

    @ObfuscatedName("ey.cq")
    public static class245 field2116;

    @ObfuscatedName("em.qg")
    public static class162 field2126;

    @ObfuscatedName("em.dq")
    public static String field2130;

    @ObfuscatedName("ew.m")
    public static Applet field2134;

    @ObfuscatedName("ew.i")
    public static int field2136;

    @ObfuscatedName("ew.p")
    public static String field2137;

    @ObfuscatedName("er.p")
    public static String field2149;

    @ObfuscatedName("er.m")
    public static String field2151;

    @ObfuscatedName("fs.k")
    public static class123[] field2157;

    @ObfuscatedName("fs.x")
    public static int field2159;

    @ObfuscatedName("fs.u")
    public static String[] field2165;

    @ObfuscatedName("fp.p")
    public static File field2168;

    @ObfuscatedName("fd.v")
    public static int field2209;

    @ObfuscatedName("fd.x")
    public static int field2210;

    @ObfuscatedName("e.ga")
    public static class7[] field225;

    @ObfuscatedName("e.lb")
    public static int field226;

    @ObfuscatedName("b.py")
    public static int field239;

    @ObfuscatedName("b.fk")
    public static class295[] field242;

    @ObfuscatedName("fi.hw")
    public static class224 field2421;

    @ObfuscatedName("b.e")
    public static boolean[] field243;

    @ObfuscatedName("fc.mc")
    public static class286 field2433;

    @ObfuscatedName("fu.ba")
    public static int field2444;

    @ObfuscatedName("fu.ql")
    public static class14 field2447;

    @ObfuscatedName("fk.dm")
    public static class245 field2453;

    @ObfuscatedName("n.ae")
    public static client field247;

    @ObfuscatedName("n.nu")
    public static byte field249;

    @ObfuscatedName("fv.qn")
    public static class81 field2494;

    @ObfuscatedName("n.l")
    public static int field250;

    @ObfuscatedName("fv.fz")
    public static class294[] field2501;

    @ObfuscatedName("n.dg")
    public static int field251;

    @ObfuscatedName("gm.p")
    public static long field2511;

    @ObfuscatedName("gm.m")
    public static long field2512;

    @ObfuscatedName("gk.b")
    public static byte[][][] field2514;

    @ObfuscatedName("ge.x")
    public static class243 field2517;

    @ObfuscatedName("gs.ou")
    public static int field2533;

    @ObfuscatedName("hb.c")
    public static boolean field2596;

    @ObfuscatedName("hb.j")
    public static class212 field2597;

    @ObfuscatedName("hb.i")
    public static class243 field2598;

    @ObfuscatedName("hb.e")
    public static int field2599;

    @ObfuscatedName("hb.l")
    public static int field2600;

    @ObfuscatedName("hb.m")
    public static class243 field2601;

    @ObfuscatedName("hb.a")
    public static class217 field2602;

    @ObfuscatedName("a.os")
    public static int field266;

    @ObfuscatedName("a.b")
    public static short[] field267;

    @ObfuscatedName("a.jw")
    public static int field268;

    @ObfuscatedName("hc.b")
    public static int[][] field2687;

    @ObfuscatedName("hq.v")
    public static class80[] field2694;

    @ObfuscatedName("hd.e")
    public static short[] field2702;

    @ObfuscatedName("hd.l")
    public static short[][] field2703;

    @ObfuscatedName("hw.cb")
    public static class161 field2707;

    @ObfuscatedName("y.m")
    public static class243 field271;

    @ObfuscatedName("ht.m")
    public static class243 field2713;

    @ObfuscatedName("hk.b")
    public static class243 field2719;

    @ObfuscatedName("hk.c")
    public static class243 field2720;

    @ObfuscatedName("y.dh")
    public static class245 field274;

    @ObfuscatedName("v.ay")
    public static String field28;

    @ObfuscatedName("w.oz")
    public static class109 field280;

    @ObfuscatedName("w.js")
    public static class224 field281;

    @ObfuscatedName("w.as")
    public static int[] field282;

    @ObfuscatedName("v.eo")
    public static class155 field29;

    @ObfuscatedName("hz.kr")
    public static int field2903;

    @ObfuscatedName("hz.gz")
    public static int field2906;

    @ObfuscatedName("hs.fx")
    public static class295[] field2912;

    @ObfuscatedName("hu.ey")
    public static int field2919;

    @ObfuscatedName("hu.oc")
    public static class116 field2921;

    @ObfuscatedName("t.cg")
    public static long field296;

    @ObfuscatedName("h.cw")
    public static class245 field307;

    @ObfuscatedName("r.oj")
    public static int field310;

    @ObfuscatedName("r.m")
    public static class243 field313;

    @ObfuscatedName("r.jj")
    public static int field316;

    @ObfuscatedName("x.bg")
    public static class71 field32;

    @ObfuscatedName("z.ez")
    public static class271 field321;

    @ObfuscatedName("hn.r")
    public static int field3210;

    @ObfuscatedName("ij.de")
    public static class245 field3233;

    @ObfuscatedName("in.ao")
    public static int[] field3244;

    @ObfuscatedName("id.e")
    public static int[] field3246;

    @ObfuscatedName("id.fy")
    public static class294[] field3251;

    @ObfuscatedName("id.el")
    public static class149 field3254;

    @ObfuscatedName("z.pc")
    public static int field326;

    @ObfuscatedName("ig.y")
    public static int field3260;

    @ObfuscatedName("ii.cy")
    public static class155 field3272;

    @ObfuscatedName("z.v")
    public static File field329;

    @ObfuscatedName("ih.v")
    public static Thread field3295;

    @ObfuscatedName("ih.x")
    public static class224[][] field3299;

    @ObfuscatedName("ix.i")
    public static long field3316;

    @ObfuscatedName("ix.m")
    public static class161 field3317;

    @ObfuscatedName("ic.l")
    public static boolean field3334;

    @ObfuscatedName("o.cm")
    public static class245 field334;

    @ObfuscatedName("ia.m")
    public static class243 field3341;

    @ObfuscatedName("it.t")
    public static int field3343;

    @ObfuscatedName("it.p")
    public static int field3345;

    @ObfuscatedName("if.i")
    public static int field3351;

    @ObfuscatedName("if.p")
    public static class250[] field3359;

    @ObfuscatedName("o.ff")
    public static int[][] field336;

    @ObfuscatedName("if.m")
    public static class243 field3366;

    @ObfuscatedName("io.m")
    public static class243 field3377;

    @ObfuscatedName("iv.p")
    public static class243 field3391;

    @ObfuscatedName("x.ix")
    public static int field34;

    @ObfuscatedName("iw.y")
    public static int[] field3400;

    @ObfuscatedName("iw.m")
    public static class243 field3401;

    @ObfuscatedName("ir.m")
    public static class243 field3404;

    @ObfuscatedName("ir.i")
    public static int field3408;

    @ObfuscatedName("ir.p")
    public static class243 field3410;

    @ObfuscatedName("ir.ab")
    public static Font field3414;

    @ObfuscatedName("iz.m")
    public static class243 field3421;

    @ObfuscatedName("iz.p")
    public static class243 field3422;

    @ObfuscatedName("il.bm")
    public static class294[] field3432;

    @ObfuscatedName("il.as")
    public static FontMetrics field3433;

    @ObfuscatedName("il.jb")
    public static int field3434;

    @ObfuscatedName("ib.fq")
    public static int[] field3439;

    @ObfuscatedName("ib.fp")
    public static int[] field3440;

    @ObfuscatedName("iq.b")
    public static int field3445;

    @ObfuscatedName("iq.m")
    public static class243 field3447;

    @ObfuscatedName("im.m")
    public static class243 field3448;

    @ObfuscatedName("jz.m")
    public static class243 field3457;

    @ObfuscatedName("jb.p")
    public static class243 field3463;

    @ObfuscatedName("jb.i")
    public static class243 field3464;

    @ObfuscatedName("jb.m")
    public static class243 field3480;

    @ObfuscatedName("jj.p")
    public static class243 field3487;

    @ObfuscatedName("jj.i")
    public static class243 field3489;

    @ObfuscatedName("f.ba")
    public static class294[] field351;

    @ObfuscatedName("jx.e")
    public static class243 field3539;

    @ObfuscatedName("jx.b")
    public static int field3544;

    @ObfuscatedName("jx.y")
    public static class271 field3548;

    @ObfuscatedName("f.n")
    public static int field355;

    @ObfuscatedName("q.or")
    public static int field359;

    @ObfuscatedName("jx.x")
    public static class243 field3596;

    @ObfuscatedName("jc.p")
    public static class243 field3605;

    @ObfuscatedName("jc.m")
    public static class243 field3616;

    @ObfuscatedName("jy.m")
    public static class243 field3648;

    @ObfuscatedName("jy.o")
    public static int[] field3654;

    @ObfuscatedName("jf.i")
    public static class243 field3666;

    @ObfuscatedName("jf.p")
    public static class243 field3668;

    @ObfuscatedName("jd.oe")
    public static class102 field3676;

    @ObfuscatedName("jd.o")
    public static String field3684;

    @ObfuscatedName("jd.bo")
    public static String field3686;

    @ObfuscatedName("jg.n")
    public static class294[] field3704;

    @ObfuscatedName("ji.m")
    public static class173 field3718;

    @ObfuscatedName("js.n")
    public static short[][] field3740;

    @ObfuscatedName("al.go")
    public static int field376;

    @ObfuscatedName("jw.w")
    public static class224 field3790;

    @ObfuscatedName("jw.v")
    public static byte[][][] field3791;

    @ObfuscatedName("jw.cj")
    public static char field3793;

    @ObfuscatedName("kc.p")
    public static class243 field3811;

    @ObfuscatedName("ky.aq")
    public static int field3814;

    @ObfuscatedName("ky.ab")
    public static int field3817;

    @ObfuscatedName("ky.ao")
    public static int[] field3819;

    @ObfuscatedName("ao.di")
    public static class245 field383;

    @ObfuscatedName("ku.p")
    public static int field3851;

    @ObfuscatedName("ku.i")
    public static int field3852;

    @ObfuscatedName("ku.l")
    public static int[] field3853;

    @ObfuscatedName("ku.j")
    public static int[] field3854;

    @ObfuscatedName("ku.m")
    public static int field3855;

    @ObfuscatedName("ku.b")
    public static byte[][] field3856;

    @ObfuscatedName("kb.a")
    public static class294 field3860;

    @ObfuscatedName("ao.n")
    public static class243 field387;

    @ObfuscatedName("aq.gv")
    public static int field403;

    @ObfuscatedName("ab.gi")
    public static int field404;

    @ObfuscatedName("ab.be")
    public static class295[] field411;

    @ObfuscatedName("ag.cl")
    public static class245 field428;

    @ObfuscatedName("ag.e")
    public static int[] field429;

    @ObfuscatedName("av.y")
    public static boolean field451;

    @ObfuscatedName("ak.gh")
    public static int field466;

    @ObfuscatedName("ak.aq")
    public static int[] field467;

    @ObfuscatedName("ak.pk")
    public static int field468;

    @ObfuscatedName("at.ax")
    public static boolean field475;

    @ObfuscatedName("at.e")
    public static int field476;

    @ObfuscatedName("an.bd")
    public static int field481;

    @ObfuscatedName("an.fe")
    public static byte[][] field483;

    @ObfuscatedName("an.fg")
    public static class295 field485;

    @ObfuscatedName("ah.b")
    public static int field486;

    @ObfuscatedName("ah.v")
    public static int[] field490;

    @ObfuscatedName("ah.e")
    public static byte[][][] field491;

    @ObfuscatedName("am.dl")
    public static class245 field498;

    @ObfuscatedName("ay.ng")
    public static class295 field508;

    @ObfuscatedName("az.bm")
    public static String field512;

    @ObfuscatedName("aw.bw")
    public static class240 field529;

    @ObfuscatedName("ac.y")
    public static class112 field540;

    @ObfuscatedName("ac.dt")
    public static class245 field549;

    @ObfuscatedName("ac.co")
    public static class155 field550;

    @ObfuscatedName("ac.qe")
    public static int field552;

    @ObfuscatedName("ai.je")
    public static class89 field556;

    @ObfuscatedName("ai.h")
    public static String[] field561;

    @ObfuscatedName("ai.aj")
    public static int field562;

    @ObfuscatedName("ax.jz")
    public static int field567;

    @ObfuscatedName("af.l")
    public static class243 field575;

    @ObfuscatedName("aa.f")
    public static int[] field578;

    @ObfuscatedName("aa.ea")
    public static class271 field581;

    @ObfuscatedName("aa.ei")
    public static class270 field582;

    @ObfuscatedName("aa.n")
    public static int field585;

    @ObfuscatedName("ad.h")
    public static class48 field588;

    @ObfuscatedName("ad.ct")
    public static class245 field592;

    @ObfuscatedName("ad.dy")
    public static int field596;

    @ObfuscatedName("ad.eu")
    public static class271 field598;

    @ObfuscatedName("ad.id")
    public static class74 field601;

    @ObfuscatedName("ae.iz")
    public static int field625;

    @ObfuscatedName("ar.m")
    public static class243 field627;

    @ObfuscatedName("ar.fl")
    public static class294[] field628;

    @ObfuscatedName("bk.lv")
    public static class224[] field631;

    @ObfuscatedName("bk.dn")
    public static class245 field632;

    @ObfuscatedName("bk.c")
    public static int[] field633;

    @ObfuscatedName("bo.qb")
    public static short[] field636;

    @ObfuscatedName("bw.g")
    public static class181 field641;

    @ObfuscatedName("bw.cx")
    public static class245 field648;

    @ObfuscatedName("bw.fa")
    public static class139 field649;

    @ObfuscatedName("bw.lx")
    public static class158 field650;

    @ObfuscatedName("bw.l")
    public static int field651;

    @ObfuscatedName("bw.bd")
    public static class294[] field652;

    @ObfuscatedName("bw.fw")
    public static int field656;

    @ObfuscatedName("bn.m")
    public static class156 field671;

    @ObfuscatedName("bn.r")
    public static int field673;

    @ObfuscatedName("bn.h")
    public static int field688;

    @ObfuscatedName("bn.bo")
    public static class239 field690;

    @ObfuscatedName("bn.ak")
    public static Image field691;

    @ObfuscatedName("bn.jl")
    public static int field697;

    @ObfuscatedName("bn.a")
    public static class160 field698;

    @ObfuscatedName("bz.bj")
    public static class299 field719;

    @ObfuscatedName("be.j")
    public static byte[][][] field727;

    @ObfuscatedName("be.x")
    public static byte[][][] field728;

    @ObfuscatedName("be.w")
    public static int[] field729;

    @ObfuscatedName("be.n")
    public static int[] field730;

    @ObfuscatedName("be.qo")
    public static long field736;

    @ObfuscatedName("be.l")
    public static byte[][][] field739;

    @ObfuscatedName("bm.en")
    public static long field745;

    @ObfuscatedName("bd.x")
    public static int[] field746;

    @ObfuscatedName("bd.br")
    public static class294 field751;

    @ObfuscatedName("bd.jo")
    public static class224 field752;

    @ObfuscatedName("ba.pa")
    public static int field762;

    @ObfuscatedName("br.y")
    public static class224 field769;

    @ObfuscatedName("bc.az")
    public static class292 field780;

    @ObfuscatedName("bp.j")
    public static File field782;

    @ObfuscatedName("bg.is")
    public static int field801;

    @ObfuscatedName("bg.fu")
    public static class295[] field802;

    @ObfuscatedName("bb.ns")
    public static byte field806;

    @ObfuscatedName("bb.ga")
    public static int field809;

    @ObfuscatedName("bb.ln")
    public static int field810;

    @ObfuscatedName("bx.du")
    public static int field816;

    @ObfuscatedName("bx.f")
    public static int[] field822;

    @ObfuscatedName("bx.eq")
    public static class161 field824;

    @ObfuscatedName("by.be")
    public static String field825;

    @ObfuscatedName("by.n")
    public static class150 field826;

    @ObfuscatedName("by.fr")
    public static class295[] field831;

    @ObfuscatedName("bq.qy")
    public static int field844;

    @ObfuscatedName("bq.gs")
    public static int field858;

    @ObfuscatedName("bs.hf")
    public static class224 field865;

    @ObfuscatedName("bs.d")
    public static int[] field868;

    @ObfuscatedName("client.ni")
    public static int field927;

    @ObfuscatedName("ci.m(ILhy;I)I")
    public static int method1643(int arg0, class227 arg1) {
        return (arg0 << 8) + arg1.field2872;
    }

    @ObfuscatedName("cd.p(Lgi;I)V")
    public static void method1525(class187 arg0) {
        class289 var1 = (class289) class290.field3812.method3453();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field2498;
        arg0.method2999(var1.field3799);
        for (int var3 = 0; var3 < var1.field3800; var3++) {
            if (var1.field3802[var3] == 0) {
                try {
                    int var4 = var1.field3805[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field3801[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2996(0);
                        arg0.method2999(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field3801[var3];
                        var7.setInt((Object) null, var1.field3804[var3]);
                        arg0.method2996(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field3801[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2996(0);
                        arg0.method2999(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field3803[var3];
                        byte[][] var11 = var1.field3806[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2996(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2996(1);
                            arg0.method3170(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2996(2);
                            arg0.method3003((String) var15);
                        } else {
                            arg0.method2996(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field3803[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2996(0);
                        arg0.method2999(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2996(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2996(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2996(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2996(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2996(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2996(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2996(-16);
                } catch (SecurityException var37) {
                    arg0.method2996(-17);
                } catch (IOException var38) {
                    arg0.method2996(-18);
                } catch (NullPointerException var39) {
                    arg0.method2996(-19);
                } catch (Exception var40) {
                    arg0.method2996(-20);
                } catch (Throwable var41) {
                    arg0.method2996(-21);
                }
            } else {
                arg0.method2996(var1.field3802[var3]);
            }
        }
        arg0.method3178(var2);
        var1.method3476();
    }

    @ObfuscatedName("cq.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1768(int arg0, String arg1, String arg2, String arg3) {
        class100 var4 = (class100) class97.field1435.get(arg0);
        if (var4 == null) {
            var4 = new class100();
            class97.field1435.put(arg0, var4);
        }
        class72 var5 = var4.method1775(arg0, arg1, arg2, arg3);
        class97.field1434.method3396(var5, (long) var5.field823);
        class97.field1428.method3549(var5);
        client.field936 = client.field1101;
    }

    @ObfuscatedName("as.i(I)I")
    public static final int method260() {
        return class134.field1913;
    }

    @ObfuscatedName("ag.i(IB)[B")
    public static synchronized byte[] method263(int arg0) {
        return class182.method3240(arg0, false);
    }

    @ObfuscatedName("ca.p(IIIB)I")
    public static int method1539(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @ObfuscatedName("af.p(I)V")
    public static void method665() {
        class51 var0 = class51.field610;
        synchronized (class51.field610) {
            class51.field623++;
            class51.field620 = class51.field622;
            class51.field606 = 0;
            if (class51.field612 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    class51.field619[var1] = false;
                }
                class51.field612 = class51.field618;
            } else {
                while (class51.field618 != class51.field612) {
                    int var2 = class51.field613[class51.field618];
                    class51.field618 = class51.field618 + 1 & 0x7F;
                    if (var2 < 0) {
                        class51.field619[~var2] = false;
                    } else {
                        if (!class51.field619[var2] && class51.field606 < class51.field615.length - 1) {
                            class51.field615[++class51.field606 - 1] = var2;
                        }
                        class51.field619[var2] = true;
                    }
                }
            }
            if (class51.field606 > 0) {
                class51.field623 = 0;
            }
            class51.field622 = class51.field616;
        }
    }

    @ObfuscatedName("bp.i(Ljava/lang/String;B)Ljava/lang/Class;")
    public static Class method1038(String arg0) throws ClassNotFoundException {
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else if (arg0.equals("void")) {
            return Void.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @ObfuscatedName("k.p(Ljava/io/File;Ljava/io/File;B)V")
    public static void method76(File arg0, File arg1) {
        try {
            class124 var2 = new class124(field782, "rw", 10000L);
            class181 var3 = new class181(500);
            var3.method2996(3);
            var3.method2996(arg1 == null ? 0 : 1);
            var3.method3005(arg0.getPath());
            if (arg1 != null) {
                var3.method3005(arg1.getPath());
            }
            var2.method2254(var3.field2499, 0, var3.field2498);
            var2.method2243();
        } catch (IOException var5) {
            var5.printStackTrace();
        }
    }

    @ObfuscatedName("ak.n(I)Lko;")
    public static class294 method470() {
        class294 var0 = new class294();
        var0.field3837 = field3851;
        var0.field3836 = field3852;
        var0.field3835 = field3854[0];
        var0.field3831 = field490[0];
        var0.field3834 = field746[0];
        var0.field3833 = field429[0];
        var0.field3832 = field3853;
        var0.field3838 = field3856[0];
        class296.method4669();
        return var0;
    }

    @ObfuscatedName("jr.a([BI)Ljt;")
    public static class271 method4644(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class271 var1 = new class271(arg0, field3854, field490, field746, field429, field3853, field3856);
            class296.method4669();
            return var1;
        }
    }

    @ObfuscatedName("by.y(Lik;III)Z")
    public static boolean method1065(class243 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3930(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            class296.method2752(var3);
            return true;
        }
    }

    @ObfuscatedName("by.v(I)V")
    public static void method1064() {
        if (class92.field1358 && class92.field1343 != null && class92.field1343.length() > 0) {
            class92.field1351 = 1;
        } else {
            class92.field1351 = 0;
        }
    }

    @ObfuscatedName("c.c(IIIIIZI)Lkd;")
    public static final class295 method49(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class295 var8 = (class295) class264.field3540.method3419(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class264 var9 = class264.method4124(arg0);
        if (arg1 > 1 && var9.field3580 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3581[var11] && var9.field3581[var11] != 0) {
                    var10 = var9.field3580[var11];
                }
            }
            if (var10 != -1) {
                var9 = class264.method4124(var10);
            }
        }
        class133 var12 = var9.method4389(1);
        if (var12 == null) {
            return null;
        }
        class295 var13 = null;
        if (var9.field3588 != -1) {
            var13 = method49(var9.field3582, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3583 != -1) {
            var13 = method49(var9.field3587, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3595 != -1) {
            var13 = method49(var9.field3594, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = field3819;
        int var15 = field3814;
        int var16 = field3817;
        int[] var17 = new int[4];
        class291.method4766(var17);
        class295 var18 = new class295(36, 32);
        class291.method4767(var18.field3850, 36, 32);
        class291.method4797();
        class136.method2476();
        class136.method2517(16, 16);
        class136.field1930 = false;
        if (var9.field3595 != -1) {
            var13.method4892(0, 0);
        }
        int var19 = var9.field3547;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class136.field1947[var9.field3557] * var19 >> 16;
        int var21 = class136.field1953[var9.field3557] * var19 >> 16;
        var12.method2385();
        var12.method2398(0, var9.field3556, var9.field3569, var9.field3557, var9.field3560, var9.field3592 + var12.field2037 / 2 + var20, var9.field3592 + var21);
        if (var9.field3583 != -1) {
            var13.method4892(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4888(1);
        }
        if (arg2 >= 2) {
            var18.method4888(16777215);
        }
        if (arg3 != 0) {
            var18.method4942(arg3);
        }
        class291.method4767(var18.field3850, 36, 32);
        if (var9.field3588 != -1) {
            var13.method4892(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3559 == 1) {
            class271 var22 = field3548;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class233.field3008 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class233.field3016 + "</col>";
            }
            var22.method4560(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            class264.field3540.method3418(var18, var6);
        }
        class291.method4767(var14, var15, var16);
        class291.method4791(var17);
        class136.method2476();
        class136.field1930 = true;
        return var18;
    }

    @ObfuscatedName("ai.t(IIII)I")
    public static final int method598(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @ObfuscatedName("by.ew(I)V")
    public static final void method1066() {
        class139.field1991 = false;
        client.field875 = false;
    }

    @ObfuscatedName("bd.ia([Lhk;IIIIIIII)V")
    public static final void method1026(class224[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class224 var9 = arg0[var8];
            if (var9 != null && (!var9.field2857 || var9.field2809 == 0 || var9.field2750 || client.method1528(var9) != 0 || client.field1024 == var9 || var9.field2840 == 1338) && var9.field2746 == arg1 && (!var9.field2857 || !client.method4263(var9))) {
                int var10 = var9.field2740 + arg6;
                int var11 = var9.field2741 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2809 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2809 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2742 + var10;
                    int var19 = var9.field2775 + var11;
                    if (var18 < var10) {
                        var16 = var18;
                        var18 = var10;
                    }
                    if (var19 < var11) {
                        var17 = var19;
                        var19 = var11;
                    }
                    var18++;
                    var19++;
                    var12 = var16 > arg2 ? var16 : arg2;
                    var13 = var17 > arg3 ? var17 : arg3;
                    var14 = var18 < arg4 ? var18 : arg4;
                    var15 = var19 < arg5 ? var19 : arg5;
                } else {
                    int var22 = var9.field2742 + var10;
                    int var23 = var9.field2775 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (client.field1023 == var9) {
                    client.field1069 = true;
                    client.field1032 = var10;
                    client.field1033 = var11;
                }
                if (!var9.field2857 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field705;
                    int var25 = class60.field709;
                    if (class60.field714 != 0) {
                        var24 = class60.field715;
                        var25 = class60.field716;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2840 == 1337) {
                        if (!client.field878 && !client.field988 && var26) {
                            if (client.field1003 == 0 && !client.field1005) {
                                client.method968(class233.field3078, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var27 = -1;
                            int var28 = -1;
                            for (int var29 = 0; var29 < class134.field1922; var29++) {
                                int var30 = class134.field1923[var29];
                                int var31 = var30 & 0x7F;
                                int var32 = var30 >> 7 & 0x7F;
                                int var33 = var30 >> 29 & 0x3;
                                int var34 = var30 >> 14 & 0x7FFF;
                                if (var28 != var30) {
                                    var28 = var30;
                                    if (var33 == 2 && field649.method2681(field801, var31, var32, var30) >= 0) {
                                        class263 var35 = class263.method190(var34);
                                        if (var35.field3519 != null) {
                                            var35 = var35.method4337();
                                        }
                                        if (var35 == null) {
                                            continue;
                                        }
                                        if (client.field1003 == 1) {
                                            client.method968(class233.field3073, client.field1119 + " " + class88.field1309 + " " + class88.method2738(65535) + var35.field3498, 1, var30, var31, var32);
                                        } else if (!client.field1005) {
                                            String[] var36 = var35.field3515;
                                            if (client.field870) {
                                                var36 = client.method1030(var36);
                                            }
                                            if (var36 != null) {
                                                for (int var37 = 4; var37 >= 0; var37--) {
                                                    if (var36[var37] != null) {
                                                        short var38 = 0;
                                                        if (var37 == 0) {
                                                            var38 = 3;
                                                        }
                                                        if (var37 == 1) {
                                                            var38 = 4;
                                                        }
                                                        if (var37 == 2) {
                                                            var38 = 5;
                                                        }
                                                        if (var37 == 3) {
                                                            var38 = 6;
                                                        }
                                                        if (var37 == 4) {
                                                            var38 = 1001;
                                                        }
                                                        client.method968(var36[var37], class88.method2738(65535) + var35.field3498, var38, var30, var31, var32);
                                                    }
                                                }
                                            }
                                            client.method968(class233.field3074, class88.method2738(65535) + var35.field3498, 1002, var35.field3495 << 14, var31, var32);
                                        } else if ((field2903 & 0x4) == 4) {
                                            client.method968(client.field1008, client.field1009 + " " + class88.field1309 + " " + class88.method2738(65535) + var35.field3498, 2, var30, var31, var32);
                                        }
                                    }
                                    if (var33 == 1) {
                                        class86 var39 = client.field907[var34];
                                        if (var39 == null) {
                                            continue;
                                        }
                                        if (var39.field1293.field3626 == 1 && (var39.field1188 & 0x7F) == 64 && (var39.field1145 & 0x7F) == 64) {
                                            for (int var40 = 0; var40 < client.field1016; var40++) {
                                                class86 var41 = client.field907[client.field909[var40]];
                                                if (var41 != null && var39 != var41 && var41.field1293.field3626 == 1 && var39.field1188 == var41.field1188 && var39.field1145 == var41.field1145) {
                                                    client.method574(var41.field1293, client.field909[var40], var31, var32);
                                                }
                                            }
                                            int var42 = class95.field1406;
                                            int[] var43 = class95.field1407;
                                            for (int var44 = 0; var44 < var42; var44++) {
                                                class74 var45 = client.field1113[var43[var44]];
                                                if (var45 != null && var39.field1188 == var45.field1188 && var39.field1145 == var45.field1145) {
                                                    client.method1642(var45, var43[var44], var31, var32);
                                                }
                                            }
                                        }
                                        client.method574(var39.field1293, var34, var31, var32);
                                    }
                                    if (var33 == 0) {
                                        class74 var46 = client.field1113[var34];
                                        if (var46 == null) {
                                            continue;
                                        }
                                        if ((var46.field1188 & 0x7F) == 64 && (var46.field1145 & 0x7F) == 64) {
                                            for (int var47 = 0; var47 < client.field1016; var47++) {
                                                class86 var48 = client.field907[client.field909[var47]];
                                                if (var48 != null && var48.field1293.field3626 == 1 && var46.field1188 == var48.field1188 && var46.field1145 == var48.field1145) {
                                                    client.method574(var48.field1293, client.field909[var47], var31, var32);
                                                }
                                            }
                                            int var49 = class95.field1406;
                                            int[] var50 = class95.field1407;
                                            for (int var51 = 0; var51 < var49; var51++) {
                                                class74 var52 = client.field1113[var50[var51]];
                                                if (var52 != null && var46 != var52 && var46.field1188 == var52.field1188 && var46.field1145 == var52.field1145) {
                                                    client.method1642(var52, var50[var51], var31, var32);
                                                }
                                            }
                                        }
                                        if (client.field979 == var34) {
                                            var27 = var30;
                                        } else {
                                            client.method1642(var46, var34, var31, var32);
                                        }
                                    }
                                    if (var33 == 3) {
                                        class201 var53 = client.field887[field801][var31][var32];
                                        if (var53 != null) {
                                            for (class94 var54 = (class94) var53.method3487(); var54 != null; var54 = (class94) var53.method3489()) {
                                                class264 var55 = class264.method4124(var54.field1401);
                                                if (client.field1003 == 1) {
                                                    client.method968(class233.field3073, client.field1119 + " " + class88.field1309 + " " + class88.method2738(16748608) + var55.field3551, 16, var54.field1401, var31, var32);
                                                } else if (!client.field1005) {
                                                    String[] var56 = var55.field3578;
                                                    if (client.field870) {
                                                        var56 = client.method1030(var56);
                                                    }
                                                    for (int var57 = 4; var57 >= 0; var57--) {
                                                        if (var56 != null && var56[var57] != null) {
                                                            byte var58 = 0;
                                                            if (var57 == 0) {
                                                                var58 = 18;
                                                            }
                                                            if (var57 == 1) {
                                                                var58 = 19;
                                                            }
                                                            if (var57 == 2) {
                                                                var58 = 20;
                                                            }
                                                            if (var57 == 3) {
                                                                var58 = 21;
                                                            }
                                                            if (var57 == 4) {
                                                                var58 = 22;
                                                            }
                                                            client.method968(var56[var57], class88.method2738(16748608) + var55.field3551, var58, var54.field1401, var31, var32);
                                                        } else if (var57 == 2) {
                                                            client.method968(class233.field2924, class88.method2738(16748608) + var55.field3551, 20, var54.field1401, var31, var32);
                                                        }
                                                    }
                                                    client.method968(class233.field3074, class88.method2738(16748608) + var55.field3551, 1004, var54.field1401, var31, var32);
                                                } else if ((field2903 & 0x1) == 1) {
                                                    client.method968(client.field1008, client.field1009 + " " + class88.field1309 + " " + class88.method2738(16748608) + var55.field3551, 17, var54.field1401, var31, var32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var27 != -1) {
                                int var59 = var27 & 0x7F;
                                int var60 = var27 >> 7 & 0x7F;
                                class74 var61 = client.field1113[client.field979];
                                client.method1642(var61, client.field979, var59, var60);
                            }
                        }
                    } else if (var9.field2840 != 1338) {
                        if (var9.field2840 == 1400) {
                            field1128.method5029(class60.field705, class60.field709, var26, var10, var11, var9.field2742, var9.field2775);
                        }
                        if (!client.field988 && var26) {
                            if (var9.field2840 == 1400) {
                                field1128.method5028(var10, var11, var9.field2742, var9.field2775, var24, var25);
                            } else {
                                int var75 = var24 - var10;
                                int var76 = var25 - var11;
                                if (var9.field2730 == 1) {
                                    client.method968(var9.field2844, "", 24, 0, 0, var9.field2764);
                                }
                                if (var9.field2730 == 2 && !client.field1005) {
                                    String var77;
                                    if (class225.method1601(client.method1528(var9)) == 0) {
                                        var77 = null;
                                    } else if (var9.field2806 == null || var9.field2806.trim().length() == 0) {
                                        var77 = null;
                                    } else {
                                        var77 = var9.field2806;
                                    }
                                    if (var77 != null) {
                                        client.method968(var77, class88.method2738(65280) + var9.field2843, 25, 0, -1, var9.field2764);
                                    }
                                }
                                if (var9.field2730 == 3) {
                                    client.method968(class233.field3082, "", 26, 0, 0, var9.field2764);
                                }
                                if (var9.field2730 == 4) {
                                    client.method968(var9.field2844, "", 28, 0, 0, var9.field2764);
                                }
                                if (var9.field2730 == 5) {
                                    client.method968(var9.field2844, "", 29, 0, 0, var9.field2764);
                                }
                                if (var9.field2730 == 6 && client.field1014 == null) {
                                    client.method968(var9.field2844, "", 30, 0, -1, var9.field2764);
                                }
                                if (var9.field2809 == 2) {
                                    int var79 = 0;
                                    for (int var80 = 0; var80 < var9.field2775; var80++) {
                                        for (int var81 = 0; var81 < var9.field2742; var81++) {
                                            int var82 = (var9.field2793 + 32) * var81;
                                            int var83 = (var9.field2794 + 32) * var80;
                                            if (var79 < 20) {
                                                var82 += var9.field2795[var79];
                                                var83 += var9.field2796[var79];
                                            }
                                            if (var75 >= var82 && var76 >= var83 && var75 < var82 + 32 && var76 < var83 + 32) {
                                                client.field966 = var79;
                                                field1587 = var9;
                                                if (var9.field2845[var79] > 0) {
                                                    label1396: {
                                                        class264 var84 = class264.method4124(var9.field2845[var79] - 1);
                                                        if (client.field1003 == 1) {
                                                            int var85 = client.method1528(var9);
                                                            boolean var86 = (var85 >> 30 & 0x1) != 0;
                                                            if (var86) {
                                                                if (field34 != var9.field2764 || field697 != var79) {
                                                                    client.method968(class233.field3073, client.field1119 + " " + class88.field1309 + " " + class88.method2738(16748608) + var84.field3551, 31, var84.field3549, var79, var9.field2764);
                                                                }
                                                                break label1396;
                                                            }
                                                        }
                                                        if (client.field1005) {
                                                            int var87 = client.method1528(var9);
                                                            boolean var88 = (var87 >> 30 & 0x1) != 0;
                                                            if (var88) {
                                                                if ((field2903 & 0x10) == 16) {
                                                                    client.method968(client.field1008, client.field1009 + " " + class88.field1309 + " " + class88.method2738(16748608) + var84.field3551, 32, var84.field3549, var79, var9.field2764);
                                                                }
                                                                break label1396;
                                                            }
                                                        }
                                                        String[] var89 = var84.field3565;
                                                        if (client.field870) {
                                                            String[] var90 = client.method1030(var89);
                                                        }
                                                        int var91 = -1;
                                                        if (client.field998 && class51.field619[81]) {
                                                            var91 = var84.method4396();
                                                        }
                                                        int var92 = client.method1528(var9);
                                                        boolean var93 = (var92 >> 30 & 0x1) != 0;
                                                        if (var93) {
                                                            for (int var94 = 4; var94 >= 3; var94--) {
                                                                if (var91 != var94) {
                                                                    client.method505(var9, var84, var79, var94, false);
                                                                }
                                                            }
                                                        }
                                                        class225 var10000 = (class225) null;
                                                        if (class225.method2824(client.method1528(var9))) {
                                                            client.method968(class233.field3073, class88.method2738(16748608) + var84.field3551, 38, var84.field3549, var79, var9.field2764);
                                                        }
                                                        int var95 = client.method1528(var9);
                                                        boolean var96 = (var95 >> 30 & 0x1) != 0;
                                                        if (var96) {
                                                            for (int var97 = 2; var97 >= 0; var97--) {
                                                                if (var91 != var97) {
                                                                    client.method505(var9, var84, var79, var97, false);
                                                                }
                                                            }
                                                            if (var91 >= 0) {
                                                                client.method505(var9, var84, var79, var91, true);
                                                            }
                                                        }
                                                        String[] var98 = var9.field2841;
                                                        if (client.field870) {
                                                            var98 = client.method1030(var98);
                                                        }
                                                        if (var98 != null) {
                                                            for (int var99 = 4; var99 >= 0; var99--) {
                                                                if (var98[var99] != null) {
                                                                    byte var100 = 0;
                                                                    if (var99 == 0) {
                                                                        var100 = 39;
                                                                    }
                                                                    if (var99 == 1) {
                                                                        var100 = 40;
                                                                    }
                                                                    if (var99 == 2) {
                                                                        var100 = 41;
                                                                    }
                                                                    if (var99 == 3) {
                                                                        var100 = 42;
                                                                    }
                                                                    if (var99 == 4) {
                                                                        var100 = 43;
                                                                    }
                                                                    client.method968(var98[var99], class88.method2738(16748608) + var84.field3551, var100, var84.field3549, var79, var9.field2764);
                                                                }
                                                            }
                                                        }
                                                        client.method968(class233.field3074, class88.method2738(16748608) + var84.field3551, 1005, var84.field3549, var79, var9.field2764);
                                                    }
                                                }
                                            }
                                            var79++;
                                        }
                                    }
                                }
                                if (var9.field2857) {
                                    if (client.field1005) {
                                        int var101 = client.method1528(var9);
                                        boolean var102 = (var101 >> 21 & 0x1) != 0;
                                        if (var102 && (field2903 & 0x20) == 32) {
                                            client.method968(client.field1008, client.field1009 + " " + class88.field1309 + " " + var9.field2800, 58, 0, var9.field2728, var9.field2764);
                                        }
                                    } else {
                                        for (int var103 = 9; var103 >= 5; var103--) {
                                            String var104;
                                            if (!class225.method2019(client.method1528(var9), var103) && var9.field2827 == null) {
                                                var104 = null;
                                            } else if (var9.field2801 == null || var9.field2801.length <= var103 || var9.field2801[var103] == null || var9.field2801[var103].trim().length() == 0) {
                                                var104 = null;
                                            } else {
                                                var104 = var9.field2801[var103];
                                            }
                                            if (var104 != null) {
                                                client.method968(var104, var9.field2800, 1007, var103 + 1, var9.field2728, var9.field2764);
                                            }
                                        }
                                        String var106 = client.method2827(var9);
                                        if (var106 != null) {
                                            client.method968(var106, var9.field2800, 25, 0, var9.field2728, var9.field2764);
                                        }
                                        for (int var107 = 4; var107 >= 0; var107--) {
                                            String var108;
                                            if (!class225.method2019(client.method1528(var9), var107) && var9.field2827 == null) {
                                                var108 = null;
                                            } else if (var9.field2801 == null || var9.field2801.length <= var107 || var9.field2801[var107] == null || var9.field2801[var107].trim().length() == 0) {
                                                var108 = null;
                                            } else {
                                                var108 = var9.field2801[var107];
                                            }
                                            if (var108 != null) {
                                                client.method968(var108, var9.field2800, 57, var107 + 1, var9.field2728, var9.field2764);
                                            }
                                        }
                                        if (class225.method1779(client.method1528(var9))) {
                                            client.method968(class233.field3173, "", 30, 0, var9.field2728, var9.field2764);
                                        }
                                    }
                                }
                            }
                        }
                        if (var9.field2809 == 0) {
                            if (!var9.field2857 && client.method4263(var9) && field752 != var9) {
                                continue;
                            }
                            method1026(arg0, var9.field2764, var12, var13, var14, var15, var10 - var9.field2748, var11 - var9.field2749);
                            if (var9.field2856 != null) {
                                method1026(var9.field2856, var9.field2764, var12, var13, var14, var15, var10 - var9.field2748, var11 - var9.field2749);
                            }
                            class68 var110 = (class68) client.field1026.method3444((long) var9.field2764);
                            if (var110 != null) {
                                if (var110.field784 == 0 && class60.field705 >= var12 && class60.field709 >= var13 && class60.field705 < var14 && class60.field709 < var15 && !client.field988 && !client.field1082) {
                                    for (class69 var111 = (class69) client.field1049.method3486(); var111 != null; var111 = (class69) client.field1049.method3507()) {
                                        if (var111.field787) {
                                            var111.method3476();
                                            var111.field795.field2852 = false;
                                        }
                                    }
                                    if (field226 == 0) {
                                        client.field1023 = null;
                                        client.field1024 = null;
                                    }
                                    if (!client.field988) {
                                        client.method454();
                                        client.field994[0] = class233.field3162;
                                        client.field995[0] = "";
                                        client.field876[0] = 1006;
                                        client.field996[0] = false;
                                        client.field989 = 1;
                                    }
                                }
                                client.method934(var110.field781, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2857) {
                            if (var9.field2860) {
                                if (class60.field705 >= var12 && class60.field709 >= var13 && class60.field705 < var14 && class60.field709 < var15) {
                                    for (class69 var112 = (class69) client.field1049.method3486(); var112 != null; var112 = (class69) client.field1049.method3507()) {
                                        if (var112.field787) {
                                            var112.method3476();
                                            var112.field795.field2852 = false;
                                        }
                                    }
                                    if (field226 == 0) {
                                        client.field1023 = null;
                                        client.field1024 = null;
                                    }
                                    if (!client.field988) {
                                        client.method454();
                                        client.field994[0] = class233.field3162;
                                        client.field995[0] = "";
                                        client.field876[0] = 1006;
                                        client.field996[0] = false;
                                        client.field989 = 1;
                                    }
                                }
                            } else if (var9.field2734 && class60.field705 >= var12 && class60.field709 >= var13 && class60.field705 < var14 && class60.field709 < var15) {
                                for (class69 var113 = (class69) client.field1049.method3486(); var113 != null; var113 = (class69) client.field1049.method3507()) {
                                    if (var113.field787 && var113.field795.field2816 == var113.field792) {
                                        var113.method3476();
                                    }
                                }
                            }
                            boolean var114;
                            if (class60.field705 >= var12 && class60.field709 >= var13 && class60.field705 < var14 && class60.field709 < var15) {
                                var114 = true;
                            } else {
                                var114 = false;
                            }
                            boolean var115 = false;
                            if ((class60.field707 == 1 || !field1400 && class60.field707 == 4) && var114) {
                                var115 = true;
                            }
                            boolean var116 = false;
                            if ((class60.field714 == 1 || !field1400 && class60.field714 == 4) && class60.field715 >= var12 && class60.field716 >= var13 && class60.field715 < var14 && class60.field716 < var15) {
                                var116 = true;
                            }
                            if (var116) {
                                client.method2377(var9, class60.field715 - var10, class60.field716 - var11);
                            }
                            if (var9.field2840 == 1400) {
                                field1128.method5168(class60.field705, class60.field709, var114 & var115, var114 & var116);
                            }
                            if (client.field1023 != null && client.field1023 != var9 && var114 && class225.method2546(client.method1528(var9))) {
                                client.field1042 = var9;
                            }
                            if (client.field1024 == var9) {
                                client.field1028 = true;
                                client.field1029 = var10;
                                client.field881 = var11;
                            }
                            if (var9.field2750) {
                                if (var114 && client.field1048 != 0 && var9.field2816 != null) {
                                    class69 var117 = new class69();
                                    var117.field787 = true;
                                    var117.field795 = var9;
                                    var117.field789 = client.field1048;
                                    var117.field792 = var9.field2816;
                                    client.field1049.method3480(var117);
                                }
                                if (client.field1023 != null || field865 != null || client.field988) {
                                    var116 = false;
                                    var115 = false;
                                    var114 = false;
                                }
                                if (!var9.field2853 && var116) {
                                    var9.field2853 = true;
                                    if (var9.field2847 != null) {
                                        class69 var118 = new class69();
                                        var118.field787 = true;
                                        var118.field795 = var9;
                                        var118.field788 = class60.field715 - var10;
                                        var118.field789 = class60.field716 - var11;
                                        var118.field792 = var9.field2847;
                                        client.field1049.method3480(var118);
                                    }
                                }
                                if (var9.field2853 && var115 && var9.field2756 != null) {
                                    class69 var119 = new class69();
                                    var119.field787 = true;
                                    var119.field795 = var9;
                                    var119.field788 = class60.field705 - var10;
                                    var119.field789 = class60.field709 - var11;
                                    var119.field792 = var9.field2756;
                                    client.field1049.method3480(var119);
                                }
                                if (var9.field2853 && !var115) {
                                    var9.field2853 = false;
                                    if (var9.field2811 != null) {
                                        class69 var120 = new class69();
                                        var120.field787 = true;
                                        var120.field795 = var9;
                                        var120.field788 = class60.field705 - var10;
                                        var120.field789 = class60.field709 - var11;
                                        var120.field792 = var9.field2811;
                                        client.field960.method3480(var120);
                                    }
                                }
                                if (var115 && var9.field2812 != null) {
                                    class69 var121 = new class69();
                                    var121.field787 = true;
                                    var121.field795 = var9;
                                    var121.field788 = class60.field705 - var10;
                                    var121.field789 = class60.field709 - var11;
                                    var121.field792 = var9.field2812;
                                    client.field1049.method3480(var121);
                                }
                                if (!var9.field2852 && var114) {
                                    var9.field2852 = true;
                                    if (var9.field2766 != null) {
                                        class69 var122 = new class69();
                                        var122.field787 = true;
                                        var122.field795 = var9;
                                        var122.field788 = class60.field705 - var10;
                                        var122.field789 = class60.field709 - var11;
                                        var122.field792 = var9.field2766;
                                        client.field1049.method3480(var122);
                                    }
                                }
                                if (var9.field2852 && var114 && var9.field2814 != null) {
                                    class69 var123 = new class69();
                                    var123.field787 = true;
                                    var123.field795 = var9;
                                    var123.field788 = class60.field705 - var10;
                                    var123.field789 = class60.field709 - var11;
                                    var123.field792 = var9.field2814;
                                    client.field1049.method3480(var123);
                                }
                                if (var9.field2852 && !var114) {
                                    var9.field2852 = false;
                                    if (var9.field2837 != null) {
                                        class69 var124 = new class69();
                                        var124.field787 = true;
                                        var124.field795 = var9;
                                        var124.field788 = class60.field705 - var10;
                                        var124.field789 = class60.field709 - var11;
                                        var124.field792 = var9.field2837;
                                        client.field960.method3480(var124);
                                    }
                                }
                                if (var9.field2826 != null) {
                                    class69 var125 = new class69();
                                    var125.field795 = var9;
                                    var125.field792 = var9.field2826;
                                    client.field1062.method3480(var125);
                                }
                                if (var9.field2820 != null && client.field1129 > var9.field2731) {
                                    if (var9.field2821 == null || client.field1129 - var9.field2731 > 32) {
                                        class69 var130 = new class69();
                                        var130.field795 = var9;
                                        var130.field792 = var9.field2820;
                                        client.field1049.method3480(var130);
                                    } else {
                                        label1030: for (int var126 = var9.field2731; var126 < client.field1129; var126++) {
                                            int var127 = client.field1036[var126 & 0x1F];
                                            for (int var128 = 0; var128 < var9.field2821.length; var128++) {
                                                if (var9.field2821[var128] == var127) {
                                                    class69 var129 = new class69();
                                                    var129.field795 = var9;
                                                    var129.field792 = var9.field2820;
                                                    client.field1049.method3480(var129);
                                                    break label1030;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2731 = client.field1129;
                                }
                                if (var9.field2822 != null && client.field992 > var9.field2791) {
                                    if (var9.field2813 == null || client.field992 - var9.field2791 > 32) {
                                        class69 var135 = new class69();
                                        var135.field795 = var9;
                                        var135.field792 = var9.field2822;
                                        client.field1049.method3480(var135);
                                    } else {
                                        label1006: for (int var131 = var9.field2791; var131 < client.field992; var131++) {
                                            int var132 = client.field1038[var131 & 0x1F];
                                            for (int var133 = 0; var133 < var9.field2813.length; var133++) {
                                                if (var9.field2813[var133] == var132) {
                                                    class69 var134 = new class69();
                                                    var134.field795 = var9;
                                                    var134.field792 = var9.field2822;
                                                    client.field1049.method3480(var134);
                                                    break label1006;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2791 = client.field992;
                                }
                                if (var9.field2824 != null && client.field1035 > var9.field2773) {
                                    if (var9.field2825 == null || client.field1035 - var9.field2773 > 32) {
                                        class69 var140 = new class69();
                                        var140.field795 = var9;
                                        var140.field792 = var9.field2824;
                                        client.field1049.method3480(var140);
                                    } else {
                                        label982: for (int var136 = var9.field2773; var136 < client.field1035; var136++) {
                                            int var137 = client.field1040[var136 & 0x1F];
                                            for (int var138 = 0; var138 < var9.field2825.length; var138++) {
                                                if (var9.field2825[var138] == var137) {
                                                    class69 var139 = new class69();
                                                    var139.field795 = var9;
                                                    var139.field792 = var9.field2824;
                                                    client.field1049.method3480(var139);
                                                    break label982;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2773 = client.field1035;
                                }
                                if (client.field936 > var9.field2715 && var9.field2743 != null) {
                                    class69 var141 = new class69();
                                    var141.field795 = var9;
                                    var141.field792 = var9.field2743;
                                    client.field1049.method3480(var141);
                                }
                                if (client.field1043 > var9.field2715 && var9.field2831 != null) {
                                    class69 var142 = new class69();
                                    var142.field795 = var9;
                                    var142.field792 = var9.field2831;
                                    client.field1049.method3480(var142);
                                }
                                if (client.field1044 > var9.field2715 && var9.field2799 != null) {
                                    class69 var143 = new class69();
                                    var143.field795 = var9;
                                    var143.field792 = var9.field2799;
                                    client.field1049.method3480(var143);
                                }
                                if (client.field1045 > var9.field2715 && var9.field2851 != null) {
                                    class69 var144 = new class69();
                                    var144.field795 = var9;
                                    var144.field792 = var9.field2851;
                                    client.field1049.method3480(var144);
                                }
                                if (client.field1046 > var9.field2715 && var9.field2838 != null) {
                                    class69 var145 = new class69();
                                    var145.field795 = var9;
                                    var145.field792 = var9.field2838;
                                    client.field1049.method3480(var145);
                                }
                                if (client.field1047 > var9.field2715 && var9.field2833 != null) {
                                    class69 var146 = new class69();
                                    var146.field795 = var9;
                                    var146.field792 = var9.field2833;
                                    client.field1049.method3480(var146);
                                }
                                var9.field2715 = client.field1101;
                                if (var9.field2830 != null) {
                                    for (int var147 = 0; var147 < client.field886; var147++) {
                                        class69 var148 = new class69();
                                        var148.field795 = var9;
                                        var148.field796 = client.field1074[var147];
                                        var148.field793 = client.field1073[var147];
                                        var148.field792 = var9.field2830;
                                        client.field1049.method3480(var148);
                                    }
                                }
                            }
                        }
                        if (!var9.field2857 && client.field1023 == null && field865 == null && !client.field988) {
                            if ((var9.field2842 >= 0 || var9.field2810 != 0) && class60.field705 >= var12 && class60.field709 >= var13 && class60.field705 < var14 && class60.field709 < var15) {
                                if (var9.field2842 >= 0) {
                                    field752 = arg0[var9.field2842];
                                } else {
                                    field752 = var9;
                                }
                            }
                            if (var9.field2809 == 8 && class60.field705 >= var12 && class60.field709 >= var13 && class60.field705 < var14 && class60.field709 < var15) {
                                field281 = var9;
                            }
                            if (var9.field2751 > var9.field2775) {
                                int var149 = var9.field2742 + var10;
                                int var150 = var9.field2775;
                                int var151 = var9.field2751;
                                int var152 = class60.field705;
                                int var153 = class60.field709;
                                if (client.field1093) {
                                    client.field932 = 32;
                                } else {
                                    client.field932 = 0;
                                }
                                client.field1093 = false;
                                if (class60.field707 == 1 || !field1400 && class60.field707 == 4) {
                                    if (var152 >= var149 && var152 < var149 + 16 && var153 >= var11 && var153 < var11 + 16) {
                                        var9.field2749 -= 4;
                                        client.method353(var9);
                                    } else if (var152 >= var149 && var152 < var149 + 16 && var153 >= var11 + var150 - 16 && var153 < var11 + var150) {
                                        var9.field2749 += 4;
                                        client.method353(var9);
                                    } else if (var152 >= var149 - client.field932 && var152 < client.field932 + var149 + 16 && var153 >= var11 + 16 && var153 < var11 + var150 - 16) {
                                        int var154 = (var150 - 32) * var150 / var151;
                                        if (var154 < 8) {
                                            var154 = 8;
                                        }
                                        int var155 = var153 - var11 - 16 - var154 / 2;
                                        int var156 = var150 - 32 - var154;
                                        var9.field2749 = (var151 - var150) * var155 / var156;
                                        client.method353(var9);
                                        client.field1093 = true;
                                    }
                                }
                                if (client.field1048 != 0) {
                                    int var157 = var9.field2742;
                                    if (var152 >= var149 - var157 && var153 >= var11 && var152 < var149 + 16 && var153 <= var11 + var150) {
                                        var9.field2749 += client.field1048 * 45;
                                        client.method353(var9);
                                    }
                                }
                            }
                        }
                    } else if ((client.field1086 == 0 || client.field1086 == 3) && (class60.field714 == 1 || !field1400 && class60.field714 == 4)) {
                        class218 var62 = var9.method3859(true);
                        if (var62 != null) {
                            int var63 = class60.field715 - var10;
                            int var64 = class60.field716 - var11;
                            if (var62.method3757(var63, var64)) {
                                int var65 = var63 - var62.field2684 / 2;
                                int var66 = var64 - var62.field2681 / 2;
                                int var67 = client.field934 & 0x7FF;
                                int var68 = class136.field1947[var67];
                                int var69 = class136.field1953[var67];
                                int var70 = var65 * var69 + var66 * var68 >> 11;
                                int var71 = var66 * var69 - var65 * var68 >> 11;
                                int var72 = field601.field1188 + var70 >> 7;
                                int var73 = field601.field1145 - var71 >> 7;
                                class171 var74 = class171.method1482(class168.field2355, client.field953.field1479);
                                var74.field2424.method2996(18);
                                var74.field2424.method3067(field1710 + var73);
                                var74.field2424.method3067(field1709 + var72);
                                var74.field2424.method3101(class51.field619[82] ? (class51.field619[81] ? 2 : 1) : 0);
                                var74.field2424.method2996(var65);
                                var74.field2424.method2996(var66);
                                var74.field2424.method2997(client.field934);
                                var74.field2424.method2996(57);
                                var74.field2424.method2996(0);
                                var74.field2424.method2996(0);
                                var74.field2424.method2996(89);
                                var74.field2424.method2997(field601.field1188);
                                var74.field2424.method2997(field601.field1145);
                                var74.field2424.method2996(63);
                                client.field953.method1783(var74);
                                client.field1084 = var72;
                                client.field1085 = var73;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fp.it([Lhk;IB)V")
    public static final void method2822(class224[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class224 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2809 == 0) {
                    if (var3.field2856 != null) {
                        method2822(var3.field2856, arg1);
                    }
                    class68 var4 = (class68) client.field1026.method3444((long) var3.field2764);
                    if (var4 != null) {
                        int var5 = var4.field781;
                        if (class224.method1621(var5)) {
                            method2822(field3299[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2834 != null) {
                    class69 var6 = new class69();
                    var6.field795 = var3;
                    var6.field792 = var3.field2834;
                    class83.method1986(var6);
                }
                if (arg1 == 1 && var3.field2722 != null) {
                    if (var3.field2728 >= 0) {
                        class224 var7 = class224.method1468(var3.field2764);
                        if (var7 == null || var7.field2856 == null || var3.field2728 >= var7.field2856.length || var7.field2856[var3.field2728] != var3) {
                            continue;
                        }
                    }
                    class69 var8 = new class69();
                    var8.field795 = var3;
                    var8.field792 = var3.field2722;
                    class83.method1986(var8);
                }
            }
        }
    }
}
