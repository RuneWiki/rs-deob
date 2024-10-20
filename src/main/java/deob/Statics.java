package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Desktop.Action;
import java.awt.datatransfer.Clipboard;
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
import java.net.URI;

public class Statics {

    @ObfuscatedName("b.n")
    public static class181 field1;

    @ObfuscatedName("av.b")
    public static class168 field1002;

    @ObfuscatedName("av.bm")
    public static String field1003;

    @ObfuscatedName("at.g")
    public static class168 field1007;

    @ObfuscatedName("at.j")
    public static int field1011;

    @ObfuscatedName("at.b")
    public static class168 field1013;

    @ObfuscatedName("at.me")
    public static class79 field1018;

    @ObfuscatedName("at.v")
    public static int field1019;

    @ObfuscatedName("at.ch")
    public static class225 field1022;

    @ObfuscatedName("at.rf")
    public static String field1023;

    @ObfuscatedName("am.y")
    public static int field1024;

    @ObfuscatedName("am.qh")
    public static int field1027;

    @ObfuscatedName("ab.b")
    public static class168 field1034;

    @ObfuscatedName("ab.qp")
    public static Canvas field1041;

    @ObfuscatedName("ai.b")
    public static class168 field1045;

    @ObfuscatedName("ad.qz")
    public static class78 field1050;

    @ObfuscatedName("ad.b")
    public static class168 field1054;

    @ObfuscatedName("ao.b")
    public static class168 field1067;

    @ObfuscatedName("ao.r")
    public static byte[][][] field1068;

    @ObfuscatedName("al.b")
    public static class168 field1071;

    @ObfuscatedName("al.bc")
    public static class169 field1072;

    @ObfuscatedName("al.x")
    public static class168 field1074;

    @ObfuscatedName("al.na")
    public static class57 field1075;

    @ObfuscatedName("al.y")
    public static class168 field1076;

    @ObfuscatedName("ap.r")
    public static int field1079;

    @ObfuscatedName("ap.p")
    public static class225 field1125;

    @ObfuscatedName("bc.g")
    public static int field1130;

    @ObfuscatedName("bc.b")
    public static class168 field1132;

    @ObfuscatedName("bc.no")
    public static class56 field1135;

    @ObfuscatedName("bs.b")
    public static class54 field1140;

    @ObfuscatedName("bi.pc")
    public static Clipboard field1147;

    @ObfuscatedName("bi.j")
    public static int field1154;

    @ObfuscatedName("bi.y")
    public static class73 field1160;

    @ObfuscatedName("bi.qg")
    public static Font field1169;

    @ObfuscatedName("bz.db")
    public static int[] field1185;

    @ObfuscatedName("bz.fa")
    public static int field1189;

    @ObfuscatedName("b.ix")
    public static int field12;

    @ObfuscatedName("bt.c")
    public static float field1206;

    @ObfuscatedName("bt.l")
    public static int field1212;

    @ObfuscatedName("bw.p")
    public static int[] field1236;

    @ObfuscatedName("c.iw")
    public static class31 field124;

    @ObfuscatedName("bw.u")
    public static int[] field1242;

    @ObfuscatedName("bw.n")
    public static boolean[] field1247;

    @ObfuscatedName("bf.s")
    public static float[] field1256;

    @ObfuscatedName("bf.ae")
    public static int[] field1258;

    @ObfuscatedName("c.kf")
    public static int field126;

    @ObfuscatedName("bf.i")
    public static float[] field1262;

    @ObfuscatedName("bf.c")
    public static int field1263;

    @ObfuscatedName("bf.l")
    public static int field1264;

    @ObfuscatedName("bf.u")
    public static int field1265;

    @ObfuscatedName("bf.n")
    public static class74[] field1266;

    @ObfuscatedName("bf.w")
    public static class68[] field1268;

    @ObfuscatedName("bf.z")
    public static class61[] field1269;

    @ObfuscatedName("bf.r")
    public static byte[] field1271;

    @ObfuscatedName("bf.t")
    public static int[] field1272;

    @ObfuscatedName("bf.an")
    public static float[] field1275;

    @ObfuscatedName("bf.m")
    public static float[] field1278;

    @ObfuscatedName("bf.ag")
    public static float[] field1279;

    @ObfuscatedName("bf.o")
    public static boolean[] field1280;

    @ObfuscatedName("bf.e")
    public static float[] field1281;

