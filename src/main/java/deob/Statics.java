package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.security.SecureRandom;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("bn.l")
    public static int field1005;

    @ObfuscatedName("a.w")
    public static int[] field101;

    @ObfuscatedName("bm.k")
    public static String[] field1034;

    @ObfuscatedName("bm.o")
    public static int[] field1036;

    @ObfuscatedName("bm.jy")
    public static class233 field1042;

    @ObfuscatedName("bm.p")
    public static int field1049;

    @ObfuscatedName("bm.qz")
    public static int field1051;

    @ObfuscatedName("bz.d")
    public static class226 field1056;

    @ObfuscatedName("bz.fs")
    public static class301 field1065;

    @ObfuscatedName("bd.l")
    public static class250 field1071;

    @ObfuscatedName("bd.fe")
    public static int[] field1072;

    @ObfuscatedName("bd.w")
    public static class321 field1073;

    @ObfuscatedName("bo.w")
    public static int field1076;

    @ObfuscatedName("bo.oc")
    public static class310 field1078;

    @ObfuscatedName("bo.t")
    public static int[] field1080;

    @ObfuscatedName("bl.cb")
    public static char field1081;

    @ObfuscatedName("bs.e")
    public static int field1099;

    @ObfuscatedName("z.dy")
    public static class252 field110;

    @ObfuscatedName("bc.dw")
    public static class252 field1109;

    @ObfuscatedName("bc.p")
    public static int[] field1110;

    @ObfuscatedName("bc.lz")
    public static int field1111;

    @ObfuscatedName("ci.i")
    public static class322 field1129;

    @ObfuscatedName("ci.k")
    public static class321 field1133;

    @ObfuscatedName("ci.v")
    public static boolean field1140;

    @ObfuscatedName("ci.o")
    public static class321 field1145;

    @ObfuscatedName("ci.l")
    public static int field1157;

    @ObfuscatedName("ci.dh")
    public static class252 field1161;

    @ObfuscatedName("z.n")
    public static int field117;

    @ObfuscatedName("cu.bb")
    public static class322[] field1187;

    @ObfuscatedName("ck.a")
    public static int[] field1190;

    @ObfuscatedName("ch.fa")
    public static int field1197;

    @ObfuscatedName("z.fn")
    public static class301 field120;

    @ObfuscatedName("z.at")
    public static boolean field121;

    @ObfuscatedName("cs.dv")
    public static class252 field1215;

    @ObfuscatedName("z.cb")
    public static class59 field122;

    @ObfuscatedName("cp.rc")
    public static class328 field1232;

    @ObfuscatedName("cp.f")
    public static String field1233;

    @ObfuscatedName("ce.rv")
    public static class69 field1240;

    @ObfuscatedName("ce.dx")
    public static class252 field1243;

    @ObfuscatedName("cz.ix")
    public static int field1260;

    @ObfuscatedName("cn.ps")
    public static class91 field1276;

    @ObfuscatedName("cn.r")
    public static int[] field1278;

    @ObfuscatedName("q.kb")
    public static int field129;

    @ObfuscatedName("cy.w")
    public static class97[] field1293;

    @ObfuscatedName("cy.ab")
    public static float[] field1295;

    @ObfuscatedName("cy.t")
    public static byte[] field1299;

    @ObfuscatedName("cy.l")
    public static int field1301;

    @ObfuscatedName("cy.b")
    public static int field1302;

    @ObfuscatedName("cy.d")
    public static class93[] field1303;

    @ObfuscatedName("cy.g")
    public static float[] field1304;

    @ObfuscatedName("cy.p")
    public static int field1305;

    @ObfuscatedName("cy.a")
    public static class104[] field1306;

    @ObfuscatedName("cy.z")
    public static class109[] field1307;

    @ObfuscatedName("cy.c")
    public static int field1308;

    @ObfuscatedName("cy.q")
    public static int[] field1309;

    @ObfuscatedName("cy.f")
    public static float[] field1315;

    @ObfuscatedName("cy.r")
    public static float[] field1316;

    @ObfuscatedName("cy.n")
    public static float[] field1317;

    @ObfuscatedName("cy.ao")
    public static float[] field1318;

    @ObfuscatedName("cy.ac")
    public static float[] field1319;

    @ObfuscatedName("cy.e")
    public static boolean[] field1321;

    @ObfuscatedName("cy.an")
    public static int[] field1322;

    @ObfuscatedName("cy.ay")
    public static int[] field1323;

    @ObfuscatedName("cm.d")
    public static boolean[] field1332;

    @ObfuscatedName("cm.b")
    public static int[] field1341;

    @ObfuscatedName("cm.c")
    public static int[] field1342;

    @ObfuscatedName("ct.b")
    public static class100 field1345;

    @ObfuscatedName("ct.pw")
    public static class322 field1356;

    @ObfuscatedName("ct.i")
    public static boolean field1365;

    @ObfuscatedName("cj.s")
    public static long field1379;

    @ObfuscatedName("cc.t")
    public static class322 field1385;

    @ObfuscatedName("do.p")
    public static float field1425;

    @ObfuscatedName("do.l")
    public static int field1428;

    @ObfuscatedName("j.gx")
    public static byte[][] field145;

    @ObfuscatedName("dp.di")
    public static class160 field1468;

    @ObfuscatedName("dv.kj")
    public static int field1489;

    @ObfuscatedName("dv.fx")
    public static class138 field1490;

    @ObfuscatedName("j.gu")
    public static class322 field150;

    @ObfuscatedName("dr.f")
    public static int[] field1500;

    @ObfuscatedName("dy.gs")
    public static int[][] field1505;

    @ObfuscatedName("dy.hi")
    public static int field1509;

    @ObfuscatedName("du.rn")
    public static class165 field1573;

    @ObfuscatedName("du.lk")
    public static class233 field1579;

    @ObfuscatedName("du.dq")
    public static class252 field1581;

    @ObfuscatedName("dh.z")
    public static int[] field1596;

    @ObfuscatedName("y.gd")
    public static class321[] field162;

    @ObfuscatedName("m.ga")
    public static class322[] field163;

    @ObfuscatedName("m.ay")
    public static int[] field165;

    @ObfuscatedName("m.et")
    public static int field166;

    @ObfuscatedName("da.bx")
    public static int field1690;

    @ObfuscatedName("da.bh")
    public static int field1691;

    @ObfuscatedName("da.bk")
    public static int field1692;

    @ObfuscatedName("db.p")
    public static int field1702;

    @ObfuscatedName("db.u")
    public static int field1703;

    @ObfuscatedName("db.i")
    public static int field1707;

    @ObfuscatedName("db.t")
    public static int field1711;

    @ObfuscatedName("df.hk")
    public static int field1714;

    @ObfuscatedName("dw.a")
    public static int field1719;

    @ObfuscatedName("m.ab")
    public static int[] field172;

    @ObfuscatedName("dw.w")
    public static int field1732;

    @ObfuscatedName("dw.e")
    public static int field1734;

    @ObfuscatedName("dw.q")
    public static int field1735;

    @ObfuscatedName("dw.j")
    public static int field1736;

    @ObfuscatedName("dw.m")
    public static int field1740;

    @ObfuscatedName("dw.f")
    public static class134 field1741;

    @ObfuscatedName("dw.z")
    public static int field1742;

    @ObfuscatedName("dw.y")
    public static int field1744;

    @ObfuscatedName("dq.ae")
    public static GarbageCollectorMXBean field1746;

    @ObfuscatedName("dq.qf")
    public static class98 field1755;

    @ObfuscatedName("dz.f")
    public static int field1764;

    @ObfuscatedName("dz.q")
    public static int field1780;

    @ObfuscatedName("dz.j")
    public static int field1781;

    @ObfuscatedName("dz.h")
    public static int field1784;

    @ObfuscatedName("dz.x")
    public static int field1785;

    @ObfuscatedName("dz.n")
    public static int field1788;

    @ObfuscatedName("dz.g")
    public static int field1789;

    @ObfuscatedName("dz.ac")
    public static int field1790;

    @ObfuscatedName("dz.ab")
    public static int field1791;

    @ObfuscatedName("dz.ao")
    public static int field1792;

    @ObfuscatedName("dz.an")
    public static int field1793;

    @ObfuscatedName("dz.y")
    public static int field1795;

    @ObfuscatedName("dz.r")
    public static int field1797;

    @ObfuscatedName("dz.m")
    public static int field1800;

    @ObfuscatedName("dz.bw")
    public static int field1803;

    @ObfuscatedName("dz.ba")
    public static boolean[][] field1816;

    @ObfuscatedName("dz.bk")
    public static int field1821;

    @ObfuscatedName("dz.bx")
    public static int field1822;

    @ObfuscatedName("dz.bh")
    public static int field1823;

    @ObfuscatedName("dz.bp")
    public static int field1825;

    @ObfuscatedName("dz.bf")
    public static int field1826;

    @ObfuscatedName("dl.eu")
    public static int field1827;

    @ObfuscatedName("ep.df")
    public static class252 field1836;

    @ObfuscatedName("h.ko")
    public static int field184;

    @ObfuscatedName("ez.c")
    public static int field1849;

    @ObfuscatedName("ex.ev")
    public static int field1851;

    @ObfuscatedName("eq.pg")
    public static boolean field1866;

    @ObfuscatedName("eq.qy")
    public static int field1868;

    @ObfuscatedName("ei.dk")
    public static class252 field1890;

    @ObfuscatedName("ef.k")
    public static File field1906;

    @ObfuscatedName("et.p")
    public static ScheduledExecutorService field1917;

    @ObfuscatedName("et.db")
    public static class252 field1918;

    @ObfuscatedName("ed.s")
    public static String field1920;

    @ObfuscatedName("ed.ro")
    public static int field1921;

    @ObfuscatedName("ed.b")
    public static class250 field1922;

    @ObfuscatedName("eu.p")
    public static short[][] field1923;

    @ObfuscatedName("eu.dr")
    public static class252 field1925;

    @ObfuscatedName("eu.bv")
    public static class321[] field1926;

    @ObfuscatedName("eu.jw")
    public static class114 field1928;

    @ObfuscatedName("ee.d")
    public static class321 field1933;

    @ObfuscatedName("ee.l")
    public static int[] field1936;

    @ObfuscatedName("eb.ss")
    public static class325 field1937;

    @ObfuscatedName("eb.eh")
    public static long field1938;

    @ObfuscatedName("x.fq")
    public static class160 field194;

    @ObfuscatedName("er.bb")
    public static int field1945;

    @ObfuscatedName("er.w")
    public static class233 field1947;

    @ObfuscatedName("x.au")
    public static class319 field195;

    @ObfuscatedName("em.j")
    public static String[] field1952;

    @ObfuscatedName("ea.qa")
    public static int field1955;

    @ObfuscatedName("x.sj")
    public static class254 field196;

    @ObfuscatedName("x.z")
    public static class112[] field197;

    @ObfuscatedName("ej.h")
    public static String field1981;

    @ObfuscatedName("eh.o")
    public static int field1982;

    @ObfuscatedName("eh.s")
    public static String field1983;

    @ObfuscatedName("eh.v")
    public static Applet field1984;

    @ObfuscatedName("fu.v")
    public static String field1998;

    @ObfuscatedName("fu.w")
    public static class301 field2000;

    @ObfuscatedName("fu.lr")
    public static int field2002;

    @ObfuscatedName("fu.fm")
    public static class301 field2004;

    @ObfuscatedName("fq.i")
    public static int field2006;

    @ObfuscatedName("ff.hd")
    public static int field2017;

    @ObfuscatedName("ff.s")
    public static File field2024;

    @ObfuscatedName("fl.c")
    public static class321 field2028;

    @ObfuscatedName("fl.t")
    public static int field2029;

    @ObfuscatedName("fx.be")
    public static int field2031;

    @ObfuscatedName("fx.bj")
    public static class321[] field2033;

    @ObfuscatedName("fx.fw")
    public static class299 field2036;

    @ObfuscatedName("fw.qi")
    public static int field2049;

    @ObfuscatedName("fm.b")
    public static class139 field2051;

    @ObfuscatedName("fs.qv")
    public static int field2068;

    @ObfuscatedName("fr.u")
    public static int field2085;

    @ObfuscatedName("n.d")
    public static int field223;

    @ObfuscatedName("fa.bw")
    public static class326 field2289;

    @ObfuscatedName("fa.c")
    public static class163 field2291;

    @ObfuscatedName("g.u")
    public static Thread field230;

    @ObfuscatedName("fv.qb")
    public static int field2303;

    @ObfuscatedName("ac.b")
    public static int field231;

    @ObfuscatedName("fb.p")
    public static int[] field2314;

    @ObfuscatedName("ac.rq")
    public static class2 field233;

    @ObfuscatedName("ft.dp")
    public static long field2336;

    @ObfuscatedName("fe.o")
    public static int field2342;

    @ObfuscatedName("gk.l")
    public static byte[][][] field2394;

    @ObfuscatedName("gk.es")
    public static int[] field2395;

    @ObfuscatedName("gg.v")
    public static long field2397;

    @ObfuscatedName("go.o")
    public static class250 field2404;

    @ObfuscatedName("go.ef")
    public static int field2407;

    @ObfuscatedName("gr.s")
    public static class258[] field2412;

    @ObfuscatedName("gr.al")
    public static int field2413;

    @ObfuscatedName("gz.m")
    public static class185 field2417;

    @ObfuscatedName("gu.w")
    public static boolean field2427;

    @ObfuscatedName("gu.r")
    public static int field2428;

    @ObfuscatedName("gi.lx")
    public static int field2433;

    @ObfuscatedName("hs.v")
    public static class250 field2497;

    @ObfuscatedName("hs.s")
    public static class250 field2498;

    @ObfuscatedName("hs.b")
    public static int field2501;

    @ObfuscatedName("hs.k")
    public static class221 field2502;

    @ObfuscatedName("hs.hx")
    public static int field2504;

    @ObfuscatedName("hz.a")
    public static class249 field2532;

    @ObfuscatedName("ao.qm")
    public static int field254;

    @ObfuscatedName("hj.ca")
    public static boolean field2577;

    @ObfuscatedName("hj.gi")
    public static class321[] field2584;

    @ObfuscatedName("hk.w")
    public static class92 field2592;

    @ObfuscatedName("ho.gh")
    public static int field2598;

    @ObfuscatedName("ho.i")
    public static class250 field2599;

    @ObfuscatedName("o.pa")
    public static class98 field26;

    @ObfuscatedName("hm.t")
    public static short[] field2613;

    @ObfuscatedName("hm.l")
    public static short[] field2614;

    @ObfuscatedName("hm.b")
    public static short[][] field2617;

    @ObfuscatedName("hq.gp")
    public static class322 field2622;

    @ObfuscatedName("hg.t")
    public static boolean[] field2629;

    @ObfuscatedName("an.gk")
    public static class128 field267;

    @ObfuscatedName("hg.i")
    public static class233[][] field2674;

    @ObfuscatedName("an.n")
    public static int[] field269;

    @ObfuscatedName("an.nq")
    public static class85 field270;

    @ObfuscatedName("hg.c")
    public static class250 field2710;

    @ObfuscatedName("hg.p")
    public static class250 field2723;

    @ObfuscatedName("ht.i")
    public static int field2776;

    @ObfuscatedName("k.q")
    public static class37 field28;

    @ObfuscatedName("il.ba")
    public static String field2809;

    @ObfuscatedName("ir.ri")
    public static short[] field2817;

    @ObfuscatedName("ir.l")
    public static int field2819;

    @ObfuscatedName("ar.dj")
    public static class252 field302;

    @ObfuscatedName("ar.je")
    public static class233 field306;

    @ObfuscatedName("ar.en")
    public static int field308;

    @ObfuscatedName("k.dm")
    public static class156 field31;

    @ObfuscatedName("ar.lg")
    public static class77 field310;

    @ObfuscatedName("am.ei")
    public static String field315;

    @ObfuscatedName("aj.gj")
    public static class322[] field317;

    @ObfuscatedName("ik.du")
    public static class252 field3177;

    @ObfuscatedName("iq.ay")
    public static FontMetrics field3179;

    @ObfuscatedName("ic.c")
    public static boolean field3187;

    @ObfuscatedName("aj.aw")
    public static String field319;

    @ObfuscatedName("u.gn")
    public static class322[] field32;

    @ObfuscatedName("aj.dc")
    public static class252 field321;

    @ObfuscatedName("ie.o")
    public static long field3225;

    @ObfuscatedName("ie.e")
    public static class185 field3236;

    @ObfuscatedName("ie.v")
    public static class160 field3238;

    @ObfuscatedName("ii.v")
    public static class250 field3256;

    @ObfuscatedName("ii.an")
    public static Font field3259;

    @ObfuscatedName("im.v")
    public static class250 field3262;

    @ObfuscatedName("iu.o")
    public static int field3264;

    @ObfuscatedName("iu.v")
    public static class250 field3282;

    @ObfuscatedName("it.x")
    public static int[] field3287;

    @ObfuscatedName("it.v")
    public static class250 field3288;

    @ObfuscatedName("if.v")
    public static class250 field3292;

    @ObfuscatedName("je.s")
    public static class250 field3294;

    @ObfuscatedName("je.v")
    public static class250 field3296;

    @ObfuscatedName("aq.li")
    public static class233 field330;

    @ObfuscatedName("jc.v")
    public static class250 field3312;

    @ObfuscatedName("jj.v")
    public static class250 field3319;

    @ObfuscatedName("jj.o")
    public static int field3320;

    @ObfuscatedName("jj.s")
    public static class250 field3322;

    @ObfuscatedName("aq.k")
    public static int field333;

    @ObfuscatedName("jy.v")
    public static class250 field3331;

    @ObfuscatedName("aq.cz")
    public static int field334;

    @ObfuscatedName("jy.bf")
    public static String field3345;

    @ObfuscatedName("jq.v")
    public static class250 field3348;

    @ObfuscatedName("jv.v")
    public static class250 field3354;

    @ObfuscatedName("jp.v")
    public static class250 field3364;

    @ObfuscatedName("jd.v")
    public static class250 field3371;

    @ObfuscatedName("jh.s")
    public static class250 field3381;

    @ObfuscatedName("jh.o")
    public static class250 field3383;

    @ObfuscatedName("jh.v")
    public static class250 field3396;

    @ObfuscatedName("js.s")
    public static class250 field3402;

    @ObfuscatedName("ak.jk")
    public static class62 field341;

    @ObfuscatedName("js.o")
    public static class250 field3449;

    @ObfuscatedName("jt.i")
    public static class250 field3455;

    @ObfuscatedName("jt.t")
    public static class250 field3456;

    @ObfuscatedName("ak.q")
    public static String[] field347;

    @ObfuscatedName("ak.ja")
    public static int field348;

    @ObfuscatedName("ju.v")
    public static class250 field3520;

    @ObfuscatedName("ju.s")
    public static class250 field3536;

    @ObfuscatedName("jm.v")
    public static class250 field3559;

    @ObfuscatedName("jb.s")
    public static class250 field3562;

    @ObfuscatedName("jb.o")
    public static class250 field3563;

    @ObfuscatedName("jb.v")
    public static class250 field3565;

    @ObfuscatedName("jb.dl")
    public static class252 field3580;

    @ObfuscatedName("ja.ba")
    public static class247 field3584;

    @ObfuscatedName("jn.iz")
    public static int field3585;

    @ObfuscatedName("aw.mv")
    public static int field359;

    @ObfuscatedName("ji.dn")
    public static class252 field3631;

    @ObfuscatedName("jx.p")
    public static boolean field3647;

    @ObfuscatedName("kx.am")
    public static Image field3661;

    @ObfuscatedName("ky.rf")
    public static long field3672;

    @ObfuscatedName("ki.fc")
    public static int[] field3699;

    @ObfuscatedName("ki.ge")
    public static class322[] field3706;

    @ObfuscatedName("ki.gy")
    public static class321[] field3708;

    @ObfuscatedName("ki.y")
    public static int field3710;

    @ObfuscatedName("ke.d")
    public static int[] field3711;

    @ObfuscatedName("km.gr")
    public static int field3718;

    @ObfuscatedName("kt.b")
    public static class321[] field3724;

    @ObfuscatedName("kc.u")
    public static int[] field3744;

    @ObfuscatedName("kc.s")
    public static class250 field3745;

    @ObfuscatedName("kc.v")
    public static class177 field3746;

    @ObfuscatedName("kj.b")
    public static class321 field3753;

    @ObfuscatedName("ks.l")
    public static int field3776;

    @ObfuscatedName("lb.u")
    public static class321[] field3785;

    @ObfuscatedName("lv.l")
    public static class321[] field3786;

    @ObfuscatedName("ln.b")
    public static int field3795;

    @ObfuscatedName("ll.an")
    public static int field3798;

    @ObfuscatedName("ll.ao")
    public static int field3799;

    @ObfuscatedName("au.qs")
    public static int field380;

    @ObfuscatedName("ll.ab")
    public static int[] field3802;

    @ObfuscatedName("au.a")
    public static class233 field381;

    @ObfuscatedName("lq.v")
    public static int field3835;

    @ObfuscatedName("lq.s")
    public static int field3836;

    @ObfuscatedName("lq.i")
    public static int[] field3838;

    @ObfuscatedName("lq.t")
    public static int[] field3839;

    @ObfuscatedName("lq.l")
    public static byte[][] field3840;

    @ObfuscatedName("lq.k")
    public static int[] field3841;

    @ObfuscatedName("au.gb")
    public static class322[] field385;

    @ObfuscatedName("ah.az")
    public static client field391;

    @ObfuscatedName("as.qc")
    public static class105 field397;

    @ObfuscatedName("as.w")
    public static class101 field399;

    @ObfuscatedName("ap.t")
    public static int field419;

    @ObfuscatedName("ap.v")
    public static class157 field425;

    @ObfuscatedName("ap.z")
    public static int field428;

    @ObfuscatedName("i.hu")
    public static int field43;

    @ObfuscatedName("t.gv")
    public static byte[][] field46;

    @ObfuscatedName("ai.ao")
    public static int[] field469;

    @ObfuscatedName("aa.mz")
    public static int field471;

    @ObfuscatedName("aa.eg")
    public static class156 field472;

    @ObfuscatedName("aa.qr")
    public static int field474;

    @ObfuscatedName("az.z")
    public static int[][][] field476;

    @ObfuscatedName("az.k")
    public static byte[][][] field477;

    @ObfuscatedName("az.i")
    public static byte[][][] field481;

    @ObfuscatedName("az.p")
    public static byte[][][] field483;

    @ObfuscatedName("az.l")
    public static int[][] field484;

    @ObfuscatedName("az.c")
    public static int[] field486;

    @ObfuscatedName("t.mm")
    public static class233[] field49;

    @ObfuscatedName("az.u")
    public static byte[][][] field492;

    @ObfuscatedName("az.b")
    public static int[] field493;

    @ObfuscatedName("az.t")
    public static byte[][][] field496;

    @ObfuscatedName("v.p")
    public static class321 field5;

    @ObfuscatedName("al.by")
    public static class321[] field504;

    @ObfuscatedName("al.gm")
    public static class322[] field505;

    @ObfuscatedName("l.nv")
    public static class159 field53;

    @ObfuscatedName("bg.ka")
    public static int field532;

    @ObfuscatedName("ba.x")
    public static String field538;

    @ObfuscatedName("bw.bg")
    public static int field547;

    @ObfuscatedName("bw.dz")
    public static class252 field555;

    @ObfuscatedName("bw.su")
    public static int field558;

    @ObfuscatedName("bx.bi")
    public static class246 field559;

    @ObfuscatedName("bh.an")
    public static int[] field577;

    @ObfuscatedName("bk.rs")
    public static class68 field580;

    @ObfuscatedName("bk.bn")
    public static class321 field581;

    @ObfuscatedName("s.fk")
    public static int field6;

    @ObfuscatedName("l.q")
    public static int field60;

    @ObfuscatedName("bp.eb")
    public static SecureRandom field612;

    @ObfuscatedName("bf.fv")
    public static int field615;

    @ObfuscatedName("bf.md")
    public static int field616;

    @ObfuscatedName("bf.u")
    public static File field617;

    @ObfuscatedName("l.hj")
    public static int field63;

    @ObfuscatedName("b.pd")
    public static class296 field65;

    @ObfuscatedName("b.u")
    public static int field66;

    @ObfuscatedName("b.s")
    public static int field67;

    @ObfuscatedName("c.hn")
    public static int field71;

    @ObfuscatedName("c.fo")
    public static int field72;

    @ObfuscatedName("client.ft")
    public static int[] field742;

    @ObfuscatedName("d.ed")
    public static int field80;

    @ObfuscatedName("d.hc")
    public static int field81;

    @ObfuscatedName("client.bp")
    public static String field843;

    @ObfuscatedName("w.p")
    public static int field91;

    @ObfuscatedName("bj.da")
    public static class252 field968;

    @ObfuscatedName("bj.jg")
    public static class233 field969;

    @ObfuscatedName("by.n")
    public static int[] field977;

    @ObfuscatedName("bv.u")
    public static class67[] field982;

    @ObfuscatedName("bv.qu")
    public static int field994;

    @ObfuscatedName("ig.v(Ljava/lang/CharSequence;I)J")
    public static long method4259(CharSequence arg0) {
        long var1 = 0L;
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            var1 *= 37L;
            char var5 = arg0.charAt(var4);
            if (var5 >= 'A' && var5 <= 'Z') {
                var1 += (long) (var5 + 1 - 65);
            } else if (var5 >= 'a' && var5 <= 'z') {
                var1 += (long) (var5 + 1 - 97);
            } else if (var5 >= '0' && var5 <= '9') {
                var1 += (long) (var5 + 27 - 48);
            }
            if (var1 >= 177917621779460413L) {
                break;
            }
        }
        while (var1 % 37L == 0L && var1 != 0L) {
            var1 /= 37L;
        }
        return var1;
    }

    @ObfuscatedName("bm.v(I)[Lid;")
    public static class246[] method1671() {
        return new class246[] { class246.field3164, class246.field3167, class246.field3166, class246.field3163 };
    }

    @ObfuscatedName("b.v(II)Z")
    public static boolean method116(int arg0) {
        return arg0 == 10 || arg0 == 11 || arg0 == 12 || arg0 == 13 || arg0 == 14 || arg0 == 15 || arg0 == 16 || arg0 == 17;
    }

    @ObfuscatedName("cs.v(II)Ljd;")
    public static class269 method1790(int arg0) {
        class269 var1 = (class269) class269.field3365.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3371.method4270(8, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4655(new class185(var2));
        }
        class269.field3365.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fh.v(II)Ljj;")
    public static class263 method3039(int arg0) {
        class263 var1 = (class263) class263.field3329.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3319.method4270(3, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4557(new class185(var2));
        }
        class263.field3329.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("dt.v(Lis;Lis;Lis;B)V")
    public static void method2130(class250 arg0, class250 arg1, class250 arg2) {
        field3396 = arg0;
        field3381 = arg1;
        field3383 = arg2;
    }

    @ObfuscatedName("bz.s([BI)Lce;")
    public static class87 method1674(byte[] arg0) {
        class87 var1 = new class87();
        class185 var2 = new class185(arg0);
        var2.field2386 = var2.field2387.length - 2;
        int var3 = var2.method3276();
        int var4 = var2.field2387.length - 2 - var3 - 12;
        var2.field2386 = var4;
        int var5 = var2.method3279();
        var1.field1238 = var2.method3276();
        var1.field1234 = var2.method3276();
        var1.field1244 = var2.method3276();
        var1.field1241 = var2.method3276();
        int var6 = var2.method3274();
        if (var6 > 0) {
            var1.field1242 = var1.method1847(var6);
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = var2.method3276();
                class200 var9 = new class200(var8 > 0 ? class190.method5134(var8) : 1);
                var1.field1242[var7] = var9;
                while (var8-- > 0) {
                    int var10 = var2.method3279();
                    int var11 = var2.method3279();
                    var9.method3660(new class214(var11), (long) var10);
                }
            }
        }
        var2.field2386 = 0;
        var2.method3282();
        var1.field1235 = new int[var5];
        var1.field1236 = new int[var5];
        var1.field1237 = new String[var5];
        int var12 = 0;
        while (var2.field2386 < var4) {
            int var13 = var2.method3276();
            if (var13 == 3) {
                var1.field1237[var12] = var2.method3490();
            } else if (var13 >= 100 || var13 == 21 || var13 == 38 || var13 == 39) {
                var1.field1236[var12] = var2.method3274();
            } else {
                var1.field1236[var12] = var2.method3279();
            }
            var1.field1235[var12++] = var13;
        }
        return var1;
    }

    @ObfuscatedName("be.v(IS)Ljt;")
    public static class272 method945(int arg0) {
        class272 var1 = (class272) class272.field3501.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3455.method4270(10, arg0);
        class272 var3 = new class272();
        var3.field3460 = arg0;
        if (var2 != null) {
            var3.method4753(new class185(var2));
        }
        var3.method4752();
        if (var3.field3457 != -1) {
            var3.method4769(method945(var3.field3457), method945(var3.field3493));
        }
        if (var3.field3482 != -1) {
            var3.method4786(method945(var3.field3482), method945(var3.field3477));
        }
        if (var3.field3494 != -1) {
            var3.method4747(method945(var3.field3494), method945(var3.field3505));
        }
        if (!field3647 && var3.field3490) {
            var3.field3462 = class240.field2974;
            var3.field3461 = false;
            var3.field3476 = null;
            var3.field3478 = null;
            var3.field3471 = -1;
            var3.field3500 = 0;
            if (var3.field3502 != null) {
                boolean var4 = false;
                for (class207 var5 = var3.field3502.method3662(); var5 != null; var5 = var3.field3502.method3658()) {
                    class267 var6 = class267.method3597((int) var5.field2464);
                    if (var6.field3359) {
                        var5.method3787();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field3502 = null;
                }
            }
        }
        class272.field3501.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hs.c(CI)Z")
    public static boolean method3887(char arg0) {
        return arg0 >= '0' && arg0 <= '9';
    }

    @ObfuscatedName("f.u(IIIII)V")
    public static void method306(int arg0, int arg1, int arg2, int arg3) {
        for (class70 var4 = (class70) class70.field1018.method3792(); var4 != null; var4 = (class70) class70.field1018.method3800()) {
            if (var4.field1023 != -1 || var4.field1027 != null) {
                int var5 = 0;
                if (arg1 > var4.field1028) {
                    var5 += arg1 - var4.field1028;
                } else if (arg1 < var4.field1029) {
                    var5 += var4.field1029 - arg1;
                }
                if (arg2 > var4.field1030) {
                    var5 += arg2 - var4.field1030;
                } else if (arg2 < var4.field1019) {
                    var5 += var4.field1019 - arg2;
                }
                if (var5 - 64 > var4.field1031 || client.field854 == 0 || var4.field1016 != arg0) {
                    if (var4.field1024 != null) {
                        field1276.method1944(var4.field1024);
                        var4.field1024 = null;
                    }
                    if (var4.field1021 != null) {
                        field1276.method1944(var4.field1021);
                        var4.field1021 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field854 * (var4.field1031 - var5) / var4.field1031;
                    if (var4.field1024 != null) {
                        var4.field1024.method2142(var6);
                    } else if (var4.field1023 >= 0) {
                        class94 var7 = class94.method1960(field302, var4.field1023, 0);
                        if (var7 != null) {
                            class96 var8 = var7.method1961().method2011(field397);
                            class106 var9 = class106.method2138(var8, 100, var6);
                            var9.method2268(-1);
                            field1276.method1894(var9);
                            var4.field1024 = var9;
                        }
                    }
                    if (var4.field1021 != null) {
                        var4.field1021.method2142(var6);
                        if (!var4.field1021.method3788()) {
                            var4.field1021 = null;
                        }
                    } else if (var4.field1027 != null && (var4.field1022 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1027.length);
                        class94 var11 = class94.method1960(field302, var4.field1027[var10], 0);
                        if (var11 != null) {
                            class96 var12 = var11.method1961().method2011(field397);
                            class106 var13 = class106.method2138(var12, 100, var6);
                            var13.method2268(0);
                            field1276.method1894(var13);
                            var4.field1021 = var13;
                            var4.field1022 = var4.field1025 + (int) (Math.random() * (double) (var4.field1026 - var4.field1025));
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("in.c(Lis;Lis;Ljava/lang/String;Ljava/lang/String;I)Lkw;")
    public static class301 method4254(class250 arg0, class250 arg1, String arg2, String arg3) {
        int var4 = arg0.method4288(arg2);
        int var5 = arg0.method4289(var4, arg3);
        class301 var6;
        if (class323.method3193(arg0, var4, var5)) {
            byte[] var7 = arg1.method4270(var4, var5);
            class301 var8;
            if (var7 == null) {
                var8 = null;
            } else {
                class301 var9 = new class301(var7, field3841, field3744, field3838, field3839, field1110, field3840);
                class323.method4362();
                var8 = var9;
            }
            var6 = var8;
        } else {
            var6 = null;
        }
        return var6;
    }

    @ObfuscatedName("ah.w(IIB)I")
    public static final int method664(int arg0, int arg1) {
        int var2 = class51.method75(arg0 - 1, arg1 - 1) + class51.method75(arg0 + 1, arg1 - 1) + class51.method75(arg0 - 1, arg1 + 1) + class51.method75(arg0 + 1, arg1 + 1);
        int var3 = class51.method75(arg0 - 1, arg1) + class51.method75(arg0 + 1, arg1) + class51.method75(arg0, arg1 - 1) + class51.method75(arg0, arg1 + 1);
        int var4 = class51.method75(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("r.y(IIIIIIILdz;Lfn;I)V")
    public static final void method387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class128 arg7, class167 arg8) {
        class271 var9 = class271.method4255(arg4);
        int var10;
        int var11;
        if (arg5 == 1 || arg5 == 3) {
            var10 = var9.field3418;
            var11 = var9.field3417;
        } else {
            var10 = var9.field3417;
            var11 = var9.field3418;
        }
        int var12;
        int var13;
        if (arg2 + var10 <= 104) {
            var12 = (var10 >> 1) + arg2;
            var13 = (var10 + 1 >> 1) + arg2;
        } else {
            var12 = arg2;
            var13 = arg2 + 1;
        }
        int var14;
        int var15;
        if (arg3 + var11 <= 104) {
            var14 = (var11 >> 1) + arg3;
            var15 = (var11 + 1 >> 1) + arg3;
        } else {
            var14 = arg3;
            var15 = arg3 + 1;
        }
        int[][] var16 = class51.field487[arg1];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg2 << 7) + (var10 << 6);
        int var19 = (arg3 << 7) + (var11 << 6);
        long var20 = class123.method3900(arg2, arg3, 2, var9.field3421 == 0, arg4);
        int var22 = (arg5 << 6) + arg6;
        if (var9.field3401 == 1) {
            var22 += 256;
        }
        if (arg6 == 22) {
            class130 var23;
            if (var9.field3440 == -1 && var9.field3412 == null) {
                var23 = var9.method4701(22, arg5, var16, var18, var17, var19);
            } else {
                var23 = new class88(arg4, 22, arg5, arg1, arg2, arg3, var9.field3440, true, (class130) null);
            }
            arg7.method2803(arg0, arg2, arg3, var17, var23, var20, var22);
            if (var9.field3403 == 1) {
                arg8.method3146(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class130 var49;
            if (var9.field3440 == -1 && var9.field3412 == null) {
                var49 = var9.method4701(10, arg5, var16, var18, var17, var19);
            } else {
                var49 = new class88(arg4, 10, arg5, arg1, arg2, arg3, var9.field3440, true, (class130) null);
            }
            if (var49 != null) {
                arg7.method2666(arg0, arg2, arg3, var17, var10, var11, var49, arg6 == 11 ? 256 : 0, var20, var22);
            }
            if (var9.field3403 != 0) {
                arg8.method3108(arg2, arg3, var10, var11, var9.field3428);
            }
        } else if (arg6 >= 12) {
            class130 var24;
            if (var9.field3440 == -1 && var9.field3412 == null) {
                var24 = var9.method4701(arg6, arg5, var16, var18, var17, var19);
            } else {
                var24 = new class88(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3440, true, (class130) null);
            }
            arg7.method2666(arg0, arg2, arg3, var17, 1, 1, var24, 0, var20, var22);
            if (var9.field3403 != 0) {
                arg8.method3108(arg2, arg3, var10, var11, var9.field3428);
            }
        } else if (arg6 == 0) {
            class130 var25;
            if (var9.field3440 == -1 && var9.field3412 == null) {
                var25 = var9.method4701(0, arg5, var16, var18, var17, var19);
            } else {
                var25 = new class88(arg4, 0, arg5, arg1, arg2, arg3, var9.field3440, true, (class130) null);
            }
            arg7.method2689(arg0, arg2, arg3, var17, var25, (class130) null, class51.field489[arg5], 0, var20, var22);
            if (var9.field3403 != 0) {
                arg8.method3110(arg2, arg3, arg6, arg5, var9.field3428);
            }
        } else if (arg6 == 1) {
            class130 var26;
            if (var9.field3440 == -1 && var9.field3412 == null) {
                var26 = var9.method4701(1, arg5, var16, var18, var17, var19);
            } else {
                var26 = new class88(arg4, 1, arg5, arg1, arg2, arg3, var9.field3440, true, (class130) null);
            }
            arg7.method2689(arg0, arg2, arg3, var17, var26, (class130) null, class51.field490[arg5], 0, var20, var22);
            if (var9.field3403 != 0) {
                arg8.method3110(arg2, arg3, arg6, arg5, var9.field3428);
            }
        } else if (arg6 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class130 var28;
            class130 var29;
            if (var9.field3440 == -1 && var9.field3412 == null) {
                var28 = var9.method4701(2, arg5 + 4, var16, var18, var17, var19);
                var29 = var9.method4701(2, var27, var16, var18, var17, var19);
            } else {
                var28 = new class88(arg4, 2, arg5 + 4, arg1, arg2, arg3, var9.field3440, true, (class130) null);
                var29 = new class88(arg4, 2, var27, arg1, arg2, arg3, var9.field3440, true, (class130) null);
            }
            arg7.method2689(arg0, arg2, arg3, var17, var28, var29, class51.field489[arg5], class51.field489[var27], var20, var22);
            if (var9.field3403 != 0) {
                arg8.method3110(arg2, arg3, arg6, arg5, var9.field3428);
            }
        } else if (arg6 == 3) {
            class130 var30;
            if (var9.field3440 == -1 && var9.field3412 == null) {
                var30 = var9.method4701(3, arg5, var16, var18, var17, var19);
            } else {
                var30 = new class88(arg4, 3, arg5, arg1, arg2, arg3, var9.field3440, true, (class130) null);
            }
            arg7.method2689(arg0, arg2, arg3, var17, var30, (class130) null, class51.field490[arg5], 0, var20, var22);
            if (var9.field3403 != 0) {
                arg8.method3110(arg2, arg3, arg6, arg5, var9.field3428);
            }
        } else if (arg6 == 9) {
            class130 var31;
            if (var9.field3440 == -1 && var9.field3412 == null) {
                var31 = var9.method4701(arg6, arg5, var16, var18, var17, var19);
            } else {
                var31 = new class88(arg4, arg6, arg5, arg1, arg2, arg3, var9.field3440, true, (class130) null);
            }
            arg7.method2666(arg0, arg2, arg3, var17, 1, 1, var31, 0, var20, var22);
            if (var9.field3403 != 0) {
                arg8.method3108(arg2, arg3, var10, var11, var9.field3428);
            }
        } else if (arg6 == 4) {
            class130 var32;
            if (var9.field3440 == -1 && var9.field3412 == null) {
                var32 = var9.method4701(4, arg5, var16, var18, var17, var19);
            } else {
                var32 = new class88(arg4, 4, arg5, arg1, arg2, arg3, var9.field3440, true, (class130) null);
            }
            arg7.method2665(arg0, arg2, arg3, var17, var32, (class130) null, class51.field489[arg5], 0, 0, 0, var20, var22);
        } else if (arg6 == 5) {
            int var33 = 16;
            long var34 = arg7.method2682(arg0, arg2, arg3);
            if (var34 != 0L) {
                var33 = class271.method4255(class123.method936(var34)).field3443;
            }
            class130 var36;
            if (var9.field3440 == -1 && var9.field3412 == null) {
                var36 = var9.method4701(4, arg5, var16, var18, var17, var19);
            } else {
                var36 = new class88(arg4, 4, arg5, arg1, arg2, arg3, var9.field3440, true, (class130) null);
            }
            arg7.method2665(arg0, arg2, arg3, var17, var36, (class130) null, class51.field489[arg5], 0, class51.field491[arg5] * var33, class51.field479[arg5] * var33, var20, var22);
        } else if (arg6 == 6) {
            int var37 = 8;
            long var38 = arg7.method2682(arg0, arg2, arg3);
            if (var38 != 0L) {
                var37 = class271.method4255(class123.method936(var38)).field3443 / 2;
            }
            class130 var40;
            if (var9.field3440 == -1 && var9.field3412 == null) {
                var40 = var9.method4701(4, arg5 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class88(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3440, true, (class130) null);
            }
            arg7.method2665(arg0, arg2, arg3, var17, var40, (class130) null, 256, arg5, class51.field480[arg5] * var37, class51.field494[arg5] * var37, var20, var22);
        } else if (arg6 == 7) {
            int var41 = arg5 + 2 & 0x3;
            class130 var42;
            if (var9.field3440 == -1 && var9.field3412 == null) {
                var42 = var9.method4701(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class88(arg4, 4, var41 + 4, arg1, arg2, arg3, var9.field3440, true, (class130) null);
            }
            arg7.method2665(arg0, arg2, arg3, var17, var42, (class130) null, 256, var41, 0, 0, var20, var22);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = arg7.method2682(arg0, arg2, arg3);
            if (var44 != 0L) {
                var43 = class271.method4255(class123.method936(var44)).field3443 / 2;
            }
            int var46 = arg5 + 2 & 0x3;
            class130 var47;
            class130 var48;
            if (var9.field3440 == -1 && var9.field3412 == null) {
                var47 = var9.method4701(4, arg5 + 4, var16, var18, var17, var19);
                var48 = var9.method4701(4, var46 + 4, var16, var18, var17, var19);
            } else {
                var47 = new class88(arg4, 4, arg5 + 4, arg1, arg2, arg3, var9.field3440, true, (class130) null);
                var48 = new class88(arg4, 4, var46 + 4, arg1, arg2, arg3, var9.field3440, true, (class130) null);
            }
            arg7.method2665(arg0, arg2, arg3, var17, var47, var48, 256, arg5, class51.field480[arg5] * var43, class51.field494[arg5] * var43, var20, var22);
        }
    }

    @ObfuscatedName("ba.u(ILce;ZI)I")
    public static int method975(int arg0, class87 arg1, boolean arg2) {
        int var3 = -1;
        class233 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class71.field1040[--field1049];
            var4 = class233.method2957(var3);
        } else {
            var4 = arg2 ? field381 : field1947;
        }
        if (arg0 == 1100) {
            field1049 -= 2;
            var4.field2659 = class71.field1040[field1049];
            if (var4.field2659 > var4.field2661 - var4.field2653) {
                var4.field2659 = var4.field2661 - var4.field2653;
            }
            if (var4.field2659 < 0) {
                var4.field2659 = 0;
            }
            var4.field2692 = class71.field1040[field1049 + 1];
            if (var4.field2692 > var4.field2662 - var4.field2654) {
                var4.field2692 = var4.field2662 - var4.field2654;
            }
            if (var4.field2692 < 0) {
                var4.field2692 = 0;
            }
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2635 = class71.field1040[--field1049];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2667 = class71.field1040[--field1049] == 1;
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2669 = class71.field1040[--field1049];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2679 = class71.field1040[--field1049];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2673 = class71.field1040[--field1049];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2640 = class71.field1040[--field1049];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2734 = class71.field1040[--field1049] == 1;
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2681 = 1;
            var4.field2682 = class71.field1040[--field1049];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1109) {
            field1049 -= 6;
            var4.field2642 = class71.field1040[field1049];
            var4.field2627 = class71.field1040[field1049 + 1];
            var4.field2689 = class71.field1040[field1049 + 2];
            var4.field2742 = class71.field1040[field1049 + 3];
            var4.field2691 = class71.field1040[field1049 + 4];
            var4.field2655 = class71.field1040[field1049 + 5];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = class71.field1040[--field1049];
            if (var4.field2644 != var5) {
                var4.field2644 = var5;
                var4.field2761 = 0;
                var4.field2762 = 0;
                client.method3069(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2695 = class71.field1040[--field1049] == 1;
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = class71.field1053[--field3795];
            if (!var6.equals(var4.field2660)) {
                var4.field2660 = var6;
                client.method3069(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2700 = class71.field1040[--field1049];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1114) {
            field1049 -= 3;
            var4.field2725 = class71.field1040[field1049];
            var4.field2703 = class71.field1040[field1049 + 1];
            var4.field2701 = class71.field1040[field1049 + 2];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2704 = class71.field1040[--field1049] == 1;
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2677 = class71.field1040[--field1049];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2702 = class71.field1040[--field1049];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2744 = class71.field1040[--field1049] == 1;
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2720 = class71.field1040[--field1049] == 1;
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1120) {
            field1049 -= 2;
            var4.field2661 = class71.field1040[field1049];
            var4.field2662 = class71.field1040[field1049 + 1];
            client.method3069(var4);
            if (var3 != -1 && var4.field2680 == 0) {
                client.method1514(field2674[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2638;
            int var8 = var4.field2639;
            class175 var9 = class175.method107(class172.field2276, client.field830.field1266);
            var9.field2311.method3261(var7);
            var9.field2311.method3259(var8);
            client.field830.method1875(var9);
            client.field709 = var4;
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2756 = class71.field1040[--field1049];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2664 = class71.field1040[--field1049];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2641 = class71.field1040[--field1049];
            client.method3069(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var10 = class71.field1040[--field1049];
            class320 var11 = (class320) class180.method34(class320.method132(), var10);
            if (var11 != null) {
                var4.field2668 = var11;
                client.method3069(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var12 = class71.field1040[--field1049] == 1;
            var4.field2672 = var12;
            return 1;
        } else if (arg0 == 1127) {
            boolean var13 = class71.field1040[--field1049] == 1;
            var4.field2696 = var13;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("y.y(ILce;ZI)I")
    public static int method219(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class233 var3 = class233.method2957(class71.field1040[--field1049]);
            class71.field1040[++field1049 - 1] = var3.field2759;
            return 1;
        } else if (arg0 == 2701) {
            class233 var4 = class233.method2957(class71.field1040[--field1049]);
            if (var4.field2759 == -1) {
                class71.field1040[++field1049 - 1] = 0;
            } else {
                class71.field1040[++field1049 - 1] = var4.field2670;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = class71.field1040[--field1049];
            class57 var6 = (class57) client.field780.method3735((long) var5);
            if (var6 == null) {
                class71.field1040[++field1049 - 1] = 0;
            } else {
                class71.field1040[++field1049 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            class71.field1040[++field1049 - 1] = client.field672;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("j.m(ILce;ZI)I")
    public static int method211(int arg0, class87 arg1, boolean arg2) {
        if (arg0 == 3300) {
            class71.field1040[++field1049 - 1] = client.field631;
            return 1;
        } else if (arg0 == 3301) {
            field1049 -= 2;
            int var3 = class71.field1040[field1049];
            int var4 = class71.field1040[field1049 + 1];
            int[] var5 = class71.field1040;
            int var6 = ++field1049 - 1;
            class55 var7 = (class55) class55.field518.method3735((long) var3);
            int var8;
            if (var7 == null) {
                var8 = -1;
            } else if (var4 >= 0 && var4 < var7.field517.length) {
                var8 = var7.field517[var4];
            } else {
                var8 = -1;
            }
            var5[var6] = var8;
            return 1;
        } else if (arg0 == 3302) {
            field1049 -= 2;
            int var9 = class71.field1040[field1049];
            int var10 = class71.field1040[field1049 + 1];
            class71.field1040[++field1049 - 1] = class55.method496(var9, var10);
            return 1;
        } else if (arg0 == 3303) {
            field1049 -= 2;
            int var11 = class71.field1040[field1049];
            int var12 = class71.field1040[field1049 + 1];
            int[] var13 = class71.field1040;
            int var14 = ++field1049 - 1;
            class55 var15 = (class55) class55.field518.method3735((long) var11);
            int var16;
            if (var15 == null) {
                var16 = 0;
            } else if (var12 == -1) {
                var16 = 0;
            } else {
                int var17 = 0;
                for (int var18 = 0; var18 < var15.field521.length; var18++) {
                    if (var15.field517[var18] == var12) {
                        var17 += var15.field521[var18];
                    }
                }
                var16 = var17;
            }
            var13[var14] = var16;
            return 1;
        } else if (arg0 == 3304) {
            int var19 = class71.field1040[--field1049];
            class71.field1040[++field1049 - 1] = class256.method972(var19).field3258;
            return 1;
        } else if (arg0 == 3305) {
            int var20 = class71.field1040[--field1049];
            class71.field1040[++field1049 - 1] = client.field751[var20];
            return 1;
        } else if (arg0 == 3306) {
            int var21 = class71.field1040[--field1049];
            class71.field1040[++field1049 - 1] = client.field752[var21];
            return 1;
        } else if (arg0 == 3307) {
            int var22 = class71.field1040[--field1049];
            class71.field1040[++field1049 - 1] = client.field768[var22];
            return 1;
        } else if (arg0 == 3308) {
            int var23 = field348;
            int var24 = (field341.field933 >> 7) + field6;
            int var25 = (field341.field964 >> 7) + field72;
            class71.field1040[++field1049 - 1] = (var23 << 28) + (var24 << 14) + var25;
            return 1;
        } else if (arg0 == 3309) {
            int var26 = class71.field1040[--field1049];
            class71.field1040[++field1049 - 1] = var26 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var27 = class71.field1040[--field1049];
            class71.field1040[++field1049 - 1] = var27 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var28 = class71.field1040[--field1049];
            class71.field1040[++field1049 - 1] = var28 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            class71.field1040[++field1049 - 1] = client.field818 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            field1049 -= 2;
            int var29 = class71.field1040[field1049] + 32768;
            int var30 = class71.field1040[field1049 + 1];
            int[] var31 = class71.field1040;
            int var32 = ++field1049 - 1;
            class55 var33 = (class55) class55.field518.method3735((long) var29);
            int var34;
            if (var33 == null) {
                var34 = -1;
            } else if (var30 >= 0 && var30 < var33.field517.length) {
                var34 = var33.field517[var30];
            } else {
                var34 = -1;
            }
            var31[var32] = var34;
            return 1;
        } else if (arg0 == 3314) {
            field1049 -= 2;
            int var35 = class71.field1040[field1049] + 32768;
            int var36 = class71.field1040[field1049 + 1];
            class71.field1040[++field1049 - 1] = class55.method496(var35, var36);
            return 1;
        } else if (arg0 == 3315) {
            field1049 -= 2;
            int var37 = class71.field1040[field1049] + 32768;
            int var38 = class71.field1040[field1049 + 1];
            int[] var39 = class71.field1040;
            int var40 = ++field1049 - 1;
            class55 var41 = (class55) class55.field518.method3735((long) var37);
            int var42;
            if (var41 == null) {
                var42 = 0;
            } else if (var38 == -1) {
                var42 = 0;
            } else {
                int var43 = 0;
                for (int var44 = 0; var44 < var41.field521.length; var44++) {
                    if (var41.field517[var44] == var38) {
                        var43 += var41.field521[var44];
                    }
                }
                var42 = var43;
            }
            var39[var40] = var42;
            return 1;
        } else if (arg0 == 3316) {
            if (client.field686 >= 2) {
                class71.field1040[++field1049 - 1] = client.field686;
            } else {
                class71.field1040[++field1049 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            class71.field1040[++field1049 - 1] = client.field638;
            return 1;
        } else if (arg0 == 3318) {
            class71.field1040[++field1049 - 1] = client.field711;
            return 1;
        } else if (arg0 == 3321) {
            class71.field1040[++field1049 - 1] = client.field784;
            return 1;
        } else if (arg0 == 3322) {
            class71.field1040[++field1049 - 1] = client.field810;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field788) {
                class71.field1040[++field1049 - 1] = 1;
            } else {
                class71.field1040[++field1049 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            class71.field1040[++field1049 - 1] = client.field782;
            return 1;
        } else if (arg0 == 3325) {
            field1049 -= 4;
            int var45 = class71.field1040[field1049];
            int var46 = class71.field1040[field1049 + 1];
            int var47 = class71.field1040[field1049 + 2];
            int var48 = class71.field1040[field1049 + 3];
            int var49 = (var46 << 14) + var45;
            int var50 = (var47 << 28) + var49;
            int var51 = var48 + var50;
            class71.field1040[++field1049 - 1] = var51;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ec.gz(Lbj;II)V")
    public static final void method2968(class65 arg0, int arg1) {
        client.method1796(arg0.field933, arg0.field964, arg1);
    }

    @ObfuscatedName("f.ge(IIIIII)V")
    public static final void method304(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = field267.method2682(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = field267.method2686(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class123.method2997(var5)) {
                var10 = arg4;
            }
            int[] var11 = field1356.field3826;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class123.method936(var5);
            class271 var14 = class271.method4255(var13);
            if (var14.field3431 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
            } else {
                class321 var15 = field2584[var14.field3431];
                if (var15 != null) {
                    int var16 = (var14.field3417 * 4 - var15.field3817) / 2;
                    int var17 = (var14.field3418 * 4 - var15.field3819) / 2;
                    var15.method5472(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3418) * 4 + 48 + var17);
                }
            }
        }
        long var18 = field267.method2684(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = field267.method2686(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class123.method936(var18);
            class271 var24 = class271.method4255(var23);
            if (var24.field3431 != -1) {
                class321 var25 = field2584[var24.field3431];
                if (var25 != null) {
                    int var26 = (var24.field3417 * 4 - var25.field3817) / 2;
                    int var27 = (var24.field3418 * 4 - var25.field3819) / 2;
                    var25.method5472(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3418) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                boolean var29 = var18 != 0L && !class123.method27(var18);
                if (var29) {
                    var28 = 15597568;
                }
                int[] var30 = field1356.field3826;
                int var31 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var30[var31 + 1536] = var28;
                    var30[var31 + 1024 + 1] = var28;
                    var30[var31 + 512 + 2] = var28;
                    var30[var31 + 3] = var28;
                } else {
                    var30[var31] = var28;
                    var30[var31 + 512 + 1] = var28;
                    var30[var31 + 1024 + 2] = var28;
                    var30[var31 + 1536 + 3] = var28;
                }
            }
        }
        long var32 = field267.method2685(arg0, arg1, arg2);
        if (var32 == 0L) {
            return;
        }
        int var34 = class123.method936(var32);
        class271 var35 = class271.method4255(var34);
        if (var35.field3431 == -1) {
            return;
        }
        class321 var36 = field2584[var35.field3431];
        if (var36 != null) {
            int var37 = (var35.field3417 * 4 - var36.field3817) / 2;
            int var38 = (var35.field3418 * 4 - var36.field3819) / 2;
            var36.method5472(arg1 * 4 + 48 + var37, (104 - arg2 - var35.field3418) * 4 + 48 + var38);
        }
    }

    @ObfuscatedName("fz.hr(II)Z")
    public static final boolean method3155(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = client.field759[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("db.il(III)Ljava/lang/String;")
    public static final String method2548(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class76.method2125(16711680);
        } else if (var2 < -6) {
            return class76.method2125(16723968);
        } else if (var2 < -3) {
            return class76.method2125(16740352);
        } else if (var2 < 0) {
            return class76.method2125(16756736);
        } else if (var2 > 9) {
            return class76.method2125(65280);
        } else if (var2 > 6) {
            return class76.method2125(4259584);
        } else if (var2 > 3) {
            return class76.method2125(8453888);
        } else if (var2 > 0) {
            return class76.method2125(12648192);
        } else {
            return class76.method2125(16776960);
        }
    }

    @ObfuscatedName("dy.ix([Lhg;IIIIIIIII)V")
    public static final void method2378(class233[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class318.method5394(arg2, arg3, arg4, arg5);
        class125.method2580();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class233 var10 = arg0[var9];
            if (var10 != null && (var10.field2675 == arg1 || arg1 == -1412584499 && client.field858 == var10)) {
                int var11;
                if (arg8 == -1) {
                    client.field825[client.field882] = var10.field2651 + arg6;
                    client.field826[client.field882] = var10.field2652 + arg7;
                    client.field827[client.field882] = var10.field2653;
                    client.field828[client.field882] = var10.field2654;
                    var11 = ++client.field882 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2770 = var11;
                var10.field2771 = client.field631;
                if (var10.field2637) {
                    boolean var12 = var10.field2658;
                    if (var12) {
                        continue;
                    }
                }
                if (var10.field2657 > 0) {
                    client.method611(var10);
                }
                int var13 = var10.field2651 + arg6;
                int var14 = var10.field2652 + arg7;
                int var15 = var10.field2669;
                if (client.field858 == var10) {
                    if (arg1 != -1412584499 && !var10.field2717) {
                        field49 = arg0;
                        field471 = arg6;
                        field359 = arg7;
                        continue;
                    }
                    if (client.field801 && client.field795) {
                        int var16 = class49.field456;
                        int var17 = class49.field458 * -53945113;
                        int var18 = var16 - client.field792;
                        int var19 = var17 - client.field745;
                        if (var18 < client.field796) {
                            var18 = client.field796;
                        }
                        if (var10.field2653 + var18 > client.field796 + client.field791.field2653) {
                            var18 = client.field796 + client.field791.field2653 - var10.field2653;
                        }
                        if (var19 < client.field875) {
                            var19 = client.field875;
                        }
                        if (var10.field2654 + var19 > client.field875 + client.field791.field2654) {
                            var19 = client.field875 + client.field791.field2654 - var10.field2654;
                        }
                        var13 = var18;
                        var14 = var19;
                    }
                    if (!var10.field2717) {
                        var15 = 128;
                    }
                }
                int var20;
                int var21;
                int var22;
                int var23;
                if (var10.field2680 == 2) {
                    var20 = arg2;
                    var21 = arg3;
                    var22 = arg4;
                    var23 = arg5;
                } else if (var10.field2680 == 9) {
                    int var24 = var13;
                    int var25 = var14;
                    int var26 = var10.field2653 + var13;
                    int var27 = var10.field2654 + var14;
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
                    int var30 = var10.field2653 + var13;
                    int var31 = var10.field2654 + var14;
                    var20 = var13 > arg2 ? var13 : arg2;
                    var21 = var14 > arg3 ? var14 : arg3;
                    var22 = var30 < arg4 ? var30 : arg4;
                    var23 = var31 < arg5 ? var31 : arg5;
                }
                if (!var10.field2637 || var20 < var22 && var21 < var23) {
                    if (var10.field2657 != 0) {
                        if (var10.field2657 == 1336) {
                            if (client.field668) {
                                var14 += 15;
                                field1065.method5161("Fps:" + client.field422, var10.field2653 + var13, var14, 16776960, -1);
                                var14 += 15;
                                Runtime var32 = Runtime.getRuntime();
                                int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                int var34 = 16776960;
                                if (var33 > 327680 && !client.field624) {
                                    var34 = 16711680;
                                }
                                field1065.method5161("Mem:" + var33 + "k", var10.field2653 + var13, var14, var34, -1);
                                var14 += 15;
                            }
                            continue;
                        }
                        if (var10.field2657 == 1337) {
                            client.field641 = var13;
                            client.field769 = var14;
                            int var37 = var10.field2653;
                            int var38 = var10.field2654;
                            client.field621++;
                            if (field341.field933 >> 7 == client.field658 && field341.field964 >> 7 == client.field802) {
                                client.field658 = 0;
                            }
                            if (client.field620) {
                                client.method745(field341, false);
                            }
                            if (client.field746 >= 0 && client.field735[client.field746] != null) {
                                client.method745(client.field735[client.field746], false);
                            }
                            client.method3898(true);
                            int var39 = class84.field1199;
                            int[] var40 = class84.field1205;
                            for (int var41 = 0; var41 < var39; var41++) {
                                if (client.field746 != var40[var41] && client.field736 != var40[var41]) {
                                    client.method745(client.field735[var40[var41]], true);
                                }
                            }
                            client.method3898(false);
                            for (class81 var42 = (class81) client.field749.method3792(); var42 != null; var42 = (class81) client.field749.method3800()) {
                                if (field348 != var42.field1163 || client.field631 > var42.field1186) {
                                    var42.method3787();
                                } else if (client.field631 >= var42.field1176) {
                                    if (var42.field1172 > 0) {
                                        class74 var43 = client.field660[var42.field1172 - 1];
                                        if (var43 != null && var43.field933 >= 0 && var43.field933 < 13312 && var43.field964 >= 0 && var43.field964 < 13312) {
                                            var42.method1765(var43.field933, var43.field964, client.method3573(var43.field933, var43.field964, var42.field1163) - var42.field1167, client.field631);
                                        }
                                    }
                                    if (var42.field1172 < 0) {
                                        int var44 = -var42.field1172 - 1;
                                        class62 var45;
                                        if (client.field736 == var44) {
                                            var45 = field341;
                                        } else {
                                            var45 = client.field735[var44];
                                        }
                                        if (var45 != null && var45.field933 >= 0 && var45.field933 < 13312 && var45.field964 >= 0 && var45.field964 < 13312) {
                                            var42.method1765(var45.field933, var45.field964, client.method3573(var45.field933, var45.field964, var42.field1163) - var42.field1167, client.field631);
                                        }
                                    }
                                    var42.method1767(client.field681);
                                    field267.method2715(field348, (int) var42.field1174, (int) var42.field1168, (int) var42.field1162, 60, var42, var42.field1182, -1L, false);
                                }
                            }
                            client.method1673();
                            client.method487(var13, var14, var37, var38, true);
                            int var46 = client.field837;
                            int var47 = client.field733;
                            int var48 = client.field877;
                            int var49 = client.field878;
                            class318.method5394(var46, var47, var46 + var48, var47 + var49);
                            class125.method2580();
                            if (!client.field861) {
                                int var50 = client.field688;
                                if (client.field705 / 256 > var50) {
                                    var50 = client.field705 / 256;
                                }
                                if (client.field779[4] && client.field725[4] + 128 > var50) {
                                    var50 = client.field725[4] + 128;
                                }
                                int var51 = client.field689 & 0x7FF;
                                client.method205(field63, field2017, field1714, var50, var51, var50 * 3 + 600);
                            }
                            int var64;
                            if (client.field861) {
                                var64 = client.method695();
                            } else {
                                int var52;
                                if (field580.field997) {
                                    var52 = field348;
                                } else {
                                    label1344: {
                                        int var53 = 3;
                                        if (field2504 < 310) {
                                            int var54;
                                            int var55;
                                            if (client.field694 == 1) {
                                                var54 = field63 >> 7;
                                                var55 = field1714 >> 7;
                                            } else {
                                                var54 = field341.field933 >> 7;
                                                var55 = field341.field964 >> 7;
                                            }
                                            int var56 = field81 >> 7;
                                            int var57 = field1509 >> 7;
                                            if (var56 < 0 || var57 < 0 || var56 >= 104 || var57 >= 104) {
                                                var52 = field348;
                                                break label1344;
                                            }
                                            if (var54 < 0 || var55 < 0 || var54 >= 104 || var55 >= 104) {
                                                var52 = field348;
                                                break label1344;
                                            }
                                            if ((class51.field498[field348][var56][var57] & 0x4) != 0) {
                                                var53 = field348;
                                            }
                                            int var58;
                                            if (var54 > var56) {
                                                var58 = var54 - var56;
                                            } else {
                                                var58 = var56 - var54;
                                            }
                                            int var59;
                                            if (var55 > var57) {
                                                var59 = var55 - var57;
                                            } else {
                                                var59 = var57 - var55;
                                            }
                                            if (var58 > var59) {
                                                int var60 = var59 * 65536 / var58;
                                                int var61 = 32768;
                                                while (var54 != var56) {
                                                    if (var56 < var54) {
                                                        var56++;
                                                    } else if (var56 > var54) {
                                                        var56--;
                                                    }
                                                    if ((class51.field498[field348][var56][var57] & 0x4) != 0) {
                                                        var53 = field348;
                                                    }
                                                    var61 += var60;
                                                    if (var61 >= 65536) {
                                                        var61 -= 65536;
                                                        if (var57 < var55) {
                                                            var57++;
                                                        } else if (var57 > var55) {
                                                            var57--;
                                                        }
                                                        if ((class51.field498[field348][var56][var57] & 0x4) != 0) {
                                                            var53 = field348;
                                                        }
                                                    }
                                                }
                                            } else if (var59 > 0) {
                                                int var62 = var58 * 65536 / var59;
                                                int var63 = 32768;
                                                while (var55 != var57) {
                                                    if (var57 < var55) {
                                                        var57++;
                                                    } else if (var57 > var55) {
                                                        var57--;
                                                    }
                                                    if ((class51.field498[field348][var56][var57] & 0x4) != 0) {
                                                        var53 = field348;
                                                    }
                                                    var63 += var62;
                                                    if (var63 >= 65536) {
                                                        var63 -= 65536;
                                                        if (var56 < var54) {
                                                            var56++;
                                                        } else if (var56 > var54) {
                                                            var56--;
                                                        }
                                                        if ((class51.field498[field348][var56][var57] & 0x4) != 0) {
                                                            var53 = field348;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (field341.field933 >= 0 && field341.field964 >= 0 && field341.field933 < 13312 && field341.field964 < 13312) {
                                            if ((class51.field498[field348][field341.field933 >> 7][field341.field964 >> 7] & 0x4) != 0) {
                                                var53 = field348;
                                            }
                                            var52 = var53;
                                        } else {
                                            var52 = field348;
                                        }
                                    }
                                }
                                var64 = var52;
                            }
                            int var65 = field81;
                            int var66 = field43;
                            int var67 = field1509;
                            int var68 = field2504;
                            int var69 = field71;
                            for (int var70 = 0; var70 < 5; var70++) {
                                if (client.field779[var70]) {
                                    int var71 = (int) (Math.random() * (double) (client.field797[var70] * 2 + 1) - (double) client.field797[var70] + Math.sin((double) client.field865[var70] / 100.0D * (double) client.field868[var70]) * (double) client.field725[var70]);
                                    if (var70 == 0) {
                                        field81 += var71;
                                    }
                                    if (var70 == 1) {
                                        field43 += var71;
                                    }
                                    if (var70 == 2) {
                                        field1509 += var71;
                                    }
                                    if (var70 == 3) {
                                        field71 = field71 + var71 & 0x7FF;
                                    }
                                    if (var70 == 4) {
                                        field2504 += var71;
                                        if (field2504 < 128) {
                                            field2504 = 128;
                                        }
                                        if (field2504 > 383) {
                                            field2504 = 383;
                                        }
                                    }
                                }
                            }
                            int var72 = class49.field456;
                            int var73 = class49.field458 * -53945113;
                            if (class49.field464 != 0) {
                                var72 = class49.field465;
                                var73 = class49.field447;
                            }
                            if (var72 >= var46 && var72 < var46 + var48 && var73 >= var47 && var73 < var47 + var49) {
                                class123.method4653(var72 - var46, var73 - var47);
                            } else {
                                class123.method986();
                            }
                            client.method1708();
                            class318.method5408(var46, var47, var48, var49, 0);
                            client.method1708();
                            int var74 = class125.field1730;
                            class125.field1730 = client.field879;
                            field267.method2696(field81, field43, field1509, field2504, field71, var64);
                            class125.field1730 = var74;
                            client.method1708();
                            field267.method2670();
                            client.field706 = 0;
                            boolean var75 = false;
                            int var76 = -1;
                            int var77 = -1;
                            int var78 = class84.field1199;
                            int[] var79 = class84.field1205;
                            for (int var80 = 0; var80 < client.field661 + var78; var80++) {
                                class65 var81;
                                if (var80 < var78) {
                                    var81 = client.field735[var79[var80]];
                                    if (client.field746 == var79[var80]) {
                                        var75 = true;
                                        var76 = var80;
                                        continue;
                                    }
                                    if (field341 == var81) {
                                        var77 = var80;
                                        continue;
                                    }
                                } else {
                                    var81 = client.field660[client.field667[var80 - var78]];
                                }
                                client.method3242(var81, var80, var46, var47, var48, var49);
                            }
                            if (client.field620 && var77 != -1) {
                                client.method3242(field341, var77, var46, var47, var48, var49);
                            }
                            if (var75) {
                                client.method3242(client.field735[client.field746], var76, var46, var47, var48, var49);
                            }
                            for (int var82 = 0; var82 < client.field706; var82++) {
                                int var83 = client.field708[var82];
                                int var84 = client.field836[var82];
                                int var85 = client.field723[var82];
                                int var86 = client.field710[var82];
                                boolean var87 = true;
                                while (var87) {
                                    var87 = false;
                                    for (int var88 = 0; var88 < var82; var88++) {
                                        if (var84 + 2 > client.field836[var88] - client.field710[var88] && var84 - var86 < client.field836[var88] + 2 && var83 - var85 < client.field723[var88] + client.field708[var88] && var83 + var85 > client.field708[var88] - client.field723[var88] && client.field836[var88] - client.field710[var88] < var84) {
                                            var84 = client.field836[var88] - client.field710[var88];
                                            var87 = true;
                                        }
                                    }
                                }
                                client.field718 = client.field708[var82];
                                client.field719 = client.field836[var82] = var84;
                                String var89 = client.field637[var82];
                                if (client.field781 == 0) {
                                    int var90 = 16776960;
                                    if (client.field712[var82] < 6) {
                                        var90 = client.field699[client.field712[var82]];
                                    }
                                    if (client.field712[var82] == 6) {
                                        var90 = client.field621 % 20 < 10 ? 16711680 : 16776960;
                                    }
                                    if (client.field712[var82] == 7) {
                                        var90 = client.field621 % 20 < 10 ? 255 : 65535;
                                    }
                                    if (client.field712[var82] == 8) {
                                        var90 = client.field621 % 20 < 10 ? 45056 : 8454016;
                                    }
                                    if (client.field712[var82] == 9) {
                                        int var91 = 150 - client.field864[var82];
                                        if (var91 < 50) {
                                            var90 = var91 * 1280 + 16711680;
                                        } else if (var91 < 100) {
                                            var90 = 16776960 - (var91 - 50) * 327680;
                                        } else if (var91 < 150) {
                                            var90 = (var91 - 100) * 5 + 65280;
                                        }
                                    }
                                    if (client.field712[var82] == 10) {
                                        int var92 = 150 - client.field864[var82];
                                        if (var92 < 50) {
                                            var90 = var92 * 5 + 16711680;
                                        } else if (var92 < 100) {
                                            var90 = 16711935 - (var92 - 50) * 327680;
                                        } else if (var92 < 150) {
                                            var90 = (var92 - 100) * 327680 + 255 - (var92 - 100) * 5;
                                        }
                                    }
                                    if (client.field712[var82] == 11) {
                                        int var93 = 150 - client.field864[var82];
                                        if (var93 < 50) {
                                            var90 = 16777215 - var93 * 327685;
                                        } else if (var93 < 100) {
                                            var90 = (var93 - 50) * 327685 + 65280;
                                        } else if (var93 < 150) {
                                            var90 = 16777215 - (var93 - 100) * 327680;
                                        }
                                    }
                                    if (client.field713[var82] == 0) {
                                        field120.method5162(var89, client.field718 + var46, client.field719 + var47, var90, 0);
                                    }
                                    if (client.field713[var82] == 1) {
                                        field120.method5188(var89, client.field718 + var46, client.field719 + var47, var90, 0, client.field621);
                                    }
                                    if (client.field713[var82] == 2) {
                                        field120.method5165(var89, client.field718 + var46, client.field719 + var47, var90, 0, client.field621);
                                    }
                                    if (client.field713[var82] == 3) {
                                        field120.method5166(var89, client.field718 + var46, client.field719 + var47, var90, 0, client.field621, 150 - client.field864[var82]);
                                    }
                                    if (client.field713[var82] == 4) {
                                        int var94 = (150 - client.field864[var82]) * (field120.method5154(var89) + 100) / 150;
                                        class318.method5369(client.field718 + var46 - 50, var47, client.field718 + var46 + 50, var47 + var49);
                                        field120.method5159(var89, client.field718 + var46 + 50 - var94, client.field719 + var47, var90, 0);
                                        class318.method5394(var46, var47, var46 + var48, var47 + var49);
                                    }
                                    if (client.field713[var82] == 5) {
                                        int var95 = 150 - client.field864[var82];
                                        int var96 = 0;
                                        if (var95 < 25) {
                                            var96 = var95 - 25;
                                        } else if (var95 > 125) {
                                            var96 = var95 - 125;
                                        }
                                        class318.method5369(var46, client.field719 + var47 - field120.field3728 - 1, var46 + var48, client.field719 + var47 + 5);
                                        field120.method5162(var89, client.field718 + var46, client.field719 + var47 + var96, var90, 0);
                                        class318.method5394(var46, var47, var46 + var48, var47 + var49);
                                    }
                                } else {
                                    field120.method5162(var89, client.field718 + var46, client.field719 + var47, 16776960, 0);
                                }
                            }
                            client.method899(var46, var47);
                            ((class114) field1741).method2362(client.field681);
                            client.field753 = 0;
                            int var97 = (field341.field933 >> 7) + field6;
                            int var98 = (field341.field964 >> 7) + field72;
                            if (var97 >= 3053 && var97 <= 3156 && var98 >= 3056 && var98 <= 3136) {
                                client.field753 = 1;
                            }
                            if (var97 >= 3072 && var97 <= 3118 && var98 >= 9492 && var98 <= 9535) {
                                client.field753 = 1;
                            }
                            if (client.field753 == 1 && var97 >= 3139 && var97 <= 3199 && var98 >= 3008 && var98 <= 3062) {
                                client.field753 = 0;
                            }
                            field81 = var65;
                            field43 = var66;
                            field1509 = var67;
                            field2504 = var68;
                            field71 = var69;
                            if (client.field630 && class253.method2464(true, false) == 0) {
                                client.field630 = false;
                            }
                            if (client.field630) {
                                class318.method5408(var46, var47, var48, var49, 0);
                                client.method43(class240.field3027, false);
                            }
                            client.field822[var10.field2770] = true;
                            class318.method5394(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2657 == 1338) {
                            client.method4082(var10, var13, var14, var11);
                            class318.method5394(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2657 == 1339) {
                            client.method2873(var10, var13, var14, var11);
                            class318.method5394(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2657 == 1400) {
                            field1937.method5823(var13, var14, var10.field2653, var10.field2654, client.field631);
                        }
                        if (var10.field2657 == 1401) {
                            field1937.method5680(var13, var14, var10.field2653, var10.field2654);
                        }
                    }
                    if (var10.field2680 == 0) {
                        if (!var10.field2637) {
                            boolean var99 = var10.field2658;
                            if (var99 && field1579 != var10) {
                                continue;
                            }
                        }
                        if (!var10.field2637) {
                            if (var10.field2692 > var10.field2662 - var10.field2654) {
                                var10.field2692 = var10.field2662 - var10.field2654;
                            }
                            if (var10.field2692 < 0) {
                                var10.field2692 = 0;
                            }
                        }
                        method2378(arg0, var10.field2638, var20, var21, var22, var23, var13 - var10.field2659, var14 - var10.field2692, var11);
                        if (var10.field2763 != null) {
                            method2378(var10.field2763, var10.field2638, var20, var21, var22, var23, var13 - var10.field2659, var14 - var10.field2692, var11);
                        }
                        class57 var100 = (class57) client.field780.method3735((long) var10.field2638);
                        if (var100 != null) {
                            client.method4397(var100.field535, var20, var21, var22, var23, var13, var14, var11);
                        }
                        class318.method5394(arg2, arg3, arg4, arg5);
                        class125.method2580();
                    }
                    if (client.field852 || client.field824[var11] || client.field783 > 1) {
                        if (var10.field2680 == 0 && !var10.field2637 && var10.field2662 > var10.field2654) {
                            int var101 = var10.field2653 + var13;
                            int var102 = var10.field2692;
                            int var103 = var10.field2654;
                            int var104 = var10.field2662;
                            field162[0].method5472(var101, var14);
                            field162[1].method5472(var101, var14 + var103 - 16);
                            class318.method5408(var101, var14 + 16, 16, var103 - 32, client.field889);
                            int var105 = (var103 - 32) * var103 / var104;
                            if (var105 < 8) {
                                var105 = 8;
                            }
                            int var106 = (var103 - 32 - var105) * var102 / (var104 - var103);
                            class318.method5408(var101, var14 + 16 + var106, 16, var105, client.field829);
                            class318.method5387(var101, var14 + 16 + var106, var105, client.field685);
                            class318.method5387(var101 + 1, var14 + 16 + var106, var105, client.field685);
                            class318.method5404(var101, var14 + 16 + var106, 16, client.field685);
                            class318.method5404(var101, var14 + 17 + var106, 16, client.field685);
                            class318.method5387(var101 + 15, var14 + 16 + var106, var105, client.field684);
                            class318.method5387(var101 + 14, var14 + 17 + var106, var105 - 1, client.field684);
                            class318.method5404(var101, var14 + 15 + var106 + var105, 16, client.field684);
                            class318.method5404(var101 + 1, var14 + 14 + var106 + var105, 15, client.field684);
                        }
                        if (var10.field2680 != 1) {
                            if (var10.field2680 == 2) {
                                int var107 = 0;
                                for (int var108 = 0; var108 < var10.field2650; var108++) {
                                    for (int var109 = 0; var109 < var10.field2649; var109++) {
                                        int var110 = (var10.field2648 + 32) * var109 + var13;
                                        int var111 = (var10.field2706 + 32) * var108 + var14;
                                        if (var107 < 20) {
                                            var110 += var10.field2707[var107];
                                            var111 += var10.field2708[var107];
                                        }
                                        if (var10.field2736[var107] > 0) {
                                            boolean var112 = false;
                                            boolean var113 = false;
                                            int var114 = var10.field2736[var107] - 1;
                                            if (var110 + 32 > arg2 && var110 < arg4 && var111 + 32 > arg3 && var111 < arg5 || field1042 == var10 && client.field727 == var107) {
                                                class322 var115;
                                                if (client.field772 == 1 && field1111 == var107 && field1260 == var10.field2638) {
                                                    var115 = class272.method1721(var114, var10.field2758[var107], 2, 0, 2, false);
                                                } else {
                                                    var115 = class272.method1721(var114, var10.field2758[var107], 1, 3153952, 2, false);
                                                }
                                                if (var115 == null) {
                                                    client.method3069(var10);
                                                } else if (field1042 == var10 && client.field727 == var107) {
                                                    int var116 = class49.field456 - client.field728;
                                                    int var117 = class49.field458 * -53945113 - client.field778;
                                                    if (var116 < 5 && var116 > -5) {
                                                        var116 = 0;
                                                    }
                                                    if (var117 < 5 && var117 > -5) {
                                                        var117 = 0;
                                                    }
                                                    if (client.field732 < 5) {
                                                        var116 = 0;
                                                        var117 = 0;
                                                    }
                                                    var115.method5508(var110 + var116, var111 + var117, 128);
                                                    if (arg1 != -1) {
                                                        class233 var118 = arg0[arg1 & 0xFFFF];
                                                        if (var111 + var117 < class318.field3801 && var118.field2692 > 0) {
                                                            int var119 = client.field681 * (class318.field3801 - var111 - var117) / 3;
                                                            if (var119 > client.field681 * 10) {
                                                                var119 = client.field681 * 10;
                                                            }
                                                            if (var119 > var118.field2692) {
                                                                var119 = var118.field2692;
                                                            }
                                                            var118.field2692 -= var119;
                                                            client.field778 += var119;
                                                            client.method3069(var118);
                                                        }
                                                        if (var111 + var117 + 32 > class318.field3800 && var118.field2692 < var118.field2662 - var118.field2654) {
                                                            int var120 = client.field681 * (var111 + var117 + 32 - class318.field3800) / 3;
                                                            if (var120 > client.field681 * 10) {
                                                                var120 = client.field681 * 10;
                                                            }
                                                            if (var120 > var118.field2662 - var118.field2654 - var118.field2692) {
                                                                var120 = var118.field2662 - var118.field2654 - var118.field2692;
                                                            }
                                                            var118.field2692 += var120;
                                                            client.field778 -= var120;
                                                            client.method3069(var118);
                                                        }
                                                    }
                                                } else if (field306 == var10 && client.field726 == var107) {
                                                    var115.method5508(var110, var111, 128);
                                                } else {
                                                    var115.method5502(var110, var111);
                                                }
                                            }
                                        } else if (var10.field2709 != null && var107 < 20) {
                                            class322 var121 = var10.method4192(var107);
                                            if (var121 != null) {
                                                var121.method5502(var110, var111);
                                            } else if (class233.field2643) {
                                                client.method3069(var10);
                                            }
                                        }
                                        var107++;
                                    }
                                }
                            } else if (var10.field2680 == 3) {
                                int var122;
                                if (client.method4257(var10)) {
                                    var122 = var10.field2664;
                                    if (field1579 == var10 && var10.field2666 != 0) {
                                        var122 = var10.field2666;
                                    }
                                } else {
                                    var122 = var10.field2635;
                                    if (field1579 == var10 && var10.field2632 != 0) {
                                        var122 = var10.field2632;
                                    }
                                }
                                if (var10.field2667) {
                                    switch(var10.field2668.field3813) {
                                        case 1:
                                            class318.method5377(var13, var14, var10.field2653, var10.field2654, var10.field2635, var10.field2664, 256 - (var10.field2669 & 0xFF), 256 - (var10.field2641 & 0xFF));
                                            break;
                                        case 2:
                                            class318.method5378(var13, var14, var10.field2653, var10.field2654, var10.field2635, var10.field2664, 256 - (var10.field2669 & 0xFF), 256 - (var10.field2641 & 0xFF));
                                            break;
                                        case 3:
                                            class318.method5379(var13, var14, var10.field2653, var10.field2654, var10.field2635, var10.field2664, 256 - (var10.field2669 & 0xFF), 256 - (var10.field2641 & 0xFF));
                                            break;
                                        case 4:
                                            class318.method5444(var13, var14, var10.field2653, var10.field2654, var10.field2635, var10.field2664, 256 - (var10.field2669 & 0xFF), 256 - (var10.field2641 & 0xFF));
                                            break;
                                        default:
                                            if (var15 == 0) {
                                                class318.method5408(var13, var14, var10.field2653, var10.field2654, var122);
                                            } else {
                                                class318.method5375(var13, var14, var10.field2653, var10.field2654, var122, 256 - (var15 & 0xFF));
                                            }
                                    }
                                } else if (var15 == 0) {
                                    class318.method5412(var13, var14, var10.field2653, var10.field2654, var122);
                                } else {
                                    class318.method5384(var13, var14, var10.field2653, var10.field2654, var122, 256 - (var15 & 0xFF));
                                }
                            } else if (var10.field2680 == 4) {
                                class301 var123 = var10.method4175();
                                if (var123 != null) {
                                    String var124 = var10.field2660;
                                    int var125;
                                    if (client.method4257(var10)) {
                                        var125 = var10.field2664;
                                        if (field1579 == var10 && var10.field2666 != 0) {
                                            var125 = var10.field2666;
                                        }
                                        if (var10.field2688.length() > 0) {
                                            var124 = var10.field2688;
                                        }
                                    } else {
                                        var125 = var10.field2635;
                                        if (field1579 == var10 && var10.field2632 != 0) {
                                            var125 = var10.field2632;
                                        }
                                    }
                                    if (var10.field2637 && var10.field2759 != -1) {
                                        class272 var126 = method945(var10.field2759);
                                        var124 = var126.field3462;
                                        if (var124 == null) {
                                            var124 = class240.field2830;
                                        }
                                        if ((var126.field3473 == 1 || var10.field2670 != 1) && var10.field2670 != -1) {
                                            var124 = class76.method2125(16748608) + var124 + class76.field1092 + " " + 'x' + client.method1004(var10.field2670);
                                        }
                                    }
                                    if (client.field709 == var10) {
                                        var124 = class240.field2982;
                                        var125 = var10.field2635;
                                    }
                                    if (!var10.field2637) {
                                        var124 = method1706(var124, var10);
                                    }
                                    var123.method5209(var124, var13, var14, var10.field2653, var10.field2654, var125, var10.field2704 ? 0 : -1, var10.field2725, var10.field2703, var10.field2701);
                                } else if (class233.field2643) {
                                    client.method3069(var10);
                                }
                            } else if (var10.field2680 == 5) {
                                if (var10.field2637) {
                                    class322 var128;
                                    if (var10.field2759 == -1) {
                                        var128 = var10.method4177(false);
                                    } else {
                                        var128 = class272.method1721(var10.field2759, var10.field2670, var10.field2677, var10.field2702, var10.field2697, false);
                                    }
                                    if (var128 != null) {
                                        int var129 = var128.field3829;
                                        int var130 = var128.field3824;
                                        if (var10.field2734) {
                                            class318.method5369(var13, var14, var10.field2653 + var13, var10.field2654 + var14);
                                            int var131 = (var10.field2653 + (var129 - 1)) / var129;
                                            int var132 = (var10.field2654 + (var130 - 1)) / var130;
                                            for (int var133 = 0; var133 < var131; var133++) {
                                                for (int var134 = 0; var134 < var132; var134++) {
                                                    if (var10.field2640 != 0) {
                                                        var128.method5521(var129 / 2 + var129 * var133 + var13, var130 / 2 + var130 * var134 + var14, var10.field2640, 4096);
                                                    } else if (var15 == 0) {
                                                        var128.method5502(var129 * var133 + var13, var130 * var134 + var14);
                                                    } else {
                                                        var128.method5508(var129 * var133 + var13, var130 * var134 + var14, 256 - (var15 & 0xFF));
                                                    }
                                                }
                                            }
                                            class318.method5394(arg2, arg3, arg4, arg5);
                                        } else {
                                            int var135 = var10.field2653 * 4096 / var129;
                                            if (var10.field2640 != 0) {
                                                var128.method5521(var10.field2653 / 2 + var13, var10.field2654 / 2 + var14, var10.field2640, var135);
                                            } else if (var15 != 0) {
                                                var128.method5510(var13, var14, var10.field2653, var10.field2654, 256 - (var15 & 0xFF));
                                            } else if (var10.field2653 == var129 && var10.field2654 == var130) {
                                                var128.method5502(var13, var14);
                                            } else {
                                                var128.method5504(var13, var14, var10.field2653, var10.field2654);
                                            }
                                        }
                                    } else if (class233.field2643) {
                                        client.method3069(var10);
                                    }
                                } else {
                                    class322 var127 = var10.method4177(client.method4257(var10));
                                    if (var127 != null) {
                                        var127.method5502(var13, var14);
                                    } else if (class233.field2643) {
                                        client.method3069(var10);
                                    }
                                }
                            } else if (var10.field2680 == 6) {
                                boolean var136 = client.method4257(var10);
                                int var137;
                                if (var136) {
                                    var137 = var10.field2686;
                                } else {
                                    var137 = var10.field2644;
                                }
                                class122 var138 = null;
                                int var139 = 0;
                                if (var10.field2759 != -1) {
                                    class272 var140 = method945(var10.field2759);
                                    if (var140 != null) {
                                        class272 var141 = var140.method4750(var10.field2670);
                                        var138 = var141.method4749(1);
                                        if (var138 == null) {
                                            client.method3069(var10);
                                        } else {
                                            var138.method2532();
                                            var139 = var138.field1833 / 2;
                                        }
                                    }
                                } else if (var10.field2681 == 5) {
                                    if (var10.field2682 == 0) {
                                        var138 = client.field722.method4137((class276) null, -1, (class276) null, -1);
                                    } else {
                                        var138 = field341.method1056();
                                    }
                                } else if (var137 == -1) {
                                    var138 = var10.method4213((class276) null, -1, var136, field341.field599);
                                    if (var138 == null && class233.field2643) {
                                        client.method3069(var10);
                                    }
                                } else {
                                    class276 var142 = class276.method115(var137);
                                    var138 = var10.method4213(var142, var10.field2761, var136, field341.field599);
                                    if (var138 == null && class233.field2643) {
                                        client.method3069(var10);
                                    }
                                }
                                class125.method2583(var10.field2653 / 2 + var13, var10.field2654 / 2 + var14);
                                int var143 = var10.field2655 * class125.field1731[var10.field2689] >> 16;
                                int var144 = var10.field2655 * class125.field1745[var10.field2689] >> 16;
                                if (var138 != null) {
                                    if (var10.field2637) {
                                        var138.method2532();
                                        if (var10.field2695) {
                                            var138.method2487(0, var10.field2742, var10.field2691, var10.field2689, var10.field2642, var10.field2627 + var139 + var143, var10.field2627 + var144, var10.field2655);
                                        } else {
                                            var138.method2486(0, var10.field2742, var10.field2691, var10.field2689, var10.field2642, var10.field2627 + var139 + var143, var10.field2627 + var144);
                                        }
                                    } else {
                                        var138.method2486(0, var10.field2742, 0, var10.field2689, 0, var143, var144);
                                    }
                                }
                                class125.method2646();
                            } else {
                                if (var10.field2680 == 7) {
                                    class301 var145 = var10.method4175();
                                    if (var145 == null) {
                                        if (class233.field2643) {
                                            client.method3069(var10);
                                        }
                                        continue;
                                    }
                                    int var146 = 0;
                                    for (int var147 = 0; var147 < var10.field2650; var147++) {
                                        for (int var148 = 0; var148 < var10.field2649; var148++) {
                                            if (var10.field2736[var146] > 0) {
                                                class272 var149 = method945(var10.field2736[var146] - 1);
                                                String var150;
                                                if (var149.field3473 != 1 && var10.field2758[var146] == 1) {
                                                    var150 = class76.method2125(16748608) + var149.field3462 + class76.field1092;
                                                } else {
                                                    var150 = class76.method2125(16748608) + var149.field3462 + class76.field1092 + " " + 'x' + client.method1004(var10.field2758[var146]);
                                                }
                                                int var151 = (var10.field2648 + 115) * var148 + var13;
                                                int var152 = (var10.field2706 + 12) * var147 + var14;
                                                if (var10.field2725 == 0) {
                                                    var145.method5159(var150, var151, var152, var10.field2635, var10.field2704 ? 0 : -1);
                                                } else if (var10.field2725 == 1) {
                                                    var145.method5162(var150, var10.field2653 / 2 + var151, var152, var10.field2635, var10.field2704 ? 0 : -1);
                                                } else {
                                                    var145.method5161(var150, var10.field2653 + var151 - 1, var152, var10.field2635, var10.field2704 ? 0 : -1);
                                                }
                                            }
                                            var146++;
                                        }
                                    }
                                }
                                if (var10.field2680 == 8 && field330 == var10 && client.field771 == client.field770) {
                                    int var153 = 0;
                                    int var154 = 0;
                                    class301 var155 = field1065;
                                    String var156 = var10.field2660;
                                    String var157 = method1706(var156, var10);
                                    while (var157.length() > 0) {
                                        int var158 = var157.indexOf(class76.field1093);
                                        String var159;
                                        if (var158 == -1) {
                                            var159 = var157;
                                            var157 = "";
                                        } else {
                                            var159 = var157.substring(0, var158);
                                            var157 = var157.substring(var158 + 4);
                                        }
                                        int var160 = var155.method5154(var159);
                                        if (var160 > var153) {
                                            var153 = var160;
                                        }
                                        var154 += var155.field3728 + 1;
                                    }
                                    var153 += 6;
                                    var154 += 7;
                                    int var161 = var10.field2653 + var13 - 5 - var153;
                                    int var162 = var10.field2654 + var14 + 5;
                                    if (var161 < var13 + 5) {
                                        var161 = var13 + 5;
                                    }
                                    if (var153 + var161 > arg4) {
                                        var161 = arg4 - var153;
                                    }
                                    if (var154 + var162 > arg5) {
                                        var162 = arg5 - var154;
                                    }
                                    class318.method5408(var161, var162, var153, var154, 16777120);
                                    class318.method5412(var161, var162, var153, var154, 0);
                                    String var163 = var10.field2660;
                                    int var164 = var155.field3728 + var162 + 2;
                                    String var165 = method1706(var163, var10);
                                    while (var165.length() > 0) {
                                        int var166 = var165.indexOf(class76.field1093);
                                        String var167;
                                        if (var166 == -1) {
                                            var167 = var165;
                                            var165 = "";
                                        } else {
                                            var167 = var165.substring(0, var166);
                                            var165 = var165.substring(var166 + 4);
                                        }
                                        var155.method5159(var167, var161 + 3, var164, 0, -1);
                                        var164 += var155.field3728 + 1;
                                    }
                                }
                                if (var10.field2680 == 9) {
                                    int var168;
                                    int var169;
                                    int var170;
                                    int var171;
                                    if (var10.field2672) {
                                        var168 = var13;
                                        var169 = var10.field2654 + var14;
                                        var170 = var10.field2653 + var13;
                                        var171 = var14;
                                    } else {
                                        var168 = var13;
                                        var169 = var14;
                                        var170 = var10.field2653 + var13;
                                        var171 = var10.field2654 + var14;
                                    }
                                    if (var10.field2679 == 1) {
                                        class318.method5389(var168, var169, var170, var171, var10.field2635);
                                    } else {
                                        int var174 = var10.field2635;
                                        int var175 = var10.field2679;
                                        int var176 = var170 - var168;
                                        int var177 = var171 - var169;
                                        int var178 = var176 >= 0 ? var176 : -var176;
                                        int var179 = var177 >= 0 ? var177 : -var177;
                                        int var180 = var178;
                                        if (var178 < var179) {
                                            var180 = var179;
                                        }
                                        if (var180 != 0) {
                                            int var181 = (var176 << 16) / var180;
                                            int var182 = (var177 << 16) / var180;
                                            if (var182 <= var181) {
                                                var181 = -var181;
                                            } else {
                                                var182 = -var182;
                                            }
                                            int var183 = var175 * var182 >> 17;
                                            int var184 = var175 * var182 + 1 >> 17;
                                            int var185 = var175 * var181 >> 17;
                                            int var186 = var175 * var181 + 1 >> 17;
                                            int var187 = var168 - class318.field3803;
                                            int var188 = var169 - class318.field3801;
                                            int var189 = var183 + var187;
                                            int var190 = var187 - var184;
                                            int var191 = var176 + var187 - var184;
                                            int var192 = var176 + var187 + var183;
                                            int var193 = var185 + var188;
                                            int var194 = var188 - var186;
                                            int var195 = var177 + var188 - var186;
                                            int var196 = var177 + var188 + var185;
                                            class125.method2588(var189, var190, var191);
                                            class125.method2600(var193, var194, var195, var189, var190, var191, var174);
                                            class125.method2588(var189, var191, var192);
                                            class125.method2600(var193, var195, var196, var189, var191, var192, var174);
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

    @ObfuscatedName("bl.ir(Ljava/lang/String;Lhg;I)Ljava/lang/String;")
    public static String method1706(String arg0, class233 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + client.method971(client.method1855(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("cj.jy(I)V")
    public static void method2088() {
        for (class57 var0 = (class57) client.field780.method3741(); var0 != null; var0 = (class57) client.field780.method3734()) {
            int var1 = var0.field535;
            if (class233.method2911(var1)) {
                boolean var2 = true;
                class233[] var3 = field2674[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2637;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2464;
                    class233 var6 = class233.method2957(var5);
                    if (var6 != null) {
                        client.method3069(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gx.jr(Lgx;B)V")
    public static void method3497(class185 arg0) {
        if (client.field659 == null) {
            byte[] var1 = class158.method3001();
            arg0.method3303(var1, 0, var1.length);
        } else {
            arg0.method3303(client.field659, 0, client.field659.length);
        }
    }
}
