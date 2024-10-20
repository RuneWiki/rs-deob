package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("client.by")
    public static String field1033;

    @ObfuscatedName("client.ay")
    public static int[] field1081;

    @ObfuscatedName("bx.gl")
    public static int field1158;

    @ObfuscatedName("bx.oa")
    public static int field1159;

    @ObfuscatedName("cv.fv")
    public static class309[] field1217;

    @ObfuscatedName("cc.w")
    public static int[] field1220;

    @ObfuscatedName("cc.s")
    public static String[] field1221;

    @ObfuscatedName("cc.fn")
    public static int[][] field1223;

    @ObfuscatedName("cc.r")
    public static int field1234;

    @ObfuscatedName("cw.om")
    public static class107 field1249;

    @ObfuscatedName("cw.od")
    public static class100 field1252;

    @ObfuscatedName("cw.h")
    public static int field1255;

    @ObfuscatedName("ct.h")
    public static int field1269;

    @ObfuscatedName("ct.ej")
    public static int field1272;

    @ObfuscatedName("cl.q")
    public static class110 field1282;

    @ObfuscatedName("cl.es")
    public static class287 field1288;

    @ObfuscatedName("ci.k")
    public static class185 field1291;

    @ObfuscatedName("cu.ck")
    public static class249 field1300;

    @ObfuscatedName("co.w")
    public static class309 field1303;

    @ObfuscatedName("co.s")
    public static class309 field1304;

    @ObfuscatedName("co.h")
    public static class309 field1306;

    @ObfuscatedName("co.f")
    public static int field1308;

    @ObfuscatedName("co.o")
    public static class309 field1310;

    @ObfuscatedName("co.a")
    public static class310 field1317;

    @ObfuscatedName("co.p")
    public static boolean field1321;

    @ObfuscatedName("co.j")
    public static class77[] field1322;

    @ObfuscatedName("cm.a")
    public static class247 field1370;

    @ObfuscatedName("cm.j")
    public static Thread field1371;

    @ObfuscatedName("cm.m")
    public static int[][] field1372;

    @ObfuscatedName("cn.fo")
    public static class310 field1389;

    @ObfuscatedName("cb.qg")
    public static class14 field1398;

    @ObfuscatedName("cq.ao")
    public static int[] field1405;

    @ObfuscatedName("cq.y")
    public static class185 field1406;

    @ObfuscatedName("cd.oq")
    public static int field1410;

    @ObfuscatedName("cd.lp")
    public static class228[] field1418;

    @ObfuscatedName("cd.ql")
    public static int field1421;

    @ObfuscatedName("cj.ar")
    public static int[] field1441;

    @ObfuscatedName("cp.h")
    public static int field1467;

    @ObfuscatedName("cp.t")
    public static byte[] field1472;

    @ObfuscatedName("cp.m")
    public static int field1474;

    @ObfuscatedName("cp.q")
    public static class106[] field1475;

    @ObfuscatedName("cp.x")
    public static class102[] field1476;

    @ObfuscatedName("cp.v")
    public static class113[] field1479;

    @ObfuscatedName("cp.n")
    public static class118[] field1480;

    @ObfuscatedName("cp.y")
    public static boolean[] field1481;

    @ObfuscatedName("cp.d")
    public static int[] field1482;

    @ObfuscatedName("cp.o")
    public static int field1485;

    @ObfuscatedName("cp.r")
    public static int field1486;

    @ObfuscatedName("cp.z")
    public static float[] field1489;

    @ObfuscatedName("cp.b")
    public static float[] field1490;

    @ObfuscatedName("cp.c")
    public static float[] field1491;

    @ObfuscatedName("cp.aa")
    public static float[] field1492;

    @ObfuscatedName("cp.ap")
    public static float[] field1493;

    @ObfuscatedName("cp.ao")
    public static float[] field1494;

    @ObfuscatedName("cp.ar")
    public static int[] field1495;

    @ObfuscatedName("cp.ay")
    public static int[] field1496;

    @ObfuscatedName("cp.g")
    public static float[] field1498;

    @ObfuscatedName("s.bl")
    public static class69 field15;

    @ObfuscatedName("du.o")
    public static int[] field1511;

    @ObfuscatedName("du.h")
    public static int[] field1514;

    @ObfuscatedName("du.x")
    public static boolean[] field1516;

    @ObfuscatedName("do.m")
    public static int field1535;

    @ObfuscatedName("df.i")
    public static class247 field1547;

    @ObfuscatedName("df.ag")
    public static String field1548;

    @ObfuscatedName("df.m")
    public static int field1550;

    @ObfuscatedName("dw.r")
    public static float field1594;

    @ObfuscatedName("dw.m")
    public static int field1595;

    @ObfuscatedName("s.n")
    public static class121[] field16;

    @ObfuscatedName("dc.fw")
    public static int[] field1651;

    @ObfuscatedName("dx.x")
    public static class309 field1659;

    @ObfuscatedName("dg.q")
    public static int[] field1670;

    @ObfuscatedName("dt.cd")
    public static class249 field1746;

    @ObfuscatedName("dt.qh")
    public static short[] field1747;

    @ObfuscatedName("dv.n")
    public static int[] field1749;

    @ObfuscatedName("dd.cr")
    public static class249 field1798;

    @ObfuscatedName("en.bm")
    public static int field1810;

    @ObfuscatedName("en.bn")
    public static int field1858;

    @ObfuscatedName("en.bb")
    public static int field1859;

    @ObfuscatedName("er.m")
    public static int field1870;

    @ObfuscatedName("er.j")
    public static int field1874;

    @ObfuscatedName("er.o")
    public static int field1876;

    @ObfuscatedName("ep.e")
    public static String field1884;

    @ObfuscatedName("ea.f")
    public static int field1887;

    @ObfuscatedName("ea.g")
    public static class143 field1895;

    @ObfuscatedName("ea.v")
    public static int field1898;

    @ObfuscatedName("ea.l")
    public static int field1899;

    @ObfuscatedName("s.i")
    public static class247 field19;

    @ObfuscatedName("ea.y")
    public static int field1900;

    @ObfuscatedName("ea.d")
    public static int field1901;

    @ObfuscatedName("ea.n")
    public static int field1903;

    @ObfuscatedName("ea.k")
    public static int field1904;

    @ObfuscatedName("ea.q")
    public static int field1907;

    @ObfuscatedName("eg.fr")
    public static int[] field1919;

    @ObfuscatedName("eg.gp")
    public static int field1923;

    @ObfuscatedName("ey.dh")
    public static String field1928;

    @ObfuscatedName("ee.b")
    public static int field1935;

    @ObfuscatedName("ee.bm")
    public static int field1939;

    @ObfuscatedName("ee.k")
    public static int field1945;

    @ObfuscatedName("ee.d")
    public static int field1946;

    @ObfuscatedName("ee.l")
    public static int field1947;

    @ObfuscatedName("ee.f")
    public static int field1948;

    @ObfuscatedName("ee.e")
    public static int field1950;

    @ObfuscatedName("ee.u")
    public static int field1951;

    @ObfuscatedName("ee.bb")
    public static int field1952;

    @ObfuscatedName("ee.z")
    public static int field1953;

    @ObfuscatedName("ee.g")
    public static int field1954;

    @ObfuscatedName("ee.c")
    public static int field1955;

    @ObfuscatedName("ee.aa")
    public static int field1956;

    @ObfuscatedName("ee.bp")
    public static int field1957;

    @ObfuscatedName("ee.ao")
    public static int field1958;

    @ObfuscatedName("ee.ar")
    public static int field1959;

    @ObfuscatedName("ee.bn")
    public static int field1970;

    @ObfuscatedName("ee.bf")
    public static boolean[][] field1986;

    @ObfuscatedName("ee.bg")
    public static int field1989;

    @ObfuscatedName("ee.ap")
    public static int field1991;

    @ObfuscatedName("ee.bz")
    public static int field1992;

    @ObfuscatedName("em.d")
    public static class48 field1993;

    @ObfuscatedName("j.fj")
    public static int[] field20;

    @ObfuscatedName("eb.jd")
    public static int field2001;

    @ObfuscatedName("es.oo")
    public static int field2037;

    @ObfuscatedName("ek.q")
    public static class101 field2049;

    @ObfuscatedName("ek.oc")
    public static class107 field2051;

    @ObfuscatedName("eh.ak")
    public static GarbageCollectorMXBean field2069;

    @ObfuscatedName("ej.ce")
    public static class249 field2074;

    @ObfuscatedName("el.bu")
    public static int field2082;

    @ObfuscatedName("el.i")
    public static String field2083;

    @ObfuscatedName("ef.i")
    public static String field2099;

    @ObfuscatedName("ef.w")
    public static int field2100;

    @ObfuscatedName("ef.p")
    public static Applet field2102;

    @ObfuscatedName("fr.s")
    public static File field2121;

    @ObfuscatedName("fr.a")
    public static int field2122;

    @ObfuscatedName("fr.bz")
    public static class309[] field2127;

    @ObfuscatedName("fs.fk")
    public static byte[][] field2133;

    @ObfuscatedName("fs.m")
    public static byte[][] field2134;

    @ObfuscatedName("fx.b")
    public static int[] field2157;

    @ObfuscatedName("fx.t")
    public static byte[][][] field2160;

    @ObfuscatedName("t.gx")
    public static class7[] field219;

    @ObfuscatedName("fc.a")
    public static int field2191;

    @ObfuscatedName("r.r")
    public static class309 field226;

    @ObfuscatedName("r.lb")
    public static int field228;

    @ObfuscatedName("fo.pi")
    public static class79 field2282;

    @ObfuscatedName("m.ew")
    public static class287 field234;

    @ObfuscatedName("m.q")
    public static boolean field236;

    @ObfuscatedName("h.ay")
    public static FontMetrics field239;

    @ObfuscatedName("fa.ol")
    public static class114 field2407;

    @ObfuscatedName("fa.fi")
    public static class309[] field2409;

    @ObfuscatedName("fe.p")
    public static class247 field2414;

    @ObfuscatedName("fp.t")
    public static int field2421;

    @ObfuscatedName("fp.fg")
    public static int field2424;

    @ObfuscatedName("o.cp")
    public static class249 field243;

    @ObfuscatedName("fi.fy")
    public static class309[] field2436;

    @ObfuscatedName("fm.fs")
    public static byte[][] field2438;

    @ObfuscatedName("o.m")
    public static short[] field246;

    @ObfuscatedName("gv.fe")
    public static class310[] field2485;

    @ObfuscatedName("gv.cb")
    public static long field2486;

    @ObfuscatedName("gg.t")
    public static int[] field2497;

    @ObfuscatedName("j.o")
    public static int[] field25;

    @ObfuscatedName("gg.r")
    public static int[] field2501;

    @ObfuscatedName("gl.i")
    public static long field2503;

    @ObfuscatedName("gl.p")
    public static long field2504;

    @ObfuscatedName("gl.r")
    public static int field2506;

    @ObfuscatedName("gc.h")
    public static class109 field2509;

    @ObfuscatedName("o.dr")
    public static int field251;

    @ObfuscatedName("gc.p")
    public static class247 field2510;

    @ObfuscatedName("go.ai")
    public static Image field2517;

    @ObfuscatedName("go.o")
    public static class247 field2526;

    @ObfuscatedName("gq.p")
    public static String field2532;

    @ObfuscatedName("x.aj")
    public static int field254;

    @ObfuscatedName("x.a")
    public static boolean field257;

    @ObfuscatedName("q.h")
    public static int field258;

    @ObfuscatedName("hh.f")
    public static int field2591;

    @ObfuscatedName("hr.w")
    public static class247 field2593;

    @ObfuscatedName("hr.i")
    public static class247 field2594;

    @ObfuscatedName("hr.o")
    public static boolean field2595;

    @ObfuscatedName("hr.s")
    public static class216 field2596;

    @ObfuscatedName("hr.m")
    public static int field2598;

    @ObfuscatedName("hr.p")
    public static class247 field2599;

    @ObfuscatedName("j.jr")
    public static class228 field26;

    @ObfuscatedName("q.ht")
    public static class123 field260;

    @ObfuscatedName("hr.x")
    public static class221 field2600;

    @ObfuscatedName("q.jf")
    public static int field261;

    @ObfuscatedName("q.bf")
    public static class244 field262;

    @ObfuscatedName("v.q")
    public static int field265;

    @ObfuscatedName("hf.lj")
    public static int field2668;

    @ObfuscatedName("hl.m")
    public static byte[][][] field2676;

    @ObfuscatedName("hl.at")
    public static int field2681;

    @ObfuscatedName("hu.qu")
    public static class78 field2688;

    @ObfuscatedName("v.ei")
    public static int field270;

    @ObfuscatedName("hj.dc")
    public static int field2702;

    @ObfuscatedName("ho.t")
    public static boolean[] field2730;

    @ObfuscatedName("ho.m")
    public static class247 field2732;

    @ObfuscatedName("n.fa")
    public static class310[] field282;

    @ObfuscatedName("ho.r")
    public static class247 field2846;

    @ObfuscatedName("y.u")
    public static int[] field285;

    @ObfuscatedName("ho.fp")
    public static class310[] field2874;

    @ObfuscatedName("d.eq")
    public static class287 field289;

    @ObfuscatedName("hy.ep")
    public static class156 field2905;

    @ObfuscatedName("ht.ar")
    public static Font field2922;

    @ObfuscatedName("ht.et")
    public static class286 field2924;

    @ObfuscatedName("im.nq")
    public static class283 field2926;

    @ObfuscatedName("d.fu")
    public static class310[] field293;

    @ObfuscatedName("iq.qi")
    public static class165 field2933;

    @ObfuscatedName("d.pv")
    public static int field295;

    @ObfuscatedName("d.r")
    public static ScheduledExecutorService field296;

    @ObfuscatedName("d.q")
    public static class228 field298;

    @ObfuscatedName("d.co")
    public static class156 field299;

    @ObfuscatedName("l.g")
    public static int[] field301;

    @ObfuscatedName("f.h")
    public static class247 field302;

    @ObfuscatedName("f.ac")
    public static boolean field306;

    @ObfuscatedName("f.m")
    public static class309[] field307;

    @ObfuscatedName("k.v")
    public static class246 field310;

    @ObfuscatedName("e.j")
    public static int field311;

    @ObfuscatedName("iv.z")
    public static int[] field3224;

    @ObfuscatedName("iv.h")
    public static class148 field3225;

    @ObfuscatedName("g.os")
    public static int field323;

    @ObfuscatedName("it.b")
    public static int[] field3237;

    @ObfuscatedName("ia.u")
    public static String field3248;

    @ObfuscatedName("z.cj")
    public static class249 field326;

    @ObfuscatedName("if.a")
    public static class228[][] field3286;

    @ObfuscatedName("if.js")
    public static class228 field3288;

    @ObfuscatedName("z.v")
    public static class228 field332;

    @ObfuscatedName("is.p")
    public static class160 field3321;

    @ObfuscatedName("iz.p")
    public static class247 field3345;

    @ObfuscatedName("z.a")
    public static class247 field335;

    @ObfuscatedName("ip.lv")
    public static int field3351;

    @ObfuscatedName("ip.i")
    public static int field3352;

    @ObfuscatedName("iw.i")
    public static class254[] field3354;

    @ObfuscatedName("iw.w")
    public static int field3355;

    @ObfuscatedName("b.d")
    public static String[] field336;

    @ObfuscatedName("iw.p")
    public static class247 field3370;

    @ObfuscatedName("il.p")
    public static class247 field3377;

    @ObfuscatedName("ib.p")
    public static class247 field3381;

    @ObfuscatedName("ib.r")
    public static boolean field3382;

    @ObfuscatedName("ie.i")
    public static class247 field3383;

    @ObfuscatedName("in.p")
    public static class247 field3399;

    @ObfuscatedName("ix.w")
    public static int field3407;

    @ObfuscatedName("ix.p")
    public static class247 field3409;

    @ObfuscatedName("ix.i")
    public static class247 field3413;

    @ObfuscatedName("ix.q")
    public static class287 field3419;

    @ObfuscatedName("ij.i")
    public static class247 field3421;

    @ObfuscatedName("ij.p")
    public static class247 field3424;

    @ObfuscatedName("ij.av")
    public static class307 field3432;

    @ObfuscatedName("ij.bs")
    public static class309 field3435;

    @ObfuscatedName("jf.p")
    public static class247 field3444;

    @ObfuscatedName("jx.p")
    public static class247 field3449;

    @ObfuscatedName("jd.b")
    public static int field3453;

    @ObfuscatedName("jd.p")
    public static class247 field3456;

    @ObfuscatedName("jd.br")
    public static class309[] field3458;

    @ObfuscatedName("b.el")
    public static int field346;

    @ObfuscatedName("jz.p")
    public static class247 field3467;

    @ObfuscatedName("jg.i")
    public static class247 field3470;

    @ObfuscatedName("jg.w")
    public static class247 field3477;

    @ObfuscatedName("jg.p")
    public static class247 field3493;

    @ObfuscatedName("jg.de")
    public static class249 field3495;

    @ObfuscatedName("jv.w")
    public static class247 field3497;

    @ObfuscatedName("c.hu")
    public static class228 field350;

    @ObfuscatedName("c.w")
    public static long field352;

    @ObfuscatedName("c.s")
    public static byte[][][] field353;

    @ObfuscatedName("jj.t")
    public static class247 field3551;

    @ObfuscatedName("jp.p")
    public static class247 field3622;

    @ObfuscatedName("jn.p")
    public static class247 field3649;

    @ObfuscatedName("jm.p")
    public static class247 field3658;

    @ObfuscatedName("jm.i")
    public static class247 field3662;

    @ObfuscatedName("jm.w")
    public static class247 field3668;

    @ObfuscatedName("jt.v")
    public static int[] field3689;

    @ObfuscatedName("jt.bt")
    public static int field3690;

    @ObfuscatedName("jr.er")
    public static long field3702;

    @ObfuscatedName("jb.dn")
    public static class249 field3717;

    @ObfuscatedName("jb.pg")
    public static int field3719;

    @ObfuscatedName("jo.cz")
    public static class249 field3722;

    @ObfuscatedName("jo.gt")
    public static int field3730;

    @ObfuscatedName("jo.jo")
    public static int field3731;

    @ObfuscatedName("jo.hi")
    public static class228 field3733;

    @ObfuscatedName("kb.h")
    public static class309[] field3744;

    @ObfuscatedName("ap.pt")
    public static class316 field375;

    @ObfuscatedName("kl.i")
    public static File field3761;

    @ObfuscatedName("kl.p")
    public static class177 field3762;

    @ObfuscatedName("ke.j")
    public static File field3770;

    @ObfuscatedName("kc.cs")
    public static class249 field3776;

    @ObfuscatedName("km.t")
    public static class310 field3781;

    @ObfuscatedName("km.ox")
    public static int field3782;

    @ObfuscatedName("kv.g")
    public static String field3824;

    @ObfuscatedName("ka.a")
    public static int field3826;

    @ObfuscatedName("kf.ft")
    public static class310 field3845;

    @ObfuscatedName("kt.dk")
    public static class249 field3850;

    @ObfuscatedName("ky.ao")
    public static int field3852;

    @ObfuscatedName("ky.ar")
    public static int field3853;

    @ObfuscatedName("ky.ap")
    public static int[] field3854;

    @ObfuscatedName("ao.eg")
    public static class160 field388;

    @ObfuscatedName("kp.h")
    public static short[][] field3891;

    @ObfuscatedName("kp.i")
    public static int field3892;

    @ObfuscatedName("kp.s")
    public static int[] field3893;

    @ObfuscatedName("kp.j")
    public static int[] field3894;

    @ObfuscatedName("kp.p")
    public static int field3895;

    @ObfuscatedName("kp.a")
    public static int[] field3896;

    @ObfuscatedName("kp.t")
    public static int[] field3897;

    @ObfuscatedName("kp.r")
    public static int[] field3898;

    @ObfuscatedName("kp.w")
    public static int field3899;

    @ObfuscatedName("ao.do")
    public static class249 field390;

    @ObfuscatedName("kp.q")
    public static class163 field3900;

    @ObfuscatedName("ar.r")
    public static byte[][][] field393;

    @ObfuscatedName("ar.nx")
    public static class310 field394;

    @ObfuscatedName("ay.eu")
    public static int field407;

    @ObfuscatedName("ay.z")
    public static int field408;

    @ObfuscatedName("ax.jw")
    public static int field411;

    @ObfuscatedName("ax.h")
    public static int[] field414;

    @ObfuscatedName("ax.nr")
    public static class302 field416;

    @ObfuscatedName("ax.r")
    public static int field418;

    @ObfuscatedName("ax.t")
    public static short[] field420;

    @ObfuscatedName("ae.cu")
    public static int field428;

    @ObfuscatedName("ah.gd")
    public static int field437;

    @ObfuscatedName("ai.bp")
    public static class314 field459;

    @ObfuscatedName("au.kz")
    public static int field465;

    @ObfuscatedName("am.fc")
    public static int field466;

    @ObfuscatedName("am.id")
    public static class72 field470;

    @ObfuscatedName("am.by")
    public static class243 field473;

    @ObfuscatedName("af.qa")
    public static long field474;

    @ObfuscatedName("af.ix")
    public static int field477;

    @ObfuscatedName("af.br")
    public static int field478;

    @ObfuscatedName("af.hj")
    public static class228 field480;

    @ObfuscatedName("af.aj")
    public static client field481;

    @ObfuscatedName("an.l")
    public static String[] field491;

    @ObfuscatedName("an.oy")
    public static int field492;

    @ObfuscatedName("ag.fz")
    public static class310[] field503;

    @ObfuscatedName("ab.gi")
    public static int field536;

    @ObfuscatedName("ac.df")
    public static class249 field542;

    @ObfuscatedName("ac.ji")
    public static class87 field545;

    @ObfuscatedName("ac.y")
    public static int field546;

    @ObfuscatedName("ak.bu")
    public static class309[] field552;

    @ObfuscatedName("as.fq")
    public static class137 field569;

    @ObfuscatedName("aj.og")
    public static int field599;

    @ObfuscatedName("bt.j")
    public static int field601;

    @ObfuscatedName("bt.cq")
    public static class249 field602;

    @ObfuscatedName("bt.gc")
    public static int field603;

    @ObfuscatedName("bt.kd")
    public static int field604;

    @ObfuscatedName("bf.bg")
    public static class310[] field619;

    @ObfuscatedName("bf.x")
    public static int field622;

    @ObfuscatedName("bn.r")
    public static int field633;

    @ObfuscatedName("bn.d")
    public static int field640;

    @ObfuscatedName("bn.p")
    public static class157 field655;

    @ObfuscatedName("bm.oz")
    public static int field682;

    @ObfuscatedName("bm.gx")
    public static int field683;

    @ObfuscatedName("bg.x")
    public static int[] field686;

    @ObfuscatedName("bg.j")
    public static byte[][][] field688;

    @ObfuscatedName("bg.a")
    public static byte[][][] field689;

    @ObfuscatedName("bg.n")
    public static int[][][] field691;

    @ObfuscatedName("bg.qw")
    public static int field694;

    @ObfuscatedName("bg.lq")
    public static class94 field701;

    @ObfuscatedName("bg.bz")
    public static String field702;

    @ObfuscatedName("bz.j")
    public static class309[] field707;

    @ObfuscatedName("bz.ap")
    public static int[] field709;

    @ObfuscatedName("bz.qb")
    public static class313 field711;

    @ObfuscatedName("bu.t")
    public static int field719;

    @ObfuscatedName("bu.eb")
    public static class147 field722;

    @ObfuscatedName("bu.ci")
    public static char field723;

    @ObfuscatedName("br.db")
    public static int field726;

    @ObfuscatedName("bd.q")
    public static class309 field762;

    @ObfuscatedName("bd.cf")
    public static class249 field764;

    @ObfuscatedName("bd.dq")
    public static int field765;

    @ObfuscatedName("bd.lz")
    public static class159 field766;

    @ObfuscatedName("bl.ii")
    public static int field780;

    @ObfuscatedName("bo.du")
    public static class249 field784;

    @ObfuscatedName("bo.r")
    public static short[][] field785;

    @ObfuscatedName("bc.fh")
    public static class310[] field794;

    @ObfuscatedName("bc.jx")
    public static int field795;

    @ObfuscatedName("client.bg")
    public static String field829;

    @ObfuscatedName("client.ca")
    public static boolean field848;

    @ObfuscatedName("client.cy")
    public static class160 field852;

    @ObfuscatedName("client.dp")
    public static class249 field855;

    @ObfuscatedName("client.iz")
    public static int field961;

    @ObfuscatedName("bg.p(B)I")
    public static int method955() {
        return ++class95.field1403 - 1;
    }

    @ObfuscatedName("id.i(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method4020(int arg0, String arg1, String arg2) {
        class95.method3858(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("fi.d(I)V")
    public static void method3089() {
        class267.field3542.method3513();
        class267.field3499.method3513();
        class267.field3500.method3513();
        class267.field3537.method3513();
    }

    @ObfuscatedName("h.k(ILcd;ZI)I")
    public static int method58(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = class81.field1224[--field1234];
            class81.field1226[++field258 - 1] = class268.method1489(var3).field3557;
            return 1;
        } else if (arg0 == 4201) {
            field1234 -= 2;
            int var4 = class81.field1224[field1234];
            int var5 = class81.field1224[field1234 + 1];
            class268 var6 = class268.method1489(var4);
            if (var5 < 1 || var5 > 5 || var6.field3591[var5 - 1] == null) {
                class81.field1226[++field258 - 1] = "";
            } else {
                class81.field1226[++field258 - 1] = var6.field3591[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            field1234 -= 2;
            int var7 = class81.field1224[field1234];
            int var8 = class81.field1224[field1234 + 1];
            class268 var9 = class268.method1489(var7);
            if (var8 < 1 || var8 > 5 || var9.field3572[var8 - 1] == null) {
                class81.field1226[++field258 - 1] = "";
            } else {
                class81.field1226[++field258 - 1] = var9.field3572[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = class81.field1224[--field1234];
            class81.field1224[++field1234 - 1] = class268.method1489(var10).field3589;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = class81.field1224[--field1234];
            class81.field1224[++field1234 - 1] = class268.method1489(var11).field3568 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = class81.field1224[--field1234];
            class268 var13 = class268.method1489(var12);
            if (var13.field3571 == -1 && var13.field3595 >= 0) {
                class81.field1224[++field1234 - 1] = var13.field3595;
            } else {
                class81.field1224[++field1234 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = class81.field1224[--field1234];
            class268 var15 = class268.method1489(var14);
            if (var15.field3571 >= 0 && var15.field3595 >= 0) {
                class81.field1224[++field1234 - 1] = var15.field3595;
            } else {
                class81.field1224[++field1234 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = class81.field1224[--field1234];
            class81.field1224[++field1234 - 1] = class268.method1489(var16).field3574 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = class81.field1224[--field1234];
            class268 var18 = class268.method1489(var17);
            if (var18.field3569 == -1 && var18.field3600 >= 0) {
                class81.field1224[++field1234 - 1] = var18.field3600;
            } else {
                class81.field1224[++field1234 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = class81.field1224[--field1234];
            class268 var20 = class268.method1489(var19);
            if (var20.field3569 >= 0 && var20.field3600 >= 0) {
                class81.field1224[++field1234 - 1] = var20.field3600;
            } else {
                class81.field1224[++field1234 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = class81.field1226[--field258];
            int var22 = class81.field1224[--field1234];
            boolean var24 = var22 == 1;
            String var25 = var21.toLowerCase();
            short[] var26 = new short[16];
            int var27 = 0;
            int var28 = 0;
            while (true) {
                if (var28 >= field1550) {
                    field1747 = var26;
                    field694 = 0;
                    field1421 = var27;
                    String[] var32 = new String[field1421];
                    for (int var33 = 0; var33 < field1421; var33++) {
                        var32[var33] = class268.method1489(var26[var33]).field3557;
                    }
                    short[] var34 = field1747;
                    class182.method682(var32, var34, 0, var32.length - 1);
                    break;
                }
                class268 var29 = class268.method1489(var28);
                if ((!var24 || var29.field3561) && var29.field3571 == -1 && var29.field3557.toLowerCase().indexOf(var25) != -1) {
                    if (var27 >= 250) {
                        field1421 = -1;
                        field1747 = null;
                        break;
                    }
                    if (var27 >= var26.length) {
                        short[] var30 = new short[var26.length * 2];
                        for (int var31 = 0; var31 < var27; var31++) {
                            var30[var31] = var26[var31];
                        }
                        var26 = var30;
                    }
                    var26[var27++] = (short) var28;
                }
                var28++;
            }
            class81.field1224[++field1234 - 1] = field1421;
            return 1;
        } else if (arg0 == 4211) {
            if (field1747 == null || field694 >= field1421) {
                class81.field1224[++field1234 - 1] = -1;
            } else {
                class81.field1224[++field1234 - 1] = field1747[++field694 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            field694 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ay.hf(IB)V")
    public static final void method254(int arg0) {
        int[] var1 = field394.field3887;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field704[arg0][var6][var4] & 0x18) == 0) {
                    field569.method2675(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class62.field704[arg0 + 1][var6][var4] & 0x8) != 0) {
                    field569.method2675(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        field394.method5114();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field704[arg0][var10][var9] & 0x18) == 0) {
                    client.method499(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class62.field704[arg0 + 1][var10][var9] & 0x8) != 0) {
                    client.method499(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        client.field1034 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = field569.method2645(field780, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class267.method2363(var14).field3543;
                    if (var15 >= 0) {
                        client.field970[client.field1034] = field3354[var15].method4201(false);
                        client.field1035[client.field1034] = var11;
                        client.field1036[client.field1034] = var12;
                        client.field1034++;
                    }
                }
            }
        }
        field3432.method5086();
    }

    @ObfuscatedName("bh.iv(II)V")
    public static final void method1545(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = client.field947[arg0];
        int var2 = client.field948[arg0];
        int var3 = client.field949[arg0];
        int var4 = client.field919[arg0];
        String var5 = client.field951[arg0];
        String var6 = client.field952[arg0];
        client.method1081(var1, var2, var3, var4, var5, var6, class60.field678, class60.field671);
    }

    @ObfuscatedName("hy.ia(ILjava/lang/String;I)V")
    public static void method4003(int arg0, String arg1) {
        int var2 = class93.field1379;
        int[] var3 = class93.field1380;
        boolean var4 = false;
        class281 var5 = new class281(arg1, field459);
        for (int var6 = 0; var6 < var2; var6++) {
            class72 var7 = client.field927[var3[var6]];
            if (var7 != null && field470 != var7 && var7.field787 != null && var7.field787.equals(var5)) {
                if (arg0 == 1) {
                    class175 var8 = class175.method470(class172.field2364, client.field868.field1440);
                    var8.field2403.method3121(var3[var6]);
                    var8.field2403.method3148(0);
                    client.field868.method1879(var8);
                } else if (arg0 == 4) {
                    class175 var9 = class175.method470(class172.field2289, client.field868.field1440);
                    var9.field2403.method3115(0);
                    var9.field2403.method3250(var3[var6]);
                    client.field868.method1879(var9);
                } else if (arg0 == 6) {
                    class175 var10 = class175.method470(class172.field2320, client.field868.field1440);
                    var10.field2403.method3156(var3[var6]);
                    var10.field2403.method3115(0);
                    client.field868.method1879(var10);
                } else if (arg0 == 7) {
                    class175 var11 = class175.method470(class172.field2333, client.field868.field1440);
                    var11.field2403.method3107(0);
                    var11.field2403.method3156(var3[var6]);
                    client.field868.method1879(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            method4020(4, "", class237.field3083 + arg1);
        }
    }

    @ObfuscatedName("eu.jo(I)V")
    public static final void method2824() {
        class175 var0 = class175.method470(class172.field2352, client.field868.field1440);
        client.field868.method1879(var0);
        for (class67 var1 = (class67) client.field969.method3520(); var1 != null; var1 = (class67) client.field969.method3516()) {
            if (var1.field743 == 0 || var1.field743 == 3) {
                client.method1681(var1, true);
            }
        }
        if (client.field972 != null) {
            client.method924(client.field972);
            client.field972 = null;
        }
    }
}
