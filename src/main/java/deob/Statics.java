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
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

public class Statics {

    @ObfuscatedName("be.i")
    public static int field1004;

    @ObfuscatedName("be.s")
    public static int[] field1006;

    @ObfuscatedName("be.e")
    public static class98 field1011;

    @ObfuscatedName("by.qa")
    public static long field1014;

    @ObfuscatedName("bv.at")
    public static Image field1029;

    @ObfuscatedName("br.pz")
    public static int field1034;

    @ObfuscatedName("br.b")
    public static int[] field1036;

    @ObfuscatedName("br.op")
    public static class319 field1039;

    @ObfuscatedName("g.bj")
    public static int field105;

    @ObfuscatedName("bf.a")
    public static String field1066;

    @ObfuscatedName("bt.g")
    public static class110[] field1069;

    @ObfuscatedName("bt.ak")
    public static int[] field1074;

    @ObfuscatedName("bm.j")
    public static int[] field1078;

    @ObfuscatedName("bm.cx")
    public static class250 field1080;

    @ObfuscatedName("cy.s")
    public static class318 field1084;

    @ObfuscatedName("cy.l")
    public static class318 field1085;

    @ObfuscatedName("cy.k")
    public static class319 field1088;

    @ObfuscatedName("cy.b")
    public static class318 field1090;

    @ObfuscatedName("cy.o")
    public static int field1092;

    @ObfuscatedName("cy.q")
    public static class319 field1093;

    @ObfuscatedName("cy.z")
    public static boolean field1102;

    @ObfuscatedName("cy.u")
    public static class318[] field1112;

    @ObfuscatedName("cy.i")
    public static class318 field1118;

    @ObfuscatedName("cb.ck")
    public static class250 field1148;

    @ObfuscatedName("cb.n")
    public static class99 field1150;

    @ObfuscatedName("co.ab")
    public static int[] field1170;

    @ObfuscatedName("cq.h")
    public static int field1180;

    @ObfuscatedName("ce.ps")
    public static int field1198;

    @ObfuscatedName("ch.gc")
    public static int field1202;

    @ObfuscatedName("cw.x")
    public static int field1213;

    @ObfuscatedName("cs.r")
    public static int[] field1244;

    @ObfuscatedName("cs.af")
    public static float[] field1248;

    @ObfuscatedName("cs.i")
    public static int field1251;

    @ObfuscatedName("cs.h")
    public static float[] field1252;

    @ObfuscatedName("cs.e")
    public static int field1253;

    @ObfuscatedName("cs.b")
    public static class91[] field1255;

    @ObfuscatedName("cs.n")
    public static class95[] field1256;

    @ObfuscatedName("cs.g")
    public static class107[] field1258;

    @ObfuscatedName("cs.m")
    public static boolean[] field1259;

    @ObfuscatedName("cs.p")
    public static int field1260;

    @ObfuscatedName("cs.x")
    public static int field1263;

    @ObfuscatedName("cs.d")
    public static float[] field1266;

    @ObfuscatedName("cs.k")
    public static byte[] field1267;

    @ObfuscatedName("cs.ak")
    public static int[] field1268;

    @ObfuscatedName("cs.v")
    public static float[] field1269;

    @ObfuscatedName("cs.c")
    public static float[] field1270;

    @ObfuscatedName("cs.ah")
    public static float[] field1271;

    @ObfuscatedName("cs.ab")
    public static float[] field1272;

    @ObfuscatedName("cs.aw")
    public static int[] field1273;

    @ObfuscatedName("cs.f")
    public static class102[] field1274;

    @ObfuscatedName("cc.p")
    public static int[] field1283;

    @ObfuscatedName("cc.e")
    public static int[] field1286;

    @ObfuscatedName("cc.b")
    public static boolean[] field1294;

    @ObfuscatedName("cx.q")
    public static boolean field1296;

    @ObfuscatedName("cx.n")
    public static class90 field1298;

    @ObfuscatedName("cx.u")
    public static int field1301;

    @ObfuscatedName("ci.ci")
    public static class250 field1330;

    @ObfuscatedName("cn.p")
    public static int field1336;

    @ObfuscatedName("cu.p")
    public static class318 field1353;

    @ObfuscatedName("dh.x")
    public static int field1379;

    @ObfuscatedName("dh.i")
    public static float field1382;

    @ObfuscatedName("dy.gx")
    public static int field1429;

    @ObfuscatedName("dy.gb")
    public static int field1432;

    @ObfuscatedName("o.d")
    public static String field144;

    @ObfuscatedName("de.fo")
    public static class319[] field1447;

    @ObfuscatedName("dp.bo")
    public static class245 field1456;

    @ObfuscatedName("o.aq")
    public static boolean field147;

    @ObfuscatedName("w.ea")
    public static class297 field15;

    @ObfuscatedName("y.u")
    public static int field153;

    @ObfuscatedName("du.g")
    public static int[] field1542;

    @ObfuscatedName("y.qi")
    public static class2 field155;

    @ObfuscatedName("w.mt")
    public static int field16;

    @ObfuscatedName("y.k")
    public static byte[][][] field160;

    @ObfuscatedName("dc.bh")
    public static int field1636;

    @ObfuscatedName("dc.bz")
    public static int field1637;

    @ObfuscatedName("dc.bu")
    public static int field1638;

    @ObfuscatedName("ds.x")
    public static int field1652;

    @ObfuscatedName("ds.e")
    public static int field1655;

    @ObfuscatedName("ds.b")
    public static int field1656;

    @ObfuscatedName("ds.u")
    public static int field1658;

    @ObfuscatedName("ds.q")
    public static int field1660;

    @ObfuscatedName("dw.ad")
    public static GarbageCollectorMXBean field1661;

    @ObfuscatedName("dl.d")
    public static class132 field1668;

    @ObfuscatedName("dl.m")
    public static int field1673;

    @ObfuscatedName("dl.r")
    public static int field1684;

    @ObfuscatedName("dl.t")
    public static int field1685;

    @ObfuscatedName("dl.o")
    public static int field1686;

    @ObfuscatedName("dl.y")
    public static int field1687;

    @ObfuscatedName("dl.n")
    public static int field1688;

    @ObfuscatedName("dl.g")
    public static int field1689;

    @ObfuscatedName("dl.f")
    public static int field1690;

    @ObfuscatedName("di.gt")
    public static int field1703;

    @ObfuscatedName("dt.x")
    public static class318[] field1709;

    @ObfuscatedName("dt.ba")
    public static int field1710;

    @ObfuscatedName("dm.bq")
    public static int field1718;

    @ObfuscatedName("a.t")
    public static int field173;

    @ObfuscatedName("dm.t")
    public static int field1730;

    @ObfuscatedName("dm.o")
    public static int field1731;

    @ObfuscatedName("dm.y")
    public static int field1732;

    @ObfuscatedName("dm.a")
    public static int field1733;

    @ObfuscatedName("dm.j")
    public static int field1734;

    @ObfuscatedName("dm.d")
    public static int field1735;

    @ObfuscatedName("dm.bh")
    public static int field1736;

    @ObfuscatedName("dm.c")
    public static int field1737;

    @ObfuscatedName("dm.ah")
    public static int field1738;

    @ObfuscatedName("dm.ab")
    public static int field1741;

    @ObfuscatedName("dm.v")
    public static int field1743;

    @ObfuscatedName("dm.bz")
    public static int field1756;

    @ObfuscatedName("j.rb")
    public static class252 field176;

    @ObfuscatedName("dm.af")
    public static int field1760;

    @ObfuscatedName("dm.bu")
    public static int field1762;

    @ObfuscatedName("dm.r")
    public static int field1766;

    @ObfuscatedName("dm.bo")
    public static boolean[][] field1769;

    @ObfuscatedName("dm.h")
    public static int field1770;

    @ObfuscatedName("dm.aw")
    public static int field1772;

    @ObfuscatedName("dm.bg")
    public static int field1774;

    @ObfuscatedName("dm.bl")
    public static int field1775;

    @ObfuscatedName("dk.rj")
    public static int field1779;

    @ObfuscatedName("dk.bb")
    public static class318[] field1780;

    @ObfuscatedName("dr.fq")
    public static class319 field1792;

    @ObfuscatedName("j.cu")
    public static class250 field180;

    @ObfuscatedName("ew.l")
    public static String[] field1801;

    @ObfuscatedName("ew.s")
    public static class248 field1802;

    @ObfuscatedName("em.mp")
    public static class231[] field1815;

    @ObfuscatedName("em.ij")
    public static class231 field1820;

    @ObfuscatedName("eo.pv")
    public static int field1835;

    @ObfuscatedName("d.do")
    public static class250 field184;

    @ObfuscatedName("er.cp")
    public static class250 field1853;

    @ObfuscatedName("er.i")
    public static ScheduledExecutorService field1856;

    @ObfuscatedName("er.jf")
    public static int field1857;

    @ObfuscatedName("d.mu")
    public static class83 field186;

    @ObfuscatedName("eh.fl")
    public static class319 field1863;

    @ObfuscatedName("ep.q")
    public static class248 field1872;

    @ObfuscatedName("ep.ii")
    public static class61 field1877;

    @ObfuscatedName("ec.s")
    public static class248 field1878;

    @ObfuscatedName("ea.m")
    public static int field1886;

    @ObfuscatedName("ea.ku")
    public static class231 field1889;

    @ObfuscatedName("ei.kl")
    public static class231 field1898;

    @ObfuscatedName("ei.no")
    public static class308 field1900;

    @ObfuscatedName("ei.fd")
    public static int[] field1901;

    @ObfuscatedName("el.q")
    public static int field1914;

    @ObfuscatedName("ed.fg")
    public static class319[] field1920;

    @ObfuscatedName("ed.fv")
    public static class319[] field1927;

    @ObfuscatedName("ed.pp")
    public static int field1929;

    @ObfuscatedName("ej.je")
    public static int field1934;

    @ObfuscatedName("ej.eu")
    public static class299 field1937;

    @ObfuscatedName("en.z")
    public static Applet field1939;

    @ObfuscatedName("en.w")
    public static String field1940;

    @ObfuscatedName("en.l")
    public static int field1941;

    @ObfuscatedName("ev.w")
    public static String field1955;

    @ObfuscatedName("ev.e")
    public static class248 field1957;

    @ObfuscatedName("ev.z")
    public static String field1961;

    @ObfuscatedName("ev.aw")
    public static Font field1962;

    @ObfuscatedName("ef.l")
    public static File field1965;

    @ObfuscatedName("ef.r")
    public static String[] field1966;

    @ObfuscatedName("ef.u")
    public static File field1967;

    @ObfuscatedName("fa.w")
    public static File field1975;

    @ObfuscatedName("fr.fm")
    public static class319[] field1998;

    @ObfuscatedName("z.jx")
    public static int field2;

    @ObfuscatedName("fc.bl")
    public static String field2014;

    @ObfuscatedName("fc.au")
    public static class316 field2015;

    @ObfuscatedName("fc.ca")
    public static int field2017;

    @ObfuscatedName("fh.u")
    public static byte[][][] field2034;

    @ObfuscatedName("fh.q")
    public static int field2038;

    @ObfuscatedName("c.pk")
    public static int field204;

    @ObfuscatedName("fw.ba")
    public static class319[] field2048;

    @ObfuscatedName("c.de")
    public static class250 field208;

