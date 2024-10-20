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
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("j.bj")
    public static class324[] field1;

    @ObfuscatedName("i.sl")
    public static class7 field10;

    @ObfuscatedName("bl.ka")
    public static int field1005;

    @ObfuscatedName("g.fk")
    public static int field102;

    @ObfuscatedName("bx.gb")
    public static class324[] field1039;

    @ObfuscatedName("ba.hn")
    public static int field1047;

    @ObfuscatedName("ba.cs")
    public static boolean field1048;

    @ObfuscatedName("be.d")
    public static int field1070;

    @ObfuscatedName("be.q")
    public static int field1076;

    @ObfuscatedName("bc.qe")
    public static int field1080;

    @ObfuscatedName("bc.gx")
    public static byte[][] field1090;

    @ObfuscatedName("i.du")
    public static class236 field11;

    @ObfuscatedName("z.pw")
    public static class310 field112;

    @ObfuscatedName("cd.y")
    public static int[] field1130;

    @ObfuscatedName("cd.jb")
    public static class120 field1134;

    @ObfuscatedName("cf.c")
    public static class324 field1137;

    @ObfuscatedName("cj.j")
    public static boolean field1147;

    @ObfuscatedName("cj.u")
    public static class324 field1149;

    @ObfuscatedName("cj.n")
    public static class324 field1150;

    @ObfuscatedName("cj.q")
    public static class325 field1152;

    @ObfuscatedName("cj.f")
    public static class324 field1153;

    @ObfuscatedName("cj.r")
    public static class324 field1154;

    @ObfuscatedName("z.fn")
    public static class166 field117;

    @ObfuscatedName("cj.w")
    public static int field1173;

    @ObfuscatedName("cj.t")
    public static class325 field1179;

    @ObfuscatedName("cj.e")
    public static String[] field1182;

    @ObfuscatedName("i.ed")
    public static SecureRandom field12;

    @ObfuscatedName("ch.f")
    public static boolean field1243;

    @ObfuscatedName("cn.gw")
    public static byte[][] field1250;

    @ObfuscatedName("cn.gz")
    public static class324[] field1251;

    @ObfuscatedName("cr.eo")
    public static class236 field1263;

    @ObfuscatedName("cl.at")
    public static String field1269;

    @ObfuscatedName("cl.ha")
    public static int field1276;

    @ObfuscatedName("cg.u")
    public static class72[] field1284;

    @ObfuscatedName("cy.fe")
    public static int field1299;

    @ObfuscatedName("a.qc")
    public static int field130;

    @ObfuscatedName("cz.kk")
    public static int field1301;

    @ObfuscatedName("cz.y")
    public static class324 field1304;

    @ObfuscatedName("cv.cm")
    public static int field1308;

    @ObfuscatedName("cs.p")
    public static class117[] field1329;

    @ObfuscatedName("cs.h")
    public static float[] field1330;

    @ObfuscatedName("cs.v")
    public static float[] field1331;

    @ObfuscatedName("cs.t")
    public static byte[] field1335;

    @ObfuscatedName("cs.q")
    public static int field1337;

    @ObfuscatedName("cs.d")
    public static int field1338;

    @ObfuscatedName("cs.f")
    public static int field1339;

    @ObfuscatedName("cs.c")
    public static class101[] field1340;

    @ObfuscatedName("cs.r")
    public static class105[] field1341;

    @ObfuscatedName("cs.az")
    public static int[] field1342;

    @ObfuscatedName("cs.m")
    public static float[] field1344;

    @ObfuscatedName("cs.g")
    public static int[] field1345;

    @ObfuscatedName("cs.b")
    public static boolean[] field1351;

    @ObfuscatedName("cs.y")
    public static class112[] field1353;

    @ObfuscatedName("cs.o")
    public static float[] field1354;

    @ObfuscatedName("cs.av")
    public static float[] field1355;

    @ObfuscatedName("cs.am")
    public static float[] field1356;

    @ObfuscatedName("cs.ai")
    public static float[] field1357;

    @ObfuscatedName("cs.af")
    public static int[] field1358;

    @ObfuscatedName("cs.x")
    public static int field1359;

    @ObfuscatedName("dr.d")
    public static int[] field1369;

    @ObfuscatedName("dr.f")
    public static int[] field1377;

    @ObfuscatedName("dr.c")
    public static boolean[] field1379;

    @ObfuscatedName("w.md")
    public static int field138;

    @ObfuscatedName("dd.n")
    public static boolean field1381;

    @ObfuscatedName("dd.u")
    public static int field1384;

    @ObfuscatedName("da.bs")
    public static int field1415;

    @ObfuscatedName("dh.d")
    public static short[][] field1419;

    @ObfuscatedName("dh.bv")
    public static class325[] field1420;

    @ObfuscatedName("dh.df")
    public static class236 field1424;

    @ObfuscatedName("dh.f")
    public static int field1425;

    @ObfuscatedName("dh.qo")
    public static class106 field1427;

    @ObfuscatedName("w.qp")
    public static int field143;

    @ObfuscatedName("db.l")
    public static String field1440;

    @ObfuscatedName("db.bq")
    public static class324[] field1442;

    @ObfuscatedName("db.as")
    public static class319 field1444;

    @ObfuscatedName("db.a")
    public static class300 field1447;

    @ObfuscatedName("dp.q")
    public static float field1469;

    @ObfuscatedName("dp.x")
    public static int field1474;

    @ObfuscatedName("dy.ec")
    public static int field1597;

    @ObfuscatedName("dy.x")
    public static int field1599;

    @ObfuscatedName("dk.p")
    public static int[] field1610;

    @ObfuscatedName("de.nn")
    public static int field1649;

    @ObfuscatedName("h.eq")
    public static int field165;

    @ObfuscatedName("do.bh")
    public static int field1654;

    @ObfuscatedName("do.bv")
    public static int field1655;

    @ObfuscatedName("h.bp")
    public static class231 field167;

    @ObfuscatedName("h.dy")
    public static class236 field168;

    @ObfuscatedName("do.bj")
    public static int field1698;

    @ObfuscatedName("df.u")
    public static int field1724;

    @ObfuscatedName("df.n")
    public static int field1725;

    @ObfuscatedName("df.q")
    public static int field1726;

    @ObfuscatedName("df.x")
    public static int field1727;

    @ObfuscatedName("df.r")
    public static int field1728;

    @ObfuscatedName("eo.r")
    public static int field1742;

    @ObfuscatedName("eo.z")
    public static int field1744;

    @ObfuscatedName("eo.a")
    public static int field1747;

    @ObfuscatedName("v.nj")
    public static class218[] field175;

    @ObfuscatedName("eo.e")
    public static int field1754;

    @ObfuscatedName("eo.y")
    public static int field1755;

    @ObfuscatedName("eo.p")
    public static int field1756;

    @ObfuscatedName("eo.b")
    public static int field1757;

    @ObfuscatedName("eo.g")
    public static int field1759;

    @ObfuscatedName("eo.h")
    public static class140 field1764;

    @ObfuscatedName("v.jl")
    public static class67 field177;

    @ObfuscatedName("ea.bf")
    public static int field1781;

    @ObfuscatedName("ea.e")
    public static int field1786;

    @ObfuscatedName("v.ef")
    public static class236 field179;

    @ObfuscatedName("ea.a")
    public static int field1792;

    @ObfuscatedName("ea.v")
    public static int field1796;

    @ObfuscatedName("ea.g")
    public static int field1798;

    @ObfuscatedName("ea.am")
    public static int field1801;

    @ObfuscatedName("ea.l")
    public static int field1802;

    @ObfuscatedName("ea.h")
    public static int field1803;

    @ObfuscatedName("ea.z")
    public static int field1804;

    @ObfuscatedName("ea.m")
    public static int field1805;

    @ObfuscatedName("ea.o")
    public static int field1806;

    @ObfuscatedName("ea.ai")
    public static int field1809;

    @ObfuscatedName("ea.af")
    public static int field1810;

    @ObfuscatedName("ea.av")
    public static int field1812;

    @ObfuscatedName("ea.bi")
    public static int field1814;

    @ObfuscatedName("ea.w")
    public static int field1830;

    @ObfuscatedName("m.er")
    public static int field184;

    @ObfuscatedName("ea.bj")
    public static boolean[][] field1841;

    @ObfuscatedName("ea.bq")
    public static int field1842;

    @ObfuscatedName("ea.by")
    public static int field1843;

    @ObfuscatedName("ea.bs")
    public static int field1844;

    @ObfuscatedName("ea.bd")
    public static int field1847;

    @ObfuscatedName("em.gq")
    public static int[][] field1848;

    @ObfuscatedName("ey.d")
    public static class324[] field1852;

    @ObfuscatedName("ei.x")
    public static byte[][][] field1867;

    @ObfuscatedName("ee.t")
    public static class234 field1868;

    @ObfuscatedName("eq.sy")
    public static long field1891;

    @ObfuscatedName("ec.hs")
    public static int field1894;

    @ObfuscatedName("m.rj")
    public static int field191;

    @ObfuscatedName("m.qy")
    public static int field192;

    @ObfuscatedName("ej.sg")
    public static class238 field1922;

    @ObfuscatedName("ej.dg")
    public static class236 field1923;

    @ObfuscatedName("eg.q")
    public static boolean field1928;

    @ObfuscatedName("er.rb")
    public static int field1933;

    @ObfuscatedName("o.n")
    public static class234 field195;

    @ObfuscatedName("eb.t")
    public static int[] field1951;

    @ObfuscatedName("el.dz")
    public static class236 field1957;

    @ObfuscatedName("el.al")
    public static int field1958;

    @ObfuscatedName("o.dq")
    public static class236 field196;

    @ObfuscatedName("ev.fo")
    public static class293 field1965;

    @ObfuscatedName("ev.hk")
    public static int field1966;

    @ObfuscatedName("fd.gp")
    public static class325 field1974;

    @ObfuscatedName("ff.ga")
    public static class325[] field1979;

    @ObfuscatedName("o.lx")
    public static class218 field199;

    @ObfuscatedName("fv.g")
    public static class42 field1996;

    @ObfuscatedName("j.iz")
    public static int field2;

    @ObfuscatedName("o.dn")
    public static class236 field200;

    @ObfuscatedName("fg.kh")
    public static int field2005;

    @ObfuscatedName("fu.j")
    public static String field2015;

    @ObfuscatedName("o.q")
    public static boolean[] field202;

    @ObfuscatedName("fu.s")
    public static String field2021;

    @ObfuscatedName("fh.u")
    public static File field2024;

    @ObfuscatedName("fh.n")
    public static int field2032;

    @ObfuscatedName("fj.j")
    public static File field2034;

    @ObfuscatedName("fs.by")
    public static String field2038;

    @ObfuscatedName("fx.n")
    public static int field2071;

    @ObfuscatedName("fx.u")
    public static int field2074;

    @ObfuscatedName("fx.ah")
    public static int field2080;

    @ObfuscatedName("fq.da")
    public static class166 field2084;

    @ObfuscatedName("fq.fa")
    public static int field2085;

    @ObfuscatedName("gv.fs")
    public static class295 field2186;

    @ObfuscatedName("k.ay")
    public static boolean field22;

    @ObfuscatedName("am.x")
    public static int field223;

    @ObfuscatedName("am.f")
    public static class234 field224;

    @ObfuscatedName("am.dw")
    public static class236 field226;

    @ObfuscatedName("gt.ly")
    public static int field2297;

    @ObfuscatedName("go.ge")
    public static int[] field2308;

    @ObfuscatedName("gq.d")
    public static class108 field2314;

    @ObfuscatedName("ai.gl")
    public static class325[] field232;

    @ObfuscatedName("gx.q")
    public static byte[][][] field2322;

    @ObfuscatedName("gx.jy")
    public static class218 field2326;

    @ObfuscatedName("gw.t")
    public static int field2329;

    @ObfuscatedName("gw.r")
    public static class109 field2330;

    @ObfuscatedName("gk.sz")
    public static int field2339;

    @ObfuscatedName("gk.cu")
    public static class64 field2344;

    @ObfuscatedName("gm.es")
    public static int[] field2366;

    @ObfuscatedName("gc.bs")
    public static class324 field2369;

    @ObfuscatedName("gi.j")
    public static class234 field2380;

    @ObfuscatedName("gi.i")
    public static class234 field2381;

    @ObfuscatedName("gi.k")
    public static class199 field2382;

    @ObfuscatedName("gi.q")
    public static int field2384;

    @ObfuscatedName("gi.ea")
    public static class312 field2385;

    @ObfuscatedName("gi.t")
    public static int field2387;

    @ObfuscatedName("gi.s")
    public static class234 field2389;

    @ObfuscatedName("gh.ak")
    public static class319 field2467;

    @ObfuscatedName("hc.i")
    public static int field2486;

    @ObfuscatedName("hr.r")
    public static boolean field2487;

    @ObfuscatedName("hr.d")
    public static class234 field2491;

    @ObfuscatedName("he.n")
    public static byte[][][] field2493;

    @ObfuscatedName("he.s")
    public static class210 field2496;

    @ObfuscatedName("k.qt")
    public static int field25;

    @ObfuscatedName("hg.cu")
    public static char field2500;

    @ObfuscatedName("hi.gc")
    public static int field2508;

    @ObfuscatedName("hd.dc")
    public static long field2512;

    @ObfuscatedName("hd.hp")
    public static int field2514;

    @ObfuscatedName("hd.m")
    public static int[] field2516;

    @ObfuscatedName("hy.x")
    public static short[] field2524;

    @ObfuscatedName("az.fj")
    public static class295 field254;

    @ObfuscatedName("hp.t")
    public static class218[][] field2542;

    @ObfuscatedName("az.m")
    public static int field256;

    @ObfuscatedName("aj.aw")
    public static client field260;

    @ObfuscatedName("hp.c")
    public static class234 field2616;

    @ObfuscatedName("aj.di")
    public static class236 field263;

    @ObfuscatedName("an.rh")
    public static class75 field265;

    @ObfuscatedName("an.gi")
    public static class325 field267;

    @ObfuscatedName("hp.x")
    public static class234 field2673;

    @ObfuscatedName("k.f")
    public static int[] field27;

    @ObfuscatedName("at.de")
    public static class236 field270;

    @ObfuscatedName("at.gy")
    public static class325[] field271;

    @ObfuscatedName("hm.jg")
    public static class218 field2731;

    @ObfuscatedName("at.bk")
    public static String field278;

    @ObfuscatedName("at.p")
    public static class342[] field282;

    @ObfuscatedName("at.x")
    public static byte[][] field283;

    @ObfuscatedName("at.gn")
    public static int field284;

    @ObfuscatedName("as.bi")
    public static class324 field286;

    @ObfuscatedName("ak.sr")
    public static class333 field290;

    @ObfuscatedName("ho.t")
    public static int[] field3042;

    @ObfuscatedName("hl.by")
    public static class324[] field3096;

    @ObfuscatedName("hl.eh")
    public static String field3102;

    @ObfuscatedName("iy.i")
    public static long field3146;

    @ObfuscatedName("iy.j")
    public static class305 field3150;

    @ObfuscatedName("iy.y")
    public static class233 field3154;

    @ObfuscatedName("iy.b")
    public static class300 field3156;

    @ObfuscatedName("iy.lr")
    public static int field3163;

    @ObfuscatedName("ic.x")
    public static int[] field3172;

    @ObfuscatedName("iz.s")
    public static class234 field3180;

    @ObfuscatedName("in.j")
    public static int field3187;

    @ObfuscatedName("in.s")
    public static class234 field3188;

    @ObfuscatedName("iq.j")
    public static class242[] field3194;

    @ObfuscatedName("iq.i")
    public static int field3195;

    @ObfuscatedName("u.x")
    public static int[][] field32;

    @ObfuscatedName("iq.s")
    public static class234 field3213;

    @ObfuscatedName("ip.s")
    public static class234 field3216;

    @ObfuscatedName("il.s")
    public static class234 field3220;

    @ObfuscatedName("il.j")
    public static class234 field3225;

    @ObfuscatedName("il.ax")
    public static class322 field3235;

    @ObfuscatedName("ie.s")
    public static class234 field3238;

    @ObfuscatedName("au.gh")
    public static class325[] field324;

    @ObfuscatedName("if.i")
    public static int field3248;

    @ObfuscatedName("if.j")
    public static class234 field3254;

    @ObfuscatedName("if.v")
    public static int field3255;

    @ObfuscatedName("ig.j")
    public static class234 field3258;

    @ObfuscatedName("ig.s")
    public static class234 field3260;

    @ObfuscatedName("au.af")
    public static Font field327;

    @ObfuscatedName("it.qw")
    public static class113 field3274;

    @ObfuscatedName("im.s")
    public static class234 field3281;

    @ObfuscatedName("is.pk")
    public static class325 field3289;

    @ObfuscatedName("ix.s")
    public static class234 field3294;

    @ObfuscatedName("ir.s")
    public static class234 field3299;

    @ObfuscatedName("u.au")
    public static String field33;

    @ObfuscatedName("ax.b")
    public static int field331;

    @ObfuscatedName("io.s")
    public static class234 field3328;

    @ObfuscatedName("ax.dl")
    public static class236 field333;

    @ObfuscatedName("ik.j")
    public static class234 field3331;

    @ObfuscatedName("ik.i")
    public static class234 field3332;

    @ObfuscatedName("ax.hb")
    public static int field334;

    @ObfuscatedName("iu.k")
    public static class324[] field3435;

    @ObfuscatedName("ii.j")
    public static class234 field3442;

    @ObfuscatedName("ii.s")
    public static class234 field3477;

    @ObfuscatedName("iv.s")
    public static class234 field3489;

    @ObfuscatedName("ij.j")
    public static class234 field3491;

    @ObfuscatedName("ij.i")
    public static class234 field3492;

    @ObfuscatedName("n.rr")
    public static int field35;

    @ObfuscatedName("ij.bo")
    public static class230 field3508;

    @ObfuscatedName("ij.s")
    public static class234 field3510;

    @ObfuscatedName("ap.i")
    public static class234 field354;

    @ObfuscatedName("jg.dx")
    public static class236 field3541;

    @ObfuscatedName("ap.hj")
    public static int field356;

    @ObfuscatedName("ap.fp")
    public static class295 field357;

    @ObfuscatedName("jk.qz")
    public static class99 field3576;

    @ObfuscatedName("jk.d")
    public static class145 field3577;

    @ObfuscatedName("jt.c")
    public static int[] field3591;

    @ObfuscatedName("n.q")
    public static ScheduledExecutorService field36;

    @ObfuscatedName("jl.bf")
    public static class324 field3618;

    @ObfuscatedName("jl.go")
    public static int[] field3620;

    @ObfuscatedName("ks.y")
    public static class218 field3624;

    @ObfuscatedName("kq.k")
    public static File field3636;

    @ObfuscatedName("kz.h")
    public static String field3638;

    @ObfuscatedName("kz.c")
    public static class204 field3643;

    @ObfuscatedName("kz.bz")
    public static class338 field3649;

    @ObfuscatedName("kz.ix")
    public static int field3650;

    @ObfuscatedName("kz.q")
    public static short[][] field3652;

    @ObfuscatedName("kf.sx")
    public static class308 field3664;

    @ObfuscatedName("kl.d")
    public static class324[] field3676;

    @ObfuscatedName("kn.s")
    public static long field3689;

    @ObfuscatedName("kn.j")
    public static long field3690;

    @ObfuscatedName("ke.r")
    public static class218 field3694;

    @ObfuscatedName("ke.s")
    public static class234 field3696;

    @ObfuscatedName("km.w")
    public static String field3709;

    @ObfuscatedName("km.q")
    public static int[] field3714;

    @ObfuscatedName("ka.gs")
    public static class325[] field3797;

    @ObfuscatedName("lf.k")
    public static String[] field3821;

    @ObfuscatedName("lf.i")
    public static int[] field3822;

    @ObfuscatedName("lh.p")
    public static class73 field3844;

    @ObfuscatedName("lh.fv")
    public static class305 field3846;

    @ObfuscatedName("lp.e")
    public static int field3847;

    @ObfuscatedName("lj.af")
    public static int field3848;

    @ObfuscatedName("lj.ai")
    public static int field3849;

    @ObfuscatedName("lj.am")
    public static int[] field3854;

    @ObfuscatedName("ay.t")
    public static short[] field388;

    @ObfuscatedName("ld.s")
    public static int field3885;

    @ObfuscatedName("ld.k")
    public static int[] field3886;

    @ObfuscatedName("ld.u")
    public static int[] field3887;

    @ObfuscatedName("ld.i")
    public static int field3888;

    @ObfuscatedName("ld.n")
    public static int[] field3889;

    @ObfuscatedName("ay.oh")
    public static class91 field389;

    @ObfuscatedName("ld.q")
    public static int[] field3890;

    @ObfuscatedName("n.do")
    public static class236 field39;

    @ObfuscatedName("ah.c")
    public static int field390;

    @ObfuscatedName("ah.ob")
    public static class169 field391;

    @ObfuscatedName("ab.r")
    public static int[] field395;

    @ObfuscatedName("lc.k")
    public static int field4008;

    @ObfuscatedName("ly.gg")
    public static class325[] field4011;

    @ObfuscatedName("md.s")
    public static class234 field4042;

    @ObfuscatedName("mv.j")
    public static String field4044;

    @ObfuscatedName("mv.s")
    public static Applet field4045;

    @ObfuscatedName("mm.u")
    public static byte[][][] field4062;

    @ObfuscatedName("ae.x")
    public static class324 field408;

    @ObfuscatedName("ae.dt")
    public static class236 field409;

    @ObfuscatedName("bw.t")
    public static int field414;

    @ObfuscatedName("bw.c")
    public static class171 field422;

    @ObfuscatedName("bw.eg")
    public static int field426;

    @ObfuscatedName("bw.dk")
    public static class236 field440;

    @ObfuscatedName("bw.s")
    public static class167 field441;

    @ObfuscatedName("bw.ra")
    public static int field447;

    @ObfuscatedName("q.ds")
    public static class236 field47;

    @ObfuscatedName("bo.gt")
    public static int[] field471;

    @ObfuscatedName("bn.t")
    public static byte[][][] field476;

    @ObfuscatedName("bn.d")
    public static int[] field477;

    @ObfuscatedName("q.g")
    public static String[] field48;

    @ObfuscatedName("bn.p")
    public static int[][][] field484;

    @ObfuscatedName("bn.k")
    public static byte[][][] field486;

    @ObfuscatedName("bz.ej")
    public static int field497;

    @ObfuscatedName("j.kp")
    public static int field5;

    @ObfuscatedName("bz.su")
    public static short[] field500;

    @ObfuscatedName("bz.ae")
    public static int field501;

    @ObfuscatedName("bz.r")
    public static class100 field502;

    @ObfuscatedName("q.d")
    public static int field51;

    @ObfuscatedName("bh.r")
    public static class295 field515;

    @ObfuscatedName("bv.jo")
    public static int field519;

    @ObfuscatedName("bj.bj")
    public static class191 field523;

    @ObfuscatedName("bj.ng")
    public static int field532;

    @ObfuscatedName("bq.b")
    public static int field544;

    @ObfuscatedName("by.fh")
    public static class144 field558;

    @ObfuscatedName("q.ad")
    public static GarbageCollectorMXBean field56;

    @ObfuscatedName("by.hv")
    public static int field560;

    @ObfuscatedName("bs.x")
    public static int field563;

    @ObfuscatedName("bs.qs")
    public static class106 field569;

    @ObfuscatedName("bf.lw")
    public static class218 field585;

    @ObfuscatedName("bf.n")
    public static class234 field586;

    @ObfuscatedName("bf.ff")
    public static long field587;

    @ObfuscatedName("x.j")
    public static class234 field59;

    @ObfuscatedName("j.lk")
    public static class83 field6;

    @ObfuscatedName("x.ep")
    public static int field60;

    @ObfuscatedName("bd.rm")
    public static int field606;

    @ObfuscatedName("bd.gk")
    public static class134 field619;

    @ObfuscatedName("br.gd")
    public static class324[] field622;

    @ObfuscatedName("client.dh")
    public static class305 field654;

    @ObfuscatedName("d.se")
    public static class74 field69;

    @ObfuscatedName("j.bq")
    public static String field7;

    @ObfuscatedName("d.st")
    public static int field71;

    @ObfuscatedName("f.j")
    public static int field72;

    @ObfuscatedName("f.as")
    public static Image field75;

    @ObfuscatedName("y.ph")
    public static boolean field85;

    @ObfuscatedName("y.fl")
    public static int field87;

    @ObfuscatedName("client.db")
    public static class236 field875;

    @ObfuscatedName("y.u")
    public static Thread field89;

    @ObfuscatedName("client.ps")
    public static class285 field902;

    @ObfuscatedName("bu.jm")
    public static class218 field979;

    @ObfuscatedName("bb.dp")
    public static class236 field985;

    @ObfuscatedName("bb.nk")
    public static int field987;

    @ObfuscatedName("bb.az")
    public static FontMetrics field988;

    @ObfuscatedName("g.d")
    public static int field99;

    @ObfuscatedName("bl.sd")
    public static class331 field990;

    @ObfuscatedName("kr.s(I)[Lha;")
    public static class230[] method4892() {
        return new class230[] { class230.field3076, class230.field3079, class230.field3078, class230.field3077 };
    }

    @ObfuscatedName("fz.j(IIIIIII)I")
    public static int method3150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if ((arg5 & 0x1) == 1) {
            int var6 = arg3;
            arg3 = arg4;
            arg4 = var6;
        }
        int var7 = arg2 & 0x3;
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg1;
        } else if (var7 == 2) {
            return 7 - arg0 - (arg3 - 1);
        } else {
            return 7 - arg1 - (arg4 - 1);
        }
    }

    @ObfuscatedName("cl.s(Lky;Lln;I)Lln;")
    public static final class316 method2030(class300 arg0, class316 arg1) {
        int var2 = arg0.method5179();
        if (arg1 == null) {
            int var3 = var2 - 1;
            int var4 = var3 | var3 >>> 1;
            int var5 = var4 | var4 >>> 2;
            int var6 = var5 | var5 >>> 4;
            int var7 = var6 | var6 >>> 8;
            int var8 = var7 | var7 >>> 16;
            int var9 = var8 + 1;
            arg1 = new class316(var9);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            boolean var12 = arg0.method5179() == 1;
            int var13 = arg0.method5169();
            class181 var14;
            if (var12) {
                var14 = new class177(arg0.method5150());
            } else {
                var14 = new class180(arg0.method5056());
            }
            arg1.method5400(var14, (long) var13);
        }
        return arg1;
    }

    @ObfuscatedName("kr.s(Lhz;Lhz;Lhz;I)V")
    public static void method4886(class234 arg0, class234 arg1, class234 arg2) {
        field3510 = arg0;
        field3491 = arg1;
        field3492 = arg2;
    }

    @ObfuscatedName("hp.j(II)Lij;")
    public static class259 method3725(int arg0) {
        class259 var1 = (class259) class259.field3494.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3510.method3790(12, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4360(new class300(var2));
        }
        var3.method4362();
        class259.field3494.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hk.i(II)I")
    public static int method3734(int arg0) {
        long var1 = class129.field1722[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("fd.k(I)I")
    public static int method3155() {
        return ++class55.field454 - 1;
    }

    @ObfuscatedName("y.n(I)V")
    public static void method137() {
        class250.field3283.method3068();
    }

    @ObfuscatedName("bw.q(I)[Lls;")
    public static class325[] method774() {
        class325[] var0 = new class325[field3885];
        for (int var1 = 0; var1 < field3885; var1++) {
            class325 var2 = var0[var1] = new class325();
            var2.field3876 = field72;
            var2.field3873 = field3888;
            var2.field3879 = field3886[var1];
            var2.field3877 = field3887[var1];
            var2.field3878 = field3889[var1];
            var2.field3875 = field3042[var1];
            int var3 = var2.field3878 * var2.field3875;
            byte[] var4 = field283[var1];
            var2.field3874 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3874[var5] = field3890[var4[var5] & 0xFF];
            }
        }
        class326.method3139();
        return var0;
    }

    @ObfuscatedName("m.q(I)V")
    public static void method266() {
        class242.field3196.method3068();
    }

    @ObfuscatedName("bv.q(B)V")
    public static void method995() {
        class86.field1168 = class86.field1168.trim();
        if (class86.field1168.length() == 0) {
            class86.method1110(class225.field3005, class225.field3006, class225.field2919);
            return;
        }
        long var0 = class81.method1731();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = class86.field1168;
            Random var4 = new Random();
            class300 var5 = new class300(128);
            class300 var6 = new class300(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method5083(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method5166(var4.nextInt());
            }
            var5.method5166(var7[0]);
            var5.method5166(var7[1]);
            var5.method5239(var0);
            var5.method5239(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method5166(var4.nextInt());
            }
            var5.method5074(class81.field1109, class81.field1111);
            var6.method5083(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method5166(var4.nextInt());
            }
            var6.method5239(var4.nextLong());
            var6.method5040(var4.nextLong());
            client.method2605(var6);
            var6.method5239(var4.nextLong());
            var6.method5074(class81.field1109, class81.field1111);
            int var11 = class300.method4752(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class300 var12 = new class300(var11);
            var12.method5043(var3);
            var12.field3704 = var11;
            var12.method5070(var7);
            class300 var13 = new class300(var12.field3704 + var6.field3704 + var5.field3704 + 5);
            var13.method5083(2);
            var13.method5083(var5.field3704);
            var13.method5158(var5.field3701, 0, var5.field3704);
            var13.method5083(var6.field3704);
            var13.method5158(var6.field3701, 0, var6.field3704);
            var13.method5037(var12.field3704);
            var13.method5158(var12.field3701, 0, var12.field3704);
            String var14 = class290.method2720(var13.field3701);
            byte var21;
            try {
                URL var15 = new URL(client.method3295("services", false) + "m=accountappeal/login.ws");
                URLConnection var16 = var15.openConnection();
                var16.setDoInput(true);
                var16.setDoOutput(true);
                var16.setConnectTimeout(5000);
                OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream());
                var17.write("data2=" + class340.method555(var14) + "&dest=" + class340.method555("passwordchoice.ws"));
                var17.flush();
                InputStream var18 = var16.getInputStream();
                class300 var19 = new class300(new byte[1000]);
                while (true) {
                    int var20 = var18.read(var19.field3701, var19.field3704, 1000 - var19.field3704);
                    if (var20 == -1) {
                        var17.close();
                        var18.close();
                        String var22 = new String(var19.field3701);
                        if (var22.startsWith("OFFLINE")) {
                            var21 = 4;
                        } else if (var22.startsWith("WRONG")) {
                            var21 = 7;
                        } else if (var22.startsWith("RELOAD")) {
                            var21 = 3;
                        } else if (var22.startsWith("Not permitted for social network accounts.")) {
                            var21 = 6;
                        } else {
                            var19.method5071(var7);
                            while (var19.field3704 > 0 && var19.field3701[var19.field3704 - 1] == 0) {
                                var19.field3704--;
                            }
                            String var23 = new String(var19.field3701, 0, var19.field3704);
                            if (class81.method27(var23)) {
                                class52.method3044(var23, true, false);
                                var21 = 2;
                            } else {
                                var21 = 5;
                            }
                        }
                        break;
                    }
                    var19.field3704 += var20;
                    if (var19.field3704 >= 1000) {
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
                class86.method1110(class225.field3008, class225.field3009, class225.field3010);
                class86.field1163 = 6;
                break;
            case 3:
                class86.method1110(class225.field3011, class225.field3012, class225.field3007);
                break;
            case 4:
                class86.method1110(class225.field2870, class225.field3015, class225.field2901);
                break;
            case 5:
                class86.method1110(class225.field3017, class225.field3018, class225.field2994);
                break;
            case 6:
                class86.method1110(class225.field2889, class225.field3021, class225.field3022);
                break;
            case 7:
                class86.method1110(class225.field3023, class225.field3024, class225.field3025);
        }
    }

    @ObfuscatedName("ar.r(III)I")
    public static final int method547(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("cb.r(ILcr;ZI)I")
    public static int method1938(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = arg2 ? field3624 : field3694;
        if (arg0 == 1500) {
            class77.field1067[++field1076 - 1] = var3.field2560;
            return 1;
        } else if (arg0 == 1501) {
            class77.field1067[++field1076 - 1] = var3.field2561;
            return 1;
        } else if (arg0 == 1502) {
            class77.field1067[++field1076 - 1] = var3.field2562;
            return 1;
        } else if (arg0 == 1503) {
            class77.field1067[++field1076 - 1] = var3.field2563;
            return 1;
        } else if (arg0 == 1504) {
            class77.field1067[++field1076 - 1] = var3.field2567 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            class77.field1067[++field1076 - 1] = var3.field2575;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bw.z(ILcr;ZI)I")
    public static int method880(int arg0, class93 arg1, boolean arg2) {
        class218 var3 = class218.method3998(class77.field1067[--field1076]);
        if (arg0 == 2500) {
            class77.field1067[++field1076 - 1] = var3.field2560;
            return 1;
        } else if (arg0 == 2501) {
            class77.field1067[++field1076 - 1] = var3.field2561;
            return 1;
        } else if (arg0 == 2502) {
            class77.field1067[++field1076 - 1] = var3.field2562;
            return 1;
        } else if (arg0 == 2503) {
            class77.field1067[++field1076 - 1] = var3.field2563;
            return 1;
        } else if (arg0 == 2504) {
            class77.field1067[++field1076 - 1] = var3.field2567 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            class77.field1067[++field1076 - 1] = var3.field2575;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fi.fs(Ljava/lang/String;I)V")
    public static final void method3159(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            field69.field1030 = !field69.field1030;
            class74.method135();
            if (field69.field1030) {
                class92.method3602(99, "", "Roofs are now all hidden");
            } else {
                class92.method3602(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            client.field641 = !client.field641;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            client.field743 = !client.field743;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            client.field772 = !client.field772;
        }
        if (client.field793 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                field290.field3957 = !field290.field3957;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                client.field641 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                client.field641 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                client.method18();
            }
        }
        class188 var1 = class188.method1879(class184.field2239, client.field828.field1300);
        var1.field2321.method5083(arg0.length() + 1);
        var1.field2321.method5043(arg0);
        client.field828.method2049(var1);
    }

    @ObfuscatedName("h.fx(I)V")
    public static final void method250() {
        for (int var0 = 0; var0 < client.field667; var0++) {
            int var1 = client.field808[var0];
            class80 var2 = client.field746[var1];
            if (var2 != null) {
                client.method10(var2, var2.field1104.field3451);
            }
        }
    }

    @ObfuscatedName("bm.gy(ZLkx;B)V")
    public static final void method1561(boolean arg0, class299 arg1) {
        client.field683 = arg0;
        if (!client.field683) {
            int var2 = arg1.method5091();
            int var3 = arg1.method5090();
            int var4 = arg1.method5054();
            field1848 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    field1848[var5][var6] = arg1.method5056();
                }
            }
            field2308 = new int[var4];
            field471 = new int[var4];
            field3620 = new int[var4];
            field1090 = new byte[var4][];
            field1250 = new byte[var4][];
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
                        field2308[var8] = var11;
                        field471[var8] = field200.method3775("m" + var9 + "_" + var10);
                        field3620[var8] = field200.method3775("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            client.method3016(var3, var2, true);
            return;
        }
        int var12 = arg1.method5090();
        int var13 = arg1.method5091();
        boolean var14 = arg1.method5179() == 1;
        int var15 = arg1.method5054();
        arg1.method5000();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5001(1);
                    if (var19 == 1) {
                        client.field684[var16][var17][var18] = arg1.method5001(26);
                    } else {
                        client.field684[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5002();
        field1848 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                field1848[var20][var21] = arg1.method5056();
            }
        }
        field2308 = new int[var15];
        field471 = new int[var15];
        field3620 = new int[var15];
        field1090 = new byte[var15][];
        field1250 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = client.field684[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (field2308[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            field2308[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            field471[var22] = field200.method3775("m" + var31 + "_" + var32);
                            field3620[var22] = field200.method3775("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        client.method3016(var13, var12, !var14);
    }

    @ObfuscatedName("hv.he(IIIIIIIIIB)V")
    public static final void method3760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class69 var9 = null;
        for (class69 var10 = (class69) client.field879.method4480(); var10 != null; var10 = (class69) client.field879.method4491()) {
            if (var10.field910 == arg0 && var10.field903 == arg1 && var10.field909 == arg2 && var10.field906 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class69();
            var9.field910 = arg0;
            var9.field906 = arg3;
            var9.field903 = arg1;
            var9.field909 = arg2;
            client.method521(var9);
            client.field879.method4475(var9);
        }
        var9.field905 = arg4;
        var9.field912 = arg5;
        var9.field911 = arg6;
        var9.field913 = arg7;
        var9.field914 = arg8;
    }

    @ObfuscatedName("jo.ht(IIIIB)V")
    public static final void method4765(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < client.field827; var4++) {
            if (client.field834[var4] + client.field832[var4] > arg0 && client.field832[var4] < arg0 + arg2 && client.field835[var4] + client.field824[var4] > arg1 && client.field824[var4] < arg1 + arg3) {
                client.field830[var4] = true;
            }
        }
    }

    @ObfuscatedName("bm.iq(II)Z")
    public static boolean method1562(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("bv.lf(I)V")
    public static void method988() {
        if (client.field781 == 1) {
            client.field707 = true;
        }
    }
}
