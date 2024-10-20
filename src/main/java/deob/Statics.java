package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;

public class Statics {

    @ObfuscatedName("f.r")
    public static byte[][][] field1;

    @ObfuscatedName("i.s")
    public static int[] field10;

    @ObfuscatedName("bj.c")
    public static float[] field1011;

    @ObfuscatedName("bj.ah")
    public static int[] field1013;

    @ObfuscatedName("bj.t")
    public static float[] field1017;

    @ObfuscatedName("bj.n")
    public static int field1018;

    @ObfuscatedName("bj.m")
    public static int field1019;

    @ObfuscatedName("bj.d")
    public static class65[] field1021;

    @ObfuscatedName("bj.s")
    public static class53[] field1022;

    @ObfuscatedName("bj.q")
    public static class57[] field1023;

    @ObfuscatedName("bj.p")
    public static class70[] field1025;

    @ObfuscatedName("bj.y")
    public static boolean[] field1026;

    @ObfuscatedName("bj.a")
    public static int[] field1027;

    @ObfuscatedName("bj.j")
    public static int field1029;

    @ObfuscatedName("bj.k")
    public static float[] field1033;

    @ObfuscatedName("bj.w")
    public static int field1034;

    @ObfuscatedName("bj.e")
    public static float[] field1036;

    @ObfuscatedName("bj.am")
    public static float[] field1037;

    @ObfuscatedName("bj.an")
    public static float[] field1038;

    @ObfuscatedName("bj.aq")
    public static float[] field1039;

    @ObfuscatedName("bj.l")
    public static byte[] field1040;

    @ObfuscatedName("bj.ag")
    public static int[] field1041;

    @ObfuscatedName("bk.j")
    public static int[] field1053;

    @ObfuscatedName("bk.w")
    public static int[] field1057;

    @ObfuscatedName("bk.s")
    public static boolean[] field1061;

    @ObfuscatedName("bu.f")
    public static int field1078;

    @ObfuscatedName("bu.i")
    public static boolean field1079;

    @ObfuscatedName("bu.ed")
    public static class225[] field1083;

    @ObfuscatedName("bu.bw")
    public static class185 field1084;

    @ObfuscatedName("s.ef")
    public static class225[] field109;

    @ObfuscatedName("bv.pa")
    public static int field1105;

    @ObfuscatedName("bf.cd")
    public static class209 field1120;

    @ObfuscatedName("bf.x")
    public static int[] field1123;

    @ObfuscatedName("s.v")
    public static int field114;

    @ObfuscatedName("bz.m")
    public static int field1161;

    @ObfuscatedName("bz.n")
    public static float field1163;

    @ObfuscatedName("bx.bu")
    public static class185 field1218;

    @ObfuscatedName("cl.w")
    public static short[][] field1322;

    @ObfuscatedName("cs.p")
    public static int[] field1338;

    @ObfuscatedName("cv.ec")
    public static class223[] field1373;

    @ObfuscatedName("cv.eb")
    public static class223[] field1374;

    @ObfuscatedName("d.po")
    public static class2 field139;

    @ObfuscatedName("ce.bc")
    public static int field1429;

    @ObfuscatedName("ce.bh")
    public static int field1430;

    @ObfuscatedName("ce.bj")
    public static int field1431;

    @ObfuscatedName("d.re")
    public static Image field144;

    @ObfuscatedName("cg.m")
    public static short[] field1447;

    @ObfuscatedName("cg.mt")
    public static int field1449;

    @ObfuscatedName("ck.y")
    public static int field1453;

    @ObfuscatedName("ck.v")
    public static int field1454;

    @ObfuscatedName("ck.s")
    public static int field1456;

    @ObfuscatedName("ck.j")
    public static int field1457;

    @ObfuscatedName("ck.p")
    public static int field1463;

    @ObfuscatedName("ck.d")
    public static int field1466;

    @ObfuscatedName("ck.a")
    public static int field1469;

    @ObfuscatedName("ck.q")
    public static int field1472;

    @ObfuscatedName("ck.g")
    public static class94 field1473;

    @ObfuscatedName("cn.dv")
    public static byte[][] field1485;

    @ObfuscatedName("cr.rj")
    public static String field1496;

    @ObfuscatedName("cf.v")
    public static int field1498;

    @ObfuscatedName("i.d")
    public static class182 field15;

    @ObfuscatedName("cf.t")
    public static int field1504;

    @ObfuscatedName("cf.e")
    public static int field1508;

    @ObfuscatedName("cf.a")
    public static int field1514;

    @ObfuscatedName("cf.bq")
    public static int field1516;

    @ObfuscatedName("cf.g")
    public static int field1518;

    @ObfuscatedName("cf.b")
    public static int field1519;

    @ObfuscatedName("cf.k")
    public static int field1520;

    @ObfuscatedName("cf.x")
    public static int field1522;

    @ObfuscatedName("cf.am")
    public static int field1524;

    @ObfuscatedName("cf.an")
    public static int field1525;