    @ObfuscatedName("bf.aw")
    public static float[] field1282;

    @ObfuscatedName("bf.k")
    public static class69[] field1283;

    @ObfuscatedName("bf.p")
    public static int field1285;

    @ObfuscatedName("bf.aj")
    public static int[] field1286;

    @ObfuscatedName("br.iy")
    public static int field1326;

    @ObfuscatedName("by.nb")
    public static int field1344;

    @ObfuscatedName("by.qq")
    public static Frame field1347;

    @ObfuscatedName("by.o")
    public static class120 field1349;

    @ObfuscatedName("l.nk")
    public static int field135;

    @ObfuscatedName("bg.j")
    public static int field1352;

    @ObfuscatedName("bg.d")
    public static int[] field1354;

    @ObfuscatedName("bg.y")
    public static int[] field1355;

    @ObfuscatedName("bg.l")
    public static byte[][] field1356;

    @ObfuscatedName("bg.w")
    public static int[] field1357;

    @ObfuscatedName("l.c")
    public static int[] field136;

    @ObfuscatedName("bg.b")
    public static int field1362;

    @ObfuscatedName("l.al")
    public static class169 field138;

    @ObfuscatedName("cp.z")
    public static int field1383;

    @ObfuscatedName("cp.w")
    public static int[] field1384;

    @ObfuscatedName("cp.k")
    public static int field1388;

    @ObfuscatedName("cc.bj")
    public static class81[] field1406;

    @ObfuscatedName("cc.e")
    public static int[] field1407;

    @ObfuscatedName("cl.k")
    public static int[] field1422;

    @ObfuscatedName("cm.bb")
    public static class169 field1423;

    @ObfuscatedName("ci.dd")
    public static int field1435;

    @ObfuscatedName("cb.an")
    public static int field1438;

    @ObfuscatedName("cb.bi")
    public static int field1439;

    @ObfuscatedName("cb.aw")
    public static int field1447;

    @ObfuscatedName("u.u")
    public static int[] field145;

    @ObfuscatedName("cb.ba")
    public static int field1453;

    @ObfuscatedName("cb.t")
    public static int field1454;

    @ObfuscatedName("cb.h")
    public static int field1455;

    @ObfuscatedName("cb.s")
    public static int field1456;

    @ObfuscatedName("cb.f")
    public static int field1458;

    @ObfuscatedName("cb.q")
    public static int field1459;

    @ObfuscatedName("cb.m")
    public static int field1460;

    @ObfuscatedName("cb.i")
    public static int field1462;

    @ObfuscatedName("cb.e")
    public static int field1463;

    @ObfuscatedName("cb.v")
    public static int field1465;

    @ObfuscatedName("cb.ag")
    public static int field1466;

    @ObfuscatedName("cb.ae")
    public static int field1467;

    @ObfuscatedName("cb.a")
    public static int field1483;

    @ObfuscatedName("cb.bb")
    public static int field1489;

    @ObfuscatedName("cb.be")
    public static boolean[][] field1493;

    @ObfuscatedName("cb.bp")
    public static int field1496;

    @ObfuscatedName("cb.bz")
    public static int field1497;

    @ObfuscatedName("cb.bl")
    public static int field1499;

    @ObfuscatedName("cu.bc")
    public static class81[] field1503;

    @ObfuscatedName("u.qu")
    public static int field151;

    @ObfuscatedName("cy.cb")
    public static class144 field1531;

    @ObfuscatedName("cy.qa")
    public static int field1533;

    @ObfuscatedName("u.at")
    public static class147 field154;

    @ObfuscatedName("cq.l")
    public static class81[] field1540;

    @ObfuscatedName("cf.f")
    public static int field1542;

    @ObfuscatedName("cf.p")
    public static int field1551;

    @ObfuscatedName("cf.n")
    public static int field1552;

    @ObfuscatedName("cf.a")
    public static int field1553;

    @ObfuscatedName("cf.q")
    public static int field1555;

    @ObfuscatedName("cf.s")
    public static int field1557;

    @ObfuscatedName("cf.i")
    public static int field1558;

    @ObfuscatedName("cf.m")
    public static int field1560;

    @ObfuscatedName("cf.an")
    public static class93 field1561;

    @ObfuscatedName("cn.i")
    public static int[] field1566;

    @ObfuscatedName("p.ly")
    public static class131 field157;

    @ObfuscatedName("cn.nq")
    public static class57 field1573;

