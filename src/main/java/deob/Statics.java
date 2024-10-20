package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Desktop.Action;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.net.URI;
import java.util.Date;

public class Statics {

    @ObfuscatedName("al.o")
    public static class158 field1003;

    @ObfuscatedName("al.v")
    public static short[] field1005;

    @ObfuscatedName("al.ps")
    public static class128 field1007;

    @ObfuscatedName("ak.nv")
    public static int field1011;

    @ObfuscatedName("ak.gq")
    public static class164 field1014;

    @ObfuscatedName("as.o")
    public static class158 field1021;

    @ObfuscatedName("as.f")
    public static class219[] field1027;

    @ObfuscatedName("ag.u")
    public static class158 field1031;

    @ObfuscatedName("ag.q")
    public static class158 field1032;

    @ObfuscatedName("ag.j")
    public static class215 field1055;

    @ObfuscatedName("an.o")
    public static class158 field1082;

    @ObfuscatedName("an.av")
    public static int[] field1085;

    @ObfuscatedName("an.he")
    public static int field1086;

    @ObfuscatedName("an.bx")
    public static class159 field1087;

    @ObfuscatedName("an.q")
    public static class158 field1088;

    @ObfuscatedName("an.l")
    public static int field1090;

    @ObfuscatedName("am.o")
    public static class49 field1094;

    @ObfuscatedName("ah.u")
    public static boolean field1101;

    @ObfuscatedName("ah.q")
    public static int field1115;

    @ObfuscatedName("ah.oh")
    public static int field1119;

    @ObfuscatedName("bx.ef")
    public static class74[] field1138;

    @ObfuscatedName("bx.eb")
    public static class74[] field1139;

    @ObfuscatedName("bx.ah")
    public static class76[] field1145;

    @ObfuscatedName("v.da")
    public static int[] field116;

    @ObfuscatedName("br.y")
    public static float field1160;

    @ObfuscatedName("br.k")
    public static int field1167;

    @ObfuscatedName("bv.c")
    public static int[] field1196;

    @ObfuscatedName("y.cs")
    public static int field120;

    @ObfuscatedName("bv.j")
    public static int[] field1201;

    @ObfuscatedName("bv.m")
    public static boolean[] field1202;

    @ObfuscatedName("bn.j")
    public static int field1212;

    @ObfuscatedName("bn.b")
    public static float[] field1213;

    @ObfuscatedName("bn.a")
    public static class63[] field1214;

    @ObfuscatedName("bn.v")
    public static byte[] field1217;

    @ObfuscatedName("bn.y")
    public static int field1218;

    @ObfuscatedName("bn.k")
    public static int field1219;

    @ObfuscatedName("bn.c")
    public static int field1220;

    @ObfuscatedName("bn.x")
    public static int[] field1221;

    @ObfuscatedName("bn.m")
    public static class69[] field1222;

    @ObfuscatedName("bn.e")
    public static float[] field1223;

    @ObfuscatedName("bn.n")
    public static boolean[] field1226;

    @ObfuscatedName("bn.d")
    public static float[] field1230;

    @ObfuscatedName("bn.ae")
    public static float[] field1233;

    @ObfuscatedName("bn.f")
    public static class56[] field1234;

    @ObfuscatedName("bn.ar")
    public static float[] field1237;

    @ObfuscatedName("bn.av")
    public static float[] field1238;

    @ObfuscatedName("bn.i")
    public static class64[] field1239;

    @ObfuscatedName("y.cv")
    public static int field124;

    @ObfuscatedName("bn.aq")
    public static int[] field1240;

    @ObfuscatedName("bn.ay")
    public static int[] field1241;

    @ObfuscatedName("bn.s")
    public static float[] field1243;

    @ObfuscatedName("by.kt")
    public static class123 field1274;

    @ObfuscatedName("by.ax")
    public static boolean field1276;

    @ObfuscatedName("by.w")
    public static String field1278;

    @ObfuscatedName("by.v")
    public static int field1279;

    @ObfuscatedName("bq.af")
    public static String field1295;

    @ObfuscatedName("o.mt")
    public static class74 field13;

    @ObfuscatedName("bs.fg")
    public static int field1305;

    @ObfuscatedName("bs.bu")
    public static String field1306;

    @ObfuscatedName("bs.er")
    public static class76[] field1307;

    @ObfuscatedName("bu.u")
    public static int[] field1308;

    @ObfuscatedName("bu.l")
    public static int field1309;

    @ObfuscatedName("bu.g")
    public static int field1310;

    @ObfuscatedName("bu.bb")
    public static class159 field1311;

    @ObfuscatedName("bu.v")
    public static int[] field1313;

    @ObfuscatedName("bu.o")
    public static int field1314;

    @ObfuscatedName("bu.mu")
    public static int field1316;

    @ObfuscatedName("bu.r")
    public static int[] field1318;

    @ObfuscatedName("be.f")
    public static int field1337;

    @ObfuscatedName("be.i")
    public static int field1338;

    @ObfuscatedName("be.a")
    public static int[] field1341;

    @ObfuscatedName("k.b")
    public static int[] field135;

    @ObfuscatedName("bk.i")
    public static int[] field1357;

    @ObfuscatedName("cw.nu")
    public static int field1369;

    @ObfuscatedName("cw.m")
    public static int[] field1370;

    @ObfuscatedName("ch.es")
    public static class74 field1375;

    @ObfuscatedName("cy.z")
    public static int field1378;

    @ObfuscatedName("k.is")
    public static int field138;

    @ObfuscatedName("cy.bz")
    public static int field1381;

    @ObfuscatedName("cy.h")
    public static int field1394;

    @ObfuscatedName("cy.t")
    public static int field1395;

    @ObfuscatedName("cy.w")
    public static int field1396;

    @ObfuscatedName("cy.p")
    public static int field1397;

    @ObfuscatedName("cy.x")
    public static int field1398;

    @ObfuscatedName("cy.s")
    public static int field1399;

    @ObfuscatedName("o.dr")
    public static byte[][] field14;

    @ObfuscatedName("cy.d")
    public static int field1400;

    @ObfuscatedName("cy.b")
    public static int field1401;

    @ObfuscatedName("cy.e")
    public static int field1402;

    @ObfuscatedName("cy.ar")
    public static int field1403;

    @ObfuscatedName("cy.av")
    public static int field1404;

    @ObfuscatedName("cy.ae")
    public static int field1405;

    @ObfuscatedName("cy.aq")
    public static int field1406;

    @ObfuscatedName("cy.bl")
    public static int field1407;

    @ObfuscatedName("cy.bd")
    public static int field1415;

    @ObfuscatedName("c.ic")
    public static class164 field142;

    @ObfuscatedName("cy.bb")
    public static boolean[][] field1432;

    @ObfuscatedName("cy.br")
    public static int field1434;

    @ObfuscatedName("cy.bf")
    public static int field1435;

    @ObfuscatedName("cy.bo")
    public static int field1438;

    @ObfuscatedName("cm.pa")
    public static class212 field1469;

    @ObfuscatedName("co.v")
    public static int field1475;

    @ObfuscatedName("co.z")
    public static String field1476;

    @ObfuscatedName("cr.j")
    public static int field1486;

    @ObfuscatedName("cr.w")
    public static int field1488;

    @ObfuscatedName("cr.p")
    public static int field1490;

    @ObfuscatedName("cr.m")
    public static int field1491;

    @ObfuscatedName("cr.z")
    public static int field1492;

    @ObfuscatedName("cr.s")
    public static int field1493;

    @ObfuscatedName("cr.d")
    public static int field1494;

    @ObfuscatedName("cr.b")
    public static int field1495;

    @ObfuscatedName("cr.av")
    public static class87 field1498;

    @ObfuscatedName("c.ei")
    public static class74[] field150;

    @ObfuscatedName("ce.bl")
    public static class159 field1523;

    @ObfuscatedName("cn.bh")
    public static class159 field1534;

    @ObfuscatedName("ca.kb")
    public static int field1536;

    @ObfuscatedName("ca.cg")
    public static class215 field1540;

    @ObfuscatedName("ca.y")
    public static short[][] field1541;

    @ObfuscatedName("j.ba")
    public static class159 field157;

    @ObfuscatedName("ci.dp")
    public static int field1584;

    @ObfuscatedName("cz.p")
    public static int[] field1588;

    @ObfuscatedName("j.j")
    public static boolean field159;

    @ObfuscatedName("m.gu")
    public static class164 field164;

    @ObfuscatedName("cc.fk")
    public static int field1669;

    @ObfuscatedName("cx.bf")
    public static FontMetrics field1678;

    @ObfuscatedName("cg.g")
    public static int field1685;

    @ObfuscatedName("o.ed")
    public static class74[] field17;

    @ObfuscatedName("m.t")
    public static int[] field170;

    @ObfuscatedName("cq.bm")
    public static int field1742;

    @ObfuscatedName("cq.ba")
    public static int field1761;

    @ObfuscatedName("cq.bx")
    public static int field1763;

    @ObfuscatedName("cs.ck")
    public static char field1815;

    @ObfuscatedName("a.j")
    public static int[] field183;

    @ObfuscatedName("dp.l")
    public static class158 field1830;

    @ObfuscatedName("dm.r")
    public static boolean field1834;

    @ObfuscatedName("dm.o")
    public static long field1836;

    @ObfuscatedName("dm.l")
    public static long field1840;

    @ObfuscatedName("dm.iz")
    public static int field1841;

    @ObfuscatedName("do.en")
    public static class74[] field1843;

    @ObfuscatedName("do.i")
    public static int[][][] field1845;

    @ObfuscatedName("a.ng")
    public static class52 field185;

    @ObfuscatedName("dk.qr")
    public static int field1857;

    @ObfuscatedName("dk.pv")
    public static int field1859;

    @ObfuscatedName("a.pw")
    public static long field186;

    @ObfuscatedName("dk.cf")
    public static class135 field1863;

    @ObfuscatedName("a.qn")
    public static int field187;

    @ObfuscatedName("dq.kc")
    public static class164[] field1874;

    @ObfuscatedName("dq.k")
    public static byte[][] field1876;

    @ObfuscatedName("dq.py")
    public static class9 field1877;

    @ObfuscatedName("da.bp")
    public static int field1878;

    @ObfuscatedName("dz.ow")
    public static int field1896;

    @ObfuscatedName("dz.di")
    public static int[] field1897;

    @ObfuscatedName("dr.df")
    public static byte[][] field1907;

    @ObfuscatedName("f.ib")
    public static int field191;

    @ObfuscatedName("df.m")
    public static class164 field1910;

    @ObfuscatedName("df.w")
    public static class111 field1911;

    @ObfuscatedName("df.n")
    public static String[] field1918;

    @ObfuscatedName("dx.y")
    public static byte[][][] field1920;

    @ObfuscatedName("dx.b")
    public static int[] field1923;

    @ObfuscatedName("dx.hp")
    public static int field1924;

    @ObfuscatedName("dj.mq")
    public static class23[] field1925;

    @ObfuscatedName("dj.l")
    public static class158 field1926;

    @ObfuscatedName("dj.d")
    public static class13 field1928;

    @ObfuscatedName("dv.y")
    public static int[] field1934;

    @ObfuscatedName("dv.bd")
    public static class24[] field1936;

    @ObfuscatedName("dv.ns")
    public static int field1937;

    @ObfuscatedName("de.h")
    public static int field1944;

    @ObfuscatedName("dd.as")
    public static class135 field1945;

    @ObfuscatedName("dd.g")
    public static int[] field1948;

    @ObfuscatedName("dn.qq")
    public static int field1958;

    @ObfuscatedName("dn.hz")
    public static int field1960;

    @ObfuscatedName("dw.q")
    public static class76[] field1969;

    @ObfuscatedName("f.os")
    public static int field197;

    @ObfuscatedName("dy.l")
    public static String field1976;

    @ObfuscatedName("dy.o")
    public static String field1984;

    @ObfuscatedName("f.ql")
    public static String field199;

    @ObfuscatedName("f.qu")
    public static Image field200;

    @ObfuscatedName("dt.ce")
    public static int field2002;

    @ObfuscatedName("dt.a")
    public static int[] field2015;

    @ObfuscatedName("dt.j")
    public static class164 field2018;

    @ObfuscatedName("ep.be")
    public static int field2033;

    @ObfuscatedName("ec.j")
    public static class76 field2056;

    @ObfuscatedName("ev.iw")
    public static int field2064;

    @ObfuscatedName("ev.r")
    public static int field2065;

    @ObfuscatedName("i.cm")
    public static class135 field207;

    @ObfuscatedName("n.bn")
    public static class159 field211;

    @ObfuscatedName("ed.p")
    public static String field2111;

    @ObfuscatedName("ed.g")
    public static int field2112;

    @ObfuscatedName("ed.aw")
    public static class138 field2116;

    @ObfuscatedName("ed.o")
    public static Applet field2118;

    @ObfuscatedName("n.qj")
    public static int field212;

    @ObfuscatedName("ex.na")
    public static class51 field2120;

    @ObfuscatedName("ex.q")
    public static File field2123;

    @ObfuscatedName("ex.u")
    public static File field2127;

    @ObfuscatedName("ex.x")
    public static String[] field2128;

    @ObfuscatedName("ex.fl")
    public static int field2129;

    @ObfuscatedName("en.qo")
    public static int field2153;

    @ObfuscatedName("ei.rn")
    public static boolean field2162;

    @ObfuscatedName("ei.bo")
    public static class159 field2166;

    @ObfuscatedName("eu.ek")
    public static class76[] field2179;

    @ObfuscatedName("n.dz")
    public static int[][] field222;

    @ObfuscatedName("n.ee")
    public static class76[] field223;

    @ObfuscatedName("n.au")
    public static long field229;

    @ObfuscatedName("n.bc")
    public static int field230;

    @ObfuscatedName("x.po")
    public static Clipboard field232;

    @ObfuscatedName("eg.aj")
    public static class74[] field2490;

    @ObfuscatedName("h.cp")
    public static class215 field250;

    @ObfuscatedName("h.eh")
    public static class74[] field251;

    @ObfuscatedName("em.iq")
    public static int field2523;

    @ObfuscatedName("em.bd")
    public static class159 field2524;

    @ObfuscatedName("el.nz")
    public static class70 field2529;

    @ObfuscatedName("el.r")
    public static class158 field2530;

    @ObfuscatedName("ey.ph")
    public static int field2535;

    @ObfuscatedName("client.l")
    public static client field254;

    @ObfuscatedName("fg.pr")
    public static class151 field2572;

    @ObfuscatedName("fd.am")
    public static class18 field2587;

    @ObfuscatedName("client.i")
    public static String field259;

    @ObfuscatedName("fo.n")
    public static class111 field2595;

    @ObfuscatedName("fj.f")
    public static class163 field2598;

    @ObfuscatedName("fj.dl")
    public static int field2599;

    @ObfuscatedName("l.hn")
    public static int field26;

    @ObfuscatedName("client.k")
    public static class145 field260;

    @ObfuscatedName("fj.g")
    public static long field2600;

    @ObfuscatedName("fj.o")
    public static class135 field2609;