    @ObfuscatedName("cf.bk")
    public static boolean[][] field1526;

    @ObfuscatedName("cf.ah")
    public static int field1527;

    @ObfuscatedName("cf.bl")
    public static int field1529;

    @ObfuscatedName("cf.z")
    public static int field1545;

    @ObfuscatedName("cf.c")
    public static int field1554;

    @ObfuscatedName("cf.bu")
    public static int field1555;

    @ObfuscatedName("cf.by")
    public static int field1556;

    @ObfuscatedName("cf.aq")
    public static int field1557;

    @ObfuscatedName("cf.bv")
    public static int field1558;

    @ObfuscatedName("cf.bb")
    public static int field1559;

    @ObfuscatedName("ci.h")
    public static class223 field1562;

    @ObfuscatedName("ch.pn")
    public static class231 field1574;

    @ObfuscatedName("ch.kp")
    public static class113 field1575;

    @ObfuscatedName("ch.bl")
    public static class185 field1582;

    @ObfuscatedName("ca.qg")
    public static int field1584;

    @ObfuscatedName("p.g")
    public static int[] field159;

    @ObfuscatedName("ca.qi")
    public static class110 field1591;

    @ObfuscatedName("cc.o")
    public static class183 field1593;

    @ObfuscatedName("cc.dw")
    public static byte[][] field1594;

    @ObfuscatedName("cc.a")
    public static String[] field1595;

    @ObfuscatedName("p.c")
    public static int[] field160;

    @ObfuscatedName("p.dj")
    public static int field162;

    @ObfuscatedName("ct.fd")
    public static int field1628;

    @ObfuscatedName("p.bv")
    public static class185 field163;

    @ObfuscatedName("cb.ij")
    public static class39 field1646;

    @ObfuscatedName("cz.hh")
    public static int field1659;

    @ObfuscatedName("cy.bi")
    public static int field1672;

    @ObfuscatedName("co.i")
    public static String field1676;

    @ObfuscatedName("co.f")
    public static Applet field1681;

    @ObfuscatedName("co.u")
    public static int field1682;

    @ObfuscatedName("cd.i")
    public static String field1693;

    @ObfuscatedName("cd.py")
    public static long field1699;

    @ObfuscatedName("cd.f")
    public static String field1701;

    @ObfuscatedName("dd.h")
    public static File field1709;

    @ObfuscatedName("y.es")
    public static class225[] field171;

    @ObfuscatedName("dd.y")
    public static int field1716;

    @ObfuscatedName("dd.hf")
    public static int field1718;

    @ObfuscatedName("y.ee")
    public static class225[] field172;

    @ObfuscatedName("y.nm")
    public static int field173;

    @ObfuscatedName("y.v")
    public static String[] field174;

    @ObfuscatedName("dk.i")
    public static File field1753;

    @ObfuscatedName("dj.pp")
    public static class104 field1756;

    @ObfuscatedName("dq.n")
    public static boolean field1760;

    @ObfuscatedName("dq.l")
    public static byte[][][] field1762;

    @ObfuscatedName("y.w")
    public static class27 field177;

    @ObfuscatedName("ds.n")
    public static int field1778;

    @ObfuscatedName("dy.qf")
    public static Font field1781;

    @ObfuscatedName("dn.qm")
    public static int field1803;

    @ObfuscatedName("dp.rw")
    public static boolean field1804;

    @ObfuscatedName("a.ff")
    public static int field182;

    @ObfuscatedName("dc.qu")
    public static class221 field1828;

    @ObfuscatedName("db.bh")
    public static class185 field1831;

    @ObfuscatedName("db.no")
    public static int field1840;

    @ObfuscatedName("dl.bk")
    public static class185 field1858;

    @ObfuscatedName("dl.bj")
    public static class223 field1859;

    @ObfuscatedName("a.fm")
    public static int field186;

    @ObfuscatedName("dl.qs")
    public static Frame field1861;

    @ObfuscatedName("dz.o")
    public static int field1864;

    @ObfuscatedName("dz.r")
    public static int field1867;

    @ObfuscatedName("dz.ny")
    public static class66 field1869;

    @ObfuscatedName("v.p")
    public static class73[] field187;

    @ObfuscatedName("dv.da")
    public static int field1880;

    @ObfuscatedName("dv.di")
    public static int field1881;

    @ObfuscatedName("v.iq")
    public static class170 field191;

    @ObfuscatedName("ej.nk")
    public static class58 field1928;

    @ObfuscatedName("ej.z")
    public static int[] field1934;

    @ObfuscatedName("ea.w")
    public static int field1938;

    @ObfuscatedName("ea.j")
    public static boolean field1939;

    @ObfuscatedName("ea.h")
    public static class140 field1940;

    @ObfuscatedName("ea.l")
    public static int field1942;

    @ObfuscatedName("ea.u")
    public static class183 field1943;

    @ObfuscatedName("ea.i")
    public static class183 field1944;

    @ObfuscatedName("ea.s")
    public static class145 field1945;

