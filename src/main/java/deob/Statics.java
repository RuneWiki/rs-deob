package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.datatransfer.Clipboard;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import netscape.javascript.JSObject;

public class Statics {

    @ObfuscatedName("aj.v")
    public static class193 field1002;

    @ObfuscatedName("aj.t")
    public static class146 field1032;

    @ObfuscatedName("aj.np")
    public static int field1043;

    @ObfuscatedName("ay.bn")
    public static class147 field1044;

    @ObfuscatedName("ay.s")
    public static int field1045;

    @ObfuscatedName("ay.t")
    public static class146 field1051;

    @ObfuscatedName("al.t")
    public static class47 field1055;

    @ObfuscatedName("ai.e")
    public static boolean field1061;

    @ObfuscatedName("ai.n")
    public static class66 field1063;

    @ObfuscatedName("ai.en")
    public static class72 field1071;

    @ObfuscatedName("ai.nv")
    public static int field1072;

    @ObfuscatedName("ai.ph")
    public static Image field1082;

    @ObfuscatedName("ai.ct")
    public static class193 field1083;

    @ObfuscatedName("ai.f")
    public static int field1085;

    @ObfuscatedName("ai.d")
    public static int field1086;

    @ObfuscatedName("ai.z")
    public static int field1087;

    @ObfuscatedName("bf.ix")
    public static int field1107;

    @ObfuscatedName("bt.z")
    public static float field1124;

    @ObfuscatedName("bt.j")
    public static int field1131;

    @ObfuscatedName("bp.u")
    public static int[] field1161;

    @ObfuscatedName("bp.g")
    public static int[] field1165;

    @ObfuscatedName("bp.a")
    public static boolean[] field1166;

    @ObfuscatedName("bd.aw")
    public static float[] field1177;

    @ObfuscatedName("bd.v")
    public static byte[] field1181;

    @ObfuscatedName("bd.z")
    public static int field1182;

    @ObfuscatedName("bd.j")
    public static int field1183;

    @ObfuscatedName("bd.u")
    public static int field1184;

    @ObfuscatedName("bd.g")
    public static int field1185;

    @ObfuscatedName("bd.a")
    public static class67[] field1186;

    @ObfuscatedName("bd.c")
    public static class61[] field1187;

    @ObfuscatedName("bd.l")
    public static class62[] field1189;

    @ObfuscatedName("bd.ak")
    public static float[] field1190;

    @ObfuscatedName("bd.x")
    public static int[] field1191;

    @ObfuscatedName("bd.w")
    public static class54[] field1192;

    @ObfuscatedName("bd.af")
    public static float[] field1196;

    @ObfuscatedName("bd.h")
    public static float[] field1197;

    @ObfuscatedName("bd.i")
    public static float[] field1198;

    @ObfuscatedName("bd.o")
    public static float[] field1199;

    @ObfuscatedName("v.is")
    public static int field120;

    @ObfuscatedName("bd.m")
    public static float[] field1200;

    @ObfuscatedName("bd.ab")
    public static int[] field1204;

    @ObfuscatedName("bd.ao")
    public static int[] field1205;

    @ObfuscatedName("bd.q")
    public static boolean[] field1207;

    @ObfuscatedName("v.dh")
    public static int[] field122;

    @ObfuscatedName("bz.n")
    public static int[] field1238;

    @ObfuscatedName("bz.a")
    public static class158 field1241;

    @ObfuscatedName("bk.fa")
    public static int field1255;

    @ObfuscatedName("z.ep")
    public static class72[] field126;

    @ObfuscatedName("bk.nw")
    public static int field1260;

    @ObfuscatedName("bg.ic")
    public static class27 field1265;

    @ObfuscatedName("by.pa")
    public static boolean field1267;

    @ObfuscatedName("by.t")
    public static int field1268;

    @ObfuscatedName("by.f")
    public static int field1269;

    @ObfuscatedName("z.j")
    public static byte[][] field127;

    @ObfuscatedName("by.d")
    public static int[] field1271;

    @ObfuscatedName("by.e")
    public static int[] field1273;

    @ObfuscatedName("by.iz")
    public static int field1275;

    @ObfuscatedName("by.s")
    public static int field1276;

    @ObfuscatedName("bm.ag")
    public static class130 field1284;

    @ObfuscatedName("j.w")
    public static int[] field129;

    @ObfuscatedName("bh.c")
    public static int[] field1299;

