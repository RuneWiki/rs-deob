package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.security.SecureRandom;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("b.eq")
    public static class247 field1;

    @ObfuscatedName("cf.ht")
    public static int field1058;

    @ObfuscatedName("cf.gv")
    public static class336[] field1060;

    @ObfuscatedName("d.sk")
    public static class83 field108;

    @ObfuscatedName("d.l")
    public static class245 field109;

    @ObfuscatedName("cp.ak")
    public static class330 field1090;

    @ObfuscatedName("cc.os")
    public static class100 field1092;

    @ObfuscatedName("a.gz")
    public static int[] field110;

    @ObfuscatedName("ci.m")
    public static String[] field1118;

    @ObfuscatedName("ci.n")
    public static class227 field1123;

    @ObfuscatedName("ci.l")
    public static int[] field1125;

    @ObfuscatedName("ci.ih")
    public static int field1133;

    @ObfuscatedName("cx.h")
    public static int field1150;

    @ObfuscatedName("cx.u")
    public static int field1155;

    @ObfuscatedName("ca.l")
    public static int field1159;

    @ObfuscatedName("ca.z")
    public static byte[][][] field1162;

    @ObfuscatedName("cn.az")
    public static class330 field1164;

    @ObfuscatedName("cw.w")
    public static class311 field1179;

    @ObfuscatedName("cu.dz")
    public static class247 field1189;

    @ObfuscatedName("a.aq")
    public static class333 field119;

    @ObfuscatedName("cd.v")
    public static int field1201;

    @ObfuscatedName("cj.b")
    public static boolean field1208;

    @ObfuscatedName("cj.q")
    public static class335 field1210;

    @ObfuscatedName("cj.k")
    public static class336 field1211;

    @ObfuscatedName("cj.c")
    public static class336 field1212;

    @ObfuscatedName("cj.e")
    public static class335 field1213;

    @ObfuscatedName("cj.n")
    public static class335 field1214;

    @ObfuscatedName("cj.p")
    public static class82 field1215;

    @ObfuscatedName("g.eo")
    public static class247 field124;

    @ObfuscatedName("g.qi")
    public static class115 field125;

    @ObfuscatedName("g.q")
    public static class245 field126;

    @ObfuscatedName("cb.ip")
    public static int field1271;

    @ObfuscatedName("cb.k")
    public static int field1272;

    @ObfuscatedName("cb.m")
    public static byte[][][] field1274;

    @ObfuscatedName("ct.u")
    public static class335 field1280;

    @ObfuscatedName("cz.dw")
    public static class247 field1303;

    @ObfuscatedName("h.gm")
    public static int field132;

    @ObfuscatedName("cr.hx")
    public static int field1334;

    @ObfuscatedName("cr.bp")
    public static class241 field1335;

    @ObfuscatedName("db.z")
    public static Thread field1355;

    @ObfuscatedName("db.md")
    public static int field1356;

    @ObfuscatedName("dv.fn")
    public static class306 field1360;

    @ObfuscatedName("dv.rk")
    public static int field1365;

    @ObfuscatedName("dp.af")
    public static int[] field1382;

    @ObfuscatedName("dp.k")
    public static byte[] field1388;

    @ObfuscatedName("dp.e")
    public static int field1389;

    @ObfuscatedName("dp.t")
    public static int field1391;

    @ObfuscatedName("dp.a")
    public static float[] field1392;

    @ObfuscatedName("dp.o")
    public static class110[] field1393;

    @ObfuscatedName("dp.n")
    public static class114[] field1394;

    @ObfuscatedName("dp.x")
    public static class121[] field1395;

    @ObfuscatedName("dp.p")
    public static class126[] field1396;

    @ObfuscatedName("dp.r")
    public static boolean[] field1397;

    @ObfuscatedName("i.f")
    public static class245 field140;

    @ObfuscatedName("dp.g")
    public static float[] field1400;

    @ObfuscatedName("dp.i")
    public static float[] field1404;

    @ObfuscatedName("dp.u")
    public static int field1405;

    @ObfuscatedName("dp.h")
    public static float[] field1406;

    @ObfuscatedName("dp.y")
    public static int[] field1407;

    @ObfuscatedName("dp.ab")
    public static float[] field1408;

    @ObfuscatedName("dp.ao")
    public static float[] field1410;

    @ObfuscatedName("dp.av")
    public static int[] field1412;

    @ObfuscatedName("dp.ac")
    public static float[] field1413;

    @ObfuscatedName("dp.c")
    public static int field1414;

    @ObfuscatedName("dm.t")
    public static int[] field1430;

    @ObfuscatedName("dm.e")
    public static int[] field1431;

    @ObfuscatedName("dm.o")
    public static boolean[] field1432;

    @ObfuscatedName("dh.q")
    public static boolean field1434;

    @ObfuscatedName("dh.be")
    public static String field1437;

    @ObfuscatedName("dh.z")
    public static int field1443;

    @ObfuscatedName("dh.rb")
    public static int field1450;

    @ObfuscatedName("ds.c")
    public static boolean field1473;

    @ObfuscatedName("dw.u")
    public static class245 field1492;

    @ObfuscatedName("ab.sc")
    public static class84 field150;

    @ObfuscatedName("dt.u")
    public static int field1513;

    @ObfuscatedName("dt.c")
    public static float field1515;

    @ObfuscatedName("ab.re")
    public static int field153;

    @ObfuscatedName("du.bt")
    public static int field1562;

    @ObfuscatedName("dr.o")
    public static int[] field1565;

    @ObfuscatedName("ek.gs")
    public static int field1641;

    @ObfuscatedName("ek.c")
    public static int[] field1643;

    @ObfuscatedName("ez.p")
    public static int[] field1660;

    @ObfuscatedName("eh.bn")
    public static int field1716;

    @ObfuscatedName("eh.bl")
    public static int field1746;

    @ObfuscatedName("eh.bo")
    public static int field1754;

    @ObfuscatedName("ew.k")
    public static int field1769;

    @ObfuscatedName("ao.hb")
    public static class335[] field177;

    @ObfuscatedName("ew.z")
    public static int field1771;

    @ObfuscatedName("ew.c")
    public static int field1772;

    @ObfuscatedName("ew.n")
    public static int field1773;

    @ObfuscatedName("ew.du")
    public static class247 field1780;

    @ObfuscatedName("ew.hm")
    public static int field1781;

    @ObfuscatedName("ew.af")
    public static Font field1782;

    @ObfuscatedName("ao.y")
    public static class51 field179;

    @ObfuscatedName("et.n")
    public static int field1790;

    @ObfuscatedName("et.r")
    public static int field1799;

    @ObfuscatedName("et.a")
    public static class149 field1802;

    @ObfuscatedName("et.x")
    public static int field1803;

    @ObfuscatedName("et.p")
    public static int field1804;

    @ObfuscatedName("et.s")
    public static int field1807;

    @ObfuscatedName("et.j")
    public static int field1808;

    @ObfuscatedName("et.w")
    public static int field1809;

    @ObfuscatedName("et.y")
    public static int field1816;

    @ObfuscatedName("ef.be")
    public static int field1833;

    @ObfuscatedName("ef.ab")
    public static int field1834;

    @ObfuscatedName("ef.y")
    public static int field1845;

    @ObfuscatedName("ef.w")
    public static int field1847;

    @ObfuscatedName("ef.by")
    public static int field1849;

    @ObfuscatedName("ef.d")
    public static int field1850;

    @ObfuscatedName("ef.a")
    public static int field1851;

    @ObfuscatedName("ef.i")
    public static int field1854;

    @ObfuscatedName("ef.s")
    public static int field1855;

    @ObfuscatedName("ef.ac")
    public static int field1856;

    @ObfuscatedName("ef.af")
    public static int field1858;

    @ObfuscatedName("ef.h")
    public static int field1880;

    @ObfuscatedName("ef.ao")
    public static int field1883;

    @ObfuscatedName("ef.bt")
    public static int field1884;

    @ObfuscatedName("ef.ba")
    public static int field1886;

    @ObfuscatedName("ef.g")
    public static int field1888;

    @ObfuscatedName("ef.bo")
    public static boolean[][] field1889;

    @ObfuscatedName("ef.v")
    public static int field1891;

    @ObfuscatedName("ef.j")
    public static int field1892;

    @ObfuscatedName("ef.bw")
    public static int field1893;

    @ObfuscatedName("ef.bm")
    public static int field1894;

    @ObfuscatedName("ec.sv")
    public static class249 field1896;

    @ObfuscatedName("ec.ez")
    public static class247 field1898;

    @ObfuscatedName("ej.iz")
    public static int field1899;

    @ObfuscatedName("ej.hj")
    public static class336[] field1901;

    @ObfuscatedName("eb.bo")
    public static class335[] field1915;

    @ObfuscatedName("eb.dy")
    public static class247 field1917;

    @ObfuscatedName("ey.gd")
    public static int[] field1943;

    @ObfuscatedName("el.ba")
    public static class335[] field1967;

    @ObfuscatedName("es.t")
    public static int field1969;

    @ObfuscatedName("av.ge")
    public static int field199;

    @ObfuscatedName("fr.bj")
    public static class349 field1990;

    @ObfuscatedName("fo.k")
    public static class245 field1994;

    @ObfuscatedName("b.x")
    public static int[] field2;

    @ObfuscatedName("ff.u")
    public static int[][] field2000;

    @ObfuscatedName("ff.p")
    public static int[][][] field2001;

    @ObfuscatedName("ff.dp")
    public static class175 field2002;

    @ObfuscatedName("ff.ah")
    public static String field2003;

    @ObfuscatedName("fv.gl")
    public static class336 field2013;

    @ObfuscatedName("fv.fm")
    public static class175 field2014;

    @ObfuscatedName("fk.e")
    public static class180 field2019;

    @ObfuscatedName("fg.ec")
    public static String field2027;

    @ObfuscatedName("fz.ad")
    public static int field2036;

    @ObfuscatedName("fc.c")
    public static int field2046;

    @ObfuscatedName("fc.rn")
    public static int field2049;

    @ObfuscatedName("fl.f")
    public static String field2059;

    @ObfuscatedName("fl.hl")
    public static class336[] field2068;

    @ObfuscatedName("fl.b")
    public static String field2071;

    @ObfuscatedName("fp.z")
    public static File field2074;

    @ObfuscatedName("fp.p")
    public static class353[] field2081;

    @ObfuscatedName("fp.l")
    public static long field2082;

    @ObfuscatedName("fn.b")
    public static File field2086;

    @ObfuscatedName("fa.rx")
    public static class122 field2092;

    @ObfuscatedName("gs.q")
    public static int field2123;

    @ObfuscatedName("gw.lt")
    public static int field2209;

    @ObfuscatedName("ah.rv")
    public static int field226;

    @ObfuscatedName("gz.ph")
    public static boolean field2274;

    @ObfuscatedName("ah.as")
    public static GarbageCollectorMXBean field229;

    @ObfuscatedName("c.s")
    public static int field23;

    @ObfuscatedName("az.t")
    public static class117 field235;

    @ObfuscatedName("az.se")
    public static class16 field236;

    @ObfuscatedName("gr.eg")
    public static SecureRandom field2363;

    @ObfuscatedName("gr.qx")
    public static class115 field2365;

    @ObfuscatedName("gr.e")
    public static boolean field2366;

    @ObfuscatedName("gc.gy")
    public static class143 field2412;

    @ObfuscatedName("gl.cu")
    public static class73 field2414;

    @ObfuscatedName("gx.b")
    public static class245 field2430;

    @ObfuscatedName("gx.f")
    public static class245 field2431;

    @ObfuscatedName("gx.l")
    public static class245 field2432;

    @ObfuscatedName("gx.c")
    public static int field2433;

    @ObfuscatedName("gx.u")
    public static int field2434;

    @ObfuscatedName("hl.dv")
    public static boolean field2487;

    @ObfuscatedName("hk.t")
    public static int field2512;

    @ObfuscatedName("hz.t")
    public static short[][] field2517;

    @ObfuscatedName("ak.lx")
    public static int field252;

    @ObfuscatedName("hh.dn")
    public static class247 field2521;

    @ObfuscatedName("hh.en")
    public static class247 field2524;

    @ObfuscatedName("hq.b")
    public static String field2532;

    @ObfuscatedName("hq.jt")
    public static class227 field2533;

    @ObfuscatedName("hq.h")
    public static int[] field2536;

    @ObfuscatedName("hp.gi")
    public static class336 field2541;

    @ObfuscatedName("hp.f")
    public static class219 field2542;

    @ObfuscatedName("ho.rl")
    public static int field2543;

    @ObfuscatedName("ho.hh")
    public static class335[] field2544;

    @ObfuscatedName("hw.em")
    public static int field2552;

    @ObfuscatedName("hw.k")
    public static int[] field2553;

    @ObfuscatedName("hw.lv")
    public static int field2558;

    @ObfuscatedName("hw.ej")
    public static int field2559;

    @ObfuscatedName("hu.k")
    public static short[] field2560;

    @ObfuscatedName("au.nm")
    public static int field257;

    @ObfuscatedName("hr.aj")
    public static int field2577;

    @ObfuscatedName("hr.z")
    public static int[] field2578;

    @ObfuscatedName("ht.k")
    public static class227[][] field2584;

    @ObfuscatedName("ht.c")
    public static boolean[] field2585;

    @ObfuscatedName("ht.e")
    public static class245 field2586;

    @ObfuscatedName("ht.o")
    public static class245 field2587;

    @ObfuscatedName("hf.sf")
    public static class342 field2771;

    @ObfuscatedName("hd.az")
    public static Image field2780;

    @ObfuscatedName("hg.ae")
    public static int field2781;

    @ObfuscatedName("ax.ba")
    public static String field282;

    @ObfuscatedName("ag.pv")
    public static class321 field290;

    @ObfuscatedName("aq.c")
    public static int[] field295;

    @ObfuscatedName("aw.eb")
    public static int field301;

    @ObfuscatedName("ip.dt")
    public static class247 field3100;

    @ObfuscatedName("ih.e")
    public static int[] field3116;

    @ObfuscatedName("in.kz")
    public static class76 field3130;

    @ObfuscatedName("io.t")
    public static class245 field3138;

    @ObfuscatedName("io.jc")
    public static class227 field3139;

    @ObfuscatedName("am.si")
    public static int field314;

    @ObfuscatedName("iz.m")
    public static int field3152;

    @ObfuscatedName("am.gx")
    public static class335[] field318;

    @ObfuscatedName("ib.f")
    public static class316 field3198;

    @ObfuscatedName("ib.n")
    public static boolean field3201;

    @ObfuscatedName("ib.x")
    public static class244 field3202;

    @ObfuscatedName("ib.r")
    public static class311 field3204;

    @ObfuscatedName("iq.t")
    public static class154 field3214;

    @ObfuscatedName("iq.u")
    public static int[] field3217;

    @ObfuscatedName("iq.n")
    public static int[] field3218;

    @ObfuscatedName("ir.n")
    public static class306 field3221;

    @ObfuscatedName("ir.fk")
    public static long field3223;

    @ObfuscatedName("it.f")
    public static class245 field3231;

    @ObfuscatedName("it.me")
    public static int field3232;

    @ObfuscatedName("ig.b")
    public static int field3234;

    @ObfuscatedName("ij.b")
    public static class253[] field3240;

    @ObfuscatedName("ij.f")
    public static class245 field3243;

    @ObfuscatedName("if.f")
    public static class245 field3262;

    @ObfuscatedName("ie.b")
    public static class245 field3267;

    @ObfuscatedName("aa.ri")
    public static int field327;

    @ObfuscatedName("ie.f")
    public static class245 field3270;

    @ObfuscatedName("aa.fq")
    public static class306 field328;

    @ObfuscatedName("ie.ix")
    public static int field3282;

    @ObfuscatedName("ie.ex")
    public static int field3283;

    @ObfuscatedName("ia.f")
    public static class245 field3291;

    @ObfuscatedName("ii.l")
    public static int field3295;

    @ObfuscatedName("ii.ed")
    public static int field3298;

    @ObfuscatedName("at.ds")
    public static class247 field330;

    @ObfuscatedName("ii.f")
    public static class245 field3303;

    @ObfuscatedName("ii.b")
    public static class245 field3305;

    @ObfuscatedName("ix.b")
    public static class245 field3307;

    @ObfuscatedName("ix.f")
    public static class245 field3310;

    @ObfuscatedName("iy.f")
    public static class245 field3321;

    @ObfuscatedName("ju.f")
    public static class245 field3329;

    @ObfuscatedName("jo.f")
    public static class245 field3335;

    @ObfuscatedName("jd.f")
    public static class245 field3339;

    @ObfuscatedName("jd.bb")
    public static String field3347;

    @ObfuscatedName("jd.bn")
    public static class336[] field3349;

    @ObfuscatedName("jx.b")
    public static class245 field3351;

    @ObfuscatedName("at.ca")
    public static char field336;

    @ObfuscatedName("jx.f")
    public static class245 field3360;

    @ObfuscatedName("jx.l")
    public static class245 field3369;

    @ObfuscatedName("je.b")
    public static class245 field3375;

    @ObfuscatedName("jk.q")
    public static class245 field3456;

    @ObfuscatedName("at.hr")
    public static int field347;

    @ObfuscatedName("jn.b")
    public static class245 field3486;

    @ObfuscatedName("u.dr")
    public static class247 field35;

    @ObfuscatedName("jn.f")
    public static class245 field3504;

    @ObfuscatedName("jp.f")
    public static class245 field3522;

    @ObfuscatedName("aj.fl")
    public static class304 field353;

    @ObfuscatedName("jg.f")
    public static class245 field3536;

    @ObfuscatedName("jg.b")
    public static class245 field3549;

    @ObfuscatedName("ji.m")
    public static File field3569;

    @ObfuscatedName("jq.m")
    public static class335[] field3577;

    @ObfuscatedName("jq.jh")
    public static class129 field3578;

    @ObfuscatedName("jl.bm")
    public static class335 field3593;

    @ObfuscatedName("jw.dk")
    public static class247 field3604;

    @ObfuscatedName("ae.di")
    public static class247 field362;

    @ObfuscatedName("jz.r")
    public static int field3626;

    @ObfuscatedName("kt.z")
    public static int field3638;

    @ObfuscatedName("km.dj")
    public static class247 field3657;

    @ObfuscatedName("kk.u")
    public static short[] field3672;

    @ObfuscatedName("kx.q")
    public static int field3675;

    @ObfuscatedName("kf.c")
    public static byte[][][] field3680;

    @ObfuscatedName("kr.be")
    public static class335[] field3688;

    @ObfuscatedName("ko.bo")
    public static class200 field3691;

    @ObfuscatedName("ko.u")
    public static int field3695;

    @ObfuscatedName("u.ow")
    public static class178 field37;

    @ObfuscatedName("ko.ew")
    public static class323 field3700;

    @ObfuscatedName("ky.t")
    public static class335[] field3726;

    @ObfuscatedName("kp.mi")
    public static int field3731;

    @ObfuscatedName("kp.b")
    public static long field3732;

    @ObfuscatedName("ln.u")
    public static byte[][][] field3752;

    @ObfuscatedName("ln.ap")
    public static client field3753;

    @ObfuscatedName("ap.q")
    public static int field378;

    @ObfuscatedName("ap.gg")
    public static int[][] field379;

    @ObfuscatedName("lk.z")
    public static class81[] field3829;

    @ObfuscatedName("lk.t")
    public static class335[] field3832;

    @ObfuscatedName("lk.l")
    public static class245 field3833;

    @ObfuscatedName("lo.p")
    public static int field3846;

    @ObfuscatedName("lh.bw")
    public static class335 field3855;

    @ObfuscatedName("la.k")
    public static byte[][][] field3860;

    @ObfuscatedName("lm.ao")
    public static int field3884;

    @ObfuscatedName("lm.af")
    public static int field3886;

    @ObfuscatedName("lm.ac")
    public static int[] field3889;

    @ObfuscatedName("ly.rq")
    public static int field3891;

    @ObfuscatedName("u.at")
    public static boolean field39;

    @ObfuscatedName("li.k")
    public static int[] field3920;

    @ObfuscatedName("li.f")
    public static int field3921;

    @ObfuscatedName("li.b")
    public static int field3922;

    @ObfuscatedName("li.m")
    public static int[] field3923;

    @ObfuscatedName("li.q")
    public static int[] field3924;

    @ObfuscatedName("li.l")
    public static int field3925;

    @ObfuscatedName("lq.hy")
    public static class336[] field3928;

    @ObfuscatedName("ad.dc")
    public static class247 field393;

    @ObfuscatedName("b.e")
    public static int field4;

    @ObfuscatedName("bb.av")
    public static FontMetrics field401;

    @ObfuscatedName("bb.fu")
    public static class153 field402;

    @ObfuscatedName("bb.gw")
    public static int[] field403;

    @ObfuscatedName("mc.n")
    public static class118 field4063;

    @ObfuscatedName("bb.a")
    public static String field408;

    @ObfuscatedName("mp.f")
    public static Applet field4081;

    @ObfuscatedName("mp.l")
    public static int field4083;

    @ObfuscatedName("mp.c")
    public static ScheduledExecutorService field4084;

    @ObfuscatedName("bp.sg")
    public static class344 field419;

    @ObfuscatedName("bp.ld")
    public static int field422;

    @ObfuscatedName("bp.do")
    public static class316 field434;

    @ObfuscatedName("bg.pt")
    public static class296 field438;

    @ObfuscatedName("bg.x")
    public static class335 field440;

    @ObfuscatedName("bg.fp")
    public static class306 field441;

    @ObfuscatedName("bl.sz")
    public static long field445;

    @ObfuscatedName("bl.ey")
    public static int field446;

    @ObfuscatedName("bo.rh")
    public static int field453;

    @ObfuscatedName("bo.ek")
    public static class247 field461;

    @ObfuscatedName("bo.hz")
    public static class336[] field462;

    @ObfuscatedName("ba.gc")
    public static int field467;

    @ObfuscatedName("ba.k")
    public static int field500;

    @ObfuscatedName("ba.f")
    public static class176 field501;

    @ObfuscatedName("ba.gk")
    public static byte[][] field502;

    @ObfuscatedName("bt.bt")
    public static class335 field524;

    @ObfuscatedName("bt.ja")
    public static class227 field526;

    @ObfuscatedName("bw.q")
    public static byte[][][] field532;

    @ObfuscatedName("x.m")
    public static class208 field54;

    @ObfuscatedName("bw.er")
    public static class247 field542;

    @ObfuscatedName("bw.im")
    public static int field543;

    @ObfuscatedName("bw.z")
    public static class335 field545;

    @ObfuscatedName("bm.ea")
    public static int field553;

    @ObfuscatedName("by.t")
    public static int field554;

    @ObfuscatedName("by.cn")
    public static int field556;

    @ObfuscatedName("bq.f")
    public static long field566;

    @ObfuscatedName("bv.g")
    public static int field567;

    @ObfuscatedName("x.u")
    public static byte[][] field57;

    @ObfuscatedName("bv.o")
    public static int field571;

    @ObfuscatedName("bv.nn")
    public static class227[] field573;

    @ObfuscatedName("bv.hu")
    public static int field577;

    @ObfuscatedName("p.sj")
    public static class319 field58;

    @ObfuscatedName("br.o")
    public static class335 field584;

    @ObfuscatedName("p.bc")
    public static class242 field59;

    @ObfuscatedName("br.n")
    public static class109 field592;

    @ObfuscatedName("bs.o")
    public static class213 field598;

    @ObfuscatedName("bs.qm")
    public static class336 field600;

    @ObfuscatedName("bd.hk")
    public static class336[] field613;

    @ObfuscatedName("bh.fz")
    public static class316 field616;

    @ObfuscatedName("bh.v")
    public static String field618;

    @ObfuscatedName("bh.x")
    public static class227 field622;

    @ObfuscatedName("bh.c")
    public static short[][] field629;

    @ObfuscatedName("bk.st")
    public static short[] field641;

    @ObfuscatedName("bx.d")
    public static String field643;

    @ObfuscatedName("bx.dx")
    public static class247 field644;

    @ObfuscatedName("r.go")
    public static int field65;

    @ObfuscatedName("bi.rf")
    public static int field675;

    @ObfuscatedName("bu.lq")
    public static class227 field678;

    @ObfuscatedName("bu.t")
    public static int[] field679;

    @ObfuscatedName("r.y")
    public static String[] field69;

    @ObfuscatedName("client.da")
    public static long field697;

    @ObfuscatedName("r.qa")
    public static class108 field70;

    @ObfuscatedName("y.nu")
    public static int field73;

    @ObfuscatedName("y.li")
    public static class227 field75;

    @ObfuscatedName("y.ev")
    public static int[] field78;

    @ObfuscatedName("y.gp")
    public static int field79;

    @ObfuscatedName("s.u")
    public static int field82;

    @ObfuscatedName("j.gr")
    public static byte[][] field86;

    @ObfuscatedName("j.nf")
    public static int field88;

    @ObfuscatedName("j.lc")
    public static class92 field92;

    @ObfuscatedName("client.s")
    public static String[] field958;

    @ObfuscatedName("j.de")
    public static class247 field96;

    @ObfuscatedName("bz.ag")
    public static String field972;

    @ObfuscatedName("bz.sx")
    public static int field974;

    @ObfuscatedName("w.kt")
    public static int field99;

    @ObfuscatedName("ko.f(B)[Lko;")
    public static class303[] method5005() {
        return new class303[] { class303.field3696, class303.field3689, class303.field3692, class303.field3693, class303.field3690, class303.field3694 };
    }

    @ObfuscatedName("lb.f(II)Ljava/lang/String;")
    public static String method5531(int arg0) {
        return "<img=" + arg0 + ">";
    }

    @ObfuscatedName("fz.b(III)V")
    public static void method3270(int arg0, int arg1) {
        class260 var2 = (class260) class260.field3322.method3155((long) arg0);
        class260 var3;
        if (var2 == null) {
            byte[] var4 = field3321.method3905(14, arg0);
            class260 var5 = new class260();
            if (var4 != null) {
                var5.method4257(new class311(var4));
            }
            class260.field3322.method3157(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3323;
        int var8 = var3.field3324;
        int var9 = var3.field3325;
        int var10 = class222.field2549[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        class222.field2551[var7] = class222.field2551[var7] & ~var11 | arg1 << var8 & var11;
    }

    @ObfuscatedName("ei.b(Liw;IIS)Lle;")
    public static class335 method2950(class245 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3905(arg1, arg2);
        boolean var4;
        if (var3 == null) {
            var4 = false;
        } else {
            class337.method3719(var3);
            var4 = true;
        }
        if (!var4) {
            return null;
        }
        class335 var5 = new class335();
        var5.field3900 = field3922;
        var5.field3907 = field3925;
        var5.field3904 = field3923[0];
        var5.field3905 = field2578[0];
        var5.field3902 = field3924[0];
        var5.field3903 = field3920[0];
        var5.field3901 = field295;
        var5.field3906 = field57[0];
        field3923 = null;
        field2578 = null;
        field3924 = null;
        field3920 = null;
        field295 = null;
        field57 = (byte[][]) null;
        return var5;
    }

    @ObfuscatedName("iz.q(I)V")
    public static void method3899() {
        class269.field3523.method3158();
    }

    @ObfuscatedName("bj.q(Lba;I)V")
    public static void method795(class63 arg0) {
        if (class95.field1240) {
            while (true) {
                if (!class55.method3331()) {
                    if (class64.field520 != 1 && (field2487 || class64.field520 != 4)) {
                        break;
                    }
                    int var1 = class95.field1209 + 280;
                    if (class64.field525 >= var1 && class64.field525 <= var1 + 14 && class64.field522 >= 4 && class64.field522 <= 18) {
                        class81.method1813(0, 0);
                        break;
                    }
                    if (class64.field525 >= var1 + 15 && class64.field525 <= var1 + 80 && class64.field522 >= 4 && class64.field522 <= 18) {
                        class81.method1813(0, 1);
                        break;
                    }
                    int var2 = class95.field1209 + 390;
                    if (class64.field525 >= var2 && class64.field525 <= var2 + 14 && class64.field522 >= 4 && class64.field522 <= 18) {
                        class81.method1813(1, 0);
                        break;
                    }
                    if (class64.field525 >= var2 + 15 && class64.field525 <= var2 + 80 && class64.field522 >= 4 && class64.field522 <= 18) {
                        class81.method1813(1, 1);
                        break;
                    }
                    int var3 = class95.field1209 + 500;
                    if (class64.field525 >= var3 && class64.field525 <= var3 + 14 && class64.field522 >= 4 && class64.field522 <= 18) {
                        class81.method1813(2, 0);
                        break;
                    }
                    if (class64.field525 >= var3 + 15 && class64.field525 <= var3 + 80 && class64.field522 >= 4 && class64.field522 <= 18) {
                        class81.method1813(2, 1);
                        break;
                    }
                    int var4 = class95.field1209 + 610;
                    if (class64.field525 >= var4 && class64.field525 <= var4 + 14 && class64.field522 >= 4 && class64.field522 <= 18) {
                        class81.method1813(3, 0);
                        break;
                    }
                    if (class64.field525 >= var4 + 15 && class64.field525 <= var4 + 80 && class64.field522 >= 4 && class64.field522 <= 18) {
                        class81.method1813(3, 1);
                        break;
                    }
                    if (class64.field525 >= class95.field1209 + 708 && class64.field522 >= 4 && class64.field525 <= class95.field1209 + 708 + 50 && class64.field522 <= 20) {
                        class95.field1240 = false;
                        field1211.method5800(class95.field1209, 0);
                        field1212.method5800(class95.field1209 + 382, 0);
                        field1280.method5734(class95.field1209 + 382 - field1280.field3902 / 2, 18);
                        break;
                    }
                    if (class95.field1237 == -1) {
                        if (class95.field1238 > 0 && field3855 != null && class64.field525 >= 0 && class64.field525 <= field3855.field3902 && class64.field522 >= field1150 / 2 - 50 && class64.field522 <= field1150 / 2 + 50) {
                            class95.field1238--;
                        }
                        if (class95.field1238 < class95.field1239 && field3593 != null && class64.field525 >= field567 - field3593.field3902 - 5 && class64.field525 <= field567 && class64.field522 >= field1150 / 2 - 50 && class64.field522 <= field1150 / 2 + 50) {
                            class95.field1238++;
                        }
                    } else {
                        class81 var5 = field3829[class95.field1237];
                        class95.method3703(var5);
                        class95.field1240 = false;
                        field1211.method5800(class95.field1209, 0);
                        field1212.method5800(class95.field1209 + 382, 0);
                        field1280.method5734(class95.field1209 + 382 - field1280.field3902 / 2, 18);
                    }
                    break;
                }
                if (field556 == 13) {
                    class95.field1240 = false;
                    field1211.method5800(class95.field1209, 0);
                    field1212.method5800(class95.field1209 + 382, 0);
                    field1280.method5734(class95.field1209 + 382 - field1280.field3902 / 2, 18);
                    break;
                }
                if (field556 == 96) {
                    if (class95.field1238 > 0 && field3855 != null) {
                        class95.field1238--;
                    }
                } else if (field556 == 97 && class95.field1238 < class95.field1239 && field3593 != null) {
                    class95.field1238++;
                }
            }
            return;
        }
        if ((class64.field520 == 1 || !field2487 && class64.field520 == 4) && class64.field525 >= class95.field1209 + 765 - 50 && class64.field522 >= 453) {
            field108.field1082 = !field108.field1082;
            class83.method2738();
            if (field108.field1082) {
                field54.method3523();
                class207.field2435 = 1;
                field126 = null;
            } else {
                class247 var6 = field644;
                int var7 = var6.method3923("scape main");
                int var8 = var6.method3924(var7, "");
                class207.method793(var6, var7, var8, 255, false);
            }
        }
        if (client.field689 == 5) {
            return;
        }
        if (class95.field1224 == -1L) {
            class95.field1224 = class308.method4786() + 1000L;
        }
        long var9 = class308.method4786();
        if (client.method738() && class95.field1242 == -1L) {
            class95.field1242 = var9;
            if (class95.field1242 > class95.field1224) {
                class95.field1224 = class95.field1242;
            }
        }
        if (client.field689 != 10 && client.field689 != 11) {
            return;
        }
        if (field3691 == class200.field2384) {
            if (class64.field520 == 1 || !field2487 && class64.field520 == 4) {
                int var11 = class95.field1209 + 5;
                short var12 = 463;
                byte var13 = 100;
                byte var14 = 35;
                if (class64.field525 >= var11 && class64.field525 <= var11 + var13 && class64.field522 >= var12 && class64.field522 <= var12 + var14) {
                    if (class81.method3130()) {
                        class95.field1240 = true;
                        class95.field1238 = 0;
                        class95.field1239 = 0;
                    }
                    return;
                }
            }
            if (field3214 != null && class81.method3130()) {
                class95.field1240 = true;
                class95.field1238 = 0;
                class95.field1239 = 0;
            }
        }
        int var15 = class64.field520;
        int var16 = class64.field525;
        int var17 = class64.field522;
        if (var15 == 0) {
            var16 = class64.field510;
            var17 = class64.field514;
        }
        if (!field2487 && var15 == 4) {
            var15 = 1;
        }
        if (class95.field1221 == 0) {
            boolean var18 = false;
            while (class55.method3331()) {
                if (field556 == 84) {
                    var18 = true;
                }
            }
            int var19 = field1201 - 80;
            short var20 = 291;
            if (var15 == 1 && var16 >= var19 - 75 && var16 <= var19 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20) {
                class61.method2948(client.method1965("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var21 = field1201 + 80;
            if (var15 == 1 && var16 >= var21 - 75 && var16 <= var21 + 75 && var17 >= var20 - 20 && var17 <= var20 + 20 || var18) {
                if ((client.field682 & 0x2000000) != 0) {
                    class95.field1222 = "";
                    class95.field1223 = class234.field3042;
                    class95.field1225 = class234.field3014;
                    class95.field1243 = class234.field3015;
                    class95.field1221 = 1;
                    if (client.field719 && class95.field1226 != null && class95.field1226.length() > 0) {
                        class95.field1232 = 1;
                    } else {
                        class95.field1232 = 0;
                    }
                } else if ((client.field682 & 0x4) != 0) {
                    if ((client.field682 & 0x400) == 0) {
                        class95.field1223 = class234.field3004;
                        class95.field1225 = class234.field3005;
                        class95.field1243 = class234.field3080;
                    } else {
                        class95.field1223 = class234.field3010;
                        class95.field1225 = class234.field2820;
                        class95.field1243 = class234.field3012;
                    }
                    class95.field1222 = class234.field3003;
                    class95.field1221 = 1;
                    if (client.field719 && class95.field1226 != null && class95.field1226.length() > 0) {
                        class95.field1232 = 1;
                    } else {
                        class95.field1232 = 0;
                    }
                } else if ((client.field682 & 0x400) == 0) {
                    class95.method1954(false);
                } else {
                    class95.field1223 = class234.field2887;
                    class95.field1225 = class234.field3008;
                    class95.field1243 = class234.field3009;
                    class95.field1222 = class234.field3003;
                    class95.field1221 = 1;
                    if (client.field719 && class95.field1226 != null && class95.field1226.length() > 0) {
                        class95.field1232 = 1;
                    } else {
                        class95.field1232 = 0;
                    }
                }
            }
        } else if (class95.field1221 == 1) {
            while (true) {
                if (!class55.method3331()) {
                    int var22 = field1201 - 80;
                    short var23 = 321;
                    if (var15 == 1 && var16 >= var22 - 75 && var16 <= var22 + 75 && var17 >= var23 - 20 && var17 <= var23 + 20) {
                        class95.method1954(false);
                    }
                    int var24 = field1201 + 80;
                    if (var15 == 1 && var16 >= var24 - 75 && var16 <= var24 + 75 && var17 >= var23 - 20 && var17 <= var23 + 20) {
                        class95.field1221 = 0;
                    }
                    break;
                }
                if (field556 == 84) {
                    class95.method1954(false);
                } else if (field556 == 13) {
                    class95.field1221 = 0;
                }
            }
        } else if (class95.field1221 == 2) {
            short var25 = 201;
            int var75 = var25 + 52;
            if (var15 == 1 && var17 >= var75 - 12 && var17 < var75 + 2) {
                class95.field1232 = 0;
            }
            var75 += 15;
            if (var15 == 1 && var17 >= var75 - 12 && var17 < var75 + 2) {
                class95.field1232 = 1;
            }
            var75 += 15;
            short var26 = 361;
            if (field1164 != null) {
                int var27 = field1164.field3878 / 2;
                if (var15 == 1 && var16 >= field1164.field3877 - var27 && var16 <= field1164.field3877 + var27 && var17 >= var26 - 15 && var17 < var26) {
                    switch(class95.field1218) {
                        case 1:
                            class95.method197(class234.field3052, class234.field3053, class234.field3054);
                            class95.field1221 = 5;
                            return;
                        case 2:
                            class61.method2948("https://support.runescape.com/hc/en-gb", true, false);
                    }
                }
            }
            int var28 = field1201 - 80;
            short var29 = 321;
            if (var15 == 1 && var16 >= var28 - 75 && var16 <= var28 + 75 && var17 >= var29 - 20 && var17 <= var29 + 20) {
                class95.field1226 = class95.field1226.trim();
                if (class95.field1226.length() == 0) {
                    class95.method197(class234.field2905, class234.field2967, class234.field2877);
                    return;
                }
                if (class95.field1233.length() == 0) {
                    class95.method197(class234.field2912, class234.field2909, class234.field2910);
                    return;
                }
                class95.method197(class234.field3018, class234.field2961, class234.field3020);
                client.method1155(false);
                client.method3258(20);
                return;
            }
            int var30 = class95.field1216 + 180 + 80;
            if (var15 == 1 && var16 >= var30 - 75 && var16 <= var30 + 75 && var17 >= var29 - 20 && var17 <= var29 + 20) {
                class95.field1221 = 0;
                class95.field1226 = "";
                class95.field1233 = "";
                field2036 = 0;
                field3347 = "";
                class95.field1228 = true;
            }
            int var31 = field1201 + -117;
            short var32 = 277;
            class95.field1231 = var16 >= var31 && var16 < field2577 + var31 && var17 >= var32 && var17 < field2781 + var32;
            if (var15 == 1 && class95.field1231) {
                client.field719 = !client.field719;
                if (!client.field719 && field108.field1087 != null) {
                    field108.field1087 = null;
                    class83.method2738();
                }
            }
            int var33 = field1201 + 24;
            short var34 = 277;
            class95.field1230 = var16 >= var33 && var16 < field2577 + var33 && var17 >= var34 && var17 < field2781 + var34;
            if (var15 == 1 && class95.field1230) {
                field108.field1088 = !field108.field1088;
                if (!field108.field1088) {
                    class95.field1226 = "";
                    field108.field1087 = null;
                    if (client.field719 && class95.field1226 != null && class95.field1226.length() > 0) {
                        class95.field1232 = 1;
                    } else {
                        class95.field1232 = 0;
                    }
                }
                class83.method2738();
            }
            while (true) {
                Transferable var36;
                int var37;
                do {
                    while (true) {
                        label865: do {
                            while (true) {
                                while (class55.method3331()) {
                                    if (field556 == 13) {
                                        class95.field1221 = 0;
                                        class95.field1226 = "";
                                        class95.field1233 = "";
                                        field2036 = 0;
                                        field3347 = "";
                                        class95.field1228 = true;
                                    } else {
                                        if (class95.field1232 != 0) {
                                            continue label865;
                                        }
                                        class95.method219(field336);
                                        if (field556 == 85 && class95.field1226.length() > 0) {
                                            class95.field1226 = class95.field1226.substring(0, class95.field1226.length() - 1);
                                        }
                                        if (field556 == 84 || field556 == 80) {
                                            class95.field1232 = 1;
                                        }
                                        if (class95.method2947(field336) && class95.field1226.length() < 320) {
                                            class95.field1226 = class95.field1226 + field336;
                                        }
                                    }
                                }
                                return;
                            }
                        } while (class95.field1232 != 1);
                        if (field556 == 85 && class95.field1233.length() > 0) {
                            class95.field1233 = class95.field1233.substring(0, class95.field1233.length() - 1);
                        } else if (field556 == 84 || field556 == 80) {
                            class95.field1232 = 0;
                            if (field556 == 84) {
                                class95.field1226 = class95.field1226.trim();
                                if (class95.field1226.length() == 0) {
                                    class95.method197(class234.field2905, class234.field2967, class234.field2877);
                                    return;
                                }
                                if (class95.field1233.length() == 0) {
                                    class95.method197(class234.field2912, class234.field2909, class234.field2910);
                                    return;
                                }
                                class95.method197(class234.field3018, class234.field2961, class234.field3020);
                                client.method1155(false);
                                client.method3258(20);
                                return;
                            }
                        }
                        if ((class55.field421[82] || class55.field421[87]) && field556 == 67) {
                            Clipboard var35 = Toolkit.getDefaultToolkit().getSystemClipboard();
                            var36 = var35.getContents(field3753);
                            var37 = 20 - class95.field1233.length();
                            break;
                        }
                        if (class299.method1036(field336) && class95.method2947(field336) && class95.field1233.length() < 20) {
                            class95.field1233 = class95.field1233 + field336;
                        }
                    }
                } while (var37 <= 0);
                try {
                    String var38 = (String) var36.getTransferData(DataFlavor.stringFlavor);
                    int var39 = Math.min(var37, var38.length());
                    for (int var40 = 0; var40 < var39; var40++) {
                        if (!class299.method1036(var38.charAt(var40)) || !class95.method2947(var38.charAt(var40))) {
                            class95.field1221 = 3;
                            return;
                        }
                    }
                    class95.field1233 = class95.field1233 + var38.substring(0, var39);
                } catch (UnsupportedFlavorException var73) {
                } catch (IOException var74) {
                }
            }
        } else if (class95.field1221 == 3) {
            int var43 = class95.field1216 + 180;
            short var44 = 276;
            if (var15 == 1 && var16 >= var43 - 75 && var16 <= var43 + 75 && var17 >= var44 - 20 && var17 <= var44 + 20) {
                class95.method1954(false);
            }
            int var45 = class95.field1216 + 180;
            short var46 = 326;
            if (var15 == 1 && var16 >= var45 - 75 && var16 <= var45 + 75 && var17 >= var46 - 20 && var17 <= var46 + 20) {
                class95.method197(class234.field3052, class234.field3053, class234.field3054);
                class95.field1221 = 5;
                return;
            }
        } else if (class95.field1221 == 4) {
            int var47 = class95.field1216 + 180 - 80;
            short var48 = 321;
            if (var15 == 1 && var16 >= var47 - 75 && var16 <= var47 + 75 && var17 >= var48 - 20 && var17 <= var48 + 20) {
                field3347.trim();
                if (field3347.length() != 6) {
                    class95.method197(class234.field2933, class234.field2825, class234.field2826);
                    return;
                }
                field2036 = Integer.parseInt(field3347);
                field3347 = "";
                client.method1155(true);
                class95.method197(class234.field3018, class234.field2961, class234.field3020);
                client.method3258(20);
                return;
            }
            if (var15 == 1 && var16 >= class95.field1216 + 180 - 9 && var16 <= class95.field1216 + 180 + 130 && var17 >= 263 && var17 <= 296) {
                class95.field1228 = !class95.field1228;
            }
            if (var15 == 1 && var16 >= class95.field1216 + 180 - 34 && var16 <= class95.field1216 + 180 + 34 && var17 >= 351 && var17 <= 363) {
                class61.method2948(client.method1965("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var49 = class95.field1216 + 180 + 80;
            if (var15 == 1 && var16 >= var49 - 75 && var16 <= var49 + 75 && var17 >= var48 - 20 && var17 <= var48 + 20) {
                class95.field1221 = 0;
                class95.field1226 = "";
                class95.field1233 = "";
                field2036 = 0;
                field3347 = "";
            }
            while (class55.method3331()) {
                boolean var50 = false;
                for (int var51 = 0; var51 < class95.field1236.length(); var51++) {
                    if (field336 == class95.field1236.charAt(var51)) {
                        var50 = true;
                        break;
                    }
                }
                if (field556 == 13) {
                    class95.field1221 = 0;
                    class95.field1226 = "";
                    class95.field1233 = "";
                    field2036 = 0;
                    field3347 = "";
                } else {
                    if (field556 == 85 && field3347.length() > 0) {
                        field3347 = field3347.substring(0, field3347.length() - 1);
                    }
                    if (field556 == 84) {
                        field3347.trim();
                        if (field3347.length() != 6) {
                            class95.method197(class234.field2933, class234.field2825, class234.field2826);
                            return;
                        }
                        field2036 = Integer.parseInt(field3347);
                        field3347 = "";
                        client.method1155(true);
                        class95.method197(class234.field3018, class234.field2961, class234.field3020);
                        client.method3258(20);
                        return;
                    }
                    if (var50 && field3347.length() < 6) {
                        field3347 = field3347 + field336;
                    }
                }
            }
        } else if (class95.field1221 == 5) {
            int var52 = class95.field1216 + 180 - 80;
            short var53 = 321;
            if (var15 == 1 && var16 >= var52 - 75 && var16 <= var52 + 75 && var17 >= var53 - 20 && var17 <= var53 + 20) {
                class95.method23();
                return;
            }
            int var54 = class95.field1216 + 180 + 80;
            if (var15 == 1 && var16 >= var54 - 75 && var16 <= var54 + 75 && var17 >= var53 - 20 && var17 <= var53 + 20) {
                class95.method1954(true);
            }
            short var55 = 361;
            if (field1090 != null) {
                int var56 = field1090.field3878 / 2;
                if (var15 == 1 && var16 >= field1090.field3877 - var56 && var16 <= field1090.field3877 + var56 && var17 >= var55 - 15 && var17 < var55) {
                    class61.method2948(client.method1965("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                }
            }
            while (class55.method3331()) {
                boolean var57 = false;
                for (int var58 = 0; var58 < class95.field1220.length(); var58++) {
                    if (field336 == class95.field1220.charAt(var58)) {
                        var57 = true;
                        break;
                    }
                }
                if (field556 == 13) {
                    class95.method1954(true);
                } else {
                    if (field556 == 85 && class95.field1226.length() > 0) {
                        class95.field1226 = class95.field1226.substring(0, class95.field1226.length() - 1);
                    }
                    if (field556 == 84) {
                        class95.method23();
                        return;
                    }
                    if (var57 && class95.field1226.length() < 320) {
                        class95.field1226 = class95.field1226 + field336;
                    }
                }
            }
        } else if (class95.field1221 == 6) {
            while (true) {
                do {
                    if (!class55.method3331()) {
                        short var59 = 321;
                        if (var15 == 1 && var17 >= var59 - 20 && var17 <= var59 + 20) {
                            class95.method1954(true);
                        }
                        return;
                    }
                } while (field556 != 84 && field556 != 13);
                class95.method1954(true);
            }
        } else if (class95.field1221 == 7) {
            int var60 = class95.field1216 + 180 - 80;
            short var61 = 321;
            if (var15 == 1 && var16 >= var60 - 75 && var16 <= var60 + 75 && var17 >= var61 - 20 && var17 <= var61 + 20) {
                class61.method2948(client.method1965("secure", true) + "m=dob/set_dob.ws", true, false);
                class95.method197(class234.field2879, class234.field2986, class234.field3051);
                class95.field1221 = 6;
                return;
            }
            int var62 = class95.field1216 + 180 + 80;
            if (var15 == 1 && var16 >= var62 - 75 && var16 <= var62 + 75 && var17 >= var61 - 20 && var17 <= var61 + 20) {
                class95.method1954(true);
            }
        } else if (class95.field1221 == 8) {
            int var63 = class95.field1216 + 180 - 80;
            short var64 = 321;
            if (var15 == 1 && var16 >= var63 - 75 && var16 <= var63 + 75 && var17 >= var64 - 20 && var17 <= var64 + 20) {
                class61.method2948("https://www.jagex.com/terms/privacy", true, false);
                class95.method197(class234.field2879, class234.field2986, class234.field3051);
                class95.field1221 = 6;
                return;
            }
            int var65 = class95.field1216 + 180 + 80;
            if (var15 == 1 && var16 >= var65 - 75 && var16 <= var65 + 75 && var17 >= var64 - 20 && var17 <= var64 + 20) {
                class95.method1954(true);
            }
        } else if (class95.field1221 == 12) {
            String var66 = "";
            switch(class95.field1217) {
                case 0:
                    var66 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                    break;
                case 1:
                    var66 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                    break;
                default:
                    class95.method1954(false);
            }
            int var67 = class95.field1216 + 180;
            short var68 = 276;
            if (var15 == 1 && var16 >= var67 - 75 && var16 <= var67 + 75 && var17 >= var68 - 20 && var17 <= var68 + 20) {
                class61.method2948(var66, true, false);
                class95.method197(class234.field2879, class234.field2986, class234.field3051);
                class95.field1221 = 6;
                return;
            }
            int var69 = class95.field1216 + 180;
            short var70 = 326;
            if (var15 == 1 && var16 >= var69 - 75 && var16 <= var69 + 75 && var17 >= var70 - 20 && var17 <= var70 + 20) {
                class95.method1954(false);
            }
        } else if (class95.field1221 == 24) {
            int var71 = class95.field1216 + 180;
            short var72 = 301;
            if (var15 == 1 && var16 >= var71 - 75 && var16 <= var71 + 75 && var17 >= var72 - 20 && var17 <= var72 + 20) {
                class95.method1954(false);
            }
        }
    }

    @ObfuscatedName("gb.o(ILco;ZI)I")
    public static int method3474(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method3203(class86.field1121[--field2046]);
        } else {
            var3 = arg2 ? field622 : field1123;
        }
        String var4 = class86.field1122[--field1969];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = class86.field1121[--field2046];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = class86.field1121[--field2046];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = class86.field1122[--field1969];
            } else {
                var7[var8] = Integer.valueOf(class86.field1121[--field2046]);
            }
        }
        int var9 = class86.field1121[--field2046];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2682 = var7;
        } else if (arg0 == 1401) {
            var3.field2685 = var7;
        } else if (arg0 == 1402) {
            var3.field2638 = var7;
        } else if (arg0 == 1403) {
            var3.field2652 = var7;
        } else if (arg0 == 1404) {
            var3.field2726 = var7;
        } else if (arg0 == 1405) {
            var3.field2689 = var7;
        } else if (arg0 == 1406) {
            var3.field2692 = var7;
        } else if (arg0 == 1407) {
            var3.field2695 = var7;
            var3.field2694 = var5;
        } else if (arg0 == 1408) {
            var3.field2699 = var7;
        } else if (arg0 == 1409) {
            var3.field2700 = var7;
        } else if (arg0 == 1410) {
            var3.field2690 = var7;
        } else if (arg0 == 1411) {
            var3.field2721 = var7;
        } else if (arg0 == 1412) {
            var3.field2687 = var7;
        } else if (arg0 == 1414) {
            var3.field2625 = var7;
            var3.field2667 = var5;
        } else if (arg0 == 1415) {
            var3.field2697 = var7;
            var3.field2731 = var5;
        } else if (arg0 == 1416) {
            var3.field2691 = var7;
        } else if (arg0 == 1417) {
            var3.field2701 = var7;
        } else if (arg0 == 1418) {
            var3.field2642 = var7;
        } else if (arg0 == 1419) {
            var3.field2703 = var7;
        } else if (arg0 == 1420) {
            var3.field2704 = var7;
        } else if (arg0 == 1421) {
            var3.field2705 = var7;
        } else if (arg0 == 1422) {
            var3.field2706 = var7;
        } else if (arg0 == 1423) {
            var3.field2707 = var7;
        } else if (arg0 == 1424) {
            var3.field2708 = var7;
        } else if (arg0 == 1425) {
            var3.field2710 = var7;
        } else if (arg0 == 1426) {
            var3.field2670 = var7;
        } else if (arg0 == 1427) {
            var3.field2618 = var7;
        } else {
            return 2;
        }
        var3.field2680 = true;
        return 1;
    }

    @ObfuscatedName("y.j(ILco;ZB)I")
    public static int method133(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method3203(class86.field1121[--field2046]);
        if (arg0 == 2600) {
            class86.field1121[++field2046 - 1] = var3.field2622;
            return 1;
        } else if (arg0 == 2601) {
            class86.field1121[++field2046 - 1] = var3.field2616;
            return 1;
        } else if (arg0 == 2602) {
            class86.field1122[++field1969 - 1] = var3.field2655;
            return 1;
        } else if (arg0 == 2603) {
            class86.field1121[++field2046 - 1] = var3.field2617;
            return 1;
        } else if (arg0 == 2604) {
            class86.field1121[++field2046 - 1] = var3.field2733;
            return 1;
        } else if (arg0 == 2605) {
            class86.field1121[++field2046 - 1] = var3.field2648;
            return 1;
        } else if (arg0 == 2606) {
            class86.field1121[++field2046 - 1] = var3.field2645;
            return 1;
        } else if (arg0 == 2607) {
            class86.field1121[++field2046 - 1] = var3.field2711;
            return 1;
        } else if (arg0 == 2608) {
            class86.field1121[++field2046 - 1] = var3.field2686;
            return 1;
        } else if (arg0 == 2609) {
            class86.field1121[++field2046 - 1] = var3.field2666;
            return 1;
        } else if (arg0 == 2610) {
            class86.field1121[++field2046 - 1] = var3.field2626;
            return 1;
        } else if (arg0 == 2611) {
            class86.field1121[++field2046 - 1] = var3.field2580;
            return 1;
        } else if (arg0 == 2612) {
            class86.field1121[++field2046 - 1] = var3.field2620;
            return 1;
        } else if (arg0 == 2613) {
            class86.field1121[++field2046 - 1] = var3.field2619.method31();
            return 1;
        } else if (arg0 == 2614) {
            class86.field1121[++field2046 - 1] = var3.field2677 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.aq(ILco;ZI)I")
    public static int method208(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6500) {
            class86.field1121[++field2046 - 1] = class81.method3130() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class81 var3 = class81.method3118();
            if (var3 == null) {
                class86.field1121[++field2046 - 1] = -1;
                class86.field1121[++field2046 - 1] = 0;
                class86.field1122[++field1969 - 1] = "";
                class86.field1121[++field2046 - 1] = 0;
                class86.field1121[++field2046 - 1] = 0;
                class86.field1122[++field1969 - 1] = "";
            } else {
                class86.field1121[++field2046 - 1] = var3.field1049;
                class86.field1121[++field2046 - 1] = var3.field1051;
                class86.field1122[++field1969 - 1] = var3.field1054;
                class86.field1121[++field2046 - 1] = var3.field1044;
                class86.field1121[++field2046 - 1] = var3.field1053;
                class86.field1122[++field1969 - 1] = var3.field1055;
            }
            return 1;
        } else if (arg0 == 6502) {
            class81 var4 = class81.method3328();
            if (var4 == null) {
                class86.field1121[++field2046 - 1] = -1;
                class86.field1121[++field2046 - 1] = 0;
                class86.field1122[++field1969 - 1] = "";
                class86.field1121[++field2046 - 1] = 0;
                class86.field1121[++field2046 - 1] = 0;
                class86.field1122[++field1969 - 1] = "";
            } else {
                class86.field1121[++field2046 - 1] = var4.field1049;
                class86.field1121[++field2046 - 1] = var4.field1051;
                class86.field1122[++field1969 - 1] = var4.field1054;
                class86.field1121[++field2046 - 1] = var4.field1044;
                class86.field1121[++field2046 - 1] = var4.field1053;
                class86.field1122[++field1969 - 1] = var4.field1055;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = class86.field1121[--field2046];
            class81 var6 = null;
            for (int var7 = 0; var7 < class81.field1046; var7++) {
                if (field3829[var7].field1049 == var5) {
                    var6 = field3829[var7];
                    break;
                }
            }
            if (var6 == null) {
                class86.field1121[++field2046 - 1] = -1;
                class86.field1121[++field2046 - 1] = 0;
                class86.field1122[++field1969 - 1] = "";
                class86.field1121[++field2046 - 1] = 0;
                class86.field1121[++field2046 - 1] = 0;
                class86.field1122[++field1969 - 1] = "";
            } else {
                class86.field1121[++field2046 - 1] = var6.field1049;
                class86.field1121[++field2046 - 1] = var6.field1051;
                class86.field1122[++field1969 - 1] = var6.field1054;
                class86.field1121[++field2046 - 1] = var6.field1044;
                class86.field1121[++field2046 - 1] = var6.field1053;
                class86.field1122[++field1969 - 1] = var6.field1055;
            }
            return 1;
        } else if (arg0 == 6507) {
            field2046 -= 4;
            int var8 = class86.field1121[field2046];
            boolean var9 = class86.field1121[field2046 + 1] == 1;
            int var10 = class86.field1121[field2046 + 2];
            boolean var11 = class86.field1121[field2046 + 3] == 1;
            class81.method1731(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = class86.field1121[--field2046];
            if (var12 >= 0 && var12 < class81.field1046) {
                class81 var13 = field3829[var12];
                class86.field1121[++field2046 - 1] = var13.field1049;
                class86.field1121[++field2046 - 1] = var13.field1051;
                class86.field1122[++field1969 - 1] = var13.field1054;
                class86.field1121[++field2046 - 1] = var13.field1044;
                class86.field1121[++field2046 - 1] = var13.field1053;
                class86.field1122[++field1969 - 1] = var13.field1055;
            } else {
                class86.field1121[++field2046 - 1] = -1;
                class86.field1121[++field2046 - 1] = 0;
                class86.field1122[++field1969 - 1] = "";
                class86.field1121[++field2046 - 1] = 0;
                class86.field1121[++field2046 - 1] = 0;
                class86.field1122[++field1969 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field827 = class86.field1121[--field2046] == 1;
            return 1;
        } else if (arg0 == 6513) {
            field2046 -= 2;
            int var14 = class86.field1121[field2046];
            int var15 = class86.field1121[field2046 + 1];
            class261 var16 = class261.method2034(var15);
            if (var16.method4269()) {
                class86.field1122[++field1969 - 1] = class268.method3332(var14).method4478(var15, var16.field3332);
            } else {
                class86.field1121[++field2046 - 1] = class268.method3332(var14).method4477(var15, var16.field3331);
            }
            return 1;
        } else if (arg0 == 6514) {
            field2046 -= 2;
            int var17 = class86.field1121[field2046];
            int var18 = class86.field1121[field2046 + 1];
            class261 var19 = class261.method2034(var18);
            if (var19.method4269()) {
                class86.field1122[++field1969 - 1] = class265.method1122(var17).method4363(var18, var19.field3332);
            } else {
                class86.field1121[++field2046 - 1] = class265.method1122(var17).method4351(var18, var19.field3331);
            }
            return 1;
        } else if (arg0 == 6515) {
            field2046 -= 2;
            int var20 = class86.field1121[field2046];
            int var21 = class86.field1121[field2046 + 1];
            class261 var22 = class261.method2034(var21);
            if (var22.method4269()) {
                class86.field1122[++field1969 - 1] = class266.method335(var20).method4450(var21, var22.field3332);
            } else {
                class86.field1121[++field2046 - 1] = class266.method335(var20).method4439(var21, var22.field3331);
            }
            return 1;
        } else if (arg0 == 6516) {
            field2046 -= 2;
            int var23 = class86.field1121[field2046];
            int var24 = class86.field1121[field2046 + 1];
            class261 var25 = class261.method2034(var24);
            if (var25.method4269()) {
                class86.field1122[++field1969 - 1] = class262.method3420(var23).method4294(var24, var25.field3332);
            } else {
                class86.field1121[++field2046 - 1] = class262.method3420(var23).method4289(var24, var25.field3331);
            }
            return 1;
        } else if (arg0 == 6518) {
            class86.field1121[++field2046 - 1] = client.field688 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            class86.field1121[++field2046 - 1] = client.field686 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            field1969--;
            field2046--;
            return 1;
        } else if (arg0 == 6523) {
            field1969--;
            field2046--;
            return 1;
        } else if (arg0 == 6524) {
            class86.field1121[++field2046 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            class86.field1121[++field2046 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            class86.field1121[++field2046 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hk.aw(ILco;ZI)I")
    public static int method3682(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = field99;
            int var4 = (field3130.field1000 >> 7) + field1641;
            int var5 = (field3130.field976 >> 7) + field132;
            client.method794().method5938(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = class86.field1121[--field2046];
            String var7 = "";
            class36 var8 = client.method794().method5961(var6);
            if (var8 != null) {
                var7 = var8.method365();
            }
            class86.field1122[++field1969 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = class86.field1121[--field2046];
            client.method794().method5939(var9);
            return 1;
        } else if (arg0 == 6603) {
            class86.field1121[++field2046 - 1] = client.method794().method5953();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = class86.field1121[--field2046];
            client.method794().method5952(var10);
            return 1;
        } else if (arg0 == 6605) {
            class86.field1121[++field2046 - 1] = client.method794().method6037() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class223 var11 = new class223(class86.field1121[--field2046]);
            client.method794().method5968(var11.field2557, var11.field2554);
            return 1;
        } else if (arg0 == 6607) {
            class223 var12 = new class223(class86.field1121[--field2046]);
            client.method794().method5958(var12.field2557, var12.field2554);
            return 1;
        } else if (arg0 == 6608) {
            class223 var13 = new class223(class86.field1121[--field2046]);
            client.method794().method6113(var13.field2555, var13.field2557, var13.field2554);
            return 1;
        } else if (arg0 == 6609) {
            class223 var14 = new class223(class86.field1121[--field2046]);
            client.method794().method6104(var14.field2555, var14.field2557, var14.field2554);
            return 1;
        } else if (arg0 == 6610) {
            class86.field1121[++field2046 - 1] = client.method794().method6087();
            class86.field1121[++field2046 - 1] = client.method794().method5962();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = class86.field1121[--field2046];
            class36 var16 = client.method794().method5961(var15);
            if (var16 == null) {
                class86.field1121[++field2046 - 1] = 0;
            } else {
                class86.field1121[++field2046 - 1] = var16.method374().method3753();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = class86.field1121[--field2046];
            class36 var18 = client.method794().method5961(var17);
            if (var18 == null) {
                class86.field1121[++field2046 - 1] = 0;
                class86.field1121[++field2046 - 1] = 0;
            } else {
                class86.field1121[++field2046 - 1] = (var18.method416() - var18.method368() + 1) * 64;
                class86.field1121[++field2046 - 1] = (var18.method371() - var18.method370() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = class86.field1121[--field2046];
            class36 var20 = client.method794().method5961(var19);
            if (var20 == null) {
                class86.field1121[++field2046 - 1] = 0;
                class86.field1121[++field2046 - 1] = 0;
                class86.field1121[++field2046 - 1] = 0;
                class86.field1121[++field2046 - 1] = 0;
            } else {
                class86.field1121[++field2046 - 1] = var20.method368() * 64;
                class86.field1121[++field2046 - 1] = var20.method370() * 64;
                class86.field1121[++field2046 - 1] = var20.method416() * 64 + 64 - 1;
                class86.field1121[++field2046 - 1] = var20.method371() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = class86.field1121[--field2046];
            class36 var22 = client.method794().method5961(var21);
            if (var22 == null) {
                class86.field1121[++field2046 - 1] = -1;
            } else {
                class86.field1121[++field2046 - 1] = var22.method367();
            }
            return 1;
        } else if (arg0 == 6615) {
            class223 var23 = client.method794().method5963();
            if (var23 == null) {
                class86.field1121[++field2046 - 1] = -1;
                class86.field1121[++field2046 - 1] = -1;
            } else {
                class86.field1121[++field2046 - 1] = var23.field2557;
                class86.field1121[++field2046 - 1] = var23.field2554;
            }
            return 1;
        } else if (arg0 == 6616) {
            class86.field1121[++field2046 - 1] = client.method794().method5940();
            return 1;
        } else if (arg0 == 6617) {
            class223 var24 = new class223(class86.field1121[--field2046]);
            class36 var25 = client.method794().method5941();
            if (var25 == null) {
                class86.field1121[++field2046 - 1] = -1;
                class86.field1121[++field2046 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method359(var24.field2555, var24.field2557, var24.field2554);
            if (var26 == null) {
                class86.field1121[++field2046 - 1] = -1;
                class86.field1121[++field2046 - 1] = -1;
            } else {
                class86.field1121[++field2046 - 1] = var26[0];
                class86.field1121[++field2046 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class223 var27 = new class223(class86.field1121[--field2046]);
            class36 var28 = client.method794().method5941();
            if (var28 == null) {
                class86.field1121[++field2046 - 1] = -1;
                class86.field1121[++field2046 - 1] = -1;
                return 1;
            }
            class223 var29 = var28.method360(var27.field2557, var27.field2554);
            if (var29 == null) {
                class86.field1121[++field2046 - 1] = -1;
            } else {
                class86.field1121[++field2046 - 1] = var29.method3753();
            }
            return 1;
        } else if (arg0 == 6619) {
            field2046 -= 2;
            int var30 = class86.field1121[field2046];
            class223 var31 = new class223(class86.field1121[field2046 + 1]);
            class86.method664(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            field2046 -= 2;
            int var32 = class86.field1121[field2046];
            class223 var33 = new class223(class86.field1121[field2046 + 1]);
            class86.method664(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            field2046 -= 2;
            int var34 = class86.field1121[field2046];
            class223 var35 = new class223(class86.field1121[field2046 + 1]);
            class36 var36 = client.method794().method5961(var34);
            if (var36 == null) {
                class86.field1121[++field2046 - 1] = 0;
                return 1;
            } else {
                class86.field1121[++field2046 - 1] = var36.method357(var35.field2555, var35.field2557, var35.field2554) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            class86.field1121[++field2046 - 1] = client.method794().method5964();
            class86.field1121[++field2046 - 1] = client.method794().method5956();
            return 1;
        } else if (arg0 == 6623) {
            class223 var37 = new class223(class86.field1121[--field2046]);
            class36 var38 = client.method794().method6080(var37.field2555, var37.field2557, var37.field2554);
            if (var38 == null) {
                class86.field1121[++field2046 - 1] = -1;
            } else {
                class86.field1121[++field2046 - 1] = var38.method362();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method794().method5966(class86.field1121[--field2046]);
            return 1;
        } else if (arg0 == 6625) {
            client.method794().method6089();
            return 1;
        } else if (arg0 == 6626) {
            client.method794().method6045(class86.field1121[--field2046]);
            return 1;
        } else if (arg0 == 6627) {
            client.method794().method5969();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = class86.field1121[--field2046] == 1;
            client.method794().method5970(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = class86.field1121[--field2046];
            client.method794().method5971(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = class86.field1121[--field2046];
            client.method794().method5972(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method794().method5973();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = class86.field1121[--field2046] == 1;
            client.method794().method5959(var42);
            return 1;
        } else if (arg0 == 6633) {
            field2046 -= 2;
            int var43 = class86.field1121[field2046];
            boolean var44 = class86.field1121[field2046 + 1] == 1;
            client.method794().method5975(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            field2046 -= 2;
            int var45 = class86.field1121[field2046];
            boolean var46 = class86.field1121[field2046 + 1] == 1;
            client.method794().method5976(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            class86.field1121[++field2046 - 1] = client.method794().method5977() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = class86.field1121[--field2046];
            class86.field1121[++field2046 - 1] = client.method794().method5982(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = class86.field1121[--field2046];
            class86.field1121[++field2046 - 1] = client.method794().method5979(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            field2046 -= 2;
            int var49 = class86.field1121[field2046];
            class223 var50 = new class223(class86.field1121[field2046 + 1]);
            class223 var51 = client.method794().method5955(var49, var50);
            if (var51 == null) {
                class86.field1121[++field2046 - 1] = -1;
            } else {
                class86.field1121[++field2046 - 1] = var51.method3753();
            }
            return 1;
        } else if (arg0 == 6639) {
            class44 var52 = client.method794().method5984();
            if (var52 == null) {
                class86.field1121[++field2046 - 1] = -1;
                class86.field1121[++field2046 - 1] = -1;
            } else {
                class86.field1121[++field2046 - 1] = var52.method251();
                class86.field1121[++field2046 - 1] = var52.field317.method3753();
            }
            return 1;
        } else if (arg0 == 6640) {
            class44 var53 = client.method794().method5932();
            if (var53 == null) {
                class86.field1121[++field2046 - 1] = -1;
                class86.field1121[++field2046 - 1] = -1;
            } else {
                class86.field1121[++field2046 - 1] = var53.method251();
                class86.field1121[++field2046 - 1] = var53.field317.method3753();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = class86.field1121[--field2046];
            class253 var55 = class253.method3431(var54);
            if (var55.field3250 == null) {
                class86.field1122[++field1969 - 1] = "";
            } else {
                class86.field1122[++field1969 - 1] = var55.field3250;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = class86.field1121[--field2046];
            class253 var57 = class253.method3431(var56);
            class86.field1121[++field2046 - 1] = var57.field3247;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = class86.field1121[--field2046];
            class253 var59 = class253.method3431(var58);
            if (var59 == null) {
                class86.field1121[++field2046 - 1] = -1;
            } else {
                class86.field1121[++field2046 - 1] = var59.field3261;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = class86.field1121[--field2046];
            class253 var61 = class253.method3431(var60);
            if (var61 == null) {
                class86.field1121[++field2046 - 1] = -1;
            } else {
                class86.field1121[++field2046 - 1] = var61.field3260;
            }
            return 1;
        } else if (arg0 == 6697) {
            class86.field1121[++field2046 - 1] = field179.field380;
            return 1;
        } else if (arg0 == 6698) {
            class86.field1121[++field2046 - 1] = field179.field373.method3753();
            return 1;
        } else if (arg0 == 6699) {
            class86.field1121[++field2046 - 1] = field179.field374.method3753();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fp.hk(Lbz;B)V")
    public static final void method3310(class78 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field968 == 0) {
            var1 = field2412.method2978(arg0.field959, arg0.field961, arg0.field962);
        }
        if (arg0.field968 == 1) {
            var1 = field2412.method3067(arg0.field959, arg0.field961, arg0.field962);
        }
        if (arg0.field968 == 2) {
            var1 = field2412.method2980(arg0.field959, arg0.field961, arg0.field962);
        }
        if (arg0.field968 == 3) {
            var1 = field2412.method2981(arg0.field959, arg0.field961, arg0.field962);
        }
        if (var1 != 0L) {
            int var6 = field2412.method2982(arg0.field959, arg0.field961, arg0.field962, var1);
            var3 = class138.method1840(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field965 = var3;
        arg0.field960 = var4;
        arg0.field964 = var5;
    }

    @ObfuscatedName("av.hi(B)V")
    public static void method333() {
        client.field819 = 0;
        client.field818 = false;
    }

    @ObfuscatedName("dr.hu(I)V")
    public static void method2643() {
        client.method4225(field422 / 2 + field2558, field252);
    }

    @ObfuscatedName("jd.ht(II)V")
    public static final void method4312(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = client.field820[arg0];
        int var2 = client.field821[arg0];
        int var3 = client.field822[arg0];
        int var4 = client.field823[arg0];
        String var5 = client.field824[arg0];
        String var6 = client.field825[arg0];
        client.method3718(var1, var2, var3, var4, var5, var6, class64.field525, class64.field522);
    }

    @ObfuscatedName("ck.jo(IIIIIIII)V")
    public static final void method2154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class227.method1068(arg0)) {
            client.method1106(field2584[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("a.kv([BII)V")
    public static void method214(byte[] arg0, int arg1) {
        if (client.field909 == null) {
            client.field909 = new byte[24];
        }
        class312.method5411(arg0, arg1, client.field909, 0, 24);
    }
}
