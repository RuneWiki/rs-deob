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
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ScheduledExecutorService;
import javax.imageio.ImageIO;

public class Statics {

    @ObfuscatedName("q.dy")
    public static String field10;

    @ObfuscatedName("client.cq")
    public static class238 field1035;

    @ObfuscatedName("client.bs")
    public static class233 field1111;

    @ObfuscatedName("by.au")
    public static Image field1189;

    @ObfuscatedName("cj.pr")
    public static int field1199;

    @ObfuscatedName("cl.fn")
    public static byte[][] field1251;

    @ObfuscatedName("cl.cn")
    public static class238 field1256;

    @ObfuscatedName("cc.e")
    public static class81[] field1263;

    @ObfuscatedName("cc.r")
    public static class78 field1268;

    @ObfuscatedName("cg.x")
    public static int[] field1303;

    @ObfuscatedName("cg.y")
    public static String[] field1314;

    @ObfuscatedName("cg.t")
    public static int field1315;

    @ObfuscatedName("ch.o")
    public static class106 field1326;

    @ObfuscatedName("cf.i")
    public static class236 field1338;

    @ObfuscatedName("cf.v")
    public static short[] field1339;

    @ObfuscatedName("cf.er")
    public static class160 field1340;

    @ObfuscatedName("cf.ez")
    public static class264 field1341;

    @ObfuscatedName("cs.bi")
    public static class285[] field1360;

    @ObfuscatedName("cs.bc")
    public static class72 field1365;

    @ObfuscatedName("cy.gs")
    public static int field1366;

    @ObfuscatedName("cy.kn")
    public static class217 field1373;

    @ObfuscatedName("cz.f")
    public static int field1378;

    @ObfuscatedName("cz.r")
    public static class285 field1379;

    @ObfuscatedName("cw.dv")
    public static class238 field1391;

    @ObfuscatedName("cb.x")
    public static class285 field1397;

    @ObfuscatedName("cb.y")
    public static class285 field1398;

    @ObfuscatedName("cb.v")
    public static class286 field1400;

    @ObfuscatedName("cb.f")
    public static class286 field1412;

    @ObfuscatedName("cb.d")
    public static boolean field1421;

    @ObfuscatedName("cb.ab")
    public static class286[] field1425;

    @ObfuscatedName("co.ab")
    public static client field1458;

    @ObfuscatedName("cx.d")
    public static class236 field1465;

    @ObfuscatedName("ca.ku")
    public static int field1482;

    @ObfuscatedName("ck.pf")
    public static int field1492;

    @ObfuscatedName("cr.f")
    public static int field1498;

    @ObfuscatedName("cd.du")
    public static class238 field1509;

    @ObfuscatedName("cq.ju")
    public static int field1520;

    @ObfuscatedName("cv.gr")
    public static int field1536;

    @ObfuscatedName("cv.s")
    public static int field1539;

    @ObfuscatedName("cv.pl")
    public static class119 field1540;

    @ObfuscatedName("cv.ev")
    public static class160 field1541;

    @ObfuscatedName("cn.g")
    public static class236 field1545;

    @ObfuscatedName("dg.v")
    public static byte[] field1564;

    @ObfuscatedName("dg.g")
    public static int field1570;

    @ObfuscatedName("dg.t")
    public static int field1571;

    @ObfuscatedName("dg.ac")
    public static float[] field1574;

    @ObfuscatedName("dg.s")
    public static class107[] field1575;

    @ObfuscatedName("dg.o")
    public static class111[] field1576;

    @ObfuscatedName("dg.p")
    public static class118[] field1577;

    @ObfuscatedName("dg.u")
    public static class123[] field1578;

    @ObfuscatedName("dg.i")
    public static int field1579;

    @ObfuscatedName("dg.w")
    public static int[] field1580;

    @ObfuscatedName("dg.at")
    public static int[] field1581;

    @ObfuscatedName("dg.h")
    public static float[] field1587;

    @ObfuscatedName("dg.z")
    public static float[] field1588;

    @ObfuscatedName("dg.j")
    public static float[] field1589;

    @ObfuscatedName("dg.am")
    public static float[] field1590;

    @ObfuscatedName("dg.a")
    public static float[] field1591;

    @ObfuscatedName("dg.ax")
    public static float[] field1592;

    @ObfuscatedName("dg.b")
    public static boolean[] field1593;

    @ObfuscatedName("dg.ag")
    public static int[] field1594;

    @ObfuscatedName("dg.r")
    public static int field1595;

    @ObfuscatedName("dd.g")
    public static int[] field1610;

    @ObfuscatedName("dd.r")
    public static int[] field1612;

    @ObfuscatedName("dd.s")
    public static boolean[] field1614;

    @ObfuscatedName("du.r")
    public static class114 field1617;

    @ObfuscatedName("du.t")
    public static ScheduledExecutorService field1623;

    @ObfuscatedName("du.e")
    public static int field1634;

    @ObfuscatedName("dl.v")
    public static int field1648;

    @ObfuscatedName("dl.fo")
    public static byte[][] field1652;

    @ObfuscatedName("dl.db")
    public static class238 field1654;

    @ObfuscatedName("de.o")
    public static int[] field1674;

    @ObfuscatedName("de.i")
    public static int field1677;

    @ObfuscatedName("x.cw")
    public static class160 field17;

    @ObfuscatedName("dq.t")
    public static float field1702;

    @ObfuscatedName("dq.i")
    public static int field1703;

    @ObfuscatedName("da.gw")
    public static class286[] field1749;

    @ObfuscatedName("x.cp")
    public static class238 field18;

    @ObfuscatedName("ed.u")
    public static int[] field1856;

    @ObfuscatedName("x.oy")
    public static class105 field19;

    @ObfuscatedName("ev.bn")
    public static int field1918;

    @ObfuscatedName("ev.bh")
    public static int field1951;

    @ObfuscatedName("ev.bx")
    public static int field1952;

    @ObfuscatedName("er.fa")
    public static class286 field1963;

    @ObfuscatedName("er.e")
    public static int field1967;

    @ObfuscatedName("er.g")
    public static int field1969;

    @ObfuscatedName("er.r")
    public static int field1970;

    @ObfuscatedName("er.o")
    public static int field1973;

    @ObfuscatedName("ea.k")
    public static int field1988;

    @ObfuscatedName("ea.c")
    public static int field1989;

    @ObfuscatedName("ea.p")
    public static int field1993;

    @ObfuscatedName("ea.u")
    public static int field1994;

    @ObfuscatedName("ea.b")
    public static int field1995;

    @ObfuscatedName("ea.w")
    public static int field1996;

    @ObfuscatedName("ea.n")
    public static int field1998;

    @ObfuscatedName("ea.a")
    public static class146 field2002;

    @ObfuscatedName("ea.o")
    public static int field2006;

    @ObfuscatedName("ex.t")
    public static short[][] field2014;

    @ObfuscatedName("eq.fc")
    public static class286 field2020;

    @ObfuscatedName("ef.bx")
    public static int field2035;

    @ObfuscatedName("ef.k")
    public static int field2040;

    @ObfuscatedName("ef.n")
    public static int field2041;

    @ObfuscatedName("ef.w")
    public static int field2042;

    @ObfuscatedName("ef.c")
    public static int field2043;

    @ObfuscatedName("ef.l")
    public static int field2044;

    @ObfuscatedName("ef.m")
    public static int field2045;

    @ObfuscatedName("ef.a")
    public static int field2046;

    @ObfuscatedName("ef.h")
    public static int field2047;

    @ObfuscatedName("ef.j")
    public static int field2049;

    @ObfuscatedName("ef.ax")
    public static int field2052;

    @ObfuscatedName("ef.at")
    public static int field2053;

    @ObfuscatedName("ef.z")
    public static int field2056;

    @ObfuscatedName("ef.ac")
    public static int field2063;

    @ObfuscatedName("ef.bs")
    public static boolean[][] field2080;

    @ObfuscatedName("ef.bv")
    public static int field2081;

    @ObfuscatedName("ef.bh")
    public static int field2082;

    @ObfuscatedName("ef.am")
    public static int field2083;

    @ObfuscatedName("ef.bn")
    public static int field2084;

    @ObfuscatedName("ef.bl")
    public static int field2085;

    @ObfuscatedName("ef.bf")
    public static int field2086;

    @ObfuscatedName("ee.d")
    public static class236 field2087;

    @ObfuscatedName("ep.ou")
    public static class112 field2089;

    @ObfuscatedName("ew.gq")
    public static int field2090;

    @ObfuscatedName("ew.at")
    public static Font field2095;

    @ObfuscatedName("eo.ck")
    public static class238 field2135;

    @ObfuscatedName("ec.fw")
    public static int field2153;

    @ObfuscatedName("eu.g")
    public static class285 field2179;

    @ObfuscatedName("et.q")
    public static String field2190;

    @ObfuscatedName("et.x")
    public static int field2192;

    @ObfuscatedName("et.d")
    public static Applet field2194;

    @ObfuscatedName("et.w")
    public static String[] field2195;

    @ObfuscatedName("eg.d")
    public static String field2208;

    @ObfuscatedName("eg.q")
    public static String field2210;

    @ObfuscatedName("em.e")
    public static File field2218;

    @ObfuscatedName("em.f")
    public static int field2219;

    @ObfuscatedName("em.m")
    public static String field2220;

    @ObfuscatedName("em.y")
    public static File field2222;

    @ObfuscatedName("em.u")
    public static class103[] field2227;

    @ObfuscatedName("em.b")
    public static int field2228;

    @ObfuscatedName("em.px")
    public static int field2231;

    @ObfuscatedName("fk.q")
    public static File field2234;