    @ObfuscatedName("bh.w")
    public static int field1300;

    @ObfuscatedName("bh.l")
    public static int field1302;

    @ObfuscatedName("bb.l")
    public static int[] field1324;

    @ObfuscatedName("bw.pm")
    public static class71 field1333;

    @ObfuscatedName("bw.cz")
    public static char field1334;

    @ObfuscatedName("bw.lz")
    public static byte field1337;

    @ObfuscatedName("bq.nr")
    public static int field1339;

    @ObfuscatedName("cb.o")
    public static int field1342;

    @ObfuscatedName("cb.aw")
    public static int field1346;

    @ObfuscatedName("cb.ao")
    public static int field1357;

    @ObfuscatedName("j.om")
    public static int field136;

    @ObfuscatedName("cb.r")
    public static int field1361;

    @ObfuscatedName("cb.k")
    public static int field1362;

    @ObfuscatedName("cb.b")
    public static int field1363;

    @ObfuscatedName("cb.h")
    public static int field1364;

    @ObfuscatedName("cb.i")
    public static int field1365;

    @ObfuscatedName("cb.ak")
    public static int field1368;

    @ObfuscatedName("cb.af")
    public static int field1370;

    @ObfuscatedName("cb.m")
    public static int field1372;

    @ObfuscatedName("cb.bp")
    public static int field1374;

    @ObfuscatedName("cb.y")
    public static int field1379;

    @ObfuscatedName("u.dc")
    public static int field139;

    @ObfuscatedName("cb.p")
    public static int field1390;

    @ObfuscatedName("cb.br")
    public static int field1395;

    @ObfuscatedName("cb.bt")
    public static boolean[][] field1398;

    @ObfuscatedName("cb.bo")
    public static int field1399;

    @ObfuscatedName("cb.ab")
    public static int field1400;

    @ObfuscatedName("cb.be")
    public static int field1401;

    @ObfuscatedName("cb.bc")
    public static int field1403;

    @ObfuscatedName("cb.bn")
    public static int field1404;

    @ObfuscatedName("cj.kw")
    public static class118 field1414;

    @ObfuscatedName("cp.ap")
    public static class74[] field1431;

    @ObfuscatedName("u.bc")
    public static class147 field144;

    @ObfuscatedName("cp.ai")
    public static class74[] field1441;

    @ObfuscatedName("cp.r")
    public static String field1442;

    @ObfuscatedName("cp.mc")
    public static class49 field1445;

    @ObfuscatedName("cr.hf")
    public static class3 field1452;

    @ObfuscatedName("cv.h")
    public static int field1453;

    @ObfuscatedName("cv.g")
    public static int field1463;

    @ObfuscatedName("cv.a")
    public static int field1464;

    @ObfuscatedName("cv.r")
    public static int field1465;

    @ObfuscatedName("cv.k")
    public static int field1466;

    @ObfuscatedName("cv.b")
    public static int field1467;

    @ObfuscatedName("cv.o")
    public static int field1468;

    @ObfuscatedName("cv.i")
    public static int field1469;

    @ObfuscatedName("cv.aw")
    public static class85 field1473;

    @ObfuscatedName("cn.eu")
    public static class72[] field1497;

    @ObfuscatedName("cn.q")
    public static class107 field1504;

    @ObfuscatedName("cz.he")
    public static int field1513;

    @ObfuscatedName("cz.kh")
    public static int field1516;

    @ObfuscatedName("cz.k")
    public static String field1518;

    @ObfuscatedName("cm.l")
    public static int field1557;

    @ObfuscatedName("cs.by")
    public static int field1567;

    @ObfuscatedName("g.fo")
    public static int field157;

    @ObfuscatedName("g.ec")
    public static class72[] field158;

    @ObfuscatedName("a.dt")
    public static int field165;

    @ObfuscatedName("cf.im")
    public static int field1656;

    @ObfuscatedName("cf.as")
    public static class72[] field1664;

    @ObfuscatedName("cc.bf")
    public static int field1736;

    @ObfuscatedName("cc.bu")
    public static int field1737;

    @ObfuscatedName("cc.bi")
    public static int field1738;

    @ObfuscatedName("a.be")
    public static class147 field175;

    @ObfuscatedName("cd.s")
    public static Applet field1754;

    @ObfuscatedName("a.ek")
    public static int[] field176;

    @ObfuscatedName("cy.pt")
    public static Font field1787;

    @ObfuscatedName("cy.lr")
    public static class117 field1796;