    @ObfuscatedName("p.y")
    public static boolean field158;

    @ObfuscatedName("p.cj")
    public static int field159;

    @ObfuscatedName("cz.ni")
    public static class75 field1590;

    @ObfuscatedName("p.nx")
    public static int field160;

    @ObfuscatedName("p.z")
    public static int[] field162;

    @ObfuscatedName("cd.an")
    public static int[] field1634;

    @ObfuscatedName("cd.o")
    public static String field1635;

    @ObfuscatedName("cd.de")
    public static int[] field1644;

    @ObfuscatedName("cd.py")
    public static class135 field1645;

    @ObfuscatedName("n.a")
    public static int[] field166;

    @ObfuscatedName("cx.nu")
    public static int field1661;

    @ObfuscatedName("n.ny")
    public static int field168;

    @ObfuscatedName("cw.qm")
    public static int field1740;

    @ObfuscatedName("cw.jp")
    public static int field1741;

    @ObfuscatedName("cg.pd")
    public static class161 field1743;

    @ObfuscatedName("cg.kw")
    public static class132 field1747;

    @ObfuscatedName("cg.ad")
    public static long field1751;

    @ObfuscatedName("co.jm")
    public static int field1756;

    @ObfuscatedName("co.x")
    public static File field1760;

    @ObfuscatedName("dt.bx")
    public static class169 field1779;

    @ObfuscatedName("dt.qi")
    public static int field1783;

    @ObfuscatedName("dd.bj")
    public static int field1797;

    @ObfuscatedName("dd.bs")
    public static int field1799;

    @ObfuscatedName("w.s")
    public static class14 field183;

    @ObfuscatedName("dd.bc")
    public static int field1838;

    @ObfuscatedName("w.v")
    public static int[] field185;

    @ObfuscatedName("dc.qw")
    public static Image field1855;

    @ObfuscatedName("dh.x")
    public static int field1864;

    @ObfuscatedName("w.bz")
    public static class169 field187;

    @ObfuscatedName("dr.ru")
    public static boolean field1872;

    @ObfuscatedName("dn.qe")
    public static class134 field1889;

    @ObfuscatedName("dn.g")
    public static int field1891;

    @ObfuscatedName("dx.ez")
    public static class79[] field1919;

    @ObfuscatedName("dx.ep")
    public static class79[] field1934;

    @ObfuscatedName("dx.qc")
    public static int field1935;

    @ObfuscatedName("dl.a")
    public static String field1939;

    @ObfuscatedName("do.eq")
    public static class79[] field1947;

    @ObfuscatedName("w.hh")
    public static int field195;

    @ObfuscatedName("db.am")
    public static class144 field1950;

    @ObfuscatedName("db.ne")
    public static int field1951;

    @ObfuscatedName("de.g")
    public static long field1953;

    @ObfuscatedName("de.b")
    public static long field1957;

    @ObfuscatedName("dv.md")
    public static int field1958;

    @ObfuscatedName("z.ci")
    public static class144 field196;

    @ObfuscatedName("dv.fd")
    public static int field1962;

    @ObfuscatedName("ds.gs")
    public static class174 field1984;

    @ObfuscatedName("ds.q")
    public static String field1986;

    @ObfuscatedName("ds.mh")
    public static byte field1987;

    @ObfuscatedName("dz.t")
    public static String[] field1994;

    @ObfuscatedName("z.dw")
    public static byte[][] field200;

    @ObfuscatedName("z.br")
    public static int field201;

    @ObfuscatedName("df.al")
    public static class79[] field2016;

    @ObfuscatedName("df.bf")
    public static FontMetrics field2019;

    @ObfuscatedName("df.c")
    public static class154 field2021;

    @ObfuscatedName("dq.k")
    public static int field2022;

    @ObfuscatedName("dq.b")
    public static class168 field2023;

    @ObfuscatedName("dk.ba")
    public static class169 field2039;

    @ObfuscatedName("eh.cm")
    public static class147 field2047;

    @ObfuscatedName("eh.nw")
    public static int field2048;

    @ObfuscatedName("ei.x")
    public static int[] field2049;

    @ObfuscatedName("ef.g")
    public static File field2063;

    @ObfuscatedName("ef.bt")
    public static class169 field2070;

    @ObfuscatedName("ed.es")
    public static class81[] field2074;

    @ObfuscatedName("ed.g")
    public static String field2080;

