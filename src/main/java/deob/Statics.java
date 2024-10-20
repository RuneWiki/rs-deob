package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

public class Statics {

    @ObfuscatedName("ad.bp")
    public static int field1000;

    @ObfuscatedName("af.hx")
    public static int field1008;

    @ObfuscatedName("af.k")
    public static class146 field1010;

    @ObfuscatedName("ab.r")
    public static class146 field1012;

    @ObfuscatedName("ab.y")
    public static boolean field1013;

    @ObfuscatedName("ab.g")
    public static class193 field1017;

    @ObfuscatedName("ab.k")
    public static class146 field1023;

    @ObfuscatedName("ab.gz")
    public static class152 field1032;

    @ObfuscatedName("at.r")
    public static int field1062;

    @ObfuscatedName("at.k")
    public static class146 field1064;

    @ObfuscatedName("ah.k")
    public static class47 field1068;

    @ObfuscatedName("ay.m")
    public static int field1075;

    @ObfuscatedName("ay.j")
    public static class66 field1077;

    @ObfuscatedName("ay.ow")
    public static class9 field1087;

    @ObfuscatedName("ay.w")
    public static boolean field1092;

    @ObfuscatedName("ay.y")
    public static int field1096;

    @ObfuscatedName("k.ns")
    public static int field11;

    @ObfuscatedName("be.p")
    public static float field1139;

    @ObfuscatedName("be.o")
    public static int field1142;

    @ObfuscatedName("bq.x")
    public static int[] field1171;

    @ObfuscatedName("bq.b")
    public static int[] field1176;

    @ObfuscatedName("bq.n")
    public static boolean[] field1177;

    @ObfuscatedName("bc.s")
    public static class54[] field1186;

    @ObfuscatedName("bc.p")
    public static int field1189;

    @ObfuscatedName("bc.f")
    public static float[] field1191;

    @ObfuscatedName("bc.g")
    public static byte[] field1192;

    @ObfuscatedName("bc.ak")
    public static float[] field1193;

    @ObfuscatedName("bc.o")
    public static int field1194;

    @ObfuscatedName("bc.b")
    public static int field1195;

    @ObfuscatedName("bc.d")
    public static class61[] field1198;

    @ObfuscatedName("bc.n")
    public static class67[] field1199;

    @ObfuscatedName("g.ed")
    public static int[] field120;

    @ObfuscatedName("bc.v")
    public static class62[] field1200;

    @ObfuscatedName("bc.t")
    public static boolean[] field1201;

    @ObfuscatedName("bc.u")
    public static int[] field1202;

    @ObfuscatedName("bc.q")
    public static float[] field1203;

    @ObfuscatedName("bc.c")
    public static float[] field1208;

    @ObfuscatedName("bc.x")
    public static int field1210;

    @ObfuscatedName("bc.z")
    public static float[] field1211;

    @ObfuscatedName("bc.aa")
    public static float[] field1212;

    @ObfuscatedName("bc.al")
    public static float[] field1214;

    @ObfuscatedName("bc.aw")
    public static int[] field1215;

    @ObfuscatedName("bc.ai")
    public static int[] field1216;

    @ObfuscatedName("bb.pq")
    public static String field1250;

    @ObfuscatedName("p.ec")
    public static int[] field126;

    @ObfuscatedName("bl.p")
    public static byte[][][] field1270;

    @ObfuscatedName("br.if")
    public static class152 field1273;

    @ObfuscatedName("bi.g")
    public static int[] field1275;

    @ObfuscatedName("bi.r")
    public static int field1276;

    @ObfuscatedName("bi.y")
    public static int field1277;

    @ObfuscatedName("bi.w")
    public static int[] field1278;

    @ObfuscatedName("bi.m")
    public static int[] field1279;

    @ObfuscatedName("bi.j")
    public static int[] field1280;

    @ObfuscatedName("bi.p")
    public static int[] field1282;

    @ObfuscatedName("bi.o")
    public static byte[][] field1283;

    @ObfuscatedName("bi.pg")
    public static Image field1285;

    @ObfuscatedName("bi.k")
    public static int field1286;

    @ObfuscatedName("bi.fb")
    public static int field1288;

    @ObfuscatedName("bj.eq")
    public static int[] field1293;

    @ObfuscatedName("bj.ap")
    public static boolean field1294;

    @ObfuscatedName("bs.v")
    public static int field1312;

    @ObfuscatedName("bs.d")
    public static int[] field1314;

    @ObfuscatedName("bs.s")
    public static int field1315;

    @ObfuscatedName("bm.v")
    public static int[] field1327;

    @ObfuscatedName("bt.b")
    public static short[][] field1344;

    @ObfuscatedName("bt.w")
    public static class146 field1350;

    @ObfuscatedName("bt.lv")
    public static byte field1352;

    @ObfuscatedName("bx.im")
    public static int field1355;

    @ObfuscatedName("cn.h")
    public static int field1363;

    @ObfuscatedName("cn.c")
    public static int field1370;

    @ObfuscatedName("cn.bu")
    public static int field1371;

    @ObfuscatedName("cn.l")
    public static int field1373;

    @ObfuscatedName("cn.i")
    public static int field1374;

    @ObfuscatedName("cn.e")
    public static int field1376;

    @ObfuscatedName("cn.a")
    public static int field1377;

    @ObfuscatedName("cn.f")
    public static int field1379;

    @ObfuscatedName("o.bq")
    public static class147 field138;

    @ObfuscatedName("cn.z")
    public static int field1381;

    @ObfuscatedName("cn.ak")
    public static int field1383;

    @ObfuscatedName("cn.al")
    public static int field1384;

    @ObfuscatedName("cn.aw")
    public static int field1385;

    @ObfuscatedName("cn.aa")
    public static int field1394;

    @ObfuscatedName("cn.bk")
    public static int field1396;

    @ObfuscatedName("cn.q")
    public static int field1409;

    @ObfuscatedName("o.op")
    public static Clipboard field141;

    @ObfuscatedName("cn.be")
    public static boolean[][] field1412;

    @ObfuscatedName("cn.bd")
    public static int field1413;

    @ObfuscatedName("cn.bo")
    public static int field1414;

    @ObfuscatedName("cn.bz")
    public static int field1415;

    @ObfuscatedName("cn.bq")
    public static int field1416;

    @ObfuscatedName("cn.ai")
    public static int field1418;

    @ObfuscatedName("cr.be")
    public static class147 field1450;

    @ObfuscatedName("cr.ch")
    public static class130 field1451;

    @ObfuscatedName("cr.cu")
    public static int field1454;

    @ObfuscatedName("cr.ao")
    public static class147 field1456;

    @ObfuscatedName("cr.ct")
    public static class193 field1457;

    @ObfuscatedName("cy.h")
    public static int field1467;

    @ObfuscatedName("cy.x")
    public static int field1469;

    @ObfuscatedName("cy.n")
    public static int field1478;

    @ObfuscatedName("cy.e")
    public static int field1480;

    @ObfuscatedName("cy.a")
    public static int field1481;

    @ObfuscatedName("cy.c")
    public static int field1482;

    @ObfuscatedName("cy.q")
    public static int field1484;

    @ObfuscatedName("cy.f")
    public static int field1486;

    @ObfuscatedName("cy.ak")
    public static class85 field1487;

    @ObfuscatedName("cf.cw")
    public static int field1492;

    @ObfuscatedName("ca.mu")
    public static class50 field1504;

    @ObfuscatedName("b.br")
    public static String field151;

    @ObfuscatedName("cs.pd")
    public static int field1519;

    @ObfuscatedName("cs.pj")
    public static int field1526;

    @ObfuscatedName("cs.dp")
    public static int[] field1530;

    @ObfuscatedName("cc.il")
    public static int field1533;

    @ObfuscatedName("cc.s")
    public static int[] field1535;

    @ObfuscatedName("cc.cs")
    public static char field1536;

    @ObfuscatedName("b.ek")
    public static class72[] field154;

    @ObfuscatedName("b.bk")
    public static class147 field155;

    @ObfuscatedName("ck.ox")
    public static class145 field1567;

    @ObfuscatedName("b.gn")
    public static class152 field158;

    @ObfuscatedName("ci.eg")
    public static int[] field1586;

    @ObfuscatedName("ci.pw")
    public static Canvas field1589;

    @ObfuscatedName("b.f")
    public static int[] field161;

    @ObfuscatedName("x.dl")
    public static byte[][] field165;

    @ObfuscatedName("cb.em")
    public static class72[] field1662;

    @ObfuscatedName("cb.hw")
    public static int field1663;

    @ObfuscatedName("ct.id")
    public static class152 field1676;

    @ObfuscatedName("cv.om")
    public static class123 field1680;

    @ObfuscatedName("cv.pv")
    public static int field1682;

    @ObfuscatedName("cv.d")
    public static boolean field1683;

    @ObfuscatedName("cp.bh")
    public static int field1718;

    @ObfuscatedName("x.mn")
    public static int field172;

    @ObfuscatedName("cp.bn")
    public static int field1722;

    @ObfuscatedName("cp.bf")
    public static int field1724;

    @ObfuscatedName("x.ep")
    public static class72[] field177;

    @ObfuscatedName("cw.oq")
    public static int field1775;

    @ObfuscatedName("n.el")
    public static class72[] field179;

    @ObfuscatedName("cu.ee")
    public static class74[] field1822;

    @ObfuscatedName("co.n")
    public static class158 field1831;

    @ObfuscatedName("cz.k")
    public static long field1832;

    @ObfuscatedName("cz.r")
    public static long field1833;

    @ObfuscatedName("cz.g")
    public static byte[][][] field1834;

    @ObfuscatedName("cz.ah")
    public static class147 field1839;

    @ObfuscatedName("n.ni")
    public static int field185;

    @ObfuscatedName("de.ae")
    public static String field1866;

    @ObfuscatedName("ds.cb")
    public static class193 field1873;

    @ObfuscatedName("dp.e")
    public static class12 field1884;

