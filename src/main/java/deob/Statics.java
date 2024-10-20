package deob;

import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.awt.Desktop.Action;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URI;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import javax.imageio.ImageIO;

public class Statics {

    @ObfuscatedName("au.om")
    public static class330 field100;

    @ObfuscatedName("dl.ad")
    public static class514 field1009;

    @ObfuscatedName("au.av")
    public static long field101;

    @ObfuscatedName("dm.fn")
    public static class355 field1010;

    @ObfuscatedName("dm.vc")
    public static class463 field1013;

    @ObfuscatedName("da.ab")
    public static byte[][][] field1019;

    @ObfuscatedName("au.kc")
    public static class515[] field102;

    @ObfuscatedName("da.ad")
    public static int[] field1020;

    @ObfuscatedName("da.ac")
    public static int[][][] field1021;

    @ObfuscatedName("da.aa")
    public static int[] field1029;

    @ObfuscatedName("dn.ii")
    public static class427 field1038;

    @ObfuscatedName("df.un")
    public static int field1045;

    @ObfuscatedName("df.eh")
    public static class89 field1054;

    @ObfuscatedName("do.tk")
    public static class43 field1074;

    @ObfuscatedName("do.ft")
    public static class355 field1077;

    @ObfuscatedName("dh.ap")
    public static byte[][][] field1128;

    @ObfuscatedName("dv.ah")
    public static int[] field1150;

    @ObfuscatedName("ay.ae")
    public static int[][] field117;

    @ObfuscatedName("di.ff")
    public static class355 field1224;

    @ObfuscatedName("dj.ue")
    public static int field1234;

    @ObfuscatedName("dk.fu")
    public static class355 field1245;

    @ObfuscatedName("dk.ky")
    public static class515[] field1254;

    @ObfuscatedName("dk.uo")
    public static int field1256;

    @ObfuscatedName("dg.rm")
    public static class486 field1276;

    @ObfuscatedName("de.ag")
    public static class514 field1291;

    @ObfuscatedName("am.ah")
    public static String[] field130;

    @ObfuscatedName("dc.jw")
    public static int field1302;

    @ObfuscatedName("ee.aj")
    public static class514 field1323;

    @ObfuscatedName("er.wb")
    public static int field1328;

    @ObfuscatedName("am.cu")
    public static class345 field133;

    @ObfuscatedName("ef.gn")
    public static int field1367;

    @ObfuscatedName("ez.go")
    public static class355 field1378;

    @ObfuscatedName("ez.mm")
    public static class236 field1379;

    @ObfuscatedName("ea.oy")
    public static class74 field1395;

    @ObfuscatedName("en.ag")
    public static int field1401;

    @ObfuscatedName("en.ds")
    public static boolean field1402;

    @ObfuscatedName("ek.uc")
    public static int field1411;

    @ObfuscatedName("ec.ua")
    public static int field1416;

    @ObfuscatedName("ec.ak")
    public static class514 field1417;

    @ObfuscatedName("ec.gr")
    public static int field1418;

    @ObfuscatedName("ed.af")
    public static int[] field1429;

    @ObfuscatedName("ew.ap")
    public static class357 field1437;

    @ObfuscatedName("ew.av")
    public static int field1438;

    @ObfuscatedName("eo.fv")
    public static class355 field1449;

    @ObfuscatedName("ev.oz")
    public static int field1465;

    @ObfuscatedName("ev.ak")
    public static ThreadPoolExecutor field1469;

    @ObfuscatedName("ej.ub")
    public static int field1470;

    @ObfuscatedName("ey.ai")
    public static String field1493;

    @ObfuscatedName("ey.rx")
    public static class443 field1496;

    @ObfuscatedName("eg.db")
    public static class514 field1504;

    @ObfuscatedName("fg.jg")
    public static int[] field1529;

    @ObfuscatedName("bq.wi")
    public static class368 field153;

    @ObfuscatedName("bg.bk")
    public static boolean field156;

    @ObfuscatedName("fm.ao")
    public static boolean field1566;

    @ObfuscatedName("fc.bj")
    public static FontMetrics field1569;

    @ObfuscatedName("fl.dw")
    public static class514[] field1570;

    @ObfuscatedName("fl.gy")
    public static int field1571;

    @ObfuscatedName("fl.qf")
    public static class330[] field1576;

    @ObfuscatedName("fe.at")
    public static class216[] field1580;

    @ObfuscatedName("fz.aj")
    public static int field1586;

    @ObfuscatedName("fz.bx")
    public static String field1592;

    @ObfuscatedName("fp.hj")
    public static SecureRandom field1604;

    @ObfuscatedName("fp.ux")
    public static int field1606;

    @ObfuscatedName("fd.bs")
    public static boolean[] field1627;

    @ObfuscatedName("fr.wr")
    public static class431 field1634;

    @ObfuscatedName("fb.aw")
    public static String field1660;

    @ObfuscatedName("fy.aj")
    public static int[] field1663;

    @ObfuscatedName("fy.ao")
    public static int field1668;

    @ObfuscatedName("fi.kn")
    public static int field1680;

    @ObfuscatedName("fi.ar")
    public static int[] field1686;

    @ObfuscatedName("bd.tz")
    public static class515 field171;

    @ObfuscatedName("fk.st")
    public static boolean field1723;

    @ObfuscatedName("gw.cr")
    public static int field1727;

    @ObfuscatedName("bd.fx")
    public static class355 field173;

    @ObfuscatedName("gd.kf")
    public static class515[] field1732;

    @ObfuscatedName("gd.af")
    public static int field1735;

    @ObfuscatedName("go.wo")
    public static List field1738;

    @ObfuscatedName("ge.av")
    public static int field1755;

    @ObfuscatedName("gv.op")
    public static class330 field1769;

    @ObfuscatedName("ga.as")
    public static int field1774;

    @ObfuscatedName("gz.ir")
    public static class392 field1789;

    @ObfuscatedName("gr.an")
    public static String field1816;

    @ObfuscatedName("gr.at")
    public static String field1819;

    @ObfuscatedName("gr.oa")
    public static int field1821;

    @ObfuscatedName("gc.qm")
    public static int field1826;

    @ObfuscatedName("gn.as")
    public static File field1830;

    @ObfuscatedName("gn.ap")
    public static int field1831;

    @ObfuscatedName("gn.az")
    public static byte[][][] field1837;

    @ObfuscatedName("ba.ab")
    public static int field184;

    @ObfuscatedName("gy.an")
    public static File field1840;

    @ObfuscatedName("gl.ax")
    public static int field1854;

    @ObfuscatedName("gl.ac")
    public static class514 field1857;

    @ObfuscatedName("gq.fj")
    public static class355 field1874;

    @ObfuscatedName("gq.no")
    public static int field1878;

    @ObfuscatedName("gs.al")
    public static int[] field1881;

    @ObfuscatedName("gs.mh")
    public static int field1882;

    @ObfuscatedName("gs.ug")
    public static int field1884;

    @ObfuscatedName("gs.uy")
    public static int field1885;

    @ObfuscatedName("he.jr")
    public static int field1892;

    @ObfuscatedName("ha.ai")
    public static class279 field1893;

    @ObfuscatedName("ha.fp")
    public static long field1894;

    @ObfuscatedName("hk.at")
    public static class357 field1901;

    @ObfuscatedName("hn.an")
    public static int field1904;

    @ObfuscatedName("hn.af")
    public static int field1906;

    @ObfuscatedName("ht.an")
    public static class187[] field1917;

    @ObfuscatedName("hi.at")
    public static class357 field1934;

    @ObfuscatedName("hv.at")
    public static class357 field1939;

    @ObfuscatedName("hv.av")
    public static int field1940;

    @ObfuscatedName("hv.an")
    public static class357 field1943;

    @ObfuscatedName("hv.ti")
    public static class39 field1945;

    @ObfuscatedName("hp.an")
    public static class357 field1953;

    @ObfuscatedName("hp.at")
    public static class357 field1958;

