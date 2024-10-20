package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Statics {

    @ObfuscatedName("ae.ec")
    public static class75[] field1043;

    @ObfuscatedName("ak.ca")
    public static int field1047;

    @ObfuscatedName("ak.y")
    public static long field1048;

    @ObfuscatedName("ak.p")
    public static class151 field1049;

    @ObfuscatedName("ao.p")
    public static class48 field1058;

    @ObfuscatedName("z.ap")
    public static class137 field106;

    @ObfuscatedName("aa.c")
    public static boolean field1067;

    @ObfuscatedName("aa.d")
    public static int field1071;

    @ObfuscatedName("z.np")
    public static class51 field108;

    @ObfuscatedName("aa.hk")
    public static int field1082;

    @ObfuscatedName("aa.be")
    public static class152 field1083;

    @ObfuscatedName("p.eo")
    public static class75[] field11;

    @ObfuscatedName("bi.f")
    public static int[] field1107;

    @ObfuscatedName("bi.u")
    public static int field1111;

    @ObfuscatedName("bi.t")
    public static int[] field1113;

    @ObfuscatedName("bi.bg")
    public static class152 field1114;

    @ObfuscatedName("bi.pv")
    public static class127 field1115;

    @ObfuscatedName("o.nr")
    public static class51 field112;

    @ObfuscatedName("br.o")
    public static float field1134;

    @ObfuscatedName("br.k")
    public static int field1138;

    @ObfuscatedName("o.iz")
    public static int field115;

    @ObfuscatedName("bu.s")
    public static int[] field1164;

    @ObfuscatedName("bu.h")
    public static int[] field1172;

    @ObfuscatedName("bu.m")
    public static boolean[] field1173;

    @ObfuscatedName("bc.t")
    public static float[] field1186;

    @ObfuscatedName("bc.u")
    public static class63[] field1187;

    @ObfuscatedName("bc.i")
    public static float[] field1188;

    @ObfuscatedName("bc.o")
    public static int field1189;

    @ObfuscatedName("o.mu")
    public static byte field119;

    @ObfuscatedName("bc.k")
    public static int field1190;

    @ObfuscatedName("bc.w")
    public static class62[] field1192;

    @ObfuscatedName("bc.m")
    public static class68[] field1193;

    @ObfuscatedName("bc.z")
    public static byte[] field1194;

    @ObfuscatedName("bc.q")
    public static class55[] field1195;

    @ObfuscatedName("bc.l")
    public static float[] field1196;

    @ObfuscatedName("bc.e")
    public static boolean[] field1197;

    @ObfuscatedName("bc.am")
    public static int[] field1198;

    @ObfuscatedName("p.iy")
    public static int field12;

    @ObfuscatedName("bc.v")
    public static float[] field1204;

    @ObfuscatedName("bc.h")
    public static int field1206;

    @ObfuscatedName("bc.s")
    public static int field1207;

    @ObfuscatedName("bc.aw")
    public static float[] field1208;

    @ObfuscatedName("bc.ar")
    public static float[] field1209;

    @ObfuscatedName("bc.af")
    public static float[] field1210;

    @ObfuscatedName("bc.ax")
    public static int[] field1212;

    @ObfuscatedName("bc.b")
    public static int[] field1213;

    @ObfuscatedName("bd.b")
    public static String[] field1242;

    @ObfuscatedName("bd.kl")
    public static int field1250;

    @ObfuscatedName("bx.ey")
    public static class73[] field1269;

    @ObfuscatedName("bx.h")
    public static class207 field1270;

    @ObfuscatedName("bx.as")
    public static boolean field1271;

    @ObfuscatedName("bl.y")
    public static int field1278;

    @ObfuscatedName("bl.d")
    public static int field1279;

    @ObfuscatedName("bl.c")
    public static int[] field1280;

    @ObfuscatedName("bl.fx")
    public static int field1281;

    @ObfuscatedName("bl.o")
    public static int[] field1282;

    @ObfuscatedName("bl.k")
    public static byte[][] field1283;

    @ObfuscatedName("bl.r")
    public static int[] field1287;

    @ObfuscatedName("k.co")
    public static char field129;

    @ObfuscatedName("bm.m")
    public static class163 field1293;

    @ObfuscatedName("p.me")
    public static class22[] field13;

    @ObfuscatedName("k.ix")
    public static int field130;

    @ObfuscatedName("bh.q")
    public static int field1308;

    @ObfuscatedName("bh.u")
    public static int field1309;

    @ObfuscatedName("bh.w")
    public static int[] field1311;

    @ObfuscatedName("bv.u")
    public static int[] field1329;

    @ObfuscatedName("ba.pm")
    public static Image field1340;

    @ObfuscatedName("cb.ax")
    public static int field1345;

    @ObfuscatedName("cb.af")
    public static int field1361;

    @ObfuscatedName("cb.j")
    public static int field1363;

    @ObfuscatedName("cb.a")
    public static int field1364;

    @ObfuscatedName("cb.x")
    public static int field1365;

    @ObfuscatedName("cb.n")
    public static int field1366;

    @ObfuscatedName("cb.v")
    public static int field1367;

    @ObfuscatedName("cb.l")
    public static int field1368;

    @ObfuscatedName("cb.t")
    public static int field1369;

    @ObfuscatedName("s.as")
    public static String field137;

    @ObfuscatedName("cb.i")
    public static int field1370;

    @ObfuscatedName("cb.aw")
    public static int field1371;

    @ObfuscatedName("cb.ar")
    public static int field1372;

    @ObfuscatedName("cb.bw")
    public static int field1378;

    @ObfuscatedName("s.bc")
    public static class152 field138;

    @ObfuscatedName("cb.g")
    public static int field1382;

    @ObfuscatedName("cb.am")
    public static int field1384;

    @ObfuscatedName("cb.bb")
    public static int field1398;

    @ObfuscatedName("cb.bk")
    public static boolean[][] field1401;

    @ObfuscatedName("cb.br")
    public static int field1402;

    @ObfuscatedName("cb.bg")
    public static int field1403;

    @ObfuscatedName("cb.bp")
    public static int field1404;

    @ObfuscatedName("cb.bu")
    public static int field1406;

    @ObfuscatedName("cx.qc")
    public static boolean field1413;

    @ObfuscatedName("cx.de")
    public static int field1414;

    @ObfuscatedName("cx.w")
    public static class54 field1421;

    @ObfuscatedName("cx.ao")
    public static class73[] field1423;

    @ObfuscatedName("cx.t")
    public static int[] field1425;

    @ObfuscatedName("cd.ip")
    public static class157 field1439;

    @ObfuscatedName("cd.bn")
    public static class23[] field1446;

    @ObfuscatedName("cd.bl")
    public static String field1447;

    @ObfuscatedName("cu.bf")
    public static FontMetrics field1453;

    @ObfuscatedName("ct.m")
    public static int field1463;

    @ObfuscatedName("ct.h")
    public static int field1469;

    @ObfuscatedName("ct.a")
    public static int field1471;

    @ObfuscatedName("ct.v")
    public static int field1474;

    @ObfuscatedName("ct.n")
    public static int field1475;

    @ObfuscatedName("ct.l")
    public static int field1476;

    @ObfuscatedName("ct.x")
    public static int field1477;

    @ObfuscatedName("ct.ar")
    public static class86 field1479;

    @ObfuscatedName("ct.t")
    public static int field1482;

    @ObfuscatedName("cg.nb")
    public static int field1490;

    @ObfuscatedName("cg.q")
    public static class156 field1493;

    @ObfuscatedName("h.j")
    public static int[] field150;

    @ObfuscatedName("co.ea")
    public static class73[] field1508;

    @ObfuscatedName("co.br")
    public static class152 field1509;

    @ObfuscatedName("h.nz")
    public static int field151;

    @ObfuscatedName("cm.pb")
    public static int field1517;

    @ObfuscatedName("cf.ef")
    public static class73[] field1526;

    @ObfuscatedName("cj.ou")
    public static class150 field1576;

    @ObfuscatedName("m.fi")
    public static int field159;

    @ObfuscatedName("m.eq")
    public static class73[] field165;

    @ObfuscatedName("cr.ov")
    public static class125 field1651;

    @ObfuscatedName("cz.z")
    public static byte[][][] field1663;

    @ObfuscatedName("cz.aa")
    public static class75[] field1666;

    @ObfuscatedName("cy.bn")
    public static int field1698;

    @ObfuscatedName("cy.be")
    public static int field1740;

    @ObfuscatedName("cy.bi")
    public static int field1741;

    @ObfuscatedName("w.cu")
    public static class134 field175;

    @ObfuscatedName("cn.p")
    public static String field1756;

    @ObfuscatedName("cn.nt")
    public static int field1757;

    @ObfuscatedName("cn.qw")
    public static String field1759;

    @ObfuscatedName("ce.be")
    public static class75 field1798;

    @ObfuscatedName("cl.dy")
    public static int field1804;

    @ObfuscatedName("cl.q")
    public static int[] field1808;

    @ObfuscatedName("cv.cm")
    public static int field1812;

    @ObfuscatedName("cv.f")
    public static class67 field1816;

    @ObfuscatedName("de.f")
    public static byte[][][] field1819;

    @ObfuscatedName("dw.r")
    public static class151 field1823;

    @ObfuscatedName("dw.p")
    public static long field1825;

    @ObfuscatedName("q.pn")
    public static int field183;

    @ObfuscatedName("da.no")
    public static int field1832;

    @ObfuscatedName("q.cy")
    public static class207 field184;

    @ObfuscatedName("q.k")
    public static short[] field185;

    @ObfuscatedName("dj.py")
    public static int field1875;

    @ObfuscatedName("dn.s")
    public static int field1879;

    @ObfuscatedName("dn.p")
    public static int field1881;

    @ObfuscatedName("dz.en")
    public static int[] field1882;

    @ObfuscatedName("dz.if")
    public static class28 field1884;

    @ObfuscatedName("dz.b")
    public static int field1886;

    @ObfuscatedName("do.jf")
    public static int field1887;

    @ObfuscatedName("do.oa")
    public static long field1889;

    @ObfuscatedName("do.el")
    public static class75[] field1891;

    @ObfuscatedName("do.bu")
    public static class152 field1893;

    @ObfuscatedName("dx.pk")
    public static int field1904;

    @ObfuscatedName("u.nf")
    public static int field192;

    @ObfuscatedName("dy.nc")
    public static int field1923;

    @ObfuscatedName("dl.bt")
    public static class152 field1928;

    @ObfuscatedName("di.g")
    public static int[] field1939;

    @ObfuscatedName("dv.y")
    public static File field1945;

    @ObfuscatedName("df.bp")
    public static class152 field1957;

    @ObfuscatedName("u.ew")
    public static class73[] field198;

    @ObfuscatedName("dt.os")
    public static class9 field1993;

    @ObfuscatedName("dh.pq")
    public static class72 field1994;

    @ObfuscatedName("ez.ai")
    public static class152 field2003;

    @ObfuscatedName("ej.z")
    public static int field2034;

    @ObfuscatedName("ej.e")
    public static class110 field2035;

    @ObfuscatedName("ej.ad")
    public static class137 field2037;

    @ObfuscatedName("ev.eg")
    public static class73[] field2052;

    @ObfuscatedName("ec.y")
    public static String field2081;

    @ObfuscatedName("ec.d")
    public static int field2082;

    @ObfuscatedName("ec.bn")
    public static class152 field2085;

    @ObfuscatedName("ec.p")
    public static Applet field2089;

    @ObfuscatedName("ek.f")
    public static int field2091;

    @ObfuscatedName("ek.c")
    public static File field2093;

    @ObfuscatedName("ek.r")
    public static File field2096;

    @ObfuscatedName("ek.ao")
    public static long field2099;

    @ObfuscatedName("e.dz")
    public static byte[][] field210;

    @ObfuscatedName("eh.k")
    public static class75 field2109;

    @ObfuscatedName("e.gm")
    public static class157 field212;

    @ObfuscatedName("ea.w")
    public static int[] field2124;

    @ObfuscatedName("e.ds")
    public static int[] field213;

    @ObfuscatedName("ef.mw")
    public static class73 field2142;

    @ObfuscatedName("ey.eu")
    public static class75 field2148;

    @ObfuscatedName("e.cz")
    public static class207 field215;

    @ObfuscatedName("eq.fq")
    public static int field2161;

    @ObfuscatedName("y.gs")
    public static class157 field22;

    @ObfuscatedName("b.ae")
    public static class134 field225;

    @ObfuscatedName("b.ay")
    public static class17 field226;

    @ObfuscatedName("b.e")
    public static String[] field227;

    @ObfuscatedName("b.pc")
    public static Frame field228;

    @ObfuscatedName("client.s")
    public static class195 field237;

    @ObfuscatedName("y.cl")
    public static int field24;

    @ObfuscatedName("client.bk")
    public static class152 field242;

    @ObfuscatedName("el.bh")
    public static int field2429;

    @ObfuscatedName("eu.jc")
    public static int field2466;

    @ObfuscatedName("es.hr")
    public static class3 field2498;

    @ObfuscatedName("ed.a")
    public static int[] field2503;

    @ObfuscatedName("ed.ph")
    public static int field2508;

    @ObfuscatedName("er.bq")
    public static int field2515;

    @ObfuscatedName("et.d")
    public static long field2517;

    @ObfuscatedName("et.ai")
    public static class75[] field2518;

    @ObfuscatedName("et.w")
    public static boolean field2527;

    @ObfuscatedName("et.du")
    public static int field2535;

    @ObfuscatedName("fy.c")
    public static class151 field2542;

    @ObfuscatedName("fy.r")
    public static class151 field2543;

    @ObfuscatedName("fy.ff")
    public static int field2599;

    @ObfuscatedName("y.dn")
    public static int[][] field26;

    @ObfuscatedName("client.aa")
    public static class152 field264;

    @ObfuscatedName("fy.p")
    public static class157[][] field2641;

    @ObfuscatedName("fy.d")
    public static boolean[] field2645;

    @ObfuscatedName("client.bw")
    public static class152 field266;

    @ObfuscatedName("fe.kd")
    public static int field2671;

    @ObfuscatedName("fj.o")
    public static class75[] field2678;

    @ObfuscatedName("fi.p")
    public static class134 field2687;

    @ObfuscatedName("fi.m")
    public static class157 field2691;

    @ObfuscatedName("fi.er")
    public static int[] field2693;

    @ObfuscatedName("fx.z")
    public static short[] field2700;

    @ObfuscatedName("fx.b")
    public static int[] field2701;

    @ObfuscatedName("fx.s")
    public static short[][] field2702;

    @ObfuscatedName("fx.o")
    public static short[][] field2705;

    @ObfuscatedName("fx.es")
    public static int[] field2707;

    @ObfuscatedName("fb.o")
    public static int field2735;

    @ObfuscatedName("fb.h")
    public static boolean field2736;

    @ObfuscatedName("fb.d")
    public static class151 field2737;

    @ObfuscatedName("fb.c")
    public static class167 field2738;

    @ObfuscatedName("fb.p")
    public static class151 field2741;

    @ObfuscatedName("fb.k")
    public static int field2742;

    @ObfuscatedName("fb.f")
    public static class151 field2744;

    @ObfuscatedName("fb.dp")
    public static int[] field2745;

    @ObfuscatedName("fb.y")
    public static class151 field2746;

    @ObfuscatedName("fc.eb")
    public static class73 field2815;

    @ObfuscatedName("fd.d")
    public static int[] field2838;

    @ObfuscatedName("y.nw")
    public static int field29;

    @ObfuscatedName("gd.mm")
    public static byte field2909;

    @ObfuscatedName("gw.nv")
    public static int field2930;

    @ObfuscatedName("gw.ih")
    public static int field2932;

    @ObfuscatedName("gk.h")
    public static int[] field2937;

    @ObfuscatedName("gs.ap")
    public static int field2950;

    @ObfuscatedName("gm.km")
    public static class157[] field2953;

    @ObfuscatedName("gv.c")
    public static class151 field2955;

    @ObfuscatedName("gz.r")
    public static int field2959;

    @ObfuscatedName("ga.p")
    public static class104 field2974;

    @ObfuscatedName("gb.s")
    public static class75[] field2987;

    @ObfuscatedName("hl.y")
    public static int field3028;

    @ObfuscatedName("hl.z")
    public static int[] field3029;

    @ObfuscatedName("hg.k")
    public static int[][] field3036;

    @ObfuscatedName("ht.z")
    public static class75 field3043;

    @ObfuscatedName("hv.y")
    public static String field3045;

    @ObfuscatedName("hv.cd")
    public static class134 field3046;

    @ObfuscatedName("client.ed")
    public static int[] field321;

    @ObfuscatedName("client.k")
    public static class144 field330;

    @ObfuscatedName("client.z")
    public static class143 field375;

    @ObfuscatedName("client.kv")
    public static int field428;

    @ObfuscatedName("d.fl")
    public static int field51;

    @ObfuscatedName("a.l")
    public static int[] field520;

    @ObfuscatedName("a.p")
    public static class151 field521;

    @ObfuscatedName("a.u")
    public static String field525;

    @ObfuscatedName("a.n")
    public static String field526;

    @ObfuscatedName("x.il")
    public static class157 field541;

    @ObfuscatedName("x.nm")
    public static int field542;

    @ObfuscatedName("x.nh")
    public static class50 field543;

    @ObfuscatedName("n.z")
    public static int field549;

    @ObfuscatedName("n.kn")
    public static class122 field553;

    @ObfuscatedName("n.aj")
    public static class75[] field554;

    @ObfuscatedName("n.h")
    public static class157 field558;

    @ObfuscatedName("v.bj")
    public static class152 field567;

    @ObfuscatedName("v.or")
    public static int field570;

    @ObfuscatedName("v.oe")
    public static int field571;

    @ObfuscatedName("l.bb")
    public static class152 field587;

    @ObfuscatedName("t.ni")
    public static int field598;

    @ObfuscatedName("t.z")
    public static class151 field599;

    @ObfuscatedName("i.d")
    public static client field602;

    @ObfuscatedName("i.do")
    public static byte[][] field604;

    @ObfuscatedName("r.g")
    public static int field61;

    @ObfuscatedName("r.q")
    public static class210[] field62;

    @ObfuscatedName("ar.ib")
    public static int field620;

    @ObfuscatedName("ar.po")
    public static class124 field626;

    @ObfuscatedName("ar.on")
    public static Clipboard field627;

    @ObfuscatedName("r.bi")
    public static class152 field63;

    @ObfuscatedName("af.y")
    public static class75 field631;

    @ObfuscatedName("af.d")
    public static class75 field632;

    @ObfuscatedName("af.r")
    public static class73 field633;

    @ObfuscatedName("af.f")
    public static class73 field634;

    @ObfuscatedName("af.s")
    public static class75 field635;

    @ObfuscatedName("r.eh")
    public static class73[] field64;

    @ObfuscatedName("af.v")
    public static int[] field641;

    @ObfuscatedName("af.p")
    public static boolean field648;

    @ObfuscatedName("f.e")
    public static String field66;

    @ObfuscatedName("af.i")
    public static int[] field664;

    @ObfuscatedName("ax.c")
    public static String[] field674;

    @ObfuscatedName("av.aj")
    public static class152 field683;

    @ObfuscatedName("av.ne")
    public static class69 field687;

    @ObfuscatedName("f.r")
    public static byte[][][] field69;

    @ObfuscatedName("al.c")
    public static byte[][][] field695;

    @ObfuscatedName("al.lw")
    public static class121 field700;

    @ObfuscatedName("f.m")
    public static int[] field71;

    @ObfuscatedName("f.u")
    public static int[][][] field72;

    @ObfuscatedName("ab.dc")
    public static class80 field761;

    @ObfuscatedName("ac.md")
    public static int field765;

    @ObfuscatedName("ac.s")
    public static int[] field766;

    @ObfuscatedName("ac.cq")
    public static class137 field769;

    @ObfuscatedName("aq.p")
    public static class151 field781;

    @ObfuscatedName("aq.y")
    public static class151 field790;

    @ObfuscatedName("f.bm")
    public static int field81;

    @ObfuscatedName("aq.dw")
    public static int field813;

    @ObfuscatedName("az.d")
    public static class151 field816;

    @ObfuscatedName("f.o")
    public static byte[][][] field82;

    @ObfuscatedName("az.y")
    public static class151 field840;

    @ObfuscatedName("ah.p")
    public static class151 field867;

    @ObfuscatedName("ah.ek")
    public static class73[] field870;

    @ObfuscatedName("ah.ei")
    public static class73 field872;

    @ObfuscatedName("ah.ig")
    public static int field873;

    @ObfuscatedName("ah.pd")
    public static Canvas field877;

    @ObfuscatedName("ah.a")
    public static class110 field878;

    @ObfuscatedName("at.d")
    public static class151 field883;

    @ObfuscatedName("at.p")
    public static class151 field885;

    @ObfuscatedName("at.x")
    public static String field899;

    @ObfuscatedName("at.y")
    public static class151 field901;

    @ObfuscatedName("at.cw")
    public static class207 field903;

    @ObfuscatedName("ap.y")
    public static class151 field905;

    @ObfuscatedName("ap.p")
    public static class151 field910;

    @ObfuscatedName("ap.fa")
    public static int field921;

    @ObfuscatedName("as.y")
    public static class151 field923;

    @ObfuscatedName("as.d")
    public static int field924;

    @ObfuscatedName("as.pr")
    public static Font field930;

    @ObfuscatedName("as.a")
    public static String field935;

    @ObfuscatedName("au.p")
    public static class151 field942;

    @ObfuscatedName("ag.l")
    public static class12 field953;

    @ObfuscatedName("ag.p")
    public static class151 field954;

    @ObfuscatedName("ag.f")
    public static class151 field959;

    @ObfuscatedName("ag.fd")
    public static int field962;

    @ObfuscatedName("ag.id")
    public static int field965;

    @ObfuscatedName("an.p")
    public static class151 field968;

    @ObfuscatedName("an.gw")
    public static class157 field975;

    @ObfuscatedName("an.dj")
    public static int[] field977;

    @ObfuscatedName("ad.ow")
    public static class204 field981;

    @ObfuscatedName("ad.c")
    public static class75[] field982;

    @ObfuscatedName("ad.ox")
    public static short[] field985;

    @ObfuscatedName("ad.p")
    public static class151 field987;

    @ObfuscatedName("ae.f")
    public static boolean field992;

    @ObfuscatedName("al.p([Lca;II)Lca;")
    public static class103 method620(class103[] arg0, int arg1) {
        class103[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class103 var4 = var2[var3];
            if (arg1 == var4.method490()) {
                return var4;
            }
        }
        return null;
    }

    @ObfuscatedName("p.c(I)V")
    public static void method2() {
        class47.field1045.method3190();
    }

    @ObfuscatedName("s.c(Len;Ljava/lang/String;Ljava/lang/String;I)[Lbf;")
    public static class75[] method124(class151 arg0, String arg1, String arg2) {
        int var3 = arg0.method2762(arg1);
        int var4 = arg0.method2763(var3, arg2);
        return class71.method1981(arg0, var3, var4);
    }

    @ObfuscatedName("di.d(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static String method2476(Throwable arg0) throws IOException {
        String var2;
        if (arg0 instanceof class139) {
            class139 var1 = (class139) arg0;
            var2 = var1.field2083 + " | ";
            arg0 = var1.field2080;
        } else {
            var2 = "";
        }
        StringWriter var3 = new StringWriter();
        PrintWriter var4 = new PrintWriter(var3);
        arg0.printStackTrace(var4);
        var4.close();
        String var5 = var3.toString();
        BufferedReader var6 = new BufferedReader(new StringReader(var5));
        String var7 = var6.readLine();
        while (true) {
            while (true) {
                String var8 = var6.readLine();
                if (var8 == null) {
                    return var2 + "| " + var7;
                }
                int var10 = var8.indexOf(40);
                int var11 = var8.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var8.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var8 = var8.substring(0, var10);
                }
                String var15 = var8.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @ObfuscatedName("av.p(II)Lae;")
    public static class46 method607(int arg0) {
        class46 var1 = (class46) class46.field993.method3198((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field2955.method2811(10, arg0);
        class46 var3 = new class46();
        var3.field996 = arg0;
        if (var2 != null) {
            var3.method874(new class110(var2));
        }
        var3.method873();
        if (var3.field1023 != -1) {
            var3.method876(method607(var3.field1023), method607(var3.field1024));
        }
        if (var3.field989 != -1) {
            var3.method883(method607(var3.field989), method607(var3.field1007));
        }
        if (!field992 && var3.field1037) {
            var3.field998 = class147.field2370;
            var3.field1028 = false;
            var3.field990 = null;
            var3.field1013 = null;
            var3.field1035 = 0;
        }
        class46.field993.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("m.d([BIIIIIII[Lhx;B)V")
    public static final void method142(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class211[] arg8) {
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (arg2 + var9 > 0 && arg2 + var9 < 103 && arg3 + var10 > 0 && arg3 + var10 < 103) {
                    arg8[arg1].field3026[arg2 + var9][arg3 + var10] &= 0xFEFFFFFF;
                }
            }
        }
        class110 var11 = new class110(arg0);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg4 == var12 && var13 >= arg5 && var13 < arg5 + 8 && var14 >= arg6 && var14 < arg6 + 8) {
                        int var18 = var13 & 0x7;
                        int var19 = var14 & 0x7;
                        int var21 = arg7 & 0x3;
                        int var22;
                        if (var21 == 0) {
                            var22 = var18;
                        } else if (var21 == 1) {
                            var22 = var19;
                        } else if (var21 == 2) {
                            var22 = 7 - var18;
                        } else {
                            var22 = 7 - var19;
                        }
                        class6.method593(var11, arg1, arg2 + var22, arg3 + class160.method1048(var13 & 0x7, var14 & 0x7, arg7), 0, 0, arg7);
                    } else {
                        class6.method593(var11, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gz.aq(Lab;I)V")
    public static final void method3418(class34 arg0) {
        if (arg0.field710 == 0) {
            return;
        }
        if (arg0.field726 != -1 && arg0.field726 < 32768) {
            class31 var1 = client.field272[arg0.field726];
            if (var1 != null) {
                int var2 = arg0.field746 - var1.field746;
                int var3 = arg0.field752 - var1.field752;
                if (var2 != 0 || var3 != 0) {
                    arg0.field716 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field726 >= 32768) {
            int var4 = arg0.field726 - 32768;
            if (client.field326 == var4) {
                var4 = 2047;
            }
            class3 var5 = client.field276[var4];
            if (var5 != null) {
                int var6 = arg0.field746 - var5.field746;
                int var7 = arg0.field752 - var5.field752;
                if (var6 != 0 || var7 != 0) {
                    arg0.field716 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field727 != 0 || arg0.field728 != 0) && (arg0.field751 == 0 || arg0.field758 > 0)) {
            int var8 = arg0.field746 - (arg0.field727 * 64 - field24 * 64 - field24 * 64);
            int var9 = arg0.field752 - (arg0.field728 * 64 - field1047 * 64 - field1047 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field716 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field727 = 0;
            arg0.field728 = 0;
        }
        int var10 = arg0.field716 - arg0.field703 & 0x7FF;
        if (var10 == 0) {
            arg0.field739 = 0;
            return;
        }
        arg0.field739++;
        if (var10 > 1024) {
            arg0.field703 -= arg0.field710;
            boolean var11 = true;
            if (var10 < arg0.field710 || var10 > 2048 - arg0.field710) {
                arg0.field703 = arg0.field716;
                var11 = false;
            }
            if (arg0.field729 == arg0.field706 && (arg0.field739 > 25 || var11)) {
                if (arg0.field707 == -1) {
                    arg0.field729 = arg0.field754;
                } else {
                    arg0.field729 = arg0.field707;
                }
            }
        } else {
            arg0.field703 += arg0.field710;
            boolean var12 = true;
            if (var10 < arg0.field710 || var10 > 2048 - arg0.field710) {
                arg0.field703 = arg0.field716;
                var12 = false;
            }
            if (arg0.field729 == arg0.field706 && (arg0.field739 > 25 || var12)) {
                if (arg0.field708 == -1) {
                    arg0.field729 = arg0.field754;
                } else {
                    arg0.field729 = arg0.field708;
                }
            }
        }
        arg0.field703 &= 0x7FF;
    }

    @ObfuscatedName("aw.ap(IIIII)V")
    public static final void method552(int arg0, int arg1, int arg2, int arg3) {
        class74.method1534(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class85.method1803();
        client.field337++;
        client.method1799(class30.field666);
        boolean var4 = false;
        if (client.field367 >= 0) {
            for (int var5 = 0; var5 < client.field354; var5++) {
                if (client.field367 == client.field355[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            client.method1799(class30.field667);
        }
        client.method93(true);
        client.method1799(var4 ? class30.field669 : class30.field672);
        client.method93(false);
        for (class7 var6 = (class7) client.field370.method3270(); var6 != null; var6 = (class7) client.field370.method3262()) {
            if (field1082 != var6.field102 || client.field243 > var6.field90) {
                var6.method3358();
            } else if (client.field243 >= var6.field104) {
                if (var6.field83 > 0) {
                    class31 var7 = client.field272[var6.field83 - 1];
                    if (var7 != null && var7.field746 >= 0 && var7.field746 < 13312 && var7.field752 >= 0 && var7.field752 < 13312) {
                        var6.method85(var7.field746, var7.field752, client.method868(var7.field746, var7.field752, var6.field102) - var6.field86, client.field243);
                    }
                }
                if (var6.field83 < 0) {
                    int var8 = -var6.field83 - 1;
                    class3 var9;
                    if (client.field326 == var8) {
                        var9 = field2498;
                    } else {
                        var9 = client.field276[var8];
                    }
                    if (var9 != null && var9.field746 >= 0 && var9.field746 < 13312 && var9.field752 >= 0 && var9.field752 < 13312) {
                        var6.method85(var9.field746, var9.field752, client.method868(var9.field746, var9.field752, var6.field102) - var6.field86, client.field243);
                    }
                }
                var6.method86(client.field309);
                field761.method1634(field1082, (int) var6.field95, (int) var6.field84, (int) var6.field97, 60, var6, var6.field103, -1, false);
            }
        }
        client.method1985();
        if (!client.field481) {
            int var10 = client.field291;
            if (client.field325 / 256 > var10) {
                var10 = client.field325 / 256;
            }
            if (client.field482[4] && client.field484[4] + 128 > var10) {
                var10 = client.field484[4] + 128;
            }
            int var11 = client.field407 + client.field310 & 0x7FF;
            client.method9(field962, client.method868(field2498.field746, field2498.field752, field1082) - 50, field51, var10, var11, var10 * 3 + 600);
        }
        int var12;
        if (client.field481) {
            var12 = client.method3184();
        } else {
            var12 = client.method2862();
        }
        int var13 = field159;
        int var14 = field1281;
        int var15 = field921;
        int var16 = field2599;
        int var17 = field2161;
        for (int var18 = 0; var18 < 5; var18++) {
            if (client.field482[var18]) {
                int var19 = (int) (Math.random() * (double) (client.field278[var18] * 2 + 1) - (double) client.field278[var18] + Math.sin((double) client.field485[var18] / 100.0D * (double) client.field486[var18]) * (double) client.field484[var18]);
                if (var18 == 0) {
                    field159 += var19;
                }
                if (var18 == 1) {
                    field1281 += var19;
                }
                if (var18 == 2) {
                    field921 += var19;
                }
                if (var18 == 3) {
                    field2161 = field2161 + var19 & 0x7FF;
                }
                if (var18 == 4) {
                    field2599 += var19;
                    if (field2599 < 128) {
                        field2599 = 128;
                    }
                    if (field2599 > 383) {
                        field2599 = 383;
                    }
                }
            }
        }
        int var20 = class131.field2009;
        int var21 = class131.field2010;
        if (class131.field2017 != 0) {
            var20 = class131.field2016;
            var21 = class131.field2020;
        }
        if (var20 >= arg0 && var20 < arg0 + arg2 && var21 >= arg1 && var21 < arg1 + arg3) {
            class99.field1700 = true;
            class99.field1746 = 0;
            class99.field1744 = var20 - arg0;
            class99.field1745 = var21 - arg1;
        } else {
            class99.field1700 = false;
            class99.field1746 = 0;
        }
        client.method2930();
        class74.method1540(arg0, arg1, arg2, arg3, 0);
        client.method2930();
        field761.method1660(field159, field1281, field921, field2599, field2161, var12);
        client.method2930();
        field761.method1713();
        client.method2933(arg0, arg1, arg2, arg3);
        if (client.field251 == 2) {
            client.method157((client.field239 - field24 << 7) + client.field447, (client.field255 - field1047 << 7) + client.field258, client.field256 * 2);
            if (client.field338 > -1 && client.field243 % 20 < 10) {
                field1526[0].method1463(client.field338 + arg0 - 12, client.field339 + arg1 - 28);
            }
        }
        ((class89) field1479).method1883(client.field309);
        if (client.field343 == 1) {
            field165[client.field342 / 100].method1463(client.field340 - 8, client.field341 - 8);
        }
        if (client.field343 == 2) {
            field165[client.field342 / 100 + 4].method1463(client.field340 - 8, client.field341 - 8);
        }
        client.field352 = 0;
        int var22 = (field2498.field746 >> 7) + field24;
        int var23 = (field2498.field752 >> 7) + field1047;
        if (var22 >= 3053 && var22 <= 3156 && var23 >= 3056 && var23 <= 3136) {
            client.field352 = 1;
        }
        if (var22 >= 3072 && var22 <= 3118 && var23 >= 9492 && var23 <= 9535) {
            client.field352 = 1;
        }
        if (client.field352 == 1 && var22 >= 3139 && var22 <= 3199 && var23 >= 3008 && var23 <= 3062) {
            client.field352 = 0;
        }
        if (client.field249) {
            int var24 = arg0 + 512 - 5;
            int var25 = arg1 + 20;
            field903.method3470("Fps:" + client.field2061, var24, var25, 16776960, -1);
            int var29 = var25 + 15;
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            int var28 = 16776960;
            if (var27 > 32768 && client.field317) {
                var28 = 16711680;
            }
            if (var27 > 65536 && !client.field317) {
                var28 = 16711680;
            }
            field903.method3470("Mem:" + var27 + "k", var24, var29, var28, -1);
            var25 = var29 + 15;
        }
        field159 = var13;
        field1281 = var14;
        field921 = var15;
        field2599 = var16;
        field2161 = var17;
        if (client.field254 && class155.method1979(true, false) == 0) {
            client.field254 = false;
        }
        if (client.field254) {
            class74.method1540(arg0, arg1, arg2, arg3, 0);
            client.method563(class147.field2206, false);
        }
    }

    @ObfuscatedName("c.bc(B)V")
    public static final void method23() {
        int var0 = client.field277.method2370(8);
        if (var0 < client.field354) {
            for (int var1 = var0; var1 < client.field354; var1++) {
                client.field362[++client.field361 - 1] = client.field355[var1];
            }
        }
        if (var0 > client.field354) {
            throw new RuntimeException("");
        }
        client.field354 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = client.field355[var2];
            class3 var4 = client.field276[var3];
            int var5 = client.field277.method2370(1);
            if (var5 == 0) {
                client.field355[++client.field354 - 1] = var3;
                var4.field736 = client.field243;
            } else {
                int var6 = client.field277.method2370(2);
                if (var6 == 0) {
                    client.field355[++client.field354 - 1] = var3;
                    var4.field736 = client.field243;
                    client.field267[++client.field356 - 1] = var3;
                } else if (var6 == 1) {
                    client.field355[++client.field354 - 1] = var3;
                    var4.field736 = client.field243;
                    int var7 = client.field277.method2370(3);
                    var4.method625(var7, false);
                    int var8 = client.field277.method2370(1);
                    if (var8 == 1) {
                        client.field267[++client.field356 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    client.field355[++client.field354 - 1] = var3;
                    var4.field736 = client.field243;
                    int var9 = client.field277.method2370(3);
                    var4.method625(var9, true);
                    int var10 = client.field277.method2370(3);
                    var4.method625(var10, true);
                    int var11 = client.field277.method2370(1);
                    if (var11 == 1) {
                        client.field267[++client.field356 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    client.field362[++client.field361 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ad.bh(I)V")
    public static final void method869() {
        client.method765();
        if (field22 != null || client.field297 != null) {
            return;
        }
        int var0 = class131.field2017;
        if (client.field376) {
            if (var0 != 1 && (field1271 || var0 != 4)) {
                int var1 = class131.field2009;
                int var2 = class131.field2010;
                if (var1 < field965 - 10 || var1 > field965 + field2932 + 10 || var2 < field620 - 10 || var2 > field620 + field12 + 10) {
                    client.field376 = false;
                    client.method2875(field965, field620, field2932, field12);
                }
            }
            if (var0 == 1 || !field1271 && var0 == 4) {
                int var3 = field965;
                int var4 = field620;
                int var5 = field2932;
                int var6 = class131.field2016;
                int var7 = class131.field2020;
                int var8 = -1;
                for (int var9 = 0; var9 < client.field441; var9++) {
                    int var10 = (client.field441 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1 && var8 >= 0) {
                    int var11 = client.field408[var8];
                    int var12 = client.field463[var8];
                    int var13 = client.field380[var8];
                    int var14 = client.field381[var8];
                    String var15 = client.field346[var8];
                    String var16 = client.field383[var8];
                    client.method1408(var11, var12, var13, var14, var15, var16, class131.field2016, class131.field2020);
                }
                client.field376 = false;
                client.method2875(field965, field620, field2932, field12);
            }
            return;
        }
        if ((var0 == 1 || !field1271 && var0 == 4) && client.field441 > 0) {
            int var17 = client.field380[client.field441 - 1];
            if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
                label204: {
                    int var18 = client.field408[client.field441 - 1];
                    int var19 = client.field463[client.field441 - 1];
                    class157 var20 = class157.method2872(var19);
                    if (!class161.method1877(client.method838(var20))) {
                        int var21 = client.method838(var20);
                        boolean var22 = (var21 >> 29 & 0x1) != 0;
                        if (!var22) {
                            break label204;
                        }
                    }
                    if (field22 != null && !client.field432 && client.field446 != 1 && !client.method640(client.field441 - 1) && client.field441 > 0) {
                        client.method623(client.field232, client.field348);
                    }
                    client.field432 = false;
                    client.field351 = 0;
                    if (field22 != null) {
                        client.method3177(field22);
                    }
                    field22 = class157.method2872(var19);
                    client.field230 = var18;
                    client.field232 = class131.field2016;
                    client.field348 = class131.field2020;
                    if (client.field441 > 0) {
                        int var23 = client.field441 - 1;
                        field1884 = new class28();
                        field1884.field622 = client.field408[var23];
                        field1884.field621 = client.field463[var23];
                        field1884.field629 = client.field380[var23];
                        field1884.field623 = client.field381[var23];
                        field1884.field624 = client.field346[var23];
                    }
                    client.method3177(field22);
                    return;
                }
            }
        }
        if ((var0 == 1 || !field1271 && var0 == 4) && (client.field446 == 1 && client.field441 > 2 || client.method640(client.field441 - 1))) {
            var0 = 2;
        }
        if ((var0 == 1 || !field1271 && var0 == 4) && client.field441 > 0) {
            int var24 = client.field441 - 1;
            if (var24 >= 0) {
                int var25 = client.field408[var24];
                int var26 = client.field463[var24];
                int var27 = client.field380[var24];
                int var28 = client.field381[var24];
                String var29 = client.field346[var24];
                String var30 = client.field383[var24];
                client.method1408(var25, var26, var27, var28, var29, var30, class131.field2016, class131.field2020);
            }
        }
        if (var0 == 2 && client.field441 > 0) {
            client.method2925(class131.field2016, class131.field2020);
        }
    }

    @ObfuscatedName("w.dn(IIIILbq;I)V")
    public static final void method144(int arg0, int arg1, int arg2, int arg3, class73 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = client.field310 + client.field304 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class85.field1470[var5];
        int var8 = class85.field1483[var5];
        int var9 = var7 * 256 / (client.field306 + 256);
        int var10 = var8 * 256 / (client.field306 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1487(field2148, arg0 + 94 + var11 - arg4.field1299 / 2 + 4, arg1 + 83 - var12 - arg4.field1300 / 2 - 4);
        } else {
            arg4.method1463(arg0 + 94 + var11 - arg4.field1299 / 2 + 4, arg1 + 83 - var12 - arg4.field1300 / 2 - 4);
        }
    }

    @ObfuscatedName("fl.du(Lfy;I)Z")
    public static boolean method3185(class157 arg0) {
        if (client.field405) {
            if (client.method838(arg0) != 0) {
                return false;
            }
            if (arg0.field2551 == 0) {
                return false;
            }
        }
        return arg0.field2561;
    }
}
