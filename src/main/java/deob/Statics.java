package deob;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.net.Socket;
import java.util.concurrent.ScheduledExecutorService;

public class Statics {

    @ObfuscatedName("i.d")
    public static int[] field10;

    @ObfuscatedName("client.do")
    public static class264 field1004;

    @ObfuscatedName("client.dd")
    public static String field1066;

    @ObfuscatedName("client.mh")
    public static class243[] field1096;

    @ObfuscatedName("client.br")
    public static class336 field1108;

    @ObfuscatedName("client.jn")
    public static int field1131;

    @ObfuscatedName("client.rm")
    public static class266 field1133;

    @ObfuscatedName("bi.fn")
    public static class331[] field1145;

    @ObfuscatedName("bi.bw")
    public static int field1146;

    @ObfuscatedName("bi.m")
    public static int field1147;

    @ObfuscatedName("bi.cl")
    public static class264 field1148;

    @ObfuscatedName("i.co")
    public static class264 field12;

    @ObfuscatedName("bz.r")
    public static int field1234;

    @ObfuscatedName("ca.ri")
    public static int field1244;

    @ObfuscatedName("ct.h")
    public static int field1252;

    @ObfuscatedName("cy.o")
    public static int field1281;

    @ObfuscatedName("cd.bc")
    public static String field1293;

    @ObfuscatedName("cd.f")
    public static class261 field1295;

    @ObfuscatedName("i.cs")
    public static class264 field13;

    @ObfuscatedName("cm.fu")
    public static class332[] field1311;

    @ObfuscatedName("cm.pn")
    public static int field1318;

    @ObfuscatedName("cc.er")
    public static class170 field1325;

    @ObfuscatedName("cv.r")
    public static int[] field1334;

    @ObfuscatedName("ch.o")
    public static class331 field1340;

    @ObfuscatedName("ch.p")
    public static class331 field1342;

    @ObfuscatedName("ch.d")
    public static class331 field1343;

    @ObfuscatedName("ch.c")
    public static boolean field1346;

    @ObfuscatedName("ch.k")
    public static class331[] field1348;

    @ObfuscatedName("ch.bc")
    public static class331[] field1349;

    @ObfuscatedName("ch.ai")
    public static int[] field1363;

    @ObfuscatedName("ch.ar")
    public static int field1364;

    @ObfuscatedName("ci.ec")
    public static class166 field1403;

    @ObfuscatedName("ce.w")
    public static int field1407;

    @ObfuscatedName("ce.u")
    public static int[] field1409;

    @ObfuscatedName("cf.w")
    public static int field1432;

    @ObfuscatedName("cb.af")
    public static String field1440;

    @ObfuscatedName("cp.kx")
    public static class88 field1466;

    @ObfuscatedName("cp.ga")
    public static int field1469;

    @ObfuscatedName("cp.a")
    public static int field1471;

    @ObfuscatedName("co.gj")
    public static int field1475;

    @ObfuscatedName("do.d")
    public static int field1502;

    @ObfuscatedName("do.y")
    public static float[] field1506;

    @ObfuscatedName("do.z")
    public static byte[] field1508;

    @ObfuscatedName("do.p")
    public static int field1509;

    @ObfuscatedName("do.w")
    public static int field1510;

    @ObfuscatedName("do.r")
    public static int field1511;

    @ObfuscatedName("do.e")
    public static class107[] field1514;

    @ObfuscatedName("do.f")
    public static class114[] field1515;

    @ObfuscatedName("do.l")
    public static class119[] field1516;

    @ObfuscatedName("do.b")
    public static int[] field1518;

    @ObfuscatedName("do.q")
    public static float[] field1520;

    @ObfuscatedName("do.a")
    public static class103[] field1521;

    @ObfuscatedName("do.s")
    public static float[] field1524;

    @ObfuscatedName("do.m")
    public static boolean[] field1525;

    @ObfuscatedName("do.ac")
    public static float[] field1526;

    @ObfuscatedName("do.g")
    public static float[] field1527;

    @ObfuscatedName("do.ap")
    public static float[] field1529;

    @ObfuscatedName("do.al")
    public static float[] field1530;

    @ObfuscatedName("do.ai")
    public static int[] field1531;

    @ObfuscatedName("do.ab")
    public static int[] field1532;

    @ObfuscatedName("de.r")
    public static int[] field1544;

    @ObfuscatedName("de.d")
    public static int[] field1551;

    @ObfuscatedName("de.a")
    public static boolean[] field1552;

    @ObfuscatedName("dz.bb")
    public static class331[] field1570;

    @ObfuscatedName("dz.x")
    public static int field1571;

    @ObfuscatedName("dh.mo")
    public static int field1583;

    @ObfuscatedName("dl.py")
    public static int field1591;

    @ObfuscatedName("o.em")
    public static class312 field16;

    @ObfuscatedName("dg.p")
    public static float field1627;

    @ObfuscatedName("dg.w")
    public static int field1635;

