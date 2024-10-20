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
import java.util.concurrent.ScheduledExecutorService;
import javax.imageio.ImageIO;

public class Statics {

    @ObfuscatedName("q.qn")
    public static long field1;

    @ObfuscatedName("q.qz")
    public static class14 field10;

    @ObfuscatedName("client.ce")
    public static class258 field1006;

    @ObfuscatedName("client.ow")
    public static int field1039;

    @ObfuscatedName("client.qa")
    public static class78 field1072;

    @ObfuscatedName("bo.gi")
    public static int field1155;

    @ObfuscatedName("bs.c")
    public static class148 field1171;

    @ObfuscatedName("bs.a")
    public static class77[] field1179;

    @ObfuscatedName("cq.fs")
    public static int[][] field1190;

    @ObfuscatedName("cq.g")
    public static int field1198;

    @ObfuscatedName("q.eg")
    public static class169 field12;

    @ObfuscatedName("cu.dm")
    public static int field1218;

    @ObfuscatedName("cw.p")
    public static String[] field1221;

    @ObfuscatedName("cw.o")
    public static int[] field1226;

    @ObfuscatedName("cw.d")
    public static class237 field1229;

    @ObfuscatedName("cw.dw")
    public static class258 field1233;

    @ObfuscatedName("cw.y")
    public static int field1234;

    @ObfuscatedName("cx.p")
    public static class322 field1265;

    @ObfuscatedName("cn.db")
    public static class258 field1275;

    @ObfuscatedName("cl.pf")
    public static class79 field1278;

    @ObfuscatedName("cl.h")
    public static byte[][][] field1283;

    @ObfuscatedName("cc.ou")
    public static class107 field1289;

    @ObfuscatedName("cc.s")
    public static int field1291;

    @ObfuscatedName("o.df")
    public static class258 field13;

    @ObfuscatedName("cy.o")
    public static class322 field1300;

    @ObfuscatedName("cy.a")
    public static class322[] field1301;

    @ObfuscatedName("cy.y")
    public static class322 field1302;

    @ObfuscatedName("cy.r")
    public static class322 field1303;

    @ObfuscatedName("cy.aj")
    public static int[] field1308;

    @ObfuscatedName("cy.l")
    public static boolean[] field1335;

    @ObfuscatedName("cr.ls")
    public static int field1362;

    @ObfuscatedName("co.o")
    public static class256 field1363;

    @ObfuscatedName("co.ae")
    public static int field1366;

    @ObfuscatedName("co.d")
    public static class110 field1367;

    @ObfuscatedName("co.qo")
    public static int field1368;

    @ObfuscatedName("cj.jo")
    public static class237 field1390;

    @ObfuscatedName("o.ne")
    public static class294 field14;

    @ObfuscatedName("ca.cz")
    public static class258 field1412;

    @ObfuscatedName("ca.ov")
    public static int field1413;

    @ObfuscatedName("cs.ci")
    public static class258 field1414;

    @ObfuscatedName("cs.ah")
    public static int[] field1423;

    @ObfuscatedName("cs.oz")
    public static int field1426;

    @ObfuscatedName("cp.z")
    public static int[] field1430;

    @ObfuscatedName("cf.qs")
    public static short[] field1433;

    @ObfuscatedName("cb.f")
    public static int[] field1460;

    @ObfuscatedName("cb.u")
    public static int field1462;

    @ObfuscatedName("cb.d")
    public static class106[] field1464;

    @ObfuscatedName("cb.l")
    public static byte[] field1466;

    @ObfuscatedName("cb.y")
    public static int field1467;

    @ObfuscatedName("cb.g")
    public static int field1468;

    @ObfuscatedName("cb.c")
    public static int field1469;

    @ObfuscatedName("cb.ah")
    public static int[] field1470;

    @ObfuscatedName("cb.i")
    public static float[] field1471;

    @ObfuscatedName("cb.av")
    public static float[] field1472;

    @ObfuscatedName("cb.s")
    public static class118[] field1474;

    @ObfuscatedName("cb.am")
    public static float[] field1477;

    @ObfuscatedName("cb.e")
    public static float[] field1482;

    @ObfuscatedName("cb.k")
    public static float[] field1483;

    @ObfuscatedName("cb.n")
    public static float[] field1484;

    @ObfuscatedName("cb.v")
    public static class113[] field1486;

    @ObfuscatedName("cb.ao")
    public static float[] field1487;

    @ObfuscatedName("cb.r")
    public static class102[] field1488;

    @ObfuscatedName("cb.aj")
    public static int[] field1489;

    @ObfuscatedName("cb.t")
    public static boolean[] field1490;

    @ObfuscatedName("o.fx")
    public static class322[] field15;

    @ObfuscatedName("dh.r")
    public static boolean[] field1502;

    @ObfuscatedName("dh.c")
    public static int[] field1506;

    @ObfuscatedName("dh.u")
    public static int[] field1509;

    @ObfuscatedName("dw.d")
    public static class101 field1513;

    @ObfuscatedName("dw.a")
    public static int field1523;

    @ObfuscatedName("dw.pe")
    public static int field1525;

    @ObfuscatedName("dj.g")
    public static class322[] field1542;

    @ObfuscatedName("dj.a")
    public static Thread field1544;

    @ObfuscatedName("dj.q")
    public static class256 field1545;

    @ObfuscatedName("do.cs")
    public static class258 field1551;

    @ObfuscatedName("do.hs")
    public static class237 field1553;

    @ObfuscatedName("dl.cm")
    public static int field1564;

    @ObfuscatedName("di.y")
    public static float field1595;

    @ObfuscatedName("di.g")
    public static int field1597;

    @ObfuscatedName("de.fz")
    public static class322[] field1648;

    @ObfuscatedName("dk.y")
    public static int field1659;

    @ObfuscatedName("dd.l")
    public static int[] field1752;

    @ObfuscatedName("da.s")
    public static int[] field1767;

    @ObfuscatedName("p.dc")
    public static int field18;

    @ObfuscatedName("ee.bi")
    public static int field1860;

    @ObfuscatedName("ee.br")
    public static int field1861;

    @ObfuscatedName("ee.be")
    public static int field1867;

    @ObfuscatedName("ex.c")
    public static int field1873;

    @ObfuscatedName("ex.y")
    public static int field1876;

    @ObfuscatedName("ex.op")
    public static int field1880;

    @ObfuscatedName("ex.ny")
    public static class323 field1881;

    @ObfuscatedName("ed.t")
    public static class194 field1882;

    @ObfuscatedName("ed.c")
    public static int field1889;

    @ObfuscatedName("ed.ex")
    public static long field1890;

    @ObfuscatedName("ek.w")
    public static int field1900;

    @ObfuscatedName("ek.x")
    public static int field1901;

    @ObfuscatedName("ek.d")
    public static int field1903;

    @ObfuscatedName("ek.v")
    public static int field1904;

    @ObfuscatedName("ek.s")
    public static int field1905;

    @ObfuscatedName("ek.m")
    public static int field1906;

    @ObfuscatedName("ek.f")
    public static int field1907;

    @ObfuscatedName("ek.t")
    public static int field1909;

    @ObfuscatedName("ek.e")
    public static class143 field1913;

    @ObfuscatedName("eg.nk")
    public static boolean field1925;

    @ObfuscatedName("ev.am")
    public static int field1932;

    @ObfuscatedName("ev.av")
    public static int field1940;

    @ObfuscatedName("ev.n")
    public static int field1945;

    @ObfuscatedName("ev.w")
    public static int field1951;

    @ObfuscatedName("ev.j")
    public static int field1952;

    @ObfuscatedName("ev.z")
    public static int field1953;

    @ObfuscatedName("ev.k")
    public static int field1955;

    @ObfuscatedName("ev.ao")
    public static int field1959;

    @ObfuscatedName("ev.f")
    public static int field1961;

    @ObfuscatedName("ev.i")
    public static int field1962;

    @ObfuscatedName("ev.e")
    public static int field1964;

    @ObfuscatedName("ev.m")
    public static int field1971;

    @ObfuscatedName("ev.bj")
    public static int field1977;

    @ObfuscatedName("ev.aj")
    public static int field1978;

    @ObfuscatedName("ev.bp")
    public static boolean[][] field1988;

    @ObfuscatedName("ev.x")
    public static int field1989;

    @ObfuscatedName("ev.bi")
    public static int field1990;

    @ObfuscatedName("ev.br")
    public static int field1991;

    @ObfuscatedName("ev.be")
    public static int field1992;

    @ObfuscatedName("ev.bk")
    public static int field1993;

    @ObfuscatedName("ev.bt")
    public static int field1994;

    @ObfuscatedName("en.fp")
    public static class323[] field2010;

    @ObfuscatedName("ej.h")
    public static boolean field2013;

    @ObfuscatedName("et.e")
    public static String field2033;

    @ObfuscatedName("ew.gs")
    public static int field2047;

    @ObfuscatedName("eq.ja")
    public static int field2064;

    @ObfuscatedName("eq.fr")
    public static class137 field2065;

    @ObfuscatedName("eo.cr")
    public static class169 field2066;

    @ObfuscatedName("em.a")
    public static int field2086;

    @ObfuscatedName("em.ez")
    public static int field2087;

    @ObfuscatedName("em.s")
    public static class121[] field2088;

    @ObfuscatedName("eu.ef")
    public static int field2091;

    @ObfuscatedName("ep.h")
    public static int field2092;

    @ObfuscatedName("ep.et")
    public static class298 field2093;

    @ObfuscatedName("ep.k")
    public static int[] field2094;

    @ObfuscatedName("eb.y")
    public static class256 field2096;

    @ObfuscatedName("eb.o")
    public static class256 field2097;