    @ObfuscatedName("dn.au")
    public static class147 field1900;

    @ObfuscatedName("dg.g")
    public static int field1903;

    @ObfuscatedName("dl.s")
    public static class196[] field1906;

    @ObfuscatedName("dl.pt")
    public static Frame field1907;

    @ObfuscatedName("dl.cn")
    public static class133 field1909;

    @ObfuscatedName("db.l")
    public static int[] field1911;

    @ObfuscatedName("db.j")
    public static int field1916;

    @ObfuscatedName("dk.nv")
    public static class68 field1925;

    @ObfuscatedName("dx.ad")
    public static class130 field1933;

    @ObfuscatedName("di.g")
    public static class74 field1934;

    @ObfuscatedName("di.p")
    public static int field1936;

    @ObfuscatedName("dm.r")
    public static File field1946;

    @ObfuscatedName("dm.at")
    public static long field1949;

    @ObfuscatedName("d.x")
    public static class152 field195;

    @ObfuscatedName("dh.r")
    public static String field1953;

    @ObfuscatedName("dh.k")
    public static String field1961;

    @ObfuscatedName("dh.i")
    public static int[] field1962;

    @ObfuscatedName("da.ac")
    public static class147 field1965;

    @ObfuscatedName("da.pf")
    public static int field1972;

    @ObfuscatedName("d.ez")
    public static class72 field198;

    @ObfuscatedName("da.ph")
    public static Font field1989;

    @ObfuscatedName("d.do")
    public static class79 field199;

    @ObfuscatedName("dw.og")
    public static class121 field1994;

    @ObfuscatedName("dw.dg")
    public static int[][] field1999;

    @ObfuscatedName("dz.oi")
    public static class120 field2010;

    @ObfuscatedName("s.w")
    public static class162 field203;

    @ObfuscatedName("dq.ao")
    public static class74[] field2030;

    @ObfuscatedName("dq.h")
    public static class107 field2031;

    @ObfuscatedName("s.as")
    public static class133 field206;

    @ObfuscatedName("s.hv")
    public static int field207;

    @ObfuscatedName("ez.ew")
    public static class72[] field2072;

    @ObfuscatedName("ez.r")
    public static String field2073;

    @ObfuscatedName("ez.y")
    public static int field2074;

    @ObfuscatedName("ez.nr")
    public static int field2078;

    @ObfuscatedName("ez.k")
    public static Applet field2079;

    @ObfuscatedName("es.w")
    public static File field2083;

    @ObfuscatedName("es.m")
    public static File field2084;

    @ObfuscatedName("es.v")
    public static int field2089;

    @ObfuscatedName("es.h")
    public static String field2090;

    @ObfuscatedName("es.e")
    public static String field2092;

    @ObfuscatedName("ep.bz")
    public static class147 field2101;

    @ObfuscatedName("el.fl")
    public static int field2107;

    @ObfuscatedName("el.bh")
    public static class147 field2112;

    @ObfuscatedName("em.u")
    public static int[] field2128;

    @ObfuscatedName("eu.nk")
    public static int field2147;

    @ObfuscatedName("v.bw")
    public static class147 field216;

    @ObfuscatedName("t.ih")
    public static int field233;

    @ObfuscatedName("ex.my")
    public static class49 field2370;

    @ObfuscatedName("ex.nj")
    public static int field2397;

    @ObfuscatedName("ew.mj")
    public static class21[] field2404;

    @ObfuscatedName("ed.kp")
    public static int field2482;

    @ObfuscatedName("ed.ex")
    public static class72[] field2486;

    @ObfuscatedName("u.nx")
    public static int field249;

    @ObfuscatedName("eg.g")
    public static class146 field2492;

    @ObfuscatedName("ec.y")
    public static long field2505;

    @ObfuscatedName("client.r")
    public static client field251;

    @ObfuscatedName("ec.dn")
    public static int[] field2511;

    @ObfuscatedName("ec.k")
    public static class130 field2514;

    @ObfuscatedName("eq.kc")
    public static int field2516;

    @ObfuscatedName("en.m")
    public static class146 field2527;

    @ObfuscatedName("en.j")
    public static class146 field2528;

    @ObfuscatedName("en.jd")
    public static int field2595;

    @ObfuscatedName("en.k")
    public static class152[][] field2634;

    @ObfuscatedName("en.ke")
    public static class118 field2655;

    @ObfuscatedName("ey.z")
    public static int[] field2660;

    @ObfuscatedName("ei.b")
    public static int field2666;

    @ObfuscatedName("ei.r")
    public static boolean[] field2668;

    @ObfuscatedName("ea.j")
    public static class146 field2673;

    @ObfuscatedName("fx.bj")
    public static int field2679;

    @ObfuscatedName("fx.g")
    public static short[] field2680;

    @ObfuscatedName("fx.p")
    public static short[][] field2681;

    @ObfuscatedName("fb.y")
    public static class146 field2714;

    @ObfuscatedName("fb.o")
    public static int field2716;

    @ObfuscatedName("fb.d")
    public static class53 field2717;

    @ObfuscatedName("fb.k")
    public static class146 field2718;

    @ObfuscatedName("fb.r")
    public static class146 field2721;

    @ObfuscatedName("fb.gr")
    public static class152 field2722;

    @ObfuscatedName("fv.eh")
    public static class72 field2724;

    @ObfuscatedName("fp.cd")
    public static class130 field2759;

    @ObfuscatedName("client.ax")
    public static class133 field278;

    @ObfuscatedName("client.ag")
    public static class147 field283;

    @ObfuscatedName("client.bd")
    public static class147 field285;

    @ObfuscatedName("client.bo")
    public static class147 field286;

    @ObfuscatedName("gj.s")
    public static class151 field2880;

    @ObfuscatedName("gs.t")
    public static String field2890;

    @ObfuscatedName("ge.k")
    public static class102 field2901;

    @ObfuscatedName("ge.n")
    public static int[] field2903;

    @ObfuscatedName("gn.b")
    public static class74[] field2913;

    @ObfuscatedName("gz.o")
    public static int[][] field2928;

    @ObfuscatedName("gr.fv")
    public static int field2945;

    @ObfuscatedName("gu.n")
    public static class190 field2960;

    @ObfuscatedName("client.ay")
    public static class147 field362;

    @ObfuscatedName("client.iq")
    public static int field397;

    @ObfuscatedName("client.cz")
    public static int field439;

    @ObfuscatedName("y.ev")
    public static class72[] field45;

    @ObfuscatedName("client.t")
    public static class107 field513;

    @ObfuscatedName("client.fs")
    public static int field514;

    @ObfuscatedName("l.ny")
    public static int field522;

    @ObfuscatedName("l.kt")
    public static class152[] field528;

    @ObfuscatedName("w.q")
    public static int[] field53;

    @ObfuscatedName("h.hq")
    public static class3 field555;

    @ObfuscatedName("e.ip")
    public static int field561;

    @ObfuscatedName("e.ac")
    public static class72[] field564;

    @ObfuscatedName("e.iz")
    public static int field565;

    @ObfuscatedName("e.v")
    public static int[][][] field567;

    @ObfuscatedName("w.ne")
    public static int field57;

    @ObfuscatedName("a.cc")
    public static int field578;

    @ObfuscatedName("w.cv")
    public static class193 field58;

    @ObfuscatedName("a.pu")
    public static class71 field582;

    @ObfuscatedName("c.q")
    public static int[] field588;

    @ObfuscatedName("c.et")
    public static class74 field597;

    @ObfuscatedName("f.x")
    public static boolean field600;

    @ObfuscatedName("f.lo")
    public static class117 field603;

    @ObfuscatedName("f.db")
    public static byte[][] field606;

    @ObfuscatedName("q.mz")
    public static class50 field609;

    @ObfuscatedName("w.d")
    public static int[] field61;

    @ObfuscatedName("q.au")
    public static class74[] field612;

    @ObfuscatedName("z.co")
    public static int field618;

    @ObfuscatedName("z.pb")
    public static boolean field626;

    @ObfuscatedName("aa.ah")
    public static class17 field634;

    @ObfuscatedName("aa.a")
    public static String field636;

    @ObfuscatedName("aa.mb")
    public static class72 field637;

    @ObfuscatedName("aa.o")
    public static class74 field638;

    @ObfuscatedName("m.j")
    public static byte[][][] field64;

    @ObfuscatedName("ak.w")
    public static class74[] field641;

    @ObfuscatedName("ak.r")
    public static class74 field642;

    @ObfuscatedName("ak.y")
    public static class74 field643;

    @ObfuscatedName("ak.m")
    public static class72 field645;

    @ObfuscatedName("ak.j")
    public static class72 field646;

    @ObfuscatedName("ak.fr")
    public static int field649;

    @ObfuscatedName("ak.b")
    public static class74 field650;

    @ObfuscatedName("ak.h")
    public static int[] field652;

    @ObfuscatedName("ak.c")
    public static int[] field655;

    @ObfuscatedName("ak.k")
    public static boolean field658;

    @ObfuscatedName("ak.p")
    public static class74[] field663;

    @ObfuscatedName("ak.am")
    public static int field669;

    @ObfuscatedName("ak.ay")
    public static class74[] field675;

    @ObfuscatedName("ak.bn")
    public static class22[] field677;

    @ObfuscatedName("m.ej")
    public static class74[] field68;

    @ObfuscatedName("al.fa")
    public static int field692;

    @ObfuscatedName("aw.fw")
    public static int field693;

    @ObfuscatedName("aw.ik")
    public static class27 field695;

    @ObfuscatedName("ai.b")
    public static class139 field705;

    @ObfuscatedName("ai.eu")
    public static class72[] field711;

    @ObfuscatedName("av.y")
    public static int[] field717;

    @ObfuscatedName("av.w")
    public static String[] field718;

    @ObfuscatedName("av.n")
    public static class152 field725;

    @ObfuscatedName("m.o")
    public static short[] field74;

    @ObfuscatedName("j.m")
    public static byte[][][] field76;

    @ObfuscatedName("j.bh")
    public static class74 field77;

