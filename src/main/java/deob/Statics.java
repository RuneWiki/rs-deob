package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Desktop.Action;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Date;

public class Statics {

    @ObfuscatedName("ay.an")
    public static long field1013;

    @ObfuscatedName("ay.p")
    public static class158 field1015;

    @ObfuscatedName("ay.r")
    public static String field1017;

    @ObfuscatedName("ay.qb")
    public static int field1018;

    @ObfuscatedName("ay.t")
    public static int[] field1021;

    @ObfuscatedName("ap.p")
    public static class158 field1022;

    @ObfuscatedName("ap.nk")
    public static int field1027;

    @ObfuscatedName("av.hb")
    public static int field1035;

    @ObfuscatedName("av.p")
    public static class158 field1039;

    @ObfuscatedName("ah.t")
    public static boolean field1050;

    @ObfuscatedName("ah.m")
    public static class215 field1058;

    @ObfuscatedName("ah.fc")
    public static int field1059;

    @ObfuscatedName("ah.pc")
    public static Clipboard field1097;

    @ObfuscatedName("ah.kf")
    public static int field1104;

    @ObfuscatedName("at.p")
    public static class158 field1109;

    @ObfuscatedName("ac.p")
    public static class49 field1112;

    @ObfuscatedName("ax.t")
    public static class68 field1119;

    @ObfuscatedName("ax.kd")
    public static class164[] field1122;

    @ObfuscatedName("ax.f")
    public static boolean field1128;

    @ObfuscatedName("ax.gk")
    public static class164 field1141;

    @ObfuscatedName("bn.bh")
    public static class159 field1160;

    @ObfuscatedName("bc.d")
    public static int field1178;

    @ObfuscatedName("bc.c")
    public static float field1183;

    @ObfuscatedName("bh.m")
    public static int[] field1207;

    @ObfuscatedName("bh.v")
    public static int[] field1216;

    @ObfuscatedName("bh.h")
    public static boolean[] field1217;

    @ObfuscatedName("bs.c")
    public static int field1227;

    @ObfuscatedName("bs.az")
    public static int[] field1229;

    @ObfuscatedName("bs.ag")
    public static float[] field1233;

    @ObfuscatedName("bs.d")
    public static int field1234;

    @ObfuscatedName("bs.v")
    public static int field1236;

    @ObfuscatedName("bs.h")
    public static class69[] field1238;

    @ObfuscatedName("bs.n")
    public static class63[] field1239;

    @ObfuscatedName("bs.x")
    public static class56[] field1240;

    @ObfuscatedName("bs.z")
    public static float[] field1241;

    @ObfuscatedName("bs.r")
    public static boolean[] field1242;

    @ObfuscatedName("bs.y")
    public static int[] field1243;

    @ObfuscatedName("bs.aa")
    public static float[] field1246;

    @ObfuscatedName("bs.s")
    public static byte[] field1248;

    @ObfuscatedName("bs.j")
    public static float[] field1249;

    @ObfuscatedName("bs.b")
    public static float[] field1251;

    @ObfuscatedName("bs.a")
    public static float[] field1252;

    @ObfuscatedName("bs.am")
    public static float[] field1254;

    @ObfuscatedName("bs.o")
    public static class64[] field1255;

    @ObfuscatedName("bs.aq")
    public static int[] field1257;

    @ObfuscatedName("bs.m")
    public static int field1258;

    @ObfuscatedName("c.nc")
    public static class51 field127;

    @ObfuscatedName("bd.m")
    public static class76 field1291;

    @ObfuscatedName("c.ap")
    public static class138 field130;

    @ObfuscatedName("be.c")
    public static short[][] field1302;

    @ObfuscatedName("be.b")
    public static int[] field1305;

    @ObfuscatedName("c.m")
    public static int[] field131;

    @ObfuscatedName("be.pd")
    public static int field1310;

    @ObfuscatedName("bz.qv")
    public static Frame field1314;

    @ObfuscatedName("bz.h")
    public static int[] field1315;

    @ObfuscatedName("bz.ob")
    public static int field1317;

    @ObfuscatedName("ba.h")
    public static class164 field1321;

    @ObfuscatedName("ba.e")
    public static int field1322;

    @ObfuscatedName("ba.f")
    public static int[] field1323;

    @ObfuscatedName("ba.mz")
    public static class23[] field1324;

    @ObfuscatedName("ba.s")
    public static int[] field1325;

    @ObfuscatedName("ba.w")
    public static int[] field1326;

    @ObfuscatedName("d.bv")
    public static class159 field133;

    @ObfuscatedName("ba.p")
    public static int field1330;

    @ObfuscatedName("bf.x")
    public static int field1351;

    @ObfuscatedName("bf.o")
    public static int field1352;

    @ObfuscatedName("bf.n")
    public static int[] field1355;

    @ObfuscatedName("bu.o")
    public static int[] field1369;

    @ObfuscatedName("d.mg")
    public static byte field139;

    @ObfuscatedName("cl.ag")
    public static int field1391;

    @ObfuscatedName("cl.z")
    public static int field1396;

    @ObfuscatedName("d.ix")
    public static int field140;

    @ObfuscatedName("cl.am")
    public static int field1403;

    @ObfuscatedName("cl.aa")
    public static int field1407;

    @ObfuscatedName("cl.i")
    public static int field1408;

    @ObfuscatedName("d.d")
    public static short[] field141;

    @ObfuscatedName("cl.l")
    public static int field1411;

    @ObfuscatedName("cl.u")
    public static int field1412;

    @ObfuscatedName("cl.j")
    public static int field1413;

    @ObfuscatedName("cl.bx")
    public static int field1414;

    @ObfuscatedName("cl.g")
    public static int field1415;

    @ObfuscatedName("cl.a")
    public static int field1416;

    @ObfuscatedName("cl.bt")
    public static int field1418;

    @ObfuscatedName("cl.az")
    public static int field1420;

    @ObfuscatedName("cl.q")
    public static int field1428;

    @ObfuscatedName("cl.y")
    public static int field1440;

    @ObfuscatedName("cl.b")
    public static int field1444;

    @ObfuscatedName("cl.by")
    public static boolean[][] field1446;

    @ObfuscatedName("cl.bb")
    public static int field1447;

    @ObfuscatedName("cl.bp")
    public static int field1448;

    @ObfuscatedName("cl.bc")
    public static int field1449;

    @ObfuscatedName("cl.bv")
    public static int field1452;

    @ObfuscatedName("v.qk")
    public static int field147;

    @ObfuscatedName("ci.v")
    public static int field1486;

    @ObfuscatedName("ci.qw")
    public static class73 field1489;

    @ObfuscatedName("ci.et")
    public static class74 field1490;

    @ObfuscatedName("cn.h")
    public static class171 field1491;

    @ObfuscatedName("cn.f")
    public static class158 field1493;

    @ObfuscatedName("cn.e")
    public static int field1494;

    @ObfuscatedName("cc.g")
    public static int field1505;

    @ObfuscatedName("cc.m")
    public static int field1506;

    @ObfuscatedName("cc.am")
    public static class87 field1507;

    @ObfuscatedName("cc.h")
    public static int field1508;

    @ObfuscatedName("cc.l")
    public static int field1509;

    @ObfuscatedName("cc.j")
    public static int field1511;

    @ObfuscatedName("cc.z")
    public static int field1512;

    @ObfuscatedName("cc.u")
    public static int field1513;

    @ObfuscatedName("cc.b")
    public static int field1520;

    @ObfuscatedName("cd.qy")
    public static int field1521;

    @ObfuscatedName("cd.bw")
    public static class159 field1527;

    @ObfuscatedName("cd.op")
    public static int field1528;

    @ObfuscatedName("cd.g")
    public static class111 field1530;

    @ObfuscatedName("v.d")
    public static class76[] field155;

    @ObfuscatedName("cs.en")
    public static class74[] field1556;

    @ObfuscatedName("v.ad")
    public static int field156;

    @ObfuscatedName("cg.fj")
    public static int field1567;

    @ObfuscatedName("m.do")
    public static int[] field161;

    @ObfuscatedName("cx.qq")
    public static Canvas field1618;

    @ObfuscatedName("cx.n")
    public static class55 field1621;

    @ObfuscatedName("cx.ci")
    public static class135 field1622;

    @ObfuscatedName("m.v")
    public static class18 field163;

    @ObfuscatedName("m.l")
    public static int[] field164;

    @ObfuscatedName("m.w")
    public static class158 field168;

    @ObfuscatedName("m.ii")
    public static class164 field169;

    @ObfuscatedName("p.mr")
    public static class74 field17;

    @ObfuscatedName("cb.eo")
    public static class74[] field1702;

    @ObfuscatedName("ck.pf")
    public static class212 field1708;

    @ObfuscatedName("m.u")
    public static int[] field171;

    @ObfuscatedName("m.kb")
    public static class123 field172;

    @ObfuscatedName("h.fn")
    public static int field175;

    @ObfuscatedName("cm.bg")
    public static int field1781;

    @ObfuscatedName("cm.bw")
    public static int field1782;

    @ObfuscatedName("cm.bn")
    public static int field1783;

    @ObfuscatedName("cr.qt")
    public static Image field1797;

    @ObfuscatedName("cr.np")
    public static int field1798;

    @ObfuscatedName("cr.pk")
    public static class151 field1799;

    @ObfuscatedName("cr.dk")
    public static int field1800;

    @ObfuscatedName("ct.hd")
    public static int field1818;

    @ObfuscatedName("ct.iq")
    public static class29 field1841;

    @ObfuscatedName("cj.bp")
    public static class159 field1843;

    @ObfuscatedName("h.dn")
    public static int[][] field185;

    @ObfuscatedName("dy.d")
    public static int field1851;

    @ObfuscatedName("dy.t")
    public static class158 field1852;

    @ObfuscatedName("dk.x")
    public static class163 field1856;

    @ObfuscatedName("h.am")
    public static int[] field186;

    @ObfuscatedName("dr.qs")
    public static Font field1863;

    @ObfuscatedName("dr.k")
    public static long field1864;

    @ObfuscatedName("dr.f")
    public static class158 field1865;

    @ObfuscatedName("dr.p")
    public static long field1866;

    @ObfuscatedName("dr.ki")
    public static int field1867;

    @ObfuscatedName("du.c")
    public static int[] field1869;

    @ObfuscatedName("h.m")
    public static boolean field187;

    @ObfuscatedName("du.bw")
    public static class76 field1873;

    @ObfuscatedName("n.dq")
    public static class81 field189;

    @ObfuscatedName("dv.cm")
    public static class215 field1900;

    @ObfuscatedName("dn.ff")
    public static int field1924;

    @ObfuscatedName("dn.ns")
    public static int field1926;

    @ObfuscatedName("n.cj")
    public static int field193;

    @ObfuscatedName("dz.bt")
    public static class159 field1938;

    @ObfuscatedName("dq.p")
    public static class158 field1941;

    @ObfuscatedName("dl.d")
    public static byte[][] field1944;

    @ObfuscatedName("dt.dr")
    public static int field1948;

    @ObfuscatedName("dt.pa")
    public static int field1953;

    @ObfuscatedName("dm.qp")
    public static int field1958;

    @ObfuscatedName("dm.bj")
    public static class159 field1964;

    @ObfuscatedName("dm.ck")
    public static class215 field1965;

    @ObfuscatedName("db.o")
    public static String field1967;

    @ObfuscatedName("db.bf")
    public static FontMetrics field1970;

    @ObfuscatedName("da.t")
    public static class74 field1981;

    @ObfuscatedName("dx.pb")
    public static class128 field1983;

    @ObfuscatedName("dd.k")
    public static String field1988;

    @ObfuscatedName("n.mk")
    public static byte field199;

    @ObfuscatedName("dd.p")
    public static String field1990;

    @ObfuscatedName("dc.il")
    public static int field2037;

    @ObfuscatedName("dc.a")
    public static int[] field2039;

    @ObfuscatedName("eg.k")
    public static int field2040;

    @ObfuscatedName("eg.ac")
    public static class74[] field2041;

    @ObfuscatedName("ef.ab")
    public static boolean field2048;

    @ObfuscatedName("x.bx")
    public static class159 field205;

    @ObfuscatedName("ej.fu")
    public static int field2069;

    @ObfuscatedName("ee.pr")
    public static long field2070;

    @ObfuscatedName("ee.er")
    public static class76[] field2073;

    @ObfuscatedName("ee.w")
    public static File field2074;

    @ObfuscatedName("ee.r")
    public static class111 field2075;

    @ObfuscatedName("ee.kv")
    public static int field2078;

    @ObfuscatedName("ep.ac")
    public static class159 field2084;

    @ObfuscatedName("o.av")
    public static class135 field211;

    @ObfuscatedName("es.if")
    public static class164 field2111;

    @ObfuscatedName("es.dm")
    public static int field2113;

    @ObfuscatedName("ed.cn")
    public static class135 field2127;

    @ObfuscatedName("ed.e")
    public static int field2129;

    @ObfuscatedName("ed.k")
    public static String field2131;

    @ObfuscatedName("ed.v")
    public static short[][] field2132;

    @ObfuscatedName("ed.p")
    public static Applet field2135;

    @ObfuscatedName("ed.nj")
    public static class52 field2137;

    @ObfuscatedName("ec.g")
    public static String field2138;

    @ObfuscatedName("ec.t")
    public static int field2140;

    @ObfuscatedName("ec.f")
    public static File field2141;

    @ObfuscatedName("ec.x")
    public static class219[] field2148;

    @ObfuscatedName("ec.o")
    public static int field2149;

    @ObfuscatedName("em.d")
    public static int[][] field2180;

    @ObfuscatedName("em.q")
    public static int field2183;

    @ObfuscatedName("eb.c")
    public static byte[][][] field2207;

    @ObfuscatedName("r.nu")
    public static int field227;

    @ObfuscatedName("r.gq")
    public static class164 field230;

    @ObfuscatedName("r.qf")
    public static int field231;

    @ObfuscatedName("i.em")
    public static class74[] field248;

    @ObfuscatedName("ev.ba")
    public static int field2489;

    @ObfuscatedName("client.k")
    public static client field254;

    @ObfuscatedName("ea.bo")
    public static class159 field2543;

    @ObfuscatedName("ea.c")
    public static int field2544;

    @ObfuscatedName("ew.lc")
    public static class122 field2547;

    @ObfuscatedName("ez.w")
    public static int field2550;

    @ObfuscatedName("ex.ed")
    public static class76[] field2556;

    @ObfuscatedName("eu.ca")
    public static class138 field2560;

    @ObfuscatedName("eu.fv")
    public static int field2562;

    @ObfuscatedName("eu.pv")
    public static short[] field2563;

    @ObfuscatedName("fn.el")
    public static class74[] field2564;

    @ObfuscatedName("fn.k")
    public static class158 field2566;

    @ObfuscatedName("fn.r")
    public static String[] field2568;

    @ObfuscatedName("fn.i")
    public static int field2570;

    @ObfuscatedName("client.d")
    public static class145 field260;

    @ObfuscatedName("fv.hw")
    public static int field2606;

    @ObfuscatedName("client.v")
    public static class203 field261;

    @ObfuscatedName("fj.ax")
    public static class159 field2616;

    @ObfuscatedName("fa.e")
    public static long field2619;

    @ObfuscatedName("fa.p")
    public static class135 field2627;

    @ObfuscatedName("fa.n")
    public static boolean field2629;

    @ObfuscatedName("fh.p")
    public static class164[][] field2642;

    @ObfuscatedName("fh.k")
    public static boolean[] field2643;

    @ObfuscatedName("fh.e")
    public static class158 field2644;

    @ObfuscatedName("fh.t")
    public static class158 field2645;

    @ObfuscatedName("fk.v")
    public static class76 field2789;

    @ObfuscatedName("fb.n")
    public static int[] field2799;

    @ObfuscatedName("k.eb")
    public static class74[] field28;

    @ObfuscatedName("fb.nt")
    public static int field2801;

    @ObfuscatedName("fw.qh")
    public static class125 field2802;

    @ObfuscatedName("fw.ax")
    public static class76[] field2807;

    @ObfuscatedName("fu.f")
    public static class175 field2811;

    @ObfuscatedName("fu.bn")
    public static class159 field2813;

    @ObfuscatedName("fc.e")
    public static class158 field2814;

    @ObfuscatedName("fg.s")
    public static int field2823;

    @ObfuscatedName("fp.u")
    public static String field2839;

    @ObfuscatedName("client.pi")
    public static class126 field284;

    @ObfuscatedName("fs.k")
    public static class158 field2855;

    @ObfuscatedName("fs.e")
    public static class158 field2856;

    @ObfuscatedName("fs.p")
    public static class158 field2859;

    @ObfuscatedName("client.s")
    public static class144 field288;

    @ObfuscatedName("fe.on")
    public static int field2896;

    @ObfuscatedName("k.po")
    public static int field29;

    @ObfuscatedName("client.br")
    public static int field295;

    @ObfuscatedName("gt.cd")
    public static char field3017;

    @ObfuscatedName("gt.bq")
    public static int field3021;

    @ObfuscatedName("gb.s")
    public static byte[][][] field3044;

    @ObfuscatedName("gb.as")
    public static class76[] field3045;

    @ObfuscatedName("gi.w")
    public static class158 field3067;

    @ObfuscatedName("client.aw")
    public static class138 field307;

    @ObfuscatedName("hc.y")
    public static String[] field3083;

    @ObfuscatedName("ha.p")
    public static class105 field3086;

    @ObfuscatedName("hu.v")
    public static class76[] field3090;

    @ObfuscatedName("hz.dj")
    public static int field3143;

    @ObfuscatedName("client.bk")
    public static int field476;

    @ObfuscatedName("e.nd")
    public static int field51;

    @ObfuscatedName("f.dh")
    public static int[] field53;

    @ObfuscatedName("client.by")
    public static class159 field536;

    @ObfuscatedName("q.bz")
    public static String field546;

    @ObfuscatedName("q.na")
    public static class70 field548;

    @ObfuscatedName("f.mj")
    public static int field56;

    @ObfuscatedName("g.ia")
    public static int field563;

    @ObfuscatedName("g.hf")
    public static int field564;

    @ObfuscatedName("g.z")
    public static class13 field566;

    @ObfuscatedName("l.rf")
    public static boolean field575;

    @ObfuscatedName("u.ql")
    public static int field594;

    @ObfuscatedName("u.ih")
    public static int field597;