    @ObfuscatedName("ey.p")
    public static class225 field2106;

    @ObfuscatedName("ey.ck")
    public static class258 field2107;

    @ObfuscatedName("ey.ca")
    public static class258 field2108;

    @ObfuscatedName("fo.m")
    public static String[] field2109;

    @ObfuscatedName("fl.or")
    public static int field2117;

    @ObfuscatedName("fl.fg")
    public static byte[][] field2121;

    @ObfuscatedName("fs.q")
    public static class256 field2122;

    @ObfuscatedName("fs.gb")
    public static int field2124;

    @ObfuscatedName("fr.qi")
    public static class174 field2142;

    @ObfuscatedName("fr.fn")
    public static class323[] field2143;

    @ObfuscatedName("fc.q")
    public static String field2145;

    @ObfuscatedName("fc.o")
    public static int field2146;

    @ObfuscatedName("fc.b")
    public static Applet field2148;

    @ObfuscatedName("ff.b")
    public static String field2159;

    @ObfuscatedName("fb.q")
    public static class256 field2168;

    @ObfuscatedName("fb.p")
    public static File field2169;

    @ObfuscatedName("fb.h")
    public static int field2170;

    @ObfuscatedName("fb.ji")
    public static int field2173;

    @ObfuscatedName("fb.at")
    public static boolean field2177;

    @ObfuscatedName("fi.v")
    public static class255 field2181;

    @ObfuscatedName("ft.q")
    public static File field2183;

    @ObfuscatedName("fy.c")
    public static class256 field2193;

    @ObfuscatedName("fx.bb")
    public static class252 field2195;

    @ObfuscatedName("l.gb")
    public static class7[] field220;

    @ObfuscatedName("fm.h")
    public static int field2244;

    @ObfuscatedName("fh.a")
    public static int field2252;

    @ObfuscatedName("g.jl")
    public static int field232;

    @ObfuscatedName("g.c")
    public static class109 field238;

    @ObfuscatedName("c.g")
    public static int field240;

    @ObfuscatedName("fd.ah")
    public static FontMetrics field2444;

    @ObfuscatedName("gc.g")
    public static int[][] field2470;

    @ObfuscatedName("gq.h")
    public static class256 field2472;

    @ObfuscatedName("u.bg")
    public static class322[] field248;

    @ObfuscatedName("gi.j")
    public static String field2487;

    @ObfuscatedName("gi.y")
    public static byte[][][] field2489;

    @ObfuscatedName("gy.z")
    public static String field2491;

    @ObfuscatedName("gy.ed")
    public static class165 field2492;

    @ObfuscatedName("u.qx")
    public static class326 field251;

    @ObfuscatedName("r.bx")
    public static int field254;

    @ObfuscatedName("gz.l")
    public static int[] field2548;

    @ObfuscatedName("r.ad")
    public static String field255;

    @ObfuscatedName("gz.ap")
    public static int field2551;

    @ObfuscatedName("gz.dj")
    public static class258 field2554;

    @ObfuscatedName("gf.q")
    public static long field2555;

    @ObfuscatedName("gf.iz")
    public static int field2556;

    @ObfuscatedName("gm.gd")
    public static int field2565;

    @ObfuscatedName("gh.ot")
    public static class114 field2566;

    @ObfuscatedName("gh.q")
    public static int field2567;

    @ObfuscatedName("d.b")
    public static long field258;

    @ObfuscatedName("gp.fw")
    public static class322[] field2587;

    @ObfuscatedName("d.jc")
    public static class237 field259;

    @ObfuscatedName("a.gu")
    public static int field26;

    @ObfuscatedName("d.c")
    public static class322 field260;

    @ObfuscatedName("hw.x")
    public static int field2642;

    @ObfuscatedName("hr.v")
    public static class237 field2644;

    @ObfuscatedName("hr.b")
    public static class256 field2645;

    @ObfuscatedName("hr.g")
    public static int field2646;

    @ObfuscatedName("hr.u")
    public static boolean field2648;

    @ObfuscatedName("hr.l")
    public static int field2649;

    @ObfuscatedName("ho.os")
    public static int field2651;

    @ObfuscatedName("v.f")
    public static String[] field267;

    @ObfuscatedName("v.qu")
    public static int field269;

    @ObfuscatedName("hq.im")
    public static int field2735;

    @ObfuscatedName("hu.c")
    public static int[] field2739;

    @ObfuscatedName("hy.g")
    public static short[] field2744;

    @ObfuscatedName("hy.l")
    public static short[] field2746;

    @ObfuscatedName("hy.c")
    public static short[][] field2749;

    @ObfuscatedName("s.d")
    public static int field275;

    @ObfuscatedName("hy.y")
    public static short[][] field2751;

    @ObfuscatedName("ij.bj")
    public static class327 field2759;

    @ObfuscatedName("ij.h")
    public static class323 field2760;

    @ObfuscatedName("iy.a")
    public static byte[][][] field2765;

    @ObfuscatedName("im.h")
    public static class237[][] field2770;

    @ObfuscatedName("im.g")
    public static class256 field2771;

    @ObfuscatedName("a.l")
    public static byte[][][] field28;

    @ObfuscatedName("t.p")
    public static int[] field282;

    @ObfuscatedName("f.dh")
    public static class258 field286;

    @ObfuscatedName("a.h")
    public static int[] field29;

    @ObfuscatedName("m.b")
    public static class256 field293;

    @ObfuscatedName("m.ft")
    public static class323 field294;

    @ObfuscatedName("m.l")
    public static int field295;

    @ObfuscatedName("m.t")
    public static int field298;

    @ObfuscatedName("m.ha")
    public static class237 field299;

    @ObfuscatedName("h.cc")
    public static char field30;

    @ObfuscatedName("x.r")
    public static int field301;

    @ObfuscatedName("x.my")
    public static class168 field303;

    @ObfuscatedName("x.l")
    public static class256 field304;

    @ObfuscatedName("h.b")
    public static boolean field31;

    @ObfuscatedName("j.jv")
    public static class87 field311;

    @ObfuscatedName("z.q")
    public static String field313;

    @ObfuscatedName("k.cj")
    public static long field315;

    @ObfuscatedName("ik.d")
    public static boolean field3277;

    @ObfuscatedName("ib.y")
    public static int[] field3285;

    @ObfuscatedName("n.jz")
    public static int field329;

    @ObfuscatedName("iv.dx")
    public static int field3304;

    @ObfuscatedName("ir.a")
    public static int[] field3313;

    @ObfuscatedName("n.cx")
    public static boolean field333;

    @ObfuscatedName("in.bt")
    public static class322[] field3344;

    @ObfuscatedName("n.u")
    public static int[] field335;

    @ObfuscatedName("ia.fo")
    public static int[] field3356;

    @ObfuscatedName("io.o")
    public static long field3359;

    @ObfuscatedName("io.b")
    public static class169 field3366;

    @ObfuscatedName("if.ej")
    public static class298 field3380;

    @ObfuscatedName("if.bg")
    public static int field3382;

    @ObfuscatedName("jt.b")
    public static class256 field3385;

    @ObfuscatedName("jg.b")
    public static class256 field3388;

    @ObfuscatedName("jz.b")
    public static class256 field3395;

    @ObfuscatedName("jz.o")
    public static int field3409;

    @ObfuscatedName("n.kr")
    public static int field341;

    @ObfuscatedName("ji.b")
    public static class256 field3413;

    @ObfuscatedName("ji.fh")
    public static class323[] field3415;

    @ObfuscatedName("jl.b")
    public static class256 field3416;

    @ObfuscatedName("i.n")
    public static int field342;

    @ObfuscatedName("jk.q")
    public static class256 field3421;

    @ObfuscatedName("jk.b")
    public static class256 field3431;

    @ObfuscatedName("jp.b")
    public static class256 field3438;

    @ObfuscatedName("je.o")
    public static int field3444;

    @ObfuscatedName("je.b")
    public static class256 field3445;

    @ObfuscatedName("jn.q")
    public static class256 field3455;

    @ObfuscatedName("i.fm")
    public static class323[] field346;

    @ObfuscatedName("jn.b")
    public static class256 field3469;

    @ObfuscatedName("i.jg")
    public static int field347;

    @ObfuscatedName("jn.lv")
    public static int field3470;

    @ObfuscatedName("jr.b")
    public static class256 field3477;

    @ObfuscatedName("jy.b")
    public static class256 field3482;

    @ObfuscatedName("i.ho")
    public static class237 field349;

    @ObfuscatedName("jh.b")
    public static class256 field3490;

    @ObfuscatedName("js.o")
    public static class256 field3498;

    @ObfuscatedName("js.q")
    public static class256 field3502;

    @ObfuscatedName("js.b")
    public static class256 field3516;

    @ObfuscatedName("jx.h")
    public static class256 field3572;

    @ObfuscatedName("jx.y")
    public static boolean field3573;

    @ObfuscatedName("jd.b")
    public static class256 field3634;

    @ObfuscatedName("jv.b")
    public static class256 field3666;

    @ObfuscatedName("jv.lk")
    public static class237[] field3669;

    @ObfuscatedName("ao.do")
    public static class258 field367;

    @ObfuscatedName("jo.q")
    public static class256 field3680;

    @ObfuscatedName("jo.b")
    public static class256 field3685;

    @ObfuscatedName("jo.o")
    public static class256 field3686;

    @ObfuscatedName("jw.d")
    public static class322 field3703;

    @ObfuscatedName("ao.n")
    public static int[] field371;

    @ObfuscatedName("kg.ea")
    public static class298 field3747;

    @ObfuscatedName("ki.w")
    public static class194 field3755;

