package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Statics {

    @ObfuscatedName("f.d")
    public static boolean field1;

    @ObfuscatedName("cd.h")
    public static short[][][] field1002;

    @ObfuscatedName("cs.p")
    public static short[][] field1017;

    @ObfuscatedName("ci.ds")
    public static boolean field1021;

    @ObfuscatedName("cq.di")
    public static boolean field1024;

    @ObfuscatedName("cf.l")
    public static class476 field1056;

    @ObfuscatedName("cf.b")
    public static class476 field1060;

    @ObfuscatedName("cf.ck")
    public static class476[] field1063;

    @ObfuscatedName("cj.tl")
    public static class44 field1077;

    @ObfuscatedName("cy.ha")
    public static class436 field1087;

    @ObfuscatedName("m.r")
    public static int field110;

    @ObfuscatedName("cw.kb")
    public static int field1134;

    @ObfuscatedName("cw.ng")
    public static class71 field1135;

    @ObfuscatedName("i.s")
    public static short[] field115;

    @ObfuscatedName("g.cy")
    public static class476 field119;

    @ObfuscatedName("h.tb")
    public static int field12;

    @ObfuscatedName("g.iv")
    public static int field123;

    @ObfuscatedName("g.j")
    public static class330 field124;

    @ObfuscatedName("cm.r")
    public static class477 field1260;

    @ObfuscatedName("cm.in")
    public static class476[] field1261;

    @ObfuscatedName("cm.so")
    public static class44 field1264;

    @ObfuscatedName("k.bt")
    public static int field127;

    @ObfuscatedName("cr.r")
    public static class110 field1275;

    @ObfuscatedName("k.e")
    public static int field129;

    @ObfuscatedName("cb.al")
    public static String field1295;

    @ObfuscatedName("cb.ak")
    public static Image field1296;

    @ObfuscatedName("k.ea")
    public static class328 field130;

    @ObfuscatedName("cn.vq")
    public static Iterator field1306;

    @ObfuscatedName("cv.vw")
    public static long field1308;

    @ObfuscatedName("cx.va")
    public static short[] field1314;

    @ObfuscatedName("cp.ms")
    public static int field1330;

    @ObfuscatedName("cp.te")
    public static int field1345;

    @ObfuscatedName("cp.bk")
    public static class345 field1347;

    @ObfuscatedName("df.m")
    public static class464 field1362;

    @ObfuscatedName("df.n")
    public static int field1364;

    @ObfuscatedName("aj.ib")
    public static int[][] field139;

    @ObfuscatedName("dk.t")
    public static int field1390;

    @ObfuscatedName("du.mn")
    public static int field1394;

    @ObfuscatedName("de.tq")
    public static int field1399;

    @ObfuscatedName("dt.jg")
    public static class476[] field1401;

    @ObfuscatedName("da.e")
    public static class330 field1405;

    @ObfuscatedName("da.sc")
    public static boolean field1407;

    @ObfuscatedName("dx.o")
    public static int[][][] field1411;

    @ObfuscatedName("dp.oh")
    public static int field1416;

    @ObfuscatedName("aj.hi")
    public static int field142;

    @ObfuscatedName("dj.hr")
    public static class365 field1422;

    @ObfuscatedName("dg.p")
    public static boolean field1426;

    @ObfuscatedName("dr.iq")
    public static class477 field1431;

    @ObfuscatedName("dr.ti")
    public static int field1432;

    @ObfuscatedName("dl.n")
    public static int field1436;

    @ObfuscatedName("dl.b")
    public static class329 field1438;

    @ObfuscatedName("do.gw")
    public static int[] field1446;

    @ObfuscatedName("dw.sl")
    public static class147 field1452;

    @ObfuscatedName("db.gk")
    public static String field1483;

    @ObfuscatedName("db.oj")
    public static int field1499;

    @ObfuscatedName("dv.l")
    public static int field1512;

    @ObfuscatedName("dq.ao")
    public static Font field1517;

    @ObfuscatedName("dz.bc")
    public static String field1535;

    @ObfuscatedName("ek.s")
    public static class289 field1559;

    @ObfuscatedName("ek.ff")
    public static int field1566;

    @ObfuscatedName("eb.lt")
    public static class303 field1576;

    @ObfuscatedName("ew.b")
    public static class303 field1590;

    @ObfuscatedName("ec.p")
    public static int[] field1592;

    @ObfuscatedName("ec.aa")
    public static client field1599;

    @ObfuscatedName("el.d")
    public static class476 field1610;

    @ObfuscatedName("eo.ia")
    public static class214 field1615;

    @ObfuscatedName("eo.sd")
    public static boolean field1617;

    @ObfuscatedName("eo.p")
    public static class365 field1618;

    @ObfuscatedName("eo.fx")
    public static class328 field1620;

    @ObfuscatedName("eh.o")
    public static class303 field1629;

    @ObfuscatedName("ey.eu")
    public static class328 field1644;

    @ObfuscatedName("ef.im")
    public static int[] field1647;

    @ObfuscatedName("ef.j")
    public static class476 field1648;

    @ObfuscatedName("ef.ee")
    public static class328 field1651;

    @ObfuscatedName("af.jr")
    public static int field169;

    @ObfuscatedName("af.jn")
    public static int field170;

    @ObfuscatedName("ei.et")
    public static class328 field1705;

    @ObfuscatedName("ei.ih")
    public static class477 field1711;

    @ObfuscatedName("af.tc")
    public static int field172;

    @ObfuscatedName("ee.fv")
    public static int field1725;

    @ObfuscatedName("eq.fe")
    public static class328 field1733;

    @ObfuscatedName("eq.gf")
    public static SecureRandom field1736;

    @ObfuscatedName("fr.ef")
    public static class328 field1743;

    @ObfuscatedName("fr.j")
    public static boolean field1745;

    @ObfuscatedName("fr.qh")
    public static class412 field1746;

    @ObfuscatedName("fm.hs")
    public static int field1754;

    @ObfuscatedName("fx.fy")
    public static int field1759;

    @ObfuscatedName("ft.ik")
    public static class477[] field1780;

    @ObfuscatedName("fp.r")
    public static short[] field1781;

    @ObfuscatedName("fp.f")
    public static String field1782;

    @ObfuscatedName("fp.a")
    public static String field1789;

    @ObfuscatedName("fg.x")
    public static File field1793;

    @ObfuscatedName("fg.j")
    public static int field1794;

    @ObfuscatedName("y.p")
    public static int field18;

    @ObfuscatedName("ad.d")
    public static byte[][][] field180;

    @ObfuscatedName("fg.o")
    public static class447[] field1802;

    @ObfuscatedName("fg.u")
    public static int field1803;

    @ObfuscatedName("fn.f")
    public static File field1807;

    @ObfuscatedName("fn.hv")
    public static long field1808;

    @ObfuscatedName("ad.r")
    public static int[] field182;

    @ObfuscatedName("fi.lm")
    public static class303 field1824;

    @ObfuscatedName("fa.vy")
    public static int field1836;

    @ObfuscatedName("ad.p")
    public static class52 field184;

    @ObfuscatedName("fw.y")
    public static byte[][][] field1853;

    @ObfuscatedName("fw.md")
    public static int field1857;

    @ObfuscatedName("fw.fp")
    public static class403 field1858;

    @ObfuscatedName("fu.n")
    public static int[] field1863;

    @ObfuscatedName("fv.f")
    public static int field1867;

    @ObfuscatedName("fv.a")
    public static class330 field1868;

    @ObfuscatedName("fv.jq")
    public static int field1870;

    @ObfuscatedName("fd.f")
    public static class178[] field1873;

    @ObfuscatedName("fd.a")
    public static class330 field1876;

    @ObfuscatedName("fd.c")
    public static int field1878;

    @ObfuscatedName("fq.a")
    public static class330 field1897;

    @ObfuscatedName("fz.f")
    public static class330 field1901;

    @ObfuscatedName("fz.a")
    public static class330 field1904;

    @ObfuscatedName("fz.c")
    public static int field1908;

    @ObfuscatedName("fb.tj")
    public static int field1913;

    @ObfuscatedName("fb.f")
    public static class330 field1914;

    @ObfuscatedName("fb.bg")
    public static int field1924;

    @ObfuscatedName("fb.a")
    public static class330 field1925;

    @ObfuscatedName("ak.c")
    public static class330 field193;

    @ObfuscatedName("fj.o")
    public static class476 field1932;

    @ObfuscatedName("ak.l")
    public static short[][] field194;

    @ObfuscatedName("gj.a")
    public static class330 field1945;

    @ObfuscatedName("gu.f")
    public static class330 field1956;

    @ObfuscatedName("ae.a")
    public static class164 field199;

    @ObfuscatedName("gu.a")
    public static class330 field1992;

    @ObfuscatedName("ga.ls")
    public static class303 field2006;

    @ObfuscatedName("gy.f")
    public static class330 field2008;

    @ObfuscatedName("gy.a")
    public static class330 field2019;

    @ObfuscatedName("gy.ca")
    public static class476[] field2023;

    @ObfuscatedName("gc.a")
    public static class330 field2025;

    @ObfuscatedName("gt.g")
    public static class330 field2034;

    @ObfuscatedName("gt.ex")
    public static class328 field2035;

    @ObfuscatedName("ge.a")
    public static class330 field2055;

    @ObfuscatedName("gx.f")
    public static class330 field2058;

    @ObfuscatedName("gx.c")
    public static class330 field2059;

    @ObfuscatedName("gx.a")
    public static class330 field2076;

    @ObfuscatedName("gm.f")
    public static class330 field2082;

    @ObfuscatedName("gm.c")
    public static class330 field2083;

    @ObfuscatedName("y.lg")
    public static class219 field21;

    @ObfuscatedName("gm.fu")
    public static int field2133;

    @ObfuscatedName("gp.y")
    public static class330 field2138;

    @ObfuscatedName("gq.a")
    public static class330 field2201;

    @ObfuscatedName("gg.f")
    public static class330 field2209;

    @ObfuscatedName("gg.x")
    public static class330 field2213;

    @ObfuscatedName("ae.g")
    public static int field223;

    @ObfuscatedName("gf.sg")
    public static class156 field2239;

    @ObfuscatedName("gw.iy")
    public static class477[] field2262;

    @ObfuscatedName("gr.cq")
    public static class476[] field2274;

    @ObfuscatedName("gv.ij")
    public static int[] field2275;

    @ObfuscatedName("go.uf")
    public static class432 field2289;

    @ObfuscatedName("gi.h")
    public static int field2292;

    @ObfuscatedName("gi.j")
    public static int field2295;

    @ObfuscatedName("gi.qy")
    public static class449 field2299;

    @ObfuscatedName("gn.n")
    public static int field2360;

    @ObfuscatedName("gd.o")
    public static int[] field2361;

    @ObfuscatedName("hm.b")
    public static int field2413;

    @ObfuscatedName("hm.u")
    public static int field2420;

    @ObfuscatedName("hm.e")
    public static class227 field2422;

    @ObfuscatedName("hm.m")
    public static int field2425;

    @ObfuscatedName("hm.o")
    public static int field2426;

    @ObfuscatedName("hm.p")
    public static int field2427;

    @ObfuscatedName("hm.z")
    public static int field2428;

    @ObfuscatedName("hm.t")
    public static int field2429;

    @ObfuscatedName("hm.w")
    public static int field2430;

    @ObfuscatedName("hf.k")
    public static int field2453;

    @ObfuscatedName("hf.bc")
    public static int field2454;

    @ObfuscatedName("hf.z")
    public static int field2458;

    @ObfuscatedName("hf.ba")
    public static int field2466;

    @ObfuscatedName("hf.g")
    public static int field2469;

    @ObfuscatedName("hf.t")
    public static int field2470;

    @ObfuscatedName("hf.w")
    public static int field2471;

    @ObfuscatedName("hf.i")
    public static int field2472;

    @ObfuscatedName("hf.q")
    public static int field2473;

    @ObfuscatedName("hf.e")
    public static int field2475;

    @ObfuscatedName("hf.bk")
    public static int field2479;

    @ObfuscatedName("hf.an")
    public static int field2480;

    @ObfuscatedName("hf.ah")
    public static int field2481;

    @ObfuscatedName("hf.ao")
    public static int field2482;

    @ObfuscatedName("hf.v")
    public static int field2492;

    @ObfuscatedName("hf.bt")
    public static int field2500;

    @ObfuscatedName("hf.bq")
    public static boolean[][] field2513;

    @ObfuscatedName("hf.m")
    public static int field2514;

    @ObfuscatedName("hf.aj")
    public static int field2515;

    @ObfuscatedName("hf.bv")
    public static int field2516;

    @ObfuscatedName("hf.br")
    public static int field2519;

    @ObfuscatedName("ap.ey")
    public static class328 field252;

    @ObfuscatedName("hd.iw")
    public static class477[] field2520;

    @ObfuscatedName("hy.tw")
    public static class57 field2522;

    @ObfuscatedName("hj.hy")
    public static class397 field2529;

    @ObfuscatedName("ap.i")
    public static String field253;

    @ObfuscatedName("hj.eh")
    public static long field2531;

    @ObfuscatedName("ap.ty")
    public static int field255;

    @ObfuscatedName("hk.nq")
    public static class303 field2556;

    @ObfuscatedName("hk.nk")
    public static class303 field2557;

    @ObfuscatedName("hg.jm")
    public static int field2566;

    @ObfuscatedName("as.e")
    public static String field257;

    @ObfuscatedName("ha.bt")
    public static int field2590;

    @ObfuscatedName("ha.bv")
    public static int field2652;

    @ObfuscatedName("ha.ba")
    public static int field2654;

    @ObfuscatedName("hz.h")
    public static int field2673;

    @ObfuscatedName("hz.y")
    public static int field2675;

    @ObfuscatedName("hz.l")
    public static int field2676;

    @ObfuscatedName("hz.j")
    public static int field2678;

    @ObfuscatedName("hz.bg")
    public static class444 field2682;

    @ObfuscatedName("hw.hf")
    public static class172 field2684;

    @ObfuscatedName("hr.tf")
    public static int field2697;

    @ObfuscatedName("hu.z")
    public static int[] field2711;

    @ObfuscatedName("aq.ed")
    public static class328 field272;

    @ObfuscatedName("hi.at")
    public static GarbageCollectorMXBean field2724;

    @ObfuscatedName("hi.uy")
    public static class66 field2726;

    @ObfuscatedName("hs.dv")
    public static boolean field2734;

    @ObfuscatedName("hs.vg")
    public static class401 field2741;

    @ObfuscatedName("hs.cj")
    public static class476 field2743;

    @ObfuscatedName("he.ix")
    public static int field2751;

    @ObfuscatedName("hb.id")
    public static class477[] field2758;

    @ObfuscatedName("ii.eg")
    public static class328 field2799;

    @ObfuscatedName("il.cf")
    public static class476 field2823;

    @ObfuscatedName("il.v")
    public static class330 field2824;

    @ObfuscatedName("ij.tk")
    public static int field2830;

    @ObfuscatedName("ix.x")
    public static class476[] field2846;

    @ObfuscatedName("ix.t")
    public static int[] field2847;

    @ObfuscatedName("az.s")
    public static boolean[] field286;

    @ObfuscatedName("ir.ez")
    public static class328 field2874;

    @ObfuscatedName("az.l")
    public static int[] field292;

    @ObfuscatedName("iv.ax")
    public static class404 field2926;

    @ObfuscatedName("iu.fc")
    public static class328 field2931;

    @ObfuscatedName("ic.jw")
    public static int field2940;

    @ObfuscatedName("iq.t")
    public static String[] field2941;

    @ObfuscatedName("az.r")
    public static int[] field295;

    @ObfuscatedName("ih.vk")
    public static class332 field2952;

    @ObfuscatedName("if.nl")
    public static int field2962;

    @ObfuscatedName("iy.bp")
    public static class318 field2968;

    @ObfuscatedName("f.ag")
    public static class474 field3;

    @ObfuscatedName("d.vx")
    public static class435 field31;

    @ObfuscatedName("ab.qa")
    public static class449 field311;

    @ObfuscatedName("jk.fa")
    public static String field3121;

    @ObfuscatedName("jw.he")
    public static int field3134;

    @ObfuscatedName("ab.r")
    public static class46 field317;

    @ObfuscatedName("ab.hc")
    public static class108 field318;

    @ObfuscatedName("jd.tg")
    public static int field3265;

    @ObfuscatedName("jd.if")
    public static class477[] field3266;

    @ObfuscatedName("jl.a")
    public static long field3268;

    @ObfuscatedName("jl.f")
    public static long field3269;

    @ObfuscatedName("jv.n")
    public static int field3277;

    @ObfuscatedName("js.f")
    public static class330 field3291;

    @ObfuscatedName("js.c")
    public static class330 field3292;

    @ObfuscatedName("js.x")
    public static class285 field3293;

    @ObfuscatedName("js.y")
    public static int field3295;

    @ObfuscatedName("js.d")
    public static int field3296;

    @ObfuscatedName("js.a")
    public static class330 field3298;

    @ObfuscatedName("d.em")
    public static class328 field33;

    @ObfuscatedName("jr.tx")
    public static int field3327;

    @ObfuscatedName("au.pj")
    public static int field333;

    @ObfuscatedName("km.k")
    public static class330 field3352;

    @ObfuscatedName("km.i")
    public static boolean[] field3355;

    @ObfuscatedName("aw.h")
    public static int field338;

    @ObfuscatedName("kl.fz")
    public static String field3387;

    @ObfuscatedName("kl.j")
    public static class330 field3388;

    @ObfuscatedName("kp.ts")
    public static int field3403;

    @ObfuscatedName("ke.lp")
    public static class89 field3404;

    @ObfuscatedName("kz.ec")
    public static class397 field3409;

    @ObfuscatedName("kx.fq")
    public static String field3419;

    @ObfuscatedName("kk.rw")
    public static class482 field3462;

    @ObfuscatedName("kn.q")
    public static class303[][] field3615;

    @ObfuscatedName("kn.to")
    public static int field3637;

    @ObfuscatedName("kd.h")
    public static File field3639;

    @ObfuscatedName("ku.a")
    public static class305 field3646;

    @ObfuscatedName("kw.sq")
    public static class477 field3651;

    @ObfuscatedName("kc.ci")
    public static class477[] field3653;

    @ObfuscatedName("kc.c")
    public static long field3654;

    @ObfuscatedName("ka.d")
    public static int field3658;

    @ObfuscatedName("kr.fr")
    public static class328 field3671;

    @ObfuscatedName("lk.jk")
    public static int field3704;

    @ObfuscatedName("lk.n")
    public static class477 field3712;

    @ObfuscatedName("lq.u")
    public static int field3744;

    @ObfuscatedName("lc.h")
    public static int[] field3756;

    @ObfuscatedName("bh.u")
    public static boolean[] field378;

    @ObfuscatedName("bh.an")
    public static float[] field380;

    @ObfuscatedName("bh.e")
    public static float[] field384;

    @ObfuscatedName("bh.d")
    public static int field385;

    @ObfuscatedName("bh.ao")
    public static int[] field386;

    @ObfuscatedName("bh.r")
    public static int field387;

    @ObfuscatedName("bh.l")
    public static int field388;

    @ObfuscatedName("bh.s")
    public static class53[] field389;

    @ObfuscatedName("bh.p")
    public static class43[] field390;

    @ObfuscatedName("bh.b")
    public static class48[] field391;

    @ObfuscatedName("bh.n")
    public static int field392;

    @ObfuscatedName("bh.z")
    public static int[] field394;

    @ObfuscatedName("bh.y")
    public static byte[] field399;

    @ObfuscatedName("bh.g")
    public static float[] field401;

    @ObfuscatedName("bh.k")
    public static float[] field402;

    @ObfuscatedName("bh.v")
    public static float[] field403;

    @ObfuscatedName("bh.aj")
    public static float[] field404;

    @ObfuscatedName("bh.o")
    public static class51[] field405;

    @ObfuscatedName("bh.ah")
    public static float[] field406;

    @ObfuscatedName("bh.ac")
    public static int[] field408;

    @ObfuscatedName("lf.tu")
    public static int field4094;

    @ObfuscatedName("lu.ev")
    public static class328 field4116;

    @ObfuscatedName("lj.h")
    public static Thread field4125;

    @ObfuscatedName("bl.q")
    public static class258 field413;

    @ObfuscatedName("bl.jp")
    public static class477[] field414;

    @ObfuscatedName("lw.vc")
    public static class341 field4145;

    @ObfuscatedName("ll.fm")
    public static class328 field4172;

    @ObfuscatedName("ll.a")
    public static class397 field4176;

    @ObfuscatedName("ly.l")
    public static boolean field4191;

    @ObfuscatedName("ln.a")
    public static class330 field4195;

    @ObfuscatedName("le.k")
    public static int[] field4203;

    @ObfuscatedName("mi.ew")
    public static class172 field4218;

    @ObfuscatedName("bo.d")
    public static float field422;

    @ObfuscatedName("mi.z")
    public static String[] field4222;

    @ObfuscatedName("bo.n")
    public static int field423;

    @ObfuscatedName("mx.u")
    public static class476 field4231;

    @ObfuscatedName("mw.ht")
    public static int field4235;

    @ObfuscatedName("mo.hw")
    public static class365 field4239;

    @ObfuscatedName("mh.hz")
    public static class365 field4271;

    @ObfuscatedName("mh.bb")
    public static int field4272;

    @ObfuscatedName("ma.d")
    public static ScheduledExecutorService field4292;

    @ObfuscatedName("mk.bf")
    public static String field4293;

    @ObfuscatedName("mm.h")
    public static class476 field4300;

    @ObfuscatedName("mu.w")
    public static byte[][][] field4301;

    @ObfuscatedName("mu.a")
    public static class330 field4302;

    @ObfuscatedName("mb.bn")
    public static int field4309;

    @ObfuscatedName("mn.y")
    public static class476 field4315;

    @ObfuscatedName("mn.p")
    public static class174 field4316;

    @ObfuscatedName("nt.r")
    public static class476[] field4358;

    @ObfuscatedName("nf.p")
    public static class47 field4379;

    @ObfuscatedName("nd.bo")
    public static class319 field4412;

    @ObfuscatedName("nw.n")
    public static int field4433;

    @ObfuscatedName("nj.ph")
    public static int field4440;

    @ObfuscatedName("ng.fl")
    public static class328 field4450;

    @ObfuscatedName("ne.vu")
    public static int field4479;

    @ObfuscatedName("ow.vm")
    public static class94 field4526;

    @ObfuscatedName("om.s")
    public static int[] field4532;

    @ObfuscatedName("ox.jc")
    public static int field4582;

    @ObfuscatedName("op.b")
    public static int[] field4591;

    @ObfuscatedName("oi.h")
    public static class65[] field4595;

    @ObfuscatedName("po.u")
    public static class464 field4611;

    @ObfuscatedName("ps.n")
    public static int field4678;

    @ObfuscatedName("ps.s")
    public static int field4686;

    @ObfuscatedName("pd.ju")
    public static class476[] field4746;

    @ObfuscatedName("pz.z")
    public static class156 field4759;

    @ObfuscatedName("bc.lb")
    public static int field478;

    @ObfuscatedName("r.ie")
    public static byte[][] field48;

    @ObfuscatedName("qz.h")
    public static String[] field4816;

    @ObfuscatedName("qy.j")
    public static int[] field4823;

    @ObfuscatedName("qh.x")
    public static int[] field4825;

    @ObfuscatedName("bv.du")
    public static class86 field483;

    @ObfuscatedName("qi.n")
    public static byte[][] field4831;

    @ObfuscatedName("qi.sb")
    public static class40 field4836;

    @ObfuscatedName("ql.fs")
    public static int field4838;

    @ObfuscatedName("qp.a")
    public static class330 field4842;

    @ObfuscatedName("qj.a")
    public static class330 field4849;

    @ObfuscatedName("bv.ir")
    public static byte[][] field485;

    @ObfuscatedName("qb.ay")
    public static class404 field4856;

    @ObfuscatedName("qr.h")
    public static int field4871;

    @ObfuscatedName("rq.an")
    public static int[] field4934;

    @ObfuscatedName("rq.ah")
    public static int field4935;

    @ObfuscatedName("rq.ao")
    public static int field4936;

    @ObfuscatedName("rk.y")
    public static int[] field4970;

    @ObfuscatedName("rk.f")
    public static int field4971;

    @ObfuscatedName("rk.a")
    public static int field4972;

    @ObfuscatedName("rk.d")
    public static int[] field4974;

    @ObfuscatedName("rk.c")
    public static int field4975;

    @ObfuscatedName("r.qw")
    public static class166 field50;

    @ObfuscatedName("rx.x")
    public static int field5019;

    @ObfuscatedName("rx.c")
    public static int field5021;

    @ObfuscatedName("rx.f")
    public static String field5022;

    @ObfuscatedName("rx.a")
    public static Applet field5024;

    @ObfuscatedName("client.ei")
    public static class328 field523;

    @ObfuscatedName("l.u")
    public static class147 field57;

    @ObfuscatedName("l.k")
    public static int field59;

    @ObfuscatedName("l.ac")
    public static FontMetrics field61;

    @ObfuscatedName("s.tm")
    public static int field63;

    @ObfuscatedName("s.a")
    public static class330 field64;

    @ObfuscatedName("s.iu")
    public static int field65;

    @ObfuscatedName("p.t")
    public static int field67;

    @ObfuscatedName("b.io")
    public static int[] field71;

    @ObfuscatedName("f.ne")
    public static int field8;

    @ObfuscatedName("ba.l")
    public static int[] field819;

    @ObfuscatedName("u.f")
    public static class16 field82;

    @ObfuscatedName("be.x")
    public static int[] field841;

    @ObfuscatedName("by.fw")
    public static int field861;

    @ObfuscatedName("by.fd")
    public static int field868;

    @ObfuscatedName("by.z")
    public static class93 field869;

    @ObfuscatedName("bb.iz")
    public static int field872;

    @ObfuscatedName("bu.r")
    public static int field888;

    @ObfuscatedName("bu.sx")
    public static class387 field889;

    @ObfuscatedName("z.s")
    public static class476[] field89;

    @ObfuscatedName("bu.vo")
    public static List field891;

    @ObfuscatedName("bw.f")
    public static boolean field897;

    @ObfuscatedName("bw.p")
    public static class476 field909;

    @ObfuscatedName("t.q")
    public static String field91;

    @ObfuscatedName("bw.bu")
    public static int field916;

    @ObfuscatedName("bn.qf")
    public static class105 field957;

    @ObfuscatedName("bf.er")
    public static class328 field958;

    @ObfuscatedName("t.ar")
    public static String field96;

    @ObfuscatedName("bz.px")
    public static class303[] field972;

    @ObfuscatedName("bz.dq")
    public static boolean field973;

    @ObfuscatedName("bz.pb")
    public static int field974;

    @ObfuscatedName("bi.bv")
    public static String field975;

    @ObfuscatedName("bs.au")
    public static boolean field986;

    @ObfuscatedName("bs.eq")
    public static class328 field990;

    @ObfuscatedName("cd.x")
    public static short[][][] field995;

    @ObfuscatedName("cd.n")
    public static int[][] field996;

    @ObfuscatedName("cd.j")
    public static byte[][][] field997;

    @ObfuscatedName("mx.a(II)I")
    public static int method5983(int arg0) {
        return arg0 == 0 || arg0 == 1 ? 0 : -1;
    }

    @ObfuscatedName("t.a(Llg;I)V")
    public static void method223(class330 arg0) {
        field1897 = arg0;
    }

    @ObfuscatedName("jv.a(Lqr;Ljava/lang/String;I)I")
    public static int method4901(class464 arg0, String arg1) {
        int var2 = arg0.field4864;
        byte[] var3 = class356.method4848(arg1);
        arg0.method7841(var3.length);
        arg0.field4864 += field3646.method5651(var3, 0, var3.length, arg0.field4867, arg0.field4864);
        return arg0.field4864 - var2;
    }

    @ObfuscatedName("ap.f(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method666(int arg0, String arg1, String arg2) {
        class106.method2139(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ah.c(Lqr;II)Ljava/lang/String;")
    public static String method430(class464 arg0, int arg1) {
        try {
            int var2 = arg0.method7801();
            if (var2 > arg1) {
                var2 = arg1;
            }
            byte[] var3 = new byte[var2];
            arg0.field4864 += field3646.method5656(arg0.field4867, arg0.field4864, var3, 0, var2);
            return class356.method2782(var3, 0, var2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @ObfuscatedName("cy.a(B)V")
    public static void method2164() {
        for (class67 var0 = (class67) class67.field828.method6040(); var0 != null; var0 = (class67) class67.field828.method6034()) {
            if (var0.field830 != null) {
                field4836.method732(var0.field830);
                var0.field830 = null;
            }
            if (var0.field834 != null) {
                field4836.method732(var0.field834);
                var0.field834 = null;
            }
        }
        class67.field828.method6030();
    }

    @ObfuscatedName("dc.a(II)V")
    public static void method2541(int arg0) {
    }

    @ObfuscatedName("qi.f(IB)Lgb;")
    public static class190 method7578(int arg0) {
        class190 var1 = (class190) class190.field2039.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field4195.method5859(14, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3319(new class464(var2));
        }
        class190.field2039.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("r.f(I)Ljava/security/SecureRandom;")
    public static SecureRandom method69() {
        SecureRandom var0 = new SecureRandom();
        var0.nextInt();
        return var0;
    }

    @ObfuscatedName("mu.a(JLjava/lang/String;I)I")
    public static final int method6245(long arg0, String arg1) {
        Random var3 = new Random();
        class464 var4 = new class464(128);
        class464 var5 = new class464(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method7698(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method7835(var3.nextInt());
        }
        var4.method7835(var6[0]);
        var4.method7835(var6[1]);
        var4.method7703(arg0);
        var4.method7703(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method7835(var3.nextInt());
        }
        var4.method7741(class70.field875, class70.field876);
        var5.method7698(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method7835(var3.nextInt());
        }
        var5.method7703(var3.nextLong());
        var5.method7702(var3.nextLong());
        client.method5126(var5);
        var5.method7703(var3.nextLong());
        var5.method7741(class70.field875, class70.field876);
        int var10 = class464.method2236(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class464 var11 = new class464(var10);
        var11.method7705(arg1);
        var11.field4864 = var10;
        var11.method7737(var6);
        class464 var12 = new class464(var11.field4864 + var5.field4864 + var4.field4864 + 5);
        var12.method7698(2);
        var12.method7698(var4.field4864);
        var12.method7708(var4.field4867, 0, var4.field4864);
        var12.method7698(var5.field4864);
        var12.method7708(var5.field4867, 0, var5.field4864);
        var12.method7775(var11.field4864);
        var12.method7708(var11.field4867, 0, var11.field4864);
        byte[] var13 = var12.field4867;
        int var14 = var13.length;
        StringBuilder var15 = new StringBuilder();
        for (int var16 = 0; var16 < var14; var16 += 3) {
            int var17 = var13[var16] & 0xFF;
            var15.append(class357.field4299[var17 >>> 2]);
            if (var16 < var14 - 1) {
                int var18 = var13[var16 + 1] & 0xFF;
                var15.append(class357.field4299[(var17 & 0x3) << 4 | var18 >>> 4]);
                if (var16 < var14 - 2) {
                    int var19 = var13[var16 + 2] & 0xFF;
                    var15.append(class357.field4299[(var18 & 0xF) << 2 | var19 >>> 6]).append(class357.field4299[var19 & 0x3F]);
                } else {
                    var15.append(class357.field4299[(var18 & 0xF) << 2]).append("=");
                }
            } else {
                var15.append(class357.field4299[(var17 & 0x3) << 4]).append("==");
            }
        }
        String var20 = var15.toString();
        String var22 = var20;
        try {
            URL var23 = new URL(client.method2840("services", false) + "m=accountappeal/login.ws");
            URLConnection var24 = var23.openConnection();
            var24.setDoInput(true);
            var24.setDoOutput(true);
            var24.setConnectTimeout(5000);
            OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
            var25.write("data2=" + class488.method2043(var22) + "&dest=" + class488.method2043("passwordchoice.ws"));
            var25.flush();
            InputStream var26 = var24.getInputStream();
            class464 var27 = new class464(new byte[1000]);
            do {
                int var28 = var26.read(var27.field4867, var27.field4864, 1000 - var27.field4864);
                if (var28 == -1) {
                    var25.close();
                    var26.close();
                    String var29 = new String(var27.field4867);
                    if (var29.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var29.startsWith("WRONG")) {
                        return 7;
                    } else if (var29.startsWith("RELOAD")) {
                        return 3;
                    } else if (var29.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var27.method7738(var6);
                        while (var27.field4864 > 0 && var27.field4867[var27.field4864 - 1] == 0) {
                            var27.field4864--;
                        }
                        String var30 = new String(var27.field4867, 0, var27.field4864);
                        if (class70.method2395(var30)) {
                            class33.method2572(var30, true, false);
                            return 2;
                        } else {
                            return 5;
                        }
                    }
                }
                var27.field4864 += var28;
            } while (var27.field4864 < 1000);
            return 5;
        } catch (Throwable var32) {
            var32.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("hg.g(Lfp;III)Lab;")
    public static final class44 method4150(class164 arg0, int arg1, int arg2) {
        if (field338 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class44 var3 = field184.method311();
                var3.field299 = new int[256 * (field1745 ? 2 : 1)];
                var3.field304 = arg2;
                var3.method336();
                var3.field303 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field303 > 16384) {
                    var3.field303 = 16384;
                }
                var3.method328(var3.field303);
                if (field3277 > 0 && field317 == null) {
                    field317 = new class46();
                    field4292 = Executors.newScheduledThreadPool(1);
                    field4292.scheduleAtFixedRate(field317, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (field317 != null) {
                    if (field317.field331[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    field317.field331[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class44();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bc.x(IIIIB)V")
    public static void method1104(int arg0, int arg1, int arg2, int arg3) {
        for (class67 var4 = (class67) class67.field828.method6040(); var4 != null; var4 = (class67) class67.field828.method6034()) {
            if (var4.field829 != -1 || var4.field826 != null) {
                int var5 = 0;
                if (arg1 > var4.field833) {
                    var5 += arg1 - var4.field833;
                } else if (arg1 < var4.field824) {
                    var5 += var4.field824 - arg1;
                }
                if (arg2 > var4.field827) {
                    var5 += arg2 - var4.field827;
                } else if (arg2 < var4.field835) {
                    var5 += var4.field835 - arg2;
                }
                if (var5 - 64 > var4.field825 || field4526.method2312() == 0 || var4.field823 != arg0) {
                    if (var4.field830 != null) {
                        field4836.method732(var4.field830);
                        var4.field830 = null;
                    }
                    if (var4.field834 != null) {
                        field4836.method732(var4.field834);
                        var4.field834 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = (var4.field825 - var5) * field4526.method2312() / var4.field825;
                    if (var4.field830 != null) {
                        var4.field830.method866(var6);
                    } else if (var4.field829 >= 0) {
                        class41 var7 = class41.method753(field130, var4.field829, 0);
                        if (var7 != null) {
                            class42 var8 = var7.method748().method757(field2522);
                            class49 var9 = class49.method881(var8, 100, var6);
                            var9.method865(-1);
                            field4836.method713(var9);
                            var4.field830 = var9;
                        }
                    }
                    if (var4.field834 != null) {
                        var4.field834.method866(var6);
                        if (!var4.field834.method7171()) {
                            var4.field834 = null;
                        }
                    } else if (var4.field826 != null && (var4.field822 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field826.length);
                        class41 var11 = class41.method753(field130, var4.field826[var10], 0);
                        if (var11 != null) {
                            class42 var12 = var11.method748().method757(field2522);
                            class49 var13 = class49.method881(var12, 100, var6);
                            var13.method865(0);
                            field4836.method713(var13);
                            var4.field834 = var13;
                            var4.field822 = var4.field831 + (int) (Math.random() * (double) (var4.field832 - var4.field831));
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ka.h(Ljava/lang/CharSequence;II[BIB)I")
    public static int method5681(CharSequence arg0, int arg1, int arg2, byte[] arg3, int arg4) {
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

    @ObfuscatedName("oy.c(Loo;FFFB)F")
    public static float method6978(class410 arg0, float arg1, float arg2, float arg3) {
        float var4 = class410.method9(arg0.field4584, arg0.field4583, arg1);
        if (Math.abs(var4) < class122.field1455) {
            return arg1;
        }
        float var5 = class410.method9(arg0.field4584, arg0.field4583, arg2);
        if (Math.abs(var5) < class122.field1455) {
            return arg2;
        }
        float var6 = 0.0F;
        float var7 = 0.0F;
        float var8 = 0.0F;
        float var9 = 0.0F;
        boolean var10 = true;
        boolean var11 = false;
        boolean var12;
        do {
            var12 = false;
            if (var10) {
                var6 = arg1;
                var9 = var4;
                var7 = arg2 - arg1;
                var8 = var7;
                var10 = false;
            }
            if (Math.abs(var9) < Math.abs(var5)) {
                arg1 = arg2;
                arg2 = var6;
                var6 = arg1;
                var4 = var5;
                var5 = var9;
                var9 = var4;
            }
            float var13 = class122.field1453 * Math.abs(arg2) + arg3 * 0.5F;
            float var14 = (var6 - arg2) * 0.5F;
            boolean var15 = Math.abs(var14) > var13 && var5 != 0.0F;
            if (var15) {
                if ((Math.abs(var8) < var13) || (Math.abs(var4) <= Math.abs(var5))) {
                    var7 = var14;
                    var8 = var14;
                } else {
                    float var16 = var5 / var4;
                    float var17;
                    float var18;
                    if (arg1 == var6) {
                        var17 = var14 * 2.0F * var16;
                        var18 = 1.0F - var16;
                    } else {
                        float var19 = var4 / var9;
                        float var20 = var5 / var9;
                        var17 = (var14 * 2.0F * var19 * (var19 - var20) - (arg2 - arg1) * (var20 - 1.0F)) * var16;
                        var18 = (var19 - 1.0F) * (var20 - 1.0F) * (var16 - 1.0F);
                    }
                    if ((double) var17 > 0.0D) {
                        var18 = -var18;
                    } else {
                        var17 = -var17;
                    }
                    float var21 = var8;
                    var8 = var7;
                    if (var17 * 2.0F < var14 * 3.0F * var18 - Math.abs(var13 * var18) && var17 < Math.abs(var21 * 0.5F * var18)) {
                        var7 = var17 / var18;
                    } else {
                        var7 = var14;
                        var8 = var14;
                    }
                }
                arg1 = arg2;
                var4 = var5;
                if (Math.abs(var7) > var13) {
                    arg2 += var7;
                } else if ((double) var14 > 0.0D) {
                    arg2 += var13;
                } else {
                    arg2 -= var13;
                }
                var5 = class410.method9(arg0.field4584, arg0.field4583, arg2);
                if ((double) (var5 * (var9 / Math.abs(var9))) > 0.0D) {
                    var10 = true;
                    var12 = true;
                } else {
                    var12 = true;
                }
            }
        } while (var12);
        return arg2;
    }

    @ObfuscatedName("bi.j(IIII)V")
    public static final void method2042(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                class79.field998[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class79.field998[arg0][arg1][arg2 + var5] = class79.field998[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class79.field998[arg0][arg1 + var6][arg2] = class79.field998[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && class79.field998[arg0][arg1 - 1][arg2] != 0) {
            class79.field998[arg0][arg1][arg2] = class79.field998[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && class79.field998[arg0][arg1][arg2 - 1] != 0) {
            class79.field998[arg0][arg1][arg2] = class79.field998[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && class79.field998[arg0][arg1 - 1][arg2 - 1] != 0) {
            class79.field998[arg0][arg1][arg2] = class79.field998[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("dg.y(Llg;Llg;Ljava/lang/String;Ljava/lang/String;B)Lnl;")
    public static class365 method2671(class330 arg0, class330 arg1, String arg2, String arg3) {
        int var4 = arg0.method5813(arg2);
        int var5 = arg0.method5854(var4, arg3);
        return class478.method6579(arg0, arg1, var4, var5);
    }

    @ObfuscatedName("ba.h(I)V")
    public static void method1762() {
        try {
            class165.field1795.method7522();
            for (int var0 = 0; var0 < field1794; var0++) {
                field1802[var0].method7522();
            }
            class165.field1801.method7522();
            class165.field1790.method7522();
        } catch (Exception var2) {
        }
    }

    @ObfuscatedName("hg.n(I)Lbt;")
    public static class65 method4151() {
        return class65.field799 < class65.field798 ? field4595[++class65.field799 - 1] : null;
    }

    @ObfuscatedName("ik.j(Ljava/lang/Float;Ljava/lang/Float;I)V")
    public static void method4801(Float arg0, Float arg1) {
        if (arg0 + class122.field1455 >= 1.3333334F) {
            Float var9 = 1.3333334F - class122.field1455;
            Float var10 = 0.33333334F - class122.field1455;
            return;
        }
        float var2 = arg0 - 2.0F;
        float var3 = arg0 - 1.0F;
        float var4 = (float) Math.sqrt((double) (var2 * var2 - var3 * 4.0F * var3));
        float var5 = (-var2 + var4) * 0.5F;
        if (arg1 + class122.field1455 > var5) {
            Float var6 = var5 - class122.field1455;
        } else {
            float var7 = (-var2 - var4) * 0.5F;
            if (arg1 < class122.field1455 + var7) {
                Float var8 = class122.field1455 + var7;
            }
        }
    }

    @ObfuscatedName("em.ad(Lgm;I)Z")
    public static boolean method2948(class194 arg0) {
        if (arg0.field2123 != null) {
            int[] var1 = arg0.field2123;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class194 var4 = class194.method2141(var3);
                if (var4.field2110 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2110 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("lw.hk(I)I")
    public static final int method5778() {
        if (field4526.method2353()) {
            return field478;
        }
        int var0 = 3;
        if (field4582 < 310) {
            int var1;
            int var2;
            if (client.field580 == 1) {
                var1 = field169 >> 7;
                var2 = field1134 >> 7;
            } else {
                var1 = field3404.field1163 >> 7;
                var2 = field3404.field1138 >> 7;
            }
            int var3 = field2566 >> 7;
            int var4 = field3704 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return field478;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return field478;
            }
            if ((class79.field993[field478][var3][var4] & 0x4) != 0) {
                var0 = field478;
            }
            int var5;
            if (var1 > var3) {
                var5 = var1 - var3;
            } else {
                var5 = var3 - var1;
            }
            int var6;
            if (var2 > var4) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            if (var5 > var6) {
                int var7 = var6 * 65536 / var5;
                int var8 = 32768;
                while (var1 != var3) {
                    if (var3 < var1) {
                        var3++;
                    } else if (var3 > var1) {
                        var3--;
                    }
                    if ((class79.field993[field478][var3][var4] & 0x4) != 0) {
                        var0 = field478;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class79.field993[field478][var3][var4] & 0x4) != 0) {
                            var0 = field478;
                        }
                    }
                }
            } else if (var6 > 0) {
                int var9 = var5 * 65536 / var6;
                int var10 = 32768;
                while (var2 != var4) {
                    if (var4 < var2) {
                        var4++;
                    } else if (var4 > var2) {
                        var4--;
                    }
                    if ((class79.field993[field478][var3][var4] & 0x4) != 0) {
                        var0 = field478;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class79.field993[field478][var3][var4] & 0x4) != 0) {
                            var0 = field478;
                        }
                    }
                }
            }
        }
        if (field3404.field1163 >= 0 && field3404.field1138 >= 0 && field3404.field1163 < 13312 && field3404.field1138 < 13312) {
            if ((class79.field993[field478][field3404.field1163 >> 7][field3404.field1138 >> 7] & 0x4) != 0) {
                var0 = field478;
            }
            return var0;
        } else {
            return field478;
        }
    }

    @ObfuscatedName("ap.ji(IIIII)V")
    public static final void method683(int arg0, int arg1, int arg2, int arg3) {
        if (client.field660 == 0 && !client.field662) {
            client.method203(class323.field3904, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class222.method1935(); var8++) {
            long var9 = class222.field2669[var8];
            if (var6 != var9) {
                var6 = var9;
                int var13 = class222.method7000(class222.field2669[var8]);
                int var14 = var13;
                int var15 = class222.method172(var8);
                long var16 = class222.field2669[var8];
                int var18 = (int) (var16 >>> 14 & 0x3L);
                int var21 = class222.method2431(class222.field2669[var8]);
                int var22 = var21;
                if (var18 == 2 && field1615.method3958(field478, var13, var15, var9) >= 0) {
                    class194 var23 = class194.method2141(var21);
                    if (var23.field2123 != null) {
                        var23 = var23.method3418();
                    }
                    if (var23 == null) {
                        continue;
                    }
                    class90 var24 = null;
                    for (class90 var25 = (class90) client.field635.method6040(); var25 != null; var25 = (class90) client.field635.method6034()) {
                        if (field478 == var25.field1123 && var25.field1129 == var14 && var25.field1124 == var15 && var25.field1128 == var22) {
                            var24 = var25;
                            break;
                        }
                    }
                    if (client.field660 == 1) {
                        client.method203(class323.field3773, client.field661 + " " + class97.field1276 + " " + class97.method4293(65535) + var23.field2092, 1, var22, var14, var15);
                    } else if (!client.field662) {
                        String[] var26 = var23.field2089;
                        if (var26 != null) {
                            for (int var27 = 4; var27 >= 0; var27--) {
                                if ((var24 == null || var24.method2215(var27)) && var26[var27] != null) {
                                    short var28 = 0;
                                    if (var27 == 0) {
                                        var28 = 3;
                                    }
                                    if (var27 == 1) {
                                        var28 = 4;
                                    }
                                    if (var27 == 2) {
                                        var28 = 5;
                                    }
                                    if (var27 == 3) {
                                        var28 = 6;
                                    }
                                    if (var27 == 4) {
                                        var28 = 1001;
                                    }
                                    client.method203(var26[var27], class97.method4293(65535) + var23.field2092, var28, var22, var14, var15);
                                }
                            }
                        }
                        client.method203(class323.field4057, class97.method4293(65535) + var23.field2092, 1002, var23.field2081, var14, var15);
                    } else if ((field1416 & 0x4) == 4) {
                        client.method203(client.field511, client.field612 + " " + class97.field1276 + " " + class97.method4293(65535) + var23.field2092, 2, var22, var14, var15);
                    }
                }
                if (var18 == 1) {
                    class96 var29 = client.field760[var22];
                    if (var29 == null) {
                        continue;
                    }
                    if (var29.field1267.field1961 == 1 && (var29.field1163 & 0x7F) == 64 && (var29.field1138 & 0x7F) == 64) {
                        for (int var30 = 0; var30 < client.field549; var30++) {
                            class96 var31 = client.field760[client.field550[var30]];
                            if (var31 != null && var29 != var31 && var31.field1267.field1961 == 1 && var29.field1163 == var31.field1163 && var29.field1138 == var31.field1138) {
                                client.method5162(var31, client.field550[var30], var14, var15);
                            }
                        }
                        int var32 = class103.field1317;
                        int[] var33 = class103.field1318;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class89 var35 = client.field621[var33[var34]];
                            if (var35 != null && var29.field1163 == var35.field1163 && var29.field1138 == var35.field1138) {
                                client.method2661(var35, var33[var34], var14, var15);
                            }
                        }
                    }
                    client.method5162(var29, var22, var14, var15);
                }
                if (var18 == 0) {
                    class89 var36 = client.field621[var22];
                    if (var36 == null) {
                        continue;
                    }
                    if ((var36.field1163 & 0x7F) == 64 && (var36.field1138 & 0x7F) == 64) {
                        for (int var37 = 0; var37 < client.field549; var37++) {
                            class96 var38 = client.field760[client.field550[var37]];
                            if (var38 != null && var38.field1267.field1961 == 1 && var36.field1163 == var38.field1163 && var36.field1138 == var38.field1138) {
                                client.method5162(var38, client.field550[var37], var14, var15);
                            }
                        }
                        int var39 = class103.field1317;
                        int[] var40 = class103.field1318;
                        for (int var41 = 0; var41 < var39; var41++) {
                            class89 var42 = client.field621[var40[var41]];
                            if (var42 != null && var36 != var42 && var36.field1163 == var42.field1163 && var36.field1138 == var42.field1138) {
                                client.method2661(var42, var40[var41], var14, var15);
                            }
                        }
                    }
                    if (client.field633 == var22) {
                        var4 = var9;
                    } else {
                        client.method2661(var36, var22, var14, var15);
                    }
                }
                if (var18 == 3) {
                    class349 var43 = client.field723[field478][var14][var15];
                    if (var43 != null) {
                        for (class100 var44 = (class100) var43.method6039(); var44 != null; var44 = (class100) var43.method6054()) {
                            class195 var45 = class195.method5052(var44.field1303);
                            if (client.field660 == 1) {
                                client.method203(class323.field3773, client.field661 + " " + class97.field1276 + " " + class97.method4293(16748608) + var45.field2144, 16, var44.field1303, var14, var15);
                            } else if (!client.field662) {
                                String[] var46 = var45.field2161;
                                for (int var47 = 4; var47 >= 0; var47--) {
                                    if (var44.method2437(var47)) {
                                        if (var46 != null && var46[var47] != null) {
                                            byte var48 = 0;
                                            if (var47 == 0) {
                                                var48 = 18;
                                            }
                                            if (var47 == 1) {
                                                var48 = 19;
                                            }
                                            if (var47 == 2) {
                                                var48 = 20;
                                            }
                                            if (var47 == 3) {
                                                var48 = 21;
                                            }
                                            if (var47 == 4) {
                                                var48 = 22;
                                            }
                                            client.method203(var46[var47], class97.method4293(16748608) + var45.field2144, var48, var44.field1303, var14, var15);
                                        } else if (var47 == 2) {
                                            client.method203(class323.field3824, class97.method4293(16748608) + var45.field2144, 20, var44.field1303, var14, var15);
                                        }
                                    }
                                }
                                client.method203(class323.field4057, class97.method4293(16748608) + var45.field2144, 1004, var44.field1303, var14, var15);
                            } else if ((field1416 & 0x1) == 1) {
                                client.method203(client.field511, client.field612 + " " + class97.field1276 + " " + class97.method4293(16748608) + var45.field2144, 17, var44.field1303, var14, var15);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var49 = class222.method7000(var4);
            int var50 = class222.method3789(var4);
            class89 var51 = client.field621[client.field633];
            client.method2661(var51, client.field633, var49, var50);
        }
    }

    @ObfuscatedName("k.jw(Ljava/lang/String;Lkn;I)Ljava/lang/String;")
    public static String method314(String arg0, class303 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + client.method3052(client.method4849(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("ef.mh(IIIZB)V")
    public static void method2868(int arg0, int arg1, int arg2, boolean arg3) {
        class275 var4 = class275.method3314(class273.field2998, client.field636.field1373);
        var4.field3123.method7746(arg2);
        var4.field3123.method7749(arg3 ? client.field587 : 0);
        var4.field3123.method7755(arg0);
        var4.field3123.method7753(arg1);
        client.field636.method2540(var4);
    }

    @ObfuscatedName("dj.mr(I)Z")
    public static boolean method2654() {
        return client.field608 >= 2;
    }
}