    @ObfuscatedName("ck.e")
    public static String[] field1805;

    @ObfuscatedName("ck.ow")
    public static class120 field1807;

    @ObfuscatedName("c.nn")
    public static int field181;

    @ObfuscatedName("ck.t")
    public static long field1812;

    @ObfuscatedName("cu.u")
    public static int[] field1813;

    @ObfuscatedName("cu.ol")
    public static class9 field1815;

    @ObfuscatedName("c.na")
    public static int field182;

    @ObfuscatedName("dm.cw")
    public static class193 field1848;

    @ObfuscatedName("c.w")
    public static class196[] field185;

    @ObfuscatedName("dm.g")
    public static boolean field1851;

    @ObfuscatedName("dh.eb")
    public static int[] field1861;

    @ObfuscatedName("dh.g")
    public static int[] field1863;

    @ObfuscatedName("de.iu")
    public static class152 field1871;

    @ObfuscatedName("de.v")
    public static class74 field1874;

    @ObfuscatedName("de.py")
    public static int field1875;

    @ObfuscatedName("de.bf")
    public static FontMetrics field1876;

    @ObfuscatedName("du.mi")
    public static class21[] field1887;

    @ObfuscatedName("dv.z")
    public static class139 field1896;

    @ObfuscatedName("dv.v")
    public static int[] field1897;

    @ObfuscatedName("s.oa")
    public static class145 field19;

    @ObfuscatedName("dv.a")
    public static int[] field1901;

    @ObfuscatedName("di.j")
    public static class190 field1904;

    @ObfuscatedName("di.ej")
    public static class74[] field1905;

    @ObfuscatedName("dp.z")
    public static class74[] field1919;

    @ObfuscatedName("dp.oc")
    public static Clipboard field1920;

    @ObfuscatedName("dx.s")
    public static File field1924;

    @ObfuscatedName("w.nk")
    public static int field193;

    @ObfuscatedName("dy.s")
    public static String field1930;

    @ObfuscatedName("dy.t")
    public static String field1936;

    @ObfuscatedName("dy.fb")
    public static int field1940;

    @ObfuscatedName("dw.ko")
    public static int field1964;

    @ObfuscatedName("dz.s")
    public static long field1984;

    @ObfuscatedName("dz.bp")
    public static class147 field1986;

    @ObfuscatedName("dz.d")
    public static class146 field1988;

    @ObfuscatedName("t.gh")
    public static class152 field2;

    @ObfuscatedName("w.cd")
    public static int field200;

    @ObfuscatedName("w.ff")
    public static int field201;

    @ObfuscatedName("dg.nj")
    public static int field2011;

    @ObfuscatedName("dg.cl")
    public static int field2017;

    @ObfuscatedName("l.cb")
    public static class133 field202;

    @ObfuscatedName("dl.v")
    public static int field2025;

    @ObfuscatedName("df.or")
    public static class123 field2036;

    @ObfuscatedName("en.e")
    public static int field2068;

    @ObfuscatedName("en.f")
    public static String field2070;

    @ObfuscatedName("ej.e")
    public static File field2076;

    @ObfuscatedName("ej.d")
    public static File field2077;

    @ObfuscatedName("ej.n")
    public static int field2078;

    @ObfuscatedName("ej.b")
    public static String field2084;

    @ObfuscatedName("ej.do")
    public static byte[][] field2085;

    @ObfuscatedName("es.bm")
    public static int field2102;

    @ObfuscatedName("es.al")
    public static class17 field2104;

    @ObfuscatedName("eu.bo")
    public static class147 field2110;

    @ObfuscatedName("eu.w")
    public static class151 field2114;

    @ObfuscatedName("et.et")
    public static class72[] field2124;

    @ObfuscatedName("q.fr")
    public static int field223;

    @ObfuscatedName("q.i")
    public static int[] field224;

    @ObfuscatedName("q.o")
    public static int[] field226;

    @ObfuscatedName("client.s")
    public static client field239;

    @ObfuscatedName("ep.z")
    public static byte[][][] field2398;

    @ObfuscatedName("s.j")
    public static short[] field24;

    @ObfuscatedName("ep.bu")
    public static class147 field2401;

    @ObfuscatedName("ev.ap")
    public static class147 field2428;

    @ObfuscatedName("client.n")
    public static class138 field243;

    @ObfuscatedName("eg.ba")
    public static class147 field2441;