    @ObfuscatedName("an.mf")
    public static byte field788;

    @ObfuscatedName("aq.bf")
    public static FontMetrics field789;

    @ObfuscatedName("aq.bn")
    public static class147 field792;

    @ObfuscatedName("aj.r")
    public static class146 field797;

    @ObfuscatedName("aj.k")
    public static class146 field817;

    @ObfuscatedName("az.r")
    public static class146 field838;

    @ObfuscatedName("az.y")
    public static class146 field839;

    @ObfuscatedName("j.x")
    public static int[] field85;

    @ObfuscatedName("az.ng")
    public static int field887;

    @ObfuscatedName("az.dv")
    public static int field890;

    @ObfuscatedName("ax.k")
    public static class146 field895;

    @ObfuscatedName("ax.b")
    public static int[] field896;

    @ObfuscatedName("ap.k")
    public static class146 field901;

    @ObfuscatedName("ap.y")
    public static class146 field902;

    @ObfuscatedName("ap.es")
    public static class74[] field903;

    @ObfuscatedName("ap.r")
    public static class146 field916;

    @ObfuscatedName("ap.di")
    public static int field920;

    @ObfuscatedName("ar.k")
    public static class146 field924;

    @ObfuscatedName("ar.r")
    public static class146 field928;

    @ObfuscatedName("j.w")
    public static byte[][][] field93;

    @ObfuscatedName("ar.bu")
    public static class147 field940;

    @ObfuscatedName("am.r")
    public static class146 field945;

    @ObfuscatedName("am.y")
    public static int field946;

    @ObfuscatedName("am.k")
    public static class146 field950;

    @ObfuscatedName("ae.k")
    public static class146 field958;

    @ObfuscatedName("ae.kb")
    public static int field966;

    @ObfuscatedName("as.k")
    public static class146 field980;

    @ObfuscatedName("as.t")
    public static String[] field982;

    @ObfuscatedName("as.p")
    public static class138 field983;

    @ObfuscatedName("as.u")
    public static String[] field985;

    @ObfuscatedName("as.nt")
    public static int field987;

    @ObfuscatedName("ad.ds")
    public static int[] field988;

    @ObfuscatedName("ad.k")
    public static class146 field996;

    @ObfuscatedName("ad.bi")
    public static int field998;