    @ObfuscatedName("ex.z")
    public static class173 field2100;

    @ObfuscatedName("ee.ig")
    public static int field2116;

    @ObfuscatedName("ey.kl")
    public static class20 field2125;

    @ObfuscatedName("ey.f")
    public static String field2126;

    @ObfuscatedName("k.p")
    public static int[] field213;

    @ObfuscatedName("k.a")
    public static class120 field215;

    @ObfuscatedName("ev.do")
    public static int[] field2154;

    @ObfuscatedName("eb.qv")
    public static int field2170;

    @ObfuscatedName("eb.pe")
    public static class222 field2173;

    @ObfuscatedName("eq.ap")
    public static class169 field2186;

    @ObfuscatedName("eq.gm")
    public static int field2194;

    @ObfuscatedName("o.x")
    public static int field220;

    @ObfuscatedName("eg.j")
    public static int field2207;

    @ObfuscatedName("eg.g")
    public static String field2208;

    @ObfuscatedName("eg.b")
    public static Applet field2211;

    @ObfuscatedName("er.y")
    public static int field2217;

    @ObfuscatedName("er.o")
    public static String[] field2223;

    @ObfuscatedName("er.fo")
    public static int field2225;

    @ObfuscatedName("er.k")
    public static int[][][] field2226;

    @ObfuscatedName("ew.ds")
    public static class87 field2231;

    @ObfuscatedName("et.he")
    public static class3 field2263;

    @ObfuscatedName("et.ee")
    public static class79 field2264;

    @ObfuscatedName("et.ms")
    public static byte field2265;

    @ObfuscatedName("et.dc")
    public static int field2266;

    @ObfuscatedName("eu.ek")
    public static class79[] field2280;

    @ObfuscatedName("ec.u")
    public static class19 field2284;

    @ObfuscatedName("fm.fg")
    public static int field2287;

    @ObfuscatedName("fm.ha")
    public static int field2289;

    @ObfuscatedName("t.pt")
    public static int field230;

    @ObfuscatedName("t.hy")
    public static int field235;

    @ObfuscatedName("t.ps")
    public static GarbageCollectorMXBean field239;

    @ObfuscatedName("t.bk")
    public static int field240;

    @ObfuscatedName("h.nr")
    public static int field245;

    @ObfuscatedName("h.aa")
    public static class147 field251;

    @ObfuscatedName("h.pm")
    public static int field254;

    @ObfuscatedName("h.h")
    public static int field255;

    @ObfuscatedName("fq.pr")
    public static long field2577;

    @ObfuscatedName("fa.by")
    public static int field2588;

    @ObfuscatedName("fo.ay")
    public static boolean field2632;

    @ObfuscatedName("fo.eb")
    public static class79[] field2633;

    @ObfuscatedName("fp.cw")
    public static class225 field2637;

    @ObfuscatedName("fp.pv")
    public static class9 field2638;

    @ObfuscatedName("fz.fj")
    public static int field2649;

    @ObfuscatedName("v.dq")
    public static int field265;

    @ObfuscatedName("fz.q")
    public static int[] field2651;

    @ObfuscatedName("fk.ey")
    public static class79 field2657;

    @ObfuscatedName("fn.ap")
    public static class81[] field2660;

    @ObfuscatedName("fw.bp")
    public static class169 field2693;

    @ObfuscatedName("fj.av")
    public static String field2706;

    @ObfuscatedName("fs.w")
    public static boolean field2709;

    @ObfuscatedName("fs.b")
    public static class144 field2720;

    @ObfuscatedName("fu.ia")
    public static class174 field2733;

    @ObfuscatedName("fu.bl")
    public static class169 field2736;

    @ObfuscatedName("fb.j")
    public static class168 field2740;

    @ObfuscatedName("fb.b")
    public static class174[][] field2751;

    @ObfuscatedName("fb.y")
    public static class168 field2775;

    @ObfuscatedName("fb.g")
    public static boolean[] field2789;

    @ObfuscatedName("fb.x")
    public static class168 field2829;

    @ObfuscatedName("client.g")
    public static client field285;

    @ObfuscatedName("fi.il")
    public static class174 field2891;

    @ObfuscatedName("client.p")
    public static class213 field290;

    @ObfuscatedName("fr.r")
    public static int field2904;

    @ObfuscatedName("fr.er")
    public static class81[] field2906;

    @ObfuscatedName("fr.w")
    public static class60 field2907;

