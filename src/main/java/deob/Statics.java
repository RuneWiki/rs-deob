package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("l.ev")
    public static SecureRandom field10;

    @ObfuscatedName("bu.dz")
    public static class252 field1004;

    @ObfuscatedName("bu.q")
    public static int[] field1010;

    @ObfuscatedName("bu.ga")
    public static class324[] field1012;

    @ObfuscatedName("bt.u")
    public static String[] field1030;

    @ObfuscatedName("bt.qq")
    public static int field1031;

    @ObfuscatedName("v.dm")
    public static class156 field105;

    @ObfuscatedName("bj.w")
    public static int[] field1051;

    @ObfuscatedName("v.gd")
    public static class324[] field107;

    @ObfuscatedName("bz.p")
    public static class323 field1081;

    @ObfuscatedName("bd.jw")
    public static class114 field1087;

    @ObfuscatedName("v.dy")
    public static class160 field109;

    @ObfuscatedName("br.de")
    public static class252 field1108;

    @ObfuscatedName("br.ag")
    public static int[] field1109;

    @ObfuscatedName("bh.p")
    public static byte[][][] field1117;

    @ObfuscatedName("v.bn")
    public static String field112;

    @ObfuscatedName("bp.gi")
    public static byte[][] field1126;

    @ObfuscatedName("g.db")
    public static class252 field113;

    @ObfuscatedName("cf.q")
    public static int[] field1132;

    @ObfuscatedName("cf.ay")
    public static client field1133;

    @ObfuscatedName("ci.s")
    public static class323 field1138;

    @ObfuscatedName("ci.m")
    public static class323 field1140;

    @ObfuscatedName("ci.w")
    public static class323 field1145;

    @ObfuscatedName("ci.f")
    public static boolean field1159;

    @ObfuscatedName("ci.a")
    public static class324 field1170;

    @ObfuscatedName("cm.z")
    public static class163 field1200;

    @ObfuscatedName("cm.r")
    public static byte[][] field1205;

    @ObfuscatedName("cj.x")
    public static class92 field1208;

    @ObfuscatedName("cj.w")
    public static long field1210;

    @ObfuscatedName("cy.dw")
    public static class252 field1211;

    @ObfuscatedName("cy.sr")
    public static long field1226;

    @ObfuscatedName("cv.m")
    public static int field1244;

    @ObfuscatedName("cz.m")
    public static class139 field1254;

    @ObfuscatedName("l.dx")
    public static class252 field13;

    @ObfuscatedName("ce.d")
    public static int field1305;

    @ObfuscatedName("ce.p")
    public static int field1312;

    @ObfuscatedName("ce.r")
    public static int field1313;

    @ObfuscatedName("ce.m")
    public static int field1314;

    @ObfuscatedName("ce.c")
    public static byte[] field1315;

    @ObfuscatedName("ce.z")
    public static class93[] field1316;

    @ObfuscatedName("ce.x")
    public static class97[] field1318;

    @ObfuscatedName("ce.v")
    public static class104[] field1319;

    @ObfuscatedName("j.d")
    public static class323 field132;

    @ObfuscatedName("ce.j")
    public static boolean[] field1320;

    @ObfuscatedName("ce.b")
    public static int[] field1321;

    @ObfuscatedName("ce.g")
    public static class109[] field1322;

    @ObfuscatedName("ce.i")
    public static float[] field1327;

    @ObfuscatedName("ce.q")
    public static float[] field1329;

    @ObfuscatedName("ce.y")
    public static float[] field1330;

    @ObfuscatedName("ce.av")
    public static float[] field1331;

    @ObfuscatedName("ce.ag")
    public static float[] field1332;

    @ObfuscatedName("ce.af")
    public static float[] field1333;

    @ObfuscatedName("ce.az")
    public static int[] field1334;

    @ObfuscatedName("ce.at")
    public static int[] field1335;

    @ObfuscatedName("ce.k")
    public static float[] field1336;

    @ObfuscatedName("cd.d")
    public static int[] field1347;

    @ObfuscatedName("cd.z")
    public static boolean[] field1348;

    @ObfuscatedName("cd.m")
    public static int[] field1353;

    @ObfuscatedName("ch.e")
    public static int field1356;

    @ObfuscatedName("ch.m")
    public static class100 field1358;

    @ObfuscatedName("j.je")
    public static class62 field138;

    @ObfuscatedName("j.pf")
    public static class324 field139;

    @ObfuscatedName("ct.c")
    public static int field1397;

    @ObfuscatedName("b.ss")
    public static class68 field141;

    @ObfuscatedName("dt.x")
    public static int field1411;

    @ObfuscatedName("dt.dh")
    public static class252 field1414;

    @ObfuscatedName("b.qh")
    public static int field142;

    @ObfuscatedName("dd.r")
    public static int field1438;

    @ObfuscatedName("dd.p")
    public static float field1440;

    @ObfuscatedName("da.jx")
    public static class233 field1497;

    @ObfuscatedName("da.fk")
    public static long field1498;

    @ObfuscatedName("dc.bd")
    public static class323[] field1515;

    @ObfuscatedName("dc.m")
    public static int field1517;

    @ObfuscatedName("b.qm")
    public static class98 field154;

    @ObfuscatedName("du.g")
    public static int[] field1600;

    @ObfuscatedName("dx.aj")
    public static String field1635;

    @ObfuscatedName("ds.bg")
    public static int field1689;

    @ObfuscatedName("ds.ba")
    public static int field1695;

    @ObfuscatedName("ds.bm")
    public static int field1696;

    @ObfuscatedName("de.e")
    public static int field1711;

    @ObfuscatedName("de.a")
    public static int field1712;

    @ObfuscatedName("dz.i")
    public static class134 field1724;

    @ObfuscatedName("dz.v")
    public static int field1726;

    @ObfuscatedName("dz.x")
    public static int field1736;

    @ObfuscatedName("dz.g")
    public static int field1737;

    @ObfuscatedName("dz.j")
    public static int field1739;

    @ObfuscatedName("dz.t")
    public static int field1740;

    @ObfuscatedName("dz.u")
    public static int field1741;

    @ObfuscatedName("dz.n")
    public static int field1742;

    @ObfuscatedName("dz.b")
    public static int field1744;

    @ObfuscatedName("dk.z")
    public static int field1756;

    @ObfuscatedName("dq.sv")
    public static class2 field1764;

    @ObfuscatedName("t.qf")
    public static int field178;

    @ObfuscatedName("dh.o")
    public static int field1782;

    @ObfuscatedName("dh.n")
    public static int field1785;

    @ObfuscatedName("dh.h")
    public static int field1786;

    @ObfuscatedName("dh.i")
    public static int field1788;

    @ObfuscatedName("dh.k")
    public static int field1789;

    @ObfuscatedName("t.jc")
    public static class233 field179;

    @ObfuscatedName("dh.b")
    public static int field1790;

    @ObfuscatedName("dh.av")
    public static int field1792;

    @ObfuscatedName("dh.ag")
    public static int field1793;

    @ObfuscatedName("dh.af")
    public static int field1794;

    @ObfuscatedName("dh.az")
    public static int field1795;

    @ObfuscatedName("dh.u")
    public static int field1797;

    @ObfuscatedName("dh.y")
    public static int field1813;

    @ObfuscatedName("dh.bw")
    public static int field1816;

    @ObfuscatedName("dh.t")
    public static int field1820;

    @ObfuscatedName("dh.bq")
    public static int field1825;

    @ObfuscatedName("dh.bg")
    public static boolean[][] field1826;

    @ObfuscatedName("dh.q")
    public static int field1828;

    @ObfuscatedName("dh.bi")
    public static int field1829;

    @ObfuscatedName("dh.bn")
    public static int field1830;

    @ObfuscatedName("dh.bv")
    public static int field1831;

    @ObfuscatedName("dh.bu")
    public static int field1832;

    @ObfuscatedName("df.di")
    public static class252 field1835;

    @ObfuscatedName("df.r")
    public static int field1838;

    @ObfuscatedName("df.gm")
    public static int[] field1839;

    @ObfuscatedName("dj.em")
    public static int[] field1840;

    @ObfuscatedName("ey.gb")
    public static class323[] field1856;

    @ObfuscatedName("et.dc")
    public static class252 field1858;

    @ObfuscatedName("et.rl")
    public static class69 field1863;

    @ObfuscatedName("es.ae")
    public static class321 field1916;

    @ObfuscatedName("es.eb")
    public static int field1919;

    @ObfuscatedName("ea.bc")
    public static class323[] field1920;

    @ObfuscatedName("eu.gz")
    public static class324[] field1933;

    @ObfuscatedName("ee.dp")
    public static class252 field1940;

    @ObfuscatedName("ev.az")
    public static Font field1955;

    @ObfuscatedName("ev.d")
    public static boolean field1959;

    @ObfuscatedName("em.p")
    public static ScheduledExecutorService field1961;

    @ObfuscatedName("h.nm")
    public static int field197;

    @ObfuscatedName("ei.p")
    public static int field1972;

    @ObfuscatedName("h.qw")
    public static int field198;

    @ObfuscatedName("eh.r")
    public static byte[][][] field1982;

    @ObfuscatedName("eh.jj")
    public static int field1983;

    @ObfuscatedName("h.dg")
    public static class252 field199;

    @ObfuscatedName("ep.s")
    public static int field1994;

    @ObfuscatedName("ep.l")
    public static String field1995;

    @ObfuscatedName("ep.w")
    public static int field1996;

    @ObfuscatedName("ep.f")
    public static Applet field1999;

    @ObfuscatedName("ep.d")
    public static int field2000;

    @ObfuscatedName("ep.n")
    public static class185 field2003;

    @ObfuscatedName("ep.j")
    public static int field2004;

    @ObfuscatedName("fd.l")
    public static String field2020;

    @ObfuscatedName("fd.fq")
    public static int field2025;

    @ObfuscatedName("fd.hx")
    public static int field2026;

    @ObfuscatedName("fk.s")
    public static File field2028;

    @ObfuscatedName("fk.a")
    public static int field2031;

    @ObfuscatedName("fk.e")
    public static File field2032;

    @ObfuscatedName("fk.b")
    public static String[] field2038;

    @ObfuscatedName("o.lr")
    public static int field204;

    @ObfuscatedName("fk.lu")
    public static class233 field2042;

    @ObfuscatedName("fo.qa")
    public static int field2043;

    @ObfuscatedName("fz.l")
    public static File field2046;

    @ObfuscatedName("fz.a")
    public static int field2049;

    @ObfuscatedName("fj.ey")
    public static class312 field2054;

    @ObfuscatedName("fb.c")
    public static class250 field2055;

    @ObfuscatedName("fb.ho")
    public static int field2056;

    @ObfuscatedName("fi.ls")
    public static class233 field2077;

    @ObfuscatedName("fe.au")
    public static boolean field2088;

    @ObfuscatedName("fr.v")
    public static class233 field2106;

    @ObfuscatedName("i.c")
    public static class324 field212;

    @ObfuscatedName("fh.az")
    public static int[] field2120;

    @ObfuscatedName("s.v")
    public static int[] field22;

    @ObfuscatedName("k.dq")
    public static class252 field227;

    @ObfuscatedName("fg.jf")
    public static class233 field2310;

    @ObfuscatedName("fg.fz")
    public static class160 field2311;

    @ObfuscatedName("fn.gk")
    public static class323[] field2319;

    @ObfuscatedName("q.da")
    public static class252 field233;

    @ObfuscatedName("fu.t")
    public static int field2333;

    @ObfuscatedName("fl.h")
    public static String field2336;

    @ObfuscatedName("fl.rf")
    public static int field2343;

    @ObfuscatedName("ft.bi")
    public static int field2344;

    @ObfuscatedName("fq.pa")
    public static class296 field2353;

    @ObfuscatedName("fv.gp")
    public static class323[] field2354;

    @ObfuscatedName("fv.do")
    public static long field2357;

    @ObfuscatedName("fv.a")
    public static class250 field2358;

    @ObfuscatedName("gr.nf")
    public static int field2376;

    @ObfuscatedName("q.gw")
    public static int[][] field239;

    @ObfuscatedName("s.e")
    public static class323[] field24;

    @ObfuscatedName("q.co")
    public static int field241;

    @ObfuscatedName("gr.gr")
    public static int[] field2412;

    @ObfuscatedName("gw.p")
    public static int[] field2425;

    @ObfuscatedName("gw.c")
    public static int[] field2427;

    @ObfuscatedName("gw.gh")
    public static int field2428;

    @ObfuscatedName("y.df")
    public static class252 field243;

    @ObfuscatedName("gi.l")
    public static long field2432;

    @ObfuscatedName("gi.f")
    public static long field2434;

    @ObfuscatedName("y.x")
    public static class323 field244;

    @ObfuscatedName("gx.es")
    public static String field2440;

    @ObfuscatedName("gn.l")
    public static class250 field2442;

    @ObfuscatedName("gh.kr")
    public static int field2460;

    @ObfuscatedName("gj.gy")
    public static int field2466;

    @ObfuscatedName("av.k")
    public static int field253;

    @ObfuscatedName("hs.f")
    public static class250 field2531;

    @ObfuscatedName("hs.w")
    public static class250 field2532;

    @ObfuscatedName("hs.l")
    public static class250 field2533;

    @ObfuscatedName("hs.x")
    public static class101 field2535;

    @ObfuscatedName("hs.s")
    public static class221 field2536;

    @ObfuscatedName("hs.ry")
    public static int field2537;

    @ObfuscatedName("av.dr")
    public static class252 field254;

    @ObfuscatedName("av.by")
    public static class324[] field255;

    @ObfuscatedName("av.bq")
    public static String field257;

    @ObfuscatedName("hz.ex")
    public static int field2587;

    @ObfuscatedName("hy.fl")
    public static int field2611;

    @ObfuscatedName("ht.c")
    public static int field2623;

    @ObfuscatedName("ho.c")
    public static short[] field2636;

    @ObfuscatedName("ho.r")
    public static short[] field2641;

    @ObfuscatedName("ho.p")
    public static short[][] field2643;

    @ObfuscatedName("hr.i")
    public static int field2652;

    @ObfuscatedName("hw.a")
    public static class233[][] field2657;

    @ObfuscatedName("hw.r")
    public static class250 field2659;

    @ObfuscatedName("hw.m")
    public static class250 field2660;

    @ObfuscatedName("hw.d")
    public static class250 field2661;

    @ObfuscatedName("ag.gx")
    public static byte[][] field268;

    @ObfuscatedName("hw.p")
    public static class250 field2696;

    @ObfuscatedName("s.g")
    public static int[][][] field27;

    @ObfuscatedName("af.r")
    public static int field271;

    @ObfuscatedName("af.i")
    public static int[] field273;

    @ObfuscatedName("af.bi")
    public static int field278;

    @ObfuscatedName("af.gv")
    public static int[] field279;

    @ObfuscatedName("af.bz")
    public static class323[] field281;

    @ObfuscatedName("ha.pt")
    public static boolean field2811;

    @ObfuscatedName("ig.fx")
    public static class301 field2818;

    @ObfuscatedName("id.a")
    public static boolean field2847;

    @ObfuscatedName("ix.hb")
    public static int field2853;

    @ObfuscatedName("az.p")
    public static int field292;

    @ObfuscatedName("at.cc")
    public static class59 field306;

    @ObfuscatedName("at.qt")
    public static int field311;

    @ObfuscatedName("am.sp")
    public static class328 field315;

    @ObfuscatedName("in.bw")
    public static String field3156;

    @ObfuscatedName("ib.qc")
    public static class98 field3164;

    @ObfuscatedName("is.gg")
    public static class324[] field3194;

    @ObfuscatedName("io.ds")
    public static class252 field3198;

    @ObfuscatedName("io.sk")
    public static int field3204;

    @ObfuscatedName("am.fu")
    public static int field321;

    @ObfuscatedName("iu.c")
    public static int[] field3217;

    @ObfuscatedName("am.hh")
    public static int field322;

    @ObfuscatedName("ir.e")
    public static Thread field3240;

    @ObfuscatedName("ij.v")
    public static class249 field3268;

    @ObfuscatedName("ij.f")
    public static class160 field3269;

    @ObfuscatedName("ij.x")
    public static boolean field3274;

    @ObfuscatedName("ip.r")
    public static int[] field3283;

    @ObfuscatedName("iq.f")
    public static class250 field3290;

    @ObfuscatedName("iy.f")
    public static class250 field3299;

    @ObfuscatedName("iy.l")
    public static int field3300;

    @ObfuscatedName("if.w")
    public static int field3301;

    @ObfuscatedName("if.f")
    public static class250 field3309;

    @ObfuscatedName("if.l")
    public static class258[] field3318;

    @ObfuscatedName("ic.f")
    public static class250 field3323;

    @ObfuscatedName("as.bl")
    public static class247 field334;

    @ObfuscatedName("jd.cc")
    public static char field3345;

    @ObfuscatedName("jd.f")
    public static class250 field3346;

    @ObfuscatedName("jv.ql")
    public static class105 field3354;

    @ObfuscatedName("jv.f")
    public static class250 field3356;

    @ObfuscatedName("jn.f")
    public static class250 field3357;

    @ObfuscatedName("jn.w")
    public static int field3358;

    @ObfuscatedName("as.e")
    public static byte[][][] field336;

    @ObfuscatedName("jn.l")
    public static class250 field3366;

    @ObfuscatedName("as.br")
    public static class323 field337;

    @ObfuscatedName("jc.l")
    public static class250 field3370;

    @ObfuscatedName("jc.f")
    public static class250 field3374;

    @ObfuscatedName("as.c")
    public static boolean[] field338;

    @ObfuscatedName("jk.qe")
    public static class91 field3384;

    @ObfuscatedName("jk.hi")
    public static int field3385;

    @ObfuscatedName("jg.lg")
    public static int field3387;

    @ObfuscatedName("jg.f")
    public static class250 field3393;

    @ObfuscatedName("jx.f")
    public static class250 field3399;

    @ObfuscatedName("jf.f")
    public static class250 field3402;

    @ObfuscatedName("jf.dk")
    public static class252 field3405;

    @ObfuscatedName("jl.gf")
    public static class128 field3406;

    @ObfuscatedName("jl.f")
    public static class250 field3411;

    @ObfuscatedName("jz.w")
    public static class250 field3420;

    @ObfuscatedName("jz.f")
    public static class250 field3425;

    @ObfuscatedName("jz.aj")
    public static GarbageCollectorMXBean field3427;

    @ObfuscatedName("al.aa")
    public static Image field343;

    @ObfuscatedName("jz.l")
    public static class250 field3442;

    @ObfuscatedName("jq.w")
    public static class250 field3448;

    @ObfuscatedName("jq.l")
    public static class250 field3481;

    @ObfuscatedName("js.a")
    public static class250 field3501;

    @ObfuscatedName("js.r")
    public static int field3502;

    @ObfuscatedName("js.s")
    public static int[] field3553;

    @ObfuscatedName("jp.r")
    public static int[][] field3558;

    @ObfuscatedName("ad.j")
    public static class185 field359;

    @ObfuscatedName("ji.f")
    public static class250 field3594;

    @ObfuscatedName("e.ge")
    public static class324 field36;

    @ObfuscatedName("jy.np")
    public static class159 field3600;

    @ObfuscatedName("jy.f")
    public static class250 field3609;

    @ObfuscatedName("jw.w")
    public static class250 field3612;

    @ObfuscatedName("jw.f")
    public static class250 field3615;

    @ObfuscatedName("jw.l")
    public static class250 field3620;

    @ObfuscatedName("ju.lm")
    public static int field3631;

    @ObfuscatedName("je.iz")
    public static int field3679;

    @ObfuscatedName("ja.gq")
    public static class324[] field3681;

    @ObfuscatedName("kj.x")
    public static int[] field3701;

    @ObfuscatedName("ka.nw")
    public static int field3715;

    @ObfuscatedName("kq.d")
    public static int[] field3733;

    @ObfuscatedName("ao.i")
    public static String field374;

    @ObfuscatedName("kd.m")
    public static class323[] field3772;

    @ObfuscatedName("kb.f")
    public static class177 field3780;

    @ObfuscatedName("kx.x")
    public static class233 field3782;

    @ObfuscatedName("kp.bx")
    public static class246 field3795;

    @ObfuscatedName("kv.ah")
    public static class316 field3798;

    @ObfuscatedName("kr.e")
    public static int field3799;

    @ObfuscatedName("lo.gc")
    public static class324[] field3833;

    @ObfuscatedName("lc.f")
    public static class250 field3834;

    @ObfuscatedName("lx.r")
    public static class323[] field3843;

    @ObfuscatedName("lx.ea")
    public static int field3844;

    @ObfuscatedName("lh.bs")
    public static class331 field3846;

    @ObfuscatedName("lz.af")
    public static int field3848;

    @ObfuscatedName("lz.az")
    public static int field3849;

    @ObfuscatedName("lz.ag")
    public static int[] field3850;

    @ObfuscatedName("ao.j")
    public static int field387;

    @ObfuscatedName("li.a")
    public static int[] field3883;

    @ObfuscatedName("li.z")
    public static int[] field3884;

    @ObfuscatedName("li.w")
    public static int field3885;

    @ObfuscatedName("li.e")
    public static int[] field3886;

    @ObfuscatedName("li.f")
    public static int field3887;

    @ObfuscatedName("li.l")
    public static int field3888;

    @ObfuscatedName("ae.p")
    public static boolean field391;

    @ObfuscatedName("ae.bm")
    public static int field392;

    @ObfuscatedName("ar.ee")
    public static int field398;

    @ObfuscatedName("ab.af")
    public static int[] field401;

    @ObfuscatedName("lg.f")
    public static String field4012;

    @ObfuscatedName("ab.nj")
    public static class233[] field402;

    @ObfuscatedName("au.ix")
    public static int field412;

    @ObfuscatedName("ah.u")
    public static int field419;

    @ObfuscatedName("a.rd")
    public static int field42;

    @ObfuscatedName("ah.p")
    public static int field424;

    @ObfuscatedName("a.cp")
    public static boolean field43;

    @ObfuscatedName("a.p")
    public static int[] field44;

    @ObfuscatedName("ah.f")
    public static class157 field445;

    @ObfuscatedName("ai.at")
    public static int[] field472;

    @ObfuscatedName("ai.o")
    public static String field473;

    @ObfuscatedName("an.m")
    public static int field476;

    @ObfuscatedName("an.k")
    public static int[] field477;

    @ObfuscatedName("an.ff")
    public static class301 field479;

    @ObfuscatedName("ay.s")
    public static byte[][][] field484;

    @ObfuscatedName("ay.a")
    public static byte[][][] field485;

    @ObfuscatedName("ay.c")
    public static byte[][][] field486;

    @ObfuscatedName("ay.m")
    public static int[] field487;

    @ObfuscatedName("c.fr")
    public static class299 field49;

    @ObfuscatedName("ay.b")
    public static class37 field497;

    @ObfuscatedName("ak.p")
    public static int field503;

    @ObfuscatedName("ak.sd")
    public static class254 field505;

    @ObfuscatedName("be.fe")
    public static class138 field507;

    @ObfuscatedName("be.ec")
    public static int field508;

    @ObfuscatedName("be.o")
    public static int[] field515;

    @ObfuscatedName("bo.z")
    public static class323 field517;

    @ObfuscatedName("bx.ao")
    public static String field531;

    @ObfuscatedName("bx.z")
    public static class226 field533;

    @ObfuscatedName("p.s")
    public static String[] field54;

    @ObfuscatedName("p.g")
    public static class112[] field55;

    @ObfuscatedName("bf.sn")
    public static short[] field552;

    @ObfuscatedName("bl.ft")
    public static int field557;

    @ObfuscatedName("bl.sh")
    public static int field559;

    @ObfuscatedName("p.m")
    public static short[][] field56;

    @ObfuscatedName("bl.ld")
    public static class77 field560;

    @ObfuscatedName("bs.fh")
    public static class301 field576;

    @ObfuscatedName("p.l")
    public static class250 field58;

    @ObfuscatedName("bg.hj")
    public static int field592;

    @ObfuscatedName("bg.r")
    public static int field593;

    @ObfuscatedName("bg.nu")
    public static class85 field594;

    @ObfuscatedName("bw.sg")
    public static class330 field607;

    @ObfuscatedName("bq.qr")
    public static int field625;

    @ObfuscatedName("r.x")
    public static class301 field64;

    @ObfuscatedName("m.eu")
    public static int field67;

    @ObfuscatedName("client.kv")
    public static int field677;

    @ObfuscatedName("m.sz")
    public static class165 field68;

    @ObfuscatedName("m.bg")
    public static int field69;

    @ObfuscatedName("l.ku")
    public static int field7;

    @ObfuscatedName("client.fm")
    public static class156 field702;

    @ObfuscatedName("d.kp")
    public static int field78;

    @ObfuscatedName("z.hv")
    public static int field81;

    @ObfuscatedName("z.at")
    public static FontMetrics field85;

    @ObfuscatedName("client.du")
    public static class252 field905;

    @ObfuscatedName("client.hf")
    public static int field907;

    @ObfuscatedName("z.gt")
    public static class324 field91;

    @ObfuscatedName("z.po")
    public static class310 field93;

    @ObfuscatedName("bn.dj")
    public static class252 field985;

    @ObfuscatedName("bu.e")
    public static class67[] field997;

    @ObfuscatedName("cc.f(I)J")
    public static synchronized long method1926() {
        long var0 = System.currentTimeMillis();
        if (var0 < field2434) {
            field2432 += field2434 - var0;
        }
        field2434 = var0;
        return field2432 + var0;
    }

    @ObfuscatedName("cv.f([Lgo;II)Lgo;")
    public static class191 method1912(class191[] arg0, int arg1) {
        class191[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class191 var4 = var2[var3];
            if (arg1 == var4.method148()) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("ao.l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method630(int arg0, String arg1, String arg2, String arg3) {
        class89 var4 = (class89) class86.field1241.get(arg0);
        if (var4 == null) {
            var4 = new class89();
            class86.field1241.put(arg0, var4);
        }
        class60 var5 = var4.method1933(arg0, arg1, arg2, arg3);
        class86.field1240.method3708(var5, (long) var5.field591);
        class86.field1242.method3899(var5);
        client.field792 = client.field815;
    }

    @ObfuscatedName("ae.w(Ljava/lang/String;ZLjava/lang/String;ZB)V")
    public static void method656(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            class46.method81(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (class46.field409.startsWith("win") && !arg3) {
            class46.method4276(arg0, 0);
            return;
        }
        if (class46.field409.startsWith("mac")) {
            class46.method81(arg0, 1, arg2);
            return;
        }
        class46.method4276(arg0, 2);
    }

    @ObfuscatedName("gm.l(II)Ljn;")
    public static class263 method3560(int arg0) {
        class263 var1 = (class263) class263.field3361.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3357.method4289(3, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4570(new class185(var2));
        }
        class263.field3361.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ky.f(ZI)V")
    public static void method5182(boolean arg0) {
        if (field3269 == null) {
            return;
        }
        try {
            class185 var1 = new class185(4);
            var1.method3376(arg0 ? 2 : 3);
            var1.method3500(0);
            field3269.method3112(var1.field2415, 0, 4);
        } catch (IOException var5) {
            try {
                field3269.method3113();
            } catch (Exception var4) {
            }
            class253.field3275++;
            field3269 = null;
        }
    }

    @ObfuscatedName("bl.f(I)J")
    public static long method978() {
        try {
            URL var0 = new URL(client.method4110("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class185 var4 = new class185(new byte[1000]);
            do {
                int var5 = var3.read(var4.field2415, var4.field2414, 1000 - var4.field2414);
                if (var5 == -1) {
                    var4.field2414 = 0;
                    return var4.method3437();
                }
                var4.field2414 += var5;
            } while (var4.field2414 < 1000);
            return 0L;
        } catch (Exception var9) {
            return 0L;
        }
    }

    @ObfuscatedName("n.l(IIB)V")
    public static void method190(int arg0, int arg1) {
        class266 var2 = (class266) class266.field3388.method3737((long) arg0);
        class266 var3;
        if (var2 == null) {
            byte[] var4 = field3393.method4289(14, arg0);
            class266 var5 = new class266();
            if (var4 != null) {
                var5.method4626(new class185(var4));
            }
            class266.field3388.method3744(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field3389;
        int var8 = var3.field3391;
        int var9 = var3.field3392;
        int var10 = class228.field2629[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        class228.field2628[var7] = class228.field2628[var7] & ~var11 | arg1 << var8 & var11;
    }

    @ObfuscatedName("df.c(I)V")
    public static void method2904() {
        class267.field3394.method3740();
    }

    @ObfuscatedName("i.l(Ljava/lang/String;B)Z")
    public static boolean method278(String arg0) {
        if (arg0 == null) {
            return false;
        }
        try {
            new URL(arg0);
            return true;
        } catch (MalformedURLException var2) {
            return false;
        }
    }

    @ObfuscatedName("ag.c(I)Z")
    public static boolean method448() {
        return class220.field2534 == 0 ? field2536.method3986() : true;
    }

    @ObfuscatedName("ko.m(Ljava/lang/CharSequence;S)I")
    public static int method5188(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + arg0.charAt(var3);
        }
        return var2;
    }

    @ObfuscatedName("aw.k(Ljava/lang/String;B)V")
    public static final void method532(String arg0) {
        class175 var1 = class175.method85(class172.field2216, client.field861.field1287);
        var1.field2335.method3376(class185.method3075(arg0));
        var1.field2335.method3446(arg0);
        client.field861.method1944(var1);
    }

    @ObfuscatedName("g.d(III)I")
    public static final int method143(int arg0, int arg1) {
        int var2 = class51.method2922(arg0 - 1, arg1 - 1) + class51.method2922(arg0 + 1, arg1 - 1) + class51.method2922(arg0 - 1, arg1 + 1) + class51.method2922(arg0 + 1, arg1 + 1);
        int var3 = class51.method2922(arg0 - 1, arg1) + class51.method2922(arg0 + 1, arg1) + class51.method2922(arg0, arg1 - 1) + class51.method2922(arg0, arg1 + 1);
        int var4 = class51.method2922(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("bl.m(Lhw;I[B[BI)V")
    public static final void method976(class233 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field2653 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field2653 = new byte[11][];
            arg0.field2772 = new byte[11][];
            arg0.field2745 = new int[11];
            arg0.field2746 = new int[11];
        }
        arg0.field2653[arg1] = arg2;
        if (arg2 == null) {
            arg0.field2742 = false;
            for (int var4 = 0; var4 < arg0.field2653.length; var4++) {
                if (arg0.field2653[var4] != null) {
                    arg0.field2742 = true;
                    break;
                }
            }
        } else {
            arg0.field2742 = true;
        }
        arg0.field2772[arg1] = arg3;
    }

    @ObfuscatedName("jo.d(Lhw;IIII)V")
    public static final void method4939(class233 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2745 == null) {
            throw new RuntimeException();
        }
        arg0.field2745[arg1] = arg2;
        arg0.field2746[arg1] = arg3;
    }

    @ObfuscatedName("fs.u(III)Z")
    public static final boolean method3318(int arg0, int arg1) {
        class271 var2 = class271.method1776(arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var2.method4747(arg1);
    }

    @ObfuscatedName("gx.av(ILcz;ZI)I")
    public static int method3574(int arg0, class87 arg1, boolean arg2) {
        class233 var3 = class233.method1754(class71.field1052[--field292]);
        if (arg0 == 2800) {
            class71.field1052[++field292 - 1] = class234.method4384(client.method2995(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = class71.field1052[--field292];
            int var5 = var4 - 1;
            if (var3.field2740 == null || var5 >= var3.field2740.length || var3.field2740[var5] == null) {
                class71.field1053[++field476 - 1] = "";
            } else {
                class71.field1053[++field476 - 1] = var3.field2740[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2793 == null) {
                class71.field1053[++field476 - 1] = "";
            } else {
                class71.field1053[++field476 - 1] = var3.field2793;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("av.d(Lle;I)V")
    public static final void method441(class323 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < field1109.length; var2++) {
            field1109[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            field1109[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    field401[var8] = (field1109[var8 - 1] + field1109[var8 + 1] + field1109[var8 - 128] + field1109[var8 + 128]) / 4;
                }
            }
            int[] var9 = field1109;
            field1109 = field401;
            field401 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3868; var11++) {
            for (int var12 = 0; var12 < arg0.field3865; var12++) {
                if (arg0.field3866[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3867;
                    int var14 = var11 + 16 + arg0.field3863;
                    int var15 = (var14 << 7) + var13;
                    field1109[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("am.z(II)V")
    public static final void method519(int arg0) {
        short var1 = 256;
        class80.field1146 += arg0 * 128;
        if (class80.field1146 > field1109.length) {
            class80.field1146 -= field1109.length;
            int var2 = (int) (Math.random() * 12.0D);
            method441(field24[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = field2120[var3 + var4] - field1109[class80.field1146 + var3 & field1109.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            field2120[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    field2120[var9 + var10] = 255;
                } else {
                    field2120[var9 + var10] = 0;
                }
            }
        }
        if (class80.field1144 > 0) {
            class80.field1144 -= arg0 * 4;
        }
        if (class80.field1149 > 0) {
            class80.field1149 -= arg0 * 4;
        }
        if (class80.field1144 == 0 && class80.field1149 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                class80.field1144 = 1024;
            }
            if (var12 == 1) {
                class80.field1149 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            class80.field1143[var13] = class80.field1143[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            class80.field1143[var14] = (int) (Math.sin((double) class80.field1137 / 14.0D) * 16.0D + Math.sin((double) class80.field1137 / 15.0D) * 14.0D + Math.sin((double) class80.field1137 / 16.0D) * 12.0D);
            class80.field1137++;
        }
        class80.field1147 += arg0 * 705599635;
        int var15 = ((client.field642 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class80.field1147 * 496185484; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            field2120[(var18 << 7) + var17] = 192;
        }
        class80.field1147 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += field2120[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= field2120[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    field472[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += field472[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= field472[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    field2120[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("kq.o(Lbu;I)V")
    public static void method5183(class67 arg0) {
        if (arg0.method1511() != client.field633) {
            client.field633 = arg0.method1511();
            class272.method2939(arg0.method1511());
        }
        field2440 = arg0.field1005;
        client.field683 = arg0.field1008;
        client.field631 = arg0.field1003;
        field3844 = client.field632 == 0 ? 43594 : arg0.field1008 + 40000;
        field508 = client.field632 == 0 ? 443 : arg0.field1008 + 50000;
        field2587 = field3844;
    }

    @ObfuscatedName("h.em(II)I")
    public static int method245(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("ba.aa(ILcz;ZI)I")
    public static int method1000(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = class71.field1053[--field476];
            int var4 = class71.field1052[--field292];
            class71.field1053[++field476 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            field476 -= 2;
            String var5 = class71.field1053[field476];
            String var6 = class71.field1053[field476 + 1];
            class71.field1053[++field476 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = class71.field1053[--field476];
            int var8 = class71.field1052[--field292];
            class71.field1053[++field476 - 1] = var7 + class308.method5154(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = class71.field1053[--field476];
            class71.field1053[++field476 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = class71.field1052[--field292];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            class71.field1056.setTime(new Date(var11));
            int var13 = class71.field1056.get(5);
            int var14 = class71.field1056.get(2);
            int var15 = class71.field1056.get(1);
            class71.field1053[++field476 - 1] = var13 + "-" + class71.field1057[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            field476 -= 2;
            String var16 = class71.field1053[field476];
            String var17 = class71.field1053[field476 + 1];
            if (field138.field596 != null && field138.field596.field2644) {
                class71.field1053[++field476 - 1] = var17;
            } else {
                class71.field1053[++field476 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = class71.field1052[--field292];
            class71.field1053[++field476 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            field476 -= 2;
            class71.field1052[++field292 - 1] = class308.method861(class176.method189(class71.field1053[field476], class71.field1053[field476 + 1], client.field635));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = class71.field1053[--field476];
            field292 -= 2;
            int var20 = class71.field1052[field292];
            int var21 = class71.field1052[field292 + 1];
            byte[] var22 = field3405.method4289(var21, 0);
            class301 var23 = new class301(var22);
            class71.field1052[++field292 - 1] = var23.method5207(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = class71.field1053[--field476];
            field292 -= 2;
            int var25 = class71.field1052[field292];
            int var26 = class71.field1052[field292 + 1];
            byte[] var27 = field3405.method4289(var26, 0);
            class301 var28 = new class301(var27);
            class71.field1052[++field292 - 1] = var28.method5247(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            field476 -= 2;
            String var29 = class71.field1053[field476];
            String var30 = class71.field1053[field476 + 1];
            if (class71.field1052[--field292] == 1) {
                class71.field1053[++field476 - 1] = var29;
            } else {
                class71.field1053[++field476 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = class71.field1053[--field476];
            class71.field1053[++field476 - 1] = class302.method5208(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = class71.field1053[--field476];
            int var33 = class71.field1052[--field292];
            class71.field1053[++field476 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = class71.field1052[--field292];
            class71.field1052[++field292 - 1] = class308.method2925((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = class71.field1052[--field292];
            class71.field1052[++field292 - 1] = class308.method4519((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = class71.field1052[--field292];
            class71.field1052[++field292 - 1] = class308.method4940((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = class71.field1052[--field292];
            class71.field1052[++field292 - 1] = class308.method5021((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = class71.field1053[--field476];
            if (var38 == null) {
                class71.field1052[++field292 - 1] = 0;
            } else {
                class71.field1052[++field292 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = class71.field1053[--field476];
            field292 -= 2;
            int var40 = class71.field1052[field292];
            int var41 = class71.field1052[field292 + 1];
            class71.field1053[++field476 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = class71.field1053[--field476];
            StringBuilder var43 = new StringBuilder(var42.length());
            boolean var44 = false;
            for (int var45 = 0; var45 < var42.length(); var45++) {
                char var46 = var42.charAt(var45);
                if (var46 == '<') {
                    var44 = true;
                } else if (var46 == '>') {
                    var44 = false;
                } else if (!var44) {
                    var43.append(var46);
                }
            }
            class71.field1053[++field476 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = class71.field1053[--field476];
            int var48 = class71.field1052[--field292];
            class71.field1052[++field292 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            field476 -= 2;
            String var49 = class71.field1053[field476];
            String var50 = class71.field1053[field476 + 1];
            int var51 = class71.field1052[--field292];
            class71.field1052[++field292 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.ae(II)I")
    public static int method939(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("ho.fo(I)V")
    public static final void method4186() {
        for (int var0 = 0; var0 < client.field868; var0++) {
            int var10002 = client.field871[var0]--;
            if (client.field871[var0] >= -10) {
                class94 var2 = client.field665[var0];
                if (var2 == null) {
                    class94 var10000 = (class94) null;
                    var2 = class94.method2024(field1940, client.field771[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    client.field871[var0] += var2.method2023();
                    client.field665[var0] = var2;
                }
                if (client.field871[var0] < 0) {
                    int var9;
                    if (client.field906[var0] == 0) {
                        var9 = client.field866;
                    } else {
                        int var3 = (client.field906[var0] & 0xFF) * 128;
                        int var4 = client.field906[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - field138.field943;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = client.field906[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - field138.field925;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            client.field871[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = client.field867 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class96 var10 = var2.method2034().method2065(field3354);
                        class106 var11 = class106.method2180(var10, 100, var9);
                        var11.method2183(client.field822[var0] - 1);
                        field3384.method1967(var11);
                    }
                    client.field871[var0] = -100;
                }
            } else {
                client.field868--;
                for (int var1 = var0; var1 < client.field868; var1++) {
                    client.field771[var1] = client.field771[var1 + 1];
                    client.field665[var1] = client.field665[var1 + 1];
                    client.field822[var1] = client.field822[var1 + 1];
                    client.field871[var1] = client.field871[var1 + 1];
                    client.field906[var1] = client.field906[var1 + 1];
                }
                var0--;
            }
        }
        if (client.field870 && !method448()) {
            if (client.field863 != 0 && client.field805 != -1) {
                class220.method3920(field905, client.field805, 0, client.field863, false);
            }
            client.field870 = false;
        }
    }

    @ObfuscatedName("by.hz(ILjava/lang/String;I)V")
    public static void method1743(int arg0, String arg1) {
        int var2 = class84.field1216;
        int[] var3 = class84.field1217;
        boolean var4 = false;
        class294 var5 = new class294(arg1, field3846);
        for (int var6 = 0; var6 < var2; var6++) {
            class62 var7 = client.field746[var3[var6]];
            if (var7 != null && field138 != var7 && var7.field597 != null && var7.field597.equals(var5)) {
                if (arg0 == 1) {
                    class175 var8 = class175.method85(class172.field2255, client.field861.field1287);
                    var8.field2335.method3330(var3[var6]);
                    var8.field2335.method3371(0);
                    client.field861.method1944(var8);
                } else if (arg0 == 4) {
                    class175 var9 = class175.method85(class172.field2259, client.field861.field1287);
                    var9.field2335.method3457(var3[var6]);
                    var9.field2335.method3371(0);
                    client.field861.method1944(var9);
                } else if (arg0 == 6) {
                    class175 var10 = class175.method85(class172.field2261, client.field861.field1287);
                    var10.field2335.method3380(var3[var6]);
                    var10.field2335.method3372(0);
                    client.field861.method1944(var10);
                } else if (arg0 == 7) {
                    class175 var11 = class175.method85(class172.field2290, client.field861.field1287);
                    var11.field2335.method3372(0);
                    var11.field2335.method3343(var3[var6]);
                    client.field861.method1944(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class86.method3230(4, "", class240.field3010 + arg1);
        }
    }

    @ObfuscatedName("al.jt(Ljava/lang/String;I)V")
    public static final void method609(String arg0) {
        if (field2353 != null) {
            class175 var1 = class175.method85(class172.field2221, client.field861.field1287);
            var1.field2335.method3376(class185.method3075(arg0));
            var1.field2335.method3446(arg0);
            client.field861.method1944(var1);
        }
    }

    @ObfuscatedName("dx.kh(Ljava/lang/String;ZI)V")
    public static void method2528(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < field3502; var5++) {
            class272 var6 = class272.method92(var5);
            if ((!arg1 || var6.field3548) && var6.field3533 == -1 && var6.field3523.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    field3204 = -1;
                    field552 = null;
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
        field552 = var3;
        field559 = 0;
        field3204 = var4;
        String[] var9 = new String[field3204];
        for (int var10 = 0; var10 < field3204; var10++) {
            var9[var10] = class272.method92(var3[var10]).field3523;
        }
        class182.method1838(var9, field552);
    }
}
