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
import java.net.Socket;
import java.util.Iterator;

public class Statics {

    @ObfuscatedName("b.dc")
    public static int field1;

    @ObfuscatedName("bz.ae")
    public static float[] field1000;

    @ObfuscatedName("bz.s")
    public static int field1002;

    @ObfuscatedName("bz.r")
    public static int field1003;

    @ObfuscatedName("bz.a")
    public static class57[] field1007;

    @ObfuscatedName("bz.v")
    public static class65[] field1008;

    @ObfuscatedName("bz.o")
    public static boolean[] field1010;

    @ObfuscatedName("bz.d")
    public static class70[] field1011;

    @ObfuscatedName("bz.f")
    public static class53[] field1012;

    @ObfuscatedName("bz.aa")
    public static int[] field1016;

    @ObfuscatedName("bz.h")
    public static float[] field1017;

    @ObfuscatedName("bz.u")
    public static float[] field1018;

    @ObfuscatedName("bz.m")
    public static float[] field1019;

    @ObfuscatedName("bz.p")
    public static float[] field1020;

    @ObfuscatedName("bz.aq")
    public static float[] field1021;

    @ObfuscatedName("bz.aj")
    public static float[] field1022;

    @ObfuscatedName("bz.q")
    public static int[] field1023;

    @ObfuscatedName("bz.au")
    public static int[] field1024;

    @ObfuscatedName("bz.k")
    public static int field1026;

    @ObfuscatedName("bz.g")
    public static byte[] field1028;

    @ObfuscatedName("k.a")
    public static int[] field103;

    @ObfuscatedName("ba.k")
    public static int[] field1038;

    @ObfuscatedName("ba.t")
    public static int[] field1040;

    @ObfuscatedName("ba.f")
    public static boolean[] field1045;

    @ObfuscatedName("bf.e")
    public static boolean field1047;

    @ObfuscatedName("bf.c")
    public static int field1059;

    @ObfuscatedName("k.j")
    public static int field106;

    @ObfuscatedName("bf.al")
    public static class185 field1069;

    @ObfuscatedName("k.f")
    public static int[] field107;

    @ObfuscatedName("bf.ij")
    public static class39 field1070;

    @ObfuscatedName("bf.b")
    public static int field1072;

    @ObfuscatedName("k.v")
    public static int[] field108;

    @ObfuscatedName("bv.dy")
    public static int field1088;

    @ObfuscatedName("k.l")
    public static byte[][][] field109;

    @ObfuscatedName("k.ft")
    public static int field110;

    @ObfuscatedName("bg.m")
    public static int[] field1100;

    @ObfuscatedName("bg.cv")
    public static int field1101;

    @ObfuscatedName("bp.oa")
    public static int field1113;

    @ObfuscatedName("bp.mm")
    public static byte field1119;

    @ObfuscatedName("bl.s")
    public static float field1141;

    @ObfuscatedName("bl.r")
    public static int field1148;

    @ObfuscatedName("bj.ix")
    public static int field1187;

    @ObfuscatedName("k.ir")
    public static int field120;

    @ObfuscatedName("by.a")
    public static class61 field1200;

    @ObfuscatedName("by.ay")
    public static class111 field1205;

    @ObfuscatedName("by.ey")
    public static class225[] field1209;

    @ObfuscatedName("bx.rv")
    public static String field1212;

    @ObfuscatedName("bx.pd")
    public static Clipboard field1217;

    @ObfuscatedName("f.s")
    public static byte[][][] field127;

    @ObfuscatedName("f.kv")
    public static class47 field128;

    @ObfuscatedName("ch.t")
    public static short[][] field1303;

    @ObfuscatedName("f.bc")
    public static class185 field131;

    @ObfuscatedName("cp.d")
    public static int[] field1318;

    @ObfuscatedName("a.k")
    public static boolean field135;

    @ObfuscatedName("ct.qd")
    public static int field1357;

    @ObfuscatedName("ct.ci")
    public static char field1359;

    @ObfuscatedName("co.bz")
    public static int field1369;

    @ObfuscatedName("co.bu")
    public static int field1372;

    @ObfuscatedName("co.bd")
    public static int field1389;

    @ObfuscatedName("a.bp")
    public static class185 field139;

    @ObfuscatedName("a.r")
    public static short[] field142;

    @ObfuscatedName("cl.n")
    public static String field1427;

    @ObfuscatedName("cl.nz")
    public static class52 field1431;

    @ObfuscatedName("cn.a")
    public static int field1437;

    @ObfuscatedName("cn.i")
    public static int field1438;

    @ObfuscatedName("cn.k")
    public static int field1444;

    @ObfuscatedName("cn.f")
    public static int field1449;

    @ObfuscatedName("cn.v")
    public static int field1450;

    @ObfuscatedName("cn.d")
    public static int field1451;

    @ObfuscatedName("cn.o")
    public static int field1452;

    @ObfuscatedName("cn.q")
    public static int field1453;

    @ObfuscatedName("cn.n")
    public static class94 field1457;

    @ObfuscatedName("ca.re")
    public static boolean field1469;

    @ObfuscatedName("cb.a")
    public static boolean field1473;

    @ObfuscatedName("cb.t")
    public static class27 field1476;

    @ObfuscatedName("ci.ba")
    public static boolean[][] field1488;

    @ObfuscatedName("ci.q")
    public static int field1496;

    @ObfuscatedName("ci.i")
    public static int field1497;

    @ObfuscatedName("ci.bf")
    public static int field1498;

    @ObfuscatedName("ci.z")
    public static int field1499;

    @ObfuscatedName("ci.n")
    public static int field1500;

    @ObfuscatedName("ci.w")
    public static int field1501;

    @ObfuscatedName("ci.h")
    public static int field1502;

    @ObfuscatedName("ci.u")
    public static int field1503;

    @ObfuscatedName("ci.x")
    public static int field1504;

    @ObfuscatedName("ci.p")
    public static int field1505;

    @ObfuscatedName("ci.aq")
    public static int field1506;

    @ObfuscatedName("ci.ae")
    public static int field1508;

    @ObfuscatedName("ci.bv")
    public static int field1509;

    @ObfuscatedName("ci.aj")
    public static int field1518;

    @ObfuscatedName("ci.bc")
    public static int field1519;

    @ObfuscatedName("ci.m")
    public static int field1530;

    @ObfuscatedName("ci.au")
    public static int field1537;