    @ObfuscatedName("eo.ev")
    public static class74[] field2465;

    @ObfuscatedName("eo.fv")
    public static int field2467;

    @ObfuscatedName("eo.ng")
    public static int field2469;

    @ObfuscatedName("eb.eg")
    public static class74[] field2472;

    @ObfuscatedName("eb.a")
    public static class152 field2475;

    @ObfuscatedName("eb.z")
    public static short[][] field2477;

    @ObfuscatedName("eb.l")
    public static int[][][] field2479;

    @ObfuscatedName("eb.bi")
    public static class147 field2481;

    @ObfuscatedName("ek.c")
    public static boolean field2487;

    @ObfuscatedName("client.cx")
    public static class130 field249;

    @ObfuscatedName("ek.t")
    public static class130 field2498;

    @ObfuscatedName("ek.f")
    public static long field2503;

    @ObfuscatedName("ek.al")
    public static class147 field2504;

    @ObfuscatedName("el.y")
    public static int[] field2510;

    @ObfuscatedName("el.es")
    public static class72[] field2514;

    @ObfuscatedName("ew.s")
    public static boolean[] field2517;

    @ObfuscatedName("ew.f")
    public static class146 field2518;

    @ObfuscatedName("ew.e")
    public static class146 field2519;

    @ObfuscatedName("ew.n")
    public static class146 field2520;

    @ObfuscatedName("ew.t")
    public static class152[][] field2595;

    @ObfuscatedName("eq.ck")
    public static int field2649;

    @ObfuscatedName("ei.c")
    public static class53 field2651;

    @ObfuscatedName("ex.t")
    public static class146 field2663;

    @ObfuscatedName("client.am")
    public static class133 field267;

    @ObfuscatedName("s.g")
    public static class152 field27;

    @ObfuscatedName("fa.u")
    public static int field2704;

    @ObfuscatedName("fa.gs")
    public static class152 field2705;

    @ObfuscatedName("fa.f")
    public static class146 field2706;

    @ObfuscatedName("fa.t")
    public static class146 field2707;

    @ObfuscatedName("fa.j")
    public static int field2710;

    @ObfuscatedName("fa.s")
    public static class146 field2711;

    @ObfuscatedName("fa.e")
    public static class162 field2714;

    @ObfuscatedName("fa.n")
    public static class146 field2716;

    @ObfuscatedName("client.ay")
    public static long field273;

    @ObfuscatedName("client.bt")
    public static class147 field274;

    @ObfuscatedName("gu.x")
    public static String[] field2866;

    @ObfuscatedName("gu.ad")
    public static class74[] field2868;

    @ObfuscatedName("gr.s")
    public static class74 field2892;

    @ObfuscatedName("gr.t")
    public static class102 field2893;

    @ObfuscatedName("gr.j")
    public static class74 field2894;

    @ObfuscatedName("gh.u")
    public static class74[] field2913;

    @ObfuscatedName("gw.c")
    public static String field2922;

    @ObfuscatedName("gw.br")
    public static class147 field2924;

    @ObfuscatedName("gs.p")
    public static int[] field2937;

    @ObfuscatedName("gf.k")
    public static class12 field2957;

    @ObfuscatedName("gx.n")
    public static class72 field2960;

    @ObfuscatedName("gz.e")
    public static byte[][][] field2966;

    @ObfuscatedName("gt.z")
    public static int[] field2967;

    @ObfuscatedName("client.da")
    public static int[] field302;

    @ObfuscatedName("client.gw")
    public static class152 field313;

    @ObfuscatedName("s.dm")
    public static int[] field32;

    @ObfuscatedName("client.dr")
    public static byte[][] field434;

    @ObfuscatedName("client.el")
    public static int[] field466;

    @ObfuscatedName("f.hx")
    public static int field49;

    @ObfuscatedName("client.eo")
    public static class74 field504;

    @ObfuscatedName("p.at")
    public static int field506;

    @ObfuscatedName("p.po")
    public static Canvas field510;

    @ObfuscatedName("p.ee")
    public static class72[] field511;

    @ObfuscatedName("p.mz")
    public static class72 field513;

    @ObfuscatedName("y.bf")
    public static class74 field523;

    @ObfuscatedName("y.cj")
    public static class130 field529;

    @ObfuscatedName("f.fu")
    public static int field53;

    @ObfuscatedName("r.bi")
    public static class22[] field536;

    @ObfuscatedName("r.il")
    public static class152 field541;