    @ObfuscatedName("hh.at")
    public static class357 field1969;

    @ObfuscatedName("hs.nq")
    public static int field1993;

    @ObfuscatedName("hd.av")
    public static class357 field1996;

    @ObfuscatedName("an.df")
    public static class514[] field2;

    @ObfuscatedName("hd.an")
    public static class357 field2002;

    @ObfuscatedName("hd.jf")
    public static class515[] field2024;

    @ObfuscatedName("hq.kj")
    public static class514[] field2049;

    @ObfuscatedName("ba.at")
    public static class171 field205;

    @ObfuscatedName("hq.sw")
    public static class163 field2051;

    @ObfuscatedName("ho.an")
    public static class357 field2063;

    @ObfuscatedName("ho.sf")
    public static class520 field2066;

    @ObfuscatedName("ho.at")
    public static class357 field2079;

    @ObfuscatedName("ho.jc")
    public static int[][] field2081;

    @ObfuscatedName("hf.at")
    public static class357 field2085;

    @ObfuscatedName("hm.at")
    public static class357 field2102;

    @ObfuscatedName("hm.ab")
    public static int field2103;

    @ObfuscatedName("hj.at")
    public static class357 field2110;

    @ObfuscatedName("hj.ab")
    public static class514 field2111;

    @ObfuscatedName("hj.wj")
    public static long field2113;

    @ObfuscatedName("hr.at")
    public static class357 field2115;

    @ObfuscatedName("hr.ar")
    public static String[] field2117;

    @ObfuscatedName("hl.an")
    public static class357 field2119;

    @ObfuscatedName("hl.at")
    public static class357 field2120;

    @ObfuscatedName("hl.av")
    public static class357 field2126;

    @ObfuscatedName("hl.uw")
    public static int field2143;

    @ObfuscatedName("hx.an")
    public static class357 field2145;

    @ObfuscatedName("hx.av")
    public static class357 field2146;

    @ObfuscatedName("hz.ab")
    public static class357 field2201;

    @ObfuscatedName("hz.ap")
    public static class357 field2215;

    @ObfuscatedName("hz.ak")
    public static boolean field2247;

    @ObfuscatedName("hg.at")
    public static class357 field2259;

    @ObfuscatedName("hg.uh")
    public static class58 field2260;

    @ObfuscatedName("hg.hr")
    public static int[] field2269;

    @ObfuscatedName("bn.id")
    public static class392 field227;

    @ObfuscatedName("hy.ax")
    public static class357 field2276;

    @ObfuscatedName("hy.ap")
    public static class357 field2277;

    @ObfuscatedName("in.jp")
    public static int field2315;

    @ObfuscatedName("in.kg")
    public static int field2317;

    @ObfuscatedName("ih.ur")
    public static int field2323;

    @ObfuscatedName("ih.ad")
    public static short[][] field2327;

    @ObfuscatedName("ij.ao")
    public static int[] field2330;

    @ObfuscatedName("bn.qq")
    public static class109 field236;

    @ObfuscatedName("bb.js")
    public static class230 field238;

    @ObfuscatedName("ik.iu")
    public static int field2380;

    @ObfuscatedName("iy.uv")
    public static int field2402;

    @ObfuscatedName("iy.fl")
    public static class427 field2403;

    @ObfuscatedName("ii.ww")
    public static Iterator field2405;

    @ObfuscatedName("iq.ac")
    public static int[] field2472;

    @ObfuscatedName("bx.kq")
    public static class515[] field253;

    @ObfuscatedName("bx.fr")
    public static class355 field255;

    @ObfuscatedName("iz.ai")
    public static int field2555;

    @ObfuscatedName("iz.ar")
    public static int field2562;

    @ObfuscatedName("iz.az")
    public static int field2564;

    @ObfuscatedName("iz.au")
    public static int field2565;

    @ObfuscatedName("iz.aq")
    public static int field2567;

    @ObfuscatedName("iz.aw")
    public static int field2568;

    @ObfuscatedName("iz.ay")
    public static int field2569;

    @ObfuscatedName("iz.am")
    public static int field2570;

    @ObfuscatedName("iz.bs")
    public static int field2572;

    @ObfuscatedName("iz.bc")
    public static int field2573;

    @ObfuscatedName("iz.bj")
    public static int field2574;

    @ObfuscatedName("iz.bo")
    public static int field2575;

    @ObfuscatedName("iz.ah")
    public static int field2582;

    @ObfuscatedName("iz.cg")
    public static int field2596;

    @ObfuscatedName("iz.cr")
    public static int field2604;

    @ObfuscatedName("iz.cd")
    public static boolean[][] field2606;

    @ObfuscatedName("iz.cv")
    public static int field2607;

    @ObfuscatedName("iz.cm")
    public static int field2609;

    @ObfuscatedName("iz.al")
    public static int field2610;

    @ObfuscatedName("iz.ci")
    public static int field2611;

    @ObfuscatedName("iz.cb")
    public static int field2612;

    @ObfuscatedName("im.iz")
    public static int field2620;

    @ObfuscatedName("if.as")
    public static short[][][] field2622;

    @ObfuscatedName("jh.ar")
    public static class97 field2681;

    @ObfuscatedName("jh.nx")
    public static int field2682;

    @ObfuscatedName("jh.aa")
    public static class315 field2683;

    @ObfuscatedName("jd.cv")
    public static int field2746;

    @ObfuscatedName("jd.cr")
    public static int field2747;

    @ObfuscatedName("jd.cd")
    public static int field2752;

    @ObfuscatedName("jz.ak")
    public static int field2763;

    @ObfuscatedName("jz.ap")
    public static int field2767;

    @ObfuscatedName("jz.ab")
    public static int field2768;

    @ObfuscatedName("jz.fy")
    public static class355 field2771;

    @ObfuscatedName("jn.jk")
    public static int[] field2789;

    @ObfuscatedName("bi.ak")
    public static ScheduledExecutorService field280;

    @ObfuscatedName("js.ul")
    public static int field2829;

    @ObfuscatedName("jj.cy")
    public static int field2851;

    @ObfuscatedName("jv.cj")
    public static int field2859;

    @ObfuscatedName("jt.jo")
    public static byte[][] field2868;

    @ObfuscatedName("bi.ax")
    public static int field292;

    @ObfuscatedName("jf.aj")
    public static class392 field2936;

    @ObfuscatedName("kf.ae")
    public static int field2945;

    @ObfuscatedName("kq.jq")
    public static int field2951;

    @ObfuscatedName("ky.ac")
    public static class484[] field2966;

    @ObfuscatedName("ka.be")
    public static class512 field2978;

    @ObfuscatedName("bi.gg")
    public static int field300;

    @ObfuscatedName("bi.gf")
    public static String field301;

    @ObfuscatedName("kh.aq")
    public static int field3024;

    @ObfuscatedName("kr.ao")
    public static short[] field3037;

    @ObfuscatedName("ku.jy")
    public static int[] field3051;

    @ObfuscatedName("ko.cw")
    public static class481 field3059;

    @ObfuscatedName("la.tv")
    public static class43 field3092;

    @ObfuscatedName("ln.ki")
    public static int field3093;

    @ObfuscatedName("ln.gw")
    public static class355 field3098;

    @ObfuscatedName("bv.co")
    public static String field315;

    @ObfuscatedName("br.jl")
    public static class514[] field335;

    @ObfuscatedName("ls.do")
    public static class514 field3360;

    @ObfuscatedName("lw.at")
    public static long field3365;

    @ObfuscatedName("lw.an")
    public static long field3366;

    @ObfuscatedName("br.iw")
    public static class112 field337;

    @ObfuscatedName("lu.hp")
    public static String field3381;

    @ObfuscatedName("ly.ae")
    public static int field3385;

    @ObfuscatedName("ly.av")
    public static class357 field3387;

    @ObfuscatedName("ly.as")
    public static class308 field3388;