    @ObfuscatedName("ff.r")
    public static int field2239;

    @ObfuscatedName("v.gl")
    public static class7[] field224;

    @ObfuscatedName("fv.n")
    public static int field2256;

    @ObfuscatedName("fv.dg")
    public static class238 field2257;

    @ObfuscatedName("t.lo")
    public static int field227;

    @ObfuscatedName("fp.e")
    public static int field2278;

    @ObfuscatedName("fu.dz")
    public static int field2293;

    @ObfuscatedName("fq.e")
    public static class285[] field2294;

    @ObfuscatedName("y.q")
    public static int field23;

    @ObfuscatedName("t.ro")
    public static class289 field230;

    @ObfuscatedName("fh.gd")
    public static int field2314;

    @ObfuscatedName("fe.qj")
    public static class82 field2320;

    @ObfuscatedName("fe.f")
    public static class217[][] field2321;

    @ObfuscatedName("fj.cs")
    public static int field2349;

    @ObfuscatedName("fw.fu")
    public static int[] field2365;

    @ObfuscatedName("fw.o")
    public static class115 field2369;

    @ObfuscatedName("i.ij")
    public static int field237;

    @ObfuscatedName("fw.p")
    public static class235 field2370;

    @ObfuscatedName("fs.z")
    public static int[] field2374;

    @ObfuscatedName("fs.i")
    public static int field2378;

    @ObfuscatedName("fd.ak")
    public static boolean field2381;

    @ObfuscatedName("fd.d")
    public static long field2382;

    @ObfuscatedName("fa.q")
    public static long field2390;

    @ObfuscatedName("fa.i")
    public static byte[][] field2391;

    @ObfuscatedName("y.dw")
    public static class238 field24;

    @ObfuscatedName("fi.pj")
    public static int field2403;

    @ObfuscatedName("fi.c")
    public static int[] field2405;

    @ObfuscatedName("fr.d")
    public static class236 field2408;

    @ObfuscatedName("ga.g")
    public static boolean field2414;

    @ObfuscatedName("gv.q")
    public static class236 field2473;

    @ObfuscatedName("gv.y")
    public static class205 field2474;

    @ObfuscatedName("gv.i")
    public static int field2475;

    @ObfuscatedName("gv.x")
    public static class236 field2477;

    @ObfuscatedName("gv.s")
    public static class210 field2478;

    @ObfuscatedName("gv.gc")
    public static class285[] field2479;

    @ObfuscatedName("gv.t")
    public static int field2483;

    @ObfuscatedName("gd.my")
    public static class157 field2537;

    @ObfuscatedName("s.v")
    public static int field254;

    @ObfuscatedName("s.dn")
    public static int field255;

    @ObfuscatedName("gh.o")
    public static class264 field2552;

    @ObfuscatedName("gh.cd")
    public static class238 field2556;

    @ObfuscatedName("s.t")
    public static class285 field256;

    @ObfuscatedName("hf.i")
    public static short[] field2603;

    @ObfuscatedName("hf.pm")
    public static int field2606;

    @ObfuscatedName("o.fx")
    public static int[] field261;

    @ObfuscatedName("ho.p")
    public static class217 field2616;

    @ObfuscatedName("o.jh")
    public static int field262;

    @ObfuscatedName("hn.r")
    public static class236 field2623;

    @ObfuscatedName("p.oq")
    public static class112 field265;

    @ObfuscatedName("hm.dh")
    public static class238 field2807;

    @ObfuscatedName("ht.kz")
    public static int field2826;

    @ObfuscatedName("ht.io")
    public static class75 field2829;

    @ObfuscatedName("u.js")
    public static int field283;

    @ObfuscatedName("u.jx")
    public static int field284;

    @ObfuscatedName("w.ch")
    public static class154 field296;

    @ObfuscatedName("k.af")
    public static String field298;

    @ObfuscatedName("k.b")
    public static int field300;

    @ObfuscatedName("k.em")
    public static int field301;

    @ObfuscatedName("n.eu")
    public static class264 field306;

    @ObfuscatedName("n.fg")
    public static class285[] field307;

    @ObfuscatedName("n.he")
    public static class217 field308;

    @ObfuscatedName("hk.de")
    public static int field3150;

    @ObfuscatedName("l.jw")
    public static class90 field318;

    @ObfuscatedName("hp.f")
    public static byte[][][] field3185;

    @ObfuscatedName("im.ec")
    public static class263 field3209;

    @ObfuscatedName("ie.e")
    public static Thread field3218;

    @ObfuscatedName("ib.nk")
    public static byte field3232;

    @ObfuscatedName("ih.d")
    public static class160 field3236;

    @ObfuscatedName("m.dd")
    public static class238 field324;

    @ObfuscatedName("ih.x")
    public static long field3243;

    @ObfuscatedName("ih.o")
    public static boolean field3246;

    @ObfuscatedName("m.ac")
    public static int[] field325;

    @ObfuscatedName("m.d")
    public static class236 field326;

    @ObfuscatedName("m.pp")
    public static int field327;

    @ObfuscatedName("ik.d")
    public static class236 field3270;

    @ObfuscatedName("ij.x")
    public static int field3277;

    @ObfuscatedName("m.nx")
    public static int field328;

    @ObfuscatedName("ij.q")
    public static class243[] field3287;

    @ObfuscatedName("ij.d")
    public static class236 field3290;

    @ObfuscatedName("iu.d")
    public static class236 field3299;

    @ObfuscatedName("ig.ji")
    public static class217 field3303;

    @ObfuscatedName("io.d")
    public static class236 field3311;

    @ObfuscatedName("io.q")
    public static class236 field3319;

    @ObfuscatedName("io.eb")
    public static class154 field3321;

    @ObfuscatedName("iy.d")
    public static class236 field3322;

    @ObfuscatedName("iy.gz")
    public static class285[] field3328;

    @ObfuscatedName("il.d")
    public static class236 field3331;

    @ObfuscatedName("il.x")
    public static int field3332;

    @ObfuscatedName("il.q")
    public static class236 field3336;

    @ObfuscatedName("il.qy")
    public static int field3342;

    @ObfuscatedName("ir.q")
    public static class236 field3345;

    @ObfuscatedName("ir.qm")
    public static class14 field3351;

    @ObfuscatedName("ir.d")
    public static class236 field3357;

    @ObfuscatedName("iw.d")
    public static class236 field3362;

    @ObfuscatedName("it.d")
    public static class236 field3366;

    @ObfuscatedName("it.bl")
    public static String field3369;

    @ObfuscatedName("ic.d")
    public static class236 field3376;

    @ObfuscatedName("ic.la")
    public static int field3385;

    @ObfuscatedName("ip.q")
    public static class236 field3390;

    @ObfuscatedName("ip.x")
    public static class236 field3391;

    @ObfuscatedName("f.r")
    public static short[][] field34;

    @ObfuscatedName("ip.d")
    public static class236 field3411;

    @ObfuscatedName("ip.fi")
    public static class286[] field3413;

    @ObfuscatedName("iv.q")
    public static class236 field3416;

    @ObfuscatedName("z.fs")
    public static int field344;

    @ObfuscatedName("iv.x")
    public static class236 field3447;

    @ObfuscatedName("ix.f")
    public static class236 field3470;

    @ObfuscatedName("ix.v")
    public static class236 field3471;

    @ObfuscatedName("f.bd")
    public static int field35;

    @ObfuscatedName("id.ei")
    public static long field3529;

    @ObfuscatedName("in.q")
    public static class236 field3558;

    @ObfuscatedName("iz.d")
    public static class236 field3580;

    @ObfuscatedName("jj.q")
    public static class236 field3582;

    @ObfuscatedName("jj.d")
    public static class236 field3583;

    @ObfuscatedName("jj.x")
    public static class236 field3588;

    @ObfuscatedName("jy.f")
    public static class236 field3615;

    @ObfuscatedName("jz.r")
    public static class285[] field3626;

    @ObfuscatedName("jp.pk")
    public static int field3639;

    @ObfuscatedName("jp.d")
    public static class166 field3640;

    @ObfuscatedName("jh.j")
    public static int[] field3658;

    @ObfuscatedName("am.bf")
    public static String field366;

    @ObfuscatedName("js.ce")
    public static long field3666;

    @ObfuscatedName("ja.y")
    public static int[] field3667;

    @ObfuscatedName("ja.d")
    public static class236 field3669;

    @ObfuscatedName("am.z")
    public static int[] field367;

    @ObfuscatedName("jl.nr")
    public static class277 field3722;

    @ObfuscatedName("jl.ag")
    public static FontMetrics field3724;

    @ObfuscatedName("jr.at")
    public static int field3738;

    @ObfuscatedName("jr.ax")
    public static int field3739;

    @ObfuscatedName("ac.fq")
    public static int[] field374;

    @ObfuscatedName("jr.ac")
    public static int[] field3744;

    @ObfuscatedName("jq.i")
    public static int field3745;

    @ObfuscatedName("ac.hz")
    public static class217 field375;

    @ObfuscatedName("kn.e")
    public static int[] field3778;

    @ObfuscatedName("kn.f")
    public static int[] field3779;

    @ObfuscatedName("kn.q")
    public static int field3780;

    @ObfuscatedName("kn.x")
    public static int field3781;

    @ObfuscatedName("kn.d")
    public static int field3782;

    @ObfuscatedName("kn.v")
    public static int[] field3783;

    @ObfuscatedName("kn.t")
    public static int[] field3784;

    @ObfuscatedName("ax.qz")
    public static short[] field393;

    @ObfuscatedName("at.aj")
    public static class285[] field401;