    @ObfuscatedName("f.cw")
    public static class215 field60;

    @ObfuscatedName("f.ei")
    public static class74 field61;

    @ObfuscatedName("z.w")
    public static class24[] field612;

    @ObfuscatedName("b.l")
    public static String field639;

    @ObfuscatedName("w.ae")
    public static String field64;

    @ObfuscatedName("b.k")
    public static int field641;

    @ObfuscatedName("a.ev")
    public static class76[] field648;

    @ObfuscatedName("a.q")
    public static int[] field649;

    @ObfuscatedName("w.gp")
    public static class164 field65;

    @ObfuscatedName("a.cf")
    public static int field651;

    @ObfuscatedName("ag.bg")
    public static class159 field657;

    @ObfuscatedName("ag.s")
    public static int field659;

    @ObfuscatedName("am.bb")
    public static class159 field676;

    @ObfuscatedName("am.as")
    public static class159 field677;

    @ObfuscatedName("aa.ds")
    public static byte[][] field680;

    @ObfuscatedName("aa.qd")
    public static int field685;

    @ObfuscatedName("aa.g")
    public static int[] field689;

    @ObfuscatedName("az.f")
    public static class76 field693;

    @ObfuscatedName("az.w")
    public static class76[] field694;

    @ObfuscatedName("az.s")
    public static class74 field695;

    @ObfuscatedName("az.c")
    public static class76 field696;

    @ObfuscatedName("t.pp")
    public static class9 field71;

    @ObfuscatedName("az.e")
    public static class76 field713;

    @ObfuscatedName("az.p")
    public static boolean field717;

    @ObfuscatedName("az.bg")
    public static class76[] field719;

    @ObfuscatedName("aq.oh")
    public static int field725;

    @ObfuscatedName("ak.hu")
    public static class3 field734;

    @ObfuscatedName("ak.dv")
    public static int[] field736;

    @ObfuscatedName("ak.qc")
    public static int field737;

    @ObfuscatedName("t.ag")
    public static int[] field74;

    @ObfuscatedName("ar.ec")
    public static class74[] field744;

    @ObfuscatedName("ar.b")
    public static int[] field746;

    @ObfuscatedName("al.e")
    public static int[] field749;

    @ObfuscatedName("t.w")
    public static byte[][][] field75;

    @ObfuscatedName("al.f")
    public static String[] field753;

    @ObfuscatedName("al.m")
    public static class164 field757;

    @ObfuscatedName("t.t")
    public static byte[][][] field76;

    @ObfuscatedName("al.ek")
    public static class74[] field761;

    @ObfuscatedName("t.v")
    public static int[] field77;

    @ObfuscatedName("au.nw")
    public static class52 field823;

    @ObfuscatedName("au.iy")
    public static int field824;

    @ObfuscatedName("ao.s")
    public static short[] field827;

    @ObfuscatedName("af.k")
    public static class158 field835;

    @ObfuscatedName("af.p")
    public static class158 field838;

    @ObfuscatedName("t.x")
    public static int[] field86;

    @ObfuscatedName("ai.e")
    public static class158 field876;

    @ObfuscatedName("t.o")
    public static int[][][] field88;

    @ObfuscatedName("ai.k")
    public static class158 field888;

    @ObfuscatedName("t.f")
    public static byte[][][] field89;

    @ObfuscatedName("ai.bc")
    public static class159 field924;

    @ObfuscatedName("t.ey")
    public static class74[] field93;

    @ObfuscatedName("aj.p")
    public static class158 field934;

    @ObfuscatedName("aw.k")
    public static class158 field942;

    @ObfuscatedName("aw.cp")
    public static int field948;

    @ObfuscatedName("aw.dz")
    public static byte[][] field960;

    @ObfuscatedName("aw.ft")
    public static int field962;

    @ObfuscatedName("aw.p")
    public static class158 field963;

    @ObfuscatedName("ab.p")
    public static class158 field978;

    @ObfuscatedName("ab.iz")
    public static int field979;

    @ObfuscatedName("ab.k")
    public static File field981;

    @ObfuscatedName("ad.k")
    public static class158 field985;

    @ObfuscatedName("ad.e")
    public static int field986;

    @ObfuscatedName("ad.p")
    public static class158 field993;

    @ObfuscatedName("ad.rz")
    public static String field996;

    @ObfuscatedName("a.p(Lff;I)V")
    public static void method575(class158 arg0) {
        field1109 = arg0;
        field2040 = field1109.method2904(16);
    }

    @ObfuscatedName("fd.k(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method3365(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            class130.method560(arg0, 3);
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (class130.field2030.startsWith("win") && !arg3) {
            class130.method560(arg0, 0);
            return;
        }
        if (class130.field2030.startsWith("mac")) {
            class130.method128(arg0, 1, arg2);
            return;
        }
        class130.method560(arg0, 2);
    }

    @ObfuscatedName("l.w(I)V")
    public static void method503() {
        class48.field1106.method3374();
    }

    @ObfuscatedName("aw.t(B)V")
    public static void method776() {
        class11.field170.clear();
        class11.field158.method3424();
        class11.field159.method3479();
        class11.field160 = 0;
    }

