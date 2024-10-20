package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class Statics {

    @ObfuscatedName("az.fg")
    public static class386 field101;

    @ObfuscatedName("de.an")
    public static short[][][] field1017;

    @ObfuscatedName("de.ad")
    public static int[] field1020;

    @ObfuscatedName("de.ac")
    public static int[] field1028;

    @ObfuscatedName("de.ay")
    public static short[][][] field1030;

    @ObfuscatedName("de.am")
    public static int[][] field1033;

    @ObfuscatedName("df.eu")
    public static long field1034;

    @ObfuscatedName("dn.vl")
    public static Iterator field1040;

    @ObfuscatedName("dx.aw")
    public static class529[] field1044;

    @ObfuscatedName("di.am")
    public static int field1056;

    @ObfuscatedName("di.au")
    public static int field1060;

    @ObfuscatedName("az.dx")
    public static boolean field108;

    @ObfuscatedName("ds.ae")
    public static int[] field1084;

    @ObfuscatedName("dh.ig")
    public static class480 field1092;

    @ObfuscatedName("dh.st")
    public static class563 field1097;

    @ObfuscatedName("do.vq")
    public static class484 field1101;

    @ObfuscatedName("do.ja")
    public static int[] field1109;

    @ObfuscatedName("dg.at")
    public static int[] field1165;

    @ObfuscatedName("bz.vz")
    public static List field118;

    @ObfuscatedName("am.fd")
    public static class386 field12;

    @ObfuscatedName("bz.aa")
    public static class100 field121;

    @ObfuscatedName("dt.fs")
    public static class386 field1225;

    @ObfuscatedName("dt.lv")
    public static int field1258;

    @ObfuscatedName("dk.ea")
    public static class386 field1282;

    @ObfuscatedName("dk.dm")
    public static class562 field1283;

    @ObfuscatedName("db.md")
    public static int field1286;

    @ObfuscatedName("db.fm")
    public static class386 field1298;

    @ObfuscatedName("am.af")
    public static int field13;

    @ObfuscatedName("db.dm")
    public static boolean field1300;

    @ObfuscatedName("dy.ef")
    public static class386 field1306;

    @ObfuscatedName("bj.mq")
    public static int field133;

    @ObfuscatedName("dd.ap")
    public static int field1345;

    @ObfuscatedName("et.dn")
    public static boolean field1356;

    @ObfuscatedName("bo.ij")
    public static int field137;

    @ObfuscatedName("en.ad")
    public static class563 field1373;

    @ObfuscatedName("ed.vo")
    public static class101 field1385;

    @ObfuscatedName("ed.kr")
    public static class563[] field1386;

    @ObfuscatedName("eb.as")
    public static short[][] field1391;

    @ObfuscatedName("bm.hh")
    public static String field142;

    @ObfuscatedName("em.bb")
    public static String field1420;

    @ObfuscatedName("ex.ox")
    public static int field1464;

    @ObfuscatedName("el.gl")
    public static String field1467;

    @ObfuscatedName("ey.oz")
    public static int field1488;

    @ObfuscatedName("eu.ah")
    public static int field1494;

    @ObfuscatedName("eu.ac")
    public static class562 field1495;

    @ObfuscatedName("ea.kn")
    public static int field1500;

    @ObfuscatedName("eg.kh")
    public static class562[] field1509;

    @ObfuscatedName("fn.ie")
    public static long field1521;

    @ObfuscatedName("fn.lr")
    public static int field1524;

    @ObfuscatedName("bh.fj")
    public static class386 field153;

    @ObfuscatedName("fk.th")
    public static class43 field1548;

    @ObfuscatedName("fg.ar")
    public static String field1556;

    @ObfuscatedName("bh.fk")
    public static class386 field156;

    @ObfuscatedName("bh.fy")
    public static class69 field157;

    @ObfuscatedName("ff.cd")
    public static String field1592;

    @ObfuscatedName("fi.ji")
    public static int[][] field1616;

    @ObfuscatedName("fi.ab")
    public static String field1617;

    @ObfuscatedName("fs.ww")
    public static class400 field1623;

    @ObfuscatedName("fs.ay")
    public static class389 field1625;

    @ObfuscatedName("fs.aa")
    public static String[] field1626;

    @ObfuscatedName("bx.ab")
    public static class213 field163;

    @ObfuscatedName("fq.am")
    public static int field1636;

    @ObfuscatedName("bx.am")
    public static int field164;

    @ObfuscatedName("fu.bl")
    public static class421 field1672;

    @ObfuscatedName("fa.au")
    public static int[] field1681;

    @ObfuscatedName("fl.pr")
    public static int field1686;

    @ObfuscatedName("fy.dn")
    public static class562[] field1696;

    @ObfuscatedName("fw.fl")
    public static boolean field1719;

    @ObfuscatedName("gb.ts")
    public static int field1722;

    @ObfuscatedName("gw.pu")
    public static int field1770;

    @ObfuscatedName("gz.wo")
    public static int field1775;

    @ObfuscatedName("gs.de")
    public static class563[] field1777;

    @ObfuscatedName("gn.am")
    public static class389 field1781;

    @ObfuscatedName("gn.ac")
    public static int field1783;

    @ObfuscatedName("gu.tt")
    public static int field1794;

    @ObfuscatedName("gh.as")
    public static int field1796;

    @ObfuscatedName("gh.fx")
    public static class386 field1797;

    @ObfuscatedName("gh.jv")
    public static int field1799;

    @ObfuscatedName("bx.br")
    public static String field187;

    @ObfuscatedName("ga.aw")
    public static int[] field1899;

    @ObfuscatedName("go.ff")
    public static class386 field1937;

    @ObfuscatedName("hq.jp")
    public static byte[][] field1982;

    @ObfuscatedName("ac.np")
    public static class76 field20;

    @ObfuscatedName("hs.tf")
    public static int field2087;

    @ObfuscatedName("ho.ii")
    public static class433 field2096;

    @ObfuscatedName("ho.fi")
    public static class386 field2112;

    @ObfuscatedName("hm.ux")
    public static int field2119;

    @ObfuscatedName("bv.cs")
    public static int field215;

    @ObfuscatedName("hr.cz")
    public static int field2164;

    @ObfuscatedName("hr.cg")
    public static int field2175;

    @ObfuscatedName("bu.al")
    public static int[] field219;

    @ObfuscatedName("bp.fe")
    public static class386 field221;

    @ObfuscatedName("hr.cp")
    public static int field2225;

    @ObfuscatedName("ht.ax")
    public static int field2234;

    @ObfuscatedName("ht.ao")
    public static int field2235;

    @ObfuscatedName("ht.ae")
    public static int field2238;

    @ObfuscatedName("ht.bc")
    public static FontMetrics field2244;

    @ObfuscatedName("ht.al")
    public static int field2245;

    @ObfuscatedName("hd.km")
    public static class563[] field2249;

    @ObfuscatedName("bp.ct")
    public static class376 field229;

    @ObfuscatedName("iq.an")
    public static int field2336;

    @ObfuscatedName("ig.ay")
    public static String field2345;

    @ObfuscatedName("iz.au")
    public static byte[][][] field2349;

    @ObfuscatedName("in.ao")
    public static int field2353;

    @ObfuscatedName("in.au")
    public static File field2358;

    @ObfuscatedName("in.ah")
    public static String[] field2360;

    @ObfuscatedName("in.cg")
    public static String field2361;

    @ObfuscatedName("il.jc")
    public static class563 field2362;

    @ObfuscatedName("ix.ki")
    public static class563[] field2373;

    @ObfuscatedName("it.ug")
    public static int field2388;

    @ObfuscatedName("it.wy")
    public static class516 field2389;

    @ObfuscatedName("is.ud")
    public static int field2418;

    @ObfuscatedName("iw.cw")
    public static int field2424;

    @ObfuscatedName("ir.ab")
    public static class389 field2439;

    @ObfuscatedName("ia.aq")
    public static int field2444;

    @ObfuscatedName("ih.ay")
    public static int field2454;

    @ObfuscatedName("ih.ab")
    public static class389 field2456;

    @ObfuscatedName("ih.gk")
    public static int field2457;

    @ObfuscatedName("ic.gn")
    public static int field2460;

    @ObfuscatedName("ic.ay")
    public static class389 field2461;

    @ObfuscatedName("ja.an")
    public static int field2466;

    @ObfuscatedName("ja.ab")
    public static class389 field2473;

    @ObfuscatedName("ja.vy")
    public static class508 field2489;

    @ObfuscatedName("js.ab")
    public static class389 field2494;

    @ObfuscatedName("jr.ay")
    public static class389 field2497;

    @ObfuscatedName("jr.ab")
    public static class389 field2503;

    @ObfuscatedName("jr.ah")
    public static int[] field2507;

    @ObfuscatedName("jd.ab")
    public static class389 field2511;

    @ObfuscatedName("jd.ay")
    public static class389 field2519;

    @ObfuscatedName("je.aw")
    public static class361 field2526;

    @ObfuscatedName("je.ab")
    public static Applet field2527;

    @ObfuscatedName("jb.ae")
    public static boolean field2543;

    @ObfuscatedName("ji.al")
    public static short[][] field2554;

    @ObfuscatedName("jl.di")
    public static class562 field2562;

    @ObfuscatedName("jm.ay")
    public static class389 field2565;

    @ObfuscatedName("bi.ae")
    public static int field257;

    @ObfuscatedName("jm.an")
    public static class389 field2576;

    @ObfuscatedName("ad.oc")
    public static class361 field26;

    @ObfuscatedName("jm.uw")
    public static int field2614;

    @ObfuscatedName("jx.gt")
    public static String field2618;

    @ObfuscatedName("jy.ak")
    public static int field2625;

    @ObfuscatedName("jh.fu")
    public static class386 field2638;

    @ObfuscatedName("jn.ab")
    public static class389 field2645;

    @ObfuscatedName("jn.ay")
    public static class389 field2659;

    @ObfuscatedName("bi.ad")
    public static class45 field266;

    @ObfuscatedName("jv.ab")
    public static class389 field2664;

    @ObfuscatedName("jv.eo")
    public static class352 field2667;

    @ObfuscatedName("jk.mk")
    public static class94 field2672;

    @ObfuscatedName("jk.gg")
    public static int field2679;

    @ObfuscatedName("jz.fq")
    public static class386 field2681;

    @ObfuscatedName("jz.ab")
    public static class389 field2682;

    @ObfuscatedName("jz.gw")
    public static int field2688;

    @ObfuscatedName("ju.ab")
    public static class389 field2692;

    @ObfuscatedName("ju.bw")
    public static GarbageCollectorMXBean field2694;

    @ObfuscatedName("ju.wu")
    public static int field2696;

    @ObfuscatedName("jc.an")
    public static class389 field2703;

    @ObfuscatedName("jc.ab")
    public static class389 field2708;

    @ObfuscatedName("kt.ay")
    public static class389 field2731;

    @ObfuscatedName("kt.qp")
    public static class113 field2734;

    @ObfuscatedName("kt.an")
    public static class389 field2738;

    @ObfuscatedName("km.am")
    public static class389 field2788;

    @ObfuscatedName("km.ac")
    public static class389 field2789;

    @ObfuscatedName("km.ad")
    public static int field2790;

    @ObfuscatedName("ki.ab")
    public static class389 field2849;

    @ObfuscatedName("kr.ao")
    public static class389 field2864;

    @ObfuscatedName("kx.kc")
    public static int field2888;

    @ObfuscatedName("ba.ec")
    public static class386 field290;

    @ObfuscatedName("kx.dc")
    public static class562 field2904;

    @ObfuscatedName("bn.ad")
    public static class119 field294;

    @ObfuscatedName("kd.hy")
    public static String field2949;

    @ObfuscatedName("ka.ar")
    public static class307 field2950;

    @ObfuscatedName("ka.kf")
    public static class563[] field2961;

    @ObfuscatedName("kl.ac")
    public static int[] field2966;

    @ObfuscatedName("kp.om")
    public static class361 field2979;

    @ObfuscatedName("ko.av")
    public static byte[][][] field2996;

    @ObfuscatedName("ay.ql")
    public static class531 field3;

    @ObfuscatedName("bn.ge")
    public static int field300;

    @ObfuscatedName("ke.fa")
    public static class486 field3004;

    @ObfuscatedName("ke.ut")
    public static int field3005;

    @ObfuscatedName("kq.vk")
    public static class71 field3011;

    @ObfuscatedName("ks.cz")
    public static class375 field3014;

    @ObfuscatedName("kc.jw")
    public static int[] field3033;

    @ObfuscatedName("kc.iw")
    public static class433 field3034;

    @ObfuscatedName("kc.ak")
    public static String field3035;

    @ObfuscatedName("kj.hr")
    public static SecureRandom field3045;

    @ObfuscatedName("lj.di")
    public static boolean field3119;

    @ObfuscatedName("bk.sf")
    public static class169 field312;

    @ObfuscatedName("lj.ab")
    public static class389 field3120;

    @ObfuscatedName("lr.sn")
    public static boolean field3125;

    @ObfuscatedName("lv.ks")
    public static int field3140;

    @ObfuscatedName("ld.js")
    public static int[] field3167;

    @ObfuscatedName("ld.ac")
    public static ScheduledExecutorService field3169;

    @ObfuscatedName("lw.aj")
    public static int[][][] field3178;

    @ObfuscatedName("lz.bf")
    public static class560 field3197;

    @ObfuscatedName("lg.wv")
    public static short[] field3220;

    @ObfuscatedName("lf.ao")
    public static class562 field3233;

    @ObfuscatedName("mg.cq")
    public static int field3254;

    @ObfuscatedName("mi.ax")
    public static class70[] field3255;

    @ObfuscatedName("mc.fr")
    public static class386 field3332;

    @ObfuscatedName("my.qe")
    public static class216 field3373;

    @ObfuscatedName("ad.ir")
    public static int field34;

    @ObfuscatedName("cz.at")
    public static float[] field347;

    @ObfuscatedName("cz.ap")
    public static float[] field352;

    @ObfuscatedName("cz.ac")
    public static int field354;

    @ObfuscatedName("mp.ba")
    public static boolean field3540;

    @ObfuscatedName("mw.ab")
    public static long field3542;

    @ObfuscatedName("mw.jk")
    public static class102 field3543;

    @ObfuscatedName("mw.au")
    public static class562[] field3545;

    @ObfuscatedName("mn.tn")
    public static int field3546;

    @ObfuscatedName("cz.ae")
    public static int field355;

    @ObfuscatedName("cz.ak")
    public static float[] field356;

    @ObfuscatedName("cz.aq")
    public static class42[] field357;

    @ObfuscatedName("mz.an")
    public static class389 field3573;

    @ObfuscatedName("cz.az")
    public static float[] field358;

    @ObfuscatedName("cz.aj")
    public static class51[] field359;

    @ObfuscatedName("cz.as")
    public static boolean[] field360;

    @ObfuscatedName("cz.aw")
    public static int[] field361;

    @ObfuscatedName("mq.pw")
    public static class361[] field3623;

    @ObfuscatedName("nk.tk")
    public static class58 field3668;

    @ObfuscatedName("nk.jf")
    public static class563 field3672;

    @ObfuscatedName("cz.bj")
    public static int[] field368;

    @ObfuscatedName("ng.kx")
    public static class563[] field3687;

    @ObfuscatedName("cz.al")
    public static class47[] field369;

    @ObfuscatedName("nm.vc")
    public static long field3698;

    @ObfuscatedName("ad.jz")
    public static class102 field37;

    @ObfuscatedName("cz.ai")
    public static float[] field370;

    @ObfuscatedName("nl.gz")
    public static int field3724;

    @ObfuscatedName("nz.mf")
    public static class193 field3727;

    @ObfuscatedName("nz.mz")
    public static class68 field3728;

    @ObfuscatedName("cz.bz")
    public static int[] field374;

    @ObfuscatedName("cz.bg")
    public static float[] field376;

    @ObfuscatedName("cz.ad")
    public static class53[] field378;

    @ObfuscatedName("na.aq")
    public static int[] field3957;

    @ObfuscatedName("cb.ae")
    public static int field396;

    @ObfuscatedName("nh.jb")
    public static int[] field3962;

    @ObfuscatedName("nh.ae")
    public static int[] field3963;

    @ObfuscatedName("np.ab")
    public static class363 field3966;

    @ObfuscatedName("np.sl")
    public static class160 field3968;

    @ObfuscatedName("oc.jq")
    public static int[] field3969;

    @ObfuscatedName("cb.ac")
    public static float field397;

    @ObfuscatedName("om.am")
    public static boolean[] field3973;

    @ObfuscatedName("og.ay")
    public static int field3978;

    @ObfuscatedName("og.rc")
    public static class569 field3980;

    @ObfuscatedName("ol.ae")
    public static class563 field3988;

    @ObfuscatedName("ou.am")
    public static int[] field4030;

    @ObfuscatedName("ou.ez")
    public static class221 field4033;

    @ObfuscatedName("ok.qq")
    public static class531 field4035;

    @ObfuscatedName("od.iz")
    public static int field4066;

    @ObfuscatedName("cr.fb")
    public static class386 field408;

    @ObfuscatedName("cj.aq")
    public static int field411;

    @ObfuscatedName("cj.es")
    public static class480 field412;

    @ObfuscatedName("cj.eg")
    public static class386 field413;

    @ObfuscatedName("cj.jd")
    public static int[][] field415;

    @ObfuscatedName("oy.df")
    public static boolean field4408;

    @ObfuscatedName("cq.tv")
    public static class39 field445;

    @ObfuscatedName("pq.ab")
    public static class389 field4544;

    @ObfuscatedName("pj.by")
    public static class421 field4549;

    @ObfuscatedName("pt.uv")
    public static int field4557;

    @ObfuscatedName("pp.is")
    public static class433 field4572;

    @ObfuscatedName("pp.ab")
    public static class389 field4573;

    @ObfuscatedName("pg.up")
    public static int field4603;

    @ObfuscatedName("ci.ui")
    public static int field462;

    @ObfuscatedName("pa.dx")
    public static class562[] field4640;

    @ObfuscatedName("co.gu")
    public static String field465;

    @ObfuscatedName("qz.aw")
    public static class562 field4667;

    @ObfuscatedName("co.ak")
    public static int field467;

    @ObfuscatedName("qh.aj")
    public static class562 field4671;

    @ObfuscatedName("qh.ax")
    public static File field4675;

    @ObfuscatedName("qf.ay")
    public static int field4676;

    @ObfuscatedName("qf.fz")
    public static class386 field4679;

    @ObfuscatedName("qi.uf")
    public static int field4704;

    @ObfuscatedName("qp.as")
    public static class361 field4708;

    @ObfuscatedName("ql.ed")
    public static boolean field4709;

    @ObfuscatedName("cn.bj")
    public static Font field472;

    @ObfuscatedName("qc.ao")
    public static byte[][][] field4723;

    @ObfuscatedName("qd.ke")
    public static int field4736;

    @ObfuscatedName("qd.cp")
    public static String field4741;

    @ObfuscatedName("qu.ac")
    public static ThreadPoolExecutor field4746;

    @ObfuscatedName("qv.aq")
    public static class562[] field4753;

    @ObfuscatedName("qb.vb")
    public static class391 field4777;

    @ObfuscatedName("ro.ay")
    public static class235[] field4782;

    @ObfuscatedName("rg.cv")
    public static int field4783;

    @ObfuscatedName("rg.ap")
    public static String field4787;

    @ObfuscatedName("rk.jg")
    public static class102 field4799;

    @ObfuscatedName("rk.ix")
    public static int field4800;

    @ObfuscatedName("rs.aq")
    public static class226 field4803;

    @ObfuscatedName("rx.iy")
    public static class221 field4814;

    @ObfuscatedName("ru.ag")
    public static int[] field4832;

    @ObfuscatedName("rt.ik")
    public static class517 field4874;

    @ObfuscatedName("rr.fc")
    public static class386 field4910;

    @ObfuscatedName("sp.dw")
    public static class91 field4911;

    @ObfuscatedName("sz.aa")
    public static class169 field4921;

    @ObfuscatedName("sh.an")
    public static int field4922;

    @ObfuscatedName("sc.qc")
    public static class488 field4935;

    @ObfuscatedName("su.jt")
    public static class562[] field4977;

    @ObfuscatedName("ce.gh")
    public static String field499;

    @ObfuscatedName("ce.tc")
    public static int field501;

    @ObfuscatedName("sj.ay")
    public static long field5015;

    @ObfuscatedName("st.cr")
    public static int field5019;

    @ObfuscatedName("st.ay")
    public static String field5022;

    @ObfuscatedName("sw.ao")
    public static boolean field5023;

    @ObfuscatedName("tm.gp")
    public static String field5054;

    @ObfuscatedName("tv.am")
    public static int[] field5056;

    @ObfuscatedName("tv.jj")
    public static int field5059;

    @ObfuscatedName("tv.lb")
    public static int field5062;

    @ObfuscatedName("tv.aj")
    public static short[] field5064;

    @ObfuscatedName("tx.as")
    public static class433 field5134;

    @ObfuscatedName("tt.ax")
    public static int field5137;

    @ObfuscatedName("to.af")
    public static class160 field5227;

    @ObfuscatedName("uv.bh")
    public static Image field5281;

    @ObfuscatedName("uv.kk")
    public static class562[] field5282;

    @ObfuscatedName("ut.af")
    public static int field5287;

    @ObfuscatedName("us.ax")
    public static String[] field5291;

    @ObfuscatedName("uy.pv")
    public static int field5304;

    @ObfuscatedName("uz.ax")
    public static class389 field5305;

    @ObfuscatedName("uj.ab")
    public static class389 field5308;

    @ObfuscatedName("uc.ab")
    public static class389 field5322;

    @ObfuscatedName("aw.jl")
    public static byte[][] field54;

    @ObfuscatedName("vx.at")
    public static int field5448;

    @ObfuscatedName("vx.bg")
    public static float[] field5450;

    @ObfuscatedName("vx.az")
    public static int field5452;

    @ObfuscatedName("vx.ai")
    public static int[] field5453;

    @ObfuscatedName("vo.aq")
    public static short[] field5461;

    @ObfuscatedName("vr.aq")
    public static class562 field5467;

    @ObfuscatedName("vv.ab")
    public static int field5489;

    @ObfuscatedName("vv.an")
    public static int field5490;

    @ObfuscatedName("vv.ax")
    public static int[] field5491;

    @ObfuscatedName("vv.ao")
    public static int[] field5492;

    @ObfuscatedName("vv.ae")
    public static byte[][] field5493;

    @ObfuscatedName("wo.ax")
    public static int field5552;

    @ObfuscatedName("wo.an")
    public static int field5554;

    @ObfuscatedName("aw.ao")
    public static Thread field58;

    @ObfuscatedName("af.ay")
    public static class16 field60;

    @ObfuscatedName("aa.cj")
    public static class404 field62;

    @ObfuscatedName("aa.fo")
    public static class386 field63;

    @ObfuscatedName("aa.kq")
    public static int field65;

    @ObfuscatedName("ax.ax")
    public static byte[][][] field7;

    @ObfuscatedName("av.sm")
    public static class468 field70;

    @ObfuscatedName("av.sv")
    public static boolean field72;

    @ObfuscatedName("av.ay")
    public static File field75;

    @ObfuscatedName("ar.ad")
    public static int field79;

    @ObfuscatedName("ar.gx")
    public static String field81;

    @ObfuscatedName("cc.tb")
    public static int field828;

    @ObfuscatedName("cc.gs")
    public static int field830;

    @ObfuscatedName("cs.cl")
    public static class526 field848;

    @ObfuscatedName("cw.au")
    public static int[] field851;

    @ObfuscatedName("cw.jr")
    public static int[] field854;

    @ObfuscatedName("cw.ae")
    public static int field855;

    @ObfuscatedName("cw.df")
    public static class562[] field867;

    @ObfuscatedName("cv.os")
    public static int field897;

    @ObfuscatedName("ai.je")
    public static byte[][] field90;

    @ObfuscatedName("ca.af")
    public static class562 field903;

    @ObfuscatedName("ca.al")
    public static class562[] field907;

    @ObfuscatedName("ca.as")
    public static class562 field908;

    @ObfuscatedName("ca.ax")
    public static class562 field910;

    @ObfuscatedName("ca.am")
    public static class562 field931;

    @ObfuscatedName("ca.ay")
    public static boolean field933;

    @ObfuscatedName("ca.aj")
    public static class52 field944;

    @ObfuscatedName("ai.io")
    public static class117 field96;

    @ObfuscatedName("dv.fn")
    public static class386 field975;

    @ObfuscatedName("da.kt")
    public static class563[] field980;

    @ObfuscatedName("da.ve")
    public static class390 field981;

    @ObfuscatedName("dp.aj")
    public static int field993;

    @ObfuscatedName("dp.jm")
    public static byte[][] field996;

    @ObfuscatedName("dj.by")
    public static client field997;

    @ObfuscatedName("fr.ab(B)[Loz;")
    public static class375[] method3173() {
        return new class375[] { class375.field4041, class375.field4038, class375.field4040, class375.field4039 };
    }

    @ObfuscatedName("ir.ay(II)I")
    public static int method4373(int arg0) {
        return arg0 >> 11 & 0x3F;
    }

    @ObfuscatedName("gt.ab(DDD)I")
    public static final int method3533(double arg0, double arg1, double arg2) {
        double var6 = arg2;
        double var8 = arg2;
        double var10 = arg2;
        if (arg1 != 0.0D) {
            double var12;
            if (arg2 < 0.5D) {
                var12 = (arg1 + 1.0D) * arg2;
            } else {
                var12 = arg1 + arg2 - arg1 * arg2;
            }
            double var14 = arg2 * 2.0D - var12;
            double var16 = arg0 + 0.3333333333333333D;
            if (var16 > 1.0D) {
                var16--;
            }
            double var20 = arg0 - 0.3333333333333333D;
            if (var20 < 0.0D) {
                var20++;
            }
            if (var16 * 6.0D < 1.0D) {
                var6 = (var12 - var14) * 6.0D * var16 + var14;
            } else if (var16 * 2.0D < 1.0D) {
                var6 = var12;
            } else if (var16 * 3.0D < 2.0D) {
                var6 = (var12 - var14) * (0.6666666666666666D - var16) * 6.0D + var14;
            } else {
                var6 = var14;
            }
            if (arg0 * 6.0D < 1.0D) {
                var8 = (var12 - var14) * 6.0D * arg0 + var14;
            } else if (arg0 * 2.0D < 1.0D) {
                var8 = var12;
            } else if (arg0 * 3.0D < 2.0D) {
                var8 = (var12 - var14) * (0.6666666666666666D - arg0) * 6.0D + var14;
            } else {
                var8 = var14;
            }
            if (var20 * 6.0D < 1.0D) {
                var10 = (var12 - var14) * 6.0D * var20 + var14;
            } else if (var20 * 2.0D < 1.0D) {
                var10 = var12;
            } else if (var20 * 3.0D < 2.0D) {
                var10 = (var12 - var14) * (0.6666666666666666D - var20) * 6.0D + var14;
            } else {
                var10 = var14;
            }
        }
        int var22 = (int) (var6 * 256.0D);
        int var23 = (int) (var8 * 256.0D);
        int var24 = (int) (var10 * 256.0D);
        return (var22 << 16) + (var23 << 8) + var24;
    }

    @ObfuscatedName("mq.ab(I)V")
    public static void method5868() {
        class229.field2441.method5588();
    }

    @ObfuscatedName("kw.au(I)[Ldh;")
    public static class92[] method5125() {
        return new class92[] { class92.field1088, class92.field1087, class92.field1089, class92.field1085, class92.field1098 };
    }

    @ObfuscatedName("fc.an(II)I")
    public static int method3163(int arg0) {
        return arg0 >> 17 & 0x7;
    }

    @ObfuscatedName("cs.ay(II)Lju;")
    public static class257 method1930(int arg0) {
        class257 var1 = (class257) class257.field2691.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2692.method6670(11, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4636(new class549(var2));
        }
        var3.method4641();
        class257.field2691.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.ab(II)Ljz;")
    public static class255 method4245(int arg0) {
        class255 var1 = (class255) class255.field2684.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2682.method6670(14, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4619(new class549(var2));
        }
        class255.field2684.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gi.an(IIB)I")
    public static int method3335(int arg0, int arg1) {
        class87 var2 = (class87) class87.field1046.method8544((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1049.length; var4++) {
                if (var2.field1042[var4] == arg1) {
                    var3 += var2.field1049[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("ag.ab(I)Lit;")
    public static class220 method260() {
        return class220.field2376;
    }

    @ObfuscatedName("nv.au(IB)I")
    public static int method5928(int arg0) {
        return arg0 >> 14 & 0x3FFF;
    }

    @ObfuscatedName("pb.ay(CI)Z")
    public static boolean method6769(char arg0) {
        if (!(arg0 < ' ' || arg0 >= 127) || !(arg0 <= 127 || arg0 >= 160) || !(arg0 <= 160 || arg0 > 255)) {
            return true;
        }
        if (arg0 != 0) {
            char[] var1 = class415.field4643;
            for (int var2 = 0; var2 < var1.length; var2++) {
                char var3 = var1[var2];
                if (arg0 == var3) {
                    return true;
                }
            }
        }
        return false;
    }

    @ObfuscatedName("ns.an(IIII)I")
    public static int method6351(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @ObfuscatedName("en.an(J)I")
    public static int method2717(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("kn.ax(Ljava/lang/CharSequence;IZI)I")
    public static int method5090(CharSequence arg0, int arg1, boolean arg2) {
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

    @ObfuscatedName("og.ac(IB)I")
    public static int method6553(int arg0) {
        return class198.method8667(class198.field2239[arg0]);
    }

    @ObfuscatedName("oi.ao(B)V")
    public static void method6564() {
        class263.field2850.method5588();
    }

    @ObfuscatedName("do.au(IIB)V")
    public static void method2347(int arg0, int arg1) {
        class333.method2965(arg0, arg1, 0, 0);
        class333.field3566.clear();
        class333.field3567.clear();
        if (class333.field3565.isEmpty() || arg0 == 0 && arg1 == 0) {
            class333.method5097();
        } else {
            class333.field3567.add(new class442((class446) null, class333.field3572));
            class333.field3567.add(new class444((class446) null, 0, false, class333.field3569));
            ArrayList var2 = class333.method8563();
            class333.field3567.add(new class441((class446) null, var2));
        }
    }

    @ObfuscatedName("fu.al(I)V")
    public static final void method3174() {
        class198.field2232 = false;
        class198.field2241 = 0;
    }

    @ObfuscatedName("dx.as(I)I")
    public static final int method2309() {
        return class198.field2231;
    }

    @ObfuscatedName("ol.ax(IIILkt;II)V")
    public static void method6554(int arg0, int arg1, int arg2, class261 arg3, int arg4) {
        if (arg3 == null || !arg3.method4734()) {
            return;
        }
        int var5 = arg3.field2746;
        int var6 = arg3.field2759;
        if (arg4 == 1 || arg4 == 3) {
            var5 = arg3.field2759;
            var6 = arg3.field2746;
        }
        int var7 = (arg1 + var5) * 128;
        int var8 = (arg2 + var6) * 128;
        int var9 = arg1 * 128;
        int var10 = arg2 * 128;
        int var11 = arg3.field2775;
        int var12 = arg3.field2776 * 128;
        int var13 = arg3.field2777 * 128;
        if (arg3.field2783 != null) {
            class261 var14 = arg3.method4719();
            if (var14 != null) {
                var11 = var14.field2775;
                var12 = var14.field2776 * 128;
                var13 = var14.field2777 * 128;
            }
        }
        for (class72 var15 = (class72) class72.field844.method6907(); var15 != null; var15 = (class72) class72.field844.method6896()) {
            if (var15.field832 == arg0 && var15.field833 == var9 && var15.field834 == var10 && var15.field846 == var7 && var15.field836 == var8 && var15.field839 == var11 && var15.field837 == var12 && var15.field835 == var13) {
                if (var15.field841 != null) {
                    field445.method676(var15.field841);
                    var15.field841 = null;
                }
                if (var15.field845 != null) {
                    field445.method676(var15.field845);
                    var15.field845 = null;
                }
                var15.method8218();
                break;
            }
        }
    }

    @ObfuscatedName("ku.au(ILdp;ZB)I")
    public static int method5206(int arg0, class81 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return class73.method2732(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return class73.method1131(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return class73.method7737(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return class73.method4573(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return class73.method1157(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method6691(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return class73.method1139(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return class73.method7903(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return class73.method416(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return class73.method1108(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return class73.method6048(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return class73.method1131(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return class73.method7737(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return class73.method4573(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return class73.method1157(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method6691(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return class73.method8564(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return class73.method4127(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return class73.method794(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return class73.method5496(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return class73.method6048(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return class73.method2943(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return class73.method5004(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return class73.method2729(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return class73.method3303(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return class73.method4708(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return class73.method990(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return class73.method3154(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return class73.method4364(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return class73.method183(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return class73.method64(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return class73.method2726(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return class73.method5423(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return class73.method5495(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return class73.method3428(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return class73.method4995(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return class73.method7133(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return class73.method633(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return class73.method4583(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return class73.method5555(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return class73.method4056(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return class73.method2722(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return class73.method5363(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return class73.method4501(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return class73.method8211(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return class73.method3328(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return class73.method2294(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return class73.method3868(arg0, arg1, arg2);
        } else if (arg0 < 8100) {
            return class73.method5467(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cl.av(IIII)I")
    public static final int method1029(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @ObfuscatedName("ob.aj(ILdp;ZI)I")
    public static int method6691(int arg0, class81 arg1, boolean arg2) {
        class361 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field2667.method5964(class73.field861[--field855]);
        } else {
            var3 = arg2 ? field2526 : field4708;
        }
        String var4 = class73.field856[--field2444];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = class73.field861[--field855];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = class73.field861[--field855];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = class73.field856[--field2444];
            } else {
                var7[var8] = Integer.valueOf(class73.field861[--field855]);
            }
        }
        int var9 = class73.field861[--field855];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3816 = var7;
        } else if (arg0 == 1401) {
            var3.field3898 = var7;
        } else if (arg0 == 1402) {
            var3.field3878 = var7;
        } else if (arg0 == 1403) {
            var3.field3827 = var7;
        } else if (arg0 == 1404) {
            var3.field3901 = var7;
        } else if (arg0 == 1405) {
            var3.field3902 = var7;
        } else if (arg0 == 1406) {
            var3.field3905 = var7;
        } else if (arg0 == 1407) {
            var3.field3906 = var7;
            var3.field3907 = var5;
        } else if (arg0 == 1408) {
            var3.field3812 = var7;
        } else if (arg0 == 1409) {
            var3.field3913 = var7;
        } else if (arg0 == 1410) {
            var3.field3858 = var7;
        } else if (arg0 == 1411) {
            var3.field3799 = var7;
        } else if (arg0 == 1412) {
            var3.field3900 = var7;
        } else if (arg0 == 1414) {
            var3.field3908 = var7;
            var3.field3909 = var5;
        } else if (arg0 == 1415) {
            var3.field3942 = var7;
            var3.field3895 = var5;
        } else if (arg0 == 1416) {
            var3.field3911 = var7;
        } else if (arg0 == 1417) {
            var3.field3915 = var7;
        } else if (arg0 == 1418) {
            var3.field3904 = var7;
        } else if (arg0 == 1419) {
            var3.field3917 = var7;
        } else if (arg0 == 1420) {
            var3.field3912 = var7;
        } else if (arg0 == 1421) {
            var3.field3921 = var7;
        } else if (arg0 == 1422) {
            var3.field3924 = var7;
        } else if (arg0 == 1423) {
            var3.field3925 = var7;
        } else if (arg0 == 1424) {
            var3.field3846 = var7;
        } else if (arg0 == 1425) {
            var3.field3928 = var7;
        } else if (arg0 == 1426) {
            var3.field3929 = var7;
        } else if (arg0 == 1427) {
            var3.field3927 = var7;
        } else if (arg0 == 1428) {
            var3.field3922 = var7;
        } else if (arg0 == 1429) {
            var3.field3923 = var7;
        } else if (arg0 == 1430) {
            var3.field3918 = var7;
        } else if (arg0 == 1431) {
            var3.field3839 = var7;
        } else if (arg0 == 1434) {
            var3.field3930 = var7;
        } else if (arg0 == 1435) {
            var3.field3914 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class357 var10 = var3.method6394();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3735 = var7;
                } else if (arg0 == 1437) {
                    var10.field3736 = var7;
                } else if (arg0 == 1438) {
                    var10.field3737 = var7;
                } else if (arg0 == 1439) {
                    var10.field3733 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3893 = true;
        return 1;
    }

    @ObfuscatedName("dh.hr(Lmf;I)V")
    public static void method2342(class324 arg0) {
        arg0.field3379.method8911(field221.field4507);
        arg0.field3379.method8911(field408.field4507);
        arg0.field3379.method8851(field4679.field4507);
        arg0.field3379.method9045(field156.field4507);
        arg0.field3379.method8911(field1797.field4507);
        arg0.field3379.method8852(field975.field4507);
        arg0.field3379.method8851(field1225.field4507);
    }

    @ObfuscatedName("fz.ix(Lnq;III)V")
    public static final void method3112(class361 arg0, int arg1, int arg2) {
        if (client.field750 != 0 && client.field750 != 3 || client.field694 || !(class36.field211 == 1 || !field4709 && class36.field211 == 4)) {
            return;
        }
        class348 var3 = arg0.method6368(field2667, true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field216 - arg1;
        int var5 = class36.field213 - arg2;
        if (!var3.method5912(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3697 / 2;
        int var7 = var5 - var3.field3695 / 2;
        int var8 = client.field592 & 0x7FF;
        int var9 = class181.field1941[var8];
        int var10 = class181.field1942[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = field3728.method1152() + var11 >> 7;
        int var14 = field3728.method1156() - var12 >> 7;
        class324 var15 = class324.method4244(class322.field3327, client.field569.field1458);
        var15.field3379.method8781(18);
        var15.field3379.method8781(client.field748.method4940(82) ? (client.field748.method4940(81) ? 2 : 1) : 0);
        var15.field3379.method8836(field4799.field1319 + var14);
        var15.field3379.method8782(field4799.field1311 + var13);
        var15.field3379.method8781(var6);
        var15.field3379.method8781(var7);
        var15.field3379.method8782(client.field592);
        var15.field3379.method8781(57);
        var15.field3379.method8781(0);
        var15.field3379.method8781(0);
        var15.field3379.method8781(89);
        var15.field3379.method8782(field2672.field1249);
        var15.field3379.method8782(field2672.field1180);
        var15.field3379.method8781(63);
        client.field569.method2829(var15);
        client.field542 = var13;
        client.field739 = var14;
    }

    @ObfuscatedName("dm.jb(Ldy;I)V")
    public static void method2313(class102 arg0) {
        if (client.field644 >= 0 && arg0.field1317[client.field644] != null) {
            client.method4436(arg0, client.field644, false);
        }
    }

    @ObfuscatedName("ic.ku(Ldy;Ldg;B)V")
    public static final void method4392(class102 arg0, class97 arg1) {
        class186 var2 = arg0.field1328;
        long var3 = 0L;
        int var5 = -1;
        int var6 = 0;
        int var7 = 0;
        if (arg1.field1166 == 0) {
            var3 = var2.method3819(arg1.field1174, arg1.field1179, arg1.field1168);
        }
        if (arg1.field1166 == 1) {
            var3 = var2.method3625(arg1.field1174, arg1.field1179, arg1.field1168);
        }
        if (arg1.field1166 == 2) {
            var3 = var2.method3626(arg1.field1174, arg1.field1179, arg1.field1168);
        }
        if (arg1.field1166 == 3) {
            var3 = var2.method3744(arg1.field1174, arg1.field1179, arg1.field1168);
        }
        if (var3 != 0L) {
            int var8 = var2.method3628(arg1.field1174, arg1.field1179, arg1.field1168, var3);
            var5 = class198.method8270(var3);
            var6 = var8 & 0x1F;
            var7 = var8 >> 6 & 0x3;
        }
        arg1.field1169 = var5;
        arg1.field1171 = var6;
        arg1.field1170 = var7;
    }

    @ObfuscatedName("kh.le(Lvw;B)V")
    public static final void method4934(class568 arg0) {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < arg0.field5519 - 1; var2++) {
                if (arg0.field5522[var2] < 1000 && arg0.field5522[var2 + 1] > 1000) {
                    String var3 = arg0.field5523[var2];
                    arg0.field5523[var2] = arg0.field5523[var2 + 1];
                    arg0.field5523[var2 + 1] = var3;
                    String var4 = arg0.field5526[var2];
                    arg0.field5526[var2] = arg0.field5526[var2 + 1];
                    arg0.field5526[var2 + 1] = var4;
                    class568 var5 = arg0.field5527[var2];
                    arg0.field5527[var2] = arg0.field5527[var2 + 1];
                    arg0.field5527[var2 + 1] = var5;
                    int var6 = arg0.field5522[var2];
                    arg0.field5522[var2] = arg0.field5522[var2 + 1];
                    arg0.field5522[var2 + 1] = var6;
                    int var7 = arg0.field5518[var2];
                    arg0.field5518[var2] = arg0.field5518[var2 + 1];
                    arg0.field5518[var2 + 1] = var7;
                    int var8 = arg0.field5521[var2];
                    arg0.field5521[var2] = arg0.field5521[var2 + 1];
                    arg0.field5521[var2 + 1] = var8;
                    int var9 = arg0.field5520[var2];
                    arg0.field5520[var2] = arg0.field5520[var2 + 1];
                    arg0.field5520[var2 + 1] = var9;
                    int var10 = arg0.field5524[var2];
                    arg0.field5524[var2] = arg0.field5524[var2 + 1];
                    arg0.field5524[var2 + 1] = var10;
                    int var11 = arg0.field5528[var2];
                    arg0.field5528[var2] = arg0.field5528[var2 + 1];
                    arg0.field5528[var2 + 1] = var11;
                    boolean var12 = arg0.field5529[var2];
                    arg0.field5529[var2] = arg0.field5529[var2 + 1];
                    arg0.field5529[var2 + 1] = var12;
                    var1 = false;
                }
            }
        }
    }

    @ObfuscatedName("qa.na(IIII)Ldi;")
    public static final class89 method7130(int arg0, int arg1, int arg2) {
        class89 var3 = new class89();
        var3.field1062 = arg1;
        var3.field1057 = arg2;
        client.field762.method8551(var3, (long) arg0);
        client.method8210(arg1);
        class361 var4 = field2667.method5964(arg0);
        client.method7116(var4);
        if (client.field672 != null) {
            client.method7116(client.field672);
            client.field672 = null;
        }
        client.method3298(field2667.field3709[arg0 >> 16], var4, false);
        class73.method5469(arg1);
        if (client.field667 != -1) {
            client.method2468(client.field667, 1);
        }
        return var3;
    }

    @ObfuscatedName("bo.ow(B)V")
    public static final void method413() {
        client.field504 = client.field691;
    }

    @ObfuscatedName("je.of(Lnq;I)Z")
    public static boolean method4484(class361 arg0) {
        return arg0.field3824;
    }

    @ObfuscatedName("nh.pg(II)Lub;")
    public static class540 method6526(int arg0) {
        class540 var1 = (class540) client.field793.method5586((long) arg0);
        if (var1 == null) {
            var1 = new class540(field2638, arg0);
        }
        return var1;
    }
}