    @ObfuscatedName("dq.ab")
    public static FontMetrics field1677;

    @ObfuscatedName("dp.k")
    public static int field1687;

    @ObfuscatedName("dw.r")
    public static class331 field1692;

    @ObfuscatedName("dw.im")
    public static class243 field1702;

    @ObfuscatedName("db.dq")
    public static int field1787;

    @ObfuscatedName("db.ry")
    public static int field1790;

    @ObfuscatedName("dc.l")
    public static int[] field1805;

    @ObfuscatedName("eg.pm")
    public static class108 field1825;

    @ObfuscatedName("eg.cg")
    public static int field1840;

    @ObfuscatedName("ed.bh")
    public static int field1900;

    @ObfuscatedName("ed.bf")
    public static int field1901;

    @ObfuscatedName("ed.bu")
    public static int field1902;

    @ObfuscatedName("ec.k")
    public static int field1916;

    @ObfuscatedName("ec.r")
    public static int field1918;

    @ObfuscatedName("ec.z")
    public static int field1919;

    @ObfuscatedName("er.e")
    public static int field1943;

    @ObfuscatedName("er.f")
    public static int field1944;

    @ObfuscatedName("er.q")
    public static class144 field1945;

    @ObfuscatedName("er.t")
    public static int field1946;

    @ObfuscatedName("er.b")
    public static int field1947;

    @ObfuscatedName("er.h")
    public static int field1948;

    @ObfuscatedName("er.l")
    public static int field1949;

    @ObfuscatedName("er.v")
    public static int field1950;

    @ObfuscatedName("er.m")
    public static int field1953;

    @ObfuscatedName("en.p")
    public static int field1965;

    @ObfuscatedName("en.fq")
    public static class332[] field1967;

    @ObfuscatedName("ev.fv")
    public static byte[][] field1971;

    @ObfuscatedName("ev.f")
    public static int[] field1974;

    @ObfuscatedName("ez.v")
    public static int field1977;

    @ObfuscatedName("ez.n")
    public static int field1987;

    @ObfuscatedName("ez.g")
    public static int field1989;

    @ObfuscatedName("ez.b")
    public static int field1993;

    @ObfuscatedName("ez.h")
    public static int field1994;

    @ObfuscatedName("ez.t")
    public static int field1995;

    @ObfuscatedName("ez.u")
    public static int field1998;

    @ObfuscatedName("ez.q")
    public static int field1999;

    @ObfuscatedName("ez.s")
    public static int field2001;

    @ObfuscatedName("ez.ac")
    public static int field2003;

    @ObfuscatedName("ez.y")
    public static int field2004;

    @ObfuscatedName("ez.al")
    public static int field2005;

    @ObfuscatedName("ez.bc")
    public static int field2015;

    @ObfuscatedName("ez.ai")
    public static int field2026;

    @ObfuscatedName("ez.bl")
    public static boolean[][] field2033;

    @ObfuscatedName("ez.br")
    public static int field2034;

    @ObfuscatedName("ez.bh")
    public static int field2035;

    @ObfuscatedName("ez.bf")
    public static int field2036;

    @ObfuscatedName("ez.bu")
    public static int field2037;

    @ObfuscatedName("ez.bp")
    public static int field2038;

    @ObfuscatedName("ez.ap")
    public static int field2039;

    @ObfuscatedName("ek.dh")
    public static class264 field2044;

    @ObfuscatedName("em.k")
    public static class78[] field2059;

    @ObfuscatedName("ee.i")
    public static class262 field2062;

    @ObfuscatedName("ee.jf")
    public static int field2065;

    @ObfuscatedName("eq.pb")
    public static int field2124;

    @ObfuscatedName("eb.a")
    public static class331 field2128;

    @ObfuscatedName("eb.dl")
    public static class264 field2129;

    @ObfuscatedName("ey.p")
    public static int field2130;

    @ObfuscatedName("ea.p")
    public static boolean field2135;

    @ObfuscatedName("ea.o")
    public static class262 field2137;

    @ObfuscatedName("fg.x")
    public static class262 field2143;

    @ObfuscatedName("fh.bt")
    public static class331[] field2146;

    @ObfuscatedName("fh.w")
    public static int[] field2147;

    @ObfuscatedName("fh.da")
    public static class264 field2148;

    @ObfuscatedName("fh.ih")
    public static class243 field2150;

    @ObfuscatedName("fb.mj")
    public static class95 field2152;

    @ObfuscatedName("ff.i")
    public static String field2177;

    @ObfuscatedName("ff.e")
    public static class173 field2178;

    @ObfuscatedName("ff.c")
    public static Applet field2179;

    @ObfuscatedName("ff.o")
    public static int field2180;

    @ObfuscatedName("ff.ab")
    public static int[] field2182;

    @ObfuscatedName("ff.qh")
    public static class80 field2183;

    @ObfuscatedName("ff.z")
    public static byte[][][] field2184;

    @ObfuscatedName("fl.i")
    public static String field2196;