    @ObfuscatedName("ly.an")
    public static class357 field3391;

    @ObfuscatedName("ly.aj")
    public static class46 field3392;

    @ObfuscatedName("ly.ak")
    public static int field3395;

    @ObfuscatedName("ly.at")
    public static class357 field3397;

    @ObfuscatedName("ly.jm")
    public static class515 field3399;

    @ObfuscatedName("lv.ak")
    public static byte[][][] field3400;

    @ObfuscatedName("lv.at")
    public static class357 field3401;

    @ObfuscatedName("lv.eb")
    public static boolean field3402;

    @ObfuscatedName("lv.ab")
    public static class357 field3403;

    @ObfuscatedName("lv.fd")
    public static class355 field3406;

    @ObfuscatedName("le.ag")
    public static class154 field3453;

    @ObfuscatedName("le.bj")
    public static class357 field3454;

    @ObfuscatedName("lc.fq")
    public static class355 field3459;

    @ObfuscatedName("ma.is")
    public static long field3476;

    @ObfuscatedName("ma.kt")
    public static int field3497;

    @ObfuscatedName("mc.rs")
    public static class174 field3505;

    @ObfuscatedName("mc.aa")
    public static class514[] field3509;

    @ObfuscatedName("mx.cx")
    public static int field3522;

    @ObfuscatedName("mm.gc")
    public static int field3525;

    @ObfuscatedName("mb.bc")
    public static class357 field3594;

    @ObfuscatedName("cu.ui")
    public static int field369;

    @ObfuscatedName("cu.fb")
    public static class355 field370;

    @ObfuscatedName("cu.ac")
    public static class330 field371;

    @ObfuscatedName("mp.an")
    public static int field3756;

    @ObfuscatedName("mz.at")
    public static class332 field3764;

    @ObfuscatedName("md.bl")
    public static class434 field3771;

    @ObfuscatedName("me.aa")
    public static int field3783;

    @ObfuscatedName("nf.by")
    public static String field3788;

    @ObfuscatedName("nf.gl")
    public static String field3789;

    @ObfuscatedName("ca.bc")
    public static int[] field382;

    @ObfuscatedName("na.dx")
    public static class514[] field3836;

    @ObfuscatedName("ca.af")
    public static class53[] field384;

    @ObfuscatedName("nt.cf")
    public static class346 field3842;

    @ObfuscatedName("ca.ao")
    public static class42[] field385;

    @ObfuscatedName("ca.aa")
    public static class47[] field386;

    @ObfuscatedName("ca.ak")
    public static int field387;

    @ObfuscatedName("ne.ap")
    public static boolean field3873;

    @ObfuscatedName("ne.by")
    public static client field3874;

    @ObfuscatedName("ni.qx")
    public static int field3878;

    @ObfuscatedName("ca.ad")
    public static boolean[] field388;

    @ObfuscatedName("ca.ac")
    public static int[] field389;

    @ObfuscatedName("ca.am")
    public static float[] field391;

    @ObfuscatedName("ca.ae")
    public static int field395;

    @ObfuscatedName("ca.aq")
    public static float[] field396;

    @ObfuscatedName("ca.aw")
    public static float[] field397;

    @ObfuscatedName("ca.ay")
    public static float[] field398;

    @ObfuscatedName("ca.al")
    public static float[] field399;

    @ObfuscatedName("ca.bs")
    public static float[] field402;

    @ObfuscatedName("ca.bj")
    public static int[] field403;

    @ObfuscatedName("ca.aj")
    public static class51[] field405;

    @ObfuscatedName("ch.ae")
    public static class515 field416;

    @ObfuscatedName("nb.fk")
    public static class355 field4195;

    @ObfuscatedName("cp.ae")
    public static int field421;

    @ObfuscatedName("nz.ax")
    public static Thread field4223;

    @ObfuscatedName("ny.ju")
    public static int field4232;

    @ObfuscatedName("cp.ak")
    public static float field425;

    @ObfuscatedName("nx.at")
    public static class427 field4271;

    @ObfuscatedName("nl.la")
    public static int field4295;

    @ObfuscatedName("od.aj")
    public static short[] field4313;

    @ObfuscatedName("oe.fi")
    public static class355 field4320;

    @ObfuscatedName("ow.wz")
    public static class359 field4323;

    @ObfuscatedName("oc.ae")
    public static int[] field4328;

    @ObfuscatedName("cy.bf")
    public static Image field433;

    @ObfuscatedName("oj.fo")
    public static class355 field4348;

    @ObfuscatedName("oj.gd")
    public static class355 field4352;

    @ObfuscatedName("oo.ld")
    public static int field4358;

    @ObfuscatedName("oo.ag")
    public static class501 field4366;

    @ObfuscatedName("ok.af")
    public static class45 field4390;

    @ObfuscatedName("ou.ax")
    public static File field4406;

    @ObfuscatedName("of.si")
    public static class154 field4412;

    @ObfuscatedName("pd.ao")
    public static int field4437;

    @ObfuscatedName("cd.cl")
    public static int field444;

    @ObfuscatedName("pb.gp")
    public static int field4444;

    @ObfuscatedName("cd.nl")
    public static int field445;

    @ObfuscatedName("pn.ao")
    public static class514[] field4455;

    @ObfuscatedName("pv.ko")
    public static int field4481;

    @ObfuscatedName("pc.ax")
    public static int[] field4512;

    @ObfuscatedName("pz.ip")
    public static class392 field4520;

    @ObfuscatedName("pz.je")
    public static class515 field4523;

    @ObfuscatedName("pp.bz")
    public static GarbageCollectorMXBean field4534;

    @ObfuscatedName("pt.so")
    public static class417 field4535;

    @ObfuscatedName("pi.at")
    public static class357 field4553;

    @ObfuscatedName("pa.kx")
    public static class514[] field4559;

    @ObfuscatedName("pa.au")
    public static class501 field4562;

    @ObfuscatedName("pr.bt")
    public static class434 field4573;

    @ObfuscatedName("qi.aj")
    public static class52 field4601;

    @ObfuscatedName("qt.gj")
    public static String field4611;

    @ObfuscatedName("qh.cy")
    public static class372 field4618;

    @ObfuscatedName("qw.ad")
    public static int field4623;

    @ObfuscatedName("qw.ao")
    public static class182 field4628;

    @ObfuscatedName("qa.us")
    public static int field4637;

    @ObfuscatedName("qk.ae")
    public static int field4671;

    @ObfuscatedName("qp.as")
    public static int field4685;

    @ObfuscatedName("rx.cv")
    public static String field4711;

    @ObfuscatedName("ro.ai")
    public static int field4720;

    @ObfuscatedName("rb.ax")
    public static int field4726;

    @ObfuscatedName("rv.aq")
    public static String field4733;

    @ObfuscatedName("cm.ix")
    public static int field475;

    @ObfuscatedName("rc.bc")
    public static Font field4760;

    @ObfuscatedName("cm.wn")
    public static class471 field479;

    @ObfuscatedName("ao.vn")
    public static class98 field48;

    @ObfuscatedName("cm.oq")
    public static int field480;

    @ObfuscatedName("ri.aj")
    public static boolean field4804;

    @ObfuscatedName("rw.fw")
    public static class355 field4813;

    @ObfuscatedName("sb.ge")
    public static class433 field4893;

    @ObfuscatedName("sb.fh")
    public static class355 field4899;

    @ObfuscatedName("sm.ax")
    public static class514 field4940;

    @ObfuscatedName("su.ab")
    public static int field4941;

    @ObfuscatedName("sp.aw")
    public static int field4961;

    @ObfuscatedName("ci.vh")
    public static class69 field497;

    @ObfuscatedName("sk.av")
    public static int field4971;

    @ObfuscatedName("sw.iv")
    public static class472 field4980;

    @ObfuscatedName("sl.at")
    public static class357 field4984;

    @ObfuscatedName("ci.ad")
    public static class356 field499;

    @ObfuscatedName("tp.at")
    public static class357 field4998;

