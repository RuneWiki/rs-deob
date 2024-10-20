package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.security.SecureRandom;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

public class Statics {

    @ObfuscatedName("cc.bw")
    public static int field1000;

    @ObfuscatedName("cu.z")
    public static class396 field1003;

    @ObfuscatedName("cu.y")
    public static class396[] field1004;

    @ObfuscatedName("cu.k")
    public static class396 field1006;

    @ObfuscatedName("cu.d")
    public static class55 field1008;

    @ObfuscatedName("cu.e")
    public static String field1027;

    @ObfuscatedName("cu.j")
    public static int field1034;

    @ObfuscatedName("cu.jn")
    public static class248 field1035;

    @ObfuscatedName("b.se")
    public static class355 field105;

    @ObfuscatedName("cp.oq")
    public static class131 field1063;

    @ObfuscatedName("cv.dl")
    public static class274 field1068;

    @ObfuscatedName("b.es")
    public static SecureRandom field108;

    @ObfuscatedName("cb.dk")
    public static class274 field1081;

    @ObfuscatedName("cg.b")
    public static class276 field1094;

    @ObfuscatedName("cg.z")
    public static int field1095;

    @ObfuscatedName("ca.k")
    public static int[] field1096;

    @ObfuscatedName("e.ar")
    public static client field11;

    @ObfuscatedName("ca.z")
    public static int[] field1100;

    @ObfuscatedName("ca.g")
    public static int[][][] field1102;

    @ObfuscatedName("ca.j")
    public static byte[][][] field1112;

    @ObfuscatedName("ca.h")
    public static byte[][][] field1113;

    @ObfuscatedName("cd.y")
    public static File field1115;

    @ObfuscatedName("ce.b")
    public static class239 field1117;

    @ObfuscatedName("i.gh")
    public static int field112;

    @ObfuscatedName("ce.x")
    public static String[] field1123;

    @ObfuscatedName("i.bt")
    public static class396 field114;

    @ObfuscatedName("co.eq")
    public static int field1173;

    @ObfuscatedName("k.at")
    public static Font field120;

    @ObfuscatedName("cr.g")
    public static class102 field1205;

    @ObfuscatedName("cr.lj")
    public static int field1221;

    @ObfuscatedName("g.aa")
    public static GarbageCollectorMXBean field124;

    @ObfuscatedName("g.io")
    public static int field125;

    @ObfuscatedName("t.gl")
    public static int field127;

    @ObfuscatedName("t.gc")
    public static int field129;

    @ObfuscatedName("t.mq")
    public static int field131;

    @ObfuscatedName("ck.bv")
    public static class366 field1311;

    @ObfuscatedName("du.h")
    public static int[][] field1329;

    @ObfuscatedName("x.m")
    public static byte[][][] field133;

    @ObfuscatedName("dh.qv")
    public static class4 field1347;

    @ObfuscatedName("dh.h")
    public static class276 field1349;

    @ObfuscatedName("x.dw")
    public static class274 field135;

    @ObfuscatedName("dh.n")
    public static int field1350;

    @ObfuscatedName("dh.rp")
    public static int field1352;

    @ObfuscatedName("di.v")
    public static int field1355;

    @ObfuscatedName("df.be")
    public static class397[] field1386;

    @ObfuscatedName("df.da")
    public static class274 field1388;

    @ObfuscatedName("dg.h")
    public static class396 field1393;

    @ObfuscatedName("dg.br")
    public static String field1398;

    @ObfuscatedName("dq.ei")
    public static class274 field1415;

    @ObfuscatedName("dz.ce")
    public static class97 field1418;

    @ObfuscatedName("dz.gq")
    public static int[] field1420;

    @ObfuscatedName("dz.m")
    public static String[] field1422;

    @ObfuscatedName("dz.ri")
    public static class53 field1424;

    @ObfuscatedName("dc.gf")
    public static byte[][] field1431;

    @ObfuscatedName("dt.ga")
    public static int[] field1433;

    @ObfuscatedName("do.nh")
    public static int field1440;

    @ObfuscatedName("do.ep")
    public static int field1441;

    @ObfuscatedName("do.qj")
    public static class49 field1442;

    @ObfuscatedName("dl.r")
    public static int field1443;

    @ObfuscatedName("dl.x")
    public static class248 field1444;

    @ObfuscatedName("de.dm")
    public static boolean field1450;

    @ObfuscatedName("de.lo")
    public static int field1451;

    @ObfuscatedName("dr.i")
    public static int field1452;

    @ObfuscatedName("dd.fh")
    public static class301 field1459;

    @ObfuscatedName("dk.hr")
    public static class397[] field1465;

    @ObfuscatedName("dj.s")
    public static class384 field1466;

    @ObfuscatedName("dw.f")
    public static class276 field1470;

    @ObfuscatedName("dv.ai")
    public static int field1478;

    @ObfuscatedName("q.de")
    public static class274 field148;

    @ObfuscatedName("dv.h")
    public static byte[][] field1480;

    @ObfuscatedName("da.e")
    public static String field1483;

    @ObfuscatedName("da.f")
    public static String field1485;

    @ObfuscatedName("dn.u")
    public static String[] field1495;

    @ObfuscatedName("dn.n")
    public static String field1499;

    @ObfuscatedName("dn.dv")
    public static class274 field1500;

    @ObfuscatedName("ej.e")
    public static File field1503;

    @ObfuscatedName("ec.z")
    public static int field1524;

    @ObfuscatedName("ec.ab")
    public static Image field1528;

    @ObfuscatedName("en.m")
    public static int[] field1538;

    @ObfuscatedName("en.nx")
    public static int field1539;

    @ObfuscatedName("ex.al")
    public static String field1546;

    @ObfuscatedName("ex.f")
    public static class276 field1548;

    @ObfuscatedName("ex.o")
    public static class276 field1550;

    @ObfuscatedName("eb.f")
    public static class276 field1553;

    @ObfuscatedName("ek.v")
    public static int field1558;

    @ObfuscatedName("ek.e")
    public static class140[] field1560;

    @ObfuscatedName("em.h")
    public static short[] field1582;

    @ObfuscatedName("em.f")
    public static class276 field1583;

    @ObfuscatedName("em.dt")
    public static long field1587;

    @ObfuscatedName("er.e")
    public static class276 field1598;

    @ObfuscatedName("er.do")
    public static class274 field1599;

    @ObfuscatedName("ey.f")
    public static class276 field1610;

    @ObfuscatedName("eg.lz")
    public static int field1617;

    @ObfuscatedName("ep.f")
    public static class276 field1628;

    @ObfuscatedName("ep.b")
    public static int field1630;

    @ObfuscatedName("ev.hy")
    public static class397[] field1646;

    @ObfuscatedName("ev.f")
    public static class276 field1652;

    @ObfuscatedName("p.ru")
    public static int field167;

    @ObfuscatedName("ev.e")
    public static class276 field1673;

    @ObfuscatedName("ee.jp")
    public static class248 field1679;

    @ObfuscatedName("eu.e")
    public static class276 field1683;

    @ObfuscatedName("eu.f")
    public static class276 field1690;

    @ObfuscatedName("p.ox")
    public static class111 field170;