    @ObfuscatedName("eh.k(Lp;II)V")
    public static void method2814(class1 arg0, int arg1) {
        Object[] var2 = arg0.field8;
        int var3 = (Integer) var2[0];
        class20 var4 = class20.method2526(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field554;
        int[] var9 = var4.field555;
        byte var10 = -1;
        class34.field755 = 0;
        try {
            field749 = new int[var4.field553];
            int var11 = 0;
            field753 = new String[var4.field569];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field14;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2652;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2653;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2652;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2653;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field15;
                    }
                    field749[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    field753[var12++] = var15;
                }
            }
            int var16 = 0;
            class34.field752 = arg0.field11;
            label3113: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var491 = var8[var7];
                if (var491 < 100) {
                    if (var491 == 0) {
                        class34.field750[var5++] = var9[var7];
                        continue;
                    }
                    if (var491 == 1) {
                        int var17 = var9[var7];
                        class34.field750[var5++] = class167.field2804[var17];
                        continue;
                    }
                    if (var491 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class167.field2804[var18] = class34.field750[var5];
                        client.method626(var18);
                        continue;
                    }
                    if (var491 == 3) {
                        class34.field747[var6++] = var4.field570[var7];
                        continue;
                    }
                    if (var491 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var491 == 7) {
                        var5 -= 2;
                        if (class34.field750[var5 + 1] != class34.field750[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var491 == 8) {
                        var5 -= 2;
                        if (class34.field750[var5 + 1] == class34.field750[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var491 == 9) {
                        var5 -= 2;
                        if (class34.field750[var5] < class34.field750[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var491 == 10) {
                        var5 -= 2;
                        if (class34.field750[var5] > class34.field750[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var491 == 21) {
                        if (class34.field755 == 0) {
                            return;
                        }
                        class14 var19 = class34.field756[--class34.field755];
                        var4 = var19.field201;
                        var8 = var4.field554;
                        var9 = var4.field555;
                        var7 = var19.field202;
                        field749 = var19.field200;
                        field753 = var19.field203;
                        continue;
                    }
                    if (var491 == 25) {
                        int var20 = var9[var7];
                        class34.field750[var5++] = class167.method2494(var20);
                        continue;
                    }
                    if (var491 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class167.method141(var21, class34.field750[var5]);
                        continue;
                    }
                    if (var491 == 31) {
                        var5 -= 2;
                        if (class34.field750[var5] <= class34.field750[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var491 == 32) {
                        var5 -= 2;
                        if (class34.field750[var5] >= class34.field750[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var491 == 33) {
                        class34.field750[var5++] = field749[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var491 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        field749[var10001] = class34.field750[var5];
                        continue;
                    }
                    if (var491 == 35) {
                        class34.field747[var6++] = field753[var9[var7]];
                        continue;
                    }
                    if (var491 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        field753[var10001] = class34.field747[var6];
                        continue;
                    }
                    if (var491 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class154.method2118(class34.field747, var6, var22);
                        class34.field747[var6++] = var23;
                        continue;
                    }
                    if (var491 == 38) {
                        var5--;
                        continue;
                    }
                    if (var491 == 39) {
                        var6--;
                        continue;
                    }
                    if (var491 == 40) {
                        int var24 = var9[var7];
                        class20 var25 = class20.method2526(var24);
                        int[] var26 = new int[var25.field553];
                        String[] var27 = new String[var25.field569];
                        for (int var28 = 0; var28 < var25.field559; var28++) {
                            var26[var28] = class34.field750[var5 - var25.field559 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field560; var29++) {
                            var27[var29] = class34.field747[var6 - var25.field560 + var29];
                        }
                        var5 -= var25.field559;
                        var6 -= var25.field560;
                        class14 var30 = new class14();
                        var30.field201 = var4;
                        var30.field202 = var7;
                        var30.field200 = field749;
                        var30.field203 = field753;
                        class34.field756[++class34.field755 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field554;
                        var9 = var25.field555;
                        var7 = -1;
                        field749 = var26;
                        field753 = var27;
                        continue;
                    }
                    if (var491 == 42) {
                        class34.field750[var5++] = client.field522[var9[var7]];
                        continue;
                    }
                    if (var491 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field522[var10001] = class34.field750[var5];
                        continue;
                    }
                    if (var491 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = class34.field750[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            class34.field751[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label3113;
                                }
                                class34.field754[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var491 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = class34.field750[var5];
                        if (var37 >= 0 && var37 < class34.field751[var36]) {
                            class34.field750[var5++] = class34.field754[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var491 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = class34.field750[var5];
                        if (var39 >= 0 && var39 < class34.field751[var38]) {
                            class34.field754[var38][var39] = class34.field750[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var491 == 47) {
                        String var40 = client.field459[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        class34.field747[var6++] = var40;
                        continue;
                    }
                    if (var491 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field459[var10001] = class34.field747[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var491 < 1000) {
                    if (var491 == 100) {
                        var5 -= 3;
                        int var42 = class34.field750[var5];
                        int var43 = class34.field750[var5 + 1];
                        int var44 = class34.field750[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class164 var45 = class164.method6(var42);
                        if (var45.field2684 == null) {
                            var45.field2684 = new class164[var44 + 1];
                        }
                        if (var45.field2684.length <= var44) {
                            class164[] var46 = new class164[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2684.length; var47++) {
                                var46[var47] = var45.field2684[var47];
                            }
                            var45.field2684 = var46;
                        }
                        if (var44 > 0 && var45.field2684[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class164 var48 = new class164();
                        var48.field2654 = var43;
                        var48.field2725 = var48.field2652 = var45.field2652;
                        var48.field2653 = var44;
                        var48.field2651 = true;
                        var45.field2684[var44] = var48;
                        if (var41) {
                            field1321 = var48;
                        } else {
                            field757 = var48;
                        }
                        client.method2521(var45);
                        continue;
                    }
                    if (var491 == 101) {
                        class164 var49 = var41 ? field1321 : field757;
                        class164 var50 = class164.method6(var49.field2652);
                        var50.field2684[var49.field2653] = null;
                        client.method2521(var50);
                        continue;
                    }
                    if (var491 == 102) {
                        var5--;
                        class164 var51 = class164.method6(class34.field750[var5]);
                        var51.field2684 = null;
                        client.method2521(var51);
                        continue;
                    }
                    if (var491 == 200) {
                        var5 -= 2;
                        int var52 = class34.field750[var5];
                        int var53 = class34.field750[var5 + 1];
                        class164 var54 = class164.method131(var52, var53);
                        if (var54 != null && var53 != -1) {
                            class34.field750[var5++] = 1;
                            if (var41) {
                                field1321 = var54;
                            } else {
                                field757 = var54;
                            }
                            continue;
                        }
                        class34.field750[var5++] = 0;
                        continue;
                    }
                    if (var491 == 201) {
                        var5--;
                        class164 var55 = class164.method6(class34.field750[var5]);
                        if (var55 == null) {
                            class34.field750[var5++] = 0;
                        } else {
                            class34.field750[var5++] = 1;
                            if (var41) {
                                field1321 = var55;
                            } else {
                                field757 = var55;
                            }
                        }
                        continue;
                    }
                } else if (!(var491 < 1000 || var491 >= 1100) || !(var491 < 2000 || var491 >= 2100)) {
                    int var56 = -1;
                    class164 var57;
                    if (var491 >= 2000) {
                        var491 -= 1000;
                        var5--;
                        var56 = class34.field750[var5];
                        var57 = class164.method6(var56);
                    } else {
                        var57 = var41 ? field1321 : field757;
                    }
                    if (var491 == 1000) {
                        var5 -= 4;
                        var57.field2661 = class34.field750[var5];
                        var57.field2698 = class34.field750[var5 + 1];
                        var57.field2657 = class34.field750[var5 + 2];
                        var57.field2658 = class34.field750[var5 + 3];
                        client.method2521(var57);
                        client.method1097(var57);
                        if (var56 != -1 && var57.field2654 == 0) {
                            client.method124(field2642[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var491 == 1001) {
                        var5 -= 4;
                        var57.field2663 = class34.field750[var5];
                        var57.field2664 = class34.field750[var5 + 1];
                        var57.field2659 = class34.field750[var5 + 2];
                        var57.field2660 = class34.field750[var5 + 3];
                        client.method2521(var57);
                        client.method1097(var57);
                        if (var56 != -1 && var57.field2654 == 0) {
                            client.method124(field2642[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var491 == 1003) {
                        var5--;
                        boolean var58 = class34.field750[var5] == 1;
                        if (var57.field2672 != var58) {
                            var57.field2672 = var58;
                            client.method2521(var57);
                        }
                        continue;
                    }
                    if (var491 == 1005) {
                        var5--;
                        var57.field2783 = class34.field750[var5] == 1;
                        continue;
                    }
                } else if (!(var491 < 1100 || var491 >= 1200) || !(var491 < 2100 || var491 >= 2200)) {
                    int var59 = -1;
                    class164 var60;
                    if (var491 >= 2000) {
                        var491 -= 1000;
                        var5--;
                        var59 = class34.field750[var5];
                        var60 = class164.method6(var59);
                    } else {
                        var60 = var41 ? field1321 : field757;
                    }
                    if (var491 == 1100) {
                        var5 -= 2;
                        var60.field2711 = class34.field750[var5];
                        if (var60.field2711 > var60.field2678 - var60.field2667) {
                            var60.field2711 = var60.field2678 - var60.field2667;
                        }
                        if (var60.field2711 < 0) {
                            var60.field2711 = 0;
                        }
                        var60.field2674 = class34.field750[var5 + 1];
                        if (var60.field2674 > var60.field2779 - var60.field2668) {
                            var60.field2674 = var60.field2779 - var60.field2668;
                        }
                        if (var60.field2674 < 0) {
                            var60.field2674 = 0;
                        }
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1101) {
                        var5--;
                        var60.field2677 = class34.field750[var5];
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1102) {
                        var5--;
                        var60.field2681 = class34.field750[var5] == 1;
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1103) {
                        var5--;
                        var60.field2682 = class34.field750[var5];
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1104) {
                        var5--;
                        var60.field2784 = class34.field750[var5];
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1105) {
                        var5--;
                        var60.field2685 = class34.field750[var5];
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1106) {
                        var5--;
                        var60.field2708 = class34.field750[var5];
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1107) {
                        var5--;
                        var60.field2688 = class34.field750[var5] == 1;
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1108) {
                        var60.field2693 = 1;
                        var5--;
                        var60.field2694 = class34.field750[var5];
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1109) {
                        var5 -= 6;
                        var60.field2699 = class34.field750[var5];
                        var60.field2700 = class34.field750[var5 + 1];
                        var60.field2735 = class34.field750[var5 + 2];
                        var60.field2702 = class34.field750[var5 + 3];
                        var60.field2703 = class34.field750[var5 + 4];
                        var60.field2649 = class34.field750[var5 + 5];
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1110) {
                        var5--;
                        int var61 = class34.field750[var5];
                        if (var60.field2686 != var61) {
                            var60.field2686 = var61;
                            var60.field2717 = 0;
                            var60.field2773 = 0;
                            client.method2521(var60);
                        }
                        continue;
                    }
                    if (var491 == 1111) {
                        var5--;
                        var60.field2707 = class34.field750[var5] == 1;
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1112) {
                        var6--;
                        String var62 = class34.field747[var6];
                        if (!var62.equals(var60.field2710)) {
                            var60.field2710 = var62;
                            client.method2521(var60);
                        }
                        continue;
                    }
                    if (var491 == 1113) {
                        var5--;
                        var60.field2709 = class34.field750[var5];
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1114) {
                        var5 -= 3;
                        var60.field2768 = class34.field750[var5];
                        var60.field2714 = class34.field750[var5 + 1];
                        var60.field2712 = class34.field750[var5 + 2];
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1115) {
                        var5--;
                        var60.field2676 = class34.field750[var5] == 1;
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1116) {
                        var5--;
                        var60.field2748 = class34.field750[var5];
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1117) {
                        var5--;
                        var60.field2683 = class34.field750[var5];
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1118) {
                        var5--;
                        var60.field2691 = class34.field750[var5] == 1;
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1119) {
                        var5--;
                        var60.field2692 = class34.field750[var5] == 1;
                        client.method2521(var60);
                        continue;
                    }
                    if (var491 == 1120) {
                        var5 -= 2;
                        var60.field2678 = class34.field750[var5];
                        var60.field2779 = class34.field750[var5 + 1];
                        client.method2521(var60);
                        if (var59 != -1 && var60.field2654 == 0) {
                            client.method124(field2642[var59 >> 16], var60, false);
                        }
                        continue;
                    }
                    if (var491 == 1121) {
                        client.method2958(var60.field2652, var60.field2653);
                        client.field506 = var60;
                        client.method2521(var60);
                        continue;
                    }
                } else if (var491 >= 1200 && var491 < 1300 || var491 >= 2200 && var491 < 2300) {
                    class164 var63;
                    if (var491 >= 2000) {
                        var491 -= 1000;
                        var5--;
                        var63 = class164.method6(class34.field750[var5]);
                    } else {
                        var63 = var41 ? field1321 : field757;
                    }
                    client.method2521(var63);
                    if (var491 == 1200 || var491 == 1205 || var491 == 1212) {
                        var5 -= 2;
                        int var64 = class34.field750[var5];
                        int var65 = class34.field750[var5 + 1];
                        var63.field2770 = var64;
                        var63.field2761 = var65;
                        class47 var66 = class47.method2450(var64);
                        var63.field2735 = var66.field1062;
                        var63.field2702 = var66.field1063;
                        var63.field2703 = var66.field1057;
                        var63.field2699 = var66.field1049;
                        var63.field2700 = var66.field1066;
                        var63.field2649 = var66.field1061;
                        if (var491 == 1205) {
                            var63.field2771 = 0;
                        } else if (var491 == 1212 | var66.field1067 == 1) {
                            var63.field2771 = 1;
                        } else {
                            var63.field2771 = 2;
                        }
                        if (var63.field2705 > 0) {
                            var63.field2649 = var63.field2649 * 32 / var63.field2705;
                        } else if (var63.field2663 > 0) {
                            var63.field2649 = var63.field2649 * 32 / var63.field2663;
                        }
                        continue;
                    }
                    if (var491 == 1201) {
                        var63.field2693 = 2;
                        var5--;
                        var63.field2694 = class34.field750[var5];
                        continue;
                    }
                    if (var491 == 1202) {
                        var63.field2693 = 3;
                        var63.field2694 = field734.field44.method3137();
                        continue;
                    }
                } else if (var491 >= 1300 && var491 < 1400 || var491 >= 2300 && var491 < 2400) {
                    class164 var67;
                    if (var491 >= 2000) {
                        var491 -= 1000;
                        var5--;
                        var67 = class164.method6(class34.field750[var5]);
                    } else {
                        var67 = var41 ? field1321 : field757;
                    }
                    if (var491 == 1300) {
                        var5--;
                        int var68 = class34.field750[var5] - 1;
                        if (var68 >= 0 && var68 <= 9) {
                            var6--;
                            var67.method3043(var68, class34.field747[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var491 == 1301) {
                        var5 -= 2;
                        int var69 = class34.field750[var5];
                        int var70 = class34.field750[var5 + 1];
                        var67.field2697 = class164.method131(var69, var70);
                        continue;
                    }
                    if (var491 == 1302) {
                        var5--;
                        var67.field2656 = class34.field750[var5] == 1;
                        continue;
                    }
                    if (var491 == 1303) {
                        var5--;
                        var67.field2723 = class34.field750[var5];
                        continue;
                    }
                    if (var491 == 1304) {
                        var5--;
                        var67.field2727 = class34.field750[var5];
                        continue;
                    }
                    if (var491 == 1305) {
                        var6--;
                        var67.field2758 = class34.field747[var6];
                        continue;
                    }
                    if (var491 == 1306) {
                        var6--;
                        var67.field2733 = class34.field747[var6];
                        continue;
                    }
                    if (var491 == 1307) {
                        var67.field2724 = null;
                        continue;
                    }
                } else {
                    if (var491 >= 1400 && var491 < 1500 || var491 >= 2400 && var491 < 2500) {
                        class164 var71;
                        if (var491 >= 2000) {
                            var491 -= 1000;
                            var5--;
                            var71 = class164.method6(class34.field750[var5]);
                        } else {
                            var71 = var41 ? field1321 : field757;
                        }
                        var6--;
                        String var72 = class34.field747[var6];
                        int[] var73 = null;
                        if (var72.length() > 0 && var72.charAt(var72.length() - 1) == 'Y') {
                            var5--;
                            int var74 = class34.field750[var5];
                            if (var74 > 0) {
                                var73 = new int[var74];
                                while (var74-- > 0) {
                                    var5--;
                                    var73[var74] = class34.field750[var5];
                                }
                            }
                            var72 = var72.substring(0, var72.length() - 1);
                        }
                        Object[] var75 = new Object[var72.length() + 1];
                        for (int var76 = var75.length - 1; var76 >= 1; var76--) {
                            if (var72.charAt(var76 - 1) == 's') {
                                var6--;
                                var75[var76] = class34.field747[var6];
                            } else {
                                var5--;
                                var75[var76] = Integer.valueOf(class34.field750[var5]);
                            }
                        }
                        var5--;
                        int var77 = class34.field750[var5];
                        if (var77 == -1) {
                            var75 = null;
                        } else {
                            var75[0] = Integer.valueOf(var77);
                        }
                        if (var491 == 1400) {
                            var71.field2732 = var75;
                        }
                        if (var491 == 1401) {
                            var71.field2756 = var75;
                        }
                        if (var491 == 1402) {
                            var71.field2734 = var75;
                        }
                        if (var491 == 1403) {
                            var71.field2736 = var75;
                        }
                        if (var491 == 1404) {
                            var71.field2738 = var75;
                        }
                        if (var491 == 1405) {
                            var71.field2739 = var75;
                        }
                        if (var491 == 1406) {
                            var71.field2742 = var75;
                        }
                        if (var491 == 1407) {
                            var71.field2743 = var75;
                            var71.field2729 = var73;
                        }
                        if (var491 == 1408) {
                            var71.field2749 = var75;
                        }
                        if (var491 == 1409) {
                            var71.field2750 = var75;
                        }
                        if (var491 == 1410) {
                            var71.field2740 = var75;
                        }
                        if (var491 == 1411) {
                            var71.field2778 = var75;
                        }
                        if (var491 == 1412) {
                            var71.field2737 = var75;
                        }
                        if (var491 == 1414) {
                            var71.field2745 = var75;
                            var71.field2746 = var73;
                        }
                        if (var491 == 1415) {
                            var71.field2747 = var75;
                            var71.field2753 = var73;
                        }
                        if (var491 == 1416) {
                            var71.field2780 = var75;
                        }
                        if (var491 == 1417) {
                            var71.field2751 = var75;
                        }
                        if (var491 == 1418) {
                            var71.field2722 = var75;
                        }
                        if (var491 == 1419) {
                            var71.field2646 = var75;
                        }
                        if (var491 == 1420) {
                            var71.field2690 = var75;
                        }
                        if (var491 == 1421) {
                            var71.field2755 = var75;
                        }
                        if (var491 == 1422) {
                            var71.field2715 = var75;
                        }
                        if (var491 == 1423) {
                            var71.field2757 = var75;
                        }
                        if (var491 == 1424) {
                            var71.field2673 = var75;
                        }
                        if (var491 == 1425) {
                            var71.field2760 = var75;
                        }
                        if (var491 == 1426) {
                            var71.field2744 = var75;
                        }
                        if (var491 == 1427) {
                            var71.field2759 = var75;
                        }
                        var71.field2730 = true;
                        continue;
                    }
                    if (var491 < 1600) {
                        class164 var78 = var41 ? field1321 : field757;
                        if (var491 == 1500) {
                            class34.field750[var5++] = var78.field2665;
                            continue;
                        }
                        if (var491 == 1501) {
                            class34.field750[var5++] = var78.field2666;
                            continue;
                        }
                        if (var491 == 1502) {
                            class34.field750[var5++] = var78.field2667;
                            continue;
                        }
                        if (var491 == 1503) {
                            class34.field750[var5++] = var78.field2668;
                            continue;
                        }
                        if (var491 == 1504) {
                            class34.field750[var5++] = var78.field2672 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 1505) {
                            class34.field750[var5++] = var78.field2725;
                            continue;
                        }
                    } else if (var491 < 1700) {
                        class164 var79 = var41 ? field1321 : field757;
                        if (var491 == 1600) {
                            class34.field750[var5++] = var79.field2711;
                            continue;
                        }
                        if (var491 == 1601) {
                            class34.field750[var5++] = var79.field2674;
                            continue;
                        }
                        if (var491 == 1602) {
                            class34.field747[var6++] = var79.field2710;
                            continue;
                        }
                        if (var491 == 1603) {
                            class34.field750[var5++] = var79.field2678;
                            continue;
                        }
                        if (var491 == 1604) {
                            class34.field750[var5++] = var79.field2779;
                            continue;
                        }
                        if (var491 == 1605) {
                            class34.field750[var5++] = var79.field2649;
                            continue;
                        }
                        if (var491 == 1606) {
                            class34.field750[var5++] = var79.field2735;
                            continue;
                        }
                        if (var491 == 1607) {
                            class34.field750[var5++] = var79.field2703;
                            continue;
                        }
                        if (var491 == 1608) {
                            class34.field750[var5++] = var79.field2702;
                            continue;
                        }
                        if (var491 == 1609) {
                            class34.field750[var5++] = var79.field2682;
                            continue;
                        }
                    } else if (var491 < 1800) {
                        class164 var80 = var41 ? field1321 : field757;
                        if (var491 == 1700) {
                            class34.field750[var5++] = var80.field2770;
                            continue;
                        }
                        if (var491 == 1701) {
                            if (var80.field2770 == -1) {
                                class34.field750[var5++] = 0;
                            } else {
                                class34.field750[var5++] = var80.field2761;
                            }
                            continue;
                        }
                        if (var491 == 1702) {
                            class34.field750[var5++] = var80.field2653;
                            continue;
                        }
                    } else if (var491 < 1900) {
                        class164 var81 = var41 ? field1321 : field757;
                        if (var491 == 1800) {
                            class34.field750[var5++] = class169.method2784(client.method84(var81));
                            continue;
                        }
                        if (var491 == 1801) {
                            var5--;
                            int var82 = class34.field750[var5];
                            int var492 = var82 - 1;
                            if (var81.field2724 != null && var492 < var81.field2724.length && var81.field2724[var492] != null) {
                                class34.field747[var6++] = var81.field2724[var492];
                                continue;
                            }
                            class34.field747[var6++] = "";
                            continue;
                        }
                        if (var491 == 1802) {
                            if (var81.field2758 == null) {
                                class34.field747[var6++] = "";
                            } else {
                                class34.field747[var6++] = var81.field2758;
                            }
                            continue;
                        }
                    } else if (!(var491 < 1900 || var491 >= 2000) || !(var491 < 2900 || var491 >= 3000)) {
                        class164 var83;
                        if (var491 >= 2000) {
                            var491 -= 1000;
                            var5--;
                            var83 = class164.method6(class34.field750[var5]);
                        } else {
                            var83 = var41 ? field1321 : field757;
                        }
                        if (var491 == 1927) {
                            if (class34.field752 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var83.field2759 == null) {
                                return;
                            }
                            class1 var84 = new class1();
                            var84.field3 = var83;
                            var84.field8 = var83.field2759;
                            var84.field11 = class34.field752 + 1;
                            client.field455.method3437(arg0);
                            continue;
                        }
                    } else if (var491 < 2600) {
                        var5--;
                        class164 var85 = class164.method6(class34.field750[var5]);
                        if (var491 == 2500) {
                            class34.field750[var5++] = var85.field2665;
                            continue;
                        }
                        if (var491 == 2501) {
                            class34.field750[var5++] = var85.field2666;
                            continue;
                        }
                        if (var491 == 2502) {
                            class34.field750[var5++] = var85.field2667;
                            continue;
                        }
                        if (var491 == 2503) {
                            class34.field750[var5++] = var85.field2668;
                            continue;
                        }
                        if (var491 == 2504) {
                            class34.field750[var5++] = var85.field2672 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 2505) {
                            class34.field750[var5++] = var85.field2725;
                            continue;
                        }
                    } else if (var491 < 2700) {
                        var5--;
                        class164 var86 = class164.method6(class34.field750[var5]);
                        if (var491 == 2600) {
                            class34.field750[var5++] = var86.field2711;
                            continue;
                        }
                        if (var491 == 2601) {
                            class34.field750[var5++] = var86.field2674;
                            continue;
                        }
                        if (var491 == 2602) {
                            class34.field747[var6++] = var86.field2710;
                            continue;
                        }
                        if (var491 == 2603) {
                            class34.field750[var5++] = var86.field2678;
                            continue;
                        }
                        if (var491 == 2604) {
                            class34.field750[var5++] = var86.field2779;
                            continue;
                        }
                        if (var491 == 2605) {
                            class34.field750[var5++] = var86.field2649;
                            continue;
                        }
                        if (var491 == 2606) {
                            class34.field750[var5++] = var86.field2735;
                            continue;
                        }
                        if (var491 == 2607) {
                            class34.field750[var5++] = var86.field2703;
                            continue;
                        }
                        if (var491 == 2608) {
                            class34.field750[var5++] = var86.field2702;
                            continue;
                        }
                        if (var491 == 2609) {
                            class34.field750[var5++] = var86.field2682;
                            continue;
                        }
                    } else if (var491 < 2800) {
                        if (var491 == 2700) {
                            var5--;
                            class164 var87 = class164.method6(class34.field750[var5]);
                            class34.field750[var5++] = var87.field2770;
                            continue;
                        }
                        if (var491 == 2701) {
                            var5--;
                            class164 var88 = class164.method6(class34.field750[var5]);
                            if (var88.field2770 == -1) {
                                class34.field750[var5++] = 0;
                            } else {
                                class34.field750[var5++] = var88.field2761;
                            }
                            continue;
                        }
                        if (var491 == 2702) {
                            var5--;
                            int var89 = class34.field750[var5];
                            class4 var90 = (class4) client.field421.method3405((long) var89);
                            if (var90 == null) {
                                class34.field750[var5++] = 0;
                            } else {
                                class34.field750[var5++] = 1;
                            }
                            continue;
                        }
                        if (var491 == 2706) {
                            class34.field750[var5++] = client.field420;
                            continue;
                        }
                    } else if (var491 < 2900) {
                        var5--;
                        class164 var91 = class164.method6(class34.field750[var5]);
                        if (var491 == 2800) {
                            class34.field750[var5++] = class169.method2784(client.method84(var91));
                            continue;
                        }
                        if (var491 == 2801) {
                            var5--;
                            int var92 = class34.field750[var5];
                            int var493 = var92 - 1;
                            if (var91.field2724 != null && var493 < var91.field2724.length && var91.field2724[var493] != null) {
                                class34.field747[var6++] = var91.field2724[var493];
                                continue;
                            }
                            class34.field747[var6++] = "";
                            continue;
                        }
                        if (var491 == 2802) {
                            if (var91.field2758 == null) {
                                class34.field747[var6++] = "";
                            } else {
                                class34.field747[var6++] = var91.field2758;
                            }
                            continue;
                        }
                    } else if (var491 < 3200) {
                        if (var491 == 3100) {
                            var6--;
                            String var93 = class34.field747[var6];
                            class11.method3366(0, "", var93);
                            continue;
                        }
                        if (var491 == 3101) {
                            var5 -= 2;
                            client.method2016(field734, class34.field750[var5], class34.field750[var5 + 1]);
                            continue;
                        }
                        if (var491 == 3103) {
                            client.field452.method2426(120);
                            for (class4 var94 = (class4) client.field421.method3412(); var94 != null; var94 = (class4) client.field421.method3410()) {
                                if (var94.field54 == 0 || var94.field54 == 3) {
                                    client.method2415(var94, true);
                                }
                            }
                            if (client.field506 != null) {
                                client.method2521(client.field506);
                                client.field506 = null;
                            }
                            continue;
                        }
                        if (var491 == 3104) {
                            var6--;
                            String var95 = class34.field747[var6];
                            int var96 = 0;
                            if (class154.method14(var95)) {
                                int var97 = class154.method3025(var95, 10, true);
                                var96 = var97;
                            }
                            client.field452.method2426(221);
                            client.field452.method2161(var96);
                            continue;
                        }
                        if (var491 == 3105) {
                            var6--;
                            String var98 = class34.field747[var6];
                            client.field452.method2426(218);
                            client.field452.method2160(var98.length() + 1);
                            client.field452.method2186(var98);
                            continue;
                        }
                        if (var491 == 3106) {
                            var6--;
                            String var99 = class34.field747[var6];
                            client.field452.method2426(189);
                            client.field452.method2160(var99.length() + 1);
                            client.field452.method2186(var99);
                            continue;
                        }
                        if (var491 == 3107) {
                            var5--;
                            int var100 = class34.field750[var5];
                            var6--;
                            String var101 = class34.field747[var6];
                            boolean var102 = false;
                            for (int var103 = 0; var103 < client.field289; var103++) {
                                class3 var104 = client.field479[client.field286[var103]];
                                if (var104 != null && var104.field39 != null && var104.field39.equalsIgnoreCase(var101)) {
                                    if (var100 == 1) {
                                        client.field452.method2426(97);
                                        client.field452.method2206(client.field286[var103]);
                                        client.field452.method2160(0);
                                    } else if (var100 == 4) {
                                        client.field452.method2426(11);
                                        client.field452.method2206(client.field286[var103]);
                                        client.field452.method2245(0);
                                    } else if (var100 == 6) {
                                        client.field452.method2426(43);
                                        client.field452.method2178(0);
                                        client.field452.method2206(client.field286[var103]);
                                    } else if (var100 == 7) {
                                        client.field452.method2426(27);
                                        client.field452.method2178(0);
                                        client.field452.method2365(client.field286[var103]);
                                    }
                                    var102 = true;
                                    break;
                                }
                            }
                            if (!var102) {
                                class11.method3366(4, "", class148.field2362 + var101);
                            }
                            continue;
                        }
                        if (var491 == 3108) {
                            var5 -= 3;
                            int var105 = class34.field750[var5];
                            int var106 = class34.field750[var5 + 1];
                            int var107 = class34.field750[var5 + 2];
                            class164 var108 = class164.method6(var107);
                            client.method1408(var108, var105, var106);
                            continue;
                        }
                        if (var491 == 3109) {
                            var5 -= 2;
                            int var109 = class34.field750[var5];
                            int var110 = class34.field750[var5 + 1];
                            class164 var111 = var41 ? field1321 : field757;
                            client.method1408(var111, var109, var110);
                            continue;
                        }
                        if (var491 == 3110) {
                            var5--;
                            field2048 = class34.field750[var5] == 1;
                            continue;
                        }
                        if (var491 == 3111) {
                            class34.field750[var5++] = field71.field134 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3112) {
                            var5--;
                            field71.field134 = class34.field750[var5] == 1;
                            class9.method2816();
                            continue;
                        }
                        if (var491 == 3113) {
                            var6--;
                            String var112 = class34.field747[var6];
                            var5--;
                            boolean var113 = class34.field750[var5] == 1;
                            class130.method841(var112, var113, false);
                            continue;
                        }
                        if (var491 == 3115) {
                            var5--;
                            int var114 = class34.field750[var5];
                            client.field452.method2426(240);
                            client.field452.method2365(var114);
                            continue;
                        }
                    } else if (var491 < 3300) {
                        if (var491 == 3200) {
                            var5 -= 3;
                            client.method75(class34.field750[var5], class34.field750[var5 + 1], class34.field750[var5 + 2]);
                            continue;
                        }
                        if (var491 == 3201) {
                            var5--;
                            method152(class34.field750[var5]);
                            continue;
                        }
                        if (var491 == 3202) {
                            var5 -= 2;
                            int var115 = class34.field750[var5];
                            int var10000 = class34.field750[var5 + 1];
                            if (client.field499 != 0 && var115 != -1) {
                                class174.method562(field1938, var115, 0, client.field499, false);
                                client.field501 = true;
                            }
                            continue;
                        }
                    } else if (var491 < 3400) {
                        if (var491 == 3300) {
                            class34.field750[var5++] = client.field267;
                            continue;
                        }
                        if (var491 == 3301) {
                            var5 -= 2;
                            int var117 = class34.field750[var5];
                            int var118 = class34.field750[var5 + 1];
                            class34.field750[var5++] = class15.method142(var117, var118);
                            continue;
                        }
                        if (var491 == 3302) {
                            var5 -= 2;
                            int var119 = class34.field750[var5];
                            int var120 = class34.field750[var5 + 1];
                            int[] var121 = class34.field750;
                            int var122 = var5++;
                            class15 var123 = (class15) class15.field213.method3405((long) var119);
                            int var124;
                            if (var123 == null) {
                                var124 = 0;
                            } else if (var120 >= 0 && var120 < var123.field208.length) {
                                var124 = var123.field208[var120];
                            } else {
                                var124 = 0;
                            }
                            var121[var122] = var124;
                            continue;
                        }
                        if (var491 == 3303) {
                            var5 -= 2;
                            int var125 = class34.field750[var5];
                            int var126 = class34.field750[var5 + 1];
                            class34.field750[var5++] = class15.method2412(var125, var126);
                            continue;
                        }
                        if (var491 == 3304) {
                            var5--;
                            int var127 = class34.field750[var5];
                            int[] var128 = class34.field750;
                            int var129 = var5++;
                            class46 var130 = (class46) class46.field1036.method3371((long) var127);
                            class46 var131;
                            if (var130 == null) {
                                byte[] var132 = field1039.method2896(5, var127);
                                class46 var133 = new class46();
                                if (var132 != null) {
                                    var133.method872(new class111(var132));
                                }
                                class46.field1036.method3370(var133, (long) var127);
                                var131 = var133;
                            } else {
                                var131 = var130;
                            }
                            var128[var129] = var131.field1037;
                            continue;
                        }
                        if (var491 == 3305) {
                            var5--;
                            int var134 = class34.field750[var5];
                            class34.field750[var5++] = client.field397[var134];
                            continue;
                        }
                        if (var491 == 3306) {
                            var5--;
                            int var135 = class34.field750[var5];
                            class34.field750[var5++] = client.field398[var135];
                            continue;
                        }
                        if (var491 == 3307) {
                            var5--;
                            int var136 = class34.field750[var5];
                            class34.field750[var5++] = client.field379[var136];
                            continue;
                        }
                        if (var491 == 3308) {
                            int var137 = field1818;
                            int var138 = (field734.field773 >> 7) + field193;
                            int var139 = (field734.field775 >> 7) + field948;
                            class34.field750[var5++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var491 == 3309) {
                            var5--;
                            int var140 = class34.field750[var5];
                            class34.field750[var5++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var491 == 3310) {
                            var5--;
                            int var141 = class34.field750[var5];
                            class34.field750[var5++] = var141 >> 28;
                            continue;
                        }
                        if (var491 == 3311) {
                            var5--;
                            int var142 = class34.field750[var5];
                            class34.field750[var5++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var491 == 3312) {
                            class34.field750[var5++] = client.field262 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3313) {
                            var5 -= 2;
                            int var143 = class34.field750[var5] + 32768;
                            int var144 = class34.field750[var5 + 1];
                            class34.field750[var5++] = class15.method142(var143, var144);
                            continue;
                        }
                        if (var491 == 3314) {
                            var5 -= 2;
                            int var145 = class34.field750[var5] + 32768;
                            int var146 = class34.field750[var5 + 1];
                            int[] var147 = class34.field750;
                            int var148 = var5++;
                            class15 var149 = (class15) class15.field213.method3405((long) var145);
                            int var150;
                            if (var149 == null) {
                                var150 = 0;
                            } else if (var146 >= 0 && var146 < var149.field208.length) {
                                var150 = var149.field208[var146];
                            } else {
                                var150 = 0;
                            }
                            var147[var148] = var150;
                            continue;
                        }
                        if (var491 == 3315) {
                            var5 -= 2;
                            int var151 = class34.field750[var5] + 32768;
                            int var152 = class34.field750[var5 + 1];
                            class34.field750[var5++] = class15.method2412(var151, var152);
                            continue;
                        }
                        if (var491 == 3316) {
                            if (client.field427 >= 2) {
                                class34.field750[var5++] = client.field427;
                            } else {
                                class34.field750[var5++] = 0;
                            }
                            continue;
                        }
                        if (var491 == 3317) {
                            class34.field750[var5++] = client.field274;
                            continue;
                        }
                        if (var491 == 3318) {
                            class34.field750[var5++] = client.field256;
                            continue;
                        }
                        if (var491 == 3321) {
                            class34.field750[var5++] = client.field425;
                            continue;
                        }
                        if (var491 == 3322) {
                            class34.field750[var5++] = client.field426;
                            continue;
                        }
                        if (var491 == 3323) {
                            if (client.field257) {
                                class34.field750[var5++] = 1;
                            } else {
                                class34.field750[var5++] = 0;
                            }
                            continue;
                        }
                        if (var491 == 3324) {
                            class34.field750[var5++] = client.field338;
                            continue;
                        }
                    } else if (var491 < 3500) {
                        if (var491 == 3400) {
                            var5 -= 2;
                            int var153 = class34.field750[var5];
                            int var154 = class34.field750[var5 + 1];
                            class45 var155 = class45.method3031(var153);
                            if (var155.field1025 != 's') {
                            }
                            for (int var156 = 0; var156 < var155.field1029; var156++) {
                                if (var155.field1028[var156] == var154) {
                                    class34.field747[var6++] = var155.field1031[var156];
                                    var155 = null;
                                    break;
                                }
                            }
                            if (var155 != null) {
                                class34.field747[var6++] = var155.field1033;
                            }
                            continue;
                        }
                        if (var491 == 3408) {
                            var5 -= 4;
                            int var157 = class34.field750[var5];
                            int var158 = class34.field750[var5 + 1];
                            int var159 = class34.field750[var5 + 2];
                            int var160 = class34.field750[var5 + 3];
                            class45 var161 = class45.method3031(var159);
                            if (var161.field1024 == var157 && var161.field1025 == var158) {
                                for (int var162 = 0; var162 < var161.field1029; var162++) {
                                    if (var161.field1028[var162] == var160) {
                                        if (var158 == 115) {
                                            class34.field747[var6++] = var161.field1031[var162];
                                        } else {
                                            class34.field750[var5++] = var161.field1030[var162];
                                        }
                                        var161 = null;
                                        break;
                                    }
                                }
                                if (var161 != null) {
                                    if (var158 == 115) {
                                        class34.field747[var6++] = var161.field1033;
                                    } else {
                                        class34.field750[var5++] = var161.field1026;
                                    }
                                }
                                continue;
                            }
                            if (var158 == 115) {
                                class34.field747[var6++] = "null";
                            } else {
                                class34.field750[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var491 < 3700) {
                        if (var491 == 3600) {
                            if (client.field530 == 0) {
                                class34.field750[var5++] = -2;
                            } else if (client.field530 == 1) {
                                class34.field750[var5++] = -1;
                            } else {
                                class34.field750[var5++] = client.field446;
                            }
                            continue;
                        }
                        if (var491 == 3601) {
                            var5--;
                            int var163 = class34.field750[var5];
                            if (client.field530 == 2 && var163 < client.field446) {
                                class34.field747[var6++] = client.field393[var163].field238;
                                class34.field747[var6++] = client.field393[var163].field237;
                                continue;
                            }
                            class34.field747[var6++] = "";
                            class34.field747[var6++] = "";
                            continue;
                        }
                        if (var491 == 3602) {
                            var5--;
                            int var164 = class34.field750[var5];
                            if (client.field530 == 2 && var164 < client.field446) {
                                class34.field750[var5++] = client.field393[var164].field236;
                                continue;
                            }
                            class34.field750[var5++] = 0;
                            continue;
                        }
                        if (var491 == 3603) {
                            var5--;
                            int var165 = class34.field750[var5];
                            if (client.field530 == 2 && var165 < client.field446) {
                                class34.field750[var5++] = client.field393[var165].field235;
                                continue;
                            }
                            class34.field750[var5++] = 0;
                            continue;
                        }
                        if (var491 == 3604) {
                            var6--;
                            String var166 = class34.field747[var6];
                            var5--;
                            int var167 = class34.field750[var5];
                            client.method1620(var166, var167);
                            continue;
                        }
                        if (var491 == 3605) {
                            var6--;
                            String var168 = class34.field747[var6];
                            client.method2867(var168);
                            continue;
                        }
                        if (var491 == 3606) {
                            var6--;
                            String var169 = class34.field747[var6];
                            if (var169 == null) {
                                continue;
                            }
                            String var170 = class155.method65(var169, field261);
                            if (var170 == null) {
                                continue;
                            }
                            int var171 = 0;
                            while (true) {
                                if (var171 >= client.field446) {
                                    continue label3113;
                                }
                                class17 var172 = client.field393[var171];
                                String var173 = var172.field238;
                                String var174 = class155.method65(var173, field261);
                                boolean var175;
                                if (var169 == null || var173 == null) {
                                    var175 = false;
                                } else if (var169.startsWith("#") || var173.startsWith("#")) {
                                    var175 = var169.equals(var173);
                                } else {
                                    var175 = var170.equals(var174);
                                }
                                if (var175) {
                                    client.field446--;
                                    for (int var176 = var171; var176 < client.field446; var176++) {
                                        client.field393[var176] = client.field393[var176 + 1];
                                    }
                                    client.field320 = client.field538;
                                    client.field452.method2426(168);
                                    client.field452.method2160(class111.method1406(var169));
                                    client.field452.method2186(var169);
                                    continue label3113;
                                }
                                var171++;
                            }
                        }
                        if (var491 == 3607) {
                            var6--;
                            String var177 = class34.field747[var6];
                            if (var177 == null) {
                                continue;
                            }
                            if ((client.field401 < 100 || client.field385 == 1) && client.field401 < 400) {
                                String var178 = class155.method65(var177, field261);
                                if (var178 == null) {
                                    continue;
                                }
                                for (int var179 = 0; var179 < client.field401; var179++) {
                                    class8 var180 = client.field534[var179];
                                    String var181 = class155.method65(var180.field125, field261);
                                    if (var181 != null && var181.equals(var178)) {
                                        class11.method3366(31, "", var177 + class148.field2482);
                                        continue label3113;
                                    }
                                    if (var180.field124 != null) {
                                        String var182 = class155.method65(var180.field124, field261);
                                        if (var182 != null && var182.equals(var178)) {
                                            class11.method3366(31, "", var177 + class148.field2482);
                                            continue label3113;
                                        }
                                    }
                                }
                                for (int var183 = 0; var183 < client.field446; var183++) {
                                    class17 var184 = client.field393[var183];
                                    String var185 = class155.method65(var184.field238, field261);
                                    if (var185 != null && var185.equals(var178)) {
                                        class11.method3366(31, "", class148.field2349 + var177 + class148.field2388);
                                        continue label3113;
                                    }
                                    if (var184.field237 != null) {
                                        String var186 = class155.method65(var184.field237, field261);
                                        if (var186 != null && var186.equals(var178)) {
                                            class11.method3366(31, "", class148.field2349 + var177 + class148.field2388);
                                            continue label3113;
                                        }
                                    }
                                }
                                if (class155.method65(field734.field39, field261).equals(var178)) {
                                    class11.method3366(31, "", class148.field2454);
                                } else {
                                    client.field452.method2426(24);
                                    client.field452.method2160(class111.method1406(var177));
                                    client.field452.method2186(var177);
                                }
                                continue;
                            }
                            class11.method3366(31, "", class148.field2381);
                            continue;
                        }
                        if (var491 == 3608) {
                            var6--;
                            String var187 = class34.field747[var6];
                            if (var187 == null) {
                                continue;
                            }
                            String var188 = class155.method65(var187, field261);
                            if (var188 == null) {
                                continue;
                            }
                            int var189 = 0;
                            while (true) {
                                if (var189 >= client.field401) {
                                    continue label3113;
                                }
                                class8 var190 = client.field534[var189];
                                String var191 = var190.field125;
                                String var192 = class155.method65(var191, field261);
                                boolean var193;
                                if (var187 == null || var191 == null) {
                                    var193 = false;
                                } else if (var187.startsWith("#") || var191.startsWith("#")) {
                                    var193 = var187.equals(var191);
                                } else {
                                    var193 = var188.equals(var192);
                                }
                                if (var193) {
                                    client.field401--;
                                    for (int var194 = var189; var194 < client.field401; var194++) {
                                        client.field534[var194] = client.field534[var194 + 1];
                                    }
                                    client.field320 = client.field538;
                                    client.field452.method2426(31);
                                    client.field452.method2160(class111.method1406(var187));
                                    client.field452.method2186(var187);
                                    continue label3113;
                                }
                                var189++;
                            }
                        }
                        if (var491 == 3609) {
                            var6--;
                            String var195 = class34.field747[var6];
                            class143[] var196 = class143.method487();
                            for (int var197 = 0; var197 < var196.length; var197++) {
                                class143 var198 = var196[var197];
                                if (var198.field2166 != -1) {
                                    int var200 = var198.field2166;
                                    String var201 = "<img=" + var200 + ">";
                                    if (var195.startsWith(var201)) {
                                        var195 = var195.substring(6 + Integer.toString(var198.field2166).length());
                                        break;
                                    }
                                }
                            }
                            class34.field750[var5++] = method849(var195, false) ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3611) {
                            if (client.field489 == null) {
                                class34.field747[var6++] = "";
                                continue;
                            }
                            String[] var202 = class34.field747;
                            int var203 = var6++;
                            String var204 = client.field489;
                            long var205 = 0L;
                            int var207 = var204.length();
                            for (int var208 = 0; var208 < var207; var208++) {
                                var205 *= 37L;
                                char var209 = var204.charAt(var208);
                                if (var209 >= 'A' && var209 <= 'Z') {
                                    var205 += (long) (var209 + 1 - 65);
                                } else if (var209 >= 'a' && var209 <= 'z') {
                                    var205 += (long) (var209 + 1 - 97);
                                } else if (var209 >= '0' && var209 <= '9') {
                                    var205 += (long) (var209 + 27 - 48);
                                }
                                if (var205 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var205 % 37L == 0L && var205 != 0L) {
                                var205 /= 37L;
                            }
                            String var212 = class153.method85(var205);
                            if (var212 == null) {
                                var212 = "";
                            }
                            var202[var203] = var212;
                            continue;
                        }
                        if (var491 == 3612) {
                            if (client.field489 == null) {
                                class34.field750[var5++] = 0;
                            } else {
                                class34.field750[var5++] = field56;
                            }
                            continue;
                        }
                        if (var491 == 3613) {
                            var5--;
                            int var214 = class34.field750[var5];
                            if (client.field489 != null && var214 < field56) {
                                class34.field747[var6++] = field1324[var214].field605;
                                continue;
                            }
                            class34.field747[var6++] = "";
                            continue;
                        }
                        if (var491 == 3614) {
                            var5--;
                            int var215 = class34.field750[var5];
                            if (client.field489 != null && var215 < field56) {
                                class34.field750[var5++] = field1324[var215].field602;
                                continue;
                            }
                            class34.field750[var5++] = 0;
                            continue;
                        }
                        if (var491 == 3615) {
                            var5--;
                            int var216 = class34.field750[var5];
                            if (client.field489 != null && var216 < field56) {
                                class34.field750[var5++] = field1324[var216].field603;
                                continue;
                            }
                            class34.field750[var5++] = 0;
                            continue;
                        }
                        if (var491 == 3616) {
                            class34.field750[var5++] = field139;
                            continue;
                        }
                        if (var491 == 3617) {
                            var6--;
                            String var217 = class34.field747[var6];
                            if (field1324 != null) {
                                client.field452.method2426(131);
                                client.field452.method2160(class111.method1406(var217));
                                client.field452.method2186(var217);
                            }
                            continue;
                        }
                        if (var491 == 3618) {
                            class34.field750[var5++] = field199;
                            continue;
                        }
                        if (var491 == 3619) {
                            var6--;
                            String var218 = class34.field747[var6];
                            client.method1796(var218);
                            continue;
                        }
                        if (var491 == 3620) {
                            client.field452.method2426(187);
                            client.field452.method2160(0);
                            continue;
                        }
                        if (var491 == 3621) {
                            if (client.field530 == 0) {
                                class34.field750[var5++] = -1;
                            } else {
                                class34.field750[var5++] = client.field401;
                            }
                            continue;
                        }
                        if (var491 == 3622) {
                            var5--;
                            int var219 = class34.field750[var5];
                            if (client.field530 != 0 && var219 < client.field401) {
                                class34.field747[var6++] = client.field534[var219].field125;
                                class34.field747[var6++] = client.field534[var219].field124;
                                continue;
                            }
                            class34.field747[var6++] = "";
                            class34.field747[var6++] = "";
                            continue;
                        }
                        if (var491 == 3623) {
                            String var220;
                            label2800: {
                                var6--;
                                var220 = class34.field747[var6];
                                String var222 = "<img=0>";
                                if (!var220.startsWith(var222)) {
                                    String var224 = "<img=1>";
                                    if (!var220.startsWith(var224)) {
                                        break label2800;
                                    }
                                }
                                var220 = var220.substring(7);
                            }
                            class34.field750[var5++] = client.method101(var220) ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3624) {
                            var5--;
                            int var225 = class34.field750[var5];
                            if (field1324 != null && var225 < field56 && field1324[var225].field605.equalsIgnoreCase(field734.field39)) {
                                class34.field750[var5++] = 1;
                                continue;
                            }
                            class34.field750[var5++] = 0;
                            continue;
                        }
                        if (var491 == 3625) {
                            if (client.field490 == null) {
                                class34.field747[var6++] = "";
                                continue;
                            }
                            String[] var226 = class34.field747;
                            int var227 = var6++;
                            String var228 = client.field490;
                            long var229 = 0L;
                            int var231 = var228.length();
                            for (int var232 = 0; var232 < var231; var232++) {
                                var229 *= 37L;
                                char var233 = var228.charAt(var232);
                                if (var233 >= 'A' && var233 <= 'Z') {
                                    var229 += (long) (var233 + 1 - 65);
                                } else if (var233 >= 'a' && var233 <= 'z') {
                                    var229 += (long) (var233 + 1 - 97);
                                } else if (var233 >= '0' && var233 <= '9') {
                                    var229 += (long) (var233 + 27 - 48);
                                }
                                if (var229 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var229 % 37L == 0L && var229 != 0L) {
                                var229 /= 37L;
                            }
                            String var236 = class153.method85(var229);
                            if (var236 == null) {
                                var236 = "";
                            }
                            var226[var227] = var236;
                            continue;
                        }
                    } else if (var491 < 4000) {
                        if (var491 == 3903) {
                            var5--;
                            int var238 = class34.field750[var5];
                            class34.field750[var5++] = client.field322[var238].method3610();
                            continue;
                        }
                        if (var491 == 3904) {
                            var5--;
                            int var239 = class34.field750[var5];
                            class34.field750[var5++] = client.field322[var239].field3072;
                            continue;
                        }
                        if (var491 == 3905) {
                            var5--;
                            int var240 = class34.field750[var5];
                            class34.field750[var5++] = client.field322[var240].field3071;
                            continue;
                        }
                        if (var491 == 3906) {
                            var5--;
                            int var241 = class34.field750[var5];
                            class34.field750[var5++] = client.field322[var241].field3073;
                            continue;
                        }
                        if (var491 == 3907) {
                            var5--;
                            int var242 = class34.field750[var5];
                            class34.field750[var5++] = client.field322[var242].field3075;
                            continue;
                        }
                        if (var491 == 3908) {
                            var5--;
                            int var243 = class34.field750[var5];
                            class34.field750[var5++] = client.field322[var243].field3076;
                            continue;
                        }
                        if (var491 == 3910) {
                            var5--;
                            int var244 = class34.field750[var5];
                            int var245 = client.field322[var244].method3602();
                            class34.field750[var5++] = var245 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3911) {
                            var5--;
                            int var246 = class34.field750[var5];
                            int var247 = client.field322[var246].method3602();
                            class34.field750[var5++] = var247 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3912) {
                            var5--;
                            int var248 = class34.field750[var5];
                            int var249 = client.field322[var248].method3602();
                            class34.field750[var5++] = var249 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3913) {
                            var5--;
                            int var250 = class34.field750[var5];
                            int var251 = client.field322[var250].method3602();
                            class34.field750[var5++] = var251 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 3914) {
                            var5--;
                            boolean var252 = class34.field750[var5] == 1;
                            if (field1708 != null) {
                                field1708.method3618(class212.field3081, var252);
                            }
                            continue;
                        }
                        if (var491 == 3915) {
                            var5--;
                            boolean var253 = class34.field750[var5] == 1;
                            if (field1708 != null) {
                                field1708.method3618(class212.field3080, var253);
                            }
                            continue;
                        }
                        if (var491 == 3916) {
                            var5 -= 2;
                            boolean var254 = class34.field750[var5] == 1;
                            boolean var255 = class34.field750[var5 + 1] == 1;
                            if (field1708 != null) {
                                field1708.method3618(new class21(var255), var254);
                            }
                            continue;
                        }
                        if (var491 == 3917) {
                            var5--;
                            boolean var256 = class34.field750[var5] == 1;
                            if (field1708 != null) {
                                field1708.method3618(class212.field3079, var256);
                            }
                            continue;
                        }
                        if (var491 == 3918) {
                            var5--;
                            boolean var257 = class34.field750[var5] == 1;
                            if (field1708 != null) {
                                field1708.method3618(class212.field3082, var257);
                            }
                            continue;
                        }
                        if (var491 == 3919) {
                            class34.field750[var5++] = field1708 == null ? 0 : field1708.field3084.size();
                            continue;
                        }
                        if (var491 == 3920) {
                            var5--;
                            int var258 = class34.field750[var5];
                            class205 var259 = (class205) field1708.field3084.get(var258);
                            class34.field750[var5++] = var259.field3052;
                            continue;
                        }
                        if (var491 == 3921) {
                            var5--;
                            int var260 = class34.field750[var5];
                            class205 var261 = (class205) field1708.field3084.get(var260);
                            class34.field747[var6++] = var261.method3568();
                            continue;
                        }
                        if (var491 == 3922) {
                            var5--;
                            int var262 = class34.field750[var5];
                            class205 var263 = (class205) field1708.field3084.get(var262);
                            class34.field747[var6++] = var263.method3567();
                            continue;
                        }
                        if (var491 == 3923) {
                            var5--;
                            int var264 = class34.field750[var5];
                            class205 var265 = (class205) field1708.field3084.get(var264);
                            long var266 = class107.method579() - field2070 - var265.field3049;
                            int var268 = (int) (var266 / 3600000L);
                            int var269 = (int) ((var266 - (long) (var268 * 3600000)) / 60000L);
                            int var270 = (int) ((var266 - (long) (var268 * 3600000) - (long) (var269 * 60000)) / 1000L);
                            String var271 = var268 + ":" + var269 / 10 + var269 % 10 + ":" + var270 / 10 + var270 % 10;
                            class34.field747[var6++] = var271;
                            continue;
                        }
                        if (var491 == 3924) {
                            var5--;
                            int var272 = class34.field750[var5];
                            class205 var273 = (class205) field1708.field3084.get(var272);
                            class34.field750[var5++] = var273.field3050.field3073;
                            continue;
                        }
                        if (var491 == 3925) {
                            var5--;
                            int var274 = class34.field750[var5];
                            class205 var275 = (class205) field1708.field3084.get(var274);
                            class34.field750[var5++] = var275.field3050.field3071;
                            continue;
                        }
                        if (var491 == 3926) {
                            var5--;
                            int var276 = class34.field750[var5];
                            class205 var277 = (class205) field1708.field3084.get(var276);
                            class34.field750[var5++] = var277.field3050.field3072;
                            continue;
                        }
                    } else if (var491 < 4100) {
                        if (var491 == 4000) {
                            var5 -= 2;
                            int var278 = class34.field750[var5];
                            int var279 = class34.field750[var5 + 1];
                            class34.field750[var5++] = var278 + var279;
                            continue;
                        }
                        if (var491 == 4001) {
                            var5 -= 2;
                            int var280 = class34.field750[var5];
                            int var281 = class34.field750[var5 + 1];
                            class34.field750[var5++] = var280 - var281;
                            continue;
                        }
                        if (var491 == 4002) {
                            var5 -= 2;
                            int var282 = class34.field750[var5];
                            int var283 = class34.field750[var5 + 1];
                            class34.field750[var5++] = var282 * var283;
                            continue;
                        }
                        if (var491 == 4003) {
                            var5 -= 2;
                            int var284 = class34.field750[var5];
                            int var285 = class34.field750[var5 + 1];
                            class34.field750[var5++] = var284 / var285;
                            continue;
                        }
                        if (var491 == 4004) {
                            var5--;
                            int var286 = class34.field750[var5];
                            class34.field750[var5++] = (int) (Math.random() * (double) var286);
                            continue;
                        }
                        if (var491 == 4005) {
                            var5--;
                            int var287 = class34.field750[var5];
                            class34.field750[var5++] = (int) (Math.random() * (double) (var287 + 1));
                            continue;
                        }
                        if (var491 == 4006) {
                            var5 -= 5;
                            int var288 = class34.field750[var5];
                            int var289 = class34.field750[var5 + 1];
                            int var290 = class34.field750[var5 + 2];
                            int var291 = class34.field750[var5 + 3];
                            int var292 = class34.field750[var5 + 4];
                            class34.field750[var5++] = (var289 - var288) * (var292 - var290) / (var291 - var290) + var288;
                            continue;
                        }
                        if (var491 == 4007) {
                            var5 -= 2;
                            int var293 = class34.field750[var5];
                            int var294 = class34.field750[var5 + 1];
                            class34.field750[var5++] = var293 * var294 / 100 + var293;
                            continue;
                        }
                        if (var491 == 4008) {
                            var5 -= 2;
                            int var295 = class34.field750[var5];
                            int var296 = class34.field750[var5 + 1];
                            class34.field750[var5++] = var295 | 0x1 << var296;
                            continue;
                        }
                        if (var491 == 4009) {
                            var5 -= 2;
                            int var297 = class34.field750[var5];
                            int var298 = class34.field750[var5 + 1];
                            class34.field750[var5++] = var297 & -1 - (0x1 << var298);
                            continue;
                        }
                        if (var491 == 4010) {
                            var5 -= 2;
                            int var299 = class34.field750[var5];
                            int var300 = class34.field750[var5 + 1];
                            class34.field750[var5++] = (var299 & 0x1 << var300) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var491 == 4011) {
                            var5 -= 2;
                            int var301 = class34.field750[var5];
                            int var302 = class34.field750[var5 + 1];
                            class34.field750[var5++] = var301 % var302;
                            continue;
                        }
                        if (var491 == 4012) {
                            var5 -= 2;
                            int var303 = class34.field750[var5];
                            int var304 = class34.field750[var5 + 1];
                            if (var303 == 0) {
                                class34.field750[var5++] = 0;
                            } else {
                                class34.field750[var5++] = (int) Math.pow((double) var303, (double) var304);
                            }
                            continue;
                        }
                        if (var491 == 4013) {
                            var5 -= 2;
                            int var305 = class34.field750[var5];
                            int var306 = class34.field750[var5 + 1];
                            if (var305 == 0) {
                                class34.field750[var5++] = 0;
                            } else if (var306 == 0) {
                                class34.field750[var5++] = Integer.MAX_VALUE;
                            } else {
                                class34.field750[var5++] = (int) Math.pow((double) var305, 1.0D / (double) var306);
                            }
                            continue;
                        }
                        if (var491 == 4014) {
                            var5 -= 2;
                            int var307 = class34.field750[var5];
                            int var308 = class34.field750[var5 + 1];
                            class34.field750[var5++] = var307 & var308;
                            continue;
                        }
                        if (var491 == 4015) {
                            var5 -= 2;
                            int var309 = class34.field750[var5];
                            int var310 = class34.field750[var5 + 1];
                            class34.field750[var5++] = var309 | var310;
                            continue;
                        }
                    } else if (var491 < 4200) {
                        if (var491 == 4100) {
                            var6--;
                            String var311 = class34.field747[var6];
                            var5--;
                            int var312 = class34.field750[var5];
                            class34.field747[var6++] = var311 + var312;
                            continue;
                        }
                        if (var491 == 4101) {
                            var6 -= 2;
                            String var313 = class34.field747[var6];
                            String var314 = class34.field747[var6 + 1];
                            class34.field747[var6++] = var313 + var314;
                            continue;
                        }
                        if (var491 == 4102) {
                            var6--;
                            String var315 = class34.field747[var6];
                            var5--;
                            int var316 = class34.field750[var5];
                            String[] var317 = class34.field747;
                            int var318 = var6++;
                            String var320;
                            if (var316 < 0) {
                                var320 = Integer.toString(var316);
                            } else {
                                int var321 = var316;
                                String var322;
                                if (var316 < 0) {
                                    var322 = Integer.toString(var316, 10);
                                } else {
                                    int var323 = 2;
                                    int var324 = var316 / 10;
                                    while (var324 != 0) {
                                        var324 /= 10;
                                        var323++;
                                    }
                                    char[] var325 = new char[var323];
                                    var325[0] = '+';
                                    for (int var326 = var323 - 1; var326 > 0; var326--) {
                                        int var327 = var321;
                                        var321 /= 10;
                                        int var328 = var327 - var321 * 10;
                                        if (var328 >= 10) {
                                            var325[var326] = (char) (var328 + 87);
                                        } else {
                                            var325[var326] = (char) (var328 + 48);
                                        }
                                    }
                                    var322 = new String(var325);
                                }
                                var320 = var322;
                            }
                            var317[var318] = var315 + var320;
                            continue;
                        }
                        if (var491 == 4103) {
                            var6--;
                            String var329 = class34.field747[var6];
                            class34.field747[var6++] = var329.toLowerCase();
                            continue;
                        }
                        if (var491 == 4104) {
                            var5--;
                            int var330 = class34.field750[var5];
                            long var331 = ((long) var330 + 11745L) * 86400000L;
                            class34.field758.setTime(new Date(var331));
                            int var333 = class34.field758.get(5);
                            int var334 = class34.field758.get(2);
                            int var335 = class34.field758.get(1);
                            class34.field747[var6++] = var333 + "-" + class34.field759[var334] + "-" + var335;
                            continue;
                        }
                        if (var491 == 4105) {
                            var6 -= 2;
                            String var336 = class34.field747[var6];
                            String var337 = class34.field747[var6 + 1];
                            if (field734.field44 != null && field734.field44.field2818) {
                                class34.field747[var6++] = var337;
                                continue;
                            }
                            class34.field747[var6++] = var336;
                            continue;
                        }
                        if (var491 == 4106) {
                            var5--;
                            int var338 = class34.field750[var5];
                            class34.field747[var6++] = Integer.toString(var338);
                            continue;
                        }
                        if (var491 == 4107) {
                            var6 -= 2;
                            int[] var339 = class34.field750;
                            int var340 = var5++;
                            String var341 = class34.field747[var6];
                            String var342 = class34.field747[var6 + 1];
                            int var343 = client.field264;
                            int var344 = var341.length();
                            int var345 = var342.length();
                            int var346 = 0;
                            int var347 = 0;
                            byte var348 = 0;
                            byte var349 = 0;
                            int var350;
                            label2909: while (true) {
                                if (var346 - var348 >= var344 && var347 - var349 >= var345) {
                                    int var361 = Math.min(var344, var345);
                                    for (int var362 = 0; var362 < var361; var362++) {
                                        char var365 = var341.charAt(var362);
                                        char var366 = var342.charAt(var362);
                                        if (var365 != var366 && Character.toUpperCase(var365) != Character.toUpperCase(var366)) {
                                            char var367 = Character.toLowerCase(var365);
                                            char var368 = Character.toLowerCase(var366);
                                            if (var367 != var368) {
                                                var350 = class157.method1367(var367, var343) - class157.method1367(var368, var343);
                                                break label2909;
                                            }
                                        }
                                    }
                                    int var369 = var344 - var345;
                                    if (var369 == 0) {
                                        for (int var370 = 0; var370 < var361; var370++) {
                                            char var371 = var341.charAt(var370);
                                            char var372 = var342.charAt(var370);
                                            if (var371 != var372) {
                                                var350 = class157.method1367(var371, var343) - class157.method1367(var372, var343);
                                                break label2909;
                                            }
                                        }
                                        var350 = 0;
                                    } else {
                                        var350 = var369;
                                    }
                                    break;
                                }
                                if (var346 - var348 >= var344) {
                                    var350 = -1;
                                    break;
                                }
                                if (var347 - var349 >= var345) {
                                    var350 = 1;
                                    break;
                                }
                                char var351;
                                if (var348 == 0) {
                                    var351 = var341.charAt(var346++);
                                } else {
                                    var351 = (char) var348;
                                    boolean var352 = false;
                                }
                                char var353;
                                if (var349 == 0) {
                                    var353 = var342.charAt(var347++);
                                } else {
                                    var353 = (char) var349;
                                    boolean var354 = false;
                                }
                                byte var355;
                                if (var351 == 198) {
                                    var355 = 69;
                                } else if (var351 == 230) {
                                    var355 = 101;
                                } else if (var351 == 223) {
                                    var355 = 115;
                                } else if (var351 == 338) {
                                    var355 = 69;
                                } else if (var351 == 339) {
                                    var355 = 101;
                                } else {
                                    var355 = 0;
                                }
                                var348 = var355;
                                byte var356;
                                if (var353 == 198) {
                                    var356 = 69;
                                } else if (var353 == 230) {
                                    var356 = 101;
                                } else if (var353 == 223) {
                                    var356 = 115;
                                } else if (var353 == 338) {
                                    var356 = 69;
                                } else if (var353 == 339) {
                                    var356 = 101;
                                } else {
                                    var356 = 0;
                                }
                                var349 = var356;
                                char var357 = class157.method1895(var351, var343);
                                char var358 = class157.method1895(var353, var343);
                                if (var357 != var358 && Character.toUpperCase(var357) != Character.toUpperCase(var358)) {
                                    char var359 = Character.toLowerCase(var357);
                                    char var360 = Character.toLowerCase(var358);
                                    if (var359 != var360) {
                                        var350 = class157.method1367(var359, var343) - class157.method1367(var360, var343);
                                        break;
                                    }
                                }
                            }
                            var339[var340] = class154.method170(var350);
                            continue;
                        }
                        if (var491 == 4108) {
                            var6--;
                            String var373 = class34.field747[var6];
                            var5 -= 2;
                            int var374 = class34.field750[var5];
                            int var375 = class34.field750[var5 + 1];
                            byte[] var376 = field1160.method2896(var375, 0);
                            class215 var377 = new class215(var376);
                            class34.field750[var5++] = var377.method3628(var373, var374);
                            continue;
                        }
                        if (var491 == 4109) {
                            var6--;
                            String var378 = class34.field747[var6];
                            var5 -= 2;
                            int var379 = class34.field750[var5];
                            int var380 = class34.field750[var5 + 1];
                            byte[] var381 = field1160.method2896(var380, 0);
                            class215 var382 = new class215(var381);
                            class34.field750[var5++] = var382.method3627(var378, var379);
                            continue;
                        }
                        if (var491 == 4110) {
                            var6 -= 2;
                            String var383 = class34.field747[var6];
                            String var384 = class34.field747[var6 + 1];
                            var5--;
                            if (class34.field750[var5] == 1) {
                                class34.field747[var6++] = var383;
                            } else {
                                class34.field747[var6++] = var384;
                            }
                            continue;
                        }
                        if (var491 == 4111) {
                            var6--;
                            String var385 = class34.field747[var6];
                            class34.field747[var6++] = class214.method3629(var385);
                            continue;
                        }
                        if (var491 == 4112) {
                            var6--;
                            String var386 = class34.field747[var6];
                            var5--;
                            int var387 = class34.field750[var5];
                            class34.field747[var6++] = var386 + (char) var387;
                            continue;
                        }
                        if (var491 == 4113) {
                            var5--;
                            int var388 = class34.field750[var5];
                            class34.field750[var5++] = class154.method724((char) var388) ? 1 : 0;
                            continue;
                        }
                        if (var491 == 4114) {
                            var5--;
                            int var389 = class34.field750[var5];
                            int[] var390 = class34.field750;
                            int var391 = var5++;
                            char var392 = (char) var389;
                            boolean var393 = var392 >= '0' && var392 <= '9' || var392 >= 'A' && var392 <= 'Z' || var392 >= 'a' && var392 <= 'z';
                            var390[var391] = var393 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 4115) {
                            var5--;
                            int var394 = class34.field750[var5];
                            int[] var395 = class34.field750;
                            int var396 = var5++;
                            char var397 = (char) var394;
                            boolean var398 = var397 >= 'A' && var397 <= 'Z' || var397 >= 'a' && var397 <= 'z';
                            var395[var396] = var398 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 4116) {
                            var5--;
                            int var399 = class34.field750[var5];
                            class34.field750[var5++] = class154.method590((char) var399) ? 1 : 0;
                            continue;
                        }
                        if (var491 == 4117) {
                            var6--;
                            String var400 = class34.field747[var6];
                            if (var400 == null) {
                                class34.field750[var5++] = 0;
                            } else {
                                class34.field750[var5++] = var400.length();
                            }
                            continue;
                        }
                        if (var491 == 4118) {
                            var6--;
                            String var401 = class34.field747[var6];
                            var5 -= 2;
                            int var402 = class34.field750[var5];
                            int var403 = class34.field750[var5 + 1];
                            class34.field747[var6++] = var401.substring(var402, var403);
                            continue;
                        }
                        if (var491 == 4119) {
                            var6--;
                            String var404 = class34.field747[var6];
                            StringBuilder var405 = new StringBuilder(var404.length());
                            boolean var406 = false;
                            for (int var407 = 0; var407 < var404.length(); var407++) {
                                char var408 = var404.charAt(var407);
                                if (var408 == '<') {
                                    var406 = true;
                                } else if (var408 == '>') {
                                    var406 = false;
                                } else if (!var406) {
                                    var405.append(var408);
                                }
                            }
                            class34.field747[var6++] = var405.toString();
                            continue;
                        }
                        if (var491 == 4120) {
                            var6--;
                            String var409 = class34.field747[var6];
                            var5--;
                            int var410 = class34.field750[var5];
                            class34.field750[var5++] = var409.indexOf(var410);
                            continue;
                        }
                        if (var491 == 4121) {
                            var6 -= 2;
                            String var411 = class34.field747[var6];
                            String var412 = class34.field747[var6 + 1];
                            var5--;
                            int var413 = class34.field750[var5];
                            class34.field750[var5++] = var411.indexOf(var412, var413);
                            continue;
                        }
                    } else if (var491 < 4300) {
                        if (var491 == 4200) {
                            var5--;
                            int var414 = class34.field750[var5];
                            class34.field747[var6++] = class47.method2450(var414).field1056;
                            continue;
                        }
                        if (var491 == 4201) {
                            var5 -= 2;
                            int var415 = class34.field750[var5];
                            int var416 = class34.field750[var5 + 1];
                            class47 var417 = class47.method2450(var415);
                            if (var416 >= 1 && var416 <= 5 && var417.field1090[var416 - 1] != null) {
                                class34.field747[var6++] = var417.field1090[var416 - 1];
                                continue;
                            }
                            class34.field747[var6++] = "";
                            continue;
                        }
                        if (var491 == 4202) {
                            var5 -= 2;
                            int var418 = class34.field750[var5];
                            int var419 = class34.field750[var5 + 1];
                            class47 var420 = class47.method2450(var418);
                            if (var419 >= 1 && var419 <= 5 && var420.field1071[var419 - 1] != null) {
                                class34.field747[var6++] = var420.field1071[var419 - 1];
                                continue;
                            }
                            class34.field747[var6++] = "";
                            continue;
                        }
                        if (var491 == 4203) {
                            var5--;
                            int var421 = class34.field750[var5];
                            class34.field750[var5++] = class47.method2450(var421).field1068;
                            continue;
                        }
                        if (var491 == 4204) {
                            var5--;
                            int var422 = class34.field750[var5];
                            class34.field750[var5++] = class47.method2450(var422).field1067 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 4205) {
                            var5--;
                            int var423 = class34.field750[var5];
                            class47 var424 = class47.method2450(var423);
                            if (var424.field1087 == -1 && var424.field1048 >= 0) {
                                class34.field750[var5++] = var424.field1048;
                                continue;
                            }
                            class34.field750[var5++] = var423;
                            continue;
                        }
                        if (var491 == 4206) {
                            var5--;
                            int var425 = class34.field750[var5];
                            class47 var426 = class47.method2450(var425);
                            if (var426.field1087 >= 0 && var426.field1048 >= 0) {
                                class34.field750[var5++] = var426.field1048;
                                continue;
                            }
                            class34.field750[var5++] = var425;
                            continue;
                        }
                        if (var491 == 4207) {
                            var5--;
                            int var427 = class34.field750[var5];
                            class34.field750[var5++] = class47.method2450(var427).field1069 ? 1 : 0;
                            continue;
                        }
                        if (var491 == 4210) {
                            var6--;
                            String var428 = class34.field747[var6];
                            var5--;
                            int var429 = class34.field750[var5];
                            client.method627(var428, var429 == 1);
                            class34.field750[var5++] = field1310;
                            continue;
                        }
                        if (var491 == 4211) {
                            if (field2563 != null && field1953 < field1310) {
                                class34.field750[var5++] = field2563[++field1953 - 1] & 0xFFFF;
                                continue;
                            }
                            class34.field750[var5++] = -1;
                            continue;
                        }
                        if (var491 == 4212) {
                            field1953 = 0;
                            continue;
                        }
                    } else if (var491 < 5100) {
                        if (var491 == 5000) {
                            class34.field750[var5++] = client.field480;
                            continue;
                        }
                        if (var491 == 5001) {
                            var5 -= 3;
                            client.field480 = class34.field750[var5];
                            int var430 = class34.field750[var5 + 1];
                            class122[] var431 = class122.method1891();
                            int var432 = 0;
                            class122 var434;
                            while (true) {
                                if (var432 >= var431.length) {
                                    var434 = null;
                                    break;
                                }
                                class122 var433 = var431[var432];
                                if (var433.field1954 == var430) {
                                    var434 = var433;
                                    break;
                                }
                                var432++;
                            }
                            field2547 = var434;
                            if (field2547 == null) {
                                field2547 = class122.field1947;
                            }
                            client.field481 = class34.field750[var5 + 2];
                            client.field452.method2426(98);
                            client.field452.method2160(client.field480);
                            client.field452.method2160(field2547.field1954);
                            client.field452.method2160(client.field481);
                            continue;
                        }
                        if (var491 == 5002) {
                            var6--;
                            String var435 = class34.field747[var6];
                            var5 -= 2;
                            int var436 = class34.field750[var5];
                            int var437 = class34.field750[var5 + 1];
                            client.field452.method2426(254);
                            client.field452.method2160(class111.method1406(var435) + 2);
                            client.field452.method2186(var435);
                            client.field452.method2160(var436 - 1);
                            client.field452.method2160(var437);
                            continue;
                        }
                        if (var491 == 5003) {
                            var5 -= 2;
                            int var438 = class34.field750[var5];
                            int var439 = class34.field750[var5 + 1];
                            class26 var440 = (class26) class11.field170.get(var438);
                            class33 var441 = var440.method577(var439);
                            if (var441 == null) {
                                class34.field750[var5++] = -1;
                                class34.field750[var5++] = 0;
                                class34.field747[var6++] = "";
                                class34.field747[var6++] = "";
                                class34.field747[var6++] = "";
                            } else {
                                class34.field750[var5++] = var441.field745;
                                class34.field750[var5++] = var441.field739;
                                class34.field747[var6++] = var441.field742 == null ? "" : var441.field742;
                                class34.field747[var6++] = var441.field741 == null ? "" : var441.field741;
                                class34.field747[var6++] = var441.field738 == null ? "" : var441.field738;
                            }
                            continue;
                        }
                        if (var491 == 5004) {
                            var5--;
                            int var443 = class34.field750[var5];
                            class33 var444 = class11.method940(var443);
                            if (var444 == null) {
                                class34.field750[var5++] = -1;
                                class34.field750[var5++] = 0;
                                class34.field747[var6++] = "";
                                class34.field747[var6++] = "";
                                class34.field747[var6++] = "";
                            } else {
                                class34.field750[var5++] = var444.field740;
                                class34.field750[var5++] = var444.field739;
                                class34.field747[var6++] = var444.field742 == null ? "" : var444.field742;
                                class34.field747[var6++] = var444.field741 == null ? "" : var444.field741;
                                class34.field747[var6++] = var444.field738 == null ? "" : var444.field738;
                            }
                            continue;
                        }
                        if (var491 == 5005) {
                            if (field2547 == null) {
                                class34.field750[var5++] = -1;
                            } else {
                                class34.field750[var5++] = field2547.field1954;
                            }
                            continue;
                        }
                        if (var491 == 5008) {
                            var6--;
                            String var445 = class34.field747[var6];
                            var5--;
                            int var446 = class34.field750[var5];
                            String var447 = var445.toLowerCase();
                            byte var448 = 0;
                            if (var447.startsWith(class148.field2389)) {
                                var448 = 0;
                                var445 = var445.substring(class148.field2389.length());
                            } else if (var447.startsWith(class148.field2391)) {
                                var448 = 1;
                                var445 = var445.substring(class148.field2391.length());
                            } else if (var447.startsWith(class148.field2393)) {
                                var448 = 2;
                                var445 = var445.substring(class148.field2393.length());
                            } else if (var447.startsWith(class148.field2395)) {
                                var448 = 3;
                                var445 = var445.substring(class148.field2395.length());
                            } else if (var447.startsWith(class148.field2397)) {
                                var448 = 4;
                                var445 = var445.substring(class148.field2397.length());
                            } else if (var447.startsWith(class148.field2399)) {
                                var448 = 5;
                                var445 = var445.substring(class148.field2399.length());
                            } else if (var447.startsWith(class148.field2382)) {
                                var448 = 6;
                                var445 = var445.substring(class148.field2382.length());
                            } else if (var447.startsWith(class148.field2403)) {
                                var448 = 7;
                                var445 = var445.substring(class148.field2403.length());
                            } else if (var447.startsWith(class148.field2471)) {
                                var448 = 8;
                                var445 = var445.substring(class148.field2471.length());
                            } else if (var447.startsWith(class148.field2473)) {
                                var448 = 9;
                                var445 = var445.substring(class148.field2473.length());
                            } else if (var447.startsWith(class148.field2465)) {
                                var448 = 10;
                                var445 = var445.substring(class148.field2465.length());
                            } else if (var447.startsWith(class148.field2275)) {
                                var448 = 11;
                                var445 = var445.substring(class148.field2275.length());
                            } else if (client.field264 != 0) {
                                if (var447.startsWith(class148.field2390)) {
                                    var448 = 0;
                                    var445 = var445.substring(class148.field2390.length());
                                } else if (var447.startsWith(class148.field2392)) {
                                    var448 = 1;
                                    var445 = var445.substring(class148.field2392.length());
                                } else if (var447.startsWith(class148.field2394)) {
                                    var448 = 2;
                                    var445 = var445.substring(class148.field2394.length());
                                } else if (var447.startsWith(class148.field2415)) {
                                    var448 = 3;
                                    var445 = var445.substring(class148.field2415.length());
                                } else if (var447.startsWith(class148.field2213)) {
                                    var448 = 4;
                                    var445 = var445.substring(class148.field2213.length());
                                } else if (var447.startsWith(class148.field2400)) {
                                    var448 = 5;
                                    var445 = var445.substring(class148.field2400.length());
                                } else if (var447.startsWith(class148.field2434)) {
                                    var448 = 6;
                                    var445 = var445.substring(class148.field2434.length());
                                } else if (var447.startsWith(class148.field2265)) {
                                    var448 = 7;
                                    var445 = var445.substring(class148.field2265.length());
                                } else if (var447.startsWith(class148.field2212)) {
                                    var448 = 8;
                                    var445 = var445.substring(class148.field2212.length());
                                } else if (var447.startsWith(class148.field2408)) {
                                    var448 = 9;
                                    var445 = var445.substring(class148.field2408.length());
                                } else if (var447.startsWith(class148.field2410)) {
                                    var448 = 10;
                                    var445 = var445.substring(class148.field2410.length());
                                } else if (var447.startsWith(class148.field2412)) {
                                    var448 = 11;
                                    var445 = var445.substring(class148.field2412.length());
                                }
                            }
                            String var449 = var445.toLowerCase();
                            byte var450 = 0;
                            if (var449.startsWith(class148.field2358)) {
                                var450 = 1;
                                var445 = var445.substring(class148.field2358.length());
                            } else if (var449.startsWith(class148.field2245)) {
                                var450 = 2;
                                var445 = var445.substring(class148.field2245.length());
                            } else if (var449.startsWith(class148.field2417)) {
                                var450 = 3;
                                var445 = var445.substring(class148.field2417.length());
                            } else if (var449.startsWith(class148.field2343)) {
                                var450 = 4;
                                var445 = var445.substring(class148.field2343.length());
                            } else if (var449.startsWith(class148.field2354)) {
                                var450 = 5;
                                var445 = var445.substring(class148.field2354.length());
                            } else if (client.field264 != 0) {
                                if (var449.startsWith(class148.field2347)) {
                                    var450 = 1;
                                    var445 = var445.substring(class148.field2347.length());
                                } else if (var449.startsWith(class148.field2416)) {
                                    var450 = 2;
                                    var445 = var445.substring(class148.field2416.length());
                                } else if (var449.startsWith(class148.field2418)) {
                                    var450 = 3;
                                    var445 = var445.substring(class148.field2418.length());
                                } else if (var449.startsWith(class148.field2244)) {
                                    var450 = 4;
                                    var445 = var445.substring(class148.field2244.length());
                                } else if (var449.startsWith(class148.field2422)) {
                                    var450 = 5;
                                    var445 = var445.substring(class148.field2422.length());
                                }
                            }
                            client.field452.method2426(255);
                            client.field452.method2160(0);
                            int var451 = client.field452.field1885;
                            client.field452.method2160(var446);
                            client.field452.method2160(var448);
                            client.field452.method2160(var450);
                            class114 var452 = client.field452;
                            int var453 = var452.field1885;
                            byte[] var454 = class156.method3620(var445);
                            var452.method2173(var454.length);
                            var452.field1885 += field3086.method2114(var454, 0, var454.length, var452.field1889, var452.field1885);
                            client.field452.method2172(client.field452.field1885 - var451);
                            continue;
                        }
                        if (var491 == 5009) {
                            var6 -= 2;
                            String var455 = class34.field747[var6];
                            String var456 = class34.field747[var6 + 1];
                            client.field452.method2426(29);
                            client.field452.method2365(0);
                            int var457 = client.field452.field1885;
                            client.field452.method2186(var455);
                            class114 var458 = client.field452;
                            int var459 = var458.field1885;
                            byte[] var460 = class156.method3620(var456);
                            var458.method2173(var460.length);
                            var458.field1885 += field3086.method2114(var460, 0, var460.length, var458.field1889, var458.field1885);
                            client.field452.method2171(client.field452.field1885 - var457);
                            continue;
                        }
                        if (var491 == 5015) {
                            String var461;
                            if (field734 == null || field734.field39 == null) {
                                var461 = "";
                            } else {
                                var461 = field734.field39;
                            }
                            class34.field747[var6++] = var461;
                            continue;
                        }
                        if (var491 == 5016) {
                            class34.field750[var5++] = client.field481;
                            continue;
                        }
                        if (var491 == 5017) {
                            var5--;
                            int var462 = class34.field750[var5];
                            class34.field750[var5++] = class11.method2517(var462);
                            continue;
                        }
                        if (var491 == 5018) {
                            var5--;
                            int var463 = class34.field750[var5];
                            class34.field750[var5++] = class11.method2472(var463);
                            continue;
                        }
                        if (var491 == 5019) {
                            var5--;
                            int var464 = class34.field750[var5];
                            class34.field750[var5++] = class11.method35(var464);
                            continue;
                        }
                        if (var491 == 5020) {
                            var6--;
                            String var465 = class34.field747[var6];
                            if (var465.equalsIgnoreCase("toggleroof")) {
                                field71.field134 = !field71.field134;
                                class9.method2816();
                                if (field71.field134) {
                                    class11.method3366(99, "", "Roofs are now all hidden");
                                } else {
                                    class11.method3366(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var465.equalsIgnoreCase("displayfps")) {
                                client.field273 = !client.field273;
                            }
                            if (client.field427 >= 2) {
                                if (var465.equalsIgnoreCase("fpson")) {
                                    client.field273 = true;
                                }
                                if (var465.equalsIgnoreCase("fpsoff")) {
                                    client.field273 = false;
                                }
                                if (var465.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var465.equalsIgnoreCase("clientdrop")) {
                                    client.method37();
                                }
                                if (var465.equalsIgnoreCase("errortest") && client.field259 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field452.method2426(105);
                            client.field452.method2160(var465.length() + 1);
                            client.field452.method2186(var465);
                            continue;
                        }
                        if (var491 == 5021) {
                            var6--;
                            client.field482 = class34.field747[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var491 == 5022) {
                            class34.field747[var6++] = client.field482;
                            continue;
                        }
                    }
                }
                if (var491 < 5400) {
                    if (var491 == 5306) {
                        int[] var466 = class34.field750;
                        int var467 = var5++;
                        int var468 = client.field441 ? 2 : 1;
                        var466[var467] = var468;
                        continue;
                    }
                    if (var491 == 5307) {
                        var5--;
                        int var469 = class34.field750[var5];
                        if (var469 != 1 && var469 != 2) {
                            continue;
                        }
                        client.field475 = 0L;
                        if (var469 >= 2) {
                            client.field441 = true;
                        } else {
                            client.field441 = false;
                        }
                        client.method480();
                        if (client.field460 >= 25) {
                            client.field452.method2426(104);
                            class114 var470 = client.field452;
                            int var471 = client.field441 ? 2 : 1;
                            var470.method2160(var471);
                            client.field452.method2365(field594);
                            client.field452.method2365(field1958);
                        }
                        class136.field2105 = true;
                        continue;
                    }
                    if (var491 == 5308) {
                        class34.field750[var5++] = field71.field136;
                        continue;
                    }
                    if (var491 == 5309) {
                        var5--;
                        int var472 = class34.field750[var5];
                        if (var472 == 1 || var472 == 2) {
                            field71.field136 = var472;
                            class9.method2816();
                        }
                        continue;
                    }
                }
                if (var491 < 5600 && var491 == 5504) {
                    var5 -= 2;
                    int var473 = class34.field750[var5];
                    int var474 = class34.field750[var5 + 1];
                    if (!client.field510) {
                        client.field319 = var473;
                        client.field343 = var474;
                    }
                } else if (var491 < 5700 && var491 == 5630) {
                    client.field310 = 250;
                } else {
                    if (var491 < 6300) {
                        if (var491 == 6200) {
                            var5 -= 2;
                            client.field515 = (short) class34.field750[var5];
                            if (client.field515 <= 0) {
                                client.field515 = 256;
                            }
                            client.field517 = (short) class34.field750[var5 + 1];
                            if (client.field517 <= 0) {
                                client.field517 = 205;
                            }
                            continue;
                        }
                        if (var491 == 6201) {
                            var5 -= 2;
                            client.field518 = (short) class34.field750[var5];
                            if (client.field518 <= 0) {
                                client.field518 = 256;
                            }
                            client.field519 = (short) class34.field750[var5 + 1];
                            if (client.field519 <= 0) {
                                client.field519 = 320;
                            }
                            continue;
                        }
                        if (var491 == 6202) {
                            var5 -= 4;
                            client.field330 = (short) class34.field750[var5];
                            if (client.field330 <= 0) {
                                client.field330 = 1;
                            }
                            client.field297 = (short) class34.field750[var5 + 1];
                            if (client.field297 <= 0) {
                                client.field297 = 32767;
                            } else if (client.field297 < client.field330) {
                                client.field297 = client.field330;
                            }
                            client.field382 = (short) class34.field750[var5 + 2];
                            if (client.field382 <= 0) {
                                client.field382 = 1;
                            }
                            client.field388 = (short) class34.field750[var5 + 3];
                            if (client.field388 <= 0) {
                                client.field388 = 32767;
                            } else if (client.field388 < client.field382) {
                                client.field388 = client.field382;
                            }
                            continue;
                        }
                        if (var491 == 6203) {
                            if (client.field432 == null) {
                                class34.field750[var5++] = -1;
                                class34.field750[var5++] = -1;
                            } else {
                                client.method2799(0, 0, client.field432.field2667, client.field432.field2668, false);
                                class34.field750[var5++] = client.field526;
                                class34.field750[var5++] = client.field527;
                            }
                            continue;
                        }
                        if (var491 == 6204) {
                            class34.field750[var5++] = client.field518;
                            class34.field750[var5++] = client.field519;
                            continue;
                        }
                        if (var491 == 6205) {
                            class34.field750[var5++] = client.field515;
                            class34.field750[var5++] = client.field517;
                            continue;
                        }
                    }
                    if (var491 < 6600) {
                        if (var491 == 6500) {
                            class34.field750[var5++] = class24.method36() ? 1 : 0;
                            continue;
                        }
                        if (var491 == 6501) {
                            class24 var475 = class24.method3587();
                            if (var475 == null) {
                                class34.field750[var5++] = -1;
                                class34.field750[var5++] = 0;
                                class34.field747[var6++] = "";
                                class34.field750[var5++] = 0;
                                class34.field750[var5++] = 0;
                                class34.field747[var6++] = "";
                            } else {
                                class34.field750[var5++] = var475.field617;
                                class34.field750[var5++] = var475.field622;
                                class34.field747[var6++] = var475.field621;
                                class34.field750[var5++] = var475.field624;
                                class34.field750[var5++] = var475.field619;
                                class34.field747[var6++] = var475.field618;
                            }
                            continue;
                        }
                        if (var491 == 6502) {
                            class24 var476;
                            if (class24.field609 < class24.field614) {
                                var476 = field612[++class24.field609 - 1];
                            } else {
                                var476 = null;
                            }
                            if (var476 == null) {
                                class34.field750[var5++] = -1;
                                class34.field750[var5++] = 0;
                                class34.field747[var6++] = "";
                                class34.field750[var5++] = 0;
                                class34.field750[var5++] = 0;
                                class34.field747[var6++] = "";
                            } else {
                                class34.field750[var5++] = var476.field617;
                                class34.field750[var5++] = var476.field622;
                                class34.field747[var6++] = var476.field621;
                                class34.field750[var5++] = var476.field624;
                                class34.field750[var5++] = var476.field619;
                                class34.field747[var6++] = var476.field618;
                            }
                            continue;
                        }
                        if (var491 == 6506) {
                            var5--;
                            int var478 = class34.field750[var5];
                            class24 var479 = null;
                            for (int var480 = 0; var480 < class24.field614; var480++) {
                                if (field612[var480].field617 == var478) {
                                    var479 = field612[var480];
                                    break;
                                }
                            }
                            if (var479 == null) {
                                class34.field750[var5++] = -1;
                                class34.field750[var5++] = 0;
                                class34.field747[var6++] = "";
                                class34.field750[var5++] = 0;
                                class34.field750[var5++] = 0;
                                class34.field747[var6++] = "";
                            } else {
                                class34.field750[var5++] = var479.field617;
                                class34.field750[var5++] = var479.field622;
                                class34.field747[var6++] = var479.field621;
                                class34.field750[var5++] = var479.field624;
                                class34.field750[var5++] = var479.field619;
                                class34.field747[var6++] = var479.field618;
                            }
                            continue;
                        }
                        if (var491 == 6507) {
                            var5 -= 4;
                            int var481 = class34.field750[var5];
                            boolean var482 = class34.field750[var5 + 1] == 1;
                            int var483 = class34.field750[var5 + 2];
                            boolean var484 = class34.field750[var5 + 3] == 1;
                            class24.method163(var481, var482, var483, var484);
                            continue;
                        }
                        if (var491 == 6511) {
                            var5--;
                            int var485 = class34.field750[var5];
                            if (var485 >= 0 && var485 < class24.field614) {
                                class24 var486 = field612[var485];
                                class34.field750[var5++] = var486.field617;
                                class34.field750[var5++] = var486.field622;
                                class34.field747[var6++] = var486.field621;
                                class34.field750[var5++] = var486.field624;
                                class34.field750[var5++] = var486.field619;
                                class34.field747[var6++] = var486.field618;
                                continue;
                            }
                            class34.field750[var5++] = -1;
                            class34.field750[var5++] = 0;
                            class34.field747[var6++] = "";
                            class34.field750[var5++] = 0;
                            class34.field750[var5++] = 0;
                            class34.field747[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var490) {
            StringBuilder var488 = new StringBuilder(30);
            var488.append("").append(var4.field3015).append(" ");
            for (int var489 = class34.field755 - 1; var489 >= 0; var489--) {
                var488.append("").append(class34.field756[var489].field201.field3015).append(" ");
            }
            var488.append("").append(var10);
            class140.method1(var488.toString(), var490);
        }
    }

    @ObfuscatedName("dx.k(Lde;II)V")
    public static void method2542(class111 arg0, int arg1) {
        class201 var2 = new class201();
        var2.field3023 = arg0.method2314();
        var2.field3029 = arg0.method2350();
        var2.field3022 = new int[var2.field3023];
        var2.field3025 = new int[var2.field3023];
        var2.field3026 = new Field[var2.field3023];
        var2.field3024 = new int[var2.field3023];
        var2.field3028 = new Method[var2.field3023];
        var2.field3027 = new byte[var2.field3023][][];
        for (int var3 = 0; var3 < var2.field3023; var3++) {
            try {
                int var4 = arg0.method2314();
                if (var4 == 0 || var4 == 1 || var4 == 2) {
                    String var5 = arg0.method2265();
                    String var6 = arg0.method2265();
                    int var7 = 0;
                    if (var4 == 1) {
                        var7 = arg0.method2350();
                    }
                    var2.field3022[var3] = var4;
                    var2.field3024[var3] = var7;
                    if (class202.method2893(var5).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3026[var3] = class202.method2893(var5).getDeclaredField(var6);
                } else if (var4 == 3 || var4 == 4) {
                    String var8 = arg0.method2265();
                    String var9 = arg0.method2265();
                    int var10 = arg0.method2314();
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = arg0.method2265();
                    }
                    String var13 = arg0.method2265();
                    byte[][] var14 = new byte[var10][];
                    if (var4 == 3) {
                        for (int var15 = 0; var15 < var10; var15++) {
                            int var16 = arg0.method2350();
                            var14[var15] = new byte[var16];
                            arg0.method2355(var14[var15], 0, var16);
                        }
                    }
                    var2.field3022[var3] = var4;
                    Class[] var17 = new Class[var10];
                    for (int var18 = 0; var18 < var10; var18++) {
                        var17[var18] = class202.method2893(var11[var18]);
                    }
                    Class var19 = class202.method2893(var13);
                    if (class202.method2893(var8).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    Method[] var20 = class202.method2893(var8).getDeclaredMethods();
                    Method[] var21 = var20;
                    for (int var22 = 0; var22 < var21.length; var22++) {
                        Method var23 = var21[var22];
                        if (var23.getName().equals(var9)) {
                            Class[] var24 = var23.getParameterTypes();
                            if (var17.length == var24.length) {
                                boolean var25 = true;
                                for (int var26 = 0; var26 < var17.length; var26++) {
                                    if (var17[var26] != var24[var26]) {
                                        var25 = false;
                                        break;
                                    }
                                }
                                if (var25 && var19 == var23.getReturnType()) {
                                    var2.field3028[var3] = var23;
                                }
                            }
                        }
                    }
                    var2.field3027[var3] = var14;
                }
            } catch (ClassNotFoundException var32) {
                var2.field3025[var3] = -1;
            } catch (SecurityException var33) {
                var2.field3025[var3] = -2;
            } catch (NullPointerException var34) {
                var2.field3025[var3] = -3;
            } catch (Exception var35) {
                var2.field3025[var3] = -4;
            } catch (Throwable var36) {
                var2.field3025[var3] = -5;
            }
        }
        class202.field3031.method3492(var2);
    }

    @ObfuscatedName("do.w(IIIZIZB)V")
    public static void method2411(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class24 var8 = field612[var6];
        field612[var6] = field612[arg1];
        field612[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (class24.method637(field612[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class24 var10 = field612[var9];
                field612[var9] = field612[var7];
                field612[var7++] = var10;
            }
        }
        field612[arg1] = field612[var7];
        field612[var7] = var8;
        method2411(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2411(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cx.w(I)V")
    public static void method1914() {
        try {
            File var0 = new File(field2839, "random.dat");
            if (var0.exists()) {
                class141.field2145 = new class219(new class218(var0, "rw", 25L), 24, 0);
            } else {
                label34: for (int var1 = 0; var1 < field3083.length; var1++) {
                    for (int var2 = 0; var2 < field2568.length; var2++) {
                        File var3 = new File(field2568[var2] + field3083[var1] + File.separatorChar + "random.dat");
                        if (var3.exists()) {
                            class141.field2145 = new class219(new class218(var3, "rw", 25L), 24, 0);
                            break label34;
                        }
                    }
                }
            }
            if (class141.field2145 == null) {
                RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
                int var5 = var4.read();
                var4.seek(0L);
                var4.write(var5);
                var4.seek(0L);
                var4.close();
                class141.field2145 = new class219(new class218(var0, "rw", 25L), 24, 0);
            }
        } catch (IOException var7) {
        }
    }

    @ObfuscatedName("p.w(Lhp;Lhp;Lhp;ZI)V")
    public static void method5(class215 arg0, class215 arg1, class215 arg2, boolean arg3) {
        if (arg3) {
            class30.field691 = (field594 - client.field399 * 765) / 2;
            class30.field697 = class30.field691 + 202;
        }
        if (class30.field690) {
            if (field2041 == null) {
                field2041 = class72.method520(field1843, "sl_back", "");
            }
            if (field3045 == null) {
                field3045 = class72.method582(field1843, "sl_flags", "");
            }
            if (field2807 == null) {
                field2807 = class72.method582(field1843, "sl_arrows", "");
            }
            if (field719 == null) {
                field719 = class72.method582(field1843, "sl_stars", "");
            }
            class75.method1532(class30.field691, 23, 765, 480, 0);
            class75.method1591(class30.field691, 0, 125, 23, 12425273, 9135624);
            class75.method1591(class30.field691 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3632(class148.field2261, class30.field691 + 62, 15, 0, -1);
            if (field719 != null) {
                field719[1].method1598(class30.field691 + 140, 1);
                arg1.method3622(class148.field2477, class30.field691 + 152, 10, 16777215, -1);
                field719[0].method1598(class30.field691 + 140, 12);
                arg1.method3622(class148.field2478, class30.field691 + 152, 21, 16777215, -1);
            }
            if (field2807 != null) {
                int var4 = class30.field691 + 280;
                if (class24.field613[0] == 0 && class24.field615[0] == 0) {
                    field2807[2].method1598(var4, 4);
                } else {
                    field2807[0].method1598(var4, 4);
                }
                if (class24.field613[0] == 0 && class24.field615[0] == 1) {
                    field2807[3].method1598(var4 + 15, 4);
                } else {
                    field2807[1].method1598(var4 + 15, 4);
                }
                arg0.method3622(class148.field2470, var4 + 32, 17, 16777215, -1);
                int var5 = class30.field691 + 390;
                if (class24.field613[0] == 1 && class24.field615[0] == 0) {
                    field2807[2].method1598(var5, 4);
                } else {
                    field2807[0].method1598(var5, 4);
                }
                if (class24.field613[0] == 1 && class24.field615[0] == 1) {
                    field2807[3].method1598(var5 + 15, 4);
                } else {
                    field2807[1].method1598(var5 + 15, 4);
                }
                arg0.method3622(class148.field2253, var5 + 32, 17, 16777215, -1);
                int var6 = class30.field691 + 500;
                if (class24.field613[0] == 2 && class24.field615[0] == 0) {
                    field2807[2].method1598(var6, 4);
                } else {
                    field2807[0].method1598(var6, 4);
                }
                if (class24.field613[0] == 2 && class24.field615[0] == 1) {
                    field2807[3].method1598(var6 + 15, 4);
                } else {
                    field2807[1].method1598(var6 + 15, 4);
                }
                arg0.method3622(class148.field2323, var6 + 32, 17, 16777215, -1);
                int var7 = class30.field691 + 610;
                if (class24.field613[0] == 3 && class24.field615[0] == 0) {
                    field2807[2].method1598(var7, 4);
                } else {
                    field2807[0].method1598(var7, 4);
                }
                if (class24.field613[0] == 3 && class24.field615[0] == 1) {
                    field2807[3].method1598(var7 + 15, 4);
                } else {
                    field2807[1].method1598(var7 + 15, 4);
                }
                arg0.method3622(class148.field2338, var7 + 32, 17, 16777215, -1);
            }
            class75.method1532(class30.field691 + 708, 4, 50, 16, 0);
            arg1.method3632(class148.field2449, class30.field691 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field338 & var9;
            for (int var11 = 0; var11 < class24.field614; var11++) {
                class24 var12 = field612[var11];
                if ((var12.field622 & var9) == var10 || (var12.field622 & var9) == 0) {
                    var8++;
                }
            }
            class30.field720 = -1;
            if (field2041 != null) {
                byte var13 = 88;
                byte var14 = 19;
                int var15 = 765 / (var13 + 1);
                int var16 = 480 / (var14 + 1);
                int var17;
                int var18;
                do {
                    var17 = var16;
                    var18 = var15;
                    if ((var15 - 1) * var16 >= var8) {
                        var15--;
                    }
                    if ((var16 - 1) * var15 >= var8) {
                        var16--;
                    }
                    if ((var16 - 1) * var15 >= var8) {
                        var16--;
                    }
                } while (var16 != var17 || var15 != var18);
                int var19 = (765 - var13 * var15) / (var15 + 1);
                if (var19 > 5) {
                    var19 = 5;
                }
                int var20 = (480 - var14 * var16) / (var16 + 1);
                if (var20 > 5) {
                    var20 = 5;
                }
                int var21 = (765 - var13 * var15 - (var15 - 1) * var19) / 2;
                int var22 = (480 - var14 * var16 - (var16 - 1) * var20) / 2;
                int var23 = var22 + 23;
                int var24 = class30.field691 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class24.field614; var27++) {
                    class24 var28 = field612[var27];
                    if ((var28.field622 & var9) == var10 || (var28.field622 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field619);
                        if (var28.field619 == -1) {
                            var30 = class148.field2483;
                            var29 = false;
                        } else if (var28.field619 > 1980) {
                            var30 = class148.field2484;
                            var29 = false;
                        }
                        byte var31;
                        if (var28.method526()) {
                            if (var28.method524()) {
                                var31 = 3;
                            } else {
                                var31 = 2;
                            }
                        } else if (var28.method524()) {
                            var31 = 1;
                        } else {
                            var31 = 0;
                        }
                        if (class132.field2050 >= var24 && class132.field2051 >= var23 && class132.field2050 < var13 + var24 && class132.field2051 < var14 + var23 && var29) {
                            class30.field720 = var27;
                            field2041[var31].method1459(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            field2041[var31].method1453(var24, var23);
                        }
                        if (field3045 != null) {
                            field3045[(var28.method524() ? 8 : 0) + var28.field624].method1598(var24 + 29, var23);
                        }
                        arg0.method3632(Integer.toString(var28.field617), var24 + 15, var14 / 2 + var23 + 5, 0, -1);
                        arg1.method3632(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
                        var23 += var14 + var20;
                        var25++;
                        if (var25 >= var16) {
                            var23 = var22 + 23;
                            var24 += var13 + var19;
                            var25 = 0;
                        }
                    }
                }
                if (var26) {
                    int var32 = arg1.method3657(field612[class30.field720].field621) + 6;
                    int var33 = arg1.field3093 + 8;
                    class75.method1532(class132.field2050 - var32 / 2, class132.field2051 + 20 + 5, var32, var33, 16777120);
                    class75.method1542(class132.field2050 - var32 / 2, class132.field2051 + 20 + 5, var32, var33, 0);
                    arg1.method3632(field612[class30.field720].field621, class132.field2050, class132.field2051 + 20 + 5 + arg1.field3093 + 4, 0, -1);
                }
            }
            try {
                Graphics var34 = field1618.getGraphics();
                field1489.method1383(var34, 0, 0);
            } catch (Exception var105) {
                field1618.repaint();
            }
            return;
        }
        if (arg3) {
            field1981.method1453(class30.field691, 0);
            field695.method1453(class30.field691 + 382, 0);
            field696.method1598(class30.field691 + 382 - field696.field1359 / 2, 18);
        }
        if (client.field460 == 0 || client.field460 == 5) {
            byte var36 = 20;
            arg0.method3632(class148.field2228, class30.field697 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class75.method1542(class30.field697 + 180 - 152, var37, 304, 34, 9179409);
            class75.method1542(class30.field697 + 180 - 151, var37 + 1, 302, 32, 0);
            class75.method1532(class30.field697 + 180 - 150, var37 + 2, class30.field709 * 3, 30, 9179409);
            class75.method1532(class30.field709 * 3 + (class30.field697 + 180 - 150), var37 + 2, 300 - class30.field709 * 3, 30, 0);
            arg0.method3632(class30.field706, class30.field697 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field460 == 20) {
            field713.method1598(class30.field697 + 180 - field713.field1359 / 2, 271 - field713.field1362 / 2);
            short var38 = 211;
            arg0.method3632(class30.field708, class30.field697 + 180, var38, 16776960, 0);
            int var107 = var38 + 15;
            arg0.method3632(class30.field712, class30.field697 + 180, var107, 16776960, 0);
            int var108 = var107 + 15;
            arg0.method3632(class30.field710, class30.field697 + 180, var108, 16776960, 0);
            int var109 = var108 + 15;
            int var110 = var109 + 10;
            if (class30.field723 != 4) {
                arg0.method3622(class148.field2442, class30.field697 + 180 - 110, var110, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = class30.field711; arg0.method3657(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method3622(class214.method3629(var40), class30.field697 + 180 - 70, var110, 16777215, 0);
                var107 = var110 + 15;
                arg0.method3622(class148.field2406 + class154.method144(class30.field707), class30.field697 + 180 - 108, var107, 16777215, 0);
                var107 += 15;
            }
        }
        if (client.field460 == 10 || client.field460 == 11) {
            field713.method1598(class30.field697, 171);
            if (class30.field723 == 0) {
                short var41 = 251;
                arg0.method3632(class148.field2277, class30.field697 + 180, var41, 16776960, 0);
                int var111 = var41 + 30;
                int var42 = class30.field697 + 180 - 80;
                short var43 = 291;
                field693.method1598(var42 - 73, var43 - 20);
                arg0.method3637(class148.field2411, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = class30.field697 + 180 + 80;
                field693.method1598(var44 - 73, var43 - 20);
                arg0.method3637(class148.field2367, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class30.field723 == 1) {
                arg0.method3632(class148.field2427, class30.field697 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3632(class30.field708, class30.field697 + 180, var45, 16777215, 0);
                int var112 = var45 + 15;
                arg0.method3632(class30.field712, class30.field697 + 180, var112, 16777215, 0);
                int var113 = var112 + 15;
                arg0.method3632(class30.field710, class30.field697 + 180, var113, 16777215, 0);
                int var114 = var113 + 15;
                int var46 = class30.field697 + 180 - 80;
                short var47 = 321;
                field693.method1598(var46 - 73, var47 - 20);
                arg0.method3632(class148.field2218, var46, var47 + 5, 16777215, 0);
                int var48 = class30.field697 + 180 + 80;
                field693.method1598(var48 - 73, var47 - 20);
                arg0.method3632(class148.field2449, var48, var47 + 5, 16777215, 0);
            } else if (class30.field723 == 2) {
                short var49 = 211;
                arg0.method3632(class30.field708, class30.field697 + 180, var49, 16776960, 0);
                int var115 = var49 + 15;
                arg0.method3632(class30.field712, class30.field697 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg0.method3632(class30.field710, class30.field697 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var118 = var117 + 10;
                arg0.method3622(class148.field2442, class30.field697 + 180 - 110, var118, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = class30.field711; arg0.method3657(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3622(class214.method3629(var51) + (class30.field715 == 0 & client.field267 % 40 < 20 ? class2.method735(16776960) + class2.field21 : ""), class30.field697 + 180 - 70, var118, 16777215, 0);
                var115 = var118 + 15;
                arg0.method3622(class148.field2406 + class154.method144(class30.field707) + (class30.field715 == 1 & client.field267 % 40 < 20 ? class2.method735(16776960) + class2.field21 : ""), class30.field697 + 180 - 108, var115, 16777215, 0);
                var115 += 15;
                int var52 = class30.field697 + 180 - 80;
                short var53 = 321;
                field693.method1598(var52 - 73, var53 - 20);
                arg0.method3632(class148.field2448, var52, var53 + 5, 16777215, 0);
                int var54 = class30.field697 + 180 + 80;
                field693.method1598(var54 - 73, var53 - 20);
                arg0.method3632(class148.field2449, var54, var53 + 5, 16777215, 0);
                short var55 = 357;
                arg1.method3632(class148.field2464, class30.field697 + 180, var55, 16776960, 0);
            } else if (class30.field723 == 4) {
                arg0.method3632(class148.field2437, class30.field697 + 180, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3632(class30.field708, class30.field697 + 180, var56, 16777215, 0);
                int var119 = var56 + 15;
                arg0.method3632(class30.field712, class30.field697 + 180, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method3632(class30.field710, class30.field697 + 180, var120, 16777215, 0);
                int var121 = var120 + 15;
                arg0.method3622(class148.field2444 + class154.method144(field64) + (client.field267 % 40 < 20 ? class2.method735(16776960) + class2.field21 : ""), class30.field697 + 180 - 108, var121, 16777215, 0);
                int var122 = var121 - 8;
                arg0.method3622(class148.field2220, class30.field697 + 180 - 9, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3622(class148.field2221, class30.field697 + 180 - 9, var123, 16776960, 0);
                int var57 = class30.field697 + 180 - 9 + arg0.method3657(class148.field2221) + 15;
                int var58 = var123 - arg0.field3093;
                class76 var59;
                if (class30.field714) {
                    var59 = field1291;
                } else {
                    var59 = field2789;
                }
                var59.method1598(var57, var58);
                var119 = var123 + 15;
                int var60 = class30.field697 + 180 - 80;
                short var61 = 321;
                field693.method1598(var60 - 73, var61 - 20);
                arg0.method3632(class148.field2218, var60, var61 + 5, 16777215, 0);
                int var62 = class30.field697 + 180 + 80;
                field693.method1598(var62 - 73, var61 - 20);
                arg0.method3632(class148.field2449, var62, var61 + 5, 16777215, 0);
                arg1.method3632(class148.field2438, class30.field697 + 180, var61 + 36, 255, 0);
            } else if (class30.field723 == 5) {
                arg0.method3632(class148.field2451, class30.field697 + 180, 201, 16776960, 0);
                short var63 = 221;
                arg2.method3632(class30.field708, class30.field697 + 180, var63, 16776960, 0);
                int var124 = var63 + 15;
                arg2.method3632(class30.field712, class30.field697 + 180, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg2.method3632(class30.field710, class30.field697 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                int var127 = var126 + 14;
                arg0.method3622(class148.field2226, class30.field697 + 180 - 145, var127, 16777215, 0);
                short var64 = 174;
                String var65;
                for (var65 = class30.field711; arg0.method3657(var65) > var64; var65 = var65.substring(1)) {
                }
                arg0.method3622(class214.method3629(var65) + (client.field267 % 40 < 20 ? class2.method735(16776960) + class2.field21 : ""), class30.field697 + 180 - 34, var127, 16777215, 0);
                var124 = var127 + 15;
                int var66 = class30.field697 + 180 - 80;
                short var67 = 321;
                field693.method1598(var66 - 73, var67 - 20);
                arg0.method3632(class148.field2453, var66, var67 + 5, 16777215, 0);
                int var68 = class30.field697 + 180 + 80;
                field693.method1598(var68 - 73, var67 - 20);
                arg0.method3632(class148.field2446, var68, var67 + 5, 16777215, 0);
            } else if (class30.field723 == 6) {
                short var69 = 211;
                arg0.method3632(class30.field708, class30.field697 + 180, var69, 16776960, 0);
                int var128 = var69 + 15;
                arg0.method3632(class30.field712, class30.field697 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg0.method3632(class30.field710, class30.field697 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var70 = class30.field697 + 180;
                short var71 = 321;
                field693.method1598(var70 - 73, var71 - 20);
                arg0.method3632(class148.field2446, var70, var71 + 5, 16777215, 0);
            }
        }
        if (class30.field703 > 0) {
            int var72 = class30.field703;
            short var73 = 256;
            class30.field701 += var72 * 128;
            if (class30.field701 > field1305.length) {
                class30.field701 -= field1305.length;
                int var74 = (int) (Math.random() * 12.0D);
                class30.method2018(field694[var74]);
            }
            int var75 = 0;
            int var76 = var72 * 128;
            int var77 = (var73 - var72) * 128;
            for (int var78 = 0; var78 < var77; var78++) {
                int var79 = field74[var75 + var76] - field1305[class30.field701 + var75 & field1305.length - 1] * var72 / 6;
                if (var79 < 0) {
                    var79 = 0;
                }
                field74[var75++] = var79;
            }
            for (int var80 = var73 - var72; var80 < var73; var80++) {
                int var81 = var80 * 128;
                for (int var82 = 0; var82 < 128; var82++) {
                    int var83 = (int) (Math.random() * 100.0D);
                    if (var83 < 50 && var82 > 10 && var82 < 118) {
                        field74[var81 + var82] = 255;
                    } else {
                        field74[var81 + var82] = 0;
                    }
                }
            }
            if (class30.field699 > 0) {
                class30.field699 -= var72 * 4;
            }
            if (class30.field704 > 0) {
                class30.field704 -= var72 * 4;
            }
            if (class30.field699 == 0 && class30.field704 == 0) {
                int var84 = (int) (Math.random() * (double) (2000 / var72));
                if (var84 == 0) {
                    class30.field699 = 1024;
                }
                if (var84 == 1) {
                    class30.field704 = 1024;
                }
            }
            for (int var85 = 0; var85 < var73 - var72; var85++) {
                class30.field698[var85] = class30.field698[var72 + var85];
            }
            for (int var86 = var73 - var72; var86 < var73; var86++) {
                class30.field698[var86] = (int) (Math.sin((double) class30.field700 / 14.0D) * 16.0D + Math.sin((double) class30.field700 / 15.0D) * 14.0D + Math.sin((double) class30.field700 / 16.0D) * 12.0D);
                class30.field700++;
            }
            class30.field702 += var72 * -558048053;
            int var87 = ((client.field267 & 0x1) + var72) / 2;
            if (var87 > 0) {
                for (int var88 = 0; var88 < class30.field702 * 298186924; var88++) {
                    int var89 = (int) (Math.random() * 124.0D) + 2;
                    int var90 = (int) (Math.random() * 128.0D) + 128;
                    field74[(var90 << 7) + var89] = 192;
                }
                class30.field702 = 0;
                int var91 = 0;
                label440: while (true) {
                    if (var91 >= var73) {
                        int var95 = 0;
                        while (true) {
                            if (var95 >= 128) {
                                break label440;
                            }
                            int var96 = 0;
                            for (int var97 = -var87; var97 < var73; var97++) {
                                int var98 = var97 * 128;
                                if (var87 + var97 < var73) {
                                    var96 += field186[var87 * 128 + var95 + var98];
                                }
                                if (var97 - (var87 + 1) >= 0) {
                                    var96 -= field186[var95 + var98 - (var87 + 1) * 128];
                                }
                                if (var97 >= 0) {
                                    field74[var95 + var98] = var96 / (var87 * 2 + 1);
                                }
                            }
                            var95++;
                        }
                    }
                    int var92 = 0;
                    int var93 = var91 * 128;
                    for (int var94 = -var87; var94 < 128; var94++) {
                        if (var87 + var94 < 128) {
                            var92 += field74[var93 + var94 + var87];
                        }
                        if (var94 - (var87 + 1) >= 0) {
                            var92 -= field74[var93 + var94 - (var87 + 1)];
                        }
                        if (var94 >= 0) {
                            field186[var93 + var94] = var92 / (var87 * 2 + 1);
                        }
                    }
                    var91++;
                }
            }
            class30.field703 = 0;
        }
        class30.method754();
        field155[field71.field132 ? 1 : 0].method1598(class30.field691 + 765 - 40, 463);
        if (client.field460 > 5 && client.field264 == 0) {
            if (field1873 == null) {
                field1873 = class72.method494(field1843, "sl_button", "");
            } else {
                int var99 = class30.field691 + 5;
                short var100 = 463;
                byte var101 = 100;
                byte var102 = 35;
                field1873.method1598(var99, var100);
                arg0.method3632(class148.field2378 + " " + client.field256, var101 / 2 + var99, var102 / 2 + var100 - 2, 16777215, 0);
                if (field163 == null) {
                    arg1.method3632(class148.field2300, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
                } else {
                    arg1.method3632(class148.field2404, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var103 = field1618.getGraphics();
            field1489.method1383(var103, 0, 0);
        } catch (Exception var106) {
            field1618.repaint();
        }
    }

    @ObfuscatedName("i.x(III)I")
    public static final int method177(int arg0, int arg1) {
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

    @ObfuscatedName("ds.y(I)V")
    public static final void method2465() {
        if (field1622 != null) {
            field1622.method2643();
            field1622 = null;
        }
        client.method31();
        field189.method1744();
        for (int var0 = 0; var0 < 4; var0++) {
            client.field531[var0].method3757();
        }
        System.gc();
        class174.field2858 = 1;
        field1852 = null;
        field2823 = -1;
        field2544 = -1;
        field1851 = 0;
        field187 = false;
        field1486 = 2;
        client.field300 = -1;
        client.field501 = false;
        class22.method930();
        client.method521(10);
    }

    @ObfuscatedName("o.z(II)V")
    public static void method152(int arg0) {
        if (arg0 == -1 && !client.field501) {
            class174.method481();
        } else if (arg0 != -1 && client.field300 != arg0 && client.field499 != 0 && !client.field501) {
            class174.method2516(2, field536, arg0, 0, client.field499, false);
        }
        client.field300 = arg0;
    }

    @ObfuscatedName("fw.bk(I)V")
    public static void method3100() {
        if (!client.field415) {
            return;
        }
        class164 var0 = class164.method131(field140, client.field416);
        if (var0 != null && var0.field2742 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field8 = var0.field2742;
            class34.method2786(var1);
        }
        client.field415 = false;
        client.method2521(var0);
    }

    @ObfuscatedName("i.cu(B)V")
    public static void method175() {
        for (int var0 = 0; var0 < client.field402; var0++) {
            int var1 = client.field405[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < client.field402 - 1) {
                    for (int var3 = var0; var3 < client.field402 - 1; var3++) {
                        client.field407[var3] = client.field407[var3 + 1];
                        client.field408[var3] = client.field408[var3 + 1];
                        client.field405[var3] = client.field405[var3 + 1];
                        client.field406[var3] = client.field406[var3 + 1];
                        client.field394[var3] = client.field394[var3 + 1];
                        client.field404[var3] = client.field404[var3 + 1];
                    }
                }
                client.field402--;
            }
        }
    }

    @ObfuscatedName("ag.cq(Lfh;IIIIIIS)V")
    public static final void method578(class164 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (client.field340) {
            client.field341 = 32;
        } else {
            client.field341 = 0;
        }
        client.field340 = false;
        if (class132.field2049 == 1 || !field2048 && class132.field2049 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2674 -= 4;
                client.method2521(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2674 += 4;
                client.method2521(arg0);
            } else if (arg5 >= arg1 - client.field341 && arg5 < client.field341 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2674 = (arg4 - arg3) * var8 / var9;
                client.method2521(arg0);
                client.field340 = true;
            }
        }
        if (client.field503 == 0) {
            return;
        }
        int var10 = arg0.field2667;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2674 += client.field503 * 45;
            client.method2521(arg0);
        }
    }

    @ObfuscatedName("aq.ch(Lfh;II)I")
    public static final int method624(class164 arg0, int arg1) {
        if (arg0.field2762 == null || arg1 >= arg0.field2762.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2762[arg1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;
            while (true) {
                int var6 = var2[var4++];
                int var7 = 0;
                byte var8 = 0;
                if (var6 == 0) {
                    return var3;
                }
                if (var6 == 1) {
                    var7 = client.field397[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = client.field398[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = client.field379[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class164 var11 = class164.method6(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class47.method2450(var12).field1069 || client.field262)) {
                        for (int var13 = 0; var13 < var11.field2695.length; var13++) {
                            if (var12 + 1 == var11.field2695[var13]) {
                                var7 += var11.field2769[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class167.field2804[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class146.field2199[client.field398[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class167.field2804[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = field734.field35;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class146.field2196[var14]) {
                            var7 += client.field398[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class164 var17 = class164.method6(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class47.method2450(var18).field1069 || client.field262)) {
                        for (int var19 = 0; var19 < var17.field2695.length; var19++) {
                            if (var18 + 1 == var17.field2695[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = client.field425;
                }
                if (var6 == 12) {
                    var7 = client.field426;
                }
                if (var6 == 13) {
                    int var20 = class167.field2804[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class167.method2494(var22);
                }
                if (var6 == 15) {
                    var8 = 1;
                }
                if (var6 == 16) {
                    var8 = 2;
                }
                if (var6 == 17) {
                    var8 = 3;
                }
                if (var6 == 18) {
                    var7 = (field734.field773 >> 7) + field193;
                }
                if (var6 == 19) {
                    var7 = (field734.field775 >> 7) + field948;
                }
                if (var6 == 20) {
                    var7 = var2[var4++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var3 += var7;
                    }
                    if (var5 == 1) {
                        var3 -= var7;
                    }
                    if (var5 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var5 == 3) {
                        var3 *= var7;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @ObfuscatedName("ay.dz(Ljava/lang/String;ZI)Z")
    public static boolean method849(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class155.method65(arg0, field261);
        for (int var3 = 0; var3 < client.field446; var3++) {
            if (var2.equalsIgnoreCase(class155.method65(client.field393[var3].field238, field261)) && (!arg1 || client.field393[var3].field236 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class155.method65(field734.field39, field261))) {
            return true;
        } else {
            return false;
        }
    }
}