    @ObfuscatedName("client.c")
    public static class203 field261;

    @ObfuscatedName("fj.dx")
    public static class81 field2621;

    @ObfuscatedName("fn.u")
    public static byte[][][] field2622;

    @ObfuscatedName("fu.l")
    public static boolean[] field2630;

    @ObfuscatedName("fu.u")
    public static class158 field2632;

    @ObfuscatedName("fu.g")
    public static class158 field2636;

    @ObfuscatedName("fu.o")
    public static class164[][] field2743;

    @ObfuscatedName("client.n")
    public static int field277;

    @ObfuscatedName("fl.pb")
    public static int field2792;

    @ObfuscatedName("fl.k")
    public static int field2793;

    @ObfuscatedName("fx.mw")
    public static byte field2796;

    @ObfuscatedName("fx.am")
    public static class159 field2797;

    @ObfuscatedName("fx.a")
    public static class55 field2800;

    @ObfuscatedName("fm.c")
    public static short[][] field2808;

    @ObfuscatedName("fm.k")
    public static short[] field2809;

    @ObfuscatedName("fz.g")
    public static class158 field2839;

    @ObfuscatedName("fz.o")
    public static class158 field2840;

    @ObfuscatedName("fz.u")
    public static class175 field2842;

    @ObfuscatedName("fz.r")
    public static class158 field2844;

    @ObfuscatedName("fz.c")
    public static int field2845;

    @ObfuscatedName("fz.l")
    public static class158 field2846;

    @ObfuscatedName("fh.bz")
    public static class159 field2964;

    @ObfuscatedName("fp.nw")
    public static int field2975;

    @ObfuscatedName("gt.cx")
    public static class215 field3020;

    @ObfuscatedName("gt.v")
    public static byte[][][] field3021;

    @ObfuscatedName("ge.qs")
    public static int field3047;

    @ObfuscatedName("gz.g")
    public static class76 field3060;

    @ObfuscatedName("gz.o")
    public static class158 field3061;

    @ObfuscatedName("gc.kp")
    public static int field3062;

    @ObfuscatedName("hu.l")
    public static File field3064;

    @ObfuscatedName("hr.w")
    public static int[] field3081;

    @ObfuscatedName("hr.o")
    public static class105 field3082;

    @ObfuscatedName("hb.c")
    public static class76[] field3096;

    @ObfuscatedName("hw.u")
    public static String[] field3106;

    @ObfuscatedName("hk.k")
    public static int[][] field3107;

    @ObfuscatedName("client.eq")
    public static class74 field337;

    @ObfuscatedName("client.br")
    public static class159 field348;

    @ObfuscatedName("client.f")
    public static String field384;

    @ObfuscatedName("g.ex")
    public static class74[] field42;

    @ObfuscatedName("client.r")
    public static class144 field457;

    @ObfuscatedName("client.eu")
    public static class74[] field458;

    @ObfuscatedName("client.ah")
    public static class159 field481;

    @ObfuscatedName("g.pz")
    public static short[] field49;

    @ObfuscatedName("g.pk")
    public static class126 field51;

    @ObfuscatedName("t.ba")
    public static class76[] field546;

    @ObfuscatedName("t.ak")
    public static class138 field548;

    @ObfuscatedName("t.ir")
    public static class164 field552;

    @ObfuscatedName("t.ar")
    public static int[] field553;

    @ObfuscatedName("w.fb")
    public static int field565;

    @ObfuscatedName("u.q")
    public static byte[][][] field57;

    @ObfuscatedName("p.hr")
    public static class3 field571;

    @ObfuscatedName("p.y")
    public static class76 field572;

    @ObfuscatedName("p.nx")
    public static int field573;

    @ObfuscatedName("p.a")
    public static boolean field576;

    @ObfuscatedName("u.ke")
    public static int field59;

    @ObfuscatedName("z.qz")
    public static Canvas field594;

    @ObfuscatedName("s.nb")
    public static class52 field602;

    @ObfuscatedName("s.nn")
    public static int field608;

    @ObfuscatedName("b.dq")
    public static int[] field632;

    @ObfuscatedName("e.q")
    public static int[] field637;

    @ObfuscatedName("e.qd")
    public static class125 field642;

    @ObfuscatedName("ar.dd")
    public static int field645;

    @ObfuscatedName("q.fd")
    public static int field66;

    @ObfuscatedName("av.gb")
    public static class164 field662;

    @ObfuscatedName("aq.r")
    public static class74 field675;

    @ObfuscatedName("aq.k")
    public static class76[] field677;

    @ObfuscatedName("aq.z")
    public static int[] field681;

    @ObfuscatedName("aq.u")
    public static class76 field682;

    @ObfuscatedName("aq.o")
    public static boolean field684;

    @ObfuscatedName("aq.v")
    public static class74 field693;

    @ObfuscatedName("aq.c")
    public static class76 field698;

    @ObfuscatedName("aq.az")
    public static int field699;

    @ObfuscatedName("q.bm")
    public static class76[] field70;

    @ObfuscatedName("r.c")
    public static int[] field71;

    @ObfuscatedName("aq.id")
    public static class29 field710;

    @ObfuscatedName("aq.bg")
    public static class159 field711;

    @ObfuscatedName("aq.e")
    public static int[] field713;

    @ObfuscatedName("ay.r")
    public static class68 field714;

    @ObfuscatedName("ay.y")
    public static int field722;

    @ObfuscatedName("ac.mg")
    public static byte field723;

    @ObfuscatedName("ao.qx")
    public static Frame field732;

    @ObfuscatedName("ao.m")
    public static class171 field733;

    @ObfuscatedName("r.f")
    public static int[] field74;

    @ObfuscatedName("r.r")
    public static byte[][][] field75;

    @ObfuscatedName("at.fc")
    public static int field802;

    @ObfuscatedName("at.de")
    public static int field808;

    @ObfuscatedName("ai.nt")
    public static int field813;

    @ObfuscatedName("ai.qy")
    public static class73 field816;

    @ObfuscatedName("aa.l")
    public static class158 field822;

    @ObfuscatedName("aa.o")
    public static class158 field831;

    @ObfuscatedName("ap.l")
    public static class158 field859;

    @ObfuscatedName("r.bv")
    public static class159 field86;

    @ObfuscatedName("ap.g")
    public static class158 field901;

    @ObfuscatedName("ad.qw")
    public static int field909;

    @ObfuscatedName("ad.cj")
    public static class138 field910;

    @ObfuscatedName("ad.o")
    public static class158 field916;

    @ObfuscatedName("ad.i")
    public static int field919;

    @ObfuscatedName("ad.lu")
    public static class122 field921;

    @ObfuscatedName("aw.g")
    public static class158 field926;

    @ObfuscatedName("aw.o")
    public static class158 field931;

    @ObfuscatedName("aw.qp")
    public static int field936;

    @ObfuscatedName("aw.l")
    public static String field942;

    @ObfuscatedName("ax.o")
    public static class158 field946;

    @ObfuscatedName("ax.et")
    public static int field962;

    @ObfuscatedName("az.l")
    public static class158 field967;

    @ObfuscatedName("az.hg")
    public static int field968;

    @ObfuscatedName("az.g")
    public static int field973;

    @ObfuscatedName("az.o")
    public static class158 field976;

    @ObfuscatedName("af.o")
    public static class158 field984;

    @ObfuscatedName("af.aj")
    public static class159 field994;

    @ObfuscatedName("af.bx")
    public static class76 field995;

    @ObfuscatedName("af.bm")
    public static class159 field996;

    @ObfuscatedName("al.qe")
    public static Font field998;

