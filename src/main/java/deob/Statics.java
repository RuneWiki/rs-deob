package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("z.ek")
    public static int field10;

    @ObfuscatedName("bh.l")
    public static String field1138;

    @ObfuscatedName("z.aw")
    public static int[] field12;

    @ObfuscatedName("bo.m")
    public static class331 field1200;

    @ObfuscatedName("bq.x")
    public static class149 field1208;

    @ObfuscatedName("bq.e")
    public static class78[] field1209;

    @ObfuscatedName("cl.fe")
    public static int field1240;

    @ObfuscatedName("co.r")
    public static String[] field1261;

    @ObfuscatedName("co.n")
    public static int[] field1263;

    @ObfuscatedName("co.s")
    public static int field1264;

    @ObfuscatedName("co.t")
    public static class243 field1268;

    @ObfuscatedName("cs.bf")
    public static class332[] field1282;

    @ObfuscatedName("ci.ji")
    public static int field1290;

    @ObfuscatedName("cu.b")
    public static int field1291;

    @ObfuscatedName("ce.f")
    public static int field1300;

    @ObfuscatedName("ck.cv")
    public static class264 field1301;

    @ObfuscatedName("ck.lq")
    public static int field1309;

    @ObfuscatedName("ck.fh")
    public static class138 field1312;

    @ObfuscatedName("cc.qk")
    public static class175 field1317;

    @ObfuscatedName("cc.qc")
    public static class80 field1319;

    @ObfuscatedName("cn.ai")
    public static Image field1324;

    @ObfuscatedName("cj.g")
    public static String field1326;

    @ObfuscatedName("cj.s")
    public static int field1332;

    @ObfuscatedName("cj.rv")
    public static int field1334;

    @ObfuscatedName("cx.y")
    public static class332 field1339;

    @ObfuscatedName("cx.e")
    public static class331[] field1340;

    @ObfuscatedName("cx.k")
    public static class332 field1341;

    @ObfuscatedName("cx.s")
    public static class331 field1342;

    @ObfuscatedName("cx.h")
    public static class331 field1343;

    @ObfuscatedName("cx.d")
    public static boolean field1344;

    @ObfuscatedName("cx.n")
    public static class331 field1357;

    @ObfuscatedName("cp.s")
    public static int[] field1397;

    @ObfuscatedName("n.d")
    public static class262 field14;

    @ObfuscatedName("cf.e")
    public static int field1437;

    @ObfuscatedName("ct.my")
    public static class95 field1438;

    @ObfuscatedName("ct.iz")
    public static int field1439;

    @ObfuscatedName("cz.pn")
    public static class108 field1464;

    @ObfuscatedName("cz.p")
    public static class331[] field1467;

    @ObfuscatedName("dh.t")
    public static class107[] field1498;

    @ObfuscatedName("dh.a")
    public static float[] field1499;

    @ObfuscatedName("n.br")
    public static int field15;

    @ObfuscatedName("dh.k")
    public static byte[] field1504;

    @ObfuscatedName("dh.s")
    public static int field1505;

    @ObfuscatedName("dh.g")
    public static float[] field1506;

    @ObfuscatedName("dh.p")
    public static int field1507;

    @ObfuscatedName("dh.m")
    public static int field1508;

    @ObfuscatedName("dh.h")
    public static class103[] field1509;

    @ObfuscatedName("dh.w")
    public static float[] field1510;

    @ObfuscatedName("dh.i")
    public static class114[] field1511;

    @ObfuscatedName("dh.q")
    public static boolean[] field1513;

    @ObfuscatedName("dh.v")
    public static int[] field1514;

    @ObfuscatedName("dh.ap")
    public static float[] field1517;

    @ObfuscatedName("dh.o")
    public static float[] field1521;

    @ObfuscatedName("dh.u")
    public static class119[] field1522;

    @ObfuscatedName("dh.ak")
    public static float[] field1524;

    @ObfuscatedName("dh.x")
    public static int field1525;

    @ObfuscatedName("dh.ac")
    public static float[] field1526;

    @ObfuscatedName("dh.aw")
    public static int[] field1527;

    @ObfuscatedName("dh.as")
    public static int[] field1528;

    @ObfuscatedName("do.x")
    public static int[] field1544;

    @ObfuscatedName("do.h")
    public static boolean[] field1546;

    @ObfuscatedName("do.m")
    public static int[] field1547;

    @ObfuscatedName("dg.x")
    public static class110 field1551;

    @ObfuscatedName("dg.y")
    public static boolean field1557;

    @ObfuscatedName("dg.t")
    public static class102 field1566;

    @ObfuscatedName("dg.cn")
    public static int field1570;

    @ObfuscatedName("dc.k")
    public static int field1592;

    @ObfuscatedName("dn.go")
    public static int field1606;

    @ObfuscatedName("dr.p")
    public static int field1632;

    @ObfuscatedName("dr.s")
    public static float field1634;

    @ObfuscatedName("dv.m")
    public static int field1782;

    @ObfuscatedName("du.u")
    public static int[] field1789;

    @ObfuscatedName("r.pe")
    public static int field18;

    @ObfuscatedName("ew.pq")
    public static int field1833;

    @ObfuscatedName("el.bm")
    public static int field1865;

    @ObfuscatedName("el.bz")
    public static int field1892;

    @ObfuscatedName("el.bt")
    public static int field1893;

    @ObfuscatedName("eh.s")
    public static int field1905;

    @ObfuscatedName("eh.y")
    public static int field1908;

    @ObfuscatedName("ex.es")
    public static class170 field1913;

    @ObfuscatedName("es.v")
    public static int field1920;

    @ObfuscatedName("es.b")
    public static int field1930;

    @ObfuscatedName("es.i")
    public static int field1932;

    @ObfuscatedName("es.u")
    public static int field1933;

    @ObfuscatedName("es.q")
    public static int field1934;

    @ObfuscatedName("es.f")
    public static int field1936;

    @ObfuscatedName("es.c")
    public static int field1938;

    @ObfuscatedName("es.t")
    public static int field1939;

    @ObfuscatedName("es.g")
    public static class144 field1941;

    @ObfuscatedName("eu.fp")
    public static class332[] field1954;

    @ObfuscatedName("ej.fi")
    public static class332 field1958;

    @ObfuscatedName("ej.de")
    public static int field1961;

    @ObfuscatedName("ec.bf")
    public static int field1968;

    @ObfuscatedName("ec.o")
    public static int field1969;

    @ObfuscatedName("ec.w")
    public static int field1971;

    @ObfuscatedName("ec.aw")
    public static int field1975;

    @ObfuscatedName("ec.f")
    public static int field1978;

    @ObfuscatedName("ec.v")
    public static int field1979;

    @ObfuscatedName("ec.b")
    public static int field1981;

    @ObfuscatedName("ec.c")
    public static int field1982;

    @ObfuscatedName("ec.j")
    public static int field1983;

    @ObfuscatedName("ec.l")
    public static int field1984;

    @ObfuscatedName("ec.a")
    public static int field1988;

    @ObfuscatedName("ec.ak")
    public static int field1989;

    @ObfuscatedName("ec.ap")
    public static int field1990;

    @ObfuscatedName("ec.ac")
    public static int field1991;

    @ObfuscatedName("ec.g")
    public static int field1994;

    @ObfuscatedName("ec.bu")
    public static int field1999;

    @ObfuscatedName("ec.bj")
    public static int field2004;

    @ObfuscatedName("ec.bs")
    public static boolean[][] field2019;

    @ObfuscatedName("ec.bz")
    public static int field2021;

    @ObfuscatedName("ec.bt")
    public static int field2022;

    @ObfuscatedName("ec.bm")
    public static int field2023;

    @ObfuscatedName("eb.cm")
    public static class264 field2028;

    @ObfuscatedName("eq.et")
    public static class312 field2079;

    @ObfuscatedName("ep.qe")
    public static class14 field2095;

    @ObfuscatedName("ed.x")
    public static int field2098;

    @ObfuscatedName("ed.fg")
    public static class331[] field2101;

    @ObfuscatedName("ed.kq")
    public static class88 field2103;

    @ObfuscatedName("ez.r")
    public static byte[][][] field2108;

    @ObfuscatedName("eo.aj")
    public static int field2112;

    @ObfuscatedName("eo.ip")
    public static class243 field2115;

    @ObfuscatedName("ek.bs")
    public static class259 field2119;

    @ObfuscatedName("ee.dx")
    public static class264 field2122;

    @ObfuscatedName("en.n")
    public static int field2125;

    @ObfuscatedName("ev.cy")
    public static class264 field2129;

    @ObfuscatedName("fr.fy")
    public static int[][] field2147;

    @ObfuscatedName("fl.iu")
    public static class243 field2148;

    @ObfuscatedName("fm.n")
    public static int field2171;

    @ObfuscatedName("fm.z")
    public static String field2173;

    @ObfuscatedName("fm.ph")
    public static int field2174;

    @ObfuscatedName("fv.z")
    public static String field2184;

    @ObfuscatedName("fv.lt")
    public static class243[] field2185;

    @ObfuscatedName("fv.d")
    public static String field2189;

    @ObfuscatedName("fe.f")
    public static String[] field2195;

    @ObfuscatedName("fe.y")
    public static int field2196;

    @ObfuscatedName("fe.e")
    public static File field2198;

    @ObfuscatedName("r.d")
    public static long field22;

    @ObfuscatedName("fe.v")
    public static String[] field2202;

    @ObfuscatedName("fe.j")
    public static String field2205;

    @ObfuscatedName("fe.ey")
    public static class311 field2207;

    @ObfuscatedName("fi.fw")
    public static class332 field2211;

    @ObfuscatedName("fw.z")
    public static File field2213;

    @ObfuscatedName("fw.bx")
    public static class331[] field2216;

    @ObfuscatedName("fg.gk")
    public static int field2219;

    @ObfuscatedName("fg.t")
    public static int field2223;

    @ObfuscatedName("k.gu")
    public static class7[] field226;

    @ObfuscatedName("fo.y")
    public static int field2272;

    @ObfuscatedName("fo.ac")
    public static int[] field2278;

    @ObfuscatedName("fj.cz")
    public static class264 field2279;

    @ObfuscatedName("fj.be")
    public static class331[] field2284;

    @ObfuscatedName("r.s")
    public static class262 field23;

    @ObfuscatedName("s.as")
    public static FontMetrics field232;

    @ObfuscatedName("s.eh")
    public static class166 field234;

    @ObfuscatedName("s.x")
    public static class331 field236;

    @ObfuscatedName("fk.dc")
    public static class264 field2374;

    @ObfuscatedName("p.fc")
    public static class331[] field239;

    @ObfuscatedName("p.k")
    public static int[] field243;

    @ObfuscatedName("p.ct")
    public static class264 field244;

    @ObfuscatedName("x.dt")
    public static String field249;

    @ObfuscatedName("ga.r")
    public static File field2500;

    @ObfuscatedName("ga.t")
    public static class111 field2501;

    @ObfuscatedName("x.nu")
    public static class321 field251;

    @ObfuscatedName("gy.fl")
    public static byte[][] field2571;

    @ObfuscatedName("gv.k")
    public static int[] field2579;

    @ObfuscatedName("gv.p")
    public static byte[][][] field2580;

    @ObfuscatedName("gv.x")
    public static short[][] field2581;

    @ObfuscatedName("gv.o")
    public static int field2582;

    @ObfuscatedName("gv.ca")
    public static class264 field2583;

    @ObfuscatedName("gq.z")
    public static long field2586;

    @ObfuscatedName("gg.be")
    public static int field2603;

    @ObfuscatedName("gi.d")
    public static Applet field2605;

    @ObfuscatedName("m.bb")
    public static class70 field263;

    @ObfuscatedName("m.pu")
    public static int field265;

    @ObfuscatedName("hi.pi")
    public static int field2686;

    @ObfuscatedName("hc.y")
    public static class262 field2688;

    @ObfuscatedName("hc.d")
    public static class262 field2689;

    @ObfuscatedName("hc.n")
    public static class262 field2690;

    @ObfuscatedName("hc.r")
    public static class231 field2691;

    @ObfuscatedName("hc.k")
    public static int field2692;

    @ObfuscatedName("hc.p")
    public static int field2693;

    @ObfuscatedName("hc.z")
    public static class262 field2694;

    @ObfuscatedName("e.fz")
    public static class332[] field27;

    @ObfuscatedName("h.o")
    public static int[] field272;

    @ObfuscatedName("h.is")
    public static class124 field273;

    @ObfuscatedName("h.pg")
    public static int field276;

    @ObfuscatedName("ht.da")
    public static int field2760;

    @ObfuscatedName("ht.fj")
    public static class331[] field2769;

    @ObfuscatedName("h.e")
    public static int field277;

    @ObfuscatedName("ik.s")
    public static short[][] field2777;

    @ObfuscatedName("t.y")
    public static class262 field278;

    @ObfuscatedName("ia.ff")
    public static class332[] field2811;

    @ObfuscatedName("iw.y")
    public static class243[][] field2817;

    @ObfuscatedName("iw.m")
    public static class262 field2819;

    @ObfuscatedName("i.t")
    public static boolean field282;

    @ObfuscatedName("iw.k")
    public static boolean[] field2863;

    @ObfuscatedName("e.qt")
    public static int field29;

    @ObfuscatedName("is.kx")
    public static int field2961;

    @ObfuscatedName("q.fr")
    public static int[] field298;

    @ObfuscatedName("ib.dl")
    public static int field2996;

    @ObfuscatedName("q.ap")
    public static int[] field300;

    @ObfuscatedName("ii.rt")
    public static class335 field3008;

    @ObfuscatedName("ix.s")
    public static ScheduledExecutorService field3016;

    @ObfuscatedName("q.if")
    public static class73 field302;

    @ObfuscatedName("q.i")
    public static class261 field304;

    @ObfuscatedName("q.z")
    public static class262 field305;

    @ObfuscatedName("e.p")
    public static class262 field31;

    @ObfuscatedName("v.p")
    public static int field310;

    @ObfuscatedName("v.dh")
    public static class264 field313;

    @ObfuscatedName("v.k")
    public static short[] field315;

    @ObfuscatedName("f.pc")
    public static int field316;

    @ObfuscatedName("f.i")
    public static int[] field317;

    @ObfuscatedName("f.fu")
    public static byte[][] field321;

    @ObfuscatedName("f.h")
    public static int[] field322;

    @ObfuscatedName("f.z")
    public static class262 field323;

    @ObfuscatedName("b.d")
    public static int field326;

    @ObfuscatedName("c.x")
    public static int[] field328;

    @ObfuscatedName("c.r")
    public static class331 field329;

    @ObfuscatedName("iv.qm")
    public static long field3304;

    @ObfuscatedName("j.c")
    public static class195 field334;

    @ObfuscatedName("iz.cb")
    public static class264 field3342;

    @ObfuscatedName("it.t")
    public static class331 field3359;

    @ObfuscatedName("j.dg")
    public static class264 field336;

    @ObfuscatedName("jk.gj")
    public static int field3373;

    @ObfuscatedName("jk.jm")
    public static int field3389;

    @ObfuscatedName("j.i")
    public static class243 field339;

    @ObfuscatedName("ja.bn")
    public static class331 field3391;

    @ObfuscatedName("ja.e")
    public static Thread field3394;

    @ObfuscatedName("j.ao")
    public static class329 field340;

    @ObfuscatedName("jv.n")
    public static long field3415;

    @ObfuscatedName("jv.q")
    public static class195 field3419;

    @ObfuscatedName("jv.d")
    public static class170 field3420;

    @ObfuscatedName("jj.p")
    public static int[] field3426;

    @ObfuscatedName("jh.p")
    public static int field3436;

    @ObfuscatedName("jp.d")
    public static class262 field3444;

    @ObfuscatedName("jo.d")
    public static class262 field3446;

    @ObfuscatedName("jo.z")
    public static int field3447;

    @ObfuscatedName("jw.z")
    public static class270[] field3450;

    @ObfuscatedName("jw.d")
    public static class262 field3469;

    @ObfuscatedName("l.bu")
    public static class336 field347;

    @ObfuscatedName("jr.d")
    public static class262 field3472;

    @ObfuscatedName("ju.d")
    public static class262 field3476;

    @ObfuscatedName("l.cr")
    public static class264 field348;

    @ObfuscatedName("jq.z")
    public static class262 field3481;

    @ObfuscatedName("l.ql")
    public static class338 field349;

    @ObfuscatedName("jq.d")
    public static class262 field3494;

    @ObfuscatedName("jy.d")
    public static class262 field3496;

    @ObfuscatedName("je.n")
    public static int field3509;

    @ObfuscatedName("je.z")
    public static class262 field3511;

    @ObfuscatedName("jc.d")
    public static class262 field3516;

    @ObfuscatedName("jc.z")
    public static class262 field3517;

    @ObfuscatedName("g.cc")
    public static char field352;

    @ObfuscatedName("jl.fx")
    public static class332[] field3533;

    @ObfuscatedName("jf.d")
    public static class262 field3535;

    @ObfuscatedName("jf.y")
    public static int[] field3540;

    @ObfuscatedName("jm.fb")
    public static class332[] field3547;

    @ObfuscatedName("jm.d")
    public static class262 field3548;

    @ObfuscatedName("ji.d")
    public static class262 field3551;

    @ObfuscatedName("jn.ez")
    public static int field3556;

    @ObfuscatedName("jn.d")
    public static class262 field3557;

    @ObfuscatedName("jn.cu")
    public static boolean field3560;

    @ObfuscatedName("jb.n")
    public static class262 field3565;

    @ObfuscatedName("w.aa")
    public static client field357;

    @ObfuscatedName("jb.d")
    public static class262 field3578;

    @ObfuscatedName("jd.n")
    public static class262 field3590;

    @ObfuscatedName("jd.z")
    public static class262 field3610;

    @ObfuscatedName("jx.s")
    public static boolean field3643;

    @ObfuscatedName("jx.p")
    public static int field3644;

    @ObfuscatedName("y.h")
    public static class236 field37;

    @ObfuscatedName("jz.x")
    public static int field3700;

    @ObfuscatedName("jz.om")
    public static class108 field3703;

    @ObfuscatedName("jg.z")
    public static class262 field3711;

    @ObfuscatedName("o.cx")
    public static class170 field373;

    @ObfuscatedName("kg.d")
    public static class262 field3747;

    @ObfuscatedName("ki.by")
    public static String field3753;

    @ObfuscatedName("a.bj")
    public static String field376;

    @ObfuscatedName("ki.d")
    public static class262 field3769;

    @ObfuscatedName("kk.k")
    public static class262 field3773;

    @ObfuscatedName("kc.l")
    public static int[] field3776;

    @ObfuscatedName("y.cf")
    public static class264 field38;

    @ObfuscatedName("kt.ah")
    public static boolean field3806;

    @ObfuscatedName("a.og")
    public static class332 field382;

    @ObfuscatedName("kq.w")
    public static int[] field3827;

    @ObfuscatedName("kn.h")
    public static int field3831;

    @ObfuscatedName("kv.o")
    public static int[] field3846;

    @ObfuscatedName("kx.as")
    public static int[] field3867;

    @ObfuscatedName("kp.jn")
    public static int field3878;

    @ObfuscatedName("ak.fo")
    public static class332[] field388;

    @ObfuscatedName("lk.x")
    public static class331[] field3891;

    @ObfuscatedName("le.d")
    public static class187 field3904;

    @ObfuscatedName("lz.n")
    public static class262 field3905;

    @ObfuscatedName("ld.t")
    public static class173 field3912;

    @ObfuscatedName("lw.m")
    public static int[] field3920;

    @ObfuscatedName("ll.ch")
    public static long field3930;

    @ObfuscatedName("lo.d")
    public static class262 field3941;

    @ObfuscatedName("lc.ac")
    public static int field3953;

    @ObfuscatedName("lc.aw")
    public static int field3954;

    @ObfuscatedName("lc.ap")
    public static int[] field3958;

    @ObfuscatedName("lr.t")
    public static class312 field3960;

    @ObfuscatedName("ak.mj")
    public static class169 field397;

    @ObfuscatedName("li.r")
    public static int[] field3991;

    @ObfuscatedName("li.n")
    public static int field3992;

    @ObfuscatedName("li.p")
    public static byte[][] field3993;

    @ObfuscatedName("li.e")
    public static int[] field3994;

    @ObfuscatedName("li.s")
    public static int[] field3995;

    @ObfuscatedName("li.z")
    public static int field3996;

    @ObfuscatedName("ac.fv")
    public static int field413;

    @ObfuscatedName("ac.ab")
    public static GarbageCollectorMXBean field422;

    @ObfuscatedName("ac.ar")
    public static String field426;

    @ObfuscatedName("aw.x")
    public static class262 field429;

    @ObfuscatedName("aw.t")
    public static int[] field431;

    @ObfuscatedName("aw.ol")
    public static class101 field432;

    @ObfuscatedName("as.gb")
    public static int field444;

    @ObfuscatedName("as.ed")
    public static int field445;

    @ObfuscatedName("au.gx")
    public static int field446;

    @ObfuscatedName("au.lp")
    public static int field450;

    @ObfuscatedName("al.fd")
    public static int[] field464;

    @ObfuscatedName("ai.fq")
    public static int[] field476;

    @ObfuscatedName("ai.gc")
    public static int field477;

    @ObfuscatedName("ai.hk")
    public static class243 field478;

    @ObfuscatedName("az.kl")
    public static class243 field498;

    @ObfuscatedName("aq.ib")
    public static int field505;

    @ObfuscatedName("ae.m")
    public static boolean field507;

    @ObfuscatedName("ae.aa")
    public static int field513;

    @ObfuscatedName("ad.x")
    public static int field520;

    @ObfuscatedName("ad.ps")
    public static int field521;

    @ObfuscatedName("ao.pl")
    public static int field531;

    @ObfuscatedName("ao.kj")
    public static int field541;

    @ObfuscatedName("at.em")
    public static class312 field548;

    @ObfuscatedName("ag.by")
    public static class258 field564;

    @ObfuscatedName("ax.dk")
    public static int field574;

    @ObfuscatedName("ah.eb")
    public static class148 field578;

    @ObfuscatedName("ah.qf")
    public static short[] field579;

    @ObfuscatedName("ah.kn")
    public static class243 field580;

    @ObfuscatedName("am.od")
    public static boolean field589;

    @ObfuscatedName("aj.el")
    public static long field604;

    @ObfuscatedName("aj.bf")
    public static String field614;

    @ObfuscatedName("aj.gu")
    public static int field617;

    @ObfuscatedName("av.e")
    public static int field646;

    @ObfuscatedName("bc.ei")
    public static class312 field648;

    @ObfuscatedName("bc.v")
    public static class49 field650;

    @ObfuscatedName("bc.u")
    public static class122[] field654;

    @ObfuscatedName("by.q")
    public static int field656;

    @ObfuscatedName("by.gd")
    public static int field658;

    @ObfuscatedName("bl.dw")
    public static class264 field662;

    @ObfuscatedName("bl.qz")
    public static class79 field663;

    @ObfuscatedName("bu.pt")
    public static class115 field674;

    @ObfuscatedName("bt.q")
    public static int field689;

    @ObfuscatedName("bt.aw")
    public static Font field693;

    @ObfuscatedName("bt.g")
    public static int field695;

    @ObfuscatedName("bt.d")
    public static class167 field698;

    @ObfuscatedName("bt.s")
    public static int field704;

    @ObfuscatedName("bf.px")
    public static int field734;

    @ObfuscatedName("bj.y")
    public static byte[][][] field735;

    @ObfuscatedName("bj.u")
    public static int[][][] field739;

    @ObfuscatedName("bj.k")
    public static byte[][][] field740;

    @ObfuscatedName("bj.s")
    public static byte[][][] field741;

    @ObfuscatedName("bj.p")
    public static int[][] field742;

    @ObfuscatedName("bj.e")
    public static byte[][][] field745;

    @ObfuscatedName("bj.eo")
    public static int field752;

    @ObfuscatedName("bx.g")
    public static int[] field756;

    @ObfuscatedName("bx.ln")
    public static int field759;

    @ObfuscatedName("bx.bx")
    public static int field760;

    @ObfuscatedName("bw.dd")
    public static class264 field771;

    @ObfuscatedName("bg.ok")
    public static class308 field785;

    @ObfuscatedName("bg.ko")
    public static int field786;

    @ObfuscatedName("bi.bj")
    public static class331[] field801;

    @ObfuscatedName("bb.jf")
    public static int field803;

    @ObfuscatedName("ba.ix")
    public static int field821;

    @ObfuscatedName("ba.p")
    public static short[] field822;

    @ObfuscatedName("bp.rl")
    public static class266 field853;

    @ObfuscatedName("bp.cj")
    public static class166 field856;

    @ObfuscatedName("z.do")
    public static class264 field9;

    @ObfuscatedName("client.cq")
    public static class264 field955;

    @ObfuscatedName("cg.z(B)V")
    public static final void method1562() {
        if (class133.field1911) {
            return;
        }
        int var0 = field1989;
        int var1 = field1990;
        int var2 = field1991;
        int var3 = field1975;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (class133.field1904 - field1939) * var4 / class135.field1921;
        int var7 = (class133.field1906 - field1932) * var4 / class135.field1921;
        int var8 = (class133.field1904 - field1939) * var5 / class135.field1921;
        int var9 = (class133.field1906 - field1932) * var5 / class135.field1921;
        int var10 = class135.method2635(var7, var4, var1, var0);
        int var11 = class135.method2636(var7, var4, var1, var0);
        int var13 = class135.method2635(var9, var5, var1, var0);
        int var14 = class135.method2636(var9, var5, var1, var0);
        int var16 = class135.method2633(var6, var11, var3, var2);
        int var17 = class135.method2616(var6, var11, var3, var2);
        int var19 = class135.method2633(var8, var14, var3, var2);
        int var20 = class135.method2616(var8, var14, var3, var2);
        field1437 = (var16 + var19) / 2;
        field1908 = (var10 + var13) / 2;
        field1592 = (var17 + var20) / 2;
        field1905 = (var19 - var16) / 2;
        field3436 = (var13 - var10) / 2;
        field520 = (var20 - var17) / 2;
        field1782 = Math.abs(field1905);
        field3831 = Math.abs(field3436);
        field2223 = Math.abs(field520);
    }

    @ObfuscatedName("g.n(II)Z")
    public static boolean method152(int arg0) {
        return class248.field2991.field3006 == arg0;
    }

    @ObfuscatedName("af.n(IIII)I")
    public static int method332(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("fe.z(CII)C")
    public static char method3043(char arg0, int arg1) {
        if (arg0 >= 192 && arg0 <= 255) {
            if (arg0 >= 192 && arg0 <= 198) {
                return 'A';
            }
            if (arg0 == 199) {
                return 'C';
            }
            if (arg0 >= 200 && arg0 <= 203) {
                return 'E';
            }
            if (arg0 >= 204 && arg0 <= 207) {
                return 'I';
            }
            if (arg0 >= 210 && arg0 <= 214) {
                return 'O';
            }
            if (arg0 >= 217 && arg0 <= 220) {
                return 'U';
            }
            if (arg0 == 221) {
                return 'Y';
            }
            if (arg0 == 223) {
                return 's';
            }
            if (arg0 >= 224 && arg0 <= 230) {
                return 'a';
            }
            if (arg0 == 231) {
                return 'c';
            }
            if (arg0 >= 232 && arg0 <= 235) {
                return 'e';
            }
            if (arg0 >= 236 && arg0 <= 239) {
                return 'i';
            }
            if (arg0 >= 242 && arg0 <= 246) {
                return 'o';
            }
            if (arg0 >= 249 && arg0 <= 252) {
                return 'u';
            }
            if (arg0 == 253 || arg0 == 255) {
                return 'y';
            }
        }
        if (arg0 == 338) {
            return 'O';
        } else if (arg0 == 339) {
            return 'o';
        } else if (arg0 == 376) {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("ag.n([BIIII[Lfb;I)V")
    public static final void method544(byte[] arg0, int arg1, int arg2, int arg3, int arg4, class177[] arg5) {
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                for (int var8 = 0; var8 < 64; var8++) {
                    if (arg1 + var7 > 0 && arg1 + var7 < 103 && arg2 + var8 > 0 && arg2 + var8 < 103) {
                        arg5[var6].field2266[arg1 + var7][arg2 + var8] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class195 var9 = new class195(arg0);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    method3074(var9, var10, arg1 + var11, arg2 + var12, arg3, arg4, 0);
                }
            }
        }
    }

    @ObfuscatedName("ew.n([Lbq;II[I[II)V")
    public static void method2521(class78[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class78 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field1214;
                        var12 = var8.field1214;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field1217;
                        var12 = var8.field1217;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1524() ? 1 : 0;
                        var12 = var8.method1524() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field1215;
                        var12 = var8.field1215;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field1214;
                        var16 = var8.field1214;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field1217;
                        var16 = var8.field1217;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1524() ? 1 : 0;
                        var16 = var8.method1524() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field1215;
                        var16 = var8.field1215;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class78 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2521(arg0, arg1, var6, arg3, arg4);
        method2521(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("fg.e(Lgy;IIIIIII)V")
    public static final void method3074(class195 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var16 = arg0.method3330();
                if (var16 == 0) {
                    break;
                }
                if (var16 == 1) {
                    arg0.method3330();
                    break;
                }
                if (var16 <= 49) {
                    arg0.method3330();
                }
            }
            return;
        }
        class63.field736[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method3330();
            if (var7 == 0) {
                if (arg1 == 0) {
                    int[] var8 = class63.field738[0][arg2];
                    int var10 = arg2 + 932731 + arg4;
                    int var11 = arg3 + 556238 + arg5;
                    int var12 = class63.method23(var10 + 45365, var11 + 91923, 4) - 128 + (class63.method23(var10 + 10294, var11 + 37821, 2) - 128 >> 1) + (class63.method23(var10, var11, 1) - 128 >> 2);
                    int var13 = (int) ((double) var12 * 0.3D) + 35;
                    if (var13 < 10) {
                        var13 = 10;
                    } else if (var13 > 60) {
                        var13 = 60;
                    }
                    var8[arg3] = -var13 * 8;
                } else {
                    class63.field738[arg1][arg2][arg3] = class63.field738[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var15 = arg0.method3330();
                if (var15 == 1) {
                    var15 = 0;
                }
                if (arg1 == 0) {
                    class63.field738[0][arg2][arg3] = -var15 * 8;
                } else {
                    class63.field738[arg1][arg2][arg3] = class63.field738[arg1 - 1][arg2][arg3] - var15 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                field745[arg1][arg2][arg3] = arg0.method3421();
                field735[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                field740[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                class63.field736[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                field2108[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("u.u(Ljava/lang/String;I)V")
    public static final void method82(String arg0) {
        class185 var1 = class185.method251(class182.field2381, client.field900.field1471);
        var1.field2497.method3243(class195.method240(arg0));
        var1.field2497.method3250(arg0);
        client.field900.method1921(var1);
    }

    @ObfuscatedName("cs.u(Ljk;IB)Z")
    public static boolean method1712(class262 arg0, int arg1) {
        byte[] var2 = arg0.method4280(arg1);
        if (var2 == null) {
            return false;
        } else {
            class333.method5143(var2);
            return true;
        }
    }

    @ObfuscatedName("by.h(I)V")
    public static void method696() {
        class240.field2797.method3700();
    }

    @ObfuscatedName("fb.t(IIIIIZI)Lly;")
    public static final class332 method3146(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class332 var8 = (class332) class284.field3647.method3707(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class284 var9 = class284.method4245(arg0);
        if (arg1 > 1 && var9.field3681 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3680[var11] && var9.field3680[var11] != 0) {
                    var10 = var9.field3681[var11];
                }
            }
            if (var10 != -1) {
                var9 = class284.method4245(var10);
            }
        }
        class132 var12 = var9.method4756(1);
        if (var12 == null) {
            return null;
        }
        class332 var13 = null;
        if (var9.field3684 != -1) {
            var13 = method3146(var9.field3639, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3692 != -1) {
            var13 = method3146(var9.field3695, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3694 != -1) {
            var13 = method3146(var9.field3693, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = field3958;
        int var15 = field3953;
        int var16 = field3954;
        int[] var17 = new int[4];
        class328.method5414(var17);
        class332 var18 = new class332(36, 32);
        class328.method5374(var18.field3983, 36, 32);
        class328.method5383();
        class135.method2674();
        class135.method2693(16, 16);
        class135.field1922 = false;
        if (var9.field3694 != -1) {
            var13.method5459(0, 0);
        }
        int var19 = var9.field3682;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class135.field1940[var9.field3656] * var19 >> 16;
        int var21 = class135.field1945[var9.field3656] * var19 >> 16;
        var12.method2592();
        var12.method2541(0, var9.field3657, var9.field3674, var9.field3656, var9.field3659, var9.field3660 + var12.field2027 / 2 + var20, var9.field3660 + var21);
        if (var9.field3692 != -1) {
            var13.method5459(0, 0);
        }
        if (arg2 >= 1) {
            var18.method5452(1);
        }
        if (arg2 >= 2) {
            var18.method5452(16777215);
        }
        if (arg3 != 0) {
            var18.method5453(arg3);
        }
        class328.method5374(var18.field3983, 36, 32);
        if (var9.field3684 != -1) {
            var13.method5459(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3661 == 1) {
            class312 var22 = field3960;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class252.field3240 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class252.field3181 + "</col>";
            }
            var22.method5232(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            class284.field3647.method3697(var18, var6);
        }
        class328.method5374(var14, var15, var16);
        class328.method5343(var17);
        class135.method2674();
        class135.field1922 = true;
        return var18;
    }

    @ObfuscatedName("a.v(IIIB)I")
    public static final int method183(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ah.hr(III)Ljava/lang/String;")
    public static final String method554(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class87.method3100(16711680);
        } else if (var2 < -6) {
            return class87.method3100(16723968);
        } else if (var2 < -3) {
            return class87.method3100(16740352);
        } else if (var2 < 0) {
            return class87.method3100(16756736);
        } else if (var2 > 9) {
            return class87.method3100(65280);
        } else if (var2 > 6) {
            return class87.method3100(4259584);
        } else if (var2 > 3) {
            return class87.method3100(8453888);
        } else if (var2 > 0) {
            return class87.method3100(12648192);
        } else {
            return class87.method3100(16776960);
        }
    }

    @ObfuscatedName("ik.jq(Liw;I)Z")
    public static boolean method4090(class243 arg0) {
        return arg0.field2846;
    }
}
