package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("c.s")
    public static class130 field101;

    @ObfuscatedName("bc.dt")
    public static class275 field1107;

    @ObfuscatedName("bp.t")
    public static class277 field1120;

    @ObfuscatedName("bp.b")
    public static String field1124;

    @ObfuscatedName("be.gk")
    public static int field1134;

    @ObfuscatedName("be.x")
    public static class88 field1135;

    @ObfuscatedName("be.tu")
    public static short[] field1137;

    @ObfuscatedName("ce.q")
    public static int field1161;

    @ObfuscatedName("ce.k")
    public static int[] field1162;

    @ObfuscatedName("cf.qt")
    public static class21 field1163;

    @ObfuscatedName("cf.to")
    public static int field1165;

    @ObfuscatedName("cw.qc")
    public static boolean field1183;

    @ObfuscatedName("ci.hs")
    public static class398[] field1190;

    @ObfuscatedName("cq.da")
    public static class330 field1197;

    @ObfuscatedName("cq.h")
    public static class137 field1199;

    @ObfuscatedName("cd.np")
    public static class249[] field1225;

    @ObfuscatedName("co.o")
    public static class397 field1229;

    @ObfuscatedName("co.gd")
    public static class398[] field1230;

    @ObfuscatedName("cm.qb")
    public static boolean field1232;

    @ObfuscatedName("ch.p")
    public static class397 field1240;

    @ObfuscatedName("cy.x")
    public static class277 field1242;

    @ObfuscatedName("cp.q")
    public static class385 field1248;

    @ObfuscatedName("cs.ak")
    public static String field1249;

    @ObfuscatedName("cs.aq")
    public static FontMetrics field1250;

    @ObfuscatedName("cv.u")
    public static String[] field1254;

    @ObfuscatedName("cv.bl")
    public static class397 field1257;

    @ObfuscatedName("cg.l")
    public static int field1259;

    @ObfuscatedName("cg.gn")
    public static int[] field1263;

    @ObfuscatedName("cg.f")
    public static int field1264;

    @ObfuscatedName("cg.rv")
    public static int field1266;

    @ObfuscatedName("ck.et")
    public static SecureRandom field1267;

    @ObfuscatedName("cz.oj")
    public static class372 field1272;

    @ObfuscatedName("c.au")
    public static class337 field128;

    @ObfuscatedName("ca.f")
    public static boolean[] field1282;

    @ObfuscatedName("cc.c")
    public static class124 field1294;

    @ObfuscatedName("cc.iz")
    public static int field1295;

    @ObfuscatedName("w.al")
    public static Font field13;

    @ObfuscatedName("df.dy")
    public static class275 field1301;

    @ObfuscatedName("df.lq")
    public static class54 field1305;

    @ObfuscatedName("df.n")
    public static int[] field1308;

    @ObfuscatedName("dn.nq")
    public static int field1319;

    @ObfuscatedName("de.rd")
    public static int field1324;

    @ObfuscatedName("dc.dq")
    public static class275 field1326;

    @ObfuscatedName("i.gu")
    public static int field137;

    @ObfuscatedName("dj.ag")
    public static int field1387;

    @ObfuscatedName("du.hx")
    public static int field1398;

    @ObfuscatedName("w.ch")
    public static class69 field14;

    @ObfuscatedName("i.kq")
    public static class70 field140;

    @ObfuscatedName("dv.hv")
    public static int field1400;

    @ObfuscatedName("db.f")
    public static int[] field1407;

    @ObfuscatedName("di.du")
    public static class275 field1417;

    @ObfuscatedName("di.ch")
    public static int field1418;

    @ObfuscatedName("dq.en")
    public static int field1426;

    @ObfuscatedName("dt.x")
    public static int field1439;

    @ObfuscatedName("dt.dz")
    public static class275 field1440;

    @ObfuscatedName("dp.pp")
    public static class402 field1441;

    @ObfuscatedName("dy.ct")
    public static char field1450;

    @ObfuscatedName("dy.hp")
    public static class398[] field1452;

    @ObfuscatedName("dy.dg")
    public static class275 field1454;

    @ObfuscatedName("dl.f")
    public static int[] field1460;

    @ObfuscatedName("dz.t")
    public static String field1463;

    @ObfuscatedName("dz.fl")
    public static class302 field1468;

    @ObfuscatedName("dz.s")
    public static String field1469;

    @ObfuscatedName("eu.l")
    public static File field1475;

    @ObfuscatedName("eu.j")
    public static File field1476;

    @ObfuscatedName("ef.t")
    public static File field1482;

    @ObfuscatedName("ef.q")
    public static int field1485;

    @ObfuscatedName("ef.x")
    public static class397[] field1486;

    @ObfuscatedName("w.rs")
    public static int field15;

    @ObfuscatedName("er.bu")
    public static class397 field1520;

    @ObfuscatedName("el.di")
    public static class275 field1521;

    @ObfuscatedName("el.s")
    public static class277 field1525;

    @ObfuscatedName("eg.s")
    public static class277 field1529;

    @ObfuscatedName("ei.v")
    public static int field1532;

    @ObfuscatedName("ei.t")
    public static class141[] field1544;

    @ObfuscatedName("ei.s")
    public static class277 field1549;

    @ObfuscatedName("ep.rt")
    public static class25 field1560;

    @ObfuscatedName("ep.s")
    public static class277 field1561;

    @ObfuscatedName("ea.v")
    public static int field1564;

    @ObfuscatedName("ea.s")
    public static class277 field1565;

    @ObfuscatedName("ea.h")
    public static class28 field1576;

    @ObfuscatedName("ea.ru")
    public static int field1578;

    @ObfuscatedName("eb.t")
    public static class277 field1591;

    @ObfuscatedName("ed.gt")
    public static class398 field1594;

    @ObfuscatedName("ed.f")
    public static boolean field1595;

    @ObfuscatedName("eq.r")
    public static boolean field1598;

    @ObfuscatedName("w.a")
    public static class74 field16;

    @ObfuscatedName("eq.s")
    public static class277 field1601;

    @ObfuscatedName("eh.dm")
    public static long field1610;

    @ObfuscatedName("eh.o")
    public static int field1612;

    @ObfuscatedName("eh.bt")
    public static String field1615;

    @ObfuscatedName("ej.t")
    public static class277 field1617;

    @ObfuscatedName("ej.s")
    public static class277 field1637;

    @ObfuscatedName("ew.lj")
    public static int field1659;

    @ObfuscatedName("ew.bm")
    public static String field1661;

    @ObfuscatedName("ew.e")
    public static class115 field1669;

    @ObfuscatedName("ew.s")
    public static class277 field1675;

    @ObfuscatedName("ew.he")
    public static class398[] field1677;

    @ObfuscatedName("en.ho")
    public static class398[] field1679;

    @ObfuscatedName("en.s")
    public static class277 field1683;

    @ObfuscatedName("en.o")
    public static int field1687;

    @ObfuscatedName("ec.s")
    public static class277 field1692;

    @ObfuscatedName("ec.ah")
    public static GarbageCollectorMXBean field1694;

    @ObfuscatedName("ez.s")
    public static class277 field1698;

    @ObfuscatedName("et.s")
    public static class277 field1703;

    @ObfuscatedName("d.p")
    public static boolean[] field171;

    @ObfuscatedName("es.s")
    public static class277 field1711;

    @ObfuscatedName("es.rw")
    public static int field1714;

    @ObfuscatedName("es.v")
    public static class277 field1733;

    @ObfuscatedName("em.t")
    public static class277 field1735;

    @ObfuscatedName("em.v")
    public static class277 field1748;

    @ObfuscatedName("d.r")
    public static int[] field177;

    @ObfuscatedName("d.x")
    public static int[] field178;

    @ObfuscatedName("y.o")
    public static int field182;

    @ObfuscatedName("fw.rb")
    public static class38 field1842;

    @ObfuscatedName("y.ms")
    public static int field185;

    @ObfuscatedName("fw.s")
    public static class277 field1855;

    @ObfuscatedName("fz.t")
    public static class277 field1859;

    @ObfuscatedName("fz.v")
    public static class277 field1871;

    @ObfuscatedName("fz.s")
    public static class277 field1875;

    @ObfuscatedName("fp.n")
    public static int field1897;

    @ObfuscatedName("fc.t")
    public static class277 field1914;

    @ObfuscatedName("fc.a")
    public static int[][][] field1915;

    @ObfuscatedName("y.nk")
    public static int field192;

    @ObfuscatedName("fq.gs")
    public static class200 field1925;

    @ObfuscatedName("fv.m")
    public static int field1932;

    @ObfuscatedName("fx.ed")
    public static int field1982;

    @ObfuscatedName("y.n")
    public static boolean field199;

    @ObfuscatedName("fx.fu")
    public static class87 field1992;

    @ObfuscatedName("fm.h")
    public static class397 field2014;

    @ObfuscatedName("y.th")
    public static class359 field202;

    @ObfuscatedName("fo.sd")
    public static long field2067;

    @ObfuscatedName("fl.rf")
    public static class25 field2070;

    @ObfuscatedName("fn.jj")
    public static class205 field2077;

    @ObfuscatedName("ff.p")
    public static class240 field2080;

    @ObfuscatedName("fd.h")
    public static class33 field2087;

    @ObfuscatedName("gg.fv")
    public static long field2120;

    @ObfuscatedName("gi.er")
    public static class336 field2122;

    @ObfuscatedName("gi.bg")
    public static class398[] field2127;

    @ObfuscatedName("gh.m")
    public static String field2132;

    @ObfuscatedName("gc.eu")
    public static class275 field2139;

    @ObfuscatedName("gc.rp")
    public static int field2148;

    @ObfuscatedName("gc.db")
    public static class275 field2149;

    @ObfuscatedName("ae.n")
    public static class277 field217;

    @ObfuscatedName("ae.r")
    public static class277 field218;

    @ObfuscatedName("ae.l")
    public static int field220;

    @ObfuscatedName("go.a")
    public static int[] field2211;

    @ObfuscatedName("gs.q")
    public static int field2247;

    @ObfuscatedName("gs.i")
    public static int field2248;

    @ObfuscatedName("gs.h")
    public static int field2259;

    @ObfuscatedName("gs.k")
    public static int field2260;

    @ObfuscatedName("gs.a")
    public static int field2261;

    @ObfuscatedName("gs.u")
    public static int field2263;

    @ObfuscatedName("gs.e")
    public static int field2264;

    @ObfuscatedName("gs.c")
    public static int field2265;

    @ObfuscatedName("gs.z")
    public static class213 field2269;

    @ObfuscatedName("gj.ds")
    public static class275 field2277;

    @ObfuscatedName("gw.bw")
    public static boolean[][] field2283;

    @ObfuscatedName("gw.i")
    public static int field2288;

    @ObfuscatedName("gw.al")
    public static int field2289;

    @ObfuscatedName("gw.am")
    public static int field2291;

    @ObfuscatedName("gw.c")
    public static int field2297;

    @ObfuscatedName("gw.m")
    public static int field2299;

    @ObfuscatedName("gw.z")
    public static int field2301;

    @ObfuscatedName("gw.d")
    public static int field2302;

    @ObfuscatedName("gw.g")
    public static int field2304;

    @ObfuscatedName("gw.an")
    public static int field2306;

    @ObfuscatedName("gw.b")
    public static int field2308;

    @ObfuscatedName("gw.y")
    public static int field2324;

    @ObfuscatedName("gw.ae")
    public static int field2327;

    @ObfuscatedName("gw.u")
    public static int field2331;

    @ObfuscatedName("gw.e")
    public static int field2332;

    @ObfuscatedName("gw.bo")
    public static int field2340;

    @ObfuscatedName("gw.bm")
    public static int field2341;

    @ObfuscatedName("gw.ba")
    public static int field2342;

    @ObfuscatedName("gw.bu")
    public static int field2343;

    @ObfuscatedName("gw.bl")
    public static int field2344;

    @ObfuscatedName("gw.bj")
    public static int field2345;

    @ObfuscatedName("gf.br")
    public static class265 field2350;

    @ObfuscatedName("gl.bd")
    public static int field2462;

    @ObfuscatedName("gl.bg")
    public static int field2463;

    @ObfuscatedName("gl.bw")
    public static int field2464;

    @ObfuscatedName("gd.mg")
    public static int field2474;

    @ObfuscatedName("gd.l")
    public static int field2478;

    @ObfuscatedName("gd.n")
    public static int field2479;

    @ObfuscatedName("gd.f")
    public static int field2480;

    @ObfuscatedName("gd.o")
    public static int field2481;

    @ObfuscatedName("gd.x")
    public static int field2482;

    @ObfuscatedName("gd.h")
    public static int field2483;

    @ObfuscatedName("hf.p")
    public static short[][] field2499;

    @ObfuscatedName("hs.x")
    public static class27 field2518;

    @ObfuscatedName("hs.tr")
    public static int field2520;

    @ObfuscatedName("hl.rq")
    public static int field2546;

    @ObfuscatedName("hl.ey")
    public static int field2549;

    @ObfuscatedName("f.r")
    public static short[] field26;

    @ObfuscatedName("hx.fs")
    public static class360 field2602;

    @ObfuscatedName("au.al")
    public static int[] field267;

    @ObfuscatedName("hx.gp")
    public static byte[][] field2673;

    @ObfuscatedName("hv.i")
    public static int field2674;

    @ObfuscatedName("au.aq")
    public static int[] field268;

    @ObfuscatedName("f.gr")
    public static int field27;

    @ObfuscatedName("au.k")
    public static class29[] field270;

    @ObfuscatedName("au.f")
    public static int field272;

    @ObfuscatedName("au.x")
    public static int field274;

    @ObfuscatedName("au.r")
    public static int field275;

    @ObfuscatedName("au.p")
    public static class34[] field276;

    @ObfuscatedName("au.h")
    public static class24[] field277;

    @ObfuscatedName("au.am")
    public static float[] field278;

    @ObfuscatedName("hi.sf")
    public static class356 field2789;

    @ObfuscatedName("au.a")
    public static class32[] field279;

    @ObfuscatedName("au.o")
    public static int field280;

    @ObfuscatedName("au.u")
    public static int[] field281;

    @ObfuscatedName("ix.t")
    public static class277 field2815;

    @ObfuscatedName("ix.j")
    public static class236 field2816;

    @ObfuscatedName("ix.v")
    public static class277 field2817;

    @ObfuscatedName("ix.s")
    public static class277 field2818;

    @ObfuscatedName("au.q")
    public static boolean[] field282;

    @ObfuscatedName("ix.n")
    public static class277 field2820;

    @ObfuscatedName("ix.gc")
    public static int[] field2821;

    @ObfuscatedName("ix.w")
    public static int field2822;

    @ObfuscatedName("ix.z")
    public static String field2823;

    @ObfuscatedName("iv.ba")
    public static class397 field2847;

    @ObfuscatedName("au.z")
    public static float[] field287;

    @ObfuscatedName("it.dr")
    public static class136 field2879;

    @ObfuscatedName("au.w")
    public static byte[] field288;

    @ObfuscatedName("au.y")
    public static float[] field289;

    @ObfuscatedName("au.g")
    public static float[] field290;

    @ObfuscatedName("au.ae")
    public static float[] field291;

    @ObfuscatedName("in.x")
    public static short[][] field2915;

    @ObfuscatedName("in.eb")
    public static String field2918;

    @ObfuscatedName("au.an")
    public static float[] field292;

    @ObfuscatedName("ij.lo")
    public static class249 field2923;

    @ObfuscatedName("au.d")
    public static float[] field295;

    @ObfuscatedName("io.o")
    public static class277 field2951;

    @ObfuscatedName("ao.ef")
    public static class275 field302;

    @ObfuscatedName("io.w")
    public static class249[][] field3039;

    @ObfuscatedName("ao.dh")
    public static class275 field307;

    @ObfuscatedName("ao.si")
    public static class76 field308;

    @ObfuscatedName("ik.hh")
    public static class397[] field3107;

    @ObfuscatedName("ao.oo")
    public static class84 field311;

    @ObfuscatedName("ie.gz")
    public static int[] field3110;

    @ObfuscatedName("ie.f")
    public static byte[][][] field3114;

    @ObfuscatedName("ia.s")
    public static class251 field3117;

    @ObfuscatedName("az.f")
    public static float field312;

    @ObfuscatedName("is.e")
    public static String[] field3127;

    @ObfuscatedName("ib.ap")
    public static boolean field3128;

    @ObfuscatedName("iz.p")
    public static int[] field3138;

    @ObfuscatedName("ip.fo")
    public static class302 field3165;

    @ObfuscatedName("im.f")
    public static int field3167;

    @ObfuscatedName("jn.aj")
    public static class395 field3194;

    @ObfuscatedName("az.o")
    public static int field320;

    @ObfuscatedName("jr.hf")
    public static class398[] field3211;

    @ObfuscatedName("jr.fa")
    public static class136 field3214;

    @ObfuscatedName("jq.ro")
    public static int field3398;

    @ObfuscatedName("jo.il")
    public static int field3533;

    @ObfuscatedName("jo.dp")
    public static class275 field3536;

    @ObfuscatedName("at.qj")
    public static class115 field355;

    @ObfuscatedName("ji.iu")
    public static int field3553;

    @ObfuscatedName("jd.n")
    public static Thread field3560;

    @ObfuscatedName("at.es")
    public static int[] field357;

    @ObfuscatedName("jm.gl")
    public static class397[] field3575;

    @ObfuscatedName("jb.k")
    public static class276 field3595;

    @ObfuscatedName("jb.v")
    public static long field3597;

    @ObfuscatedName("jb.i")
    public static class385 field3603;

    @ObfuscatedName("jb.t")
    public static class330 field3614;

    @ObfuscatedName("jl.ge")
    public static int field3625;

    @ObfuscatedName("jl.s")
    public static long field3626;

    @ObfuscatedName("jl.w")
    public static int field3629;

    @ObfuscatedName("ju.t")
    public static int field3631;

    @ObfuscatedName("ju.l")
    public static int field3634;

    @ObfuscatedName("jg.o")
    public static short[] field3635;

    @ObfuscatedName("jg.aw")
    public static int field3640;

    @ObfuscatedName("jx.bw")
    public static class292 field3644;

    @ObfuscatedName("jj.kr")
    public static int field3652;

    @ObfuscatedName("jk.u")
    public static class249 field3660;

    @ObfuscatedName("kn.od")
    public static class372 field3664;

    @ObfuscatedName("kl.eh")
    public static int field3679;

    @ObfuscatedName("kq.dv")
    public static class275 field3693;

    @ObfuscatedName("kq.gf")
    public static int field3695;

    @ObfuscatedName("kj.lh")
    public static class249 field3699;

    @ObfuscatedName("ar.go")
    public static int[][] field370;

    @ObfuscatedName("kj.st")
    public static class279 field3711;

    @ObfuscatedName("kj.ej")
    public static int field3714;

    @ObfuscatedName("ar.oc")
    public static class340 field372;

    @ObfuscatedName("ar.r")
    public static int field373;

    @ObfuscatedName("kb.x")
    public static class397[] field3741;

    @ObfuscatedName("ar.o")
    public static int[] field376;

    @ObfuscatedName("kx.l")
    public static class397 field3760;

    @ObfuscatedName("ka.sc")
    public static class334 field3766;

    @ObfuscatedName("ka.av")
    public static class337 field3767;

    @ObfuscatedName("kp.w")
    public static int[] field3774;

    @ObfuscatedName("kp.o")
    public static byte[][][] field3775;

    @ObfuscatedName("kp.bo")
    public static String field3776;

    @ObfuscatedName("kg.dn")
    public static boolean field3777;

    @ObfuscatedName("lf.a")
    public static class370[] field3840;

    @ObfuscatedName("lc.qo")
    public static class124 field3845;

    @ObfuscatedName("lg.ev")
    public static class275 field3848;

    @ObfuscatedName("ly.n")
    public static int[] field3854;

    @ObfuscatedName("ay.ha")
    public static class397[] field386;

    @ObfuscatedName("lr.e")
    public static int field3864;

    @ObfuscatedName("lr.ew")
    public static int field3870;

    @ObfuscatedName("lp.rz")
    public static int field3875;

    @ObfuscatedName("lx.z")
    public static class191 field3879;

    @ObfuscatedName("le.y")
    public static int[] field3897;

    @ObfuscatedName("ln.f")
    public static ScheduledExecutorService field3903;

    @ObfuscatedName("lk.lu")
    public static int field3907;

    @ObfuscatedName("ap.dd")
    public static class275 field391;

    @ObfuscatedName("ap.bo")
    public static class397[] field392;

    @ObfuscatedName("lq.k")
    public static class397 field3920;

    @ObfuscatedName("lo.hu")
    public static int field3924;

    @ObfuscatedName("lh.h")
    public static int[] field3926;

    @ObfuscatedName("ma.w")
    public static class277 field3935;

    @ObfuscatedName("ma.j")
    public static byte[][][] field3937;

    @ObfuscatedName("ma.dl")
    public static class275 field3938;

    @ObfuscatedName("ah.r")
    public static class397 field397;

    @ObfuscatedName("ah.fk")
    public static class302 field398;

    @ObfuscatedName("t.h")
    public static int field4;

    @ObfuscatedName("mz.gq")
    public static byte[][] field4011;

    @ObfuscatedName("mp.hm")
    public static int field4012;

    @ObfuscatedName("r.mm")
    public static int field41;

    @ObfuscatedName("nt.tx")
    public static class288 field4128;

    @ObfuscatedName("nz.w")
    public static int[] field4156;

    @ObfuscatedName("ni.rk")
    public static int field4166;

    @ObfuscatedName("ni.qz")
    public static class398 field4167;

    @ObfuscatedName("nw.t")
    public static long field4174;

    @ObfuscatedName("oz.am")
    public static int field4245;

    @ObfuscatedName("oz.al")
    public static int field4246;

    @ObfuscatedName("oz.an")
    public static int[] field4250;

    @ObfuscatedName("ou.p")
    public static int field4260;

    @ObfuscatedName("os.t")
    public static int field4281;

    @ObfuscatedName("os.s")
    public static int field4282;

    @ObfuscatedName("os.o")
    public static byte[][] field4283;

    @ObfuscatedName("os.j")
    public static int[] field4284;

    @ObfuscatedName("os.l")
    public static int[] field4285;

    @ObfuscatedName("os.v")
    public static int field4286;

    @ObfuscatedName("ol.t")
    public static class277 field4313;

    @ObfuscatedName("ow.ba")
    public static int field4314;

    @ObfuscatedName("oa.v")
    public static String field4316;

    @ObfuscatedName("oa.j")
    public static int field4317;

    @ObfuscatedName("oa.s")
    public static Applet field4318;

    @ObfuscatedName("client.jy")
    public static class249 field515;

    @ObfuscatedName("client.fx")
    public static class330 field645;

    @ObfuscatedName("r.if")
    public static int field66;

    @ObfuscatedName("client.d")
    public static int field687;

    @ObfuscatedName("client.jm")
    public static class249 field688;

    @ObfuscatedName("p.la")
    public static int field69;

    @ObfuscatedName("l.eq")
    public static int field7;

    @ObfuscatedName("ag.ax")
    public static String field704;

    @ObfuscatedName("ag.ai")
    public static int field705;

    @ObfuscatedName("p.n")
    public static int field71;

    @ObfuscatedName("p.s")
    public static class277 field72;

    @ObfuscatedName("ad.gm")
    public static class398 field736;

    @ObfuscatedName("ac.w")
    public static String[] field742;

    @ObfuscatedName("ac.r")
    public static int field746;

    @ObfuscatedName("ac.q")
    public static class249 field750;

    @ObfuscatedName("aw.bf")
    public static class367 field761;

    @ObfuscatedName("aw.bw")
    public static class397[] field770;

    @ObfuscatedName("aw.ld")
    public static int field772;

    @ObfuscatedName("h.ji")
    public static class249 field78;

    @ObfuscatedName("bk.x")
    public static int[] field788;

    @ObfuscatedName("h.oh")
    public static class132 field79;

    @ObfuscatedName("br.au")
    public static Image field795;

    @ObfuscatedName("by.j")
    public static class397[] field797;

    @ObfuscatedName("by.t")
    public static boolean field798;

    @ObfuscatedName("h.ss")
    public static class49 field80;

    @ObfuscatedName("by.n")
    public static class397 field801;

    @ObfuscatedName("by.f")
    public static class398 field803;

    @ObfuscatedName("by.w")
    public static class398 field815;

    @ObfuscatedName("by.p")
    public static class277 field831;

    @ObfuscatedName("q.ek")
    public static class275 field85;

    @ObfuscatedName("bf.ga")
    public static int field859;

    @ObfuscatedName("q.l")
    public static class48[] field86;

    @ObfuscatedName("bd.ac")
    public static client field874;

    @ObfuscatedName("bd.h")
    public static boolean field878;

    @ObfuscatedName("bw.l")
    public static byte[][][] field895;

    @ObfuscatedName("bw.bm")
    public static class397[] field897;

    @ObfuscatedName("bo.r")
    public static int[] field903;

    @ObfuscatedName("bo.o")
    public static int[][] field905;

    @ObfuscatedName("bo.w")
    public static byte[][][] field910;

    @ObfuscatedName("bo.ix")
    public static int field912;

    @ObfuscatedName("bo.n")
    public static byte[][][] field916;

    @ObfuscatedName("bo.eo")
    public static class275 field917;

    @ObfuscatedName("ba.h")
    public static class302 field928;

    @ObfuscatedName("bu.hz")
    public static int field934;

    @ObfuscatedName("c.ex")
    public static class275 field96;

    @ObfuscatedName("bn.z")
    public static int field971;

    @ObfuscatedName("bn.qu")
    public static class320 field972;

    @ObfuscatedName("bn.bv")
    public static class266 field976;

    @ObfuscatedName("bn.nw")
    public static int field977;

    @ObfuscatedName("cx.s(Lie;I)V")
    public static void method2112(class251 arg0) {
        field3117 = arg0;
    }

    @ObfuscatedName("hh.s(I)[Lhv;")
    public static class228[] method3890() {
        return new class228[] { class228.field2680, class228.field2676, class228.field2679, class228.field2677, class228.field2678, class228.field2681, class228.field2675, class228.field2684, class228.field2682, class228.field2683 };
    }

    @ObfuscatedName("cy.t(IIS)I")
    public static int method2063(int arg0, int arg1) {
        class65 var2 = (class65) class65.field935.method5756((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field932.length) {
            return var2.field932[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("ef.s(Ljy;III)[Lof;")
    public static class397[] method2333(class277 arg0, int arg1, int arg2) {
        if (!class399.method4656(arg0, arg1, arg2)) {
            return null;
        }
        class397[] var3 = new class397[field4282];
        for (int var4 = 0; var4 < field4282; var4++) {
            class397 var5 = var3[var4] = new class397();
            var5.field4267 = field4281;
            var5.field4268 = field4286;
            var5.field4265 = field4284[var4];
            var5.field4266 = field4285[var4];
            var5.field4263 = field1308[var4];
            var5.field4264 = field4156[var4];
            var5.field4261 = field1407;
            var5.field4262 = field4283[var4];
        }
        field4284 = null;
        field4285 = null;
        field1308 = null;
        field4156 = null;
        field1407 = null;
        field4283 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("el.t(Ljava/lang/String;ZZB)V")
    public static void method2388(String arg0, boolean arg1, boolean arg2) {
        class17.method782(arg0, arg1, "openjs", arg2);
    }

    @ObfuscatedName("ik.t(Ljava/lang/CharSequence;I)Z")
    public static boolean method4323(CharSequence arg0) {
        return class306.method486(arg0, 10, true);
    }

    @ObfuscatedName("ha.s(Ljava/lang/String;Ljava/lang/String;III)V")
    public static void method3886(String arg0, String arg1, int arg2, int arg3) throws IOException {
        field71 = arg3;
        field1161 = arg2;
        try {
            field1124 = System.getProperty("os.name");
        } catch (Exception var22) {
            field1124 = "Unknown";
        }
        field2132 = field1124.toLowerCase();
        try {
            field2823 = System.getProperty("user.home");
            if (field2823 != null) {
                field2823 = field2823 + "/";
            }
        } catch (Exception var21) {
        }
        try {
            if (field2132.startsWith("win")) {
                if (field2823 == null) {
                    field2823 = System.getenv("USERPROFILE");
                }
            } else if (field2823 == null) {
                field2823 = System.getenv("HOME");
            }
            if (field2823 != null) {
                field2823 = field2823 + "/";
            }
        } catch (Exception var20) {
        }
        if (field2823 == null) {
            field2823 = "~/";
        }
        field1254 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2823, "/tmp/", "" };
        field3127 = new String[] { ".jagex_cache_" + field1161, ".file_store_" + field1161 };
        int var7 = 0;
        label115: while (var7 < 4) {
            field1475 = class131.method121(arg0, arg1, var7);
            if (!field1475.exists()) {
                field1475.mkdirs();
            }
            File[] var8 = field1475.listFiles();
            if (var8 == null) {
                break;
            }
            File[] var9 = var8;
            int var10 = 0;
            while (true) {
                if (var10 >= var9.length) {
                    break label115;
                }
                File var11 = var9[var10];
                if (!class131.method1556(var11, false)) {
                    var7++;
                    break;
                }
                var10++;
            }
        }
        class133.method3959(field1475);
        try {
            File var12 = new File(field2823, "random.dat");
            if (var12.exists()) {
                class131.field1471 = new class370(new class369(var12, "rw", 25L), 24, 0);
            } else {
                label97: for (int var13 = 0; var13 < field3127.length; var13++) {
                    for (int var14 = 0; var14 < field1254.length; var14++) {
                        File var15 = new File(field1254[var14] + field3127[var13] + File.separatorChar + "random.dat");
                        if (var15.exists()) {
                            class131.field1471 = new class370(new class369(var15, "rw", 25L), 24, 0);
                            break label97;
                        }
                    }
                }
            }
            if (class131.field1471 == null) {
                RandomAccessFile var16 = new RandomAccessFile(var12, "rw");
                int var17 = var16.read();
                var16.seek(0L);
                var16.write(var17);
                var16.seek(0L);
                var16.close();
                class131.field1471 = new class370(new class369(var12, "rw", 25L), 24, 0);
            }
        } catch (IOException var23) {
        }
        class131.field1477 = new class370(new class369(class133.method1679("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
        class131.field1479 = new class370(new class369(class133.method1679("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
        field3840 = new class370[field71];
        for (int var19 = 0; var19 < field71; var19++) {
            field3840[var19] = new class370(new class369(class133.method1679("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
        }
    }

    @ObfuscatedName("eg.j(IIIII)V")
    public static void method2405(int arg0, int arg1, int arg2, int arg3) {
        class65 var4 = (class65) class65.field935.method5756((long) arg0);
        if (var4 == null) {
            var4 = new class65();
            class65.field935.method5747(var4, (long) arg0);
        }
        if (var4.field931.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field931.length; var7++) {
                var5[var7] = var4.field931[var7];
                var6[var7] = var4.field932[var7];
            }
            for (int var8 = var4.field931.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field931 = var5;
            var4.field932 = var6;
        }
        var4.field931[arg1] = arg2;
        var4.field932[arg1] = arg3;
    }

    @ObfuscatedName("ba.b(IZII)V")
    public static final void method1688(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        field3634 = arg0;
        field199 = arg1;
        field182 = arg2;
    }

    @ObfuscatedName("ap.j(J)I")
    public static int method816(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ly.v(Ljava/lang/CharSequence;I)Ljava/lang/String;")
    public static String method5219(CharSequence arg0) {
        String var1 = class308.method1952(class308.method4654(arg0));
        if (var1 == null) {
            var1 = "";
        }
        return var1;
    }

    @ObfuscatedName("i.f(I)V")
    public static void method345() {
        Iterator var0 = class85.field1194.iterator();
        while (var0.hasNext()) {
            class45 var1 = (class45) var0.next();
            var1.method797();
        }
    }

    @ObfuscatedName("ga.n(II)V")
    public static void method3731(int arg0) {
        class65 var1 = (class65) class65.field935.method5756((long) arg0);
        if (var1 != null) {
            var1.method5447();
        }
    }

    @ObfuscatedName("io.t(I)V")
    public static void method4297() {
        Object var0 = class274.field3559;
        synchronized (class274.field3559) {
            if (class274.field3557 != 0) {
                class274.field3557 = 1;
                try {
                    class274.field3559.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }

    @ObfuscatedName("ox.n(B)V")
    public static void method6339() {
        class150.field1660.method3930();
        class150.field1662.method3930();
    }

    @ObfuscatedName("kj.n([BIIB)Ljava/lang/String;")
    public static String method4687(byte[] arg0, int arg1, int arg2) {
        char[] var3 = new char[arg2];
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var6 = arg0[arg1 + var5] & 0xFF;
            if (var6 != 0) {
                if (var6 >= 128 && var6 < 160) {
                    char var7 = class304.field3755[var6 - 128];
                    if (var7 == 0) {
                        var7 = '?';
                    }
                    var6 = var7;
                }
                var3[var4++] = (char) var6;
            }
        }
        return new String(var3, 0, var4);
    }

    @ObfuscatedName("bf.n(Lag;Lag;IZIZB)I")
    public static int method1622(class48 arg0, class48 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method2376(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method2376(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("er.w(Lag;Lag;IZI)I")
    public static int method2376(class48 arg0, class48 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field699;
            int var5 = arg1.field699;
            if (!arg3) {
                if (var4 == -1) {
                    var4 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var4 - var5;
        } else if (arg2 == 2) {
            return arg0.field702 - arg1.field702;
        } else if (arg2 == 3) {
            if (arg0.field690.equals("-")) {
                if (arg1.field690.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field690.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field690.compareTo(arg1.field690);
            }
        } else if (arg2 == 4) {
            return arg0.method1299() ? (arg1.method1299() ? 0 : 1) : (arg1.method1299() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1297() ? (arg1.method1297() ? 0 : 1) : (arg1.method1297() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1298() ? (arg1.method1298() ? 0 : 1) : (arg1.method1298() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1296() ? (arg1.method1296() ? 0 : 1) : (arg1.method1296() ? -1 : 0);
        } else {
            return arg0.field697 - arg1.field697;
        }
    }

    @ObfuscatedName("ah.o(IIIII)I")
    public static final int method826(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class198.field2273[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("ce.ab(Lem;I)Z")
    public static boolean method1894(class156 arg0) {
        if (arg0.field1762 != null) {
            int[] var1 = arg0.field1762;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class156 var4 = class156.method2267(var3);
                if (var4.field1763 != -1) {
                    return true;
                }
            }
        } else if (arg0.field1763 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("fo.n(CI)Z")
    public static boolean method3258(char arg0) {
        for (int var1 = 0; var1 < class56.field811.length(); var1++) {
            if (arg0 == class56.field811.charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("kj.f(I)V")
    public static void method4681() {
        class56.field809 = class56.field809.trim();
        if (class56.field809.length() == 0) {
            class56.method1294(class270.field3514, class270.field3494, class270.field3495);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method2055("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class385 var4 = new class385(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field4184, var4.field4182, 1000 - var4.field4182);
                if (var5 == -1) {
                    var4.field4182 = 0;
                    long var8 = var4.method5964();
                    var6 = var8;
                    break;
                }
                var4.field4182 += var5;
                if (var4.field4182 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var14) {
            var6 = 0L;
        }
        int var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            var13 = class53.method1292(var6, class56.field809);
        }
        switch(var13) {
            case 2:
                class56.method1294(class270.field3496, class270.field3355, class270.field3320);
                class56.field812 = 6;
                break;
            case 3:
                class56.method1294(class270.field3499, class270.field3500, class270.field3501);
                break;
            case 4:
                class56.method1294(class270.field3396, class270.field3503, class270.field3446);
                break;
            case 5:
                class56.method1294(class270.field3233, class270.field3506, class270.field3507);
                break;
            case 6:
                class56.method1294(class270.field3508, class270.field3375, class270.field3330);
                break;
            case 7:
                class56.method1294(class270.field3242, class270.field3512, class270.field3513);
        }
    }

    @ObfuscatedName("mt.av(ILbd;ZB)I")
    public static int method5703(int arg0, class59 arg1, boolean arg2) {
        if (arg0 == 5504) {
            field746 -= 2;
            int var3 = class51.field747[field746];
            int var4 = class51.field747[field746 + 1];
            if (!client.field615) {
                client.field476 = var3;
                client.field445 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            class51.field747[++field746 - 1] = client.field476;
            return 1;
        } else if (arg0 == 5506) {
            class51.field747[++field746 - 1] = client.field445;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = class51.field747[--field746];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field483 = var5;
            return 1;
        } else if (arg0 == 5531) {
            class51.field747[++field746 - 1] = client.field483;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gq.ad(ILij;ZI)V")
    public static void method3453(int arg0, class245 arg1, boolean arg2) {
        class168 var3 = client.method3288().method5521(arg0);
        int var4 = field140.field999;
        int var5 = (field140.field1069 >> 7) + field3625;
        int var6 = (field140.field1059 >> 7) + field1134;
        class245 var7 = new class245(var4, var5, var6);
        client.method3288().method5509(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("dq.hs(IIIB)I")
    public static final int method2240(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field901[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field911[var5][var3][var4] + class62.field911[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field911[var5][var3][var4 + 1] + class62.field911[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("an.ic(Lbk;III)V")
    public static final void method518(class54 arg0, int arg1, int arg2) {
        client.method2238(arg0.field791, arg0.field787, arg0.field786, arg0.field789, arg0.field790, arg0.field790, arg1, arg2);
    }

    @ObfuscatedName("r.ja(II)Ljava/lang/String;")
    public static final String method79(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("kv.ju(IB)V")
    public static final void method5110(int arg0) {
        if (!class249.method4333(arg0)) {
            return;
        }
        class249[] var1 = field3039[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class249 var3 = var1[var2];
            if (var3 != null) {
                var3.field3094 = 0;
                var3.field3090 = 0;
            }
        }
    }

    @ObfuscatedName("ep.jg([Lio;II)V")
    public static final void method2442(class249[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class249 var3 = arg0[var2];
            if (var3 != null && var3.field3001 == arg1 && (!var3.field2993 || !client.method2574(var3))) {
                if (var3.field2977 == 0) {
                    if (!var3.field2993 && client.method2574(var3) && field2923 != var3) {
                        continue;
                    }
                    method2442(arg0, var3.field2958);
                    if (var3.field3061 != null) {
                        method2442(var3.field3061, var3.field2958);
                    }
                    class67 var4 = (class67) client.field569.method5756((long) var3.field2958);
                    if (var4 != null) {
                        int var5 = var4.field950;
                        if (class249.method4333(var5)) {
                            method2442(field3039[var5], -1);
                        }
                    }
                }
                if (var3.field2977 == 6) {
                    if (var3.field3005 != -1 || var3.field3048 != -1) {
                        boolean var6 = client.method2490(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3048;
                        } else {
                            var7 = var3.field3005;
                        }
                        if (var7 != -1) {
                            class159 var8 = class159.method1334(var7);
                            var3.field3090 += client.field556;
                            while (var3.field3090 > var8.field1865[var3.field3094]) {
                                var3.field3090 -= var8.field1865[var3.field3094];
                                var3.field3094++;
                                if (var3.field3094 >= var8.field1863.length) {
                                    var3.field3094 -= var8.field1862;
                                    if (var3.field3094 < 0 || var3.field3094 >= var8.field1863.length) {
                                        var3.field3094 = 0;
                                    }
                                }
                                client.method1893(var3);
                            }
                        }
                    }
                    if (var3.field3014 != 0 && !var3.field2993) {
                        int var9 = var3.field3014 >> 16;
                        int var10 = var3.field3014 << 16 >> 16;
                        int var11 = client.field556 * var9;
                        int var12 = client.field556 * var10;
                        var3.field3009 = var3.field3009 + var11 & 0x7FF;
                        var3.field3010 = var3.field3010 + var12 & 0x7FF;
                        client.method1893(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fp.kq(Lbj;ZI)V")
    public static final void method2891(class67 arg0, boolean arg1) {
        int var2 = arg0.field950;
        int var3 = (int) arg0.field3966;
        arg0.method5447();
        if (arg1) {
            class249.method16(var2);
        }
        client.method1336(var2);
        class249 var4 = class249.method2019(var3);
        if (var4 != null) {
            client.method1893(var4);
        }
        for (int var5 = 0; var5 < client.field545; var5++) {
            if (client.method500(client.field548[var5])) {
                if (var5 < client.field545 - 1) {
                    for (int var6 = var5; var6 < client.field545 - 1; var6++) {
                        client.field485[var6] = client.field485[var6 + 1];
                        client.field551[var6] = client.field551[var6 + 1];
                        client.field548[var6] = client.field548[var6 + 1];
                        client.field549[var6] = client.field549[var6 + 1];
                        client.field678[var6] = client.field678[var6 + 1];
                        client.field547[var6] = client.field547[var6 + 1];
                        client.field674[var6] = client.field674[var6 + 1];
                    }
                }
                var5--;
                client.field545--;
            }
        }
        client.method1620();
        if (client.field568 != -1) {
            client.method2893(client.field568, 1);
        }
    }

    @ObfuscatedName("ez.kh(I)V")
    public static final void method2592() {
        for (int var0 = 0; var0 < class83.field1172; var0++) {
            class70 var1 = client.field524[class83.field1178[var0]];
            var1.method1729();
        }
    }

    @ObfuscatedName("es.lr(I)V")
    public static void method2662() {
        if (field4128 == null) {
            return;
        }
        client.field680 = client.field452;
        field4128.method4636();
        for (int var0 = 0; var0 < client.field524.length; var0++) {
            if (client.field524[var0] != null) {
                field4128.method4635((client.field524[var0].field1069 >> 7) + field3625, (client.field524[var0].field1059 >> 7) + field1134);
            }
        }
    }
}