    @ObfuscatedName("fj.j")
    public static File field2206;

    @ObfuscatedName("fj.k")
    public static File field2207;

    @ObfuscatedName("fj.l")
    public static class122[] field2214;

    @ObfuscatedName("fj.h")
    public static String[] field2215;

    @ObfuscatedName("fr.cf")
    public static class264 field2219;

    @ObfuscatedName("fx.eq")
    public static int field2226;

    @ObfuscatedName("z.gc")
    public static class7[] field224;

    @ObfuscatedName("fu.m")
    public static int field2243;

    @ObfuscatedName("fa.ai")
    public static Font field2250;

    @ObfuscatedName("fw.e")
    public static int field2259;

    @ObfuscatedName("p.ex")
    public static class311 field227;

    @ObfuscatedName("fq.x")
    public static int field2278;

    @ObfuscatedName("p.g")
    public static int[] field232;

    @ObfuscatedName("fe.op")
    public static class332 field2372;

    @ObfuscatedName("r.au")
    public static client field240;

    @ObfuscatedName("d.gb")
    public static int field242;

    @ObfuscatedName("fd.gv")
    public static int field2454;

    @ObfuscatedName("gk.y")
    public static int[] field2481;

    @ObfuscatedName("gg.z")
    public static int[] field2492;

    @ObfuscatedName("gg.ef")
    public static int field2499;

    @ObfuscatedName("d.r")
    public static int field250;

    @ObfuscatedName("ge.fb")
    public static int[] field2504;

    @ObfuscatedName("ge.n")
    public static String field2506;

    @ObfuscatedName("gt.ee")
    public static class312 field2507;

    @ObfuscatedName("gb.x")
    public static class243[][] field2520;

    @ObfuscatedName("gv.u")
    public static String field2522;

    @ObfuscatedName("gv.gf")
    public static int field2523;

    @ObfuscatedName("gp.po")
    public static class115 field2572;

    @ObfuscatedName("gx.w")
    public static byte[][][] field2579;

    @ObfuscatedName("e.fk")
    public static class332[] field258;

    @ObfuscatedName("gq.c")
    public static long field2580;

    @ObfuscatedName("e.is")
    public static class73 field260;

    @ObfuscatedName("gr.m")
    public static class195 field2605;

    @ObfuscatedName("gj.j")
    public static class331 field2606;

    @ObfuscatedName("e.e")
    public static class111 field261;

    @ObfuscatedName("gl.a")
    public static int[] field2614;

    @ObfuscatedName("e.pi")
    public static int field262;

    @ObfuscatedName("e.c")
    public static int field264;

    @ObfuscatedName("f.p")
    public static int[] field266;

    @ObfuscatedName("f.jj")
    public static int field267;

    @ObfuscatedName("hx.el")
    public static class312 field2677;

    @ObfuscatedName("hi.i")
    public static class262 field2679;

    @ObfuscatedName("hi.j")
    public static class231 field2680;

    @ObfuscatedName("hi.z")
    public static int field2683;

    @ObfuscatedName("hi.c")
    public static class262 field2685;

    @ObfuscatedName("ik.j")
    public static String[] field2759;

    @ObfuscatedName("ir.e")
    public static class312 field2768;

    @ObfuscatedName("ih.ig")
    public static int field2770;

    @ObfuscatedName("im.ke")
    public static class243 field2776;

    @ObfuscatedName("im.w")
    public static int field2778;

    @ObfuscatedName("ip.r")
    public static short[][] field2781;

    @ObfuscatedName("ip.w")
    public static short[] field2788;

    @ObfuscatedName("ip.z")
    public static short[] field2789;

    @ObfuscatedName("ip.bt")
    public static int field2792;

    @ObfuscatedName("il.kw")
    public static int field2800;

    @ObfuscatedName("il.c")
    public static String field2801;

    @ObfuscatedName("ib.w")
    public static class262 field2806;

    @ObfuscatedName("ib.d")
    public static class262 field2808;

    @ObfuscatedName("k.es")
    public static int field29;

    @ObfuscatedName("ib.r")
    public static class262 field2918;

    @ObfuscatedName("b.a")
    public static class236 field293;

    @ObfuscatedName("h.pu")
    public static int field295;

    @ObfuscatedName("h.p")
    public static class262 field296;

    @ObfuscatedName("iz.fo")
    public static byte[][] field2961;

    @ObfuscatedName("h.x")
    public static boolean field298;

    @ObfuscatedName("h.c")
    public static class262 field300;

    @ObfuscatedName("t.dz")
    public static class264 field304;

    @ObfuscatedName("t.p")
    public static int field307;

    @ObfuscatedName("k.ap")
    public static int[] field31;

    @ObfuscatedName("v.cb")
    public static class264 field312;

    @ObfuscatedName("n.fm")
    public static class332[] field318;

    @ObfuscatedName("n.w")
    public static int field320;

    @ObfuscatedName("u.e")
    public static class102 field323;