    @ObfuscatedName("ea.f")
    public static class183 field1946;

    @ObfuscatedName("v.cr")
    public static class103 field197;

    @ObfuscatedName("ef.ox")
    public static int field2034;

    @ObfuscatedName("es.i")
    public static class183 field2038;

    @ObfuscatedName("es.u")
    public static int field2039;

    @ObfuscatedName("es.lv")
    public static class217 field2042;

    @ObfuscatedName("er.dq")
    public static int field2057;

    @ObfuscatedName("er.pl")
    public static class31 field2059;

    @ObfuscatedName("ew.o")
    public static class183 field2062;

    @ObfuscatedName("ew.kt")
    public static int field2063;

    @ObfuscatedName("ew.x")
    public static class154 field2065;

    @ObfuscatedName("ec.ps")
    public static GarbageCollectorMXBean field2068;

    @ObfuscatedName("ek.iv")
    public static class170 field2086;

    @ObfuscatedName("ev.d")
    public static class170 field2124;

    @ObfuscatedName("ex.i")
    public static long field2130;

    @ObfuscatedName("ex.f")
    public static long field2131;

    @ObfuscatedName("fx.p")
    public static String field2134;

    @ObfuscatedName("fx.mf")
    public static class25[] field2137;

    @ObfuscatedName("fh.ay")
    public static class185 field2138;

    @ObfuscatedName("fh.ci")
    public static class111 field2140;

    @ObfuscatedName("x.m")
    public static class229 field215;

    @ObfuscatedName("x.be")
    public static class185 field216;

    @ObfuscatedName("ff.gn")
    public static class170 field2161;

    @ObfuscatedName("fu.p")
    public static int[][][] field2167;

    @ObfuscatedName("x.na")
    public static int field217;

    @ObfuscatedName("fu.kk")
    public static class170[] field2171;

    @ObfuscatedName("fl.gc")
    public static class170 field2178;

    @ObfuscatedName("fy.c")
    public static int[] field2184;

    @ObfuscatedName("fe.l")
    public static short[] field2191;

    @ObfuscatedName("fe.n")
    public static short[][] field2192;

    @ObfuscatedName("fe.ez")
    public static class225[] field2195;

    @ObfuscatedName("fe.ov")
    public static int field2196;

    @ObfuscatedName("x.n")
    public static byte[][][] field220;

    @ObfuscatedName("fo.r")
    public static File field2201;

    @ObfuscatedName("fk.qo")
    public static int field2208;

    @ObfuscatedName("x.ao")
    public static String field221;

    @ObfuscatedName("fr.h")
    public static class183 field2212;

    @ObfuscatedName("fr.f")
    public static class170[][] field2240;

    @ObfuscatedName("x.nu")
    public static class52 field225;

    @ObfuscatedName("fr.u")
    public static class183 field2302;

    @ObfuscatedName("fr.r")
    public static class183 field2318;

    @ObfuscatedName("g.cf")
    public static class111 field234;

    @ObfuscatedName("fr.ht")
    public static int field2356;

    @ObfuscatedName("g.o")
    public static class183 field236;

    @ObfuscatedName("fw.by")
    public static class185 field2368;

    @ObfuscatedName("fq.w")
    public static class223 field2374;

    @ObfuscatedName("u.nq")
    public static class58 field24;

    @ObfuscatedName("b.fa")
    public static int field245;

    @ObfuscatedName("b.kf")
    public static int field246;

    @ObfuscatedName("b.an")
    public static int[] field250;

    @ObfuscatedName("b.du")
    public static int field251;

    @ObfuscatedName("b.ew")
    public static class225[] field252;

    @ObfuscatedName("k.bf")
    public static FontMetrics field254;

    @ObfuscatedName("k.nz")
    public static int field255;

    @ObfuscatedName("fi.ae")
    public static class103 field2663;

    @ObfuscatedName("fz.aj")
    public static boolean field2688;

    @ObfuscatedName("fz.ix")
    public static int field2690;

    @ObfuscatedName("fn.co")
    public static class209 field2718;

    @ObfuscatedName("fn.em")
    public static class225 field2719;

    @ObfuscatedName("fn.fw")
    public static int field2721;

    @ObfuscatedName("gp.pf")
    public static Clipboard field2750;

    @ObfuscatedName("gg.f")
    public static class111 field2771;

    @ObfuscatedName("gg.y")
    public static class154 field2776;

    @ObfuscatedName("gg.u")
    public static long field2779;

    @ObfuscatedName("gr.f")
    public static class183 field2784;

    @ObfuscatedName("ga.f")
    public static class183 field2789;

    @ObfuscatedName("ga.i")
    public static int field2790;

    @ObfuscatedName("ga.dk")
    public static int field2792;

    @ObfuscatedName("gj.f")
    public static class183 field2798;

    @ObfuscatedName("gx.f")
    public static class183 field2802;

    @ObfuscatedName("gt.i")
    public static class183 field2804;