    @ObfuscatedName("ag.qi")
    public static class161 field407;

    @ObfuscatedName("ag.bu")
    public static class232 field416;

    @ObfuscatedName("ar.h")
    public static int field419;

    @ObfuscatedName("ae.l")
    public static int[] field434;

    @ObfuscatedName("ai.eg")
    public static int field448;

    @ObfuscatedName("au.iz")
    public static int field451;

    @ObfuscatedName("au.pc")
    public static int field467;

    @ObfuscatedName("au.qv")
    public static class292 field468;

    @ObfuscatedName("ad.kw")
    public static int field474;

    @ObfuscatedName("ad.fm")
    public static int field475;

    @ObfuscatedName("ah.i")
    public static class285[] field484;

    @ObfuscatedName("ao.fr")
    public static class286[] field485;

    @ObfuscatedName("ao.nb")
    public static class76[] field488;

    @ObfuscatedName("ao.t")
    public static boolean field489;

    @ObfuscatedName("aq.t")
    public static int field510;

    @ObfuscatedName("aq.bz")
    public static class285[] field518;

    @ObfuscatedName("ay.w")
    public static class48 field520;

    @ObfuscatedName("ay.fb")
    public static int[][] field534;

    @ObfuscatedName("ay.an")
    public static int field535;

    @ObfuscatedName("af.eh")
    public static class264 field545;

    @ObfuscatedName("aa.ix")
    public static int field549;

    @ObfuscatedName("aa.cr")
    public static class238 field552;

    @ObfuscatedName("as.pz")
    public static int field560;

    @ObfuscatedName("ap.hc")
    public static class217 field565;

    @ObfuscatedName("ap.m")
    public static int[] field567;

    @ObfuscatedName("ap.az")
    public static String field568;

    @ObfuscatedName("aw.pa")
    public static int field578;

    @ObfuscatedName("aw.aq")
    public static class283 field583;

    @ObfuscatedName("aw.g")
    public static int[] field584;

    @ObfuscatedName("aw.cz")
    public static class154 field586;

    @ObfuscatedName("ab.gj")
    public static int field588;

    @ObfuscatedName("ab.ow")
    public static class286 field620;

    @ObfuscatedName("aj.qp")
    public static long field623;

    @ObfuscatedName("aj.ly")
    public static int field624;

    @ObfuscatedName("aj.fy")
    public static class286[] field627;

    @ObfuscatedName("aj.ga")
    public static class286[] field628;

    @ObfuscatedName("aj.mi")
    public static class98 field629;

    @ObfuscatedName("aj.fh")
    public static class140 field630;

    @ObfuscatedName("bi.r")
    public static int field634;

    @ObfuscatedName("bu.cv")
    public static class238 field640;

    @ObfuscatedName("bu.p")
    public static int[] field642;

    @ObfuscatedName("bs.c")
    public static class174 field658;

    @ObfuscatedName("bs.dq")
    public static int field660;

    @ObfuscatedName("bh.d")
    public static class155 field665;

    @ObfuscatedName("bh.i")
    public static int field667;

    @ObfuscatedName("bh.qf")
    public static int field696;

    @ObfuscatedName("bx.bv")
    public static class290 field716;

    @ObfuscatedName("bn.n")
    public static int[] field720;

    @ObfuscatedName("bn.a")
    public static String field721;

    @ObfuscatedName("bl.gi")
    public static class286[] field725;

    @ObfuscatedName("bl.gb")
    public static int field730;

    @ObfuscatedName("bf.y")
    public static byte[][][] field737;

    @ObfuscatedName("bf.r")
    public static int[] field738;

    @ObfuscatedName("bf.v")
    public static byte[][][] field739;

    @ObfuscatedName("bf.t")
    public static byte[][][] field740;

    @ObfuscatedName("bf.i")
    public static int[][] field741;

    @ObfuscatedName("bf.u")
    public static int[][][] field743;

    @ObfuscatedName("bf.e")
    public static byte[][][] field753;

    @ObfuscatedName("bd.v")
    public static boolean[] field758;

    @ObfuscatedName("bw.ca")
    public static class238 field775;

    @ObfuscatedName("br.s")
    public static int[] field780;

    @ObfuscatedName("br.l")
    public static String field782;

    @ObfuscatedName("bt.bu")
    public static class285 field789;

    @ObfuscatedName("bp.nv")
    public static byte field792;

    @ObfuscatedName("bp.ct")
    public static boolean field793;

    @ObfuscatedName("bp.bw")
    public static int field795;

    @ObfuscatedName("bp.t")
    public static class236 field796;

    @ObfuscatedName("bp.cx")
    public static class238 field797;

    @ObfuscatedName("bp.lt")
    public static class217[] field798;

    @ObfuscatedName("bp.z")
    public static int field800;

    @ObfuscatedName("ba.o")
    public static class159 field808;

    @ObfuscatedName("bc.as")
    public static GarbageCollectorMXBean field825;

    @ObfuscatedName("bm.b")
    public static class174 field834;

    @ObfuscatedName("bk.o")
    public static class217 field852;

    @ObfuscatedName("bk.k")
    public static String[] field854;

    @ObfuscatedName("bk.fk")
    public static int field855;

    @ObfuscatedName("bo.f")
    public static boolean field889;

    @ObfuscatedName("bo.am")
    public static int[] field890;

    @ObfuscatedName("q.cm")
    public static char field9;

    @ObfuscatedName("client.di")
    public static class238 field925;

    @ObfuscatedName("client.ge")
    public static int field966;