    @ObfuscatedName("u.r")
    public static class149 field325;

    @ObfuscatedName("q.q")
    public static String field328;

    @ObfuscatedName("iy.nw")
    public static class321 field3297;

    @ObfuscatedName("ia.i")
    public static class262 field3299;

    @ObfuscatedName("g.kc")
    public static class243 field332;

    @ObfuscatedName("iv.cc")
    public static char field3347;

    @ObfuscatedName("ic.bj")
    public static class258 field3356;

    @ObfuscatedName("jr.e")
    public static boolean field3389;

    @ObfuscatedName("jr.k")
    public static Thread field3392;

    @ObfuscatedName("jr.oa")
    public static boolean field3393;

    @ObfuscatedName("g.re")
    public static short[] field341;

    @ObfuscatedName("je.c")
    public static class170 field3413;

    @ObfuscatedName("je.o")
    public static long field3414;

    @ObfuscatedName("je.v")
    public static class195 field3419;

    @ObfuscatedName("jp.qd")
    public static long field3432;

    @ObfuscatedName("jc.c")
    public static class262 field3439;

    @ObfuscatedName("y.fi")
    public static int[][] field344;

    @ObfuscatedName("jb.ph")
    public static int field3442;

    @ObfuscatedName("jb.i")
    public static int field3446;

    @ObfuscatedName("jb.c")
    public static class262 field3448;

    @ObfuscatedName("ja.o")
    public static int field3451;

    @ObfuscatedName("ja.c")
    public static class262 field3457;

    @ObfuscatedName("ja.gr")
    public static int field3458;

    @ObfuscatedName("ja.i")
    public static class270[] field3472;

    @ObfuscatedName("ja.gc")
    public static int field3473;

    @ObfuscatedName("jq.c")
    public static class262 field3474;

    @ObfuscatedName("ju.c")
    public static class262 field3484;

    @ObfuscatedName("y.ah")
    public static Image field349;

    @ObfuscatedName("jg.c")
    public static class262 field3490;

    @ObfuscatedName("x.al")
    public static int[] field35;

    @ObfuscatedName("jt.i")
    public static class262 field3506;

    @ObfuscatedName("jt.c")
    public static class262 field3507;

    @ObfuscatedName("y.fg")
    public static int[] field351;

    @ObfuscatedName("jt.o")
    public static int field3513;

    @ObfuscatedName("jo.px")
    public static int field3524;

    @ObfuscatedName("jz.c")
    public static class262 field3538;

    @ObfuscatedName("jy.c")
    public static class262 field3543;

    @ObfuscatedName("ji.c")
    public static class262 field3550;

    @ObfuscatedName("jn.c")
    public static class262 field3554;

    @ObfuscatedName("jf.i")
    public static class262 field3565;

    @ObfuscatedName("jf.o")
    public static class262 field3566;

    @ObfuscatedName("s.bp")
    public static class332[] field357;

    @ObfuscatedName("jf.c")
    public static class262 field3577;

    @ObfuscatedName("s.d")
    public static int field358;

    @ObfuscatedName("jj.o")
    public static class262 field3588;

    @ObfuscatedName("s.x")
    public static int[] field359;

    @ObfuscatedName("x.ed")
    public static long field36;

    @ObfuscatedName("jh.z")
    public static class262 field3689;

    @ObfuscatedName("jk.i")
    public static class262 field3715;

    @ObfuscatedName("jk.c")
    public static class262 field3728;

    @ObfuscatedName("kv.c")
    public static class262 field3738;

    @ObfuscatedName("kn.i")
    public static class262 field3748;

    @ObfuscatedName("kn.o")
    public static class262 field3754;

    @ObfuscatedName("kn.by")
    public static class331 field3765;

    @ObfuscatedName("kn.q")
    public static int field3766;

    @ObfuscatedName("kn.gt")
    public static int field3767;

    @ObfuscatedName("ap.b")
    public static String[] field381;

    @ObfuscatedName("ap.r")
    public static class110 field383;

    @ObfuscatedName("kz.e")
    public static class331 field3849;

    @ObfuscatedName("kr.fc")
    public static class138 field3868;

    @ObfuscatedName("kd.fh")
    public static int[] field3871;

    @ObfuscatedName("kd.du")
    public static int field3879;

    @ObfuscatedName("lh.r")
    public static class331[] field3895;

    @ObfuscatedName("ly.c")
    public static class187 field3908;

    @ObfuscatedName("ly.d")
    public static boolean field3911;

    @ObfuscatedName("ld.i")
    public static long field3912;

    @ObfuscatedName("ld.z")
    public static boolean[] field3914;

    @ObfuscatedName("lb.bb")
    public static int field3919;

    @ObfuscatedName("lu.i")
    public static class262 field3920;

    @ObfuscatedName("lu.x")
    public static int field3921;

    @ObfuscatedName("lk.x")
    public static class332 field3927;

    @ObfuscatedName("lk.k")
    public static int field3928;

