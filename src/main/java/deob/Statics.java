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
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("bf.v")
    public static class275 field1003;

    @ObfuscatedName("bf.tp")
    public static int field1004;

    @ObfuscatedName("e.bi")
    public static int field101;

    @ObfuscatedName("ce.sg")
    public static class40 field1019;

    @ObfuscatedName("e.y")
    public static String[] field102;

    @ObfuscatedName("cb.k")
    public static boolean field1021;

    @ObfuscatedName("cb.ic")
    public static class456[] field1028;

    @ObfuscatedName("cb.c")
    public static int[] field1029;

    @ObfuscatedName("e.c")
    public static class456 field103;

    @ObfuscatedName("co.vx")
    public static int field1045;

    @ObfuscatedName("co.sz")
    public static class53 field1047;

    @ObfuscatedName("cl.ez")
    public static class314 field1048;

    @ObfuscatedName("e.rl")
    public static class368 field105;

    @ObfuscatedName("cl.im")
    public static class457 field1050;

    @ObfuscatedName("cl.sa")
    public static class40 field1056;

    @ObfuscatedName("b.hh")
    public static int field106;

    @ObfuscatedName("cf.cv")
    public static boolean field1067;

    @ObfuscatedName("cf.ju")
    public static int field1069;

    @ObfuscatedName("b.h")
    public static class316 field110;

    @ObfuscatedName("cq.rq")
    public static class461 field1106;

    @ObfuscatedName("b.bu")
    public static class305 field112;

    @ObfuscatedName("x.tv")
    public static int field114;

    @ObfuscatedName("cn.z")
    public static class444 field1235;

    @ObfuscatedName("cn.bm")
    public static int field1246;

    @ObfuscatedName("cn.jn")
    public static int field1247;

    @ObfuscatedName("cn.dc")
    public static class378 field1249;

    @ObfuscatedName("cj.pm")
    public static int field1250;

    @ObfuscatedName("t.z")
    public static class456 field128;

    @ObfuscatedName("cr.ul")
    public static List field1282;

    @ObfuscatedName("cg.hc")
    public static byte[][] field1319;

    @ObfuscatedName("cg.ee")
    public static class314 field1320;

    @ObfuscatedName("cd.z")
    public static class140 field1327;

    @ObfuscatedName("cu.al")
    public static class385 field1347;

    @ObfuscatedName("cu.i")
    public static int field1348;

    @ObfuscatedName("ca.j")
    public static int[] field1352;

    @ObfuscatedName("cv.d")
    public static int field1356;

    @ObfuscatedName("ck.r")
    public static int[] field1363;

    @ObfuscatedName("du.d")
    public static int field1369;

    @ObfuscatedName("du.gz")
    public static String field1372;

    @ObfuscatedName("di.pa")
    public static int field1375;

    @ObfuscatedName("dy.un")
    public static class318 field1384;

    @ObfuscatedName("dy.e")
    public static class444 field1386;

    @ObfuscatedName("dv.ae")
    public static Image field1388;

    @ObfuscatedName("c.rm")
    public static boolean field14;

    @ObfuscatedName("dr.nt")
    public static class295 field1406;

    @ObfuscatedName("dp.l")
    public static class427[] field1428;

    @ObfuscatedName("dn.gf")
    public static class165 field1457;

    @ObfuscatedName("t.bj")
    public static String field147;

    @ObfuscatedName("dt.qq")
    public static class159 field1470;

    @ObfuscatedName("dt.aw")
    public static class454 field1490;

    @ObfuscatedName("dm.es")
    public static class314 field1493;

    @ObfuscatedName("dm.ir")
    public static class456[] field1495;

    @ObfuscatedName("dq.n")
    public static int[] field1497;

    @ObfuscatedName("db.a")
    public static int field1518;

    @ObfuscatedName("de.c")
    public static File field1532;

    @ObfuscatedName("dc.ho")
    public static class417 field1541;

    @ObfuscatedName("ev.el")
    public static class314 field1546;

    @ObfuscatedName("ev.m")
    public static boolean field1547;

    @ObfuscatedName("ek.mt")
    public static int field1562;

    @ObfuscatedName("j.fy")
    public static String field157;

    @ObfuscatedName("el.ln")
    public static class295 field1571;

    @ObfuscatedName("eb.o")
    public static int[][] field1588;

    @ObfuscatedName("g.iy")
    public static class457[] field159;

    @ObfuscatedName("ea.aj")
    public static Font field1590;

    @ObfuscatedName("ef.ig")
    public static int field1594;

    @ObfuscatedName("ef.m")
    public static class350 field1595;

    @ObfuscatedName("ex.c")
    public static int field1635;

    @ObfuscatedName("ex.bp")
    public static int field1636;

    @ObfuscatedName("ew.i")
    public static int field1640;

    @ObfuscatedName("eg.o")
    public static int field1645;

    @ObfuscatedName("av.s")
    public static class316 field165;

    @ObfuscatedName("et.ao")
    public static String field1651;

    @ObfuscatedName("et.ct")
    public static int field1654;

    @ObfuscatedName("ez.x")
    public static String field1658;

    @ObfuscatedName("ec.sp")
    public static int field1665;

    @ObfuscatedName("av.o")
    public static int field167;

    @ObfuscatedName("ey.nu")
    public static int field1674;

    @ObfuscatedName("ed.m")
    public static int field1678;

    @ObfuscatedName("ed.ix")
    public static int field1682;

    @ObfuscatedName("aj.m")
    public static class456 field169;

    @ObfuscatedName("fu.s")
    public static String field1717;

    @ObfuscatedName("fu.hi")
    public static byte[][] field1719;

    @ObfuscatedName("fu.h")
    public static String field1724;

    @ObfuscatedName("fu.n")
    public static class42 field1726;

    @ObfuscatedName("fk.fa")
    public static int field1729;

    @ObfuscatedName("aj.td")
    public static int field173;

    @ObfuscatedName("ff.h")
    public static File field1737;

    @ObfuscatedName("ff.fq")
    public static int field1738;

    @ObfuscatedName("ft.y")
    public static int field1745;

    @ObfuscatedName("ft.b")
    public static class248 field1747;

    @ObfuscatedName("ft.n")
    public static int field1748;

    @ObfuscatedName("ft.fz")
    public static int field1752;

    @ObfuscatedName("fc.a")
    public static class456[] field1761;

    @ObfuscatedName("fb.hg")
    public static class101 field1771;

    @ObfuscatedName("fb.bd")
    public static class331 field1773;

    @ObfuscatedName("fb.mm")
    public static int field1775;

    @ObfuscatedName("fz.s")
    public static class316 field1800;

    @ObfuscatedName("fz.b")
    public static String field1802;

    @ObfuscatedName("fw.ip")
    public static class456[] field1804;

    @ObfuscatedName("fw.s")
    public static class316 field1805;

    @ObfuscatedName("fw.tf")
    public static int field1806;

    @ObfuscatedName("fw.h")
    public static int field1810;

    @ObfuscatedName("fy.w")
    public static int field1812;

    @ObfuscatedName("fy.dh")
    public static class165 field1823;

    @ObfuscatedName("fy.h")
    public static class171[] field1833;

    @ObfuscatedName("fr.s")
    public static class316 field1839;

    @ObfuscatedName("fr.ax")
    public static FontMetrics field1841;

    @ObfuscatedName("fv.h")
    public static class316 field1843;

    @ObfuscatedName("fv.s")
    public static class316 field1844;

    @ObfuscatedName("fv.ew")
    public static class314 field1857;

    @ObfuscatedName("fv.w")
    public static int field1858;

    @ObfuscatedName("ab.k")
    public static int field186;

    @ObfuscatedName("fi.h")
    public static class316 field1860;

    @ObfuscatedName("fi.s")
    public static class316 field1869;

    @ObfuscatedName("fn.s")
    public static class316 field1879;

    @ObfuscatedName("ab.s")
    public static class157 field188;

    @ObfuscatedName("fn.ng")
    public static class295 field1891;

    @ObfuscatedName("fn.jk")
    public static int field1892;

    @ObfuscatedName("fj.h")
    public static class316 field1902;

    @ObfuscatedName("fj.s")
    public static class316 field1906;

    @ObfuscatedName("fj.ps")
    public static int field1946;

    @ObfuscatedName("fl.l")
    public static class456 field1953;

    @ObfuscatedName("fh.h")
    public static class316 field1956;

    @ObfuscatedName("fh.s")
    public static class316 field1966;

    @ObfuscatedName("fs.s")
    public static class316 field1971;

    @ObfuscatedName("fs.ep")
    public static class314 field1980;

    @ObfuscatedName("fm.o")
    public static byte[][] field1982;

    @ObfuscatedName("fm.eu")
    public static class384 field1984;

    @ObfuscatedName("gz.cq")
    public static class456[] field1993;

    @ObfuscatedName("gz.s")
    public static class316 field1994;

    @ObfuscatedName("gw.s")
    public static class316 field1998;

    @ObfuscatedName("h.mz")
    public static int field2;

    @ObfuscatedName("gm.bb")
    public static class424 field2008;

    @ObfuscatedName("gm.s")
    public static class316 field2011;

    @ObfuscatedName("gu.by")
    public static String field2013;

    @ObfuscatedName("gu.w")
    public static class316 field2014;

    @ObfuscatedName("gu.h")
    public static class316 field2025;

    @ObfuscatedName("gc.w")
    public static class316 field2037;

    @ObfuscatedName("gc.h")
    public static class316 field2058;

    @ObfuscatedName("gb.i")
    public static class316 field2089;

    @ObfuscatedName("gb.q")
    public static class316 field2135;

    @ObfuscatedName("gj.s")
    public static class316 field2155;

    @ObfuscatedName("gj.jz")
    public static int field2156;

    @ObfuscatedName("gh.w")
    public static class316 field2159;

    @ObfuscatedName("gh.et")
    public static class314 field2168;

    @ObfuscatedName("gl.iu")
    public static int field2197;

    @ObfuscatedName("gr.sh")
    public static int field2199;

    @ObfuscatedName("gs.q")
    public static int field2213;

    @ObfuscatedName("gs.f")
    public static class316 field2220;

    @ObfuscatedName("gk.n")
    public static short[][] field2276;

    @ObfuscatedName("gk.fb")
    public static int field2281;

    @ObfuscatedName("gx.l")
    public static int[] field2284;

    @ObfuscatedName("ak.em")
    public static class314 field231;

    @ObfuscatedName("gg.to")
    public static int field2310;

    @ObfuscatedName("ak.fw")
    public static int field232;

    @ObfuscatedName("gg.ey")
    public static class314 field2334;

    @ObfuscatedName("go.m")
    public static int field2345;

    @ObfuscatedName("go.f")
    public static class217 field2348;

    @ObfuscatedName("go.u")
    public static int field2350;

    @ObfuscatedName("go.l")
    public static int field2351;

    @ObfuscatedName("go.z")
    public static int field2352;

    @ObfuscatedName("go.y")
    public static int field2354;

    @ObfuscatedName("go.e")
    public static int field2356;

    @ObfuscatedName("go.p")
    public static int field2359;

    @ObfuscatedName("go.r")
    public static int field2362;

    @ObfuscatedName("gd.eq")
    public static class314 field2367;

    @ObfuscatedName("gy.r")
    public static int field2381;

    @ObfuscatedName("gy.bx")
    public static int field2399;

    @ObfuscatedName("gy.p")
    public static int field2401;

    @ObfuscatedName("gy.x")
    public static int field2402;

    @ObfuscatedName("gy.f")
    public static int field2403;

    @ObfuscatedName("gy.t")
    public static int field2404;

    @ObfuscatedName("gy.j")
    public static int field2405;

    @ObfuscatedName("gy.g")
    public static int field2406;

    @ObfuscatedName("gy.ar")
    public static int field2407;

    @ObfuscatedName("gy.aq")
    public static int field2408;

    @ObfuscatedName("gy.av")
    public static int field2409;

    @ObfuscatedName("gy.aj")
    public static int field2410;

    @ObfuscatedName("gy.e")
    public static int field2419;

    @ObfuscatedName("gy.ba")
    public static int field2429;

    @ObfuscatedName("gy.bd")
    public static boolean[][] field2433;

    @ObfuscatedName("gy.b")
    public static int field2440;

    @ObfuscatedName("gy.bg")
    public static int field2442;

    @ObfuscatedName("gy.by")
    public static int field2443;

    @ObfuscatedName("gy.bs")
    public static int field2444;

    @ObfuscatedName("gy.br")
    public static int field2445;

    @ObfuscatedName("gy.y")
    public static int field2446;

    @ObfuscatedName("gq.eb")
    public static class314 field2448;

    @ObfuscatedName("gf.u")
    public static int[] field2454;

    @ObfuscatedName("k.ia")
    public static class457[] field25;

    @ObfuscatedName("ae.hx")
    public static class350 field250;

    @ObfuscatedName("hp.bs")
    public static int field2573;

    @ObfuscatedName("hp.br")
    public static int field2574;

    @ObfuscatedName("hp.bx")
    public static int field2575;

    @ObfuscatedName("hg.q")
    public static int field2594;

    @ObfuscatedName("hg.n")
    public static int field2600;

    @ObfuscatedName("ha.k")
    public static int field2613;

    @ObfuscatedName("ha.j")
    public static class316 field2616;

    @ObfuscatedName("hn.kd")
    public static class295 field2635;

    @ObfuscatedName("hn.cj")
    public static char field2637;

    @ObfuscatedName("hk.j")
    public static int field2650;

    @ObfuscatedName("hu.mx")
    public static int field2669;

    @ObfuscatedName("hv.hd")
    public static int[][] field2673;

    @ObfuscatedName("hv.d")
    public static short[] field2675;

    @ObfuscatedName("hm.fg")
    public static int field2685;

    @ObfuscatedName("hs.af")
    public static String field2694;

    @ObfuscatedName("hs.hn")
    public static class350 field2706;

    @ObfuscatedName("ad.n")
    public static int[] field273;

    @ObfuscatedName("hz.t")
    public static class316 field2757;

    @ObfuscatedName("ad.d")
    public static int[] field276;

    @ObfuscatedName("hz.tk")
    public static int field2760;

    @ObfuscatedName("hb.ek")
    public static long field2766;

    @ObfuscatedName("ad.a")
    public static boolean[] field277;

    @ObfuscatedName("hj.iq")
    public static class457[] field2772;

    @ObfuscatedName("af.k")
    public static ScheduledExecutorService field279;

    @ObfuscatedName("af.o")
    public static int field280;

    @ObfuscatedName("ii.nv")
    public static class67 field2833;

    @ObfuscatedName("iw.jg")
    public static int field2838;

    @ObfuscatedName("ig.aa")
    public static GarbageCollectorMXBean field2849;

    @ObfuscatedName("it.o")
    public static int field2871;

    @ObfuscatedName("ij.n")
    public static class103 field2909;

    @ObfuscatedName("io.r")
    public static class89 field2910;

    @ObfuscatedName("af.q")
    public static boolean field297;

    @ObfuscatedName("af.m")
    public static int[] field298;

    @ObfuscatedName("af.ch")
    public static class456[] field300;

    @ObfuscatedName("jb.vz")
    public static class416 field3026;

    @ObfuscatedName("jg.gt")
    public static class378 field3046;

    @ObfuscatedName("k.hv")
    public static int field31;

    @ObfuscatedName("ai.l")
    public static class295 field317;

    @ObfuscatedName("ji.lp")
    public static int field3173;

    @ObfuscatedName("ji.ec")
    public static class314 field3177;

    @ObfuscatedName("jx.s")
    public static long field3179;

    @ObfuscatedName("jx.jy")
    public static int field3180;

    @ObfuscatedName("jx.h")
    public static long field3181;

    @ObfuscatedName("jd.ef")
    public static class314 field3183;

    @ObfuscatedName("jd.ud")
    public static short[] field3185;

    @ObfuscatedName("jd.ta")
    public static int field3187;

    @ObfuscatedName("k.t")
    public static int field32;

    @ObfuscatedName("jv.h")
    public static class316 field3200;

    @ObfuscatedName("jv.s")
    public static class316 field3202;

    @ObfuscatedName("jv.d")
    public static boolean field3203;

    @ObfuscatedName("jv.w")
    public static class316 field3204;

    @ObfuscatedName("ap.k")
    public static int field323;

    @ObfuscatedName("ap.tt")
    public static int field324;

    @ObfuscatedName("ap.i")
    public static int[] field325;

    @ObfuscatedName("jk.d")
    public static class456 field3257;

    @ObfuscatedName("jl.ib")
    public static class457[] field3278;

    @ObfuscatedName("jl.in")
    public static class457[] field3279;

    @ObfuscatedName("jp.c")
    public static int field3289;

    @ObfuscatedName("jp.bg")
    public static String field3292;

    @ObfuscatedName("js.nm")
    public static int field3293;

    @ObfuscatedName("jr.al")
    public static client field3295;

    @ObfuscatedName("jr.p")
    public static byte[][][] field3296;

    @ObfuscatedName("jm.rs")
    public static boolean field3301;

    @ObfuscatedName("kf.vc")
    public static int field3303;

    @ObfuscatedName("ku.qr")
    public static class393 field3319;

    @ObfuscatedName("km.pg")
    public static class429 field3321;

    @ObfuscatedName("kh.ty")
    public static int field3325;

    @ObfuscatedName("kk.a")
    public static short[][] field3332;

    @ObfuscatedName("kk.o")
    public static short[] field3334;

    @ObfuscatedName("kn.b")
    public static boolean[] field3349;

    @ObfuscatedName("kw.up")
    public static Iterator field3548;

    @ObfuscatedName("kr.ex")
    public static class314 field3562;

    @ObfuscatedName("kt.lj")
    public static class209 field3589;

    @ObfuscatedName("ko.ha")
    public static class350 field3608;

    @ObfuscatedName("ko.ea")
    public static class314 field3613;

    @ObfuscatedName("kq.tc")
    public static int field3614;

    @ObfuscatedName("at.r")
    public static int[] field363;

    @ObfuscatedName("at.a")
    public static class49[] field365;

    @ObfuscatedName("at.i")
    public static byte[] field369;

    @ObfuscatedName("at.j")
    public static float[] field370;

    @ObfuscatedName("at.o")
    public static int field371;

    @ObfuscatedName("at.n")
    public static int field372;

    @ObfuscatedName("at.m")
    public static class39[] field375;

    @ObfuscatedName("at.u")
    public static class44[] field376;

    @ObfuscatedName("at.l")
    public static class47[] field377;

    @ObfuscatedName("at.z")
    public static boolean[] field378;

    @ObfuscatedName("at.av")
    public static float[] field380;

    @ObfuscatedName("at.d")
    public static int field384;

    @ObfuscatedName("at.f")
    public static float[] field385;

    @ObfuscatedName("at.t")
    public static float[] field386;

    @ObfuscatedName("at.g")
    public static float[] field387;

    @ObfuscatedName("at.k")
    public static int field388;

    @ObfuscatedName("at.ar")
    public static float[] field389;

    @ObfuscatedName("at.aq")
    public static float[] field390;

    @ObfuscatedName("at.aj")
    public static int[] field392;

    @ObfuscatedName("at.ax")
    public static int[] field393;

    @ObfuscatedName("kd.db")
    public static boolean field3943;

    @ObfuscatedName("lk.c")
    public static Thread field3973;

    @ObfuscatedName("ln.hj")
    public static int[] field3978;

    @ObfuscatedName("la.v")
    public static File field3991;

    @ObfuscatedName("la.q")
    public static class316 field3995;

    @ObfuscatedName("la.hy")
    public static int[] field3997;

    @ObfuscatedName("lr.w")
    public static long field4018;

    @ObfuscatedName("lr.h")
    public static class378 field4034;

    @ObfuscatedName("lr.cf")
    public static class456[] field4037;

    @ObfuscatedName("lr.rr")
    public static class149 field4039;

    @ObfuscatedName("bq.ej")
    public static class314 field404;

    @ObfuscatedName("lr.ti")
    public static int field4040;

    @ObfuscatedName("lg.a")
    public static int[] field4041;

    @ObfuscatedName("lg.dw")
    public static class82 field4048;

    @ObfuscatedName("bq.hu")
    public static int field405;

    @ObfuscatedName("ll.m")
    public static class48 field4050;

    @ObfuscatedName("ll.gq")
    public static long field4051;

    @ObfuscatedName("lj.uk")
    public static class62 field4063;

    @ObfuscatedName("lc.ci")
    public static class456 field4065;

    @ObfuscatedName("le.o")
    public static int[] field4085;

    @ObfuscatedName("lq.i")
    public static class456 field4092;

    @ObfuscatedName("li.st")
    public static class36 field4123;

    @ObfuscatedName("mu.z")
    public static int field4139;

    @ObfuscatedName("mu.ed")
    public static class314 field4142;

    @ObfuscatedName("me.ph")
    public static class98 field4144;

    @ObfuscatedName("mw.fr")
    public static String field4151;

    @ObfuscatedName("mw.c")
    public static int field4153;

    @ObfuscatedName("bn.k")
    public static float field416;

    @ObfuscatedName("mb.vr")
    public static class327 field4165;

    @ObfuscatedName("bn.o")
    public static int field417;

    @ObfuscatedName("mq.n")
    public static class456[] field4193;

    @ObfuscatedName("my.hm")
    public static int field4197;

    @ObfuscatedName("mm.y")
    public static int[] field4218;

    @ObfuscatedName("mt.eo")
    public static class314 field4233;

    @ObfuscatedName("md.e")
    public static class295[][] field4250;

    @ObfuscatedName("mv.r")
    public static int field4263;

    @ObfuscatedName("nl.en")
    public static class314 field4296;

    @ObfuscatedName("np.ua")
    public static class90 field4303;

    @ObfuscatedName("nb.o")
    public static int field4306;

    @ObfuscatedName("nf.ja")
    public static int field4309;

    @ObfuscatedName("nf.q")
    public static byte[][][] field4310;

    @ObfuscatedName("nf.r")
    public static String[] field4312;

    @ObfuscatedName("nv.u")
    public static class295 field4320;

    @ObfuscatedName("na.f")
    public static String field4335;

    @ObfuscatedName("nj.ih")
    public static class457[] field4344;

    @ObfuscatedName("nh.bt")
    public static int field4380;

    @ObfuscatedName("nh.dm")
    public static boolean field4383;

    @ObfuscatedName("nh.qz")
    public static class429 field4384;

    @ObfuscatedName("ny.cl")
    public static class457[] field4404;

    @ObfuscatedName("op.ah")
    public static boolean field4426;

    @ObfuscatedName("oc.um")
    public static class413 field4431;

    @ObfuscatedName("ot.hb")
    public static int[] field4432;

    @ObfuscatedName("ol.l")
    public static int field4438;

    @ObfuscatedName("oi.tn")
    public static int field4449;

    @ObfuscatedName("bu.lq")
    public static class85 field454;

    @ObfuscatedName("ps.uj")
    public static long field4588;

    @ObfuscatedName("ps.rg")
    public static class140 field4591;

    @ObfuscatedName("pq.s")
    public static class316 field4649;

    @ObfuscatedName("pk.a")
    public static class167 field4662;

    @ObfuscatedName("pu.s")
    public static class316 field4670;

    @ObfuscatedName("pr.s")
    public static class316 field4679;

    @ObfuscatedName("pr.x")
    public static class316 field4684;

    @ObfuscatedName("px.q")
    public static int field4689;

    @ObfuscatedName("qz.eh")
    public static class314 field4701;

    @ObfuscatedName("bw.gl")
    public static SecureRandom field471;

    @ObfuscatedName("bw.i")
    public static byte[][][] field474;

    @ObfuscatedName("qf.bs")
    public static int field4766;

    @ObfuscatedName("qm.aj")
    public static int field4771;

    @ObfuscatedName("qm.av")
    public static int field4772;

    @ObfuscatedName("qm.aq")
    public static int[] field4775;

    @ObfuscatedName("qt.h")
    public static int field4807;

    @ObfuscatedName("qt.s")
    public static int field4808;

    @ObfuscatedName("qt.w")
    public static int field4809;

    @ObfuscatedName("qt.v")
    public static int[] field4810;

    @ObfuscatedName("qt.k")
    public static int[] field4811;

    @ObfuscatedName("qt.q")
    public static int[] field4812;

    @ObfuscatedName("qh.v")
    public static class316 field4829;

    @ObfuscatedName("qy.a")
    public static class279 field4839;

    @ObfuscatedName("qj.s")
    public static class282 field4840;

    @ObfuscatedName("qw.s")
    public static Applet field4844;

    @ObfuscatedName("qw.w")
    public static int field4845;

    @ObfuscatedName("qw.h")
    public static String field4846;

    @ObfuscatedName("qw.c")
    public static int field4847;

    @ObfuscatedName("qw.v")
    public static int field4848;

    @ObfuscatedName("d.o")
    public static class457 field49;

    @ObfuscatedName("h.sm")
    public static class457 field5;

    @ObfuscatedName("client.gr")
    public static int[] field526;

    @ObfuscatedName("a.at")
    public static class385 field61;

    @ObfuscatedName("a.uc")
    public static class382 field62;

    @ObfuscatedName("m.fp")
    public static String field67;

    @ObfuscatedName("m.iv")
    public static class204 field69;

    @ObfuscatedName("l.cc")
    public static class456 field77;

    @ObfuscatedName("bd.c")
    public static class61[] field775;

    @ObfuscatedName("z.h")
    public static class16 field81;

    @ObfuscatedName("bs.v")
    public static int[] field819;

    @ObfuscatedName("bs.c")
    public static String[] field820;

    @ObfuscatedName("bs.r")
    public static class149 field827;

    @ObfuscatedName("bs.bl")
    public static class304 field835;

    @ObfuscatedName("br.pb")
    public static class295[] field841;

    @ObfuscatedName("ba.u")
    public static class315 field863;

    @ObfuscatedName("bh.nx")
    public static int field865;

    @ObfuscatedName("r.il")
    public static class457 field87;

    @ObfuscatedName("bc.v")
    public static class456[] field871;

    @ObfuscatedName("bc.q")
    public static class456 field872;

    @ObfuscatedName("bc.k")
    public static class456 field873;

    @ObfuscatedName("bc.u")
    public static class456 field875;

    @ObfuscatedName("bc.h")
    public static boolean field877;

    @ObfuscatedName("bc.f")
    public static int field879;

    @ObfuscatedName("r.lk")
    public static class295 field88;

    @ObfuscatedName("r.jq")
    public static int field89;

    @ObfuscatedName("bc.n")
    public static class457 field894;

    @ObfuscatedName("y.eg")
    public static class314 field90;

    @ObfuscatedName("bc.d")
    public static int[] field908;

    @ObfuscatedName("y.cx")
    public static class456 field91;

    @ObfuscatedName("y.fx")
    public static int field92;

    @ObfuscatedName("bm.iz")
    public static int field923;

    @ObfuscatedName("y.l")
    public static int[][][] field93;

    @ObfuscatedName("bz.m")
    public static class43 field956;

    @ObfuscatedName("p.tb")
    public static int field97;

    @ObfuscatedName("bj.v")
    public static byte[][][] field974;

    @ObfuscatedName("bj.k")
    public static byte[][][] field976;

    @ObfuscatedName("bj.c")
    public static byte[][][] field986;

    @ObfuscatedName("aq.s(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
    public static Object method379(Applet arg0, String arg1) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
    }

    @ObfuscatedName("fu.h(IIB)Z")
    public static boolean method2889(int arg0, int arg1) {
        return (arg0 >> arg1 + 1 & 0x1) != 0;
    }

    @ObfuscatedName("hy.s(Ljp;S)V")
    public static void method4434(class282 arg0) {
        field4840 = arg0;
    }

    @ObfuscatedName("fa.s(Lls;I)V")
    public static void method2934(class316 arg0) {
        field1839 = arg0;
    }

    @ObfuscatedName("b.s(II)Lfz;")
    public static class169 method282(int arg0) {
        class169 var1 = (class169) class169.field1798.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field1800.method5179(5, arg0);
        class169 var3 = new class169();
        if (var2 != null) {
            var3.method2939(new class444(var2));
        }
        class169.field1798.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("mc.s(ILnk;Lln;I)V")
    public static void method5883(int arg0, class382 arg1, class314 arg2) {
        class312 var3 = new class312();
        var3.field3969 = 1;
        var3.field4468 = (long) arg0;
        var3.field3970 = arg1;
        var3.field3967 = arg2;
        class335 var4 = class313.field3975;
        synchronized (class313.field3975) {
            class313.field3975.method5425(var3);
        }
        Object var6 = class313.field3974;
        synchronized (class313.field3974) {
            if (class313.field3971 == 0) {
                field3973 = new Thread(new class313());
                field3973.setDaemon(true);
                field3973.start();
                field3973.setPriority(5);
            }
            class313.field3971 = 600;
        }
    }

    @ObfuscatedName("ce.h(IB)Lfw;")
    public static class170 method1949(int arg0) {
        class170 var1 = (class170) class170.field1809.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field1805.method5179(16, arg0);
        class170 var3 = new class170();
        if (var2 != null) {
            var3.method2949(new class444(var2));
        }
        class170.field1809.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("dl.s(Lls;I)V")
    public static void method2633(class316 arg0) {
        field2155 = arg0;
    }

    @ObfuscatedName("cu.s(Lqz;I)V")
    public static void method2370(class443 arg0) {
        class35 var1 = (class35) class34.field238.method5482();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field4708;
        arg0.method6915(var1.field247);
        for (int var3 = 0; var3 < var1.field241; var3++) {
            if (var1.field242[var3] == 0) {
                try {
                    int var4 = var1.field240[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field244[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method6912(0);
                        arg0.method6915(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field244[var3];
                        var7.setInt((Object) null, var1.field245[var3]);
                        arg0.method6912(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field244[var3];
                        int var9 = var8.getModifiers();
                        arg0.method6912(0);
                        arg0.method6915(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field246[var3];
                        byte[][] var11 = var1.field243[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method6912(0);
                        } else if (var15 instanceof Number) {
                            arg0.method6912(1);
                            arg0.method7068(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method6912(2);
                            arg0.method6950((String) var15);
                        } else {
                            arg0.method6912(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field246[var3];
                        int var17 = var16.getModifiers();
                        arg0.method6912(0);
                        arg0.method6915(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method6912(-10);
                } catch (InvalidClassException var31) {
                    arg0.method6912(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method6912(-12);
                } catch (OptionalDataException var33) {
                    arg0.method6912(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method6912(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method6912(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method6912(-16);
                } catch (SecurityException var37) {
                    arg0.method6912(-17);
                } catch (IOException var38) {
                    arg0.method6912(-18);
                } catch (NullPointerException var39) {
                    arg0.method6912(-19);
                } catch (Exception var40) {
                    arg0.method6912(-20);
                } catch (Throwable var41) {
                    arg0.method6912(-21);
                }
            } else {
                arg0.method6912(var1.field242[var3]);
            }
        }
        arg0.method6956(var2);
        var1.method6409();
    }

    @ObfuscatedName("bq.s(III)I")
    public static int method929(int arg0, int arg1) {
        if (arg1 > arg0) {
            int var2 = arg0;
            arg0 = arg1;
            arg1 = var2;
        }
        while (arg1 != 0) {
            int var3 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var3;
        }
        return arg0;
    }

    @ObfuscatedName("el.s(II)I")
    public static int method2652(int arg0) {
        class183 var1 = class183.method2581(arg0);
        int var2 = var1.field1988;
        int var3 = var1.field1991;
        int var4 = var1.field1987;
        int var5 = class289.field3312[var4 - var3];
        return class289.field3313[var2] >> var3 & var5;
    }

    @ObfuscatedName("l.h(II)I")
    public static int method166(int arg0) {
        return class272.field3186[arg0];
    }

    @ObfuscatedName("nz.h(IS)J")
    public static long method6182(int arg0) {
        return class212.field2601[arg0];
    }

    @ObfuscatedName("pk.s(B)[Lpk;")
    public static class434[] method6797() {
        return new class434[] { class434.field4660, class434.field4654, class434.field4656 };
    }

    @ObfuscatedName("gk.s(Lls;Lls;I)V")
    public static void method3579(class316 arg0, class316 arg1) {
        field1906 = arg0;
        field1902 = arg1;
    }

    @ObfuscatedName("pk.w(Ljava/lang/Class;I)Lpk;")
    public static class434 method6793(Class arg0) {
        class434[] var1 = method6797();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class434 var3 = var1[var2];
            if (var3.field4657 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("gk.i(IIIZII)J")
    public static long method3578(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("aj.q(IB)V")
    public static void method386(int arg0) {
        class78 var1 = (class78) class78.field1001.method6695((long) arg0);
        if (var1 != null) {
            var1.method6409();
        }
    }

    @ObfuscatedName("hg.i(II)I")
    public static int method4063(int arg0) {
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

    @ObfuscatedName("fw.q(I)V")
    public static void method2957() {
        class189.field2154.method4603();
    }

    @ObfuscatedName("br.h(Lco;III)V")
    public static void method1756(class81 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1037;
        class72 var5;
        if (class442.method5852(arg0.field1035)) {
            field1747 = (class248) var3[0];
            class171 var4 = class171.method3061(field1747.field2889);
            var5 = class72.method2634(arg0.field1035, var4.field1814, var4.field1834);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class72.method93(var6);
        }
        if (var5 == null) {
            return;
        }
        field4306 = 0;
        field1369 = 0;
        int var7 = -1;
        int[] var8 = var5.field947;
        int[] var9 = var5.field952;
        byte var10 = -1;
        class64.field823 = 0;
        class64.field821 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            field819 = new int[var5.field950];
            int var13 = 0;
            field820 = new String[var5.field951];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1033;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1031;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1030 == null ? -1 : arg0.field1030.field3358;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1042;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1030 == null ? -1 : arg0.field1030.field3359;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1036 == null ? -1 : arg0.field1036.field3358;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1036 == null ? -1 : arg0.field1036.field3359;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1038;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1034;
                    }
                    field819[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1039;
                    }
                    field820[var14++] = var17;
                }
            }
            class64.field831 = arg0.field1040;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field952[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method2948(var61, var5, var48);
                    switch(var49) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var61 == 0) {
                    class64.field829[++field4306 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    class64.field829[++field4306 - 1] = class289.field3313[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class289.field3313[var19] = class64.field829[--field4306];
                    client.method5095(var19);
                } else if (var61 == 3) {
                    class64.field824[++field1369 - 1] = var5.field949[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    field4306 -= 2;
                    if (class64.field829[field4306] != class64.field829[field4306 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    field4306 -= 2;
                    if (class64.field829[field4306] == class64.field829[field4306 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    field4306 -= 2;
                    if (class64.field829[field4306] < class64.field829[field4306 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    field4306 -= 2;
                    if (class64.field829[field4306] > class64.field829[field4306 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (class64.field823 == 0) {
                        return;
                    }
                    class57 var21 = class64.field830[--class64.field823];
                    var5 = var21.field453;
                    var8 = var5.field947;
                    var9 = var5.field952;
                    var7 = var21.field450;
                    field819 = var21.field449;
                    field820 = var21.field451;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    class64.field829[++field4306 - 1] = method2652(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class289.method4085(var23, class64.field829[--field4306]);
                } else if (var61 == 31) {
                    field4306 -= 2;
                    if (class64.field829[field4306] <= class64.field829[field4306 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    field4306 -= 2;
                    if (class64.field829[field4306] >= class64.field829[field4306 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    class64.field829[++field4306 - 1] = field819[var9[var7]];
                } else if (var61 == 34) {
                    field819[var9[var7]] = class64.field829[--field4306];
                } else if (var61 == 35) {
                    class64.field824[++field1369 - 1] = field820[var9[var7]];
                } else if (var61 == 36) {
                    field820[var9[var7]] = class64.field824[--field1369];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    field1369 -= var24;
                    String var25 = class344.method1847(class64.field824, field1369, var24);
                    class64.field824[++field1369 - 1] = var25;
                } else if (var61 == 38) {
                    field4306--;
                } else if (var61 == 39) {
                    field1369--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class72 var27 = class72.method93(var26);
                    int[] var28 = new int[var27.field950];
                    String[] var29 = new String[var27.field951];
                    for (int var30 = 0; var30 < var27.field945; var30++) {
                        var28[var30] = class64.field829[field4306 - var27.field945 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field948; var31++) {
                        var29[var31] = class64.field824[field1369 - var27.field948 + var31];
                    }
                    field4306 -= var27.field945;
                    field1369 -= var27.field948;
                    class57 var32 = new class57();
                    var32.field453 = var5;
                    var32.field450 = var7;
                    var32.field449 = field819;
                    var32.field451 = field820;
                    class64.field830[++class64.field823 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field947;
                    var9 = var27.field952;
                    var7 = -1;
                    field819 = var28;
                    field820 = var29;
                } else if (var61 == 42) {
                    class64.field829[++field4306 - 1] = field4144.method2259(var9[var7]);
                } else if (var61 == 43) {
                    field4144.method2260(var9[var7], class64.field829[--field4306]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = class64.field829[--field4306];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    class64.field833[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        class64.field822[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = class64.field829[--field4306];
                    if (var39 < 0 || var39 >= class64.field833[var38]) {
                        throw new RuntimeException();
                    }
                    class64.field829[++field4306 - 1] = class64.field822[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    field4306 -= 2;
                    int var41 = class64.field829[field4306];
                    if (var41 < 0 || var41 >= class64.field833[var40]) {
                        throw new RuntimeException();
                    }
                    class64.field822[var40][var41] = class64.field829[field4306 + 1];
                } else if (var61 == 47) {
                    String var42 = field4144.method2270(var9[var7]);
                    if (var42 == null) {
                        var42 = class309.field3624;
                    }
                    class64.field824[++field1369 - 1] = var42;
                } else if (var61 == 48) {
                    field4144.method2286(var9[var7], class64.field824[--field1369]);
                } else if (var61 == 49) {
                    String var43 = field4144.method2292(var9[var7]);
                    class64.field824[++field1369 - 1] = var43;
                } else if (var61 == 50) {
                    field4144.method2262(var9[var7], class64.field824[--field1369]);
                } else if (var61 == 60) {
                    class420 var44 = var5.field954[var9[var7]];
                    class410 var45 = (class410) var44.method6668((long) class64.field829[--field4306]);
                    if (var45 != null) {
                        var7 += var45.field4467;
                    }
                } else if (var61 == 74) {
                    Integer var46 = field1327.method2675(var9[var7]);
                    if (var46 == null) {
                        class64.field829[++field4306 - 1] = -1;
                    } else {
                        class64.field829[++field4306 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = field3319.method6345(var9[var7]);
                    if (var47 == null) {
                        class64.field829[++field4306 - 1] = -1;
                    } else {
                        class64.field829[++field4306 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4468).append(" ");
            for (int var53 = class64.field823 - 1; var53 >= 0; var53--) {
                var52.append("").append(class64.field830[var53].field453.field4468).append(" ");
            }
            var52.append("").append(var10);
            class468.method566(var52.toString(), var59);
        } finally {
            while (class64.field832.size() > 0) {
                class94 var56 = (class94) class64.field832.remove(0);
                client.method5125(var56.method2230(), var56.method2222(), var56.method2228(), var56.method2223(), "");
            }
            if (class64.field821) {
                class64.field821 = false;
                client.method4480();
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class468.method566("Warning: Script " + var5.field953 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("dv.o(CI)Z")
    public static boolean method2457(char arg0) {
        return arg0 >= '0' && arg0 <= '9';
    }

    @ObfuscatedName("my.w(Ldj;FZB)F")
    public static float method5835(class118 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method2574() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1442[0].field1401;
        float var5 = (float) arg0.field1442[arg0.method2574() - 1].field1401;
        float var6 = var5 - var4;
        if ((double) var6 == 0.0D) {
            return arg0.field1442[0].field1400;
        }
        float var7 = 0.0F;
        float var8;
        if (arg1 > var5) {
            var8 = (arg1 - var5) / var6;
        } else {
            var8 = (arg1 - var4) / var6;
        }
        double var9 = (double) ((int) var8);
        float var11 = Math.abs((float) ((double) var8 - var9));
        float var12 = var6 * var11;
        double var13 = Math.abs(var9 + 1.0D);
        double var15 = var13 / 2.0D;
        double var17 = (double) ((int) var15);
        float var19 = (float) (var15 - var17);
        if (arg2) {
            if (class117.field1433 == arg0.field1440) {
                if ((double) var19 == 0.0D) {
                    var12 = var5 - var12;
                } else {
                    var12 += var4;
                }
            } else if (class117.field1429 == arg0.field1440 || class117.field1434 == arg0.field1440) {
                var12 = var5 - var12;
            } else if (class117.field1432 == arg0.field1440) {
                float var20 = var4 - arg1;
                float var21 = arg0.field1442[0].field1404;
                float var22 = arg0.field1442[0].field1402;
                float var23 = arg0.field1442[0].field1400;
                if ((double) var21 != 0.0D) {
                    var23 -= var20 * var22 / var21;
                }
                return var23;
            }
        } else if (class117.field1433 == arg0.field1450) {
            if ((double) var19 == 0.0D) {
                var12 += var4;
            } else {
                var12 = var5 - var12;
            }
        } else if (class117.field1429 == arg0.field1450 || class117.field1434 == arg0.field1450) {
            var12 += var4;
        } else if (class117.field1432 == arg0.field1450) {
            float var24 = arg1 - var5;
            float var25 = arg0.field1442[arg0.method2574() - 1].field1403;
            float var26 = arg0.field1442[arg0.method2574() - 1].field1399;
            float var27 = arg0.field1442[arg0.method2574() - 1].field1400;
            if ((double) var25 != 0.0D) {
                var27 += var24 * var26 / var25;
            }
            return var27;
        }
        float var28 = class115.method81(arg0, var12);
        if (arg2 && class117.field1434 == arg0.field1440) {
            float var29 = arg0.field1442[arg0.method2574() - 1].field1400 - arg0.field1442[0].field1400;
            var28 = (float) ((double) var28 - (double) var29 * var13);
        } else if (!arg2 && class117.field1434 == arg0.field1450) {
            float var30 = arg0.field1442[arg0.method2574() - 1].field1400 - arg0.field1442[0].field1400;
            var28 = (float) ((double) var30 * var13 + (double) var28);
        }
        return var28;
    }

    @ObfuscatedName("nk.q(IIIB)V")
    public static final void method6175(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < 8; var3++) {
            for (int var4 = 0; var4 < 8; var4++) {
                class75.field985[arg0][arg1 + var3][arg2 + var4] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class75.field985[arg0][arg1][arg2 + var5] = class75.field985[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class75.field985[arg0][arg1 + var6][arg2] = class75.field985[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && class75.field985[arg0][arg1 - 1][arg2] != 0) {
            class75.field985[arg0][arg1][arg2] = class75.field985[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && class75.field985[arg0][arg1][arg2 - 1] != 0) {
            class75.field985[arg0][arg1][arg2] = class75.field985[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && class75.field985[arg0][arg1 - 1][arg2 - 1] != 0) {
            class75.field985[arg0][arg1][arg2] = class75.field985[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @ObfuscatedName("ez.ab(Lah;B)V")
    public static final void method2762(class46 arg0) {
        arg0.field352 = false;
        if (arg0.field350 != null) {
            arg0.field350.field447 = 0;
        }
        for (class46 var1 = arg0.method582(); var1 != null; var1 = arg0.method595()) {
            method2762(var1);
        }
    }

    @ObfuscatedName("br.h(ZZI)Lqe;")
    public static class456 method1754(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? field128 : field1953) : (arg1 ? field875 : field169);
    }

    @ObfuscatedName("fw.d(I)V")
    public static void method2953() {
        class293.field3331.method4603();
    }

    @ObfuscatedName("ew.c(Ljava/lang/Float;Ljava/lang/Float;I)V")
    public static void method2747(Float arg0, Float arg1) {
        if (arg0 + class115.field1411 >= 1.3333334F) {
            Float var9 = 1.3333334F - class115.field1411;
            Float var10 = 0.33333334F - class115.field1411;
            return;
        }
        float var2 = arg0 - 2.0F;
        float var3 = arg0 - 1.0F;
        float var4 = (float) Math.sqrt((double) (var2 * var2 - var3 * 4.0F * var3));
        float var5 = (-var2 + var4) * 0.5F;
        if (arg1 + class115.field1411 > var5) {
            Float var6 = var5 - class115.field1411;
        } else {
            float var7 = (-var2 - var4) * 0.5F;
            if (arg1 < class115.field1411 + var7) {
                Float var8 = class115.field1411 + var7;
            }
        }
    }

    @ObfuscatedName("fz.w(ILbz;ZI)I")
    public static int method2948(int arg0, class72 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return class64.method4071(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return class64.method4925(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return class64.method1005(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return class64.method165(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return class64.method2740(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return class64.method1966(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return class64.method2637(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return class64.method5347(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return class64.method4088(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return class64.method1830(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return class64.method2946(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return class64.method4925(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return class64.method1005(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return class64.method165(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return class64.method2740(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return class64.method1966(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return class64.method2928(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return class64.method1858(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return class64.method2418(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return class64.method174(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return class64.method2946(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return class64.method2742(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return class64.method2666(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return class64.method5091(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return class64.method2618(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return class64.method5328(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return class64.method1764(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return class64.method289(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return class64.method2664(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return class64.method6828(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return class64.method2221(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return class64.method717(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return class64.method6178(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return class64.method1781(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return class64.method2935(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return class64.method4438(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return class64.method1845(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return class64.method4634(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return class64.method1920(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return class64.method99(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return class64.method2380(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return class64.method564(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return class64.method2668(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return class64.method6176(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return class64.method5116(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return class64.method2440(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return class64.method3005(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return class64.method3165(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return class64.method1970(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.ee(B)V")
    public static final void method1976() {
        if (field1056 != null) {
            field1056.method698();
        }
        if (field1019 != null) {
            field1019.method698();
        }
    }

    @ObfuscatedName("n.fl(Lcq;ZI)V")
    public static void method75(class85 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1993() || arg0.field1104) {
            return;
        }
        arg0.field1102 = false;
        if ((client.field480 && class97.field1301 > 50 || class97.field1301 > 200) && arg1 && arg0.field1156 == arg0.field1133) {
            arg0.field1102 = true;
        }
        int var2 = arg0.field1172 >> 7;
        int var3 = arg0.field1155 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = method3578(0, 0, 0, false, arg0.field1085);
        if (arg0.field1097 != null && client.field487 >= arg0.field1092 && client.field487 < arg0.field1107) {
            arg0.field1102 = false;
            arg0.field1091 = client.method3277(arg0.field1172, arg0.field1155, field3173);
            arg0.field1147 = client.field487;
            field69.method3721(field3173, arg0.field1172, arg0.field1155, arg0.field1091, 60, arg0, arg0.field1161, var4, arg0.field1090, arg0.field1099, arg0.field1100, arg0.field1101);
            return;
        }
        if ((arg0.field1172 & 0x7F) == 64 && (arg0.field1155 & 0x7F) == 64) {
            if (client.field586 == client.field720[var2][var3]) {
                return;
            }
            client.field720[var2][var3] = client.field586;
        }
        arg0.field1091 = client.method3277(arg0.field1172, arg0.field1155, field3173);
        arg0.field1147 = client.field487;
        field69.method3751(field3173, arg0.field1172, arg0.field1155, arg0.field1091, 60, arg0, arg0.field1161, var4, arg0.field1130);
    }

    @ObfuscatedName("el.fm(I)I")
    public static final int method2651() {
        if (field4303.method2091()) {
            return field3173;
        } else {
            int var0 = client.method3277(field89, field3180, field3173);
            return var0 - field2838 >= 800 || (class75.field972[field3173][field89 >> 7][field3180 >> 7] & 0x4) == 0 ? 3 : field3173;
        }
    }

    @ObfuscatedName("dv.bw(Lpk;I)Ljava/lang/Object;")
    public static Object method2458(class434 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field4658) {
            case 0:
                return class64.field829[--field4306];
            case 1:
                return class64.field824[--field1369];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("i.gk(ZB)V")
    public static final void method43(boolean arg0) {
        method1976();
        client.field536.field1328++;
        if (client.field536.field1328 < 50 && !arg0) {
            return;
        }
        client.field536.field1328 = 0;
        if (client.field677 || client.field536.method2328() == null) {
            return;
        }
        class265 var1 = class265.method349(class263.field2967, client.field536.field1339);
        client.field536.method2330(var1);
        try {
            client.field536.method2323();
        } catch (IOException var3) {
            client.field677 = true;
        }
    }

    @ObfuscatedName("bi.hz(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1859(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        client.method3472(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("bq.iw(Ljava/lang/String;Lkn;B)Ljava/lang/String;")
    public static String method930(String arg0, class295 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = client.method5292(arg1, var2 - 1);
                    String var6;
                    if (var5 < 999999999) {
                        var6 = Integer.toString(var5);
                    } else {
                        var6 = "*";
                    }
                    arg0 = var4 + var6 + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("hq.ir(Lkn;IIIIIII)V")
    public static final void method4244(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (client.field555) {
            client.field627 = 32;
        } else {
            client.field627 = 0;
        }
        client.field555 = false;
        if (class33.field212 == 1 || !field4383 && class33.field212 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3380 -= 4;
                client.method2620(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3380 += 4;
                client.method2620(arg0);
            } else if (arg5 >= arg1 - client.field627 && arg5 < client.field627 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3380 = (arg4 - arg3) * var8 / var9;
                client.method2620(arg0);
                client.field555 = true;
            }
        }
        if (client.field771 == 0) {
            return;
        }
        int var10 = arg0.field3373;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3380 += client.field771 * 45;
            client.method2620(arg0);
        }
    }

    @ObfuscatedName("pk.ih(IIIIIB)V")
    public static final void method6803(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1028[0].method7323(arg0, arg1);
        field1028[1].method7323(arg0, arg1 + arg3 - 16);
        class453.method7245(arg0, arg1 + 16, 16, arg3 - 32, client.field668);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class453.method7245(arg0, arg1 + 16 + var6, 16, var5, client.field625);
        class453.method7262(arg0, arg1 + 16 + var6, var5, client.field538);
        class453.method7262(arg0 + 1, arg1 + 16 + var6, var5, client.field538);
        class453.method7254(arg0, arg1 + 16 + var6, 16, client.field538);
        class453.method7254(arg0, arg1 + 17 + var6, 16, client.field538);
        class453.method7262(arg0 + 15, arg1 + 16 + var6, var5, client.field553);
        class453.method7262(arg0 + 14, arg1 + 17 + var6, var5 - 1, client.field553);
        class453.method7254(arg0, arg1 + 15 + var6 + var5, 16, client.field553);
        class453.method7254(arg0 + 1, arg1 + 14 + var6 + var5, 15, client.field553);
    }

    @ObfuscatedName("cz.ju(IB)V")
    public static final void method2329(int arg0) {
        if (!class295.method3187(arg0)) {
            return;
        }
        class295[] var1 = field4250[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class295 var3 = var1[var2];
            if (var3 != null) {
                var3.field3435 = 0;
                var3.field3497 = 0;
            }
        }
    }

    @ObfuscatedName("fm.jo(II)V")
    public static final void method3143(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        field4303.method2167(var1);
    }

    @ObfuscatedName("mp.jw(Lkn;B)V")
    public static final void method5881(class295 arg0) {
        int var1 = arg0.field3362;
        if (var1 == 324) {
            if (client.field758 == -1) {
                client.field758 = arg0.field3393;
                client.field716 = arg0.field3462;
            }
            if (client.field695.field3328) {
                arg0.field3393 = client.field758;
            } else {
                arg0.field3393 = client.field716;
            }
        } else if (var1 == 325) {
            if (client.field758 == -1) {
                client.field758 = arg0.field3393;
                client.field716 = arg0.field3462;
            }
            if (client.field695.field3328) {
                arg0.field3393 = client.field716;
            } else {
                arg0.field3393 = client.field758;
            }
        } else if (var1 == 327) {
            arg0.field3410 = 150;
            arg0.field3472 = (int) (Math.sin((double) client.field487 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3424 = 5;
            arg0.field3403 = 0;
        } else if (var1 == 328) {
            arg0.field3410 = 150;
            arg0.field3472 = (int) (Math.sin((double) client.field487 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3424 = 5;
            arg0.field3403 = 1;
        }
    }

    @ObfuscatedName("aj.ja(Lcb;ZB)V")
    public static final void method387(class80 arg0, boolean arg1) {
        int var2 = arg0.field1026;
        int var3 = (int) arg0.field4468;
        arg0.method6409();
        if (arg1 && var2 != -1 && field3349[var2]) {
            field4684.method5192(var2);
            if (field4250[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < field4250[var2].length; var5++) {
                    if (field4250[var2][var5] != null) {
                        if (field4250[var2][var5].field3360 == 2) {
                            var4 = false;
                        } else {
                            field4250[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    field4250[var2] = null;
                }
                field3349[var2] = false;
            }
        }
        client.method5107(var2);
        class295 var6 = class295.method3238(var3);
        if (var6 != null) {
            client.method2620(var6);
        }
        if (client.field650 != -1) {
            client.method4070(client.field650, 1);
        }
    }

    @ObfuscatedName("bk.js(IIIILqn;Lkl;B)V")
    public static final void method1932(int arg0, int arg1, int arg2, int arg3, class457 arg4, class288 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            client.method1927(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = client.field558 & 0x7FF;
        int var8 = class201.field2346[var7];
        int var9 = class201.field2363[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3309 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        field1050.method7370(arg5.field3309 / 2 + arg0 - var17 / 2 + var15, arg5.field3311 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("li.kx(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method5412(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (client.field662 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (client.field662 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (client.field662 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (client.field662 == 5) {
            arg0 = arg0 + "-wti";
        } else if (client.field662 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (field2013 != null) {
            var3 = "/p=" + field2013;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field1773 + "/a=" + field4766 + var3 + "/";
    }

    @ObfuscatedName("es.kt(Ljava/lang/String;ZI)V")
    public static void method2669(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < field1645; var5++) {
            class188 var6 = class188.method2231(var5);
            if ((!arg1 || var6.field2099) && var6.field2131 == -1 && var6.field2110.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    field1045 = -1;
                    field3185 = null;
                    return;
                }
                if (var4 >= var3.length) {
                    short[] var7 = new short[var3.length * 2];
                    for (int var8 = 0; var8 < var4; var8++) {
                        var7[var8] = var3[var8];
                    }
                    var3 = var7;
                }
                var3[var4++] = (short) var5;
            }
        }
        field3185 = var3;
        field3303 = 0;
        field1045 = var4;
        String[] var9 = new String[field1045];
        for (int var10 = 0; var10 < field1045; var10++) {
            var9[var10] = class188.method2231(var3[var10]).field2110;
        }
        short[] var11 = field3185;
        class441.method2647(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("bb.lg(II)Lpz;")
    public static class438 method984(int arg0) {
        class438 var1 = (class438) client.field543.method4599((long) arg0);
        if (var1 == null) {
            var1 = new class438(field4233, class440.method2761(arg0), class440.method2681(arg0));
            client.field543.method4600(var1, (long) arg0);
        }
        return var1;
    }
}