    @ObfuscatedName("e.cy")
    public static int field56;

    @ObfuscatedName("h.hq")
    public static int field588;

    @ObfuscatedName("e.aa")
    public static class133 field59;

    @ObfuscatedName("h.ad")
    public static class147 field592;

    @ObfuscatedName("i.r")
    public static class107 field598;

    @ObfuscatedName("e.de")
    public static int[][] field60;

    @ObfuscatedName("o.mj")
    public static int field600;

    @ObfuscatedName("o.nb")
    public static class68 field605;

    @ObfuscatedName("o.v")
    public static byte[][][] field608;

    @ObfuscatedName("m.oj")
    public static class121 field610;

    @ObfuscatedName("e.dk")
    public static class79 field62;

    @ObfuscatedName("ak.bv")
    public static int field623;

    @ObfuscatedName("ak.ac")
    public static class147 field628;

    @ObfuscatedName("aw.f")
    public static class74 field629;

    @ObfuscatedName("aw.ps")
    public static int field630;

    @ObfuscatedName("aw.t")
    public static boolean field631;

    @ObfuscatedName("aw.u")
    public static class74 field633;

    @ObfuscatedName("aw.r")
    public static int[] field636;

    @ObfuscatedName("aw.h")
    public static int[] field639;

    @ObfuscatedName("aw.m")
    public static int[] field640;

    @ObfuscatedName("aw.d")
    public static class72 field655;

    @ObfuscatedName("aw.e")
    public static class74[] field662;

    @ObfuscatedName("aw.av")
    public static String field664;

    @ObfuscatedName("aw.s")
    public static class146 field665;

    @ObfuscatedName("ab.x")
    public static int[] field678;

    @ObfuscatedName("ab.ey")
    public static int[] field682;

    @ObfuscatedName("d.ch")
    public static int field69;

    @ObfuscatedName("ao.ed")
    public static class72 field691;

    @ObfuscatedName("ah.io")
    public static int field697;

    @ObfuscatedName("t.ef")
    public static class72[] field7;

    @ObfuscatedName("ah.as")
    public static class147 field708;

    @ObfuscatedName("ah.jh")
    public static int field712;

    @ObfuscatedName("ah.f")
    public static int[] field713;

    @ObfuscatedName("ae.ib")
    public static int field741;

    @ObfuscatedName("d.ke")
    public static class152[] field77;

    @ObfuscatedName("ax.mv")
    public static class50 field775;

    @ObfuscatedName("ax.az")
    public static boolean field776;

    @ObfuscatedName("ax.mg")
    public static byte field778;

    @ObfuscatedName("ax.v")
    public static short[] field779;

    @ObfuscatedName("d.ns")
    public static int field78;

    @ObfuscatedName("ar.s")
    public static class146 field783;

    @ObfuscatedName("n.u")
    public static short[][] field79;

    @ObfuscatedName("ar.t")
    public static class146 field814;

    @ObfuscatedName("aq.s")
    public static class146 field824;

    @ObfuscatedName("aq.f")
    public static class146 field825;

    @ObfuscatedName("n.n")
    public static byte[][][] field83;

    @ObfuscatedName("n.c")
    public static int[] field85;

    @ObfuscatedName("aq.cf")
    public static class193 field875;

    @ObfuscatedName("aq.ka")
    public static int field877;

    @ObfuscatedName("am.t")
    public static class146 field882;

    @ObfuscatedName("am.q")
    public static String[] field886;

    @ObfuscatedName("n.j")
    public static int[][] field89;

    @ObfuscatedName("az.t")
    public static class146 field892;

    @ObfuscatedName("az.f")
    public static class146 field895;

    @ObfuscatedName("az.s")
    public static class146 field904;

    @ObfuscatedName("an.s")
    public static class146 field911;

    @ObfuscatedName("an.ai")
    public static class147 field915;

    @ObfuscatedName("an.t")
    public static class146 field917;

    @ObfuscatedName("an.pn")
    public static int field927;

    @ObfuscatedName("an.bg")
    public static String field928;

    @ObfuscatedName("n.d")
    public static byte[][][] field93;

    @ObfuscatedName("at.f")
    public static int field930;

    @ObfuscatedName("at.t")
    public static class146 field934;

    @ObfuscatedName("at.pk")
    public static String field941;

    @ObfuscatedName("av.t")
    public static class146 field951;

    @ObfuscatedName("av.er")
    public static class72[] field955;