    @ObfuscatedName("lm.aw")
    public static class329 field3942;

    @ObfuscatedName("ln.al")
    public static int field3955;

    @ObfuscatedName("ln.ai")
    public static int field3958;

    @ObfuscatedName("ln.ap")
    public static int[] field3959;

    @ObfuscatedName("lv.z")
    public static int[] field3990;

    @ObfuscatedName("lv.k")
    public static int[] field3991;

    @ObfuscatedName("lv.i")
    public static int field3992;

    @ObfuscatedName("lv.p")
    public static int[] field3993;

    @ObfuscatedName("lv.w")
    public static byte[][] field3994;

    @ObfuscatedName("lo.qp")
    public static class338 field4067;

    @ObfuscatedName("ls.f")
    public static class243 field4074;

    @ObfuscatedName("ab.au")
    public static int field416;

    @ObfuscatedName("ak.cv")
    public static class166 field423;

    @ObfuscatedName("as.cq")
    public static boolean field441;

    @ObfuscatedName("aa.c")
    public static class262 field442;

    @ObfuscatedName("aa.oh")
    public static class308 field444;

    @ObfuscatedName("ah.de")
    public static class264 field446;

    @ObfuscatedName("ah.fp")
    public static class332 field448;

    @ObfuscatedName("ah.pa")
    public static int field452;

    @ObfuscatedName("ao.le")
    public static int field454;

    @ObfuscatedName("ao.di")
    public static int field462;

    @ObfuscatedName("am.b")
    public static class49 field479;

    @ObfuscatedName("am.y")
    public static int[] field481;

    @ObfuscatedName("aq.pg")
    public static int field486;

    @ObfuscatedName("ae.q")
    public static int[] field490;

    @ObfuscatedName("ae.bn")
    public static class70 field491;

    @ObfuscatedName("ae.w")
    public static class331[] field492;

    @ObfuscatedName("af.cx")
    public static class264 field503;

    @ObfuscatedName("aw.at")
    public static boolean field509;

    @ObfuscatedName("ax.bj")
    public static String field521;

    @ObfuscatedName("ag.fl")
    public static int field534;

    @ObfuscatedName("ag.mz")
    public static int field538;

    @ObfuscatedName("ad.ft")
    public static class331[] field546;

    @ObfuscatedName("ad.cz")
    public static class264 field549;

    @ObfuscatedName("ad.cn")
    public static class264 field550;

    @ObfuscatedName("ad.cp")
    public static class264 field553;

    @ObfuscatedName("at.g")
    public static int field554;

    @ObfuscatedName("av.qt")
    public static class79 field565;

    @ObfuscatedName("az.fa")
    public static class332[] field570;

    @ObfuscatedName("aj.ek")
    public static class148 field578;

    @ObfuscatedName("ar.pv")
    public static int field579;

    @ObfuscatedName("ar.mp")
    public static class169 field580;

    @ObfuscatedName("ar.kt")
    public static int field590;

    @ObfuscatedName("bv.kr")
    public static int field624;

    @ObfuscatedName("bv.i")
    public static File field625;

    @ObfuscatedName("bj.bp")
    public static String field628;

    @ObfuscatedName("bj.rc")
    public static class175 field629;

    @ObfuscatedName("bj.p")
    public static short[][] field630;

    @ObfuscatedName("bj.t")
    public static int field631;

    @ObfuscatedName("bj.pr")
    public static class101 field633;

    @ObfuscatedName("bj.j")
    public static int[] field634;

    @ObfuscatedName("ba.cw")
    public static class264 field636;

    @ObfuscatedName("ba.c")
    public static class262 field640;

    @ObfuscatedName("ba.o")
    public static int[] field641;

    @ObfuscatedName("br.e")
    public static int[] field649;

    @ObfuscatedName("br.ch")
    public static class170 field650;

    @ObfuscatedName("br.p")
    public static ScheduledExecutorService field655;

    @ObfuscatedName("bf.p")
    public static int field669;

    @ObfuscatedName("bf.fj")
    public static int field674;

    @ObfuscatedName("bf.c")
    public static class167 field684;

    @ObfuscatedName("bf.av")
    public static GarbageCollectorMXBean field689;

    @ObfuscatedName("bp.e")
    public static class243 field714;

    @ObfuscatedName("bp.x")
    public static class262 field715;

    @ObfuscatedName("bp.z")
    public static class332 field716;

    @ObfuscatedName("bp.fx")
    public static class331[] field719;

    @ObfuscatedName("bc.w")
    public static int[][] field720;

    @ObfuscatedName("bc.l")
    public static int[][][] field722;

    @ObfuscatedName("bc.x")
    public static byte[][][] field725;

    @ObfuscatedName("bc.p")
    public static byte[][][] field726;

    @ObfuscatedName("bc.k")
    public static byte[][][] field730;

    @ObfuscatedName("bc.j")
    public static byte[][][] field734;

    @ObfuscatedName("bb.rq")
    public static class335 field743;