    @ObfuscatedName("ci.be")
    public static int field1538;

    @ObfuscatedName("ci.bq")
    public static int field1539;

    @ObfuscatedName("ci.bh")
    public static int field1542;

    @ObfuscatedName("cv.hq")
    public static int field1543;

    @ObfuscatedName("cv.g")
    public static byte[][][] field1545;

    @ObfuscatedName("v.qr")
    public static int field155;

    @ObfuscatedName("cx.qj")
    public static int field1559;

    @ObfuscatedName("v.al")
    public static class223[] field156;

    @ObfuscatedName("ck.pc")
    public static long field1560;

    @ObfuscatedName("ck.nq")
    public static class58 field1563;

    @ObfuscatedName("ck.g")
    public static class225 field1566;

    @ObfuscatedName("cm.cw")
    public static class209 field1567;

    @ObfuscatedName("cm.bn")
    public static int field1572;

    @ObfuscatedName("e.v")
    public static String field16;

    @ObfuscatedName("d.ba")
    public static class185 field160;

    @ObfuscatedName("cs.nj")
    public static int field1620;

    @ObfuscatedName("d.oo")
    public static int field163;

    @ObfuscatedName("cr.nt")
    public static int field1630;

    @ObfuscatedName("cg.b")
    public static Applet field1642;

    @ObfuscatedName("cg.bh")
    public static class185 field1644;

    @ObfuscatedName("cg.e")
    public static String field1647;

    @ObfuscatedName("cj.e")
    public static String field1657;

    @ObfuscatedName("cj.b")
    public static String field1660;

    @ObfuscatedName("de.d")
    public static int field1670;

    @ObfuscatedName("de.v")
    public static class73[] field1674;

    @ObfuscatedName("de.y")
    public static File field1681;

    @ObfuscatedName("de.l")
    public static File field1684;

    @ObfuscatedName("dy.hz")
    public static int field1720;

    @ObfuscatedName("db.r")
    public static class223[] field1726;

    @ObfuscatedName("dl.bu")
    public static class223[] field1731;

    @ObfuscatedName("dt.qw")
    public static int field1746;

    @ObfuscatedName("du.eh")
    public static class225 field1758;

    @ObfuscatedName("du.qb")
    public static class110 field1759;

    @ObfuscatedName("o.bv")
    public static class185 field176;

    @ObfuscatedName("ds.ps")
    public static short[] field1772;

    @ObfuscatedName("dg.hl")
    public static int field1807;

    @ObfuscatedName("q.d")
    public static String field182;

    @ObfuscatedName("q.by")
    public static int field183;

    @ObfuscatedName("dw.ai")
    public static boolean field1832;

    @ObfuscatedName("dw.y")
    public static int[] field1835;

    @ObfuscatedName("do.qx")
    public static Image field1840;

    @ObfuscatedName("do.eq")
    public static class225[] field1841;

    @ObfuscatedName("do.dj")
    public static byte[][] field1843;

    @ObfuscatedName("ew.et")
    public static class223[] field1897;

    @ObfuscatedName("eh.s")
    public static int field1899;

    @ObfuscatedName("e.de")
    public static int field19;

    @ObfuscatedName("i.pg")
    public static class2 field190;

    @ObfuscatedName("eh.e")
    public static class183 field1900;

    @ObfuscatedName("eh.l")
    public static class140 field1902;

    @ObfuscatedName("eh.t")
    public static int field1904;

    @ObfuscatedName("eh.g")
    public static int field1906;

    @ObfuscatedName("eh.b")
    public static class183 field1907;

    @ObfuscatedName("eh.r")
    public static int field1909;

    @ObfuscatedName("i.nu")
    public static int field191;

    @ObfuscatedName("eh.c")
    public static class183 field1910;

    @ObfuscatedName("eb.pn")
    public static int field1964;

    @ObfuscatedName("i.j")
    public static int[] field198;

    @ObfuscatedName("ey.kh")
    public static class113 field1989;

    @ObfuscatedName("ey.ii")
    public static class170 field1993;

    @ObfuscatedName("ey.qh")
    public static Canvas field1995;

    @ObfuscatedName("ey.o")
    public static String[] field1996;

    @ObfuscatedName("b.iv")
    public static int field2;

    @ObfuscatedName("ea.c")
    public static int field2008;

    @ObfuscatedName("ea.qg")
    public static class221 field2010;

    @ObfuscatedName("ev.cn")
    public static class103 field2022;

    @ObfuscatedName("et.j")
    public static byte[][][] field2024;

    @ObfuscatedName("et.gs")
    public static class170 field2029;

    @ObfuscatedName("es.bt")
    public static String field2030;

    @ObfuscatedName("ek.pt")
    public static class31 field2073;

    @ObfuscatedName("ep.b")
    public static long field2099;

    @ObfuscatedName("x.ca")
    public static class111 field210;

    @ObfuscatedName("ep.s")
    public static int[] field2100;

    @ObfuscatedName("fa.r")
    public static int[][] field2102;

    @ObfuscatedName("fa.az")
    public static class103 field2105;

    @ObfuscatedName("fa.t")
    public static class229 field2108;

    @ObfuscatedName("ff.do")
    public static class88 field2110;

    @ObfuscatedName("ff.bd")
    public static class185 field2111;

    @ObfuscatedName("ff.e")
    public static class183 field2112;

    @ObfuscatedName("ff.fj")
    public static int field2113;

    @ObfuscatedName("ff.ac")
    public static class225[] field2116;

    @ObfuscatedName("fg.y")
    public static int field2133;

    @ObfuscatedName("fk.bz")
    public static class185 field2150;

    @ObfuscatedName("fk.y")
    public static byte[][][] field2154;

    @ObfuscatedName("fl.d")
    public static int[][][] field2160;

    @ObfuscatedName("fp.g")
    public static short[] field2166;

    @ObfuscatedName("fp.s")
    public static short[][] field2168;

    @ObfuscatedName("fp.du")
    public static int[] field2176;

    @ObfuscatedName("fe.bu")
    public static class185 field2182;

    @ObfuscatedName("fj.b")
    public static class146 field2185;

    @ObfuscatedName("fh.y")
    public static class183 field2194;

    @ObfuscatedName("z.r")
    public static byte[][] field220;

    @ObfuscatedName("fh.l")
    public static class183 field2253;

    @ObfuscatedName("fh.c")
    public static class183 field2275;