    @ObfuscatedName("eo.f")
    public static class276 field1704;

    @ObfuscatedName("eo.rn")
    public static int field1708;

    @ObfuscatedName("p.hp")
    public static class397[] field171;

    @ObfuscatedName("ew.f")
    public static class276 field1715;

    @ObfuscatedName("ew.ib")
    public static int field1716;

    @ObfuscatedName("ed.f")
    public static class276 field1717;

    @ObfuscatedName("c.s")
    public static int field172;

    @ObfuscatedName("eh.f")
    public static class276 field1728;

    @ObfuscatedName("eh.li")
    public static int field1729;

    @ObfuscatedName("es.v")
    public static class276 field1732;

    @ObfuscatedName("es.e")
    public static class276 field1742;

    @ObfuscatedName("es.f")
    public static class276 field1744;

    @ObfuscatedName("ez.v")
    public static class276 field1758;

    @ObfuscatedName("ez.e")
    public static class276 field1791;

    @ObfuscatedName("c.i")
    public static int field181;

    @ObfuscatedName("ef.o")
    public static class276 field1811;

    @ObfuscatedName("ef.h")
    public static int field1813;

    @ObfuscatedName("ef.i")
    public static class301 field1817;

    @ObfuscatedName("ef.r")
    public static boolean field1849;

    @ObfuscatedName("n.gd")
    public static class397 field186;

    @ObfuscatedName("n.o")
    public static byte[][][] field187;

    @ObfuscatedName("fm.e")
    public static class276 field1878;

    @ObfuscatedName("fm.v")
    public static class276 field1879;

    @ObfuscatedName("fm.f")
    public static class276 field1891;

    @ObfuscatedName("fl.u")
    public static int field1913;

    @ObfuscatedName("l.c")
    public static String field192;

    @ObfuscatedName("fv.gt")
    public static int field1920;

    @ObfuscatedName("fx.hz")
    public static int field1923;

    @ObfuscatedName("fx.fa")
    public static long field1930;

    @ObfuscatedName("fx.b")
    public static class136 field1931;

    @ObfuscatedName("fx.dy")
    public static class274 field1932;

    @ObfuscatedName("fc.bs")
    public static String field1937;

    @ObfuscatedName("w.o")
    public static int field194;

    @ObfuscatedName("ft.qn")
    public static class12 field2008;

    @ObfuscatedName("fb.qo")
    public static boolean field2017;

    @ObfuscatedName("fp.hd")
    public static class397[] field2025;

    @ObfuscatedName("a.p")
    public static int field203;

    @ObfuscatedName("fi.rv")
    public static int field2030;

    @ObfuscatedName("fi.q")
    public static class4 field2032;

    @ObfuscatedName("fr.ee")
    public static int field2039;

    @ObfuscatedName("fr.gi")
    public static int field2048;

    @ObfuscatedName("fj.i")
    public static int[] field2059;

    @ObfuscatedName("aw.qg")
    public static boolean field206;

    @ObfuscatedName("fy.aj")
    public static class394 field2061;

    @ObfuscatedName("aw.j")
    public static int[] field208;

    @ObfuscatedName("fw.bi")
    public static class264 field2085;

    @ObfuscatedName("fw.j")
    public static File field2086;

    @ObfuscatedName("fk.gk")
    public static int field2092;

    @ObfuscatedName("v.j")
    public static int field21;

    @ObfuscatedName("fd.el")
    public static class274 field2101;

    @ObfuscatedName("ff.sb")
    public static class334 field2108;

    @ObfuscatedName("gl.e")
    public static long field2114;

    @ObfuscatedName("gl.bb")
    public static class265 field2115;

    @ObfuscatedName("aw.dr")
    public static class274 field212;

    @ObfuscatedName("gt.i")
    public static class396 field2129;

    @ObfuscatedName("gt.nw")
    public static class248[] field2136;

    @ObfuscatedName("aw.ow")
    public static class371 field214;

    @ObfuscatedName("gg.rq")
    public static class66 field2142;

    @ObfuscatedName("gs.r")
    public static int[] field2146;

    @ObfuscatedName("gu.d")
    public static int field2147;

    @ObfuscatedName("gu.ea")
    public static class274 field2150;

    @ObfuscatedName("gu.sr")
    public static long field2151;

    @ObfuscatedName("gu.eu")
    public static int field2153;

    @ObfuscatedName("ak.oz")
    public static class371 field216;

    @ObfuscatedName("gw.bq")
    public static String field2162;

    @ObfuscatedName("gq.gx")
    public static class396[] field2203;

    @ObfuscatedName("gm.g")
    public static int[] field2224;

    @ObfuscatedName("at.lm")
    public static class82 field223;

    @ObfuscatedName("gn.t")
    public static int field2259;

    @ObfuscatedName("gn.i")
    public static int field2269;

    @ObfuscatedName("ap.hg")
    public static int field227;

    @ObfuscatedName("gn.k")
    public static int field2272;

    @ObfuscatedName("gn.g")
    public static int field2273;

    @ObfuscatedName("gn.q")
    public static int field2274;

    @ObfuscatedName("gn.x")
    public static int field2275;

    @ObfuscatedName("gn.u")
    public static int field2276;

    @ObfuscatedName("gn.s")
    public static int field2278;

    @ObfuscatedName("gn.n")
    public static class212 field2284;

    @ObfuscatedName("y.ex")
    public static class337 field23;

    @ObfuscatedName("gp.ak")
    public static int field2305;

    @ObfuscatedName("gp.x")
    public static int field2307;

    @ObfuscatedName("gp.q")
    public static int field2309;

    @ObfuscatedName("gp.s")
    public static int field2310;

    @ObfuscatedName("gp.c")
    public static int field2312;

    @ObfuscatedName("gp.u")
    public static int field2313;

    @ObfuscatedName("gp.l")
    public static int field2314;

    @ObfuscatedName("gp.a")
    public static int field2316;

    @ObfuscatedName("gp.aw")
    public static int field2317;

    @ObfuscatedName("gp.at")
    public static int field2320;

    @ObfuscatedName("gp.p")
    public static int field2334;

    @ObfuscatedName("gp.ad")
    public static int field2346;

    @ObfuscatedName("gp.n")
    public static int field2348;

    @ObfuscatedName("gp.w")
    public static int field2349;

    @ObfuscatedName("gp.ba")
    public static boolean[][] field2351;

    @ObfuscatedName("gp.bs")
    public static int field2352;

    @ObfuscatedName("gp.br")
    public static int field2353;

    @ObfuscatedName("gp.bw")
    public static int field2354;

    @ObfuscatedName("gp.by")
    public static int field2355;

    @ObfuscatedName("gp.bt")
    public static int field2356;

    @ObfuscatedName("gp.bg")
    public static int field2357;

    @ObfuscatedName("gr.ju")
    public static class204 field2358;

    @ObfuscatedName("ab.k")
    public static class275 field236;

    @ObfuscatedName("gy.d")
    public static int field2360;

    @ObfuscatedName("gc.n")
    public static class190 field2387;

    @ObfuscatedName("aq.hi")
    public static class396[] field241;

    @ObfuscatedName("gd.be")
    public static int field2443;

    @ObfuscatedName("aq.bw")
    public static class396 field245;