    @ObfuscatedName("fx.iz")
    public static int field2910;

    @ObfuscatedName("fv.r")
    public static short[] field2918;

    @ObfuscatedName("fv.u")
    public static short[][] field2920;

    @ObfuscatedName("fv.l")
    public static short[] field2923;

    @ObfuscatedName("fh.l")
    public static int field2930;

    @ObfuscatedName("fh.nz")
    public static int field2935;

    @ObfuscatedName("go.g")
    public static class168 field2951;

    @ObfuscatedName("go.c")
    public static int field2952;

    @ObfuscatedName("go.d")
    public static class185 field2953;

    @ObfuscatedName("go.di")
    public static byte[][] field2955;

    @ObfuscatedName("go.u")
    public static int field2956;

    @ObfuscatedName("go.p")
    public static boolean field2957;

    @ObfuscatedName("go.j")
    public static class168 field2958;

    @ObfuscatedName("go.b")
    public static class168 field2959;

    @ObfuscatedName("he.p")
    public static class81 field3118;

    @ObfuscatedName("he.b")
    public static class114 field3119;

    @ObfuscatedName("ho.ea")
    public static class79[] field3159;

    @ObfuscatedName("ho.n")
    public static class174 field3160;

    @ObfuscatedName("hb.dv")
    public static int[][] field3164;

    @ObfuscatedName("hg.gh")
    public static class174 field3171;

    @ObfuscatedName("hg.d")
    public static File field3172;

    @ObfuscatedName("client.ao")
    public static class169 field318;

    @ObfuscatedName("hf.eg")
    public static class79[] field3181;

    @ObfuscatedName("hv.u")
    public static class81[] field3197;

    @ObfuscatedName("ha.j")
    public static long field3232;

    @ObfuscatedName("ha.d")
    public static class168 field3233;

    @ObfuscatedName("client.be")
    public static class169 field359;

    @ObfuscatedName("client.dh")
    public static int field372;

    @ObfuscatedName("client.bj")
    public static class169 field467;

    @ObfuscatedName("client.bd")
    public static int field473;

    @ObfuscatedName("client.fe")
    public static int field479;

    @ObfuscatedName("client.t")
    public static String field564;

    @ObfuscatedName("d.ib")
    public static int field57;

    @ObfuscatedName("client.u")
    public static class155 field571;

    @ObfuscatedName("f.ht")
    public static int field574;

    @ObfuscatedName("d.pb")
    public static short[] field58;

    @ObfuscatedName("q.d")
    public static boolean field582;

    @ObfuscatedName("q.bi")
    public static class169 field584;

    @ObfuscatedName("q.b")
    public static class168 field585;

    @ObfuscatedName("d.pk")
    public static int field59;

    @ObfuscatedName("s.bs")
    public static class81 field615;

    @ObfuscatedName("i.z")
    public static class229[] field622;

    @ObfuscatedName("x.dt")
    public static int field63;

    @ObfuscatedName("e.x")
    public static class26[] field636;

    @ObfuscatedName("e.cu")
    public static char field645;

    @ObfuscatedName("aw.b")
    public static String field660;

    @ObfuscatedName("aw.ev")
    public static class79[] field664;

    @ObfuscatedName("ag.fq")
    public static int field671;

    @ObfuscatedName("ag.i")
    public static int[] field674;

    @ObfuscatedName("ag.r")
    public static int[] field675;

    @ObfuscatedName("ah.c")
    public static class81 field697;

    @ObfuscatedName("ah.y")
    public static class79 field700;

    @ObfuscatedName("ah.b")
    public static boolean field702;

    @ObfuscatedName("ah.f")
    public static int[] field707;

    @ObfuscatedName("ah.j")
    public static class81 field709;

    @ObfuscatedName("ah.d")
    public static class81 field715;

    @ObfuscatedName("y.d")
    public static byte[][][] field72;

    @ObfuscatedName("ah.x")
    public static class81[] field721;

    @ObfuscatedName("y.x")
    public static byte[][][] field73;

    @ObfuscatedName("ah.r")
    public static class79 field731;

    @ObfuscatedName("y.y")
    public static byte[][][] field74;

    @ObfuscatedName("ax.c")
    public static short[][] field761;

    @ObfuscatedName("ax.d")
    public static class168 field762;

    @ObfuscatedName("ac.bs")
    public static class169 field772;

    @ObfuscatedName("ar.j")
    public static int[] field777;

