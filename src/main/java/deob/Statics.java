package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class Statics {

    @ObfuscatedName("dm.ir")
    public static int[] field1001;

    @ObfuscatedName("dm.av")
    public static int[] field1003;

    @ObfuscatedName("ds.ay")
    public static int[] field1009;

    @ObfuscatedName("dg.lv")
    public static int field1029;

    @ObfuscatedName("ae.jj")
    public static int field103;

    @ObfuscatedName("dq.aa")
    public static int[] field1035;

    @ObfuscatedName("dq.gs")
    public static int field1040;

    @ObfuscatedName("dq.ab")
    public static byte[][][] field1046;

    @ObfuscatedName("dz.uo")
    public static int field1050;

    @ObfuscatedName("dz.dq")
    public static class544[] field1052;

    @ObfuscatedName("df.md")
    public static int field1072;

    @ObfuscatedName("aw.jr")
    public static int field108;

    @ObfuscatedName("ao.ix")
    public static int field11;

    @ObfuscatedName("do.av")
    public static class117 field1104;

    @ObfuscatedName("do.wx")
    public static class101 field1106;

    @ObfuscatedName("dh.fy")
    public static class372 field1118;

    @ObfuscatedName("az.az")
    public static String field113;

    @ObfuscatedName("az.ak")
    public static int field115;

    @ObfuscatedName("du.ju")
    public static int field1151;

    @ObfuscatedName("dw.dz")
    public static class543[] field1185;

    @ObfuscatedName("at.sa")
    public static class549 field120;

    @ObfuscatedName("di.or")
    public static int field1264;

    @ObfuscatedName("di.hg")
    public static String field1265;

    @ObfuscatedName("dt.ab")
    public static boolean field1271;

    @ObfuscatedName("dd.gu")
    public static String field1284;

    @ObfuscatedName("dy.cf")
    public static int field1296;

    @ObfuscatedName("db.ap")
    public static int field1313;

    @ObfuscatedName("ad.bf")
    public static boolean field133;

    @ObfuscatedName("da.kk")
    public static class544[] field1337;

    @ObfuscatedName("eo.aa")
    public static short[][] field1343;

    @ObfuscatedName("em.il")
    public static long field1355;

    @ObfuscatedName("ek.df")
    public static class543 field1406;

    @ObfuscatedName("en.co")
    public static class363 field1437;

    @ObfuscatedName("en.ah")
    public static int field1439;

    @ObfuscatedName("ej.ka")
    public static class544[] field1453;

    @ObfuscatedName("ej.av")
    public static class45 field1454;

    @ObfuscatedName("et.kn")
    public static class544[] field1458;

    @ObfuscatedName("et.as")
    public static class511[] field1460;

    @ObfuscatedName("et.ev")
    public static boolean field1462;

    @ObfuscatedName("ev.ao")
    public static class69[] field1471;

    @ObfuscatedName("ev.hz")
    public static String field1472;

    @ObfuscatedName("ev.ah")
    public static Thread field1474;

    @ObfuscatedName("bk.au")
    public static String[] field148;

    @ObfuscatedName("ea.wm")
    public static class458 field1481;

    @ObfuscatedName("ey.jd")
    public static class409 field1486;

    @ObfuscatedName("ey.as")
    public static int[][][] field1487;

    @ObfuscatedName("bk.fp")
    public static class372 field150;

    @ObfuscatedName("ed.iz")
    public static int field1521;

    @ObfuscatedName("fj.wd")
    public static List field1530;

    @ObfuscatedName("fh.ur")
    public static int field1536;

    @ObfuscatedName("fs.oj")
    public static class76 field1569;

    @ObfuscatedName("fe.ac")
    public static long field1593;

    @ObfuscatedName("fe.ak")
    public static class374 field1596;

    @ObfuscatedName("fe.ag")
    public static int[] field1597;

    @ObfuscatedName("fo.us")
    public static class58 field1600;

    @ObfuscatedName("fi.we")
    public static short[] field1602;

    @ObfuscatedName("fy.tr")
    public static class39 field1626;

    @ObfuscatedName("by.nf")
    public static int field163;

    @ObfuscatedName("fb.ap")
    public static class409 field1642;

    @ObfuscatedName("by.ai")
    public static byte[][][] field165;

    @ObfuscatedName("fv.tt")
    public static class166 field1659;

    @ObfuscatedName("ff.ux")
    public static int field1664;

    @ObfuscatedName("be.ac")
    public static class374 field168;

    @ObfuscatedName("fq.jq")
    public static int[] field1689;

    @ObfuscatedName("fp.cy")
    public static int field1694;

    @ObfuscatedName("fx.go")
    public static String field1699;

    @ObfuscatedName("ge.kb")
    public static class544[] field1731;

    @ObfuscatedName("bv.py")
    public static int field174;

    @ObfuscatedName("gj.am")
    public static int[][] field1740;

    @ObfuscatedName("gl.bi")
    public static client field1743;

    @ObfuscatedName("gl.al")
    public static int field1747;

    @ObfuscatedName("gq.ao")
    public static String[] field1751;

    @ObfuscatedName("gq.ar")
    public static int field1753;

    @ObfuscatedName("gt.ut")
    public static int field1755;

    @ObfuscatedName("gf.fo")
    public static class454 field1762;

    @ObfuscatedName("gm.gw")
    public static int field1771;

    @ObfuscatedName("gb.aj")
    public static class543 field1780;

    @ObfuscatedName("gx.cc")
    public static class508 field1781;

    @ObfuscatedName("gn.tz")
    public static class43 field1804;

    @ObfuscatedName("gw.al")
    public static String field1823;

    @ObfuscatedName("gw.ac")
    public static String field1828;

    @ObfuscatedName("gw.dk")
    public static class543[] field1830;

    @ObfuscatedName("gs.gv")
    public static int field1834;

    @ObfuscatedName("gv.ax")
    public static File field1838;

    @ObfuscatedName("gv.pl")
    public static int field1842;

    @ObfuscatedName("gv.vz")
    public static int field1845;

    @ObfuscatedName("ga.al")
    public static File field1848;

    @ObfuscatedName("ga.aj")
    public static int field1849;

    @ObfuscatedName("bz.eu")
    public static class339 field185;

    @ObfuscatedName("gh.jn")
    public static int[][] field1853;

    @ObfuscatedName("gh.aj")
    public static int field1854;

    @ObfuscatedName("gh.ks")
    public static class543[] field1855;

    @ObfuscatedName("bz.rv")
    public static class112 field186;

    @ObfuscatedName("gu.ab")
    public static int field1866;

    @ObfuscatedName("gu.ag")
    public static int field1867;

    @ObfuscatedName("bz.ay")
    public static short[][] field188;

    @ObfuscatedName("hf.ti")
    public static boolean field1888;

    @ObfuscatedName("hu.kr")
    public static int field1892;

    @ObfuscatedName("hl.cl")
    public static String field1900;

    @ObfuscatedName("hm.vh")
    public static class70 field1907;

    @ObfuscatedName("hm.ac")
    public static class374 field1908;

    @ObfuscatedName("hs.ao")
    public static int field1913;

    @ObfuscatedName("hk.ag")
    public static int field1915;

    @ObfuscatedName("hk.fc")
    public static class372 field1917;

    @ObfuscatedName("hn.gg")
    public static String field1918;

    @ObfuscatedName("hn.uy")
    public static int field1923;

    @ObfuscatedName("ha.al")
    public static int field1925;

    @ObfuscatedName("ha.ac")
    public static class374 field1928;

    @ObfuscatedName("hp.al")
    public static class195[] field1933;

    @ObfuscatedName("hp.ac")
    public static class374 field1952;

    @ObfuscatedName("hg.au")
    public static int field1960;

    @ObfuscatedName("hg.ac")
    public static class374 field1962;

    @ObfuscatedName("hg.ah")
    public static class543 field1965;

    @ObfuscatedName("hz.ac")
    public static class374 field1966;

    @ObfuscatedName("hz.al")
    public static class374 field1968;

    @ObfuscatedName("hz.ko")
    public static class543[] field1977;

    @ObfuscatedName("hj.al")
    public static class374 field1980;

    @ObfuscatedName("hj.ac")
    public static class374 field1982;

    @ObfuscatedName("hj.rn")
    public static class513 field1989;

    @ObfuscatedName("hj.cp")
    public static String field1996;

    @ObfuscatedName("hc.fg")
    public static class372 field2002;

    @ObfuscatedName("hv.fe")
    public static class183 field2004;

    @ObfuscatedName("hv.ar")
    public static byte[][][] field2005;

    @ObfuscatedName("hv.fn")
    public static class372 field2010;

    @ObfuscatedName("hv.ff")
    public static class372 field2011;

    @ObfuscatedName("ht.ac")
    public static class374 field2021;

    @ObfuscatedName("ht.ke")
    public static class544[] field2022;

    @ObfuscatedName("hq.jp")
    public static byte[][] field2023;

    @ObfuscatedName("hx.ch")
    public static int field2026;

    @ObfuscatedName("hb.gj")
    public static class372 field2029;

    @ObfuscatedName("hb.jf")
    public static int[] field2036;

    @ObfuscatedName("hw.al")
    public static class374 field2045;

    @ObfuscatedName("hw.ak")
    public static class374 field2086;

    @ObfuscatedName("hr.tb")
    public static class157 field2094;

    @ObfuscatedName("ir.al")
    public static class374 field2117;

    @ObfuscatedName("ir.ac")
    public static class374 field2118;

    @ObfuscatedName("ie.ac")
    public static class374 field2131;

    @ObfuscatedName("bb.ay")
    public static int field214;

    @ObfuscatedName("is.ac")
    public static class374 field2146;

    @ObfuscatedName("ix.ac")
    public static class374 field2151;

    @ObfuscatedName("ix.kj")
    public static class544 field2156;

    @ObfuscatedName("ii.ac")
    public static class374 field2165;

    @ObfuscatedName("iw.al")
    public static class374 field2168;

    @ObfuscatedName("bb.ac")
    public static class174 field218;

    @ObfuscatedName("iw.ac")
    public static class374 field2182;

    @ObfuscatedName("iz.ak")
    public static class374 field2192;

    @ObfuscatedName("iz.al")
    public static class374 field2200;

    @ObfuscatedName("iz.gn")
    public static int field2224;

    @ObfuscatedName("bo.ul")
    public static int field225;

    @ObfuscatedName("if.ah")
    public static class374 field2316;

    @ObfuscatedName("if.ri")
    public static class470 field2317;

    @ObfuscatedName("if.ar")
    public static class374 field2318;

    @ObfuscatedName("ij.bm")
    public static class541 field2346;

    @ObfuscatedName("ij.aw")
    public static String field2351;

    @ObfuscatedName("ib.ik")
    public static SecureRandom field2364;

    @ObfuscatedName("il.am")
    public static int field2373;

    @ObfuscatedName("ih.fm")
    public static class372 field2393;

    @ObfuscatedName("ig.aw")
    public static class294 field2423;

    @ObfuscatedName("ig.dl")
    public static class543 field2426;

    @ObfuscatedName("bo.gy")
    public static String field243;

    @ObfuscatedName("ia.uc")
    public static int field2432;

    @ObfuscatedName("id.ec")
    public static class91 field2435;

    @ObfuscatedName("bo.ih")
    public static class183 field250;

    @ObfuscatedName("jd.fk")
    public static long field2500;

    @ObfuscatedName("jo.as")
    public static int[] field2515;

    @ObfuscatedName("bp.kh")
    public static class543[] field254;

    @ObfuscatedName("jr.fw")
    public static class372 field2559;

    @ObfuscatedName("jr.gk")
    public static class460 field2563;

    @ObfuscatedName("ju.wr")
    public static class490 field2584;

    @ObfuscatedName("jt.aw")
    public static int field2587;

    @ObfuscatedName("jt.ai")
    public static int field2590;

    @ObfuscatedName("jt.bd")
    public static int field2594;

    @ObfuscatedName("jt.cz")
    public static boolean[][] field2596;

    @ObfuscatedName("jt.an")
    public static int field2601;

    @ObfuscatedName("jt.au")
    public static int field2602;

    @ObfuscatedName("jt.ae")
    public static int field2604;

    @ObfuscatedName("jt.aq")
    public static int field2606;

    @ObfuscatedName("jt.az")
    public static int field2607;

    @ObfuscatedName("jt.af")
    public static int field2609;

    @ObfuscatedName("jt.ad")
    public static int field2610;

    @ObfuscatedName("jt.by")
    public static int field2613;

    @ObfuscatedName("jt.at")
    public static int field2618;

    @ObfuscatedName("jt.bk")
    public static int field2634;

    @ObfuscatedName("jt.bn")
    public static int field2642;

    @ObfuscatedName("jt.cp")
    public static int field2646;

    @ObfuscatedName("jt.cb")
    public static int field2647;

    @ObfuscatedName("jt.cn")
    public static int field2648;

    @ObfuscatedName("jt.ck")
    public static int field2649;

    @ObfuscatedName("jt.cr")
    public static int field2650;

    @ObfuscatedName("jt.cs")
    public static int field2651;

    @ObfuscatedName("jl.gi")
    public static class372 field2659;

    @ObfuscatedName("jq.nx")
    public static class94 field2696;

    @ObfuscatedName("jn.cp")
    public static int field2782;

    @ObfuscatedName("jn.cz")
    public static int field2785;

    @ObfuscatedName("jn.cb")
    public static int field2787;

    @ObfuscatedName("js.am")
    public static int field2803;

    @ObfuscatedName("js.ah")
    public static int field2808;

    @ObfuscatedName("js.ao")
    public static int field2809;

    @ObfuscatedName("js.av")
    public static int field2810;

    @ObfuscatedName("jp.ao")
    public static short[][][] field2821;

    @ObfuscatedName("km.dn")
    public static class543[] field2853;

    @ObfuscatedName("km.ao")
    public static int[] field2854;

    @ObfuscatedName("kq.wv")
    public static class385 field2872;

    @ObfuscatedName("kq.ly")
    public static int field2875;

    @ObfuscatedName("ka.cy")
    public static class389 field2910;

    @ObfuscatedName("kb.cb")
    public static int field2917;

    @ObfuscatedName("kn.ap")
    public static int[] field2922;

    @ObfuscatedName("kz.ki")
    public static int field2931;

    @ObfuscatedName("ks.cx")
    public static int field2992;

    @ObfuscatedName("kf.jk")
    public static int[] field2999;

    @ObfuscatedName("kv.lo")
    public static int field3040;

    @ObfuscatedName("bu.am")
    public static class544 field305;

    @ObfuscatedName("ku.am")
    public static int field3066;

    @ObfuscatedName("bu.ao")
    public static int field307;

    @ObfuscatedName("la.ar")
    public static int field3075;

    @ObfuscatedName("bu.tw")
    public static boolean field308;

    @ObfuscatedName("ll.id")
    public static class115 field3089;

    @ObfuscatedName("lk.ao")
    public static class374 field3108;

    @ObfuscatedName("lk.aj")
    public static class157 field3109;

    @ObfuscatedName("lt.ay")
    public static class543 field3129;

    @ObfuscatedName("lt.mv")
    public static class251 field3130;

    @ObfuscatedName("le.ah")
    public static boolean field3131;

    @ObfuscatedName("le.ay")
    public static class347 field3132;

    @ObfuscatedName("bh.fb")
    public static class372 field321;

    @ObfuscatedName("bh.up")
    public static int field324;

    @ObfuscatedName("bh.wh")
    public static int field325;

    @ObfuscatedName("bh.cu")
    public static class362 field326;

    @ObfuscatedName("bl.jo")
    public static class409 field330;

    @ObfuscatedName("bl.ab")
    public static ThreadPoolExecutor field334;

    @ObfuscatedName("ma.gq")
    public static class372 field3397;

    @ObfuscatedName("mj.ag")
    public static class185 field3401;

    @ObfuscatedName("mm.al")
    public static long field3406;

    @ObfuscatedName("mw.wo")
    public static int field3414;

    @ObfuscatedName("mw.ah")
    public static class374 field3415;

    @ObfuscatedName("mw.fx")
    public static class372 field3416;

    @ObfuscatedName("mx.da")
    public static boolean field3428;

    @ObfuscatedName("mr.al")
    public static class374 field3430;

    @ObfuscatedName("mr.ak")
    public static class374 field3433;

    @ObfuscatedName("bj.kz")
    public static class544[] field344;

    @ObfuscatedName("mr.ac")
    public static class374 field3440;

    @ObfuscatedName("mr.gt")
    public static class372 field3443;

    @ObfuscatedName("mr.ba")
    public static Image field3444;

    @ObfuscatedName("ml.ax")
    public static int[] field3506;

    @ObfuscatedName("mn.ar")
    public static int field3511;

    @ObfuscatedName("mp.tv")
    public static class544 field3560;

    @ObfuscatedName("md.wl")
    public static class376 field3570;

    @ObfuscatedName("mo.ap")
    public static short[] field3573;

    @ObfuscatedName("nv.aw")
    public static int field3598;

    @ObfuscatedName("av.qo")
    public static class347[] field36;

    @ObfuscatedName("nd.of")
    public static int field3603;

    @ObfuscatedName("ni.ag")
    public static short[] field3616;

    @ObfuscatedName("nb.js")
    public static byte[][] field3660;

    @ObfuscatedName("cu.ry")
    public static class513 field380;

    @ObfuscatedName("nk.ac")
    public static class349 field3836;

    @ObfuscatedName("nk.ar")
    public static class374 field3838;

    @ObfuscatedName("nn.ft")
    public static class372 field3840;

    @ObfuscatedName("nw.ab")
    public static ScheduledExecutorService field3846;

    @ObfuscatedName("nw.jc")
    public static class499 field3847;

    @ObfuscatedName("ny.kg")
    public static int field3857;

    @ObfuscatedName("nl.gl")
    public static class372 field3882;

    @ObfuscatedName("nr.th")
    public static class444 field3897;

    @ObfuscatedName("nr.ge")
    public static class372 field3899;

    @ObfuscatedName("nf.gr")
    public static int field3927;

    @ObfuscatedName("cw.at")
    public static float[] field393;

    @ObfuscatedName("cw.bk")
    public static int[] field394;

    @ObfuscatedName("oh.ab")
    public static class543 field3942;

    @ObfuscatedName("of.jt")
    public static int field3944;

    @ObfuscatedName("of.la")
    public static int field3946;

    @ObfuscatedName("cw.ab")
    public static int field395;

    @ObfuscatedName("cw.as")
    public static int[] field396;

    @ObfuscatedName("cw.av")
    public static class53[] field397;

    @ObfuscatedName("cw.ag")
    public static class42[] field398;

    @ObfuscatedName("cw.aa")
    public static class47[] field399;

    @ObfuscatedName("cw.ap")
    public static class51[] field400;

    @ObfuscatedName("cw.ay")
    public static boolean[] field401;

    @ObfuscatedName("cw.aq")
    public static float[] field402;

    @ObfuscatedName("cw.am")
    public static int field407;

    @ObfuscatedName("cw.az")
    public static float[] field410;

    @ObfuscatedName("cw.af")
    public static float[] field412;

    @ObfuscatedName("cw.ad")
    public static float[] field413;

    @ObfuscatedName("cw.bn")
    public static float[] field414;

    @ObfuscatedName("cw.by")
    public static int[] field415;

    @ObfuscatedName("oe.fu")
    public static class372 field4292;

    @ObfuscatedName("ou.de")
    public static class543 field4319;

    @ObfuscatedName("ou.ab")
    public static int[] field4323;

    @ObfuscatedName("oc.bl")
    public static GarbageCollectorMXBean field4373;

    @ObfuscatedName("oz.oi")
    public static class347 field4375;

    @ObfuscatedName("oz.aq")
    public static String field4378;

    @ObfuscatedName("cq.ab")
    public static float field438;

    @ObfuscatedName("op.az")
    public static int field4388;

    @ObfuscatedName("cq.am")
    public static int field439;

    @ObfuscatedName("od.qt")
    public static int field4390;

    @ObfuscatedName("ow.am")
    public static int[] field4409;

    @ObfuscatedName("oa.oq")
    public static int field4426;

    @ObfuscatedName("cy.ah")
    public static int[] field443;

    @ObfuscatedName("oa.fr")
    public static class372 field4436;

    @ObfuscatedName("cy.af")
    public static int[] field445;

    @ObfuscatedName("px.ak")
    public static int field4490;

    @ObfuscatedName("pq.kl")
    public static class544 field4491;

    @ObfuscatedName("cy.cz")
    public static String field451;

    @ObfuscatedName("pe.wf")
    public static long field4527;

    @ObfuscatedName("cy.wn")
    public static class375 field453;

    @ObfuscatedName("pk.ag")
    public static class543[] field4539;

    @ObfuscatedName("cy.hp")
    public static String field454;

    @ObfuscatedName("pi.am")
    public static byte[][] field4559;

    @ObfuscatedName("qi.as")
    public static class347 field4562;

    @ObfuscatedName("qm.fq")
    public static class372 field4578;

    @ObfuscatedName("qj.au")
    public static int[] field4591;

    @ObfuscatedName("qo.an")
    public static int[] field4598;

    @ObfuscatedName("qf.lw")
    public static int field4640;

    @ObfuscatedName("qv.wj")
    public static class498 field4641;

    @ObfuscatedName("rt.an")
    public static String[] field4676;

    @ObfuscatedName("rl.qj")
    public static int field4688;

    @ObfuscatedName("rv.ar")
    public static boolean[] field4700;

    @ObfuscatedName("rv.uj")
    public static int field4702;

    @ObfuscatedName("ra.vd")
    public static int field4719;

    @ObfuscatedName("rc.uv")
    public static int field4723;

    @ObfuscatedName("rf.ac")
    public static Applet field4769;

    @ObfuscatedName("ro.oh")
    public static int field4772;

    @ObfuscatedName("rd.ak")
    public static int field4775;

    @ObfuscatedName("rd.al")
    public static int field4777;

    @ObfuscatedName("rb.ax")
    public static int field4782;

    @ObfuscatedName("rb.ak")
    public static int field4785;

    @ObfuscatedName("rb.ui")
    public static int field4789;

    @ObfuscatedName("rg.gh")
    public static String field4805;

    @ObfuscatedName("sr.fa")
    public static class372 field4813;

    @ObfuscatedName("sa.wb")
    public static Iterator field4837;

    @ObfuscatedName("sa.bq")
    public static class461 field4846;

    @ObfuscatedName("ag.qq")
    public static int field49;

    @ObfuscatedName("so.aq")
    public static int field4908;

    @ObfuscatedName("sp.ra")
    public static class177 field4916;

    @ObfuscatedName("ck.ow")
    public static class347 field493;

    @ObfuscatedName("tw.ao")
    public static File field5006;

    @ObfuscatedName("tw.ak")
    public static int field5007;

    @ObfuscatedName("cr.bw")
    public static class461 field505;

    @ObfuscatedName("tj.ap")
    public static class543 field5078;

    @ObfuscatedName("uz.ac")
    public static class374 field5081;

    @ObfuscatedName("cs.gc")
    public static int field509;

    @ObfuscatedName("ug.ac")
    public static class374 field5091;

    @ObfuscatedName("cm.fv")
    public static class372 field516;

    @ObfuscatedName("cm.va")
    public static int field517;

    @ObfuscatedName("uh.as")
    public static class543 field5199;

    @ObfuscatedName("uc.af")
    public static int field5207;

    @ObfuscatedName("uc.ad")
    public static int field5209;

    @ObfuscatedName("uc.bn")
    public static float[] field5210;

    @ObfuscatedName("uc.at")
    public static int[] field5211;

    @ObfuscatedName("ue.an")
    public static class100 field5246;

    @ObfuscatedName("ue.ar")
    public static int[] field5247;

    @ObfuscatedName("ue.ac")
    public static int field5248;

    @ObfuscatedName("ve.ak")
    public static int field5294;

    @ObfuscatedName("ve.ax")
    public static int field5295;

    @ObfuscatedName("ve.al")
    public static String field5297;

    @ObfuscatedName("ag.jz")
    public static class245 field53;

    @ObfuscatedName("aa.iq")
    public static class454 field60;

    @ObfuscatedName("ay.ga")
    public static int field69;

    @ObfuscatedName("as.vb")
    public static int field77;

    @ObfuscatedName("as.bk")
    public static Font field79;

    @ObfuscatedName("as.by")
    public static FontMetrics field80;

    @ObfuscatedName("as.jw")
    public static class409 field81;

    @ObfuscatedName("client.kd")
    public static int field824;

    @ObfuscatedName("aj.al")
    public static class16 field83;

    @ObfuscatedName("cv.ax")
    public static short[][][] field842;

    @ObfuscatedName("an.ap")
    public static class52 field85;

    @ObfuscatedName("cx.ax")
    public static int[] field872;

    @ObfuscatedName("cx.am")
    public static int field876;

    @ObfuscatedName("cx.an")
    public static class166 field877;

    @ObfuscatedName("ch.bt")
    public static String field889;

    @ObfuscatedName("ch.aa")
    public static int field891;

    @ObfuscatedName("an.bi")
    public static String field92;

    @ObfuscatedName("ca.ar")
    public static class543 field930;

    @ObfuscatedName("ca.ag")
    public static class543 field932;

    @ObfuscatedName("ca.aa")
    public static class543[] field933;

    @ObfuscatedName("au.ku")
    public static int field94;

    @ObfuscatedName("ca.ao")
    public static class543 field942;

    @ObfuscatedName("ca.al")
    public static boolean field945;

    @ObfuscatedName("ca.ax")
    public static class543[] field949;

    @ObfuscatedName("ca.av")
    public static class544 field951;

    @ObfuscatedName("dm.ah")
    public static byte[][][] field998;

    @ObfuscatedName("hz.al(II)I")
    public static int method3398(int arg0) {
        return arg0 >> 11 & 0x3F;
    }

    @ObfuscatedName("oa.ac(I)V")
    public static void method6501() {
        class192.field1922.method5288();
    }

    @ObfuscatedName("cg.ac(Lom;I)V")
    public static void method1062(class374 arg0) {
        field1908 = arg0;
    }

    @ObfuscatedName("mc.ac([Ljava/lang/CharSequence;III)Ljava/lang/String;")
    public static String method5347(CharSequence[] arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            CharSequence var3 = arg0[arg1];
            return var3 == null ? "null" : var3.toString();
        } else {
            int var4 = arg1 + arg2;
            int var5 = 0;
            for (int var6 = arg1; var6 < var4; var6++) {
                CharSequence var7 = arg0[var6];
                if (var7 == null) {
                    var5 += 4;
                } else {
                    var5 += var7.length();
                }
            }
            StringBuilder var8 = new StringBuilder(var5);
            for (int var9 = arg1; var9 < var4; var9++) {
                CharSequence var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @ObfuscatedName("dl.ac(IIB)I")
    public static int method2228(int arg0, int arg1) {
        class222 var2 = method12(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field2310 >= 0) {
            int var3 = class287.method4492(var2.field2309, var2.field2302, var2.field2311);
            byte var4 = 96;
            int var5;
            if (var3 == -2) {
                var5 = 12345678;
            } else if (var3 == -1) {
                if (var4 < 0) {
                    var4 = 0;
                } else if (var4 > 127) {
                    var4 = 127;
                }
                int var6 = 127 - var4;
                var5 = var6;
            } else {
                int var7 = (var3 & 0x7F) * var4 / 128;
                if (var7 < 2) {
                    var7 = 2;
                } else if (var7 > 126) {
                    var7 = 126;
                }
                var5 = (var3 & 0xFF80) + var7;
            }
            return class241.field2555[var5] | 0xFF000000;
        } else if (var2.field2305 >= 0) {
            int var9 = class241.field2551.field2837.method4497(var2.field2305);
            byte var10 = 96;
            int var11;
            if (var9 == -2) {
                var11 = 12345678;
            } else if (var9 == -1) {
                if (var10 < 0) {
                    var10 = 0;
                } else if (var10 > 127) {
                    var10 = 127;
                }
                int var12 = 127 - var10;
                var11 = var12;
            } else {
                int var13 = (var9 & 0x7F) * var10 / 128;
                if (var13 < 2) {
                    var13 = 2;
                } else if (var13 > 126) {
                    var13 = 126;
                }
                var11 = (var9 & 0xFF80) + var13;
            }
            return class241.field2555[var11] | 0xFF000000;
        } else if (var2.field2301 == 16711935) {
            return arg1;
        } else {
            int var15 = class287.method4492(var2.field2306, var2.field2312, var2.field2308);
            byte var16 = 96;
            int var17;
            if (var15 == -2) {
                var17 = 12345678;
            } else if (var15 == -1) {
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 127) {
                    var16 = 127;
                }
                int var18 = 127 - var16;
                var17 = var18;
            } else {
                int var19 = (var15 & 0x7F) * var16 / 128;
                if (var19 < 2) {
                    var19 = 2;
                } else if (var19 > 126) {
                    var19 = 126;
                }
                var17 = (var15 & 0xFF80) + var19;
            }
            return class241.field2555[var17] | 0xFF000000;
        }
    }

    @ObfuscatedName("fb.ac(Lom;I)V")
    public static void method2970(class374 arg0) {
        field2165 = arg0;
    }

    @ObfuscatedName("ao.al(II)Lio;")
    public static class222 method12(int arg0) {
        class222 var1 = (class222) class222.field2303.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field168.method6342(4, arg0);
        class222 var3 = new class222();
        if (var2 != null) {
            var3.method3839(new class530(var2), arg0);
        }
        var3.method3822();
        class222.field2303.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("dj.al(IIII)I")
    public static int method2298(int arg0, int arg1, int arg2) {
        return arg0 << 28 | arg1 << 14 | arg2;
    }

    @ObfuscatedName("qy.ak(Ljava/lang/CharSequence;Lte;I)Ljava/lang/String;")
    public static String method7156(CharSequence arg0, class508 arg1) {
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var2 < var3 && class509.method304(arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class509.method304(arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 >= 1) {
            byte var6;
            if (arg1 == null) {
                var6 = 12;
            } else {
                switch(arg1.field5037) {
                    case 8:
                        var6 = 20;
                        break;
                    default:
                        var6 = 12;
                }
            }
            if (var4 <= var6) {
                StringBuilder var7 = new StringBuilder(var4);
                for (int var8 = var2; var8 < var3; var8++) {
                    char var9 = arg0.charAt(var8);
                    if (class509.method6940(var9)) {
                        char var10;
                        switch(var9) {
                            case ' ':
                            case '-':
                            case '_':
                            case ' ':
                                var10 = '_';
                                break;
                            case '#':
                            case '[':
                            case ']':
                                var10 = var9;
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
                                var10 = 'a';
                                break;
                            case 'Ç':
                            case 'ç':
                                var10 = 'c';
                                break;
                            case 'È':
                            case 'É':
                            case 'Ê':
                            case 'Ë':
                            case 'è':
                            case 'é':
                            case 'ê':
                            case 'ë':
                                var10 = 'e';
                                break;
                            case 'Í':
                            case 'Î':
                            case 'Ï':
                            case 'í':
                            case 'î':
                            case 'ï':
                                var10 = 'i';
                                break;
                            case 'Ñ':
                            case 'ñ':
                                var10 = 'n';
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
                                var10 = 'o';
                                break;
                            case 'Ù':
                            case 'Ú':
                            case 'Û':
                            case 'Ü':
                            case 'ù':
                            case 'ú':
                            case 'û':
                            case 'ü':
                                var10 = 'u';
                                break;
                            case 'ß':
                                var10 = 'b';
                                break;
                            case 'ÿ':
                            case 'Ÿ':
                                var10 = 'y';
                                break;
                            default:
                                var10 = Character.toLowerCase(var9);
                        }
                        if (var10 != 0) {
                            var7.append(var10);
                        }
                    }
                }
                if (var7.length() == 0) {
                    return null;
                }
                return var7.toString();
            }
        }
        return null;
    }

    @ObfuscatedName("gu.ac(Luy;I)V")
    public static final void method3277(class529 arg0) {
        arg0.method8312();
        int var1 = client.field646;
        class94 var2 = field2696 = client.field726[var1] = new class94();
        var2.field1132 = var1;
        int var3 = arg0.method8327(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1258[0] = var5 - field108;
        var2.field1227 = (var2.field1258[0] << 7) + (var2.method2261() << 6);
        var2.field1259[0] = var6 - field103;
        var2.field1187 = (var2.field1259[0] << 7) + (var2.method2261() << 6);
        field1072 = var2.field1140 = var4;
        if (class110.field1374[var1] != null) {
            var2.method2251(class110.field1374[var1]);
        }
        class110.field1375 = 0;
        class110.field1376[++class110.field1375 - 1] = var1;
        class110.field1378[var1] = 0;
        class110.field1377 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method8327(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                class110.field1379[var7] = (var9 << 28) + (var10 << 14) + var11;
                class110.field1380[var7] = 0;
                class110.field1381[var7] = -1;
                class110.field1383[++class110.field1377 - 1] = var7;
                class110.field1378[var7] = 0;
            }
        }
        arg0.method8338();
    }

    @ObfuscatedName("gt.ak([Ljava/lang/String;[IIIS)V")
    public static void method3098(String[] arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 >= arg3) {
            return;
        }
        int var4 = (arg2 + arg3) / 2;
        int var5 = arg2;
        String var6 = arg0[var4];
        arg0[var4] = arg0[arg3];
        arg0[arg3] = var6;
        int var7 = arg1[var4];
        arg1[var4] = arg1[arg3];
        arg1[arg3] = var7;
        for (int var8 = arg2; var8 < arg3; var8++) {
            if (var6 == null || arg0[var8] != null && arg0[var8].compareTo(var6) < (var8 & 0x1)) {
                String var9 = arg0[var8];
                arg0[var8] = arg0[var5];
                arg0[var5] = var9;
                int var10 = arg1[var8];
                arg1[var8] = arg1[var5];
                arg1[var5++] = var10;
            }
        }
        arg0[arg3] = arg0[var5];
        arg0[var5] = var6;
        arg1[arg3] = arg1[var5];
        arg1[var5] = var7;
        method3098(arg0, arg1, arg2, var5 - 1);
        method3098(arg0, arg1, var5 + 1, arg3);
    }

    @ObfuscatedName("eq.ar(II)I")
    public static int method2735(int arg0) {
        class66 var1 = (class66) class113.field1418.method8070((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (class113.field1414.field4470 == var1.field4850) {
            return -1;
        } else {
            return ((class66) var1.field4850).field503;
        }
    }

    @ObfuscatedName("ig.ao(Ljava/lang/CharSequence;IZI)I")
    public static int method3988(CharSequence arg0, int arg1, boolean arg2) {
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("" + arg1);
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        int var6 = arg0.length();
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(var7);
            if (var7 == 0) {
                if (var8 == '-') {
                    var3 = true;
                    continue;
                }
                if (var8 == '+' && arg2) {
                    continue;
                }
            }
            int var10;
            if (var8 >= '0' && var8 <= '9') {
                var10 = var8 - '0';
            } else if (var8 >= 'A' && var8 <= 'Z') {
                var10 = var8 - '7';
            } else if (var8 >= 'a' && var8 <= 'z') {
                var10 = var8 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var10 >= arg1) {
                throw new NumberFormatException();
            }
            if (var3) {
                var10 = -var10;
            }
            int var9 = arg1 * var5 + var10;
            if (var9 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var5 = var9;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @ObfuscatedName("do.al(II)Liz;")
    public static class220 method2243(int arg0) {
        class220 var1 = (class220) class220.field2193.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2200.method6342(6, arg0);
        class220 var3 = new class220();
        var3.field2198 = arg0;
        if (var2 != null) {
            var3.method3688(new class530(var2));
        }
        var3.method3687();
        if (var3.field2230) {
            var3.field2208 = 0;
            var3.field2234 = false;
        }
        class220.field2193.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gg.ab(II)Lfl;")
    public static class135 method3271(int arg0) {
        class135[] var1 = new class135[] { class135.field1592, class135.field1574, class135.field1575, class135.field1576, class135.field1577, class135.field1578, class135.field1579, class135.field1588, class135.field1581, class135.field1582, class135.field1584, class135.field1590, class135.field1585, class135.field1586, class135.field1587, class135.field1583, class135.field1580 };
        class135 var2 = (class135) class388.method3894(var1, arg0);
        if (var2 == null) {
            var2 = class135.field1592;
        }
        return var2;
    }

    @ObfuscatedName("dw.av(Ljava/lang/String;B)V")
    public static final void method2305(String arg0) {
        class70.method7214(arg0 + class367.field4257);
    }

    @ObfuscatedName("eo.ar(Lul;IIIIIIB)V")
    public static final void method2592(class530 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = arg1 >= 0 && arg1 < 4 && arg2 >= 0 && arg2 < 104 && arg3 >= 0 && arg3 < 104;
        if (!var7) {
            while (true) {
                int var10 = arg0.method8598();
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg0.method8365();
                    break;
                }
                if (var10 <= 49) {
                    arg0.method8368();
                }
            }
            return;
        }
        class84.field1032[arg1][arg2][arg3] = 0;
        while (true) {
            int var8 = arg0.method8598();
            if (var8 == 0) {
                if (arg1 == 0) {
                    class84.field1042[0][arg2][arg3] = -class84.method8630(arg4 + 932731, arg5 + 556238) * 8;
                } else {
                    class84.field1042[arg1][arg2][arg3] = class84.field1042[arg1 - 1][arg2][arg3] - 240;
                }
                break;
            }
            if (var8 == 1) {
                int var9 = arg0.method8365();
                if (var9 == 1) {
                    var9 = 0;
                }
                if (arg1 == 0) {
                    class84.field1042[0][arg2][arg3] = -var9 * 8;
                } else {
                    class84.field1042[arg1][arg2][arg3] = class84.field1042[arg1 - 1][arg2][arg3] - var9 * 8;
                }
                break;
            }
            if (var8 <= 49) {
                field2821[arg1][arg2][arg3] = (short) arg0.method8368();
                field998[arg1][arg2][arg3] = (byte) ((var8 - 2) / 4);
                field2005[arg1][arg2][arg3] = (byte) (var8 - 2 + arg6 & 0x3);
            } else if (var8 <= 81) {
                class84.field1032[arg1][arg2][arg3] = (byte) (var8 - 49);
            } else {
                field842[arg1][arg2][arg3] = (short) (var8 - 81);
            }
        }
    }

    @ObfuscatedName("ih.ag(B)Z")
    public static boolean method3968() {
        boolean var0 = false;
        boolean var1 = false;
        if (!class320.field3436.isEmpty()) {
            class422 var2 = (class422) class320.field3436.get(0);
            if (var2 == null) {
                class320.field3436.remove(0);
            } else if (var2.method7059()) {
                if (var2.method7069()) {
                    System.out.println("Error in midimanager.service: " + var2.method7071());
                    var0 = true;
                } else {
                    if (var2.method7072() != null) {
                        class320.field3436.add(1, var2.method7072());
                    }
                    var1 = var2.method7070();
                }
                class320.field3436.remove(0);
            } else {
                var1 = var2.method7070();
            }
        }
        if (var0) {
            class320.field3436.clear();
            class320.method2018();
        }
        return var1;
    }

    @ObfuscatedName("ff.ai(Ljava/lang/String;IB)V")
    public static final void method2994(String arg0, int arg1) {
        class311 var2 = class311.method2978(class309.field3136, client.field579.field1425);
        var2.field3250.method8348(class530.method7740(arg0) + 1);
        var2.field3250.method8374(arg0);
        var2.field3250.method8396(arg1);
        client.field579.method2682(var2);
    }

    @ObfuscatedName("pn.ag(B)V")
    public static void method6787() {
        field3506 = null;
        field2854 = null;
        field443 = null;
        field5247 = null;
        field4323 = null;
        field4559 = (byte[][]) null;
    }

    @ObfuscatedName("gd.ao(ILds;ZB)I")
    public static int method3137(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 100) {
            field876 -= 3;
            int var3 = class72.field875[field876];
            int var4 = class72.field875[field876 + 1];
            int var5 = class72.field875[field876 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class347 var6 = field185.method5639(var3);
            if (var6.field3815 == null) {
                var6.field3815 = new class347[var5 + 1];
            }
            if (var6.field3815.length <= var5) {
                class347[] var7 = new class347[var5 + 1];
                for (int var8 = 0; var8 < var6.field3815.length; var8++) {
                    var7[var8] = var6.field3815[var8];
                }
                var6.field3815 = var7;
            }
            if (var5 > 0 && var6.field3815[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class347 var9 = new class347();
            var9.field3679 = var4;
            var9.field3696 = var9.field3676 = var6.field3676;
            var9.field3757 = var5;
            var9.field3675 = true;
            if (var4 == 12) {
                var9.method6020();
                var9.method6013().method5748(new class108(var9));
                var9.method6013().method5749(new class109(var9));
            }
            var6.field3815[var5] = var9;
            if (arg2) {
                field4562 = var9;
            } else {
                field3132 = var9;
            }
            client.method2979(var6);
            return 1;
        } else if (arg0 == 101) {
            class347 var10 = arg2 ? field4562 : field3132;
            class347 var11 = field185.method5639(var10.field3676);
            var11.field3815[var10.field3757] = null;
            client.method2979(var11);
            return 1;
        } else if (arg0 == 102) {
            class347 var12 = field185.method5639(class72.field875[--field876]);
            var12.field3815 = null;
            client.method2979(var12);
            return 1;
        } else if (arg0 == 200) {
            field876 -= 2;
            int var13 = class72.field875[field876];
            int var14 = class72.field875[field876 + 1];
            class347 var15 = field185.method5640(var13, var14);
            if (var15 == null || var14 == -1) {
                class72.field875[++field876 - 1] = 0;
            } else {
                class72.field875[++field876 - 1] = 1;
                if (arg2) {
                    field4562 = var15;
                } else {
                    field3132 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class347 var16 = field185.method5639(class72.field875[--field876]);
            if (var16 == null) {
                class72.field875[++field876 - 1] = 0;
            } else {
                class72.field875[++field876 - 1] = 1;
                if (arg2) {
                    field4562 = var16;
                } else {
                    field3132 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("el.ba(Liz;I)Z")
    public static boolean method2601(class220 arg0) {
        if (arg0.field2232 != null) {
            int[] var1 = arg0.field2232;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class220 var4 = method2243(var3);
                if (var4.field2219 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2219 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("qy.as(IIII)I")
    public static final int method7153(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = class84.method2045(var3, var5);
        int var8 = class84.method2045(var3 + 1, var5);
        int var9 = class84.method2045(var3, var5 + 1);
        int var10 = class84.method2045(var3 + 1, var5 + 1);
        int var11 = 65536 - class241.field2554[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class241.field2554[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class241.field2554[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("dp.aw(IIIIIIIILjt;Lih;I)V")
    public static final void method2233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class245 arg8, class228 arg9) {
        class220 var10 = method2243(arg4);
        int var11 = arg7 >= 0 ? arg7 : var10.field2214;
        int var12;
        int var13;
        if (arg5 == 1 || arg5 == 3) {
            var12 = var10.field2207;
            var13 = var10.field2206;
        } else {
            var12 = var10.field2206;
            var13 = var10.field2207;
        }
        int var14;
        int var15;
        if (arg2 + var12 <= 104) {
            var14 = (var12 >> 1) + arg2;
            var15 = (var12 + 1 >> 1) + arg2;
        } else {
            var14 = arg2;
            var15 = arg2 + 1;
        }
        int var16;
        int var17;
        if (arg3 + var13 <= 104) {
            var16 = (var13 >> 1) + arg3;
            var17 = (var13 + 1 >> 1) + arg3;
        } else {
            var16 = arg3;
            var17 = arg3 + 1;
        }
        int[][] var18 = class84.field1042[arg1];
        int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int var20 = (arg2 << 7) + (var12 << 6);
        int var21 = (arg3 << 7) + (var13 << 6);
        long var22 = class255.method6416(arg2, arg3, 2, var10.field2210 == 0, arg4);
        int var24 = (arg5 << 6) + arg6;
        if (var10.field2231 == 1) {
            var24 += 256;
        }
        if (arg6 == 22) {
            class247 var25;
            if (var11 == -1 && var10.field2232 == null) {
                var25 = var10.method3693(22, arg5, var18, var20, var19, var21);
            } else {
                var25 = new class82(arg4, 22, arg5, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
            }
            arg8.method4300(arg0, arg2, arg3, var19, var25, var22, var24);
            if (var10.field2208 == 1) {
                arg9.method3947(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class247 var51;
            if (var11 == -1 && var10.field2232 == null) {
                var51 = var10.method3693(10, arg5, var18, var20, var19, var21);
            } else {
                var51 = new class82(arg4, 10, arg5, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
            }
            if (var51 != null) {
                arg8.method4351(arg0, arg2, arg3, var19, var12, var13, var51, arg6 == 11 ? 256 : 0, var22, var24);
            }
            if (var10.field2208 != 0) {
                arg9.method3945(arg2, arg3, var12, var13, var10.field2234);
            }
        } else if (arg6 >= 12) {
            class247 var26;
            if (var11 == -1 && var10.field2232 == null) {
                var26 = var10.method3693(arg6, arg5, var18, var20, var19, var21);
            } else {
                var26 = new class82(arg4, arg6, arg5, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
            }
            arg8.method4351(arg0, arg2, arg3, var19, 1, 1, var26, 0, var22, var24);
            if (var10.field2208 != 0) {
                arg9.method3945(arg2, arg3, var12, var13, var10.field2234);
            }
        } else if (arg6 == 0) {
            class247 var27;
            if (var11 == -1 && var10.field2232 == null) {
                var27 = var10.method3693(0, arg5, var18, var20, var19, var21);
            } else {
                var27 = new class82(arg4, 0, arg5, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
            }
            arg8.method4302(arg0, arg2, arg3, var19, var27, (class247) null, class84.field1037[arg5], 0, var22, var24);
            if (var10.field2208 != 0) {
                arg9.method3974(arg2, arg3, arg6, arg5, var10.field2234);
            }
        } else if (arg6 == 1) {
            class247 var28;
            if (var11 == -1 && var10.field2232 == null) {
                var28 = var10.method3693(1, arg5, var18, var20, var19, var21);
            } else {
                var28 = new class82(arg4, 1, arg5, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
            }
            arg8.method4302(arg0, arg2, arg3, var19, var28, (class247) null, class84.field1038[arg5], 0, var22, var24);
            if (var10.field2208 != 0) {
                arg9.method3974(arg2, arg3, arg6, arg5, var10.field2234);
            }
        } else if (arg6 == 2) {
            int var29 = arg5 + 1 & 0x3;
            class247 var30;
            class247 var31;
            if (var11 == -1 && var10.field2232 == null) {
                var30 = var10.method3693(2, arg5 + 4, var18, var20, var19, var21);
                var31 = var10.method3693(2, var29, var18, var20, var19, var21);
            } else {
                var30 = new class82(arg4, 2, arg5 + 4, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
                var31 = new class82(arg4, 2, var29, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
            }
            arg8.method4302(arg0, arg2, arg3, var19, var30, var31, class84.field1037[arg5], class84.field1037[var29], var22, var24);
            if (var10.field2208 != 0) {
                arg9.method3974(arg2, arg3, arg6, arg5, var10.field2234);
            }
        } else if (arg6 == 3) {
            class247 var32;
            if (var11 == -1 && var10.field2232 == null) {
                var32 = var10.method3693(3, arg5, var18, var20, var19, var21);
            } else {
                var32 = new class82(arg4, 3, arg5, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
            }
            arg8.method4302(arg0, arg2, arg3, var19, var32, (class247) null, class84.field1038[arg5], 0, var22, var24);
            if (var10.field2208 != 0) {
                arg9.method3974(arg2, arg3, arg6, arg5, var10.field2234);
            }
        } else if (arg6 == 9) {
            class247 var33;
            if (var11 == -1 && var10.field2232 == null) {
                var33 = var10.method3693(arg6, arg5, var18, var20, var19, var21);
            } else {
                var33 = new class82(arg4, arg6, arg5, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
            }
            arg8.method4351(arg0, arg2, arg3, var19, 1, 1, var33, 0, var22, var24);
            if (var10.field2208 != 0) {
                arg9.method3945(arg2, arg3, var12, var13, var10.field2234);
            }
        } else if (arg6 == 4) {
            class247 var34;
            if (var11 == -1 && var10.field2232 == null) {
                var34 = var10.method3693(4, arg5, var18, var20, var19, var21);
            } else {
                var34 = new class82(arg4, 4, arg5, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
            }
            arg8.method4303(arg0, arg2, arg3, var19, var34, (class247) null, class84.field1037[arg5], 0, 0, 0, var22, var24);
        } else if (arg6 == 5) {
            int var35 = 16;
            long var36 = arg8.method4332(arg0, arg2, arg3);
            if (var36 != 0L) {
                var35 = method2243(class255.method2100(var36)).field2215;
            }
            class247 var38;
            if (var11 == -1 && var10.field2232 == null) {
                var38 = var10.method3693(4, arg5, var18, var20, var19, var21);
            } else {
                var38 = new class82(arg4, 4, arg5, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
            }
            arg8.method4303(arg0, arg2, arg3, var19, var38, (class247) null, class84.field1037[arg5], 0, class84.field1039[arg5] * var35, class84.field1034[arg5] * var35, var22, var24);
        } else if (arg6 == 6) {
            int var39 = 8;
            long var40 = arg8.method4332(arg0, arg2, arg3);
            if (var40 != 0L) {
                var39 = method2243(class255.method2100(var40)).field2215 / 2;
            }
            class247 var42;
            if (var11 == -1 && var10.field2232 == null) {
                var42 = var10.method3693(4, arg5 + 4, var18, var20, var19, var21);
            } else {
                var42 = new class82(arg4, 4, arg5 + 4, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
            }
            arg8.method4303(arg0, arg2, arg3, var19, var42, (class247) null, 256, arg5, class84.field1041[arg5] * var39, class84.field1043[arg5] * var39, var22, var24);
        } else if (arg6 == 7) {
            int var43 = arg5 + 2 & 0x3;
            class247 var44;
            if (var11 == -1 && var10.field2232 == null) {
                var44 = var10.method3693(4, var43 + 4, var18, var20, var19, var21);
            } else {
                var44 = new class82(arg4, 4, var43 + 4, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
            }
            arg8.method4303(arg0, arg2, arg3, var19, var44, (class247) null, 256, var43, 0, 0, var22, var24);
        } else if (arg6 == 8) {
            int var45 = 8;
            long var46 = arg8.method4332(arg0, arg2, arg3);
            if (var46 != 0L) {
                var45 = method2243(class255.method2100(var46)).field2215 / 2;
            }
            int var48 = arg5 + 2 & 0x3;
            class247 var49;
            class247 var50;
            if (var11 == -1 && var10.field2232 == null) {
                var49 = var10.method3693(4, arg5 + 4, var18, var20, var19, var21);
                var50 = var10.method3693(4, var48 + 4, var18, var20, var19, var21);
            } else {
                var49 = new class82(arg4, 4, arg5 + 4, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
                var50 = new class82(arg4, 4, var48 + 4, arg1, arg2, arg3, var11, var10.field2240, (class247) null);
            }
            arg8.method4303(arg0, arg2, arg3, var19, var49, var50, 256, arg5, class84.field1041[arg5] * var45, class84.field1043[arg5] * var45, var22, var24);
        }
    }

    @ObfuscatedName("kw.hy(I)V")
    public static void method5132() {
        field4491 = null;
        field2156 = null;
        field1977 = null;
        field1453 = null;
        field1731 = null;
        field1458 = null;
        field344 = null;
        field2022 = null;
        field1337 = null;
        field254 = null;
        field1855 = null;
    }

    @ObfuscatedName("ln.at(ILds;ZI)I")
    public static int method5306(int arg0, class81 arg1, boolean arg2) {
        class347 var3 = field185.method5639(class72.field875[--field876]);
        if (arg0 == 2800) {
            class72.field875[++field876 - 1] = method3398(client.method2234(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = class72.field875[--field876];
            int var5 = var4 - 1;
            if (var3.field3759 == null || var5 >= var3.field3759.length || var3.field3759[var5] == null) {
                class72.field886[++field1867 - 1] = "";
            } else {
                class72.field886[++field1867 - 1] = var3.field3759[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3717 == null) {
                class72.field886[++field1867 - 1] = "";
            } else {
                class72.field886[++field1867 - 1] = var3.field3717;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ma.ho(I)V")
    public static final void method5332() {
        if (field1804 != null) {
            field1804.method769();
        }
    }

    @ObfuscatedName("cd.hr(I)V")
    public static final void method2015() {
        for (int var0 = 0; var0 < client.field645; var0++) {
            int var10002 = client.field601[var0]--;
            if (client.field601[var0] >= -10) {
                class40 var2 = client.field778[var0];
                if (var2 == null) {
                    class40 var10000 = (class40) null;
                    var2 = class40.method739(field4813, client.field813[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    client.field601[var0] += var2.method732();
                    client.field778[var0] = var2;
                }
                if (client.field601[var0] < 0) {
                    int var9;
                    if (client.field777[var0] == 0) {
                        var9 = field1106.method2401();
                    } else {
                        int var3 = (client.field777[var0] & 0xFF) * 128;
                        int var4 = client.field777[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - field2696.field1227;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = client.field777[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - field2696.field1187;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            client.field601[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * field1106.method2473() / var3;
                    }
                    if (var9 > 0) {
                        class41 var10 = var2.method731().method741(field1600);
                        class49 var11 = class49.method879(var10, 100, var9);
                        var11.method867(client.field575[var0] - 1);
                        field1626.method725(var11);
                    }
                    client.field601[var0] = -100;
                }
            } else {
                client.field645--;
                for (int var1 = var0; var1 < client.field645; var1++) {
                    client.field813[var1] = client.field813[var1 + 1];
                    client.field778[var1] = client.field778[var1 + 1];
                    client.field575[var1] = client.field575[var1 + 1];
                    client.field601[var1] = client.field601[var1 + 1];
                    client.field777[var1] = client.field777[var1 + 1];
                }
                var0--;
            }
        }
        if (client.field772 && !class320.method6192()) {
            if (field1106.method2399() != 0 && class320.method1121()) {
                class320.method3372(field2393, field1106.method2399());
            }
            client.field772 = false;
        }
    }

    @ObfuscatedName("fn.bb(ILds;ZI)I")
    public static int method2964(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = class72.field886[--field1867];
            int var4 = class72.field875[--field876];
            class72.field886[++field1867 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            field1867 -= 2;
            String var5 = class72.field886[field1867];
            String var6 = class72.field886[field1867 + 1];
            class72.field886[++field1867 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = class72.field886[--field1867];
            int var8 = class72.field875[--field876];
            class72.field886[++field1867 - 1] = var7 + class402.method5163(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = class72.field886[--field1867];
            class72.field886[++field1867 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = class72.field875[--field876];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            class72.field881.setTime(new Date(var11));
            int var13 = class72.field881.get(5);
            int var14 = class72.field881.get(2);
            int var15 = class72.field881.get(1);
            class72.field886[++field1867 - 1] = var13 + "-" + class72.field882[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            field1867 -= 2;
            String var16 = class72.field886[field1867];
            String var17 = class72.field886[field1867 + 1];
            if (field2696.field1120 == null || field2696.field1120.field3612 == 0) {
                class72.field886[++field1867 - 1] = var16;
            } else {
                class72.field886[++field1867 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = class72.field875[--field876];
            class72.field886[++field1867 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            field1867 -= 2;
            class72.field875[++field876 - 1] = class402.method4257(class403.method3975(class72.field886[field1867], class72.field886[field1867 + 1], field2910));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = class72.field886[--field1867];
            field876 -= 2;
            int var20 = class72.field875[field876];
            int var21 = class72.field875[field876 + 1];
            byte[] var22 = field150.method6342(var21, 0);
            class409 var23 = new class409(var22);
            class72.field875[++field876 - 1] = var23.method6986(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = class72.field886[--field1867];
            field876 -= 2;
            int var25 = class72.field875[field876];
            int var26 = class72.field875[field876 + 1];
            byte[] var27 = field150.method6342(var26, 0);
            class409 var28 = new class409(var27);
            class72.field875[++field876 - 1] = var28.method6950(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            field1867 -= 2;
            String var29 = class72.field886[field1867];
            String var30 = class72.field886[field1867 + 1];
            if (class72.field875[--field876] == 1) {
                class72.field886[++field1867 - 1] = var29;
            } else {
                class72.field886[++field1867 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = class72.field886[--field1867];
            class72.field886[++field1867 - 1] = class413.method6952(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = class72.field886[--field1867];
            int var33 = class72.field875[--field876];
            class72.field886[++field1867 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = class72.field875[--field876];
            class72.field875[++field876 - 1] = class402.method3650((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = class72.field875[--field876];
            class72.field875[++field876 - 1] = class402.method1067((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = class72.field875[--field876];
            class72.field875[++field876 - 1] = class402.method2918((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = class72.field875[--field876];
            class72.field875[++field876 - 1] = class402.method8966((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = class72.field886[--field1867];
            if (var38 == null) {
                class72.field875[++field876 - 1] = 0;
            } else {
                class72.field875[++field876 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = class72.field886[--field1867];
            field876 -= 2;
            int var40 = class72.field875[field876];
            int var41 = class72.field875[field876 + 1];
            class72.field886[++field1867 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = class72.field886[--field1867];
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
            class72.field886[++field1867 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = class72.field886[--field1867];
            int var48 = class72.field875[--field876];
            class72.field875[++field876 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            field1867 -= 2;
            String var49 = class72.field886[field1867];
            String var50 = class72.field886[field1867 + 1];
            int var51 = class72.field875[--field876];
            class72.field875[++field876 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = class72.field886[--field1867];
            class72.field886[++field1867 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            field1867 -= 3;
            String var53 = class72.field886[field1867];
            String var54 = class72.field886[field1867 + 1];
            String var55 = class72.field886[field1867 + 2];
            if (field2696.field1120 == null) {
                class72.field886[++field1867 - 1] = var55;
                return 1;
            }
            switch(field2696.field1120.field3615) {
                case 0:
                    class72.field886[++field1867 - 1] = var53;
                    break;
                case 1:
                    class72.field886[++field1867 - 1] = var54;
                    break;
                case 2:
                default:
                    class72.field886[++field1867 - 1] = var55;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("qy.jw(IIIII)V")
    public static final void method7154(int arg0, int arg1, int arg2, int arg3) {
        client.field635++;
        if (field2696.field1227 >> 7 == client.field527 && field2696.field1187 >> 7 == client.field770) {
            client.field527 = 0;
        }
        if (client.field649) {
            client.method3434(field2696, false);
        }
        if (client.field657 >= 0 && client.field726[client.field657] != null) {
            client.method3434(client.field726[client.field657], false);
        }
        client.method2603(true);
        client.method7839();
        client.method2603(false);
        client.method7700();
        for (class73 var4 = (class73) client.field661.method6532(); var4 != null; var4 = (class73) client.field661.method6543()) {
            if (field1072 != var4.field899 || var4.field901) {
                var4.method7776();
            } else if (client.field533 >= var4.field890) {
                var4.method2008(client.field710);
                if (var4.field901) {
                    var4.method7776();
                } else {
                    field53.method4455(var4.field899, var4.field892, var4.field895, var4.field894, 60, var4, 0, -1L, false);
                }
            }
        }
        client.method1017(arg0, arg1, arg2, arg3, true);
        int var5 = client.field800;
        int var6 = client.field801;
        int var7 = client.field523;
        int var8 = client.field803;
        class540.method8694(var5, var6, var5 + var7, var6 + var8);
        class241.method4170();
        class540.method8700();
        int var9 = client.field605;
        if (client.field622 / 256 > var9) {
            var9 = client.field622 / 256;
        }
        if (client.field787[4] && client.field681[4] + 128 > var9) {
            var9 = client.field681[4] + 128;
        }
        int var10 = client.field650 & 0x7FF;
        int var11 = field1029;
        int var12 = field4640;
        int var13 = field3040;
        int var14 = var9 * 3 + 600;
        int var16 = var8 - 334;
        if (var16 < 0) {
            var16 = 0;
        } else if (var16 > 100) {
            var16 = 100;
        }
        int var17 = (client.field795 - client.field794) * var16 / 100 + client.field794;
        int var18 = var14 * var17 / 256;
        int var20 = 2048 - var9 & 0x7FF;
        int var21 = 2048 - var10 & 0x7FF;
        int var22 = 0;
        int var23 = 0;
        int var24 = var18;
        if (var20 != 0) {
            int var25 = class241.field2553[var20];
            int var26 = class241.field2554[var20];
            int var27 = var23 * var26 - var18 * var25 >> 16;
            var24 = var23 * var25 + var18 * var26 >> 16;
            var23 = var27;
        }
        if (var21 != 0) {
            int var28 = class241.field2553[var21];
            int var29 = class241.field2554[var21];
            int var30 = var22 * var29 + var24 * var28 >> 16;
            var24 = var24 * var29 - var22 * var28 >> 16;
            var22 = var30;
        }
        if (client.field769) {
            field4702 = var11 - var22;
            field4719 = var12 - var23;
            field1845 = var13 - var24;
            field77 = var9;
            field517 = var10;
        } else {
            field824 = var11 - var22;
            field94 = var12 - var23;
            field2931 = var13 - var24;
            field3946 = var9;
            field2875 = var10;
        }
        if (client.field611 == 1 && client.field776 >= 2 && client.field533 % 50 == 0 && (field1029 >> 7 != field2696.field1227 >> 7 || field3040 >> 7 != field2696.field1187 >> 7)) {
            int var31 = field2696.field1140;
            int var32 = (field1029 >> 7) + field108;
            int var33 = (field3040 >> 7) + field103;
            class311 var34 = class311.method2978(class309.field3155, client.field579.field1425);
            var34.field3250.method8405(var32);
            var34.field3250.method8506(var33);
            var34.field3250.method8351(client.field548);
            var34.field3250.method8485(var31);
            client.field579.method2682(var34);
        }
        int var35;
        if (client.field769) {
            var35 = method4045();
        } else {
            var35 = client.method2925();
        }
        int var36 = field824;
        int var37 = field94;
        int var38 = field2931;
        int var39 = field3946;
        int var40 = field2875;
        for (int var41 = 0; var41 < 5; var41++) {
            if (client.field787[var41]) {
                int var42 = (int) (Math.random() * (double) (client.field788[var41] * 2 + 1) - (double) client.field788[var41] + Math.sin((double) client.field790[var41] / 100.0D * (double) client.field708[var41]) * (double) client.field681[var41]);
                if (var41 == 0) {
                    field824 += var42;
                }
                if (var41 == 1) {
                    field94 += var42;
                }
                if (var41 == 2) {
                    field2931 += var42;
                }
                if (var41 == 3) {
                    field2875 = field2875 + var42 & 0x7FF;
                }
                if (var41 == 4) {
                    field3946 += var42;
                    if (field3946 < 128) {
                        field3946 = 128;
                    }
                    if (field3946 > 383) {
                        field3946 = 383;
                    }
                }
            }
        }
        int var43 = class36.field235;
        int var44 = class36.field241;
        if (class36.field242 != 0) {
            var43 = class36.field244;
            var44 = class36.field248;
        }
        if (var43 >= var5 && var43 < var5 + var7 && var44 >= var6 && var44 < var6 + var8) {
            class255.method188(var43 - var5, var44 - var6);
        } else {
            class255.method3551();
        }
        method5332();
        class540.method8758(var5, var6, var7, var8, 0);
        method5332();
        int var45 = class241.method4163();
        class241.method4153(field1743.field191);
        class241.field2551.field2831 = client.field593;
        field53.method4337(field824, field94, field2931, field3946, field2875, var35);
        class241.method4153(false);
        if (client.field550) {
            class540.method8692();
        }
        class241.field2551.field2831 = var45;
        method5332();
        field53.method4356();
        client.field618 = 0;
        boolean var46 = false;
        int var47 = -1;
        int var48 = -1;
        int var49 = class110.field1375;
        int[] var50 = class110.field1376;
        for (int var51 = 0; var51 < client.field668 + var49; var51++) {
            class98 var52;
            if (var51 < var49) {
                var52 = client.field726[var50[var51]];
                if (client.field657 == var50[var51]) {
                    var46 = true;
                    var47 = var51;
                    continue;
                }
                if (field2696 == var52) {
                    var48 = var51;
                    continue;
                }
            } else {
                var52 = client.field705[client.field581[var51 - var49]];
            }
            client.method4027(var52, var51, var5, var6, var7, var8);
        }
        if (client.field649 && var48 != -1) {
            client.method4027(field2696, var48, var5, var6, var7, var8);
        }
        if (var46) {
            client.method4027(client.field726[client.field657], var47, var5, var6, var7, var8);
        }
        for (int var53 = 0; var53 < client.field618; var53++) {
            int var54 = client.field625[var53];
            int var55 = client.field626[var53];
            int var56 = client.field628[var53];
            int var57 = client.field627[var53];
            boolean var58 = true;
            while (var58) {
                var58 = false;
                for (int var59 = 0; var59 < var53; var59++) {
                    if (var55 + 2 > client.field626[var59] - client.field627[var59] && var55 - var57 < client.field626[var59] + 2 && var54 - var56 < client.field628[var59] + client.field625[var59] && var54 + var56 > client.field625[var59] - client.field628[var59] && client.field626[var59] - client.field627[var59] < var55) {
                        var55 = client.field626[var59] - client.field627[var59];
                        var58 = true;
                    }
                }
            }
            client.field636 = client.field625[var53];
            client.field654 = client.field626[var53] = var55;
            String var60 = client.field633[var53];
            if (client.field694 == 0) {
                int var61 = 16776960;
                if (client.field629[var53] < 6) {
                    var61 = client.field750[client.field629[var53]];
                }
                if (client.field629[var53] == 6) {
                    var61 = client.field635 % 20 < 10 ? 16711680 : 16776960;
                }
                if (client.field629[var53] == 7) {
                    var61 = client.field635 % 20 < 10 ? 255 : 65535;
                }
                if (client.field629[var53] == 8) {
                    var61 = client.field635 % 20 < 10 ? 45056 : 8454016;
                }
                if (client.field629[var53] == 9) {
                    int var62 = 150 - client.field734[var53];
                    if (var62 < 50) {
                        var61 = var62 * 1280 + 16711680;
                    } else if (var62 < 100) {
                        var61 = 16776960 - (var62 - 50) * 327680;
                    } else if (var62 < 150) {
                        var61 = (var62 - 100) * 5 + 65280;
                    }
                }
                if (client.field629[var53] == 10) {
                    int var63 = 150 - client.field734[var53];
                    if (var63 < 50) {
                        var61 = var63 * 5 + 16711680;
                    } else if (var63 < 100) {
                        var61 = 16711935 - (var63 - 50) * 327680;
                    } else if (var63 < 150) {
                        var61 = (var63 - 100) * 327680 + 255 - (var63 - 100) * 5;
                    }
                }
                if (client.field629[var53] == 11) {
                    int var64 = 150 - client.field734[var53];
                    if (var64 < 50) {
                        var61 = 16777215 - var64 * 327685;
                    } else if (var64 < 100) {
                        var61 = (var64 - 50) * 327685 + 65280;
                    } else if (var64 < 150) {
                        var61 = 16777215 - (var64 - 100) * 327680;
                    }
                }
                if (client.field629[var53] == 12 && client.field631[var53] == null) {
                    int var65 = var60.length();
                    client.field631[var53] = new int[var65];
                    for (int var66 = 0; var66 < var65; var66++) {
                        int var67 = (int) ((float) var66 / (float) var65 * 64.0F);
                        int var68 = var67 << 10 | 0x380 | 0x40;
                        client.field631[var53][var66] = class482.field4839[var68];
                    }
                }
                if (client.field825[var53] == 0) {
                    field330.method6960(var60, client.field636 + var5, client.field654 + var6, var61, 0, client.field631[var53]);
                }
                if (client.field825[var53] == 1) {
                    field330.method6956(var60, client.field636 + var5, client.field654 + var6, var61, 0, client.field635, client.field631[var53]);
                }
                if (client.field825[var53] == 2) {
                    field330.method6961(var60, client.field636 + var5, client.field654 + var6, var61, 0, client.field635, client.field631[var53]);
                }
                if (client.field825[var53] == 3) {
                    field330.method6962(var60, client.field636 + var5, client.field654 + var6, var61, 0, client.field635, 150 - client.field734[var53], client.field631[var53]);
                }
                if (client.field825[var53] == 4) {
                    int var69 = (150 - client.field734[var53]) * (field330.method6948(var60) + 100) / 150;
                    class540.method8695(client.field636 + var5 - 50, var6, client.field636 + var5 + 50, var6 + var8);
                    field330.method6984(var60, client.field636 + var5 + 50 - var69, client.field654 + var6, var61, 0, client.field631[var53]);
                    class540.method8694(var5, var6, var5 + var7, var6 + var8);
                }
                if (client.field825[var53] == 5) {
                    int var70 = 150 - client.field734[var53];
                    int var71 = 0;
                    if (var70 < 25) {
                        var71 = var70 - 25;
                    } else if (var70 > 125) {
                        var71 = var70 - 125;
                    }
                    class540.method8695(var5, client.field654 + var6 - field330.field4536 - 1, var5 + var7, client.field654 + var6 + 5);
                    field330.method6960(var60, client.field636 + var5, client.field654 + var6 + var71, var61, 0, client.field631[var53]);
                    class540.method8694(var5, var6, var5 + var7, var6 + var8);
                }
            } else {
                field330.method6963(var60, client.field636 + var5, client.field654 + var6, 16776960, 0);
            }
        }
        method3406(var5, var6);
        ((class251) class241.field2551.field2837).method4503(client.field710);
        client.method7082();
        field824 = var36;
        field94 = var37;
        field2931 = var38;
        field3946 = var39;
        field2875 = var40;
        if (client.field532 && field453.method6359(true, false) == 0) {
            client.field532 = false;
        }
        if (client.field532) {
            class540.method8758(var5, var6, var7, var8, 0);
            client.method7130(class367.field3996, false);
        }
    }

    @ObfuscatedName("ia.jj(I)I")
    public static final int method4045() {
        if (field1106.method2386()) {
            return field1072;
        } else {
            int var0 = client.method2725(field824, field2931, field1072);
            return var0 - field94 >= 800 || (class84.field1032[field1072][field824 >> 7][field2931 >> 7] & 0x4) == 0 ? 3 : field1072;
        }
    }

    @ObfuscatedName("hj.ju(IIB)V")
    public static final void method3406(int arg0, int arg1) {
        if (client.field540 == 2) {
            client.method2999((client.field584 - field108 << 7) + client.field630, (client.field544 - field103 << 7) + client.field798, client.field545 * 2);
            if (client.field636 > -1 && client.field533 % 20 < 10) {
                field1458[0].method8823(client.field636 + arg0 - 12, client.field654 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("gs.le(II)Ljava/lang/String;")
    public static final String method3234(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class104.field1336 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class104.method1732(65408) + var1.substring(0, var1.length() - 8) + class367.field4123 + " " + class104.field1332 + var1 + class104.field1333 + class104.field1329;
        } else if (var1.length() > 6) {
            return " " + class104.method1732(16777215) + var1.substring(0, var1.length() - 4) + class367.field4125 + " " + class104.field1332 + var1 + class104.field1333 + class104.field1329;
        } else {
            return " " + class104.method1732(16776960) + var1 + class104.field1329;
        }
    }

    @ObfuscatedName("gb.nz(IIII)Lde;")
    public static final class89 method3134(int arg0, int arg1, int arg2) {
        class89 var3 = new class89();
        var3.field1076 = arg1;
        var3.field1073 = arg2;
        client.field691.method8098(var3, (long) arg0);
        client.method6175(arg1);
        class347 var4 = field185.method5639(arg0);
        client.method2979(var4);
        if (client.field624 != null) {
            client.method2979(client.field624);
            client.field624 = null;
        }
        client.method2301(field185.field3588[arg0 >> 16], var4, false);
        class72.method3528(arg1);
        if (client.field797 != -1) {
            client.method1976(client.field797, 1);
        }
        return var3;
    }

    @ObfuscatedName("bp.ne(III)V")
    public static final void method688(int arg0, int arg1) {
        if (client.field763[arg0] == null || arg1 < 0 || arg1 >= client.field763[arg0].method3120()) {
            return;
        }
        class148 var2 = (class148) client.field763[arg0].field1772.get(arg1);
        if (var2.field1657 != -1) {
            return;
        }
        class311 var3 = class311.method2978(class309.field3210, client.field579.field1425);
        var3.field3250.method8348(3 + class530.method7740(var2.field1660.method8985()));
        var3.field3250.method8348(arg0);
        var3.field3250.method8349(arg1);
        var3.field3250.method8374(var2.field1660.method8985());
        client.field579.method2682(var3);
    }

    @ObfuscatedName("gu.oo(II)V")
    public static void method3280(int arg0) {
        client.field611 = arg0;
    }
}