    @ObfuscatedName("th.ag")
    public static int field4999;

    @ObfuscatedName("an.ae")
    public static int field5;

    @ObfuscatedName("ti.al")
    public static int field5086;

    @ObfuscatedName("ti.am")
    public static int field5088;

    @ObfuscatedName("ti.bs")
    public static float[] field5089;

    @ObfuscatedName("ti.ay")
    public static int[] field5091;

    @ObfuscatedName("tv.cd")
    public static String field5099;

    @ObfuscatedName("tt.ap")
    public static int[] field5126;

    @ObfuscatedName("tt.as")
    public static int[] field5127;

    @ObfuscatedName("tt.at")
    public static int field5128;

    @ObfuscatedName("tt.ab")
    public static int[] field5129;

    @ObfuscatedName("tt.ak")
    public static int[] field5130;

    @ObfuscatedName("tt.ae")
    public static byte[][] field5131;

    @ObfuscatedName("ud.an")
    public static String field5177;

    @ObfuscatedName("ud.at")
    public static Applet field5178;

    @ObfuscatedName("aa.av")
    public static int field56;

    @ObfuscatedName("aj.ka")
    public static class515[] field58;

    @ObfuscatedName("ad.wp")
    public static int field63;

    @ObfuscatedName("ad.aa")
    public static short[][] field66;

    @ObfuscatedName("ad.ao")
    public static class514 field68;

    @ObfuscatedName("ad.bq")
    public static class357 field69;

    @ObfuscatedName("ac.sa")
    public static boolean field74;

    @ObfuscatedName("ag.an")
    public static class16 field79;

    @ObfuscatedName("cc.af")
    public static class114 field809;

    @ObfuscatedName("cc.ax")
    public static class68[] field812;

    @ObfuscatedName("ar.dn")
    public static class515[] field83;

    @ObfuscatedName("ar.am")
    public static class330[][] field84;

    @ObfuscatedName("ce.ie")
    public static class180 field859;

    @ObfuscatedName("ah.fs")
    public static class355 field86;

    @ObfuscatedName("ce.ae")
    public static int field861;

    @ObfuscatedName("ce.ad")
    public static class330 field865;

    @ObfuscatedName("ce.ah")
    public static int field866;

    @ObfuscatedName("ah.gm")
    public static String field87;

    @ObfuscatedName("ce.ax")
    public static String[] field870;

    @ObfuscatedName("ce.ar")
    public static class163 field873;

    @ObfuscatedName("ce.as")
    public static int[] field875;

    @ObfuscatedName("cj.qe")
    public static class486 field888;

    @ObfuscatedName("ax.gx")
    public static String field9;

    @ObfuscatedName("cn.bo")
    public static class357 field906;

    @ObfuscatedName("ct.qb")
    public static int field912;

    @ObfuscatedName("ct.jb")
    public static byte[][] field915;

    @ObfuscatedName("ct.ax")
    public static short[][][] field917;

    @ObfuscatedName("cx.lx")
    public static int field918;

    @ObfuscatedName("cx.an")
    public static boolean field919;

    @ObfuscatedName("cx.as")
    public static class514[] field921;

    @ObfuscatedName("cx.ap")
    public static class514 field922;

    @ObfuscatedName("az.wf")
    public static short[] field93;

    @ObfuscatedName("cx.af")
    public static class515 field944;

    @ObfuscatedName("co.mw")
    public static class92 field971;

    @ObfuscatedName("au.dz")
    public static class514 field98;

    @ObfuscatedName("cz.gi")
    public static int field985;

    @ObfuscatedName("au.fc")
    public static class180 field99;

    @ObfuscatedName("sp.at(IB)I")
    public static int method7971(int arg0) {
        return arg0 == 0 || arg0 == 1 ? 0 : -1;
    }

    @ObfuscatedName("fe.at(I)[Llj;")
    public static class295[] method2884() {
        return new class295[] { class295.field3207, class295.field3200, class295.field3208, class295.field3202, class295.field3199, class295.field3204, class295.field3203, class295.field3206, class295.field3209, class295.field3205, class295.field3201 };
    }

    @ObfuscatedName("ah.at(Lnq;S)V")
    public static void method237(class357 arg0) {
        field2115 = arg0;
    }