    @ObfuscatedName("gt.f")
    public static class183 field2806;

    @ObfuscatedName("gw.f")
    public static class183 field2823;

    @ObfuscatedName("t.cw")
    public static class209 field283;

    @ObfuscatedName("ge.u")
    public static int field2832;

    @ObfuscatedName("ge.f")
    public static class183 field2835;

    @ObfuscatedName("go.i")
    public static class183 field2843;

    @ObfuscatedName("c.if")
    public static int field285;

    @ObfuscatedName("go.f")
    public static class183 field2853;

    @ObfuscatedName("gf.f")
    public static class183 field2858;

    @ObfuscatedName("c.q")
    public static class61 field286;

    @ObfuscatedName("gz.f")
    public static class183 field2868;

    @ObfuscatedName("gc.i")
    public static class183 field2884;

    @ObfuscatedName("gc.f")
    public static class183 field2886;

    @ObfuscatedName("gn.i")
    public static class183 field2898;

    @ObfuscatedName("gn.u")
    public static class183 field2899;

    @ObfuscatedName("c.qt")
    public static int field294;

    @ObfuscatedName("c.dl")
    public static int[] field297;

    @ObfuscatedName("gu.q")
    public static class209 field2994;

    @ObfuscatedName("f.q")
    public static int[] field3;

    @ObfuscatedName("h.o")
    public static byte[][][] field30;

    @ObfuscatedName("gu.m")
    public static int field3001;

    @ObfuscatedName("gu.r")
    public static int[] field3004;

    @ObfuscatedName("gu.je")
    public static int field3005;

    @ObfuscatedName("gv.f")
    public static class183 field3023;

    @ObfuscatedName("client.o")
    public static class179 field303;

    @ObfuscatedName("gv.i")
    public static class183 field3037;

    @ObfuscatedName("gh.f")
    public static class183 field3048;

    @ObfuscatedName("client.n")
    public static class180 field305;

    @ObfuscatedName("gl.f")
    public static class183 field3062;

    @ObfuscatedName("gl.gq")
    public static int field3063;

    @ObfuscatedName("gl.k")
    public static String field3075;

    @ObfuscatedName("gl.i")
    public static class183 field3079;

    @ObfuscatedName("gy.ci")
    public static int field3085;

    @ObfuscatedName("gm.bj")
    public static class185 field3097;

    @ObfuscatedName("gq.nf")
    public static int field3110;

    @ObfuscatedName("hr.w")
    public static class223[] field3125;

    @ObfuscatedName("hl.f")
    public static class146 field3134;

    @ObfuscatedName("hn.u")
    public static int field3187;

    @ObfuscatedName("hm.e")
    public static int[] field3189;

    @ObfuscatedName("hm.an")
    public static int field3191;

    @ObfuscatedName("hm.am")
    public static int field3193;

    @ObfuscatedName("hj.m")
    public static byte[][] field3200;

    @ObfuscatedName("hu.h")
    public static int[] field3231;

    @ObfuscatedName("hu.i")
    public static int field3232;

    @ObfuscatedName("hu.o")
    public static int[] field3233;

    @ObfuscatedName("hu.f")
    public static int field3234;

    @ObfuscatedName("hu.n")
    public static int[] field3235;

    @ObfuscatedName("hp.d")
    public static int[] field3244;

    @ObfuscatedName("r.ba")
    public static String field34;

    @ObfuscatedName("client.a")
    public static int field378;

    @ObfuscatedName("f.o")
    public static int field4;

    @ObfuscatedName("r.eu")
    public static class225 field40;

    @ObfuscatedName("client.t")
    public static class21 field401;

    @ObfuscatedName("r.az")
    public static long field41;

    @ObfuscatedName("r.go")
    public static class170 field43;

    @ObfuscatedName("client.bs")
    public static int field432;

    @ObfuscatedName("client.i")
    public static client field434;

    @ObfuscatedName("client.iz")
    public static int field457;

    @ObfuscatedName("r.bh")
    public static class223[] field46;

    @ObfuscatedName("o.eh")
    public static class223[] field48;

    @ObfuscatedName("f.bx")
    public static int field5;

    @ObfuscatedName("o.nj")
    public static int field55;

    @ObfuscatedName("o.u")
    public static class183 field56;

    @ObfuscatedName("o.bq")
    public static class185 field57;

    @ObfuscatedName("l.i")
    public static boolean[] field58;

    @ObfuscatedName("client.br")
    public static class185 field587;

    @ObfuscatedName("f.u")
    public static class183 field6;

    @ObfuscatedName("e.dc")
    public static int[] field601;

    @ObfuscatedName("e.am")
    public static int[] field604;

    @ObfuscatedName("am.q")
    public static boolean field610;

    @ObfuscatedName("aq.qx")
    public static int field683;

    @ObfuscatedName("aq.av")
    public static int field684;

    @ObfuscatedName("aq.mb")
    public static class225 field687;

    @ObfuscatedName("aq.dx")
    public static class88 field688;