    @ObfuscatedName("v.fn")
    public static class318[] field215;

    @ObfuscatedName("v.c")
    public static int[] field216;

    @ObfuscatedName("af.bg")
    public static String field220;

    @ObfuscatedName("af.by")
    public static class58 field221;

    @ObfuscatedName("af.dc")
    public static int field224;

    @ObfuscatedName("ah.ed")
    public static int field225;

    @ObfuscatedName("fl.fr")
    public static byte[][] field2253;

    @ObfuscatedName("fn.i")
    public static int[] field2261;

    @ObfuscatedName("fv.cm")
    public static class250 field2271;

    @ObfuscatedName("fv.k")
    public static boolean[] field2272;

    @ObfuscatedName("fm.k")
    public static int field2284;

    @ObfuscatedName("fm.z")
    public static class248 field2285;

    @ObfuscatedName("fm.b")
    public static class224 field2286;

    @ObfuscatedName("ah.ql")
    public static class325 field229;

    @ObfuscatedName("ah.x")
    public static int field231;

    @ObfuscatedName("ah.rq")
    public static short[] field232;

    @ObfuscatedName("fb.qf")
    public static class68 field2333;

    @ObfuscatedName("gk.ay")
    public static client field2335;

    @ObfuscatedName("gg.x")
    public static byte[][][] field2342;

    @ObfuscatedName("gg.i")
    public static int[] field2348;

    @ObfuscatedName("gg.k")
    public static int[] field2349;

    @ObfuscatedName("gp.w")
    public static long field2351;

    @ObfuscatedName("gp.z")
    public static long field2352;

    @ObfuscatedName("ge.y")
    public static class183 field2360;

    @ObfuscatedName("ge.h")
    public static int[] field2365;

    @ObfuscatedName("gv.ah")
    public static int[] field2368;

    @ObfuscatedName("gb.ix")
    public static int field2373;

    @ObfuscatedName("ab.bx")
    public static class318[] field238;

    @ObfuscatedName("ab.bo")
    public static String field239;

    @ObfuscatedName("gr.n")
    public static boolean field2392;

    @ObfuscatedName("s.ga")
    public static int field24;

    @ObfuscatedName("ab.ph")
    public static class96 field245;

    @ObfuscatedName("hm.s")
    public static class248 field2459;

    @ObfuscatedName("hm.l")
    public static class219 field2460;

    @ObfuscatedName("hm.k")
    public static int field2462;

    @ObfuscatedName("hm.i")
    public static int field2463;

    @ObfuscatedName("hm.p")
    public static boolean field2464;

    @ObfuscatedName("hm.w")
    public static class248 field2465;

    @ObfuscatedName("ab.fc")
    public static class126 field249;

    @ObfuscatedName("ab.ex")
    public static class136 field250;

    @ObfuscatedName("aw.ic")
    public static class112 field251;

    @ObfuscatedName("hx.em")
    public static long field2536;

    @ObfuscatedName("aw.ff")
    public static byte[][] field254;

    @ObfuscatedName("hv.cn")
    public static class250 field2549;

    @ObfuscatedName("hv.x")
    public static int[] field2555;

    @ObfuscatedName("hv.pr")
    public static int field2556;

    @ObfuscatedName("hy.eo")
    public static class154 field2557;

    @ObfuscatedName("hy.u")
    public static int[] field2563;

    @ObfuscatedName("ha.gi")
    public static int field2564;

    @ObfuscatedName("ha.fj")
    public static int field2569;

    @ObfuscatedName("aw.ak")
    public static FontMetrics field257;

    @ObfuscatedName("hd.i")
    public static short[][] field2573;

    @ObfuscatedName("hd.k")
    public static short[] field2576;

    @ObfuscatedName("hd.x")
    public static short[] field2578;

    @ObfuscatedName("hd.e")
    public static short[][] field2579;

    @ObfuscatedName("hs.j")
    public static String field2588;

    @ObfuscatedName("hs.kr")
    public static class76 field2589;

    @ObfuscatedName("hs.cc")
    public static long field2590;

    @ObfuscatedName("hi.p")
    public static class248 field2599;

    @ObfuscatedName("hi.x")
    public static class248 field2643;

    @ObfuscatedName("hi.i")
    public static class248 field2730;

    @ObfuscatedName("ht.bc")
    public static class318 field2753;

    @ObfuscatedName("ip.e")
    public static class318 field2784;

    @ObfuscatedName("ao.mn")
    public static class157 field295;

    @ObfuscatedName("z.z")
    public static class248 field3;

    @ObfuscatedName("at.ej")
    public static int field302;

    @ObfuscatedName("at.rx")
    public static class163 field303;

    @ObfuscatedName("ac.bq")
    public static class323 field307;

    @ObfuscatedName("im.pi")
    public static int field3083;

    @ObfuscatedName("if.ip")
    public static class231 field3097;

    @ObfuscatedName("ac.pj")
    public static class89 field311;

    @ObfuscatedName("ac.dv")
    public static class250 field313;

    @ObfuscatedName("id.f")
    public static int[] field3138;

    @ObfuscatedName("id.c")
    public static int field3139;

    @ObfuscatedName("id.fs")
    public static class318[] field3140;

    @ObfuscatedName("ac.fz")
    public static class319[] field315;

    @ObfuscatedName("il.pq")
    public static int field3155;

    @ObfuscatedName("ig.cz")
    public static class250 field3160;

    @ObfuscatedName("iv.u")
    public static Thread field3184;

    @ObfuscatedName("ic.dl")
    public static int field3193;

    @ObfuscatedName("ia.z")
    public static class158 field3201;

    @ObfuscatedName("ia.s")
    public static long field3204;

    @ObfuscatedName("ia.f")
    public static class247 field3209;

    @ObfuscatedName("iu.z")
    public static class248 field3227;

    @ObfuscatedName("iu.ch")
    public static boolean field3230;

    @ObfuscatedName("it.w")
    public static int field3233;

    @ObfuscatedName("ie.s")
    public static int field3237;

    @ObfuscatedName("ie.z")
    public static class248 field3238;

    @ObfuscatedName("ie.w")
    public static class256[] field3247;

    @ObfuscatedName("io.z")
    public static class248 field3259;

    @ObfuscatedName("ap.g")
    public static int[][][] field326;

    @ObfuscatedName("ii.m")
    public static int field3260;

    @ObfuscatedName("ii.z")
    public static class248 field3265;

    @ObfuscatedName("ap.cj")
    public static class250 field327;

    @ObfuscatedName("ib.z")
    public static class248 field3273;

    @ObfuscatedName("ib.w")
    public static class248 field3280;

    @ObfuscatedName("iq.z")
    public static class248 field3284;

    @ObfuscatedName("jk.w")
    public static class248 field3291;

    @ObfuscatedName("jk.z")
    public static class248 field3293;

    @ObfuscatedName("jk.s")
    public static int field3295;

    @ObfuscatedName("jk.n")
    public static class231 field3302;

    @ObfuscatedName("ja.z")
    public static class248 field3305;

    @ObfuscatedName("ja.w")
    public static class248 field3315;

    @ObfuscatedName("jl.z")
    public static class248 field3323;

    @ObfuscatedName("jl.n")
    public static int[] field3326;

    @ObfuscatedName("jo.z")
    public static class248 field3328;

    @ObfuscatedName("jy.z")
    public static class248 field3339;

    @ObfuscatedName("jy.bi")
    public static class244 field3347;

    @ObfuscatedName("jp.w")
    public static class248 field3349;

    @ObfuscatedName("jp.z")
    public static class248 field3368;

    @ObfuscatedName("jj.w")
    public static class248 field3378;

    @ObfuscatedName("jj.dh")
    public static class250 field3420;

    @ObfuscatedName("jt.q")
    public static class248 field3425;

    @ObfuscatedName("jt.i")
    public static boolean field3427;

    @ObfuscatedName("ar.cf")
    public static char field343;

    @ObfuscatedName("jt.k")
    public static class248 field3455;

    @ObfuscatedName("jt.n")
    public static class299 field3467;

    @ObfuscatedName("jt.gy")
    public static int field3479;

    @ObfuscatedName("jq.w")
    public static class248 field3488;

    @ObfuscatedName("jq.z")
    public static class248 field3491;

    @ObfuscatedName("jv.z")
    public static class248 field3530;

    @ObfuscatedName("jn.w")
    public static class248 field3537;

    @ObfuscatedName("jn.s")
    public static class248 field3538;

    @ObfuscatedName("jn.z")
    public static class248 field3539;

    @ObfuscatedName("jm.iy")
    public static class231 field3560;

    @ObfuscatedName("jm.f")
    public static class231 field3562;

    @ObfuscatedName("au.aw")
    public static int[] field358;

    @ObfuscatedName("au.ki")
    public static int field362;

    @ObfuscatedName("al.s")
    public static int field363;

    @ObfuscatedName("kf.dw")
    public static int field3637;

    @ObfuscatedName("kn.eg")
    public static class299 field3661;

    @ObfuscatedName("al.q")
    public static class231[][] field367;

    @ObfuscatedName("kc.fa")
    public static int[] field3677;

    @ObfuscatedName("ka.iz")
    public static int field3684;

    @ObfuscatedName("ka.ma")
    public static int field3688;

    @ObfuscatedName("ae.n")
    public static class161 field369;

    @ObfuscatedName("kk.e")
    public static class318[] field3699;

    @ObfuscatedName("ae.fy")
    public static class319[] field370;

    @ObfuscatedName("ko.z")
    public static class175 field3713;

    @ObfuscatedName("kr.m")
    public static class183 field3714;

    @ObfuscatedName("ku.i")
    public static int field3722;

    @ObfuscatedName("kq.p")
    public static int[] field3726;

    @ObfuscatedName("kq.w")
    public static int field3730;

    @ObfuscatedName("ki.x")
    public static int field3741;

    @ObfuscatedName("lv.r")
    public static class37 field3751;

    @ObfuscatedName("lv.n")
    public static int field3758;

    @ObfuscatedName("lt.ab")
    public static int field3762;

    @ObfuscatedName("lt.aw")
    public static int field3763;

    @ObfuscatedName("lt.ah")
    public static int[] field3767;

    @ObfuscatedName("lo.s")
    public static int field3799;

    @ObfuscatedName("k.e")
    public static int field38;

    @ObfuscatedName("lo.k")
    public static int[] field3800;

    @ObfuscatedName("lo.q")
    public static int[] field3801;

    @ObfuscatedName("lo.x")
    public static byte[][] field3802;

    @ObfuscatedName("lo.z")
    public static int field3803;

    @ObfuscatedName("lm.fe")
    public static class318[] field3882;

    @ObfuscatedName("aj.z")
    public static class155 field393;

    @ObfuscatedName("k.mb")
    public static int field40;

    @ObfuscatedName("i.gs")
    public static int field42;

    @ObfuscatedName("i.z")
    public static class248 field43;

    @ObfuscatedName("ax.jz")
    public static int field436;

    @ObfuscatedName("am.e")
    public static class137 field440;

    @ObfuscatedName("ay.l")
    public static byte[][][] field446;

    @ObfuscatedName("ay.q")
    public static byte[][][] field447;

    @ObfuscatedName("ay.i")
    public static byte[][][] field448;

    @ObfuscatedName("ay.x")
    public static int[][] field449;

