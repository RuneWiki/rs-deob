package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.security.SecureRandom;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("l.s")
    public static int field1;

    @ObfuscatedName("l.gf")
    public static class332 field10;

    @ObfuscatedName("bo.o")
    public static byte[][][] field1007;

    @ObfuscatedName("by.r")
    public static int field1010;

    @ObfuscatedName("by.l")
    public static File field1011;

    @ObfuscatedName("bk.f")
    public static String field1017;

    @ObfuscatedName("ch.hb")
    public static class434 field1031;

    @ObfuscatedName("ch.x")
    public static int[][][] field1034;

    @ObfuscatedName("cf.ro")
    public static class147 field1037;

    @ObfuscatedName("j.v")
    public static int[][] field107;

    @ObfuscatedName("j.q")
    public static class306 field110;

    @ObfuscatedName("cb.ax")
    public static class368 field1108;

    @ObfuscatedName("f.ks")
    public static class286 field111;

    @ObfuscatedName("cd.dy")
    public static boolean field1179;

    @ObfuscatedName("cd.v")
    public static int field1183;

    @ObfuscatedName("cd.w")
    public static int[] field1189;

    @ObfuscatedName("g.sm")
    public static int field120;

    @ObfuscatedName("cc.fz")
    public static String field1201;

    @ObfuscatedName("g.y")
    public static short[] field121;

    @ObfuscatedName("cs.bs")
    public static int field1219;

    @ObfuscatedName("ck.fk")
    public static String field1243;

    @ObfuscatedName("cy.b")
    public static int field1246;

    @ObfuscatedName("cy.kg")
    public static class286 field1248;

    @ObfuscatedName("cj.t")
    public static String field1274;

    @ObfuscatedName("ci.gv")
    public static class332 field1275;

    @ObfuscatedName("ct.hr")
    public static int[] field1293;

    @ObfuscatedName("ct.eo")
    public static class305 field1296;

    @ObfuscatedName("ct.ip")
    public static class434[] field1297;

    @ObfuscatedName("ca.g")
    public static String field1313;

    @ObfuscatedName("cx.de")
    public static class82 field1329;

    @ObfuscatedName("cm.em")
    public static class305 field1336;

    @ObfuscatedName("cm.r")
    public static File field1339;

    @ObfuscatedName("ce.er")
    public static long field1348;

    @ObfuscatedName("ce.s")
    public static class307 field1349;

    @ObfuscatedName("ce.hk")
    public static int[][] field1350;

    @ObfuscatedName("cv.hu")
    public static int field1353;

    @ObfuscatedName("cv.rt")
    public static class138 field1355;

    @ObfuscatedName("db.i")
    public static int field1369;

    @ObfuscatedName("db.s")
    public static int field1371;

    @ObfuscatedName("dq.v")
    public static class307 field1374;

    @ObfuscatedName("dm.d")
    public static byte[][][] field1394;

    @ObfuscatedName("dt.ps")
    public static class410 field1433;

    @ObfuscatedName("dv.b")
    public static int[] field1465;

    @ObfuscatedName("dv.hc")
    public static int field1467;

    @ObfuscatedName("dp.m")
    public static String[] field1491;

    @ObfuscatedName("dp.jj")
    public static int field1492;

    @ObfuscatedName("dp.sr")
    public static int field1493;

    @ObfuscatedName("r.id")
    public static class434[] field15;

    @ObfuscatedName("dd.bi")
    public static class322 field1503;

    @ObfuscatedName("dy.sj")
    public static class36 field1509;

    @ObfuscatedName("dx.nb")
    public static class286 field1517;

    @ObfuscatedName("dc.rz")
    public static boolean field1529;

    @ObfuscatedName("ep.st")
    public static class53 field1549;

    @ObfuscatedName("et.ix")
    public static int field1558;

    @ObfuscatedName("et.bq")
    public static int field1561;

    @ObfuscatedName("et.uy")
    public static short[] field1565;

    @ObfuscatedName("b.v")
    public static int field157;

    @ObfuscatedName("eh.l")
    public static String field1571;

    @ObfuscatedName("eh.fr")
    public static int field1573;

    @ObfuscatedName("ev.ub")
    public static class309 field1578;

    @ObfuscatedName("z.hl")
    public static int field158;

    @ObfuscatedName("z.gc")
    public static long field160;

    @ObfuscatedName("ey.ty")
    public static class62 field1606;

    @ObfuscatedName("z.ha")
    public static int field161;

    @ObfuscatedName("ey.cy")
    public static char field1611;

    @ObfuscatedName("eu.w")
    public static class433 field1614;

    @ObfuscatedName("ej.sl")
    public static int field1625;

    @ObfuscatedName("es.up")
    public static long field1627;

    @ObfuscatedName("es.w")
    public static int field1629;

    @ObfuscatedName("es.ex")
    public static class367 field1630;

    @ObfuscatedName("es.u")
    public static int field1631;

    @ObfuscatedName("en.fg")
    public static SecureRandom field1638;

    @ObfuscatedName("ed.q")
    public static class433 field1639;

    @ObfuscatedName("ew.ig")
    public static class433[] field1651;

    @ObfuscatedName("eq.bc")
    public static String field1653;

    @ObfuscatedName("eq.w")
    public static boolean[] field1654;

    @ObfuscatedName("ez.i")
    public static int field1668;

    @ObfuscatedName("em.ed")
    public static class305 field1671;

    @ObfuscatedName("ex.c")
    public static String field1687;

    @ObfuscatedName("el.o")
    public static int field1692;

    @ObfuscatedName("el.e")
    public static File field1695;

    @ObfuscatedName("el.a")
    public static int field1696;

    @ObfuscatedName("r.t")
    public static int field17;

    @ObfuscatedName("el.gs")
    public static class361 field1700;

    @ObfuscatedName("el.po")
    public static class97 field1702;

    @ObfuscatedName("ek.h")
    public static class43 field1707;

    @ObfuscatedName("ek.fa")
    public static String field1708;

    @ObfuscatedName("ak.y")
    public static class433 field171;

    @ObfuscatedName("fi.w")
    public static boolean field1730;

    @ObfuscatedName("fk.aq")
    public static Image field1741;

    @ObfuscatedName("fk.ef")
    public static class305 field1742;

    @ObfuscatedName("ff.y")
    public static class307 field1744;

    @ObfuscatedName("ff.cn")
    public static int field1750;

    @ObfuscatedName("fu.c")
    public static class307 field1751;

    @ObfuscatedName("fp.l")
    public static int field1755;

    @ObfuscatedName("fp.c")
    public static class307 field1756;

    @ObfuscatedName("fr.l")
    public static class164[] field1761;

    @ObfuscatedName("fr.s")
    public static int field1762;

    @ObfuscatedName("fr.c")
    public static class307 field1775;

    @ObfuscatedName("fr.oo")
    public static class286[] field1785;

    @ObfuscatedName("ft.bd")
    public static class405 field1786;

    @ObfuscatedName("ft.c")
    public static class307 field1789;

    @ObfuscatedName("ft.q")
    public static int[] field1790;

    @ObfuscatedName("fb.c")
    public static class307 field1798;

    @ObfuscatedName("r.so")
    public static int field18;

    @ObfuscatedName("fb.l")
    public static class307 field1803;

    @ObfuscatedName("fb.ew")
    public static class305 field1805;

    @ObfuscatedName("fs.l")
    public static class307 field1807;

    @ObfuscatedName("fs.c")
    public static class307 field1808;

    @ObfuscatedName("av.jb")
    public static int field182;

    @ObfuscatedName("fz.v")
    public static int field1828;

    @ObfuscatedName("fq.c")
    public static class307 field1835;

    @ObfuscatedName("fh.bx")
    public static class296 field1847;

    @ObfuscatedName("fj.l")
    public static class307 field1849;

    @ObfuscatedName("fj.c")
    public static class307 field1853;

    @ObfuscatedName("fo.v")
    public static int[] field1885;

    @ObfuscatedName("al.aw")
    public static GarbageCollectorMXBean field189;

    @ObfuscatedName("fo.x")
    public static class408[] field1891;

    @ObfuscatedName("fd.c")
    public static class307 field1897;

    @ObfuscatedName("fd.l")
    public static class307 field1908;

    @ObfuscatedName("fa.c")
    public static class307 field1921;

    @ObfuscatedName("fv.c")
    public static class307 field1927;

    @ObfuscatedName("fl.c")
    public static class307 field1936;

    @ObfuscatedName("fl.ol")
    public static int field1939;

    @ObfuscatedName("al.h")
    public static class160 field194;

    @ObfuscatedName("fe.c")
    public static class307 field1944;

    @ObfuscatedName("fy.c")
    public static class307 field1963;

    @ObfuscatedName("fg.s")
    public static class307 field1971;

    @ObfuscatedName("l.x")
    public static class433 field2;

    @ObfuscatedName("al.c")
    public static class153 field203;

    @ObfuscatedName("fm.c")
    public static class307 field2073;

    @ObfuscatedName("fm.pq")
    public static class410 field2085;

    @ObfuscatedName("gm.iu")
    public static class434[] field2087;

    @ObfuscatedName("gm.e")
    public static class307 field2088;

    @ObfuscatedName("gx.y")
    public static int[] field2125;

    @ObfuscatedName("gx.un")
    public static int field2127;

    @ObfuscatedName("gx.nj")
    public static int field2132;

    @ObfuscatedName("gd.cq")
    public static class433 field2145;

    @ObfuscatedName("i.i")
    public static class307 field22;

    @ObfuscatedName("go.uc")
    public static int field2202;

    @ObfuscatedName("gy.x")
    public static int[] field2221;

    @ObfuscatedName("gc.eh")
    public static class305 field2241;

    @ObfuscatedName("gc.eb")
    public static class305 field2258;

    @ObfuscatedName("gb.p")
    public static int field2269;

    @ObfuscatedName("gb.q")
    public static int field2272;

    @ObfuscatedName("gb.x")
    public static int field2273;

    @ObfuscatedName("gb.h")
    public static int field2274;

    @ObfuscatedName("gb.n")
    public static int field2275;

    @ObfuscatedName("gb.m")
    public static int field2276;

    @ObfuscatedName("gb.d")
    public static int field2277;

    @ObfuscatedName("gb.j")
    public static int field2278;

    @ObfuscatedName("gb.t")
    public static class210 field2281;

    @ObfuscatedName("gs.rs")
    public static boolean field2298;

    @ObfuscatedName("gn.br")
    public static int field2310;

    @ObfuscatedName("gn.av")
    public static int field2313;

    @ObfuscatedName("gn.n")
    public static int field2317;

    @ObfuscatedName("gn.k")
    public static int field2321;

    @ObfuscatedName("gn.j")
    public static int field2324;

    @ObfuscatedName("gn.f")
    public static int field2325;

    @ObfuscatedName("gn.g")
    public static int field2326;

    @ObfuscatedName("gn.t")
    public static int field2327;

    @ObfuscatedName("gn.d")
    public static int field2329;

    @ObfuscatedName("gn.ap")
    public static int field2331;

    @ObfuscatedName("gn.af")
    public static int field2332;

    @ObfuscatedName("gn.ak")
    public static int field2333;

    @ObfuscatedName("gn.bi")
    public static boolean[][] field2334;

    @ObfuscatedName("gn.z")
    public static int field2349;

    @ObfuscatedName("gn.b")
    public static int field2350;

    @ObfuscatedName("gn.m")
    public static int field2365;

    @ObfuscatedName("gn.bw")
    public static int field2366;

    @ObfuscatedName("gn.bu")
    public static int field2367;

    @ObfuscatedName("gn.bs")
    public static int field2368;

    @ObfuscatedName("gn.bb")
    public static int field2369;

    @ObfuscatedName("gn.bh")
    public static int field2371;

    @ObfuscatedName("gu.il")
    public static class433[] field2376;

    @ObfuscatedName("gu.y")
    public static int field2378;

    @ObfuscatedName("gu.l")
    public static class307 field2380;

    @ObfuscatedName("gu.av")
    public static Font field2381;

    @ObfuscatedName("gg.cg")
    public static class433[] field2385;

    @ObfuscatedName("i.gw")
    public static class100 field24;

    @ObfuscatedName("gg.bx")
    public static int field2400;

    @ObfuscatedName("aa.hq")
    public static int field241;

    @ObfuscatedName("gw.kd")
    public static class202 field2411;

    @ObfuscatedName("aa.sq")
    public static class40 field242;

    @ObfuscatedName("aa.ux")
    public static class394 field243;

    @ObfuscatedName("gf.bs")
    public static int field2434;

    @ObfuscatedName("ao.hj")
    public static int field244;

    @ObfuscatedName("ao.r")
    public static class61[] field246;

    @ObfuscatedName("gf.bb")
    public static int field2466;

    @ObfuscatedName("gf.br")
    public static int field2499;

    @ObfuscatedName("gv.r")
    public static int field2514;

    @ObfuscatedName("gv.v")
    public static int field2517;

    @ObfuscatedName("gv.o")
    public static int field2518;

    @ObfuscatedName("gz.ft")
    public static int field2535;

    @ObfuscatedName("gz.cu")
    public static class433[] field2536;

    @ObfuscatedName("gj.su")
    public static int field2544;

    @ObfuscatedName("gh.bw")
    public static String field2547;

    @ObfuscatedName("gh.ag")
    public static String field2548;

    @ObfuscatedName("aq.bu")
    public static String field257;

    @ObfuscatedName("hc.sx")
    public static int field2574;

    @ObfuscatedName("hq.bl")
    public static int field2589;

    @ObfuscatedName("aq.me")
    public static int field259;

    @ObfuscatedName("hu.hn")
    public static int[] field2591;

    @ObfuscatedName("hu.s")
    public static class307 field2592;

    @ObfuscatedName("he.fn")
    public static int[] field2598;

    @ObfuscatedName("he.sz")
    public static int field2599;

    @ObfuscatedName("i.aj")
    public static class368 field26;

    @ObfuscatedName("hh.ey")
    public static class305 field2607;

    @ObfuscatedName("hh.nq")
    public static int field2608;

    @ObfuscatedName("hh.eu")
    public static class305 field2609;

    @ObfuscatedName("hh.v")
    public static byte[][] field2610;

    @ObfuscatedName("aq.hz")
    public static byte[][] field262;

    @ObfuscatedName("hw.ez")
    public static class305 field2646;

    @ObfuscatedName("hw.gt")
    public static class398 field2656;

    @ObfuscatedName("hn.oa")
    public static int field2677;

    @ObfuscatedName("hn.if")
    public static class434[] field2678;

    @ObfuscatedName("hk.pd")
    public static class376 field2681;

    @ObfuscatedName("hi.u")
    public static class307 field2692;

    @ObfuscatedName("hy.m")
    public static class138 field2714;

    @ObfuscatedName("hf.ky")
    public static class286 field2721;

    @ObfuscatedName("hf.p")
    public static int field2723;

    @ObfuscatedName("hf.ss")
    public static int field2724;

    @ObfuscatedName("hd.cf")
    public static class434[] field2748;

    @ObfuscatedName("hj.ie")
    public static int field2749;

    @ObfuscatedName("hl.lx")
    public static class83 field2754;

    @ObfuscatedName("hp.hw")
    public static int[] field2759;

    @ObfuscatedName("hp.h")
    public static int field2762;

    @ObfuscatedName("as.u")
    public static boolean[] field277;

    @ObfuscatedName("hb.a")
    public static class101 field2773;

    @ObfuscatedName("id.da")
    public static class361 field2790;

    @ObfuscatedName("ip.np")
    public static int field2797;

    @ObfuscatedName("il.mj")
    public static class286 field2808;

    @ObfuscatedName("iw.en")
    public static class305 field2828;

    @ObfuscatedName("as.a")
    public static int[] field285;

    @ObfuscatedName("as.y")
    public static int[] field286;

    @ObfuscatedName("w.a")
    public static int[] field29;

    @ObfuscatedName("ag.o")
    public static boolean field290;

    @ObfuscatedName("ag.w")
    public static ScheduledExecutorService field291;

    @ObfuscatedName("ii.sc")
    public static class40 field2961;

    @ObfuscatedName("l.h")
    public static int[] field3;

    @ObfuscatedName("w.ep")
    public static class305 field30;

    @ObfuscatedName("ag.r")
    public static int field306;

    @ObfuscatedName("is.td")
    public static int field3063;

    @ObfuscatedName("ia.o")
    public static class433 field3076;

    @ObfuscatedName("jh.w")
    public static byte[][][] field3079;

    @ObfuscatedName("jh.v")
    public static class434 field3080;

    @ObfuscatedName("jr.l")
    public static long field3084;

    @ObfuscatedName("jr.cp")
    public static boolean field3086;

    @ObfuscatedName("jr.c")
    public static long field3088;

    @ObfuscatedName("ag.az")
    public static class431 field309;

    @ObfuscatedName("ji.ar")
    public static FontMetrics field3090;

    @ObfuscatedName("jk.o")
    public static class307 field3105;

    @ObfuscatedName("jk.c")
    public static class307 field3106;

    @ObfuscatedName("jk.l")
    public static class307 field3107;

    @ObfuscatedName("jk.e")
    public static class267 field3109;

    @ObfuscatedName("jk.i")
    public static int field3110;

    @ObfuscatedName("jk.u")
    public static class271 field3111;

    @ObfuscatedName("jj.y")
    public static boolean field3154;

    @ObfuscatedName("je.uf")
    public static class397 field3193;

    @ObfuscatedName("je.ih")
    public static class434[] field3197;

    @ObfuscatedName("js.fp")
    public static int field3198;

    @ObfuscatedName("jc.u")
    public static int[] field3201;

    @ObfuscatedName("jx.mx")
    public static int field3205;

    @ObfuscatedName("ja.cd")
    public static class433 field3206;

    @ObfuscatedName("ja.k")
    public static int field3209;

    @ObfuscatedName("jq.d")
    public static int field3216;

    @ObfuscatedName("jq.jl")
    public static int field3219;

    @ObfuscatedName("jd.cb")
    public static class433 field3231;

    @ObfuscatedName("jo.v")
    public static short[] field3237;

    @ObfuscatedName("ad.lm")
    public static int field325;

    @ObfuscatedName("jz.a")
    public static class307 field3258;

    @ObfuscatedName("jz.i")
    public static class286[][] field3290;

    @ObfuscatedName("w.ii")
    public static int field33;

    @ObfuscatedName("au.eq")
    public static class305 field332;

    @ObfuscatedName("w.sp")
    public static int field34;

    @ObfuscatedName("jz.pg")
    public static class155 field3412;

    @ObfuscatedName("kp.iz")
    public static int field3413;

    @ObfuscatedName("kw.e")
    public static int field3511;

    @ObfuscatedName("kv.an")
    public static boolean field3516;

    @ObfuscatedName("kv.fu")
    public static int field3517;

    @ObfuscatedName("ah.af")
    public static float[] field373;

    @ObfuscatedName("ah.ap")
    public static float[] field379;

    @ObfuscatedName("ah.v")
    public static int field380;

    @ObfuscatedName("ah.i")
    public static byte[] field381;

    @ObfuscatedName("ah.a")
    public static int field382;

    @ObfuscatedName("ah.y")
    public static int field383;

    @ObfuscatedName("ah.u")
    public static class49[] field384;

    @ObfuscatedName("ah.h")
    public static class39[] field385;

    @ObfuscatedName("ah.q")
    public static class44[] field386;

    @ObfuscatedName("kg.r")
    public static Thread field3869;

    @ObfuscatedName("kg.m")
    public static int[] field3873;

    @ObfuscatedName("ah.p")
    public static boolean[] field388;

    @ObfuscatedName("kz.cw")
    public static class433[] field3886;

    @ObfuscatedName("ah.n")
    public static int[] field389;

    @ObfuscatedName("ki.gb")
    public static class159 field3891;

    @ObfuscatedName("kk.s")
    public static long field3912;

    @ObfuscatedName("kk.c")
    public static class361 field3916;

    @ObfuscatedName("kk.h")
    public static boolean field3923;

    @ObfuscatedName("kk.p")
    public static class421 field3926;

    @ObfuscatedName("ke.mv")
    public static class67 field3933;

    @ObfuscatedName("kt.a")
    public static int field3941;

    @ObfuscatedName("kd.fb")
    public static int field3942;

    @ObfuscatedName("lf.w")
    public static int field3949;

    @ObfuscatedName("ah.t")
    public static float[] field395;

    @ObfuscatedName("ah.k")
    public static float[] field396;

    @ObfuscatedName("ah.b")
    public static float[] field397;

    @ObfuscatedName("lg.n")
    public static String[] field3978;

    @ObfuscatedName("ah.z")
    public static float[] field398;

    @ObfuscatedName("lu.bn")
    public static class295 field3991;

    @ObfuscatedName("w.o")
    public static int field40;

    @ObfuscatedName("ah.w")
    public static int field400;

    @ObfuscatedName("ah.ak")
    public static float[] field401;

    @ObfuscatedName("ah.av")
    public static int[] field402;

    @ObfuscatedName("ah.ar")
    public static int[] field403;

    @ObfuscatedName("ly.a")
    public static class433[] field4033;

    @ObfuscatedName("lj.sh")
    public static int field4058;

    @ObfuscatedName("ah.x")
    public static class47[] field406;

    @ObfuscatedName("mt.h")
    public static class48 field4068;

    @ObfuscatedName("mq.ot")
    public static int field4069;

    @ObfuscatedName("mq.n")
    public static int[] field4082;

    @ObfuscatedName("w.u")
    public static short[][] field41;

    @ObfuscatedName("ml.j")
    public static class421 field4123;

    @ObfuscatedName("ml.ff")
    public static int field4124;

    @ObfuscatedName("be.j")
    public static int field413;

    @ObfuscatedName("mp.hi")
    public static byte[][] field4136;

    @ObfuscatedName("ma.sg")
    public static int field4142;

    @ObfuscatedName("be.hy")
    public static class197 field415;

    @ObfuscatedName("mu.et")
    public static class305 field4152;

    @ObfuscatedName("mr.h")
    public static int field4182;

    @ObfuscatedName("w.iq")
    public static int field42;

    @ObfuscatedName("nc.o")
    public static class307 field4209;

    @ObfuscatedName("na.p")
    public static class433 field4221;

    @ObfuscatedName("nq.l")
    public static int field4231;

    @ObfuscatedName("nq.s")
    public static int field4232;

    @ObfuscatedName("nq.dw")
    public static boolean field4238;

    @ObfuscatedName("ni.s")
    public static int field4241;

    @ObfuscatedName("ni.u")
    public static class433[] field4245;

    @ObfuscatedName("nz.aw")
    public static String field4267;

    @ObfuscatedName("nt.l")
    public static class307 field4270;

    @ObfuscatedName("bt.w")
    public static float field429;

    @ObfuscatedName("bt.v")
    public static int field430;

    @ObfuscatedName("ov.i")
    public static int[] field4415;

    @ObfuscatedName("ox.eg")
    public static class305 field4426;

    @ObfuscatedName("ox.dx")
    public static class159 field4428;

    @ObfuscatedName("ou.ev")
    public static class305 field4446;

    @ObfuscatedName("ol.gz")
    public static class332 field4479;

    @ObfuscatedName("oy.s")
    public static class307 field4487;

    @ObfuscatedName("oi.ai")
    public static client field4489;

    @ObfuscatedName("oi.rx")
    public static class434 field4497;

    @ObfuscatedName("oi.ib")
    public static int field4498;

    @ObfuscatedName("oz.a")
    public static class42 field4499;

    @ObfuscatedName("pn.ut")
    public static class89 field4567;

    @ObfuscatedName("ps.af")
    public static int[] field4578;

    @ObfuscatedName("ps.ak")
    public static int field4579;

    @ObfuscatedName("ps.av")
    public static int field4580;

    @ObfuscatedName("pa.l")
    public static int field4613;

    @ObfuscatedName("pa.r")
    public static int[] field4614;

    @ObfuscatedName("pa.s")
    public static int field4615;

    @ObfuscatedName("pa.e")
    public static int[] field4616;

    @ObfuscatedName("pa.o")
    public static int[] field4617;

    @ObfuscatedName("pa.c")
    public static int field4618;

    @ObfuscatedName("qy.e")
    public static int field4651;

    @ObfuscatedName("qy.l")
    public static String field4652;

    @ObfuscatedName("qy.c")
    public static Applet field4653;

    @ObfuscatedName("bx.mw")
    public static int field470;

    @ObfuscatedName("bd.sv")
    public static int field479;

    @ObfuscatedName("bd.ej")
    public static class305 field481;

    @ObfuscatedName("bm.ij")
    public static int field494;

    @ObfuscatedName("a.es")
    public static class305 field58;

    @ObfuscatedName("a.uh")
    public static class318 field59;

    @ObfuscatedName("client.ea")
    public static class305 field604;

    @ObfuscatedName("client.ee")
    public static class305 field623;

    @ObfuscatedName("y.ht")
    public static class433[] field70;

    @ObfuscatedName("y.ho")
    public static class434 field71;

    @ObfuscatedName("h.l")
    public static class307 field73;

    @ObfuscatedName("h.n")
    public static int field75;

    @ObfuscatedName("h.sk")
    public static int field76;

    @ObfuscatedName("q.d")
    public static class147 field79;

    @ObfuscatedName("q.c")
    public static class274 field80;

    @ObfuscatedName("bw.a")
    public static class434 field810;

    @ObfuscatedName("bw.bf")
    public static int field813;

    @ObfuscatedName("bu.ik")
    public static class434[] field818;

    @ObfuscatedName("bs.o")
    public static int[] field835;

    @ObfuscatedName("bs.i")
    public static String[] field836;

    @ObfuscatedName("bs.p")
    public static class286 field837;

    @ObfuscatedName("bs.y")
    public static int field848;

    @ObfuscatedName("bs.to")
    public static int field855;

    @ObfuscatedName("br.qr")
    public static class438 field879;

    @ObfuscatedName("bf.rh")
    public static class352 field888;

    @ObfuscatedName("bf.h")
    public static class332 field889;

    @ObfuscatedName("bq.r")
    public static class433 field891;

    @ObfuscatedName("bq.i")
    public static class433 field895;

    @ObfuscatedName("bq.n")
    public static class87 field896;

    @ObfuscatedName("l.a")
    public static short[][] field9;

    @ObfuscatedName("n.ua")
    public static class365 field90;

    @ObfuscatedName("bq.e")
    public static class433[] field907;

    @ObfuscatedName("bq.l")
    public static boolean field918;

    @ObfuscatedName("n.n")
    public static class286 field93;

    @ObfuscatedName("ba.ms")
    public static int field955;

    @ObfuscatedName("ba.fs")
    public static int field956;

    @ObfuscatedName("bl.h")
    public static class433 field976;

    @ObfuscatedName("m.t")
    public static class241 field98;

    @ObfuscatedName("bo.e")
    public static byte[][][] field993;

    @ObfuscatedName("bo.r")
    public static byte[][][] field997;

    @ObfuscatedName("bo.i")
    public static byte[][][] field999;

    @ObfuscatedName("cb.c([Ljava/lang/CharSequence;III)Ljava/lang/String;")
    public static String method2056(CharSequence[] arg0, int arg1, int arg2) {
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

    @ObfuscatedName("cc.l(II)Ljava/lang/String;")
    public static String method2088(int arg0) {
        return "<col=" + Integer.toHexString(arg0) + ">";
    }

    @ObfuscatedName("nz.l(Ljava/lang/String;I)Ljava/io/File;")
    public static File method6107(String arg0) {
        if (!class156.field1705) {
            throw new RuntimeException("");
        }
        File var1 = (File) class156.field1704.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(field1011, arg0);
        RandomAccessFile var3 = null;
        try {
            File var4 = new File(var2.getParent());
            if (!var4.exists()) {
                throw new RuntimeException("");
            }
            var3 = new RandomAccessFile(var2, "rw");
            int var5 = var3.read();
            var3.seek(0L);
            var3.write(var5);
            var3.seek(0L);
            var3.close();
            class156.field1704.put(arg0, var2);
            return var2;
        } catch (Exception var10) {
            try {
                if (var3 != null) {
                    var3.close();
                    Object var7 = null;
                }
            } catch (Exception var9) {
            }
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ld.c(Lkq;Lkq;B)V")
    public static void method5168(class307 arg0, class307 arg1) {
        field1798 = arg0;
        field1803 = arg1;
        field1371 = field1798.method5029(3);
    }

    @ObfuscatedName("ll.c(Lkq;Lkq;Lkq;I)V")
    public static void method5250(class307 arg0, class307 arg1, class307 arg2) {
        field4270 = arg0;
        field2592 = arg1;
        field2088 = arg2;
    }

    @ObfuscatedName("mg.c(Lpc;I)V")
    public static final void method5877(class420 arg0) {
        arg0.method6615();
        int var1 = client.field576;
        class83 var2 = field2754 = client.field619[var1] = new class83();
        var2.field1088 = var1;
        int var3 = arg0.method6631(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1173[0] = var5 - field161;
        var2.field1161 = (var2.field1173[0] << 7) + (var2.method2011() << 6);
        var2.field1147[0] = var6 - field1467;
        var2.field1152 = (var2.field1147[0] << 7) + (var2.method2011() << 6);
        field325 = var2.field1084 = var4;
        if (class96.field1279[var1] != null) {
            var2.method2009(class96.field1279[var1]);
        }
        class96.field1280 = 0;
        class96.field1281[++class96.field1280 - 1] = var1;
        class96.field1277[var1] = 0;
        class96.field1287 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method6631(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                class96.field1284[var7] = (var9 << 28) + (var10 << 14) + var11;
                class96.field1285[var7] = 0;
                class96.field1282[var7] = -1;
                class96.field1289[++class96.field1287 - 1] = var7;
                class96.field1277[var7] = 0;
            }
        }
        arg0.method6636();
    }

    @ObfuscatedName("cc.l(J)Z")
    public static boolean method2110(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("ck.c(Lkq;Lkq;ZI)V")
    public static void method2139(class307 arg0, class307 arg1, boolean arg2) {
        field73 = arg0;
        field1971 = arg1;
        class180.field1992 = arg2;
    }

    @ObfuscatedName("cv.s(Ljava/lang/CharSequence;I)I")
    public static int method2340(CharSequence arg0) {
        return class336.method4301(arg0, 10, true);
    }

    @ObfuscatedName("oi.i(Ljava/lang/Class;B)Los;")
    public static class411 method6565(Class arg0) {
        class415 var1 = class415.method6574(arg0);
        if (var1 == null) {
            throw new IllegalArgumentException();
        }
        return var1.field4494;
    }

    @ObfuscatedName("dt.e(B)[Ldp;")
    public static class122[] method2493() {
        return new class122[] { class122.field1484, class122.field1486, class122.field1482, class122.field1488, class122.field1481, class122.field1485, class122.field1480, class122.field1487, class122.field1483 };
    }

    @ObfuscatedName("dx.e(IZIZI)V")
    public static void method2594(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (field246 != null) {
            class61.method3947(0, field246.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ll.l(III)Ljz;")
    public static class286 method5251(int arg0, int arg1) {
        class286 var2 = class286.method2611(arg0);
        if (arg1 == -1) {
            return var2;
        } else if (var2 == null || var2.field3326 == null || arg1 >= var2.field3326.length) {
            return null;
        } else {
            return var2.field3326[arg1];
        }
    }

    @ObfuscatedName("bp.r(Ljava/lang/String;I)Ljava/lang/Class;")
    public static Class method1979(String arg0) throws ClassNotFoundException {
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

    @ObfuscatedName("w.ar(Lan;I)V")
    public static final void method55(class46 arg0) {
        arg0.field359 = false;
        if (arg0.field361 != null) {
            arg0.field361.field460 = 0;
        }
        for (class46 var1 = arg0.method634(); var1 != null; var1 = arg0.method647()) {
            method55(var1);
        }
    }

    @ObfuscatedName("co.i(Lpc;I)V")
    public static final void method2172(class420 arg0) {
        for (int var1 = 0; var1 < class96.field1283; var1++) {
            int var2 = class96.field1288[var1];
            class83 var3 = client.field619[var2];
            int var4 = arg0.method6686();
            if ((var4 & 0x80) != 0) {
                var4 += arg0.method6686() << 8;
            }
            byte var5 = class186.field2138.field2137;
            if ((var4 & 0x800) != 0) {
                var3.field1154 = arg0.method6697();
                var3.field1145 = arg0.method6697();
                var3.field1148 = arg0.method6664();
                var3.field1157 = arg0.method6698();
                var3.field1158 = arg0.method6705() + client.field682;
                var3.field1159 = arg0.method6666() + client.field682;
                var3.field1160 = arg0.method6666();
                if (var3.field1068) {
                    var3.field1154 += var3.field1093;
                    var3.field1145 += var3.field1090;
                    var3.field1148 += var3.field1093;
                    var3.field1157 += var3.field1090;
                    var3.field1172 = 0;
                } else {
                    var3.field1154 += var3.field1173[0];
                    var3.field1145 += var3.field1147[0];
                    var3.field1148 += var3.field1173[0];
                    var3.field1157 += var3.field1147[0];
                    var3.field1172 = 1;
                }
                var3.field1177 = 0;
            }
            if ((var4 & 0x4000) != 0) {
                class96.field1278[var2] = (class186) class321.method2696(class186.method2477(), arg0.method6664());
            }
            if ((var4 & 0x20) != 0) {
                int var6 = arg0.method6711();
                class302 var7 = (class302) class321.method2696(class302.method4604(), arg0.method6695());
                boolean var8 = arg0.method6695() == 1;
                int var9 = arg0.method6686();
                int var10 = arg0.field4512;
                if (var3.field1073 != null && var3.field1066 != null) {
                    boolean var11 = false;
                    if (var7.field3851 && field1606.method1588(var3.field1073)) {
                        var11 = true;
                    }
                    if (!var11 && client.field659 == 0 && !var3.field1086) {
                        class96.field1276.field4512 = 0;
                        arg0.method6861(class96.field1276.field4511, 0, var9);
                        class96.field1276.field4512 = 0;
                        String var12 = class333.method5477(class336.method3942(class275.method5197(class96.field1276)));
                        var3.field1124 = var12.trim();
                        var3.field1128 = var6 >> 8;
                        var3.field1110 = var6 & 0xFF;
                        var3.field1118 = 150;
                        var3.field1125 = var8;
                        var3.field1126 = field2754 != var3 && var7.field3851 && client.field727 != "" && var12.toLowerCase().indexOf(client.field727) == -1;
                        int var13;
                        if (var7.field3861) {
                            var13 = var8 ? 91 : 1;
                        } else {
                            var13 = var8 ? 90 : 2;
                        }
                        if (var7.field3860 == -1) {
                            class98.method2081(var13, var3.field1073.method7231(), var12);
                        } else {
                            class98.method2081(var13, class92.method4309(var7.field3860) + var3.field1073.method7231(), var12);
                        }
                    }
                }
                arg0.field4512 = var9 + var10;
            }
            if ((var4 & 0x400) != 0) {
                var3.field1155 = arg0.method6705();
                int var14 = arg0.method6669();
                var3.field1153 = var14 >> 16;
                var3.field1178 = (var14 & 0xFFFF) + client.field682;
                var3.field1150 = 0;
                var3.field1151 = 0;
                if (var3.field1178 > client.field682) {
                    var3.field1150 = -1;
                }
                if (var3.field1155 == 65535) {
                    var3.field1155 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1174 = arg0.method6666();
                if (var3.field1174 == 65535) {
                    var3.field1174 = -1;
                }
            }
            if ((var4 & 0x2000) != 0) {
                var3.field1163 = client.field682 + arg0.method6859();
                var3.field1164 = client.field682 + arg0.method6666();
                var3.field1165 = arg0.method6664();
                var3.field1156 = arg0.method6664();
                var3.field1167 = arg0.method6662();
                var3.field1168 = (byte) arg0.method6695();
            }
            if ((var4 & 0x2) != 0) {
                int var15 = arg0.method6686();
                if (var15 > 0) {
                    for (int var16 = 0; var16 < var15; var16++) {
                        int var17 = -1;
                        int var18 = -1;
                        int var19 = -1;
                        int var20 = arg0.method6679();
                        if (var20 == 32767) {
                            var20 = arg0.method6679();
                            var18 = arg0.method6679();
                            var17 = arg0.method6679();
                            var19 = arg0.method6679();
                        } else if (var20 == 32766) {
                            var20 = -1;
                        } else {
                            var18 = arg0.method6679();
                        }
                        int var21 = arg0.method6679();
                        var3.method2059(var20, var18, var17, var19, client.field682, var21);
                    }
                }
                int var22 = arg0.method6764();
                if (var22 > 0) {
                    for (int var23 = 0; var23 < var22; var23++) {
                        int var24 = arg0.method6679();
                        int var25 = arg0.method6679();
                        if (var25 == 32767) {
                            var3.method2063(var24);
                        } else {
                            int var26 = arg0.method6679();
                            int var27 = arg0.method6764();
                            int var28 = var25 > 0 ? arg0.method6696() : var27;
                            var3.method2066(var24, client.field682, var25, var26, var27, var28);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field1139 = arg0.method6705();
                if (var3.field1172 == 0) {
                    var3.field1169 = var3.field1139;
                    var3.field1139 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var29 = arg0.method6666();
                if (var29 == 65535) {
                    var29 = -1;
                }
                int var30 = arg0.method6686();
                client.method1978(var3, var29, var30);
            }
            if ((var4 & 0x1000) != 0) {
                var5 = arg0.method6664();
            }
            if ((var4 & 0x200) != 0) {
                for (int var31 = 0; var31 < 3; var31++) {
                    var3.field1070[var31] = arg0.method6674();
                }
            }
            if ((var4 & 0x1) != 0) {
                int var32 = arg0.method6764();
                byte[] var33 = new byte[var32];
                class421 var34 = new class421(var33);
                arg0.method6716(var33, 0, var32);
                class96.field1279[var2] = var34;
                var3.method2009(var34);
            }
            if ((var4 & 0x10) != 0) {
                var3.field1124 = arg0.method6674();
                if (var3.field1124.charAt(0) == '~') {
                    var3.field1124 = var3.field1124.substring(1);
                    class98.method2081(2, var3.field1073.method7231(), var3.field1124);
                } else if (field2754 == var3) {
                    class98.method2081(2, var3.field1073.method7231(), var3.field1124);
                }
                var3.field1125 = false;
                var3.field1128 = 0;
                var3.field1110 = 0;
                var3.field1118 = 150;
            }
            if (var3.field1068) {
                if (var5 == 127) {
                    var3.method2019(var3.field1093, var3.field1090);
                } else {
                    class186 var35;
                    if (class186.field2138.field2137 == var5) {
                        var35 = class96.field1278[var2];
                    } else {
                        var35 = (class186) class321.method2696(class186.method2477(), var5);
                    }
                    var3.method2018(var3.field1093, var3.field1090, var35);
                }
            }
        }
    }

    @ObfuscatedName("eq.u(Lgn;[Lgi;B)V")
    public static final void method2711(class197 arg0, class184[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((class75.field994[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((class75.field994[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3334(var3, var4);
                        }
                    }
                }
            }
        }
        class75.field998 += (int) (Math.random() * 5.0D) - 2;
        if (class75.field998 < -8) {
            class75.field998 = -8;
        }
        if (class75.field998 > 8) {
            class75.field998 = 8;
        }
        class75.field996 += (int) (Math.random() * 5.0D) - 2;
        if (class75.field996 < -16) {
            class75.field996 = -16;
        }
        if (class75.field996 > 16) {
            class75.field996 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = field3079[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = class75.field1005[var6][var16 + 1][var15] - class75.field1005[var6][var16 - 1][var15];
                    int var18 = class75.field1005[var6][var16][var15 + 1] - class75.field1005[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    field107[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                field29[var25] = 0;
                field2125[var25] = 0;
                field3201[var25] = 0;
                field3[var25] = 0;
                field1790[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        int var29 = field993[var6][var28][var27] & 0xFF;
                        if (var29 > 0) {
                            int var30 = var29 - 1;
                            class174 var31 = (class174) class174.field1919.method4472((long) var30);
                            class174 var32;
                            if (var31 == null) {
                                byte[] var33 = field1921.method5066(1, var30);
                                class174 var34 = new class174();
                                if (var33 != null) {
                                    var34.method3027(new class421(var33), var30);
                                }
                                var34.method3023();
                                class174.field1919.method4482(var34, (long) var30);
                                var32 = var34;
                            } else {
                                var32 = var31;
                            }
                            field29[var27] += var32.field1916;
                            field2125[var27] += var32.field1917;
                            field3201[var27] += var32.field1918;
                            field3[var27] += var32.field1913;
                            var10002 = field1790[var27]++;
                        }
                    }
                    int var36 = var26 - 5;
                    if (var36 >= 0 && var36 < 104) {
                        int var37 = field993[var6][var36][var27] & 0xFF;
                        if (var37 > 0) {
                            int var38 = var37 - 1;
                            class174 var39 = (class174) class174.field1919.method4472((long) var38);
                            class174 var40;
                            if (var39 == null) {
                                byte[] var41 = field1921.method5066(1, var38);
                                class174 var42 = new class174();
                                if (var41 != null) {
                                    var42.method3027(new class421(var41), var38);
                                }
                                var42.method3023();
                                class174.field1919.method4482(var42, (long) var38);
                                var40 = var42;
                            } else {
                                var40 = var39;
                            }
                            field29[var27] -= var40.field1916;
                            field2125[var27] -= var40.field1917;
                            field3201[var27] -= var40.field1918;
                            field3[var27] -= var40.field1913;
                            var10002 = field1790[var27]--;
                        }
                    }
                }
                if (var26 >= 1 && var26 < 103) {
                    int var44 = 0;
                    int var45 = 0;
                    int var46 = 0;
                    int var47 = 0;
                    int var48 = 0;
                    for (int var49 = -5; var49 < 109; var49++) {
                        int var50 = var49 + 5;
                        if (var50 >= 0 && var50 < 104) {
                            var44 += field29[var50];
                            var45 += field2125[var50];
                            var46 += field3201[var50];
                            var47 += field3[var50];
                            var48 += field1790[var50];
                        }
                        int var51 = var49 - 5;
                        if (var51 >= 0 && var51 < 104) {
                            var44 -= field29[var51];
                            var45 -= field2125[var51];
                            var46 -= field3201[var51];
                            var47 -= field3[var51];
                            var48 -= field1790[var51];
                        }
                        if (var49 >= 1 && var49 < 103 && (!client.field500 || (class75.field994[0][var26][var49] & 0x2) != 0 || (class75.field994[var6][var26][var49] & 0x10) == 0)) {
                            if (var6 < class75.field995) {
                                class75.field995 = var6;
                            }
                            int var52 = field993[var6][var26][var49] & 0xFF;
                            int var53 = field997[var6][var26][var49] & 0xFF;
                            if (var52 > 0 || var53 > 0) {
                                int var54 = class75.field1005[var6][var26][var49];
                                int var55 = class75.field1005[var6][var26 + 1][var49];
                                int var56 = class75.field1005[var6][var26 + 1][var49 + 1];
                                int var57 = class75.field1005[var6][var26][var49 + 1];
                                int var58 = field107[var26][var49];
                                int var59 = field107[var26 + 1][var49];
                                int var60 = field107[var26 + 1][var49 + 1];
                                int var61 = field107[var26][var49 + 1];
                                int var62 = -1;
                                int var63 = -1;
                                if (var52 > 0) {
                                    int var64 = var44 * 256 / var47;
                                    int var65 = var45 / var48;
                                    int var66 = var46 / var48;
                                    var62 = class75.method2914(var64, var65, var66);
                                    int var67 = class75.field998 + var64 & 0xFF;
                                    int var68 = class75.field996 + var66;
                                    if (var68 < 0) {
                                        var68 = 0;
                                    } else if (var68 > 255) {
                                        var68 = 255;
                                    }
                                    var63 = class75.method2914(var67, var65, var68);
                                }
                                if (var6 > 0) {
                                    boolean var69 = true;
                                    if (var52 == 0 && field1007[var6][var26][var49] != 0) {
                                        var69 = false;
                                    }
                                    if (var53 > 0) {
                                        int var70 = var53 - 1;
                                        class182 var71 = (class182) class182.field2074.method4472((long) var70);
                                        class182 var72;
                                        if (var71 == null) {
                                            byte[] var73 = field2073.method5066(4, var70);
                                            class182 var74 = new class182();
                                            if (var73 != null) {
                                                var74.method3259(new class421(var73), var70);
                                            }
                                            var74.method3258();
                                            class182.field2074.method4482(var74, (long) var70);
                                            var72 = var74;
                                        } else {
                                            var72 = var71;
                                        }
                                        if (!var72.field2077) {
                                            var69 = false;
                                        }
                                    }
                                    if (var69 && var54 == var55 && var54 == var56 && var54 == var57) {
                                        field1034[var6][var26][var49] |= 0x924;
                                    }
                                }
                                int var75 = 0;
                                if (var63 != -1) {
                                    var75 = class194.field2260[class75.method3255(var63, 96)];
                                }
                                if (var53 == 0) {
                                    arg0.method3577(var6, var26, var49, 0, 0, -1, var54, var55, var56, var57, class75.method3255(var62, var58), class75.method3255(var62, var59), class75.method3255(var62, var60), class75.method3255(var62, var61), 0, 0, 0, 0, var75, 0);
                                } else {
                                    int var76 = field1007[var6][var26][var49] + 1;
                                    byte var77 = field999[var6][var26][var49];
                                    int var78 = var53 - 1;
                                    class182 var79 = (class182) class182.field2074.method4472((long) var78);
                                    class182 var80;
                                    if (var79 == null) {
                                        byte[] var81 = field2073.method5066(4, var78);
                                        class182 var82 = new class182();
                                        if (var81 != null) {
                                            var82.method3259(new class421(var81), var78);
                                        }
                                        var82.method3258();
                                        class182.field2074.method4482(var82, (long) var78);
                                        var80 = var82;
                                    } else {
                                        var80 = var79;
                                    }
                                    int var84 = var80.field2076;
                                    int var85;
                                    int var86;
                                    if (var84 >= 0) {
                                        var85 = field2281.method3787(var84);
                                        var86 = -1;
                                    } else if (var80.field2075 == 16711935) {
                                        var86 = -2;
                                        var84 = -1;
                                        var85 = -2;
                                    } else {
                                        var86 = class75.method2914(var80.field2078, var80.field2080, var80.field2081);
                                        int var87 = class75.field998 + var80.field2078 & 0xFF;
                                        int var88 = class75.field996 + var80.field2081;
                                        if (var88 < 0) {
                                            var88 = 0;
                                        } else if (var88 > 255) {
                                            var88 = 255;
                                        }
                                        var85 = class75.method2914(var87, var80.field2080, var88);
                                    }
                                    int var89 = 0;
                                    if (var85 != -2) {
                                        var89 = class194.field2260[method5688(var85, 96)];
                                    }
                                    if (var80.field2086 != -1) {
                                        int var90 = class75.field998 + var80.field2082 & 0xFF;
                                        int var91 = class75.field996 + var80.field2079;
                                        if (var91 < 0) {
                                            var91 = 0;
                                        } else if (var91 > 255) {
                                            var91 = 255;
                                        }
                                        int var92 = class75.method2914(var90, var80.field2083, var91);
                                        var89 = class194.field2260[method5688(var92, 96)];
                                    }
                                    arg0.method3577(var6, var26, var49, var76, var77, var84, var54, var55, var56, var57, class75.method3255(var62, var58), class75.method3255(var62, var59), class75.method3255(var62, var60), class75.method3255(var62, var61), method5688(var86, var58), method5688(var86, var59), method5688(var86, var60), method5688(var86, var61), var75, var89);
                                }
                            }
                        }
                    }
                }
            }
            for (int var93 = 1; var93 < 103; var93++) {
                for (int var94 = 1; var94 < 103; var94++) {
                    arg0.method3576(var6, var94, var93, class75.method4945(var6, var94, var93));
                }
            }
            field993[var6] = (byte[][]) null;
            field997[var6] = (byte[][]) null;
            field1007[var6] = (byte[][]) null;
            field999[var6] = (byte[][]) null;
            field3079[var6] = (byte[][]) null;
        }
        arg0.method3603(-50, -10, -50);
        for (int var95 = 0; var95 < 104; var95++) {
            for (int var96 = 0; var96 < 104; var96++) {
                if ((class75.field994[1][var95][var96] & 0x2) == 2) {
                    arg0.method3742(var95, var96);
                }
            }
        }
        int var97 = 1;
        int var98 = 2;
        int var99 = 4;
        for (int var100 = 0; var100 < 4; var100++) {
            if (var100 > 0) {
                var97 <<= 0x3;
                var98 <<= 0x3;
                var99 <<= 0x3;
            }
            for (int var101 = 0; var101 <= var100; var101++) {
                for (int var102 = 0; var102 <= 104; var102++) {
                    for (int var103 = 0; var103 <= 104; var103++) {
                        if ((field1034[var101][var103][var102] & var97) != 0) {
                            int var104 = var102;
                            int var105 = var102;
                            int var106 = var101;
                            int var107 = var101;
                            while (var104 > 0 && (field1034[var101][var103][var104 - 1] & var97) != 0) {
                                var104--;
                            }
                            while (var105 < 104 && (field1034[var101][var103][var105 + 1] & var97) != 0) {
                                var105++;
                            }
                            label373: while (var106 > 0) {
                                for (int var108 = var104; var108 <= var105; var108++) {
                                    if ((field1034[var106 - 1][var103][var108] & var97) == 0) {
                                        break label373;
                                    }
                                }
                                var106--;
                            }
                            label362: while (var107 < var100) {
                                for (int var109 = var104; var109 <= var105; var109++) {
                                    if ((field1034[var107 + 1][var103][var109] & var97) == 0) {
                                        break label362;
                                    }
                                }
                                var107++;
                            }
                            int var110 = (var107 + 1 - var106) * (var105 - var104 + 1);
                            if (var110 >= 8) {
                                short var111 = 240;
                                int var112 = class75.field1005[var107][var103][var104] - var111;
                                int var113 = class75.field1005[var106][var103][var104];
                                class197.method3592(var100, 1, var103 * 128, var103 * 128, var104 * 128, var105 * 128 + 128, var112, var113);
                                for (int var114 = var106; var114 <= var107; var114++) {
                                    for (int var115 = var104; var115 <= var105; var115++) {
                                        field1034[var114][var103][var115] &= ~var97;
                                    }
                                }
                            }
                        }
                        if ((field1034[var101][var103][var102] & var98) != 0) {
                            int var116 = var103;
                            int var117 = var103;
                            int var118 = var101;
                            int var119 = var101;
                            while (var116 > 0 && (field1034[var101][var116 - 1][var102] & var98) != 0) {
                                var116--;
                            }
                            while (var117 < 104 && (field1034[var101][var117 + 1][var102] & var98) != 0) {
                                var117++;
                            }
                            label426: while (var118 > 0) {
                                for (int var120 = var116; var120 <= var117; var120++) {
                                    if ((field1034[var118 - 1][var120][var102] & var98) == 0) {
                                        break label426;
                                    }
                                }
                                var118--;
                            }
                            label415: while (var119 < var100) {
                                for (int var121 = var116; var121 <= var117; var121++) {
                                    if ((field1034[var119 + 1][var121][var102] & var98) == 0) {
                                        break label415;
                                    }
                                }
                                var119++;
                            }
                            int var122 = (var119 + 1 - var118) * (var117 - var116 + 1);
                            if (var122 >= 8) {
                                short var123 = 240;
                                int var124 = class75.field1005[var119][var116][var102] - var123;
                                int var125 = class75.field1005[var118][var116][var102];
                                class197.method3592(var100, 2, var116 * 128, var117 * 128 + 128, var102 * 128, var102 * 128, var124, var125);
                                for (int var126 = var118; var126 <= var119; var126++) {
                                    for (int var127 = var116; var127 <= var117; var127++) {
                                        field1034[var126][var127][var102] &= ~var98;
                                    }
                                }
                            }
                        }
                        if ((field1034[var101][var103][var102] & var99) != 0) {
                            int var128 = var103;
                            int var129 = var103;
                            int var130 = var102;
                            int var131 = var102;
                            while (var130 > 0 && (field1034[var101][var103][var130 - 1] & var99) != 0) {
                                var130--;
                            }
                            while (var131 < 104 && (field1034[var101][var103][var131 + 1] & var99) != 0) {
                                var131++;
                            }
                            label479: while (var128 > 0) {
                                for (int var132 = var130; var132 <= var131; var132++) {
                                    if ((field1034[var101][var128 - 1][var132] & var99) == 0) {
                                        break label479;
                                    }
                                }
                                var128--;
                            }
                            label468: while (var129 < 104) {
                                for (int var133 = var130; var133 <= var131; var133++) {
                                    if ((field1034[var101][var129 + 1][var133] & var99) == 0) {
                                        break label468;
                                    }
                                }
                                var129++;
                            }
                            if ((var129 - var128 + 1) * (var131 - var130 + 1) >= 4) {
                                int var134 = class75.field1005[var101][var128][var130];
                                class197.method3592(var100, 4, var128 * 128, var129 * 128 + 128, var130 * 128, var131 * 128 + 128, var134, var134);
                                for (int var135 = var128; var135 <= var129; var135++) {
                                    for (int var136 = var130; var136 <= var131; var136++) {
                                        field1034[var101][var135][var136] &= ~var99;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("mn.j(IIB)I")
    public static final int method5688(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var2 = (arg0 & 0x7F) * arg1 / 128;
            if (var2 < 2) {
                var2 = 2;
            } else if (var2 > 126) {
                var2 = 126;
            }
            return (arg0 & 0xFF80) + var2;
        }
    }

    @ObfuscatedName("be.fk(I)V")
    public static void method978() {
        if (client.field719 == 0) {
            field415 = new class197(4, 104, 104, class75.field1005);
            for (int var0 = 0; var0 < 4; var0++) {
                client.field518[var0] = new class184(104, 104);
            }
            field4497 = new class434(512, 512);
            class69.field899 = class300.field3772;
            class69.field900 = 5;
            client.field719 = 20;
        } else if (client.field719 == 20) {
            class69.field899 = class300.field3539;
            class69.field900 = 10;
            client.field719 = 30;
        } else if (client.field719 == 30) {
            field30 = client.method2695(0, false, true, true);
            field604 = client.method2695(1, false, true, true);
            field4152 = client.method2695(2, true, false, true);
            field2241 = client.method2695(3, false, true, true);
            field4446 = client.method2695(4, false, true, true);
            field623 = client.method2695(5, true, true, true);
            field2607 = client.method2695(6, true, true, true);
            field2609 = client.method2695(7, false, true, true);
            field481 = client.method2695(8, false, true, true);
            field58 = client.method2695(9, false, true, true);
            field2258 = client.method2695(10, false, true, true);
            field2828 = client.method2695(11, false, true, true);
            field1671 = client.method2695(12, false, true, true);
            field1805 = client.method2695(13, true, false, true);
            field332 = client.method2695(14, false, true, true);
            field4426 = client.method2695(15, false, true, true);
            field1742 = client.method2695(17, true, true, true);
            field1336 = client.method2695(18, false, true, true);
            field2646 = client.method2695(19, false, true, true);
            field1296 = client.method2695(20, false, true, true);
            class69.field899 = class300.field3540;
            class69.field900 = 20;
            client.field719 = 40;
        } else if (client.field719 == 40) {
            byte var1 = 0;
            int var2 = var1 + field30.method4976() * 4 / 100;
            int var3 = var2 + field604.method4976() * 4 / 100;
            int var4 = var3 + field4152.method4976() * 2 / 100;
            int var5 = var4 + field2241.method4976() * 2 / 100;
            int var6 = var5 + field4446.method4976() * 6 / 100;
            int var7 = var6 + field623.method4976() * 4 / 100;
            int var8 = var7 + field2607.method4976() * 2 / 100;
            int var9 = var8 + field2609.method4976() * 56 / 100;
            int var10 = var9 + field481.method4976() * 2 / 100;
            int var11 = var10 + field58.method4976() * 2 / 100;
            int var12 = var11 + field2258.method4976() * 2 / 100;
            int var13 = var12 + field2828.method4976() * 2 / 100;
            int var14 = var13 + field1671.method4976() * 2 / 100;
            int var15 = var14 + field1805.method4976() * 2 / 100;
            int var16 = var15 + field332.method4976() * 2 / 100;
            int var17 = var16 + field4426.method4976() * 2 / 100;
            int var18 = var17 + field2646.method4976() / 100;
            int var19 = var18 + field1336.method4976() / 100;
            int var20 = var19 + field1296.method4976() / 100;
            int var21 = var20 + (field1742.method4975() && field1742.method5037() ? 1 : 0);
            if (var21 == 100) {
                client.method4347(field30, "Animations");
                client.method4347(field604, "Skeletons");
                client.method4347(field4446, "Sound FX");
                client.method4347(field623, "Maps");
                client.method4347(field2607, "Music Tracks");
                client.method4347(field2609, "Models");
                client.method4347(field481, "Sprites");
                client.method4347(field2828, "Music Jingles");
                client.method4347(field332, "Music Samples");
                client.method4347(field4426, "Music Patches");
                client.method4347(field2646, "World Map");
                client.method4347(field1336, "World Map Geography");
                client.method4347(field1296, "World Map Ground");
                field1630 = new class367();
                field1630.method5933(field1742);
                class69.field899 = class300.field3781;
                class69.field900 = 30;
                client.field719 = 45;
            } else {
                if (var21 != 0) {
                    class69.field899 = class300.field3683 + var21 + "%";
                }
                class69.field900 = 30;
            }
        } else if (client.field719 == 45) {
            class40.method5695(22050, !client.field500, 2);
            class267 var22 = new class267();
            var22.method4556(9, 128);
            field2961 = class40.method401(field203, 0, 22050);
            field2961.method703(var22);
            class266.method4338(field4426, field332, field4446, var22);
            field242 = class40.method401(field203, 1, 2048);
            field1509 = new class36();
            field242.method703(field1509);
            field1549 = new class53(22050, field306);
            class69.field899 = class300.field3543;
            class69.field900 = 35;
            client.field719 = 50;
            field2656 = new class398(field481, field1805);
        } else if (client.field719 == 50) {
            int var23 = class399.method6416().length;
            client.field558 = field2656.method6414(class399.method6416());
            if (client.field558.size() < var23) {
                class69.field899 = class300.field3544 + client.field558.size() * 100 / var23 + "%";
                class69.field900 = 40;
            } else {
                field10 = (class332) client.field558.get(class399.field4424);
                field1275 = (class332) client.field558.get(class399.field4423);
                field4479 = (class332) client.field558.get(class399.field4420);
                field243 = client.field775.method6172();
                class69.field899 = class300.field3545;
                class69.field900 = 40;
                client.field719 = 60;
            }
        } else if (client.field719 == 60) {
            int var24 = class69.method3182(field2258, field481);
            int var25 = class69.field926.length + class69.field925.length;
            if (var24 < var25) {
                class69.field899 = class300.field3643 + var24 * 100 / var25 + "%";
                class69.field900 = 50;
            } else {
                class69.field899 = class300.field3547;
                class69.field900 = 50;
                client.method2405(5);
                client.field719 = 70;
            }
        } else if (client.field719 == 70) {
            if (field4152.method5037()) {
                class305 var27 = field4152;
                field2073 = var27;
                class305 var28 = field4152;
                field1921 = var28;
                method5168(field4152, field2609);
                method2139(field4152, field2609, client.field500);
                class171.method3948(field4152, field2609);
                class178.method3977(field4152);
                class305 var29 = field4152;
                class305 var30 = field2609;
                boolean var31 = client.field669;
                class332 var32 = field10;
                field4209 = var29;
                field22 = var30;
                field1730 = var31;
                field1183 = field4209.method5029(10);
                field889 = var32;
                method5250(field4152, field30, field604);
                class173.method979(field4152, field2609);
                class176.method4785(field4152);
                class163.method2434(field4152);
                class305 var33 = field2241;
                class305 var34 = field2609;
                class305 var35 = field481;
                class305 var36 = field1805;
                field1374 = var33;
                field3258 = var34;
                field1744 = var35;
                field2692 = var36;
                field3290 = new class286[field1374.method5041()][];
                field1654 = new boolean[field1374.method5041()];
                class162.method2607(field4152);
                class169.method757(field4152);
                class165.method4793(field4152);
                class175.method1650(field4152);
                class305 var37 = field4152;
                field1936 = var37;
                field1433 = new class410(field1847, 54, field1503, field4152);
                field2085 = new class410(field1847, 47, field1503, field4152);
                field1702 = new class97();
                class305 var38 = field4152;
                class305 var39 = field481;
                class305 var40 = field1805;
                field1963 = var38;
                field2380 = var39;
                field4487 = var40;
                class167.method4366(field4152, field481);
                class305 var41 = field4152;
                class305 var42 = field481;
                field1775 = var42;
                if (var41.method5037()) {
                    field1762 = var41.method5029(35);
                    field1761 = new class164[field1762];
                    for (int var43 = 0; var43 < field1762; var43++) {
                        byte[] var44 = var41.method5066(35, var43);
                        field1761[var43] = new class164(var43);
                        if (var44 != null) {
                            field1761[var43].method2852(new class421(var44));
                            field1761[var43].method2854();
                        }
                    }
                }
                class69.field899 = class300.field3813;
                class69.field900 = 60;
                client.field719 = 80;
            } else {
                class69.field899 = class300.field3838 + field4152.method4986() + "%";
                class69.field900 = 60;
            }
        } else if (client.field719 == 80) {
            int var45 = 0;
            if (field71 == null) {
                field71 = class435.method2593(field481, field1630.field4212, 0);
            } else {
                var45++;
            }
            if (field1031 == null) {
                field1031 = class435.method2593(field481, field1630.field4211, 0);
            } else {
                var45++;
            }
            if (field70 == null) {
                class305 var46 = field481;
                int var47 = field1630.field4218;
                class433[] var48;
                if (class435.method2591(var46, var47, 0)) {
                    class433[] var49 = new class433[field4618];
                    for (int var50 = 0; var50 < field4618; var50++) {
                        class433 var51 = var49[var50] = new class433();
                        var51.field4599 = field4613;
                        var51.field4593 = field4615;
                        var51.field4597 = field4616[var50];
                        var51.field4598 = field4614[var50];
                        var51.field4595 = field4617[var50];
                        var51.field4600 = field4415[var50];
                        var51.field4594 = field1189;
                        var51.field4596 = field2610[var50];
                    }
                    class435.method361();
                    var48 = var49;
                } else {
                    var48 = null;
                }
                field70 = var48;
            } else {
                var45++;
            }
            if (field818 == null) {
                field818 = class435.method5808(field481, field1630.field4213, 0);
            } else {
                var45++;
            }
            if (field15 == null) {
                field15 = class435.method5808(field481, field1630.field4214, 0);
            } else {
                var45++;
            }
            if (field2087 == null) {
                field2087 = class435.method5808(field481, field1630.field4210, 0);
            } else {
                var45++;
            }
            if (field1297 == null) {
                field1297 = class435.method5808(field481, field1630.field4216, 0);
            } else {
                var45++;
            }
            if (field2678 == null) {
                field2678 = class435.method5808(field481, field1630.field4217, 0);
            } else {
                var45++;
            }
            if (field3197 == null) {
                field3197 = class435.method5808(field481, field1630.field4215, 0);
            } else {
                var45++;
            }
            if (field1651 == null) {
                class305 var53 = field481;
                int var54 = field1630.field4219;
                class433[] var55;
                if (class435.method2591(var53, var54, 0)) {
                    class433[] var56 = new class433[field4618];
                    for (int var57 = 0; var57 < field4618; var57++) {
                        class433 var58 = var56[var57] = new class433();
                        var58.field4599 = field4613;
                        var58.field4593 = field4615;
                        var58.field4597 = field4616[var57];
                        var58.field4598 = field4614[var57];
                        var58.field4595 = field4617[var57];
                        var58.field4600 = field4415[var57];
                        var58.field4594 = field1189;
                        var58.field4596 = field2610[var57];
                    }
                    class435.method361();
                    var55 = var56;
                } else {
                    var55 = null;
                }
                field1651 = var55;
            } else {
                var45++;
            }
            if (field2376 == null) {
                class305 var60 = field481;
                int var61 = field1630.field4220;
                class433[] var62;
                if (class435.method2591(var60, var61, 0)) {
                    class433[] var63 = new class433[field4618];
                    for (int var64 = 0; var64 < field4618; var64++) {
                        class433 var65 = var63[var64] = new class433();
                        var65.field4599 = field4613;
                        var65.field4593 = field4615;
                        var65.field4597 = field4616[var64];
                        var65.field4598 = field4614[var64];
                        var65.field4595 = field4617[var64];
                        var65.field4600 = field4415[var64];
                        var65.field4594 = field1189;
                        var65.field4596 = field2610[var64];
                    }
                    class435.method361();
                    var62 = var63;
                } else {
                    var62 = null;
                }
                field2376 = var62;
            } else {
                var45++;
            }
            if (var45 < 11) {
                class69.field899 = class300.field3546 + var45 * 100 / 12 + "%";
                class69.field900 = 70;
            } else {
                field4033 = field2376;
                field1031.method7093();
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 21.0D) - 10;
                int var69 = (int) (Math.random() * 21.0D) - 10;
                int var70 = (int) (Math.random() * 41.0D) - 20;
                field70[0].method7033(var67 + var70, var68 + var70, var69 + var70);
                class69.field899 = class300.field3766;
                class69.field900 = 70;
                client.field719 = 90;
            }
        } else if (client.field719 == 90) {
            if (field58.method5037()) {
                field2411 = new class202(field58, field481, 20, field4567.field1228, client.field500 ? 64 : 128);
                class194.method3464(field2411);
                class194.method3465(field4567.field1228);
                client.field719 = 100;
            } else {
                class69.field899 = class300.field3552 + "0%";
                class69.field900 = 90;
            }
        } else if (client.field719 == 100) {
            int var71 = field2411.method3775();
            if (var71 < 100) {
                class69.field899 = class300.field3552 + var71 + "%";
                class69.field900 = 90;
            } else {
                class69.field899 = class300.field3553;
                class69.field900 = 90;
                client.field719 = 110;
            }
        } else if (client.field719 == 110) {
            field1329 = new class82();
            field203.method2751(field1329, 10);
            class69.field899 = class300.field3554;
            class69.field900 = 92;
            client.field719 = 120;
        } else if (client.field719 == 120) {
            if (field2258.method5050("huffman", "")) {
                class274 var72 = new class274(field2258.method5049("huffman", ""));
                class275.method78(var72);
                class69.field899 = class300.field3556;
                class69.field900 = 94;
                client.field719 = 130;
            } else {
                class69.field899 = class300.field3646 + "%";
                class69.field900 = 94;
            }
        } else if (client.field719 == 130) {
            if (!field2241.method5037()) {
                class69.field899 = class300.field3740 + field2241.method4986() * 4 / 5 + "%";
                class69.field900 = 96;
            } else if (!field1671.method5037()) {
                class69.field899 = class300.field3740 + (80 + field1671.method4986() / 6) + "%";
                class69.field900 = 96;
            } else if (field1805.method5037()) {
                class69.field899 = class300.field3558;
                class69.field900 = 98;
                client.field719 = 140;
            } else {
                class69.field899 = class300.field3740 + (96 + field1805.method4986() / 50) + "%";
                class69.field900 = 96;
            }
        } else if (client.field719 == 140) {
            class69.field900 = 100;
            if (field2646.method5051(class237.field2794.field2795)) {
                if (field3193 == null) {
                    field3193 = new class397();
                    field3193.method6214(field2646, field1336, field1296, field4479, client.field558, field70);
                }
                class69.field899 = class300.field3560;
                client.field719 = 150;
            } else {
                class69.field899 = class300.field3821 + field2646.method5052(class237.field2794.field2795) / 10 + "%";
            }
        } else if (client.field719 == 150) {
            client.method2405(10);
        }
    }

    @ObfuscatedName("ff.ad(ILbl;ZI)I")
    public static int method2819(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = field325;
            int var4 = (field2754.field1161 >> 7) + field161;
            int var5 = (field2754.field1152 >> 7) + field1467;
            client.method4434().method6225(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = class64.field844[--field848];
            String var7 = "";
            class218 var8 = client.method4434().method6243(var6);
            if (var8 != null) {
                var7 = var8.method4085();
            }
            class64.field841[++field4182 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = class64.field844[--field848];
            client.method4434().method6355(var9);
            return 1;
        } else if (arg0 == 6603) {
            class64.field844[++field848 - 1] = client.method4434().method6240();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = class64.field844[--field848];
            client.method4434().method6237(var10);
            return 1;
        } else if (arg0 == 6605) {
            class64.field844[++field848 - 1] = client.method4434().method6271() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class282 var11 = new class282(class64.field844[--field848]);
            client.method4434().method6244(var11.field3228, var11.field3229);
            return 1;
        } else if (arg0 == 6607) {
            class282 var12 = new class282(class64.field844[--field848]);
            client.method4434().method6257(var12.field3228, var12.field3229);
            return 1;
        } else if (arg0 == 6608) {
            class282 var13 = new class282(class64.field844[--field848]);
            client.method4434().method6267(var13.field3227, var13.field3228, var13.field3229);
            return 1;
        } else if (arg0 == 6609) {
            class282 var14 = new class282(class64.field844[--field848]);
            client.method4434().method6305(var14.field3227, var14.field3228, var14.field3229);
            return 1;
        } else if (arg0 == 6610) {
            class64.field844[++field848 - 1] = client.method4434().method6248();
            class64.field844[++field848 - 1] = client.method4434().method6394();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = class64.field844[--field848];
            class218 var16 = client.method4434().method6243(var15);
            if (var16 == null) {
                class64.field844[++field848 - 1] = 0;
            } else {
                class64.field844[++field848 - 1] = var16.method4056().method4817();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = class64.field844[--field848];
            class218 var18 = client.method4434().method6243(var17);
            if (var18 == null) {
                class64.field844[++field848 - 1] = 0;
                class64.field844[++field848 - 1] = 0;
            } else {
                class64.field844[++field848 - 1] = (var18.method4041() - var18.method4040() + 1) * 64;
                class64.field844[++field848 - 1] = (var18.method4035() - var18.method4071() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = class64.field844[--field848];
            class218 var20 = client.method4434().method6243(var19);
            if (var20 == null) {
                class64.field844[++field848 - 1] = 0;
                class64.field844[++field848 - 1] = 0;
                class64.field844[++field848 - 1] = 0;
                class64.field844[++field848 - 1] = 0;
            } else {
                class64.field844[++field848 - 1] = var20.method4040() * 64;
                class64.field844[++field848 - 1] = var20.method4071() * 64;
                class64.field844[++field848 - 1] = var20.method4041() * 64 + 64 - 1;
                class64.field844[++field848 - 1] = var20.method4035() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = class64.field844[--field848];
            class218 var22 = client.method4434().method6243(var21);
            if (var22 == null) {
                class64.field844[++field848 - 1] = -1;
            } else {
                class64.field844[++field848 - 1] = var22.method4039();
            }
            return 1;
        } else if (arg0 == 6615) {
            class282 var23 = client.method4434().method6354();
            if (var23 == null) {
                class64.field844[++field848 - 1] = -1;
                class64.field844[++field848 - 1] = -1;
            } else {
                class64.field844[++field848 - 1] = var23.field3228;
                class64.field844[++field848 - 1] = var23.field3229;
            }
            return 1;
        } else if (arg0 == 6616) {
            class64.field844[++field848 - 1] = client.method4434().method6227();
            return 1;
        } else if (arg0 == 6617) {
            class282 var24 = new class282(class64.field844[--field848]);
            class218 var25 = client.method4434().method6364();
            if (var25 == null) {
                class64.field844[++field848 - 1] = -1;
                class64.field844[++field848 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4073(var24.field3227, var24.field3228, var24.field3229);
            if (var26 == null) {
                class64.field844[++field848 - 1] = -1;
                class64.field844[++field848 - 1] = -1;
            } else {
                class64.field844[++field848 - 1] = var26[0];
                class64.field844[++field848 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class282 var27 = new class282(class64.field844[--field848]);
            class218 var28 = client.method4434().method6364();
            if (var28 == null) {
                class64.field844[++field848 - 1] = -1;
                class64.field844[++field848 - 1] = -1;
                return 1;
            }
            class282 var29 = var28.method4032(var27.field3228, var27.field3229);
            if (var29 == null) {
                class64.field844[++field848 - 1] = -1;
            } else {
                class64.field844[++field848 - 1] = var29.method4817();
            }
            return 1;
        } else if (arg0 == 6619) {
            field848 -= 2;
            int var30 = class64.field844[field848];
            class282 var31 = new class282(class64.field844[field848 + 1]);
            class64.method3945(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            field848 -= 2;
            int var32 = class64.field844[field848];
            class282 var33 = new class282(class64.field844[field848 + 1]);
            class64.method3945(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            field848 -= 2;
            int var34 = class64.field844[field848];
            class282 var35 = new class282(class64.field844[field848 + 1]);
            class218 var36 = client.method4434().method6243(var34);
            if (var36 == null) {
                class64.field844[++field848 - 1] = 0;
                return 1;
            } else {
                class64.field844[++field848 - 1] = var36.method4026(var35.field3227, var35.field3228, var35.field3229) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            class64.field844[++field848 - 1] = client.method4434().method6251();
            class64.field844[++field848 - 1] = client.method4434().method6308();
            return 1;
        } else if (arg0 == 6623) {
            class282 var37 = new class282(class64.field844[--field848]);
            class218 var38 = client.method4434().method6224(var37.field3227, var37.field3228, var37.field3229);
            if (var38 == null) {
                class64.field844[++field848 - 1] = -1;
            } else {
                class64.field844[++field848 - 1] = var38.method4034();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method4434().method6253(class64.field844[--field848]);
            return 1;
        } else if (arg0 == 6625) {
            client.method4434().method6254();
            return 1;
        } else if (arg0 == 6626) {
            client.method4434().method6336(class64.field844[--field848]);
            return 1;
        } else if (arg0 == 6627) {
            client.method4434().method6256();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = class64.field844[--field848] == 1;
            client.method4434().method6223(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = class64.field844[--field848];
            client.method4434().method6351(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = class64.field844[--field848];
            client.method4434().method6259(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method4434().method6222();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = class64.field844[--field848] == 1;
            client.method4434().method6262(var42);
            return 1;
        } else if (arg0 == 6633) {
            field848 -= 2;
            int var43 = class64.field844[field848];
            boolean var44 = class64.field844[field848 + 1] == 1;
            client.method4434().method6250(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            field848 -= 2;
            int var45 = class64.field844[field848];
            boolean var46 = class64.field844[field848 + 1] == 1;
            client.method4434().method6263(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            class64.field844[++field848 - 1] = client.method4434().method6384() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = class64.field844[--field848];
            class64.field844[++field848 - 1] = client.method4434().method6265(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = class64.field844[--field848];
            class64.field844[++field848 - 1] = client.method4434().method6266(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            field848 -= 2;
            int var49 = class64.field844[field848];
            class282 var50 = new class282(class64.field844[field848 + 1]);
            class282 var51 = client.method4434().method6228(var49, var50);
            if (var51 == null) {
                class64.field844[++field848 - 1] = -1;
            } else {
                class64.field844[++field848 - 1] = var51.method4817();
            }
            return 1;
        } else if (arg0 == 6639) {
            class236 var52 = client.method4434().method6246();
            if (var52 == null) {
                class64.field844[++field848 - 1] = -1;
                class64.field844[++field848 - 1] = -1;
            } else {
                class64.field844[++field848 - 1] = var52.method3980();
                class64.field844[++field848 - 1] = var52.field2788.method4817();
            }
            return 1;
        } else if (arg0 == 6640) {
            class236 var53 = client.method4434().method6401();
            if (var53 == null) {
                class64.field844[++field848 - 1] = -1;
                class64.field844[++field848 - 1] = -1;
            } else {
                class64.field844[++field848 - 1] = var53.method3980();
                class64.field844[++field848 - 1] = var53.field2788.method4817();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = class64.field844[--field848];
            class164 var55 = class164.method2597(var54);
            if (var55.field1782 == null) {
                class64.field841[++field4182 - 1] = "";
            } else {
                class64.field841[++field4182 - 1] = var55.field1782;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = class64.field844[--field848];
            class164 var57 = class164.method2597(var56);
            class64.field844[++field848 - 1] = var57.field1779;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = class64.field844[--field848];
            class164 var59 = class164.method2597(var58);
            if (var59 == null) {
                class64.field844[++field848 - 1] = -1;
            } else {
                class64.field844[++field848 - 1] = var59.field1783;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = class64.field844[--field848];
            class164 var61 = class164.method2597(var60);
            if (var61 == null) {
                class64.field844[++field848 - 1] = -1;
            } else {
                class64.field844[++field848 - 1] = var61.field1765;
            }
            return 1;
        } else if (arg0 == 6697) {
            class64.field844[++field848 - 1] = field98.field2803;
            return 1;
        } else if (arg0 == 6698) {
            class64.field844[++field848 - 1] = field98.field2804.method4817();
            return 1;
        } else if (arg0 == 6699) {
            class64.field844[++field848 - 1] = field98.field2805.method4817();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cf.he(IIIIIIIB)V")
    public static final void method1983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = client.method2944(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class194.field2271[var8];
            int var14 = class194.field2280[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class194.field2271[var9];
            int var17 = class194.field2280[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        if (client.field752) {
            field2599 = arg0 - var10;
            field4142 = arg1 - var11;
            field1625 = arg2 - var12;
            field3063 = arg3;
            field855 = arg4;
        } else {
            field4498 = arg0 - var10;
            field2749 = arg1 - var11;
            field494 = arg2 - var12;
            field33 = arg3;
            field42 = arg4;
        }
        if (client.field580 == 1 && client.field674 >= 2 && client.field682 % 50 == 0 && (field182 >> 7 != field2754.field1161 >> 7 || field1492 >> 7 != field2754.field1152 >> 7)) {
            int var19 = field2754.field1084;
            int var20 = (field182 >> 7) + field161;
            int var21 = (field1492 >> 7) + field1467;
            client.method357(var20, var21, var19, true);
        }
    }

    @ObfuscatedName("dg.is(Ljava/lang/String;Ljz;I)Ljava/lang/String;")
    public static String method2585(String arg0, class286 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + client.method4351(client.method6128(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("gz.kr(I)V")
    public static final void method3936() {
        class257 var0 = class257.method2630(class255.field2930, client.field551.field1319);
        client.field551.method2268(var0);
        class64.field849 = true;
        for (class80 var1 = (class80) client.field666.method6463(); var1 != null; var1 = (class80) client.field666.method6457()) {
            if (var1.field1038 == 0 || var1.field1038 == 3) {
                client.method2598(var1, true);
            }
        }
        if (client.field526 != null) {
            client.method2435(client.field526);
            client.field526 = null;
        }
        class64.field849 = false;
    }

    @ObfuscatedName("mk.kl(Ljava/lang/String;I)V")
    public static final void method5857(String arg0) {
        if (field888 != null) {
            class257 var1 = class257.method2630(class255.field2879, client.field551.field1319);
            var1.field2960.method6644(class421.method5127(arg0));
            var1.field2960.method6654(arg0);
            client.field551.method2268(var1);
        }
    }
}