    @ObfuscatedName("fh.e")
    public static boolean[] field2302;

    @ObfuscatedName("fh.b")
    public static class170[][] field2329;

    @ObfuscatedName("fq.dk")
    public static int[] field2336;

    @ObfuscatedName("w.ad")
    public static long field234;

    @ObfuscatedName("fu.ni")
    public static class66 field2352;

    @ObfuscatedName("fu.y")
    public static class223[] field2356;

    @ObfuscatedName("c.ge")
    public static class170 field24;

    @ObfuscatedName("h.t")
    public static int field240;

    @ObfuscatedName("h.eu")
    public static class225[] field241;

    @ObfuscatedName("h.mu")
    public static class225 field243;

    @ObfuscatedName("h.aj")
    public static int[] field244;

    @ObfuscatedName("fo.pj")
    public static class104 field2640;

    @ObfuscatedName("fv.g")
    public static int[] field2662;

    @ObfuscatedName("fd.av")
    public static String field2675;

    @ObfuscatedName("fd.pu")
    public static int field2676;

    @ObfuscatedName("fx.ev")
    public static class223[] field2682;

    @ObfuscatedName("fx.no")
    public static int field2685;

    @ObfuscatedName("fx.bj")
    public static int field2688;

    @ObfuscatedName("c.o")
    public static int field27;

    @ObfuscatedName("gv.fn")
    public static int field2731;

    @ObfuscatedName("gr.kz")
    public static int field2738;

    @ObfuscatedName("gq.c")
    public static long field2753;

    @ObfuscatedName("gq.v")
    public static class182 field2761;

    @ObfuscatedName("gq.b")
    public static class111 field2763;

    @ObfuscatedName("m.ff")
    public static int field277;

    @ObfuscatedName("gm.b")
    public static class183 field2778;

    @ObfuscatedName("gh.ab")
    public static class103 field2779;

    @ObfuscatedName("gh.e")
    public static int field2780;

    @ObfuscatedName("gh.b")
    public static class183 field2783;

    @ObfuscatedName("gf.qu")
    public static int field2788;

    @ObfuscatedName("m.dg")
    public static int[][] field279;

    @ObfuscatedName("gf.b")
    public static class183 field2790;

    @ObfuscatedName("gk.b")
    public static class183 field2792;

    @ObfuscatedName("gp.e")
    public static class183 field2797;

    @ObfuscatedName("c.df")
    public static int field28;

    @ObfuscatedName("gp.b")
    public static class183 field2804;

    @ObfuscatedName("m.ea")
    public static class225[] field281;

    @ObfuscatedName("m.bi")
    public static class185 field282;

    @ObfuscatedName("go.b")
    public static class183 field2820;

    @ObfuscatedName("go.ny")
    public static int field2822;

    @ObfuscatedName("gj.e")
    public static class183 field2826;

    @ObfuscatedName("m.cg")
    public static class209 field283;

    @ObfuscatedName("gj.b")
    public static class183 field2837;

    @ObfuscatedName("gb.b")
    public static class183 field2839;

    @ObfuscatedName("gb.e")
    public static class183 field2846;

    @ObfuscatedName("gb.bf")
    public static FontMetrics field2853;

    @ObfuscatedName("gs.b")
    public static class183 field2860;

    @ObfuscatedName("ge.b")
    public static class183 field2870;

    @ObfuscatedName("ge.ex")
    public static class225[] field2874;

    @ObfuscatedName("ge.ke")
    public static int field2876;

    @ObfuscatedName("gu.e")
    public static class183 field2878;

    @ObfuscatedName("gu.c")
    public static class183 field2879;

    @ObfuscatedName("gu.b")
    public static class183 field2887;

    @ObfuscatedName("client.g")
    public static class179 field289;

    @ObfuscatedName("gu.fa")
    public static int field2896;

    @ObfuscatedName("ga.c")
    public static class183 field2921;

    @ObfuscatedName("client.q")
    public static int field294;

    @ObfuscatedName("gt.s")
    public static boolean field2957;

    @ObfuscatedName("client.e")
    public static client field297;

    @ObfuscatedName("gt.g")
    public static class183 field2986;

    @ObfuscatedName("gt.j")
    public static class183 field2989;

    @ObfuscatedName("c.lt")
    public static class217 field30;

    @ObfuscatedName("gl.e")
    public static class183 field3009;

    @ObfuscatedName("gl.b")
    public static class183 field3014;

    @ObfuscatedName("gx.b")
    public static class183 field3056;

    @ObfuscatedName("gn.e")
    public static class183 field3061;

    @ObfuscatedName("gn.b")
    public static class183 field3071;

    @ObfuscatedName("gn.c")
    public static class183 field3077;

    @ObfuscatedName("gn.nb")
    public static int field3079;

    @ObfuscatedName("gw.e")
    public static File field3086;

    @ObfuscatedName("gg.j")
    public static class183 field3089;

    @ObfuscatedName("gy.c")
    public static int field3109;

    @ObfuscatedName("hn.t")
    public static class223[] field3115;

    @ObfuscatedName("hx.w")
    public static int[] field3138;

    @ObfuscatedName("ho.p")
    public static int[] field3186;

    @ObfuscatedName("ho.aq")
    public static int field3187;

    @ObfuscatedName("ho.aj")
    public static int field3192;

    @ObfuscatedName("c.eo")
    public static class225[] field32;

    @ObfuscatedName("hf.ia")
    public static class170 field3214;

    @ObfuscatedName("hp.b")
    public static int field3230;

    @ObfuscatedName("hp.c")
    public static int field3231;

    @ObfuscatedName("hp.e")
    public static int field3232;

    @ObfuscatedName("hp.l")
    public static int[] field3234;

    @ObfuscatedName("hu.w")
    public static String field3266;

    @ObfuscatedName("client.dn")
    public static int field341;

    @ObfuscatedName("client.ds")
    public static int[] field347;

    @ObfuscatedName("l.c")
    public static int[] field35;

    @ObfuscatedName("l.aq")
    public static int[] field36;

    @ObfuscatedName("y.ei")
    public static class225 field46;

    @ObfuscatedName("y.iz")
    public static int field47;

    @ObfuscatedName("j.z")
    public static int[] field54;

    @ObfuscatedName("j.r")
    public static int field58;

    @ObfuscatedName("p.pa")
    public static class231 field587;

    @ObfuscatedName("aq.bd")
    public static class223[] field593;