    @ObfuscatedName("ci.k(II)Ldk;")
    public static class117 method1871(int arg0) {
        class117[] var1 = new class117[] { class117.field1921, class117.field1922, class117.field1920 };
        class117[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class117 var4 = var2[var3];
            if (var4.field1923 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("ed.j(IS)Z")
    public static boolean method2791(int arg0) {
        return (arg0 >> 31 & 0x1) != 0;
    }

    @ObfuscatedName("eq.k([BIB)I")
    public static int method2821(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ class107.field1864[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    @ObfuscatedName("g.y(I)V")
    public static void method83() {
        class10.field160.clear();
        class10.field152.method3180();
        class10.field153.method3222();
        class10.field157 = 0;
    }

    @ObfuscatedName("ex.y(IS)V")
    public static void method2659(int arg0) {
        if (class161.field2713 == 0) {
            field203.method3038(arg0);
        } else {
            field2716 = arg0;
        }
    }

    @ObfuscatedName("client.w(I)V")
    public static void method413() {
        field203.method3009();
        class161.field2713 = 1;
        field2673 = null;
    }

    @ObfuscatedName("ct.x(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method1962(String arg0) {
        int var1 = arg0.length();
        char[] var2 = new char[var1];
        byte var3 = 2;
        for (int var4 = 0; var4 < var1; var4++) {
            char var5 = arg0.charAt(var4);
            if (var3 == 0) {
                var5 = Character.toLowerCase(var5);
            } else if (var3 == 2 || Character.isUpperCase(var5)) {
                var5 = class201.method84(var5);
            }
            if (Character.isLetter(var5)) {
                var3 = 0;
            } else if (var5 == '.' || var5 == '?' || var5 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var5)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2[var4] = var5;
        }
        return new String(var2);
    }

    @ObfuscatedName("a.r(IB)Len;")
    public static class152 method480(int arg0) {
        int var1 = arg0 >> 16;
        int var2 = arg0 & 0xFFFF;
        if (field2634[var1] == null || field2634[var1][var2] == null) {
            boolean var3 = class152.method565(var1);
            if (!var3) {
                return null;
            }
        }
        return field2634[var1][var2];
    }

    @ObfuscatedName("dn.y(Ljava/lang/String;Ljava/lang/String;ZI)Lgz;")
    public static class195 method2372(String arg0, String arg1, boolean arg2) {
        File var3 = new File(field2084, "preferences" + arg0 + ".dat");
        if (var3.exists()) {
            try {
                return new class195(var3, "rw", 10000L);
            } catch (IOException var14) {
            }
        }
        String var6 = "";
        if (field2089 == 33) {
            var6 = "_rc";
        } else if (field2089 == 34) {
            var6 = "_wip";
        }
        File var7 = new File(field636, "jagex_" + arg1 + "_preferences" + arg0 + var6 + ".dat");
        if (!arg2 && var7.exists()) {
            try {
                return new class195(var7, "rw", 10000L);
            } catch (IOException var13) {
            }
        }
        try {
            return new class195(var3, "rw", 10000L);
        } catch (IOException var12) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ez.b(B)V")
    public static void method2636() {
        class35.field798.method3138();
        class35.field799.method3138();
    }

    @ObfuscatedName("o.p(IIIIIILcn;Lga;I)V")
    public static final void method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class79 arg6, class197 arg7) {
        if (client.field394 && (class6.field80[0][arg1][arg2] & 0x2) == 0) {
            if ((class6.field80[arg0][arg1][arg2] & 0x10) != 0) {
                return;
            }
            int var8;
            if ((class6.field80[arg0][arg1][arg2] & 0x8) != 0) {
                var8 = 0;
            } else if (arg0 <= 0 || (class6.field80[1][arg1][arg2] & 0x2) == 0) {
                var8 = arg0;
            } else {
                var8 = arg0 - 1;
            }
            if (client.field367 != var8) {
                return;
            }
        }
        if (arg0 < class6.field88) {
            class6.field88 = arg0;
        }
        class36 var9 = class36.method147(arg3);
        int var10;
        int var11;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var9.field846;
            var11 = var9.field854;
        } else {
            var10 = var9.field854;
            var11 = var9.field846;
        }
        int var12;
        int var13;
        if (arg1 + var10 <= 104) {
            var12 = (var10 >> 1) + arg1;
            var13 = (var10 + 1 >> 1) + arg1;
        } else {
            var12 = arg1;
            var13 = arg1 + 1;
        }
        int var14;
        int var15;
        if (arg2 + var11 <= 104) {
            var14 = (var11 >> 1) + arg2;
            var15 = (var11 + 1 >> 1) + arg2;
        } else {
            var14 = arg2;
            var15 = arg2 + 1;
        }
        int[][] var16 = class6.field78[arg0];
        int var17 = var16[var12][var14] + var16[var13][var14] + var16[var12][var15] + var16[var13][var15] >> 2;
        int var18 = (arg1 << 7) + (var10 << 6);
        int var19 = (arg2 << 7) + (var11 << 6);
        int var20 = (arg3 << 14) + (arg2 << 7) + arg1 + 1073741824;
        if (var9.field857 == 0) {
            var20 -= Integer.MIN_VALUE;
        }
        int var21 = (arg4 << 6) + arg5;
        if (var9.field878 == 1) {
            var21 += 256;
        }
        if (var9.method637()) {
            class20 var22 = new class20();
            var22.field539 = arg0;
            var22.field550 = arg1 * 128;
            var22.field548 = arg2 * 128;
            int var23 = var9.field854;
            int var24 = var9.field846;
            if (arg4 == 1 || arg4 == 3) {
                var23 = var9.field846;
                var24 = var9.field854;
            }
            var22.field542 = (arg1 + var23) * 128;
            var22.field543 = (arg2 + var24) * 128;
            var22.field545 = var9.field882;
            var22.field544 = var9.field874 * 128;
            var22.field547 = var9.field884;
            var22.field556 = var9.field885;
            var22.field549 = var9.field886;
            if (var9.field879 != null) {
                var22.field552 = var9;
                var22.method459();
            }
            class20.field546.method3190(var22);
            if (var22.field549 != null) {
                var22.field538 = var22.field547 + (int) (Math.random() * (double) (var22.field556 - var22.field547));
            }
        }
        if (arg5 == 22) {
            if (!client.field394 || var9.field857 != 0 || var9.field865 == 1 || var9.field876) {
                class78 var25;
                if (var9.field861 == -1 && var9.field879 == null) {
                    var25 = var9.method640(22, arg4, var16, var18, var17, var19);
                } else {
                    var25 = new class11(arg3, 22, arg4, arg0, arg1, arg2, var9.field861, true, (class78) null);
                }
                arg6.method1643(arg0, arg1, arg2, var17, var25, var20, var21);
                if (var9.field865 == 1 && arg7 != null) {
                    arg7.method3462(arg1, arg2);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class78 var48;
            if (var9.field861 == -1 && var9.field879 == null) {
                var48 = var9.method640(10, arg4, var16, var18, var17, var19);
            } else {
                var48 = new class11(arg3, 10, arg4, arg0, arg1, arg2, var9.field861, true, (class78) null);
            }
            if (var48 != null && arg6.method1617(arg0, arg1, arg2, var17, var10, var11, var48, arg5 == 11 ? 256 : 0, var20, var21) && var9.field864) {
                int var49 = 15;
                if (var48 instanceof class98) {
                    var49 = ((class98) var48).method1982() / 4;
                    if (var49 > 30) {
                        var49 = 30;
                    }
                }
                for (int var50 = 0; var50 <= var10; var50++) {
                    for (int var51 = 0; var51 <= var11; var51++) {
                        if (var49 > field1270[arg0][arg1 + var50][arg2 + var51]) {
                            field1270[arg0][arg1 + var50][arg2 + var51] = (byte) var49;
                        }
                    }
                }
            }
            if (var9.field865 != 0 && arg7 != null) {
                arg7.method3460(arg1, arg2, var10, var11, var9.field855);
            }
        } else if (arg5 >= 12) {
            class78 var26;
            if (var9.field861 == -1 && var9.field879 == null) {
                var26 = var9.method640(arg5, arg4, var16, var18, var17, var19);
            } else {
                var26 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field861, true, (class78) null);
            }
            arg6.method1617(arg0, arg1, arg2, var17, 1, 1, var26, 0, var20, var21);
            if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
                field567[arg0][arg1][arg2] |= 0x924;
            }
            if (var9.field865 != 0 && arg7 != null) {
                arg7.method3460(arg1, arg2, var10, var11, var9.field855);
            }
        } else if (arg5 == 0) {
            class78 var27;
            if (var9.field861 == -1 && var9.field879 == null) {
                var27 = var9.method640(0, arg4, var16, var18, var17, var19);
            } else {
                var27 = new class11(arg3, 0, arg4, arg0, arg1, arg2, var9.field861, true, (class78) null);
            }
            arg6.method1719(arg0, arg1, arg2, var17, var27, (class78) null, class6.field82[arg4], 0, var20, var21);
            if (arg4 == 0) {
                if (var9.field864) {
                    field1270[arg0][arg1][arg2] = 50;
                    field1270[arg0][arg1][arg2 + 1] = 50;
                }
                if (var9.field870) {
                    field567[arg0][arg1][arg2] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var9.field864) {
                    field1270[arg0][arg1][arg2 + 1] = 50;
                    field1270[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field870) {
                    field567[arg0][arg1][arg2 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var9.field864) {
                    field1270[arg0][arg1 + 1][arg2] = 50;
                    field1270[arg0][arg1 + 1][arg2 + 1] = 50;
                }
                if (var9.field870) {
                    field567[arg0][arg1 + 1][arg2] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var9.field864) {
                    field1270[arg0][arg1][arg2] = 50;
                    field1270[arg0][arg1 + 1][arg2] = 50;
                }
                if (var9.field870) {
                    field567[arg0][arg1][arg2] |= 0x492;
                }
            }
            if (var9.field865 != 0 && arg7 != null) {
                arg7.method3469(arg1, arg2, arg5, arg4, var9.field855);
            }
            if (var9.field862 != 16) {
                arg6.method1721(arg0, arg1, arg2, var9.field862);
            }
        } else if (arg5 == 1) {
            class78 var28;
            if (var9.field861 == -1 && var9.field879 == null) {
                var28 = var9.method640(1, arg4, var16, var18, var17, var19);
            } else {
                var28 = new class11(arg3, 1, arg4, arg0, arg1, arg2, var9.field861, true, (class78) null);
            }
            arg6.method1719(arg0, arg1, arg2, var17, var28, (class78) null, class6.field83[arg4], 0, var20, var21);
            if (var9.field864) {
                if (arg4 == 0) {
                    field1270[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    field1270[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    field1270[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    field1270[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field865 != 0 && arg7 != null) {
                arg7.method3469(arg1, arg2, arg5, arg4, var9.field855);
            }
        } else if (arg5 == 2) {
            int var29 = arg4 + 1 & 0x3;
            class78 var30;
            class78 var31;
            if (var9.field861 == -1 && var9.field879 == null) {
                var30 = var9.method640(2, arg4 + 4, var16, var18, var17, var19);
                var31 = var9.method640(2, var29, var16, var18, var17, var19);
            } else {
                var30 = new class11(arg3, 2, arg4 + 4, arg0, arg1, arg2, var9.field861, true, (class78) null);
                var31 = new class11(arg3, 2, var29, arg0, arg1, arg2, var9.field861, true, (class78) null);
            }
            arg6.method1719(arg0, arg1, arg2, var17, var30, var31, class6.field82[arg4], class6.field82[var29], var20, var21);
            if (var9.field870) {
                if (arg4 == 0) {
                    field567[arg0][arg1][arg2] |= 0x249;
                    field567[arg0][arg1][arg2 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    field567[arg0][arg1][arg2 + 1] |= 0x492;
                    field567[arg0][arg1 + 1][arg2] |= 0x249;
                } else if (arg4 == 2) {
                    field567[arg0][arg1 + 1][arg2] |= 0x249;
                    field567[arg0][arg1][arg2] |= 0x492;
                } else if (arg4 == 3) {
                    field567[arg0][arg1][arg2] |= 0x492;
                    field567[arg0][arg1][arg2] |= 0x249;
                }
            }
            if (var9.field865 != 0 && arg7 != null) {
                arg7.method3469(arg1, arg2, arg5, arg4, var9.field855);
            }
            if (var9.field862 != 16) {
                arg6.method1721(arg0, arg1, arg2, var9.field862);
            }
        } else if (arg5 == 3) {
            class78 var32;
            if (var9.field861 == -1 && var9.field879 == null) {
                var32 = var9.method640(3, arg4, var16, var18, var17, var19);
            } else {
                var32 = new class11(arg3, 3, arg4, arg0, arg1, arg2, var9.field861, true, (class78) null);
            }
            arg6.method1719(arg0, arg1, arg2, var17, var32, (class78) null, class6.field83[arg4], 0, var20, var21);
            if (var9.field864) {
                if (arg4 == 0) {
                    field1270[arg0][arg1][arg2 + 1] = 50;
                } else if (arg4 == 1) {
                    field1270[arg0][arg1 + 1][arg2 + 1] = 50;
                } else if (arg4 == 2) {
                    field1270[arg0][arg1 + 1][arg2] = 50;
                } else if (arg4 == 3) {
                    field1270[arg0][arg1][arg2] = 50;
                }
            }
            if (var9.field865 != 0 && arg7 != null) {
                arg7.method3469(arg1, arg2, arg5, arg4, var9.field855);
            }
        } else if (arg5 == 9) {
            class78 var33;
            if (var9.field861 == -1 && var9.field879 == null) {
                var33 = var9.method640(arg5, arg4, var16, var18, var17, var19);
            } else {
                var33 = new class11(arg3, arg5, arg4, arg0, arg1, arg2, var9.field861, true, (class78) null);
            }
            arg6.method1617(arg0, arg1, arg2, var17, 1, 1, var33, 0, var20, var21);
            if (var9.field865 != 0 && arg7 != null) {
                arg7.method3460(arg1, arg2, var10, var11, var9.field855);
            }
            if (var9.field862 != 16) {
                arg6.method1721(arg0, arg1, arg2, var9.field862);
            }
        } else if (arg5 == 4) {
            class78 var34;
            if (var9.field861 == -1 && var9.field879 == null) {
                var34 = var9.method640(4, arg4, var16, var18, var17, var19);
            } else {
                var34 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field861, true, (class78) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var34, (class78) null, class6.field82[arg4], 0, 0, 0, var20, var21);
        } else if (arg5 == 5) {
            int var35 = 16;
            int var36 = arg6.method1633(arg0, arg1, arg2);
            if (var36 != 0) {
                var35 = class36.method147(var36 >> 14 & 0x7FFF).field862;
            }
            class78 var37;
            if (var9.field861 == -1 && var9.field879 == null) {
                var37 = var9.method640(4, arg4, var16, var18, var17, var19);
            } else {
                var37 = new class11(arg3, 4, arg4, arg0, arg1, arg2, var9.field861, true, (class78) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var37, (class78) null, class6.field82[arg4], 0, class6.field84[arg4] * var35, class6.field79[arg4] * var35, var20, var21);
        } else if (arg5 == 6) {
            int var38 = 8;
            int var39 = arg6.method1633(arg0, arg1, arg2);
            if (var39 != 0) {
                var38 = class36.method147(var39 >> 14 & 0x7FFF).field862 / 2;
            }
            class78 var40;
            if (var9.field861 == -1 && var9.field879 == null) {
                var40 = var9.method640(4, arg4 + 4, var16, var18, var17, var19);
            } else {
                var40 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field861, true, (class78) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var40, (class78) null, 256, arg4, class6.field86[arg4] * var38, class6.field87[arg4] * var38, var20, var21);
        } else if (arg5 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class78 var42;
            if (var9.field861 == -1 && var9.field879 == null) {
                var42 = var9.method640(4, var41 + 4, var16, var18, var17, var19);
            } else {
                var42 = new class11(arg3, 4, var41 + 4, arg0, arg1, arg2, var9.field861, true, (class78) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var42, (class78) null, 256, var41, 0, 0, var20, var21);
        } else if (arg5 == 8) {
            int var43 = 8;
            int var44 = arg6.method1633(arg0, arg1, arg2);
            if (var44 != 0) {
                var43 = class36.method147(var44 >> 14 & 0x7FFF).field862 / 2;
            }
            int var45 = arg4 + 2 & 0x3;
            class78 var46;
            class78 var47;
            if (var9.field861 == -1 && var9.field879 == null) {
                var46 = var9.method640(4, arg4 + 4, var16, var18, var17, var19);
                var47 = var9.method640(4, var45 + 4, var16, var18, var17, var19);
            } else {
                var46 = new class11(arg3, 4, arg4 + 4, arg0, arg1, arg2, var9.field861, true, (class78) null);
                var47 = new class11(arg3, 4, var45 + 4, arg0, arg1, arg2, var9.field861, true, (class78) null);
            }
            arg6.method1616(arg0, arg1, arg2, var17, var46, var47, 256, arg4, class6.field86[arg4] * var43, class6.field87[arg4] * var43, var20, var21);
        }
    }

    @ObfuscatedName("m.z(Lbz;B)V")
    public static final void method33(class60 arg0) {
        arg0.field1162 = false;
        if (arg0.field1165 != null) {
            arg0.field1165.field1161 = 0;
        }
        for (class60 var1 = arg0.method991(); var1 != null; var1 = arg0.method969()) {
            method33(var1);
        }
    }

    @ObfuscatedName("e.t(IIII)I")
    public static final int method469(int arg0, int arg1, int arg2) {
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

    @ObfuscatedName("at.v([La;II[I[II)V")
    public static void method926(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class22 var8 = arg0[var7];
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
                        var11 = arg0[var6].field575;
                        var12 = var8.field575;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field580;
                        var12 = var8.field580;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method485() ? 1 : 0;
                        var12 = var8.method485() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field574;
                        var12 = var8.field574;
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
                        var15 = arg0[var5].field575;
                        var16 = var8.field575;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field580;
                        var16 = var8.field580;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method485() ? 1 : 0;
                        var16 = var8.method485() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field574;
                        var16 = var8.field574;
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
                class22 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method926(arg0, arg1, var6, arg3, arg4);
        method926(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("n.t(I)V")
    public static void method115() {
        if (client.field378 == 0) {
            field199 = new class79(4, 104, 104, class6.field78);
            for (int var0 = 0; var0 < 4; var0++) {
                client.field314[var0] = new class197(104, 104);
            }
            field637 = new class72(512, 512);
            class28.field661 = class142.field2160;
            class28.field664 = 5;
            client.field378 = 20;
        } else if (client.field378 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class84.field1470[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class79.method1642(var1, 500, 800, 512, 334);
            class28.field661 = class142.field2161;
            class28.field664 = 10;
            client.field378 = 30;
        } else if (client.field378 == 30) {
            field283 = client.method110(0, false, true, true);
            field1839 = client.method110(1, false, true, true);
            field1965 = client.method110(2, true, false, true);
            field362 = client.method110(3, false, true, true);
            field1900 = client.method110(4, false, true, true);
            field1456 = client.method110(5, true, true, true);
            field2112 = client.method110(6, true, true, false);
            field792 = client.method110(7, false, true, true);
            field216 = client.method110(8, false, true, true);
            field1450 = client.method110(9, false, true, true);
            field285 = client.method110(10, false, true, true);
            field286 = client.method110(11, false, true, true);
            field2101 = client.method110(12, false, true, true);
            field138 = client.method110(13, true, false, true);
            field940 = client.method110(14, false, true, false);
            field155 = client.method110(15, false, true, true);
            class28.field661 = class142.field2276;
            class28.field664 = 20;
            client.field378 = 40;
        } else if (client.field378 == 40) {
            byte var6 = 0;
            int var7 = var6 + field283.method2771() * 4 / 100;
            int var8 = var7 + field1839.method2771() * 4 / 100;
            int var9 = var8 + field1965.method2771() * 2 / 100;
            int var10 = var9 + field362.method2771() * 2 / 100;
            int var11 = var10 + field1900.method2771() * 6 / 100;
            int var12 = var11 + field1456.method2771() * 4 / 100;
            int var13 = var12 + field2112.method2771() * 2 / 100;
            int var14 = var13 + field792.method2771() * 60 / 100;
            int var15 = var14 + field216.method2771() * 2 / 100;
            int var16 = var15 + field1450.method2771() * 2 / 100;
            int var17 = var16 + field285.method2771() * 2 / 100;
            int var18 = var17 + field286.method2771() * 2 / 100;
            int var19 = var18 + field2101.method2771() * 2 / 100;
            int var20 = var19 + field138.method2771() * 2 / 100;
            int var21 = var20 + field940.method2771() * 2 / 100;
            int var22 = var21 + field155.method2771() * 2 / 100;
            if (var22 == 100) {
                class28.field661 = class142.field2164;
                class28.field664 = 30;
                client.field378 = 45;
            } else {
                if (var22 != 0) {
                    class28.field661 = class142.field2212 + var22 + "%";
                }
                class28.field664 = 30;
            }
        } else if (client.field378 == 45) {
            boolean var23 = !client.field394;
            field1096 = 22050;
            field1092 = var23;
            field1075 = 2;
            class162 var24 = new class162();
            var24.method3011(9, 128);
            field609 = class50.method2761(field1680, field1589, 0, 22050);
            field609.method1005(var24);
            class161.method2576(field155, field940, field1900, var24);
            field1504 = class50.method2761(field1680, field1589, 1, 2048);
            field2370 = new class49();
            field1504.method1005(field2370);
            field1925 = new class68(22050, field1096);
            class28.field661 = class142.field2372;
            class28.field664 = 35;
            client.field378 = 50;
        } else if (client.field378 == 50) {
            int var25 = 0;
            if (field1873 == null) {
                class147 var26 = field216;
                class147 var27 = field138;
                int var28 = var26.method2738("p11_full");
                int var29 = var26.method2694(var28, "");
                class193 var30;
                if (class70.method466(var26, var28, var29)) {
                    byte[] var31 = var27.method2749(var28, var29);
                    class193 var32;
                    if (var31 == null) {
                        var32 = null;
                    } else {
                        class193 var33 = new class193(var31, field1278, field1279, field1280, field1275, field1282, field1283);
                        class70.method2513();
                        var32 = var33;
                    }
                    var30 = var32;
                } else {
                    var30 = null;
                }
                field1873 = var30;
            } else {
                var25++;
            }
            if (field1457 == null) {
                class147 var35 = field216;
                class147 var36 = field138;
                int var37 = var35.method2738("p12_full");
                int var38 = var35.method2694(var37, "");
                class193 var39;
                if (class70.method466(var35, var37, var38)) {
                    byte[] var40 = var36.method2749(var37, var38);
                    class193 var41;
                    if (var40 == null) {
                        var41 = null;
                    } else {
                        class193 var42 = new class193(var40, field1278, field1279, field1280, field1275, field1282, field1283);
                        class70.method2513();
                        var41 = var42;
                    }
                    var39 = var41;
                } else {
                    var39 = null;
                }
                field1457 = var39;
            } else {
                var25++;
            }
            if (field58 == null) {
                class147 var44 = field216;
                class147 var45 = field138;
                int var46 = var44.method2738("b12_full");
                int var47 = var44.method2694(var46, "");
                class193 var48;
                if (class70.method466(var44, var46, var47)) {
                    byte[] var49 = var45.method2749(var46, var47);
                    class193 var50;
                    if (var49 == null) {
                        var50 = null;
                    } else {
                        class193 var51 = new class193(var49, field1278, field1279, field1280, field1275, field1282, field1283);
                        class70.method2513();
                        var50 = var51;
                    }
                    var48 = var50;
                } else {
                    var48 = null;
                }
                field58 = var48;
            } else {
                var25++;
            }
            if (var25 < 3) {
                class28.field661 = class142.field2166 + var25 * 100 / 3 + "%";
                class28.field664 = 40;
            } else {
                field1567 = new class145(true);
                class28.field661 = class142.field2167;
                class28.field664 = 40;
                client.field378 = 60;
            }
        } else if (client.field378 == 60) {
            int var53 = class28.method695(field285, field216);
            int var54 = class28.method2643();
            if (var53 < var54) {
                class28.field661 = class142.field2168 + var53 * 100 / var54 + "%";
                class28.field664 = 50;
            } else {
                class28.field661 = class142.field2393;
                class28.field664 = 50;
                client.method762(5);
                client.field378 = 70;
            }
        } else if (client.field378 == 70) {
            if (field1965.method2681()) {
                class41.method1361(field1965);
                class147 var55 = field1965;
                field895 = var55;
                class147 var56 = field1965;
                class147 var57 = field792;
                field950 = var56;
                field945 = var57;
                field946 = field950.method2688(3);
                class36.method1079(field1965, field792, client.field394);
                class35.method802(field1965, field792);
                class45.method123(field1965, field792, client.field256, field1873);
                class38.method2993(field1965, field283, field1839);
                class39.method2410(field1965, field792);
                class147 var58 = field1965;
                field980 = var58;
                class46.method738(field1965);
                class152.method1598(field362, field792, field216, field138);
                class147 var59 = field1965;
                field1010 = var59;
                class147 var60 = field1965;
                field996 = var60;
                class28.field661 = class142.field2171;
                class28.field664 = 60;
                client.field378 = 80;
            } else {
                class28.field661 = class142.field2351 + field1965.method2769() + "%";
                class28.field664 = 60;
            }
        } else if (client.field378 == 80) {
            int var61 = 0;
            if (field2724 == null) {
                field2724 = class70.method509(field216, "compass", "");
            } else {
                var61++;
            }
            if (field198 == null) {
                field198 = class70.method509(field216, "mapedge", "");
            } else {
                var61++;
            }
            if (field903 == null) {
                field903 = class70.method566(field216, "mapscene", "");
            } else {
                var61++;
            }
            if (field177 == null) {
                field177 = class70.method834(field216, "mapfunction", "");
            } else {
                var61++;
            }
            if (field179 == null) {
                field179 = class70.method834(field216, "hitmarks", "");
            } else {
                var61++;
            }
            if (field154 == null) {
                field154 = class70.method834(field216, "headicons_pk", "");
            } else {
                var61++;
            }
            if (field1662 == null) {
                field1662 = class70.method834(field216, "headicons_prayer", "");
            } else {
                var61++;
            }
            if (field711 == null) {
                field711 = class70.method834(field216, "headicons_hint", "");
            } else {
                var61++;
            }
            if (field2486 == null) {
                field2486 = class70.method834(field216, "mapmarker", "");
            } else {
                var61++;
            }
            if (field2072 == null) {
                field2072 = class70.method834(field216, "cross", "");
            } else {
                var61++;
            }
            if (field45 == null) {
                field45 = class70.method834(field216, "mapdots", "");
            } else {
                var61++;
            }
            if (field68 == null) {
                field68 = class70.method566(field216, "scrollbar", "");
            } else {
                var61++;
            }
            if (field1822 == null) {
                field1822 = class70.method566(field216, "mod_icons", "");
            } else {
                var61++;
            }
            if (field597 == null) {
                field597 = class70.method519(field216, "mapback", "");
            } else {
                var61++;
            }
            if (var61 < 14) {
                class28.field661 = class142.field2302 + var61 * 100 / 14 + "%";
                class28.field664 = 70;
            } else {
                field2913 = field1822;
                field198.method1438();
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 41.0D) - 20;
                for (int var66 = 0; var66 < field177.length; var66++) {
                    field177[var66].method1515(var62 + var65, var63 + var65, var64 + var65);
                }
                field903[0].method1583(var62 + var65, var63 + var65, var64 + var65);
                field120 = new int[33];
                field1586 = new int[33];
                field126 = new int[151];
                field1293 = new int[151];
                for (int var67 = 0; var67 < 33; var67++) {
                    int var68 = 999;
                    int var69 = 0;
                    for (int var70 = 0; var70 < 34; var70++) {
                        if (field597.field1324[field597.field1317 * var67 + var70] == 0) {
                            if (var68 == 999) {
                                var68 = var70;
                            }
                        } else if (var68 != 999) {
                            var69 = var70;
                            break;
                        }
                    }
                    field120[var67] = var68;
                    field1586[var67] = var69 - var68;
                }
                for (int var71 = 5; var71 < 156; var71++) {
                    int var72 = 999;
                    int var73 = 0;
                    for (int var74 = 25; var74 < 172; var74++) {
                        if (field597.field1324[field597.field1317 * var71 + var74] == 0 && var74 > 34 || var71 > 34) {
                            if (var72 == 999) {
                                var72 = var74;
                            }
                        } else if (var72 != 999) {
                            var73 = var74;
                            break;
                        }
                    }
                    field126[var71 - 5] = var72 - 25;
                    field1293[var71 - 5] = var73 - var72;
                }
                class28.field661 = class142.field2173;
                class28.field664 = 70;
                client.field378 = 90;
            }
        } else if (client.field378 == 90) {
            if (field1450.method2681()) {
                class88 var75 = new class88(field1450, field216, 20, 0.8D, client.field394 ? 64 : 128);
                class84.method1793(var75);
                class84.method1795(0.8D);
                class28.field661 = class142.field2175;
                class28.field664 = 90;
                client.field378 = 110;
            } else {
                class28.field661 = class142.field2174 + field1450.method2769() + "%";
                class28.field664 = 90;
            }
        } else if (client.field378 == 110) {
            field1884 = new class12();
            field1680.method2463(field1884, 10);
            class28.field661 = class142.field2176;
            class28.field664 = 94;
            client.field378 = 120;
        } else if (client.field378 == 120) {
            if (field285.method2750("huffman", "")) {
                class102 var76 = new class102(field285.method2695("huffman", ""));
                field2901 = var76;
                class28.field661 = class142.field2170;
                class28.field664 = 96;
                client.field378 = 130;
            } else {
                class28.field661 = class142.field2249 + "%";
                class28.field664 = 96;
            }
        } else if (client.field378 == 130) {
            if (!field362.method2681()) {
                class28.field661 = class142.field2179 + field362.method2769() * 4 / 5 + "%";
                class28.field664 = 100;
            } else if (!field2101.method2681()) {
                class28.field661 = class142.field2179 + (80 + field2101.method2769() / 6) + "%";
                class28.field664 = 100;
            } else if (field138.method2681()) {
                class28.field661 = class142.field2180;
                class28.field664 = 100;
                client.field378 = 140;
            } else {
                class28.field661 = class142.field2179 + (96 + field138.method2769() / 20) + "%";
                class28.field664 = 100;
            }
        } else if (client.field378 == 140) {
            client.method762(10);
        }
    }

    @ObfuscatedName("aw.l(I)V")
    public static final void method567() {
        try {
            if (client.field288 == 0) {
                if (field1451 != null) {
                    field1451.method2552();
                    field1451 = null;
                }
                field1909 = null;
                client.field456 = false;
                client.field272 = 0;
                client.field288 = 1;
            }
            if (client.field288 == 1) {
                if (field1909 == null) {
                    field1909 = field1680.method2462(field151, field1000);
                }
                if (field1909.field2066 == 2) {
                    throw new IOException();
                }
                if (field1909.field2066 == 1) {
                    field1451 = new class130((Socket) field1909.field2070, field1680);
                    field1909 = null;
                    client.field288 = 2;
                }
            }
            if (client.field288 == 2) {
                client.field382.field1863 = 0;
                client.field382.method2097(14);
                field1451.method2556(client.field382.field1865, 0, 1);
                client.field297.field1863 = 0;
                client.field288 = 3;
            }
            if (client.field288 == 3) {
                if (field609 != null) {
                    field609.method1007();
                }
                if (field1504 != null) {
                    field1504.method1007();
                }
                int var0 = field1451.method2554();
                if (field609 != null) {
                    field609.method1007();
                }
                if (field1504 != null) {
                    field1504.method1007();
                }
                if (var0 != 0) {
                    method1338(var0);
                    return;
                }
                client.field297.field1863 = 0;
                client.field288 = 5;
            }
            if (client.field288 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                client.field382.field1863 = 0;
                client.field382.method2097(1);
                client.field382.method2097(class28.field680.method444());
                client.field382.method2100(var1[0]);
                client.field382.method2100(var1[1]);
                client.field382.method2100(var1[2]);
                client.field382.method2100(var1[3]);
                switch(class28.field680.field2412) {
                    case 0:
                    case 3:
                        client.field382.method2182(field669);
                        client.field382.field1863 += 5;
                        break;
                    case 1:
                        client.field382.method2100((Integer) field1087.field139.get(class199.method2480(class28.field647)));
                        client.field382.field1863 += 4;
                        break;
                    case 2:
                        client.field382.field1863 += 8;
                }
                client.field382.method2186(class28.field667);
                client.field382.method2129(class5.field69, class5.field70);
                client.field296.field1863 = 0;
                if (client.field259 == 40) {
                    client.field296.method2097(18);
                } else {
                    client.field296.method2097(16);
                }
                client.field296.method2098(0);
                int var2 = client.field296.field1863;
                client.field296.method2100(59);
                client.field296.method2105(client.field382.field1865, 0, client.field382.field1863);
                int var3 = client.field296.field1863;
                client.field296.method2186(class28.field647);
                client.field296.method2097(client.field394 ? 1 : 0);
                class110 var4 = client.field296;
                byte[] var5 = new byte[24];
                try {
                    class136.field2093.method3430(0L);
                    class136.field2093.method3432(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var39) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2105(var5, 0, 24);
                class107 var9 = new class107(field1567.method2667());
                field1567.method2674(var9);
                client.field296.method2105(var9.field1865, 0, var9.field1865.length);
                client.field296.method2100(field283.field2448);
                client.field296.method2100(field1839.field2448);
                client.field296.method2100(field1965.field2448);
                client.field296.method2100(field362.field2448);
                client.field296.method2100(field1900.field2448);
                client.field296.method2100(field1456.field2448);
                client.field296.method2100(field2112.field2448);
                client.field296.method2100(field792.field2448);
                client.field296.method2100(field216.field2448);
                client.field296.method2100(field1450.field2448);
                client.field296.method2100(field285.field2448);
                client.field296.method2100(field286.field2448);
                client.field296.method2100(field2101.field2448);
                client.field296.method2100(field138.field2448);
                client.field296.method2100(field940.field2448);
                client.field296.method2100(field155.field2448);
                client.field296.method2127(var1, var3, client.field296.field1863);
                client.field296.method2233(client.field296.field1863 - var2);
                field1451.method2556(client.field296.field1865, 0, client.field296.field1863);
                client.field382.method2341(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                client.field297.method2341(var1);
                client.field288 = 6;
            }
            if (client.field288 == 6 && field1451.method2555() > 0) {
                int var11 = field1451.method2554();
                if (var11 == 21 && client.field259 == 20) {
                    client.field288 = 7;
                } else if (var11 == 2) {
                    client.field288 = 9;
                } else if (var11 == 15 && client.field259 == 40) {
                    client.method2656();
                    return;
                } else if (var11 == 23 && client.field372 < 1) {
                    client.field372++;
                    client.field288 = 0;
                } else {
                    method1338(var11);
                    return;
                }
            }
            if (client.field288 == 7 && field1451.method2555() > 0) {
                client.field291 = (field1451.method2554() + 3) * 60;
                client.field288 = 8;
            }
            if (client.field288 == 8) {
                client.field272 = 0;
                class28.method1851(class142.field2259, class142.field2322, client.field291 / 60 + class142.field2314);
                if (--client.field291 <= 0) {
                    client.field288 = 0;
                }
            } else {
                if (client.field288 == 9 && field1451.method2555() >= 13) {
                    boolean var12 = field1451.method2554() == 1;
                    field1451.method2567(client.field297.field1865, 0, 4);
                    client.field297.field1863 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = client.field297.method2343() << 24;
                        int var15 = var14 | client.field297.method2343() << 16;
                        int var16 = var15 | client.field297.method2343() << 8;
                        int var17 = var16 | client.field297.method2343();
                        int var18 = class199.method2480(class28.field647);
                        if (field1087.field139.size() >= 10 && !field1087.field139.containsKey(var18)) {
                            Iterator var19 = field1087.field139.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        field1087.field139.put(var18, var17);
                        class9.method2790();
                    }
                    client.field423 = field1451.method2554();
                    client.field425 = field1451.method2554() == 1;
                    client.field379 = field1451.method2554();
                    client.field379 <<= 0x8;
                    client.field379 += field1451.method2554();
                    client.field380 = field1451.method2554();
                    field1451.method2567(client.field297.field1865, 0, 1);
                    client.field297.field1863 = 0;
                    client.field299 = client.field297.method2343();
                    field1451.method2567(client.field297.field1865, 0, 2);
                    client.field297.field1863 = 0;
                    client.field464 = client.field297.method2232();
                    if (client.field380 == 1) {
                        try {
                            class119.method2428(field251, "zap");
                        } catch (Throwable var38) {
                        }
                    } else {
                        try {
                            class119.method2428(field251, "unzap");
                        } catch (Throwable var37) {
                        }
                    }
                    client.field288 = 10;
                }
                if (client.field288 != 10) {
                    client.field272++;
                    if (client.field272 > 2000) {
                        if (client.field372 < 1) {
                            if (field998 == field1000) {
                                field1000 = field2679;
                            } else {
                                field1000 = field998;
                            }
                            client.field372++;
                            client.field288 = 0;
                        } else {
                            method1338(-3);
                        }
                    }
                } else if (field1451.method2555() >= client.field464) {
                    client.field297.field1863 = 0;
                    field1451.method2567(client.field297.field1865, 0, client.field464);
                    client.field486 = 1L;
                    client.field320 = -1;
                    field1884.field180 = 0;
                    field626 = true;
                    client.field266 = true;
                    client.field476 = -1L;
                    class189.field2888 = new class180();
                    client.field382.field1863 = 0;
                    client.field297.field1863 = 0;
                    client.field299 = -1;
                    client.field434 = -1;
                    client.field400 = -1;
                    client.field305 = -1;
                    client.field300 = 0;
                    client.field268 = 0;
                    client.field254 = 0;
                    client.field338 = 0;
                    client.field398 = 0;
                    client.field396 = false;
                    class127.field2005 = 0;
                    method83();
                    client.field409 = 0;
                    client.field411 = false;
                    client.field497 = 0;
                    client.field318 = (int) (Math.random() * 100.0D) - 50;
                    client.field415 = (int) (Math.random() * 110.0D) - 55;
                    client.field431 = (int) (Math.random() * 80.0D) - 40;
                    client.field463 = (int) (Math.random() * 120.0D) - 60;
                    client.field327 = (int) (Math.random() * 30.0D) - 20;
                    client.field511 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    client.field437 = 0;
                    client.field479 = -1;
                    client.field392 = 0;
                    client.field485 = 0;
                    client.field279 = class18.field523;
                    client.field374 = 0;
                    client.field293 = 0;
                    for (int var22 = 0; var22 < 2048; var22++) {
                        client.field311[var22] = null;
                        client.field351[var22] = null;
                    }
                    for (int var23 = 0; var23 < 32768; var23++) {
                        client.field292[var23] = null;
                    }
                    field555 = client.field311[2047] = new class3();
                    client.field387 = -1;
                    client.field503.method3189();
                    client.field391.method3189();
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 104; var25++) {
                            for (int var26 = 0; var26 < 104; var26++) {
                                client.field302[var24][var25][var26] = null;
                            }
                        }
                    }
                    client.field389 = new class177();
                    client.field395 = 0;
                    client.field369 = 0;
                    client.field508 = 0;
                    for (int var27 = 0; var27 < field1062; var27++) {
                        class46 var28 = class46.method113(var27);
                        if (var28 != null) {
                            class154.field2663[var27] = 0;
                            class154.field2665[var27] = 0;
                        }
                    }
                    for (int var29 = 0; var29 < client.field440.length; var29++) {
                        client.field440[var29] = -1;
                    }
                    client.field424 = -1;
                    if (client.field416 != -1) {
                        int var30 = client.field416;
                        if (var30 != -1 && field2668[var30]) {
                            field1350.method2690(var30);
                            if (field2634[var30] != null) {
                                boolean var31 = true;
                                for (int var32 = 0; var32 < field2634[var30].length; var32++) {
                                    if (field2634[var30][var32] != null) {
                                        if (field2634[var30][var32].field2536 == 2) {
                                            var31 = false;
                                        } else {
                                            field2634[var30][var32] = null;
                                        }
                                    }
                                }
                                if (var31) {
                                    field2634[var30] = null;
                                }
                                field2668[var30] = false;
                            }
                        }
                    }
                    for (class4 var33 = (class4) client.field417.method3166(); var33 != null; var33 = (class4) client.field417.method3168()) {
                        client.method740(var33, true);
                    }
                    client.field416 = -1;
                    client.field417 = new class174(8);
                    client.field420 = null;
                    client.field396 = false;
                    client.field398 = 0;
                    client.field373.method2918((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var34 = 0; var34 < 8; var34++) {
                        client.field328[var34] = null;
                        client.field326[var34] = false;
                    }
                    class14.method2639();
                    client.field264 = true;
                    for (int var35 = 0; var35 < 100; var35++) {
                        client.field460[var35] = true;
                    }
                    client.field331 = null;
                    field172 = 0;
                    field2404 = null;
                    field618 = -1;
                    client.method1(false);
                    client.field299 = -1;
                }
            }
        } catch (IOException var40) {
            if (client.field372 < 1) {
                if (field998 == field1000) {
                    field1000 = field2679;
                } else {
                    field1000 = field998;
                }
                client.field372++;
                client.field288 = 0;
            } else {
                method1338(-2);
            }
        }
    }

    @ObfuscatedName("bb.h(IB)V")
    public static void method1338(int arg0) {
        if (arg0 == -3) {
            class28.method1851(class142.field2187, class142.field2188, class142.field2257);
        } else if (arg0 == -2) {
            class28.method1851(class142.field2163, class142.field2191, class142.field2192);
        } else if (arg0 == -1) {
            class28.method1851(class142.field2193, class142.field2194, class142.field2195);
        } else if (arg0 == 3) {
            class28.method1851(class142.field2300, class142.field2222, class142.field2198);
        } else if (arg0 == 4) {
            class28.method1851(class142.field2199, class142.field2197, class142.field2359);
        } else if (arg0 == 5) {
            class28.method1851(class142.field2202, class142.field2339, class142.field2230);
        } else if (arg0 == 6) {
            class28.method1851(class142.field2386, class142.field2206, class142.field2207);
        } else if (arg0 == 7) {
            class28.method1851(class142.field2208, class142.field2209, class142.field2177);
        } else if (arg0 == 8) {
            class28.method1851(class142.field2269, class142.field2154, class142.field2213);
        } else if (arg0 == 9) {
            class28.method1851(class142.field2214, class142.field2338, class142.field2189);
        } else if (arg0 == 10) {
            class28.method1851(class142.field2217, class142.field2218, class142.field2200);
        } else if (arg0 == 11) {
            class28.method1851(class142.field2220, class142.field2221, class142.field2274);
        } else if (arg0 == 12) {
            class28.method1851(class142.field2223, class142.field2224, class142.field2225);
        } else if (arg0 == 13) {
            class28.method1851(class142.field2226, class142.field2227, class142.field2228);
        } else if (arg0 == 14) {
            class28.method1851(class142.field2172, class142.field2333, class142.field2263);
        } else if (arg0 == 16) {
            class28.method1851(class142.field2275, class142.field2233, class142.field2234);
        } else if (arg0 == 17) {
            class28.method1851(class142.field2235, class142.field2236, class142.field2237);
        } else if (arg0 == 18) {
            class28.method1851(class142.field2238, class142.field2239, class142.field2240);
        } else if (arg0 == 19) {
            class28.method1851(class142.field2241, class142.field2242, class142.field2148);
        } else if (arg0 == 20) {
            class28.method1851(class142.field2244, class142.field2185, class142.field2246);
        } else if (arg0 == 22) {
            class28.method1851(class142.field2273, class142.field2196, class142.field2292);
        } else if (arg0 == 23) {
            class28.method1851(class142.field2151, class142.field2251, class142.field2288);
        } else if (arg0 == 24) {
            class28.method1851(class142.field2253, class142.field2366, class142.field2255);
        } else if (arg0 == 25) {
            class28.method1851(class142.field2256, class142.field2219, class142.field2258);
        } else if (arg0 == 26) {
            class28.method1851(class142.field2319, class142.field2162, class142.field2287);
        } else if (arg0 == 27) {
            class28.method1851(class142.field2365, class142.field2360, class142.field2301);
        } else if (arg0 == 31) {
            class28.method1851(class142.field2271, class142.field2272, class142.field2261);
        } else if (arg0 == 32) {
            class28.method1851(class142.field2396, class142.field2336, class142.field2281);
        } else if (arg0 == 37) {
            class28.method1851(class142.field2277, class142.field2278, class142.field2279);
        } else if (arg0 == 38) {
            class28.method1851(class142.field2280, class142.field2264, class142.field2282);
        } else if (arg0 == 55) {
            class28.method1851(class142.field2385, class142.field2186, class142.field2285);
        } else if (arg0 == 56) {
            class28.method1851(class142.field2286, class142.field2181, class142.field2361);
            client.method762(11);
            return;
        } else if (arg0 == 57) {
            class28.method1851(class142.field2289, class142.field2254, class142.field2291);
            client.method762(11);
            return;
        } else {
            class28.method1851(class142.field2290, class142.field2283, class142.field2294);
        }
        client.method762(10);
    }

    @ObfuscatedName("k.ai(B)V")
    public static final void method2() {
        for (int var0 = -1; var0 < client.field374; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = client.field317[var0];
            }
            class3 var2 = client.field311[var1];
            if (var2 != null) {
                client.method520(var2, 1);
            }
        }
    }

    @ObfuscatedName("ad.ax(I)V")
    public static final void method835() {
        if (client.field416 != -1) {
            int var0 = client.field416;
            if (class152.method565(var0)) {
                client.method101(field2634[var0], -1);
            }
        }
        for (int var1 = 0; var1 < client.field458; var1++) {
            if (client.field460[var1]) {
                client.field414[var1] = true;
            }
            client.field346[var1] = client.field460[var1];
            client.field460[var1] = false;
        }
        client.field459 = client.field261;
        client.field433 = -1;
        client.field406 = -1;
        field2722 = null;
        if (client.field416 != -1) {
            client.field458 = 0;
            client.method465(client.field416, 0, 0, 765, 503, 0, 0, -1);
        }
        class73.method1519();
        if (client.field396) {
            client.method1362();
        } else if (client.field433 != -1) {
            int var2 = client.field433;
            int var3 = client.field406;
            if (client.field398 >= 2 || client.field409 != 0 || client.field411) {
                String var4;
                if (client.field409 == 1 && client.field398 < 2) {
                    var4 = class142.field2334 + class142.field2308 + client.field410 + " " + class2.field21;
                } else if (client.field411 && client.field398 < 2) {
                    var4 = client.field442 + class142.field2308 + client.field399 + " " + class2.field21;
                } else {
                    var4 = client.method119(client.field398 - 1);
                }
                if (client.field398 > 2) {
                    var4 = var4 + class2.method3305(16777215) + " " + '/' + " " + (client.field398 - 2) + class142.field2247;
                }
                field58.method3328(var4, var2 + 4, var3 + 15, 16777215, 0, client.field261 / 1000);
            }
        }
        if (client.field467 == 3) {
            for (int var5 = 0; var5 < client.field458; var5++) {
                if (client.field346[var5]) {
                    class73.method1525(client.field265[var5], client.field287[var5], client.field465[var5], client.field357[var5], 16711935, 128);
                } else if (client.field414[var5]) {
                    class73.method1525(client.field265[var5], client.field287[var5], client.field465[var5], client.field357[var5], 16711680, 128);
                }
            }
        }
        int var6 = field207;
        int var7 = field555.field730;
        int var8 = field555.field780;
        int var9 = client.field330;
        for (class20 var10 = (class20) class20.field546.method3195(); var10 != null; var10 = (class20) class20.field546.method3212()) {
            if (var10.field545 != -1 || var10.field549 != null) {
                int var11 = 0;
                if (var7 > var10.field542) {
                    var11 += var7 - var10.field542;
                } else if (var7 < var10.field550) {
                    var11 += var10.field550 - var7;
                }
                if (var8 > var10.field543) {
                    var11 += var8 - var10.field543;
                } else if (var8 < var10.field548) {
                    var11 += var10.field548 - var8;
                }
                if (var11 - 64 > var10.field544 || client.field491 == 0 || var10.field539 != var6) {
                    if (var10.field541 != null) {
                        field2370.method977(var10.field541);
                        var10.field541 = null;
                    }
                    if (var10.field551 != null) {
                        field2370.method977(var10.field551);
                        var10.field551 = null;
                    }
                } else {
                    var11 -= 64;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    int var12 = client.field491 * (var10.field544 - var11) / var10.field544;
                    class52 var10000;
                    if (var10.field541 != null) {
                        var10.field541.method1114(var12);
                    } else if (var10.field545 >= 0) {
                        var10000 = (class52) null;
                        class52 var13 = class52.method1053(field1900, var10.field545, 0);
                        if (var13 != null) {
                            class56 var14 = var13.method1051().method1089(field1925);
                            class58 var15 = class58.method1110(var14, 100, var12);
                            var15.method1113(-1);
                            field2370.method967(var15);
                            var10.field541 = var15;
                        }
                    }
                    if (var10.field551 != null) {
                        var10.field551.method1114(var12);
                        if (!var10.field551.method3278()) {
                            var10.field551 = null;
                        }
                    } else if (var10.field549 != null && (var10.field538 -= var9) <= 0) {
                        int var16 = (int) (Math.random() * (double) var10.field549.length);
                        var10000 = (class52) null;
                        class52 var17 = class52.method1053(field1900, var10.field549[var16], 0);
                        if (var17 != null) {
                            class56 var18 = var17.method1051().method1089(field1925);
                            class58 var19 = class58.method1110(var18, 100, var12);
                            var19.method1113(0);
                            field2370.method967(var19);
                            var10.field551 = var19;
                            var10.field538 = var10.field547 + (int) (Math.random() * (double) (var10.field556 - var10.field547));
                        }
                    }
                }
            }
        }
        client.field330 = 0;
    }

    @ObfuscatedName("bb.af(Lan;IIIIII)V")
    public static final void method1332(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method12()) {
            return;
        }
        if (arg0 instanceof class30) {
            class35 var6 = ((class30) arg0).field698;
            if (var6.field800 != null) {
                var6 = var6.method601();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < client.field374) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field30) {
                return;
            }
            if (var8.field28 != -1 || var8.field31 != -1) {
                client.method789(arg0, arg0.field778 + 15);
                if (client.field487 > -1) {
                    if (var8.field28 != -1) {
                        field154[var8.field28].method1512(client.field487 + arg2 - 12, client.field477 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field31 != -1) {
                        field1662[var8.field31].method1512(client.field487 + arg2 - 12, client.field477 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && client.field338 == 10 && client.field271 == client.field317[arg1]) {
                client.method789(arg0, arg0.field778 + 15);
                if (client.field487 > -1) {
                    field711[1].method1512(client.field487 + arg2 - 12, client.field477 + arg3 - var7);
                }
            }
        } else {
            class35 var9 = ((class30) arg0).field698;
            if (var9.field800 != null) {
                var9 = var9.method601();
            }
            if (var9.field824 >= 0 && var9.field824 < field1662.length) {
                client.method789(arg0, arg0.field778 + 15);
                if (client.field487 > -1) {
                    field1662[var9.field824].method1512(client.field487 + arg2 - 12, client.field477 + arg3 - 30);
                }
            }
            if (client.field338 == 1 && client.field270 == client.field294[arg1 - client.field374] && client.field261 % 20 < 10) {
                client.method789(arg0, arg0.field778 + 15);
                if (client.field487 > -1) {
                    field711[0].method1512(client.field487 + arg2 - 12, client.field477 + arg3 - 28);
                }
            }
        }
        if (arg0.field743 != null && (arg1 >= client.field374 || client.field469 == 4 || !arg0.field744 && (client.field469 == 0 || client.field469 == 3 || client.field469 == 1 && client.method517(((class3) arg0).field43, false)))) {
            client.method789(arg0, arg0.field778);
            if (client.field487 > -1 && client.field349 < client.field347) {
                client.field250[client.field349] = field58.method3375(arg0.field743) / 2;
                client.field295[client.field349] = field58.field2919;
                client.field348[client.field349] = client.field487;
                client.field358[client.field349] = client.field477;
                client.field352[client.field349] = arg0.field747;
                client.field353[client.field349] = arg0.field764;
                client.field354[client.field349] = arg0.field731;
                client.field355[client.field349] = arg0.field743;
                client.field349++;
            }
        }
        if (arg0.field751 > client.field261) {
            client.method789(arg0, arg0.field778 + 15);
            if (client.field487 > -1) {
                int var10;
                if (arg1 < client.field374) {
                    var10 = 30;
                } else {
                    class35 var11 = ((class30) arg0).field698;
                    var10 = var11.field832;
                }
                int var12 = arg0.field752 * var10 / arg0.field753;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field752 > 0) {
                    var12 = 1;
                }
                class73.method1527(client.field487 + arg2 - var10 / 2, client.field477 + arg3 - 3, var12, 5, 65280);
                class73.method1527(client.field487 + arg2 - var10 / 2 + var12, client.field477 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field735[var13] > client.field261) {
                client.method789(arg0, arg0.field778 / 2);
                if (client.field487 > -1) {
                    if (var13 == 1) {
                        client.field477 -= 20;
                    }
                    if (var13 == 2) {
                        client.field487 -= 15;
                        client.field477 -= 10;
                    }
                    if (var13 == 3) {
                        client.field487 += 15;
                        client.field477 -= 10;
                    }
                    field179[arg0.field749[var13]].method1512(client.field487 + arg2 - 12, client.field477 + arg3 - 12);
                    field1873.method3323(Integer.toString(arg0.field748[var13]), client.field487 + arg2 - 1, client.field477 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("cb.bi(IIB)V")
    public static final void method1959(int arg0, int arg1) {
        int var2 = field58.method3375(class142.field2216);
        for (int var3 = 0; var3 < client.field398; var3++) {
            int var4 = field58.method3375(client.method119(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = client.field398 * 15 + 21;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > 765) {
            var6 = 765 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        client.field396 = true;
        field1008 = var6;
        field1663 = var7;
        field397 = var2;
        field1533 = client.field398 * 15 + 22;
    }

    @ObfuscatedName("dg.bg(IIIIB)V")
    public static void method2382(int arg0, int arg1, int arg2, int arg3) {
        class152 var4 = class152.method696(arg0, arg1);
        if (var4 != null && var4.field2589 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field8 = var4.field2589;
            class32.method1033(var5);
        }
        client.field413 = arg3;
        client.field411 = true;
        field561 = arg0;
        client.field412 = arg1;
        field2595 = arg2;
        client.method3127(var4);
    }

    @ObfuscatedName("y.cn(I)V")
    public static final void method25() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < client.field398 - 1; var1++) {
                if (client.field401[var1] < 1000 && client.field401[var1 + 1] > 1000) {
                    String var2 = client.field404[var1];
                    client.field404[var1] = client.field404[var1 + 1];
                    client.field404[var1 + 1] = var2;
                    String var3 = client.field498[var1];
                    client.field498[var1] = client.field498[var1 + 1];
                    client.field498[var1 + 1] = var3;
                    int var4 = client.field401[var1];
                    client.field401[var1] = client.field401[var1 + 1];
                    client.field401[var1 + 1] = var4;
                    int var5 = client.field384[var1];
                    client.field384[var1] = client.field384[var1 + 1];
                    client.field384[var1 + 1] = var5;
                    int var6 = client.field492[var1];
                    client.field492[var1] = client.field492[var1 + 1];
                    client.field492[var1 + 1] = var6;
                    int var7 = client.field402[var1];
                    client.field402[var1] = client.field402[var1 + 1];
                    client.field402[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("w.cu(B)V")
    public static void method27() {
        for (class4 var0 = (class4) client.field417.method3166(); var0 != null; var0 = (class4) client.field417.method3168()) {
            int var1 = var0.field56;
            if (class152.method565(var1)) {
                boolean var2 = true;
                class152[] var3 = field2634[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2533;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2877;
                    class152 var6 = method480(var5);
                    if (var6 != null) {
                        client.method3127(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.dx(II)V")
    public static void method157(int arg0) {
        for (class179 var1 = (class179) client.field298.method3166(); var1 != null; var1 = (class179) client.field298.method3168()) {
            if ((long) arg0 == (var1.field2877 >> 48 & 0xFFFFL)) {
                var1.method3275();
            }
        }
    }
}