    @ObfuscatedName("bt.fw")
    public static class332[] field749;

    @ObfuscatedName("bt.ik")
    public static class243 field751;

    @ObfuscatedName("by.jh")
    public static int field755;

    @ObfuscatedName("by.eo")
    public static int field757;

    @ObfuscatedName("be.ij")
    public static class124 field761;

    @ObfuscatedName("bq.dn")
    public static class264 field791;

    @ObfuscatedName("bn.fr")
    public static class332 field797;

    @ObfuscatedName("bk.iz")
    public static int field814;

    @ObfuscatedName("bm.bl")
    public static class259 field817;

    @ObfuscatedName("bx.dk")
    public static int field850;

    @ObfuscatedName("bo.ps")
    public static class108 field853;

    @ObfuscatedName("client.cr")
    public static long field888;

    @ObfuscatedName("client.qk")
    public static class14 field889;

    @ObfuscatedName("client.ix")
    public static int field901;

    @ObfuscatedName("ju.c(II)I")
    public static int method4418(int arg0) {
        return arg0 >> 17 & 0x7;
    }

    @ObfuscatedName("ef.c(Ljava/net/Socket;III)Lfr;")
    public static class170 method2877(Socket arg0, int arg1, int arg2) throws IOException {
        return new class172(arg0, arg1, arg2);
    }

    @ObfuscatedName("is.j(I)[Ljd;")
    public static class267[] method4176() {
        return new class267[] { class267.field3436, class267.field3435, class267.field3433 };
    }

    @ObfuscatedName("gm.c(Ljm;I)V")
    public static void method3459(class262 arg0) {
        field3439 = arg0;
    }