    @ObfuscatedName("ax.o(J)V")
    public static final void method832(long arg0) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L != 0L) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var7) {
            }
            return;
        }
        long var2 = arg0 - 1L;
        try {
            Thread.sleep(var2);
        } catch (InterruptedException var9) {
        }
        try {
            Thread.sleep(1L);
        } catch (InterruptedException var8) {
        }
    }

    @ObfuscatedName("de.l(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method2542(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            class130.method2154(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (class130.field2023.startsWith("win") && !arg3) {
            class130.method2154(arg0, 0, "openjs");
            return;
        }
        if (class130.field2023.startsWith("mac")) {
            class130.method2154(arg0, 1, arg2);
            return;
        }
        class130.method2154(arg0, 2, "openjs");
    }

    @ObfuscatedName("bp.o(Ldk;I)Ljava/lang/Integer;")
    public static Integer method1482(class111 arg0) {
        int var1 = 0;
        boolean var2 = false;
        while (true) {
            int var3 = arg0.method2219();
            if (var3 == 255) {
                return var2 ? var1 : null;
            }
            if (var3 != 0) {
                throw new IllegalStateException("");
            }
            while (true) {
                int var4 = arg0.method2219();
                if (var4 == 255) {
                    break;
                }
                arg0.field1861--;
                if (arg0.method2397() != 0) {
                    throw new IllegalStateException("");
                }
                if (var2) {
                    throw new IllegalStateException("");
                }
                var1 = arg0.method2273();
                var2 = true;
            }
        }
    }

    @ObfuscatedName("fm.g(Lfg;IIIZI)V")
    public static void method3179(class158 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class174.field2843 = 1;
        field2844 = arg0;
        field1279 = arg1;
        field722 = arg2;
        field2793 = arg3;
        field159 = arg4;
        field2845 = 10000;
    }

    @ObfuscatedName("ep.u(II)V")
    public static void method2662(int arg0) {
        class15 var1 = (class15) class15.field206.method3435((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field205.length; var2++) {
                var1.field205[var2] = -1;
                var1.field204[var2] = 0;
            }
        }
    }

    @ObfuscatedName("dl.l(Lo;II)V")
    public static void method2145(class1 arg0, int arg1) {
        Object[] var2 = arg0.field8;
        int var3 = (Integer) var2[0];
        class20 var4 = class20.method818(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field568;
        int[] var9 = var4.field556;
        byte var10 = -1;
        class34.field736 = 0;
        try {
            field1948 = new int[var4.field558];
            int var11 = 0;
            field3106 = new String[var4.field559];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field10 == null ? -1 : arg0.field10.field2710;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field10 == null ? -1 : arg0.field10.field2640;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2710;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2640;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field3;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    field1948[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field16;
                    }
                    field3106[var12++] = var15;
                }
            }
            int var16 = 0;
            class34.field746 = arg0.field11;
            label2941: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var435 = var8[var7];
                if (var435 < 100) {
                    if (var435 == 0) {
                        class34.field740[var5++] = var9[var7];
                        continue;
                    }
                    if (var435 == 1) {
                        int var17 = var9[var7];
                        class34.field740[var5++] = class167.field2791[var17];
                        continue;
                    }
                    if (var435 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class167.field2791[var18] = class34.field740[var5];
                        client.method3038(var18);
                        continue;
                    }
                    if (var435 == 3) {
                        class34.field743[var6++] = var4.field557[var7];
                        continue;
                    }
                    if (var435 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var435 == 7) {
                        var5 -= 2;
                        if (class34.field740[var5 + 1] != class34.field740[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var435 == 8) {
                        var5 -= 2;
                        if (class34.field740[var5 + 1] == class34.field740[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var435 == 9) {
                        var5 -= 2;
                        if (class34.field740[var5] < class34.field740[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var435 == 10) {
                        var5 -= 2;
                        if (class34.field740[var5] > class34.field740[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var435 == 21) {
                        if (class34.field736 == 0) {
                            return;
                        }
                        class14 var19 = class34.field747[--class34.field736];
                        var4 = var19.field201;
                        var8 = var4.field568;
                        var9 = var4.field556;
                        var7 = var19.field198;
                        field1948 = var19.field192;
                        field3106 = var19.field190;
                        continue;
                    }
                    if (var435 == 25) {
                        int var20 = var9[var7];
                        class34.field740[var5++] = class167.method558(var20);
                        continue;
                    }
                    if (var435 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class167.method1934(var21, class34.field740[var5]);
                        continue;
                    }
                    if (var435 == 31) {
                        var5 -= 2;
                        if (class34.field740[var5] <= class34.field740[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var435 == 32) {
                        var5 -= 2;
                        if (class34.field740[var5] >= class34.field740[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var435 == 33) {
                        class34.field740[var5++] = field1948[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var435 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        field1948[var10001] = class34.field740[var5];
                        continue;
                    }
                    if (var435 == 35) {
                        class34.field743[var6++] = field3106[var9[var7]];
                        continue;
                    }
                    if (var435 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        field3106[var10001] = class34.field743[var6];
                        continue;
                    }
                    if (var435 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = class34.field743;
                        String var24;
                        if (var22 == 0) {
                            var24 = "";
                        } else if (var22 == 1) {
                            String var25 = var23[var6];
                            if (var25 == null) {
                                var24 = "null";
                            } else {
                                var24 = var25.toString();
                            }
                        } else {
                            int var26 = var6 + var22;
                            int var27 = 0;
                            for (int var28 = var6; var28 < var26; var28++) {
                                String var29 = var23[var28];
                                if (var29 == null) {
                                    var27 += 4;
                                } else {
                                    var27 += var29.length();
                                }
                            }
                            StringBuilder var30 = new StringBuilder(var27);
                            for (int var31 = var6; var31 < var26; var31++) {
                                String var32 = var23[var31];
                                if (var32 == null) {
                                    var30.append("null");
                                } else {
                                    var30.append(var32);
                                }
                            }
                            var24 = var30.toString();
                        }
                        class34.field743[var6++] = var24;
                        continue;
                    }
                    if (var435 == 38) {
                        var5--;
                        continue;
                    }
                    if (var435 == 39) {
                        var6--;
                        continue;
                    }
                    if (var435 == 40) {
                        int var34 = var9[var7];
                        class20 var35 = class20.method818(var34);
                        int[] var36 = new int[var35.field558];
                        String[] var37 = new String[var35.field559];
                        for (int var38 = 0; var38 < var35.field560; var38++) {
                            var36[var38] = class34.field740[var5 - var35.field560 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field561; var39++) {
                            var37[var39] = class34.field743[var6 - var35.field561 + var39];
                        }
                        var5 -= var35.field560;
                        var6 -= var35.field561;
                        class14 var40 = new class14();
                        var40.field201 = var4;
                        var40.field198 = var7;
                        var40.field192 = field1948;
                        var40.field190 = field3106;
                        class34.field747[++class34.field736 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field568;
                        var9 = var35.field556;
                        var7 = -1;
                        field1948 = var36;
                        field3106 = var37;
                        continue;
                    }
                    if (var435 == 42) {
                        class34.field740[var5++] = client.field461[var9[var7]];
                        continue;
                    }
                    if (var435 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field461[var10001] = class34.field740[var5];
                        continue;
                    }
                    if (var435 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = class34.field740[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            class34.field738[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2941;
                                }
                                class34.field739[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var435 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = class34.field740[var5];
                        if (var47 >= 0 && var47 < class34.field738[var46]) {
                            class34.field740[var5++] = class34.field739[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var435 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = class34.field740[var5];
                        if (var49 >= 0 && var49 < class34.field738[var48]) {
                            class34.field739[var48][var49] = class34.field740[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var435 == 47) {
                        String var50 = client.field439[var9[var7]];
                        if (var50 == null) {
                            var50 = "null";
                        }
                        class34.field743[var6++] = var50;
                        continue;
                    }
                    if (var435 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field439[var10001] = class34.field743[var6];
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var435 < 1000) {
                    if (var435 == 100) {
                        var5 -= 3;
                        int var52 = class34.field740[var5];
                        int var53 = class34.field740[var5 + 1];
                        int var54 = class34.field740[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class164 var55 = class164.method2499(var52);
                        if (var55.field2761 == null) {
                            var55.field2761 = new class164[var54 + 1];
                        }
                        if (var55.field2761.length <= var54) {
                            class164[] var56 = new class164[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2761.length; var57++) {
                                var56[var57] = var55.field2761[var57];
                            }
                            var55.field2761 = var56;
                        }
                        if (var54 > 0 && var55.field2761[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class164 var58 = new class164();
                        var58.field2756 = var53;
                        var58.field2658 = var58.field2710 = var55.field2710;
                        var58.field2640 = var54;
                        var58.field2657 = true;
                        var55.field2761[var54] = var58;
                        if (var51) {
                            field1910 = var58;
                        } else {
                            field2018 = var58;
                        }
                        client.method33(var55);
                        continue;
                    }
                    if (var435 == 101) {
                        class164 var59 = var51 ? field1910 : field2018;
                        class164 var60 = class164.method2499(var59.field2710);
                        var60.field2761[var59.field2640] = null;
                        client.method33(var60);
                        continue;
                    }
                    if (var435 == 102) {
                        var5--;
                        class164 var61 = class164.method2499(class34.field740[var5]);
                        var61.field2761 = null;
                        client.method33(var61);
                        continue;
                    }
                    if (var435 == 200) {
                        var5 -= 2;
                        int var62 = class34.field740[var5];
                        int var63 = class34.field740[var5 + 1];
                        class164 var64 = class164.method629(var62, var63);
                        if (var64 != null && var63 != -1) {
                            class34.field740[var5++] = 1;
                            if (var51) {
                                field1910 = var64;
                            } else {
                                field2018 = var64;
                            }
                            continue;
                        }
                        class34.field740[var5++] = 0;
                        continue;
                    }
                    if (var435 == 201) {
                        var5--;
                        class164 var65 = class164.method2499(class34.field740[var5]);
                        if (var65 == null) {
                            class34.field740[var5++] = 0;
                        } else {
                            class34.field740[var5++] = 1;
                            if (var51) {
                                field1910 = var65;
                            } else {
                                field2018 = var65;
                            }
                        }
                        continue;
                    }
                } else if (!(var435 < 1000 || var435 >= 1100) || !(var435 < 2000 || var435 >= 2100)) {
                    int var66 = -1;
                    class164 var67;
                    if (var435 >= 2000) {
                        var435 -= 1000;
                        var5--;
                        var66 = class34.field740[var5];
                        var67 = class164.method2499(var66);
                    } else {
                        var67 = var51 ? field1910 : field2018;
                    }
                    if (var435 == 1000) {
                        var5 -= 4;
                        var67.field2648 = class34.field740[var5];
                        var67.field2649 = class34.field740[var5 + 1];
                        var67.field2764 = class34.field740[var5 + 2];
                        var67.field2645 = class34.field740[var5 + 3];
                        client.method33(var67);
                        client.method163(var67);
                        if (var66 != -1 && var67.field2756 == 0) {
                            client.method693(field2743[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var435 == 1001) {
                        var5 -= 4;
                        var67.field2650 = class34.field740[var5];
                        var67.field2651 = class34.field740[var5 + 1];
                        var67.field2643 = class34.field740[var5 + 2];
                        var67.field2647 = class34.field740[var5 + 3];
                        client.method33(var67);
                        client.method163(var67);
                        if (var66 != -1 && var67.field2756 == 0) {
                            client.method693(field2743[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var435 == 1003) {
                        var5--;
                        boolean var68 = class34.field740[var5] == 1;
                        if (var67.field2674 != var68) {
                            var67.field2674 = var68;
                            client.method33(var67);
                        }
                        continue;
                    }
                    if (var435 == 1005) {
                        var5--;
                        var67.field2770 = class34.field740[var5] == 1;
                        continue;
                    }
                } else if (!(var435 < 1100 || var435 >= 1200) || !(var435 < 2100 || var435 >= 2200)) {
                    int var69 = -1;
                    class164 var70;
                    if (var435 >= 2000) {
                        var435 -= 1000;
                        var5--;
                        var69 = class34.field740[var5];
                        var70 = class164.method2499(var69);
                    } else {
                        var70 = var51 ? field1910 : field2018;
                    }
                    if (var435 == 1100) {
                        var5 -= 2;
                        var70.field2660 = class34.field740[var5];
                        if (var70.field2660 > var70.field2662 - var70.field2654) {
                            var70.field2660 = var70.field2662 - var70.field2654;
                        }
                        if (var70.field2660 < 0) {
                            var70.field2660 = 0;
                        }
                        var70.field2661 = class34.field740[var5 + 1];
                        if (var70.field2661 > var70.field2663 - var70.field2655) {
                            var70.field2661 = var70.field2663 - var70.field2655;
                        }
                        if (var70.field2661 < 0) {
                            var70.field2661 = 0;
                        }
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1101) {
                        var5--;
                        var70.field2639 = class34.field740[var5];
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1102) {
                        var5--;
                        var70.field2668 = class34.field740[var5] == 1;
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1103) {
                        var5--;
                        var70.field2669 = class34.field740[var5];
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1104) {
                        var5--;
                        var70.field2672 = class34.field740[var5];
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1105) {
                        var5--;
                        var70.field2676 = class34.field740[var5];
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1106) {
                        var5--;
                        var70.field2708 = class34.field740[var5];
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1107) {
                        var5--;
                        var70.field2675 = class34.field740[var5] == 1;
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1108) {
                        var70.field2747 = 1;
                        var5--;
                        var70.field2681 = class34.field740[var5];
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1109) {
                        var5 -= 6;
                        var70.field2686 = class34.field740[var5];
                        var70.field2687 = class34.field740[var5 + 1];
                        var70.field2680 = class34.field740[var5 + 2];
                        var70.field2689 = class34.field740[var5 + 3];
                        var70.field2753 = class34.field740[var5 + 4];
                        var70.field2691 = class34.field740[var5 + 5];
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1110) {
                        var5--;
                        int var71 = class34.field740[var5];
                        if (var70.field2684 != var71) {
                            var70.field2684 = var71;
                            var70.field2759 = 0;
                            var70.field2760 = 0;
                            client.method33(var70);
                        }
                        continue;
                    }
                    if (var435 == 1111) {
                        var5--;
                        var70.field2694 = class34.field740[var5] == 1;
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1112) {
                        var6--;
                        String var72 = class34.field743[var6];
                        if (!var72.equals(var70.field2697)) {
                            var70.field2697 = var72;
                            client.method33(var70);
                        }
                        continue;
                    }
                    if (var435 == 1113) {
                        var5--;
                        var70.field2696 = class34.field740[var5];
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1114) {
                        var5 -= 3;
                        var70.field2644 = class34.field740[var5];
                        var70.field2701 = class34.field740[var5 + 1];
                        var70.field2699 = class34.field740[var5 + 2];
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1115) {
                        var5--;
                        var70.field2700 = class34.field740[var5] == 1;
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1116) {
                        var5--;
                        var70.field2652 = class34.field740[var5];
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1117) {
                        var5--;
                        var70.field2677 = class34.field740[var5];
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1118) {
                        var5--;
                        var70.field2766 = class34.field740[var5] == 1;
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1119) {
                        var5--;
                        var70.field2679 = class34.field740[var5] == 1;
                        client.method33(var70);
                        continue;
                    }
                    if (var435 == 1120) {
                        var5 -= 2;
                        var70.field2662 = class34.field740[var5];
                        var70.field2663 = class34.field740[var5 + 1];
                        client.method33(var70);
                        if (var69 != -1 && var70.field2756 == 0) {
                            client.method693(field2743[var69 >> 16], var70, false);
                        }
                        continue;
                    }
                    if (var435 == 1121) {
                        client.method2028(var70.field2710, var70.field2640);
                        client.field540 = var70;
                        client.method33(var70);
                        continue;
                    }
                } else if (!(var435 < 1200 || var435 >= 1300) || !(var435 < 2200 || var435 >= 2300)) {
                    class164 var73;
                    if (var435 >= 2000) {
                        var435 -= 1000;
                        var5--;
                        var73 = class164.method2499(class34.field740[var5]);
                    } else {
                        var73 = var51 ? field1910 : field2018;
                    }
                    client.method33(var73);
                    if (var435 == 1200 || var435 == 1205 || var435 == 1212) {
                        var5 -= 2;
                        int var74 = class34.field740[var5];
                        int var75 = class34.field740[var5 + 1];
                        var73.field2757 = var74;
                        var73.field2758 = var75;
                        class47 var76 = class47.method2700(var74);
                        var73.field2680 = var76.field1045;
                        var73.field2689 = var76.field1046;
                        var73.field2753 = var76.field1047;
                        var73.field2686 = var76.field1070;
                        var73.field2687 = var76.field1049;
                        var73.field2691 = var76.field1059;
                        if (var435 == 1205) {
                            var73.field2695 = 0;
                        } else if (var435 == 1212 | var76.field1080 == 1) {
                            var73.field2695 = 1;
                        } else {
                            var73.field2695 = 2;
                        }
                        if (var73.field2638 > 0) {
                            var73.field2691 = var73.field2691 * 32 / var73.field2638;
                        } else if (var73.field2650 > 0) {
                            var73.field2691 = var73.field2691 * 32 / var73.field2650;
                        }
                        continue;
                    }
                    if (var435 == 1201) {
                        var73.field2747 = 2;
                        var5--;
                        var73.field2681 = class34.field740[var5];
                        continue;
                    }
                    if (var435 == 1202) {
                        var73.field2747 = 3;
                        var73.field2681 = field571.field29.method3154();
                        continue;
                    }
                } else if (var435 >= 1300 && var435 < 1400 || var435 >= 2300 && var435 < 2400) {
                    class164 var77;
                    if (var435 >= 2000) {
                        var435 -= 1000;
                        var5--;
                        var77 = class164.method2499(class34.field740[var5]);
                    } else {
                        var77 = var51 ? field1910 : field2018;
                    }
                    if (var435 == 1300) {
                        var5--;
                        int var78 = class34.field740[var5] - 1;
                        if (var78 >= 0 && var78 <= 9) {
                            var6--;
                            var77.method3080(var78, class34.field743[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var435 == 1301) {
                        var5 -= 2;
                        int var79 = class34.field740[var5];
                        int var80 = class34.field740[var5 + 1];
                        var77.field2712 = class164.method629(var79, var80);
                        continue;
                    }
                    if (var435 == 1302) {
                        var5--;
                        var77.field2715 = class34.field740[var5] == 1;
                        continue;
                    }
                    if (var435 == 1303) {
                        var5--;
                        var77.field2641 = class34.field740[var5];
                        continue;
                    }
                    if (var435 == 1304) {
                        var5--;
                        var77.field2698 = class34.field740[var5];
                        continue;
                    }
                    if (var435 == 1305) {
                        var6--;
                        var77.field2678 = class34.field743[var6];
                        continue;
                    }
                    if (var435 == 1306) {
                        var6--;
                        var77.field2716 = class34.field743[var6];
                        continue;
                    }
                    if (var435 == 1307) {
                        var77.field2769 = null;
                        continue;
                    }
                } else {
                    if (var435 >= 1400 && var435 < 1500 || var435 >= 2400 && var435 < 2500) {
                        class164 var81;
                        if (var435 >= 2000) {
                            var435 -= 1000;
                            var5--;
                            var81 = class164.method2499(class34.field740[var5]);
                        } else {
                            var81 = var51 ? field1910 : field2018;
                        }
                        var6--;
                        String var82 = class34.field743[var6];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var5--;
                            int var84 = class34.field740[var5];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var5--;
                                    var83[var84] = class34.field740[var5];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var6--;
                                var85[var86] = class34.field743[var6];
                            } else {
                                var5--;
                                var85[var86] = Integer.valueOf(class34.field740[var5]);
                            }
                        }
                        var5--;
                        int var87 = class34.field740[var5];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var435 == 1400) {
                            var81.field2719 = var85;
                        }
                        if (var435 == 1401) {
                            var81.field2722 = var85;
                        }
                        if (var435 == 1402) {
                            var81.field2721 = var85;
                        }
                        if (var435 == 1403) {
                            var81.field2692 = var85;
                        }
                        if (var435 == 1404) {
                            var81.field2725 = var85;
                        }
                        if (var435 == 1405) {
                            var81.field2726 = var85;
                        }
                        if (var435 == 1406) {
                            var81.field2729 = var85;
                        }
                        if (var435 == 1407) {
                            var81.field2688 = var85;
                            var81.field2731 = var83;
                        }
                        if (var435 == 1408) {
                            var81.field2736 = var85;
                        }
                        if (var435 == 1409) {
                            var81.field2737 = var85;
                        }
                        if (var435 == 1410) {
                            var81.field2727 = var85;
                        }
                        if (var435 == 1411) {
                            var81.field2730 = var85;
                        }
                        if (var435 == 1412) {
                            var81.field2724 = var85;
                        }
                        if (var435 == 1414) {
                            var81.field2732 = var85;
                            var81.field2629 = var83;
                        }
                        if (var435 == 1415) {
                            var81.field2763 = var85;
                            var81.field2735 = var83;
                        }
                        if (var435 == 1416) {
                            var81.field2728 = var85;
                        }
                        if (var435 == 1417) {
                            var81.field2738 = var85;
                        }
                        if (var435 == 1418) {
                            var81.field2739 = var85;
                        }
                        if (var435 == 1419) {
                            var81.field2646 = var85;
                        }
                        if (var435 == 1420) {
                            var81.field2741 = var85;
                        }
                        if (var435 == 1421) {
                            var81.field2637 = var85;
                        }
                        if (var435 == 1422) {
                            var81.field2723 = var85;
                        }
                        if (var435 == 1423) {
                            var81.field2744 = var85;
                        }
                        if (var435 == 1424) {
                            var81.field2745 = var85;
                        }
                        if (var435 == 1425) {
                            var81.field2733 = var85;
                        }
                        if (var435 == 1426) {
                            var81.field2702 = var85;
                        }
                        if (var435 == 1427) {
                            var81.field2746 = var85;
                        }
                        var81.field2713 = true;
                        continue;
                    }
                    if (var435 < 1600) {
                        class164 var88 = var51 ? field1910 : field2018;
                        if (var435 == 1500) {
                            class34.field740[var5++] = var88.field2742;
                            continue;
                        }
                        if (var435 == 1501) {
                            class34.field740[var5++] = var88.field2664;
                            continue;
                        }
                        if (var435 == 1502) {
                            class34.field740[var5++] = var88.field2654;
                            continue;
                        }
                        if (var435 == 1503) {
                            class34.field740[var5++] = var88.field2655;
                            continue;
                        }
                        if (var435 == 1504) {
                            class34.field740[var5++] = var88.field2674 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 1505) {
                            class34.field740[var5++] = var88.field2658;
                            continue;
                        }
                    } else if (var435 < 1700) {
                        class164 var89 = var51 ? field1910 : field2018;
                        if (var435 == 1600) {
                            class34.field740[var5++] = var89.field2660;
                            continue;
                        }
                        if (var435 == 1601) {
                            class34.field740[var5++] = var89.field2661;
                            continue;
                        }
                        if (var435 == 1602) {
                            class34.field743[var6++] = var89.field2697;
                            continue;
                        }
                        if (var435 == 1603) {
                            class34.field740[var5++] = var89.field2662;
                            continue;
                        }
                        if (var435 == 1604) {
                            class34.field740[var5++] = var89.field2663;
                            continue;
                        }
                        if (var435 == 1605) {
                            class34.field740[var5++] = var89.field2691;
                            continue;
                        }
                        if (var435 == 1606) {
                            class34.field740[var5++] = var89.field2680;
                            continue;
                        }
                        if (var435 == 1607) {
                            class34.field740[var5++] = var89.field2753;
                            continue;
                        }
                        if (var435 == 1608) {
                            class34.field740[var5++] = var89.field2689;
                            continue;
                        }
                        if (var435 == 1609) {
                            class34.field740[var5++] = var89.field2669;
                            continue;
                        }
                    } else if (var435 < 1800) {
                        class164 var90 = var51 ? field1910 : field2018;
                        if (var435 == 1700) {
                            class34.field740[var5++] = var90.field2757;
                            continue;
                        }
                        if (var435 == 1701) {
                            if (var90.field2757 == -1) {
                                class34.field740[var5++] = 0;
                            } else {
                                class34.field740[var5++] = var90.field2758;
                            }
                            continue;
                        }
                        if (var435 == 1702) {
                            class34.field740[var5++] = var90.field2640;
                            continue;
                        }
                    } else if (var435 < 1900) {
                        class164 var91 = var51 ? field1910 : field2018;
                        if (var435 == 1800) {
                            int[] var92 = class34.field740;
                            int var93 = var5++;
                            int var94 = client.method683(var91);
                            int var95 = var94 >> 11 & 0x3F;
                            var92[var93] = var95;
                            continue;
                        }
                        if (var435 == 1801) {
                            var5--;
                            int var96 = class34.field740[var5];
                            int var436 = var96 - 1;
                            if (var91.field2769 != null && var436 < var91.field2769.length && var91.field2769[var436] != null) {
                                class34.field743[var6++] = var91.field2769[var436];
                                continue;
                            }
                            class34.field743[var6++] = "";
                            continue;
                        }
                        if (var435 == 1802) {
                            if (var91.field2678 == null) {
                                class34.field743[var6++] = "";
                            } else {
                                class34.field743[var6++] = var91.field2678;
                            }
                            continue;
                        }
                    } else if (var435 >= 1900 && var435 < 2000 || var435 >= 2900 && var435 < 3000) {
                        class164 var97;
                        if (var435 >= 2000) {
                            var435 -= 1000;
                            var5--;
                            var97 = class164.method2499(class34.field740[var5]);
                        } else {
                            var97 = var51 ? field1910 : field2018;
                        }
                        if (var435 == 1927) {
                            if (class34.field746 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var97.field2746 == null) {
                                return;
                            }
                            class1 var98 = new class1();
                            var98.field10 = var97;
                            var98.field8 = var97.field2746;
                            var98.field11 = class34.field746 + 1;
                            client.field258.method3470(arg0);
                            continue;
                        }
                    } else if (var435 < 2600) {
                        var5--;
                        class164 var99 = class164.method2499(class34.field740[var5]);
                        if (var435 == 2500) {
                            class34.field740[var5++] = var99.field2742;
                            continue;
                        }
                        if (var435 == 2501) {
                            class34.field740[var5++] = var99.field2664;
                            continue;
                        }
                        if (var435 == 2502) {
                            class34.field740[var5++] = var99.field2654;
                            continue;
                        }
                        if (var435 == 2503) {
                            class34.field740[var5++] = var99.field2655;
                            continue;
                        }
                        if (var435 == 2504) {
                            class34.field740[var5++] = var99.field2674 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 2505) {
                            class34.field740[var5++] = var99.field2658;
                            continue;
                        }
                    } else if (var435 < 2700) {
                        var5--;
                        class164 var100 = class164.method2499(class34.field740[var5]);
                        if (var435 == 2600) {
                            class34.field740[var5++] = var100.field2660;
                            continue;
                        }
                        if (var435 == 2601) {
                            class34.field740[var5++] = var100.field2661;
                            continue;
                        }
                        if (var435 == 2602) {
                            class34.field743[var6++] = var100.field2697;
                            continue;
                        }
                        if (var435 == 2603) {
                            class34.field740[var5++] = var100.field2662;
                            continue;
                        }
                        if (var435 == 2604) {
                            class34.field740[var5++] = var100.field2663;
                            continue;
                        }
                        if (var435 == 2605) {
                            class34.field740[var5++] = var100.field2691;
                            continue;
                        }
                        if (var435 == 2606) {
                            class34.field740[var5++] = var100.field2680;
                            continue;
                        }
                        if (var435 == 2607) {
                            class34.field740[var5++] = var100.field2753;
                            continue;
                        }
                        if (var435 == 2608) {
                            class34.field740[var5++] = var100.field2689;
                            continue;
                        }
                        if (var435 == 2609) {
                            class34.field740[var5++] = var100.field2669;
                            continue;
                        }
                    } else if (var435 < 2800) {
                        if (var435 == 2700) {
                            var5--;
                            class164 var101 = class164.method2499(class34.field740[var5]);
                            class34.field740[var5++] = var101.field2757;
                            continue;
                        }
                        if (var435 == 2701) {
                            var5--;
                            class164 var102 = class164.method2499(class34.field740[var5]);
                            if (var102.field2757 == -1) {
                                class34.field740[var5++] = 0;
                            } else {
                                class34.field740[var5++] = var102.field2758;
                            }
                            continue;
                        }
                        if (var435 == 2702) {
                            var5--;
                            int var103 = class34.field740[var5];
                            class4 var104 = (class4) client.field424.method3435((long) var103);
                            if (var104 == null) {
                                class34.field740[var5++] = 0;
                            } else {
                                class34.field740[var5++] = 1;
                            }
                            continue;
                        }
                        if (var435 == 2706) {
                            class34.field740[var5++] = client.field423;
                            continue;
                        }
                    } else if (var435 < 2900) {
                        var5--;
                        class164 var105 = class164.method2499(class34.field740[var5]);
                        if (var435 == 2800) {
                            int[] var106 = class34.field740;
                            int var107 = var5++;
                            int var108 = client.method683(var105);
                            int var109 = var108 >> 11 & 0x3F;
                            var106[var107] = var109;
                            continue;
                        }
                        if (var435 == 2801) {
                            var5--;
                            int var110 = class34.field740[var5];
                            int var437 = var110 - 1;
                            if (var105.field2769 != null && var437 < var105.field2769.length && var105.field2769[var437] != null) {
                                class34.field743[var6++] = var105.field2769[var437];
                                continue;
                            }
                            class34.field743[var6++] = "";
                            continue;
                        }
                        if (var435 == 2802) {
                            if (var105.field2678 == null) {
                                class34.field743[var6++] = "";
                            } else {
                                class34.field743[var6++] = var105.field2678;
                            }
                            continue;
                        }
                    } else if (var435 < 3200) {
                        if (var435 == 3100) {
                            var6--;
                            String var111 = class34.field743[var6];
                            class11.method626(0, "", var111);
                            continue;
                        }
                        if (var435 == 3101) {
                            var5 -= 2;
                            client.method1473(field571, class34.field740[var5], class34.field740[var5 + 1]);
                            continue;
                        }
                        if (var435 == 3103) {
                            client.method740();
                            continue;
                        }
                        if (var435 == 3104) {
                            var6--;
                            String var112 = class34.field743[var6];
                            int var113 = 0;
                            if (class154.method537(var112)) {
                                int var114 = class154.method1937(var112, 10, true);
                                var113 = var114;
                            }
                            client.field302.method2477(99);
                            client.field302.method2369(var113);
                            continue;
                        }
                        if (var435 == 3105) {
                            var6--;
                            String var115 = class34.field743[var6];
                            client.field302.method2477(9);
                            client.field302.method2204(var115.length() + 1);
                            client.field302.method2269(var115);
                            continue;
                        }
                        if (var435 == 3106) {
                            var6--;
                            String var116 = class34.field743[var6];
                            client.field302.method2477(45);
                            client.field302.method2204(var116.length() + 1);
                            client.field302.method2269(var116);
                            continue;
                        }
                        if (var435 == 3107) {
                            var5--;
                            int var117 = class34.field740[var5];
                            var6--;
                            String var118 = class34.field743[var6];
                            boolean var119 = false;
                            for (int var120 = 0; var120 < client.field382; var120++) {
                                class3 var121 = client.field381[client.field383[var120]];
                                if (var121 != null && var121.field38 != null && var121.field38.equalsIgnoreCase(var118)) {
                                    if (var117 == 1) {
                                        client.field302.method2477(125);
                                        client.field302.method2424(client.field383[var120]);
                                        client.field302.method2204(0);
                                    } else if (var117 == 4) {
                                        client.field302.method2477(44);
                                        client.field302.method2324(0);
                                        client.field302.method2251(client.field383[var120]);
                                    } else if (var117 == 6) {
                                        client.field302.method2477(251);
                                        client.field302.method2424(client.field383[var120]);
                                        client.field302.method2324(0);
                                    } else if (var117 == 7) {
                                        client.field302.method2477(126);
                                        client.field302.method2324(0);
                                        client.field302.method2251(client.field383[var120]);
                                    }
                                    var119 = true;
                                    break;
                                }
                            }
                            if (!var119) {
                                class11.method626(4, "", class148.field2237 + var118);
                            }
                            continue;
                        }
                        if (var435 == 3108) {
                            var5 -= 3;
                            int var122 = class34.field740[var5];
                            int var123 = class34.field740[var5 + 1];
                            int var124 = class34.field740[var5 + 2];
                            class164 var125 = class164.method2499(var124);
                            client.method2689(var125, var122, var123);
                            continue;
                        }
                        if (var435 == 3109) {
                            var5 -= 2;
                            int var126 = class34.field740[var5];
                            int var127 = class34.field740[var5 + 1];
                            class164 var128 = var51 ? field1910 : field2018;
                            client.method2689(var128, var126, var127);
                            continue;
                        }
                        if (var435 == 3110) {
                            var5--;
                            field1276 = class34.field740[var5] == 1;
                            continue;
                        }
                        if (var435 == 3111) {
                            class34.field740[var5++] = field1877.field130 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3112) {
                            var5--;
                            field1877.field130 = class34.field740[var5] == 1;
                            class9.method2588();
                            continue;
                        }
                        if (var435 == 3113) {
                            var6--;
                            String var129 = class34.field743[var6];
                            var5--;
                            boolean var130 = class34.field740[var5] == 1;
                            class130.method863(var129, var130, false);
                            continue;
                        }
                        if (var435 == 3115) {
                            var5--;
                            int var131 = class34.field740[var5];
                            client.field302.method2477(65);
                            client.field302.method2205(var131);
                            continue;
                        }
                    } else if (var435 < 3300) {
                        if (var435 == 3200) {
                            var5 -= 3;
                            client.method25(class34.field740[var5], class34.field740[var5 + 1], class34.field740[var5 + 2]);
                            continue;
                        }
                        if (var435 == 3201) {
                            var5--;
                            client.method3568(class34.field740[var5]);
                            continue;
                        }
                        if (var435 == 3202) {
                            var5 -= 2;
                            int var132 = class34.field740[var5];
                            int var10000 = class34.field740[var5 + 1];
                            if (client.field487 != 0 && var132 != -1) {
                                method3179(field2166, var132, 0, client.field487, false);
                                client.field504 = true;
                            }
                            continue;
                        }
                    } else if (var435 < 3400) {
                        if (var435 == 3300) {
                            class34.field740[var5++] = client.field270;
                            continue;
                        }
                        if (var435 == 3301) {
                            var5 -= 2;
                            int var134 = class34.field740[var5];
                            int var135 = class34.field740[var5 + 1];
                            class34.field740[var5++] = class15.method166(var134, var135);
                            continue;
                        }
                        if (var435 == 3302) {
                            var5 -= 2;
                            int var136 = class34.field740[var5];
                            int var137 = class34.field740[var5 + 1];
                            int[] var138 = class34.field740;
                            int var139 = var5++;
                            class15 var140 = (class15) class15.field206.method3435((long) var136);
                            int var141;
                            if (var140 == null) {
                                var141 = 0;
                            } else if (var137 >= 0 && var137 < var140.field204.length) {
                                var141 = var140.field204[var137];
                            } else {
                                var141 = 0;
                            }
                            var138[var139] = var141;
                            continue;
                        }
                        if (var435 == 3303) {
                            var5 -= 2;
                            int var142 = class34.field740[var5];
                            int var143 = class34.field740[var5 + 1];
                            class34.field740[var5++] = class15.method746(var142, var143);
                            continue;
                        }
                        if (var435 == 3304) {
                            var5--;
                            int var144 = class34.field740[var5];
                            class34.field740[var5++] = class46.method165(var144).field1026;
                            continue;
                        }
                        if (var435 == 3305) {
                            var5--;
                            int var145 = class34.field740[var5];
                            class34.field740[var5++] = client.field265[var145];
                            continue;
                        }
                        if (var435 == 3306) {
                            var5--;
                            int var146 = class34.field740[var5];
                            class34.field740[var5++] = client.field401[var146];
                            continue;
                        }
                        if (var435 == 3307) {
                            var5--;
                            int var147 = class34.field740[var5];
                            class34.field740[var5++] = client.field402[var147];
                            continue;
                        }
                        if (var435 == 3308) {
                            int var148 = field1086;
                            int var149 = (field571.field804 >> 7) + field120;
                            int var150 = (field571.field750 >> 7) + field124;
                            class34.field740[var5++] = (var148 << 28) + (var149 << 14) + var150;
                            continue;
                        }
                        if (var435 == 3309) {
                            var5--;
                            int var151 = class34.field740[var5];
                            class34.field740[var5++] = var151 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var435 == 3310) {
                            var5--;
                            int var152 = class34.field740[var5];
                            class34.field740[var5++] = var152 >> 28;
                            continue;
                        }
                        if (var435 == 3311) {
                            var5--;
                            int var153 = class34.field740[var5];
                            class34.field740[var5++] = var153 & 0x3FFF;
                            continue;
                        }
                        if (var435 == 3312) {
                            class34.field740[var5++] = client.field407 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3313) {
                            var5 -= 2;
                            int var154 = class34.field740[var5] + 32768;
                            int var155 = class34.field740[var5 + 1];
                            class34.field740[var5++] = class15.method166(var154, var155);
                            continue;
                        }
                        if (var435 == 3314) {
                            var5 -= 2;
                            int var156 = class34.field740[var5] + 32768;
                            int var157 = class34.field740[var5 + 1];
                            int[] var158 = class34.field740;
                            int var159 = var5++;
                            class15 var160 = (class15) class15.field206.method3435((long) var156);
                            int var161;
                            if (var160 == null) {
                                var161 = 0;
                            } else if (var157 >= 0 && var157 < var160.field204.length) {
                                var161 = var160.field204[var157];
                            } else {
                                var161 = 0;
                            }
                            var158[var159] = var161;
                            continue;
                        }
                        if (var435 == 3315) {
                            var5 -= 2;
                            int var162 = class34.field740[var5] + 32768;
                            int var163 = class34.field740[var5 + 1];
                            class34.field740[var5++] = class15.method746(var162, var163);
                            continue;
                        }
                        if (var435 == 3316) {
                            if (client.field430 >= 2) {
                                class34.field740[var5++] = client.field430;
                            } else {
                                class34.field740[var5++] = 0;
                            }
                            continue;
                        }
                        if (var435 == 3317) {
                            class34.field740[var5++] = client.field470;
                            continue;
                        }
                        if (var435 == 3318) {
                            class34.field740[var5++] = client.field256;
                            continue;
                        }
                        if (var435 == 3321) {
                            class34.field740[var5++] = client.field428;
                            continue;
                        }
                        if (var435 == 3322) {
                            class34.field740[var5++] = client.field291;
                            continue;
                        }
                        if (var435 == 3323) {
                            if (client.field432) {
                                class34.field740[var5++] = 1;
                            } else {
                                class34.field740[var5++] = 0;
                            }
                            continue;
                        }
                        if (var435 == 3324) {
                            class34.field740[var5++] = client.field385;
                            continue;
                        }
                    } else if (var435 < 3500) {
                        if (var435 == 3400) {
                            var5 -= 2;
                            int var164 = class34.field740[var5];
                            int var165 = class34.field740[var5 + 1];
                            class45 var166 = class45.method2919(var164);
                            if (var166.field1010 != 's') {
                            }
                            for (int var167 = 0; var167 < var166.field1013; var167++) {
                                if (var166.field1016[var167] == var165) {
                                    class34.field743[var6++] = var166.field1008[var167];
                                    var166 = null;
                                    break;
                                }
                            }
                            if (var166 != null) {
                                class34.field743[var6++] = var166.field1017;
                            }
                            continue;
                        }
                        if (var435 == 3408) {
                            var5 -= 4;
                            int var168 = class34.field740[var5];
                            int var169 = class34.field740[var5 + 1];
                            int var170 = class34.field740[var5 + 2];
                            int var171 = class34.field740[var5 + 3];
                            class45 var172 = class45.method2919(var170);
                            if (var172.field1009 == var168 && var172.field1010 == var169) {
                                for (int var173 = 0; var173 < var172.field1013; var173++) {
                                    if (var172.field1016[var173] == var171) {
                                        if (var169 == 115) {
                                            class34.field743[var6++] = var172.field1008[var173];
                                        } else {
                                            class34.field740[var5++] = var172.field1015[var173];
                                        }
                                        var172 = null;
                                        break;
                                    }
                                }
                                if (var172 != null) {
                                    if (var169 == 115) {
                                        class34.field743[var6++] = var172.field1017;
                                    } else {
                                        class34.field740[var5++] = var172.field1012;
                                    }
                                }
                                continue;
                            }
                            if (var169 == 115) {
                                class34.field743[var6++] = "null";
                            } else {
                                class34.field740[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var435 < 3700) {
                        if (var435 == 3600) {
                            if (client.field533 == 0) {
                                class34.field740[var5++] = -2;
                            } else if (client.field533 == 1) {
                                class34.field740[var5++] = -1;
                            } else {
                                class34.field740[var5++] = client.field532;
                            }
                            continue;
                        }
                        if (var435 == 3601) {
                            var5--;
                            int var174 = class34.field740[var5];
                            if (client.field533 == 2 && var174 < client.field532) {
                                class34.field743[var6++] = client.field534[var174].field233;
                                class34.field743[var6++] = client.field534[var174].field231;
                                continue;
                            }
                            class34.field743[var6++] = "";
                            class34.field743[var6++] = "";
                            continue;
                        }
                        if (var435 == 3602) {
                            var5--;
                            int var175 = class34.field740[var5];
                            if (client.field533 == 2 && var175 < client.field532) {
                                class34.field740[var5++] = client.field534[var175].field236;
                                continue;
                            }
                            class34.field740[var5++] = 0;
                            continue;
                        }
                        if (var435 == 3603) {
                            var5--;
                            int var176 = class34.field740[var5];
                            if (client.field533 == 2 && var176 < client.field532) {
                                class34.field740[var5++] = client.field534[var176].field234;
                                continue;
                            }
                            class34.field740[var5++] = 0;
                            continue;
                        }
                        if (var435 == 3604) {
                            var6--;
                            String var177 = class34.field743[var6];
                            var5--;
                            int var178 = class34.field740[var5];
                            client.field302.method2477(107);
                            client.field302.method2204(class111.method2151(var177) + 1);
                            client.field302.method2269(var177);
                            client.field302.method2346(var178);
                            continue;
                        }
                        if (var435 == 3605) {
                            var6--;
                            String var179 = class34.field743[var6];
                            if (var179 == null) {
                                continue;
                            }
                            if ((client.field532 < 200 || client.field442 == 1) && client.field532 < 400) {
                                String var180 = class155.method2880(var179, field261);
                                if (var180 == null) {
                                    continue;
                                }
                                for (int var181 = 0; var181 < client.field532; var181++) {
                                    class17 var182 = client.field534[var181];
                                    String var183 = class155.method2880(var182.field233, field261);
                                    if (var183 != null && var183.equals(var180)) {
                                        class11.method626(30, "", var179 + class148.field2365);
                                        continue label2941;
                                    }
                                    if (var182.field231 != null) {
                                        String var184 = class155.method2880(var182.field231, field261);
                                        if (var184 != null && var184.equals(var180)) {
                                            class11.method626(30, "", var179 + class148.field2365);
                                            continue label2941;
                                        }
                                    }
                                }
                                for (int var185 = 0; var185 < client.field536; var185++) {
                                    class8 var186 = client.field537[var185];
                                    String var187 = class155.method2880(var186.field127, field261);
                                    if (var187 != null && var187.equals(var180)) {
                                        class11.method626(30, "", class148.field2370 + var179 + class148.field2371);
                                        continue label2941;
                                    }
                                    if (var186.field121 != null) {
                                        String var188 = class155.method2880(var186.field121, field261);
                                        if (var188 != null && var188.equals(var180)) {
                                            class11.method626(30, "", class148.field2370 + var179 + class148.field2371);
                                            continue label2941;
                                        }
                                    }
                                }
                                if (class155.method2880(field571.field38, field261).equals(var180)) {
                                    class11.method626(30, "", class148.field2368);
                                } else {
                                    client.field302.method2477(40);
                                    client.field302.method2204(class111.method2151(var179));
                                    client.field302.method2269(var179);
                                }
                                continue;
                            }
                            class11.method626(30, "", class148.field2364);
                            continue;
                        }
                        if (var435 == 3606) {
                            var6--;
                            String var189 = class34.field743[var6];
                            client.method94(var189);
                            continue;
                        }
                        if (var435 == 3607) {
                            var6--;
                            String var190 = class34.field743[var6];
                            client.method1950(var190, false);
                            continue;
                        }
                        if (var435 == 3608) {
                            var6--;
                            String var191 = class34.field743[var6];
                            client.method654(var191);
                            continue;
                        }
                        if (var435 == 3609) {
                            var6--;
                            String var192 = class34.field743[var6];
                            class143[] var193 = class143.method169();
                            for (int var194 = 0; var194 < var193.length; var194++) {
                                class143 var195 = var193[var194];
                                if (var195.field2149 != -1 && var192.startsWith(class2.method1661(var195.field2149))) {
                                    var192 = var192.substring(6 + Integer.toString(var195.field2149).length());
                                    break;
                                }
                            }
                            class34.field740[var5++] = client.method1662(var192, false) ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3611) {
                            if (client.field492 == null) {
                                class34.field743[var6++] = "";
                            } else {
                                class34.field743[var6++] = class153.method2701(client.field492);
                            }
                            continue;
                        }
                        if (var435 == 3612) {
                            if (client.field492 == null) {
                                class34.field740[var5++] = 0;
                            } else {
                                class34.field740[var5++] = field1316;
                            }
                            continue;
                        }
                        if (var435 == 3613) {
                            var5--;
                            int var196 = class34.field740[var5];
                            if (client.field492 != null && var196 < field1316) {
                                class34.field743[var6++] = field1925[var196].field604;
                                continue;
                            }
                            class34.field743[var6++] = "";
                            continue;
                        }
                        if (var435 == 3614) {
                            var5--;
                            int var197 = class34.field740[var5];
                            if (client.field492 != null && var197 < field1316) {
                                class34.field740[var5++] = field1925[var197].field600;
                                continue;
                            }
                            class34.field740[var5++] = 0;
                            continue;
                        }
                        if (var435 == 3615) {
                            var5--;
                            int var198 = class34.field740[var5];
                            if (client.field492 != null && var198 < field1316) {
                                class34.field740[var5++] = field1925[var198].field603;
                                continue;
                            }
                            class34.field740[var5++] = 0;
                            continue;
                        }
                        if (var435 == 3616) {
                            class34.field740[var5++] = field723;
                            continue;
                        }
                        if (var435 == 3617) {
                            var6--;
                            String var199 = class34.field743[var6];
                            client.method552(var199);
                            continue;
                        }
                        if (var435 == 3618) {
                            class34.field740[var5++] = field2796;
                            continue;
                        }
                        if (var435 == 3619) {
                            var6--;
                            String var200 = class34.field743[var6];
                            client.method915(var200);
                            continue;
                        }
                        if (var435 == 3620) {
                            client.method3133();
                            continue;
                        }
                        if (var435 == 3621) {
                            if (client.field533 == 0) {
                                class34.field740[var5++] = -1;
                            } else {
                                class34.field740[var5++] = client.field536;
                            }
                            continue;
                        }
                        if (var435 == 3622) {
                            var5--;
                            int var201 = class34.field740[var5];
                            if (client.field533 != 0 && var201 < client.field536) {
                                class34.field743[var6++] = client.field537[var201].field127;
                                class34.field743[var6++] = client.field537[var201].field121;
                                continue;
                            }
                            class34.field743[var6++] = "";
                            class34.field743[var6++] = "";
                            continue;
                        }
                        if (var435 == 3623) {
                            var6--;
                            String var202 = class34.field743[var6];
                            if (var202.startsWith(class2.method1661(0)) || var202.startsWith(class2.method1661(1))) {
                                var202 = var202.substring(7);
                            }
                            class34.field740[var5++] = client.method2043(var202) ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3624) {
                            var5--;
                            int var203 = class34.field740[var5];
                            if (field1925 != null && var203 < field1316 && field1925[var203].field604.equalsIgnoreCase(field571.field38)) {
                                class34.field740[var5++] = 1;
                                continue;
                            }
                            class34.field740[var5++] = 0;
                            continue;
                        }
                        if (var435 == 3625) {
                            if (client.field539 == null) {
                                class34.field743[var6++] = "";
                            } else {
                                class34.field743[var6++] = class153.method2701(client.field539);
                            }
                            continue;
                        }
                    } else if (var435 < 4000) {
                        if (var435 == 3903) {
                            var5--;
                            int var204 = class34.field740[var5];
                            class34.field740[var5++] = client.field253[var204].method3626();
                            continue;
                        }
                        if (var435 == 3904) {
                            var5--;
                            int var205 = class34.field740[var5];
                            class34.field740[var5++] = client.field253[var205].field3071;
                            continue;
                        }
                        if (var435 == 3905) {
                            var5--;
                            int var206 = class34.field740[var5];
                            class34.field740[var5++] = client.field253[var206].field3068;
                            continue;
                        }
                        if (var435 == 3906) {
                            var5--;
                            int var207 = class34.field740[var5];
                            class34.field740[var5++] = client.field253[var207].field3073;
                            continue;
                        }
                        if (var435 == 3907) {
                            var5--;
                            int var208 = class34.field740[var5];
                            class34.field740[var5++] = client.field253[var208].field3072;
                            continue;
                        }
                        if (var435 == 3908) {
                            var5--;
                            int var209 = class34.field740[var5];
                            class34.field740[var5++] = client.field253[var209].field3070;
                            continue;
                        }
                        if (var435 == 3910) {
                            var5--;
                            int var210 = class34.field740[var5];
                            int var211 = client.field253[var210].method3638();
                            class34.field740[var5++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3911) {
                            var5--;
                            int var212 = class34.field740[var5];
                            int var213 = client.field253[var212].method3638();
                            class34.field740[var5++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3912) {
                            var5--;
                            int var214 = class34.field740[var5];
                            int var215 = client.field253[var214].method3638();
                            class34.field740[var5++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3913) {
                            var5--;
                            int var216 = class34.field740[var5];
                            int var217 = client.field253[var216].method3638();
                            class34.field740[var5++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 3914) {
                            var5--;
                            boolean var218 = class34.field740[var5] == 1;
                            if (field1469 != null) {
                                field1469.method3643(class212.field3077, var218);
                            }
                            continue;
                        }
                        if (var435 == 3915) {
                            var5--;
                            boolean var219 = class34.field740[var5] == 1;
                            if (field1469 != null) {
                                field1469.method3643(class212.field3075, var219);
                            }
                            continue;
                        }
                        if (var435 == 3916) {
                            var5 -= 2;
                            boolean var220 = class34.field740[var5] == 1;
                            boolean var221 = class34.field740[var5 + 1] == 1;
                            if (field1469 != null) {
                                field1469.method3643(new class21(var221), var220);
                            }
                            continue;
                        }
                        if (var435 == 3917) {
                            var5--;
                            boolean var222 = class34.field740[var5] == 1;
                            if (field1469 != null) {
                                field1469.method3643(class212.field3074, var222);
                            }
                            continue;
                        }
                        if (var435 == 3918) {
                            var5--;
                            boolean var223 = class34.field740[var5] == 1;
                            if (field1469 != null) {
                                field1469.method3643(class212.field3078, var223);
                            }
                            continue;
                        }
                        if (var435 == 3919) {
                            class34.field740[var5++] = field1469 == null ? 0 : field1469.field3080.size();
                            continue;
                        }
                        if (var435 == 3920) {
                            var5--;
                            int var224 = class34.field740[var5];
                            class205 var225 = (class205) field1469.field3080.get(var224);
                            class34.field740[var5++] = var225.field3052;
                            continue;
                        }
                        if (var435 == 3921) {
                            var5--;
                            int var226 = class34.field740[var5];
                            class205 var227 = (class205) field1469.field3080.get(var226);
                            class34.field743[var6++] = var227.method3592();
                            continue;
                        }
                        if (var435 == 3922) {
                            var5--;
                            int var228 = class34.field740[var5];
                            class205 var229 = (class205) field1469.field3080.get(var228);
                            class34.field743[var6++] = var229.method3591();
                            continue;
                        }
                        if (var435 == 3923) {
                            var5--;
                            int var230 = class34.field740[var5];
                            class205 var231 = (class205) field1469.field3080.get(var230);
                            long var232 = class107.method2661() - field186 - var231.field3049;
                            int var234 = (int) (var232 / 3600000L);
                            int var235 = (int) ((var232 - (long) (var234 * 3600000)) / 60000L);
                            int var236 = (int) ((var232 - (long) (var234 * 3600000) - (long) (var235 * 60000)) / 1000L);
                            String var237 = var234 + ":" + var235 / 10 + var235 % 10 + ":" + var236 / 10 + var236 % 10;
                            class34.field743[var6++] = var237;
                            continue;
                        }
                        if (var435 == 3924) {
                            var5--;
                            int var238 = class34.field740[var5];
                            class205 var239 = (class205) field1469.field3080.get(var238);
                            class34.field740[var5++] = var239.field3050.field3073;
                            continue;
                        }
                        if (var435 == 3925) {
                            var5--;
                            int var240 = class34.field740[var5];
                            class205 var241 = (class205) field1469.field3080.get(var240);
                            class34.field740[var5++] = var241.field3050.field3068;
                            continue;
                        }
                        if (var435 == 3926) {
                            var5--;
                            int var242 = class34.field740[var5];
                            class205 var243 = (class205) field1469.field3080.get(var242);
                            class34.field740[var5++] = var243.field3050.field3071;
                            continue;
                        }
                    } else if (var435 < 4100) {
                        if (var435 == 4000) {
                            var5 -= 2;
                            int var244 = class34.field740[var5];
                            int var245 = class34.field740[var5 + 1];
                            class34.field740[var5++] = var244 + var245;
                            continue;
                        }
                        if (var435 == 4001) {
                            var5 -= 2;
                            int var246 = class34.field740[var5];
                            int var247 = class34.field740[var5 + 1];
                            class34.field740[var5++] = var246 - var247;
                            continue;
                        }
                        if (var435 == 4002) {
                            var5 -= 2;
                            int var248 = class34.field740[var5];
                            int var249 = class34.field740[var5 + 1];
                            class34.field740[var5++] = var248 * var249;
                            continue;
                        }
                        if (var435 == 4003) {
                            var5 -= 2;
                            int var250 = class34.field740[var5];
                            int var251 = class34.field740[var5 + 1];
                            class34.field740[var5++] = var250 / var251;
                            continue;
                        }
                        if (var435 == 4004) {
                            var5--;
                            int var252 = class34.field740[var5];
                            class34.field740[var5++] = (int) (Math.random() * (double) var252);
                            continue;
                        }
                        if (var435 == 4005) {
                            var5--;
                            int var253 = class34.field740[var5];
                            class34.field740[var5++] = (int) (Math.random() * (double) (var253 + 1));
                            continue;
                        }
                        if (var435 == 4006) {
                            var5 -= 5;
                            int var254 = class34.field740[var5];
                            int var255 = class34.field740[var5 + 1];
                            int var256 = class34.field740[var5 + 2];
                            int var257 = class34.field740[var5 + 3];
                            int var258 = class34.field740[var5 + 4];
                            class34.field740[var5++] = (var255 - var254) * (var258 - var256) / (var257 - var256) + var254;
                            continue;
                        }
                        if (var435 == 4007) {
                            var5 -= 2;
                            int var259 = class34.field740[var5];
                            int var260 = class34.field740[var5 + 1];
                            class34.field740[var5++] = var259 * var260 / 100 + var259;
                            continue;
                        }
                        if (var435 == 4008) {
                            var5 -= 2;
                            int var261 = class34.field740[var5];
                            int var262 = class34.field740[var5 + 1];
                            class34.field740[var5++] = var261 | 0x1 << var262;
                            continue;
                        }
                        if (var435 == 4009) {
                            var5 -= 2;
                            int var263 = class34.field740[var5];
                            int var264 = class34.field740[var5 + 1];
                            class34.field740[var5++] = var263 & -1 - (0x1 << var264);
                            continue;
                        }
                        if (var435 == 4010) {
                            var5 -= 2;
                            int var265 = class34.field740[var5];
                            int var266 = class34.field740[var5 + 1];
                            class34.field740[var5++] = (var265 & 0x1 << var266) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var435 == 4011) {
                            var5 -= 2;
                            int var267 = class34.field740[var5];
                            int var268 = class34.field740[var5 + 1];
                            class34.field740[var5++] = var267 % var268;
                            continue;
                        }
                        if (var435 == 4012) {
                            var5 -= 2;
                            int var269 = class34.field740[var5];
                            int var270 = class34.field740[var5 + 1];
                            if (var269 == 0) {
                                class34.field740[var5++] = 0;
                            } else {
                                class34.field740[var5++] = (int) Math.pow((double) var269, (double) var270);
                            }
                            continue;
                        }
                        if (var435 == 4013) {
                            var5 -= 2;
                            int var271 = class34.field740[var5];
                            int var272 = class34.field740[var5 + 1];
                            if (var271 == 0) {
                                class34.field740[var5++] = 0;
                            } else if (var272 == 0) {
                                class34.field740[var5++] = Integer.MAX_VALUE;
                            } else {
                                class34.field740[var5++] = (int) Math.pow((double) var271, 1.0D / (double) var272);
                            }
                            continue;
                        }
                        if (var435 == 4014) {
                            var5 -= 2;
                            int var273 = class34.field740[var5];
                            int var274 = class34.field740[var5 + 1];
                            class34.field740[var5++] = var273 & var274;
                            continue;
                        }
                        if (var435 == 4015) {
                            var5 -= 2;
                            int var275 = class34.field740[var5];
                            int var276 = class34.field740[var5 + 1];
                            class34.field740[var5++] = var275 | var276;
                            continue;
                        }
                    } else if (var435 < 4200) {
                        if (var435 == 4100) {
                            var6--;
                            String var277 = class34.field743[var6];
                            var5--;
                            int var278 = class34.field740[var5];
                            class34.field743[var6++] = var277 + var278;
                            continue;
                        }
                        if (var435 == 4101) {
                            var6 -= 2;
                            String var279 = class34.field743[var6];
                            String var280 = class34.field743[var6 + 1];
                            class34.field743[var6++] = var279 + var280;
                            continue;
                        }
                        if (var435 == 4102) {
                            var6--;
                            String var281 = class34.field743[var6];
                            var5--;
                            int var282 = class34.field740[var5];
                            class34.field743[var6++] = var281 + class154.method2852(var282, true);
                            continue;
                        }
                        if (var435 == 4103) {
                            var6--;
                            String var283 = class34.field743[var6];
                            class34.field743[var6++] = var283.toLowerCase();
                            continue;
                        }
                        if (var435 == 4104) {
                            var5--;
                            int var284 = class34.field740[var5];
                            long var285 = ((long) var284 + 11745L) * 86400000L;
                            class34.field744.setTime(new Date(var285));
                            int var287 = class34.field744.get(5);
                            int var288 = class34.field744.get(2);
                            int var289 = class34.field744.get(1);
                            class34.field743[var6++] = var287 + "-" + class34.field742[var288] + "-" + var289;
                            continue;
                        }
                        if (var435 == 4105) {
                            var6 -= 2;
                            String var290 = class34.field743[var6];
                            String var291 = class34.field743[var6 + 1];
                            if (field571.field29 != null && field571.field29.field2802) {
                                class34.field743[var6++] = var291;
                                continue;
                            }
                            class34.field743[var6++] = var290;
                            continue;
                        }
                        if (var435 == 4106) {
                            var5--;
                            int var292 = class34.field740[var5];
                            class34.field743[var6++] = Integer.toString(var292);
                            continue;
                        }
                        if (var435 == 4107) {
                            var6 -= 2;
                            int[] var293 = class34.field740;
                            int var294 = var5++;
                            String var295 = class34.field743[var6];
                            String var296 = class34.field743[var6 + 1];
                            int var297 = client.field264;
                            int var298 = var295.length();
                            int var299 = var296.length();
                            int var300 = 0;
                            int var301 = 0;
                            byte var302 = 0;
                            byte var303 = 0;
                            int var304;
                            label2744: while (true) {
                                if (var300 - var302 >= var298 && var301 - var303 >= var299) {
                                    int var315 = Math.min(var298, var299);
                                    for (int var316 = 0; var316 < var315; var316++) {
                                        char var319 = var295.charAt(var316);
                                        char var320 = var296.charAt(var316);
                                        if (var319 != var320 && Character.toUpperCase(var319) != Character.toUpperCase(var320)) {
                                            char var321 = Character.toLowerCase(var319);
                                            char var322 = Character.toLowerCase(var320);
                                            if (var321 != var322) {
                                                var304 = class157.method1948(var321, var297) - class157.method1948(var322, var297);
                                                break label2744;
                                            }
                                        }
                                    }
                                    int var323 = var298 - var299;
                                    if (var323 == 0) {
                                        for (int var324 = 0; var324 < var315; var324++) {
                                            char var325 = var295.charAt(var324);
                                            char var326 = var296.charAt(var324);
                                            if (var325 != var326) {
                                                var304 = class157.method1948(var325, var297) - class157.method1948(var326, var297);
                                                break label2744;
                                            }
                                        }
                                        var304 = 0;
                                    } else {
                                        var304 = var323;
                                    }
                                    break;
                                }
                                if (var300 - var302 >= var298) {
                                    var304 = -1;
                                    break;
                                }
                                if (var301 - var303 >= var299) {
                                    var304 = 1;
                                    break;
                                }
                                char var305;
                                if (var302 == 0) {
                                    var305 = var295.charAt(var300++);
                                } else {
                                    var305 = (char) var302;
                                    boolean var306 = false;
                                }
                                char var307;
                                if (var303 == 0) {
                                    var307 = var296.charAt(var301++);
                                } else {
                                    var307 = (char) var303;
                                    boolean var308 = false;
                                }
                                byte var309;
                                if (var305 == 198) {
                                    var309 = 69;
                                } else if (var305 == 230) {
                                    var309 = 101;
                                } else if (var305 == 223) {
                                    var309 = 115;
                                } else if (var305 == 338) {
                                    var309 = 69;
                                } else if (var305 == 339) {
                                    var309 = 101;
                                } else {
                                    var309 = 0;
                                }
                                var302 = var309;
                                byte var310;
                                if (var307 == 198) {
                                    var310 = 69;
                                } else if (var307 == 230) {
                                    var310 = 101;
                                } else if (var307 == 223) {
                                    var310 = 115;
                                } else if (var307 == 338) {
                                    var310 = 69;
                                } else if (var307 == 339) {
                                    var310 = 101;
                                } else {
                                    var310 = 0;
                                }
                                var303 = var310;
                                char var311 = class157.method560(var305, var297);
                                char var312 = class157.method560(var307, var297);
                                if (var311 != var312 && Character.toUpperCase(var311) != Character.toUpperCase(var312)) {
                                    char var313 = Character.toLowerCase(var311);
                                    char var314 = Character.toLowerCase(var312);
                                    if (var313 != var314) {
                                        var304 = class157.method1948(var313, var297) - class157.method1948(var314, var297);
                                        break;
                                    }
                                }
                            }
                            byte var328;
                            if (var304 > 0) {
                                var328 = 1;
                            } else if (var304 < 0) {
                                var328 = -1;
                            } else {
                                var328 = 0;
                            }
                            var293[var294] = var328;
                            continue;
                        }
                        if (var435 == 4108) {
                            var6--;
                            String var329 = class34.field743[var6];
                            var5 -= 2;
                            int var330 = class34.field740[var5];
                            int var331 = class34.field740[var5 + 1];
                            byte[] var332 = field1534.method2940(var331, 0);
                            class215 var333 = new class215(var332);
                            class34.field740[var5++] = var333.method3654(var329, var330);
                            continue;
                        }
                        if (var435 == 4109) {
                            var6--;
                            String var334 = class34.field743[var6];
                            var5 -= 2;
                            int var335 = class34.field740[var5];
                            int var336 = class34.field740[var5 + 1];
                            byte[] var337 = field1534.method2940(var336, 0);
                            class215 var338 = new class215(var337);
                            class34.field740[var5++] = var338.method3653(var334, var335);
                            continue;
                        }
                        if (var435 == 4110) {
                            var6 -= 2;
                            String var339 = class34.field743[var6];
                            String var340 = class34.field743[var6 + 1];
                            var5--;
                            if (class34.field740[var5] == 1) {
                                class34.field743[var6++] = var339;
                            } else {
                                class34.field743[var6++] = var340;
                            }
                            continue;
                        }
                        if (var435 == 4111) {
                            var6--;
                            String var341 = class34.field743[var6];
                            class34.field743[var6++] = class214.method3736(var341);
                            continue;
                        }
                        if (var435 == 4112) {
                            var6--;
                            String var342 = class34.field743[var6];
                            var5--;
                            int var343 = class34.field740[var5];
                            class34.field743[var6++] = var342 + (char) var343;
                            continue;
                        }
                        if (var435 == 4113) {
                            var5--;
                            int var344 = class34.field740[var5];
                            int[] var345 = class34.field740;
                            int var346 = var5++;
                            char var347 = (char) var344;
                            boolean var348;
                            if (var347 >= ' ' && var347 <= '~') {
                                var348 = true;
                            } else if (var347 >= 160 && var347 <= 255) {
                                var348 = true;
                            } else if (var347 == 8364 || var347 == 338 || var347 == 8212 || var347 == 339 || var347 == 376) {
                                var348 = true;
                            } else {
                                var348 = false;
                            }
                            var345[var346] = var348 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 4114) {
                            var5--;
                            int var349 = class34.field740[var5];
                            int[] var350 = class34.field740;
                            int var351 = var5++;
                            char var352 = (char) var349;
                            boolean var353 = var352 >= '0' && var352 <= '9' || var352 >= 'A' && var352 <= 'Z' || var352 >= 'a' && var352 <= 'z';
                            var350[var351] = var353 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 4115) {
                            var5--;
                            int var354 = class34.field740[var5];
                            class34.field740[var5++] = class154.method2526((char) var354) ? 1 : 0;
                            continue;
                        }
                        if (var435 == 4116) {
                            var5--;
                            int var355 = class34.field740[var5];
                            int[] var356 = class34.field740;
                            int var357 = var5++;
                            char var358 = (char) var355;
                            boolean var359 = var358 >= '0' && var358 <= '9';
                            var356[var357] = var359 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 4117) {
                            var6--;
                            String var360 = class34.field743[var6];
                            if (var360 == null) {
                                class34.field740[var5++] = 0;
                            } else {
                                class34.field740[var5++] = var360.length();
                            }
                            continue;
                        }
                        if (var435 == 4118) {
                            var6--;
                            String var361 = class34.field743[var6];
                            var5 -= 2;
                            int var362 = class34.field740[var5];
                            int var363 = class34.field740[var5 + 1];
                            class34.field743[var6++] = var361.substring(var362, var363);
                            continue;
                        }
                        if (var435 == 4119) {
                            var6--;
                            String var364 = class34.field743[var6];
                            StringBuilder var365 = new StringBuilder(var364.length());
                            boolean var366 = false;
                            for (int var367 = 0; var367 < var364.length(); var367++) {
                                char var368 = var364.charAt(var367);
                                if (var368 == '<') {
                                    var366 = true;
                                } else if (var368 == '>') {
                                    var366 = false;
                                } else if (!var366) {
                                    var365.append(var368);
                                }
                            }
                            class34.field743[var6++] = var365.toString();
                            continue;
                        }
                        if (var435 == 4120) {
                            var6--;
                            String var369 = class34.field743[var6];
                            var5--;
                            int var370 = class34.field740[var5];
                            class34.field740[var5++] = var369.indexOf(var370);
                            continue;
                        }
                        if (var435 == 4121) {
                            var6 -= 2;
                            String var371 = class34.field743[var6];
                            String var372 = class34.field743[var6 + 1];
                            var5--;
                            int var373 = class34.field740[var5];
                            class34.field740[var5++] = var371.indexOf(var372, var373);
                            continue;
                        }
                    } else if (var435 < 4300) {
                        if (var435 == 4200) {
                            var5--;
                            int var374 = class34.field740[var5];
                            class34.field743[var6++] = class47.method2700(var374).field1075;
                            continue;
                        }
                        if (var435 == 4201) {
                            var5 -= 2;
                            int var375 = class34.field740[var5];
                            int var376 = class34.field740[var5 + 1];
                            class47 var377 = class47.method2700(var375);
                            if (var376 >= 1 && var376 <= 5 && var377.field1053[var376 - 1] != null) {
                                class34.field743[var6++] = var377.field1053[var376 - 1];
                                continue;
                            }
                            class34.field743[var6++] = "";
                            continue;
                        }
                        if (var435 == 4202) {
                            var5 -= 2;
                            int var378 = class34.field740[var5];
                            int var379 = class34.field740[var5 + 1];
                            class47 var380 = class47.method2700(var378);
                            if (var379 >= 1 && var379 <= 5 && var380.field1054[var379 - 1] != null) {
                                class34.field743[var6++] = var380.field1054[var379 - 1];
                                continue;
                            }
                            class34.field743[var6++] = "";
                            continue;
                        }
                        if (var435 == 4203) {
                            var5--;
                            int var381 = class34.field740[var5];
                            class34.field740[var5++] = class47.method2700(var381).field1051;
                            continue;
                        }
                        if (var435 == 4204) {
                            var5--;
                            int var382 = class34.field740[var5];
                            class34.field740[var5++] = class47.method2700(var382).field1080 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 4205) {
                            var5--;
                            int var383 = class34.field740[var5];
                            class47 var384 = class47.method2700(var383);
                            if (var384.field1066 == -1 && var384.field1056 >= 0) {
                                class34.field740[var5++] = var384.field1056;
                                continue;
                            }
                            class34.field740[var5++] = var383;
                            continue;
                        }
                        if (var435 == 4206) {
                            var5--;
                            int var385 = class34.field740[var5];
                            class47 var386 = class47.method2700(var385);
                            if (var386.field1066 >= 0 && var386.field1056 >= 0) {
                                class34.field740[var5++] = var386.field1056;
                                continue;
                            }
                            class34.field740[var5++] = var385;
                            continue;
                        }
                        if (var435 == 4207) {
                            var5--;
                            int var387 = class34.field740[var5];
                            class34.field740[var5++] = class47.method2700(var387).field1057 ? 1 : 0;
                            continue;
                        }
                        if (var435 == 4210) {
                            var6--;
                            String var388 = class34.field743[var6];
                            var5--;
                            int var389 = class34.field740[var5];
                            client.method3270(var388, var389 == 1);
                            class34.field740[var5++] = field2792;
                            continue;
                        }
                        if (var435 == 4211) {
                            if (field49 != null && field2535 < field2792) {
                                class34.field740[var5++] = field49[++field2535 - 1] & 0xFFFF;
                                continue;
                            }
                            class34.field740[var5++] = -1;
                            continue;
                        }
                        if (var435 == 4212) {
                            field2535 = 0;
                            continue;
                        }
                    } else if (var435 < 5100) {
                        if (var435 == 5000) {
                            class34.field740[var5++] = client.field483;
                            continue;
                        }
                        if (var435 == 5001) {
                            var5 -= 3;
                            client.field483 = class34.field740[var5];
                            field921 = class122.method627(class34.field740[var5 + 1]);
                            if (field921 == null) {
                                field921 = class122.field1940;
                            }
                            client.field387 = class34.field740[var5 + 2];
                            client.field302.method2477(152);
                            client.field302.method2204(client.field483);
                            client.field302.method2204(field921.field1941);
                            client.field302.method2204(client.field387);
                            continue;
                        }
                        if (var435 == 5002) {
                            var6--;
                            String var390 = class34.field743[var6];
                            var5 -= 2;
                            int var391 = class34.field740[var5];
                            int var392 = class34.field740[var5 + 1];
                            client.field302.method2477(161);
                            client.field302.method2204(class111.method2151(var390) + 2);
                            client.field302.method2269(var390);
                            client.field302.method2204(var391 - 1);
                            client.field302.method2204(var392);
                            continue;
                        }
                        if (var435 == 5003) {
                            var5 -= 2;
                            int var393 = class34.field740[var5];
                            int var394 = class34.field740[var5 + 1];
                            class26 var395 = (class26) class11.field158.get(var393);
                            class33 var396 = var395.method573(var394);
                            if (var396 == null) {
                                class34.field740[var5++] = -1;
                                class34.field740[var5++] = 0;
                                class34.field743[var6++] = "";
                                class34.field743[var6++] = "";
                                class34.field743[var6++] = "";
                            } else {
                                class34.field740[var5++] = var396.field729;
                                class34.field740[var5++] = var396.field734;
                                class34.field743[var6++] = var396.field726 == null ? "" : var396.field726;
                                class34.field743[var6++] = var396.field731 == null ? "" : var396.field731;
                                class34.field743[var6++] = var396.field727 == null ? "" : var396.field727;
                            }
                            continue;
                        }
                        if (var435 == 5004) {
                            var5--;
                            int var398 = class34.field740[var5];
                            class33 var399 = class11.method2142(var398);
                            if (var399 == null) {
                                class34.field740[var5++] = -1;
                                class34.field740[var5++] = 0;
                                class34.field743[var6++] = "";
                                class34.field743[var6++] = "";
                                class34.field743[var6++] = "";
                            } else {
                                class34.field740[var5++] = var399.field728;
                                class34.field740[var5++] = var399.field734;
                                class34.field743[var6++] = var399.field726 == null ? "" : var399.field726;
                                class34.field743[var6++] = var399.field731 == null ? "" : var399.field731;
                                class34.field743[var6++] = var399.field727 == null ? "" : var399.field727;
                            }
                            continue;
                        }
                        if (var435 == 5005) {
                            if (field921 == null) {
                                class34.field740[var5++] = -1;
                            } else {
                                class34.field740[var5++] = field921.field1941;
                            }
                            continue;
                        }
                        if (var435 == 5008) {
                            var6--;
                            String var400 = class34.field743[var6];
                            var5--;
                            int var401 = class34.field740[var5];
                            String var402 = var400.toLowerCase();
                            byte var403 = 0;
                            if (var402.startsWith(class148.field2443)) {
                                var403 = 0;
                                var400 = var400.substring(class148.field2443.length());
                            } else if (var402.startsWith(class148.field2376)) {
                                var403 = 1;
                                var400 = var400.substring(class148.field2376.length());
                            } else if (var402.startsWith(class148.field2398)) {
                                var403 = 2;
                                var400 = var400.substring(class148.field2398.length());
                            } else if (var402.startsWith(class148.field2380)) {
                                var403 = 3;
                                var400 = var400.substring(class148.field2380.length());
                            } else if (var402.startsWith(class148.field2347)) {
                                var403 = 4;
                                var400 = var400.substring(class148.field2347.length());
                            } else if (var402.startsWith(class148.field2384)) {
                                var403 = 5;
                                var400 = var400.substring(class148.field2384.length());
                            } else if (var402.startsWith(class148.field2201)) {
                                var403 = 6;
                                var400 = var400.substring(class148.field2201.length());
                            } else if (var402.startsWith(class148.field2261)) {
                                var403 = 7;
                                var400 = var400.substring(class148.field2261.length());
                            } else if (var402.startsWith(class148.field2388)) {
                                var403 = 8;
                                var400 = var400.substring(class148.field2388.length());
                            } else if (var402.startsWith(class148.field2341)) {
                                var403 = 9;
                                var400 = var400.substring(class148.field2341.length());
                            } else if (var402.startsWith(class148.field2265)) {
                                var403 = 10;
                                var400 = var400.substring(class148.field2265.length());
                            } else if (var402.startsWith(class148.field2396)) {
                                var403 = 11;
                                var400 = var400.substring(class148.field2396.length());
                            } else if (client.field264 != 0) {
                                if (var402.startsWith(class148.field2375)) {
                                    var403 = 0;
                                    var400 = var400.substring(class148.field2375.length());
                                } else if (var402.startsWith(class148.field2377)) {
                                    var403 = 1;
                                    var400 = var400.substring(class148.field2377.length());
                                } else if (var402.startsWith(class148.field2334)) {
                                    var403 = 2;
                                    var400 = var400.substring(class148.field2334.length());
                                } else if (var402.startsWith(class148.field2381)) {
                                    var403 = 3;
                                    var400 = var400.substring(class148.field2381.length());
                                } else if (var402.startsWith(class148.field2383)) {
                                    var403 = 4;
                                    var400 = var400.substring(class148.field2383.length());
                                } else if (var402.startsWith(class148.field2385)) {
                                    var403 = 5;
                                    var400 = var400.substring(class148.field2385.length());
                                } else if (var402.startsWith(class148.field2387)) {
                                    var403 = 6;
                                    var400 = var400.substring(class148.field2387.length());
                                } else if (var402.startsWith(class148.field2389)) {
                                    var403 = 7;
                                    var400 = var400.substring(class148.field2389.length());
                                } else if (var402.startsWith(class148.field2391)) {
                                    var403 = 8;
                                    var400 = var400.substring(class148.field2391.length());
                                } else if (var402.startsWith(class148.field2269)) {
                                    var403 = 9;
                                    var400 = var400.substring(class148.field2269.length());
                                } else if (var402.startsWith(class148.field2395)) {
                                    var403 = 10;
                                    var400 = var400.substring(class148.field2395.length());
                                } else if (var402.startsWith(class148.field2397)) {
                                    var403 = 11;
                                    var400 = var400.substring(class148.field2397.length());
                                }
                            }
                            String var404 = var400.toLowerCase();
                            byte var405 = 0;
                            if (var404.startsWith(class148.field2393)) {
                                var405 = 1;
                                var400 = var400.substring(class148.field2393.length());
                            } else if (var404.startsWith(class148.field2340)) {
                                var405 = 2;
                                var400 = var400.substring(class148.field2340.length());
                            } else if (var404.startsWith(class148.field2402)) {
                                var405 = 3;
                                var400 = var400.substring(class148.field2402.length());
                            } else if (var404.startsWith(class148.field2404)) {
                                var405 = 4;
                                var400 = var400.substring(class148.field2404.length());
                            } else if (var404.startsWith(class148.field2360)) {
                                var405 = 5;
                                var400 = var400.substring(class148.field2360.length());
                            } else if (client.field264 != 0) {
                                if (var404.startsWith(class148.field2465)) {
                                    var405 = 1;
                                    var400 = var400.substring(class148.field2465.length());
                                } else if (var404.startsWith(class148.field2250)) {
                                    var405 = 2;
                                    var400 = var400.substring(class148.field2250.length());
                                } else if (var404.startsWith(class148.field2403)) {
                                    var405 = 3;
                                    var400 = var400.substring(class148.field2403.length());
                                } else if (var404.startsWith(class148.field2225)) {
                                    var405 = 4;
                                    var400 = var400.substring(class148.field2225.length());
                                } else if (var404.startsWith(class148.field2222)) {
                                    var405 = 5;
                                    var400 = var400.substring(class148.field2222.length());
                                }
                            }
                            client.field302.method2477(193);
                            client.field302.method2204(0);
                            int var406 = client.field302.field1861;
                            client.field302.method2204(var401);
                            client.field302.method2204(var403);
                            client.field302.method2204(var405);
                            class213.method171(client.field302, var400);
                            client.field302.method2203(client.field302.field1861 - var406);
                            continue;
                        }
                        if (var435 == 5009) {
                            var6 -= 2;
                            String var407 = class34.field743[var6];
                            String var408 = class34.field743[var6 + 1];
                            client.field302.method2477(50);
                            client.field302.method2205(0);
                            int var409 = client.field302.field1861;
                            client.field302.method2269(var407);
                            class114 var410 = client.field302;
                            int var411 = var410.field1861;
                            int var412 = var408.length();
                            byte[] var413 = new byte[var412];
                            for (int var414 = 0; var414 < var412; var414++) {
                                char var415 = var408.charAt(var414);
                                if (!(var415 <= 0 || var415 >= 128) || !(var415 < 160 || var415 > 255)) {
                                    var413[var414] = (byte) var415;
                                } else if (var415 == 8364) {
                                    var413[var414] = -128;
                                } else if (var415 == 8218) {
                                    var413[var414] = -126;
                                } else if (var415 == 402) {
                                    var413[var414] = -125;
                                } else if (var415 == 8222) {
                                    var413[var414] = -124;
                                } else if (var415 == 8230) {
                                    var413[var414] = -123;
                                } else if (var415 == 8224) {
                                    var413[var414] = -122;
                                } else if (var415 == 8225) {
                                    var413[var414] = -121;
                                } else if (var415 == 710) {
                                    var413[var414] = -120;
                                } else if (var415 == 8240) {
                                    var413[var414] = -119;
                                } else if (var415 == 352) {
                                    var413[var414] = -118;
                                } else if (var415 == 8249) {
                                    var413[var414] = -117;
                                } else if (var415 == 338) {
                                    var413[var414] = -116;
                                } else if (var415 == 381) {
                                    var413[var414] = -114;
                                } else if (var415 == 8216) {
                                    var413[var414] = -111;
                                } else if (var415 == 8217) {
                                    var413[var414] = -110;
                                } else if (var415 == 8220) {
                                    var413[var414] = -109;
                                } else if (var415 == 8221) {
                                    var413[var414] = -108;
                                } else if (var415 == 8226) {
                                    var413[var414] = -107;
                                } else if (var415 == 8211) {
                                    var413[var414] = -106;
                                } else if (var415 == 8212) {
                                    var413[var414] = -105;
                                } else if (var415 == 732) {
                                    var413[var414] = -104;
                                } else if (var415 == 8482) {
                                    var413[var414] = -103;
                                } else if (var415 == 353) {
                                    var413[var414] = -102;
                                } else if (var415 == 8250) {
                                    var413[var414] = -101;
                                } else if (var415 == 339) {
                                    var413[var414] = -100;
                                } else if (var415 == 382) {
                                    var413[var414] = -98;
                                } else if (var415 == 376) {
                                    var413[var414] = -97;
                                } else {
                                    var413[var414] = 63;
                                }
                            }
                            var410.method2268(var413.length);
                            var410.field1861 += field3082.method2135(var413, 0, var413.length, var410.field1860, var410.field1861);
                            client.field302.method2396(client.field302.field1861 - var409);
                            continue;
                        }
                        if (var435 == 5015) {
                            String var418;
                            if (field571 == null || field571.field38 == null) {
                                var418 = "";
                            } else {
                                var418 = field571.field38;
                            }
                            class34.field743[var6++] = var418;
                            continue;
                        }
                        if (var435 == 5016) {
                            class34.field740[var5++] = client.field387;
                            continue;
                        }
                        if (var435 == 5017) {
                            var5--;
                            int var419 = class34.field740[var5];
                            class34.field740[var5++] = class11.method2599(var419);
                            continue;
                        }
                        if (var435 == 5018) {
                            var5--;
                            int var420 = class34.field740[var5];
                            class34.field740[var5++] = class11.method34(var420);
                            continue;
                        }
                        if (var435 == 5019) {
                            var5--;
                            int var421 = class34.field740[var5];
                            int[] var422 = class34.field740;
                            int var423 = var5++;
                            class33 var424 = (class33) class11.field153.method3457((long) var421);
                            int var425;
                            if (var424 == null) {
                                var425 = -1;
                            } else if (class11.field154.field2999 == var424.field3003) {
                                var425 = -1;
                            } else {
                                var425 = ((class33) var424.field3003).field729;
                            }
                            var422[var423] = var425;
                            continue;
                        }
                        if (var435 == 5020) {
                            var6--;
                            String var426 = class34.field743[var6];
                            if (var426.equalsIgnoreCase("toggleroof")) {
                                field1877.field130 = !field1877.field130;
                                class9.method2588();
                                if (field1877.field130) {
                                    class11.method626(99, "", "Roofs are now all hidden");
                                } else {
                                    class11.method626(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var426.equalsIgnoreCase("displayfps")) {
                                client.field276 = !client.field276;
                            }
                            if (client.field430 >= 2) {
                                if (var426.equalsIgnoreCase("fpson")) {
                                    client.field276 = true;
                                }
                                if (var426.equalsIgnoreCase("fpsoff")) {
                                    client.field276 = false;
                                }
                                if (var426.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var426.equalsIgnoreCase("clientdrop")) {
                                    client.method624();
                                }
                                if (var426.equalsIgnoreCase("errortest") && client.field455 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field302.method2477(75);
                            client.field302.method2204(var426.length() + 1);
                            client.field302.method2269(var426);
                            continue;
                        }
                        if (var435 == 5021) {
                            var6--;
                            client.field485 = class34.field743[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var435 == 5022) {
                            class34.field743[var6++] = client.field485;
                            continue;
                        }
                    }
                }
                if (var435 < 5400) {
                    if (var435 == 5306) {
                        class34.field740[var5++] = client.method112();
                        continue;
                    }
                    if (var435 == 5307) {
                        var5--;
                        int var427 = class34.field740[var5];
                        if (var427 != 1 && var427 != 2) {
                            continue;
                        }
                        client.field408 = 0L;
                        if (var427 >= 2) {
                            client.field340 = true;
                        } else {
                            client.field340 = false;
                        }
                        client.method2546();
                        if (client.field268 >= 25) {
                            client.field302.method2477(217);
                            client.field302.method2204(client.method112());
                            client.field302.method2205(field3047);
                            client.field302.method2205(field187);
                        }
                        class136.field2088 = true;
                        continue;
                    }
                    if (var435 == 5308) {
                        class34.field740[var5++] = field1877.field132;
                        continue;
                    }
                    if (var435 == 5309) {
                        var5--;
                        int var428 = class34.field740[var5];
                        if (var428 == 1 || var428 == 2) {
                            field1877.field132 = var428;
                            class9.method2588();
                        }
                        continue;
                    }
                }
                if (var435 >= 5600 || var435 != 5504) {
                    if (var435 < 6300) {
                        if (var435 == 6200) {
                            var5 -= 2;
                            client.field506 = (short) class34.field740[var5];
                            if (client.field506 <= 0) {
                                client.field506 = 256;
                            }
                            client.field520 = (short) class34.field740[var5 + 1];
                            if (client.field520 <= 0) {
                                client.field520 = 205;
                            }
                            continue;
                        }
                        if (var435 == 6201) {
                            var5 -= 2;
                            client.field521 = (short) class34.field740[var5];
                            if (client.field521 <= 0) {
                                client.field521 = 256;
                            }
                            client.field522 = (short) class34.field740[var5 + 1];
                            if (client.field522 <= 0) {
                                client.field522 = 320;
                            }
                            continue;
                        }
                        if (var435 == 6202) {
                            var5 -= 4;
                            client.field523 = (short) class34.field740[var5];
                            if (client.field523 <= 0) {
                                client.field523 = 1;
                            }
                            client.field473 = (short) class34.field740[var5 + 1];
                            if (client.field473 <= 0) {
                                client.field473 = 32767;
                            } else if (client.field473 < client.field523) {
                                client.field473 = client.field523;
                            }
                            client.field525 = (short) class34.field740[var5 + 2];
                            if (client.field525 <= 0) {
                                client.field525 = 1;
                            }
                            client.field526 = (short) class34.field740[var5 + 3];
                            if (client.field526 <= 0) {
                                client.field526 = 32767;
                            } else if (client.field526 < client.field525) {
                                client.field526 = client.field525;
                            }
                            continue;
                        }
                        if (var435 == 6203) {
                            if (client.field297 == null) {
                                class34.field740[var5++] = -1;
                                class34.field740[var5++] = -1;
                            } else {
                                client.method167(0, 0, client.field297.field2654, client.field297.field2655, false);
                                class34.field740[var5++] = client.field529;
                                class34.field740[var5++] = client.field338;
                            }
                            continue;
                        }
                        if (var435 == 6204) {
                            class34.field740[var5++] = client.field521;
                            class34.field740[var5++] = client.field522;
                            continue;
                        }
                        if (var435 == 6205) {
                            class34.field740[var5++] = client.field506;
                            class34.field740[var5++] = client.field520;
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var429 = class34.field740[var5];
                int var430 = class34.field740[var5 + 1];
                if (!client.field513) {
                    client.field345 = var429;
                    client.field346 = var430;
                }
            }
        } catch (Exception var434) {
            StringBuilder var432 = new StringBuilder(30);
            var432.append("").append(var4.field3015).append(" ");
            for (int var433 = class34.field736 - 1; var433 >= 0; var433--) {
                var432.append("").append(class34.field747[var433].field201.field3015).append(" ");
            }
            var432.append("").append(var10);
            class140.method530(var432.toString(), var434);
        }
    }

    @ObfuscatedName("ao.v(Lfg;II)Lbw;")
    public static class76 method631(class158 arg0, int arg1) {
        return class72.method2854(arg0, arg1) ? class72.method534() : null;
    }

    @ObfuscatedName("m.f(I)V")
    public static void method139() {
        field1308 = null;
        field637 = null;
        field1318 = null;
        field1313 = null;
        field1934 = null;
        field1876 = (byte[][]) null;
    }

    @ObfuscatedName("co.q(Ljava/lang/String;B)Ljava/lang/Class;")
    public static Class method1847(String arg0) throws ClassNotFoundException {
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else if (arg0.equals("void")) {
            return Void.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @ObfuscatedName("bu.i([Ld;II[I[II)V")
    public static void method1472(class24[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class24 var8 = arg0[var7];
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
                        var11 = arg0[var6].field617;
                        var12 = var8.field617;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field613;
                        var12 = var8.field613;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method561() ? 1 : 0;
                        var12 = var8.method561() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field611;
                        var12 = var8.field611;
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
                        var15 = arg0[var5].field617;
                        var16 = var8.field617;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field613;
                        var16 = var8.field613;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method561() ? 1 : 0;
                        var16 = var8.method561() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field611;
                        var16 = var8.field611;
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
                class24 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method1472(arg0, arg1, var6, arg3, arg4);
        method1472(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ec.t(II)V")
    public static void method2692(int arg0) {
        if (arg0 == -3) {
            class30.method641(class148.field2406, class148.field2238, class148.field2239);
        } else if (arg0 == -2) {
            class30.method641(class148.field2242, class148.field2241, class148.field2430);
        } else if (arg0 == -1) {
            class30.method641(class148.field2228, class148.field2297, class148.field2210);
        } else if (arg0 == 3) {
            class30.method641(class148.field2246, class148.field2247, class148.field2268);
        } else if (arg0 == 4) {
            class30.method641(class148.field2401, class148.field2240, class148.field2251);
        } else if (arg0 == 5) {
            class30.method641(class148.field2252, class148.field2249, class148.field2254);
        } else if (arg0 == 6) {
            class30.method641(class148.field2255, class148.field2256, class148.field2245);
        } else if (arg0 == 7) {
            class30.method641(class148.field2234, class148.field2259, class148.field2390);
        } else if (arg0 == 8) {
            class30.method641(class148.field2200, class148.field2253, class148.field2263);
        } else if (arg0 == 9) {
            class30.method641(class148.field2248, class148.field2400, class148.field2266);
        } else if (arg0 == 10) {
            class30.method641(class148.field2267, class148.field2441, class148.field2470);
        } else if (arg0 == 11) {
            class30.method641(class148.field2270, class148.field2271, class148.field2272);
        } else if (arg0 == 12) {
            class30.method641(class148.field2416, class148.field2274, class148.field2275);
        } else if (arg0 == 13) {
            class30.method641(class148.field2276, class148.field2277, class148.field2278);
        } else if (arg0 == 14) {
            class30.method641(class148.field2279, class148.field2280, class148.field2287);
        } else if (arg0 == 16) {
            class30.method641(class148.field2295, class148.field2283, class148.field2284);
        } else if (arg0 == 17) {
            class30.method641(class148.field2285, class148.field2260, class148.field2419);
        } else if (arg0 == 18) {
            class30.method641(class148.field2288, class148.field2289, class148.field2243);
        } else if (arg0 == 19) {
            class30.method641(class148.field2348, class148.field2292, class148.field2293);
        } else if (arg0 == 20) {
            class30.method641(class148.field2291, class148.field2323, class148.field2296);
        } else if (arg0 == 22) {
            class30.method641(class148.field2257, class148.field2298, class148.field2299);
        } else if (arg0 == 23) {
            class30.method641(class148.field2300, class148.field2301, class148.field2302);
        } else if (arg0 == 24) {
            class30.method641(class148.field2303, class148.field2304, class148.field2355);
        } else if (arg0 == 25) {
            class30.method641(class148.field2409, class148.field2307, class148.field2216);
        } else if (arg0 == 26) {
            class30.method641(class148.field2308, class148.field2394, class148.field2311);
        } else if (arg0 == 27) {
            class30.method641(class148.field2312, class148.field2313, class148.field2314);
        } else if (arg0 == 31) {
            class30.method641(class148.field2321, class148.field2281, class148.field2236);
        } else if (arg0 == 32) {
            class30.method641(class148.field2227, class148.field2325, class148.field2326);
        } else if (arg0 == 37) {
            class30.method641(class148.field2327, class148.field2328, class148.field2329);
        } else if (arg0 == 38) {
            class30.method641(class148.field2330, class148.field2331, class148.field2309);
        } else if (arg0 == 55) {
            class30.method641(class148.field2333, class148.field2407, class148.field2335);
        } else if (arg0 == 56) {
            class30.method641(class148.field2336, class148.field2422, class148.field2338);
            client.method2543(11);
            return;
        } else if (arg0 == 57) {
            class30.method641(class148.field2339, class148.field2305, class148.field2350);
            client.method2543(11);
            return;
        } else {
            class30.method641(class148.field2342, class148.field2343, class148.field2344);
        }
        client.method2543(10);
    }

    @ObfuscatedName("ah.aw(B)V")
    public static void method1107() {
        int var0 = client.field2092;
        int var1 = client.field2087;
        int var2 = field1857 - field3047 - var0;
        int var3 = field936 - field187 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = field254.method2784();
            int var5 = 0;
            int var6 = 0;
            if (field732 == var4) {
                Insets var7 = field732.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, field936);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, field1857, var1);
            }
            if (var2 > 0) {
                var8.fillRect(field1857 + var5 - var2, var6, var2, field936);
            }
            if (var3 > 0) {
                var8.fillRect(var5, field936 + var6 - var3, field1857, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ag.au(I)I")
    public static final int method978() {
        if (field1877.field130) {
            return field1086;
        }
        int var0 = 3;
        if (field802 < 310) {
            int var1 = field962 >> 7;
            int var2 = field1305 >> 7;
            int var3 = field571.field804 >> 7;
            int var4 = field571.field750 >> 7;
            if ((class6.field82[field1086][var1][var2] & 0x4) != 0) {
                var0 = field1086;
            }
            int var5;
            if (var3 > var1) {
                var5 = var3 - var1;
            } else {
                var5 = var1 - var3;
            }
            int var6;
            if (var4 > var2) {
                var6 = var4 - var2;
            } else {
                var6 = var2 - var4;
            }
            if (var5 > var6) {
                int var7 = var6 * 65536 / var5;
                int var8 = 32768;
                while (var1 != var3) {
                    if (var1 < var3) {
                        var1++;
                    } else if (var1 > var3) {
                        var1--;
                    }
                    if ((class6.field82[field1086][var1][var2] & 0x4) != 0) {
                        var0 = field1086;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field82[field1086][var1][var2] & 0x4) != 0) {
                            var0 = field1086;
                        }
                    }
                }
            } else {
                int var9 = var5 * 65536 / var6;
                int var10 = 32768;
                while (var2 != var4) {
                    if (var2 < var4) {
                        var2++;
                    } else if (var2 > var4) {
                        var2--;
                    }
                    if ((class6.field82[field1086][var1][var2] & 0x4) != 0) {
                        var0 = field1086;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field82[field1086][var1][var2] & 0x4) != 0) {
                            var0 = field1086;
                        }
                    }
                }
            }
        }
        if ((class6.field82[field1086][field571.field804 >> 7][field571.field750 >> 7] & 0x4) != 0) {
            var0 = field1086;
        }
        return var0;
    }

    @ObfuscatedName("as.aj(III)V")
    public static final void method905(int arg0, int arg1) {
        if (client.field515 == 2) {
            client.method35((client.field296 - field120 << 7) + client.field284, (client.field282 - field124 << 7) + client.field484, client.field283 * 2);
            if (client.field285 > -1 && client.field270 % 20 < 10) {
                field150[0].method1489(client.field285 + arg0 - 12, client.field367 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("dt.cs(Lfu;I)Z")
    public static final boolean method2652(class164 arg0) {
        if (arg0.field2750 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2750.length; var1++) {
            int var2 = client.method78(arg0, var1);
            int var3 = arg0.field2751[var1];
            if (arg0.field2750[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2750[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2750[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }
}