    @ObfuscatedName("aq.m")
    public static int[][] field689;

    @ObfuscatedName("ah.pb")
    public static class117 field696;

    @ObfuscatedName("ah.r")
    public static class30[] field703;

    @ObfuscatedName("ah.hc")
    public static int field710;

    @ObfuscatedName("ag.aa")
    public static class111 field711;

    @ObfuscatedName("ag.j")
    public static int[] field713;

    @ObfuscatedName("ag.n")
    public static int field714;

    @ObfuscatedName("ag.af")
    public static class223[] field719;

    @ObfuscatedName("m.ac")
    public static class225[] field74;

    @ObfuscatedName("aw.u")
    public static int[] field740;

    @ObfuscatedName("aw.h")
    public static String[] field741;

    @ObfuscatedName("aw.q")
    public static class170 field747;

    @ObfuscatedName("aw.w")
    public static int field750;

    @ObfuscatedName("aw.qy")
    public static int field756;

    @ObfuscatedName("ax.qe")
    public static int field759;

    @ObfuscatedName("w.ma")
    public static byte field76;

    @ObfuscatedName("ax.b")
    public static String field768;

    @ObfuscatedName("ax.er")
    public static class225[] field772;

    @ObfuscatedName("ax.bt")
    public static int field774;

    @ObfuscatedName("w.kr")
    public static class47 field78;

    @ObfuscatedName("ak.d")
    public static String field781;

    @ObfuscatedName("ak.m")
    public static int field784;

    @ObfuscatedName("ai.ft")
    public static int field787;

    @ObfuscatedName("w.px")
    public static int field79;

    @ObfuscatedName("ai.bc")
    public static class223[] field790;

    @ObfuscatedName("ai.pq")
    public static short[] field795;

    @ObfuscatedName("ai.au")
    public static class103 field796;

    @ObfuscatedName("i.l")
    public static class225 field8;

    @ObfuscatedName("ap.bc")
    public static class185 field806;

    @ObfuscatedName("ap.cf")
    public static char field811;

    @ObfuscatedName("ap.op")
    public static int field814;

    @ObfuscatedName("w.fu")
    public static int field83;

    @ObfuscatedName("at.qp")
    public static int field832;

    @ObfuscatedName("ad.qj")
    public static int field835;

    @ObfuscatedName("ad.u")
    public static class223 field837;

    @ObfuscatedName("ad.r")
    public static class223[] field838;

    @ObfuscatedName("ad.o")
    public static class225 field839;

    @ObfuscatedName("w.e")
    public static int[] field84;

    @ObfuscatedName("ad.n")
    public static class223 field840;

    @ObfuscatedName("ad.m")
    public static class223[] field841;

    @ObfuscatedName("ad.f")
    public static boolean field861;

    @ObfuscatedName("ad.b")
    public static int[] field868;

    @ObfuscatedName("ad.dz")
    public static int[][] field870;

    @ObfuscatedName("av.bb")
    public static class185 field878;

    @ObfuscatedName("j.h")
    public static byte[][][] field88;

    @ObfuscatedName("av.hl")
    public static class24 field899;

    @ObfuscatedName("av.qc")
    public static Canvas field900;

    @ObfuscatedName("av.om")
    public static int field901;

    @ObfuscatedName("ao.h")
    public static class64 field908;

    @ObfuscatedName("ae.kh")
    public static int field913;

    @ObfuscatedName("ae.db")
    public static int[] field916;

    @ObfuscatedName("as.cn")
    public static long field947;

    @ObfuscatedName("j.w")
    public static int[] field95;

    @ObfuscatedName("al.j")
    public static class223 field952;

    @ObfuscatedName("al.l")
    public static class183 field957;

    @ObfuscatedName("al.is")
    public static int field958;

    @ObfuscatedName("al.mc")
    public static byte field960;

    @ObfuscatedName("ay.g")
    public static String field973;

    @ObfuscatedName("ac.ac")
    public static class185 field989;

    @ObfuscatedName("ac.af")
    public static class185 field991;

    @ObfuscatedName("ac.l")
    public static int[] field995;

    @ObfuscatedName("dd.f(B)[Lfp;")
    public static class179[] method1920() {
        return new class179[] { class179.field2698, class179.field2699, class179.field2700, class179.field2697 };
    }

