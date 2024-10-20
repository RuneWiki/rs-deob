package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("s.cp")
    public static class161 field10;

    @ObfuscatedName("client.ob")
    public static class102 field1088;

    @ObfuscatedName("bj.bk")
    public static String field1140;

    @ObfuscatedName("bj.do")
    public static class245 field1142;

    @ObfuscatedName("r.ox")
    public static int field12;

    @ObfuscatedName("ce.k")
    public static int field1209;

    @ObfuscatedName("ce.pi")
    public static int field1210;

    @ObfuscatedName("cg.oz")
    public static int field1221;

    @ObfuscatedName("ch.pq")
    public static int field1237;

    @ObfuscatedName("cc.a")
    public static class224 field1254;

    @ObfuscatedName("cc.g")
    public static String[] field1256;

    @ObfuscatedName("cc.t")
    public static int field1260;

    @ObfuscatedName("cc.z")
    public static int[] field1266;

    @ObfuscatedName("cz.nk")
    public static class295 field1281;

    @ObfuscatedName("cz.jk")
    public static int field1283;

    @ObfuscatedName("cv.aq")
    public static int[] field1296;

    @ObfuscatedName("r.a")
    public static class112 field13;

    @ObfuscatedName("cd.eq")
    public static int[] field1304;

    @ObfuscatedName("cn.fx")
    public static byte[][] field1321;

    @ObfuscatedName("cp.k")
    public static byte[][][] field1324;

    @ObfuscatedName("ca.e")
    public static int[] field1331;

    @ObfuscatedName("ca.r")
    public static class294 field1332;

    @ObfuscatedName("ca.x")
    public static class294[] field1333;

    @ObfuscatedName("ca.u")
    public static short[] field1344;

    @ObfuscatedName("ca.n")
    public static class294 field1352;

    @ObfuscatedName("ca.fk")
    public static int[] field1364;

    @ObfuscatedName("ca.ae")
    public static int[] field1365;

    @ObfuscatedName("ct.f")
    public static int field1393;

    @ObfuscatedName("ct.e")
    public static int field1394;

    @ObfuscatedName("r.bz")
    public static int field14;

    @ObfuscatedName("cf.dh")
    public static String field1413;

    @ObfuscatedName("cf.ne")
    public static class76[] field1420;

    @ObfuscatedName("cm.f")
    public static int field1424;

    @ObfuscatedName("cm.cq")
    public static int field1427;

    @ObfuscatedName("cm.fn")
    public static class295 field1429;

    @ObfuscatedName("co.cf")
    public static class245 field1451;

    @ObfuscatedName("co.a")
    public static class294 field1454;

    @ObfuscatedName("co.qd")
    public static short[] field1455;

    @ObfuscatedName("dc.u")
    public static byte[] field1485;

    @ObfuscatedName("dc.aq")
    public static int[] field1487;

    @ObfuscatedName("dc.n")
    public static int field1491;

    @ObfuscatedName("dc.t")
    public static int field1492;

    @ObfuscatedName("dc.k")
    public static int field1493;

    @ObfuscatedName("dc.d")
    public static int field1495;

    @ObfuscatedName("dc.ae")
    public static float[] field1496;

    @ObfuscatedName("dc.z")
    public static float[] field1499;

    @ObfuscatedName("g.oe")
    public static class109 field15;

    @ObfuscatedName("dc.m")
    public static boolean[] field1500;

    @ObfuscatedName("dc.h")
    public static int[] field1501;

    @ObfuscatedName("dc.a")
    public static class108[] field1502;

    @ObfuscatedName("dc.o")
    public static class104[] field1507;

    @ObfuscatedName("dc.e")
    public static float[] field1508;

    @ObfuscatedName("dc.q")
    public static class115[] field1509;

    @ObfuscatedName("dc.w")
    public static float[] field1510;

    @ObfuscatedName("dc.av")
    public static float[] field1511;

    @ObfuscatedName("dc.au")
    public static float[] field1512;

    @ObfuscatedName("dc.v")
    public static float[] field1513;

    @ObfuscatedName("dc.ak")
    public static int[] field1514;

    @ObfuscatedName("dc.j")
    public static class120[] field1515;

    @ObfuscatedName("dy.o")
    public static boolean[] field1524;

    @ObfuscatedName("dy.n")
    public static int[] field1533;

    @ObfuscatedName("dy.d")
    public static int[] field1534;

    @ObfuscatedName("do.k")
    public static int field1538;

    @ObfuscatedName("do.n")
    public static class111 field1539;

    @ObfuscatedName("do.a")
    public static class103 field1541;

    @ObfuscatedName("do.f")
    public static boolean field1546;

    @ObfuscatedName("do.x")
    public static int field1556;

    @ObfuscatedName("dj.n")
    public static class150 field1572;

    @ObfuscatedName("dj.br")
    public static String field1573;

    @ObfuscatedName("dj.t")
    public static int field1574;

    @ObfuscatedName("dj.m")
    public static class181 field1575;

    @ObfuscatedName("dg.fg")
    public static byte[][] field1579;

    @ObfuscatedName("dg.ni")
    public static byte field1584;

    @ObfuscatedName("dh.k")
    public static int field1617;

    @ObfuscatedName("dh.t")
    public static float field1624;

    @ObfuscatedName("dx.q")
    public static int[] field1681;

    @ObfuscatedName("di.t")
    public static class243 field1687;

    @ObfuscatedName("di.q")
    public static class242 field1691;

    @ObfuscatedName("g.v")
    public static int[] field17;

    @ObfuscatedName("df.m")
    public static int field1778;

    @ObfuscatedName("ds.j")
    public static int[] field1794;

    @ObfuscatedName("ec.eb")
    public static class271 field1818;

    @ObfuscatedName("ec.br")
    public static class294[] field1830;

    @ObfuscatedName("ev.be")
    public static int field1874;

    @ObfuscatedName("ev.bt")
    public static int field1889;

    @ObfuscatedName("ev.by")
    public static int field1891;

    @ObfuscatedName("ek.n")
    public static int field1902;

    @ObfuscatedName("ek.x")
    public static int field1905;

    @ObfuscatedName("ek.u")
    public static int field1906;

    @ObfuscatedName("eh.k")
    public static short[] field1911;

    @ObfuscatedName("ej.a")
    public static int field1917;

    @ObfuscatedName("ej.m")
    public static int field1929;

    @ObfuscatedName("ej.j")
    public static int field1930;

    @ObfuscatedName("ej.h")
    public static int field1931;

    @ObfuscatedName("ej.c")
    public static int field1933;

    @ObfuscatedName("ej.y")
    public static int field1934;

    @ObfuscatedName("ej.p")
    public static int field1935;

    @ObfuscatedName("ej.z")
    public static class145 field1938;

    @ObfuscatedName("ej.q")
    public static int field1941;

    @ObfuscatedName("ep.n")
    public static int field1953;

    @ObfuscatedName("ep.u")
    public static int[] field1955;

    @ObfuscatedName("eo.w")
    public static int field1968;

    @ObfuscatedName("eo.p")
    public static int field1970;

    @ObfuscatedName("eo.h")
    public static int field1972;

    @ObfuscatedName("eo.c")
    public static int field1973;

    @ObfuscatedName("eo.bb")
    public static boolean[][] field1976;

    @ObfuscatedName("eo.z")
    public static int field1978;

    @ObfuscatedName("eo.e")
    public static int field1979;

    @ObfuscatedName("eo.v")
    public static int field1980;

    @ObfuscatedName("eo.y")
    public static int field1982;

    @ObfuscatedName("eo.au")
    public static int field1983;

    @ObfuscatedName("eo.ak")
    public static int field1985;

    @ObfuscatedName("eo.l")
    public static int field1987;

    @ObfuscatedName("eo.av")
    public static int field1991;

    @ObfuscatedName("eo.be")
    public static int field1993;

    @ObfuscatedName("eo.ae")
    public static int field2003;

    @ObfuscatedName("eo.br")
    public static int field2012;

    @ObfuscatedName("eo.bl")
    public static int field2013;

    @ObfuscatedName("eo.i")
    public static int field2014;

    @ObfuscatedName("eo.bt")
    public static int field2015;

    @ObfuscatedName("eo.by")
    public static int field2016;

    @ObfuscatedName("eo.bk")
    public static int field2017;

    @ObfuscatedName("ea.cb")
    public static class245 field2021;

    @ObfuscatedName("eu.lt")
    public static class96 field2024;

    @ObfuscatedName("el.t")
    public static ScheduledExecutorService field2036;

    @ObfuscatedName("et.bs")
    public static class294[] field2041;

    @ObfuscatedName("es.dy")
    public static class245 field2072;

    @ObfuscatedName("ew.os")
    public static int field2118;

    @ObfuscatedName("eg.b")
    public static Applet field2121;

    @ObfuscatedName("eg.r")
    public static int field2122;

    @ObfuscatedName("eq.cu")
    public static class245 field2134;

    @ObfuscatedName("eq.s")
    public static String field2135;

    @ObfuscatedName("eq.b")
    public static String field2140;

    @ObfuscatedName("eq.cy")
    public static boolean field2143;

    @ObfuscatedName("fk.x")
    public static File field2148;

    @ObfuscatedName("fk.g")
    public static File field2155;

    @ObfuscatedName("fl.s")
    public static File field2157;

    @ObfuscatedName("u.gi")
    public static class7[] field216;

    @ObfuscatedName("fg.cn")
    public static class155 field2164;

    @ObfuscatedName("fr.x")
    public static int field2205;

    @ObfuscatedName("fr.aa")
    public static int field2208;

    @ObfuscatedName("fp.au")
    public static int[] field2209;

    @ObfuscatedName("fp.f")
    public static int field2213;

    @ObfuscatedName("t.h")
    public static String[] field223;

    @ObfuscatedName("t.qq")
    public static class162 field224;

    @ObfuscatedName("fn.in")
    public static int field2400;

    @ObfuscatedName("fn.z")
    public static String field2403;

    @ObfuscatedName("fc.fh")
    public static int field2416;

    @ObfuscatedName("fb.fd")
    public static class294[] field2430;

    @ObfuscatedName("fa.r")
    public static int[] field2432;

    @ObfuscatedName("fz.t")
    public static byte[][][] field2441;

    @ObfuscatedName("fz.ha")
    public static class224 field2443;

    @ObfuscatedName("fs.a")
    public static class271 field2487;

    @ObfuscatedName("fs.bq")
    public static class239 field2496;

    @ObfuscatedName("fm.t")
    public static int[] field2505;

    @ObfuscatedName("gz.b")
    public static long field2506;

    @ObfuscatedName("gj.pa")
    public static int field2512;

    @ObfuscatedName("o.ev")
    public static class155 field253;

    @ObfuscatedName("ga.bl")
    public static class299 field2530;

    @ObfuscatedName("a.b")
    public static boolean field257;

    @ObfuscatedName("a.db")
    public static int field258;

    @ObfuscatedName("hs.u")
    public static int field2587;

    @ObfuscatedName("hs.g")
    public static class212 field2588;

    @ObfuscatedName("hs.o")
    public static class217 field2589;

    @ObfuscatedName("hs.s")
    public static class243 field2590;

    @ObfuscatedName("hs.b")
    public static class243 field2591;

    @ObfuscatedName("hs.r")
    public static int field2592;

    @ObfuscatedName("hs.fe")
    public static class295[] field2594;

    @ObfuscatedName("f.fz")
    public static class295[] field26;

    @ObfuscatedName("q.jd")
    public static class224 field265;

    @ObfuscatedName("hy.bk")
    public static class295[] field2677;

    @ObfuscatedName("q.es")
    public static int field269;

    @ObfuscatedName("ha.t")
    public static short[][] field2693;

    @ObfuscatedName("f.n")
    public static short[][] field27;

    @ObfuscatedName("hq.j")
    public static class123[] field2701;

    @ObfuscatedName("hx.hh")
    public static class224 field2710;

    @ObfuscatedName("j.lk")
    public static class224[] field272;

    @ObfuscatedName("hx.k")
    public static class243 field2786;

    @ObfuscatedName("hx.f")
    public static class224[][] field2807;

    @ObfuscatedName("hx.pd")
    public static int field2849;

    @ObfuscatedName("hh.r")
    public static int field2851;

    @ObfuscatedName("hf.oy")
    public static class109 field2864;

    @ObfuscatedName("h.az")
    public static int field289;

    @ObfuscatedName("hz.cm")
    public static class245 field2898;

    @ObfuscatedName("c.s")
    public static long field290;

    @ObfuscatedName("he.d")
    public static boolean field2906;

    @ObfuscatedName("he.ga")
    public static int field2909;

    @ObfuscatedName("he.k")
    public static int field2910;

    @ObfuscatedName("he.u")
    public static class295 field2911;

    @ObfuscatedName("c.b")
    public static class243 field292;

    @ObfuscatedName("y.s")
    public static class243 field295;

    @ObfuscatedName("p.i")
    public static String field296;

    @ObfuscatedName("p.u")
    public static byte[][][] field297;

    @ObfuscatedName("p.b")
    public static class161 field300;

    @ObfuscatedName("i.bh")
    public static class294 field308;

    @ObfuscatedName("l.ak")
    public static int[] field313;

    @ObfuscatedName("z.cr")
    public static class245 field316;

    @ObfuscatedName("z.o")
    public static int field318;

    @ObfuscatedName("hn.cd")
    public static char field3201;

    @ObfuscatedName("hn.g")
    public static byte[][][] field3205;

    @ObfuscatedName("id.q")
    public static class224 field3211;

    @ObfuscatedName("ik.al")
    public static class292 field3228;

    @ObfuscatedName("e.dj")
    public static class245 field324;

    @ObfuscatedName("iq.d")
    public static class294 field3242;

    @ObfuscatedName("ic.t")
    public static int field3260;

    @ObfuscatedName("ic.bb")
    public static class240 field3263;

    @ObfuscatedName("il.l")
    public static String field3265;

    @ObfuscatedName("e.cs")
    public static class245 field327;

    @ObfuscatedName("e.c")
    public static String[] field328;

    @ObfuscatedName("iz.x")
    public static Thread field3288;

    @ObfuscatedName("v.jb")
    public static int field329;

    @ObfuscatedName("iz.f")
    public static class295 field3293;

    @ObfuscatedName("is.r")
    public static long field3307;

    @ObfuscatedName("is.a")
    public static boolean field3317;

    @ObfuscatedName("it.fb")
    public static class295[] field3331;

    @ObfuscatedName("ih.eo")
    public static class149 field3332;

    @ObfuscatedName("ih.j")
    public static int field3335;

    @ObfuscatedName("ih.b")
    public static class243 field3337;

    @ObfuscatedName("ip.ao")
    public static Image field3338;

    @ObfuscatedName("ip.s")
    public static int field3339;

    @ObfuscatedName("ip.b")
    public static class243 field3342;

    @ObfuscatedName("ib.s")
    public static class250[] field3346;

    @ObfuscatedName("ib.r")
    public static int field3347;

    @ObfuscatedName("ib.b")
    public static class243 field3352;

    @ObfuscatedName("ia.b")
    public static class243 field3370;

    @ObfuscatedName("im.b")
    public static class243 field3373;

    @ObfuscatedName("ix.b")
    public static class243 field3379;

    @ObfuscatedName("ix.s")
    public static class243 field3386;

    @ObfuscatedName("ie.cl")
    public static class245 field3391;

    @ObfuscatedName("ie.b")
    public static class243 field3393;

    @ObfuscatedName("ie.me")
    public static class286 field3398;

    @ObfuscatedName("w.bs")
    public static int field340;

    @ObfuscatedName("if.s")
    public static class243 field3400;

    @ObfuscatedName("if.b")
    public static class243 field3405;

    @ObfuscatedName("w.li")
    public static int field341;

    @ObfuscatedName("iv.b")
    public static class243 field3414;

    @ObfuscatedName("iv.s")
    public static String field3422;

    @ObfuscatedName("ir.y")
    public static int field3427;

    @ObfuscatedName("ir.u")
    public static class243 field3428;

    @ObfuscatedName("w.h")
    public static class48 field343;

    @ObfuscatedName("ig.b")
    public static class243 field3432;

    @ObfuscatedName("ii.b")
    public static class243 field3439;

    @ObfuscatedName("in.n")
    public static int field3444;

    @ObfuscatedName("in.b")
    public static class243 field3446;

    @ObfuscatedName("in.k")
    public static int field3448;

    @ObfuscatedName("jk.pe")
    public static int field3449;

    @ObfuscatedName("jk.b")
    public static class243 field3454;

    @ObfuscatedName("jk.iz")
    public static int field3459;

    @ObfuscatedName("jb.b")
    public static class243 field3461;

    @ObfuscatedName("jb.r")
    public static class243 field3463;

    @ObfuscatedName("jb.s")
    public static class243 field3469;

    @ObfuscatedName("jt.r")
    public static class243 field3488;

    @ObfuscatedName("jt.s")
    public static class243 field3489;

    @ObfuscatedName("jj.t")
    public static boolean field3543;

    @ObfuscatedName("jj.f")
    public static class243 field3549;

    @ObfuscatedName("jc.s")
    public static class243 field3602;

    @ObfuscatedName("av.gs")
    public static int field361;

    @ObfuscatedName("jc.b")
    public static class243 field3611;

    @ObfuscatedName("av.jr")
    public static int field362;

    @ObfuscatedName("au.eu")
    public static class271 field364;

    @ObfuscatedName("jx.b")
    public static class243 field3646;

    @ObfuscatedName("jh.r")
    public static class243 field3651;

    @ObfuscatedName("jh.qb")
    public static class301 field3652;

    @ObfuscatedName("jh.s")
    public static class243 field3668;

    @ObfuscatedName("ju.d")
    public static class243 field3675;

    @ObfuscatedName("ju.ix")
    public static int field3678;

    @ObfuscatedName("ju.k")
    public static class294[] field3679;

    @ObfuscatedName("ju.fa")
    public static class295[] field3680;

    @ObfuscatedName("au.j")
    public static int[][][] field369;

    @ObfuscatedName("js.n")
    public static class294[] field3699;

    @ObfuscatedName("jw.b")
    public static class173 field3708;

    @ObfuscatedName("jw.ab")
    public static GarbageCollectorMXBean field3709;

    @ObfuscatedName("au.om")
    public static int field371;

    @ObfuscatedName("je.g")
    public static class294 field3712;

    @ObfuscatedName("jy.lj")
    public static class158 field3718;

    @ObfuscatedName("jv.iq")
    public static class74 field3721;

    @ObfuscatedName("jm.t")
    public static int[] field3734;

    @ObfuscatedName("ji.gd")
    public static int field3739;

    @ObfuscatedName("ae.id")
    public static int field376;

    @ObfuscatedName("jq.x")
    public static int[] field3787;

    @ObfuscatedName("kd.ak")
    public static Font field3788;

    @ObfuscatedName("kv.aa")
    public static client field3803;

    @ObfuscatedName("ko.ae")
    public static int field3807;

    @ObfuscatedName("ko.ak")
    public static int field3811;

    @ObfuscatedName("ko.au")
    public static int[] field3812;

    @ObfuscatedName("kn.ot")
    public static int field3815;

    @ObfuscatedName("kg.u")
    public static int[] field3846;

    @ObfuscatedName("kg.s")
    public static int field3847;

    @ObfuscatedName("kg.b")
    public static int field3848;

    @ObfuscatedName("kg.f")
    public static int[] field3849;

    @ObfuscatedName("ae.kr")
    public static int field388;

    @ObfuscatedName("ak.dn")
    public static class245 field393;

    @ObfuscatedName("ak.jm")
    public static class224 field395;

    @ObfuscatedName("aq.qe")
    public static int field408;

    @ObfuscatedName("an.ed")
    public static int field412;

    @ObfuscatedName("an.t")
    public static int field415;

    @ObfuscatedName("an.ja")
    public static class89 field416;

    @ObfuscatedName("am.ec")
    public static long field421;

    @ObfuscatedName("ao.ns")
    public static int field451;

    @ObfuscatedName("at.lh")
    public static int field458;

    @ObfuscatedName("ac.ef")
    public static int field470;

    @ObfuscatedName("ac.p")
    public static class181 field474;

    @ObfuscatedName("as.x")
    public static byte[][][] field475;

    @ObfuscatedName("aw.oq")
    public static class116 field498;

    @ObfuscatedName("aj.nw")
    public static byte field518;

    @ObfuscatedName("aj.bx")
    public static class71 field520;

    @ObfuscatedName("aj.ft")
    public static int[] field524;

    @ObfuscatedName("ag.bz")
    public static class294[] field528;

    @ObfuscatedName("af.aw")
    public static String field538;

    @ObfuscatedName("af.bq")
    public static String field539;

    @ObfuscatedName("af.v")
    public static int[] field541;

    @ObfuscatedName("ay.ci")
    public static class245 field542;

    @ObfuscatedName("ay.gl")
    public static int field543;

    @ObfuscatedName("ay.gf")
    public static int field546;

    @ObfuscatedName("ax.a")
    public static int[] field556;

    @ObfuscatedName("ax.jl")
    public static int field563;

    @ObfuscatedName("ai.ii")
    public static int field574;

    @ObfuscatedName("aa.ay")
    public static boolean field609;

    @ObfuscatedName("ad.bi")
    public static int field610;

    @ObfuscatedName("ad.d")
    public static int field612;

    @ObfuscatedName("ad.n")
    public static class243 field613;

    @ObfuscatedName("ad.fl")
    public static int[][] field615;

    @ObfuscatedName("bi.co")
    public static class245 field617;

    @ObfuscatedName("bi.o")
    public static class294 field618;

    @ObfuscatedName("bq.x")
    public static class80[] field623;

    @ObfuscatedName("bb.fq")
    public static class294[] field633;

    @ObfuscatedName("bb.u")
    public static boolean[] field635;

    @ObfuscatedName("bt.o")
    public static class160 field641;

    @ObfuscatedName("bt.b")
    public static class156 field671;

    @ObfuscatedName("be.fu")
    public static class295 field680;

    @ObfuscatedName("by.qs")
    public static int field697;

    @ObfuscatedName("by.dt")
    public static class245 field698;

    @ObfuscatedName("bk.dc")
    public static class245 field702;

    @ObfuscatedName("bk.f")
    public static byte[][][] field703;

    @ObfuscatedName("bk.k")
    public static int[][] field704;

    @ObfuscatedName("bk.n")
    public static int[] field707;

    @ObfuscatedName("bk.d")
    public static int[] field708;

    @ObfuscatedName("bk.lr")
    public static int field712;

    @ObfuscatedName("bk.o")
    public static int[] field720;

    @ObfuscatedName("br.qw")
    public static class298 field725;

    @ObfuscatedName("bs.aq")
    public static FontMetrics field738;

    @ObfuscatedName("bh.l")
    public static int[] field759;

    @ObfuscatedName("bh.cx")
    public static class245 field760;

    @ObfuscatedName("bp.z")
    public static int field764;

    @ObfuscatedName("bp.fj")
    public static class295[] field765;

    @ObfuscatedName("bp.t")
    public static class294 field767;

    @ObfuscatedName("bf.g")
    public static int[] field775;

    @ObfuscatedName("bv.fc")
    public static class294[] field788;

    @ObfuscatedName("bx.h")
    public static int field789;

    @ObfuscatedName("bx.dk")
    public static int field791;

    @ObfuscatedName("bm.dm")
    public static int field794;

    @ObfuscatedName("bm.k")
    public static byte[][] field797;

    @ObfuscatedName("bm.de")
    public static int field799;

    @ObfuscatedName("bm.qx")
    public static class81 field801;

    @ObfuscatedName("bm.f")
    public static class243 field803;

    @ObfuscatedName("bu.hx")
    public static class224 field813;

    @ObfuscatedName("bd.dq")
    public static class245 field841;

    @ObfuscatedName("bd.fo")
    public static class295[] field843;

    @ObfuscatedName("bo.r")
    public static class243 field846;

    @ObfuscatedName("bo.gx")
    public static int field847;

    @ObfuscatedName("bg.er")
    public static int field854;

    @ObfuscatedName("bg.a")
    public static int field855;

    @ObfuscatedName("bg.qg")
    public static class14 field856;

    @ObfuscatedName("bg.eh")
    public static class161 field858;

    @ObfuscatedName("bg.qz")
    public static long field861;

    @ObfuscatedName("bg.fv")
    public static int field862;

    @ObfuscatedName("client.ct")
    public static long field864;

    @ObfuscatedName("client.el")
    public static class271 field910;

    @ObfuscatedName("client.fw")
    public static class139 field918;

    @ObfuscatedName("client.gi")
    public static int field930;

    @ObfuscatedName("client.ea")
    public static class270 field933;

    @ObfuscatedName("bu.b(IIII)I")
    public static int method978(int arg0, int arg1, int arg2) {
        int var3 = arg2 & 0x3;
        if (var3 == 0) {
            return arg0;
        } else if (var3 == 1) {
            return arg1;
        } else if (var3 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @ObfuscatedName("il.b(Lij;B)V")
    public static void method3813(class243 arg0) {
        field3432 = arg0;
    }

    @ObfuscatedName("p.r(I)[Liw;")
    public static class236[] method133() {
        return new class236[] { class236.field3215, class236.field3216, class236.field3217, class236.field3218, class236.field3214, class236.field3213, class236.field3220, class236.field3219 };
    }

    @ObfuscatedName("hk.b(IB)Lif;")
    public static class255 method3684(int arg0) {
        class255 var1 = (class255) class255.field3409.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3405.method3887(3, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4052(new class181(var2));
        }
        class255.field3409.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hf.r(Ljava/lang/CharSequence;Lkz;I)Ljava/lang/String;")
    public static String method3795(CharSequence arg0, class299 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && class275.method3998(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2) {
            char var4 = arg0.charAt(var3 - 1);
            boolean var5 = var4 == 160 || var4 == ' ' || var4 == '_' || var4 == '-';
            if (!var5) {
                break;
            }
            var3--;
        }
        int var6 = var3 - var2;
        if (var6 >= 1) {
            byte var8;
            if (arg1 == null) {
                var8 = 12;
            } else {
                switch(arg1.field3920) {
                    case 1:
                        var8 = 20;
                        break;
                    default:
                        var8 = 12;
                }
            }
            if (var6 <= var8) {
                StringBuilder var9 = new StringBuilder(var6);
                for (int var10 = var2; var10 < var3; var10++) {
                    char var11 = arg0.charAt(var10);
                    if (class275.method726(var11)) {
                        char var12;
                        switch(var11) {
                            case ' ':
                            case '-':
                            case '_':
                            case ' ':
                                var12 = '_';
                                break;
                            case '#':
                            case '[':
                            case ']':
                                var12 = var11;
                                break;
                            case 'À':
                            case 'Á':
                            case 'Â':
                            case 'Ã':
                            case 'Ä':
                            case 'à':
                            case 'á':
                            case 'â':
                            case 'ã':
                            case 'ä':
                                var12 = 'a';
                                break;
                            case 'Ç':
                            case 'ç':
                                var12 = 'c';
                                break;
                            case 'È':
                            case 'É':
                            case 'Ê':
                            case 'Ë':
                            case 'è':
                            case 'é':
                            case 'ê':
                            case 'ë':
                                var12 = 'e';
                                break;
                            case 'Í':
                            case 'Î':
                            case 'Ï':
                            case 'í':
                            case 'î':
                            case 'ï':
                                var12 = 'i';
                                break;
                            case 'Ñ':
                            case 'ñ':
                                var12 = 'n';
                                break;
                            case 'Ò':
                            case 'Ó':
                            case 'Ô':
                            case 'Õ':
                            case 'Ö':
                            case 'ò':
                            case 'ó':
                            case 'ô':
                            case 'õ':
                            case 'ö':
                                var12 = 'o';
                                break;
                            case 'Ù':
                            case 'Ú':
                            case 'Û':
                            case 'Ü':
                            case 'ù':
                            case 'ú':
                            case 'û':
                            case 'ü':
                                var12 = 'u';
                                break;
                            case 'ß':
                                var12 = 'b';
                                break;
                            case 'ÿ':
                            case 'Ÿ':
                                var12 = 'y';
                                break;
                            default:
                                var12 = Character.toLowerCase(var11);
                        }
                        if (var12 != 0) {
                            var9.append(var12);
                        }
                    }
                }
                if (var9.length() == 0) {
                    return null;
                }
                return var9.toString();
            }
        }
        return null;
    }

    @ObfuscatedName("x.u(II)I")
    public static int method10(int arg0) {
        class72 var1 = (class72) class97.field1426.method3308((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (class97.field1425.field2575 == var1.field2561) {
            return -1;
        } else {
            return ((class72) var1.field2561).field810;
        }
    }

    @ObfuscatedName("u.f(Lev;IIII)Z")
    public static final boolean method18(class133 arg0, int arg1, int arg2, int arg3) {
        if (!class134.method2485()) {
            return false;
        }
        class134.method158();
        int var4 = arg0.field1876 + arg1;
        int var5 = arg0.field1864 + arg2;
        int var6 = arg0.field1865 + arg3;
        int var7 = arg0.field1866;
        int var8 = arg0.field1840;
        int var9 = arg0.field1868;
        int var10 = field1905 - var4;
        int var11 = field1393 - var5;
        int var12 = field1906 - var6;
        if (Math.abs(var10) > field612 + var7) {
            return false;
        } else if (Math.abs(var11) > field318 + var8) {
            return false;
        } else if (Math.abs(var12) > field855 + var9) {
            return false;
        } else if (Math.abs(field1209 * var12 - field1902 * var11) > field855 * var8 + field318 * var9) {
            return false;
        } else if (Math.abs(field1902 * var10 - field1574 * var12) > field855 * var7 + field612 * var9) {
            return false;
        } else {
            return Math.abs(field1574 * var11 - field1209 * var10) <= field612 * var8 + field318 * var7;
        }
    }

    @ObfuscatedName("aj.g(IIIZIZB)V")
    public static void method513(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class80 var8 = field623[var6];
        field623[var6] = field623[arg1];
        field623[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (class80.method3678(field623[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class80 var10 = field623[var9];
                field623[var9] = field623[var7];
                field623[var7++] = var10;
            }
        }
        field623[arg1] = field623[var7];
        field623[var7] = var8;
        method513(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method513(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("g.s(ZI)V")
    public static void method5(boolean arg0) {
        if (field300 == null) {
            return;
        }
        try {
            class181 var1 = new class181(4);
            var1.method2929(arg0 ? 2 : 3);
            var1.method2931(0);
            field300.method2768(var1.field2495, 0, 4);
        } catch (IOException var5) {
            try {
                field300.method2763();
            } catch (Exception var4) {
            }
            class246.field3325++;
            field300 = null;
        }
    }

    @ObfuscatedName("bz.es(I)Lkw;")
    public static class298 method935() {
        return field725;
    }

    @ObfuscatedName("ad.u(III)I")
    public static final int method639(int arg0, int arg1) {
        int var2 = class62.method142(arg0 + 45365, arg1 + 91923, 4) - 128 + (class62.method142(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (class62.method142(arg0, arg1, 1) - 128 >> 2);
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @ObfuscatedName("x.d(IIB)I")
    public static final int method11(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("v.fx(ZB)V")
    public static final void method163(boolean arg0) {
        if (arg0) {
            client.field899 = class92.field1356 ? class151.field2106 : class151.field2105;
            return;
        }
        LinkedHashMap var1 = field801.field1228;
        String var2 = class92.field1351;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        client.field899 = var1.containsKey(var4) ? class151.field2110 : class151.field2104;
    }

    @ObfuscatedName("k.gp(IIZI)V")
    public static final void method43(int arg0, int arg1, boolean arg2) {
        if (arg2 && field470 == arg0 && field412 == arg1) {
            return;
        }
        field470 = arg0;
        field412 = arg1;
        client.method2(25);
        client.method2802(class233.field2927, true);
        int var3 = field269;
        int var4 = field854;
        field269 = (arg0 - 6) * 8;
        field854 = (arg1 - 6) * 8;
        int var5 = field269 - var3;
        int var6 = field854 - var4;
        int var7 = field269;
        int var8 = field854;
        for (int var9 = 0; var9 < 32768; var9++) {
            class86 var10 = client.field874[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1200[var11] -= var5;
                    var10.field1201[var11] -= var6;
                }
                var10.field1195 -= var5 * 128;
                var10.field1157 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class74 var13 = client.field1098[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1200[var14] -= var5;
                    var13.field1201[var14] -= var6;
                }
                var13.field1195 -= var5 * 128;
                var13.field1157 -= var6 * 128;
            }
        }
        byte var15 = 0;
        byte var16 = 104;
        byte var17 = 1;
        if (var5 < 0) {
            var15 = 103;
            var16 = -1;
            var17 = -1;
        }
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 1;
        if (var6 < 0) {
            var18 = 103;
            var19 = -1;
            var20 = -1;
        }
        for (int var21 = var15; var21 != var16; var21 += var17) {
            for (int var22 = var18; var22 != var19; var22 += var20) {
                int var23 = var5 + var21;
                int var24 = var6 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        client.field978[var25][var21][var22] = client.field978[var25][var23][var24];
                    } else {
                        client.field978[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) client.field885.method3405(); var26 != null; var26 = (class77) client.field885.method3414()) {
            var26.field1129 -= var5;
            var26.field1132 -= var6;
            if (var26.field1129 < 0 || var26.field1132 < 0 || var26.field1129 >= 104 || var26.field1132 >= 104) {
                var26.method3392();
            }
        }
        if (client.field979 != 0) {
            client.field979 -= var5;
            client.field1081 -= var6;
        }
        client.field1032 = 0;
        client.field1095 = false;
        client.field1082 = -1;
        client.field981.method3399();
        client.field947.method3399();
        for (int var27 = 0; var27 < 4; var27++) {
            client.field916[var27].method2804();
        }
    }

    @ObfuscatedName("i.gh(IIIIIIIIII)V")
    public static final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) client.field885.method3405(); var10 != null; var10 = (class77) client.field885.method3414()) {
            if (var10.field1138 == arg0 && var10.field1129 == arg1 && var10.field1132 == arg2 && var10.field1131 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1138 = arg0;
            var9.field1131 = arg3;
            var9.field1129 = arg1;
            var9.field1132 = arg2;
            client.method884(var9);
            client.field885.method3400(var9);
        }
        var9.field1135 = arg4;
        var9.field1137 = arg5;
        var9.field1136 = arg6;
        var9.field1144 = arg7;
        var9.field1130 = arg8;
    }
}