    @ObfuscatedName("gd.bc")
    public static int field2477;

    @ObfuscatedName("gd.ba")
    public static int field2479;

    @ObfuscatedName("gx.o")
    public static int field2491;

    @ObfuscatedName("he.z")
    public static short[] field2518;

    @ObfuscatedName("hr.dq")
    public static class330 field2531;

    @ObfuscatedName("hk.ag")
    public static String field2558;

    @ObfuscatedName("hk.i")
    public static class56 field2559;

    @ObfuscatedName("y.pd")
    public static class335 field27;

    @ObfuscatedName("hl.te")
    public static class287 field2801;

    @ObfuscatedName("hl.mr")
    public static int field2811;

    @ObfuscatedName("hq.d")
    public static int[] field2814;

    @ObfuscatedName("hq.v")
    public static class276 field2815;

    @ObfuscatedName("hb.o")
    public static int[] field2819;

    @ObfuscatedName("hu.h")
    public static int field2832;

    @ObfuscatedName("hu.y")
    public static class235 field2834;

    @ObfuscatedName("hu.f")
    public static class276 field2835;

    @ObfuscatedName("hu.m")
    public static int field2836;

    @ObfuscatedName("hu.r")
    public static int field2837;

    @ObfuscatedName("hu.e")
    public static class276 field2839;

    @ObfuscatedName("al.sx")
    public static class77 field288;

    @ObfuscatedName("ib.lb")
    public static class248 field2916;

    @ObfuscatedName("al.gb")
    public static class199 field292;

    @ObfuscatedName("aj.hw")
    public static int field293;

    @ObfuscatedName("iw.j")
    public static class396 field2930;

    @ObfuscatedName("ip.f")
    public static class276 field2931;

    @ObfuscatedName("ip.v")
    public static int field2933;

    @ObfuscatedName("in.ix")
    public static int field2949;

    @ObfuscatedName("aj.nu")
    public static int field297;

    @ObfuscatedName("iv.r")
    public static boolean[] field2975;

    @ObfuscatedName("f.af")
    public static int field3;

    @ObfuscatedName("y.dp")
    public static class274 field30;

    @ObfuscatedName("aj.o")
    public static int[] field301;

    @ObfuscatedName("au.r")
    public static byte[][][] field308;

    @ObfuscatedName("y.ew")
    public static int field31;

    @ObfuscatedName("ix.br")
    public static class396[] field3113;

    @ObfuscatedName("iz.f")
    public static class250 field3116;

    @ObfuscatedName("ii.b")
    public static int[] field3117;

    @ObfuscatedName("iu.u")
    public static class12 field3129;

    @ObfuscatedName("if.t")
    public static class384 field3136;

    @ObfuscatedName("ay.z")
    public static class276 field314;

    @ObfuscatedName("ay.ra")
    public static int field316;

    @ObfuscatedName("is.gn")
    public static byte[][] field3170;

    @ObfuscatedName("ij.he")
    public static class397[] field3172;

    @ObfuscatedName("ij.b")
    public static short[][] field3176;

    @ObfuscatedName("ji.kg")
    public static class98 field3197;

    @ObfuscatedName("jg.ah")
    public static FontMetrics field3219;

    @ObfuscatedName("jm.i")
    public static boolean field3223;

    @ObfuscatedName("jd.sz")
    public static class278 field3228;

    @ObfuscatedName("y.tu")
    public static short[] field33;

    @ObfuscatedName("y.t")
    public static int field34;

    @ObfuscatedName("aa.f")
    public static class129 field345;

    @ObfuscatedName("jn.fj")
    public static class114 field3561;

    @ObfuscatedName("jq.b")
    public static class396 field3578;

    @ObfuscatedName("jp.ba")
    public static class291 field3594;

    @ObfuscatedName("jp.fn")
    public static class135 field3602;

    @ObfuscatedName("jb.v")
    public static long field3605;

    @ObfuscatedName("jb.f")
    public static class330 field3617;

    @ObfuscatedName("jb.by")
    public static class396 field3622;

    @ObfuscatedName("jk.d")
    public static class396[] field3626;

    @ObfuscatedName("jx.z")
    public static boolean field3661;

    @ObfuscatedName("jx.f")
    public static class276 field3662;

    @ObfuscatedName("ku.gm")
    public static int[] field3667;

    @ObfuscatedName("kx.ql")
    public static class319 field3675;

    @ObfuscatedName("kx.o")
    public static class396 field3676;

    @ObfuscatedName("j.dd")
    public static class274 field37;

    @ObfuscatedName("kg.dx")
    public static class274 field3706;

    @ObfuscatedName("kr.d")
    public static class396[] field3734;

    @ObfuscatedName("kp.j")
    public static Thread field3752;

    @ObfuscatedName("kb.ej")
    public static class274 field3755;

    @ObfuscatedName("kf.fk")
    public static class301 field3767;

    @ObfuscatedName("ki.cd")
    public static char field3781;

    @ObfuscatedName("ki.mt")
    public static int field3783;

    @ObfuscatedName("le.fy")
    public static class359 field3803;

    @ObfuscatedName("lj.rh")
    public static int field3816;

    @ObfuscatedName("lp.go")
    public static class397 field3827;

    @ObfuscatedName("lf.t")
    public static class248 field3836;

    @ObfuscatedName("ly.iz")
    public static int field3846;

    @ObfuscatedName("af.d")
    public static int[] field385;

    @ObfuscatedName("ly.dg")
    public static class135 field3850;

    @ObfuscatedName("lk.fw")
    public static class301 field3858;

    @ObfuscatedName("lm.fu")
    public static class330 field3888;

    @ObfuscatedName("lm.aq")
    public static class338 field3892;

    @ObfuscatedName("j.eo")
    public static int field39;

    @ObfuscatedName("mw.m")
    public static class397 field3919;

    @ObfuscatedName("mt.j")
    public static int field3922;

    @ObfuscatedName("af.b")
    public static boolean[] field394;

    @ObfuscatedName("af.z")
    public static int[] field395;

    @ObfuscatedName("bq.dj")
    public static class274 field398;

    @ObfuscatedName("bq.r")
    public static ScheduledExecutorService field399;

    @ObfuscatedName("j.sg")
    public static class103 field40;

    @ObfuscatedName("mb.i")
    public static class61 field4062;

    @ObfuscatedName("nv.ba")
    public static class396[] field4079;

    @ObfuscatedName("np.y")
    public static byte[][][] field4099;

    @ObfuscatedName("bq.o")
    public static boolean field411;

    @ObfuscatedName("nm.g")
    public static class369[] field4114;

    @ObfuscatedName("nj.r")
    public static int field4123;

    @ObfuscatedName("nj.m")
    public static int[] field4126;

    @ObfuscatedName("ne.d")
    public static class276 field4137;

    @ObfuscatedName("nl.e")
    public static boolean field4140;

    @ObfuscatedName("nl.r")
    public static class397 field4141;

    @ObfuscatedName("nh.e")
    public static class276 field4144;

    @ObfuscatedName("nw.h")
    public static int[] field4146;

    @ObfuscatedName("bq.tz")
    public static int field415;

    @ObfuscatedName("nx.f")
    public static long field4152;