    @ObfuscatedName("jc.i(IIIIIII)I")
    public static int method4365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if ((arg5 & 0x1) == 1) {
            int var6 = arg3;
            arg3 = arg4;
            arg4 = var6;
        }
        int var7 = arg2 & 0x3;
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg1;
        } else if (var7 == 2) {
            return 7 - arg0 - (arg3 - 1);
        } else {
            return 7 - arg1 - (arg4 - 1);
        }
    }

    @ObfuscatedName("hu.c(I)V")
    public static void method3931() {
        for (class81 var0 = (class81) class81.field1262.method3723(); var0 != null; var0 = (class81) class81.field1262.method3722()) {
            if (var0.field1261 != null) {
                field633.method1910(var0.field1261);
                var0.field1261 = null;
            }
            if (var0.field1255 != null) {
                field633.method1910(var0.field1255);
                var0.field1255 = null;
            }
        }
        class81.field1262.method3715();
    }

    @ObfuscatedName("io.o(IIIIII)V")
    public static final void method4171(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class8.field230.method3680(new class9(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("o.j(III)Lbk;")
    public static class71 method2(int arg0, int arg1) {
        class99 var2 = (class99) class96.field1441.get(arg0);
        return var2.method1873(arg1);
    }

    @ObfuscatedName("jc.c(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static File method4364(String arg0, String arg1, int arg2) {
        String var3 = arg2 == 0 ? "" : "" + arg2;
        field2206 = new File(field328, "jagex_cl_" + arg0 + "_" + arg1 + var3 + ".dat");
        String var4 = null;
        String var5 = null;
        boolean var6 = false;
        if (field2206.exists()) {
            try {
                class123 var7 = new class123(field2206, "rw", 10000L);
                class195 var8 = new class195((int) var7.method2325());
                while (var8.field2566 < var8.field2567.length) {
                    int var9 = var7.method2326(var8.field2567, var8.field2566, var8.field2567.length - var8.field2566);
                    if (var9 == -1) {
                        throw new IOException();
                    }
                    var8.field2566 += var9;
                }
                var8.field2566 = 0;
                int var10 = var8.method3429();
                if (var10 < 1 || var10 > 3) {
                    throw new IOException("" + var10);
                }
                int var11 = 0;
                if (var10 > 1) {
                    var11 = var8.method3429();
                }
                if (var10 <= 2) {
                    var4 = var8.method3235();
                    if (var11 == 1) {
                        var5 = var8.method3235();
                    }
                } else {
                    var4 = var8.method3236();
                    if (var11 == 1) {
                        var5 = var8.method3236();
                    }
                }
                var7.method2323();
            } catch (IOException var39) {
                var39.printStackTrace();
            }
            if (var4 != null) {
                File var13 = new File(var4);
                if (!var13.exists()) {
                    var4 = null;
                }
            }
            if (var4 != null) {
                File var14 = new File(var4, "test.dat");
                boolean var17;
                try {
                    RandomAccessFile var15 = new RandomAccessFile(var14, "rw");
                    int var16 = var15.read();
                    var15.seek(0L);
                    var15.write(var16);
                    var15.seek(0L);
                    var15.close();
                    var14.delete();
                    var17 = true;
                } catch (Exception var37) {
                    var17 = false;
                }
                if (!var17) {
                    var4 = null;
                }
            }
        }
        if (var4 == null && arg2 == 0) {
            label119: for (int var19 = 0; var19 < field2215.length; var19++) {
                for (int var20 = 0; var20 < field381.length; var20++) {
                    File var21 = new File(field381[var20] + field2215[var19] + File.separatorChar + arg0 + File.separatorChar);
                    if (var21.exists()) {
                        File var22 = new File(var21, "test.dat");
                        boolean var25;
                        try {
                            RandomAccessFile var23 = new RandomAccessFile(var22, "rw");
                            int var24 = var23.read();
                            var23.seek(0L);
                            var23.write(var24);
                            var23.seek(0L);
                            var23.close();
                            var22.delete();
                            var25 = true;
                        } catch (Exception var36) {
                            var25 = false;
                        }
                        if (var25) {
                            var4 = var21.toString();
                            var6 = true;
                            break label119;
                        }
                    }
                }
            }
        }
        if (var4 == null) {
            var4 = field328 + File.separatorChar + "jagexcache" + var3 + File.separatorChar + arg0 + File.separatorChar + arg1 + File.separatorChar;
            var6 = true;
        }
        if (var5 != null) {
            File var27 = new File(var5);
            File var28 = new File(var4);
            try {
                File[] var29 = var27.listFiles();
                File[] var30 = var29;
                for (int var31 = 0; var31 < var30.length; var31++) {
                    File var32 = var30[var31];
                    File var33 = new File(var28, var32.getName());
                    boolean var34 = var32.renameTo(var33);
                    if (!var34) {
                        throw new IOException();
                    }
                }
            } catch (Exception var38) {
                var38.printStackTrace();
            }
            var6 = true;
        }
        if (var6) {
            class168.method4679(new File(var4), (File) null);
        }
        return new File(var4);
    }

    @ObfuscatedName("ba.j(B)V")
    public static void method724() {
        Object var0 = class263.field3387;
        synchronized (class263.field3387) {
            if (class263.field3390 == 0) {
                field3392 = new Thread(new class263());
                field3392.setDaemon(true);
                field3392.start();
                field3392.setPriority(5);
            }
            class263.field3390 = 600;
        }
    }

    @ObfuscatedName("if.r(I)V")
    public static final void method4095() {
        class80.method661(class252.field3243);
    }

    @ObfuscatedName("iz.x(I)V")
    public static void method4159() {
        class273.field3486.method3629();
        class273.field3487.method3629();
    }

    @ObfuscatedName("br.p(I)V")
    public static void method754() {
        class275.field3508.method3629();
    }

    @ObfuscatedName("ja.w([BI)Lkw;")
    public static class312 method4399(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class312 var1 = new class312(arg0, field634, field3991, field359, field3990, field3993, field3994);
            class333.method4183();
            return var1;
        }
    }

    @ObfuscatedName("kl.r(Ljm;IIB)Z")
    public static boolean method4828(class262 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4190(arg1, arg2);
        if (var3 == null) {
            return false;
        } else {
            class333.method4529(var3);
            return true;
        }
    }

    @ObfuscatedName("ao.o(B)Z")
    public static final boolean method483() {
        class52 var0 = class52.field623;
        synchronized (class52.field623) {
            if (class52.field618 == class52.field616) {
                return false;
            } else {
                field1840 = class52.field613[class52.field616];
                field3347 = class52.field595[class52.field616];
                class52.field616 = class52.field616 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("q.p(IIII)I")
    public static final int method174(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = class63.method567(var3, var5);
        int var8 = class63.method567(var3 + 1, var5);
        int var9 = class63.method567(var3, var5 + 1);
        int var10 = class63.method567(var3 + 1, var5 + 1);
        int var11 = 65536 - class135.field1934[var4 * 1024 / arg2] >> 1;
        int var12 = ((65536 - var11) * var7 >> 16) + (var8 * var11 >> 16);
        int var14 = 65536 - class135.field1934[var4 * 1024 / arg2] >> 1;
        int var15 = ((65536 - var14) * var9 >> 16) + (var10 * var14 >> 16);
        int var17 = 65536 - class135.field1934[var6 * 1024 / arg2] >> 1;
        return ((65536 - var17) * var12 >> 16) + (var15 * var17 >> 16);
    }

    @ObfuscatedName("iz.fa(I)V")
    public static void method4158() {
        client.field868 = -1L;
        client.field871 = -1;
        field491.field795 = 0;
        field509 = true;
        client.field1118 = true;
        client.field1080 = -1L;
        class327.field3952 = new class216();
        client.field903.method1881();
        client.field903.field1477.field2566 = 0;
        client.field903.field1478 = null;
        client.field903.field1486 = null;
        client.field903.field1474 = null;
        client.field903.field1472 = null;
        client.field903.field1479 = 0;
        client.field903.field1481 = 0;
        client.field874 = 0;
        client.field904 = 0;
        client.field875 = 0;
        method588();
        class61.field698 = 0;
        class96.field1441.clear();
        class96.field1433.method3600();
        class96.field1435.method3783();
        class96.field1436 = 0;
        client.field924 = 0;
        client.field1012 = false;
        client.field1094 = 0;
        client.field926 = 0;
        client.field931 = 0;
        field1133 = null;
        client.field1088 = 0;
        client.field1101 = -1;
        client.field1086 = 0;
        client.field1006 = 0;
        client.field883 = class90.field1335;
        client.field884 = class90.field1335;
        client.field899 = 0;
        class94.method4();
        for (int var0 = 0; var0 < 2048; var0++) {
            client.field972[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            client.field898[var1] = null;
        }
        client.field983 = -1;
        client.field986.method3715();
        client.field978.method3715();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    client.field984[var2][var3][var4] = null;
                }
            }
        }
        client.field1116 = new class218();
        field2183.method1525();
        for (int var5 = 0; var5 < field3446; var5++) {
            class269 var6 = (class269) class269.field3443.method3625((long) var5);
            class269 var7;
            if (var6 == null) {
                byte[] var8 = field3448.method4190(16, var5);
                class269 var9 = new class269();
                if (var8 != null) {
                    var9.method4367(new class195(var8));
                }
                class269.field3443.method3628(var9, (long) var5);
                var7 = var9;
            } else {
                var7 = var6;
            }
            if (var7 != null) {
                class238.field2773[var5] = 0;
                class238.field2771[var5] = 0;
            }
        }
        field2152.method1818();
        client.field1056 = -1;
        if (client.field1017 != -1) {
            int var11 = client.field1017;
            if (var11 != -1 && field3914[var11]) {
                field296.method4205(var11);
                if (field2520[var11] != null) {
                    boolean var12 = true;
                    for (int var13 = 0; var13 < field2520[var11].length; var13++) {
                        if (field2520[var11][var13] != null) {
                            if (field2520[var11][var13].field2851 == 2) {
                                var12 = false;
                            } else {
                                field2520[var11][var13] = null;
                            }
                        }
                    }
                    if (var12) {
                        field2520[var11] = null;
                    }
                    field3914[var11] = false;
                }
            }
        }
        for (class68 var14 = (class68) client.field1018.method3658(); var14 != null; var14 = (class68) client.field1018.method3661()) {
            client.method576(var14, true);
        }
        client.field1017 = -1;
        client.field1018 = new class215(8);
        client.field1103 = null;
        method588();
        client.field1119.method4062((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var15 = 0; var15 < 8; var15++) {
            client.field980[var15] = null;
            client.field964[var15] = false;
        }
        class66.method3828();
        client.field866 = true;
        for (int var16 = 0; var16 < 100; var16++) {
            client.field1061[var16] = true;
        }
        client.method4177();
        field444 = null;
        for (int var17 = 0; var17 < 8; var17++) {
            client.field1122[var17] = new class17();
        }
        field889 = null;
    }

    @ObfuscatedName("is.gg(IIII)V")
    public static void method4174(int arg0, int arg1, int arg2) {
        if (client.field1092 == 0 || arg1 == 0 || client.field1094 >= 50) {
            return;
        }
        client.field886[client.field1094] = arg0;
        client.field920[client.field1094] = arg1;
        client.field1097[client.field1094] = arg2;
        client.field1099[client.field1094] = null;
        client.field1098[client.field1094] = 0;
        client.field1094++;
    }

    @ObfuscatedName("bx.hg(IIIB)V")
    public static final void method1077(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            client.field955 = -1;
            client.field865 = -1;
            return;
        }
        int var3 = client.method17(arg0, arg1, field2770) - arg2;
        int var4 = arg0 - field3767;
        int var5 = var3 - field3473;
        int var6 = arg1 - field1469;
        int var7 = class135.field1956[field242];
        int var8 = class135.field1934[field242];
        int var9 = class135.field1956[field2454];
        int var10 = class135.field1934[field2454];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            client.field955 = client.field1093 * var11 / var15 + client.field944 / 2;
            client.field865 = client.field1093 * var14 / var15 + client.field907 / 2;
        } else {
            client.field955 = -1;
            client.field865 = -1;
        }
    }

    @ObfuscatedName("at.ho(I)V")
    public static void method588() {
        client.field993 = 0;
        client.field992 = false;
    }

    @ObfuscatedName("ei.id(IB)Z")
    public static boolean method2578(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ec.kh(I)V")
    public static final void method2574() {
        client.field1049 = client.field1041;
    }

    @ObfuscatedName("co.kg(Lib;B)Lib;")
    public static class243 method1893(class243 arg0) {
        int var1 = method4418(client.method580(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class243.method3(arg0.field2886);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("fd.kq(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method3127(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (client.field956 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (client.field956 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (client.field956 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (client.field956 == 5) {
            arg0 = arg0 + "-wti";
        } else if (client.field956 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (field1293 != null) {
            var3 = "/p=" + field1293;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + client.field864 + "/a=" + field3919 + var3 + "/";
    }
}