    @ObfuscatedName("aa.mn")
    public static class50 field970;

    @ObfuscatedName("aa.pl")
    public static int field973;

    @ObfuscatedName("aa.t")
    public static class146 field976;

    @ObfuscatedName("ag.o")
    public static int[] field983;

    @ObfuscatedName("ag.t")
    public static class146 field986;

    @ObfuscatedName("au.pq")
    public static Frame field994;

    @ObfuscatedName("aj.s")
    public static class146 field997;

    @ObfuscatedName("aj.f")
    public static boolean field998;

    @ObfuscatedName("dc.s(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
    public static Object method2431(Applet arg0, String arg1, Object[] arg2) throws Throwable {
        return JSObject.getWindow(arg0).call(arg1, arg2);
    }

    @ObfuscatedName("da.t(IB)[B")
    public static synchronized byte[] method2340(int arg0) {
        if (arg0 == 100 && class109.field1844 > 0) {
            byte[] var1 = class109.field1837[--class109.field1844];
            class109.field1837[class109.field1844] = null;
            return var1;
        } else if (arg0 == 5000 && class109.field1838 > 0) {
            byte[] var2 = class109.field1840[--class109.field1838];
            class109.field1840[class109.field1838] = null;
            return var2;
        } else if (arg0 == 30000 && class109.field1839 > 0) {
            byte[] var3 = class109.field1842[--class109.field1839];
            class109.field1842[class109.field1839] = null;
            return var3;
        } else {
            return new byte[arg0];
        }
    }

    @ObfuscatedName("el.t([BIB)I")
    public static int method2863(byte[] arg0, int arg1) {
        int var2 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            var2 = var2 >>> 8 ^ class107.field1834[(var2 ^ arg0[var3]) & 0xFF];
        }
        return ~var2;
    }