    @ObfuscatedName("kz.c")
    public static class322[] field3782;

    @ObfuscatedName("kv.b")
    public static class186 field3787;

    @ObfuscatedName("kv.f")
    public static class48 field3789;

    @ObfuscatedName("ke.pr")
    public static int field3805;

    @ObfuscatedName("kl.l")
    public static class323 field3807;

    @ObfuscatedName("am.e")
    public static int[] field386;

    @ObfuscatedName("lt.g")
    public static byte[][][] field3874;

    @ObfuscatedName("ls.ao")
    public static int[] field3876;

    @ObfuscatedName("ls.aj")
    public static int field3877;

    @ObfuscatedName("aj.a")
    public static File field388;

    @ObfuscatedName("ls.am")
    public static int field3881;

    @ObfuscatedName("lp.y")
    public static int[] field3913;

    @ObfuscatedName("lp.q")
    public static int field3914;

    @ObfuscatedName("lp.g")
    public static byte[][] field3915;

    @ObfuscatedName("lp.o")
    public static int field3916;

    @ObfuscatedName("lp.b")
    public static int field3917;

    @ObfuscatedName("lg.ar")
    public static class320 field3926;

    @ObfuscatedName("ll.ae")
    public static client field3973;

    @ObfuscatedName("ah.er")
    public static int field401;

    @ObfuscatedName("ly.q")
    public static class263[] field4025;

    @ObfuscatedName("ah.bc")
    public static class322 field407;

    @ObfuscatedName("af.bk")
    public static String field408;

    @ObfuscatedName("af.bd")
    public static class69 field411;

    @ObfuscatedName("ai.ok")
    public static class107 field416;

    @ObfuscatedName("aq.aa")
    public static GarbageCollectorMXBean field431;

    @ObfuscatedName("aq.bu")
    public static class322[] field435;

    @ObfuscatedName("aq.pp")
    public static int field436;

    @ObfuscatedName("al.bp")
    public static class253 field457;

    @ObfuscatedName("al.u")
    public static class256 field458;

    @ObfuscatedName("al.fq")
    public static class323[] field459;

    @ObfuscatedName("as.dv")
    public static class258 field467;

    @ObfuscatedName("as.am")
    public static int[] field468;

    @ObfuscatedName("as.ao")
    public static int[] field472;

    @ObfuscatedName("az.fy")
    public static class323 field477;

    @ObfuscatedName("ad.gj")
    public static int field490;

    @ObfuscatedName("ar.fa")
    public static int[] field499;

    @ObfuscatedName("ar.du")
    public static String field500;

    @ObfuscatedName("ar.u")
    public static class322 field505;

    @ObfuscatedName("ar.y")
    public static ScheduledExecutorService field506;

    @ObfuscatedName("ag.bu")
    public static int field513;

    @ObfuscatedName("ag.cy")
    public static class165 field523;

    @ObfuscatedName("ac.c")
    public static int field525;

    @ObfuscatedName("ac.fl")
    public static int[] field532;

    @ObfuscatedName("at.bt")
    public static String field542;

    @ObfuscatedName("aa.eh")
    public static class147 field548;

    @ObfuscatedName("aa.r")
    public static class230 field551;

    @ObfuscatedName("ae.og")
    public static class100 field584;

    @ObfuscatedName("ae.fj")
    public static byte[][] field590;

    @ObfuscatedName("an.g")
    public static int field600;

    @ObfuscatedName("bx.q")
    public static class256 field602;

    @ObfuscatedName("bx.cp")
    public static class258 field604;

    @ObfuscatedName("bb.cf")
    public static class258 field605;

    @ObfuscatedName("bb.bk")
    public static class323[] field606;

    @ObfuscatedName("bb.hy")
    public static class123 field608;

    @ObfuscatedName("bp.aj")
    public static Font field614;

    @ObfuscatedName("bp.s")
    public static int[][][] field620;

    @ObfuscatedName("bi.l")
    public static int field625;

    @ObfuscatedName("bi.r")
    public static class172 field629;

    @ObfuscatedName("bi.b")
    public static class166 field636;

    @ObfuscatedName("bi.ak")
    public static Image field647;

    @ObfuscatedName("bi.d")
    public static class298 field658;

    @ObfuscatedName("br.ix")
    public static int field671;

    @ObfuscatedName("be.gy")
    public static int field683;

    @ObfuscatedName("be.lf")
    public static class94 field684;

    @ObfuscatedName("bk.r")
    public static int[] field685;

    @ObfuscatedName("bk.p")
    public static byte[][][] field688;

    @ObfuscatedName("bk.d")
    public static int[] field693;

    @ObfuscatedName("bt.v")
    public static int[] field701;

    @ObfuscatedName("bt.f")
    public static int field707;

    @ObfuscatedName("bt.ec")
    public static int field710;

    @ObfuscatedName("bu.cb")
    public static class258 field714;

    @ObfuscatedName("bu.en")
    public static class297 field715;

    @ObfuscatedName("bu.qf")
    public static class329 field718;

    @ObfuscatedName("bg.ln")
    public static int field722;

    @ObfuscatedName("bc.fu")
    public static int field735;

    @ObfuscatedName("bw.fv")
    public static class323[] field739;

    @ObfuscatedName("bw.bb")
    public static String field741;

    @ObfuscatedName("ba.de")
    public static int field756;

    @ObfuscatedName("bz.pc")
    public static int field760;

    @ObfuscatedName("bz.ku")
    public static int field762;

    @ObfuscatedName("bd.n")
    public static int[] field767;

    @ObfuscatedName("bd.fb")
    public static int field775;

    @ObfuscatedName("bd.ch")
    public static class258 field776;

    @ObfuscatedName("bn.nn")
    public static class313 field780;

    @ObfuscatedName("bm.u")
    public static int field814;

    @ObfuscatedName("bm.iu")
    public static class72 field818;

    @ObfuscatedName("q.k")
    public static int field9;

