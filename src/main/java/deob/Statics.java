package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.management.GarbageCollectorMXBean;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("aw.hk")
    public static int[] field1;

    @ObfuscatedName("cr.so")
    public static class448 field1010;

    @ObfuscatedName("cr.ii")
    public static int field1011;

    @ObfuscatedName("dc.kb")
    public static int field1025;

    @ObfuscatedName("ac.sp")
    public static boolean field104;

    @ObfuscatedName("dv.jb")
    public static class548[] field1042;

    @ObfuscatedName("dv.ui")
    public static int field1046;

    @ObfuscatedName("dl.ao")
    public static int[][] field1050;

    @ObfuscatedName("dl.ax")
    public static int[][][] field1051;

    @ObfuscatedName("dl.wj")
    public static class502 field1053;

    @ObfuscatedName("dw.ea")
    public static class341 field1071;

    @ObfuscatedName("dt.fa")
    public static class376 field1085;

    @ObfuscatedName("dm.vh")
    public static class70 field1091;

    @ObfuscatedName("dd.az")
    public static class547 field1122;

    @ObfuscatedName("dj.jz")
    public static byte[][] field1164;

    @ObfuscatedName("ap.sd")
    public static class548 field119;

    @ObfuscatedName("ap.gw")
    public static String field120;

    @ObfuscatedName("ap.fv")
    public static class376 field122;

    @ObfuscatedName("dz.jy")
    public static class276 field1283;

    @ObfuscatedName("dp.az")
    public static boolean field1288;

    @ObfuscatedName("bo.au")
    public static class45 field130;

    @ObfuscatedName("df.hf")
    public static class221 field1325;

    @ObfuscatedName("dr.pj")
    public static int field1355;

    @ObfuscatedName("ee.cm")
    public static String field1373;

    @ObfuscatedName("ey.jk")
    public static class548[] field1391;

    @ObfuscatedName("eu.at")
    public static byte[][][] field1416;

    @ObfuscatedName("eu.ez")
    public static class376 field1418;

    @ObfuscatedName("ec.ak")
    public static short[] field1423;

    @ObfuscatedName("el.fl")
    public static int field1443;

    @ObfuscatedName("ef.bb")
    public static class545 field1455;

    @ObfuscatedName("ef.ao")
    public static int[] field1458;

    @ObfuscatedName("er.tm")
    public static int field1463;

    @ObfuscatedName("en.ao")
    public static int field1481;

    @ObfuscatedName("en.aa")
    public static boolean[] field1482;

    @ObfuscatedName("em.tv")
    public static class43 field1497;

    @ObfuscatedName("eq.aj")
    public static class547 field1509;

    @ObfuscatedName("eq.oh")
    public static int field1514;

    @ObfuscatedName("eq.fx")
    public static class464 field1515;

    @ObfuscatedName("bd.cd")
    public static class366 field152;

    @ObfuscatedName("eq.ot")
    public static int field1521;

    @ObfuscatedName("bd.gi")
    public static String field153;

    @ObfuscatedName("ez.ch")
    public static class365 field1537;

    @ObfuscatedName("fh.ad")
    public static int[] field1539;

    @ObfuscatedName("fi.gd")
    public static int field1551;

    @ObfuscatedName("bq.vx")
    public static class100 field156;

    @ObfuscatedName("fv.rv")
    public static class553 field1583;

    @ObfuscatedName("fv.gt")
    public static int field1590;

    @ObfuscatedName("fj.gf")
    public static String field1598;

    @ObfuscatedName("fj.on")
    public static class350 field1615;

    @ObfuscatedName("fa.as")
    public static class378 field1618;

    @ObfuscatedName("fa.uc")
    public static int field1619;

    @ObfuscatedName("fq.am")
    public static String[] field1622;

    @ObfuscatedName("fn.aa")
    public static class378 field1627;

    @ObfuscatedName("fm.af")
    public static class350 field1645;

    @ObfuscatedName("fm.ik")
    public static class413 field1655;

    @ObfuscatedName("ba.vt")
    public static class494 field166;

    @ObfuscatedName("fx.af")
    public static short[][] field1666;

    @ObfuscatedName("ff.ip")
    public static int[] field1676;

    @ObfuscatedName("fe.jm")
    public static class547[] field1682;

    @ObfuscatedName("fs.ar")
    public static class378 field1697;

    @ObfuscatedName("bk.as")
    public static int field170;

    @ObfuscatedName("fw.fc")
    public static class376 field1704;

    @ObfuscatedName("fw.fz")
    public static int field1706;

    @ObfuscatedName("fb.az")
    public static byte[][][] field1709;

    @ObfuscatedName("bk.aj")
    public static class52 field172;

    @ObfuscatedName("fp.ep")
    public static class376 field1725;

    @ObfuscatedName("fp.aw")
    public static File field1726;

    @ObfuscatedName("fl.ar")
    public static class547 field1730;

    @ObfuscatedName("fl.vz")
    public static class462 field1731;

    @ObfuscatedName("gw.mj")
    public static class282 field1774;

    @ObfuscatedName("gh.om")
    public static int field1779;

    @ObfuscatedName("gn.by")
    public static String field1782;

    @ObfuscatedName("ga.dw")
    public static class547[] field1791;

    @ObfuscatedName("gm.af")
    public static int field1797;

    @ObfuscatedName("gl.ij")
    public static class413 field1813;

    @ObfuscatedName("go.nc")
    public static int field1819;

    @ObfuscatedName("gy.jo")
    public static class548[] field1827;

    @ObfuscatedName("gr.ah")
    public static class547[] field1829;

    @ObfuscatedName("gj.fq")
    public static class376 field1833;

    @ObfuscatedName("gk.iy")
    public static class114 field1838;

    @ObfuscatedName("gk.aq")
    public static class378 field1841;

    @ObfuscatedName("gq.as")
    public static byte[][][] field1846;

    @ObfuscatedName("gq.ax")
    public static class515[] field1847;

    @ObfuscatedName("gq.vw")
    public static List field1848;

    @ObfuscatedName("gf.aw")
    public static int field1856;

    @ObfuscatedName("gf.mo")
    public static class93 field1858;

    @ObfuscatedName("gf.aq")
    public static class378 field1861;

    @ObfuscatedName("gf.hb")
    public static long field1863;

    @ObfuscatedName("gv.aw")
    public static class179[] field1876;

    @ObfuscatedName("gv.al")
    public static int field1880;

    @ObfuscatedName("gv.aq")
    public static class378 field1888;

    @ObfuscatedName("gc.al")
    public static int field1895;

    @ObfuscatedName("gc.aq")
    public static class378 field1906;

    @ObfuscatedName("gx.aw")
    public static class378 field1908;

    @ObfuscatedName("gx.aq")
    public static class378 field1911;

    @ObfuscatedName("gx.cl")
    public static String field1923;

    @ObfuscatedName("hg.aj")
    public static int[] field1924;

    @ObfuscatedName("hd.ig")
    public static class503 field1926;

    @ObfuscatedName("hd.fb")
    public static String field1931;

    @ObfuscatedName("hw.qp")
    public static class517 field1932;

    @ObfuscatedName("hj.ji")
    public static byte[][] field1953;

    @ObfuscatedName("ho.aw")
    public static class378 field1964;

    @ObfuscatedName("ho.al")
    public static class378 field1965;

    @ObfuscatedName("bm.ay")
    public static int field199;

    @ObfuscatedName("hx.bj")
    public static client field2033;

    @ObfuscatedName("hn.aw")
    public static class378 field2035;

    @ObfuscatedName("hn.aq")
    public static class378 field2043;

    @ObfuscatedName("hn.fk")
    public static class376 field2046;

    @ObfuscatedName("hr.aq")
    public static class378 field2052;

    @ObfuscatedName("hc.ft")
    public static boolean field2062;

    @ObfuscatedName("hc.aq")
    public static class378 field2063;

    @ObfuscatedName("hc.uh")
    public static int field2066;

    @ObfuscatedName("hv.eo")
    public static class376 field2071;

    @ObfuscatedName("hp.aq")
    public static class378 field2079;

    @ObfuscatedName("hh.aq")
    public static class378 field2081;

    @ObfuscatedName("hi.al")
    public static class378 field2086;

    @ObfuscatedName("hi.aq")
    public static class378 field2098;

    @ObfuscatedName("he.al")
    public static class378 field2118;

    @ObfuscatedName("bm.iu")
    public static int field216;

    @ObfuscatedName("he.aw")
    public static class378 field2161;

    @ObfuscatedName("bm.aq")
    public static class213 field217;

    @ObfuscatedName("hb.jx")
    public static class548 field2170;

    @ObfuscatedName("hb.as")
    public static class378 field2175;

    @ObfuscatedName("hb.ao")
    public static int field2177;

    @ObfuscatedName("bm.bj")
    public static String field218;

    @ObfuscatedName("az.aj")
    public static int field22;

    @ObfuscatedName("hb.aa")
    public static class378 field2231;

    @ObfuscatedName("hf.aq")
    public static class378 field2245;

    @ObfuscatedName("hz.wq")
    public static int field2292;

    @ObfuscatedName("il.ev")
    public static class458 field2299;

    @ObfuscatedName("iy.fo")
    public static int field2313;

    @ObfuscatedName("ig.aw")
    public static String field2317;

    @ObfuscatedName("ig.ay")
    public static String field2321;

    @ObfuscatedName("ik.an")
    public static int field2329;

    @ObfuscatedName("ik.jt")
    public static int field2330;

    @ObfuscatedName("ik.ai")
    public static File field2332;

    @ObfuscatedName("ik.em")
    public static class376 field2337;

    @ObfuscatedName("iv.ah")
    public static int field2341;

    @ObfuscatedName("iv.vv")
    public static class380 field2344;

    @ObfuscatedName("io.wp")
    public static class389 field2353;

    @ObfuscatedName("io.ak")
    public static int[] field2355;

    @ObfuscatedName("bw.fm")
    public static class376 field240;

    @ObfuscatedName("ia.sz")
    public static class157 field2405;

    @ObfuscatedName("jz.az")
    public static int field2479;

    @ObfuscatedName("bv.cq")
    public static int field248;

    @ObfuscatedName("jz.as")
    public static int[] field2482;

    @ObfuscatedName("jh.au")
    public static class548 field2495;

    @ObfuscatedName("jh.pz")
    public static int field2496;

    @ObfuscatedName("jw.tf")
    public static int field2530;

    @ObfuscatedName("jw.ae")
    public static int field2531;

    @ObfuscatedName("jj.nf")
    public static int field2577;

    @ObfuscatedName("jl.ja")
    public static class548[] field2582;

    @ObfuscatedName("jf.tz")
    public static int field2610;

    @ObfuscatedName("jf.da")
    public static class547 field2611;

    @ObfuscatedName("jf.fr")
    public static class376 field2612;

    @ObfuscatedName("jf.fi")
    public static class376 field2613;

    @ObfuscatedName("jc.ar")
    public static class69[] field2661;

    @ObfuscatedName("jp.sh")
    public static boolean field2666;

    @ObfuscatedName("kl.ub")
    public static int field2684;

    @ObfuscatedName("kl.jc")
    public static class547[] field2686;

    @ObfuscatedName("kl.ci")
    public static class393 field2689;

    @ObfuscatedName("kc.dl")
    public static boolean field2697;

    @ObfuscatedName("ko.ax")
    public static int[] field2781;

    @ObfuscatedName("bf.az")
    public static ScheduledExecutorService field283;

    @ObfuscatedName("kq.cm")
    public static int field2847;

    @ObfuscatedName("kq.bd")
    public static int field2853;

    @ObfuscatedName("kq.ag")
    public static int field2863;

    @ObfuscatedName("kq.ad")
    public static int field2865;

    @ObfuscatedName("kq.at")
    public static int field2866;

    @ObfuscatedName("kq.ay")
    public static int field2867;

    @ObfuscatedName("kq.ae")
    public static int field2868;

    @ObfuscatedName("kq.av")
    public static int field2871;

    @ObfuscatedName("kq.ap")
    public static int field2872;

    @ObfuscatedName("kq.bu")
    public static int field2873;

    @ObfuscatedName("kq.bo")
    public static int field2874;

    @ObfuscatedName("kq.bi")
    public static int field2876;

    @ObfuscatedName("kq.cw")
    public static int field2880;

    @ObfuscatedName("kq.cu")
    public static int field2883;

    @ObfuscatedName("kq.cy")
    public static int field2890;

    @ObfuscatedName("kq.ce")
    public static int field2899;

    @ObfuscatedName("kq.am")
    public static int field2900;

    @ObfuscatedName("kq.cl")
    public static boolean[][] field2907;

    @ObfuscatedName("kq.cx")
    public static int field2909;

    @ObfuscatedName("kq.ac")
    public static int field2911;

    @ObfuscatedName("kq.ab")
    public static int field2912;

    @ObfuscatedName("kt.un")
    public static int field2915;

    @ObfuscatedName("ky.ew")
    public static class376 field2922;

    @ObfuscatedName("ky.ga")
    public static String field2923;

    @ObfuscatedName("ks.dt")
    public static class547[] field2929;

    @ObfuscatedName("bf.ar")
    public static int field296;

    @ObfuscatedName("bf.as")
    public static boolean field297;

    @ObfuscatedName("kz.cz")
    public static int field3043;

    @ObfuscatedName("kz.cm")
    public static int field3044;

    @ObfuscatedName("kz.cx")
    public static int field3045;

    @ObfuscatedName("kr.ar")
    public static int field3065;

    @ObfuscatedName("lk.ts")
    public static class39 field3083;

    @ObfuscatedName("lv.pm")
    public static class350[] field3106;

    @ObfuscatedName("lf.pb")
    public static int field3112;

    @ObfuscatedName("la.dk")
    public static boolean field3132;

    @ObfuscatedName("la.wf")
    public static int field3147;

    @ObfuscatedName("ld.an")
    public static int field3168;

    @ObfuscatedName("lq.eq")
    public static class376 field3275;

    @ObfuscatedName("mn.au")
    public static class116 field3296;

    @ObfuscatedName("mj.qy")
    public static class216 field3424;

    @ObfuscatedName("mi.sv")
    public static class166 field3446;

    @ObfuscatedName("mi.fp")
    public static int field3447;

    @ObfuscatedName("mi.cp")
    public static int field3449;

    @ObfuscatedName("mb.aw")
    public static long field3452;

    @ObfuscatedName("mb.aq")
    public static long field3453;

    @ObfuscatedName("mb.kj")
    public static int field3456;

    @ObfuscatedName("mb.iq")
    public static int field3457;

    @ObfuscatedName("ml.ci")
    public static int field3458;

    @ObfuscatedName("ml.id")
    public static int[] field3462;

    @ObfuscatedName("mt.aw")
    public static class378 field3476;

    @ObfuscatedName("mt.al")
    public static class378 field3478;

    @ObfuscatedName("mt.aq")
    public static class378 field3481;

    @ObfuscatedName("mk.ix")
    public static int field3538;

    @ObfuscatedName("mk.af")
    public static int[] field3539;

    @ObfuscatedName("mk.hz")
    public static class458 field3540;

    @ObfuscatedName("mg.ag")
    public static class99 field3545;

    @ObfuscatedName("au.bl")
    public static class465 field36;

    @ObfuscatedName("me.ac")
    public static String field3606;

    @ObfuscatedName("me.vs")
    public static long field3610;

    @ObfuscatedName("mc.bx")
    public static class465 field3614;

    @ObfuscatedName("mp.jl")
    public static class548 field3616;

    @ObfuscatedName("ch.an")
    public static class157 field364;

    @ObfuscatedName("co.ac")
    public static float[] field367;

    @ObfuscatedName("nt.aj")
    public static short[] field3672;

    @ObfuscatedName("co.af")
    public static boolean[] field370;

    @ObfuscatedName("co.az")
    public static int field373;

    @ObfuscatedName("co.ao")
    public static int field374;

    @ObfuscatedName("co.au")
    public static class53[] field375;

    @ObfuscatedName("co.ak")
    public static class42[] field376;

    @ObfuscatedName("co.ah")
    public static class47[] field377;

    @ObfuscatedName("co.aj")
    public static class51[] field378;

    @ObfuscatedName("co.bo")
    public static int[] field379;

    @ObfuscatedName("co.ax")
    public static int[] field386;

    @ObfuscatedName("nc.aa")
    public static byte[][][] field3877;

    @ObfuscatedName("co.ab")
    public static float[] field389;

    @ObfuscatedName("ny.au")
    public static int[] field3892;

    @ObfuscatedName("ny.bd")
    public static FontMetrics field3897;

    @ObfuscatedName("nz.vq")
    public static class379 field3898;

    @ObfuscatedName("co.av")
    public static float[] field390;

    @ObfuscatedName("nk.gn")
    public static String field3902;

    @ObfuscatedName("co.ap")
    public static float[] field391;

    @ObfuscatedName("co.bu")
    public static float[] field392;

    @ObfuscatedName("co.bd")
    public static int[] field394;

    @ObfuscatedName("nx.fn")
    public static class376 field3959;

    @ObfuscatedName("nx.ao")
    public static int field3961;

    @ObfuscatedName("nx.ut")
    public static int field3962;

    @ObfuscatedName("co.ae")
    public static float[] field397;

    @ObfuscatedName("ni.ob")
    public static class75 field3971;

    @ObfuscatedName("oy.tq")
    public static int field3979;

    @ObfuscatedName("ar.jn")
    public static int field4;

    @ObfuscatedName("cn.aj")
    public static class413 field407;

    @ObfuscatedName("cn.np")
    public static int field410;

    @ObfuscatedName("cz.az")
    public static float field419;

    @ObfuscatedName("cz.ao")
    public static int field422;

    @ObfuscatedName("ci.ke")
    public static int field429;

    @ObfuscatedName("cl.ng")
    public static int field434;

    @ObfuscatedName("oh.um")
    public static int field4356;

    @ObfuscatedName("cl.ib")
    public static class413 field436;

    @ObfuscatedName("or.as")
    public static Thread field4362;

    @ObfuscatedName("cl.ak")
    public static int field437;

    @ObfuscatedName("og.ed")
    public static class376 field4388;

    @ObfuscatedName("ak.ag")
    public static String[] field44;

    @ObfuscatedName("ot.ia")
    public static int field4435;

    @ObfuscatedName("ou.ai")
    public static short[][][] field4443;

    @ObfuscatedName("ok.ks")
    public static int field4450;

    @ObfuscatedName("ok.aq")
    public static class378 field4451;

    @ObfuscatedName("oa.eb")
    public static class221 field4462;

    @ObfuscatedName("od.aq")
    public static String field4466;

    @ObfuscatedName("od.az")
    public static ThreadPoolExecutor field4468;

    @ObfuscatedName("pt.bo")
    public static Font field4482;

    @ObfuscatedName("pt.fj")
    public static class376 field4484;

    @ObfuscatedName("pt.gp")
    public static String field4485;

    @ObfuscatedName("pl.dm")
    public static class547 field4515;

    @ObfuscatedName("pg.cx")
    public static int field4532;

    @ObfuscatedName("pk.aq")
    public static class356 field4540;

    @ObfuscatedName("pc.ah")
    public static short[][] field4548;

    @ObfuscatedName("pm.gb")
    public static int field4557;

    @ObfuscatedName("qi.ak")
    public static class547[] field4597;

    @ObfuscatedName("qa.iz")
    public static int field4619;

    @ObfuscatedName("qu.bg")
    public static boolean field4621;

    @ObfuscatedName("qc.ay")
    public static class265 field4642;

    @ObfuscatedName("cw.en")
    public static class376 field465;

    @ObfuscatedName("qr.am")
    public static int[] field4660;

    @ObfuscatedName("qr.dm")
    public static class90 field4662;

    @ObfuscatedName("qf.dk")
    public static class548[] field4675;

    @ObfuscatedName("qf.wb")
    public static Iterator field4676;

    @ObfuscatedName("cw.fh")
    public static class376 field469;

    @ObfuscatedName("ah.uo")
    public static int field47;

    @ObfuscatedName("cw.qf")
    public static class111 field470;

    @ObfuscatedName("rt.uq")
    public static int field4737;

    @ObfuscatedName("rd.kx")
    public static int field4747;

    @ObfuscatedName("rk.cg")
    public static class512 field4750;

    @ObfuscatedName("rk.js")
    public static int[][] field4753;

    @ObfuscatedName("rj.ka")
    public static int field4756;

    @ObfuscatedName("rm.ar")
    public static short[][][] field4774;

    @ObfuscatedName("rr.az")
    public static int[] field4778;

    @ObfuscatedName("rr.jg")
    public static class547[] field4779;

    @ObfuscatedName("rz.ae")
    public static String field4785;

    @ObfuscatedName("ri.ak")
    public static int field4802;

    @ObfuscatedName("sa.ax")
    public static class547 field4869;

    @ObfuscatedName("sc.au")
    public static int field4871;

    @ObfuscatedName("sc.mb")
    public static int field4873;

    @ObfuscatedName("cu.ah")
    public static int[] field488;

    @ObfuscatedName("cu.qs")
    public static class517 field489;

    @ObfuscatedName("cu.hm")
    public static SecureRandom field490;

    @ObfuscatedName("ce.je")
    public static class548[] field493;

    @ObfuscatedName("tn.aa")
    public static int field4972;

    @ObfuscatedName("ah.ar")
    public static File field50;

    @ObfuscatedName("tu.os")
    public static class350 field5063;

    @ObfuscatedName("tx.dq")
    public static class547 field5118;

    @ObfuscatedName("tx.tx")
    public static int field5119;

    @ObfuscatedName("uw.aa")
    public static int field5122;

    @ObfuscatedName("uw.ai")
    public static int[] field5123;

    @ObfuscatedName("uh.gh")
    public static String field5132;

    @ObfuscatedName("uc.dx")
    public static boolean field5137;

    @ObfuscatedName("uc.aq")
    public static class378 field5138;

    @ObfuscatedName("uf.aq")
    public static class378 field5152;

    @ObfuscatedName("us.aq")
    public static class378 field5158;

    @ObfuscatedName("aj.bt")
    public static Image field52;

    @ObfuscatedName("ue.av")
    public static int[] field5230;

    @ObfuscatedName("uj.af")
    public static class547 field5266;

    @ObfuscatedName("uv.bu")
    public static float[] field5270;

    @ObfuscatedName("uv.av")
    public static int field5271;

    @ObfuscatedName("uv.ap")
    public static int field5272;

    @ObfuscatedName("uv.ab")
    public static int[] field5276;

    @ObfuscatedName("aj.fd")
    public static class376 field53;

    @ObfuscatedName("vp.aw")
    public static int field5309;

    @ObfuscatedName("vp.al")
    public static int field5310;

    @ObfuscatedName("vp.ai")
    public static int[] field5311;

    @ObfuscatedName("vp.aq")
    public static int field5312;

    @ObfuscatedName("vp.ar")
    public static int[] field5313;

    @ObfuscatedName("vp.ao")
    public static byte[][] field5314;

    @ObfuscatedName("vp.aa")
    public static int[] field5315;

    @ObfuscatedName("va.an")
    public static class547 field5359;

    @ObfuscatedName("vt.aw")
    public static String field5365;

    @ObfuscatedName("vt.aq")
    public static Applet field5366;

    @ObfuscatedName("vt.ai")
    public static int field5367;

    @ObfuscatedName("vt.ar")
    public static int field5368;

    @ObfuscatedName("vt.al")
    public static int field5369;

    @ObfuscatedName("aj.ag")
    public static class166 field54;

    @ObfuscatedName("aj.ak")
    public static class226 field55;

    @ObfuscatedName("client.es")
    public static class376 field557;

    @ObfuscatedName("client.fu")
    public static class68 field559;

    @ObfuscatedName("af.jf")
    public static class548[] field62;

    @ObfuscatedName("af.ih")
    public static int[] field64;

    @ObfuscatedName("ar.aw")
    public static class378 field7;

    @ObfuscatedName("ax.bc")
    public static GarbageCollectorMXBean field73;

    @ObfuscatedName("an.aw")
    public static class16 field75;

    @ObfuscatedName("am.aw")
    public static class378 field82;

    @ObfuscatedName("ad.kf")
    public static int field84;

    @ObfuscatedName("cj.du")
    public static class547[] field853;

    @ObfuscatedName("ct.ca")
    public static int field860;

    @ObfuscatedName("ct.ko")
    public static int field861;

    @ObfuscatedName("ad.uz")
    public static int field87;

    @ObfuscatedName("ca.ar")
    public static String[] field882;

    @ObfuscatedName("ca.am")
    public static int field885;

    @ObfuscatedName("ca.ao")
    public static int field886;

    @ObfuscatedName("ca.ax")
    public static class350 field890;

    @ObfuscatedName("at.as")
    public static int field91;

    @ObfuscatedName("cc.te")
    public static class58 field920;

    @ObfuscatedName("cc.qv")
    public static class474 field921;

    @ObfuscatedName("cc.aa")
    public static int field922;

    @ObfuscatedName("cc.eh")
    public static long field923;

    @ObfuscatedName("cc.wo")
    public static short[] field924;

    @ObfuscatedName("cb.cf")
    public static String field933;

    @ObfuscatedName("cf.aw")
    public static boolean field941;

    @ObfuscatedName("cf.ai")
    public static class547[] field943;

    @ObfuscatedName("cf.aa")
    public static class547 field945;

    @ObfuscatedName("at.et")
    public static class376 field95;

    @ObfuscatedName("cf.ao")
    public static class548 field952;

    @ObfuscatedName("cf.ac")
    public static int field955;

    @ObfuscatedName("cf.ak")
    public static class547 field960;

    @ObfuscatedName("cf.as")
    public static class547 field965;

    @ObfuscatedName("ir.aq(CI)B")
    public static byte method4036(char arg0) {
        byte var1;
        if (!(arg0 <= 0 || arg0 >= 128) || !(arg0 < 160 || arg0 > 255)) {
            var1 = (byte) arg0;
        } else if (arg0 == 8364) {
            var1 = -128;
        } else if (arg0 == 8218) {
            var1 = -126;
        } else if (arg0 == 402) {
            var1 = -125;
        } else if (arg0 == 8222) {
            var1 = -124;
        } else if (arg0 == 8230) {
            var1 = -123;
        } else if (arg0 == 8224) {
            var1 = -122;
        } else if (arg0 == 8225) {
            var1 = -121;
        } else if (arg0 == 710) {
            var1 = -120;
        } else if (arg0 == 8240) {
            var1 = -119;
        } else if (arg0 == 352) {
            var1 = -118;
        } else if (arg0 == 8249) {
            var1 = -117;
        } else if (arg0 == 338) {
            var1 = -116;
        } else if (arg0 == 381) {
            var1 = -114;
        } else if (arg0 == 8216) {
            var1 = -111;
        } else if (arg0 == 8217) {
            var1 = -110;
        } else if (arg0 == 8220) {
            var1 = -109;
        } else if (arg0 == 8221) {
            var1 = -108;
        } else if (arg0 == 8226) {
            var1 = -107;
        } else if (arg0 == 8211) {
            var1 = -106;
        } else if (arg0 == 8212) {
            var1 = -105;
        } else if (arg0 == 732) {
            var1 = -104;
        } else if (arg0 == 8482) {
            var1 = -103;
        } else if (arg0 == 353) {
            var1 = -102;
        } else if (arg0 == 8250) {
            var1 = -101;
        } else if (arg0 == 339) {
            var1 = -100;
        } else if (arg0 == 382) {
            var1 = -98;
        } else if (arg0 == 376) {
            var1 = -97;
        } else {
            var1 = 63;
        }
        return var1;
    }

    @ObfuscatedName("am.aw(IIIII)I")
    public static final int method205(int arg0, int arg1, int arg2, int arg3) {
        return arg0 * arg3 + arg1 * arg2 >> 16;
    }

    @ObfuscatedName("dj.aq(III)I")
    public static int method2322(int arg0, int arg1) {
        return (arg0 << 8) + arg1;
    }

    @ObfuscatedName("cq.aq(Lte;I)I")
    public static final int method2026(class512 arg0) {
        if (arg0 == null) {
            return 12;
        } else {
            switch(arg0.field5093) {
                case 5:
                    return 20;
                default:
                    return 12;
            }
        }
    }

    @ObfuscatedName("ce.aq(IB)Lhr;")
    public static class196 method1133(int arg0) {
        class196 var1 = (class196) class196.field2053.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2052.method6489(1, arg0);
        class196 var3 = new class196();
        if (var2 != null) {
            var3.method3469(new class534(var2), arg0);
        }
        var3.method3474();
        class196.field2053.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hb.aq(Lof;I)V")
    public static void method3696(class378 arg0) {
        field2245 = arg0;
    }

    @ObfuscatedName("fn.aw(Lof;III)[Lvd;")
    public static class548[] method2990(class378 arg0, int arg1, int arg2) {
        if (!class549.method2926(arg0, arg1, arg2)) {
            return null;
        }
        class548[] var3 = new class548[field5312];
        for (int var4 = 0; var4 < field5312; var4++) {
            class548 var5 = var3[var4] = new class548();
            var5.field5297 = field5309;
            var5.field5302 = field5310;
            var5.field5299 = field5311[var4];
            var5.field5305 = field5313[var4];
            var5.field5304 = field2482[var4];
            var5.field5298 = field5315[var4];
            int var6 = var5.field5304 * var5.field5298;
            byte[] var7 = field5314[var4];
            var5.field5296 = new int[var6];
            for (int var8 = 0; var8 < var6; var8++) {
                var5.field5296[var8] = field4778[var7[var8] & 0xFF];
            }
        }
        field5311 = null;
        field5313 = null;
        field2482 = null;
        field5315 = null;
        field4778 = null;
        field5314 = (byte[][]) null;
        return var3;
    }

    @ObfuscatedName("hc.aq(II)Lhn;")
    public static class195 method3501(int arg0) {
        class195 var1 = (class195) class195.field2036.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2043.method6489(13, arg0);
        class195 var3 = new class195();
        var3.field2050 = arg0;
        if (var2 != null) {
            var3.method3452(new class534(var2));
        }
        class195.field2036.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("di.aq(Lof;Lof;IZI)Lfc;")
    public static class141 method2326(class378 arg0, class378 arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        byte[] var5 = arg0.method6426(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
        if (var5 == null) {
            boolean var6 = false;
            return null;
        }
        int var7 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
        byte[] var8;
        if (arg3) {
            var8 = arg1.method6426(0, var7);
        } else {
            var8 = arg1.method6426(var7, 0);
        }
        if (var8 == null) {
            var4 = false;
        }
        if (!var4) {
            return null;
        }
        if (field4468 == null) {
            field5122 = Runtime.getRuntime().availableProcessors();
            field4468 = new ThreadPoolExecutor(0, field5122, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(field5122 * 100 + 100), new class138());
        }
        try {
            return new class141(arg0, arg1, arg2, arg3);
        } catch (Exception var10) {
            return null;
        }
    }

    @ObfuscatedName("pi.aq(B)V")
    public static void method6934() {
        if (class36.field219 != null) {
            class36 var0 = class36.field219;
            synchronized (class36.field219) {
                class36.field219 = null;
            }
        }
    }

    @ObfuscatedName("mr.aq(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static void method5453(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                Throwable var3 = arg1;
                String var5;
                if (arg1 instanceof class560) {
                    class560 var4 = (class560) arg1;
                    var5 = var4.field5364 + " | ";
                    var3 = var4.field5370;
                } else {
                    var5 = "";
                }
                StringWriter var6 = new StringWriter();
                PrintWriter var7 = new PrintWriter(var6);
                var3.printStackTrace(var7);
                var7.close();
                String var8 = var6.toString();
                BufferedReader var9 = new BufferedReader(new StringReader(var8));
                String var10 = var9.readLine();
                while (true) {
                    String var11 = var9.readLine();
                    if (var11 == null) {
                        String var20 = var5 + "| " + var10;
                        var2 = var20;
                        break;
                    }
                    int var12 = var11.indexOf(40);
                    int var13 = var11.indexOf(41, var12 + 1);
                    if (var12 >= 0 && var13 >= 0) {
                        String var14 = var11.substring(var12 + 1, var13);
                        int var15 = var14.indexOf(".java:");
                        if (var15 >= 0) {
                            String var16 = var14.substring(0, var15) + var14.substring(var15 + 5);
                            var5 = var5 + var16 + ' ';
                            continue;
                        }
                        var11 = var11.substring(0, var12);
                    }
                    String var17 = var11.trim();
                    String var18 = var17.substring(var17.lastIndexOf(32) + 1);
                    String var19 = var18.substring(var18.lastIndexOf(9) + 1);
                    var5 = var5 + var19 + ' ';
                }
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var2 = var2 + " | ";
                }
                var2 = var2 + arg0;
            }
            System.out.println("Error: " + var2);
            String var22 = var2.replace(':', '.');
            String var23 = var22.replace('@', '_');
            String var24 = var23.replace('&', '_');
            String var25 = var24.replace('#', '_');
            if (field5366 == null) {
                return;
            }
            URL var26 = new URL(field5366.getCodeBase(), "clienterror.ws?cv=" + field5369 + "&cs=" + field5367 + "&u=" + field5365 + "&v1=" + field4466 + "&v2=" + field2317 + "&ct=" + field5368 + "&e=" + var25);
            DataInputStream var27 = new DataInputStream(var26.openStream());
            var27.read();
            var27.close();
        } catch (Exception var29) {
        }
    }

    @ObfuscatedName("ch.al(Ljava/lang/CharSequence;IZB)Z")
    public static boolean method998(CharSequence arg0, int arg1, boolean arg2) {
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
                return false;
            }
            if (var10 >= arg1) {
                return false;
            }
            if (var3) {
                var10 = -var10;
            }
            int var9 = arg1 * var5 + var10;
            if (var9 / arg1 != var5) {
                return false;
            }
            var5 = var9;
            var4 = true;
        }
        return var4;
    }

    @ObfuscatedName("hj.ar(I)V")
    public static void method3365() {
        class177.field1859.method5418();
    }

    @ObfuscatedName("fh.aw(III)V")
    public static void method2925(int arg0, int arg1) {
        class198 var2 = (class198) class198.field2067.method5414((long) arg0);
        class198 var3;
        if (var2 == null) {
            byte[] var4 = field2063.method6489(14, arg0);
            class198 var5 = new class198();
            if (var4 != null) {
                var5.method3485(new class534(var4));
            }
            class198.field2067.method5421(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var7 = var3.field2060;
        int var8 = var3.field2061;
        int var9 = var3.field2064;
        int var10 = class338.field3617[var9 - var8];
        if (arg1 < 0 || arg1 > var10) {
            arg1 = 0;
        }
        int var11 = var10 << var8;
        class338.field3620[var7] = class338.field3620[var7] & ~var11 | arg1 << var8 & var11;
    }

    @ObfuscatedName("ih.al(B)V")
    public static void method4109() {
        class243.field2534.method5390();
    }

    @ObfuscatedName("rr.al(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method7690(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!class32.field161.startsWith("win")) {
                    throw new Exception();
                } else if (arg0.startsWith("http://") || arg0.startsWith("https://")) {
                    String var3 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    for (int var4 = 0; var4 < arg0.length(); var4++) {
                        if (var3.indexOf(arg0.charAt(var4)) == -1) {
                            throw new Exception();
                        }
                    }
                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + arg0 + "\"");
                    return true;
                } else {
                    throw new Exception();
                }
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Applet var6 = class32.field165;
                Object[] var7 = new Object[] { (new URL(class32.field165.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var16) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                class32.field165.getAppletContext().showDocument(new URL(class32.field165.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                Applet var12 = class32.field165;
                JSObject.getWindow(var12).call("loggedout", (Object[]) null);
            } catch (Throwable var19) {
            }
            try {
                class32.field165.getAppletContext().showDocument(new URL(class32.field165.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var18) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("op.aw(CLpe;B)C")
    public static char method6574(char arg0, class393 arg1) {
        if (arg0 >= 192 && arg0 <= 255) {
            if (arg0 >= 192 && arg0 <= 198) {
                return 'A';
            }
            if (arg0 == 199) {
                return 'C';
            }
            if (arg0 >= 200 && arg0 <= 203) {
                return 'E';
            }
            if (arg0 >= 204 && arg0 <= 207) {
                return 'I';
            }
            if (arg0 == 209 && class393.field4498 != arg1) {
                return 'N';
            }
            if (arg0 >= 210 && arg0 <= 214) {
                return 'O';
            }
            if (arg0 >= 217 && arg0 <= 220) {
                return 'U';
            }
            if (arg0 == 221) {
                return 'Y';
            }
            if (arg0 == 223) {
                return 's';
            }
            if (arg0 >= 224 && arg0 <= 230) {
                return 'a';
            }
            if (arg0 == 231) {
                return 'c';
            }
            if (arg0 >= 232 && arg0 <= 235) {
                return 'e';
            }
            if (arg0 >= 236 && arg0 <= 239) {
                return 'i';
            }
            if (arg0 == 241 && class393.field4498 != arg1) {
                return 'n';
            }
            if (arg0 >= 242 && arg0 <= 246) {
                return 'o';
            }
            if (arg0 >= 249 && arg0 <= 252) {
                return 'u';
            }
            if (arg0 == 253 || arg0 == 255) {
                return 'y';
            }
        }
        if (arg0 == 338) {
            return 'O';
        } else if (arg0 == 339) {
            return 'o';
        } else if (arg0 == 376) {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @ObfuscatedName("dv.aw(Lun;II)V")
    public static final void method2157(class533 arg0, int arg1) {
        int var2 = arg0.field5200;
        class109.field1388 = 0;
        method3502(arg0);
        for (int var3 = 0; var3 < class109.field1388; var3++) {
            int var4 = class109.field1387[var3];
            class93 var5 = client.field652[var4];
            int var6 = arg0.method8591();
            if ((var6 & 0x10) != 0) {
                var6 += arg0.method8591() << 8;
            }
            if ((var6 & 0x800) != 0) {
                var6 += arg0.method8591() << 16;
            }
            class109.method6330(arg0, var4, var5, var6);
        }
        if (arg0.field5200 - var2 != arg1) {
            throw new RuntimeException(arg0.field5200 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ep.ak(II)I")
    public static int method2817(int arg0) {
        class65 var1 = (class65) class112.field1422.method8299((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (class112.field1421.field4529 == var1.field4913) {
            return -1;
        } else {
            return ((class65) var1.field4913).field483;
        }
    }

    @ObfuscatedName("hv.al(Lun;I)V")
    public static final void method3502(class533 arg0) {
        int var1 = 0;
        arg0.method8541();
        for (int var2 = 0; var2 < class109.field1381; var2++) {
            int var3 = class109.field1376[var2];
            if ((class109.field1380[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    class109.field1380[var3] = (byte) (class109.field1380[var3] | 0x2);
                } else {
                    int var4 = arg0.method8567(1);
                    if (var4 == 0) {
                        var1 = class109.method1087(arg0);
                        class109.field1380[var3] = (byte) (class109.field1380[var3] | 0x2);
                    } else {
                        class109.method2249(arg0, var3);
                    }
                }
            }
        }
        arg0.method8551();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method8541();
        for (int var5 = 0; var5 < class109.field1381; var5++) {
            int var6 = class109.field1376[var5];
            if ((class109.field1380[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    class109.field1380[var6] = (byte) (class109.field1380[var6] | 0x2);
                } else {
                    int var7 = arg0.method8567(1);
                    if (var7 == 0) {
                        var1 = class109.method1087(arg0);
                        class109.field1380[var6] = (byte) (class109.field1380[var6] | 0x2);
                    } else {
                        class109.method2249(arg0, var6);
                    }
                }
            }
        }
        arg0.method8551();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method8541();
        for (int var8 = 0; var8 < class109.field1383; var8++) {
            int var9 = class109.field1384[var8];
            if ((class109.field1380[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    class109.field1380[var9] = (byte) (class109.field1380[var9] | 0x2);
                } else {
                    int var10 = arg0.method8567(1);
                    if (var10 == 0) {
                        var1 = class109.method1087(arg0);
                        class109.field1380[var9] = (byte) (class109.field1380[var9] | 0x2);
                    } else if (class109.method3337(arg0, var9)) {
                        class109.field1380[var9] = (byte) (class109.field1380[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method8551();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method8541();
        for (int var11 = 0; var11 < class109.field1383; var11++) {
            int var12 = class109.field1384[var11];
            if ((class109.field1380[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    class109.field1380[var12] = (byte) (class109.field1380[var12] | 0x2);
                } else {
                    int var13 = arg0.method8567(1);
                    if (var13 == 0) {
                        var1 = class109.method1087(arg0);
                        class109.field1380[var12] = (byte) (class109.field1380[var12] | 0x2);
                    } else if (class109.method3337(arg0, var12)) {
                        class109.field1380[var12] = (byte) (class109.field1380[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method8551();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        class109.field1381 = 0;
        class109.field1383 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            class109.field1380[var14] = (byte) (class109.field1380[var14] >> 1);
            class93 var15 = client.field652[var14];
            if (var15 == null) {
                class109.field1384[++class109.field1383 - 1] = var14;
            } else {
                class109.field1376[++class109.field1381 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("ir.ai(CLpe;B)I")
    public static int method4035(char arg0, class393 arg1) {
        int var2 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var2 = (arg0 << 4) + 1;
        }
        if (arg0 == 241 && class393.field4498 == arg1) {
            var2 = 1762;
        }
        return var2;
    }

    @ObfuscatedName("mz.ar(I)[Lfh;")
    public static class131[] method5715() {
        return new class131[] { class131.field1549, class131.field1540, class131.field1541, class131.field1542, class131.field1545 };
    }

    @ObfuscatedName("nu.ai(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method6325(String arg0) {
        return arg0 == null || arg0.isEmpty() || arg0.charAt(0) == '#' ? "" : arg0;
    }

    @ObfuscatedName("mj.ag(IB)I")
    public static int method5448(int arg0) {
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @ObfuscatedName("eq.ax(IIIIB)I")
    public static final int method2867(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class272.field2820[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @ObfuscatedName("cj.ae(IIIIIIIILkq;Liz;I)V")
    public static final void method1727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class276 arg8, class230 arg9) {
        class204 var10 = class204.method2849(arg4);
        int var11 = arg7 >= 0 ? arg7 : var10.field2141;
        int var12;
        int var13;
        if (arg5 == 1 || arg5 == 3) {
            var12 = var10.field2134;
            var13 = var10.field2133;
        } else {
            var12 = var10.field2133;
            var13 = var10.field2134;
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
        int[][] var18 = class83.field1049[arg1];
        int var19 = var18[var14][var16] + var18[var15][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
        int var20 = (arg2 << 7) + (var12 << 6);
        int var21 = (arg3 << 7) + (var13 << 6);
        long var22 = class286.method248(arg2, arg3, 2, var10.field2145 == 0, arg4);
        int var24 = (arg5 << 6) + arg6;
        if (var10.field2166 == 1) {
            var24 += 256;
        }
        if (arg6 == 22) {
            class278 var25;
            if (var11 == -1 && var10.field2159 == null) {
                var25 = var10.method3595(22, arg5, var18, var20, var19, var21);
            } else {
                var25 = new class81(arg4, 22, arg5, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
            }
            arg8.method4895(arg0, arg2, arg3, var19, var25, var22, var24);
            if (var10.field2135 == 1) {
                arg9.method4082(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class278 var51;
            if (var11 == -1 && var10.field2159 == null) {
                var51 = var10.method3595(10, arg5, var18, var20, var19, var21);
            } else {
                var51 = new class81(arg4, 10, arg5, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
            }
            if (var51 != null) {
                arg8.method4899(arg0, arg2, arg3, var19, var12, var13, var51, arg6 == 11 ? 256 : 0, var22, var24);
            }
            if (var10.field2135 != 0) {
                arg9.method4070(arg2, arg3, var12, var13, var10.field2136);
            }
        } else if (arg6 >= 12) {
            class278 var26;
            if (var11 == -1 && var10.field2159 == null) {
                var26 = var10.method3595(arg6, arg5, var18, var20, var19, var21);
            } else {
                var26 = new class81(arg4, arg6, arg5, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
            }
            arg8.method4899(arg0, arg2, arg3, var19, 1, 1, var26, 0, var22, var24);
            if (var10.field2135 != 0) {
                arg9.method4070(arg2, arg3, var12, var13, var10.field2136);
            }
        } else if (arg6 == 0) {
            class278 var27;
            if (var11 == -1 && var10.field2159 == null) {
                var27 = var10.method3595(0, arg5, var18, var20, var19, var21);
            } else {
                var27 = new class81(arg4, 0, arg5, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
            }
            arg8.method5028(arg0, arg2, arg3, var19, var27, (class278) null, class83.field1061[arg5], 0, var22, var24);
            if (var10.field2135 != 0) {
                arg9.method4102(arg2, arg3, arg6, arg5, var10.field2136);
            }
        } else if (arg6 == 1) {
            class278 var28;
            if (var11 == -1 && var10.field2159 == null) {
                var28 = var10.method3595(1, arg5, var18, var20, var19, var21);
            } else {
                var28 = new class81(arg4, 1, arg5, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
            }
            arg8.method5028(arg0, arg2, arg3, var19, var28, (class278) null, class83.field1057[arg5], 0, var22, var24);
            if (var10.field2135 != 0) {
                arg9.method4102(arg2, arg3, arg6, arg5, var10.field2136);
            }
        } else if (arg6 == 2) {
            int var29 = arg5 + 1 & 0x3;
            class278 var30;
            class278 var31;
            if (var11 == -1 && var10.field2159 == null) {
                var30 = var10.method3595(2, arg5 + 4, var18, var20, var19, var21);
                var31 = var10.method3595(2, var29, var18, var20, var19, var21);
            } else {
                var30 = new class81(arg4, 2, arg5 + 4, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
                var31 = new class81(arg4, 2, var29, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
            }
            arg8.method5028(arg0, arg2, arg3, var19, var30, var31, class83.field1061[arg5], class83.field1061[var29], var22, var24);
            if (var10.field2135 != 0) {
                arg9.method4102(arg2, arg3, arg6, arg5, var10.field2136);
            }
        } else if (arg6 == 3) {
            class278 var32;
            if (var11 == -1 && var10.field2159 == null) {
                var32 = var10.method3595(3, arg5, var18, var20, var19, var21);
            } else {
                var32 = new class81(arg4, 3, arg5, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
            }
            arg8.method5028(arg0, arg2, arg3, var19, var32, (class278) null, class83.field1057[arg5], 0, var22, var24);
            if (var10.field2135 != 0) {
                arg9.method4102(arg2, arg3, arg6, arg5, var10.field2136);
            }
        } else if (arg6 == 9) {
            class278 var33;
            if (var11 == -1 && var10.field2159 == null) {
                var33 = var10.method3595(arg6, arg5, var18, var20, var19, var21);
            } else {
                var33 = new class81(arg4, arg6, arg5, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
            }
            arg8.method4899(arg0, arg2, arg3, var19, 1, 1, var33, 0, var22, var24);
            if (var10.field2135 != 0) {
                arg9.method4070(arg2, arg3, var12, var13, var10.field2136);
            }
        } else if (arg6 == 4) {
            class278 var34;
            if (var11 == -1 && var10.field2159 == null) {
                var34 = var10.method3595(4, arg5, var18, var20, var19, var21);
            } else {
                var34 = new class81(arg4, 4, arg5, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
            }
            arg8.method4898(arg0, arg2, arg3, var19, var34, (class278) null, class83.field1061[arg5], 0, 0, 0, var22, var24);
        } else if (arg6 == 5) {
            int var35 = 16;
            long var36 = arg8.method4915(arg0, arg2, arg3);
            if (var36 != 0L) {
                var35 = class204.method2849(class286.method1110(var36)).field2165;
            }
            class278 var38;
            if (var11 == -1 && var10.field2159 == null) {
                var38 = var10.method3595(4, arg5, var18, var20, var19, var21);
            } else {
                var38 = new class81(arg4, 4, arg5, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
            }
            arg8.method4898(arg0, arg2, arg3, var19, var38, (class278) null, class83.field1061[arg5], 0, class83.field1054[arg5] * var35, class83.field1055[arg5] * var35, var22, var24);
        } else if (arg6 == 6) {
            int var39 = 8;
            long var40 = arg8.method4915(arg0, arg2, arg3);
            if (var40 != 0L) {
                var39 = class204.method2849(class286.method1110(var40)).field2165 / 2;
            }
            class278 var42;
            if (var11 == -1 && var10.field2159 == null) {
                var42 = var10.method3595(4, arg5 + 4, var18, var20, var19, var21);
            } else {
                var42 = new class81(arg4, 4, arg5 + 4, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
            }
            arg8.method4898(arg0, arg2, arg3, var19, var42, (class278) null, 256, arg5, class83.field1056[arg5] * var39, class83.field1047[arg5] * var39, var22, var24);
        } else if (arg6 == 7) {
            int var43 = arg5 + 2 & 0x3;
            class278 var44;
            if (var11 == -1 && var10.field2159 == null) {
                var44 = var10.method3595(4, var43 + 4, var18, var20, var19, var21);
            } else {
                var44 = new class81(arg4, 4, var43 + 4, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
            }
            arg8.method4898(arg0, arg2, arg3, var19, var44, (class278) null, 256, var43, 0, 0, var22, var24);
        } else if (arg6 == 8) {
            int var45 = 8;
            long var46 = arg8.method4915(arg0, arg2, arg3);
            if (var46 != 0L) {
                var45 = class204.method2849(class286.method1110(var46)).field2165 / 2;
            }
            int var48 = arg5 + 2 & 0x3;
            class278 var49;
            class278 var50;
            if (var11 == -1 && var10.field2159 == null) {
                var49 = var10.method3595(4, arg5 + 4, var18, var20, var19, var21);
                var50 = var10.method3595(4, var48 + 4, var18, var20, var19, var21);
            } else {
                var49 = new class81(arg4, 4, arg5 + 4, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
                var50 = new class81(arg4, 4, var48 + 4, arg1, arg2, arg3, var11, var10.field2168, (class278) null);
            }
            arg8.method4898(arg0, arg2, arg3, var19, var49, var50, 256, arg5, class83.field1056[arg5] * var45, class83.field1047[arg5] * var45, var22, var24);
        }
    }

    @ObfuscatedName("em.ah(Lng;IB)V")
    public static final void method2848(class350 arg0, int arg1) {
        if (arg0.field3740 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3872 == null) {
            arg0.field3872 = new int[arg0.field3740.length];
        }
        arg0.field3872[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("fq.an(ILdc;ZI)I")
    public static int method2987(int arg0, class80 arg1, boolean arg2) {
        class350 var3 = arg2 ? field890 : field1645;
        if (arg0 == 1700) {
            class72.field898[++field886 - 1] = var3.field3728;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3728 == -1) {
                class72.field898[++field886 - 1] = 0;
            } else {
                class72.field898[++field886 - 1] = var3.field3721;
            }
            return 1;
        } else if (arg0 == 1702) {
            class72.field898[++field886 - 1] = var3.field3726;
            return 1;
        } else if (arg0 == 1707) {
            class72.field898[++field886 - 1] = var3.method6241() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return class72.method253(var3);
        } else if (arg0 == 1709) {
            return class72.method6344(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hy.ac(Lbm;I)V")
    public static void method3586(class35 arg0) {
        class229 var1 = client.method5445();
        while (var1.method4043()) {
            if (var1.field2435 == 13) {
                class77.method4530();
                return;
            }
            if (var1.field2435 == 96) {
                if (class77.field973 > 0 && field2611 != null) {
                    class77.field973--;
                }
            } else if (var1.field2435 == 97 && class77.field973 < class77.field974 && field5118 != null) {
                class77.field973++;
            }
        }
        if (class36.field227 != 1 && field5137 || class36.field227 != 4) {
            return;
        }
        int var2 = class77.field942 + 280;
        if (class36.field225 >= var2 && class36.field225 <= var2 + 14 && class36.field238 >= 4 && class36.field238 <= 18) {
            class69.method5708(0, 0);
            return;
        }
        if (class36.field225 >= var2 + 15 && class36.field225 <= var2 + 80 && class36.field238 >= 4 && class36.field238 <= 18) {
            class69.method5708(0, 1);
            return;
        }
        int var3 = class77.field942 + 390;
        if (class36.field225 >= var3 && class36.field225 <= var3 + 14 && class36.field238 >= 4 && class36.field238 <= 18) {
            class69.method5708(1, 0);
            return;
        }
        if (class36.field225 >= var3 + 15 && class36.field225 <= var3 + 80 && class36.field238 >= 4 && class36.field238 <= 18) {
            class69.method5708(1, 1);
            return;
        }
        int var4 = class77.field942 + 500;
        if (class36.field225 >= var4 && class36.field225 <= var4 + 14 && class36.field238 >= 4 && class36.field238 <= 18) {
            class69.method5708(2, 0);
            return;
        }
        if (class36.field225 >= var4 + 15 && class36.field225 <= var4 + 80 && class36.field238 >= 4 && class36.field238 <= 18) {
            class69.method5708(2, 1);
            return;
        }
        int var5 = class77.field942 + 610;
        if (class36.field225 >= var5 && class36.field225 <= var5 + 14 && class36.field238 >= 4 && class36.field238 <= 18) {
            class69.method5708(3, 0);
            return;
        }
        if (class36.field225 >= var5 + 15 && class36.field225 <= var5 + 80 && class36.field238 >= 4 && class36.field238 <= 18) {
            class69.method5708(3, 1);
            return;
        }
        if (class36.field225 >= class77.field942 + 708 && class36.field238 >= 4 && class36.field225 <= class77.field942 + 708 + 50 && class36.field238 <= 20) {
            class77.method4530();
            return;
        }
        if (class77.field972 != -1) {
            class69 var6 = field2661[class77.field972];
            boolean var7 = class531.method1063(client.field588, class530.field5175);
            boolean var8 = var6.method1719();
            field2697 = var8;
            var6.field851 = var8 ? "beta" : var6.field851;
            class77.method4517(var6);
            class77.method4530();
            if (var7 != var8) {
                client.method6345();
            }
            return;
        }
        if (class77.field973 > 0 && field2611 != null && class36.field225 >= 0 && class36.field225 <= field2611.field5290 && class36.field238 >= field2531 / 2 - 50 && class36.field238 <= field2531 / 2 + 50) {
            class77.field973--;
        }
        if (class77.field973 < class77.field974 && field5118 != null && class36.field225 >= field199 - field5118.field5290 - 5 && class36.field225 <= field199 && class36.field238 >= field2531 / 2 - 50 && class36.field238 <= field2531 / 2 + 50) {
            class77.field973++;
        }
    }

    @ObfuscatedName("eq.bq(ILjava/lang/String;B)V")
    public static void method2874(int arg0, String arg1) {
        class77.field977 = arg1;
        class77.field951 = arg0;
    }

    @ObfuscatedName("gw.hx(B)J")
    public static long method3148() {
        return client.field602;
    }

    @ObfuscatedName("az.ig(IIII)V")
    public static final void method52(int arg0, int arg1, int arg2) {
        if (field4756 < arg0) {
            field4756 += field3979 * (arg0 - field4756) / 1000 + field5119;
            if (field4756 > arg0) {
                field4756 = arg0;
            }
        }
        if (field4756 > arg0) {
            field4756 -= field3979 * (field4756 - arg0) / 1000 + field5119;
            if (field4756 < arg0) {
                field4756 = arg0;
            }
        }
        if (field84 < arg1) {
            field84 += field3979 * (arg1 - field84) / 1000 + field5119;
            if (field84 > arg1) {
                field84 = arg1;
            }
        }
        if (field84 > arg1) {
            field84 -= field3979 * (field84 - arg1) / 1000 + field5119;
            if (field84 < arg1) {
                field84 = arg1;
            }
        }
        if (field3456 < arg2) {
            field3456 += field3979 * (arg2 - field3456) / 1000 + field5119;
            if (field3456 > arg2) {
                field3456 = arg2;
            }
        }
        if (field3456 > arg2) {
            field3456 -= field3979 * (field3456 - arg2) / 1000 + field5119;
            if (field3456 < arg2) {
                field3456 = arg2;
            }
        }
    }

    @ObfuscatedName("pc.jw(I)V")
    public static final void method6933() {
        client.field650 = 0;
        int var0 = (field1858.field1208 >> 7) + field1011;
        int var1 = (field1858.field1253 >> 7) + field216;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            client.field650 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            client.field650 = 1;
        }
        if (client.field650 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            client.field650 = 0;
        }
    }

    @ObfuscatedName("dg.km(ZLun;B)V")
    public static final void method2131(boolean arg0, class533 arg1) {
        client.field659 = 0;
        client.field635 = 0;
        arg1.method8541();
        int var2 = arg1.method8567(8);
        if (var2 < client.field572) {
            for (int var3 = var2; var3 < client.field572; var3++) {
                client.field660[++client.field659 - 1] = client.field587[var3];
            }
        }
        if (var2 > client.field572) {
            throw new RuntimeException("");
        }
        client.field572 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = client.field587[var4];
            class102 var6 = client.field629[var5];
            int var7 = arg1.method8567(1);
            if (var7 == 0) {
                client.field587[++client.field572 - 1] = var5;
                var6.field1265 = client.field536;
            } else {
                int var8 = arg1.method8567(2);
                if (var8 == 0) {
                    client.field587[++client.field572 - 1] = var5;
                    var6.field1265 = client.field536;
                    client.field589[++client.field635 - 1] = var5;
                } else if (var8 == 1) {
                    client.field587[++client.field572 - 1] = var5;
                    var6.field1265 = client.field536;
                    int var9 = arg1.method8567(3);
                    var6.method2542(var9, class234.field2471);
                    int var10 = arg1.method8567(1);
                    if (var10 == 1) {
                        client.field589[++client.field635 - 1] = var5;
                    }
                } else if (var8 == 2) {
                    client.field587[++client.field572 - 1] = var5;
                    var6.field1265 = client.field536;
                    if (arg1.method8567(1) == 1) {
                        int var11 = arg1.method8567(3);
                        var6.method2542(var11, class234.field2473);
                        int var12 = arg1.method8567(3);
                        var6.method2542(var12, class234.field2473);
                    } else {
                        int var13 = arg1.method8567(3);
                        var6.method2542(var13, class234.field2470);
                    }
                    int var14 = arg1.method8567(1);
                    if (var14 == 1) {
                        client.field589[++client.field635 - 1] = var5;
                    }
                } else if (var8 == 3) {
                    client.field660[++client.field659 - 1] = var5;
                }
            }
        }
        while (true) {
            byte var15 = 16;
            int var16 = 0x1 << var15;
            if (arg1.method8550(client.field590.field1431) < var15 + 12) {
                break;
            }
            int var17 = arg1.method8567(var15);
            if (var16 - 1 == var17) {
                break;
            }
            boolean var87 = false;
            if (client.field629[var17] == null) {
                client.field629[var17] = new class102();
                var87 = true;
            }
            class102 var88 = client.field629[var17];
            client.field587[++client.field572 - 1] = var17;
            var88.field1265 = client.field536;
            int var89 = arg1.method8567(1);
            if (var89 == 1) {
                client.field589[++client.field635 - 1] = var17;
            }
            boolean var90 = arg1.method8567(1) == 1;
            if (var90) {
                arg1.method8567(32);
            }
            int var91;
            if (arg0) {
                var91 = arg1.method8567(8);
                if (var91 > 127) {
                    var91 -= 256;
                }
            } else {
                var91 = arg1.method8567(5);
                if (var91 > 15) {
                    var91 -= 32;
                }
            }
            var88.field1331 = class190.method3274(arg1.method8567(14));
            int var92 = arg1.method8567(1);
            int var93 = client.field664[arg1.method8567(3)];
            if (var87) {
                var88.field1273 = var88.field1275 = var93;
            }
            int var94;
            if (arg0) {
                var94 = arg1.method8567(8);
                if (var94 > 127) {
                    var94 -= 256;
                }
            } else {
                var94 = arg1.method8567(5);
                if (var94 > 15) {
                    var94 -= 32;
                }
            }
            client.method3038(var88);
            if (var88.field1250 == 0) {
                var88.field1275 = 0;
            }
            var88.method2537(field1858.field1235[0] + var91, field1858.field1278[0] + var94, var92 == 1);
        }
        arg1.method8551();
        for (int var18 = 0; var18 < client.field635; var18++) {
            int var19 = client.field589[var18];
            class102 var20 = client.field629[var19];
            int var21 = arg1.method8591();
            if ((var21 & 0x8) != 0) {
                int var22 = arg1.method8591();
                var21 += var22 << 8;
            }
            if ((var21 & 0x100) != 0) {
                int var23 = arg1.method8591();
                var21 += var23 << 16;
            }
            if ((var21 & 0x20) != 0) {
                var20.field1252 = arg1.method8741();
                var20.field1230 = 100;
            }
            if ((var21 & 0x4000) != 0) {
                var20.field1258 = arg1.method8629();
                var20.field1260 = arg1.method8628();
                var20.field1259 = arg1.method8592();
                var20.field1249 = arg1.method8592();
                var20.field1262 = arg1.method8610() + client.field536;
                var20.field1272 = arg1.method8610() + client.field536;
                var20.field1224 = arg1.method8754();
                var20.field1276 = 1;
                var20.field1281 = 0;
                var20.field1258 += var20.field1235[0];
                var20.field1260 += var20.field1278[0];
                var20.field1259 += var20.field1235[0];
                var20.field1249 += var20.field1278[0];
            }
            if ((var21 & 0x20000) != 0) {
                int var24 = arg1.method8648();
                var20.field1267 = (var24 & 0x1) == 0 ? var20.field1331.field2003 : arg1.method8821();
                var20.field1214 = (var24 & 0x2) == 0 ? var20.field1331.field1975 : arg1.method8821();
                var20.field1215 = (var24 & 0x4) == 0 ? var20.field1331.field1976 : arg1.method8754();
                var20.field1216 = (var24 & 0x8) == 0 ? var20.field1331.field1977 : arg1.method8610();
                var20.field1282 = (var24 & 0x10) == 0 ? var20.field1331.field1972 : arg1.method8593();
                var20.field1218 = (var24 & 0x20) == 0 ? var20.field1331.field1991 : arg1.method8754();
                var20.field1219 = (var24 & 0x40) == 0 ? var20.field1331.field1980 : arg1.method8821();
                var20.field1220 = (var24 & 0x80) == 0 ? var20.field1331.field1981 : arg1.method8754();
                var20.field1221 = (var24 & 0x100) == 0 ? var20.field1331.field1988 : arg1.method8610();
                var20.field1222 = (var24 & 0x200) == 0 ? var20.field1331.field1983 : arg1.method8593();
                var20.field1223 = (var24 & 0x400) == 0 ? var20.field1331.field1984 : arg1.method8610();
                var20.field1217 = (var24 & 0x800) == 0 ? var20.field1331.field1967 : arg1.method8593();
                var20.field1225 = (var24 & 0x1000) == 0 ? var20.field1331.field1985 : arg1.method8821();
                var20.field1226 = (var24 & 0x2000) == 0 ? var20.field1331.field1987 : arg1.method8593();
                var20.field1212 = (var24 & 0x4000) == 0 ? var20.field1331.field1973 : arg1.method8821();
            }
            if ((var21 & 0x8000) != 0) {
                int var25 = arg1.method8591();
                if ((var25 & 0x1) == 1) {
                    var20.method2552();
                } else {
                    int[] var26 = null;
                    if ((var25 & 0x2) == 2) {
                        int var27 = arg1.method8723();
                        var26 = new int[var27];
                        for (int var28 = 0; var28 < var27; var28++) {
                            int var29 = arg1.method8610();
                            int var30 = var29 == 65535 ? -1 : var29;
                            var26[var28] = var30;
                        }
                    }
                    short[] var31 = null;
                    if ((var25 & 0x4) == 4) {
                        int var32 = 0;
                        if (var20.field1331.field1970 != null) {
                            var32 = var20.field1331.field1970.length;
                        }
                        var31 = new short[var32];
                        for (int var33 = 0; var33 < var32; var33++) {
                            var31[var33] = (short) arg1.method8754();
                        }
                    }
                    short[] var34 = null;
                    if ((var25 & 0x8) == 8) {
                        int var35 = 0;
                        if (var20.field1331.field1974 != null) {
                            var35 = var20.field1331.field1974.length;
                        }
                        var34 = new short[var35];
                        for (int var36 = 0; var36 < var35; var36++) {
                            var34[var36] = (short) arg1.method8821();
                        }
                    }
                    boolean var37 = false;
                    if ((var25 & 0x10) != 0) {
                        var37 = arg1.method8624() == 1;
                    }
                    long var38 = (long) (++class102.field1337 - 1);
                    var20.method2579(new class189(var38, var26, var31, var34, var37));
                }
            }
            if ((var21 & 0x80) != 0) {
                int var40 = arg1.method8610();
                if (var40 == 65535) {
                    var40 = -1;
                }
                int var41 = arg1.method8697();
                if (var20.field1251 == var40 && var40 != -1) {
                    int var42 = class207.method3902(var40).field2273;
                    if (var42 == 1) {
                        var20.field1231 = 0;
                        var20.field1211 = 0;
                        var20.field1254 = var41;
                        var20.field1255 = 0;
                    }
                    if (var42 == 2) {
                        var20.field1255 = 0;
                    }
                } else if (var40 == -1 || var20.field1251 == -1 || class207.method3902(var40).field2267 >= class207.method3902(var20.field1251).field2267) {
                    var20.field1251 = var40;
                    var20.field1231 = 0;
                    var20.field1211 = 0;
                    var20.field1254 = var41;
                    var20.field1255 = 0;
                    var20.field1281 = var20.field1276;
                }
            }
            if ((var21 & 0x10) != 0) {
                int var43 = arg1.method8754();
                int var44 = arg1.method8593();
                var20.field1246 = arg1.method8723() == 1;
                var20.field1244 = var43;
                var20.field1245 = var44;
            }
            if ((var21 & 0x2) != 0) {
                var20.field1241 = arg1.method8821();
                var20.field1241 += arg1.method8697() << 16;
                int var45 = 16777215;
                if (var20.field1241 == var45) {
                    var20.field1241 = -1;
                }
            }
            if ((var21 & 0x400) != 0) {
                var20.method2538(arg1.method8741());
            }
            if ((var21 & 0x1000) != 0) {
                var20.field1271 = arg1.method8648();
            }
            if ((var21 & 0x40) != 0) {
                int var46 = arg1.method8624();
                if (var46 > 0) {
                    for (int var47 = 0; var47 < var46; var47++) {
                        int var48 = -1;
                        int var49 = -1;
                        int var50 = -1;
                        int var51 = arg1.method8820();
                        if (var51 == 32767) {
                            var51 = arg1.method8820();
                            var49 = arg1.method8820();
                            var48 = arg1.method8820();
                            var50 = arg1.method8820();
                        } else if (var51 == 32766) {
                            var51 = -1;
                        } else {
                            var49 = arg1.method8820();
                        }
                        int var52 = arg1.method8820();
                        var20.method2350(var51, var49, var48, var50, client.field536, var52);
                    }
                }
                int var53 = arg1.method8697();
                if (var53 > 0) {
                    for (int var54 = 0; var54 < var53; var54++) {
                        int var55 = arg1.method8820();
                        int var56 = arg1.method8820();
                        if (var56 == 32767) {
                            var20.method2353(var55);
                        } else {
                            int var57 = arg1.method8820();
                            int var58 = arg1.method8591();
                            int var59 = var56 > 0 ? arg1.method8624() : var58;
                            var20.method2358(var55, client.field536, var56, var57, var58, var59);
                        }
                    }
                }
            }
            if ((var21 & 0x10000) != 0) {
                int var60 = arg1.method8723();
                for (int var61 = 0; var61 < var60; var61++) {
                    int var62 = arg1.method8591();
                    int var63 = arg1.method8821();
                    int var64 = arg1.method8647();
                    var20.method2352(var62, var63, var64 >> 16, var64 & 0xFFFF);
                }
            }
            if ((var21 & 0x40000) != 0) {
                int var65 = arg1.method8624();
                int[] var66 = new int[8];
                short[] var67 = new short[8];
                for (int var68 = 0; var68 < 8; var68++) {
                    if ((var65 & 0x1 << var68) == 0) {
                        var66[var68] = -1;
                        var67[var68] = -1;
                    } else {
                        var66[var68] = arg1.method8811();
                        var67[var68] = (short) arg1.method8608();
                    }
                }
                var20.method2547(var66, var67);
            }
            if ((var21 & 0x200) != 0) {
                int var69 = arg1.method8723();
                if ((var69 & 0x1) == 1) {
                    var20.method2551();
                } else {
                    int[] var70 = null;
                    if ((var69 & 0x2) == 2) {
                        int var71 = arg1.method8624();
                        var70 = new int[var71];
                        for (int var72 = 0; var72 < var71; var72++) {
                            int var73 = arg1.method8593();
                            int var74 = var73 == 65535 ? -1 : var73;
                            var70[var72] = var74;
                        }
                    }
                    short[] var75 = null;
                    if ((var69 & 0x4) == 4) {
                        int var76 = 0;
                        if (var20.field1331.field1970 != null) {
                            var76 = var20.field1331.field1970.length;
                        }
                        var75 = new short[var76];
                        for (int var77 = 0; var77 < var76; var77++) {
                            var75[var77] = (short) arg1.method8593();
                        }
                    }
                    short[] var78 = null;
                    if ((var69 & 0x8) == 8) {
                        int var79 = 0;
                        if (var20.field1331.field1974 != null) {
                            var79 = var20.field1331.field1974.length;
                        }
                        var78 = new short[var79];
                        for (int var80 = 0; var80 < var79; var80++) {
                            var78[var80] = (short) arg1.method8754();
                        }
                    }
                    boolean var81 = false;
                    if ((var69 & 0x10) != 0) {
                        var81 = arg1.method8624() == 1;
                    }
                    long var82 = (long) (++class102.field1339 - 1);
                    var20.method2589(new class189(var82, var70, var75, var78, var81));
                }
            }
            if ((var21 & 0x2000) != 0) {
                var20.method2539(arg1.method8697());
            }
            if ((var21 & 0x4) != 0) {
                var20.field1331 = class190.method3274(arg1.method8593());
                client.method3038(var20);
                var20.method2548();
            }
            if ((var21 & 0x800) != 0) {
                var20.field1263 = client.field536 + arg1.method8610();
                var20.field1279 = client.field536 + arg1.method8754();
                var20.field1269 = arg1.method8592();
                var20.field1270 = arg1.method8629();
                var20.field1277 = arg1.method8628();
                var20.field1256 = (byte) arg1.method8697();
            }
            if ((var21 & 0x1) != 0) {
                arg1.method8754();
                arg1.method8597();
            }
        }
        for (int var84 = 0; var84 < client.field659; var84++) {
            int var85 = client.field660[var84];
            if (client.field536 != client.field629[var85].field1265) {
                client.field629[var85].field1331 = null;
                client.field629[var85] = null;
            }
        }
        if (client.field590.field1431 != arg1.field5200) {
            throw new RuntimeException(arg1.field5200 + class103.field1343 + client.field590.field1431);
        }
        for (int var86 = 0; var86 < client.field572; var86++) {
            if (client.field629[client.field587[var86]] == null) {
                throw new RuntimeException(var86 + class103.field1343 + client.field572);
            }
        }
    }

    @ObfuscatedName("ig.md(II)V")
    public static final void method3866(int arg0) {
        if (!field1071.method5783(arg0)) {
            return;
        }
        class350[] var1 = field1071.field3634[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class350 var3 = var1[var2];
            if (var3 != null) {
                var3.field3861 = 0;
                var3.field3862 = 0;
            }
        }
    }

    @ObfuscatedName("hg.mv(II)V")
    public static final void method3335(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        client.method255((double) var3);
    }

    @ObfuscatedName("dq.nm(Lng;IIII)V")
    public static final void method2263(class350 arg0, int arg1, int arg2, int arg3) {
        client.method3445();
        class337 var4 = arg0.method6147(field1071, false);
        if (var4 == null) {
            return;
        }
        class544.method8892(arg1, arg2, var4.field3615 + arg1, var4.field3612 + arg2);
        if (client.field780 == 2 || client.field780 == 5) {
            class544.method8891(arg1, arg2, 0, var4.field3611, var4.field3613);
        } else {
            int var5 = client.field541 & 0x7FF;
            int var6 = field1858.field1208 / 32 + 48;
            int var7 = 464 - field1858.field1253 / 32;
            field119.method9029(arg1, arg2, var4.field3615, var4.field3612, var6, var7, var5, 256, var4.field3611, var4.field3613);
            for (int var8 = 0; var8 < client.field774; var8++) {
                int var9 = client.field553[var8] * 4 + 2 - field1858.field1208 / 32;
                int var10 = client.field776[var8] * 4 + 2 - field1858.field1253 / 32;
                client.method102(arg1, arg2, var9, var10, client.field777[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class397 var13 = client.field666[field4873][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - field1858.field1208 / 32;
                        int var15 = var12 * 4 + 2 - field1858.field1253 / 32;
                        client.method102(arg1, arg2, var14, var15, field2582[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < client.field572; var16++) {
                class102 var17 = client.field629[client.field587[var16]];
                if (var17 != null && var17.method2289()) {
                    class190 var18 = var17.field1331;
                    if (var18 != null && var18.field2001 != null) {
                        var18 = var18.method3398();
                    }
                    if (var18 != null && var18.field1963 && var18.field2004) {
                        int var19 = var17.field1208 / 32 - field1858.field1208 / 32;
                        int var20 = var17.field1253 / 32 - field1858.field1253 / 32;
                        client.method102(arg1, arg2, var19, var20, field2582[1], var4);
                    }
                }
            }
            int var21 = class109.field1381;
            int[] var22 = class109.field1376;
            for (int var23 = 0; var23 < var21; var23++) {
                class93 var24 = client.field652[var22[var23]];
                if (var24 != null && var24.method2289() && !var24.field1155 && field1858 != var24) {
                    int var25 = var24.field1208 / 32 - field1858.field1208 / 32;
                    int var26 = var24.field1253 / 32 - field1858.field1253 / 32;
                    if (var24.method2276()) {
                        client.method102(arg1, arg2, var25, var26, field2582[3], var4);
                    } else if (field1858.field1163 != 0 && var24.field1163 != 0 && field1858.field1163 == var24.field1163) {
                        client.method102(arg1, arg2, var25, var26, field2582[4], var4);
                    } else if (var24.method2279()) {
                        client.method102(arg1, arg2, var25, var26, field2582[5], var4);
                    } else if (var24.method2307()) {
                        client.method102(arg1, arg2, var25, var26, field2582[6], var4);
                    } else {
                        client.method102(arg1, arg2, var25, var26, field2582[2], var4);
                    }
                }
            }
            if (client.field543 != 0 && client.field536 % 20 < 10) {
                if (client.field543 == 1 && client.field544 >= 0 && client.field544 < client.field629.length) {
                    class102 var27 = client.field629[client.field544];
                    if (var27 != null) {
                        int var28 = var27.field1208 / 32 - field1858.field1208 / 32;
                        int var29 = var27.field1253 / 32 - field1858.field1253 / 32;
                        client.method266(arg1, arg2, var28, var29, field1391[1], var4);
                    }
                }
                if (client.field543 == 2) {
                    int var30 = client.field546 * 4 - field1011 * 4 + 2 - field1858.field1208 / 32;
                    int var31 = client.field547 * 4 - field216 * 4 + 2 - field1858.field1253 / 32;
                    client.method266(arg1, arg2, var30, var31, field1391[1], var4);
                }
                if (client.field543 == 10 && client.field537 >= 0 && client.field537 < client.field652.length) {
                    class93 var32 = client.field652[client.field537];
                    if (var32 != null) {
                        int var33 = var32.field1208 / 32 - field1858.field1208 / 32;
                        int var34 = var32.field1253 / 32 - field1858.field1253 / 32;
                        client.method266(arg1, arg2, var33, var34, field1391[1], var4);
                    }
                }
            }
            if (client.field778 != 0) {
                int var35 = client.field778 * 4 + 2 - field1858.field1208 / 32;
                int var36 = client.field779 * 4 + 2 - field1858.field1253 / 32;
                client.method102(arg1, arg2, var35, var36, field1391[0], var4);
            }
            if (!field1858.field1155) {
                class544.method8900(var4.field3615 / 2 + arg1 - 1, var4.field3612 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        client.field722[arg3] = true;
    }

    @ObfuscatedName("ol.nn(Lng;IIIB)V")
    public static final void method6563(class350 arg0, int arg1, int arg2, int arg3) {
        class337 var4 = arg0.method6147(field1071, false);
        if (var4 == null) {
            return;
        }
        if (client.field780 < 3) {
            field3616.method9029(arg1, arg2, var4.field3615, var4.field3612, 25, 25, client.field541, 256, var4.field3611, var4.field3613);
        } else {
            class544.method8891(arg1, arg2, 0, var4.field3611, var4.field3613);
        }
    }

    @ObfuscatedName("fv.ne(III)V")
    public static final void method2963(int arg0, int arg1) {
        if (client.field772[arg0] == null || arg1 < 0 || arg1 >= client.field772[arg0].method3180()) {
            return;
        }
        class148 var2 = (class148) client.field772[arg0].field1804.get(arg1);
        if (var2.field1680 != -1) {
            return;
        }
        class313 var3 = class313.method5301(class311.field3256, client.field590.field1435);
        var3.field3291.method8574(3 + class534.method3043(var2.field1679.method9185()));
        var3.field3291.method8574(arg0);
        var3.field3291.method8575(arg1);
        var3.field3291.method8581(var2.field1679.method9185());
        client.field590.method2741(var3);
    }

    @ObfuscatedName("er.ar(B)[Lea;")
    public static class105[] method2811() {
        return new class105[] { class105.field1363, class105.field1365, class105.field1359, class105.field1362, class105.field1360 };
    }
}