    @ObfuscatedName("pz.at(II)Ltx;")
    public static class520 method6978(int arg0) {
        class520[] var1 = new class520[] { class520.field5156, class520.field5155, class520.field5154 };
        class520[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class520 var4 = var2[var3];
            if (var4.field5157 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("ce.at([BB)Ltm;")
    public static final class515 method1943(byte[] arg0) {
        Object var1 = null;
        try {
            Class var2 = ImageIO.class;
            BufferedImage var3;
            synchronized (ImageIO.class) {
                var3 = ImageIO.read(new ByteArrayInputStream(arg0));
            }
            int var5 = var3.getWidth();
            int var6 = var3.getHeight();
            int[] var7 = new int[var5 * var6];
            PixelGrabber var8 = new PixelGrabber(var3, 0, 0, var5, var6, var7, 0, var5);
            var8.grabPixels();
            return new class515(var7, var5, var6);
        } catch (IOException var12) {
        } catch (InterruptedException var13) {
        }
        return new class515(0, 0);
    }

    @ObfuscatedName("ff.an(II)Lhr;")
    public static class203 method2932(int arg0) {
        class203 var1 = (class203) class203.field2116.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2115.method6080(34, arg0);
        class203 var3 = new class203();
        if (var2 != null) {
            var3.method3521(new class501(var2));
        }
        var3.method3513();
        class203.field2116.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gn.ax(IIIII)I")
    public static final int method3209(int arg0, int arg1, int arg2, int arg3) {
        return arg0 * arg2 + arg1 * arg3 >> 16;
    }

    @ObfuscatedName("hp.ab(I)[Lnw;")
    public static class352[] method3344() {
        return new class352[] { class352.field4202, class352.field4206, class352.field4205, class352.field4212, class352.field4200, class352.field4213, class352.field4209, class352.field4204, class352.field4198, class352.field4201, class352.field4207, class352.field4208, class352.field4211, class352.field4203, class352.field4210, class352.field4214, class352.field4218 };
    }

    @ObfuscatedName("du.av(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method2499(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            class32.method176(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (class32.field161.startsWith("win") && !arg3) {
            class32.method176(arg0, 0, "openjs");
            return;
        }
        if (class32.field161.startsWith("mac")) {
            class32.method176(arg0, 1, arg2);
            return;
        }
        class32.method176(arg0, 2, "openjs");
    }

    @ObfuscatedName("cc.at(Lnq;Lnq;I)Z")
    public static boolean method1709(class357 arg0, class357 arg1) {
        field4553 = arg1;
        if (!arg0.method6085()) {
            return false;
        }
        field56 = arg0.method6135(35);
        field1917 = new class187[field56];
        for (int var2 = 0; var2 < field56; var2++) {
            byte[] var3 = arg0.method6080(35, var2);
            field1917[var2] = new class187(var2);
            if (var3 != null) {
                field1917[var2].method3283(new class501(var3));
                field1917[var2].method3276();
            }
        }
        return true;
    }

    @ObfuscatedName("tz.an(III)V")
    public static void method8378(int arg0, int arg1) {
        class201 var2 = (class201) class201.field2096.method5121((long) arg0);
        class201 var3;
        if (var2 == null) {
            byte[] var4 = field2102.method6080(14, arg0);
            class201 var5 = new class201();
            if (var4 != null) {
                var5.method3483(new class501(var4));
            }
            class201.field2096.method5123(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field2100;
        int var8 = var3.field2099;
        int var9 = var3.field2098;
        int var10 = class320.field3512[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        class320.field3514[var7] = class320.field3514[var7] & ~var11 | arg1 << var8 & var11;
    }

    @ObfuscatedName("og.av(Lnq;IIIZI)V")
    public static void method6266(class357 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class305.field3390 = 1;
        field1437 = arg0;
        field2103 = arg1;
        field3395 = arg2;
        field3385 = arg3;
        field1566 = arg4;
        field1735 = 10000;
    }

    @ObfuscatedName("pv.an(IZI)[B")
    public static synchronized byte[] method6944(int arg0, boolean arg1) {
        if ((arg0 == 100 || arg0 < 100 && arg1) && class400.field4483 > 0) {
            byte[] var2 = class400.field4488[--class400.field4483];
            class400.field4488[class400.field4483] = null;
            return var2;
        } else if ((arg0 == 5000 || arg0 < 5000 && arg1) && class400.field4491 > 0) {
            byte[] var3 = class400.field4489[--class400.field4491];
            class400.field4489[class400.field4491] = null;
            return var3;
        } else if ((arg0 == 10000 || arg0 < 10000 && arg1) && class400.field4482 > 0) {
            byte[] var4 = class400.field4493[--class400.field4482];
            class400.field4493[class400.field4482] = null;
            return var4;
        } else if ((arg0 == 30000 || arg0 < 30000 && arg1) && class400.field4480 > 0) {
            byte[] var5 = class400.field4495[--class400.field4480];
            class400.field4495[class400.field4480] = null;
            return var5;
        } else {
            if (field1837 != null) {
                for (int var6 = 0; var6 < field1686.length; var6++) {
                    if ((field1686[var6] == arg0 || arg0 < field1686[var6] && arg1) && field1150[var6] > 0) {
                        byte[] var7 = field1837[var6][--field1150[var6]];
                        field1837[var6][field1150[var6]] = null;
                        return var7;
                    }
                }
            }
            if (arg1 && field1686 != null) {
                for (int var8 = 0; var8 < field1686.length; var8++) {
                    if (arg0 <= field1686[var8] && field1150[var8] < field1837[var8].length) {
                        return new byte[field1686[var8]];
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @ObfuscatedName("gv.av([Lcc;II[I[II)V")
    public static void method3072(class68[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class68 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field824;
                        var12 = var8.field824;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field821;
                        var12 = var8.field821;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1659() ? 1 : 0;
                        var12 = var8.method1659() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field818;
                        var12 = var8.field818;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field824;
                        var16 = var8.field824;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field821;
                        var16 = var8.field821;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1659() ? 1 : 0;
                        var16 = var8.method1659() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field818;
                        var16 = var8.field818;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class68 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3072(arg0, arg1, var6, arg3, arg4);
        method3072(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("gj.at(II)I")
    public static int method3228(int arg0) {
        return class29.field151[arg0];
    }

    @ObfuscatedName("gn.as(CLoj;I)I")
    public static int method3199(char arg0, class372 arg1) {
        int var2 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var2 = (arg0 << 4) + 1;
        }
        if (arg0 == 241 && class372.field4345 == arg1) {
            var2 = 1762;
        }
        return var2;
    }

    @ObfuscatedName("sr.av(Lny;II)V")
    public static void method7827(class355 arg0, int arg1) {
        field4562.field5017 = arg1 * 8 + 5;
        if (field4562.field5017 < field4562.field5016.length) {
            int var2 = field4562.method8134();
            int var3 = field4562.method8134();
            arg0.method6036(var2, var3);
        } else if (arg0.field4243) {
            arg0.method6033();
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("ih.aa(CI)Z")
    public static boolean method3784(char arg0) {
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @ObfuscatedName("le.as(IZIZB)V")
    public static void method5356(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (field812 != null) {
            class68.method4551(0, field812.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("lv.ak([BIIB)Z")
    public static final boolean method5192(byte[] arg0, int arg1, int arg2) {
        boolean var3 = true;
        class501 var4 = new class501(arg0);
        int var5 = -1;
        label57: while (true) {
            int var6 = var4.method8243();
            if (var6 == 0) {
                return var3;
            }
            var5 += var6;
            int var7 = 0;
            boolean var8 = false;
            while (true) {
                while (!var8) {
                    int var10 = var4.method8144();
                    if (var10 == 0) {
                        continue label57;
                    }
                    var7 += var10 - 1;
                    int var11 = var7 & 0x3F;
                    int var12 = var7 >> 6 & 0x3F;
                    int var13 = var4.method8129() >> 2;
                    int var14 = arg1 + var12;
                    int var15 = arg2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class205 var16 = class205.method3219(var5);
                        if (var13 != 22 || !client.field508 || var16.field2164 != 0 || var16.field2162 == 1 || var16.field2183) {
                            if (!var16.method3573()) {
                                client.field575++;
                                var3 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var9 = var4.method8144();
                if (var9 == 0) {
                    break;
                }
                var4.method8129();
            }
        }
    }

    @ObfuscatedName("ao.au(Ljava/lang/String;II)V")
    public static final void method95(String arg0, int arg1) {
        class296 var2 = class296.method3619(class294.field3180, client.field568.field1380);
        var2.field3211.method8113(class501.method5933(arg0) + 1);
        var2.field3211.method8119(arg0);
        var2.field3211.method8159(arg1);
        client.field568.method2642(var2);
    }

    @ObfuscatedName("hn.aa(Liz;[Lic;I)V")
    public static final void method3258(class230 arg0, class213[] arg1) {
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    if ((class82.field1018[var2][var3][var4] & 0x1) == 1) {
                        int var5 = var2;
                        if ((class82.field1018[1][var3][var4] & 0x2) == 2) {
                            var5 = var2 - 1;
                        }
                        if (var5 >= 0) {
                            arg1[var5].method3827(var3, var4);
                        }
                    }
                }
            }
        }
        class82.field1028 += (int) (Math.random() * 5.0D) - 2;
        if (class82.field1028 < -8) {
            class82.field1028 = -8;
        }
        if (class82.field1028 > 8) {
            class82.field1028 = 8;
        }
        class82.field1025 += (int) (Math.random() * 5.0D) - 2;
        if (class82.field1025 < -16) {
            class82.field1025 = -16;
        }
        if (class82.field1025 > 16) {
            class82.field1025 = 16;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            byte[][] var7 = field3400[var6];
            boolean var8 = true;
            boolean var9 = true;
            boolean var10 = true;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = (int) Math.sqrt(5100.0D);
            int var14 = var13 * 768 >> 8;
            for (int var15 = 1; var15 < 103; var15++) {
                for (int var16 = 1; var16 < 103; var16++) {
                    int var17 = class82.field1016[var6][var16 + 1][var15] - class82.field1016[var6][var16 - 1][var15];
                    int var18 = class82.field1016[var6][var16][var15 + 1] - class82.field1016[var6][var16][var15 - 1];
                    int var19 = (int) Math.sqrt((double) (var18 * var18 + var17 * var17 + 65536));
                    int var20 = (var17 << 8) / var19;
                    int var21 = 65536 / var19;
                    int var22 = (var18 << 8) / var19;
                    int var23 = (var22 * -50 + var20 * -50 + var21 * -10) / var14 + 96;
                    int var24 = (var7[var16][var15] >> 1) + (var7[var16][var15 + 1] >> 3) + (var7[var16][var15 - 1] >> 2) + (var7[var16 - 1][var15] >> 2) + (var7[var16 + 1][var15] >> 3);
                    field117[var16][var15] = var23 - var24;
                }
            }
            for (int var25 = 0; var25 < 104; var25++) {
                field1429[var25] = 0;
                field2330[var25] = 0;
                field1029[var25] = 0;
                field1663[var25] = 0;
                field1020[var25] = 0;
            }
            for (int var26 = -5; var26 < 109; var26++) {
                for (int var27 = 0; var27 < 104; var27++) {
                    int var28 = var26 + 5;
                    int var10002;
                    if (var28 >= 0 && var28 < 104) {
                        long var29 = (long) Math.pow(2.0D, 15.0D) - 1L;
                        int var31 = (int) var29;
                        int var32 = field2622[var6][var28][var27] & var31;
                        if (var32 > 0) {
                            class199 var33 = class199.method3238(var32 - 1);
                            field1429[var27] += var33.field2086;
                            field2330[var27] += var33.field2087;
                            field1029[var27] += var33.field2082;
                            field1663[var27] += var33.field2088;
                            var10002 = field1020[var27]++;
                        }
                    }
                    int var34 = var26 - 5;
                    if (var34 >= 0 && var34 < 104) {
                        int var35 = (int) class303.method3898(15);
                        int var36 = field2622[var6][var34][var27] & var35;
                        if (var36 > 0) {
                            class199 var37 = class199.method3238(var36 - 1);
                            field1429[var27] -= var37.field2086;
                            field2330[var27] -= var37.field2087;
                            field1029[var27] -= var37.field2082;
                            field1663[var27] -= var37.field2088;
                            var10002 = field1020[var27]--;
                        }
                    }
                }
                if (var26 >= 1 && var26 < 103) {
                    int var38 = 0;
                    int var39 = 0;
                    int var40 = 0;
                    int var41 = 0;
                    int var42 = 0;
                    for (int var43 = -5; var43 < 109; var43++) {
                        int var44 = var43 + 5;
                        if (var44 >= 0 && var44 < 104) {
                            var38 += field1429[var44];
                            var39 += field2330[var44];
                            var40 += field1029[var44];
                            var41 += field1663[var44];
                            var42 += field1020[var44];
                        }
                        int var45 = var43 - 5;
                        if (var45 >= 0 && var45 < 104) {
                            var38 -= field1429[var45];
                            var39 -= field2330[var45];
                            var40 -= field1029[var45];
                            var41 -= field1663[var45];
                            var42 -= field1020[var45];
                        }
                        if (var43 >= 1 && var43 < 103 && (!client.field508 || (class82.field1018[0][var26][var43] & 0x2) != 0 || (class82.field1018[var6][var26][var43] & 0x10) == 0)) {
                            if (var6 < class82.field1017) {
                                class82.field1017 = var6;
                            }
                            long var46 = (long) Math.pow(2.0D, 15.0D) - 1L;
                            int var48 = (int) var46;
                            int var49 = field2622[var6][var26][var43] & var48;
                            int var50 = field917[var6][var26][var43] & var48;
                            if (var49 > 0 || var50 > 0) {
                                int var51 = class82.field1016[var6][var26][var43];
                                int var52 = class82.field1016[var6][var26 + 1][var43];
                                int var53 = class82.field1016[var6][var26 + 1][var43 + 1];
                                int var54 = class82.field1016[var6][var26][var43 + 1];
                                int var55 = field117[var26][var43];
                                int var56 = field117[var26 + 1][var43];
                                int var57 = field117[var26 + 1][var43 + 1];
                                int var58 = field117[var26][var43 + 1];
                                int var59 = -1;
                                int var60 = -1;
                                if (var49 > 0) {
                                    int var61 = var38 * 256 / var41;
                                    int var62 = var39 / var42;
                                    int var63 = var40 / var42;
                                    var59 = class82.method607(var61, var62, var63);
                                    int var64 = class82.field1028 + var61 & 0xFF;
                                    int var65 = class82.field1025 + var63;
                                    if (var65 < 0) {
                                        var65 = 0;
                                    } else if (var65 > 255) {
                                        var65 = 255;
                                    }
                                    var60 = class82.method607(var64, var62, var65);
                                }
                                if (var6 > 0) {
                                    boolean var66 = true;
                                    if (var49 == 0 && field1128[var6][var26][var43] != 0) {
                                        var66 = false;
                                    }
                                    if (var50 > 0) {
                                        int var67 = var50 - 1;
                                        class207 var68 = (class207) class207.field2258.method5121((long) var67);
                                        class207 var69;
                                        if (var68 == null) {
                                            byte[] var70 = field2259.method6080(4, var67);
                                            class207 var71 = new class207();
                                            if (var70 != null) {
                                                var71.method3702(new class501(var70), var67);
                                            }
                                            var71.method3697();
                                            class207.field2258.method5123(var71, (long) var67);
                                            var69 = var71;
                                        } else {
                                            var69 = var68;
                                        }
                                        if (!var69.field2261) {
                                            var66 = false;
                                        }
                                    }
                                    if (var66 && var51 == var52 && var51 == var53 && var51 == var54) {
                                        field1021[var6][var26][var43] |= 0x924;
                                    }
                                }
                                int var72 = 0;
                                if (var60 != -1) {
                                    var72 = class226.field2516[class82.method2133(var60, 96)];
                                }
                                if (var50 == 0) {
                                    arg0.method4302(var6, var26, var43, 0, 0, -1, var51, var52, var53, var54, class82.method2133(var59, var55), class82.method2133(var59, var56), class82.method2133(var59, var57), class82.method2133(var59, var58), 0, 0, 0, 0, var72, 0);
                                } else {
                                    int var73 = field1128[var6][var26][var43] + 1;
                                    byte var74 = field1019[var6][var26][var43];
                                    int var75 = var50 - 1;
                                    class207 var76 = (class207) class207.field2258.method5121((long) var75);
                                    class207 var77;
                                    if (var76 == null) {
                                        byte[] var78 = field2259.method6080(4, var75);
                                        class207 var79 = new class207();
                                        if (var78 != null) {
                                            var79.method3702(new class501(var78), var75);
                                        }
                                        var79.method3697();
                                        class207.field2258.method5123(var79, (long) var75);
                                        var77 = var79;
                                    } else {
                                        var77 = var76;
                                    }
                                    int var81 = var77.field2266;
                                    int var82;
                                    int var83;
                                    if (var81 >= 0) {
                                        var82 = class226.field2521.field2793.method4367(var81);
                                        var83 = -1;
                                    } else if (var77.field2267 == 16711935) {
                                        var83 = -2;
                                        var81 = -1;
                                        var82 = -2;
                                    } else {
                                        var83 = class82.method607(var77.field2257, var77.field2264, var77.field2265);
                                        int var84 = class82.field1028 + var77.field2257 & 0xFF;
                                        int var85 = class82.field1025 + var77.field2265;
                                        if (var85 < 0) {
                                            var85 = 0;
                                        } else if (var85 > 255) {
                                            var85 = 255;
                                        }
                                        var82 = class82.method607(var84, var77.field2264, var85);
                                    }
                                    int var86 = 0;
                                    if (var82 != -2) {
                                        var86 = class226.field2516[class82.method7276(var82, 96)];
                                    }
                                    if (var77.field2262 != -1) {
                                        int var87 = class82.field1028 + var77.field2268 & 0xFF;
                                        int var88 = class82.field1025 + var77.field2270;
                                        if (var88 < 0) {
                                            var88 = 0;
                                        } else if (var88 > 255) {
                                            var88 = 255;
                                        }
                                        int var89 = class82.method607(var87, var77.field2263, var88);
                                        var86 = class226.field2516[class82.method7276(var89, 96)];
                                    }
                                    arg0.method4302(var6, var26, var43, var73, var74, var81, var51, var52, var53, var54, class82.method2133(var59, var55), class82.method2133(var59, var56), class82.method2133(var59, var57), class82.method2133(var59, var58), class82.method7276(var83, var55), class82.method7276(var83, var56), class82.method7276(var83, var57), class82.method7276(var83, var58), var72, var86);
                                }
                            }
                        }
                    }
                }
            }
            for (int var90 = 1; var90 < 103; var90++) {
                for (int var91 = 1; var91 < 103; var91++) {
                    arg0.method4156(var6, var91, var90, class82.method2883(var6, var91, var90));
                }
            }
            field2622[var6] = (short[][]) null;
            field917[var6] = (short[][]) null;
            field1128[var6] = (byte[][]) null;
            field1019[var6] = (byte[][]) null;
            field3400[var6] = (byte[][]) null;
        }
        arg0.method4183(-50, -10, -50);
        for (int var92 = 0; var92 < 104; var92++) {
            for (int var93 = 0; var93 < 104; var93++) {
                if ((class82.field1018[1][var92][var93] & 0x2) == 2) {
                    arg0.method4154(var92, var93);
                }
            }
        }
        int var94 = 1;
        int var95 = 2;
        int var96 = 4;
        for (int var97 = 0; var97 < 4; var97++) {
            if (var97 > 0) {
                var94 <<= 0x3;
                var95 <<= 0x3;
                var96 <<= 0x3;
            }
            for (int var98 = 0; var98 <= var97; var98++) {
                for (int var99 = 0; var99 <= 104; var99++) {
                    for (int var100 = 0; var100 <= 104; var100++) {
                        if ((field1021[var98][var100][var99] & var94) != 0) {
                            int var101 = var99;
                            int var102 = var99;
                            int var103 = var98;
                            int var104 = var98;
                            while (var101 > 0 && (field1021[var98][var100][var101 - 1] & var94) != 0) {
                                var101--;
                            }
                            while (var102 < 104 && (field1021[var98][var100][var102 + 1] & var94) != 0) {
                                var102++;
                            }
                            label355: while (var103 > 0) {
                                for (int var105 = var101; var105 <= var102; var105++) {
                                    if ((field1021[var103 - 1][var100][var105] & var94) == 0) {
                                        break label355;
                                    }
                                }
                                var103--;
                            }
                            label344: while (var104 < var97) {
                                for (int var106 = var101; var106 <= var102; var106++) {
                                    if ((field1021[var104 + 1][var100][var106] & var94) == 0) {
                                        break label344;
                                    }
                                }
                                var104++;
                            }
                            int var107 = (var104 + 1 - var103) * (var102 - var101 + 1);
                            if (var107 >= 8) {
                                short var108 = 240;
                                int var109 = class82.field1016[var104][var100][var101] - var108;
                                int var110 = class82.field1016[var103][var100][var101];
                                class230.method4155(var97, 1, var100 * 128, var100 * 128, var101 * 128, var102 * 128 + 128, var109, var110);
                                for (int var111 = var103; var111 <= var104; var111++) {
                                    for (int var112 = var101; var112 <= var102; var112++) {
                                        field1021[var111][var100][var112] &= ~var94;
                                    }
                                }
                            }
                        }
                        if ((field1021[var98][var100][var99] & var95) != 0) {
                            int var113 = var100;
                            int var114 = var100;
                            int var115 = var98;
                            int var116 = var98;
                            while (var113 > 0 && (field1021[var98][var113 - 1][var99] & var95) != 0) {
                                var113--;
                            }
                            while (var114 < 104 && (field1021[var98][var114 + 1][var99] & var95) != 0) {
                                var114++;
                            }
                            label408: while (var115 > 0) {
                                for (int var117 = var113; var117 <= var114; var117++) {
                                    if ((field1021[var115 - 1][var117][var99] & var95) == 0) {
                                        break label408;
                                    }
                                }
                                var115--;
                            }
                            label397: while (var116 < var97) {
                                for (int var118 = var113; var118 <= var114; var118++) {
                                    if ((field1021[var116 + 1][var118][var99] & var95) == 0) {
                                        break label397;
                                    }
                                }
                                var116++;
                            }
                            int var119 = (var116 + 1 - var115) * (var114 - var113 + 1);
                            if (var119 >= 8) {
                                short var120 = 240;
                                int var121 = class82.field1016[var116][var113][var99] - var120;
                                int var122 = class82.field1016[var115][var113][var99];
                                class230.method4155(var97, 2, var113 * 128, var114 * 128 + 128, var99 * 128, var99 * 128, var121, var122);
                                for (int var123 = var115; var123 <= var116; var123++) {
                                    for (int var124 = var113; var124 <= var114; var124++) {
                                        field1021[var123][var124][var99] &= ~var95;
                                    }
                                }
                            }
                        }
                        if ((field1021[var98][var100][var99] & var96) != 0) {
                            int var125 = var100;
                            int var126 = var100;
                            int var127 = var99;
                            int var128 = var99;
                            while (var127 > 0 && (field1021[var98][var100][var127 - 1] & var96) != 0) {
                                var127--;
                            }
                            while (var128 < 104 && (field1021[var98][var100][var128 + 1] & var96) != 0) {
                                var128++;
                            }
                            label461: while (var125 > 0) {
                                for (int var129 = var127; var129 <= var128; var129++) {
                                    if ((field1021[var98][var125 - 1][var129] & var96) == 0) {
                                        break label461;
                                    }
                                }
                                var125--;
                            }
                            label450: while (var126 < 104) {
                                for (int var130 = var127; var130 <= var128; var130++) {
                                    if ((field1021[var98][var126 + 1][var130] & var96) == 0) {
                                        break label450;
                                    }
                                }
                                var126++;
                            }
                            if ((var126 - var125 + 1) * (var128 - var127 + 1) >= 4) {
                                int var131 = class82.field1016[var98][var125][var127];
                                class230.method4155(var97, 4, var125 * 128, var126 * 128 + 128, var127 * 128, var128 * 128 + 128, var131, var131);
                                for (int var132 = var125; var132 <= var126; var132++) {
                                    for (int var133 = var127; var133 <= var128; var133++) {
                                        field1021[var98][var132][var133] &= ~var96;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gc.ap(ILdd;ZI)I")
    public static int method3197(int arg0, class79 arg1, boolean arg2) {
        int var3 = -1;
        class330 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class71.field860[--field861];
            var4 = class330.method1746(var3);
        } else {
            var4 = arg2 ? field371 : field865;
        }
        if (arg0 == 1000) {
            field861 -= 4;
            var4.field3713 = class71.field860[field861];
            var4.field3613 = class71.field860[field861 + 1];
            var4.field3677 = class71.field860[field861 + 2];
            var4.field3609 = class71.field860[field861 + 3];
            client.method2632(var4);
            field3874.method1220(var4);
            if (var3 != -1 && var4.field3728 == 0) {
                client.method2025(field84[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            field861 -= 4;
            var4.field3614 = class71.field860[field861];
            var4.field3615 = class71.field860[field861 + 1];
            var4.field3610 = class71.field860[field861 + 2];
            var4.field3611 = class71.field860[field861 + 3];
            client.method2632(var4);
            field3874.method1220(var4);
            if (var3 != -1 && var4.field3728 == 0) {
                client.method2025(field84[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = class71.field860[--field861] == 1;
            if (var4.field3608 != var5) {
                var4.field3608 = var5;
                client.method2632(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3750 = class71.field860[--field861] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3751 = class71.field860[--field861] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("js.bq(Lhx;I)Z")
    public static boolean method4631(class205 arg0) {
        if (arg0.field2152 != null) {
            int[] var1 = arg0.field2152;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class205 var4 = class205.method3219(var3);
                if (var4.field2171 != -1) {
                    return true;
                }
            }
        } else if (arg0.field2171 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("jz.ae(ZI)V")
    public static void method4550(boolean arg0) {
        if (field3874.method1132() || field3874.method1422() || field3874.method1133()) {
            method6605(10);
            return;
        }
        class76.field933 = class350.field4089;
        class76.field952 = class350.field4105;
        class76.field935 = class350.field4091;
        method6605(2);
        if (arg0) {
            class76.field937 = "";
        }
        class76.method2630();
        class76.method4956();
    }

    @ObfuscatedName("ik.ai(ILdd;ZI)I")
    public static int method3861(int arg0, class79 arg1, boolean arg2) {
        class330 var3 = class330.method1746(class71.field860[--field861]);
        if (arg0 == 2500) {
            class71.field860[++field861 - 1] = var3.field3616;
            return 1;
        } else if (arg0 == 2501) {
            class71.field860[++field861 - 1] = var3.field3626;
            return 1;
        } else if (arg0 == 2502) {
            class71.field860[++field861 - 1] = var3.field3618;
            return 1;
        } else if (arg0 == 2503) {
            class71.field860[++field861 - 1] = var3.field3735;
            return 1;
        } else if (arg0 == 2504) {
            class71.field860[++field861 - 1] = var3.field3608 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            class71.field860[++field861 - 1] = var3.field3622;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pu.au(IB)V")
    public static void method6605(int arg0) {
        if (class76.field951 != arg0) {
            class76.field951 = arg0;
        }
    }

    @ObfuscatedName("rk.ho(B)V")
    public static final void method7590() {
        if (field1882 != client.field748) {
            client.field748 = field1882;
            method2142(field1882);
        }
    }

    @ObfuscatedName("an.hu(B)V")
    public static final void method4() {
        int[] var0 = class107.field1335;
        for (int var1 = 0; var1 < class107.field1332; var1++) {
            class92 var2 = client.field613[var0[var1]];
            if (var2 != null && var2.field1215 > 0) {
                var2.field1215--;
                if (var2.field1215 == 0) {
                    var2.field1173 = null;
                }
            }
        }
        for (int var3 = 0; var3 < client.field542; var3++) {
            int var4 = client.field540[var3];
            class100 var5 = client.field563[var4];
            if (var5 != null && var5.field1215 > 0) {
                var5.field1215--;
                if (var5.field1215 == 0) {
                    var5.field1173 = null;
                }
            }
        }
    }

    @ObfuscatedName("fi.ib(IIIII)V")
    public static final void method2972(int arg0, int arg1, int arg2, int arg3) {
        client.field756 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class107.field1332;
        int[] var8 = class107.field1335;
        for (int var9 = 0; var9 < client.field542 + var7; var9++) {
            class95 var10;
            if (var9 < var7) {
                var10 = client.field613[var8[var9]];
                if (client.field641 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (field971 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = client.field563[client.field540[var9 - var7]];
            }
            client.method5414(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (client.field752 && var6 != -1) {
            client.method5414(field971, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            client.method5414(client.field613[client.field641], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < client.field756; var11++) {
            int var12 = client.field609[var11];
            int var13 = client.field610[var11];
            int var14 = client.field612[var11];
            int var15 = client.field611[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > client.field610[var17] - client.field611[var17] && var13 - var15 < client.field610[var17] + 2 && var12 - var14 < client.field612[var17] + client.field609[var17] && var12 + var14 > client.field609[var17] - client.field612[var17] && client.field610[var17] - client.field611[var17] < var13) {
                        var13 = client.field610[var17] - client.field611[var17];
                        var16 = true;
                    }
                }
            }
            client.field620 = client.field609[var11];
            client.field674 = client.field610[var11] = var13;
            String var18 = client.field617[var11];
            if (client.field796 == 0) {
                int var19 = 16776960;
                if (client.field697[var11] < 6) {
                    var19 = client.field578[client.field697[var11]];
                }
                if (client.field697[var11] == 6) {
                    var19 = client.field619 % 20 < 10 ? 16711680 : 16776960;
                }
                if (client.field697[var11] == 7) {
                    var19 = client.field619 % 20 < 10 ? 255 : 65535;
                }
                if (client.field697[var11] == 8) {
                    var19 = client.field619 % 20 < 10 ? 45056 : 8454016;
                }
                if (client.field697[var11] == 9) {
                    int var20 = 150 - client.field529[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (client.field697[var11] == 10) {
                    int var21 = 150 - client.field529[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (client.field697[var11] == 11) {
                    int var22 = 150 - client.field529[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (client.field697[var11] == 12 && client.field615[var11] == null) {
                    int var23 = var18.length();
                    client.field615[var11] = new int[var23];
                    for (int var24 = 0; var24 < var23; var24++) {
                        int var25 = (int) ((float) var24 / (float) var23 * 64.0F);
                        client.field615[var11][var24] = class455.field4745[var25 << 10 | 0x380 | 0x40];
                    }
                }
                if (client.field544[var11] == 0) {
                    field1789.method6772(var18, client.field620 + arg0, client.field674 + arg1, var19, 0, client.field615[var11]);
                }
                if (client.field544[var11] == 1) {
                    field1789.method6788(var18, client.field620 + arg0, client.field674 + arg1, var19, 0, client.field619, client.field615[var11]);
                }
                if (client.field544[var11] == 2) {
                    field1789.method6789(var18, client.field620 + arg0, client.field674 + arg1, var19, 0, client.field619, client.field615[var11]);
                }
                if (client.field544[var11] == 3) {
                    field1789.method6834(var18, client.field620 + arg0, client.field674 + arg1, var19, 0, client.field619, 150 - client.field529[var11], client.field615[var11]);
                }
                if (client.field544[var11] == 4) {
                    int var26 = (150 - client.field529[var11]) * (field1789.method6775(var18) + 100) / 150;
                    class511.method8500(client.field620 + arg0 - 50, arg1, client.field620 + arg0 + 50, arg1 + arg3);
                    field1789.method6790(var18, client.field620 + arg0 + 50 - var26, client.field674 + arg1, var19, 0, client.field615[var11]);
                    class511.method8523(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (client.field544[var11] == 5) {
                    int var27 = 150 - client.field529[var11];
                    int var28 = 0;
                    if (var27 < 25) {
                        var28 = var27 - 25;
                    } else if (var27 > 125) {
                        var28 = var27 - 125;
                    }
                    class511.method8500(arg0, client.field674 + arg1 - field1789.field4447 - 1, arg0 + arg2, client.field674 + arg1 + 5);
                    field1789.method6772(var18, client.field620 + arg0, client.field674 + arg1 + var28, var19, 0, client.field615[var11]);
                    class511.method8523(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                field1789.method6784(var18, client.field620 + arg0, client.field674 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("dw.jz(II)V")
    public static final void method2142(int arg0) {
        int[] var1 = field171.field5123;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class82.field1018[arg0][var6][var4] & 0x18) == 0) {
                    field238.method4188(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class82.field1018[arg0 + 1][var6][var4] & 0x8) != 0) {
                    field238.method4188(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        field171.method8584();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class82.field1018[arg0][var10][var9] & 0x18) == 0) {
                    client.method2739(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class82.field1018[arg0 + 1][var10][var9] & 0x8) != 0) {
                    client.method2739(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        client.field749 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = field238.method4181(field1882, var11, var12);
                if (var13 != 0L) {
                    int var15 = class240.method3900(var13);
                    int var16 = class205.method3219(var15).field2171;
                    if (var16 >= 0 && class187.method2956(var16).field1909) {
                        client.field774[client.field749] = class187.method2956(var16).method3277(false);
                        client.field750[client.field749] = var11;
                        client.field758[client.field749] = var12;
                        client.field749++;
                    }
                }
            }
        }
        field2978.method8555();
    }

    @ObfuscatedName("mh.kf(I)Z")
    public static final boolean method5511() {
        return client.field650;
    }

    @ObfuscatedName("jn.lq(B)Z")
    public static boolean method4557() {
        return client.field661;
    }

    @ObfuscatedName("lw.mt(IIB)V")
    public static final void method5158(int arg0, int arg1) {
        class163 var2 = arg0 >= 0 ? client.field720[arg0] : field2051;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3075()) {
            return;
        }
        class145 var3 = (class145) var2.field1763.get(arg1);
        if (var3.field1635 != -1) {
            return;
        }
        String var4 = var3.field1632.method8756();
        class296 var5 = class296.method3619(class294.field3121, client.field568.field1380);
        var5.field3211.method8113(3 + class501.method5933(var4));
        var5.field3211.method8113(arg0);
        var5.field3211.method8114(arg1);
        var5.field3211.method8119(var4);
        client.field568.method2642(var5);
    }

    @ObfuscatedName("cu.ny(IB)Ltb;")
    public static class495 method984(int arg0) {
        class495 var1 = (class495) client.field786.method5121((long) arg0);
        if (var1 == null) {
            var1 = new class495(field1378, class497.method2971(arg0), class497.method7905(arg0));
            client.field786.method5123(var1, (long) arg0);
        }
        return var1;
    }
}