    @ObfuscatedName("bq.av")
    public static int field417;

    @ObfuscatedName("ny.w")
    public static int[] field4188;

    @ObfuscatedName("ng.h")
    public static int field4221;

    @ObfuscatedName("nd.ev")
    public static int field4223;

    @ObfuscatedName("nd.jb")
    public static class248 field4225;

    @ObfuscatedName("og.ak")
    public static int[] field4230;

    @ObfuscatedName("og.at")
    public static int field4232;

    @ObfuscatedName("og.ad")
    public static int field4233;

    @ObfuscatedName("oj.m")
    public static int field4245;

    @ObfuscatedName("ol.f")
    public static int field4266;

    @ObfuscatedName("ol.e")
    public static int field4267;

    @ObfuscatedName("ol.y")
    public static int[] field4268;

    @ObfuscatedName("ol.r")
    public static int[] field4269;

    @ObfuscatedName("ol.am")
    public static boolean field4270;

    @ObfuscatedName("or.y")
    public static int field4284;

    @ObfuscatedName("o.lw")
    public static class248 field43;

    @ObfuscatedName("oc.f")
    public static Applet field4304;

    @ObfuscatedName("oc.v")
    public static int field4305;

    @ObfuscatedName("bi.e")
    public static int field431;

    @ObfuscatedName("bi.km")
    public static int field438;

    @ObfuscatedName("bz.ez")
    public static int[] field439;

    @ObfuscatedName("bz.rj")
    public static class53 field442;

    @ObfuscatedName("bz.m")
    public static class276 field443;

    @ObfuscatedName("bz.ce")
    public static int field447;

    @ObfuscatedName("bz.rz")
    public static int field449;

    @ObfuscatedName("br.z")
    public static int field486;

    @ObfuscatedName("m.ec")
    public static class274 field49;

    @ObfuscatedName("br.i")
    public static class52[] field490;

    @ObfuscatedName("br.m")
    public static byte[] field492;

    @ObfuscatedName("br.r")
    public static int field493;

    @ObfuscatedName("br.h")
    public static int field494;

    @ObfuscatedName("br.d")
    public static int field495;

    @ObfuscatedName("br.l")
    public static float[] field496;

    @ObfuscatedName("br.x")
    public static int[] field498;

    @ObfuscatedName("br.k")
    public static class57[] field499;

    @ObfuscatedName("f.l")
    public static int field5;

    @ObfuscatedName("br.g")
    public static class60[] field500;

    @ObfuscatedName("br.t")
    public static boolean[] field501;

    @ObfuscatedName("br.b")
    public static class62[] field507;

    @ObfuscatedName("br.n")
    public static float[] field508;

    @ObfuscatedName("br.w")
    public static float[] field510;

    @ObfuscatedName("br.a")
    public static float[] field511;

    @ObfuscatedName("br.aw")
    public static float[] field512;

    @ObfuscatedName("br.ad")
    public static float[] field514;

    @ObfuscatedName("br.at")
    public static int[] field515;

    @ObfuscatedName("br.ah")
    public static int[] field516;

    @ObfuscatedName("br.ak")
    public static float[] field519;

    @ObfuscatedName("bg.r")
    public static float field535;

    @ObfuscatedName("bg.h")
    public static int field537;

    @ObfuscatedName("r.gz")
    public static int[][] field55;

    @ObfuscatedName("bo.qa")
    public static class397 field567;

    @ObfuscatedName("bo.d")
    public static short[][] field569;

    @ObfuscatedName("bo.hj")
    public static int field570;

    @ObfuscatedName("bn.g")
    public static int field573;

    @ObfuscatedName("bu.gv")
    public static class397[] field587;

    @ObfuscatedName("bl.rf")
    public static int field603;

    @ObfuscatedName("bd.tj")
    public static int field607;

    @ObfuscatedName("bp.ro")
    public static int field608;

    @ObfuscatedName("bp.o")
    public static int field609;

    @ObfuscatedName("bp.m")
    public static class248[][] field613;

    @ObfuscatedName("bp.dn")
    public static class274 field615;

    @ObfuscatedName("client.rb")
    public static int field660;

    @ObfuscatedName("d.h")
    public static int field69;

    @ObfuscatedName("z.ot")
    public static class341 field75;

    @ObfuscatedName("z.en")
    public static class274 field76;

    @ObfuscatedName("client.hf")
    public static class396[] field775;

    @ObfuscatedName("z.bs")
    public static class396[] field78;

    @ObfuscatedName("client.eg")
    public static String field896;

    @ObfuscatedName("client.ab")
    public static class338 field904;

    @ObfuscatedName("bk.j")
    public static class76[] field907;

    @ObfuscatedName("bk.d")
    public static class115 field912;

    @ObfuscatedName("bh.id")
    public static int field932;

    @ObfuscatedName("bf.ha")
    public static int field949;

    @ObfuscatedName("cx.p")
    public static String field970;

    @ObfuscatedName("cq.tl")
    public static class358 field989;