    @ObfuscatedName("aq.qz")
    public static Frame field597;

    @ObfuscatedName("aq.go")
    public static class170 field598;

    @ObfuscatedName("aq.em")
    public static class225[] field599;

    @ObfuscatedName("g.fh")
    public static int field60;

    @ObfuscatedName("g.y")
    public static class30[] field61;

    @ObfuscatedName("g.ib")
    public static int field62;

    @ObfuscatedName("ae.x")
    public static int[] field666;

    @ObfuscatedName("aa.hj")
    public static class24 field685;

    @ObfuscatedName("aa.bz")
    public static class223 field691;

    @ObfuscatedName("aa.dw")
    public static byte[][] field692;

    @ObfuscatedName("aa.u")
    public static class21 field697;

    @ObfuscatedName("s.ax")
    public static class185 field71;

    @ObfuscatedName("at.l")
    public static String[] field719;

    @ObfuscatedName("at.s")
    public static int field723;

    @ObfuscatedName("s.ph")
    public static GarbageCollectorMXBean field73;

    @ObfuscatedName("at.a")
    public static class170 field733;

    @ObfuscatedName("s.na")
    public static class58 field74;

    @ObfuscatedName("ap.fw")
    public static int field741;

    @ObfuscatedName("aw.a")
    public static class209 field750;

    @ObfuscatedName("aw.bq")
    public static class185 field751;

    @ObfuscatedName("aw.t")
    public static int[] field754;

    @ObfuscatedName("ah.k")
    public static int[] field757;

    @ObfuscatedName("ah.mv")
    public static byte field758;

    @ObfuscatedName("ah.l")
    public static class64 field761;

    @ObfuscatedName("ao.v")
    public static class170 field769;

    @ObfuscatedName("s.r")
    public static class180 field77;

    @ObfuscatedName("ao.dd")
    public static int field771;

    @ObfuscatedName("ao.z")
    public static class154 field772;

    @ObfuscatedName("ag.nk")
    public static int field787;

    @ObfuscatedName("az.o")
    public static class154 field794;

    @ObfuscatedName("ai.ac")
    public static class185 field799;

    @ObfuscatedName("s.qp")
    public static Font field80;

    @ObfuscatedName("as.ky")
    public static class170[] field806;

    @ObfuscatedName("as.j")
    public static int field808;

    @ObfuscatedName("ak.l")
    public static class223 field818;

    @ObfuscatedName("ak.j")
    public static class225 field819;

    @ObfuscatedName("ak.s")
    public static class223 field820;

    @ObfuscatedName("ak.n")
    public static int[] field825;

    @ObfuscatedName("ak.p")
    public static int[] field828;

    @ObfuscatedName("ak.b")
    public static boolean field833;

    @ObfuscatedName("ak.k")
    public static class223 field834;

    @ObfuscatedName("ak.c")
    public static class223 field835;

    @ObfuscatedName("ak.t")
    public static class223 field841;

    @ObfuscatedName("ak.an")
    public static int field843;

    @ObfuscatedName("ak.hu")
    public static int field847;

    @ObfuscatedName("ak.qs")
    public static int field851;

    @ObfuscatedName("ak.be")
    public static class185 field852;

    @ObfuscatedName("r.nh")
    public static int field88;

    @ObfuscatedName("an.mh")
    public static int field883;

    @ObfuscatedName("av.qe")
    public static int field887;

    @ObfuscatedName("av.j")
    public static class183 field889;

    @ObfuscatedName("av.qt")
    public static int field891;

    @ObfuscatedName("av.qv")
    public static int field896;

    @ObfuscatedName("e.eb")
    public static class223[] field9;

    @ObfuscatedName("ab.mc")
    public static class25[] field900;

    @ObfuscatedName("ab.bx")
    public static int field901;

    @ObfuscatedName("am.bo")
    public static class185 field931;

    @ObfuscatedName("am.q")
    public static String[] field937;

    @ObfuscatedName("am.cy")
    public static class209 field940;

    @ObfuscatedName("ar.f")
    public static class145 field944;

    @ObfuscatedName("ad.cb")
    public static class111 field948;

    @ObfuscatedName("t.z")
    public static String field95;

    @ObfuscatedName("ad.kc")
    public static int field956;

    @ObfuscatedName("ax.gi")
    public static int field967;

    @ObfuscatedName("t.m")
    public static int[] field97;

    @ObfuscatedName("ac.bg")
    public static class185 field979;

    @ObfuscatedName("t.pf")
    public static class117 field98;

    @ObfuscatedName("t.e")
    public static long field99;

    @ObfuscatedName("bz.t")
    public static int field995;

    @ObfuscatedName("gv.b(I)[Lha;")
    public static class217[] method3205() {
        return new class217[] { class217.field3181, class217.field3178, class217.field3179 };
    }