    @ObfuscatedName("bw.d([BB)Lji;")
    public static final class286 method988(byte[] arg0) {
        Object var1 = null;
        try {
            BufferedImage var2 = ImageIO.read(new ByteArrayInputStream(arg0));
            int var3 = var2.getWidth();
            int var4 = var2.getHeight();
            int[] var5 = new int[var3 * var4];
            PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var3, var4, var5, 0, var3);
            var6.grabPixels();
            return new class286(var5, var3, var4);
        } catch (IOException var9) {
        } catch (InterruptedException var10) {
        }
        return new class286(0, 0);
    }

    @ObfuscatedName("bo.d(Lfy;B)V")
    public static void method1057(class180 arg0) {
        class280 var1 = (class280) class281.field3736.method3282();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field2364;
        arg0.method2902(var1.field3731);
        for (int var3 = 0; var3 < var1.field3729; var3++) {
            if (var1.field3732[var3] == 0) {
                try {
                    int var4 = var1.field3730[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field3734[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2899(0);
                        arg0.method2902(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field3734[var3];
                        var7.setInt((Object) null, var1.field3733[var3]);
                        arg0.method2899(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field3734[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2899(0);
                        arg0.method2902(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field3728[var3];
                        byte[][] var11 = var1.field3735[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2899(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2899(1);
                            arg0.method2946(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2899(2);
                            arg0.method2905((String) var15);
                        } else {
                            arg0.method2899(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field3728[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2899(0);
                        arg0.method2902(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2899(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2899(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2899(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2899(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2899(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2899(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2899(-16);
                } catch (SecurityException var37) {
                    arg0.method2899(-17);
                } catch (IOException var38) {
                    arg0.method2899(-18);
                } catch (NullPointerException var39) {
                    arg0.method2899(-19);
                } catch (Exception var40) {
                    arg0.method2899(-20);
                } catch (Throwable var41) {
                    arg0.method2899(-21);
                }
            } else {
                arg0.method2899(var1.field3732[var3]);
            }
        }
        arg0.method3043(var2);
        var1.method3312();
    }

    @ObfuscatedName("eg.x(IB)I")
    public static int method2692(int arg0) {
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

    @ObfuscatedName("ag.x(IIIIB)V")
    public static void method229(int arg0, int arg1, int arg2, int arg3) {
        class64 var4 = (class64) class64.field756.method3263((long) arg0);
        if (var4 == null) {
            var4 = new class64();
            class64.field756.method3269(var4, (long) arg0);
        }
        if (var4.field761.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field761.length; var7++) {
                var5[var7] = var4.field761[var7];
                var6[var7] = var4.field755[var7];
            }
            for (int var8 = var4.field761.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field761 = var5;
            var4.field755 = var6;
        }
        var4.field761[arg1] = arg2;
        var4.field755[arg1] = arg3;
    }

    @ObfuscatedName("cl.d([BIB)I")
    public static int method1412(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ class174.field2371[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    @ObfuscatedName("a.t(I)V")
    public static void method155() {
        try {
            if (class204.field2476 == 1) {
                int var0 = field2474.method3475();
                if (var0 > 0 && field2474.method3415()) {
                    int var1 = var0 - field634;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    field2474.method3410(var1);
                    return;
                }
                field2474.method3499();
                field2474.method3426();
                if (field3615 == null) {
                    class204.field2476 = 0;
                } else {
                    class204.field2476 = 2;
                }
                field2478 = null;
                field2369 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            field2474.method3499();
            class204.field2476 = 0;
            field2478 = null;
            field2369 = null;
            field3615 = null;
        }
    }

    @ObfuscatedName("ep.q(IIII)I")
    public static int method2653(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @ObfuscatedName("br.q(II)Lix;")
    public static class257 method992(int arg0) {
        class257 var1 = (class257) class257.field3472.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3470.method3750(10, arg0);
        class257 var3 = new class257();
        var3.field3475 = arg0;
        if (var2 != null) {
            var3.method4230(new class174(var2));
        }
        var3.method4163();
        if (var3.field3500 != -1) {
            var3.method4181(method992(var3.field3500), method992(var3.field3508));
        }
        if (var3.field3519 != -1) {
            var3.method4167(method992(var3.field3519), method992(var3.field3518));
        }
        if (var3.field3521 != -1) {
            var3.method4168(method992(var3.field3521), method992(var3.field3520));
        }
        if (!field489 && var3.field3490) {
            var3.field3477 = class226.field2908;
            var3.field3517 = false;
            var3.field3491 = null;
            var3.field3492 = null;
            var3.field3488 = -1;
            var3.field3516 = 0;
            if (var3.field3496 != null) {
                boolean var4 = false;
                for (class193 var5 = var3.field3496.method3232(); var5 != null; var5 = var3.field3496.method3228()) {
                    class252 var6 = class252.method1696((int) var5.field2441);
                    if (var6.field3371) {
                        var5.method3312();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3496 = null;
                }
            }
        }
        class257.field3472.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ek.t(Ljava/lang/String;I)I")
    public static int method2363(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("fl.y(II)V")
    public static void method2796(int arg0) {
        if (arg0 == -1 || !field758[arg0]) {
            return;
        }
        field796.method3763(arg0);
        if (field2321[arg0] == null) {
            return;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < field2321[arg0].length; var2++) {
            if (field2321[arg0][var2] != null) {
                if (field2321[arg0][var2].field2695 == 2) {
                    var1 = false;
                } else {
                    field2321[arg0][var2] = null;
                }
            }
        }
        if (var1) {
            field2321[arg0] = null;
        }
        field758[arg0] = false;
    }

    @ObfuscatedName("aq.r(I)V")
    public static void method492() {
        class214.field2605.method3250();
    }

    @ObfuscatedName("he.y(B)V")
    public static void method3742() {
        if (field3236 != null) {
            field3236.method2745();
        }
    }

    @ObfuscatedName("ba.ag([BI)[B")
    public static final byte[] method998(byte[] arg0) {
        class174 var1 = new class174(arg0);
        int var2 = var1.method2921();
        int var3 = var1.method2935();
        if (var3 < 0 || !(class236.field3210 == 0 || var3 <= class236.field3210)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3102(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2935();
            if (var5 < 0 || class236.field3210 != 0 && var5 > class236.field3210) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class168.method2855(var6, var5, arg0, var3, 9);
            } else {
                class236.field3206.method2843(var1, var6);
            }
            return var6;
        }
    }

    @ObfuscatedName("cu.g(IIB)I")
    public static final int method1478(int arg0, int arg1) {
        int var2 = class63.method1023(arg0 - 1, arg1 - 1) + class63.method1023(arg0 + 1, arg1 - 1) + class63.method1023(arg0 - 1, arg1 + 1) + class63.method1023(arg0 + 1, arg1 + 1);
        int var3 = class63.method1023(arg0 - 1, arg1) + class63.method1023(arg0 + 1, arg1) + class63.method1023(arg0, arg1 - 1) + class63.method1023(arg0, arg1 + 1);
        int var4 = class63.method1023(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bm.p(III)I")
    public static final int method1012(int arg0, int arg1) {
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

    @ObfuscatedName("ig.u(IIIB)I")
    public static final int method3924(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @ObfuscatedName("br.g(ILcd;ZB)I")
    public static int method993(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = arg2 ? field2616 : field852;
        if (arg0 == 1800) {
            class84.field1308[++field1315 - 1] = class218.method2674(client.method2879(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = class84.field1308[--field1315];
            int var5 = var4 - 1;
            if (var3.field2696 == null || var5 >= var3.field2696.length || var3.field2696[var5] == null) {
                class84.field1301[++field2239 - 1] = "";
            } else {
                class84.field1301[++field2239 - 1] = var3.field2696[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2740 == null) {
                class84.field1301[++field2239 - 1] = "";
            } else {
                class84.field1301[++field2239 - 1] = var3.field2740;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ew.gv(ZI)V")
    public static final void method2655(boolean arg0) {
        client.method2362();
        client.field1030++;
        if (client.field1030 < 50 && !arg0) {
            return;
        }
        client.field1030 = 0;
        if (client.field1055 || field1541 == null) {
            return;
        }
        client.field937.method3133(181);
        try {
            field1541.method2739(client.field937.field2367, 0, client.field937.field2364);
            client.field937.field2364 = 0;
        } catch (IOException var2) {
            client.field1055 = true;
        }
    }

    @ObfuscatedName("hx.ih([Lhn;IIIIIIIIB)V")
    public static final void method3658(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class282.method4560(arg2, arg3, arg4, arg5);
        class137.method2366();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class217 var10 = arg0[var9];
            if (var10 != null && (var10.field2649 == arg1 || arg1 == -1412584499 && client.field913 == var10)) {
                int var11;
                if (arg8 == -1) {
                    client.field1092[client.field1087] = var10.field2643 + arg6;
                    client.field1093[client.field1087] = var10.field2644 + arg7;
                    client.field1095[client.field1087] = var10.field2645;
                    client.field921[client.field1087] = var10.field2634;
                    var11 = ++client.field1087 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2762 = var11;
                var10.field2673 = client.field902;
                if (!var10.field2629 || !client.method3128(var10)) {
                    if (var10.field2739 > 0) {
                        client.method138(var10);
                    }
                    int var12 = var10.field2643 + arg6;
                    int var13 = var10.field2644 + arg7;
                    int var14 = var10.field2661;
                    if (client.field913 == var10) {
                        if (arg1 != -1412584499 && !var10.field2653) {
                            field798 = arg0;
                            field624 = arg6;
                            field227 = arg7;
                            continue;
                        }
                        if (client.field1068 && client.field1062) {
                            int var15 = class60.field697;
                            int var16 = class60.field706 * -119379047;
                            int var17 = var15 - client.field1074;
                            int var18 = var16 - client.field1064;
                            if (var17 < client.field1063) {
                                var17 = client.field1063;
                            }
                            if (var10.field2645 + var17 > client.field1063 + client.field1058.field2645) {
                                var17 = client.field1063 + client.field1058.field2645 - var10.field2645;
                            }
                            if (var18 < client.field944) {
                                var18 = client.field944;
                            }
                            if (var10.field2634 + var18 > client.field944 + client.field1058.field2634) {
                                var18 = client.field944 + client.field1058.field2634 - var10.field2634;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2653) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2695 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2695 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2645 + var12;
                        int var26 = var10.field2634 + var13;
                        if (var25 < var12) {
                            var23 = var25;
                            var25 = var12;
                        }
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        var25++;
                        var26++;
                        var19 = var23 > arg2 ? var23 : arg2;
                        var20 = var24 > arg3 ? var24 : arg3;
                        var21 = var25 < arg4 ? var25 : arg4;
                        var22 = var26 < arg5 ? var26 : arg5;
                    } else {
                        int var29 = var10.field2645 + var12;
                        int var30 = var10.field2634 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2629 || var19 < var21 && var20 < var22) {
                        if (var10.field2739 != 0) {
                            if (var10.field2739 == 1336) {
                                if (client.field945) {
                                    var13 += 15;
                                    field306.method4362("Fps:" + client.field672, var10.field2645 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && client.field898) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !client.field898) {
                                        var33 = 16711680;
                                    }
                                    field306.method4362("Mem:" + var32 + "k", var10.field2645 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2739 == 1337) {
                                client.field1033 = var12;
                                client.field967 = var13;
                                int var36 = var10.field2645;
                                int var37 = var10.field2634;
                                client.field1039++;
                                client.method514(class67.field785);
                                boolean var38 = false;
                                if (client.field928 >= 0) {
                                    int var39 = class97.field1471;
                                    int[] var40 = class97.field1469;
                                    for (int var41 = 0; var41 < var39; var41++) {
                                        if (client.field928 == var40[var41]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    client.method514(class67.field786);
                                }
                                client.method62(true);
                                client.method514(var38 ? class67.field788 : class67.field787);
                                client.method62(false);
                                client.method318();
                                for (class85 var42 = (class85) client.field1017.method3323(); var42 != null; var42 = (class85) client.field1017.method3325()) {
                                    if (field237 != var42.field1318 || var42.field1325) {
                                        var42.method3312();
                                    } else if (client.field902 >= var42.field1317) {
                                        var42.method1538(client.field1079);
                                        if (var42.field1325) {
                                            var42.method3312();
                                        } else {
                                            field630.method2472(var42.field1318, var42.field1319, var42.field1320, var42.field1321, 60, var42, 0, -1, false);
                                        }
                                    }
                                }
                                client.method1672(var12, var13, var36, var37, true);
                                int var43 = client.field1073;
                                int var44 = client.field1146;
                                int var45 = client.field940;
                                int var46 = client.field1148;
                                class282.method4560(var43, var44, var43 + var45, var44 + var46);
                                class137.method2366();
                                if (!client.field1131) {
                                    int var47 = client.field978;
                                    if (client.field976 / 256 > var47) {
                                        var47 = client.field976 / 256;
                                    }
                                    if (client.field1006[4] && client.field1049[4] + 128 > var47) {
                                        var47 = client.field1049[4] + 128;
                                    }
                                    int var48 = client.field915 & 0x7FF;
                                    client.method49(field2314, client.method118(field2829.field1232, field2829.field1191, field237) - client.field908, field1536, var47, var48, var47 * 3 + 600);
                                }
                                int var61;
                                if (client.field1131) {
                                    int var62;
                                    if (field2320.field1278) {
                                        var62 = field237;
                                    } else {
                                        int var63 = client.method118(field1366, field588, field237);
                                        if (var63 - field2090 >= 800 || (class63.field735[field237][field1366 >> 7][field588 >> 7] & 0x4) == 0) {
                                            var62 = 3;
                                        } else {
                                            var62 = field237;
                                        }
                                    }
                                    var61 = var62;
                                } else {
                                    int var49;
                                    if (field2320.field1278) {
                                        var49 = field237;
                                    } else {
                                        label1459: {
                                            int var50 = 3;
                                            if (field966 < 310) {
                                                int var51 = field1366 >> 7;
                                                int var52 = field588 >> 7;
                                                int var53 = field2829.field1232 >> 7;
                                                int var54 = field2829.field1191 >> 7;
                                                if (var51 < 0 || var52 < 0 || var51 >= 104 || var52 >= 104) {
                                                    var49 = field237;
                                                    break label1459;
                                                }
                                                if ((class63.field735[field237][var51][var52] & 0x4) != 0) {
                                                    var50 = field237;
                                                }
                                                int var55;
                                                if (var53 > var51) {
                                                    var55 = var53 - var51;
                                                } else {
                                                    var55 = var51 - var53;
                                                }
                                                int var56;
                                                if (var54 > var52) {
                                                    var56 = var54 - var52;
                                                } else {
                                                    var56 = var52 - var54;
                                                }
                                                if (var55 > var56) {
                                                    int var57 = var56 * 65536 / var55;
                                                    int var58 = 32768;
                                                    while (var51 != var53) {
                                                        if (var51 < var53) {
                                                            var51++;
                                                        } else if (var51 > var53) {
                                                            var51--;
                                                        }
                                                        if ((class63.field735[field237][var51][var52] & 0x4) != 0) {
                                                            var50 = field237;
                                                        }
                                                        var58 += var57;
                                                        if (var58 >= 65536) {
                                                            var58 -= 65536;
                                                            if (var52 < var54) {
                                                                var52++;
                                                            } else if (var52 > var54) {
                                                                var52--;
                                                            }
                                                            if ((class63.field735[field237][var51][var52] & 0x4) != 0) {
                                                                var50 = field237;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var59 = var55 * 65536 / var56;
                                                    int var60 = 32768;
                                                    while (var52 != var54) {
                                                        if (var52 < var54) {
                                                            var52++;
                                                        } else if (var52 > var54) {
                                                            var52--;
                                                        }
                                                        if ((class63.field735[field237][var51][var52] & 0x4) != 0) {
                                                            var50 = field237;
                                                        }
                                                        var60 += var59;
                                                        if (var60 >= 65536) {
                                                            var60 -= 65536;
                                                            if (var51 < var53) {
                                                                var51++;
                                                            } else if (var51 > var53) {
                                                                var51--;
                                                            }
                                                            if ((class63.field735[field237][var51][var52] & 0x4) != 0) {
                                                                var50 = field237;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (field2829.field1232 >= 0 && field2829.field1191 >= 0 && field2829.field1232 < 13312 && field2829.field1191 < 13312) {
                                                if ((class63.field735[field237][field2829.field1232 >> 7][field2829.field1191 >> 7] & 0x4) != 0) {
                                                    var50 = field237;
                                                }
                                                var49 = var50;
                                            } else {
                                                var49 = field237;
                                            }
                                        }
                                    }
                                    var61 = var49;
                                }
                                int var64 = field1366;
                                int var65 = field2090;
                                int var66 = field588;
                                int var67 = field966;
                                int var68 = field730;
                                for (int var69 = 0; var69 < 5; var69++) {
                                    if (client.field1006[var69]) {
                                        int var70 = (int) (Math.random() * (double) (client.field1133[var69] * 2 + 1) - (double) client.field1133[var69] + Math.sin((double) client.field1054[var69] / 100.0D * (double) client.field1094[var69]) * (double) client.field1049[var69]);
                                        if (var69 == 0) {
                                            field1366 += var70;
                                        }
                                        if (var69 == 1) {
                                            field2090 += var70;
                                        }
                                        if (var69 == 2) {
                                            field588 += var70;
                                        }
                                        if (var69 == 3) {
                                            field730 = field730 + var70 & 0x7FF;
                                        }
                                        if (var69 == 4) {
                                            field966 += var70;
                                            if (field966 < 128) {
                                                field966 = 128;
                                            }
                                            if (field966 > 383) {
                                                field966 = 383;
                                            }
                                        }
                                    }
                                }
                                int var71 = class60.field697;
                                int var72 = class60.field706 * -119379047;
                                if (class60.field698 != 0) {
                                    var71 = class60.field710;
                                    var72 = class60.field714;
                                }
                                if (var71 >= var43 && var71 < var43 + var45 && var72 >= var44 && var72 < var44 + var46) {
                                    class135.method1994(var71 - var43, var72 - var44);
                                } else {
                                    class135.field1974 = false;
                                    class135.field1971 = 0;
                                }
                                client.method2362();
                                class282.method4551(var43, var44, var45, var46, 0);
                                client.method2362();
                                int var73 = class137.field1999;
                                class137.field1999 = client.field1060;
                                field630.method2502(field1366, field2090, field588, field966, field730, var61);
                                class8.method2873();
                                class137.field1999 = var73;
                                client.method2362();
                                field630.method2475();
                                client.field977 = 0;
                                boolean var74 = false;
                                int var75 = -1;
                                int var76 = class97.field1471;
                                int[] var77 = class97.field1469;
                                for (int var78 = 0; var78 < client.field933 + var76; var78++) {
                                    class79 var79;
                                    if (var78 < var76) {
                                        var79 = client.field1004[var77[var78]];
                                        if (client.field928 == var77[var78]) {
                                            var74 = true;
                                            var75 = var78;
                                            continue;
                                        }
                                    } else {
                                        var79 = client.field932[client.field934[var78 - var76]];
                                    }
                                    client.method1676(var79, var78, var43, var44, var45, var46);
                                }
                                if (var74) {
                                    client.method1676(client.field1004[client.field928], var75, var43, var44, var45, var46);
                                }
                                for (int var80 = 0; var80 < client.field977; var80++) {
                                    int var81 = client.field979[var80];
                                    int var82 = client.field980[var80];
                                    int var83 = client.field982[var80];
                                    int var84 = client.field904[var80];
                                    boolean var85 = true;
                                    while (var85) {
                                        var85 = false;
                                        for (int var86 = 0; var86 < var80; var86++) {
                                            if (var82 + 2 > client.field980[var86] - client.field904[var86] && var82 - var84 < client.field980[var86] + 2 && var81 - var83 < client.field982[var86] + client.field979[var86] && var81 + var83 > client.field979[var86] - client.field982[var86] && client.field980[var86] - client.field904[var86] < var82) {
                                                var82 = client.field980[var86] - client.field904[var86];
                                                var85 = true;
                                            }
                                        }
                                    }
                                    client.field989 = client.field979[var80];
                                    client.field990 = client.field980[var80] = var82;
                                    String var87 = client.field986[var80];
                                    if (client.field1046 == 0) {
                                        int var88 = 16776960;
                                        if (client.field983[var80] < 6) {
                                            var88 = client.field1100[client.field983[var80]];
                                        }
                                        if (client.field983[var80] == 6) {
                                            var88 = client.field1039 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (client.field983[var80] == 7) {
                                            var88 = client.field1039 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (client.field983[var80] == 8) {
                                            var88 = client.field1039 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (client.field983[var80] == 9) {
                                            int var89 = 150 - client.field985[var80];
                                            if (var89 < 50) {
                                                var88 = var89 * 1280 + 16711680;
                                            } else if (var89 < 100) {
                                                var88 = 16776960 - (var89 - 50) * 327680;
                                            } else if (var89 < 150) {
                                                var88 = (var89 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (client.field983[var80] == 10) {
                                            int var90 = 150 - client.field985[var80];
                                            if (var90 < 50) {
                                                var88 = var90 * 5 + 16711680;
                                            } else if (var90 < 100) {
                                                var88 = 16711935 - (var90 - 50) * 327680;
                                            } else if (var90 < 150) {
                                                var88 = (var90 - 100) * 327680 + 255 - (var90 - 100) * 5;
                                            }
                                        }
                                        if (client.field983[var80] == 11) {
                                            int var91 = 150 - client.field985[var80];
                                            if (var91 < 50) {
                                                var88 = 16777215 - var91 * 327685;
                                            } else if (var91 < 100) {
                                                var88 = (var91 - 50) * 327685 + 65280;
                                            } else if (var91 < 150) {
                                                var88 = 16777215 - (var91 - 100) * 327680;
                                            }
                                        }
                                        if (client.field984[var80] == 0) {
                                            field545.method4363(var87, client.field989 + var43, client.field990 + var44, var88, 0);
                                        }
                                        if (client.field984[var80] == 1) {
                                            field545.method4365(var87, client.field989 + var43, client.field990 + var44, var88, 0, client.field1039);
                                        }
                                        if (client.field984[var80] == 2) {
                                            field545.method4366(var87, client.field989 + var43, client.field990 + var44, var88, 0, client.field1039);
                                        }
                                        if (client.field984[var80] == 3) {
                                            field545.method4358(var87, client.field989 + var43, client.field990 + var44, var88, 0, client.field1039, 150 - client.field985[var80]);
                                        }
                                        if (client.field984[var80] == 4) {
                                            int var92 = (150 - client.field985[var80]) * (field545.method4434(var87) + 100) / 150;
                                            class282.method4570(client.field989 + var43 - 50, var44, client.field989 + var43 + 50, var44 + var46);
                                            field545.method4371(var87, client.field989 + var43 + 50 - var92, client.field990 + var44, var88, 0);
                                            class282.method4560(var43, var44, var43 + var45, var44 + var46);
                                        }
                                        if (client.field984[var80] == 5) {
                                            int var93 = 150 - client.field985[var80];
                                            int var94 = 0;
                                            if (var93 < 25) {
                                                var94 = var93 - 25;
                                            } else if (var93 > 125) {
                                                var94 = var93 - 125;
                                            }
                                            class282.method4570(var43, client.field990 + var44 - field545.field3623 - 1, var43 + var45, client.field990 + var44 + 5);
                                            field545.method4363(var87, client.field989 + var43, client.field990 + var44 + var94, var88, 0);
                                            class282.method4560(var43, var44, var43 + var45, var44 + var46);
                                        }
                                    } else {
                                        field545.method4363(var87, client.field989 + var43, client.field990 + var44, 16776960, 0);
                                    }
                                }
                                client.method3707(var43, var44);
                                ((class126) field2002).method2160(client.field1079);
                                if (client.field994 == 1) {
                                    field725[client.field1135 / 100].method4671(client.field1057 - 8, client.field1085 - 8);
                                }
                                if (client.field994 == 2) {
                                    field725[client.field1135 / 100 + 4].method4671(client.field1057 - 8, client.field1085 - 8);
                                }
                                client.method2896();
                                field1366 = var64;
                                field2090 = var65;
                                field588 = var66;
                                field966 = var67;
                                field730 = var68;
                                if (client.field901) {
                                    byte var95 = 0;
                                    int var96 = class239.field3239 + class239.field3235 + var95;
                                    if (var96 == 0) {
                                        client.field901 = false;
                                    }
                                }
                                if (client.field901) {
                                    class282.method4551(var43, var44, var45, var46, 0);
                                    client.method16(class226.field2844, false);
                                }
                                client.field1089[var10.field2762] = true;
                                class282.method4560(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2739 == 1338) {
                                client.method2362();
                                class211 var98 = var10.method3669(false);
                                if (var98 != null) {
                                    class282.method4560(var12, var13, var98.field2581 + var12, var98.field2582 + var13);
                                    if (client.field1119 == 2 || client.field1119 == 5) {
                                        class282.method4566(var12, var13, 0, var98.field2579, var98.field2580);
                                    } else {
                                        int var99 = client.field915 & 0x7FF;
                                        int var100 = field2829.field1232 / 32 + 48;
                                        int var101 = 464 - field2829.field1191 / 32;
                                        field620.method4682(var12, var13, var98.field2581, var98.field2582, var100, var101, var99, 256, var98.field2579, var98.field2580);
                                        for (int var102 = 0; var102 < client.field1113; var102++) {
                                            int var103 = client.field1114[var102] * 4 + 2 - field2829.field1232 / 32;
                                            int var104 = client.field1115[var102] * 4 + 2 - field2829.field1191 / 32;
                                            client.method458(var12, var13, var103, var104, client.field1128[var102], var98);
                                        }
                                        int var105 = 0;
                                        while (true) {
                                            if (var105 >= 104) {
                                                for (int var110 = 0; var110 < client.field933; var110++) {
                                                    class87 var111 = client.field932[client.field934[var110]];
                                                    if (var111 != null && var111.method1037()) {
                                                        class259 var112 = var111.field1343;
                                                        if (var112 != null && var112.field3560 != null) {
                                                            var112 = var112.method4244();
                                                        }
                                                        if (var112 != null && var112.field3551 && var112.field3543) {
                                                            int var113 = var111.field1232 / 32 - field2829.field1232 / 32;
                                                            int var114 = var111.field1191 / 32 - field2829.field1191 / 32;
                                                            client.method458(var12, var13, var113, var114, field1749[1], var98);
                                                        }
                                                    }
                                                }
                                                int var115 = class97.field1471;
                                                int[] var116 = class97.field1469;
                                                for (int var117 = 0; var117 < var115; var117++) {
                                                    class75 var118 = client.field1004[var116[var117]];
                                                    if (var118 != null && var118.method1037() && !var118.field878 && field2829 != var118) {
                                                        int var119 = var118.field1232 / 32 - field2829.field1232 / 32;
                                                        int var120 = var118.field1191 / 32 - field2829.field1191 / 32;
                                                        boolean var121 = false;
                                                        if (client.method237(var118.field875, true)) {
                                                            var121 = true;
                                                        }
                                                        boolean var122 = false;
                                                        for (int var123 = 0; var123 < field328; var123++) {
                                                            if (var118.field875.equals(field488[var123].field888)) {
                                                                var122 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var124 = false;
                                                        if (field2829.field877 != 0 && var118.field877 != 0 && field2829.field877 == var118.field877) {
                                                            var124 = true;
                                                        }
                                                        if (var121) {
                                                            client.method458(var12, var13, var119, var120, field1749[3], var98);
                                                        } else if (var124) {
                                                            client.method458(var12, var13, var119, var120, field1749[4], var98);
                                                        } else if (var122) {
                                                            client.method458(var12, var13, var119, var120, field1749[5], var98);
                                                        } else {
                                                            client.method458(var12, var13, var119, var120, field1749[2], var98);
                                                        }
                                                    }
                                                }
                                                if (client.field1116 != 0 && client.field902 % 20 < 10) {
                                                    if (client.field1116 == 1 && client.field911 >= 0 && client.field911 < client.field932.length) {
                                                        class87 var125 = client.field932[client.field911];
                                                        if (var125 != null) {
                                                            int var126 = var125.field1232 / 32 - field2829.field1232 / 32;
                                                            int var127 = var125.field1191 / 32 - field2829.field1191 / 32;
                                                            client.method1564(var12, var13, var126, var127, field628[1], var98);
                                                        }
                                                    }
                                                    if (client.field1116 == 2) {
                                                        int var128 = client.field1149 * 4 - field448 * 4 + 2 - field2829.field1232 / 32;
                                                        int var129 = client.field1002 * 4 - field301 * 4 + 2 - field2829.field1191 / 32;
                                                        client.method1564(var12, var13, var128, var129, field628[1], var98);
                                                    }
                                                    if (client.field1116 == 10 && client.field912 >= 0 && client.field912 < client.field1004.length) {
                                                        class75 var130 = client.field1004[client.field912];
                                                        if (var130 != null) {
                                                            int var131 = var130.field1232 / 32 - field2829.field1232 / 32;
                                                            int var132 = var130.field1191 / 32 - field2829.field1191 / 32;
                                                            client.method1564(var12, var13, var131, var132, field628[1], var98);
                                                        }
                                                    }
                                                }
                                                if (client.field1117 != 0) {
                                                    int var133 = client.field1117 * 4 + 2 - field2829.field1232 / 32;
                                                    int var134 = client.field1012 * 4 + 2 - field2829.field1191 / 32;
                                                    client.method458(var12, var13, var133, var134, field628[0], var98);
                                                }
                                                if (!field2829.field878) {
                                                    class282.method4551(var98.field2581 / 2 + var12 - 1, var98.field2582 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var106 = 0; var106 < 104; var106++) {
                                                class194 var107 = client.field1084[field237][var105][var106];
                                                if (var107 != null) {
                                                    int var108 = var105 * 4 + 2 - field2829.field1232 / 32;
                                                    int var109 = var106 * 4 + 2 - field2829.field1191 / 32;
                                                    client.method458(var12, var13, var108, var109, field1749[0], var98);
                                                }
                                            }
                                            var105++;
                                        }
                                    }
                                    client.field972[var11] = true;
                                }
                                class282.method4560(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2739 == 1339) {
                                class211 var135 = var10.method3669(false);
                                if (var135 != null) {
                                    if (client.field1119 < 3) {
                                        field2020.method4682(var12, var13, var135.field2581, var135.field2582, 25, 25, client.field915, 256, var135.field2579, var135.field2580);
                                    } else {
                                        class282.method4566(var12, var13, 0, var135.field2579, var135.field2580);
                                    }
                                }
                                class282.method4560(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2739 == 1400) {
                                field230.method4812(var12, var13, var10.field2645, var10.field2634, client.field902);
                            }
                            if (var10.field2739 == 1401) {
                                field230.method4813(var12, var13, var10.field2645, var10.field2634);
                            }
                        }
                        if (var10.field2695 == 0) {
                            if (!var10.field2629 && client.method3128(var10) && field3303 != var10) {
                                continue;
                            }
                            if (!var10.field2629) {
                                if (var10.field2713 > var10.field2654 - var10.field2634) {
                                    var10.field2713 = var10.field2654 - var10.field2634;
                                }
                                if (var10.field2713 < 0) {
                                    var10.field2713 = 0;
                                }
                            }
                            method3658(arg0, var10.field2630, var19, var20, var21, var22, var12 - var10.field2651, var13 - var10.field2713, var11);
                            if (var10.field2754 != null) {
                                method3658(var10.field2754, var10.field2630, var19, var20, var21, var22, var12 - var10.field2651, var13 - var10.field2713, var11);
                            }
                            class69 var136 = (class69) client.field1097.method3263((long) var10.field2630);
                            if (var136 != null) {
                                client.method5(var136.field810, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class282.method4560(arg2, arg3, arg4, arg5);
                            class137.method2366();
                        }
                        if (client.field1098 || client.field1091[var11] || client.field1096 > 1) {
                            if (var10.field2695 == 0 && !var10.field2629 && var10.field2654 > var10.field2634) {
                                int var137 = var10.field2645 + var12;
                                int var138 = var10.field2713;
                                int var139 = var10.field2634;
                                int var140 = var10.field2654;
                                field3328[0].method4636(var137, var13);
                                field3328[1].method4636(var137, var13 + var139 - 16);
                                class282.method4551(var137, var13 + 16, 16, var139 - 32, client.field960);
                                int var141 = (var139 - 32) * var139 / var140;
                                if (var141 < 8) {
                                    var141 = 8;
                                }
                                int var142 = (var139 - 32 - var141) * var138 / (var140 - var139);
                                class282.method4551(var137, var13 + 16 + var142, 16, var141, client.field910);
                                class282.method4562(var137, var13 + 16 + var142, var141, client.field963);
                                class282.method4562(var137 + 1, var13 + 16 + var142, var141, client.field963);
                                class282.method4617(var137, var13 + 16 + var142, 16, client.field963);
                                class282.method4617(var137, var13 + 17 + var142, 16, client.field963);
                                class282.method4562(var137 + 15, var13 + 16 + var142, var141, client.field962);
                                class282.method4562(var137 + 14, var13 + 17 + var142, var141 - 1, client.field962);
                                class282.method4617(var137, var13 + 15 + var142 + var141, 16, client.field962);
                                class282.method4617(var137 + 1, var13 + 14 + var142 + var141, 15, client.field962);
                            }
                            if (var10.field2695 != 1) {
                                if (var10.field2695 == 2) {
                                    int var143 = 0;
                                    for (int var144 = 0; var144 < var10.field2642; var144++) {
                                        for (int var145 = 0; var145 < var10.field2641; var145++) {
                                            int var146 = (var10.field2668 + 32) * var145 + var12;
                                            int var147 = (var10.field2660 + 32) * var144 + var13;
                                            if (var143 < 20) {
                                                var146 += var10.field2698[var143];
                                                var147 += var10.field2699[var143];
                                            }
                                            if (var10.field2748[var143] > 0) {
                                                boolean var148 = false;
                                                boolean var149 = false;
                                                int var150 = var10.field2748[var143] - 1;
                                                if (var146 + 32 > arg2 && var146 < arg4 && var147 + 32 > arg3 && var147 < arg5 || field308 == var10 && client.field997 == var143) {
                                                    class286 var151;
                                                    if (client.field1037 == 1 && field474 == var143 && field549 == var10.field2630) {
                                                        var151 = class257.method619(var150, var10.field2749[var143], 2, 0, 2, false);
                                                    } else {
                                                        var151 = class257.method619(var150, var10.field2749[var143], 1, 3153952, 2, false);
                                                    }
                                                    if (var151 == null) {
                                                        client.method625(var10);
                                                    } else if (field308 == var10 && client.field997 == var143) {
                                                        int var152 = class60.field697 - client.field998;
                                                        int var153 = class60.field706 * -119379047 - client.field999;
                                                        if (var152 < 5 && var152 > -5) {
                                                            var152 = 0;
                                                        }
                                                        if (var153 < 5 && var153 > -5) {
                                                            var153 = 0;
                                                        }
                                                        if (client.field1048 < 5) {
                                                            var152 = 0;
                                                            var153 = 0;
                                                        }
                                                        var151.method4739(var146 + var152, var147 + var153, 128);
                                                        if (arg1 != -1) {
                                                            class217 var154 = arg0[arg1 & 0xFFFF];
                                                            if (var147 + var153 < class282.field3741 && var154.field2713 > 0) {
                                                                int var155 = client.field1079 * (class282.field3741 - var147 - var153) / 3;
                                                                if (var155 > client.field1079 * 10) {
                                                                    var155 = client.field1079 * 10;
                                                                }
                                                                if (var155 > var154.field2713) {
                                                                    var155 = var154.field2713;
                                                                }
                                                                var154.field2713 -= var155;
                                                                client.field999 += var155;
                                                                client.method625(var154);
                                                            }
                                                            if (var147 + var153 + 32 > class282.field3742 && var154.field2713 < var154.field2654 - var154.field2634) {
                                                                int var156 = client.field1079 * (var147 + var153 + 32 - class282.field3742) / 3;
                                                                if (var156 > client.field1079 * 10) {
                                                                    var156 = client.field1079 * 10;
                                                                }
                                                                if (var156 > var154.field2654 - var154.field2634 - var154.field2713) {
                                                                    var156 = var154.field2654 - var154.field2634 - var154.field2713;
                                                                }
                                                                var154.field2713 += var156;
                                                                client.field999 -= var156;
                                                                client.method625(var154);
                                                            }
                                                        }
                                                    } else if (field375 == var10 && client.field996 == var143) {
                                                        var151.method4739(var146, var147, 128);
                                                    } else {
                                                        var151.method4671(var146, var147);
                                                    }
                                                }
                                            } else if (var10.field2725 != null && var143 < 20) {
                                                class286 var157 = var10.method3679(var143);
                                                if (var157 != null) {
                                                    var157.method4671(var146, var147);
                                                } else if (class217.field2628) {
                                                    client.method625(var10);
                                                }
                                            }
                                            var143++;
                                        }
                                    }
                                } else if (var10.field2695 == 3) {
                                    int var158;
                                    if (client.method1452(var10)) {
                                        var158 = var10.field2656;
                                        if (field3303 == var10 && var10.field2658 != 0) {
                                            var158 = var10.field2658;
                                        }
                                    } else {
                                        var158 = var10.field2711;
                                        if (field3303 == var10 && var10.field2657 != 0) {
                                            var158 = var10.field2657;
                                        }
                                    }
                                    if (var10.field2659) {
                                        switch(var10.field2704.field3754) {
                                            case 1:
                                                class282.method4552(var12, var13, var10.field2645, var10.field2634, var10.field2711, var10.field2656, 256 - (var10.field2661 & 0xFF), 256 - (var10.field2662 & 0xFF));
                                                break;
                                            case 2:
                                                class282.method4553(var12, var13, var10.field2645, var10.field2634, var10.field2711, var10.field2656, 256 - (var10.field2661 & 0xFF), 256 - (var10.field2662 & 0xFF));
                                                break;
                                            case 3:
                                                class282.method4554(var12, var13, var10.field2645, var10.field2634, var10.field2711, var10.field2656, 256 - (var10.field2661 & 0xFF), 256 - (var10.field2662 & 0xFF));
                                                break;
                                            case 4:
                                                class282.method4593(var12, var13, var10.field2645, var10.field2634, var10.field2711, var10.field2656, 256 - (var10.field2661 & 0xFF), 256 - (var10.field2662 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class282.method4551(var12, var13, var10.field2645, var10.field2634, var158);
                                                } else {
                                                    class282.method4550(var12, var13, var10.field2645, var10.field2634, var158, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class282.method4545(var12, var13, var10.field2645, var10.field2634, var158);
                                    } else {
                                        class282.method4559(var12, var13, var10.field2645, var10.field2634, var158, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2695 == 4) {
                                    class264 var159 = var10.method3666();
                                    if (var159 != null) {
                                        String var160 = var10.field2690;
                                        int var161;
                                        if (client.method1452(var10)) {
                                            var161 = var10.field2656;
                                            if (field3303 == var10 && var10.field2658 != 0) {
                                                var161 = var10.field2658;
                                            }
                                            if (var10.field2620.length() > 0) {
                                                var160 = var10.field2620;
                                            }
                                        } else {
                                            var161 = var10.field2711;
                                            if (field3303 == var10 && var10.field2657 != 0) {
                                                var161 = var10.field2657;
                                            }
                                        }
                                        if (var10.field2629 && var10.field2750 != -1) {
                                            class257 var162 = method992(var10.field2750);
                                            var160 = var162.field3477;
                                            if (var160 == null) {
                                                var160 = "null";
                                            }
                                            if ((var162.field3511 == 1 || var10.field2751 != 1) && var10.field2751 != -1) {
                                                var160 = class89.method1751(16748608) + var160 + class89.field1363 + " " + 'x' + method15(var10.field2751);
                                            }
                                        }
                                        if (client.field896 == var10) {
                                            class226 var10000 = (class226) null;
                                            var160 = class226.field3022;
                                            var161 = var10.field2711;
                                        }
                                        if (!var10.field2629) {
                                            var160 = client.method2458(var160, var10);
                                        }
                                        var159.method4447(var160, var12, var13, var10.field2645, var10.field2634, var161, var10.field2621 ? 0 : -1, var10.field2693, var10.field2688, var10.field2692);
                                    } else if (class217.field2628) {
                                        client.method625(var10);
                                    }
                                } else if (var10.field2695 == 5) {
                                    if (var10.field2629) {
                                        class286 var164;
                                        if (var10.field2750 == -1) {
                                            var164 = var10.method3688(false);
                                        } else {
                                            var164 = class257.method619(var10.field2750, var10.field2751, var10.field2669, var10.field2670, var10.field2745, false);
                                        }
                                        if (var164 != null) {
                                            int var165 = var164.field3771;
                                            int var166 = var164.field3775;
                                            if (var10.field2734) {
                                                class282.method4570(var12, var13, var10.field2645 + var12, var10.field2634 + var13);
                                                int var167 = (var10.field2645 + (var165 - 1)) / var165;
                                                int var168 = (var10.field2634 + (var166 - 1)) / var166;
                                                for (int var169 = 0; var169 < var167; var169++) {
                                                    for (int var170 = 0; var170 < var168; var170++) {
                                                        if (var10.field2728 != 0) {
                                                            var164.method4684(var165 / 2 + var165 * var169 + var12, var166 / 2 + var166 * var170 + var13, var10.field2728, 4096);
                                                        } else if (var14 == 0) {
                                                            var164.method4671(var165 * var169 + var12, var166 * var170 + var13);
                                                        } else {
                                                            var164.method4739(var165 * var169 + var12, var166 * var170 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class282.method4560(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var171 = var10.field2645 * 4096 / var165;
                                                if (var10.field2728 != 0) {
                                                    var164.method4684(var10.field2645 / 2 + var12, var10.field2634 / 2 + var13, var10.field2728, var171);
                                                } else if (var14 != 0) {
                                                    var164.method4707(var12, var13, var10.field2645, var10.field2634, 256 - (var14 & 0xFF));
                                                } else if (var10.field2645 == var165 && var10.field2634 == var166) {
                                                    var164.method4671(var12, var13);
                                                } else {
                                                    var164.method4673(var12, var13, var10.field2645, var10.field2634);
                                                }
                                            }
                                        } else if (class217.field2628) {
                                            client.method625(var10);
                                        }
                                    } else {
                                        class286 var163 = var10.method3688(client.method1452(var10));
                                        if (var163 != null) {
                                            var163.method4671(var12, var13);
                                        } else if (class217.field2628) {
                                            client.method625(var10);
                                        }
                                    }
                                } else if (var10.field2695 == 6) {
                                    boolean var172 = client.method1452(var10);
                                    int var173;
                                    if (var172) {
                                        var173 = var10.field2735;
                                    } else {
                                        var173 = var10.field2677;
                                    }
                                    class134 var174 = null;
                                    int var175 = 0;
                                    if (var10.field2750 != -1) {
                                        class257 var176 = method992(var10.field2750);
                                        if (var176 != null) {
                                            class257 var177 = var176.method4196(var10.field2751);
                                            var174 = var177.method4170(1);
                                            if (var174 == null) {
                                                client.method625(var10);
                                            } else {
                                                var174.method2270();
                                                var175 = var174.field2088 / 2;
                                            }
                                        }
                                    } else if (var10.field2671 == 5) {
                                        if (var10.field2674 == 0) {
                                            var174 = client.field1156.method3620((class261) null, -1, (class261) null, -1);
                                        } else {
                                            var174 = field2829.method1046();
                                        }
                                    } else if (var173 == -1) {
                                        var174 = var10.method3668((class261) null, -1, var172, field2829.field858);
                                        if (var174 == null && class217.field2628) {
                                            client.method625(var10);
                                        }
                                    } else {
                                        class261 var178 = class261.method494(var173);
                                        var174 = var10.method3668(var178, var10.field2752, var172, field2829.field858);
                                        if (var174 == null && class217.field2628) {
                                            client.method625(var10);
                                        }
                                    }
                                    class137.method2447(var10.field2645 / 2 + var12, var10.field2634 / 2 + var13);
                                    int var179 = var10.field2684 * class137.field1997[var10.field2681] >> 16;
                                    int var180 = var10.field2684 * class137.field1992[var10.field2681] >> 16;
                                    if (var174 != null) {
                                        if (var10.field2629) {
                                            var174.method2270();
                                            if (var10.field2687) {
                                                var174.method2284(0, var10.field2737, var10.field2683, var10.field2681, var10.field2679, var10.field2694 + var175 + var179, var10.field2694 + var180, var10.field2684);
                                            } else {
                                                var174.method2283(0, var10.field2737, var10.field2683, var10.field2681, var10.field2679, var10.field2694 + var175 + var179, var10.field2694 + var180);
                                            }
                                        } else {
                                            var174.method2283(0, var10.field2737, 0, var10.field2681, 0, var179, var180);
                                        }
                                    }
                                    class137.method2368();
                                } else {
                                    if (var10.field2695 == 7) {
                                        class264 var181 = var10.method3666();
                                        if (var181 == null) {
                                            if (class217.field2628) {
                                                client.method625(var10);
                                            }
                                            continue;
                                        }
                                        int var182 = 0;
                                        for (int var183 = 0; var183 < var10.field2642; var183++) {
                                            for (int var184 = 0; var184 < var10.field2641; var184++) {
                                                if (var10.field2748[var182] > 0) {
                                                    class257 var185 = method992(var10.field2748[var182] - 1);
                                                    String var186;
                                                    if (var185.field3511 != 1 && var10.field2749[var182] == 1) {
                                                        var186 = class89.method1751(16748608) + var185.field3477 + class89.field1363;
                                                    } else {
                                                        var186 = class89.method1751(16748608) + var185.field3477 + class89.field1363 + " " + 'x' + method15(var10.field2749[var182]);
                                                    }
                                                    int var187 = (var10.field2668 + 115) * var184 + var12;
                                                    int var188 = (var10.field2660 + 12) * var183 + var13;
                                                    if (var10.field2693 == 0) {
                                                        var181.method4371(var186, var187, var188, var10.field2711, var10.field2621 ? 0 : -1);
                                                    } else if (var10.field2693 == 1) {
                                                        var181.method4363(var186, var10.field2645 / 2 + var187, var188, var10.field2711, var10.field2621 ? 0 : -1);
                                                    } else {
                                                        var181.method4362(var186, var10.field2645 + var187 - 1, var188, var10.field2711, var10.field2621 ? 0 : -1);
                                                    }
                                                }
                                                var182++;
                                            }
                                        }
                                    }
                                    if (var10.field2695 == 8 && field1373 == var10 && client.field1088 == client.field1036) {
                                        int var189 = 0;
                                        int var190 = 0;
                                        class264 var191 = field306;
                                        String var192 = var10.field2690;
                                        String var193 = client.method2458(var192, var10);
                                        while (var193.length() > 0) {
                                            int var194 = var193.indexOf(class89.field1356);
                                            String var195;
                                            if (var194 == -1) {
                                                var195 = var193;
                                                var193 = "";
                                            } else {
                                                var195 = var193.substring(0, var194);
                                                var193 = var193.substring(var194 + 4);
                                            }
                                            int var196 = var191.method4434(var195);
                                            if (var196 > var189) {
                                                var189 = var196;
                                            }
                                            var190 += var191.field3623 + 1;
                                        }
                                        var189 += 6;
                                        var190 += 7;
                                        int var197 = var10.field2645 + var12 - 5 - var189;
                                        int var198 = var10.field2634 + var13 + 5;
                                        if (var197 < var12 + 5) {
                                            var197 = var12 + 5;
                                        }
                                        if (var189 + var197 > arg4) {
                                            var197 = arg4 - var189;
                                        }
                                        if (var190 + var198 > arg5) {
                                            var198 = arg5 - var190;
                                        }
                                        class282.method4551(var197, var198, var189, var190, 16777120);
                                        class282.method4545(var197, var198, var189, var190, 0);
                                        String var199 = var10.field2690;
                                        int var200 = var191.field3623 + var198 + 2;
                                        String var201 = client.method2458(var199, var10);
                                        while (var201.length() > 0) {
                                            int var202 = var201.indexOf(class89.field1356);
                                            String var203;
                                            if (var202 == -1) {
                                                var203 = var201;
                                                var201 = "";
                                            } else {
                                                var203 = var201.substring(0, var202);
                                                var201 = var201.substring(var202 + 4);
                                            }
                                            var191.method4371(var203, var197 + 3, var200, 0, -1);
                                            var200 += var191.field3623 + 1;
                                        }
                                    }
                                    if (var10.field2695 == 9) {
                                        int var204;
                                        int var205;
                                        int var206;
                                        int var207;
                                        if (var10.field2664) {
                                            var204 = var12;
                                            var205 = var10.field2634 + var13;
                                            var206 = var10.field2645 + var12;
                                            var207 = var13;
                                        } else {
                                            var204 = var12;
                                            var205 = var13;
                                            var206 = var10.field2645 + var12;
                                            var207 = var10.field2634 + var13;
                                        }
                                        if (var10.field2663 == 1) {
                                            class282.method4575(var204, var205, var206, var207, var10.field2711);
                                        } else {
                                            int var210 = var10.field2711;
                                            int var211 = var10.field2663;
                                            int var212 = var206 - var204;
                                            int var213 = var207 - var205;
                                            int var214 = var212 >= 0 ? var212 : -var212;
                                            int var215 = var213 >= 0 ? var213 : -var213;
                                            int var216 = var214;
                                            if (var214 < var215) {
                                                var216 = var215;
                                            }
                                            if (var216 != 0) {
                                                int var217 = (var212 << 16) / var216;
                                                int var218 = (var213 << 16) / var216;
                                                if (var218 <= var217) {
                                                    var217 = -var217;
                                                } else {
                                                    var218 = -var218;
                                                }
                                                int var219 = var211 * var218 >> 17;
                                                int var220 = var211 * var218 + 1 >> 17;
                                                int var221 = var211 * var217 >> 17;
                                                int var222 = var211 * var217 + 1 >> 17;
                                                int var223 = var204 - class282.field3743;
                                                int var224 = var205 - class282.field3741;
                                                int var225 = var219 + var223;
                                                int var226 = var223 - var220;
                                                int var227 = var212 + var223 - var220;
                                                int var228 = var212 + var223 + var219;
                                                int var229 = var221 + var224;
                                                int var230 = var224 - var222;
                                                int var231 = var213 + var224 - var222;
                                                int var232 = var213 + var224 + var221;
                                                class137.method2374(var225, var226, var227);
                                                class137.method2417(var229, var230, var231, var225, var226, var227, var210);
                                                class137.method2374(var225, var227, var228);
                                                class137.method2417(var229, var231, var232, var225, var227, var228, var210);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.ii(IB)Ljava/lang/String;")
    public static final String method15(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class89.field1359 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class89.method1751(65408) + var1.substring(0, var1.length() - 8) + class226.field2995 + " " + class89.field1364 + var1 + class89.field1362 + class89.field1363;
        } else if (var1.length() > 6) {
            return " " + class89.method1751(16777215) + var1.substring(0, var1.length() - 4) + class226.field3031 + " " + class89.field1364 + var1 + class89.field1362 + class89.field1363;
        } else {
            return " " + class89.method1751(16776960) + var1 + class89.field1363;
        }
    }
}
