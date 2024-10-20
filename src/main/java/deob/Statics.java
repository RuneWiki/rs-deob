package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.StreamCorruptedException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("b.dk")
    public static class246 field103;

    @ObfuscatedName("l.s")
    public static boolean field107;

    @ObfuscatedName("cr.ap")
    public static Font field1072;

    @ObfuscatedName("cq.a")
    public static int field1084;

    @ObfuscatedName("co.u")
    public static int[] field1087;

    @ObfuscatedName("r.gp")
    public static class335 field111;

    @ObfuscatedName("cu.z")
    public static int field1118;

    @ObfuscatedName("cu.e")
    public static int field1120;

    @ObfuscatedName("cu.d")
    public static String[] field1130;

    @ObfuscatedName("cu.n")
    public static class227 field1131;

    @ObfuscatedName("r.ea")
    public static class246 field114;

    @ObfuscatedName("cs.aw")
    public static int field1142;

    @ObfuscatedName("cg.rf")
    public static int field1146;

    @ObfuscatedName("cd.di")
    public static class246 field1152;

    @ObfuscatedName("cx.gg")
    public static int field1153;

    @ObfuscatedName("r.u")
    public static class227 field116;

    @ObfuscatedName("o.e")
    public static int[] field117;

    @ObfuscatedName("ci.eh")
    public static class246 field1172;

    @ObfuscatedName("cz.k")
    public static class244 field1178;

    @ObfuscatedName("cz.ba")
    public static class334 field1180;

    @ObfuscatedName("cz.w")
    public static File field1181;

    @ObfuscatedName("cb.n")
    public static int field1183;

    @ObfuscatedName("cb.e")
    public static int field1188;

    @ObfuscatedName("cy.d")
    public static class334[] field1191;

    @ObfuscatedName("cy.q")
    public static class335 field1194;

    @ObfuscatedName("cy.n")
    public static class334 field1195;

    @ObfuscatedName("cy.u")
    public static class334 field1196;

    @ObfuscatedName("cy.m")
    public static boolean field1206;

    @ObfuscatedName("o.ee")
    public static int field121;

    @ObfuscatedName("o.sg")
    public static class343 field122;

    @ObfuscatedName("ct.sj")
    public static class84 field1253;

    @ObfuscatedName("cf.i")
    public static class51 field1257;

    @ObfuscatedName("ca.ol")
    public static class178 field1263;

    @ObfuscatedName("ca.ds")
    public static class246 field1264;

    @ObfuscatedName("cj.rh")
    public static int field1281;

    @ObfuscatedName("cp.sm")
    public static class341 field1288;

    @ObfuscatedName("cp.x")
    public static class244 field1289;

    @ObfuscatedName("ce.fs")
    public static class305 field1304;

    @ObfuscatedName("ce.ej")
    public static String field1306;

    @ObfuscatedName("cl.fc")
    public static long field1320;

    @ObfuscatedName("cl.go")
    public static class335 field1326;

    @ObfuscatedName("j.gm")
    public static byte[][] field133;

    @ObfuscatedName("dv.r")
    public static int field1332;

    @ObfuscatedName("dd.ew")
    public static int[] field1346;

    @ObfuscatedName("j.s")
    public static int field135;

    @ObfuscatedName("du.gi")
    public static class335[] field1355;

    @ObfuscatedName("dl.ab")
    public static int[] field1370;

    @ObfuscatedName("dl.t")
    public static int field1372;

    @ObfuscatedName("dl.n")
    public static class114[] field1375;

    @ObfuscatedName("dl.q")
    public static byte[] field1376;

    @ObfuscatedName("dl.z")
    public static int field1377;

    @ObfuscatedName("dl.f")
    public static float[] field1378;

    @ObfuscatedName("dl.e")
    public static int field1379;

    @ObfuscatedName("y.br")
    public static String field138;

    @ObfuscatedName("dl.s")
    public static int field1380;

    @ObfuscatedName("dl.u")
    public static class121[] field1383;

    @ObfuscatedName("dl.h")
    public static class126[] field1384;

    @ObfuscatedName("dl.i")
    public static int[] field1386;

    @ObfuscatedName("dl.c")
    public static float[] field1392;

    @ObfuscatedName("dl.j")
    public static float[] field1393;

    @ObfuscatedName("dl.y")
    public static float[] field1394;

    @ObfuscatedName("dl.p")
    public static class110[] field1395;

    @ObfuscatedName("dl.ae")
    public static float[] field1396;

    @ObfuscatedName("dl.an")
    public static float[] field1397;

    @ObfuscatedName("dl.ai")
    public static float[] field1398;

    @ObfuscatedName("dl.ap")
    public static int[] field1399;

    @ObfuscatedName("y.gh")
    public static byte[][] field140;

    @ObfuscatedName("dl.g")
    public static boolean[] field1400;

    @ObfuscatedName("y.fh")
    public static class305 field141;

    @ObfuscatedName("db.s")
    public static int[] field1413;

    @ObfuscatedName("db.e")
    public static int[] field1419;

    @ObfuscatedName("db.p")
    public static boolean[] field1420;

    @ObfuscatedName("dw.z")
    public static ScheduledExecutorService field1421;

    @ObfuscatedName("dw.w")
    public static int field1422;

    @ObfuscatedName("dw.t")
    public static int field1424;

    @ObfuscatedName("dw.n")
    public static class109 field1426;

    @ObfuscatedName("y.y")
    public static int[] field143;

    @ObfuscatedName("dw.v")
    public static boolean field1438;

    @ObfuscatedName("f.et")
    public static class246 field145;

    @ObfuscatedName("dh.ij")
    public static int field1455;

    @ObfuscatedName("dh.e")
    public static class244 field1456;

    @ObfuscatedName("dk.z")
    public static byte[][][] field1463;

    @ObfuscatedName("f.qt")
    public static class122 field149;

    @ObfuscatedName("dc.t")
    public static int field1504;

    @ObfuscatedName("dc.z")
    public static float field1506;

    @ObfuscatedName("di.rl")
    public static int field1550;

    @ObfuscatedName("di.sy")
    public static int field1552;

    @ObfuscatedName("ae.ed")
    public static int field158;

    @ObfuscatedName("ae.ad")
    public static int field159;

    @ObfuscatedName("ae.p")
    public static class334 field161;

    @ObfuscatedName("an.dr")
    public static class246 field163;

    @ObfuscatedName("et.h")
    public static int[] field1648;

    @ObfuscatedName("an.bu")
    public static class348 field165;

    @ObfuscatedName("d.cx")
    public static int field17;

    @ObfuscatedName("el.bg")
    public static int field1707;

    @ObfuscatedName("el.be")
    public static int field1741;

    @ObfuscatedName("el.bt")
    public static int field1743;

    @ObfuscatedName("ei.z")
    public static int field1754;

    @ObfuscatedName("ei.w")
    public static int field1757;

    @ObfuscatedName("ei.p")
    public static int field1759;

    @ObfuscatedName("en.z")
    public static short[][] field1765;

    @ObfuscatedName("ec.g")
    public static int field1774;

    @ObfuscatedName("ec.n")
    public static int field1776;

    @ObfuscatedName("ec.l")
    public static int field1778;

    @ObfuscatedName("ec.c")
    public static class149 field1782;

    @ObfuscatedName("ec.h")
    public static int field1784;

    @ObfuscatedName("ec.a")
    public static int field1785;

    @ObfuscatedName("ec.i")
    public static int field1786;

    @ObfuscatedName("ec.b")
    public static int field1788;

    @ObfuscatedName("ec.u")
    public static int field1789;

    @ObfuscatedName("ev.sl")
    public static long field1803;

    @ObfuscatedName("ej.bv")
    public static int field1822;

    @ObfuscatedName("ej.a")
    public static int field1828;

    @ObfuscatedName("ej.b")
    public static int field1829;

    @ObfuscatedName("ej.l")
    public static int field1830;

    @ObfuscatedName("ej.bx")
    public static int field1831;

    @ObfuscatedName("ej.o")
    public static int field1832;

    @ObfuscatedName("ej.c")
    public static int field1833;

    @ObfuscatedName("ej.j")
    public static int field1834;

    @ObfuscatedName("ej.y")
    public static int field1835;

    @ObfuscatedName("ej.bt")
    public static boolean[][] field1836;

    @ObfuscatedName("ej.ae")
    public static int field1837;

    @ObfuscatedName("ej.an")
    public static int field1838;

    @ObfuscatedName("ej.ai")
    public static int field1839;

    @ObfuscatedName("ej.ap")
    public static int field1840;

    @ObfuscatedName("ej.ba")
    public static int field1841;

    @ObfuscatedName("ej.i")
    public static int field1851;

    @ObfuscatedName("ej.r")
    public static int field1861;

    @ObfuscatedName("ej.bh")
    public static int field1872;

    @ObfuscatedName("ej.br")
    public static int field1873;

    @ObfuscatedName("ej.bq")
    public static int field1874;

    @ObfuscatedName("ej.f")
    public static int field1875;

    @ObfuscatedName("ed.t")
    public static int field1878;

    @ObfuscatedName("ed.w")
    public static class334 field1879;

    @ObfuscatedName("d.t")
    public static class334 field19;

    @ObfuscatedName("er.iz")
    public static int field1900;

    @ObfuscatedName("ey.gb")
    public static int[][] field1958;

    @ObfuscatedName("ey.fx")
    public static class315 field1961;

    @ObfuscatedName("ew.n")
    public static class118 field1967;

    @ObfuscatedName("ff.ot")
    public static class100 field1984;

    @ObfuscatedName("fd.eo")
    public static class246 field1988;

    @ObfuscatedName("fp.pl")
    public static class320 field1997;

    @ObfuscatedName("fx.s")
    public static int[] field2006;

    @ObfuscatedName("fu.gf")
    public static class334[] field2010;

    @ObfuscatedName("fu.z")
    public static boolean field2011;

    @ObfuscatedName("fj.r")
    public static String field2017;

    @ObfuscatedName("fz.nw")
    public static int field2023;

    @ObfuscatedName("fz.bf")
    public static String field2026;

    @ObfuscatedName("fz.em")
    public static int field2027;

    @ObfuscatedName("fz.h")
    public static class82 field2028;

    @ObfuscatedName("fs.x")
    public static String field2040;

    @ObfuscatedName("fs.m")
    public static String field2042;

    @ObfuscatedName("fs.fq")
    public static class305 field2046;

    @ObfuscatedName("fh.d")
    public static File field2049;

    @ObfuscatedName("fe.m")
    public static File field2058;

    @ObfuscatedName("fb.t")
    public static int field2062;

    @ObfuscatedName("gg.v")
    public static int field2098;

    @ObfuscatedName("w.rv")
    public static int field21;

    @ObfuscatedName("gx.jz")
    public static class227 field2107;

    @ObfuscatedName("ab.qb")
    public static class115 field212;

    @ObfuscatedName("ab.c")
    public static String field213;

    @ObfuscatedName("ar.rt")
    public static int field218;

    @ObfuscatedName("w.s")
    public static class334 field22;

    @ObfuscatedName("gv.ic")
    public static int field2207;

    @ObfuscatedName("ar.hj")
    public static int field221;

    @ObfuscatedName("ar.sw")
    public static class248 field223;

    @ObfuscatedName("af.he")
    public static int field231;

    @ObfuscatedName("gb.e")
    public static class154 field2319;

    @ObfuscatedName("gq.lc")
    public static int field2344;

    @ObfuscatedName("gq.h")
    public static class352[] field2346;

    @ObfuscatedName("gs.w")
    public static Thread field2350;

    @ObfuscatedName("gk.bo")
    public static class240 field2354;

    @ObfuscatedName("gl.lr")
    public static class227 field2369;

    @ObfuscatedName("gy.hm")
    public static int field2373;

    @ObfuscatedName("gd.bh")
    public static String field2391;

    @ObfuscatedName("gr.k")
    public static class244 field2404;

    @ObfuscatedName("gr.m")
    public static class244 field2405;

    @ObfuscatedName("gr.d")
    public static class208 field2406;

    @ObfuscatedName("gr.v")
    public static class244 field2408;

    @ObfuscatedName("gr.q")
    public static int field2409;

    @ObfuscatedName("gr.p")
    public static class213 field2411;

    @ObfuscatedName("gr.av")
    public static class332 field2412;

    @ObfuscatedName("gr.z")
    public static int field2414;

    @ObfuscatedName("gi.cn")
    public static class73 field2435;

    @ObfuscatedName("at.ix")
    public static int field244;

    @ObfuscatedName("al.no")
    public static int field246;

    @ObfuscatedName("hz.dl")
    public static class315 field2469;

    @ObfuscatedName("al.bh")
    public static class334[] field247;

    @ObfuscatedName("al.lt")
    public static int field249;

    @ObfuscatedName("hs.as")
    public static class329 field2496;

    @ObfuscatedName("w.t")
    public static byte[][] field25;

    @ObfuscatedName("hl.dh")
    public static class246 field2500;

    @ObfuscatedName("hl.z")
    public static class335 field2502;

    @ObfuscatedName("hw.dd")
    public static boolean field2507;

    @ObfuscatedName("hd.x")
    public static class219 field2514;

    @ObfuscatedName("hd.t")
    public static int field2515;

    @ObfuscatedName("hd.ac")
    public static int field2516;

    @ObfuscatedName("ht.s")
    public static class244 field2522;

    @ObfuscatedName("ht.i")
    public static String[] field2523;

    @ObfuscatedName("ht.j")
    public static int field2526;

    @ObfuscatedName("hj.w")
    public static int field2531;

    @ObfuscatedName("hj.cd")
    public static char field2532;

    @ObfuscatedName("hk.e")
    public static short[][] field2536;

    @ObfuscatedName("hk.t")
    public static short[] field2540;

    @ObfuscatedName("hk.dt")
    public static class246 field2544;

    @ObfuscatedName("hm.dn")
    public static class246 field2550;

    @ObfuscatedName("he.t")
    public static class244 field2560;

    @ObfuscatedName("he.p")
    public static class244 field2561;

    @ObfuscatedName("he.z")
    public static boolean[] field2584;

    @ObfuscatedName("as.al")
    public static Image field266;

    @ObfuscatedName("as.gn")
    public static int[] field268;

    @ObfuscatedName("he.q")
    public static class227[][] field2694;

    @ObfuscatedName("w.hz")
    public static class335[] field27;

    @ObfuscatedName("am.da")
    public static class246 field271;

    @ObfuscatedName("hn.m")
    public static class176 field2711;

    @ObfuscatedName("hu.dc")
    public static class246 field2718;

    @ObfuscatedName("hv.hh")
    public static class334[] field2752;

    @ObfuscatedName("hx.rx")
    public static int field2760;

    @ObfuscatedName("au.fz")
    public static class153 field277;

    @ObfuscatedName("au.c")
    public static int field278;

    @ObfuscatedName("au.q")
    public static short[] field279;

    @ObfuscatedName("ao.dp")
    public static class246 field294;

    @ObfuscatedName("ao.ss")
    public static class318 field296;

    @ObfuscatedName("z.ml")
    public static int field30;

    @ObfuscatedName("av.hf")
    public static class334[] field307;

    @ObfuscatedName("av.jh")
    public static class227 field308;

    @ObfuscatedName("ig.ju")
    public static class227 field3083;

    @ObfuscatedName("ir.de")
    public static class246 field3113;

    @ObfuscatedName("ak.df")
    public static class246 field312;

    @ObfuscatedName("ix.re")
    public static int field3127;

    @ObfuscatedName("ak.jd")
    public static class129 field315;

    @ObfuscatedName("ak.al")
    public static class329 field316;

    @ObfuscatedName("ia.k")
    public static long field3166;

    @ObfuscatedName("ia.g")
    public static class310 field3178;

    @ObfuscatedName("ia.x")
    public static class315 field3181;

    @ObfuscatedName("ia.u")
    public static class243 field3182;

    @ObfuscatedName("aa.ag")
    public static client field319;

    @ObfuscatedName("iq.x")
    public static class244 field3200;

    @ObfuscatedName("ik.m")
    public static int field3205;

    @ObfuscatedName("ik.hs")
    public static class335[] field3206;

    @ObfuscatedName("ik.x")
    public static class244 field3209;

    @ObfuscatedName("io.m")
    public static class252[] field3220;

    @ObfuscatedName("io.x")
    public static class244 field3226;

    @ObfuscatedName("it.x")
    public static class244 field3233;

    @ObfuscatedName("iw.m")
    public static class244 field3237;

    @ObfuscatedName("iw.x")
    public static class244 field3245;

    @ObfuscatedName("if.x")
    public static class244 field3258;

    @ObfuscatedName("ib.k")
    public static int field3261;

    @ObfuscatedName("ib.m")
    public static class244 field3267;

    @ObfuscatedName("ib.x")
    public static class244 field3269;

    @ObfuscatedName("ib.bq")
    public static int field3272;

    @ObfuscatedName("id.x")
    public static class244 field3274;

    @ObfuscatedName("ax.dx")
    public static class246 field329;

    @ObfuscatedName("iu.x")
    public static class244 field3292;

    @ObfuscatedName("is.x")
    public static class244 field3298;

    @ObfuscatedName("jq.x")
    public static class244 field3306;

    @ObfuscatedName("jq.p")
    public static int[] field3307;

    @ObfuscatedName("jq.bv")
    public static class334 field3309;

    @ObfuscatedName("jq.w")
    public static int[] field3310;

    @ObfuscatedName("jq.gc")
    public static int[] field3311;

    @ObfuscatedName("ax.fp")
    public static class175 field332;

    @ObfuscatedName("ji.x")
    public static class244 field3320;

    @ObfuscatedName("jv.m")
    public static class244 field3323;

    @ObfuscatedName("jv.x")
    public static class244 field3325;

    @ObfuscatedName("ax.dy")
    public static class246 field334;

    @ObfuscatedName("jw.m")
    public static class244 field3345;

    @ObfuscatedName("jw.k")
    public static class244 field3346;

    @ObfuscatedName("ax.sq")
    public static int field336;

    @ObfuscatedName("ax.my")
    public static int field337;

    @ObfuscatedName("ax.la")
    public static class92 field339;

    @ObfuscatedName("z.eu")
    public static int field34;

    @ObfuscatedName("je.q")
    public static int field3457;

    @ObfuscatedName("jj.m")
    public static class244 field3467;

    @ObfuscatedName("jj.x")
    public static class244 field3469;

    @ObfuscatedName("az.aq")
    public static String field348;

    @ObfuscatedName("jn.x")
    public static class244 field3505;

    @ObfuscatedName("jc.nq")
    public static int field3527;

    @ObfuscatedName("jc.o")
    public static String field3528;

    @ObfuscatedName("ja.k")
    public static int field3553;

    @ObfuscatedName("jp.ex")
    public static class246 field3556;

    @ObfuscatedName("jf.ep")
    public static int field3575;

    @ObfuscatedName("jr.pc")
    public static boolean field3583;

    @ObfuscatedName("js.k")
    public static int[] field3594;

    @ObfuscatedName("jb.bt")
    public static class200 field3598;

    @ObfuscatedName("z.el")
    public static class322 field36;

    @ObfuscatedName("km.ab")
    public static FontMetrics field3608;

    @ObfuscatedName("ky.rc")
    public static int field3627;

    @ObfuscatedName("kk.k")
    public static class244 field3640;

    @ObfuscatedName("ks.hy")
    public static class335[] field3651;

    @ObfuscatedName("kc.v")
    public static int field3654;

    @ObfuscatedName("ka.do")
    public static class246 field3665;

    @ObfuscatedName("aj.qd")
    public static class115 field368;

    @ObfuscatedName("aj.dj")
    public static class175 field369;

    @ObfuscatedName("kh.e")
    public static class334[] field3691;

    @ObfuscatedName("kp.x")
    public static long field3699;

    @ObfuscatedName("kp.m")
    public static long field3700;

    @ObfuscatedName("kl.z")
    public static int[] field3716;

    @ObfuscatedName("kl.kv")
    public static class76 field3718;

    @ObfuscatedName("kl.t")
    public static byte[][][] field3723;

    @ObfuscatedName("ad.hc")
    public static class335[] field374;

    @ObfuscatedName("ac.lq")
    public static int field377;

    @ObfuscatedName("lq.e")
    public static class334[] field3785;

    @ObfuscatedName("lq.qh")
    public static class335 field3791;

    @ObfuscatedName("lg.v")
    public static class244 field3803;

    @ObfuscatedName("lf.z")
    public static int[] field3813;

    @ObfuscatedName("ll.m")
    public static class244 field3837;

    @ObfuscatedName("lh.w")
    public static class81[] field3838;

    @ObfuscatedName("ah.lo")
    public static int field384;

    @ObfuscatedName("li.ap")
    public static int field3864;

    @ObfuscatedName("li.an")
    public static int[] field3865;

    @ObfuscatedName("li.ai")
    public static int field3866;

    @ObfuscatedName("ag.sr")
    public static short[] field387;

    @ObfuscatedName("lj.a")
    public static String[] field3872;

    @ObfuscatedName("lu.e")
    public static class117 field3879;

    @ObfuscatedName("ls.x")
    public static int field3901;

    @ObfuscatedName("ls.d")
    public static int[] field3902;

    @ObfuscatedName("ls.k")
    public static int field3903;

    @ObfuscatedName("ls.m")
    public static int field3904;

    @ObfuscatedName("ls.v")
    public static int[] field3905;

    @ObfuscatedName("ls.q")
    public static int[] field3906;

    @ObfuscatedName("lr.t")
    public static int field3908;

    @ObfuscatedName("mq.gd")
    public static int field3960;

    @ObfuscatedName("mi.bk")
    public static class241 field3966;

    @ObfuscatedName("mw.m")
    public static class244 field4030;

    @ObfuscatedName("mj.t")
    public static int[] field4035;

    @ObfuscatedName("aw.n")
    public static class305 field404;

    @ObfuscatedName("aw.h")
    public static int[][][] field405;

    @ObfuscatedName("mr.w")
    public static byte[][][] field4062;

    @ObfuscatedName("mr.br")
    public static class334[] field4065;

    @ObfuscatedName("mf.q")
    public static int[] field4068;

    @ObfuscatedName("bf.gr")
    public static class335[] field407;

    @ObfuscatedName("mf.m")
    public static String field4070;

    @ObfuscatedName("mf.d")
    public static int field4071;

    @ObfuscatedName("mf.x")
    public static Applet field4073;

    @ObfuscatedName("mf.k")
    public static int field4074;

    @ObfuscatedName("bf.ef")
    public static int field408;

    @ObfuscatedName("t.g")
    public static int field41;

    @ObfuscatedName("bo.gv")
    public static int[] field442;

    @ObfuscatedName("be.x")
    public static class244 field454;

    @ObfuscatedName("be.dw")
    public static long field456;

    @ObfuscatedName("bt.g")
    public static int field466;

    @ObfuscatedName("br.n")
    public static class180 field473;

    @ObfuscatedName("br.ay")
    public static GarbageCollectorMXBean field493;

    @ObfuscatedName("br.aj")
    public static boolean field503;

    @ObfuscatedName("e.ls")
    public static class227 field53;

    @ObfuscatedName("bq.ge")
    public static int field530;

    @ObfuscatedName("bq.ey")
    public static SecureRandom field533;

    @ObfuscatedName("ba.d")
    public static byte[][][] field539;

    @ObfuscatedName("ba.v")
    public static byte[][][] field540;

    @ObfuscatedName("ba.q")
    public static byte[][][] field541;

    @ObfuscatedName("ba.t")
    public static int[][] field546;

    @ObfuscatedName("ba.qs")
    public static class108 field554;

    @ObfuscatedName("ba.n")
    public static int[] field555;

    @ObfuscatedName("bs.bq")
    public static class334 field573;

    @ObfuscatedName("bs.fr")
    public static class303 field575;

    @ObfuscatedName("bp.gx")
    public static int field586;

    @ObfuscatedName("bp.bg")
    public static class335[] field589;

    @ObfuscatedName("bp.fm")
    public static int field591;

    @ObfuscatedName("bm.v")
    public static int field596;

    @ObfuscatedName("bm.pd")
    public static class295 field597;

    @ObfuscatedName("u.l")
    public static class310 field60;

    @ObfuscatedName("h.gq")
    public static class143 field61;

    @ObfuscatedName("bb.km")
    public static int field611;

    @ObfuscatedName("by.at")
    public static String field634;

    @ObfuscatedName("bj.hp")
    public static int field639;

    @ObfuscatedName("h.hk")
    public static int field64;

    @ObfuscatedName("h.rb")
    public static int field65;

    @ObfuscatedName("bl.v")
    public static class334 field675;

    @ObfuscatedName("bl.sb")
    public static class83 field677;

    @ObfuscatedName("bl.n")
    public static boolean field678;

    @ObfuscatedName("g.nl")
    public static class227[] field71;

    @ObfuscatedName("g.er")
    public static int field72;

    @ObfuscatedName("client.ig")
    public static int field757;

    @ObfuscatedName("i.e")
    public static int field76;

    @ObfuscatedName("i.bt")
    public static class334[] field80;

    @ObfuscatedName("i.sx")
    public static class16 field85;

    @ObfuscatedName("a.gy")
    public static int field92;

    @ObfuscatedName("client.rj")
    public static int field926;

    @ObfuscatedName("b.q")
    public static class244 field95;

    @ObfuscatedName("client.mq")
    public static int field958;

    @ObfuscatedName("ei.x(Ljava/lang/String;I)Ljava/io/File;")
    public static File method2826(String arg0) {
        if (!class179.field2057) {
            throw new RuntimeException("");
        }
        File var1 = (File) class179.field2060.get(arg0);
        if (var1 != null) {
            return var1;
        }
        File var2 = new File(field2058, arg0);
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
            class179.field2060.put(arg0, var2);
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

    @ObfuscatedName("hw.x(I)J")
    public static final synchronized long method3668() {
        long var0 = System.currentTimeMillis();
        if (var0 < field3699) {
            field3700 += field3699 - var0;
        }
        field3699 = var0;
        return field3700 + var0;
    }

    @ObfuscatedName("ia.x(Lkb;Lln;I)Lln;")
    public static final class326 method4011(class310 arg0, class326 arg1) {
        int var2 = arg0.method5137();
        if (arg1 == null) {
            int var3 = class198.method3666(var2);
            arg1 = new class326(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method5137() == 1;
            int var6 = arg0.method5264();
            class190 var7;
            if (var5) {
                var7 = new class186(arg0.method5257());
            } else {
                var7 = new class189(arg0.method5142());
            }
            arg1.method5514(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("hx.m(IS)Lii;")
    public static class240 method3848(int arg0) {
        class240[] var1 = class240.method3427();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class240 var3 = var1[var2];
            if (var3.field3102 == arg0) {
                return var3;
            }
        }
        return null;
    }

    @ObfuscatedName("ek.m(Lkj;I)V")
    public static void method3120(class309 arg0) {
        class107 var1 = (class107) class106.field1342.method4488();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field3711;
        arg0.method5279(var1.field1348);
        for (int var3 = 0; var3 < var1.field1354; var3++) {
            if (var1.field1351[var3] == 0) {
                try {
                    int var4 = var1.field1349[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field1350[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method5121(0);
                        arg0.method5279(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field1350[var3];
                        var7.setInt((Object) null, var1.field1352[var3]);
                        arg0.method5121(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field1350[var3];
                        int var9 = var8.getModifiers();
                        arg0.method5121(0);
                        arg0.method5279(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field1353[var3];
                        byte[][] var11 = var1.field1347[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method5121(0);
                        } else if (var15 instanceof Number) {
                            arg0.method5121(1);
                            arg0.method5119(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method5121(2);
                            arg0.method5217((String) var15);
                        } else {
                            arg0.method5121(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field1353[var3];
                        int var17 = var16.getModifiers();
                        arg0.method5121(0);
                        arg0.method5279(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method5121(-10);
                } catch (InvalidClassException var31) {
                    arg0.method5121(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method5121(-12);
                } catch (OptionalDataException var33) {
                    arg0.method5121(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method5121(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method5121(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method5121(-16);
                } catch (SecurityException var37) {
                    arg0.method5121(-17);
                } catch (IOException var38) {
                    arg0.method5121(-18);
                } catch (NullPointerException var39) {
                    arg0.method5121(-19);
                } catch (Exception var40) {
                    arg0.method5121(-20);
                } catch (Throwable var41) {
                    arg0.method5121(-21);
                }
            } else {
                arg0.method5121(var1.field1351[var3]);
            }
        }
        arg0.method5141(var2);
        var1.method3355();
    }

    @ObfuscatedName("e.m(Lln;ILjava/lang/String;S)Ljava/lang/String;")
    public static String method95(class326 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class186 var3 = (class186) arg0.method5519((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2111;
        }
    }

    @ObfuscatedName("ep.m(IIII)Lce;")
    public static class102 method3103(int arg0, int arg1, int arg2) {
        int var3 = (arg1 << 8) + arg0;
        class102 var5 = (class102) class102.field1308.method3146((long) (var3 << 16));
        class102 var6;
        if (var5 == null) {
            String var7 = String.valueOf(var3);
            int var8 = field312.method3885(var7);
            if (var8 == -1) {
                var6 = null;
            } else {
                label47: {
                    byte[] var9 = field312.method3876(var8);
                    if (var9 != null) {
                        if (var9.length <= 1) {
                            var6 = null;
                            break label47;
                        }
                        class102 var10 = class102.method1090(var9);
                        if (var10 != null) {
                            class102.field1308.method3152(var10, (long) (var3 << 16));
                            var6 = var10;
                            break label47;
                        }
                    }
                    var6 = null;
                }
            }
        } else {
            var6 = var5;
        }
        if (var6 != null) {
            return var6;
        }
        int var12 = class232.method807(arg2, arg0);
        class102 var13 = (class102) class102.field1308.method3146((long) (var12 << 16));
        class102 var14;
        if (var13 == null) {
            String var15 = String.valueOf(var12);
            int var16 = field312.method3885(var15);
            if (var16 == -1) {
                var14 = null;
            } else {
                byte[] var17 = field312.method3876(var16);
                if (var17 != null) {
                    if (var17.length <= 1) {
                        var14 = null;
                        return var14 == null ? null : var14;
                    }
                    class102 var18 = class102.method1090(var17);
                    if (var18 != null) {
                        class102.field1308.method3152(var18, (long) (var12 << 16));
                        var14 = var18;
                        return var14 == null ? null : var14;
                    }
                }
                var14 = null;
            }
        } else {
            var14 = var13;
        }
        return var14 == null ? null : var14;
    }

    @ObfuscatedName("kb.k(J)Ljava/lang/String;")
    public static String method5354(long arg0) {
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
                char var8 = class299.field3645[(int) (var6 - arg0 * 37L)];
                if (var8 == '_') {
                    int var9 = var5.length() - 1;
                    var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                    var8 = 160;
                }
                var5.append(var8);
            }
            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
        }
    }

    @ObfuscatedName("eo.m(IIB)V")
    public static void method2688(int arg0, int arg1) {
        class259 var2 = class259.method3694(arg0);
        int var3 = var2.field3294;
        int var4 = var2.field3291;
        int var5 = var2.field3288;
        int var6 = class222.field2524[var5 - var4];
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var7 = var6 << var4;
        class222.field2527[var3] = class222.field2527[var3] & ~var7 | arg1 << var4 & var7;
    }

    @ObfuscatedName("bs.d(Ljava/lang/String;ILjava/lang/String;B)Z")
    public static boolean method1118(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!class61.field463.startsWith("win")) {
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
            } catch (Throwable var14) {
                return false;
            }
        } else if (arg1 == 1) {
            try {
                Applet var6 = class61.field462;
                Object[] var7 = new Object[] { (new URL(class61.field462.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                class61.field462.getAppletContext().showDocument(new URL(class61.field462.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class57.method794(class61.field462, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                class61.field462.getAppletContext().showDocument(new URL(class61.field462.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("by.k(IIIII)V")
    public static void method1144(int arg0, int arg1, int arg2, int arg3) {
        for (class85 var4 = (class85) class85.field1098.method4559(); var4 != null; var4 = (class85) class85.field1098.method4577()) {
            if (var4.field1103 != -1 || var4.field1096 != null) {
                int var5 = 0;
                if (arg1 > var4.field1111) {
                    var5 += arg1 - var4.field1111;
                } else if (arg1 < var4.field1100) {
                    var5 += var4.field1100 - arg1;
                }
                if (arg2 > var4.field1101) {
                    var5 += arg2 - var4.field1101;
                } else if (arg2 < var4.field1099) {
                    var5 += var4.field1099 - arg2;
                }
                if (var5 - 64 > var4.field1107 || client.field759 == 0 || var4.field1097 != arg0) {
                    if (var4.field1109 != null) {
                        field554.method2196(var4.field1109);
                        var4.field1109 = null;
                    }
                    if (var4.field1104 != null) {
                        field554.method2196(var4.field1104);
                        var4.field1104 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field759 * (var4.field1107 - var5) / var4.field1107;
                    if (var4.field1109 != null) {
                        var4.field1109.method2429(var6);
                    } else if (var4.field1103 >= 0) {
                        class111 var7 = class111.method2261(field3665, var4.field1103, 0);
                        if (var7 != null) {
                            class113 var8 = var7.method2258().method2300(field149);
                            class123 var9 = class123.method2424(var8, 100, var6);
                            var9.method2454(-1);
                            field554.method2195(var9);
                            var4.field1109 = var9;
                        }
                    }
                    if (var4.field1104 != null) {
                        var4.field1104.method2429(var6);
                        if (!var4.field1104.method3356()) {
                            var4.field1104 = null;
                        }
                    } else if (var4.field1096 != null && (var4.field1108 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1096.length);
                        class111 var11 = class111.method2261(field3665, var4.field1096[var10], 0);
                        if (var11 != null) {
                            class113 var12 = var11.method2258().method2300(field149);
                            class123 var13 = class123.method2424(var12, 100, var6);
                            var13.method2454(0);
                            field554.method2195(var13);
                            var4.field1104 = var13;
                            var4.field1108 = var4.field1105 + (int) (Math.random() * (double) (var4.field1106 - var4.field1105));
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.m(III)V")
    public static void method312(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (class81.field1048[var5] != arg0) {
                var2[var4] = class81.field1048[var5];
                var3[var4] = class81.field1049[var5];
                var4++;
            }
        }
        class81.field1048 = var2;
        class81.field1049 = var3;
        class81.method3199(field3838, 0, field3838.length - 1, class81.field1048, class81.field1049);
    }

    @ObfuscatedName("hk.m(Lbb;II)V")
    public static void method3756(class72 arg0, int arg1) {
        Object[] var2 = arg0.field603;
        class102 var4;
        if (class304.method250(arg0.field612)) {
            field1257 = (class51) var2[0];
            class252 var3 = class252.method249(field1257.field392);
            var4 = method3103(arg0.field612, var3.field3213, var3.field3214);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class102.method439(var5);
        }
        if (var4 == null) {
            return;
        }
        field1118 = 0;
        field1120 = 0;
        int var6 = -1;
        int[] var7 = var4.field1298;
        int[] var8 = var4.field1301;
        byte var9 = -1;
        class86.field1112 = 0;
        class86.field1126 = false;
        try {
            field3594 = new int[var4.field1303];
            int var10 = 0;
            field1130 = new String[var4.field1302];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field604;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field601;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field613 == null ? -1 : arg0.field613.field2568;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field606;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field613 == null ? -1 : arg0.field613.field2710;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field607 == null ? -1 : arg0.field607.field2568;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field607 == null ? -1 : arg0.field607.field2710;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field610;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field609;
                    }
                    field3594[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field608;
                    }
                    field1130[var11++] = var14;
                }
            }
            int var15 = 0;
            class86.field1128 = arg0.field605;
            while (true) {
                var15++;
                if (var15 > arg1) {
                    throw new RuntimeException();
                }
                var6++;
                int var53 = var7[var6];
                if (var53 >= 100) {
                    boolean var43;
                    if (var4.field1301[var6] == 1) {
                        var43 = true;
                    } else {
                        var43 = false;
                    }
                    int var44 = class86.method3432(var53, var4, var43);
                    switch(var44) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var53 == 0) {
                    class86.field1116[++field1118 - 1] = var8[var6];
                } else if (var53 == 1) {
                    int var16 = var8[var6];
                    class86.field1116[++field1118 - 1] = class222.field2527[var16];
                } else if (var53 == 2) {
                    int var17 = var8[var6];
                    class222.field2527[var17] = class86.field1116[--field1118];
                    client.method223(var17);
                } else if (var53 == 3) {
                    class86.field1119[++field1120 - 1] = var4.field1300[var6];
                } else if (var53 == 6) {
                    var6 += var8[var6];
                } else if (var53 == 7) {
                    field1118 -= 2;
                    if (class86.field1116[field1118] != class86.field1116[field1118 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 8) {
                    field1118 -= 2;
                    if (class86.field1116[field1118] == class86.field1116[field1118 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 9) {
                    field1118 -= 2;
                    if (class86.field1116[field1118] < class86.field1116[field1118 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 10) {
                    field1118 -= 2;
                    if (class86.field1116[field1118] > class86.field1116[field1118 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 21) {
                    if (class86.field1112 == 0) {
                        return;
                    }
                    class66 var18 = class86.field1122[--class86.field1112];
                    var4 = var18.field558;
                    var7 = var4.field1298;
                    var8 = var4.field1301;
                    var6 = var18.field559;
                    field3594 = var18.field560;
                    field1130 = var18.field561;
                } else if (var53 == 25) {
                    int var19 = var8[var6];
                    class86.field1116[++field1118 - 1] = class222.method2013(var19);
                } else if (var53 == 27) {
                    int var20 = var8[var6];
                    method2688(var20, class86.field1116[--field1118]);
                } else if (var53 == 31) {
                    field1118 -= 2;
                    if (class86.field1116[field1118] <= class86.field1116[field1118 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 32) {
                    field1118 -= 2;
                    if (class86.field1116[field1118] >= class86.field1116[field1118 + 1]) {
                        var6 += var8[var6];
                    }
                } else if (var53 == 33) {
                    class86.field1116[++field1118 - 1] = field3594[var8[var6]];
                } else if (var53 == 34) {
                    field3594[var8[var6]] = class86.field1116[--field1118];
                } else if (var53 == 35) {
                    class86.field1119[++field1120 - 1] = field1130[var8[var6]];
                } else if (var53 == 36) {
                    field1130[var8[var6]] = class86.field1119[--field1120];
                } else if (var53 == 37) {
                    int var21 = var8[var6];
                    field1120 -= var21;
                    String var22 = class301.method3574(class86.field1119, field1120, var21);
                    class86.field1119[++field1120 - 1] = var22;
                } else if (var53 == 38) {
                    field1118--;
                } else if (var53 == 39) {
                    field1120--;
                } else if (var53 == 40) {
                    int var23 = var8[var6];
                    class102 var24 = class102.method439(var23);
                    int[] var25 = new int[var24.field1303];
                    String[] var26 = new String[var24.field1302];
                    for (int var27 = 0; var27 < var24.field1307; var27++) {
                        var25[var27] = class86.field1116[field1118 - var24.field1307 + var27];
                    }
                    for (int var28 = 0; var28 < var24.field1297; var28++) {
                        var26[var28] = class86.field1119[field1120 - var24.field1297 + var28];
                    }
                    field1118 -= var24.field1307;
                    field1120 -= var24.field1297;
                    class66 var29 = new class66();
                    var29.field558 = var4;
                    var29.field559 = var6;
                    var29.field560 = field3594;
                    var29.field561 = field1130;
                    class86.field1122[++class86.field1112 - 1] = var29;
                    var4 = var24;
                    var7 = var24.field1298;
                    var8 = var24.field1301;
                    var6 = -1;
                    field3594 = var25;
                    field1130 = var26;
                } else if (var53 == 42) {
                    class86.field1116[++field1118 - 1] = field1984.method2053(var8[var6]);
                } else if (var53 == 43) {
                    field1984.method2052(var8[var6], class86.field1116[--field1118]);
                } else if (var53 == 44) {
                    int var30 = var8[var6] >> 16;
                    int var31 = var8[var6] & 0xFFFF;
                    int var32 = class86.field1116[--field1118];
                    if (var32 < 0 || var32 > 5000) {
                        throw new RuntimeException();
                    }
                    class86.field1115[var30] = var32;
                    byte var33 = -1;
                    if (var31 == 105) {
                        var33 = 0;
                    }
                    for (int var34 = 0; var34 < var32; var34++) {
                        class86.field1123[var30][var34] = var33;
                    }
                } else if (var53 == 45) {
                    int var35 = var8[var6];
                    int var36 = class86.field1116[--field1118];
                    if (var36 < 0 || var36 >= class86.field1115[var35]) {
                        throw new RuntimeException();
                    }
                    class86.field1116[++field1118 - 1] = class86.field1123[var35][var36];
                } else if (var53 == 46) {
                    int var37 = var8[var6];
                    field1118 -= 2;
                    int var38 = class86.field1116[field1118];
                    if (var38 < 0 || var38 >= class86.field1115[var37]) {
                        throw new RuntimeException();
                    }
                    class86.field1123[var37][var38] = class86.field1116[field1118 + 1];
                } else if (var53 == 47) {
                    String var39 = field1984.method2057(var8[var6]);
                    if (var39 == null) {
                        var39 = class234.field2765;
                    }
                    class86.field1119[++field1120 - 1] = var39;
                } else if (var53 == 48) {
                    field1984.method2079(var8[var6], class86.field1119[--field1120]);
                } else if (var53 == 49) {
                    String var40 = field1984.method2077(var8[var6]);
                    class86.field1119[++field1120 - 1] = var40;
                } else if (var53 == 50) {
                    field1984.method2085(var8[var6], class86.field1119[--field1120]);
                } else if (var53 == 60) {
                    class326 var41 = var4.field1305[var8[var6]];
                    class189 var42 = (class189) var41.method5519((long) class86.field1116[--field1118]);
                    if (var42 != null) {
                        var6 += var42.field2115;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var51) {
            StringBuilder var46 = new StringBuilder(30);
            var46.append("").append(var4.field2117).append(" ");
            for (int var47 = class86.field1112 - 1; var47 >= 0; var47--) {
                var46.append("").append(class86.field1122[var47].field558.field2117).append(" ");
            }
            var46.append("").append(var9);
            class351.method3842(var46.toString(), var51);
        } finally {
            if (class86.field1126) {
                class86.field1127 = true;
                client.method3817();
                class86.field1127 = false;
                class86.field1126 = false;
            }
        }
    }

    @ObfuscatedName("am.e(B)[Lla;")
    public static class335[] method444() {
        class335[] var0 = new class335[field3901];
        for (int var1 = 0; var1 < field3901; var1++) {
            class335 var2 = var0[var1] = new class335();
            var2.field3894 = field3904;
            var2.field3891 = field3903;
            var2.field3889 = field3902[var1];
            var2.field3893 = field3310[var1];
            var2.field3890 = field3905[var1];
            var2.field3900 = field3906[var1];
            int var3 = var2.field3900 * var2.field3890;
            byte[] var4 = field25[var1];
            var2.field3897 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var2.field3897[var5] = field3813[var4[var5] & 0xFF];
            }
        }
        field3902 = null;
        field3310 = null;
        field3905 = null;
        field3906 = null;
        field3813 = null;
        field25 = (byte[][]) null;
        return var0;
    }

    @ObfuscatedName("w.s(IIB)I")
    public static final int method47(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @ObfuscatedName("kn.n(III)I")
    public static final int method4903(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var2 = (arg0 & 0x7F) * arg1 / 128;
            if (var2 < 2) {
                var2 = 2;
            } else if (var2 > 126) {
                var2 = 126;
            }
            return (arg0 & 0xFF80) + var2;
        }
    }

    @ObfuscatedName("ag.e(B)V")
    public static void method731() {
        class95.field1221 = class95.field1221.trim();
        if (class95.field1221.length() == 0) {
            class95.method1684(class234.field3024, class234.field3025, class234.field3026);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method582("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class310 var4 = new class310(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field3710, var4.field3711, 1000 - var4.field3711);
                if (var5 == -1) {
                    var4.field3711 = 0;
                    long var8 = var4.method5143();
                    var6 = var8;
                    break;
                }
                var4.field3711 += var5;
                if (var4.field3711 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var41) {
            var6 = 0L;
        }
        byte var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            String var14 = class95.field1221;
            Random var15 = new Random();
            class310 var16 = new class310(128);
            class310 var17 = new class310(128);
            int[] var18 = new int[] { var15.nextInt(), var15.nextInt(), (int) (var6 >> 32), (int) var6 };
            var16.method5121(10);
            for (int var19 = 0; var19 < 4; var19++) {
                var16.method5279(var15.nextInt());
            }
            var16.method5279(var18[0]);
            var16.method5279(var18[1]);
            var16.method5119(var6);
            var16.method5119(0L);
            for (int var20 = 0; var20 < 4; var20++) {
                var16.method5279(var15.nextInt());
            }
            var16.method5160(class90.field1159, class90.field1156);
            var17.method5121(10);
            for (int var21 = 0; var21 < 3; var21++) {
                var17.method5279(var15.nextInt());
            }
            var17.method5119(var15.nextLong());
            var17.method5125(var15.nextLong());
            if (client.field721 == null) {
                byte[] var22 = class177.method1935();
                var17.method5186(var22, 0, var22.length);
            } else {
                var17.method5186(client.field721, 0, client.field721.length);
            }
            var17.method5119(var15.nextLong());
            var17.method5160(class90.field1159, class90.field1156);
            int var23 = class310.method3851(var14);
            if (var23 % 8 != 0) {
                var23 += 8 - var23 % 8;
            }
            class310 var24 = new class310(var23);
            var24.method5217(var14);
            var24.field3711 = var23;
            var24.method5126(var18);
            class310 var25 = new class310(var24.field3711 + var17.field3711 + var16.field3711 + 5);
            var25.method5121(2);
            var25.method5121(var16.field3711);
            var25.method5186(var16.field3710, 0, var16.field3711);
            var25.method5121(var17.field3711);
            var25.method5186(var17.field3710, 0, var17.field3711);
            var25.method5122(var24.field3711);
            var25.method5186(var24.field3710, 0, var24.field3711);
            String var26 = class300.method3863(var25.field3710);
            byte var33;
            try {
                URL var27 = new URL(client.method582("services", false) + "m=accountappeal/login.ws");
                URLConnection var28 = var27.openConnection();
                var28.setDoInput(true);
                var28.setDoOutput(true);
                var28.setConnectTimeout(5000);
                OutputStreamWriter var29 = new OutputStreamWriter(var28.getOutputStream());
                var29.write("data2=" + class350.method1031(var26) + "&dest=" + class350.method1031("passwordchoice.ws"));
                var29.flush();
                InputStream var30 = var28.getInputStream();
                class310 var31 = new class310(new byte[1000]);
                while (true) {
                    int var32 = var30.read(var31.field3710, var31.field3711, 1000 - var31.field3711);
                    if (var32 == -1) {
                        var29.close();
                        var30.close();
                        String var34 = new String(var31.field3710);
                        if (var34.startsWith("OFFLINE")) {
                            var33 = 4;
                        } else if (var34.startsWith("WRONG")) {
                            var33 = 7;
                        } else if (var34.startsWith("RELOAD")) {
                            var33 = 3;
                        } else if (var34.startsWith("Not permitted for social network accounts.")) {
                            var33 = 6;
                        } else {
                            var31.method5288(var18);
                            while (var31.field3711 > 0 && var31.field3710[var31.field3711 - 1] == 0) {
                                var31.field3711--;
                            }
                            String var35 = new String(var31.field3710, 0, var31.field3711);
                            boolean var36;
                            if (var35 == null) {
                                var36 = false;
                            } else {
                                label104: {
                                    try {
                                        new URL(var35);
                                    } catch (MalformedURLException var39) {
                                        var36 = false;
                                        break label104;
                                    }
                                    var36 = true;
                                }
                            }
                            if (var36) {
                                class61.method2135(var35, true, false);
                                var33 = 2;
                            } else {
                                var33 = 5;
                            }
                        }
                        break;
                    }
                    var31.field3711 += var32;
                    if (var31.field3711 >= 1000) {
                        var33 = 5;
                        break;
                    }
                }
            } catch (Throwable var40) {
                var40.printStackTrace();
                var33 = 5;
            }
            var13 = var33;
        }
        switch(var13) {
            case 2:
                class95.method1684(class234.field3027, class234.field2899, class234.field2808);
                class95.field1205 = 6;
                break;
            case 3:
                class95.method1684(class234.field3030, class234.field3031, class234.field2868);
                break;
            case 4:
                class95.method1684(class234.field3033, class234.field2982, class234.field3035);
                break;
            case 5:
                class95.method1684(class234.field2973, class234.field2817, class234.field3038);
                break;
            case 6:
                class95.method1684(class234.field3039, class234.field2840, class234.field3041);
                break;
            case 7:
                class95.method1684(class234.field3042, class234.field3043, class234.field3034);
        }
    }

    @ObfuscatedName("jw.af(ILce;ZI)I")
    public static int method4318(int arg0, class102 arg1, boolean arg2) {
        if (arg0 == 4000) {
            field1118 -= 2;
            int var3 = class86.field1116[field1118];
            int var4 = class86.field1116[field1118 + 1];
            class86.field1116[++field1118 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            field1118 -= 2;
            int var5 = class86.field1116[field1118];
            int var6 = class86.field1116[field1118 + 1];
            class86.field1116[++field1118 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            field1118 -= 2;
            int var7 = class86.field1116[field1118];
            int var8 = class86.field1116[field1118 + 1];
            class86.field1116[++field1118 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            field1118 -= 2;
            int var9 = class86.field1116[field1118];
            int var10 = class86.field1116[field1118 + 1];
            class86.field1116[++field1118 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = class86.field1116[--field1118];
            class86.field1116[++field1118 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = class86.field1116[--field1118];
            class86.field1116[++field1118 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            field1118 -= 5;
            int var13 = class86.field1116[field1118];
            int var14 = class86.field1116[field1118 + 1];
            int var15 = class86.field1116[field1118 + 2];
            int var16 = class86.field1116[field1118 + 3];
            int var17 = class86.field1116[field1118 + 4];
            class86.field1116[++field1118 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            field1118 -= 2;
            int var18 = class86.field1116[field1118];
            int var19 = class86.field1116[field1118 + 1];
            class86.field1116[++field1118 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            field1118 -= 2;
            int var20 = class86.field1116[field1118];
            int var21 = class86.field1116[field1118 + 1];
            class86.field1116[++field1118 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            field1118 -= 2;
            int var22 = class86.field1116[field1118];
            int var23 = class86.field1116[field1118 + 1];
            class86.field1116[++field1118 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            field1118 -= 2;
            int var24 = class86.field1116[field1118];
            int var25 = class86.field1116[field1118 + 1];
            class86.field1116[++field1118 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            field1118 -= 2;
            int var26 = class86.field1116[field1118];
            int var27 = class86.field1116[field1118 + 1];
            class86.field1116[++field1118 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            field1118 -= 2;
            int var28 = class86.field1116[field1118];
            int var29 = class86.field1116[field1118 + 1];
            if (var28 == 0) {
                class86.field1116[++field1118 - 1] = 0;
            } else {
                class86.field1116[++field1118 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            field1118 -= 2;
            int var30 = class86.field1116[field1118];
            int var31 = class86.field1116[field1118 + 1];
            if (var30 == 0) {
                class86.field1116[++field1118 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    class86.field1116[++field1118 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    class86.field1116[++field1118 - 1] = var30;
                    break;
                case 2:
                    class86.field1116[++field1118 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    class86.field1116[++field1118 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    class86.field1116[++field1118 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    class86.field1116[++field1118 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            field1118 -= 2;
            int var32 = class86.field1116[field1118];
            int var33 = class86.field1116[field1118 + 1];
            class86.field1116[++field1118 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            field1118 -= 2;
            int var34 = class86.field1116[field1118];
            int var35 = class86.field1116[field1118 + 1];
            class86.field1116[++field1118 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            field1118 -= 3;
            long var36 = (long) class86.field1116[field1118];
            long var38 = (long) class86.field1116[field1118 + 1];
            long var40 = (long) class86.field1116[field1118 + 2];
            class86.field1116[++field1118 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eq.gg(I)V")
    public static final void method2697() {
        if (client.field755 == 0) {
            int var0 = field3718.field984;
            int var1 = field3718.field974;
            if (field1455 - var0 < -500 || field1455 - var0 > 500 || field2207 - var1 < -500 || field2207 - var1 > 500) {
                field1455 = var0;
                field2207 = var1;
            }
            if (field1455 != var0) {
                field1455 += (var0 - field1455) / 16;
            }
            if (field2207 != var1) {
                field2207 += (var1 - field2207) / 16;
            }
            int var2 = field1455 >> 7;
            int var3 = field2207 >> 7;
            int var4 = client.method4641(field1455, field2207, field611);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = field611;
                        if (var8 < 3 && (class65.field536[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class65.field550[var8][var6][var7];
                        if (var9 > var5) {
                            var5 = var9;
                        }
                    }
                }
            }
            int var10 = var5 * 192;
            if (var10 > 98048) {
                var10 = 98048;
            }
            if (var10 < 32768) {
                var10 = 32768;
            }
            if (var10 > client.field942) {
                client.field942 += (var10 - client.field942) / 24;
            } else if (var10 < client.field942) {
                client.field942 += (var10 - client.field942) / 80;
            }
            field757 = client.method4641(field3718.field984, field3718.field974, field611) - client.field756;
        } else if (client.field755 == 1) {
            if (client.field771 && field3718 != null) {
                int var11 = field3718.field1029[0];
                int var12 = field3718.field1030[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    field1455 = field3718.field984;
                    int var13 = client.method4641(field3718.field984, field3718.field974, field611) - client.field756;
                    if (var13 < field757) {
                        field757 = var13;
                    }
                    field2207 = field3718.field974;
                    client.field771 = false;
                }
            }
            short var14 = -1;
            if (class55.field427[33]) {
                var14 = 0;
            } else if (class55.field427[49]) {
                var14 = 1024;
            }
            if (class55.field427[48]) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (class55.field427[50]) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (class55.field427[35]) {
                var15 = -1;
            } else if (class55.field427[51]) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = class55.field427[81] ? client.field891 : client.field761;
                var16 = var17 * 16;
                client.field725 = var14;
                client.field760 = var15;
            }
            if (client.field758 < var16) {
                client.field758 += var16 / 8;
                if (client.field758 > var16) {
                    client.field758 = var16;
                }
            } else if (client.field758 > var16) {
                client.field758 = client.field758 * 9 / 10;
            }
            if (client.field758 > 0) {
                int var18 = client.field758 / 16;
                if (client.field725 >= 0) {
                    int var19 = client.field725 - field231 & 0x7FF;
                    int var20 = class140.field1795[var19];
                    int var21 = class140.field1796[var19];
                    field1455 += var18 * var20 / 65536;
                    field2207 += var18 * var21 / 65536;
                }
                if (client.field760 != 0) {
                    field757 += client.field760 * var18;
                    if (field757 > 0) {
                        field757 = 0;
                    }
                }
            } else {
                client.field725 = -1;
                client.field760 = -1;
            }
            if (class55.field427[13]) {
                client.field762.method2171(class197.method3105(class193.field2307, client.field762.field1341));
                client.field755 = 0;
            }
        }
        if (class64.field522 == 4 && field2507) {
            int var22 = class64.field519 - client.field754;
            client.field752 = var22 * 2;
            client.field754 = var22 == -1 || var22 == 1 ? class64.field519 : (client.field754 + class64.field519) / 2;
            int var23 = client.field741 - class64.field518;
            client.field709 = var23 * 2;
            client.field741 = var23 == -1 || var23 == 1 ? class64.field518 : (client.field741 + class64.field518) / 2;
        } else {
            if (class55.field427[96]) {
                client.field709 += (-24 - client.field709) / 2;
            } else if (class55.field427[97]) {
                client.field709 += (24 - client.field709) / 2;
            } else {
                client.field709 /= 2;
            }
            if (class55.field427[98]) {
                client.field752 += (12 - client.field752) / 2;
            } else if (class55.field427[99]) {
                client.field752 += (-12 - client.field752) / 2;
            } else {
                client.field752 /= 2;
            }
            client.field754 = class64.field519;
            client.field741 = class64.field518;
        }
        client.field910 = client.field709 / 2 + client.field910 & 0x7FF;
        client.field825 += client.field752 / 2;
        if (client.field825 < 128) {
            client.field825 = 128;
        }
        if (client.field825 > 383) {
            client.field825 = 383;
        }
    }

    @ObfuscatedName("hi.gv(Ljava/lang/String;ZI)V")
    public static final void method3663(String arg0, boolean arg1) {
        if (!client.field796) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = field141.method4984(arg0, 250);
        int var6 = field141.method5045(arg0, 250) * 13;
        class331.method5606(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class331.method5691(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        field141.method4995(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < client.field884; var11++) {
            if (client.field951[var11] + client.field734[var11] > var7 && client.field951[var11] < var7 + var9 && client.field940[var11] + client.field737[var11] > var8 && client.field940[var11] < var8 + var10) {
                client.field680[var11] = true;
            }
        }
        if (arg1) {
            field2412.method846(0, 0);
        } else {
            client.method715(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("eb.hw(IIIIIIIIII)V")
    public static final void method2910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class78 var9 = null;
        for (class78 var10 = (class78) client.field698.method4559(); var10 != null; var10 = (class78) client.field698.method4577()) {
            if (var10.field963 == arg0 && var10.field961 == arg1 && var10.field962 == arg2 && var10.field960 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class78();
            var9.field963 = arg0;
            var9.field960 = arg3;
            var9.field961 = arg1;
            var9.field962 = arg2;
            client.method314(var9);
            client.field698.method4580(var9);
        }
        var9.field965 = arg4;
        var9.field968 = arg5;
        var9.field967 = arg6;
        var9.field966 = arg7;
        var9.field970 = arg8;
    }

    @ObfuscatedName("an.hk(I)V")
    public static final void method274() {
        class309 var0 = client.field762.field1338;
        var0.method5086();
        int var1 = var0.method5085(8);
        if (var1 < client.field723) {
            for (int var2 = var1; var2 < client.field723; var2++) {
                client.field919[++client.field802 - 1] = client.field724[var2];
            }
        }
        if (var1 > client.field723) {
            throw new RuntimeException("");
        }
        client.field723 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = client.field724[var3];
            class89 var5 = client.field722[var4];
            int var6 = var0.method5085(1);
            if (var6 == 0) {
                client.field724[++client.field723 - 1] = var4;
                var5.field1006 = client.field690;
            } else {
                int var7 = var0.method5085(2);
                if (var7 == 0) {
                    client.field724[++client.field723 - 1] = var4;
                    var5.field1006 = client.field690;
                    client.field726[++client.field852 - 1] = var4;
                } else if (var7 == 1) {
                    client.field724[++client.field723 - 1] = var4;
                    var5.field1006 = client.field690;
                    int var8 = var0.method5085(3);
                    var5.method1947(var8, (byte) 1);
                    int var9 = var0.method5085(1);
                    if (var9 == 1) {
                        client.field726[++client.field852 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    client.field724[++client.field723 - 1] = var4;
                    var5.field1006 = client.field690;
                    int var10 = var0.method5085(3);
                    var5.method1947(var10, (byte) 2);
                    int var11 = var0.method5085(3);
                    var5.method1947(var11, (byte) 2);
                    int var12 = var0.method5085(1);
                    if (var12 == 1) {
                        client.field726[++client.field852 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    client.field919[++client.field802 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("e.im(IS)Z")
    public static final boolean method94(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = client.field780[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("aw.jc(B)Z")
    public static boolean method737() {
        return client.field828;
    }

    @ObfuscatedName("bi.ju(Lhe;IIB)V")
    public static final void method1224(class227 arg0, int arg1, int arg2) {
        if (client.field854 != null || client.field817 || arg0 == null || client.method4146(arg0) == null) {
            return;
        }
        client.field854 = arg0;
        client.field855 = client.method4146(arg0);
        client.field856 = arg1;
        client.field929 = arg2;
        field2023 = 0;
        client.field865 = false;
        int var3 = client.method345();
        if (var3 == -1) {
            return;
        }
        field339 = new class92();
        field339.field1177 = client.field777[var3];
        field339.field1173 = client.field857[var3];
        field339.field1174 = client.field780[var3];
        field339.field1175 = client.field859[var3];
        field339.field1176 = client.field823[var3];
    }

    @ObfuscatedName("h.kl(IIIZI)V")
    public static void method118(int arg0, int arg1, int arg2, boolean arg3) {
        class197 var4 = class197.method3105(class193.field2225, client.field762.field1341);
        var4.field2339.method5290(arg2);
        var4.field2339.method5279(arg3 ? client.field763 : 0);
        var4.field2339.method5172(arg0);
        var4.field2339.method5174(arg1);
        client.field762.method2171(var4);
    }
}