    @ObfuscatedName("ay.e")
    public static int[] field455;

    @ObfuscatedName("ay.pt")
    public static int field457;

    @ObfuscatedName("i.l")
    public static int[] field46;

    @ObfuscatedName("ay.dg")
    public static class250 field462;

    @ObfuscatedName("bp.n")
    public static class318 field473;

    @ObfuscatedName("bp.ri")
    public static class322 field477;

    @ObfuscatedName("bi.dd")
    public static String field486;

    @ObfuscatedName("x.i")
    public static int field49;

    @ObfuscatedName("bi.ov")
    public static boolean field490;

    @ObfuscatedName("bj.rz")
    public static int field496;

    @ObfuscatedName("bj.e")
    public static int field498;

    @ObfuscatedName("bq.fx")
    public static int field525;

    @ObfuscatedName("x.t")
    public static String[] field53;

    @ObfuscatedName("bz.dy")
    public static class250 field544;

    @ObfuscatedName("x.ar")
    public static String field56;

    @ObfuscatedName("e.ft")
    public static int[] field57;

    @ObfuscatedName("bg.dz")
    public static class250 field577;

    @ObfuscatedName("bg.po")
    public static class103 field578;

    @ObfuscatedName("client.cg")
    public static class158 field612;

    @ObfuscatedName("p.qn")
    public static class67 field62;

    @ObfuscatedName("b.pl")
    public static int field69;

    @ObfuscatedName("b.c")
    public static int[] field70;

    @ObfuscatedName("client.ez")
    public static int field755;

    @ObfuscatedName("f.iu")
    public static int field83;

    @ObfuscatedName("client.cv")
    public static class154 field840;

    @ObfuscatedName("f.kb")
    public static int field85;

    @ObfuscatedName("client.dn")
    public static class250 field855;

    @ObfuscatedName("f.bn")
    public static class318[] field86;

    @ObfuscatedName("bl.el")
    public static int field869;

    @ObfuscatedName("bl.er")
    public static class158 field870;

    @ObfuscatedName("ba.pg")
    public static class96 field880;

    @ObfuscatedName("ba.lv")
    public static int field933;

    @ObfuscatedName("ba.ei")
    public static class299 field934;

    @ObfuscatedName("bn.d")
    public static int[] field937;

    @ObfuscatedName("g.oa")
    public static class294 field95;

    @ObfuscatedName("bb.u")
    public static class66[] field950;

    @ObfuscatedName("bx.bk")
    public static int field967;

    @ObfuscatedName("bc.fu")
    public static int[][] field974;

    @ObfuscatedName("bc.ag")
    public static int field979;

    @ObfuscatedName("bs.ds")
    public static int field997;