    @ObfuscatedName("ar.d")
    public static String[] field779;

    @ObfuscatedName("ar.p")
    public static class174 field782;

    @ObfuscatedName("ar.aw")
    public static int[] field789;

    @ObfuscatedName("y.ew")
    public static class81[] field85;

    @ObfuscatedName("aa.ga")
    public static class174 field850;

    @ObfuscatedName("aa.au")
    public static int field855;

    @ObfuscatedName("aa.u")
    public static class81 field856;

    @ObfuscatedName("ay.df")
    public static int field883;

    @ObfuscatedName("ay.g")
    public static class168 field885;

    @ObfuscatedName("ay.b")
    public static class168 field887;

    @ObfuscatedName("ay.qs")
    public static int field898;

    @ObfuscatedName("as.g")
    public static class168 field901;

    @ObfuscatedName("as.j")
    public static class168 field917;

    @ObfuscatedName("y.c")
    public static byte[][][] field92;

    @ObfuscatedName("as.mk")
    public static class25[] field924;

    @ObfuscatedName("as.pn")
    public static class137 field925;

    @ObfuscatedName("ak.nh")
    public static int field952;

    @ObfuscatedName("ak.n")
    public static int[] field955;

    @ObfuscatedName("ak.l")
    public static int[][] field958;

    @ObfuscatedName("au.g")
    public static class168 field963;

    @ObfuscatedName("au.j")
    public static class168 field964;

    @ObfuscatedName("au.jc")
    public static class174[] field969;

    @ObfuscatedName("au.b")
    public static class168 field970;

    @ObfuscatedName("av.g")
    public static class168 field986;

    @ObfuscatedName("av.cx")
    public static class225 field987;

    @ObfuscatedName("av.bh")
    public static class169 field996;

