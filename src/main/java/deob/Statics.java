package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.DataInputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Statics {

    @ObfuscatedName("du.jc")
    public static int field1038;

    @ObfuscatedName("du.fi")
    public static class357 field1039;

    @ObfuscatedName("du.at")
    public static short[][][] field1041;

    @ObfuscatedName("du.aq")
    public static int[] field1042;

    @ObfuscatedName("dn.ds")
    public static class528[] field1057;

    @ObfuscatedName("dn.iq")
    public static class394 field1058;

    @ObfuscatedName("dg.ks")
    public static class529[] field1064;

    @ObfuscatedName("dd.ap")
    public static class528 field1069;

    @ObfuscatedName("da.bk")
    public static FontMetrics field1077;

    @ObfuscatedName("da.dt")
    public static class528 field1078;

    @ObfuscatedName("dt.ja")
    public static int field1106;

    @ObfuscatedName("dk.bg")
    public static class446 field1118;

    @ObfuscatedName("av.wb")
    public static class483 field114;

    @ObfuscatedName("av.ae")
    public static long field115;

    @ObfuscatedName("df.fy")
    public static class357 field1158;

    @ObfuscatedName("av.pr")
    public static int field117;

    @ObfuscatedName("av.af")
    public static class45 field118;

    @ObfuscatedName("dv.ub")
    public static int field1183;

    @ObfuscatedName("ak.gp")
    public static int field124;

    @ObfuscatedName("ak.uw")
    public static int field125;

    @ObfuscatedName("do.ik")
    public static class394 field1279;

    @ObfuscatedName("do.ai")
    public static int[] field1281;

    @ObfuscatedName("dm.mn")
    public static int field1321;

    @ObfuscatedName("dm.aa")
    public static int field1323;

    @ObfuscatedName("dm.ls")
    public static int field1324;

    @ObfuscatedName("de.bc")
    public static class446 field1344;

    @ObfuscatedName("dc.fr")
    public static class357 field1352;

    @ObfuscatedName("dc.bl")
    public static class526 field1358;

    @ObfuscatedName("ak.rb")
    public static class110 field137;

    @ObfuscatedName("ey.ae")
    public static String field1370;

    @ObfuscatedName("ey.fw")
    public static class357 field1372;

    @ObfuscatedName("ee.uq")
    public static int field1375;

    @ObfuscatedName("ee.sg")
    public static class155 field1391;

    @ObfuscatedName("ej.gr")
    public static String field1417;

    @ObfuscatedName("ea.as")
    public static String field1423;

    @ObfuscatedName("er.ab")
    public static int field1425;

    @ObfuscatedName("ev.je")
    public static int field1448;

    @ObfuscatedName("bj.gx")
    public static String field145;

    @ObfuscatedName("ez.as")
    public static int field1450;

    @ObfuscatedName("ez.am")
    public static int field1453;

    @ObfuscatedName("et.ad")
    public static short[] field1459;

    @ObfuscatedName("en.vv")
    public static int field1460;

    @ObfuscatedName("es.jx")
    public static byte[][] field1476;

    @ObfuscatedName("ef.kh")
    public static int field1485;

    @ObfuscatedName("ec.ar")
    public static class528 field1492;

    @ObfuscatedName("eg.lw")
    public static int field1495;

    @ObfuscatedName("eg.jh")
    public static int field1500;

    @ObfuscatedName("eg.iy")
    public static long field1502;

    @ObfuscatedName("ex.ee")
    public static class89 field1505;

    @ObfuscatedName("ex.fe")
    public static class181 field1511;

    @ObfuscatedName("ew.al")
    public static int[] field1537;

    @ObfuscatedName("ew.sy")
    public static class534 field1540;

    @ObfuscatedName("ep.mt")
    public static class237 field1545;

    @ObfuscatedName("ep.kz")
    public static int field1546;

    @ObfuscatedName("ep.gf")
    public static int field1547;

    @ObfuscatedName("fh.jb")
    public static class231 field1570;

    @ObfuscatedName("fs.wu")
    public static long field1606;

    @ObfuscatedName("fl.kc")
    public static int field1609;

    @ObfuscatedName("fe.qj")
    public static int field1612;

    @ObfuscatedName("fj.cg")
    public static int field1616;

    @ObfuscatedName("bk.fo")
    public static class357 field162;

    @ObfuscatedName("fv.ad")
    public static int field1625;

    @ObfuscatedName("fv.ap")
    public static ThreadPoolExecutor field1626;

    @ObfuscatedName("bk.wn")
    public static int field163;

    @ObfuscatedName("fb.ix")
    public static int field1644;

    @ObfuscatedName("fr.ag")
    public static class98 field1650;

    @ObfuscatedName("fr.rj")
    public static class455 field1655;

    @ObfuscatedName("fr.km")
    public static int field1656;

    @ObfuscatedName("fq.aq")
    public static short[][] field1660;

    @ObfuscatedName("fp.fc")
    public static class357 field1666;

    @ObfuscatedName("bt.he")
    public static String field167;

    @ObfuscatedName("fu.cd")
    public static class374 field1676;

    @ObfuscatedName("fu.fa")
    public static class357 field1677;

    @ObfuscatedName("bt.al")
    public static int field168;

    @ObfuscatedName("fn.ol")
    public static class332 field1682;

    @ObfuscatedName("fx.ff")
    public static class357 field1692;

    @ObfuscatedName("ff.aw")
    public static int[] field1699;

    @ObfuscatedName("fm.bw")
    public static String field1715;

    @ObfuscatedName("fy.ac")
    public static int[] field1716;

    @ObfuscatedName("fy.kd")
    public static class529[] field1718;

    @ObfuscatedName("bd.ug")
    public static int field174;

    @ObfuscatedName("fa.bt")
    public static class359 field1755;

    @ObfuscatedName("gu.wl")
    public static short[] field1761;

    @ObfuscatedName("gc.gt")
    public static String field1763;

    @ObfuscatedName("gc.iz")
    public static int field1768;

    @ObfuscatedName("gm.qw")
    public static int field1778;

    @ObfuscatedName("gi.tm")
    public static class39 field1794;

    @ObfuscatedName("gi.aa")
    public static int[][] field1795;

    @ObfuscatedName("gi.qv")
    public static class332[] field1798;

    @ObfuscatedName("az.wi")
    public static class443 field18;

    @ObfuscatedName("bs.um")
    public static int field181;

    @ObfuscatedName("ge.ki")
    public static class529 field1826;

    @ObfuscatedName("ge.ai")
    public static Thread field1831;

    @ObfuscatedName("gh.au")
    public static String field1854;

    @ObfuscatedName("gy.ai")
    public static byte[][][] field1856;

    @ObfuscatedName("gp.ac")
    public static File field1862;

    @ObfuscatedName("gp.ai")
    public static int field1863;

    @ObfuscatedName("gp.ab")
    public static int field1867;

    @ObfuscatedName("gp.am")
    public static String[] field1868;

    @ObfuscatedName("gp.at")
    public static File field1870;

    @ObfuscatedName("ga.ae")
    public static File field1872;

    @ObfuscatedName("gx.ac")
    public static class68[] field1879;

    @ObfuscatedName("bs.un")
    public static int field189;

    @ObfuscatedName("gq.ay")
    public static int field1890;

    @ObfuscatedName("gt.ko")
    public static class529[] field1895;

    @ObfuscatedName("ho.jw")
    public static int[] field1917;

    @ObfuscatedName("ho.ef")
    public static boolean field1924;

    @ObfuscatedName("hi.ae")
    public static int field1934;

    @ObfuscatedName("hi.au")
    public static class359 field1936;

    @ObfuscatedName("hi.ai")
    public static class359 field1937;

    @ObfuscatedName("hi.uk")
    public static int field1938;

    @ObfuscatedName("hd.ae")
    public static class188[] field1941;

    @ObfuscatedName("hd.ao")
    public static int field1942;

    @ObfuscatedName("hd.au")
    public static class359 field1953;

    @ObfuscatedName("hd.uc")
    public static int field1964;

    @ObfuscatedName("hd.gu")
    public static class357 field1965;

    @ObfuscatedName("hk.dy")
    public static class528 field1967;

    @ObfuscatedName("hk.wz")
    public static List field1973;

    @ObfuscatedName("hk.au")
    public static class359 field1975;

    @ObfuscatedName("hk.if")
    public static class181 field1977;

    @ObfuscatedName("hz.au")
    public static class359 field1978;

    @ObfuscatedName("hz.ae")
    public static class359 field1979;

    @ObfuscatedName("hz.ao")
    public static int field1981;

    @ObfuscatedName("hl.au")
    public static class359 field1992;

    @ObfuscatedName("hg.jo")
    public static int[] field2005;

    @ObfuscatedName("bm.au")
    public static class172 field201;

    @ObfuscatedName("hu.au")
    public static class359 field2015;

    @ObfuscatedName("bm.az")
    public static int field202;

    @ObfuscatedName("hq.hr")
    public static int[] field2030;

    @ObfuscatedName("hw.ae")
    public static class359 field2032;

    @ObfuscatedName("hw.ao")
    public static class359 field2033;

    @ObfuscatedName("hw.kk")
    public static int field2069;

    @ObfuscatedName("hy.ab")
    public static class528 field2084;

    @ObfuscatedName("hy.td")
    public static class164 field2085;

    @ObfuscatedName("hp.ju")
    public static byte[][] field2095;

    @ObfuscatedName("ha.ae")
    public static class359 field2097;

    @ObfuscatedName("ha.sl")
    public static boolean field2103;

    @ObfuscatedName("ha.au")
    public static class359 field2110;

    @ObfuscatedName("hs.au")
    public static class359 field2113;

    @ObfuscatedName("hf.ce")
    public static String field2122;

    @ObfuscatedName("hb.us")
    public static int field2128;

    @ObfuscatedName("hb.au")
    public static class359 field2129;

    @ObfuscatedName("hb.mo")
    public static class92 field2132;

    @ObfuscatedName("hx.au")
    public static class359 field2138;

    @ObfuscatedName("hx.an")
    public static int field2139;

    @ObfuscatedName("hc.am")
    public static int[] field2141;

    @ObfuscatedName("hc.au")
    public static class359 field2144;

    @ObfuscatedName("hm.ae")
    public static class359 field2147;

    @ObfuscatedName("hm.ao")
    public static class359 field2149;

    @ObfuscatedName("hm.au")
    public static class359 field2165;

    @ObfuscatedName("hv.ao")
    public static class359 field2172;

    @ObfuscatedName("hv.ae")
    public static class359 field2174;

    @ObfuscatedName("hn.az")
    public static class359 field2228;

    @ObfuscatedName("hn.ap")
    public static boolean field2229;

    @ObfuscatedName("bm.by")
    public static Image field223;

    @ObfuscatedName("hn.aa")
    public static int[] field2286;

    @ObfuscatedName("hr.kq")
    public static class529[] field2290;

    @ObfuscatedName("hr.au")
    public static class359 field2302;

    @ObfuscatedName("in.ap")
    public static byte[][][] field2410;

    @ObfuscatedName("ih.au")
    public static class217[] field2413;

    @ObfuscatedName("it.bw")
    public static client field2415;

    @ObfuscatedName("it.ai")
    public static class528 field2418;

    @ObfuscatedName("iy.al")
    public static class52 field2474;

    @ObfuscatedName("if.ar")
    public static int[] field2496;

    @ObfuscatedName("bf.uf")
    public static int field253;

    @ObfuscatedName("im.ac")
    public static short[][][] field2544;

    @ObfuscatedName("im.gc")
    public static class357 field2546;

    @ObfuscatedName("iu.dl")
    public static class528 field2562;

    @ObfuscatedName("iv.cv")
    public static int field2565;

    @ObfuscatedName("iv.av")
    public static int field2568;

    @ObfuscatedName("iv.ag")
    public static int field2579;

    @ObfuscatedName("bq.aj")
    public static String field258;

    @ObfuscatedName("iv.cu")
    public static int field2580;

    @ObfuscatedName("iv.ax")
    public static int field2581;

    @ObfuscatedName("iv.ah")
    public static int field2582;

    @ObfuscatedName("iv.as")
    public static int field2583;

    @ObfuscatedName("iv.aj")
    public static int field2585;

    @ObfuscatedName("iv.aw")
    public static int field2587;

    @ObfuscatedName("iv.ak")
    public static int field2588;

    @ObfuscatedName("iv.bh")
    public static int field2589;

    @ObfuscatedName("iv.bj")
    public static int field2590;

    @ObfuscatedName("iv.bv")
    public static int field2592;

    @ObfuscatedName("iv.ce")
    public static boolean[][] field2593;

    @ObfuscatedName("ap.aq")
    public static int field26;

    @ObfuscatedName("iv.co")
    public static int field2605;

    @ObfuscatedName("iv.am")
    public static int field2617;

    @ObfuscatedName("iv.ay")
    public static int field2620;

    @ObfuscatedName("iv.cq")
    public static int field2624;

    @ObfuscatedName("iv.cp")
    public static int field2625;

    @ObfuscatedName("iv.cl")
    public static int field2628;

    @ObfuscatedName("iv.bk")
    public static int field2629;

    @ObfuscatedName("jt.af")
    public static int field2643;

    @ObfuscatedName("ba.sh")
    public static class429 field265;

    @ObfuscatedName("jn.nc")
    public static int field2650;

    @ObfuscatedName("jr.ce")
    public static int field2762;

    @ObfuscatedName("jr.cp")
    public static int field2764;

    @ObfuscatedName("jr.cq")
    public static int field2777;

    @ObfuscatedName("jc.ac")
    public static int field2780;

    @ObfuscatedName("jc.aa")
    public static int field2782;

    @ObfuscatedName("jc.az")
    public static int field2786;

    @ObfuscatedName("jc.ad")
    public static int field2788;

    @ObfuscatedName("jc.ai")
    public static int field2794;

    @ObfuscatedName("ja.ul")
    public static int field2801;

    @ObfuscatedName("jg.an")
    public static class332 field2809;

    @ObfuscatedName("jq.az")
    public static byte[][][] field2834;

    @ObfuscatedName("jw.ar")
    public static class496[] field2855;

    @ObfuscatedName("jy.ar")
    public static class332 field2872;

    @ObfuscatedName("jb.cf")
    public static class347 field2883;

    @ObfuscatedName("jb.af")
    public static class115 field2886;

    @ObfuscatedName("jf.op")
    public static int field2917;

    @ObfuscatedName("bb.ac")
    public static int field294;

    @ObfuscatedName("bb.ap")
    public static ScheduledExecutorService field296;

    @ObfuscatedName("kt.ap")
    public static int field2968;

    @ObfuscatedName("bb.aa")
    public static int field297;

    @ObfuscatedName("ki.th")
    public static boolean field2974;

    @ObfuscatedName("ko.cp")
    public static int field2997;

    @ObfuscatedName("ko.cn")
    public static class348 field2998;

    @ObfuscatedName("ka.fb")
    public static long field3043;

    @ObfuscatedName("bb.fx")
    public static class357 field305;

    @ObfuscatedName("bb.ai")
    public static boolean field309;

    @ObfuscatedName("lm.az")
    public static int field3101;

    @ObfuscatedName("lp.gs")
    public static String field3106;

    @ObfuscatedName("ly.ak")
    public static class332[][] field3229;

    @ObfuscatedName("ly.ip")
    public static class484 field3231;

    @ObfuscatedName("be.ad")
    public static class528 field330;

    @ObfuscatedName("bi.aa")
    public static int field335;

    @ObfuscatedName("ln.va")
    public static class69 field3367;

    @ObfuscatedName("ln.kj")
    public static class528[] field3371;

    @ObfuscatedName("lv.au")
    public static long field3379;

    @ObfuscatedName("lj.uz")
    public static int field3398;

    @ObfuscatedName("bi.dd")
    public static class528[] field340;

    @ObfuscatedName("lz.au")
    public static class359 field3400;

    @ObfuscatedName("lz.ae")
    public static class359 field3401;

    @ObfuscatedName("lz.ao")
    public static class359 field3404;

    @ObfuscatedName("lh.wc")
    public static class360 field3463;

    @ObfuscatedName("mh.cq")
    public static String field3479;

    @ObfuscatedName("mh.da")
    public static class528[] field3484;

    @ObfuscatedName("mq.bh")
    public static boolean[] field3509;

    @ObfuscatedName("mq.nh")
    public static int field3510;

    @ObfuscatedName("bx.ra")
    public static class498 field352;

    @ObfuscatedName("mk.fq")
    public static class357 field3526;

    @ObfuscatedName("bx.bk")
    public static class359 field353;

    @ObfuscatedName("me.az")
    public static int[] field3530;

    @ObfuscatedName("bx.jr")
    public static int field354;

    @ObfuscatedName("mz.at")
    public static int[] field3541;

    @ObfuscatedName("mc.aa")
    public static byte[][] field3547;

    @ObfuscatedName("mw.qq")
    public static int field3560;

    @ObfuscatedName("mt.al")
    public static short[] field3579;

    @ObfuscatedName("mt.an")
    public static short[][] field3587;

    @ObfuscatedName("mm.ud")
    public static class58 field3625;

    @ObfuscatedName("mn.ad")
    public static class183 field3798;

    @ObfuscatedName("my.au")
    public static class334 field3805;

    @ObfuscatedName("nq.ao")
    public static int field3817;

    @ObfuscatedName("nl.an")
    public static class528 field3851;

    @ObfuscatedName("nd.gk")
    public static int field3863;

    @ObfuscatedName("ng.ou")
    public static class332 field3869;

    @ObfuscatedName("ng.gm")
    public static class357 field3870;

    @ObfuscatedName("nt.ui")
    public static int field3875;

    @ObfuscatedName("cm.bk")
    public static int[] field390;

    @ObfuscatedName("cm.ap")
    public static int field395;

    @ObfuscatedName("cm.aa")
    public static int field396;

    @ObfuscatedName("cm.af")
    public static class53[] field397;

    @ObfuscatedName("cm.ad")
    public static class42[] field398;

    @ObfuscatedName("cm.aq")
    public static class47[] field399;

    @ObfuscatedName("ae.fp")
    public static class357 field4;

    @ObfuscatedName("af.ox")
    public static class74 field40;

    @ObfuscatedName("cm.al")
    public static class51[] field400;

    @ObfuscatedName("cm.an")
    public static boolean[] field401;

    @ObfuscatedName("cm.ar")
    public static int[] field402;

    @ObfuscatedName("cm.av")
    public static float[] field404;

    @ObfuscatedName("af.gq")
    public static String field41;

    @ObfuscatedName("cm.aj")
    public static float[] field410;

    @ObfuscatedName("cm.aw")
    public static float[] field412;

    @ObfuscatedName("cm.ak")
    public static float[] field413;

    @ObfuscatedName("cm.bh")
    public static float[] field414;

    @ObfuscatedName("cm.bj")
    public static int[] field415;

    @ObfuscatedName("cm.ay")
    public static float[] field418;

    @ObfuscatedName("cx.bj")
    public static class359 field422;

    @ObfuscatedName("cx.wm")
    public static Iterator field426;

    @ObfuscatedName("oh.fm")
    public static class357 field4358;

    @ObfuscatedName("od.ck")
    public static String field4369;

    @ObfuscatedName("og.br")
    public static boolean field4372;

    @ObfuscatedName("ok.wr")
    public static int field4375;

    @ObfuscatedName("on.bv")
    public static class359 field4379;

    @ObfuscatedName("on.cs")
    public static class493 field4388;

    @ObfuscatedName("cr.ap")
    public static float field440;

    @ObfuscatedName("oe.dc")
    public static boolean field4405;

    @ObfuscatedName("oe.oo")
    public static int field4406;

    @ObfuscatedName("cr.aa")
    public static int field441;

    @ObfuscatedName("oq.ai")
    public static class359 field4424;

    @ObfuscatedName("ov.fu")
    public static class357 field4431;

    @ObfuscatedName("or.gw")
    public static class445 field4433;

    @ObfuscatedName("oo.fk")
    public static class357 field4436;

    @ObfuscatedName("ps.wq")
    public static class370 field4442;

    @ObfuscatedName("pa.wh")
    public static class361 field4452;

    @ObfuscatedName("pz.ag")
    public static class164 field4478;

    @ObfuscatedName("cd.fd")
    public static class439 field448;

    @ObfuscatedName("pk.ad")
    public static class528[] field4480;

    @ObfuscatedName("pl.gy")
    public static int field4506;

    @ObfuscatedName("pf.tw")
    public static class43 field4508;

    @ObfuscatedName("cd.jt")
    public static class394 field451;

    @ObfuscatedName("po.rd")
    public static class498 field4511;

    @ObfuscatedName("pn.ag")
    public static String[] field4515;

    @ObfuscatedName("pd.ae")
    public static boolean field4516;

    @ObfuscatedName("ph.ax")
    public static byte[][][] field4534;

    @ObfuscatedName("cd.js")
    public static int[] field454;

    @ObfuscatedName("qe.ag")
    public static int[] field4588;

    @ObfuscatedName("qf.nx")
    public static int field4603;

    @ObfuscatedName("qr.ao")
    public static int field4605;

    @ObfuscatedName("qw.ae")
    public static class359 field4610;

    @ObfuscatedName("qc.iv")
    public static class113 field4644;

    @ObfuscatedName("qg.la")
    public static int field4651;

    @ObfuscatedName("qs.cj")
    public static int field4658;

    @ObfuscatedName("qz.tk")
    public static class529 field4659;

    @ObfuscatedName("qi.ii")
    public static class439 field4676;

    @ObfuscatedName("qy.ar")
    public static int[][][] field4680;

    @ObfuscatedName("ad.gd")
    public static class357 field47;

    @ObfuscatedName("rr.bi")
    public static GarbageCollectorMXBean field4707;

    @ObfuscatedName("rb.af")
    public static class529 field4721;

    @ObfuscatedName("ro.ae")
    public static int field4731;

    @ObfuscatedName("ro.wp")
    public static class99 field4737;

    @ObfuscatedName("rm.kf")
    public static class528[] field4756;

    @ObfuscatedName("rc.al")
    public static class394 field4760;

    @ObfuscatedName("rc.aj")
    public static int field4761;

    @ObfuscatedName("rl.at")
    public static int field4779;

    @ObfuscatedName("rn.az")
    public static int[] field4796;

    @ObfuscatedName("rn.ab")
    public static class155 field4803;

    @ObfuscatedName("rn.ad")
    public static int[] field4804;

    @ObfuscatedName("sc.gv")
    public static int field4880;

    @ObfuscatedName("cv.ay")
    public static String field492;

    @ObfuscatedName("sr.af")
    public static int[] field4952;

    @ObfuscatedName("sp.up")
    public static int field4963;

    @ObfuscatedName("ss.az")
    public static class359 field4965;

    @ObfuscatedName("tl.fz")
    public static class357 field5023;

    @ObfuscatedName("tb.ke")
    public static class529[] field5030;

    @ObfuscatedName("tz.cy")
    public static int field5040;

    @ObfuscatedName("tk.au")
    public static class359 field5043;

    @ObfuscatedName("tk.ap")
    public static int[] field5047;

    @ObfuscatedName("tc.au")
    public static class359 field5054;

    @ObfuscatedName("co.fn")
    public static class357 field508;

    @ObfuscatedName("co.kn")
    public static class529[] field509;

    @ObfuscatedName("ty.hu")
    public static String field5095;

    @ObfuscatedName("uj.ac")
    public static class359 field5176;

    @ObfuscatedName("ut.aw")
    public static int field5181;

    @ObfuscatedName("ut.ak")
    public static int field5182;

    @ObfuscatedName("ut.av")
    public static int[] field5183;

    @ObfuscatedName("ut.bh")
    public static float[] field5185;

    @ObfuscatedName("cu.ao")
    public static int field519;

    @ObfuscatedName("uf.at")
    public static int[] field5219;

    @ObfuscatedName("cu.as")
    public static class280 field522;

    @ObfuscatedName("uf.au")
    public static int field5220;

    @ObfuscatedName("uf.ae")
    public static int field5221;

    @ObfuscatedName("cu.ka")
    public static class528[] field525;

    @ObfuscatedName("uy.ae")
    public static String field5264;

    @ObfuscatedName("uy.au")
    public static Applet field5265;

    @ObfuscatedName("uy.at")
    public static int field5267;

    @ObfuscatedName("uy.ac")
    public static int field5268;

    @ObfuscatedName("uy.jy")
    public static int[][] field5269;

    @ObfuscatedName("uy.ao")
    public static int field5271;

    @ObfuscatedName("al.ga")
    public static int field59;

    @ObfuscatedName("client.kt")
    public static class529 field607;

    @ObfuscatedName("al.no")
    public static int field61;

    @ObfuscatedName("al.ro")
    public static class175 field62;

    @ObfuscatedName("an.au")
    public static class359 field66;

    @ObfuscatedName("an.aq")
    public static class528[] field68;

    @ObfuscatedName("ac.gh")
    public static int field7;

    @ObfuscatedName("ab.ae")
    public static class16 field79;

    @ObfuscatedName("ca.jd")
    public static int field856;

    @ObfuscatedName("ca.bj")
    public static Font field873;

    @ObfuscatedName("ca.fg")
    public static class357 field875;

    @ObfuscatedName("cb.ac")
    public static String[] field879;

    @ObfuscatedName("cb.an")
    public static int[] field889;

    @ObfuscatedName("ax.ba")
    public static String field90;

    @ObfuscatedName("cg.hn")
    public static SecureRandom field906;

    @ObfuscatedName("cj.cd")
    public static int field907;

    @ObfuscatedName("ct.dg")
    public static class529[] field925;

    @ObfuscatedName("ax.vg")
    public static class475 field93;

    @ObfuscatedName("cy.al")
    public static class528 field930;

    @ObfuscatedName("cy.at")
    public static class528[] field932;

    @ObfuscatedName("cy.ac")
    public static class528 field933;

    @ObfuscatedName("cy.az")
    public static class528 field934;

    @ObfuscatedName("cy.aa")
    public static class529 field935;

    @ObfuscatedName("ht.au(DDII)[D")
    public static double[] method3263(double arg0, double arg1, int arg2) {
        int var5 = arg2 * 2 + 1;
        double[] var6 = new double[var5];
        int var7 = -arg2;
        int var8 = 0;
        while (var7 <= arg2) {
            double var11 = ((double) var7 - arg0) / arg1;
            double var13 = Math.exp(-var11 * var11 / 2.0D) / Math.sqrt(6.283185307179586D);
            double var15 = var13 / arg1;
            var6[var8] = var15;
            var7++;
            var8++;
        }
        return var6;
    }

    @ObfuscatedName("bt.au(IIIB)Z")
    public static boolean method447(int arg0, int arg1, int arg2) {
        return arg0 >= 0 && arg0 < 4 && arg1 >= 0 && arg1 < 104 && arg2 >= 0 && arg2 < 104;
    }

    @ObfuscatedName("ln.au(Ljava/lang/String;I)Ljava/io/File;")
    public static File method5208(String arg0) {
        if (!class176.field1871) {
            throw new RuntimeException("");
        }
        File var1 = (File) class176.field1873.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(field1872, arg0);
        RandomAccessFile var3 = null;
        try {
            File var4 = new File(var2.getParent());
            if (!var4.exists()) {
                throw new RuntimeException("");
            }
            var3 = new RandomAccessFile(var2, "rw");
            int var5 = var3.read();
            var3.seek(0L);
            var3.write(var5);
            var3.seek(0L);
            var3.close();
            class176.field1873.put(arg0, var2);
            return var2;
        } catch (Exception var10) {
            try {
                if (var3 != null) {
                    var3.close();
                    Object var7 = null;
                }
            } catch (Exception var9) {
            }
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ii.au(II)Ljava/lang/String;")
    public static String method4049(int arg0) {
        return "<img=" + arg0 + ">";
    }

    @ObfuscatedName("qa.au(Lnu;B)V")
    public static void method7394(class359 arg0) {
        field5043 = arg0;
    }

    @ObfuscatedName("ea.au(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static void method2661(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                var2 = class541.method8074(arg1);
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
            if (field5265 == null) {
                return;
            }
            URL var7 = new URL(field5265.getCodeBase(), "clienterror.ws?cv=" + field5271 + "&cs=" + field5267 + "&u=" + field5264 + "&v1=" + field1854 + "&v2=" + field1370 + "&ct=" + field5268 + "&e=" + var6);
            DataInputStream var8 = new DataInputStream(var7.openStream());
            var8.read();
            var8.close();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("jt.ae(III)V")
    public static void method4396(int arg0, int arg1) {
        class202 var2 = class202.method6559(arg0);
        int var3 = var2.field2126;
        int var4 = var2.field2127;
        int var5 = var2.field2131;
        int var6 = class322.field3538[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        class322.field3540[var3] = class322.field3540[var3] & ~var7 | arg1 << var4 & var7;
    }

    @ObfuscatedName("ly.ao(II)I")
    public static int method5200(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("dd.ae(I)V")
    public static void method2178() {
        class176.field1873.clear();
    }

    @ObfuscatedName("fs.ac([BIIIIIIIII[Lis;I)V")
    public static final void method2905(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class214[] arg10) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var12 = 0; var12 < 8; var12++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg3 + var12 > 0 && arg3 + var12 < 103) {
                    arg10[arg1].field2379[arg2 + var11][arg3 + var12] &= 0xFEFFFFFF;
                }
            }
        }
        class515 var13 = new class515(arg0);
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg4 == var14 && var15 >= arg5 && var15 < arg5 + 8 && var16 >= arg6 && var16 < arg6 + 8) {
                        int var17 = arg2 + class326.method2182(var15 & 0x7, var16 & 0x7, arg7);
                        int var18 = arg3 + class326.method2958(var15 & 0x7, var16 & 0x7, arg7);
                        int var19 = (var15 & 0x7) + arg2 + arg8;
                        int var20 = (var16 & 0x7) + arg3 + arg9;
                        class82.method2076(var13, arg1, var17, var18, var19, var20, arg7);
                    } else {
                        class82.method2076(var13, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ev.az(I)V")
    public static void method2707() {
        class306.field3406.clear();
    }

    @ObfuscatedName("mm.ad(CI)Z")
    public static boolean method5838(char arg0) {
        return arg0 >= '0' && arg0 <= '9';
    }

    @ObfuscatedName("ka.aa(Ljava/util/ArrayList;ZI)V")
    public static void method5053(ArrayList arg0, boolean arg1) {
        if (!arg1) {
            class306.field3406.clear();
        }
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class318 var3 = (class318) var2.next();
            if (var3.field3512 != -1 && var3.field3513 != -1) {
                if (!arg1) {
                    class306.field3406.add(var3);
                }
                class306.field3412.add(var3);
            }
        }
    }

    @ObfuscatedName("nq.am(II)Lfv;")
    public static class138 method6037(int arg0) {
        class138 var1 = (class138) class209.field2315.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class359 var2 = field1937;
        class359 var3 = field4965;
        boolean var4 = true;
        byte[] var5 = var2.method6135(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
        class138 var7;
        if (var5 == null) {
            boolean var6 = false;
            var7 = null;
        } else {
            int var8 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
            byte[] var9 = var3.method6135(var8, 0);
            if (var9 == null) {
                var4 = false;
            }
            if (var4) {
                if (field1626 == null) {
                    field3101 = Runtime.getRuntime().availableProcessors();
                    field1626 = new ThreadPoolExecutor(0, field3101, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(field3101 * 100 + 100), new class185());
                }
                try {
                    var7 = new class138(var2, var3, arg0, false);
                } catch (Exception var12) {
                    var7 = null;
                }
            } else {
                var7 = null;
            }
        }
        if (var7 != null) {
            class209.field2315.method5177(var7, (long) arg0);
        }
        return var7;
    }

    @ObfuscatedName("em.an(I)V")
    public static void method2776() {
        class206.field2173.method5175();
        class206.field2200.method5175();
        class206.field2176.method5175();
        class206.field2194.method5175();
    }

    @ObfuscatedName("gg.bz(Lmi;Lmt;ZB)V")
    public static void method3063(class332 arg0, class329 arg1, boolean arg2) {
        arg0.field3691 = 7;
        arg0.field3705 = new class329(arg1);
        if (!arg2) {
            arg0.field3705.field3570 = Arrays.copyOf(arg0.field3705.field3585, arg0.field3705.field3585.length);
            arg0.field3705.method5528();
        }
    }

    @ObfuscatedName("ha.aa(I)Ljava/util/Date;")
    public static Date method3478() throws ParseException {
        SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
        var0.setLenient(false);
        StringBuilder var1 = new StringBuilder();
        String[] var2 = class76.field955;
        for (int var3 = 0; var3 < var2.length; var3++) {
            String var4 = var2[var3];
            if (var4 == null) {
                class76.method816(7);
                class76.method5478("Date not valid.", "Please ensure all characters are populated.", "");
                return null;
            }
            var1.append(var4);
        }
        var1.append("12");
        return var0.parse(var1.toString());
    }

    @ObfuscatedName("dj.ab(ILdh;ZI)I")
    public static int method2095(int arg0, class79 arg1, boolean arg2) {
        class332 var3 = arg2 ? field2872 : field2809;
        if (arg0 == 1700) {
            class71.field893[++field335 - 1] = var3.field3780;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3780 == -1) {
                class71.field893[++field335 - 1] = 0;
            } else {
                class71.field893[++field335 - 1] = var3.field3781;
            }
            return 1;
        } else if (arg0 == 1702) {
            class71.field893[++field335 - 1] = var3.field3770;
            return 1;
        } else if (arg0 == 1707) {
            class71.field893[++field335 - 1] = var3.method5930() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return class71.method5041(var3);
        } else if (arg0 == 1709) {
            return class71.method6635(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("rn.ay(B)I")
    public static int method7688() {
        return class76.field945;
    }

    @ObfuscatedName("fu.iu(Ldr;I)V")
    public static final void method2962(class96 arg0) {
        if (arg0.field1233 != -1) {
            Object var1 = null;
            int var2 = 65536;
            class96 var3;
            if (arg0.field1233 < var2) {
                var3 = client.field587[arg0.field1233];
            } else {
                var3 = client.field700[arg0.field1233 - var2];
            }
            if (var3 != null) {
                int var4 = arg0.field1228 - var3.field1228;
                int var5 = arg0.field1199 - var3.field1199;
                if (var4 != 0 || var5 != 0) {
                    int var7 = (int) (Math.atan2((double) var4, (double) var5) * 325.94932345220167D) & 0x7FF;
                    arg0.field1239 = var7;
                }
            } else if (arg0.field1203) {
                arg0.field1233 = -1;
                arg0.field1203 = false;
            }
        }
        if (arg0.field1246 == 0 || arg0.field1272 > 0) {
            int var8 = -1;
            if (arg0.field1236 != -1 && arg0.field1237 != -1) {
                int var9 = arg0.field1236 * 128 - field1448 * 128 + 64;
                int var10 = arg0.field1237 * 128 - field354 * 128 + 64;
                int var11 = arg0.field1228 - var9;
                int var12 = arg0.field1199 - var10;
                if (var11 != 0 || var12 != 0) {
                    int var13 = (int) (Math.atan2((double) var11, (double) var12) * 325.94932345220167D) & 0x7FF;
                    var8 = var13;
                }
            } else if (arg0.field1235 != -1) {
                var8 = arg0.field1235;
            }
            if (var8 != -1) {
                arg0.field1239 = var8;
                if (arg0.field1238) {
                    arg0.field1200 = arg0.field1239;
                }
            }
            arg0.method2288();
        }
        int var14 = arg0.field1239 - arg0.field1200 & 0x7FF;
        if (var14 == 0) {
            if (arg0.field1203) {
                arg0.field1233 = -1;
                arg0.field1203 = false;
            }
            arg0.field1240 = 0;
            return;
        }
        boolean var15 = true;
        boolean var16 = true;
        arg0.field1240++;
        int var17 = var14 > 1024 ? -1 : 1;
        arg0.field1200 += arg0.field1267 * var17;
        boolean var18 = true;
        if (var14 < arg0.field1267 || var14 > 2048 - arg0.field1267) {
            arg0.field1200 = arg0.field1239;
            var18 = false;
        }
        if (arg0.field1267 > 0 && arg0.field1211 == arg0.field1204 && (arg0.field1240 > 25 || var18)) {
            if (var17 == -1 && arg0.field1205 != -1) {
                arg0.field1211 = arg0.field1205;
            } else if (var17 == 1 && arg0.field1266 != -1) {
                arg0.field1211 = arg0.field1266;
            } else {
                arg0.field1211 = arg0.field1207;
            }
        }
        arg0.field1200 &= 0x7FF;
    }

    @ObfuscatedName("rj.bb(ILdh;ZI)I")
    public static int method7488(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6200) {
            field335 -= 2;
            client.field801 = (short) class71.method3053(class71.field893[field335]);
            if (client.field801 <= 0) {
                client.field801 = 256;
            }
            client.field686 = (short) class71.method3053(class71.field893[field335 + 1]);
            if (client.field686 <= 0) {
                client.field686 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            field335 -= 2;
            client.field803 = (short) class71.field893[field335];
            if (client.field803 <= 0) {
                client.field803 = 256;
            }
            client.field804 = (short) class71.field893[field335 + 1];
            if (client.field804 <= 0) {
                client.field804 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            field335 -= 4;
            client.field805 = (short) class71.field893[field335];
            if (client.field805 <= 0) {
                client.field805 = 1;
            }
            client.field636 = (short) class71.field893[field335 + 1];
            if (client.field636 <= 0) {
                client.field636 = 32767;
            } else if (client.field636 < client.field805) {
                client.field636 = client.field805;
            }
            client.field807 = (short) class71.field893[field335 + 2];
            if (client.field807 <= 0) {
                client.field807 = 1;
            }
            client.field808 = (short) class71.field893[field335 + 3];
            if (client.field808 <= 0) {
                client.field808 = 32767;
            } else if (client.field808 < client.field807) {
                client.field808 = client.field807;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field822 == null) {
                class71.field893[++field335 - 1] = -1;
                class71.field893[++field335 - 1] = -1;
            } else {
                client.method1170(0, 0, client.field822.field3662, client.field822.field3635, false);
                class71.field893[++field335 - 1] = client.field743;
                class71.field893[++field335 - 1] = client.field618;
            }
            return 1;
        } else if (arg0 == 6204) {
            class71.field893[++field335 - 1] = client.field803;
            class71.field893[++field335 - 1] = client.field804;
            return 1;
        } else if (arg0 == 6205) {
            class71.field893[++field335 - 1] = class71.method5998(client.field801);
            class71.field893[++field335 - 1] = class71.method5998(client.field686);
            return 1;
        } else if (arg0 == 6220) {
            class71.field893[++field335 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            class71.field893[++field335 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            class71.field893[++field335 - 1] = field1450;
            return 1;
        } else if (arg0 == 6223) {
            class71.field893[++field335 - 1] = field1890;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ka.jt(II)V")
    public static void method5055(int arg0) {
        client.field757 = 0L;
        if (arg0 >= 2) {
            client.field758 = true;
        } else {
            client.field758 = false;
        }
        if (client.method3928() == 1) {
            field2415.method488(765, 503);
        } else {
            field2415.method488(7680, 2160);
        }
        if (client.field611 >= 25) {
            client.method1157();
        }
    }

    @ObfuscatedName("ds.bg(ILdh;ZB)I")
    public static int method2185(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = class71.field893[--field335] == 1;
            client.method2063(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.kq(Lls;I)V")
    public static final void method1721(class296 arg0) {
        class514 var1 = client.field592.field1430;
        if (class296.field3213 == arg0) {
            int var2 = var1.method8356();
            int var3 = var1.method8357();
            int var4 = var1.method8300();
            int var5 = (var4 >> 4 & 0x7) + field856;
            int var6 = (var4 & 0x7) + field1500;
            int var7 = var1.method8343();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                class378 var8 = client.field667[field1321][var5][var6];
                if (var8 != null) {
                    for (class105 var9 = (class105) var8.method6393(); var9 != null; var9 = (class105) var8.method6395()) {
                        if ((var7 & 0x7FFF) == var9.field1363 && var9.field1364 == var3) {
                            var9.field1364 = var2;
                            break;
                        }
                    }
                    client.method2920(var5, var6);
                }
            }
            return;
        }
        if (class296.field3216 == arg0) {
            int var10 = var1.method8333();
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = client.field712[var11];
            int var14 = var1.method8498();
            int var15 = (var14 >> 4 & 0x7) + field856;
            int var16 = (var14 & 0x7) + field1500;
            int var17 = var1.method8344();
            byte var18 = var1.method8320();
            byte var19 = var1.method8337();
            int var20 = var1.method8342();
            int var21 = var1.method8342();
            byte var22 = var1.method8338();
            byte var23 = var1.method8301();
            int var24 = var1.method8344();
            class92 var25;
            if (client.field655 == var17) {
                var25 = field2132;
            } else {
                var25 = client.field700[var17];
            }
            if (var25 != null) {
                class206 var26 = class206.method3321(var21);
                int var27;
                int var28;
                if (var12 == 1 || var12 == 3) {
                    var27 = var26.field2171;
                    var28 = var26.field2186;
                } else {
                    var27 = var26.field2186;
                    var28 = var26.field2171;
                }
                int var29 = (var27 >> 1) + var15;
                int var30 = (var27 + 1 >> 1) + var15;
                int var31 = (var28 >> 1) + var16;
                int var32 = (var28 + 1 >> 1) + var16;
                int[][] var33 = class82.field1048[field1321];
                int var34 = var33[var29][var31] + var33[var30][var31] + var33[var29][var32] + var33[var30][var32] >> 2;
                int var35 = (var15 << 7) + (var27 << 6);
                int var36 = (var16 << 7) + (var28 << 6);
                class240 var37 = var26.method3609(var11, var12, var33, var35, var34, var36);
                if (var37 != null) {
                    client.method2370(field1321, var15, var16, var13, -1, 0, 0, 31, var20 + 1, var24 + 1);
                    var25.field1137 = client.field833 + var20;
                    var25.field1148 = client.field833 + var24;
                    var25.field1142 = var37;
                    var25.field1139 = var15 * 128 + var27 * 64;
                    var25.field1141 = var16 * 128 + var28 * 64;
                    var25.field1140 = var34;
                    if (var22 > var18) {
                        byte var38 = var22;
                        var22 = var18;
                        var18 = var38;
                    }
                    if (var19 > var23) {
                        byte var39 = var19;
                        var19 = var23;
                        var23 = var39;
                    }
                    var25.field1154 = var15 + var22;
                    var25.field1145 = var15 + var18;
                    var25.field1144 = var16 + var19;
                    var25.field1133 = var16 + var23;
                }
            }
        }
        if (class296.field3209 == arg0) {
            int var40 = var1.method8498();
            int var41 = (var40 >> 4 & 0x7) + field856;
            int var42 = (var40 & 0x7) + field1500;
            int var43 = var1.method8448();
            int var44 = var1.method8498();
            int var45 = var1.method8343();
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                int var46 = var41 * 128 + 64;
                int var47 = var42 * 128 + 64;
                class72 var48 = new class72(var45, field1321, var46, var47, client.method284(var46, var47, field1321) - var44, var43, client.field833);
                client.field798.method6405(var48);
            }
        } else if (class296.field3217 == arg0) {
            int var49 = var1.method8333();
            int var50 = var1.method8498();
            int var51 = var50 >> 2;
            int var52 = var50 & 0x3;
            int var53 = client.field712[var51];
            int var54 = var1.method8344();
            int var55 = var1.method8335();
            int var56 = (var55 >> 4 & 0x7) + field856;
            int var57 = (var55 & 0x7) + field1500;
            if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                client.method2370(field1321, var56, var57, var53, var54, var51, var52, var49, 0, -1);
            }
        } else if (class296.field3210 == arg0) {
            int var58 = var1.method8498();
            int var59 = var58 >> 2;
            int var60 = var58 & 0x3;
            int var61 = client.field712[var59];
            int var62 = var1.method8342();
            int var63 = var1.method8498();
            int var64 = (var63 >> 4 & 0x7) + field856;
            int var65 = (var63 & 0x7) + field1500;
            if (var64 >= 0 && var65 >= 0 && var64 < 103 && var65 < 103) {
                if (var61 == 0) {
                    class248 var66 = field1570.method4223(field1321, var64, var65);
                    if (var66 != null) {
                        int var67 = class241.method3275(var66.field2843);
                        if (var59 == 2) {
                            var66.field2844 = new class80(var67, 2, var60 + 4, field1321, var64, var65, var62, false, var66.field2844);
                            var66.field2842 = new class80(var67, 2, var60 + 1 & 0x3, field1321, var64, var65, var62, false, var66.field2842);
                        } else {
                            var66.field2844 = new class80(var67, var59, var60, field1321, var64, var65, var62, false, var66.field2844);
                        }
                        return;
                    }
                }
                if (var61 == 1) {
                    class250 var68 = field1570.method4224(field1321, var64, var65);
                    if (var68 != null) {
                        int var69 = class241.method3275(var68.field2856);
                        if (var59 == 4 || var59 == 5) {
                            var68.field2853 = new class80(var69, 4, var60, field1321, var64, var65, var62, false, var68.field2853);
                        } else if (var59 == 6) {
                            var68.field2853 = new class80(var69, 4, var60 + 4, field1321, var64, var65, var62, false, var68.field2853);
                        } else if (var59 == 7) {
                            var68.field2853 = new class80(var69, 4, (var60 + 2 & 0x3) + 4, field1321, var64, var65, var62, false, var68.field2853);
                        } else if (var59 == 8) {
                            var68.field2853 = new class80(var69, 4, var60 + 4, field1321, var64, var65, var62, false, var68.field2853);
                            var68.field2854 = new class80(var69, 4, (var60 + 2 & 0x3) + 4, field1321, var64, var65, var62, false, var68.field2854);
                        }
                        return;
                    }
                }
                if (var61 == 2) {
                    class251 var70 = field1570.method4378(field1321, var64, var65);
                    if (var59 == 11) {
                        var59 = 10;
                    }
                    if (var70 != null) {
                        var70.field2865 = new class80(class241.method3275(var70.field2870), var59, var60, field1321, var64, var65, var62, false, var70.field2865);
                        return;
                    }
                }
                if (var61 == 3) {
                    class223 var71 = field1570.method4292(field1321, var64, var65);
                    if (var71 != null) {
                        var71.field2477 = new class80(class241.method3275(var71.field2476), 22, var60, field1321, var64, var65, var62, false, var71.field2477);
                        return;
                    }
                }
                client.method7641(field1321, var64, var65, var61, var62);
            }
        } else if (class296.field3214 == arg0) {
            var1.method8333();
            int var72 = var1.method8333();
            int var73 = (var72 >> 4 & 0x7) + field856;
            int var74 = (var72 & 0x7) + field1500;
            int var75 = var1.method8300();
            int var76 = var1.method8306();
            var1.method8344();
            var1.method8342();
            var1.method8333();
            int var77 = var1.method8448();
            if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                class105 var78 = new class105();
                var78.field1363 = var77;
                var78.field1364 = var76;
                var78.method2558(var75);
                if (client.field667[field1321][var73][var74] == null) {
                    client.field667[field1321][var73][var74] = new class378();
                }
                client.field667[field1321][var73][var74].method6405(var78);
                client.method2920(var73, var74);
            }
        } else if (class296.field3219 == arg0) {
            int var79 = var1.method8300();
            int var80 = (var79 >> 4 & 0x7) + field856;
            int var81 = (var79 & 0x7) + field1500;
            int var82 = var1.method8498();
            int var83 = var82 >> 2;
            int var84 = var82 & 0x3;
            int var85 = client.field712[var83];
            if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                client.method2370(field1321, var80, var81, var85, -1, var83, var84, 31, 0, -1);
            }
        } else if (class296.field3218 == arg0) {
            int var86 = var1.method8344();
            int var87 = var1.method8356();
            int var88 = var1.method8300();
            int var89 = (var88 >> 4 & 0x7) + field856;
            int var90 = (var88 & 0x7) + field1500;
            if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                class378 var91 = client.field667[field1321][var89][var90];
                if (var91 != null) {
                    for (class105 var92 = (class105) var91.method6393(); var92 != null; var92 = (class105) var91.method6395()) {
                        if ((var86 & 0x7FFF) == var92.field1363 && var92.field1364 == var87) {
                            var92.method7700();
                            break;
                        }
                    }
                    if (var91.method6393() == null) {
                        client.field667[field1321][var89][var90] = null;
                    }
                    client.method2920(var89, var90);
                }
            }
        } else {
            if (class296.field3215 == arg0) {
                int var93 = var1.method8333();
                int var94 = (var93 >> 4 & 0x7) + field856;
                int var95 = (var93 & 0x7) + field1500;
                int var96 = var1.method8335();
                int var97 = var96 >> 4 & 0xF;
                int var98 = var96 & 0x7;
                int var99 = var1.method8300();
                int var100 = var1.method8344();
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                    int var101 = var97 + 1;
                    if (field2132.field1273[0] >= var94 - var101 && field2132.field1273[0] <= var94 + var101 && field2132.field1270[0] >= var95 - var101 && field2132.field1270[0] <= var95 + var101 && field4737.method2449() != 0 && var98 > 0 && client.field782 < 50) {
                        client.field783[client.field782] = var100;
                        client.field784[client.field782] = var98;
                        client.field739[client.field782] = var99;
                        client.field571[client.field782] = null;
                        client.field534[client.field782] = (var94 << 16) + (var95 << 8) + var97;
                        client.field782++;
                    }
                }
            }
            if (class296.field3212 == arg0) {
                int var102 = var1.method8343();
                int var103 = var1.method8448();
                byte var104 = var1.method8338();
                int var105 = var1.method8498();
                int var106 = var1.method8350();
                byte var107 = var1.method8301();
                int var108 = var1.method8333() * 4;
                int var109 = var1.method8498();
                int var110 = var1.method8335() * 4;
                int var111 = var1.method8351();
                int var112 = var1.method8300();
                int var113 = (var112 >> 4 & 0x7) + field856;
                int var114 = (var112 & 0x7) + field1500;
                int var115 = var1.method8344();
                int var116 = var104 + var113;
                int var117 = var107 + var114;
                if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104 && var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104 && var115 != 65535) {
                    int var118 = var113 * 128 + 64;
                    int var119 = var114 * 128 + 64;
                    int var120 = var116 * 128 + 64;
                    int var121 = var117 * 128 + 64;
                    class77 var122 = new class77(var115, field1321, var118, var119, client.method284(var118, var119, field1321) - var108, client.field833 + var102, client.field833 + var103, var105, var109, var111, var106, var110);
                    var122.method2053(var120, var121, client.method284(var120, var121, field1321) - var110, client.field833 + var102);
                    client.field654.method6405(var122);
                }
            } else if (class296.field3208 == arg0) {
                int var123 = var1.method8342();
                int var124 = var1.method8333();
                int var125 = (var124 >> 4 & 0x7) + field856;
                int var126 = (var124 & 0x7) + field1500;
                byte var127 = var1.method8338();
                int var128 = var1.method8351();
                int var129 = var1.method8333();
                int var130 = var1.method8344();
                byte var131 = var1.method8320();
                int var132 = var1.method8498() * 4;
                int var133 = var1.method8333();
                int var134 = var1.method8333() * 4;
                int var135 = var1.method8448();
                int var136 = var125 + var131;
                int var137 = var126 + var127;
                if (var125 >= 0 && var126 >= 0 && var125 < 104 && var126 < 104 && var136 >= 0 && var137 >= 0 && var136 < 104 && var137 < 104 && var123 != 65535) {
                    int var138 = var125 * 128 + 64;
                    int var139 = var126 * 128 + 64;
                    int var140 = var136 * 128 + 64;
                    int var141 = var137 * 128 + 64;
                    class77 var142 = new class77(var123, field1321, var138, var139, client.method284(var138, var139, field1321) - var134, client.field833 + var135, client.field833 + var130, var129, var133, var128, var132);
                    var142.method2053(var140, var141, client.method284(var140, var141, field1321) - var132, client.field833 + var135);
                    client.field654.method6405(var142);
                }
            } else if (class296.field3211 == arg0) {
                int var143 = var1.method8300();
                int var144 = (var143 >> 4 & 0x7) + field856;
                int var145 = (var143 & 0x7) + field1500;
                int var146 = var1.method8335();
                int var147 = var1.method8342();
                if (var144 >= 0 && var145 >= 0 && var144 < 104 && var145 < 104) {
                    class378 var148 = client.field667[field1321][var144][var145];
                    if (var148 != null) {
                        for (class105 var149 = (class105) var148.method6393(); var149 != null; var149 = (class105) var148.method6395()) {
                            if ((var147 & 0x7FFF) == var149.field1363) {
                                var149.method2558(var146);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("nd.lo(III)V")
    public static void method6045(int arg0, int arg1) {
        int var2 = field451.method6838(class352.field4080);
        for (int var3 = 0; var3 < client.field676; var3++) {
            int var4 = field451.method6838(client.method3261(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = client.field676 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > field1450) {
            var6 = field1450 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > field1890) {
            var7 = field1890 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field61 = var6;
        field4603 = var7;
        field3510 = var2;
        field2650 = client.field676 * 15 + 22;
    }

    @ObfuscatedName("hh.lw(B)V")
    public static void method3283() {
        if (!client.field619) {
            return;
        }
        class332 var0 = class332.method865(field4406, client.field695);
        if (var0 != null && var0.field3746 != null) {
            class88 var1 = new class88();
            var1.field1084 = var0;
            var1.field1087 = var0.field3746;
            class71.method5065(var1);
        }
        client.field661 = -1;
        client.field619 = false;
        client.method3930(var0);
    }

    @ObfuscatedName("gx.mu(II)Ljava/lang/String;")
    public static final String method3249(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("jp.ny(B)V")
    public static final void method4724() {
        client.field735 = client.field529;
        field2974 = true;
    }

    @ObfuscatedName("oi.oc(I)V")
    public static void method6558() {
        if (field4442 == null) {
            return;
        }
        client.field650 = client.field833;
        field4442.method6322();
        for (int var0 = 0; var0 < client.field700.length; var0++) {
            if (client.field700[var0] != null) {
                field4442.method6321((client.field700[var0].field1228 >> 7) + field1448, (client.field700[var0].field1199 >> 7) + field354);
            }
        }
    }

    @ObfuscatedName("is.oo(B)Lnf;")
    public static class360 method3862() {
        return field3463;
    }
}
