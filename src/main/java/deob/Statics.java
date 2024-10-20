package deob;

import java.applet.Applet;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.Desktop.Action;
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
import java.net.URI;
import java.security.SecureRandom;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("v.be")
    public static int field100;

    @ObfuscatedName("j.di")
    public static class246 field103;

    @ObfuscatedName("ca.rb")
    public static int field1039;

    @ObfuscatedName("j.mr")
    public static int field105;

    @ObfuscatedName("cv.ac")
    public static int field1071;

    @ObfuscatedName("cv.et")
    public static int field1077;

    @ObfuscatedName("ce.ot")
    public static class100 field1081;

    @ObfuscatedName("ce.m")
    public static class334[] field1093;

    @ObfuscatedName("ci.s")
    public static int[] field1122;

    @ObfuscatedName("ci.w")
    public static int field1126;

    @ObfuscatedName("r.aa")
    public static class329 field113;

    @ObfuscatedName("r.aj")
    public static int field115;

    @ObfuscatedName("cu.d")
    public static class244 field1155;

    @ObfuscatedName("cu.l")
    public static int[] field1156;

    @ObfuscatedName("r.na")
    public static class227[] field116;

    @ObfuscatedName("cc.gh")
    public static int[] field1171;

    @ObfuscatedName("u.s")
    public static class244 field118;

    @ObfuscatedName("cf.j")
    public static class310 field1185;

    @ObfuscatedName("cj.g")
    public static byte[][] field1189;

    @ObfuscatedName("cx.w")
    public static class335 field1204;

    @ObfuscatedName("cx.k")
    public static boolean field1216;

    @ObfuscatedName("cx.a")
    public static class334 field1222;

    @ObfuscatedName("cx.bw")
    public static class334[] field1229;

    @ObfuscatedName("p.w")
    public static byte[][][] field123;

    @ObfuscatedName("b.ez")
    public static int field126;

    @ObfuscatedName("ck.qh")
    public static class108 field1277;

    @ObfuscatedName("co.q")
    public static class82 field1297;

    @ObfuscatedName("co.he")
    public static class335[] field1298;

    @ObfuscatedName("t.h")
    public static class227 field13;

    @ObfuscatedName("cz.n")
    public static class244 field1301;

    @ObfuscatedName("cz.sb")
    public static short[] field1303;

    @ObfuscatedName("cy.iz")
    public static int field1307;

    @ObfuscatedName("cb.fo")
    public static class305 field1320;

    @ObfuscatedName("cl.ln")
    public static int field1331;

    @ObfuscatedName("dx.cw")
    public static char field1351;

    @ObfuscatedName("dq.ix")
    public static int field1354;

    @ObfuscatedName("dv.go")
    public static class334[] field1364;

    @ObfuscatedName("dv.aw")
    public static int field1365;

    @ObfuscatedName("dk.f")
    public static int[] field1381;

    @ObfuscatedName("dk.e")
    public static float[] field1385;

    @ObfuscatedName("dk.x")
    public static byte[] field1386;

    @ObfuscatedName("dk.w")
    public static int field1387;

    @ObfuscatedName("dk.g")
    public static int field1388;

    @ObfuscatedName("dk.m")
    public static int field1389;

    @ObfuscatedName("dk.n")
    public static int field1390;

    @ObfuscatedName("dk.h")
    public static class114[] field1392;

    @ObfuscatedName("dk.ab")
    public static float[] field1393;

    @ObfuscatedName("dk.a")
    public static class121[] field1394;

    @ObfuscatedName("dk.q")
    public static class126[] field1397;

    @ObfuscatedName("ab.bl")
    public static String field140;

    @ObfuscatedName("dk.p")
    public static float[] field1402;

    @ObfuscatedName("dk.d")
    public static class110[] field1403;

    @ObfuscatedName("dk.l")
    public static float[] field1404;

    @ObfuscatedName("dk.c")
    public static boolean[] field1405;

    @ObfuscatedName("dk.b")
    public static float[] field1406;

    @ObfuscatedName("dk.ag")
    public static float[] field1407;

    @ObfuscatedName("dk.ao")
    public static float[] field1408;

    @ObfuscatedName("dk.ae")
    public static int[] field1409;

    @ObfuscatedName("ab.km")
    public static class76 field141;

    @ObfuscatedName("dk.an")
    public static int[] field1410;

    @ObfuscatedName("da.m")
    public static int[] field1419;

    @ObfuscatedName("da.d")
    public static boolean[] field1426;

    @ObfuscatedName("da.n")
    public static int[] field1429;

    @ObfuscatedName("dr.fb")
    public static long field1431;

    @ObfuscatedName("dr.o")
    public static boolean field1432;

    @ObfuscatedName("dr.w")
    public static ScheduledExecutorService field1433;

    @ObfuscatedName("dr.i")
    public static int field1448;

    @ObfuscatedName("dy.c")
    public static int field1464;

    @ObfuscatedName("ds.rp")
    public static int field1473;

    @ObfuscatedName("df.g")
    public static int field1492;

    @ObfuscatedName("du.w")
    public static float field1515;

    @ObfuscatedName("du.g")
    public static int field1516;

    @ObfuscatedName("ag.ay")
    public static GarbageCollectorMXBean field154;

    @ObfuscatedName("ag.gl")
    public static int field155;

    @ObfuscatedName("dt.ri")
    public static int field1562;

    @ObfuscatedName("ag.bu")
    public static class334 field157;

    @ObfuscatedName("eu.re")
    public static int field1641;

    @ObfuscatedName("eu.b")
    public static int field1642;

    @ObfuscatedName("eo.q")
    public static int[] field1653;

    @ObfuscatedName("ek.sg")
    public static class83 field1694;

    @ObfuscatedName("er.bg")
    public static int field1753;

    @ObfuscatedName("er.br")
    public static int field1754;

    @ObfuscatedName("er.bp")
    public static int field1755;

    @ObfuscatedName("ep.i")
    public static int field1769;

    @ObfuscatedName("ep.x")
    public static int field1770;

    @ObfuscatedName("ep.m")
    public static int field1771;

    @ObfuscatedName("ep.h")
    public static int field1772;

    @ObfuscatedName("eg.hg")
    public static int field1781;

    @ObfuscatedName("ae.g")
    public static int field179;

    @ObfuscatedName("eq.q")
    public static int field1790;

    @ObfuscatedName("eq.a")
    public static int field1799;

    @ObfuscatedName("eq.h")
    public static int field1800;

    @ObfuscatedName("eq.c")
    public static int field1801;

    @ObfuscatedName("eq.y")
    public static int field1802;

    @ObfuscatedName("eq.f")
    public static int field1803;

    @ObfuscatedName("eq.j")
    public static int field1805;

    @ObfuscatedName("eq.p")
    public static class149 field1808;

    @ObfuscatedName("eq.v")
    public static int field1812;

    @ObfuscatedName("em.dt")
    public static class246 field1821;

    @ObfuscatedName("em.a")
    public static class243 field1823;

    @ObfuscatedName("eh.sw")
    public static class318 field1825;

    @ObfuscatedName("eh.gf")
    public static int[] field1830;

    @ObfuscatedName("ec.b")
    public static int field1839;

    @ObfuscatedName("ec.f")
    public static int field1849;

    @ObfuscatedName("ec.y")
    public static int field1850;

    @ObfuscatedName("ec.v")
    public static int field1851;

    @ObfuscatedName("ec.u")
    public static int field1854;

    @ObfuscatedName("ec.p")
    public static int field1855;

    @ObfuscatedName("ec.l")
    public static int field1857;

    @ObfuscatedName("ec.e")
    public static int field1858;

    @ObfuscatedName("ec.be")
    public static int field1859;

    @ObfuscatedName("ec.ao")
    public static int field1861;

    @ObfuscatedName("ec.ae")
    public static int field1862;

    @ObfuscatedName("ec.r")
    public static int field1867;

    @ObfuscatedName("ec.ab")
    public static int field1877;

    @ObfuscatedName("ec.ag")
    public static int field1880;

    @ObfuscatedName("an.hc")
    public static int field189;

    @ObfuscatedName("ec.j")
    public static int field1890;

    @ObfuscatedName("ec.bp")
    public static boolean[][] field1893;

    @ObfuscatedName("ec.bn")
    public static int field1894;

    @ObfuscatedName("ec.bw")
    public static int field1895;

    @ObfuscatedName("ec.bu")
    public static int field1897;

    @ObfuscatedName("ec.ba")
    public static int field1898;

    @ObfuscatedName("ec.bm")
    public static int field1899;

    @ObfuscatedName("ej.s")
    public static class244 field1901;

    @ObfuscatedName("ej.sl")
    public static class248 field1902;

    @ObfuscatedName("ej.o")
    public static class334 field1904;

    @ObfuscatedName("ej.au")
    public static String field1905;

    @ObfuscatedName("ez.pe")
    public static class295 field1907;

    @ObfuscatedName("eb.gc")
    public static int[][] field1909;

    @ObfuscatedName("eb.c")
    public static int field1911;

    @ObfuscatedName("eb.nf")
    public static int field1919;

    @ObfuscatedName("et.m")
    public static int field1923;

    @ObfuscatedName("et.ha")
    public static int field1925;

    @ObfuscatedName("ef.f")
    public static class51 field1928;

    @ObfuscatedName("ew.le")
    public static class227 field1951;

    @ObfuscatedName("ew.dn")
    public static class246 field1953;

    @ObfuscatedName("an.gz")
    public static byte[][] field196;

    @ObfuscatedName("ev.dc")
    public static class246 field1980;

    @ObfuscatedName("ei.h")
    public static boolean field1987;

    @ObfuscatedName("t.es")
    public static class246 field20;

    @ObfuscatedName("fs.fu")
    public static class153 field2005;

    @ObfuscatedName("fs.f")
    public static String[] field2006;

    @ObfuscatedName("fv.rn")
    public static int field2014;

    @ObfuscatedName("fz.ml")
    public static int field2015;

    @ObfuscatedName("fk.ei")
    public static int[] field2018;

    @ObfuscatedName("fe.dj")
    public static class175 field2021;

    @ObfuscatedName("fe.m")
    public static short[][] field2022;

    @ObfuscatedName("fm.jo")
    public static class227 field2033;

    @ObfuscatedName("fm.x")
    public static int field2035;

    @ObfuscatedName("fi.x")
    public static byte[][][] field2050;

    @ObfuscatedName("am.d")
    public static int[] field207;

    @ObfuscatedName("fo.z")
    public static String field2071;

    @ObfuscatedName("fo.w")
    public static int[] field2074;

    @ObfuscatedName("fo.lp")
    public static class92 field2081;

    @ObfuscatedName("fo.k")
    public static String field2082;

    @ObfuscatedName("fn.t")
    public static File field2086;

    @ObfuscatedName("fn.i")
    public static File field2087;

    @ObfuscatedName("fn.q")
    public static class352[] field2094;

    @ObfuscatedName("fn.r")
    public static String field2095;

    @ObfuscatedName("fw.k")
    public static File field2098;

    @ObfuscatedName("fw.rt")
    public static int field2100;

    @ObfuscatedName("fh.er")
    public static class322 field2115;

    @ObfuscatedName("ap.ew")
    public static int field213;

    @ObfuscatedName("ft.df")
    public static class246 field2133;

    @ObfuscatedName("gx.i")
    public static int field2136;

    @ObfuscatedName("gx.o")
    public static int field2137;

    @ObfuscatedName("gx.dw")
    public static class246 field2141;

    @ObfuscatedName("ga.hq")
    public static int field2246;

    @ObfuscatedName("gc.gq")
    public static class335 field2359;

    @ObfuscatedName("gl.bw")
    public static String field2404;

    @ObfuscatedName("gg.o")
    public static class244 field2421;

    @ObfuscatedName("gg.q")
    public static int[][][] field2422;

    @ObfuscatedName("gg.sm")
    public static int field2424;

    @ObfuscatedName("go.h")
    public static class334 field2425;

    @ObfuscatedName("gi.d")
    public static class213 field2435;

    @ObfuscatedName("gi.k")
    public static class244 field2436;

    @ObfuscatedName("gi.t")
    public static class208 field2437;

    @ObfuscatedName("gi.w")
    public static int field2439;

    @ObfuscatedName("gi.n")
    public static boolean field2440;

    @ObfuscatedName("gi.z")
    public static class244 field2441;

    @ObfuscatedName("ge.br")
    public static class335[] field2469;

    @ObfuscatedName("he.bn")
    public static class334[] field2491;

    @ObfuscatedName("ar.sk")
    public static class341 field250;

    @ObfuscatedName("at.av")
    public static class332 field251;

    @ObfuscatedName("hb.ar")
    public static class329 field2520;

    @ObfuscatedName("hh.i")
    public static class81[] field2523;

    @ObfuscatedName("hh.g")
    public static class334 field2525;

    @ObfuscatedName("hi.bz")
    public static class240 field2526;

    @ObfuscatedName("hi.s")
    public static class244 field2530;

    @ObfuscatedName("hk.x")
    public static short[] field2536;

    @ObfuscatedName("hp.k")
    public static long field2537;

    @ObfuscatedName("hp.o")
    public static int field2538;

    @ObfuscatedName("at.w")
    public static short[][] field254;

    @ObfuscatedName("ht.o")
    public static Thread field2543;

    @ObfuscatedName("ht.kk")
    public static int field2544;

    @ObfuscatedName("ht.du")
    public static class246 field2545;

    @ObfuscatedName("ho.z")
    public static class219 field2546;

    @ObfuscatedName("ho.ns")
    public static int field2548;

    @ObfuscatedName("hz.w")
    public static int field2553;

    @ObfuscatedName("hv.m")
    public static int field2559;

    @ObfuscatedName("ha.ee")
    public static class246 field2580;

    @ObfuscatedName("ha.dg")
    public static class246 field2581;

    @ObfuscatedName("ha.cq")
    public static int field2582;

    @ObfuscatedName("hc.c")
    public static class310 field2584;

    @ObfuscatedName("hu.rs")
    public static int field2593;

    @ObfuscatedName("hq.x")
    public static class227[][] field2597;

    @ObfuscatedName("hq.g")
    public static class244 field2598;

    @ObfuscatedName("t.n")
    public static int field26;

    @ObfuscatedName("aq.gx")
    public static int field263;

    @ObfuscatedName("aq.do")
    public static class246 field264;

    @ObfuscatedName("hq.m")
    public static class244 field2700;

    @ObfuscatedName("hs.g")
    public static int field2750;

    @ObfuscatedName("hs.n")
    public static class334 field2751;

    @ObfuscatedName("al.u")
    public static String field278;

    @ObfuscatedName("hm.o")
    public static class244 field2792;

    @ObfuscatedName("hw.mx")
    public static int field2793;

    @ObfuscatedName("ah.g")
    public static int[][] field283;

    @ObfuscatedName("ah.h")
    public static class118 field285;

    @ObfuscatedName("av.dl")
    public static class246 field291;

    @ObfuscatedName("av.t")
    public static String[] field293;

    @ObfuscatedName("av.ev")
    public static SecureRandom field295;

    @ObfuscatedName("av.i")
    public static int field296;

    @ObfuscatedName("ax.jc")
    public static class129 field298;

    @ObfuscatedName("k.z")
    public static class244 field3;

    @ObfuscatedName("as.dm")
    public static class246 field301;

    @ObfuscatedName("i.fd")
    public static class305 field31;

    @ObfuscatedName("ia.d")
    public static int field3101;

    @ObfuscatedName("as.sy")
    public static class16 field311;

    @ObfuscatedName("iz.hb")
    public static class335[] field3111;

    @ObfuscatedName("ix.d")
    public static class334 field3135;

    @ObfuscatedName("io.ds")
    public static class246 field3159;

    @ObfuscatedName("az.h")
    public static class180 field316;

    @ObfuscatedName("az.bp")
    public static class334[] field317;

    @ObfuscatedName("ip.ba")
    public static class334 field3182;

    @ObfuscatedName("ii.z")
    public static class315 field3195;

    @ObfuscatedName("ii.s")
    public static long field3196;

    @ObfuscatedName("it.jh")
    public static class227 field3227;

    @ObfuscatedName("iq.z")
    public static class244 field3230;

    @ObfuscatedName("ik.k")
    public static int field3232;

    @ObfuscatedName("ik.z")
    public static class244 field3235;

    @ObfuscatedName("iv.k")
    public static class252[] field3236;

    @ObfuscatedName("iv.s")
    public static int field3238;

    @ObfuscatedName("iv.z")
    public static class244 field3256;

    @ObfuscatedName("ib.z")
    public static class244 field3258;

    @ObfuscatedName("ih.gs")
    public static int field3262;

    @ObfuscatedName("ih.z")
    public static class244 field3275;

    @ObfuscatedName("ih.k")
    public static class244 field3279;

    @ObfuscatedName("iu.z")
    public static class244 field3285;

    @ObfuscatedName("ie.k")
    public static class244 field3289;

    @ObfuscatedName("ie.z")
    public static class244 field3291;

    @ObfuscatedName("ie.s")
    public static int field3292;

    @ObfuscatedName("ir.k")
    public static class244 field3302;

    @ObfuscatedName("ir.z")
    public static class244 field3309;

    @ObfuscatedName("iy.hf")
    public static class335[] field3320;

    @ObfuscatedName("iy.z")
    public static class244 field3322;

    @ObfuscatedName("il.z")
    public static class244 field3331;

    @ObfuscatedName("jj.z")
    public static class244 field3335;

    @ObfuscatedName("jp.z")
    public static class244 field3338;

    @ObfuscatedName("jd.s")
    public static class244 field3347;

    @ObfuscatedName("jd.z")
    public static class244 field3348;

    @ObfuscatedName("jd.k")
    public static class244 field3365;

    @ObfuscatedName("jg.s")
    public static int field3372;

    @ObfuscatedName("jg.k")
    public static class244 field3406;

    @ObfuscatedName("jq.x")
    public static class244 field3427;

    @ObfuscatedName("jq.w")
    public static boolean field3428;

    @ObfuscatedName("jq.fn")
    public static class305 field3455;

    @ObfuscatedName("ai.qs")
    public static class115 field346;

    @ObfuscatedName("ai.lz")
    public static int field347;

    @ObfuscatedName("ai.ft")
    public static int field348;

    @ObfuscatedName("jx.k")
    public static class244 field3485;

    @ObfuscatedName("jx.z")
    public static class244 field3514;

    @ObfuscatedName("aj.ey")
    public static int field353;

    @ObfuscatedName("jm.k")
    public static class244 field3544;

    @ObfuscatedName("jm.z")
    public static class244 field3546;

    @ObfuscatedName("aj.bi")
    public static class348 field356;

    @ObfuscatedName("ja.ae")
    public static Font field3576;

    @ObfuscatedName("jk.gi")
    public static class335[] field3582;

    @ObfuscatedName("jn.gd")
    public static byte[][] field3616;

    @ObfuscatedName("js.rj")
    public static int field3621;

    @ObfuscatedName("aw.en")
    public static class246 field363;

    @ObfuscatedName("km.lj")
    public static class227 field3636;

    @ObfuscatedName("ku.t")
    public static int[] field3648;

    @ObfuscatedName("kh.i")
    public static class334 field3667;

    @ObfuscatedName("kt.o")
    public static byte[][][] field3669;

    @ObfuscatedName("kd.h")
    public static class109 field3679;

    @ObfuscatedName("kz.v")
    public static int field3688;

    @ObfuscatedName("kz.gg")
    public static class335 field3689;

    @ObfuscatedName("af.eb")
    public static int field369;

    @ObfuscatedName("kz.eo")
    public static class246 field3690;

    @ObfuscatedName("w.be")
    public static class334 field37;

    @ObfuscatedName("af.m")
    public static class154 field370;

    @ObfuscatedName("kj.m")
    public static class334[] field3718;

    @ObfuscatedName("af.h")
    public static int[] field372;

    @ObfuscatedName("ki.z")
    public static long field3724;

    @ObfuscatedName("ky.aa")
    public static Image field3726;

    @ObfuscatedName("ky.hu")
    public static int field3729;

    @ObfuscatedName("kg.cc")
    public static class73 field3739;

    @ObfuscatedName("kg.g")
    public static byte[][][] field3742;

    @ObfuscatedName("kg.x")
    public static int[] field3744;

    @ObfuscatedName("kg.w")
    public static int[] field3745;

    @ObfuscatedName("li.bn")
    public static String field3772;

    @ObfuscatedName("lg.p")
    public static String field3852;

    @ObfuscatedName("lg.x")
    public static class335 field3853;

    @ObfuscatedName("lr.w")
    public static boolean[] field3875;

    @ObfuscatedName("lv.ao")
    public static int field3879;

    @ObfuscatedName("lv.ae")
    public static int field3880;

    @ObfuscatedName("lv.ag")
    public static int[] field3882;

    @ObfuscatedName("lj.s")
    public static int field3913;

    @ObfuscatedName("lj.z")
    public static int field3915;

    @ObfuscatedName("lj.i")
    public static int[] field3916;

    @ObfuscatedName("lj.o")
    public static int[] field3917;

    @ObfuscatedName("lj.k")
    public static int field3918;

    @ObfuscatedName("lj.x")
    public static int[] field3920;

    @ObfuscatedName("lh.r")
    public static int field3923;

    @ObfuscatedName("bl.gk")
    public static int field397;

    @ObfuscatedName("w.g")
    public static int[] field40;

    @ObfuscatedName("ma.o")
    public static int field4041;

    @ObfuscatedName("mc.qy")
    public static class115 field4044;

    @ObfuscatedName("me.k")
    public static String field4072;

    @ObfuscatedName("me.z")
    public static Applet field4073;

    @ObfuscatedName("w.if")
    public static int field41;

    @ObfuscatedName("bz.dr")
    public static long field429;

    @ObfuscatedName("bj.fl")
    public static class303 field430;

    @ObfuscatedName("bj.lf")
    public static int field433;

    @ObfuscatedName("bi.a")
    public static class227 field439;

    @ObfuscatedName("g.rf")
    public static int field44;

    @ObfuscatedName("bg.bp")
    public static class200 field441;

    @ObfuscatedName("bg.g")
    public static int field443;

    @ObfuscatedName("g.pv")
    public static boolean field45;

    @ObfuscatedName("bp.a")
    public static int[] field454;

    @ObfuscatedName("bp.ah")
    public static String field455;

    @ObfuscatedName("bp.sa")
    public static class84 field456;

    @ObfuscatedName("bp.ef")
    public static int field457;

    @ObfuscatedName("bw.l")
    public static int field475;

    @ObfuscatedName("bw.z")
    public static class176 field489;

    @ObfuscatedName("bw.ai")
    public static boolean field491;

    @ObfuscatedName("be.fg")
    public static class315 field509;

    @ObfuscatedName("be.ij")
    public static int field516;

    @ObfuscatedName("bu.i")
    public static byte[][][] field522;

    @ObfuscatedName("bu.g")
    public static int field523;

    @ObfuscatedName("bu.n")
    public static int[] field524;

    @ObfuscatedName("bu.t")
    public static byte[][][] field529;

    @ObfuscatedName("bu.m")
    public static int[] field531;

    @ObfuscatedName("bu.bh")
    public static class241 field533;

    @ObfuscatedName("m.ql")
    public static class122 field54;

    @ObfuscatedName("bd.hx")
    public static class335[] field546;

    @ObfuscatedName("bb.dk")
    public static class315 field552;

    @ObfuscatedName("bb.sf")
    public static long field554;

    @ObfuscatedName("bb.ec")
    public static String field560;

    @ObfuscatedName("bx.y")
    public static String[] field571;

    @ObfuscatedName("by.dq")
    public static boolean field587;

    @ObfuscatedName("by.h")
    public static class305 field588;

    @ObfuscatedName("by.gb")
    public static class143 field596;

    @ObfuscatedName("by.gy")
    public static int field598;

    @ObfuscatedName("by.sz")
    public static int field600;

    @ObfuscatedName("bo.eu")
    public static class246 field609;

    @ObfuscatedName("bo.rc")
    public static int field610;

    @ObfuscatedName("bo.fc")
    public static class175 field611;

    @ObfuscatedName("q.hn")
    public static class334[] field62;

    @ObfuscatedName("bk.sx")
    public static class343 field626;

    @ObfuscatedName("bv.dp")
    public static class246 field630;

    @ObfuscatedName("bv.an")
    public static FontMetrics field632;

    @ObfuscatedName("bv.qm")
    public static class335 field633;

    @ObfuscatedName("q.im")
    public static int field65;

    @ObfuscatedName("bf.oa")
    public static class178 field664;

    @ObfuscatedName("bf.pp")
    public static class320 field665;

    @ObfuscatedName("k.m")
    public static class117 field7;

    @ObfuscatedName("c.ga")
    public static int[] field73;

    @ObfuscatedName("client.lk")
    public static int field798;

    @ObfuscatedName("f.ji")
    public static class227 field80;

    @ObfuscatedName("f.hj")
    public static class334[] field82;

    @ObfuscatedName("f.dz")
    public static class246 field83;

    @ObfuscatedName("y.g")
    public static short[] field84;

    @ObfuscatedName("y.t")
    public static class334[] field85;

    @ObfuscatedName("client.dy")
    public static class246 field853;

    @ObfuscatedName("client.ge")
    public static class335[] field879;

    @ObfuscatedName("s.ak")
    public static client field9;

    @ObfuscatedName("client.nb")
    public static int field948;

    @ObfuscatedName("client.ej")
    public static int field955;

    @ObfuscatedName("ks.z(Ljava/lang/CharSequence;I)Ljava/lang/String;")
    public static String method4970(CharSequence arg0) {
        int var1 = arg0.length();
        StringBuilder var2 = new StringBuilder(var1);
        for (int var3 = 0; var3 < var1; var3++) {
            char var4 = arg0.charAt(var3);
            if (!(var4 < 'a' || var4 > 'z') || !(var4 < 'A' || var4 > 'Z') || !(var4 < '0' || var4 > '9') || var4 == '.' || var4 == '-' || var4 == '*' || var4 == '_') {
                var2.append(var4);
            } else if (var4 == ' ') {
                var2.append('+');
            } else {
                byte var5 = class298.method3841(var4);
                var2.append('%');
                int var6 = var5 >> 4 & 0xF;
                if (var6 >= 10) {
                    var2.append((char) (var6 + 55));
                } else {
                    var2.append((char) (var6 + 48));
                }
                int var7 = var5 & 0xF;
                if (var7 >= 10) {
                    var2.append((char) (var7 + 55));
                } else {
                    var2.append((char) (var7 + 48));
                }
            }
        }
        return var2.toString();
    }

    @ObfuscatedName("j.z(Lmu;B)I")
    public static final int method177(class348 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field4064) {
                case 7:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("v.z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lgn;I)I")
    public static int method160(CharSequence arg0, CharSequence arg1, class200 arg2) {
        int var3 = arg0.length();
        int var4 = arg1.length();
        int var5 = 0;
        int var6 = 0;
        byte var7 = 0;
        char var8 = 0;
        while (var5 - var7 < var3 || var6 - var8 < var4) {
            if (var5 - var7 >= var3) {
                return -1;
            }
            if (var6 - var8 >= var4) {
                return 1;
            }
            char var21;
            if (var7 == 0) {
                var21 = arg0.charAt(var5++);
            } else {
                var21 = (char) var7;
                boolean var22 = false;
            }
            char var23;
            if (var8 == 0) {
                var23 = arg1.charAt(var6++);
            } else {
                var23 = var8;
                boolean var24 = false;
            }
            byte var25;
            if (var21 == 198) {
                var25 = 69;
            } else if (var21 == 230) {
                var25 = 101;
            } else if (var21 == 223) {
                var25 = 115;
            } else if (var21 == 338) {
                var25 = 69;
            } else if (var21 == 339) {
                var25 = 101;
            } else {
                var25 = 0;
            }
            var7 = var25;
            var8 = class297.method1710(var23);
            char var26 = class297.method2024(var21, arg2);
            char var27 = class297.method2024(var23, arg2);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class297.method767(var28, arg2) - class297.method767(var29, arg2);
                }
            }
        }
        int var9 = Math.min(var3, var4);
        for (int var10 = 0; var10 < var9; var10++) {
            int var11;
            int var12;
            if (class200.field2395 == arg2) {
                var11 = var3 - 1 - var10;
                var12 = var4 - 1 - var10;
            } else {
                var12 = var10;
                var11 = var10;
            }
            char var13 = arg0.charAt(var11);
            char var14 = arg1.charAt(var12);
            if (var13 != var14 && Character.toUpperCase(var13) != Character.toUpperCase(var14)) {
                char var15 = Character.toLowerCase(var13);
                char var16 = Character.toLowerCase(var14);
                if (var15 != var16) {
                    return class297.method767(var15, arg2) - class297.method767(var16, arg2);
                }
            }
        }
        int var17 = var3 - var4;
        if (var17 != 0) {
            return var17;
        }
        for (int var18 = 0; var18 < var9; var18++) {
            char var19 = arg0.charAt(var18);
            char var20 = arg1.charAt(var18);
            if (var19 != var20) {
                return class297.method767(var19, arg2) - class297.method767(var20, arg2);
            }
        }
        return 0;
    }

    @ObfuscatedName("ez.z(Lic;Lic;B)V")
    public static void method3136(class244 arg0, class244 arg1) {
        field3291 = arg0;
        field3289 = arg1;
        field3292 = field3291.method3884(3);
    }

    @ObfuscatedName("gz.k(Lky;I)V")
    public static void method3421(class309 arg0) {
        class107 var1 = (class107) class106.field1355.method4551();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field3734;
        arg0.method5295(var1.field1362);
        for (int var3 = 0; var3 < var1.field1357; var3++) {
            if (var1.field1356[var3] == 0) {
                try {
                    int var4 = var1.field1359[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field1360[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method5177(0);
                        arg0.method5295(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field1360[var3];
                        var7.setInt((Object) null, var1.field1361[var3]);
                        arg0.method5177(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field1360[var3];
                        int var9 = var8.getModifiers();
                        arg0.method5177(0);
                        arg0.method5295(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field1363[var3];
                        byte[][] var11 = var1.field1358[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method5177(0);
                        } else if (var15 instanceof Number) {
                            arg0.method5177(1);
                            arg0.method5182(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method5177(2);
                            arg0.method5322((String) var15);
                        } else {
                            arg0.method5177(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field1363[var3];
                        int var17 = var16.getModifiers();
                        arg0.method5177(0);
                        arg0.method5295(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method5177(-10);
                } catch (InvalidClassException var31) {
                    arg0.method5177(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method5177(-12);
                } catch (OptionalDataException var33) {
                    arg0.method5177(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method5177(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method5177(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method5177(-16);
                } catch (SecurityException var37) {
                    arg0.method5177(-17);
                } catch (IOException var38) {
                    arg0.method5177(-18);
                } catch (NullPointerException var39) {
                    arg0.method5177(-19);
                } catch (Exception var40) {
                    arg0.method5177(-20);
                } catch (Throwable var41) {
                    arg0.method5177(-21);
                }
            } else {
                arg0.method5177(var1.field1356[var3]);
            }
        }
        arg0.method5209(var2);
        var1.method3401();
    }

    @ObfuscatedName("l.s(Ljava/lang/String;ZLjava/lang/String;ZS)V")
    public static void method221(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            class61.method5028(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (class61.field452.startsWith("win") && !arg3) {
            class61.method5028(arg0, 0);
            return;
        }
        if (class61.field452.startsWith("mac")) {
            class61.method324(arg0, 1, arg2);
            return;
        }
        class61.method5028(arg0, 2);
    }

    @ObfuscatedName("ao.z(IS)Liv;")
    public static class252 method285(int arg0) {
        return arg0 < 0 || arg0 >= field3236.length || field3236[arg0] == null ? new class252(arg0) : field3236[arg0];
    }

    @ObfuscatedName("bg.s(I)V")
    public static void method763() {
        while (true) {
            class272 var0 = class245.field3178;
            class242 var1;
            synchronized (class245.field3178) {
                var1 = (class242) class245.field3179.method4619();
            }
            if (var1 == null) {
                return;
            }
            var1.field3153.method3979(var1.field3154, (int) var1.field2157, var1.field3152, false);
        }
    }

    @ObfuscatedName("aj.k(Ljava/awt/Component;I)V")
    public static void method628(Component arg0) {
        arg0.removeMouseListener(class64.field507);
        arg0.removeMouseMotionListener(class64.field507);
        arg0.removeFocusListener(class64.field507);
        class64.field499 = 0;
    }

    @ObfuscatedName("t.z(I)[Lt;")
    public static class4[] method30() {
        return new class4[] { class4.field24, class4.field14, class4.field25 };
    }

    @ObfuscatedName("jm.i(II)V")
    public static void method4530(int arg0) {
        class69 var1 = (class69) class69.field555.method5611((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field553.length; var2++) {
                var1.field553[var2] = -1;
                var1.field557[var2] = 0;
            }
        }
    }

    @ObfuscatedName("al.m(Ljava/lang/String;I)V")
    public static final void method535(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class234 var10001 = (class234) null;
        StringBuilder var2 = var10000.append(class234.field2974).append(arg0);
        class234 var3 = (class234) null;
        String var1 = var2.append(class234.field2975).toString();
        class101.method317(30, "", var1);
    }

    @ObfuscatedName("dy.o(Ljava/lang/CharSequence;II[BII)I")
    public static int method2378(CharSequence arg0, int arg1, int arg2, byte[] arg3, int arg4) {
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

    @ObfuscatedName("fm.x([BIILec;[Lft;B)V")
    public static final void method3253(byte[] arg0, int arg1, int arg2, class143 arg3, class182[] arg4) {
        class310 var5 = new class310(arg0);
        int var6 = -1;
        while (true) {
            int var7 = var5.method5208();
            if (var7 == 0) {
                return;
            }
            var6 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var5.method5207();
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 & 0x3F;
                int var11 = var8 >> 6 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var5.method5193();
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg1 + var11;
                int var17 = arg2 + var10;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((class65.field519[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class182 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    class65.method103(var12, var16, var17, var6, var15, var14, arg3, var19);
                }
            }
        }
    }

    @ObfuscatedName("cd.m(I)Llp;")
    public static class335 method1973() {
        class335 var0 = new class335();
        var0.field3911 = field3918;
        var0.field3904 = field3913;
        var0.field3902 = field3648[0];
        var0.field3901 = field3916[0];
        var0.field3905 = field3917[0];
        var0.field3907 = field3920[0];
        int var1 = var0.field3907 * var0.field3905;
        byte[] var2 = field1189[0];
        var0.field3906 = new int[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            var0.field3906[var3] = field2074[var2[var3] & 0xFF];
        }
        field3648 = null;
        field3916 = null;
        field3917 = null;
        field3920 = null;
        field2074 = null;
        field1189 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("am.k(I)Ljava/lang/String;")
    public static String method316() {
        return field1694.field1091 ? class301.method5029(class95.field1220) : class95.field1220;
    }

    @ObfuscatedName("bm.d(ILcy;ZI)I")
    public static int method1056(int arg0, class102 arg1, boolean arg2) {
        class227 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class227.method2021(class86.field1125[--field1126]);
        } else {
            var3 = arg2 ? field439 : field13;
        }
        String var4 = class86.field1127[--field2559];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = class86.field1125[--field1126];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = class86.field1125[--field1126];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = class86.field1127[--field2559];
            } else {
                var7[var8] = Integer.valueOf(class86.field1125[--field1126]);
            }
        }
        int var9 = class86.field1125[--field1126];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2696 = var7;
        } else if (arg0 == 1401) {
            var3.field2697 = var7;
        } else if (arg0 == 1402) {
            var3.field2680 = var7;
        } else if (arg0 == 1403) {
            var3.field2698 = var7;
        } else if (arg0 == 1404) {
            var3.field2739 = var7;
        } else if (arg0 == 1405) {
            var3.field2701 = var7;
        } else if (arg0 == 1406) {
            var3.field2704 = var7;
        } else if (arg0 == 1407) {
            var3.field2705 = var7;
            var3.field2706 = var5;
        } else if (arg0 == 1408) {
            var3.field2660 = var7;
        } else if (arg0 == 1409) {
            var3.field2712 = var7;
        } else if (arg0 == 1410) {
            var3.field2702 = var7;
        } else if (arg0 == 1411) {
            var3.field2633 = var7;
        } else if (arg0 == 1412) {
            var3.field2699 = var7;
        } else if (arg0 == 1414) {
            var3.field2681 = var7;
            var3.field2708 = var5;
        } else if (arg0 == 1415) {
            var3.field2606 = var7;
            var3.field2710 = var5;
        } else if (arg0 == 1416) {
            var3.field2744 = var7;
        } else if (arg0 == 1417) {
            var3.field2713 = var7;
        } else if (arg0 == 1418) {
            var3.field2631 = var7;
        } else if (arg0 == 1419) {
            var3.field2715 = var7;
        } else if (arg0 == 1420) {
            var3.field2716 = var7;
        } else if (arg0 == 1421) {
            var3.field2745 = var7;
        } else if (arg0 == 1422) {
            var3.field2718 = var7;
        } else if (arg0 == 1423) {
            var3.field2719 = var7;
        } else if (arg0 == 1424) {
            var3.field2600 = var7;
        } else if (arg0 == 1425) {
            var3.field2722 = var7;
        } else if (arg0 == 1426) {
            var3.field2723 = var7;
        } else if (arg0 == 1427) {
            var3.field2721 = var7;
        } else {
            return 2;
        }
        var3.field2692 = true;
        return 1;
    }

    @ObfuscatedName("aa.b(ILcy;ZI)I")
    public static int method331(int arg0, class102 arg1, boolean arg2) {
        class227 var3 = class227.method2021(class86.field1125[--field1126]);
        if (arg0 == 2800) {
            class86.field1125[++field1126 - 1] = class228.method142(client.method262(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = class86.field1125[--field1126];
            int var5 = var4 - 1;
            if (var3.field2686 == null || var5 >= var3.field2686.length || var3.field2686[var5] == null) {
                class86.field1127[++field2559 - 1] = "";
            } else {
                class86.field1127[++field2559 - 1] = var3.field2686[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2685 == null) {
                class86.field1127[++field2559 - 1] = "";
            } else {
                class86.field1127[++field2559 - 1] = var3.field2685;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ks.fb(IIB)V")
    public static void method4971(int arg0, int arg1) {
        if (client.field911 != 0 && arg0 != -1) {
            class207.method2136(field83, arg0, 0, client.field911, false);
            client.field705 = true;
        }
    }

    @ObfuscatedName("an.fc(I)V")
    public static final void method312() {
        if (field2544 == client.field903) {
            return;
        }
        client.field903 = field2544;
        int var0 = field2544;
        int[] var1 = field633.field3906;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class65.field519[var0][var6][var4] & 0x18) == 0) {
                    field596.method2980(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class65.field519[var0 + 1][var6][var4] & 0x8) != 0) {
                    field596.method2980(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        field633.method5775();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class65.field519[var0][var10][var9] & 0x18) == 0) {
                    client.method2145(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class65.field519[var0 + 1][var10][var9] & 0x8) != 0) {
                    client.method2145(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        client.field775 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = field596.method2975(field2544, var11, var12);
                if (var13 != 0L) {
                    int var15 = class138.method3219(var13);
                    int var16 = class264.method3595(var15).field3400;
                    if (var16 >= 0) {
                        client.field952[client.field775] = method285(var16).method4089(false);
                        client.field843[client.field775] = var11;
                        client.field906[client.field775] = var12;
                        client.field775++;
                    }
                }
            }
        }
        field251.method5728();
    }

    @ObfuscatedName("y.ho(I)V")
    public static void method130() {
        client.method419(field433 / 2 + field1331, field798);
    }

    @ObfuscatedName("bu.hd(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method1010(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (client.field813 || client.field815 >= 500) {
            return;
        }
        client.field820[client.field815] = arg0;
        client.field821[client.field815] = arg1;
        client.field818[client.field815] = arg2;
        client.field819[client.field815] = arg3;
        client.field816[client.field815] = arg4;
        client.field817[client.field815] = arg5;
        client.field898[client.field815] = arg6;
        client.field815++;
    }

    @ObfuscatedName("hh.kk(I)V")
    public static final void method3686() {
        class197 var0 = class197.method1625(class193.field2325, client.field723.field1341);
        var0.field2377.method5177(0);
        client.field723.method2159(var0);
    }
}
