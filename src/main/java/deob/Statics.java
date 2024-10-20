package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Desktop.Action;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("bw.p")
    public static class53[] field1000;

    @ObfuscatedName("bw.l")
    public static class57[] field1001;

    @ObfuscatedName("bw.c")
    public static class65[] field1002;

    @ObfuscatedName("bw.m")
    public static class70[] field1003;

    @ObfuscatedName("bw.u")
    public static int[] field1005;

    @ObfuscatedName("bw.ak")
    public static float[] field1008;

    @ObfuscatedName("bw.t")
    public static float[] field1011;

    @ObfuscatedName("bw.z")
    public static float[] field1012;

    @ObfuscatedName("bw.b")
    public static float[] field1013;

    @ObfuscatedName("bw.o")
    public static float[] field1014;

    @ObfuscatedName("bw.an")
    public static int[] field1018;

    @ObfuscatedName("bw.r")
    public static boolean[] field1019;

    @ObfuscatedName("bw.w")
    public static int field1020;

    @ObfuscatedName("bw.ai")
    public static float[] field1022;

    @ObfuscatedName("be.h")
    public static int[] field1036;

    @ObfuscatedName("be.v")
    public static int[] field1037;

    @ObfuscatedName("be.p")
    public static boolean[] field1039;

    @ObfuscatedName("h.io")
    public static int field104;

    @ObfuscatedName("bx.i")
    public static int field1054;

    @ObfuscatedName("bx.f")
    public static int field1057;

    @ObfuscatedName("h.iy")
    public static class170 field106;

    @ObfuscatedName("bx.e")
    public static boolean field1063;

    @ObfuscatedName("h.go")
    public static class170 field108;

    @ObfuscatedName("bp.eh")
    public static class225 field1096;

    @ObfuscatedName("bn.a")
    public static byte[][][] field1111;

    @ObfuscatedName("bn.bk")
    public static class185 field1112;

    @ObfuscatedName("bn.qg")
    public static int field1113;

    @ObfuscatedName("bb.w")
    public static int field1135;

    @ObfuscatedName("bb.q")
    public static float field1141;

    @ObfuscatedName("p.g")
    public static byte[][][] field118;

    @ObfuscatedName("bc.jv")
    public static int field1192;

    @ObfuscatedName("bz.a")
    public static short[] field1196;

    @ObfuscatedName("p.ce")
    public static class209 field120;

    @ObfuscatedName("bz.hd")
    public static int field1201;

    @ObfuscatedName("bt.w")
    public static int field1221;

    @ObfuscatedName("bt.h")
    public static boolean field1222;

    @ObfuscatedName("bt.c")
    public static int[] field1223;

    @ObfuscatedName("bt.qz")
    public static int field1224;

    @ObfuscatedName("l.en")
    public static class223[] field129;

    @ObfuscatedName("c.ec")
    public static class225[] field131;

    @ObfuscatedName("ca.m")
    public static int[] field1318;

    @ObfuscatedName("co.cw")
    public static int field1353;

    @ObfuscatedName("ch.bh")
    public static int field1358;

    @ObfuscatedName("c.mb")
    public static int field137;

    @ObfuscatedName("ch.bw")
    public static int field1379;

    @ObfuscatedName("ch.bq")
    public static int field1401;

    @ObfuscatedName("cd.bh")
    public static class185 field1426;

    @ObfuscatedName("cd.ar")
    public static String field1429;

    @ObfuscatedName("ci.r")
    public static int field1433;

    @ObfuscatedName("ci.c")
    public static int field1435;

    @ObfuscatedName("ci.h")
    public static int field1441;

    @ObfuscatedName("ci.p")
    public static int field1442;

    @ObfuscatedName("ci.m")
    public static int field1443;

    @ObfuscatedName("ci.l")
    public static int field1444;

    @ObfuscatedName("ci.u")
    public static int field1447;

    @ObfuscatedName("ci.j")
    public static int field1448;

    @ObfuscatedName("ci.y")
    public static class94 field1451;

    @ObfuscatedName("ck.d")
    public static String field1463;

    @ObfuscatedName("cr.u")
    public static int field1482;

    @ObfuscatedName("cr.aq")
    public static int field1485;

    @ObfuscatedName("cr.an")
    public static int field1489;

    @ObfuscatedName("m.h")
    public static class223 field149;

    @ObfuscatedName("cr.o")
    public static int field1491;

    @ObfuscatedName("cr.j")
    public static int field1492;

    @ObfuscatedName("cr.x")
    public static int field1493;

    @ObfuscatedName("cr.t")
    public static int field1495;

    @ObfuscatedName("cr.s")
    public static int field1496;

    @ObfuscatedName("cr.z")
    public static int field1498;

    @ObfuscatedName("cr.b")
    public static int field1499;

    @ObfuscatedName("cr.ak")
    public static int field1501;

    @ObfuscatedName("cr.bx")
    public static int field1504;

    @ObfuscatedName("m.bw")
    public static class185 field151;

    @ObfuscatedName("cr.bs")
    public static int field1510;

    @ObfuscatedName("cr.y")
    public static int field1514;

    @ObfuscatedName("cr.be")
    public static int field1518;

    @ObfuscatedName("cr.ai")
    public static int field1522;

    @ObfuscatedName("m.ag")
    public static class185 field153;

    @ObfuscatedName("cr.ba")
    public static boolean[][] field1530;

    @ObfuscatedName("cr.d")
    public static int field1531;

    @ObfuscatedName("cr.bd")
    public static int field1534;

    @ObfuscatedName("cr.bm")
    public static int field1535;

    @ObfuscatedName("cr.bk")
    public static int field1536;

    @ObfuscatedName("cw.ax")
    public static class111 field1537;

    @ObfuscatedName("cw.qs")
    public static Font field1538;

    @ObfuscatedName("cw.p")
    public static class170 field1539;

    @ObfuscatedName("cq.pj")
    public static int field1549;

    @ObfuscatedName("cq.gt")
    public static class170 field1551;

    @ObfuscatedName("cq.h")
    public static int[] field1553;

    @ObfuscatedName("cb.ic")
    public static class170 field1559;

    @ObfuscatedName("cx.ep")
    public static class225[] field1564;

    @ObfuscatedName("cf.pb")
    public static short[] field1568;

    @ObfuscatedName("cf.ns")
    public static int field1579;

    @ObfuscatedName("cc.da")
    public static int field1600;

    @ObfuscatedName("cc.ak")
    public static int[] field1614;

    @ObfuscatedName("r.ek")
    public static class225[] field163;

    @ObfuscatedName("ce.f")
    public static long field1639;

    @ObfuscatedName("r.dd")
    public static int field164;

    @ObfuscatedName("ce.q")
    public static class223 field1640;

    @ObfuscatedName("ce.hx")
    public static int field1644;

    @ObfuscatedName("cm.ad")
    public static boolean field1663;

    @ObfuscatedName("cm.e")
    public static String field1664;

    @ObfuscatedName("cm.i")
    public static String field1666;

    @ObfuscatedName("dd.k")
    public static File field1670;

    @ObfuscatedName("dd.g")
    public static File field1671;

    @ObfuscatedName("dd.qn")
    public static int field1680;

    @ObfuscatedName("dd.nt")
    public static class58 field1681;

    @ObfuscatedName("dq.bm")
    public static class185 field1707;

    @ObfuscatedName("de.g")
    public static class30[] field1713;

    @ObfuscatedName("de.e")
    public static File field1718;

    @ObfuscatedName("u.dw")
    public static int[] field172;

    @ObfuscatedName("dp.i")
    public static Applet field1720;

    @ObfuscatedName("dp.v")
    public static class229 field1725;

    @ObfuscatedName("dp.ql")
    public static int field1727;

    @ObfuscatedName("u.n")
    public static class225 field173;

    @ObfuscatedName("dm.qc")
    public static int field1730;

    @ObfuscatedName("dh.qy")
    public static Canvas field1748;

    @ObfuscatedName("dj.g")
    public static int[] field1749;

    @ObfuscatedName("dj.b")
    public static int[] field1750;

    @ObfuscatedName("dj.cu")
    public static class209 field1754;

    @ObfuscatedName("dv.qj")
    public static int field1756;

    @ObfuscatedName("dv.l")
    public static class61 field1761;

    @ObfuscatedName("j.kf")
    public static class113 field177;

    @ObfuscatedName("db.pt")
    public static Clipboard field1815;

    @ObfuscatedName("db.js")
    public static int field1816;

    @ObfuscatedName("j.d")
    public static int[] field182;

    @ObfuscatedName("dl.br")
    public static class185 field1838;

    @ObfuscatedName("dl.bd")
    public static class185 field1839;

    @ObfuscatedName("j.ft")
    public static int field184;

    @ObfuscatedName("df.g")
    public static int field1840;

    @ObfuscatedName("df.ne")
    public static int field1843;

    @ObfuscatedName("df.n")
    public static int field1844;

    @ObfuscatedName("df.ci")
    public static class103 field1845;

    @ObfuscatedName("df.qq")
    public static int field1850;

    @ObfuscatedName("dy.ai")
    public static int[] field1851;

    @ObfuscatedName("x.u")
    public static int field186;

    @ObfuscatedName("x.df")
    public static byte[][] field187;

    @ObfuscatedName("es.ae")
    public static class185 field1898;

    @ObfuscatedName("eg.f")
    public static class183 field1913;

    @ObfuscatedName("eg.k")
    public static class140 field1914;

    @ObfuscatedName("eg.q")
    public static int field1916;

    @ObfuscatedName("eg.v")
    public static int field1917;

    @ObfuscatedName("eg.p")
    public static class145 field1918;

    @ObfuscatedName("eg.e")
    public static class183 field1919;

    @ObfuscatedName("eg.i")
    public static class183 field1920;

    @ObfuscatedName("ef.pn")
    public static class117 field1959;

    @ObfuscatedName("ef.be")
    public static class185 field1975;

    @ObfuscatedName("ep.ei")
    public static class225[] field1993;

    @ObfuscatedName("ep.v")
    public static class223 field1997;

    @ObfuscatedName("ep.d")
    public static class154 field2001;

    @ObfuscatedName("em.m")
    public static int field2007;

    @ObfuscatedName("ei.n")
    public static class183 field2015;

    @ObfuscatedName("d.ac")
    public static long field202;

    @ObfuscatedName("d.ks")
    public static class47 field203;

    @ObfuscatedName("ex.nv")
    public static int field2039;

    @ObfuscatedName("en.f")
    public static class183 field2042;

    @ObfuscatedName("en.pf")
    public static class31 field2045;

    @ObfuscatedName("ed.i")
    public static class183 field2049;

    @ObfuscatedName("y.dq")
    public static int field209;

    @ObfuscatedName("et.fx")
    public static int field2098;

    @ObfuscatedName("ey.nu")
    public static int field2106;

    @ObfuscatedName("ey.w")
    public static byte[][] field2107;

    @ObfuscatedName("ej.i")
    public static long field2109;

    @ObfuscatedName("ej.e")
    public static long field2110;

    @ObfuscatedName("ej.h")
    public static class209 field2113;

    @ObfuscatedName("ft.ck")
    public static class111 field2119;

    @ObfuscatedName("ft.ga")
    public static class170 field2120;

    @ObfuscatedName("ft.f")
    public static class223 field2121;

    @ObfuscatedName("fa.u")
    public static String[] field2124;

    @ObfuscatedName("fx.mg")
    public static class225 field2132;

    @ObfuscatedName("fg.ir")
    public static int field2133;

    @ObfuscatedName("y.hc")
    public static int field215;

    @ObfuscatedName("fy.c")
    public static class182 field2150;

    @ObfuscatedName("fm.qr")
    public static Frame field2163;

    @ObfuscatedName("y.bh")
    public static class223[] field217;

    @ObfuscatedName("fe.v")
    public static short[][] field2184;

    @ObfuscatedName("fr.r")
    public static int field2189;

    @ObfuscatedName("y.mm")
    public static byte field219;

    @ObfuscatedName("fr.bo")
    public static int field2190;

    @ObfuscatedName("fr.q")
    public static int[] field2192;

    @ObfuscatedName("ff.f")
    public static int[] field2194;

    @ObfuscatedName("ff.ef")
    public static class223[] field2196;

    @ObfuscatedName("fq.f")
    public static class183 field2200;

    @ObfuscatedName("fq.k")
    public static class183 field2201;

    @ObfuscatedName("fq.g")
    public static class183 field2202;

    @ObfuscatedName("s.bs")
    public static class185 field221;

    @ObfuscatedName("fq.e")
    public static boolean[] field2230;

    @ObfuscatedName("s.q")
    public static class180 field227;

    @ObfuscatedName("s.dn")
    public static int field228;

    @ObfuscatedName("fq.i")
    public static class170[][] field2298;

    @ObfuscatedName("s.nw")
    public static class66 field230;

    @ObfuscatedName("s.r")
    public static String[] field232;

    @ObfuscatedName("s.iz")
    public static int field233;

    @ObfuscatedName("s.fa")
    public static int field234;

    @ObfuscatedName("fu.gz")
    public static int field2355;

    @ObfuscatedName("z.iu")
    public static class39 field261;

    @ObfuscatedName("fz.n")
    public static class183 field2644;

    @ObfuscatedName("z.fq")
    public static int field267;

    @ObfuscatedName("fs.eg")
    public static class225 field2679;

    @ObfuscatedName("fs.ny")
    public static int field2681;

    @ObfuscatedName("fo.dl")
    public static byte[][] field2691;

    @ObfuscatedName("fn.pw")
    public static class231 field2696;

    @ObfuscatedName("fn.bp")
    public static class185 field2697;

    @ObfuscatedName("fc.pd")
    public static GarbageCollectorMXBean field2700;

    @ObfuscatedName("b.em")
    public static class225[] field274;

    @ObfuscatedName("gm.bq")
    public static class223[] field2744;

    @ObfuscatedName("gv.i")
    public static class111 field2751;

    @ObfuscatedName("gv.l")
    public static boolean field2757;

    @ObfuscatedName("gv.r")
    public static class154 field2759;

    @ObfuscatedName("b.cr")
    public static char field276;

    @ObfuscatedName("gc.k")
    public static class64 field2771;

    @ObfuscatedName("gc.jt")
    public static class170[] field2773;

    @ObfuscatedName("gc.i")
    public static class183 field2775;

    @ObfuscatedName("gr.i")
    public static class183 field2776;

    @ObfuscatedName("gr.e")
    public static int field2780;

    @ObfuscatedName("gr.ip")
    public static int field2781;

    @ObfuscatedName("gi.i")
    public static class183 field2782;

    @ObfuscatedName("gb.i")
    public static class183 field2788;

    @ObfuscatedName("gj.e")
    public static class183 field2793;

    @ObfuscatedName("gj.i")
    public static class183 field2807;

    @ObfuscatedName("go.i")
    public static class183 field2814;

    @ObfuscatedName("gh.f")
    public static int field2818;

    @ObfuscatedName("gh.e")
    public static class183 field2822;

    @ObfuscatedName("gh.i")
    public static class183 field2827;

    @ObfuscatedName("client.e")
    public static client field283;

    @ObfuscatedName("gn.e")
    public static class183 field2832;

    @ObfuscatedName("gn.i")
    public static class183 field2833;

    @ObfuscatedName("ga.i")
    public static class183 field2862;

    @ObfuscatedName("gu.i")
    public static class183 field2867;

    @ObfuscatedName("client.n")
    public static class179 field287;

    @ObfuscatedName("gu.e")
    public static class183 field2870;

    @ObfuscatedName("gu.f")
    public static class183 field2889;

    @ObfuscatedName("gu.db")
    public static int[][] field2892;

    @ObfuscatedName("gy.f")
    public static class183 field2894;

    @ObfuscatedName("gy.ie")
    public static int field2942;

    @ObfuscatedName("gx.g")
    public static class183 field2944;

    @ObfuscatedName("gx.a")
    public static int field2949;

    @ObfuscatedName("gx.k")
    public static class183 field2953;

    @ObfuscatedName("i.ag")
    public static class223[] field3;

    @ObfuscatedName("f.fk")
    public static int field30;

    @ObfuscatedName("gw.e")
    public static class183 field3000;

    @ObfuscatedName("gw.i")
    public static class183 field3005;

    @ObfuscatedName("ge.i")
    public static class183 field3038;

    @ObfuscatedName("ge.je")
    public static int field3048;

    @ObfuscatedName("ge.as")
    public static int field3049;

    @ObfuscatedName("gd.pp")
    public static long field3062;

    @ObfuscatedName("gd.e")
    public static class183 field3066;

    @ObfuscatedName("gp.e")
    public static String field3071;

    @ObfuscatedName("gf.nz")
    public static int field3073;

    @ObfuscatedName("gg.ba")
    public static class185 field3080;

    @ObfuscatedName("gl.e")
    public static class183 field3090;

    @ObfuscatedName("hk.v")
    public static class223[] field3096;

    @ObfuscatedName("hu.w")
    public static class223[] field3114;

    @ObfuscatedName("hu.i")
    public static class146 field3115;

    @ObfuscatedName("hm.v")
    public static int[] field3117;

    @ObfuscatedName("hm.l")
    public static int[] field3119;

    @ObfuscatedName("client.bx")
    public static class185 field315;

    @ObfuscatedName("hb.q")
    public static short[][] field3170;

    @ObfuscatedName("hn.ak")
    public static int field3173;

    @ObfuscatedName("hn.o")
    public static int[] field3174;

    @ObfuscatedName("hn.ai")
    public static int field3176;

    @ObfuscatedName("client.bt")
    public static int field321;

    @ObfuscatedName("ht.i")
    public static int field3215;

    @ObfuscatedName("ht.e")
    public static int field3216;

    @ObfuscatedName("ht.f")
    public static int field3217;

    @ObfuscatedName("ht.k")
    public static int[] field3218;

    @ObfuscatedName("ht.n")
    public static int[] field3219;

    @ObfuscatedName("hf.o")
    public static int[] field3256;

    @ObfuscatedName("client.cy")
    public static class111 field327;

    @ObfuscatedName("hp.i")
    public static class183 field3281;

    @ObfuscatedName("k.c")
    public static String field34;

    @ObfuscatedName("client.dc")
    public static int[] field347;

    @ObfuscatedName("client.dy")
    public static class88 field348;

    @ObfuscatedName("k.nq")
    public static int field35;

    @ObfuscatedName("g.hh")
    public static int field36;

    @ObfuscatedName("i.nk")
    public static class52 field4;

    @ObfuscatedName("g.dt")
    public static int[] field42;

    @ObfuscatedName("g.b")
    public static int[] field45;

    @ObfuscatedName("i.w")
    public static short[] field5;

    @ObfuscatedName("client.de")
    public static int field504;

    @ObfuscatedName("n.qu")
    public static class110 field52;

    @ObfuscatedName("n.by")
    public static String field55;

    @ObfuscatedName("client.nx")
    public static class58 field569;

    @ObfuscatedName("ak.z")
    public static class21 field597;

    @ObfuscatedName("a.aa")
    public static class103 field61;

    @ObfuscatedName("a.v")
    public static class27 field65;

    @ObfuscatedName("q.w")
    public static int[][] field66;

    @ObfuscatedName("aq.p")
    public static int[] field663;

    @ObfuscatedName("q.bz")
    public static int field67;

    @ObfuscatedName("an.mp")
    public static byte field684;

    @ObfuscatedName("ay.a")
    public static int field694;

    @ObfuscatedName("ap.po")
    public static int field699;

    @ObfuscatedName("aj.h")
    public static class170 field719;

    @ObfuscatedName("aj.k")
    public static String[] field725;

    @ObfuscatedName("aw.nl")
    public static int field745;

    @ObfuscatedName("am.px")
    public static class2 field750;

    @ObfuscatedName("am.m")
    public static String field757;

    @ObfuscatedName("am.n")
    public static boolean field758;

    @ObfuscatedName("av.k")
    public static byte[][][] field764;

    @ObfuscatedName("af.y")
    public static String field768;

    @ObfuscatedName("w.ma")
    public static class25[] field77;

    @ObfuscatedName("af.du")
    public static int field778;

    @ObfuscatedName("az.ff")
    public static int field786;

    @ObfuscatedName("az.bw")
    public static class223 field790;

    @ObfuscatedName("az.bf")
    public static FontMetrics field792;

    @ObfuscatedName("i.bl")
    public static class185 field8;

    @ObfuscatedName("ad.f")
    public static int field805;

    @ObfuscatedName("ad.s")
    public static String field806;

    @ObfuscatedName("ad.hw")
    public static class24 field810;

    @ObfuscatedName("ad.fg")
    public static int field811;

    @ObfuscatedName("v.ex")
    public static class223[] field82;

    @ObfuscatedName("ab.n")
    public static int field820;

    @ObfuscatedName("ab.cp")
    public static class209 field822;

    @ObfuscatedName("al.k")
    public static class223 field827;

    @ObfuscatedName("al.g")
    public static class223[] field828;

    @ObfuscatedName("al.x")
    public static int[] field834;

    @ObfuscatedName("al.y")
    public static int[] field835;

    @ObfuscatedName("al.i")
    public static boolean field836;

    @ObfuscatedName("v.rg")
    public static boolean field84;

    @ObfuscatedName("v.c")
    public static class73[] field85;

    @ObfuscatedName("al.s")
    public static int[] field854;

    @ObfuscatedName("al.pa")
    public static class104 field856;

    @ObfuscatedName("al.pq")
    public static int field858;

    @ObfuscatedName("v.ee")
    public static class225[] field86;

    @ObfuscatedName("al.au")
    public static class225[] field861;

    @ObfuscatedName("al.a")
    public static class225 field862;

    @ObfuscatedName("v.bc")
    public static int field88;

    @ObfuscatedName("ar.lc")
    public static class217 field890;

    @ObfuscatedName("ar.nh")
    public static int field892;

    @ObfuscatedName("ar.ri")
    public static String field893;

    @ObfuscatedName("ar.qh")
    public static int field897;

    @ObfuscatedName("ar.a")
    public static int[] field898;

    @ObfuscatedName("at.eq")
    public static class225[] field899;

    @ObfuscatedName("at.au")
    public static class185 field901;

    @ObfuscatedName("h.n")
    public static byte[][][] field92;

    @ObfuscatedName("ax.nn")
    public static int field922;

    @ObfuscatedName("ax.at")
    public static class103 field923;

    @ObfuscatedName("ao.qm")
    public static Image field926;

    @ObfuscatedName("h.q")
    public static byte[][][] field93;

    @ObfuscatedName("ao.qw")
    public static class221 field935;

    @ObfuscatedName("ah.bq")
    public static class185 field948;

    @ObfuscatedName("h.m")
    public static int[][][] field98;

    @ObfuscatedName("bw.ay")
    public static int[] field992;

    @ObfuscatedName("bw.a")
    public static byte[] field995;

    @ObfuscatedName("bw.q")
    public static int field996;

    @ObfuscatedName("bw.aq")
    public static float[] field997;

    @ObfuscatedName("bw.v")
    public static int field998;

    @ObfuscatedName("bw.h")
    public static int field999;

    @ObfuscatedName("cp.i(Ljava/applet/Applet;Ljava/lang/String;I)V")
    public static void method1803(Applet arg0, String arg1) throws Throwable {
        JSObject.getWindow(arg0).eval(arg1);
    }

    @ObfuscatedName("aj.e([Ljava/lang/String;[SIIB)V")
    public static void method654(String[] arg0, short[] arg1, int arg2, int arg3) {
        if (arg2 >= arg3) {
            return;
        }
        int var4 = (arg2 + arg3) / 2;
        int var5 = arg2;
        String var6 = arg0[var4];
        arg0[var4] = arg0[arg3];
        arg0[arg3] = var6;
        short var7 = arg1[var4];
        arg1[var4] = arg1[arg3];
        arg1[arg3] = var7;
        for (int var8 = arg2; var8 < arg3; var8++) {
            if (var6 == null || arg0[var8] != null && arg0[var8].compareTo(var6) < (var8 & 0x1)) {
                String var9 = arg0[var8];
                arg0[var8] = arg0[var5];
                arg0[var5] = var9;
                short var10 = arg1[var8];
                arg1[var8] = arg1[var5];
                arg1[var5++] = var10;
            }
        }
        arg0[arg3] = arg0[var5];
        arg0[var5] = var6;
        arg1[arg3] = arg1[var5];
        arg1[var5] = var7;
        method654(arg0, arg1, arg2, var5 - 1);
        method654(arg0, arg1, var5 + 1, arg3);
    }

    @ObfuscatedName("df.e(Ljava/lang/CharSequence;Lhc;B)Ljava/lang/String;")
    public static String method2096(CharSequence arg0, class229 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3) {
            char var4 = arg0.charAt(var2);
            boolean var5 = var4 == 160 || var4 == ' ' || var4 == '_' || var4 == '-';
            if (!var5) {
                break;
            }
            var2++;
        }
        while (var3 > var2) {
            char var6 = arg0.charAt(var3 - 1);
            boolean var7 = var6 == 160 || var6 == ' ' || var6 == '_' || var6 == '-';
            if (!var7) {
                break;
            }
            var3--;
        }
        int var8 = var3 - var2;
        if (var8 < 1 || var8 > class205.method582(arg1)) {
            return null;
        }
        StringBuilder var9 = new StringBuilder(var8);
        for (int var10 = var2; var10 < var3; var10++) {
            char var11 = arg0.charAt(var10);
            boolean var12;
            if (Character.isISOControl(var11)) {
                var12 = false;
            } else {
                boolean var13 = var11 >= '0' && var11 <= '9' || var11 >= 'A' && var11 <= 'Z' || var11 >= 'a' && var11 <= 'z';
                if (var13) {
                    var12 = true;
                } else {
                    char[] var14 = class205.field3078;
                    int var15 = 0;
                    label84: while (true) {
                        if (var15 >= var14.length) {
                            char[] var17 = class205.field3079;
                            for (int var18 = 0; var18 < var17.length; var18++) {
                                char var19 = var17[var18];
                                if (var11 == var19) {
                                    var12 = true;
                                    break label84;
                                }
                            }
                            var12 = false;
                            break;
                        }
                        char var16 = var14[var15];
                        if (var11 == var16) {
                            var12 = true;
                            break;
                        }
                        var15++;
                    }
                }
            }
            if (var12) {
                char var20 = class205.method2934(var11);
                if (var20 != 0) {
                    var9.append(var20);
                }
            }
        }
        if (var9.length() == 0) {
            return null;
        } else {
            return var9.toString();
        }
    }

    @ObfuscatedName("bt.k(Ljava/lang/CharSequence;I)I")
    public static int method1372(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            var2 = (var2 << 5) - var2 + class204.method2816(arg0.charAt(var3));
        }
        return var2;
    }

    @ObfuscatedName("j.e(JLjava/lang/String;I)I")
    public static final int method186(long arg0, String arg1) {
        Random var3 = new Random();
        class154 var4 = new class154(128);
        class154 var5 = new class154(128);
        int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
        var4.method2746(10);
        for (int var7 = 0; var7 < 4; var7++) {
            var4.method2562(var3.nextInt());
        }
        var4.method2562(var6[0]);
        var4.method2562(var6[1]);
        var4.method2733(arg0);
        var4.method2733(0L);
        for (int var8 = 0; var8 < 4; var8++) {
            var4.method2562(var3.nextInt());
        }
        var4.method2594(class37.field770, class37.field766);
        var5.method2746(10);
        for (int var9 = 0; var9 < 3; var9++) {
            var5.method2562(var3.nextInt());
        }
        var5.method2733(var3.nextLong());
        var5.method2563(var3.nextLong());
        class105.method34(var5);
        var5.method2733(var3.nextLong());
        var5.method2594(class37.field770, class37.field766);
        int var10 = method1050(arg1);
        if (var10 % 8 != 0) {
            var10 += 8 - var10 % 8;
        }
        class154 var11 = new class154(var10);
        var11.method2571(arg1);
        var11.field2091 = var10;
        var11.method2636(var6);
        class154 var12 = new class154(var11.field2091 + var5.field2091 + var4.field2091 + 5);
        var12.method2746(2);
        var12.method2746(var4.field2091);
        var12.method2567(var4.field2094, 0, var4.field2091);
        var12.method2746(var5.field2091);
        var12.method2567(var5.field2094, 0, var5.field2091);
        var12.method2560(var11.field2091);
        var12.method2567(var11.field2094, 0, var11.field2091);
        byte[] var13 = var12.field2094;
        int var14 = var13.length;
        StringBuilder var15 = new StringBuilder();
        for (int var16 = 0; var16 < var14; var16 += 3) {
            int var17 = var13[var16] & 0xFF;
            var15.append(class207.field3085[var17 >>> 2]);
            if (var16 < var14 - 1) {
                int var18 = var13[var16 + 1] & 0xFF;
                var15.append(class207.field3085[(var17 & 0x3) << 4 | var18 >>> 4]);
                if (var16 < var14 - 2) {
                    int var19 = var13[var16 + 2] & 0xFF;
                    var15.append(class207.field3085[(var18 & 0xF) << 2 | var19 >>> 6]).append(class207.field3085[var19 & 0x3F]);
                } else {
                    var15.append(class207.field3085[(var18 & 0xF) << 2]).append("=");
                }
            } else {
                var15.append(class207.field3085[(var17 & 0x3) << 4]).append("==");
            }
        }
        String var20 = var15.toString();
        String var22 = var20;
        try {
            URL var23 = new URL(client.method86("services", false) + "m=accountappeal/login.ws");
            URLConnection var24 = var23.openConnection();
            var24.setDoInput(true);
            var24.setDoOutput(true);
            var24.setConnectTimeout(5000);
            OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
            var25.write("data2=" + class232.method3909(var22) + "&dest=" + class232.method3909("passwordchoice.ws"));
            var25.flush();
            InputStream var26 = var24.getInputStream();
            class154 var27 = new class154(new byte[1000]);
            do {
                int var28 = var26.read(var27.field2094, var27.field2091, 1000 - var27.field2091);
                if (var28 == -1) {
                    var25.close();
                    var26.close();
                    String var29 = new String(var27.field2094);
                    if (var29.startsWith("OFFLINE")) {
                        return 4;
                    } else if (var29.startsWith("WRONG")) {
                        return 7;
                    } else if (var29.startsWith("RELOAD")) {
                        return 3;
                    } else if (var29.startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    } else {
                        var27.method2651(var6);
                        while (var27.field2091 > 0 && var27.field2094[var27.field2091 - 1] == 0) {
                            var27.field2091--;
                        }
                        String var30 = new String(var27.field2094, 0, var27.field2091);
                        if (!class37.method195(var30)) {
                            return 5;
                        }
                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                            try {
                                Desktop.getDesktop().browse(new URI(var30));
                                return 2;
                            } catch (Exception var33) {
                            }
                        }
                        if (class115.field1785.startsWith("win")) {
                            class115.method1450(var30, 0);
                        } else if (class115.field1785.startsWith("mac")) {
                            class115.method678(var30, 1, "openjs");
                        } else {
                            class115.method1450(var30, 2);
                        }
                        return 2;
                    }
                }
                var27.field2091 += var28;
            } while (var27.field2091 < 1000);
            return 5;
        } catch (Throwable var34) {
            var34.printStackTrace();
            return 5;
        }
    }

    @ObfuscatedName("bx.v(Ljava/lang/String;I)I")
    public static int method1050(String arg0) {
        return arg0.length() + 1;
    }

    @ObfuscatedName("j.q(Let;IIIIIIS)V")
    public static final void method185(class154 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var9 = arg0.method2573();
                if (var9 == 0) {
                    break;
                }
                if (var9 == 1) {
                    arg0.method2573();
                    break;
                }
                if (var9 <= 49) {
                    arg0.method2573();
                }
            }
            return;
        }
        class11.field89[arg1][arg2][arg3] = 0;
        while (true) {
            int var7 = arg0.method2573();
            if (var7 == 0) {
                if (arg1 == 0) {
                    class11.field100[0][arg2][arg3] = -class11.method2979(arg2 + 932731 + arg4, arg3 + 556238 + arg5) * 8;
                } else {
                    class11.field100[arg1][arg2][arg3] = class11.field100[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var7 == 1) {
                int var8 = arg0.method2573();
                if (var8 == 1) {
                    var8 = 0;
                }
                if (arg1 == 0) {
                    class11.field100[0][arg2][arg3] = -var8 * 8;
                } else {
                    class11.field100[arg1][arg2][arg3] = class11.field100[arg1 - 1][arg2][arg3] - var8 * 8;
                }
                break;
            }
            if (var7 <= 49) {
                field118[arg1][arg2][arg3] = arg0.method2574();
                field92[arg1][arg2][arg3] = (byte) ((var7 - 2) / 4);
                field1111[arg1][arg2][arg3] = (byte) (var7 - 2 + arg6 & 0x3);
            } else if (var7 <= 81) {
                class11.field89[arg1][arg2][arg3] = (byte) (var7 - 49);
            } else {
                field764[arg1][arg2][arg3] = (byte) (var7 - 81);
            }
        }
    }

    @ObfuscatedName("ab.f(Lfx;B)I")
    public static int method706(class160 arg0) {
        int var1 = arg0.method2785(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2785(5);
        } else if (var1 == 2) {
            var2 = arg0.method2785(8);
        } else {
            var2 = arg0.method2785(11);
        }
        return var2;
    }

    @ObfuscatedName("i.q(B)V")
    public static void method3() {
        try {
            File var0 = new File(field806, "random.dat");
            if (var0.exists()) {
                class105.field1669 = new class73(new class74(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < field2124.length; var1++) {
                    for (int var2 = 0; var2 < field232.length; var2++) {
                        File var3 = new File(field232[var2] + field2124[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            class105.field1669 = new class73(new class74(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (class105.field1669 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                class105.field1669 = new class73(new class74(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("r.c(B)V")
    public static void method173() {
        class198.field2895.method2155();
        class198.field2896.method2155();
        class198.field2897.method2155();
        class198.field2898.method2155();
    }

    @ObfuscatedName("w.x(III)I")
    public static final int method98(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("bm.bk(IIIIIIIIIB)V")
    public static final void method1077(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) client.field371.method2209(); var10 != null; var10 = (class26) client.field371.method2211()) {
            if (var10.field587 == arg0 && var10.field575 == arg1 && var10.field582 == arg2 && var10.field574 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field587 = arg0;
            var9.field574 = arg3;
            var9.field575 = arg1;
            var9.field582 = arg2;
            client.method1804(var9);
            client.field371.method2226(var9);
        }
        var9.field580 = arg4;
        var9.field573 = arg5;
        var9.field581 = arg6;
        var9.field583 = arg7;
        var9.field579 = arg8;
    }

    @ObfuscatedName("dv.di(Ljava/lang/String;I)V")
    public static final void method1938(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = method2096(arg0, field1725);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < client.field554; var2++) {
            class15 var3 = client.field556[var2];
            String var4 = var3.field156;
            String var5 = method2096(var4, field1725);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                client.field554--;
                for (int var7 = var2; var7 < client.field554; var7++) {
                    client.field556[var7] = client.field556[var7 + 1];
                }
                client.field480 = client.field472;
                client.field295.method2783(163);
                client.field295.method2746(method1050(arg0));
                client.field295.method2571(arg0);
                break;
            }
        }
    }
}
