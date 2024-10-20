package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("aj.o")
    public static class183 field1004;

    @ObfuscatedName("aj.a")
    public static class152 field1011;

    @ObfuscatedName("aj.e")
    public static boolean field1043;

    @ObfuscatedName("ax.a")
    public static class152 field1047;

    @ObfuscatedName("ax.ov")
    public static class71 field1050;

    @ObfuscatedName("ak.x")
    public static int field1053;

    @ObfuscatedName("ak.fr")
    public static int field1055;

    @ObfuscatedName("ak.px")
    public static Frame field1057;

    @ObfuscatedName("ak.a")
    public static class152 field1058;

    @ObfuscatedName("aa.a")
    public static class43 field1061;

    @ObfuscatedName("ab.q")
    public static int[] field1088;

    @ObfuscatedName("ab.c")
    public static int[] field1097;

    @ObfuscatedName("ab.z")
    public static boolean[] field1098;

    @ObfuscatedName("al.o")
    public static int field1108;

    @ObfuscatedName("al.n")
    public static boolean field1125;

    @ObfuscatedName("al.ii")
    public static int field1128;

    @ObfuscatedName("bg.c")
    public static int field1133;

    @ObfuscatedName("bg.h")
    public static class59[] field1134;

    @ObfuscatedName("bg.o")
    public static byte[] field1136;

    @ObfuscatedName("bg.l")
    public static int field1137;

    @ObfuscatedName("bg.t")
    public static int field1138;

    @ObfuscatedName("bg.aq")
    public static int[] field1139;

    @ObfuscatedName("bg.z")
    public static class60[] field1141;

    @ObfuscatedName("bg.s")
    public static class49[] field1142;

    @ObfuscatedName("bg.f")
    public static class50[] field1144;

    @ObfuscatedName("bg.w")
    public static boolean[] field1145;

    @ObfuscatedName("bg.ag")
    public static float[] field1146;

    @ObfuscatedName("bg.m")
    public static float[] field1147;

    @ObfuscatedName("bg.d")
    public static int[] field1151;

    @ObfuscatedName("bg.k")
    public static float[] field1153;

    @ObfuscatedName("bg.u")
    public static float[] field1154;

    @ObfuscatedName("bg.i")
    public static float[] field1155;

    @ObfuscatedName("bg.ah")
    public static float[] field1156;

    @ObfuscatedName("bg.q")
    public static int field1157;

    @ObfuscatedName("bg.ay")
    public static float[] field1158;

    @ObfuscatedName("bg.as")
    public static int[] field1159;

    @ObfuscatedName("t.o")
    public static byte[][][] field117;

    @ObfuscatedName("bz.s")
    public static String field1195;

    @ObfuscatedName("bz.ef")
    public static int[] field1197;

    @ObfuscatedName("t.r")
    public static byte[][][] field120;

    @ObfuscatedName("t.p")
    public static byte[][][] field121;

    @ObfuscatedName("t.t")
    public static int[][] field122;

    @ObfuscatedName("t.w")
    public static String[] field123;

    @ObfuscatedName("bo.o")
    public static int[] field1236;

    @ObfuscatedName("bo.x")
    public static int field1239;

    @ObfuscatedName("bw.t")
    public static int field1255;

    @ObfuscatedName("bw.l")
    public static float field1256;

    @ObfuscatedName("t.c")
    public static int[] field127;

    @ObfuscatedName("bc.f")
    public static int[][][] field1273;

    @ObfuscatedName("bb.nr")
    public static int field1274;

    @ObfuscatedName("bx.w")
    public static int[] field1279;

    @ObfuscatedName("be.od")
    public static class12 field1289;

    @ObfuscatedName("be.oz")
    public static int field1294;

    @ObfuscatedName("a.pt")
    public static Canvas field13;

    @ObfuscatedName("bi.x")
    public static File field1307;

    @ObfuscatedName("bi.nx")
    public static int field1312;

    @ObfuscatedName("bi.hf")
    public static int field1315;

    @ObfuscatedName("bl.cy")
    public static class183 field1333;

    @ObfuscatedName("bl.ab")
    public static class13[] field1334;

    @ObfuscatedName("bh.x")
    public static String field1336;

    @ObfuscatedName("bh.em")
    public static class87[] field1341;

    @ObfuscatedName("bh.bz")
    public static class154 field1346;

    @ObfuscatedName("bh.a")
    public static String field1351;

    @ObfuscatedName("bv.m")
    public static int[] field1353;

    @ObfuscatedName("bv.co")
    public static int field1369;

    @ObfuscatedName("bv.eu")
    public static class86[] field1372;

    @ObfuscatedName("bm.ar")
    public static class154 field1386;

    @ObfuscatedName("bm.mh")
    public static byte field1387;

    @ObfuscatedName("bm.dh")
    public static int field1389;

    @ObfuscatedName("bm.l")
    public static byte[][][] field1390;

    @ObfuscatedName("bp.dn")
    public static int field1406;

    @ObfuscatedName("bp.iq")
    public static int field1409;

    @ObfuscatedName("ct.e")
    public static int field1421;

    @ObfuscatedName("ct.bp")
    public static class70 field1423;

    @ObfuscatedName("ct.x")
    public static String field1426;

    @ObfuscatedName("cd.p")
    public static File field1430;

    @ObfuscatedName("cd.r")
    public static File field1433;

    @ObfuscatedName("cd.d")
    public static String[] field1435;

    @ObfuscatedName("cd.h")
    public static class30[] field1440;

    @ObfuscatedName("cd.ad")
    public static class154 field1444;

    @ObfuscatedName("cv.ao")
    public static class154 field1451;

    @ObfuscatedName("cv.og")
    public static class151 field1453;

    @ObfuscatedName("cm.cs")
    public static int field1456;

    @ObfuscatedName("cm.gv")
    public static class158 field1457;

    @ObfuscatedName("cm.r")
    public static int[] field1458;

    @ObfuscatedName("cm.p")
    public static int[] field1459;

    @ObfuscatedName("cm.e")
    public static int field1460;

    @ObfuscatedName("cm.t")
    public static byte[][] field1461;

    @ObfuscatedName("cm.a")
    public static int field1462;

    @ObfuscatedName("co.h")
    public static int field1492;

    @ObfuscatedName("co.f")
    public static int field1493;

    @ObfuscatedName("co.s")
    public static int[] field1494;

    @ObfuscatedName("cu.f")
    public static int[] field1512;

    @ObfuscatedName("ci.eh")
    public static class87 field1550;

    @ObfuscatedName("ci.mo")
    public static class86 field1551;

    @ObfuscatedName("ci.py")
    public static class85 field1552;

    @ObfuscatedName("cx.bk")
    public static int field1553;

    @ObfuscatedName("cx.u")
    public static int field1568;

    @ObfuscatedName("cx.y")
    public static int field1570;

    @ObfuscatedName("cx.g")
    public static int field1571;

    @ObfuscatedName("cx.v")
    public static int field1572;

    @ObfuscatedName("cx.b")
    public static int field1573;

    @ObfuscatedName("cx.m")
    public static int field1575;

    @ObfuscatedName("cx.ay")
    public static int field1576;

    @ObfuscatedName("cx.i")
    public static int field1578;

    @ObfuscatedName("cx.ag")
    public static int field1580;

    @ObfuscatedName("cx.j")
    public static int field1581;

    @ObfuscatedName("cx.aq")
    public static int field1583;

    @ObfuscatedName("cx.by")
    public static int field1585;

    @ObfuscatedName("cx.bo")
    public static int field1593;

    @ObfuscatedName("cx.as")
    public static int field1597;

    @ObfuscatedName("cx.k")
    public static int field1602;

    @ObfuscatedName("cx.bd")
    public static boolean[][] field1609;

    @ObfuscatedName("cx.ba")
    public static int field1610;

    @ObfuscatedName("cx.ah")
    public static int field1611;

    @ObfuscatedName("cx.bf")
    public static int field1613;

    @ObfuscatedName("cx.bu")
    public static int field1615;

    @ObfuscatedName("cz.ns")
    public static int field1616;

    @ObfuscatedName("cz.q")
    public static int[] field1625;

    @ObfuscatedName("cn.az")
    public static class86[] field1645;

    @ObfuscatedName("cn.nt")
    public static int field1654;

    @ObfuscatedName("cn.jf")
    public static int field1655;

    @ObfuscatedName("cs.dt")
    public static int[] field1661;

    @ObfuscatedName("cs.ao")
    public static class87 field1667;

    @ObfuscatedName("cs.pm")
    public static Image field1669;

    @ObfuscatedName("cs.fe")
    public static int field1671;

    @ObfuscatedName("cg.aa")
    public static class87[] field1681;

    @ObfuscatedName("c.z")
    public static int[] field169;

    @ObfuscatedName("x.bx")
    public static int field17;

    @ObfuscatedName("c.y")
    public static int[] field171;

    @ObfuscatedName("c.j")
    public static int[] field172;

    @ObfuscatedName("c.r")
    public static class141 field174;

    @ObfuscatedName("cr.au")
    public static class154 field1755;

    @ObfuscatedName("ch.cb")
    public static class183 field1758;

    @ObfuscatedName("ch.v")
    public static class16 field1759;

    @ObfuscatedName("ck.j")
    public static int field1762;

    @ObfuscatedName("ck.c")
    public static int field1765;

    @ObfuscatedName("ck.k")
    public static int field1769;

    @ObfuscatedName("ck.b")
    public static int field1773;

    @ObfuscatedName("ck.v")
    public static int field1775;

    @ObfuscatedName("ck.m")
    public static int field1777;

    @ObfuscatedName("ck.z")
    public static int field1778;

    @ObfuscatedName("ck.u")
    public static int field1779;

    @ObfuscatedName("z.dd")
    public static class95 field178;

    @ObfuscatedName("ck.ag")
    public static class106 field1782;

    @ObfuscatedName("di.fm")
    public static int field1791;

    @ObfuscatedName("dv.x")
    public static class152 field1820;

    @ObfuscatedName("dv.e")
    public static class152 field1822;

    @ObfuscatedName("z.ph")
    public static int field183;

    @ObfuscatedName("z.ar")
    public static class87[] field184;

    @ObfuscatedName("da.el")
    public static class87[] field1842;

    @ObfuscatedName("z.pp")
    public static boolean field185;

    @ObfuscatedName("s.bt")
    public static class154 field187;

    @ObfuscatedName("dd.bg")
    public static int field1870;

    @ObfuscatedName("dd.bt")
    public static int field1906;

    @ObfuscatedName("dd.bz")
    public static int field1907;

    @ObfuscatedName("dj.t")
    public static short[] field1923;

    @ObfuscatedName("s.dv")
    public static int[][] field196;

    @ObfuscatedName("dh.ey")
    public static class86 field1981;

    @ObfuscatedName("dg.p")
    public static int field1989;

    @ObfuscatedName("s.w")
    public static class127 field199;

    @ObfuscatedName("dr.p")
    public static class152 field2000;

    @ObfuscatedName("dr.a")
    public static long field2002;

    @ObfuscatedName("dw.n")
    public static int[] field2007;

    @ObfuscatedName("dz.c")
    public static boolean field2024;

    @ObfuscatedName("df.fh")
    public static int field2030;

    @ObfuscatedName("df.nq")
    public static int field2032;

    @ObfuscatedName("df.x")
    public static class152 field2033;

    @ObfuscatedName("ez.f")
    public static int field2053;

    @ObfuscatedName("et.az")
    public static long field2070;

    @ObfuscatedName("h.js")
    public static class158[] field210;

    @ObfuscatedName("f.u")
    public static int[] field227;

    @ObfuscatedName("ei.nf")
    public static int field2310;

    @ObfuscatedName("ey.l")
    public static class55 field2312;

    @ObfuscatedName("ey.dm")
    public static byte[][] field2314;

    @ObfuscatedName("ej.n")
    public static int field2316;

    @ObfuscatedName("ej.ac")
    public static class154 field2320;

    @ObfuscatedName("el.n")
    public static class152 field2325;

    @ObfuscatedName("el.x")
    public static class152 field2326;

    @ObfuscatedName("el.o")
    public static int field2327;

    @ObfuscatedName("el.a")
    public static class152 field2329;

    @ObfuscatedName("el.t")
    public static int field2330;

    @ObfuscatedName("el.q")
    public static int field2331;

    @ObfuscatedName("el.z")
    public static class139 field2332;

    @ObfuscatedName("el.ls")
    public static class137 field2333;

    @ObfuscatedName("ec.au")
    public static class87[] field2337;

    @ObfuscatedName("ec.u")
    public static int[] field2344;

    @ObfuscatedName("w.bm")
    public static class79 field237;

    @ObfuscatedName("eo.he")
    public static class3 field2370;

    @ObfuscatedName("w.ea")
    public static class86[] field238;

    @ObfuscatedName("en.v")
    public static String field2389;

    @ObfuscatedName("en.ix")
    public static int field2390;

    @ObfuscatedName("x.ai")
    public static class79 field24;

    @ObfuscatedName("w.b")
    public static String field240;

    @ObfuscatedName("w.nm")
    public static int field241;

    @ObfuscatedName("ea.en")
    public static class86[] field2433;

    @ObfuscatedName("em.a")
    public static class152 field2436;

    @ObfuscatedName("ee.bb")
    public static int field2447;

    @ObfuscatedName("ee.gx")
    public static class158 field2450;

    @ObfuscatedName("eh.l")
    public static class133 field2453;

    @ObfuscatedName("eh.eo")
    public static class86[] field2455;

    @ObfuscatedName("ef.s")
    public static boolean field2456;

    @ObfuscatedName("ef.a")
    public static Applet field2458;

    @ObfuscatedName("x.iz")
    public static int field25;

    @ObfuscatedName("d.ml")
    public static int field251;

    @ObfuscatedName("ep.e")
    public static long field2517;

    @ObfuscatedName("d.n")
    public static byte[][][] field252;

    @ObfuscatedName("ep.a")
    public static class70 field2521;

    @ObfuscatedName("ep.h")
    public static class155 field2527;

    @ObfuscatedName("d.cp")
    public static class183 field253;

    @ObfuscatedName("d.o")
    public static class152 field254;

    @ObfuscatedName("d.go")
    public static class158 field255;

    @ObfuscatedName("d.l")
    public static int[] field256;

    @ObfuscatedName("ew.do")
    public static int[] field2560;

    @ObfuscatedName("fn.c")
    public static class158 field2571;

    @ObfuscatedName("fl.e")
    public static boolean[] field2577;

    @ObfuscatedName("d.me")
    public static class46 field258;

    @ObfuscatedName("d.ej")
    public static class86 field260;

    @ObfuscatedName("fl.a")
    public static class158[][] field2608;

    @ObfuscatedName("fq.ok")
    public static class74 field2703;

    @ObfuscatedName("fo.nv")
    public static int field2709;

    @ObfuscatedName("y.cq")
    public static char field271;

    @ObfuscatedName("fm.l")
    public static int field2716;

    @ObfuscatedName("fm.a")
    public static class152 field2717;

    @ObfuscatedName("fm.iy")
    public static int field2718;

    @ObfuscatedName("fi.o")
    public static short[] field2725;

    @ObfuscatedName("fi.bf")
    public static FontMetrics field2729;

    @ObfuscatedName("fi.l")
    public static short[][] field2730;

    @ObfuscatedName("g.br")
    public static class70 field274;

    @ObfuscatedName("fw.n")
    public static class152 field2768;

    @ObfuscatedName("g.im")
    public static class158 field277;

    @ObfuscatedName("g.iu")
    public static int field278;

    @ObfuscatedName("fb.q")
    public static short[][] field2785;

    @ObfuscatedName("g.ab")
    public static class154 field281;

    @ObfuscatedName("fz.p")
    public static class86 field2818;

    @ObfuscatedName("fz.e")
    public static class152 field2819;

    @ObfuscatedName("g.j")
    public static String field282;

    @ObfuscatedName("fz.s")
    public static class58 field2821;

    @ObfuscatedName("gy.x")
    public static class87 field2832;

    @ObfuscatedName("gy.a")
    public static class120 field2834;

    @ObfuscatedName("gt.q")
    public static class87[] field2844;

    @ObfuscatedName("v.bg")
    public static class154 field297;

    @ObfuscatedName("v.bj")
    public static int field302;

    @ObfuscatedName("v.ak")
    public static class24 field303;

    @ObfuscatedName("b.e")
    public static class87 field306;

    @ObfuscatedName("b.r")
    public static class87[] field307;

    @ObfuscatedName("b.o")
    public static class87 field309;

    @ObfuscatedName("b.d")
    public static int[] field313;

    @ObfuscatedName("b.g")
    public static int[] field314;

    @ObfuscatedName("b.k")
    public static int[] field317;

    @ObfuscatedName("x.hs")
    public static int field32;

    @ObfuscatedName("b.a")
    public static boolean field329;

    @ObfuscatedName("b.n")
    public static class86 field334;

    @ObfuscatedName("b.mj")
    public static class8[] field339;

    @ObfuscatedName("b.nc")
    public static int field343;

    @ObfuscatedName("b.x")
    public static long field344;

    @ObfuscatedName("j.ou")
    public static class68 field355;

    @ObfuscatedName("e.pl")
    public static Font field36;

    @ObfuscatedName("j.da")
    public static byte[][] field361;

    @ObfuscatedName("m.eq")
    public static int[] field371;

    @ObfuscatedName("m.cz")
    public static int field374;

    @ObfuscatedName("k.de")
    public static int[] field387;

    @ObfuscatedName("k.kc")
    public static int field392;

    @ObfuscatedName("u.ex")
    public static class86[] field395;

    @ObfuscatedName("u.ff")
    public static int field396;

    @ObfuscatedName("i.x")
    public static int[] field399;

    @ObfuscatedName("i.aa")
    public static class154 field401;

    @ObfuscatedName("i.e")
    public static String[] field406;

    @ObfuscatedName("i.cg")
    public static int field410;

    @ObfuscatedName("i.iw")
    public static class158 field411;

    @ObfuscatedName("i.q")
    public static class158 field412;

    @ObfuscatedName("i.fi")
    public static int field413;

    @ObfuscatedName("client.e")
    public static client field478;

    @ObfuscatedName("client.n")
    public static class132 field481;

    @ObfuscatedName("client.t")
    public static class186 field483;

    @ObfuscatedName("client.aw")
    public static class154 field487;

    @ObfuscatedName("client.bn")
    public static class154 field511;

    @ObfuscatedName("client.ba")
    public static class154 field512;

    @ObfuscatedName("client.bk")
    public static class154 field513;

    @ObfuscatedName("e.hh")
    public static int field54;

    @ObfuscatedName("client.ec")
    public static class86[] field562;

    @ObfuscatedName("client.eb")
    public static int[] field563;

    @ObfuscatedName("r.al")
    public static class154 field60;

    @ObfuscatedName("client.ap")
    public static class79 field605;

    @ObfuscatedName("r.s")
    public static int[] field62;

    @ObfuscatedName("client.aj")
    public static class70 field745;

    @ObfuscatedName("client.l")
    public static class87[] field747;

    @ObfuscatedName("client.nd")
    public static class52 field748;

    @ObfuscatedName("ag.nw")
    public static class62 field749;

    @ObfuscatedName("ag.ed")
    public static class86[] field750;

    @ObfuscatedName("ag.ep")
    public static int[] field753;

    @ObfuscatedName("ag.pv")
    public static int field755;

    @ObfuscatedName("ag.v")
    public static class127 field756;

    @ObfuscatedName("ay.hg")
    public static int field762;

    @ObfuscatedName("ay.r")
    public static class152 field765;

    @ObfuscatedName("ay.fo")
    public static int field767;

    @ObfuscatedName("as.pd")
    public static int field780;

    @ObfuscatedName("n.jx")
    public static int field80;

    @ObfuscatedName("o.es")
    public static class86[] field84;

    @ObfuscatedName("am.ca")
    public static int field872;

    @ObfuscatedName("an.np")
    public static int field883;

    @ObfuscatedName("av.x")
    public static class152 field894;

    @ObfuscatedName("av.e")
    public static class152 field899;

    @ObfuscatedName("av.a")
    public static class152 field903;

    @ObfuscatedName("av.ps")
    public static int field912;

    @ObfuscatedName("at.x")
    public static class152 field915;

    @ObfuscatedName("at.a")
    public static class152 field926;

    @ObfuscatedName("ap.x")
    public static class152 field934;

    @ObfuscatedName("ap.e")
    public static int field935;

    @ObfuscatedName("ap.ee")
    public static class87[] field938;

    @ObfuscatedName("ap.nu")
    public static class52 field939;

    @ObfuscatedName("ap.ks")
    public static class66 field941;

    @ObfuscatedName("ap.a")
    public static class152 field947;

    @ObfuscatedName("ae.a")
    public static class152 field967;

    @ObfuscatedName("af.a")
    public static class152 field971;

    @ObfuscatedName("af.bd")
    public static class154 field975;

    @ObfuscatedName("af.h")
    public static int[] field979;

    @ObfuscatedName("ai.a")
    public static class152 field980;

    @ObfuscatedName("ai.mn")
    public static byte field989;

    @ObfuscatedName("ai.bc")
    public static String field991;

    @ObfuscatedName("aj.x")
    public static class152 field999;

    @ObfuscatedName("ak.a([Ljava/lang/CharSequence;III)Ljava/lang/String;")
    public static String method903(CharSequence[] arg0, int arg1, int arg2) {
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

    @ObfuscatedName("l.a(CB)B")
    public static byte method62(char arg0) {
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

    @ObfuscatedName("y.a(III)I")
    public static int method183(int arg0, int arg1) {
        class19 var2 = (class19) class19.field285.method3242((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field275.length) {
            return var2.field275[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("s.n(II)V")
    public static void method161(int arg0) {
        class19 var1 = (class19) class19.field285.method3242((long) arg0);
        if (var1 != null) {
            var1.method3288();
        }
    }

    @ObfuscatedName("ay.e(Ljava/lang/CharSequence;II)I")
    public static int method573(CharSequence arg0, int arg1) {
        return class147.method1346(arg0, arg1, true);
    }

    @ObfuscatedName("af.e(I)V")
    public static void method818() {
        try {
            File var0 = new File(field282, "random.dat");
            if (var0.exists()) {
                class82.field1437 = new class30(new class29(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < field1435.length; var1++) {
                    for (int var2 = 0; var2 < field123.length; var2++) {
                        File var3 = new File(field123[var2] + field1435[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            class82.field1437 = new class30(new class29(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (class82.field1437 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                class82.field1437 = new class30(new class29(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("cg.o(I)Z")
    public static boolean method1985() {
        try {
            if (class138.field2328 == 2) {
                if (field2332 == null) {
                    field2332 = class139.method2692(field2325, field2327, field2716);
                    if (field2332 == null) {
                        return false;
                    }
                }
                if (field2821 == null) {
                    field2821 = new class58(field1822, field2326);
                }
                if (field174.method2708(field2332, field2329, field2821, 22050)) {
                    field174.method2709();
                    field174.method2778(field2330);
                    field174.method2711(field2332, field2024);
                    class138.field2328 = 0;
                    field2332 = null;
                    field2821 = null;
                    field2325 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            field174.method2712();
            class138.field2328 = 0;
            field2332 = null;
            field2821 = null;
            field2325 = null;
        }
        return false;
    }

    @ObfuscatedName("aq.x(I)V")
    public static void method613() {
        if (!field329) {
            return;
        }
        field2832 = null;
        field306 = null;
        field307 = null;
        field2818 = null;
        field334 = null;
        field309 = null;
        field747 = null;
        field1645 = null;
        field1681 = null;
        field2337 = null;
        field184 = null;
        field1667 = null;
        field313 = null;
        field171 = null;
        field314 = null;
        field1279 = null;
        field172 = null;
        field1353 = null;
        field317 = null;
        field2344 = null;
        class138.field2328 = 1;
        field2325 = null;
        field2327 = -1;
        field2716 = -1;
        field2330 = 0;
        field2024 = false;
        field2331 = 2;
        class153.method2267(true);
        field329 = false;
    }

    @ObfuscatedName("s.nr(I)V")
    public static final void method165() {
        field1669 = null;
        field36 = null;
        field2729 = null;
    }

    @ObfuscatedName("at.w(IZZZB)Ler;")
    public static class154 method765(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1438 != null) {
            var4 = new class71(arg0, class82.field1438, field1440[arg0], 1000000);
        }
        return new class154(var4, field1050, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("bx.d(S)V")
    public static final void method1355() {
        try {
            if (client.field497 == 0) {
                if (field1423 != null) {
                    field1423.method1357();
                    field1423 = null;
                }
                field237 = null;
                client.field533 = false;
                client.field721 = 0;
                client.field497 = 1;
            }
            if (client.field497 == 1) {
                if (field237 == null) {
                    field237 = field2703.method1452(field991, field17);
                }
                if (field237.field1414 == 2) {
                    throw new IOException();
                }
                if (field237.field1414 == 1) {
                    field1423 = new class70((Socket) field237.field1420, field2703);
                    field237 = null;
                    client.field497 = 2;
                }
            }
            if (client.field497 == 2) {
                client.field540.field2035 = 0;
                client.field540.method2455(14);
                field1423.method1362(client.field540.field2036, 0, 1);
                client.field524.field2035 = 0;
                client.field497 = 3;
            }
            if (client.field497 == 3) {
                if (field939 != null) {
                    field939.method1152();
                }
                if (field748 != null) {
                    field748.method1152();
                }
                int var0 = field1423.method1359();
                if (field939 != null) {
                    field939.method1152();
                }
                if (field748 != null) {
                    field748.method1152();
                }
                if (var0 != 0) {
                    client.method169(var0);
                    return;
                }
                client.field524.field2035 = 0;
                client.field497 = 5;
            }
            if (client.field497 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                client.field540.field2035 = 0;
                client.field540.method2455(10);
                client.field540.method2400(var1[0]);
                client.field540.method2400(var1[1]);
                client.field540.method2400(var1[2]);
                client.field540.method2400(var1[3]);
                client.field540.method2401(0L);
                client.field540.method2402(class21.field321);
                client.field540.method2429(class6.field81, class6.field78);
                client.field523.field2035 = 0;
                if (client.field530 == 40) {
                    client.field523.method2455(18);
                } else {
                    client.field523.method2455(16);
                }
                client.field523.method2398(0);
                int var2 = client.field523.field2035;
                client.field523.method2400(18);
                client.field523.method2405(client.field540.field2036, 0, client.field540.field2035);
                int var3 = client.field523.field2035;
                client.field523.method2402(class21.field328);
                client.field523.method2455(client.field710 ? 1 : 0);
                class82.method574(client.field523);
                class127 var4 = new class127(field1453.method2928());
                field1453.method2927(var4);
                client.field523.method2405(var4.field2036, 0, var4.field2036.length);
                client.field523.method2400(field401.field2507);
                client.field523.method2400(field1755.field2507);
                client.field523.method2400(field1386.field2507);
                client.field523.method2400(field1451.field2507);
                client.field523.method2400(field487.field2507);
                client.field523.method2400(field281.field2507);
                client.field523.method2400(field2320.field2507);
                client.field523.method2400(field1444.field2507);
                client.field523.method2400(field60.field2507);
                client.field523.method2400(field297.field2507);
                client.field523.method2400(field187.field2507);
                client.field523.method2400(field1346.field2507);
                client.field523.method2400(field511.field2507);
                client.field523.method2400(field975.field2507);
                client.field523.method2400(field512.field2507);
                client.field523.method2400(field513.field2507);
                client.field523.method2589(var1, var3, client.field523.field2035);
                client.field523.method2407(client.field523.field2035 - var2);
                field1423.method1362(client.field523.field2036, 0, client.field523.field2035);
                client.field540.method2271(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                client.field524.method2271(var1);
                client.field497 = 6;
            }
            if (client.field497 == 6 && field1423.method1360() > 0) {
                int var6 = field1423.method1359();
                if (var6 == 21 && client.field530 == 20) {
                    client.field497 = 7;
                } else if (var6 == 2) {
                    client.field497 = 9;
                } else if (var6 == 15 && client.field530 == 40) {
                    client.field540.field2035 = 0;
                    client.field524.field2035 = 0;
                    client.field526 = -1;
                    client.field624 = -1;
                    client.field584 = -1;
                    client.field736 = -1;
                    client.field603 = 0;
                    client.field579 = 0;
                    client.field548 = 0;
                    client.field506 = 0;
                    client.field649 = false;
                    client.field718 = 0;
                    client.field716 = 0;
                    for (int var7 = 0; var7 < client.field604.length; var7++) {
                        if (client.field604[var7] != null) {
                            client.field604[var7].field421 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < client.field670.length; var8++) {
                        if (client.field670[var8] != null) {
                            client.field670[var8].field421 = -1;
                        }
                    }
                    class19.field285 = new class175(32);
                    client.method143(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        client.field687[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && client.field517 < 1) {
                    client.field517++;
                    client.field497 = 0;
                } else {
                    client.method169(var6);
                    return;
                }
            }
            if (client.field497 == 7 && field1423.method1360() > 0) {
                client.field518 = (field1423.method1359() + 3) * 60;
                client.field497 = 8;
            }
            if (client.field497 == 8) {
                client.field721 = 0;
                class21.method42(class134.field2125, class134.field2242, client.field518 / 60 + class134.field2106);
                if (--client.field518 <= 0) {
                    client.field497 = 0;
                }
            } else {
                if (client.field497 == 9 && field1423.method1360() >= 8) {
                    client.field651 = field1423.method1359();
                    client.field652 = field1423.method1359() == 1;
                    client.field689 = field1423.method1359();
                    client.field689 <<= 0x8;
                    client.field689 += field1423.method1359();
                    client.field707 = field1423.method1359();
                    field1423.method1361(client.field524.field2036, 0, 1);
                    client.field524.field2035 = 0;
                    client.field526 = client.field524.method2273();
                    field1423.method1361(client.field524.field2036, 0, 2);
                    client.field524.field2035 = 0;
                    client.field603 = client.field524.method2413();
                    if (client.field707 == 1) {
                        try {
                            client var10 = field478;
                            JSObject.getWindow(var10).call("zap", (Object[]) null);
                        } catch (Throwable var16) {
                        }
                    } else {
                        try {
                            client var12 = field478;
                            JSObject.getWindow(var12).call("unzap", (Object[]) null);
                        } catch (Throwable var15) {
                        }
                    }
                    client.field497 = 10;
                }
                if (client.field497 != 10) {
                    client.field721++;
                    if (client.field721 > 2000) {
                        if (client.field517 < 1) {
                            if (field302 == field17) {
                                field17 = field2447;
                            } else {
                                field17 = field302;
                            }
                            client.field517++;
                            client.field497 = 0;
                        } else {
                            client.method169(-3);
                        }
                    }
                } else if (field1423.method1360() >= client.field603) {
                    client.field524.field2035 = 0;
                    field1423.method1361(client.field524.field2036, 0, client.field603);
                    client.method167();
                    field1456 = -1;
                    client.method146(false);
                    client.field526 = -1;
                }
            }
        } catch (IOException var17) {
            if (client.field517 < 1) {
                if (field302 == field17) {
                    field17 = field2447;
                } else {
                    field17 = field302;
                }
                client.field517++;
                client.field497 = 0;
            } else {
                client.method169(-2);
            }
        }
    }

    @ObfuscatedName("eg.an(Le;III)V")
    public static void method2649(class3 arg0, int arg1, int arg2) {
        if (arg0.field447 == arg1 && arg1 != -1) {
            int var3 = class34.method57(arg1).field895;
            if (var3 == 1) {
                arg0.field448 = 0;
                arg0.field449 = 0;
                arg0.field418 = arg2;
                arg0.field451 = 0;
            }
            if (var3 == 2) {
                arg0.field451 = 0;
            }
        } else if (arg1 == -1 || arg0.field447 == -1 || class34.method57(arg1).field905 >= class34.method57(arg0.field447).field905) {
            arg0.field447 = arg1;
            arg0.field448 = 0;
            arg0.field449 = 0;
            arg0.field418 = arg2;
            arg0.field451 = 0;
            arg0.field472 = arg0.field455;
        }
    }

    @ObfuscatedName("b.ak(IIIB)V")
    public static final void method217(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            client.field589 = -1;
            client.field590 = -1;
            return;
        }
        int var3 = client.method13(arg0, arg1, field54) - arg2;
        int var4 = arg0 - field396;
        int var5 = var3 - field767;
        int var6 = arg1 - field1791;
        int var7 = class104.field1785[field413];
        int var8 = class104.field1786[field413];
        int var9 = class104.field1785[field1671];
        int var10 = class104.field1786[field1671];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            client.field589 = (var11 << 9) / var15 + 256;
            client.field590 = (var14 << 9) / var15 + 167;
        } else {
            client.field589 = -1;
            client.field590 = -1;
        }
    }

    @ObfuscatedName("client.al(IIIIIIIIII)V")
    public static final void method542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) client.field619.method3252(); var10 != null; var10 = (class22) client.field619.method3268()) {
            if (var10.field362 == arg0 && var10.field349 == arg1 && var10.field356 == arg2 && var10.field348 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field362 = arg0;
            var9.field348 = arg3;
            var9.field349 = arg1;
            var9.field356 = arg2;
            client.method2263(var9);
            client.field619.method3247(var9);
        }
        var9.field347 = arg4;
        var9.field354 = arg5;
        var9.field350 = arg6;
        var9.field363 = arg7;
        var9.field358 = arg8;
    }

    @ObfuscatedName("bv.bc(IIB)V")
    public static final void method1504(int arg0, int arg1) {
        if (client.field506 < 2 && client.field638 == 0 && !client.field549) {
            return;
        }
        String var2;
        if (client.field638 == 1 && client.field506 < 2) {
            var2 = class134.field2214 + class134.field2224 + client.field639 + " " + class2.field20;
        } else if (client.field549 && client.field506 < 2) {
            var2 = client.field642 + class134.field2224 + client.field643 + " " + class2.field20;
        } else {
            int var3 = client.field506 - 1;
            String var4;
            if (client.field580[var3].length() > 0) {
                var4 = client.field632[var3] + class134.field2224 + client.field580[var3];
            } else {
                var4 = client.field632[var3];
            }
            var2 = var4;
        }
        if (client.field506 > 2) {
            var2 = var2 + class2.method157(16777215) + " " + '/' + " " + (client.field506 - 2) + class134.field2218;
        }
        field1333.method3368(var2, arg0 + 4, arg1 + 15, 16777215, 0, client.field658 / 1000);
    }

    @ObfuscatedName("r.cu(Lfl;I)V")
    public static void method26(class158 arg0) {
        if (client.field593 == arg0.field2699) {
            client.field687[arg0.field2610] = true;
        }
    }

    @ObfuscatedName("eu.cz([Lfl;II)V")
    public static final void method2859(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null && var3.field2697 == arg1 && (!var3.field2598 || !client.method1381(var3))) {
                if (var3.field2604 == 0) {
                    if (!var3.field2598 && client.method1381(var3) && field277 != var3) {
                        continue;
                    }
                    method2859(arg0, var3.field2583);
                    if (var3.field2691 != null) {
                        method2859(var3.field2691, var3.field2583);
                    }
                    class4 var4 = (class4) client.field694.method3242((long) var3.field2583);
                    if (var4 != null) {
                        client.method48(var4.field59);
                    }
                }
                if (var3.field2604 == 6) {
                    if (var3.field2619 != -1 || var3.field2658 != -1) {
                        boolean var5 = client.method1377(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2658;
                        } else {
                            var6 = var3.field2619;
                        }
                        if (var6 != -1) {
                            class34 var7 = class34.method57(var6);
                            var3.field2690 += client.field561;
                            while (var3.field2690 > var7.field900[var3.field2578]) {
                                var3.field2690 -= var7.field900[var3.field2578];
                                var3.field2578++;
                                if (var3.field2578 >= var7.field898.length) {
                                    var3.field2578 -= var7.field897;
                                    if (var3.field2578 < 0 || var3.field2578 >= var7.field898.length) {
                                        var3.field2578 = 0;
                                    }
                                }
                                method26(var3);
                            }
                        }
                    }
                    if (var3.field2627 != 0 && !var3.field2598) {
                        int var8 = var3.field2627 >> 16;
                        int var9 = var3.field2627 << 16 >> 16;
                        int var10 = client.field561 * var8;
                        int var11 = client.field561 * var9;
                        var3.field2623 = var3.field2623 + var10 & 0x7FF;
                        var3.field2624 = var3.field2624 + var11 & 0x7FF;
                        method26(var3);
                    }
                }
            }
        }
    }
}