    @ObfuscatedName("z.t(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static void method96(String arg0, Throwable arg1) {
        try {
            String var2 = "";
            if (arg1 != null) {
                Throwable var3 = arg1;
                String var5;
                if (arg1 instanceof class135) {
                    class135 var4 = (class135) arg1;
                    var5 = var4.field2069 + " | ";
                    var3 = var4.field2072;
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
            if (field1754 == null) {
                return;
            }
            URL var26 = new URL(field1754.getCodeBase(), "clienterror.ws?c=" + field2068 + "&u=" + field2070 + "&v1=" + field1936 + "&v2=" + field1930 + "&e=" + var25);
            DataInputStream var27 = new DataInputStream(var26.openStream());
            var27.read();
            var27.close();
        } catch (Exception var29) {
        }
    }

    @ObfuscatedName("client.s(II)Laz;")
    public static class38 method448(int arg0) {
        class38 var1 = (class38) class38.field905.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field892.method2709(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method689(new class107(var2));
        }
        var3.method692();
        class38.field905.method3168(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("s.v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method13(String arg0, String arg1, String arg2) {
        class28.field648 = arg0;
        class28.field649 = arg1;
        class28.field650 = arg2;
    }

    @ObfuscatedName("v.g(Lgv;Lgv;I)V")
    public static void method93(class193 arg0, class193 arg1) {
        if (field1664 == null) {
            field1664 = class70.method82(field2441, "sl_back", "");
        }
        if (field1441 == null) {
            field1441 = class70.method508(field2441, "sl_flags", "");
        }
        if (field2868 == null) {
            field2868 = class70.method508(field2441, "sl_arrows", "");
        }
        if (field1431 == null) {
            field1431 = class70.method508(field2441, "sl_stars", "");
        }
        class73.method1497(0, 23, 765, 480, 0);
        class73.method1498(0, 0, 125, 23, 12425273, 9135624);
        class73.method1498(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3407(class142.field2373, 62, 15, 0, -1);
        if (field1431 != null) {
            field1431[1].method1547(140, 1);
            arg1.method3341(class142.field2357, 152, 10, 16777215, -1);
            field1431[0].method1547(140, 12);
            arg1.method3341(class142.field2375, 152, 21, 16777215, -1);
        }
        if (field2868 != null) {
            short var2 = 280;
            if (class28.field667[0] == 0 && class28.field663[0] == 0) {
                field2868[2].method1547(var2, 4);
            } else {
                field2868[0].method1547(var2, 4);
            }
            if (class28.field667[0] == 0 && class28.field663[0] == 1) {
                field2868[3].method1547(var2 + 15, 4);
            } else {
                field2868[1].method1547(var2 + 15, 4);
            }
            arg0.method3341(class142.field2376, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (class28.field667[0] == 1 && class28.field663[0] == 0) {
                field2868[2].method1547(var3, 4);
            } else {
                field2868[0].method1547(var3, 4);
            }
            if (class28.field667[0] == 1 && class28.field663[0] == 1) {
                field2868[3].method1547(var3 + 15, 4);
            } else {
                field2868[1].method1547(var3 + 15, 4);
            }
            arg0.method3341(class142.field2377, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (class28.field667[0] == 2 && class28.field663[0] == 0) {
                field2868[2].method1547(var4, 4);
            } else {
                field2868[0].method1547(var4, 4);
            }
            if (class28.field667[0] == 2 && class28.field663[0] == 1) {
                field2868[3].method1547(var4 + 15, 4);
            } else {
                field2868[1].method1547(var4 + 15, 4);
            }
            arg0.method3341(class142.field2378, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (class28.field667[0] == 3 && class28.field663[0] == 0) {
                field2868[2].method1547(var5, 4);
            } else {
                field2868[0].method1547(var5, 4);
            }
            if (class28.field667[0] == 3 && class28.field663[0] == 1) {
                field2868[3].method1547(var5 + 15, 4);
            } else {
                field2868[1].method1547(var5 + 15, 4);
            }
            arg0.method3341(class142.field2379, var5 + 32, 17, 16777215, -1);
        }
        class73.method1497(708, 4, 50, 16, 0);
        arg1.method3407(class142.field2372, 733, 16, 16777215, -1);
        class28.field646 = -1;
        if (field1664 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class28.field669) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class28.field669) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class28.field669) {
                    var9--;
                }
            } while (var9 != var10 || var8 != var11);
            int var12 = (765 - var6 * var8) / (var8 + 1);
            if (var12 > 5) {
                var12 = 5;
            }
            int var13 = (480 - var7 * var9) / (var9 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (765 - var6 * var8 - (var8 - 1) * var12) / 2;
            int var15 = (480 - var7 * var9 - (var9 - 1) * var13) / 2;
            int var16 = var15 + 23;
            int var17 = var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class28.field669; var20++) {
                class22 var21 = field536[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field564);
                if (var21.field564 == -1) {
                    var23 = class142.field2193;
                    var22 = false;
                } else if (var21.field564 > 1980) {
                    var23 = class142.field2182;
                    var22 = false;
                }
                byte var24;
                if (var21.method483()) {
                    if (var21.method479()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method479()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class127.field1996 >= var17 && class127.field1999 * 1288203703 >= var16 && class127.field1996 < var6 + var17 && class127.field1999 * 1288203703 < var7 + var16 && var22) {
                    class28.field646 = var20;
                    field1664[var24].method1442(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    field1664[var24].method1408(var17, var16);
                }
                if (field1441 != null) {
                    field1441[(var21.method479() ? 8 : 0) + var21.field568].method1547(var17 + 29, var16);
                }
                arg0.method3407(Integer.toString(var21.field563), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3407(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3345(field536[class28.field646].field567) + 6;
                int var26 = arg1.field2917 + 8;
                class73.method1497(class127.field1996 - var25 / 2, class127.field1999 * 1288203703 + 20 + 5, var25, var26, 16777120);
                class73.method1526(class127.field1996 - var25 / 2, class127.field1999 * 1288203703 + 20 + 5, var25, var26, 0);
                arg1.method3407(field536[class28.field646].field567, class127.field1996, class127.field1999 * 1288203703 + 20 + 5 + arg1.field2917 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = field510.getGraphics();
            field1333.method1330(var27, 0, 0);
        } catch (Exception var29) {
            field510.repaint();
        }
    }

    @ObfuscatedName("ee.aj(IIIIII)V")
    public static final void method2689(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field69 == arg0 && field2649 == arg1 && client.field489 == arg2 || !client.field246) {
            return;
        }
        field69 = arg0;
        field2649 = arg1;
        client.field489 = arg2;
        if (!client.field246) {
            client.field489 = 0;
        }
        client.method565(25);
        client.method127(class142.field2358, true);
        int var5 = field200;
        int var6 = field56;
        field200 = (arg0 - 6) * 8;
        field56 = (arg1 - 6) * 8;
        int var7 = field200 - var5;
        int var8 = field56 - var6;
        int var9 = field200;
        int var10 = field56;
        for (int var11 = 0; var11 < 32768; var11++) {
            class30 var12 = client.field280[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field771[var13] -= var7;
                    var12.field768[var13] -= var8;
                }
                var12.field772 -= var7 * 128;
                var12.field715 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = client.field268[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field771[var16] -= var7;
                    var15.field768[var16] -= var8;
                }
                var15.field772 -= var7 * 128;
                var15.field715 -= var8 * 128;
            }
        }
        field588 = arg2;
        field1452.method566(arg3, arg4, false);
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var7 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        byte var20 = 0;
        byte var21 = 104;
        byte var22 = 1;
        if (var8 < 0) {
            var20 = 103;
            var21 = -1;
            var22 = -1;
        }
        for (int var23 = var17; var23 != var18; var23 += var19) {
            for (int var24 = var20; var24 != var21; var24 += var22) {
                int var25 = var7 + var23;
                int var26 = var8 + var24;
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                        client.field379[var27][var23][var24] = client.field379[var27][var25][var26];
                    } else {
                        client.field379[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class15 var28 = (class15) client.field296.method3239(); var28 != null; var28 = (class15) client.field296.method3248()) {
            var28.field209 -= var7;
            var28.field205 -= var8;
            if (var28.field209 < 0 || var28.field205 < 0 || var28.field209 >= 104 || var28.field205 >= 104) {
                var28.method3316();
            }
        }
        if (client.field475 != 0) {
            client.field475 -= var7;
            client.field503 -= var8;
        }
        client.field483 = 0;
        client.field279 = false;
        client.field470 = -1;
        client.field405.method3241();
        client.field381.method3241();
    }

    @ObfuscatedName("ae.ap(B)V")
    public static final void method587() {
        for (class15 var0 = (class15) client.field296.method3239(); var0 != null; var0 = (class15) client.field296.method3248()) {
            if (var0.field214 > 0) {
                var0.field214--;
            }
            if (var0.field214 != 0) {
                if (var0.field212 > 0) {
                    var0.field212--;
                }
                if (var0.field212 == 0 && var0.field209 >= 1 && var0.field205 >= 1 && var0.field209 <= 102 && var0.field205 <= 102 && (var0.field204 < 0 || class6.method2536(var0.field204, var0.field211))) {
                    client.method547(var0.field215, var0.field203, var0.field209, var0.field205, var0.field204, var0.field210, var0.field211);
                    var0.field212 = -1;
                    if (var0.field213 == var0.field204 && var0.field213 == -1) {
                        var0.method3316();
                    } else if (var0.field213 == var0.field204 && var0.field210 == var0.field207 && var0.field211 == var0.field208) {
                        var0.method3316();
                    }
                }
            } else if (var0.field213 < 0 || class6.method2536(var0.field213, var0.field208)) {
                client.method547(var0.field215, var0.field203, var0.field209, var0.field205, var0.field213, var0.field207, var0.field208);
                var0.method3316();
            }
        }
    }

    @ObfuscatedName("q.cb(Lew;I)Z")
    public static final boolean method164(class152 arg0) {
        if (arg0.field2623 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2623.length; var1++) {
            int var2 = client.method12(arg0, var1);
            int var3 = arg0.field2640[var1];
            if (arg0.field2623[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2623[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2623[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("u.co(Lew;B)V")
    public static void method122(class152 arg0) {
        if (client.field449 == arg0.field2604) {
            client.field454[arg0.field2601] = true;
        }
    }

    @ObfuscatedName("x.ci(II)V")
    public static final void method177(int arg0) {
        if (!class152.method1930(arg0)) {
            return;
        }
        class152[] var1 = field2595[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3 != null) {
                var3.field2632 = 0;
                var3.field2606 = 0;
            }
        }
    }

    @ObfuscatedName("k.ck(Ljava/lang/String;I)V")
    public static final void method477(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class200.method2604(arg0, field1904);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < client.field495; var2++) {
            class16 var3 = client.field497[var2];
            String var4 = var3.field221;
            String var5 = class200.method2604(var4, field1904);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                client.field495--;
                for (int var7 = var2; var7 < client.field495; var7++) {
                    client.field497[var7] = client.field497[var7 + 1];
                }
                client.field438 = client.field430;
                client.field284.method2345(125);
                class110 var8 = client.field284;
                int var9 = arg0.length() + 1;
                var8.method2214(var9);
                client.field284.method2092(arg0);
                break;
            }
        }
    }
}