    @ObfuscatedName("t.f(Ljp;Ljp;IZI)Lgi;")
    public static class202 method159(class276 arg0, class276 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        int[] var5 = arg0.method4513(arg2);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = arg0.method4529(arg2, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9;
                if (arg3) {
                    var9 = arg1.method4529(0, var8);
                } else {
                    var9 = arg1.method4529(var8, 0);
                }
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        if (!var4) {
            return null;
        }
        try {
            return new class202(arg0, arg1, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @ObfuscatedName("ct.f(DDD)I")
    public static final int method1925(double arg0, double arg1, double arg2) {
        double var6 = arg2;
        double var8 = arg2;
        double var10 = arg2;
        if (arg1 != 0.0D) {
            double var12;
            if (arg2 < 0.5D) {
                var12 = (arg1 + 1.0D) * arg2;
            } else {
                var12 = arg1 + arg2 - arg1 * arg2;
            }
            double var14 = arg2 * 2.0D - var12;
            double var16 = arg0 + 0.3333333333333333D;
            if (var16 > 1.0D) {
                var16--;
            }
            double var20 = arg0 - 0.3333333333333333D;
            if (var20 < 0.0D) {
                var20++;
            }
            if (var16 * 6.0D < 1.0D) {
                var6 = (var12 - var14) * 6.0D * var16 + var14;
            } else if (var16 * 2.0D < 1.0D) {
                var6 = var12;
            } else if (var16 * 3.0D < 2.0D) {
                var6 = (var12 - var14) * (0.6666666666666666D - var16) * 6.0D + var14;
            } else {
                var6 = var14;
            }
            if (arg0 * 6.0D < 1.0D) {
                var8 = (var12 - var14) * 6.0D * arg0 + var14;
            } else if (arg0 * 2.0D < 1.0D) {
                var8 = var12;
            } else if (arg0 * 3.0D < 2.0D) {
                var8 = (var12 - var14) * (0.6666666666666666D - arg0) * 6.0D + var14;
            } else {
                var8 = var14;
            }
            if (var20 * 6.0D < 1.0D) {
                var10 = (var12 - var14) * 6.0D * var20 + var14;
            } else if (var20 * 2.0D < 1.0D) {
                var10 = var12;
            } else if (var20 * 3.0D < 2.0D) {
                var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
            } else {
                var10 = var14;
            }
        }
        int var22 = (int) (var6 * 256.0D);
        int var23 = (int) (var8 * 256.0D);
        int var24 = (int) (var10 * 256.0D);
        return (var22 << 16) + (var23 << 8) + var24;
    }

    @ObfuscatedName("mb.f(B)[Lmb;")
    public static class360[] method5651() {
        return new class360[] { class360.field4060, class360.field4064, class360.field4061, class360.field4058, class360.field4059, class360.field4056 };
    }

    @ObfuscatedName("bl.f(II)Z")
    public static boolean method1033(int arg0) {
        return arg0 == 10 || arg0 == 11 || arg0 == 12 || arg0 == 13 || arg0 == 14 || arg0 == 15 || arg0 == 16 || arg0 == 17;
    }

    @ObfuscatedName("ip.f(II)Lls;")
    public static class335 method4281(int arg0) {
        class335[] var1 = new class335[] { class335.field3886, class335.field3887, class335.field3882 };
        class335[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class335 var4 = var2[var3];
            if (var4.field3885 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("dw.f([BI)Loa;")
    public static final class397 method2311(byte[] arg0) {
        Object var1 = null;
        try {
            BufferedImage var2 = ImageIO.read(new ByteArrayInputStream(arg0));
            int var3 = var2.getWidth();
            int var4 = var2.getHeight();
            int[] var5 = new int[var3 * var4];
            PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var3, var4, var5, 0, var3);
            var6.grabPixels();
            return new class397(var5, var3, var4);
        } catch (IOException var9) {
        } catch (InterruptedException var10) {
        }
        return new class397(0, 0);
    }

    @ObfuscatedName("ct.n(Lda;III)Lbq;")
    public static final class53 method1926(class129 arg0, int arg1, int arg2) {
        if (field3922 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class53 var3 = field4062.method321();
                var3.field419 = new int[256 * (field411 ? 2 : 1)];
                var3.field404 = arg2;
                var3.method348();
                var3.field403 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field403 > 16384) {
                    var3.field403 = 16384;
                }
                var3.method338(var3.field403);
                if (field4221 > 0 && field1008 == null) {
                    field1008 = new class55();
                    field399 = Executors.newScheduledThreadPool(1);
                    field399.scheduleAtFixedRate(field1008, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (field1008 != null) {
                    if (field1008.field437[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    field1008.field437[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class53();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("aq.v(I)V")
    public static void method259() {
        while (true) {
            class295 var0 = class273.field3560;
            class272 var1;
            synchronized (class273.field3560) {
                var1 = (class272) class273.field3556.method4719();
            }
            if (var1 == null) {
                return;
            }
            var1.field3551.method4464(var1.field3553, (int) var1.field3937, var1.field3552, false);
        }
    }

    @ObfuscatedName("gi.m(S)V")
    public static void method3797() {
        try {
            if (class234.field2838 == 1) {
                int var0 = field2834.method4150();
                if (var0 > 0 && field2834.method4100()) {
                    int var1 = var0 - field2360;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    field2834.method4064(var1);
                    return;
                }
                field2834.method4070();
                field2834.method4068();
                if (field1550 == null) {
                    class234.field2838 = 0;
                } else {
                    class234.field2838 = 2;
                }
                field1117 = null;
                field2559 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            field2834.method4070();
            class234.field2838 = 0;
            field1117 = null;
            field2559 = null;
            field1550 = null;
        }
    }

    @ObfuscatedName("x.r(III)I")
    public static int method161(int arg0, int arg1) {
        int var2 = 0;
        while (arg1 > 0) {
            var2 = var2 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var2;
    }

    @ObfuscatedName("gk.f(Lcs;I)V")
    public static void method3331(class96 arg0) {
        class79.method2146(arg0, 500000, 475000);
    }

    @ObfuscatedName("d.j(IB)Z")
    public static boolean method68(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? class39.field265[arg0] : false;
    }

    @ObfuscatedName("fl.z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2923(String arg0, String arg1, String arg2) {
        class84.field1016 = arg0;
        class84.field1017 = arg1;
        class84.field1018 = arg2;
    }

    @ObfuscatedName("jl.n(ILcf;ZB)I")
    public static int method4430(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3200) {
            field1095 -= 3;
            client.method153(class79.field958[field1095], class79.field958[field1095 + 1], class79.field958[field1095 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method57(class79.field958[--field1095]);
            return 1;
        } else if (arg0 == 3202) {
            field1095 -= 2;
            client.method1001(class79.field958[field1095], class79.field958[field1095 + 1]);
            return 1;
        } else if (arg0 == 3203) {
            int var3 = Math.min(Math.max(class79.field958[--field1095], 0), 100);
            client.method1(Math.round((float) var3 * 2.55F));
            return 1;
        } else if (arg0 == 3204) {
            class79.field958[++field1095 - 1] = Math.round((float) field40.field1320 / 2.55F);
            return 1;
        } else if (arg0 == 3205) {
            int var4 = Math.min(Math.max(class79.field958[--field1095], 0), 100);
            client.method4002(Math.round((float) var4 * 1.27F));
            return 1;
        } else if (arg0 == 3206) {
            class79.field958[++field1095 - 1] = Math.round((float) field40.field1312 / 1.27F);
            return 1;
        } else if (arg0 == 3207) {
            int var5 = Math.min(Math.max(class79.field958[--field1095], 0), 100);
            client.method2574(Math.round((float) var5 * 1.27F));
            return 1;
        } else if (arg0 == 3208) {
            class79.field958[++field1095 - 1] = Math.round((float) field40.field1322 / 1.27F);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ck.aw(ILcf;ZI)I")
    public static int method2048(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (field288.field929 == 0) {
                class79.field958[++field1095 - 1] = -2;
            } else if (field288.field929 == 1) {
                class79.field958[++field1095 - 1] = -1;
            } else {
                class79.field958[++field1095 - 1] = field288.field924.method5199();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = class79.field958[--field1095];
            if (field288.method1547() && var3 >= 0 && var3 < field288.field924.method5199()) {
                class320 var4 = (class320) field288.field924.method5208(var3);
                class79.field965[++field1452 - 1] = var4.method5178();
                class79.field965[++field1452 - 1] = var4.method5179();
            } else {
                class79.field965[++field1452 - 1] = "";
                class79.field965[++field1452 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = class79.field958[--field1095];
            if (field288.method1547() && var5 >= 0 && var5 < field288.field924.method5199()) {
                class79.field958[++field1095 - 1] = ((class327) field288.field924.method5208(var5)).field3848;
            } else {
                class79.field958[++field1095 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = class79.field958[--field1095];
            if (field288.method1547() && var6 >= 0 && var6 < field288.field924.method5199()) {
                class79.field958[++field1095 - 1] = ((class327) field288.field924.method5208(var6)).field3849;
            } else {
                class79.field958[++field1095 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = class79.field965[--field1452];
            int var8 = class79.field958[--field1095];
            class77.method157(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = class79.field965[--field1452];
            field288.method1554(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = class79.field965[--field1452];
            field288.method1572(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = class79.field965[--field1452];
            field288.method1584(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = class79.field965[--field1452];
            field288.method1603(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = class79.field965[--field1452];
            String var14 = client.method1003(var13);
            class79.field958[++field1095 - 1] = field288.method1552(new class329(var14, field1311), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (field3675 == null) {
                class79.field965[++field1452 - 1] = "";
            } else {
                class79.field965[++field1452 - 1] = field3675.field3818;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (field3675 == null) {
                class79.field958[++field1095 - 1] = 0;
            } else {
                class79.field958[++field1095 - 1] = field3675.method5199();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = class79.field958[--field1095];
            if (field3675 == null || var15 >= field3675.method5199()) {
                class79.field965[++field1452 - 1] = "";
            } else {
                class79.field965[++field1452 - 1] = field3675.method5208(var15).method5177().method5264();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = class79.field958[--field1095];
            if (field3675 == null || var16 >= field3675.method5199()) {
                class79.field958[++field1095 - 1] = 0;
            } else {
                class79.field958[++field1095 - 1] = ((class327) field3675.method5208(var16)).method5261();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = class79.field958[--field1095];
            if (field3675 == null || var17 >= field3675.method5199()) {
                class79.field958[++field1095 - 1] = 0;
            } else {
                class79.field958[++field1095 - 1] = ((class327) field3675.method5208(var17)).field3849;
            }
            return 1;
        } else if (arg0 == 3616) {
            class79.field958[++field1095 - 1] = field3675 == null ? 0 : field3675.field3820;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = class79.field965[--field1452];
            client.method13(var18);
            return 1;
        } else if (arg0 == 3618) {
            class79.field958[++field1095 - 1] = field3675 == null ? 0 : field3675.field3824;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = class79.field965[--field1452];
            client.method4268(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method3275();
            return 1;
        } else if (arg0 == 3621) {
            if (field288.method1547()) {
                class79.field958[++field1095 - 1] = field288.field926.method5199();
            } else {
                class79.field958[++field1095 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = class79.field958[--field1095];
            if (field288.method1547() && var20 >= 0 && var20 < field288.field926.method5199()) {
                class326 var21 = (class326) field288.field926.method5208(var20);
                class79.field965[++field1452 - 1] = var21.method5178();
                class79.field965[++field1452 - 1] = var21.method5179();
            } else {
                class79.field965[++field1452 - 1] = "";
                class79.field965[++field1452 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = class79.field965[--field1452];
            String var23 = client.method1003(var22);
            class79.field958[++field1095 - 1] = field288.method1553(new class329(var23, field1311)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = class79.field958[--field1095];
            if (field3675 == null || var24 >= field3675.method5199() || !field3675.method5208(var24).method5177().equals(field3197.field1175)) {
                class79.field958[++field1095 - 1] = 0;
            } else {
                class79.field958[++field1095 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (field3675 == null || field3675.field3819 == null) {
                class79.field965[++field1452 - 1] = "";
            } else {
                class79.field965[++field1452 - 1] = field3675.field3819;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = class79.field958[--field1095];
            if (field3675 == null || var25 >= field3675.method5199() || !((class322) field3675.method5208(var25)).method5174()) {
                class79.field958[++field1095 - 1] = 0;
            } else {
                class79.field958[++field1095 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = class79.field958[--field1095];
            if (field3675 == null || var26 >= field3675.method5199() || !((class322) field3675.method5208(var26)).method5162()) {
                class79.field958[++field1095 - 1] = 0;
            } else {
                class79.field958[++field1095 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            field288.field924.method5233();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = class79.field958[--field1095] == 1;
            field288.field924.method5218(new class389(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = class79.field958[--field1095] == 1;
            field288.field924.method5218(new class390(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = class79.field958[--field1095] == 1;
            field288.field924.method5218(new class120(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = class79.field958[--field1095] == 1;
            field288.field924.method5218(new class116(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = class79.field958[--field1095] == 1;
            field288.field924.method5218(new class119(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = class79.field958[--field1095] == 1;
            field288.field924.method5218(new class124(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = class79.field958[--field1095] == 1;
            field288.field924.method5218(new class118(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = class79.field958[--field1095] == 1;
            field288.field924.method5218(new class117(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = class79.field958[--field1095] == 1;
            field288.field924.method5218(new class121(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = class79.field958[--field1095] == 1;
            field288.field924.method5218(new class122(var36));
            return 1;
        } else if (arg0 == 3639) {
            field288.field924.method5229();
            return 1;
        } else if (arg0 == 3640) {
            field288.field926.method5233();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = class79.field958[--field1095] == 1;
            field288.field926.method5218(new class389(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = class79.field958[--field1095] == 1;
            field288.field926.method5218(new class390(var38));
            return 1;
        } else if (arg0 == 3643) {
            field288.field926.method5229();
            return 1;
        } else if (arg0 == 3644) {
            if (field3675 != null) {
                field3675.method5233();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = class79.field958[--field1095] == 1;
            if (field3675 != null) {
                field3675.method5218(new class389(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = class79.field958[--field1095] == 1;
            if (field3675 != null) {
                field3675.method5218(new class390(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = class79.field958[--field1095] == 1;
            if (field3675 != null) {
                field3675.method5218(new class120(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = class79.field958[--field1095] == 1;
            if (field3675 != null) {
                field3675.method5218(new class116(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = class79.field958[--field1095] == 1;
            if (field3675 != null) {
                field3675.method5218(new class119(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = class79.field958[--field1095] == 1;
            if (field3675 != null) {
                field3675.method5218(new class124(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = class79.field958[--field1095] == 1;
            if (field3675 != null) {
                field3675.method5218(new class118(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = class79.field958[--field1095] == 1;
            if (field3675 != null) {
                field3675.method5218(new class117(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = class79.field958[--field1095] == 1;
            if (field3675 != null) {
                field3675.method5218(new class121(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = class79.field958[--field1095] == 1;
            if (field3675 != null) {
                field3675.method5218(new class122(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (field3675 != null) {
                field3675.method5229();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = class79.field958[--field1095] == 1;
            field288.field924.method5218(new class123(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = class79.field958[--field1095] == 1;
            if (field3675 != null) {
                field3675.method5218(new class123(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aj.ax(ILiw;ZI)V")
    public static void method334(int arg0, class244 arg1, boolean arg2) {
        class167 var3 = client.method6121().method5495(arg0);
        int var4 = field3197.field1197;
        int var5 = (field3197.field1242 >> 7) + field127;
        int var6 = (field3197.field1223 >> 7) + field2092;
        class244 var7 = new class244(var4, var5, var6);
        client.method6121().method5464(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("dm.gx(B)I")
    public static final int method2101() {
        if (field40.field1321) {
            return field438;
        } else {
            int var0 = client.method1921(field949, field293, field438);
            return var0 - field1923 >= 800 || (class90.field1097[field438][field949 >> 7][field293 >> 7] & 0x4) == 0 ? 3 : field438;
        }
    }

    @ObfuscatedName("ai.iv(IIIILjava/lang/String;I)V")
    public static void method582(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class248 var5 = class248.method165(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3068 != null) {
            class96 var6 = new class96();
            var6.field1151 = var5;
            var6.field1156 = arg0;
            var6.field1153 = arg4;
            var6.field1159 = var5.field3068;
            method3331(var6);
        }
        boolean var7 = true;
        if (var5.field2965 > 0) {
            var7 = client.method5399(var5);
        }
        if (!var7 || !class249.method2393(client.method188(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class228 var8 = class228.method1927(class226.field2659, client.field669.field1410);
            var8.field2700.method5883(arg1);
            var8.field2700.method5881(arg2);
            var8.field2700.method5881(arg3);
            client.field669.method2200(var8);
        }
        if (arg0 == 2) {
            class228 var9 = class228.method1927(class226.field2632, client.field669.field1410);
            var9.field2700.method5883(arg1);
            var9.field2700.method5881(arg2);
            var9.field2700.method5881(arg3);
            client.field669.method2200(var9);
        }
        if (arg0 == 3) {
            class228 var10 = class228.method1927(class226.field2631, client.field669.field1410);
            var10.field2700.method5883(arg1);
            var10.field2700.method5881(arg2);
            var10.field2700.method5881(arg3);
            client.field669.method2200(var10);
        }
        if (arg0 == 4) {
            class228 var11 = class228.method1927(class226.field2660, client.field669.field1410);
            var11.field2700.method5883(arg1);
            var11.field2700.method5881(arg2);
            var11.field2700.method5881(arg3);
            client.field669.method2200(var11);
        }
        if (arg0 == 5) {
            class228 var12 = class228.method1927(class226.field2589, client.field669.field1410);
            var12.field2700.method5883(arg1);
            var12.field2700.method5881(arg2);
            var12.field2700.method5881(arg3);
            client.field669.method2200(var12);
        }
        if (arg0 == 6) {
            class228 var13 = class228.method1927(class226.field2580, client.field669.field1410);
            var13.field2700.method5883(arg1);
            var13.field2700.method5881(arg2);
            var13.field2700.method5881(arg3);
            client.field669.method2200(var13);
        }
        if (arg0 == 7) {
            class228 var14 = class228.method1927(class226.field2661, client.field669.field1410);
            var14.field2700.method5883(arg1);
            var14.field2700.method5881(arg2);
            var14.field2700.method5881(arg3);
            client.field669.method2200(var14);
        }
        if (arg0 == 8) {
            class228 var15 = class228.method1927(class226.field2634, client.field669.field1410);
            var15.field2700.method5883(arg1);
            var15.field2700.method5881(arg2);
            var15.field2700.method5881(arg3);
            client.field669.method2200(var15);
        }
        if (arg0 == 9) {
            class228 var16 = class228.method1927(class226.field2599, client.field669.field1410);
            var16.field2700.method5883(arg1);
            var16.field2700.method5881(arg2);
            var16.field2700.method5881(arg3);
            client.field669.method2200(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class228 var17 = class228.method1927(class226.field2593, client.field669.field1410);
        var17.field2700.method5883(arg1);
        var17.field2700.method5881(arg2);
        var17.field2700.method5881(arg3);
        client.field669.method2200(var17);
    }

    @ObfuscatedName("jj.jp(Liv;IIB)V")
    public static final void method4423(class248 arg0, int arg1, int arg2) {
        if (arg0.field3058 == 1) {
            client.method186(arg0.field2962, "", 24, 0, 0, arg0.field2960);
        }
        if (arg0.field3058 == 2 && !client.field778) {
            String var3 = client.method1899(arg0);
            if (var3 != null) {
                client.method186(var3, class106.method1825(65280) + arg0.field3088, 25, 0, -1, arg0.field2960);
            }
        }
        if (arg0.field3058 == 3) {
            client.method186(class269.field3393, "", 26, 0, 0, arg0.field2960);
        }
        if (arg0.field3058 == 4) {
            client.method186(arg0.field2962, "", 28, 0, 0, arg0.field2960);
        }
        if (arg0.field3058 == 5) {
            client.method186(arg0.field2962, "", 29, 0, 0, arg0.field2960);
        }
        if (arg0.field3058 == 6 && client.field789 == null) {
            client.method186(arg0.field2962, "", 30, 0, -1, arg0.field2960);
        }
        if (arg0.field2963 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2977; var5++) {
                for (int var6 = 0; var6 < arg0.field3080; var6++) {
                    int var7 = (arg0.field3028 + 32) * var6;
                    int var8 = (arg0.field3029 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2976[var4];
                        var8 += arg0.field3031[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        client.field894 = var4;
                        field4225 = arg0;
                        if (arg0.field3045[var4] > 0) {
                            class156 var9 = class156.method4403(arg0.field3045[var4] - 1);
                            if (client.field776 == 1 && class249.method5797(client.method188(arg0))) {
                                if (field2949 != arg0.field2960 || field3783 != var4) {
                                    client.method186(class269.field3384, client.field777 + " " + class106.field1335 + " " + class106.method1825(16748608) + var9.field1855, 31, var9.field1838, var4, arg0.field2960);
                                }
                            } else if (!client.field778 || !class249.method5797(client.method188(arg0))) {
                                String[] var10 = var9.field1853;
                                int var11 = -1;
                                if (client.field640) {
                                    boolean var12 = client.field770 || class39.field259[81];
                                    if (var12) {
                                        var11 = var9.method2792();
                                    }
                                }
                                if (class249.method5797(client.method188(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var11 != var13) {
                                            client.method156(arg0, var9, var4, var13, false);
                                        }
                                    }
                                }
                                int var14 = client.method188(arg0);
                                boolean var15 = (var14 >> 31 & 0x1) != 0;
                                if (var15) {
                                    client.method186(class269.field3384, class106.method1825(16748608) + var9.field1855, 38, var9.field1838, var4, arg0.field2960);
                                }
                                class249 var10000 = (class249) null;
                                if (class249.method5797(client.method188(arg0))) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var11 != var16) {
                                            client.method156(arg0, var9, var4, var16, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        client.method156(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var17 = arg0.field3033;
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 39;
                                            }
                                            if (var18 == 1) {
                                                var19 = 40;
                                            }
                                            if (var18 == 2) {
                                                var19 = 41;
                                            }
                                            if (var18 == 3) {
                                                var19 = 42;
                                            }
                                            if (var18 == 4) {
                                                var19 = 43;
                                            }
                                            client.method186(var17[var18], class106.method1825(16748608) + var9.field1855, var19, var9.field1838, var4, arg0.field2960);
                                        }
                                    }
                                }
                                client.method186(class269.field3298, class106.method1825(16748608) + var9.field1855, 1005, var9.field1838, var4, arg0.field2960);
                            } else if ((field2811 & 0x10) == 16) {
                                client.method186(client.field781, client.field782 + " " + class106.field1335 + " " + class106.method1825(16748608) + var9.field1855, 32, var9.field1838, var4, arg0.field2960);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2955) {
            return;
        }
        if (client.field778) {
            int var20 = client.method188(arg0);
            boolean var21 = (var20 >> 21 & 0x1) != 0;
            if (var21 && (field2811 & 0x20) == 32) {
                client.method186(client.field781, client.field782 + " " + class106.field1335 + " " + arg0.field3041, 58, 0, arg0.field3100, arg0.field2960);
            }
            return;
        }
        for (int var22 = 9; var22 >= 5; var22--) {
            String var23;
            if (!class249.method2393(client.method188(arg0), var22) && arg0.field3068 == null) {
                var23 = null;
            } else if (arg0.field3042 == null || arg0.field3042.length <= var22 || arg0.field3042[var22] == null || arg0.field3042[var22].trim().length() == 0) {
                var23 = null;
            } else {
                var23 = arg0.field3042[var22];
            }
            if (var23 != null) {
                client.method186(var23, arg0.field3041, 1007, var22 + 1, arg0.field3100, arg0.field2960);
            }
        }
        String var25 = client.method1899(arg0);
        if (var25 != null) {
            client.method186(var25, arg0.field3041, 25, 0, arg0.field3100, arg0.field2960);
        }
        for (int var26 = 4; var26 >= 0; var26--) {
            String var27;
            if (!class249.method2393(client.method188(arg0), var26) && arg0.field3068 == null) {
                var27 = null;
            } else if (arg0.field3042 == null || arg0.field3042.length <= var26 || arg0.field3042[var26] == null || arg0.field3042[var26].trim().length() == 0) {
                var27 = null;
            } else {
                var27 = arg0.field3042[var26];
            }
            if (var27 != null) {
                client.method2219(var27, arg0.field3041, 57, var26 + 1, arg0.field3100, arg0.field2960, arg0.field3108);
            }
        }
        int var29 = client.method188(arg0);
        boolean var30 = (var29 & 0x1) != 0;
        if (var30) {
            client.method186(class269.field3236, "", 30, 0, arg0.field3100, arg0.field2960);
        }
    }

    @ObfuscatedName("fq.kr(Liv;IIIB)V")
    public static final void method2854(class248 arg0, int arg1, int arg2, int arg3) {
        client.method4062();
        class242 var4 = arg0.method4332(false);
        if (var4 == null) {
            return;
        }
        class393.method6217(arg1, arg2, var4.field2920 + arg1, var4.field2919 + arg2);
        if (client.field773 == 2 || client.field773 == 5) {
            class393.method6176(arg1, arg2, 0, var4.field2918, var4.field2917);
        } else {
            int var5 = client.field693 & 0x7FF;
            int var6 = field3197.field1242 / 32 + 48;
            int var7 = 464 - field3197.field1223 / 32;
            field567.method6303(arg1, arg2, var4.field2920, var4.field2919, var6, var7, var5, 256, var4.field2918, var4.field2917);
            for (int var8 = 0; var8 < client.field855; var8++) {
                int var9 = client.field856[var8] * 4 + 2 - field3197.field1242 / 32;
                int var10 = client.field738[var8] * 4 + 2 - field3197.field1223 / 32;
                client.method222(arg1, arg2, var9, var10, client.field797[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class295 var13 = client.field751[field438][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - field3197.field1242 / 32;
                        int var15 = var12 * 4 + 2 - field3197.field1223 / 32;
                        client.method222(arg1, arg2, var14, var15, field2025[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < client.field665; var16++) {
                class105 var17 = client.field664[client.field666[var16]];
                if (var17 != null && var17.method1987()) {
                    class147 var18 = var17.field1328;
                    if (var18 != null && var18.field1667 != null) {
                        var18 = var18.method2538();
                    }
                    if (var18 != null && var18.field1658 && var18.field1644) {
                        int var19 = var17.field1242 / 32 - field3197.field1242 / 32;
                        int var20 = var17.field1223 / 32 - field3197.field1223 / 32;
                        client.method222(arg1, arg2, var19, var20, field2025[1], var4);
                    }
                }
            }
            int var21 = class110.field1359;
            int[] var22 = class110.field1365;
            for (int var23 = 0; var23 < var21; var23++) {
                class98 var24 = client.field739[var22[var23]];
                if (var24 != null && var24.method1987() && !var24.field1189 && field3197 != var24) {
                    int var25 = var24.field1242 / 32 - field3197.field1242 / 32;
                    int var26 = var24.field1223 / 32 - field3197.field1223 / 32;
                    if (var24.method1945()) {
                        client.method222(arg1, arg2, var25, var26, field2025[3], var4);
                    } else if (field3197.field1195 != 0 && var24.field1195 != 0 && field3197.field1195 == var24.field1195) {
                        client.method222(arg1, arg2, var25, var26, field2025[4], var4);
                    } else if (var24.method1948()) {
                        client.method222(arg1, arg2, var25, var26, field2025[5], var4);
                    } else if (var24.method1953()) {
                        client.method222(arg1, arg2, var25, var26, field2025[6], var4);
                    } else {
                        client.method222(arg1, arg2, var25, var26, field2025[2], var4);
                    }
                }
            }
            if (client.field639 != 0 && client.field631 % 20 < 10) {
                if (client.field639 == 1 && client.field763 >= 0 && client.field763 < client.field664.length) {
                    class105 var27 = client.field664[client.field763];
                    if (var27 != null) {
                        int var28 = var27.field1242 / 32 - field3197.field1242 / 32;
                        int var29 = var27.field1223 / 32 - field3197.field1223 / 32;
                        client.method731(arg1, arg2, var28, var29, field1465[1], var4);
                    }
                }
                if (client.field639 == 2) {
                    int var30 = client.field829 * 4 - field127 * 4 + 2 - field3197.field1242 / 32;
                    int var31 = client.field701 * 4 - field2092 * 4 + 2 - field3197.field1223 / 32;
                    client.method731(arg1, arg2, var30, var31, field1465[1], var4);
                }
                if (client.field639 == 10 && client.field780 >= 0 && client.field780 < client.field739.length) {
                    class98 var32 = client.field739[client.field780];
                    if (var32 != null) {
                        int var33 = var32.field1242 / 32 - field3197.field1242 / 32;
                        int var34 = var32.field1223 / 32 - field3197.field1223 / 32;
                        client.method731(arg1, arg2, var33, var34, field1465[1], var4);
                    }
                }
            }
            if (client.field859 != 0) {
                int var35 = client.field859 * 4 + 2 - field3197.field1242 / 32;
                int var36 = client.field676 * 4 + 2 - field3197.field1223 / 32;
                client.method222(arg1, arg2, var35, var36, field1465[0], var4);
            }
            if (!field3197.field1189) {
                class393.method6184(var4.field2920 / 2 + arg1 - 1, var4.field2919 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        client.field713[arg3] = true;
    }

    @ObfuscatedName("fn.li(III)V")
    public static final void method3202(int arg0, int arg1) {
        if (client.field745[arg0] == null || arg1 < 0 || arg1 >= client.field745[arg0].method41()) {
            return;
        }
        class10 var2 = (class10) client.field745[arg0].field24.get(arg1);
        if (var2.field71 != -1) {
            return;
        }
        class113 var3 = client.field669;
        class228 var4 = class228.method1927(class226.field2585, var3.field1410);
        var4.field2700.method5880(3 + class384.method376(var2.field67));
        var4.field2700.method5880(arg0);
        var4.field2700.method5881(arg1);
        var4.field2700.method6068(var2.field67);
        var3.method2200(var4);
    }

    @ObfuscatedName("gx.lu(II)V")
    public static void method3946(int arg0) {
        client.field698 = arg0;
    }
}
