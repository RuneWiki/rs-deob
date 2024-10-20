package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("bk.z")
    public static int field1000;

    @ObfuscatedName("bk.o")
    public static float[] field1001;

    @ObfuscatedName("bk.m")
    public static float[] field1002;

    @ObfuscatedName("bk.y")
    public static float[] field1003;

    @ObfuscatedName("bk.am")
    public static float[] field1004;

    @ObfuscatedName("bk.s")
    public static class65[] field1006;

    @ObfuscatedName("bk.az")
    public static int[] field1007;

    @ObfuscatedName("bk.ao")
    public static int[] field1008;

    @ObfuscatedName("bk.f")
    public static float[] field1011;

    @ObfuscatedName("bw.w")
    public static boolean[] field1021;

    @ObfuscatedName("bw.v")
    public static int[] field1026;

    @ObfuscatedName("bw.g")
    public static int[] field1027;

    @ObfuscatedName("bi.p")
    public static class60 field1031;

    @ObfuscatedName("bi.d")
    public static int field1033;

    @ObfuscatedName("bi.c")
    public static boolean field1048;

    @ObfuscatedName("g.j")
    public static int field107;

    @ObfuscatedName("bf.a")
    public static int[] field1073;

    @ObfuscatedName("bb.qz")
    public static Canvas field1090;

    @ObfuscatedName("bp.z")
    public static float field1118;

    @ObfuscatedName("bp.l")
    public static int field1119;

    @ObfuscatedName("g.bz")
    public static int field112;

    @ObfuscatedName("bg.ik")
    public static int field1172;

    @ObfuscatedName("ba.bk")
    public static class187 field1174;

    @ObfuscatedName("ba.qv")
    public static int field1175;

    @ObfuscatedName("w.kp")
    public static class172[] field118;

    @ObfuscatedName("bn.ch")
    public static class208 field1193;

    @ObfuscatedName("bz.l")
    public static int[][] field1200;

    @ObfuscatedName("bz.ef")
    public static class229 field1205;

    @ObfuscatedName("r.fh")
    public static int field121;

    @ObfuscatedName("cx.eb")
    public static class227[] field1285;

    @ObfuscatedName("cx.qt")
    public static int field1286;

    @ObfuscatedName("cb.k")
    public static int[] field1305;

    @ObfuscatedName("r.qk")
    public static int field131;

    @ObfuscatedName("cf.bu")
    public static int field1397;

    @ObfuscatedName("cf.br")
    public static int field1398;

    @ObfuscatedName("cf.bk")
    public static int field1399;

    @ObfuscatedName("cj.ez")
    public static class229[] field1415;

    @ObfuscatedName("s.fg")
    public static int field142;

    @ObfuscatedName("cu.k")
    public static int field1420;

    @ObfuscatedName("cu.w")
    public static int field1421;

    @ObfuscatedName("cu.j")
    public static int field1425;

    @ObfuscatedName("cu.g")
    public static int field1428;

    @ObfuscatedName("s.ii")
    public static class172 field143;

    @ObfuscatedName("cu.r")
    public static int field1430;

    @ObfuscatedName("cu.s")
    public static int field1431;

    @ObfuscatedName("cu.e")
    public static int field1433;

    @ObfuscatedName("cu.i")
    public static int field1435;

    @ObfuscatedName("cu.h")
    public static class94 field1438;

    @ObfuscatedName("s.l")
    public static class227[] field144;

    @ObfuscatedName("cz.my")
    public static int field1452;

    @ObfuscatedName("s.w")
    public static class166 field146;

    @ObfuscatedName("ct.v")
    public static int[] field1460;

    @ObfuscatedName("s.fa")
    public static int field147;

    @ObfuscatedName("cq.az")
    public static int field1476;

    @ObfuscatedName("cq.y")
    public static int field1478;

    @ObfuscatedName("cq.j")
    public static int field1479;

    @ObfuscatedName("cq.i")
    public static int field1480;

    @ObfuscatedName("cq.a")
    public static int field1481;

    @ObfuscatedName("cq.x")
    public static int field1482;

    @ObfuscatedName("cq.b")
    public static int field1484;

    @ObfuscatedName("cq.o")
    public static int field1486;

    @ObfuscatedName("cq.m")
    public static int field1487;

    @ObfuscatedName("cq.h")
    public static int field1488;

    @ObfuscatedName("cq.am")
    public static int field1489;

    @ObfuscatedName("cq.ax")
    public static int field1490;

    @ObfuscatedName("cq.ac")
    public static int field1492;

    @ObfuscatedName("cq.f")
    public static int field1500;

    @ObfuscatedName("cq.bw")
    public static boolean[][] field1519;

    @ObfuscatedName("cq.bi")
    public static int field1520;

    @ObfuscatedName("cq.bl")
    public static int field1521;

    @ObfuscatedName("cq.by")
    public static int field1522;

    @ObfuscatedName("cq.bv")
    public static int field1523;

    @ObfuscatedName("cq.bf")
    public static int field1524;

    @ObfuscatedName("cq.be")
    public static int field1525;

    @ObfuscatedName("cs.qq")
    public static class225 field1527;

    @ObfuscatedName("cl.bi")
    public static class187 field1534;

    @ObfuscatedName("cl.cw")
    public static class208 field1543;

    @ObfuscatedName("cl.v")
    public static int field1544;

    @ObfuscatedName("cn.h")
    public static String field1554;

    @ObfuscatedName("cn.nu")
    public static int field1555;

    @ObfuscatedName("k.u")
    public static short[] field156;

    @ObfuscatedName("cr.qy")
    public static int field1564;

    @ObfuscatedName("cr.as")
    public static String field1565;

    @ObfuscatedName("k.ai")
    public static class103 field157;

    @ObfuscatedName("k.lv")
    public static class221 field158;

    @ObfuscatedName("cr.m")
    public static int[] field1581;

    @ObfuscatedName("cc.bm")
    public static class187 field1585;

    @ObfuscatedName("ci.na")
    public static int field1598;

    @ObfuscatedName("k.cq")
    public static class111 field161;

    @ObfuscatedName("co.gi")
    public static class172 field1628;

    @ObfuscatedName("cp.kr")
    public static int field1639;

    @ObfuscatedName("cd.d")
    public static Applet field1640;

    @ObfuscatedName("cd.n")
    public static int field1642;

    @ObfuscatedName("cd.c")
    public static String field1649;

    @ObfuscatedName("e.g")
    public static boolean field165;

    @ObfuscatedName("ch.d")
    public static String field1660;

    @ObfuscatedName("ch.c")
    public static String field1669;

    @ObfuscatedName("dg.t")
    public static File field1677;

    @ObfuscatedName("dg.p")
    public static int field1678;

    @ObfuscatedName("dg.j")
    public static String[] field1679;

    @ObfuscatedName("dg.k")
    public static class73[] field1684;

    @ObfuscatedName("dg.q")
    public static File field1685;

    @ObfuscatedName("dt.pf")
    public static int field1692;

    @ObfuscatedName("c.fv")
    public static int field17;

    @ObfuscatedName("dk.be")
    public static class187 field1715;

    @ObfuscatedName("dk.ec")
    public static class229[] field1720;

    @ObfuscatedName("do.dl")
    public static int field1726;

    @ObfuscatedName("do.ed")
    public static class229[] field1727;

    @ObfuscatedName("do.qh")
    public static int field1728;

    @ObfuscatedName("do.p")
    public static class181 field1729;

    @ObfuscatedName("do.r")
    public static boolean field1730;

    @ObfuscatedName("do.rl")
    public static String field1731;

    @ObfuscatedName("do.fd")
    public static int field1733;

    @ObfuscatedName("dy.bu")
    public static class227[] field1736;

    @ObfuscatedName("dy.bn")
    public static int field1737;

    @ObfuscatedName("dx.ba")
    public static int field1748;

    @ObfuscatedName("dq.dv")
    public static byte[][] field1760;

    @ObfuscatedName("dp.z")
    public static short[][] field1762;

    @ObfuscatedName("j.e")
    public static int field177;

    @ObfuscatedName("df.dk")
    public static int field1776;

    @ObfuscatedName("j.bb")
    public static class187 field178;

    @ObfuscatedName("df.cz")
    public static long field1785;

    @ObfuscatedName("dw.nm")
    public static class52 field1792;

    @ObfuscatedName("dw.l")
    public static short[] field1795;

    @ObfuscatedName("c.hw")
    public static int field18;

    @ObfuscatedName("i.rb")
    public static Image field184;

    @ObfuscatedName("di.br")
    public static class227[] field1841;

    @ObfuscatedName("di.p")
    public static int field1843;

    @ObfuscatedName("di.t")
    public static int field1845;

    @ObfuscatedName("di.nk")
    public static class66 field1849;

    @ObfuscatedName("di.di")
    public static int[][] field1852;

    @ObfuscatedName("di.po")
    public static int field1854;

    @ObfuscatedName("da.t")
    public static byte[][][] field1859;

    @ObfuscatedName("dv.c")
    public static File field1867;

    @ObfuscatedName("dc.bf")
    public static FontMetrics field1879;

    @ObfuscatedName("de.ct")
    public static class103 field1885;

    @ObfuscatedName("de.ah")
    public static class187 field1886;

    @ObfuscatedName("de.kn")
    public static int field1887;

    @ObfuscatedName("de.ab")
    public static int field1889;

    @ObfuscatedName("dm.u")
    public static byte[][][] field1901;

    @ObfuscatedName("dz.t")
    public static class227[] field1910;

    @ObfuscatedName("a.bg")
    public static int field195;

    @ObfuscatedName("dd.m")
    public static int[] field1951;

    @ObfuscatedName("dd.ev")
    public static class227[] field1953;

    @ObfuscatedName("du.ot")
    public static int field1962;

    @ObfuscatedName("du.qc")
    public static Font field1963;

    @ObfuscatedName("eg.nj")
    public static int field1970;

    @ObfuscatedName("en.d")
    public static long field1973;

    @ObfuscatedName("en.c")
    public static long field1974;

    @ObfuscatedName("en.os")
    public static int field1975;

    @ObfuscatedName("em.v")
    public static class27 field1979;

    @ObfuscatedName("em.cs")
    public static class111 field1980;

    @ObfuscatedName("eh.ax")
    public static int[] field1984;

    @ObfuscatedName("eh.d")
    public static class172[][] field1985;

    @ObfuscatedName("ee.u")
    public static int field1990;

    @ObfuscatedName("d.aw")
    public static class103 field2;

    @ObfuscatedName("a.bo")
    public static class187 field200;

    @ObfuscatedName("er.md")
    public static class229 field2001;

    @ObfuscatedName("el.r")
    public static int[] field2006;

    @ObfuscatedName("fv.c")
    public static class185 field2065;

    @ObfuscatedName("fv.q")
    public static class161 field2067;

    @ObfuscatedName("fv.p")
    public static class185 field2068;

    @ObfuscatedName("fv.d")
    public static class185 field2069;

    @ObfuscatedName("fv.l")
    public static int field2070;

    @ObfuscatedName("fv.n")
    public static class185 field2071;

    @ObfuscatedName("fv.jd")
    public static int field2072;

    @ObfuscatedName("x.qu")
    public static int field211;

    @ObfuscatedName("fi.dh")
    public static int[] field2154;

    @ObfuscatedName("fi.k")
    public static int[][][] field2161;

    @ObfuscatedName("h.f")
    public static String field217;

    @ObfuscatedName("fp.ew")
    public static class229[] field2182;

    @ObfuscatedName("fp.v")
    public static short[][] field2184;

    @ObfuscatedName("fc.n")
    public static class185 field2198;

    @ObfuscatedName("fc.q")
    public static class185 field2199;

    @ObfuscatedName("fc.p")
    public static class185 field2200;

    @ObfuscatedName("fc.c")
    public static boolean[] field2202;

    @ObfuscatedName("h.qg")
    public static int field222;

    @ObfuscatedName("fc.t")
    public static class185 field2252;

    @ObfuscatedName("b.hr")
    public static int field229;

    @ObfuscatedName("f.hb")
    public static class24 field233;

    @ObfuscatedName("f.fs")
    public static int field234;

    @ObfuscatedName("fb.dc")
    public static class88 field2347;

    @ObfuscatedName("fn.q")
    public static byte[][][] field2353;

    @ObfuscatedName("o.mn")
    public static byte field243;

    @ObfuscatedName("n.am")
    public static int[] field25;

    @ObfuscatedName("o.hu")
    public static int field262;

    @ObfuscatedName("o.il")
    public static int field265;

    @ObfuscatedName("fo.cs")
    public static int field2653;

    @ObfuscatedName("o.pn")
    public static GarbageCollectorMXBean field267;

    @ObfuscatedName("fy.f")
    public static class21 field2679;

    @ObfuscatedName("fy.dy")
    public static int field2681;

    @ObfuscatedName("q.qb")
    public static Frame field27;

    @ObfuscatedName("m.iy")
    public static int field270;

    @ObfuscatedName("gj.iz")
    public static int field2702;

    @ObfuscatedName("ge.b")
    public static int[] field2707;

    @ObfuscatedName("gd.qe")
    public static int field2727;

    @ObfuscatedName("m.ds")
    public static int[] field273;

    @ObfuscatedName("gk.p")
    public static Thread field2732;

    @ObfuscatedName("m.ky")
    public static class47 field274;

    @ObfuscatedName("gf.pe")
    public static class2 field2746;

    @ObfuscatedName("gh.e")
    public static class130 field2752;

    @ObfuscatedName("gh.n")
    public static long field2754;

    @ObfuscatedName("gh.d")
    public static class111 field2760;

    @ObfuscatedName("gh.qa")
    public static int field2761;

    @ObfuscatedName("gt.z")
    public static class182 field2779;

    @ObfuscatedName("gt.d")
    public static class185 field2782;

    @ObfuscatedName("gm.c")
    public static int field2784;

    @ObfuscatedName("gm.d")
    public static class185 field2787;

    @ObfuscatedName("gm.u")
    public static class185 field2788;

    @ObfuscatedName("gl.d")
    public static class185 field2790;

    @ObfuscatedName("gl.z")
    public static int field2792;

    @ObfuscatedName("gl.i")
    public static String[] field2793;

    @ObfuscatedName("gr.d")
    public static class185 field2798;

    @ObfuscatedName("client.c")
    public static client field280;

    @ObfuscatedName("gw.d")
    public static class185 field2800;

    @ObfuscatedName("gw.c")
    public static class185 field2801;

    @ObfuscatedName("gn.d")
    public static class185 field2821;

    @ObfuscatedName("gn.km")
    public static class113 field2829;

    @ObfuscatedName("gv.rk")
    public static boolean field2832;

    @ObfuscatedName("gv.n")
    public static int field2841;

    @ObfuscatedName("gv.c")
    public static class185 field2845;

    @ObfuscatedName("gv.bv")
    public static class187 field2846;

    @ObfuscatedName("gz.c")
    public static class185 field2848;

    @ObfuscatedName("gz.d")
    public static class185 field2853;

    @ObfuscatedName("gi.t")
    public static int field2863;

    @ObfuscatedName("gi.at")
    public static long field2865;

    @ObfuscatedName("gp.d")
    public static class185 field2867;

    @ObfuscatedName("gq.d")
    public static class185 field2873;

    @ObfuscatedName("gc.q")
    public static int[] field2878;

    @ObfuscatedName("client.k")
    public static String field288;

    @ObfuscatedName("gc.s")
    public static class184 field2882;

    @ObfuscatedName("gc.br")
    public static class187 field2883;

    @ObfuscatedName("gc.d")
    public static class185 field2884;

    @ObfuscatedName("gs.s")
    public static class172 field2895;

    @ObfuscatedName("gb.n")
    public static class185 field2898;

    @ObfuscatedName("q.pb")
    public static Clipboard field29;

    @ObfuscatedName("gb.ho")
    public static int field2915;

    @ObfuscatedName("gb.c")
    public static class185 field2919;

    @ObfuscatedName("gb.d")
    public static class185 field2921;

    @ObfuscatedName("gy.n")
    public static class185 field2926;

    @ObfuscatedName("client.mx")
    public static class25[] field295;

    @ObfuscatedName("gy.c")
    public static class185 field2968;

    @ObfuscatedName("gu.p")
    public static class185 field2980;

    @ObfuscatedName("gu.z")
    public static boolean field2981;

    @ObfuscatedName("gu.l")
    public static int field2982;

    @ObfuscatedName("gu.r")
    public static class208 field3006;

    @ObfuscatedName("gx.c")
    public static class185 field3035;

    @ObfuscatedName("gx.d")
    public static class185 field3039;

    @ObfuscatedName("ga.d")
    public static class185 field3082;

    @ObfuscatedName("gg.c")
    public static class185 field3086;

    @ObfuscatedName("gg.n")
    public static class185 field3087;

    @ObfuscatedName("gg.d")
    public static class185 field3099;

    @ObfuscatedName("hp.v")
    public static class227[] field3106;

    @ObfuscatedName("hg.d")
    public static class122 field3128;

    @ObfuscatedName("client.by")
    public static class187 field313;

    @ObfuscatedName("ha.au")
    public static class187 field3151;

    @ObfuscatedName("ht.bl")
    public static class187 field3153;

    @ObfuscatedName("hh.da")
    public static byte[][] field3157;

    @ObfuscatedName("hh.dr")
    public static int field3158;

    @ObfuscatedName("hj.q")
    public static ScheduledExecutorService field3198;

    @ObfuscatedName("hc.am")
    public static int field3210;

    @ObfuscatedName("hc.ax")
    public static int field3211;

    @ObfuscatedName("hc.y")
    public static int[] field3213;

    @ObfuscatedName("hw.z")
    public static int[] field3250;

    @ObfuscatedName("hw.d")
    public static int field3251;

    @ObfuscatedName("hw.n")
    public static int field3252;

    @ObfuscatedName("hw.t")
    public static int[] field3253;

    @ObfuscatedName("hw.l")
    public static byte[][] field3254;

    @ObfuscatedName("hw.p")
    public static int[] field3255;

    @ObfuscatedName("hw.c")
    public static int field3256;

    @ObfuscatedName("q.r")
    public static class62 field33;

    @ObfuscatedName("client.mj")
    public static byte field333;

    @ObfuscatedName("client.ad")
    public static class111 field340;

    @ObfuscatedName("q.b")
    public static String field35;

    @ObfuscatedName("q.x")
    public static class130 field36;

    @ObfuscatedName("client.ep")
    public static class229 field360;

    @ObfuscatedName("q.nv")
    public static int field37;

    @ObfuscatedName("client.ib")
    public static class39 field488;

    @ObfuscatedName("p.pv")
    public static class235 field50;

    @ObfuscatedName("p.ey")
    public static class229[] field51;

    @ObfuscatedName("client.go")
    public static int field533;

    @ObfuscatedName("u.ns")
    public static class58 field57;

    @ObfuscatedName("client.ap")
    public static class229[] field570;

    @ObfuscatedName("y.cq")
    public static char field572;

    @ObfuscatedName("u.d")
    public static class185 field58;

    @ObfuscatedName("am.pl")
    public static short[] field590;

    @ObfuscatedName("z.nt")
    public static int field61;

    @ObfuscatedName("ax.do")
    public static int field620;

    @ObfuscatedName("z.ng")
    public static int field64;

    @ObfuscatedName("ax.dj")
    public static int[] field642;

    @ObfuscatedName("z.s")
    public static String field65;

    @ObfuscatedName("ax.pq")
    public static class31 field657;

    @ObfuscatedName("ac.ag")
    public static boolean field663;

    @ObfuscatedName("az.t")
    public static class30[] field673;

    @ObfuscatedName("ak.x")
    public static int[] field698;

    @ObfuscatedName("l.nc")
    public static class58 field71;

    @ObfuscatedName("aa.z")
    public static int field716;

    @ObfuscatedName("aa.q")
    public static String[] field718;

    @ObfuscatedName("aa.n")
    public static int[] field719;

    @ObfuscatedName("aa.v")
    public static int field722;

    @ObfuscatedName("aa.y")
    public static int[] field730;

    @ObfuscatedName("aa.gn")
    public static class172 field733;

    @ObfuscatedName("aj.au")
    public static class227[] field745;

    @ObfuscatedName("aj.ap")
    public static class187 field748;

    @ObfuscatedName("ay.d")
    public static class185 field754;

    @ObfuscatedName("ae.l")
    public static class233 field758;

    @ObfuscatedName("ae.kg")
    public static int field761;

    @ObfuscatedName("aq.cd")
    public static class208 field767;

    @ObfuscatedName("aq.u")
    public static int[] field773;

    @ObfuscatedName("l.bu")
    public static class187 field79;

    @ObfuscatedName("ag.v")
    public static class227 field798;

    @ObfuscatedName("l.fc")
    public static int field80;

    @ObfuscatedName("ag.dz")
    public static int field803;

    @ObfuscatedName("af.ek")
    public static class227[] field805;

    @ObfuscatedName("ar.h")
    public static int[] field812;

    @ObfuscatedName("ar.n")
    public static class227 field814;

    @ObfuscatedName("ar.q")
    public static class227 field815;

    @ObfuscatedName("ar.p")
    public static class229 field816;

    @ObfuscatedName("ar.u")
    public static class229 field817;

    @ObfuscatedName("ar.g")
    public static class227 field832;

    @ObfuscatedName("ar.d")
    public static boolean field837;

    @ObfuscatedName("v.gp")
    public static class172 field84;

    @ObfuscatedName("ar.z")
    public static class227 field845;

    @ObfuscatedName("v.bx")
    public static class187 field85;

    @ObfuscatedName("ab.py")
    public static long field873;

    @ObfuscatedName("ai.z")
    public static byte[][][] field883;

    @ObfuscatedName("ai.oq")
    public static int field885;

    @ObfuscatedName("ad.pi")
    public static class104 field897;

    @ObfuscatedName("ad.bw")
    public static class187 field904;

    @ObfuscatedName("an.qm")
    public static class110 field917;

    @ObfuscatedName("g.s")
    public static int[] field92;

    @ObfuscatedName("an.pc")
    public static class117 field920;

    @ObfuscatedName("an.in")
    public static class172 field921;

    @ObfuscatedName("al.bk")
    public static class227 field929;

    @ObfuscatedName("at.ea")
    public static class229[] field939;

    @ObfuscatedName("at.bq")
    public static String field941;

    @ObfuscatedName("at.r")
    public static class172 field943;

    @ObfuscatedName("g.p")
    public static byte[][][] field95;

    @ObfuscatedName("ah.ej")
    public static class229[] field957;

    @ObfuscatedName("g.oj")
    public static int field96;

    @ObfuscatedName("g.w")
    public static int[] field97;

    @ObfuscatedName("bk.k")
    public static class70[] field978;

    @ObfuscatedName("g.e")
    public static int field98;

    @ObfuscatedName("bk.ac")
    public static float[] field981;

    @ObfuscatedName("bk.u")
    public static byte[] field984;

    @ObfuscatedName("bk.l")
    public static int field986;

    @ObfuscatedName("bk.v")
    public static int field987;

    @ObfuscatedName("bk.g")
    public static int field988;

    @ObfuscatedName("bk.w")
    public static class53[] field989;

    @ObfuscatedName("g.g")
    public static int[] field99;

    @ObfuscatedName("bk.r")
    public static class57[] field990;

    @ObfuscatedName("bk.ax")
    public static float[] field991;

    @ObfuscatedName("bk.e")
    public static boolean[] field993;

    @ObfuscatedName("bk.j")
    public static int[] field994;

    @ObfuscatedName("gz.d(II)I")
    public static int method3327(int arg0) {
        return arg0 >> 11 & 0x3F;
    }

    @ObfuscatedName("hy.c(II)Lhe;")
    public static class221 method3790(int arg0) {
        class221[] var1 = class221.method1947();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class221 var3 = var1[var2];
            if (var3.field3202 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("ge.d(II)Lgq;")
    public static class199 method3084(int arg0) {
        class199 var1 = (class199) class199.field2872.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2873.method3129(11, arg0);
        class199 var3 = new class199();
        if (var2 != null) {
            var3.method3372(new class130(var2));
        }
        var3.method3371();
        class199.field2872.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("r.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method160(int arg0, String arg1, String arg2, String arg3) {
        class51 var4 = (class51) class48.field926.get(arg0);
        if (var4 == null) {
            var4 = new class51();
            class48.field926.put(arg0, var4);
        }
        class22 var5 = var4.method895(arg0, arg1, arg2, arg3);
        class48.field925.method2567(var5, (long) var5.field231);
        class48.field928.method2721(var5);
        client.field478 = client.field312;
    }

    @ObfuscatedName("fi.n(Leb;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method2910(class143 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class142 var3 = (class142) arg0.method2566((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2010;
        }
    }

    @ObfuscatedName("dp.d(ZI)V")
    public static void method1980(boolean arg0) {
        if (field2760 == null) {
            return;
        }
        try {
            class130 var1 = new class130(4);
            var1.method2215(arg0 ? 2 : 3);
            var1.method2305(0);
            field2760.method1953(var1.field1955, 0, 4);
        } catch (IOException var5) {
            try {
                field2760.method1972();
            } catch (Exception var4) {
            }
            class188.field2771++;
            field2760 = null;
        }
    }

    @ObfuscatedName("dy.q([BIIS)Ljava/lang/String;")
    public static String method1946(byte[] arg0, int arg1, int arg2) {
        char[] var3 = new char[arg2];
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var6 = arg0[arg1 + var5] & 0xFF;
            if (var6 != 0) {
                if (var6 >= 128 && var6 < 160) {
                    char var7 = class211.field3135[var6 - 128];
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

    @ObfuscatedName("c.t(III)V")
    public static void method16(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class184 var4 = (class184) class188.field2772.method2611(var2);
        if (var4 != null) {
            class188.field2759.method2552(var4);
        }
    }

    @ObfuscatedName("ad.o(ZI)V")
    public static void method815(boolean arg0) {
        if (field2981 != arg0) {
            class204.field2983.method2603();
            class204.field2984.method2603();
            class204.field2985.method2603();
            field2981 = arg0;
        }
    }

    @ObfuscatedName("ad.p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method831(String arg0, String arg1, String arg2) {
        class42.field833 = arg0;
        class42.field834 = arg1;
        class42.field835 = arg2;
    }

    @ObfuscatedName("by.u(Lhd;I)V")
    public static final void method1110(class227 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < field1581.length; var2++) {
            field1581[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            field1581[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    field730[var8] = (field1581[var8 - 1] + field1581[var8 + 1] + field1581[var8 - 128] + field1581[var8 + 128]) / 4;
                }
            }
            int[] var9 = field1581;
            field1581 = field730;
            field730 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3230; var11++) {
            for (int var12 = 0; var12 < arg0.field3233; var12++) {
                if (arg0.field3228[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3231;
                    int var14 = var11 + 16 + arg0.field3232;
                    int var15 = (var14 << 7) + var13;
                    field1581[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("m.i(ILat;ZB)I")
    public static int method254(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3300) {
            class33.field721[++field716 - 1] = client.field291;
            return 1;
        } else if (arg0 == 3301) {
            field716 -= 2;
            int var3 = class33.field721[field716];
            int var4 = class33.field721[field716 + 1];
            class33.field721[++field716 - 1] = class13.method3386(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            field716 -= 2;
            int var5 = class33.field721[field716];
            int var6 = class33.field721[field716 + 1];
            class33.field721[++field716 - 1] = class13.method591(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            field716 -= 2;
            int var7 = class33.field721[field716];
            int var8 = class33.field721[field716 + 1];
            int[] var9 = class33.field721;
            int var10 = ++field716 - 1;
            class13 var11 = (class13) class13.field133.method2611((long) var7);
            int var12;
            if (var11 == null) {
                var12 = 0;
            } else if (var8 == -1) {
                var12 = 0;
            } else {
                int var13 = 0;
                for (int var14 = 0; var14 < var11.field127.length; var14++) {
                    if (var11.field122[var14] == var8) {
                        var13 += var11.field127[var14];
                    }
                }
                var12 = var13;
            }
            var9[var10] = var12;
            return 1;
        } else if (arg0 == 3304) {
            int var15 = class33.field721[--field716];
            class33.field721[++field716 - 1] = class189.method1822(var15).field2777;
            return 1;
        } else if (arg0 == 3305) {
            int var16 = class33.field721[--field716];
            class33.field721[++field716 - 1] = client.field419[var16];
            return 1;
        } else if (arg0 == 3306) {
            int var17 = class33.field721[--field716];
            class33.field721[++field716 - 1] = client.field420[var17];
            return 1;
        } else if (arg0 == 3307) {
            int var18 = class33.field721[--field716];
            class33.field721[++field716 - 1] = client.field421[var18];
            return 1;
        } else if (arg0 == 3308) {
            int var19 = field533;
            int var20 = (field233.field629 >> 7) + field1726;
            int var21 = (field233.field601 >> 7) + field1776;
            class33.field721[++field716 - 1] = (var19 << 28) + (var20 << 14) + var21;
            return 1;
        } else if (arg0 == 3309) {
            int var22 = class33.field721[--field716];
            class33.field721[++field716 - 1] = var22 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var23 = class33.field721[--field716];
            class33.field721[++field716 - 1] = var23 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var24 = class33.field721[--field716];
            class33.field721[++field716 - 1] = var24 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            class33.field721[++field716 - 1] = client.field285 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            field716 -= 2;
            int var25 = class33.field721[field716] + 32768;
            int var26 = class33.field721[field716 + 1];
            class33.field721[++field716 - 1] = class13.method3386(var25, var26);
            return 1;
        } else if (arg0 == 3314) {
            field716 -= 2;
            int var27 = class33.field721[field716] + 32768;
            int var28 = class33.field721[field716 + 1];
            int[] var29 = class33.field721;
            int var30 = ++field716 - 1;
            class13 var31 = (class13) class13.field133.method2611((long) var27);
            int var32;
            if (var31 == null) {
                var32 = 0;
            } else if (var28 >= 0 && var28 < var31.field127.length) {
                var32 = var31.field127[var28];
            } else {
                var32 = 0;
            }
            var29[var30] = var32;
            return 1;
        } else if (arg0 == 3315) {
            field716 -= 2;
            int var33 = class33.field721[field716] + 32768;
            int var34 = class33.field721[field716 + 1];
            int[] var35 = class33.field721;
            int var36 = ++field716 - 1;
            class13 var37 = (class13) class13.field133.method2611((long) var33);
            int var38;
            if (var37 == null) {
                var38 = 0;
            } else if (var34 == -1) {
                var38 = 0;
            } else {
                int var39 = 0;
                for (int var40 = 0; var40 < var37.field127.length; var40++) {
                    if (var37.field122[var40] == var34) {
                        var39 += var37.field127[var40];
                    }
                }
                var38 = var39;
            }
            var35[var36] = var38;
            return 1;
        } else if (arg0 == 3316) {
            if (client.field518 >= 2) {
                class33.field721[++field716 - 1] = client.field518;
            } else {
                class33.field721[++field716 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            class33.field721[++field716 - 1] = client.field496;
            return 1;
        } else if (arg0 == 3318) {
            class33.field721[++field716 - 1] = client.field282;
            return 1;
        } else if (arg0 == 3321) {
            class33.field721[++field716 - 1] = client.field451;
            return 1;
        } else if (arg0 == 3322) {
            class33.field721[++field716 - 1] = client.field452;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field279) {
                class33.field721[++field716 - 1] = 1;
            } else {
                class33.field721[++field716 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            class33.field721[++field716 - 1] = client.field436;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.x(ILat;ZI)I")
    public static int method183(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (client.field555 == 0) {
                class33.field721[++field716 - 1] = -2;
            } else if (client.field555 == 1) {
                class33.field721[++field716 - 1] = -1;
            } else {
                class33.field721[++field716 - 1] = client.field554;
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = class33.field721[--field716];
            if (client.field555 == 2 && var3 < client.field554) {
                class33.field723[++field722 - 1] = client.field455[var3].field162;
                class33.field723[++field722 - 1] = client.field455[var3].field152;
            } else {
                class33.field723[++field722 - 1] = "";
                class33.field723[++field722 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var4 = class33.field721[--field716];
            if (client.field555 == 2 && var4 < client.field554) {
                class33.field721[++field716 - 1] = client.field455[var4].field154;
            } else {
                class33.field721[++field716 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var5 = class33.field721[--field716];
            if (client.field555 == 2 && var5 < client.field554) {
                class33.field721[++field716 - 1] = client.field455[var5].field151;
            } else {
                class33.field721[++field716 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var6 = class33.field723[--field722];
            int var7 = class33.field721[--field716];
            client.field326.method2480(91);
            client.field326.method2215(class130.method740(var6) + 1);
            client.field326.method2351(var6);
            client.field326.method2346(var7);
            return 1;
        } else if (arg0 == 3605) {
            String var8 = class33.field723[--field722];
            client.method1920(var8);
            return 1;
        } else if (arg0 == 3606) {
            String var9 = class33.field723[--field722];
            if (var9 != null) {
                String var10 = class212.method1943(var9, field758);
                if (var10 != null) {
                    for (int var11 = 0; var11 < client.field554; var11++) {
                        class15 var12 = client.field455[var11];
                        String var13 = var12.field162;
                        String var14 = class212.method1943(var13, field758);
                        if (class222.method1389(var9, var10, var13, var14)) {
                            client.field554--;
                            for (int var15 = var11; var15 < client.field554; var15++) {
                                client.field455[var15] = client.field455[var15 + 1];
                            }
                            client.field479 = client.field312;
                            client.field326.method2480(22);
                            client.field326.method2215(class130.method740(var9));
                            client.field326.method2351(var9);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3607) {
            String var16 = class33.field723[--field722];
            if (var16 != null) {
                if ((client.field558 < 100 || client.field407 == 1) && client.field558 < 400) {
                    String var17 = class212.method1943(var16, field758);
                    if (var17 != null) {
                        int var18 = 0;
                        while (true) {
                            if (var18 >= client.field558) {
                                for (int var22 = 0; var22 < client.field554; var22++) {
                                    class15 var23 = client.field455[var22];
                                    String var24 = class212.method1943(var23.field162, field758);
                                    if (var24 != null && var24.equals(var17)) {
                                        class48.method196(31, "", class176.field2530 + var16 + class176.field2531);
                                        return 1;
                                    }
                                    if (var23.field152 != null) {
                                        String var25 = class212.method1943(var23.field152, field758);
                                        if (var25 != null && var25.equals(var17)) {
                                            class48.method196(31, "", class176.field2530 + var16 + class176.field2531);
                                            return 1;
                                        }
                                    }
                                }
                                if (class212.method1943(field233.field266, field758).equals(var17)) {
                                    class48.method196(31, "", class176.field2527);
                                } else {
                                    client.field326.method2480(47);
                                    client.field326.method2215(class130.method740(var16));
                                    client.field326.method2351(var16);
                                }
                                break;
                            }
                            class20 var19 = client.field465[var18];
                            String var20 = class212.method1943(var19.field205, field758);
                            if (var20 != null && var20.equals(var17)) {
                                class48.method196(31, "", var16 + class176.field2525);
                                break;
                            }
                            if (var19.field209 != null) {
                                String var21 = class212.method1943(var19.field209, field758);
                                if (var21 != null && var21.equals(var17)) {
                                    class48.method196(31, "", var16 + class176.field2525);
                                    break;
                                }
                            }
                            var18++;
                        }
                    }
                } else {
                    class48.method196(31, "", class176.field2436);
                }
            }
            return 1;
        } else if (arg0 == 3608) {
            String var26 = class33.field723[--field722];
            client.method2140(var26);
            return 1;
        } else if (arg0 == 3609) {
            String var27 = class33.field723[--field722];
            class180[] var28 = class180.method1390();
            for (int var29 = 0; var29 < var28.length; var29++) {
                class180 var30 = var28[var29];
                if (var30.field2662 != -1 && var27.startsWith(class38.method1387(var30.field2662))) {
                    var27 = var27.substring(6 + Integer.toString(var30.field2662).length());
                    break;
                }
            }
            class33.field721[++field716 - 1] = client.method200(var27, false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (client.field486 == null) {
                class33.field723[++field722 - 1] = "";
            } else {
                class33.field723[++field722 - 1] = class213.method1847(client.field486);
            }
            return 1;
        } else if (arg0 == 3612) {
            if (client.field486 == null) {
                class33.field721[++field716 - 1] = 0;
            } else {
                class33.field721[++field716 - 1] = field1452;
            }
            return 1;
        } else if (arg0 == 3613) {
            int var31 = class33.field721[--field716];
            if (client.field486 == null || var31 >= field1452) {
                class33.field723[++field722 - 1] = "";
            } else {
                class33.field723[++field722 - 1] = field295[var31].field269;
            }
            return 1;
        } else if (arg0 == 3614) {
            int var32 = class33.field721[--field716];
            if (client.field486 == null || var32 >= field1452) {
                class33.field721[++field716 - 1] = 0;
            } else {
                class33.field721[++field716 - 1] = field295[var32].field268;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var33 = class33.field721[--field716];
            if (client.field486 == null || var33 >= field1452) {
                class33.field721[++field716 - 1] = 0;
            } else {
                class33.field721[++field716 - 1] = field295[var33].field271;
            }
            return 1;
        } else if (arg0 == 3616) {
            class33.field721[++field716 - 1] = field333;
            return 1;
        } else if (arg0 == 3617) {
            String var34 = class33.field723[--field722];
            client.method2201(var34);
            return 1;
        } else if (arg0 == 3618) {
            class33.field721[++field716 - 1] = field243;
            return 1;
        } else if (arg0 == 3619) {
            String var35 = class33.field723[--field722];
            client.method639(var35);
            return 1;
        } else if (arg0 == 3620) {
            client.field326.method2480(117);
            client.field326.method2215(0);
            return 1;
        } else if (arg0 == 3621) {
            if (client.field555 == 0) {
                class33.field721[++field716 - 1] = -1;
            } else {
                class33.field721[++field716 - 1] = client.field558;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var36 = class33.field721[--field716];
            if (client.field555 == 0 || var36 >= client.field558) {
                class33.field723[++field722 - 1] = "";
                class33.field723[++field722 - 1] = "";
            } else {
                class33.field723[++field722 - 1] = client.field465[var36].field205;
                class33.field723[++field722 - 1] = client.field465[var36].field209;
            }
            return 1;
        } else if (arg0 == 3623) {
            String var37 = class33.field723[--field722];
            if (var37.startsWith(class38.method1387(0)) || var37.startsWith(class38.method1387(1))) {
                var37 = var37.substring(7);
            }
            class33.field721[++field716 - 1] = client.method28(var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var38 = class33.field721[--field716];
            if (field295 == null || var38 >= field1452 || !field295[var38].field269.equalsIgnoreCase(field233.field266)) {
                class33.field721[++field716 - 1] = 0;
            } else {
                class33.field721[++field716 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (client.field514 == null) {
                class33.field723[++field722 - 1] = "";
            } else {
                class33.field723[++field722 - 1] = class213.method1847(client.field514);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.bm(I)V")
    public static final void method905() {
        client.method2061(false);
        client.field338 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < field3157.length; var1++) {
            if (field273[var1] != -1 && field3157[var1] == null) {
                field3157[var1] = field1174.method3129(field273[var1], 0);
                if (field3157[var1] == null) {
                    var0 = false;
                    client.field338++;
                }
            }
            if (field642[var1] != -1 && field1760[var1] == null) {
                field1760[var1] = field1174.method3113(field642[var1], 0, field1852[var1]);
                if (field1760[var1] == null) {
                    var0 = false;
                    client.field338++;
                }
            }
        }
        if (!var0) {
            client.field342 = 1;
            return;
        }
        client.field370 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < field3157.length; var3++) {
            byte[] var4 = field1760[var3];
            if (var4 != null) {
                int var5 = (field2154[var3] >> 8) * 64 - field1726;
                int var6 = (field2154[var3] & 0xFF) * 64 - field1776;
                if (client.field344) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class130 var9 = new class130(var4);
                int var10 = -1;
                label1092: while (true) {
                    int var11 = var9.method2242();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2242();
                            if (var16 == 0) {
                                continue label1092;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2379() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class203 var22 = class203.method579(var10);
                                if (var19 != 22 || !client.field286 || var22.field2944 != 0 || var22.field2937 == 1 || var22.field2963) {
                                    if (!var22.method3470()) {
                                        client.field370++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2242();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2379();
                    }
                }
            }
        }
        if (!var2) {
            client.field342 = 2;
            return;
        }
        if (client.field342 != 0) {
            client.method756(class176.field2385 + class38.field781 + class38.field782 + 100 + "%" + class38.field779, true);
        }
        client.method2051();
        client.method1846();
        client.method2051();
        field2347.method1636();
        client.method2051();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            client.field343[var23].method2100();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class11.field93[var24][var25][var26] = 0;
                }
            }
        }
        client.method2051();
        class11.field94 = 99;
        field2353 = new byte[4][104][104];
        field1859 = new byte[4][104][104];
        field95 = new byte[4][104][104];
        field1901 = new byte[4][104][104];
        field2161 = new int[4][105][105];
        field883 = new byte[4][105][105];
        field1200 = new int[105][105];
        field1460 = new int[104];
        field99 = new int[104];
        field97 = new int[104];
        field2006 = new int[104];
        field92 = new int[104];
        int var27 = field3157.length;
        for (class32 var28 = (class32) class32.field710.method2666(); var28 != null; var28 = (class32) class32.field710.method2668()) {
            if (var28.field706 != null) {
                field1792.method917(var28.field706);
                var28.field706 = null;
            }
            if (var28.field711 != null) {
                field1792.method917(var28.field711);
                var28.field711 = null;
            }
        }
        class32.field710.method2661();
        client.method2061(true);
        if (!client.field344) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (field2154[var29] >> 8) * 64 - field1726;
                int var31 = (field2154[var29] & 0xFF) * 64 - field1776;
                byte[] var32 = field3157[var29];
                if (var32 != null) {
                    client.method2051();
                    class11.method2447(var32, var30, var31, field620 * 8 - 48, field2681 * 8 - 48, client.field343);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (field2154[var33] >> 8) * 64 - field1726;
                int var35 = (field2154[var33] & 0xFF) * 64 - field1776;
                byte[] var36 = field3157[var33];
                if (var36 == null && field2681 < 800) {
                    client.method2051();
                    class11.method1877(var34, var35, 64, 64);
                }
            }
            client.method2061(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = field1760[var37];
                if (var38 != null) {
                    int var39 = (field2154[var37] >> 8) * 64 - field1726;
                    int var40 = (field2154[var37] & 0xFF) * 64 - field1776;
                    client.method2051();
                    class88 var41 = field2347;
                    class118[] var42 = client.field343;
                    class130 var43 = new class130(var38);
                    int var44 = -1;
                    while (true) {
                        int var45 = var43.method2242();
                        if (var45 == 0) {
                            break;
                        }
                        var44 += var45;
                        int var46 = 0;
                        while (true) {
                            int var47 = var43.method2242();
                            if (var47 == 0) {
                                break;
                            }
                            var46 += var47 - 1;
                            int var48 = var46 & 0x3F;
                            int var49 = var46 >> 6 & 0x3F;
                            int var50 = var46 >> 12;
                            int var51 = var43.method2379();
                            int var52 = var51 >> 2;
                            int var53 = var51 & 0x3;
                            int var54 = var39 + var49;
                            int var55 = var40 + var48;
                            if (var54 > 0 && var55 > 0 && var54 < 103 && var55 < 103) {
                                int var56 = var50;
                                if ((class11.field93[1][var54][var55] & 0x2) == 2) {
                                    var56 = var50 - 1;
                                }
                                class118 var57 = null;
                                if (var56 >= 0) {
                                    var57 = var42[var56];
                                }
                                class11.method108(var50, var54, var55, var44, var53, var52, var41, var57);
                            }
                        }
                    }
                }
            }
        }
        if (client.field344) {
            for (int var58 = 0; var58 < 4; var58++) {
                client.method2051();
                for (int var59 = 0; var59 < 13; var59++) {
                    for (int var60 = 0; var60 < 13; var60++) {
                        boolean var61 = false;
                        int var62 = client.field345[var58][var59][var60];
                        if (var62 != -1) {
                            int var63 = var62 >> 24 & 0x3;
                            int var64 = var62 >> 1 & 0x3;
                            int var65 = var62 >> 14 & 0x3FF;
                            int var66 = var62 >> 3 & 0x7FF;
                            int var67 = (var65 / 8 << 8) + var66 / 8;
                            for (int var68 = 0; var68 < field2154.length; var68++) {
                                if (field2154[var68] == var67 && field3157[var68] != null) {
                                    class11.method2150(field3157[var68], var58, var59 * 8, var60 * 8, var63, (var65 & 0x7) * 8, (var66 & 0x7) * 8, var64, client.field343);
                                    var61 = true;
                                    break;
                                }
                            }
                        }
                        if (!var61) {
                            class11.method709(var58, var59 * 8, var60 * 8);
                        }
                    }
                }
            }
            for (int var69 = 0; var69 < 13; var69++) {
                for (int var70 = 0; var70 < 13; var70++) {
                    int var71 = client.field345[0][var69][var70];
                    if (var71 == -1) {
                        class11.method1877(var69 * 8, var70 * 8, 8, 8);
                    }
                }
            }
            client.method2061(true);
            for (int var72 = 0; var72 < 4; var72++) {
                client.method2051();
                for (int var73 = 0; var73 < 13; var73++) {
                    label948: for (int var74 = 0; var74 < 13; var74++) {
                        int var75 = client.field345[var72][var73][var74];
                        if (var75 != -1) {
                            int var76 = var75 >> 24 & 0x3;
                            int var77 = var75 >> 1 & 0x3;
                            int var78 = var75 >> 14 & 0x3FF;
                            int var79 = var75 >> 3 & 0x7FF;
                            int var80 = (var78 / 8 << 8) + var79 / 8;
                            for (int var81 = 0; var81 < field2154.length; var81++) {
                                if (field2154[var81] == var80 && field1760[var81] != null) {
                                    byte[] var82 = field1760[var81];
                                    int var83 = var73 * 8;
                                    int var84 = var74 * 8;
                                    int var85 = (var78 & 0x7) * 8;
                                    int var86 = (var79 & 0x7) * 8;
                                    class88 var87 = field2347;
                                    class118[] var88 = client.field343;
                                    class130 var89 = new class130(var82);
                                    int var90 = -1;
                                    while (true) {
                                        int var91 = var89.method2242();
                                        if (var91 == 0) {
                                            continue label948;
                                        }
                                        var90 += var91;
                                        int var92 = 0;
                                        while (true) {
                                            int var93 = var89.method2242();
                                            if (var93 == 0) {
                                                break;
                                            }
                                            var92 += var93 - 1;
                                            int var94 = var92 & 0x3F;
                                            int var95 = var92 >> 6 & 0x3F;
                                            int var96 = var92 >> 12;
                                            int var97 = var89.method2379();
                                            int var98 = var97 >> 2;
                                            int var99 = var97 & 0x3;
                                            if (var76 == var96 && var95 >= var85 && var95 < var85 + 8 && var94 >= var86 && var94 < var86 + 8) {
                                                class203 var100 = class203.method579(var90);
                                                int var101 = var83 + class171.method172(var95 & 0x7, var94 & 0x7, var77, var100.field2964, var100.field2941, var99);
                                                int var102 = var84 + class171.method1812(var95 & 0x7, var94 & 0x7, var77, var100.field2964, var100.field2941, var99);
                                                if (var101 > 0 && var102 > 0 && var101 < 103 && var102 < 103) {
                                                    int var103 = var72;
                                                    if ((class11.field93[1][var101][var102] & 0x2) == 2) {
                                                        var103 = var72 - 1;
                                                    }
                                                    class118 var104 = null;
                                                    if (var103 >= 0) {
                                                        var104 = var88[var103];
                                                    }
                                                    class11.method108(var72, var101, var102, var90, var77 + var99 & 0x3, var98, var87, var104);
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
        client.method2061(true);
        client.method1846();
        client.method2051();
        class88 var105 = field2347;
        class118[] var106 = client.field343;
        for (int var107 = 0; var107 < 4; var107++) {
            for (int var108 = 0; var108 < 104; var108++) {
                for (int var109 = 0; var109 < 104; var109++) {
                    if ((class11.field93[var107][var108][var109] & 0x1) == 1) {
                        int var110 = var107;
                        if ((class11.field93[1][var108][var109] & 0x2) == 2) {
                            var110 = var107 - 1;
                        }
                        if (var110 >= 0) {
                            var106[var110].method2105(var108, var109);
                        }
                    }
                }
            }
        }
        class11.field105 += (int) (Math.random() * 5.0D) - 2;
        if (class11.field105 < -8) {
            class11.field105 = -8;
        }
        if (class11.field105 > 8) {
            class11.field105 = 8;
        }
        class11.field106 += (int) (Math.random() * 5.0D) - 2;
        if (class11.field106 < -16) {
            class11.field106 = -16;
        }
        if (class11.field106 > 16) {
            class11.field106 = 16;
        }
        for (int var111 = 0; var111 < 4; var111++) {
            byte[][] var112 = field883[var111];
            int var113 = (int) Math.sqrt(5100.0D);
            int var114 = var113 * 768 >> 8;
            for (int var115 = 1; var115 < 103; var115++) {
                for (int var116 = 1; var116 < 103; var116++) {
                    int var117 = class11.field103[var111][var116 + 1][var115] - class11.field103[var111][var116 - 1][var115];
                    int var118 = class11.field103[var111][var116][var115 + 1] - class11.field103[var111][var116][var115 - 1];
                    int var119 = (int) Math.sqrt((double) (var118 * var118 + var117 * var117 + 65536));
                    int var120 = (var117 << 8) / var119;
                    int var121 = 65536 / var119;
                    int var122 = (var118 << 8) / var119;
                    int var123 = (var122 * -50 + var120 * -50 + var121 * -10) / var114 + 96;
                    int var124 = (var112[var116][var115] >> 1) + (var112[var116][var115 + 1] >> 3) + (var112[var116][var115 - 1] >> 2) + (var112[var116 - 1][var115] >> 2) + (var112[var116 + 1][var115] >> 3);
                    field1200[var116][var115] = var123 - var124;
                }
            }
            for (int var125 = 0; var125 < 104; var125++) {
                field1460[var125] = 0;
                field99[var125] = 0;
                field97[var125] = 0;
                field2006[var125] = 0;
                field92[var125] = 0;
            }
            for (int var126 = -5; var126 < 109; var126++) {
                for (int var127 = 0; var127 < 104; var127++) {
                    int var128 = var126 + 5;
                    int var10002;
                    if (var128 >= 0 && var128 < 104) {
                        int var129 = field2353[var111][var128][var127] & 0xFF;
                        if (var129 > 0) {
                            int var130 = var129 - 1;
                            class194 var131 = (class194) class194.field2823.method2598((long) var130);
                            class194 var132;
                            if (var131 == null) {
                                byte[] var133 = field2821.method3129(1, var130);
                                class194 var134 = new class194();
                                if (var133 != null) {
                                    var134.method3275(new class130(var133), var130);
                                }
                                var134.method3277();
                                class194.field2823.method2607(var134, (long) var130);
                                var132 = var134;
                            } else {
                                var132 = var131;
                            }
                            field1460[var127] += var132.field2826;
                            field99[var127] += var132.field2824;
                            field97[var127] += var132.field2820;
                            field2006[var127] += var132.field2825;
                            var10002 = field92[var127]++;
                        }
                    }
                    int var136 = var126 - 5;
                    if (var136 >= 0 && var136 < 104) {
                        int var137 = field2353[var111][var136][var127] & 0xFF;
                        if (var137 > 0) {
                            int var138 = var137 - 1;
                            class194 var139 = (class194) class194.field2823.method2598((long) var138);
                            class194 var140;
                            if (var139 == null) {
                                byte[] var141 = field2821.method3129(1, var138);
                                class194 var142 = new class194();
                                if (var141 != null) {
                                    var142.method3275(new class130(var141), var138);
                                }
                                var142.method3277();
                                class194.field2823.method2607(var142, (long) var138);
                                var140 = var142;
                            } else {
                                var140 = var139;
                            }
                            field1460[var127] -= var140.field2826;
                            field99[var127] -= var140.field2824;
                            field97[var127] -= var140.field2820;
                            field2006[var127] -= var140.field2825;
                            var10002 = field92[var127]--;
                        }
                    }
                }
                if (var126 >= 1 && var126 < 103) {
                    int var144 = 0;
                    int var145 = 0;
                    int var146 = 0;
                    int var147 = 0;
                    int var148 = 0;
                    for (int var149 = -5; var149 < 109; var149++) {
                        int var150 = var149 + 5;
                        if (var150 >= 0 && var150 < 104) {
                            var144 += field1460[var150];
                            var145 += field99[var150];
                            var146 += field97[var150];
                            var147 += field2006[var150];
                            var148 += field92[var150];
                        }
                        int var151 = var149 - 5;
                        if (var151 >= 0 && var151 < 104) {
                            var144 -= field1460[var151];
                            var145 -= field99[var151];
                            var146 -= field97[var151];
                            var147 -= field2006[var151];
                            var148 -= field92[var151];
                        }
                        if (var149 >= 1 && var149 < 103 && (!client.field286 || (class11.field93[0][var126][var149] & 0x2) != 0 || (class11.field93[var111][var126][var149] & 0x10) == 0)) {
                            if (var111 < class11.field94) {
                                class11.field94 = var111;
                            }
                            int var152 = field2353[var111][var126][var149] & 0xFF;
                            int var153 = field1859[var111][var126][var149] & 0xFF;
                            if (var152 > 0 || var153 > 0) {
                                int var154 = class11.field103[var111][var126][var149];
                                int var155 = class11.field103[var111][var126 + 1][var149];
                                int var156 = class11.field103[var111][var126 + 1][var149 + 1];
                                int var157 = class11.field103[var111][var126][var149 + 1];
                                int var158 = field1200[var126][var149];
                                int var159 = field1200[var126 + 1][var149];
                                int var160 = field1200[var126 + 1][var149 + 1];
                                int var161 = field1200[var126][var149 + 1];
                                int var162 = -1;
                                int var163 = -1;
                                if (var152 > 0) {
                                    int var164 = var144 * 256 / var147;
                                    int var165 = var145 / var148;
                                    int var166 = var146 / var148;
                                    var162 = class11.method760(var164, var165, var166);
                                    int var167 = class11.field105 + var164 & 0xFF;
                                    int var168 = class11.field106 + var166;
                                    if (var168 < 0) {
                                        var168 = 0;
                                    } else if (var168 > 255) {
                                        var168 = 255;
                                    }
                                    var163 = class11.method760(var167, var165, var168);
                                }
                                if (var111 > 0) {
                                    boolean var169 = true;
                                    if (var152 == 0 && field95[var111][var126][var149] != 0) {
                                        var169 = false;
                                    }
                                    if (var153 > 0) {
                                        int var170 = var153 - 1;
                                        class206 var171 = (class206) class206.field3072.method2598((long) var170);
                                        class206 var172;
                                        if (var171 == null) {
                                            byte[] var173 = field3082.method3129(4, var170);
                                            class206 var174 = new class206();
                                            if (var173 != null) {
                                                var174.method3626(new class130(var173), var170);
                                            }
                                            var174.method3624();
                                            class206.field3072.method2607(var174, (long) var170);
                                            var172 = var174;
                                        } else {
                                            var172 = var171;
                                        }
                                        if (!var172.field3075) {
                                            var169 = false;
                                        }
                                    }
                                    if (var169 && var154 == var155 && var154 == var156 && var154 == var157) {
                                        field2161[var111][var126][var149] |= 0x924;
                                    }
                                }
                                int var175 = 0;
                                if (var163 != -1) {
                                    var175 = class85.field1429[class11.method1149(var163, 96)];
                                }
                                if (var153 == 0) {
                                    var105.method1774(var111, var126, var149, 0, 0, -1, var154, var155, var156, var157, class11.method1149(var162, var158), class11.method1149(var162, var159), class11.method1149(var162, var160), class11.method1149(var162, var161), 0, 0, 0, 0, var175, 0);
                                } else {
                                    int var176 = field95[var111][var126][var149] + 1;
                                    byte var177 = field1901[var111][var126][var149];
                                    int var178 = var153 - 1;
                                    class206 var179 = (class206) class206.field3072.method2598((long) var178);
                                    class206 var180;
                                    if (var179 == null) {
                                        byte[] var181 = field3082.method3129(4, var178);
                                        class206 var182 = new class206();
                                        if (var181 != null) {
                                            var182.method3626(new class130(var181), var178);
                                        }
                                        var182.method3624();
                                        class206.field3072.method2607(var182, (long) var178);
                                        var180 = var182;
                                    } else {
                                        var180 = var179;
                                    }
                                    int var184 = var180.field3076;
                                    int var185;
                                    int var186;
                                    if (var184 >= 0) {
                                        var185 = field1438.method1373(var184);
                                        var186 = -1;
                                    } else if (var180.field3074 == 16711935) {
                                        var186 = -2;
                                        var184 = -1;
                                        var185 = -2;
                                    } else {
                                        var186 = class11.method760(var180.field3077, var180.field3078, var180.field3079);
                                        int var187 = class11.field105 + var180.field3077 & 0xFF;
                                        int var188 = class11.field106 + var180.field3079;
                                        if (var188 < 0) {
                                            var188 = 0;
                                        } else if (var188 > 255) {
                                            var188 = 255;
                                        }
                                        var185 = class11.method760(var187, var180.field3078, var188);
                                    }
                                    int var189 = 0;
                                    if (var185 != -2) {
                                        var189 = class85.field1429[class11.method187(var185, 96)];
                                    }
                                    if (var180.field3080 != -1) {
                                        int var190 = class11.field105 + var180.field3073 & 0xFF;
                                        int var191 = class11.field106 + var180.field3071;
                                        if (var191 < 0) {
                                            var191 = 0;
                                        } else if (var191 > 255) {
                                            var191 = 255;
                                        }
                                        int var192 = class11.method760(var190, var180.field3081, var191);
                                        var189 = class85.field1429[class11.method187(var192, 96)];
                                    }
                                    var105.method1774(var111, var126, var149, var176, var177, var184, var154, var155, var156, var157, class11.method1149(var162, var158), class11.method1149(var162, var159), class11.method1149(var162, var160), class11.method1149(var162, var161), class11.method187(var186, var158), class11.method187(var186, var159), class11.method187(var186, var160), class11.method187(var186, var161), var175, var189);
                                }
                            }
                        }
                    }
                }
            }
            for (int var193 = 1; var193 < 103; var193++) {
                for (int var194 = 1; var194 < 103; var194++) {
                    int var199;
                    if ((class11.field93[var111][var194][var193] & 0x8) != 0) {
                        var199 = 0;
                    } else if (var111 <= 0 || (class11.field93[1][var194][var193] & 0x2) == 0) {
                        var199 = var111;
                    } else {
                        var199 = var111 - 1;
                    }
                    var105.method1640(var111, var194, var193, var199);
                }
            }
            field2353[var111] = (byte[][]) null;
            field1859[var111] = (byte[][]) null;
            field95[var111] = (byte[][]) null;
            field1901[var111] = (byte[][]) null;
            field883[var111] = (byte[][]) null;
        }
        var105.method1754(-50, -10, -50);
        for (int var200 = 0; var200 < 104; var200++) {
            for (int var201 = 0; var201 < 104; var201++) {
                if ((class11.field93[1][var200][var201] & 0x2) == 2) {
                    var105.method1738(var200, var201);
                }
            }
        }
        int var202 = 1;
        int var203 = 2;
        int var204 = 4;
        for (int var205 = 0; var205 < 4; var205++) {
            if (var205 > 0) {
                var202 <<= 0x3;
                var203 <<= 0x3;
                var204 <<= 0x3;
            }
            for (int var206 = 0; var206 <= var205; var206++) {
                for (int var207 = 0; var207 <= 104; var207++) {
                    for (int var208 = 0; var208 <= 104; var208++) {
                        if ((field2161[var206][var208][var207] & var202) != 0) {
                            int var209 = var207;
                            int var210 = var207;
                            int var211 = var206;
                            int var212 = var206;
                            while (var209 > 0 && (field2161[var206][var208][var209 - 1] & var202) != 0) {
                                var209--;
                            }
                            while (var210 < 104 && (field2161[var206][var208][var210 + 1] & var202) != 0) {
                                var210++;
                            }
                            label676: while (var211 > 0) {
                                for (int var213 = var209; var213 <= var210; var213++) {
                                    if ((field2161[var211 - 1][var208][var213] & var202) == 0) {
                                        break label676;
                                    }
                                }
                                var211--;
                            }
                            label665: while (var212 < var205) {
                                for (int var214 = var209; var214 <= var210; var214++) {
                                    if ((field2161[var212 + 1][var208][var214] & var202) == 0) {
                                        break label665;
                                    }
                                }
                                var212++;
                            }
                            int var215 = (var212 + 1 - var211) * (var210 - var209 + 1);
                            if (var215 >= 8) {
                                short var216 = 240;
                                int var217 = class11.field103[var212][var208][var209] - var216;
                                int var218 = class11.field103[var211][var208][var209];
                                class88.method1796(var205, 1, var208 * 128, var208 * 128, var209 * 128, var210 * 128 + 128, var217, var218);
                                for (int var219 = var211; var219 <= var212; var219++) {
                                    for (int var220 = var209; var220 <= var210; var220++) {
                                        field2161[var219][var208][var220] &= ~var202;
                                    }
                                }
                            }
                        }
                        if ((field2161[var206][var208][var207] & var203) != 0) {
                            int var221 = var208;
                            int var222 = var208;
                            int var223 = var206;
                            int var224 = var206;
                            while (var221 > 0 && (field2161[var206][var221 - 1][var207] & var203) != 0) {
                                var221--;
                            }
                            while (var222 < 104 && (field2161[var206][var222 + 1][var207] & var203) != 0) {
                                var222++;
                            }
                            label729: while (var223 > 0) {
                                for (int var225 = var221; var225 <= var222; var225++) {
                                    if ((field2161[var223 - 1][var225][var207] & var203) == 0) {
                                        break label729;
                                    }
                                }
                                var223--;
                            }
                            label718: while (var224 < var205) {
                                for (int var226 = var221; var226 <= var222; var226++) {
                                    if ((field2161[var224 + 1][var226][var207] & var203) == 0) {
                                        break label718;
                                    }
                                }
                                var224++;
                            }
                            int var227 = (var224 + 1 - var223) * (var222 - var221 + 1);
                            if (var227 >= 8) {
                                short var228 = 240;
                                int var229 = class11.field103[var224][var221][var207] - var228;
                                int var230 = class11.field103[var223][var221][var207];
                                class88.method1796(var205, 2, var221 * 128, var222 * 128 + 128, var207 * 128, var207 * 128, var229, var230);
                                for (int var231 = var223; var231 <= var224; var231++) {
                                    for (int var232 = var221; var232 <= var222; var232++) {
                                        field2161[var231][var232][var207] &= ~var203;
                                    }
                                }
                            }
                        }
                        if ((field2161[var206][var208][var207] & var204) != 0) {
                            int var233 = var208;
                            int var234 = var208;
                            int var235 = var207;
                            int var236 = var207;
                            while (var235 > 0 && (field2161[var206][var208][var235 - 1] & var204) != 0) {
                                var235--;
                            }
                            while (var236 < 104 && (field2161[var206][var208][var236 + 1] & var204) != 0) {
                                var236++;
                            }
                            label782: while (var233 > 0) {
                                for (int var237 = var235; var237 <= var236; var237++) {
                                    if ((field2161[var206][var233 - 1][var237] & var204) == 0) {
                                        break label782;
                                    }
                                }
                                var233--;
                            }
                            label771: while (var234 < 104) {
                                for (int var238 = var235; var238 <= var236; var238++) {
                                    if ((field2161[var206][var234 + 1][var238] & var204) == 0) {
                                        break label771;
                                    }
                                }
                                var234++;
                            }
                            if ((var234 - var233 + 1) * (var236 - var235 + 1) >= 4) {
                                int var239 = class11.field103[var206][var233][var235];
                                class88.method1796(var205, 4, var233 * 128, var234 * 128 + 128, var235 * 128, var236 * 128 + 128, var239, var239);
                                for (int var240 = var233; var240 <= var234; var240++) {
                                    for (int var241 = var235; var241 <= var236; var241++) {
                                        field2161[var206][var240][var241] &= ~var204;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        client.method2061(true);
        int var242 = class11.field94;
        if (var242 > field533) {
            var242 = field533;
        }
        if (var242 < field533 - 1) {
            int var243 = field533 - 1;
        }
        if (client.field286) {
            field2347.method1637(class11.field94);
        } else {
            field2347.method1637(0);
        }
        for (int var244 = 0; var244 < 104; var244++) {
            for (int var245 = 0; var245 < 104; var245++) {
                client.method762(var244, var245);
            }
        }
        client.method2051();
        client.method3413();
        class203.field2928.method2603();
        if (field27 != null) {
            client.field326.method2480(60);
            client.field326.method2218(1057001181);
        }
        if (!client.field344) {
            int var246 = (field620 - 6) / 8;
            int var247 = (field620 + 6) / 8;
            int var248 = (field2681 - 6) / 8;
            int var249 = (field2681 + 6) / 8;
            for (int var250 = var246 - 1; var250 <= var247 + 1; var250++) {
                for (int var251 = var248 - 1; var251 <= var249 + 1; var251++) {
                    if (var250 < var246 || var250 > var247 || var251 < var248 || var251 > var249) {
                        field1174.method3127("m" + var250 + "_" + var251);
                        field1174.method3127("l" + var250 + "_" + var251);
                    }
                }
            }
        }
        client.method112(30);
        client.method2051();
        field2353 = (byte[][][]) null;
        field1859 = (byte[][][]) null;
        field95 = (byte[][][]) null;
        field1901 = (byte[][][]) null;
        field2161 = (int[][][]) null;
        field883 = (byte[][][]) null;
        field1200 = (int[][]) null;
        field1460 = null;
        field99 = null;
        field97 = null;
        field2006 = null;
        field92 = null;
        client.field326.method2480(54);
        field917.method1824();
        for (int var252 = 0; var252 < 32; var252++) {
            client.field1774[var252] = 0L;
        }
        for (int var253 = 0; var253 < 32; var253++) {
            client.field1775[var253] = 0L;
        }
        field131 = 0;
    }

    @ObfuscatedName("fq.bb(B)V")
    public static final void method3060() {
        if (client.field330 == 193) {
            int var0 = client.field328.method2379();
            int var1 = (var0 >> 4 & 0x7) + field3158;
            int var2 = (var0 & 0x7) + field803;
            int var3 = client.field328.method2266();
            int var4 = client.field328.method2232();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class44 var5 = new class44();
                var5.field880 = var4;
                var5.field875 = var3;
                if (client.field415[field533][var1][var2] == null) {
                    client.field415[field533][var1][var2] = new class150();
                }
                client.field415[field533][var1][var2].method2662(var5);
                client.method762(var1, var2);
            }
        } else if (client.field330 == 85) {
            int var6 = client.field328.method2256();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = client.field346[var7];
            int var10 = client.field328.method2257();
            int var11 = (var10 >> 4 & 0x7) + field3158;
            int var12 = (var10 & 0x7) + field803;
            int var13 = client.field328.method2267();
            if (var11 >= 0 && var12 >= 0 && var11 < 103 && var12 < 103) {
                if (var9 == 0) {
                    class91 var14 = field2347.method1658(field533, var11, var12);
                    if (var14 != null) {
                        int var15 = var14.field1541 >> 14 & 0x7FFF;
                        if (var7 == 2) {
                            var14.field1536 = new class50(var15, 2, var8 + 4, field533, var11, var12, var13, false, var14.field1536);
                            var14.field1546 = new class50(var15, 2, var8 + 1 & 0x3, field533, var11, var12, var13, false, var14.field1546);
                        } else {
                            var14.field1536 = new class50(var15, var7, var8, field533, var11, var12, var13, false, var14.field1536);
                        }
                    }
                }
                if (var9 == 1) {
                    class96 var16 = field2347.method1659(field533, var11, var12);
                    if (var16 != null) {
                        int var17 = var16.field1593 >> 14 & 0x7FFF;
                        if (var7 == 4 || var7 == 5) {
                            var16.field1591 = new class50(var17, 4, var8, field533, var11, var12, var13, false, var16.field1591);
                        } else if (var7 == 6) {
                            var16.field1591 = new class50(var17, 4, var8 + 4, field533, var11, var12, var13, false, var16.field1591);
                        } else if (var7 == 7) {
                            var16.field1591 = new class50(var17, 4, (var8 + 2 & 0x3) + 4, field533, var11, var12, var13, false, var16.field1591);
                        } else if (var7 == 8) {
                            var16.field1591 = new class50(var17, 4, var8 + 4, field533, var11, var12, var13, false, var16.field1591);
                            var16.field1597 = new class50(var17, 4, (var8 + 2 & 0x3) + 4, field533, var11, var12, var13, false, var16.field1597);
                        }
                    }
                }
                if (var9 == 2) {
                    class97 var18 = field2347.method1660(field533, var11, var12);
                    if (var7 == 11) {
                        var7 = 10;
                    }
                    if (var18 != null) {
                        var18.field1602 = new class50(var18.field1611 >> 14 & 0x7FFF, var7, var8, field533, var11, var12, var13, false, var18.field1602);
                    }
                }
                if (var9 == 3) {
                    class79 var19 = field2347.method1641(field533, var11, var12);
                    if (var19 != null) {
                        var19.field1278 = new class50(var19.field1281 >> 14 & 0x7FFF, 22, var8, field533, var11, var12, var13, false, var19.field1278);
                    }
                }
            }
        } else if (client.field330 == 158) {
            int var20 = client.field328.method2379();
            int var21 = (var20 >> 4 & 0x7) + field3158;
            int var22 = (var20 & 0x7) + field803;
            int var23 = client.field328.method2232();
            int var24 = client.field328.method2379();
            int var25 = client.field328.method2232();
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                int var26 = var21 * 128 + 64;
                int var27 = var22 * 128 + 64;
                class34 var28 = new class34(var23, field533, var26, var27, client.method599(var26, var27, field533) - var24, var25, client.field291);
                client.field532.method2662(var28);
            }
        } else if (client.field330 == 119) {
            int var29 = client.field328.method2405();
            int var30 = var29 >> 2;
            int var31 = var29 & 0x3;
            int var32 = client.field346[var30];
            int var33 = client.field328.method2379();
            int var34 = (var33 >> 4 & 0x7) + field3158;
            int var35 = (var33 & 0x7) + field803;
            int var36 = client.field328.method2267();
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                client.method213(field533, var34, var35, var32, var36, var30, var31, 0, -1);
            }
        } else if (client.field330 == 102) {
            int var37 = client.field328.method2379();
            int var38 = (var37 >> 4 & 0x7) + field3158;
            int var39 = (var37 & 0x7) + field803;
            int var40 = var38 + client.field328.method2230();
            int var41 = var39 + client.field328.method2230();
            int var42 = client.field328.method2254();
            int var43 = client.field328.method2232();
            int var44 = client.field328.method2379() * 4;
            int var45 = client.field328.method2379() * 4;
            int var46 = client.field328.method2232();
            int var47 = client.field328.method2232();
            int var48 = client.field328.method2379();
            int var49 = client.field328.method2379();
            if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104 && var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104 && var43 != 65535) {
                int var50 = var38 * 128 + 64;
                int var51 = var39 * 128 + 64;
                int var52 = var40 * 128 + 64;
                int var53 = var41 * 128 + 64;
                class43 var54 = new class43(var43, field533, var50, var51, client.method599(var50, var51, field533) - var44, client.field291 + var46, client.field291 + var47, var48, var49, var42, var45);
                var54.method800(var52, var53, client.method599(var52, var53, field533) - var45, client.field291 + var46);
                client.field417.method2662(var54);
            }
        } else if (client.field330 == 151) {
            int var55 = client.field328.method2256();
            int var56 = var55 >> 2;
            int var57 = var55 & 0x3;
            int var58 = client.field346[var56];
            int var59 = client.field328.method2379();
            int var60 = (var59 >> 4 & 0x7) + field3158;
            int var61 = (var59 & 0x7) + field803;
            if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                client.method213(field533, var60, var61, var58, -1, var56, var57, 0, -1);
            }
        } else {
            if (client.field330 == 86) {
                int var62 = client.field328.method2379();
                int var63 = (var62 >> 4 & 0x7) + field3158;
                int var64 = (var62 & 0x7) + field803;
                int var65 = client.field328.method2232();
                int var66 = client.field328.method2379();
                int var67 = var66 >> 4 & 0xF;
                int var68 = var66 & 0x7;
                int var69 = client.field328.method2379();
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    int var70 = var67 + 1;
                    if (field233.field662[0] >= var63 - var70 && field233.field662[0] <= var63 + var70 && field233.field656[0] >= var64 - var70 && field233.field656[0] <= var64 + var70 && client.field528 != 0 && var68 > 0 && client.field529 < 50) {
                        client.field530[client.field529] = var65;
                        client.field531[client.field529] = var68;
                        client.field443[client.field529] = var69;
                        client.field505[client.field529] = null;
                        client.field494[client.field529] = (var63 << 16) + (var64 << 8) + var67;
                        client.field529++;
                    }
                }
            }
            if (client.field330 == 97) {
                int var71 = client.field328.method2379();
                int var72 = (var71 >> 4 & 0x7) + field3158;
                int var73 = (var71 & 0x7) + field803;
                int var74 = client.field328.method2265();
                if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                    class150 var75 = client.field415[field533][var72][var73];
                    if (var75 != null) {
                        for (class44 var76 = (class44) var75.method2666(); var76 != null; var76 = (class44) var75.method2668()) {
                            if ((var74 & 0x7FFF) == var76.field880) {
                                var76.method2652();
                                break;
                            }
                        }
                        if (var75.method2666() == null) {
                            client.field415[field533][var72][var73] = null;
                        }
                        client.method762(var72, var73);
                    }
                }
            } else {
                if (client.field330 == 232) {
                    int var77 = client.field328.method2232();
                    byte var78 = client.field328.method2362();
                    byte var79 = client.field328.method2230();
                    int var80 = client.field328.method2405();
                    int var81 = var80 >> 2;
                    int var82 = var80 & 0x3;
                    int var83 = client.field346[var81];
                    int var84 = client.field328.method2232();
                    byte var85 = client.field328.method2259();
                    int var86 = client.field328.method2266();
                    int var87 = client.field328.method2256();
                    int var88 = (var87 >> 4 & 0x7) + field3158;
                    int var89 = (var87 & 0x7) + field803;
                    byte var90 = client.field328.method2348();
                    int var91 = client.field328.method2265();
                    class24 var92;
                    if (client.field414 == var84) {
                        var92 = field233;
                    } else {
                        var92 = client.field404[var84];
                    }
                    if (var92 != null) {
                        class203 var93 = class203.method579(var86);
                        int var94;
                        int var95;
                        if (var82 == 1 || var82 == 3) {
                            var94 = var93.field2941;
                            var95 = var93.field2964;
                        } else {
                            var94 = var93.field2964;
                            var95 = var93.field2941;
                        }
                        int var96 = (var94 >> 1) + var88;
                        int var97 = (var94 + 1 >> 1) + var88;
                        int var98 = (var95 >> 1) + var89;
                        int var99 = (var95 + 1 >> 1) + var89;
                        int[][] var100 = class11.field103[field533];
                        int var101 = var100[var96][var98] + var100[var97][var98] + var100[var96][var99] + var100[var97][var99] >> 2;
                        int var102 = (var88 << 7) + (var94 << 6);
                        int var103 = (var89 << 7) + (var95 << 6);
                        class83 var104 = var93.method3472(var81, var82, var100, var102, var101, var103);
                        if (var104 != null) {
                            client.method213(field533, var88, var89, var83, -1, 0, 0, var77 + 1, var91 + 1);
                            var92.field260 = client.field291 + var77;
                            var92.field259 = client.field291 + var91;
                            var92.field249 = var104;
                            var92.field246 = var88 * 128 + var94 * 64;
                            var92.field248 = var89 * 128 + var95 * 64;
                            var92.field240 = var101;
                            if (var85 > var78) {
                                byte var105 = var85;
                                var85 = var78;
                                var78 = var105;
                            }
                            if (var79 > var90) {
                                byte var106 = var79;
                                var79 = var90;
                                var90 = var106;
                            }
                            var92.field250 = var85 + var88;
                            var92.field252 = var78 + var88;
                            var92.field253 = var79 + var89;
                            var92.field255 = var89 + var90;
                        }
                    }
                }
                if (client.field330 == 87) {
                    int var107 = client.field328.method2379();
                    int var108 = (var107 >> 4 & 0x7) + field3158;
                    int var109 = (var107 & 0x7) + field803;
                    int var110 = client.field328.method2232();
                    int var111 = client.field328.method2232();
                    int var112 = client.field328.method2232();
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        class150 var113 = client.field415[field533][var108][var109];
                        if (var113 != null) {
                            for (class44 var114 = (class44) var113.method2666(); var114 != null; var114 = (class44) var113.method2668()) {
                                if ((var110 & 0x7FFF) == var114.field880 && var114.field875 == var111) {
                                    var114.field875 = var112;
                                    break;
                                }
                            }
                            client.method762(var108, var109);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.cu(I)V")
    public static final void method231() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < client.field424 - 1; var1++) {
                if (client.field427[var1] < 1000 && client.field427[var1 + 1] > 1000) {
                    String var2 = client.field430[var1];
                    client.field430[var1] = client.field430[var1 + 1];
                    client.field430[var1 + 1] = var2;
                    String var3 = client.field388[var1];
                    client.field388[var1] = client.field388[var1 + 1];
                    client.field388[var1 + 1] = var3;
                    int var4 = client.field427[var1];
                    client.field427[var1] = client.field427[var1 + 1];
                    client.field427[var1 + 1] = var4;
                    int var5 = client.field425[var1];
                    client.field425[var1] = client.field425[var1 + 1];
                    client.field425[var1 + 1] = var5;
                    int var6 = client.field339[var1];
                    client.field339[var1] = client.field339[var1 + 1];
                    client.field339[var1 + 1] = var6;
                    int var7 = client.field524[var1];
                    client.field524[var1] = client.field524[var1 + 1];
                    client.field524[var1 + 1] = var7;
                    if (client.field432 != -1) {
                        if (client.field432 == var1) {
                            client.field432 = var1 + 1;
                        } else if (client.field432 == var1 + 1) {
                            client.field432 = var1;
                        }
                    }
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("aq.ct(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method739(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (client.field423 || client.field424 >= 500) {
            return;
        }
        client.field388[client.field424] = arg0;
        client.field430[client.field424] = arg1;
        client.field427[client.field424] = arg2;
        client.field524[client.field424] = arg3;
        client.field425[client.field424] = arg4;
        client.field339[client.field424] = arg5;
        if (arg6) {
            client.field432 = client.field424;
        }
        client.field424++;
    }

    @ObfuscatedName("fy.dt(II)Ljava/lang/String;")
    public static final String method3078(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("eg.dj(I)V")
    public static void method2453() {
        for (class18 var0 = (class18) client.field447.method2614(); var0 != null; var0 = (class18) client.field447.method2615()) {
            int var1 = var0.field179;
            if (class172.method1982(var1)) {
                boolean var2 = true;
                class172[] var3 = field1985[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2324;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2034;
                    class172 var6 = class172.method2211(var5);
                    if (var6 != null) {
                        client.method2197(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fv.dz(Lfc;IIII)V")
    public static final void method2743(class172 arg0, int arg1, int arg2, int arg3) {
        client.method2051();
        class167 var4 = arg0.method3011(false);
        if (var4 == null) {
            return;
        }
        class224.method3860(arg1, arg2, var4.field2168 + arg1, var4.field2166 + arg2);
        if (client.field523 == 2 || client.field523 == 5) {
            class224.method3903(arg1, arg2, 0, var4.field2167, var4.field2165);
        } else {
            int var5 = client.field368 + client.field354 & 0x7FF;
            int var6 = field233.field629 / 32 + 48;
            int var7 = 464 - field233.field601 / 32;
            field2001.method4008(arg1, arg2, var4.field2168, var4.field2166, var6, var7, var5, client.field356 + 256, var4.field2167, var4.field2165);
            for (int var8 = 0; var8 < client.field517; var8++) {
                int var9 = client.field506[var8] * 4 + 2 - field233.field629 / 32;
                int var10 = client.field519[var8] * 4 + 2 - field233.field601 / 32;
                client.method759(arg1, arg2, var9, var10, client.field571[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class150 var13 = client.field415[field533][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - field233.field629 / 32;
                        int var15 = var12 * 4 + 2 - field233.field601 / 32;
                        client.method759(arg1, arg2, var14, var15, field957[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < client.field322; var16++) {
                class36 var17 = client.field534[client.field351[var16]];
                if (var17 != null && var17.method233()) {
                    class205 var18 = var17.field762;
                    if (var18 != null && var18.field3040 != null) {
                        var18 = var18.method3591();
                    }
                    if (var18 != null && var18.field3055 && var18.field3062) {
                        int var19 = var17.field629 / 32 - field233.field629 / 32;
                        int var20 = var17.field601 / 32 - field233.field601 / 32;
                        client.method759(arg1, arg2, var19, var20, field957[1], var4);
                    }
                }
            }
            int var21 = class46.field892;
            int[] var22 = class46.field895;
            for (int var23 = 0; var23 < var21; var23++) {
                class24 var24 = client.field404[var22[var23]];
                if (var24 != null && var24.method233() && !var24.field264 && field233 != var24) {
                    int var25 = var24.field629 / 32 - field233.field629 / 32;
                    int var26 = var24.field601 / 32 - field233.field601 / 32;
                    boolean var27 = false;
                    if (client.method200(var24.field266, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < field1452; var29++) {
                        if (var24.field266.equals(field295[var29].field269)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field233.field251 != 0 && var24.field251 != 0 && field233.field251 == var24.field251) {
                        var30 = true;
                    }
                    if (var27) {
                        client.method759(arg1, arg2, var25, var26, field957[3], var4);
                    } else if (var30) {
                        client.method759(arg1, arg2, var25, var26, field957[4], var4);
                    } else if (var28) {
                        client.method759(arg1, arg2, var25, var26, field957[5], var4);
                    } else {
                        client.method759(arg1, arg2, var25, var26, field957[2], var4);
                    }
                }
            }
            if (client.field299 != 0 && client.field291 % 20 < 10) {
                if (client.field299 == 1 && client.field300 >= 0 && client.field300 < client.field534.length) {
                    class36 var31 = client.field534[client.field300];
                    if (var31 != null) {
                        int var32 = var31.field629 / 32 - field233.field629 / 32;
                        int var33 = var31.field601 / 32 - field233.field601 / 32;
                        client.method752(arg1, arg2, var32, var33, field51[1], var4);
                    }
                }
                if (client.field299 == 2) {
                    int var34 = client.field302 * 4 - field1726 * 4 + 2 - field233.field629 / 32;
                    int var35 = client.field303 * 4 - field1776 * 4 + 2 - field233.field601 / 32;
                    client.method752(arg1, arg2, var34, var35, field51[1], var4);
                }
                if (client.field299 == 10 && client.field301 >= 0 && client.field301 < client.field404.length) {
                    class24 var36 = client.field404[client.field301];
                    if (var36 != null) {
                        int var37 = var36.field629 / 32 - field233.field629 / 32;
                        int var38 = var36.field601 / 32 - field233.field601 / 32;
                        client.method752(arg1, arg2, var37, var38, field51[1], var4);
                    }
                }
            }
            if (client.field521 != 0) {
                int var39 = client.field521 * 4 + 2 - field233.field629 / 32;
                int var40 = client.field335 * 4 + 2 - field233.field601 / 32;
                client.method759(arg1, arg2, var39, var40, field51[0], var4);
            }
            if (!field233.field264) {
                class224.method3866(var4.field2168 / 2 + arg1 - 1, var4.field2166 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        client.field492[arg3] = true;
    }
}