    @ObfuscatedName("dc.g(IB)Lal;")
    public static class51 method2220(int arg0) {
        class51 var1 = (class51) class51.field1070.method3495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field1071.method3037(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method989(new class120(var2));
        }
        class51.field1070.method3490(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("l.g(Ljava/lang/String;ZLjava/lang/String;ZI)V")
    public static void method110(String arg0, boolean arg1, String arg2, boolean arg3) {
        if (!arg1) {
            class139.method564(arg0, 3, "openjs");
            return;
        }
        if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(arg0));
                return;
            } catch (Exception var5) {
            }
        }
        if (class139.field2113.startsWith("win") && !arg3) {
            class139.method564(arg0, 0, "openjs");
            return;
        }
        if (class139.field2113.startsWith("mac")) {
            class139.method564(arg0, 1, arg2);
            return;
        }
        class139.method564(arg0, 2, "openjs");
    }

    @ObfuscatedName("bi.g(II)Lab;")
    public static class47 method1183(int arg0) {
        class47 var1 = (class47) class47.field1029.method3495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = field1034.method3037(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method939(new class120(var2), arg0);
        }
        var3.method938();
        class47.field1029.method3490(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fx.j(Lda;I)V")
    public static void method3249(class123 arg0) {
        class211 var1 = (class211) class212.field3128.method3595();
        if (var1 == null) {
            return;
        }
        int var2 = arg0.field1977;
        arg0.method2332(var1.field3125);
        for (int var3 = 0; var3 < var1.field3121; var3++) {
            if (var1.field3120[var3] == 0) {
                try {
                    int var4 = var1.field3122[var3];
                    if (var4 == 0) {
                        Field var5 = var1.field3124[var3];
                        int var6 = var5.getInt((Object) null);
                        arg0.method2480(0);
                        arg0.method2332(var6);
                    } else if (var4 == 1) {
                        Field var7 = var1.field3124[var3];
                        var7.setInt((Object) null, var1.field3126[var3]);
                        arg0.method2480(0);
                    } else if (var4 == 2) {
                        Field var8 = var1.field3124[var3];
                        int var9 = var8.getModifiers();
                        arg0.method2480(0);
                        arg0.method2332(var9);
                    }
                    if (var4 == 3) {
                        Method var10 = var1.field3123[var3];
                        byte[][] var11 = var1.field3127[var3];
                        Object[] var12 = new Object[var11.length];
                        for (int var13 = 0; var13 < var11.length; var13++) {
                            ObjectInputStream var14 = new ObjectInputStream(new ByteArrayInputStream(var11[var13]));
                            var12[var13] = var14.readObject();
                        }
                        Object var15 = var10.invoke((Object) null, var12);
                        if (var15 == null) {
                            arg0.method2480(0);
                        } else if (var15 instanceof Number) {
                            arg0.method2480(1);
                            arg0.method2477(((Number) var15).longValue());
                        } else if (var15 instanceof String) {
                            arg0.method2480(2);
                            arg0.method2335((String) var15);
                        } else {
                            arg0.method2480(4);
                        }
                    } else if (var4 == 4) {
                        Method var16 = var1.field3123[var3];
                        int var17 = var16.getModifiers();
                        arg0.method2480(0);
                        arg0.method2332(var17);
                    }
                } catch (ClassNotFoundException var30) {
                    arg0.method2480(-10);
                } catch (InvalidClassException var31) {
                    arg0.method2480(-11);
                } catch (StreamCorruptedException var32) {
                    arg0.method2480(-12);
                } catch (OptionalDataException var33) {
                    arg0.method2480(-13);
                } catch (IllegalAccessException var34) {
                    arg0.method2480(-14);
                } catch (IllegalArgumentException var35) {
                    arg0.method2480(-15);
                } catch (InvocationTargetException var36) {
                    arg0.method2480(-16);
                } catch (SecurityException var37) {
                    arg0.method2480(-17);
                } catch (IOException var38) {
                    arg0.method2480(-18);
                } catch (NullPointerException var39) {
                    arg0.method2480(-19);
                } catch (Exception var40) {
                    arg0.method2480(-20);
                } catch (Throwable var41) {
                    arg0.method2480(-21);
                }
            } else {
                arg0.method2480(var1.field3120[var3]);
            }
        }
        arg0.method2365(var2);
        var1.method3647();
    }

    @ObfuscatedName("ci.g(Lfl;IIIZI)V")
    public static void method1778(class168 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class184.field2954 = 1;
        field1076 = arg0;
        field2904 = arg1;
        field2952 = arg2;
        field2930 = arg3;
        field2957 = arg4;
        field2956 = 10000;
    }

    @ObfuscatedName("ab.x(Lfl;Ljava/lang/String;Ljava/lang/String;I)[Lck;")
    public static class79[] method941(class168 arg0, String arg1, String arg2) {
        int var3 = arg0.method3052(arg1);
        int var4 = arg0.method3053(var3, arg2);
        return class77.method2039(arg0, var3, var4);
    }

    @ObfuscatedName("bi.j(Lda;I)I")
    public static int method1154(class123 arg0) {
        int var1 = arg0.method2614(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method2614(5);
        } else if (var1 == 2) {
            var2 = arg0.method2614(8);
        } else {
            var2 = arg0.method2614(11);
        }
        return var2;
    }

    @ObfuscatedName("c.p(I)V")
    public static void method94() {
        field1354 = null;
        field2049 = null;
        field1355 = null;
        field675 = null;
        field136 = null;
        field1356 = (byte[][]) null;
    }

    @ObfuscatedName("ew.c(Lcr;I)V")
    public static final void method2933(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < field674.length; var2++) {
            field674[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            field674[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    field1407[var8] = (field674[var8 - 1] + field674[var8 + 1] + field674[var8 - 128] + field674[var8 + 128]) / 4;
                }
            }
            int[] var9 = field674;
            field674 = field1407;
            field1407 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1392; var11++) {
            for (int var12 = 0; var12 < arg0.field1391; var12++) {
                if (arg0.field1395[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1393;
                    int var14 = var11 + 16 + arg0.field1396;
                    int var15 = (var14 << 7) + var13;
                    field674[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ek.dc(II)V")
    public static final void method2830(int arg0) {
        if (class174.method1767(arg0)) {
            client.method2959(field2751[arg0], -1);
        }
    }

    @ObfuscatedName("by.ds(Ljava/lang/String;I)V")
    public static final void method1544(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class165.method777(arg0, field290);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < client.field514; var2++) {
            class8 var3 = client.field560[var2];
            String var4 = var3.field125;
            String var5 = class165.method777(var4, field290);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                client.field514--;
                for (int var7 = var2; var7 < client.field514; var7++) {
                    client.field560[var7] = client.field560[var7 + 1];
                }
                client.field493 = client.field360;
                client.field332.method2611(234);
                client.field332.method2480(class120.method42(arg0));
                client.field332.method2335(arg0);
                break;
            }
        }
    }
}