    @ObfuscatedName("k.f(II)Lgf;")
    public static class195 method202(int arg0) {
        class195 var1 = (class195) class195.field2857.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2858.method3163(14, arg0);
        class195 var3 = new class195();
        if (var2 != null) {
            var3.method3372(new class154(var2));
        }
        class195.field2857.method2246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fm.f(I)V")
    public static void method2911() {
        class228.field3245 = new class127();
    }

    @ObfuscatedName("ca.i(IIIII)V")
    public static void method1836(int arg0, int arg1, int arg2, int arg3) {
        class13 var4 = (class13) class13.field124.method2254((long) arg0);
        if (var4 == null) {
            var4 = new class13();
            class13.field124.method2255(var4, (long) arg0);
        }
        if (var4.field119.length <= arg1) {
            int[] var5 = new int[arg1 + 1];
            int[] var6 = new int[arg1 + 1];
            for (int var7 = 0; var7 < var4.field119.length; var7++) {
                var5[var7] = var4.field119[var7];
                var6[var7] = var4.field120[var7];
            }
            for (int var8 = var4.field119.length; var8 < arg1; var8++) {
                var5[var8] = -1;
                var6[var8] = 0;
            }
            var4.field119 = var5;
            var4.field120 = var6;
        }
        var4.field119[arg1] = arg2;
        var4.field120[arg1] = arg3;
    }

    @ObfuscatedName("q.i(CI)Z")
    public static final boolean method147(char arg0) {
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @ObfuscatedName("cb.f(Ljava/lang/String;Ljava/lang/Throwable;S)V")
    public static void method1851(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = class102.method2496(arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var2 = var2 + " | ";
                }
                var2 = var2 + arg0;
            }
            System.out.println("Error: " + var2);
            String var3 = var2.replace(':', '.');
            String var4 = var3.replace('@', '_');
            String var5 = var4.replace('&', '_');
            String var6 = var5.replace('#', '_');
            if (field1681 == null) {
                return;
            }
            URL var7 = new URL(field1681.getCodeBase(), "clienterror.ws?c=" + field1682 + "&u=" + field1676 + "&v1=" + field1701 + "&v2=" + field1693 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("z.u(IIB)Lb;")
    public static class22 method175(int arg0, int arg1) {
        class51 var2 = (class51) class48.field959.get(arg0);
        return var2.method912(arg1);
    }

    @ObfuscatedName("ds.u(III)I")
    public static int method1996(int arg0, int arg1) {
        int var2 = arg0 >>> 31;
        return (arg0 + var2) / arg1 - var2;
    }

    @ObfuscatedName("am.u(Lgb;III)Lhe;")
    public static class225 method565(class183 arg0, int arg1, int arg2) {
        if (!class226.method1580(arg0, arg1, arg2)) {
            return null;
        }
        class225 var3 = new class225();
        var3.field3224 = field3232;
        var3.field3221 = field2039;
        var3.field3225 = field3231[0];
        var3.field3223 = field3004[0];
        var3.field3220 = field3233[0];
        var3.field3222 = field995[0];
        int var4 = var3.field3222 * var3.field3220;
        byte[] var5 = field3200[0];
        var3.field3229 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var3.field3229[var6] = field3235[var5[var6] & 0xFF];
        }
        class226.method173();
        return var3;
    }

    @ObfuscatedName("n.u(B)Lag;")
    public static class31 method87() {
        class74 var0 = null;
        class31 var1 = new class31();
        try {
            var0 = class105.method849("", field305.field2710, false);
            byte[] var2 = new byte[(int) var0.method1362()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method1363(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class31(new class154(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method1361();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ca.f(II)Lfr;")
    public static class170 method1837(int arg0) {
        int var1 = arg0 >> 16;
        int var2 = arg0 & 0xFFFF;
        if (field2240[var1] == null || field2240[var1][var2] == null) {
            boolean var3 = class170.method179(var1);
            if (!var3) {
                return null;
            }
        }
        return field2240[var1][var2];
    }

    @ObfuscatedName("ew.q(I)V")
    public static void method2633() {
        class198.field2929.method2244();
        class198.field2913.method2244();
        class198.field2902.method2244();
        class198.field2903.method2244();
    }

    @ObfuscatedName("y.n(ILaz;ZI)I")
    public static int method170(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = method1837(class33.field744[--field714]);
        } else {
            var3 = arg2 ? field2124 : field747;
        }
        client.method198(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            field714 -= 2;
            int var4 = class33.field744[field714];
            int var5 = class33.field744[field714 + 1];
            var3.field2340 = var4;
            var3.field2222 = var5;
            class199 var6 = class199.method3402(var4);
            var3.field2271 = var6.field2965;
            var3.field2272 = var6.field2966;
            var3.field2273 = var6.field2967;
            var3.field2269 = var6.field2968;
            var3.field2270 = var6.field2969;
            var3.field2321 = var6.field2979;
            if (arg0 == 1205) {
                var3.field2278 = 0;
            } else if (arg0 == 1212 | var6.field2958 == 1) {
                var3.field2278 = 1;
            } else {
                var3.field2278 = 2;
            }
            if (var3.field2275 > 0) {
                var3.field2321 = var3.field2321 * 32 / var3.field2275;
            } else if (var3.field2231 > 0) {
                var3.field2321 = var3.field2321 * 32 / var3.field2231;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2243 = 2;
            var3.field2264 = class33.field744[--field714];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2243 = 3;
            var3.field2264 = field899.field257.method2997();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.aw(Lan;II)V")
    public static final void method556(class28 arg0, int arg1) {
        if (arg0.field665 > client.field312) {
            int var2 = arg0.field665 - client.field312;
            int var3 = arg0.field661 * 128 + arg0.field623 * 64;
            int var4 = arg0.field663 * 128 + arg0.field623 * 64;
            arg0.field625 += (var3 - arg0.field625) / var2;
            arg0.field620 += (var4 - arg0.field620) / var2;
            arg0.field652 = 0;
            arg0.field670 = arg0.field641;
        } else if (arg0.field666 >= client.field312) {
            if (client.field312 == arg0.field666 || arg0.field651 == -1 || arg0.field621 != 0 || arg0.field653 + 1 > class202.method164(arg0.field651).field3066[arg0.field654]) {
                int var5 = arg0.field666 - arg0.field665;
                int var6 = client.field312 - arg0.field665;
                int var7 = arg0.field661 * 128 + arg0.field623 * 64;
                int var8 = arg0.field663 * 128 + arg0.field623 * 64;
                int var9 = arg0.field662 * 128 + arg0.field623 * 64;
                int var10 = arg0.field644 * 128 + arg0.field623 * 64;
                arg0.field625 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field620 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field652 = 0;
            arg0.field670 = arg0.field641;
            arg0.field671 = arg0.field670;
        } else {
            client.method33(arg0);
        }
        if (arg0.field625 < 128 || arg0.field620 < 128 || arg0.field625 >= 13184 || arg0.field620 >= 13184) {
            arg0.field651 = -1;
            arg0.field669 = -1;
            arg0.field665 = 0;
            arg0.field666 = 0;
            arg0.field625 = arg0.field674[0] * 128 + arg0.field623 * 64;
            arg0.field620 = arg0.field675[0] * 128 + arg0.field623 * 64;
            arg0.method567();
        }
        if (field899 == arg0 && (arg0.field625 < 1536 || arg0.field620 < 1536 || arg0.field625 >= 11776 || arg0.field620 >= 11776)) {
            arg0.field651 = -1;
            arg0.field669 = -1;
            arg0.field665 = 0;
            arg0.field666 = 0;
            arg0.field625 = arg0.field674[0] * 128 + arg0.field623 * 64;
            arg0.field620 = arg0.field675[0] * 128 + arg0.field623 * 64;
            arg0.method567();
        }
        if (arg0.field672 != 0) {
            if (arg0.field629 != -1) {
                class28 var11 = null;
                if (arg0.field629 < 32768) {
                    var11 = client.field412[arg0.field629];
                } else if (arg0.field629 >= 32768) {
                    var11 = client.field423[arg0.field629 - 32768];
                }
                if (var11 != null) {
                    int var12 = arg0.field625 - var11.field625;
                    int var13 = arg0.field620 - var11.field620;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field670 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field678) {
                    arg0.field629 = -1;
                    arg0.field678 = false;
                }
            }
            if (arg0.field647 != -1 && (arg0.field673 == 0 || arg0.field652 > 0)) {
                arg0.field670 = arg0.field647;
                arg0.field647 = -1;
            }
            int var14 = arg0.field670 - arg0.field671 & 0x7FF;
            if (var14 == 0 && arg0.field678) {
                arg0.field629 = -1;
                arg0.field678 = false;
            }
            if (var14 == 0) {
                arg0.field667 = 0;
            } else {
                arg0.field667++;
                if (var14 > 1024) {
                    arg0.field671 -= arg0.field672;
                    boolean var15 = true;
                    if (var14 < arg0.field672 || var14 > 2048 - arg0.field672) {
                        arg0.field671 = arg0.field670;
                        var15 = false;
                    }
                    if (arg0.field648 == arg0.field624 && (arg0.field667 > 25 || var15)) {
                        if (arg0.field634 == -1) {
                            arg0.field648 = arg0.field627;
                        } else {
                            arg0.field648 = arg0.field634;
                        }
                    }
                } else {
                    arg0.field671 += arg0.field672;
                    boolean var16 = true;
                    if (var14 < arg0.field672 || var14 > 2048 - arg0.field672) {
                        arg0.field671 = arg0.field670;
                        var16 = false;
                    }
                    if (arg0.field648 == arg0.field624 && (arg0.field667 > 25 || var16)) {
                        if (arg0.field626 == -1) {
                            arg0.field648 = arg0.field627;
                        } else {
                            arg0.field648 = arg0.field626;
                        }
                    }
                }
                arg0.field671 &= 0x7FF;
            }
        }
        arg0.field622 = false;
        if (arg0.field648 != -1) {
            class202 var18 = class202.method164(arg0.field648);
            if (var18 == null || var18.field3061 == null) {
                arg0.field648 = -1;
            } else {
                arg0.field650++;
                if (arg0.field655 < var18.field3061.length && arg0.field650 > var18.field3066[arg0.field655]) {
                    arg0.field650 = 1;
                    arg0.field655++;
                    client.method1480(var18, arg0.field655, arg0.field625, arg0.field620);
                }
                if (arg0.field655 >= var18.field3061.length) {
                    arg0.field650 = 0;
                    arg0.field655 = 0;
                    client.method1480(var18, arg0.field655, arg0.field625, arg0.field620);
                }
            }
        }
        if (arg0.field669 != -1 && client.field312 >= arg0.field659) {
            if (arg0.field679 < 0) {
                arg0.field679 = 0;
            }
            int var19 = class191.method2599(arg0.field669).field2809;
            if (var19 == -1) {
                arg0.field669 = -1;
            } else {
                class202 var20 = class202.method164(var19);
                if (var20 == null || var20.field3061 == null) {
                    arg0.field669 = -1;
                } else {
                    arg0.field639++;
                    if (arg0.field679 < var20.field3061.length && arg0.field639 > var20.field3066[arg0.field679]) {
                        arg0.field639 = 1;
                        arg0.field679++;
                        client.method1480(var20, arg0.field679, arg0.field625, arg0.field620);
                    }
                    if (arg0.field679 >= var20.field3061.length && (arg0.field679 < 0 || arg0.field679 >= var20.field3061.length)) {
                        arg0.field669 = -1;
                    }
                }
            }
        }
        if (arg0.field651 != -1 && arg0.field621 <= 1) {
            class202 var21 = class202.method164(arg0.field651);
            if (var21.field3057 == 1 && arg0.field656 > 0 && arg0.field665 <= client.field312 && arg0.field666 < client.field312) {
                arg0.field621 = 1;
                return;
            }
        }
        if (arg0.field651 != -1 && arg0.field621 == 0) {
            class202 var22 = class202.method164(arg0.field651);
            if (var22 == null || var22.field3061 == null) {
                arg0.field651 = -1;
            } else {
                arg0.field653++;
                if (arg0.field654 < var22.field3061.length && arg0.field653 > var22.field3066[arg0.field654]) {
                    arg0.field653 = 1;
                    arg0.field654++;
                    client.method1480(var22, arg0.field654, arg0.field625, arg0.field620);
                }
                if (arg0.field654 >= var22.field3061.length) {
                    arg0.field654 -= var22.field3065;
                    arg0.field638++;
                    if (arg0.field638 >= var22.field3071) {
                        arg0.field651 = -1;
                    } else if (arg0.field654 >= 0 && arg0.field654 < var22.field3061.length) {
                        client.method1480(var22, arg0.field654, arg0.field625, arg0.field620);
                    } else {
                        arg0.field651 = -1;
                    }
                }
                arg0.field622 = var22.field3067;
            }
        }
        if (arg0.field621 > 0) {
            arg0.field621--;
        }
    }

    @ObfuscatedName("j.v(ILaz;ZB)I")
    public static int method141(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 5306) {
            int[] var3 = class33.field744;
            int var4 = ++field714 - 1;
            int var5 = client.field390 ? 2 : 1;
            var3[var4] = var5;
            return 1;
        } else if (arg0 == 5307) {
            int var6 = class33.field744[--field714];
            if (var6 == 1 || var6 == 2) {
                client.field517 = 0L;
                if (var6 >= 2) {
                    client.field390 = true;
                } else {
                    client.field390 = false;
                }
                client.method2498();
                if (client.field362 >= 25) {
                    client.method1843();
                }
                class114.field1788 = true;
            }
            return 1;
        } else if (arg0 == 5308) {
            class33.field744[++field714 - 1] = field2059.field715;
            return 1;
        } else if (arg0 == 5309) {
            int var7 = class33.field744[--field714];
            if (var7 == 1 || var7 == 2) {
                field2059.field715 = var7;
                class31.method2638();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fz.bx(II)Z")
    public static final boolean method3109(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = client.field524[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("u.ca([Lfr;Lfr;ZI)V")
    public static void method17(class170[] arg0, class170 arg1, boolean arg2) {
        int var3 = arg1.field2328 == 0 ? arg1.field2294 : arg1.field2328;
        int var4 = arg1.field2244 == 0 ? arg1.field2210 : arg1.field2244;
        client.method1159(arg0, arg1.field2274, var3, var4, arg2);
        if (arg1.field2344 != null) {
            client.method1159(arg1.field2344, arg1.field2274, var3, var4, arg2);
        }
        class18 var5 = (class18) client.field554.method2254((long) arg1.field2274);
        if (var5 != null) {
            int var6 = var5.field190;
            if (class170.method179(var6)) {
                client.method1159(field2240[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2326 == 1337) {
        }
    }

    @ObfuscatedName("cl.dn(Lfr;I)Z")
    public static final boolean method1481(class170 arg0) {
        int var1 = arg0.field2326;
        if (var1 == 205) {
            client.field356 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            client.field510.method3017(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            client.field510.method2991(var4, var5 == 1);
        }
        if (var1 == 324) {
            client.field510.method2992(false);
        }
        if (var1 == 325) {
            client.field510.method2992(true);
        }
        if (var1 == 326) {
            client.field495.method2889(5);
            client.field510.method2993(client.field495);
            return true;
        } else {
            return false;
        }
    }
}
