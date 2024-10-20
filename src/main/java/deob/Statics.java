package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class Statics {

    @ObfuscatedName("u.gl")
    public static int[] field100;

    @ObfuscatedName("bh.eo")
    public static class335 field1002;

    @ObfuscatedName("bx.m")
    public static class487 field1006;

    @ObfuscatedName("bv.s")
    public static short[][][] field1011;

    @ObfuscatedName("bv.j")
    public static byte[][][] field1012;

    @ObfuscatedName("bv.i")
    public static byte[][][] field1013;

    @ObfuscatedName("bv.n")
    public static byte[][][] field1014;

    @ObfuscatedName("bv.r")
    public static int[] field1025;

    @ObfuscatedName("u.oq")
    public static class310 field103;

    @ObfuscatedName("cq.n")
    public static int field1057;

    @ObfuscatedName("u.t")
    public static class457[] field108;

    @ObfuscatedName("x.ht")
    public static class372 field109;

    @ObfuscatedName("ch.m")
    public static class310 field1092;

    @ObfuscatedName("z.j")
    public static class337 field11;

    @ObfuscatedName("x.i")
    public static class487 field110;

    @ObfuscatedName("ck.h")
    public static int field1105;

    @ObfuscatedName("a.c")
    public static int field114;

    @ObfuscatedName("cx.z")
    public static class64[] field1140;

    @ObfuscatedName("a.i")
    public static int field115;

    @ObfuscatedName("ct.em")
    public static class335 field1159;

    @ObfuscatedName("a.t")
    public static int field118;

    @ObfuscatedName("a.a")
    public static class265 field120;

    @ObfuscatedName("d.f")
    public static class337 field130;

    @ObfuscatedName("co.tv")
    public static int field1321;

    @ObfuscatedName("e.fl")
    public static class335 field133;

    @ObfuscatedName("cj.k")
    public static int[] field1333;

    @ObfuscatedName("cj.n")
    public static int[] field1335;

    @ObfuscatedName("cj.h")
    public static class487 field1336;

    @ObfuscatedName("cn.tt")
    public static int field1353;

    @ObfuscatedName("cw.js")
    public static int field1358;

    @ObfuscatedName("cw.mw")
    public static int field1370;

    @ObfuscatedName("dw.b")
    public static short[][] field1380;

    @ObfuscatedName("dz.b")
    public static boolean field1382;

    @ObfuscatedName("e.ff")
    public static int field139;

    @ObfuscatedName("z.ib")
    public static byte[][] field14;

    @ObfuscatedName("e.vt")
    public static Iterator field140;

    @ObfuscatedName("db.vq")
    public static class94 field1404;

    @ObfuscatedName("db.ur")
    public static int field1405;

    @ObfuscatedName("e.n")
    public static class487 field141;

    @ObfuscatedName("dy.tn")
    public static int field1417;

    @ObfuscatedName("dg.jz")
    public static class488[] field1421;

    @ObfuscatedName("dm.ba")
    public static int field1430;

    @ObfuscatedName("dm.d")
    public static String field1431;

    @ObfuscatedName("dn.ai")
    public static class337 field1433;

    @ObfuscatedName("dn.c")
    public static short[][] field1436;

    @ObfuscatedName("df.ty")
    public static int field1445;

    @ObfuscatedName("dv.s")
    public static File field1447;

    @ObfuscatedName("do.vp")
    public static class442 field1455;

    @ObfuscatedName("dt.kj")
    public static int field1461;

    @ObfuscatedName("dt.jf")
    public static int field1462;

    @ObfuscatedName("dh.jd")
    public static class488[] field1467;

    @ObfuscatedName("y.ie")
    public static int field148;

    @ObfuscatedName("ds.fo")
    public static int field1484;

    @ObfuscatedName("y.nr")
    public static class310 field151;

    @ObfuscatedName("y.av")
    public static class485 field153;

    @ObfuscatedName("y.ch")
    public static class487[] field155;

    @ObfuscatedName("dx.e")
    public static int field1559;

    @ObfuscatedName("ev.o")
    public static String[] field1585;

    @ObfuscatedName("ev.nd")
    public static int field1589;

    @ObfuscatedName("en.iz")
    public static int field1593;

    @ObfuscatedName("er.o")
    public static int[] field1595;

    @ObfuscatedName("er.i")
    public static int[] field1597;

    @ObfuscatedName("aa.fm")
    public static class335 field160;

    @ObfuscatedName("el.be")
    public static class326 field1607;

    @ObfuscatedName("aa.pw")
    public static int field161;

    @ObfuscatedName("el.bu")
    public static int field1614;

    @ObfuscatedName("eq.uq")
    public static int field1630;

    @ObfuscatedName("ea.vr")
    public static class348 field1634;

    @ObfuscatedName("es.r")
    public static int field1640;

    @ObfuscatedName("ew.b")
    public static class372 field1643;

    @ObfuscatedName("ed.l")
    public static byte[][] field1655;

    @ObfuscatedName("eh.d")
    public static int field1670;

    @ObfuscatedName("ep.ep")
    public static class335 field1676;

    @ObfuscatedName("eo.ag")
    public static class337 field1690;

    @ObfuscatedName("eg.z")
    public static class487 field1698;

    @ObfuscatedName("eg.br")
    public static class325 field1701;

    @ObfuscatedName("ec.nl")
    public static class70 field1702;

    @ObfuscatedName("ec.z")
    public static int field1703;

    @ObfuscatedName("ec.eb")
    public static class335 field1705;

    @ObfuscatedName("ef.ha")
    public static long field1710;

    @ObfuscatedName("ef.og")
    public static int field1713;

    @ObfuscatedName("eb.jq")
    public static int field1743;

    @ObfuscatedName("et.b")
    public static int field1744;

    @ObfuscatedName("et.ec")
    public static class335 field1751;

    @ObfuscatedName("ee.fy")
    public static String field1756;

    @ObfuscatedName("ez.eg")
    public static class335 field1761;

    @ObfuscatedName("ez.aw")
    public static FontMetrics field1762;

    @ObfuscatedName("em.b")
    public static class46 field1768;

    @ObfuscatedName("fx.ll")
    public static class310 field1779;

    @ObfuscatedName("fx.b")
    public static class51 field1782;

    @ObfuscatedName("fh.p")
    public static String[] field1786;

    @ObfuscatedName("fm.k")
    public static class110 field1797;

    @ObfuscatedName("fm.jy")
    public static class488[] field1798;

    @ObfuscatedName("i.j")
    public static class337 field18;

    @ObfuscatedName("fl.n")
    public static int field1803;

    @ObfuscatedName("fl.c")
    public static int[] field1806;

    @ObfuscatedName("fd.hj")
    public static class446 field1817;

    @ObfuscatedName("fg.w")
    public static String field1837;

    @ObfuscatedName("fg.f")
    public static String field1838;

    @ObfuscatedName("fq.q")
    public static String field1845;

    @ObfuscatedName("fj.j")
    public static int field1851;

    @ObfuscatedName("ar.sh")
    public static class488 field186;

    @ObfuscatedName("fw.w")
    public static File field1860;

    @ObfuscatedName("ft.z")
    public static short[][][] field1866;

    @ObfuscatedName("ft.c")
    public static int field1869;

    @ObfuscatedName("ft.p")
    public static int[] field1873;

    @ObfuscatedName("fa.ek")
    public static class335 field1883;

    @ObfuscatedName("fc.r")
    public static class179 field1908;

    @ObfuscatedName("fz.f")
    public static class337 field1922;

    @ObfuscatedName("fz.bh")
    public static String field1924;

    @ObfuscatedName("fz.ju")
    public static class487[] field1925;

    @ObfuscatedName("fp.f")
    public static class337 field1927;

    @ObfuscatedName("fp.w")
    public static int field1928;

    @ObfuscatedName("fp.jt")
    public static class487[] field1934;

    @ObfuscatedName("gk.vm")
    public static class65 field1944;

    @ObfuscatedName("gk.f")
    public static class337 field1950;

    @ObfuscatedName("ga.f")
    public static class337 field1962;

    @ObfuscatedName("ga.fp")
    public static String field1963;

    @ObfuscatedName("gf.w")
    public static class337 field1966;

    @ObfuscatedName("gf.f")
    public static class337 field1967;

    @ObfuscatedName("gf.v")
    public static int field1976;

    @ObfuscatedName("gi.w")
    public static class337 field1986;

    @ObfuscatedName("at.c")
    public static class487 field199;

    @ObfuscatedName("gq.vc")
    public static class339 field1998;

    @ObfuscatedName("gq.f")
    public static class337 field1999;

    @ObfuscatedName("gw.ed")
    public static long field2017;

    @ObfuscatedName("go.v")
    public static class337 field2025;

    @ObfuscatedName("go.w")
    public static class337 field2069;

    @ObfuscatedName("aj.f")
    public static class168 field207;

    @ObfuscatedName("gd.bi")
    public static String field2071;

    @ObfuscatedName("gd.l")
    public static int field2072;

    @ObfuscatedName("gg.f")
    public static class337 field2081;

    @ObfuscatedName("gg.w")
    public static class337 field2082;

    @ObfuscatedName("gg.a")
    public static String field2099;

    @ObfuscatedName("gc.f")
    public static class337 field2104;

    @ObfuscatedName("gh.vi")
    public static short[] field2116;

    @ObfuscatedName("gh.sg")
    public static boolean field2117;

    @ObfuscatedName("gy.hh")
    public static int field2118;

    @ObfuscatedName("gy.f")
    public static class337 field2124;

    @ObfuscatedName("gn.f")
    public static class337 field2125;

    @ObfuscatedName("gb.v")
    public static class337 field2130;

    @ObfuscatedName("gb.w")
    public static class337 field2137;

    @ObfuscatedName("gp.v")
    public static class337 field2155;

    @ObfuscatedName("gp.w")
    public static class337 field2197;

    @ObfuscatedName("aj.d")
    public static int field220;

    @ObfuscatedName("gr.i")
    public static class337 field2209;

    @ObfuscatedName("gr.n")
    public static boolean field2210;

    @ObfuscatedName("gr.l")
    public static int field2240;

    @ObfuscatedName("gz.tw")
    public static int field2267;

    @ObfuscatedName("gz.f")
    public static class337 field2273;

    @ObfuscatedName("ge.j")
    public static class337 field2286;

    @ObfuscatedName("ge.z")
    public static class337 field2292;

    @ObfuscatedName("gm.k")
    public static int field2311;

    @ObfuscatedName("gl.cx")
    public static class487 field2342;

    @ObfuscatedName("gv.fe")
    public static class335 field2355;

    @ObfuscatedName("aj.ah")
    public static boolean field236;

    @ObfuscatedName("hz.qp")
    public static class459 field2362;

    @ObfuscatedName("hf.z")
    public static int field2372;

    @ObfuscatedName("hf.j")
    public static int field2373;

    @ObfuscatedName("hf.tf")
    public static class39 field2376;

    @ObfuscatedName("hf.dw")
    public static boolean field2377;

    @ObfuscatedName("hi.r")
    public static short[] field2386;

    @ObfuscatedName("aj.fx")
    public static class335 field240;

    @ObfuscatedName("hv.t")
    public static int[] field2455;

    @ObfuscatedName("hr.b")
    public static int field2502;

    @ObfuscatedName("hr.m")
    public static int field2503;

    @ObfuscatedName("hr.t")
    public static int field2504;

    @ObfuscatedName("hr.h")
    public static int field2505;

    @ObfuscatedName("hr.p")
    public static int field2506;

    @ObfuscatedName("hr.o")
    public static int field2507;

    @ObfuscatedName("hr.u")
    public static int field2510;

    @ObfuscatedName("hr.d")
    public static class234 field2512;

    @ObfuscatedName("hr.x")
    public static int field2514;

    @ObfuscatedName("hk.ig")
    public static int[] field2520;

    @ObfuscatedName("ha.vx")
    public static List field2522;

    @ObfuscatedName("hn.bd")
    public static int field2537;

    @ObfuscatedName("hn.d")
    public static int field2549;

    @ObfuscatedName("hn.bn")
    public static int field2550;

    @ObfuscatedName("hn.o")
    public static int field2551;

    @ObfuscatedName("hn.u")
    public static int field2552;

    @ObfuscatedName("hn.x")
    public static int field2553;

    @ObfuscatedName("hn.aa")
    public static int field2555;

    @ObfuscatedName("hn.e")
    public static int field2557;

    @ObfuscatedName("hn.g")
    public static int field2558;

    @ObfuscatedName("hn.a")
    public static int field2559;

    @ObfuscatedName("hn.af")
    public static int field2560;

    @ObfuscatedName("hn.bt")
    public static int field2561;

    @ObfuscatedName("hn.p")
    public static int field2562;

    @ObfuscatedName("hn.bq")
    public static boolean[][] field2563;

    @ObfuscatedName("hn.y")
    public static int field2567;

    @ObfuscatedName("hn.ai")
    public static int field2568;

    @ObfuscatedName("hn.ag")
    public static int field2585;

    @ObfuscatedName("hn.q")
    public static int field2586;

    @ObfuscatedName("hn.bi")
    public static int field2596;

    @ObfuscatedName("hn.bw")
    public static int field2597;

    @ObfuscatedName("hn.bg")
    public static int field2600;

    @ObfuscatedName("hd.iq")
    public static int[] field2610;

    @ObfuscatedName("hw.fb")
    public static String field2621;

    @ObfuscatedName("ax.ph")
    public static class310[] field263;

    @ObfuscatedName("hx.th")
    public static int field2637;

    @ObfuscatedName("az.dy")
    public static class85 field265;

    @ObfuscatedName("az.bn")
    public static class352 field268;

    @ObfuscatedName("hs.bo")
    public static int field2728;

    @ObfuscatedName("hs.bq")
    public static int field2730;

    @ObfuscatedName("hs.bl")
    public static int field2738;

    @ObfuscatedName("hu.i")
    public static int field2745;

    @ObfuscatedName("hc.m")
    public static int[] field2765;

    @ObfuscatedName("hg.an")
    public static String field2769;

    @ObfuscatedName("n.nk")
    public static int field28;

    @ObfuscatedName("ap.p")
    public static int field280;

    @ObfuscatedName("ih.tp")
    public static int field2807;

    @ObfuscatedName("ip.hd")
    public static class407 field2819;

    @ObfuscatedName("ip.lr")
    public static class310 field2823;

    @ObfuscatedName("ip.vv")
    public static int field2825;

    @ObfuscatedName("iz.g")
    public static int[] field2826;

    @ObfuscatedName("ii.h")
    public static class151 field2852;

    @ObfuscatedName("id.ux")
    public static int field2875;

    @ObfuscatedName("ic.ea")
    public static class177 field2876;

    @ObfuscatedName("iv.ks")
    public static int field2908;

    @ObfuscatedName("iv.ho")
    public static class108 field2910;

    @ObfuscatedName("ig.od")
    public static int field2917;

    @ObfuscatedName("ib.sk")
    public static boolean field2939;

    @ObfuscatedName("ib.tr")
    public static class43 field2941;

    @ObfuscatedName("ib.jl")
    public static class488[] field2942;

    @ObfuscatedName("is.by")
    public static int field2964;

    @ObfuscatedName("ik.uy")
    public static int field2971;

    @ObfuscatedName("ik.m")
    public static class336 field2975;

    @ObfuscatedName("il.af")
    public static class310[][] field2984;

    @ObfuscatedName("il.ix")
    public static int field2985;

    @ObfuscatedName("if.te")
    public static class56 field2998;

    @ObfuscatedName("w.ag")
    public static Font field3;

    @ObfuscatedName("jt.l")
    public static int field3011;

    @ObfuscatedName("jt.bo")
    public static class454 field3020;

    @ObfuscatedName("je.is")
    public static class220 field3022;

    @ObfuscatedName("aq.k")
    public static int[] field303;

    @ObfuscatedName("jd.ef")
    public static class335 field3034;

    @ObfuscatedName("jz.k")
    public static class45 field3037;

    @ObfuscatedName("aq.c")
    public static int[] field304;

    @ObfuscatedName("aq.r")
    public static boolean[] field305;

    @ObfuscatedName("jo.k")
    public static class488 field3053;

    @ObfuscatedName("jm.hs")
    public static class372 field3055;

    @ObfuscatedName("jq.n")
    public static ThreadPoolExecutor field3060;

    @ObfuscatedName("ak.n")
    public static ScheduledExecutorService field316;

    @ObfuscatedName("ji.io")
    public static class488 field3192;

    @ObfuscatedName("ak.j")
    public static boolean field321;

    @ObfuscatedName("jg.da")
    public static boolean field3308;

    @ObfuscatedName("jx.z")
    public static int field3322;

    @ObfuscatedName("jk.ji")
    public static int field3332;

    @ObfuscatedName("ki.fn")
    public static class335 field3333;

    @ObfuscatedName("ki.f")
    public static long field3336;

    @ObfuscatedName("ki.w")
    public static long field3338;

    @ObfuscatedName("kf.rs")
    public static class493 field3342;

    @ObfuscatedName("kf.pz")
    public static int field3343;

    @ObfuscatedName("kq.bo")
    public static int field3357;

    @ObfuscatedName("ks.l")
    public static int field3358;

    @ObfuscatedName("ks.v")
    public static class337 field3360;

    @ObfuscatedName("ks.s")
    public static class292 field3361;

    @ObfuscatedName("ks.w")
    public static class337 field3362;

    @ObfuscatedName("ks.f")
    public static class337 field3363;

    @ObfuscatedName("ks.as")
    public static class414 field3365;

    @ObfuscatedName("ae.im")
    public static class488 field338;

    @ObfuscatedName("ky.fc")
    public static int field3382;

    @ObfuscatedName("ae.tq")
    public static class43 field339;

    @ObfuscatedName("kk.o")
    public static int field3408;

    @ObfuscatedName("kk.iv")
    public static int[] field3417;

    @ObfuscatedName("kv.ee")
    public static class335 field3449;

    @ObfuscatedName("kv.fz")
    public static String field3450;

    @ObfuscatedName("kr.l")
    public static int field3469;

    @ObfuscatedName("kc.iu")
    public static int field3473;

    @ObfuscatedName("kc.f")
    public static class337 field3474;

    @ObfuscatedName("kl.p")
    public static class93 field3484;

    @ObfuscatedName("k.qa")
    public static class105 field35;

    @ObfuscatedName("kp.cd")
    public static class487[] field3531;

    @ObfuscatedName("lj.t")
    public static int[][][] field3718;

    @ObfuscatedName("lj.f")
    public static class312 field3719;

    @ObfuscatedName("lc.fv")
    public static int field3727;

    @ObfuscatedName("lc.am")
    public static class414 field3728;

    @ObfuscatedName("lc.jn")
    public static class488[] field3729;

    @ObfuscatedName("la.l")
    public static int[][] field3795;

    @ObfuscatedName("la.ia")
    public static byte[][] field3799;

    @ObfuscatedName("la.dk")
    public static boolean field3801;

    @ObfuscatedName("lp.ld")
    public static class226 field3803;

    @ObfuscatedName("le.cl")
    public static class487 field3818;

    @ObfuscatedName("lr.qt")
    public static class171 field3827;

    @ObfuscatedName("bj.m")
    public static class47[] field383;

    @ObfuscatedName("bj.e")
    public static float[] field385;

    @ObfuscatedName("bj.b")
    public static class42[] field387;

    @ObfuscatedName("bj.i")
    public static byte[] field389;

    @ObfuscatedName("bj.n")
    public static int field390;

    @ObfuscatedName("bj.aw")
    public static int[] field391;

    @ObfuscatedName("bj.af")
    public static float[] field392;

    @ObfuscatedName("bj.c")
    public static int field393;

    @ObfuscatedName("bj.r")
    public static class52[] field394;

    @ObfuscatedName("bj.k")
    public static int field395;

    @ObfuscatedName("bj.t")
    public static class50[] field397;

    @ObfuscatedName("bj.h")
    public static boolean[] field398;

    @ObfuscatedName("bj.l")
    public static int field401;

    @ObfuscatedName("bj.d")
    public static float[] field405;

    @ObfuscatedName("bj.ai")
    public static float[] field406;

    @ObfuscatedName("bj.g")
    public static float[] field407;

    @ObfuscatedName("bj.y")
    public static float[] field408;

    @ObfuscatedName("k.u")
    public static byte[][][] field41;

    @ObfuscatedName("bj.aa")
    public static float[] field410;

    @ObfuscatedName("bj.ag")
    public static int[] field412;

    @ObfuscatedName("bj.p")
    public static int[] field413;

    @ObfuscatedName("lu.ng")
    public static int field4173;

    @ObfuscatedName("lu.jj")
    public static class487[] field4190;

    @ObfuscatedName("li.z")
    public static Thread field4202;

    @ObfuscatedName("lv.f")
    public static class407 field4244;

    @ObfuscatedName("br.es")
    public static class407 field425;

    @ObfuscatedName("lv.v")
    public static long field4253;

    @ObfuscatedName("lv.fr")
    public static String field4260;

    @ObfuscatedName("lv.ey")
    public static class335 field4261;

    @ObfuscatedName("br.ao")
    public static client field427;

    @ObfuscatedName("mw.gu")
    public static SecureRandom field4270;

    @ObfuscatedName("mp.w")
    public static class183[] field4273;

    @ObfuscatedName("mv.j")
    public static int field4285;

    @ObfuscatedName("mi.ir")
    public static int[][] field4298;

    @ObfuscatedName("bm.n")
    public static float field430;

    @ObfuscatedName("mx.vz")
    public static class445 field4300;

    @ObfuscatedName("mu.l")
    public static int[] field4308;

    @ObfuscatedName("mm.nf")
    public static int field4336;

    @ObfuscatedName("mm.tk")
    public static int field4341;

    @ObfuscatedName("mz.v")
    public static int field4358;

    @ObfuscatedName("mz.vl")
    public static long field4360;

    @ObfuscatedName("bm.l")
    public static int field437;

    @ObfuscatedName("nc.aj")
    public static Image field4370;

    @ObfuscatedName("ne.pi")
    public static int field4371;

    @ObfuscatedName("ne.jv")
    public static int field4373;

    @ObfuscatedName("nd.je")
    public static class488[] field4375;

    @ObfuscatedName("np.eh")
    public static class335 field4403;

    @ObfuscatedName("nu.in")
    public static int field4407;

    @ObfuscatedName("nw.k")
    public static class487[] field4414;

    @ObfuscatedName("na.la")
    public static class310 field4438;

    @ObfuscatedName("na.vf")
    public static int field4441;

    @ObfuscatedName("nj.k")
    public static short[] field4484;

    @ObfuscatedName("k.on")
    public static int field45;

    @ObfuscatedName("nx.ml")
    public static class88 field4508;

    @ObfuscatedName("nl.s")
    public static int field4511;

    @ObfuscatedName("nl.qb")
    public static class422 field4513;

    @ObfuscatedName("ok.cc")
    public static class487[] field4528;

    @ObfuscatedName("oe.j")
    public static int[] field4537;

    @ObfuscatedName("oe.ac")
    public static String field4541;

    @ObfuscatedName("on.ex")
    public static class335 field4546;

    @ObfuscatedName("og.dc")
    public static boolean field4559;

    @ObfuscatedName("oz.z")
    public static File field4573;

    @ObfuscatedName("oz.ky")
    public static int field4574;

    @ObfuscatedName("ot.fa")
    public static int field4581;

    @ObfuscatedName("ox.hn")
    public static class177 field4589;

    @ObfuscatedName("or.bw")
    public static String field4624;

    @ObfuscatedName("pl.v")
    public static int field4635;

    @ObfuscatedName("pv.n")
    public static int field4662;

    @ObfuscatedName("pv.fh")
    public static class335 field4663;

    @ObfuscatedName("pp.c")
    public static boolean field4674;

    @ObfuscatedName("pf.r")
    public static class296 field4676;

    @ObfuscatedName("bl.ih")
    public static int field468;

    @ObfuscatedName("pw.aa")
    public static boolean[] field4692;

    @ObfuscatedName("bl.p")
    public static class160 field472;

    @ObfuscatedName("bl.fi")
    public static class413 field475;

    @ObfuscatedName("bq.ta")
    public static int field486;

    @ObfuscatedName("bq.bt")
    public static int field487;

    @ObfuscatedName("bn.z")
    public static int[] field489;

    @ObfuscatedName("qw.i")
    public static int field4895;

    @ObfuscatedName("qn.sy")
    public static class397 field4903;

    @ObfuscatedName("qn.b")
    public static int[] field4907;

    @ObfuscatedName("bn.et")
    public static class335 field491;

    @ObfuscatedName("qh.f")
    public static class337 field4911;

    @ObfuscatedName("rn.f")
    public static class337 field4919;

    @ObfuscatedName("rm.sm")
    public static class160 field5003;

    @ObfuscatedName("rq.ag")
    public static int field5008;

    @ObfuscatedName("rq.ai")
    public static int field5011;

    @ObfuscatedName("rq.aa")
    public static int[] field5012;

    @ObfuscatedName("rk.w")
    public static int field5042;

    @ObfuscatedName("rk.v")
    public static int field5043;

    @ObfuscatedName("rk.f")
    public static int field5044;

    @ObfuscatedName("rk.s")
    public static int[] field5045;

    @ObfuscatedName("rj.cq")
    public static class488[] field5070;

    @ObfuscatedName("rj.qr")
    public static class459 field5071;

    @ObfuscatedName("st.f")
    public static class337 field5089;

    @ObfuscatedName("sf.s")
    public static int field5090;

    @ObfuscatedName("sf.f")
    public static Applet field5091;

    @ObfuscatedName("sf.w")
    public static String field5092;

    @ObfuscatedName("sf.v")
    public static int field5093;

    @ObfuscatedName("sf.z")
    public static int field5094;

    @ObfuscatedName("c.tx")
    public static int field56;

    @ObfuscatedName("client.ij")
    public static int field565;

    @ObfuscatedName("c.x")
    public static class474 field57;

    @ObfuscatedName("w.fw")
    public static int field6;

    @ObfuscatedName("c.ft")
    public static int field60;

    @ObfuscatedName("b.vg")
    public static class411 field65;

    @ObfuscatedName("b.ez")
    public static class335 field66;

    @ObfuscatedName("m.eu")
    public static class335 field71;

    @ObfuscatedName("t.k")
    public static int field80;

    @ObfuscatedName("client.gg")
    public static String field806;

    @ObfuscatedName("t.ab")
    public static GarbageCollectorMXBean field81;

    @ObfuscatedName("t.h")
    public static class474 field82;

    @ObfuscatedName("bw.aw")
    public static class337 field822;

    @ObfuscatedName("h.w")
    public static class16 field84;

    @ObfuscatedName("bg.s")
    public static int[] field849;

    @ObfuscatedName("p.i")
    public static class337 field86;

    @ObfuscatedName("bg.t")
    public static class310 field860;

    @ObfuscatedName("p.ui")
    public static int field89;

    @ObfuscatedName("bs.hu")
    public static class372 field895;

    @ObfuscatedName("bu.w")
    public static boolean field904;

    @ObfuscatedName("bu.s")
    public static class487[] field906;

    @ObfuscatedName("bu.j")
    public static class487 field907;

    @ObfuscatedName("bu.r")
    public static class487[] field909;

    @ObfuscatedName("bu.t")
    public static class487 field911;

    @ObfuscatedName("bu.b")
    public static class487 field933;

    @ObfuscatedName("bu.ck")
    public static class487 field936;

    @ObfuscatedName("bu.l")
    public static class488 field941;

    @ObfuscatedName("bc.z")
    public static String[] field975;

    @ObfuscatedName("ba.ar")
    public static class337 field991;

    @ObfuscatedName("bh.sa")
    public static class151 field992;

    @ObfuscatedName("lj.f([Ljava/lang/CharSequence;IIB)Ljava/lang/String;")
    public static String method5852(CharSequence[] arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            CharSequence var3 = arg0[arg1];
            return var3 == null ? "null" : var3.toString();
        } else {
            int var4 = arg1 + arg2;
            int var5 = 0;
            for (int var6 = arg1; var6 < var4; var6++) {
                CharSequence var7 = arg0[var6];
                if (var7 == null) {
                    var5 += 4;
                } else {
                    var5 += var7.length();
                }
            }
            StringBuilder var8 = new StringBuilder(var5);
            for (int var9 = arg1; var9 < var4; var9++) {
                CharSequence var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @ObfuscatedName("ih.v(I)[Lre;")
    public static class486[] method4513() {
        return new class486[] { class486.field5018, class486.field5017, class486.field5019 };
    }

    @ObfuscatedName("ha.f(Lln;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method4110(class337 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method5988(arg1);
        int var6 = arg0.method6057(var5, arg2);
        class291.method3020(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("k.f(Lln;B)V")
    public static void method76(class337 arg0) {
        field130 = arg0;
    }

    @ObfuscatedName("gv.s(IIIIB)V")
    public static void method3872(int arg0, int arg1, int arg2, int arg3) {
        class81 var4 = (class81) class81.field1035.method7706((long) arg0);
        if (var4 == null) {
            var4 = new class81();
            class81.field1035.method7716(var4, (long) arg0);
        }
        if (var4.field1033.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field1033.length; var7++) {
                var5[var7] = var4.field1033[var7];
                var6[var7] = var4.field1032[var7];
            }
            for (int var8 = var4.field1033.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field1033 = var5;
            var4.field1032 = var6;
        }
        var4.field1033[arg1] = arg2;
        var4.field1032[arg1] = arg3;
    }

    @ObfuscatedName("hb.j(IB)I")
    public static int method4292(int arg0) {
        int var1 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var1 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var1 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var1 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var1 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var1++;
        }
        return arg0 + var1;
    }

    @ObfuscatedName("dl.i(IIZB)Ljava/lang/String;")
    public static String method2825(int arg0, int arg1, boolean arg2) {
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("" + arg1);
        } else if (arg2 && arg0 >= 0) {
            int var3 = 2;
            int var4 = arg0 / arg1;
            while (var4 != 0) {
                var4 /= arg1;
                var3++;
            }
            char[] var5 = new char[var3];
            var5[0] = '+';
            for (int var6 = var3 - 1; var6 > 0; var6--) {
                int var7 = arg0;
                arg0 /= arg1;
                int var8 = var7 - arg0 * arg1;
                if (var8 >= 10) {
                    var5[var6] = (char) (var8 + 87);
                } else {
                    var5[var6] = (char) (var8 + 48);
                }
            }
            return new String(var5);
        } else {
            return Integer.toString(arg0, arg1);
        }
    }

    @ObfuscatedName("dq.w(Lln;Lln;ZIS)V")
    public static void method2940(class337 arg0, class337 arg1, boolean arg2, int arg3) {
        if (!field904) {
            if (arg3 == 0) {
                class72.method6113(arg2);
            } else {
                class72.method689(arg3);
            }
            class484.method8349();
            byte[] var4 = arg0.method5971("title.jpg", "");
            field941 = class31.method4990(var4);
            field3053 = field941.method8428();
            class72.method3647(arg1, client.field498);
            field1698 = class489.method3345(arg1, "titlebox", "");
            field907 = class489.method3345(arg1, "titlebutton", "");
            field110 = class489.method3345(arg1, "titlebutton_large", "");
            field141 = class489.method3345(arg1, "play_now_text", "");
            class489.method3345(arg1, "titlebutton_wide42,1", "");
            field906 = class489.method2924(arg1, "runes", "");
            field909 = class489.method2924(arg1, "title_mute", "");
            field933 = class489.method3345(arg1, "options_radio_buttons,0", "");
            field1006 = class489.method3345(arg1, "options_radio_buttons,4", "");
            field911 = class489.method3345(arg1, "options_radio_buttons,2", "");
            field1336 = class489.method3345(arg1, "options_radio_buttons,6", "");
            field2964 = field933.field5024;
            field1614 = field933.field5026;
            field3484 = new class93(field906);
            if (arg2) {
                class72.field924 = "";
                class72.field913 = "";
                class72.field927 = new String[8];
                class72.field926 = 0;
            }
            field1430 = 0;
            field1924 = "";
            class72.field931 = true;
            class72.field910 = false;
            if (field1404.method2454()) {
                class291.method423(2);
            } else {
                class291.method4986(2, field1761, "scape main", "", 255, false);
            }
            if (field4244 != null) {
                try {
                    class474 var5 = new class474(4);
                    var5.method7947(3);
                    var5.method7949(0);
                    field4244.method7152(var5.field4936, 0, 4);
                } catch (IOException var9) {
                    try {
                        field4244.method7150();
                    } catch (Exception var8) {
                    }
                    class338.field4245++;
                    field4244 = null;
                }
            }
            field904 = true;
            class72.field925 = (field220 - 765) / 2;
            class72.field923 = class72.field925 + 202;
            field1670 = class72.field923 + 180;
            field941.method8444(class72.field925, 0);
            field3053.method8444(class72.field925 + 382, 0);
            field199.method8374(class72.field925 + 382 - field199.field5024 / 2, 18);
        } else if (arg3 == 4) {
            class72.method689(4);
        }
    }

    @ObfuscatedName("bi.j(FFFFLda;S)V")
    public static void method1135(float arg0, float arg1, float arg2, float arg3, class126 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1532 = var7 - var6 - var8;
        arg4.field1544 = var8 + var8 + var8;
        arg4.field1530 = var5 + var5 + var5;
        arg4.field1529 = arg0;
    }

    @ObfuscatedName("ek.x(IIIIIIILhn;Lgv;I)V")
    public static final void method3103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class220 arg7, class207 arg8) {
        class200 var9 = class200.method7839(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field2182;
            var11 = var9.field2181;
        } else {
            var10 = var9.field2181;
            var11 = var9.field2182;
        }
        int var12;
        int var13;
        if (arg2 + var10 <= 104) {
            var12 = (var10 >> 1) + arg2;
            var13 = (var10 + 1 >> 1) + arg2;
        } else {
            var12 = arg2;
            var13 = arg2 + 1;
        }
        int var14;
        int var15;
        if (arg3 + var11 <= 104) {
            var14 = (var11 >> 1) + arg3;
            var15 = (var11 + 1 >> 1) + arg3;
        } else {
            var14 = arg3;
            var15 = arg3 + 1;
        }
        int[][] var16 = class78.field1015[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class229.method3883(arg2, arg3, 2, var9.field2173 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field2194 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class222 var23;
            if (var9.field2177 == -1 && var9.field2180 == null) {
                var23 = var9.method3609(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class76(arg4, 22, arg5, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
            }
            arg7.method4118(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field2204 == 1) {
                arg8.method3848(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class222 var49;
            if (var9.field2177 == -1 && var9.field2180 == null) {
                var49 = var9.method3609(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class76(arg4, 10, arg5, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
            }
            if (var49 != null) {
                arg7.method4122(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field2204 != 0) {
                arg8.method3846(arg2, arg3, var10, var11, var9.field2172);
            }
        } else if (arg6 >= 12) {
            class222 var24;
            if (var9.field2177 == -1 && var9.field2180 == null) {
                var24 = var9.method3609(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class76(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
            }
            arg7.method4122(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field2204 != 0) {
                arg8.method3846(arg2, arg3, var10, var11, var9.field2172);
            }
        } else if (arg6 == 0) {
            class222 var25;
            if (var9.field2177 == -1 && var9.field2180 == null) {
                var25 = var9.method3609(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class76(arg4, 0, arg5, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
            }
            arg7.method4151(arg0, arg2, arg3, var17, var25, (class222) null, class78.field1016[arg5], 0, var20, var22);
            if (var9.field2204 != 0) {
                arg8.method3845(arg2, arg3, arg6, arg5, var9.field2172);
            }
        } else if (arg6 == 1) {
            class222 var26;
            if (var9.field2177 == -1 && var9.field2180 == null) {
                var26 = var9.method3609(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class76(arg4, 1, arg5, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
            }
            arg7.method4151(arg0, arg2, arg3, var17, var26, (class222) null, class78.field1017[arg5], 0, var20, var22);
            if (var9.field2204 != 0) {
                arg8.method3845(arg2, arg3, arg6, arg5, var9.field2172);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class222 var28;
            class222 var29;
            if (var9.field2177 == -1 && var9.field2180 == null) {
                var28 = var9.method3609(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method3609(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class76(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
                var29 = new class76(arg4, 2, var27, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
            }
            arg7.method4151(arg0, arg2, arg3, var17, var28, var29, class78.field1016[arg5], class78.field1016[var27], var20, var22);
            if (var9.field2204 != 0) {
                arg8.method3845(arg2, arg3, arg6, arg5, var9.field2172);
            }
        } else if (arg6 == 3) {
            class222 var30;
            if (var9.field2177 == -1 && var9.field2180 == null) {
                var30 = var9.method3609(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class76(arg4, 3, arg5, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
            }
            arg7.method4151(arg0, arg2, arg3, var17, var30, (class222) null, class78.field1017[arg5], 0, var20, var22);
            if (var9.field2204 != 0) {
                arg8.method3845(arg2, arg3, arg6, arg5, var9.field2172);
            }
        } else if (arg6 == 9) {
            class222 var31;
            if (var9.field2177 == -1 && var9.field2180 == null) {
                var31 = var9.method3609(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class76(arg4, arg6, arg5, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
            }
            arg7.method4122(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field2204 != 0) {
                arg8.method3846(arg2, arg3, var10, var11, var9.field2172);
            }
        } else if (arg6 == 4) {
            class222 var32;
            if (var9.field2177 == -1 && var9.field2180 == null) {
                var32 = var9.method3609(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class76(arg4, 4, arg5, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
            }
            arg7.method4121(arg0, arg2, arg3, var17, var32, (class222) null, class78.field1016[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method4138(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class200.method7839(class229.method2897(var34)).field2178;
            }
            class222 var36;
            if (var9.field2177 == -1 && var9.field2180 == null) {
                var36 = var9.method3609(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class76(arg4, 4, arg5, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
            }
            arg7.method4121(arg0, arg2, arg3, var17, var36, (class222) null, class78.field1016[arg5], 0, class78.field1018[arg5] * var33, class78.field1008[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method4138(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class200.method7839(class229.method2897(var38)).field2178 / 2;
            }
            class222 var40;
            if (var9.field2177 == -1 && var9.field2180 == null) {
                var40 = var9.method3609(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class76(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
            }
            arg7.method4121(arg0, arg2, arg3, var17, var40, (class222) null, 256, arg5, class78.field1020[arg5] * var37, class78.field1021[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class222 var42;
            if (var9.field2177 == -1 && var9.field2180 == null) {
                var42 = var9.method3609(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class76(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
            }
            arg7.method4121(arg0, arg2, arg3, var17, var42, (class222) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method4138(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class200.method7839(class229.method2897(var44)).field2178 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class222 var47;
            class222 var48;
            if (var9.field2177 == -1 && var9.field2180 == null) {
                var47 = var9.method3609(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method3609(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class76(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
                var48 = new class76(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field2177, var9.field2203, (class222) null);
            }
            arg7.method4121(arg0, arg2, arg3, var17, var47, var48, 256, arg5, class78.field1020[arg5] * var43, class78.field1021[arg5] * var43, var20, var22);
        }
    }

    @ObfuscatedName("o.d(S)V")
    public static void method263() {
        class72.field910 = false;
        field941.method8444(class72.field925, 0);
        field3053.method8444(class72.field925 + 382, 0);
        field199.method8374(class72.field925 + 382 - field199.field5024 / 2, 18);
    }

    @ObfuscatedName("ci.ap(ILba;ZB)I")
    public static int method2595(int arg0, class75 arg1, boolean arg2) {
        if (arg0 == 5504) {
            field3469 -= 2;
            int var3 = class67.field857[field3469];
            int var4 = class67.field857[field3469 + 1];
            if (!client.field767) {
                client.field582 = var3;
                client.field583 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            class67.field857[++field3469 - 1] = client.field582;
            return 1;
        } else if (arg0 == 5506) {
            class67.field857[++field3469 - 1] = client.field583;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = class67.field857[--field3469];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field589 = var5;
            return 1;
        } else if (arg0 == 5531) {
            class67.field857[++field3469 - 1] = client.field589;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.bm(II)Ljava/lang/Object;")
    public static Object method1683(int arg0) {
        return class67.method6961((class464) class351.method19(class464.method7831(), arg0));
    }

    @ObfuscatedName("mn.ia(IIIII)V")
    public static final void method6216(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < client.field724; var4++) {
            if (client.field731[var4] + client.field729[var4] > arg0 && client.field729[var4] < arg0 + arg2 && client.field640[var4] + client.field571[var4] > arg1 && client.field571[var4] < arg1 + arg3) {
                client.field726[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.jg(Lkz;III)V")
    public static void method1682(class310 arg0, int arg1, int arg2) {
        if (arg0.field3545 == 0) {
            arg0.field3565 = arg0.field3561;
        } else if (arg0.field3545 == 1) {
            arg0.field3565 = (arg1 - arg0.field3567) / 2 + arg0.field3561;
        } else if (arg0.field3545 == 2) {
            arg0.field3565 = arg1 - arg0.field3567 - arg0.field3561;
        } else if (arg0.field3545 == 3) {
            arg0.field3565 = arg0.field3561 * arg1 >> 14;
        } else if (arg0.field3545 == 4) {
            arg0.field3565 = (arg0.field3561 * arg1 >> 14) + (arg1 - arg0.field3567) / 2;
        } else {
            arg0.field3565 = arg1 - arg0.field3567 - (arg0.field3561 * arg1 >> 14);
        }
        if (arg0.field3695 == 0) {
            arg0.field3566 = arg0.field3562;
        } else if (arg0.field3695 == 1) {
            arg0.field3566 = (arg2 - arg0.field3568) / 2 + arg0.field3562;
        } else if (arg0.field3695 == 2) {
            arg0.field3566 = arg2 - arg0.field3568 - arg0.field3562;
        } else if (arg0.field3695 == 3) {
            arg0.field3566 = arg0.field3562 * arg2 >> 14;
        } else if (arg0.field3695 == 4) {
            arg0.field3566 = (arg0.field3562 * arg2 >> 14) + (arg2 - arg0.field3568) / 2;
        } else {
            arg0.field3566 = arg2 - arg0.field3568 - (arg0.field3562 * arg2 >> 14);
        }
    }

    @ObfuscatedName("ib.ly(Lkz;IIII)V")
    public static final void method4867(class310 arg0, int arg1, int arg2, int arg3) {
        client.method3415();
        class299 var4 = arg0.method5677(false);
        if (var4 == null) {
            return;
        }
        class484.method8288(arg1, arg2, var4.field3454 + arg1, var4.field3452 + arg2);
        if (client.field671 == 2 || client.field671 == 5) {
            class484.method8335(arg1, arg2, 0, var4.field3451, var4.field3453);
        } else {
            int var5 = client.field583 & 0x7FF;
            int var6 = field4508.field1204 / 32 + 48;
            int var7 = 464 - field4508.field1161 / 32;
            field186.method8442(arg1, arg2, var4.field3454, var4.field3452, var6, var7, var5, 256, var4.field3451, var4.field3453);
            for (int var8 = 0; var8 < client.field751; var8++) {
                int var9 = client.field608[var8] * 4 + 2 - field4508.field1204 / 32;
                int var10 = client.field592[var8] * 4 + 2 - field4508.field1161 / 32;
                method460(arg1, arg2, var9, var10, client.field580[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class356 var13 = client.field642[field1370][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - field4508.field1204 / 32;
                        int var15 = var12 * 4 + 2 - field4508.field1161 / 32;
                        method460(arg1, arg2, var14, var15, field1421[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < client.field556; var16++) {
                class96 var17 = client.field683[client.field557[var16]];
                if (var17 != null && var17.method2258()) {
                    class191 var18 = var17.field1295;
                    if (var18 != null && var18.field2023 != null) {
                        var18 = var18.method3427();
                    }
                    if (var18 != null && var18.field2053 && var18.field2064) {
                        int var19 = var17.field1204 / 32 - field4508.field1204 / 32;
                        int var20 = var17.field1161 / 32 - field4508.field1161 / 32;
                        method460(arg1, arg2, var19, var20, field1421[1], var4);
                    }
                }
            }
            int var21 = class103.field1343;
            int[] var22 = class103.field1350;
            for (int var23 = 0; var23 < var21; var23++) {
                class88 var24 = client.field621[var22[var23]];
                if (var24 != null && var24.method2258() && !var24.field1127 && field4508 != var24) {
                    int var25 = var24.field1204 / 32 - field4508.field1204 / 32;
                    int var26 = var24.field1161 / 32 - field4508.field1161 / 32;
                    if (var24.method2241()) {
                        method460(arg1, arg2, var25, var26, field1421[3], var4);
                    } else if (field4508.field1126 != 0 && var24.field1126 != 0 && field4508.field1126 == var24.field1126) {
                        method460(arg1, arg2, var25, var26, field1421[4], var4);
                    } else if (var24.method2246()) {
                        method460(arg1, arg2, var25, var26, field1421[5], var4);
                    } else if (var24.method2250()) {
                        method460(arg1, arg2, var25, var26, field1421[6], var4);
                    } else {
                        method460(arg1, arg2, var25, var26, field1421[2], var4);
                    }
                }
            }
            if (client.field518 != 0 && client.field511 % 20 < 10) {
                if (client.field518 == 1 && client.field519 >= 0 && client.field519 < client.field683.length) {
                    class96 var27 = client.field683[client.field519];
                    if (var27 != null) {
                        int var28 = var27.field1204 / 32 - field4508.field1204 / 32;
                        int var29 = var27.field1161 / 32 - field4508.field1161 / 32;
                        client.method6401(arg1, arg2, var28, var29, field1467[1], var4);
                    }
                }
                if (client.field518 == 2) {
                    int var30 = client.field521 * 4 - field2118 * 4 + 2 - field4508.field1204 / 32;
                    int var31 = client.field540 * 4 - field565 * 4 + 2 - field4508.field1161 / 32;
                    client.method6401(arg1, arg2, var30, var31, field1467[1], var4);
                }
                if (client.field518 == 10 && client.field520 >= 0 && client.field520 < client.field621.length) {
                    class88 var32 = client.field621[client.field520];
                    if (var32 != null) {
                        int var33 = var32.field1204 / 32 - field4508.field1204 / 32;
                        int var34 = var32.field1161 / 32 - field4508.field1161 / 32;
                        client.method6401(arg1, arg2, var33, var34, field1467[1], var4);
                    }
                }
            }
            if (client.field755 != 0) {
                int var35 = client.field755 * 4 + 2 - field4508.field1204 / 32;
                int var36 = client.field756 * 4 + 2 - field4508.field1161 / 32;
                method460(arg1, arg2, var35, var36, field1467[0], var4);
            }
            if (!field4508.field1127) {
                class484.method8296(var4.field3454 / 2 + arg1 - 1, var4.field3452 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        client.field679[arg3] = true;
    }

    @ObfuscatedName("ar.lg(IIIILrs;Lkb;B)V")
    public static final void method460(int arg0, int arg1, int arg2, int arg3, class488 arg4, class299 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = client.field583 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class217.field2515[var6];
        int var9 = class217.field2516[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method8417(arg5.field3454 / 2 + var10 - arg4.field5030 / 2, arg5.field3452 / 2 - var11 - arg4.field5040 / 2, arg0, arg1, arg5.field3454, arg5.field3452, arg5.field3451, arg5.field3453);
        } else {
            arg4.method8402(arg5.field3454 / 2 + arg0 + var10 - arg4.field5030 / 2, arg5.field3452 / 2 + arg1 - var11 - arg4.field5040 / 2);
        }
    }

    @ObfuscatedName("ly.ld(Lkz;B)Ljava/lang/String;")
    public static String method5873(class310 arg0) {
        if (class311.method1993(client.method3252(arg0)) == 0) {
            return null;
        } else if (arg0.field3623 == null || arg0.field3623.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3623;
        }
    }
}
