package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.SecureRandom;
import java.util.concurrent.ScheduledExecutorService;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("q.dj")
    public static class247 field10;

    @ObfuscatedName("s.fi")
    public static int field101;

    @ObfuscatedName("s.st")
    public static class332 field102;

    @ObfuscatedName("bf.gr")
    public static class328[] field1032;

    @ObfuscatedName("be.dg")
    public static class247 field1056;

    @ObfuscatedName("bv.w")
    public static String[] field1061;

    @ObfuscatedName("bv.x")
    public static int field1066;

    @ObfuscatedName("bw.d")
    public static int field1077;

    @ObfuscatedName("bw.fr")
    public static int field1088;

    @ObfuscatedName("bw.k")
    public static class327 field1089;

    @ObfuscatedName("t.db")
    public static class247 field111;

    @ObfuscatedName("t.i")
    public static class229 field112;

    @ObfuscatedName("cy.dh")
    public static class247 field1120;

    @ObfuscatedName("cy.d")
    public static int[] field1121;

    @ObfuscatedName("t.ec")
    public static SecureRandom field113;

    @ObfuscatedName("cs.iz")
    public static int field1131;

    @ObfuscatedName("cm.e")
    public static int field1136;

    @ObfuscatedName("t.hq")
    public static int field114;

    @ObfuscatedName("cj.ay")
    public static String field1143;

    @ObfuscatedName("cj.bo")
    public static class327[] field1145;

    @ObfuscatedName("cj.sp")
    public static short[] field1148;

    @ObfuscatedName("cu.f")
    public static boolean field1150;

    @ObfuscatedName("cu.g")
    public static class328 field1153;

    @ObfuscatedName("cu.e")
    public static int field1154;

    @ObfuscatedName("cu.do")
    public static class247 field1156;

    @ObfuscatedName("cu.o")
    public static class327 field1157;

    @ObfuscatedName("cu.d")
    public static class327 field1164;

    @ObfuscatedName("cu.ai")
    public static String field1170;

    @ObfuscatedName("q.fo")
    public static class302 field12;

    @ObfuscatedName("cb.ck")
    public static class64 field1209;

    @ObfuscatedName("cn.bu")
    public static class327 field1217;

    @ObfuscatedName("cn.jn")
    public static class120 field1219;

    @ObfuscatedName("cn.dy")
    public static class247 field1220;

    @ObfuscatedName("cq.y")
    public static class202 field1240;

    @ObfuscatedName("cw.x")
    public static class106 field1254;

    @ObfuscatedName("y.sn")
    public static int field127;

    @ObfuscatedName("cf.df")
    public static class171 field1277;

    @ObfuscatedName("cl.pg")
    public static class297 field1298;

    @ObfuscatedName("q.ee")
    public static int field13;

    @ObfuscatedName("y.p")
    public static int[] field131;

    @ObfuscatedName("cd.av")
    public static int[] field1313;

    @ObfuscatedName("cd.ar")
    public static int[] field1319;

    @ObfuscatedName("cd.l")
    public static int field1320;

    @ObfuscatedName("cd.e")
    public static int field1321;

    @ObfuscatedName("cd.p")
    public static float[] field1322;

    @ObfuscatedName("cd.d")
    public static int field1323;

    @ObfuscatedName("cd.k")
    public static class99[] field1324;

    @ObfuscatedName("cd.n")
    public static class103[] field1325;

    @ObfuscatedName("cd.a")
    public static class115[] field1327;

    @ObfuscatedName("cd.z")
    public static boolean[] field1330;

    @ObfuscatedName("cd.x")
    public static int field1331;

    @ObfuscatedName("cd.c")
    public static float[] field1335;

    @ObfuscatedName("cd.r")
    public static float[] field1336;

    @ObfuscatedName("cd.v")
    public static float[] field1338;

    @ObfuscatedName("cd.ag")
    public static float[] field1339;

    @ObfuscatedName("cd.aq")
    public static float[] field1340;

    @ObfuscatedName("cd.aj")
    public static float[] field1341;

    @ObfuscatedName("cd.j")
    public static int[] field1342;

    @ObfuscatedName("cd.g")
    public static byte[] field1343;

    @ObfuscatedName("cd.i")
    public static class110[] field1345;

    @ObfuscatedName("ca.x")
    public static int[] field1356;

    @ObfuscatedName("ca.d")
    public static int[] field1362;

    @ObfuscatedName("ca.k")
    public static boolean[] field1363;

    @ObfuscatedName("co.u")
    public static boolean field1370;

    @ObfuscatedName("h.n")
    public static int[] field139;

    @ObfuscatedName("dx.jg")
    public static int field1394;

    @ObfuscatedName("h.gc")
    public static class327[] field140;

    @ObfuscatedName("dt.r")
    public static int field1402;

    @ObfuscatedName("h.e")
    public static class327 field141;

    @ObfuscatedName("di.l")
    public static float field1443;

    @ObfuscatedName("di.e")
    public static int field1445;

    @ObfuscatedName("dk.lm")
    public static class229 field1498;

    @ObfuscatedName("dk.o")
    public static int field1500;

    @ObfuscatedName("dl.af")
    public static client field1509;

    @ObfuscatedName("dr.ao")
    public static int field1513;

    @ObfuscatedName("do.my")
    public static int field1589;

    @ObfuscatedName("do.sm")
    public static class7 field1590;

    @ObfuscatedName("dh.a")
    public static int[] field1609;

    @ObfuscatedName("b.by")
    public static String field163;

    @ObfuscatedName("c.bn")
    public static class242 field166;

    @ObfuscatedName("du.bd")
    public static int field1702;

    @ObfuscatedName("du.bc")
    public static int field1703;

    @ObfuscatedName("du.bo")
    public static int field1704;

    @ObfuscatedName("c.eb")
    public static class247 field171;

    @ObfuscatedName("dm.u")
    public static int field1718;

    @ObfuscatedName("dm.g")
    public static int field1719;

    @ObfuscatedName("c.z")
    public static class202 field172;

    @ObfuscatedName("dm.l")
    public static int field1720;

    @ObfuscatedName("dm.k")
    public static int field1721;

    @ObfuscatedName("dq.pe")
    public static boolean field1731;

    @ObfuscatedName("dq.rq")
    public static int field1732;

    @ObfuscatedName("et.a")
    public static int field1739;

    @ObfuscatedName("et.j")
    public static int field1744;

    @ObfuscatedName("et.n")
    public static int field1746;

    @ObfuscatedName("et.i")
    public static int field1747;

    @ObfuscatedName("et.z")
    public static int field1749;

    @ObfuscatedName("et.t")
    public static int field1750;

    @ObfuscatedName("et.s")
    public static int field1751;

    @ObfuscatedName("et.y")
    public static int field1753;

    @ObfuscatedName("et.c")
    public static class140 field1759;

    @ObfuscatedName("eb.ah")
    public static class320 field1770;

    @ObfuscatedName("ek.x")
    public static int field1777;

    @ObfuscatedName("ek.dc")
    public static class247 field1778;

    @ObfuscatedName("em.t")
    public static int field1783;

    @ObfuscatedName("em.bo")
    public static boolean[][] field1791;

    @ObfuscatedName("em.j")
    public static int field1795;

    @ObfuscatedName("em.s")
    public static int field1796;

    @ObfuscatedName("em.aq")
    public static int field1797;

    @ObfuscatedName("em.v")
    public static int field1798;

    @ObfuscatedName("em.h")
    public static int field1799;

    @ObfuscatedName("em.c")
    public static int field1801;

    @ObfuscatedName("em.r")
    public static int field1802;

    @ObfuscatedName("em.ag")
    public static int field1805;

    @ObfuscatedName("em.aj")
    public static int field1807;

    @ObfuscatedName("em.bx")
    public static int field1810;

    @ObfuscatedName("em.av")
    public static int field1816;

    @ObfuscatedName("em.b")
    public static int field1819;

    @ObfuscatedName("em.by")
    public static int field1820;

    @ObfuscatedName("em.p")
    public static int field1831;

    @ObfuscatedName("em.y")
    public static int field1838;

    @ObfuscatedName("em.bu")
    public static int field1842;

    @ObfuscatedName("em.bm")
    public static int field1843;

    @ObfuscatedName("em.bl")
    public static int field1844;

    @ObfuscatedName("em.br")
    public static int field1845;

    @ObfuscatedName("ed.i")
    public static class244 field1847;

    @ObfuscatedName("ed.m")
    public static long field1848;

    @ObfuscatedName("ej.jv")
    public static class229 field1862;

    @ObfuscatedName("el.gm")
    public static class328 field1864;

    @ObfuscatedName("el.x")
    public static int field1867;

    @ObfuscatedName("en.o")
    public static Thread field1868;

    @ObfuscatedName("en.bc")
    public static class327[] field1869;

    @ObfuscatedName("p.go")
    public static int field191;

    @ObfuscatedName("eh.fy")
    public static int field1910;

    @ObfuscatedName("eh.ds")
    public static long field1917;

    @ObfuscatedName("eo.u")
    public static int field1921;

    @ObfuscatedName("eo.ak")
    public static class320 field1922;

    @ObfuscatedName("ey.bx")
    public static class327[] field1930;

    @ObfuscatedName("p.dr")
    public static class247 field194;

    @ObfuscatedName("ev.q")
    public static int field1947;

    @ObfuscatedName("p.h")
    public static String field196;

    @ObfuscatedName("fq.fl")
    public static class167 field1966;

    @ObfuscatedName("fq.dk")
    public static class247 field1968;

    @ObfuscatedName("fw.nm")
    public static int field1969;

    @ObfuscatedName("fg.n")
    public static class174 field1975;

    @ObfuscatedName("fg.jh")
    public static class229 field1976;

    @ObfuscatedName("fd.qi")
    public static class111 field1998;

    @ObfuscatedName("f.m")
    public static class245 field2;

    @ObfuscatedName("fh.x")
    public static class245 field2004;

    @ObfuscatedName("fx.q")
    public static int field2011;

    @ObfuscatedName("fx.f")
    public static String field2012;

    @ObfuscatedName("fx.w")
    public static int field2014;

    @ObfuscatedName("fx.m")
    public static Applet field2017;

    @ObfuscatedName("v.kw")
    public static int field202;

    @ObfuscatedName("fz.m")
    public static String field2031;

    @ObfuscatedName("fz.f")
    public static String field2032;

    @ObfuscatedName("fz.qr")
    public static class97 field2033;

    @ObfuscatedName("v.dd")
    public static class247 field204;

    @ObfuscatedName("fs.o")
    public static File field2042;

    @ObfuscatedName("fs.u")
    public static int field2043;

    @ObfuscatedName("ag.rc")
    public static class75 field205;

    @ObfuscatedName("fs.au")
    public static int field2051;

    @ObfuscatedName("fo.f")
    public static File field2054;

    @ObfuscatedName("fo.ro")
    public static int field2057;

    @ObfuscatedName("fa.lu")
    public static class229 field2065;

    @ObfuscatedName("fb.bm")
    public static class327 field2068;

    @ObfuscatedName("fe.l")
    public static int field2126;

    @ObfuscatedName("fe.e")
    public static byte[][][] field2129;

    @ObfuscatedName("ag.eq")
    public static int field216;

    @ObfuscatedName("ge.ix")
    public static int field2229;

    @ObfuscatedName("aq.k")
    public static class245 field225;

    @ObfuscatedName("aj.e")
    public static int field233;

    @ObfuscatedName("gs.qh")
    public static int field2332;

    @ObfuscatedName("gf.ge")
    public static int[][] field2352;

    @ObfuscatedName("gq.gv")
    public static class327[] field2366;

    @ObfuscatedName("gd.p")
    public static int field2370;

    @ObfuscatedName("gd.e")
    public static int[][] field2374;

    @ObfuscatedName("go.ck")
    public static char field2380;

    @ObfuscatedName("gy.of")
    public static class91 field2390;

    @ObfuscatedName("gz.ad")
    public static class325 field2396;

    @ObfuscatedName("w.qs")
    public static int field24;

    @ObfuscatedName("gi.g")
    public static int[] field2448;

    @ObfuscatedName("gi.dz")
    public static class247 field2449;

    @ObfuscatedName("ga.eh")
    public static int field2451;

    @ObfuscatedName("ga.f")
    public static long field2453;

    @ObfuscatedName("gx.n")
    public static class302 field2462;

    @ObfuscatedName("gu.et")
    public static class247 field2465;

    @ObfuscatedName("hx.z")
    public static int field2467;

    @ObfuscatedName("hr.dn")
    public static class167 field2481;

    @ObfuscatedName("hg.em")
    public static class313 field2488;

    @ObfuscatedName("o.m")
    public static class245 field25;

    @ObfuscatedName("ar.l")
    public static boolean field250;

    @ObfuscatedName("hd.fc")
    public static long field2502;

    @ObfuscatedName("hf.q")
    public static class245 field2504;

    @ObfuscatedName("hf.u")
    public static class245 field2505;

    @ObfuscatedName("hf.w")
    public static class216 field2506;

    @ObfuscatedName("hf.f")
    public static class245 field2507;

    @ObfuscatedName("hf.ko")
    public static int field2509;

    @ObfuscatedName("ar.g")
    public static int field251;

    @ObfuscatedName("hf.k")
    public static int[] field2510;

    @ObfuscatedName("ar.qw")
    public static int field252;

    @ObfuscatedName("ar.bd")
    public static class328[] field253;

    @ObfuscatedName("ha.he")
    public static int field2551;

    @ObfuscatedName("hq.qg")
    public static int field2589;

    @ObfuscatedName("hv.h")
    public static int field2599;

    @ObfuscatedName("hi.g")
    public static short[] field2609;

    @ObfuscatedName("ay.u")
    public static byte[][][] field261;

    @ObfuscatedName("hj.e")
    public static short[] field2627;

    @ObfuscatedName("ho.g")
    public static class229[][] field2634;

    @ObfuscatedName("ho.l")
    public static boolean[] field2635;

    @ObfuscatedName("ho.e")
    public static class245 field2636;

    @ObfuscatedName("ho.d")
    public static class245 field2649;

    @ObfuscatedName("ay.gj")
    public static class327[] field266;

    @ObfuscatedName("ah.j")
    public static String[] field276;

    @ObfuscatedName("ho.f")
    public static class253[] field2787;

    @ObfuscatedName("hz.l")
    public static short[][] field2788;

    @ObfuscatedName("ah.l")
    public static int[] field279;

    @ObfuscatedName("u.n")
    public static boolean field28;

    @ObfuscatedName("hy.az")
    public static boolean field2800;

    @ObfuscatedName("ak.qj")
    public static int field282;

    @ObfuscatedName("hb.sg")
    public static int field2826;

    @ObfuscatedName("hb.av")
    public static Font field2828;

    @ObfuscatedName("hc.ef")
    public static int[] field2832;

    @ObfuscatedName("ak.ka")
    public static int field286;

    @ObfuscatedName("aw.qu")
    public static class104 field294;

    @ObfuscatedName("il.dw")
    public static class247 field3160;

    @ObfuscatedName("ij.ak")
    public static Image field3169;

    @ObfuscatedName("iy.bx")
    public static String field3173;

    @ObfuscatedName("iy.lo")
    public static int field3180;

    @ObfuscatedName("ik.cn")
    public static int field3192;

    @ObfuscatedName("ik.rt")
    public static int field3194;

    @ObfuscatedName("ik.a")
    public static class118[] field3195;

    @ObfuscatedName("ir.au")
    public static GarbageCollectorMXBean field3221;

    @ObfuscatedName("ir.qb")
    public static class104 field3223;

    @ObfuscatedName("ir.di")
    public static class247 field3225;

    @ObfuscatedName("ir.bu")
    public static int field3226;

    @ObfuscatedName("at.gu")
    public static class328[] field323;

    @ObfuscatedName("iq.q")
    public static long field3244;

    @ObfuscatedName("ad.dl")
    public static class247 field326;

    @ObfuscatedName("iq.m")
    public static class171 field3261;

    @ObfuscatedName("iu.n")
    public static int field3266;

    @ObfuscatedName("iu.e")
    public static int[] field3270;

    @ObfuscatedName("ad.gs")
    public static byte[][] field328;

    @ObfuscatedName("ix.f")
    public static int field3283;

    @ObfuscatedName("ix.m")
    public static class245 field3285;

    @ObfuscatedName("ic.m")
    public static class245 field3301;

    @ObfuscatedName("ic.fs")
    public static class300 field3307;

    @ObfuscatedName("iw.m")
    public static class245 field3312;

    @ObfuscatedName("io.f")
    public static class245 field3314;

    @ObfuscatedName("io.m")
    public static class245 field3320;

    @ObfuscatedName("ih.m")
    public static class245 field3337;

    @ObfuscatedName("im.f")
    public static class245 field3339;

    @ObfuscatedName("im.m")
    public static class245 field3347;

    @ObfuscatedName("im.q")
    public static int field3350;

    @ObfuscatedName("ii.f")
    public static class245 field3353;

    @ObfuscatedName("ii.m")
    public static class245 field3366;

    @ObfuscatedName("ii.lx")
    public static int field3368;

    @ObfuscatedName("ap.w")
    public static class327[] field337;

    @ObfuscatedName("ia.m")
    public static class245 field3374;

    @ObfuscatedName("ia.u")
    public static int[] field3375;

    @ObfuscatedName("jb.m")
    public static class245 field3378;

    @ObfuscatedName("jq.m")
    public static class245 field3385;

    @ObfuscatedName("jw.m")
    public static class245 field3388;

    @ObfuscatedName("jm.f")
    public static class245 field3397;

    @ObfuscatedName("g.z")
    public static int field34;

    @ObfuscatedName("jm.m")
    public static class245 field3402;

    @ObfuscatedName("jm.q")
    public static class245 field3403;

    @ObfuscatedName("as.ey")
    public static int field342;

    @ObfuscatedName("jr.f")
    public static class245 field3422;

    @ObfuscatedName("as.du")
    public static class247 field347;

    @ObfuscatedName("jr.q")
    public static class245 field3470;

    @ObfuscatedName("g.hs")
    public static int field35;

    @ObfuscatedName("as.ha")
    public static int field350;

    @ObfuscatedName("jv.g")
    public static class245 field3500;

    @ObfuscatedName("jv.u")
    public static class245 field3512;

    @ObfuscatedName("as.c")
    public static String field352;

    @ObfuscatedName("ju.b")
    public static String field3532;

    @ObfuscatedName("jz.m")
    public static class245 field3549;

    @ObfuscatedName("jz.f")
    public static class245 field3560;

    @ObfuscatedName("jf.m")
    public static class245 field3578;

    @ObfuscatedName("jh.m")
    public static class245 field3582;

    @ObfuscatedName("jh.f")
    public static class245 field3583;

    @ObfuscatedName("an.ra")
    public static int field359;

    @ObfuscatedName("jh.q")
    public static class245 field3599;

    @ObfuscatedName("jn.by")
    public static class327 field3616;

    @ObfuscatedName("jx.ne")
    public static class229[] field3623;

    @ObfuscatedName("ji.se")
    public static class249 field3646;

    @ObfuscatedName("an.bk")
    public static class335 field366;

    @ObfuscatedName("ji.fp")
    public static class171 field3667;

    @ObfuscatedName("ks.at")
    public static String field3698;

    @ObfuscatedName("kd.fz")
    public static class144 field3705;

    @ObfuscatedName("kp.q")
    public static int[] field3717;

    @ObfuscatedName("kq.l")
    public static ScheduledExecutorService field3718;

    @ObfuscatedName("kn.x")
    public static class145 field3729;

    @ObfuscatedName("kz.o")
    public static byte[][][] field3745;

    @ObfuscatedName("kz.l")
    public static class328 field3748;

    @ObfuscatedName("kz.sc")
    public static class176 field3749;

    @ObfuscatedName("kt.x")
    public static class327[] field3765;

    @ObfuscatedName("ki.m")
    public static class194 field3779;

    @ObfuscatedName("an.gx")
    public static class328[] field379;

    @ObfuscatedName("kc.g")
    public static byte[][][] field3791;

    @ObfuscatedName("kc.n")
    public static class107 field3795;

    @ObfuscatedName("kw.n")
    public static class327 field3798;

    @ObfuscatedName("kw.gn")
    public static int[] field3801;

    @ObfuscatedName("kl.o")
    public static int field3803;

    @ObfuscatedName("an.x")
    public static class327[] field381;

    @ObfuscatedName("ka.e")
    public static int field3812;

    @ObfuscatedName("an.i")
    public static class327 field382;

    @ObfuscatedName("az.fu")
    public static class302 field384;

    @ObfuscatedName("lw.su")
    public static class74 field3868;

    @ObfuscatedName("az.jf")
    public static class229 field387;

    @ObfuscatedName("lf.aq")
    public static int[] field3871;

    @ObfuscatedName("lf.aj")
    public static int field3873;

    @ObfuscatedName("lf.av")
    public static int field3874;

    @ObfuscatedName("lp.ca")
    public static boolean field3880;

    @ObfuscatedName("lj.d")
    public static boolean field3887;

    @ObfuscatedName("ao.jk")
    public static class67 field389;

    @ObfuscatedName("lr.m")
    public static int field3908;

    @ObfuscatedName("lr.f")
    public static int field3909;

    @ObfuscatedName("ao.s")
    public static String[] field391;

    @ObfuscatedName("lr.q")
    public static int field3910;

    @ObfuscatedName("lr.w")
    public static int[] field3911;

    @ObfuscatedName("lr.o")
    public static int[] field3912;

    @ObfuscatedName("lr.l")
    public static int[] field3913;

    @ObfuscatedName("lr.e")
    public static byte[][] field3914;

    @ObfuscatedName("ao.gk")
    public static int field392;

    @ObfuscatedName("lc.w")
    public static File field4035;

    @ObfuscatedName("af.ff")
    public static int field405;

    @ObfuscatedName("af.ei")
    public static String field413;

    @ObfuscatedName("ba.m")
    public static class168 field419;

    @ObfuscatedName("ba.l")
    public static int field422;

    @ObfuscatedName("ba.kl")
    public static int field425;

    @ObfuscatedName("ba.s")
    public static int field428;

    @ObfuscatedName("bb.gb")
    public static int[] field465;

    @ObfuscatedName("bb.hz")
    public static int field474;

    @ObfuscatedName("bs.nb")
    public static int field479;

    @ObfuscatedName("bq.w")
    public static byte[][][] field483;

    @ObfuscatedName("bq.a")
    public static int[][][] field485;

    @ObfuscatedName("bq.l")
    public static byte[][][] field495;

    @ObfuscatedName("x.l")
    public static int field50;

    @ObfuscatedName("bk.g")
    public static int[] field504;

    @ObfuscatedName("bd.x")
    public static short[][] field505;

    @ObfuscatedName("bd.er")
    public static int field509;

    @ObfuscatedName("bd.gw")
    public static int[] field510;

    @ObfuscatedName("bd.u")
    public static class327 field511;

    @ObfuscatedName("bd.pf")
    public static class311 field513;

    @ObfuscatedName("bc.o")
    public static class72[] field517;

    @ObfuscatedName("bc.dm")
    public static class247 field519;

    @ObfuscatedName("bo.ar")
    public static FontMetrics field526;

    @ObfuscatedName("x.rg")
    public static int field53;

    @ObfuscatedName("bo.sz")
    public static class334 field533;

    @ObfuscatedName("bx.o")
    public static int field536;

    @ObfuscatedName("bx.px")
    public static class328 field538;

    @ObfuscatedName("by.fv")
    public static class302 field543;

    @ObfuscatedName("by.hb")
    public static int field557;

    @ObfuscatedName("bu.no")
    public static int field563;

    @ObfuscatedName("bu.hy")
    public static int field569;

    @ObfuscatedName("bm.i")
    public static int[] field579;

    @ObfuscatedName("bl.gf")
    public static class134 field582;

    @ObfuscatedName("bl.n")
    public static class98 field583;

    @ObfuscatedName("d.gz")
    public static class328 field59;

    @ObfuscatedName("d.lr")
    public static class83 field60;

    @ObfuscatedName("br.gi")
    public static class328[] field615;

    @ObfuscatedName("k.hl")
    public static int field63;

    @ObfuscatedName("n.n")
    public static class229 field65;

    @ObfuscatedName("client.eo")
    public static int field660;

    @ObfuscatedName("i.af")
    public static int field70;

    @ObfuscatedName("i.x")
    public static int[] field73;

    @ObfuscatedName("i.k")
    public static class221 field75;

    @ObfuscatedName("z.gt")
    public static class328[] field78;

    @ObfuscatedName("z.j")
    public static class42 field79;

    @ObfuscatedName("z.bs")
    public static class241 field80;

    @ObfuscatedName("z.si")
    public static long field82;

    @ObfuscatedName("j.dv")
    public static class247 field85;

    @ObfuscatedName("j.a")
    public static class73 field86;

    @ObfuscatedName("j.ol")
    public static class170 field87;

    @ObfuscatedName("j.ga")
    public static class328[] field89;

    @ObfuscatedName("s.dq")
    public static class247 field95;

    @ObfuscatedName("bg.gl")
    public static byte[][] field982;

    @ObfuscatedName("jn.m([Ljava/lang/CharSequence;III)Ljava/lang/String;")
    public static String method4939(CharSequence[] arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ir.m(Lgr;Llh;I)Llh;")
    public static final class317 method4176(class202 arg0, class317 arg1) {
        int var2 = arg0.method3551();
        if (arg1 == null) {
            int var3 = class207.method1594(var2);
            arg1 = new class317(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3551() == 1;
            int var6 = arg0.method3421();
            class186 var7;
            if (var5) {
                var7 = new class182(arg0.method3426());
            } else {
                var7 = new class185(arg0.method3620());
            }
            arg1.method5383(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("bi.m(B)V")
    public static void method1533() {
        class323.field3870 = new class272();
    }

    @ObfuscatedName("bv.m(II)Ljw;")
    public static class263 method1814(int arg0) {
        class263 var1 = (class263) class263.field3387.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field3388.method4156(8, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4542(new class202(var2));
        }
        class263.field3387.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.f(Lhx;I)V")
    public static void method386(class209 arg0) {
        class322 var1 = (class322) class323.field3870.method4823();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field2439;
        arg0.method3422(var1.field3860);
        for (int var3 = 0; var3 < var1.field3863; var3++) {
            if (var1.field3867[var3] == 0) {
                try {
                    int var4 = var1.field3862[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field3864[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method3565(0);
                        arg0.method3422(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field3864[var3];
                        var7.setInt((Object) null, var1.field3865[var3]);
                        arg0.method3565(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field3864[var3];
                        int var9 = var8.getModifiers();
                        arg0.method3565(0);
                        arg0.method3422(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field3866[var3];
                        byte[][] var11 = var1.field3861[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method3565(0);
                        } else if (var15 instanceof Number) {
                            arg0.method3565(1);
                            arg0.method3558(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method3565(2);
                            arg0.method3591((String) var15);
                        } else {
                            arg0.method3565(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field3866[var3];
                        int var17 = var16.getModifiers();
                        arg0.method3565(0);
                        arg0.method3422(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method3565(-10);
                } catch (InvalidClassException var31) {
                    arg0.method3565(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method3565(-12);
                } catch (OptionalDataException var33) {
                    arg0.method3565(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method3565(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method3565(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method3565(-16);
                } catch (SecurityException var37) {
                    arg0.method3565(-17);
                } catch (IOException var38) {
                    arg0.method3565(-18);
                } catch (NullPointerException var39) {
                    arg0.method3565(-19);
                } catch (Exception var40) {
                    arg0.method3565(-20);
                } catch (Throwable var41) {
                    arg0.method3565(-21);
                }
            } else {
                arg0.method3565(var1.field3867[var3]);
            }
        }
        arg0.method3441(var2);
        var1.method3306();
    }

    @ObfuscatedName("hf.q(Ljava/lang/CharSequence;IZI)Z")
    public static boolean method3786(CharSequence arg0, int arg1, boolean arg2) {
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("");
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

    @ObfuscatedName("el.q(Ljava/lang/String;ILjava/lang/String;I)Z")
    public static boolean method2979(String arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            try {
                if (!class51.field404.startsWith("win")) {
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
                Applet var6 = class51.field411;
                Object[] var7 = new Object[] { (new URL(class51.field411.getCodeBase(), arg0)).toString() };
                Object var8 = JSObject.getWindow(var6).call(arg2, var7);
                return var8 != null;
            } catch (Throwable var15) {
                return false;
            }
        } else if (arg1 == 2) {
            try {
                class51.field411.getAppletContext().showDocument(new URL(class51.field411.getCodeBase(), arg0), "_blank");
                return true;
            } catch (Exception var16) {
                return false;
            }
        } else if (arg1 == 3) {
            try {
                class47.method713(class51.field411, "loggedout");
            } catch (Throwable var18) {
            }
            try {
                class51.field411.getAppletContext().showDocument(new URL(class51.field411.getCodeBase(), arg0), "_top");
                return true;
            } catch (Exception var17) {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("w.q(I)V")
    public static void method30() {
        while (true) {
            class273 var0 = class246.field3229;
            class243 var1;
            synchronized (class246.field3229) {
                var1 = (class243) class246.field3228.method4891();
            }
            if (var1 == null) {
                return;
            }
            var1.field3190.method4287(var1.field3197, (int) var1.field2139, var1.field3191, false);
        }
    }

    @ObfuscatedName("q.w(Lir;Ljava/lang/String;Ljava/lang/String;B)[Lln;")
    public static class328[] method15(class245 arg0, String arg1, String arg2) {
        int var3 = arg0.method4174(arg1);
        int var4 = arg0.method4175(var3, arg2);
        class328[] var5;
        if (class329.method3998(arg0, var3, var4)) {
            var5 = class329.method3062();
        } else {
            var5 = null;
        }
        return var5;
    }

    @ObfuscatedName("aj.u(Lbt;Lbt;IZI)I")
    public static int method382(class72 arg0, class72 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field992;
            int var5 = arg1.field992;
            if (!arg3) {
                if (var4 == -1) {
                    var4 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var4 - var5;
        } else if (arg2 == 2) {
            return arg0.field995 - arg1.field995;
        } else if (arg2 == 3) {
            if (arg0.field994.equals("-")) {
                if (arg1.field994.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field994.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field994.compareTo(arg1.field994);
            }
        } else if (arg2 == 4) {
            return arg0.method1561() ? (arg1.method1561() ? 0 : 1) : (arg1.method1561() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1559() ? (arg1.method1559() ? 0 : 1) : (arg1.method1559() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1560() ? (arg1.method1560() ? 0 : 1) : (arg1.method1560() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1558() ? (arg1.method1558() ? 0 : 1) : (arg1.method1558() ? -1 : 0);
        } else {
            return arg0.field990 - arg1.field990;
        }
    }

    @ObfuscatedName("f.o(ILcg;ZB)I")
    public static int method8(int arg0, class93 arg1, boolean arg2) {
        int var3 = -1;
        class229 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class77.field1064[--field2126];
            var4 = class229.method3345(var3);
        } else {
            var4 = arg2 ? field112 : field65;
        }
        if (arg0 == 1000) {
            field2126 -= 4;
            var4.field2653 = class77.field1064[field2126];
            var4.field2654 = class77.field1064[field2126 + 1];
            var4.field2633 = class77.field1064[field2126 + 2];
            var4.field2650 = class77.field1064[field2126 + 3];
            client.method272(var4);
            field1509.method1455(var4);
            if (var3 != -1 && var4.field2646 == 0) {
                client.method620(field2634[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            field2126 -= 4;
            var4.field2655 = class77.field1064[field2126];
            var4.field2717 = class77.field1064[field2126 + 1];
            var4.field2651 = class77.field1064[field2126 + 2];
            var4.field2652 = class77.field1064[field2126 + 3];
            client.method272(var4);
            field1509.method1455(var4);
            if (var3 != -1 && var4.field2646 == 0) {
                client.method620(field2634[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = class77.field1064[--field2126] == 1;
            if (var4.field2664 != var5) {
                var4.field2664 = var5;
                client.method272(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2659 = class77.field1064[--field2126] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2658 = class77.field1064[--field2126] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dy.er(I)Llz;")
    public static class334 method2469() {
        return field533;
    }

    @ObfuscatedName("in.eu(I)V")
    public static final void method4142() {
        class134.field1827 = false;
        client.field626 = false;
    }

    @ObfuscatedName("ej.fr(Ljava/lang/String;B)V")
    public static final void method2977(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            field3868.field1022 = !field3868.field1022;
            class74.method230();
            if (field3868.field1022) {
                class92.method202(99, "", "Roofs are now all hidden");
            } else {
                class92.method202(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            client.field639 = !client.field639;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            client.field779 = !client.field779;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            client.field770 = !client.field770;
        }
        if (client.field791 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                field533.field4010 = !field533.field4010;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                client.field639 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                client.field639 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                client.method730();
            }
        }
        class192 var1 = class192.method1750(class189.field2290, client.field669.field1284);
        var1.field2356.method3565(arg0.length() + 1);
        var1.field2356.method3591(arg0);
        client.field669.method2056(var1);
    }

    @ObfuscatedName("eo.gi(IIIIB)V")
    public static final void method2988(int arg0, int arg1, int arg2, int arg3) {
        client.field709 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class90.field1225;
        int[] var8 = class90.field1238;
        for (int var9 = 0; var9 < client.field665 + var7; var9++) {
            class70 var10;
            if (var9 < var7) {
                var10 = client.field738[var8[var9]];
                if (client.field636 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (field389 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = client.field664[client.field666[var9 - var7]];
            }
            client.method624(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (client.field779 && var6 != -1) {
            client.method624(field389, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            client.method624(client.field738[client.field636], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < client.field709; var11++) {
            int var12 = client.field782[var11];
            int var13 = client.field638[var11];
            int var14 = client.field689[var11];
            int var15 = client.field713[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > client.field638[var17] - client.field713[var17] && var13 - var15 < client.field638[var17] + 2 && var12 - var14 < client.field782[var17] + client.field689[var17] && var12 + var14 > client.field782[var17] - client.field689[var17] && client.field638[var17] - client.field713[var17] < var13) {
                        var13 = client.field638[var17] - client.field713[var17];
                        var16 = true;
                    }
                }
            }
            client.field725 = client.field782[var11];
            client.field722 = client.field638[var11] = var13;
            String var18 = client.field718[var11];
            if (client.field786 == 0) {
                int var19 = 16776960;
                if (client.field835[var11] < 6) {
                    var19 = client.field837[client.field835[var11]];
                }
                if (client.field835[var11] == 6) {
                    var19 = client.field720 % 20 < 10 ? 16711680 : 16776960;
                }
                if (client.field835[var11] == 7) {
                    var19 = client.field720 % 20 < 10 ? 255 : 65535;
                }
                if (client.field835[var11] == 8) {
                    var19 = client.field720 % 20 < 10 ? 45056 : 8454016;
                }
                if (client.field835[var11] == 9) {
                    int var20 = 150 - client.field836[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (client.field835[var11] == 10) {
                    int var21 = 150 - client.field836[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (client.field835[var11] == 11) {
                    int var22 = 150 - client.field836[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (client.field716[var11] == 0) {
                    field12.method5210(var18, client.field725 + arg0, client.field722 + arg1, var19, 0);
                }
                if (client.field716[var11] == 1) {
                    field12.method5282(var18, client.field725 + arg0, client.field722 + arg1, var19, 0, client.field720);
                }
                if (client.field716[var11] == 2) {
                    field12.method5212(var18, client.field725 + arg0, client.field722 + arg1, var19, 0, client.field720);
                }
                if (client.field716[var11] == 3) {
                    field12.method5267(var18, client.field725 + arg0, client.field722 + arg1, var19, 0, client.field720, 150 - client.field836[var11]);
                }
                if (client.field716[var11] == 4) {
                    int var23 = (150 - client.field836[var11]) * (field12.method5202(var18) + 100) / 150;
                    class324.method5461(client.field725 + arg0 - 50, arg1, client.field725 + arg0 + 50, arg1 + arg3);
                    field12.method5207(var18, client.field725 + arg0 + 50 - var23, client.field722 + arg1, var19, 0);
                    class324.method5506(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (client.field716[var11] == 5) {
                    int var24 = 150 - client.field836[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class324.method5461(arg0, client.field722 + arg1 - field12.field3762 - 1, arg0 + arg2, client.field722 + arg1 + 5);
                    field12.method5210(var18, client.field725 + arg0, client.field722 + arg1 + var25, var19, 0);
                    class324.method5506(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                field12.method5210(var18, client.field725 + arg0, client.field722 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("af.gc(ZLhx;B)V")
    public static final void method760(boolean arg0, class209 arg1) {
        client.field681 = arg0;
        if (!client.field681) {
            int var2 = arg1.method3457();
            int var3 = arg1.method3574();
            int var4 = arg1.method3530();
            field2352 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    field2352[var5][var6] = arg1.method3620();
                }
            }
            field3801 = new int[var4];
            field510 = new int[var4];
            field465 = new int[var4];
            field328 = new byte[var4][];
            field982 = new byte[var4][];
            boolean var7 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                var7 = true;
            }
            if (var3 / 8 == 48 && var2 / 8 == 148) {
                var7 = true;
            }
            int var8 = 0;
            for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        field3801[var8] = var11;
                        field510[var8] = field1220.method4174("m" + var9 + "_" + var10);
                        field465[var8] = field1220.method4174("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            client.method2037(var3, var2, true);
            return;
        }
        int var12 = arg1.method3574();
        int var13 = arg1.method3457();
        boolean var14 = arg1.method3551() == 1;
        int var15 = arg1.method3530();
        arg1.method3690();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3692(1);
                    if (var19 == 1) {
                        client.field635[var16][var17][var18] = arg1.method3692(26);
                    } else {
                        client.field635[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3713();
        field2352 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                field2352[var20][var21] = arg1.method3620();
            }
        }
        field3801 = new int[var15];
        field510 = new int[var15];
        field465 = new int[var15];
        field328 = new byte[var15][];
        field982 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = client.field635[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (field3801[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            field3801[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            field510[var22] = field1220.method4174("m" + var31 + "_" + var32);
                            field465[var22] = field1220.method4174("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        client.method2037(var13, var12, !var14);
    }

    @ObfuscatedName("ar.hp(B)V")
    public static void method512() {
        client.field759 = 0;
        client.field758 = false;
        client.field776[0] = class236.field3084;
        client.field694[0] = "";
        client.field762[0] = 1006;
        client.field818[0] = false;
        client.field759 = 1;
    }

    @ObfuscatedName("il.im(Lho;I)Z")
    public static final boolean method4143(class229 arg0) {
        if (arg0.field2785 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2785.length; var1++) {
            int var2 = client.method170(arg0, var1);
            int var3 = arg0.field2764[var1];
            if (arg0.field2785[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2785[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2785[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ep.jk(IIIILln;Lhp;I)V")
    public static final void method3083(int arg0, int arg1, int arg2, int arg3, class328 arg4, class223 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            client.method4151(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = client.field692 & 0x7FF;
        int var8 = class131.field1757[var7];
        int var9 = class131.field1760[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2594 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        field1864.method5601(arg5.field2594 / 2 + arg0 - var17 / 2 + var15, arg5.field2595 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("al.ks(I)V")
    public static final void method577() {
        client.field815 = client.field807;
    }

    @ObfuscatedName("es.ke(B)V")
    public static final void method3067() {
        client.field816 = client.field807;
        field1731 = true;
    }

    @ObfuscatedName("ft.ku(II)V")
    public static void method3207(int arg0) {
        client.field778 = arg0;
    }

    @ObfuscatedName("gs.m(B)[Lcj;")
    public static class85[] method3314() {
        return new class85[] { class85.field1141, class85.field1142, class85.field1140, class85.field1144 };
    }
}