    @ObfuscatedName("fn.b(III)I")
    public static int method3063(int arg0, int arg1) {
        class65 var2 = (class65) class65.field720.method3674((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field723.length; var4++) {
                if (var2.field721[var4] == arg1) {
                    var3 += var2.field723[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("f.b(Lie;I)V")
    public static void method99(class256 arg0) {
        field3416 = arg0;
    }

    @ObfuscatedName("n.b(I)[Ln;")
    public static class25[] method183() {
        return new class25[] { class25.field337, class25.field327, class25.field326 };
    }

    @ObfuscatedName("ff.b([BI)Llm;")
    public static final class323 method3002(byte[] arg0) {
        Object var1 = null;
        try {
            BufferedImage var2 = ImageIO.read(new ByteArrayInputStream(arg0));
            int var3 = var2.getWidth();
            int var4 = var2.getHeight();
            int[] var5 = new int[var3 * var4];
            PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var3, var4, var5, 0, var3);
            var6.grabPixels();
            return new class323(var5, var3, var4);
        } catch (IOException var9) {
        } catch (InterruptedException var10) {
        }
        return new class323(0, 0);
    }

    @ObfuscatedName("by.q(II)Ljg;")
    public static class262 method1500(int arg0) {
        class262 var1 = (class262) class262.field3387.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3388.method4158(16, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4328(new class194(var2));
        }
        class262.field3387.method3659(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("dg.b(I)V")
    public static void method2387() {
        for (class80 var0 = (class80) class80.field1211.method3739(); var0 != null; var0 = (class80) class80.field1211.method3745()) {
            if (var0.field1215 != null) {
                var0.method1629();
            }
        }
    }

    @ObfuscatedName("iu.q(Lee;IB)V")
    public static final void method4138(class131 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1810; var2++) {
            if (arg0.field1870[var2] != -2) {
                int var3 = arg0.field1811[var2];
                int var4 = arg0.field1839[var2];
                int var5 = arg0.field1813[var2];
                int var6 = class131.field1843[var3];
                int var7 = class131.field1843[var4];
                int var8 = class131.field1843[var5];
                class8.method3139(class131.field1844[var3], class131.field1844[var4], class131.field1844[var5], var6, var7, var8, arg1);
            }
        }
    }

    @ObfuscatedName("w.p(Lie;III)Llm;")
    public static class323 method154(class256 arg0, int arg1, int arg2) {
        return class324.method4314(arg0, arg1, arg2) ? class324.method2472() : null;
    }

    @ObfuscatedName("el.a(IB)I")
    public static int method2830(int arg0) {
        class98 var1 = (class98) class95.field1399.get(arg0);
        return var1 == null ? 0 : var1.method1874();
    }

    @ObfuscatedName("dj.b(Lie;Lie;B)V")
    public static void method2102(class256 arg0, class256 arg1) {
        field3634 = arg0;
        field2122 = arg1;
    }

    @ObfuscatedName("ba.b(I)[Lfw;")
    public static class180[] method1040() {
        return new class180[] { class180.field2290, class180.field2257, class180.field2258, class180.field2259, class180.field2264, class180.field2261, class180.field2320, class180.field2301, class180.field2338, class180.field2318, class180.field2266, class180.field2267, class180.field2268, class180.field2269, class180.field2270, class180.field2280, class180.field2272, class180.field2273, class180.field2274, class180.field2291, class180.field2278, class180.field2277, class180.field2260, class180.field2279, class180.field2263, class180.field2281, class180.field2276, class180.field2283, class180.field2284, class180.field2285, class180.field2286, class180.field2287, class180.field2288, class180.field2289, class180.field2262, class180.field2271, class180.field2292, class180.field2293, class180.field2332, class180.field2295, class180.field2296, class180.field2297, class180.field2282, class180.field2299, class180.field2300, class180.field2334, class180.field2302, class180.field2303, class180.field2304, class180.field2330, class180.field2306, class180.field2307, class180.field2308, class180.field2309, class180.field2310, class180.field2311, class180.field2321, class180.field2313, class180.field2314, class180.field2315, class180.field2316, class180.field2317, class180.field2305, class180.field2323, class180.field2294, class180.field2298, class180.field2322, class180.field2335, class180.field2324, class180.field2325, class180.field2312, class180.field2327, class180.field2328, class180.field2329, class180.field2326, class180.field2331, class180.field2265, class180.field2333, class180.field2275, class180.field2319, class180.field2336 };
    }

    @ObfuscatedName("fq.u(I)[Llv;")
    public static class322[] method3124() {
        class322[] var0 = new class322[field3917];
        for (int var1 = 0; var1 < field3917; var1++) {
            class322 var2 = var0[var1] = new class322();
            var2.field3893 = field3914;
            var2.field3900 = field3916;
            var2.field3897 = field282[var1];
            var2.field3898 = field3313[var1];
            var2.field3895 = field29[var1];
            var2.field3896 = field1752[var1];
            var2.field3899 = field3913;
            var2.field3894 = field3915[var1];
        }
        class324.method2902();
        return var0;
    }

    @ObfuscatedName("fp.h(I)V")
    public static void method3083() {
        class266.field3433.method3661();
        class266.field3420.method3661();
    }

    @ObfuscatedName("fd.h(ZZI)I")
    public static int method3137(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += class259.field3361 + class259.field3358;
        }
        if (arg1) {
            var2 += class259.field3367 + class259.field3363;
        }
        return var2;
    }

    @ObfuscatedName("cg.p(I)V")
    public static void method1715() {
        if (class90.field1322 && class90.field1320 != null && class90.field1320.length() > 0) {
            class90.field1332 = 1;
        } else {
            class90.field1332 = 0;
        }
    }

    @ObfuscatedName("fr.k(ILca;ZI)I")
    public static int method2953(int arg0, class96 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = class81.field1220[--field1234];
            class81.field1220[++field1234 - 1] = client.field1073[var3].method93();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = class81.field1220[--field1234];
            class81.field1220[++field1234 - 1] = client.field1073[var4].field285;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = class81.field1220[--field1234];
            class81.field1220[++field1234 - 1] = client.field1073[var5].field292;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = class81.field1220[--field1234];
            class81.field1220[++field1234 - 1] = client.field1073[var6].field287;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = class81.field1220[--field1234];
            class81.field1220[++field1234 - 1] = client.field1073[var7].field288;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = class81.field1220[--field1234];
            class81.field1220[++field1234 - 1] = client.field1073[var8].field289;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = class81.field1220[--field1234];
            int var10 = client.field1073[var9].method92();
            class81.field1220[++field1234 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = class81.field1220[--field1234];
            int var12 = client.field1073[var11].method92();
            class81.field1220[++field1234 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = class81.field1220[--field1234];
            int var14 = client.field1073[var13].method92();
            class81.field1220[++field1234 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = class81.field1220[--field1234];
            int var16 = client.field1073[var15].method92();
            class81.field1220[++field1234 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = class81.field1220[--field1234] == 1;
            if (field10 != null) {
                field10.method63(class14.field264, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = class81.field1220[--field1234] == 1;
            if (field10 != null) {
                field10.method63(class14.field263, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            field1234 -= 2;
            boolean var19 = class81.field1220[field1234] == 1;
            boolean var20 = class81.field1220[field1234 + 1] == 1;
            if (field10 != null) {
                client.field861.field819 = var20;
                field10.method63(client.field861, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = class81.field1220[--field1234] == 1;
            if (field10 != null) {
                field10.method63(class14.field261, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = class81.field1220[--field1234] == 1;
            if (field10 != null) {
                field10.method63(class14.field262, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            class81.field1220[++field1234 - 1] = field10 == null ? 0 : field10.field266.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = class81.field1220[--field1234];
            class15 var24 = (class15) field10.field266.get(var23);
            class81.field1220[++field1234 - 1] = var24.field276;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = class81.field1220[--field1234];
            class15 var26 = (class15) field10.field266.get(var25);
            class81.field1231[++field525 - 1] = var26.method65();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = class81.field1220[--field1234];
            class15 var28 = (class15) field10.field266.get(var27);
            class81.field1231[++field525 - 1] = var28.method72();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = class81.field1220[--field1234];
            class15 var30 = (class15) field10.field266.get(var29);
            long var31 = class196.method3211() - field1 - var30.field270;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            class81.field1231[++field525 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = class81.field1220[--field1234];
            class15 var38 = (class15) field10.field266.get(var37);
            class81.field1220[++field1234 - 1] = var38.field272.field287;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = class81.field1220[--field1234];
            class15 var40 = (class15) field10.field266.get(var39);
            class81.field1220[++field1234 - 1] = var40.field272.field292;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = class81.field1220[--field1234];
            class15 var42 = (class15) field10.field266.get(var41);
            class81.field1220[++field1234 - 1] = var42.field272.field285;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("w.gz(IIIIZI)V")
    public static final void method150(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        if (var5 < 0) {
            var5 = 0;
        } else if (var5 > 100) {
            var5 = 100;
        }
        int var6 = (client.field948 - client.field1056) * var5 / 100 + client.field1056;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < client.field1062) {
            short var8 = client.field1062;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > client.field1061) {
                var6 = client.field1061;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class319.method5211();
                    class319.method5232(arg0, arg1, var10, arg3, -16777216);
                    class319.method5232(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > client.field1063) {
            short var11 = client.field1063;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < client.field1060) {
                var6 = client.field1060;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class319.method5211();
                    class319.method5232(arg0, arg1, arg2, var13, -16777216);
                    class319.method5232(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (client.field1059 - client.field900) * var5 / 100 + client.field900;
        client.field831 = arg3 * var6 * var14 / 85504 << 1;
        if (client.field1066 != arg2 || client.field1067 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class134.field1902[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class137.method2783(var15, 500, 800, arg2, arg3);
        }
        client.field1064 = arg0;
        client.field1065 = arg1;
        client.field1066 = arg2;
        client.field1067 = arg3;
    }

    @ObfuscatedName("jy.hr(I)V")
    public static void method4505() {
        client.field943 = 0;
        client.field942 = false;
    }

    @ObfuscatedName("ed.id([Lim;IIIIIIIII)V")
    public static final void method2591(class237[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class319.method5212(arg2, arg3, arg4, arg5);
        class134.method2594();
        label1070: for (int var9 = 0; var9 < arg0.length; var9++) {
            class237 var10 = arg0[var9];
            if (var10 != null && (var10.field2807 == arg1 || arg1 == -1412584499 && client.field977 == var10)) {
                int var11;
                if (arg8 == -1) {
                    client.field1013[client.field1008] = var10.field2791 + arg6;
                    client.field1030[client.field1008] = var10.field2792 + arg7;
                    client.field1002[client.field1008] = var10.field2793;
                    client.field1057[client.field1008] = var10.field2794;
                    var11 = ++client.field1008 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2893 = var11;
                var10.field2871 = client.field830;
                if (!var10.field2777 || !client.method3517(var10)) {
                    if (var10.field2782 > 0) {
                        client.method3930(var10);
                    }
                    int var12 = var10.field2791 + arg6;
                    int var13 = var10.field2792 + arg7;
                    int var14 = var10.field2894;
                    if (client.field977 == var10) {
                        if (arg1 != -1412584499 && !var10.field2856) {
                            field3669 = arg0;
                            field722 = arg6;
                            field3470 = arg7;
                            continue;
                        }
                        if (client.field988 && client.field979) {
                            int var15 = class60.field670;
                            int var16 = class60.field668;
                            int var17 = var15 - client.field1024;
                            int var18 = var16 - client.field915;
                            if (var17 < client.field983) {
                                var17 = client.field983;
                            }
                            if (var10.field2793 + var17 > client.field983 + client.field978.field2793) {
                                var17 = client.field983 + client.field978.field2793 - var10.field2793;
                            }
                            if (var18 < client.field1005) {
                                var18 = client.field1005;
                            }
                            if (var10.field2794 + var18 > client.field1005 + client.field978.field2794) {
                                var18 = client.field1005 + client.field978.field2794 - var10.field2794;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2856) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2902 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2902 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2793 + var12;
                        int var26 = var10.field2794 + var13;
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
                        int var29 = var10.field2793 + var12;
                        int var30 = var10.field2794 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2777 || var19 < var21 && var20 < var22) {
                        if (var10.field2782 != 0) {
                            if (var10.field2782 == 1336) {
                                if (client.field916) {
                                    var13 += 15;
                                    field3747.method5005("Fps:" + client.field632, var10.field2793 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && client.field826) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !client.field826) {
                                        var33 = 16711680;
                                    }
                                    field3747.method5005("Mem:" + var32 + "k", var10.field2793 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2782 == 1337) {
                                client.field953 = var12;
                                client.field954 = var13;
                                int var36 = var10.field2793;
                                int var37 = var10.field2794;
                                client.field869++;
                                if (field818.field1133 >> 7 == client.field1035 && field818.field1096 >> 7 == client.field940) {
                                    client.field1035 = 0;
                                }
                                if (client.field926) {
                                    client.method88(field818, false);
                                }
                                if (client.field973 >= 0 && client.field923[client.field973] != null) {
                                    client.method88(client.field923[client.field973], false);
                                }
                                client.method14(true);
                                int var38 = class93.field1372;
                                int[] var39 = class93.field1377;
                                for (int var40 = 0; var40 < var38; var40++) {
                                    if (client.field973 != var39[var40] && client.field924 != var39[var40]) {
                                        client.method88(client.field923[var39[var40]], true);
                                    }
                                }
                                client.method14(false);
                                client.method503();
                                for (class82 var41 = (class82) client.field937.method3739(); var41 != null; var41 = (class82) client.field937.method3745()) {
                                    if (field2735 != var41.field1240 || var41.field1244) {
                                        var41.method3726();
                                    } else if (client.field830 >= var41.field1237) {
                                        var41.method1696(client.field879);
                                        if (var41.field1244) {
                                            var41.method3726();
                                        } else {
                                            field2065.method2718(var41.field1240, var41.field1239, var41.field1238, var41.field1241, 60, var41, 0, -1, false);
                                        }
                                    }
                                }
                                method150(var12, var13, var36, var37, true);
                                int var42 = client.field1064;
                                int var43 = client.field1065;
                                int var44 = client.field1066;
                                int var45 = client.field1067;
                                class319.method5212(var42, var43, var42 + var44, var43 + var45);
                                class134.method2594();
                                if (!client.field984) {
                                    int var46 = client.field886;
                                    if (client.field895 / 256 > var46) {
                                        var46 = client.field895 / 256;
                                    }
                                    if (client.field1051[4] && client.field1053[4] + 128 > var46) {
                                        var46 = client.field1053[4] + 128;
                                    }
                                    int var47 = client.field887 & 0x7FF;
                                    int var48 = field2565;
                                    int var49 = client.method261(field818.field1133, field818.field1096, field2735) - client.field892;
                                    int var50 = field26;
                                    int var51 = var46 * 3 + 600;
                                    int var52 = 2048 - var46 & 0x7FF;
                                    int var53 = 2048 - var47 & 0x7FF;
                                    int var54 = 0;
                                    int var55 = 0;
                                    int var56 = var51;
                                    if (var52 != 0) {
                                        int var57 = class134.field1902[var52];
                                        int var58 = class134.field1917[var52];
                                        int var59 = var55 * var58 - var51 * var57 >> 16;
                                        var56 = var55 * var57 + var51 * var58 >> 16;
                                        var55 = var59;
                                    }
                                    if (var53 != 0) {
                                        int var60 = class134.field1902[var53];
                                        int var61 = class134.field1917[var53];
                                        int var62 = var54 * var61 + var56 * var60 >> 16;
                                        var56 = var56 * var61 - var54 * var60 >> 16;
                                        var54 = var62;
                                    }
                                    field490 = var48 - var54;
                                    field2124 = var49 - var55;
                                    field1155 = var50 - var56;
                                    field2047 = var46;
                                    field683 = var47;
                                }
                                int var63;
                                if (client.field984) {
                                    var63 = client.method3126();
                                } else {
                                    var63 = client.method1864();
                                }
                                int var64 = field490;
                                int var65 = field2124;
                                int var66 = field1155;
                                int var67 = field2047;
                                int var68 = field683;
                                for (int var69 = 0; var69 < 5; var69++) {
                                    if (client.field1051[var69]) {
                                        int var70 = (int) (Math.random() * (double) (client.field1052[var69] * 2 + 1) - (double) client.field1052[var69] + Math.sin((double) client.field890[var69] / 100.0D * (double) client.field1055[var69]) * (double) client.field1053[var69]);
                                        if (var69 == 0) {
                                            field490 += var70;
                                        }
                                        if (var69 == 1) {
                                            field2124 += var70;
                                        }
                                        if (var69 == 2) {
                                            field1155 += var70;
                                        }
                                        if (var69 == 3) {
                                            field683 = field683 + var70 & 0x7FF;
                                        }
                                        if (var69 == 4) {
                                            field2047 += var70;
                                            if (field2047 < 128) {
                                                field2047 = 128;
                                            }
                                            if (field2047 > 383) {
                                                field2047 = 383;
                                            }
                                        }
                                    }
                                }
                                int var71 = class60.field670;
                                int var72 = class60.field668;
                                if (class60.field673 != 0) {
                                    var71 = class60.field672;
                                    var72 = class60.field675;
                                }
                                if (var71 >= var42 && var71 < var42 + var44 && var72 >= var43 && var72 < var43 + var45) {
                                    class132.method1027(var71 - var42, var72 - var43);
                                } else {
                                    class132.field1872 = false;
                                    class132.field1878 = 0;
                                }
                                client.method604();
                                class319.method5232(var42, var43, var44, var45, 0);
                                client.method604();
                                int var73 = class134.field1898;
                                class134.field1898 = client.field831;
                                field2065.method2712(field490, field2124, field1155, field2047, field683, var63);
                                while (true) {
                                    class10 var74 = (class10) class8.field226.method3697();
                                    if (var74 == null) {
                                        class134.field1898 = var73;
                                        client.method604();
                                        field2065.method2779();
                                        client.field896 = 0;
                                        boolean var75 = false;
                                        int var76 = -1;
                                        int var77 = -1;
                                        int var78 = class93.field1372;
                                        int[] var79 = class93.field1377;
                                        for (int var80 = 0; var80 < client.field860 + var78; var80++) {
                                            class75 var81;
                                            if (var80 < var78) {
                                                var81 = client.field923[var79[var80]];
                                                if (client.field973 == var79[var80]) {
                                                    var75 = true;
                                                    var76 = var80;
                                                    continue;
                                                }
                                                if (field818 == var81) {
                                                    var77 = var80;
                                                    continue;
                                                }
                                            } else {
                                                var81 = client.field859[client.field840[var80 - var78]];
                                            }
                                            client.method1558(var81, var80, var42, var43, var44, var45);
                                        }
                                        if (client.field926) {
                                            client.method1558(field818, var77, var42, var43, var44, var45);
                                        }
                                        if (var75) {
                                            client.method1558(client.field923[client.field973], var76, var42, var43, var44, var45);
                                        }
                                        for (int var82 = 0; var82 < client.field896; var82++) {
                                            int var83 = client.field909[var82];
                                            int var84 = client.field899[var82];
                                            int var85 = client.field901[var82];
                                            int var86 = client.field1033[var82];
                                            boolean var87 = true;
                                            while (var87) {
                                                var87 = false;
                                                for (int var88 = 0; var88 < var82; var88++) {
                                                    if (var84 + 2 > client.field899[var88] - client.field1033[var88] && var84 - var86 < client.field899[var88] + 2 && var83 - var85 < client.field909[var88] + client.field901[var88] && var83 + var85 > client.field909[var88] - client.field901[var88] && client.field899[var88] - client.field1033[var88] < var84) {
                                                        var84 = client.field899[var88] - client.field1033[var88];
                                                        var87 = true;
                                                    }
                                                }
                                            }
                                            client.field974 = client.field909[var82];
                                            client.field955 = client.field899[var82] = var84;
                                            String var89 = client.field1014[var82];
                                            if (client.field966 == 0) {
                                                int var90 = 16776960;
                                                if (client.field902[var82] < 6) {
                                                    var90 = client.field1020[client.field902[var82]];
                                                }
                                                if (client.field902[var82] == 6) {
                                                    var90 = client.field869 % 20 < 10 ? 16711680 : 16776960;
                                                }
                                                if (client.field902[var82] == 7) {
                                                    var90 = client.field869 % 20 < 10 ? 255 : 65535;
                                                }
                                                if (client.field902[var82] == 8) {
                                                    var90 = client.field869 % 20 < 10 ? 45056 : 8454016;
                                                }
                                                if (client.field902[var82] == 9) {
                                                    int var91 = 150 - client.field904[var82];
                                                    if (var91 < 50) {
                                                        var90 = var91 * 1280 + 16711680;
                                                    } else if (var91 < 100) {
                                                        var90 = 16776960 - (var91 - 50) * 327680;
                                                    } else if (var91 < 150) {
                                                        var90 = (var91 - 100) * 5 + 65280;
                                                    }
                                                }
                                                if (client.field902[var82] == 10) {
                                                    int var92 = 150 - client.field904[var82];
                                                    if (var92 < 50) {
                                                        var90 = var92 * 5 + 16711680;
                                                    } else if (var92 < 100) {
                                                        var90 = 16711935 - (var92 - 50) * 327680;
                                                    } else if (var92 < 150) {
                                                        var90 = (var92 - 100) * 327680 + 255 - (var92 - 100) * 5;
                                                    }
                                                }
                                                if (client.field902[var82] == 11) {
                                                    int var93 = 150 - client.field904[var82];
                                                    if (var93 < 50) {
                                                        var90 = 16777215 - var93 * 327685;
                                                    } else if (var93 < 100) {
                                                        var90 = (var93 - 50) * 327685 + 65280;
                                                    } else if (var93 < 150) {
                                                        var90 = 16777215 - (var93 - 100) * 327680;
                                                    }
                                                }
                                                if (client.field903[var82] == 0) {
                                                    field2093.method5006(var89, client.field974 + var42, client.field955 + var43, var90, 0);
                                                }
                                                if (client.field903[var82] == 1) {
                                                    field2093.method5055(var89, client.field974 + var42, client.field955 + var43, var90, 0, client.field869);
                                                }
                                                if (client.field903[var82] == 2) {
                                                    field2093.method5009(var89, client.field974 + var42, client.field955 + var43, var90, 0, client.field869);
                                                }
                                                if (client.field903[var82] == 3) {
                                                    field2093.method4997(var89, client.field974 + var42, client.field955 + var43, var90, 0, client.field869, 150 - client.field904[var82]);
                                                }
                                                if (client.field903[var82] == 4) {
                                                    int var94 = (150 - client.field904[var82]) * (field2093.method5018(var89) + 100) / 150;
                                                    class319.method5213(client.field974 + var42 - 50, var43, client.field974 + var42 + 50, var43 + var45);
                                                    field2093.method5003(var89, client.field974 + var42 + 50 - var94, client.field955 + var43, var90, 0);
                                                    class319.method5212(var42, var43, var42 + var44, var43 + var45);
                                                }
                                                if (client.field903[var82] == 5) {
                                                    int var95 = 150 - client.field904[var82];
                                                    int var96 = 0;
                                                    if (var95 < 25) {
                                                        var96 = var95 - 25;
                                                    } else if (var95 > 125) {
                                                        var96 = var95 - 125;
                                                    }
                                                    class319.method5213(var42, client.field955 + var43 - field2093.field3771 - 1, var42 + var44, client.field955 + var43 + 5);
                                                    field2093.method5006(var89, client.field974 + var42, client.field955 + var43 + var96, var90, 0);
                                                    class319.method5212(var42, var43, var42 + var44, var43 + var45);
                                                }
                                            } else {
                                                field2093.method5006(var89, client.field974 + var42, client.field955 + var43, 16776960, 0);
                                            }
                                        }
                                        client.method4484(var42, var43);
                                        ((class123) field1913).method2369(client.field879);
                                        client.method55(var42, var43, var44, var45);
                                        field490 = var64;
                                        field2124 = var65;
                                        field1155 = var66;
                                        field2047 = var67;
                                        field683 = var68;
                                        if (client.field829 && method3137(true, false) == 0) {
                                            client.field829 = false;
                                        }
                                        if (client.field829) {
                                            class319.method5232(var42, var43, var44, var45, 0);
                                            client.method4068(class246.field3071, false);
                                        }
                                        client.field980[var10.field2893] = true;
                                        class319.method5212(arg2, arg3, arg4, arg5);
                                        continue label1070;
                                    }
                                    var74.method29();
                                }
                            }
                            if (var10.field2782 == 1338) {
                                client.method657(var10, var12, var13, var11);
                                class319.method5212(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2782 == 1339) {
                                method1797(var10, var12, var13, var11);
                                class319.method5212(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2782 == 1400) {
                                field251.method5513(var12, var13, var10.field2793, var10.field2794, client.field830);
                            }
                            if (var10.field2782 == 1401) {
                                field251.method5660(var12, var13, var10.field2793, var10.field2794);
                            }
                        }
                        if (var10.field2902 == 0) {
                            if (!var10.field2777 && client.method3517(var10) && field1390 != var10) {
                                continue;
                            }
                            if (!var10.field2777) {
                                if (var10.field2778 > var10.field2802 - var10.field2794) {
                                    var10.field2778 = var10.field2802 - var10.field2794;
                                }
                                if (var10.field2778 < 0) {
                                    var10.field2778 = 0;
                                }
                            }
                            method2591(arg0, var10.field2795, var19, var20, var21, var22, var12 - var10.field2799, var13 - var10.field2778, var11);
                            if (var10.field2863 != null) {
                                method2591(var10.field2863, var10.field2795, var19, var20, var21, var22, var12 - var10.field2799, var13 - var10.field2778, var11);
                            }
                            class67 var97 = (class67) client.field986.method3674((long) var10.field2795);
                            if (var97 != null) {
                                client.method4396(var97.field738, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class319.method5212(arg2, arg3, arg4, arg5);
                            class134.method2594();
                        }
                        if (client.field971 || client.field1032[var11] || client.field1027 > 1) {
                            if (var10.field2902 == 0 && !var10.field2777 && var10.field2802 > var10.field2794) {
                                int var98 = var10.field2793 + var12;
                                int var99 = var10.field2778;
                                int var100 = var10.field2794;
                                int var101 = var10.field2802;
                                field1648[0].method5316(var98, var13);
                                field1648[1].method5316(var98, var13 + var100 - 16);
                                class319.method5232(var98, var13 + 16, 16, var100 - 32, client.field958);
                                int var102 = (var100 - 32) * var100 / var101;
                                if (var102 < 8) {
                                    var102 = 8;
                                }
                                int var103 = (var100 - 32 - var102) * var99 / (var101 - var100);
                                class319.method5232(var98, var13 + 16 + var103, 16, var102, client.field881);
                                class319.method5231(var98, var13 + 16 + var103, var102, client.field1036);
                                class319.method5231(var98 + 1, var13 + 16 + var103, var102, client.field1036);
                                class319.method5229(var98, var13 + 16 + var103, 16, client.field1036);
                                class319.method5229(var98, var13 + 17 + var103, 16, client.field1036);
                                class319.method5231(var98 + 15, var13 + 16 + var103, var102, client.field882);
                                class319.method5231(var98 + 14, var13 + 17 + var103, var102 - 1, client.field882);
                                class319.method5229(var98, var13 + 15 + var103 + var102, 16, client.field882);
                                class319.method5229(var98 + 1, var13 + 14 + var103 + var102, 15, client.field882);
                            }
                            if (var10.field2902 != 1) {
                                if (var10.field2902 == 2) {
                                    int var104 = 0;
                                    for (int var105 = 0; var105 < var10.field2790; var105++) {
                                        for (int var106 = 0; var106 < var10.field2789; var106++) {
                                            int var107 = (var10.field2844 + 32) * var106 + var12;
                                            int var108 = (var10.field2845 + 32) * var105 + var13;
                                            if (var104 < 20) {
                                                var107 += var10.field2846[var104];
                                                var108 += var10.field2826[var104];
                                            }
                                            if (var10.field2896[var104] > 0) {
                                                boolean var109 = false;
                                                boolean var110 = false;
                                                int var111 = var10.field2896[var104] - 1;
                                                if (var107 + 32 > arg2 && var107 < arg4 && var108 + 32 > arg3 && var108 < arg5 || field349 == var10 && client.field935 == var104) {
                                                    class323 var112;
                                                    if (client.field836 == 1 && field2064 == var104 && field671 == var10.field2795) {
                                                        var112 = class277.method2881(var111, var10.field2891[var104], 2, 0, 2, false);
                                                    } else {
                                                        var112 = class277.method2881(var111, var10.field2891[var104], 1, 3153952, 2, false);
                                                    }
                                                    if (var112 == null) {
                                                        client.method1035(var10);
                                                    } else if (field349 == var10 && client.field935 == var104) {
                                                        int var113 = class60.field670 - client.field917;
                                                        int var114 = class60.field668 - client.field918;
                                                        if (var113 < 5 && var113 > -5) {
                                                            var113 = 0;
                                                        }
                                                        if (var114 < 5 && var114 > -5) {
                                                            var114 = 0;
                                                        }
                                                        if (client.field921 < 5) {
                                                            var113 = 0;
                                                            var114 = 0;
                                                        }
                                                        var112.method5332(var107 + var113, var108 + var114, 128);
                                                        if (arg1 != -1) {
                                                            class237 var115 = arg0[arg1 & 0xFFFF];
                                                            if (var108 + var114 < class319.field3878 && var115.field2778 > 0) {
                                                                int var116 = client.field879 * (class319.field3878 - var108 - var114) / 3;
                                                                if (var116 > client.field879 * 10) {
                                                                    var116 = client.field879 * 10;
                                                                }
                                                                if (var116 > var115.field2778) {
                                                                    var116 = var115.field2778;
                                                                }
                                                                var115.field2778 -= var116;
                                                                client.field918 += var116;
                                                                client.method1035(var115);
                                                            }
                                                            if (var108 + var114 + 32 > class319.field3879 && var115.field2778 < var115.field2802 - var115.field2794) {
                                                                int var117 = client.field879 * (var108 + var114 + 32 - class319.field3879) / 3;
                                                                if (var117 > client.field879 * 10) {
                                                                    var117 = client.field879 * 10;
                                                                }
                                                                if (var117 > var115.field2802 - var115.field2794 - var115.field2778) {
                                                                    var117 = var115.field2802 - var115.field2794 - var115.field2778;
                                                                }
                                                                var115.field2778 += var117;
                                                                client.field918 -= var117;
                                                                client.method1035(var115);
                                                            }
                                                        }
                                                    } else if (field299 == var10 && client.field1011 == var104) {
                                                        var112.method5332(var107, var108, 128);
                                                    } else {
                                                        var112.method5344(var107, var108);
                                                    }
                                                }
                                            } else if (var10.field2867 != null && var104 < 20) {
                                                class323 var118 = var10.method4079(var104);
                                                if (var118 != null) {
                                                    var118.method5344(var107, var108);
                                                } else if (class237.field2821) {
                                                    client.method1035(var10);
                                                }
                                            }
                                            var104++;
                                        }
                                    }
                                } else if (var10.field2902 == 3) {
                                    int var119;
                                    if (client.method2831(var10)) {
                                        var119 = var10.field2804;
                                        if (field1390 == var10 && var10.field2806 != 0) {
                                            var119 = var10.field2806;
                                        }
                                    } else {
                                        var119 = var10.field2803;
                                        if (field1390 == var10 && var10.field2897 != 0) {
                                            var119 = var10.field2897;
                                        }
                                    }
                                    if (var10.field2812) {
                                        switch(var10.field2808.field3891) {
                                            case 1:
                                                class319.method5221(var12, var13, var10.field2793, var10.field2794, var10.field2803, var10.field2804, 256 - (var10.field2894 & 0xFF), 256 - (var10.field2773 & 0xFF));
                                                break;
                                            case 2:
                                                class319.method5222(var12, var13, var10.field2793, var10.field2794, var10.field2803, var10.field2804, 256 - (var10.field2894 & 0xFF), 256 - (var10.field2773 & 0xFF));
                                                break;
                                            case 3:
                                                class319.method5223(var12, var13, var10.field2793, var10.field2794, var10.field2803, var10.field2804, 256 - (var10.field2894 & 0xFF), 256 - (var10.field2773 & 0xFF));
                                                break;
                                            case 4:
                                                class319.method5289(var12, var13, var10.field2793, var10.field2794, var10.field2803, var10.field2804, 256 - (var10.field2894 & 0xFF), 256 - (var10.field2773 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class319.method5232(var12, var13, var10.field2793, var10.field2794, var119);
                                                } else {
                                                    class319.method5219(var12, var13, var10.field2793, var10.field2794, var119, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class319.method5227(var12, var13, var10.field2793, var10.field2794, var119);
                                    } else {
                                        class319.method5228(var12, var13, var10.field2793, var10.field2794, var119, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2902 == 4) {
                                    class298 var120 = var10.method4078();
                                    if (var120 != null) {
                                        String var121 = var10.field2838;
                                        int var122;
                                        if (client.method2831(var10)) {
                                            var122 = var10.field2804;
                                            if (field1390 == var10 && var10.field2806 != 0) {
                                                var122 = var10.field2806;
                                            }
                                            if (var10.field2839.length() > 0) {
                                                var121 = var10.field2839;
                                            }
                                        } else {
                                            var122 = var10.field2803;
                                            if (field1390 == var10 && var10.field2897 != 0) {
                                                var122 = var10.field2897;
                                            }
                                        }
                                        if (var10.field2777 && var10.field2898 != -1) {
                                            class277 var123 = class277.method1730(var10.field2898);
                                            var121 = var123.field3579;
                                            if (var121 == null) {
                                                var121 = "null";
                                            }
                                            if ((var123.field3590 == 1 || var10.field2813 != 1) && var10.field2813 != -1) {
                                                String var124 = class86.method38(16748608) + var121 + class86.field1274 + " " + 'x';
                                                int var125 = var10.field2813;
                                                String var126 = Integer.toString(var125);
                                                for (int var127 = var126.length() - 3; var127 > 0; var127 -= 3) {
                                                    var126 = var126.substring(0, var127) + class86.field1268 + var126.substring(var127);
                                                }
                                                String var128;
                                                StringBuilder var10000;
                                                class246 var10001;
                                                if (var126.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class86.method38(65408)).append(var126.substring(0, var126.length() - 8));
                                                    var10001 = (class246) null;
                                                    var128 = var10000.append(class246.field3042).append(" ").append(class86.field1267).append(var126).append(class86.field1270).append(class86.field1274).toString();
                                                } else if (var126.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class86.method38(16777215)).append(var126.substring(0, var126.length() - 4));
                                                    var10001 = (class246) null;
                                                    var128 = var10000.append(class246.field3135).append(" ").append(class86.field1267).append(var126).append(class86.field1270).append(class86.field1274).toString();
                                                } else {
                                                    var128 = " " + class86.method38(16776960) + var126 + class86.field1274;
                                                }
                                                var121 = var124 + var128;
                                            }
                                        }
                                        if (client.field931 == var10) {
                                            class246 var204 = (class246) null;
                                            var121 = class246.field3052;
                                            var122 = var10.field2803;
                                        }
                                        if (!var10.field2777) {
                                            var121 = client.method656(var121, var10);
                                        }
                                        var120.method5007(var121, var12, var13, var10.field2793, var10.field2794, var122, var10.field2843 ? 0 : -1, var10.field2780, var10.field2848, var10.field2840);
                                    } else if (class237.field2821) {
                                        client.method1035(var10);
                                    }
                                } else if (var10.field2902 == 5) {
                                    if (var10.field2777) {
                                        class323 var130;
                                        if (var10.field2898 == -1) {
                                            var130 = var10.method4077(false);
                                        } else {
                                            var130 = class277.method2881(var10.field2898, var10.field2813, var10.field2817, var10.field2818, var10.field2859, false);
                                        }
                                        if (var130 != null) {
                                            int var131 = var130.field3906;
                                            int var132 = var130.field3903;
                                            if (var10.field2816) {
                                                class319.method5213(var12, var13, var10.field2793 + var12, var10.field2794 + var13);
                                                int var133 = (var10.field2793 + (var131 - 1)) / var131;
                                                int var134 = (var10.field2794 + (var132 - 1)) / var132;
                                                for (int var135 = 0; var135 < var133; var135++) {
                                                    for (int var136 = 0; var136 < var134; var136++) {
                                                        if (var10.field2815 != 0) {
                                                            var130.method5359(var131 / 2 + var131 * var135 + var12, var132 / 2 + var132 * var136 + var13, var10.field2815, 4096);
                                                        } else if (var14 == 0) {
                                                            var130.method5344(var131 * var135 + var12, var132 * var136 + var13);
                                                        } else {
                                                            var130.method5332(var131 * var135 + var12, var132 * var136 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class319.method5212(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var137 = var10.field2793 * 4096 / var131;
                                                if (var10.field2815 != 0) {
                                                    var130.method5359(var10.field2793 / 2 + var12, var10.field2794 / 2 + var13, var10.field2815, var137);
                                                } else if (var14 != 0) {
                                                    var130.method5351(var12, var13, var10.field2793, var10.field2794, 256 - (var14 & 0xFF));
                                                } else if (var10.field2793 == var131 && var10.field2794 == var132) {
                                                    var130.method5344(var12, var13);
                                                } else {
                                                    var130.method5396(var12, var13, var10.field2793, var10.field2794);
                                                }
                                            }
                                        } else if (class237.field2821) {
                                            client.method1035(var10);
                                        }
                                    } else {
                                        class323 var129 = var10.method4077(client.method2831(var10));
                                        if (var129 != null) {
                                            var129.method5344(var12, var13);
                                        } else if (class237.field2821) {
                                            client.method1035(var10);
                                        }
                                    }
                                } else if (var10.field2902 == 6) {
                                    boolean var138 = client.method2831(var10);
                                    int var139;
                                    if (var138) {
                                        var139 = var10.field2766;
                                    } else {
                                        var139 = var10.field2825;
                                    }
                                    class131 var140 = null;
                                    int var141 = 0;
                                    if (var10.field2898 != -1) {
                                        class277 var142 = class277.method1730(var10.field2898);
                                        if (var142 != null) {
                                            class277 var143 = var142.method4601(var10.field2813);
                                            var140 = var143.method4609(1);
                                            if (var140 == null) {
                                                client.method1035(var10);
                                            } else {
                                                var140.method2495();
                                                var141 = var140.field1996 / 2;
                                            }
                                        }
                                    } else if (var10.field2787 == 5) {
                                        if (var10.field2847 == 0) {
                                            var140 = client.field1069.method4050((class281) null, -1, (class281) null, -1);
                                        } else {
                                            var140 = field818.method1092();
                                        }
                                    } else if (var139 == -1) {
                                        var140 = var10.method4080((class281) null, -1, var138, field818.field781);
                                        if (var140 == null && class237.field2821) {
                                            client.method1035(var10);
                                        }
                                    } else {
                                        class281 var144 = class281.method2838(var139);
                                        var140 = var10.method4080(var144, var10.field2900, var138, field818.field781);
                                        if (var140 == null && class237.field2821) {
                                            client.method1035(var10);
                                        }
                                    }
                                    class134.method2623(var10.field2793 / 2 + var12, var10.field2794 / 2 + var13);
                                    int var145 = var10.field2832 * class134.field1902[var10.field2829] >> 16;
                                    int var146 = var10.field2832 * class134.field1917[var10.field2829] >> 16;
                                    if (var140 != null) {
                                        if (var10.field2777) {
                                            var140.method2495();
                                            if (var10.field2835) {
                                                var140.method2509(0, var10.field2830, var10.field2899, var10.field2829, var10.field2836, var10.field2796 + var141 + var145, var10.field2796 + var146, var10.field2832);
                                            } else {
                                                var140.method2519(0, var10.field2830, var10.field2899, var10.field2829, var10.field2836, var10.field2796 + var141 + var145, var10.field2796 + var146);
                                            }
                                        } else {
                                            var140.method2519(0, var10.field2830, 0, var10.field2829, 0, var145, var146);
                                        }
                                    }
                                    class134.method2651();
                                } else {
                                    if (var10.field2902 == 7) {
                                        class298 var147 = var10.method4078();
                                        if (var147 == null) {
                                            if (class237.field2821) {
                                                client.method1035(var10);
                                            }
                                            continue;
                                        }
                                        int var148 = 0;
                                        for (int var149 = 0; var149 < var10.field2790; var149++) {
                                            for (int var150 = 0; var150 < var10.field2789; var150++) {
                                                if (var10.field2896[var148] > 0) {
                                                    class277 var151 = class277.method1730(var10.field2896[var148] - 1);
                                                    String var152;
                                                    if (var151.field3590 != 1 && var10.field2891[var148] == 1) {
                                                        var152 = class86.method38(16748608) + var151.field3579 + class86.field1274;
                                                    } else {
                                                        String var153 = class86.method38(16748608) + var151.field3579 + class86.field1274 + " " + 'x';
                                                        int var154 = var10.field2891[var148];
                                                        String var155 = Integer.toString(var154);
                                                        for (int var156 = var155.length() - 3; var156 > 0; var156 -= 3) {
                                                            var155 = var155.substring(0, var156) + class86.field1268 + var155.substring(var156);
                                                        }
                                                        String var157;
                                                        if (var155.length() > 9) {
                                                            var157 = " " + class86.method38(65408) + var155.substring(0, var155.length() - 8) + class246.field3042 + " " + class86.field1267 + var155 + class86.field1270 + class86.field1274;
                                                        } else if (var155.length() > 6) {
                                                            var157 = " " + class86.method38(16777215) + var155.substring(0, var155.length() - 4) + class246.field3135 + " " + class86.field1267 + var155 + class86.field1270 + class86.field1274;
                                                        } else {
                                                            var157 = " " + class86.method38(16776960) + var155 + class86.field1274;
                                                        }
                                                        var152 = var153 + var157;
                                                    }
                                                    int var158 = (var10.field2844 + 115) * var150 + var12;
                                                    int var159 = (var10.field2845 + 12) * var149 + var13;
                                                    if (var10.field2780 == 0) {
                                                        var147.method5003(var152, var158, var159, var10.field2803, var10.field2843 ? 0 : -1);
                                                    } else if (var10.field2780 == 1) {
                                                        var147.method5006(var152, var10.field2793 / 2 + var158, var159, var10.field2803, var10.field2843 ? 0 : -1);
                                                    } else {
                                                        var147.method5005(var152, var10.field2793 + var158 - 1, var159, var10.field2803, var10.field2843 ? 0 : -1);
                                                    }
                                                }
                                                var148++;
                                            }
                                        }
                                    }
                                    if (var10.field2902 == 8 && field259 == var10 && client.field934 == client.field880) {
                                        int var160 = 0;
                                        int var161 = 0;
                                        class298 var162 = field3747;
                                        String var163 = var10.field2838;
                                        String var164 = client.method656(var163, var10);
                                        while (var164.length() > 0) {
                                            int var165 = var164.indexOf(class86.field1273);
                                            String var166;
                                            if (var165 == -1) {
                                                var166 = var164;
                                                var164 = "";
                                            } else {
                                                var166 = var164.substring(0, var165);
                                                var164 = var164.substring(var165 + 4);
                                            }
                                            int var167 = var162.method5018(var166);
                                            if (var167 > var160) {
                                                var160 = var167;
                                            }
                                            var161 += var162.field3771 + 1;
                                        }
                                        var160 += 6;
                                        var161 += 7;
                                        int var168 = var10.field2793 + var12 - 5 - var160;
                                        int var169 = var10.field2794 + var13 + 5;
                                        if (var168 < var12 + 5) {
                                            var168 = var12 + 5;
                                        }
                                        if (var160 + var168 > arg4) {
                                            var168 = arg4 - var160;
                                        }
                                        if (var161 + var169 > arg5) {
                                            var169 = arg5 - var161;
                                        }
                                        class319.method5232(var168, var169, var160, var161, 16777120);
                                        class319.method5227(var168, var169, var160, var161, 0);
                                        String var170 = var10.field2838;
                                        int var171 = var162.field3771 + var169 + 2;
                                        String var172 = client.method656(var170, var10);
                                        while (var172.length() > 0) {
                                            int var173 = var172.indexOf(class86.field1273);
                                            String var174;
                                            if (var173 == -1) {
                                                var174 = var172;
                                                var172 = "";
                                            } else {
                                                var174 = var172.substring(0, var173);
                                                var172 = var172.substring(var173 + 4);
                                            }
                                            var162.method5003(var174, var168 + 3, var171, 0, -1);
                                            var171 += var162.field3771 + 1;
                                        }
                                    }
                                    if (var10.field2902 == 9) {
                                        int var175;
                                        int var176;
                                        int var177;
                                        int var178;
                                        if (var10.field2890) {
                                            var175 = var12;
                                            var176 = var10.field2794 + var13;
                                            var177 = var10.field2793 + var12;
                                            var178 = var13;
                                        } else {
                                            var175 = var12;
                                            var176 = var13;
                                            var177 = var10.field2793 + var12;
                                            var178 = var10.field2794 + var13;
                                        }
                                        if (var10.field2904 == 1) {
                                            class319.method5233(var175, var176, var177, var178, var10.field2803);
                                        } else {
                                            int var181 = var10.field2803;
                                            int var182 = var10.field2904;
                                            int var183 = var177 - var175;
                                            int var184 = var178 - var176;
                                            int var185 = var183 >= 0 ? var183 : -var183;
                                            int var186 = var184 >= 0 ? var184 : -var184;
                                            int var187 = var185;
                                            if (var185 < var186) {
                                                var187 = var186;
                                            }
                                            if (var187 != 0) {
                                                int var188 = (var183 << 16) / var187;
                                                int var189 = (var184 << 16) / var187;
                                                if (var189 <= var188) {
                                                    var188 = -var188;
                                                } else {
                                                    var189 = -var189;
                                                }
                                                int var190 = var182 * var189 >> 17;
                                                int var191 = var182 * var189 + 1 >> 17;
                                                int var192 = var182 * var188 >> 17;
                                                int var193 = var182 * var188 + 1 >> 17;
                                                int var194 = var175 - class319.field3875;
                                                int var195 = var176 - class319.field3878;
                                                int var196 = var190 + var194;
                                                int var197 = var194 - var191;
                                                int var198 = var183 + var194 - var191;
                                                int var199 = var183 + var194 + var190;
                                                int var200 = var192 + var195;
                                                int var201 = var195 - var193;
                                                int var202 = var184 + var195 - var193;
                                                int var203 = var184 + var195 + var192;
                                                class134.method2601(var196, var197, var198);
                                                class134.method2604(var200, var201, var202, var196, var197, var198, var181);
                                                class134.method2601(var196, var198, var199);
                                                class134.method2604(var200, var202, var203, var196, var198, var199, var181);
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

    @ObfuscatedName("ba.jt([Lim;IB)V")
    public static final void method1041(class237[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class237 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2902 == 0) {
                    if (var3.field2863 != null) {
                        method1041(var3.field2863, arg1);
                    }
                    class67 var4 = (class67) client.field986.method3674((long) var3.field2795);
                    if (var4 != null) {
                        client.method2669(var4.field738, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2885 != null) {
                    class68 var5 = new class68();
                    var5.field749 = var3;
                    var5.field747 = var3.field2885;
                    class81.method3491(var5);
                }
                if (arg1 == 1 && var3.field2901 != null) {
                    if (var3.field2769 >= 0) {
                        class237 var6 = class237.method1884(var3.field2795);
                        if (var6 == null || var6.field2863 == null || var3.field2769 >= var6.field2863.length || var6.field2863[var3.field2769] != var3) {
                            continue;
                        }
                    }
                    class68 var7 = new class68();
                    var7.field749 = var3;
                    var7.field747 = var3.field2901;
                    class81.method3491(var7);
                }
            }
        }
    }

    @ObfuscatedName("cc.jr([Lim;II)V")
    public static final void method1731(class237[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class237 var3 = arg0[var2];
            if (var3 != null && var3.field2807 == arg1 && (!var3.field2777 || !client.method3517(var3))) {
                if (var3.field2902 == 0) {
                    if (!var3.field2777 && client.method3517(var3) && field1390 != var3) {
                        continue;
                    }
                    method1731(arg0, var3.field2795);
                    if (var3.field2863 != null) {
                        method1731(var3.field2863, var3.field2795);
                    }
                    class67 var4 = (class67) client.field986.method3674((long) var3.field2795);
                    if (var4 != null) {
                        client.method2832(var4.field738);
                    }
                }
                if (var3.field2902 == 6) {
                    if (var3.field2825 != -1 || var3.field2766 != -1) {
                        boolean var5 = client.method2831(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2766;
                        } else {
                            var6 = var3.field2825;
                        }
                        if (var6 != -1) {
                            class281 var7 = class281.method2838(var6);
                            var3.field2801 += client.field879;
                            while (var3.field2801 > var7.field3693[var3.field2900]) {
                                var3.field2801 -= var7.field3693[var3.field2900];
                                var3.field2900++;
                                if (var3.field2900 >= var7.field3684.length) {
                                    var3.field2900 -= var7.field3688;
                                    if (var3.field2900 < 0 || var3.field2900 >= var7.field3684.length) {
                                        var3.field2900 = 0;
                                    }
                                }
                                client.method1035(var3);
                            }
                        }
                    }
                    if (var3.field2834 != 0 && !var3.field2777) {
                        int var8 = var3.field2834 >> 16;
                        int var9 = var3.field2834 << 16 >> 16;
                        int var10 = client.field879 * var8;
                        int var11 = client.field879 * var9;
                        var3.field2829 = var3.field2829 + var10 & 0x7FF;
                        var3.field2830 = var3.field2830 + var11 & 0x7FF;
                        client.method1035(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ct.jd(Lim;IIII)V")
    public static final void method1797(class237 arg0, int arg1, int arg2, int arg3) {
        class231 var4 = arg0.method4081(false);
        if (var4 == null) {
            return;
        }
        if (client.field835 < 3) {
            field294.method5354(arg1, arg2, var4.field2733, var4.field2731, 25, 25, client.field887, 256, var4.field2734, var4.field2732);
        } else {
            class319.method5235(arg1, arg2, 0, var4.field2734, var4.field2732);
        }
    }

    @ObfuscatedName("z.jo(IIIILlm;Lhq;B)V")
    public static final void method161(int arg0, int arg1, int arg2, int arg3, class323 arg4, class231 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = client.field887 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class134.field1902[var6];
        int var9 = class134.field1917[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5353(arg5.field2733 / 2 + var10 - arg4.field3906 / 2, arg5.field2731 / 2 - var11 - arg4.field3903 / 2, arg0, arg1, arg5.field2733, arg5.field2731, arg5.field2734, arg5.field2732);
        } else {
            arg4.method5344(arg5.field2733 / 2 + arg0 + var10 - arg4.field3906 / 2, arg5.field2731 / 2 + arg1 - var11 - arg4.field3903 / 2);
        }
    }

    @ObfuscatedName("p.jw(I)V")
    public static final void method4() {
        client.field998 = client.field989;
    }
}
