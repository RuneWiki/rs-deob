package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Statics {

    @ObfuscatedName("ag.y")
    public static class147 field1003;

    @ObfuscatedName("ag.s")
    public static boolean field1013;

    @ObfuscatedName("ag.k")
    public static class147 field1022;

    @ObfuscatedName("af.y")
    public static int field1037;

    @ObfuscatedName("af.k")
    public static class147 field1038;

    @ObfuscatedName("af.l")
    public static class66 field1040;

    @ObfuscatedName("af.pg")
    public static Image field1043;

    @ObfuscatedName("af.aq")
    public static class148 field1044;

    @ObfuscatedName("ah.k")
    public static class47 field1047;

    @ObfuscatedName("ax.g")
    public static boolean field1053;

    @ObfuscatedName("ax.bo")
    public static class148 field1071;

    @ObfuscatedName("ax.s")
    public static int field1074;

    @ObfuscatedName("bm.ax")
    public static class74[] field1095;

    @ObfuscatedName("bm.n")
    public static boolean field1097;

    @ObfuscatedName("bm.ip")
    public static class27 field1100;

    @ObfuscatedName("bk.u")
    public static float field1121;

    @ObfuscatedName("bk.j")
    public static int field1122;

    @ObfuscatedName("e.nl")
    public static int field115;

    @ObfuscatedName("bj.c")
    public static int[] field1155;

    @ObfuscatedName("bj.d")
    public static int[] field1156;

    @ObfuscatedName("bj.v")
    public static boolean[] field1157;

    @ObfuscatedName("u.kl")
    public static int field116;

    @ObfuscatedName("be.a")
    public static class62[] field1166;

    @ObfuscatedName("be.m")
    public static float[] field1168;

    @ObfuscatedName("u.b")
    public static String field117;

    @ObfuscatedName("be.e")
    public static byte[] field1172;

    @ObfuscatedName("be.u")
    public static int field1173;

    @ObfuscatedName("be.ab")
    public static float[] field1174;

    @ObfuscatedName("be.t")
    public static boolean[] field1175;

    @ObfuscatedName("be.d")
    public static int field1176;

    @ObfuscatedName("be.v")
    public static class67[] field1177;

    @ObfuscatedName("be.n")
    public static class61[] field1178;

    @ObfuscatedName("be.c")
    public static int field1182;

    @ObfuscatedName("be.j")
    public static int field1184;

    @ObfuscatedName("be.q")
    public static float[] field1188;

    @ObfuscatedName("be.o")
    public static float[] field1189;

    @ObfuscatedName("be.aw")
    public static int[] field1190;

    @ObfuscatedName("be.p")
    public static int[] field1191;

    @ObfuscatedName("be.f")
    public static float[] field1192;

    @ObfuscatedName("be.al")
    public static float[] field1193;

    @ObfuscatedName("be.an")
    public static float[] field1194;

    @ObfuscatedName("be.z")
    public static class54[] field1195;

    @ObfuscatedName("be.ar")
    public static int[] field1196;

    @ObfuscatedName("u.dw")
    public static int[] field121;

    @ObfuscatedName("u.j")
    public static class140 field122;

    @ObfuscatedName("u.bd")
    public static class148 field123;

    @ObfuscatedName("bv.mw")
    public static class50 field1233;

    @ObfuscatedName("ba.pz")
    public static int field1248;

    @ObfuscatedName("by.ad")
    public static class74[] field1250;

    @ObfuscatedName("by.ib")
    public static int field1251;

    @ObfuscatedName("by.ed")
    public static class72[] field1252;

    @ObfuscatedName("by.ax")
    public static class148 field1253;

    @ObfuscatedName("by.v")
    public static int[] field1254;

    @ObfuscatedName("bq.y")
    public static int field1259;

    @ObfuscatedName("u.ev")
    public static class72[] field126;

    @ObfuscatedName("bq.cb")
    public static int field1260;

    @ObfuscatedName("bq.g")
    public static int[] field1261;

    @ObfuscatedName("bq.e")
    public static int[] field1263;

    @ObfuscatedName("bq.j")
    public static byte[][] field1264;

    @ObfuscatedName("bq.k")
    public static int field1265;

    @ObfuscatedName("bq.u")
    public static int[] field1266;

    @ObfuscatedName("bq.l")
    public static int[] field1269;

    @ObfuscatedName("u.kz")
    public static int field127;

    @ObfuscatedName("bi.nc")
    public static int field1273;

    @ObfuscatedName("bt.z")
    public static int field1294;

    @ObfuscatedName("bt.a")
    public static int field1295;

    @ObfuscatedName("bt.n")
    public static int[] field1298;

    @ObfuscatedName("j.y")
    public static class147 field132;

    @ObfuscatedName("bh.a")
    public static int[] field1323;

    @ObfuscatedName("bu.ee")
    public static class72[] field1329;

    @ObfuscatedName("cz.w")
    public static int field1345;

    @ObfuscatedName("c.m")
    public static int[] field135;

    @ObfuscatedName("cz.i")
    public static int field1350;

    @ObfuscatedName("cz.r")
    public static int field1351;

    @ObfuscatedName("cz.x")
    public static int field1354;

    @ObfuscatedName("cz.q")
    public static int field1355;

    @ObfuscatedName("cz.m")
    public static int field1357;

    @ObfuscatedName("cz.bk")
    public static boolean[][] field1358;

    @ObfuscatedName("cz.al")
    public static int field1360;

    @ObfuscatedName("cz.an")
    public static int field1361;

    @ObfuscatedName("cz.b")
    public static int field1363;

    @ObfuscatedName("cz.f")
    public static int field1365;

    @ObfuscatedName("cz.ar")
    public static int field1366;

    @ObfuscatedName("cz.aw")
    public static int field1371;

    @ObfuscatedName("cz.bl")
    public static int field1372;

    @ObfuscatedName("cz.ab")
    public static int field1378;

    @ObfuscatedName("cz.o")
    public static int field1389;

    @ObfuscatedName("c.u")
    public static int field139;

    @ObfuscatedName("cz.br")
    public static int field1390;

    @ObfuscatedName("cz.bd")
    public static int field1391;

    @ObfuscatedName("cz.bj")
    public static int field1393;

    @ObfuscatedName("cz.bn")
    public static int field1394;

    @ObfuscatedName("cz.bs")
    public static int field1395;

    @ObfuscatedName("cv.br")
    public static class148 field1405;

    @ObfuscatedName("cn.ng")
    public static int field1428;

    @ObfuscatedName("cd.m")
    public static int field1436;

    @ObfuscatedName("cd.d")
    public static int field1443;

    @ObfuscatedName("cd.v")
    public static int field1444;

    @ObfuscatedName("cd.b")
    public static int field1445;

    @ObfuscatedName("cd.q")
    public static int field1446;

    @ObfuscatedName("cd.x")
    public static int field1447;

    @ObfuscatedName("cd.o")
    public static int field1449;

    @ObfuscatedName("c.bf")
    public static FontMetrics field145;

    @ObfuscatedName("cd.al")
    public static class85 field1453;

    @ObfuscatedName("cd.w")
    public static int field1456;

    @ObfuscatedName("d.dr")
    public static int field146;

    @ObfuscatedName("cs.fa")
    public static int field1468;

    @ObfuscatedName("cr.au")
    public static class133 field1490;

    @ObfuscatedName("ci.oa")
    public static Clipboard field1529;

    @ObfuscatedName("d.lt")
    public static byte field155;

    @ObfuscatedName("ci.bm")
    public static class148 field1550;

    @ObfuscatedName("co.cw")
    public static int field1557;

    @ObfuscatedName("co.ex")
    public static class72[] field1559;

    @ObfuscatedName("co.j")
    public static class74 field1560;

    @ObfuscatedName("co.dn")
    public static class79 field1562;

    @ObfuscatedName("cu.em")
    public static int[] field1637;

    @ObfuscatedName("cu.pu")
    public static Frame field1639;

    @ObfuscatedName("v.in")
    public static int field164;

    @ObfuscatedName("cc.iw")
    public static class153 field1649;

    @ObfuscatedName("v.fo")
    public static int field165;

    @ObfuscatedName("cc.nz")
    public static int field1654;

    @ObfuscatedName("cq.oy")
    public static class120 field1678;

    @ObfuscatedName("v.t")
    public static class107 field169;

    @ObfuscatedName("ck.bm")
    public static int field1732;

    @ObfuscatedName("ck.bg")
    public static int field1733;

    @ObfuscatedName("ck.bf")
    public static int field1734;

    @ObfuscatedName("n.ms")
    public static class21[] field174;

    @ObfuscatedName("cw.by")
    public static String field1747;

    @ObfuscatedName("cw.ah")
    public static class17 field1748;

    @ObfuscatedName("cw.ov")
    public static class123 field1752;

    @ObfuscatedName("cw.aq")
    public static class72[] field1753;

    @ObfuscatedName("cw.o")
    public static int[] field1754;

    @ObfuscatedName("cw.cc")
    public static class194 field1755;

    @ObfuscatedName("n.w")
    public static int[] field177;

    @ObfuscatedName("cj.m")
    public static int[] field1798;

    @ObfuscatedName("cm.cr")
    public static char field1805;

    @ObfuscatedName("cm.j")
    public static int field1807;

    @ObfuscatedName("n.fe")
    public static int field181;

    @ObfuscatedName("cb.q")
    public static int[] field1812;

    @ObfuscatedName("cb.ey")
    public static class72[] field1813;

    @ObfuscatedName("cb.y")
    public static long field1819;

    @ObfuscatedName("cb.k")
    public static long field1821;

    @ObfuscatedName("cx.u")
    public static class74[] field1822;

    @ObfuscatedName("cx.ad")
    public static class148 field1823;

    @ObfuscatedName("cx.s")
    public static int field1824;

    @ObfuscatedName("z.nq")
    public static int field185;

    @ObfuscatedName("ds.cm")
    public static int field1855;

    @ObfuscatedName("ds.mj")
    public static int field1856;

    @ObfuscatedName("dw.hc")
    public static int field1857;

    @ObfuscatedName("dw.pv")
    public static int field1861;

    @ObfuscatedName("dw.nu")
    public static int field1866;

    @ObfuscatedName("dj.iv")
    public static int field1878;

    @ObfuscatedName("dj.pw")
    public static Font field1880;

    @ObfuscatedName("dl.ld")
    public static class117 field1884;

    @ObfuscatedName("dm.y")
    public static class74 field1888;

    @ObfuscatedName("dz.ej")
    public static class72 field1900;

    @ObfuscatedName("dp.d")
    public static boolean field1904;

    @ObfuscatedName("dp.mb")
    public static class72 field1907;

    @ObfuscatedName("dr.fg")
    public static int field1909;

    @ObfuscatedName("dr.pb")
    public static int field1910;

    @ObfuscatedName("dr.fh")
    public static int field1912;

    @ObfuscatedName("dt.av")
    public static int field1919;

    @ObfuscatedName("z.eo")
    public static class72[] field192;

    @ObfuscatedName("dc.cl")
    public static int field1922;

    @ObfuscatedName("dc.nh")
    public static int field1926;

    @ObfuscatedName("dc.y")
    public static File field1930;

    @ObfuscatedName("dc.cz")
    public static class133 field1931;

    @ObfuscatedName("do.cv")
    public static class130 field1933;

    @ObfuscatedName("do.y")
    public static String field1934;

    @ObfuscatedName("do.k")
    public static String field1935;

    @ObfuscatedName("do.pe")
    public static int field1940;

    @ObfuscatedName("do.dj")
    public static int[][] field1943;

    @ObfuscatedName("do.bq")
    public static int field1944;

    @ObfuscatedName("dq.z")
    public static int[] field1982;

    @ObfuscatedName("dq.eq")
    public static int[] field1989;

    @ObfuscatedName("dg.s")
    public static boolean[] field1993;

    @ObfuscatedName("dg.bl")
    public static class148 field1999;

    @ObfuscatedName("df.bj")
    public static class148 field2005;

    @ObfuscatedName("dv.e")
    public static short[] field2022;

    @ObfuscatedName("dd.r")
    public static int[] field2030;

    @ObfuscatedName("a.bb")
    public static int field204;

    @ObfuscatedName("dk.d")
    public static class153 field2041;

    @ObfuscatedName("er.k")
    public static Applet field2079;

    @ObfuscatedName("a.pr")
    public static Canvas field208;

    @ObfuscatedName("er.s")
    public static int field2080;

    @ObfuscatedName("er.y")
    public static String field2088;

    @ObfuscatedName("eb.g")
    public static File field2091;

    @ObfuscatedName("eb.t")
    public static String[] field2101;

    @ObfuscatedName("eb.p")
    public static String[] field2102;

    @ObfuscatedName("eb.h")
    public static File field2103;

    @ObfuscatedName("eb.ju")
    public static int field2104;

    @ObfuscatedName("eb.er")
    public static class72 field2105;

    @ObfuscatedName("eb.nw")
    public static class68 field2107;

    @ObfuscatedName("eb.l")
    public static int field2108;

    @ObfuscatedName("eg.hj")
    public static int field2116;

    @ObfuscatedName("ec.ah")
    public static class148 field2136;

    @ObfuscatedName("ed.mh")
    public static class49 field2152;

    @ObfuscatedName("ey.r")
    public static class12 field2156;

    @ObfuscatedName("t.a")
    public static int field216;

    @ObfuscatedName("ey.af")
    public static long field2163;

    @ObfuscatedName("t.en")
    public static class74[] field219;

    @ObfuscatedName("t.pl")
    public static boolean field221;

    @ObfuscatedName("p.ho")
    public static int field224;

    @ObfuscatedName("p.n")
    public static class53 field235;

    @ObfuscatedName("p.od")
    public static class146 field236;

    @ObfuscatedName("y.gq")
    public static class153 field24;

    @ObfuscatedName("ex.y")
    public static class147 field2413;

    @ObfuscatedName("client.e")
    public static class139 field243;

    @ObfuscatedName("en.pj")
    public static class71 field2431;

    @ObfuscatedName("eq.n")
    public static int[] field2496;

    @ObfuscatedName("eq.bs")
    public static class148 field2498;

    @ObfuscatedName("eu.x")
    public static String field2503;

    @ObfuscatedName("eu.iz")
    public static int field2506;

    @ObfuscatedName("ew.s")
    public static long field2509;

    @ObfuscatedName("ew.k")
    public static class130 field2513;

    @ObfuscatedName("ew.dm")
    public static byte[][] field2527;

    @ObfuscatedName("ep.h")
    public static class147 field2534;

    @ObfuscatedName("ep.k")
    public static class153[][] field2535;

    @ObfuscatedName("ep.l")
    public static class147 field2542;

    @ObfuscatedName("ep.g")
    public static class147 field2593;

    @ObfuscatedName("y.aa")
    public static class148 field26;

    @ObfuscatedName("ek.ma")
    public static byte field2673;

    @ObfuscatedName("ek.or")
    public static class9 field2674;

    @ObfuscatedName("el.h")
    public static int[] field2677;

    @ObfuscatedName("el.y")
    public static class147 field2678;

    @ObfuscatedName("fb.v")
    public static class159 field2680;

    @ObfuscatedName("fy.j")
    public static short[] field2681;

    @ObfuscatedName("fy.c")
    public static short[][] field2686;

    @ObfuscatedName("fy.u")
    public static short[][] field2687;

    @ObfuscatedName("y.bm")
    public static class74 field27;

    @ObfuscatedName("fe.oz")
    public static int field2703;

    @ObfuscatedName("fh.e")
    public static int field2718;

    @ObfuscatedName("fh.s")
    public static class147 field2719;

    @ObfuscatedName("client.am")
    public static class148 field272;

    @ObfuscatedName("fh.g")
    public static class163 field2720;

    @ObfuscatedName("fh.c")
    public static int field2724;

    @ObfuscatedName("fh.l")
    public static class147 field2725;

    @ObfuscatedName("fh.k")
    public static class147 field2726;

    @ObfuscatedName("fn.ei")
    public static class74 field2769;

    @ObfuscatedName("fr.f")
    public static int[] field2793;

    @ObfuscatedName("fc.eg")
    public static class72[] field2828;

    @ObfuscatedName("fa.bn")
    public static class148 field2839;

    @ObfuscatedName("gl.k")
    public static class102 field2907;

    @ObfuscatedName("gc.c")
    public static class74[] field2918;

    @ObfuscatedName("gm.y")
    public static class147 field2964;

    @ObfuscatedName("gz.bi")
    public static int field2968;

    @ObfuscatedName("gs.y")
    public static class147 field2971;

    @ObfuscatedName("gs.w")
    public static String field2973;

    @ObfuscatedName("go.k")
    public static class147 field2974;

    @ObfuscatedName("go.s")
    public static int[] field2976;

    @ObfuscatedName("client.fy")
    public static int field323;

    @ObfuscatedName("client.z")
    public static String field336;

    @ObfuscatedName("client.cp")
    public static class130 field392;

    @ObfuscatedName("client.kc")
    public static int field426;

    @ObfuscatedName("s.ew")
    public static int[] field48;

    @ObfuscatedName("client.s")
    public static client field480;

    @ObfuscatedName("k.ea")
    public static class74[] field5;

    @ObfuscatedName("client.iu")
    public static class153 field500;

    @ObfuscatedName("i.ct")
    public static class194 field503;

    @ObfuscatedName("i.w")
    public static class107 field509;

    @ObfuscatedName("i.ix")
    public static int field513;

    @ObfuscatedName("r.ky")
    public static class118 field527;

    @ObfuscatedName("w.bf")
    public static class22[] field546;

    @ObfuscatedName("g.bg")
    public static class148 field55;

    @ObfuscatedName("b.cj")
    public static int field551;

    @ObfuscatedName("x.fc")
    public static int field567;

    @ObfuscatedName("x.a")
    public static int[][][] field568;

    @ObfuscatedName("x.eb")
    public static class74[] field572;

    @ObfuscatedName("q.hs")
    public static class3 field590;

    @ObfuscatedName("h.ec")
    public static class72[] field60;

    @ObfuscatedName("m.ae")
    public static class133 field601;

    @ObfuscatedName("m.iq")
    public static int field603;

    @ObfuscatedName("h.v")
    public static class153 field61;

    @ObfuscatedName("ab.bk")
    public static class148 field625;

    @ObfuscatedName("al.l")
    public static class72 field632;

    @ObfuscatedName("al.s")
    public static class74 field633;

    @ObfuscatedName("al.g")
    public static class74[] field634;

    @ObfuscatedName("al.h")
    public static class72 field635;

    @ObfuscatedName("al.c")
    public static class74 field638;

    @ObfuscatedName("al.p")
    public static int[] field643;

    @ObfuscatedName("al.cu")
    public static class194 field654;

    @ObfuscatedName("al.ak")
    public static String field659;

    @ObfuscatedName("l.l")
    public static byte[][][] field66;

    @ObfuscatedName("al.k")
    public static boolean field661;

    @ObfuscatedName("al.e")
    public static class74 field667;

    @ObfuscatedName("al.pi")
    public static String field671;

    @ObfuscatedName("l.h")
    public static byte[][][] field68;

    @ObfuscatedName("an.d")
    public static int[] field681;

    @ObfuscatedName("an.nj")
    public static int field682;

    @ObfuscatedName("an.e")
    public static byte[][][] field685;

    @ObfuscatedName("aw.h")
    public static int field686;

    @ObfuscatedName("ar.os")
    public static class121 field696;

    @ObfuscatedName("ar.ac")
    public static boolean field697;

    @ObfuscatedName("ar.dh")
    public static int field698;

    @ObfuscatedName("l.j")
    public static int[][] field70;

    @ObfuscatedName("ai.g")
    public static String[] field703;

    @ObfuscatedName("l.c")
    public static int[] field71;

    @ObfuscatedName("ai.i")
    public static int[] field712;

    @ObfuscatedName("l.u")
    public static byte[][][] field74;

    @ObfuscatedName("ao.dl")
    public static byte[][] field774;

    @ObfuscatedName("ao.c")
    public static class191 field777;

    @ObfuscatedName("ao.eu")
    public static int[] field782;

    @ObfuscatedName("ao.my")
    public static class50 field783;

    @ObfuscatedName("l.g")
    public static byte[][][] field81;

    @ObfuscatedName("ap.k")
    public static class147 field813;

    @ObfuscatedName("ap.y")
    public static class147 field825;

    @ObfuscatedName("as.s")
    public static class147 field827;

    @ObfuscatedName("au.z")
    public static class152 field880;

    @ObfuscatedName("au.k")
    public static class147 field882;

    @ObfuscatedName("au.at")
    public static class130 field885;

    @ObfuscatedName("ac.s")
    public static class147 field887;

    @ObfuscatedName("ac.k")
    public static class147 field891;

    @ObfuscatedName("e.gl")
    public static class153 field90;

    @ObfuscatedName("ac.db")
    public static int[] field902;

    @ObfuscatedName("ac.ds")
    public static int[] field907;

    @ObfuscatedName("ay.k")
    public static class147 field913;

    @ObfuscatedName("av.s")
    public static int field926;

    @ObfuscatedName("av.k")
    public static class147 field932;

    @ObfuscatedName("av.z")
    public static class197[] field933;

    @ObfuscatedName("ak.k")
    public static class147 field944;

    @ObfuscatedName("ae.e")
    public static class147 field962;

    @ObfuscatedName("ae.nm")
    public static int field964;

    @ObfuscatedName("ae.k")
    public static class147 field965;

    @ObfuscatedName("at.kt")
    public static class153[] field967;

    @ObfuscatedName("at.k")
    public static class147 field973;

    @ObfuscatedName("at.ni")
    public static int field978;

    @ObfuscatedName("az.aa")
    public static class74[] field983;

    @ObfuscatedName("az.gh")
    public static class153 field986;

    @ObfuscatedName("ag.e")
    public static class194 field995;

    @ObfuscatedName("aw.c(Ljava/lang/Object;ZB)[B")
    public static byte[] method533(Object arg0, boolean arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var2 = (byte[]) ((byte[]) arg0);
            return arg1 ? class112.method2814(var2) : var2;
        } else if (arg0 instanceof class112) {
            class112 var3 = (class112) arg0;
            return var3.method2115();
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ai.g(B)V")
    public static void method548() {
        class46.field1036.method3210();
    }

    @ObfuscatedName("av.e(I)Lbz;")
    public static class74 method748() {
        class74 var0 = new class74();
        var0.field1306 = field1259;
        var0.field1301 = field1824;
        var0.field1304 = field1261[0];
        var0.field1305 = field2677[0];
        var0.field1302 = field1269[0];
        var0.field1303 = field1263[0];
        var0.field1307 = field1266;
        var0.field1300 = field1264[0];
        class70.method2847();
        return var0;
    }

    @ObfuscatedName("ab.y(I)V")
    public static void method494() {
        class124 var0 = class124.field1958;
        synchronized (class124.field1958) {
            class124.field1980++;
            class124.field1974 = class124.field1976;
            class124.field1973 = 0;
            if (class124.field1960 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    class124.field1977[var1] = false;
                }
                class124.field1960 = class124.field1964;
            } else {
                while (class124.field1964 != class124.field1960) {
                    int var2 = class124.field1967[class124.field1964];
                    class124.field1964 = class124.field1964 + 1 & 0x7F;
                    if (var2 < 0) {
                        class124.field1977[~var2] = false;
                    } else {
                        if (!class124.field1977[var2] && class124.field1973 < class124.field1972.length - 1) {
                            class124.field1972[++class124.field1973 - 1] = var2;
                        }
                        class124.field1977[var2] = true;
                    }
                }
            }
            class124.field1976 = class124.field1966;
        }
    }

    @ObfuscatedName("af.s(Ldy;II)V")
    public static void method904(class107 arg0, int arg1) {
        class189 var2 = new class189();
        var2.field2885 = arg0.method2138();
        var2.field2888 = arg0.method2143();
        var2.field2883 = new int[var2.field2885];
        var2.field2881 = new int[var2.field2885];
        var2.field2884 = new Field[var2.field2885];
        var2.field2886 = new int[var2.field2885];
        var2.field2882 = new Method[var2.field2885];
        var2.field2887 = new byte[var2.field2885][][];
        for (int var3 = 0; var3 < var2.field2885; var3++) {
            try {
                int var4 = arg0.method2138();
                if (var4 == 0 || var4 == 1 || var4 == 2) {
                    String var5 = arg0.method2146();
                    String var6 = arg0.method2146();
                    int var7 = 0;
                    if (var4 == 1) {
                        var7 = arg0.method2143();
                    }
                    var2.field2883[var3] = var4;
                    var2.field2886[var3] = var7;
                    if (class190.method2464(var5).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2884[var3] = class190.method2464(var5).getDeclaredField(var6);
                } else if (var4 == 3 || var4 == 4) {
                    String var8 = arg0.method2146();
                    String var9 = arg0.method2146();
                    int var10 = arg0.method2138();
                    String[] var11 = new String[var10];
                    for (int var12 = 0; var12 < var10; var12++) {
                        var11[var12] = arg0.method2146();
                    }
                    String var13 = arg0.method2146();
                    byte[][] var14 = new byte[var10][];
                    if (var4 == 3) {
                        for (int var15 = 0; var15 < var10; var15++) {
                            int var16 = arg0.method2143();
                            var14[var15] = new byte[var16];
                            arg0.method2149(var14[var15], 0, var16);
                        }
                    }
                    var2.field2883[var3] = var4;
                    Class[] var17 = new Class[var10];
                    for (int var18 = 0; var18 < var10; var18++) {
                        var17[var18] = class190.method2464(var11[var18]);
                    }
                    Class var19 = class190.method2464(var13);
                    if (class190.method2464(var8).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    Method[] var20 = class190.method2464(var8).getDeclaredMethods();
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
                                    var2.field2882[var3] = var23;
                                }
                            }
                        }
                    }
                    var2.field2887[var3] = var14;
                }
            } catch (ClassNotFoundException var32) {
                var2.field2881[var3] = -1;
            } catch (SecurityException var33) {
                var2.field2881[var3] = -2;
            } catch (NullPointerException var34) {
                var2.field2881[var3] = -3;
            } catch (Exception var35) {
                var2.field2881[var3] = -4;
            } catch (Throwable var36) {
                var2.field2881[var3] = -5;
            }
        }
        class190.field2889.method3318(var2);
    }

    @ObfuscatedName("ap.c([BI)Lgn;")
    public static class194 method582(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            class194 var1 = new class194(arg0, field1261, field2677, field1269, field1263, field1266, field1264);
            class70.method2847();
            return var1;
        }
    }

    @ObfuscatedName("bi.i(IIII)I")
    public static final int method1423(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("ep.al(IIII)V")
    public static void method2904(int arg0, int arg1, int arg2) {
        if (client.field477 == 0 || arg1 == 0 || client.field407 >= 50) {
            return;
        }
        client.field496[client.field407] = arg0;
        client.field481[client.field407] = arg1;
        client.field482[client.field407] = arg2;
        client.field344[client.field407] = null;
        client.field483[client.field407] = 0;
        client.field407++;
    }

    @ObfuscatedName("af.be(Lab;IIB)V")
    public static final void method890(class27 arg0, int arg1, int arg2) {
        client.method481(arg0.field629, arg0.field623, arg0.field631, arg0.field624, arg0.field626, arg0.field626, arg1, arg2);
    }

    @ObfuscatedName("cu.bi(II)Z")
    public static boolean method1973(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("cr.cz(Ljava/lang/String;Lep;I)Ljava/lang/String;")
    public static String method1886(String arg0, class153 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = client.method902(arg1, var2 - 1);
                    String var6;
                    if (var5 < 999999999) {
                        var6 = Integer.toString(var5);
                    } else {
                        var6 = "*";
                    }
                    arg0 = var4 + var6 + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var7 = arg0.indexOf("%dns");
                if (var7 == -1) {
                    break;
                }
                String var8 = "";
                if (field1490 != null) {
                    int var9 = field1490.field2074;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (field1490.field2068 != null) {
                        var8 = (String) field1490.field2068;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ae.cv(II)Ljava/lang/String;")
    public static final String method797(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method49(65408) + var1.substring(0, var1.length() - 8) + class143.field2326 + " " + class2.field19 + var1 + class2.field18 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method49(16777215) + var1.substring(0, var1.length() - 4) + class143.field2193 + " " + class2.field19 + var1 + class2.field18 + class2.field23;
        } else {
            return " " + class2.method49(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("bu.cp(Lep;IIIIIIS)V")
    public static final void method1597(class153 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (client.field321) {
            client.field322 = 32;
        } else {
            client.field322 = 0;
        }
        client.field321 = false;
        if (class127.field2006 == 1 || !field697 && class127.field2006 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2557 -= 4;
                client.method2520(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2557 += 4;
                client.method2520(arg0);
            } else if (arg5 >= arg1 - client.field322 && arg5 < client.field322 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2557 = (arg4 - arg3) * var8 / var9;
                client.method2520(arg0);
                client.field321 = true;
            }
        }
        if (client.field440 == 0) {
            return;
        }
        int var10 = arg0.field2552;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2557 += client.field440 * 45;
            client.method2520(arg0);
        }
    }
}