    @ObfuscatedName("ba.z(II)Lit;")
    public static class255 method1442(int arg0) {
        class255 var1 = (class255) class255.field3232.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3.method4247(16, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4418(new class183(var2));
        }
        class255.field3232.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.z([BI)Lll;")
    public static final class319 method4930(byte[] arg0) {
        Object var1 = null;
        try {
            BufferedImage var2 = ImageIO.read(new ByteArrayInputStream(arg0));
            int var3 = var2.getWidth();
            int var4 = var2.getHeight();
            int[] var5 = new int[var3 * var4];
            PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var3, var4, var5, 0, var3);
            var6.grabPixels();
            return new class319(var5, var3, var4);
        } catch (IOException var9) {
        } catch (InterruptedException var10) {
        }
        return new class319(0, 0);
    }

    @ObfuscatedName("ix.z(IS)Ljo;")
    public static class265 method4231(int arg0) {
        class265 var1 = (class265) class265.field3329.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3328.method4247(11, arg0);
        class265 var3 = new class265();
        if (var2 != null) {
            var3.method4557(new class183(var2));
        }
        var3.method4563();
        class265.field3329.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.z(Lfi;Lgs;I)Lfn;")
    public static class173 method414(class170 arg0, class191 arg1) {
        class173 var2;
        if (class173.field2259 == 0) {
            var2 = new class173();
        } else {
            var2 = class173.field2257[--class173.field2259];
        }
        var2.field2255 = arg0;
        var2.field2254 = arg0.field2178;
        if (var2.field2254 == -1) {
            var2.field2258 = new class190(260);
        } else if (var2.field2254 == -2) {
            var2.field2258 = new class190(10000);
        } else if (var2.field2254 <= 18) {
            var2.field2258 = new class190(20);
        } else if (var2.field2254 <= 98) {
            var2.field2258 = new class190(100);
        } else {
            var2.field2258 = new class190(260);
        }
        var2.field2258.method3530(arg1);
        var2.field2258.method3511(var2.field2255.field2234);
        var2.field2256 = 0;
        return var2;
    }

    @ObfuscatedName("hn.z(Lir;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method3980(class248 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method4264(arg1);
        int var6 = arg0.method4265(var5, arg2);
        class218.method1447(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ap.z(Lgi;I)V")
    public static final void method582(class190 arg0) {
        arg0.method3515();
        int var1 = client.field629;
        class61 var2 = field1877 = client.field611[var1] = new class61();
        var2.field575 = var1;
        int var3 = arg0.method3509(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field923[0] = var5 - field869;
        var2.field932 = (var2.field923[0] << 7) + (var2.method1009() << 6);
        var2.field873[0] = var6 - field755;
        var2.field882 = (var2.field873[0] << 7) + (var2.method1009() << 6);
        field83 = var2.field568 = var4;
        if (class82.field1158[var1] != null) {
            var2.method1003(class82.field1158[var1]);
        }
        class82.field1168 = 0;
        class82.field1160[++class82.field1168 - 1] = var1;
        class82.field1157[var1] = 0;
        class82.field1161 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3509(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                class82.field1163[var7] = (var9 << 28) + (var10 << 14) + var11;
                class82.field1164[var7] = 0;
                class82.field1165[var7] = -1;
                class82.field1162[++class82.field1161 - 1] = var7;
                class82.field1157[var7] = 0;
            }
        }
        arg0.method3508();
    }

    @ObfuscatedName("bb.af(Lev;III)Lcx;")
    public static final class96 method1475(class155 arg0, int arg1, int arg2) {
        if (field1301 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class96 var3 = field1298.method618();
                var3.field1300 = new int[(field1296 ? 2 : 1) * 256];
                var3.field1304 = arg2;
                var3.method639();
                var3.field1303 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field1303 > 16384) {
                    var3.field1303 = 16384;
                }
                var3.method640(var3.field1303);
                if (field231 > 0 && field1011 == null) {
                    field1011 = new class98();
                    field1856 = Executors.newScheduledThreadPool(1);
                    field1856.scheduleAtFixedRate(field1011, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (field1011 != null) {
                    if (field1011.field1328[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    field1011.field1328[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class96();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("dr.l(Ljava/lang/String;II)Z")
    public static boolean method2858(String arg0, int arg1) {
        return class46.method113(arg0, arg1, "openjs");
    }

    @ObfuscatedName("iw.l(Ljava/lang/CharSequence;I)[B")
    public static byte[] method4240(CharSequence arg0) {
        int var1 = arg0.length();
        byte[] var2 = new byte[var1];
        for (int var3 = 0; var3 < var1; var3++) {
            char var4 = arg0.charAt(var3);
            if (!(var4 <= 0 || var4 >= 128) || !(var4 < 160 || var4 > 255)) {
                var2[var3] = (byte) var4;
            } else if (var4 == 8364) {
                var2[var3] = -128;
            } else if (var4 == 8218) {
                var2[var3] = -126;
            } else if (var4 == 402) {
                var2[var3] = -125;
            } else if (var4 == 8222) {
                var2[var3] = -124;
            } else if (var4 == 8230) {
                var2[var3] = -123;
            } else if (var4 == 8224) {
                var2[var3] = -122;
            } else if (var4 == 8225) {
                var2[var3] = -121;
            } else if (var4 == 710) {
                var2[var3] = -120;
            } else if (var4 == 8240) {
                var2[var3] = -119;
            } else if (var4 == 352) {
                var2[var3] = -118;
            } else if (var4 == 8249) {
                var2[var3] = -117;
            } else if (var4 == 338) {
                var2[var3] = -116;
            } else if (var4 == 381) {
                var2[var3] = -114;
            } else if (var4 == 8216) {
                var2[var3] = -111;
            } else if (var4 == 8217) {
                var2[var3] = -110;
            } else if (var4 == 8220) {
                var2[var3] = -109;
            } else if (var4 == 8221) {
                var2[var3] = -108;
            } else if (var4 == 8226) {
                var2[var3] = -107;
            } else if (var4 == 8211) {
                var2[var3] = -106;
            } else if (var4 == 8212) {
                var2[var3] = -105;
            } else if (var4 == 732) {
                var2[var3] = -104;
            } else if (var4 == 8482) {
                var2[var3] = -103;
            } else if (var4 == 353) {
                var2[var3] = -102;
            } else if (var4 == 8250) {
                var2[var3] = -101;
            } else if (var4 == 339) {
                var2[var3] = -100;
            } else if (var4 == 382) {
                var2[var3] = -98;
            } else if (var4 == 376) {
                var2[var3] = -97;
            } else {
                var2[var3] = 63;
            }
        }
        return var2;
    }

    @ObfuscatedName("am.w(B)V")
    public static void method873() {
        field446 = (byte[][][]) null;
        field2034 = (byte[][][]) null;
        field447 = (byte[][][]) null;
        field160 = (byte[][][]) null;
        field326 = (int[][][]) null;
        field448 = (byte[][][]) null;
        field449 = (int[][]) null;
        field455 = null;
        field3726 = null;
        field1036 = null;
        field3326 = null;
        field3138 = null;
    }

    @ObfuscatedName("d.s(Lic;IIIBZI)V")
    public static void method261(class250 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class247 var8 = (class247) class251.field3213.method3712(var6);
        if (var8 != null) {
            return;
        }
        class247 var9 = (class247) class251.field3200.method3712(var6);
        if (var9 != null) {
            return;
        }
        class247 var10 = (class247) class251.field3205.method3712(var6);
        if (var10 == null) {
            if (!arg5) {
                class247 var11 = (class247) class251.field3207.method3712(var6);
                if (var11 != null) {
                    return;
                }
            }
            class247 var12 = new class247();
            var12.field3156 = arg0;
            var12.field3157 = arg3;
            var12.field3158 = arg4;
            if (arg5) {
                class251.field3213.method3708(var12, var6);
                class251.field3212++;
            } else {
                class251.field3203.method3602(var12);
                class251.field3205.method3708(var12, var6);
                class251.field3206++;
            }
        } else if (arg5) {
            var10.method3793();
            class251.field3213.method3708(var10, var6);
            class251.field3206--;
            class251.field3212++;
        }
    }

    @ObfuscatedName("am.e(I)[Lly;")
    public static class318[] method871() {
        class318[] var0 = new class318[field3803];
        for (int var1 = 0; var1 < field3803; var1++) {
            class318 var2 = var0[var1] = new class318();
            var2.field3785 = field3730;
            var2.field3784 = field3799;
            var2.field3783 = field46[var1];
            var2.field3779 = field2563[var1];
            var2.field3781 = field3801[var1];
            var2.field3782 = field3800[var1];
            var2.field3780 = field2261;
            var2.field3786 = field3802[var1];
        }
        field46 = null;
        field2563 = null;
        field3801 = null;
        field3800 = null;
        field2261 = null;
        field3802 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("kq.p(I)Lly;")
    public static class318 method5226() {
        class318 var0 = new class318();
        var0.field3785 = field3730;
        var0.field3784 = field3799;
        var0.field3783 = field46[0];
        var0.field3779 = field2563[0];
        var0.field3781 = field3801[0];
        var0.field3782 = field3800[0];
        var0.field3780 = field2261;
        var0.field3786 = field3802[0];
        field46 = null;
        field2563 = null;
        field3801 = null;
        field3800 = null;
        field2261 = null;
        field3802 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("by.s(Ljava/io/File;ZI)Z")
    public static boolean method1656(File arg0, boolean arg1) {
        try {
            RandomAccessFile var2 = new RandomAccessFile(arg0, "rw");
            int var3 = var2.read();
            var2.seek(0L);
            var2.write(var3);
            var2.seek(0L);
            var2.close();
            if (arg1) {
                arg0.delete();
            }
            return true;
        } catch (Exception var5) {
            return false;
        }
    }

    @ObfuscatedName("ih.e(I)V")
    public static void method4221() {
        class79.field1107 = class79.field1107.trim();
        if (class79.field1107.length() == 0) {
            class79.method23(class238.field3047, class238.field3048, class238.field3049);
            return;
        }
        long var0 = class74.method1431();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = class79.field1107;
            Random var4 = new Random();
            class183 var5 = new class183(128);
            class183 var6 = new class183(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method3235(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method3410(var4.nextInt());
            }
            var5.method3410(var7[0]);
            var5.method3410(var7[1]);
            var5.method3362(var0);
            var5.method3362(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method3410(var4.nextInt());
            }
            var5.method3274(class74.field1040, class74.field1045);
            var6.method3235(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method3410(var4.nextInt());
            }
            var6.method3362(var4.nextLong());
            var6.method3287(var4.nextLong());
            if (client.field621 == null) {
                byte[] var11 = new byte[24];
                try {
                    class156.field1969.method2272(0L);
                    class156.field1969.method2274(var11);
                    int var12;
                    for (var12 = 0; var12 < 24 && var11[var12] == 0; var12++) {
                    }
                    if (var12 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var44) {
                    for (int var14 = 0; var14 < 24; var14++) {
                        var11[var14] = -1;
                    }
                }
                var6.method3245(var11, 0, var11.length);
            } else {
                var6.method3245(client.field621, 0, client.field621.length);
            }
            var6.method3362(var4.nextLong());
            var6.method3274(class74.field1040, class74.field1045);
            int var17 = class183.method5380(var3);
            if (var17 % 8 != 0) {
                var17 += 8 - var17 % 8;
            }
            class183 var18 = new class183(var17);
            var18.method3402(var3);
            var18.field2340 = var17;
            var18.method3270(var7);
            class183 var19 = new class183(var18.field2340 + var6.field2340 + var5.field2340 + 5);
            var19.method3235(2);
            var19.method3235(var5.field2340);
            var19.method3245(var5.field2339, 0, var5.field2340);
            var19.method3235(var6.field2340);
            var19.method3245(var6.field2339, 0, var6.field2340);
            var19.method3458(var18.field2340);
            var19.method3245(var18.field2339, 0, var18.field2340);
            byte[] var20 = var19.field2339;
            int var21 = var20.length;
            StringBuilder var22 = new StringBuilder();
            for (int var23 = 0; var23 < var21; var23 += 3) {
                int var24 = var20[var23] & 0xFF;
                var22.append(class305.field3723[var24 >>> 2]);
                if (var23 < var21 - 1) {
                    int var25 = var20[var23 + 1] & 0xFF;
                    var22.append(class305.field3723[(var24 & 0x3) << 4 | var25 >>> 4]);
                    if (var23 < var21 - 2) {
                        int var26 = var20[var23 + 2] & 0xFF;
                        var22.append(class305.field3723[(var25 & 0xF) << 2 | var26 >>> 6]).append(class305.field3723[var26 & 0x3F]);
                    } else {
                        var22.append(class305.field3723[(var25 & 0xF) << 2]).append("=");
                    }
                } else {
                    var22.append(class305.field3723[(var24 & 0x3) << 4]).append("==");
                }
            }
            String var27 = var22.toString();
            String var29 = var27;
            byte var36;
            try {
                URL var30 = new URL(client.method2931("services", false) + "m=accountappeal/login.ws");
                URLConnection var31 = var30.openConnection();
                var31.setDoInput(true);
                var31.setDoOutput(true);
                var31.setConnectTimeout(5000);
                OutputStreamWriter var32 = new OutputStreamWriter(var31.getOutputStream());
                var32.write("data2=" + class326.method5202(var29) + "&dest=" + class326.method5202("passwordchoice.ws"));
                var32.flush();
                InputStream var33 = var31.getInputStream();
                class183 var34 = new class183(new byte[1000]);
                while (true) {
                    int var35 = var33.read(var34.field2339, var34.field2340, 1000 - var34.field2340);
                    if (var35 == -1) {
                        var32.close();
                        var33.close();
                        String var37 = new String(var34.field2339);
                        if (var37.startsWith("OFFLINE")) {
                            var36 = 4;
                        } else if (var37.startsWith("WRONG")) {
                            var36 = 7;
                        } else if (var37.startsWith("RELOAD")) {
                            var36 = 3;
                        } else if (var37.startsWith("Not permitted for social network accounts.")) {
                            var36 = 6;
                        } else {
                            var34.method3256(var7);
                            while (var34.field2340 > 0 && var34.field2339[var34.field2340 - 1] == 0) {
                                var34.field2340--;
                            }
                            String var38 = new String(var34.field2339, 0, var34.field2340);
                            boolean var39;
                            if (var38 == null) {
                                var39 = false;
                            } else {
                                label120: {
                                    try {
                                        new URL(var38);
                                    } catch (MalformedURLException var42) {
                                        var39 = false;
                                        break label120;
                                    }
                                    var39 = true;
                                }
                            }
                            if (var39) {
                                class46.method4762(var38, true, false);
                                var36 = 2;
                            } else {
                                var36 = 5;
                            }
                        }
                        break;
                    }
                    var34.field2340 += var35;
                    if (var34.field2340 >= 1000) {
                        var36 = 5;
                        break;
                    }
                }
            } catch (Throwable var43) {
                var43.printStackTrace();
                var36 = 5;
            }
            var2 = var36;
        }
        switch(var2) {
            case 2:
                class79.method23(class238.field3050, class238.field3051, class238.field3073);
                class79.field1082 = 6;
                break;
            case 3:
                class79.method23(class238.field3053, class238.field3029, class238.field3055);
                break;
            case 4:
                class79.method23(class238.field2818, class238.field3057, class238.field2927);
                break;
            case 5:
                class79.method23(class238.field2954, class238.field3060, class238.field2997);
                break;
            case 6:
                class79.method23(class238.field2973, class238.field3063, class238.field3064);
                break;
            case 7:
                class79.method23(class238.field2911, class238.field3066, class238.field3067);
        }
    }

    @ObfuscatedName("ek.fb(Lbu;III)V")
    public static void method2872(class61 arg0, int arg1, int arg2) {
        if (arg0.field904 == arg1 && arg1 != -1) {
            int var3 = class274.method26(arg1).field3554;
            if (var3 == 1) {
                arg0.field905 = 0;
                arg0.field902 = 0;
                arg0.field907 = arg2;
                arg0.field908 = 0;
            }
            if (var3 == 2) {
                arg0.field908 = 0;
            }
        } else if (arg1 == -1 || arg0.field904 == -1 || class274.method26(arg1).field3548 >= class274.method26(arg0.field904).field3548) {
            arg0.field904 = arg1;
            arg0.field905 = 0;
            arg0.field902 = 0;
            arg0.field907 = arg2;
            arg0.field908 = 0;
            arg0.field931 = arg0.field910;
        }
    }

    @ObfuscatedName("bn.aw(ILce;ZB)I")
    public static int method1451(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = field83;
            int var4 = (field1877.field932 >> 7) + field869;
            int var5 = (field1877.field882 >> 7) + field755;
            client.method177().method5571(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = class70.field1000[--field1004];
            String var7 = "";
            class21 var8 = client.method177().method5589(var6);
            if (var8 != null) {
                var7 = var8.method191();
            }
            class70.field1002[++field498 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = class70.field1000[--field1004];
            client.method177().method5572(var9);
            return 1;
        } else if (arg0 == 6603) {
            class70.field1000[++field1004 - 1] = client.method177().method5586();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = class70.field1000[--field1004];
            client.method177().method5583(var10);
            return 1;
        } else if (arg0 == 6605) {
            class70.field1000[++field1004 - 1] = client.method177().method5656() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class227 var11 = new class227(class70.field1000[--field1004]);
            client.method177().method5614(var11.field2565, var11.field2566);
            return 1;
        } else if (arg0 == 6607) {
            class227 var12 = new class227(class70.field1000[--field1004]);
            client.method177().method5591(var12.field2565, var12.field2566);
            return 1;
        } else if (arg0 == 6608) {
            class227 var13 = new class227(class70.field1000[--field1004]);
            client.method177().method5606(var13.field2568, var13.field2565, var13.field2566);
            return 1;
        } else if (arg0 == 6609) {
            class227 var14 = new class227(class70.field1000[--field1004]);
            client.method177().method5593(var14.field2568, var14.field2565, var14.field2566);
            return 1;
        } else if (arg0 == 6610) {
            class70.field1000[++field1004 - 1] = client.method177().method5562();
            class70.field1000[++field1004 - 1] = client.method177().method5595();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = class70.field1000[--field1004];
            class21 var16 = client.method177().method5589(var15);
            if (var16 == null) {
                class70.field1000[++field1004 - 1] = 0;
            } else {
                class70.field1000[++field1004 - 1] = var16.method237().method4071();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = class70.field1000[--field1004];
            class21 var18 = client.method177().method5589(var17);
            if (var18 == null) {
                class70.field1000[++field1004 - 1] = 0;
                class70.field1000[++field1004 - 1] = 0;
            } else {
                class70.field1000[++field1004 - 1] = (var18.method195() - var18.method239() + 1) * 64;
                class70.field1000[++field1004 - 1] = (var18.method230() - var18.method228() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = class70.field1000[--field1004];
            class21 var20 = client.method177().method5589(var19);
            if (var20 == null) {
                class70.field1000[++field1004 - 1] = 0;
                class70.field1000[++field1004 - 1] = 0;
                class70.field1000[++field1004 - 1] = 0;
                class70.field1000[++field1004 - 1] = 0;
            } else {
                class70.field1000[++field1004 - 1] = var20.method239() * 64;
                class70.field1000[++field1004 - 1] = var20.method228() * 64;
                class70.field1000[++field1004 - 1] = var20.method195() * 64 + 64 - 1;
                class70.field1000[++field1004 - 1] = var20.method230() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = class70.field1000[--field1004];
            class21 var22 = client.method177().method5589(var21);
            if (var22 == null) {
                class70.field1000[++field1004 - 1] = -1;
            } else {
                class70.field1000[++field1004 - 1] = var22.method193();
            }
            return 1;
        } else if (arg0 == 6615) {
            class227 var23 = client.method177().method5561();
            if (var23 == null) {
                class70.field1000[++field1004 - 1] = -1;
                class70.field1000[++field1004 - 1] = -1;
            } else {
                class70.field1000[++field1004 - 1] = var23.field2565;
                class70.field1000[++field1004 - 1] = var23.field2566;
            }
            return 1;
        } else if (arg0 == 6616) {
            class70.field1000[++field1004 - 1] = client.method177().method5713();
            return 1;
        } else if (arg0 == 6617) {
            class227 var24 = new class227(class70.field1000[--field1004]);
            class21 var25 = client.method177().method5574();
            if (var25 == null) {
                class70.field1000[++field1004 - 1] = -1;
                class70.field1000[++field1004 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method194(var24.field2568, var24.field2565, var24.field2566);
            if (var26 == null) {
                class70.field1000[++field1004 - 1] = -1;
                class70.field1000[++field1004 - 1] = -1;
            } else {
                class70.field1000[++field1004 - 1] = var26[0];
                class70.field1000[++field1004 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class227 var27 = new class227(class70.field1000[--field1004]);
            class21 var28 = client.method177().method5574();
            if (var28 == null) {
                class70.field1000[++field1004 - 1] = -1;
                class70.field1000[++field1004 - 1] = -1;
                return 1;
            }
            class227 var29 = var28.method186(var27.field2565, var27.field2566);
            if (var29 == null) {
                class70.field1000[++field1004 - 1] = -1;
            } else {
                class70.field1000[++field1004 - 1] = var29.method4071();
            }
            return 1;
        } else if (arg0 == 6619) {
            field1004 -= 2;
            int var30 = class70.field1000[field1004];
            class227 var31 = new class227(class70.field1000[field1004 + 1]);
            class21 var32 = client.method177().method5589(var30);
            int var33 = field1877.field568;
            int var34 = (field1877.field932 >> 7) + field869;
            int var35 = (field1877.field882 >> 7) + field755;
            class227 var36 = new class227(var33, var34, var35);
            client.method177().method5633(var32, var36, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            field1004 -= 2;
            int var37 = class70.field1000[field1004];
            class227 var38 = new class227(class70.field1000[field1004 + 1]);
            class21 var39 = client.method177().method5589(var37);
            int var40 = field1877.field568;
            int var41 = (field1877.field932 >> 7) + field869;
            int var42 = (field1877.field882 >> 7) + field755;
            class227 var43 = new class227(var40, var41, var42);
            client.method177().method5633(var39, var43, var38, true);
            return 1;
        } else if (arg0 == 6621) {
            field1004 -= 2;
            int var44 = class70.field1000[field1004];
            class227 var45 = new class227(class70.field1000[field1004 + 1]);
            class21 var46 = client.method177().method5589(var44);
            if (var46 == null) {
                class70.field1000[++field1004 - 1] = 0;
                return 1;
            } else {
                class70.field1000[++field1004 - 1] = var46.method183(var45.field2568, var45.field2565, var45.field2566) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            class70.field1000[++field1004 - 1] = client.method177().method5702();
            class70.field1000[++field1004 - 1] = client.method177().method5598();
            return 1;
        } else if (arg0 == 6623) {
            class227 var47 = new class227(class70.field1000[--field1004]);
            class21 var48 = client.method177().method5676(var47.field2568, var47.field2565, var47.field2566);
            if (var48 == null) {
                class70.field1000[++field1004 - 1] = -1;
            } else {
                class70.field1000[++field1004 - 1] = var48.method188();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method177().method5649(class70.field1000[--field1004]);
            return 1;
        } else if (arg0 == 6625) {
            client.method177().method5600();
            return 1;
        } else if (arg0 == 6626) {
            client.method177().method5601(class70.field1000[--field1004]);
            return 1;
        } else if (arg0 == 6627) {
            client.method177().method5602();
            return 1;
        } else if (arg0 == 6628) {
            boolean var49 = class70.field1000[--field1004] == 1;
            client.method177().method5594(var49);
            return 1;
        } else if (arg0 == 6629) {
            int var50 = class70.field1000[--field1004];
            client.method177().method5666(var50);
            return 1;
        } else if (arg0 == 6630) {
            int var51 = class70.field1000[--field1004];
            client.method177().method5712(var51);
            return 1;
        } else if (arg0 == 6631) {
            client.method177().method5674();
            return 1;
        } else if (arg0 == 6632) {
            boolean var52 = class70.field1000[--field1004] == 1;
            client.method177().method5607(var52);
            return 1;
        } else if (arg0 == 6633) {
            field1004 -= 2;
            int var53 = class70.field1000[field1004];
            boolean var54 = class70.field1000[field1004 + 1] == 1;
            client.method177().method5608(var53, var54);
            return 1;
        } else if (arg0 == 6634) {
            field1004 -= 2;
            int var55 = class70.field1000[field1004];
            boolean var56 = class70.field1000[field1004 + 1] == 1;
            client.method177().method5609(var55, var56);
            return 1;
        } else if (arg0 == 6635) {
            class70.field1000[++field1004 - 1] = client.method177().method5610() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var57 = class70.field1000[--field1004];
            class70.field1000[++field1004 - 1] = client.method177().method5611(var57) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var58 = class70.field1000[--field1004];
            class70.field1000[++field1004 - 1] = client.method177().method5612(var58) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            field1004 -= 2;
            int var59 = class70.field1000[field1004];
            class227 var60 = new class227(class70.field1000[field1004 + 1]);
            class227 var61 = client.method177().method5660(var59, var60);
            if (var61 == null) {
                class70.field1000[++field1004 - 1] = -1;
            } else {
                class70.field1000[++field1004 - 1] = var61.method4071();
            }
            return 1;
        } else if (arg0 == 6639) {
            class29 var62 = client.method177().method5706();
            if (var62 == null) {
                class70.field1000[++field1004 - 1] = -1;
                class70.field1000[++field1004 - 1] = -1;
            } else {
                class70.field1000[++field1004 - 1] = var62.field241;
                class70.field1000[++field1004 - 1] = var62.field237.method4071();
            }
            return 1;
        } else if (arg0 == 6640) {
            class29 var63 = client.method177().method5746();
            if (var63 == null) {
                class70.field1000[++field1004 - 1] = -1;
                class70.field1000[++field1004 - 1] = -1;
            } else {
                class70.field1000[++field1004 - 1] = var63.field241;
                class70.field1000[++field1004 - 1] = var63.field237.method4071();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var64 = class70.field1000[--field1004];
            class256 var65 = field3247[var64];
            if (var65.field3242 == null) {
                class70.field1002[++field498 - 1] = "";
            } else {
                class70.field1002[++field498 - 1] = var65.field3242;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var66 = class70.field1000[--field1004];
            class256 var67 = field3247[var66];
            class70.field1000[++field1004 - 1] = var67.field3244;
            return 1;
        } else if (arg0 == 6695) {
            int var68 = class70.field1000[--field1004];
            class256 var69 = field3247[var68];
            if (var69 == null) {
                class70.field1000[++field1004 - 1] = -1;
            } else {
                class70.field1000[++field1004 - 1] = var69.field3241;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var70 = class70.field1000[--field1004];
            class256 var71 = field3247[var70];
            if (var71 == null) {
                class70.field1000[++field1004 - 1] = -1;
            } else {
                class70.field1000[++field1004 - 1] = var71.field3240;
            }
            return 1;
        } else if (arg0 == 6697) {
            class70.field1000[++field1004 - 1] = field3751.field308;
            return 1;
        } else if (arg0 == 6698) {
            class70.field1000[++field1004 - 1] = field3751.field312.method4071();
            return 1;
        } else if (arg0 == 6699) {
            class70.field1000[++field1004 - 1] = field3751.field309.method4071();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ab.iw([Lhi;IIIIIIIII)V")
    public static final void method428(class231[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class315.method5288(arg2, arg3, arg4, arg5);
        class123.method2658();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class231 var10 = arg0[var9];
            if (var10 != null && (var10.field2606 == arg1 || arg1 == -1412584499 && client.field584 == var10)) {
                int var11;
                if (arg8 == -1) {
                    client.field787[client.field604] = var10.field2619 + arg6;
                    client.field788[client.field604] = var10.field2620 + arg7;
                    client.field642[client.field604] = var10.field2676;
                    client.field790[client.field604] = var10.field2622;
                    var11 = ++client.field604 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2738 = var11;
                var10.field2628 = client.field592;
                if (!var10.field2605 || !client.method1756(var10)) {
                    if (var10.field2610 > 0) {
                        int var12 = var10.field2610;
                        if (var12 == 324) {
                            if (client.field843 == -1) {
                                client.field843 = var10.field2641;
                                client.field587 = var10.field2642;
                            }
                            if (client.field842.field2572) {
                                var10.field2641 = client.field843;
                            } else {
                                var10.field2641 = client.field587;
                            }
                        } else if (var12 == 325) {
                            if (client.field843 == -1) {
                                client.field843 = var10.field2641;
                                client.field587 = var10.field2642;
                            }
                            if (client.field842.field2572) {
                                var10.field2641 = client.field587;
                            } else {
                                var10.field2641 = client.field843;
                            }
                        } else if (var12 == 327) {
                            var10.field2657 = 150;
                            var10.field2658 = (int) (Math.sin((double) client.field592 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2666 = 5;
                            var10.field2594 = 0;
                        } else if (var12 == 328) {
                            var10.field2657 = 150;
                            var10.field2658 = (int) (Math.sin((double) client.field592 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2666 = 5;
                            var10.field2594 = 1;
                        }
                    }
                    int var13 = var10.field2619 + arg6;
                    int var14 = var10.field2620 + arg7;
                    int var15 = var10.field2637;
                    if (client.field584 == var10) {
                        if (arg1 != -1412584499 && !var10.field2635) {
                            field1815 = arg0;
                            field3688 = arg6;
                            field16 = arg7;
                            continue;
                        }
                        if (client.field764 && client.field602) {
                            int var16 = class49.field426;
                            int var17 = class49.field427 * 673804999;
                            int var18 = var16 - client.field754;
                            int var19 = var17 - client.field750;
                            if (var18 < client.field758) {
                                var18 = client.field758;
                            }
                            if (var10.field2676 + var18 > client.field758 + client.field753.field2676) {
                                var18 = client.field758 + client.field753.field2676 - var10.field2676;
                            }
                            if (var19 < client.field759) {
                                var19 = client.field759;
                            }
                            if (var10.field2622 + var19 > client.field759 + client.field753.field2622) {
                                var19 = client.field759 + client.field753.field2622 - var10.field2622;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2635) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2722 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2722 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2676 + var13;
                        int var27 = var10.field2622 + var14;
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        if (var27 < var14) {
                            var25 = var27;
                            var27 = var14;
                        }
                        var26++;
                        var27++;
                        var20 = var24 > arg2 ? var24 : arg2;
                        var21 = var25 > arg3 ? var25 : arg3;
                        var22 = var26 < arg4 ? var26 : arg4;
                        var23 = var27 < arg5 ? var27 : arg5;
                    } else {
                        int var30 = var10.field2676 + var13;
                        int var31 = var10.field2622 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2605 || var20 < var22 && var21 < var23) {
                        if (var10.field2610 != 0) {
                            if (var10.field2610 == 1336) {
                                if (client.field598) {
                                    var14 += 15;
                                    field934.method5099("Fps:" + client.field394, var10.field2676 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 327680 && !client.field586) {
                                        var34 = 16711680;
                                    }
                                    field934.method5099("Mem:" + var33 + "k", var10.field2676 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2610 == 1337) {
                                client.field730 = var13;
                                client.field731 = var14;
                                int var37 = var10.field2676;
                                int var38 = var10.field2622;
                                client.field688++;
                                client.method2965();
                                client.method3086();
                                client.method940();
                                client.method405(true);
                                client.method1548();
                                client.method405(false);
                                for (class80 var39 = (class80) client.field711.method3790(); var39 != null; var39 = (class80) client.field711.method3771()) {
                                    if (field83 != var39.field1122 || client.field592 > var39.field1128) {
                                        var39.method3756();
                                    } else if (client.field592 >= var39.field1127) {
                                        if (var39.field1136 > 0) {
                                            class73 var40 = client.field844[var39.field1136 - 1];
                                            if (var40 != null && var40.field932 >= 0 && var40.field932 < 13312 && var40.field882 >= 0 && var40.field882 < 13312) {
                                                var39.method1728(var40.field932, var40.field882, client.method422(var40.field932, var40.field882, var39.field1122) - var39.field1124, client.field592);
                                            }
                                        }
                                        if (var39.field1136 < 0) {
                                            int var41 = -var39.field1136 - 1;
                                            class61 var42;
                                            if (client.field629 == var41) {
                                                var42 = field1877;
                                            } else {
                                                var42 = client.field611[var41];
                                            }
                                            if (var42 != null && var42.field932 >= 0 && var42.field932 < 13312 && var42.field882 >= 0 && var42.field882 < 13312) {
                                                var39.method1728(var42.field932, var42.field882, client.method422(var42.field932, var42.field882, var39.field1122) - var39.field1124, client.field592);
                                            }
                                        }
                                        var39.method1729(client.field701);
                                        field249.method2679(field83, (int) var39.field1145, (int) var39.field1126, (int) var39.field1138, 60, var39, var39.field1141, -1L, false);
                                    }
                                }
                                for (class71 var43 = (class71) client.field712.method3790(); var43 != null; var43 = (class71) client.field712.method3771()) {
                                    if (field83 != var43.field1015 || var43.field1022) {
                                        var43.method3756();
                                    } else if (client.field592 >= var43.field1013) {
                                        var43.method1660(client.field701);
                                        if (var43.field1022) {
                                            var43.method3756();
                                        } else {
                                            field249.method2679(var43.field1015, var43.field1016, var43.field1017, var43.field1018, 60, var43, 0, -1L, false);
                                        }
                                    }
                                }
                                client.method635(var13, var14, var37, var38, true);
                                int var44 = client.field763;
                                int var45 = client.field838;
                                int var46 = client.field839;
                                int var47 = client.field663;
                                class315.method5288(var44, var45, var44 + var46, var45 + var47);
                                class123.method2658();
                                if (!client.field823) {
                                    int var48 = client.field650;
                                    if (client.field739 / 256 > var48) {
                                        var48 = client.field739 / 256;
                                    }
                                    if (client.field824[4] && client.field826[4] + 128 > var48) {
                                        var48 = client.field826[4] + 128;
                                    }
                                    int var49 = client.field718 & 0x7FF;
                                    client.method872(field1429, field3479, field24, var48, var49, var48 * 3 + 600);
                                }
                                int var50;
                                if (client.field823) {
                                    int var51;
                                    if (field62.field961) {
                                        var51 = field83;
                                    } else {
                                        int var52 = client.method422(field1432, field2564, field83);
                                        if (var52 - field1703 >= 800 || (class51.field444[field83][field1432 >> 7][field2564 >> 7] & 0x4) == 0) {
                                            var51 = 3;
                                        } else {
                                            var51 = field83;
                                        }
                                    }
                                    var50 = var51;
                                } else {
                                    var50 = client.method109();
                                }
                                int var53 = field1432;
                                int var54 = field1703;
                                int var55 = field2564;
                                int var56 = field42;
                                int var57 = field1202;
                                for (int var58 = 0; var58 < 5; var58++) {
                                    if (client.field824[var58]) {
                                        int var59 = (int) (Math.random() * (double) (client.field825[var58] * 2 + 1) - (double) client.field825[var58] + Math.sin((double) client.field827[var58] / 100.0D * (double) client.field706[var58]) * (double) client.field826[var58]);
                                        if (var58 == 0) {
                                            field1432 += var59;
                                        }
                                        if (var58 == 1) {
                                            field1703 += var59;
                                        }
                                        if (var58 == 2) {
                                            field2564 += var59;
                                        }
                                        if (var58 == 3) {
                                            field1202 = field1202 + var59 & 0x7FF;
                                        }
                                        if (var58 == 4) {
                                            field42 += var59;
                                            if (field42 < 128) {
                                                field42 = 128;
                                            }
                                            if (field42 > 383) {
                                                field42 = 383;
                                            }
                                        }
                                    }
                                }
                                int var60 = class49.field426;
                                int var61 = class49.field427 * 673804999;
                                if (class49.field432 != 0) {
                                    var60 = class49.field433;
                                    var61 = class49.field429;
                                }
                                if (var60 >= var44 && var60 < var44 + var46 && var61 >= var45 && var61 < var45 + var47) {
                                    class121.method834(var60 - var44, var61 - var45);
                                } else {
                                    class121.field1651 = false;
                                    class121.field1657 = 0;
                                }
                                client.method938();
                                class315.method5331(var44, var45, var46, var47, 0);
                                client.method938();
                                int var62 = class123.field1679;
                                class123.field1679 = client.field841;
                                field249.method2708(field1432, field1703, field2564, field42, field1202, var50);
                                class123.field1679 = var62;
                                client.method938();
                                field249.method2813();
                                client.field668 = 0;
                                boolean var63 = false;
                                int var64 = -1;
                                int var65 = -1;
                                int var66 = class82.field1168;
                                int[] var67 = class82.field1160;
                                for (int var68 = 0; var68 < client.field623 + var66; var68++) {
                                    class64 var69;
                                    if (var68 < var66) {
                                        var69 = client.field611[var67[var68]];
                                        if (client.field708 == var67[var68]) {
                                            var63 = true;
                                            var64 = var68;
                                            continue;
                                        }
                                        if (field1877 == var69) {
                                            var65 = var68;
                                            continue;
                                        }
                                    } else {
                                        var69 = client.field844[client.field640[var68 - var66]];
                                    }
                                    client.method569(var69, var68, var44, var45, var46, var47);
                                }
                                if (client.field700 && var65 != -1) {
                                    client.method569(field1877, var65, var44, var45, var46, var47);
                                }
                                if (var63) {
                                    client.method569(client.field611[client.field708], var64, var44, var45, var46, var47);
                                }
                                for (int var70 = 0; var70 < client.field668; var70++) {
                                    int var71 = client.field670[var70];
                                    int var72 = client.field671[var70];
                                    int var73 = client.field673[var70];
                                    int var74 = client.field672[var70];
                                    boolean var75 = true;
                                    while (var75) {
                                        var75 = false;
                                        for (int var76 = 0; var76 < var70; var76++) {
                                            if (var72 + 2 > client.field671[var76] - client.field672[var76] && var72 - var74 < client.field671[var76] + 2 && var71 - var73 < client.field673[var76] + client.field670[var76] && var71 + var73 > client.field670[var76] - client.field673[var76] && client.field671[var76] - client.field672[var76] < var72) {
                                                var72 = client.field671[var76] - client.field672[var76];
                                                var75 = true;
                                            }
                                        }
                                    }
                                    client.field680 = client.field670[var70];
                                    client.field681 = client.field671[var70] = var72;
                                    String var77 = client.field722[var70];
                                    if (client.field743 == 0) {
                                        int var78 = 16776960;
                                        if (client.field674[var70] < 6) {
                                            var78 = client.field732[client.field674[var70]];
                                        }
                                        if (client.field674[var70] == 6) {
                                            var78 = client.field688 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (client.field674[var70] == 7) {
                                            var78 = client.field688 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (client.field674[var70] == 8) {
                                            var78 = client.field688 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (client.field674[var70] == 9) {
                                            int var79 = 150 - client.field676[var70];
                                            if (var79 < 50) {
                                                var78 = var79 * 1280 + 16711680;
                                            } else if (var79 < 100) {
                                                var78 = 16776960 - (var79 - 50) * 327680;
                                            } else if (var79 < 150) {
                                                var78 = (var79 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (client.field674[var70] == 10) {
                                            int var80 = 150 - client.field676[var70];
                                            if (var80 < 50) {
                                                var78 = var80 * 5 + 16711680;
                                            } else if (var80 < 100) {
                                                var78 = 16711935 - (var80 - 50) * 327680;
                                            } else if (var80 < 150) {
                                                var78 = (var80 - 100) * 327680 + 255 - (var80 - 100) * 5;
                                            }
                                        }
                                        if (client.field674[var70] == 11) {
                                            int var81 = 150 - client.field676[var70];
                                            if (var81 < 50) {
                                                var78 = 16777215 - var81 * 327685;
                                            } else if (var81 < 100) {
                                                var78 = (var81 - 50) * 327685 + 65280;
                                            } else if (var81 < 150) {
                                                var78 = 16777215 - (var81 - 100) * 327680;
                                            }
                                        }
                                        if (client.field675[var70] == 0) {
                                            field3661.method5100(var77, client.field680 + var44, client.field681 + var45, var78, 0);
                                        }
                                        if (client.field675[var70] == 1) {
                                            field3661.method5177(var77, client.field680 + var44, client.field681 + var45, var78, 0, client.field688);
                                        }
                                        if (client.field675[var70] == 2) {
                                            field3661.method5143(var77, client.field680 + var44, client.field681 + var45, var78, 0, client.field688);
                                        }
                                        if (client.field675[var70] == 3) {
                                            field3661.method5112(var77, client.field680 + var44, client.field681 + var45, var78, 0, client.field688, 150 - client.field676[var70]);
                                        }
                                        if (client.field675[var70] == 4) {
                                            int var82 = (150 - client.field676[var70]) * (field3661.method5092(var77) + 100) / 150;
                                            class315.method5358(client.field680 + var44 - 50, var45, client.field680 + var44 + 50, var45 + var47);
                                            field3661.method5097(var77, client.field680 + var44 + 50 - var82, client.field681 + var45, var78, 0);
                                            class315.method5288(var44, var45, var44 + var46, var45 + var47);
                                        }
                                        if (client.field675[var70] == 5) {
                                            int var83 = 150 - client.field676[var70];
                                            int var84 = 0;
                                            if (var83 < 25) {
                                                var84 = var83 - 25;
                                            } else if (var83 > 125) {
                                                var84 = var83 - 125;
                                            }
                                            class315.method5358(var44, client.field681 + var45 - field3661.field3696 - 1, var44 + var46, client.field681 + var45 + 5);
                                            field3661.method5100(var77, client.field680 + var44, client.field681 + var45 + var84, var78, 0);
                                            class315.method5288(var44, var45, var44 + var46, var45 + var47);
                                        }
                                    } else {
                                        field3661.method5100(var77, client.field680 + var44, client.field681 + var45, 16776960, 0);
                                    }
                                }
                                if (client.field600 == 2) {
                                    client.method4225((client.field603 - field869 << 7) + client.field606, (client.field819 - field755 << 7) + client.field638, client.field605 * 2);
                                    if (client.field680 > -1 && client.field592 % 20 < 10) {
                                        field1927[0].method5411(client.field680 + var44 - 12, client.field681 + var45 - 28);
                                    }
                                }
                                ((class112) field1668).method2333(client.field701);
                                client.method159(var44, var45, var46, var47);
                                field1432 = var53;
                                field1703 = var54;
                                field2564 = var55;
                                field42 = var56;
                                field1202 = var57;
                                if (client.field626 && class251.method3489(true, false) == 0) {
                                    client.field626 = false;
                                }
                                if (client.field626) {
                                    class315.method5331(var44, var45, var46, var47, 0);
                                    client.method1804(class238.field2801, false);
                                }
                                client.field698[var10.field2738] = true;
                                class315.method5288(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2610 == 1338) {
                                client.method3176(var10, var13, var14, var11);
                                class315.method5288(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2610 == 1339) {
                                class225 var85 = var10.method4151(false);
                                if (var85 != null) {
                                    if (client.field811 < 3) {
                                        field1792.method5405(var13, var14, var85.field2554, var85.field2550, 25, 25, client.field718, 256, var85.field2552, var85.field2551);
                                    } else {
                                        class315.method5310(var13, var14, 0, var85.field2552, var85.field2551);
                                    }
                                }
                                class315.method5288(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2610 == 1400) {
                                field477.method5578(var13, var14, var10.field2676, var10.field2622, client.field592);
                            }
                            if (var10.field2610 == 1401) {
                                field477.method5582(var13, var14, var10.field2676, var10.field2622);
                            }
                        }
                        if (var10.field2722 == 0) {
                            if (!var10.field2605) {
                                boolean var86 = var10.field2626;
                                if (var86 && field1898 != var10) {
                                    continue;
                                }
                            }
                            if (!var10.field2605) {
                                if (var10.field2664 > var10.field2630 - var10.field2622) {
                                    var10.field2664 = var10.field2630 - var10.field2622;
                                }
                                if (var10.field2664 < 0) {
                                    var10.field2664 = 0;
                                }
                            }
                            method428(arg0, var10.field2692, var20, var21, var22, var23, var13 - var10.field2627, var14 - var10.field2664, var11);
                            if (var10.field2737 != null) {
                                method428(var10.field2737, var10.field2692, var20, var21, var22, var23, var13 - var10.field2627, var14 - var10.field2664, var11);
                            }
                            class56 var87 = (class56) client.field742.method3712((long) var10.field2692);
                            if (var87 != null) {
                                client.method571(var87.field502, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class315.method5288(arg2, arg3, arg4, arg5);
                            class123.method2658();
                        }
                        if (client.field793 || client.field724[var11] || client.field791 > 1) {
                            if (var10.field2722 == 0 && !var10.field2605 && var10.field2630 > var10.field2622) {
                                int var88 = var10.field2676 + var13;
                                int var89 = var10.field2664;
                                int var90 = var10.field2622;
                                int var91 = var10.field2630;
                                field3140[0].method5389(var88, var14);
                                field3140[1].method5389(var88, var14 + var90 - 16);
                                class315.method5331(var88, var14 + 16, 16, var90 - 32, client.field644);
                                int var92 = (var90 - 32) * var90 / var91;
                                if (var92 < 8) {
                                    var92 = 8;
                                }
                                int var93 = (var90 - 32 - var92) * var89 / (var91 - var90);
                                class315.method5331(var88, var14 + 16 + var93, 16, var92, client.field585);
                                class315.method5306(var88, var14 + 16 + var93, var92, client.field647);
                                class315.method5306(var88 + 1, var14 + 16 + var93, var92, client.field647);
                                class315.method5304(var88, var14 + 16 + var93, 16, client.field647);
                                class315.method5304(var88, var14 + 17 + var93, 16, client.field647);
                                class315.method5306(var88 + 15, var14 + 16 + var93, var92, client.field837);
                                class315.method5306(var88 + 14, var14 + 17 + var93, var92 - 1, client.field837);
                                class315.method5304(var88, var14 + 15 + var93 + var92, 16, client.field837);
                                class315.method5304(var88 + 1, var14 + 14 + var93 + var92, 15, client.field837);
                            }
                            if (var10.field2722 != 1) {
                                if (var10.field2722 == 2) {
                                    int var94 = 0;
                                    for (int var95 = 0; var95 < var10.field2618; var95++) {
                                        for (int var96 = 0; var96 < var10.field2617; var96++) {
                                            int var97 = (var10.field2673 + 32) * var96 + var13;
                                            int var98 = (var10.field2674 + 32) * var95 + var14;
                                            if (var94 < 20) {
                                                var97 += var10.field2686[var94];
                                                var98 += var10.field2739[var94];
                                            }
                                            if (var10.field2725[var94] > 0) {
                                                boolean var99 = false;
                                                boolean var100 = false;
                                                int var101 = var10.field2725[var94] - 1;
                                                if (var97 + 32 > arg2 && var97 < arg4 && var98 + 32 > arg3 && var98 < arg5 || field3560 == var10 && client.field689 == var94) {
                                                    class319 var102;
                                                    if (client.field734 == 1 && field85 == var94 && field2373 == var10.field2692) {
                                                        var102 = class270.method257(var101, var10.field2726[var94], 2, 0, 2, false);
                                                    } else {
                                                        var102 = class270.method257(var101, var10.field2726[var94], 1, 3153952, 2, false);
                                                    }
                                                    if (var102 == null) {
                                                        client.method1035(var10);
                                                    } else if (field3560 == var10 && client.field689 == var94) {
                                                        int var103 = class49.field426 - client.field679;
                                                        int var104 = class49.field427 * 673804999 - client.field822;
                                                        if (var103 < 5 && var103 > -5) {
                                                            var103 = 0;
                                                        }
                                                        if (var104 < 5 && var104 > -5) {
                                                            var104 = 0;
                                                        }
                                                        if (client.field694 < 5) {
                                                            var103 = 0;
                                                            var104 = 0;
                                                        }
                                                        var102.method5417(var97 + var103, var98 + var104, 128);
                                                        if (arg1 != -1) {
                                                            class231 var105 = arg0[arg1 & 0xFFFF];
                                                            if (var98 + var104 < class315.field3764 && var105.field2664 > 0) {
                                                                int var106 = client.field701 * (class315.field3764 - var98 - var104) / 3;
                                                                if (var106 > client.field701 * 10) {
                                                                    var106 = client.field701 * 10;
                                                                }
                                                                if (var106 > var105.field2664) {
                                                                    var106 = var105.field2664;
                                                                }
                                                                var105.field2664 -= var106;
                                                                client.field822 += var106;
                                                                client.method1035(var105);
                                                            }
                                                            if (var98 + var104 + 32 > class315.field3765 && var105.field2664 < var105.field2630 - var105.field2622) {
                                                                int var107 = client.field701 * (var98 + var104 + 32 - class315.field3765) / 3;
                                                                if (var107 > client.field701 * 10) {
                                                                    var107 = client.field701 * 10;
                                                                }
                                                                if (var107 > var105.field2630 - var105.field2622 - var105.field2664) {
                                                                    var107 = var105.field2630 - var105.field2622 - var105.field2664;
                                                                }
                                                                var105.field2664 += var107;
                                                                client.field822 -= var107;
                                                                client.method1035(var105);
                                                            }
                                                        }
                                                    } else if (field3097 == var10 && client.field583 == var94) {
                                                        var102.method5417(var97, var98, 128);
                                                    } else {
                                                        var102.method5411(var97, var98);
                                                    }
                                                }
                                            } else if (var10.field2677 != null && var94 < 20) {
                                                class319 var108 = var10.method4143(var94);
                                                if (var108 != null) {
                                                    var108.method5411(var97, var98);
                                                } else if (class231.field2604) {
                                                    client.method1035(var10);
                                                }
                                            }
                                            var94++;
                                        }
                                    }
                                } else if (var10.field2722 == 3) {
                                    int var109;
                                    if (client.method2867(var10)) {
                                        var109 = var10.field2632;
                                        if (field1898 == var10 && var10.field2634 != 0) {
                                            var109 = var10.field2634;
                                        }
                                    } else {
                                        var109 = var10.field2631;
                                        if (field1898 == var10 && var10.field2633 != 0) {
                                            var109 = var10.field2633;
                                        }
                                    }
                                    if (var10.field2711) {
                                        switch(var10.field2702.field3777) {
                                            case 1:
                                                class315.method5296(var13, var14, var10.field2676, var10.field2622, var10.field2631, var10.field2632, 256 - (var10.field2637 & 0xFF), 256 - (var10.field2609 & 0xFF));
                                                break;
                                            case 2:
                                                class315.method5297(var13, var14, var10.field2676, var10.field2622, var10.field2631, var10.field2632, 256 - (var10.field2637 & 0xFF), 256 - (var10.field2609 & 0xFF));
                                                break;
                                            case 3:
                                                class315.method5307(var13, var14, var10.field2676, var10.field2622, var10.field2631, var10.field2632, 256 - (var10.field2637 & 0xFF), 256 - (var10.field2609 & 0xFF));
                                                break;
                                            case 4:
                                                class315.method5294(var13, var14, var10.field2676, var10.field2622, var10.field2631, var10.field2632, 256 - (var10.field2637 & 0xFF), 256 - (var10.field2609 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class315.method5331(var13, var14, var10.field2676, var10.field2622, var109);
                                                } else {
                                                    class315.method5295(var13, var14, var10.field2676, var10.field2622, var109, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class315.method5302(var13, var14, var10.field2676, var10.field2622, var109);
                                    } else {
                                        class315.method5309(var13, var14, var10.field2676, var10.field2622, var109, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2722 == 4) {
                                    class299 var110 = var10.method4179();
                                    if (var110 != null) {
                                        String var111 = var10.field2668;
                                        int var112;
                                        if (client.method2867(var10)) {
                                            var112 = var10.field2632;
                                            if (field1898 == var10 && var10.field2634 != 0) {
                                                var112 = var10.field2634;
                                            }
                                            if (var10.field2718.length() > 0) {
                                                var111 = var10.field2718;
                                            }
                                        } else {
                                            var112 = var10.field2631;
                                            if (field1898 == var10 && var10.field2633 != 0) {
                                                var112 = var10.field2633;
                                            }
                                        }
                                        if (var10.field2605 && var10.field2650 != -1) {
                                            class270 var113 = class270.method2359(var10.field2650);
                                            var111 = var113.field3434;
                                            if (var111 == null) {
                                                var111 = class238.field2798;
                                            }
                                            if ((var113.field3445 == 1 || var10.field2728 != 1) && var10.field2728 != -1) {
                                                var111 = class75.method72(16748608) + var111 + class75.field1057 + " " + 'x' + client.method564(var10.field2728);
                                            }
                                        }
                                        if (client.field745 == var10) {
                                            var111 = class238.field2950;
                                            var112 = var10.field2631;
                                        }
                                        if (!var10.field2605) {
                                            var111 = client.method12(var111, var10);
                                        }
                                        var110.method5101(var111, var13, var14, var10.field2676, var10.field2622, var112, var10.field2672 ? 0 : -1, var10.field2670, var10.field2682, var10.field2669);
                                    } else if (class231.field2604) {
                                        client.method1035(var10);
                                    }
                                } else if (var10.field2722 == 5) {
                                    if (var10.field2605) {
                                        class319 var115;
                                        if (var10.field2650 == -1) {
                                            var115 = var10.method4142(false);
                                        } else {
                                            var115 = class270.method257(var10.field2650, var10.field2728, var10.field2645, var10.field2646, var10.field2665, false);
                                        }
                                        if (var115 != null) {
                                            int var116 = var115.field3797;
                                            int var117 = var115.field3793;
                                            if (var10.field2644) {
                                                class315.method5358(var13, var14, var10.field2676 + var13, var10.field2622 + var14);
                                                int var118 = (var10.field2676 + (var116 - 1)) / var116;
                                                int var119 = (var10.field2622 + (var117 - 1)) / var117;
                                                for (int var120 = 0; var120 < var118; var120++) {
                                                    for (int var121 = 0; var121 < var119; var121++) {
                                                        if (var10.field2597 != 0) {
                                                            var115.method5430(var116 / 2 + var116 * var120 + var13, var117 / 2 + var117 * var121 + var14, var10.field2597, 4096);
                                                        } else if (var15 == 0) {
                                                            var115.method5411(var116 * var120 + var13, var117 * var121 + var14);
                                                        } else {
                                                            var115.method5417(var116 * var120 + var13, var117 * var121 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class315.method5288(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var122 = var10.field2676 * 4096 / var116;
                                                if (var10.field2597 != 0) {
                                                    var115.method5430(var10.field2676 / 2 + var13, var10.field2622 / 2 + var14, var10.field2597, var122);
                                                } else if (var15 != 0) {
                                                    var115.method5416(var13, var14, var10.field2676, var10.field2622, 256 - (var15 & 0xFF));
                                                } else if (var10.field2676 == var116 && var10.field2622 == var117) {
                                                    var115.method5411(var13, var14);
                                                } else {
                                                    var115.method5413(var13, var14, var10.field2676, var10.field2622);
                                                }
                                            }
                                        } else if (class231.field2604) {
                                            client.method1035(var10);
                                        }
                                    } else {
                                        class319 var114 = var10.method4142(client.method2867(var10));
                                        if (var114 != null) {
                                            var114.method5411(var13, var14);
                                        } else if (class231.field2604) {
                                            client.method1035(var10);
                                        }
                                    }
                                } else if (var10.field2722 == 6) {
                                    boolean var123 = client.method2867(var10);
                                    int var124;
                                    if (var123) {
                                        var124 = var10.field2654;
                                    } else {
                                        var124 = var10.field2596;
                                    }
                                    class120 var125 = null;
                                    int var126 = 0;
                                    if (var10.field2650 != -1) {
                                        class270 var127 = class270.method2359(var10.field2650);
                                        if (var127 != null) {
                                            class270 var128 = var127.method4703(var10.field2728);
                                            var125 = var128.method4702(1);
                                            if (var125 == null) {
                                                client.method1035(var10);
                                            } else {
                                                var125.method2466();
                                                var126 = var125.field1782 / 2;
                                            }
                                        }
                                    } else if (var10.field2666 == 5) {
                                        if (var10.field2594 == 0) {
                                            var125 = client.field842.method4102((class274) null, -1, (class274) null, -1);
                                        } else {
                                            var125 = field1877.method1010();
                                        }
                                    } else if (var124 == -1) {
                                        var125 = var10.method4144((class274) null, -1, var123, field1877.field547);
                                        if (var125 == null && class231.field2604) {
                                            client.method1035(var10);
                                        }
                                    } else {
                                        class274 var129 = class274.method26(var124);
                                        var125 = var10.method4144(var129, var10.field2729, var123, field1877.field547);
                                        if (var125 == null && class231.field2604) {
                                            client.method1035(var10);
                                        }
                                    }
                                    class123.method2623(var10.field2676 / 2 + var13, var10.field2622 / 2 + var14);
                                    int var130 = var10.field2705 * class123.field1682[var10.field2657] >> 16;
                                    int var131 = var10.field2705 * class123.field1694[var10.field2657] >> 16;
                                    if (var125 != null) {
                                        if (var10.field2605) {
                                            var125.method2466();
                                            if (var10.field2663) {
                                                var125.method2506(0, var10.field2658, var10.field2659, var10.field2657, var10.field2593, var10.field2656 + var126 + var130, var10.field2656 + var131, var10.field2705);
                                            } else {
                                                var125.method2478(0, var10.field2658, var10.field2659, var10.field2657, var10.field2593, var10.field2656 + var126 + var130, var10.field2656 + var131);
                                            }
                                        } else {
                                            var125.method2478(0, var10.field2658, 0, var10.field2657, 0, var130, var131);
                                        }
                                    }
                                    class123.method2628();
                                } else {
                                    if (var10.field2722 == 7) {
                                        class299 var132 = var10.method4179();
                                        if (var132 == null) {
                                            if (class231.field2604) {
                                                client.method1035(var10);
                                            }
                                            continue;
                                        }
                                        int var133 = 0;
                                        for (int var134 = 0; var134 < var10.field2618; var134++) {
                                            for (int var135 = 0; var135 < var10.field2617; var135++) {
                                                if (var10.field2725[var133] > 0) {
                                                    class270 var136 = class270.method2359(var10.field2725[var133] - 1);
                                                    String var137;
                                                    if (var136.field3445 != 1 && var10.field2726[var133] == 1) {
                                                        var137 = class75.method72(16748608) + var136.field3434 + class75.field1057;
                                                    } else {
                                                        var137 = class75.method72(16748608) + var136.field3434 + class75.field1057 + " " + 'x' + client.method564(var10.field2726[var133]);
                                                    }
                                                    int var138 = (var10.field2673 + 115) * var135 + var13;
                                                    int var139 = (var10.field2674 + 12) * var134 + var14;
                                                    if (var10.field2670 == 0) {
                                                        var132.method5097(var137, var138, var139, var10.field2631, var10.field2672 ? 0 : -1);
                                                    } else if (var10.field2670 == 1) {
                                                        var132.method5100(var137, var10.field2676 / 2 + var138, var139, var10.field2631, var10.field2672 ? 0 : -1);
                                                    } else {
                                                        var132.method5099(var137, var10.field2676 + var138 - 1, var139, var10.field2631, var10.field2672 ? 0 : -1);
                                                    }
                                                }
                                                var133++;
                                            }
                                        }
                                    }
                                    if (var10.field2722 == 8 && field1889 == var10 && client.field733 == client.field624) {
                                        int var140 = 0;
                                        int var141 = 0;
                                        class299 var142 = field934;
                                        String var143 = var10.field2668;
                                        String var144 = client.method12(var143, var10);
                                        while (var144.length() > 0) {
                                            int var145 = var144.indexOf(class75.field1051);
                                            String var146;
                                            if (var145 == -1) {
                                                var146 = var144;
                                                var144 = "";
                                            } else {
                                                var146 = var144.substring(0, var145);
                                                var144 = var144.substring(var145 + 4);
                                            }
                                            int var147 = var142.method5092(var146);
                                            if (var147 > var140) {
                                                var140 = var147;
                                            }
                                            var141 += var142.field3696 + 1;
                                        }
                                        var140 += 6;
                                        var141 += 7;
                                        int var148 = var10.field2676 + var13 - 5 - var140;
                                        int var149 = var10.field2622 + var14 + 5;
                                        if (var148 < var13 + 5) {
                                            var148 = var13 + 5;
                                        }
                                        if (var140 + var148 > arg4) {
                                            var148 = arg4 - var140;
                                        }
                                        if (var141 + var149 > arg5) {
                                            var149 = arg5 - var141;
                                        }
                                        class315.method5331(var148, var149, var140, var141, 16777120);
                                        class315.method5302(var148, var149, var140, var141, 0);
                                        String var150 = var10.field2668;
                                        int var151 = var142.field3696 + var149 + 2;
                                        String var152 = client.method12(var150, var10);
                                        while (var152.length() > 0) {
                                            int var153 = var152.indexOf(class75.field1051);
                                            String var154;
                                            if (var153 == -1) {
                                                var154 = var152;
                                                var152 = "";
                                            } else {
                                                var154 = var152.substring(0, var153);
                                                var152 = var152.substring(var153 + 4);
                                            }
                                            var142.method5097(var154, var148 + 3, var151, 0, -1);
                                            var151 += var142.field3696 + 1;
                                        }
                                    }
                                    if (var10.field2722 == 9) {
                                        int var155;
                                        int var156;
                                        int var157;
                                        int var158;
                                        if (var10.field2640) {
                                            var155 = var13;
                                            var156 = var10.field2622 + var14;
                                            var157 = var10.field2676 + var13;
                                            var158 = var14;
                                        } else {
                                            var155 = var13;
                                            var156 = var14;
                                            var157 = var10.field2676 + var13;
                                            var158 = var10.field2622 + var14;
                                        }
                                        if (var10.field2639 == 1) {
                                            class315.method5333(var155, var156, var157, var158, var10.field2631);
                                        } else {
                                            int var161 = var10.field2631;
                                            int var162 = var10.field2639;
                                            int var163 = var157 - var155;
                                            int var164 = var158 - var156;
                                            int var165 = var163 >= 0 ? var163 : -var163;
                                            int var166 = var164 >= 0 ? var164 : -var164;
                                            int var167 = var165;
                                            if (var165 < var166) {
                                                var167 = var166;
                                            }
                                            if (var167 != 0) {
                                                int var168 = (var163 << 16) / var167;
                                                int var169 = (var164 << 16) / var167;
                                                if (var169 <= var168) {
                                                    var168 = -var168;
                                                } else {
                                                    var169 = -var169;
                                                }
                                                int var170 = var162 * var169 >> 17;
                                                int var171 = var162 * var169 + 1 >> 17;
                                                int var172 = var162 * var168 >> 17;
                                                int var173 = var162 * var168 + 1 >> 17;
                                                int var174 = var155 - class315.field3766;
                                                int var175 = var156 - class315.field3764;
                                                int var176 = var170 + var174;
                                                int var177 = var174 - var171;
                                                int var178 = var163 + var174 - var171;
                                                int var179 = var163 + var174 + var170;
                                                int var180 = var172 + var175;
                                                int var181 = var175 - var173;
                                                int var182 = var164 + var175 - var173;
                                                int var183 = var164 + var175 + var172;
                                                class123.method2589(var176, var177, var178);
                                                class123.method2592(var180, var181, var182, var176, var177, var178, var161);
                                                class123.method2589(var176, var178, var179);
                                                class123.method2592(var180, var182, var183, var176, var178, var179, var161);
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

    @ObfuscatedName("kc.jl(I)V")
    public static void method5076() {
        for (class56 var0 = (class56) client.field742.method3710(); var0 != null; var0 = (class56) client.field742.method3711()) {
            int var1 = var0.field502;
            if (class231.method4540(var1)) {
                boolean var2 = true;
                class231[] var3 = field367[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2605;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2422;
                    class231 var6 = class231.method415(var5);
                    if (var6 != null) {
                        client.method1035(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.jw(Ljava/lang/String;I)V")
    public static final void method111(String arg0) {
        if (!arg0.equals("")) {
            class173 var1 = method414(class170.field2154, client.field627.field1219);
            var1.field2258.method3235(class183.method5380(arg0));
            var1.field2258.method3402(arg0);
            client.field627.method1847(var1);
        }
    }
}
