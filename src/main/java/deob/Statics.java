package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class Statics {

    @ObfuscatedName("cd.aq")
    public static byte[][][] field1000;

    @ObfuscatedName("cd.ay")
    public static int[] field1003;

    @ObfuscatedName("cd.ab")
    public static byte[][][] field1009;

    @ObfuscatedName("dm.ay")
    public static int field1015;

    @ObfuscatedName("dw.nc")
    public static int field1020;

    @ObfuscatedName("dc.gf")
    public static int field1024;

    @ObfuscatedName("dc.sv")
    public static boolean field1025;

    @ObfuscatedName("as.bw")
    public static class421 field104;

    @ObfuscatedName("dr.uw")
    public static int field1042;

    @ObfuscatedName("dr.be")
    public static class344 field1053;

    @ObfuscatedName("dl.at")
    public static int field1063;

    @ObfuscatedName("dk.fn")
    public static class342 field1064;

    @ObfuscatedName("dk.fz")
    public static class342 field1069;

    @ObfuscatedName("dt.at")
    public static int[] field1074;

    @ObfuscatedName("dt.uf")
    public static int field1083;

    @ObfuscatedName("au.jf")
    public static byte[][] field11;

    @ObfuscatedName("aj.vb")
    public static class94 field112;

    @ObfuscatedName("az.fd")
    public static class342 field118;

    @ObfuscatedName("az.gi")
    public static int field119;

    @ObfuscatedName("az.dk")
    public static class502[] field120;

    @ObfuscatedName("ad.ay")
    public static class502 field123;

    @ObfuscatedName("dp.jz")
    public static class503 field1233;

    @ObfuscatedName("db.ka")
    public static class502[] field1265;

    @ObfuscatedName("dq.qe")
    public static int field1289;

    @ObfuscatedName("dq.ar")
    public static String[] field1292;

    @ObfuscatedName("dq.bh")
    public static class421 field1296;

    @ObfuscatedName("dq.ls")
    public static int field1297;

    @ObfuscatedName("au.gq")
    public static int field13;

    @ObfuscatedName("dd.ab")
    public static int[] field1302;

    @ObfuscatedName("dx.gp")
    public static String field1319;

    @ObfuscatedName("dn.af")
    public static Applet field1322;

    @ObfuscatedName("dn.at")
    public static int field1324;

    @ObfuscatedName("dy.qw")
    public static int field1329;

    @ObfuscatedName("ds.rx")
    public static class430 field1340;

    @ObfuscatedName("ds.un")
    public static int field1345;

    @ObfuscatedName("ds.kd")
    public static class503[] field1348;

    @ObfuscatedName("ep.gg")
    public static class420 field1373;

    @ObfuscatedName("eo.cp")
    public static String field1374;

    @ObfuscatedName("ap.ul")
    public static int field138;

    @ObfuscatedName("eq.bo")
    public static Image field1395;

    @ObfuscatedName("et.tk")
    public static class503 field1396;

    @ObfuscatedName("ef.cm")
    public static String field1404;

    @ObfuscatedName("ez.at")
    public static int field1411;

    @ObfuscatedName("ej.ax")
    public static int[] field1417;

    @ObfuscatedName("ea.at")
    public static int field1419;

    @ObfuscatedName("ea.gd")
    public static String field1420;

    @ObfuscatedName("es.sb")
    public static class404 field1426;

    @ObfuscatedName("eb.bb")
    public static class344 field1430;

    @ObfuscatedName("eb.am")
    public static byte[][][] field1433;

    @ObfuscatedName("en.vz")
    public static class451 field1437;

    @ObfuscatedName("eg.eq")
    public static class85 field1449;

    @ObfuscatedName("ev.ay")
    public static boolean field1459;

    @ObfuscatedName("em.av")
    public static class93 field1471;

    @ObfuscatedName("em.gv")
    public static String field1472;

    @ObfuscatedName("ex.rk")
    public static class171 field1489;

    @ObfuscatedName("bb.bi")
    public static FontMetrics field149;

    @ObfuscatedName("ex.at")
    public static class503 field1498;

    @ObfuscatedName("ex.uo")
    public static int field1500;

    @ObfuscatedName("eh.ax")
    public static class379 field1505;

    @ObfuscatedName("ek.kh")
    public static int field1531;

    @ObfuscatedName("ey.fm")
    public static class342 field1532;

    @ObfuscatedName("ey.fj")
    public static class342 field1541;

    @ObfuscatedName("ey.wt")
    public static class459 field1542;

    @ObfuscatedName("ec.gc")
    public static int field1566;

    @ObfuscatedName("ei.fg")
    public static class342 field1568;

    @ObfuscatedName("fe.td")
    public static class39 field1574;

    @ObfuscatedName("fe.os")
    public static class317 field1575;

    @ObfuscatedName("fe.av")
    public static String[] field1577;

    @ObfuscatedName("fi.fx")
    public static long field1581;

    @ObfuscatedName("fi.wc")
    public static class355 field1586;

    @ObfuscatedName("bi.ft")
    public static class342 field159;

    @ObfuscatedName("fh.aq")
    public static int field1594;

    @ObfuscatedName("fh.ah")
    public static class151 field1598;

    @ObfuscatedName("fo.ar")
    public static int[] field1626;

    @ObfuscatedName("bi.to")
    public static class43 field163;

    @ObfuscatedName("fx.ip")
    public static class379 field1635;

    @ObfuscatedName("fd.uu")
    public static int field1638;

    @ObfuscatedName("fd.aq")
    public static int[] field1644;

    @ObfuscatedName("bi.ji")
    public static int field165;

    @ObfuscatedName("fy.az")
    public static int field1671;

    @ObfuscatedName("fw.lf")
    public static int field1675;

    @ObfuscatedName("fw.iz")
    public static int field1678;

    @ObfuscatedName("fv.bk")
    public static class344 field1691;

    @ObfuscatedName("fq.nv")
    public static int field1693;

    @ObfuscatedName("fq.av")
    public static class160 field1695;

    @ObfuscatedName("fc.ao")
    public static class502[] field1704;

    @ObfuscatedName("fj.ck")
    public static class359 field1736;

    @ObfuscatedName("bx.kg")
    public static class502[] field174;

    @ObfuscatedName("go.aw")
    public static class344 field1762;

    @ObfuscatedName("gs.ag")
    public static class502 field1767;

    @ObfuscatedName("bx.ai")
    public static int[] field177;

    @ObfuscatedName("gj.av")
    public static int[] field1777;

    @ObfuscatedName("gg.qm")
    public static class474 field1781;

    @ObfuscatedName("ge.ag")
    public static int[][][] field1783;

    @ObfuscatedName("ga.aa")
    public static int field1789;

    @ObfuscatedName("bx.au")
    public static class64[] field179;

    @ObfuscatedName("bx.js")
    public static class223 field180;

    @ObfuscatedName("gd.af")
    public static String field1817;

    @ObfuscatedName("gd.an")
    public static String field1818;

    @ObfuscatedName("gw.go")
    public static class342 field1828;

    @ObfuscatedName("gc.ac")
    public static File field1832;

    @ObfuscatedName("gc.ab")
    public static int field1833;

    @ObfuscatedName("gc.ah")
    public static int field1838;

    @ObfuscatedName("gm.al")
    public static boolean field1844;

    @ObfuscatedName("gm.aa")
    public static int[] field1847;

    @ObfuscatedName("gq.kb")
    public static class503[] field1861;

    @ObfuscatedName("gk.kv")
    public static int field1867;

    @ObfuscatedName("gk.hz")
    public static SecureRandom field1870;

    @ObfuscatedName("gb.ux")
    public static int field1872;

    @ObfuscatedName("gx.ut")
    public static int field1903;

    @ObfuscatedName("gl.af")
    public static class344 field1904;

    @ObfuscatedName("gz.an")
    public static int field1909;

    @ObfuscatedName("gz.af")
    public static class344 field1910;

    @ObfuscatedName("gz.al")
    public static int field1913;

    @ObfuscatedName("hw.an")
    public static class183[] field1915;

    @ObfuscatedName("hw.af")
    public static class344 field1930;

    @ObfuscatedName("hw.uv")
    public static int field1938;

    @ObfuscatedName("bz.lg")
    public static int field194;

    @ObfuscatedName("hj.aw")
    public static int field1944;

    @ObfuscatedName("hj.an")
    public static class344 field1946;

    @ObfuscatedName("hj.af")
    public static class344 field1951;

    @ObfuscatedName("hj.fl")
    public static class414 field1957;

    @ObfuscatedName("hj.ur")
    public static int field1958;

    @ObfuscatedName("hj.ku")
    public static class503[] field1959;

    @ObfuscatedName("hm.an")
    public static class344 field1961;

    @ObfuscatedName("hm.af")
    public static class344 field1964;

    @ObfuscatedName("hu.ac")
    public static short[][][] field1977;

    @ObfuscatedName("hx.ay")
    public static int field1980;

    @ObfuscatedName("hx.af")
    public static class344 field1985;

    @ObfuscatedName("hd.tt")
    public static class43 field1997;

    @ObfuscatedName("hd.az")
    public static String field2000;

    @ObfuscatedName("hs.aw")
    public static class344 field2007;

    @ObfuscatedName("hs.an")
    public static class344 field2008;

    @ObfuscatedName("bm.af")
    public static class168 field201;

    @ObfuscatedName("hn.ap")
    public static class317[][] field2057;

    @ObfuscatedName("hl.nf")
    public static int field2065;

    @ObfuscatedName("hh.af")
    public static class344 field2078;

    @ObfuscatedName("hh.an")
    public static class344 field2086;

    @ObfuscatedName("hr.af")
    public static class344 field2092;

    @ObfuscatedName("hr.cw")
    public static int field2097;

    @ObfuscatedName("hr.fr")
    public static class342 field2098;

    @ObfuscatedName("hr.sn")
    public static class508 field2100;

    @ObfuscatedName("hc.ff")
    public static class342 field2102;

    @ObfuscatedName("hg.af")
    public static class344 field2104;

    @ObfuscatedName("bm.aj")
    public static int field211;

    @ObfuscatedName("hg.at")
    public static byte[][] field2113;

    @ObfuscatedName("ho.af")
    public static class344 field2114;

    @ObfuscatedName("ho.aa")
    public static class503 field2125;

    @ObfuscatedName("ht.af")
    public static class344 field2127;

    @ObfuscatedName("hb.an")
    public static class344 field2132;

    @ObfuscatedName("hb.aw")
    public static class344 field2133;

    @ObfuscatedName("hb.af")
    public static class344 field2138;

    @ObfuscatedName("hq.an")
    public static class344 field2158;

    @ObfuscatedName("hz.aq")
    public static class344 field2212;

    @ObfuscatedName("hz.sq")
    public static class151 field2269;

    @ObfuscatedName("hk.af")
    public static class344 field2273;

    @ObfuscatedName("ha.ab")
    public static class344 field2291;

    @ObfuscatedName("ha.aq")
    public static class344 field2292;

    @ObfuscatedName("bm.mh")
    public static int field231;

    @ObfuscatedName("ha.au")
    public static class344 field2311;

    @ObfuscatedName("hp.ct")
    public static int field2331;

    @ObfuscatedName("he.gr")
    public static class342 field2336;

    @ObfuscatedName("hf.ae")
    public static int[] field2342;

    @ObfuscatedName("ia.bn")
    public static class500 field2381;

    @ObfuscatedName("ia.ao")
    public static class303 field2382;

    @ObfuscatedName("ih.ag")
    public static int[] field2470;

    @ObfuscatedName("in.ai")
    public static int field2521;

    @ObfuscatedName("bd.sx")
    public static class160 field253;

    @ObfuscatedName("bt.jl")
    public static class503[] field256;

    @ObfuscatedName("ie.av")
    public static int field2560;

    @ObfuscatedName("ie.ar")
    public static int field2561;

    @ObfuscatedName("ie.am")
    public static int field2562;

    @ObfuscatedName("ie.as")
    public static int field2563;

    @ObfuscatedName("ie.aj")
    public static int field2564;

    @ObfuscatedName("ie.ak")
    public static int field2565;

    @ObfuscatedName("ie.az")
    public static int field2566;

    @ObfuscatedName("ie.ap")
    public static int field2569;

    @ObfuscatedName("bt.kx")
    public static int field257;

    @ObfuscatedName("ie.ae")
    public static int field2571;

    @ObfuscatedName("ie.bi")
    public static int field2572;

    @ObfuscatedName("ie.be")
    public static int field2573;

    @ObfuscatedName("ie.bb")
    public static int field2588;

    @ObfuscatedName("ie.by")
    public static int field2592;

    @ObfuscatedName("ie.ad")
    public static int field2595;

    @ObfuscatedName("ie.cr")
    public static int field2596;

    @ObfuscatedName("ie.cq")
    public static boolean[][] field2604;

    @ObfuscatedName("ie.cm")
    public static int field2605;

    @ObfuscatedName("ie.cf")
    public static int field2606;

    @ObfuscatedName("ie.cl")
    public static int field2607;

    @ObfuscatedName("ie.cg")
    public static int field2608;

    @ObfuscatedName("ie.cy")
    public static int field2610;

    @ObfuscatedName("iq.ci")
    public static class332 field2612;

    @ObfuscatedName("id.fk")
    public static class342 field2684;

    @ObfuscatedName("id.qp")
    public static int field2685;

    @ObfuscatedName("bj.aa")
    public static int field269;

    @ObfuscatedName("bj.bj")
    public static String field270;

    @ObfuscatedName("it.cm")
    public static int field2735;

    @ObfuscatedName("it.cq")
    public static int field2746;

    @ObfuscatedName("it.cf")
    public static int field2748;

    @ObfuscatedName("ix.au")
    public static int field2768;

    @ObfuscatedName("ix.aq")
    public static int field2769;

    @ObfuscatedName("ix.al")
    public static int field2770;

    @ObfuscatedName("ix.ao")
    public static int field2772;

    @ObfuscatedName("ix.hv")
    public static String field2775;

    @ObfuscatedName("al.gm")
    public static int field28;

    @ObfuscatedName("jg.ou")
    public static int field2805;

    @ObfuscatedName("je.io")
    public static class379 field2832;

    @ObfuscatedName("jj.jc")
    public static int field2841;

    @ObfuscatedName("jj.jd")
    public static int[][] field2848;

    @ObfuscatedName("bg.aa")
    public static int[] field285;

    @ObfuscatedName("jm.ib")
    public static int field2850;

    @ObfuscatedName("jn.bb")
    public static Font field2858;

    @ObfuscatedName("jd.fq")
    public static class342 field2869;

    @ObfuscatedName("jw.qk")
    public static class317[] field2878;

    @ObfuscatedName("bg.ay")
    public static int[] field295;

    @ObfuscatedName("jt.ax")
    public static short[] field2957;

    @ObfuscatedName("bg.ao")
    public static boolean[] field296;

    @ObfuscatedName("ja.fh")
    public static class177 field2974;

    @ObfuscatedName("jb.ky")
    public static int field2975;

    @ObfuscatedName("jb.tj")
    public static class56 field2981;

    @ObfuscatedName("jb.aj")
    public static String field2982;

    @ObfuscatedName("jb.ds")
    public static boolean field2984;

    @ObfuscatedName("jb.ow")
    public static int field2985;

    @ObfuscatedName("al.mp")
    public static class229 field30;

    @ObfuscatedName("bu.ax")
    public static class51 field300;

    @ObfuscatedName("ju.uh")
    public static int field3007;

    @ObfuscatedName("kd.ak")
    public static int field3026;

    @ObfuscatedName("kb.wh")
    public static class418 field3036;

    @ObfuscatedName("kt.by")
    public static boolean[] field3037;

    @ObfuscatedName("kt.wu")
    public static int field3040;

    @ObfuscatedName("kk.jj")
    public static int[] field3064;

    @ObfuscatedName("bu.au")
    public static int field307;

    @ObfuscatedName("kn.ao")
    public static int[] field3093;

    @ObfuscatedName("bu.ab")
    public static boolean field314;

    @ObfuscatedName("bu.gs")
    public static class342 field317;

    @ObfuscatedName("bq.ag")
    public static class317 field329;

    @ObfuscatedName("bq.al")
    public static ScheduledExecutorService field330;

    @ObfuscatedName("li.ba")
    public static GarbageCollectorMXBean field3353;

    @ObfuscatedName("lu.ab")
    public static class502 field3362;

    @ObfuscatedName("lk.af")
    public static long field3363;

    @ObfuscatedName("lk.an")
    public static long field3364;

    @ObfuscatedName("lh.ix")
    public static int field3365;

    @ObfuscatedName("lh.af")
    public static class344 field3366;

    @ObfuscatedName("lh.ab")
    public static int field3367;

    @ObfuscatedName("ly.af")
    public static class344 field3385;

    @ObfuscatedName("ly.an")
    public static class344 field3386;

    @ObfuscatedName("ly.aw")
    public static class344 field3387;

    @ObfuscatedName("ly.ab")
    public static class344 field3388;

    @ObfuscatedName("ly.ax")
    public static class46 field3390;

    @ObfuscatedName("ly.ke")
    public static int field3391;

    @ObfuscatedName("ln.oh")
    public static class317 field3394;

    @ObfuscatedName("lq.mi")
    public static class88 field3454;

    @ObfuscatedName("ll.gn")
    public static String field3476;

    @ObfuscatedName("mw.ao")
    public static short[][] field3508;

    @ObfuscatedName("mw.ay")
    public static short[] field3518;

    @ObfuscatedName("aa.wf")
    public static List field36;

    @ObfuscatedName("me.hk")
    public static int[] field3723;

    @ObfuscatedName("mv.af")
    public static class319 field3726;

    @ObfuscatedName("mv.dv")
    public static class502 field3727;

    @ObfuscatedName("mx.bf")
    public static boolean field3732;

    @ObfuscatedName("mp.aq")
    public static int field3738;

    @ObfuscatedName("mj.wd")
    public static long field3741;

    @ObfuscatedName("ce.ah")
    public static boolean[] field377;

    @ObfuscatedName("mo.aw")
    public static int field3792;

    @ObfuscatedName("ce.aa")
    public static int field380;

    @ObfuscatedName("md.fb")
    public static class342 field3804;

    @ObfuscatedName("ml.ic")
    public static class414 field3825;

    @ObfuscatedName("ml.ju")
    public static class502[] field3826;

    @ObfuscatedName("ce.av")
    public static int[] field383;

    @ObfuscatedName("my.au")
    public static File field3832;

    @ObfuscatedName("my.ah")
    public static int field3835;

    @ObfuscatedName("ce.al")
    public static int field384;

    @ObfuscatedName("ce.at")
    public static int field385;

    @ObfuscatedName("ce.ay")
    public static int field387;

    @ObfuscatedName("ce.ao")
    public static class52[] field388;

    @ObfuscatedName("ce.ai")
    public static class47[] field390;

    @ObfuscatedName("ce.ag")
    public static class50[] field391;

    @ObfuscatedName("ce.by")
    public static float[] field392;

    @ObfuscatedName("ce.ax")
    public static class42[] field394;

    @ObfuscatedName("ce.az")
    public static float[] field399;

    @ObfuscatedName("ce.ae")
    public static float[] field401;

    @ObfuscatedName("ce.ap")
    public static float[] field402;

    @ObfuscatedName("ce.bb")
    public static float[] field404;

    @ObfuscatedName("ce.bi")
    public static float[] field405;

    @ObfuscatedName("ce.be")
    public static int[] field406;

    @ObfuscatedName("ce.bk")
    public static int[] field407;

    @ObfuscatedName("ce.aq")
    public static byte[] field409;

    @ObfuscatedName("ce.ad")
    public static float[] field410;

    @ObfuscatedName("nz.dz")
    public static class502 field4189;

    @ObfuscatedName("nd.jn")
    public static int[] field4199;

    @ObfuscatedName("nd.up")
    public static int field4214;

    @ObfuscatedName("no.fc")
    public static class342 field4217;

    @ObfuscatedName("nl.af")
    public static class414 field4241;

    @ObfuscatedName("nl.ax")
    public static boolean field4248;

    @ObfuscatedName("nl.ah")
    public static class489 field4253;

    @ObfuscatedName("nl.aw")
    public static long field4260;

    @ObfuscatedName("nn.fy")
    public static class342 field4271;

    @ObfuscatedName("na.au")
    public static Thread field4272;

    @ObfuscatedName("nu.il")
    public static long field4288;

    @ObfuscatedName("nb.cq")
    public static String field4295;

    @ObfuscatedName("cn.al")
    public static float field430;

    @ObfuscatedName("nt.fu")
    public static class342 field4300;

    @ObfuscatedName("nf.aa")
    public static class45 field4307;

    @ObfuscatedName("cn.at")
    public static int field431;

    @ObfuscatedName("nc.ab")
    public static class344 field4311;

    @ObfuscatedName("nv.iv")
    public static class460 field4313;

    @ObfuscatedName("nx.ot")
    public static class70 field4318;

    @ObfuscatedName("nx.ir")
    public static class379 field4327;

    @ObfuscatedName("ne.ak")
    public static String field4339;

    @ObfuscatedName("ne.gb")
    public static String field4348;

    @ObfuscatedName("ol.ag")
    public static class472[] field4375;

    @ObfuscatedName("oy.qo")
    public static class105 field4387;

    @ObfuscatedName("ot.al")
    public static ThreadPoolExecutor field4388;

    @ObfuscatedName("oh.vj")
    public static class346 field4389;

    @ObfuscatedName("os.al")
    public static class502 field4399;

    @ObfuscatedName("aa.jp")
    public static int field44;

    @ObfuscatedName("oq.aq")
    public static int field4411;

    @ObfuscatedName("ou.ay")
    public static class502[] field4442;

    @ObfuscatedName("oj.ck")
    public static int field4479;

    @ObfuscatedName("oj.aj")
    public static class272 field4480;

    @ObfuscatedName("aa.ax")
    public static int field45;

    @ObfuscatedName("pc.al")
    public static int[] field4525;

    @ObfuscatedName("py.ac")
    public static class502[] field4534;

    @ObfuscatedName("pg.ab")
    public static int field4535;

    @ObfuscatedName("pj.ay")
    public static class179 field4547;

    @ObfuscatedName("pj.fw")
    public static class342 field4548;

    @ObfuscatedName("pj.wm")
    public static short[] field4549;

    @ObfuscatedName("ps.gw")
    public static int field4569;

    @ObfuscatedName("px.cf")
    public static int field4601;

    @ObfuscatedName("qx.an")
    public static int field4658;

    @ObfuscatedName("qx.aw")
    public static int field4659;

    @ObfuscatedName("ck.bc")
    public static client field466;

    @ObfuscatedName("qj.ac")
    public static int field4668;

    @ObfuscatedName("qj.kc")
    public static class503[] field4669;

    @ObfuscatedName("qj.aw")
    public static int field4670;

    @ObfuscatedName("qj.jg")
    public static int field4672;

    @ObfuscatedName("qc.fa")
    public static class342 field4688;

    @ObfuscatedName("ck.ug")
    public static int field470;

    @ObfuscatedName("qv.ai")
    public static short[][] field4708;

    @ObfuscatedName("qo.aq")
    public static class502 field4718;

    @ObfuscatedName("qh.an")
    public static int[] field4730;

    @ObfuscatedName("qh.ac")
    public static int field4732;

    @ObfuscatedName("re.nj")
    public static int field4753;

    @ObfuscatedName("rr.fv")
    public static class342 field4788;

    @ObfuscatedName("ri.wj")
    public static int field4876;

    @ObfuscatedName("ri.jm")
    public static int[] field4877;

    @ObfuscatedName("ri.jt")
    public static int field4883;

    @ObfuscatedName("ri.um")
    public static int field4885;

    @ObfuscatedName("client.cc")
    public static class333 field491;

    @ObfuscatedName("su.ev")
    public static boolean field4941;

    @ObfuscatedName("sa.ac")
    public static class299 field4942;

    @ObfuscatedName("st.dr")
    public static class503[] field4945;

    @ObfuscatedName("sf.kt")
    public static class503[] field4946;

    @ObfuscatedName("sm.af")
    public static class344 field4962;

    @ObfuscatedName("sz.af")
    public static class344 field4969;

    @ObfuscatedName("an.is")
    public static class177 field5;

    @ObfuscatedName("th.ap")
    public static int field5060;

    @ObfuscatedName("th.ae")
    public static int field5061;

    @ObfuscatedName("th.by")
    public static float[] field5063;

    @ObfuscatedName("th.ad")
    public static int[] field5067;

    @ObfuscatedName("tx.aw")
    public static int field5099;

    @ObfuscatedName("tx.an")
    public static int field5100;

    @ObfuscatedName("tx.ac")
    public static int[] field5101;

    @ObfuscatedName("tx.af")
    public static int field5102;

    @ObfuscatedName("tl.an")
    public static File field5152;

    @ObfuscatedName("tr.aw")
    public static int field5155;

    @ObfuscatedName("tr.au")
    public static int field5157;

    @ObfuscatedName("tr.an")
    public static String field5159;

    @ObfuscatedName("an.ai")
    public static class317 field6;

    @ObfuscatedName("ao.aa")
    public static class110 field60;

    @ObfuscatedName("ax.an")
    public static boolean field63;

    @ObfuscatedName("an.wa")
    public static Iterator field7;

    @ObfuscatedName("ai.dg")
    public static class502 field71;

    @ObfuscatedName("ai.gk")
    public static int field72;

    @ObfuscatedName("ag.iq")
    public static class108 field78;

    @ObfuscatedName("cl.dt")
    public static class502[] field803;

    @ObfuscatedName("cl.vt")
    public static class65 field804;

    @ObfuscatedName("cr.jw")
    public static byte[][] field834;

    @ObfuscatedName("cy.at")
    public static int field836;

    @ObfuscatedName("ah.an")
    public static class16 field84;

    @ObfuscatedName("cy.ac")
    public static int[] field845;

    @ObfuscatedName("cy.au")
    public static String[] field851;

    @ObfuscatedName("cx.sl")
    public static boolean field865;

    @ObfuscatedName("av.dl")
    public static class502[] field88;

    @ObfuscatedName("cb.qh")
    public static class474 field882;

    @ObfuscatedName("co.cn")
    public static class469 field889;

    @ObfuscatedName("cz.ax")
    public static class502 field893;

    @ObfuscatedName("cz.ai")
    public static class502 field894;

    @ObfuscatedName("cz.ah")
    public static class502 field908;

    @ObfuscatedName("av.uq")
    public static int field91;

    @ObfuscatedName("cz.au")
    public static class502 field914;

    @ObfuscatedName("cz.ar")
    public static int field928;

    @ObfuscatedName("cz.as")
    public static class489 field929;

    @ObfuscatedName("ar.au")
    public static int[] field94;

    @ObfuscatedName("am.au")
    public static int field95;

    @ObfuscatedName("cj.oo")
    public static int field958;

    @ObfuscatedName("ch.ai")
    public static class343 field973;

    @ObfuscatedName("am.bc")
    public static String field98;

    @ObfuscatedName("ct.bi")
    public static class344 field986;

    @ObfuscatedName("cp.cz")
    public static int field993;

    @ObfuscatedName("cp.jb")
    public static class503 field994;

    @ObfuscatedName("cd.al")
    public static byte[][][] field995;

    @ObfuscatedName("cd.at")
    public static int[][] field997;

    @ObfuscatedName("cd.au")
    public static short[][][] field998;

    @ObfuscatedName("gj.an(IIIIB)I")
    public static final int method3178(int arg0, int arg1, int arg2, int arg3) {
        return arg1 * arg2 - arg0 * arg3 >> 16;
    }

    @ObfuscatedName("ft.af(Lme;I)V")
    public static void method3141(class319 arg0) {
        field3726 = arg0;
    }

    @ObfuscatedName("ht.af([Lnj;IS)Lnj;")
    public static class357 method3600(class357[] arg0, int arg1) {
        class357[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class357 var4 = var2[var3];
            if (arg1 == var4.method39()) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("mg.af(Lnm;B)V")
    public static void method5967(class344 arg0) {
        field4969 = arg0;
    }

    @ObfuscatedName("nu.af(Lek;FI)F")
    public static float method6228(class126 arg0, float arg1) {
        if (arg0 == null || arg0.method2916() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1512[0].field1453) {
            return class124.field1497 == arg0.field1513 ? arg0.field1512[0].field1456 : class122.method1133(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1512[arg0.method2916() - 1].field1453) {
            return class124.field1497 == arg0.field1529 ? arg0.field1512[arg0.method2916() - 1].field1456 : class122.method1133(arg0, arg1, false);
        } else if (arg0.field1509) {
            return arg0.field1512[0].field1456;
        } else {
            class121 var2 = arg0.method2915(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if ((double) var2.field1454 == 0.0D && (double) var2.field1451 == 0.0D) {
                var3 = true;
            } else if (var2.field1454 == Float.MAX_VALUE && var2.field1451 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1455 == null) {
                var3 = true;
            } else if (arg0.field1525) {
                float var5 = (float) var2.field1453;
                float var6 = var2.field1456;
                float var7 = var2.field1454 * 0.33333334F + var5;
                float var8 = var2.field1451 * 0.33333334F + var6;
                float var9 = (float) var2.field1455.field1453;
                float var10 = var2.field1455.field1456;
                float var11 = var9 - var2.field1455.field1452 * 0.33333334F;
                float var12 = var10 - var2.field1455.field1450 * 0.33333334F;
                if (arg0.field1524) {
                    class122.method3598(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                } else if (arg0 != null) {
                    arg0.field1514 = var5;
                    float var13 = var9 - var5;
                    float var14 = var10 - var6;
                    float var15 = var7 - var5;
                    float var16 = 0.0F;
                    float var17 = 0.0F;
                    if ((double) var15 != 0.0D) {
                        var16 = (var8 - var6) / var15;
                    }
                    float var18 = var9 - var11;
                    if ((double) var18 != 0.0D) {
                        var17 = (var10 - var12) / var18;
                    }
                    float var19 = 1.0F / (var13 * var13);
                    float var20 = var13 * var16;
                    float var21 = var13 * var17;
                    arg0.field1516 = (var20 + var21 - var14 - var14) * var19 / var13;
                    arg0.field1517 = (var14 + var14 + var14 - var20 - var20 - var21) * var19;
                    arg0.field1530 = var16;
                    arg0.field1519 = var6;
                }
                arg0.field1525 = false;
            }
            if (var3) {
                return var2.field1456;
            } else if (var4) {
                return (float) var2.field1453 == arg1 || var2.field1455 == null ? var2.field1456 : var2.field1455.field1456;
            } else if (arg0.field1524) {
                float var22;
                if (arg0 == null) {
                    var22 = 0.0F;
                } else {
                    float var23;
                    if (arg0.field1514 == arg1) {
                        var23 = 0.0F;
                    } else if (arg0.field1522 == arg1) {
                        var23 = 1.0F;
                    } else {
                        var23 = (arg1 - arg0.field1514) / (arg0.field1522 - arg0.field1514);
                    }
                    float var24;
                    if (arg0.field1510) {
                        var24 = var23;
                    } else {
                        class122.field1469[3] = arg0.field1519;
                        class122.field1469[2] = arg0.field1530;
                        class122.field1469[1] = arg0.field1517;
                        class122.field1469[0] = arg0.field1516 - var23;
                        class122.field1466[0] = 0.0F;
                        class122.field1466[1] = 0.0F;
                        class122.field1466[2] = 0.0F;
                        class122.field1466[3] = 0.0F;
                        class122.field1466[4] = 0.0F;
                        int var25 = class428.method2572(class122.field1469, 3, 0.0F, true, 1.0F, true, class122.field1466);
                        if (var25 == 1) {
                            var24 = class122.field1466[0];
                        } else {
                            var24 = 0.0F;
                        }
                    }
                    var22 = ((arg0.field1523 * var24 + arg0.field1518) * var24 + arg0.field1521) * var24 + arg0.field1520;
                }
                return var22;
            } else {
                return class122.method184(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("gz.au(I)[Ley;")
    public static class127[] method3345() {
        return new class127[] { class127.field1536, class127.field1533, class127.field1534, class127.field1539, class127.field1540, class127.field1537 };
    }

    @ObfuscatedName("ns.af(Lsg;B)Ljava/lang/Integer;")
    public static Integer method6013(class489 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method8248();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method8248();
                if (var4 == 255) {
                    break;
                }
                arg0.field4989--;
                if (arg0.method8250() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method8254();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("jn.an(J)Ljava/lang/String;")
    public static String method4639(long arg0) {
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var2 = 0;
            for (long var3 = arg0; var3 != 0L; var3 /= 37L) {
                var2++;
            }
            StringBuilder var5 = new StringBuilder(var2);
            while (arg0 != 0L) {
                long var6 = arg0;
                arg0 /= 37L;
                var5.append(class374.field4386[(int) (var6 - arg0 * 37L)]);
            }
            return var5.reverse().toString();
        }
    }

    @ObfuscatedName("ds.af(I)Z")
    public static boolean method2559() {
        try {
            if (field60 == null) {
                field60 = field78.method2679(new URL(field4295));
            } else if (field60.method2708()) {
                byte[] var0 = field60.method2710();
                class489 var1 = new class489(var0);
                var1.method8254();
                class64.field792 = var1.method8250();
                field179 = new class64[class64.field792];
                int var2 = 0;
                while (var2 < class64.field792) {
                    class64 var3 = field179[var2] = new class64();
                    var3.field802 = var1.method8250();
                    var3.field797 = var1.method8254();
                    var3.field799 = var1.method8259();
                    var3.field800 = var1.method8259();
                    var3.field801 = var1.method8248();
                    var3.field798 = var1.method8445();
                    var3.field805 = var2++;
                }
                class64.method2901(field179, 0, field179.length - 1, class64.field794, class64.field793);
                field60 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            field60 = null;
        }
        return false;
    }

    @ObfuscatedName("sh.an(Lnm;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method8108(class344 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        if (arg0.method6088(arg1, arg2)) {
            int var5 = arg0.method6086(arg1);
            int var6 = arg0.method6075(var5, arg2);
            class298.method1130(arg0, var5, var6, arg3, arg4);
        }
    }

    @ObfuscatedName("px.ac(IB)I")
    public static int method7280(int arg0) {
        return class440.field4720[arg0 & 0x3FFF];
    }

    @ObfuscatedName("cl.ab(IB)I")
    public static int method1733(int arg0) {
        class77 var1 = (class77) class106.field1376.get(arg0);
        return var1 == null ? 0 : var1.method2058();
    }

    @ObfuscatedName("iu.aw(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static String method3941(Throwable arg0) throws IOException {
        String var2;
        if (arg0 instanceof class516) {
            class516 var1 = (class516) arg0;
            var2 = var1.field5158 + " | ";
            arg0 = var1.field5156;
        } else {
            var2 = "";
        }
        StringWriter var3 = new StringWriter();
        PrintWriter var4 = new PrintWriter(var3);
        arg0.printStackTrace(var4);
        var4.close();
        String var5 = var3.toString();
        BufferedReader var6 = new BufferedReader(new StringReader(var5));
        String var7 = var6.readLine();
        while (true) {
            while (true) {
                String var8 = var6.readLine();
                if (var8 == null) {
                    return var2 + "| " + var7;
                }
                int var10 = var8.indexOf(40);
                int var11 = var8.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var8.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var8 = var8.substring(0, var10);
                }
                String var15 = var8.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @ObfuscatedName("fw.an(IS)Lhq;")
    public static class201 method3057(int arg0) {
        class201 var1 = (class201) class201.field2159.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2158.method6090(6, arg0);
        class201 var3 = new class201();
        var3.field2186 = arg0;
        if (var2 != null) {
            var3.method3662(new class489(var2));
        }
        var3.method3661();
        if (var3.field2196) {
            var3.field2178 = 0;
            var3.field2175 = false;
        }
        class201.field2159.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.al(I)Z")
    public static boolean method15() {
        return class298.field3389 == 0 ? field4942.method5219() : true;
    }

    @ObfuscatedName("ms.au(IIIIS)V")
    public static void method5963(int arg0, int arg1, int arg2, int arg3) {
        for (class66 var4 = (class66) class66.field828.method6329(); var4 != null; var4 = (class66) class66.field828.method6338()) {
            if (var4.field822 != -1 || var4.field827 != null) {
                int var5 = 0;
                if (arg1 > var4.field820) {
                    var5 += arg1 - var4.field820;
                } else if (arg1 < var4.field818) {
                    var5 += var4.field818 - arg1;
                }
                if (arg2 > var4.field821) {
                    var5 += arg2 - var4.field821;
                } else if (arg2 < var4.field831) {
                    var5 += var4.field831 - arg2;
                }
                if (var5 - 64 > var4.field816 || field112.method2343() == 0 || var4.field817 != arg0) {
                    if (var4.field824 != null) {
                        field1574.method761(var4.field824);
                        var4.field824 = null;
                    }
                    if (var4.field829 != null) {
                        field1574.method761(var4.field829);
                        var4.field829 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = (var4.field816 - var5) * field112.method2343() / var4.field816;
                    if (var4.field824 != null) {
                        var4.field824.method938(var6);
                    } else if (var4.field822 >= 0) {
                        class40 var7 = class40.method766(field4688, var4.field822, 0);
                        if (var7 != null) {
                            class41 var8 = var7.method767().method780(field2981);
                            class48 var9 = class48.method876(var8, 100, var6);
                            var9.method879(-1);
                            field1574.method739(var9);
                            var4.field824 = var9;
                        }
                    }
                    if (var4.field829 != null) {
                        var4.field829.method938(var6);
                        if (!var4.field829.method7646()) {
                            var4.field829 = null;
                        }
                    } else if (var4.field827 != null && (var4.field823 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field827.length);
                        class40 var11 = class40.method766(field4688, var4.field827[var10], 0);
                        if (var11 != null) {
                            class41 var12 = var11.method767().method780(field2981);
                            class48 var13 = class48.method876(var12, 100, var6);
                            var13.method879(0);
                            field1574.method739(var13);
                            var4.field829 = var13;
                            var4.field823 = var4.field825 + (int) (Math.random() * (double) (var4.field826 - var4.field825));
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("lp.au(Lnm;Ljava/lang/String;Ljava/lang/String;I)Ltc;")
    public static class502 method5194(class344 arg0, String arg1, String arg2) {
        if (!arg0.method6088(arg1, arg2)) {
            return null;
        }
        int var3 = arg0.method6086(arg1);
        int var4 = arg0.method6075(var3, arg2);
        byte[] var5 = arg0.method6090(var3, var4);
        boolean var6;
        if (var5 == null) {
            var6 = false;
        } else {
            class504.method8185(var5);
            var6 = true;
        }
        class502 var7;
        if (var6) {
            var7 = method5989();
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("jz.ac(II)[B")
    public static synchronized byte[] method4975(int arg0) {
        return class387.method6948(arg0, false);
    }

    @ObfuscatedName("dp.ab(IB)Lex;")
    public static class124 method2302(int arg0) {
        class124 var1 = (class124) method3600(class124.method2613(), arg0);
        if (var1 == null) {
            var1 = class124.field1497;
        }
        return var1;
    }

    @ObfuscatedName("js.ai(IIB)V")
    public static void method4757(int arg0, int arg1) {
        int var2 = class219.field2515.field2793[0];
        int var3 = var2 / field5061;
        int var4 = var2 - field5061 * var3;
        class219.field2515.method4567(arg0, var4, arg1, var3);
    }

    @ObfuscatedName("az.ar(IIIIIIFFFIIIIIIIIIIIIIS)V")
    public static void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        class219.field2520.method4153(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
    }

    @ObfuscatedName("mk.al(B)Ltc;")
    public static class502 method5989() {
        class502 var0 = new class502();
        var0.field5079 = field5100;
        var0.field5085 = field5099;
        var0.field5086 = field5101[0];
        var0.field5084 = field94[0];
        var0.field5081 = field1302[0];
        var0.field5082 = field1644[0];
        var0.field5080 = field4525;
        var0.field5083 = field2113[0];
        class504.method7059();
        return var0;
    }

    @ObfuscatedName("df.bz(I)V")
    public static final void method2498() {
        field4547.method3186();
        for (int var0 = 0; var0 < 32; var0++) {
            class35.field218[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class35.field206[var1] = 0L;
        }
        field3738 = 0;
    }

    @ObfuscatedName("oa.ah(IIB)I")
    public static final int method6890(int arg0, int arg1) {
        int var2 = class78.method2276(arg0 - 1, arg1 - 1) + class78.method2276(arg0 + 1, arg1 - 1) + class78.method2276(arg0 - 1, arg1 + 1) + class78.method2276(arg0 + 1, arg1 + 1);
        int var3 = class78.method2276(arg0 - 1, arg1) + class78.method2276(arg0 + 1, arg1) + class78.method2276(arg0, arg1 - 1) + class78.method2276(arg0, arg1 + 1);
        int var4 = class78.method2276(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @ObfuscatedName("jn.ax(ILch;ZI)I")
    public static int method4637(int arg0, class75 arg1, boolean arg2) {
        class317 var3 = arg2 ? field329 : field6;
        if (arg0 == 1500) {
            class67.field843[++field836 - 1] = var3.field3661;
            return 1;
        } else if (arg0 == 1501) {
            class67.field843[++field836 - 1] = var3.field3715;
            return 1;
        } else if (arg0 == 1502) {
            class67.field843[++field836 - 1] = var3.field3572;
            return 1;
        } else if (arg0 == 1503) {
            class67.field843[++field836 - 1] = var3.field3586;
            return 1;
        } else if (arg0 == 1504) {
            class67.field843[++field836 - 1] = var3.field3590 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            class67.field843[++field836 - 1] = var3.field3589;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bd.aj(ILch;ZB)I")
    public static int method706(int arg0, class75 arg1, boolean arg2) {
        class317 var3 = class317.method3201(class67.field843[--field836]);
        if (arg0 == 2600) {
            class67.field843[++field836 - 1] = var3.field3591;
            return 1;
        } else if (arg0 == 2601) {
            class67.field843[++field836 - 1] = var3.field3592;
            return 1;
        } else if (arg0 == 2602) {
            class67.field842[++field1015 - 1] = var3.field3716;
            return 1;
        } else if (arg0 == 2603) {
            class67.field843[++field836 - 1] = var3.field3593;
            return 1;
        } else if (arg0 == 2604) {
            class67.field843[++field836 - 1] = var3.field3594;
            return 1;
        } else if (arg0 == 2605) {
            class67.field843[++field836 - 1] = var3.field3619;
            return 1;
        } else if (arg0 == 2606) {
            class67.field843[++field836 - 1] = var3.field3622;
            return 1;
        } else if (arg0 == 2607) {
            class67.field843[++field836 - 1] = var3.field3711;
            return 1;
        } else if (arg0 == 2608) {
            class67.field843[++field836 - 1] = var3.field3566;
            return 1;
        } else if (arg0 == 2609) {
            class67.field843[++field836 - 1] = var3.field3601;
            return 1;
        } else if (arg0 == 2610) {
            class67.field843[++field836 - 1] = var3.field3602;
            return 1;
        } else if (arg0 == 2611) {
            class67.field843[++field836 - 1] = var3.field3595;
            return 1;
        } else if (arg0 == 2612) {
            class67.field843[++field836 - 1] = var3.field3596;
            return 1;
        } else if (arg0 == 2613) {
            class67.field843[++field836 - 1] = var3.field3600.method39();
            return 1;
        } else if (arg0 == 2614) {
            class67.field843[++field836 - 1] = var3.field3630 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class310 var4 = var3.method5799();
                class67.field843[++field836 - 1] = var4 == null ? 0 : var4.field3494;
            }
            if (arg0 == 2618) {
                class310 var5 = var3.method5799();
                class67.field843[++field836 - 1] = var5 == null ? 0 : var5.field3490;
                return 1;
            } else if (arg0 == 2619) {
                class315 var6 = var3.method5797();
                class67.field842[++field1015 - 1] = var6 == null ? "" : var6.method5541().method6623();
                return 1;
            } else if (arg0 == 2620) {
                class310 var7 = var3.method5799();
                class67.field843[++field836 - 1] = var7 == null ? 0 : var7.field3492;
                return 1;
            } else if (arg0 == 2621) {
                class315 var8 = var3.method5797();
                class67.field843[++field836 - 1] = var8 == null ? 0 : var8.method5551();
                return 1;
            } else if (arg0 == 2622) {
                class315 var9 = var3.method5797();
                class67.field843[++field836 - 1] = var9 == null ? 0 : var9.method5734();
                return 1;
            } else if (arg0 == 2623) {
                class315 var10 = var3.method5797();
                class67.field843[++field836 - 1] = var10 == null ? 0 : var10.method5504();
                return 1;
            } else if (arg0 == 2624) {
                class315 var11 = var3.method5797();
                class67.field843[++field836 - 1] = var11 != null && var11.method5543() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class315 var12 = var3.method5797();
                class67.field843[++field836 - 1] = var12 != null && var12.method5544() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class315 var13 = var3.method5797();
                class67.field842[++field1015 - 1] = var13 == null ? "" : var13.method5542().method6872();
                return 1;
            } else if (arg0 == 2627) {
                class315 var14 = var3.method5797();
                int var15 = var14 == null ? 0 : var14.method5547();
                int var16 = var14 == null ? 0 : var14.method5546();
                class67.field843[++field836 - 1] = Math.min(var15, var16);
                class67.field843[++field836 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class315 var17 = var3.method5797();
                class67.field843[++field836 - 1] = var17 == null ? 0 : var17.method5546();
                return 1;
            } else if (arg0 == 2629) {
                class315 var18 = var3.method5797();
                class67.field843[++field836 - 1] = var18 == null ? 0 : var18.method5553();
                return 1;
            } else if (arg0 == 2630) {
                class315 var19 = var3.method5797();
                class67.field843[++field836 - 1] = var19 == null ? 0 : var19.method5554();
                return 1;
            } else if (arg0 == 2631) {
                class315 var20 = var3.method5797();
                class67.field843[++field836 - 1] = var20 == null ? 0 : var20.method5556();
                return 1;
            } else if (arg0 == 2632) {
                class315 var21 = var3.method5797();
                class67.field843[++field836 - 1] = var21 == null ? 0 : var21.method5557();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method5772();
                class67.field843[field836 - 1] = var22 == null ? 0 : var22.method402(class67.field843[field836 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method5772();
                class67.field843[field836 - 1] = var23 == null ? 0 : var23.method403((char) class67.field843[field836 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("ct.iy(Ljava/lang/String;I)V")
    public static final void method2046(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            field112.method2326(!field112.method2391());
            if (field112.method2391()) {
                class106.method2767(99, "", "Roofs are now all hidden");
            } else {
                class106.method2767(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class372.method5157(arg0.substring(5).trim()) == 1;
            field466.method524(var1);
            class219.method5552(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            client.field518 = !client.field518;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field112.method2321();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            client.field615 = !client.field615;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            client.field644 = !client.field644;
        }
        if (client.field682 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                field1542.field4867 = !field1542.field4867;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field112.method2361(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field112.method2361(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                client.method6209();
            }
        }
        class289 var2 = class289.method5974(class287.field3181, client.field753.field1385);
        var2.field3212.method8285(arg0.length() + 1);
        var2.field3212.method8238(arg0);
        client.field753.method2650(var2);
    }

    @ObfuscatedName("am.iz(II)I")
    public static final int method283(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("ib.bs(II)I")
    public static int method4548(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("ii.cs(ILlb;ZB)V")
    public static void method4141(int arg0, class308 arg1, boolean arg2) {
        class249 var3 = client.method2239().method7747(arg0);
        int var4 = field3454.field1106;
        int var5 = (field3454.field1171 >> 7) + field2850;
        int var6 = (field3454.field1138 >> 7) + field2841;
        class308 var7 = new class308(var4, var5, var6);
        client.method2239().method7756(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("fv.kb(ZLsq;I)V")
    public static final void method3070(boolean arg0, class488 arg1) {
        client.field617 = 0;
        client.field549 = 0;
        client.method460(arg1);
        client.method3954(arg0, arg1);
        for (int var2 = 0; var2 < client.field549; var2++) {
            int var3 = client.field550[var2];
            class96 var4 = client.field546[var3];
            int var5 = arg1.method8248();
            if ((var5 & 0x80) != 0) {
                int var6 = arg1.method8248();
                var5 += var6 << 8;
            }
            if ((var5 & 0x100) != 0) {
                int var7 = arg1.method8248();
                var5 += var7 << 16;
            }
            if ((var5 & 0x40) != 0) {
                int var8 = arg1.method8250();
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = arg1.method8281();
                if (var4.field1202 == var8 && var8 != -1) {
                    int var10 = class204.method2139(var8).field2315;
                    if (var10 == 1) {
                        var4.field1182 = 0;
                        var4.field1183 = 0;
                        var4.field1184 = var9;
                        var4.field1185 = 0;
                    }
                    if (var10 == 2) {
                        var4.field1185 = 0;
                    }
                } else if (var8 == -1 || var4.field1202 == -1 || class204.method2139(var8).field2294 >= class204.method2139(var4.field1202).field2294) {
                    var4.field1202 = var8;
                    var4.field1182 = 0;
                    var4.field1183 = 0;
                    var4.field1184 = var9;
                    var4.field1185 = 0;
                    var4.field1211 = var4.field1206;
                }
            }
            if ((var5 & 0x20) != 0) {
                var4.field1160 = arg1.method8250();
                var4.field1160 += arg1.method8281() << 16;
                int var11 = 16777215;
                if (var4.field1160 == var11) {
                    var4.field1160 = -1;
                }
            }
            if ((var5 & 0x2) != 0) {
                var4.field1149 = arg1.method8259();
                var4.field1161 = 100;
            }
            if ((var5 & 0x4) != 0) {
                int var12 = arg1.method8248();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = arg1.method8417();
                        if (var17 == 32767) {
                            var17 = arg1.method8417();
                            var15 = arg1.method8417();
                            var14 = arg1.method8417();
                            var16 = arg1.method8417();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = arg1.method8417();
                        }
                        int var18 = arg1.method8417();
                        var4.method2250(var17, var15, var14, var16, client.field602, var18);
                    }
                }
                int var19 = arg1.method8282();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = arg1.method8417();
                        int var22 = arg1.method8417();
                        if (var22 == 32767) {
                            var4.method2260(var21);
                        } else {
                            int var23 = arg1.method8417();
                            int var24 = arg1.method8248();
                            int var25 = var22 > 0 ? arg1.method8282() : var24;
                            var4.method2258(var21, client.field602, var22, var23, var24, var25);
                        }
                    }
                }
            }
            if ((var5 & 0x8) != 0) {
                var4.field1277 = class191.method6098(arg1.method8291());
                client.method3048(var4);
                var4.method2479();
            }
            if ((var5 & 0x1) != 0) {
                int var26 = arg1.method8250();
                int var27 = arg1.method8302();
                var4.method2255(0, var26, var27 >> 16, var27 & 0xFFFF);
            }
            if ((var5 & 0x10) != 0) {
                int var28 = arg1.method8290();
                int var29 = arg1.method8290();
                var4.field1143 = arg1.method8281() == 1;
                if (client.field498 >= 212) {
                    var4.field1198 = var28;
                    var4.field1175 = var29;
                } else {
                    int var30 = var4.field1171 - (var28 - field2850 - field2850) * 64;
                    int var31 = var4.field1138 - (var29 - field2841 - field2841) * 64;
                    if (var30 != 0 || var31 != 0) {
                        int var33 = (int) (Math.atan2((double) var30, (double) var31) * 325.94932345220167D) & 0x7FF;
                        var4.field1173 = var33;
                    }
                }
            }
            if ((var5 & 0x4000) != 0) {
                var4.field1188 = arg1.method8249();
                var4.field1190 = arg1.method8424();
                var4.field1189 = arg1.method8424();
                var4.field1208 = arg1.method8424();
                var4.field1192 = arg1.method8290() + client.field602;
                var4.field1193 = arg1.method8327() + client.field602;
                var4.field1194 = arg1.method8291();
                var4.field1206 = 1;
                var4.field1211 = 0;
                var4.field1188 += var4.field1174[0];
                var4.field1190 += var4.field1176[0];
                var4.field1189 += var4.field1174[0];
                var4.field1208 += var4.field1176[0];
            }
            if ((var5 & 0x8000) != 0) {
                var4.field1212 = arg1.method8254();
            }
            if ((var5 & 0x800) != 0) {
                var4.field1169 = client.field602 + arg1.method8327();
                var4.field1157 = client.field602 + arg1.method8250();
                var4.field1181 = arg1.method8378();
                var4.field1200 = arg1.method8424();
                var4.field1201 = arg1.method8284();
                var4.field1209 = (byte) arg1.method8231();
            }
            if ((var5 & 0x200) != 0) {
                var4.method2435(arg1.method8259());
            }
            if ((var5 & 0x2000) != 0) {
                var4.method2483(arg1.method8248());
            }
            if ((var5 & 0x1000) != 0) {
                int var34 = arg1.method8231();
                if ((var34 & 0x1) == 1) {
                    var4.method2488();
                } else {
                    int[] var35 = null;
                    if ((var34 & 0x2) == 2) {
                        int var36 = arg1.method8231();
                        var35 = new int[var36];
                        for (int var37 = 0; var37 < var36; var37++) {
                            int var38 = arg1.method8250();
                            int var39 = var38 == 65535 ? -1 : var38;
                            var35[var37] = var39;
                        }
                    }
                    short[] var40 = null;
                    if ((var34 & 0x4) == 4) {
                        int var41 = 0;
                        if (var4.field1277.field2027 != null) {
                            var41 = var4.field1277.field2027.length;
                        }
                        var40 = new short[var41];
                        for (int var42 = 0; var42 < var41; var42++) {
                            var40[var42] = (short) arg1.method8327();
                        }
                    }
                    short[] var43 = null;
                    if ((var34 & 0x8) == 8) {
                        int var44 = 0;
                        if (var4.field1277.field2035 != null) {
                            var44 = var4.field1277.field2035.length;
                        }
                        var43 = new short[var44];
                        for (int var45 = 0; var45 < var44; var45++) {
                            var43[var45] = (short) arg1.method8290();
                        }
                    }
                    boolean var46 = false;
                    if ((var34 & 0x10) != 0) {
                        var46 = arg1.method8248() == 1;
                    }
                    long var47 = (long) (++class96.field1275 - 1);
                    var4.method2447(new class190(var47, var35, var40, var43, var46));
                }
            }
            if ((var5 & 0x400) != 0) {
                int var49 = arg1.method8281();
                if ((var49 & 0x1) == 1) {
                    var4.method2451();
                } else {
                    int[] var50 = null;
                    if ((var49 & 0x2) == 2) {
                        int var51 = arg1.method8281();
                        var50 = new int[var51];
                        for (int var52 = 0; var52 < var51; var52++) {
                            int var53 = arg1.method8291();
                            int var54 = var53 == 65535 ? -1 : var53;
                            var50[var52] = var54;
                        }
                    }
                    short[] var55 = null;
                    if ((var49 & 0x4) == 4) {
                        int var56 = 0;
                        if (var4.field1277.field2027 != null) {
                            var56 = var4.field1277.field2027.length;
                        }
                        var55 = new short[var56];
                        for (int var57 = 0; var57 < var56; var57++) {
                            var55[var57] = (short) arg1.method8327();
                        }
                    }
                    short[] var58 = null;
                    if ((var49 & 0x8) == 8) {
                        int var59 = 0;
                        if (var4.field1277.field2035 != null) {
                            var59 = var4.field1277.field2035.length;
                        }
                        var58 = new short[var59];
                        for (int var60 = 0; var60 < var59; var60++) {
                            var58[var60] = (short) arg1.method8291();
                        }
                    }
                    boolean var61 = false;
                    if ((var49 & 0x10) != 0) {
                        var61 = arg1.method8248() == 1;
                    }
                    long var62 = (long) (++class96.field1278 - 1);
                    var4.method2449(new class190(var62, var50, var55, var58, var61));
                }
            }
            if ((var5 & 0x20000) != 0) {
                int var64 = arg1.method8231();
                int[] var65 = new int[8];
                short[] var66 = new short[8];
                for (int var67 = 0; var67 < 8; var67++) {
                    if ((var64 & 0x1 << var67) == 0) {
                        var65[var67] = -1;
                        var66[var67] = -1;
                    } else {
                        var65[var67] = arg1.method8300();
                        var66[var67] = (short) arg1.method8265();
                    }
                }
                var4.method2464(var65, var66);
            }
            if ((var5 & 0x40000) != 0) {
                int var68 = arg1.method8254();
                var4.field1137 = (var68 & 0x1) == 0 ? var4.field1277.field2018 : arg1.method8250();
                var4.field1167 = (var68 & 0x2) == 0 ? var4.field1277.field2019 : arg1.method8250();
                var4.field1146 = (var68 & 0x4) == 0 ? var4.field1277.field2020 : arg1.method8291();
                var4.field1147 = (var68 & 0x8) == 0 ? var4.field1277.field2021 : arg1.method8250();
                var4.field1148 = (var68 & 0x10) == 0 ? var4.field1277.field2022 : arg1.method8250();
                var4.field1155 = (var68 & 0x20) == 0 ? var4.field1277.field2023 : arg1.method8250();
                var4.field1150 = (var68 & 0x40) == 0 ? var4.field1277.field2049 : arg1.method8250();
                var4.field1151 = (var68 & 0x80) == 0 ? var4.field1277.field2009 : arg1.method8327();
                var4.field1152 = (var68 & 0x100) == 0 ? var4.field1277.field2026 : arg1.method8327();
                var4.field1153 = (var68 & 0x200) == 0 ? var4.field1277.field2038 : arg1.method8327();
                var4.field1154 = (var68 & 0x400) == 0 ? var4.field1277.field2024 : arg1.method8250();
                var4.field1197 = (var68 & 0x800) == 0 ? var4.field1277.field2029 : arg1.method8250();
                var4.field1156 = (var68 & 0x1000) == 0 ? var4.field1277.field2030 : arg1.method8290();
                var4.field1158 = (var68 & 0x2000) == 0 ? var4.field1277.field2031 : arg1.method8291();
                var4.field1139 = (var68 & 0x4000) == 0 ? var4.field1277.field2050 : arg1.method8290();
            }
            if ((var5 & 0x10000) != 0) {
                int var69 = arg1.method8281();
                for (int var70 = 0; var70 < var69; var70++) {
                    int var71 = arg1.method8231();
                    int var72 = arg1.method8291();
                    int var73 = arg1.method8302();
                    var4.method2255(var71, var72, var73 >> 16, var73 & 0xFFFF);
                }
            }
        }
        for (int var74 = 0; var74 < client.field617; var74++) {
            int var75 = client.field618[var74];
            if (client.field602 != client.field546[var75].field1195) {
                client.field546[var75].field1277 = null;
                client.field546[var75] = null;
            }
        }
        if (client.field753.field1388 != arg1.field4989) {
            throw new RuntimeException(arg1.field4989 + class97.field1295 + client.field753.field1388);
        }
        for (int var76 = 0; var76 < client.field737; var76++) {
            if (client.field546[client.field548[var76]] == null) {
                throw new RuntimeException(var76 + class97.field1295 + client.field737);
            }
        }
    }

    @ObfuscatedName("ck.nt(Ljava/lang/String;B)V")
    public static void method1095(String arg0) {
        field1404 = arg0;
        try {
            String var1 = field466.getParameter(Integer.toString(18));
            String var2 = field466.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class322.method3026(class294.method2504() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class27.method385(field466, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("cf.ox(ZI)V")
    public static void method1156(boolean arg0) {
        client.field631 = arg0;
    }
}