    @ObfuscatedName("x.b(III)I")
    public static int method210(int arg0, int arg1) {
        class13 var2 = (class13) class13.field137.method2259((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field141.length) {
            return var2.field141[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cg.b(II)Lgm;")
    public static class187 method1896(int arg0) {
        class187 var1 = (class187) class187.field2774.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2778.method3126(5, arg0);
        class187 var3 = new class187();
        if (var2 != null) {
            var3.method3263(new class154(var2));
        }
        class187.field2774.method2250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("e.b(Lec;I)Ljava/lang/Integer;")
    public static Integer method15(class154 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2669();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2669();
                if (var4 == 255) {
                    break;
                }
                arg0.field2079--;
                if (arg0.method2671() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2815();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("dl.l(I)V")
    public static void method1988() {
        class195.field2856.method2249();
    }

    @ObfuscatedName("z.b(IB)Lfh;")
    public static class170 method211(int arg0) {
        int var1 = arg0 >> 16;
        int var2 = arg0 & 0xFFFF;
        if (field2329[var1] == null || field2329[var1][var2] == null) {
            boolean var3 = class170.method1498(var1);
            if (!var3) {
                return null;
            }
        }
        return field2329[var1][var2];
    }

    @ObfuscatedName("ax.j(Lau;Lau;IZI)I")
    public static int method903(class30 arg0, class30 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field669;
            int var5 = arg1.field669;
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
            return arg0.field668 - arg1.field668;
        } else if (arg2 == 3) {
            if (arg0.field680.equals("-")) {
                if (arg1.field680.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field680.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field680.compareTo(arg1.field680);
            }
        } else if (arg2 == 4) {
            return arg0.method641() ? (arg1.method641() ? 0 : 1) : (arg1.method641() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method609() ? (arg1.method609() ? 0 : 1) : (arg1.method609() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method610() ? (arg1.method610() ? 0 : 1) : (arg1.method610() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method608() ? (arg1.method608() ? 0 : 1) : (arg1.method608() ? -1 : 0);
        } else {
            return arg0.field676 - arg1.field676;
        }
    }

    @ObfuscatedName("fo.a(S)V")
    public static void method3108() {
        class200.field3010.method2249();
        class200.field3046.method2249();
    }

    @ObfuscatedName("aj.j(Lft;II)Z")
    public static boolean method598(class160 arg0, int arg1) {
        int var2 = arg0.method2927(2);
        if (var2 == 0) {
            if (arg0.method2927(1) != 0) {
                method598(arg0, arg1);
            }
            int var3 = arg0.method2927(13);
            int var4 = arg0.method2927(13);
            boolean var5 = arg0.method2927(1) == 1;
            if (var5) {
                class46.field928[++class46.field920 - 1] = arg1;
            }
            if (client.field408[arg1] != null) {
                throw new RuntimeException();
            }
            class24 var6 = client.field408[arg1] = new class24();
            var6.field268 = arg1;
            if (class46.field912[arg1] != null) {
                var6.method239(class46.field912[arg1]);
            }
            var6.field652 = class46.field914[arg1];
            var6.field647 = class46.field919[arg1];
            int var7 = class46.field917[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field658[0] = class46.field911[arg1];
            var6.field252 = (byte) var8;
            var6.method243((var9 << 13) + var3 - field19, (var10 << 13) + var4 - field341);
            var6.field262 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method2927(2);
            int var12 = class46.field917[arg1];
            class46.field917[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method2927(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = class46.field917[arg1];
            int var17 = (var16 >> 28) + var14 & 0x3;
            int var18 = var16 >> 14 & 0xFF;
            int var19 = var16 & 0xFF;
            if (var15 == 0) {
                var18--;
                var19--;
            }
            if (var15 == 1) {
                var19--;
            }
            if (var15 == 2) {
                var18++;
                var19--;
            }
            if (var15 == 3) {
                var18--;
            }
            if (var15 == 4) {
                var18++;
            }
            if (var15 == 5) {
                var18--;
                var19++;
            }
            if (var15 == 6) {
                var19++;
            }
            if (var15 == 7) {
                var18++;
                var19++;
            }
            class46.field917[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method2927(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = class46.field917[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            class46.field917[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("a.x(I)V")
    public static final void method181() {
        try {
            if (client.field319 == 0) {
                if (field210 != null) {
                    field210.method2006();
                    field210 = null;
                }
                field2022 = null;
                client.field340 = false;
                client.field320 = 0;
                client.field319 = 1;
            }
            if (client.field319 == 1) {
                if (field2022 == null) {
                    field2022 = field2640.method1908(field2030, field901);
                }
                if (field2022.field1652 == 2) {
                    throw new IOException();
                }
                if (field2022.field1652 == 1) {
                    field210 = new class111((Socket) field2022.field1656, field2640);
                    field2022 = null;
                    client.field319 = 2;
                }
            }
            if (client.field319 == 2) {
                client.field417.field2079 = 0;
                client.field417.method2780(14);
                field210.method1996(client.field417.field2084, 0, 1);
                client.field331.field2079 = 0;
                client.field319 = 3;
            }
            if (client.field319 == 3) {
                if (field74 != null) {
                    field74.method1058();
                }
                if (field1563 != null) {
                    field1563.method1058();
                }
                int var0 = field210.method1993();
                if (field74 != null) {
                    field74.method1058();
                }
                if (field1563 != null) {
                    field1563.method1058();
                }
                if (var0 != 0) {
                    client.method221(var0);
                    return;
                }
                client.field331.field2079 = 0;
                client.field319 = 5;
            }
            if (client.field319 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                client.field417.field2079 = 0;
                client.field417.method2780(1);
                client.field417.method2780(class42.field842.method765());
                client.field417.method2658(var1[0]);
                client.field417.method2658(var1[1]);
                client.field417.method2658(var1[2]);
                client.field417.method2658(var1[3]);
                switch(class42.field842.field1627) {
                    case 0:
                    case 3:
                        client.field417.method2656(field843);
                        client.field417.field2079 += 5;
                        break;
                    case 1:
                        client.field417.method2658((Integer) field2073.field690.get(class208.method3215(class42.field815)));
                        client.field417.field2079 += 4;
                        break;
                    case 2:
                        client.field417.field2079 += 8;
                }
                client.field417.method2764(class42.field826);
                client.field417.method2690(class40.field796, class40.field797);
                client.field401.field2079 = 0;
                if (client.field295 == 40) {
                    client.field401.method2780(18);
                } else {
                    client.field401.method2780(16);
                }
                client.field401.method2793(0);
                int var2 = client.field401.field2079;
                client.field401.method2658(134);
                client.field401.method2663(client.field417.field2084, 0, client.field417.field2079);
                int var3 = client.field401.field2079;
                client.field401.method2764(class42.field815);
                client.field401.method2780((client.field502 ? 1 : 0) << 1 | (client.field569 ? 1 : 0));
                client.field401.method2793(field1559);
                client.field401.method2793(field2788);
                class105.method1839(client.field401);
                client.field401.method2764(field182);
                client.field401.method2658(field27);
                class154 var4 = new class154(field587.method4079());
                field587.method4070(var4);
                client.field401.method2663(var4.field2084, 0, var4.field2084.length);
                client.field401.method2780(field294);
                client.field401.method2658(0);
                client.field401.method2658(field71.field2729);
                client.field401.method2658(field799.field2729);
                client.field401.method2658(field1069.field2729);
                client.field401.method2658(field2182.field2729);
                client.field401.method2658(field2111.field2729);
                client.field401.method2658(field2150.field2729);
                client.field401.method2658(field931.field2729);
                client.field401.method2658(field160.field2729);
                client.field401.method2658(field852.field2729);
                client.field401.method2658(field751.field2729);
                client.field401.method2658(field176.field2729);
                client.field401.method2658(field131.field2729);
                client.field401.method2658(field1644.field2729);
                client.field401.method2658(field979.field2729);
                client.field401.method2658(field282.field2729);
                client.field401.method2658(field139.field2729);
                client.field401.method2830(var1, var3, client.field401.field2079);
                client.field401.method2665(client.field401.field2079 - var2);
                field210.method1996(client.field401.field2084, 0, client.field401.field2079);
                client.field417.method2913(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                client.field331.method2913(var1);
                client.field319 = 6;
            }
            if (client.field319 == 6 && field210.method2001() > 0) {
                int var6 = field210.method1993();
                if (var6 == 21 && client.field295 == 20) {
                    client.field319 = 7;
                } else if (var6 == 2) {
                    client.field319 = 9;
                } else if (var6 == 15 && client.field295 == 40) {
                    client.field332 = -1;
                    client.field319 = 13;
                } else if (var6 == 23 && client.field560 < 1) {
                    client.field560++;
                    client.field319 = 0;
                } else if (var6 == 29) {
                    client.field319 = 11;
                } else {
                    client.method221(var6);
                    return;
                }
            }
            if (client.field319 == 7 && field210.method2001() > 0) {
                client.field478 = (field210.method1993() + 3) * 60;
                client.field319 = 8;
            }
            if (client.field319 == 8) {
                client.field320 = 0;
                class42.method1845(class174.field2397, class174.field2398, client.field478 / 60 + class174.field2399);
                if (--client.field478 <= 0) {
                    client.field319 = 0;
                }
            } else {
                if (client.field319 == 9 && field210.method2001() >= 13) {
                    boolean var7 = field210.method1993() == 1;
                    field210.method2000(client.field331.field2084, 0, 4);
                    client.field331.field2079 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = client.field331.method2914() << 24;
                        int var10 = var9 | client.field331.method2914() << 16;
                        int var11 = var10 | client.field331.method2914() << 8;
                        int var12 = var11 | client.field331.method2914();
                        int var13 = class208.method3215(class42.field815);
                        if (field2073.field690.size() >= 10 && !field2073.field690.containsKey(var13)) {
                            Iterator var14 = field2073.field690.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        field2073.field690.put(var13, var12);
                        class31.method1576();
                    }
                    client.field507 = field210.method1993();
                    client.field440 = field210.method1993() == 1;
                    client.field431 = field210.method1993();
                    client.field431 <<= 0x8;
                    client.field431 += field210.method1993();
                    client.field482 = field210.method1993();
                    field210.method2000(client.field331.field2084, 0, 1);
                    client.field331.field2079 = 0;
                    client.field419 = client.field331.method2914();
                    field210.method2000(client.field331.field2084, 0, 2);
                    client.field331.field2079 = 0;
                    client.field332 = client.field331.method2671();
                    try {
                        class101.method1885(field297, "zap");
                    } catch (Throwable var25) {
                    }
                    client.field319 = 10;
                }
                if (client.field319 != 10) {
                    if (client.field319 == 11 && field210.method2001() >= 2) {
                        client.field331.field2079 = 0;
                        field210.method2000(client.field331.field2084, 0, 2);
                        client.field331.field2079 = 0;
                        field1572 = client.field331.method2671();
                        client.field319 = 12;
                    }
                    if (client.field319 == 12 && field210.method2001() >= field1572) {
                        client.field331.field2079 = 0;
                        field210.method2000(client.field331.field2084, 0, field1572);
                        client.field331.field2079 = 0;
                        String var16 = client.field331.method2677();
                        String var17 = client.field331.method2677();
                        String var18 = client.field331.method2677();
                        class42.method1845(var16, var17, var18);
                        client.method2950(10);
                    }
                    if (client.field319 == 13) {
                        if (client.field332 == -1) {
                            if (field210.method2001() < 2) {
                                return;
                            }
                            field210.method2000(client.field331.field2084, 0, 2);
                            client.field331.field2079 = 0;
                            client.field332 = client.field331.method2671();
                        }
                        if (field210.method2001() >= client.field332) {
                            field210.method2000(client.field331.field2084, 0, client.field332);
                            client.field331.field2079 = 0;
                            int var19 = client.field332;
                            client.field417.field2079 = 0;
                            client.field331.field2079 = 0;
                            client.field419 = -1;
                            client.field336 = -1;
                            client.field322 = -1;
                            client.field338 = -1;
                            client.field332 = 0;
                            client.field334 = 0;
                            client.field304 = 0;
                            client.field427 = 0;
                            client.field458 = -1;
                            client.field426 = false;
                            client.field524 = 0;
                            client.field292 = 0;
                            for (int var20 = 0; var20 < 2048; var20++) {
                                client.field408[var20] = null;
                            }
                            field685 = null;
                            for (int var21 = 0; var21 < client.field324.length; var21++) {
                                class36 var22 = client.field324[var21];
                                if (var22 != null) {
                                    var22.field647 = -1;
                                    var22.field628 = false;
                                }
                            }
                            class13.field137 = new class126(32);
                            client.method2950(30);
                            for (int var23 = 0; var23 < 100; var23++) {
                                client.field493[var23] = true;
                            }
                            client.field417.method2920(175);
                            client.field417.method2780(client.method3091());
                            client.field417.method2793(field1559);
                            client.field417.method2793(field2788);
                            class46.method204(client.field331);
                            if (client.field331.field2079 != var19) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        client.field320++;
                        if (client.field320 > 2000) {
                            if (client.field560 < 1) {
                                if (field901 == field2688) {
                                    field901 = field183;
                                } else {
                                    field901 = field2688;
                                }
                                client.field560++;
                                client.field319 = 0;
                            } else {
                                client.method221(-3);
                            }
                        }
                    }
                } else if (field210.method2001() >= client.field332) {
                    client.field331.field2079 = 0;
                    field210.method2000(client.field331.field2084, 0, client.field332);
                    client.method582();
                    class46.method204(client.field331);
                    field771 = -1;
                    method2597(false);
                    client.field419 = -1;
                }
            }
        } catch (IOException var26) {
            if (client.field560 < 1) {
                if (field901 == field2688) {
                    field901 = field183;
                } else {
                    field901 = field2688;
                }
                client.field560++;
                client.field319 = 0;
            } else {
                client.method221(-2);
            }
        }
    }

    @ObfuscatedName("t.i(ILad;ZI)I")
    public static int method112(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (client.field556 == 0) {
                class33.field720[++field723 - 1] = -2;
            } else if (client.field556 == 1) {
                class33.field720[++field723 - 1] = -1;
            } else {
                class33.field720[++field723 - 1] = client.field555;
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = class33.field720[--field723];
            if (client.field556 == 2 && var3 < client.field555) {
                class33.field727[++field240 - 1] = client.field557[var3].field170;
                class33.field727[++field240 - 1] = client.field557[var3].field161;
            } else {
                class33.field727[++field240 - 1] = "";
                class33.field727[++field240 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var4 = class33.field720[--field723];
            if (client.field556 == 2 && var4 < client.field555) {
                class33.field720[++field723 - 1] = client.field557[var4].field167;
            } else {
                class33.field720[++field723 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var5 = class33.field720[--field723];
            if (client.field556 == 2 && var5 < client.field555) {
                class33.field720[++field723 - 1] = client.field557[var5].field162;
            } else {
                class33.field720[++field723 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var6 = class33.field727[--field240];
            int var7 = class33.field720[--field723];
            client.field417.method2920(82);
            client.field417.method2780(class154.method2198(var6) + 1);
            client.field417.method2764(var6);
            client.field417.method2780(var7);
            return 1;
        } else if (arg0 == 3605) {
            String var8 = class33.field727[--field240];
            client.method1577(var8);
            return 1;
        } else if (arg0 == 3606) {
            String var9 = class33.field727[--field240];
            client.method91(var9);
            return 1;
        } else if (arg0 == 3607) {
            String var10 = class33.field727[--field240];
            client.method1846(var10, false);
            return 1;
        } else if (arg0 == 3608) {
            String var11 = class33.field727[--field240];
            client.method3032(var11);
            return 1;
        } else if (arg0 == 3609) {
            String var12 = class33.field727[--field240];
            class178[] var13 = class178.method762();
            for (int var14 = 0; var14 < var13.length; var14++) {
                class178 var15 = var13[var14];
                if (var15.field2672 != -1 && var12.startsWith(class38.method267(var15.field2672))) {
                    var12 = var12.substring(6 + Integer.toString(var15.field2672).length());
                    break;
                }
            }
            class33.field720[++field723 - 1] = client.method1352(var12, false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (client.field515 == null) {
                class33.field727[++field240 - 1] = "";
            } else {
                class33.field727[++field240 - 1] = class206.method763(client.field515);
            }
            return 1;
        } else if (arg0 == 3612) {
            if (client.field515 == null) {
                class33.field720[++field723 - 1] = 0;
            } else {
                class33.field720[++field723 - 1] = field883;
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = class33.field720[--field723];
            if (client.field515 == null || var16 >= field883) {
                class33.field727[++field240 - 1] = "";
            } else {
                class33.field727[++field240 - 1] = field900[var16].field278;
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = class33.field720[--field723];
            if (client.field515 == null || var17 >= field883) {
                class33.field720[++field723 - 1] = 0;
            } else {
                class33.field720[++field723 - 1] = field900[var17].field273;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = class33.field720[--field723];
            if (client.field515 == null || var18 >= field883) {
                class33.field720[++field723 - 1] = 0;
            } else {
                class33.field720[++field723 - 1] = field900[var18].field276;
            }
            return 1;
        } else if (arg0 == 3616) {
            class33.field720[++field723 - 1] = field1119;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = class33.field727[--field240];
            client.method170(var19);
            return 1;
        } else if (arg0 == 3618) {
            class33.field720[++field723 - 1] = field758;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = class33.field727[--field240];
            client.method3204(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method62();
            return 1;
        } else if (arg0 == 3621) {
            if (client.field556 == 0) {
                class33.field720[++field723 - 1] = -1;
            } else {
                class33.field720[++field723 - 1] = client.field329;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = class33.field720[--field723];
            if (client.field556 == 0 || var21 >= client.field329) {
                class33.field727[++field240 - 1] = "";
                class33.field727[++field240 - 1] = "";
            } else {
                class33.field727[++field240 - 1] = client.field423[var21].field217;
                class33.field727[++field240 - 1] = client.field423[var21].field216;
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = class33.field727[--field240];
            if (var22.startsWith(class38.method267(0)) || var22.startsWith(class38.method267(1))) {
                var22 = var22.substring(7);
            }
            class33.field720[++field723 - 1] = client.method2208(var22) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var23 = class33.field720[--field723];
            if (field900 == null || var23 >= field883 || !field900[var23].field278.equalsIgnoreCase(field685.field267)) {
                class33.field720[++field723 - 1] = 0;
            } else {
                class33.field720[++field723 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (client.field516 == null) {
                class33.field727[++field240 - 1] = "";
            } else {
                class33.field727[++field240 - 1] = class206.method763(client.field516);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gm.w(I)V")
    public static final void method3271() {
        if (field210 != null) {
            field210.method2006();
            field210 = null;
        }
        client.method576();
        field2110.method1647();
        for (int var0 = 0; var0 < 4; var0++) {
            client.field348[var0].method2177();
        }
        System.gc();
        class139.field1903 = 1;
        field889 = null;
        field1906 = -1;
        field1899 = -1;
        field1909 = 0;
        field135 = false;
        field1904 = 2;
        client.field526 = -1;
        client.field527 = false;
        class32.method208();
        client.method2950(10);
    }

    @ObfuscatedName("eu.bz(ZI)V")
    public static final void method2597(boolean arg0) {
        client.field496 = arg0;
        if (!client.field496) {
            int var1 = client.field331.method2704();
            int var2 = client.field331.method2706();
            int var3 = client.field331.method2671();
            field279 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    field279[var4][var5] = client.field331.method2815();
                }
            }
            field2176 = new int[var3];
            field347 = new int[var3];
            field2336 = new int[var3];
            field1843 = new byte[var3][];
            field692 = new byte[var3][];
            boolean var6 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var1 / 8 == 48) {
                var6 = true;
            }
            if (var2 / 8 == 48 && var1 / 8 == 148) {
                var6 = true;
            }
            int var7 = 0;
            for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
                for (int var9 = (var1 - 6) / 8; var9 <= (var1 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    if (!var6 || var9 != 49 && var9 != 149 && var9 != 147 && var8 != 50 && (var8 != 49 || var9 != 47)) {
                        field2176[var7] = var10;
                        field347[var7] = field2150.method3141("m" + var8 + "_" + var9);
                        field2336[var7] = field2150.method3141("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            client.method769(var2, var1);
            return;
        }
        int var11 = client.field331.method2671();
        int var12 = client.field331.method2671();
        int var13 = client.field331.method2671();
        client.field331.method2915();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = client.field331.method2927(1);
                    if (var17 == 1) {
                        client.field330[var14][var15][var16] = client.field331.method2927(26);
                    } else {
                        client.field330[var14][var15][var16] = -1;
                    }
                }
            }
        }
        client.field331.method2917();
        field279 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                field279[var18][var19] = client.field331.method2815();
            }
        }
        field2176 = new int[var13];
        field347 = new int[var13];
        field2336 = new int[var13];
        field1843 = new byte[var13][];
        field692 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = client.field330[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (field2176[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            field2176[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            field347[var20] = field2150.method3141("m" + var29 + "_" + var30);
                            field2336[var20] = field2150.method3141("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        client.method769(var12, var11);
    }

    @ObfuscatedName("de.bq(IIIIII)V")
    public static final void method1923(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field2110.method1670(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = field2110.method1729(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = field243.field3220;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class198 var13 = class198.method1865(var12);
            if (var13.field2931 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 1) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
                if (var8 == 3) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                    }
                }
                if (var8 == 2) {
                    if (var7 == 3) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
            } else {
                class223 var14 = field9[var13.field2931];
                if (var14 != null) {
                    int var15 = (var13.field2903 * 4 - var14.field3210) / 2;
                    int var16 = (var13.field2918 * 4 - var14.field3209) / 2;
                    var14.method3895(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2918) * 4 + 48 + var16);
                }
            }
        }
        int var17 = field2110.method1675(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = field2110.method1729(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class198 var22 = class198.method1865(var21);
            if (var22.field2931 != -1) {
                class223 var23 = field9[var22.field2931];
                if (var23 != null) {
                    int var24 = (var22.field2903 * 4 - var23.field3210) / 2;
                    int var25 = (var22.field2918 * 4 - var23.field3209) / 2;
                    var23.method3895(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2918) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = field243.field3220;
                int var28 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var19 == 0 || var19 == 2) {
                    var27[var28 + 1536] = var26;
                    var27[var28 + 1024 + 1] = var26;
                    var27[var28 + 512 + 2] = var26;
                    var27[var28 + 3] = var26;
                } else {
                    var27[var28] = var26;
                    var27[var28 + 512 + 1] = var26;
                    var27[var28 + 1024 + 2] = var26;
                    var27[var28 + 1536 + 3] = var26;
                }
            }
        }
        int var29 = field2110.method1676(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class198 var31 = class198.method1865(var30);
        if (var31.field2931 == -1) {
            return;
        }
        class223 var32 = field9[var31.field2931];
        if (var32 != null) {
            int var33 = (var31.field2903 * 4 - var32.field3210) / 2;
            int var34 = (var31.field2918 * 4 - var32.field3209) / 2;
            var32.method3895(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2918) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("gc.cb(Lgl;IIII)V")
    public static final void method3648(class200 arg0, int arg1, int arg2, int arg3) {
        if (client.field427 >= 400) {
            return;
        }
        if (arg0.field3035 != null) {
            arg0 = arg0.method3552();
        }
        if (arg0 == null || !arg0.field3041 || arg0.field3043 && client.field456 != arg1) {
            return;
        }
        String var4 = arg0.field3013;
        if (arg0.field3011 != 0) {
            int var6 = arg0.field3011;
            int var7 = field685.field255;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class38.method3030(16711680);
            } else if (var8 < -6) {
                var9 = class38.method3030(16723968);
            } else if (var8 < -3) {
                var9 = class38.method3030(16740352);
            } else if (var8 < 0) {
                var9 = class38.method3030(16756736);
            } else if (var8 > 9) {
                var9 = class38.method3030(65280);
            } else if (var8 > 6) {
                var9 = class38.method3030(4259584);
            } else if (var8 > 3) {
                var9 = class38.method3030(8453888);
            } else if (var8 > 0) {
                var9 = class38.method3030(12648192);
            } else {
                var9 = class38.method3030(16776960);
            }
            var4 = var4 + var9 + " " + class38.field779 + class174.field2514 + arg0.field3011 + class38.field777;
        }
        if (arg0.field3043 && client.field434) {
            client.method583(class174.field2509, class38.method3030(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (client.field441 == 1) {
            client.method583(class174.field2508, client.field337 + " " + class38.field776 + " " + class38.method3030(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!client.field443) {
            int var10 = arg0.field3043 && client.field434 ? 2000 : 0;
            String[] var11 = arg0.field3027;
            if (client.field459) {
                var11 = client.method11(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class174.field2510)) {
                        int var13 = 0;
                        if (var12 == 0) {
                            var13 = var10 + 9;
                        }
                        if (var12 == 1) {
                            var13 = var10 + 10;
                        }
                        if (var12 == 2) {
                            var13 = var10 + 11;
                        }
                        if (var12 == 3) {
                            var13 = var10 + 12;
                        }
                        if (var12 == 4) {
                            var13 = var10 + 13;
                        }
                        client.method583(var11[var12], class38.method3030(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class174.field2510)) {
                        short var15 = 0;
                        if (client.field377 != class41.field811) {
                            if (client.field377 == class41.field807 || client.field377 == class41.field810 && arg0.field3011 > field685.field255) {
                                var15 = 2000;
                            }
                            int var16 = 0;
                            if (var14 == 0) {
                                var16 = var15 + 9;
                            }
                            if (var14 == 1) {
                                var16 = var15 + 10;
                            }
                            if (var14 == 2) {
                                var16 = var15 + 11;
                            }
                            if (var14 == 3) {
                                var16 = var15 + 12;
                            }
                            if (var14 == 4) {
                                var16 = var15 + 13;
                            }
                            client.method583(var11[var14], class38.method3030(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3043 || !client.field434) {
                client.method583(class174.field2509, class38.method3030(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((field2 & 0x2) == 2) {
            client.method583(client.field446, client.field447 + " " + class38.field776 + " " + class38.method3030(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("d.ce(Lfh;B)V")
    public static void method195(class170 arg0) {
        class170 var1 = arg0.field2220 == -1 ? null : method211(arg0.field2220);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = field1559;
            var3 = field2788;
        } else {
            var2 = var1.field2216;
            var3 = var1.field2217;
        }
        client.method205(arg0, var2, var3, false);
        client.method1982(arg0, var2, var3);
    }
}
